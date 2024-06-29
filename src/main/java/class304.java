import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public class class304 extends Canvas {

    @OriginalMember(owner = "client!vh", name = "g", descriptor = "Ljava/awt/Component;")
    private Component field4475;

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "I")
    public static int field4470 = 0;

    @OriginalMember(owner = "client!vh", name = "d", descriptor = "Ljava/util/Hashtable;")
    public static Hashtable field4472 = new Hashtable();

    @OriginalMember(owner = "client!vh", name = "e", descriptor = "Lig;")
    public static class206 field4473 = new class206(83, 8);

    @OriginalMember(owner = "client!vh", name = "h", descriptor = "Lig;")
    public static class206 field4476 = new class206(44, 2);

    @OriginalMember(owner = "client!vh", name = "i", descriptor = "Z")
    public static boolean field4477 = false;

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "I")
    public static int field4469;

    @OriginalMember(owner = "client!vh", name = "c", descriptor = "I")
    public static int field4471;

    @OriginalMember(owner = "client!vh", name = "f", descriptor = "I")
    public static int field4474;

    @OriginalMember(owner = "client!vh", name = "j", descriptor = "I")
    public static int field4478;

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(B)V", line = 4)
    public static void method2024(byte arg0) {
        field4472 = null;
        field4476 = null;
        if (arg0 < 33) {
            field4473 = null;
        }
        field4473 = null;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(II)V", line = 26)
    public static final void method2025(int arg0, int arg1) {
        field4469++;
        if (arg0 != 15) {
            method2026((byte) -21);
        }
        class407.method2578((byte) -121);
        int var2 = class574.field8290.method944(true, arg1).field185;
        if (var2 == 0) {
            return;
        }
        int var3 = class23.field243.field8040[arg1];
        if (var2 == 5) {
            class319.field4622 = var3;
        }
        if (var2 == 6) {
            class270.field3791 = var3;
        }
    }

    @OriginalMember(owner = "client!vh", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 52)
    public final void update(Graphics arg0) {
        this.field4475.update(arg0);
        field4471++;
    }

    @OriginalMember(owner = "client!vh", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 65)
    public final void paint(Graphics arg0) {
        this.field4475.paint(arg0);
        field4478++;
    }

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "(B)V", line = 77)
    public static final void method2026(byte arg0) {
        if (arg0 != 73) {
            field4476 = null;
        }
        field4474++;
        class467 var1 = class541.method3144(0, (byte) -101, 15);
        var1.method2852(0);
    }

    @OriginalMember(owner = "client!vh", name = "<init>", descriptor = "(Ljava/awt/Component;)V", line = 89)
    public class304(Component arg0) {
        this.field4475 = arg0;
    }
}
