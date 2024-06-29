import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public class class50 extends class125 {

    @OriginalMember(owner = "client!c", name = "o", descriptor = "I")
    public static int field813 = 0;

    @OriginalMember(owner = "client!c", name = "l", descriptor = "Llc;")
    public static class435 field810 = new class435(53, 4);

    @OriginalMember(owner = "client!c", name = "i", descriptor = "I")
    public static int field807;

    @OriginalMember(owner = "client!c", name = "j", descriptor = "I")
    public static int field808;

    @OriginalMember(owner = "client!c", name = "k", descriptor = "I")
    public static int field809;

    @OriginalMember(owner = "client!c", name = "m", descriptor = "I")
    public static int field811;

    @OriginalMember(owner = "client!c", name = "n", descriptor = "I")
    public static int field812;

    @OriginalMember(owner = "client!c", name = "p", descriptor = "I")
    public static int field814;

    @OriginalMember(owner = "client!c", name = "q", descriptor = "I")
    public static int field815;

    @OriginalMember(owner = "client!c", name = "<init>", descriptor = "(ILgp;)V")
    public class50(int arg0, class549 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(BI)V")
    public final void method157(byte arg0, int arg1) {
        super.field1732 = arg1;
        if (arg0 >= -32) {
            this.method157((byte) -88, 85);
        }
        ++field814;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(B)I")
    public final int method158(byte arg0) {
        int var2 = -52 / ((arg0 - -63) / 49);
        ++field815;
        return 0;
    }

    @OriginalMember(owner = "client!c", name = "<init>", descriptor = "(Lgp;)V")
    public class50(class549 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(I)V")
    public static void method465(int arg0) {
        if (arg0 == -4) {
            field810 = null;
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(ZI)I")
    public final int method155(boolean arg0, int arg1) {
        ++field809;
        if (!arg0) {
            method468(78);
        }
        return 1;
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(II)V")
    public static final void method466(int arg0, int arg1) {
        ++field808;
        class503 var2 = class512.method3112(arg1, arg0, 0);
        var2.method3074(arg1 ^ -111);
    }

    @OriginalMember(owner = "client!c", name = "c", descriptor = "(Z)I")
    public final int method467(boolean arg0) {
        ++field811;
        if (arg0) {
            method466(30, -118);
        }
        return super.field1732;
    }

    @OriginalMember(owner = "client!c", name = "c", descriptor = "(I)V")
    public static final void method468(int arg0) {
        ++field807;
        class270.method1763((byte) 85);
        if (arg0 >= -71) {
            method466(-102, 51);
        }
        int var1 = class243.field3580.field7979.method3835(false);
        if (var1 != 2) {
            if (~var1 == -4) {
                class641.method3702(class68.field1042, 128, class413.field5881, class211.field3164, 2, class310.field4180, class565.field8187, 2);
            }
        } else {
            class23.method104(-92, 100, class68.field1042, class565.field8187, class211.field3164, 100);
        }
        if (class243.field3580.field7979.method3837(-97)) {
            class90.method703(class95.field1383, -6993);
        }
        if (class211.field3164 != null) {
            class200.method1418(true);
        }
        class100.field1447 = class243.field3580.field7979.method3835(false) != 0;
        class416.field5919 = class243.field3580.field7979.method3837(-99);
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(Z)V")
    public final void method156(boolean arg0) {
        if (super.field1732 < 0 || ~super.field1732 < -5) {
            super.field1732 = this.method158((byte) -124);
        }
        ++field812;
        if (!arg0) {
            method465(-39);
        }
    }
}
