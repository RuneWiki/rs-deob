import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class95 {

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "Lpe;")
    public static class109 field2038 = class141.method1120("", 0);

    @OriginalMember(owner = "client!ne", name = "h", descriptor = "Lpe;")
    public static class109 field2042 = class141.method1120("gleiten:", 0);

    @OriginalMember(owner = "client!ne", name = "k", descriptor = "Z")
    public static boolean field2045 = true;

    @OriginalMember(owner = "client!ne", name = "g", descriptor = "Lpe;")
    public static class109 field2041 = class141.method1120("Musik)2Engine vorbereitet)3", 0);

    @OriginalMember(owner = "client!ne", name = "i", descriptor = "Lpe;")
    public static class109 field2043 = class141.method1120("blinken3:", 0);

    @OriginalMember(owner = "client!ne", name = "m", descriptor = "I")
    public static int field2047 = 2;

    @OriginalMember(owner = "client!ne", name = "p", descriptor = "I")
    public static int field2050 = 0;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "I")
    public static int field2035;

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "I")
    public static int field2036;

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "I")
    public static int field2037;

    @OriginalMember(owner = "client!ne", name = "e", descriptor = "I")
    public static int field2039;

    @OriginalMember(owner = "client!ne", name = "f", descriptor = "I")
    public static int field2040;

    @OriginalMember(owner = "client!ne", name = "l", descriptor = "I")
    public static int field2046;

    @OriginalMember(owner = "client!ne", name = "n", descriptor = "I")
    public static int field2048;

    @OriginalMember(owner = "client!ne", name = "o", descriptor = "I")
    public static int field2049;

    @OriginalMember(owner = "client!ne", name = "j", descriptor = "[I")
    public static int[] field2044;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(I)V")
    public static void method781(int arg0) {
        field2042 = null;
        field2041 = null;
        if (arg0 != 20646) {
            method784(100, -127, null, (byte) -11);
        }
        field2038 = null;
        field2044 = null;
        field2043 = null;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lpe;BI)V")
    public static final void method782(class109 arg0, byte arg1, int arg2) {
        if (arg1 <= 102) {
            method782(null, (byte) -37, 33);
        }
        field2040++;
        boolean var3 = false;
        class109 var4 = arg0.method877(104).method902((byte) 42);
        for (int var5 = 0; var5 < class44.field927; var5++) {
            class50 var6 = class104.field2194[class92.field1973[var5]];
            if (var6 != null && var6.field1051 != null && var6.field1051.method884(var4, 100)) {
                class86.method722(var6.field3121[0], 1, 126, 0, 1, class136.field2975.field3120[0], 0, 2, 0, class136.field2975.field3121[0], var6.field3120[0], false);
                var3 = true;
                if (arg2 == 1) {
                    class4.field99++;
                    class63.field1299.method535(178, -25013);
                    class63.field1299.method129(false, class92.field1973[var5]);
                } else if (arg2 == 4) {
                    class63.field1299.method535(241, -25013);
                    class148.field3265++;
                    class63.field1299.method109((byte) 47, class92.field1973[var5]);
                } else if (arg2 == 6) {
                    class136.field2973++;
                    class63.field1299.method535(225, -25013);
                    class63.field1299.method129(false, class92.field1973[var5]);
                } else if (arg2 == 7) {
                    class7.field169++;
                    class63.field1299.method535(102, -25013);
                    class63.field1299.method134(class92.field1973[var5], (byte) 9);
                }
                break;
            }
        }
        if (!var3) {
            class75.method593(0, class131.field2866, -8870, class44.method405(new class109[] { class157.field3643, var4 }, (byte) -74));
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(III)V")
    public static final void method783(int arg0, int arg1, int arg2) {
        field2049++;
        class63 var3 = class128.method1035(arg1, arg2 - 3992);
        int var4 = var3.field1285;
        int var5 = var3.field1289;
        if (arg2 != 4006) {
            field2050 = 64;
        }
        int var6 = var3.field1298;
        int var7 = class53.field1092[var6 - var5];
        if (arg0 < 0 || arg0 > var7) {
            arg0 = 0;
        }
        int var8 = var7 << var5;
        class153.field3376[var4] = class137.method1089(class4.method34(var8, arg0 << var5), class4.method34(~var8, class153.field3376[var4]));
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IILwa;B)V")
    public static final void method784(int arg0, int arg1, class154 arg2, byte arg3) {
        field2046++;
        if (arg2.field3412 == 1) {
            class121.method983(0, arg2.field3402, arg2.field3514, 0, 48, 45, class131.field2866);
            class66.field1341++;
        }
        if (arg2.field3412 == 2 && !class139.field3031) {
            class109 var4 = class128.method1037(arg2, (byte) 61);
            if (var4 != null) {
                field2039++;
                class121.method983(-1, var4, arg2.field3514, 0, 48, 25, class44.method405(new class109[] { class78.field1644, arg2.field3415 }, (byte) -74));
            }
        }
        if (arg3 != -105) {
            return;
        }
        if (arg2.field3412 == 3) {
            class55.field1117++;
            class121.method983(0, class149.field3289, arg2.field3514, 0, 48, 34, class131.field2866);
        }
        if (arg2.field3412 == 4) {
            class151.field3336++;
            class121.method983(0, arg2.field3402, arg2.field3514, 0, 48, 37, class131.field2866);
        }
        if (arg2.field3412 == 5) {
            class85.field1796++;
            class121.method983(0, arg2.field3402, arg2.field3514, 0, 48, 7, class131.field2866);
        }
        if (arg2.field3412 == 6 && class121.field2679 == null) {
            class121.method983(-1, arg2.field3402, arg2.field3514, 0, 48, 12, class131.field2866);
            class25.field612++;
        }
        if (arg2.field3476 == 2) {
            int var5 = 0;
            for (int var6 = 0; var6 < arg2.field3382; var6++) {
                for (int var7 = 0; var7 < arg2.field3427; var7++) {
                    int var8 = (arg2.field3407 + 32) * var7;
                    int var9 = (arg2.field3420 + 32) * var6;
                    if (var5 < 20) {
                        var8 += arg2.field3466[var5];
                        var9 += arg2.field3418[var5];
                    }
                    if (var8 <= arg0 && arg1 >= var9 && arg0 < var8 + 32 && var9 + 32 > arg1) {
                        class122.field2689 = arg2;
                        class92.field1991 = var5;
                        if (arg2.field3496[var5] > 0) {
                            class112 var10 = class4.method43((byte) 94, arg2.field3496[var5] - 1);
                            if (class135.field2936 == 1 && class19.method196((byte) -35, class136.method1084(0, arg2))) {
                                if (class123.field2733 != arg2.field3514 || client.field532 != var5) {
                                    class121.method983(var5, class92.field1982, arg2.field3514, var10.field2429, 48, 23, class44.method405(new class109[] { class20.field500, class32.field691, var10.field2381 }, (byte) -74));
                                    class116.field2584++;
                                }
                            } else if (!class139.field3031 || !class19.method196((byte) -35, class136.method1084(0, arg2))) {
                                class109[] var11 = var10.field2442;
                                class99.field2083++;
                                if (class119.field2651) {
                                    var11 = class61.method475((byte) -127, var11);
                                }
                                if (class19.method196((byte) -35, class136.method1084(arg3 + 105, arg2))) {
                                    for (int var12 = 4; var12 >= 3; var12--) {
                                        if (var11 != null && var11[var12] != null) {
                                            class108.field2268++;
                                            byte var13;
                                            if (var12 == 3) {
                                                var13 = 46;
                                            } else {
                                                var13 = 3;
                                            }
                                            class121.method983(var5, var11[var12], arg2.field3514, var10.field2429, 48, var13, class44.method405(new class109[] { class52.field1071, var10.field2381 }, (byte) -74));
                                        } else if (var12 == 4) {
                                            class120.field2658++;
                                            class121.method983(var5, class47.field977, arg2.field3514, var10.field2429, arg3 ^ 0xFFFFFFA7, 3, class44.method405(new class109[] { class52.field1071, var10.field2381 }, (byte) -74));
                                        }
                                    }
                                }
                                if (class89.method737(class136.method1084(arg3 + 105, arg2), true)) {
                                    class89.field1874++;
                                    class121.method983(var5, class92.field1982, arg2.field3514, var10.field2429, 48, 19, class44.method405(new class109[] { class52.field1071, var10.field2381 }, (byte) -74));
                                }
                                if (class19.method196((byte) -35, class136.method1084(arg3 + 105, arg2)) && var11 != null) {
                                    for (int var14 = 2; var14 >= 0; var14--) {
                                        if (var11[var14] != null) {
                                            class15.field382++;
                                            byte var15 = 0;
                                            if (var14 == 0) {
                                                var15 = 35;
                                            }
                                            if (var14 == 1) {
                                                var15 = 30;
                                            }
                                            if (var14 == 2) {
                                                var15 = 10;
                                            }
                                            class121.method983(var5, var11[var14], arg2.field3514, var10.field2429, arg3 ^ 0xFFFFFFA7, var15, class44.method405(new class109[] { class52.field1071, var10.field2381 }, (byte) -74));
                                        }
                                    }
                                }
                                class109[] var16 = arg2.field3404;
                                if (class119.field2651) {
                                    var16 = class61.method475((byte) -127, var16);
                                }
                                if (var16 != null) {
                                    for (int var17 = 4; var17 >= 0; var17--) {
                                        if (var16[var17] != null) {
                                            class11.field236++;
                                            byte var18 = 0;
                                            if (var17 == 0) {
                                                var18 = 1;
                                            }
                                            if (var17 == 1) {
                                                var18 = 15;
                                            }
                                            if (var17 == 2) {
                                                var18 = 20;
                                            }
                                            if (var17 == 3) {
                                                var18 = 26;
                                            }
                                            if (var17 == 4) {
                                                var18 = 33;
                                            }
                                            class121.method983(var5, var16[var17], arg2.field3514, var10.field2429, 48, var18, class44.method405(new class109[] { class52.field1071, var10.field2381 }, (byte) -74));
                                        }
                                    }
                                }
                                class121.method983(var5, class139.field3033, arg2.field3514, var10.field2429, 48, 1001, class44.method405(new class109[] { class52.field1071, var10.field2381 }, (byte) -74));
                            } else if ((class18.field438 & 0x10) == 16) {
                                class148.field3253++;
                                class121.method983(var5, class123.field2698, arg2.field3514, var10.field2429, 48, 16, class44.method405(new class109[] { class25.field621, class32.field691, var10.field2381 }, (byte) -74));
                            }
                        }
                    }
                    var5++;
                }
            }
        }
        if (!arg2.field3473) {
            return;
        }
        if (!class139.field3031) {
            for (int var19 = 9; var19 >= 5; var19--) {
                class109 var23 = class145.method1139(var19, 25678, arg2);
                if (var23 != null) {
                    class145.field3175++;
                    class121.method983(arg2.field3478, var23, arg2.field3514, var19 + 1, 48, 1003, arg2.field3452);
                }
            }
            class109 var20 = class128.method1037(arg2, (byte) 54);
            if (var20 != null) {
                field2039++;
                class121.method983(arg2.field3478, var20, arg2.field3514, 0, 48, 25, arg2.field3452);
            }
            for (int var21 = 4; var21 >= 0; var21--) {
                class109 var22 = class145.method1139(var21, arg3 ^ 0xFFFF9BD9, arg2);
                if (var22 != null) {
                    class121.method983(arg2.field3478, var22, arg2.field3514, var21 + 1, 48, 18, arg2.field3452);
                    class145.field3175++;
                }
            }
            if (!class149.method1164((byte) 86, class136.method1084(0, arg2))) {
                return;
            }
            class25.field612++;
            class121.method983(arg2.field3478, class13.field343, arg2.field3514, 0, 48, 12, class131.field2866);
        } else if (class82.method705((byte) 116, class136.method1084(0, arg2)) && (class18.field438 & 0x20) == 32) {
            class121.method983(arg2.field3478, class123.field2698, arg2.field3514, 0, arg3 + 153, 32, class44.method405(new class109[] { class25.field621, class48.field991, arg2.field3452 }, (byte) -74));
            class123.field2701++;
            return;
        }
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(III)I")
    public static final int method785(int arg0, int arg1, int arg2) {
        field2035++;
        int var3 = 6 % ((arg0 + 44) / 52);
        if (arg2 == -2) {
            return 12345678;
        } else if (arg2 == -1) {
            if (arg1 < 2) {
                arg1 = 2;
            } else if (arg1 > 126) {
                arg1 = 126;
            }
            return arg1;
        } else {
            int var4 = (arg2 & 0x7F) * arg1 / 128;
            if (var4 < 2) {
                var4 = 2;
            } else if (var4 > 126) {
                var4 = 126;
            }
            return (arg2 & 0xFF80) + var4;
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Ldf;ILjava/lang/Object;)V")
    public static final void method786(class28 arg0, int arg1, Object arg2) {
        field2037++;
        if (arg0.field649 == null) {
            return;
        }
        for (int var3 = 0; var3 < 50 && arg0.field649.peekEvent() != null; var3++) {
            class99.method797(1L, false);
        }
        if (arg1 != 1) {
            field2036 = -62;
        }
        if (arg2 != null) {
            arg0.field649.postEvent(new ActionEvent(arg2, 1001, "dummy"));
        }
    }
}
