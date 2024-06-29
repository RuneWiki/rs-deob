import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lu")
public class class668 extends class460 {

    @OriginalMember(owner = "client!lu", name = "l", descriptor = "Z")
    private boolean field9062 = false;

    @OriginalMember(owner = "client!lu", name = "m", descriptor = "Z")
    private boolean field9063 = false;

    @OriginalMember(owner = "client!lu", name = "h", descriptor = "Ldk;")
    private class477 field9058;

    @OriginalMember(owner = "client!lu", name = "k", descriptor = "Lsh;")
    private class65 field9061;

    @OriginalMember(owner = "client!lu", name = "d", descriptor = "Ldr;")
    public static class675 field9054 = new class675(112, 12);

    @OriginalMember(owner = "client!lu", name = "e", descriptor = "I")
    public static int field9055;

    @OriginalMember(owner = "client!lu", name = "f", descriptor = "I")
    public static int field9056;

    @OriginalMember(owner = "client!lu", name = "g", descriptor = "I")
    public static int field9057;

    @OriginalMember(owner = "client!lu", name = "i", descriptor = "I")
    public static int field9059;

    @OriginalMember(owner = "client!lu", name = "j", descriptor = "I")
    public static int field9060;

    @OriginalMember(owner = "client!lu", name = "n", descriptor = "I")
    public static int field9064;

    @OriginalMember(owner = "client!lu", name = "o", descriptor = "I")
    public static int field9065;

    @OriginalMember(owner = "client!lu", name = "p", descriptor = "I")
    public static int field9066;

    @OriginalMember(owner = "client!lu", name = "q", descriptor = "I")
    public static int field9067;

    @OriginalMember(owner = "client!lu", name = "b", descriptor = "(I)Z")
    public final boolean method16(int arg0) {
        ++field9059;
        if (arg0 != -24566) {
            method3713(81);
        }
        return this.field9062;
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(BZ)V")
    public final void method17(byte arg0, boolean arg1) {
        ++field9067;
        if (arg0 < 100) {
            field9054 = null;
        }
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(IZ)V")
    public static final void method3711(int arg0, boolean arg1) {
        if (arg1) {
            class383.field4917 = arg0;
            ++field9066;
            class208 var2 = class634.field8597;
            synchronized (class634.field8597) {
                class634.field8597.method1218(99);
            }
        }
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(ZI)V")
    public final void method13(boolean arg0, int arg1) {
        ++field9057;
        class51 var3 = super.field5744.method3187((byte) 121);
        if (this.field9062 && var3 != null) {
            float var4 = 1.0F + 2.0F * (-Math.abs(super.field5744.field7624[1]) + 1.0F);
            super.field5744.method3126(1, -126);
            super.field5744.method3194((byte) 75, var3);
            super.field5744.method3126(0, -43);
            super.field5744.method3194((byte) 75, this.field9058.field5939);
            long var5 = this.field9061.field785;
            OpenGL.glUseProgramObjectARB(var5);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var5, "normalSampler"), 0);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var5, "envMapSampler"), 1);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var5, "sunDir"), -super.field5744.field7624[0], -super.field5744.field7624[1], -super.field5744.field7624[2]);
            OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var5, "sunColour"), super.field5744.field7711 * var4, super.field5744.field7650 * var4, super.field5744.field7733 * var4, 1.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var5, "sunExponent"), 928.0F * Math.abs(super.field5744.field7624[1]) + 64.0F);
            this.field9063 = true;
        }
        if (arg1 != -32460) {
            this.field9061 = null;
        }
    }

    @OriginalMember(owner = "client!lu", name = "b", descriptor = "(B)V")
    public static final void method3712(byte arg0) {
        class107.method752(class611.field8310.field8696, (byte) 26);
        ++field9060;
        int var1 = (class238.field3071 >> 12) + (class227.field2938 >> 3);
        class675.field9219 = class67.field815.field8010 = 0;
        int var2 = (class710.field9924 >> 12) + (class522.field6612 >> 3);
        class67.field815.method2120(arg0 + -160, 8, 8);
        byte var3 = 18;
        class523.field6614 = new byte[var3][];
        class418.field5342 = new byte[var3][];
        class257.field3289 = new byte[var3][];
        class552.field6912 = new byte[var3][];
        class576.field7563 = new int[var3];
        class340.field4340 = new byte[var3][];
        class589.field7901 = new int[var3][4];
        class599.field8032 = new int[var3];
        if (arg0 == 80) {
            class269.field3416 = new int[var3];
            class657.field8938 = new int[var3];
            class307.field3888 = new int[var3];
            class14.field139 = new int[var3];
            int var4 = 0;
            for (int var5 = (-(class85.field1090 >> 4) + var1) / 8; var5 <= ((class85.field1090 >> 4) + var1) / 8; ++var5) {
                for (int var8 = (var2 - (class656.field8932 >> 4)) / 8; ~var8 >= ~(((class656.field8932 >> 4) + var2) / 8); ++var8) {
                    int var9 = (var5 << 8) + var8;
                    class307.field3888[var4] = var9;
                    class576.field7563[var4] = class109.field1364.method1651("m" + var5 + "_" + var8, (byte) 77);
                    class269.field3416[var4] = class109.field1364.method1651("l" + var5 + "_" + var8, (byte) 77);
                    class599.field8032[var4] = class109.field1364.method1651("n" + var5 + "_" + var8, (byte) 77);
                    class14.field139[var4] = class109.field1364.method1651("um" + var5 + "_" + var8, (byte) 77);
                    class657.field8938[var4] = class109.field1364.method1651("ul" + var5 + "_" + var8, (byte) 77);
                    if (class599.field8032[var4] == -1) {
                        class576.field7563[var4] = -1;
                        class269.field3416[var4] = -1;
                        class14.field139[var4] = -1;
                        class657.field8938[var4] = -1;
                    }
                    ++var4;
                }
            }
            for (int var6 = var4; var6 < class599.field8032.length; ++var6) {
                class599.field8032[var6] = -1;
                class576.field7563[var6] = -1;
                class269.field3416[var6] = -1;
                class14.field139[var6] = -1;
                class657.field8938[var6] = -1;
            }
            byte var7;
            if (~class470.field5804 != -4) {
                var7 = 8;
            } else {
                var7 = 4;
            }
            class250.method1509(9840, false, var7, var2, var1);
        }
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(IIB)V")
    public final void method18(int arg0, int arg1, byte arg2) {
        ++field9064;
        if (arg2 >= -110) {
            this.method15(-5);
        }
        if (this.field9063) {
            int var4 = 1 << (arg0 & 3);
            float var5 = (float) (1 << (arg0 >> 3 & 7)) / 32.0F;
            int var6 = 65535 & arg1;
            float var7 = (float) ((237783 & arg1) >> 16) / 8.0F;
            float var8 = (float) (15 & arg1 >> 19) / 16.0F;
            float var9 = (float) ((130020144 & arg1) >> 23) / 16.0F;
            int var10 = arg1 >> 27 & 15;
            long var11 = this.field9061.field785;
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "time"), (float) (super.field5744.field7595 * var4 % 40000) / 40000.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "scale"), var5);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "breakWaterDepth"), (float) var6);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "breakWaterOffset"), var7);
            OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(var11, "waveIntensity"), var9, var8);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "waveExponent"), (float) var10);
        }
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(I)V")
    public final void method15(int arg0) {
        if (arg0 != 0) {
            field9054 = null;
        }
        if (this.field9063) {
            super.field5744.method3126(1, arg0 + -58);
            super.field5744.method3194((byte) 75, (class185) null);
            super.field5744.method3126(0, -61);
            super.field5744.method3194((byte) 75, (class185) null);
            OpenGL.glUseProgramObjectARB(0L);
            this.field9063 = false;
        }
        ++field9065;
    }

    @OriginalMember(owner = "client!lu", name = "c", descriptor = "(I)V")
    public static void method3713(int arg0) {
        if (arg0 != -1) {
            method3711(110, true);
        }
        field9054 = null;
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(IILtj;)V")
    public final void method19(int arg0, int arg1, class185 arg2) {
        ++field9056;
        if (!this.field9063) {
            super.field5744.method3194((byte) 75, arg2);
            super.field5744.method3134(98, arg0);
        }
        int var4 = -8 / ((25 - arg1) / 59);
    }

    @OriginalMember(owner = "client!lu", name = "<init>", descriptor = "(Ljaa;Ldk;)V")
    public class668(class576 arg0, class477 arg1) {
        super(arg0);
        this.field9058 = arg1;
        if (this.field9058.field5939 != null && super.field5744.field7724 && super.field5744.field7732) {
            class491 var3 = class428.method2362("uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n", 35716, super.field5744, 35633);
            class491 var4 = class428.method2362("varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.x*wnNormal.wwww)+waveIntensity.y, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = mix(surfaceColour, vec4(gl_Fog.color.rgb, 1.0), gl_FogFragCoord);\n}\n", 35716, super.field5744, 35632);
            this.field9061 = class234.method1417(new class491[] { var3, var4 }, -128, super.field5744);
            this.field9062 = this.field9061 != null;
        }
    }
}
