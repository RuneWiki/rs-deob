import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vp")
public class class160 {

    @OriginalMember(owner = "client!vp", name = "b", descriptor = "I")
    public int field1924;

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "Lvp;")
    public static class160 field1923 = new class160(1);

    @OriginalMember(owner = "client!vp", name = "g", descriptor = "Lvp;")
    public static class160 field1929 = new class160(2);

    @OriginalMember(owner = "client!vp", name = "i", descriptor = "Lvp;")
    public static class160 field1931 = new class160(4);

    @OriginalMember(owner = "client!vp", name = "j", descriptor = "Lvp;")
    public static class160 field1932 = new class160(1);

    @OriginalMember(owner = "client!vp", name = "k", descriptor = "Lvp;")
    public static class160 field1933 = new class160(2);

    @OriginalMember(owner = "client!vp", name = "l", descriptor = "Lvp;")
    public static class160 field1934 = new class160(4);

    @OriginalMember(owner = "client!vp", name = "m", descriptor = "Lvp;")
    public static class160 field1935 = new class160(2);

    @OriginalMember(owner = "client!vp", name = "n", descriptor = "Lvp;")
    public static class160 field1936 = new class160(4);

    @OriginalMember(owner = "client!vp", name = "r", descriptor = "Lrg;")
    public static class548 field1940 = new class548(65, 7);

    @OriginalMember(owner = "client!vp", name = "q", descriptor = "F")
    public static float field1939;

    @OriginalMember(owner = "client!vp", name = "c", descriptor = "I")
    public static int field1925;

    @OriginalMember(owner = "client!vp", name = "d", descriptor = "I")
    public static int field1926;

    @OriginalMember(owner = "client!vp", name = "e", descriptor = "I")
    public static int field1927;

    @OriginalMember(owner = "client!vp", name = "f", descriptor = "I")
    public static int field1928;

    @OriginalMember(owner = "client!vp", name = "h", descriptor = "I")
    public static int field1930;

    @OriginalMember(owner = "client!vp", name = "p", descriptor = "I")
    public static int field1938;

    @OriginalMember(owner = "client!vp", name = "o", descriptor = "Lvj;")
    public static class373 field1937;

    @OriginalMember(owner = "client!vp", name = "s", descriptor = "[S")
    public static short[] field1941;

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(I[BIILjava/lang/String;I)I", line = 6)
    public static final int method875(int arg0, byte[] arg1, int arg2, int arg3, String arg4, int arg5) {
        field1928++;
        if (arg0 != -8212) {
            method875(30, null, 46, 23, null, -31);
        }
        int var6 = arg3 - arg2;
        for (int var7 = 0; var7 < var6; var7++) {
            char var8 = arg4.charAt(arg2 + var7);
            if (var8 > '\u0000' && var8 < '\u0080' || var8 >= ' ' && var8 <= 'ÿ') {
                arg1[arg5 + var7] = (byte) var8;
            } else if (var8 == '€') {
                arg1[arg5 + var7] = -128;
            } else if (var8 == '‚') {
                arg1[arg5 + var7] = -126;
            } else if (var8 == 'ƒ') {
                arg1[arg5 + var7] = -125;
            } else if (var8 == '„') {
                arg1[arg5 + var7] = -124;
            } else if (var8 == '…') {
                arg1[arg5 + var7] = -123;
            } else if (var8 == '†') {
                arg1[arg5 + var7] = -122;
            } else if (var8 == '‡') {
                arg1[arg5 + var7] = -121;
            } else if (var8 == 'ˆ') {
                arg1[arg5 + var7] = -120;
            } else if (var8 == '‰') {
                arg1[arg5 + var7] = -119;
            } else if (var8 == 'Š') {
                arg1[arg5 + var7] = -118;
            } else if (var8 == '‹') {
                arg1[arg5 + var7] = -117;
            } else if (var8 == 'Œ') {
                arg1[arg5 + var7] = -116;
            } else if (var8 == 'Ž') {
                arg1[arg5 + var7] = -114;
            } else if (var8 == '‘') {
                arg1[arg5 + var7] = -111;
            } else if (var8 == '’') {
                arg1[arg5 + var7] = -110;
            } else if (var8 == '“') {
                arg1[arg5 + var7] = -109;
            } else if (var8 == '”') {
                arg1[arg5 + var7] = -108;
            } else if (var8 == '•') {
                arg1[arg5 + var7] = -107;
            } else if (var8 == '–') {
                arg1[arg5 + var7] = -106;
            } else if (var8 == '—') {
                arg1[arg5 + var7] = -105;
            } else if (var8 == '˜') {
                arg1[arg5 + var7] = -104;
            } else if (var8 == '™') {
                arg1[arg5 + var7] = -103;
            } else if (var8 == 'š') {
                arg1[arg5 + var7] = -102;
            } else if (var8 == '›') {
                arg1[arg5 + var7] = -101;
            } else if (var8 == 'œ') {
                arg1[arg5 + var7] = -100;
            } else if (var8 == 'ž') {
                arg1[arg5 + var7] = -98;
            } else if (var8 == 'Ÿ') {
                arg1[arg5 + var7] = -97;
            } else {
                arg1[arg5 + var7] = 63;
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(II)I", line = 142)
    public static final int method876(int arg0, int arg1) {
        if (arg1 != 2) {
            method878((byte) 69);
        }
        field1930++;
        int var2 = arg0 & 0x3F;
        int var3 = (arg0 & 0xEB) >> 6;
        if (var2 == 18) {
            if (var3 == 0) {
                return 1;
            }
            if (var3 == 1) {
                return 2;
            }
            if (var3 == 2) {
                return 4;
            }
            if (var3 == 3) {
                return 8;
            }
        } else if (var2 == 19 || var2 == 21) {
            if (var3 == 0) {
                return 16;
            }
            if (var3 == 1) {
                return 32;
            }
            if (var3 == 2) {
                return 64;
            }
            if (var3 == 3) {
                return 128;
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(BLjava/lang/String;)[B", line = 195)
    public static final byte[] method877(byte arg0, String arg1) {
        field1926++;
        int var2 = arg1.length();
        byte[] var3 = new byte[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            char var6 = arg1.charAt(var4);
            if (var6 > '\u0000' && var6 < '\u0080' || var6 >= ' ' && var6 <= 'ÿ') {
                var3[var4] = (byte) var6;
            } else if (var6 == '€') {
                var3[var4] = -128;
            } else if (var6 == '‚') {
                var3[var4] = -126;
            } else if (var6 == 'ƒ') {
                var3[var4] = -125;
            } else if (var6 == '„') {
                var3[var4] = -124;
            } else if (var6 == '…') {
                var3[var4] = -123;
            } else if (var6 == '†') {
                var3[var4] = -122;
            } else if (var6 == '‡') {
                var3[var4] = -121;
            } else if (var6 == 'ˆ') {
                var3[var4] = -120;
            } else if (var6 == '‰') {
                var3[var4] = -119;
            } else if (var6 == 'Š') {
                var3[var4] = -118;
            } else if (var6 == '‹') {
                var3[var4] = -117;
            } else if (var6 == 'Œ') {
                var3[var4] = -116;
            } else if (var6 == 'Ž') {
                var3[var4] = -114;
            } else if (var6 == '‘') {
                var3[var4] = -111;
            } else if (var6 == '’') {
                var3[var4] = -110;
            } else if (var6 == '“') {
                var3[var4] = -109;
            } else if (var6 == '”') {
                var3[var4] = -108;
            } else if (var6 == '•') {
                var3[var4] = -107;
            } else if (var6 == '–') {
                var3[var4] = -106;
            } else if (var6 == '—') {
                var3[var4] = -105;
            } else if (var6 == '˜') {
                var3[var4] = -104;
            } else if (var6 == '™') {
                var3[var4] = -103;
            } else if (var6 == 'š') {
                var3[var4] = -102;
            } else if (var6 == '›') {
                var3[var4] = -101;
            } else if (var6 == 'œ') {
                var3[var4] = -100;
            } else if (var6 == 'ž') {
                var3[var4] = -98;
            } else if (var6 == 'Ÿ') {
                var3[var4] = -97;
            } else {
                var3[var4] = 63;
            }
        }
        int var5 = 93 / ((arg0 + 74) / 48);
        return var3;
    }

    @OriginalMember(owner = "client!vp", name = "<init>", descriptor = "(I)V", line = 334)
    private class160(int arg0) {
        this.field1924 = arg0;
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(B)V", line = 349)
    public static void method878(byte arg0) {
        field1935 = null;
        field1941 = null;
        field1929 = null;
        field1932 = null;
        field1936 = null;
        field1923 = null;
        if (arg0 <= 33) {
            field1934 = null;
        }
        field1931 = null;
        field1933 = null;
        field1940 = null;
        field1934 = null;
        field1937 = null;
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(Ldn;IB)Lfc;", line = 379)
    public static final class216 method879(class438 arg0, int arg1, byte arg2) {
        field1927++;
        if (arg2 == -117) {
            byte[] var3 = arg0.method2560(arg1, -6914);
            return var3 == null ? null : new class216(var3);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!vp", name = "toString", descriptor = "()Ljava/lang/String;", line = 396)
    public final String toString() {
        field1925++;
        throw new IllegalStateException();
    }
}
