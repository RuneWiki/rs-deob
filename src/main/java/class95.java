import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public class class95 extends class76 {

    @OriginalMember(owner = "client!pa", name = "Z", descriptor = "I")
    private int field1787 = 1;

    @OriginalMember(owner = "client!pa", name = "kb", descriptor = "I")
    private int field1798 = 1;

    @OriginalMember(owner = "client!pa", name = "bb", descriptor = "Z")
    public static boolean field1789 = true;

    @OriginalMember(owner = "client!pa", name = "ib", descriptor = "I")
    public static int field1796 = 0;

    @OriginalMember(owner = "client!pa", name = "cb", descriptor = "I")
    public static int field1790 = 0;

    @OriginalMember(owner = "client!pa", name = "mb", descriptor = "Z")
    public static boolean field1800 = false;

    @OriginalMember(owner = "client!pa", name = "eb", descriptor = "Lia;")
    private static class257 field1792 = class28.method234(108, "Free world");

    @OriginalMember(owner = "client!pa", name = "gb", descriptor = "Lia;")
    public static class257 field1794 = field1792;

    @OriginalMember(owner = "client!pa", name = "ob", descriptor = "Lia;")
    public static class257 field1802 = class28.method234(-72, "<col=ffffff> )4 ");

    @OriginalMember(owner = "client!pa", name = "ab", descriptor = "I")
    public static int field1788;

    @OriginalMember(owner = "client!pa", name = "db", descriptor = "I")
    public static int field1791;

    @OriginalMember(owner = "client!pa", name = "fb", descriptor = "I")
    public static int field1793;

    @OriginalMember(owner = "client!pa", name = "hb", descriptor = "I")
    public static int field1795;

    @OriginalMember(owner = "client!pa", name = "jb", descriptor = "I")
    public static int field1797;

    @OriginalMember(owner = "client!pa", name = "lb", descriptor = "I")
    public static int field1799;

    @OriginalMember(owner = "client!pa", name = "nb", descriptor = "I")
    public static int field1801;

    @OriginalMember(owner = "client!pa", name = "Y", descriptor = "Z")
    public static boolean field1786;

    @OriginalMember(owner = "client!pa", name = "<init>", descriptor = "()V")
    public class95() {
        super(1, false);
    }

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "(II)[I")
    public final int[] method169(int arg0, int arg1) {
        ++field1799;
        if (arg0 != -9351) {
            method695((byte) 59);
        }
        int[] var3 = super.field1467.method1182((byte) -48, arg1);
        if (super.field1467.field2980) {
            int var4 = this.field1787 + 1 - -this.field1787;
            int var5 = 65536 / var4;
            int var6 = this.field1798 + 1 - -this.field1798;
            int[][] var7 = new int[var4][];
            int var8 = 65536 / var6;
            for (int var9 = -this.field1787 + arg1; var9 <= this.field1787 + arg1; ++var9) {
                int[] var13 = this.method562(class105.field1950 & var9, 0, (byte) -104);
                int[] var14 = new int[class96.field1807];
                int var15 = 0;
                for (int var16 = -this.field1798; var16 <= this.field1798; ++var16) {
                    var15 += var13[class157.field2753 & var16];
                }
                int var17 = 0;
                while (~class96.field1807 < ~var17) {
                    var14[var17] = var8 * var15 >> 16;
                    int var18 = var15 - var13[-this.field1798 + var17 & class157.field2753];
                    ++var17;
                    var15 = var13[class157.field2753 & this.field1798 + var17] + var18;
                }
                var7[this.field1787 + var9 + -arg1] = var14;
            }
            for (int var10 = 0; ~class96.field1807 < ~var10; ++var10) {
                int var11 = 0;
                for (int var12 = 0; var12 < var4; ++var12) {
                    var11 += var7[var12][var10];
                }
                var3[var10] = var5 * var11 >> 16;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(Lk;BI)V")
    public final void method158(class152 arg0, byte arg1, int arg2) {
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (arg2 == 2) {
                    super.field1477 = arg0.method1051((byte) -80) == 1;
                }
            } else {
                this.field1787 = arg0.method1051((byte) 117);
            }
        } else {
            this.field1798 = arg0.method1051((byte) -35);
        }
        ++field1797;
        if (arg1 >= -86) {
            this.field1798 = -29;
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(Lia;Lia;IIISJ)V")
    public static final void method694(class257 arg0, class257 arg1, int arg2, int arg3, int arg4, short arg5, long arg6) {
        ++field1788;
        if (arg3 == 27360) {
            if (!class216.field3663) {
                if (class199.field3407 < 500) {
                    class19.field397[class199.field3407] = arg1;
                    class92.field1757[class199.field3407] = arg0;
                    class32.field616[class199.field3407] = arg5;
                    class179.field3104[class199.field3407] = arg6;
                    class12.field236[class199.field3407] = arg2;
                    class227.field3817[class199.field3407] = arg4;
                    ++class199.field3407;
                }
            }
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IB)[[I")
    public final int[][] method157(int arg0, byte arg1) {
        ++field1795;
        if (arg1 < 2) {
            this.method158((class152) null, (byte) 97, -93);
        }
        int[][] var3 = super.field1485.method649(arg0, true);
        if (super.field1485.field1692) {
            int var4 = this.field1787 + this.field1787 + 1;
            int var5 = 65536 / var4;
            int var6 = this.field1798 - -1 + this.field1798;
            int var7 = 65536 / var6;
            int[][][] var8 = new int[var4][][];
            for (int var9 = -this.field1787 + arg0; ~var9 >= ~(this.field1787 + arg0); ++var9) {
                int[][] var19 = this.method565((byte) -20, 0, class105.field1950 & var9);
                int[][] var20 = new int[3][class96.field1807];
                int var21 = 0;
                int var22 = 0;
                int var23 = 0;
                int[] var24 = var19[0];
                int[] var25 = var19[1];
                int[] var26 = var19[2];
                for (int var27 = -this.field1798; this.field1798 >= var27; ++var27) {
                    int var37 = class157.field2753 & var27;
                    var22 += var25[var37];
                    var23 += var26[var37];
                    var21 += var24[var37];
                }
                int[] var28 = var20[0];
                int[] var29 = var20[1];
                int[] var30 = var20[2];
                int var31 = 0;
                while (class96.field1807 > var31) {
                    var28[var31] = var7 * var21 >> 16;
                    var29[var31] = var7 * var22 >> 16;
                    var30[var31] = var7 * var23 >> 16;
                    int var32 = -this.field1798 + var31 & class157.field2753;
                    int var33 = var23 - var26[var32];
                    int var34 = var21 - var24[var32];
                    ++var31;
                    int var35 = var22 - var25[var32];
                    int var36 = this.field1798 + var31 & class157.field2753;
                    var23 = var26[var36] + var33;
                    var22 = var25[var36] + var35;
                    var21 = var24[var36] + var34;
                }
                var8[var9 - arg0 + this.field1787] = var20;
            }
            int[] var10 = var3[0];
            int[] var11 = var3[1];
            int[] var12 = var3[2];
            for (int var13 = 0; ~class96.field1807 < ~var13; ++var13) {
                int var14 = 0;
                int var15 = 0;
                int var16 = 0;
                for (int var17 = 0; var4 > var17; ++var17) {
                    int[][] var18 = var8[var17];
                    var16 += var18[1][var13];
                    var15 += var18[2][var13];
                    var14 += var18[0][var13];
                }
                var10[var13] = var5 * var14 >> 16;
                var11[var13] = var5 * var16 >> 16;
                var12[var13] = var5 * var15 >> 16;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "(B)V")
    public static void method695(byte arg0) {
        field1802 = null;
        if (arg0 != -75) {
            field1792 = null;
        }
        field1794 = null;
        field1792 = null;
    }

    @OriginalMember(owner = "client!pa", name = "i", descriptor = "(I)I")
    public static final int method696(int arg0) {
        ++field1791;
        if (arg0 != 16663) {
            method696(-32);
        }
        return 6;
    }
}
