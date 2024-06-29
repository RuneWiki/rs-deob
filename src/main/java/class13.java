import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public abstract class class13 {

    @OriginalMember(owner = "client!be", name = "c", descriptor = "Laf;")
    public static class7 field326 = class48.method406(40, "Sichtbare Karte vorbereitet)3");

    @OriginalMember(owner = "client!be", name = "d", descriptor = "Laf;")
    public static class7 field327 = class48.method406(40, "sl_arrows");

    @OriginalMember(owner = "client!be", name = "k", descriptor = "Laf;")
    private static class7 field334 = class48.method406(40, " has logged out)3");

    @OriginalMember(owner = "client!be", name = "e", descriptor = "Laf;")
    public static class7 field328 = field334;

    @OriginalMember(owner = "client!be", name = "l", descriptor = "Laf;")
    public static class7 field335 = class48.method406(40, "Ihr Charakter)2Profil wird in:");

    @OriginalMember(owner = "client!be", name = "g", descriptor = "I")
    public static int field330 = 10;

    @OriginalMember(owner = "client!be", name = "h", descriptor = "I")
    public static int field331 = 0;

    @OriginalMember(owner = "client!be", name = "n", descriptor = "I")
    public static int field337 = 0;

    @OriginalMember(owner = "client!be", name = "i", descriptor = "Lgd;")
    public static class46 field332 = new class46(50);

    @OriginalMember(owner = "client!be", name = "p", descriptor = "Laf;")
    private static class7 field339 = class48.method406(40, "Loading )2 please wait)3");

    @OriginalMember(owner = "client!be", name = "o", descriptor = "Laf;")
    public static class7 field338 = class48.method406(40, "(U2");

    @OriginalMember(owner = "client!be", name = "s", descriptor = "Laf;")
    public static class7 field342 = field339;

    @OriginalMember(owner = "client!be", name = "q", descriptor = "I")
    public static int field340 = -1;

    @OriginalMember(owner = "client!be", name = "b", descriptor = "I")
    public static int field325;

    @OriginalMember(owner = "client!be", name = "f", descriptor = "I")
    public static int field329;

    @OriginalMember(owner = "client!be", name = "j", descriptor = "I")
    public static int field333;

    @OriginalMember(owner = "client!be", name = "r", descriptor = "Lr;")
    public static class118 field341;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field324;

    @OriginalMember(owner = "client!be", name = "m", descriptor = "[I")
    public static int[] field336;

    @OriginalMember(owner = "client!be", name = "t", descriptor = "[I")
    public static int[] field343;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(B)V")
    public abstract void method131(byte arg0);

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(ILaf;)I")
    public static final int method132(int arg0, class7 arg1) {
        field329++;
        if (class155.field3610 == 1) {
            return 7;
        } else if (arg1.method94((byte) -123, class83.field1960)) {
            return 1;
        } else if (arg1.method94((byte) -123, class101.field2406)) {
            return 1;
        } else if (arg1.method94((byte) -123, class48.field1167)) {
            return 2;
        } else if (arg1.method94((byte) -123, class115.field2733)) {
            return 2;
        } else if (arg1.method94((byte) -123, class96.field2293)) {
            return 3;
        } else if (arg1.method94((byte) -123, class22.field612)) {
            return 4;
        } else if (arg1.method94((byte) -123, class82.field1884)) {
            return 4;
        } else if (arg1.method94((byte) -123, class136.field3244)) {
            return 5;
        } else if (arg1.method94((byte) -123, class27.field713)) {
            return 6;
        } else if (arg0 == 16096) {
            return 0;
        } else {
            return -26;
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(IBI)I")
    public abstract int method133(int arg0, byte arg1, int arg2);

    @OriginalMember(owner = "client!be", name = "b", descriptor = "(B)V")
    public static void method134(byte arg0) {
        field335 = null;
        field327 = null;
        field326 = null;
        field328 = null;
        field343 = null;
        field338 = null;
        field332 = null;
        field324 = null;
        field341 = null;
        field342 = null;
        field339 = null;
        if (arg0 != 34) {
            field330 = 46;
        }
        field336 = null;
        field334 = null;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(I)V")
    public static final void method135(int arg0) {
        class47.field1150.method1131(47, 2027385224);
        class47.field1150.method956((long) arg0, -822368080);
        field333++;
        class116.field2757++;
    }

    @OriginalMember(owner = "client!be", name = "b", descriptor = "(I)V")
    public abstract void method136(int arg0);
}
