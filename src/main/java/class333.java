import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class333 extends class322 {

    @OriginalMember(owner = "client!b", name = "q", descriptor = "Lqfa;")
    public static class98 field4658 = new class98(109, 6);

    @OriginalMember(owner = "client!b", name = "s", descriptor = "Lrb;")
    public static class352 field4660 = new class352("", 16);

    @OriginalMember(owner = "client!b", name = "t", descriptor = "Lqfa;")
    public static class98 field4661 = new class98(84, 4);

    @OriginalMember(owner = "client!b", name = "u", descriptor = "Lgda;")
    public static class53 field4662 = new class53(82, -1);

    @OriginalMember(owner = "client!b", name = "l", descriptor = "I")
    public static int field4653;

    @OriginalMember(owner = "client!b", name = "m", descriptor = "I")
    public static int field4654;

    @OriginalMember(owner = "client!b", name = "n", descriptor = "I")
    public static int field4655;

    @OriginalMember(owner = "client!b", name = "o", descriptor = "I")
    public static int field4656;

    @OriginalMember(owner = "client!b", name = "p", descriptor = "I")
    public static int field4657;

    @OriginalMember(owner = "client!b", name = "r", descriptor = "I")
    public static int field4659;

    @OriginalMember(owner = "client!b", name = "v", descriptor = "Lkr;")
    public static class744 field4663;

    @OriginalMember(owner = "client!b", name = "<init>", descriptor = "(ILch;)V")
    public class333(int arg0, class463 arg1) {
        super(arg1);
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Z)V")
    public final void method23(boolean arg0) {
        if (arg0) {
            this.method19(-36, 118);
        }
        if (~super.field4451 != -2 && ~super.field4451 != -1) {
            super.field4451 = this.method17((byte) 122);
        }
        ++field4654;
    }

    @OriginalMember(owner = "client!b", name = "b", descriptor = "(Z)I")
    public final int method2177(boolean arg0) {
        if (arg0) {
            field4660 = null;
        }
        ++field4653;
        return super.field4451;
    }

    @OriginalMember(owner = "client!b", name = "b", descriptor = "(II)V")
    public final void method22(int arg0, int arg1) {
        ++field4656;
        super.field4451 = arg1;
        if (arg0 != 0) {
            this.method19(119, 110);
        }
    }

    @OriginalMember(owner = "client!b", name = "b", descriptor = "(B)V")
    public static void method2178(byte arg0) {
        field4660 = null;
        field4663 = null;
        field4658 = null;
        field4662 = null;
        if (arg0 > 89) {
            field4661 = null;
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IB)Z")
    public static final boolean method2179(int arg0, byte arg1) {
        ++field4657;
        int var2 = -79 / ((71 - arg1) / 55);
        return ~arg0 == -4 || arg0 == 4 || ~arg0 == -6 || arg0 == 6;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(II)I")
    public final int method19(int arg0, int arg1) {
        if (arg1 < 10) {
            field4661 = null;
        }
        ++field4659;
        return 1;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(B)I")
    public final int method17(byte arg0) {
        ++field4655;
        int var2 = -73 / ((70 - arg0) / 51);
        return 1;
    }

    @OriginalMember(owner = "client!b", name = "<init>", descriptor = "(Lch;)V")
    public class333(class463 arg0) {
        super(arg0);
    }
}
