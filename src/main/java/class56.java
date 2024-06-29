import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class56 extends class149 {

    @OriginalMember(owner = "client!g", name = "R", descriptor = "I")
    public int field1017 = 0;

    @OriginalMember(owner = "client!g", name = "U", descriptor = "Z")
    public boolean field1020 = true;

    @OriginalMember(owner = "client!g", name = "cb", descriptor = "I")
    public int field1028 = -1;

    @OriginalMember(owner = "client!g", name = "db", descriptor = "I")
    public int field1029 = -1;

    @OriginalMember(owner = "client!g", name = "Y", descriptor = "Z")
    public static boolean field1024 = false;

    @OriginalMember(owner = "client!g", name = "gb", descriptor = "Lsg;")
    public static class169 field1032 = class165.method1060("<col=ff7000>", 1536);

    @OriginalMember(owner = "client!g", name = "hb", descriptor = "Ljava/lang/Object;")
    public static Object field1033 = new Object();

    @OriginalMember(owner = "client!g", name = "mb", descriptor = "Lsg;")
    public static class169 field1038 = class165.method1060("http:)4)4www)3runescape)3com", 1536);

    @OriginalMember(owner = "client!g", name = "kb", descriptor = "I")
    public static int field1036 = 5063219;

    @OriginalMember(owner = "client!g", name = "jb", descriptor = "Lsg;")
    public static class169 field1035 = class165.method1060("<col=ffff00>", 1536);

    @OriginalMember(owner = "client!g", name = "ob", descriptor = "I")
    public static int field1040 = 0;

    @OriginalMember(owner = "client!g", name = "qb", descriptor = "Lsg;")
    private static class169 field1042 = class165.method1060("Please wait 1 minute and try again)3", 1536);

    @OriginalMember(owner = "client!g", name = "lb", descriptor = "I")
    public static int field1037 = 0;

    @OriginalMember(owner = "client!g", name = "pb", descriptor = "Lsg;")
    public static class169 field1041 = field1042;

    @OriginalMember(owner = "client!g", name = "nb", descriptor = "Lsg;")
    public static class169 field1039 = field1042;

    @OriginalMember(owner = "client!g", name = "P", descriptor = "I")
    public int field1015;

    @OriginalMember(owner = "client!g", name = "Q", descriptor = "I")
    public static int field1016;

    @OriginalMember(owner = "client!g", name = "S", descriptor = "I")
    public static int field1018;

    @OriginalMember(owner = "client!g", name = "T", descriptor = "I")
    public int field1019;

    @OriginalMember(owner = "client!g", name = "V", descriptor = "I")
    public static int field1021;

    @OriginalMember(owner = "client!g", name = "W", descriptor = "I")
    public int field1022;

    @OriginalMember(owner = "client!g", name = "X", descriptor = "I")
    public static int field1023;

    @OriginalMember(owner = "client!g", name = "Z", descriptor = "I")
    public int field1025;

    @OriginalMember(owner = "client!g", name = "ab", descriptor = "I")
    public static int field1026;

    @OriginalMember(owner = "client!g", name = "bb", descriptor = "I")
    public int field1027;

    @OriginalMember(owner = "client!g", name = "eb", descriptor = "I")
    public static int field1030;

    @OriginalMember(owner = "client!g", name = "fb", descriptor = "I")
    public static int field1031;

    @OriginalMember(owner = "client!g", name = "ib", descriptor = "I")
    public int field1034;

    @OriginalMember(owner = "client!g", name = "f", descriptor = "(I)V")
    public static void method349(int arg0) {
        field1041 = null;
        field1038 = null;
        field1032 = null;
        field1033 = null;
        field1039 = null;
        field1042 = null;
        field1035 = null;
        if (arg0 != -1) {
            method353(-60, 49, -51, 127, 23, -112, -92, null, null, 24);
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IB)V")
    private final void method350(int arg0, byte arg1) {
        field1018++;
        double var3 = (double) (arg0 & 0xFF) / 256.0D;
        double var5 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
        double var7 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
        double var9 = var5;
        int var11 = 39 % ((49 - arg1) / 57);
        if (var7 < var5) {
            var9 = var7;
        }
        double var12 = 0.0D;
        if (var3 < var9) {
            var9 = var3;
        }
        double var14 = var5;
        if (var7 > var5) {
            var14 = var7;
        }
        if (var14 < var3) {
            var14 = var3;
        }
        double var16 = 0.0D;
        double var18 = (var9 + var14) / 2.0D;
        if (var9 != var14) {
            if (var5 == var14) {
                var12 = (var7 - var3) / (var14 - var9);
            } else if (var7 == var14) {
                var12 = (var3 - var5) / (-var9 + var14) + 2.0D;
            } else if (var3 == var14) {
                var12 = (var5 - var7) / (var14 - var9) + 4.0D;
            }
            if (var18 < 0.5D) {
                var16 = (var14 - var9) / (var9 + var14);
            }
            if (var18 >= 0.5D) {
                var16 = (var14 - var9) / (2.0D - var14 - var9);
            }
        }
        this.field1025 = (int) (var16 * 256.0D);
        if (this.field1025 < 0) {
            this.field1025 = 0;
        } else if (this.field1025 > 255) {
            this.field1025 = 255;
        }
        double var20 = var12 / 6.0D;
        this.field1034 = (int) (var20 * 256.0D);
        this.field1019 = (int) (var18 * 256.0D);
        if (this.field1019 < 0) {
            this.field1019 = 0;
        } else if (this.field1019 > 255) {
            this.field1019 = 255;
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(Loa;IIZ)V")
    private final void method351(class127 arg0, int arg1, int arg2, boolean arg3) {
        if (arg1 == 1) {
            this.field1017 = arg0.method773((byte) -123);
        } else if (arg1 == 2) {
            this.field1029 = arg0.method819((byte) 22);
        } else if (arg1 == 3) {
            this.field1029 = arg0.method785(true);
            if (this.field1029 == 65535) {
                this.field1029 = -1;
            }
        } else if (arg1 == 5) {
            this.field1020 = false;
        } else if (arg1 == 7) {
            this.field1028 = arg0.method773((byte) -125);
        } else if (arg1 != 8 && arg1 == 9) {
            arg0.method785(true);
        }
        if (!arg3) {
            field1026 = -100;
        }
        field1021++;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(ILoa;I)V")
    public final void method352(int arg0, class127 arg1, int arg2) {
        while (true) {
            int var4 = arg1.method819((byte) 22);
            if (var4 == 0) {
                int var5 = -33 / ((arg0 - 28) / 47);
                field1031++;
                return;
            }
            this.method351(arg1, var4, arg2, true);
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IIIIIIILvb;Log;I)V")
    public static final void method353(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class191 arg7, class133 arg8, int arg9) {
        field1016++;
        class17 var10 = class138.method925(6, arg9);
        int var11;
        int var12;
        if (arg2 == 1 || arg2 == 3) {
            var11 = var10.field369;
            var12 = var10.field400;
        } else {
            var11 = var10.field400;
            var12 = var10.field369;
        }
        int var13;
        int var14;
        if (arg6 + var11 > 104) {
            var13 = arg6 + 1;
            var14 = arg6;
        } else {
            var13 = (var11 + 1 >> 1) + arg6;
            var14 = (var11 >> 1) + arg6;
        }
        int[][] var15 = class139.field2588[arg4];
        int var16;
        int var17;
        if (arg1 + var12 <= 104) {
            var16 = arg1 + (var12 + 1 >> 1);
            var17 = (var12 >> 1) + arg1;
        } else {
            var17 = arg1;
            var16 = arg1 + 1;
        }
        int var18 = var15[var16][var14] + var15[var17][var14] + var15[var17][var13] + var15[var16][var13] >> 2;
        int var19 = (arg1 << 7) + (var12 << 6);
        int var20 = (arg6 << 7) + arg1 + (arg9 << 14) + 1073741824;
        if (var10.field402 == 0) {
            var20 += Integer.MIN_VALUE;
        }
        int var21 = (arg6 << 7) + (var11 << 6);
        int var22 = (arg2 << 6) + arg5;
        if (var10.field375 == 1) {
            var22 += 256;
        }
        if (arg5 == 22) {
            class4 var23;
            if (var10.field359 == -1 && var10.field355 == null) {
                var23 = var10.method100(var15, var18, 22, arg2, arg0 ^ 0x61C1, var21, var19);
            } else {
                var23 = new class162(arg9, 22, arg2, arg4, arg1, arg6, var10.field359, true, null);
            }
            arg8.method900(arg3, arg1, arg6, var18, var23, var20, var22);
            if (var10.field360 == 1) {
                arg7.method1255(arg0 ^ 0xFFFFFFAE, arg6, arg1);
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class4 var46;
            if (var10.field359 == -1 && var10.field355 == null) {
                var46 = var10.method100(var15, var18, 10, arg2, 25024, var21, var19);
            } else {
                var46 = new class162(arg9, 10, arg2, arg4, arg1, arg6, var10.field359, true, null);
            }
            if (var46 != null) {
                arg8.method884(arg3, arg1, arg6, var18, var12, var11, var46, arg5 == 11 ? 256 : 0, var20, var22);
            }
            if (var10.field360 != 0) {
                arg7.method1259(arg1, true, arg6, var12, var11, var10.field399);
            }
        } else if (arg5 >= 12) {
            class4 var24;
            if (var10.field359 == -1 && var10.field355 == null) {
                var24 = var10.method100(var15, var18, arg5, arg2, 25024, var21, var19);
            } else {
                var24 = new class162(arg9, arg5, arg2, arg4, arg1, arg6, var10.field359, true, null);
            }
            arg8.method884(arg3, arg1, arg6, var18, 1, 1, var24, 0, var20, var22);
            if (var10.field360 != 0) {
                arg7.method1259(arg1, true, arg6, var12, var11, var10.field399);
            }
        } else if (arg5 == 0) {
            class4 var25;
            if (var10.field359 == -1 && var10.field355 == null) {
                var25 = var10.method100(var15, var18, 0, arg2, 25024, var21, var19);
            } else {
                var25 = new class162(arg9, 0, arg2, arg4, arg1, arg6, var10.field359, true, null);
            }
            arg8.method906(arg3, arg1, arg6, var18, var25, null, class58.field1092[arg2], 0, var20, var22);
            if (var10.field360 != 0) {
                arg7.method1266(arg6, var10.field399, arg2, arg1, false, arg5);
            }
        } else if (arg0 == arg5) {
            class4 var26;
            if (var10.field359 == -1 && var10.field355 == null) {
                var26 = var10.method100(var15, var18, 1, arg2, 25024, var21, var19);
            } else {
                var26 = new class162(arg9, 1, arg2, arg4, arg1, arg6, var10.field359, true, null);
            }
            arg8.method906(arg3, arg1, arg6, var18, var26, null, class107.field1960[arg2], 0, var20, var22);
            if (var10.field360 != 0) {
                arg7.method1266(arg6, var10.field399, arg2, arg1, false, arg5);
            }
        } else if (arg5 == 2) {
            int var27 = arg2 + 1 & 0x3;
            class4 var28;
            class4 var29;
            if (var10.field359 == -1 && var10.field355 == null) {
                var28 = var10.method100(var15, var18, 2, arg2 + 4, 25024, var21, var19);
                var29 = var10.method100(var15, var18, 2, var27, 25024, var21, var19);
            } else {
                var28 = new class162(arg9, 2, arg2 + 4, arg4, arg1, arg6, var10.field359, true, null);
                var29 = new class162(arg9, 2, var27, arg4, arg1, arg6, var10.field359, true, null);
            }
            arg8.method906(arg3, arg1, arg6, var18, var28, var29, class58.field1092[arg2], class58.field1092[var27], var20, var22);
            if (var10.field360 != 0) {
                arg7.method1266(arg6, var10.field399, arg2, arg1, false, arg5);
            }
        } else if (arg5 == 3) {
            class4 var30;
            if (var10.field359 == -1 && var10.field355 == null) {
                var30 = var10.method100(var15, var18, 3, arg2, arg0 ^ 0x61C1, var21, var19);
            } else {
                var30 = new class162(arg9, 3, arg2, arg4, arg1, arg6, var10.field359, true, null);
            }
            arg8.method906(arg3, arg1, arg6, var18, var30, null, class107.field1960[arg2], 0, var20, var22);
            if (var10.field360 != 0) {
                arg7.method1266(arg6, var10.field399, arg2, arg1, false, arg5);
            }
        } else if (arg5 == 9) {
            class4 var31;
            if (var10.field359 == -1 && var10.field355 == null) {
                var31 = var10.method100(var15, var18, arg5, arg2, 25024, var21, var19);
            } else {
                var31 = new class162(arg9, arg5, arg2, arg4, arg1, arg6, var10.field359, true, null);
            }
            arg8.method884(arg3, arg1, arg6, var18, 1, 1, var31, 0, var20, var22);
            if (var10.field360 != 0) {
                arg7.method1259(arg1, true, arg6, var12, var11, var10.field399);
            }
        } else if (arg5 == 4) {
            class4 var32;
            if (var10.field359 == -1 && var10.field355 == null) {
                var32 = var10.method100(var15, var18, 4, arg2, 25024, var21, var19);
            } else {
                var32 = new class162(arg9, 4, arg2, arg4, arg1, arg6, var10.field359, true, null);
            }
            arg8.method890(arg3, arg1, arg6, var18, var32, null, class58.field1092[arg2], 0, 0, 0, var20, var22);
        } else if (arg5 == 5) {
            int var33 = 16;
            int var34 = arg8.method896(arg3, arg1, arg6);
            if (var34 != 0) {
                var33 = class138.method925(6, var34 >> 14 & 0x7FFF).field379;
            }
            class4 var35;
            if (var10.field359 == -1 && var10.field355 == null) {
                var35 = var10.method100(var15, var18, 4, arg2, 25024, var21, var19);
            } else {
                var35 = new class162(arg9, 4, arg2, arg4, arg1, arg6, var10.field359, true, null);
            }
            arg8.method890(arg3, arg1, arg6, var18, var35, null, class58.field1092[arg2], 0, class6.field133[arg2] * var33, class89.field1621[arg2] * var33, var20, var22);
        } else if (arg5 == 6) {
            int var36 = 8;
            int var37 = arg8.method896(arg3, arg1, arg6);
            if (var37 != 0) {
                var36 = class138.method925(arg0 + 5, var37 >> 14 & 0x7FFF).field379 / 2;
            }
            class4 var38;
            if (var10.field359 == -1 && var10.field355 == null) {
                var38 = var10.method100(var15, var18, 4, arg2 + 4, 25024, var21, var19);
            } else {
                var38 = new class162(arg9, 4, arg2 + 4, arg4, arg1, arg6, var10.field359, true, null);
            }
            arg8.method890(arg3, arg1, arg6, var18, var38, null, 256, arg2, class178.field3469[arg2] * var36, class126.field2305[arg2] * var36, var20, var22);
        } else if (arg5 == 7) {
            int var39 = arg2 + 2 & 0x3;
            class4 var40;
            if (var10.field359 == -1 && var10.field355 == null) {
                var40 = var10.method100(var15, var18, 4, var39 + 4, 25024, var21, var19);
            } else {
                var40 = new class162(arg9, 4, var39 + 4, arg4, arg1, arg6, var10.field359, true, null);
            }
            arg8.method890(arg3, arg1, arg6, var18, var40, null, 256, var39, 0, 0, var20, var22);
        } else if (arg5 == 8) {
            int var41 = 8;
            int var42 = arg8.method896(arg3, arg1, arg6);
            int var43 = arg2 + 2 & 0x3;
            if (var42 != 0) {
                var41 = class138.method925(6, var42 >> 14 & 0x7FFF).field379 / 2;
            }
            class4 var44;
            class4 var45;
            if (var10.field359 == -1 && var10.field355 == null) {
                var44 = var10.method100(var15, var18, 4, arg2 + 4, 25024, var21, var19);
                var45 = var10.method100(var15, var18, 4, var43 + 4, 25024, var21, var19);
            } else {
                var44 = new class162(arg9, 4, arg2 + 4, arg4, arg1, arg6, var10.field359, true, null);
                var45 = new class162(arg9, 4, var43 + 4, arg4, arg1, arg6, var10.field359, true, null);
            }
            arg8.method890(arg3, arg1, arg6, var18, var44, var45, 256, arg2, class178.field3469[arg2] * var41, class126.field2305[arg2] * var41, var20, var22);
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(BII[B)I")
    public static final int method354(byte arg0, int arg1, int arg2, byte[] arg3) {
        field1030++;
        int var4 = -1;
        for (int var5 = arg1; var5 < arg2; var5++) {
            var4 = class94.field1756[(arg3[var5] ^ var4) & 0xFF] ^ var4 >>> 8;
        }
        if (arg0 > -64) {
            method349(-122);
        }
        return ~var4;
    }

    @OriginalMember(owner = "client!g", name = "g", descriptor = "(I)V")
    public final void method355(int arg0) {
        if (arg0 != -32460) {
            return;
        }
        if (this.field1028 != -1) {
            this.method350(this.field1028, (byte) -57);
            this.field1015 = this.field1019;
            this.field1022 = this.field1025;
            this.field1027 = this.field1034;
        }
        field1023++;
        this.method350(this.field1017, (byte) 118);
        class180.method1193(this.field1019, this.field1025, this.field1034, -22548);
    }
}
