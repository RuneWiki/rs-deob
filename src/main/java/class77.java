import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!el")
public class class77 {

    @OriginalMember(owner = "client!el", name = "e", descriptor = "I")
    public int field1260 = -1;

    @OriginalMember(owner = "client!el", name = "h", descriptor = "Z")
    public boolean field1263 = false;

    @OriginalMember(owner = "client!el", name = "c", descriptor = "Z")
    public boolean field1258 = false;

    @OriginalMember(owner = "client!el", name = "i", descriptor = "I")
    public int field1264 = 99;

    @OriginalMember(owner = "client!el", name = "o", descriptor = "I")
    public int field1270 = 2;

    @OriginalMember(owner = "client!el", name = "q", descriptor = "I")
    public int field1272 = -1;

    @OriginalMember(owner = "client!el", name = "u", descriptor = "I")
    public int field1276 = -1;

    @OriginalMember(owner = "client!el", name = "y", descriptor = "I")
    public int field1280 = -1;

    @OriginalMember(owner = "client!el", name = "f", descriptor = "Z")
    public boolean field1261 = false;

    @OriginalMember(owner = "client!el", name = "s", descriptor = "I")
    public int field1274 = -1;

    @OriginalMember(owner = "client!el", name = "b", descriptor = "I")
    public int field1257 = 5;

    @OriginalMember(owner = "client!el", name = "F", descriptor = "Z")
    public boolean field1285 = false;

    @OriginalMember(owner = "client!el", name = "v", descriptor = "Ltj;")
    public static class10 field1277 = new class10();

    @OriginalMember(owner = "client!el", name = "G", descriptor = "I")
    public static int field1286 = 0;

    @OriginalMember(owner = "client!el", name = "H", descriptor = "I")
    public static int field1287 = 127;

    @OriginalMember(owner = "client!el", name = "t", descriptor = "B")
    public static byte field1275;

    @OriginalMember(owner = "client!el", name = "d", descriptor = "I")
    public static int field1259;

    @OriginalMember(owner = "client!el", name = "k", descriptor = "I")
    public static int field1266;

    @OriginalMember(owner = "client!el", name = "l", descriptor = "I")
    public static int field1267;

    @OriginalMember(owner = "client!el", name = "m", descriptor = "I")
    public static int field1268;

    @OriginalMember(owner = "client!el", name = "n", descriptor = "I")
    public static int field1269;

    @OriginalMember(owner = "client!el", name = "p", descriptor = "I")
    public static int field1271;

    @OriginalMember(owner = "client!el", name = "r", descriptor = "I")
    public static int field1273;

    @OriginalMember(owner = "client!el", name = "w", descriptor = "I")
    public static int field1278;

    @OriginalMember(owner = "client!el", name = "x", descriptor = "I")
    public static int field1279;

    @OriginalMember(owner = "client!el", name = "z", descriptor = "I")
    public static int field1281;

    @OriginalMember(owner = "client!el", name = "D", descriptor = "I")
    public int field1284;

    @OriginalMember(owner = "client!el", name = "a", descriptor = "[I")
    public int[] field1256;

    @OriginalMember(owner = "client!el", name = "j", descriptor = "[I")
    private int[] field1265;

    @OriginalMember(owner = "client!el", name = "A", descriptor = "[I")
    public int[] field1282;

    @OriginalMember(owner = "client!el", name = "g", descriptor = "[Z")
    public boolean[] field1262;

    @OriginalMember(owner = "client!el", name = "B", descriptor = "[[I")
    public int[][] field1283;

    @OriginalMember(owner = "client!el", name = "I", descriptor = "[[S")
    public static short[][] field1288;

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(IILkj;)I")
    public static final int method614(int arg0, int arg1, class114 arg2) {
        field1266++;
        if (arg2.field1852 == null || arg0 >= arg2.field1852.length) {
            return -2;
        }
        try {
            if (arg1 <= 1) {
                return 64;
            }
            int[] var3 = arg2.field1852[arg0];
            int var4 = 0;
            byte var5 = 0;
            int var6 = 0;
            while (true) {
                int var7 = 0;
                int var8 = var3[var4++];
                byte var9 = 0;
                if (var8 == 0) {
                    return var6;
                }
                if (var8 == 15) {
                    var9 = 1;
                }
                if (var8 == 1) {
                    var7 = class153.field2494[var3[var4++]];
                }
                if (var8 == 2) {
                    var7 = class242.field3837[var3[var4++]];
                }
                if (var8 == 3) {
                    var7 = class256.field4076[var3[var4++]];
                }
                if (var8 == 16) {
                    var9 = 2;
                }
                if (var8 == 17) {
                    var9 = 3;
                }
                if (var8 == 4) {
                    int var10 = var3[var4++] << 16;
                    int var11 = var10 + var3[var4++];
                    class114 var12 = class8.method43(var11, (byte) 112);
                    int var13 = var3[var4++];
                    if (var13 != -1 && (!class190.method1314(var13, (byte) 68).field1161 || class6.field75)) {
                        for (int var14 = 0; var14 < var12.field1785.length; var14++) {
                            if (var13 + 1 == var12.field1785[var14]) {
                                var7 += var12.field1777[var14];
                            }
                        }
                    }
                }
                if (var8 == 5) {
                    var7 = class192.field3138[var3[var4++]];
                }
                if (var8 == 6) {
                    var7 = class212.field3394[class242.field3837[var3[var4++]] - 1];
                }
                if (var8 == 7) {
                    var7 = class192.field3138[var3[var4++]] * 100 / 46875;
                }
                if (var8 == 8) {
                    var7 = class48.field878.field3425;
                }
                if (var8 == 9) {
                    for (int var15 = 0; var15 < 25; var15++) {
                        if (class254.field4041[var15]) {
                            var7 += class242.field3837[var15];
                        }
                    }
                }
                if (var8 == 10) {
                    int var16 = var3[var4++] << 16;
                    int var17 = var16 + var3[var4++];
                    class114 var18 = class8.method43(var17, (byte) -76);
                    int var19 = var3[var4++];
                    if (var19 != -1 && (!class190.method1314(var19, (byte) 68).field1161 || class6.field75)) {
                        for (int var20 = 0; var20 < var18.field1785.length; var20++) {
                            if (var19 + 1 == var18.field1785[var20]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var8 == 11) {
                    var7 = class142.field2356;
                }
                if (var8 == 12) {
                    var7 = class113.field1736;
                }
                if (var8 == 13) {
                    int var21 = class192.field3138[var3[var4++]];
                    int var22 = var3[var4++];
                    var7 = (var21 & 0x1 << var22) == 0 ? 0 : 1;
                }
                if (var8 == 14) {
                    int var23 = var3[var4++];
                    var7 = class137.method1030(var23, (byte) 4);
                }
                if (var8 == 18) {
                    var7 = (class48.field878.field2849 >> 7) + class256.field4082;
                }
                if (var8 == 19) {
                    var7 = (class48.field878.field2887 >> 7) + class170.field2787;
                }
                if (var8 == 20) {
                    var7 = var3[var4++];
                }
                if (var9 == 0) {
                    if (var5 == 0) {
                        var6 += var7;
                    }
                    if (var5 == 1) {
                        var6 -= var7;
                    }
                    if (var5 == 2 && var7 != 0) {
                        var6 /= var7;
                    }
                    if (var5 == 3) {
                        var6 *= var7;
                    }
                    var5 = 0;
                } else {
                    var5 = var9;
                }
            }
        } catch (Exception var24) {
            return -1;
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(Lig;Z)V")
    public final void method615(class136 arg0, boolean arg1) {
        if (!arg1) {
            return;
        }
        field1278++;
        while (true) {
            int var3 = arg0.method1012(4);
            if (var3 == 0) {
                return;
            }
            this.method620(arg0, -6, var3);
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(ZZ)V")
    public static final void method616(boolean arg0, boolean arg1) {
        field1269++;
        byte var2 = 4;
        byte[][] var3 = class178.field2967;
        for (int var4 = 0; var4 < var2; var4++) {
            class260.method1738(true);
            for (int var5 = 0; var5 < 13; var5++) {
                for (int var6 = 0; var6 < 13; var6++) {
                    int var7 = class72.field1196[var4][var5][var6];
                    if (var7 != -1) {
                        int var8 = var7 >> 24 & 0x3;
                        if (!arg1 || var8 == 0) {
                            int var9 = (var7 & 0x6) >> 1;
                            int var10 = (var7 & 0x3FFD) >> 3;
                            int var11 = var7 >> 14 & 0x3FF;
                            int var12 = (var11 / 8 << 8) + var10 / 8;
                            for (int var13 = 0; var13 < class268.field4291.length; var13++) {
                                if (class268.field4291[var13] == var12 && var3[var13] != null) {
                                    class18.method142(20759, var8, (var10 & 0x7) * 8, var9, var6 * 8, class141.field2352, var3[var13], var4, arg1, var5 * 8, (var11 & 0x7) * 8);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (!arg0) {
            method616(false, true);
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(Lpb;ZIIII)Lpb;")
    public final class168 method617(class168 arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        field1259++;
        int var7 = this.field1282[arg3];
        int var8 = this.field1256[arg3];
        class169 var9 = class257.method1716((byte) -37, var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            return arg0.method361(true, true, true);
        }
        if (!arg1) {
            this.field1260 = 82;
        }
        int var11 = arg2 & 0x3;
        class169 var12 = null;
        if ((this.field1258 || class294.field4671) && arg5 != -1 && arg5 < this.field1256.length) {
            int var13 = this.field1256[arg5];
            var12 = class257.method1716((byte) -92, var13 >> 16);
            arg5 = var13 & 0xFFFF;
        }
        class168 var14;
        if (var12 == null) {
            var14 = arg0.method361(!var9.method1213(var10, (byte) 14), !var9.method1214(var10, 102), !this.field1261);
        } else {
            var14 = arg0.method361(!var9.method1213(var10, (byte) 14) & !var12.method1213(arg5, (byte) 14), !var9.method1214(var10, 105) & !var12.method1214(arg5, 125), !this.field1261);
        }
        if (var11 == 1) {
            var14.method344();
        } else if (var11 == 2) {
            var14.method351();
        } else if (var11 == 3) {
            var14.method357();
        }
        var14.method1209(var9, var10, var12, arg5, arg4 - 1, var7, this.field1261);
        if (var11 == 1) {
            var14.method357();
        } else if (var11 == 2) {
            var14.method351();
        } else if (var11 == 3) {
            var14.method344();
        }
        return var14;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(Lpb;IIII)Lpb;")
    public final class168 method618(class168 arg0, int arg1, int arg2, int arg3, int arg4) {
        field1271++;
        int var6 = this.field1282[arg2];
        int var7 = this.field1256[arg2];
        class169 var8 = class257.method1716((byte) -42, var7 >> 16);
        int var9 = var7 & arg3;
        if (var8 == null) {
            return arg0.method336(true, true, true);
        }
        class169 var10 = null;
        if ((this.field1258 || class294.field4671) && arg1 != -1 && this.field1256.length > arg1) {
            int var11 = this.field1256[arg1];
            var10 = class257.method1716((byte) -93, var11 >> 16);
            arg1 = var11 & 0xFFFF;
        }
        class168 var12;
        if (var10 == null) {
            var12 = arg0.method336(!var8.method1213(var9, (byte) 14), !var8.method1214(var9, arg3 - 65427), !this.field1261);
        } else {
            var12 = arg0.method336(!var8.method1213(var9, (byte) 14) & !var10.method1213(arg1, (byte) 14), !var8.method1214(var9, 88) & !var10.method1214(arg1, 87), !this.field1261);
        }
        var12.method1209(var8, var9, var10, arg1, arg4 - 1, var6, this.field1261);
        return var12;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(B)V")
    public final void method619(byte arg0) {
        if (this.field1274 == -1) {
            if (this.field1262 == null) {
                this.field1274 = 0;
            } else {
                this.field1274 = 2;
            }
        }
        if (arg0 != -70) {
            method624(97, 52, 124, -64, -116, 2, -46, 34);
        }
        field1273++;
        if (this.field1276 != -1) {
            return;
        }
        if (this.field1262 == null) {
            this.field1276 = 0;
        } else {
            this.field1276 = 2;
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(Lig;II)V")
    private final void method620(class136 arg0, int arg1, int arg2) {
        if (arg1 != -6) {
            return;
        }
        if (arg2 == 1) {
            int var4 = arg0.method996(arg1 + 65286);
            this.field1282 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field1282[var5] = arg0.method996(65280);
            }
            this.field1256 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                this.field1256[var6] = arg0.method996(65280);
            }
            for (int var7 = 0; var7 < var4; var7++) {
                this.field1256[var7] = (arg0.method996(65280) << 16) + this.field1256[var7];
            }
        } else if (arg2 == 2) {
            this.field1260 = arg0.method996(arg1 + 65286);
        } else if (arg2 == 3) {
            this.field1262 = new boolean[256];
            int var8 = arg0.method1012(arg1 ^ 0xFFFFFFFE);
            for (int var9 = 0; var9 < var8; var9++) {
                this.field1262[arg0.method1012(4)] = true;
            }
        } else if (arg2 == 4) {
            this.field1285 = true;
        } else if (arg2 == 5) {
            this.field1257 = arg0.method1012(4);
        } else if (arg2 == 6) {
            this.field1272 = arg0.method996(65280);
        } else if (arg2 == 7) {
            this.field1280 = arg0.method996(65280);
        } else if (arg2 == 8) {
            this.field1264 = arg0.method1012(4);
        } else if (arg2 == 9) {
            this.field1274 = arg0.method1012(4);
        } else if (arg2 == 10) {
            this.field1276 = arg0.method1012(4);
        } else if (arg2 == 11) {
            this.field1270 = arg0.method1012(4);
        } else if (arg2 == 12) {
            int var14 = arg0.method1012(4);
            this.field1265 = new int[var14];
            for (int var15 = 0; var15 < var14; var15++) {
                this.field1265[var15] = arg0.method996(65280);
            }
            for (int var16 = 0; var16 < var14; var16++) {
                this.field1265[var16] += arg0.method996(65280) << 16;
            }
        } else if (arg2 == 13) {
            int var10 = arg0.method996(arg1 ^ 0xFFFF00FA);
            this.field1283 = new int[var10][];
            for (int var11 = 0; var11 < var10; var11++) {
                int var12 = arg0.method1012(arg1 ^ 0xFFFFFFFE);
                if (var12 > 0) {
                    this.field1283[var11] = new int[var12];
                    this.field1283[var11][0] = arg0.method1009(101);
                    for (int var13 = 1; var13 < var12; var13++) {
                        this.field1283[var11][var13] = arg0.method996(65280);
                    }
                }
            }
        } else if (arg2 == 14) {
            this.field1261 = true;
        } else if (arg2 == 15) {
            this.field1258 = true;
        } else if (arg2 == 16) {
            this.field1263 = true;
        }
        field1268++;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(I)V")
    public static void method621(int arg0) {
        field1277 = null;
        if (arg0 == 3) {
            field1288 = null;
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(Lsb;I)V")
    public static final void method622(class124 arg0, int arg1) {
        class45.field816 = arg0;
        if (arg1 <= 69) {
            field1288 = null;
        }
        field1281++;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(ILpb;III)Lpb;")
    public final class168 method623(int arg0, class168 arg1, int arg2, int arg3, int arg4) {
        field1267++;
        int var6 = this.field1256[arg2];
        int var7 = this.field1282[arg2];
        class169 var8 = class257.method1716((byte) -76, var6 >> 16);
        if (arg0 != -65536) {
            method614(123, -28, (class114) null);
        }
        int var9 = var6 & 0xFFFF;
        if (var8 == null) {
            return arg1.method354(true, true, true);
        }
        class169 var10 = null;
        if ((this.field1258 || class294.field4671) && arg4 != -1 && this.field1256.length > arg4) {
            int var11 = this.field1256[arg4];
            var10 = class257.method1716((byte) -34, var11 >> 16);
            arg4 = var11 & 0xFFFF;
        }
        int var12 = 0;
        class169 var13 = null;
        class169 var14 = null;
        int var15 = 0;
        if (this.field1265 != null) {
            if (arg2 < this.field1265.length) {
                var12 = this.field1265[arg2];
                if (var12 != 65535) {
                    var14 = class257.method1716((byte) -120, var12 >> 16);
                    var12 &= 0xFFFF;
                }
            }
            if ((this.field1258 || class294.field4671) && arg4 != -1 && arg4 < this.field1265.length) {
                var15 = this.field1265[arg4];
                if (var15 != 65535) {
                    var13 = class257.method1716((byte) -67, var15 >> 16);
                    var15 &= 0xFFFF;
                }
            }
        }
        boolean var16 = !var8.method1213(var9, (byte) 14);
        boolean var17 = !var8.method1214(var9, 101);
        if (var14 != null) {
            var16 &= !var14.method1213(var12, (byte) 14);
            var17 &= !var14.method1214(var12, 104);
        }
        if (var10 != null) {
            var16 &= !var10.method1213(arg4, (byte) 14);
            var17 &= !var10.method1214(arg4, 116);
        }
        if (var13 != null) {
            var16 &= !var13.method1213(var15, (byte) 14);
            var17 &= !var13.method1214(var15, 93);
        }
        class168 var18 = arg1.method354(var16, var17, !this.field1261);
        var18.method1209(var8, var9, var10, arg4, arg3 - 1, var7, this.field1261);
        if (var14 != null) {
            var18.method1209(var14, var12, var13, var15, arg3 - 1, var7, this.field1261);
        }
        return var18;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method624(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1279++;
        if (arg4 < 128 || arg0 < 128 || arg4 > 13056 || arg0 > 13056) {
            class111.field1713 = -1;
            class241.field3800 = -1;
            return;
        }
        int var8 = class218.method1450(arg0, arg4, true, class92.field1448) - arg2;
        int var9 = arg0 - class148.field2434;
        int var10 = var8 - class150.field2457;
        int var11 = class95.field1482[class146.field2408];
        int var12 = arg4 - class31.field527;
        int var13 = class95.field1475[class146.field2408];
        int var14 = class95.field1482[class212.field3400];
        int var15 = class95.field1475[class212.field3400];
        int var16 = var9 * var14 + var12 * var15 >> 16;
        int var17 = var9 * var15 - (var12 * var14) >> 16;
        int var19 = var10 * var13 - (var11 * var17) >> 16;
        int var20 = var10 * var11 + var13 * var17 >> 16;
        if (arg1 != -13057) {
            field1287 = 16;
        }
        if (var20 >= 50) {
            class111.field1713 = arg3 + ((var16 << 9) / var20);
            class241.field3800 = (var19 << 9) / var20 + arg7;
        } else {
            class111.field1713 = -1;
            class241.field3800 = -1;
        }
    }
}
