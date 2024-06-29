import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public class class285 {

    @OriginalMember(owner = "client!vf", name = "g", descriptor = "Lck;")
    public static class119 field4711 = class298.method1987((byte) 86, " steht bereits auf Ihrer Ignorieren)2Liste(Q");

    @OriginalMember(owner = "client!vf", name = "e", descriptor = "Lck;")
    public static class119 field4709 = class298.method1987((byte) 32, ":chalreq:");

    @OriginalMember(owner = "client!vf", name = "l", descriptor = "Lck;")
    public static class119 field4716 = class298.method1987((byte) 72, "lila:");

    @OriginalMember(owner = "client!vf", name = "d", descriptor = "Lvk;")
    public static class67 field4708 = new class67(100);

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "D")
    public static double field4707;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "I")
    public static int field4705;

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "I")
    public static int field4706;

    @OriginalMember(owner = "client!vf", name = "f", descriptor = "I")
    public static int field4710;

    @OriginalMember(owner = "client!vf", name = "h", descriptor = "I")
    public static int field4712;

    @OriginalMember(owner = "client!vf", name = "j", descriptor = "I")
    public static int field4714;

    @OriginalMember(owner = "client!vf", name = "k", descriptor = "I")
    public static int field4715;

    @OriginalMember(owner = "client!vf", name = "m", descriptor = "I")
    public static int field4717;

    @OriginalMember(owner = "client!vf", name = "i", descriptor = "[I")
    public static int[] field4713;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(I)V", line = 4)
    public static void method1905(int arg0) {
        field4711 = null;
        field4716 = null;
        field4713 = null;
        field4708 = null;
        field4709 = null;
        if (arg0 != 2) {
            method1907(-27, -33, -69, -57, -122, -42, -121, -62, 67);
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(B)Z", line = 24)
    public static final boolean method1906(byte arg0) {
        field4710++;
        try {
            if (class126.field1947 == 2) {
                if (class64.field1010 == null) {
                    class64.field1010 = class130.method864(class207.field3298, class185.field2928, class249.field4022);
                    if (class64.field1010 == null) {
                        return false;
                    }
                }
                if (class182.field2889 == null) {
                    class182.field2889 = new class131(class249.field4018, class277.field4551);
                }
                if (class263.field4274.method1227(class182.field2889, class64.field1010, class86.field1306, (byte) -65, 22050)) {
                    class263.field4274.method1206(71);
                    class263.field4274.method1213(class262.field4256, -1940389913);
                    class263.field4274.method1230(class64.field1010, class14.field220, (byte) 76);
                    class126.field1947 = 0;
                    class207.field3298 = null;
                    class64.field1010 = null;
                    class182.field2889 = null;
                    return true;
                }
            }
        } catch (Exception var3) {
            var3.printStackTrace();
            class263.field4274.method1217(-24302);
            class207.field3298 = null;
            class182.field2889 = null;
            class64.field1010 = null;
            class126.field1947 = 0;
        }
        int var2 = -42 / ((5 - arg0) / 36);
        return false;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIIIIIIII)V", line = 72)
    public static final void method1907(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field4714++;
        if (arg7 < 102) {
            field4713 = (int[]) null;
        }
        int var9 = arg3 - arg2;
        int var10 = arg6 - arg8;
        int var11 = (arg5 - arg0 << 16) / var9;
        if (arg3 < class126.field1938) {
            var9++;
        }
        int var12 = (arg4 - arg1 << 16) / var10;
        if (class258.field4137 > arg6) {
            var10++;
        }
        for (int var13 = 0; var13 < var9; var13++) {
            int var14 = (var13 + 1) * var11 >> 16;
            int var15 = var11 * var13 >> 16;
            int var16 = var14 - var15;
            if (var16 > 0) {
                int var17 = arg0 + var15;
                int var18 = arg0 + var14;
                int var19 = var13 + arg2 >> 6;
                byte[][] var20 = class196.field3133[var19];
                int[][] var21 = class158.field2507[var19];
                byte[][] var22 = class236.field3796[var19];
                byte[][] var23 = class144.field2294[var19];
                byte[][] var24 = class39.field570[var19];
                byte[][] var25 = class283.field4674[var19];
                for (int var26 = 0; var26 < var10; var26++) {
                    int var27 = var12 * var26 >> 16;
                    int var28 = (var26 + 1) * var12 >> 16;
                    int var29 = var28 - var27;
                    if (var29 > 0) {
                        int var30 = arg1 + var28;
                        int var31 = arg8 + var26 >> 6;
                        int var32 = arg1 + var27;
                        int var33 = arg2 + var13 & 0x3F;
                        int var34 = arg8 + var26 & 0x3F;
                        int var35 = (var34 << 6) + var33;
                        int var38;
                        if (var21[var31] == null) {
                            int var36 = arg2 + var13 & 0x4;
                            int var37 = arg8 + var26 & 0x4;
                            if ((var36 >= 2 || var37 <= 2) && (var36 <= 2 || var37 >= 2)) {
                                var38 = field4713[class283.field4684 + 1];
                            } else {
                                var38 = 4936552;
                            }
                        } else {
                            var38 = var21[var31][var35];
                        }
                        if (var38 == 0) {
                            var38 = 1;
                        }
                        int var39 = var20[var31] == null ? 0 : field4713[var20[var31][var35] & 0xFF];
                        int var40 = var25[var31] == null ? 0 : field4713[var25[var31][var35] & 0xFF];
                        if (var39 == 0 && var40 == 0) {
                            class286.method1916(var17, var32, var16, var29, var38);
                        } else {
                            if (var39 != 0) {
                                if (var39 == -1) {
                                    var39 = 1;
                                }
                                byte var41 = var22[var31] == null ? 0 : var22[var31][var35];
                                int var42 = var41 & 0xFC;
                                if (var42 == 0 || var16 <= 1 || var29 <= 1) {
                                    class286.method1916(var17, var32, var16, var29, var39);
                                } else {
                                    class204.method1290(var41 & 0x3, class286.field4718, 119, var32, var16, var29, true, var39, var38, var17, var42 >> 2);
                                }
                            }
                            if (var40 != 0) {
                                if (var40 == -1) {
                                    var40 = var38;
                                }
                                byte var43 = var23[var31][var35];
                                int var44 = var43 & 0xFC;
                                if (var44 == 0 || var16 <= 1 || var29 <= 1) {
                                    class286.method1916(var17, var32, var16, var29, var40);
                                }
                                class204.method1290(var43 & 0x3, class286.field4718, -104, var32, var16, var29, var39 == 0, var40, 0, var17, var44 >> 2);
                            }
                        }
                        if (var24[var31] != null) {
                            int var45 = var24[var31][var35] & 0xFF;
                            if (var45 != 0) {
                                int var46;
                                if (var16 == 1) {
                                    var46 = var17;
                                } else {
                                    var46 = var18 - 1;
                                }
                                int var47;
                                if (var29 == 1) {
                                    var47 = var32;
                                } else {
                                    var47 = var30 - 1;
                                }
                                int var48 = 13421772;
                                if (var45 >= 5 && var45 <= 8 || var45 >= 13 && var45 <= 16 || var45 >= 21 && var45 <= 24 || var45 == 27 || var45 == 28) {
                                    var48 = 13369344;
                                    var45 -= 4;
                                }
                                if (var45 == 1) {
                                    class286.method1913(var17, var32, var29, var48);
                                } else if (var45 == 2) {
                                    class286.method1919(var17, var32, var16, var48);
                                } else if (var45 == 3) {
                                    class286.method1913(var46, var32, var29, var48);
                                } else if (var45 == 4) {
                                    class286.method1919(var17, var47, var16, var48);
                                } else if (var45 == 9) {
                                    class286.method1913(var17, var32, var29, 16777215);
                                    class286.method1919(var17, var32, var16, var48);
                                } else if (var45 == 10) {
                                    class286.method1913(var46, var32, var29, 16777215);
                                    class286.method1919(var17, var32, var16, var48);
                                } else if (var45 == 11) {
                                    class286.method1913(var46, var32, var29, 16777215);
                                    class286.method1919(var17, var47, var16, var48);
                                } else if (var45 == 12) {
                                    class286.method1913(var17, var32, var29, 16777215);
                                    class286.method1919(var17, var47, var16, var48);
                                } else if (var45 == 17) {
                                    class286.method1919(var17, var32, 1, var48);
                                } else if (var45 == 18) {
                                    class286.method1919(var46, var32, 1, var48);
                                } else if (var45 == 19) {
                                    class286.method1919(var46, var47, 1, var48);
                                } else if (var45 == 20) {
                                    class286.method1919(var17, var47, 1, var48);
                                } else if (var45 == 25) {
                                    for (int var49 = 0; var49 < var29; var49++) {
                                        class286.method1919(var17 + var49, -var49 + var47, 1, var48);
                                    }
                                } else if (var45 == 26) {
                                    for (int var50 = 0; var50 < var29; var50++) {
                                        class286.method1919(var17 + var50, var32 - -var50, 1, var48);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        for (int var51 = 0; var51 < var9; var51++) {
            int var52 = var11 * var51 >> 16;
            int var53 = (var51 + 1) * var11 >> 16;
            int var54 = var53 - var52;
            if (var54 > 0) {
                byte[][] var55 = class229.field3702[arg2 + var51 >> 6];
                int var56 = arg0 + var52;
                int var10000;
                for (int var57 = 0; var57 < var10; var57++) {
                    int var58 = var12 * var57 >> 16;
                    int var59 = (var57 + 1) * var12 >> 16;
                    int var60 = var59 - var58;
                    if (var60 > 0) {
                        var10000 = arg1 + var59;
                        int var62 = arg1 + var58;
                        int var63 = arg8 + var57 >> 6;
                        int var64 = ((arg8 + var57 & 0x3F) << 6) + (var51 + arg2 & 0x3F);
                        if (var55[var63] != null) {
                            int var65 = var55[var63][var64] & 0xFF;
                            if (var65 != 0) {
                                if (var65 == 47 || var65 == 53) {
                                    class134.field2162[var65 - 1].method244(var56, var62, var54 * 2 + 1, var60 * 2 + 1);
                                } else {
                                    class134.field2162[var65 - 1].method244(var56 - (var54 / 2), var62 - var60 / 2, var54 * 2, var60 * 2);
                                }
                            }
                        }
                    }
                }
                var10000 = arg0 + var53;
            }
        }
    }

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "(B)V", line = 404)
    public static final void method1908(byte arg0) {
        if (arg0 >= -105) {
            field4708 = (class67) null;
        }
        field4715++;
        class234.method1508((byte) 95);
        System.gc();
        class204.method1289(114, 25);
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIIIBILml;)V", line = 433)
    public static final void method1909(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, class134 arg6) {
        field4712++;
        int var7 = arg2 * arg2 + (arg3 * arg3);
        if (var7 > 360000) {
            return;
        }
        int var8 = Math.min(arg6.field2180 / 2, arg6.field2057 / 2);
        if (var8 * var8 >= var7) {
            class158.method1010(arg6, arg3, arg2, 2, arg5, class111.field1704[arg0], arg1);
        } else {
            var8 -= 10;
            int var9 = class42.field651 + class140.field2253 & 0x7FF;
            int var10 = class284.field4698[var9];
            int var11 = var10 * 256 / (class221.field3549 + 256);
            int var12 = class284.field4699[var9];
            int var13 = var12 * 256 / (class221.field3549 + 256);
            int var14 = arg3 * var13 - (arg2 * var11) >> 16;
            int var15 = arg2 * var13 + arg3 * var11 >> 16;
            double var16 = Math.atan2((double) var15, (double) var14);
            int var18 = (int) (Math.sin(var16) * (double) var8);
            int var19 = (int) ((double) var8 * Math.cos(var16));
            ((class160) class198.field3172[arg0]).method1022(240, 240, (arg1 + var18 + (arg6.field2180 / 2)) * 16, (arg6.field2057 / 2 + arg5 - var19) * 16, (int) (var16 * 10430.378D), 4096);
        }
        if (arg4 != -21) {
            method1909(-84, 110, -10, -123, (byte) 74, -90, (class134) null);
        }
    }
}
