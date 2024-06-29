import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class204 {

    @OriginalMember(owner = "client!od", name = "a", descriptor = "[S")
    public static short[] field3009 = new short[500];

    @OriginalMember(owner = "client!od", name = "h", descriptor = "[J")
    public static long[] field3016 = new long[1000];

    @OriginalMember(owner = "client!od", name = "i", descriptor = "I")
    public static int field3017 = 0;

    @OriginalMember(owner = "client!od", name = "e", descriptor = "Ljava/lang/String;")
    public static String field3013 = "You can't add yourself to your own friend list.";

    @OriginalMember(owner = "client!od", name = "b", descriptor = "I")
    public static int field3010;

    @OriginalMember(owner = "client!od", name = "d", descriptor = "I")
    public static int field3012;

    @OriginalMember(owner = "client!od", name = "g", descriptor = "I")
    public static int field3015;

    @OriginalMember(owner = "client!od", name = "c", descriptor = "Llc;")
    public static class270 field3011;

    @OriginalMember(owner = "client!od", name = "f", descriptor = "[[B")
    public static byte[][] field3014;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(ILch;)V")
    public static final void method1444(int arg0, class188 arg1) {
        class300.field4848 = arg1;
        if (arg0 != -10074) {
            method1446((byte) -104);
        }
        field3010++;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(CI)B")
    public static final byte method1445(char arg0, int arg1) {
        field3015++;
        byte var2;
        if (!(arg0 <= '\u0000' || arg0 >= '\u0080') || !(arg0 < ' ' || arg0 > 'ÿ')) {
            var2 = (byte) arg0;
        } else if (arg0 == '€') {
            var2 = -128;
        } else if (arg0 == '‚') {
            var2 = -126;
        } else if (arg0 == 'ƒ') {
            var2 = -125;
        } else if (arg0 == '„') {
            var2 = -124;
        } else if (arg0 == '…') {
            var2 = -123;
        } else if (arg0 == '†') {
            var2 = -122;
        } else if (arg0 == '‡') {
            var2 = -121;
        } else if (arg0 == 'ˆ') {
            var2 = -120;
        } else if (arg0 == '‰') {
            var2 = -119;
        } else if (arg0 == 'Š') {
            var2 = -118;
        } else if (arg0 == '‹') {
            var2 = -117;
        } else if (arg0 == 'Œ') {
            var2 = -116;
        } else if (arg0 == 'Ž') {
            var2 = -114;
        } else if (arg0 == '‘') {
            var2 = -111;
        } else if (arg0 == '’') {
            var2 = -110;
        } else if (arg0 == '“') {
            var2 = -109;
        } else if (arg0 == '”') {
            var2 = -108;
        } else if (arg0 == '•') {
            var2 = -107;
        } else if (arg0 == '–') {
            var2 = -106;
        } else if (arg0 == '—') {
            var2 = -105;
        } else if (arg0 == '˜') {
            var2 = -104;
        } else if (arg0 == '™') {
            var2 = -103;
        } else if (arg0 == 'š') {
            var2 = -102;
        } else if (arg0 == '›') {
            var2 = -101;
        } else if (arg0 == 'œ') {
            var2 = -100;
        } else if (arg0 == 'ž') {
            var2 = -98;
        } else if (arg0 == 'Ÿ') {
            var2 = -97;
        } else {
            var2 = 63;
        }
        if (arg1 <= 85) {
            method1445((char) 65417, 48);
        }
        return var2;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(B)V")
    public static void method1446(byte arg0) {
        field3013 = null;
        field3014 = null;
        field3009 = null;
        field3011 = null;
        if (arg0 == -114) {
            field3016 = null;
        }
    }
}
