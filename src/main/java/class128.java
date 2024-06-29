import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public class class128 extends class300 {

    @OriginalMember(owner = "client!mh", name = "F", descriptor = "I")
    private int field1827 = 1;

    @OriginalMember(owner = "client!mh", name = "Q", descriptor = "I")
    private int field1837 = 1;

    @OriginalMember(owner = "client!mh", name = "P", descriptor = "Ljava/lang/String;")
    public static String field1836 = null;

    @OriginalMember(owner = "client!mh", name = "L", descriptor = "I")
    public static int field1832 = 0;

    @OriginalMember(owner = "client!mh", name = "G", descriptor = "I")
    public static int field1828;

    @OriginalMember(owner = "client!mh", name = "H", descriptor = "I")
    public static int field1829;

    @OriginalMember(owner = "client!mh", name = "J", descriptor = "I")
    public static int field1831;

    @OriginalMember(owner = "client!mh", name = "M", descriptor = "I")
    public static int field1833;

    @OriginalMember(owner = "client!mh", name = "N", descriptor = "I")
    public static int field1834;

    @OriginalMember(owner = "client!mh", name = "O", descriptor = "I")
    public static int field1835;

    @OriginalMember(owner = "client!mh", name = "R", descriptor = "I")
    public static int field1838;

    @OriginalMember(owner = "client!mh", name = "S", descriptor = "I")
    public static int field1839;

    @OriginalMember(owner = "client!mh", name = "I", descriptor = "[Ljava/lang/String;")
    public static String[] field1830;

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IB)Lpg;")
    public static final class191 method822(int arg0, byte arg1) {
        class191 var2 = (class191) class161.field2407.method1517((long) arg0, (byte) -114);
        ++field1835;
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class284.field4610.method501(-2, class17.method98(255, arg0), class228.method1609(arg0, true));
            class191 var4 = new class191();
            var4.field3019 = arg0;
            if (var3 != null) {
                var4.method1345((byte) -89, new class170(var3));
            }
            int var5 = -40 / ((arg1 - 20) / 59);
            var4.method1328(-124);
            if (!class124.field1788 && var4.field2977) {
                var4.field3012 = null;
            }
            if (var4.field2991) {
                var4.field2982 = false;
                var4.field2981 = 0;
            }
            class161.field2407.method1518(var4, (long) arg0, (byte) 75);
            return var4;
        }
    }

    @OriginalMember(owner = "client!mh", name = "d", descriptor = "(B)J")
    public static final long method823(byte arg0) {
        int var1 = -105 % ((-69 - arg0) / 50);
        ++field1831;
        return class229.field3537.method177((byte) -94);
    }

    @OriginalMember(owner = "client!mh", name = "e", descriptor = "(B)V")
    public static void method824(byte arg0) {
        field1836 = null;
        field1830 = null;
        if (arg0 >= -74) {
            method825(true, (String) null);
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(II)[I")
    public final int[] method99(int arg0, int arg1) {
        int[] var3 = super.field4797.method217(arg0, true);
        if (super.field4797.field470) {
            int var4 = this.field1827 + this.field1827 + 1;
            int var5 = 65536 / var4;
            int var6 = this.field1837 + 1 + this.field1837;
            int[][] var7 = new int[var6][];
            for (int var8 = -this.field1837 + arg0; var8 <= this.field1837 + arg0; ++var8) {
                int[] var13 = this.method2018(0, -1, var8 & class285.field4611);
                int[] var14 = new int[class180.field2826];
                int var15 = 0;
                for (int var16 = -this.field1827; this.field1827 >= var16; ++var16) {
                    var15 += var13[var16 & class277.field4503];
                }
                int var17 = 0;
                while (var17 < class180.field2826) {
                    var14[var17] = var5 * var15 >> 16;
                    int var18 = var15 - var13[-this.field1827 + var17 & class277.field4503];
                    ++var17;
                    var15 = var13[class277.field4503 & this.field1827 + var17] + var18;
                }
                var7[-arg0 + var8 + this.field1837] = var14;
            }
            int var9 = 65536 / var6;
            for (int var10 = 0; ~class180.field2826 < ~var10; ++var10) {
                int var11 = 0;
                for (int var12 = 0; ~var12 > ~var6; ++var12) {
                    var11 += var7[var12][var10];
                }
                var3[var10] = var9 * var11 >> 16;
            }
        }
        if (arg1 != -957953300) {
            return null;
        } else {
            ++field1838;
            return var3;
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/lang/String;")
    public static final String method825(boolean arg0, String arg1) {
        ++field1834;
        int var2 = arg1.length();
        char[] var3 = new char[var2];
        byte var4 = 2;
        if (arg0) {
            method826((byte) 97, (String) null);
        }
        for (int var5 = 0; var5 < var2; ++var5) {
            char var6 = arg1.charAt(var5);
            if (~var4 == -1) {
                var6 = Character.toLowerCase(var6);
            } else if (var4 == 2 || Character.isUpperCase(var6)) {
                var6 = class72.method475((byte) -121, var6);
            }
            if (!Character.isLetter(var6)) {
                if (var6 != '.' && ~var6 != -64 && ~var6 != -34) {
                    if (Character.isSpaceChar(var6)) {
                        if (~var4 != -3) {
                            var4 = 1;
                        }
                    } else {
                        var4 = 1;
                    }
                } else {
                    var4 = 2;
                }
            } else {
                var4 = 0;
            }
            var3[var5] = var6;
        }
        return new String(var3);
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(Lim;BI)V")
    public final void method35(class170 arg0, byte arg1, int arg2) {
        if (arg1 >= -43) {
            method826((byte) 106, (String) null);
        }
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (arg2 == 2) {
                    super.field4784 = arg0.method1218(74) == 1;
                }
            } else {
                this.field1837 = arg0.method1218(107);
            }
        } else {
            this.field1827 = arg0.method1218(74);
        }
        ++field1833;
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "(II)[[I")
    public final int[][] method36(int arg0, int arg1) {
        ++field1829;
        int[][] var3 = super.field4786.method538(arg1, (byte) -35);
        int var4 = 90 / (-arg0 / 47);
        if (super.field4786.field1200) {
            int var5 = this.field1837 - -this.field1837 + 1;
            int var6 = 65536 / var5;
            int[][][] var7 = new int[var5][][];
            int var8 = this.field1827 + this.field1827 + 1;
            int var9 = 65536 / var8;
            for (int var10 = arg1 - this.field1837; var10 <= this.field1837 + arg1; ++var10) {
                int[][] var20 = this.method2021(class285.field4611 & var10, false, 0);
                int[][] var21 = new int[3][class180.field2826];
                int var22 = 0;
                int[] var23 = var20[0];
                int var24 = 0;
                int var25 = 0;
                int[] var26 = var20[1];
                int[] var27 = var20[2];
                for (int var28 = -this.field1827; this.field1827 >= var28; ++var28) {
                    int var38 = var28 & class277.field4503;
                    var24 += var27[var38];
                    var25 += var26[var38];
                    var22 += var23[var38];
                }
                int[] var29 = var21[0];
                int[] var30 = var21[1];
                int[] var31 = var21[2];
                int var32 = 0;
                while (var32 < class180.field2826) {
                    var29[var32] = var9 * var22 >> 16;
                    var30[var32] = var9 * var25 >> 16;
                    var31[var32] = var9 * var24 >> 16;
                    int var33 = class277.field4503 & var32 - this.field1827;
                    int var34 = var24 - var27[var33];
                    int var35 = var25 - var26[var33];
                    int var36 = var22 - var23[var33];
                    ++var32;
                    int var37 = this.field1827 + var32 & class277.field4503;
                    var24 = var27[var37] + var34;
                    var22 = var23[var37] + var36;
                    var25 = var26[var37] + var35;
                }
                var7[this.field1837 + var10 + -arg1] = var21;
            }
            int[] var11 = var3[0];
            int[] var12 = var3[1];
            int[] var13 = var3[2];
            for (int var14 = 0; ~var14 > ~class180.field2826; ++var14) {
                int var15 = 0;
                int var16 = 0;
                int var17 = 0;
                for (int var18 = 0; ~var5 < ~var18; ++var18) {
                    int[][] var19 = var7[var18];
                    var16 += var19[0][var14];
                    var15 += var19[1][var14];
                    var17 += var19[2][var14];
                }
                var11[var14] = var6 * var16 >> 16;
                var12[var14] = var6 * var15 >> 16;
                var13[var14] = var6 * var17 >> 16;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!mh", name = "<init>", descriptor = "()V")
    public class128() {
        super(1, false);
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(BLjava/lang/String;)V")
    public static final void method826(byte arg0, String arg1) {
        ++field1828;
        if (class215.field3360 != null) {
            if (arg0 < 124) {
                field1832 = -125;
            }
            long var2 = class176.method1256((byte) 127, arg1);
            int var4 = 0;
            if (~var2 != -1L) {
                while (class215.field3360.length > var4 && class215.field3360[var4].field4018 != var2) {
                    ++var4;
                }
                if (~var4 > ~class215.field3360.length && class215.field3360[var4] != null) {
                    class150.field2218.method445(145, 7);
                    class150.field2218.method1160(-25643, class215.field3360[var4].field4018);
                    ++class75.field1134;
                }
            }
        }
    }
}
