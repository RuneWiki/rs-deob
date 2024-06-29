import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wga")
public class class484 extends class125 {

    @OriginalMember(owner = "client!wga", name = "i", descriptor = "I")
    public static int field6978;

    @OriginalMember(owner = "client!wga", name = "j", descriptor = "I")
    public static int field6979;

    @OriginalMember(owner = "client!wga", name = "k", descriptor = "I")
    public static int field6980;

    @OriginalMember(owner = "client!wga", name = "l", descriptor = "I")
    public static int field6981;

    @OriginalMember(owner = "client!wga", name = "m", descriptor = "I")
    public static int field6982;

    @OriginalMember(owner = "client!wga", name = "n", descriptor = "I")
    public static int field6983;

    @OriginalMember(owner = "client!wga", name = "o", descriptor = "I")
    public static int field6984;

    @OriginalMember(owner = "client!wga", name = "p", descriptor = "I")
    public static int field6985;

    @OriginalMember(owner = "client!wga", name = "a", descriptor = "(IIILhf;)V")
    public static final void method2956(int arg0, int arg1, int arg2, class644 arg3) {
        class375 var4 = class211.method1494(arg0, arg1, arg2);
        if (var4 != null) {
            var4.field5422 = arg3;
            int var5 = class95.field1372 == class25.field221 ? 1 : 0;
            if (arg3.method607((byte) 117)) {
                if (arg3.method614((byte) -128)) {
                    class499.field7174[var5][class575.field8273[var5]++] = arg3;
                    return;
                }
                class132.field1818[var5][class355.field5248[var5]++] = arg3;
                class235.field3518 = true;
                return;
            }
            class399.field5714[var5][class145.field1963[var5]++] = arg3;
        }
    }

    @OriginalMember(owner = "client!wga", name = "<init>", descriptor = "(ILgp;)V")
    public class484(int arg0, class549 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!wga", name = "b", descriptor = "(I)Z")
    public final boolean method2957(int arg0) {
        ++field6983;
        if (arg0 != -7558) {
            return true;
        } else {
            return class71.method625(super.field1733.field7975.method3775(false), arg0 + 7558);
        }
    }

    @OriginalMember(owner = "client!wga", name = "a", descriptor = "(B)I")
    public final int method158(byte arg0) {
        ++field6982;
        int var2 = 93 / ((arg0 - -63) / 49);
        return 0;
    }

    @OriginalMember(owner = "client!wga", name = "a", descriptor = "(IIZZI)V")
    public static final void method2958(int arg0, int arg1, boolean arg2, boolean arg3, int arg4) {
        class284.method1817(arg0, arg4, class537.field7803.length + arg1, arg2, 0, (byte) -96, arg3);
        ++field6984;
        class614.field8762 = 0;
        class433.field6212 = null;
    }

    @OriginalMember(owner = "client!wga", name = "a", descriptor = "(ZI)I")
    public final int method155(boolean arg0, int arg1) {
        ++field6979;
        if (!class71.method625(super.field1733.field7975.method3775(false), 0)) {
            return 3;
        } else {
            if (!arg0) {
                this.method157((byte) -117, 37);
            }
            return 1;
        }
    }

    @OriginalMember(owner = "client!wga", name = "a", descriptor = "(BI)V")
    public final void method157(byte arg0, int arg1) {
        ++field6980;
        if (arg0 >= -32) {
            field6981 = 3;
        }
        super.field1732 = arg1;
    }

    @OriginalMember(owner = "client!wga", name = "c", descriptor = "(Z)I")
    public final int method2959(boolean arg0) {
        if (arg0) {
            method2958(-62, 24, false, true, -45);
        }
        ++field6978;
        return super.field1732;
    }

    @OriginalMember(owner = "client!wga", name = "<init>", descriptor = "(Lgp;)V")
    public class484(class549 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!wga", name = "b", descriptor = "(Z)V")
    public final void method156(boolean arg0) {
        ++field6985;
        if (super.field1733.field7975.method3773(37) && !class71.method625(super.field1733.field7975.method3775(!arg0), 0)) {
            super.field1732 = 0;
        }
        if (!arg0) {
            this.method156(false);
        }
        if (super.field1732 < 0 || ~super.field1732 < -2) {
            super.field1732 = this.method158((byte) 35);
        }
    }
}
