import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public class class424 extends class207 {

    @OriginalMember(owner = "client!oh", name = "k", descriptor = "Ljb;")
    public static class519 field6091 = new class519(43, -2);

    @OriginalMember(owner = "client!oh", name = "g", descriptor = "I")
    public static int field6087;

    @OriginalMember(owner = "client!oh", name = "h", descriptor = "I")
    public static int field6088;

    @OriginalMember(owner = "client!oh", name = "i", descriptor = "I")
    public static int field6089;

    @OriginalMember(owner = "client!oh", name = "j", descriptor = "I")
    public static int field6090;

    @OriginalMember(owner = "client!oh", name = "l", descriptor = "I")
    public static int field6092;

    @OriginalMember(owner = "client!oh", name = "m", descriptor = "I")
    public static int field6093;

    @OriginalMember(owner = "client!oh", name = "n", descriptor = "I")
    public static int field6094;

    @OriginalMember(owner = "client!oh", name = "<init>", descriptor = "(ILrd;)V", line = 3)
    public class424(int arg0, class355 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "(I)V", line = 7)
    public static void method2552(int arg0) {
        field6091 = null;
        if (arg0 >= -105) {
            method2555((byte) -97);
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IB)V", line = 19)
    public final void method41(int arg0, byte arg1) {
        super.field2669 = arg0;
        if (arg1 > -7) {
            field6091 = null;
        }
        ++field6094;
    }

    @OriginalMember(owner = "client!oh", name = "<init>", descriptor = "(Lrd;)V", line = 30)
    public class424(class355 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!oh", name = "d", descriptor = "(I)I", line = 33)
    public final int method2553(int arg0) {
        if (arg0 != 43) {
            field6091 = null;
        }
        ++field6090;
        return super.field2669;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(I)V", line = 45)
    public final void method37(int arg0) {
        if (super.field2668.field5154.method1215((byte) 84) && ~super.field2669 == -3) {
            super.field2669 = 1;
        }
        ++field6093;
        if (~super.field2669 > -1 || ~super.field2669 < -3) {
            super.field2669 = this.method36(-44);
        }
        int var2 = 36 % ((-58 - arg0) / 48);
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(BII)Z", line = 61)
    public static final boolean method2554(byte arg0, int arg1, int arg2) {
        int var3 = 79 % ((arg0 - 47) / 45);
        ++field6092;
        return class319.method2066(arg1, (byte) 85, arg2) & class477.method2824(arg2, (byte) -128, arg1);
    }

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "(IB)I", line = 71)
    public final int method39(int arg0, byte arg1) {
        ++field6088;
        if (arg1 != 69) {
            this.method37(46);
        }
        return 1;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(B)I", line = 82)
    public static final int method2555(byte arg0) {
        ++field6087;
        if ((double) class752.field10160 == 3.0D) {
            return 37;
        } else {
            int var1 = -99 % ((arg0 - 24) / 43);
            if ((double) class752.field10160 == 4.0D) {
                return 50;
            } else if ((double) class752.field10160 == 6.0D) {
                return 75;
            } else {
                return (double) class752.field10160 == 8.0D ? 100 : 200;
            }
        }
    }

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "(I)I", line = 115)
    public final int method36(int arg0) {
        if (arg0 > -14) {
            field6091 = null;
        }
        ++field6089;
        return 2;
    }
}
