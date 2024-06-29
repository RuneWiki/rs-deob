import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public class class20 extends Canvas {

    @OriginalMember(owner = "client!da", name = "g", descriptor = "Ljava/awt/Component;")
    private Component field531;

    @OriginalMember(owner = "client!da", name = "b", descriptor = "Lva;")
    private static class121 field526 = class107.method797(" million", -10983);

    @OriginalMember(owner = "client!da", name = "k", descriptor = "Lva;")
    public static class121 field535 = class107.method797("backtop1", -10983);

    @OriginalMember(owner = "client!da", name = "f", descriptor = "Lva;")
    private static class121 field530 = class107.method797("Cancel", -10983);

    @OriginalMember(owner = "client!da", name = "l", descriptor = "Lva;")
    public static class121 field536 = field530;

    @OriginalMember(owner = "client!da", name = "i", descriptor = "Lva;")
    public static class121 field533 = field526;

    @OriginalMember(owner = "client!da", name = "h", descriptor = "Lva;")
    private static class121 field532 = class107.method797("Create a free account", -10983);

    @OriginalMember(owner = "client!da", name = "o", descriptor = "[[B")
    public static byte[][] field539 = new byte[1000][];

    @OriginalMember(owner = "client!da", name = "d", descriptor = "I")
    public static int field528 = 0;

    @OriginalMember(owner = "client!da", name = "n", descriptor = "Lva;")
    public static class121 field538 = field532;

    @OriginalMember(owner = "client!da", name = "c", descriptor = "Lqa;")
    public static class96 field527 = new class96(4096);

    @OriginalMember(owner = "client!da", name = "s", descriptor = "Lva;")
    public static class121 field543 = class107.method797("Chat panel redrawn", -10983);

    @OriginalMember(owner = "client!da", name = "v", descriptor = "I")
    public static int field546 = 0;

    @OriginalMember(owner = "client!da", name = "u", descriptor = "[I")
    public static int[] field545 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!da", name = "q", descriptor = "I")
    public static int field541 = 0;

    @OriginalMember(owner = "client!da", name = "t", descriptor = "Lva;")
    public static class121 field544 = class107.method797(" )2> @lre@", -10983);

    @OriginalMember(owner = "client!da", name = "w", descriptor = "I")
    public static int field547 = 1;

    @OriginalMember(owner = "client!da", name = "e", descriptor = "I")
    public static int field529;

    @OriginalMember(owner = "client!da", name = "j", descriptor = "I")
    public static int field534;

    @OriginalMember(owner = "client!da", name = "m", descriptor = "I")
    public static int field537;

    @OriginalMember(owner = "client!da", name = "p", descriptor = "I")
    public static int field540;

    @OriginalMember(owner = "client!da", name = "r", descriptor = "I")
    public static int field542;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "[[[B")
    public static byte[][][] field525;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(I)V", line = 28)
    public static final void method177(int arg0) {
        if (arg0 != 1000) {
            method177(4);
        }
        field534++;
        class129.field2970.method347(true);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(B)V", line = 44)
    public static void method178(byte arg0) {
        field526 = null;
        field533 = null;
        field535 = null;
        field538 = null;
        field527 = null;
        field539 = null;
        field532 = null;
        field543 = null;
        field544 = null;
        field525 = null;
        field545 = null;
        field536 = null;
        field530 = null;
        if (arg0 > -42) {
            method177(-6);
        }
    }

    @OriginalMember(owner = "client!da", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 74)
    public final void paint(Graphics arg0) {
        field540++;
        this.field531.paint(arg0);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(II)Lje;", line = 82)
    public static final class59 method179(int arg0, int arg1) {
        if (arg0 != 6) {
            method177(-121);
        }
        class59 var2 = (class59) class121.field2805.method345(arg0 + 106, (long) arg1);
        field537++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class129.field2976.method315(6, true, arg1);
        class59 var4 = new class59();
        var4.field1369 = arg1;
        if (var3 != null) {
            var4.method424(new class113(var3), (byte) -110);
        }
        var4.method429(15);
        if (var4.field1401) {
            var4.field1370 = false;
            var4.field1374 = false;
        }
        class121.field2805.method350((byte) 123, var4, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!da", name = "<init>", descriptor = "(Ljava/awt/Component;)V", line = 115)
    public class20(Component arg0) {
        this.field531 = arg0;
    }

    @OriginalMember(owner = "client!da", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 133)
    public final void update(Graphics arg0) {
        field529++;
        this.field531.update(arg0);
    }
}
