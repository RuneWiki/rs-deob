import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class146 extends class140 {

    @OriginalMember(owner = "client!vc", name = "Vb", descriptor = "[[B")
    public static byte[][] field3434 = new byte[50][];

    @OriginalMember(owner = "client!vc", name = "Yb", descriptor = "[I")
    public static int[] field3437 = new int[500];

    @OriginalMember(owner = "client!vc", name = "gc", descriptor = "Lja;")
    private static class62 field3445 = class30.method243(43, "Invalid username or password)3");

    @OriginalMember(owner = "client!vc", name = "jc", descriptor = "Lja;")
    public static class62 field3448 = class30.method243(43, "rect_debug=");

    @OriginalMember(owner = "client!vc", name = "fc", descriptor = "I")
    public static int field3444 = 0;

    @OriginalMember(owner = "client!vc", name = "ic", descriptor = "Lja;")
    public static class62 field3447 = field3445;

    @OriginalMember(owner = "client!vc", name = "Xb", descriptor = "I")
    public static int field3436 = 0;

    @OriginalMember(owner = "client!vc", name = "Wb", descriptor = "I")
    public static int field3435;

    @OriginalMember(owner = "client!vc", name = "ac", descriptor = "I")
    public static int field3439;

    @OriginalMember(owner = "client!vc", name = "bc", descriptor = "I")
    public static int field3440;

    @OriginalMember(owner = "client!vc", name = "cc", descriptor = "I")
    public int field3441;

    @OriginalMember(owner = "client!vc", name = "ec", descriptor = "I")
    public static int field3443;

    @OriginalMember(owner = "client!vc", name = "hc", descriptor = "I")
    public int field3446;

    @OriginalMember(owner = "client!vc", name = "lc", descriptor = "I")
    public static int field3450;

    @OriginalMember(owner = "client!vc", name = "mc", descriptor = "I")
    public static int field3451;

    @OriginalMember(owner = "client!vc", name = "Zb", descriptor = "Ls;")
    public static class128 field3438;

    @OriginalMember(owner = "client!vc", name = "kc", descriptor = "Lea;")
    public static class29 field3449;

    @OriginalMember(owner = "client!vc", name = "dc", descriptor = "[I")
    public static int[] field3442;

    @OriginalMember(owner = "client!vc", name = "nc", descriptor = "[Lq;")
    public static class114[] field3452;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lpd;Lpd;B)I")
    public static final int method1164(class108 arg0, class108 arg1, byte arg2) {
        if (arg2 != 56) {
            return 105;
        }
        field3443++;
        int var3 = 0;
        if (arg0.method879((byte) -20, class7.field211, class116.field2670)) {
            var3++;
        }
        if (arg1.method879((byte) -20, class7.field211, class70.field1781)) {
            var3++;
        }
        if (arg1.method879((byte) -20, class7.field211, class143.field3341)) {
            var3++;
        }
        if (arg1.method879((byte) -20, class7.field211, class132.field3029)) {
            var3++;
        }
        if (arg1.method879((byte) -20, class7.field211, class67.field1675)) {
            var3++;
        }
        if (arg1.method879((byte) -20, class7.field211, class149.field3511)) {
            var3++;
        }
        arg1.method879((byte) -20, class7.field211, class12.field292);
        arg1.method879((byte) -20, class7.field211, class38.field886);
        arg1.method879((byte) -20, class7.field211, class151.field3541);
        arg1.method879((byte) -20, class7.field211, class15.field364);
        arg1.method879((byte) -20, class7.field211, class96.field2248);
        return var3;
    }

    @OriginalMember(owner = "client!vc", name = "e", descriptor = "(I)V")
    public static void method1165(int arg0) {
        field3437 = null;
        field3448 = null;
        field3442 = null;
        field3445 = null;
        field3438 = null;
        field3449 = null;
        if (arg0 != 0) {
            field3449 = null;
        }
        field3452 = null;
        field3434 = null;
        field3447 = null;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lfe;ILjava/lang/Object;)V")
    public static final void method1166(class41 arg0, int arg1, Object arg2) {
        if (arg1 != 1) {
            field3434 = null;
        }
        field3451++;
        if (arg0.field946 == null) {
            return;
        }
        for (int var3 = 0; var3 < 50 && arg0.field946.peekEvent() != null; var3++) {
            method1168(-19127, 1L);
        }
        if (arg2 != null) {
            arg0.field946.postEvent(new ActionEvent(arg2, 1001, "dummy"));
        }
    }

    @OriginalMember(owner = "client!vc", name = "f", descriptor = "(B)Lvb;")
    public final class145 method321(byte arg0) {
        field3440++;
        if (arg0 != 3) {
            field3438 = null;
        }
        return class140.method1114(this.field3441, false).method187(this.field3446, (byte) -5);
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIZ)Z")
    public static final boolean method1167(int arg0, int arg1, boolean arg2) {
        if (!arg2) {
            method1167(-79, 123, false);
        }
        field3439++;
        return (arg1 >> arg0 + 1 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IJ)V")
    public static final void method1168(int arg0, long arg1) {
        if (arg0 != -19127) {
            return;
        }
        field3450++;
        if (arg1 <= 0L) {
            return;
        }
        if (arg1 % 10L == 0L) {
            class133.method1067(2, arg1 - 1L);
            class133.method1067(arg0 + 19129, 1L);
        } else {
            class133.method1067(arg0 ^ 0xFFFFB54B, arg1);
        }
    }
}
