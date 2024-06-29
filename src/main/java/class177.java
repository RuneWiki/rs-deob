import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public class class177 extends Canvas {

    @OriginalMember(owner = "client!tf", name = "i", descriptor = "Ljava/awt/Component;")
    private Component field3633;

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "Lgg;")
    public static class63 field3627 = class116.method911(43, "titlebutton");

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "Lgg;")
    public static class63 field3626 = class116.method911(43, "Lade Texturen )2 ");

    @OriginalMember(owner = "client!tf", name = "j", descriptor = "[[B")
    public static byte[][] field3634 = new byte[250][];

    @OriginalMember(owner = "client!tf", name = "f", descriptor = "[I")
    public static int[] field3630 = new int[] { 1, 1, 1, 1 };

    @OriginalMember(owner = "client!tf", name = "o", descriptor = "Lgg;")
    public static class63 field3639 = class116.method911(43, ")1");

    @OriginalMember(owner = "client!tf", name = "q", descriptor = "[I")
    public static int[] field3641 = new int[2048];

    @OriginalMember(owner = "client!tf", name = "p", descriptor = "Lgg;")
    public static class63 field3640 = class116.method911(43, " )2>");

    @OriginalMember(owner = "client!tf", name = "s", descriptor = "Lgg;")
    private static class63 field3643 = class116.method911(43, "and choose the (Wcreate account(W");

    @OriginalMember(owner = "client!tf", name = "e", descriptor = "Lgg;")
    public static class63 field3629 = field3643;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "I")
    public static int field3625;

    @OriginalMember(owner = "client!tf", name = "g", descriptor = "I")
    public static int field3631;

    @OriginalMember(owner = "client!tf", name = "k", descriptor = "I")
    public static int field3635;

    @OriginalMember(owner = "client!tf", name = "m", descriptor = "I")
    public static int field3637;

    @OriginalMember(owner = "client!tf", name = "n", descriptor = "I")
    public static int field3638;

    @OriginalMember(owner = "client!tf", name = "l", descriptor = "Lmc;")
    public static class111 field3636;

    @OriginalMember(owner = "client!tf", name = "d", descriptor = "Lth;")
    public static class179 field3628;

    @OriginalMember(owner = "client!tf", name = "r", descriptor = "Z")
    public static boolean field3642;

    @OriginalMember(owner = "client!tf", name = "h", descriptor = "[[[B")
    public static byte[][][] field3632;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(II)Lsb;")
    public static final class164 method1173(int arg0, int arg1) {
        field3638++;
        class164 var2 = (class164) class190.field3857.method289((long) arg0, -130079263);
        int var3 = -14 % ((-arg1 - 57) / 43);
        if (var2 != null) {
            return var2;
        }
        byte[] var4 = class162.field3343.method745(5, arg0, 0);
        class164 var5 = new class164();
        if (var4 != null) {
            var5.method1117(new class3(var4), 1051);
        }
        class190.field3857.method293(false, (long) arg0, var5);
        return var5;
    }

    @OriginalMember(owner = "client!tf", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class177(Component arg0) {
        this.field3633 = arg0;
    }

    @OriginalMember(owner = "client!tf", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        field3637++;
        this.field3633.update(arg0);
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(I)V")
    public static void method1174(int arg0) {
        field3639 = null;
        field3634 = null;
        field3636 = null;
        field3643 = null;
        field3641 = null;
        field3630 = null;
        if (arg0 <= 11) {
            method1173(76, 102);
        }
        field3629 = null;
        field3632 = null;
        field3640 = null;
        field3626 = null;
        field3628 = null;
        field3627 = null;
    }

    @OriginalMember(owner = "client!tf", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        field3635++;
        this.field3633.paint(arg0);
    }
}
