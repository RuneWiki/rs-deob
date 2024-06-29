import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class258 extends class322 {

    @OriginalMember(owner = "client!fc", name = "l", descriptor = "I")
    public static int field3725;

    @OriginalMember(owner = "client!fc", name = "m", descriptor = "I")
    public static int field3726;

    @OriginalMember(owner = "client!fc", name = "n", descriptor = "I")
    public static int field3727;

    @OriginalMember(owner = "client!fc", name = "o", descriptor = "I")
    public static int field3728;

    @OriginalMember(owner = "client!fc", name = "p", descriptor = "I")
    public static int field3729;

    @OriginalMember(owner = "client!fc", name = "q", descriptor = "I")
    public static int field3730;

    @OriginalMember(owner = "client!fc", name = "r", descriptor = "I")
    public static int field3731;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(B)I")
    public final int method17(byte arg0) {
        ++field3725;
        int var2 = 46 / ((arg0 - 70) / 51);
        return 3;
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(Z)I")
    public final int method1695(boolean arg0) {
        ++field3726;
        if (arg0) {
            this.method19(-10, 80);
        }
        return super.field4451;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(III)Lsl;")
    public static final class458 method1696(int arg0, int arg1, int arg2) {
        class165 var3 = class553.field7776[arg0][arg1][arg2];
        return var3 == null ? null : var3.field2267;
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(II)V")
    public final void method22(int arg0, int arg1) {
        super.field4451 = arg1;
        if (arg0 != 0) {
            field3728 = 89;
        }
        ++field3730;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Z)V")
    public final void method23(boolean arg0) {
        if (super.field4451 < 0 || ~super.field4451 < -5) {
            super.field4451 = this.method17((byte) 6);
        }
        ++field3731;
        if (arg0) {
            field3729 = -114;
        }
    }

    @OriginalMember(owner = "client!fc", name = "<init>", descriptor = "(Lch;)V")
    public class258(class463 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(II)I")
    public final int method19(int arg0, int arg1) {
        ++field3727;
        if (arg1 <= 10) {
            field3729 = 78;
        }
        return 1;
    }

    @OriginalMember(owner = "client!fc", name = "<init>", descriptor = "(ILch;)V")
    public class258(int arg0, class463 arg1) {
        super(arg0, arg1);
    }
}
