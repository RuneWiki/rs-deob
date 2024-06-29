import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!am")
public class class240 extends class286 {

    @OriginalMember(owner = "client!am", name = "P", descriptor = "I")
    public static int field4052 = 0;

    @OriginalMember(owner = "client!am", name = "V", descriptor = "Lbe;")
    public static class283 field4058 = class153.method941(-93, "Clientscript error in: ");

    @OriginalMember(owner = "client!am", name = "O", descriptor = "I")
    public static int field4051;

    @OriginalMember(owner = "client!am", name = "Q", descriptor = "I")
    public static int field4053;

    @OriginalMember(owner = "client!am", name = "R", descriptor = "I")
    public static int field4054;

    @OriginalMember(owner = "client!am", name = "U", descriptor = "I")
    public static int field4057;

    @OriginalMember(owner = "client!am", name = "T", descriptor = "Lik;")
    public static class244 field4056;

    @OriginalMember(owner = "client!am", name = "N", descriptor = "Z")
    public static boolean field4050;

    @OriginalMember(owner = "client!am", name = "S", descriptor = "[I")
    public static int[] field4055;

    @OriginalMember(owner = "client!am", name = "a", descriptor = "([J[IBII)V", line = 4)
    public static final void method1614(long[] arg0, int[] arg1, byte arg2, int arg3, int arg4) {
        if (arg4 > arg3) {
            int var5 = (arg3 + arg4) / 2;
            int var6 = arg3;
            long var7 = arg0[var5];
            arg0[var5] = arg0[arg4];
            arg0[arg4] = var7;
            int var9 = arg1[var5];
            arg1[var5] = arg1[arg4];
            arg1[arg4] = var9;
            for (int var10 = arg3; var10 < arg4; var10++) {
                if (((long) (var10 & 0x1) + var7) > arg0[var10]) {
                    long var11 = arg0[var10];
                    arg0[var10] = arg0[var6];
                    arg0[var6] = var11;
                    int var13 = arg1[var10];
                    arg1[var10] = arg1[var6];
                    arg1[var6++] = var13;
                }
            }
            arg0[arg4] = arg0[var6];
            arg0[var6] = var7;
            arg1[arg4] = arg1[var6];
            arg1[var6] = var9;
            method1614(arg0, arg1, (byte) 78, arg3, var6 - 1);
            method1614(arg0, arg1, (byte) 102, var6 + 1, arg4);
        }
        if (arg2 <= 77) {
            field4055 = (int[]) null;
        }
        field4053++;
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(IIILkg;)V", line = 61)
    public static final void method1615(int arg0, int arg1, int arg2, class69 arg3) {
        field4054++;
        if (class20.field274 != null || class306.field5253 || arg3 == null || class304.method2053(122, arg3) == null) {
            return;
        }
        class20.field274 = arg3;
        class110.field1864 = class304.method2053(114, arg3);
        class48.field667 = 0;
        if (arg1 >= 12) {
            class227.field3816 = false;
            class256.field4324 = arg0;
            class262.field4470 = arg2;
        }
    }

    @OriginalMember(owner = "client!am", name = "c", descriptor = "(III)Lbc;", line = 85)
    public static final class110 method1616(int arg0, int arg1, int arg2) {
        class160 var3 = class86.field1459[arg0][arg1][arg2];
        return var3 == null || var3.field2617 == null ? null : var3.field2617;
    }

    @OriginalMember(owner = "client!am", name = "<init>", descriptor = "()V", line = 95)
    public class240() {
        super(0, true);
    }

    @OriginalMember(owner = "client!am", name = "h", descriptor = "(I)V", line = 104)
    public static void method1617(int arg0) {
        field4058 = null;
        field4055 = null;
        field4056 = null;
        if (arg0 != 1) {
            field4052 = -101;
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(II)[I", line = 129)
    public final int[] method14(int arg0, int arg1) {
        if (arg0 > -52) {
            method1616(14, -81, 34);
        }
        field4051++;
        return class174.field2978;
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(IIIILgf;Lgf;IIJ)V", line = 147)
    public static final void method1618(int arg0, int arg1, int arg2, int arg3, class7 arg4, class7 arg5, int arg6, int arg7, long arg8) {
        if (arg4 == null && arg5 == null) {
            return;
        }
        class197 var10 = new class197();
        var10.field3362 = arg8;
        var10.field3365 = arg1 * 128 + 64;
        var10.field3363 = arg2 * 128 + 64;
        var10.field3367 = arg3;
        var10.field3375 = arg4;
        var10.field3376 = arg5;
        var10.field3366 = arg6;
        var10.field3377 = arg7;
        for (int var11 = arg0; var11 >= 0; var11--) {
            if (class86.field1459[var11][arg1][arg2] == null) {
                class86.field1459[var11][arg1][arg2] = new class160(var11, arg1, arg2);
            }
        }
        class86.field1459[arg0][arg1][arg2].field2632 = var10;
    }

    @OriginalMember(owner = "client!am", name = "i", descriptor = "(I)V", line = 177)
    public static final void method1619(int arg0) {
        class248.field4236 = null;
        class97.field1659 = null;
        class288.field4891 = null;
        class177.field3035 = (byte[][][]) null;
        class92.field1573 = null;
        class301.field5092 = (byte[][][]) null;
        field4057++;
        class82.field1398 = (int[][][]) null;
        class54.field736 = (byte[][][]) null;
        class122.field2034 = (byte[][][]) null;
        class111.field1877 = (byte[][][]) null;
        if (arg0 < -31) {
            class180.field3101 = null;
        }
    }
}
