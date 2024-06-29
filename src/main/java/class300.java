import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public class class300 extends class488 implements class105 {

    @OriginalMember(owner = "client!li", name = "l", descriptor = "I")
    private int field4409;

    @OriginalMember(owner = "client!li", name = "f", descriptor = "Lwi;")
    public static class330 field4403 = new class330(64);

    @OriginalMember(owner = "client!li", name = "i", descriptor = "I")
    public static int field4406 = 0;

    @OriginalMember(owner = "client!li", name = "g", descriptor = "I")
    public static int field4404 = 0;

    @OriginalMember(owner = "client!li", name = "c", descriptor = "I")
    public static int field4400;

    @OriginalMember(owner = "client!li", name = "d", descriptor = "I")
    public static int field4401;

    @OriginalMember(owner = "client!li", name = "e", descriptor = "I")
    public static int field4402;

    @OriginalMember(owner = "client!li", name = "h", descriptor = "I")
    public static int field4405;

    @OriginalMember(owner = "client!li", name = "j", descriptor = "I")
    public static int field4407;

    @OriginalMember(owner = "client!li", name = "k", descriptor = "I")
    public static int field4408;

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(Z)I")
    public final int method674(boolean arg0) {
        if (!arg0) {
            method1906(false);
        }
        ++field4405;
        return this.field4409;
    }

    @OriginalMember(owner = "client!li", name = "b", descriptor = "(I)V")
    public static final void method1905(int arg0) {
        if (arg0 != 0) {
            field4406 = -90;
        }
        ++field4407;
        if (~class435.field6596 == -7) {
            class420.method2566(-5, false);
        } else {
            class195.field2615 = class374.field5695;
            class374.field5695 = null;
            class134.method908(12, arg0 + 2);
        }
    }

    @OriginalMember(owner = "client!li", name = "<init>", descriptor = "(Lnq;I[BI)V")
    public class300(class325 arg0, int arg1, byte[] arg2, int arg3) {
        super(arg0, arg2, arg3);
        this.field4409 = arg1;
    }

    @OriginalMember(owner = "client!li", name = "b", descriptor = "(Z)J")
    public final long method676(boolean arg0) {
        if (arg0) {
            method1905(46);
        }
        ++field4400;
        return super.field7222.method2723();
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(I)I")
    public final int method677(int arg0) {
        ++field4401;
        return arg0 != -9737 ? 80 : 0;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(BI[BI)V")
    public final void method675(byte arg0, int arg1, byte[] arg2, int arg3) {
        ++field4408;
        this.method2920(arg2, arg1);
        this.field4409 = arg3;
        int var5 = 97 / ((-24 - arg0) / 33);
    }

    @OriginalMember(owner = "client!li", name = "c", descriptor = "(Z)V")
    public static final void method1906(boolean arg0) {
        if (arg0) {
            class443.field6672 = class35.field516;
            class306.field4447 = class71.field988;
        } else {
            class443.field6672 = class453.field6825;
            class306.field4447 = class414.field6317;
        }
        class141.field1892 = class443.field6672.length;
    }

    @OriginalMember(owner = "client!li", name = "c", descriptor = "(I)V")
    public static void method1907(int arg0) {
        if (arg0 == 5990) {
            field4403 = null;
        }
    }
}
