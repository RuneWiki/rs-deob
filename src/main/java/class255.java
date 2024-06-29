import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aaa")
public class class255 extends class454 {

    @OriginalMember(owner = "client!aaa", name = "E", descriptor = "[B")
    public byte[] field3650;

    @OriginalMember(owner = "client!aaa", name = "A", descriptor = "I")
    public static int field3646 = 4;

    @OriginalMember(owner = "client!aaa", name = "B", descriptor = "I")
    public static int field3647;

    @OriginalMember(owner = "client!aaa", name = "C", descriptor = "I")
    public static int field3648;

    @OriginalMember(owner = "client!aaa", name = "D", descriptor = "I")
    public static int field3649;

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "(BZII)V")
    public static final void method1679(byte arg0, boolean arg1, int arg2, int arg3) {
        field3649++;
        if (arg3 < 8000 || arg3 > 48000) {
            throw new IllegalArgumentException();
        }
        if (arg0 >= -108) {
            method1681('\u0019', -45, 83);
        }
        class702.field9843 = arg3;
        class619.field8755 = arg2;
        class209.field3076 = arg1;
    }

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "(Z)I")
    public static final int method1680(boolean arg0) {
        field3647++;
        if (!arg0) {
            method1679((byte) -88, true, -50, -71);
        }
        return 16;
    }

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "(CII)C")
    public static final char method1681(char arg0, int arg1, int arg2) {
        field3648++;
        if (arg0 >= 'À' && arg0 <= 'ÿ') {
            if (arg0 >= 'À' && arg0 <= 'Æ') {
                return 'A';
            }
            if (arg0 == 'Ç') {
                return 'C';
            }
            if (arg0 >= 'È' && arg0 <= 'Ë') {
                return 'E';
            }
            if (arg0 >= 'Ì' && arg0 <= 'Ï') {
                return 'I';
            }
            if (arg0 >= 'Ò' && arg0 <= 'Ö') {
                return 'O';
            }
            if (arg0 >= 'Ù' && arg0 <= 'Ü') {
                return 'U';
            }
            if (arg0 == 'Ý') {
                return 'Y';
            }
            if (arg0 == 'ß') {
                return 's';
            }
            if (arg0 >= 'à' && arg0 <= 'æ') {
                return 'a';
            }
            if (arg0 == 'ç') {
                return 'c';
            }
            if (arg0 >= 'è' && arg0 <= 'ë') {
                return 'e';
            }
            if (arg0 >= 'ì' && arg0 <= 'ï') {
                return 'i';
            }
            if (arg0 >= 'ò' && arg0 <= 'ö') {
                return 'o';
            }
            if (arg0 >= 'ù' && arg0 <= 'ü') {
                return 'u';
            }
            if (arg0 == 'ý' || arg0 == 'ÿ') {
                return 'y';
            }
        }
        if (arg0 == 'Œ') {
            return 'O';
        }
        if (arg2 != 79) {
            field3646 = 59;
        }
        if (arg0 == 'œ') {
            return 'o';
        } else if (arg0 == 'Ÿ') {
            return 'Y';
        } else {
            return arg0;
        }
    }

    @OriginalMember(owner = "client!aaa", name = "<init>", descriptor = "([B)V")
    public class255(byte[] arg0) {
        this.field3650 = arg0;
    }
}
