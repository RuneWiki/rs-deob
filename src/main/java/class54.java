import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class54 {

    @OriginalMember(owner = "client!fc", name = "f", descriptor = "Lrd;")
    private static class173 field1080 = class133.method843("Your account has been disabled)3", 46);

    @OriginalMember(owner = "client!fc", name = "d", descriptor = "Lrd;")
    private static class173 field1078 = class133.method843("Too many incorrect logins from your address)3", 111);

    @OriginalMember(owner = "client!fc", name = "i", descriptor = "Lrd;")
    public static class173 field1083 = field1080;

    @OriginalMember(owner = "client!fc", name = "h", descriptor = "Lrd;")
    private static class173 field1082 = class133.method843(" is already on your ignore list)3", -79);

    @OriginalMember(owner = "client!fc", name = "g", descriptor = "Lrd;")
    public static class173 field1081 = field1082;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "Lrd;")
    public static class173 field1075 = field1078;

    @OriginalMember(owner = "client!fc", name = "k", descriptor = "[Z")
    public static boolean[] field1085 = new boolean[5];

    @OriginalMember(owner = "client!fc", name = "j", descriptor = "Lrd;")
    public static class173 field1084 = class133.method843("und haben es deaktiviert)3 Klicken Sie auf der", 106);

    @OriginalMember(owner = "client!fc", name = "n", descriptor = "Lrd;")
    private static class173 field1088 = class133.method843("Please enter your password)3", 81);

    @OriginalMember(owner = "client!fc", name = "p", descriptor = "I")
    public static int field1090 = 0;

    @OriginalMember(owner = "client!fc", name = "m", descriptor = "Lrd;")
    public static class173 field1087 = field1088;

    @OriginalMember(owner = "client!fc", name = "r", descriptor = "Lrd;")
    public static class173 field1092 = class133.method843("runes", 19);

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "I")
    public static int field1076;

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "I")
    public static int field1077;

    @OriginalMember(owner = "client!fc", name = "l", descriptor = "I")
    public static int field1086;

    @OriginalMember(owner = "client!fc", name = "o", descriptor = "I")
    public static int field1089;

    @OriginalMember(owner = "client!fc", name = "q", descriptor = "La;")
    public static class1 field1091;

    @OriginalMember(owner = "client!fc", name = "e", descriptor = "[I")
    public static int[] field1079;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(I)V")
    public static void method352(int arg0) {
        field1081 = null;
        field1085 = null;
        field1087 = null;
        field1088 = null;
        field1084 = null;
        if (arg0 != -1) {
            method353(85, 7, 114, -91, -33, -80, 100, 127);
        }
        field1091 = null;
        field1092 = null;
        field1082 = null;
        field1080 = null;
        field1075 = null;
        field1078 = null;
        field1083 = null;
        field1079 = null;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method353(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1076++;
        int var8 = arg0;
        int var9 = 0;
        int var10 = 0;
        int var11 = arg0 - arg2;
        int var12 = arg0 * arg0;
        int var13 = arg5 - arg2;
        int var14 = arg5 * arg5;
        int var15 = var13 * var13;
        int var16 = var11 * var11;
        int var17 = var12 << 1;
        int var18 = var14 << 1;
        int var19 = var16 << 1;
        int var20 = var15 << 1;
        int var21 = arg0 << 1;
        int var22 = (1 - var21) * var14 + var17;
        int var23 = var11 << 1;
        int var24 = (1 - var23) * var15 + var19;
        int var25 = var16 - (var23 - 1) * var20;
        int var26 = var12 - (var21 - 1) * var18;
        int var27 = var14 << 2;
        int var28 = var12 << 2;
        int var29 = var15 << 2;
        int var30 = var16 << 2;
        int var31 = var17 * 3;
        int var32 = (var21 - 3) * var18;
        int var33 = var19 * 3;
        int var34 = (var23 - 3) * var20;
        int var35 = var28;
        int var36 = (arg0 + arg1) * var27;
        int var37 = var30;
        int var38 = (var11 - 1) * var29;
        if (class37.field790 <= arg7 && arg7 <= class20.field445) {
            int[] var39 = class107.field1998[arg7];
            int var40 = class68.method421(arg3 - arg5, class194.field3778, 102, class96.field1766);
            int var41 = class68.method421(arg3 + arg5, class194.field3778, -104, class96.field1766);
            int var42 = class68.method421(arg3 - var13, class194.field3778, arg1 ^ 0xFFFFFFB9, class96.field1766);
            int var43 = class68.method421(arg3 + var13, class194.field3778, -82, class96.field1766);
            class51.method350(var40, arg4, (byte) -127, var39, var42);
            class51.method350(var42, arg6, (byte) -121, var39, var43);
            class51.method350(var43, arg4, (byte) -122, var39, var41);
        }
        while (var8 > 0) {
            boolean var44 = var8 <= var11;
            if (var22 < 0) {
                while (var22 < 0) {
                    var9++;
                    var26 += var35;
                    var22 += var31;
                    var31 += var28;
                    var35 += var28;
                }
            }
            if (var26 < 0) {
                var9++;
                var26 += var35;
                var35 += var28;
                var22 += var31;
                var31 += var28;
            }
            if (var44) {
                if (var24 < 0) {
                    while (var24 < 0) {
                        var10++;
                        var25 += var37;
                        var24 += var33;
                        var33 += var30;
                        var37 += var30;
                    }
                }
                if (var25 < 0) {
                    var25 += var37;
                    var37 += var30;
                    var24 += var33;
                    var10++;
                    var33 += var30;
                }
                var24 += -var38;
                var38 -= var29;
                var25 += -var34;
                var34 -= var29;
            }
            var22 += -var36;
            var26 += -var32;
            var36 -= var27;
            var32 -= var27;
            var8--;
            int var45 = arg7 + var8;
            int var46 = arg7 - var8;
            if (class37.field790 <= var45 && var46 <= class20.field445) {
                int var47 = class68.method421(arg3 + var9, class194.field3778, 48, class96.field1766);
                int var48 = class68.method421(arg3 - var9, class194.field3778, -110, class96.field1766);
                if (var44) {
                    int var49 = class68.method421(arg3 + var10, class194.field3778, -86, class96.field1766);
                    int var50 = class68.method421(arg3 - var10, class194.field3778, 84, class96.field1766);
                    if (class37.field790 <= var46) {
                        int[] var51 = class107.field1998[var46];
                        class51.method350(var48, arg4, (byte) -119, var51, var50);
                        class51.method350(var50, arg6, (byte) -118, var51, var49);
                        class51.method350(var49, arg4, (byte) -119, var51, var47);
                    }
                    if (var45 <= class20.field445) {
                        int[] var52 = class107.field1998[var45];
                        class51.method350(var48, arg4, (byte) -126, var52, var50);
                        class51.method350(var50, arg6, (byte) -127, var52, var49);
                        class51.method350(var49, arg4, (byte) -125, var52, var47);
                    }
                } else {
                    if (class37.field790 <= var46) {
                        class51.method350(var48, arg4, (byte) -119, class107.field1998[var46], var47);
                    }
                    if (var45 <= class20.field445) {
                        class51.method350(var48, arg4, (byte) -128, class107.field1998[var45], var47);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(B)V")
    public static final void method354(byte arg0) {
        field1077++;
        try {
            if (class140.field2612 == 0) {
                if (class34.field738 != null) {
                    class34.field738.method1095((byte) 126);
                    class34.field738 = null;
                }
                class158.field2960 = false;
                class120.field2214 = null;
                class140.field2612 = 1;
                class42.field871 = 0;
            }
            if (class140.field2612 == 1) {
                if (class120.field2214 == null) {
                    class120.field2214 = class64.field1264.method833(class67.field1296, (byte) -109, class51.field1046);
                }
                if (class120.field2214.field4254 == 2) {
                    throw new IOException();
                }
                if (class120.field2214.field4254 == 1) {
                    class34.field738 = new class170((Socket) class120.field2214.field4256, class64.field1264);
                    class140.field2612 = 2;
                    class120.field2214 = null;
                }
            }
            if (class140.field2612 == 2) {
                long var1 = class37.field791 = class87.field1686.method1132(arg0 + 117);
                class165.field3175.field2222 = 0;
                class165.field3175.method752(14, (byte) -128);
                int var3 = (int) (var1 >> 16 & 0x1FL);
                class165.field3175.method752(var3, (byte) -128);
                class34.field738.method1097(0, class165.field3175.field2218, 2, (byte) -84);
                class140.field2612 = 3;
                class70.field1358.field2222 = 0;
            }
            if (class140.field2612 == 3) {
                if (class140.field2604 != null) {
                    class140.field2604.method489((byte) 3);
                }
                if (class60.field1199 != null) {
                    class60.field1199.method489((byte) 3);
                }
                int var4 = class34.field738.method1096(-31883);
                if (class140.field2604 != null) {
                    class140.field2604.method489((byte) 3);
                }
                if (class60.field1199 != null) {
                    class60.field1199.method489((byte) 3);
                }
                if (var4 != 0) {
                    class188.method1262(var4, (byte) 119);
                    return;
                }
                class70.field1358.field2222 = 0;
                class140.field2612 = 4;
            }
            if (class140.field2612 == 4) {
                if (class70.field1358.field2222 < 8) {
                    int var5 = class34.field738.method1094(0);
                    if (8 - class70.field1358.field2222 < var5) {
                        var5 = 8 - class70.field1358.field2222;
                    }
                    if (var5 > 0) {
                        class34.field738.method1093(var5, class70.field1358.field2222, (byte) -5, class70.field1358.field2218);
                        class70.field1358.field2222 += var5;
                    }
                }
                if (class70.field1358.field2222 == 8) {
                    class70.field1358.field2222 = 0;
                    class177.field3487 = class70.field1358.method759(true);
                    class140.field2612 = 5;
                }
            }
            if (arg0 != -5) {
                field1090 = -92;
            }
            if (class140.field2612 == 5) {
                class165.field3175.field2222 = 0;
                int[] var6 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (class177.field3487 >> 32), (int) class177.field3487 };
                class165.field3175.method752(10, (byte) -128);
                class165.field3175.method775(arg0 ^ 0xD457022B, var6[0]);
                class165.field3175.method775(732495312, var6[1]);
                class165.field3175.method775(732495312, var6[2]);
                class165.field3175.method775(732495312, var6[3]);
                class165.field3175.method756(class87.field1686.method1132(101), 101);
                class165.field3175.method774(false, class87.field1699);
                class165.field3175.method763(class24.field512, false, class75.field1482);
                class3.field28.field2222 = 0;
                if (class24.field525 == 40) {
                    class3.field28.method752(18, (byte) -128);
                } else {
                    class3.field28.method752(16, (byte) -128);
                }
                class3.field28.method752(class165.field3175.field2222 + class78.method475(class59.field1166, (byte) 86) + 125, (byte) -128);
                class3.field28.method775(arg0 ^ 0xD457022B, 489);
                class3.field28.method752(class107.field2003 ? 1 : 0, (byte) -128);
                class173.method1137(-121, class3.field28);
                class3.field28.method774(false, class59.field1166);
                class3.field28.method775(732495312, class164.field3034);
                class3.field28.method775(arg0 ^ 0xD457022B, class175.field3444.field301);
                class3.field28.method775(arg0 ^ 0xD457022B, class179.field3522.field301);
                class3.field28.method775(732495312, class40.field830.field301);
                class3.field28.method775(arg0 + 732495317, class160.field2982.field301);
                class3.field28.method775(732495312, class74.field1444.field301);
                class3.field28.method775(732495312, class111.field2054.field301);
                class3.field28.method775(732495312, class114.field2106.field301);
                class3.field28.method775(732495312, class143.field2683.field301);
                class3.field28.method775(arg0 + 732495317, class145.field2700.field301);
                class3.field28.method775(arg0 + 732495317, class93.field1747.field301);
                class3.field28.method775(arg0 ^ 0xD457022B, class187.field3659.field301);
                class3.field28.method775(732495312, class116.field2151.field301);
                class3.field28.method775(732495312, field1091.field301);
                class3.field28.method775(732495312, class58.field1152.field301);
                class3.field28.method775(732495312, class8.field156.field301);
                class3.field28.method775(732495312, class184.field3610.field301);
                class3.field28.method775(732495312, class108.field2016.field301);
                class3.field28.method775(732495312, class140.field2605.field301);
                class3.field28.method775(732495312, class38.field805.field301);
                class3.field28.method775(arg0 + 732495317, class84.field1672.field301);
                class3.field28.method775(arg0 + 732495317, class15.field347.field301);
                class3.field28.method775(arg0 ^ 0xD457022B, class159.field2976.field301);
                class3.field28.method775(732495312, class182.field3584.field301);
                class3.field28.method738(class165.field3175.field2222, class165.field3175.field2218, 0, (byte) -47);
                class34.field738.method1097(0, class3.field28.field2218, class3.field28.field2222, (byte) -84);
                class165.field3175.method1021(var6, (byte) -2);
                for (int var7 = 0; var7 < 4; var7++) {
                    var6[var7] += 50;
                }
                class70.field1358.method1021(var6, (byte) -2);
                class140.field2612 = 6;
            }
            if (class140.field2612 == 6 && class34.field738.method1094(0) > 0) {
                int var8 = class34.field738.method1096(-31883);
                if (var8 == 21 && class24.field525 == 20) {
                    class140.field2612 = 7;
                } else if (var8 == 2) {
                    class140.field2612 = 9;
                } else if (var8 == 15 && class24.field525 == 40) {
                    class68.method422(-1354);
                    return;
                } else if (var8 == 23 && field1090 < 1) {
                    field1090++;
                    class140.field2612 = 0;
                } else {
                    class188.method1262(var8, (byte) 124);
                    return;
                }
            }
            if (class140.field2612 == 7 && class34.field738.method1094(arg0 + 5) > 0) {
                class19.field387 = class34.field738.method1096(-31883) * 60 + 180;
                class140.field2612 = 8;
            }
            if (class140.field2612 == 8) {
                class42.field871 = 0;
                class47.method330(arg0 ^ 0xFFFFFF9A, class68.field1321, class173.method1158(arg0 + 2, new class173[] { class93.method588(class19.field387 / 60, true), class220.field4237 }), class58.field1149);
                if (--class19.field387 <= 0) {
                    class140.field2612 = 0;
                }
            } else {
                if (class140.field2612 == 9 && class34.field738.method1094(arg0 + 5) >= 9) {
                    class199.field3880 = class34.field738.method1096(-31883);
                    class147.field2793 = class34.field738.method1096(-31883);
                    class151.field2859 = class34.field738.method1096(-31883) == 1;
                    class33.field733 = class34.field738.method1096(-31883);
                    class33.field733 <<= 0x8;
                    class33.field733 += class34.field738.method1096(-31883);
                    class78.field1517 = class34.field738.method1096(arg0 - 31878);
                    class34.field738.method1093(1, 0, (byte) -5, class70.field1358.field2218);
                    class70.field1358.field2222 = 0;
                    class96.field1764 = class70.field1358.method1024((byte) 113);
                    class34.field738.method1093(2, 0, (byte) -5, class70.field1358.field2218);
                    class70.field1358.field2222 = 0;
                    class45.field919 = class70.field1358.method755((byte) -42);
                    class140.field2612 = 10;
                }
                if (class140.field2612 != 10) {
                    class42.field871++;
                    if (class42.field871 > 2000) {
                        if (field1090 < 1) {
                            class140.field2612 = 0;
                            field1090++;
                            if (class67.field1296 == class111.field2056) {
                                class67.field1296 = class25.field535;
                            } else {
                                class67.field1296 = class111.field2056;
                            }
                        } else {
                            class188.method1262(-3, (byte) 109);
                        }
                    }
                } else if (class34.field738.method1094(0) >= class45.field919) {
                    class70.field1358.field2222 = 0;
                    class34.field738.method1093(class45.field919, 0, (byte) -5, class70.field1358.field2218);
                    class111.method670(true);
                    class166.field3206 = -1;
                    class145.method913(4, false);
                    class96.field1764 = -1;
                }
            }
        } catch (IOException var9) {
            if (field1090 < 1) {
                class140.field2612 = 0;
                field1090++;
                if (class67.field1296 == class111.field2056) {
                    class67.field1296 = class25.field535;
                } else {
                    class67.field1296 = class111.field2056;
                }
            } else {
                class188.method1262(-2, (byte) 115);
            }
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(ILmb;)Lme;")
    public static final class124 method355(int arg0, class121 arg1) {
        if (arg0 != 7) {
            field1079 = null;
        }
        field1089++;
        return new class124(arg1.method782(true), arg1.method782(true), arg1.method782(true), arg1.method782(true), arg1.method780(arg0 ^ 0xFF0007), arg1.method780(16711680), arg1.method751((byte) 90));
    }
}
