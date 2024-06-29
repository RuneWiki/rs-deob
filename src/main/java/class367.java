import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class367 {

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "I")
    private int field5452;

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "[[I")
    private int[][] field5454;

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "I")
    private int field5453;

    @OriginalMember(owner = "client!hc", name = "g", descriptor = "Lwe;")
    public static class24 field5457 = new class24(4);

    @OriginalMember(owner = "client!hc", name = "j", descriptor = "I")
    public static int field5460 = 0;

    @OriginalMember(owner = "client!hc", name = "i", descriptor = "I")
    public static int field5459 = 0;

    @OriginalMember(owner = "client!hc", name = "k", descriptor = "I")
    public static int field5461 = 0;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "I")
    public static int field5451;

    @OriginalMember(owner = "client!hc", name = "e", descriptor = "I")
    public static int field5455;

    @OriginalMember(owner = "client!hc", name = "f", descriptor = "I")
    public static int field5456;

    @OriginalMember(owner = "client!hc", name = "h", descriptor = "I")
    public static int field5458;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIIIIIII)V", line = 6)
    public static final void method2421(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field5458++;
        int var8 = arg2 + arg6;
        int var9 = arg7 - arg6;
        for (int var10 = arg2; var10 < var8; var10++) {
            class370.method2440(arg3, class227.field3201[var10], arg0, arg4, 117);
        }
        int var11 = arg4 + arg6;
        for (int var12 = arg7; var12 > var9; var12--) {
            class370.method2440(arg3, class227.field3201[var12], arg0, arg4, 127);
        }
        int var13 = arg3 - arg6;
        int var14 = var8;
        int var15 = -82 % ((61 - arg5) / 50);
        while (var14 <= var9) {
            int[] var16 = class227.field3201[var14];
            class370.method2440(var11, var16, arg0, arg4, 86);
            class370.method2440(var13, var16, arg1, var11, 74);
            class370.method2440(arg3, var16, arg0, var13, 119);
            var14++;
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(I[B)[B", line = 54)
    public final byte[] method2422(int arg0, byte[] arg1) {
        field5455++;
        if (this.field5454 != null) {
            int var3 = (int) ((long) arg1.length * (long) this.field5452 / (long) this.field5453) + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;
            for (int var7 = 0; var7 < arg1.length; var7++) {
                byte var10 = arg1[var7];
                int[] var11 = this.field5454[var6];
                for (int var12 = 0; var12 < 14; var12++) {
                    var4[var5 + var12] += var11[var12] * var10;
                }
                int var13 = this.field5452 + var6;
                int var14 = var13 / this.field5453;
                var6 = var13 - this.field5453 * var14;
                var5 += var14;
            }
            arg1 = new byte[var3];
            for (int var8 = 0; var8 < var3; var8++) {
                int var9 = var4[var8] + 32768 >> 16;
                if (var9 < -128) {
                    arg1[var8] = -128;
                } else if (var9 <= 127) {
                    arg1[var8] = (byte) var9;
                } else {
                    arg1[var8] = 127;
                }
            }
        }
        if (arg0 < 6) {
            method2421(-89, -7, 104, 39, 79, -81, -76, -85);
        }
        return arg1;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(I)V", line = 123)
    public static void method2423(int arg0) {
        if (arg0 != 31876) {
            method2423(53);
        }
        field5457 = null;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(II)I", line = 133)
    public final int method2424(int arg0, int arg1) {
        if (this.field5454 != null) {
            arg0 = (int) ((long) this.field5452 * (long) arg0 / (long) this.field5453);
        }
        if (arg1 >= -32) {
            method2421(-66, 45, 96, 51, 103, 58, -19, 3);
        }
        field5451++;
        return arg0;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "()V", line = 150)
    public static final void method2425() {
        class369.field5489 = 0;
        label191: for (int var0 = 0; var0 < class37.field609; var0++) {
            class306 var1 = class42.field654[var0];
            if (class339.field4983 != null) {
                for (int var2 = 0; var2 < class339.field4983.length; var2++) {
                    if (class339.field4983[var2] != -1000000 && (var1.field4386 <= class339.field4983[var2] || var1.field4364 <= class339.field4983[var2]) && (var1.field4365 <= class188.field2546[var2] || var1.field4363 <= class188.field2546[var2]) && (var1.field4365 >= class383.field5728[var2] || var1.field4363 >= class383.field5728[var2]) && (var1.field4372 <= class214.field3045[var2] || var1.field4385 <= class214.field3045[var2]) && (var1.field4372 >= class180.field2399[var2] || var1.field4385 >= class180.field2399[var2])) {
                        continue label191;
                    }
                }
            }
            if (var1.field4383 == 1) {
                int var3 = var1.field4370 + class27.field480 - class308.field4398;
                if (var3 >= 0 && var3 <= class27.field480 + class27.field480) {
                    int var4 = var1.field4369 + class27.field480 - class383.field5729;
                    if (var4 < 0) {
                        var4 = 0;
                    }
                    int var5 = var1.field4368 + class27.field480 - class383.field5729;
                    if (var5 > class27.field480 + class27.field480) {
                        var5 = class27.field480 + class27.field480;
                    }
                    boolean var6 = false;
                    while (var4 <= var5) {
                        if (class337.field4974[var3][var4++]) {
                            var6 = true;
                            break;
                        }
                    }
                    if (var6) {
                        int var7 = class146.field1926 - var1.field4365;
                        if (var7 > 32) {
                            var1.field4382 = 1;
                        } else {
                            if (var7 >= -32) {
                                continue;
                            }
                            var1.field4382 = 2;
                            var7 = -var7;
                        }
                        var1.field4380 = (var1.field4372 - class239.field3369 << 8) / var7;
                        var1.field4375 = (var1.field4385 - class239.field3369 << 8) / var7;
                        var1.field4381 = (var1.field4386 - class145.field1902 << 8) / var7;
                        var1.field4384 = (var1.field4364 - class145.field1902 << 8) / var7;
                        class79.field1086[class369.field5489++] = var1;
                    }
                }
            } else if (var1.field4383 == 2) {
                int var8 = var1.field4369 + class27.field480 - class383.field5729;
                if (var8 >= 0 && var8 <= class27.field480 + class27.field480) {
                    int var9 = var1.field4370 + class27.field480 - class308.field4398;
                    if (var9 < 0) {
                        var9 = 0;
                    }
                    int var10 = var1.field4376 + class27.field480 - class308.field4398;
                    if (var10 > class27.field480 + class27.field480) {
                        var10 = class27.field480 + class27.field480;
                    }
                    boolean var11 = false;
                    while (var9 <= var10) {
                        if (class337.field4974[var9++][var8]) {
                            var11 = true;
                            break;
                        }
                    }
                    if (var11) {
                        int var12 = class239.field3369 - var1.field4372;
                        if (var12 > 32) {
                            var1.field4382 = 3;
                        } else {
                            if (var12 >= -32) {
                                continue;
                            }
                            var1.field4382 = 4;
                            var12 = -var12;
                        }
                        var1.field4366 = (var1.field4365 - class146.field1926 << 8) / var12;
                        var1.field4371 = (var1.field4363 - class146.field1926 << 8) / var12;
                        var1.field4381 = (var1.field4386 - class145.field1902 << 8) / var12;
                        var1.field4384 = (var1.field4364 - class145.field1902 << 8) / var12;
                        class79.field1086[class369.field5489++] = var1;
                    }
                }
            } else if (var1.field4383 == 4) {
                int var13 = var1.field4386 - class145.field1902;
                if (var13 > 128) {
                    int var14 = var1.field4369 + class27.field480 - class383.field5729;
                    if (var14 < 0) {
                        var14 = 0;
                    }
                    int var15 = var1.field4368 + class27.field480 - class383.field5729;
                    if (var15 > class27.field480 + class27.field480) {
                        var15 = class27.field480 + class27.field480;
                    }
                    if (var14 <= var15) {
                        int var16 = var1.field4370 + class27.field480 - class308.field4398;
                        if (var16 < 0) {
                            var16 = 0;
                        }
                        int var17 = var1.field4376 + class27.field480 - class308.field4398;
                        if (var17 > class27.field480 + class27.field480) {
                            var17 = class27.field480 + class27.field480;
                        }
                        boolean var18 = false;
                        label163: for (int var19 = var16; var19 <= var17; var19++) {
                            for (int var20 = var14; var20 <= var15; var20++) {
                                if (class337.field4974[var19][var20]) {
                                    var18 = true;
                                    break label163;
                                }
                            }
                        }
                        if (var18) {
                            var1.field4382 = 5;
                            var1.field4366 = (var1.field4365 - class146.field1926 << 8) / var13;
                            var1.field4371 = (var1.field4363 - class146.field1926 << 8) / var13;
                            var1.field4380 = (var1.field4372 - class239.field3369 << 8) / var13;
                            var1.field4375 = (var1.field4385 - class239.field3369 << 8) / var13;
                            class79.field1086[class369.field5489++] = var1;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(II)I", line = 372)
    public final int method2426(int arg0, int arg1) {
        if (arg1 != -128) {
            method2423(83);
        }
        if (this.field5454 != null) {
            arg0 = (int) ((long) this.field5452 * (long) arg0 / (long) this.field5453) + 6;
        }
        field5456++;
        return arg0;
    }

    @OriginalMember(owner = "client!hc", name = "<init>", descriptor = "(II)V", line = 387)
    public class367(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class74.method456(-1, arg1, arg0);
            int var4 = arg1 / var3;
            int var5 = arg0 / var3;
            this.field5452 = var4;
            this.field5454 = new int[var5][14];
            this.field5453 = var5;
            for (int var6 = 0; var6 < var5; var6++) {
                int[] var7 = this.field5454[var6];
                double var8 = (double) var6 / (double) var5 + 6.0D;
                int var10 = (int) Math.floor(var8 + 1.0D - 7.0D);
                if (var10 < 0) {
                    var10 = 0;
                }
                int var11 = (int) Math.ceil(var8 + 7.0D);
                if (var11 > 14) {
                    var11 = 14;
                }
                double var12 = (double) var4 / (double) var5;
                while (var11 > var10) {
                    double var14 = ((double) var10 - var8) * 3.141592653589793D;
                    double var16 = var12;
                    if (var14 < -1.0E-4D || var14 > 1.0E-4D) {
                        var16 = var12 * (Math.sin(var14) / var14);
                    }
                    double var18 = var16 * (Math.cos(((double) var10 - var8) * 0.2243994752564138D) * 0.46D + 0.54D);
                    var7[var10] = (int) Math.floor(var18 * 65536.0D + 0.5D);
                    var10++;
                }
            }
        }
    }
}
