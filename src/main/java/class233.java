import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class233 {

    @OriginalMember(owner = "client!md", name = "l", descriptor = "I")
    public int field3240 = -1;

    @OriginalMember(owner = "client!md", name = "c", descriptor = "I")
    public int field3231 = -1;

    @OriginalMember(owner = "client!md", name = "v", descriptor = "I")
    public int field3250 = 5;

    @OriginalMember(owner = "client!md", name = "s", descriptor = "I")
    public int field3247 = -1;

    @OriginalMember(owner = "client!md", name = "k", descriptor = "I")
    public int field3239 = 2;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "Z")
    public boolean field3229 = false;

    @OriginalMember(owner = "client!md", name = "h", descriptor = "Z")
    public boolean field3236 = false;

    @OriginalMember(owner = "client!md", name = "p", descriptor = "I")
    public int field3244 = -1;

    @OriginalMember(owner = "client!md", name = "g", descriptor = "I")
    public int field3235 = -1;

    @OriginalMember(owner = "client!md", name = "x", descriptor = "I")
    public int field3252 = 99;

    @OriginalMember(owner = "client!md", name = "i", descriptor = "Z")
    public boolean field3237 = false;

    @OriginalMember(owner = "client!md", name = "u", descriptor = "Z")
    public boolean field3249 = false;

    @OriginalMember(owner = "client!md", name = "r", descriptor = "I")
    public static int field3246 = -1;

    @OriginalMember(owner = "client!md", name = "b", descriptor = "I")
    public static int field3230;

    @OriginalMember(owner = "client!md", name = "e", descriptor = "I")
    public static int field3233;

    @OriginalMember(owner = "client!md", name = "f", descriptor = "I")
    public static int field3234;

    @OriginalMember(owner = "client!md", name = "j", descriptor = "I")
    public static int field3238;

    @OriginalMember(owner = "client!md", name = "m", descriptor = "I")
    public static int field3241;

    @OriginalMember(owner = "client!md", name = "q", descriptor = "I")
    public static int field3245;

    @OriginalMember(owner = "client!md", name = "y", descriptor = "I")
    public static int field3253;

    @OriginalMember(owner = "client!md", name = "z", descriptor = "I")
    public static int field3254;

    @OriginalMember(owner = "client!md", name = "A", descriptor = "I")
    public int field3255;

    @OriginalMember(owner = "client!md", name = "d", descriptor = "Lvn;")
    public static class431 field3232;

    @OriginalMember(owner = "client!md", name = "n", descriptor = "[I")
    public int[] field3242;

    @OriginalMember(owner = "client!md", name = "o", descriptor = "[I")
    private int[] field3243;

    @OriginalMember(owner = "client!md", name = "t", descriptor = "[I")
    public int[] field3248;

    @OriginalMember(owner = "client!md", name = "w", descriptor = "[Z")
    public boolean[] field3251;

    @OriginalMember(owner = "client!md", name = "B", descriptor = "[[I")
    public int[][] field3256;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IIILqb;II)Lqb;")
    public final class257 method1512(int arg0, int arg1, int arg2, class257 arg3, int arg4, int arg5) {
        field3233++;
        int var7 = this.field3248[arg2];
        int var8 = this.field3242[arg2];
        class255 var9 = class21.method190((byte) -52, var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            return arg3.method1676((byte) 1, arg1, true);
        }
        class255 var11 = null;
        if ((this.field3237 || class361.field5345) && arg0 != -1 && this.field3242.length > arg0) {
            int var12 = this.field3242[arg0];
            var11 = class21.method190((byte) -49, var12 >> 16);
            arg0 = var12 & 0xFFFF;
        }
        class255 var13 = null;
        class255 var14 = null;
        int var15 = arg5;
        int var16 = 0;
        if (this.field3243 != null) {
            if (arg2 < this.field3243.length) {
                var15 = this.field3243[arg2];
                if (var15 != 65535) {
                    var13 = class21.method190((byte) -116, var15 >> 16);
                    var15 &= 0xFFFF;
                }
            }
            if ((this.field3237 || class361.field5345) && arg0 != -1 && this.field3243.length > arg0) {
                var16 = this.field3243[arg0];
                if (var16 != 65535) {
                    var14 = class21.method190((byte) -39, var16 >> 16);
                    var16 &= 0xFFFF;
                }
            }
        }
        if (this.field3236) {
            arg1 |= 0x200;
        }
        if (var9.method1651(var10, arg5 ^ 0xFFFF96BF)) {
            arg1 |= 0x80;
        }
        if (var9.method1649(var10, 0)) {
            arg1 |= 0x100;
        }
        if (var13 != null) {
            if (var13.method1651(var15, arg5 ^ 0xFFFF96BF)) {
                arg1 |= 0x80;
            }
            if (var13.method1649(var15, 0)) {
                arg1 |= 0x100;
            }
        }
        if (var11 != null) {
            if (var11.method1651(arg0, -26945)) {
                arg1 |= 0x80;
            }
            if (var11.method1649(arg0, 0)) {
                arg1 |= 0x100;
            }
        }
        if (var14 != null) {
            if (var14.method1651(var16, -26945)) {
                arg1 |= 0x80;
            }
            if (var14.method1649(var16, 0)) {
                arg1 |= 0x100;
            }
        }
        int var17 = arg1 | 0x20;
        class257 var18 = arg3.method1676((byte) 1, var17, true);
        var18.method1678(arg5 ^ 0xFFFF, var10, arg4 - 1, 0, var11, this.field3236, arg0, var9, var7);
        if (var13 != null) {
            var18.method1678(65535, var15, arg4 - 1, 0, var14, this.field3236, var16, var13, var7);
        }
        return var18;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(BIIIIIILqb;)Lqb;")
    public final class257 method1513(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class257 arg7) {
        field3241++;
        int var9 = this.field3248[arg4];
        int var10 = this.field3242[arg4];
        class255 var11 = class21.method190((byte) -58, var10 >> 16);
        int var12 = var10 & 0xFFFF;
        if (var11 == null) {
            return arg7.method1676((byte) 1, arg2, true);
        }
        class255 var13 = null;
        if ((this.field3237 || class361.field5345) && arg5 != -1 && arg5 < this.field3242.length) {
            int var14 = this.field3242[arg5];
            var13 = class21.method190((byte) -119, var14 >> 16);
            arg5 = var14 & 0xFFFF;
        }
        if (this.field3236) {
            arg2 |= 0x200;
        }
        if (arg1 < 124) {
            return null;
        }
        if (var11.method1651(var12, -26945)) {
            arg2 |= 0x80;
        }
        if (var11.method1649(var12, 0)) {
            arg2 |= 0x100;
        }
        if (var13 != null) {
            if (var13.method1651(arg5, -26945)) {
                arg2 |= 0x80;
            }
            if (var13.method1649(arg5, 0)) {
                arg2 |= 0x100;
            }
        }
        int var15 = arg2 | 0x20;
        class257 var16 = arg7.method1676(arg0, var15, true);
        var16.method1678(65535, var12, arg6 - 1, arg3, var13, this.field3236, arg5, var11, var9);
        return var16;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(I)V")
    public static void method1514(int arg0) {
        int var1 = 65 % ((arg0 + 62) / 59);
        field3232 = null;
    }

    @OriginalMember(owner = "client!md", name = "b", descriptor = "(I)V")
    public final void method1515(int arg0) {
        int var2 = 112 % ((61 - arg0) / 53);
        if (this.field3247 == -1) {
            if (this.field3251 == null) {
                this.field3247 = 0;
            } else {
                this.field3247 = 2;
            }
        }
        field3245++;
        if (this.field3235 != -1) {
            return;
        }
        if (this.field3251 == null) {
            this.field3235 = 0;
        } else {
            this.field3235 = 2;
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(BILfb;)V")
    private final void method1516(byte arg0, int arg1, class341 arg2) {
        field3234++;
        if (arg1 == 1) {
            int var13 = arg2.method2239(-1076227960);
            this.field3248 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field3248[var14] = arg2.method2239(-1076227960);
            }
            this.field3242 = new int[var13];
            for (int var15 = 0; var15 < var13; var15++) {
                this.field3242[var15] = arg2.method2239(-1076227960);
            }
            for (int var16 = 0; var16 < var13; var16++) {
                this.field3242[var16] += arg2.method2239(class294.method1993(arg0, -1076227964)) << 16;
            }
        } else if (arg1 == 2) {
            this.field3244 = arg2.method2239(arg0 - 1076227972);
        } else if (arg1 == 3) {
            this.field3251 = new boolean[256];
            int var11 = arg2.method2233((byte) 104);
            for (int var12 = 0; var12 < var11; var12++) {
                this.field3251[arg2.method2233((byte) 104)] = true;
            }
        } else if (arg1 == 4) {
            this.field3249 = true;
        } else if (arg1 == 5) {
            this.field3250 = arg2.method2233((byte) 104);
        } else if (arg1 == 6) {
            this.field3231 = arg2.method2239(-1076227960);
        } else if (arg1 == 7) {
            this.field3240 = arg2.method2239(-1076227960);
        } else if (arg1 == 8) {
            this.field3252 = arg2.method2233((byte) 104);
        } else if (arg1 == 9) {
            this.field3247 = arg2.method2233((byte) 104);
        } else if (arg1 == 10) {
            this.field3235 = arg2.method2233((byte) 104);
        } else if (arg1 == 11) {
            this.field3239 = arg2.method2233((byte) 104);
        } else if (arg1 == 12) {
            int var8 = arg2.method2233((byte) 104);
            this.field3243 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field3243[var9] = arg2.method2239(-1076227960);
            }
            for (int var10 = 0; var10 < var8; var10++) {
                this.field3243[var10] = (arg2.method2239(-1076227960) << 16) + this.field3243[var10];
            }
        } else if (arg1 == 13) {
            int var4 = arg2.method2239(-1076227960);
            this.field3256 = new int[var4][];
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg2.method2233((byte) 104);
                if (var6 > 0) {
                    this.field3256[var5] = new int[var6];
                    this.field3256[var5][0] = arg2.method2249(32767);
                    for (int var7 = 1; var7 < var6; var7++) {
                        this.field3256[var5][var7] = arg2.method2239(-1076227960);
                    }
                }
            }
        } else if (arg1 == 14) {
            this.field3236 = true;
        } else if (arg1 == 15) {
            this.field3237 = true;
        } else if (arg1 == 16) {
            this.field3229 = true;
        }
        if (arg0 != 12) {
            this.method1513((byte) -84, -122, 93, 79, -21, -29, -24, (class257) null);
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(ZIBI)I")
    public final int method1517(boolean arg0, int arg1, byte arg2, int arg3) {
        field3253++;
        int var5 = 0;
        int var6 = 0;
        int var7 = this.field3242[arg1];
        class255 var8 = null;
        class255 var9 = class21.method190((byte) -124, var7 >> 16);
        int var10 = var7 & 0xFFFF;
        if (var9 == null) {
            return var5;
        }
        if ((this.field3237 || class361.field5345) && arg3 != -1 && arg3 < this.field3242.length) {
            int var11 = this.field3242[arg3];
            var8 = class21.method190((byte) -55, var11 >> 16);
            var6 = var11 & 0xFFFF;
        }
        if (arg2 < 49) {
            return 94;
        }
        if (this.field3236) {
            var5 |= 0x200;
        }
        if (var9.method1651(var10, -26945)) {
            var5 |= 0x80;
        }
        if (var9.method1649(var10, 0)) {
            var5 |= 0x100;
        }
        if (var8 != null) {
            if (var8.method1651(var6, -26945)) {
                var5 |= 0x80;
            }
            if (var8.method1649(var6, 0)) {
                var5 |= 0x100;
            }
        }
        if (this.field3243 != null && arg0) {
            if (arg1 < this.field3243.length) {
                int var12 = this.field3243[arg1];
                if (var12 != 65535) {
                    class255 var13 = class21.method190((byte) -31, var12 >> 16);
                    int var14 = var12 & 0xFFFF;
                    if (var13 != null) {
                        if (var13.method1651(var14, -26945)) {
                            var5 |= 0x80;
                        }
                        if (var13.method1649(var14, 0)) {
                            var5 |= 0x100;
                        }
                    }
                }
            }
            if ((this.field3237 || class361.field5345) && arg3 != -1 && arg3 < this.field3243.length) {
                int var15 = this.field3243[arg3];
                if (var15 != 65535) {
                    class255 var16 = class21.method190((byte) -41, var15 >> 16);
                    int var17 = var15 & 0xFFFF;
                    if (var16 != null) {
                        if (var16.method1651(var17, -26945)) {
                            var5 |= 0x80;
                        }
                        if (var16.method1649(var17, 0)) {
                            var5 |= 0x100;
                        }
                    }
                }
            }
        }
        return var5 | 0x20;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(Lfb;B)V")
    public final void method1518(class341 arg0, byte arg1) {
        field3254++;
        while (true) {
            int var3 = arg0.method2233((byte) 104);
            if (var3 == 0) {
                if (arg1 <= 9) {
                    field3246 = 13;
                    return;
                } else {
                    return;
                }
            }
            this.method1516((byte) 12, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IZLmd;IIIILqb;ILtj;IIIII)Lqb;")
    public static final class257 method1519(int arg0, boolean arg1, class233 arg2, int arg3, int arg4, int arg5, int arg6, class257 arg7, int arg8, class298 arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
        field3238++;
        if (arg7 == null) {
            return null;
        }
        int var15 = 1031;
        if (arg2 != null) {
            int var16 = var15 | arg2.method1517(false, arg5, (byte) 78, -1);
            var15 = var16 & 0xFFFFFDFF;
        }
        if (arg11 < 60) {
            return null;
        }
        long var17 = ((long) arg3 << 48) + (long) ((arg4 << 16) + (arg10 << 24) + arg6) + ((long) arg0 << 32);
        class51 var19 = class38.field565;
        class257 var20;
        synchronized (class38.field565) {
            var20 = (class257) class38.field565.method378((byte) 28, var17);
        }
        if (var20 == null || arg9.method465(var20.method1690(), var15) != 0) {
            if (var20 != null) {
                var15 = arg9.method436(var15, var20.method1690());
            }
            byte var21;
            if (arg6 == 1) {
                var21 = 9;
            } else if (arg6 == 2) {
                var21 = 12;
            } else if (arg6 == 3) {
                var21 = 15;
            } else if (arg6 == 4) {
                var21 = 18;
            } else {
                var21 = 21;
            }
            byte var22 = 3;
            int[] var23 = new int[] { 64, 96, 128 };
            class9 var24 = new class9((var21 * var22) + 1, var21 * 2 * var22 - var21, 0);
            int var25 = var24.method60((byte) -14, 0, 0, 0);
            int[][] var26 = new int[var22][var21];
            for (int var27 = 0; var27 < var22; var27++) {
                int var28 = var23[var27];
                int var29 = var23[var27];
                for (int var30 = 0; var30 < var21; var30++) {
                    int var31 = (var30 << 14) / var21;
                    int var32 = class240.field3364[var31] * var28 >> 15;
                    int var33 = class240.field3365[var31] * var29 >> 15;
                    var26[var27][var30] = var24.method60((byte) -14, 0, var33, var32);
                }
            }
            for (int var34 = 0; var34 < var22; var34++) {
                int var35 = (var34 * 256 + 128) / var22;
                int var36 = 256 - var35;
                byte var37 = (byte) (arg4 * var36 + arg10 * var35 >> 8);
                short var38 = (short) (((arg0 & 0x380) * var36 + (arg3 & 0x380) * var35 & 0x38000) + ((arg0 & 0x7F) * var36 + (arg3 & 0x7F) * var35 & 0x7F00) + ((arg0 & 0xFC00) * var36 + (arg3 & 0xFC00) * var35 & 0xFC0000) >> 8);
                for (int var39 = 0; var39 < var21; var39++) {
                    if (var34 == 0) {
                        var24.method74(var25, var38, var26[0][var39], (byte) 36, var26[0][(var39 + 1) % var21], (short) -1, (byte) -1, (byte) 1, var37);
                    } else {
                        var24.method74(var26[var34 - 1][var39], var38, var26[var34][(var39 + 1) % var21], (byte) 52, var26[var34 - 1][(var39 + 1) % var21], (short) -1, (byte) -1, (byte) 1, var37);
                        var24.method74(var26[var34 - 1][var39], var38, var26[var34][var39], (byte) -12, var26[var34][(var39 + 1) % var21], (short) -1, (byte) -1, (byte) 1, var37);
                    }
                }
            }
            var20 = arg9.method468(var24, var15, class421.field6125, 64, 768);
            class51 var40 = class38.field565;
            synchronized (class38.field565) {
                class38.field565.method367(var17, var20, true);
            }
        }
        int var41 = arg6 * 64 - 1;
        int var42 = -var41;
        int var43 = -var41;
        int var44 = var41;
        int var45 = var41;
        if (arg1) {
            if (arg14 > 5120 && arg14 < 11264) {
                var45 = var41 + 128;
            }
            if (arg14 > 1024 && arg14 < 7168) {
                var42 -= 128;
            }
            if (arg14 > 13312 || arg14 < 3072) {
                var43 -= 128;
            }
            if (arg14 > 9216 && arg14 < 15360) {
                var44 = var41 + 128;
            }
        }
        int var46 = arg7.method1669();
        int var47 = arg7.method1675();
        int var48 = arg7.method1701();
        if (var42 > var46) {
            var46 = var42;
        }
        if (var48 < var43) {
            var48 = var43;
        }
        int var49 = arg7.method1685();
        if (var47 > var44) {
            var47 = var44;
        }
        if (var45 < var49) {
            var49 = var45;
        }
        class255 var50 = null;
        if (arg2 != null) {
            int var51 = arg2.field3242[arg5];
            var50 = class21.method190((byte) -18, var51 >> 16);
            arg5 = var51 & 0xFFFF;
        }
        class257 var52;
        if (var50 == null) {
            var52 = var20.method1676((byte) 3, var15, true);
            var52.method1658((var47 - var46) / 2, 128, (var49 - var48) / 2);
            var52.method1659((var46 + var47) / 2, 0, (var48 + var49) / 2);
        } else {
            var52 = var20.method1676((byte) 3, var15, true);
            var52.method1658((var47 - var46) / 2, 128, (var49 - var48) / 2);
            var52.method1659((var46 + var47) / 2, 0, (var48 + var49) / 2);
            var52.method1695(-17559, arg5, var50);
        }
        if (arg12 != 0) {
            var52.method1687(arg12);
        }
        if (arg8 != 0) {
            var52.method1693(arg8);
        }
        if (arg13 != 0) {
            var52.method1659(0, arg13, 0);
        }
        return var52;
    }
}
