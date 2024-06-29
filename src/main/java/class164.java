import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class164 {

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "Z")
    public static boolean field2417 = true;

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "I")
    public static int field2418;

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "Lid;")
    public static class242 field2419;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Ljava/lang/String;ZIII[B)I", line = 4)
    public static final int method1223(String arg0, boolean arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        if (!arg1) {
            field2419 = null;
        }
        field2418++;
        int var6 = arg2 - arg3;
        for (int var7 = 0; var7 < var6; var7++) {
            char var8 = arg0.charAt(arg3 + var7);
            if (var8 > '\u0000' && var8 < '\u0080' || var8 >= ' ' && var8 <= 'ÿ') {
                arg5[arg4 + var7] = (byte) var8;
            } else if (var8 == '€') {
                arg5[arg4 + var7] = -128;
            } else if (var8 == '‚') {
                arg5[arg4 + var7] = -126;
            } else if (var8 == 'ƒ') {
                arg5[arg4 + var7] = -125;
            } else if (var8 == '„') {
                arg5[arg4 + var7] = -124;
            } else if (var8 == '…') {
                arg5[arg4 + var7] = -123;
            } else if (var8 == '†') {
                arg5[arg4 + var7] = -122;
            } else if (var8 == '‡') {
                arg5[arg4 + var7] = -121;
            } else if (var8 == 'ˆ') {
                arg5[arg4 + var7] = -120;
            } else if (var8 == '‰') {
                arg5[arg4 + var7] = -119;
            } else if (var8 == 'Š') {
                arg5[arg4 + var7] = -118;
            } else if (var8 == '‹') {
                arg5[arg4 + var7] = -117;
            } else if (var8 == 'Œ') {
                arg5[arg4 + var7] = -116;
            } else if (var8 == 'Ž') {
                arg5[arg4 + var7] = -114;
            } else if (var8 == '‘') {
                arg5[arg4 + var7] = -111;
            } else if (var8 == '’') {
                arg5[arg4 + var7] = -110;
            } else if (var8 == '“') {
                arg5[arg4 + var7] = -109;
            } else if (var8 == '”') {
                arg5[arg4 + var7] = -108;
            } else if (var8 == '•') {
                arg5[arg4 + var7] = -107;
            } else if (var8 == '–') {
                arg5[arg4 + var7] = -106;
            } else if (var8 == '—') {
                arg5[arg4 + var7] = -105;
            } else if (var8 == '˜') {
                arg5[arg4 + var7] = -104;
            } else if (var8 == '™') {
                arg5[arg4 + var7] = -103;
            } else if (var8 == 'š') {
                arg5[arg4 + var7] = -102;
            } else if (var8 == '›') {
                arg5[arg4 + var7] = -101;
            } else if (var8 == 'œ') {
                arg5[arg4 + var7] = -100;
            } else if (var8 == 'ž') {
                arg5[arg4 + var7] = -98;
            } else if (var8 == 'Ÿ') {
                arg5[arg4 + var7] = -97;
            } else {
                arg5[arg4 + var7] = 63;
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(B)V", line = 152)
    public static void method1224(byte arg0) {
        if (arg0 != -98) {
            method1224((byte) 92);
        }
        field2419 = null;
    }
}
