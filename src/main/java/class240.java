import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class240 extends Canvas {

    @OriginalMember(owner = "client!wc", name = "d", descriptor = "Ljava/awt/Component;")
    private Component field4405;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "Ldc;")
    public static class37 field4402 = class185.method1233((byte) 86, "huffman");

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "Ldc;")
    public static class37 field4404 = class185.method1233((byte) 86, ":assist:");

    @OriginalMember(owner = "client!wc", name = "e", descriptor = "Ldc;")
    public static class37 field4406 = class185.method1233((byte) 86, "Cabbage");

    @OriginalMember(owner = "client!wc", name = "h", descriptor = "Ldc;")
    public static class37 field4409 = class185.method1233((byte) 86, "Regeln versto-8en hat)3");

    @OriginalMember(owner = "client!wc", name = "j", descriptor = "[[B")
    public static byte[][] field4411 = new byte[1000][];

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "I")
    public static int field4403;

    @OriginalMember(owner = "client!wc", name = "f", descriptor = "I")
    public static int field4407;

    @OriginalMember(owner = "client!wc", name = "g", descriptor = "I")
    public static int field4408;

    @OriginalMember(owner = "client!wc", name = "i", descriptor = "I")
    public static int field4410;

    @OriginalMember(owner = "client!wc", name = "k", descriptor = "I")
    public static int field4412;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(I)V")
    public static void method1573(int arg0) {
        field4409 = null;
        field4406 = null;
        field4411 = null;
        if (arg0 != 1000) {
            field4411 = null;
        }
        field4404 = null;
        field4402 = null;
    }

    @OriginalMember(owner = "client!wc", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        field4403++;
        this.field4405.update(arg0);
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(BII)I")
    public static final int method1574(byte arg0, int arg1, int arg2) {
        field4410++;
        if (arg0 != -18) {
            field4406 = null;
        }
        class117 var3 = (class117) class41.field831.method1047((byte) -50, (long) arg2);
        if (var3 == null) {
            return 0;
        } else if (arg1 >= 0 && var3.field2095.length > arg1) {
            return var3.field2095[arg1];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!wc", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class240(Component arg0) {
        this.field4405 = arg0;
    }

    @OriginalMember(owner = "client!wc", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        field4407++;
        this.field4405.paint(arg0);
    }
}
