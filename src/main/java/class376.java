import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gs")
public class class376 {

    @OriginalMember(owner = "client!gs", name = "e", descriptor = "[I")
    public static int[] field5090 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

    @OriginalMember(owner = "client!gs", name = "f", descriptor = "Lcq;")
    public static class72 field5091 = new class72("M", "M", "M", "M");

    @OriginalMember(owner = "client!gs", name = "g", descriptor = "Lcq;")
    public static class72 field5092 = new class72("green:", "grün:", "vert:", "verde:");

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "I")
    public static int field5086;

    @OriginalMember(owner = "client!gs", name = "b", descriptor = "I")
    public static int field5087;

    @OriginalMember(owner = "client!gs", name = "c", descriptor = "I")
    public static int field5088;

    @OriginalMember(owner = "client!gs", name = "d", descriptor = "I")
    public static int field5089;

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(I)V")
    public static void method2342(int arg0) {
        if (arg0 == -12906) {
            field5090 = null;
            field5092 = null;
            field5091 = null;
        }
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(BC)B")
    public static final byte method2343(byte arg0, char arg1) {
        field5088++;
        if (arg0 != -111) {
            method2342(-72);
        }
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

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(IIII)I")
    public static final int method2344(int arg0, int arg1, int arg2, int arg3) {
        field5086++;
        int var4 = arg1 & 0x3;
        if (var4 == 0) {
            return arg0;
        } else if (var4 == 1) {
            return arg2;
        } else if (var4 == 2) {
            return 1023 - arg0;
        } else {
            if (arg3 != 4770) {
                method2344(-48, 26, 118, 78);
            }
            return 1023 - arg2;
        }
    }
}
