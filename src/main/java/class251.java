import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ek")
public class class251 extends class104 {

    @OriginalMember(owner = "client!ek", name = "Q", descriptor = "I")
    public static int field4247 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!ek", name = "bb", descriptor = "Lmh;")
    private static class62 field4257 = class201.method1405(true, "Loaded wordpack");

    @OriginalMember(owner = "client!ek", name = "X", descriptor = "Lmh;")
    public static class62 field4253 = class201.method1405(true, "Standort");

    @OriginalMember(owner = "client!ek", name = "db", descriptor = "I")
    public static int field4259 = 0;

    @OriginalMember(owner = "client!ek", name = "eb", descriptor = "Lmh;")
    public static class62 field4260 = class201.method1405(true, "slr2)3ws?order=LPWM");

    @OriginalMember(owner = "client!ek", name = "cb", descriptor = "Lmh;")
    public static class62 field4258 = field4257;

    @OriginalMember(owner = "client!ek", name = "S", descriptor = "I")
    public static int field4248;

    @OriginalMember(owner = "client!ek", name = "V", descriptor = "I")
    public static int field4251;

    @OriginalMember(owner = "client!ek", name = "W", descriptor = "I")
    public static int field4252;

    @OriginalMember(owner = "client!ek", name = "Y", descriptor = "I")
    public static int field4254;

    @OriginalMember(owner = "client!ek", name = "Z", descriptor = "I")
    public int field4255;

    @OriginalMember(owner = "client!ek", name = "ab", descriptor = "I")
    public static int field4256;

    @OriginalMember(owner = "client!ek", name = "fb", descriptor = "I")
    public static int field4261;

    @OriginalMember(owner = "client!ek", name = "gb", descriptor = "Lpb;")
    public class177 field4262;

    @OriginalMember(owner = "client!ek", name = "U", descriptor = "Lhi;")
    public static class26 field4250;

    @OriginalMember(owner = "client!ek", name = "T", descriptor = "[B")
    public byte[] field4249;

    @OriginalMember(owner = "client!ek", name = "d", descriptor = "(I)I", line = 4)
    public final int method285(int arg0) {
        field4256++;
        if (arg0 != 100) {
            this.field4262 = (class177) null;
        }
        return this.field1706 ? 0 : 100;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(II[[ILmk;II[[IF[[FI[[F[[FBIIIIZ)I", line = 30)
    public static final int method1745(int arg0, int arg1, int[][] arg2, class224 arg3, int arg4, int arg5, int[][] arg6, float arg7, float[][] arg8, int arg9, float[][] arg10, float[][] arg11, byte arg12, int arg13, int arg14, int arg15, int arg16, boolean arg17) {
        if (arg16 == 1) {
            int var18 = arg0;
            arg0 = arg13;
            arg13 = 128 - var18;
        } else if (arg16 == 2) {
            arg0 = 128 - arg0;
            arg13 = 128 - arg13;
        } else if (arg16 == 3) {
            int var19 = arg0;
            arg0 = 128 - arg13;
            arg13 = var19;
        }
        int var20 = -3 % ((arg12 - 21) / 59);
        field4254++;
        float var21;
        float var22;
        float var23;
        int var24;
        if (arg0 == 0 && arg13 == 0) {
            var21 = arg11[arg4][arg1];
            var22 = arg8[arg4][arg1];
            var23 = arg10[arg4][arg1];
            var24 = arg5;
        } else if (arg0 == 128 && arg13 == 0) {
            var22 = arg8[arg4 + 1][arg1];
            var24 = arg15;
            var23 = arg10[arg4 + 1][arg1];
            var21 = arg11[arg4 + 1][arg1];
        } else if (arg0 == 128 && arg13 == 128) {
            var22 = arg8[arg4 + 1][arg1 + 1];
            var23 = arg10[arg4 + 1][arg1 + 1];
            var24 = arg14;
            var21 = arg11[arg4 + 1][arg1 + 1];
        } else if (arg0 == 0 && arg13 == 128) {
            var22 = arg8[arg4][arg1 + 1];
            var24 = arg9;
            var23 = arg10[arg4][arg1 + 1];
            var21 = arg11[arg4][arg1 + 1];
        } else {
            float var25 = arg11[arg4][arg1];
            float var26 = arg10[arg4][arg1];
            float var27 = (float) arg0 / 128.0F;
            float var28 = (float) arg13 / 128.0F;
            float var29 = arg8[arg4][arg1];
            float var30 = arg8[arg4][arg1 + 1];
            float var31 = (arg11[arg4 + 1][arg1] - var25) * var27 + var25;
            float var32 = arg11[arg4][arg1 + 1];
            float var33 = arg10[arg4][arg1 + 1];
            float var34 = (arg10[arg4 + 1][arg1] - var26) * var27 + var26;
            float var35 = (arg10[arg4 + 1][arg1 + 1] - var33) * var27 + var33;
            var23 = (var35 - var34) * var28 + var34;
            float var36 = (arg8[arg4 + 1][arg1 + 1] - var30) * var27 + var30;
            float var37 = (arg8[arg4 + 1][arg1] - var29) * var27 + var29;
            float var38 = (arg11[arg4 + 1][arg1 + 1] - var32) * var27 + var32;
            var21 = (var38 - var31) * var28 + var31;
            var22 = (var36 - var37) * var28 + var37;
            int var39 = class186.method1302(arg0, arg5, arg15, true);
            int var40 = class186.method1302(arg0, arg9, arg14, true);
            var24 = class186.method1302(arg13, var39, var40, true);
        }
        int var41 = (arg4 << 7) + arg0;
        int var42 = (arg1 << 7) + arg13;
        int var43 = class230.method1630(arg13, arg4, arg0, arg2, 2, arg1);
        return arg3.method1591(var41, var43, var42, var22, var23, var21, arg17 ? var24 & 0xFFFFFF00 : var24, arg6 == null ? 0.0F : (float) (var43 - class230.method1630(arg13, arg4, arg0, arg6, 2, arg1)) / arg7);
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(IBIIII)V", line = 151)
    public static final void method1746(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = -105 / ((11 - arg1) / 41);
        class173.field2794 = arg3;
        class100.field1643 = arg0;
        field4248++;
        class49.field710 = arg2;
        class113.field1882 = arg4;
        class107.field1737 = arg5;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(Z)[B", line = 164)
    public final byte[] method288(boolean arg0) {
        if (!arg0) {
            field4253 = (class62) null;
        }
        field4252++;
        if (this.field1706) {
            throw new RuntimeException();
        }
        return this.field4249;
    }

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "(Z)V", line = 204)
    public static void method1747(boolean arg0) {
        field4257 = null;
        if (!arg0) {
            method1745(-21, -60, (int[][]) ((int[][]) null), (class224) null, 23, 56, (int[][]) ((int[][]) null), -2.963172F, (float[][]) ((float[][]) null), 92, (float[][]) ((float[][]) null), (float[][]) ((float[][]) null), (byte) -21, 97, 54, 41, -56, true);
        }
        field4258 = null;
        field4253 = null;
        field4250 = null;
        field4260 = null;
    }
}
