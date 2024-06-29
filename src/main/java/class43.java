import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public class class43 implements Runnable {

    @OriginalMember(owner = "client!kc", name = "e", descriptor = "Z")
    public boolean field479 = true;

    @OriginalMember(owner = "client!kc", name = "h", descriptor = "Ljava/lang/Object;")
    public Object field482 = new Object();

    @OriginalMember(owner = "client!kc", name = "k", descriptor = "I")
    public int field485 = 0;

    @OriginalMember(owner = "client!kc", name = "n", descriptor = "[I")
    public int[] field488 = new int[500];

    @OriginalMember(owner = "client!kc", name = "m", descriptor = "[I")
    public int[] field487 = new int[500];

    @OriginalMember(owner = "client!kc", name = "d", descriptor = "J")
    public static long field478 = 0L;

    @OriginalMember(owner = "client!kc", name = "f", descriptor = "Z")
    public static boolean field480 = false;

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "Lqj;")
    public static class280 field477 = new class280(128);

    @OriginalMember(owner = "client!kc", name = "o", descriptor = "J")
    public static long field489 = 0L;

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "I")
    public static int field476;

    @OriginalMember(owner = "client!kc", name = "g", descriptor = "I")
    public static int field481;

    @OriginalMember(owner = "client!kc", name = "i", descriptor = "I")
    public static int field483;

    @OriginalMember(owner = "client!kc", name = "j", descriptor = "I")
    public static int field484;

    @OriginalMember(owner = "client!kc", name = "l", descriptor = "I")
    public static int field486;

    @OriginalMember(owner = "client!kc", name = "p", descriptor = "I")
    public static int field490;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "Lpa;")
    public static class2 field475;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IIIIIIIB)Z", line = 6)
    public static final boolean method267(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7) {
        field476++;
        long var8 = class113.method730(arg4, arg1 + arg3, arg0 + arg2);
        if (arg7 != 55) {
            method267(-118, 67, 122, 118, 86, 22, 10, (byte) -83);
        }
        if (var8 != 0L) {
            int var10 = ((int) var8 & 0x33A6A6) >> 20;
            int var11 = (int) (var8 >>> 32) & Integer.MAX_VALUE;
            int var12 = ((int) var8 & 0x7E3CA) >> 14;
            class234 var13 = class123.method795(arg7 ^ 0x37, var11);
            if (var13.field3573 == -1) {
                int var14 = arg6;
                if (var8 > 0L) {
                    var14 = arg5;
                }
                int[] var15 = class343.field5439;
                int var16 = (103 - arg0) * 4 * 512 + (arg1 * 4) + 24624;
                if (var12 == 0 || var12 == 2) {
                    if (var10 == 0) {
                        var15[var16] = var14;
                        var15[var16 + 512] = var14;
                        var15[var16 + 1024] = var14;
                        var15[var16 + 1536] = var14;
                    } else if (var10 == 1) {
                        var15[var16] = var14;
                        var15[var16 + 1] = var14;
                        var15[var16 + 2] = var14;
                        var15[var16 + 3] = var14;
                    } else if (var10 == 2) {
                        var15[var16 + 3] = var14;
                        var15[var16 + 512 + 3] = var14;
                        var15[var16 + 1027] = var14;
                        var15[var16 + 1539] = var14;
                    } else if (var10 == 3) {
                        var15[var16 + 1536] = var14;
                        var15[var16 + 1536 + 1] = var14;
                        var15[var16 + 1536 + 2] = var14;
                        var15[var16 + 3 + 1536] = var14;
                    }
                }
                if (var12 == 3) {
                    if (var10 == 0) {
                        var15[var16] = var14;
                    } else if (var10 == 1) {
                        var15[var16 + 3] = var14;
                    } else if (var10 == 2) {
                        var15[var16 + 1536 + 3] = var14;
                    } else if (var10 == 3) {
                        var15[var16 + 1536] = var14;
                    }
                }
                if (var12 == 2) {
                    if (var10 == 3) {
                        var15[var16] = var14;
                        var15[var16 + 512] = var14;
                        var15[var16 + 1024] = var14;
                        var15[var16 + 1536] = var14;
                    } else if (var10 == 0) {
                        var15[var16] = var14;
                        var15[var16 + 1] = var14;
                        var15[var16 + 2] = var14;
                        var15[var16 + 3] = var14;
                    } else if (var10 == 1) {
                        var15[var16 + 3] = var14;
                        var15[var16 + 3 + 512] = var14;
                        var15[var16 + 1024 + 3] = var14;
                        var15[var16 + 3 + 1536] = var14;
                    } else if (var10 == 2) {
                        var15[var16 + 1536] = var14;
                        var15[var16 + 1537] = var14;
                        var15[var16 + 1536 + 2] = var14;
                        var15[var16 + 3 + 1536] = var14;
                    }
                }
            } else if (!class232.method1605(arg2, arg1, var13, arg0, var10, arg3, (byte) -91)) {
                return false;
            }
        }
        long var17 = class181.method1248(arg4, arg1 + arg3, arg0 - -arg2);
        if (var17 != 0L) {
            int var19 = (int) var17 >> 20 & 0x3;
            int var20 = ((int) var17 & 0x7E410) >> 14;
            int var21 = Integer.MAX_VALUE & (int) (var17 >>> 32);
            class234 var22 = class123.method795(0, var21);
            if (var22.field3573 == -1) {
                if (var20 == 9) {
                    int var23 = 15658734;
                    if (var17 > 0L) {
                        var23 = 15597568;
                    }
                    int[] var24 = class343.field5439;
                    int var25 = arg1 * 4 + (((103 - arg0) * 512 * 4) + 24624);
                    if (var19 == 0 || var19 == 2) {
                        var24[var25 + 1536] = var23;
                        var24[var25 + 1024 + 1] = var23;
                        var24[var25 + 2 + 512] = var23;
                        var24[var25 + 3] = var23;
                    } else {
                        var24[var25] = var23;
                        var24[var25 + 512 + 1] = var23;
                        var24[var25 + 1024 + 2] = var23;
                        var24[var25 + 3 + 1536] = var23;
                    }
                }
            } else if (!class232.method1605(arg2, arg1, var22, arg0, var19, arg3, (byte) -91)) {
                return false;
            }
        }
        long var26 = class215.method1499(arg4, arg1 + arg3, arg0 - -arg2);
        if (var26 != 0L) {
            int var28 = (int) var26 >> 20 & 0x3;
            int var29 = Integer.MAX_VALUE & (int) (var26 >>> 32);
            class234 var30 = class123.method795(arg7 - 55, var29);
            if (var30.field3573 != -1 && !class232.method1605(arg2, arg1, var30, arg0, var28, arg3, (byte) -91)) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(DB)V", line = 217)
    public static final void method268(double arg0, byte arg1) {
        if (arg1 != 32) {
            field490 = 56;
        }
        field484++;
        if (class256.field4044 == arg0) {
            return;
        }
        for (int var3 = 0; var3 < 256; var3++) {
            int var4 = (int) (Math.pow((double) var3 / 255.0D, arg0) * 255.0D);
            class140.field2146[var3] = var4 > 255 ? 255 : var4;
        }
        class256.field4044 = arg0;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(B)V", line = 246)
    public static void method269(byte arg0) {
        if (arg0 >= -27) {
            field477 = (class280) null;
        }
        field477 = null;
        field475 = null;
    }

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "(B)Z", line = 262)
    public static final boolean method270(byte arg0) {
        field486++;
        int var1 = -86 % ((31 - arg0) / 57);
        if (class324.field5210) {
            try {
                class198.method1380((byte) 121, "showVideoAd", class156.field2451.field254);
                return true;
            } catch (Throwable var3) {
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(I)V", line = 285)
    public static final void method271(int arg0) {
        field483++;
        while (true) {
            class60 var1;
            class242 var3;
            do {
                var1 = (class60) class315.field4945.method1808(0);
                if (var1 == null) {
                    if (arg0 != -1) {
                        method267(68, 37, -126, 84, -71, -84, -88, (byte) 95);
                    }
                    return;
                }
                if (var1.field706 >= 0) {
                    int var2 = var1.field706 - 1;
                    var3 = class251.field3974[var2];
                } else {
                    int var4 = -var1.field706 - 1;
                    if (class50.field573 == var4) {
                        var3 = class11.field113;
                    } else {
                        var3 = class105.field1443[var4];
                    }
                }
            } while (var3 == null);
            class234 var5 = class123.method795(0, var1.field717);
            int var6;
            int var7;
            if (var1.field697 == 1 || var1.field697 == 3) {
                var6 = var5.field3590;
                var7 = var5.field3577;
            } else {
                var6 = var5.field3577;
                var7 = var5.field3590;
            }
            int var8 = (var6 >> 1) + var1.field715;
            if (class219.field3290 < 3) {
            }
            int var9 = (var7 + 1 >> 1) + var1.field700;
            int[][] var10 = class72.field902[class219.field3290];
            int var11 = (var6 + 1 >> 1) + var1.field715;
            int var12 = (var7 >> 1) + var1.field700;
            int var13 = var10[var8][var9] + var10[var8][var12] + var10[var11][var12] + var10[var11][var9] >> 2;
            class294 var14 = null;
            int var15 = class346.field5487[var1.field702];
            if (var15 == 0) {
                class123 var16 = class312.method2204(class219.field3290, var1.field715, var1.field700);
                if (var16 != null) {
                    var14 = var16.field1697;
                }
            } else if (var15 == 1) {
                class54 var19 = class250.method1775(class219.field3290, var1.field715, var1.field700);
                if (var19 != null) {
                    var14 = var19.field630;
                }
            } else if (var15 == 2) {
                class44 var17 = class285.method2053(class219.field3290, var1.field715, var1.field700);
                if (var17 != null) {
                    var14 = var17.field494;
                }
            } else if (var15 == 3) {
                class360 var18 = class356.method2454(class219.field3290, var1.field715, var1.field700);
                if (var18 != null) {
                    var14 = var18.field5697;
                }
            }
            if (var14 != null) {
                class13.method74(var15, 0, -1, var1.field715, var1.field701 + 1, -105, class219.field3290, 0, var1.field700, var1.field705 + 1);
                var3.field3708 = var1.field715 * 128 + var6 * 64;
                var3.field3801 = var1.field701 + class102.field1381;
                var3.field3725 = var14;
                var3.field3793 = class102.field1381 + var1.field705;
                var3.field3774 = var13;
                var3.field3704 = var1.field700 * 128 + var7 * 64;
                int var20 = var1.field704;
                int var21 = var1.field707;
                int var22 = var1.field709;
                int var23 = var1.field716;
                if (var21 > var20) {
                    int var24 = var21;
                    var21 = var20;
                    var20 = var24;
                }
                var3.field3750 = var1.field715 + var21;
                if (var22 > var23) {
                    int var25 = var22;
                    var22 = var23;
                    var23 = var25;
                }
                var3.field3757 = var1.field700 + var22;
                var3.field3779 = var1.field715 + var20;
                var3.field3808 = var1.field700 + var23;
            }
        }
    }

    @OriginalMember(owner = "client!kc", name = "run", descriptor = "()V", line = 467)
    public final void run() {
        while (this.field479) {
            Object var1 = this.field482;
            synchronized (this.field482) {
                if (this.field485 < 500) {
                    this.field487[this.field485] = class197.field3009;
                    this.field488[this.field485] = class128.field1873;
                    this.field485++;
                }
            }
            class19.method140(50L, 16711680);
        }
        field481++;
    }
}
