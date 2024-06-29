import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class75 {

    @OriginalMember(owner = "client!ld", name = "i", descriptor = "[I")
    private int[] field1192;

    @OriginalMember(owner = "client!ld", name = "d", descriptor = "[I")
    private int[] field1187;

    @OriginalMember(owner = "client!ld", name = "q", descriptor = "[S")
    public static short[] field1200 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!ld", name = "l", descriptor = "[I")
    public static int[] field1195 = new int[2048];

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "S")
    public static short field1185 = 1;

    @OriginalMember(owner = "client!ld", name = "o", descriptor = "I")
    public static int field1198 = 0;

    @OriginalMember(owner = "client!ld", name = "u", descriptor = "Ldf;")
    public static class51 field1204 = class46.method233(" <col=ffffff>", 100);

    @OriginalMember(owner = "client!ld", name = "x", descriptor = "J")
    public static volatile long field1207 = 0L;

    @OriginalMember(owner = "client!ld", name = "w", descriptor = "Ldf;")
    public static class51 field1206 = class46.method233("Bitte warten Sie)3)3)3", 100);

    @OriginalMember(owner = "client!ld", name = "s", descriptor = "I")
    public static int field1202 = 2;

    @OriginalMember(owner = "client!ld", name = "C", descriptor = "Ldf;")
    private static class51 field1212 = class46.method233("Free world", 100);

    @OriginalMember(owner = "client!ld", name = "v", descriptor = "Ldf;")
    public static class51 field1205 = field1212;

    @OriginalMember(owner = "client!ld", name = "E", descriptor = "Lqh;")
    public static class189 field1214 = new class189(64);

    @OriginalMember(owner = "client!ld", name = "G", descriptor = "Ldf;")
    public static class51 field1216 = class46.method233("cookiehost", 100);

    @OriginalMember(owner = "client!ld", name = "F", descriptor = "[I")
    public static int[] field1215 = new int[2];

    @OriginalMember(owner = "client!ld", name = "g", descriptor = "F")
    public static float field1190;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "I")
    public static int field1184;

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "I")
    private int field1186;

    @OriginalMember(owner = "client!ld", name = "e", descriptor = "I")
    public static int field1188;

    @OriginalMember(owner = "client!ld", name = "h", descriptor = "I")
    public static int field1191;

    @OriginalMember(owner = "client!ld", name = "j", descriptor = "I")
    public static int field1193;

    @OriginalMember(owner = "client!ld", name = "k", descriptor = "I")
    private int field1194;

    @OriginalMember(owner = "client!ld", name = "m", descriptor = "I")
    public static int field1196;

    @OriginalMember(owner = "client!ld", name = "n", descriptor = "I")
    public static int field1197;

    @OriginalMember(owner = "client!ld", name = "r", descriptor = "I")
    private int field1201;

    @OriginalMember(owner = "client!ld", name = "t", descriptor = "I")
    private int field1203;

    @OriginalMember(owner = "client!ld", name = "y", descriptor = "I")
    public static int field1208;

    @OriginalMember(owner = "client!ld", name = "z", descriptor = "I")
    public static int field1209;

    @OriginalMember(owner = "client!ld", name = "A", descriptor = "I")
    public static int field1210;

    @OriginalMember(owner = "client!ld", name = "B", descriptor = "I")
    public static int field1211;

    @OriginalMember(owner = "client!ld", name = "D", descriptor = "I")
    public static int field1213;

    @OriginalMember(owner = "client!ld", name = "f", descriptor = "J")
    public static long field1189;

    @OriginalMember(owner = "client!ld", name = "p", descriptor = "[I")
    public static int[] field1199;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(I)V")
    private final void method533(int arg0) {
        field1209++;
        this.field1201 += ++this.field1186;
        if (arg0 != 3) {
            return;
        }
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field1187[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field1203 ^= this.field1203 << 13;
                } else {
                    this.field1203 ^= this.field1203 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field1203 ^= this.field1203 << 2;
            } else {
                this.field1203 ^= this.field1203 >>> 16;
            }
            this.field1203 += this.field1187[var2 + 128 & 0xFF];
            int var4;
            this.field1187[var2] = var4 = this.field1203 + this.field1187[class191.method1366(255, var3 >> 2)] + this.field1201;
            this.field1192[var2] = this.field1201 = this.field1187[class191.method1366(var4 >> 8 >> 2, 255)] + var3;
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(B)V")
    public static final void method534(byte arg0) {
        int var1 = -107 % ((42 - arg0) / 61);
        int var2 = class85.method655(-18901);
        field1208++;
        if (var2 == 0) {
            class92.field1522 = null;
            class63.method417(0, -1);
        } else if (var2 == 1) {
            class261.method1771((byte) 0, -28327);
            class63.method417(512, -1);
            class147.method1068((byte) 48);
        } else {
            class261.method1771((byte) (class182.field2994 - 4 & 0xFF), -28327);
            class63.method417(2, -1);
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(ZLdf;)Z")
    public static final boolean method535(boolean arg0, class51 arg1) {
        field1210++;
        if (arg1 == null) {
            return false;
        }
        if (arg0) {
            method540((byte) 112);
        }
        for (int var2 = 0; var2 < class108.field1844; var2++) {
            if (arg1.method292(true, class259.field4520[var2])) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "(I)V")
    private final void method536(int arg0) {
        field1211++;
        if (arg0 < 32) {
            return;
        }
        int var2 = -1640531527;
        int var3 = -1640531527;
        int var4 = -1640531527;
        int var5 = -1640531527;
        int var6 = -1640531527;
        int var7 = -1640531527;
        int var8 = -1640531527;
        int var9 = -1640531527;
        for (int var10 = 0; var10 < 4; var10++) {
            int var61 = var9 ^ var8 << 11;
            int var62 = var7 + var8;
            int var63 = var62 ^ var7 >>> 2;
            int var64 = var6 + var61;
            int var65 = var7 + var64;
            int var66 = var65 ^ var64 << 8;
            int var67 = var5 + var63;
            int var68 = var64 + var67;
            var6 = var68 ^ var67 >>> 16;
            int var69 = var3 + var6;
            int var70 = var4 + var66;
            int var71 = var67 + var70;
            var5 = var71 ^ var70 << 10;
            int var72 = var69 + var70;
            var4 = var72 ^ var69 >>> 4;
            int var73 = var2 + var5;
            int var74 = var69 + var73;
            int var75 = var4 + var61;
            var3 = var74 ^ var73 << 8;
            int var76 = var73 + var75;
            var2 = var76 ^ var75 >>> 9;
            var7 = var2 + var66;
            var8 = var3 + var63;
            var9 = var8 + var75;
        }
        for (int var11 = 0; var11 < 256; var11 += 8) {
            int var37 = this.field1192[var11 + 2] + var7;
            int var38 = this.field1192[var11 + 3] + var6;
            int var39 = this.field1192[var11 + 6] + var3;
            int var40 = this.field1192[var11 + 4] + var5;
            int var41 = this.field1192[var11 + 1] + var8;
            int var42 = this.field1192[var11] + var9;
            int var43 = var42 ^ var41 << 11;
            int var44 = this.field1192[var11 + 5] + var4;
            int var45 = this.field1192[var11 + 7] + var2;
            int var46 = var38 + var43;
            int var47 = var37 + var41;
            int var48 = var47 ^ var37 >>> 2;
            int var49 = var40 + var48;
            int var50 = var37 + var46;
            int var51 = var50 ^ var46 << 8;
            int var52 = var46 + var49;
            int var53 = var44 + var51;
            var6 = var52 ^ var49 >>> 16;
            int var54 = var49 + var53;
            int var55 = var6 + var39;
            var5 = var54 ^ var53 << 10;
            int var56 = var5 + var45;
            int var57 = var53 + var55;
            var4 = var57 ^ var55 >>> 4;
            int var58 = var4 + var43;
            int var59 = var55 + var56;
            var3 = var59 ^ var56 << 8;
            var8 = var3 + var48;
            int var60 = var56 + var58;
            var2 = var60 ^ var58 >>> 9;
            var9 = var8 + var58;
            var7 = var2 + var51;
            this.field1187[var11] = var9;
            this.field1187[var11 + 1] = var8;
            this.field1187[var11 + 2] = var7;
            this.field1187[var11 + 3] = var6;
            this.field1187[var11 + 4] = var5;
            this.field1187[var11 + 5] = var4;
            this.field1187[var11 + 6] = var3;
            this.field1187[var11 + 7] = var2;
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var13 = this.field1187[var12 + 7] + var2;
            int var14 = this.field1187[var12 + 5] + var4;
            int var15 = this.field1187[var12 + 4] + var5;
            int var16 = this.field1187[var12] + var9;
            int var17 = this.field1187[var12 + 3] + var6;
            int var18 = this.field1187[var12 + 6] + var3;
            int var19 = this.field1187[var12 + 2] + var7;
            int var20 = this.field1187[var12 + 1] + var8;
            int var21 = var16 ^ var20 << 11;
            int var22 = var19 + var20;
            int var23 = var17 + var21;
            int var24 = var22 ^ var19 >>> 2;
            int var25 = var15 + var24;
            int var26 = var19 + var23;
            int var27 = var26 ^ var23 << 8;
            int var28 = var23 + var25;
            int var29 = var14 + var27;
            var6 = var28 ^ var25 >>> 16;
            int var30 = var25 + var29;
            var5 = var30 ^ var29 << 10;
            int var31 = var5 + var13;
            int var32 = var6 + var18;
            int var33 = var29 + var32;
            var4 = var33 ^ var32 >>> 4;
            int var34 = var31 + var32;
            var3 = var34 ^ var31 << 8;
            var8 = var3 + var24;
            int var35 = var4 + var21;
            int var36 = var31 + var35;
            var2 = var36 ^ var35 >>> 9;
            var7 = var2 + var27;
            var9 = var8 + var35;
            this.field1187[var12] = var9;
            this.field1187[var12 + 1] = var8;
            this.field1187[var12 + 2] = var7;
            this.field1187[var12 + 3] = var6;
            this.field1187[var12 + 4] = var5;
            this.field1187[var12 + 5] = var4;
            this.field1187[var12 + 6] = var3;
            this.field1187[var12 + 7] = var2;
        }
        this.method533(3);
        this.field1194 = 256;
    }

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "(I)I")
    public final int method537(int arg0) {
        int var2 = -41 % ((-arg0 - 19) / 46);
        if (this.field1194-- == 0) {
            this.method533(3);
            this.field1194 = 255;
        }
        field1197++;
        return this.field1192[this.field1194];
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V")
    public static final void method538(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19) {
        if (arg3 == 0) {
            class98 var20 = new class98(arg10, arg11, arg12, arg13, -1, arg18, false);
            for (int var21 = arg0; var21 >= 0; var21--) {
                if (class27.field395[var21][arg1][arg2] == null) {
                    class27.field395[var21][arg1][arg2] = new class97(var21, arg1, arg2);
                }
            }
            class27.field395[arg0][arg1][arg2].field1618 = var20;
        } else if (arg3 == 1) {
            class98 var22 = new class98(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
            for (int var23 = arg0; var23 >= 0; var23--) {
                if (class27.field395[var23][arg1][arg2] == null) {
                    class27.field395[var23][arg1][arg2] = new class97(var23, arg1, arg2);
                }
            }
            class27.field395[arg0][arg1][arg2].field1618 = var22;
        } else {
            class199 var24 = new class199(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
            for (int var25 = arg0; var25 >= 0; var25--) {
                if (class27.field395[var25][arg1][arg2] == null) {
                    class27.field395[var25][arg1][arg2] = new class97(var25, arg1, arg2);
                }
            }
            class27.field395[arg0][arg1][arg2].field1619 = var24;
        }
    }

    @OriginalMember(owner = "client!ld", name = "<init>", descriptor = "()V")
    private class75() {
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIIIII)V")
    public static final void method539(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class242.method1660((byte) -79, class80.field1324[arg5], arg4, arg0 + arg3, arg0 - arg3);
        int var6 = 0;
        field1188++;
        int var7 = arg1;
        int var8 = arg3 * arg3;
        int var9 = arg1 * arg1;
        int var10 = var9 << 1;
        int var11 = var8 << 1;
        int var12 = var9 << 2;
        int var13 = ((var6 << 1) + 3) * var10;
        int var14 = arg1 << 1;
        int var15 = var8 << 2;
        int var16 = ((arg1 << 1) - 3) * var11;
        int var17 = var9 - ((arg2 + var14) * var11);
        int var18 = (arg1 - 1) * var15;
        int var19 = (1 - var14) * var8 + var10;
        int var20 = (var6 + 1) * var12;
        while (var7 > 0) {
            var7--;
            if (var19 < 0) {
                while (var19 < 0) {
                    var6++;
                    var17 += var20;
                    var20 += var12;
                    var19 += var13;
                    var13 += var12;
                }
            }
            if (var17 < 0) {
                var17 += var20;
                var19 += var13;
                var13 += var12;
                var6++;
                var20 += var12;
            }
            var17 += -var16;
            int var21 = arg5 + var7;
            int var22 = arg5 - var7;
            var19 += -var18;
            var16 -= var15;
            var18 -= var15;
            int var23 = arg0 + var6;
            int var24 = arg0 - var6;
            class242.method1660((byte) -79, class80.field1324[var22], arg4, var23, var24);
            class242.method1660((byte) -79, class80.field1324[var21], arg4, var23, var24);
        }
    }

    @OriginalMember(owner = "client!ld", name = "<init>", descriptor = "([I)V")
    public class75(int[] arg0) {
        this.field1192 = new int[256];
        this.field1187 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field1192[var2] = arg0[var2];
        }
        this.method536(50);
    }

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "(B)V")
    public static final void method540(byte arg0) {
        class227.method1564((byte) -102);
        class122.method921(true);
        class156.method1114(-13341);
        field1193++;
        class177.method1244(84);
        if (arg0 != 109) {
            method542(10, 40, 30);
        }
        class5.method23((byte) -14);
        class72.method500(arg0 ^ 0xEFE59D45);
        class210.method1440(false);
        class24.method132((byte) -100);
        class8.method39(false);
        class207.method1425(103);
        class20.method102((byte) 124);
        class23.method125((byte) -19);
        class103.method746((byte) -32);
        class52.method329(117);
        ((class66) class73.field1166).method458(false);
        class122.field2077.method1495(86);
        class39.field614.method815((byte) -30);
        class52.field882.method815((byte) 118);
        class111.field1885.method815((byte) -110);
        class176.field2883.method815((byte) -92);
        class143.field2392.method815((byte) -58);
        class149.field2493.method815((byte) -112);
        class51.field807.method815((byte) 118);
        class162.field2651.method815((byte) 126);
        class177.field2901.method815((byte) 126);
        class33.field496.method815((byte) 125);
        class129.field2162.method815((byte) 123);
        class107.field1757.method1350((byte) 115);
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(Z)V")
    public static void method541(boolean arg0) {
        field1195 = null;
        field1204 = null;
        field1206 = null;
        field1215 = null;
        field1214 = null;
        field1212 = null;
        field1200 = null;
        if (!arg0) {
            field1205 = null;
            field1199 = null;
            field1216 = null;
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(III)J")
    public static final long method542(int arg0, int arg1, int arg2) {
        class97 var3 = class27.field395[arg0][arg1][arg2];
        return var3 == null || var3.field1627 == null ? 0L : var3.field1627.field4176;
    }
}
