import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!c")
public class GameCanvas extends Canvas {

    @OriginalMember(owner = "mapview!c", name = "i", descriptor = "Ljava/awt/Component;")
    private Component field40;

    @OriginalMember(owner = "mapview!c", name = "a", descriptor = "Lv;")
    public static JagString field32 = class1.method2(255, "-5bersicht");

    @OriginalMember(owner = "mapview!c", name = "c", descriptor = "Lv;")
    public static JagString field34 = class1.method2(255, "General Store");

    @OriginalMember(owner = "mapview!c", name = "f", descriptor = "Lv;")
    public static JagString field37 = class1.method2(255, "Transportation");

    @OriginalMember(owner = "mapview!c", name = "h", descriptor = "Lv;")
    public static JagString field39 = class1.method2(255, "Vegetable Store");

    @OriginalMember(owner = "mapview!c", name = "g", descriptor = "I")
    public static int field38 = 0;

    @OriginalMember(owner = "mapview!c", name = "e", descriptor = "Lv;")
    public static JagString field36 = class1.method2(255, "Short)2cut");

    @OriginalMember(owner = "mapview!c", name = "d", descriptor = "I")
    public static int field35 = 0;

    @OriginalMember(owner = "mapview!c", name = "l", descriptor = "Lv;")
    public static JagString field43 = class1.method2(255, "Legende");

    @OriginalMember(owner = "mapview!c", name = "k", descriptor = "I")
    public static int field42;

    @OriginalMember(owner = "mapview!c", name = "b", descriptor = "Lu;")
    public static Signlink field33;

    @OriginalMember(owner = "mapview!c", name = "j", descriptor = "Lpa;")
    public static Worldmap field41;

    @OriginalMember(owner = "mapview!c", name = "a", descriptor = "(B)V", line = 9)
    public static void method17(byte arg0) {
        field37 = null;
        field39 = null;
        field33 = null;
        field32 = null;
        if (arg0 < 20) {
            field38 = 9;
        }
        field43 = null;
        field34 = null;
        field36 = null;
        field41 = null;
    }

    @OriginalMember(owner = "mapview!c", name = "a", descriptor = "(Z)V", line = 43)
    public static final void method18(boolean arg0) {
        if (arg0) {
            field41 = null;
        }
        if (Worldmap.field347 != null) {
            JavaMouse var1 = Worldmap.field347;
            synchronized (Worldmap.field347) {
                Worldmap.field347 = null;
            }
        }
    }

    @OriginalMember(owner = "mapview!c", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 75)
    public final void paint(Graphics arg0) {
        this.field40.paint(arg0);
    }

    @OriginalMember(owner = "mapview!c", name = "<init>", descriptor = "(Ljava/awt/Component;)V", line = 85)
    public GameCanvas(Component arg0) {
        this.field40 = arg0;
    }

    @OriginalMember(owner = "mapview!c", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 112)
    public final void update(Graphics arg0) {
        this.field40.update(arg0);
    }
}
