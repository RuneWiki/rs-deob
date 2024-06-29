import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public class class233 extends class193 {

    @OriginalMember(owner = "client!ak", name = "f", descriptor = "Z")
    private boolean field2968 = false;

    @OriginalMember(owner = "client!ak", name = "k", descriptor = "Z")
    private boolean field2973 = false;

    @OriginalMember(owner = "client!ak", name = "l", descriptor = "Lpl;")
    private class462 field2974;

    @OriginalMember(owner = "client!ak", name = "s", descriptor = "Lme;")
    private class131 field2981;

    @OriginalMember(owner = "client!ak", name = "h", descriptor = "Z")
    public static boolean field2970 = false;

    @OriginalMember(owner = "client!ak", name = "n", descriptor = "I")
    public static int field2976 = -1;

    @OriginalMember(owner = "client!ak", name = "m", descriptor = "Ldq;")
    public static class493 field2975 = new class493(75, -2);

    @OriginalMember(owner = "client!ak", name = "w", descriptor = "Lhd;")
    public static class523 field2985 = null;

    @OriginalMember(owner = "client!ak", name = "g", descriptor = "I")
    public static int field2969;

    @OriginalMember(owner = "client!ak", name = "i", descriptor = "I")
    public static int field2971;

    @OriginalMember(owner = "client!ak", name = "j", descriptor = "I")
    public static int field2972;

    @OriginalMember(owner = "client!ak", name = "o", descriptor = "I")
    public static int field2977;

    @OriginalMember(owner = "client!ak", name = "p", descriptor = "I")
    public static int field2978;

    @OriginalMember(owner = "client!ak", name = "q", descriptor = "I")
    public static int field2979;

    @OriginalMember(owner = "client!ak", name = "r", descriptor = "I")
    public static int field2980;

    @OriginalMember(owner = "client!ak", name = "t", descriptor = "I")
    public static int field2982;

    @OriginalMember(owner = "client!ak", name = "u", descriptor = "I")
    public static int field2983;

    @OriginalMember(owner = "client!ak", name = "v", descriptor = "Lqn;")
    public static class47 field2984;

    static {
        new class335("Please wait until you are logged out of your previous channel.", "Bitte warte, bis du den vorherigen Chatraum verlassen hast.", "Veuillez attendre d'être déconnecté(e) de votre canal précédent.", "Aguarde até se desconectar do canal anterior.");
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IIZ)V", line = 3)
    public final void method99(int arg0, int arg1, boolean arg2) {
        if (this.field2973) {
            int var4 = 1 << (arg0 & 3);
            float var5 = (float) (1 << (7 & arg0 >> 3)) / 32.0F;
            int var6 = 65535 & arg1;
            float var7 = (float) ((arg1 & 205351) >> 16) / 8.0F;
            float var8 = (float) ((arg1 & 8198838) >> 19) / 16.0F;
            float var9 = (float) ((129659978 & arg1) >> 23) / 16.0F;
            int var10 = 15 & arg1 >> 27;
            long var11 = this.field2981.field1719;
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "time"), (float) (super.field2498.field5503 * var4 % 40000) / 40000.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "scale"), var5);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "breakWaterDepth"), (float) var6);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "breakWaterOffset"), var7);
            OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(var11, "waveIntensity"), var9, var8);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "waveExponent"), (float) var10);
        }
        ++field2979;
        if (arg2) {
            this.method97((class119) null, -87, 53);
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(B)V", line = 40)
    public final void method92(byte arg0) {
        if (arg0 < -56) {
            if (this.field2973) {
                super.field2498.method2321(1, 25322);
                super.field2498.method2322((class119) null, 14);
                super.field2498.method2321(0, 25322);
                super.field2498.method2322((class119) null, 14);
                OpenGL.glUseProgramObjectARB(0L);
                this.field2973 = false;
            }
            ++field2980;
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(Z)Z", line = 61)
    public final boolean method93(boolean arg0) {
        if (arg0) {
            field2976 = -76;
        }
        ++field2977;
        return this.field2968;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(ZZ)V", line = 73)
    public final void method94(boolean arg0, boolean arg1) {
        ++field2971;
        class288 var3 = super.field2498.method2285((byte) 69);
        if (!arg0) {
            this.field2981 = null;
        }
        if (this.field2968 && var3 != null) {
            float var4 = 1.0F + (-Math.abs(super.field2498.field5595[1]) + 1.0F) * 2.0F;
            super.field2498.method2321(1, 25322);
            super.field2498.method2322(var3, 14);
            super.field2498.method2321(0, 25322);
            super.field2498.method2322(this.field2974.field6608, 14);
            long var5 = this.field2981.field1719;
            OpenGL.glUseProgramObjectARB(var5);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var5, "normalSampler"), 0);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var5, "envMapSampler"), 1);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var5, "sunDir"), -super.field2498.field5595[0], -super.field2498.field5595[1], -super.field2498.field5595[2]);
            OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var5, "sunColour"), super.field2498.field5609 * var4, super.field2498.field5570 * var4, super.field2498.field5626 * var4, 1.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var5, "sunExponent"), Math.abs(super.field2498.field5595[1]) * 928.0F + 64.0F);
            this.field2973 = true;
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(ILbf;)V", line = 105)
    public static final void method1411(int arg0, class375 arg1) {
        if (arg0 != 128) {
            method1411(-1, (class375) null);
        }
        ++field2983;
        boolean var2 = false;
        if (class163.field2065 != arg1.field4842 && arg1.field4859 != -1 && ~arg1.field4853 == -1) {
            class415 var3 = class404.field5756.method557(arg1.field4859, 15);
            if (var3.field5916 || ~var3.field5915[arg1.field4873] > ~(arg1.field4870 + 1)) {
                var2 = true;
            }
        } else {
            var2 = true;
        }
        if (var2) {
            int var4 = -arg1.field4844 + arg1.field4842;
            int var5 = -arg1.field4844 + class163.field2065;
            int var6 = arg1.field4843 * 128 - -(64 * arg1.method1366((byte) -108));
            int var7 = arg1.field4917 * 128 + arg1.method1366((byte) -123) * 64;
            int var8 = arg1.field4919 * 128 + 64 * arg1.method1366((byte) -122);
            int var9 = arg1.field4931 * 128 + 64 * arg1.method1366((byte) -120);
            arg1.field2677 = ((-var5 + var4) * var7 - -(var5 * var9)) / var4;
            arg1.field2666 = ((var4 - var5) * var6 + var5 * var8) / var4;
        }
        arg1.field4938 = 0;
        if (~arg1.field4863 == -1) {
            arg1.method2125((byte) 115, 8192);
        }
        if (~arg1.field4863 == -2) {
            arg1.method2125((byte) 107, 12288);
        }
        if (arg1.field4863 == 2) {
            arg1.method2125((byte) -62, 0);
        }
        if (arg1.field4863 == 3) {
            arg1.method2125((byte) 118, 4096);
        }
    }

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "(ZZ)V", line = 163)
    public final void method95(boolean arg0, boolean arg1) {
        if (!arg1) {
            field2975 = null;
        }
        ++field2969;
    }

    @OriginalMember(owner = "client!ak", name = "<init>", descriptor = "(Lug;Lpl;)V", line = 179)
    public class233(class395 arg0, class462 arg1) {
        super(arg0);
        this.field2974 = arg1;
        if (this.field2974.field6608 != null && super.field2498.field5625 && super.field2498.field5531) {
            class320 var3 = class157.method1019("uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n", 35633, 1, super.field2498);
            class320 var4 = class157.method1019("varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.x*wnNormal.wwww)+waveIntensity.y, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = mix(surfaceColour, vec4(gl_Fog.color.rgb, 1.0), gl_FogFragCoord);\n}\n", 35632, 1, super.field2498);
            this.field2981 = class18.method155(super.field2498, new class320[] { var3, var4 }, 0);
            this.field2968 = this.field2981 != null;
        }
    }

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "(I)V", line = 204)
    public static void method1412(int arg0) {
        field2984 = null;
        field2985 = null;
        if (arg0 != 19308) {
            method1412(104);
        }
        field2975 = null;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(Lsq;II)V", line = 229)
    public final void method97(class119 arg0, int arg1, int arg2) {
        ++field2978;
        if (!this.field2973) {
            super.field2498.method2322(arg0, 14);
            super.field2498.method2305(arg2 + 7645, arg1);
        }
        if (arg2 != 36) {
            this.method94(false, false);
        }
    }
}
