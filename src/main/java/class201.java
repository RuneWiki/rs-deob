import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public class class201 {

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "B")
    private byte field3392;

    @OriginalMember(owner = "client!rk", name = "r", descriptor = "I")
    public int field3408;

    @OriginalMember(owner = "client!rk", name = "y", descriptor = "I")
    public int field3415;

    @OriginalMember(owner = "client!rk", name = "e", descriptor = "I")
    public int field3395;

    @OriginalMember(owner = "client!rk", name = "m", descriptor = "I")
    public int field3403;

    @OriginalMember(owner = "client!rk", name = "k", descriptor = "I")
    public int field3401;

    @OriginalMember(owner = "client!rk", name = "u", descriptor = "[Lmh;")
    public static class62[] field3411 = new class62[100];

    @OriginalMember(owner = "client!rk", name = "j", descriptor = "I")
    public static int field3400 = 50;

    @OriginalMember(owner = "client!rk", name = "n", descriptor = "[I")
    public static int[] field3404 = new int[field3400];

    @OriginalMember(owner = "client!rk", name = "l", descriptor = "[I")
    public static int[] field3402 = new int[field3400];

    @OriginalMember(owner = "client!rk", name = "v", descriptor = "[I")
    public static int[] field3412 = new int[field3400];

    @OriginalMember(owner = "client!rk", name = "x", descriptor = "[I")
    public static int[] field3414 = new int[field3400];

    @OriginalMember(owner = "client!rk", name = "g", descriptor = "[I")
    public static int[] field3397 = new int[field3400];

    @OriginalMember(owner = "client!rk", name = "d", descriptor = "[I")
    public static int[] field3394 = new int[field3400];

    @OriginalMember(owner = "client!rk", name = "c", descriptor = "[I")
    public static int[] field3393 = new int[field3400];

    @OriginalMember(owner = "client!rk", name = "q", descriptor = "[Lmh;")
    public static class62[] field3407 = new class62[field3400];

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "I")
    public static int field3391;

    @OriginalMember(owner = "client!rk", name = "f", descriptor = "I")
    public static int field3396;

    @OriginalMember(owner = "client!rk", name = "h", descriptor = "I")
    public static int field3398;

    @OriginalMember(owner = "client!rk", name = "i", descriptor = "I")
    public static int field3399;

    @OriginalMember(owner = "client!rk", name = "o", descriptor = "I")
    public static int field3405;

    @OriginalMember(owner = "client!rk", name = "p", descriptor = "I")
    public static int field3406;

    @OriginalMember(owner = "client!rk", name = "s", descriptor = "I")
    public static int field3409;

    @OriginalMember(owner = "client!rk", name = "t", descriptor = "I")
    public static int field3410;

    @OriginalMember(owner = "client!rk", name = "w", descriptor = "I")
    public static int field3413;

    @OriginalMember(owner = "client!rk", name = "z", descriptor = "Lhi;")
    public static class26 field3416;

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(ZLjava/lang/String;)Lmh;", line = 6)
    public static final class62 method1405(boolean arg0, String arg1) {
        field3406++;
        byte[] var2 = arg1.getBytes();
        int var3 = 0;
        int var4 = var2.length;
        class62 var5 = new class62();
        var5.field906 = new byte[var4];
        while (var4 > var3) {
            int var6 = var2[var3++] & 0xFF;
            if (var6 <= 45 && var6 >= 40) {
                if (var3 >= var4) {
                    break;
                }
                int var7 = var2[var3++] & 0xFF;
                var5.field906[var5.field893++] = (byte) (var6 * 43 + var7 - 1720 - 48);
            } else if (var6 != 0) {
                var5.field906[var5.field893++] = (byte) var6;
            }
        }
        var5.method434(-68);
        if (!arg0) {
            method1411(19, 25, -19);
        }
        return var5.method421((byte) 29);
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(I)V", line = 50)
    public static final void method1406(int arg0) {
        field3413++;
        if (class53.field779 == null) {
            return;
        }
        int var1 = 38 % ((17 - arg0) / 48);
        try {
            byte[] var2 = class53.field779.method1040((byte) -127);
            if (var2 != null) {
                class92 var3 = new class92(var2);
                class8.field86 = var3.method721(114);
                class20.field215 = new class193[class8.field86];
                for (int var4 = 0; var4 < class8.field86; var4++) {
                    class193 var5 = class20.field215[var4] = new class193();
                    int var6 = var3.method721(61);
                    var5.field3252 = var6 & 0x7FFF;
                    var5.field3242 = (var6 & 0x8000) != 0;
                    var5.field3240 = var3.method696((byte) -123);
                    var5.field3239 = var3.method699((byte) -110);
                    var5.field3249 = var4;
                    int var7 = var3.method721(37);
                    var5.field3250 = class181.method1273(6, var7);
                }
                class181.method1274(0, (byte) 121, class20.field215.length - 1, class20.field215);
                class53.field779 = null;
            }
        } catch (Exception var9) {
            var9.printStackTrace();
            class53.field779 = null;
        }
    }

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "(I)I", line = 105)
    public final int method1407(int arg0) {
        if (arg0 == 3) {
            field3409++;
            return this.field3392 & 0x7;
        } else {
            return 40;
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(BI)Z", line = 122)
    public static final boolean method1408(byte arg0, int arg1) {
        field3391++;
        if (arg0 != -19) {
            method1412(-3);
        }
        return ((arg1 & 0x3C0F8D) >> 21) != 0;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(II)V", line = 133)
    public static final void method1409(int arg0, int arg1) {
        if (arg0 != -51) {
            return;
        }
        class90.field1422 = -1;
        if (arg1 == 37) {
            class169.field2758 = 3.0F;
        } else if (arg1 == 50) {
            class169.field2758 = 4.0F;
        } else if (arg1 == 75) {
            class169.field2758 = 6.0F;
        } else {
            class169.field2758 = 8.0F;
        }
        class90.field1422 = -1;
        field3399++;
    }

    @OriginalMember(owner = "client!rk", name = "c", descriptor = "(I)I", line = 167)
    public final int method1410(int arg0) {
        if (arg0 <= 35) {
            return -2;
        } else {
            field3398++;
            return (this.field3392 & 0x8) == 8 ? 1 : 0;
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(III)Z", line = 180)
    public static final boolean method1411(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class17.field160; var3++) {
            class27 var4 = class173.field2792[var3];
            if (var4.field340 == 1) {
                int var5 = var4.field330 - arg0;
                if (var5 > 0) {
                    int var6 = (var4.field328 * var5 >> 8) + var4.field346;
                    int var7 = (var4.field326 * var5 >> 8) + var4.field342;
                    int var8 = (var4.field327 * var5 >> 8) + var4.field350;
                    int var9 = (var4.field337 * var5 >> 8) + var4.field338;
                    if (arg2 >= var6 && arg2 <= var7 && arg1 >= var8 && arg1 <= var9) {
                        return true;
                    }
                }
            } else if (var4.field340 == 2) {
                int var10 = arg0 - var4.field330;
                if (var10 > 0) {
                    int var11 = (var4.field328 * var10 >> 8) + var4.field346;
                    int var12 = (var4.field326 * var10 >> 8) + var4.field342;
                    int var13 = (var4.field327 * var10 >> 8) + var4.field350;
                    int var14 = (var4.field337 * var10 >> 8) + var4.field338;
                    if (arg2 >= var11 && arg2 <= var12 && arg1 >= var13 && arg1 <= var14) {
                        return true;
                    }
                }
            } else if (var4.field340 == 3) {
                int var15 = var4.field346 - arg2;
                if (var15 > 0) {
                    int var16 = (var4.field335 * var15 >> 8) + var4.field330;
                    int var17 = (var4.field332 * var15 >> 8) + var4.field334;
                    int var18 = (var4.field327 * var15 >> 8) + var4.field350;
                    int var19 = (var4.field337 * var15 >> 8) + var4.field338;
                    if (arg0 >= var16 && arg0 <= var17 && arg1 >= var18 && arg1 <= var19) {
                        return true;
                    }
                }
            } else if (var4.field340 == 4) {
                int var20 = arg2 - var4.field346;
                if (var20 > 0) {
                    int var21 = (var4.field335 * var20 >> 8) + var4.field330;
                    int var22 = (var4.field332 * var20 >> 8) + var4.field334;
                    int var23 = (var4.field327 * var20 >> 8) + var4.field350;
                    int var24 = (var4.field337 * var20 >> 8) + var4.field338;
                    if (arg0 >= var21 && arg0 <= var22 && arg1 >= var23 && arg1 <= var24) {
                        return true;
                    }
                }
            } else if (var4.field340 == 5) {
                int var25 = arg1 - var4.field350;
                if (var25 > 0) {
                    int var26 = (var4.field335 * var25 >> 8) + var4.field330;
                    int var27 = (var4.field332 * var25 >> 8) + var4.field334;
                    int var28 = (var4.field328 * var25 >> 8) + var4.field346;
                    int var29 = (var4.field326 * var25 >> 8) + var4.field342;
                    if (arg0 >= var26 && arg0 <= var27 && arg2 >= var28 && arg2 <= var29) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!rk", name = "d", descriptor = "(I)V", line = 309)
    public static void method1412(int arg0) {
        field3414 = null;
        field3411 = null;
        field3393 = null;
        field3412 = null;
        field3397 = null;
        field3402 = null;
        if (arg0 < 16) {
            field3411 = (class62[]) null;
        }
        field3394 = null;
        field3407 = null;
        field3416 = null;
        field3404 = null;
    }

    @OriginalMember(owner = "client!rk", name = "<init>", descriptor = "()V", line = 360)
    public class201() {
    }

    @OriginalMember(owner = "client!rk", name = "<init>", descriptor = "(Lmi;)V", line = 365)
    public class201(class92 arg0) {
        this.field3392 = arg0.method743((byte) 77);
        this.field3408 = arg0.method721(50);
        this.field3415 = arg0.method704(1509947792);
        this.field3395 = arg0.method704(1509947792);
        this.field3403 = arg0.method704(1509947792);
        this.field3401 = arg0.method704(1509947792);
    }
}
