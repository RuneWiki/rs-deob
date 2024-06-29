import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vba")
public class class45 extends class60 {

    @OriginalMember(owner = "client!vba", name = "n", descriptor = "Z")
    public static boolean field603 = false;

    @OriginalMember(owner = "client!vba", name = "k", descriptor = "I")
    public static int field600;

    @OriginalMember(owner = "client!vba", name = "l", descriptor = "I")
    public static int field601;

    @OriginalMember(owner = "client!vba", name = "m", descriptor = "I")
    public static int field602;

    @OriginalMember(owner = "client!vba", name = "o", descriptor = "I")
    public static int field604;

    @OriginalMember(owner = "client!vba", name = "p", descriptor = "I")
    public static int field605;

    @OriginalMember(owner = "client!vba", name = "q", descriptor = "I")
    public static int field606;

    @OriginalMember(owner = "client!vba", name = "r", descriptor = "I")
    public static int field607;

    @OriginalMember(owner = "client!vba", name = "s", descriptor = "I")
    public static int field608;

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(Z)I")
    public final int method405(boolean arg0) {
        if (arg0) {
            field603 = true;
        }
        ++field602;
        return 0;
    }

    @OriginalMember(owner = "client!vba", name = "b", descriptor = "(II)I")
    public final int method406(int arg0, int arg1) {
        ++field604;
        return !class32.method301(super.field798.field10665.method1903(arg0), false) ? 3 : 1;
    }

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(BI)V")
    public final void method407(byte arg0, int arg1) {
        super.field799 = arg1;
        int var3 = 4 % ((28 - arg0) / 50);
        ++field601;
    }

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(I)I")
    public final int method408(int arg0) {
        if (arg0 != 0) {
            this.method405(true);
        }
        ++field600;
        return super.field799;
    }

    @OriginalMember(owner = "client!vba", name = "<init>", descriptor = "(Lhd;)V")
    public class45(class773 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!vba", name = "b", descriptor = "(B)V")
    public final void method409(byte arg0) {
        if (arg0 > -27) {
            field608 = 10;
        }
        if (super.field798.field10665.method1905(14784) && !class32.method301(super.field798.field10665.method1903(0), false)) {
            super.field799 = 0;
        }
        ++field606;
        if (super.field799 < 0 || super.field799 > 1) {
            super.field799 = this.method405(false);
        }
    }

    @OriginalMember(owner = "client!vba", name = "<init>", descriptor = "(ILhd;)V")
    public class45(int arg0, class773 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!vba", name = "c", descriptor = "(B)Z")
    public final boolean method410(byte arg0) {
        if (arg0 >= -61) {
            field608 = -41;
        }
        ++field605;
        return class32.method301(super.field798.field10665.method1903(0), false);
    }

    @OriginalMember(owner = "client!vba", name = "d", descriptor = "(B)V")
    public static final void method411(byte arg0) {
        class288 var1 = class374.field4698;
        synchronized (class374.field4698) {
            class374.field4698.method1690(0);
            int var2 = -50 % ((31 - arg0) / 44);
        }
        ++field607;
    }
}
