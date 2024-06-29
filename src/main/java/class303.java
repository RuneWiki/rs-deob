import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class303 {

    @OriginalMember(owner = "client!nd", name = "y", descriptor = "I")
    public int field5148;

    @OriginalMember(owner = "client!nd", name = "f", descriptor = "Z")
    public static boolean field5129 = false;

    @OriginalMember(owner = "client!nd", name = "j", descriptor = "[I")
    public static int[] field5133 = new int[128];

    @OriginalMember(owner = "client!nd", name = "t", descriptor = "[[B")
    public static byte[][] field5143 = new byte[50][];

    @OriginalMember(owner = "client!nd", name = "n", descriptor = "[Lbg;")
    public static class194[] field5137 = new class194[2048];

    @OriginalMember(owner = "client!nd", name = "x", descriptor = "I")
    public static int field5147 = 0;

    @OriginalMember(owner = "client!nd", name = "A", descriptor = "I")
    public static int field5150 = 0;

    @OriginalMember(owner = "client!nd", name = "r", descriptor = "J")
    public static volatile long field5141 = 0L;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "I")
    public static int field5124;

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "I")
    public int field5126;

    @OriginalMember(owner = "client!nd", name = "d", descriptor = "I")
    public static int field5127;

    @OriginalMember(owner = "client!nd", name = "e", descriptor = "I")
    public static int field5128;

    @OriginalMember(owner = "client!nd", name = "g", descriptor = "I")
    public int field5130;

    @OriginalMember(owner = "client!nd", name = "o", descriptor = "I")
    public int field5138;

    @OriginalMember(owner = "client!nd", name = "q", descriptor = "I")
    public static int field5140;

    @OriginalMember(owner = "client!nd", name = "s", descriptor = "I")
    public static int field5142;

    @OriginalMember(owner = "client!nd", name = "B", descriptor = "I")
    public static int field5151;

    @OriginalMember(owner = "client!nd", name = "l", descriptor = "Lue;")
    public static class14 field5135;

    @OriginalMember(owner = "client!nd", name = "h", descriptor = "Lcm;")
    public class183 field5131;

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "[I")
    public int[] field5125;

    @OriginalMember(owner = "client!nd", name = "i", descriptor = "[I")
    public int[] field5132;

    @OriginalMember(owner = "client!nd", name = "k", descriptor = "[I")
    public int[] field5134;

    @OriginalMember(owner = "client!nd", name = "u", descriptor = "[I")
    public int[] field5144;

    @OriginalMember(owner = "client!nd", name = "v", descriptor = "[I")
    public int[] field5145;

    @OriginalMember(owner = "client!nd", name = "z", descriptor = "[I")
    public int[] field5149;

    @OriginalMember(owner = "client!nd", name = "p", descriptor = "[Lcm;")
    public class183[] field5139;

    @OriginalMember(owner = "client!nd", name = "m", descriptor = "[[I")
    public int[][] field5136;

    @OriginalMember(owner = "client!nd", name = "w", descriptor = "[[I")
    public int[][] field5146;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "([II[J)V", line = 4)
    public static final void method2057(int[] arg0, int arg1, long[] arg2) {
        class92.method581(0, arg2, 31, arg2.length - 1, arg0);
        field5142++;
        if (arg1 != 7656) {
            field5137 = (class194[]) null;
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IIB)Z", line = 29)
    public static final boolean method2058(int arg0, int arg1, byte arg2) {
        if (arg0 == 11) {
            arg0 = 10;
        }
        class38 var3 = class239.method1629((byte) 103, arg1);
        field5124++;
        if (arg2 < 34) {
            return true;
        } else {
            if (arg0 >= 5 && arg0 <= 8) {
                arg0 = 4;
            }
            return var3.method254((byte) 114, arg0);
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IIIIIIIZIIII)Z", line = 53)
    public static final boolean method2059(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11) {
        field5151++;
        for (int var12 = 0; var12 < 104; var12++) {
            for (int var13 = 0; var13 < 104; var13++) {
                class128.field2229[var12][var13] = 0;
                class42.field851[var12][var13] = 99999999;
            }
        }
        class128.field2229[arg6][arg8] = 99;
        class42.field851[arg6][arg8] = 0;
        int var14 = arg8;
        byte var15 = 0;
        class103.field1770[var15] = arg6;
        int var16 = 0;
        int var17 = arg6;
        boolean var18 = false;
        int var33 = var15 + 1;
        class104.field1776[var15] = arg8;
        int[][] var19 = class180.field3158[class133.field2315].field4306;
        while (var33 != var16) {
            var14 = class104.field1776[var16];
            var17 = class103.field1770[var16];
            var16 = var16 + 1 & 0xFFF;
            if (arg0 == var17 && arg10 == var14) {
                var18 = true;
                break;
            }
            if (arg5 != 0) {
                if ((arg5 < 5 || arg5 == 10) && class180.field3158[class133.field2315].method1744(arg0, (byte) -102, var17, arg9, arg10, var14, arg5 - 1, 1)) {
                    var18 = true;
                    break;
                }
                if (arg5 < 10 && class180.field3158[class133.field2315].method1742(var14, arg5 - 1, arg9, arg10, arg0, var17, 1, -16941)) {
                    var18 = true;
                    break;
                }
            }
            if (arg2 != 0 && arg3 != 0 && class180.field3158[class133.field2315].method1743(arg3, (byte) 109, 1, arg10, arg0, var14, var17, arg11, arg2)) {
                var18 = true;
                break;
            }
            int var20 = class42.field851[var17][var14] + 1;
            if (var17 > 0 && class128.field2229[var17 - 1][var14] == 0 && (var19[var17 - 1][var14] & 0x12C0108) == 0) {
                class103.field1770[var33] = var17 - 1;
                class104.field1776[var33] = var14;
                var33 = var33 + 1 & 0xFFF;
                class128.field2229[var17 - 1][var14] = 2;
                class42.field851[var17 - 1][var14] = var20;
            }
            if (var17 < 103 && class128.field2229[var17 + 1][var14] == 0 && (var19[var17 + 1][var14] & 0x12C0180) == 0) {
                class103.field1770[var33] = var17 + 1;
                class104.field1776[var33] = var14;
                var33 = var33 + 1 & 0xFFF;
                class128.field2229[var17 + 1][var14] = 8;
                class42.field851[var17 + 1][var14] = var20;
            }
            if (var14 > 0 && class128.field2229[var17][var14 - 1] == 0 && (var19[var17][var14 - 1] & 0x12C0102) == 0) {
                class103.field1770[var33] = var17;
                class104.field1776[var33] = var14 - 1;
                var33 = var33 + 1 & 0xFFF;
                class128.field2229[var17][var14 - 1] = 1;
                class42.field851[var17][var14 - 1] = var20;
            }
            if (var14 < 103 && class128.field2229[var17][var14 + 1] == 0 && (var19[var17][var14 + 1] & 0x12C0120) == 0) {
                class103.field1770[var33] = var17;
                class104.field1776[var33] = var14 + 1;
                class128.field2229[var17][var14 + 1] = 4;
                class42.field851[var17][var14 + 1] = var20;
                var33 = var33 + 1 & 0xFFF;
            }
            if (var17 > 0 && var14 > 0 && class128.field2229[var17 - 1][var14 - 1] == 0 && (var19[var17 - 1][var14 - 1] & 0x12C010E) == 0 && (var19[var17 - 1][var14] & 0x12C0108) == 0 && (var19[var17][var14 - 1] & 0x12C0102) == 0) {
                class103.field1770[var33] = var17 - 1;
                class104.field1776[var33] = var14 - 1;
                class128.field2229[var17 - 1][var14 - 1] = 3;
                var33 = var33 + 1 & 0xFFF;
                class42.field851[var17 - 1][var14 - 1] = var20;
            }
            if (var17 < 103 && var14 > 0 && class128.field2229[var17 + 1][var14 - 1] == 0 && (var19[var17 + 1][var14 - 1] & 0x12C0183) == 0 && (var19[var17 + 1][var14] & 0x12C0180) == 0 && (var19[var17][var14 - 1] & 0x12C0102) == 0) {
                class103.field1770[var33] = var17 + 1;
                class104.field1776[var33] = var14 - 1;
                class128.field2229[var17 + 1][var14 - 1] = 9;
                class42.field851[var17 + 1][var14 - 1] = var20;
                var33 = var33 + 1 & 0xFFF;
            }
            if (var17 > 0 && var14 < 103 && class128.field2229[var17 - 1][var14 + 1] == 0 && (var19[var17 - 1][var14 + 1] & 0x12C0138) == 0 && (var19[var17 - 1][var14] & 0x12C0108) == 0 && (var19[var17][var14 + 1] & 0x12C0120) == 0) {
                class103.field1770[var33] = var17 - 1;
                class104.field1776[var33] = var14 + 1;
                class128.field2229[var17 - 1][var14 + 1] = 6;
                var33 = var33 + 1 & 0xFFF;
                class42.field851[var17 - 1][var14 + 1] = var20;
            }
            if (var17 < 103 && var14 < 103 && class128.field2229[var17 + 1][var14 + 1] == 0 && (var19[var17 + 1][var14 + 1] & 0x12C01E0) == 0 && (var19[var17 + 1][var14] & 0x12C0180) == 0 && (var19[var17][var14 + 1] & 0x12C0120) == 0) {
                class103.field1770[var33] = var17 + 1;
                class104.field1776[var33] = var14 + 1;
                var33 = var33 + 1 & 0xFFF;
                class128.field2229[var17 + 1][var14 + 1] = 12;
                class42.field851[var17 + 1][var14 + 1] = var20;
            }
        }
        class190.field3298 = 0;
        if (!var18) {
            if (!arg7) {
                return false;
            }
            int var21 = 1000;
            byte var22 = 10;
            int var23 = 100;
            for (int var24 = arg0 - var22; var24 <= (arg0 + var22); var24++) {
                for (int var25 = arg10 - var22; var25 <= arg10 + var22; var25++) {
                    if (var24 >= 0 && var25 >= 0 && var24 < 104 && var25 < 104 && class42.field851[var24][var25] < 100) {
                        int var26 = 0;
                        int var27 = 0;
                        if (arg0 > var24) {
                            var27 = arg0 - var24;
                        } else if (var24 > arg0 + arg2 - 1) {
                            var27 = var24 + 1 - arg0 - arg2;
                        }
                        if (arg10 > var25) {
                            var26 = arg10 - var25;
                        } else if (arg10 - (1 - arg3) < var25) {
                            var26 = var25 - arg10 - (arg3 - 1);
                        }
                        int var28 = var26 * var26 + var27 * var27;
                        if (var28 < var21 || var21 == var28 && class42.field851[var24][var25] < var23) {
                            var17 = var24;
                            var14 = var25;
                            var23 = class42.field851[var24][var25];
                            var21 = var28;
                        }
                    }
                }
            }
            if (var21 == 1000) {
                return false;
            }
            if (arg6 == var17 && arg8 == var14) {
                return false;
            }
            class190.field3298 = 1;
        }
        int var29 = -108 % ((-arg1 - 22) / 39);
        byte var30 = 0;
        class103.field1770[var30] = var17;
        int var34 = var30 + 1;
        class104.field1776[var30] = var14;
        int var31;
        int var32 = var31 = class128.field2229[var17][var14];
        while (arg6 != var17 || arg8 != var14) {
            if (var31 != var32) {
                class103.field1770[var34] = var17;
                var31 = var32;
                class104.field1776[var34++] = var14;
            }
            if ((var32 & 0x2) != 0) {
                var17++;
            } else if ((var32 & 0x8) != 0) {
                var17--;
            }
            if ((var32 & 0x1) != 0) {
                var14++;
            } else if ((var32 & 0x4) != 0) {
                var14--;
            }
            var32 = class128.field2229[var17][var14];
        }
        if (var34 > 0) {
            class283.method1964((byte) -126, arg4, var34);
            return true;
        } else if (arg4 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Z[B)V", line = 339)
    private final void method2060(boolean arg0, byte[] arg1) {
        field5128++;
        class194 var3 = new class194(class208.method1433(arg1, arg0));
        int var4 = var3.method1325(7627);
        if (var4 != 5 && var4 != 6) {
            throw new RuntimeException();
        }
        if (var4 >= 6) {
            this.field5138 = var3.method1350(false);
        } else {
            this.field5138 = 0;
        }
        int var5 = var3.method1325(7627);
        this.field5126 = var3.method1308(-78);
        int var6 = 0;
        this.field5149 = new int[this.field5126];
        int var7 = -1;
        for (int var8 = 0; var8 < this.field5126; var8++) {
            this.field5149[var8] = var6 += var3.method1308(-58);
            if (var7 < this.field5149[var8]) {
                var7 = this.field5149[var8];
            }
        }
        this.field5130 = var7 + 1;
        this.field5136 = new int[this.field5130][];
        this.field5132 = new int[this.field5130];
        this.field5144 = new int[this.field5130];
        this.field5134 = new int[this.field5130];
        this.field5145 = new int[this.field5130];
        if (var5 != 0) {
            this.field5125 = new int[this.field5130];
            for (int var9 = 0; var9 < this.field5130; var9++) {
                this.field5125[var9] = -1;
            }
            for (int var10 = 0; var10 < this.field5126; var10++) {
                this.field5125[this.field5149[var10]] = var3.method1350(false);
            }
            this.field5131 = new class183(this.field5125);
        }
        for (int var11 = 0; var11 < this.field5126; var11++) {
            this.field5132[this.field5149[var11]] = var3.method1350(false);
        }
        for (int var12 = 0; var12 < this.field5126; var12++) {
            this.field5134[this.field5149[var12]] = var3.method1350(false);
        }
        if (arg0) {
            this.field5148 = -30;
        }
        for (int var13 = 0; var13 < this.field5126; var13++) {
            this.field5144[this.field5149[var13]] = var3.method1308(-88);
        }
        for (int var14 = 0; var14 < this.field5126; var14++) {
            int var15 = 0;
            int var16 = this.field5149[var14];
            int var17 = this.field5144[var16];
            int var18 = -1;
            this.field5136[var16] = new int[var17];
            for (int var19 = 0; var19 < var17; var19++) {
                int var20 = this.field5136[var16][var19] = var15 += var3.method1308(-87);
                if (var18 < var20) {
                    var18 = var20;
                }
            }
            this.field5145[var16] = var18 + 1;
            if (var18 + 1 == var17) {
                this.field5136[var16] = null;
            }
        }
        if (var5 == 0) {
            return;
        }
        this.field5146 = new int[var7 + 1][];
        this.field5139 = new class183[var7 + 1];
        for (int var21 = 0; var21 < this.field5126; var21++) {
            int var22 = this.field5149[var21];
            int var23 = this.field5144[var22];
            this.field5146[var22] = new int[this.field5145[var22]];
            for (int var24 = 0; var24 < this.field5145[var22]; var24++) {
                this.field5146[var22][var24] = -1;
            }
            for (int var25 = 0; var25 < var23; var25++) {
                int var26;
                if (this.field5136[var22] == null) {
                    var26 = var25;
                } else {
                    var26 = this.field5136[var22][var25];
                }
                this.field5146[var22][var26] = var3.method1350(false);
            }
            this.field5139[var22] = new class183(this.field5146[var22]);
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(B)V", line = 549)
    public static void method2061(byte arg0) {
        field5137 = null;
        field5143 = (byte[][]) null;
        field5135 = null;
        field5133 = null;
        int var1 = 49 % ((57 - arg0) / 52);
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IIIIBII)V", line = 589)
    public static final void method2062(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
        field5140++;
        class153.method1017((byte) -116, arg5);
        int var7 = 0;
        int var8 = -18 % ((arg4 + 7) / 49);
        int var9 = arg5 - arg6;
        if (var9 < 0) {
            var9 = 0;
        }
        int var10 = -arg5;
        int var11 = arg5;
        int var12 = var9;
        int var13 = -1;
        int var14 = -var9;
        int var15 = -1;
        int[] var16 = class219.field3850[arg2];
        int var17 = arg1 - var9;
        class314.method2138(var17, true, arg3, var16, arg1 - arg5);
        int var18 = arg1 + var9;
        class314.method2138(var18, true, arg0, var16, var17);
        class314.method2138(arg1 + arg5, true, arg3, var16, var18);
        while (var11 > var7) {
            var13 += 2;
            var10 += var13;
            var15 += 2;
            var14 += var15;
            if (var14 >= 0 && var12 >= 1) {
                class64.field1214[var12] = var7;
                var12--;
                var14 -= var12 << 1;
            }
            var7++;
            if (var10 >= 0) {
                var11--;
                if (var11 >= var9) {
                    int[] var19 = class219.field3850[arg2 + var11];
                    int var20 = arg1 + var7;
                    int var21 = arg1 - var7;
                    int[] var22 = class219.field3850[arg2 - var11];
                    class314.method2138(var20, true, arg3, var19, var21);
                    class314.method2138(var20, true, arg3, var22, var21);
                } else {
                    int[] var23 = class219.field3850[arg2 + var11];
                    int var24 = class64.field1214[var11];
                    int var25 = arg1 - var7;
                    int var26 = arg1 - var24;
                    int[] var27 = class219.field3850[arg2 - var11];
                    int var28 = arg1 + var24;
                    int var29 = arg1 + var7;
                    class314.method2138(var26, true, arg3, var23, var25);
                    class314.method2138(var28, true, arg0, var23, var26);
                    class314.method2138(var29, true, arg3, var23, var28);
                    class314.method2138(var26, true, arg3, var27, var25);
                    class314.method2138(var28, true, arg0, var27, var26);
                    class314.method2138(var29, true, arg3, var27, var28);
                }
                var10 -= var11 << 1;
            }
            int[] var30 = class219.field3850[arg2 + var7];
            int[] var31 = class219.field3850[arg2 - var7];
            int var32 = arg1 + var11;
            int var33 = arg1 - var11;
            if (var7 >= var9) {
                class314.method2138(var32, true, arg3, var30, var33);
                class314.method2138(var32, true, arg3, var31, var33);
            } else {
                int var34 = var12 >= var7 ? var12 : class64.field1214[var7];
                int var35 = arg1 + var34;
                int var36 = arg1 - var34;
                class314.method2138(var36, true, arg3, var30, var33);
                class314.method2138(var35, true, arg0, var30, var36);
                class314.method2138(var32, true, arg3, var30, var35);
                class314.method2138(var36, true, arg3, var31, var33);
                class314.method2138(var35, true, arg0, var31, var36);
                class314.method2138(var32, true, arg3, var31, var35);
            }
        }
    }

    @OriginalMember(owner = "client!nd", name = "<init>", descriptor = "([BI)V", line = 713)
    public class303(byte[] arg0, int arg1) {
        this.field5148 = class43.method299(arg0, arg0.length, -127);
        if (this.field5148 != arg1) {
            throw new RuntimeException();
        }
        this.method2060(false, arg0);
    }
}
