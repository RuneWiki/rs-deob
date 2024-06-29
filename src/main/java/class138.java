import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public class class138 implements class248 {

    @OriginalMember(owner = "client!hi", name = "i", descriptor = "Lmn;")
    private class247 field1967 = new class247(128);

    @OriginalMember(owner = "client!hi", name = "n", descriptor = "[I")
    public int[] field1972 = new int[class73.field996.field1723];

    @OriginalMember(owner = "client!hi", name = "m", descriptor = "[I")
    private int[] field1971 = new int[class73.field996.field1723];

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "[I")
    public static int[] field1960 = new int[1000];

    @OriginalMember(owner = "client!hi", name = "r", descriptor = "Lwa;")
    public static class433 field1976 = new class433("WIP", 2);

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "I")
    public static int field1959;

    @OriginalMember(owner = "client!hi", name = "c", descriptor = "I")
    public static int field1961;

    @OriginalMember(owner = "client!hi", name = "d", descriptor = "I")
    public static int field1962;

    @OriginalMember(owner = "client!hi", name = "e", descriptor = "I")
    public static int field1963;

    @OriginalMember(owner = "client!hi", name = "f", descriptor = "I")
    public static int field1964;

    @OriginalMember(owner = "client!hi", name = "g", descriptor = "I")
    public static int field1965;

    @OriginalMember(owner = "client!hi", name = "h", descriptor = "I")
    public static int field1966;

    @OriginalMember(owner = "client!hi", name = "j", descriptor = "I")
    public static int field1968;

    @OriginalMember(owner = "client!hi", name = "k", descriptor = "I")
    public static int field1969;

    @OriginalMember(owner = "client!hi", name = "l", descriptor = "I")
    public static int field1970;

    @OriginalMember(owner = "client!hi", name = "o", descriptor = "I")
    public static int field1973;

    @OriginalMember(owner = "client!hi", name = "s", descriptor = "I")
    public static int field1977;

    @OriginalMember(owner = "client!hi", name = "p", descriptor = "Lmg;")
    public static class101 field1974;

    @OriginalMember(owner = "client!hi", name = "q", descriptor = "Lmg;")
    public static class101 field1975;

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIIIIIIBII)V", line = 4)
    public static final void method924(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7, int arg8, int arg9) {
        field1973++;
        if (arg4 == arg9 && arg2 == arg5 && arg3 == arg8 && arg1 == arg6) {
            class368.method2217(arg8, arg6, (byte) 114, arg4, arg5, arg0);
        } else {
            int var10 = arg4;
            int var11 = arg5;
            int var12 = arg4 * 3;
            int var13 = arg5 * 3;
            int var14 = arg9 * 3;
            int var15 = arg2 * 3;
            int var16 = arg3 * 3;
            int var17 = arg1 * 3;
            int var18 = arg8 + var14 - var16 - arg4;
            int var19 = arg6 - var17 - (-var15 + arg5);
            int var20 = var12 + var16 - var14 - var14;
            int var21 = var17 + var13 - (var15 + var15);
            int var22 = var14 - var12;
            int var23 = var15 - var13;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var18 * var26;
                int var28 = var19 * var26;
                int var29 = var20 * var25;
                int var30 = var21 * var25;
                int var31 = var22 * var24;
                int var32 = var23 * var24;
                int var33 = (var27 + var29 + var31 >> 12) + arg4;
                int var34 = arg5 + (var28 + var30 + var32 >> 12);
                class368.method2217(var33, var34, (byte) 114, var10, var11, arg0);
                var10 = var33;
                var11 = var34;
            }
        }
        if (arg7 < 109) {
            field1969 = 33;
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(ILjava/lang/String;)[B", line = 79)
    public static final byte[] method925(int arg0, String arg1) {
        field1970++;
        int var2 = arg1.length();
        byte[] var3 = new byte[var2];
        if (arg0 < 87) {
            method933(-83, -52, -50, -119, -116, 23, -7);
        }
        for (int var4 = 0; var4 < var2; var4++) {
            char var5 = arg1.charAt(var4);
            if (var5 > '\u0000' && var5 < '\u0080' || var5 >= ' ' && var5 <= 'ÿ') {
                var3[var4] = (byte) var5;
            } else if (var5 == '€') {
                var3[var4] = -128;
            } else if (var5 == '‚') {
                var3[var4] = -126;
            } else if (var5 == 'ƒ') {
                var3[var4] = -125;
            } else if (var5 == '„') {
                var3[var4] = -124;
            } else if (var5 == '…') {
                var3[var4] = -123;
            } else if (var5 == '†') {
                var3[var4] = -122;
            } else if (var5 == '‡') {
                var3[var4] = -121;
            } else if (var5 == 'ˆ') {
                var3[var4] = -120;
            } else if (var5 == '‰') {
                var3[var4] = -119;
            } else if (var5 == 'Š') {
                var3[var4] = -118;
            } else if (var5 == '‹') {
                var3[var4] = -117;
            } else if (var5 == 'Œ') {
                var3[var4] = -116;
            } else if (var5 == 'Ž') {
                var3[var4] = -114;
            } else if (var5 == '‘') {
                var3[var4] = -111;
            } else if (var5 == '’') {
                var3[var4] = -110;
            } else if (var5 == '“') {
                var3[var4] = -109;
            } else if (var5 == '”') {
                var3[var4] = -108;
            } else if (var5 == '•') {
                var3[var4] = -107;
            } else if (var5 == '–') {
                var3[var4] = -106;
            } else if (var5 == '—') {
                var3[var4] = -105;
            } else if (var5 == '˜') {
                var3[var4] = -104;
            } else if (var5 == '™') {
                var3[var4] = -103;
            } else if (var5 == 'š') {
                var3[var4] = -102;
            } else if (var5 == '›') {
                var3[var4] = -101;
            } else if (var5 == 'œ') {
                var3[var4] = -100;
            } else if (var5 == 'ž') {
                var3[var4] = -98;
            } else if (var5 == 'Ÿ') {
                var3[var4] = -97;
            } else {
                var3[var4] = 63;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(II)I", line = 221)
    public final int method926(int arg0, int arg1) {
        int var3 = 70 / ((-arg1 - 5) / 43);
        field1963++;
        return this.field1972[arg0];
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIZ)V", line = 232)
    public final void method927(int arg0, int arg1, boolean arg2) {
        field1966++;
        if (arg2) {
            method925(-56, null);
        }
        class304 var4 = class302.field4142.method1570(arg1, 32896);
        int var5 = var4.field4155;
        int var6 = var4.field4161;
        int var7 = var4.field4160;
        int var8 = class502.field7397[var7 - var6];
        if (arg0 < 0 || var8 < arg0) {
            arg0 = 0;
        }
        int var9 = var8 << var6;
        this.method931(var5, var9 & arg0 << var6 | this.field1971[var5] & ~var9, -101);
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(ZI)I", line = 259)
    public final int method928(boolean arg0, int arg1) {
        field1959++;
        long var3 = class246.method1483(5957);
        class30 var5 = arg0 ? (class30) this.field1967.method1494(0) : (class30) this.field1967.method1493((byte) 114);
        if (arg1 != -1) {
            field1975 = null;
        }
        while (var5 != null) {
            if (var3 > (var5.field395 & 0x3FFFFFFFFFFFFFFFL)) {
                if ((var5.field395 & 0x4000000000000000L) != 0L) {
                    int var6 = (int) var5.field3615;
                    this.field1972[var6] = this.field1971[var6];
                    var5.method1565(0);
                    return var6;
                }
                var5.method1565(0);
            }
            var5 = (class30) this.field1967.method1493((byte) 88);
        }
        return -1;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(Z)V", line = 297)
    public final void method929(boolean arg0) {
        for (int var2 = 0; var2 < class73.field996.field1723; var2++) {
            class417 var3 = class73.field996.method824(!arg0, var2);
            if (var3 != null && var3.field6058 == 0) {
                this.field1971[var2] = 0;
                this.field1972[var2] = 0;
            }
        }
        field1961++;
        this.field1967 = new class247(128);
        if (!arg0) {
            this.field1971 = null;
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(ZII)V", line = 325)
    public final void method930(boolean arg0, int arg1, int arg2) {
        this.field1972[arg2] = arg1;
        if (!arg0) {
            return;
        }
        field1977++;
        class30 var4 = (class30) this.field1967.method1492((long) arg2, 6340);
        if (var4 == null) {
            class30 var5 = new class30(class246.method1483(5957) + 500L);
            this.field1967.method1487(-122, (long) arg2, var5);
        } else {
            var4.field395 = class246.method1483(5957) + 500L;
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(III)V", line = 354)
    public final void method931(int arg0, int arg1, int arg2) {
        this.field1971[arg0] = arg1;
        if (arg2 >= -56) {
            return;
        }
        field1964++;
        class30 var4 = (class30) this.field1967.method1492((long) arg0, 6340);
        if (var4 == null) {
            class30 var5 = new class30(4611686018427387905L);
            this.field1967.method1487(-76, (long) arg0, var5);
        } else if (var4.field395 != 4611686018427387905L) {
            var4.field395 = class246.method1483(5957) + 500L | 0x4000000000000000L;
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(I)V", line = 383)
    public static void method932(int arg0) {
        field1976 = null;
        field1960 = null;
        field1974 = null;
        field1975 = null;
        if (arg0 != 0) {
            method925(-38, null);
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIIIIII)V", line = 400)
    public static final void method933(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 != 1631) {
            method924(-118, -110, 115, -47, 126, -55, 16, (byte) -64, -110, 63);
        }
        if (class424.field6204 <= arg0 - arg5 && arg0 + arg5 <= class76.field1021 && class417.field6057 <= (arg4 - arg5) && class224.field3193 >= (arg4 + arg5)) {
            class17.method109(arg6, arg3, (byte) -125, arg0, arg5, arg1, arg4);
        } else {
            class327.method1898(arg5, arg3, -108, arg6, arg0, arg1, arg4);
        }
        field1968++;
    }

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "(II)I", line = 417)
    public final int method934(int arg0, int arg1) {
        field1962++;
        class304 var3 = class302.field4142.method1570(arg0, 32896);
        int var4 = var3.field4155;
        if (arg1 >= -116) {
            this.method928(true, -76);
        }
        int var5 = var3.field4161;
        int var6 = var3.field4160;
        int var7 = class502.field7397[var6 - var5];
        return var7 & this.field1972[var4] >> var5;
    }

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "(III)V", line = 446)
    public final void method935(int arg0, int arg1, int arg2) {
        field1965++;
        class304 var4 = class302.field4142.method1570(arg1, 32896);
        int var5 = var4.field4155;
        int var6 = var4.field4161;
        int var7 = var4.field4160;
        int var8 = class502.field7397[var7 - var6];
        if (arg2 < arg0 || var8 < arg2) {
            arg2 = 0;
        }
        int var9 = var8 << var6;
        this.method930(true, var9 & arg2 << var6 | ~var9 & this.field1972[var5], var5);
    }
}
