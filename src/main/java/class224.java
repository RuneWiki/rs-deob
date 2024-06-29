import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class224 extends class285 {

    @OriginalMember(owner = "client!ja", name = "P", descriptor = "I")
    private int field3568 = 0;

    @OriginalMember(owner = "client!ja", name = "cb", descriptor = "I")
    private int field3581 = 0;

    @OriginalMember(owner = "client!ja", name = "S", descriptor = "I")
    private int field3571 = 0;

    @OriginalMember(owner = "client!ja", name = "O", descriptor = "I")
    private int field3567;

    @OriginalMember(owner = "client!ja", name = "Q", descriptor = "I")
    private int field3569;

    @OriginalMember(owner = "client!ja", name = "R", descriptor = "I")
    public static int field3570;

    @OriginalMember(owner = "client!ja", name = "T", descriptor = "I")
    private int field3572;

    @OriginalMember(owner = "client!ja", name = "U", descriptor = "I")
    public static int field3573;

    @OriginalMember(owner = "client!ja", name = "V", descriptor = "I")
    private int field3574;

    @OriginalMember(owner = "client!ja", name = "W", descriptor = "I")
    public static int field3575;

    @OriginalMember(owner = "client!ja", name = "X", descriptor = "I")
    public static int field3576;

    @OriginalMember(owner = "client!ja", name = "Y", descriptor = "I")
    public static int field3577;

    @OriginalMember(owner = "client!ja", name = "Z", descriptor = "I")
    public static int field3578;

    @OriginalMember(owner = "client!ja", name = "ab", descriptor = "I")
    public static int field3579;

    @OriginalMember(owner = "client!ja", name = "bb", descriptor = "I")
    public static int field3580;

    @OriginalMember(owner = "client!ja", name = "db", descriptor = "I")
    public static int field3582;

    @OriginalMember(owner = "client!ja", name = "eb", descriptor = "I")
    private int field3583;

    @OriginalMember(owner = "client!ja", name = "fb", descriptor = "I")
    public static int field3584;

    @OriginalMember(owner = "client!ja", name = "hb", descriptor = "I")
    public static int field3586;

    @OriginalMember(owner = "client!ja", name = "ib", descriptor = "I")
    public static int field3587;

    @OriginalMember(owner = "client!ja", name = "jb", descriptor = "I")
    private int field3588;

    @OriginalMember(owner = "client!ja", name = "kb", descriptor = "I")
    public static int field3589;

    @OriginalMember(owner = "client!ja", name = "lb", descriptor = "I")
    public static int field3590;

    @OriginalMember(owner = "client!ja", name = "gb", descriptor = "[I")
    public static int[] field3585;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIIII)I", line = 6)
    public static final int method1587(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = arg2 & 0xF;
        if (arg1 != -12009) {
            method1587(-31, -53, -127, -42, 37);
        }
        int var6 = var5 >= 8 ? arg4 : arg0;
        field3589++;
        int var7 = var5 >= 4 ? (var5 == 12 || var5 == 14 ? arg0 : arg3) : arg4;
        return ((var5 & 0x1) == 0 ? var6 : -var6) + ((var5 & 0x2) == 0 ? var7 : -var7);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(ZLjj;I)V", line = 31)
    public final void method63(boolean arg0, class44 arg1, int arg2) {
        field3586++;
        if (arg2 == 0) {
            this.field3581 = arg1.method228(true);
        } else if (arg2 == 1) {
            this.field3571 = (arg1.method246((byte) -85) << 12) / 100;
        } else if (arg2 == 2) {
            this.field3568 = (arg1.method246((byte) -30) << 12) / 100;
        }
        if (!arg0) {
            method1594(false, -110, (class157) null, -84, -3);
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIII)V", line = 75)
    private final void method1588(int arg0, int arg1, int arg2, int arg3) {
        field3577++;
        if (arg0 != -321938644) {
            method1594(true, -110, (class157) null, -9, -51);
        }
        int var5 = arg2 > 2048 ? arg1 + arg2 - (arg1 * arg2 >> 12) : (arg1 + 4096) * arg2 >> 12;
        if (var5 <= 0) {
            this.field3588 = this.field3572 = this.field3574 = arg2;
            return;
        }
        int var6 = arg3 * 6;
        int var7 = arg2 + arg2 - var5;
        int var8 = (var5 - var7 << 12) / var5;
        int var9 = var6 >> 12;
        int var10 = var6 - (var9 << 12);
        int var12 = var8 * var5 >> 12;
        int var13 = var10 * var12 >> 12;
        int var14 = var7 + var13;
        int var15 = var5 - var13;
        if (var9 == 0) {
            this.field3588 = var5;
            this.field3572 = var14;
            this.field3574 = var7;
        } else if (var9 == 1) {
            this.field3572 = var5;
            this.field3588 = var15;
            this.field3574 = var7;
        } else if (var9 == 2) {
            this.field3572 = var5;
            this.field3574 = var14;
            this.field3588 = var7;
        } else if (var9 == 3) {
            this.field3572 = var15;
            this.field3574 = var5;
            this.field3588 = var7;
        } else if (var9 == 4) {
            this.field3574 = var5;
            this.field3572 = var7;
            this.field3588 = var14;
        } else if (var9 == 5) {
            this.field3588 = var5;
            this.field3572 = var7;
            this.field3574 = var15;
        }
    }

    @OriginalMember(owner = "client!ja", name = "<init>", descriptor = "()V", line = 187)
    public class224() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ja", name = "j", descriptor = "(I)V", line = 191)
    public static void method1589(int arg0) {
        field3585 = null;
        if (arg0 != 255) {
            method1594(true, 68, (class157) null, 85, 26);
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Ljj;Z)V", line = 204)
    public static final void method1590(class44 arg0, boolean arg1) {
        field3579++;
        int var2 = class119.field1813 >> 1;
        int var3 = class277.field4469 >> 2 << 10;
        byte[][] var4 = new byte[class111.field1650][class74.field1048];
        while (arg0.field586 < arg0.field573.length) {
            boolean var5 = false;
            int var6 = 0;
            int var7 = 0;
            if (arg0.method286((byte) -85) == 1) {
                var5 = true;
                var7 = arg0.method286((byte) -74);
                var6 = arg0.method286((byte) -105);
            }
            int var8 = arg0.method286((byte) -115);
            int var9 = arg0.method286((byte) -128);
            int var10 = class74.field1048 + class93.field1276 - (var9 * 64) - 1;
            int var11 = var8 * 64 - class27.field377;
            if (var11 >= 0 && var10 - 63 >= 0 && class111.field1650 > (var11 + 63) && class74.field1048 > var10) {
                for (int var12 = 0; var12 < 64; var12++) {
                    byte[] var13 = var4[var11 + var12];
                    for (int var14 = 0; var14 < 64; var14++) {
                        if (!var5 || var12 >= (var7 * 8) && var12 < var7 * 8 + 8 && (var6 * 8) <= var14 && var14 < var6 * 8 + 8) {
                            var13[var10 - var14] = arg0.method246((byte) -51);
                        }
                    }
                }
            } else if (var5) {
                arg0.field586 += 64;
            } else {
                arg0.field586 += 4096;
            }
        }
        int var15 = class111.field1650;
        int var16 = class74.field1048;
        int[] var17 = new int[var16];
        int[] var18 = new int[var16];
        int[] var19 = new int[var16];
        int[] var20 = new int[var16];
        int[] var21 = new int[var16];
        if (arg1) {
            method1589(-125);
        }
        for (int var22 = -5; var22 < var15; var22++) {
            for (int var23 = 0; var23 < var16; var23++) {
                int var24 = var22 + 5;
                int var10002;
                if (var15 > var24) {
                    int var25 = var4[var24][var23] & 0xFF;
                    if (var25 > 0) {
                        class229 var26 = class91.method616(var25 - 1, -109);
                        var17[var23] += var26.field3640;
                        var19[var23] += var26.field3646;
                        var18[var23] += var26.field3655;
                        var20[var23] += var26.field3643;
                        var10002 = var21[var23]++;
                    }
                }
                int var27 = var22 - 5;
                if (var27 >= 0) {
                    int var28 = var4[var27][var23] & 0xFF;
                    if (var28 > 0) {
                        class229 var29 = class91.method616(var28 - 1, -80);
                        var17[var23] -= var29.field3640;
                        var19[var23] -= var29.field3646;
                        var18[var23] -= var29.field3655;
                        var20[var23] -= var29.field3643;
                        var10002 = var21[var23]--;
                    }
                }
            }
            if (var22 >= 0) {
                int[][] var30 = class29.field398[var22 >> 6];
                int var31 = 0;
                int var32 = 0;
                int var33 = 0;
                int var34 = 0;
                int var35 = 0;
                for (int var36 = -5; var36 < var16; var36++) {
                    int var37 = var36 - 5;
                    int var38 = var36 + 5;
                    if (var38 < var16) {
                        var32 += var17[var38];
                        var35 += var21[var38];
                        var31 += var19[var38];
                        var34 += var20[var38];
                        var33 += var18[var38];
                    }
                    if (var37 >= 0) {
                        var34 -= var20[var37];
                        var31 -= var19[var37];
                        var32 -= var17[var37];
                        var33 -= var18[var37];
                        var35 -= var21[var37];
                    }
                    if (var36 >= 0 && var35 > 0) {
                        int[] var39 = var30[var36 >> 6];
                        int var40 = var34 == 0 ? 0 : class261.method1862(var33 / var35, var31 / var35, var32 * 256 / var34, (byte) -121);
                        if (var4[var22][var36] != 0) {
                            if (var39 == null) {
                                var39 = var30[var36 >> 6] = new int[4096];
                            }
                            int var41 = (var40 & 0x7F) + var2;
                            if (var41 < 0) {
                                var41 = 0;
                            } else if (var41 > 127) {
                                var41 = 127;
                            }
                            int var42 = (var3 + var40 & 0xFC00) + (var40 & 0x380) + var41;
                            var39[client.method767(63, var22) + client.method767(4032, var36 << 6)] = class170.field2812[class21.method114(var42, (byte) -114, 96)];
                        } else if (var39 != null) {
                            var39[client.method767(63, var22) + client.method767(4032, var36 << 6)] = 0;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(III)Lgg;", line = 436)
    public static final class38 method1591(int arg0, int arg1, int arg2) {
        class204 var3 = class324.field5032[arg0][arg1][arg2];
        return var3 == null ? null : var3.field3342;
    }

    @OriginalMember(owner = "client!ja", name = "d", descriptor = "(B)V", line = 444)
    public static final void method1592(byte arg0) {
        field3587++;
        if (arg0 > -98) {
            field3582 = -8;
        }
        class211.field3459.method857(25544);
        class325.field5040 = null;
        class286.field4586 = 1;
    }

    @OriginalMember(owner = "client!ja", name = "k", descriptor = "(I)V", line = 459)
    public static final void method1593(int arg0) {
        field3584++;
        try {
            Method var1 = Runtime.class.getMethod("maxMemory");
            if (var1 != null) {
                try {
                    Runtime var2 = Runtime.getRuntime();
                    Long var3 = (Long) var1.invoke(var2, (Object[]) null);
                    class36.field480 = (int) (var3 / 1048576L) + 1;
                } catch (Throwable var6) {
                }
            }
            if (arg0 >= -69) {
                method1591(121, -44, -96);
            }
        } catch (Exception var7) {
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(ZILog;II)V", line = 487)
    public static final void method1594(boolean arg0, int arg1, class157 arg2, int arg3, int arg4) {
        int var5 = arg2.field2468;
        field3576++;
        int var6 = arg2.field2520;
        if (arg2.field2438 == 0) {
            arg2.field2520 = arg2.field2424;
        } else if (arg2.field2438 == 1) {
            arg2.field2520 = arg1 - arg2.field2424;
        } else if (arg2.field2438 == 2) {
            arg2.field2520 = arg2.field2424 * arg1 >> 14;
        } else if (arg2.field2438 == 3) {
            if (arg2.field2478 == 2) {
                arg2.field2520 = arg2.field2424 * 32 + ((arg2.field2424 - 1) * arg2.field2454);
            } else if (arg2.field2478 == 7) {
                arg2.field2520 = (arg2.field2424 - 1) * arg2.field2454 + arg2.field2424 * 12;
            }
        }
        if (arg2.field2543 == arg4) {
            arg2.field2468 = arg2.field2428;
        } else if (arg2.field2543 == 1) {
            arg2.field2468 = arg3 - arg2.field2428;
        } else if (arg2.field2543 == 2) {
            arg2.field2468 = arg2.field2428 * arg3 >> 14;
        } else if (arg2.field2543 == 3) {
            if (arg2.field2478 == 2) {
                arg2.field2468 = arg2.field2428 * 32 + ((arg2.field2428 - 1) * arg2.field2590);
            } else if (arg2.field2478 == 7) {
                arg2.field2468 = arg2.field2428 * 115 + ((arg2.field2428 - 1) * arg2.field2590);
            }
        }
        if (arg2.field2543 == 4) {
            arg2.field2468 = arg2.field2569 * arg2.field2520 / arg2.field2541;
        }
        if (arg2.field2438 == 4) {
            arg2.field2520 = arg2.field2541 * arg2.field2468 / arg2.field2569;
        }
        if (class301.field4727 && (client.method766(arg2).field4503 != 0 || arg2.field2478 == 0)) {
            if (arg2.field2520 < 5 && arg2.field2468 < 5) {
                arg2.field2520 = 5;
                arg2.field2468 = 5;
            } else {
                if (arg2.field2468 <= 0) {
                    arg2.field2468 = 5;
                }
                if (arg2.field2520 <= 0) {
                    arg2.field2520 = 5;
                }
            }
        }
        if (arg2.field2467 == 1337) {
            class89.field1234 = arg2;
        }
        if (arg0 && arg2.field2522 != null && (arg2.field2468 != var5 || arg2.field2520 != var6)) {
            class39 var7 = new class39();
            var7.field501 = arg2.field2522;
            var7.field500 = arg2;
            class126.field1957.method1232(119, var7);
        }
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(IIII)V", line = 589)
    private final void method1595(int arg0, int arg1, int arg2, int arg3) {
        int var5 = arg0 > arg3 ? arg0 : arg3;
        field3573++;
        int var6 = var5 < arg1 ? arg1 : var5;
        int var7 = arg0 >= arg3 ? arg3 : arg0;
        int var8 = arg1 >= var7 ? var7 : arg1;
        if (arg2 < 75) {
            return;
        }
        this.field3583 = (var6 + var8) / 2;
        int var9 = var6 - var8;
        if (this.field3583 > 0 && this.field3583 < 4096) {
            this.field3567 = (var9 << 12) / (this.field3583 > 2048 ? 8192 - (this.field3583 * 2) : this.field3583 * 2);
        } else {
            this.field3567 = 0;
        }
        if (var9 <= 0) {
            this.field3569 = 0;
            return;
        }
        int var10 = (var6 - arg0 << 12) / var9;
        int var11 = (var6 - arg3 << 12) / var9;
        int var12 = (var6 - arg1 << 12) / var9;
        if (arg0 == var6) {
            this.field3569 = arg3 == var8 ? var12 + 20480 : -var11 + 4096;
        } else if (arg3 == var6) {
            this.field3569 = arg1 == var8 ? var10 + 4096 : -var12 + 12288;
        } else {
            this.field3569 = arg0 == var8 ? var11 + 12288 : -var10 + 20480;
        }
        this.field3569 /= 6;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(BI)[[I", line = 652)
    public final int[][] method62(byte arg0, int arg1) {
        field3580++;
        if (arg0 < 121) {
            field3582 = 10;
        }
        int[][] var3 = this.field4564.method1552(arg1, (byte) -69);
        if (this.field4564.field3529) {
            int[][] var4 = this.method2053((byte) 118, 0, arg1);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[2];
            int[] var10 = var3[1];
            for (int var11 = 0; var11 < class287.field4599; var11++) {
                this.method1595(var5[var11], var7[var11], 86, var6[var11]);
                this.field3569 += this.field3581;
                this.field3583 += this.field3568;
                this.field3567 += this.field3571;
                while (this.field3569 < 0) {
                    this.field3569 += 4096;
                }
                while (this.field3569 > 4096) {
                    this.field3569 -= 4096;
                }
                if (this.field3567 < 0) {
                    this.field3567 = 0;
                }
                if (this.field3567 > 4096) {
                    this.field3567 = 4096;
                }
                if (this.field3583 < 0) {
                    this.field3583 = 0;
                }
                if (this.field3583 > 4096) {
                    this.field3583 = 4096;
                }
                this.method1588(-321938644, this.field3567, this.field3583, this.field3569);
                var8[var11] = this.field3588;
                var10[var11] = this.field3572;
                var9[var11] = this.field3574;
            }
        }
        return var3;
    }
}
