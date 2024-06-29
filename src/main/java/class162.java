import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public class class162 {

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "Z")
    public static boolean field2569 = false;

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "[I")
    public static int[] field2570 = new int[200];

    @OriginalMember(owner = "client!fk", name = "c", descriptor = "I")
    public static int field2571 = 0;

    @OriginalMember(owner = "client!fk", name = "g", descriptor = "Lwf;")
    public static class250 field2575 = null;

    @OriginalMember(owner = "client!fk", name = "d", descriptor = "I")
    public static int field2572 = 0;

    @OriginalMember(owner = "client!fk", name = "e", descriptor = "I")
    public static int field2573;

    @OriginalMember(owner = "client!fk", name = "f", descriptor = "I")
    public static int field2574;

    @OriginalMember(owner = "client!fk", name = "h", descriptor = "I")
    public static int field2576;

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(I)V", line = 4)
    public static final void method1257(int arg0) {
        field2573++;
        if (arg0 == 255) {
            class296.field4761 = null;
            class324.field5155 = null;
            class241.field3976 = null;
            class51.field802 = null;
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(CI)B", line = 16)
    public static final byte method1258(char arg0, int arg1) {
        if (arg1 != -8226) {
            return -126;
        }
        field2576++;
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
        return var2;
    }

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "(I)V", line = 144)
    public static void method1259(int arg0) {
        field2575 = null;
        if (arg0 == 14071) {
            field2570 = null;
        }
    }
}
