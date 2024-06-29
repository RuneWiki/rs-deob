import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public class class56 {

    @OriginalMember(owner = "client!kj", name = "d", descriptor = "I")
    public static int field1008 = 0;

    @OriginalMember(owner = "client!kj", name = "j", descriptor = "I")
    public static int field1014 = 0;

    @OriginalMember(owner = "client!kj", name = "i", descriptor = "I")
    public static int field1013 = 0;

    @OriginalMember(owner = "client!kj", name = "q", descriptor = "I")
    public static volatile int field1021 = -1;

    @OriginalMember(owner = "client!kj", name = "n", descriptor = "[I")
    public static int[] field1018 = new int[5];

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "I")
    public static int field1005;

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "I")
    public int field1006;

    @OriginalMember(owner = "client!kj", name = "c", descriptor = "I")
    public static int field1007;

    @OriginalMember(owner = "client!kj", name = "g", descriptor = "I")
    public static int field1011;

    @OriginalMember(owner = "client!kj", name = "h", descriptor = "I")
    public static int field1012;

    @OriginalMember(owner = "client!kj", name = "k", descriptor = "I")
    public static int field1015;

    @OriginalMember(owner = "client!kj", name = "m", descriptor = "I")
    public static int field1017;

    @OriginalMember(owner = "client!kj", name = "o", descriptor = "I")
    public static int field1019;

    @OriginalMember(owner = "client!kj", name = "r", descriptor = "I")
    public static int field1022;

    @OriginalMember(owner = "client!kj", name = "u", descriptor = "I")
    public static int field1025;

    @OriginalMember(owner = "client!kj", name = "v", descriptor = "I")
    public static int field1026;

    @OriginalMember(owner = "client!kj", name = "w", descriptor = "I")
    public static int field1027;

    @OriginalMember(owner = "client!kj", name = "e", descriptor = "J")
    private long field1009;

    @OriginalMember(owner = "client!kj", name = "l", descriptor = "J")
    private long field1016;

    @OriginalMember(owner = "client!kj", name = "t", descriptor = "Lpd;")
    public static class196 field1024;

    @OriginalMember(owner = "client!kj", name = "s", descriptor = "Z")
    public boolean field1023;

    @OriginalMember(owner = "client!kj", name = "f", descriptor = "[I")
    private int[] field1010;

    @OriginalMember(owner = "client!kj", name = "p", descriptor = "[I")
    private int[] field1020;

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(I)V")
    private final void method329(int arg0) {
        field1007++;
        long var2 = this.field1009;
        long[] var4 = class257.field4497;
        this.field1009 = -1L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field1009 = this.field1009 >>> 8 ^ var4[(int) (((long) (this.field1020[var5] >> 24) ^ this.field1009) & 0xFFL)];
            this.field1009 = this.field1009 >>> 8 ^ var4[(int) ((this.field1009 ^ (long) (this.field1020[var5] >> 16)) & 0xFFL)];
            this.field1009 = var4[(int) ((this.field1009 ^ (long) (this.field1020[var5] >> 8)) & 0xFFL)] ^ this.field1009 >>> 8;
            this.field1009 = var4[(int) ((this.field1009 ^ (long) this.field1020[var5]) & 0xFFL)] ^ this.field1009 >>> 8;
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field1009 = this.field1009 >>> 8 ^ var4[(int) (((long) this.field1010[var6] ^ this.field1009) & 0xFFL)];
        }
        this.field1009 = var4[(int) (((long) (this.field1023 ? 1 : 0) ^ this.field1009) & 0xFFL)] ^ this.field1009 >>> 8;
        if (var2 != 0L && this.field1009 != var2) {
            class197.field3375.method1731(var2, (byte) -85);
        }
        if (arg0 != 1004522736) {
            this.field1006 = 74;
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "([IZZ[II)V")
    public final void method330(int[] arg0, boolean arg1, boolean arg2, int[] arg3, int arg4) {
        if (arg3 == null) {
            arg3 = new int[12];
            for (int var6 = 0; var6 < 7; var6++) {
                for (int var7 = 0; var7 < class173.field2886; var7++) {
                    class64 var8 = class204.method1305(3, var7);
                    if (var8 != null && !var8.field1176 && var8.field1175 == (arg1 ? 7 : 0) + var6) {
                        arg3[class21.field383[var6]] = class246.method1640(Integer.MIN_VALUE, var7);
                        break;
                    }
                }
            }
        }
        this.field1023 = arg1;
        this.field1020 = arg3;
        this.field1006 = arg4;
        field1012++;
        this.field1010 = arg0;
        if (!arg2) {
            this.method329(1004522736);
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(Lqe;IIILqe;)Lbf;")
    public final class48 method331(class51 arg0, int arg1, int arg2, int arg3, class51 arg4) {
        field1022++;
        if (this.field1006 != -1) {
            return class59.method362(-32544, this.field1006).method929(arg3, arg4, (byte) 38, arg0, arg1);
        } else if (arg2 == 12) {
            long var6 = this.field1009;
            int[] var8 = this.field1020;
            if (arg0 != null && (arg0.field901 >= 0 || arg0.field894 >= 0)) {
                var8 = new int[12];
                for (int var9 = 0; var9 < 12; var9++) {
                    var8[var9] = this.field1020[var9];
                }
                if (arg0.field901 >= 0) {
                    if (arg0.field901 == 65535) {
                        var6 ^= 0xFFFFFFFF00000000L;
                        var8[5] = 0;
                    } else {
                        var8[5] = class246.method1640(1073741824, arg0.field901);
                        var6 ^= (long) var8[5] << 32;
                    }
                }
                if (arg0.field894 >= 0) {
                    if (arg0.field894 == 65535) {
                        var6 ^= 0xFFFFFFFFL;
                        var8[3] = 0;
                    } else {
                        var8[3] = class246.method1640(1073741824, arg0.field894);
                        var6 ^= (long) var8[3];
                    }
                }
            }
            class48 var10 = (class48) class197.field3375.method1735(var6, (byte) -69);
            if (var10 == null) {
                boolean var11 = false;
                for (int var12 = 0; var12 < 12; var12++) {
                    int var30 = var8[var12];
                    if ((var30 & 0x40000000) == 0) {
                        if ((var30 & Integer.MIN_VALUE) != 0 && !class204.method1305(3, var30 & 0x3FFFFFFF).method402(true)) {
                            var11 = true;
                        }
                    } else if (!class133.method815(var30 & 0x3FFFFFFF, (byte) -70).method1132(this.field1023, (byte) -61)) {
                        var11 = true;
                    }
                }
                if (var11) {
                    if (this.field1016 != -1L) {
                        var10 = (class48) class197.field3375.method1735(this.field1016, (byte) -69);
                    }
                    if (var10 == null) {
                        return null;
                    }
                }
                if (var10 == null) {
                    class93[] var13 = new class93[12];
                    int var14 = 0;
                    for (int var15 = 0; var15 < 12; var15++) {
                        int var27 = var8[var15];
                        if ((var27 & 0x40000000) != 0) {
                            class93 var28 = class133.method815(var27 & 0x3FFFFFFF, (byte) -70).method1136(this.field1023, 0);
                            if (var28 != null) {
                                var13[var14++] = var28;
                            }
                        } else if ((var27 & Integer.MIN_VALUE) != 0) {
                            class93 var29 = class204.method1305(3, var27 & 0x3FFFFFFF).method407((byte) -65);
                            if (var29 != null) {
                                var13[var14++] = var29;
                            }
                        }
                    }
                    int var16 = var8[0];
                    if ((var16 & 0x40000000) != 0) {
                        class178 var17 = class133.method815(var16 & 0x3FFFFFFF, (byte) -70);
                        if (var17.field3015 != null) {
                            for (int var18 = 0; var18 < var17.field3015.length; var18++) {
                                if (var17.field3015[var18] != null && var13[var18 + 1] != null) {
                                    int var19 = var17.field3015[var18][0];
                                    int var20 = var17.field3015[var18][3];
                                    int var21 = var17.field3015[var18][1];
                                    int var22 = var17.field3015[var18][2];
                                    int var23 = var17.field3015[var18][4];
                                    int var24 = var17.field3015[var18][5];
                                    var13[var18 + 1].method569(var19, var21, var22);
                                    var13[var18 + 1].method563(var20, var23, var24);
                                }
                            }
                        }
                    }
                    class93 var25 = new class93(var13, var14);
                    for (int var26 = 0; var26 < 5; var26++) {
                        if (class222.field3761[var26].length > this.field1010[var26]) {
                            var25.method553(class207.field3515[var26], class222.field3761[var26][this.field1010[var26]]);
                        }
                        if (this.field1010[var26] < class205.field3487[var26].length) {
                            var25.method553(class201.field3451[var26], class205.field3487[var26][this.field1010[var26]]);
                        }
                    }
                    var10 = var25.method560(64, 850, -30, -50, -30);
                    class197.field3375.method1730(var10, var6, (byte) -114);
                    this.field1016 = var6;
                }
            }
            if (arg0 == null && arg4 == null) {
                return var10;
            }
            class48 var31;
            if (arg0 != null && arg4 != null) {
                var31 = arg0.method298(arg3, arg1, -5, var10, arg4);
            } else if (arg0 == null) {
                var31 = arg4.method296(1388270704, arg3, var10);
            } else {
                var31 = arg0.method296(1388270704, arg1, var10);
            }
            return var31;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(III)V")
    public final void method332(int arg0, int arg1, int arg2) {
        int var4 = class21.field383[arg0];
        field1019++;
        if (this.field1020[var4] == 0 || class204.method1305(3, arg2) == null) {
            return;
        }
        if (arg1 <= 48) {
            this.method333(-128, -69, 126);
        }
        this.field1020[var4] = class246.method1640(arg2, Integer.MIN_VALUE);
        this.method329(1004522736);
    }

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "(III)V")
    public final void method333(int arg0, int arg1, int arg2) {
        field1005++;
        this.field1010[arg0] = arg1;
        this.method329(1004522736);
        if (arg2 != 28545) {
            this.field1016 = -88L;
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(IIILqe;I)Lbf;")
    public final class48 method334(int arg0, int arg1, int arg2, class51 arg3, int arg4) {
        field1015++;
        long var6 = (long) arg0 | (long) arg0 << 32 | (long) (arg2 << 16);
        class48 var8 = (class48) class171.field2866.method1735(var6, (byte) -69);
        if (var8 == null) {
            class93[] var9 = new class93[2];
            int var10 = 0;
            if (!class204.method1305(3, arg0).method405((byte) 114) || !class204.method1305(3, arg2).method405((byte) 114)) {
                return null;
            }
            class93 var11 = class204.method1305(3, arg0).method403(-1);
            if (var11 != null) {
                var9[var10++] = var11;
            }
            class93 var12 = class204.method1305(3, arg2).method403(-1);
            if (var12 != null) {
                var9[var10++] = var12;
            }
            class93 var13 = new class93(var9, var10);
            for (int var14 = 0; var14 < 5; var14++) {
                if (this.field1010[var14] < class222.field3761[var14].length) {
                    var13.method553(class207.field3515[var14], class222.field3761[var14][this.field1010[var14]]);
                }
                if (class205.field3487[var14].length > this.field1010[var14]) {
                    var13.method553(class201.field3451[var14], class205.field3487[var14][this.field1010[var14]]);
                }
            }
            var8 = var13.method560(64, 768, -50, -10, -50);
            class171.field2866.method1730(var8, var6, (byte) -128);
        }
        if (arg3 != null) {
            var8 = arg3.method302(var8, arg1, (byte) -106);
        }
        if (arg4 >= -75) {
            field1024 = null;
        }
        return var8;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(B)V")
    public static void method335(byte arg0) {
        field1024 = null;
        if (arg0 >= -25) {
            field1018 = null;
        }
        field1018 = null;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(ILqe;I)Lbf;")
    public final class48 method336(int arg0, class51 arg1, int arg2) {
        field1011++;
        if (this.field1006 != -1) {
            return class59.method362(arg0 ^ 0xFFFFDEA0, this.field1006).method931(arg2, arg1, 28884);
        }
        if (arg0 != 24128) {
            this.field1016 = 118L;
        }
        class48 var4 = (class48) class171.field2866.method1735(this.field1009, (byte) -69);
        if (var4 == null) {
            boolean var5 = false;
            for (int var6 = 0; var6 < 12; var6++) {
                int var15 = this.field1020[var6];
                if ((var15 & 0x40000000) == 0) {
                    if ((var15 & Integer.MIN_VALUE) != 0 && !class204.method1305(3, var15 & 0x3FFFFFFF).method405((byte) 114)) {
                        var5 = true;
                    }
                } else if (!class133.method815(var15 & 0x3FFFFFFF, (byte) -70).method1134(this.field1023, 0)) {
                    var5 = true;
                }
            }
            if (var5) {
                return null;
            }
            class93[] var7 = new class93[12];
            int var8 = 0;
            for (int var9 = 0; var9 < 12; var9++) {
                int var12 = this.field1020[var9];
                if ((var12 & 0x40000000) != 0) {
                    class93 var14 = class133.method815(var12 & 0x3FFFFFFF, (byte) -70).method1141(39, this.field1023);
                    if (var14 != null) {
                        var7[var8++] = var14;
                    }
                } else if ((var12 & Integer.MIN_VALUE) != 0) {
                    class93 var13 = class204.method1305(3, var12 & 0x3FFFFFFF).method403(arg0 - 24129);
                    if (var13 != null) {
                        var7[var8++] = var13;
                    }
                }
            }
            class93 var10 = new class93(var7, var8);
            for (int var11 = 0; var11 < 5; var11++) {
                if (class222.field3761[var11].length > this.field1010[var11]) {
                    var10.method553(class207.field3515[var11], class222.field3761[var11][this.field1010[var11]]);
                }
                if (class205.field3487[var11].length > this.field1010[var11]) {
                    var10.method553(class201.field3451[var11], class205.field3487[var11][this.field1010[var11]]);
                }
            }
            var4 = var10.method560(64, 768, -50, -10, -50);
            class171.field2866.method1730(var4, this.field1009, (byte) 65);
        }
        if (arg1 != null) {
            var4 = arg1.method302(var4, arg2, (byte) -96);
        }
        return var4;
    }

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "(I)I")
    public final int method337(int arg0) {
        field1027++;
        if (arg0 >= -48) {
            return 3;
        } else if (this.field1006 == -1) {
            return (this.field1020[8] << 10) + (this.field1020[0] << 15) + (this.field1010[4] << 20) + (this.field1020[11] << 5) + (this.field1010[0] << 25) + this.field1020[1];
        } else {
            return class59.method362(-32544, this.field1006).field2526 + 305419896;
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method338(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1017++;
        if (arg6 != 65535 || arg2 < 1 || arg1 < 1 || arg2 > 102 || arg1 > 102) {
            return;
        }
        if (!class34.method178(true) && (class40.field654[0][arg2][arg1] & 0x2) == 0) {
            int var8 = arg3;
            if ((class40.field654[arg3][arg2][arg1] & 0x8) != 0) {
                var8 = 0;
            }
            if (class14.field269 != var8) {
                return;
            }
        }
        int var9 = arg3;
        if (arg3 < 3 && (class40.field654[1][arg2][arg1] & 0x2) == 2) {
            var9 = arg3 + 1;
        }
        class77.method456(arg1, var9, arg3, arg4, class78.field1370[arg3], arg2, arg6 ^ 0xFF9F);
        if (arg0 < 0) {
            return;
        }
        boolean var10 = class254.field4463;
        class254.field4463 = true;
        class225.method1421(arg5, arg2, false, arg0, arg3, false, class78.field1370[arg3], var9, -94, arg1, arg7);
        class254.field4463 = var10;
        return;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(ZI)V")
    public final void method339(boolean arg0, int arg1) {
        this.field1023 = arg0;
        field1026++;
        if (arg1 < -92) {
            this.method329(1004522736);
        }
    }
}
