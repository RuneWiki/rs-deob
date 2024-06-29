import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!r")
public class class32 extends class29 {

    @OriginalMember(owner = "mapview!r", name = "n", descriptor = "Lv;")
    public static class40 field441 = class24.method170("Please wait)3)3)3 Rendering Map", (byte) -74);

    @OriginalMember(owner = "mapview!r", name = "l", descriptor = "Lv;")
    public static class40 field439 = class24.method170("Cookery Shop", (byte) -71);

    @OriginalMember(owner = "mapview!r", name = "k", descriptor = "Lv;")
    public static class40 field438 = class24.method170("map", (byte) 118);

    @OriginalMember(owner = "mapview!r", name = "p", descriptor = "Lv;")
    public static class40 field443 = class24.method170("Enter place name to find", (byte) 78);

    @OriginalMember(owner = "mapview!r", name = "r", descriptor = "Lv;")
    public static class40 field445 = class24.method170("Transportation", (byte) 98);

    @OriginalMember(owner = "mapview!r", name = "s", descriptor = "J")
    public static long field446 = 0L;

    @OriginalMember(owner = "mapview!r", name = "m", descriptor = "I")
    public static int field440;

    @OriginalMember(owner = "mapview!r", name = "o", descriptor = "Lma;")
    public static class23 field442;

    @OriginalMember(owner = "mapview!r", name = "j", descriptor = "Lv;")
    public class40 field437;

    @OriginalMember(owner = "mapview!r", name = "q", descriptor = "[I")
    public static int[] field444;

    @OriginalMember(owner = "mapview!r", name = "c", descriptor = "(B)V", line = 4)
    public static final void method201(byte arg0) {
        if (arg0 < 106) {
            method203(5);
        }
        if (class17.field176.toLowerCase().indexOf("microsoft") != -1) {
            class25.field373[187] = 27;
            class25.field373[190] = 72;
            class25.field373[186] = 57;
            class25.field373[188] = 71;
            class25.field373[223] = 28;
            class25.field373[222] = 59;
            class25.field373[191] = 73;
            class25.field373[220] = 74;
            class25.field373[219] = 42;
            class25.field373[189] = 26;
            class25.field373[221] = 43;
            class25.field373[192] = 58;
            return;
        }
        class25.field373[61] = 27;
        class25.field373[59] = 57;
        class25.field373[93] = 43;
        class25.field373[46] = 72;
        class25.field373[91] = 42;
        class25.field373[44] = 71;
        if (class17.field180 == null) {
            class25.field373[222] = 59;
            class25.field373[192] = 58;
        } else {
            class25.field373[520] = 59;
            class25.field373[192] = 28;
            class25.field373[222] = 58;
        }
        class25.field373[92] = 74;
        class25.field373[45] = 26;
        class25.field373[47] = 73;
    }

    @OriginalMember(owner = "mapview!r", name = "d", descriptor = "(B)Lda;", line = 63)
    public static final class8 method202(byte arg0) {
        try {
            int var1 = -95 % ((arg0 + 84) / 42);
            return (class8) Class.forName("h").getDeclaredConstructor().newInstance();
        } catch (Throwable var3) {
            return new class16();
        }
    }

    @OriginalMember(owner = "mapview!r", name = "b", descriptor = "(I)V", line = 86)
    public static void method203(int arg0) {
        field438 = null;
        field442 = null;
        field443 = null;
        if (arg0 != -3038) {
            field440 = -116;
        }
        field441 = null;
        field444 = null;
        field445 = null;
        field439 = null;
    }

    @OriginalMember(owner = "mapview!r", name = "e", descriptor = "(B)V", line = 123)
    public static final void method204(byte arg0) {
        if (++class12.field125 >= 64) {
            class40.field514++;
            class12.field125 = 0;
            if (class25.field377 >> 6 > class40.field514) {
                mapview.method150(13);
            }
        }
        if (arg0 >= -92) {
            method203(-96);
        }
        class20.field213 = (class12.field125 << 6) + class8.field107;
    }
}
