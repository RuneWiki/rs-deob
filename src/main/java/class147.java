import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class147 {

    @OriginalMember(owner = "client!wa", name = "m", descriptor = "Lwd;")
    public static class150 field3556 = class2.method9(true, "::");

    @OriginalMember(owner = "client!wa", name = "i", descriptor = "Lwd;")
    public static class150 field3552 = class2.method9(true, "backbase1");

    @OriginalMember(owner = "client!wa", name = "p", descriptor = "I")
    public static int field3559 = -1;

    @OriginalMember(owner = "client!wa", name = "t", descriptor = "I")
    public static int field3563 = 0;

    @OriginalMember(owner = "client!wa", name = "y", descriptor = "I")
    public static int field3568 = 0;

    @OriginalMember(owner = "client!wa", name = "v", descriptor = "Lwd;")
    private static class150 field3565 = class2.method9(true, "Please close the interface you have open before using (Wreport abuse(W");

    @OriginalMember(owner = "client!wa", name = "u", descriptor = "Lwd;")
    public static class150 field3564 = field3565;

    @OriginalMember(owner = "client!wa", name = "E", descriptor = "Lwd;")
    private static class150 field3574 = class2.method9(true, "Existing User");

    @OriginalMember(owner = "client!wa", name = "x", descriptor = "Lwd;")
    public static class150 field3567 = field3574;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "I")
    public int field3544;

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "I")
    public int field3545;

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "I")
    public int field3546;

    @OriginalMember(owner = "client!wa", name = "d", descriptor = "I")
    public static int field3547;

    @OriginalMember(owner = "client!wa", name = "e", descriptor = "I")
    public int field3548;

    @OriginalMember(owner = "client!wa", name = "f", descriptor = "I")
    public int field3549;

    @OriginalMember(owner = "client!wa", name = "g", descriptor = "I")
    public int field3550;

    @OriginalMember(owner = "client!wa", name = "h", descriptor = "I")
    public int field3551;

    @OriginalMember(owner = "client!wa", name = "j", descriptor = "I")
    public int field3553;

    @OriginalMember(owner = "client!wa", name = "k", descriptor = "I")
    public static int field3554;

    @OriginalMember(owner = "client!wa", name = "l", descriptor = "I")
    public int field3555;

    @OriginalMember(owner = "client!wa", name = "n", descriptor = "I")
    public int field3557;

    @OriginalMember(owner = "client!wa", name = "o", descriptor = "I")
    public int field3558;

    @OriginalMember(owner = "client!wa", name = "r", descriptor = "I")
    public int field3561;

    @OriginalMember(owner = "client!wa", name = "s", descriptor = "I")
    public int field3562;

    @OriginalMember(owner = "client!wa", name = "w", descriptor = "I")
    public int field3566;

    @OriginalMember(owner = "client!wa", name = "z", descriptor = "I")
    public int field3569;

    @OriginalMember(owner = "client!wa", name = "A", descriptor = "I")
    public int field3570;

    @OriginalMember(owner = "client!wa", name = "B", descriptor = "I")
    public int field3571;

    @OriginalMember(owner = "client!wa", name = "C", descriptor = "I")
    public int field3572;

    @OriginalMember(owner = "client!wa", name = "D", descriptor = "J")
    public static long field3573;

    @OriginalMember(owner = "client!wa", name = "q", descriptor = "Lwb;")
    public static class148 field3560;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(B)V")
    public static void method1098(byte arg0) {
        field3564 = null;
        field3556 = null;
        field3560 = null;
        field3574 = null;
        field3552 = null;
        int var1 = 2 / ((arg0 + 47) / 57);
        field3565 = null;
        field3567 = null;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(Lwb;B)Lwd;")
    public static final class150 method1099(class148 arg0, byte arg1) {
        if (arg1 >= -42) {
            field3556 = null;
        }
        field3547++;
        return class22.method183(32767, 5321, arg0);
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(II)I")
    public static int method1100(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(I)V")
    public static final void method1101(int arg0) {
        field3554++;
        try {
            Graphics var1 = class142.field3439.getGraphics();
            class94.field2192.method287(var1, true, 4, 0);
            class150.field3664.method287(var1, true, 357, 0);
            class118.field2703.method287(var1, true, 4, 722);
            class103.field2343.method287(var1, true, 205, 743);
            class20.field499.method287(var1, true, 0, 0);
            class17.field469.method287(var1, true, 4, 516);
            class34.field955.method287(var1, true, 205, 516);
            if (arg0 >= -38) {
                method1101(108);
            }
            class1.field12.method287(var1, true, 357, 496);
            class26.field797.method287(var1, true, 338, 0);
        } catch (Exception var2) {
            class142.field3439.repaint();
        }
    }
}
