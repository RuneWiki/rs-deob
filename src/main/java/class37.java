import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!v")
public class class37 extends Canvas {

    @OriginalMember(owner = "mapview!v", name = "b", descriptor = "Ljava/awt/Component;")
    private Component field488;

    @OriginalMember(owner = "mapview!v", name = "f", descriptor = "Ld;")
    public static class7 field492 = class38.method251((byte) -73, "details)3dat");

    @OriginalMember(owner = "mapview!v", name = "d", descriptor = "Ld;")
    public static class7 field490 = class38.method251((byte) 78, "Makeover Mage");

    @OriginalMember(owner = "mapview!v", name = "j", descriptor = "Ld;")
    public static class7 field496 = class38.method251((byte) 53, "Archery Shop");

    @OriginalMember(owner = "mapview!v", name = "h", descriptor = "Ld;")
    public static class7 field494 = class38.method251((byte) -121, "Skirt Shop");

    @OriginalMember(owner = "mapview!v", name = "l", descriptor = "I")
    public static int field498 = -1;

    @OriginalMember(owner = "mapview!v", name = "m", descriptor = "Ld;")
    public static class7 field499 = class38.method251((byte) 82, "100(U");

    @OriginalMember(owner = "mapview!v", name = "i", descriptor = "Ld;")
    public static class7 field495 = class38.method251((byte) 60, "Combat Training");

    @OriginalMember(owner = "mapview!v", name = "o", descriptor = "I")
    public static int field501 = 500;

    @OriginalMember(owner = "mapview!v", name = "n", descriptor = "Ld;")
    public static class7 field500 = class38.method251((byte) -102, "Prev page");

    @OriginalMember(owner = "mapview!v", name = "c", descriptor = "I")
    public static int field489;

    @OriginalMember(owner = "mapview!v", name = "k", descriptor = "I")
    public static int field497;

    @OriginalMember(owner = "mapview!v", name = "e", descriptor = "J")
    public static long field491;

    @OriginalMember(owner = "mapview!v", name = "g", descriptor = "[B")
    public static byte[] field493;

    @OriginalMember(owner = "mapview!v", name = "a", descriptor = "[I")
    public static int[] field487;

    @OriginalMember(owner = "mapview!v", name = "a", descriptor = "(Lk;IZI)[Le;", line = 18)
    public static final class9[] method238(class20 arg0, int arg1, boolean arg2, int arg3) {
        if (arg2) {
            return (class9[]) null;
        } else if (class29.method209(arg0, 23979, arg1, arg3)) {
            return class8.method81((byte) 124);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "mapview!v", name = "a", descriptor = "(ZBLjava/lang/Object;)[B", line = 37)
    public static final byte[] method239(boolean arg0, byte arg1, Object arg2) {
        if (arg2 == null) {
            return null;
        } else if (arg2 instanceof byte[]) {
            byte[] var3 = (byte[]) arg2;
            return arg0 ? class21.method153(var3, 255) : var3;
        } else {
            if (arg1 != 38) {
                field494 = null;
            }
            if (!(arg2 instanceof class8)) {
                throw new IllegalArgumentException();
            }
            class8 var4 = (class8) arg2;
            return var4.method84(-58);
        }
    }

    @OriginalMember(owner = "mapview!v", name = "a", descriptor = "(BJ)V", line = 81)
    public static final void method240(byte arg0, long arg1) {
        if (arg0 >= -109) {
            field497 = 30;
        }
        try {
            Thread.sleep(arg1);
        } catch (InterruptedException var4) {
        }
    }

    @OriginalMember(owner = "mapview!v", name = "a", descriptor = "(B)V", line = 99)
    public static void method241(byte arg0) {
        field492 = null;
        field487 = null;
        field490 = null;
        field500 = null;
        field493 = null;
        field496 = null;
        if (arg0 > 20) {
            field494 = null;
            field499 = null;
            field495 = null;
        }
    }

    @OriginalMember(owner = "mapview!v", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 117)
    public final void paint(Graphics arg0) {
        this.field488.paint(arg0);
    }

    @OriginalMember(owner = "mapview!v", name = "<init>", descriptor = "(Ljava/awt/Component;)V", line = 135)
    public class37(Component arg0) {
        this.field488 = arg0;
    }

    @OriginalMember(owner = "mapview!v", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 154)
    public final void update(Graphics arg0) {
        this.field488.update(arg0);
    }

    @OriginalMember(owner = "mapview!v", name = "b", descriptor = "(B)V", line = 179)
    public static final void method242(byte arg0) {
        if (class3.field25.toLowerCase().indexOf("microsoft") == -1) {
            class31.field443[47] = 73;
            class31.field443[44] = 71;
            class31.field443[61] = 27;
            class31.field443[46] = 72;
            if (class3.field23 == null) {
                class31.field443[222] = 59;
                class31.field443[192] = 58;
            } else {
                class31.field443[222] = 58;
                class31.field443[192] = 28;
                class31.field443[520] = 59;
            }
            class31.field443[91] = 42;
            class31.field443[93] = 43;
            class31.field443[59] = 57;
            class31.field443[45] = 26;
            class31.field443[92] = 74;
        } else {
            class31.field443[192] = 58;
            class31.field443[188] = 71;
            class31.field443[186] = 57;
            class31.field443[221] = 43;
            class31.field443[220] = 74;
            class31.field443[223] = 28;
            class31.field443[189] = 26;
            class31.field443[191] = 73;
            class31.field443[222] = 59;
            class31.field443[187] = 27;
            class31.field443[219] = 42;
            class31.field443[190] = 72;
        }
        if (arg0 != 77) {
            method238(null, -125, true, -30);
        }
    }
}
