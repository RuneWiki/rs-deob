import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class226 extends class604 {

    @OriginalMember(owner = "client!qb", name = "H", descriptor = "I")
    private int field3224;

    @OriginalMember(owner = "client!qb", name = "F", descriptor = "I")
    private int field3222;

    @OriginalMember(owner = "client!qb", name = "K", descriptor = "I")
    private int field3227;

    @OriginalMember(owner = "client!qb", name = "y", descriptor = "I")
    private int field3215;

    @OriginalMember(owner = "client!qb", name = "D", descriptor = "I")
    public static int field3220 = 1407;

    @OriginalMember(owner = "client!qb", name = "u", descriptor = "[Lbe;")
    public static class37[] field3211 = new class37[14];

    @OriginalMember(owner = "client!qb", name = "r", descriptor = "I")
    public static int field3208;

    @OriginalMember(owner = "client!qb", name = "s", descriptor = "I")
    public static int field3209;

    @OriginalMember(owner = "client!qb", name = "v", descriptor = "I")
    private int field3212;

    @OriginalMember(owner = "client!qb", name = "w", descriptor = "I")
    private int field3213;

    @OriginalMember(owner = "client!qb", name = "x", descriptor = "I")
    public static int field3214;

    @OriginalMember(owner = "client!qb", name = "A", descriptor = "I")
    private int field3217;

    @OriginalMember(owner = "client!qb", name = "B", descriptor = "I")
    public static int field3218;

    @OriginalMember(owner = "client!qb", name = "C", descriptor = "I")
    public static int field3219;

    @OriginalMember(owner = "client!qb", name = "E", descriptor = "I")
    public static int field3221;

    @OriginalMember(owner = "client!qb", name = "G", descriptor = "I")
    public static int field3223;

    @OriginalMember(owner = "client!qb", name = "I", descriptor = "I")
    public static int field3225;

    @OriginalMember(owner = "client!qb", name = "J", descriptor = "I")
    public static int field3226;

    @OriginalMember(owner = "client!qb", name = "L", descriptor = "I")
    private int field3228;

    @OriginalMember(owner = "client!qb", name = "z", descriptor = "Ljha;")
    public static class696 field3216;

    @OriginalMember(owner = "client!qb", name = "t", descriptor = "[B")
    private byte[] field3210;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(BIB)V")
    public void method1443(byte arg0, int arg1, byte arg2) {
        field3209++;
        if (arg2 != -111) {
            method1448(69);
        }
        this.field3210[arg1] = arg0;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1444(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3208++;
        int var8 = 0;
        int var9 = arg7;
        int var10 = 0;
        int var11 = arg3 - arg4;
        int var12 = arg7 - arg4;
        int var13 = arg3 * arg3;
        int var14 = arg7 * arg7;
        if (arg6 != -5411) {
            method1447((byte) -9, -123L);
        }
        int var15 = var11 * var11;
        int var16 = var12 * var12;
        int var17 = var14 << 1;
        int var18 = var13 << 1;
        int var19 = var16 << 1;
        int var20 = var15 << 1;
        int var21 = arg7 << 1;
        int var22 = var12 << 1;
        int var23 = (1 - var21) * var13 + var17;
        int var24 = var14 - ((var21 - 1) * var18);
        int var25 = (1 - var22) * var15 + var19;
        int var26 = var16 - ((var22 - 1) * var20);
        int var27 = var13 << 2;
        int var28 = var14 << 2;
        int var29 = var15 << 2;
        int var30 = var16 << 2;
        int var31 = var17 * 3;
        int var32 = (var21 - 3) * var18;
        int var33 = var19 * 3;
        int var34 = (var22 - 3) * var20;
        int var35 = var28;
        int var36 = (arg7 - 1) * var27;
        int var37 = var30;
        if (arg1 >= class380.field5289 && arg1 <= class431.field5944) {
            int[] var38 = class690.field9616[arg1];
            int var39 = class10.method99(class209.field3090, arg6 + 5467, class261.field3632, arg5 - arg3);
            int var40 = class10.method99(class209.field3090, 108, class261.field3632, arg5 + arg3);
            int var41 = class10.method99(class209.field3090, arg6 + 5438, class261.field3632, arg5 - var11);
            int var42 = class10.method99(class209.field3090, 54, class261.field3632, arg5 + var11);
            class717.method4012(arg2, arg6 ^ 0x1569, var39, var38, var41);
            class717.method4012(arg0, arg6 ^ 0x156F, var41, var38, var42);
            class717.method4012(arg2, -69, var42, var38, var40);
        }
        int var43 = (var12 - 1) * var29;
        while (var9 > 0) {
            boolean var44 = var9 <= var12;
            if (var44) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var25 += var33;
                        var26 += var37;
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
                var26 += -var34;
                var25 += -var43;
                var34 -= var29;
                var43 -= var29;
            }
            if (var23 < 0) {
                while (var23 < 0) {
                    var24 += var35;
                    var23 += var31;
                    var31 += var28;
                    var35 += var28;
                    var8++;
                }
            }
            if (var24 < 0) {
                var24 += var35;
                var23 += var31;
                var35 += var28;
                var8++;
                var31 += var28;
            }
            var23 += -var36;
            var24 += -var32;
            var32 -= var27;
            var9--;
            var36 -= var27;
            int var45 = arg1 - var9;
            int var46 = arg1 + var9;
            if (class380.field5289 <= var46 && class431.field5944 >= var45) {
                int var47 = class10.method99(class209.field3090, 61, class261.field3632, arg5 + var8);
                int var48 = class10.method99(class209.field3090, 57, class261.field3632, arg5 - var8);
                if (var44) {
                    int var49 = class10.method99(class209.field3090, 41, class261.field3632, arg5 + var10);
                    int var50 = class10.method99(class209.field3090, arg6 + 5429, class261.field3632, arg5 - var10);
                    if (class380.field5289 <= var45) {
                        int[] var51 = class690.field9616[var45];
                        class717.method4012(arg2, -96, var48, var51, var50);
                        class717.method4012(arg0, arg6 ^ 0x154A, var50, var51, var49);
                        class717.method4012(arg2, -96, var49, var51, var47);
                    }
                    if (var46 <= class431.field5944) {
                        int[] var52 = class690.field9616[var46];
                        class717.method4012(arg2, -109, var48, var52, var50);
                        class717.method4012(arg0, -60, var50, var52, var49);
                        class717.method4012(arg2, -66, var49, var52, var47);
                    }
                } else {
                    if (class380.field5289 <= var45) {
                        class717.method4012(arg2, -93, var48, class690.field9616[var45], var47);
                    }
                    if (class431.field5944 >= var46) {
                        class717.method4012(arg2, arg6 ^ 0x1577, var48, class690.field9616[var46], var47);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "(I)V")
    public final void method266(int arg0) {
        this.field3228 >>= 0x4;
        if (arg0 != 28926) {
            this.field3227 = -1;
        }
        this.field3215 = this.field3227;
        field3225++;
        if (this.field3228 < 0) {
            this.field3228 = 0;
        } else if (this.field3228 > 255) {
            this.field3228 = 255;
        }
        this.method1443((byte) this.field3228, this.field3217++, (byte) -111);
        this.field3228 = 0;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IBIZ)I")
    public static final int method1445(int arg0, byte arg1, int arg2, boolean arg3) {
        field3218++;
        class287 var4 = class271.method1629(arg3, arg0, (byte) -60);
        if (var4 == null) {
            return -1;
        } else {
            if (arg1 > -53) {
                method1444(117, 95, 7, 93, -39, 35, 118, 48);
            }
            return arg2 >= 0 && arg2 < var4.field4061.length ? var4.field4061[arg2] : -1;
        }
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(I)V")
    public final void method267(int arg0) {
        this.field3228 = 0;
        int var2 = -29 % ((arg0 - 22) / 45);
        field3214++;
        this.field3217 = 0;
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(B)V")
    public static final void method1446(byte arg0) {
        field3223++;
        if (class472.field6456 == null) {
            class472.field6456 = class21.method228(93);
            class258.field3537 = class472.field6456[0];
            class287.field4059 = class375.method2193(116);
        }
        if (class549.field7251 == null) {
            class717.method4014(1);
        }
        int var1 = -101 / ((-arg0 - 39) / 39);
        class21 var2 = class258.field3537;
        int var3 = class741.method4130(27933);
        if (class258.field3537 == var2) {
            class283.field4003 = class258.field3537.field357.method2877(class713.field9854, (byte) -108);
            if (class258.field3537.field367) {
                class317.field4528 = (class258.field3537.field364 - class258.field3537.field365) * var3 / 100 + class258.field3537.field365;
            }
            if (class258.field3537.field361) {
                class283.field4003 = class283.field4003 + class317.field4528 + "%";
            }
        } else if (class258.field3537 == class21.field388) {
            class549.field7251 = null;
            class66.method566(3, -21035);
        } else {
            class283.field4003 = var2.field369.method2877(class713.field9854, (byte) -108);
            class317.field4528 = var2.field364;
            if (class258.field3537.field361) {
                class283.field4003 = class283.field4003 + var2.field364 + "%";
            }
            if (class258.field3537.field367 || var2.field367) {
                class287.field4059 = class375.method2193(116);
            }
        }
        if (class549.field7251 == null) {
            return;
        }
        class549.field7251.method1280(class283.field4003, class317.field4528, class258.field3537, class287.field4059, -1484216776);
        if (class381.field5297 == null) {
            return;
        }
        for (int var4 = class422.field5818 + 1; var4 < class381.field5297.length; var4++) {
            if (class381.field5297[var4].method1374(26583) >= 100 && var4 - 1 == class422.field5818 && class15.field215 >= 1 && class549.field7251.method1279((byte) 102)) {
                try {
                    class381.field5297[var4].method1373((byte) -2);
                } catch (Exception var5) {
                    class381.field5297 = null;
                    return;
                }
                class549.field7251.method1274(class381.field5297[var4], true);
                class422.field5818++;
                if (class422.field5818 >= class381.field5297.length - 1 && class381.field5297.length > 1) {
                    class422.field5818 = class258.field3599.method1474((byte) 81) ? 0 : -1;
                }
            }
        }
        return;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(BJ)V")
    public static final void method1447(byte arg0, long arg1) {
        if (arg0 != -124) {
            field3216 = null;
        }
        field3221++;
        if (arg1 <= 0L) {
            return;
        }
        if ((arg1 % 10L) == 0L) {
            class293.method1816((byte) 85, arg1 - 1L);
            class293.method1816((byte) 112, 1L);
        } else {
            class293.method1816((byte) 92, arg1);
        }
    }

    @OriginalMember(owner = "client!qb", name = "e", descriptor = "(I)V")
    public static void method1448(int arg0) {
        if (arg0 != 27966) {
            field3216 = null;
        }
        field3211 = null;
        field3216 = null;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(III)V")
    public final void method268(int arg0, int arg1, int arg2) {
        if (arg2 == 0) {
            this.field3213 = this.field3224 - (arg1 < 0 ? -arg1 : arg1);
            this.field3213 = this.field3213 * this.field3213 >> 12;
            this.field3212 = 4096;
            this.field3228 = this.field3213;
        } else {
            this.field3212 = this.field3222 * this.field3213 >> 12;
            if (this.field3212 < 0) {
                this.field3212 = 0;
            } else if (this.field3212 > 4096) {
                this.field3212 = 4096;
            }
            this.field3213 = this.field3224 - (arg1 < 0 ? -arg1 : arg1);
            this.field3213 = this.field3213 * this.field3213 >> 12;
            this.field3213 = this.field3213 * this.field3212 >> 12;
            this.field3228 += this.field3215 * this.field3213 >> 12;
            this.field3215 = this.field3227 * this.field3215 >> 12;
        }
        field3219++;
        if (arg0 != -256) {
            method1447((byte) -119, 87L);
        }
    }

    @OriginalMember(owner = "client!qb", name = "<init>", descriptor = "(IIIIIFFF)V")
    public class226(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5, float arg6, float arg7) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field3224 = (int) (arg6 * 4096.0F);
        this.field3222 = (int) (arg7 * 4096.0F);
        this.field3215 = this.field3227 = (int) (Math.pow(0.5D, (double) (-arg5)) * 4096.0D);
    }
}
