import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public class class48 implements Runnable {

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "[Lkf;")
    public volatile class75[] field1128 = new class75[2];

    @OriginalMember(owner = "client!gf", name = "k", descriptor = "Z")
    public volatile boolean field1137 = false;

    @OriginalMember(owner = "client!gf", name = "s", descriptor = "Z")
    public volatile boolean field1145 = false;

    @OriginalMember(owner = "client!gf", name = "f", descriptor = "Lu;")
    public static class135 field1132 = class87.method676((byte) -123, "Spiel)2Engine wird gestartet)3)3)3");

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "Lu;")
    private static class135 field1127 = class87.method676((byte) -108, ":  ");

    @OriginalMember(owner = "client!gf", name = "c", descriptor = "Lu;")
    private static class135 field1129 = class87.method676((byte) -111, "Type");

    @OriginalMember(owner = "client!gf", name = "h", descriptor = "I")
    public static int field1134 = 0;

    @OriginalMember(owner = "client!gf", name = "i", descriptor = "I")
    public static int field1135 = 0;

    @OriginalMember(owner = "client!gf", name = "l", descriptor = "Lu;")
    public static class135 field1138 = class87.method676((byte) -115, "Ihr Charakter)2Profil wird in:");

    @OriginalMember(owner = "client!gf", name = "e", descriptor = "Lu;")
    private static class135 field1131 = class87.method676((byte) -75, "RuneScape is loading )2 please wait)3)3)3");

    @OriginalMember(owner = "client!gf", name = "p", descriptor = "[[[Lda;")
    public static class23[][][] field1142 = new class23[4][104][104];

    @OriginalMember(owner = "client!gf", name = "j", descriptor = "Lu;")
    public static class135 field1136 = field1131;

    @OriginalMember(owner = "client!gf", name = "q", descriptor = "I")
    public static int field1143 = 0;

    @OriginalMember(owner = "client!gf", name = "v", descriptor = "Lu;")
    public static class135 field1148 = field1129;

    @OriginalMember(owner = "client!gf", name = "y", descriptor = "I")
    public static int field1151 = 0;

    @OriginalMember(owner = "client!gf", name = "d", descriptor = "I")
    public static int field1130;

    @OriginalMember(owner = "client!gf", name = "g", descriptor = "I")
    public static int field1133;

    @OriginalMember(owner = "client!gf", name = "m", descriptor = "I")
    public static int field1139;

    @OriginalMember(owner = "client!gf", name = "n", descriptor = "I")
    public static int field1140;

    @OriginalMember(owner = "client!gf", name = "o", descriptor = "I")
    public static int field1141;

    @OriginalMember(owner = "client!gf", name = "r", descriptor = "I")
    public static int field1144;

    @OriginalMember(owner = "client!gf", name = "t", descriptor = "I")
    public static int field1146;

    @OriginalMember(owner = "client!gf", name = "w", descriptor = "I")
    public static int field1149;

    @OriginalMember(owner = "client!gf", name = "x", descriptor = "I")
    public static int field1150;

    @OriginalMember(owner = "client!gf", name = "z", descriptor = "I")
    public static int field1152;

    @OriginalMember(owner = "client!gf", name = "u", descriptor = "Lae;")
    public static class6 field1147;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIZI)I")
    public static final int method359(int arg0, int arg1, boolean arg2, int arg3) {
        field1141++;
        int var4 = arg0 & 0x3;
        if (var4 == 0) {
            return arg1;
        }
        if (arg2) {
            method362(18, 10, 109, -27, -84);
        }
        if (var4 == 1) {
            return arg3;
        } else if (var4 == 2) {
            return 7 - arg1;
        } else {
            return 7 - arg3;
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(II)Lve;")
    public static final class146 method360(int arg0, int arg1) {
        if (arg0 > -68) {
            return null;
        }
        int var2 = arg1 >> 16;
        int var3 = arg1 & 0xFFFF;
        field1130++;
        if (class105.field2528[var2] == null || class105.field2528[var2][var3] == null) {
            boolean var4 = class93.method760(0, var2);
            if (!var4) {
                return null;
            }
        }
        return class105.field2528[var2][var3];
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(III)I")
    public static final int method361(int arg0, int arg1, int arg2) {
        field1133++;
        int var3 = arg1 >>> 31;
        if (arg0 != -13686) {
            method365((byte) -19);
        }
        return (arg1 + var3) / arg2 - var3;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIIII)V")
    public static final void method362(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1149++;
        if (arg0 != 7522) {
            field1147 = null;
        }
        for (class58 var5 = (class58) class41.field955.method182((byte) 50); var5 != null; var5 = (class58) class41.field955.method181((byte) 36)) {
            if (var5.field1426 != -1 || var5.field1411 != null) {
                int var6 = 0;
                if (var5.field1443 < arg2) {
                    var6 += arg2 - var5.field1443;
                } else if (var5.field1432 > arg2) {
                    var6 += var5.field1432 - arg2;
                }
                if (arg3 > var5.field1441) {
                    var6 += arg3 - var5.field1441;
                } else if (var5.field1445 > arg3) {
                    var6 += var5.field1445 - arg3;
                }
                if (var6 - 64 > var5.field1423 || class90.field2115 == 0 || var5.field1420 != arg1) {
                    if (var5.field1436 != null) {
                        class65.field1645.method1182(var5.field1436);
                        var5.field1436 = null;
                    }
                    if (var5.field1427 != null) {
                        class65.field1645.method1182(var5.field1427);
                        var5.field1427 = null;
                    }
                } else {
                    var6 -= 64;
                    if (var6 < 0) {
                        var6 = 0;
                    }
                    int var7 = (var5.field1423 - var6) * class90.field2115 / var5.field1423;
                    if (var5.field1436 != null) {
                        var5.field1436.method718(var7);
                    } else if (var5.field1426 >= 0) {
                        class61 var8 = class61.method508(class98.field2374, var5.field1426, 0);
                        if (var8 != null) {
                            class74 var9 = var8.method510().method597(class60.field1523);
                            class92 var10 = class92.method740(var9, 100, var7);
                            var10.method723(-1);
                            class65.field1645.method1179(var10);
                            var5.field1436 = var10;
                        }
                    }
                    if (var5.field1427 != null) {
                        var5.field1427.method718(var7);
                        if (!var5.field1427.method304((byte) 116)) {
                            var5.field1427 = null;
                        }
                    } else if (var5.field1411 != null && (var5.field1433 -= arg4) <= 0) {
                        int var11 = (int) (Math.random() * (double) var5.field1411.length);
                        class61 var12 = class61.method508(class98.field2374, var5.field1411[var11], 0);
                        if (var12 != null) {
                            class74 var13 = var12.method510().method597(class60.field1523);
                            class92 var14 = class92.method740(var13, 100, var7);
                            var14.method723(0);
                            class65.field1645.method1179(var14);
                            var5.field1427 = var14;
                            var5.field1433 = (int) ((double) (var5.field1415 - var5.field1412) * Math.random()) + var5.field1412;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(I)V")
    public static final void method363(int arg0) {
        field1139++;
        if (class63.field1559 == 0) {
            return;
        }
        class18 var1 = class93.field2200;
        int var2 = 0;
        if (class63.field1586 != 0) {
            var2 = 1;
        }
        int var3 = 0;
        if (arg0 > -87) {
            method362(92, 110, 20, 28, -15);
        }
        while (var3 < 100) {
            if (class125.field2976[var3] != null) {
                int var4 = class117.field2804[var3];
                class135 var5 = class25.field589[var3];
                byte var6 = 0;
                if (var5 != null && var5.method1087(class56.field1369, (byte) -52)) {
                    var5 = var5.method1065((byte) -42, 5);
                    var6 = 1;
                }
                if (var5 != null && var5.method1087(class26.field626, (byte) -52)) {
                    var6 = 2;
                    var5 = var5.method1065((byte) -86, 5);
                }
                if ((var4 == 3 || var4 == 7) && (var4 == 7 || field1135 == 0 || field1135 == 1 && class9.method48(var5, 0))) {
                    byte var7 = 4;
                    int var8 = 329 - var2 * 13;
                    var2++;
                    var1.method121(class20.field469, var7, var8, 0);
                    var1.method121(class20.field469, var7, var8 - 1, 65535);
                    int var9 = var7 + var1.method115(class20.field469);
                    int var10 = var9 + var1.method123(32);
                    if (var6 == 1) {
                        class40.field937[0].method29(var10, var8 - 12);
                        var10 += 14;
                    }
                    if (var6 == 2) {
                        class40.field937[1].method29(var10, var8 - 12);
                        var10 += 14;
                    }
                    var1.method121(class107.method867(2, new class135[] { var5, class2.field72, class125.field2976[var3] }), var10, var8, 0);
                    var1.method121(class107.method867(2, new class135[] { var5, class2.field72, class125.field2976[var3] }), var10, var8 - 1, 65535);
                    if (var2 >= 5) {
                        return;
                    }
                }
                if (var4 == 5 && field1135 < 2) {
                    int var11 = 329 - var2 * 13;
                    var2++;
                    var1.method121(class125.field2976[var3], 4, var11, 0);
                    var1.method121(class125.field2976[var3], 4, var11 - 1, 65535);
                    if (var2 >= 5) {
                        return;
                    }
                }
                if (var4 == 6 && field1135 < 2) {
                    int var12 = 329 - var2 * 13;
                    var2++;
                    var1.method121(class107.method867(2, new class135[] { class83.field1971, class1.field3, var5, class2.field72, class125.field2976[var3] }), 4, var12, 0);
                    var1.method121(class107.method867(2, new class135[] { class83.field1971, class1.field3, var5, class2.field72, class125.field2976[var3] }), 4, var12 - 1, 65535);
                    if (var2 >= 5) {
                        return;
                    }
                }
            }
            var3++;
        }
    }

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "(I)V")
    public static final void method364(int arg0) {
        field1146++;
        if (class63.field1559 == 0) {
            return;
        }
        int var1 = 0;
        if (class63.field1586 != arg0) {
            var1 = 1;
        }
        for (int var2 = 0; var2 < 100; var2++) {
            if (class125.field2976[var2] != null) {
                int var3 = class117.field2804[var2];
                class135 var4 = class25.field589[var2];
                if (var4 != null && var4.method1087(class56.field1369, (byte) -52)) {
                    var4 = var4.method1065((byte) -28, 5);
                }
                if (var4 != null && var4.method1087(class26.field626, (byte) -52)) {
                    var4 = var4.method1065((byte) -59, 5);
                }
                if ((var3 == 3 || var3 == 7) && (var3 == 7 || field1135 == 0 || field1135 == 1 && class9.method48(var4, 0))) {
                    int var5 = 329 - var1 * 13;
                    if (class53.field1278 > 4 && class76.field1798 - 4 > var5 + -10 && var5 + 3 >= class76.field1798 - 4) {
                        int var6 = class93.field2200.method115(class107.method867(2, new class135[] { class20.field469, field1127, var4, class125.field2976[var2] })) + 25;
                        if (var6 > 450) {
                            var6 = 450;
                        }
                        if (var6 + 4 > class53.field1278) {
                            class9.field161++;
                            if (class5.field128 >= 1) {
                                class111.field2693++;
                                class95.method785(0, (byte) -99, 0, class107.method867(2, new class135[] { class49.field1160, var4 }), class124.field2948, 0, 2045);
                            }
                            class50.field1183++;
                            class95.method785(0, (byte) -99, 0, class107.method867(2, new class135[] { class49.field1160, var4 }), class146.field3550, 0, 2056);
                            class95.method785(0, (byte) -99, 0, class107.method867(arg0 ^ 0x2, new class135[] { class49.field1160, var4 }), class82.field1948, 0, 2013);
                        }
                    }
                    var1++;
                    if (var1 >= 5) {
                        return;
                    }
                }
                if ((var3 == 5 || var3 == 6) && field1135 < 2) {
                    var1++;
                    if (var1 >= 5) {
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(B)V")
    public static void method365(byte arg0) {
        if (arg0 != -17) {
            field1151 = -13;
        }
        field1136 = null;
        field1147 = null;
        field1132 = null;
        field1138 = null;
        field1129 = null;
        field1142 = null;
        field1131 = null;
        field1127 = null;
        field1148 = null;
    }

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "(II)V")
    public static final void method366(int arg0, int arg1) {
        class104.method851((byte) -62);
        int var2 = class42.method316(arg0, 6).field1255;
        field1152++;
        if (var2 == 0 || arg1 > -125) {
            return;
        }
        int var3 = class104.field2513[arg0];
        if (var2 == 1) {
            if (var3 == 1) {
                class51.method385(0.9D);
                ((class85) class51.field1209).method661((byte) -113, 0.9D);
            }
            if (var3 == 2) {
                class51.method385(0.8D);
                ((class85) class51.field1209).method661((byte) -77, 0.8D);
            }
            if (var3 == 3) {
                class51.method385(0.7D);
                ((class85) class51.field1209).method661((byte) -113, 0.7D);
            }
            if (var3 == 4) {
                class51.method385(0.6D);
                ((class85) class51.field1209).method661((byte) -126, 0.6D);
            }
            class69.method557(-20270);
            class53.field1258 = true;
        }
        if (var2 == 3) {
            short var4 = 0;
            if (var3 == 0) {
                var4 = 255;
            }
            if (var3 == 1) {
                var4 = 192;
            }
            if (var3 == 2) {
                var4 = 128;
            }
            if (var3 == 3) {
                var4 = 64;
            }
            if (var3 == 4) {
                var4 = 0;
            }
            if (class84.field1996 != var4) {
                if (class84.field1996 == 0 && class78.field1848 != -1) {
                    class4.method16(0, class41.field956, class78.field1848, 120, false, var4);
                    class69.field1709 = false;
                } else if (var4 == 0) {
                    class103.method844(-12);
                    class69.field1709 = false;
                } else {
                    class90.method682(var4, -37);
                }
                class84.field1996 = var4;
            }
        }
        if (var2 == 4) {
            if (var3 == 0) {
                class39.field892 = 127;
            }
            if (var3 == 1) {
                class39.field892 = 96;
            }
            if (var3 == 2) {
                class39.field892 = 64;
            }
            if (var3 == 3) {
                class39.field892 = 32;
            }
            if (var3 == 4) {
                class39.field892 = 0;
            }
        }
        if (var2 == 9) {
            class111.field2699 = var3;
        }
        if (var2 == 6) {
            class78.field1840 = var3;
        }
        if (var2 == 10) {
            if (var3 == 0) {
                class90.field2115 = 127;
            }
            if (var3 == 1) {
                class90.field2115 = 96;
            }
            if (var3 == 2) {
                class90.field2115 = 64;
            }
            if (var3 == 3) {
                class90.field2115 = 32;
            }
            if (var3 == 4) {
                class90.field2115 = 0;
            }
        }
        if (var2 == 5) {
            class152.field3747 = var3;
        }
        if (var2 == 8) {
            class63.field1559 = var3;
            class65.field1634 = true;
        }
    }

    @OriginalMember(owner = "client!gf", name = "run", descriptor = "()V")
    public final void run() {
        this.field1145 = true;
        try {
            while (!this.field1137) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class75 var2 = this.field1128[var1];
                    if (var2 != null) {
                        var2.method603(false);
                    }
                }
                class96.method795(10L, 69);
                class100.method824(false, -51);
            }
        } catch (Exception var9) {
            class34.method267(null, 35, var9);
        } finally {
            Object var6 = null;
            this.field1145 = false;
        }
        field1150++;
    }
}
