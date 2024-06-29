import jaggl.OpenGL;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fea")
public class class605 extends class460 {

    @OriginalMember(owner = "client!fea", name = "k", descriptor = "Z")
    private boolean field8688 = false;

    @OriginalMember(owner = "client!fea", name = "q", descriptor = "Z")
    private boolean field8694 = false;

    @OriginalMember(owner = "client!fea", name = "m", descriptor = "Lul;")
    private class440 field8690;

    @OriginalMember(owner = "client!fea", name = "l", descriptor = "Lqn;")
    private class476 field8689;

    @OriginalMember(owner = "client!fea", name = "i", descriptor = "I")
    public static int field8686;

    @OriginalMember(owner = "client!fea", name = "j", descriptor = "I")
    public static int field8687;

    @OriginalMember(owner = "client!fea", name = "n", descriptor = "I")
    public static int field8691;

    @OriginalMember(owner = "client!fea", name = "o", descriptor = "I")
    public static int field8692;

    @OriginalMember(owner = "client!fea", name = "p", descriptor = "I")
    public static int field8693;

    @OriginalMember(owner = "client!fea", name = "r", descriptor = "I")
    public static int field8695;

    @OriginalMember(owner = "client!fea", name = "s", descriptor = "I")
    public static int field8696;

    @OriginalMember(owner = "client!fea", name = "t", descriptor = "I")
    public static int field8697;

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "(B)V", line = 7)
    public final void method1174(byte arg0) {
        if (arg0 <= -56) {
            if (this.field8694) {
                super.field6621.method2308(1, -15115);
                super.field6621.method2295((byte) -101, (class337) null);
                super.field6621.method2308(0, -15115);
                super.field6621.method2295((byte) -117, (class337) null);
                OpenGL.glUseProgramObjectARB(0L);
                this.field8694 = false;
            }
            ++field8697;
        }
    }

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "(ILvo;Lpda;Lvo;Lvo;Lpn;)Z", line = 28)
    public static final boolean method3443(int arg0, class345 arg1, class138 arg2, class345 arg3, class345 arg4, class295 arg5) {
        class286.field4021 = arg2;
        if (arg0 != 6248) {
            return true;
        } else {
            class24.field324 = arg3;
            class399.field5766 = arg1;
            ++field8696;
            class132.field2145 = arg4;
            class43.field585 = arg5;
            for (int var6 = 0; ~var6 > -17; ++var6) {
                class183.field2881[var6] = 255;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!fea", name = "<init>", descriptor = "(Lkfa;Lul;)V", line = 53)
    public class605(class382 arg0, class440 arg1) {
        super(arg0);
        this.field8690 = arg1;
        if (this.field8690.field6372 != null && super.field6621.field5529 && super.field6621.field5599) {
            class189 var3 = class697.method3921(super.field6621, 35633, 8, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n");
            class189 var4 = class697.method3921(super.field6621, 35632, 8, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.x*wnNormal.wwww)+waveIntensity.y, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n");
            this.field8689 = class358.method2161(0, new class189[] { var3, var4 }, super.field6621);
            this.field8688 = this.field8689 != null;
        }
    }

    @OriginalMember(owner = "client!fea", name = "b", descriptor = "(III)V", line = 72)
    public final void method1170(int arg0, int arg1, int arg2) {
        ++field8695;
        if (this.field8694) {
            int var4 = 1 << (arg1 & 3);
            float var5 = (float) (1 << (7 & arg1 >> 3)) / 32.0F;
            int var6 = 65535 & arg0;
            float var7 = (float) ((198057 & arg0) >> 16) / 8.0F;
            float var8 = (float) (15 & arg0 >> 19) / 16.0F;
            float var9 = (float) ((131569359 & arg0) >> 23) / 16.0F;
            int var10 = 15 & arg0 >> 27;
            long var11 = this.field8689.field6820;
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "time"), (float) (super.field6621.field5456 * var4 % 40000) / 40000.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "scale"), var5);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "breakWaterDepth"), (float) var6);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "breakWaterOffset"), var7);
            OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(var11, "waveIntensity"), var9, var8);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "waveExponent"), (float) var10);
        }
        if (arg2 != 1) {
            this.field8688 = true;
        }
    }

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "(ILjo;I)V", line = 110)
    public final void method1169(int arg0, class337 arg1, int arg2) {
        int var4 = 73 % ((arg2 - 65) / 53);
        if (!this.field8694) {
            super.field6621.method2295((byte) -107, arg1);
            super.field6621.method2270(arg0, (byte) 110);
        }
        ++field8686;
    }

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "(ZI)V", line = 126)
    public final void method1175(boolean arg0, int arg1) {
        ++field8693;
        class656 var3 = super.field6621.method2335(arg1);
        if (this.field8688 && var3 != null) {
            float var4 = (-Math.abs(super.field6621.field5596[1]) + 1.0F) * 2.0F + 1.0F;
            super.field6621.method2308(1, arg1 ^ -15115);
            super.field6621.method2295((byte) 68, var3);
            super.field6621.method2308(0, -15115);
            super.field6621.method2295((byte) 45, this.field8690.field6372);
            long var5 = this.field8689.field6820;
            OpenGL.glUseProgramObjectARB(var5);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var5, "normalSampler"), 0);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var5, "envMapSampler"), 1);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var5, "sunDir"), -super.field6621.field5596[0], -super.field6621.field5596[1], -super.field6621.field5596[2]);
            OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var5, "sunColour"), super.field6621.field5588 * var4, super.field6621.field5547 * var4, super.field6621.field5504 * var4, 1.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var5, "sunExponent"), Math.abs(super.field6621.field5596[1]) * 928.0F + 64.0F);
            this.field8694 = true;
        }
    }

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "(BZ)V", line = 154)
    public final void method1177(byte arg0, boolean arg1) {
        ++field8687;
        int var3 = 123 % ((arg0 - -85) / 38);
    }

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "(ILjava/lang/Throwable;)Ljava/lang/String;", line = 174)
    public static final String method3444(int arg0, Throwable arg1) throws IOException {
        ++field8692;
        String var2;
        if (!(arg1 instanceof class461)) {
            var2 = "";
        } else {
            class461 var3 = (class461) arg1;
            arg1 = var3.field6633;
            var2 = var3.field6632 + " | ";
        }
        StringWriter var4 = new StringWriter();
        PrintWriter var5 = new PrintWriter(var4);
        arg1.printStackTrace(var5);
        var5.close();
        String var6 = var4.toString();
        BufferedReader var7 = new BufferedReader(new StringReader(var6));
        String var8 = var7.readLine();
        if (arg0 > -124) {
            return null;
        } else {
            while (true) {
                String var9 = var7.readLine();
                if (var9 == null) {
                    return var2 + "| " + var8;
                }
                int var10 = var9.indexOf(40);
                int var11 = var9.indexOf(41, var10 + 1);
                String var12;
                if (var10 == -1) {
                    var12 = var9;
                } else {
                    var12 = var9.substring(0, var10);
                }
                String var13 = var12.trim();
                String var14 = var13.substring(1 + var13.lastIndexOf(32));
                String var15 = var14.substring(var14.lastIndexOf(9) - -1);
                String var16 = var2 + var15;
                if (~var10 != 0 && ~var11 != 0) {
                    int var17 = var9.indexOf(".java:", var10);
                    if (~var17 <= -1) {
                        var16 = var16 + var9.substring(var17 + 5, var11);
                    }
                }
                var2 = var16 + ' ';
            }
        }
    }

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "(I)Z", line = 245)
    public final boolean method1168(int arg0) {
        if (arg0 != 2048) {
            this.field8694 = false;
        }
        ++field8691;
        return this.field8688;
    }
}
