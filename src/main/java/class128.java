import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public class class128 extends class249 {

    @OriginalMember(owner = "client!ak", name = "x", descriptor = "I")
    public int field2339;

    @OriginalMember(owner = "client!ak", name = "y", descriptor = "I")
    public int field2340;

    @OriginalMember(owner = "client!ak", name = "s", descriptor = "Z")
    public static boolean field2334 = true;

    @OriginalMember(owner = "client!ak", name = "r", descriptor = "Lmb;")
    public static class96 field2333 = class243.method1708("Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3", (byte) 120);

    @OriginalMember(owner = "client!ak", name = "o", descriptor = "I")
    public static int field2330;

    @OriginalMember(owner = "client!ak", name = "p", descriptor = "I")
    public static int field2331;

    @OriginalMember(owner = "client!ak", name = "t", descriptor = "I")
    public static int field2335;

    @OriginalMember(owner = "client!ak", name = "u", descriptor = "I")
    public static int field2336;

    @OriginalMember(owner = "client!ak", name = "v", descriptor = "I")
    public static int field2337;

    @OriginalMember(owner = "client!ak", name = "w", descriptor = "I")
    public static int field2338;

    @OriginalMember(owner = "client!ak", name = "z", descriptor = "I")
    public static int field2341;

    @OriginalMember(owner = "client!ak", name = "B", descriptor = "I")
    public static int field2342;

    @OriginalMember(owner = "client!ak", name = "q", descriptor = "Ldd;")
    public static class265 field2332;

    @OriginalMember(owner = "client!ak", name = "c", descriptor = "(B)V")
    public static final void method974(byte arg0) {
        class25.field424 = -3;
        class203.field3517 = 1;
        class19.field301 = 0;
        class10.field174 = false;
        if (arg0 == 50) {
            class56.field972 = 0;
            class89.field1470 = 0;
            class141.field2519 = -1;
            field2338++;
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method975(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2336++;
        int var8 = 0;
        int var9 = arg4;
        int var10 = arg2 - arg7;
        int var11 = 0;
        int var12 = arg2 * arg2;
        int var13 = arg4 - arg7;
        int var14 = arg4 * arg4;
        int var15 = var10 * var10;
        int var16 = var13 * var13;
        int var17 = var14 << 1;
        int var18 = var12 << 1;
        int var19 = var15 << 1;
        int var20 = var16 << 1;
        int var21 = var13 << 1;
        int var22 = arg4 << 1;
        int var23 = (1 - var21) * var15 + var20;
        int var24 = var14 - ((arg0 + var22) * var18);
        int var25 = var14 << 2;
        int var26 = var16 - ((var21 - 1) * var19);
        int var27 = var15 << 2;
        int var28 = var12 << 2;
        int var29 = (1 - var22) * var12 + var17;
        int var30 = var16 << 2;
        int var31 = var17 * 3;
        int var32 = (var22 - 3) * var18;
        int var33 = var20 * 3;
        int var34 = var25;
        int var35 = (var21 - 3) * var19;
        int var36 = (arg4 - 1) * var28;
        int var37 = var30;
        if (client.field1994 <= arg6 && class9.field149 >= arg6) {
            int[] var38 = class229.field3939[arg6];
            int var39 = class268.method1841(class162.field2884, class9.field145, 0, arg1 - arg2);
            int var40 = class268.method1841(class162.field2884, class9.field145, 0, arg1 + arg2);
            int var41 = class268.method1841(class162.field2884, class9.field145, ~arg0, arg1 - var10);
            int var42 = class268.method1841(class162.field2884, class9.field145, 0, arg1 + var10);
            class36.method283(var39, var38, var41, (byte) -103, arg5);
            class36.method283(var41, var38, var42, (byte) -104, arg3);
            class36.method283(var42, var38, var40, (byte) -109, arg5);
        }
        int var43 = (var13 - 1) * var27;
        while (var9 > 0) {
            if (var29 < 0) {
                while (var29 < 0) {
                    var29 += var31;
                    var8++;
                    var24 += var34;
                    var31 += var25;
                    var34 += var25;
                }
            }
            if (var24 < 0) {
                var24 += var34;
                var34 += var25;
                var8++;
                var29 += var31;
                var31 += var25;
            }
            var29 += -var36;
            var36 -= var28;
            var24 += -var32;
            boolean var44 = var9 <= var13;
            if (var44) {
                if (var23 < 0) {
                    while (var23 < 0) {
                        var11++;
                        var26 += var37;
                        var23 += var33;
                        var37 += var30;
                        var33 += var30;
                    }
                }
                if (var26 < 0) {
                    var23 += var33;
                    var33 += var30;
                    var11++;
                    var26 += var37;
                    var37 += var30;
                }
                var26 += -var35;
                var35 -= var27;
                var23 += -var43;
                var43 -= var27;
            }
            var9--;
            var32 -= var28;
            int var45 = arg6 - var9;
            int var46 = arg6 + var9;
            if (client.field1994 <= var46 && var45 <= class9.field149) {
                int var47 = class268.method1841(class162.field2884, class9.field145, ~arg0, arg1 + var8);
                int var48 = class268.method1841(class162.field2884, class9.field145, ~arg0, arg1 - var8);
                if (var44) {
                    int var49 = class268.method1841(class162.field2884, class9.field145, ~arg0, arg1 + var11);
                    int var50 = class268.method1841(class162.field2884, class9.field145, 0, arg1 - var11);
                    if (var45 >= client.field1994) {
                        int[] var51 = class229.field3939[var45];
                        class36.method283(var48, var51, var50, (byte) -95, arg5);
                        class36.method283(var50, var51, var49, (byte) -95, arg3);
                        class36.method283(var49, var51, var47, (byte) -112, arg5);
                    }
                    if (var46 <= class9.field149) {
                        int[] var52 = class229.field3939[var46];
                        class36.method283(var48, var52, var50, (byte) -77, arg5);
                        class36.method283(var50, var52, var49, (byte) -101, arg3);
                        class36.method283(var49, var52, var47, (byte) -121, arg5);
                    }
                } else {
                    if (var45 >= client.field1994) {
                        class36.method283(var48, class229.field3939[var45], var47, (byte) -65, arg5);
                    }
                    if (class9.field149 >= var46) {
                        class36.method283(var48, class229.field3939[var46], var47, (byte) -79, arg5);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IBI)I")
    public static final int method976(int arg0, byte arg1, int arg2) {
        int var3 = -9 / ((arg1 - 60) / 49);
        field2335++;
        if (arg2 < arg0) {
            int var4 = arg2;
            arg2 = arg0;
            arg0 = var4;
        }
        while (arg0 != 0) {
            int var5 = arg2 % arg0;
            arg2 = arg0;
            arg0 = var5;
        }
        return arg2;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(II)V")
    public static final void method977(int arg0, int arg1) {
        class50.field875 = new int[arg1];
        class9.field144 = new int[arg1];
        class56.field966 = new int[arg1];
        class138.field2471 = new int[arg1];
        if (arg0 != 1) {
            field2332 = null;
        }
        field2331++;
        class2.field19 = new int[arg1];
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(ZIIIZ)V")
    public static final void method978(boolean arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2330++;
        if (arg2 != -29289) {
            method977(79, 60);
        }
        class198.method1387((byte) -102, arg3, arg1, arg0, 0, class62.field1053.length - 1, arg4);
    }

    @OriginalMember(owner = "client!ak", name = "<init>", descriptor = "(II)V")
    public class128(int arg0, int arg1) {
        this.field2339 = arg0;
        this.field2340 = arg1;
    }

    @OriginalMember(owner = "client!ak", name = "d", descriptor = "(B)V")
    public static void method979(byte arg0) {
        field2333 = null;
        field2332 = null;
        if (arg0 <= 2) {
            field2334 = true;
        }
    }
}
