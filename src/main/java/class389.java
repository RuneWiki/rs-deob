import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ju")
public class class389 extends class392 {

    @OriginalMember(owner = "client!ju", name = "p", descriptor = "Z")
    private boolean field5434 = true;

    @OriginalMember(owner = "client!ju", name = "m", descriptor = "Z")
    public boolean field5431 = false;

    @OriginalMember(owner = "client!ju", name = "l", descriptor = "[I")
    public static int[] field5430 = new int[] { 28, 35, 40, 44 };

    @OriginalMember(owner = "client!ju", name = "o", descriptor = "Lin;")
    public static class380 field5433 = new class380(65, -1);

    @OriginalMember(owner = "client!ju", name = "g", descriptor = "I")
    public static int field5425;

    @OriginalMember(owner = "client!ju", name = "h", descriptor = "I")
    public static int field5426;

    @OriginalMember(owner = "client!ju", name = "i", descriptor = "I")
    public static int field5427;

    @OriginalMember(owner = "client!ju", name = "j", descriptor = "I")
    public static int field5428;

    @OriginalMember(owner = "client!ju", name = "k", descriptor = "I")
    public static int field5429;

    @OriginalMember(owner = "client!ju", name = "n", descriptor = "I")
    public static int field5432;

    @OriginalMember(owner = "client!ju", name = "q", descriptor = "I")
    public static int field5435;

    @OriginalMember(owner = "client!ju", name = "r", descriptor = "I")
    public static int field5436;

    @OriginalMember(owner = "client!ju", name = "s", descriptor = "I")
    public static int field5437;

    @OriginalMember(owner = "client!ju", name = "t", descriptor = "I")
    public static int field5438;

    @OriginalMember(owner = "client!ju", name = "u", descriptor = "I")
    public static int field5439;

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(IZ)V")
    public final void method2336(int arg0, boolean arg1) {
        if (arg0 != 0) {
            this.field5431 = true;
        }
        this.field5434 = arg1;
        ++field5435;
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(B)Z")
    public final boolean method2337(byte arg0) {
        ++field5432;
        if (arg0 != 82) {
            field5438 = 111;
        }
        return this.field5434;
    }

    @OriginalMember(owner = "client!ju", name = "b", descriptor = "(II)I")
    public final int method290(int arg0, int arg1) {
        ++field5437;
        if (arg1 >= -124) {
            return -32;
        } else if (!super.field5454.method3784(21).method4158(true)) {
            return 3;
        } else {
            return ~arg0 == -4 && !class41.method302(true, "jagdx") ? 3 : 2;
        }
    }

    @OriginalMember(owner = "client!ju", name = "b", descriptor = "(I)I")
    public final int method2338(int arg0) {
        ++field5426;
        if (arg0 != 17539) {
            field5439 = 40;
        }
        return super.field5452;
    }

    @OriginalMember(owner = "client!ju", name = "b", descriptor = "(Z)V")
    public final void method291(boolean arg0) {
        if (!super.field5454.method3784(21).method4158(!arg0)) {
            super.field5452 = 0;
        }
        ++field5425;
        if (super.field5452 < 0 || ~super.field5452 < -6) {
            super.field5452 = this.method292(true);
        }
        if (arg0) {
            this.method2337((byte) -43);
        }
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(Ljava/lang/String;Z)I")
    public static final int method2339(String arg0, boolean arg1) {
        if (!arg1) {
            field5438 = 99;
        }
        ++field5436;
        return arg0.length() - -1;
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(BI)V")
    public final void method286(byte arg0, int arg1) {
        this.field5431 = false;
        int var3 = -67 / ((-80 - arg0) / 38);
        ++field5428;
        super.field5452 = arg1;
    }

    @OriginalMember(owner = "client!ju", name = "<init>", descriptor = "(ILw;)V")
    public class389(int arg0, class675 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(Z)I")
    public final int method292(boolean arg0) {
        ++field5427;
        this.field5431 = arg0;
        return !super.field5454.method3784(21).method4158(arg0) ? 0 : 2;
    }

    @OriginalMember(owner = "client!ju", name = "<init>", descriptor = "(Lw;)V")
    public class389(class675 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ju", name = "c", descriptor = "(I)Z")
    public final boolean method2340(int arg0) {
        ++field5429;
        if (arg0 != 0) {
            return false;
        } else {
            return super.field5454.method3784(21).method4158(true);
        }
    }

    @OriginalMember(owner = "client!ju", name = "d", descriptor = "(I)V")
    public static void method2341(int arg0) {
        if (arg0 != 28) {
            field5433 = null;
        }
        field5433 = null;
        field5430 = null;
    }
}
