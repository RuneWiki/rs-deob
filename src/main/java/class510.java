import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mn")
public class class510 extends class95 implements class749 {

    @OriginalMember(owner = "client!mn", name = "e", descriptor = "I")
    private int field7396;

    @OriginalMember(owner = "client!mn", name = "j", descriptor = "I")
    public static int field7401 = 0;

    @OriginalMember(owner = "client!mn", name = "i", descriptor = "I")
    public static int field7400 = 0;

    @OriginalMember(owner = "client!mn", name = "l", descriptor = "I")
    public static int field7403 = -1;

    @OriginalMember(owner = "client!mn", name = "c", descriptor = "I")
    public static int field7394;

    @OriginalMember(owner = "client!mn", name = "d", descriptor = "I")
    public static int field7395;

    @OriginalMember(owner = "client!mn", name = "g", descriptor = "I")
    public static int field7398;

    @OriginalMember(owner = "client!mn", name = "h", descriptor = "I")
    public static int field7399;

    @OriginalMember(owner = "client!mn", name = "k", descriptor = "I")
    public static int field7402;

    @OriginalMember(owner = "client!mn", name = "m", descriptor = "I")
    public static int field7404;

    @OriginalMember(owner = "client!mn", name = "f", descriptor = "[I")
    public static int[] field7397;

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(Z)J", line = 3)
    public final long method1405(boolean arg0) {
        if (!arg0) {
            this.method1408(-45);
        }
        ++field7404;
        return super.field1415.getAddress();
    }

    @OriginalMember(owner = "client!mn", name = "b", descriptor = "(Z)V", line = 19)
    public static void method3064(boolean arg0) {
        if (arg0) {
            field7397 = null;
        }
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(I)I", line = 33)
    public final int method1408(int arg0) {
        int var2 = -46 / ((arg0 - 23) / 33);
        ++field7394;
        return this.field7396;
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "([BIIZ)V", line = 43)
    public final void method1409(byte[] arg0, int arg1, int arg2, boolean arg3) {
        ++field7399;
        this.method788(arg0, arg1);
        if (!arg3) {
            field7397 = null;
        }
        this.field7396 = arg2;
    }

    @OriginalMember(owner = "client!mn", name = "b", descriptor = "(I)I", line = 55)
    public final int method1410(int arg0) {
        if (arg0 != 27076) {
            this.method1408(-66);
        }
        ++field7402;
        return 0;
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(B)V", line = 68)
    public static final void method3065(byte arg0) {
        ++field7398;
        if (arg0 > -26) {
            method3064(false);
        }
        class82.field1185 = new class208(class641.field8997.method3621(91, class467.field6804), "", class618.field8708, 1010, -1, 0L, 0, 0, true, false, 0L, true);
    }

    @OriginalMember(owner = "client!mn", name = "<init>", descriptor = "(Lrs;I[BI)V", line = 87)
    public class510(class166 arg0, int arg1, byte[] arg2, int arg3) {
        super(arg0, arg2, arg3);
        this.field7396 = arg1;
    }
}
