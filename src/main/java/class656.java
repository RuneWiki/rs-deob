import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class656 extends Canvas {

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "Ljava/awt/Component;")
    private Component field9120;

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "Z")
    public static boolean field9121 = false;

    @OriginalMember(owner = "client!ed", name = "e", descriptor = "[Lut;")
    public static class109[] field9124 = new class109[14];

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "I")
    public static int field9122;

    @OriginalMember(owner = "client!ed", name = "f", descriptor = "I")
    public static int field9125;

    @OriginalMember(owner = "client!ed", name = "g", descriptor = "I")
    public static int field9126;

    @OriginalMember(owner = "client!ed", name = "d", descriptor = "Lsp;")
    public static class589 field9123;

    @OriginalMember(owner = "client!ed", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class656(Component arg0) {
        this.field9120 = arg0;
    }

    @OriginalMember(owner = "client!ed", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        field9122++;
        this.field9120.paint(arg0);
    }

    @OriginalMember(owner = "client!ed", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        field9126++;
        this.field9120.update(arg0);
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(B)V")
    public static final void method3693(byte arg0) {
        class341.field4566 = new class227();
        field9125++;
        if (arg0 <= 101) {
            field9121 = true;
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(I)V")
    public static void method3694(int arg0) {
        field9124 = null;
        int var1 = 23 % ((-arg0 - 66) / 38);
        field9123 = null;
    }
}
