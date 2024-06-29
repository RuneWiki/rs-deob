import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!n")
public class class25 extends Canvas {

    @OriginalMember(owner = "mapview!n", name = "h", descriptor = "Ljava/awt/Component;")
    private Component field392;

    @OriginalMember(owner = "mapview!n", name = "f", descriptor = "I")
    public static int field390 = 0;

    @OriginalMember(owner = "mapview!n", name = "j", descriptor = "Lea;")
    public static class10 field394 = class3.method8("Fur Trader", 123);

    @OriginalMember(owner = "mapview!n", name = "a", descriptor = "Lea;")
    public static class10 field385 = class3.method8("???", -103);

    @OriginalMember(owner = "mapview!n", name = "i", descriptor = "Lea;")
    public static class10 field393 = class3.method8("Water Source", -112);

    @OriginalMember(owner = "mapview!n", name = "c", descriptor = "Lea;")
    public static class10 field387 = class3.method8("Furnace", -75);

    @OriginalMember(owner = "mapview!n", name = "k", descriptor = "Lea;")
    public static class10 field395 = class3.method8("Switch to ", -4);

    @OriginalMember(owner = "mapview!n", name = "b", descriptor = "Lea;")
    public static class10 field386 = class3.method8("Dungeon", 108);

    @OriginalMember(owner = "mapview!n", name = "d", descriptor = "I")
    public static int field388;

    @OriginalMember(owner = "mapview!n", name = "g", descriptor = "I")
    public static int field391;

    @OriginalMember(owner = "mapview!n", name = "e", descriptor = "Lr;")
    public static class33 field389;

    @OriginalMember(owner = "mapview!n", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 6)
    public final void update(Graphics arg0) {
        this.field392.update(arg0);
    }

    @OriginalMember(owner = "mapview!n", name = "a", descriptor = "(Ljava/awt/Component;I)V", line = 13)
    public static final void method193(Component arg0, int arg1) {
        arg0.addMouseListener(class22.field234);
        if (arg1 > -75) {
            field386 = null;
        }
        arg0.addMouseMotionListener(class22.field234);
        arg0.addFocusListener(class22.field234);
    }

    @OriginalMember(owner = "mapview!n", name = "a", descriptor = "(I)V", line = 51)
    public static void method194(int arg0) {
        if (arg0 > -39) {
            method194(118);
        }
        field389 = null;
        field394 = null;
        field386 = null;
        field385 = null;
        field387 = null;
        field393 = null;
        field395 = null;
    }

    @OriginalMember(owner = "mapview!n", name = "a", descriptor = "(B)V", line = 69)
    public static final void method195(byte arg0) {
        if (class12.field104.toLowerCase().indexOf("microsoft") == -1) {
            mapview.field302[93] = 43;
            mapview.field302[59] = 57;
            if (class12.field109 == null) {
                mapview.field302[192] = 58;
                mapview.field302[222] = 59;
            } else {
                mapview.field302[520] = 59;
                mapview.field302[192] = 28;
                mapview.field302[222] = 58;
            }
            mapview.field302[47] = 73;
            mapview.field302[92] = 74;
            mapview.field302[91] = 42;
            mapview.field302[45] = 26;
            mapview.field302[46] = 72;
            mapview.field302[61] = 27;
            mapview.field302[44] = 71;
        } else {
            mapview.field302[221] = 43;
            mapview.field302[222] = 59;
            mapview.field302[188] = 71;
            mapview.field302[186] = 57;
            mapview.field302[192] = 58;
            mapview.field302[187] = 27;
            mapview.field302[189] = 26;
            mapview.field302[191] = 73;
            mapview.field302[219] = 42;
            mapview.field302[220] = 74;
            mapview.field302[190] = 72;
            mapview.field302[223] = 28;
        }
        int var1 = -121 % ((-arg0 - 63) / 54);
    }

    @OriginalMember(owner = "mapview!n", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 124)
    public final void paint(Graphics arg0) {
        this.field392.paint(arg0);
    }

    @OriginalMember(owner = "mapview!n", name = "<init>", descriptor = "(Ljava/awt/Component;)V", line = 136)
    public class25(Component arg0) {
        this.field392 = arg0;
    }

    @OriginalMember(owner = "mapview!n", name = "a", descriptor = "(BLjava/awt/event/KeyEvent;)I", line = 160)
    public static final int method196(byte arg0, KeyEvent arg1) {
        if (arg0 != 105) {
            return -109;
        }
        int var2 = arg1.getKeyChar();
        if (var2 == 8364) {
            return 128;
        } else {
            if (var2 <= 0 || var2 >= 256) {
                var2 = -1;
            }
            return var2;
        }
    }
}
