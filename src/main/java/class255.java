import java.awt.Canvas;
import java.awt.Font;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public abstract class class255 extends class184 {

    @OriginalMember(owner = "client!kf", name = "n", descriptor = "I")
    public static int field3656 = 104;

    @OriginalMember(owner = "client!kf", name = "q", descriptor = "F")
    public static float field3659 = 0.0F;

    @OriginalMember(owner = "client!kf", name = "o", descriptor = "Lhe;")
    public static class372 field3657 = new class372(512);

    @OriginalMember(owner = "client!kf", name = "z", descriptor = "Ljt;")
    public static class106 field3668 = new class106(8);

    @OriginalMember(owner = "client!kf", name = "m", descriptor = "I")
    public static int field3655;

    @OriginalMember(owner = "client!kf", name = "p", descriptor = "I")
    public int field3658;

    @OriginalMember(owner = "client!kf", name = "r", descriptor = "I")
    public int field3660;

    @OriginalMember(owner = "client!kf", name = "u", descriptor = "I")
    public static int field3663;

    @OriginalMember(owner = "client!kf", name = "v", descriptor = "I")
    public static int field3664;

    @OriginalMember(owner = "client!kf", name = "w", descriptor = "I")
    public static int field3665;

    @OriginalMember(owner = "client!kf", name = "t", descriptor = "Ljava/awt/Font;")
    public static Font field3662;

    @OriginalMember(owner = "client!kf", name = "s", descriptor = "[I")
    public int[] field3661;

    @OriginalMember(owner = "client!kf", name = "x", descriptor = "[I")
    public static int[] field3666;

    @OriginalMember(owner = "client!kf", name = "y", descriptor = "[I")
    public static int[] field3667;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIIILjava/awt/Graphics;III)V")
    public abstract void method1019(int arg0, int arg1, int arg2, int arg3, Graphics arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public static final int method1672(String arg0, int arg1) {
        field3665++;
        if (arg1 != 2) {
            field3667 = null;
        }
        return arg0.length() + 2;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(Lvd;Ld;I)V")
    public static final void method1673(class39 arg0, class151 arg1, int arg2) {
        if (arg2 != 0) {
            method1672(null, -45);
        }
        class728.field10181 = arg1;
        class604.field8545 = arg0;
        field3655++;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(I)V")
    public static void method1674(int arg0) {
        field3667 = null;
        if (arg0 == 512) {
            field3662 = null;
            field3666 = null;
            field3657 = null;
            field3668 = null;
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(III)Z")
    public static final boolean method1675(int arg0, int arg1, int arg2) {
        field3663++;
        if (arg2 == 0) {
            return (arg0 & 0x22) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IILjava/awt/Canvas;I)V")
    public abstract void method1018(int arg0, int arg1, Canvas arg2, int arg3);
}
