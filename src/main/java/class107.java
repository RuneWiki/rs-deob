import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public class class107 extends class252 {

    @OriginalMember(owner = "client!ej", name = "w", descriptor = "Z")
    private boolean field1651 = false;

    @OriginalMember(owner = "client!ej", name = "r", descriptor = "I")
    public static int field1646 = 0;

    @OriginalMember(owner = "client!ej", name = "o", descriptor = "I")
    public static int field1643;

    @OriginalMember(owner = "client!ej", name = "p", descriptor = "I")
    public static int field1644;

    @OriginalMember(owner = "client!ej", name = "q", descriptor = "I")
    public static int field1645;

    @OriginalMember(owner = "client!ej", name = "s", descriptor = "I")
    public static int field1647;

    @OriginalMember(owner = "client!ej", name = "t", descriptor = "I")
    public static int field1648;

    @OriginalMember(owner = "client!ej", name = "u", descriptor = "I")
    public static int field1649;

    @OriginalMember(owner = "client!ej", name = "v", descriptor = "I")
    public static int field1650;

    @OriginalMember(owner = "client!ej", name = "x", descriptor = "I")
    public static int field1652;

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(Lbb;II)V")
    public final void method790(class301 arg0, int arg1, int arg2) {
        ++field1644;
        super.field3884.method2337(false, arg0);
        super.field3884.method2308(arg2, arg1);
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(ZI)V")
    public final void method794(boolean arg0, int arg1) {
        if (arg1 != -1) {
            this.field1651 = false;
        }
        ++field1643;
        class45 var3 = super.field3884.method2353(1);
        if (var3 != null && arg0) {
            super.field3884.method2351(0, 1);
            super.field3884.method2337(false, var3);
            super.field3884.method1886(1, class559.field7887);
            super.field3884.method2351(arg1 + 1, 1);
            super.field3884.method2339(class203.field2875, -32540, class190.field2740);
            super.field3884.method1881(true, class319.field4696, 2, -4016, false);
            super.field3884.method2360(0, class315.field4669, 1);
            class21 var4 = super.field3884.method2327(true);
            var4.method261(2, super.field3884.method2354(25603));
            super.field3884.method2356(0, class564.field7957);
            super.field3884.method2351(0, 0);
            this.field1651 = true;
        } else {
            super.field3884.method2360(0, class315.field4669, arg1 ^ -2);
        }
    }

    @OriginalMember(owner = "client!ej", name = "h", descriptor = "(I)I")
    public static final int method844(int arg0) {
        ++field1652;
        if (arg0 != 2) {
            field1645 = -36;
        }
        return class390.field5792;
    }

    @OriginalMember(owner = "client!ej", name = "e", descriptor = "(I)Z")
    public final boolean method792(int arg0) {
        if (arg0 != 6439) {
            this.field1651 = true;
        }
        ++field1649;
        return true;
    }

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "(ZI)V")
    public final void method791(boolean arg0, int arg1) {
        ++field1650;
        super.field3884.method2339(class153.field2209, -32540, class190.field2740);
        if (arg1 != 1) {
            field1646 = 60;
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(Z)V")
    public final void method788(boolean arg0) {
        ++field1648;
        if (this.field1651) {
            super.field3884.method2351(0, 1);
            super.field3884.method1886(1, class673.field9510);
            super.field3884.method2339(class153.field2209, -32540, class153.field2209);
            super.field3884.method2324(2, class124.field1869, 1);
            super.field3884.method2360(0, class61.field1155, 1);
            super.field3884.method2358(-1);
            super.field3884.method2337(false, (class301) null);
            super.field3884.method2351(0, 0);
            this.field1651 = false;
        } else {
            super.field3884.method2360(0, class61.field1155, 1);
        }
        if (!arg0) {
            field1645 = 123;
        }
        super.field3884.method2339(class153.field2209, -32540, class153.field2209);
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(III)V")
    public final void method796(int arg0, int arg1, int arg2) {
        ++field1647;
        if (arg2 >= -105) {
            field1645 = -58;
        }
    }

    @OriginalMember(owner = "client!ej", name = "<init>", descriptor = "(Lhea;)V")
    public class107(class387 arg0) {
        super(arg0);
    }

    static {
        new class27("", 73);
    }
}
