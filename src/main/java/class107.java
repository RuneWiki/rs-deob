import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ik")
public class class107 extends class618 {

    @OriginalMember(owner = "client!ik", name = "g", descriptor = "Laba;")
    public static class123 field1756 = null;

    @OriginalMember(owner = "client!ik", name = "i", descriptor = "Lis;")
    public static class101 field1758 = null;

    @OriginalMember(owner = "client!ik", name = "h", descriptor = "I")
    public static int field1757;

    @OriginalMember(owner = "client!ik", name = "j", descriptor = "I")
    public static int field1759;

    @OriginalMember(owner = "client!ik", name = "k", descriptor = "I")
    public static int field1760;

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "(I)V")
    public static final void method887(int arg0) {
        if (arg0 != -403) {
            return;
        }
        field1760++;
        if (class554.field8103 != class434.field6248) {
            try {
                class157.method1180((byte) 71, class573.field8424, "tbrefresh");
            } catch (Throwable var1) {
            }
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(IC)B")
    public static final byte method888(int arg0, char arg1) {
        if (arg0 != -161) {
            return -84;
        }
        field1757++;
        byte var2;
        if (!(arg1 <= '\u0000' || arg1 >= '\u0080') || !(arg1 < ' ' || arg1 > 'ÿ')) {
            var2 = (byte) arg1;
        } else if (arg1 == '€') {
            var2 = -128;
        } else if (arg1 == '‚') {
            var2 = -126;
        } else if (arg1 == 'ƒ') {
            var2 = -125;
        } else if (arg1 == '„') {
            var2 = -124;
        } else if (arg1 == '…') {
            var2 = -123;
        } else if (arg1 == '†') {
            var2 = -122;
        } else if (arg1 == '‡') {
            var2 = -121;
        } else if (arg1 == 'ˆ') {
            var2 = -120;
        } else if (arg1 == '‰') {
            var2 = -119;
        } else if (arg1 == 'Š') {
            var2 = -118;
        } else if (arg1 == '‹') {
            var2 = -117;
        } else if (arg1 == 'Œ') {
            var2 = -116;
        } else if (arg1 == 'Ž') {
            var2 = -114;
        } else if (arg1 == '‘') {
            var2 = -111;
        } else if (arg1 == '’') {
            var2 = -110;
        } else if (arg1 == '“') {
            var2 = -109;
        } else if (arg1 == '”') {
            var2 = -108;
        } else if (arg1 == '•') {
            var2 = -107;
        } else if (arg1 == '–') {
            var2 = -106;
        } else if (arg1 == '—') {
            var2 = -105;
        } else if (arg1 == '˜') {
            var2 = -104;
        } else if (arg1 == '™') {
            var2 = -103;
        } else if (arg1 == 'š') {
            var2 = -102;
        } else if (arg1 == '›') {
            var2 = -101;
        } else if (arg1 == 'œ') {
            var2 = -100;
        } else if (arg1 == 'ž') {
            var2 = -98;
        } else if (arg1 == 'Ÿ') {
            var2 = -97;
        } else {
            var2 = 63;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(B)V")
    public static void method889(byte arg0) {
        int var1 = -24 / ((arg0 + 24) / 57);
        field1758 = null;
    }
}
