import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public abstract class class4 {

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "I")
    public static int field63 = 0;

    @OriginalMember(owner = "client!ac", name = "e", descriptor = "Lr;")
    public static class118 field67 = class153.method1136(126, "auf einer freien Welt zu spielen)3");

    @OriginalMember(owner = "client!ac", name = "i", descriptor = "Lke;")
    public static class74 field71 = null;

    @OriginalMember(owner = "client!ac", name = "n", descriptor = "Lr;")
    private static class118 field76 = class153.method1136(118, "RuneScape is loading )2 please wait)3)3)3");

    @OriginalMember(owner = "client!ac", name = "p", descriptor = "Lr;")
    private static class118 field78 = class153.method1136(91, "You have only just left another world)3");

    @OriginalMember(owner = "client!ac", name = "r", descriptor = "[[S")
    public static short[][] field80 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client!ac", name = "d", descriptor = "Lr;")
    public static class118 field66 = field76;

    @OriginalMember(owner = "client!ac", name = "k", descriptor = "I")
    public static int field73 = 0;

    @OriginalMember(owner = "client!ac", name = "o", descriptor = "Lr;")
    public static class118 field77 = field78;

    @OriginalMember(owner = "client!ac", name = "l", descriptor = "Lr;")
    private static class118 field74 = class153.method1136(119, "Loaded title screen");

    @OriginalMember(owner = "client!ac", name = "t", descriptor = "Lr;")
    public static class118 field82 = field74;

    @OriginalMember(owner = "client!ac", name = "f", descriptor = "Li;")
    public static class56 field68 = new class56();

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "I")
    public static int field64;

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "I")
    public static int field65;

    @OriginalMember(owner = "client!ac", name = "g", descriptor = "I")
    public static int field69;

    @OriginalMember(owner = "client!ac", name = "m", descriptor = "I")
    public static int field75;

    @OriginalMember(owner = "client!ac", name = "s", descriptor = "I")
    public static int field81;

    @OriginalMember(owner = "client!ac", name = "u", descriptor = "I")
    public static int field83;

    @OriginalMember(owner = "client!ac", name = "j", descriptor = "Lff;")
    public static class42 field72;

    @OriginalMember(owner = "client!ac", name = "q", descriptor = "Ljf;")
    public static class68 field79;

    @OriginalMember(owner = "client!ac", name = "h", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field70;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(B[B)V")
    public abstract void method12(byte arg0, byte[] arg1);

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(III)V")
    public static final void method13(int arg0, int arg1, int arg2) {
        if (arg1 >= -53) {
            method14(null, (byte) -128, null, null, null);
        }
        class1.field22.method722(81, (byte) 69);
        class1.field22.method817(arg0, -96);
        field81++;
        class1.field22.method841(arg2, -88);
        class125.field2857++;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lff;BLbf;Lff;Lff;)Z")
    public static final boolean method14(class42 arg0, byte arg1, class14 arg2, class42 arg3, class42 arg4) {
        class157.field3614 = arg4;
        field65++;
        class92.field2219 = arg3;
        class131.field2991 = arg2;
        if (arg1 <= 85) {
            field71 = null;
        }
        class69.field1602 = arg0;
        return true;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(B)V")
    public static void method15(byte arg0) {
        field71 = null;
        field67 = null;
        field74 = null;
        field76 = null;
        field72 = null;
        field66 = null;
        field78 = null;
        field68 = null;
        if (arg0 != 34) {
            field72 = null;
        }
        field80 = null;
        field77 = null;
        field79 = null;
        field82 = null;
        field70 = null;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(I)[B")
    public abstract byte[] method16(int arg0);

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(ILsd;)V")
    public static final void method17(int arg0, class129 arg1) {
        if (arg1.field2959 != null) {
            arg1.field2959.field2776 = 0;
        }
        arg1.field2960 = false;
        field83++;
        for (class129 var2 = arg1.method122(); var2 != null; var2 = arg1.method102()) {
            method17(-7695, var2);
        }
        if (arg0 != -7695) {
            method15((byte) 122);
        }
    }
}
