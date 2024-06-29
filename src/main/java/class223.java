import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dba")
public class class223 {

    @OriginalMember(owner = "client!dba", name = "k", descriptor = "I")
    private int field3279 = -1;

    @OriginalMember(owner = "client!dba", name = "s", descriptor = "Z")
    public boolean field3287 = true;

    @OriginalMember(owner = "client!dba", name = "j", descriptor = "I")
    private int field3278;

    @OriginalMember(owner = "client!dba", name = "r", descriptor = "I")
    private int field3286;

    @OriginalMember(owner = "client!dba", name = "q", descriptor = "Lrw;")
    private class128 field3285;

    @OriginalMember(owner = "client!dba", name = "o", descriptor = "Los;")
    private class468 field3283;

    @OriginalMember(owner = "client!dba", name = "d", descriptor = "I")
    private int field3272;

    @OriginalMember(owner = "client!dba", name = "c", descriptor = "Lot;")
    private class210 field3271;

    @OriginalMember(owner = "client!dba", name = "p", descriptor = "Leea;")
    private class407 field3284;

    @OriginalMember(owner = "client!dba", name = "m", descriptor = "Lsw;")
    private class11 field3281;

    @OriginalMember(owner = "client!dba", name = "h", descriptor = "I")
    public static int field3276 = 64;

    @OriginalMember(owner = "client!dba", name = "l", descriptor = "I")
    public static int field3280 = 0;

    @OriginalMember(owner = "client!dba", name = "f", descriptor = "Lqp;")
    public static class586 field3274 = new class586(94, -2);

    @OriginalMember(owner = "client!dba", name = "u", descriptor = "[[I")
    public static int[][] field3289 = new int[128][128];

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "I")
    public static int field3269;

    @OriginalMember(owner = "client!dba", name = "b", descriptor = "I")
    public static int field3270;

    @OriginalMember(owner = "client!dba", name = "e", descriptor = "I")
    public static int field3273;

    @OriginalMember(owner = "client!dba", name = "g", descriptor = "I")
    public static int field3275;

    @OriginalMember(owner = "client!dba", name = "i", descriptor = "I")
    public static int field3277;

    @OriginalMember(owner = "client!dba", name = "n", descriptor = "I")
    public static int field3282;

    @OriginalMember(owner = "client!dba", name = "t", descriptor = "Ljava/lang/Object;")
    public static Object field3288;

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "(B)V", line = 7)
    public final void method1463(byte arg0) {
        if (arg0 < -42) {
            field3269++;
            this.method1466(this.field3284, this.field3272, 0);
        }
    }

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "(IIIII)V", line = 22)
    public static final void method1464(int arg0, int arg1, int arg2, int arg3, int arg4) {
        for (class434 var5 = (class434) class566.field8403.method2496((byte) -109); var5 != null; var5 = (class434) class566.field8403.method2494(113)) {
            class608.method3536(arg0, arg3, 64, arg2, var5, arg4);
        }
        field3282++;
        for (class434 var6 = (class434) class255.field3733.method2496((byte) 89); var6 != null; var6 = (class434) class255.field3733.method2494(70)) {
            byte var11 = 1;
            class229 var12 = var6.field6353.method513(arg1 - 1);
            if (var6.field6353.field1065) {
                var11 = 0;
            } else if (var6.field6353.field1039 == var12.field3379 || var6.field6353.field1039 == var12.field3398 || var6.field6353.field1039 == var12.field3400 || var6.field6353.field1039 == var12.field3367) {
                var11 = 2;
            } else if (var6.field6353.field1039 == var12.field3377 || var6.field6353.field1039 == var12.field3370 || var6.field6353.field1039 == var12.field3363 || var6.field6353.field1039 == var12.field3372) {
                var11 = 3;
            }
            if (var6.field6365 != var11) {
                int var13 = class153.method896(var6.field6353, 18);
                if (var6.field6351 != var13) {
                    if (var6.field6356 != null) {
                        class105.field1321.method2085(var6.field6356);
                        var6.field6356 = null;
                    }
                    var6.field6351 = var13;
                }
                var6.field6365 = var11;
            }
            var6.field6363 = var6.field6353.field3464;
            var6.field6354 = var6.field6353.field3464 + (var6.field6353.method514(arg1 ^ 0x1) << 6);
            var6.field6369 = var6.field6353.field3463;
            var6.field6350 = var6.field6353.field3463 + (var6.field6353.method514(0) << 6);
            class608.method3536(arg0, arg3, 64, arg2, var6, arg4);
        }
        for (class434 var7 = (class434) class426.field6077.method1331(-1925); var7 != null; var7 = (class434) class426.field6077.method1340((byte) 65)) {
            byte var8 = 1;
            class229 var9 = var7.field6372.method513(arg1 ^ 0x1);
            if (var7.field6372.field1065) {
                var8 = 0;
            } else if (var7.field6372.field1039 == var9.field3379 || var7.field6372.field1039 == var9.field3398 || var7.field6372.field1039 == var9.field3400 || var7.field6372.field1039 == var9.field3367) {
                var8 = 2;
            } else if (var7.field6372.field1039 == var9.field3377 || var7.field6372.field1039 == var9.field3370 || var7.field6372.field1039 == var9.field3363 || var7.field6372.field1039 == var9.field3372) {
                var8 = 3;
            }
            if (var7.field6365 != var8) {
                int var10 = class62.method388(var7.field6372, -34);
                if (var7.field6351 != var10) {
                    if (var7.field6356 != null) {
                        class105.field1321.method2085(var7.field6356);
                        var7.field6356 = null;
                    }
                    var7.field6351 = var10;
                }
                var7.field6365 = var8;
            }
            var7.field6363 = var7.field6372.field3464;
            var7.field6354 = var7.field6372.field3464 + (var7.field6372.method514(0) << 6);
            var7.field6369 = var7.field6372.field3463;
            var7.field6350 = var7.field6372.field3463 + (var7.field6372.method514(arg1 - 1) << 6);
            class608.method3536(arg0, arg3, 64, arg2, var7, arg4);
        }
        if (arg1 != 1) {
            method1464(75, 113, 43, -118, 5);
        }
    }

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "(I)V", line = 139)
    public static void method1465(int arg0) {
        field3289 = null;
        field3274 = null;
        if (arg0 == -1) {
            field3288 = null;
        }
    }

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "(Leea;II)V", line = 156)
    private final void method1466(class407 arg0, int arg1, int arg2) {
        field3273++;
        if (arg1 != 0) {
            this.method1467((byte) -86);
            this.field3283.method2811(this.field3271, -2);
            this.field3283.method2847(-89, arg0, 4, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!dba", name = "b", descriptor = "(B)V", line = 170)
    private final void method1467(byte arg0) {
        field3270++;
        if (!this.field3287) {
            return;
        }
        this.field3287 = false;
        byte[] var2 = this.field3285.field1697;
        if (arg0 != -86) {
            return;
        }
        byte[] var3 = this.field3283.field7103;
        int var4 = 0;
        int var5 = this.field3285.field1703;
        int var6 = this.field3285.field1703 * this.field3286 + this.field3278;
        for (int var7 = -128; var7 < 0; var7++) {
            var4 = (var4 << 8) - var4;
            for (int var13 = -128; var13 < 0; var13++) {
                if (var2[var6++] != 0) {
                    var4++;
                }
            }
            var6 += var5 - 128;
        }
        if (this.field3271 != null && this.field3279 == var4) {
            this.field3287 = false;
            return;
        }
        this.field3279 = var4;
        int var8 = 0;
        int var9 = this.field3286 * var5 + this.field3278;
        for (int var10 = -128; var10 < 0; var10++) {
            for (int var11 = -128; var11 < 0; var11++) {
                if (var2[var9] == 0) {
                    int var12 = 0;
                    if (var2[var9 - 1] != 0) {
                        var12++;
                    }
                    if (var2[var9 + 1] != 0) {
                        var12++;
                    }
                    if (var2[var9 - var5] != 0) {
                        var12++;
                    }
                    if (var2[var5 + var9] != 0) {
                        var12++;
                    }
                    var3[var8++] = (byte) (var12 * 17);
                } else {
                    var3[var8++] = 68;
                }
                var9++;
            }
            var9 += this.field3285.field1703 - 128;
        }
        if (this.field3271 == null) {
            this.field3271 = new class210(this.field3283, 3553, 6406, 128, 128, false, this.field3283.field7103, 6406, false);
            this.field3271.method1359(10497, false, false);
            this.field3271.method3174(true, -17759);
        } else {
            this.field3271.method1366(0, 128, false, this.field3283.field7103, 0, true, 6406, 128, 0, 0);
        }
    }

    @OriginalMember(owner = "client!dba", name = "<init>", descriptor = "(Los;Lrw;Lnba;IIIII)V", line = 314)
    public class223(class468 arg0, class128 arg1, class366 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field3278 = arg6;
        this.field3286 = arg7;
        this.field3285 = arg1;
        this.field3283 = arg0;
        int var9 = 0x1 << arg5;
        int var10 = 0;
        int var11 = arg3 << arg5;
        int var12 = arg4 << arg5;
        for (int var13 = 0; var13 < var9; var13++) {
            int var25 = (var12 + var13) * arg2.field8121 + var11;
            for (int var26 = 0; var26 < var9; var26++) {
                short[] var27 = arg2.field5284[var25++];
                if (var27 != null) {
                    var10 += var27.length;
                }
            }
        }
        this.field3272 = var10;
        if (var10 <= 0) {
            this.field3271 = null;
        } else {
            class428 var14 = new class428(var10 * 2);
            if (this.field3283.field7004) {
                for (int var15 = 0; var15 < var9; var15++) {
                    int var16 = (var12 + var15) * arg2.field8121 + var11;
                    for (int var17 = 0; var17 < var9; var17++) {
                        short[] var18 = arg2.field5284[var16++];
                        if (var18 != null) {
                            for (int var19 = 0; var19 < var18.length; var19++) {
                                var14.method2608(var18[var19] & 0xFFFF, (byte) 80);
                            }
                        }
                    }
                }
            } else {
                for (int var20 = 0; var20 < var9; var20++) {
                    int var21 = (var12 + var20) * arg2.field8121 + var11;
                    for (int var22 = 0; var22 < var9; var22++) {
                        short[] var23 = arg2.field5284[var21++];
                        if (var23 != null) {
                            for (int var24 = 0; var24 < var23.length; var24++) {
                                var14.method2590(var23[var24] & 0xFFFF, (byte) -63);
                            }
                        }
                    }
                }
            }
            this.field3284 = this.field3283.method2825((byte) 124, var14.field6221, var14.field6162, false, 5123);
            this.field3281 = new class11(this.field3283, 5123, null, 1);
        }
    }

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "(ZII[B)V", line = 284)
    public final void method1468(boolean arg0, int arg1, int arg2, byte[] arg3) {
        this.field3281.method55(arg2 * this.field3283.method2783(-9, arg1), arg3, 25321, arg1);
        field3277++;
        this.method1466(this.field3281, arg2, 0);
        if (arg0) {
            method1465(-100);
        }
    }
}
