import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aq")
public class class332 extends class56 {

    @OriginalMember(owner = "client!aq", name = "i", descriptor = "Z")
    private boolean field5130 = false;

    @OriginalMember(owner = "client!aq", name = "w", descriptor = "Z")
    private boolean field5144 = false;

    @OriginalMember(owner = "client!aq", name = "r", descriptor = "Lre;")
    private class222 field5139;

    @OriginalMember(owner = "client!aq", name = "t", descriptor = "Lrs;")
    private class486 field5141;

    @OriginalMember(owner = "client!aq", name = "j", descriptor = "[Ljava/lang/String;")
    public static String[] field5131 = new String[100];

    @OriginalMember(owner = "client!aq", name = "u", descriptor = "[I")
    public static int[] field5142 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!aq", name = "h", descriptor = "I")
    public static int field5129 = 0;

    @OriginalMember(owner = "client!aq", name = "v", descriptor = "Lsi;")
    public static class512 field5143 = new class512(6, 15);

    @OriginalMember(owner = "client!aq", name = "k", descriptor = "I")
    public static int field5132;

    @OriginalMember(owner = "client!aq", name = "l", descriptor = "I")
    public static int field5133;

    @OriginalMember(owner = "client!aq", name = "m", descriptor = "I")
    public static int field5134;

    @OriginalMember(owner = "client!aq", name = "n", descriptor = "I")
    public static int field5135;

    @OriginalMember(owner = "client!aq", name = "o", descriptor = "I")
    public static int field5136;

    @OriginalMember(owner = "client!aq", name = "p", descriptor = "I")
    public static int field5137;

    @OriginalMember(owner = "client!aq", name = "s", descriptor = "I")
    public static int field5140;

    @OriginalMember(owner = "client!aq", name = "x", descriptor = "I")
    public static int field5145;

    @OriginalMember(owner = "client!aq", name = "y", descriptor = "I")
    public static int field5146;

    @OriginalMember(owner = "client!aq", name = "z", descriptor = "I")
    public static int field5147;

    @OriginalMember(owner = "client!aq", name = "q", descriptor = "Lhh;")
    public static class125 field5138;

    @OriginalMember(owner = "client!aq", name = "c", descriptor = "(I)V", line = 3)
    public static void method2139(int arg0) {
        field5142 = null;
        if (arg0 == 0) {
            field5131 = null;
            field5138 = null;
            field5143 = null;
        }
    }

    @OriginalMember(owner = "client!aq", name = "<init>", descriptor = "(Lbv;Lre;)V", line = 17)
    public class332(class282 arg0, class222 arg1) {
        super(arg0);
        this.field5139 = arg1;
        if (this.field5139.field3105 != null && super.field752.field4198 && super.field752.field4150) {
            class238 var3 = class117.method760(super.field752, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n", 35633, -12054);
            class238 var4 = class117.method760(super.field752, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = mix(surfaceColour, vec4(gl_Fog.color.rgb, 1.0), gl_FogFragCoord);\n}\n", 35632, -12054);
            this.field5141 = class384.method2382((byte) 85, new class238[] { var3, var4 }, super.field752);
            this.field5144 = this.field5141 != null;
        }
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(B)Z", line = 48)
    public final boolean method377(byte arg0) {
        ++field5137;
        if (arg0 >= -8) {
            this.field5141 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!aq", name = "b", descriptor = "(ZI)V", line = 62)
    public final void method383(boolean arg0, int arg1) {
        ++field5140;
        if (arg1 >= -77) {
            this.method377((byte) 98);
        }
        class237 var3 = super.field752.method1805(1365);
        if (this.field5144 && var3 != null) {
            super.field752.method1819(1, (byte) 123);
            super.field752.method1787(var3, (byte) 121);
            super.field752.method1819(0, (byte) 109);
            super.field752.method1787(this.field5139.field3105, (byte) 121);
            long var4 = this.field5141.field7133;
            OpenGL.glUseProgramObjectARB(var4);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, "normalSampler"), 0);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, "envMapSampler"), 1);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var4, "sunDir"), -super.field752.field4110[0], -super.field752.field4110[1], -super.field752.field4110[2]);
            OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var4, "sunColour"), super.field752.field4111, super.field752.field4182, super.field752.field4194, 1.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var4, "sunExponent"), Math.abs(super.field752.field4110[1]) * 928.0F + 96.0F);
            this.field5130 = true;
        }
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(ZI[Ljb;IIZ)V", line = 92)
    public static final void method2140(boolean arg0, int arg1, class499[] arg2, int arg3, int arg4, boolean arg5) {
        for (int var6 = 0; ~var6 > ~arg2.length; ++var6) {
            class499 var7 = arg2[var6];
            if (var7 != null && var7.field7322 == arg1) {
                class457.method2752(arg4, arg3, arg5, var7, 31166);
                class399.method2455(var7, arg0, arg3, arg4);
                if (~var7.field7418 < ~(-var7.field7348 + var7.field7303)) {
                    var7.field7418 = -var7.field7348 + var7.field7303;
                }
                if (~var7.field7389 < ~(var7.field7293 - var7.field7386)) {
                    var7.field7389 = -var7.field7386 + var7.field7293;
                }
                if (~var7.field7418 > -1) {
                    var7.field7418 = 0;
                }
                if (var7.field7389 < 0) {
                    var7.field7389 = 0;
                }
                if (var7.field7355 == 0) {
                    class57.method387(var7, arg5, -16180);
                }
            }
        }
        ++field5145;
        if (!arg0) {
            method2140(false, -3, (class499[]) null, 1, -37, false);
        }
    }

    @OriginalMember(owner = "client!aq", name = "b", descriptor = "(B)V", line = 139)
    public static final void method2141(byte arg0) {
        class530.method3131(false, arg0 ^ 67);
        ++field5135;
        if (~class286.field4265 <= -1 && class286.field4265 != 0) {
            class310.method1995(true, class286.field4265);
            class286.field4265 = -1;
        }
        if (arg0 != 3) {
            field5147 = -23;
        }
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(I)V", line = 157)
    public final void method381(int arg0) {
        if (this.field5130) {
            super.field752.method1819(1, (byte) 94);
            super.field752.method1787((class14) null, (byte) 121);
            super.field752.method1819(0, (byte) 120);
            super.field752.method1787((class14) null, (byte) 121);
            OpenGL.glUseProgramObjectARB(0L);
            this.field5130 = false;
        }
        ++field5136;
        if (arg0 > -50) {
            this.method379(82, -29, (class14) null);
        }
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(IILkv;)V", line = 179)
    public final void method379(int arg0, int arg1, class14 arg2) {
        if (!this.field5130) {
            super.field752.method1787(arg2, (byte) 121);
            super.field752.method1794(arg0, 78);
        }
        int var4 = -125 / ((81 - arg1) / 39);
        ++field5134;
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(III)V", line = 199)
    public final void method382(int arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            this.method381(-37);
        }
        ++field5133;
        if (this.field5130) {
            int var4 = 1 << (arg1 & 3);
            float var5 = (float) (1 << (arg1 >> 3 & 7)) / 32.0F;
            int var6 = 65535 & arg0;
            float var7 = (float) ((260695 & arg0) >> 16) / 8.0F;
            long var8 = this.field5141.field7133;
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "time"), (float) (super.field752.field4086 * var4 % 40000) / 40000.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "scale"), var5);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterDepth"), (float) var6);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterOffset"), var7);
        }
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(ZI)V", line = 236)
    public final void method380(boolean arg0, int arg1) {
        if (arg1 < 42) {
            this.method382(107, 110, 73);
        }
        ++field5146;
    }
}
