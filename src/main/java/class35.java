import java.awt.event.KeyEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!t")
public class class35 extends class8 {

    @OriginalMember(owner = "mapview!t", name = "q", descriptor = "Ll;")
    public static class22 field468 = class33.method229("37(U", -97);

    @OriginalMember(owner = "mapview!t", name = "s", descriptor = "Ll;")
    public static class22 field470 = class33.method229("Farming patch", -61);

    @OriginalMember(owner = "mapview!t", name = "w", descriptor = "Ll;")
    public static class22 field474 = class33.method229("Please wait)3)3)3 Rendering Map", -54);

    @OriginalMember(owner = "mapview!t", name = "u", descriptor = "I")
    public static int field472 = 0;

    @OriginalMember(owner = "mapview!t", name = "y", descriptor = "Ll;")
    public static class22 field476 = class33.method229("overlay2)3dat", -125);

    @OriginalMember(owner = "mapview!t", name = "z", descriptor = "Ll;")
    public static class22 field477 = class33.method229("Crafting Shop", -107);

    @OriginalMember(owner = "mapview!t", name = "v", descriptor = "Ll;")
    public static class22 field473 = class33.method229("loc)3dat", -91);

    @OriginalMember(owner = "mapview!t", name = "x", descriptor = "Ll;")
    public static class22 field475 = class33.method229("Slayer Master", -85);

    @OriginalMember(owner = "mapview!t", name = "t", descriptor = "I")
    public static int field471;

    @OriginalMember(owner = "mapview!t", name = "A", descriptor = "I")
    public static int field478;

    @OriginalMember(owner = "mapview!t", name = "r", descriptor = "Ll;")
    public class22 field469;

    @OriginalMember(owner = "mapview!t", name = "b", descriptor = "(I)V", line = 31)
    public static void method235(int arg0) {
        field474 = null;
        field477 = null;
        field473 = null;
        if (arg0 != 0) {
            method236(null, (byte) -67);
        }
        field475 = null;
        field476 = null;
        field468 = null;
        field470 = null;
    }

    @OriginalMember(owner = "mapview!t", name = "a", descriptor = "(Ljava/awt/event/KeyEvent;B)I", line = 50)
    public static final int method236(KeyEvent arg0, byte arg1) {
        int var2 = arg0.getKeyChar();
        if (arg1 != 109) {
            method235(45);
        }
        if (var2 <= 0 || var2 >= 256) {
            var2 = -1;
        }
        return var2;
    }
}
