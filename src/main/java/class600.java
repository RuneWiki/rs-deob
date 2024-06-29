import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kfa")
public class class600 extends class682 {

    @OriginalMember(owner = "client!kfa", name = "s", descriptor = "Z")
    private boolean field8560 = false;

    @OriginalMember(owner = "client!kfa", name = "t", descriptor = "Z")
    private boolean field8561 = false;

    @OriginalMember(owner = "client!kfa", name = "q", descriptor = "Lpr;")
    private class445 field8558;

    @OriginalMember(owner = "client!kfa", name = "i", descriptor = "Lrda;")
    private class660 field8550;

    @OriginalMember(owner = "client!kfa", name = "u", descriptor = "[I")
    public static int[] field8562 = new int[120];

    @OriginalMember(owner = "client!kfa", name = "g", descriptor = "I")
    public static int field8548;

    @OriginalMember(owner = "client!kfa", name = "h", descriptor = "I")
    public static int field8549;

    @OriginalMember(owner = "client!kfa", name = "j", descriptor = "I")
    public static int field8551;

    @OriginalMember(owner = "client!kfa", name = "k", descriptor = "I")
    public static int field8552;

    @OriginalMember(owner = "client!kfa", name = "l", descriptor = "I")
    public static int field8553;

    @OriginalMember(owner = "client!kfa", name = "m", descriptor = "I")
    public static int field8554;

    @OriginalMember(owner = "client!kfa", name = "n", descriptor = "I")
    public static int field8555;

    @OriginalMember(owner = "client!kfa", name = "o", descriptor = "I")
    public static int field8556;

    @OriginalMember(owner = "client!kfa", name = "p", descriptor = "I")
    public static int field8557;

    @OriginalMember(owner = "client!kfa", name = "r", descriptor = "I")
    public static int field8559;

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 120; ++var1) {
            int var2 = var1 + 1;
            int var3 = (int) (Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D + (double) var2);
            var0 += var3;
            field8562[var1] = var0 / 4;
        }
    }

    @OriginalMember(owner = "client!kfa", name = "c", descriptor = "(I)V", line = 3)
    public static void method3411(int arg0) {
        if (arg0 == 1) {
            field8562 = null;
        }
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(IBI)V", line = 13)
    public final void method289(int arg0, byte arg1, int arg2) {
        ++field8553;
        if (this.field8560) {
            int var4 = 1 << (3 & arg0);
            float var5 = (float) (1 << (7 & arg0 >> 3)) / 32.0F;
            int var6 = 65535 & arg2;
            float var7 = (float) ((arg2 & 224469) >> 16) / 8.0F;
            float var8 = (float) (15 & arg2 >> 19) / 16.0F;
            float var9 = (float) ((arg2 & 130477152) >> 23) / 16.0F;
            int var10 = (2127449609 & arg2) >> 27;
            long var11 = this.field8550.field9424;
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "time"), (float) (super.field9647.field5919 * var4 % 40000) / 40000.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "scale"), var5);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "breakWaterDepth"), (float) var6);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "breakWaterOffset"), var7);
            OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(var11, "waveIntensity"), var9, var8);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "waveExponent"), (float) var10);
        }
        if (arg1 <= 72) {
            method3414(true, (class532) null, -108);
        }
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(III)Z", line = 50)
    public static final boolean method3412(int arg0, int arg1, int arg2) {
        ++field8555;
        if (arg2 != 535678147) {
            method3414(true, (class532) null, -88);
        }
        return class418.method2631(-79, arg0, arg1) & class718.method4007(arg1, true, arg0);
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(I)V", line = 62)
    public final void method288(int arg0) {
        if (this.field8560) {
            super.field9647.method2545(32886, 1);
            super.field9647.method2621(-2, (class292) null);
            super.field9647.method2545(32886, 0);
            super.field9647.method2621(-2, (class292) null);
            OpenGL.glUseProgramObjectARB(0L);
            this.field8560 = false;
        }
        ++field8548;
        if (arg0 != 0) {
            this.field8560 = true;
        }
    }

    @OriginalMember(owner = "client!kfa", name = "d", descriptor = "(I)Lfd;", line = 84)
    public static final class526 method3413(int arg0) {
        ++field8557;
        class353.field4536 = 0;
        return arg0 != 8557 ? null : class342.method2036((byte) 58);
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(Ltha;II)V", line = 100)
    public final void method292(class292 arg0, int arg1, int arg2) {
        ++field8554;
        if (!this.field8560) {
            super.field9647.method2621(arg2 + 16995, arg0);
            super.field9647.method2573(arg1, false);
        }
        if (arg2 != -16997) {
            this.method288(-109);
        }
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(IZ)V", line = 116)
    public final void method287(int arg0, boolean arg1) {
        if (arg0 < 111) {
            this.method289(59, (byte) -103, -29);
        }
        ++field8556;
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(BZ)V", line = 126)
    public final void method285(byte arg0, boolean arg1) {
        ++field8552;
        class351 var3 = super.field9647.method2550(arg0 + -20192);
        if (this.field8561 && var3 != null) {
            float var4 = (-Math.abs(super.field9647.field6003[1]) + 1.0F) * 2.0F + 1.0F;
            super.field9647.method2545(arg0 ^ 32834, 1);
            super.field9647.method2621(arg0 ^ -54, var3);
            super.field9647.method2545(32886, 0);
            super.field9647.method2621(-2, this.field8558.field6446);
            long var5 = this.field8550.field9424;
            OpenGL.glUseProgramObjectARB(var5);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var5, "normalSampler"), 0);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var5, "envMapSampler"), 1);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var5, "sunDir"), -super.field9647.field6003[0], -super.field9647.field6003[1], -super.field9647.field6003[2]);
            OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var5, "sunColour"), super.field9647.field5969 * var4, super.field9647.field6050 * var4, super.field9647.field5974 * var4, 1.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var5, "sunExponent"), Math.abs(super.field9647.field6003[1]) * 928.0F + 64.0F);
            this.field8560 = true;
        }
        if (arg0 != 52) {
            this.field8560 = false;
        }
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(ZLtp;I)V", line = 161)
    public static final void method3414(boolean arg0, class532 arg1, int arg2) {
        ++field8559;
        int var3 = ~arg1.field7608 != -1 ? arg1.field7608 : arg1.field7658;
        int var4 = ~arg1.field7699 == -1 ? arg1.field7573 : arg1.field7699;
        class453.method2785(var3, var4, arg0, arg1.field7704, (byte) -121, class643.field9209[arg1.field7704 >> 16]);
        if (arg2 > 103) {
            if (arg1.field7632 != null) {
                class453.method2785(var3, var4, arg0, arg1.field7704, (byte) -109, arg1.field7632);
            }
            class424 var5 = (class424) class153.field1688.method1754(false, (long) arg1.field7704);
            if (var5 != null) {
                class220.method1284(var3, arg0, (byte) 45, var5.field6159, var4);
            }
        }
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(Z)Z", line = 188)
    public final boolean method286(boolean arg0) {
        if (!arg0) {
            this.field8550 = null;
        }
        ++field8549;
        return this.field8561;
    }

    @OriginalMember(owner = "client!kfa", name = "<init>", descriptor = "(Lnv;Lpr;)V", line = 218)
    public class600(class417 arg0, class445 arg1) {
        super(arg0);
        this.field8558 = arg1;
        if (this.field8558.field6446 != null && super.field9647.field6041 && super.field9647.field6030) {
            class299 var3 = class261.method1572(super.field9647, 35633, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n", false);
            class299 var4 = class261.method1572(super.field9647, 35632, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.x*wnNormal.wwww)+waveIntensity.y, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n", false);
            this.field8550 = class501.method2971(super.field9647, new class299[] { var3, var4 }, -15582);
            this.field8561 = this.field8550 != null;
        }
    }

    @OriginalMember(owner = "client!kfa", name = "b", descriptor = "(III)V", line = 204)
    public static final void method3415(int arg0, int arg1, int arg2) {
        ++field8551;
        if (class650.method3697(0, arg0)) {
            if (arg1 == 64) {
                class89.method612(arg2, class643.field9209[arg0], (byte) 43);
            }
        }
    }
}
