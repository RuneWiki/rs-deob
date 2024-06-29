import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vl")
public class class302 extends class118 {

    @OriginalMember(owner = "client!vl", name = "t", descriptor = "Lkm;")
    private class120 field4424;

    @OriginalMember(owner = "client!vl", name = "o", descriptor = "Lmo;")
    private class336 field4419;

    @OriginalMember(owner = "client!vl", name = "s", descriptor = "Lnj;")
    public static class487 field4423 = new class487("Loaded JAGDX", "JAGDX geladen", "JAGDX chargé", "JAGDX carregado");

    @OriginalMember(owner = "client!vl", name = "h", descriptor = "I")
    public static int field4412;

    @OriginalMember(owner = "client!vl", name = "j", descriptor = "I")
    public static int field4414;

    @OriginalMember(owner = "client!vl", name = "k", descriptor = "I")
    public static int field4415;

    @OriginalMember(owner = "client!vl", name = "l", descriptor = "I")
    public static int field4416;

    @OriginalMember(owner = "client!vl", name = "m", descriptor = "I")
    public static int field4417;

    @OriginalMember(owner = "client!vl", name = "n", descriptor = "I")
    public static int field4418;

    @OriginalMember(owner = "client!vl", name = "p", descriptor = "I")
    public static int field4420;

    @OriginalMember(owner = "client!vl", name = "q", descriptor = "I")
    public static int field4421;

    @OriginalMember(owner = "client!vl", name = "r", descriptor = "I")
    public static int field4422;

    @OriginalMember(owner = "client!vl", name = "i", descriptor = "Lni;")
    private class630 field4413;

    // $FF: synthetic field
    @OriginalMember(owner = "client!vl", name = "u", descriptor = "Ljava/lang/Class;")
    public static Class field4425;

    // $FF: synthetic method
    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method1870(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(Lbaa;IB)V", line = 6)
    public final void method440(class541 arg0, int arg1, byte arg2) {
        if (arg2 >= -17) {
            this.method442(false, (byte) -125);
        }
        ++field4412;
    }

    @OriginalMember(owner = "client!vl", name = "<init>", descriptor = "(Los;Lkm;)V", line = 18)
    public class302(class468 arg0, class120 arg1) {
        super(arg0);
        this.field4424 = arg1;
        this.method1868((byte) 0);
        this.field4419 = new class336(super.field1544, 6406, 2, new byte[] { 0, -1 }, 6406);
        this.field4419.method2098(false, -1209865776);
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(ILdda;)V", line = 30)
    public static final void method1866(int arg0, class597 arg1) {
        class94.field1171 = arg1.method3478(-1, "p11_full");
        ++field4420;
        class297.field4346 = arg1.method3478(-1, "p12_full");
        if (arg0 >= -88) {
            method1867((byte) -83);
        }
        class264.field3927 = arg1.method3478(-1, "b12_full");
        class580.field8546 = arg1.method3478(-1, "hitmarks");
        class56.field691 = arg1.method3478(-1, "hitbar_default");
        class216.field3203 = arg1.method3478(-1, "timerbar_default");
        class68.field781 = arg1.method3478(-1, "headicons_pk");
        class103.field1305 = arg1.method3478(-1, "headicons_prayer");
        class586.field8705 = arg1.method3478(-1, "hint_headicons");
        class105.field1323 = arg1.method3478(-1, "hint_mapmarkers");
        class636.field9268 = arg1.method3478(-1, "mapflag");
        class605.field8908 = arg1.method3478(-1, "cross");
        class346.field5039 = arg1.method3478(-1, "mapdots");
        class49.field576 = arg1.method3478(-1, "scrollbar");
        class161.field2159 = arg1.method3478(-1, "name_icons");
        class264.field3928 = arg1.method3478(-1, "floorshadows");
        class549.field8185 = arg1.method3478(-1, "compass");
        class453.field6624 = arg1.method3478(-1, "otherlevel");
        class345.field5026 = arg1.method3478(-1, "hint_mapedge");
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(I)V", line = 59)
    public final void method441(int arg0) {
        this.field4413.method3670('\u0001', false);
        ++field4416;
        int var2 = -111 / ((-58 - arg0) / 41);
        if (~super.field1544.field7086 < -1) {
            super.field1544.method2842(1, (byte) 42);
            super.field1544.method2811((class541) null, -2);
            super.field1544.method2790(0.0F, 1.0F, 11327);
            super.field1544.method2842(0, (byte) 42);
        }
        super.field1544.method2852(8448, (byte) 49, 8448);
        OpenGL.glMatrixMode(5890);
        OpenGL.glPopMatrix();
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(IBI)V", line = 82)
    public final void method445(int arg0, byte arg1, int arg2) {
        if ((1 & arg0) != 1) {
            if (this.field4424.field1555) {
                super.field1544.method2811(this.field4424.field1559, -2);
                class110.field1404[0] = 0.0F;
                class110.field1404[1] = 0.0F;
                class110.field1404[3] = 0.0F;
                class110.field1404[2] = 0.0F;
                OpenGL.glTexGenfv(8194, 9473, class110.field1404, 0);
            } else {
                super.field1544.method2811(this.field4424.field1556[0], arg1 ^ -23);
            }
        } else if (this.field4424.field1555) {
            super.field1544.method2811(this.field4424.field1559, -2);
            class110.field1404[0] = 0.0F;
            class110.field1404[3] = (float) (super.field1544.field6961 % 4000) / 4000.0F;
            class110.field1404[2] = 0.0F;
            class110.field1404[1] = 0.0F;
            OpenGL.glTexGenfv(8194, 9473, class110.field1404, 0);
        } else {
            int var4 = super.field1544.field6961 % 4000 * 16 / 4000;
            super.field1544.method2811(this.field4424.field1556[var4], arg1 + -25);
        }
        ++field4421;
        if (arg1 != 23) {
            method1867((byte) 117);
        }
    }

    @OriginalMember(owner = "client!vl", name = "c", descriptor = "(B)V", line = 129)
    public static void method1867(byte arg0) {
        field4423 = null;
        if (arg0 != -104) {
            method1867((byte) 74);
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(ZB)V", line = 139)
    public final void method442(boolean arg0, byte arg1) {
        ++field4415;
        if (arg1 >= -101) {
            this.method445(96, (byte) 22, 84);
        }
        if (~super.field1544.field7086 < -1) {
            float var3 = -0.5F / (float) super.field1544.field7086;
            super.field1544.method2842(1, (byte) 42);
            class110.field1404[2] = var3;
            class110.field1404[3] = super.field1544.field6987 * var3 + 0.25F;
            class110.field1404[0] = 0.0F;
            class110.field1404[1] = 0.0F;
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glTexGenfv(8192, 9474, class110.field1404, 0);
            OpenGL.glPopMatrix();
            super.field1544.method2790((float) super.field1544.field7086, 0.5F, 11327);
            super.field1544.method2811(this.field4419, -2);
            super.field1544.method2842(0, (byte) 42);
        }
        this.field4413.method3670('\u0000', false);
        OpenGL.glMatrixMode(5890);
        OpenGL.glPushMatrix();
        OpenGL.glScalef(0.25F, 0.25F, 1.0F);
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!vl", name = "d", descriptor = "(B)V", line = 176)
    private final void method1868(byte arg0) {
        this.field4413 = new class630(super.field1544, 2);
        ++field4414;
        this.field4413.method3673(0, -1);
        super.field1544.method2842(1, (byte) 42);
        super.field1544.method2852(7681, (byte) 32, 260);
        super.field1544.method2801(false, 34168, 0, 768);
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glEnable(3168);
        super.field1544.method2842(0, (byte) 42);
        OpenGL.glTexEnvf(8960, 34163, 2.0F);
        if (this.field4424.field1555) {
            OpenGL.glTexGeni(8194, 9472, 9217);
            OpenGL.glTexGeni(8195, 9472, 9217);
            OpenGL.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
            OpenGL.glEnable(3170);
            OpenGL.glEnable(3171);
        }
        this.field4413.method3674(true);
        if (arg0 != 0) {
            this.field4419 = null;
        }
        this.field4413.method3673(1, -1);
        super.field1544.method2842(1, (byte) 42);
        super.field1544.method2852(8448, (byte) 91, 8448);
        super.field1544.method2801(false, 5890, 0, 768);
        OpenGL.glDisable(3168);
        super.field1544.method2842(0, (byte) 42);
        OpenGL.glTexEnvf(8960, 34163, 1.0F);
        if (this.field4424.field1555) {
            OpenGL.glDisable(3170);
            OpenGL.glDisable(3171);
        }
        this.field4413.method3674(true);
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(ILqa;B)Z", line = 220)
    public static final boolean method1869(int arg0, class167 arg1, byte arg2) {
        ++field4422;
        int var3 = (class35.field399 + -104) / 2;
        int var4 = (class382.field5586 + -104) / 2;
        boolean var5 = true;
        for (int var6 = var3; ~(var3 + 104) < ~var6; ++var6) {
            for (int var57 = var4; var4 - -104 > var57; ++var57) {
                for (int var58 = arg0; var58 <= 3; ++var58) {
                    if (class169.method1076(var6, var58, var57, -15708, arg0)) {
                        int var59 = var58;
                        if (class300.method1855(var6, var57, 22753)) {
                            var59 = var58 - 1;
                        }
                        if (~var59 <= -1) {
                            var5 &= class546.method3207(var57, (byte) 127, var6, var59);
                        }
                    }
                }
            }
        }
        if (!var5) {
            return false;
        } else {
            int[] var7 = new int[262144];
            for (int var8 = 0; ~var7.length < ~var8; ++var8) {
                var7[var8] = -16777216;
            }
            class293.field4302 = arg1.method982(var7, 0, 512, 512, 512);
            class425.method2514((byte) -127);
            int var9 = -16777216 | 238 - -((int) (Math.random() * 20.0D)) - 10 + ((-10 + 238 + (int) (20.0D * Math.random()) << 16) - -(-10 + (int) (20.0D * Math.random()) + 238 << 8));
            int var10 = (-1482948864 | -10 + (238 - -((int) (Math.random() * 20.0D)))) << 16;
            if (arg2 != 52) {
                method1869(118, (class167) null, (byte) 4);
            }
            int var11 = (int) (8.0D * Math.random()) << 8 | (int) (8.0D * Math.random()) << 16 | (int) (8.0D * Math.random());
            boolean[][] var12 = new boolean[class392.field5702 - -1][class392.field5702 + 1];
            for (int var13 = var3; var13 < var3 - -104; var13 += class392.field5702) {
                for (int var36 = var4; ~var36 > ~(var4 + 104); var36 += class392.field5702) {
                    int var37 = 0;
                    int var38 = 0;
                    int var39 = var13;
                    if (var13 > 0) {
                        var37 += 4;
                        var39 = var13 - 1;
                    }
                    int var40 = var36;
                    if (var36 > 0) {
                        var40 = var36 - 1;
                    }
                    int var41 = class392.field5702 + var13;
                    if (var41 < 104) {
                        ++var41;
                    }
                    int var42 = class392.field5702 + var36;
                    if (~var42 > -105) {
                        ++var42;
                        var38 += 4;
                    }
                    arg1.method1022(0, 0, class392.field5702 * 4 + var37, class392.field5702 * 4 + var38);
                    arg1.method321(-16777216);
                    for (int var43 = arg0; var43 <= 3; ++var43) {
                        for (int var50 = 0; class392.field5702 >= var50; ++var50) {
                            for (int var56 = 0; var56 <= class392.field5702; ++var56) {
                                var12[var50][var56] = class169.method1076(var39 - -var50, var43, var40 + var56, class342.method2119(arg2, -15728), arg0);
                            }
                        }
                        class562.field8337[var43].method1324(0, 0, 1024, var39, var40, var41, var42, var12);
                        if (!class442.field6457) {
                            for (int var51 = -4; class392.field5702 > var51; ++var51) {
                                for (int var52 = -4; class392.field5702 > var52; ++var52) {
                                    int var53 = var13 + var51;
                                    int var54 = var36 + var52;
                                    if (~var53 <= ~var3 && ~var4 >= ~var54 && class169.method1076(var53, var43, var54, -15708, arg0)) {
                                        int var55 = var43;
                                        if (class300.method1855(var53, var54, 22753)) {
                                            var55 = var43 - 1;
                                        }
                                        if (var55 >= 0) {
                                            class16.method74(var54, var9, 3, (-var52 + class392.field5702) * 4 + var38 + -4, var51 * 4 + var37, var10, var55, var53, arg1);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (class442.field6457) {
                        class82 var44 = class67.field772[arg0];
                        for (int var45 = 0; class392.field5702 > var45; ++var45) {
                            for (int var46 = 0; ~class392.field5702 < ~var46; ++var46) {
                                int var47 = var13 + var45;
                                int var48 = var36 + var46;
                                int var49 = var44.field948[-var44.field943 + var47][-var44.field957 + var48];
                                if (~(1076101120 & var49) == -1) {
                                    if ((8388608 & var49) == 0) {
                                        if ((var49 & 33554432) != 0) {
                                            arg1.method1069(4, -1713569622, (-var46 + class392.field5702) * 4 + (var38 - 4), var45 * 4 + 3 + var37, 1);
                                        } else if ((var49 & 134217728) != 0) {
                                            arg1.method1068(1, -1713569622, (-var46 + class392.field5702) * 4 + var38 + -4 - -3, var45 * 4 + var37, 4);
                                        } else if ((536870912 & var49) != 0) {
                                            arg1.method1069(4, -1713569622, (-var46 + class392.field5702) * 4 + -4 + var38, var37 - -(var45 * 4), arg2 + -51);
                                        }
                                    } else {
                                        arg1.method1068(arg2 + -51, -1713569622, (-var46 + class392.field5702) * 4 + var38 - 4, var37 - -(var45 * 4), 4);
                                    }
                                } else {
                                    arg1.method1066((byte) 110, var38 - (-((class392.field5702 - var46) * 4) + 4), -1713569622, var45 * 4 + var37, 4, 4);
                                }
                            }
                        }
                    }
                    arg1.method980(var37, var38, class392.field5702 * 4, class392.field5702 * 4, var11, 2);
                    class293.field4302.method231((var13 - var3) * 4 + 48, 464 - (-var4 + var36) * 4 + -(class392.field5702 * 4), class392.field5702 * 4, class392.field5702 * 4, var37, var38);
                }
            }
            arg1.method985();
            arg1.method321(-16777215);
            class539.method3164(-89);
            class461.field6669 = 0;
            class88.field1128.method2499(arg2 + -52);
            if (!class442.field6457) {
                for (int var14 = var3; var3 + 104 > var14; ++var14) {
                    for (int var20 = var4; var20 < var4 + 104; ++var20) {
                        for (int var21 = arg0; ~var21 >= ~(arg0 - -1) && ~var21 >= -4; ++var21) {
                            if (class169.method1076(var14, var21, var20, -15708, arg0)) {
                                class438 var22 = (class438) class287.method1784(var21, var14, var20);
                                if (var22 == null) {
                                    var22 = (class438) class488.method2956(var21, var14, var20, field4425 != null ? field4425 : (field4425 = method1870("ej")));
                                }
                                if (var22 == null) {
                                    var22 = (class438) class491.method2972(var21, var14, var20);
                                }
                                if (var22 == null) {
                                    var22 = (class438) class427.method2549(var21, var14, var20);
                                }
                                if (var22 != null) {
                                    class158 var23 = class312.field4690.method2004(false, var22.method173(78));
                                    if (!var23.field2054 || class306.field4467) {
                                        int var24 = var23.field2021;
                                        if (var23.field2035 != null) {
                                            for (int var25 = 0; var23.field2035.length > var25; ++var25) {
                                                if (~var23.field2035[var25] != 0) {
                                                    class158 var26 = class312.field4690.method2004(false, var23.field2035[var25]);
                                                    if (var26.field2021 >= 0) {
                                                        var24 = var26.field2021;
                                                    }
                                                }
                                            }
                                        }
                                        if (var24 >= 0) {
                                            boolean var27 = false;
                                            if (var24 >= 0) {
                                                class42 var28 = class540.field8011.method1213(var24, 6);
                                                if (var28 != null && var28.field499) {
                                                    var27 = true;
                                                }
                                            }
                                            int var29 = var14;
                                            int var30 = var20;
                                            if (var27) {
                                                int[][] var31 = class67.field772[var21].field948;
                                                int var32 = class67.field772[var21].field943;
                                                int var33 = class67.field772[var21].field957;
                                                for (int var34 = 0; ~var34 > -11; ++var34) {
                                                    int var35 = (int) (Math.random() * 4.0D);
                                                    if (~var35 == -1 && var29 > var3 && ~var29 < ~(var14 + -3) && (2883848 & var31[-var32 + var29 - 1][-var33 + var30]) == 0) {
                                                        --var29;
                                                    }
                                                    if (var35 == 1 && ~var29 > ~(var3 + 104 + -1) && ~var29 > ~(var14 + 3) && (var31[var29 - -1 + -var32][var30 - var33] & 2883968) == 0) {
                                                        ++var29;
                                                    }
                                                    if (~var35 == -3 && ~var30 < ~var4 && var30 > var20 + -3 && (var31[-var32 + var29][-var33 + var30 + -1] & 2883842) == 0) {
                                                        --var30;
                                                    }
                                                    if (~var35 == -4 && var4 + -1 + 104 > var30 && ~var30 > ~(var20 + 3) && ~(var31[-var32 + var29][var30 + 1 - var33] & 2883872) == -1) {
                                                        ++var30;
                                                    }
                                                }
                                            }
                                            class419.field6023[class461.field6669] = var23.field2010;
                                            class336.field4941[class461.field6669] = var29;
                                            class162.field2161[class461.field6669] = var30;
                                            ++class461.field6669;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                if (class517.field7688 != null) {
                    class635.field9258.field8794 = 1;
                    class540.field8011.method1217(1024, 64, arg2 ^ -66);
                    for (int var15 = 0; ~class517.field7688.field2896 < ~var15; ++var15) {
                        int var16 = class517.field7688.field2901[var15];
                        if (var16 >> 28 == class239.field3493.field3457) {
                            int var17 = ((var16 & 268423727) >> 14) + -class584.field8677;
                            int var18 = (var16 & 16383) + -class424.field6061;
                            if (~var17 <= -1 && ~var17 > ~class35.field399 && var18 >= 0 && var18 < class382.field5586) {
                                class88.field1128.method2492(new class269(var15), (byte) -122);
                            } else {
                                class42 var19 = class540.field8011.method1213(class517.field7688.field2898[var15], 6);
                                if (var19.field477 != null && var19.field497 + var17 >= 0 && ~(var19.field479 + var17) > ~class35.field399 && var18 - -var19.field506 >= 0 && ~(var19.field508 + var18) > ~class382.field5586) {
                                    class88.field1128.method2492(new class269(var15), (byte) 81);
                                }
                            }
                        }
                    }
                    class540.field8011.method1217(128, 64, -128);
                    class635.field9258.field8794 = 2;
                    class635.field9258.method3488(false);
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(BZ)V", line = 669)
    public final void method439(byte arg0, boolean arg1) {
        super.field1544.method2852(260, (byte) 124, 8448);
        ++field4418;
        if (arg0 != 56) {
            field4423 = null;
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(B)Z", line = 680)
    public final boolean method446(byte arg0) {
        ++field4417;
        return arg0 != 29 ? true : true;
    }
}
