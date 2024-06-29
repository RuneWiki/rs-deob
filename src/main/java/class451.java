import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ik")
public class class451 {

    @OriginalMember(owner = "client!ik", name = "j", descriptor = "I")
    private int field6303;

    @OriginalMember(owner = "client!ik", name = "p", descriptor = "[[I")
    private int[][] field6309;

    @OriginalMember(owner = "client!ik", name = "f", descriptor = "I")
    private int field6299;

    @OriginalMember(owner = "client!ik", name = "d", descriptor = "S")
    public static short field6297 = 1;

    @OriginalMember(owner = "client!ik", name = "m", descriptor = "I")
    public static int field6306 = -1;

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "I")
    public static int field6294;

    @OriginalMember(owner = "client!ik", name = "c", descriptor = "I")
    public static int field6296;

    @OriginalMember(owner = "client!ik", name = "g", descriptor = "I")
    public static int field6300;

    @OriginalMember(owner = "client!ik", name = "h", descriptor = "I")
    public static int field6301;

    @OriginalMember(owner = "client!ik", name = "i", descriptor = "I")
    public static int field6302;

    @OriginalMember(owner = "client!ik", name = "k", descriptor = "I")
    public static int field6304;

    @OriginalMember(owner = "client!ik", name = "l", descriptor = "I")
    public static int field6305;

    @OriginalMember(owner = "client!ik", name = "n", descriptor = "I")
    public static int field6307;

    @OriginalMember(owner = "client!ik", name = "o", descriptor = "I")
    public static int field6308;

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "Lph;")
    public static class315 field6295;

    @OriginalMember(owner = "client!ik", name = "e", descriptor = "Lvp;")
    public static class76 field6298;

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(I[B)[B", line = 3)
    public final byte[] method2788(int arg0, byte[] arg1) {
        field6308++;
        if (arg0 != -24533) {
            method2792(-37, -50, -99);
        }
        if (this.field6309 != null) {
            int var3 = (int) ((long) arg1.length * (long) this.field6303 / (long) this.field6299) + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;
            for (int var7 = 0; var7 < arg1.length; var7++) {
                byte var10 = arg1[var7];
                int[] var11 = this.field6309[var6];
                for (int var12 = 0; var12 < 14; var12++) {
                    var4[var5 + var12] += var11[var12] * var10;
                }
                int var13 = this.field6303 + var6;
                int var14 = var13 / this.field6299;
                var5 += var14;
                var6 = var13 - this.field6299 * var14;
            }
            arg1 = new byte[var3];
            for (int var8 = 0; var8 < var3; var8++) {
                int var9 = var4[var8] + 32768 >> 16;
                if (var9 < -128) {
                    arg1[var8] = -128;
                } else if (var9 > 127) {
                    arg1[var8] = 127;
                } else {
                    arg1[var8] = (byte) var9;
                }
            }
        }
        return arg1;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(B)V", line = 71)
    public static final void method2789(byte arg0) {
        field6307++;
        class288[] var1 = class300.field4005;
        synchronized (class300.field4005) {
            if (arg0 != -91) {
                field6295 = null;
            }
            for (int var2 = 0; var2 < class300.field4005.length; var2++) {
                class300.field4005[var2] = new class288();
                class240.field3156[var2] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(I)V", line = 98)
    public static void method2790(int arg0) {
        field6298 = null;
        int var1 = 14 % ((arg0 + 61) / 55);
        field6295 = null;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(IIIIIIIIII)V", line = 111)
    public static final void method2791(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg5 <= 75) {
            return;
        }
        if (arg0 == arg3 && arg2 == arg8 && arg1 == arg9 && arg6 == arg7) {
            class344.method2189(102, arg1, arg3, arg2, arg4, arg7);
        } else {
            int var10 = arg3;
            int var11 = arg2;
            int var12 = arg3 * 3;
            int var13 = arg2 * 3;
            int var14 = arg0 * 3;
            int var15 = arg8 * 3;
            int var16 = arg9 * 3;
            int var17 = arg6 * 3;
            int var18 = var14 + arg1 - var16 - arg3;
            int var19 = arg7 + var15 - arg2 - var17;
            int var20 = var16 + var12 - (var14 + var14);
            int var21 = var13 + var17 - var15 - var15;
            int var22 = var14 - var12;
            int var23 = var15 - var13;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var18 * var26;
                int var28 = var19 * var26;
                int var29 = var20 * var25;
                int var30 = var21 * var25;
                int var31 = var22 * var24;
                int var32 = var23 * var24;
                int var33 = (var29 + var31 + var27 >> 12) + arg3;
                int var34 = (var28 + var30 + var32 >> 12) + arg2;
                class344.method2189(105, var33, var10, var11, arg4, var34);
                var10 = var33;
                var11 = var34;
            }
        }
        field6302++;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(III)Lsl;", line = 188)
    public static final class388 method2792(int arg0, int arg1, int arg2) {
        class316 var3 = class347.field4722[arg0][arg1][arg2];
        return var3 == null || var3.field4255 == null ? null : var3.field4255;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(BI)V", line = 198)
    public static final void method2793(byte arg0, int arg1) {
        field6294++;
        class12 var2 = class390.method2422(arg0 + 341554984, arg1, 2);
        if (arg0 != 56) {
            field6306 = 57;
        }
        var2.method65(-106);
    }

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "(B)V", line = 211)
    public static final void method2794(byte arg0) {
        class365 var1 = class321.field4308;
        synchronized (class321.field4308) {
            if (arg0 != 70) {
                field6306 = -61;
            }
            class321.field4308.method2290(13831);
        }
        field6301++;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(IB)Lul;", line = 226)
    public static final class276 method2795(int arg0, byte arg1) {
        if (arg1 != -31) {
            return null;
        }
        field6296++;
        class276 var2 = (class276) class143.field1680.method2295((long) arg0, (byte) 74);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class146.field1716.method1794(arg1 ^ 0xFFFFE905, 31, arg0);
        class276 var4 = new class276();
        if (var3 != null) {
            var4.method1736(arg1 - 62, new class242(var3), arg0);
        }
        class143.field1680.method2294(var4, (byte) 92, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(II)I", line = 251)
    public final int method2796(int arg0, int arg1) {
        int var3 = 24 % ((arg1 + 69) / 36);
        field6304++;
        if (this.field6309 != null) {
            arg0 = (int) ((long) this.field6303 * (long) arg0 / (long) this.field6299);
        }
        return arg0;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(ZI)I", line = 271)
    public final int method2797(boolean arg0, int arg1) {
        if (this.field6309 != null) {
            arg1 = ((int) ((long) this.field6303 * (long) arg1 / (long) this.field6299)) + 6;
        }
        if (arg0) {
            this.method2796(-23, -32);
        }
        field6300++;
        return arg1;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(ILbe;II)V", line = 288)
    public static final void method2798(int arg0, class131 arg1, int arg2, int arg3) {
        if (arg0 < 71) {
            return;
        }
        field6305++;
        if (arg1.field2400 == arg2 && arg2 != -1) {
            class156 var4 = class430.method2621((byte) -55, arg2);
            int var5 = var4.field1804;
            if (var5 == 1) {
                arg1.field2441 = 0;
                arg1.field2411 = 0;
                arg1.field2432 = arg3;
                arg1.field2429 = 1;
                arg1.field2398 = 0;
                class325.method2038(arg1.field1516, arg1.field1514, class143.field1684 == arg1, var4, arg1.field2441, (byte) -100);
            }
            if (var5 == 2) {
                arg1.field2398 = 0;
                return;
            }
        } else if (arg2 == -1 || arg1.field2400 == -1 || class430.method2621((byte) -34, arg2).field1827 >= class430.method2621((byte) -122, arg1.field2400).field1827) {
            arg1.field2432 = arg3;
            arg1.field2398 = 0;
            arg1.field2411 = 0;
            arg1.field2400 = arg2;
            arg1.field2491 = arg1.field2486;
            arg1.field2429 = 1;
            arg1.field2441 = 0;
            if (arg1.field2400 != -1) {
                class325.method2038(arg1.field1516, arg1.field1514, class143.field1684 == arg1, class430.method2621((byte) -99, arg1.field2400), arg1.field2441, (byte) -100);
                return;
            }
        } else {
            return;
        }
    }

    @OriginalMember(owner = "client!ik", name = "<init>", descriptor = "(II)V", line = 345)
    public class451(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class262.method1656(92, arg0, arg1);
            int var4 = arg0 / var3;
            int var5 = arg1 / var3;
            this.field6303 = var5;
            this.field6309 = new int[var4][14];
            this.field6299 = var4;
            for (int var6 = 0; var6 < var4; var6++) {
                int[] var7 = this.field6309[var6];
                double var8 = (double) var6 / (double) var4 + 6.0D;
                int var10 = (int) Math.floor(var8 + 1.0D - 7.0D);
                if (var10 < 0) {
                    var10 = 0;
                }
                int var11 = (int) Math.ceil(var8 + 7.0D);
                if (var11 > 14) {
                    var11 = 14;
                }
                double var12 = (double) var5 / (double) var4;
                while (var10 < var11) {
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
