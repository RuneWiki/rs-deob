import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!d")
public class class7 extends Canvas {

    @OriginalMember(owner = "mapview!d", name = "e", descriptor = "Ljava/awt/Component;")
    private Component field64;

    @OriginalMember(owner = "mapview!d", name = "a", descriptor = "Lt;")
    public static class31 field60 = class14.method84(123, "Staff Shop");

    @OriginalMember(owner = "mapview!d", name = "c", descriptor = "Lt;")
    public static class31 field62 = class14.method84(117, "Food Shop");

    @OriginalMember(owner = "mapview!d", name = "b", descriptor = "Lt;")
    public static class31 field61 = class14.method84(119, "Apothecary");

    @OriginalMember(owner = "mapview!d", name = "d", descriptor = "Lt;")
    public static class31 field63 = class14.method84(110, "Windmill");

    @OriginalMember(owner = "mapview!d", name = "f", descriptor = "[I")
    public static int[] field65 = new int[128];

    @OriginalMember(owner = "mapview!d", name = "a", descriptor = "(BLjava/awt/Component;)V", line = 8)
    public static final void method37(byte arg0, Component arg1) {
        arg1.removeMouseListener(class6.field39);
        if (arg0 == -91) {
            arg1.removeMouseMotionListener(class6.field39);
        }
    }

    @OriginalMember(owner = "mapview!d", name = "a", descriptor = "(II)I", line = 20)
    public static int method38(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "mapview!d", name = "a", descriptor = "(B)[Lu;", line = 30)
    public static final class32[] method39(byte arg0) {
        class32[] var1 = new class32[class34.field367];
        for (int var2 = 0; var2 < class34.field367; var2++) {
            class32 var3 = var1[var2] = new class32();
            var3.field344 = class26.field303;
            var3.field341 = class34.field355;
            var3.field342 = class12.field92[var2];
            var3.field346 = class20.field182[var2];
            var3.field343 = class24.field208[var2];
            var3.field345 = class18.field159[var2];
            byte[] var4 = class33.field351[var2];
            int var5 = var3.field345 * var3.field343;
            var3.field347 = new int[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                var3.field347[var6] = class22.field194[method38(var4[var6], 255)];
            }
        }
        if (arg0 != -128) {
            method40(-63);
        }
        class14.method82(arg0 - 27370);
        return var1;
    }

    @OriginalMember(owner = "mapview!d", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 71)
    public final void paint(Graphics arg0) {
        this.field64.paint(arg0);
    }

    @OriginalMember(owner = "mapview!d", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 81)
    public final void update(Graphics arg0) {
        this.field64.update(arg0);
    }

    @OriginalMember(owner = "mapview!d", name = "a", descriptor = "(I)V", line = 92)
    public static void method40(int arg0) {
        field65 = null;
        if (arg0 == 0) {
            field61 = null;
            field63 = null;
            field62 = null;
            field60 = null;
        }
    }

    @OriginalMember(owner = "mapview!d", name = "<init>", descriptor = "(Ljava/awt/Component;)V", line = 121)
    public class7(Component arg0) {
        this.field64 = arg0;
    }
}
