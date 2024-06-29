import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!qa")
public class class32 {

    @OriginalMember(owner = "mapview!qa", name = "b", descriptor = "I")
    public static int field419 = -1;

    @OriginalMember(owner = "mapview!qa", name = "h", descriptor = "Lna;")
    public static class26 field425 = class30.method205((byte) 106, "Sandpit");

    @OriginalMember(owner = "mapview!qa", name = "d", descriptor = "Lna;")
    public static class26 field421 = class30.method205((byte) 17, "mapfunction");

    @OriginalMember(owner = "mapview!qa", name = "k", descriptor = "Lna;")
    public static class26 field428 = class30.method205((byte) 36, "Makeover Mage");

    @OriginalMember(owner = "mapview!qa", name = "j", descriptor = "[J")
    public static long[] field427 = new long[32];

    @OriginalMember(owner = "mapview!qa", name = "l", descriptor = "Lna;")
    public static class26 field429 = class30.method205((byte) 89, "Candle Shop");

    @OriginalMember(owner = "mapview!qa", name = "i", descriptor = "Lna;")
    public static class26 field426 = class30.method205((byte) 23, "map");

    @OriginalMember(owner = "mapview!qa", name = "g", descriptor = "I")
    public static volatile int field424 = -1;

    @OriginalMember(owner = "mapview!qa", name = "c", descriptor = "Lna;")
    public static class26 field420 = class30.method205((byte) 98, "Pub)4Bar");

    @OriginalMember(owner = "mapview!qa", name = "e", descriptor = "I")
    public static int field422;

    @OriginalMember(owner = "mapview!qa", name = "m", descriptor = "I")
    public static int field430;

    @OriginalMember(owner = "mapview!qa", name = "f", descriptor = "Lg;")
    public static class12 field423;

    @OriginalMember(owner = "mapview!qa", name = "a", descriptor = "Lv;")
    public static class40 field418;

    @OriginalMember(owner = "mapview!qa", name = "a", descriptor = "(ZLjava/awt/Component;)V", line = 5)
    public static final void method212(boolean arg0, Component arg1) {
        arg1.removeMouseListener(class25.field342);
        arg1.removeMouseMotionListener(class25.field342);
        arg1.removeFocusListener(class25.field342);
        if (arg0) {
            method213(48, 40);
        }
        class31.field414 = 0;
    }

    @OriginalMember(owner = "mapview!qa", name = "a", descriptor = "(II)[B", line = 23)
    public static final synchronized byte[] method213(int arg0, int arg1) {
        if (arg1 == 100 && class5.field143 > 0) {
            byte[] var2 = class3.field108[--class5.field143];
            class3.field108[class5.field143] = null;
            return var2;
        } else if (arg1 == 5000 && class12.field183 > 0) {
            byte[] var3 = class20.field261[--class12.field183];
            class20.field261[class12.field183] = null;
            return var3;
        } else if (arg1 == 30000 && mapview.field48 > 0) {
            byte[] var4 = class20.field253[--mapview.field48];
            class20.field253[mapview.field48] = null;
            return var4;
        } else {
            if (arg0 != -1631) {
                field418 = null;
            }
            return new byte[arg1];
        }
    }

    @OriginalMember(owner = "mapview!qa", name = "a", descriptor = "(Z)V", line = 63)
    public static void method214(boolean arg0) {
        if (!arg0) {
            field423 = null;
        }
        field425 = null;
        field423 = null;
        field427 = null;
        field426 = null;
        field428 = null;
        field420 = null;
        field429 = null;
        field421 = null;
        field418 = null;
    }
}
