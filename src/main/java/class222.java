import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fl")
public class class222 extends class53 {

    @OriginalMember(owner = "client!fl", name = "Ob", descriptor = "Lhc;")
    public static class171 field3928 = new class171(64);

    @OriginalMember(owner = "client!fl", name = "Tb", descriptor = "I")
    public static int field3933 = 0;

    @OriginalMember(owner = "client!fl", name = "Qb", descriptor = "Lud;")
    public static class279 field3930 = class130.method1024("Lade Benutzeroberfl-=che )2 ", 255);

    @OriginalMember(owner = "client!fl", name = "Yb", descriptor = "I")
    public static int field3938 = 0;

    @OriginalMember(owner = "client!fl", name = "Xb", descriptor = "S")
    public static short field3937 = 32767;

    @OriginalMember(owner = "client!fl", name = "Vb", descriptor = "I")
    public static int field3935 = -1;

    @OriginalMember(owner = "client!fl", name = "S", descriptor = "I")
    public static int field3914;

    @OriginalMember(owner = "client!fl", name = "Bb", descriptor = "I")
    public static int field3915;

    @OriginalMember(owner = "client!fl", name = "Cb", descriptor = "I")
    private int field3916;

    @OriginalMember(owner = "client!fl", name = "Db", descriptor = "I")
    public static int field3917;

    @OriginalMember(owner = "client!fl", name = "Eb", descriptor = "I")
    public static int field3918;

    @OriginalMember(owner = "client!fl", name = "Fb", descriptor = "I")
    public static int field3919;

    @OriginalMember(owner = "client!fl", name = "Gb", descriptor = "I")
    public static int field3920;

    @OriginalMember(owner = "client!fl", name = "Hb", descriptor = "I")
    public static int field3921;

    @OriginalMember(owner = "client!fl", name = "Ib", descriptor = "I")
    public static int field3922;

    @OriginalMember(owner = "client!fl", name = "Jb", descriptor = "I")
    public static int field3923;

    @OriginalMember(owner = "client!fl", name = "Kb", descriptor = "I")
    public static int field3924;

    @OriginalMember(owner = "client!fl", name = "Lb", descriptor = "I")
    public static int field3925;

    @OriginalMember(owner = "client!fl", name = "Mb", descriptor = "I")
    public static int field3926;

    @OriginalMember(owner = "client!fl", name = "Nb", descriptor = "I")
    public static int field3927;

    @OriginalMember(owner = "client!fl", name = "Ub", descriptor = "I")
    public static int field3934;

    @OriginalMember(owner = "client!fl", name = "Wb", descriptor = "I")
    public static int field3936;

    @OriginalMember(owner = "client!fl", name = "Sb", descriptor = "Lok;")
    public static class149 field3932;

    @OriginalMember(owner = "client!fl", name = "Pb", descriptor = "Lfk;")
    private class45 field3929;

    @OriginalMember(owner = "client!fl", name = "Rb", descriptor = "[[I")
    public static int[][] field3931;

    @OriginalMember(owner = "client!fl", name = "o", descriptor = "(I)V", line = 5)
    public static void method1623(int arg0) {
        field3928 = null;
        field3931 = (int[][]) null;
        field3930 = null;
        field3932 = null;
        if (arg0 != 304) {
            method1636(-56);
        }
    }

    @OriginalMember(owner = "client!fl", name = "c", descriptor = "(IZ)I", line = 19)
    public final int method1624(int arg0, boolean arg1) {
        field3923++;
        return arg1 ? -25 : arg0 * 8 - this.field3916;
    }

    @OriginalMember(owner = "client!fl", name = "p", descriptor = "(I)V", line = 34)
    public final void method1625(int arg0) {
        this.field3916 = this.field1142 * arg0;
        field3926++;
    }

    @OriginalMember(owner = "client!fl", name = "q", descriptor = "(I)I", line = 51)
    public final int method1626(int arg0) {
        field3934++;
        if (arg0 != 22186) {
            field3933 = 87;
        }
        return this.field1168[this.field1142++] - this.field3929.method386(false) & 0xFF;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "([II)V", line = 64)
    public final void method1627(int[] arg0, int arg1) {
        this.field3929 = new class45(arg0);
        if (arg1 == 1000000) {
            field3924++;
        }
    }

    @OriginalMember(owner = "client!fl", name = "i", descriptor = "(II)I", line = 83)
    public final int method1628(int arg0, int arg1) {
        int var3 = this.field3916 >> 3;
        field3917++;
        int var4 = -1 % ((-arg0 - 17) / 34);
        int var5 = 8 - (this.field3916 & 0x7);
        int var6 = 0;
        this.field3916 += arg1;
        while (arg1 > var5) {
            var6 += (class122.field2199[var5] & this.field1168[var3++]) << arg1 - var5;
            arg1 -= var5;
            var5 = 8;
        }
        int var7;
        if (arg1 == var5) {
            var7 = (this.field1168[var3] & class122.field2199[var5]) + var6;
        } else {
            var7 = (this.field1168[var3] >> var5 - arg1 & class122.field2199[arg1]) + var6;
        }
        return var7;
    }

    @OriginalMember(owner = "client!fl", name = "<init>", descriptor = "(I)V", line = 110)
    public class222(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(ILud;)I", line = 114)
    public static final int method1629(int arg0, class279 arg1) {
        field3922++;
        if (arg1 == null) {
            return -1;
        }
        int var2 = 0;
        if (arg0 <= 124) {
            method1636(22);
        }
        while (var2 < class167.field3011) {
            if (arg1.method2010(class100.field1861[var2], (byte) 122)) {
                return var2;
            }
            var2++;
        }
        return -1;
    }

    @OriginalMember(owner = "client!fl", name = "j", descriptor = "(II)V", line = 143)
    public static final void method1630(int arg0, int arg1) {
        class194.field3488--;
        if (arg1 >= -8) {
            method1632(-32, -55, -95, -16, -20);
        }
        field3915++;
        if (class194.field3488 == arg0) {
            return;
        }
        class25.method218(class171.field3089, arg0 + 1, class171.field3089, arg0, class194.field3488 - arg0);
        class25.method218(class184.field3373, arg0 + 1, class184.field3373, arg0, class194.field3488 - arg0);
        class25.method223(class75.field1469, arg0 + 1, class75.field1469, arg0, class194.field3488 - arg0);
        class25.method220(class271.field4828, arg0 + 1, class271.field4828, arg0, class194.field3488 - arg0);
        class25.method225(class154.field2790, arg0 + 1, class154.field2790, arg0, class194.field3488 - arg0);
        class25.method223(class212.field3722, arg0 + 1, class212.field3722, arg0, class194.field3488 - arg0);
        class25.method223(class304.field5400, arg0 + 1, class304.field5400, arg0, class194.field3488 - arg0);
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(II[I[II)V", line = 169)
    public static final void method1631(int arg0, int arg1, int[] arg2, int[] arg3, int arg4) {
        if (arg4 != -1) {
            method1629(-94, (class279) null);
        }
        field3918++;
        if (arg0 >= arg1) {
            return;
        }
        int var5 = (arg0 + arg1) / 2;
        int var6 = arg3[var5];
        arg3[var5] = arg3[arg1];
        int var7 = arg0;
        arg3[arg1] = var6;
        int var8 = arg2[var5];
        arg2[var5] = arg2[arg1];
        arg2[arg1] = var8;
        for (int var9 = arg0; var9 < arg1; var9++) {
            if ((var9 & 0x1) + var6 < arg3[var9]) {
                int var10 = arg3[var9];
                arg3[var9] = arg3[var7];
                arg3[var7] = var10;
                int var11 = arg2[var9];
                arg2[var9] = arg2[var7];
                arg2[var7++] = var11;
            }
        }
        arg3[arg1] = arg3[var7];
        arg3[var7] = var6;
        arg2[arg1] = arg2[var7];
        arg2[var7] = var8;
        method1631(arg0, var7 - 1, arg2, arg3, -1);
        method1631(var7 + 1, arg1, arg2, arg3, -1);
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(IIIII)V", line = 223)
    public static final void method1632(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3919++;
        if (class302.field5374 < 100) {
            class79.method660((byte) 48);
        }
        if (class97.field1824) {
            class256.method1830(arg2, arg0, arg2 + arg3, arg0 + arg4);
        } else {
            class146.method1127(arg2, arg0, arg2 + arg3, arg0 + arg4);
        }
        if (class302.field5374 < 100) {
            byte var14 = 20;
            int var15 = arg2 + (arg3 / 2);
            int var16 = arg4 / 2 + arg0 - var14 - 18;
            if (class97.field1824) {
                class256.method1827(arg2, arg0, arg3, arg4, 0);
                class256.method1839(var15 - 152, var16, 304, 34, 9179409);
                class256.method1839(var15 - 151, var16 + 1, 302, 32, 0);
                class256.method1827(var15 - 150, var16 + 2, class302.field5374 * 3, 30, 9179409);
                class256.method1827(class302.field5374 * 3 + var15 - 150, var16 + 2, 300 - (class302.field5374 * 3), 30, 0);
            } else {
                class146.method1110(arg2, arg0, arg3, arg4, 0);
                class146.method1124(var15 - 152, var16, 304, 34, 9179409);
                class146.method1124(var15 - 151, var16 + 1, 302, 32, 0);
                class146.method1110(var15 - 150, var16 + 2, class302.field5374 * 3, 30, 9179409);
                class146.method1110(var15 + (class302.field5374 * 3) - 150, var16 + 2, 300 - (class302.field5374 * 3), 30, 0);
            }
            class292.field5210.method409(class304.field5390, var15, var14 + var16, 16777215, -1);
            return;
        }
        class104.field1953 = (int) ((float) (arg4 * 2) / class52.field1071);
        class80.field1523 = class298.field5282 - ((int) ((float) arg4 / class52.field1071));
        class301.field5360 = (int) ((float) (arg3 * 2) / class52.field1071);
        int var5 = class265.field4776 - ((int) ((float) arg3 / class52.field1071));
        if (arg1 < 126) {
            field3931 = (int[][]) ((int[][]) null);
        }
        int var6 = class298.field5282 - ((int) ((float) arg4 / class52.field1071));
        class72.field1416 = class265.field4776 - (int) ((float) arg3 / class52.field1071);
        int var7 = class298.field5282 + ((int) ((float) arg4 / class52.field1071));
        int var8 = class265.field4776 + ((int) ((float) arg3 / class52.field1071));
        if (class97.field1824) {
            if (class302.field5371 == null || class302.field5371.field1377 != arg3 || class302.field5371.field1375 != arg4) {
                class302.field5371 = null;
                class302.field5371 = new class66(arg3, arg4);
            }
            class146.method1116(class302.field5371.field1323, arg3, arg4);
            class154.method1218(var5, var7, var6, 0, var8, arg4, (byte) 99, arg3, 0);
            client.method1801(var6, var7, arg4, 0, 0, false, var5, arg3, var8);
            class104.method876(var7, var6, arg4, var5, arg3, var8, 0, (byte) 114, 0);
            class256.method1832(class302.field5371.field1323, arg2, arg0, arg3, arg4);
            class146.field2637 = null;
        } else {
            class154.method1218(var5, var7, var6, arg2, var8, arg0 + arg4, (byte) 99, arg2 + arg3, arg0);
            client.method1801(var6, var7, arg0 + arg4, arg0, arg2, false, var5, arg2 + arg3, var8);
            class104.method876(var7, var6, arg0 + arg4, var5, arg2 + arg3, var8, arg2, (byte) 124, arg0);
        }
        if (class192.field3470 > 0) {
            class189.field3414--;
            if (class189.field3414 == 0) {
                class189.field3414 = 20;
                class192.field3470--;
            }
        }
        if (!class140.field2549) {
            return;
        }
        int var9 = arg2 + arg3 - 5;
        int var10 = arg0 + arg4 - 8;
        class133.field2428.method415(class115.method929(new class279[] { class163.field2944, class191.method1447(5, class318.field5584) }, (byte) 60), var9, var10, 16776960, -1);
        int var11 = 16776960;
        int var17 = var10 - 15;
        Runtime var12 = Runtime.getRuntime();
        int var13 = (int) ((var12.totalMemory() - var12.freeMemory()) / 1024L);
        if (var13 > 65536) {
            var11 = 16711680;
        }
        class133.field2428.method415(class115.method929(new class279[] { class48.field976, class191.method1447(5, var13), class34.field753 }, (byte) 60), var9, var17, var11, -1);
        var10 = var17 - 15;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(I[BII)V", line = 342)
    public final void method1633(int arg0, byte[] arg1, int arg2, int arg3) {
        field3920++;
        if (arg3 != 29497) {
            this.method1627((int[]) null, -125);
        }
        for (int var5 = 0; var5 < arg2; var5++) {
            arg1[arg0 + var5] = (byte) (this.field1168[this.field1142++] - this.field3929.method386(false));
        }
    }

    @OriginalMember(owner = "client!fl", name = "k", descriptor = "(II)V", line = 360)
    public final void method1634(int arg0, int arg1) {
        if (arg1 != 0) {
            this.method1628(-94, 63);
        }
        field3925++;
        this.field1168[this.field1142++] = (byte) (this.field3929.method386(false) + arg0);
    }

    @OriginalMember(owner = "client!fl", name = "e", descriptor = "(Z)V", line = 371)
    public final void method1635(boolean arg0) {
        this.field1142 = (this.field3916 + 7) / 8;
        if (arg0) {
            field3914++;
        }
    }

    @OriginalMember(owner = "client!fl", name = "r", descriptor = "(I)V", line = 385)
    public static final void method1636(int arg0) {
        field3927++;
        if (class212.method1558(17519) != 2) {
            return;
        }
        int var1 = class59.field1239 % 104;
        byte var2 = (byte) (class59.field1239 - 4 & 0xFF);
        if (arg0 > -3) {
            method1631(-68, -35, (int[]) null, (int[]) null, 101);
        }
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var4 = 0; var4 < 104; var4++) {
                class50.field1042[var3][var1][var4] = var2;
            }
        }
        if (class287.field5134 == 3) {
            return;
        }
        for (int var5 = 0; var5 < 2; var5++) {
            class73.field1441[var5] = -1000000;
            class323.field5648[var5] = 1000000;
            class182.field3351[var5] = 0;
            class142.field2582[var5] = 1000000;
            class75.field1474[var5] = 0;
        }
        if (class122.field2191 != 1) {
            int var6 = class130.method1025(class21.field589, 1008652135, class287.field5134, class92.field1747);
            if (var6 - class306.field5438 < 800 && (class257.field4573[class287.field5134][class21.field589 >> 7][class92.field1747 >> 7] & 0x4) != 0) {
                class216.method1585(class24.field619, class21.field589 >> 7, (byte) 121, 1, class92.field1747 >> 7, false);
            }
            return;
        }
        if ((class257.field4573[class287.field5134][class72.field1420.field86 >> 7][class72.field1420.field79 >> 7] & 0x4) != 0) {
            class216.method1585(class24.field619, class72.field1420.field86 >> 7, (byte) 89, 0, class72.field1420.field79 >> 7, false);
        }
        if (class62.field1278 >= 310) {
            return;
        }
        int var7 = class21.field589 >> 7;
        int var8 = class92.field1747 >> 7;
        int var9 = class72.field1420.field79 >> 7;
        int var10 = class72.field1420.field86 >> 7;
        int var11;
        if (var10 > var7) {
            var11 = var10 - var7;
        } else {
            var11 = var7 - var10;
        }
        int var12;
        if (var8 >= var9) {
            var12 = var8 - var9;
        } else {
            var12 = var9 - var8;
        }
        if (var11 <= var12) {
            int var15 = 32768;
            int var16 = var11 * 65536 / var12;
            while (var8 != var9) {
                if (var8 < var9) {
                    var8++;
                } else if (var9 < var8) {
                    var8--;
                }
                if ((class257.field4573[class287.field5134][var7][var8] & 0x4) != 0) {
                    class216.method1585(class24.field619, var7, (byte) 85, 1, var8, false);
                    break;
                }
                var15 += var16;
                if (var15 >= 65536) {
                    var15 -= 65536;
                    if (var7 < var10) {
                        var7++;
                    } else if (var7 > var10) {
                        var7--;
                    }
                    if ((class257.field4573[class287.field5134][var7][var8] & 0x4) != 0) {
                        class216.method1585(class24.field619, var7, (byte) 95, 1, var8, false);
                        break;
                    }
                }
            }
            return;
        }
        int var13 = var12 * 65536 / var11;
        int var14 = 32768;
        while (var7 != var10) {
            if (var10 > var7) {
                var7++;
            } else if (var10 < var7) {
                var7--;
            }
            if ((class257.field4573[class287.field5134][var7][var8] & 0x4) != 0) {
                class216.method1585(class24.field619, var7, (byte) 102, 1, var8, false);
                break;
            }
            var14 += var13;
            if (var14 >= 65536) {
                var14 -= 65536;
                if (var8 < var9) {
                    var8++;
                } else if (var8 > var9) {
                    var8--;
                }
                if ((class257.field4573[class287.field5134][var7][var8] & 0x4) != 0) {
                    class216.method1585(class24.field619, var7, (byte) 125, 1, var8, false);
                    break;
                }
            }
        }
    }
}
