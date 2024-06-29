import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public abstract class class141 {

    @OriginalMember(owner = "client!ck", name = "e", descriptor = "Lda;")
    private static class275 field2485 = class255.method1672(114, "Loading config )2 ");

    @OriginalMember(owner = "client!ck", name = "c", descriptor = "Lda;")
    public static class275 field2483 = field2485;

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "Lne;")
    public static class137 field2482 = new class137(100);

    @OriginalMember(owner = "client!ck", name = "m", descriptor = "I")
    public static int field2493 = 100;

    @OriginalMember(owner = "client!ck", name = "k", descriptor = "I")
    public static int field2491 = 0;

    @OriginalMember(owner = "client!ck", name = "o", descriptor = "Lda;")
    public static class275 field2495 = class255.method1672(104, "blinken1:");

    @OriginalMember(owner = "client!ck", name = "n", descriptor = "Lrg;")
    public static class84 field2494 = new class84();

    @OriginalMember(owner = "client!ck", name = "q", descriptor = "Lda;")
    private static class275 field2497 = class255.method1672(125, "level: ");

    @OriginalMember(owner = "client!ck", name = "r", descriptor = "Lda;")
    public static class275 field2498 = field2497;

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "I")
    public static int field2481;

    @OriginalMember(owner = "client!ck", name = "f", descriptor = "I")
    public int field2486;

    @OriginalMember(owner = "client!ck", name = "h", descriptor = "I")
    public static int field2488;

    @OriginalMember(owner = "client!ck", name = "i", descriptor = "I")
    public int field2489;

    @OriginalMember(owner = "client!ck", name = "j", descriptor = "I")
    public static int field2490;

    @OriginalMember(owner = "client!ck", name = "l", descriptor = "I")
    public static int field2492;

    @OriginalMember(owner = "client!ck", name = "d", descriptor = "Ljava/awt/Image;")
    public Image field2484;

    @OriginalMember(owner = "client!ck", name = "g", descriptor = "[I")
    public int[] field2487;

    @OriginalMember(owner = "client!ck", name = "p", descriptor = "[I")
    public static int[] field2496;

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(Ljava/awt/Graphics;IIIII)V")
    public abstract void method1014(Graphics arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(ILjava/awt/Component;II)V")
    public abstract void method1015(int arg0, Component arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(B)V")
    public final void method1016(byte arg0) {
        class47.method291(this.field2487, this.field2489, this.field2486);
        int var2 = 93 / ((56 - arg0) / 52);
        field2492++;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(II)I")
    public static final int method1017(int arg0, int arg1) {
        int var2 = (arg0 * arg0 >> 12) * arg0 >> 12;
        int var3 = -56 / ((arg1 + 33) / 50);
        field2481++;
        int var4 = arg0 * 6 - 61440;
        int var5 = (arg0 * var4 >> 12) + 40960;
        return var2 * var5 >> 12;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(IIBLjava/awt/Graphics;)V")
    public abstract void method1018(int arg0, int arg1, byte arg2, Graphics arg3);

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "(B)V")
    public static void method1019(byte arg0) {
        field2496 = null;
        field2494 = null;
        field2497 = null;
        field2485 = null;
        field2495 = null;
        if (arg0 > -51) {
            field2483 = null;
        }
        field2498 = null;
        field2482 = null;
        field2483 = null;
    }

    @OriginalMember(owner = "client!ck", name = "<init>", descriptor = "()V")
    protected class141() {
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public static final void method1020(Component arg0, int arg1) {
        arg0.removeKeyListener(class91.field1548);
        int var2 = 92 / ((arg1 - 85) / 39);
        arg0.removeFocusListener(class91.field1548);
        field2490++;
        class195.field3333 = -1;
    }
}
