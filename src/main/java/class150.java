import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public abstract class class150 {

    @OriginalMember(owner = "client!vd", name = "d", descriptor = "I")
    public static int field3465 = 0;

    @OriginalMember(owner = "client!vd", name = "e", descriptor = "Lv;")
    private static class146 field3466 = class159.method1226((byte) -37, "Click to switch");

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "Lv;")
    public static class146 field3462 = class159.method1226((byte) -37, " <col=00ff80>");

    @OriginalMember(owner = "client!vd", name = "f", descriptor = "Lv;")
    public static class146 field3467 = class159.method1226((byte) -37, "mapscene");

    @OriginalMember(owner = "client!vd", name = "i", descriptor = "Lv;")
    public static class146 field3470 = class159.method1226((byte) -37, "logo");

    @OriginalMember(owner = "client!vd", name = "l", descriptor = "Lv;")
    public static class146 field3473 = class159.method1226((byte) -37, "p12_full");

    @OriginalMember(owner = "client!vd", name = "o", descriptor = "Lv;")
    public static class146 field3476 = class159.method1226((byte) -37, "sl_stars");

    @OriginalMember(owner = "client!vd", name = "j", descriptor = "Lv;")
    public static class146 field3471 = class159.method1226((byte) -37, "m");

    @OriginalMember(owner = "client!vd", name = "q", descriptor = "Lv;")
    public static class146 field3478 = field3466;

    @OriginalMember(owner = "client!vd", name = "p", descriptor = "Z")
    public static boolean field3477 = false;

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "I")
    public int field3464;

    @OriginalMember(owner = "client!vd", name = "g", descriptor = "I")
    public static int field3468;

    @OriginalMember(owner = "client!vd", name = "h", descriptor = "I")
    public static int field3469;

    @OriginalMember(owner = "client!vd", name = "n", descriptor = "I")
    public int field3475;

    @OriginalMember(owner = "client!vd", name = "k", descriptor = "Ljava/awt/Image;")
    public Image field3472;

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "[I")
    public static int[] field3463;

    @OriginalMember(owner = "client!vd", name = "m", descriptor = "[I")
    public int[] field3474;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IILjava/awt/Component;I)V")
    public abstract void method596(int arg0, int arg1, Component arg2, int arg3);

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(I)V")
    public static void method1129(int arg0) {
        if (arg0 != 0) {
            method1129(101);
        }
        field3466 = null;
        field3462 = null;
        field3478 = null;
        field3467 = null;
        field3463 = null;
        field3476 = null;
        field3471 = null;
        field3473 = null;
        field3470 = null;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(B)V")
    public final void method1130(byte arg0) {
        field3468++;
        class56.method389(this.field3474, this.field3475, this.field3464);
        if (arg0 >= -92) {
            this.method1130((byte) -76);
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IBIIILjava/awt/Graphics;)V")
    public abstract void method602(int arg0, byte arg1, int arg2, int arg3, int arg4, Graphics arg5);

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IILjava/awt/Graphics;I)V")
    public abstract void method599(int arg0, int arg1, Graphics arg2, int arg3);

    @OriginalMember(owner = "client!vd", name = "<init>", descriptor = "()V")
    protected class150() {
    }
}
