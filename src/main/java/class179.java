import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gw")
public class class179 extends class675 {

    @OriginalMember(owner = "client!gw", name = "q", descriptor = "Z")
    private boolean field2720 = false;

    @OriginalMember(owner = "client!gw", name = "l", descriptor = "Z")
    private boolean field2715 = false;

    @OriginalMember(owner = "client!gw", name = "r", descriptor = "Lb;")
    private class350 field2721;

    @OriginalMember(owner = "client!gw", name = "c", descriptor = "Lgb;")
    private class223 field2706;

    @OriginalMember(owner = "client!gw", name = "h", descriptor = "Z")
    public static boolean field2711 = false;

    @OriginalMember(owner = "client!gw", name = "o", descriptor = "I")
    public static int field2718 = 0;

    @OriginalMember(owner = "client!gw", name = "b", descriptor = "I")
    public static int field2705;

    @OriginalMember(owner = "client!gw", name = "d", descriptor = "I")
    public static int field2707;

    @OriginalMember(owner = "client!gw", name = "f", descriptor = "I")
    public static int field2709;

    @OriginalMember(owner = "client!gw", name = "g", descriptor = "I")
    public static int field2710;

    @OriginalMember(owner = "client!gw", name = "j", descriptor = "I")
    public static int field2713;

    @OriginalMember(owner = "client!gw", name = "k", descriptor = "I")
    public static int field2714;

    @OriginalMember(owner = "client!gw", name = "m", descriptor = "I")
    public static int field2716;

    @OriginalMember(owner = "client!gw", name = "n", descriptor = "I")
    public static int field2717;

    @OriginalMember(owner = "client!gw", name = "p", descriptor = "I")
    public static int field2719;

    @OriginalMember(owner = "client!gw", name = "i", descriptor = "Lcb;")
    public static class544 field2712;

    @OriginalMember(owner = "client!gw", name = "e", descriptor = "[I")
    public static int[] field2708;

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(I)I")
    public static final int method1346(int arg0) {
        if (arg0 != -1) {
            return 119;
        } else {
            ++field2714;
            byte var1;
            if (~class511.field7306 > -97) {
                class34.method232((byte) -92, true);
                var1 = 1;
            } else {
                int var2 = class183.method1367(100);
                if (~var2 < -101) {
                    if (var2 <= 500) {
                        class566.method3293(true);
                        var1 = 3;
                    } else if (~var2 < -1001) {
                        var1 = 1;
                        class34.method232((byte) -84, true);
                    } else {
                        class478.method2814(0);
                        var1 = 2;
                    }
                } else {
                    var1 = 4;
                    class481.method2822(~arg0);
                }
            }
            if (class145.field1852.field9002.method2258((byte) -38) != 0) {
                class145.field1852.method3632(class145.field1852.field9016, true, 0);
                class226.method1559((byte) 125, false, 0);
            }
            class781.method4285(3);
            return var1;
        }
    }

    @OriginalMember(owner = "client!gw", name = "b", descriptor = "(B)Z")
    public final boolean method1347(byte arg0) {
        if (arg0 <= 105) {
            method1352(73, (class331) null, -56, (byte) 125, (class559) null);
        }
        ++field2705;
        return false;
    }

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(Lfia;IZ)V")
    public final void method1348(class599 arg0, int arg1, boolean arg2) {
        if (!arg2) {
            this.field2720 = true;
        }
        if (!this.field2715) {
            super.field9618.method1840(arg0, 2205);
            super.field9618.method1889(false, arg1);
        }
        ++field2719;
    }

    @OriginalMember(owner = "client!gw", name = "b", descriptor = "(I)V")
    public static void method1349(int arg0) {
        if (arg0 < -17) {
            field2712 = null;
            field2708 = null;
        }
    }

    @OriginalMember(owner = "client!gw", name = "<init>", descriptor = "(Lkv;Lb;)V")
    public class179(class280 arg0, class350 arg1) {
        super(arg0);
        this.field2721 = arg1;
        if (this.field2721.field5114 != null && super.field9618.field4246 && super.field9618.field4287) {
            class466 var3 = class535.method3097(35633, true, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n", super.field9618);
            class466 var4 = class535.method3097(35632, true, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 2.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n", super.field9618);
            this.field2706 = class435.method2606(new class466[] { var3, var4 }, super.field9618, false);
            this.field2720 = this.field2706 != null;
        }
    }

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(ZZ)V")
    public final void method1350(boolean arg0, boolean arg1) {
        ++field2713;
        if (arg1) {
            this.field2720 = true;
        }
    }

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(III)V")
    public final void method1351(int arg0, int arg1, int arg2) {
        ++field2717;
        if (arg1 != 8865) {
            this.field2706 = null;
        }
        if (this.field2715) {
            int var4 = 1 << (arg0 & 3);
            float var5 = (float) (1 << (7 & arg0 >> 3)) / 32.0F;
            int var6 = 65535 & arg2;
            float var7 = (float) ((arg2 & 240977) >> 16) / 8.0F;
            long var8 = this.field2706.field3200;
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "time"), (float) (super.field9618.field4167 * var4 % 40000) / 40000.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "scale"), var5);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterDepth"), (float) var6);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterOffset"), var7);
        }
    }

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(ILiw;IBLts;)V")
    public static final void method1352(int arg0, class331 arg1, int arg2, byte arg3, class559 arg4) {
        ++field2710;
        byte var5 = -1;
        if ((arg0 & 4096) != 0) {
            arg4.field6360 = arg1.method859(19560);
            arg4.field6406 = arg1.method877(-252);
            arg4.field6390 = arg1.method859(19560);
            arg4.field6389 = arg1.method877(-252);
            arg4.field6391 = arg1.method837(29806) - -class673.field9441;
            arg4.field6346 = arg1.method837(29806) - -class673.field9441;
            arg4.field6422 = arg1.method867(true);
            arg4.field6442 = 0;
            if (!arg4.field7943) {
                arg4.field6443 = 1;
                arg4.field6406 += arg4.field6445[0];
                arg4.field6389 += arg4.field6445[0];
                arg4.field6390 += arg4.field6448[0];
                arg4.field6360 += arg4.field6448[0];
            } else {
                arg4.field6390 += arg4.field7965;
                arg4.field6360 += arg4.field7965;
                arg4.field6406 += arg4.field7951;
                arg4.field6443 = 0;
                arg4.field6389 += arg4.field7951;
            }
        }
        if ((16 & arg0) != 0) {
            int var6 = arg1.method862(-25118);
            int var7 = arg1.method893((byte) -96);
            if (var6 == 65535) {
                var6 = -1;
            }
            int var8 = arg1.method846(15319);
            int var9 = var8 & 7;
            int var10 = (var8 & 127) >> 3;
            if (~var10 == -16) {
                var10 = -1;
            }
            arg4.method2705(0, var10, var6, var7, var9, -81);
        }
        if (~(16384 & arg0) != -1) {
            arg4.field7950 = arg1.method867(true) == 1;
        }
        if ((arg0 & 8) != 0) {
            int var11 = arg1.method883((byte) 127);
            if (~var11 == -65536) {
                var11 = -1;
            }
            arg4.field6343 = var11;
        }
        if ((arg0 & 1024) != 0) {
            var5 = arg1.method859(19560);
        }
        if ((32768 & arg0) != 0) {
            int var12 = arg1.method837(29806);
            arg4.field6394 = arg1.method846(15319);
            arg4.field6398 = arg1.method846(15319);
            arg4.field6428 = ~(var12 & 32768) != -1;
            arg4.field6413 = var12 & 32767;
            arg4.field6349 = class673.field9441 + arg4.field6413 + arg4.field6394;
        }
        if ((arg0 & 2) != 0) {
            int var13 = arg1.method855(0);
            byte[] var14 = new byte[var13];
            class120 var15 = new class120(var14);
            arg1.method850(255, 0, var13, var14);
            class698.field9864[arg2] = var15;
            arg4.method3248(true, var15);
        }
        if (~(arg0 & 4) != -1) {
            class89.field1152[arg2] = arg1.method882((byte) 81);
        }
        if (~(arg0 & 8192) != -1) {
            arg4.field6362 = arg1.method861(true);
            if (~arg4.field6362.charAt(0) == -127) {
                arg4.field6362 = arg4.field6362.substring(1);
                class422.method2520(2, 0, arg4.field6362, arg4.field7958, arg4.method3239(true, -110), -100, arg4.method3240(false, (byte) -49));
            } else if (class251.field3549 == arg4) {
                class422.method2520(2, 0, arg4.field6362, arg4.field7958, arg4.method3239(true, -19), -116, arg4.method3240(false, (byte) -49));
            }
            arg4.field6386 = 0;
            arg4.field6359 = 150;
            arg4.field6396 = 0;
        }
        if (~(arg0 & 1) != -1) {
            arg4.field7960 = arg1.method898((byte) -87);
            if (arg4.field6443 == 0) {
                arg4.method2690(arg4.field7960, true);
                arg4.field7960 = -1;
            }
        }
        if (~(arg0 & 512) != -1) {
            int var16 = arg1.method837(29806);
            if (~var16 == -65536) {
                var16 = -1;
            }
            int var17 = arg1.method893((byte) -114);
            int var18 = arg1.method842(2384);
            int var19 = var18 & 7;
            int var20 = (120 & var18) >> 3;
            if (var20 == 15) {
                var20 = -1;
            }
            arg4.method2705(1, var20, var16, var17, var19, -101);
        }
        if (~(524288 & arg0) != -1) {
            arg4.field6423 = arg1.method877(-252);
            arg4.field6385 = arg1.method859(19560);
            arg4.field6373 = arg1.method882((byte) 81);
            arg4.field6366 = (byte) arg1.method842(2384);
            arg4.field6368 = class673.field9441 - -arg1.method898((byte) -117);
            arg4.field6375 = class673.field9441 + arg1.method898((byte) -85);
        }
        if ((arg0 & 65536) != 0) {
            int var21 = arg1.method867(true);
            int[] var22 = new int[var21];
            int[] var23 = new int[var21];
            for (int var24 = 0; ~var21 < ~var24; ++var24) {
                int var25 = arg1.method883((byte) 118);
                if ((var25 & 49152) != 49152) {
                    var22[var24] = var25;
                } else {
                    int var26 = arg1.method862(-25118);
                    var22[var24] = class281.method1904(var25 << 16, var26);
                }
                var23[var24] = arg1.method898((byte) -87);
            }
            arg4.method2702(var22, var23, (byte) -64);
        }
        if ((131072 & arg0) != 0) {
            int var27 = arg1.method883((byte) 112);
            if (~var27 == -65536) {
                var27 = -1;
            }
            int var28 = arg1.method873(2);
            int var29 = arg1.method842(2384);
            int var30 = 7 & var29;
            int var31 = var29 >> 3 & 15;
            if (var31 == 15) {
                var31 = -1;
            }
            arg4.method2705(2, var31, var27, var28, var30, -65);
        }
        if (~(64 & arg0) != -1) {
            int[] var32 = new int[4];
            for (int var33 = 0; var33 < 4; ++var33) {
                var32[var33] = arg1.method883((byte) 121);
                if (~var32[var33] == -65536) {
                    var32[var33] = -1;
                }
            }
            int var34 = arg1.method855(0);
            class25.method193(var32, var34, 4891, arg4);
        }
        if (arg3 <= -13) {
            if ((128 & arg0) != 0) {
                int var35 = arg1.method855(0);
                if (~var35 < -1) {
                    for (int var36 = 0; ~var36 > ~var35; ++var36) {
                        int var37 = -1;
                        int var38 = -1;
                        int var39 = arg1.method890((byte) -59);
                        int var40 = -1;
                        if (~var39 != -32768) {
                            if (var39 != 32766) {
                                var38 = arg1.method890((byte) -59);
                            } else {
                                var39 = -1;
                            }
                        } else {
                            var39 = arg1.method890((byte) -59);
                            var38 = arg1.method890((byte) -59);
                            var37 = arg1.method890((byte) -59);
                            var40 = arg1.method890((byte) -59);
                        }
                        int var41 = arg1.method890((byte) -59);
                        int var42 = arg1.method867(true);
                        arg4.method2691(var38, var41, var40, var42, false, var37, var39, class673.field9441);
                    }
                }
            }
            if ((2048 & arg0) != 0) {
                int var43 = arg1.method846(15319);
                int[] var44 = new int[var43];
                int[] var45 = new int[var43];
                int[] var46 = new int[var43];
                for (int var47 = 0; var43 > var47; ++var47) {
                    int var48 = arg1.method862(-25118);
                    if (var48 == 65535) {
                        var48 = -1;
                    }
                    var44[var47] = var48;
                    var45[var47] = arg1.method846(15319);
                    var46[var47] = arg1.method862(-25118);
                }
                class247.method1664(0, var45, arg4, var44, var46);
            }
            if ((262144 & arg0) != 0) {
                arg4.field7948 = ~arg1.method855(0) == -2;
            }
            if (arg4.field7943) {
                if (~var5 == -128) {
                    arg4.method3246(arg4.field7965, 92160000, arg4.field7951);
                } else {
                    byte var49;
                    if (var5 == -1) {
                        var49 = class89.field1152[arg2];
                    } else {
                        var49 = var5;
                    }
                    class271.method1768(arg4, var49, false);
                    arg4.method3243(0, arg4.field7951, arg4.field7965, var49);
                }
            }
        }
    }

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(B)V")
    public final void method1353(byte arg0) {
        if (this.field2715) {
            super.field9618.method1825(1, 115);
            super.field9618.method1840((class599) null, 2205);
            super.field9618.method1825(0, arg0 ^ -84);
            super.field9618.method1840((class599) null, 2205);
            OpenGL.glUseProgramObjectARB(0L);
            this.field2715 = false;
        }
        if (arg0 != 52) {
            this.method1351(-109, 62, -60);
        }
        ++field2709;
    }

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(ZI)V")
    public final void method1354(boolean arg0, int arg1) {
        ++field2707;
        if (arg1 == -24765) {
            class314 var3 = super.field9618.method1848((byte) 121);
            if (this.field2720 && var3 != null) {
                super.field9618.method1825(1, -90);
                super.field9618.method1840(var3, 2205);
                super.field9618.method1825(0, -116);
                super.field9618.method1840(this.field2721.field5114, 2205);
                long var4 = this.field2706.field3200;
                OpenGL.glUseProgramObjectARB(var4);
                OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, "normalSampler"), 0);
                OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, "envMapSampler"), 1);
                OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var4, "sunDir"), -super.field9618.field4260[0], -super.field9618.field4260[1], -super.field9618.field4260[2]);
                OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var4, "sunColour"), super.field9618.field4232, super.field9618.field4220, super.field9618.field4203, 1.0F);
                OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var4, "sunExponent"), 96.0F + 928.0F * Math.abs(super.field9618.field4260[1]));
                this.field2715 = true;
            }
        }
    }

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(ZLkia;)V")
    public static final void method1355(boolean arg0, class645 arg1) {
        ++field2716;
        for (class315 var2 = (class315) class751.field10412.method2508((byte) -52); var2 != null; var2 = (class315) class751.field10412.method2505((byte) -55)) {
            if (var2.field4685 == arg1) {
                if (var2.field4688 != null) {
                    class229.field3307.method3439(var2.field4688);
                    var2.field4688 = null;
                }
                var2.method3117((byte) -17);
                return;
            }
        }
        if (arg0) {
            field2708 = null;
        }
    }
}
