import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!oa")
public class class28 extends Canvas {

    @OriginalMember(owner = "mapview!oa", name = "e", descriptor = "Ljava/awt/Component;")
    private Component field420;

    @OriginalMember(owner = "mapview!oa", name = "c", descriptor = "Lna;")
    public static class26 field418 = class33.method219("Magic Shop", 77);

    @OriginalMember(owner = "mapview!oa", name = "h", descriptor = "[Z")
    public static boolean[] field423 = new boolean[112];

    @OriginalMember(owner = "mapview!oa", name = "i", descriptor = "I")
    public static int field424 = 0;

    @OriginalMember(owner = "mapview!oa", name = "j", descriptor = "Lna;")
    public static class26 field425 = class33.method219("Anvil", 80);

    @OriginalMember(owner = "mapview!oa", name = "a", descriptor = "Lna;")
    public static class26 field416 = class33.method219("Short)2cut", 92);

    @OriginalMember(owner = "mapview!oa", name = "b", descriptor = "Lna;")
    public static class26 field417 = class33.method219("Sword Shop", 106);

    @OriginalMember(owner = "mapview!oa", name = "f", descriptor = "Lna;")
    public static class26 field421 = class33.method219("Staff Shop", 82);

    @OriginalMember(owner = "mapview!oa", name = "k", descriptor = "Lna;")
    public static class26 field426 = class33.method219("Loading )3)3)3", 82);

    @OriginalMember(owner = "mapview!oa", name = "d", descriptor = "Lna;")
    public static class26 field419 = class33.method219("Axe Shop", 99);

    @OriginalMember(owner = "mapview!oa", name = "l", descriptor = "I")
    public static int field427;

    @OriginalMember(owner = "mapview!oa", name = "g", descriptor = "Z")
    public static boolean field422;

    @OriginalMember(owner = "mapview!oa", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 8)
    public final void paint(Graphics arg0) {
        this.field420.paint(arg0);
    }

    @OriginalMember(owner = "mapview!oa", name = "<init>", descriptor = "(Ljava/awt/Component;)V", line = 34)
    public class28(Component arg0) {
        this.field420 = arg0;
    }

    @OriginalMember(owner = "mapview!oa", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 43)
    public final void update(Graphics arg0) {
        this.field420.update(arg0);
    }

    @OriginalMember(owner = "mapview!oa", name = "a", descriptor = "(I)V", line = 89)
    public static void method196(int arg0) {
        if (arg0 != 0) {
            field423 = null;
        }
        field425 = null;
        field426 = null;
        field423 = null;
        field416 = null;
        field419 = null;
        field421 = null;
        field418 = null;
        field417 = null;
    }
}
