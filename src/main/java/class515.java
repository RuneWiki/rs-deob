import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cn")
public class class515 extends class322 {

    @OriginalMember(owner = "client!cn", name = "l", descriptor = "Ljb;")
    public static class493 field7339 = null;

    @OriginalMember(owner = "client!cn", name = "o", descriptor = "I")
    public static int field7342 = -1;

    @OriginalMember(owner = "client!cn", name = "u", descriptor = "[[I")
    public static int[][] field7348 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 4 }, { 6, 0, 2 }, { 2, 6, 0 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 2, 4, 4 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 2, 2 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 4, 6, 6 }, { 0, 2, 4, 6 } };

    @OriginalMember(owner = "client!cn", name = "m", descriptor = "I")
    public static int field7340;

    @OriginalMember(owner = "client!cn", name = "n", descriptor = "I")
    public static int field7341;

    @OriginalMember(owner = "client!cn", name = "p", descriptor = "I")
    public static int field7343;

    @OriginalMember(owner = "client!cn", name = "q", descriptor = "I")
    public static int field7344;

    @OriginalMember(owner = "client!cn", name = "s", descriptor = "I")
    public static int field7346;

    @OriginalMember(owner = "client!cn", name = "t", descriptor = "I")
    public static int field7347;

    @OriginalMember(owner = "client!cn", name = "r", descriptor = "Lwr;")
    public static class457 field7345;

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(II)I", line = 3)
    public final int method19(int arg0, int arg1) {
        if (arg1 <= 10) {
            method3031(false);
        }
        ++field7344;
        return 1;
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(Z)V", line = 17)
    public final void method23(boolean arg0) {
        if (~super.field4451 > -1 && super.field4451 > 127) {
            super.field4451 = this.method17((byte) -95);
        }
        ++field7346;
        if (arg0) {
            field7348 = null;
        }
    }

    @OriginalMember(owner = "client!cn", name = "<init>", descriptor = "(Lch;)V", line = 38)
    public class515(class463 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(B)I", line = 41)
    public final int method17(byte arg0) {
        ++field7347;
        int var2 = -56 % ((70 - arg0) / 51);
        return 127;
    }

    @OriginalMember(owner = "client!cn", name = "b", descriptor = "(II)V", line = 51)
    public final void method22(int arg0, int arg1) {
        if (arg0 == 0) {
            super.field4451 = arg1;
            ++field7341;
        }
    }

    @OriginalMember(owner = "client!cn", name = "b", descriptor = "(Z)I", line = 63)
    public final int method3029(boolean arg0) {
        ++field7340;
        if (arg0) {
            field7348 = null;
        }
        return super.field4451;
    }

    @OriginalMember(owner = "client!cn", name = "<init>", descriptor = "(ILch;)V", line = 74)
    public class515(int arg0, class463 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!cn", name = "c", descriptor = "(II)V", line = 77)
    public static final void method3030(int arg0, int arg1) {
        class8.field115 = arg1;
        if (arg0 != -247) {
            method3030(-31, -63);
        }
        ++field7343;
        class347.field4909.method4023((byte) 69);
    }

    @OriginalMember(owner = "client!cn", name = "c", descriptor = "(Z)V", line = 95)
    public static void method3031(boolean arg0) {
        field7348 = null;
        field7339 = null;
        if (!arg0) {
            method3031(false);
        }
        field7345 = null;
    }
}
