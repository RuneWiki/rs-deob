import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gn")
public class class700 extends class322 {

    @OriginalMember(owner = "client!gn", name = "q", descriptor = "I")
    public static int field9768 = 104;

    @OriginalMember(owner = "client!gn", name = "l", descriptor = "I")
    public static int field9763;

    @OriginalMember(owner = "client!gn", name = "m", descriptor = "I")
    public static int field9764;

    @OriginalMember(owner = "client!gn", name = "n", descriptor = "I")
    public static int field9765;

    @OriginalMember(owner = "client!gn", name = "o", descriptor = "I")
    public static int field9766;

    @OriginalMember(owner = "client!gn", name = "p", descriptor = "I")
    public static int field9767;

    @OriginalMember(owner = "client!gn", name = "r", descriptor = "I")
    public static int field9769;

    @OriginalMember(owner = "client!gn", name = "s", descriptor = "I")
    public static int field9770;

    @OriginalMember(owner = "client!gn", name = "t", descriptor = "I")
    public static int field9771;

    @OriginalMember(owner = "client!gn", name = "u", descriptor = "I")
    public static int field9772;

    @OriginalMember(owner = "client!gn", name = "<init>", descriptor = "(Lch;)V", line = 7)
    public class700(class463 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!gn", name = "b", descriptor = "(II)V", line = 10)
    public final void method22(int arg0, int arg1) {
        ++field9764;
        super.field4451 = arg1;
        if (arg0 != 0) {
            field9766 = -35;
        }
    }

    @OriginalMember(owner = "client!gn", name = "b", descriptor = "(Z)I", line = 21)
    public final int method3946(boolean arg0) {
        if (arg0) {
            field9768 = 62;
        }
        ++field9767;
        return super.field4451;
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(B)I", line = 32)
    public final int method17(byte arg0) {
        ++field9763;
        int var2 = -98 / ((arg0 - 70) / 51);
        return 0;
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(II)I", line = 45)
    public final int method19(int arg0, int arg1) {
        ++field9770;
        return arg1 <= 10 ? 53 : 1;
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(Z)V", line = 56)
    public final void method23(boolean arg0) {
        if (~super.field4451 != -2 && ~super.field4451 != -1) {
            super.field4451 = this.method17((byte) 123);
        }
        if (!arg0) {
            ++field9772;
        }
    }

    @OriginalMember(owner = "client!gn", name = "c", descriptor = "(I)Luda;", line = 75)
    public static final class451 method3947(int arg0) {
        ++field9769;
        try {
            if (arg0 != 104) {
                field9768 = 14;
            }
            return (class451) Class.forName("pg").newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!gn", name = "<init>", descriptor = "(ILch;)V", line = 92)
    public class700(int arg0, class463 arg1) {
        super(arg0, arg1);
    }
}
