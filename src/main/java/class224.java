import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bea")
public class class224 extends class536 {

    @OriginalMember(owner = "client!bea", name = "k", descriptor = "I")
    private int field3283 = 0;

    @OriginalMember(owner = "client!bea", name = "m", descriptor = "I")
    private int field3285 = 0;

    @OriginalMember(owner = "client!bea", name = "v", descriptor = "I")
    private int field3294 = 0;

    @OriginalMember(owner = "client!bea", name = "F", descriptor = "Z")
    private boolean field3304 = false;

    @OriginalMember(owner = "client!bea", name = "x", descriptor = "I")
    private int field3296 = 0;

    @OriginalMember(owner = "client!bea", name = "z", descriptor = "I")
    private int field3298;

    @OriginalMember(owner = "client!bea", name = "j", descriptor = "Lwu;")
    private class373 field3282;

    @OriginalMember(owner = "client!bea", name = "b", descriptor = "I")
    private int field3274;

    @OriginalMember(owner = "client!bea", name = "i", descriptor = "Lch;")
    private class465 field3281;

    @OriginalMember(owner = "client!bea", name = "r", descriptor = "Z")
    private boolean field3290;

    @OriginalMember(owner = "client!bea", name = "D", descriptor = "Z")
    private boolean field3302;

    @OriginalMember(owner = "client!bea", name = "C", descriptor = "Z")
    private boolean field3301;

    @OriginalMember(owner = "client!bea", name = "p", descriptor = "Z")
    private boolean field3288;

    @OriginalMember(owner = "client!bea", name = "E", descriptor = "Lwq;")
    public static class168 field3303 = new class168();

    @OriginalMember(owner = "client!bea", name = "H", descriptor = "Loo;")
    public static class629 field3306 = new class629(3, 4);

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "I")
    public static int field3273;

    @OriginalMember(owner = "client!bea", name = "c", descriptor = "I")
    public static int field3275;

    @OriginalMember(owner = "client!bea", name = "d", descriptor = "I")
    public static int field3276;

    @OriginalMember(owner = "client!bea", name = "e", descriptor = "I")
    public static int field3277;

    @OriginalMember(owner = "client!bea", name = "f", descriptor = "I")
    public static int field3278;

    @OriginalMember(owner = "client!bea", name = "g", descriptor = "I")
    public static int field3279;

    @OriginalMember(owner = "client!bea", name = "h", descriptor = "I")
    public static int field3280;

    @OriginalMember(owner = "client!bea", name = "l", descriptor = "I")
    public static int field3284;

    @OriginalMember(owner = "client!bea", name = "n", descriptor = "I")
    public static int field3286;

    @OriginalMember(owner = "client!bea", name = "o", descriptor = "I")
    public static int field3287;

    @OriginalMember(owner = "client!bea", name = "q", descriptor = "I")
    public static int field3289;

    @OriginalMember(owner = "client!bea", name = "s", descriptor = "I")
    public static int field3291;

    @OriginalMember(owner = "client!bea", name = "t", descriptor = "I")
    public static int field3292;

    @OriginalMember(owner = "client!bea", name = "u", descriptor = "I")
    public static int field3293;

    @OriginalMember(owner = "client!bea", name = "w", descriptor = "I")
    public static int field3295;

    @OriginalMember(owner = "client!bea", name = "y", descriptor = "I")
    public static int field3297;

    @OriginalMember(owner = "client!bea", name = "A", descriptor = "I")
    public static int field3299;

    @OriginalMember(owner = "client!bea", name = "B", descriptor = "I")
    public static int field3300;

    @OriginalMember(owner = "client!bea", name = "G", descriptor = "I")
    public static int field3305;

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(IIIIII)V")
    public final void method135(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field3295++;
        int[] var7 = this.field3282.method428(arg4, arg5, arg2, arg3);
        if (var7 != null) {
            for (int var8 = 0; var8 < var7.length; var8++) {
                var7[var8] = class625.method3600(var7[var8], -16777216);
            }
            this.method1511(arg0, arg1, arg2, arg3, var7, 0, arg2);
        }
    }

    @OriginalMember(owner = "client!bea", name = "d", descriptor = "()I")
    public final int method1504() {
        field3292++;
        return this.field3298 - (-this.field3283 - this.field3294);
    }

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(IIII)V")
    public final void method1505(int arg0, int arg1, int arg2, int arg3) {
        this.field3283 = arg0;
        field3280++;
        this.field3294 = arg2;
        this.field3285 = arg3;
        this.field3296 = arg1;
        this.field3304 = this.field3283 != 0 || this.field3296 != 0 || this.field3294 != 0 || this.field3285 != 0;
    }

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(IIIII)V")
    public final void method133(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3278++;
        class441 var6 = this.field3282.method2334((byte) 97);
        class441 var7 = this.field3282.method2299(-25498);
        int var8 = this.field3296 + arg1;
        int var9 = this.field3283 + arg0;
        this.field3281.method1342((byte) 127, class699.field9640);
        this.field3282.method2306(-14571);
        this.field3282.method2294(this.field3281, -2);
        this.field3282.method2405(arg4, 115);
        this.field3282.method2353((byte) -114, arg2);
        this.field3282.method2329(1, (byte) -125, class469.field6850);
        this.field3282.method2407(1, class469.field6850, 80);
        this.field3282.method2415(arg3, 0);
        var6.method2720((float) this.field3298, 0.0F, 0, (float) this.field3274);
        var6.method758(var9, var8, 0);
        var7.method2720(this.field3281.method1263((byte) 109, (float) this.field3298), 1.0F, 0, this.field3281.method1273((float) this.field3274, -107));
        this.field3282.method2291(class127.field1688, -106);
        this.field3282.method2406(true);
        this.field3282.method2422(-25804);
        this.field3282.method2410(-1);
        this.field3282.method2329(1, (byte) -127, class328.field4670);
        this.field3282.method2407(1, class328.field4670, 77);
    }

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(I)V")
    public static void method1506(int arg0) {
        field3306 = null;
        if (arg0 == 0) {
            field3303 = null;
        }
    }

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(III)V")
    public final void method130(int arg0, int arg1, int arg2) {
        field3279++;
        int[] var4 = this.field3282.method428(arg0, arg1, this.field3298, this.field3274);
        int[] var5 = new int[this.field3298 * this.field3274];
        this.field3281.method1271(0, var5, this.field3274, 0, 0, -4685, this.field3298);
        if (arg2 == 0) {
            for (int var6 = 0; var6 < this.field3274; var6++) {
                int var7 = this.field3298 * var6;
                for (int var8 = 0; var8 < this.field3298; var8++) {
                    var5[var7 + var8] = class625.method3600(class493.method2943(16777215, var5[var7 + var8]), class493.method2943(486473728, var4[var7 + var8]) << 8);
                }
            }
        } else if (arg2 == 1) {
            for (int var9 = 0; var9 < this.field3274; var9++) {
                int var10 = this.field3298 * var9;
                for (int var11 = 0; var11 < this.field3298; var11++) {
                    var5[var10 + var11] = class625.method3600(class493.method2943(-16765084, var4[var10 + var11] << 16), class493.method2943(16777215, var5[var10 + var11]));
                }
            }
        } else if (arg2 == 2) {
            for (int var12 = 0; var12 < this.field3274; var12++) {
                int var13 = this.field3298 * var12;
                for (int var14 = 0; var14 < this.field3298; var14++) {
                    var5[var13 + var14] = class625.method3600(class493.method2943(2113389055, var4[var13 + var14]) << 24, class493.method2943(16777215, var5[var13 + var14]));
                }
            }
        } else if (arg2 == 3) {
            for (int var15 = 0; var15 < this.field3274; var15++) {
                int var16 = this.field3298 * var15;
                for (int var17 = 0; var17 < this.field3298; var17++) {
                    var5[var16 + var17] = class625.method3600(var4[var16 + var17] == 0 ? 0 : -16777216, class493.method2943(16777215, var5[var16 + var17]));
                }
            }
        }
        this.method1511(0, 0, this.field3298, this.field3274, var5, 0, this.field3298);
    }

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(IILaa;II)V")
    public final void method131(int arg0, int arg1, class488 arg2, int arg3, int arg4) {
        field3284++;
        class660 var6 = (class660) arg2;
        int var7 = this.field3296 + arg1;
        int var8 = this.field3283 + arg0;
        class465 var9 = var6.field9238;
        this.field3281.method1342((byte) 44, class699.field9640);
        this.field3282.method2306(-14571);
        this.field3282.method2294(this.field3281, -2);
        this.field3282.method2405(1, 107);
        this.field3282.method2353((byte) -71, 1);
        class441 var10 = this.field3282.method2334((byte) 95);
        var10.method2720((float) this.field3298, 0.0F, 0, (float) this.field3274);
        var10.method758(var8, var7, 0);
        this.field3282.method2406(true);
        class441 var11 = this.field3282.method2299(-25498);
        var11.method2720(this.field3281.method1263((byte) 109, (float) this.field3298), 1.0F, 0, this.field3281.method1273((float) this.field3274, -115));
        this.field3282.method2291(class127.field1688, -109);
        this.field3282.method2375((byte) -98, 1);
        this.field3282.method2294(var9, -2);
        this.field3282.method2300(class336.field4874, class499.field7099, 0);
        this.field3282.method2329(0, (byte) -124, class328.field4670);
        class441 var12 = this.field3282.method2299(-25498);
        var12.method2720(var9.method1263((byte) 109, (float) this.field3298), 1.0F, 0, var9.method1273((float) this.field3274, -94));
        var12.method2725((byte) -76, var9.method1263((byte) 109, (float) (var8 - arg3)), var9.method1273((float) (var7 - arg4), -104), 0.0F);
        this.field3282.method2291(class127.field1688, -113);
        this.field3282.method2422(-25804);
        this.field3282.method2410(-1);
        this.field3282.method2329(0, (byte) -128, class331.field4759);
        this.field3282.method2300(class336.field4874, class336.field4874, 0);
        this.field3282.method2294(null, -2);
        this.field3282.method2375((byte) 104, 0);
        this.field3282.method2410(-1);
    }

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "([I)V")
    public final void method1507(int[] arg0) {
        arg0[0] = this.field3283;
        arg0[2] = this.field3294;
        arg0[1] = this.field3296;
        arg0[3] = this.field3285;
        field3305++;
    }

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(FFFFFFIIII)V")
    public final void method1508(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9) {
        field3293++;
        class441 var11 = this.field3282.method2334((byte) 76);
        class441 var12 = this.field3282.method2299(-25498);
        this.field3281.method1342((byte) 74, this.field3290 || this.field3302 || (arg9 & 0x1) == 0 ? class699.field9640 : class395.field5936);
        this.field3282.method2306(-14571);
        this.field3282.method2294(this.field3281, -2);
        this.field3282.method2405(arg8, 123);
        this.field3282.method2353((byte) -121, arg6);
        this.field3282.method2329(1, (byte) -128, class469.field6850);
        this.field3282.method2407(1, class469.field6850, 100);
        this.field3282.method2415(arg7, 0);
        if (this.field3304) {
            float var13 = (float) this.method1504();
            float var14 = (float) this.method1514();
            float var15 = (arg2 - arg0) / var13;
            float var16 = (arg3 - arg1) / var13;
            float var17 = (arg4 - arg0) / var14;
            float var18 = (arg5 - arg1) / var14;
            float var19 = (float) this.field3296 * var17;
            float var20 = (float) this.field3296 * var18;
            float var21 = (float) this.field3283 * var15;
            float var22 = (float) this.field3283 * var16;
            float var23 = (float) this.field3294 * -var15;
            float var24 = (float) this.field3294 * -var16;
            float var25 = (float) this.field3285 * -var17;
            arg0 = arg0 + var21 + var19;
            arg1 = arg1 + var22 + var20;
            float var26 = (float) this.field3285 * -var18;
            arg4 = arg4 + var21 + var25;
            arg2 = arg2 + var23 + var19;
            arg3 = arg3 + var24 + var20;
            arg5 = arg5 + var22 + var26;
        }
        var11.method2716(0.0F, arg4 - arg0, 0.0F, 0.0F, arg3 - arg1, arg2 - arg0, 1.0F, 0.0F, 52, arg5 - arg1);
        var11.method2725((byte) -91, arg0, arg1, 0.0F);
        var12.method2720(this.field3281.method1263((byte) 109, (float) this.field3298), 1.0F, 0, this.field3281.method1273((float) this.field3274, -103));
        this.field3282.method2291(class127.field1688, 52);
        this.field3282.method2406(true);
        this.field3282.method2422(-25804);
        this.field3282.method2410(-1);
        this.field3282.method2329(1, (byte) -126, class328.field4670);
        this.field3282.method2407(1, class328.field4670, 52);
    }

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(ILjava/lang/String;)V")
    public static final void method1509(int arg0, String arg1) {
        class736.field10317 = arg1;
        field3275++;
        if (class466.field6830 == null || arg0 != 23489) {
            return;
        }
        try {
            String var2 = class466.field6830.getParameter("cookieprefix");
            String var3 = class466.field6830.getParameter("cookiehost");
            String var4 = var2 + "settings=" + arg1 + "; version=1; path=/; domain=" + var3;
            String var5;
            if (arg1.length() == 0) {
                var5 = var4 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                var5 = var4 + "; Expires=" + class162.method1188(class524.method3075(18) + 94608000000L, (byte) -76) + "; Max-Age=" + 94608000L;
            }
            class121.method876("document.cookie=\"" + var5 + "\"", arg0 - 23417, class466.field6830);
        } catch (Throwable var6) {
        }
    }

    @OriginalMember(owner = "client!bea", name = "b", descriptor = "()I")
    public final int method1510() {
        field3286++;
        return this.field3274;
    }

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(IIII[III)V")
    private final void method1511(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6) {
        this.field3281.method1268(arg5, arg2, arg0, arg3, arg6, arg1, arg4, 118);
        field3276++;
    }

    @OriginalMember(owner = "client!bea", name = "b", descriptor = "(III)V")
    public static final void method1512(int arg0, int arg1, int arg2) {
        field3300++;
        if (class373.field5652 == class199.field2993) {
            if (class461.method2815(0, false, 0, -2, arg1, 1, arg0, 119, 1)) {
                return;
            }
            class461.method2815(0, false, 0, -3, arg1, 1, arg0, 117, 1);
        } else if (class461.method2815(0, false, 0, -3, arg1, 1, arg0, 124, 1)) {
            return;
        } else {
            class461.method2815(0, false, 0, -2, arg1, 1, arg0, 119, 1);
        }
        int var3 = 13 / ((arg2 - 70) / 56);
    }

    @OriginalMember(owner = "client!bea", name = "b", descriptor = "(IIIIIII)V")
    public final void method1513(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3299++;
        class441 var8 = this.field3282.method2334((byte) 71);
        class441 var9 = this.field3282.method2299(-25498);
        this.field3281.method1342((byte) 114, class699.field9640);
        this.field3282.method2306(-14571);
        this.field3282.method2294(this.field3281, -2);
        this.field3282.method2405(arg6, 117);
        this.field3282.method2353((byte) -92, arg4);
        this.field3282.method2329(1, (byte) -126, class469.field6850);
        this.field3282.method2407(1, class469.field6850, 121);
        this.field3282.method2415(arg5, 0);
        boolean var10 = this.field3288 && this.field3296 == 0 && this.field3285 == 0;
        boolean var11 = this.field3301 && this.field3283 == 0 && this.field3294 == 0;
        if (var10 & var11) {
            var9.method2720(this.field3281.method1263((byte) 109, (float) arg2), 1.0F, 0, this.field3281.method1273((float) arg3, -119));
            var8.method2720((float) arg2, 0.0F, 0, (float) arg3);
            var8.method758(arg0, arg1, 0);
            this.field3282.method2291(class127.field1688, 107);
            this.field3282.method2406(true);
            this.field3282.method2422(-25804);
        } else if (var11) {
            int var30 = arg1 + arg3;
            int var31 = this.method1514();
            var9.method2720(this.field3281.method1263((byte) 109, (float) arg2), 1.0F, 0, this.field3281.method1273((float) this.field3274, -111));
            this.field3282.method2291(class127.field1688, 70);
            int var32 = this.field3296 + arg1;
            int var33 = this.field3274 + var32;
            while (var30 >= var33) {
                var8.method2720((float) arg2, 0.0F, 0, (float) this.field3274);
                var8.method758(arg0, var32, 0);
                this.field3282.method2406(true);
                var33 += var31;
                this.field3282.method2422(-25804);
                var32 += var31;
            }
            if (var32 < var30) {
                int var34 = var30 - var32;
                var9.method2720(this.field3281.method1263((byte) 109, (float) arg2), 1.0F, 0, this.field3281.method1273((float) var34, -118));
                this.field3282.method2291(class127.field1688, -120);
                var8.method2720((float) arg2, 0.0F, 0, (float) var34);
                var8.method758(arg0, var32, 0);
                this.field3282.method2406(true);
                this.field3282.method2422(-25804);
            }
        } else if (var10) {
            int var12 = arg0 + arg2;
            int var13 = this.method1504();
            var9.method2720(this.field3281.method1263((byte) 109, (float) this.field3298), 1.0F, 0, this.field3281.method1273((float) arg3, -82));
            this.field3282.method2291(class127.field1688, -106);
            int var14 = this.field3283 + arg0;
            int var15 = this.field3298 + var14;
            while (var15 <= var12) {
                var8.method2720((float) this.field3298, 0.0F, 0, (float) arg3);
                var8.method758(var14, arg1, 0);
                this.field3282.method2406(true);
                var14 += var13;
                var15 += var13;
                this.field3282.method2422(-25804);
            }
            if (var12 > var14) {
                int var16 = var12 - var14;
                var9.method2720(this.field3281.method1263((byte) 109, (float) var16), 1.0F, 0, this.field3281.method1273((float) arg3, -91));
                this.field3282.method2291(class127.field1688, -123);
                var8.method2720((float) var16, 0.0F, 0, (float) arg3);
                var8.method758(var14, arg1, 0);
                this.field3282.method2406(true);
                this.field3282.method2422(-25804);
            }
        } else {
            int var17 = arg1 + arg3;
            int var18 = arg0 + arg2;
            int var19 = this.method1504();
            int var20 = this.method1514();
            int var21 = this.field3296 + arg1;
            int var22 = this.field3274 + var21;
            while (var17 >= var22) {
                var9.method2720(this.field3281.method1263((byte) 109, (float) this.field3298), 1.0F, 0, this.field3281.method1273((float) this.field3274, -105));
                this.field3282.method2291(class127.field1688, -127);
                int var27 = this.field3283 + arg0;
                for (int var28 = var27 + this.field3298; var28 <= var18; var28 += var19) {
                    var8.method2720((float) this.field3298, 0.0F, 0, (float) this.field3274);
                    var8.method758(var27, var21, 0);
                    this.field3282.method2406(true);
                    this.field3282.method2422(-25804);
                    var27 += var19;
                }
                if (var27 < var18) {
                    int var29 = var18 - var27;
                    var9.method2720(this.field3281.method1263((byte) 109, (float) var29), 1.0F, 0, this.field3281.method1273((float) this.field3274, -125));
                    this.field3282.method2291(class127.field1688, -115);
                    var8.method2720((float) var29, 0.0F, 0, (float) this.field3274);
                    var8.method758(var27, var21, 0);
                    this.field3282.method2406(true);
                    this.field3282.method2422(-25804);
                }
                var22 += var20;
                var21 += var20;
            }
            if (var17 > var21) {
                int var23 = var17 - var21;
                var9.method2720(this.field3281.method1263((byte) 109, (float) this.field3298), 1.0F, 0, this.field3281.method1273((float) var23, -75));
                this.field3282.method2291(class127.field1688, 26);
                int var24 = this.field3283 + arg0;
                int var25 = this.field3298 + var24;
                while (var18 >= var25) {
                    var8.method2720((float) this.field3298, 0.0F, 0, (float) var23);
                    var8.method758(var24, var21, 0);
                    this.field3282.method2406(true);
                    var25 += var19;
                    this.field3282.method2422(-25804);
                    var24 += var19;
                }
                if (var24 < var18) {
                    int var26 = var18 - var24;
                    var9.method2720(this.field3281.method1263((byte) 109, (float) var26), 1.0F, 0, this.field3281.method1273((float) var23, -90));
                    this.field3282.method2291(class127.field1688, 27);
                    var8.method2720((float) var26, 0.0F, 0, (float) var23);
                    var8.method758(var24, var21, 0);
                    this.field3282.method2406(true);
                    this.field3282.method2422(-25804);
                }
            }
        }
        this.field3282.method2410(-1);
        this.field3282.method2329(1, (byte) -126, class328.field4670);
        this.field3282.method2407(1, class328.field4670, 92);
    }

    @OriginalMember(owner = "client!bea", name = "c", descriptor = "()I")
    public final int method1514() {
        field3291++;
        return this.field3274 + this.field3285 + this.field3296;
    }

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(IIIBIIII)V")
    public static final void method1515(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7) {
        field3287++;
        int var8 = 0;
        int var9 = arg5;
        int var10 = 0;
        if (arg3 <= 76) {
            method1512(-119, 122, -6);
        }
        int var11 = arg0 - arg1;
        int var12 = arg5 - arg1;
        int var13 = arg0 * arg0;
        int var14 = arg5 * arg5;
        int var15 = var11 * var11;
        int var16 = var12 * var12;
        int var17 = var14 << 1;
        int var18 = var13 << 1;
        int var19 = var16 << 1;
        int var20 = var15 << 1;
        int var21 = arg5 << 1;
        int var22 = var12 << 1;
        int var23 = (1 - var21) * var13 + var17;
        int var24 = var14 - (var21 - 1) * var18;
        int var25 = (1 - var22) * var15 + var19;
        int var26 = var16 - (var22 - 1) * var20;
        int var27 = var13 << 2;
        int var28 = var14 << 2;
        int var29 = var15 << 2;
        int var30 = var16 << 2;
        int var31 = var17 * 3;
        int var32 = (var21 - 3) * var18;
        int var33 = var19 * 3;
        int var34 = (var22 - 3) * var20;
        int var35 = var28;
        int var36 = (arg5 - 1) * var27;
        int var37 = var30;
        int var38 = (var12 - 1) * var29;
        int[] var39 = class664.field9322[arg4];
        class238.method1577(arg7, var39, arg2 - var11, -arg0 + arg2, (byte) 0);
        class238.method1577(arg6, var39, arg2 + var11, -var11 + arg2, (byte) 121);
        class238.method1577(arg7, var39, arg2 + arg0, arg2 + var11, (byte) -22);
        while (var9 > 0) {
            boolean var40 = var9 <= var12;
            if (var23 < 0) {
                while (var23 < 0) {
                    var23 += var31;
                    var24 += var35;
                    var8++;
                    var31 += var28;
                    var35 += var28;
                }
            }
            if (var40) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var26 += var37;
                        var25 += var33;
                        var10++;
                        var33 += var30;
                        var37 += var30;
                    }
                }
                if (var26 < 0) {
                    var26 += var37;
                    var25 += var33;
                    var10++;
                    var33 += var30;
                    var37 += var30;
                }
                var25 += -var38;
                var26 += -var34;
                var34 -= var29;
                var38 -= var29;
            }
            if (var24 < 0) {
                var23 += var31;
                var24 += var35;
                var35 += var28;
                var31 += var28;
                var8++;
            }
            var23 += -var36;
            var24 += -var32;
            var32 -= var27;
            var9--;
            var36 -= var27;
            int var41 = arg4 - var9;
            int var42 = arg4 + var9;
            int var43 = arg2 + var8;
            int var44 = arg2 - var8;
            if (var40) {
                int var45 = arg2 + var10;
                int var46 = arg2 - var10;
                class238.method1577(arg7, class664.field9322[var41], var46, var44, (byte) -111);
                class238.method1577(arg6, class664.field9322[var41], var45, var46, (byte) 121);
                class238.method1577(arg7, class664.field9322[var41], var43, var45, (byte) -117);
                class238.method1577(arg7, class664.field9322[var42], var46, var44, (byte) -80);
                class238.method1577(arg6, class664.field9322[var42], var45, var46, (byte) 127);
                class238.method1577(arg7, class664.field9322[var42], var43, var45, (byte) 126);
            } else {
                class238.method1577(arg7, class664.field9322[var41], var43, var44, (byte) 125);
                class238.method1577(arg7, class664.field9322[var42], var43, var44, (byte) -87);
            }
        }
    }

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(IIIIIIII)V")
    public final void method132(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3273++;
        class441 var9 = this.field3282.method2334((byte) 126);
        class441 var10 = this.field3282.method2299(-25498);
        this.field3281.method1342((byte) 84, this.field3290 || this.field3302 || (arg7 & 0x1) == 0 ? class699.field9640 : class395.field5936);
        this.field3282.method2306(-14571);
        this.field3282.method2294(this.field3281, -2);
        this.field3282.method2405(arg6, 116);
        this.field3282.method2353((byte) -104, arg4);
        this.field3282.method2329(1, (byte) -125, class469.field6850);
        this.field3282.method2407(1, class469.field6850, 96);
        this.field3282.method2415(arg5, 0);
        var10.method2720(this.field3281.method1263((byte) 109, (float) this.field3298), 1.0F, 0, this.field3281.method1273((float) this.field3274, -82));
        if (this.field3304) {
            arg2 = this.field3298 * arg2 / this.method1504();
            arg3 = this.field3274 * arg3 / this.method1514();
            arg0 += this.field3283 * arg2 / this.field3298;
            arg1 += this.field3296 * arg3 / this.field3274;
        }
        var9.method2720((float) arg2, 0.0F, 0, (float) arg3);
        var9.method758(arg0, arg1, 0);
        this.field3282.method2291(class127.field1688, 80);
        this.field3282.method2406(true);
        this.field3282.method2422(-25804);
        this.field3282.method2410(-1);
        this.field3282.method2329(1, (byte) -125, class328.field4670);
        this.field3282.method2407(1, class328.field4670, 80);
    }

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(IILjava/lang/String;)V")
    public static final void method1516(int arg0, int arg1, String arg2) {
        field3289++;
        class303.field4299++;
        class468 var3 = class93.method734(class29.field284, class162.field2574, 8174);
        var3.field6839.method3730(114, class574.method3322(arg2, 16383) + 1);
        var3.field6839.method3704(true, arg1);
        var3.field6839.method3692(120, arg2);
        class120.method872((byte) -95, var3);
        if (arg0 <= 86) {
            method1509(-45, null);
        }
    }

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "()I")
    public final int method1517() {
        field3277++;
        return this.field3298;
    }

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(FFFFFFILaa;II)V")
    public final void method1518(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class488 arg7, int arg8, int arg9) {
        field3297++;
        class441 var11 = this.field3282.method2334((byte) 109);
        class441 var12 = this.field3282.method2299(-25498);
        class660 var13 = (class660) arg7;
        class465 var14 = var13.field9238;
        this.field3281.method1342((byte) 121, this.field3290 || this.field3302 || (arg6 & 0x1) == 0 ? class699.field9640 : class395.field5936);
        this.field3282.method2306(-14571);
        this.field3282.method2294(this.field3281, -2);
        this.field3282.method2405(1, 126);
        this.field3282.method2353((byte) -89, 1);
        if (this.field3304) {
            float var15 = (float) this.field3298 / (float) this.method1504();
            float var16 = (float) this.field3274 / (float) this.method1514();
            var11.method2716(0.0F, (arg4 - arg0) * var16, 0.0F, 0.0F, (arg3 - arg1) * var15, (arg2 - arg0) * var15, 1.0F, 0.0F, 78, (arg5 - arg1) * var16);
            var11.method2725((byte) -98, ((float) this.field3283 + arg0) * var15, ((float) this.field3296 + arg1) * var16, 0.0F);
        } else {
            var11.method2716(0.0F, arg4 - arg0, 0.0F, 0.0F, arg3 - arg1, -arg0 + arg2, 1.0F, 0.0F, 104, arg5 - arg1);
            var11.method2725((byte) -113, arg0, arg1, 0.0F);
        }
        var12.method2720(this.field3281.method1263((byte) 109, (float) this.field3298), 1.0F, 0, this.field3281.method1273((float) this.field3274, -98));
        this.field3282.method2291(class127.field1688, -122);
        this.field3282.method2375((byte) -121, 1);
        this.field3282.method2294(var14, -2);
        this.field3282.method2300(class336.field4874, class499.field7099, 0);
        this.field3282.method2329(0, (byte) -124, class328.field4670);
        class441 var17 = this.field3282.method2299(-25498);
        var17.method772(var11);
        var17.method758(-arg8, -arg9, 0);
        var17.method2728(var14.method1273(1.0F, -96), (byte) -49, 1.0F, var14.method1263((byte) 109, 1.0F));
        this.field3282.method2291(class127.field1688, 30);
        this.field3282.method2406(true);
        this.field3282.method2422(-25804);
        this.field3282.method2410(-1);
        this.field3282.method2329(0, (byte) -128, class331.field4759);
        this.field3282.method2300(class336.field4874, class336.field4874, 0);
        this.field3282.method2294(null, -2);
        this.field3282.method2375((byte) 57, 0);
        this.field3282.method2410(-1);
    }

    @OriginalMember(owner = "client!bea", name = "<init>", descriptor = "(Lwu;IIZ)V")
    public class224(class373 arg0, int arg1, int arg2, boolean arg3) {
        this.field3298 = arg1;
        this.field3282 = arg0;
        this.field3274 = arg2;
        this.field3281 = arg0.method2343(class256.field3677, arg1, arg3 ? class752.field10511 : class505.field7177, false, arg2);
        this.field3281.method1272(true, (byte) -90, true);
        this.field3290 = arg1 != this.field3281.method1262((byte) -98);
        this.field3302 = this.field3281.method1264(21110) != arg2;
        this.field3301 = !this.field3290 && this.field3281.method1266((byte) 112);
        this.field3288 = !this.field3302 && this.field3281.method1266((byte) 3);
    }

    @OriginalMember(owner = "client!bea", name = "<init>", descriptor = "(Lwu;II[III)V")
    public class224(class373 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        this.field3282 = arg0;
        this.field3274 = arg2;
        this.field3298 = arg1;
        this.field3281 = arg0.method2417(arg5, false, arg2, arg1, arg3, arg4, 11);
        this.field3281.method1272(true, (byte) -121, true);
        this.field3290 = this.field3281.method1262((byte) -96) != arg1;
        this.field3302 = arg2 != this.field3281.method1264(21110);
        this.field3301 = !this.field3290 && this.field3281.method1266((byte) 74);
        this.field3288 = !this.field3302 && this.field3281.method1266((byte) -99);
    }
}
