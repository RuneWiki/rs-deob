import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public class class9 extends class199 {

    @OriginalMember(owner = "client!ig", name = "j", descriptor = "I")
    private int field114 = -32768;

    @OriginalMember(owner = "client!ig", name = "n", descriptor = "Lve;")
    public static class189 field118 = new class189(64);

    @OriginalMember(owner = "client!ig", name = "t", descriptor = "I")
    public static int field124 = -1;

    @OriginalMember(owner = "client!ig", name = "z", descriptor = "Lid;")
    public static class149 field130 = class60.method382("Liste der Welten geladen", (byte) 85);

    @OriginalMember(owner = "client!ig", name = "k", descriptor = "I")
    public static int field115;

    @OriginalMember(owner = "client!ig", name = "l", descriptor = "I")
    public static int field116;

    @OriginalMember(owner = "client!ig", name = "m", descriptor = "I")
    public int field117;

    @OriginalMember(owner = "client!ig", name = "o", descriptor = "I")
    public static int field119;

    @OriginalMember(owner = "client!ig", name = "p", descriptor = "I")
    public int field120;

    @OriginalMember(owner = "client!ig", name = "q", descriptor = "I")
    public static int field121;

    @OriginalMember(owner = "client!ig", name = "r", descriptor = "I")
    public static int field122;

    @OriginalMember(owner = "client!ig", name = "u", descriptor = "I")
    public static int field125;

    @OriginalMember(owner = "client!ig", name = "v", descriptor = "I")
    public static int field126;

    @OriginalMember(owner = "client!ig", name = "w", descriptor = "I")
    public static int field127;

    @OriginalMember(owner = "client!ig", name = "x", descriptor = "I")
    public static int field128;

    @OriginalMember(owner = "client!ig", name = "A", descriptor = "I")
    public static int field131;

    @OriginalMember(owner = "client!ig", name = "y", descriptor = "Leg;")
    public static class225 field129;

    @OriginalMember(owner = "client!ig", name = "s", descriptor = "Lal;")
    public static class230 field123;

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(BI)V")
    public static final void method45(byte arg0, int arg1) {
        class163.field3019 = arg1;
        field126++;
        if (arg0 > 83) {
            class129.field2285 = -1;
            class129.field2285 = -1;
            class197.method1346(98);
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(Lid;I)V")
    public static final void method46(class149 arg0, int arg1) {
        field131++;
        if (class258.field4519 >= 2) {
            if (arg0.method1048(arg1 ^ 0x39, class6.field67)) {
                class124.method872(-1);
                for (int var2 = 0; var2 < 10; var2++) {
                    System.gc();
                }
                Runtime var3 = Runtime.getRuntime();
                int var4 = (int) ((var3.totalMemory() - var3.freeMemory()) / 1024L);
                class264.method1841(true, class237.method1603(new class149[] { class23.field325, class211.method1434(var4, true), class10.field146 }, -102), (class149) null, 0);
            }
            if (arg0.method1048(-90, class49.field894)) {
                class124.method872(-1);
                for (int var5 = 0; var5 < 10; var5++) {
                    System.gc();
                }
                Runtime var6 = Runtime.getRuntime();
                int var7 = (int) ((var6.totalMemory() - var6.freeMemory()) / 1024L);
                class264.method1841(true, class237.method1603(new class149[] { class255.field4466, class211.method1434(var7, true), class10.field146 }, -118), (class149) null, 0);
                class55.method349(arg1 ^ 0x4D);
                class124.method872(-1);
                for (int var8 = 0; var8 < 10; var8++) {
                    System.gc();
                }
                int var9 = (int) ((var6.totalMemory() - var6.freeMemory()) / 1024L);
                class264.method1841(true, class237.method1603(new class149[] { class71.field1240, class211.method1434(var9, true), class10.field146 }, arg1 - 139), (class149) null, 0);
            }
            if (arg0.method1048(61, class157.field2879)) {
                class264.method1841(true, class237.method1603(new class149[] { class10.field145, class211.method1434(class173.method1233(false), true) }, -97), (class149) null, 0);
            }
            if (arg0.method1048(-70, class177.field3235)) {
                class198.method1357(-109);
            }
            if (arg0.method1048(123, class164.field3049)) {
                class271.field4868.method333(true);
            }
            if (arg0.method1048(-75, class176.field3221)) {
                class271.field4868.method324(true);
            }
            if (arg0.method1048(arg1 ^ 0xFFFFFF88, class8.field88)) {
                class272.field4900.method173(false);
                class164.field3047.method1394(3);
                class271.field4868.method331(-112);
            }
            if (arg0.method1048(107, class164.field3056)) {
                class22.field308 = true;
            }
            if (arg0.method1048(-43, class184.field3318)) {
                class50.method329(-11461, 25);
            }
            if (arg0.method1048(arg1 + 80, class141.field2592)) {
                class168.field3129 = true;
            }
            if (arg0.method1048(-58, class6.field69)) {
                class168.field3129 = false;
            }
            if (arg0.method1048(108, class75.field1357)) {
                for (int var10 = 0; var10 < 4; var10++) {
                    for (int var11 = 1; var11 < 103; var11++) {
                        for (int var12 = 1; var12 < 103; var12++) {
                            class228.field3989[var10].field1856[var11][var12] = 0;
                        }
                    }
                }
            }
            if (arg0.method1062(class221.field3873, -57)) {
                class88.method651(arg0.method1025((byte) 34, 15).method1052((byte) -86));
                class83.method620(class272.field4900, (byte) 88);
                class63.field1134 = false;
            }
            if (arg0.method1062(class281.field4990, -67) && class236.field4132 != 0) {
                class13.method86(arg0.method1025((byte) 34, 6).method1052((byte) 122), 14210);
            }
            if (arg0.method1048(-44, class226.field3969)) {
                throw new RuntimeException();
            }
            if (arg0.method1062(class34.field487, -101)) {
                class287.field5119 = arg0.method1025((byte) 34, 12).method1037(32).method1052((byte) 125);
                class264.method1841(true, class237.method1603(new class149[] { class123.field2162, class211.method1434(class287.field5119, true) }, -109), (class149) null, 0);
            }
            if (arg0.method1048(58, class78.field1457)) {
                class38.field563 = true;
            }
            if (arg0.method1048(-88, class6.field74)) {
                if (class243.field4265) {
                    class243.field4265 = false;
                    class264.method1841(true, class118.field2017, (class149) null, 0);
                } else {
                    class243.field4265 = true;
                    class264.method1841(true, class221.field3877, (class149) null, 0);
                }
            }
            if (arg0.method1048(55, class62.field1106)) {
                if (class127.field2229) {
                    class64.field1143.method1057(0);
                    class127.field2229 = false;
                } else {
                    class164.field3054.method1057(0);
                    class127.field2229 = true;
                }
            }
        }
        class208.field3720.method162(2, 44);
        class45.field684++;
        if (arg1 == 12) {
            class208.field3720.method494((byte) 4, arg0.method1053((byte) -112) - 1);
            class208.field3720.method523(arg0.method1025((byte) 34, 2), (byte) 0);
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IB)I")
    public static final int method47(int arg0, byte arg1) {
        if (arg1 != -4) {
            method48(126, -83, 73, 3, -43, 31, -58, 29);
        }
        field119++;
        int var2 = (arg0 * arg0 >> 12) * arg0 >> 12;
        int var3 = arg0 * 6 - 61440;
        int var4 = (arg0 * var3 >> 12) + 40960;
        return var2 * var4 >> 12;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IIIIIIII)Z")
    public static final boolean method48(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        long var8 = class108.method756(arg3, arg1 + arg5, arg0 + arg6);
        field122++;
        if (arg4 != -710) {
            method52(30);
        }
        if (var8 != 0L) {
            int var10 = ((int) var8 & 0x38569C) >> 20;
            int var11 = (int) var8 >> 14 & 0x1F;
            int var12 = Integer.MAX_VALUE & (int) (var8 >>> 32);
            class268 var13 = class108.method755(arg4 ^ 0xFFFFD03F, var12);
            if (var13.field4837 == -1) {
                int var14 = arg7;
                if (var8 > 0L) {
                    var14 = arg2;
                }
                int[] var15 = class72.field1254;
                int var16 = (103 - arg0) * 512 * 4 + arg5 * 4 + 24624;
                if (var11 == 0 || var11 == 2) {
                    if (var10 == 0) {
                        var15[var16] = var14;
                        var15[var16 + 512] = var14;
                        var15[var16 + 1024] = var14;
                        var15[var16 + 1536] = var14;
                    } else if (var10 == 1) {
                        var15[var16] = var14;
                        var15[var16 + 1] = var14;
                        var15[var16 + 2] = var14;
                        var15[var16 + 3] = var14;
                    } else if (var10 == 2) {
                        var15[var16 + 3] = var14;
                        var15[var16 + 515] = var14;
                        var15[var16 + 3 + 1024] = var14;
                        var15[var16 + 1539] = var14;
                    } else if (var10 == 3) {
                        var15[var16 + 1536] = var14;
                        var15[var16 + 1 + 1536] = var14;
                        var15[var16 + 1536 + 2] = var14;
                        var15[var16 + 1539] = var14;
                    }
                }
                if (var11 == 3) {
                    if (var10 == 0) {
                        var15[var16] = var14;
                    } else if (var10 == 1) {
                        var15[var16 + 3] = var14;
                    } else if (var10 == 2) {
                        var15[var16 + 3 + 1536] = var14;
                    } else if (var10 == 3) {
                        var15[var16 + 1536] = var14;
                    }
                }
                if (var11 == 2) {
                    if (var10 == 3) {
                        var15[var16] = var14;
                        var15[var16 + 512] = var14;
                        var15[var16 + 1024] = var14;
                        var15[var16 + 1536] = var14;
                    } else if (var10 == 0) {
                        var15[var16] = var14;
                        var15[var16 + 1] = var14;
                        var15[var16 + 2] = var14;
                        var15[var16 + 3] = var14;
                    } else if (var10 == 1) {
                        var15[var16 + 3] = var14;
                        var15[var16 + 3 + 512] = var14;
                        var15[var16 + 3 + 1024] = var14;
                        var15[var16 + 3 + 1536] = var14;
                    } else if (var10 == 2) {
                        var15[var16 + 1536] = var14;
                        var15[var16 + 1537] = var14;
                        var15[var16 + 2 + 1536] = var14;
                        var15[var16 + 1539] = var14;
                    }
                }
            } else if (!class191.method1305(var13, 23279, arg6, arg0, arg1, arg5, var10)) {
                return false;
            }
        }
        long var17 = class165.method1210(arg3, arg1 + arg5, arg0 + arg6);
        if (var17 != 0L) {
            int var19 = (int) var17 >> 20 & 0x3;
            int var20 = Integer.MAX_VALUE & (int) (var17 >>> 32);
            int var21 = (int) var17 >> 14 & 0x1F;
            class268 var22 = class108.method755(11525, var20);
            if (var22.field4837 == -1) {
                if (var21 == 9) {
                    int[] var23 = class72.field1254;
                    int var24 = (103 - arg0) * 512 * 4 + arg5 * 4 + 24624;
                    int var25 = 15658734;
                    if (var17 > 0L) {
                        var25 = 15597568;
                    }
                    if (var19 == 0 || var19 == 2) {
                        var23[var24 + 1536] = var25;
                        var23[var24 + 1 + 1024] = var25;
                        var23[var24 + 512 + 2] = var25;
                        var23[var24 + 3] = var25;
                    } else {
                        var23[var24] = var25;
                        var23[var24 + 1 + 512] = var25;
                        var23[var24 + 1024 + 2] = var25;
                        var23[var24 + 1536 + 3] = var25;
                    }
                }
            } else if (!class191.method1305(var22, 23279, arg6, arg0, arg1, arg5, var19)) {
                return false;
            }
        }
        long var26 = class133.method931(arg3, arg5 + arg1, arg0 + arg6);
        if (var26 != 0L) {
            int var28 = Integer.MAX_VALUE & (int) (var26 >>> 32);
            int var29 = (int) var26 >> 20 & 0x3;
            class268 var30 = class108.method755(11525, var28);
            if (var30.field4837 != -1 && !class191.method1305(var30, 23279, arg6, arg0, arg1, arg5, var29)) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IIIII)V")
    public final void method49(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field127++;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(I)V")
    public static final void method50(int arg0) {
        field115++;
        if (arg0 <= 81 || class244.field4292 == 0) {
            return;
        }
        try {
            if ((++class276.field4929) > 1500) {
                if (class164.field3047 != null) {
                    class164.field3047.method1398((byte) 118);
                    class164.field3047 = null;
                }
                if (class177.field3232 >= 1) {
                    class140.field2558 = -5;
                    class244.field4292 = 0;
                    return;
                }
                class177.field3232++;
                class244.field4292 = 1;
                if (class47.field774 == class111.field1922) {
                    class47.field774 = class7.field81;
                } else {
                    class47.field774 = class111.field1922;
                }
                class276.field4929 = 0;
            }
            if (class244.field4292 == 1) {
                class36.field542 = class272.field4900.method174(class47.field774, false, class75.field1362);
                class244.field4292 = 2;
            }
            if (class244.field4292 == 2) {
                if (class36.field542.field3358 == 2) {
                    throw new IOException();
                }
                if (class36.field542.field3358 != 1) {
                    return;
                }
                class164.field3047 = new class205((Socket) class36.field542.field3357, class272.field4900);
                class36.field542 = null;
                class164.field3047.method1400(0, class208.field3720.field1321, class208.field3720.field1340, (byte) 84);
                if (class116.field1991 != null) {
                    class116.field1991.method974(0);
                }
                if (class79.field1476 != null) {
                    class79.field1476.method974(0);
                }
                int var1 = class164.field3047.method1397(17506);
                if (class116.field1991 != null) {
                    class116.field1991.method974(0);
                }
                if (class79.field1476 != null) {
                    class79.field1476.method974(0);
                }
                if (var1 != 101) {
                    class244.field4292 = 0;
                    class140.field2558 = var1;
                    class164.field3047.method1398((byte) -27);
                    class164.field3047 = null;
                    return;
                }
                class244.field4292 = 3;
            }
            if (class244.field4292 == 3 && class164.field3047.method1392(-19) >= 2) {
                int var2 = class164.field3047.method1397(17506) << 8 | class164.field3047.method1397(17506);
                class122.method862(var2, 32);
                if (class147.field2652 == -1) {
                    class244.field4292 = 0;
                    class140.field2558 = 6;
                    class164.field3047.method1398((byte) 120);
                    class164.field3047 = null;
                } else {
                    class244.field4292 = 0;
                    class164.field3047.method1398((byte) -52);
                    class164.field3047 = null;
                    class255.method1758(0);
                }
            }
        } catch (IOException var3) {
            if (class164.field3047 != null) {
                class164.field3047.method1398((byte) -104);
                class164.field3047 = null;
            }
            if (class177.field3232 < 1) {
                class177.field3232++;
                if (class47.field774 == class111.field1922) {
                    class47.field774 = class7.field81;
                } else {
                    class47.field774 = class111.field1922;
                }
                class244.field4292 = 1;
                class276.field4929 = 0;
            } else {
                class140.field2558 = -4;
                class244.field4292 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "(I)V")
    public static final void method51(int arg0) {
        field121++;
        if (class164.field3047 != null) {
            class164.field3047.method1398((byte) -93);
            class164.field3047 = null;
        }
        class200.method1371(-18131);
        class76.method571();
        for (int var1 = 0; var1 < 4; var1++) {
            class228.field3989[var1].method753(124);
        }
        class285.method1959(false, (byte) -10);
        System.gc();
        class154.method1090(2, (byte) -111);
        class71.field1241 = false;
        class133.field2425 = -1;
        class273.method1893(true, 24077);
        class141.field2600 = 0;
        class125.field2199 = 0;
        class277.field4953 = 0;
        class115.field1969 = 0;
        class104.field1819 = false;
        for (int var2 = 0; var2 < class189.field3396.length; var2++) {
            class189.field3396[var2] = null;
        }
        class182.field3281 = 0;
        class253.field4432 = 0;
        for (int var3 = 0; var3 < 2048; var3++) {
            class107.field1851[var3] = null;
            class236.field4133[var3] = null;
        }
        if (arg0 < 72) {
            field129 = null;
        }
        for (int var4 = 0; var4 < 32768; var4++) {
            class38.field572[var4] = null;
        }
        for (int var5 = 0; var5 < 4; var5++) {
            for (int var6 = 0; var6 < 104; var6++) {
                for (int var7 = 0; var7 < 104; var7++) {
                    class83.field1515[var5][var6][var7] = null;
                }
            }
        }
        class2.method6(-1);
        class87.field1585 = 0;
        class155.method1101((byte) 58);
        class60.method381(8, true);
    }

    @OriginalMember(owner = "client!ig", name = "c", descriptor = "(I)V")
    public static final void method52(int arg0) {
        class41.field648.method1290((byte) -91);
        field116++;
        class255.field4461.method1290((byte) 61);
        if (arg0 != -1) {
            field130 = null;
        }
    }

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "()I")
    public final int method53() {
        field128++;
        return this.field114;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IIIIIIIIJILue;)V")
    public final void method54(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class88 arg10) {
        class262 var13 = class226.method1516(this.field117, -28322).method1815((class164) null, 0, -93, this.field120, 0, -1);
        field125++;
        if (var13 != null) {
            var13.method54(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10);
            this.field114 = var13.method53();
        }
    }

    @OriginalMember(owner = "client!ig", name = "d", descriptor = "(I)V")
    public static void method55(int arg0) {
        field118 = null;
        field130 = null;
        if (arg0 != 0) {
            field118 = null;
        }
        field123 = null;
        field129 = null;
    }
}
