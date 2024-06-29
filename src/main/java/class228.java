import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nfa")
public class class228 extends class287 {

    @OriginalMember(owner = "client!nfa", name = "v", descriptor = "Lqk;")
    public static class148 field3171 = new class148(92, 6);

    @OriginalMember(owner = "client!nfa", name = "t", descriptor = "I")
    public int field3169;

    @OriginalMember(owner = "client!nfa", name = "u", descriptor = "I")
    public static int field3170;

    @OriginalMember(owner = "client!nfa", name = "y", descriptor = "I")
    public int field3174;

    @OriginalMember(owner = "client!nfa", name = "z", descriptor = "I")
    public static int field3175;

    @OriginalMember(owner = "client!nfa", name = "C", descriptor = "I")
    public int field3177;

    @OriginalMember(owner = "client!nfa", name = "H", descriptor = "I")
    public static int field3181;

    @OriginalMember(owner = "client!nfa", name = "I", descriptor = "I")
    public int field3182;

    @OriginalMember(owner = "client!nfa", name = "w", descriptor = "Low;")
    public class747 field3172;

    @OriginalMember(owner = "client!nfa", name = "F", descriptor = "Ljava/lang/String;")
    public String field3179;

    @OriginalMember(owner = "client!nfa", name = "A", descriptor = "[I")
    public int[] field3176;

    @OriginalMember(owner = "client!nfa", name = "G", descriptor = "[I")
    public int[] field3180;

    @OriginalMember(owner = "client!nfa", name = "E", descriptor = "[Lgca;")
    public class209[] field3178;

    @OriginalMember(owner = "client!nfa", name = "x", descriptor = "[Ljava/lang/String;")
    public String[] field3173;

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "(CZ)B")
    public static final byte method1474(char arg0, boolean arg1) {
        field3170++;
        byte var2;
        if (arg0 > '\u0000' && arg0 < '\u0080' || arg0 >= ' ' && arg0 <= 'ÿ') {
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
        return arg1 ? var2 : 75;
    }

    @OriginalMember(owner = "client!nfa", name = "b", descriptor = "(B)V")
    public static void method1475(byte arg0) {
        field3171 = null;
        if (arg0 != -122) {
            method1475((byte) 45);
        }
    }

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "(Ljk;I)Z")
    public static final boolean method1476(class185 arg0, int arg1) {
        field3181++;
        if (arg0 == null) {
            return false;
        } else if (!arg0.field2675) {
            return false;
        } else if (arg0.method1242(class531.field7422, (byte) -55)) {
            if (arg1 != 65408) {
                field3171 = null;
            }
            if (class252.field3488.method1381(true, (long) arg0.field2679) == null) {
                return class122.field1670.method1381(true, (long) arg0.field2693) == null;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "(IIB)I")
    public static final int method1477(int arg0, int arg1, byte arg2) {
        int var3 = (arg0 & 0x7F) * arg1 >> 7;
        field3175++;
        if (arg2 > -5) {
            field3171 = null;
        }
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg0 & 0xFF80) + var3;
    }
}
