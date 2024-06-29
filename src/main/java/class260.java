import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public class class260 {

    @OriginalMember(owner = "client!nj", name = "h", descriptor = "Lvh;")
    public static class212 field4153 = new class212(4096);

    @OriginalMember(owner = "client!nj", name = "u", descriptor = "Z")
    public static boolean field4166 = false;

    @OriginalMember(owner = "client!nj", name = "v", descriptor = "Luj;")
    public static class156 field4167 = new class156();

    @OriginalMember(owner = "client!nj", name = "z", descriptor = "Lck;")
    public static class119 field4171 = class298.method1987((byte) 122, "<col=ffff00>");

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "I")
    public static int field4146;

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "I")
    public static int field4147;

    @OriginalMember(owner = "client!nj", name = "c", descriptor = "I")
    public static int field4148;

    @OriginalMember(owner = "client!nj", name = "d", descriptor = "I")
    public static int field4149;

    @OriginalMember(owner = "client!nj", name = "f", descriptor = "I")
    public static int field4151;

    @OriginalMember(owner = "client!nj", name = "g", descriptor = "I")
    public static int field4152;

    @OriginalMember(owner = "client!nj", name = "j", descriptor = "I")
    private int field4155;

    @OriginalMember(owner = "client!nj", name = "m", descriptor = "I")
    public static int field4158;

    @OriginalMember(owner = "client!nj", name = "n", descriptor = "I")
    public static int field4159;

    @OriginalMember(owner = "client!nj", name = "o", descriptor = "I")
    public static int field4160;

    @OriginalMember(owner = "client!nj", name = "q", descriptor = "I")
    public static int field4162;

    @OriginalMember(owner = "client!nj", name = "r", descriptor = "I")
    public static int field4163;

    @OriginalMember(owner = "client!nj", name = "s", descriptor = "I")
    public static int field4164;

    @OriginalMember(owner = "client!nj", name = "t", descriptor = "I")
    public static int field4165;

    @OriginalMember(owner = "client!nj", name = "w", descriptor = "I")
    public static int field4168;

    @OriginalMember(owner = "client!nj", name = "e", descriptor = "J")
    private long field4150;

    @OriginalMember(owner = "client!nj", name = "l", descriptor = "J")
    private long field4157;

    @OriginalMember(owner = "client!nj", name = "x", descriptor = "Lva;")
    public static class36 field4169;

    @OriginalMember(owner = "client!nj", name = "k", descriptor = "Z")
    public boolean field4156;

    @OriginalMember(owner = "client!nj", name = "i", descriptor = "[I")
    private int[] field4154;

    @OriginalMember(owner = "client!nj", name = "p", descriptor = "[I")
    private int[] field4161;

    @OriginalMember(owner = "client!nj", name = "y", descriptor = "[I")
    public static int[] field4170;

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(B)V", line = 5)
    private final void method1660(byte arg0) {
        long var2 = this.field4157;
        field4146++;
        this.field4157 = -1L;
        long[] var4 = class31.field444;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field4157 = this.field4157 >>> 8 ^ var4[(int) (((long) (this.field4161[var5] >> 24) ^ this.field4157) & 0xFFL)];
            this.field4157 = this.field4157 >>> 8 ^ var4[(int) ((this.field4157 ^ (long) (this.field4161[var5] >> 16)) & 0xFFL)];
            this.field4157 = this.field4157 >>> 8 ^ var4[(int) (((long) (this.field4161[var5] >> 8) ^ this.field4157) & 0xFFL)];
            this.field4157 = this.field4157 >>> 8 ^ var4[(int) ((this.field4157 ^ (long) this.field4161[var5]) & 0xFFL)];
        }
        int var6 = 0;
        if (arg0 != -23) {
            return;
        }
        while (var6 < 5) {
            this.field4157 = this.field4157 >>> 8 ^ var4[(int) ((this.field4157 ^ (long) this.field4154[var6]) & 0xFFL)];
            var6++;
        }
        this.field4157 = this.field4157 >>> 8 ^ var4[(int) (((long) (this.field4156 ? 1 : 0) ^ this.field4157) & 0xFFL)];
        if (var2 != 0L && this.field4157 != var2) {
            class64.field1012.method489((byte) -57, var2);
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(IZ)V", line = 44)
    public final void method1661(int arg0, boolean arg1) {
        field4158++;
        this.field4156 = arg1;
        if (arg0 >= -54) {
            this.field4157 = 86L;
        }
        this.method1660((byte) -23);
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(IIILwe;I)Lec;", line = 58)
    public final class28 method1662(int arg0, int arg1, int arg2, class56 arg3, int arg4) {
        field4152++;
        long var6 = (long) arg0 | (long) arg0 << 32 | (long) (arg1 << 16);
        if (arg2 <= 40) {
            this.method1668(false, (int[]) null, (int[]) null, 96, 82);
        }
        class28 var8 = (class28) class184.field2917.method487(false, var6);
        if (var8 == null) {
            int var9 = 0;
            class267[] var10 = new class267[2];
            if (!class293.method1950(arg0, (byte) -101).method1682((byte) 19) || !class293.method1950(arg1, (byte) -100).method1682((byte) 19)) {
                return null;
            }
            class267 var11 = class293.method1950(arg0, (byte) -100).method1678(126);
            if (var11 != null) {
                var10[var9++] = var11;
            }
            class267 var12 = class293.method1950(arg1, (byte) -124).method1678(-19);
            if (var12 != null) {
                var10[var9++] = var12;
            }
            class267 var13 = new class267(var10, var9);
            for (int var14 = 0; var14 < 5; var14++) {
                if (class42.field634[var14].length > this.field4154[var14]) {
                    var13.method1777(class46.field673[var14], class42.field634[var14][this.field4154[var14]]);
                }
                if (class19.field244[var14].length > this.field4154[var14]) {
                    var13.method1777(class206.field3274[var14], class19.field244[var14][this.field4154[var14]]);
                }
            }
            var8 = var13.method1775(64, 768, -50, -10, -50);
            class184.field2917.method488(var8, (byte) 125, var6);
        }
        if (arg3 != null) {
            var8 = arg3.method422(-85, arg4, var8);
        }
        return var8;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(Lwe;Lwe;III)Lec;", line = 124)
    public final class28 method1663(class56 arg0, class56 arg1, int arg2, int arg3, int arg4) {
        field4160++;
        if (this.field4155 != -1) {
            return class134.method896(arg4 - 4, this.field4155).method375(0, arg2, arg0, arg1, arg3);
        }
        long var6 = this.field4157;
        int[] var8 = this.field4161;
        if (arg0 != null && (arg0.field901 >= 0 || arg0.field890 >= 0)) {
            var8 = new int[12];
            for (int var9 = 0; var9 < 12; var9++) {
                var8[var9] = this.field4161[var9];
            }
            if (arg0.field901 >= 0) {
                if (arg0.field901 == 65535) {
                    var6 ^= 0xFFFFFFFF00000000L;
                    var8[5] = 0;
                } else {
                    var8[5] = class156.method998(1073741824, arg0.field901);
                    var6 ^= (long) var8[5] << 32;
                }
            }
            if (arg0.field890 >= 0) {
                if (arg0.field890 == 65535) {
                    var8[3] = 0;
                    var6 ^= 0xFFFFFFFFL;
                } else {
                    var8[3] = class156.method998(arg0.field890, 1073741824);
                    var6 ^= (long) var8[3];
                }
            }
        }
        class28 var10 = (class28) class64.field1012.method487(false, var6);
        if (var10 == null) {
            boolean var11 = false;
            for (int var12 = 0; var12 < 12; var12++) {
                int var13 = var8[var12];
                if ((var13 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var13) != 0 && !class293.method1950(var13 & 0x3FFFFFFF, (byte) 96).method1677(true)) {
                        var11 = true;
                    }
                } else if (!class205.method1296((byte) -113, var13 & 0x3FFFFFFF).method1689(this.field4156, (byte) 118)) {
                    var11 = true;
                }
            }
            if (var11) {
                if (this.field4150 != -1L) {
                    var10 = (class28) class64.field1012.method487(false, this.field4150);
                }
                if (var10 == null) {
                    return null;
                }
            }
            if (var10 == null) {
                class267[] var14 = new class267[12];
                int var15 = 0;
                for (int var16 = 0; var16 < 12; var16++) {
                    int var17 = var8[var16];
                    if ((var17 & 0x40000000) != 0) {
                        class267 var19 = class205.method1296((byte) -81, var17 & 0x3FFFFFFF).method1692(10694, this.field4156);
                        if (var19 != null) {
                            var14[var15++] = var19;
                        }
                    } else if ((Integer.MIN_VALUE & var17) != 0) {
                        class267 var18 = class293.method1950(var17 & 0x3FFFFFFF, (byte) 108).method1679(false);
                        if (var18 != null) {
                            var14[var15++] = var18;
                        }
                    }
                }
                int var20 = var8[0];
                if ((var20 & 0x40000000) != 0) {
                    class262 var21 = class205.method1296((byte) -107, var20 & 0x3FFFFFFF);
                    if (var21.field4228 != null) {
                        for (int var22 = 0; var22 < var21.field4228.length; var22++) {
                            if (var21.field4228[var22] != null && var14[var22 + 1] != null) {
                                int var23 = var21.field4228[var22][1];
                                int var24 = var21.field4228[var22][2];
                                int var25 = var21.field4228[var22][0];
                                int var26 = var21.field4228[var22][3];
                                int var27 = var21.field4228[var22][4];
                                int var28 = var21.field4228[var22][5];
                                var14[var22 + 1].method1770(var25, var23, var24);
                                var14[var22 + 1].method1768(var26, var27, var28);
                            }
                        }
                    }
                }
                class267 var29 = new class267(var14, var15);
                for (int var30 = 0; var30 < 5; var30++) {
                    if (class42.field634[var30].length > this.field4154[var30]) {
                        var29.method1777(class46.field673[var30], class42.field634[var30][this.field4154[var30]]);
                    }
                    if (class19.field244[var30].length > this.field4154[var30]) {
                        var29.method1777(class206.field3274[var30], class19.field244[var30][this.field4154[var30]]);
                    }
                }
                var10 = var29.method1775(64, 850, -30, -50, -30);
                class64.field1012.method488(var10, (byte) 60, var6);
                this.field4150 = var6;
            }
        }
        if (arg0 == null && arg1 == null) {
            return var10;
        }
        class28 var31;
        if (arg0 != null && arg1 != null) {
            var31 = arg0.method418(arg2, var10, arg3, (byte) 101, arg1);
        } else if (arg0 == null) {
            var31 = arg1.method421(var10, arg2, 17565744);
        } else {
            var31 = arg0.method421(var10, arg3, 17565744);
        }
        return arg4 == 3 ? var31 : (class28) null;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(I)I", line = 347)
    public final int method1664(int arg0) {
        field4164++;
        int var2 = 93 / ((arg0 - 49) / 59);
        return this.field4155 == -1 ? (this.field4161[0] << 15) + ((this.field4154[4] << 20) + ((this.field4154[0] << 25) + (this.field4161[8] << 10)) - (-(this.field4161[11] << 5) + -this.field4161[1])) : class134.method896(-1, this.field4155).field779 + 305419896;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(ILwe;I)Lec;", line = 363)
    public final class28 method1665(int arg0, class56 arg1, int arg2) {
        field4147++;
        if (~this.field4155 != arg0) {
            return class134.method896(-1, this.field4155).method389(arg2, arg1, 0);
        }
        class28 var4 = (class28) class184.field2917.method487(false, this.field4157);
        if (var4 == null) {
            boolean var5 = false;
            for (int var6 = 0; var6 < 12; var6++) {
                int var7 = this.field4161[var6];
                if ((var7 & 0x40000000) == 0) {
                    if ((var7 & Integer.MIN_VALUE) != 0 && !class293.method1950(var7 & 0x3FFFFFFF, (byte) -98).method1682((byte) 19)) {
                        var5 = true;
                    }
                } else if (!class205.method1296((byte) -93, var7 & 0x3FFFFFFF).method1686(arg0 - 129, this.field4156)) {
                    var5 = true;
                }
            }
            if (var5) {
                return null;
            }
            class267[] var8 = new class267[12];
            int var9 = 0;
            for (int var10 = 0; var10 < 12; var10++) {
                int var11 = this.field4161[var10];
                if ((var11 & 0x40000000) != 0) {
                    class267 var13 = class205.method1296((byte) -86, var11 & 0x3FFFFFFF).method1687(-1, this.field4156);
                    if (var13 != null) {
                        var8[var9++] = var13;
                    }
                } else if ((Integer.MIN_VALUE & var11) != 0) {
                    class267 var12 = class293.method1950(var11 & 0x3FFFFFFF, (byte) -107).method1678(arg0 + 126);
                    if (var12 != null) {
                        var8[var9++] = var12;
                    }
                }
            }
            class267 var14 = new class267(var8, var9);
            for (int var15 = 0; var15 < 5; var15++) {
                if (this.field4154[var15] < class42.field634[var15].length) {
                    var14.method1777(class46.field673[var15], class42.field634[var15][this.field4154[var15]]);
                }
                if (this.field4154[var15] < class19.field244[var15].length) {
                    var14.method1777(class206.field3274[var15], class19.field244[var15][this.field4154[var15]]);
                }
            }
            var4 = var14.method1775(64, 768, -50, -10, -50);
            class184.field2917.method488(var4, (byte) 49, this.field4157);
        }
        if (arg1 != null) {
            var4 = arg1.method422(-87, arg2, var4);
        }
        return var4;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(Z)V", line = 476)
    public static void method1666(boolean arg0) {
        field4153 = null;
        field4167 = null;
        field4171 = null;
        if (!arg0) {
            field4170 = null;
            field4169 = null;
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(IIZIIIIIIIBI)Z", line = 493)
    public static final boolean method1667(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, byte arg10, int arg11) {
        field4149++;
        for (int var12 = 0; var12 < 104; var12++) {
            for (int var13 = 0; var13 < 104; var13++) {
                class93.field1437[var12][var13] = 0;
                class111.field1695[var12][var13] = 99999999;
            }
        }
        int var14 = arg5;
        class93.field1437[arg5][arg3] = 99;
        class111.field1695[arg5][arg3] = 0;
        int var15 = arg3;
        byte var16 = 0;
        class59.field965[var16] = arg5;
        int var17 = 0;
        int var32 = var16 + 1;
        class296.field4931[var16] = arg3;
        if (arg10 >= -114) {
            field4170 = (int[]) null;
        }
        int[][] var18 = class217.field3510[class10.field189].field4356;
        boolean var19 = false;
        while (var32 != var17) {
            var15 = class296.field4931[var17];
            var14 = class59.field965[var17];
            var17 = var17 + 1 & 0xFFF;
            if (arg9 == var14 && arg6 == var15) {
                var19 = true;
                break;
            }
            if (arg4 != 0) {
                if ((arg4 < 5 || arg4 == 10) && class217.field3510[class10.field189].method1744(true, arg1, arg4 - 1, var15, var14, arg6, 2, arg9)) {
                    var19 = true;
                    break;
                }
                if (arg4 < 10 && class217.field3510[class10.field189].method1751(var15, var14, arg4 - 1, arg6, arg9, 2, true, arg1)) {
                    var19 = true;
                    break;
                }
            }
            if (arg8 != 0 && arg11 != 0 && class217.field3510[class10.field189].method1749(arg9, arg7, arg6, (byte) 48, 2, var14, arg8, arg11, var15)) {
                var19 = true;
                break;
            }
            int var20 = class111.field1695[var14][var15] + 1;
            if (var14 > 0 && class93.field1437[var14 - 1][var15] == 0 && (var18[var14 - 1][var15] & 0x12C010E) == 0 && (var18[var14 - 1][var15 + 1] & 0x12C0138) == 0) {
                class59.field965[var32] = var14 - 1;
                class296.field4931[var32] = var15;
                var32 = var32 + 1 & 0xFFF;
                class93.field1437[var14 - 1][var15] = 2;
                class111.field1695[var14 - 1][var15] = var20;
            }
            if (var14 < 102 && class93.field1437[var14 + 1][var15] == 0 && (var18[var14 + 2][var15] & 0x12C0183) == 0 && (var18[var14 + 2][var15 + 1] & 0x12C01E0) == 0) {
                class59.field965[var32] = var14 + 1;
                class296.field4931[var32] = var15;
                class93.field1437[var14 + 1][var15] = 8;
                var32 = var32 + 1 & 0xFFF;
                class111.field1695[var14 + 1][var15] = var20;
            }
            if (var15 > 0 && class93.field1437[var14][var15 - 1] == 0 && (var18[var14][var15 - 1] & 0x12C010E) == 0 && (var18[var14 + 1][var15 - 1] & 0x12C0183) == 0) {
                class59.field965[var32] = var14;
                class296.field4931[var32] = var15 - 1;
                class93.field1437[var14][var15 - 1] = 1;
                class111.field1695[var14][var15 - 1] = var20;
                var32 = var32 + 1 & 0xFFF;
            }
            if (var15 < 102 && class93.field1437[var14][var15 + 1] == 0 && (var18[var14][var15 + 2] & 0x12C0138) == 0 && (var18[var14 + 1][var15 + 2] & 0x12C01E0) == 0) {
                class59.field965[var32] = var14;
                class296.field4931[var32] = var15 + 1;
                class93.field1437[var14][var15 + 1] = 4;
                class111.field1695[var14][var15 + 1] = var20;
                var32 = var32 + 1 & 0xFFF;
            }
            if (var14 > 0 && var15 > 0 && class93.field1437[var14 - 1][var15 - 1] == 0 && (var18[var14 - 1][var15] & 0x12C0138) == 0 && (var18[var14 - 1][var15 - 1] & 0x12C010E) == 0 && (var18[var14][var15 - 1] & 0x12C0183) == 0) {
                class59.field965[var32] = var14 - 1;
                class296.field4931[var32] = var15 - 1;
                class93.field1437[var14 - 1][var15 - 1] = 3;
                class111.field1695[var14 - 1][var15 - 1] = var20;
                var32 = var32 + 1 & 0xFFF;
            }
            if (var14 < 102 && var15 > 0 && class93.field1437[var14 + 1][var15 - 1] == 0 && (var18[var14 + 1][var15 - 1] & 0x12C010E) == 0 && (var18[var14 + 2][var15 - 1] & 0x12C0183) == 0 && (var18[var14 + 2][var15] & 0x12C01E0) == 0) {
                class59.field965[var32] = var14 + 1;
                class296.field4931[var32] = var15 - 1;
                var32 = var32 + 1 & 0xFFF;
                class93.field1437[var14 + 1][var15 - 1] = 9;
                class111.field1695[var14 + 1][var15 - 1] = var20;
            }
            if (var14 > 0 && var15 < 102 && class93.field1437[var14 - 1][var15 + 1] == 0 && (var18[var14 - 1][var15 + 1] & 0x12C010E) == 0 && (var18[var14 - 1][var15 + 2] & 0x12C0138) == 0 && (var18[var14][var15 + 2] & 0x12C01E0) == 0) {
                class59.field965[var32] = var14 - 1;
                class296.field4931[var32] = var15 + 1;
                var32 = var32 + 1 & 0xFFF;
                class93.field1437[var14 - 1][var15 + 1] = 6;
                class111.field1695[var14 - 1][var15 + 1] = var20;
            }
            if (var14 < 102 && var15 < 102 && class93.field1437[var14 + 1][var15 + 1] == 0 && (var18[var14 + 1][var15 + 2] & 0x12C0138) == 0 && (var18[var14 + 2][var15 + 2] & 0x12C01E0) == 0 && (var18[var14 + 2][var15 + 1] & 0x12C0183) == 0) {
                class59.field965[var32] = var14 + 1;
                class296.field4931[var32] = var15 + 1;
                var32 = var32 + 1 & 0xFFF;
                class93.field1437[var14 + 1][var15 + 1] = 12;
                class111.field1695[var14 + 1][var15 + 1] = var20;
            }
        }
        class82.field1252 = 0;
        if (!var19) {
            if (!arg2) {
                return false;
            }
            int var21 = 1000;
            int var22 = 100;
            byte var23 = 10;
            for (int var24 = arg9 - var23; var24 <= (arg9 + var23); var24++) {
                for (int var25 = arg6 - var23; var25 <= arg6 + var23; var25++) {
                    if (var24 >= 0 && var25 >= 0 && var24 < 104 && var25 < 104 && class111.field1695[var24][var25] < 100) {
                        int var26 = 0;
                        int var27 = 0;
                        if (var25 < arg6) {
                            var27 = arg6 - var25;
                        } else if (arg6 + arg11 - 1 < var25) {
                            var27 = var25 + 1 - arg11 - arg6;
                        }
                        if (var24 < arg9) {
                            var26 = arg9 - var24;
                        } else if (arg8 + arg9 - 1 < var24) {
                            var26 = var24 + 1 - (arg8 + arg9);
                        }
                        int var28 = var26 * var26 + var27 * var27;
                        if (var21 > var28 || var21 == var28 && var22 > class111.field1695[var24][var25]) {
                            var14 = var24;
                            var15 = var25;
                            var22 = class111.field1695[var24][var25];
                            var21 = var28;
                        }
                    }
                }
            }
            if (var21 == 1000) {
                return false;
            }
            if (arg5 == var14 && arg3 == var15) {
                return false;
            }
            class82.field1252 = 1;
        }
        byte var29 = 0;
        class59.field965[var29] = var14;
        int var33 = var29 + 1;
        class296.field4931[var29] = var15;
        int var30;
        int var31 = var30 = class93.field1437[var14][var15];
        while (arg5 != var14 || arg3 != var15) {
            if (var30 != var31) {
                var30 = var31;
                class59.field965[var33] = var14;
                class296.field4931[var33++] = var15;
            }
            if ((var31 & 0x2) != 0) {
                var14++;
            } else if ((var31 & 0x8) != 0) {
                var14--;
            }
            if ((var31 & 0x1) != 0) {
                var15++;
            } else if ((var31 & 0x4) != 0) {
                var15--;
            }
            var31 = class93.field1437[var14][var15];
        }
        if (var33 > 0) {
            class6.method84((byte) -89, var33, arg0);
            return true;
        } else if (arg0 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(Z[I[III)V", line = 891)
    public final void method1668(boolean arg0, int[] arg1, int[] arg2, int arg3, int arg4) {
        field4151++;
        if (arg1 == null) {
            arg1 = new int[12];
            for (int var6 = 0; var6 < 7; var6++) {
                for (int var7 = 0; var7 < class86.field1307; var7++) {
                    class261 var8 = class293.method1950(var7, (byte) 97);
                    if (var8 != null && !var8.field4192 && var8.field4174 == (arg0 ? 7 : 0) + var6) {
                        arg1[class75.field1168[var6]] = class156.method998(Integer.MIN_VALUE, var7);
                        break;
                    }
                }
            }
        }
        if (arg3 != 12) {
            field4169 = (class36) null;
        }
        this.field4156 = arg0;
        this.field4154 = arg2;
        this.field4161 = arg1;
        this.field4155 = arg4;
        this.method1660((byte) -23);
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(III)V", line = 942)
    public final void method1669(int arg0, int arg1, int arg2) {
        field4162++;
        if (arg1 != -754654335) {
            field4166 = true;
        }
        this.field4154[arg2] = arg0;
        this.method1660((byte) -23);
    }

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "(I)V", line = 964)
    public static final void method1670(int arg0) {
        class281.field4639 = null;
        class237.field3801 = null;
        field4159++;
        if (arg0 != 5) {
            return;
        }
        class164.field2579 = null;
        class73.field1130 = null;
        class254.field4086 = null;
        class174.field2791 = null;
        class189.field2982 = null;
        class111.field1704 = null;
        class102.field1558 = null;
        class198.field3172 = null;
        class140.field2245 = null;
        class289.field4748 = null;
        class110.field1683 = null;
        class240.field3846 = null;
        class8.field167 = null;
        class5.field129 = null;
        class246.field3985 = null;
        class134.field2162 = null;
        class208.field3325 = null;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(ILfj;)Ljf;", line = 1004)
    public static final class206 method1671(int arg0, class3 arg1) {
        if (arg0 != 21715) {
            method1672(-15, 72, 51, 101, -88, 16);
        }
        field4163++;
        return new class206(arg1.method59((byte) -68), arg1.method59((byte) -68), arg1.method59((byte) -68), arg1.method59((byte) -68), arg1.method59((byte) -68), arg1.method59((byte) -68), arg1.method59((byte) -68), arg1.method59((byte) -68), arg1.method48(64), arg1.method64((byte) -85));
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(IIIIII)V", line = 1016)
    public static final void method1672(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field4148++;
        class36.method282(arg2 + arg4, arg2 - arg4, arg0, class256.field4113[arg1], 26175);
        int var6 = 0;
        if (arg5 != 19661070) {
            field4166 = false;
        }
        int var7 = arg3;
        int var8 = arg3 * arg3;
        int var9 = arg4 * arg4;
        int var10 = var8 << 1;
        int var11 = var9 << 1;
        int var12 = arg3 << 1;
        int var13 = var8 - (var12 - 1) * var11;
        int var14 = var8 << 2;
        int var15 = var9 << 2;
        int var16 = ((var6 << 1) + 3) * var10;
        int var17 = (1 - var12) * var9 + var10;
        int var18 = ((arg3 << 1) - 3) * var11;
        int var19 = (arg3 - 1) * var15;
        int var20 = (var6 + 1) * var14;
        while (var7 > 0) {
            if (var17 < 0) {
                while (var17 < 0) {
                    var17 += var16;
                    var13 += var20;
                    var16 += var14;
                    var20 += var14;
                    var6++;
                }
            }
            var7--;
            if (var13 < 0) {
                var13 += var20;
                var17 += var16;
                var16 += var14;
                var20 += var14;
                var6++;
            }
            int var21 = arg1 + var7;
            var13 += -var18;
            var17 += -var19;
            var19 -= var15;
            var18 -= var15;
            int var22 = arg1 - var7;
            int var23 = arg2 - var6;
            int var24 = arg2 + var6;
            class36.method282(var24, var23, arg0, class256.field4113[var22], 26175);
            class36.method282(var24, var23, arg0, class256.field4113[var21], 26175);
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(IIZ)V", line = 1099)
    public final void method1673(int arg0, int arg1, boolean arg2) {
        field4165++;
        int var4 = class75.field1168[arg0];
        if (this.field4161[var4] != 0 && !arg2 && class293.method1950(arg1, (byte) 36) != null) {
            this.field4161[var4] = class156.method998(arg1, Integer.MIN_VALUE);
            this.method1660((byte) -23);
        }
    }
}
