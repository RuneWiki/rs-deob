import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class7 extends Canvas {

    @OriginalMember(owner = "client!af", name = "i", descriptor = "Ljava/awt/Component;")
    private Component field121;

    @OriginalMember(owner = "client!af", name = "b", descriptor = "Lkb;")
    public static class93 field114 = class76.method390("Ung-Ultiges Anmelde)2Paket)3", 0);

    @OriginalMember(owner = "client!af", name = "a", descriptor = "Lkb;")
    public static class93 field113 = class76.method390("Bitte versuchen Sie es in ", 0);

    @OriginalMember(owner = "client!af", name = "c", descriptor = "Lkb;")
    public static class93 field115 = class76.method390(":clanreq:", 0);

    @OriginalMember(owner = "client!af", name = "e", descriptor = "I")
    public static int field117 = 1;

    @OriginalMember(owner = "client!af", name = "f", descriptor = "I")
    public static int field118;

    @OriginalMember(owner = "client!af", name = "g", descriptor = "I")
    public static int field119;

    @OriginalMember(owner = "client!af", name = "h", descriptor = "I")
    public static int field120;

    @OriginalMember(owner = "client!af", name = "d", descriptor = "[Lna;")
    public static class119[] field116;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IIII)I")
    public static final int method37(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 == 1) {
            field119++;
            return (4096 - arg3) * arg2 + arg0 * arg3 >> 12;
        } else {
            return -70;
        }
    }

    @OriginalMember(owner = "client!af", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        this.field121.paint(arg0);
        field118++;
    }

    @OriginalMember(owner = "client!af", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.field121.update(arg0);
        field120++;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(I)V")
    public static void method38(int arg0) {
        if (arg0 != 17506) {
            method37(-62, 30, -65, -45);
        }
        field116 = null;
        field114 = null;
        field115 = null;
        field113 = null;
    }

    @OriginalMember(owner = "client!af", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class7(Component arg0) {
        this.field121 = arg0;
    }
}
