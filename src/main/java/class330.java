import java.awt.Canvas;
import java.awt.Frame;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!js")
public class class330 extends class224 {

    @OriginalMember(owner = "client!js", name = "M", descriptor = "Lts;")
    public static class532 field4668 = new class532(true);

    @OriginalMember(owner = "client!js", name = "P", descriptor = "J")
    public static long field4671 = 0L;

    @OriginalMember(owner = "client!js", name = "z", descriptor = "I")
    public static int field4656;

    @OriginalMember(owner = "client!js", name = "C", descriptor = "I")
    public static int field4658;

    @OriginalMember(owner = "client!js", name = "D", descriptor = "I")
    public static int field4659;

    @OriginalMember(owner = "client!js", name = "F", descriptor = "I")
    public static int field4661;

    @OriginalMember(owner = "client!js", name = "H", descriptor = "I")
    public static int field4663;

    @OriginalMember(owner = "client!js", name = "J", descriptor = "I")
    public static int field4665;

    @OriginalMember(owner = "client!js", name = "K", descriptor = "I")
    public static int field4666;

    @OriginalMember(owner = "client!js", name = "L", descriptor = "I")
    public static int field4667;

    @OriginalMember(owner = "client!js", name = "N", descriptor = "I")
    public static int field4669;

    @OriginalMember(owner = "client!js", name = "x", descriptor = "Ljava/awt/Frame;")
    public static Frame field4654;

    @OriginalMember(owner = "client!js", name = "y", descriptor = "Ljava/lang/String;")
    public String field4655;

    @OriginalMember(owner = "client!js", name = "G", descriptor = "[C")
    public char[] field4662;

    @OriginalMember(owner = "client!js", name = "I", descriptor = "[C")
    public char[] field4664;

    @OriginalMember(owner = "client!js", name = "E", descriptor = "[I")
    public int[] field4660;

    @OriginalMember(owner = "client!js", name = "O", descriptor = "[I")
    public int[] field4670;

    @OriginalMember(owner = "client!js", name = "A", descriptor = "[S")
    public static short[] field4657;

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(I)V")
    public static final void method2102(int arg0) {
        field4656++;
        class107.field1768 = new class46(8);
        class25.field322 = 0;
        for (class753 var1 = (class753) class460.field6633.method4159(arg0); var1 != null; var1 = (class753) class460.field6633.method4151(7)) {
            var1.method4177();
        }
    }

    @OriginalMember(owner = "client!js", name = "b", descriptor = "(Lud;I)V")
    public final void method2103(class35 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method273(255);
            if (var3 == 0) {
                field4665++;
                if (arg1 != 0) {
                    method2106(-97);
                    return;
                }
                return;
            }
            this.method2105(var3, arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(Lrca;B)V")
    public static final void method2104(class452 arg0, byte arg1) {
        arg0.method2688((byte) 40);
        field4661++;
        int var2 = class675.field9486;
        class349 var3 = class468.field6748 = class165.field2442[var2] = new class349();
        var3.field931 = var2;
        int var4 = arg0.method2686(-9380, 30);
        byte var5 = (byte) (var4 >> 28);
        int var6 = var4 >> 14 & 0x3FFF;
        var3.field991[0] = var6 - class115.field1845;
        int var7 = var4 & 0x3FFF;
        var3.field644 = (var3.field991[0] << 9) + (var3.method482(false) << 8);
        var3.field995[0] = var7 - class64.field1160;
        var3.field648 = (var3.field995[0] << 9) + (var3.method482(false) << 8);
        class312.field4409 = var3.field649 = var3.field659 = var5;
        if (class634.method3647(arg1 ^ 0xFFFFFF8F, var3.field995[0], var3.field991[0])) {
            var3.field659++;
        }
        if (class196.field2807[var2] != null) {
            var3.method2200(-5061, class196.field2807[var2]);
        }
        class206.field2950 = 0;
        class209.field3013[class206.field2950++] = var2;
        class483.field6837[var2] = arg1;
        class646.field9152 = 0;
        for (int var8 = 1; var8 < 2048; var8++) {
            if (var2 != var8) {
                int var9 = arg0.method2686(-9380, 18);
                int var10 = var9 >> 16;
                int var11 = (var9 & 0xFF3A) >> 8;
                int var12 = var9 & 0xFF;
                class702 var13 = class722.field10086[var8] = new class702();
                var13.field9851 = false;
                var13.field9852 = -1;
                var13.field9858 = 0;
                var13.field9855 = (var11 << 14) + (var10 << 28) + var12;
                class251.field3592[class646.field9152++] = var8;
                class483.field6837[var8] = 0;
            }
        }
        arg0.method2684(true);
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(ILud;I)V")
    private final void method2105(int arg0, class35 arg1, int arg2) {
        if (arg2 != 0) {
            return;
        }
        if (arg0 == 1) {
            this.field4655 = arg1.method272(2);
        } else if (arg0 == 2) {
            int var4 = arg1.method273(255);
            this.field4670 = new int[var4];
            this.field4664 = new char[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field4670[var5] = arg1.method253(-13900);
                byte var6 = arg1.method277((byte) -118);
                this.field4664[var5] = var6 == 0 ? 0 : class27.method199(16, var6);
            }
        } else if (arg0 == 3) {
            int var7 = arg1.method273(255);
            this.field4662 = new char[var7];
            this.field4660 = new int[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field4660[var8] = arg1.method253(arg2 - 13900);
                byte var9 = arg1.method277((byte) -118);
                this.field4662[var8] = var9 == 0 ? 0 : class27.method199(16, var9);
            }
        }
        field4666++;
    }

    @OriginalMember(owner = "client!js", name = "h", descriptor = "(I)V")
    public static void method2106(int arg0) {
        if (arg0 >= 14) {
            field4657 = null;
            field4654 = null;
            field4668 = null;
        }
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(CI)I")
    public final int method2107(char arg0, int arg1) {
        field4659++;
        if (this.field4660 == null) {
            return -1;
        }
        for (int var3 = 0; var3 < this.field4660.length; var3++) {
            if (this.field4662[var3] == arg0) {
                return this.field4660[var3];
            }
        }
        if (arg1 != 31) {
            this.field4670 = null;
        }
        return -1;
    }

    @OriginalMember(owner = "client!js", name = "i", descriptor = "(I)V")
    public final void method2108(int arg0) {
        field4669++;
        if (arg0 != -14444) {
            this.field4655 = null;
        }
        if (this.field4660 != null) {
            for (int var2 = 0; var2 < this.field4660.length; var2++) {
                this.field4660[var2] = class164.method1221(this.field4660[var2], 32768);
            }
        }
        if (this.field4670 != null) {
            for (int var3 = 0; var3 < this.field4670.length; var3++) {
                this.field4670[var3] = class164.method1221(this.field4670[var3], 32768);
            }
        }
    }

    @OriginalMember(owner = "client!js", name = "b", descriptor = "(CI)I")
    public final int method2109(char arg0, int arg1) {
        field4663++;
        if (this.field4670 == null) {
            return -1;
        }
        if (arg1 < 5) {
            field4657 = null;
        }
        for (int var3 = 0; var3 < this.field4670.length; var3++) {
            if (this.field4664[var3] == arg0) {
                return this.field4670[var3];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(Z)V")
    public static final void method2110(boolean arg0) {
        field4658++;
        if (class586.field8248 > 1) {
            class298.field4135 = class374.field5247;
            class586.field8248--;
        }
        if (class420.field5904) {
            class420.field5904 = false;
            class62.method672(64);
            return;
        }
        if (!class34.field450) {
            class500.method3006(-26940);
        }
        for (int var1 = 0; var1 < 100 && class114.method942(0); var1++) {
        }
        if (class611.field8839 != 10) {
            return;
        }
        while (class193.method1350((byte) 80)) {
            class135 var2 = class273.method1801(class459.field6629, class327.field4634, 2);
            var2.field2109.method263((byte) -83, 0);
            int var3 = var2.field2109.field469;
            class4.method15(-3, var2.field2109);
            var2.field2109.method230(116, var2.field2109.field469 - var3);
            class539.method3178(var2, -18925);
        }
        if (class444.field6178 == null) {
            if (class742.method4128(1) >= class248.field3473) {
                class444.field6178 = class4.field58.method3392(class67.field1223.field8321, (byte) -103);
            }
        } else if (class444.field6178.field1275 != -1) {
            class135 var4 = class273.method1801(class459.field6629, class742.field10405, 2);
            var4.field2109.method223(1493807496, class444.field6178.field1275);
            class539.method3178(var4, -18925);
            class444.field6178 = null;
            class248.field3473 = class742.method4128(1) + 30000L;
        }
        class709 var5 = (class709) class119.field1862.method1522(true);
        if (var5 != null || class14.field160 < class742.method4128(1) - 2000L) {
            class135 var6 = null;
            int var7 = 0;
            for (class709 var8 = (class709) class702.field9854.method1522(true); var8 != null && (var6 == null || (var6.field2109.field469 - var7) < 240); var8 = (class709) class702.field9854.method1527((byte) 80)) {
                var8.method3617(1);
                int var9 = var8.method2002((byte) -111);
                if (var9 < -1) {
                    var9 = -1;
                } else if (var9 > 65534) {
                    var9 = 65534;
                }
                int var10 = var8.method2007(-24956);
                if (var10 < -1) {
                    var10 = -1;
                } else if (var10 > 65534) {
                    var10 = 65534;
                }
                if (class516.field7343 != var10 || class523.field7406 != var9) {
                    if (var6 == null) {
                        var6 = class273.method1801(class459.field6629, class526.field7476, 2);
                        class348.field4883++;
                        var6.field2109.method263((byte) 124, 0);
                        var7 = var6.field2109.field469;
                    }
                    int var11 = var10 - class516.field7343;
                    class516.field7343 = var10;
                    int var12 = var9 - class523.field7406;
                    class523.field7406 = var9;
                    int var13 = (int) ((var8.method2006(false) - class14.field160) / 20L);
                    if (var13 < 8 && var11 >= -32 && var11 <= 31 && var12 >= -32 && var12 <= 31) {
                        var11 += 32;
                        var12 += 32;
                        var6.field2109.method223(1493807496, (var11 << 6) + (var13 << 12) + var12);
                    } else if (var13 < 32 && var11 >= -128 && var11 <= 127 && var12 >= -128 && var12 <= 127) {
                        var11 += 128;
                        var6.field2109.method263((byte) -89, var13 + 128);
                        var12 += 128;
                        var6.field2109.method223(1493807496, (var11 << 8) + var12);
                    } else if (var13 < 32) {
                        var6.field2109.method263((byte) -85, var13 + 192);
                        if (var10 == 1 || var9 == -1) {
                            var6.field2109.method233(Integer.MIN_VALUE, -23162);
                        } else {
                            var6.field2109.method233(var9 << 16 | var10, -23162);
                        }
                    } else {
                        var6.field2109.method223(1493807496, var13 + 57344);
                        if (var10 == 1 || var9 == -1) {
                            var6.field2109.method233(Integer.MIN_VALUE, -23162);
                        } else {
                            var6.field2109.method233(var10 | var9 << 16, -23162);
                        }
                    }
                    class14.field160 = var8.method2006(false);
                }
            }
            if (var6 != null) {
                var6.field2109.method230(50, var6.field2109.field469 - var7);
                class539.method3178(var6, -18925);
            }
        }
        if (var5 != null) {
            long var14 = (var5.method2006(false) - class503.field7197) / 50L;
            if (var14 > 32767L) {
                var14 = 32767L;
            }
            class503.field7197 = var5.method2006(false);
            int var16 = var5.method2002((byte) -119);
            if (var16 < 0) {
                var16 = 0;
            } else if (var16 > 65535) {
                var16 = 65535;
            }
            int var17 = var5.method2007(-24956);
            if (var17 < 0) {
                var17 = 0;
            } else if (var17 > 65535) {
                var17 = 65535;
            }
            byte var18 = 0;
            if (var5.method2003(-4) == 2) {
                var18 = 1;
            }
            class624.field8971++;
            int var19 = (int) var14;
            class135 var20 = class273.method1801(class459.field6629, class49.field703, 2);
            var20.field2109.method233(var16 << 16 | var17, -23162);
            var20.field2109.method269(10543, var18 << 15 | var19);
            class539.method3178(var20, -18925);
        }
        if (class56.field1055 > 0) {
            class376.field5261++;
            class135 var21 = class273.method1801(class459.field6629, class10.field142, 2);
            var21.field2109.method263((byte) 79, class56.field1055 * 3);
            for (int var22 = 0; var22 < class56.field1055; var22++) {
                class602 var23 = class15.field193[var22];
                long var24 = (var23.method111(120) - class37.field568) / 50L;
                class37.field568 = var23.method111(126);
                if (var24 > 65535L) {
                    var24 = 65535L;
                }
                var21.field2109.method263((byte) 121, var23.method114(10721));
                var21.field2109.method223(1493807496, (int) var24);
            }
            class539.method3178(var21, -18925);
        }
        if (class256.field3703 > 0) {
            class256.field3703--;
        }
        if (class674.field9471 && class256.field3703 <= 0) {
            class256.field3703 = 20;
            class674.field9471 = false;
            class540.field7591++;
            class135 var26 = class273.method1801(class459.field6629, class228.field3252, 2);
            var26.field2109.method223(1493807496, (int) class321.field4568 >> 3);
            var26.field2109.method285(-128, (int) class432.field6035 >> 3);
            class539.method3178(var26, -18925);
        }
        if (class33.field439 != class126.field1918) {
            class126.field1918 = class33.field439;
            class465.field6725++;
            class135 var27 = class273.method1801(class459.field6629, class122.field1898, 2);
            var27.field2109.method263((byte) 127, class33.field439 ? 1 : 0);
            class539.method3178(var27, -18925);
        }
        if (!class671.field9412) {
            class706.field9885++;
            class135 var28 = class273.method1801(class459.field6629, class338.field4764, 2);
            var28.field2109.method263((byte) -107, 0);
            int var29 = var28.field2109.field469;
            class35 var30 = class471.field6781.method2819(-97);
            var28.field2109.method283(0, (byte) 95, var30.field483, var30.field469);
            var28.field2109.method230(106, var28.field2109.field469 - var29);
            class539.method3178(var28, -18925);
            class671.field9412 = true;
        }
        if (class390.field5454 != null) {
            if (class666.field9338 == 2) {
                class368.method2308((byte) -117);
            } else if (class666.field9338 == 3) {
                class228.method1567((byte) -112);
            }
        }
        if (class277.field3913) {
            class277.field3913 = false;
        } else {
            class15.field190 /= 2.0F;
        }
        if (class592.field8314) {
            class592.field8314 = false;
        } else {
            class390.field5450 /= 2.0F;
        }
        class253.method1716(-120);
        if (class611.field8839 != 10) {
            return;
        }
        class677.method3829((byte) -127);
        class172.method1260(118);
        class427.method2599(120);
        class425.field5950++;
        if (class425.field5950 > 750) {
            class62.method672(64);
            return;
        }
        class194.method1361(-15090);
        class429.method2606((byte) 100);
        class756.method4197((byte) -107);
        for (int var31 = class742.field10408.method3168(true, 14175); var31 != -1; var31 = class742.field10408.method3168(false, 14175)) {
            class688.method3870(var31, (byte) -90);
            class338.field4768[class555.method3246(31, class711.field9940++)] = var31;
        }
        for (class354 var32 = class701.method3943(false); var32 != null; var32 = class701.method3943(false)) {
            int var33 = var32.method2218((byte) -48);
            int var34 = var32.method2217(94);
            if (var33 == 1) {
                class41.field598[var34] = var32.field4990;
                class291.field4082 |= class104.field1738[var34];
                class87.field1580[class555.method3246(class206.field2946++, 31)] = var34;
            } else if (var33 == 2) {
                class526.field7477[var34] = var32.field4988;
                class27.field384[class555.method3246(31, class605.field8790++)] = var34;
            } else if (var33 == 3) {
                class50 var58 = class545.method3220(65535, var34);
                if (!var32.field4988.equals(var58.field859)) {
                    var58.field859 = var32.field4988;
                    class262.method1776(0, var58);
                }
            } else if (var33 == 4) {
                class50 var35 = class545.method3220(65535, var34);
                int var36 = var32.field4990;
                int var37 = var32.field4980;
                int var38 = var32.field4979;
                if (var35.field851 != var36 || var35.field780 != var37 || var35.field819 != var38) {
                    var35.field819 = var38;
                    var35.field851 = var36;
                    var35.field780 = var37;
                    class262.method1776(0, var35);
                }
            } else if (var33 == 5) {
                class50 var56 = class545.method3220(65535, var34);
                if (var32.field4990 != var56.field853 || var32.field4990 == -1) {
                    var56.field853 = var32.field4990;
                    var56.field798 = 1;
                    var56.field714 = 0;
                    var56.field751 = 0;
                    class718 var57 = var56.field853 == -1 ? null : class698.field9806.method851(var56.field853, -2);
                    if (var57 != null) {
                        class127.method984(-3991, var57, var56.field714);
                    }
                    class262.method1776(0, var56);
                }
            } else if (var33 == 6) {
                int var39 = var32.field4990;
                int var40 = var39 >> 10 & 0x1F;
                int var41 = var39 >> 5 & 0x1F;
                int var42 = var39 & 0x1F;
                int var43 = (var42 << 3) + (var40 << 19) + (var41 << 11);
                class50 var44 = class545.method3220(65535, var34);
                if (var44.field874 != var43) {
                    var44.field874 = var43;
                    class262.method1776(0, var44);
                }
            } else if (var33 == 7) {
                class50 var45 = class545.method3220(65535, var34);
                boolean var46 = var32.field4990 == 1;
                if (var45.field725 != var46) {
                    var45.field725 = var46;
                    class262.method1776(0, var45);
                }
            } else if (var33 == 8) {
                class50 var55 = class545.method3220(65535, var34);
                if (var32.field4990 != var55.field875 || var32.field4980 != var55.field733 || var32.field4979 != var55.field753) {
                    var55.field875 = var32.field4990;
                    var55.field733 = var32.field4980;
                    var55.field753 = var32.field4979;
                    if (var55.field861 != -1) {
                        if (var55.field814 > 0) {
                            var55.field753 = var55.field753 * 32 / var55.field814;
                        } else if (var55.field721 > 0) {
                            var55.field753 = var55.field753 * 32 / var55.field721;
                        }
                    }
                    class262.method1776(0, var55);
                }
            } else if (var33 == 9) {
                class50 var54 = class545.method3220(65535, var34);
                if (var32.field4990 != var54.field861 || var32.field4980 != var54.field748) {
                    var54.field861 = var32.field4990;
                    var54.field748 = var32.field4980;
                    class262.method1776(0, var54);
                }
            } else if (var33 == 10) {
                class50 var53 = class545.method3220(65535, var34);
                if (var32.field4990 != var53.field776 || var32.field4980 != var53.field764 || var32.field4979 != var53.field838) {
                    var53.field838 = var32.field4979;
                    var53.field764 = var32.field4980;
                    var53.field776 = var32.field4990;
                    class262.method1776(0, var53);
                }
            } else if (var33 == 11) {
                class50 var52 = class545.method3220(65535, var34);
                var52.field793 = 0;
                var52.field719 = var52.field712 = var32.field4990;
                var52.field856 = var52.field855 = var32.field4980;
                var52.field747 = 0;
                class262.method1776(0, var52);
            } else if (var33 == 12) {
                class50 var50 = class545.method3220(65535, var34);
                int var51 = var32.field4990;
                if (var50 != null && var50.field765 == 0) {
                    if (var50.field779 - var50.field830 < var51) {
                        var51 = var50.field779 - var50.field830;
                    }
                    if (var51 < 0) {
                        var51 = 0;
                    }
                    if (var50.field869 != var51) {
                        var50.field869 = var51;
                        class262.method1776(0, var50);
                    }
                }
            } else if (var33 == 14) {
                class50 var47 = class545.method3220(65535, var34);
                var47.field823 = var32.field4990;
            } else if (var33 == 15) {
                class318.field4513 = var32.field4990;
                class334.field4722 = var32.field4980;
                class726.field10161 = true;
            } else if (var33 == 16) {
                class50 var48 = class545.method3220(65535, var34);
                var48.field801 = var32.field4990;
            } else if (var33 == 17) {
                class50 var49 = class545.method3220(65535, var34);
                var49.field803 = var32.field4990;
            }
        }
        if (class369.field5174 != 0) {
            class217.field3092 += 20;
            if (class217.field3092 >= 400) {
                class369.field5174 = 0;
            }
        }
        class373.field5232++;
        if (class153.field2303 != null) {
            class58.field1072++;
            if (class58.field1072 >= 15) {
                class262.method1776(0, class153.field2303);
                class153.field2303 = null;
            }
        }
        class34.field454 = false;
        class512.field7312 = null;
        class755.field10515 = null;
        class394.field5523 = false;
        class62.method671(-1, -1, -71, null);
        class181.method1301(-1, arg0, null, -1);
        if (!class737.field10375) {
            class458.field6611 = -1;
        }
        class361.method2247((byte) -8);
        class374.field5247++;
        if (class26.field376) {
            class579.field8179++;
            class135 var59 = class273.method1801(class459.field6629, class41.field608, 2);
            var59.field2109.method238((byte) -71, class548.field7719 | class462.field6659 << 28 | class741.field10397 << 14);
            class539.method3178(var59, -18925);
            class26.field376 = false;
        }
        while (true) {
            class604 var60;
            class50 var61;
            class50 var62;
            do {
                var60 = (class604) class321.field4556.method1521(118);
                if (var60 == null) {
                    while (true) {
                        class604 var63;
                        class50 var64;
                        class50 var65;
                        do {
                            var63 = (class604) class62.field1134.method1521(116);
                            if (var63 == null) {
                                while (true) {
                                    class604 var66;
                                    class50 var67;
                                    class50 var68;
                                    do {
                                        var66 = (class604) class35.field474.method1521(119);
                                        if (var66 == null) {
                                            if (class512.field7312 == null) {
                                                class513.field7316 = 0;
                                            }
                                            if (class755.field10512 != null) {
                                                class594.method3467((byte) -115);
                                            }
                                            if (class79.field1485 > 0 && class167.field2461.method1540(119, 82) && class167.field2461.method1540(127, 81) && class668.field9367 != 0) {
                                                int var69 = class468.field6748.field649 - class668.field9367;
                                                if (var69 < 0) {
                                                    var69 = 0;
                                                } else if (var69 > 3) {
                                                    var69 = 3;
                                                }
                                                class698.method3921(class468.field6748.field991[0] + class115.field1845, var69, class468.field6748.field995[0] + class64.field1160, (byte) -105);
                                            }
                                            class202.method1414((byte) 84);
                                            for (int var70 = 0; var70 < 5; var70++) {
                                                int var10002 = class587.field8265[var70]++;
                                            }
                                            if (class291.field4082 && class742.method4128(1) - 60000L > class363.field5094) {
                                                class217.method1509(122);
                                            }
                                            for (class426 var71 = (class426) class158.field2358.method4159(0); var71 != null; var71 = (class426) class158.field2358.method4151(7)) {
                                                if ((long) var71.field5960 < class742.method4128(1) / 1000L - 5L) {
                                                    if (var71.field5952 > 0) {
                                                        class541.method3185("", "", var71.field5961 + class281.field3960.method1839((byte) 45, class744.field10426), 0, 5, 6642, "");
                                                    }
                                                    if (var71.field5952 == 0) {
                                                        class541.method3185("", "", var71.field5961 + class281.field3961.method1839((byte) 45, class744.field10426), 0, 5, 6642, "");
                                                    }
                                                    var71.method909(38);
                                                }
                                            }
                                            class205.field2931++;
                                            if (class205.field2931 > 500) {
                                                class205.field2931 = 0;
                                                int var72 = (int) (Math.random() * 8.0D);
                                                if ((var72 & 0x2) == 2) {
                                                    class362.field5077 += class338.field4765;
                                                }
                                                if ((var72 & 0x4) == 4) {
                                                    class535.field7552 += class245.field3416;
                                                }
                                                if ((var72 & 0x1) == 1) {
                                                    class352.field4960 += class693.field9747;
                                                }
                                            }
                                            if (class352.field4960 < -50) {
                                                class693.field9747 = 2;
                                            }
                                            if (class352.field4960 > 50) {
                                                class693.field9747 = -2;
                                            }
                                            if (class362.field5077 < -55) {
                                                class338.field4765 = 2;
                                            }
                                            if (class362.field5077 > 55) {
                                                class338.field4765 = -2;
                                            }
                                            if (class535.field7552 < -40) {
                                                class245.field3416 = 1;
                                            }
                                            if (class535.field7552 > 40) {
                                                class245.field3416 = -1;
                                            }
                                            class309.field4363++;
                                            if (class309.field4363 > 500) {
                                                class309.field4363 = 0;
                                                int var73 = (int) (Math.random() * 8.0D);
                                                if ((var73 & 0x1) == 1) {
                                                    class440.field6138 += class18.field237;
                                                }
                                                if ((var73 & 0x2) == 2) {
                                                    class113.field1812 += class682.field9593;
                                                }
                                            }
                                            if (class440.field6138 < -60) {
                                                class18.field237 = 2;
                                            }
                                            if (class440.field6138 > 60) {
                                                class18.field237 = -2;
                                            }
                                            if (class113.field1812 < -20) {
                                                class682.field9593 = 1;
                                            }
                                            if (class113.field1812 > 10) {
                                                class682.field9593 = -1;
                                            }
                                            class373.field5241++;
                                            if (class373.field5241 > 50) {
                                                class21.field267++;
                                                class135 var74 = class273.method1801(class459.field6629, class392.field5505, 2);
                                                class539.method3178(var74, -18925);
                                            }
                                            if (class462.field6656) {
                                                class143.method1122((byte) -124);
                                                class462.field6656 = false;
                                            }
                                            try {
                                                class464.method2823((byte) 115);
                                                return;
                                            } catch (IOException var75) {
                                                class62.method672(64);
                                                return;
                                            }
                                        }
                                        var67 = var66.field8782;
                                        if (var67.field807 < 0) {
                                            break;
                                        }
                                        var68 = class545.method3220(65535, var67.field791);
                                    } while (var68 == null || var68.field863 == null || var67.field807 >= var68.field863.length || var68.field863[var67.field807] != var67);
                                    class357.method2223(var66);
                                }
                            }
                            var64 = var63.field8782;
                            if (var64.field807 < 0) {
                                break;
                            }
                            var65 = class545.method3220(65535, var64.field791);
                        } while (var65 == null || var65.field863 == null || var64.field807 >= var65.field863.length || var65.field863[var64.field807] != var64);
                        class357.method2223(var63);
                    }
                }
                var61 = var60.field8782;
                if (var61.field807 < 0) {
                    break;
                }
                var62 = class545.method3220(65535, var61.field791);
            } while (var62 == null || var62.field863 == null || var61.field807 >= var62.field863.length || var62.field863[var61.field807] != var61);
            class357.method2223(var60);
        }
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(BIILjava/awt/Canvas;Ld;)Lha;")
    public static final class58 method2111(byte arg0, int arg1, int arg2, Canvas arg3, class149 arg4) {
        field4667++;
        if (arg0 != 117) {
            field4671 = -62L;
        }
        return new class691(arg3, arg4, arg1, arg2);
    }
}
