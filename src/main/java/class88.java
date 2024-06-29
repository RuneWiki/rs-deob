import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class88 extends class70 {

    @OriginalMember(owner = "client!ub", name = "v", descriptor = "I")
    private int field1533 = -32768;

    @OriginalMember(owner = "client!ub", name = "o", descriptor = "[I")
    public static int[] field1526 = new int[50];

    @OriginalMember(owner = "client!ub", name = "u", descriptor = "Leb;")
    private static class230 field1532 = class68.method589(0, "Attack");

    @OriginalMember(owner = "client!ub", name = "x", descriptor = "Leb;")
    public static class230 field1535 = field1532;

    @OriginalMember(owner = "client!ub", name = "C", descriptor = "Leb;")
    private static class230 field1540 = class68.method589(0, "wave:");

    @OriginalMember(owner = "client!ub", name = "B", descriptor = "Leb;")
    public static class230 field1539 = field1540;

    @OriginalMember(owner = "client!ub", name = "A", descriptor = "Leb;")
    public static class230 field1538 = class68.method589(0, "gr-Un:");

    @OriginalMember(owner = "client!ub", name = "p", descriptor = "Leb;")
    public static class230 field1527 = field1540;

    @OriginalMember(owner = "client!ub", name = "E", descriptor = "Leb;")
    public static class230 field1542 = class68.method589(0, "<col=ff9040>");

    @OriginalMember(owner = "client!ub", name = "n", descriptor = "I")
    public static int field1525;

    @OriginalMember(owner = "client!ub", name = "q", descriptor = "I")
    public int field1528;

    @OriginalMember(owner = "client!ub", name = "r", descriptor = "I")
    public static int field1529;

    @OriginalMember(owner = "client!ub", name = "s", descriptor = "I")
    public static int field1530;

    @OriginalMember(owner = "client!ub", name = "t", descriptor = "I")
    public static int field1531;

    @OriginalMember(owner = "client!ub", name = "w", descriptor = "I")
    public static int field1534;

    @OriginalMember(owner = "client!ub", name = "y", descriptor = "I")
    public int field1536;

    @OriginalMember(owner = "client!ub", name = "z", descriptor = "I")
    public static int field1537;

    @OriginalMember(owner = "client!ub", name = "D", descriptor = "I")
    public static int field1541;

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(III)Lpd;")
    public static final class56 method716(int arg0, int arg1, int arg2) {
        class233 var3 = class53.field916[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class56 var4 = var3.field4052;
            var3.field4052 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IB)V")
    public static final void method717(int arg0, byte arg1) {
        class178.field3120.method1121(0, arg0);
        field1529++;
        if (arg1 <= 64) {
            method719(false, -123, (class223) null, (class223) null, (byte) 89);
        }
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(I)V")
    public static void method718(int arg0) {
        if (arg0 != -5970) {
            field1527 = null;
        }
        field1526 = null;
        field1542 = null;
        field1527 = null;
        field1538 = null;
        field1540 = null;
        field1532 = null;
        field1535 = null;
        field1539 = null;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(ZILkk;Lkk;B)Lok;")
    public static final class39 method719(boolean arg0, int arg1, class223 arg2, class223 arg3, byte arg4) {
        boolean var5 = true;
        field1537++;
        int[] var6 = arg2.method1535(arg1, (byte) 84);
        for (int var7 = 0; var7 < var6.length; var7++) {
            byte[] var8 = arg2.method1528(arg1, var6[var7], false);
            if (var8 == null) {
                var5 = false;
            } else {
                int var9 = (var8[0] & 0xFF) << 8 | var8[1] & 0xFF;
                byte[] var10;
                if (arg0) {
                    var10 = arg3.method1528(0, var9, false);
                } else {
                    var10 = arg3.method1528(var9, 0, false);
                }
                if (var10 == null) {
                    var5 = false;
                }
            }
        }
        if (arg4 < 62) {
            field1532 = null;
        }
        if (!var5) {
            return null;
        }
        try {
            return new class39(arg2, arg3, arg1, arg0);
        } catch (Exception var11) {
            return null;
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "()I")
    public final int method496() {
        field1525++;
        return this.field1533;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method500(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        field1534++;
        class257 var11 = class214.method1484(this.field1528, -1).method124((byte) 57, this.field1536, 0, (class249) null);
        if (var11 != null) {
            var11.method500(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            this.field1533 = var11.method496();
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIIILhj;Lhj;IIJ)V")
    public static final void method720(int arg0, int arg1, int arg2, int arg3, class70 arg4, class70 arg5, int arg6, int arg7, long arg8) {
        if (arg4 == null && arg5 == null) {
            return;
        }
        class108 var10 = new class108();
        var10.field1942 = arg8;
        var10.field1939 = arg1 * 128 + 64;
        var10.field1949 = arg2 * 128 + 64;
        var10.field1946 = arg3;
        var10.field1951 = arg4;
        var10.field1950 = arg5;
        var10.field1941 = arg6;
        var10.field1940 = arg7;
        for (int var11 = arg0; var11 >= 0; var11--) {
            if (class53.field916[var11][arg1][arg2] == null) {
                class53.field916[var11][arg1][arg2] = new class233(var11, arg1, arg2);
            }
        }
        class53.field916[arg0][arg1][arg2].field4056 = var10;
    }
}
