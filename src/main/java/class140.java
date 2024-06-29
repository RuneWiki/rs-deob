import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class140 {

    @OriginalMember(owner = "client!cf", name = "d", descriptor = "I")
    public static int field2088 = -1;

    @OriginalMember(owner = "client!cf", name = "g", descriptor = "Ljava/lang/String;")
    public static String field2091 = "white:";

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "I")
    public static int field2086 = 0;

    @OriginalMember(owner = "client!cf", name = "i", descriptor = "[[S")
    public static short[][] field2093 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!cf", name = "f", descriptor = "I")
    public static int field2090 = 1;

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "I")
    public static int field2087;

    @OriginalMember(owner = "client!cf", name = "e", descriptor = "I")
    public static int field2089;

    @OriginalMember(owner = "client!cf", name = "h", descriptor = "I")
    public static int field2092;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "J")
    public static long field2085;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(II)V", line = 12)
    public static final void method937(int arg0, int arg1) {
        field2089++;
        if (arg1 != 24509) {
            method938(-13, -60);
        }
        class179 var2 = class319.method2220(arg0, (byte) -118, 6);
        var2.method1239(true);
    }

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "(II)Lkh;", line = 34)
    public static final class16 method938(int arg0, int arg1) {
        if (arg0 != 8) {
            return (class16) null;
        }
        field2087++;
        if (arg1 == 0) {
            return new class241();
        } else if (arg1 == 1) {
            return new class38();
        } else if (arg1 == 2) {
            return new class174();
        } else if (arg1 == 3) {
            return new class148();
        } else if (arg1 == 4) {
            return new class155();
        } else if (arg1 == 5) {
            return new class284();
        } else if (arg1 == 6) {
            return new class204();
        } else if (arg1 == 7) {
            return new class198();
        } else if (arg1 == 8) {
            return new class154();
        } else if (arg1 == 9) {
            return new class289();
        } else if (arg1 == 10) {
            return new class97();
        } else if (arg1 == 11) {
            return new class37();
        } else if (arg1 == 12) {
            return new class314();
        } else if (arg1 == 13) {
            return new class214();
        } else if (arg1 == 14) {
            return new class94();
        } else if (arg1 == 15) {
            return new class302();
        } else if (arg1 == 16) {
            return new class313();
        } else if (arg1 == 17) {
            return new class142();
        } else if (arg1 == 18) {
            return new class193();
        } else if (arg1 == 19) {
            return new class9();
        } else if (arg1 == 20) {
            return new class250();
        } else if (arg1 == 21) {
            return new class8();
        } else if (arg1 == 22) {
            return new class158();
        } else if (arg1 == 23) {
            return new class162();
        } else if (arg1 == 24) {
            return new class2();
        } else if (arg1 == 25) {
            return new class107();
        } else if (arg1 == 26) {
            return new class63();
        } else if (arg1 == 27) {
            return new class58();
        } else if (arg1 == 28) {
            return new class28();
        } else if (arg1 == 29) {
            return new class113();
        } else if (arg1 == 30) {
            return new class139();
        } else if (arg1 == 31) {
            return new class27();
        } else if (arg1 == 32) {
            return new class189();
        } else if (arg1 == 33) {
            return new class112();
        } else if (arg1 == 34) {
            return new class77();
        } else if (arg1 == 35) {
            return new class299();
        } else if (arg1 == 36) {
            return new class309();
        } else if (arg1 == 37) {
            return new class86();
        } else if (arg1 == 38) {
            return new class13();
        } else if (arg1 == 39) {
            return new class12();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(B)V", line = 379)
    public static void method939(byte arg0) {
        field2091 = null;
        field2093 = (short[][]) null;
        int var1 = -90 % ((-arg0 - 53) / 62);
    }
}
