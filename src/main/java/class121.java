import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class121 extends class8 {

    @OriginalMember(owner = "client!fc", name = "I", descriptor = "I")
    private int field1961 = 1;

    @OriginalMember(owner = "client!fc", name = "N", descriptor = "I")
    private int field1964 = 1;

    @OriginalMember(owner = "client!fc", name = "Q", descriptor = "[I")
    public static int[] field1967 = new int[5];

    @OriginalMember(owner = "client!fc", name = "P", descriptor = "Laf;")
    public static class68 field1966 = new class68(50);

    @OriginalMember(owner = "client!fc", name = "W", descriptor = "I")
    public static int field1973 = 0;

    @OriginalMember(owner = "client!fc", name = "T", descriptor = "I")
    public static volatile int field1970 = 0;

    @OriginalMember(owner = "client!fc", name = "U", descriptor = "[I")
    public static int[] field1971 = new int[] { 1, 4 };

    @OriginalMember(owner = "client!fc", name = "K", descriptor = "I")
    public static int field1962;

    @OriginalMember(owner = "client!fc", name = "L", descriptor = "I")
    public static int field1963;

    @OriginalMember(owner = "client!fc", name = "O", descriptor = "I")
    public static int field1965;

    @OriginalMember(owner = "client!fc", name = "R", descriptor = "I")
    public static int field1968;

    @OriginalMember(owner = "client!fc", name = "S", descriptor = "I")
    public static int field1969;

    @OriginalMember(owner = "client!fc", name = "Y", descriptor = "I")
    public static int field1975;

    @OriginalMember(owner = "client!fc", name = "Z", descriptor = "I")
    public static int field1976;

    @OriginalMember(owner = "client!fc", name = "X", descriptor = "Lqj;")
    public static class147 field1974;

    @OriginalMember(owner = "client!fc", name = "V", descriptor = "Ljava/lang/String;")
    public static String field1972;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(BI)V")
    public static final void method874(byte arg0, int arg1) {
        if (arg0 != 67) {
            field1974 = null;
        }
        class131.field2095.method476(false, arg1);
        ++field1976;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/lang/String;")
    public static final String method875(boolean arg0, String arg1) {
        if (arg0) {
            method877((byte) -50);
        }
        ++field1962;
        String var2 = class118.method862(!arg0, class74.method522((byte) -82, arg1));
        if (var2 == null) {
            var2 = "";
        }
        return var2;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IB)[[I")
    public final int[][] method65(int arg0, byte arg1) {
        ++field1965;
        int var3 = -41 % ((-48 - arg1) / 46);
        int[][] var4 = super.field93.method248(arg0, 17416);
        if (super.field93.field470) {
            int var5 = this.field1961 + 1 + this.field1961;
            int var6 = 65536 / var5;
            int var7 = this.field1964 + 1 + this.field1964;
            int var8 = 65536 / var7;
            int[][][] var9 = new int[var5][][];
            for (int var10 = arg0 - this.field1961; this.field1961 + arg0 >= var10; ++var10) {
                int[][] var20 = this.method60(class92.field1523 & var10, 0, 117);
                int[][] var21 = new int[3][class231.field3798];
                int var22 = 0;
                int var23 = 0;
                int var24 = 0;
                int[] var25 = var20[0];
                int[] var26 = var20[1];
                int[] var27 = var20[2];
                for (int var28 = -this.field1964; this.field1964 >= var28; ++var28) {
                    int var38 = var28 & class287.field4537;
                    var23 += var26[var38];
                    var22 += var25[var38];
                    var24 += var27[var38];
                }
                int[] var29 = var21[0];
                int[] var30 = var21[1];
                int[] var31 = var21[2];
                int var32 = 0;
                while (var32 < class231.field3798) {
                    var29[var32] = var8 * var22 >> 16;
                    var30[var32] = var8 * var23 >> 16;
                    var31[var32] = var8 * var24 >> 16;
                    int var33 = -this.field1964 + var32 & class287.field4537;
                    int var34 = var22 - var25[var33];
                    int var35 = var23 - var26[var33];
                    int var36 = var24 - var27[var33];
                    ++var32;
                    int var37 = class287.field4537 & this.field1964 + var32;
                    var22 = var25[var37] + var34;
                    var24 = var27[var37] + var36;
                    var23 = var26[var37] + var35;
                }
                var9[this.field1961 + var10 - arg0] = var21;
            }
            int[] var11 = var4[0];
            int[] var12 = var4[2];
            int[] var13 = var4[1];
            for (int var14 = 0; class231.field3798 > var14; ++var14) {
                int var15 = 0;
                int var16 = 0;
                int var17 = 0;
                for (int var18 = 0; var18 < var5; ++var18) {
                    int[][] var19 = var9[var18];
                    var17 += var19[2][var14];
                    var16 += var19[0][var14];
                    var15 += var19[1][var14];
                }
                var11[var14] = var6 * var16 >> 16;
                var13[var14] = var6 * var15 >> 16;
                var12[var14] = var6 * var17 >> 16;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIIII)V")
    public static final void method876(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 != 0) {
            method876(-67, 76, -61, 121, -117);
        }
        ++field1968;
        if (arg2 >= class161.field2561 && class51.field896 >= arg2) {
            int var5 = class51.method393(arg4, 0, class255.field4055, class9.field128);
            int var6 = class51.method393(arg0, arg3, class255.field4055, class9.field128);
            class149.method1020(arg3 + 47, arg2, var6, var5, arg1);
        }
    }

    @OriginalMember(owner = "client!fc", name = "d", descriptor = "(B)V")
    public static void method877(byte arg0) {
        field1967 = null;
        field1974 = null;
        field1966 = null;
        field1971 = null;
        field1972 = null;
        if (arg0 < 22) {
            field1967 = null;
        }
    }

    @OriginalMember(owner = "client!fc", name = "e", descriptor = "(I)V")
    public static final void method878(int arg0) {
        ++field1969;
        if (arg0 > -99) {
            method878(-110);
        }
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(II)[I")
    public final int[] method44(int arg0, int arg1) {
        ++field1975;
        int[] var3 = super.field110.method1585(arg0 ^ arg0, arg1);
        if (super.field110.field3734) {
            int var4 = this.field1961 - (-this.field1961 + -1);
            int var5 = 65536 / var4;
            int var6 = this.field1964 + this.field1964 - -1;
            int[][] var7 = new int[var4][];
            int var8 = 65536 / var6;
            for (int var9 = arg1 - this.field1961; var9 <= this.field1961 + arg1; ++var9) {
                int[] var13 = this.method61(class92.field1523 & var9, -37, 0);
                int var14 = 0;
                int[] var15 = new int[class231.field3798];
                for (int var16 = -this.field1964; var16 <= this.field1964; ++var16) {
                    var14 += var13[class287.field4537 & var16];
                }
                int var17 = 0;
                while (var17 < class231.field3798) {
                    var15[var17] = var8 * var14 >> 16;
                    int var18 = var14 - var13[class287.field4537 & -this.field1964 + var17];
                    ++var17;
                    var14 = var13[class287.field4537 & this.field1964 + var17] + var18;
                }
                var7[var9 - -this.field1961 + -arg1] = var15;
            }
            for (int var10 = 0; var10 < class231.field3798; ++var10) {
                int var11 = 0;
                for (int var12 = 0; ~var4 < ~var12; ++var12) {
                    var11 += var7[var12][var10];
                }
                var3[var10] = var5 * var11 >> 16;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fc", name = "<init>", descriptor = "()V")
    public class121() {
        super(1, false);
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(BLog;I)V")
    public final void method64(byte arg0, class221 arg1, int arg2) {
        if (arg0 >= 62) {
            if (~arg2 != -1) {
                if (arg2 != 1) {
                    if (arg2 == 2) {
                        super.field115 = arg1.method1517((byte) -96) == 1;
                    }
                } else {
                    this.field1961 = arg1.method1517((byte) -96);
                }
            } else {
                this.field1964 = arg1.method1517((byte) -96);
            }
            ++field1963;
        }
    }
}
