import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class120 {

    @OriginalMember(owner = "client!uc", name = "d", descriptor = "Lhb;")
    public static class44 field2926 = class102.method810("Passwort: ", -28606);

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "[Lhb;")
    public static class44[] field2924 = new class44[100];

    @OriginalMember(owner = "client!uc", name = "l", descriptor = "Lhb;")
    public static class44 field2934 = class102.method810("::errortest", -28606);

    @OriginalMember(owner = "client!uc", name = "m", descriptor = "Lhb;")
    private static class44 field2935 = class102.method810("green:", -28606);

    @OriginalMember(owner = "client!uc", name = "o", descriptor = "Lhb;")
    public static class44 field2937 = field2935;

    @OriginalMember(owner = "client!uc", name = "g", descriptor = "Lhb;")
    public static class44 field2929 = class102.method810("Hier klicken)1 um fortzufahren)3)3)3", -28606);

    @OriginalMember(owner = "client!uc", name = "v", descriptor = "Lhb;")
    private static class44 field2944 = class102.method810("wishes to trade with you)3", -28606);

    @OriginalMember(owner = "client!uc", name = "u", descriptor = "Lhb;")
    public static class44 field2943 = class102.method810(" ", -28606);

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "Lhb;")
    public static class44 field2923 = field2944;

    @OriginalMember(owner = "client!uc", name = "x", descriptor = "[I")
    public static int[] field2946 = new int[500];

    @OriginalMember(owner = "client!uc", name = "w", descriptor = "Lhb;")
    public static class44 field2945 = class102.method810("@lre@", -28606);

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "I")
    public static int field2925;

    @OriginalMember(owner = "client!uc", name = "e", descriptor = "I")
    public static int field2927;

    @OriginalMember(owner = "client!uc", name = "f", descriptor = "I")
    public static int field2928;

    @OriginalMember(owner = "client!uc", name = "h", descriptor = "I")
    public static int field2930;

    @OriginalMember(owner = "client!uc", name = "j", descriptor = "I")
    public int field2932;

    @OriginalMember(owner = "client!uc", name = "k", descriptor = "I")
    public static int field2933;

    @OriginalMember(owner = "client!uc", name = "n", descriptor = "I")
    public static int field2936;

    @OriginalMember(owner = "client!uc", name = "p", descriptor = "I")
    public int field2938;

    @OriginalMember(owner = "client!uc", name = "q", descriptor = "I")
    public static int field2939;

    @OriginalMember(owner = "client!uc", name = "r", descriptor = "I")
    public int field2940;

    @OriginalMember(owner = "client!uc", name = "s", descriptor = "I")
    public static int field2941;

    @OriginalMember(owner = "client!uc", name = "t", descriptor = "I")
    public int field2942;

    @OriginalMember(owner = "client!uc", name = "y", descriptor = "I")
    public static int field2947;

    @OriginalMember(owner = "client!uc", name = "i", descriptor = "Lne;")
    public static class83 field2931;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(I)V", line = 8)
    public static void method925(int arg0) {
        field2937 = null;
        field2935 = null;
        field2934 = null;
        field2943 = null;
        if (arg0 != -467) {
            return;
        }
        field2924 = null;
        field2931 = null;
        field2929 = null;
        field2944 = null;
        field2926 = null;
        field2923 = null;
        field2946 = null;
        field2945 = null;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IIZII)I", line = 51)
    public static final int method926(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        int var5 = 65536 - class58.field1518[arg4 * 1024 / arg3] >> 1;
        field2925++;
        return arg2 ? 30 : ((65536 - var5) * arg0 >> 16) + (arg1 * var5 >> 16);
    }

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "(I)V", line = 65)
    public static final void method927(int arg0) {
        if (arg0 != -8053) {
            return;
        }
        class66.field1650.method335((byte) 29);
        field2928++;
        class13.field243.method335((byte) -128);
        class72.field1785.method335((byte) -123);
        class89.field2258.method335((byte) 13);
    }

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "(I)V", line = 86)
    public static final void method928(int arg0) {
        field2933++;
        if (arg0 >= -4 || class128.field3074 != 1) {
            return;
        }
        if (class57.field1508 >= 539 && class57.field1508 <= 573 && class40.field902 >= 169 && class40.field902 < 205 && class107.field2728[0] != -1) {
            class88.field2251 = true;
            class39.field873 = 0;
            class101.field2572 = true;
        }
        if (class57.field1508 >= 569 && class57.field1508 <= 599 && class40.field902 >= 168 && class40.field902 < 205 && class107.field2728[1] != -1) {
            class39.field873 = 1;
            class101.field2572 = true;
            class88.field2251 = true;
        }
        if (class57.field1508 >= 597 && class57.field1508 <= 627 && class40.field902 >= 168 && class40.field902 < 205 && class107.field2728[2] != -1) {
            class39.field873 = 2;
            class88.field2251 = true;
            class101.field2572 = true;
        }
        if (class57.field1508 >= 625 && class57.field1508 <= 669 && class40.field902 >= 168 && class40.field902 < 203 && class107.field2728[3] != -1) {
            class88.field2251 = true;
            class39.field873 = 3;
            class101.field2572 = true;
        }
        if (class57.field1508 >= 666 && class57.field1508 <= 696 && class40.field902 >= 168 && class40.field902 < 205 && class107.field2728[4] != -1) {
            class39.field873 = 4;
            class101.field2572 = true;
            class88.field2251 = true;
        }
        if (class57.field1508 >= 694 && class57.field1508 <= 724 && class40.field902 >= 168 && class40.field902 < 205 && class107.field2728[5] != -1) {
            class88.field2251 = true;
            class39.field873 = 5;
            class101.field2572 = true;
        }
        if (class57.field1508 >= 722 && class57.field1508 <= 756 && class40.field902 >= 169 && class40.field902 < 205 && class107.field2728[6] != -1) {
            class39.field873 = 6;
            class101.field2572 = true;
            class88.field2251 = true;
        }
        if (class57.field1508 >= 540 && class57.field1508 <= 574 && class40.field902 >= 466 && class40.field902 < 502 && class107.field2728[7] != -1) {
            class88.field2251 = true;
            class101.field2572 = true;
            class39.field873 = 7;
        }
        if (class57.field1508 >= 572 && class57.field1508 <= 602 && class40.field902 >= 466 && class40.field902 < 503 && class107.field2728[8] != -1) {
            class101.field2572 = true;
            class39.field873 = 8;
            class88.field2251 = true;
        }
        if (class57.field1508 >= 599 && class57.field1508 <= 629 && class40.field902 >= 466 && class40.field902 < 503 && class107.field2728[9] != -1) {
            class39.field873 = 9;
            class101.field2572 = true;
            class88.field2251 = true;
        }
        if (class57.field1508 >= 627 && class57.field1508 <= 671 && class40.field902 >= 467 && class40.field902 < 502 && class107.field2728[10] != -1) {
            class101.field2572 = true;
            class88.field2251 = true;
            class39.field873 = 10;
        }
        if (class57.field1508 >= 669 && class57.field1508 <= 699 && class40.field902 >= 466 && class40.field902 < 503 && class107.field2728[11] != -1) {
            class88.field2251 = true;
            class39.field873 = 11;
            class101.field2572 = true;
        }
        if (class57.field1508 >= 696 && class57.field1508 <= 726 && class40.field902 >= 466 && class40.field902 < 503 && class107.field2728[12] != -1) {
            class88.field2251 = true;
            class101.field2572 = true;
            class39.field873 = 12;
        }
        if (class57.field1508 >= 724 && class57.field1508 <= 758 && class40.field902 >= 466 && class40.field902 < 502 && class107.field2728[13] != -1) {
            class88.field2251 = true;
            class39.field873 = 13;
            class101.field2572 = true;
            return;
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Z)V", line = 251)
    public static final void method929(boolean arg0) {
        if (!arg0) {
            field2929 = null;
        }
        class51.field1256.method335((byte) -125);
        field2930++;
    }
}
