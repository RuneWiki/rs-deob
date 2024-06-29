import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uw")
public class class416 extends class322 {

    @OriginalMember(owner = "client!uw", name = "p", descriptor = "Z")
    public boolean field5862 = false;

    @OriginalMember(owner = "client!uw", name = "l", descriptor = "Z")
    private boolean field5858 = true;

    @OriginalMember(owner = "client!uw", name = "w", descriptor = "Z")
    public static boolean field5869 = true;

    @OriginalMember(owner = "client!uw", name = "m", descriptor = "I")
    public static int field5859;

    @OriginalMember(owner = "client!uw", name = "n", descriptor = "I")
    public static int field5860;

    @OriginalMember(owner = "client!uw", name = "o", descriptor = "I")
    public static int field5861;

    @OriginalMember(owner = "client!uw", name = "q", descriptor = "I")
    public static int field5863;

    @OriginalMember(owner = "client!uw", name = "r", descriptor = "I")
    public static int field5864;

    @OriginalMember(owner = "client!uw", name = "s", descriptor = "I")
    public static int field5865;

    @OriginalMember(owner = "client!uw", name = "t", descriptor = "I")
    public static int field5866;

    @OriginalMember(owner = "client!uw", name = "u", descriptor = "I")
    public static int field5867;

    @OriginalMember(owner = "client!uw", name = "v", descriptor = "I")
    public static int field5868;

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(Z)V")
    public final void method23(boolean arg0) {
        if (!super.field4450.method2753(!arg0).method1129((byte) -19)) {
            super.field4451 = 0;
        }
        ++field5867;
        if (~super.field4451 > -1 || ~super.field4451 < -6) {
            super.field4451 = this.method17((byte) 5);
        }
        if (arg0) {
            this.method2558(-57);
        }
    }

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(IZ)Z")
    public static final boolean method2555(int arg0, boolean arg1) {
        ++field5863;
        if (arg1) {
            field5869 = false;
        }
        return ~arg0 == -2 || arg0 == 3 || arg0 == 5;
    }

    @OriginalMember(owner = "client!uw", name = "<init>", descriptor = "(ILch;)V")
    public class416(int arg0, class463 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!uw", name = "b", descriptor = "(Z)I")
    public final int method2556(boolean arg0) {
        ++field5865;
        if (arg0) {
            this.field5858 = true;
        }
        return super.field4451;
    }

    @OriginalMember(owner = "client!uw", name = "b", descriptor = "(B)Z")
    public final boolean method2557(byte arg0) {
        ++field5861;
        if (!super.field4450.method2753(true).method1129((byte) -19)) {
            return false;
        } else {
            return arg0 != -53 ? true : true;
        }
    }

    @OriginalMember(owner = "client!uw", name = "c", descriptor = "(I)Z")
    public final boolean method2558(int arg0) {
        if (arg0 != 5) {
            this.field5858 = false;
        }
        ++field5860;
        return this.field5858;
    }

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(II)I")
    public final int method19(int arg0, int arg1) {
        ++field5868;
        if (!super.field4450.method2753(true).method1129((byte) -19)) {
            return 3;
        } else if (arg0 == 3 && !class439.method2653("jagdx", -26)) {
            return 3;
        } else {
            return arg1 <= 10 ? 58 : 2;
        }
    }

    @OriginalMember(owner = "client!uw", name = "<init>", descriptor = "(Lch;)V")
    public class416(class463 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(ZZ)V")
    public final void method2559(boolean arg0, boolean arg1) {
        this.field5858 = arg1;
        ++field5859;
        if (arg0) {
            this.method2558(-100);
        }
    }

    @OriginalMember(owner = "client!uw", name = "b", descriptor = "(II)V")
    public final void method22(int arg0, int arg1) {
        if (arg0 != 0) {
            this.field5858 = false;
        }
        super.field4451 = arg1;
        ++field5864;
        this.field5862 = false;
    }

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(B)I")
    public final int method17(byte arg0) {
        ++field5866;
        this.field5862 = true;
        int var2 = 78 % ((arg0 - 70) / 51);
        return !super.field4450.method2753(true).method1129((byte) -19) ? 0 : 2;
    }
}
