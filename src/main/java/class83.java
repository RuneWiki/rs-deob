import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public class class83 {

    @OriginalMember(owner = "client!fg", name = "g", descriptor = "Z")
    public static boolean field1240 = false;

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "I")
    public int field1234;

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "I")
    public static int field1235;

    @OriginalMember(owner = "client!fg", name = "c", descriptor = "I")
    public int field1236;

    @OriginalMember(owner = "client!fg", name = "d", descriptor = "I")
    public int field1237;

    @OriginalMember(owner = "client!fg", name = "e", descriptor = "I")
    public static int field1238;

    @OriginalMember(owner = "client!fg", name = "f", descriptor = "I")
    public int field1239;

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(IZC)I", line = 8)
    public static final int method516(int arg0, boolean arg1, char arg2) {
        field1238++;
        int var3 = arg2 << 4;
        if (Character.isUpperCase(arg2) || Character.isTitleCase(arg2)) {
            arg2 = Character.toLowerCase(arg2);
            var3 = (arg2 << 4) + 1;
        }
        if (arg1) {
            method517(null, -85, 117, 31, 16, null);
        }
        if (arg2 == 'ñ' && arg0 == 0) {
            var3 = 1762;
        }
        return var3;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "([BIIIILjava/lang/String;)I", line = 35)
    public static final int method517(byte[] arg0, int arg1, int arg2, int arg3, int arg4, String arg5) {
        field1235++;
        int var6 = arg3 - arg1;
        if (arg2 != -711) {
            method517(null, -28, 78, 65, -106, null);
        }
        for (int var7 = 0; var7 < var6; var7++) {
            char var8 = arg5.charAt(arg1 + var7);
            if (var8 > '\u0000' && var8 < '\u0080' || var8 >= ' ' && var8 <= 'ÿ') {
                arg0[arg4 + var7] = (byte) var8;
            } else if (var8 == '€') {
                arg0[arg4 + var7] = -128;
            } else if (var8 == '‚') {
                arg0[arg4 + var7] = -126;
            } else if (var8 == 'ƒ') {
                arg0[arg4 + var7] = -125;
            } else if (var8 == '„') {
                arg0[arg4 + var7] = -124;
            } else if (var8 == '…') {
                arg0[arg4 + var7] = -123;
            } else if (var8 == '†') {
                arg0[arg4 + var7] = -122;
            } else if (var8 == '‡') {
                arg0[arg4 + var7] = -121;
            } else if (var8 == 'ˆ') {
                arg0[arg4 + var7] = -120;
            } else if (var8 == '‰') {
                arg0[arg4 + var7] = -119;
            } else if (var8 == 'Š') {
                arg0[arg4 + var7] = -118;
            } else if (var8 == '‹') {
                arg0[arg4 + var7] = -117;
            } else if (var8 == 'Œ') {
                arg0[arg4 + var7] = -116;
            } else if (var8 == 'Ž') {
                arg0[arg4 + var7] = -114;
            } else if (var8 == '‘') {
                arg0[arg4 + var7] = -111;
            } else if (var8 == '’') {
                arg0[arg4 + var7] = -110;
            } else if (var8 == '“') {
                arg0[arg4 + var7] = -109;
            } else if (var8 == '”') {
                arg0[arg4 + var7] = -108;
            } else if (var8 == '•') {
                arg0[arg4 + var7] = -107;
            } else if (var8 == '–') {
                arg0[arg4 + var7] = -106;
            } else if (var8 == '—') {
                arg0[arg4 + var7] = -105;
            } else if (var8 == '˜') {
                arg0[arg4 + var7] = -104;
            } else if (var8 == '™') {
                arg0[arg4 + var7] = -103;
            } else if (var8 == 'š') {
                arg0[arg4 + var7] = -102;
            } else if (var8 == '›') {
                arg0[arg4 + var7] = -101;
            } else if (var8 == 'œ') {
                arg0[arg4 + var7] = -100;
            } else if (var8 == 'ž') {
                arg0[arg4 + var7] = -98;
            } else if (var8 == 'Ÿ') {
                arg0[arg4 + var7] = -97;
            } else {
                arg0[arg4 + var7] = 63;
            }
        }
        return var6;
    }
}
