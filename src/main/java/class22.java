import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ka")
public class class22 extends Canvas {

    @OriginalMember(owner = "mapview!ka", name = "a", descriptor = "Ljava/awt/Component;")
    private Component field267;

    @OriginalMember(owner = "mapview!ka", name = "d", descriptor = "Lk;")
    public static class21 field270 = class14.method92((byte) 57, "37(U");

    @OriginalMember(owner = "mapview!ka", name = "b", descriptor = "Lk;")
    public static class21 field268 = class14.method92((byte) 57, "Saw Mill");

    @OriginalMember(owner = "mapview!ka", name = "f", descriptor = "I")
    public static int field272 = 0;

    @OriginalMember(owner = "mapview!ka", name = "e", descriptor = "Lk;")
    public static class21 field271 = class14.method92((byte) 57, "Loading ");

    @OriginalMember(owner = "mapview!ka", name = "c", descriptor = "Lk;")
    public static class21 field269 = class14.method92((byte) 57, "Clothes Shop");

    @OriginalMember(owner = "mapview!ka", name = "h", descriptor = "Lk;")
    public static class21 field274 = class14.method92((byte) 57, "Mini)2Game");

    @OriginalMember(owner = "mapview!ka", name = "g", descriptor = "I")
    public static int field273 = 0;

    @OriginalMember(owner = "mapview!ka", name = "i", descriptor = "Lk;")
    public static class21 field275 = class14.method92((byte) 57, "Water Source");

    @OriginalMember(owner = "mapview!ka", name = "a", descriptor = "(I)V", line = 4)
    public static void method146(int arg0) {
        field275 = null;
        if (arg0 != 58) {
            return;
        }
        field271 = null;
        field274 = null;
        field269 = null;
        field268 = null;
        field270 = null;
    }

    @OriginalMember(owner = "mapview!ka", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 23)
    public final void paint(Graphics arg0) {
        this.field267.paint(arg0);
    }

    @OriginalMember(owner = "mapview!ka", name = "<init>", descriptor = "(Ljava/awt/Component;)V", line = 29)
    public class22(Component arg0) {
        this.field267 = arg0;
    }

    @OriginalMember(owner = "mapview!ka", name = "b", descriptor = "(I)V", line = 53)
    public static final void method147(int arg0) {
        if (class18.field229.toLowerCase().indexOf("microsoft") == -1) {
            class2.field75[44] = 71;
            class2.field75[45] = 26;
            class2.field75[46] = 72;
            class2.field75[47] = 73;
            class2.field75[59] = 57;
            class2.field75[61] = 27;
            class2.field75[91] = 42;
            class2.field75[92] = 74;
            class2.field75[93] = 43;
            if (class18.field230 == null) {
                class2.field75[192] = 58;
                class2.field75[222] = 59;
            } else {
                class2.field75[192] = 28;
                class2.field75[222] = 58;
                class2.field75[520] = 59;
            }
        } else {
            class2.field75[186] = 57;
            class2.field75[187] = 27;
            class2.field75[188] = 71;
            class2.field75[189] = 26;
            class2.field75[190] = 72;
            class2.field75[191] = 73;
            class2.field75[192] = 58;
            class2.field75[219] = 42;
            class2.field75[220] = 74;
            class2.field75[221] = 43;
            class2.field75[222] = 59;
            class2.field75[223] = 28;
        }
        if (arg0 < 39) {
            field270 = null;
        }
    }

    @OriginalMember(owner = "mapview!ka", name = "a", descriptor = "(Ljava/awt/event/KeyEvent;B)I", line = 110)
    public static final int method148(KeyEvent arg0, byte arg1) {
        int var2 = arg0.getKeyChar();
        if (arg1 < 118) {
            field269 = null;
        }
        if (var2 <= 0 || var2 >= 256) {
            var2 = -1;
        }
        return var2;
    }

    @OriginalMember(owner = "mapview!ka", name = "a", descriptor = "(IILm;I)Lba;", line = 131)
    public static final class4 method149(int arg0, int arg1, class25 arg2, int arg3) {
        if (class23.method153(arg0, arg1, 5000, arg2)) {
            int var4 = 113 / ((arg3 - 21) / 54);
            return class23.method155(52);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "mapview!ka", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 144)
    public final void update(Graphics arg0) {
        this.field267.update(arg0);
    }

    @OriginalMember(owner = "mapview!ka", name = "a", descriptor = "(JB)V", line = 185)
    public static final void method150(long arg0, byte arg1) {
        if (arg1 == 115) {
            try {
                Thread.sleep(arg0);
            } catch (InterruptedException var4) {
            }
        }
    }
}
