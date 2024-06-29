import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pq")
public class class128 {

    @OriginalMember(owner = "client!pq", name = "m", descriptor = "I")
    public int field2042 = -1;

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "I")
    public static int field2030 = 0;

    @OriginalMember(owner = "client!pq", name = "l", descriptor = "I")
    public static int field2041 = 1337;

    @OriginalMember(owner = "client!pq", name = "j", descriptor = "Liv;")
    public static class64 field2039 = new class64(98, 3);

    @OriginalMember(owner = "client!pq", name = "b", descriptor = "I")
    public int field2031;

    @OriginalMember(owner = "client!pq", name = "c", descriptor = "I")
    public int field2032;

    @OriginalMember(owner = "client!pq", name = "d", descriptor = "I")
    public int field2033;

    @OriginalMember(owner = "client!pq", name = "e", descriptor = "I")
    public int field2034;

    @OriginalMember(owner = "client!pq", name = "f", descriptor = "I")
    public int field2035;

    @OriginalMember(owner = "client!pq", name = "g", descriptor = "I")
    public static int field2036;

    @OriginalMember(owner = "client!pq", name = "h", descriptor = "I")
    public int field2037;

    @OriginalMember(owner = "client!pq", name = "i", descriptor = "I")
    public int field2038;

    @OriginalMember(owner = "client!pq", name = "k", descriptor = "I")
    public int field2040;

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(ILjava/lang/String;[BIBI)I", line = 11)
    public static final int method964(int arg0, String arg1, byte[] arg2, int arg3, byte arg4, int arg5) {
        if (arg4 != -1) {
            return 25;
        }
        field2036++;
        int var6 = arg3 - arg0;
        for (int var7 = 0; var7 < var6; var7++) {
            char var8 = arg1.charAt(arg0 + var7);
            if (var8 > '\u0000' && var8 < '\u0080' || var8 >= ' ' && var8 <= 'ÿ') {
                arg2[arg5 + var7] = (byte) var8;
            } else if (var8 == '€') {
                arg2[arg5 + var7] = -128;
            } else if (var8 == '‚') {
                arg2[arg5 + var7] = -126;
            } else if (var8 == 'ƒ') {
                arg2[arg5 + var7] = -125;
            } else if (var8 == '„') {
                arg2[arg5 + var7] = -124;
            } else if (var8 == '…') {
                arg2[arg5 + var7] = -123;
            } else if (var8 == '†') {
                arg2[arg5 + var7] = -122;
            } else if (var8 == '‡') {
                arg2[arg5 + var7] = -121;
            } else if (var8 == 'ˆ') {
                arg2[arg5 + var7] = -120;
            } else if (var8 == '‰') {
                arg2[arg5 + var7] = -119;
            } else if (var8 == 'Š') {
                arg2[arg5 + var7] = -118;
            } else if (var8 == '‹') {
                arg2[arg5 + var7] = -117;
            } else if (var8 == 'Œ') {
                arg2[arg5 + var7] = -116;
            } else if (var8 == 'Ž') {
                arg2[arg5 + var7] = -114;
            } else if (var8 == '‘') {
                arg2[arg5 + var7] = -111;
            } else if (var8 == '’') {
                arg2[arg5 + var7] = -110;
            } else if (var8 == '“') {
                arg2[arg5 + var7] = -109;
            } else if (var8 == '”') {
                arg2[arg5 + var7] = -108;
            } else if (var8 == '•') {
                arg2[arg5 + var7] = -107;
            } else if (var8 == '–') {
                arg2[arg5 + var7] = -106;
            } else if (var8 == '—') {
                arg2[arg5 + var7] = -105;
            } else if (var8 == '˜') {
                arg2[arg5 + var7] = -104;
            } else if (var8 == '™') {
                arg2[arg5 + var7] = -103;
            } else if (var8 == 'š') {
                arg2[arg5 + var7] = -102;
            } else if (var8 == '›') {
                arg2[arg5 + var7] = -101;
            } else if (var8 == 'œ') {
                arg2[arg5 + var7] = -100;
            } else if (var8 == 'ž') {
                arg2[arg5 + var7] = -98;
            } else if (var8 == 'Ÿ') {
                arg2[arg5 + var7] = -97;
            } else {
                arg2[arg5 + var7] = 63;
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(I)V", line = 156)
    public static void method965(int arg0) {
        field2039 = null;
        if (arg0 != -21140) {
            method965(83);
        }
    }
}
