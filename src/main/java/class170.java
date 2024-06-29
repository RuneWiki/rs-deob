import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public class class170 extends class270 {

    @OriginalMember(owner = "client!c", name = "p", descriptor = "Ltq;")
    public static class572 field2033 = new class572(8);

    @OriginalMember(owner = "client!c", name = "v", descriptor = "[I")
    public static int[] field2039 = new int[256];

    @OriginalMember(owner = "client!c", name = "w", descriptor = "Lpr;")
    public static class407 field2040 = new class407(112, 9);

    @OriginalMember(owner = "client!c", name = "B", descriptor = "[[I")
    public static int[][] field2045 = new int[6][];

    @OriginalMember(owner = "client!c", name = "A", descriptor = "Lvw;")
    public static class274 field2044 = new class274();

    @OriginalMember(owner = "client!c", name = "C", descriptor = "Z")
    public static boolean field2046 = false;

    @OriginalMember(owner = "client!c", name = "r", descriptor = "I")
    public static int field2035;

    @OriginalMember(owner = "client!c", name = "u", descriptor = "I")
    public int field2038;

    @OriginalMember(owner = "client!c", name = "x", descriptor = "I")
    public static int field2041;

    @OriginalMember(owner = "client!c", name = "y", descriptor = "I")
    public int field2042;

    @OriginalMember(owner = "client!c", name = "z", descriptor = "Lqi;")
    public static class518 field2043;

    @OriginalMember(owner = "client!c", name = "m", descriptor = "[I")
    public int[] field2030;

    @OriginalMember(owner = "client!c", name = "s", descriptor = "[I")
    public int[] field2036;

    @OriginalMember(owner = "client!c", name = "t", descriptor = "[I")
    public int[] field2037;

    @OriginalMember(owner = "client!c", name = "n", descriptor = "[Lsba;")
    public class199[] field2031;

    @OriginalMember(owner = "client!c", name = "o", descriptor = "[Lsba;")
    public class199[] field2032;

    @OriginalMember(owner = "client!c", name = "q", descriptor = "[[[B")
    public byte[][][] field2034;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(BII)Z")
    public static final boolean method1013(byte arg0, int arg1, int arg2) {
        field2035++;
        if (arg0 > -120) {
            field2033 = null;
        }
        return (arg1 & 0x84080) != 0;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(I)V")
    public static void method1014(int arg0) {
        field2043 = null;
        field2044 = null;
        field2040 = null;
        if (arg0 != 9) {
            field2046 = true;
        }
        field2033 = null;
        field2039 = null;
        field2045 = null;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(ILep;)V")
    public static final void method1015(int arg0, class382 arg1) {
        field2041++;
        if (arg0 != 0) {
            method1013((byte) -85, -44, 112);
        }
        if (arg1.field5112 == 5 && arg1.field5110 != -1) {
            class162.method978(class453.field6284, arg1, false);
        }
    }
}
