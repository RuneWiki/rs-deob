import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public class class200 {

    @OriginalMember(owner = "client!dj", name = "h", descriptor = "I")
    public int field3173 = 5;

    @OriginalMember(owner = "client!dj", name = "f", descriptor = "I")
    public int field3171 = 2;

    @OriginalMember(owner = "client!dj", name = "g", descriptor = "Z")
    public boolean field3172 = false;

    @OriginalMember(owner = "client!dj", name = "r", descriptor = "I")
    public int field3183 = -1;

    @OriginalMember(owner = "client!dj", name = "m", descriptor = "I")
    public int field3178 = -1;

    @OriginalMember(owner = "client!dj", name = "e", descriptor = "Z")
    public boolean field3170 = false;

    @OriginalMember(owner = "client!dj", name = "p", descriptor = "Z")
    public boolean field3181 = false;

    @OriginalMember(owner = "client!dj", name = "j", descriptor = "I")
    public int field3175 = -1;

    @OriginalMember(owner = "client!dj", name = "v", descriptor = "Z")
    public boolean field3187 = false;

    @OriginalMember(owner = "client!dj", name = "t", descriptor = "I")
    public int field3185 = 99;

    @OriginalMember(owner = "client!dj", name = "z", descriptor = "I")
    public int field3191 = -1;

    @OriginalMember(owner = "client!dj", name = "u", descriptor = "I")
    public int field3186 = -1;

    @OriginalMember(owner = "client!dj", name = "C", descriptor = "[Z")
    public static boolean[] field3194 = new boolean[8];

    @OriginalMember(owner = "client!dj", name = "d", descriptor = "I")
    public static int field3169;

    @OriginalMember(owner = "client!dj", name = "i", descriptor = "I")
    public static int field3174;

    @OriginalMember(owner = "client!dj", name = "k", descriptor = "I")
    public int field3176;

    @OriginalMember(owner = "client!dj", name = "l", descriptor = "I")
    public static int field3177;

    @OriginalMember(owner = "client!dj", name = "n", descriptor = "I")
    public static int field3179;

    @OriginalMember(owner = "client!dj", name = "q", descriptor = "I")
    public static int field3182;

    @OriginalMember(owner = "client!dj", name = "s", descriptor = "I")
    public static int field3184;

    @OriginalMember(owner = "client!dj", name = "x", descriptor = "I")
    public static int field3189;

    @OriginalMember(owner = "client!dj", name = "y", descriptor = "I")
    public static int field3190;

    @OriginalMember(owner = "client!dj", name = "A", descriptor = "I")
    public static int field3192;

    @OriginalMember(owner = "client!dj", name = "B", descriptor = "I")
    public static int field3193;

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "[I")
    public int[] field3167;

    @OriginalMember(owner = "client!dj", name = "c", descriptor = "[I")
    public int[] field3168;

    @OriginalMember(owner = "client!dj", name = "w", descriptor = "[I")
    private int[] field3188;

    @OriginalMember(owner = "client!dj", name = "o", descriptor = "[Z")
    public boolean[] field3180;

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "[[I")
    public int[][] field3166;

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(BI)V")
    public static final void method1377(byte arg0, int arg1) {
        class18.field254.method147(arg1, (byte) -121);
        field3184++;
        class284.field4745.method147(arg1, (byte) -128);
        if (arg0 < 40) {
            field3194 = null;
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IIIZII)V")
    public static final void method1378(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        field3169++;
        if (arg4 < 1) {
            arg4 = 1;
        }
        class186.field2886 = (short) arg4;
        if (arg1 < 1) {
            arg1 = 1;
        }
        class225.field3578 = (short) arg1;
        if (arg5 == 14837) {
            ;
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IILrk;IB)Lrk;")
    public final class293 method1379(int arg0, int arg1, class293 arg2, int arg3, byte arg4) {
        field3193++;
        int var6 = this.field3168[arg3];
        int var7 = this.field3167[arg3];
        class146 var8 = class31.method184(var7 >> 16, (byte) -19);
        int var9 = var7 & 0xFFFF;
        if (var8 == null) {
            return arg2.method1325(true, true, true);
        }
        class146 var10 = null;
        if (arg4 != -5) {
            this.field3178 = -66;
        }
        class146 var11 = null;
        int var12 = 0;
        class146 var13 = null;
        if ((this.field3187 || class231.field3698) && arg0 != -1 && arg0 < this.field3167.length) {
            int var14 = this.field3167[arg0];
            var10 = class31.method184(var14 >> 16, (byte) -19);
            arg0 = var14 & 0xFFFF;
        }
        int var15 = 0;
        if (this.field3188 != null) {
            if (arg3 < this.field3188.length) {
                var12 = this.field3188[arg3];
                if (var12 != 65535) {
                    var13 = class31.method184(var12 >> 16, (byte) -19);
                    var12 &= 0xFFFF;
                }
            }
            if ((this.field3187 || class231.field3698) && arg0 != -1 && this.field3188.length > arg0) {
                var15 = this.field3188[arg0];
                if (var15 != 65535) {
                    var11 = class31.method184(var15 >> 16, (byte) -19);
                    var15 &= 0xFFFF;
                }
            }
        }
        boolean var16 = !var8.method976(var9, arg4 + 5);
        boolean var17 = !var8.method977(var9, -75);
        if (var13 != null) {
            var16 &= !var13.method976(var12, arg4 + 5);
            var17 &= !var13.method977(var12, arg4 ^ 0x4C);
        }
        if (var10 != null) {
            var16 &= !var10.method976(arg0, 0);
            var17 &= !var10.method977(arg0, -117);
        }
        if (var11 != null) {
            var16 &= !var11.method976(var15, 0);
            var17 &= !var11.method977(var15, arg4 - 98);
        }
        class293 var18 = arg2.method1325(var16, var17, !this.field3181);
        var18.method2049(var8, var9, var10, arg0, arg1 - 1, var6, this.field3181);
        if (var13 != null) {
            var18.method2049(var13, var12, var11, var15, arg1 - 1, var6, this.field3181);
        }
        return var18;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(B)V")
    public static void method1380(byte arg0) {
        field3194 = null;
        int var1 = 89 / ((arg0 + 11) / 60);
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(Z)V")
    public final void method1381(boolean arg0) {
        if (arg0) {
            return;
        }
        field3174++;
        if (this.field3186 == -1) {
            if (this.field3180 == null) {
                this.field3186 = 0;
            } else {
                this.field3186 = 2;
            }
        }
        if (this.field3178 != -1) {
            return;
        }
        if (this.field3180 == null) {
            this.field3178 = 0;
        } else {
            this.field3178 = 2;
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(BILrk;II)Lrk;")
    public final class293 method1382(byte arg0, int arg1, class293 arg2, int arg3, int arg4) {
        field3192++;
        int var6 = this.field3168[arg3];
        int var7 = this.field3167[arg3];
        class146 var8 = class31.method184(var7 >> 16, (byte) -19);
        int var9 = var7 & 0xFFFF;
        if (var8 == null) {
            return arg2.method1295(true, true, true);
        }
        if (arg0 >= -113) {
            this.field3191 = -45;
        }
        class146 var10 = null;
        if ((this.field3187 || class231.field3698) && arg4 != -1 && arg4 < this.field3167.length) {
            int var11 = this.field3167[arg4];
            var10 = class31.method184(var11 >> 16, (byte) -19);
            arg4 = var11 & 0xFFFF;
        }
        class293 var12;
        if (var10 == null) {
            var12 = arg2.method1295(!var8.method976(var9, 0), !var8.method977(var9, -71), !this.field3181);
        } else {
            var12 = arg2.method1295(!var8.method976(var9, 0) & !var10.method976(arg4, 0), !var8.method977(var9, -127) & !var10.method977(arg4, -118), !this.field3181);
        }
        var12.method2049(var8, var9, var10, arg4, arg1 - 1, var6, this.field3181);
        return var12;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(ILma;)V")
    public final void method1383(int arg0, class202 arg1) {
        while (true) {
            int var3 = arg1.method1420((byte) 0);
            if (var3 == 0) {
                field3189++;
                if (arg0 >= -92) {
                    this.field3187 = true;
                    return;
                }
                return;
            }
            this.method1384(var3, -88, arg1);
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IILma;)V")
    private final void method1384(int arg0, int arg1, class202 arg2) {
        field3182++;
        if (arg1 > -80) {
            this.field3168 = null;
        }
        if (arg0 == 1) {
            int var4 = arg2.method1419(87);
            this.field3168 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field3168[var5] = arg2.method1419(95);
            }
            this.field3167 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                this.field3167[var6] = arg2.method1419(109);
            }
            for (int var7 = 0; var7 < var4; var7++) {
                this.field3167[var7] = (arg2.method1419(65) << 16) + this.field3167[var7];
            }
        } else if (arg0 == 2) {
            this.field3191 = arg2.method1419(103);
        } else if (arg0 == 3) {
            this.field3180 = new boolean[256];
            int var15 = arg2.method1420((byte) 0);
            for (int var16 = 0; var16 < var15; var16++) {
                this.field3180[arg2.method1420((byte) 0)] = true;
            }
        } else if (arg0 == 4) {
            this.field3170 = true;
        } else if (arg0 == 5) {
            this.field3173 = arg2.method1420((byte) 0);
        } else if (arg0 == 6) {
            this.field3175 = arg2.method1419(71);
        } else if (arg0 == 7) {
            this.field3183 = arg2.method1419(81);
        } else if (arg0 == 8) {
            this.field3185 = arg2.method1420((byte) 0);
        } else if (arg0 == 9) {
            this.field3178 = arg2.method1420((byte) 0);
        } else if (arg0 == 10) {
            this.field3186 = arg2.method1420((byte) 0);
        } else if (arg0 == 11) {
            this.field3171 = arg2.method1420((byte) 0);
        } else if (arg0 == 12) {
            int var8 = arg2.method1420((byte) 0);
            this.field3188 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field3188[var9] = arg2.method1419(99);
            }
            for (int var10 = 0; var10 < var8; var10++) {
                this.field3188[var10] = (arg2.method1419(82) << 16) + this.field3188[var10];
            }
        } else if (arg0 == 13) {
            int var11 = arg2.method1419(114);
            this.field3166 = new int[var11][];
            for (int var12 = 0; var12 < var11; var12++) {
                int var13 = arg2.method1420((byte) 0);
                if (var13 > 0) {
                    this.field3166[var12] = new int[var13];
                    this.field3166[var12][0] = arg2.method1401((byte) -91);
                    for (int var14 = 1; var14 < var13; var14++) {
                        this.field3166[var12][var14] = arg2.method1419(74);
                    }
                }
            }
        } else if (arg0 == 14) {
            this.field3181 = true;
        } else if (arg0 == 15) {
            this.field3187 = true;
        } else if (arg0 == 16) {
            this.field3172 = true;
            return;
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(ILrk;IIII)Lrk;")
    public final class293 method1385(int arg0, class293 arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg5 != -12248) {
            this.field3185 = 127;
        }
        int var7 = this.field3168[arg0];
        field3190++;
        int var8 = this.field3167[arg0];
        class146 var9 = class31.method184(var8 >> 16, (byte) -19);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            return arg1.method1323(true, true, true);
        }
        int var11 = arg3 & 0x3;
        class146 var12 = null;
        if ((this.field3187 || class231.field3698) && arg2 != -1 && this.field3167.length > arg2) {
            int var13 = this.field3167[arg2];
            var12 = class31.method184(var13 >> 16, (byte) -19);
            arg2 = var13 & 0xFFFF;
        }
        class293 var14;
        if (var12 == null) {
            var14 = arg1.method1323(!var9.method976(var10, 0), !var9.method977(var10, -92), !this.field3181);
        } else {
            var14 = arg1.method1323(!var9.method976(var10, 0) & !var12.method976(arg2, 0), !var9.method977(var10, -125) & !var12.method977(arg2, -88), !this.field3181);
        }
        if (var11 == 1) {
            var14.method1303();
        } else if (var11 == 2) {
            var14.method1294();
        } else if (var11 == 3) {
            var14.method1296();
        }
        var14.method2049(var9, var10, var12, arg2, arg4 - 1, var7, this.field3181);
        if (var11 == 1) {
            var14.method1296();
        } else if (var11 == 2) {
            var14.method1294();
        } else if (var11 == 3) {
            var14.method1303();
        }
        return var14;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(I[IB[II)V")
    public static final void method1386(int arg0, int[] arg1, byte arg2, int[] arg3, int arg4) {
        if (arg2 > -27) {
            field3194 = null;
        }
        field3177++;
        if (arg4 <= arg0) {
            return;
        }
        int var5 = arg0;
        int var6 = (arg0 + arg4) / 2;
        int var7 = arg3[var6];
        arg3[var6] = arg3[arg4];
        arg3[arg4] = var7;
        int var8 = arg1[var6];
        arg1[var6] = arg1[arg4];
        arg1[arg4] = var8;
        for (int var9 = arg0; var9 < arg4; var9++) {
            if (arg3[var9] < ((var9 & 0x1) + var7)) {
                int var10 = arg3[var9];
                arg3[var9] = arg3[var5];
                arg3[var5] = var10;
                int var11 = arg1[var9];
                arg1[var9] = arg1[var5];
                arg1[var5++] = var11;
            }
        }
        arg3[arg4] = arg3[var5];
        arg3[var5] = var7;
        arg1[arg4] = arg1[var5];
        arg1[var5] = var8;
        method1386(arg0, arg1, (byte) -71, arg3, var5 - 1);
        method1386(var5 + 1, arg1, (byte) -89, arg3, arg4);
    }
}
