import java.awt.event.KeyEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!t")
public class class31 extends class34 {

    @OriginalMember(owner = "mapview!t", name = "m", descriptor = "Ll;")
    public static class21 field358 = class28.method185(-20839, "Agility Training");

    @OriginalMember(owner = "mapview!t", name = "p", descriptor = "Ll;")
    public static class21 field361 = class28.method185(-20839, "null");

    @OriginalMember(owner = "mapview!t", name = "o", descriptor = "Ll;")
    public static class21 field360 = class28.method185(-20839, "Rare Trees");

    @OriginalMember(owner = "mapview!t", name = "q", descriptor = "Ll;")
    public static class21 field362 = class28.method185(-20839, "Helmet Shop");

    @OriginalMember(owner = "mapview!t", name = "s", descriptor = "Z")
    public static volatile boolean field364 = true;

    @OriginalMember(owner = "mapview!t", name = "r", descriptor = "Lu;")
    public static class32 field363;

    @OriginalMember(owner = "mapview!t", name = "n", descriptor = "[[B")
    public static byte[][] field359;

    @OriginalMember(owner = "mapview!t", name = "a", descriptor = "(IIBLka;)[Lk;", line = 28)
    public static final class19[] method195(int arg0, int arg1, byte arg2, class20 arg3) {
        if (arg2 != -105) {
            field361 = null;
        }
        return class30.method193(arg1, (byte) 123, arg3, arg0) ? class14.method48(-99) : null;
    }

    @OriginalMember(owner = "mapview!t", name = "a", descriptor = "(B)V", line = 68)
    public static void method196(byte arg0) {
        field362 = null;
        field363 = null;
        field359 = null;
        field361 = null;
        if (arg0 > -39) {
            field360 = null;
        }
        field358 = null;
        field360 = null;
    }

    @OriginalMember(owner = "mapview!t", name = "a", descriptor = "(Lka;BLl;Ll;)Lga;", line = 84)
    public static final class12 method197(class20 arg0, byte arg1, class21 arg2, class21 arg3) {
        int var4 = arg0.method92((byte) 4, arg2);
        if (arg1 >= -75) {
            method196((byte) -90);
        }
        int var5 = arg0.method94(arg3, var4, -467);
        return mapview.method143(var4, arg0, (byte) 126, var5);
    }

    @OriginalMember(owner = "mapview!t", name = "a", descriptor = "(Ljava/awt/event/KeyEvent;Z)I", line = 98)
    public static final int method198(KeyEvent arg0, boolean arg1) {
        if (arg1) {
            field358 = null;
        }
        int var2 = arg0.getKeyChar();
        if (var2 <= 0 || var2 >= 256) {
            var2 = -1;
        }
        return var2;
    }
}
