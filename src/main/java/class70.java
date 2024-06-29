import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!no")
public class class70 extends class125 {

    @OriginalMember(owner = "client!no", name = "o", descriptor = "[I")
    public static int[] field1075 = new int[32];

    @OriginalMember(owner = "client!no", name = "n", descriptor = "Llc;")
    public static class435 field1074 = new class435(78, 4);

    @OriginalMember(owner = "client!no", name = "i", descriptor = "I")
    public static int field1069;

    @OriginalMember(owner = "client!no", name = "j", descriptor = "I")
    public static int field1070;

    @OriginalMember(owner = "client!no", name = "k", descriptor = "I")
    public static int field1071;

    @OriginalMember(owner = "client!no", name = "l", descriptor = "I")
    public static int field1072;

    @OriginalMember(owner = "client!no", name = "m", descriptor = "I")
    public static int field1073;

    @OriginalMember(owner = "client!no", name = "p", descriptor = "I")
    public static int field1076;

    @OriginalMember(owner = "client!no", name = "q", descriptor = "I")
    public static int field1077;

    @OriginalMember(owner = "client!no", name = "r", descriptor = "I")
    public static int field1078;

    @OriginalMember(owner = "client!no", name = "b", descriptor = "(Z)V")
    public final void method156(boolean arg0) {
        if (super.field1733.method3308(-96)) {
            super.field1732 = 2;
        }
        if (!arg0) {
            this.method158((byte) -109);
        }
        ++field1071;
        if (~super.field1732 > -1 || super.field1732 > 2) {
            super.field1732 = this.method158((byte) -124);
        }
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(BI)V")
    public final void method157(byte arg0, int arg1) {
        ++field1073;
        if (arg0 < -32) {
            super.field1732 = arg1;
        }
    }

    @OriginalMember(owner = "client!no", name = "b", descriptor = "(I)V")
    public static void method618(int arg0) {
        if (arg0 >= 29) {
            field1074 = null;
            field1075 = null;
        }
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(B)I")
    public final int method158(byte arg0) {
        ++field1072;
        int var2 = -110 / ((arg0 - -63) / 49);
        if (super.field1733.method3308(-82)) {
            return 2;
        } else {
            return super.field1733.field7975.method3773(-122) && class184.method1303(super.field1733.field7975.method3775(false), 9499) ? 1 : 0;
        }
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(ZI)I")
    public final int method155(boolean arg0, int arg1) {
        ++field1077;
        if (super.field1733.method3308(-99)) {
            return 3;
        } else {
            if (!arg0) {
                field1076 = 115;
            }
            return 1;
        }
    }

    @OriginalMember(owner = "client!no", name = "c", descriptor = "(Z)I")
    public final int method619(boolean arg0) {
        ++field1070;
        if (arg0) {
            this.method619(false);
        }
        return super.field1732;
    }

    @OriginalMember(owner = "client!no", name = "<init>", descriptor = "(ILgp;)V")
    public class70(int arg0, class549 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!no", name = "<init>", descriptor = "(Lgp;)V")
    public class70(class549 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!no", name = "c", descriptor = "(I)Z")
    public final boolean method620(int arg0) {
        if (arg0 != -7558) {
            field1074 = null;
        }
        ++field1078;
        return !super.field1733.method3308(-83);
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(Lla;B)V")
    public static final void method621(class423 arg0, byte arg1) {
        class556.field8081 = 0;
        ++field1069;
        class603.field8549 = 0;
        class293.field4026 = new class215();
        class472.field6692 = new class287[1024];
        class726.field10206 = new class27[class79.field1138[class332.field4511] + 1];
        class174.field2450 = 0;
        class680.field9676 = 0;
        class357.method2270(0, arg0);
        class478.method2853((byte) 121, arg0);
        if (arg1 != -25) {
            method621((class423) null, (byte) 12);
        }
    }
}
