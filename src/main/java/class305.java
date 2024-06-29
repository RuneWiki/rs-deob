import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pt")
public class class305 extends class374 {

    @OriginalMember(owner = "client!pt", name = "m", descriptor = "Z")
    private boolean field4560 = false;

    @OriginalMember(owner = "client!pt", name = "o", descriptor = "Z")
    private boolean field4562 = false;

    @OriginalMember(owner = "client!pt", name = "u", descriptor = "Lbt;")
    private class89 field4568;

    @OriginalMember(owner = "client!pt", name = "i", descriptor = "Lij;")
    private class467 field4556;

    @OriginalMember(owner = "client!pt", name = "f", descriptor = "Luv;")
    public static class2 field4553 = null;

    @OriginalMember(owner = "client!pt", name = "h", descriptor = "I")
    public static int field4555 = 0;

    @OriginalMember(owner = "client!pt", name = "d", descriptor = "I")
    public static int field4551;

    @OriginalMember(owner = "client!pt", name = "g", descriptor = "I")
    public static int field4554;

    @OriginalMember(owner = "client!pt", name = "j", descriptor = "I")
    public static int field4557;

    @OriginalMember(owner = "client!pt", name = "k", descriptor = "I")
    public static int field4558;

    @OriginalMember(owner = "client!pt", name = "l", descriptor = "I")
    public static int field4559;

    @OriginalMember(owner = "client!pt", name = "n", descriptor = "I")
    public static int field4561;

    @OriginalMember(owner = "client!pt", name = "p", descriptor = "I")
    public static int field4563;

    @OriginalMember(owner = "client!pt", name = "q", descriptor = "I")
    public static int field4564;

    @OriginalMember(owner = "client!pt", name = "r", descriptor = "I")
    public static int field4565;

    @OriginalMember(owner = "client!pt", name = "s", descriptor = "I")
    public static int field4566;

    @OriginalMember(owner = "client!pt", name = "t", descriptor = "I")
    public static int field4567;

    @OriginalMember(owner = "client!pt", name = "e", descriptor = "Lok;")
    public static class74 field4552;

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(ZZ)V", line = 3)
    public final void method25(boolean arg0, boolean arg1) {
        ++field4554;
        if (!arg1) {
            field4553 = null;
        }
        class487 var3 = super.field5646.method1589((byte) -124);
        if (this.field4560 && var3 != null) {
            super.field5646.method1553(1, -8156);
            super.field5646.method1546(-2, var3);
            super.field5646.method1553(0, -8156);
            super.field5646.method1546(-2, this.field4568.field1393);
            long var4 = this.field4556.field6796;
            OpenGL.glUseProgramObjectARB(var4);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, "normalSampler"), 0);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, "envMapSampler"), 1);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var4, "sunDir"), -super.field5646.field3804[0], -super.field5646.field3804[1], -super.field5646.field3804[2]);
            OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var4, "sunColour"), super.field5646.field3778, super.field5646.field3739, super.field5646.field3775, 1.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var4, "sunExponent"), 96.0F + 928.0F * Math.abs(super.field5646.field3804[1]));
            this.field4562 = true;
        }
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(B)Z", line = 33)
    public final boolean method21(byte arg0) {
        if (arg0 < 85) {
            this.method18(false, (class271) null, 79);
        }
        ++field4566;
        return false;
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(IILb;ZLya;Lcs;)Z", line = 44)
    public static final boolean method1901(int arg0, int arg1, class473 arg2, boolean arg3, class11 arg4, class219 arg5) {
        ++field4565;
        int var6 = Integer.MAX_VALUE;
        int var7 = Integer.MIN_VALUE;
        if (arg3) {
            field4563 = -81;
        }
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        if (arg2.field6951 != null) {
            var7 = (arg2.field6970 - class137.field2033 + arg5.field3134) * (-class137.field2046 + class137.field2052) / (class137.field2045 - class137.field2033) + class137.field2046;
            var9 = -((arg2.field6961 - (-arg5.field3132 + class137.field2047)) * (-class137.field2040 + class137.field2042) / (-class137.field2047 + class137.field2043)) + class137.field2042;
            var8 = -((arg2.field6969 + arg5.field3132 + -class137.field2047) * (-class137.field2040 + class137.field2042) / (-class137.field2047 + class137.field2043)) + class137.field2042;
            var6 = (arg2.field6949 + arg5.field3134 + -class137.field2033) * (-class137.field2046 + class137.field2052) / (class137.field2045 - class137.field2033) + class137.field2046;
        }
        class127 var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        if (arg2.field6937 != -1) {
            if (arg5.field3138 && arg2.field6958 != -1) {
                var10 = arg2.method2810(arg4, false, true);
            } else {
                var10 = arg2.method2810(arg4, false, false);
            }
            if (var10 != null) {
                var11 = arg5.field3130 + -(var10.method468() - -1 >> 1);
                var12 = arg5.field3130 - -(1 + var10.method468() >> 1);
                if (var6 > var11) {
                    var6 = var11;
                }
                var13 = arg5.field3139 + -(var10.method467() + 1 >> 1);
                if (var12 > var7) {
                    var7 = var12;
                }
                var14 = arg5.field3139 - -(1 + var10.method467() >> 1);
                if (var8 > var13) {
                    var8 = var13;
                }
                if (var14 > var9) {
                    var9 = var14;
                }
            }
        }
        class294 var15 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        if (arg2.field6938 != null) {
            var15 = class128.method940(-2, arg2.field6929);
            if (var15 != null) {
                var16 = class269.field3996.method2601(class461.field6716, (int[]) null, (class127[]) null, arg2.field6938, 0);
                int var23 = arg5.field3139;
                if (var10 == null) {
                    var17 = var23 - var16 * var15.method1827() / 2;
                } else {
                    var17 = var23 - ((var10.method467() >> 1) - -(var15.method1828() * var16));
                }
                for (int var24 = 0; ~var16 < ~var24; ++var24) {
                    String var25 = class461.field6716[var24];
                    if (var16 + -1 > var24) {
                        var25 = var25.substring(0, -4 + var25.length());
                    }
                    int var26 = var15.method1830(var25);
                    if (var26 > var18) {
                        var18 = var26;
                    }
                }
                var19 = arg5.field3130 + arg0 + -(var18 / 2);
                if (~var19 > ~var6) {
                    var6 = var19;
                }
                var20 = var18 / 2 + arg5.field3130 + arg0;
                var21 = arg1 + var17;
                if (var20 > var7) {
                    var7 = var20;
                }
                var22 = var17 - (-(var15.method1828() * var16) - arg1);
                if (~var21 > ~var8) {
                    var8 = var21;
                }
                if (var9 < var22) {
                    var9 = var22;
                }
            }
        }
        if (~class137.field2046 >= ~var7 && ~var6 >= ~class137.field2052 && var9 >= class137.field2040 && ~var8 >= ~class137.field2042) {
            if (arg2.field6951 != null) {
                int[] var27 = new int[arg2.field6951.length];
                for (int var28 = 0; ~var28 > ~(var27.length / 2); ++var28) {
                    int var30 = arg2.field6951[var28 * 2] + arg5.field3134;
                    int var31 = arg2.field6951[var28 * 2 + 1] + arg5.field3132;
                    var27[var28 * 2] = class137.field2046 - -((-class137.field2046 + class137.field2052) * (-class137.field2033 + var30) / (-class137.field2033 + class137.field2045));
                    var27[var28 * 2 + 1] = -((class137.field2042 - class137.field2040) * (-class137.field2047 + var31) / (class137.field2043 - class137.field2047)) + class137.field2042;
                }
                class199.method1313(arg4, var27, arg2.field6930);
                for (int var29 = 0; var27.length / 2 + -1 > var29; ++var29) {
                    arg4.method93(var27[(var29 + 1) * 2], var27[var29 * 2], var27[var29 * 2 + 1], arg2.field6945, var27[(var29 - -1) * 2 + 1], arg3);
                }
                arg4.method93(var27[0], var27[var27.length + -2], var27[var27.length + -1], arg2.field6945, var27[1], arg3);
            }
            if (var10 != null) {
                if (class341.field5244 > 0 && (~class154.field2331 != 0 && ~class154.field2331 == ~arg5.field3137 || class14.field191 != -1 && class14.field191 == arg2.field6967)) {
                    int var32;
                    if (class197.field2888 <= 50) {
                        var32 = class197.field2888 * 2;
                    } else {
                        var32 = -(class197.field2888 * 2) + 200;
                    }
                    int var33 = var32 << 24 | 16776960;
                    arg4.method89(arg5.field3130, 7 + var10.method470() / 2, var33, arg5.field3139, (byte) -97);
                    arg4.method89(arg5.field3130, var10.method470() / 2 - -5, var33, arg5.field3139, (byte) -97);
                    arg4.method89(arg5.field3130, 3 + var10.method470() / 2, var33, arg5.field3139, (byte) -97);
                    arg4.method89(arg5.field3130, 1 + var10.method470() / 2, var33, arg5.field3139, (byte) -97);
                    arg4.method89(arg5.field3130, var10.method470() / 2, var33, arg5.field3139, (byte) -97);
                }
                var10.method936(arg5.field3130 + -(var10.method468() >> 1), arg5.field3139 + -(var10.method467() >> 1));
            }
            if (arg2.field6938 != null && var15 != null) {
                class122.method906(true, arg5, var15, var16, arg4, arg2, var17, var18);
            }
            if (arg2.field6937 != -1 || arg2.field6938 != null) {
                class174 var34 = new class174(arg5);
                var34.field2538 = var13;
                var34.field2537 = var14;
                var34.field2547 = var19;
                var34.field2544 = var20;
                var34.field2541 = var22;
                var34.field2535 = var21;
                var34.field2542 = var11;
                var34.field2539 = var12;
                class6.field59.method2958(var34, (byte) 68);
            }
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!pt", name = "<init>", descriptor = "(Lvd;Lbt;)V", line = 262)
    public class305(class258 arg0, class89 arg1) {
        super(arg0);
        this.field4568 = arg1;
        if (this.field4568.field1393 != null && super.field5646.field3734 && super.field5646.field3735) {
            class224 var3 = class154.method1112(1, 35633, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n", super.field5646);
            class224 var4 = class154.method1112(1, 35632, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = mix(surfaceColour, vec4(gl_Fog.color.rgb, 1.0), gl_FogFragCoord);\n}\n", super.field5646);
            this.field4556 = class145.method1056(new class224[] { var3, var4 }, super.field5646, true);
            this.field4560 = this.field4556 != null;
        }
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(II)V", line = 282)
    public static final void method1902(int arg0, int arg1) {
        ++field4559;
        int var2 = class86.field1350 - class163.field2431;
        if (~var2 <= -101) {
            class350.field5388 = 1;
        } else {
            int var3 = (int) class254.field3443;
            if (class196.field2881 >> 8 > var3) {
                var3 = class196.field2881 >> 8;
            }
            if (class233.field3277[4] && ~(class303.field4520[4] - -128) < ~var3) {
                var3 = class303.field4520[4] - -128;
            }
            if (arg0 < -25) {
                int var4 = (int) class311.field4836 + class80.field1096 & 16383;
                class277.method1736(class125.field1880, (var3 >> 3) * 3 + 600 << 0, -50 + class50.method373(class521.field7651, 14966, class410.field6198.field7671, class410.field6198.field7681), class295.field4416, (byte) -128, var4, var3, arg1);
                float var5 = 1.0F - (float) ((100 - var2) * (-var2 + 100) * (-var2 + 100)) / 1000000.0F;
                class393.field5897 = (int) ((float) (-class15.field202 + class393.field5897) * var5 + (float) class15.field202);
                class201.field2925 = (int) ((float) (-class98.field1512 + class201.field2925) * var5 + (float) class98.field1512);
                class350.field5383 = (int) ((float) (-class247.field3403 + class350.field5383) * var5 + (float) class247.field3403);
                class282.field4263 = (int) ((float) (-field4563 + class282.field4263) * var5 + (float) field4563);
                int var6 = -class264.field3943 + class431.field6396;
                if (var6 > 8192) {
                    var6 -= 16384;
                } else if (~var6 > 8191) {
                    var6 += 16384;
                }
                class431.field6396 = (int) ((float) var6 * var5 + (float) class264.field3943);
                class431.field6396 &= 16383;
            }
        }
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(III)V", line = 331)
    public final void method20(int arg0, int arg1, int arg2) {
        if (arg1 != -20857) {
            method1901(-73, 19, (class473) null, false, (class11) null, (class219) null);
        }
        ++field4557;
        if (this.field4562) {
            int var4 = 1 << (3 & arg0);
            float var5 = (float) (1 << ((arg0 & 61) >> 3)) / 32.0F;
            int var6 = 65535 & arg2;
            float var7 = (float) (3 & arg2 >> 16) / 8.0F;
            long var8 = this.field4556.field6796;
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "time"), (float) (super.field5646.field3703 * var4 % 40000) / 40000.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "scale"), var5);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterDepth"), (float) var6);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterOffset"), var7);
        }
    }

    @OriginalMember(owner = "client!pt", name = "c", descriptor = "(I)V", line = 360)
    public static void method1903(int arg0) {
        if (arg0 != -28925) {
            field4552 = null;
        }
        field4552 = null;
        field4553 = null;
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(ZLew;I)V", line = 379)
    public final void method18(boolean arg0, class271 arg1, int arg2) {
        if (arg0) {
            ++field4558;
            if (!this.field4562) {
                super.field5646.method1546(-2, arg1);
                super.field5646.method1582(arg2, true);
            }
        }
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(ZI)V", line = 395)
    public final void method19(boolean arg0, int arg1) {
        ++field4551;
        if (arg1 > -2) {
            method1901(56, 10, (class473) null, false, (class11) null, (class219) null);
        }
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(I)V", line = 410)
    public final void method24(int arg0) {
        if (arg0 > 74) {
            ++field4561;
            if (this.field4562) {
                super.field5646.method1553(1, -8156);
                super.field5646.method1546(-2, (class271) null);
                super.field5646.method1553(0, -8156);
                super.field5646.method1546(-2, (class271) null);
                OpenGL.glUseProgramObjectARB(0L);
                this.field4562 = false;
            }
        }
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(CB)Z", line = 444)
    public static final boolean method1904(char arg0, byte arg1) {
        ++field4567;
        if (arg1 < 108) {
            method1903(-48);
        }
        return arg0 >= '0' && arg0 <= '9';
    }
}
