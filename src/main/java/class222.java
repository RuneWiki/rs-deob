import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uga")
public class class222 extends class60 {

    @OriginalMember(owner = "client!uga", name = "l", descriptor = "I")
    public static int field2581 = 1;

    @OriginalMember(owner = "client!uga", name = "q", descriptor = "Z")
    public static boolean field2586 = false;

    @OriginalMember(owner = "client!uga", name = "n", descriptor = "I")
    public static int field2583 = 0;

    @OriginalMember(owner = "client!uga", name = "p", descriptor = "Llja;")
    public static class744 field2585 = new class744(66, 3);

    @OriginalMember(owner = "client!uga", name = "k", descriptor = "I")
    public static int field2580;

    @OriginalMember(owner = "client!uga", name = "m", descriptor = "I")
    public static int field2582;

    @OriginalMember(owner = "client!uga", name = "o", descriptor = "I")
    public static int field2584;

    @OriginalMember(owner = "client!uga", name = "r", descriptor = "I")
    public static int field2587;

    @OriginalMember(owner = "client!uga", name = "s", descriptor = "I")
    public static int field2588;

    @OriginalMember(owner = "client!uga", name = "t", descriptor = "I")
    public static int field2589;

    @OriginalMember(owner = "client!uga", name = "a", descriptor = "(I)I")
    public final int method1368(int arg0) {
        if (arg0 != 0) {
            field2586 = false;
        }
        ++field2580;
        return super.field799;
    }

    @OriginalMember(owner = "client!uga", name = "b", descriptor = "(Z)V")
    public static void method1369(boolean arg0) {
        if (arg0) {
            field2585 = null;
        }
    }

    @OriginalMember(owner = "client!uga", name = "<init>", descriptor = "(Lhd;)V")
    public class222(class773 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!uga", name = "<init>", descriptor = "(ILhd;)V")
    public class222(int arg0, class773 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!uga", name = "a", descriptor = "(Z)I")
    public final int method405(boolean arg0) {
        if (arg0) {
            return 62;
        } else {
            ++field2582;
            return 0;
        }
    }

    @OriginalMember(owner = "client!uga", name = "c", descriptor = "(B)Z")
    public final boolean method1370(byte arg0) {
        ++field2584;
        if (arg0 >= -61) {
            this.method407((byte) 65, 58);
        }
        int var2 = super.field798.method4288(0).method1438(false);
        return var2 >= 96;
    }

    @OriginalMember(owner = "client!uga", name = "a", descriptor = "(BI)V")
    public final void method407(byte arg0, int arg1) {
        ++field2587;
        super.field799 = arg1;
        int var3 = 0 % ((arg0 - 28) / 50);
    }

    @OriginalMember(owner = "client!uga", name = "b", descriptor = "(II)I")
    public final int method406(int arg0, int arg1) {
        ++field2589;
        int var3 = super.field798.method4288(arg0 + arg0).method1438(false);
        if (~var3 > -97) {
            return 3;
        } else if (~arg1 < -2 && var3 < 128) {
            return 3;
        } else {
            return arg1 > 3 && var3 < 192 ? 3 : 1;
        }
    }

    @OriginalMember(owner = "client!uga", name = "b", descriptor = "(B)V")
    public final void method409(byte arg0) {
        ++field2588;
        int var2 = super.field798.method4288(0).method1438(false);
        if (var2 < 96) {
            super.field799 = 0;
        }
        if (~super.field799 < -2 && var2 < 128) {
            super.field799 = 1;
        }
        if (arg0 >= -27) {
            this.method405(false);
        }
        if (super.field799 > 2 && ~var2 > -193) {
            super.field799 = 2;
        }
        if (super.field799 < 0 || super.field799 > 3) {
            super.field799 = this.method405(false);
        }
    }
}
