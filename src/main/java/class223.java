import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class223 extends class147 {

    @OriginalMember(owner = "client!ld", name = "P", descriptor = "Lpe;")
    public class258 field4004;

    @OriginalMember(owner = "client!ld", name = "F", descriptor = "Lea;")
    public static class243 field3995 = new class243();

    @OriginalMember(owner = "client!ld", name = "N", descriptor = "I")
    public static int field4002 = 0;

    @OriginalMember(owner = "client!ld", name = "R", descriptor = "Lqj;")
    private static class196 field4006 = class80.method502("Unable to find ", -48);

    @OriginalMember(owner = "client!ld", name = "Q", descriptor = "Lqj;")
    public static class196 field4005 = class80.method502("::tele 0)1", -48);

    @OriginalMember(owner = "client!ld", name = "S", descriptor = "Lqj;")
    public static class196 field4007 = field4006;

    @OriginalMember(owner = "client!ld", name = "E", descriptor = "I")
    public static int field3994;

    @OriginalMember(owner = "client!ld", name = "G", descriptor = "I")
    public static int field3996;

    @OriginalMember(owner = "client!ld", name = "H", descriptor = "I")
    public static int field3997;

    @OriginalMember(owner = "client!ld", name = "I", descriptor = "I")
    public static int field3998;

    @OriginalMember(owner = "client!ld", name = "J", descriptor = "I")
    public static int field3999;

    @OriginalMember(owner = "client!ld", name = "K", descriptor = "I")
    public static int field4000;

    @OriginalMember(owner = "client!ld", name = "M", descriptor = "I")
    public static int field4001;

    @OriginalMember(owner = "client!ld", name = "O", descriptor = "I")
    public static int field4003;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(BII)I")
    public static final int method1508(byte arg0, int arg1, int arg2) {
        class249 var3 = (class249) class110.field1562.method1551(32768, (long) arg1);
        field3994++;
        if (var3 == null) {
            return 0;
        } else if (arg2 == -1) {
            return 0;
        } else {
            int var4 = 0;
            if (arg0 != -23) {
                method1510((byte) -122);
            }
            for (int var5 = 0; var5 < var3.field4411.length; var5++) {
                if (var3.field4406[var5] == arg2) {
                    var4 += var3.field4411[var5];
                }
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "(II)V")
    public static final void method1509(int arg0, int arg1) {
        class238.field4223.method1535(arg0, arg1 ^ 0x114B);
        if (arg1 != 26299) {
            field4005 = null;
        }
        field3997++;
    }

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "(B)V")
    public static final void method1510(byte arg0) {
        field3996++;
        class200.field3550.method1529(382);
        class246.field4381.method135(-107);
        if (arg0 != 39) {
            field3995 = null;
        }
        class236.field4201.method135(35);
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IB)Lkb;")
    public static final class25 method1511(int arg0, byte arg1) {
        class25 var2 = (class25) class182.field3209.method1537((long) arg0, false);
        field3999++;
        if (var2 != null) {
            return var2;
        }
        if (arg1 != -19) {
            method1509(102, 55);
        }
        byte[] var3 = class132.field1870.method842(1, (byte) -119, arg0);
        class25 var4 = new class25();
        if (var3 != null) {
            var4.method148(new class56(var3), arg0, (byte) -88);
        }
        class182.field3209.method1532(true, (long) arg0, var4);
        return var4;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(Lwc;Lbk;Lbk;I)V")
    public static final void method1512(class36 arg0, class136 arg1, class136 arg2, int arg3) {
        class3.field23 = arg2;
        class200.field3559 = arg1;
        field3998++;
        class33.field403 = arg0;
        if (arg3 != -29668) {
            field4003 = -95;
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(I[Lec;BIIIIIII)V")
    public static final void method1513(int arg0, class178[] arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field4000++;
        class55.method296(arg8, arg6, arg3, arg4);
        class15.method64();
        if (arg2 >= -80) {
            field4007 = null;
        }
        for (int var10 = 0; var10 < arg1.length; var10++) {
            class178 var11 = arg1[var10];
            if (var11 != null && (var11.field2990 == arg0 || arg0 == -1412584499 && class118.field1698 == var11)) {
                int var12;
                if (arg9 == -1) {
                    class138.field2122[class46.field555] = var11.field3042 + arg7;
                    class168.field2828[class46.field555] = var11.field3105 + arg5;
                    class29.field368[class46.field555] = var11.field3085;
                    class64.field886[class46.field555] = var11.field2997;
                    var12 = class46.field555++;
                } else {
                    var12 = arg9;
                }
                var11.field3138 = class171.field2879;
                var11.field3107 = var12;
                if (!var11.field3030 || !client.method618(var11)) {
                    if (var11.field3121 > 0) {
                        class137.method855(var11, 98);
                    }
                    int var13 = var11.field3042 + arg7;
                    int var14 = var11.field3105 + arg5;
                    int var15 = var11.field3119;
                    if (class236.field4195 && (client.method614(var11) != 0 || var11.field3123 == 0) && var15 > 127) {
                        var15 = 127;
                    }
                    if (class118.field1698 == var11) {
                        if (arg0 != -1412584499 && !var11.field3125) {
                            class245.field4362 = arg7;
                            class58.field791 = arg1;
                            class135.field1965 = arg5;
                            continue;
                        }
                        if (!var11.field3125) {
                            var15 = 128;
                        }
                        if (class193.field3402 && class238.field4226) {
                            int var16 = class52.field646;
                            int var17 = var16 - class67.field956;
                            if (var17 < class186.field3276) {
                                var17 = class186.field3276;
                            }
                            int var18 = class63.field869;
                            int var19 = var18 - class157.field2540;
                            if (class186.field3276 + class98.field1421.field3085 < var11.field3085 + var17) {
                                var17 = class186.field3276 + class98.field1421.field3085 - var11.field3085;
                            }
                            var13 = var17;
                            if (class202.field3599 > var19) {
                                var19 = class202.field3599;
                            }
                            if (class202.field3599 + class98.field1421.field2997 < var11.field2997 + var19) {
                                var19 = class98.field1421.field2997 + class202.field3599 - var11.field2997;
                            }
                            var14 = var19;
                        }
                    }
                    int var20;
                    int var21;
                    int var22;
                    int var23;
                    if (var11.field3123 == 2) {
                        var20 = arg6;
                        var21 = arg8;
                        var22 = arg3;
                        var23 = arg4;
                    } else {
                        var20 = var14 <= arg6 ? arg6 : var14;
                        int var24 = var11.field3085 + var13;
                        var21 = arg8 < var13 ? var13 : arg8;
                        int var25 = var14 + var11.field2997;
                        if (var11.field3123 == 9) {
                            var24++;
                            var25++;
                        }
                        var23 = arg4 > var25 ? var25 : arg4;
                        var22 = var24 < arg3 ? var24 : arg3;
                    }
                    if (!var11.field3030 || var21 < var22 && var20 < var23) {
                        if (var11.field3121 != 0) {
                            if (var11.field3121 == 1337) {
                                class60.field799 = var14;
                                class65.field917 = var13;
                                class130.field1845 = var11;
                                class135.method813(var11.field3085, var14, var11.field2997, var11.field3121 == 1403, var13, true);
                                class55.method296(arg8, arg6, arg3, arg4);
                                continue;
                            }
                            if (var11.field3121 == 1338) {
                                if (var11.method1163(-22503)) {
                                    class227.method1531(true, var12, var14, var11, var13);
                                    class55.method296(arg8, arg6, arg3, arg4);
                                }
                                continue;
                            }
                            if (var11.field3121 == 1339) {
                                if (var11.method1163(-22503)) {
                                    class243.method1661(false, var13, var11, var12, var14);
                                    class55.method296(arg8, arg6, arg3, arg4);
                                }
                                continue;
                            }
                            if (var11.field3121 == 1400) {
                                class48.method258(var11.field3085, 300, var11.field2997, var13, var14);
                                class161.field2588[var12] = true;
                                class86.field1271[var12] = true;
                                class55.method296(arg8, arg6, arg3, arg4);
                                continue;
                            }
                            if (var11.field3121 == 1401) {
                                class6.method23(var11.field2997, var13, var11.field3085, var14, (byte) 10);
                                class161.field2588[var12] = true;
                                class86.field1271[var12] = true;
                                class55.method296(arg8, arg6, arg3, arg4);
                                continue;
                            }
                            if (var11.field3121 == 1402) {
                                class134.method808(255, var13, var14);
                                class161.field2588[var12] = true;
                                class86.field1271[var12] = true;
                                continue;
                            }
                            if (var11.field3121 == 1404) {
                                class216.method1481(var11.field2997, class23.field292, var14, var13, var11, true, class76.field1097, var11.field3085);
                                class161.field2588[var12] = true;
                                class86.field1271[var12] = true;
                                continue;
                            }
                            if (var11.field3121 == 1405) {
                                if (class135.field1969) {
                                    int var26 = var11.field3085 + var13;
                                    int var27 = var14 + 15;
                                    class226.field4045.method1247(class93.method572(-90, new class196[] { class29.field363, class163.method1029(class44.field524, false) }), var26, var27, 16776960, -1);
                                    Runtime var28 = Runtime.getRuntime();
                                    int var109 = var27 + 15;
                                    int var29 = (int) ((var28.totalMemory() - var28.freeMemory()) / 1024L);
                                    int var30 = 16776960;
                                    if (var29 > 65536) {
                                        var30 = 16711680;
                                    }
                                    class226.field4045.method1247(class93.method572(-123, new class196[] { class31.field396, class163.method1029(var29, false), class53.field668 }), var26, var109, var30, -1);
                                    var27 = var109 + 15;
                                    class161.field2588[var12] = true;
                                    class86.field1271[var12] = true;
                                }
                                continue;
                            }
                        }
                        if (var11.field3123 == 0 && var11.field3129 && var21 <= class52.field646 && var20 <= class63.field869 && var22 > class52.field646 && class63.field869 < var23 && !class160.field2574 && !class236.field4195) {
                            class125.field1767 = 1;
                            class142.field2169[0] = 1002;
                            class65.field916[0] = class35.field428;
                            class52.field650[0] = class152.field2450;
                        }
                        int var31 = class63.field869;
                        int var32 = class52.field646;
                        if (!class160.field2574 && var32 >= var21 && var31 >= var20 && var22 > var32 && var31 < var23) {
                            class118.method723(var11, var31 - var14, var32 - var13, (byte) -116);
                        }
                        if (var11.field3123 == 0) {
                            if (!var11.field3030 && client.method618(var11) && class84.field1234 != var11) {
                                continue;
                            }
                            if (!var11.field3030) {
                                if (var11.field3056 - var11.field2997 < var11.field2998) {
                                    var11.field2998 = var11.field3056 - var11.field2997;
                                }
                                if (var11.field2998 < 0) {
                                    var11.field2998 = 0;
                                }
                            }
                            method1513(var11.field3117, arg1, (byte) -99, var22, var23, var14 - var11.field2998, var20, var13 - var11.field3088, var21, var12);
                            if (var11.field3087 != null) {
                                method1513(var11.field3117, var11.field3087, (byte) -125, var22, var23, var14 - var11.field2998, var20, var13 - var11.field3088, var21, var12);
                            }
                            class63 var33 = (class63) class101.field1445.method1551(32768, (long) var11.field3117);
                            if (var33 != null) {
                                if (var33.field875 == 0 && class52.field646 >= var21 && class63.field869 >= var20 && var22 > class52.field646 && class63.field869 < var23 && !class160.field2574 && !class236.field4195) {
                                    class65.field916[0] = class35.field428;
                                    class52.field650[0] = class152.field2450;
                                    class125.field1767 = 1;
                                    class142.field2169[0] = 1002;
                                }
                                class171.method1116(var20, var13, var21, var33.field864, var12, var23, var22, (byte) -65, var14);
                            }
                            class55.method296(arg8, arg6, arg3, arg4);
                            class15.method64();
                        }
                        if (class149.field2388[var12] || class138.field2132 > 1) {
                            if (var11.field3123 == 0 && !var11.field3030 && var11.field2997 < var11.field3056) {
                                class174.method1135(var14, var11.field3056, var11.field2998, true, var11.field3085 + var13, var11.field2997);
                            }
                            if (var11.field3123 != 1) {
                                if (var11.field3123 == 2) {
                                    int var34 = 0;
                                    for (int var35 = 0; var35 < var11.field3082; var35++) {
                                        for (int var36 = 0; var36 < var11.field2995; var36++) {
                                            int var37 = var13 + (var11.field3115 + 32) * var36;
                                            int var38 = (var11.field3100 + 32) * var35 + var14;
                                            if (var34 < 20) {
                                                var38 += var11.field3110[var34];
                                                var37 += var11.field3149[var34];
                                            }
                                            if (var11.field3045[var34] > 0) {
                                                boolean var39 = false;
                                                boolean var40 = false;
                                                int var41 = var11.field3045[var34] - 1;
                                                if (arg8 < var37 + 32 && arg3 > var37 && arg6 < var38 + 32 && arg4 > var38 || class76.field1101 == var11 && class43.field497 == var34) {
                                                    class43 var42;
                                                    if (class34.field416 == 1 && class104.field1512 == var34 && class127.field1799 == var11.field3117) {
                                                        var42 = class247.method1684(0, 2, var11.field3112, var11.field2989[var34], -128, var41);
                                                    } else {
                                                        var42 = class247.method1684(3153952, 1, var11.field3112, var11.field2989[var34], -127, var41);
                                                    }
                                                    if (class15.field174) {
                                                        class161.field2588[var12] = true;
                                                    }
                                                    if (var42 == null) {
                                                        class214.method1472(-64, var11);
                                                    } else if (class76.field1101 == var11 && class43.field497 == var34) {
                                                        int var43 = class63.field869 - class218.field3912;
                                                        int var44 = class52.field646 - class154.field2503;
                                                        if (var44 < 5 && var44 > -5) {
                                                            var44 = 0;
                                                        }
                                                        if (var43 < 5 && var43 > -5) {
                                                            var43 = 0;
                                                        }
                                                        if (client.field1462 < 5) {
                                                            var44 = 0;
                                                            var43 = 0;
                                                        }
                                                        var42.method225(var37 + var44, var38 + var43, 128);
                                                        if (arg0 != -1) {
                                                            class178 var45 = arg1[arg0 & 0xFFFF];
                                                            int var46 = class55.field685;
                                                            int var47 = class55.field684;
                                                            if (var47 > var38 + var43 && var45.field2998 > 0) {
                                                                int var48 = (var47 - var38 - var43) * class113.field1658 / 3;
                                                                if (var48 > class113.field1658 * 10) {
                                                                    var48 = class113.field1658 * 10;
                                                                }
                                                                if (var45.field2998 < var48) {
                                                                    var48 = var45.field2998;
                                                                }
                                                                var45.field2998 -= var48;
                                                                class218.field3912 += var48;
                                                                class214.method1472(69, var45);
                                                            }
                                                            if (var38 + var43 + 32 > var46 && var45.field3056 - var45.field2997 > var45.field2998) {
                                                                int var49 = (var38 + var43 + 32 - var46) * class113.field1658 / 3;
                                                                if (var49 > class113.field1658 * 10) {
                                                                    var49 = class113.field1658 * 10;
                                                                }
                                                                if (var49 > var45.field3056 - var45.field2998 - var45.field2997) {
                                                                    var49 = var45.field3056 - var45.field2997 - var45.field2998;
                                                                }
                                                                class218.field3912 -= var49;
                                                                var45.field2998 += var49;
                                                                class214.method1472(-80, var45);
                                                            }
                                                        }
                                                    } else if (class201.field3568 == var11 && class185.field3257 == var34) {
                                                        var42.method225(var37, var38, 128);
                                                    } else {
                                                        var42.method221(var37, var38);
                                                    }
                                                }
                                            } else if (var11.field3014 != null && var34 < 20) {
                                                class43 var50 = var11.method1161(var34, -1);
                                                if (var50 != null) {
                                                    var50.method221(var37, var38);
                                                } else if (class221.field3993) {
                                                    class214.method1472(-109, var11);
                                                }
                                            }
                                            var34++;
                                        }
                                    }
                                } else if (var11.field3123 == 3) {
                                    int var51;
                                    if (class6.method22(var11, (byte) -23)) {
                                        var51 = var11.field3008;
                                        if (class84.field1234 == var11 && var11.field3134 != 0) {
                                            var51 = var11.field3134;
                                        }
                                    } else {
                                        var51 = var11.field3009;
                                        if (class84.field1234 == var11 && var11.field3004 != 0) {
                                            var51 = var11.field3004;
                                        }
                                    }
                                    if (var15 == 0) {
                                        if (var11.field3089) {
                                            class55.method295(var13, var14, var11.field3085, var11.field2997, var51);
                                        } else {
                                            class55.method302(var13, var14, var11.field3085, var11.field2997, var51);
                                        }
                                    } else if (var11.field3089) {
                                        class55.method299(var13, var14, var11.field3085, var11.field2997, var51, 256 - (var15 & 0xFF));
                                    } else {
                                        class55.method282(var13, var14, var11.field3085, var11.field2997, var51, 256 - (var15 & 0xFF));
                                    }
                                } else if (var11.field3123 == 4) {
                                    class190 var52 = var11.method1165(0, class82.field1188);
                                    if (var52 != null) {
                                        class196 var53 = var11.field3046;
                                        int var54;
                                        if (class6.method22(var11, (byte) -23)) {
                                            var54 = var11.field3008;
                                            if (class84.field1234 == var11 && var11.field3134 != 0) {
                                                var54 = var11.field3134;
                                            }
                                            if (var11.field3153.method1299(37) > 0) {
                                                var53 = var11.field3153;
                                            }
                                        } else {
                                            var54 = var11.field3009;
                                            if (class84.field1234 == var11 && var11.field3004 != 0) {
                                                var54 = var11.field3004;
                                            }
                                        }
                                        if (var11.field3030 && var11.field3081 != -1) {
                                            class202 var55 = class178.method1154(false, var11.field3081);
                                            var53 = var55.field3613;
                                            if (var53 == null) {
                                                var53 = class174.field2932;
                                            }
                                            if ((var55.field3637 == 1 || var11.field3101 != 1) && var11.field3101 != -1) {
                                                var53 = class93.method572(-123, new class196[] { class7.field57, var53, class220.field3977, class143.method885(var11.field3101, 3) });
                                            }
                                        }
                                        if (class30.field387 == var11) {
                                            var54 = var11.field3009;
                                            var53 = class135.field1948;
                                        }
                                        if (!var11.field3030) {
                                            var53 = class104.method639(var11, (byte) 41, var53);
                                        }
                                        var52.method1259(var53, var13, var14, var11.field3085, var11.field2997, var54, var11.field3026 ? 0 : -1, var11.field3067, var11.field3083, var11.field3065);
                                    } else if (class221.field3993) {
                                        class214.method1472(115, var11);
                                    }
                                } else if (var11.field3123 == 5) {
                                    if (var11.field3030) {
                                        class43 var56;
                                        if (var11.field3081 == -1) {
                                            var56 = var11.method1158(false, 20706);
                                        } else {
                                            var56 = class247.method1684(var11.field3096, var11.field3064, var11.field3112, var11.field3101, -128, var11.field3081);
                                        }
                                        if (var56 != null) {
                                            int var57 = var56.field499;
                                            int var58 = var56.field489;
                                            if (var11.field3097) {
                                                int var60 = (var57 + var11.field3085 - 1) / var57;
                                                int var61 = (var11.field2997 + var58 - 1) / var58;
                                                class55.method286(var13, var14, var11.field3085 + var13, var11.field2997 + var14);
                                                for (int var62 = 0; var62 < var60; var62++) {
                                                    for (int var63 = 0; var63 < var61; var63++) {
                                                        if (var11.field3000 != 0) {
                                                            var56.method219((byte) -77, 4096, var11.field3000, var57 * var62 + var57 / 2 + var13, var58 * var63 + var58 / 2 + var14);
                                                        } else if (var15 == 0) {
                                                            var56.method221(var13 + var57 * var62, var58 * var63 + var14);
                                                        } else {
                                                            var56.method225(var57 * var62 + var13, var58 * var63 + var14, 256 - (var15 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class55.method296(arg8, arg6, arg3, arg4);
                                            } else {
                                                int var59 = var11.field3085 * 4096 / var57;
                                                if (var11.field3000 != 0) {
                                                    var56.method219((byte) -77, var59, var11.field3000, var11.field3085 / 2 + var13, var11.field2997 / 2 + var14);
                                                } else if (var15 != 0) {
                                                    var56.method227(var13, var14, var11.field3085, var11.field2997, 256 - (var15 & 0xFF));
                                                } else if (var11.field3085 == var57 && var11.field2997 == var58) {
                                                    var56.method221(var13, var14);
                                                } else {
                                                    var56.method224(var13, var14, var11.field3085, var11.field2997);
                                                }
                                            }
                                        } else if (class221.field3993) {
                                            class214.method1472(-74, var11);
                                        }
                                    } else {
                                        class43 var64 = var11.method1158(class6.method22(var11, (byte) -23), 20706);
                                        if (var64 != null) {
                                            var64.method221(var13, var14);
                                        } else if (class221.field3993) {
                                            class214.method1472(-61, var11);
                                        }
                                    }
                                } else if (var11.field3123 == 6) {
                                    class119 var65 = null;
                                    boolean var66 = class6.method22(var11, (byte) -23);
                                    int var67 = 0;
                                    int var68;
                                    if (var66) {
                                        var68 = var11.field3020;
                                    } else {
                                        var68 = var11.field3143;
                                    }
                                    if (var11.field3081 != -1) {
                                        class202 var69 = class178.method1154(false, var11.field3081);
                                        if (var69 != null) {
                                            class202 var70 = var69.method1362(false, var11.field3101);
                                            class149 var71 = var68 == -1 ? null : class116.method704(var68, -10304);
                                            var65 = var70.method1366(1, var71, var11.field3025, -50);
                                            if (var65 == null) {
                                                class214.method1472(-99, var11);
                                            } else {
                                                var67 = -var65.method266() / 2;
                                            }
                                        }
                                    } else if (var11.field3073 == 5) {
                                        if (var11.field3094 == -1) {
                                            var65 = class39.field439.method427(null, 1073741823, -1, null, -1);
                                        } else {
                                            int var73 = var11.field3094 & 0x7FF;
                                            if (class31.field395 == var73) {
                                                var73 = 2047;
                                            }
                                            class134 var74 = class247.field4397[var73];
                                            class149 var75 = var68 == -1 ? null : class116.method704(var68, -10304);
                                            if (var74 != null && (int) var74.field1924.method1330(0) << 11 == (var11.field3094 & 0xFFFFF800)) {
                                                var65 = var74.field1916.method427(null, 1073741823, 0, var75, var11.field3025);
                                            }
                                        }
                                    } else if (var68 == -1) {
                                        var65 = var11.method1157(-94, class102.field1477.field1916, var66, -1, null);
                                        if (var65 == null && class221.field3993) {
                                            class214.method1472(86, var11);
                                        }
                                    } else {
                                        class149 var72 = class116.method704(var68, -10304);
                                        var65 = var11.method1157(75, class102.field1477.field1916, var66, var11.field3025, var72);
                                        if (var65 == null && class221.field3993) {
                                            class214.method1472(75, var11);
                                        }
                                    }
                                    if (var65 != null) {
                                        int var76;
                                        if (var11.field3128 <= 0) {
                                            var76 = 256;
                                        } else {
                                            var76 = (var11.field3085 << 8) / var11.field3128;
                                        }
                                        int var77;
                                        if (var11.field3118 > 0) {
                                            var77 = (var11.field2997 << 8) / var11.field3118;
                                        } else {
                                            var77 = 256;
                                        }
                                        int var78 = var11.field3085 / 2 + var13 + (var11.field3031 * var76 >> 8);
                                        int var79 = (var11.field3136 * var77 >> 8) + var11.field2997 / 2 + var14;
                                        class15.method81(var78, var79);
                                        int var80 = class15.field170[var11.field3017] * var11.field3132 >> 16;
                                        int var81 = class15.field172[var11.field3017] * var11.field3132 >> 16;
                                        if (!var11.field3030) {
                                            var65.method736(0, var11.field3041, 0, var11.field3017, 0, var80, var81);
                                        } else if (var11.field3120) {
                                            ((class167) var65).method1083(0, var11.field3041, var11.field3135, var11.field3017, var11.field3103, var11.field3078 + var67 + var80, var11.field3078 + var81, var11.field3132);
                                        } else {
                                            var65.method736(0, var11.field3041, var11.field3135, var11.field3017, var11.field3103, var11.field3078 + var80 + var67, var11.field3078 + var81);
                                        }
                                        class15.method73();
                                    }
                                } else {
                                    if (var11.field3123 == 7) {
                                        class190 var82 = var11.method1165(0, class82.field1188);
                                        if (var82 == null) {
                                            if (class221.field3993) {
                                                class214.method1472(-55, var11);
                                            }
                                            continue;
                                        }
                                        int var83 = 0;
                                        for (int var84 = 0; var84 < var11.field3082; var84++) {
                                            for (int var85 = 0; var85 < var11.field2995; var85++) {
                                                if (var11.field3045[var83] > 0) {
                                                    class202 var86 = class178.method1154(false, var11.field3045[var83] - 1);
                                                    class196 var87;
                                                    if (var86.field3637 != 1 && var11.field2989[var83] == 1) {
                                                        var87 = class93.method572(-59, new class196[] { class7.field57, var86.field3613, class102.field1475 });
                                                    } else {
                                                        var87 = class93.method572(-124, new class196[] { class7.field57, var86.field3613, class220.field3977, class143.method885(var11.field2989[var83], 3) });
                                                    }
                                                    int var88 = (var11.field3100 + 12) * var84 + var14;
                                                    int var89 = (var11.field3115 + 115) * var85 + var13;
                                                    if (var11.field3067 == 0) {
                                                        var82.method1241(var87, var89, var88, var11.field3009, var11.field3026 ? 0 : -1);
                                                    } else if (var11.field3067 == 1) {
                                                        var82.method1249(var87, var89 + 57, var88, var11.field3009, var11.field3026 ? 0 : -1);
                                                    } else {
                                                        var82.method1247(var87, var89 + 115 - 1, var88, var11.field3009, var11.field3026 ? 0 : -1);
                                                    }
                                                }
                                                var83++;
                                            }
                                        }
                                    }
                                    if (var11.field3123 == 8 && class219.field3923 == var11 && class256.field4498 == class148.field2347) {
                                        int var90 = 0;
                                        int var91 = 0;
                                        class196 var92 = var11.field3046;
                                        class190 var93 = class226.field4045;
                                        class196 var94 = class104.method639(var11, (byte) 90, var92);
                                        while (var94.method1299(37) > 0) {
                                            int var102 = var94.method1333(class67.field954, 0);
                                            class196 var103;
                                            if (var102 == -1) {
                                                var103 = var94;
                                                var94 = class152.field2450;
                                            } else {
                                                var103 = var94.method1290(var102, 13324, 0);
                                                var94 = var94.method1296(var102 + 4, -1);
                                            }
                                            int var104 = var93.method1240(var103);
                                            if (var104 > var90) {
                                                var90 = var104;
                                            }
                                            var91 += var93.field3319 + 1;
                                        }
                                        var90 += 6;
                                        var91 += 7;
                                        int var95 = var11.field2997 + var14 + 5;
                                        if (arg4 < var91 + var95) {
                                            var95 = arg4 - var91;
                                        }
                                        int var96 = var11.field3085 + var13 - var90 - 5;
                                        if (var13 + 5 > var96) {
                                            var96 = var13 + 5;
                                        }
                                        if (arg3 < var90 + var96) {
                                            var96 = arg3 - var90;
                                        }
                                        class55.method295(var96, var95, var90, var91, 16777120);
                                        class55.method302(var96, var95, var90, var91, 0);
                                        int var97 = var93.field3319 + var95 + 2;
                                        class196 var98 = var11.field3046;
                                        class196 var99 = class104.method639(var11, (byte) 126, var98);
                                        while (var99.method1299(37) > 0) {
                                            int var100 = var99.method1333(class67.field954, 0);
                                            class196 var101;
                                            if (var100 == -1) {
                                                var101 = var99;
                                                var99 = class152.field2450;
                                            } else {
                                                var101 = var99.method1290(var100, 13324, 0);
                                                var99 = var99.method1296(var100 + 4, -1);
                                            }
                                            var93.method1241(var101, var96 + 3, var97, 0, -1);
                                            var97 += var93.field3319 + 1;
                                        }
                                    }
                                    if (var11.field3123 == 9) {
                                        int var105;
                                        int var106;
                                        int var107;
                                        int var108;
                                        if (var11.field3018) {
                                            var105 = var13;
                                            var106 = var14;
                                            var108 = var11.field2997 + var14;
                                            var107 = var11.field3085 + var13;
                                        } else {
                                            var105 = var13;
                                            var106 = var11.field2997 + var14;
                                            var107 = var11.field3085 + var13;
                                            var108 = var14;
                                        }
                                        if (var11.field3054 == 1) {
                                            class55.method303(var105, var108, var107, var106, var11.field3009);
                                        } else {
                                            class55.method300(var105, var108, var107, var106, var11.field3009, var11.field3054);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ld", name = "d", descriptor = "(I)V")
    public static void method1514(int arg0) {
        field4005 = null;
        field4007 = null;
        field4006 = null;
        field3995 = null;
        if (arg0 > -30) {
            field4005 = null;
        }
    }

    @OriginalMember(owner = "client!ld", name = "<init>", descriptor = "(Lpe;)V")
    public class223(class258 arg0) {
        this.field4004 = arg0;
    }
}
