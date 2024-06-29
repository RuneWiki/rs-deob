import java.awt.event.KeyEvent;
import java.io.DataInputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!pa")
public class class31 {

    @OriginalMember(owner = "mapview!pa", name = "a", descriptor = "Lba;")
    public static class4 field389 = class14.method105((byte) -68, "Loading ");

    @OriginalMember(owner = "mapview!pa", name = "i", descriptor = "Lba;")
    private static class4 field397 = class14.method105((byte) -121, "Jewellery");

    @OriginalMember(owner = "mapview!pa", name = "b", descriptor = "I")
    public static int field390 = 20;

    @OriginalMember(owner = "mapview!pa", name = "c", descriptor = "[[B")
    public static byte[][] field391 = new byte[50][];

    @OriginalMember(owner = "mapview!pa", name = "g", descriptor = "Lba;")
    private static class4 field395 = class14.method105((byte) -96, "Agility Training");

    @OriginalMember(owner = "mapview!pa", name = "m", descriptor = "Lba;")
    private static class4 field401 = class14.method105((byte) -82, "Water Source");

    @OriginalMember(owner = "mapview!pa", name = "n", descriptor = "Lba;")
    public static class4 field402 = class14.method105((byte) -84, "details)3dat");

    @OriginalMember(owner = "mapview!pa", name = "d", descriptor = "I")
    public static int field392;

    @OriginalMember(owner = "mapview!pa", name = "h", descriptor = "I")
    public static int field396;

    @OriginalMember(owner = "mapview!pa", name = "j", descriptor = "I")
    public static int field398;

    @OriginalMember(owner = "mapview!pa", name = "k", descriptor = "J")
    public static long field399;

    @OriginalMember(owner = "mapview!pa", name = "o", descriptor = "Ljava/io/DataInputStream;")
    public static DataInputStream field403;

    @OriginalMember(owner = "mapview!pa", name = "l", descriptor = "[B")
    public static byte[] field400;

    @OriginalMember(owner = "mapview!pa", name = "f", descriptor = "[Lu;")
    public static class36[] field394;

    @OriginalMember(owner = "mapview!pa", name = "e", descriptor = "[[Loa;")
    public static class29[][] field393;

    @OriginalMember(owner = "mapview!pa", name = "a", descriptor = "(Z)V", line = 4)
    public static void method188(boolean arg0) {
        field389 = null;
        field400 = null;
        field393 = null;
        field395 = null;
        field402 = null;
        field391 = null;
        if (!arg0) {
            method191((byte) -93);
        }
        field401 = null;
        field397 = null;
        field394 = null;
        field403 = null;
    }

    @OriginalMember(owner = "mapview!pa", name = "a", descriptor = "(Ljava/awt/event/KeyEvent;B)I", line = 35)
    public static final int method189(KeyEvent arg0, byte arg1) {
        if (arg1 <= 1) {
            method189(null, (byte) -11);
        }
        int var2 = arg0.getKeyChar();
        if (var2 <= 0 || var2 >= 256) {
            var2 = -1;
        }
        return var2;
    }

    @OriginalMember(owner = "mapview!pa", name = "a", descriptor = "(I)[Lba;", line = 66)
    public static final class4[] method190(int arg0) {
        if (arg0 != -30661) {
            method193(true);
        }
        return new class4[] { class24.field293, class22.field264, class20.field231, class14.field187, class27.field316, class29.field373, class35.field446, class16.field209, class24.field292, class22.field276, class12.field171, class1.field72, class32.field407, class5.field94, class5.field102, class22.field265, class22.field280, class17.field213, class34.field428, class4.field81, class29.field364, field397, class20.field234, class35.field438, class22.field269, class17.field217, class16.field207, class32.field414, mapview.field16, class16.field204, class22.field279, class27.field319, class35.field439, class28.field343, class26.field309, class30.field382, class34.field422, class12.field175, class10.field158, field401, class3.field80, class24.field290, class30.field385, class5.field91, class20.field238, class30.field377, class34.field427, class1.field69, class30.field387, field395, class15.field200, class28.field325, class32.field408, class29.field361, mapview.field32, class4.field87, class13.field176, class17.field214, class30.field380, class12.field174, class26.field304, class10.field160, class27.field320, class27.field320, class27.field320, class27.field320, class27.field320, class22.field278, class27.field315, class27.field320, class16.field206 };
    }

    @OriginalMember(owner = "mapview!pa", name = "a", descriptor = "(B)Lm;", line = 78)
    public static final class24 method191(byte arg0) {
        if (arg0 <= 18) {
            return (class24) null;
        }
        try {
            return (class24) Class.forName("ja").getDeclaredConstructor().newInstance();
        } catch (Throwable var2) {
            return new class30();
        }
    }

    @OriginalMember(owner = "mapview!pa", name = "b", descriptor = "(B)V", line = 92)
    public static final void method192(byte arg0) {
        if (arg0 < 19) {
            return;
        }
        if (class8.field146.toLowerCase().indexOf("microsoft") != -1) {
            class20.field225[186] = 57;
            class20.field225[187] = 27;
            class20.field225[188] = 71;
            class20.field225[189] = 26;
            class20.field225[190] = 72;
            class20.field225[191] = 73;
            class20.field225[192] = 58;
            class20.field225[219] = 42;
            class20.field225[220] = 74;
            class20.field225[221] = 43;
            class20.field225[222] = 59;
            class20.field225[223] = 28;
            return;
        }
        class20.field225[44] = 71;
        class20.field225[45] = 26;
        class20.field225[46] = 72;
        class20.field225[47] = 73;
        class20.field225[59] = 57;
        class20.field225[61] = 27;
        class20.field225[91] = 42;
        class20.field225[92] = 74;
        class20.field225[93] = 43;
        if (class8.field144 == null) {
            class20.field225[192] = 58;
            class20.field225[222] = 59;
        } else {
            class20.field225[192] = 28;
            class20.field225[222] = 58;
            class20.field225[520] = 59;
        }
    }

    @OriginalMember(owner = "mapview!pa", name = "b", descriptor = "(Z)B", line = 187)
    public static final byte method193(boolean arg0) {
        if (!arg0) {
            method192((byte) 57);
        }
        return class27.field314 == null ? 0 : class27.field314[class12.field172];
    }

    @OriginalMember(owner = "mapview!pa", name = "a", descriptor = "(IBIBI)V", line = 204)
    public static final void method194(int arg0, byte arg1, int arg2, byte arg3, int arg4) {
        int var5 = arg4 >> 6;
        if (arg3 <= 17) {
            method194(-98, (byte) 95, -38, (byte) 122, 37);
        }
        int var6 = arg0 >> 6;
        if (class13.field180[arg2][var6][var5] == null) {
            class13.field180[arg2][var6][var5] = new byte[4096];
        }
        class13.field180[arg2][var6][var5][class3.method25(arg4, 63) + class3.method25(arg0 << 6, 4032)] = arg1;
    }
}
