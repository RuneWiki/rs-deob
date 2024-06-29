import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class286 {

    @OriginalMember(owner = "client!vc", name = "f", descriptor = "I")
    public int field3664 = 128;

    @OriginalMember(owner = "client!vc", name = "k", descriptor = "I")
    public int field3669 = 128;

    @OriginalMember(owner = "client!vc", name = "g", descriptor = "I")
    public int field3665;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "I")
    public int field3659;

    @OriginalMember(owner = "client!vc", name = "l", descriptor = "I")
    public int field3670;

    @OriginalMember(owner = "client!vc", name = "j", descriptor = "I")
    public int field3668;

    @OriginalMember(owner = "client!vc", name = "d", descriptor = "[Lvf;")
    public static class138[] field3662 = new class138[16];

    @OriginalMember(owner = "client!vc", name = "h", descriptor = "Lkfa;")
    public static class549 field3666 = new class549(46, 3);

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "I")
    public static int field3660;

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "I")
    public static int field3661;

    @OriginalMember(owner = "client!vc", name = "e", descriptor = "I")
    public static int field3663;

    @OriginalMember(owner = "client!vc", name = "i", descriptor = "I")
    public static int field3667;

    @OriginalMember(owner = "client!vc", name = "m", descriptor = "[Lxa;")
    public static class458[] field3671;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Z)V")
    public static void method1622(boolean arg0) {
        field3666 = null;
        field3671 = null;
        field3662 = null;
        if (arg0) {
            field3661 = -1;
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(BLvc;)V")
    public final void method1623(byte arg0, class286 arg1) {
        this.field3659 = arg1.field3659;
        this.field3670 = arg1.field3670;
        if (arg0 < 113) {
            this.field3664 = -120;
        }
        this.field3669 = arg1.field3669;
        this.field3668 = arg1.field3668;
        this.field3665 = arg1.field3665;
        field3663++;
        this.field3664 = arg1.field3664;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(B)Lvc;")
    public final class286 method1624(byte arg0) {
        field3660++;
        if (arg0 != -5) {
            this.method1624((byte) -64);
        }
        return new class286(this.field3665, this.field3664, this.field3669, this.field3668, this.field3659, this.field3670);
    }

    @OriginalMember(owner = "client!vc", name = "<init>", descriptor = "(I)V")
    public class286(int arg0) {
        this.field3665 = arg0;
    }

    @OriginalMember(owner = "client!vc", name = "<init>", descriptor = "(IIIIII)V")
    private class286(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field3659 = arg4;
        this.field3669 = arg2;
        this.field3670 = arg5;
        this.field3665 = arg0;
        this.field3664 = arg1;
        this.field3668 = arg3;
    }
}
