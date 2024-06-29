import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vfa")
public class class266 {

    @OriginalMember(owner = "client!vfa", name = "a", descriptor = "Z")
    private boolean field3303 = true;

    @OriginalMember(owner = "client!vfa", name = "u", descriptor = "I")
    private int field3323 = -1;

    @OriginalMember(owner = "client!vfa", name = "h", descriptor = "I")
    private int field3310;

    @OriginalMember(owner = "client!vfa", name = "n", descriptor = "[Lka;")
    private class623[] field3316;

    @OriginalMember(owner = "client!vfa", name = "r", descriptor = "I")
    private int field3320;

    @OriginalMember(owner = "client!vfa", name = "p", descriptor = "I")
    private int field3318;

    @OriginalMember(owner = "client!vfa", name = "g", descriptor = "I")
    private int field3309;

    @OriginalMember(owner = "client!vfa", name = "j", descriptor = "[Lka;")
    private class623[] field3312;

    @OriginalMember(owner = "client!vfa", name = "b", descriptor = "Lka;")
    private class623 field3304;

    @OriginalMember(owner = "client!vfa", name = "t", descriptor = "Lcq;")
    public static class110 field3322 = new class110(70, 0);

    @OriginalMember(owner = "client!vfa", name = "v", descriptor = "I")
    public static int field3324 = 0;

    @OriginalMember(owner = "client!vfa", name = "w", descriptor = "[I")
    public static int[] field3325 = new int[1000];

    @OriginalMember(owner = "client!vfa", name = "c", descriptor = "I")
    public static int field3305;

    @OriginalMember(owner = "client!vfa", name = "d", descriptor = "I")
    private int field3306;

    @OriginalMember(owner = "client!vfa", name = "e", descriptor = "I")
    public static int field3307;

    @OriginalMember(owner = "client!vfa", name = "k", descriptor = "I")
    public static int field3313;

    @OriginalMember(owner = "client!vfa", name = "l", descriptor = "I")
    public static int field3314;

    @OriginalMember(owner = "client!vfa", name = "m", descriptor = "I")
    public static int field3315;

    @OriginalMember(owner = "client!vfa", name = "o", descriptor = "I")
    private int field3317;

    @OriginalMember(owner = "client!vfa", name = "q", descriptor = "I")
    public static int field3319;

    @OriginalMember(owner = "client!vfa", name = "i", descriptor = "Lf;")
    private class534 field3311;

    @OriginalMember(owner = "client!vfa", name = "s", descriptor = "Ltf;")
    public static class701 field3321;

    @OriginalMember(owner = "client!vfa", name = "f", descriptor = "[[Lvc;")
    public static class390[][] field3308;

    @OriginalMember(owner = "client!vfa", name = "a", descriptor = "(IZ)Z")
    public static final boolean method1566(int arg0, boolean arg1) {
        if (arg1) {
            return true;
        } else {
            field3313++;
            return arg0 == 10 || arg0 == 3 || arg0 == 1007 || arg0 == 8 || arg0 == 59;
        }
    }

    @OriginalMember(owner = "client!vfa", name = "a", descriptor = "(IZII)I")
    public static final int method1567(int arg0, boolean arg1, int arg2, int arg3) {
        field3315++;
        if (!arg1) {
            method1566(-105, false);
        }
        if (arg0 > arg3) {
            return arg0;
        } else if (arg3 > arg2) {
            return arg2;
        } else {
            return arg3;
        }
    }

    @OriginalMember(owner = "client!vfa", name = "a", descriptor = "(I)V")
    public final void method1568(int arg0) {
        if (this.field3316 != null) {
            for (int var2 = 0; var2 < this.field3316.length; var2++) {
                this.field3316[var2].method3492();
            }
        }
        field3314++;
        this.field3311 = null;
        if (arg0 != 0) {
            this.method1571(-50, -88, -103, 2, 48, null, -68, -111, -91, -126);
        }
    }

    @OriginalMember(owner = "client!vfa", name = "a", descriptor = "(Ljava/lang/String;B)J")
    public static final long method1569(String arg0, byte arg1) {
        field3305++;
        int var2 = -89 % ((-arg1 - 45) / 52);
        long var3 = 0L;
        int var5 = arg0.length();
        for (int var6 = 0; var6 < var5; var6++) {
            var3 *= 37L;
            char var7 = arg0.charAt(var6);
            if (var7 >= 'A' && var7 <= 'Z') {
                var3 += (var7 + 1 - 65);
            } else if (var7 >= 'a' && var7 <= 'z') {
                var3 += (var7 + 1 - 97);
            } else if (var7 >= '0' && var7 <= '9') {
                var3 += (var7 - 21);
            }
            if (var3 >= 177917621779460413L) {
                break;
            }
        }
        while (var3 % 37L == 0L && var3 != 0L) {
            var3 /= 37L;
        }
        return var3;
    }

    @OriginalMember(owner = "client!vfa", name = "a", descriptor = "(IZLr;)Z")
    public final boolean method1570(int arg0, boolean arg1, class564 arg2) {
        if (this.field3323 != arg0) {
            this.field3323 = arg0;
            int var4 = class668.method3699(28069, arg0);
            if (var4 > 512) {
                var4 = 512;
            }
            if (var4 <= 0) {
                var4 = 1;
            }
            if (this.field3317 != var4) {
                this.field3311 = null;
                this.field3317 = var4;
            }
            if (this.field3316 != null) {
                this.field3306 = 0;
                int[] var5 = new int[this.field3316.length];
                for (int var6 = 0; var6 < this.field3316.length; var6++) {
                    class623 var7 = this.field3316[var6];
                    if (var7.method3498(this.field3310, this.field3318, this.field3320, this.field3323)) {
                        var5[this.field3306] = var7.field8797;
                        this.field3312[this.field3306++] = var7;
                    }
                }
                class487.method2809(var5, this.field3306 - 1, (byte) -32, 0, this.field3312);
            }
            this.field3303 = true;
        }
        field3307++;
        if (!arg1) {
            this.field3303 = false;
        }
        boolean var8 = false;
        if (this.field3303) {
            this.field3303 = false;
            for (int var9 = this.field3306 - 1; var9 >= 0; var9--) {
                boolean var10 = this.field3312[var9].method3499(arg2, this.field3304);
                var8 |= var10;
                this.field3303 |= !var10;
            }
        }
        return var8;
    }

    @OriginalMember(owner = "client!vfa", name = "a", descriptor = "(IIIIILr;IIII)V")
    public final void method1571(int arg0, int arg1, int arg2, int arg3, int arg4, class564 arg5, int arg6, int arg7, int arg8, int arg9) {
        int var11 = arg0 + arg6 & 0x3FFF;
        field3319++;
        if (~this.field3309 == arg4) {
            arg5.method1022(arg9, arg3, arg1, arg2, arg8, 0);
        } else {
            class295 var12 = class93.field939.method140(this.field3309, 862);
            if (this.field3311 == null && class93.field939.method144(8649, this.field3309)) {
                int[] var13 = var12.field3666 ? class93.field939.method141(false, this.field3309, this.field3317, 0.7F, 16944, this.field3317) : class93.field939.method145(this.field3317, false, 0.7F, -18551, this.field3317, this.field3309);
                this.field3311 = arg5.method1017(var13, 0, this.field3317, this.field3317, this.field3317);
            }
            if (var12.field3666) {
                arg5.method1022(arg9, arg3, arg1, arg2, arg8, 0);
            }
            if (this.field3311 != null) {
                int var14 = var12.field3666 ? 1 : 0;
                int var15 = arg2 * arg7 / -4096;
                int var16;
                for (var16 = arg2 * var11 / 4096 + (arg1 - arg2) / 2; var16 > arg2; var16 -= arg2) {
                }
                while (arg2 < var15) {
                    var15 -= arg2;
                }
                while (var16 < 0) {
                    var16 += arg2;
                }
                while (var15 < 0) {
                    var15 += arg2;
                }
                for (int var17 = var16 - arg2; var17 < arg1; var17 += arg2) {
                    for (int var18 = var15 - arg2; var18 < arg2; var18 += arg2) {
                        this.field3311.method2997(var17 + arg9, var18 - -arg3, arg2, arg2, 1, 0, var14);
                    }
                }
            }
        }
        for (int var19 = this.field3306 - 1; var19 >= 0; var19--) {
            this.field3312[var19].method3500(arg5, arg9, arg3, arg1, arg2, arg7, var11);
        }
    }

    @OriginalMember(owner = "client!vfa", name = "a", descriptor = "(Z)V")
    public static void method1572(boolean arg0) {
        if (arg0) {
            field3321 = null;
        }
        field3308 = null;
        field3321 = null;
        field3325 = null;
        field3322 = null;
    }

    @OriginalMember(owner = "client!vfa", name = "<init>", descriptor = "(I[Lka;IIII)V")
    public class266(int arg0, class623[] arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field3310 = arg3;
        this.field3316 = arg1;
        this.field3320 = arg5;
        this.field3318 = arg4;
        this.field3309 = arg0;
        if (arg1 == null) {
            this.field3312 = null;
            this.field3304 = null;
        } else {
            this.field3312 = new class623[arg1.length];
            this.field3304 = arg2 >= 0 ? arg1[arg2] : null;
        }
    }
}
