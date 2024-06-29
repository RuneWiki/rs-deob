import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qda")
public class class126 extends class301 {

    @OriginalMember(owner = "client!qda", name = "h", descriptor = "Z")
    private boolean field1661 = false;

    @OriginalMember(owner = "client!qda", name = "n", descriptor = "Z")
    private boolean field1667 = false;

    @OriginalMember(owner = "client!qda", name = "f", descriptor = "Lwo;")
    private class722 field1659;

    @OriginalMember(owner = "client!qda", name = "k", descriptor = "Lfm;")
    private class477 field1664;

    @OriginalMember(owner = "client!qda", name = "g", descriptor = "I")
    public static int field1660;

    @OriginalMember(owner = "client!qda", name = "i", descriptor = "I")
    public static int field1662;

    @OriginalMember(owner = "client!qda", name = "j", descriptor = "I")
    public static int field1663;

    @OriginalMember(owner = "client!qda", name = "l", descriptor = "I")
    public static int field1665;

    @OriginalMember(owner = "client!qda", name = "m", descriptor = "I")
    public static int field1666;

    @OriginalMember(owner = "client!qda", name = "o", descriptor = "I")
    public static int field1668;

    @OriginalMember(owner = "client!qda", name = "p", descriptor = "I")
    public static int field1669;

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "(B)Z")
    public final boolean method25(byte arg0) {
        if (arg0 < 7) {
            this.method24((byte) 86);
        }
        ++field1663;
        return this.field1661;
    }

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "(III)V")
    public final void method22(int arg0, int arg1, int arg2) {
        ++field1660;
        if (arg2 != 0) {
            method736(89, -101, 117, (Class) null);
        }
        if (this.field1667) {
            int var4 = 1 << (arg1 & 3);
            float var5 = (float) (1 << ((arg1 & 58) >> 3)) / 32.0F;
            int var6 = 65535 & arg0;
            float var7 = (float) (arg0 >> 16 & 3) / 8.0F;
            float var8 = (float) ((arg0 & 7878577) >> 19) / 16.0F;
            float var9 = (float) ((131473517 & arg0) >> 23) / 16.0F;
            int var10 = (2114041276 & arg0) >> 27;
            long var11 = this.field1664.field6192;
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "time"), (float) (super.field3803.field9807 * var4 % 40000) / 40000.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "scale"), var5);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "breakWaterDepth"), (float) var6);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "breakWaterOffset"), var7);
            OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(var11, "waveIntensity"), var9, var8);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "waveExponent"), (float) var10);
        }
    }

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "(IIILjava/lang/Class;)V")
    public static final void method736(int arg0, int arg1, int arg2, Class arg3) {
        class766 var4 = class28.field252[arg0][arg1][arg2];
        if (var4 != null) {
            for (class569 var5 = var4.field10431; var5 != null; var5 = var5.field7189) {
                class620 var6 = var5.field7193;
                if (arg3.isAssignableFrom(var6.getClass()) && var6.field7852 == arg1 && var6.field7844 == arg2) {
                    class366.method2103(var6, false);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!qda", name = "<init>", descriptor = "(Lck;Lwo;)V")
    public class126(class733 arg0, class722 arg1) {
        super(arg0);
        this.field1659 = arg1;
        if (this.field1659.field9486 != null && super.field3803.field9909 && super.field3803.field9884) {
            class668 var3 = class745.method4041(35633, (byte) 82, super.field3803, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n");
            class668 var4 = class745.method4041(35632, (byte) 81, super.field3803, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.x*wnNormal.wwww)+waveIntensity.y, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n");
            this.field1664 = class617.method3302(new class668[] { var3, var4 }, super.field3803, -112);
            this.field1661 = this.field1664 != null;
        }
    }

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "(Lwj;II)V")
    public final void method28(class128 arg0, int arg1, int arg2) {
        if (!this.field1667) {
            super.field3803.method3975((byte) 127, arg0);
            super.field3803.method3979((byte) -58, arg2);
        }
        if (arg1 == 0) {
            ++field1669;
        }
    }

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "(IIIZI)V")
    public static final void method737(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        ++field1662;
        if (arg3) {
            method737(126, -48, -5, true, 106);
        }
        if (-arg4 + arg1 >= class498.field6390 && ~class30.field274 <= ~(arg1 + arg4) && ~(-arg4 + arg2) <= ~class80.field1131 && ~(arg2 + arg4) >= ~class405.field5375) {
            class17.method78(-588, arg1, arg0, arg4, arg2);
        } else {
            class558.method3026(arg0, arg1, arg4, arg2, -116);
        }
    }

    @OriginalMember(owner = "client!qda", name = "b", descriptor = "(B)V")
    public final void method24(byte arg0) {
        ++field1666;
        if (arg0 >= -89) {
            this.field1661 = false;
        }
        if (this.field1667) {
            super.field3803.method3945(1, false);
            super.field3803.method3975((byte) 118, (class128) null);
            super.field3803.method3945(0, false);
            super.field3803.method3975((byte) 115, (class128) null);
            OpenGL.glUseProgramObjectARB(0L);
            this.field1667 = false;
        }
    }

    @OriginalMember(owner = "client!qda", name = "b", descriptor = "(IZ)V")
    public final void method27(int arg0, boolean arg1) {
        if (arg0 != 0) {
            method736(87, -89, 18, (Class) null);
        }
        ++field1668;
    }

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "(IZ)V")
    public final void method29(int arg0, boolean arg1) {
        if (arg0 >= 18) {
            ++field1665;
            class528 var3 = super.field3803.method3933(true);
            if (this.field1661 && var3 != null) {
                float var4 = 1.0F + (1.0F - Math.abs(super.field3803.field9903[1])) * 2.0F;
                super.field3803.method3945(1, false);
                super.field3803.method3975((byte) 114, var3);
                super.field3803.method3945(0, false);
                super.field3803.method3975((byte) 117, this.field1659.field9486);
                long var5 = this.field1664.field6192;
                OpenGL.glUseProgramObjectARB(var5);
                OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var5, "normalSampler"), 0);
                OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var5, "envMapSampler"), 1);
                OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var5, "sunDir"), -super.field3803.field9903[0], -super.field3803.field9903[1], -super.field3803.field9903[2]);
                OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var5, "sunColour"), super.field3803.field9901 * var4, super.field3803.field9899 * var4, super.field3803.field9921 * var4, 1.0F);
                OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var5, "sunExponent"), 64.0F + Math.abs(super.field3803.field9903[1]) * 928.0F);
                this.field1667 = true;
            }
        }
    }
}
