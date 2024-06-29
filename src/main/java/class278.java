import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qt")
public class class278 extends class592 {

    @OriginalMember(owner = "client!qt", name = "i", descriptor = "Z")
    private boolean field3636 = false;

    @OriginalMember(owner = "client!qt", name = "s", descriptor = "Z")
    private boolean field3646 = false;

    @OriginalMember(owner = "client!qt", name = "h", descriptor = "Lpm;")
    private class553 field3635;

    @OriginalMember(owner = "client!qt", name = "l", descriptor = "Lhq;")
    private class47 field3639;

    @OriginalMember(owner = "client!qt", name = "r", descriptor = "Lra;")
    public static class361 field3645 = new class361(61, -2);

    @OriginalMember(owner = "client!qt", name = "u", descriptor = "Lnj;")
    public static class415 field3648 = new class415(65, 3);

    @OriginalMember(owner = "client!qt", name = "j", descriptor = "I")
    public static int field3637;

    @OriginalMember(owner = "client!qt", name = "k", descriptor = "I")
    public static int field3638;

    @OriginalMember(owner = "client!qt", name = "m", descriptor = "I")
    public static int field3640;

    @OriginalMember(owner = "client!qt", name = "n", descriptor = "I")
    public static int field3641;

    @OriginalMember(owner = "client!qt", name = "o", descriptor = "I")
    public static int field3642;

    @OriginalMember(owner = "client!qt", name = "p", descriptor = "I")
    public static int field3643;

    @OriginalMember(owner = "client!qt", name = "q", descriptor = "I")
    public static int field3644;

    @OriginalMember(owner = "client!qt", name = "t", descriptor = "Lpe;")
    public static class615 field3647;

    @OriginalMember(owner = "client!qt", name = "<init>", descriptor = "(Lji;Lpm;)V", line = 254)
    public class278(class622 arg0, class553 arg1) {
        super(arg0);
        this.field3635 = arg1;
        if (this.field3635.field7237 != null && super.field8014.field8625 && super.field8014.field8614) {
            class238 var3 = class648.method3566(35633, -127, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n", super.field8014);
            class238 var4 = class648.method3566(35632, -127, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = mix(surfaceColour, vec4(gl_Fog.color.rgb, 1.0), gl_FogFragCoord);\n}\n", super.field8014);
            this.field3639 = class149.method1098(new class238[] { var3, var4 }, super.field8014, (byte) 25);
            this.field3636 = this.field3639 != null;
        }
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(IZ)V", line = 9)
    public final void method32(int arg0, boolean arg1) {
        ++field3644;
        if (arg0 == -1) {
            class660 var3 = super.field8014.method3447((byte) 109);
            if (this.field3636 && var3 != null) {
                super.field8014.method3469(1, false);
                super.field8014.method3388(var3, false);
                super.field8014.method3469(0, false);
                super.field8014.method3388(this.field3635.field7237, false);
                long var4 = this.field3639.field667;
                OpenGL.glUseProgramObjectARB(var4);
                OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, "normalSampler"), 0);
                OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, "envMapSampler"), 1);
                OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var4, "sunDir"), -super.field8014.field8645[0], -super.field8014.field8645[1], -super.field8014.field8645[2]);
                OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var4, "sunColour"), super.field8014.field8616, super.field8014.field8646, super.field8014.field8661, 1.0F);
                OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var4, "sunExponent"), Math.abs(super.field8014.field8645[1]) * 928.0F + 96.0F);
                this.field3646 = true;
            }
        }
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(ZB)V", line = 39)
    public final void method27(boolean arg0, byte arg1) {
        ++field3643;
        if (arg1 > -67) {
            method1681(-27, 116, -18, -33, true, (byte) 102);
        }
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(IIIIZB)V", line = 49)
    public static final void method1681(int arg0, int arg1, int arg2, int arg3, boolean arg4, byte arg5) {
        ++field3638;
        if (class483.field6438 == null) {
            class520.field6799.method400(-16777216, arg0, arg2, (byte) 38, arg1, arg3);
        } else if (~class233.field3130.field506 <= -1 && ~class233.field3130.field506 > ~(class611.field8258 * 512) && class233.field3130.field503 >= 0 && class233.field3130.field503 < class656.field9155 * 512) {
            ++class413.field5318;
            if (class233.field3130 != null && ~(class233.field3130.field506 + -(256 * (class233.field3130.method1265(91) - 1)) >> 9) == ~class199.field2598 && ~(class233.field3130.field503 - -256 - class233.field3130.method1265(114) * 256 >> 9) == ~class247.field3310) {
                class199.field2598 = -1;
                class247.field3310 = -1;
                class669.method3665(15);
            }
            class530.method2822(84);
            if (!arg4) {
                class691.method3765(-8211);
            }
            class171.method1162(-1);
            class472.method2615(15993, arg3, true, arg2, arg1, arg0);
            int var6 = class483.field6434;
            int var7 = class40.field568;
            int var8 = class509.field6672;
            int var9 = class376.field4814;
            if (~class704.field9810 != -2) {
                if (class704.field9810 != 4) {
                    if (~class704.field9810 == -6) {
                        class492.method2689(-84, var7);
                    }
                } else {
                    int var10 = (int) class710.field9918;
                    if (class194.field2539 >> 8 > var10) {
                        var10 = class194.field2539 >> 8;
                    }
                    if (class86.field1150[4] && ~var10 > ~(class288.field3722[4] + 128)) {
                        var10 = class288.field3722[4] + 128;
                    }
                    int var11 = (int) class141.field1859 & 16383;
                    class311.method1811(class332.method1916(1218445319, class509.field6669, class390.field4991, class425.field5518) - 200, class473.field6168, var7, var10, (var10 >> 3) * 3 + 600 << 2, var11, 127, class219.field2880);
                }
            } else {
                int var12 = (int) class710.field9918;
                if (var12 < class194.field2539 >> 8) {
                    var12 = class194.field2539 >> 8;
                }
                if (class86.field1150[4] && ~(class288.field3722[4] + 128) < ~var12) {
                    var12 = class288.field3722[4] - -128;
                }
                int var13 = (int) class141.field1859 + class611.field8257 & 16383;
                class311.method1811(-200 + class332.method1916(1218445319, class233.field3130.field503, class390.field4991, class233.field3130.field506), class473.field6168, var7, var12, 600 - -((var12 >> 3) * 3) << 2, var13, 124, class219.field2880);
            }
            int var14 = class499.field6555;
            int var15 = class655.field9120;
            int var16 = class549.field7132;
            int var17 = class299.field3911;
            int var18 = class358.field4639;
            for (int var19 = 0; var19 < 5; ++var19) {
                if (class86.field1150[var19]) {
                    int var23 = (int) ((double) (class522.field6812[var19] * 2 - -1) * Math.random() - (double) class522.field6812[var19] + Math.sin((double) class388.field4969[var19] / 100.0D * (double) class433.field5583[var19]) * (double) class288.field3722[var19]);
                    if (~var19 == -1) {
                        class499.field6555 += var23 << 2;
                    }
                    if (~var19 == -5) {
                        class299.field3911 += var23;
                        if (~class299.field3911 <= -1025) {
                            if (class299.field3911 > 3072) {
                                class299.field3911 = 3072;
                            }
                        } else {
                            class299.field3911 = 1024;
                        }
                    }
                    if (var19 == 1) {
                        class655.field9120 += var23 << 2;
                    }
                    if (var19 == 2) {
                        class549.field7132 += var23 << 2;
                    }
                    if (~var19 == -4) {
                        class358.field4639 = 16383 & class358.field4639 + var23;
                    }
                }
            }
            if (class499.field6555 < 0) {
                class499.field6555 = 0;
            }
            if (~((class590.field8010 << 9) - 1) > ~class499.field6555) {
                class499.field6555 = (class590.field8010 << 9) + -1;
            }
            if (~class549.field7132 > -1) {
                class549.field7132 = 0;
            }
            if (class549.field7132 > (class151.field1933 << 9) + -1) {
                class549.field7132 = (class151.field1933 << 9) - 1;
            }
            class566.method3025((byte) 3);
            class126.method922(true);
            class520.field6799.method376(var6, var8, var6 + var9, var8 - -var7);
            class520.field6799.method205();
            int var20 = class407.field5182;
            int var21 = -28 / ((-47 - arg5) / 60);
            if (class625.field8743 != null) {
                class625.field8743.method2618(class299.field3911, class221.field2897 << 3, class358.field4639, var8, (byte) -55, var6, class520.field6799, var9, var20, var7);
            } else {
                class520.field6799.method162(var20);
            }
            class424.method2439(26);
            class355.field4580.method144(class499.field6555, class655.field9120, class549.field7132, -class299.field3911 & 16383, 16383 & -class358.field4639, -class470.field6146 & 16383);
            class520.field6799.method342(class355.field4580);
            class520.field6799.method393(var9 / 2 + var6, var7 / 2 + var8, class213.field2749 << 1, class213.field2749 << 1);
            class553.method2965(var9 / 2 + var6, class213.field2749 << 1, 608, var8 - -(var7 / 2), class213.field2749 << 1);
            class103.method777(4846, 16383 & -class299.field3911, class499.field6555, 16383 & -class358.field4639, -class470.field6146 & 16383, class549.field7132, class655.field9120);
            byte var22 = class260.field3509.method1579(class364.field4697, true) == 2 ? (byte) class413.field5318 : 1;
            class454.method2559(class520.field6799, class424.field5503, class695.field9491, class355.field4580, class499.field6555, class655.field9120, class549.field7132, class605.field8192, class625.field8742, class505.field6644, class457.field5991, class354.field4578, class37.field544, class233.field3130.field508 + 1, var22, class233.field3130.field506 >> 9, class233.field3130.field503 >> 9, !class260.field3509.field1282);
            class424.method2439(26);
            if (class566.field7391 == 10) {
                class489.method2679(117, var7, var8, var6, 256, var9, 256);
                class487.method2675(256, var9, 256, var8, 4, var6, var7);
                class134.method977(var6, 256, 96, var9, var8, var7, 256);
                class689.method3757(var9, var6, 100, var7, var8);
            }
            class370.method2130();
            class499.field6555 = var14;
            class358.field4639 = var18;
            class549.field7132 = var16;
            class299.field3911 = var17;
            class655.field9120 = var15;
            if (class421.field5443 && class448.field5870.method3596((byte) 112) == 0) {
                class421.field5443 = false;
            }
            if (class421.field5443) {
                class520.field6799.method400(-16777216, var6, var7, (byte) 38, var9, var8);
                class542.method2877(false, class604.field8136.method3280((byte) 99, class144.field1890), class520.field6799, class562.field7337, class401.field5111, true);
            }
        } else {
            class520.field6799.method400(-16777216, arg0, arg2, (byte) 49, arg1, arg3);
        }
    }

    @OriginalMember(owner = "client!qt", name = "b", descriptor = "(B)Z", line = 243)
    public final boolean method30(byte arg0) {
        if (arg0 > -90) {
            this.method35(34, -76, (class710) null);
        }
        ++field3641;
        return false;
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(I)V", line = 272)
    public final void method29(int arg0) {
        ++field3637;
        if (arg0 != -1640) {
            this.method35(-45, -121, (class710) null);
        }
        if (this.field3646) {
            super.field8014.method3469(1, false);
            super.field8014.method3388((class710) null, false);
            super.field8014.method3469(0, false);
            super.field8014.method3388((class710) null, false);
            OpenGL.glUseProgramObjectARB(0L);
            this.field3646 = false;
        }
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(ZII)V", line = 294)
    public final void method33(boolean arg0, int arg1, int arg2) {
        if (arg0) {
            this.field3639 = null;
        }
        if (this.field3646) {
            int var4 = 1 << (arg1 & 3);
            float var5 = (float) (1 << (arg1 >> 3 & 7)) / 32.0F;
            int var6 = 65535 & arg2;
            float var7 = (float) ((223127 & arg2) >> 16) / 8.0F;
            long var8 = this.field3639.field667;
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "time"), (float) (super.field8014.field8566 * var4 % 40000) / 40000.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "scale"), var5);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterDepth"), (float) var6);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterOffset"), var7);
        }
        ++field3640;
    }

    @OriginalMember(owner = "client!qt", name = "c", descriptor = "(B)V", line = 328)
    public static void method1682(byte arg0) {
        field3645 = null;
        field3647 = null;
        field3648 = null;
        if (arg0 >= -102) {
            field3648 = null;
        }
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(IILgq;)V", line = 342)
    public final void method35(int arg0, int arg1, class710 arg2) {
        if (!this.field3646) {
            super.field8014.method3388(arg2, false);
            super.field8014.method3443(arg0, true);
        }
        if (arg1 != 458752) {
            method1682((byte) -51);
        }
        ++field3642;
    }
}
