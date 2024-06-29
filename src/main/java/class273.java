import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pp")
public class class273 extends class86 {

    @OriginalMember(owner = "client!pp", name = "n", descriptor = "Z")
    private boolean field3790 = false;

    @OriginalMember(owner = "client!pp", name = "k", descriptor = "Z")
    private boolean field3787 = false;

    @OriginalMember(owner = "client!pp", name = "s", descriptor = "Lhl;")
    private class373 field3795;

    @OriginalMember(owner = "client!pp", name = "B", descriptor = "Lsu;")
    private class142 field3803;

    @OriginalMember(owner = "client!pp", name = "w", descriptor = "[[I")
    public static int[][] field3799 = new int[][] { { 0, 1, 2, 3 }, { 1, -1, -1, 0 }, { -1, 2, -1, 0 }, { -1, 0, -1, 2 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 3, 4, -1 }, { -1, 0, 2, -1 }, { -1, -1, 2, 0 }, { 0, 2, 5, 3 }, { 0, -1, 6, -1 }, { 0, 1, 2, 3 } };

    @OriginalMember(owner = "client!pp", name = "z", descriptor = "I")
    public static int field3802 = 0;

    @OriginalMember(owner = "client!pp", name = "x", descriptor = "Lla;")
    public static class319 field3800 = new class319(34, -1);

    @OriginalMember(owner = "client!pp", name = "E", descriptor = "Lni;")
    public static class367 field3806 = new class367(79, -1);

    @OriginalMember(owner = "client!pp", name = "j", descriptor = "I")
    public static int field3786;

    @OriginalMember(owner = "client!pp", name = "l", descriptor = "I")
    public static int field3788;

    @OriginalMember(owner = "client!pp", name = "m", descriptor = "I")
    public static int field3789;

    @OriginalMember(owner = "client!pp", name = "o", descriptor = "I")
    public static int field3791;

    @OriginalMember(owner = "client!pp", name = "p", descriptor = "I")
    public static int field3792;

    @OriginalMember(owner = "client!pp", name = "q", descriptor = "I")
    public static int field3793;

    @OriginalMember(owner = "client!pp", name = "r", descriptor = "I")
    public static int field3794;

    @OriginalMember(owner = "client!pp", name = "t", descriptor = "I")
    public static int field3796;

    @OriginalMember(owner = "client!pp", name = "u", descriptor = "I")
    public static int field3797;

    @OriginalMember(owner = "client!pp", name = "v", descriptor = "I")
    public static int field3798;

    @OriginalMember(owner = "client!pp", name = "C", descriptor = "I")
    public static int field3804;

    @OriginalMember(owner = "client!pp", name = "D", descriptor = "I")
    public static int field3805;

    @OriginalMember(owner = "client!pp", name = "F", descriptor = "I")
    public static int field3807;

    @OriginalMember(owner = "client!pp", name = "y", descriptor = "Luu;")
    public static class191 field3801;

    @OriginalMember(owner = "client!pp", name = "b", descriptor = "(I)V", line = 12)
    public static void method1752(int arg0) {
        field3801 = null;
        int var1 = 42 % ((arg0 - 56) / 49);
        field3800 = null;
        field3806 = null;
        field3799 = null;
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(ZLjava/lang/String;)V", line = 24)
    public static final void method1753(boolean arg0, String arg1) {
        ++field3792;
        if (!arg0) {
            method1757((byte) -73);
        }
        if (!arg1.equals("")) {
            ++class208.field2875;
            class424.method2582(class261.field3680, -1);
            class538.field7879.method1072((byte) 102, class436.method2652(arg1, (byte) -122));
            class538.field7879.method1071(-25643, arg1);
        }
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(I)V", line = 42)
    public final void method237(int arg0) {
        if (this.field3787) {
            super.field1248.method2040((byte) -105, 1);
            super.field1248.method2075((class538) null, 0);
            super.field1248.method2040((byte) -117, 0);
            super.field1248.method2075((class538) null, 0);
            OpenGL.glUseProgramObjectARB(0L);
            this.field3787 = false;
        }
        if (arg0 != 27670) {
            method1757((byte) 67);
        }
        ++field3786;
    }

    @OriginalMember(owner = "client!pp", name = "<init>", descriptor = "(Lnq;Lhl;)V", line = 63)
    public class273(class325 arg0, class373 arg1) {
        super(arg0);
        this.field3795 = arg1;
        if (this.field3795.field5683 != null && super.field1248.field5005 && super.field1248.field4923) {
            class473 var3 = class222.method1502("uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n", super.field1248, 35633, (byte) 55);
            class473 var4 = class222.method1502("varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.x*wnNormal.wwww)+waveIntensity.y, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = mix(surfaceColour, vec4(gl_Fog.color.rgb, 1.0), gl_FogFragCoord);\n}\n", super.field1248, 35632, (byte) -89);
            this.field3803 = class194.method1306(super.field1248, new class473[] { var3, var4 }, (byte) -114);
            this.field3790 = this.field3803 != null;
        }
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(ZLuu;)I", line = 84)
    public static final int method1754(boolean arg0, class191 arg1) {
        ++field3794;
        int var2 = 0;
        if (arg1.method1288(class180.field2426, 18555)) {
            ++var2;
        }
        if (arg1.method1288(class254.field3522, 18555)) {
            ++var2;
        }
        if (arg1.method1288(class41.field611, 18555)) {
            ++var2;
        }
        if (arg1.method1288(class435.field6592, 18555)) {
            ++var2;
        }
        if (arg1.method1288(class248.field3453, 18555)) {
            ++var2;
        }
        if (arg0) {
            return -94;
        } else {
            if (arg1.method1288(class498.field7350, 18555)) {
                ++var2;
            }
            if (arg1.method1288(class334.field5193, 18555)) {
                ++var2;
            }
            if (arg1.method1288(class165.field2240, 18555)) {
                ++var2;
            }
            if (arg1.method1288(class484.field7134, 18555)) {
                ++var2;
            }
            if (arg1.method1288(class247.field3450, 18555)) {
                ++var2;
            }
            if (arg1.method1288(class418.field6366, 18555)) {
                ++var2;
            }
            if (arg1.method1288(class163.field2149, 18555)) {
                ++var2;
            }
            if (arg1.method1288(class209.field2892, 18555)) {
                ++var2;
            }
            if (arg1.method1288(class229.field3280, 18555)) {
                ++var2;
            }
            if (arg1.method1288(class191.field2578, 18555)) {
                ++var2;
            }
            if (arg1.method1288(class304.field4437, 18555)) {
                ++var2;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(IB[I[Ljava/lang/Object;I)V", line = 151)
    public static final void method1755(int arg0, byte arg1, int[] arg2, Object[] arg3, int arg4) {
        if (~arg4 > ~arg0) {
            int var5 = (arg0 + arg4) / 2;
            int var6 = arg4;
            int var7 = arg2[var5];
            arg2[var5] = arg2[arg0];
            arg2[arg0] = var7;
            Object var8 = arg3[var5];
            arg3[var5] = arg3[arg0];
            arg3[arg0] = var8;
            int var9 = ~var7 != Integer.MIN_VALUE ? 1 : 0;
            for (int var10 = arg4; var10 < arg0; ++var10) {
                if (arg2[var10] < var7 - -(var9 & var10)) {
                    int var11 = arg2[var10];
                    arg2[var10] = arg2[var6];
                    arg2[var6] = var11;
                    Object var12 = arg3[var10];
                    arg3[var10] = arg3[var6];
                    arg3[var6++] = var12;
                }
            }
            arg2[arg0] = arg2[var6];
            arg2[var6] = var7;
            arg3[arg0] = arg3[var6];
            arg3[var6] = var8;
            method1755(var6 + -1, (byte) 112, arg2, arg3, arg4);
            method1755(arg0, (byte) 67, arg2, arg3, var6 + 1);
        }
        if (arg1 < 26) {
            field3801 = null;
        }
        ++field3797;
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(IZ)V", line = 209)
    public final void method241(int arg0, boolean arg1) {
        if (arg0 != 0) {
            this.field3795 = null;
        }
        ++field3793;
        class1 var3 = super.field1248.method2080(27094);
        if (this.field3790 && var3 != null) {
            float var4 = 1.0F + (-Math.abs(super.field1248.field4959[1]) + 1.0F) * 2.0F;
            super.field1248.method2040((byte) -5, 1);
            super.field1248.method2075(var3, 0);
            super.field1248.method2040((byte) 1, 0);
            super.field1248.method2075(this.field3795.field5683, 0);
            long var5 = this.field3803.field1898;
            OpenGL.glUseProgramObjectARB(var5);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var5, "normalSampler"), 0);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var5, "envMapSampler"), 1);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var5, "sunDir"), -super.field1248.field4959[0], -super.field1248.field4959[1], -super.field1248.field4959[2]);
            OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var5, "sunColour"), super.field1248.field4981 * var4, super.field1248.field5012 * var4, super.field1248.field4978 * var4, 1.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var5, "sunExponent"), 928.0F * Math.abs(super.field1248.field4959[1]) + 64.0F);
            this.field3787 = true;
        }
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(BZIZI)I", line = 240)
    public static final int method1756(byte arg0, boolean arg1, int arg2, boolean arg3, int arg4) {
        ++field3798;
        class94 var5 = class402.method2483(arg1, (byte) -85, arg4);
        if (var5 == null) {
            return 0;
        } else {
            int var6 = 0;
            if (arg0 < 16) {
                field3807 = 64;
            }
            for (int var7 = 0; var5.field1373.length > var7; ++var7) {
                if (~var5.field1373[var7] <= -1 && ~var5.field1373[var7] > ~class103.field1489.field3419) {
                    class74 var8 = class103.field1489.method1603((byte) -99, var5.field1373[var7]);
                    int var9 = var8.method526(arg2, 0, class83.field1218.method3118(arg2, -13676).field2727);
                    if (arg3) {
                        var6 += var5.field1377[var7] * var9;
                    } else {
                        var6 += var9;
                    }
                }
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!pp", name = "b", descriptor = "(B)Z", line = 285)
    public final boolean method238(byte arg0) {
        ++field3788;
        return arg0 >= -2 ? false : this.field3790;
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(ZLlr;I)V", line = 298)
    public final void method236(boolean arg0, class538 arg1, int arg2) {
        if (arg0) {
            if (!this.field3787) {
                super.field1248.method2075(arg1, 0);
                super.field1248.method2045(34023, arg2);
            }
            ++field3796;
        }
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(IBI)V", line = 314)
    public final void method239(int arg0, byte arg1, int arg2) {
        ++field3804;
        if (this.field3787) {
            int var4 = 1 << (3 & arg2);
            float var5 = (float) (1 << ((arg2 & 63) >> 3)) / 32.0F;
            int var6 = arg0 & 65535;
            float var7 = (float) ((arg0 & 216275) >> 16) / 8.0F;
            float var8 = (float) (arg0 >> 19 & 15) / 16.0F;
            float var9 = (float) ((129178392 & arg0) >> 23) / 16.0F;
            int var10 = (arg0 & 2037538308) >> 27;
            long var11 = this.field3803.field1898;
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "time"), (float) (super.field1248.field4899 * var4 % 40000) / 40000.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "scale"), var5);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "breakWaterDepth"), (float) var6);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "breakWaterOffset"), var7);
            OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(var11, "waveIntensity"), var9, var8);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "waveExponent"), (float) var10);
        }
        int var13 = 28 / ((arg1 - -50) / 53);
    }

    @OriginalMember(owner = "client!pp", name = "c", descriptor = "(B)V", line = 354)
    public static final void method1757(byte arg0) {
        ++field3789;
        if (arg0 <= 112) {
            field3799 = null;
        }
        if (!class373.field5676) {
            class373.field5676 = true;
            if (!class203.field2716.field1180) {
                class138.field1845 += (-class138.field1845 + -24.0F) / 2.0F;
            } else {
                class53.field744 = (float) ((int) class53.field744 + -65 & -128);
            }
            class508.field7475 = true;
        }
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(ZB)V", line = 388)
    public final void method235(boolean arg0, byte arg1) {
        ++field3791;
        if (arg1 != 112) {
            this.field3795 = null;
        }
    }
}
