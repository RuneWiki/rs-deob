import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public class class179 {

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "Lj;")
    public static class209 field2843 = new class209(16);

    @OriginalMember(owner = "client!ch", name = "g", descriptor = "[I")
    public static int[] field2849 = new int[1000];

    @OriginalMember(owner = "client!ch", name = "l", descriptor = "[I")
    public static int[] field2854 = new int[128];

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "I")
    public static int field2844;

    @OriginalMember(owner = "client!ch", name = "c", descriptor = "I")
    public static int field2845;

    @OriginalMember(owner = "client!ch", name = "d", descriptor = "I")
    public static int field2846;

    @OriginalMember(owner = "client!ch", name = "e", descriptor = "I")
    public static int field2847;

    @OriginalMember(owner = "client!ch", name = "f", descriptor = "I")
    public static int field2848;

    @OriginalMember(owner = "client!ch", name = "i", descriptor = "I")
    public static int field2851;

    @OriginalMember(owner = "client!ch", name = "j", descriptor = "I")
    public static int field2852;

    @OriginalMember(owner = "client!ch", name = "k", descriptor = "I")
    public static int field2853;

    @OriginalMember(owner = "client!ch", name = "h", descriptor = "[Z")
    public static boolean[] field2850;

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(Leh;II)Lnf;")
    public static final class227 method1244(class137 arg0, int arg1, int arg2) {
        field2853++;
        if (class52.method300(71, arg2, arg0)) {
            if (arg1 != 0) {
                method1246((byte) -92, (short) -24);
            }
            return class239.method1685(-63);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "([BLjava/lang/String;IIII)I")
    public static final int method1245(byte[] arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = arg2 - arg4;
        if (arg3 != -13086) {
            return -24;
        }
        field2845++;
        for (int var7 = 0; var7 < var6; var7++) {
            char var8 = arg1.charAt(arg4 + var7);
            if (var8 > '\u0000' && var8 < '\u0080' || var8 >= ' ' && var8 <= 'ÿ') {
                arg0[arg5 + var7] = (byte) var8;
            } else if (var8 == '€') {
                arg0[arg5 + var7] = -128;
            } else if (var8 == '‚') {
                arg0[arg5 + var7] = -126;
            } else if (var8 == 'ƒ') {
                arg0[arg5 + var7] = -125;
            } else if (var8 == '„') {
                arg0[arg5 + var7] = -124;
            } else if (var8 == '…') {
                arg0[arg5 + var7] = -123;
            } else if (var8 == '†') {
                arg0[arg5 + var7] = -122;
            } else if (var8 == '‡') {
                arg0[arg5 + var7] = -121;
            } else if (var8 == 'ˆ') {
                arg0[arg5 + var7] = -120;
            } else if (var8 == '‰') {
                arg0[arg5 + var7] = -119;
            } else if (var8 == 'Š') {
                arg0[arg5 + var7] = -118;
            } else if (var8 == '‹') {
                arg0[arg5 + var7] = -117;
            } else if (var8 == 'Œ') {
                arg0[arg5 + var7] = -116;
            } else if (var8 == 'Ž') {
                arg0[arg5 + var7] = -114;
            } else if (var8 == '‘') {
                arg0[arg5 + var7] = -111;
            } else if (var8 == '’') {
                arg0[arg5 + var7] = -110;
            } else if (var8 == '“') {
                arg0[arg5 + var7] = -109;
            } else if (var8 == '”') {
                arg0[arg5 + var7] = -108;
            } else if (var8 == '•') {
                arg0[arg5 + var7] = -107;
            } else if (var8 == '–') {
                arg0[arg5 + var7] = -106;
            } else if (var8 == '—') {
                arg0[arg5 + var7] = -105;
            } else if (var8 == '˜') {
                arg0[arg5 + var7] = -104;
            } else if (var8 == '™') {
                arg0[arg5 + var7] = -103;
            } else if (var8 == 'š') {
                arg0[arg5 + var7] = -102;
            } else if (var8 == '›') {
                arg0[arg5 + var7] = -101;
            } else if (var8 == 'œ') {
                arg0[arg5 + var7] = -100;
            } else if (var8 == 'ž') {
                arg0[arg5 + var7] = -98;
            } else if (var8 == 'Ÿ') {
                arg0[arg5 + var7] = -97;
            } else {
                arg0[arg5 + var7] = 63;
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(BS)Z")
    public static final boolean method1246(byte arg0, short arg1) {
        if (arg0 < 123) {
            return false;
        }
        field2851++;
        if (arg1 == 41 || arg1 == 18 || arg1 == 10 || arg1 == 34 || arg1 == 28 || arg1 == 23 || arg1 == 11 || arg1 == 4) {
            return true;
        } else if (arg1 == 6 || arg1 == 9 || arg1 == 1001 || arg1 == 1004) {
            return true;
        } else if (arg1 == 40 || arg1 == 5 || arg1 == 8 || arg1 == 30 || arg1 == 17) {
            return true;
        } else {
            return arg1 == 20 || arg1 == 42 || arg1 == 7 || arg1 == 49 || arg1 == 43 || arg1 == 46;
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(I)V")
    public static void method1247(int arg0) {
        field2854 = null;
        field2850 = null;
        field2843 = null;
        field2849 = null;
        if (arg0 != 4454) {
            method1246((byte) 84, (short) -42);
        }
    }

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "(I)V")
    public static final void method1248(int arg0) {
        field2848++;
        if (class233.field3853 != arg0) {
            class96.method554(class233.field3853, -1, -1, (byte) 65);
            class233.field3853 = -1;
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(BLeh;)V")
    public static final void method1249(byte arg0, class137 arg1) {
        if (arg0 > 66) {
            class152.field2358 = arg1;
            field2852++;
            class71.field883 = class152.field2358.method926(26899, 16);
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(B)V")
    public static final void method1250(byte arg0) {
        field2844++;
        class3.field29.method1699(0);
        if (arg0 != 22) {
            field2847 = -13;
        }
    }
}
