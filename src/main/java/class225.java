import java.awt.Canvas;
import java.awt.event.FocusListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class225 extends Canvas implements FocusListener {

    @OriginalMember(owner = "client!jb", name = "d", descriptor = "Lok;")
    public static class41 field3597 = class137.method956("blinken3:", 45);

    @OriginalMember(owner = "client!jb", name = "e", descriptor = "Z")
    public static boolean field3598 = false;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "Lok;")
    public static class41 field3594 = class137.method956("Clientscript error in: ", 45);

    @OriginalMember(owner = "client!jb", name = "f", descriptor = "Lok;")
    public static class41 field3599 = class137.method956(" <col=00ff80>", 45);

    @OriginalMember(owner = "client!jb", name = "n", descriptor = "I")
    public static int field3607 = 0;

    @OriginalMember(owner = "client!jb", name = "m", descriptor = "I")
    public static int field3606 = 127;

    @OriginalMember(owner = "client!jb", name = "o", descriptor = "[I")
    public static int[] field3608 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "I")
    public static int field3595;

    @OriginalMember(owner = "client!jb", name = "g", descriptor = "I")
    public static int field3600;

    @OriginalMember(owner = "client!jb", name = "h", descriptor = "I")
    public static int field3601;

    @OriginalMember(owner = "client!jb", name = "i", descriptor = "I")
    public static int field3602;

    @OriginalMember(owner = "client!jb", name = "j", descriptor = "I")
    public static int field3603;

    @OriginalMember(owner = "client!jb", name = "l", descriptor = "I")
    public static int field3605;

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "Lug;")
    public static class200 field3596;

    @OriginalMember(owner = "client!jb", name = "k", descriptor = "Lmh;")
    public static class65 field3604;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIIIIII)V", line = 43)
    public static final void method1617(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class234 var7 = new class234();
        var7.field3752 = arg1 / 128;
        var7.field3740 = arg2 / 128;
        var7.field3741 = arg3 / 128;
        var7.field3728 = arg4 / 128;
        var7.field3758 = arg0;
        var7.field3753 = arg1;
        var7.field3743 = arg2;
        var7.field3726 = arg3;
        var7.field3757 = arg4;
        var7.field3751 = arg5;
        var7.field3735 = arg6;
        class62.field920[class236.field3793++] = var7;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(B)V", line = 65)
    public static void method1618(byte arg0) {
        field3594 = null;
        field3608 = null;
        field3597 = null;
        field3604 = null;
        field3599 = null;
        if (arg0 > -23) {
            field3604 = (class65) null;
        }
        field3596 = null;
    }
}
