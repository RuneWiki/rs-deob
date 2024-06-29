import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class105 extends class224 {

    @OriginalMember(owner = "client!ve", name = "T", descriptor = "I")
    private int field1609 = 1;

    @OriginalMember(owner = "client!ve", name = "ab", descriptor = "I")
    private int field1616 = 1;

    @OriginalMember(owner = "client!ve", name = "V", descriptor = "I")
    public static int field1611 = 0;

    @OriginalMember(owner = "client!ve", name = "cb", descriptor = "Luf;")
    public static class168 field1618 = class148.method1019(-1720, "rect_debug=");

    @OriginalMember(owner = "client!ve", name = "lb", descriptor = "Lwi;")
    public static class235 field1627 = null;

    @OriginalMember(owner = "client!ve", name = "mb", descriptor = "Luf;")
    public static class168 field1628 = class148.method1019(-1720, "::cardmem");

    @OriginalMember(owner = "client!ve", name = "eb", descriptor = "I")
    public static int field1620 = 0;

    @OriginalMember(owner = "client!ve", name = "kb", descriptor = "I")
    public static int field1626 = 50;

    @OriginalMember(owner = "client!ve", name = "hb", descriptor = "[I")
    public static int[] field1623 = new int[field1626];

    @OriginalMember(owner = "client!ve", name = "Z", descriptor = "[I")
    public static int[] field1615 = new int[field1626];

    @OriginalMember(owner = "client!ve", name = "S", descriptor = "[I")
    public static int[] field1608 = new int[field1626];

    @OriginalMember(owner = "client!ve", name = "bb", descriptor = "[I")
    public static int[] field1617 = new int[field1626];

    @OriginalMember(owner = "client!ve", name = "jb", descriptor = "[I")
    public static int[] field1625 = new int[field1626];

    @OriginalMember(owner = "client!ve", name = "W", descriptor = "[I")
    public static int[] field1612 = new int[field1626];

    @OriginalMember(owner = "client!ve", name = "U", descriptor = "[Luf;")
    public static class168[] field1610 = new class168[field1626];

    @OriginalMember(owner = "client!ve", name = "X", descriptor = "[I")
    public static int[] field1613 = new int[field1626];

    @OriginalMember(owner = "client!ve", name = "R", descriptor = "I")
    public static int field1607;

    @OriginalMember(owner = "client!ve", name = "db", descriptor = "I")
    public static int field1619;

    @OriginalMember(owner = "client!ve", name = "fb", descriptor = "I")
    public static int field1621;

    @OriginalMember(owner = "client!ve", name = "gb", descriptor = "I")
    public static int field1622;

    @OriginalMember(owner = "client!ve", name = "ib", descriptor = "I")
    public static int field1624;

    @OriginalMember(owner = "client!ve", name = "nb", descriptor = "I")
    public static int field1629;

    @OriginalMember(owner = "client!ve", name = "Y", descriptor = "[[[B")
    public static byte[][][] field1614;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(II)I", line = 9)
    public static final int method787(int arg0, int arg1) {
        field1607++;
        return arg0 == 8648 ? arg1 >>> 8 : -55;
    }

    @OriginalMember(owner = "client!ve", name = "<init>", descriptor = "()V", line = 164)
    public class105() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(IZLj;)V", line = 29)
    public final void method19(int arg0, boolean arg1, class153 arg2) {
        if (arg1) {
            field1620 = 55;
        }
        if (arg0 == 0) {
            this.field1609 = arg2.method1042((byte) -14);
        } else if (arg0 == 1) {
            this.field1616 = arg2.method1042((byte) 85);
        } else if (arg0 == 2) {
            this.field3610 = arg2.method1042((byte) 88) == 1;
        }
        field1621++;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(BI)[I", line = 75)
    public final int[] method18(byte arg0, int arg1) {
        field1622++;
        int var3 = 127 / ((20 - arg0) / 51);
        int[] var4 = this.field3613.method1866(1, arg1);
        if (this.field3613.field4531) {
            int var5 = this.field1616 + this.field1616 + 1;
            int var6 = 65536 / var5;
            int var7 = this.field1609 + this.field1609 + 1;
            int var8 = 65536 / var7;
            int[][] var9 = new int[var5][];
            for (int var10 = arg1 - this.field1616; var10 <= this.field1616 + arg1; var10++) {
                int var11 = 0;
                int[] var12 = this.method1537(var10 & class169.field2777, 0, 0);
                int[] var13 = new int[class187.field2961];
                for (int var14 = -this.field1609; var14 <= this.field1609; var14++) {
                    var11 += var12[class205.field3363 & var14];
                }
                int var15 = 0;
                while (class187.field2961 > var15) {
                    var13[var15] = var8 * var11 >> 16;
                    int var16 = var11 - var12[var15 - this.field1609 & class205.field3363];
                    var15++;
                    var11 = var12[class205.field3363 & this.field1609 + var15] + var16;
                }
                var9[var10 - (arg1 - this.field1616)] = var13;
            }
            for (int var17 = 0; var17 < class187.field2961; var17++) {
                int var18 = 0;
                for (int var19 = 0; var19 < var5; var19++) {
                    var18 += var9[var19][var17];
                }
                var4[var17] = var6 * var18 >> 16;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(IB)[[I", line = 179)
    public final int[][] method17(int arg0, byte arg1) {
        field1629++;
        int[][] var3 = this.field3631.method1587(arg0, arg1 + 9881);
        if (this.field3631.field3756) {
            int var4 = this.field1616 + this.field1616 + 1;
            int var5 = this.field1609 + this.field1609 + 1;
            int var6 = 65536 / var4;
            int var7 = 65536 / var5;
            int[][][] var8 = new int[var4][][];
            for (int var9 = arg0 - this.field1616; var9 <= (arg0 + this.field1616); var9++) {
                int[][] var10 = this.method1535(0, 3, var9 & class169.field2777);
                int[][] var11 = new int[3][class187.field2961];
                int var12 = 0;
                int var13 = 0;
                int[] var14 = var10[1];
                int var15 = 0;
                int[] var16 = var10[2];
                int[] var17 = var10[0];
                for (int var18 = -this.field1609; var18 <= this.field1609; var18++) {
                    int var19 = class205.field3363 & var18;
                    var13 += var16[var19];
                    var12 += var17[var19];
                    var15 += var14[var19];
                }
                int[] var20 = var11[0];
                int[] var21 = var11[2];
                int[] var22 = var11[1];
                int var23 = 0;
                while (var23 < class187.field2961) {
                    var20[var23] = var7 * var12 >> 16;
                    var22[var23] = var7 * var15 >> 16;
                    var21[var23] = var7 * var13 >> 16;
                    int var24 = var23 - this.field1609 & class205.field3363;
                    int var25 = var12 - var17[var24];
                    int var26 = var13 - var16[var24];
                    var23++;
                    int var27 = var15 - var14[var24];
                    int var28 = this.field1609 + var23 & class205.field3363;
                    var15 = var14[var28] + var27;
                    var13 = var16[var28] + var26;
                    var12 = var17[var28] + var25;
                }
                var8[var9 + this.field1616 - arg0] = var11;
            }
            int[] var29 = var3[1];
            int[] var30 = var3[0];
            int[] var31 = var3[2];
            for (int var32 = 0; var32 < class187.field2961; var32++) {
                int var33 = 0;
                int var34 = 0;
                int var35 = 0;
                for (int var36 = 0; var36 < var4; var36++) {
                    int[][] var37 = var8[var36];
                    var33 += var37[0][var32];
                    var34 += var37[2][var32];
                    var35 += var37[1][var32];
                }
                var30[var32] = var6 * var33 >> 16;
                var29[var32] = var6 * var35 >> 16;
                var31[var32] = var6 * var34 >> 16;
            }
        }
        return arg1 == -77 ? var3 : (int[][]) ((int[][]) null);
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(IIZIIB)V", line = 314)
    public static final void method788(int arg0, int arg1, boolean arg2, int arg3, int arg4, byte arg5) {
        int var6 = arg4 - 334;
        if (arg5 != -101) {
            field1625 = (int[]) null;
        }
        if (var6 < 0) {
            var6 = 0;
        } else if (var6 > 100) {
            var6 = 100;
        }
        int var7 = class294.field4983 + ((class140.field2170 - class294.field4983) * var6 / 100);
        if (var7 < class60.field778) {
            var7 = class60.field778;
        } else if (class2.field12 < var7) {
            var7 = class2.field12;
        }
        int var8 = arg4 * 512 * var7 / (arg1 * 334);
        if (class281.field4728 > var8) {
            short var9 = class281.field4728;
            var7 = arg1 * var9 * 334 / (arg4 * 512);
            if (var7 > class2.field12) {
                var7 = class2.field12;
                int var10 = arg4 * var7 * 512 / (var9 * 334);
                int var11 = (arg1 - var10) / 2;
                if (arg2) {
                    class228.method1559();
                    class228.method1560(arg0, arg3, var11, arg4, 0);
                    class228.method1560(arg0 + arg1 - var11, arg3, var11, arg4, 0);
                }
                arg0 += var11;
                arg1 -= var11 * 2;
            }
        } else if (var8 > class46.field577) {
            short var12 = class46.field577;
            var7 = arg1 * var12 * 334 / (arg4 * 512);
            if (class60.field778 > var7) {
                var7 = class60.field778;
                int var13 = var12 * 334 * arg1 / (var7 * 512);
                int var14 = (arg4 - var13) / 2;
                if (arg2) {
                    class228.method1559();
                    class228.method1560(arg0, arg3, arg1, var14, 0);
                    class228.method1560(arg0, arg3 + arg4 - var14, arg1, var14, 0);
                }
                arg3 += var14;
                arg4 -= var14 * 2;
            }
        }
        class46.field561 = arg4 * var7 / 334;
        class141.field2178 = arg3;
        class271.field4556 = (short) arg4;
        class259.field4398 = arg0;
        class253.field4334 = (short) arg1;
        field1619++;
    }

    @OriginalMember(owner = "client!ve", name = "e", descriptor = "(B)V", line = 413)
    public static void method789(byte arg0) {
        field1628 = null;
        field1623 = null;
        field1608 = null;
        field1625 = null;
        field1618 = null;
        field1610 = null;
        field1614 = (byte[][][]) null;
        field1615 = null;
        field1627 = null;
        if (arg0 < 101) {
            method789((byte) -12);
        }
        field1613 = null;
        field1612 = null;
        field1617 = null;
    }
}
