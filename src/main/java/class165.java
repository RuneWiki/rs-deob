import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ll")
public class class165 extends class3 {

    @OriginalMember(owner = "client!ll", name = "S", descriptor = "I")
    private int field2607 = 585;

    @OriginalMember(owner = "client!ll", name = "H", descriptor = "J")
    public static long field2596 = 0L;

    @OriginalMember(owner = "client!ll", name = "N", descriptor = "[Lia;")
    public static class281[] field2602 = new class281[8];

    @OriginalMember(owner = "client!ll", name = "G", descriptor = "I")
    public static int field2595;

    @OriginalMember(owner = "client!ll", name = "J", descriptor = "I")
    public static int field2598;

    @OriginalMember(owner = "client!ll", name = "K", descriptor = "I")
    public static int field2599;

    @OriginalMember(owner = "client!ll", name = "L", descriptor = "I")
    public static int field2600;

    @OriginalMember(owner = "client!ll", name = "O", descriptor = "I")
    public static int field2603;

    @OriginalMember(owner = "client!ll", name = "P", descriptor = "I")
    public static int field2604;

    @OriginalMember(owner = "client!ll", name = "Q", descriptor = "I")
    public static int field2605;

    @OriginalMember(owner = "client!ll", name = "R", descriptor = "I")
    public static int field2606;

    @OriginalMember(owner = "client!ll", name = "M", descriptor = "Lnm;")
    public static class221 field2601;

    @OriginalMember(owner = "client!ll", name = "F", descriptor = "Lsi;")
    public static class264 field2594;

    @OriginalMember(owner = "client!ll", name = "I", descriptor = "Lqh;")
    public static class35 field2597;

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(SZ)Z", line = 8)
    public static final boolean method1149(short arg0, boolean arg1) {
        field2598++;
        if (arg0 == 7 || arg0 == 34 || arg0 == 17 || arg0 == 24 || arg0 == 22 || arg0 == 46 || arg0 == 50 || arg0 == 5) {
            return true;
        } else if (arg0 == 16 || arg0 == 49 || arg0 == 1002 || arg0 == 1004) {
            return true;
        } else if (arg0 == 18 || arg0 == 26 || arg0 == 13 || arg0 == 41 || arg0 == 39) {
            return true;
        } else if (arg0 == 3 || arg0 == 28 || arg0 == 57 || arg0 == 47 || arg0 == 11 || arg0 == 33) {
            return true;
        } else {
            if (!arg1) {
                method1153(-6, 2, 125, 35, (class162) null, 73L, true);
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(IB)Lpl;", line = 34)
    public static final class312 method1150(int arg0, byte arg1) {
        class312 var2 = (class312) class305.field4991.method652((long) arg0, false);
        field2603++;
        if (var2 != null) {
            return var2;
        }
        int var3 = 68 % ((arg1 - 7) / 44);
        byte[] var4 = class306.field4999.method1504(arg0, true, 36);
        class312 var5 = new class312();
        var5.field5101 = arg0;
        if (var4 != null) {
            var5.method2177(new class313(var4), (byte) -67);
        }
        class305.field4991.method642(var5, (long) arg0, -119);
        return var5;
    }

    @OriginalMember(owner = "client!ll", name = "e", descriptor = "(I)V", line = 56)
    public static final void method1151(int arg0) {
        field2600++;
        int var1 = class2.field7;
        int var2 = class53.field800;
        byte var3 = 20;
        int var4 = class235.field3732;
        int var5 = class265.field4362 - 3;
        if (class293.field4849 == null || class280.field4612 == null) {
            if (class69.field1073.method1519(false, class347.field5562) && class69.field1073.method1519(false, class258.field4096)) {
                class293.field4849 = class203.method1383(class347.field5562, 0, class69.field1073, true);
                class280.field4612 = class203.method1383(class258.field4096, 0, class69.field1073, true);
                if (class245.field3886) {
                    if ((class293.field4849 instanceof class362)) {
                        class293.field4849 = new class260((class137) class293.field4849);
                    } else {
                        class293.field4849 = new class232((class137) class293.field4849);
                    }
                    if (class280.field4612 instanceof class362) {
                        class280.field4612 = new class260((class137) class280.field4612);
                    } else {
                        class280.field4612 = new class232((class137) class280.field4612);
                    }
                }
            } else if (class245.field3886) {
                class335.method2365(var2, var1, var4, var3, class70.field1093, 256 - class241.field3781);
            } else {
                class317.method2270(var2, var1, var4, var3, class70.field1093, 256 - class241.field3781);
            }
        }
        if (class293.field4849 != null && class280.field4612 != null) {
            int var6 = (var4 - (class280.field4612.field4802 * 2)) / class293.field4849.field4802;
            for (int var7 = 0; var7 < var6; var7++) {
                class293.field4849.method945(class280.field4612.field4802 + var2 + (class293.field4849.field4802 * var7), var1);
            }
            class280.field4612.method945(var2, var1);
            class280.field4612.method963(var2 + var4 - class280.field4612.field4802, var1);
        }
        class31.field471.method1232(class242.field3821, var2 + 3, var1 + 14, class39.field601, -1);
        if (class245.field3886) {
            class335.method2365(var2, var1 + var3, var4, var5 - var3, class70.field1093, 256 - class241.field3781);
        } else {
            class317.method2270(var2, var1 + var3, var4, var5 - var3, class70.field1093, 256 - class241.field3781);
        }
        if (arg0 != -23337) {
            return;
        }
        int var8 = class130.field1982;
        int var9 = class305.field4988;
        for (int var10 = 0; var10 < class117.field1701; var10++) {
            int var11 = var3 + var1 + ((class117.field1701 - 1 + -var10) * 15) + 13;
            if (var9 > var2 && var9 < var2 + var4 && var8 > var11 - 13 && (var11 + 3) > var8) {
                if (class245.field3886) {
                    class335.method2365(var2, var11 - 12, var4, 15, class125.field1866, 256 - class250.field3994);
                } else {
                    class317.method2270(var2, var11 - 12, var4, 15, class125.field1866, 256 - class250.field3994);
                }
            }
        }
        if ((class94.field1377 == null || class125.field1872 == null || class339.field5456 == null) && class69.field1073.method1519(false, class275.field4543) && class69.field1073.method1519(false, class160.field2557) && class69.field1073.method1519(false, class6.field74)) {
            class94.field1377 = class203.method1383(class275.field4543, 0, class69.field1073, true);
            class125.field1872 = class203.method1383(class160.field2557, 0, class69.field1073, true);
            class339.field5456 = class203.method1383(class6.field74, 0, class69.field1073, true);
            if (class245.field3886) {
                if ((class94.field1377 instanceof class362)) {
                    class94.field1377 = new class260((class137) class94.field1377);
                } else {
                    class94.field1377 = new class232((class137) class94.field1377);
                }
                if ((class125.field1872 instanceof class362)) {
                    class125.field1872 = new class260((class137) class125.field1872);
                } else {
                    class125.field1872 = new class232((class137) class125.field1872);
                }
                if (class339.field5456 instanceof class362) {
                    class339.field5456 = new class260((class137) class339.field5456);
                } else {
                    class339.field5456 = new class232((class137) class339.field5456);
                }
            }
        }
        if (class94.field1377 != null && class125.field1872 != null && class339.field5456 != null) {
            int var12 = (var4 - (class339.field5456.field4802 * 2)) / class94.field1377.field4802;
            for (int var13 = 0; var13 < var12; var13++) {
                class94.field1377.method945(class94.field1377.field4802 * var13 + var2 + class339.field5456.field4802, -class94.field1377.field4811 + var5 + var1);
            }
            int var14 = (var5 - var3 - class339.field5456.field4811) / class125.field1872.field4811;
            for (int var15 = 0; var15 < var14; var15++) {
                class125.field1872.method945(var2, class125.field1872.field4811 * var15 + var1 + var3);
                class125.field1872.method963(var2 + var4 - class125.field1872.field4802, class125.field1872.field4811 * var15 + var1 + var3);
            }
            class339.field5456.method945(var2, var1 + var5 - class339.field5456.field4811);
            class339.field5456.method963(var2 + var4 - class339.field5456.field4802, -class339.field5456.field4811 + var1 + var5);
        }
        for (int var16 = 0; var16 < class117.field1701; var16++) {
            int var17 = var1 + var3 + ((-var16 + -1 + class117.field1701) * 15) + 13;
            int var18 = class39.field601;
            if (var9 > var2 && (var2 + var4) > var9 && var17 - 13 < var8 && var8 < (var17 + 3)) {
                var18 = class202.field3105;
            }
            class31.field471.method1232(client.method895(var16, 27003), var2 + 3, var17, var18, 0);
        }
        class213.method1452(class235.field3732, class265.field4362, class2.field7, (byte) 113, class53.field800);
    }

    @OriginalMember(owner = "client!ll", name = "<init>", descriptor = "()V", line = 231)
    public class165() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ll", name = "e", descriptor = "(B)V", line = 242)
    public static void method1152(byte arg0) {
        field2601 = null;
        field2602 = null;
        field2597 = null;
        int var1 = 44 % ((5 - arg0) / 37);
        field2594 = null;
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(IIIILkm;JZ)V", line = 253)
    public static final void method1153(int arg0, int arg1, int arg2, int arg3, class162 arg4, long arg5, boolean arg6) {
        if (arg4 == null) {
            return;
        }
        class86 var8 = new class86();
        var8.field1235 = arg4;
        var8.field1236 = arg1 * 128 + 64;
        var8.field1239 = arg2 * 128 + 64;
        var8.field1230 = arg3;
        var8.field1237 = arg5;
        var8.field1244 = arg6;
        if (class264.field4230[arg0][arg1][arg2] == null) {
            class264.field4230[arg0][arg1][arg2] = new class50(arg0, arg1, arg2);
        }
        class264.field4230[arg0][arg1][arg2].field733 = var8;
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(BI)[I", line = 278)
    public final int[] method25(byte arg0, int arg1) {
        if (arg0 <= 57) {
            method1155((byte) 5, 37);
        }
        field2599++;
        int[] var3 = this.field21.method1258(arg1, 0);
        if (this.field21.field2808) {
            int var4 = class159.field2546[arg1];
            for (int var5 = 0; var5 < class326.field5342; var5++) {
                int var6 = class163.field2591[var5];
                if (var6 > this.field2607 && (4096 - this.field2607) > var6 && var4 > (2048 - this.field2607) && this.field2607 + 2048 > var4) {
                    int var7 = 2048 - var6;
                    int var8 = var7 < 0 ? -var7 : var7;
                    int var9 = var8 << 12;
                    int var10 = var9 / (2048 - this.field2607);
                    var3[var5] = 4096 - var10;
                } else if (var6 > 2048 - this.field2607 && (this.field2607 + 2048) > var6) {
                    int var11 = var4 - 2048;
                    int var12 = var11 >= 0 ? var11 : -var11;
                    int var13 = var12 - this.field2607;
                    int var14 = var13 << 12;
                    var3[var5] = var14 / (2048 - this.field2607);
                } else if (this.field2607 > var4 || var4 > (4096 - this.field2607)) {
                    int var19 = var6 - 2048;
                    int var20 = var19 < 0 ? -var19 : var19;
                    int var21 = var20 - this.field2607;
                    int var22 = var21 << 12;
                    var3[var5] = var22 / (2048 - this.field2607);
                } else if (this.field2607 <= var6 && 4096 - this.field2607 >= var6) {
                    var3[var5] = 0;
                } else {
                    int var15 = 2048 - var4;
                    int var16 = var15 < 0 ? -var15 : var15;
                    int var17 = var16 << 12;
                    int var18 = var17 / (2048 - this.field2607);
                    var3[var5] = 4096 - var18;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(Lfh;IZ)V", line = 356)
    public final void method14(class313 arg0, int arg1, boolean arg2) {
        if (arg2) {
            field2602 = (class281[]) null;
        }
        field2606++;
        if (arg1 == 0) {
            this.field2607 = arg0.method2250(-1613178296);
        }
    }

    @OriginalMember(owner = "client!ll", name = "d", descriptor = "(III)I", line = 389)
    public static final int method1154(int arg0, int arg1, int arg2) {
        field2604++;
        if (arg2 != -18) {
            method1154(97, 123, -60);
        }
        class220 var3 = (class220) class294.field4888.method29((long) arg1, 103);
        if (var3 == null) {
            return 0;
        } else if (arg0 == -1) {
            return 0;
        } else {
            int var4 = 0;
            for (int var5 = 0; var5 < var3.field3375.length; var5++) {
                if (var3.field3377[var5] == arg0) {
                    var4 += var3.field3375[var5];
                }
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "(BI)Ls;", line = 426)
    public static final class126 method1155(byte arg0, int arg1) {
        field2595++;
        class126 var2 = (class126) class148.field2390.method652((long) arg1, false);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class334.field5417.method1504(class250.method1781(arg1, 117), true, class251.method1786((byte) -91, arg1));
        class126 var4 = new class126();
        var4.field1924 = arg1;
        if (var3 != null) {
            var4.method820(false, new class313(var3));
        }
        var4.method827(31289);
        int var5 = 83 % ((arg0 + 47) / 53);
        if (!class297.field4930 && var4.field1948) {
            var4.field1906 = null;
        }
        if (var4.field1892) {
            var4.field1926 = 0;
            var4.field1912 = false;
        }
        class148.field2390.method642(var4, (long) arg1, -95);
        return var4;
    }
}
