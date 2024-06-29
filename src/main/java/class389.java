import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public class class389 extends class207 {

    @OriginalMember(owner = "client!pa", name = "p", descriptor = "Lmw;")
    public static class517 field5635 = new class517(73, -1);

    @OriginalMember(owner = "client!pa", name = "q", descriptor = "Ljea;")
    public static class474 field5636 = new class474(13, 8);

    @OriginalMember(owner = "client!pa", name = "t", descriptor = "Z")
    public static boolean field5639 = false;

    @OriginalMember(owner = "client!pa", name = "r", descriptor = "I")
    public static int field5637 = 0;

    @OriginalMember(owner = "client!pa", name = "g", descriptor = "I")
    public static int field5626;

    @OriginalMember(owner = "client!pa", name = "h", descriptor = "I")
    public static int field5627;

    @OriginalMember(owner = "client!pa", name = "i", descriptor = "I")
    public static int field5628;

    @OriginalMember(owner = "client!pa", name = "j", descriptor = "I")
    public static int field5629;

    @OriginalMember(owner = "client!pa", name = "k", descriptor = "I")
    public static int field5630;

    @OriginalMember(owner = "client!pa", name = "l", descriptor = "I")
    public static int field5631;

    @OriginalMember(owner = "client!pa", name = "m", descriptor = "I")
    public static int field5632;

    @OriginalMember(owner = "client!pa", name = "n", descriptor = "I")
    public static int field5633;

    @OriginalMember(owner = "client!pa", name = "o", descriptor = "I")
    public static int field5634;

    @OriginalMember(owner = "client!pa", name = "s", descriptor = "I")
    public static int field5638;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IJI)Lwga;")
    public static final class778 method2406(int arg0, long arg1, int arg2) {
        ++field5628;
        class778 var4 = (class778) class34.field369.method1248(115, arg1 | (long) arg2 << 56);
        int var5 = -55 / ((-24 - arg0) / 60);
        if (var4 == null) {
            var4 = new class778(arg2, arg1);
            class34.field369.method1247(4070, var4.field2146, var4);
        }
        return var4;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(III)V")
    public static final void method2407(int arg0, int arg1, int arg2) {
        ++field5630;
        class778 var3 = method2406(127, (long) arg2, 1);
        var3.method4274(111);
        var3.field10690 = arg0;
        if (arg1 < 33) {
            field5638 = 115;
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
    public static final String method2408(int arg0, String arg1) {
        ++field5634;
        if (arg0 != 13) {
            return null;
        } else {
            String var2 = class452.method2689((byte) -90, class706.method3921((byte) 14, arg1));
            if (var2 == null) {
                var2 = "";
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "(IB)I")
    public final int method39(int arg0, byte arg1) {
        ++field5629;
        if (super.field2668.method2254(44)) {
            return 3;
        } else {
            if (arg1 != 69) {
                method2411(57);
            }
            return 1;
        }
    }

    @OriginalMember(owner = "client!pa", name = "<init>", descriptor = "(ILrd;)V")
    public class389(int arg0, class355 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IB)V")
    public final void method41(int arg0, byte arg1) {
        super.field2669 = arg0;
        ++field5632;
        if (arg1 > -7) {
            this.method36(-101);
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(I)V")
    public final void method37(int arg0) {
        int var2 = -40 % ((-58 - arg0) / 48);
        ++field5633;
        if (super.field2668.method2254(59)) {
            super.field2669 = 0;
        }
        if (~super.field2669 != -2 && ~super.field2669 != -1) {
            super.field2669 = this.method36(-84);
        }
    }

    @OriginalMember(owner = "client!pa", name = "<init>", descriptor = "(Lrd;)V")
    public class389(class355 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "(I)I")
    public final int method2409(int arg0) {
        ++field5627;
        if (arg0 != 43) {
            field5638 = 85;
        }
        return super.field2669;
    }

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "(I)I")
    public final int method36(int arg0) {
        if (arg0 >= -14) {
            field5639 = true;
        }
        ++field5626;
        return 1;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(B)Z")
    public final boolean method2410(byte arg0) {
        ++field5631;
        if (arg0 != 8) {
            field5636 = null;
        }
        return !super.field2668.method2254(120);
    }

    @OriginalMember(owner = "client!pa", name = "d", descriptor = "(I)V")
    public static void method2411(int arg0) {
        field5636 = null;
        field5635 = null;
        if (arg0 != 13) {
            method2411(90);
        }
    }
}
