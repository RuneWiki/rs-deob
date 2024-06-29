import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tk")
public class class170 {

    @OriginalMember(owner = "client!tk", name = "d", descriptor = "[[I")
    public int[][] field2769 = new int[6][258];

    @OriginalMember(owner = "client!tk", name = "c", descriptor = "[B")
    public byte[] field2768 = new byte[4096];

    @OriginalMember(owner = "client!tk", name = "y", descriptor = "[B")
    public byte[] field2790 = new byte[18002];

    @OriginalMember(owner = "client!tk", name = "s", descriptor = "[I")
    public int[] field2784 = new int[257];

    @OriginalMember(owner = "client!tk", name = "G", descriptor = "[B")
    public byte[] field2798 = new byte[18002];

    @OriginalMember(owner = "client!tk", name = "l", descriptor = "[I")
    public int[] field2777 = new int[256];

    @OriginalMember(owner = "client!tk", name = "j", descriptor = "[[I")
    public int[][] field2775 = new int[6][258];

    @OriginalMember(owner = "client!tk", name = "q", descriptor = "I")
    public int field2782 = 0;

    @OriginalMember(owner = "client!tk", name = "t", descriptor = "[I")
    public int[] field2785 = new int[6];

    @OriginalMember(owner = "client!tk", name = "H", descriptor = "[B")
    public byte[] field2799 = new byte[256];

    @OriginalMember(owner = "client!tk", name = "F", descriptor = "[[B")
    public byte[][] field2797 = new byte[6][258];

    @OriginalMember(owner = "client!tk", name = "r", descriptor = "I")
    public int field2783 = 0;

    @OriginalMember(owner = "client!tk", name = "I", descriptor = "[Z")
    public boolean[] field2800 = new boolean[16];

    @OriginalMember(owner = "client!tk", name = "C", descriptor = "[[I")
    public int[][] field2794 = new int[6][258];

    @OriginalMember(owner = "client!tk", name = "N", descriptor = "[I")
    public int[] field2804 = new int[16];

    @OriginalMember(owner = "client!tk", name = "O", descriptor = "[Z")
    public boolean[] field2805 = new boolean[256];

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "B")
    public byte field2767;

    @OriginalMember(owner = "client!tk", name = "z", descriptor = "F")
    public static float field2791;

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "I")
    public int field2766;

    @OriginalMember(owner = "client!tk", name = "e", descriptor = "I")
    public static int field2770;

    @OriginalMember(owner = "client!tk", name = "g", descriptor = "I")
    public int field2772;

    @OriginalMember(owner = "client!tk", name = "h", descriptor = "I")
    public static int field2773;

    @OriginalMember(owner = "client!tk", name = "i", descriptor = "I")
    public int field2774;

    @OriginalMember(owner = "client!tk", name = "n", descriptor = "I")
    public int field2779;

    @OriginalMember(owner = "client!tk", name = "o", descriptor = "I")
    public static int field2780;

    @OriginalMember(owner = "client!tk", name = "p", descriptor = "I")
    public int field2781;

    @OriginalMember(owner = "client!tk", name = "u", descriptor = "I")
    public int field2786;

    @OriginalMember(owner = "client!tk", name = "v", descriptor = "I")
    public static int field2787;

    @OriginalMember(owner = "client!tk", name = "w", descriptor = "I")
    public int field2788;

    @OriginalMember(owner = "client!tk", name = "x", descriptor = "I")
    public int field2789;

    @OriginalMember(owner = "client!tk", name = "A", descriptor = "I")
    public static int field2792;

    @OriginalMember(owner = "client!tk", name = "B", descriptor = "I")
    public int field2793;

    @OriginalMember(owner = "client!tk", name = "D", descriptor = "I")
    public int field2795;

    @OriginalMember(owner = "client!tk", name = "E", descriptor = "I")
    public int field2796;

    @OriginalMember(owner = "client!tk", name = "J", descriptor = "I")
    public int field2801;

    @OriginalMember(owner = "client!tk", name = "K", descriptor = "I")
    public static int field2802;

    @OriginalMember(owner = "client!tk", name = "L", descriptor = "I")
    public int field2803;

    @OriginalMember(owner = "client!tk", name = "k", descriptor = "Lsb;")
    public static class124 field2776;

    @OriginalMember(owner = "client!tk", name = "f", descriptor = "[B")
    public byte[] field2771;

    @OriginalMember(owner = "client!tk", name = "m", descriptor = "[B")
    public byte[] field2778;

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(BI)Z")
    public static final boolean method1215(byte arg0, int arg1) {
        field2802++;
        if (arg1 < 0) {
            return false;
        }
        int var2 = class94.field1468[arg1];
        if (var2 >= 2000) {
            var2 -= 2000;
        }
        if (arg0 != 17) {
            field2791 = -0.064900465F;
        }
        return var2 == 1004;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(IC)B")
    public static final byte method1216(int arg0, char arg1) {
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
        if (arg0 == -3055) {
            field2780++;
            return var2;
        } else {
            return -3;
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(II)I")
    public static final int method1217(int arg0, int arg1) {
        field2770++;
        int var2 = 0;
        if (arg0 < 0 || arg0 >= 65536) {
            arg0 >>>= 0x10;
            var2 += 16;
        }
        if (arg1 != 3471) {
            method1219((class136) null, 87);
        }
        if (arg0 >= 256) {
            arg0 >>>= 0x8;
            var2 += 8;
        }
        if (arg0 >= 16) {
            var2 += 4;
            arg0 >>>= 0x4;
        }
        if (arg0 >= 4) {
            arg0 >>>= 0x2;
            var2 += 2;
        }
        if (arg0 >= 1) {
            var2++;
            arg0 >>>= 0x1;
        }
        return arg0 + var2;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(B)V")
    public static void method1218(byte arg0) {
        field2776 = null;
        int var1 = 108 % ((72 - arg0) / 54);
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(Lig;I)Lej;")
    public static final class200 method1219(class136 arg0, int arg1) {
        if (arg1 < 48) {
            method1216(-103, (char) 65428);
        }
        field2792++;
        return new class200(arg0.method1027((byte) 64), arg0.method1027((byte) 64), arg0.method1027((byte) 64), arg0.method1027((byte) 64), arg0.method1027((byte) 64), arg0.method1027((byte) 64), arg0.method1027((byte) 64), arg0.method1027((byte) 64), arg0.method1009(114), arg0.method1012(4));
    }
}
