import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class136 extends class120 {

    @OriginalMember(owner = "client!ac", name = "ib", descriptor = "I")
    private int field2026 = 0;

    @OriginalMember(owner = "client!ac", name = "tb", descriptor = "[S")
    private short[] field2037 = new short[257];

    @OriginalMember(owner = "client!ac", name = "V", descriptor = "Lok;")
    private static class41 field2013 = class137.method956(")3de", 45);

    @OriginalMember(owner = "client!ac", name = "ab", descriptor = "Lok;")
    private static class41 field2018 = class137.method956("fr", 45);

    @OriginalMember(owner = "client!ac", name = "Y", descriptor = "Lok;")
    public static class41 field2016 = class137.method956("RuneScape wird geladen )2 bitte warten)3)3)3", 45);

    @OriginalMember(owner = "client!ac", name = "X", descriptor = "I")
    public static int field2015 = -1;

    @OriginalMember(owner = "client!ac", name = "eb", descriptor = "Lok;")
    private static class41 field2022 = class137.method956(")3fr", 45);

    @OriginalMember(owner = "client!ac", name = "bb", descriptor = "Lok;")
    private static class41 field2019 = class137.method956(")3en", 45);

    @OriginalMember(owner = "client!ac", name = "ob", descriptor = "I")
    public static int field2032 = 0;

    @OriginalMember(owner = "client!ac", name = "lb", descriptor = "Lok;")
    private static class41 field2029 = class137.method956("de", 45);

    @OriginalMember(owner = "client!ac", name = "ub", descriptor = "I")
    public static int field2038 = 0;

    @OriginalMember(owner = "client!ac", name = "rb", descriptor = "Lok;")
    private static class41 field2035 = class137.method956("en", 45);

    @OriginalMember(owner = "client!ac", name = "db", descriptor = "[Lok;")
    public static class41[] field2021 = new class41[] { field2035, field2029, field2018 };

    @OriginalMember(owner = "client!ac", name = "fb", descriptor = "[Lok;")
    private static class41[] field2023 = new class41[] { field2019, field2013, field2022 };

    @OriginalMember(owner = "client!ac", name = "T", descriptor = "I")
    public static int field2011;

    @OriginalMember(owner = "client!ac", name = "U", descriptor = "I")
    public static int field2012;

    @OriginalMember(owner = "client!ac", name = "W", descriptor = "I")
    public static int field2014;

    @OriginalMember(owner = "client!ac", name = "Z", descriptor = "I")
    public static int field2017;

    @OriginalMember(owner = "client!ac", name = "cb", descriptor = "I")
    public static int field2020;

    @OriginalMember(owner = "client!ac", name = "gb", descriptor = "I")
    public static int field2024;

    @OriginalMember(owner = "client!ac", name = "hb", descriptor = "I")
    public static int field2025;

    @OriginalMember(owner = "client!ac", name = "mb", descriptor = "I")
    public static int field2030;

    @OriginalMember(owner = "client!ac", name = "nb", descriptor = "I")
    public static int field2031;

    @OriginalMember(owner = "client!ac", name = "pb", descriptor = "I")
    public static int field2033;

    @OriginalMember(owner = "client!ac", name = "sb", descriptor = "I")
    public static int field2036;

    @OriginalMember(owner = "client!ac", name = "kb", descriptor = "Ltb;")
    public static class199 field2028;

    @OriginalMember(owner = "client!ac", name = "jb", descriptor = "[I")
    private int[] field2027;

    @OriginalMember(owner = "client!ac", name = "qb", descriptor = "[I")
    private int[] field2034;

    @OriginalMember(owner = "client!ac", name = "wb", descriptor = "[I")
    public static int[] field2040;

    @OriginalMember(owner = "client!ac", name = "vb", descriptor = "[[I")
    private int[][] field2039;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Llb;II)V", line = 12)
    public final void method30(class112 arg0, int arg1, int arg2) {
        if (~arg2 == arg1) {
            this.field2026 = arg0.method792(2);
            this.field2039 = new int[arg0.method792(arg1 ^ 0xFFFFFFFD)][2];
            for (int var4 = 0; var4 < this.field2039.length; var4++) {
                this.field2039[var4][0] = arg0.method759((byte) -47);
                this.field2039[var4][1] = arg0.method759((byte) -120);
            }
        }
        field2025++;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IILbc;)Lok;", line = 44)
    public static final class41 method948(int arg0, int arg1, class302 arg2) {
        field2033++;
        if (arg0 <= 47) {
            field2022 = (class41) null;
        }
        if (!class271.method1917(102, client.method2119(arg2), arg1) && arg2.field5008 == null) {
            return null;
        } else if (arg2.field5040 == null || arg2.field5040.length <= arg1 || arg2.field5040[arg1] == null || arg2.field5040[arg1].method299(false).method275(false) == 0) {
            return class150.field2331 ? class187.method1346(new class41[] { class95.field1406, class1.method4(arg1, (byte) 33) }, 0) : null;
        } else {
            return arg2.field5040[arg1];
        }
    }

    @OriginalMember(owner = "client!ac", name = "<init>", descriptor = "()V", line = 73)
    public class136() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ac", name = "e", descriptor = "(B)V", line = 87)
    private final void method949(byte arg0) {
        int var2 = this.field2026;
        if (var2 == 2) {
            for (int var20 = 0; var20 < 257; var20++) {
                int var21 = var20 << 4;
                int var22;
                for (var22 = 1; var22 < this.field2039.length - 1 && this.field2039[var22][0] <= var21; var22++) {
                }
                int[] var23 = this.field2039[var22 - 1];
                int[] var24 = this.field2039[var22];
                int var25 = this.method954((byte) -45, var22 - 2)[1];
                int var26 = var23[1];
                int var27 = var24[1];
                int var28 = this.method954((byte) -45, var22 + 1)[1];
                int var29 = (var21 - var23[0] << 12) / (var24[0] - var23[0]);
                int var30 = var29 * var29 >> 12;
                int var31 = var27 - var25;
                int var32 = var26 + var28 - var27 - var25;
                int var33 = var25 - var26 - var32;
                int var35 = (var29 * var32 >> 12) * var30 >> 12;
                int var36 = var30 * var33 >> 12;
                int var37 = var29 * var31 >> 12;
                int var38 = var26 + var37 + var35 + var36;
                if (var38 <= -32768) {
                    var38 = -32767;
                }
                if (var38 >= 32768) {
                    var38 = 32767;
                }
                this.field2037[var20] = (short) var38;
            }
        } else if (var2 == 1) {
            for (int var3 = 0; var3 < 257; var3++) {
                int var4 = var3 << 4;
                int var5;
                for (var5 = 1; var5 < (this.field2039.length - 1) && var4 >= this.field2039[var5][0]; var5++) {
                }
                int[] var6 = this.field2039[var5 - 1];
                int[] var7 = this.field2039[var5];
                int var8 = (var4 - var6[0] << 12) / (var7[0] - var6[0]);
                int var9 = 4096 - field2040[(var8 & 0x1FFC) >> 5] >> 1;
                int var10 = 4096 - var9;
                int var11 = var6[1] * var10 + var7[1] * var9 >> 12;
                if (var11 <= -32768) {
                    var11 = -32767;
                }
                if (var11 >= 32768) {
                    var11 = 32767;
                }
                this.field2037[var3] = (short) var11;
            }
        } else {
            for (int var12 = 0; var12 < 257; var12++) {
                int var13 = var12 << 4;
                int var14;
                for (var14 = 1; (this.field2039.length - 1) > var14 && var13 >= this.field2039[var14][0]; var14++) {
                }
                int[] var15 = this.field2039[var14 - 1];
                int[] var16 = this.field2039[var14];
                int var17 = (var13 - var15[0] << 12) / (var16[0] - var15[0]);
                int var18 = 4096 - var17;
                int var19 = var15[1] * var18 + (var16[1] * var17) >> 12;
                if (var19 <= -32768) {
                    var19 = -32767;
                }
                if (var19 >= 32768) {
                    var19 = 32767;
                }
                this.field2037[var12] = (short) var19;
            }
        }
        if (arg0 < -96) {
            field2031++;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(ZIIIJ)Lok;", line = 257)
    public static final class41 method950(boolean arg0, int arg1, int arg2, int arg3, long arg4) {
        class41 var6 = class230.method1645(0, (byte) -122);
        if (arg4 < 0L) {
            arg4 = -arg4;
            var6.method266(class249.field3973, 0);
        }
        field2014++;
        class41 var7 = class185.field3021;
        class41 var8 = class111.field1581;
        if (arg3 == 1) {
            var7 = class111.field1581;
            var8 = class185.field3021;
        }
        if (arg3 == 2) {
            var7 = class111.field1581;
            var8 = class133.field1983;
        }
        class41 var9 = class230.method1645(0, (byte) -118);
        class41 var10 = class230.method1645(0, (byte) -123);
        int var11 = 0;
        if (arg1 != 257) {
            return (class41) null;
        }
        while (var11 < arg2) {
            var10.method266(class1.method4((int) (arg4 % 10L), (byte) 29), 0);
            arg4 /= 10L;
            var11++;
        }
        if (arg4 == 0L) {
            var9 = class246.field3953;
        }
        int var12 = 0;
        while (arg4 > 0L) {
            if (arg0 && var12 != 0 && var12 % 3 == 0) {
                var9.method266(var8, 0);
            }
            var9.method266(class1.method4((int) (arg4 % 10L), (byte) 72), 0);
            var12++;
            arg4 /= 10L;
        }
        if (var10.method275(false) > 0) {
            var10.method266(var7, 0);
        }
        return class187.method1346(new class41[] { var6, var9.method307(127), var10.method307(117) }, arg1 - 257);
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(II)[I", line = 342)
    public final int[] method14(int arg0, int arg1) {
        field2012++;
        int[] var3 = this.field1775.method863((byte) 34, arg0);
        if (arg1 != -14959) {
            this.field2027 = (int[]) null;
        }
        if (this.field1775.field1798) {
            int[] var4 = this.method854(0, arg0, -24059);
            for (int var5 = 0; var5 < class307.field5160; var5++) {
                int var6 = var4[var5] >> 4;
                if (var6 < 0) {
                    var6 = 0;
                }
                if (var6 > 256) {
                    var6 = 256;
                }
                var3[var5] = this.field2037[var6];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ac", name = "d", descriptor = "(I)V", line = 384)
    public final void method31(int arg0) {
        if (this.field2039 == null) {
            this.field2039 = new int[][] { { 0, 0 }, { 4096, 4096 } };
        }
        field2030++;
        if (this.field2039.length < 2) {
            throw new RuntimeException("Curve operation requires at least two markers");
        }
        if (this.field2026 == 2) {
            this.method952((byte) -87);
        }
        if (arg0 == -31851) {
            class148.method1029(-16452);
            this.method949((byte) -114);
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(JB)Lok;", line = 410)
    public static final class41 method951(long arg0, byte arg1) {
        field2020++;
        if (arg1 > -122) {
            field2028 = (class199) null;
        }
        return class242.method1735(false, true, arg0, 10);
    }

    @OriginalMember(owner = "client!ac", name = "f", descriptor = "(B)V", line = 430)
    private final void method952(byte arg0) {
        field2011++;
        if (arg0 != -87) {
            return;
        }
        int[] var2 = this.field2039[0];
        int[] var3 = this.field2039[1];
        int[] var4 = this.field2039[this.field2039.length - 1];
        int[] var5 = this.field2039[this.field2039.length - 2];
        this.field2034 = new int[] { var2[0] + var2[0] - var3[0], var2[1] - (var3[1] - var2[1]) };
        this.field2027 = new int[] { var5[0] + var5[0] - var4[0], -var4[1] - (-var5[1] - var5[1]) };
    }

    @OriginalMember(owner = "client!ac", name = "g", descriptor = "(B)V", line = 479)
    public static void method953(byte arg0) {
        field2023 = null;
        field2022 = null;
        field2018 = null;
        field2016 = null;
        if (arg0 <= 38) {
            method950(true, 62, -10, -115, 50L);
        }
        field2013 = null;
        field2040 = null;
        field2021 = null;
        field2029 = null;
        field2019 = null;
        field2035 = null;
        field2028 = null;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(BI)[I", line = 507)
    private final int[] method954(byte arg0, int arg1) {
        field2036++;
        if (arg1 < 0) {
            return this.field2034;
        } else if (this.field2039.length > arg1) {
            if (arg0 != -45) {
                this.method949((byte) 37);
            }
            return this.field2039[arg1];
        } else {
            return this.field2027;
        }
    }
}
