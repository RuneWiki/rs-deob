import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wt")
public class class311 extends class305 {

    @OriginalMember(owner = "client!wt", name = "i", descriptor = "I")
    public static int field4396;

    @OriginalMember(owner = "client!wt", name = "j", descriptor = "I")
    public static int field4397;

    @OriginalMember(owner = "client!wt", name = "k", descriptor = "I")
    public static int field4398;

    @OriginalMember(owner = "client!wt", name = "l", descriptor = "I")
    public static int field4399;

    @OriginalMember(owner = "client!wt", name = "m", descriptor = "I")
    public static int field4400;

    @OriginalMember(owner = "client!wt", name = "n", descriptor = "Lgu;")
    public static class582 field4401;

    @OriginalMember(owner = "client!wt", name = "b", descriptor = "(I)V", line = 4)
    public static void method1965(int arg0) {
        int var1 = 108 / ((arg0 - 13) / 56);
        field4401 = null;
    }

    @OriginalMember(owner = "client!wt", name = "e", descriptor = "(II)I", line = 13)
    public static final int method1966(int arg0, int arg1) {
        return class21.field225 != null ? class21.field225[arg0][arg1] & 65535 : 0;
    }

    @OriginalMember(owner = "client!wt", name = "b", descriptor = "(B)V", line = 17)
    public final void method308(byte arg0) {
        ++field4399;
        if (arg0 > -40) {
            field4401 = null;
        }
        if (~super.field4320 > -1 || ~super.field4320 < -5) {
            super.field4320 = this.method305((byte) 68);
        }
    }

    @OriginalMember(owner = "client!wt", name = "c", descriptor = "(I)I", line = 31)
    public final int method1967(int arg0) {
        ++field4400;
        if (arg0 != 17503) {
            field4401 = null;
        }
        return super.field4320;
    }

    @OriginalMember(owner = "client!wt", name = "<init>", descriptor = "(Lhb;)V", line = 44)
    public class311(class728 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!wt", name = "c", descriptor = "(II)I", line = 47)
    public final int method306(int arg0, int arg1) {
        if (arg0 != 31401) {
            this.method305((byte) -95);
        }
        ++field4397;
        return 1;
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(B)I", line = 60)
    public final int method305(byte arg0) {
        ++field4396;
        return arg0 != 68 ? -98 : 3;
    }

    @OriginalMember(owner = "client!wt", name = "<init>", descriptor = "(ILhb;)V", line = 75)
    public class311(int arg0, class728 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!wt", name = "b", descriptor = "(II)V", line = 79)
    public final void method303(int arg0, int arg1) {
        super.field4320 = arg1;
        if (arg0 != -27751) {
            this.method306(76, -57);
        }
        ++field4398;
    }
}
