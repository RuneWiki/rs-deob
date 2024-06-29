import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public class class25 {

    @OriginalMember(owner = "client!ha", name = "j", descriptor = "I")
    public static int field278 = 0;

    @OriginalMember(owner = "client!ha", name = "k", descriptor = "I")
    public static int field279 = 2;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "I")
    public static int field269;

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "I")
    public static int field270;

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "I")
    public static int field271;

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "I")
    public int field272;

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "I")
    public static int field274;

    @OriginalMember(owner = "client!ha", name = "g", descriptor = "I")
    public int field275;

    @OriginalMember(owner = "client!ha", name = "h", descriptor = "I")
    public static int field276;

    @OriginalMember(owner = "client!ha", name = "i", descriptor = "I")
    public static int field277;

    @OriginalMember(owner = "client!ha", name = "l", descriptor = "I")
    public int field280;

    @OriginalMember(owner = "client!ha", name = "m", descriptor = "I")
    public int field281;

    @OriginalMember(owner = "client!ha", name = "n", descriptor = "I")
    public int field282;

    @OriginalMember(owner = "client!ha", name = "p", descriptor = "I")
    public int field284;

    @OriginalMember(owner = "client!ha", name = "q", descriptor = "I")
    public int field285;

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "[B")
    public byte[] field273;

    @OriginalMember(owner = "client!ha", name = "o", descriptor = "[B")
    public byte[] field283;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(I)V")
    public static final void method166(int arg0) {
        class43.field566.method1420((byte) 112);
        if (arg0 >= 60) {
            field277++;
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(II)Lth;")
    public static final class247 method167(int arg0, int arg1) {
        class247 var2 = (class247) class222.field3251.method2099((byte) 125, (long) arg0);
        field270++;
        if (var2 != null) {
            return var2;
        }
        if (arg1 >= -52) {
            field278 = 40;
        }
        byte[] var3 = class20.field211.method1868(0, arg0, 1);
        if (var3 == null || var3.length <= 1) {
            return null;
        } else {
            class247 var4 = class269.method1856(var3, -21497);
            class222.field3251.method2103(var4, -1, (long) arg0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(B)V")
    public static final void method168(byte arg0) {
        Container var1;
        if (class268.field4312 != null) {
            var1 = class268.field4312;
        } else if (class195.field2881 == null) {
            var1 = class273.field4426.field2020;
        } else {
            var1 = class195.field2881;
        }
        field269++;
        class123.field2039 = var1.getSize().width;
        class40.field536 = var1.getSize().height;
        if (class195.field2881 == var1) {
            Insets var2 = class195.field2881.getInsets();
            class40.field536 -= var2.top + var2.bottom;
            class123.field2039 -= var2.right + var2.left;
        }
        if (class227.method1570(53) >= 2) {
            class305.field4931 = 0;
            class137.field2230 = class40.field536;
            class179.field2677 = class123.field2039;
            class169.field2571 = 0;
        } else {
            class179.field2677 = 765;
            class137.field2230 = 503;
            class305.field4931 = 0;
            class169.field2571 = (class123.field2039 - 765) / 2;
        }
        class12.field136.setSize(class179.field2677, class137.field2230);
        if (class195.field2881 == var1) {
            Insets var3 = class195.field2881.getInsets();
            class12.field136.setLocation(var3.left + class169.field2571, class305.field4931 + var3.top);
        } else {
            class12.field136.setLocation(class169.field2571, class305.field4931);
        }
        if (class1.field17 != -1) {
            class110.method840(0, true);
        }
        if (arg0 != 114) {
            method168((byte) 111);
        }
        class264.method1821(-1);
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IZ)Lfa;")
    public static final class92 method169(int arg0, boolean arg1) {
        field276++;
        class92 var2 = (class92) class82.field1320.method2099((byte) 125, (long) arg0);
        if (arg1) {
            method169(-122, false);
        }
        if (var2 != null) {
            return var2;
        }
        byte[] var3;
        if (arg0 < 32768) {
            var3 = class253.field3809.method1868(arg0, 1, 1);
        } else {
            var3 = class125.field2119.method1868(arg0 & 0x7FFF, 1, 1);
        }
        class92 var4 = new class92();
        if (var3 != null) {
            var4.method701(new class53(var3), 127);
        }
        if (arg0 >= 32768) {
            var4.method691(-110);
        }
        class82.field1320.method2103(var4, -1, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(II)I")
    public static final int method170(int arg0, int arg1) {
        if (arg0 != 31910) {
            method168((byte) 110);
        }
        field274++;
        return arg1 & 0x3FF;
    }
}
