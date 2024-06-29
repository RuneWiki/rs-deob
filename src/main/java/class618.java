import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jv")
public class class618 extends class125 {

    @OriginalMember(owner = "client!jv", name = "i", descriptor = "I")
    public static int field8798 = 0;

    @OriginalMember(owner = "client!jv", name = "k", descriptor = "[I")
    public static int[] field8800 = new int[13];

    @OriginalMember(owner = "client!jv", name = "j", descriptor = "I")
    public static int field8799;

    @OriginalMember(owner = "client!jv", name = "l", descriptor = "I")
    public static int field8801;

    @OriginalMember(owner = "client!jv", name = "m", descriptor = "I")
    public static int field8802;

    @OriginalMember(owner = "client!jv", name = "n", descriptor = "I")
    public static int field8803;

    @OriginalMember(owner = "client!jv", name = "p", descriptor = "I")
    public static int field8805;

    @OriginalMember(owner = "client!jv", name = "q", descriptor = "I")
    public static int field8806;

    @OriginalMember(owner = "client!jv", name = "r", descriptor = "I")
    public static int field8807;

    @OriginalMember(owner = "client!jv", name = "s", descriptor = "I")
    public static int field8808;

    @OriginalMember(owner = "client!jv", name = "o", descriptor = "[Lre;")
    public static class277[] field8804;

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(BZI)I")
    public static final int method3587(byte arg0, boolean arg1, int arg2) {
        ++field8801;
        if (arg1) {
            return 0;
        } else {
            class37 var3 = class582.method3429(arg1, (byte) -113, arg2);
            if (var3 == null) {
                return class601.field8535.method2413(arg2, 5).field2252;
            } else {
                int var4 = 0;
                if (arg0 > -75) {
                    method3590(65);
                }
                for (int var5 = 0; ~var3.field334.length < ~var5; ++var5) {
                    if (~var3.field334[var5] == 0) {
                        ++var4;
                    }
                }
                return var4 + class601.field8535.method2413(arg2, 5).field2252 + -var3.field334.length;
            }
        }
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(ZI)I")
    public final int method155(boolean arg0, int arg1) {
        ++field8808;
        if (!arg0) {
            field8800 = null;
        }
        return 1;
    }

    @OriginalMember(owner = "client!jv", name = "b", descriptor = "(II)Z")
    public static final boolean method3588(int arg0, int arg1) {
        ++field8805;
        if (arg0 < 92) {
            field8804 = null;
        }
        return arg1 == 45 || ~arg1 == -26 || arg1 == 1002 || arg1 == 16 || ~arg1 == -5;
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(BI)V")
    public final void method157(byte arg0, int arg1) {
        ++field8807;
        super.field1732 = arg1;
        if (arg0 > -32) {
            method3591((class194) null, (byte) 82);
        }
    }

    @OriginalMember(owner = "client!jv", name = "c", descriptor = "(Z)I")
    public final int method3589(boolean arg0) {
        ++field8803;
        if (arg0) {
            this.method157((byte) 123, -26);
        }
        return super.field1732;
    }

    @OriginalMember(owner = "client!jv", name = "<init>", descriptor = "(Lgp;)V")
    public class618(class549 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!jv", name = "b", descriptor = "(Z)V")
    public final void method156(boolean arg0) {
        if (~super.field1732 != -2 && super.field1732 != 0) {
            super.field1732 = this.method158((byte) -126);
        }
        if (!arg0) {
            method3590(46);
        }
        ++field8806;
    }

    @OriginalMember(owner = "client!jv", name = "b", descriptor = "(I)V")
    public static void method3590(int arg0) {
        field8804 = null;
        field8800 = null;
        if (arg0 != 0) {
            method3591((class194) null, (byte) -76);
        }
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(Laj;B)V")
    public static final void method3591(class194 arg0, byte arg1) {
        ++field8802;
        arg0.method2381(15735);
        boolean var2 = false;
        class194 var3 = (class194) class225.field3348.method3025(false);
        if (arg1 == -127) {
            while (var3 != null) {
                if (class224.method1555(arg0.method1372(-128), var3.method1372(-128), true)) {
                    var2 = true;
                    class440.method2693(var3, arg0, -69);
                    break;
                }
                var3 = (class194) class225.field3348.method3026(true);
            }
            if (!var2) {
                class225.field3348.method3029(0, arg0);
            }
        }
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(B)I")
    public final int method158(byte arg0) {
        ++field8799;
        int var2 = 52 / ((arg0 - -63) / 49);
        return 1;
    }

    @OriginalMember(owner = "client!jv", name = "<init>", descriptor = "(ILgp;)V")
    public class618(int arg0, class549 arg1) {
        super(arg0, arg1);
    }
}
