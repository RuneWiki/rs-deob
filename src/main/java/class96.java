import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public class class96 {

    @OriginalMember(owner = "client!s", name = "f", descriptor = "I")
    public int field1560 = -1;

    @OriginalMember(owner = "client!s", name = "n", descriptor = "I")
    public int field1568 = -1;

    @OriginalMember(owner = "client!s", name = "m", descriptor = "I")
    public int field1567 = -1;

    @OriginalMember(owner = "client!s", name = "r", descriptor = "I")
    public int field1572 = -1;

    @OriginalMember(owner = "client!s", name = "s", descriptor = "Z")
    public boolean field1573 = false;

    @OriginalMember(owner = "client!s", name = "h", descriptor = "I")
    public int field1562 = 5;

    @OriginalMember(owner = "client!s", name = "p", descriptor = "Z")
    private boolean field1570 = false;

    @OriginalMember(owner = "client!s", name = "B", descriptor = "I")
    public int field1582 = -1;

    @OriginalMember(owner = "client!s", name = "q", descriptor = "I")
    public int field1571 = 2;

    @OriginalMember(owner = "client!s", name = "I", descriptor = "I")
    public int field1589 = 99;

    @OriginalMember(owner = "client!s", name = "c", descriptor = "[S")
    public static short[] field1557 = new short[256];

    @OriginalMember(owner = "client!s", name = "d", descriptor = "Lmh;")
    public static class62 field1558 = class201.method1405(true, "blinken3:");

    @OriginalMember(owner = "client!s", name = "L", descriptor = "Lmh;")
    public static class62 field1591 = class201.method1405(true, "gleiten:");

    @OriginalMember(owner = "client!s", name = "b", descriptor = "I")
    public static int field1556;

    @OriginalMember(owner = "client!s", name = "e", descriptor = "I")
    public static int field1559;

    @OriginalMember(owner = "client!s", name = "j", descriptor = "I")
    public static int field1564;

    @OriginalMember(owner = "client!s", name = "k", descriptor = "I")
    public static int field1565;

    @OriginalMember(owner = "client!s", name = "l", descriptor = "I")
    public static int field1566;

    @OriginalMember(owner = "client!s", name = "o", descriptor = "I")
    public static int field1569;

    @OriginalMember(owner = "client!s", name = "t", descriptor = "I")
    public static int field1574;

    @OriginalMember(owner = "client!s", name = "u", descriptor = "I")
    public static int field1575;

    @OriginalMember(owner = "client!s", name = "w", descriptor = "I")
    public static int field1577;

    @OriginalMember(owner = "client!s", name = "x", descriptor = "I")
    public static int field1578;

    @OriginalMember(owner = "client!s", name = "z", descriptor = "I")
    public static int field1580;

    @OriginalMember(owner = "client!s", name = "A", descriptor = "I")
    public static int field1581;

    @OriginalMember(owner = "client!s", name = "C", descriptor = "I")
    public static int field1583;

    @OriginalMember(owner = "client!s", name = "D", descriptor = "I")
    public static int field1584;

    @OriginalMember(owner = "client!s", name = "E", descriptor = "I")
    public static int field1585;

    @OriginalMember(owner = "client!s", name = "G", descriptor = "I")
    public static int field1587;

    @OriginalMember(owner = "client!s", name = "H", descriptor = "I")
    public static int field1588;

    @OriginalMember(owner = "client!s", name = "K", descriptor = "I")
    public static int field1590;

    @OriginalMember(owner = "client!s", name = "N", descriptor = "I")
    public static int field1592;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "[I")
    public int[] field1555;

    @OriginalMember(owner = "client!s", name = "v", descriptor = "[I")
    private int[] field1576;

    @OriginalMember(owner = "client!s", name = "y", descriptor = "[I")
    private int[] field1579;

    @OriginalMember(owner = "client!s", name = "F", descriptor = "[I")
    public int[] field1586;

    @OriginalMember(owner = "client!s", name = "g", descriptor = "[[I")
    public int[][] field1561;

    @OriginalMember(owner = "client!s", name = "i", descriptor = "[[I")
    public static int[][] field1563;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(II[[IIIZI[[FIBBLmk;[[F[[FII)V", line = 6)
    public static final void method762(int arg0, int arg1, int[][] arg2, int arg3, int arg4, boolean arg5, int arg6, float[][] arg7, int arg8, byte arg9, byte arg10, class224 arg11, float[][] arg12, float[][] arg13, int arg14, int arg15) {
        field1575++;
        int var16 = (arg4 << 8) + 255;
        int var17 = (arg1 << 8) + 255;
        if (arg8 != 5) {
            field1591 = (class62) null;
        }
        int var18 = (arg6 << 8) + 255;
        int var19 = (arg14 << 8) + 255;
        int[] var20 = null;
        int[] var21 = class194.field3270[arg10];
        int[] var22 = new int[var21.length >> 1];
        for (int var23 = 0; var23 < var22.length; var23++) {
            var22[var23] = class251.method1745(var21[var23 + var23], arg15, arg2, arg11, arg0, var18, (int[][]) null, 0.0F, arg7, var19, arg12, arg13, (byte) -92, var21[var23 + var23 + 1], var16, var17, arg9, false);
        }
        if (arg5) {
            if (arg10 == 1) {
                int var25 = class251.method1745(64, arg15, arg2, arg11, arg0, var18, (int[][]) null, 0.0F, arg7, var19, arg12, arg13, (byte) -68, 128, var16, var17, arg9, true);
                var20 = new int[6];
                int var26 = class251.method1745(128, arg15, arg2, arg11, arg0, var18, (int[][]) null, 0.0F, arg7, var19, arg12, arg13, (byte) 97, 64, var16, var17, arg9, true);
                var20[0] = var26;
                var20[2] = var22[2];
                var20[1] = var25;
                var20[3] = var25;
                var20[4] = var22[0];
                var20[5] = var22[2];
            } else if (arg10 == 2) {
                int var42 = class251.method1745(128, arg15, arg2, arg11, arg0, var18, (int[][]) null, 0.0F, arg7, var19, arg12, arg13, (byte) 108, 128, var16, var17, arg9, true);
                var20 = new int[6];
                int var43 = class251.method1745(64, arg15, arg2, arg11, arg0, var18, (int[][]) null, 0.0F, arg7, var19, arg12, arg13, (byte) -72, 0, var16, var17, arg9, true);
                var20[1] = var43;
                var20[0] = var22[0];
                var20[2] = var42;
                var20[3] = var42;
                var20[4] = var22[1];
                var20[5] = var22[0];
            } else if (arg10 == 3) {
                int var40 = class251.method1745(0, arg15, arg2, arg11, arg0, var18, (int[][]) null, 0.0F, arg7, var19, arg12, arg13, (byte) -123, 128, var16, var17, arg9, true);
                var20 = new int[6];
                int var41 = class251.method1745(64, arg15, arg2, arg11, arg0, var18, (int[][]) null, 0.0F, arg7, var19, arg12, arg13, (byte) -73, 0, var16, var17, arg9, true);
                var20[4] = var41;
                var20[0] = var22[2];
                var20[1] = var22[1];
                var20[2] = var40;
                var20[3] = var40;
                var20[5] = var22[2];
            } else if (arg10 == 4) {
                var20 = new int[3];
                int var27 = class251.method1745(0, arg15, arg2, arg11, arg0, var18, (int[][]) null, 0.0F, arg7, var19, arg12, arg13, (byte) -94, 128, var16, var17, arg9, true);
                var20[0] = var22[3];
                var20[1] = var27;
                var20[2] = var22[0];
            } else if (arg10 == 5) {
                var20 = new int[3];
                int var39 = class251.method1745(128, arg15, arg2, arg11, arg0, var18, (int[][]) null, 0.0F, arg7, var19, arg12, arg13, (byte) 114, 128, var16, var17, arg9, true);
                var20[0] = var22[2];
                var20[2] = var22[3];
                var20[1] = var39;
            } else if (arg10 == 6) {
                var20 = new int[6];
                int var37 = class251.method1745(128, arg15, arg2, arg11, arg0, var18, (int[][]) null, 0.0F, arg7, var19, arg12, arg13, (byte) -58, 0, var16, var17, arg9, true);
                int var38 = class251.method1745(128, arg15, arg2, arg11, arg0, var18, (int[][]) null, 0.0F, arg7, var19, arg12, arg13, (byte) -70, 128, var16, var17, arg9, true);
                var20[2] = var38;
                var20[1] = var37;
                var20[0] = var22[3];
                var20[3] = var38;
                var20[5] = var22[3];
                var20[4] = var22[0];
            } else if (arg10 == 7) {
                int var35 = class251.method1745(0, arg15, arg2, arg11, arg0, var18, (int[][]) null, 0.0F, arg7, var19, arg12, arg13, (byte) 108, 128, var16, var17, arg9, true);
                var20 = new int[6];
                int var36 = class251.method1745(128, arg15, arg2, arg11, arg0, var18, (int[][]) null, 0.0F, arg7, var19, arg12, arg13, (byte) -42, 0, var16, var17, arg9, true);
                var20[2] = var35;
                var20[4] = var22[2];
                var20[3] = var35;
                var20[0] = var22[1];
                var20[1] = var36;
                var20[5] = var22[1];
            } else if (arg10 == 8) {
                int var34 = class251.method1745(0, arg15, arg2, arg11, arg0, var18, (int[][]) null, 0.0F, arg7, var19, arg12, arg13, (byte) 80, 0, var16, var17, arg9, true);
                var20 = new int[] { var22[3], var34, var22[4] };
            } else if (arg10 == 9) {
                var20 = new int[15];
                int var31 = class251.method1745(128, arg15, arg2, arg11, arg0, var18, (int[][]) null, 0.0F, arg7, var19, arg12, arg13, (byte) -48, 64, var16, var17, arg9, true);
                int var32 = class251.method1745(96, arg15, arg2, arg11, arg0, var18, (int[][]) null, 0.0F, arg7, var19, arg12, arg13, (byte) 111, 32, var16, var17, arg9, true);
                int var33 = class251.method1745(64, arg15, arg2, arg11, arg0, var18, (int[][]) null, 0.0F, arg7, var19, arg12, arg13, (byte) 125, 0, var16, var17, arg9, true);
                var20[2] = var22[4];
                var20[3] = var32;
                var20[7] = var22[3];
                var20[9] = var32;
                var20[5] = var22[3];
                var20[6] = var32;
                var20[12] = var32;
                var20[14] = var33;
                var20[1] = var31;
                var20[0] = var32;
                var20[13] = var22[1];
                var20[8] = var22[2];
                var20[10] = var22[2];
                var20[4] = var22[4];
                var20[11] = var22[1];
            } else if (arg10 == 10) {
                var20 = new int[9];
                int var30 = class251.method1745(0, arg15, arg2, arg11, arg0, var18, (int[][]) null, 0.0F, arg7, var19, arg12, arg13, (byte) 106, 128, var16, var17, arg9, true);
                var20[1] = var30;
                var20[4] = var30;
                var20[5] = var22[4];
                var20[0] = var22[2];
                var20[2] = var22[3];
                var20[3] = var22[3];
                var20[7] = var30;
                var20[6] = var22[4];
                var20[8] = var22[0];
            } else if (arg10 == 11) {
                var20 = new int[12];
                int var28 = class251.method1745(0, arg15, arg2, arg11, arg0, var18, (int[][]) null, 0.0F, arg7, var19, arg12, arg13, (byte) -100, 64, var16, var17, arg9, true);
                int var29 = class251.method1745(128, arg15, arg2, arg11, arg0, var18, (int[][]) null, 0.0F, arg7, var19, arg12, arg13, (byte) 127, 64, var16, var17, arg9, true);
                var20[1] = var28;
                var20[7] = var29;
                var20[0] = var22[3];
                var20[2] = var22[0];
                var20[10] = var22[1];
                var20[6] = var22[2];
                var20[5] = var28;
                var20[11] = var29;
                var20[9] = var22[2];
                var20[4] = var22[2];
                var20[8] = var28;
                var20[3] = var22[3];
            }
        }
        arg11.method1592(arg3, arg0, arg15, var22, var20, false);
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(I)V", line = 284)
    public static final void method763(int arg0) {
        field1585++;
        int var1 = class296.field5047.method2040(class57.field837);
        for (int var2 = 0; var2 < class195.field3293; var2++) {
            int var3 = class296.field5047.method2040(class2.method14(var2, true));
            if (var3 > var1) {
                var1 = var3;
            }
        }
        var1 += 8;
        int var4 = class195.field3293 * 15 + 21;
        if (arg0 != 18141) {
            field1591 = (class62) null;
        }
        int var5 = class45.field678 - var1 / 2;
        int var6 = class113.field1883;
        if (var4 + var6 > class60.field878) {
            var6 = class60.field878 - var4;
        }
        if (var6 < 0) {
            var6 = 0;
        }
        if (class306.field5258 < (var1 + var5)) {
            var5 = class306.field5258 - var1;
        }
        if (var5 < 0) {
            var5 = 0;
        }
        if (class218.field3769 == 1) {
            if (class45.field678 == class2.field25 && class155.field2501 == class113.field1883) {
                class80.field1341 = true;
                class162.field2632 = var6;
                class250.field4246 = var1;
                class206.field3498 = var5;
                class218.field3769 = 0;
                class276.field4751 = class195.field3293 * 15 + 22;
            }
        } else if (class45.field678 == class171.field2786 && class207.field3520 == class113.field1883) {
            class206.field3498 = var5;
            class162.field2632 = var6;
            class276.field4751 = class195.field3293 * 15 + 22;
            class80.field1341 = true;
            class218.field3769 = 0;
            class250.field4246 = var1;
        } else {
            class218.field3769 = 1;
            class155.field2501 = class207.field3520;
            class2.field25 = class171.field2786;
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Ls;IIILab;)Lab;", line = 375)
    public final class138 method764(class96 arg0, int arg1, int arg2, int arg3, class138 arg4) {
        int var6 = this.field1586[arg3];
        field1565++;
        if (arg2 < 51) {
            this.field1586 = (int[]) null;
        }
        class170 var7 = class249.method1733(105, var6 >> 16);
        int var8 = var6 & 0xFFFF;
        if (var7 == null) {
            return arg0.method775(arg1, arg4, -1);
        }
        int var9 = arg0.field1586[arg1];
        class170 var10 = class249.method1733(94, var9 >> 16);
        int var11 = var9 & 0xFFFF;
        if (var10 == null) {
            class138 var12 = arg4.method495(!var7.method1223(var8, (byte) -124), !this.field1570);
            var12.method475(var7, var8, this.field1570);
            return var12;
        } else {
            class138 var13 = arg4.method495(!var7.method1223(var8, (byte) -116) & !var10.method1223(var11, (byte) -126), !this.field1570 & !arg0.field1570);
            var13.method491(var7, var8, var10, var11, this.field1576, this.field1570 | arg0.field1570);
            return var13;
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(B)Lmh;", line = 410)
    public static final class62 method765(byte arg0) {
        int var1 = -13 % ((-arg0 - 76) / 42);
        field1564++;
        class62 var2 = class35.field468;
        if (class101.field1669 != 0) {
            var2 = class90.field1423;
        }
        return class254.method1772(new class62[] { class195.field3307, var2, class19.field181, class42.method284(class185.field2964, -126), class207.field3515, class42.method284(class291.field4950, -117), class70.field1072 }, 0);
    }

    @OriginalMember(owner = "client!s", name = "b", descriptor = "(I)V", line = 444)
    public static final void method766(int arg0) {
        for (class148 var1 = (class148) class68.field1053.method334(-18673); var1 != null; var1 = (class148) class68.field1053.method335((byte) 66)) {
            if (var1.field2336 == -1) {
                var1.field2339 = 0;
                class228.method1611(var1, -1);
            } else {
                var1.method1444((byte) 89);
            }
        }
        field1581++;
        if (arg0 != 0) {
            field1563 = (int[][]) ((int[][]) null);
        }
    }

    @OriginalMember(owner = "client!s", name = "b", descriptor = "(B)V", line = 468)
    public static final void method767(byte arg0) {
        if (class269.field4563 == null || class63.field953 == null) {
            class63.field953 = new int[256];
            class269.field4563 = new int[256];
            for (int var1 = 0; var1 < 256; var1++) {
                double var2 = (double) var1 / 255.0D * 6.283185307179586D;
                class269.field4563[var1] = (int) (Math.sin(var2) * 4096.0D);
                class63.field953[var1] = (int) (Math.cos(var2) * 4096.0D);
            }
        }
        int var4 = -116 / ((32 - arg0) / 43);
        field1578++;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(BII)I", line = 507)
    public static final int method768(byte arg0, int arg1, int arg2) {
        int var3 = 113 % ((-arg0 - 25) / 32);
        int var4 = arg1 - 1 & arg2 >> 31;
        field1580++;
        return (arg2 + (arg2 >>> 31)) % arg1 + var4;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(ZILsg;II)V", line = 520)
    public static final void method769(boolean arg0, int arg1, class191 arg2, int arg3, int arg4) {
        int var5 = arg2.field3190;
        if (arg2.field3062 == 0) {
            arg2.field3190 = arg2.field3163;
        } else if (arg2.field3062 == 1) {
            arg2.field3190 = arg4 - arg2.field3163;
        } else if (arg2.field3062 == 2) {
            arg2.field3190 = arg2.field3163 * arg4 >> 14;
        } else if (arg2.field3062 == 3) {
            if (arg2.field3068 == 2) {
                arg2.field3190 = (arg2.field3163 - 1) * arg2.field3201 + arg2.field3163 * 32;
            } else if (arg2.field3068 == 7) {
                arg2.field3190 = (arg2.field3163 - 1) * arg2.field3201 + arg2.field3163 * 115;
            }
        }
        field1590++;
        int var6 = arg2.field3126;
        if (arg2.field3046 == 0) {
            arg2.field3126 = arg2.field3128;
        } else if (arg2.field3046 == 1) {
            arg2.field3126 = arg1 - arg2.field3128;
        } else if (arg2.field3046 == 2) {
            arg2.field3126 = arg2.field3128 * arg1 >> 14;
        } else if (arg2.field3046 == 3) {
            if (arg2.field3068 == 2) {
                arg2.field3126 = (arg2.field3128 - 1) * arg2.field3122 + arg2.field3128 * 32;
            } else if (arg2.field3068 == 7) {
                arg2.field3126 = (arg2.field3128 - 1) * arg2.field3122 + arg2.field3128 * 12;
            }
        }
        if (arg3 != 1) {
            field1591 = (class62) null;
        }
        if (arg2.field3062 == 4) {
            arg2.field3190 = arg2.field3144 * arg2.field3126 / arg2.field3181;
        }
        if (arg2.field3046 == 4) {
            arg2.field3126 = arg2.field3190 * arg2.field3181 / arg2.field3144;
        }
        if (class263.field4433 && (client.method2058(arg2) != 0 || arg2.field3068 == 0)) {
            if (arg2.field3126 < 5 && arg2.field3190 < 5) {
                arg2.field3190 = 5;
                arg2.field3126 = 5;
            } else {
                if (arg2.field3190 <= 0) {
                    arg2.field3190 = 5;
                }
                if (arg2.field3126 <= 0) {
                    arg2.field3126 = 5;
                }
            }
        }
        if (arg2.field3083 == 1337) {
            class297.field5074 = arg2;
        }
        if (arg0 && arg2.field3117 != null && (arg2.field3190 != var5 || arg2.field3126 != var6)) {
            class161 var7 = new class161();
            var7.field2597 = arg2;
            var7.field2598 = arg2.field3117;
            class116.field1945.method330(var7, -85);
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Z)V", line = 629)
    public static final void method770(boolean arg0) {
        if (arg0) {
            return;
        }
        field1577++;
        if (class118.field1983 == 10) {
            class276.method1889(-128, 28);
        }
        if (class118.field1983 == 30) {
            class276.method1889(-128, 25);
        }
    }

    @OriginalMember(owner = "client!s", name = "b", descriptor = "(Z)V", line = 645)
    public final void method771(boolean arg0) {
        field1556++;
        if (this.field1560 == -1) {
            if (this.field1576 == null) {
                this.field1560 = 0;
            } else {
                this.field1560 = 2;
            }
        }
        if (arg0) {
            field1591 = (class62) null;
        }
        if (this.field1582 != -1) {
            return;
        }
        if (this.field1576 == null) {
            this.field1582 = 0;
        } else {
            this.field1582 = 2;
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Lmi;I)V", line = 676)
    public final void method772(class92 arg0, int arg1) {
        if (arg1 != 24077) {
            this.method764((class96) null, -103, -115, -104, (class138) null);
        }
        while (true) {
            int var3 = arg0.method702(-1);
            if (var3 == 0) {
                field1584++;
                return;
            }
            this.method776(var3, arg0, arg1 ^ 0xFFFFFE2E);
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Lab;BI)Lab;", line = 697)
    public final class138 method773(class138 arg0, byte arg1, int arg2) {
        int var4 = this.field1586[arg2];
        class170 var5 = class249.method1733(arg1 ^ 0x79, var4 >> 16);
        field1559++;
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method482(true, true);
        }
        class138 var7 = arg0.method482(!var5.method1223(var6, (byte) -116), !this.field1570);
        if (arg1 != 77) {
            this.field1571 = 36;
        }
        var7.method475(var5, var6, this.field1570);
        return var7;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(ILna;)V", line = 732)
    public static final void method774(int arg0, class153 arg1) {
        field1592++;
        if (arg0 != 4977) {
            method766(-104);
        }
        class114 var2 = (class114) class243.field4134.method311((byte) 114, arg1.field2430.method451(86));
        if (var2 == null) {
            class271.method1857((class216) null, arg1, class7.field85, arg1.field3828[0], 99, 0, arg1.field3846[0], (class204) null);
        } else {
            var2.method893(2);
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(ILab;I)Lab;", line = 750)
    public final class138 method775(int arg0, class138 arg1, int arg2) {
        int var4 = this.field1586[arg0];
        class170 var5 = class249.method1733(80, var4 >> 16);
        int var6 = var4 & 0xFFFF;
        field1569++;
        if (var5 == null) {
            return arg1.method495(true, true);
        } else if (arg2 == -1) {
            class138 var7 = arg1.method495(!var5.method1223(var6, (byte) -109), !this.field1570);
            var7.method475(var5, var6, this.field1570);
            return var7;
        } else {
            return (class138) null;
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(ILmi;I)V", line = 788)
    private final void method776(int arg0, class92 arg1, int arg2) {
        if (arg2 != -24541) {
            this.field1571 = 102;
        }
        if (arg0 == 1) {
            int var4 = arg1.method721(19);
            this.field1555 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field1555[var5] = arg1.method721(30);
            }
            this.field1586 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                this.field1586[var6] = arg1.method721(class290.method1975(arg2, -24468));
            }
            for (int var7 = 0; var7 < var4; var7++) {
                this.field1586[var7] = (arg1.method721(29) << 16) + this.field1586[var7];
            }
        } else if (arg0 == 2) {
            this.field1568 = arg1.method721(45);
        } else if (arg0 == 3) {
            int var8 = arg1.method702(arg2 ^ 0x5FDC);
            this.field1576 = new int[var8 + 1];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field1576[var9] = arg1.method702(-1);
            }
            this.field1576[var8] = 9999999;
        } else if (arg0 == 4) {
            this.field1573 = true;
        } else if (arg0 == 5) {
            this.field1562 = arg1.method702(-1);
        } else if (arg0 == 6) {
            this.field1567 = arg1.method721(19);
        } else if (arg0 == 7) {
            this.field1572 = arg1.method721(54);
        } else if (arg0 == 8) {
            this.field1589 = arg1.method702(-1);
        } else if (arg0 == 9) {
            this.field1582 = arg1.method702(-1);
        } else if (arg0 == 10) {
            this.field1560 = arg1.method702(-1);
        } else if (arg0 == 11) {
            this.field1571 = arg1.method702(-1);
        } else if (arg0 == 12) {
            int var10 = arg1.method702(-1);
            this.field1579 = new int[var10];
            for (int var11 = 0; var11 < var10; var11++) {
                this.field1579[var11] = arg1.method721(class290.method1975(arg2, -24553));
            }
            for (int var12 = 0; var12 < var10; var12++) {
                this.field1579[var12] = (arg1.method721(61) << 16) + this.field1579[var12];
            }
        } else if (arg0 == 13) {
            int var13 = arg1.method721(arg2 ^ 0xFFFFA01A);
            this.field1561 = new int[var13][];
            for (int var14 = 0; var14 < var13; var14++) {
                int var15 = arg1.method702(-1);
                if (var15 > 0) {
                    this.field1561[var14] = new int[var15];
                    this.field1561[var14][0] = arg1.method737(-1);
                    for (int var16 = 1; var16 < var15; var16++) {
                        this.field1561[var14][var16] = arg1.method721(84);
                    }
                }
            }
        } else if (arg0 == 14) {
            this.field1570 = true;
        }
        field1583++;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IILab;Z)Lab;", line = 940)
    public final class138 method777(int arg0, int arg1, class138 arg2, boolean arg3) {
        field1574++;
        int var5 = this.field1586[arg1];
        class170 var6 = class249.method1733(24, var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method495(true, true);
        }
        int var8 = arg0 & 0x3;
        class138 var9 = arg2.method495(!var6.method1223(var7, (byte) -124), !this.field1570);
        if (var8 == 1) {
            var9.method486();
        } else if (var8 == 2) {
            var9.method488();
        } else if (var8 == 3) {
            var9.method501();
        }
        var9.method475(var6, var7, this.field1570);
        if (arg3) {
            method769(true, -2, (class191) null, -56, 30);
        }
        if (var8 == 1) {
            var9.method501();
        } else if (var8 == 2) {
            var9.method488();
        } else if (var8 == 3) {
            var9.method486();
        }
        return var9;
    }

    @OriginalMember(owner = "client!s", name = "c", descriptor = "(B)Lwg;", line = 994)
    public static final class24 method778(byte arg0) {
        if (arg0 < 114) {
            field1563 = (int[][]) ((int[][]) null);
        }
        field1588++;
        class178 var1 = new class178(class41.field626, class189.field3005, class183.field2931[0], class113.field1878[0], class15.field132[0], class184.field2940[0], class42.field645[0], class235.field4048);
        class135.method1020(-77);
        return var1;
    }

    @OriginalMember(owner = "client!s", name = "c", descriptor = "(Z)V", line = 1014)
    public static void method779(boolean arg0) {
        field1557 = null;
        field1591 = null;
        field1558 = null;
        if (arg0) {
            field1563 = (int[][]) null;
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Lab;IB)Lab;", line = 1036)
    public final class138 method780(class138 arg0, int arg1, byte arg2) {
        field1566++;
        int var4 = this.field1586[arg1];
        class170 var5 = class249.method1733(99, var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method495(true, true);
        }
        int var7 = -109 / ((arg2 - 7) / 34);
        int var8 = 0;
        class170 var9 = null;
        if (this.field1579 != null && arg1 < this.field1579.length) {
            int var10 = this.field1579[arg1];
            var9 = class249.method1733(118, var10 >> 16);
            var8 = var10 & 0xFFFF;
        }
        if (var9 == null || var8 == 65535) {
            class138 var12 = arg0.method495(!var5.method1223(var6, (byte) -127), !this.field1570);
            var12.method475(var5, var6, this.field1570);
            return var12;
        } else {
            class138 var11 = arg0.method495(!var5.method1223(var6, (byte) -111) & !var9.method1223(var8, (byte) -109), !this.field1570);
            var11.method475(var5, var6, this.field1570);
            var11.method475(var9, var8, this.field1570);
            return var11;
        }
    }
}
