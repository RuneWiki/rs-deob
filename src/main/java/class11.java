import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!daa")
public class class11 extends class322 {

    @OriginalMember(owner = "client!daa", name = "l", descriptor = "Las;")
    public static class151 field239 = new class151(15, 0, 1, 0);

    @OriginalMember(owner = "client!daa", name = "m", descriptor = "I")
    public static int field240;

    @OriginalMember(owner = "client!daa", name = "n", descriptor = "I")
    public static int field241;

    @OriginalMember(owner = "client!daa", name = "o", descriptor = "I")
    public static int field242;

    @OriginalMember(owner = "client!daa", name = "p", descriptor = "I")
    public static int field243;

    @OriginalMember(owner = "client!daa", name = "q", descriptor = "I")
    public static int field244;

    @OriginalMember(owner = "client!daa", name = "r", descriptor = "I")
    public static int field245;

    @OriginalMember(owner = "client!daa", name = "b", descriptor = "(Z)I")
    public final int method77(boolean arg0) {
        if (arg0) {
            return 126;
        } else {
            ++field242;
            return super.field4451;
        }
    }

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(II)I")
    public final int method19(int arg0, int arg1) {
        ++field244;
        if (arg1 <= 10) {
            field239 = null;
        }
        if (super.field4450.method2751(-18373)) {
            return 3;
        } else {
            return arg0 != 0 && super.field4450.field6546.method1308(false) != 1 ? 2 : 1;
        }
    }

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(Z)V")
    public final void method23(boolean arg0) {
        if (super.field4450.method2751(-18373)) {
            super.field4451 = 0;
        }
        ++field240;
        if (super.field4451 < 0 && super.field4451 > 2) {
            super.field4451 = this.method17((byte) 15);
        }
        if (arg0) {
            this.method77(true);
        }
    }

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(B)I")
    public final int method17(byte arg0) {
        int var2 = -60 % ((arg0 - 70) / 51);
        ++field243;
        return 1;
    }

    @OriginalMember(owner = "client!daa", name = "b", descriptor = "(B)Z")
    public final boolean method78(byte arg0) {
        ++field245;
        if (super.field4450.method2751(arg0 ^ 18416)) {
            return false;
        } else {
            if (arg0 != -53) {
                this.method77(false);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!daa", name = "c", descriptor = "(I)V")
    public static void method79(int arg0) {
        if (arg0 != 12275) {
            field239 = null;
        }
        field239 = null;
    }

    @OriginalMember(owner = "client!daa", name = "b", descriptor = "(II)V")
    public final void method22(int arg0, int arg1) {
        if (arg0 != 0) {
            field239 = null;
        }
        super.field4451 = arg1;
        ++field241;
    }

    @OriginalMember(owner = "client!daa", name = "<init>", descriptor = "(ILch;)V")
    public class11(int arg0, class463 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!daa", name = "<init>", descriptor = "(Lch;)V")
    public class11(class463 arg0) {
        super(arg0);
    }
}
