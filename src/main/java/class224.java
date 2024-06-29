import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public abstract class class224 {

    @OriginalMember(owner = "client!me", name = "d", descriptor = "I")
    public static int field3705 = 0;

    @OriginalMember(owner = "client!me", name = "e", descriptor = "Z")
    public static boolean field3706 = true;

    @OriginalMember(owner = "client!me", name = "f", descriptor = "I")
    public static int field3707 = 0;

    @OriginalMember(owner = "client!me", name = "m", descriptor = "[I")
    public static int[] field3714 = new int[1000];

    @OriginalMember(owner = "client!me", name = "a", descriptor = "I")
    public int field3702;

    @OriginalMember(owner = "client!me", name = "c", descriptor = "I")
    public static int field3704;

    @OriginalMember(owner = "client!me", name = "g", descriptor = "I")
    public int field3708;

    @OriginalMember(owner = "client!me", name = "h", descriptor = "I")
    public static int field3709;

    @OriginalMember(owner = "client!me", name = "i", descriptor = "I")
    public static int field3710;

    @OriginalMember(owner = "client!me", name = "j", descriptor = "I")
    public static int field3711;

    @OriginalMember(owner = "client!me", name = "k", descriptor = "I")
    public static int field3712;

    @OriginalMember(owner = "client!me", name = "l", descriptor = "I")
    public static int field3713;

    @OriginalMember(owner = "client!me", name = "n", descriptor = "Ljava/awt/Image;")
    public Image field3715;

    @OriginalMember(owner = "client!me", name = "b", descriptor = "[I")
    public int[] field3703;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(Ljava/awt/Graphics;III)V")
    public abstract void method338(Graphics arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(ILjava/awt/Graphics;IIII)V")
    public abstract void method337(int arg0, Graphics arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(BI)I")
    public static final int method1575(byte arg0, int arg1) {
        field3704++;
        return arg0 >= -60 ? 11 : arg1 & 0x7F;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(I)V")
    public static final void method1576(int arg0) {
        field3713++;
        if (arg0 != 1000) {
            field3707 = -79;
        }
        class196.field3126.method472((byte) -63);
        class51.field892.method472((byte) -63);
        class198.field3161.method472((byte) -63);
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(Ljava/awt/Component;III)V")
    public abstract void method336(Component arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(BLbl;)V")
    public static final void method1577(byte arg0, class33 arg1) {
        if (arg0 != -89) {
            method1576(-92);
        }
        field3711++;
        class97 var2 = (class97) class220.field3593.method1400(class74.method522((byte) -60, arg1.field525), true);
        if (var2 == null) {
            class39.method345(arg1.field3340[0], arg1, 0, class250.field3980, (class15) null, arg1.field3321[0], (class135) null, false);
        } else {
            var2.method715(-62);
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(Lqh;Lqh;I)V")
    public static final void method1578(class201 arg0, class201 arg1, int arg2) {
        class6.field74 = arg0;
        class78.field1252 = arg1;
        field3710++;
        if (arg2 > -121) {
            field3706 = true;
        }
    }

    @OriginalMember(owner = "client!me", name = "b", descriptor = "(I)V")
    public static void method1579(int arg0) {
        field3714 = null;
        if (arg0 != -31876) {
            field3706 = true;
        }
    }

    @OriginalMember(owner = "client!me", name = "c", descriptor = "(I)V")
    public final void method1580(int arg0) {
        class2.method15(this.field3703, this.field3702, this.field3708);
        field3709++;
        if (arg0 != 16043) {
            this.method337(-115, (Graphics) null, -59, 108, 33, -91);
        }
    }

    @OriginalMember(owner = "client!me", name = "<init>", descriptor = "()V")
    protected class224() {
    }
}
