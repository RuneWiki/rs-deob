import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fn")
public class class94 {

    @OriginalMember(owner = "client!fn", name = "c", descriptor = "Ls;")
    public static class186 field1857 = new class186(23, 1);

    @OriginalMember(owner = "client!fn", name = "d", descriptor = "I")
    public static int field1858 = 2;

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "I")
    public static int field1855;

    @OriginalMember(owner = "client!fn", name = "b", descriptor = "I")
    public static int field1856;

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(I[BIIILjava/lang/String;)I", line = 5)
    public static final int method850(int arg0, byte[] arg1, int arg2, int arg3, int arg4, String arg5) {
        field1855++;
        int var6 = arg0 - arg4;
        if (arg3 != 8218) {
            return -19;
        }
        for (int var7 = 0; var7 < var6; var7++) {
            char var8 = arg5.charAt(arg4 + var7);
            if (var8 > '\u0000' && var8 < '\u0080' || var8 >= ' ' && var8 <= 'ÿ') {
                arg1[arg2 + var7] = (byte) var8;
            } else if (var8 == '€') {
                arg1[arg2 + var7] = -128;
            } else if (var8 == '‚') {
                arg1[arg2 + var7] = -126;
            } else if (var8 == 'ƒ') {
                arg1[arg2 + var7] = -125;
            } else if (var8 == '„') {
                arg1[arg2 + var7] = -124;
            } else if (var8 == '…') {
                arg1[arg2 + var7] = -123;
            } else if (var8 == '†') {
                arg1[arg2 + var7] = -122;
            } else if (var8 == '‡') {
                arg1[arg2 + var7] = -121;
            } else if (var8 == 'ˆ') {
                arg1[arg2 + var7] = -120;
            } else if (var8 == '‰') {
                arg1[arg2 + var7] = -119;
            } else if (var8 == 'Š') {
                arg1[arg2 + var7] = -118;
            } else if (var8 == '‹') {
                arg1[arg2 + var7] = -117;
            } else if (var8 == 'Œ') {
                arg1[arg2 + var7] = -116;
            } else if (var8 == 'Ž') {
                arg1[arg2 + var7] = -114;
            } else if (var8 == '‘') {
                arg1[arg2 + var7] = -111;
            } else if (var8 == '’') {
                arg1[arg2 + var7] = -110;
            } else if (var8 == '“') {
                arg1[arg2 + var7] = -109;
            } else if (var8 == '”') {
                arg1[arg2 + var7] = -108;
            } else if (var8 == '•') {
                arg1[arg2 + var7] = -107;
            } else if (var8 == '–') {
                arg1[arg2 + var7] = -106;
            } else if (var8 == '—') {
                arg1[arg2 + var7] = -105;
            } else if (var8 == '˜') {
                arg1[arg2 + var7] = -104;
            } else if (var8 == '™') {
                arg1[arg2 + var7] = -103;
            } else if (var8 == 'š') {
                arg1[arg2 + var7] = -102;
            } else if (var8 == '›') {
                arg1[arg2 + var7] = -101;
            } else if (var8 == 'œ') {
                arg1[arg2 + var7] = -100;
            } else if (var8 == 'ž') {
                arg1[arg2 + var7] = -98;
            } else if (var8 == 'Ÿ') {
                arg1[arg2 + var7] = -97;
            } else {
                arg1[arg2 + var7] = 63;
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(B)V", line = 141)
    public static void method851(byte arg0) {
        if (arg0 != -119) {
            method851((byte) -12);
        }
        field1857 = null;
    }
}
