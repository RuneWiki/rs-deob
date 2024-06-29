import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iu")
public class class579 {

    @OriginalMember(owner = "client!iu", name = "i", descriptor = "Lfc;")
    private class262 field8125 = new class262(64);

    @OriginalMember(owner = "client!iu", name = "c", descriptor = "Lni;")
    private class522 field8119;

    @OriginalMember(owner = "client!iu", name = "e", descriptor = "I")
    public int field8121;

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "I")
    public static int field8117 = 0;

    @OriginalMember(owner = "client!iu", name = "f", descriptor = "Lvfa;")
    public static class671 field8122 = new class671(0, 0);

    @OriginalMember(owner = "client!iu", name = "k", descriptor = "I")
    public static int field8127 = -1;

    @OriginalMember(owner = "client!iu", name = "d", descriptor = "I")
    public static int field8120;

    @OriginalMember(owner = "client!iu", name = "g", descriptor = "I")
    public static int field8123;

    @OriginalMember(owner = "client!iu", name = "h", descriptor = "I")
    public static int field8124;

    @OriginalMember(owner = "client!iu", name = "j", descriptor = "I")
    public static int field8126;

    @OriginalMember(owner = "client!iu", name = "b", descriptor = "[I")
    public static int[] field8118;

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(I)V", line = 12)
    public static void method3239(int arg0) {
        field8122 = null;
        if (arg0 == 0) {
            field8118 = null;
        }
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(IIB)I", line = 23)
    public static final int method3240(int arg0, int arg1, byte arg2) {
        if (arg2 != 98) {
            field8118 = null;
        }
        field8123++;
        byte var3;
        if (arg0 > 20000) {
            class391.method2275(1);
            var3 = 4;
        } else if (arg0 > 10000) {
            var3 = 3;
            class677.method3848((byte) 19);
        } else if (arg0 > 5000) {
            class354.method2048((byte) 66);
            var3 = 2;
        } else {
            class753.method4190(arg2 - 216, true);
            var3 = 1;
        }
        if (class11.field68.field5503.method741((byte) 125) != arg1) {
            class11.field68.method2276((byte) -13, arg1, class11.field68.field5530);
            class479.method2689(arg1, false, arg2 - 215);
        }
        class355.method2054(-5964);
        return var3;
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(ZILjava/lang/String;Ljava/lang/String;I)V", line = 79)
    public static final void method3241(boolean arg0, int arg1, String arg2, String arg3, int arg4) {
        field8124++;
        class103 var5 = class756.method4206(false);
        var5.field1379.method3393(class696.field9727.field2395, -86);
        var5.field1379.method3423(0, 1571862888);
        int var6 = var5.field1379.field8520;
        var5.field1379.method3423(637, arg1 ^ 0x5DB0B968);
        int[] var7 = class132.method833(12206, var5);
        int var8 = var5.field1379.field8520;
        var5.field1379.method3387(arg3, (byte) 113);
        var5.field1379.method3423(class586.field8204, 1571862888);
        var5.field1379.method3387(arg2, (byte) 113);
        var5.field1379.method3420(-75, class377.field5237);
        var5.field1379.method3393(class723.field10095, 62);
        var5.field1379.method3393(class51.field541.field3141, 126);
        class135.method840(var5.field1379, (byte) 0);
        String var9 = class3.field27;
        var5.field1379.method3393(var9 == null ? 0 : 1, arg1 - 61);
        if (var9 != null) {
            var5.field1379.method3387(var9, (byte) 113);
        }
        var5.field1379.method3393(arg4, -114);
        var5.field1379.method3393(arg0 ? 1 : 0, 93);
        var5.field1379.field8520 += 7;
        var5.field1379.method3434(true, var7, var8, var5.field1379.field8520);
        var5.field1379.method3406((byte) 90, var5.field1379.field8520 - var6);
        class27.method104(false, var5);
        class284.field3753 = 1;
        class397.field5635 = arg1;
        class48.field487 = 0;
        class698.field9828 = -3;
        if (arg4 < 13) {
            class60.field647 = true;
            class285.method1707(-97);
        }
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(II)Lfn;", line = 127)
    public final class140 method3242(int arg0, int arg1) {
        field8126++;
        class262 var3 = this.field8125;
        class140 var4;
        synchronized (this.field8125) {
            var4 = (class140) this.field8125.method1571(-121, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        if (arg1 <= 39) {
            method3240(-23, -51, (byte) 7);
        }
        class522 var5 = this.field8119;
        byte[] var6;
        synchronized (this.field8119) {
            var6 = this.field8119.method2885(arg0, 19, false);
        }
        class140 var7 = new class140();
        if (var6 != null) {
            var7.method869(new class611(var6), -23453);
        }
        class262 var8 = this.field8125;
        synchronized (this.field8125) {
            this.field8125.method1574((long) arg0, var7, (byte) -80);
            return var7;
        }
    }

    @OriginalMember(owner = "client!iu", name = "<init>", descriptor = "(Lrga;ILni;)V", line = 169)
    public class579(class242 arg0, int arg1, class522 arg2) {
        this.field8119 = arg2;
        this.field8121 = this.field8119.method2901(0, 19);
    }
}
