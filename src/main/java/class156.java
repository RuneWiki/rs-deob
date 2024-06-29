import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bp")
public class class156 extends class125 {

    @OriginalMember(owner = "client!bp", name = "j", descriptor = "Lgr;")
    public static class530 field2245 = new class530(82, 7);

    @OriginalMember(owner = "client!bp", name = "i", descriptor = "I")
    public static int field2244;

    @OriginalMember(owner = "client!bp", name = "k", descriptor = "I")
    public static int field2246;

    @OriginalMember(owner = "client!bp", name = "l", descriptor = "I")
    public static int field2247;

    @OriginalMember(owner = "client!bp", name = "m", descriptor = "I")
    public static int field2248;

    @OriginalMember(owner = "client!bp", name = "n", descriptor = "I")
    public static int field2249;

    @OriginalMember(owner = "client!bp", name = "o", descriptor = "I")
    public static int field2250;

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(B)I", line = 6)
    public final int method158(byte arg0) {
        int var2 = 36 / ((arg0 - -63) / 49);
        ++field2244;
        return 0;
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "()V", line = 18)
    public static final void method1116() {
        for (int var0 = 0; var0 < class594.field8445; ++var0) {
            class638 var1 = class356.field5256[var0];
            class152.method1098(var1, true);
            class356.field5256[var0] = null;
        }
        class594.field8445 = 0;
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(BI)V", line = 33)
    public final void method157(byte arg0, int arg1) {
        super.field1732 = arg1;
        ++field2246;
        if (arg0 >= -32) {
            method1118(33);
        }
    }

    @OriginalMember(owner = "client!bp", name = "c", descriptor = "(Z)I", line = 44)
    public final int method1117(boolean arg0) {
        ++field2249;
        return arg0 ? 120 : super.field1732;
    }

    @OriginalMember(owner = "client!bp", name = "<init>", descriptor = "(ILgp;)V", line = 55)
    public class156(int arg0, class549 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(ZI)I", line = 58)
    public final int method155(boolean arg0, int arg1) {
        ++field2247;
        int var3 = super.field1733.method3303(-1).method2048(7);
        if (~var3 > -97) {
            return 3;
        } else if (~arg1 < -2 && ~var3 > -129) {
            return 3;
        } else if (~arg1 < -4 && var3 < 192) {
            return 3;
        } else {
            return !arg0 ? 124 : 1;
        }
    }

    @OriginalMember(owner = "client!bp", name = "b", descriptor = "(Z)V", line = 84)
    public final void method156(boolean arg0) {
        ++field2250;
        int var2 = super.field1733.method3303(-1).method2048(7);
        if (~var2 > -97) {
            super.field1732 = 0;
        }
        if (~super.field1732 < -2 && ~var2 > -129) {
            super.field1732 = 1;
        }
        if (super.field1732 > 2 && ~var2 > -193) {
            super.field1732 = 2;
        }
        if (~super.field1732 > -1 || ~super.field1732 < -4) {
            super.field1732 = this.method158((byte) -112);
        }
        if (!arg0) {
            field2245 = null;
        }
    }

    @OriginalMember(owner = "client!bp", name = "<init>", descriptor = "(Lgp;)V", line = 111)
    public class156(class549 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!bp", name = "b", descriptor = "(I)V", line = 116)
    public static void method1118(int arg0) {
        field2245 = null;
        if (arg0 != 0) {
            field2245 = null;
        }
    }

    @OriginalMember(owner = "client!bp", name = "c", descriptor = "(I)Z", line = 126)
    public final boolean method1119(int arg0) {
        ++field2248;
        int var2 = super.field1733.method3303(-1).method2048(7);
        if (~var2 > -97) {
            return false;
        } else {
            if (arg0 != -7558) {
                field2245 = null;
            }
            return true;
        }
    }
}
