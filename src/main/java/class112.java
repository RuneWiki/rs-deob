import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public abstract class class112 {

    @OriginalMember(owner = "client!tf", name = "i", descriptor = "[I")
    public static int[] field1974 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!tf", name = "m", descriptor = "Ljava/lang/String;")
    public static String field1978 = "Started 3d Library";

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "I")
    public static int field1966;

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "I")
    public static int field1967;

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "I")
    public int field1968;

    @OriginalMember(owner = "client!tf", name = "d", descriptor = "I")
    public int field1969;

    @OriginalMember(owner = "client!tf", name = "e", descriptor = "I")
    public int field1970;

    @OriginalMember(owner = "client!tf", name = "f", descriptor = "I")
    public int field1971;

    @OriginalMember(owner = "client!tf", name = "g", descriptor = "I")
    public static int field1972;

    @OriginalMember(owner = "client!tf", name = "h", descriptor = "I")
    public int field1973;

    @OriginalMember(owner = "client!tf", name = "k", descriptor = "I")
    public static int field1976;

    @OriginalMember(owner = "client!tf", name = "l", descriptor = "I")
    public static int field1977;

    @OriginalMember(owner = "client!tf", name = "n", descriptor = "I")
    public static int field1979;

    @OriginalMember(owner = "client!tf", name = "o", descriptor = "I")
    public static int field1980;

    @OriginalMember(owner = "client!tf", name = "p", descriptor = "I")
    public static int field1981;

    @OriginalMember(owner = "client!tf", name = "q", descriptor = "I")
    public int field1982;

    @OriginalMember(owner = "client!tf", name = "j", descriptor = "[Ljava/lang/String;")
    public static String[] field1975;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(BI)I", line = 22)
    public static final int method719(byte arg0, int arg1) {
        if (arg0 > -27) {
            method724(-28);
        }
        field1981++;
        return arg1 & 0x3FF;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(I)V", line = 48)
    public static final void method720(int arg0) {
        field1977++;
        int var1 = -114 / ((arg0 - 75) / 34);
        class134.field2255.method1884(-22054);
    }

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "(BI)I", line = 63)
    public static final int method721(byte arg0, int arg1) {
        field1967++;
        int var2 = (arg1 * arg1 >> 12) * arg1 >> 12;
        int var3 = arg1 * 6 - 61440;
        int var4 = (arg1 * var3 >> 12) + 40960;
        if (arg0 != 112) {
            field1974 = (int[]) null;
        }
        return var2 * var4 >> 12;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(Lqk;B[[F[II[[II[[FLfn;I[[F)V", line = 84)
    public static final void method722(class1 arg0, byte arg1, float[][] arg2, int[] arg3, int arg4, int[][] arg5, int arg6, float[][] arg7, class299 arg8, int arg9, float[][] arg10) {
        field1979++;
        int[] var11 = new int[arg3.length / 2];
        for (int var12 = 0; var12 < var11.length; var12++) {
            int var13 = arg3[var12 + var12];
            int var14 = arg3[var12 + var12 + 1];
            if (arg9 == 1) {
                int var15 = var13;
                var13 = var14;
                var14 = 128 - var15;
            } else if (arg9 == 2) {
                var14 = 128 - var14;
                var13 = 128 - var13;
            } else if (arg9 == 3) {
                int var16 = var13;
                var13 = 128 - var14;
                var14 = var16;
            }
            float var17;
            float var18;
            float var19;
            if (var13 == 0 && var14 == 0) {
                var17 = arg2[arg6][arg4];
                var18 = arg7[arg6][arg4];
                var19 = arg10[arg6][arg4];
            } else if (var13 == 128 && var14 == 0) {
                var17 = arg2[arg6 + 1][arg4];
                var19 = arg10[arg6 + 1][arg4];
                var18 = arg7[arg6 + 1][arg4];
            } else if (var13 == 128 && var14 == 128) {
                var17 = arg2[arg6 + 1][arg4 + 1];
                var18 = arg7[arg6 + 1][arg4 + 1];
                var19 = arg10[arg6 + 1][arg4 + 1];
            } else if (var13 == 0 && var14 == 128) {
                var18 = arg7[arg6][arg4 + 1];
                var19 = arg10[arg6][arg4 + 1];
                var17 = arg2[arg6][arg4 + 1];
            } else {
                float var20 = arg10[arg6][arg4];
                float var21 = (float) var13 / 128.0F;
                float var22 = (arg10[arg6 + 1][arg4] - var20) * var21 + var20;
                float var23 = arg2[arg6][arg4];
                float var24 = (float) var14 / 128.0F;
                float var25 = (arg2[arg6 + 1][arg4] - var23) * var21 + var23;
                float var26 = arg10[arg6][arg4 + 1];
                float var27 = (arg10[arg6 + 1][arg4 + 1] - var26) * var21 + var26;
                var19 = (var27 - var22) * var24 + var22;
                float var28 = arg7[arg6][arg4];
                float var29 = (arg7[arg6 + 1][arg4] - var28) * var21 + var28;
                float var30 = arg7[arg6][arg4 + 1];
                float var31 = (arg7[arg6 + 1][arg4 + 1] - var30) * var21 + var30;
                var18 = (var31 - var29) * var24 + var29;
                float var32 = arg2[arg6][arg4 + 1];
                float var33 = (arg2[arg6 + 1][arg4 + 1] - var32) * var21 + var32;
                var17 = (var33 - var25) * var24 + var25;
            }
            int var34 = (arg4 << 7) + var14;
            int var35 = (arg6 << 7) + var13;
            int var36 = class150.method978(arg6, var13, (byte) 91, arg4, var14, arg5);
            var11[var12] = arg8.method1995(arg0, var35, var36, var34, var19, var18, var17);
        }
        int var37 = 99 / ((arg1 - 18) / 33);
        arg8.method1992(var11);
    }

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "(BI)Lia;", line = 199)
    public static final class14 method723(byte arg0, int arg1) {
        class14 var2 = (class14) class69.field1470.method1881(true, (long) arg1);
        field1972++;
        if (var2 != null) {
            return var2;
        }
        if (arg0 != -110) {
            field1966 = -37;
        }
        byte[] var3 = class295.field4507.method2036(3, arg1, (byte) 42);
        class14 var4 = new class14();
        if (var3 != null) {
            var4.method108(new class202(var3), arg0 ^ 0x1E);
        }
        class69.field1470.method1880(var4, (long) arg1, 80);
        return var4;
    }

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "(I)V", line = 223)
    public static void method724(int arg0) {
        field1978 = null;
        field1975 = null;
        field1974 = null;
        if (arg0 != 1023) {
            field1978 = (String) null;
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(II)V")
    public abstract void method717(int arg0, int arg1);

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(III)V")
    public abstract void method718(int arg0, int arg1, int arg2);
}
