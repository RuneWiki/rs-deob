import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class276 extends RuntimeException {

    @OriginalMember(owner = "client!g", name = "q", descriptor = "Ljava/lang/String;")
    public String field4940;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "Ljava/lang/Throwable;")
    public Throwable field4924;

    @OriginalMember(owner = "client!g", name = "f", descriptor = "I")
    public static int field4929 = 0;

    @OriginalMember(owner = "client!g", name = "n", descriptor = "I")
    public static int field4937 = 0;

    @OriginalMember(owner = "client!g", name = "l", descriptor = "Lid;")
    public static class149 field4935 = class60.method382(")2", (byte) 32);

    @OriginalMember(owner = "client!g", name = "j", descriptor = "Lwj;")
    public static class6 field4933 = new class6();

    @OriginalMember(owner = "client!g", name = "p", descriptor = "[Lid;")
    public static class149[] field4939 = new class149[1000];

    @OriginalMember(owner = "client!g", name = "r", descriptor = "Z")
    public static boolean field4941 = false;

    @OriginalMember(owner = "client!g", name = "s", descriptor = "I")
    public static int field4942 = 0;

    @OriginalMember(owner = "client!g", name = "b", descriptor = "I")
    public static int field4925;

    @OriginalMember(owner = "client!g", name = "c", descriptor = "I")
    public static int field4926;

    @OriginalMember(owner = "client!g", name = "d", descriptor = "I")
    public static int field4927;

    @OriginalMember(owner = "client!g", name = "e", descriptor = "I")
    public static int field4928;

    @OriginalMember(owner = "client!g", name = "g", descriptor = "I")
    public static int field4930;

    @OriginalMember(owner = "client!g", name = "h", descriptor = "I")
    public static int field4931;

    @OriginalMember(owner = "client!g", name = "i", descriptor = "I")
    public static int field4932;

    @OriginalMember(owner = "client!g", name = "k", descriptor = "I")
    public static int field4934;

    @OriginalMember(owner = "client!g", name = "m", descriptor = "I")
    public static int field4936;

    @OriginalMember(owner = "client!g", name = "o", descriptor = "Lal;")
    public static class230 field4938;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(ILal;)V")
    public static final void method1904(int arg0, class230 arg1) {
        if (arg0 >= 53) {
            field4927++;
            class182.field3278 = arg1.method1550((byte) 103, class251.field4404);
            class185.field3338 = arg1.method1550((byte) 70, class37.field546);
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(BZ)V")
    public static final void method1905(byte arg0, boolean arg1) {
        field4926++;
        int var2 = 63 / ((arg0 - 87) / 39);
        byte var3 = 4;
        byte[][] var4 = class103.field1808;
        int var5 = var4.length;
        for (int var6 = 0; var6 < var5; var6++) {
            int var12 = (class267.field4761[var6] >> 8) * 64 - class125.field2199;
            int var13 = (class267.field4761[var6] & 0xFF) * 64 - class115.field1969;
            byte[] var14 = var4[var6];
            if (var14 != null) {
                class279.method1923(64);
                class128.method894(var13, arg1, class277.field4953 * 8 - 48, 31375, var12, var14, (class141.field2600 - 6) * 8, class228.field3989);
            }
        }
        for (int var7 = 0; var7 < var5; var7++) {
            int var8 = (class267.field4761[var7] >> 8) * 64 - class125.field2199;
            int var9 = (class267.field4761[var7] & 0xFF) * 64 - class115.field1969;
            byte[] var10 = var4[var7];
            if (var10 == null && class277.field4953 < 800) {
                class279.method1923(64);
                for (int var11 = 0; var11 < var3; var11++) {
                    class20.method113(var8, 64, var9, (byte) 125, 64, var11);
                }
            }
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(Z)V")
    public static void method1906(boolean arg0) {
        field4935 = null;
        if (!arg0) {
            field4933 = null;
        }
        field4938 = null;
        field4933 = null;
        field4939 = null;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(II)V")
    public static final void method1907(int arg0, int arg1) {
        field4936++;
        if (class104.method735(arg1, false)) {
            class14.method92(-1, -1970, class14.field206[arg1]);
            if (arg0 != 4) {
                field4934 = 101;
            }
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(I)V")
    public static final void method1908(int arg0) {
        if (arg0 != 0) {
            return;
        }
        if (class78.field1455 != null) {
            class110.method782(-1, class78.field1455);
            class78.field1455 = null;
        }
        field4932++;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IIII)I")
    public static final int method1909(int arg0, int arg1, int arg2, int arg3) {
        field4931++;
        int var4 = arg0 & 0x3;
        if (var4 == 0) {
            return arg3;
        } else if (var4 == 1) {
            return arg2;
        } else if (arg1 == var4) {
            return 7 - arg3;
        } else {
            return 7 - arg2;
        }
    }

    @OriginalMember(owner = "client!g", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
    public class276(Throwable arg0, String arg1) {
        this.field4940 = arg1;
        this.field4924 = arg0;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IIIIIIIIBIIII)V")
    public static final void method1910(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte arg8, int arg9, int arg10, int arg11, int arg12) {
        if (arg8 != 6) {
            return;
        }
        field4928++;
        class252 var13 = new class252();
        var13.field4412 = arg2;
        var13.field4413 = arg4;
        var13.field4422 = arg1;
        var13.field4418 = arg6;
        var13.field4420 = arg0;
        var13.field4423 = arg12;
        var13.field4409 = arg7;
        var13.field4414 = arg3;
        var13.field4411 = arg10;
        var13.field4421 = arg11;
        var13.field4416 = arg9;
        var13.field4417 = arg5;
        class95.field1667.method1131(var13, false);
    }
}
