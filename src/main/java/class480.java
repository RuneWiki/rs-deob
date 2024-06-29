import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public class class480 extends class204 {

    @OriginalMember(owner = "client!sg", name = "h", descriptor = "I")
    public static int field6649 = 0;

    @OriginalMember(owner = "client!sg", name = "i", descriptor = "I")
    public static int field6650;

    @OriginalMember(owner = "client!sg", name = "j", descriptor = "I")
    public static int field6651;

    @OriginalMember(owner = "client!sg", name = "k", descriptor = "I")
    public static int field6652;

    @OriginalMember(owner = "client!sg", name = "l", descriptor = "I")
    public static int field6653;

    @OriginalMember(owner = "client!sg", name = "m", descriptor = "I")
    public static int field6654;

    @OriginalMember(owner = "client!sg", name = "n", descriptor = "I")
    public static int field6655;

    @OriginalMember(owner = "client!sg", name = "p", descriptor = "I")
    public static int field6657;

    @OriginalMember(owner = "client!sg", name = "q", descriptor = "I")
    public static int field6658;

    @OriginalMember(owner = "client!sg", name = "o", descriptor = "Ldl;")
    public static class77 field6656;

    @OriginalMember(owner = "client!sg", name = "<init>", descriptor = "(Lfs;)V", line = 3)
    public class480(class607 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "(I)V", line = 6)
    public static final void method2854(int arg0) {
        if (arg0 <= 82) {
            field6656 = null;
        }
        class493.field6796.method621(-124);
        ++field6653;
        class574.field8079 = null;
        class20.field171 = 1;
        class164.field2097 = null;
    }

    @OriginalMember(owner = "client!sg", name = "<init>", descriptor = "(ILfs;)V", line = 26)
    public class480(int arg0, class607 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(Lha;I)V", line = 29)
    public static final void method2855(class473 arg0, int arg1) {
        ++field6650;
        if (class306.field4440 != class724.field10031.field3467) {
            if (arg1 != -1) {
                field6656 = null;
            }
            if (class59.field688 != null) {
                if (class95.method684((byte) 112, arg0, class724.field10031.field3467)) {
                    class306.field4440 = class724.field10031.field3467;
                }
            }
        }
    }

    @OriginalMember(owner = "client!sg", name = "d", descriptor = "(II)V", line = 49)
    public final void method488(int arg0, int arg1) {
        ++field6658;
        super.field2852 = arg0;
        if (arg1 >= -105) {
            this.method487(-78, 3);
        }
    }

    @OriginalMember(owner = "client!sg", name = "d", descriptor = "(I)V", line = 62)
    public static void method2856(int arg0) {
        field6656 = null;
        if (arg0 != -991) {
            field6649 = 19;
        }
    }

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "(B)I", line = 74)
    public final int method2857(byte arg0) {
        if (arg0 != -98) {
            return -55;
        } else {
            ++field6655;
            return super.field2852;
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(B)I", line = 90)
    public final int method490(byte arg0) {
        if (arg0 < 83) {
            field6649 = -108;
        }
        ++field6652;
        return 1;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(II)I", line = 104)
    public final int method487(int arg0, int arg1) {
        int var3 = 88 % ((arg1 - -57) / 60);
        ++field6651;
        return 1;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(I)V", line = 114)
    public final void method486(int arg0) {
        if (arg0 != -4591) {
            this.method2857((byte) 64);
        }
        ++field6654;
        if (super.field2852 != 1 && ~super.field2852 != -1) {
            super.field2852 = this.method490((byte) 116);
        }
    }
}
