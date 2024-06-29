import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bl")
public class class387 extends class392 {

    @OriginalMember(owner = "client!bl", name = "g", descriptor = "Lvb;")
    public static class396 field5410 = new class396(3, -1);

    @OriginalMember(owner = "client!bl", name = "o", descriptor = "Lsv;")
    public static class570 field5418 = new class570(40, 3);

    @OriginalMember(owner = "client!bl", name = "h", descriptor = "I")
    public static int field5411;

    @OriginalMember(owner = "client!bl", name = "i", descriptor = "I")
    public static int field5412;

    @OriginalMember(owner = "client!bl", name = "j", descriptor = "I")
    public static int field5413;

    @OriginalMember(owner = "client!bl", name = "k", descriptor = "I")
    public static int field5414;

    @OriginalMember(owner = "client!bl", name = "l", descriptor = "I")
    public static int field5415;

    @OriginalMember(owner = "client!bl", name = "m", descriptor = "I")
    public static int field5416;

    @OriginalMember(owner = "client!bl", name = "n", descriptor = "I")
    public static int field5417;

    @OriginalMember(owner = "client!bl", name = "p", descriptor = "I")
    public static int field5419;

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "(I)V", line = 3)
    public static void method2329(int arg0) {
        if (arg0 == 1) {
            field5418 = null;
            field5410 = null;
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(Z)I", line = 16)
    public final int method292(boolean arg0) {
        ++field5413;
        if (!arg0) {
            field5418 = null;
        }
        return super.field5454.method3784(21).method4160(2323) < 96 ? 0 : 2;
    }

    @OriginalMember(owner = "client!bl", name = "<init>", descriptor = "(Lw;)V", line = 31)
    public class387(class675 arg0) {
        super(arg0);
        class714.method3971((byte) 98, super.field5452);
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(III)V", line = 40)
    public static final void method2330(int arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            field5418 = null;
        }
        ++field5415;
        class371 var3 = class490.method2867((byte) -48, 19, (long) arg2 | (long) arg0 << 32);
        var3.method2215(4);
    }

    @OriginalMember(owner = "client!bl", name = "c", descriptor = "(I)Z", line = 57)
    public final boolean method2331(int arg0) {
        ++field5417;
        if (super.field5454.method3784(arg0 + 21).method4160(2323) < 96) {
            return false;
        } else {
            if (arg0 != 0) {
                this.method291(false);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(BI)V", line = 71)
    public final void method286(byte arg0, int arg1) {
        ++field5414;
        super.field5452 = arg1;
        int var3 = -16 / ((arg0 - -80) / 38);
        class714.method3971((byte) 98, super.field5452);
    }

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "(Z)V", line = 87)
    public final void method291(boolean arg0) {
        if (super.field5454.method3784(21).method4160(2323) < 96) {
            super.field5452 = 0;
        }
        if (!arg0) {
            ++field5419;
            if (super.field5452 < 0 || ~super.field5452 < -3) {
                super.field5452 = this.method292(true);
            }
        }
    }

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "(II)I", line = 107)
    public final int method290(int arg0, int arg1) {
        ++field5416;
        if (super.field5454.method3784(21).method4160(2323) < 96) {
            return 3;
        } else {
            if (arg1 > -124) {
                field5418 = null;
            }
            return 1;
        }
    }

    @OriginalMember(owner = "client!bl", name = "<init>", descriptor = "(ILw;)V", line = 125)
    public class387(int arg0, class675 arg1) {
        super(arg0, arg1);
        class714.method3971((byte) 98, super.field5452);
    }

    @OriginalMember(owner = "client!bl", name = "d", descriptor = "(I)I", line = 133)
    public final int method2332(int arg0) {
        if (arg0 != 17539) {
            field5410 = null;
        }
        ++field5411;
        return super.field5452;
    }
}
