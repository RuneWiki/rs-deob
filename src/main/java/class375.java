import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!du")
public class class375 extends class207 {

    @OriginalMember(owner = "client!du", name = "n", descriptor = "Log;")
    public static class673 field5487 = new class673();

    @OriginalMember(owner = "client!du", name = "o", descriptor = "Leo;")
    public static class313 field5488 = new class313(4, 1);

    @OriginalMember(owner = "client!du", name = "p", descriptor = "Leo;")
    public static class313 field5489 = new class313(0, 1);

    @OriginalMember(owner = "client!du", name = "g", descriptor = "I")
    public static int field5480;

    @OriginalMember(owner = "client!du", name = "h", descriptor = "I")
    public static int field5481;

    @OriginalMember(owner = "client!du", name = "i", descriptor = "I")
    public static int field5482;

    @OriginalMember(owner = "client!du", name = "j", descriptor = "I")
    public static int field5483;

    @OriginalMember(owner = "client!du", name = "k", descriptor = "I")
    public static int field5484;

    @OriginalMember(owner = "client!du", name = "l", descriptor = "I")
    public static int field5485;

    @OriginalMember(owner = "client!du", name = "m", descriptor = "I")
    public static int field5486;

    @OriginalMember(owner = "client!du", name = "q", descriptor = "Lha;")
    public static class66 field5490;

    @OriginalMember(owner = "client!du", name = "c", descriptor = "(I)V", line = 4)
    public static void method2354(int arg0) {
        field5488 = null;
        field5490 = null;
        field5489 = null;
        field5487 = null;
        if (arg0 != 1) {
            method2355(-81);
        }
    }

    @OriginalMember(owner = "client!du", name = "<init>", descriptor = "(ILrd;)V", line = 19)
    public class375(int arg0, class355 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!du", name = "b", descriptor = "(IB)I", line = 22)
    public final int method39(int arg0, byte arg1) {
        ++field5484;
        return arg1 != 69 ? 121 : 1;
    }

    @OriginalMember(owner = "client!du", name = "d", descriptor = "(I)[Laka;", line = 34)
    public static final class86[] method2355(int arg0) {
        ++field5481;
        return arg0 >= -124 ? null : new class86[] { class216.field2827, class545.field7538, class11.field126 };
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(I)V", line = 45)
    public final void method37(int arg0) {
        ++field5486;
        if (super.field2668.method2248(false) == class682.field9122) {
            super.field2669 = 2;
        }
        if (super.field2669 < 0 || super.field2669 > 2) {
            super.field2669 = this.method36(-59);
        }
        int var2 = -85 % ((arg0 - -58) / 48);
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(IB)V", line = 62)
    public final void method41(int arg0, byte arg1) {
        super.field2669 = arg0;
        if (arg1 > -7) {
            field5487 = null;
        }
        ++field5480;
    }

    @OriginalMember(owner = "client!du", name = "<init>", descriptor = "(Lrd;)V", line = 77)
    public class375(class355 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!du", name = "b", descriptor = "(I)I", line = 82)
    public final int method36(int arg0) {
        if (arg0 > -14) {
            field5490 = null;
        }
        ++field5485;
        return 1;
    }

    @OriginalMember(owner = "client!du", name = "e", descriptor = "(I)I", line = 96)
    public final int method2356(int arg0) {
        ++field5482;
        if (arg0 != 43) {
            this.method2356(8);
        }
        return super.field2669;
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(ILofa;)V", line = 108)
    public static final void method2357(int arg0, class347 arg1) {
        ++field5483;
        class347 var2 = class171.method1151(arg1, (byte) -55);
        if (arg0 > -11) {
            field5488 = null;
        }
        int var3;
        int var4;
        if (var2 == null) {
            var3 = class693.field9222;
            var4 = class460.field6558;
        } else {
            var3 = var2.field4940;
            var4 = var2.field4986;
        }
        class454.method2699(false, var3, var4, arg1, 103);
        class687.method3765(114, var3, arg1, var4);
    }
}
