import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class266 extends class60 {

    @OriginalMember(owner = "client!ae", name = "m", descriptor = "Llja;")
    public static class744 field3141 = new class744(45, 7);

    @OriginalMember(owner = "client!ae", name = "q", descriptor = "Lifa;")
    public static class450 field3145 = new class450();

    @OriginalMember(owner = "client!ae", name = "k", descriptor = "I")
    public static int field3139;

    @OriginalMember(owner = "client!ae", name = "l", descriptor = "I")
    public static int field3140;

    @OriginalMember(owner = "client!ae", name = "n", descriptor = "I")
    public static int field3142;

    @OriginalMember(owner = "client!ae", name = "o", descriptor = "I")
    public static int field3143;

    @OriginalMember(owner = "client!ae", name = "p", descriptor = "I")
    public static int field3144;

    @OriginalMember(owner = "client!ae", name = "r", descriptor = "[[B")
    public static byte[][] field3146;

    @OriginalMember(owner = "client!ae", name = "<init>", descriptor = "(ILhd;)V")
    public class266(int arg0, class773 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(B)V")
    public final void method409(byte arg0) {
        if (super.field799 != 1 && super.field799 != 0) {
            super.field799 = this.method405(false);
        }
        ++field3144;
        if (arg0 > -27) {
            this.method1580(-117);
        }
    }

    @OriginalMember(owner = "client!ae", name = "<init>", descriptor = "(Lhd;)V")
    public class266(class773 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Z)I")
    public final int method405(boolean arg0) {
        if (arg0) {
            this.method1580(118);
        }
        ++field3142;
        return 1;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(I)V")
    public static void method1579(int arg0) {
        field3145 = null;
        if (arg0 != -9720) {
            method1579(-117);
        }
        field3141 = null;
        field3146 = null;
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(II)I")
    public final int method406(int arg0, int arg1) {
        if (arg0 != 0) {
            field3146 = null;
        }
        ++field3143;
        return 1;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(BI)V")
    public final void method407(byte arg0, int arg1) {
        ++field3139;
        super.field799 = arg1;
        int var3 = 71 % ((28 - arg0) / 50);
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(I)I")
    public final int method1580(int arg0) {
        ++field3140;
        if (arg0 != 0) {
            field3145 = null;
        }
        return super.field799;
    }
}
