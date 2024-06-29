import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class167 extends class439 {

    @OriginalMember(owner = "client!se", name = "o", descriptor = "Lao;")
    public static class188 field2504 = new class188(11, -1);

    @OriginalMember(owner = "client!se", name = "q", descriptor = "I")
    public static int field2506 = 0;

    @OriginalMember(owner = "client!se", name = "n", descriptor = "I")
    public static int field2503;

    @OriginalMember(owner = "client!se", name = "v", descriptor = "I")
    public int field2511;

    @OriginalMember(owner = "client!se", name = "x", descriptor = "I")
    public int field2513;

    @OriginalMember(owner = "client!se", name = "y", descriptor = "I")
    public static int field2514;

    @OriginalMember(owner = "client!se", name = "p", descriptor = "[I")
    public int[] field2505;

    @OriginalMember(owner = "client!se", name = "r", descriptor = "[I")
    public int[] field2507;

    @OriginalMember(owner = "client!se", name = "t", descriptor = "[I")
    public int[] field2509;

    @OriginalMember(owner = "client!se", name = "s", descriptor = "[Lmg;")
    public class100[] field2508;

    @OriginalMember(owner = "client!se", name = "w", descriptor = "[Lmg;")
    public class100[] field2512;

    @OriginalMember(owner = "client!se", name = "u", descriptor = "[[[B")
    public byte[][][] field2510;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(CI)B")
    public static final byte method1189(char arg0, int arg1) {
        field2514++;
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
        return arg1 == 26421 ? var2 : 46;
    }

    @OriginalMember(owner = "client!se", name = "c", descriptor = "(I)V")
    public static void method1190(int arg0) {
        field2504 = null;
        if (arg0 != 13392) {
            field2506 = 9;
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IBI)Z")
    public static final boolean method1191(int arg0, byte arg1, int arg2) {
        if (arg1 < 125) {
            method1191(24, (byte) 102, -27);
        }
        field2503++;
        return (arg2 & 0x400) != 0;
    }
}
