import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class34 extends class177 {

    @OriginalMember(owner = "client!kb", name = "N", descriptor = "I")
    private int field427 = 4;

    @OriginalMember(owner = "client!kb", name = "M", descriptor = "I")
    private int field426 = 4;

    @OriginalMember(owner = "client!kb", name = "E", descriptor = "I")
    public static int field418 = 0;

    @OriginalMember(owner = "client!kb", name = "K", descriptor = "Z")
    public static boolean field424 = false;

    @OriginalMember(owner = "client!kb", name = "Q", descriptor = "[Ljava/lang/String;")
    public static String[] field430 = new String[200];

    @OriginalMember(owner = "client!kb", name = "R", descriptor = "Lta;")
    public static class197 field431 = new class197(64);

    @OriginalMember(owner = "client!kb", name = "S", descriptor = "I")
    public static int field432 = 0;

    @OriginalMember(owner = "client!kb", name = "D", descriptor = "I")
    public static int field417;

    @OriginalMember(owner = "client!kb", name = "F", descriptor = "I")
    public static int field419;

    @OriginalMember(owner = "client!kb", name = "G", descriptor = "I")
    public static int field420;

    @OriginalMember(owner = "client!kb", name = "H", descriptor = "I")
    public static int field421;

    @OriginalMember(owner = "client!kb", name = "I", descriptor = "I")
    public static int field422;

    @OriginalMember(owner = "client!kb", name = "J", descriptor = "I")
    public static int field423;

    @OriginalMember(owner = "client!kb", name = "L", descriptor = "I")
    public static int field425;

    @OriginalMember(owner = "client!kb", name = "O", descriptor = "I")
    public static int field428;

    @OriginalMember(owner = "client!kb", name = "P", descriptor = "I")
    public static int field429;

    @OriginalMember(owner = "client!kb", name = "<init>", descriptor = "()V", line = 4)
    public class34() {
        super(1, false);
    }

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(Z)V", line = 8)
    public static void method232(boolean arg0) {
        if (arg0) {
            field430 = null;
            field431 = null;
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIIIIII)V", line = 20)
    public static final void method233(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = 0;
        field422++;
        class174.method1268(8, arg6);
        int var8 = arg6 - arg5;
        if (arg3 <= 70) {
            return;
        }
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg6;
        int var10 = var8;
        int var11 = -arg6;
        int var12 = -1;
        int var13 = -var8;
        int[] var14 = class320.field4990[arg2];
        int var15 = arg1 - var8;
        class138.method1047(arg4, var15, arg1 - arg6, 7, var14);
        int var16 = -1;
        int var17 = arg1 + var8;
        class138.method1047(arg0, var17, var15, 7, var14);
        class138.method1047(arg4, arg1 + arg6, var17, 7, var14);
        while (var7 < var9) {
            var16 += 2;
            var12 += 2;
            var11 += var12;
            var13 += var16;
            if (var13 >= 0 && var10 >= 1) {
                class81.field1131[var10] = var7;
                var10--;
                var13 -= var10 << 1;
            }
            var7++;
            if (var11 >= 0) {
                var9--;
                if (var9 >= var8) {
                    int[] var18 = class320.field4990[arg2 + var9];
                    int var19 = arg1 + var7;
                    int[] var20 = class320.field4990[arg2 - var9];
                    int var21 = arg1 - var7;
                    class138.method1047(arg4, var19, var21, 7, var18);
                    class138.method1047(arg4, var19, var21, 7, var20);
                } else {
                    int[] var22 = class320.field4990[arg2 + var9];
                    int var23 = class81.field1131[var9];
                    int var24 = arg1 + var23;
                    int[] var25 = class320.field4990[arg2 - var9];
                    int var26 = arg1 - var7;
                    int var27 = arg1 + var7;
                    int var28 = arg1 - var23;
                    class138.method1047(arg4, var28, var26, 7, var22);
                    class138.method1047(arg0, var24, var28, 7, var22);
                    class138.method1047(arg4, var27, var24, 7, var22);
                    class138.method1047(arg4, var28, var26, 7, var25);
                    class138.method1047(arg0, var24, var28, 7, var25);
                    class138.method1047(arg4, var27, var24, 7, var25);
                }
                var11 -= var9 << 1;
            }
            int[] var29 = class320.field4990[arg2 + var7];
            int var30 = arg1 + var9;
            int[] var31 = class320.field4990[arg2 - var7];
            int var32 = arg1 - var9;
            if (var7 >= var8) {
                class138.method1047(arg4, var30, var32, 7, var29);
                class138.method1047(arg4, var30, var32, 7, var31);
            } else {
                int var33 = var7 > var10 ? class81.field1131[var7] : var10;
                int var34 = arg1 + var33;
                int var35 = arg1 - var33;
                class138.method1047(arg4, var35, var32, 7, var29);
                class138.method1047(arg0, var34, var35, 7, var29);
                class138.method1047(arg4, var30, var34, 7, var29);
                class138.method1047(arg4, var35, var32, 7, var31);
                class138.method1047(arg0, var34, var35, 7, var31);
                class138.method1047(arg4, var30, var34, 7, var31);
            }
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(JI)V", line = 149)
    public static final void method234(long arg0, int arg1) {
        class159.field2372.field455 = 0;
        class159.field2372.method262((byte) 81, arg1);
        class159.field2372.method261(1523335144, arg0);
        class4.field26 = 0;
        field423++;
        class324.field5044 = 0;
        class204.field3240 = 1;
        class179.field2685 = -3;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lhb;II)V", line = 165)
    public final void method97(class35 arg0, int arg1, int arg2) {
        field421++;
        if (arg2 == 0) {
            this.field427 = arg0.method273(65280);
        } else if (arg2 == 1) {
            this.field426 = arg0.method273(65280);
        }
        if (arg1 != -18061) {
            field431 = (class197) null;
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(II)[I", line = 201)
    public final int[] method95(int arg0, int arg1) {
        field425++;
        int[] var3 = this.field2652.method1481(arg1, (byte) -92);
        if (arg0 >= -52) {
            method233(118, -21, 75, 62, 48, 97, 80);
        }
        if (this.field2652.field3287) {
            int var4 = class287.field4415 / this.field427;
            int var5 = class282.field4361 / this.field426;
            int[] var6;
            if (var5 <= 0) {
                var6 = this.method1280(0, 0, false);
            } else {
                int var7 = arg1 % var5;
                var6 = this.method1280(class282.field4361 * var7 / var5, 0, false);
            }
            for (int var8 = 0; var8 < class287.field4415; var8++) {
                if (var4 > 0) {
                    int var9 = var8 % var4;
                    var3[var8] = var6[class287.field4415 * var9 / var4];
                } else {
                    var3[var8] = var6[0];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(II)[[I", line = 255)
    public final int[][] method99(int arg0, int arg1) {
        field417++;
        if (arg1 != -23387) {
            return (int[][]) ((int[][]) null);
        }
        int[][] var3 = this.field2645.method1456(arg0, (byte) -113);
        if (this.field2645.field3203) {
            int var4 = class287.field4415 / this.field427;
            int var5 = class282.field4361 / this.field426;
            int[][] var7;
            if (var5 > 0) {
                int var6 = arg0 % var5;
                var7 = this.method1285(0, class282.field4361 * var6 / var5, arg1 + 51234);
            } else {
                var7 = this.method1285(0, 0, 27847);
            }
            int[] var8 = var7[1];
            int[] var9 = var7[2];
            int[] var10 = var7[0];
            int[] var11 = var3[1];
            int[] var12 = var3[0];
            int[] var13 = var3[2];
            for (int var14 = 0; var14 < class287.field4415; var14++) {
                int var16;
                if (var4 > 0) {
                    int var15 = var14 % var4;
                    var16 = class287.field4415 * var15 / var4;
                } else {
                    var16 = 0;
                }
                var12[var14] = var10[var16];
                var11[var14] = var8[var16];
                var13[var14] = var9[var16];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IJ)V", line = 324)
    public static final void method235(int arg0, long arg1) {
        field419++;
        if (arg1 == 0L) {
            return;
        }
        for (int var3 = 0; var3 < class291.field4577; var3++) {
            if (class302.field4742[var3] == arg1) {
                class291.field4577--;
                class181.field2718++;
                for (int var4 = var3; var4 < class291.field4577; var4++) {
                    class302.field4742[var4] = class302.field4742[var4 + 1];
                    class190.field3041[var4] = class190.field3041[var4 + 1];
                }
                class271.field4090 = class319.field4980;
                class159.field2372.method59(100, (byte) 73);
                class159.field2372.method261(arg0 + 1523335143, arg1);
                break;
            }
        }
        if (arg0 != 1) {
            field418 = -26;
        }
    }

    @OriginalMember(owner = "client!kb", name = "d", descriptor = "(I)V", line = 367)
    public static final void method236(int arg0) {
        field428++;
        if (arg0 <= 123) {
            method234(-114L, 83);
        }
        class193.field3086.method1433(30);
        class81.field1127.method1433(30);
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(ILoa;)V", line = 386)
    public static final void method237(int arg0, class288 arg1) {
        field429++;
        if (arg1.field4443 == 0) {
            return;
        }
        class132 var2 = arg1.method2030(-13196);
        if (arg1.field4494 != -1 && arg1.field4494 < 32768) {
            class45 var3 = class161.field2394[arg1.field4494];
            if (var3 != null) {
                int var4 = arg1.field4507 - var3.field4507;
                int var5 = arg1.field4496 - var3.field4496;
                if (var4 != 0 || var5 != 0) {
                    arg1.field4497 = (int) (Math.atan2((double) var4, (double) var5) * 325.949D) & 0x7FF;
                }
            }
        }
        if (arg1.field4494 >= 32768) {
            int var6 = arg1.field4494 - 32768;
            if (class196.field3111 == var6) {
                var6 = 2047;
            }
            class121 var7 = class319.field4964[var6];
            if (var7 != null) {
                int var8 = arg1.field4507 - var7.field4507;
                int var9 = arg1.field4496 - var7.field4496;
                if (var8 != 0 || var9 != 0) {
                    arg1.field4497 = (int) (Math.atan2((double) var8, (double) var9) * 325.949D) & 0x7FF;
                }
            }
        }
        if (arg0 > -108) {
            field430 = (String[]) null;
        }
        if ((arg1.field4456 != 0 || arg1.field4450 != 0) && (arg1.field4453 == 0 || arg1.field4495 > 0)) {
            int var10 = arg1.field4507 - ((arg1.field4456 - class302.field4735 - class302.field4735) * 64);
            int var11 = arg1.field4496 - ((arg1.field4450 - class110.field1744 - class110.field1744) * 64);
            if (var10 != 0 || var11 != 0) {
                arg1.field4497 = (int) (Math.atan2((double) var10, (double) var11) * 325.949D) & 0x7FF;
            }
            arg1.field4456 = 0;
            arg1.field4450 = 0;
        }
        int var12 = arg1.field4497 - arg1.field4438 & 0x7FF;
        if (var12 == 0) {
            arg1.field4472 = 0;
            arg1.field4490 = 0;
        } else if (var2.field2054 == 0) {
            arg1.field4490++;
            if (var12 > 1024) {
                arg1.field4438 -= arg1.field4443;
                boolean var13 = true;
                if (var12 < arg1.field4443 || var12 > 2048 - arg1.field4443) {
                    arg1.field4438 = arg1.field4497;
                    var13 = false;
                }
                if (arg1.field4527 == var2.field2084 && (arg1.field4490 > 25 || var13)) {
                    if (var2.field2056 == -1) {
                        arg1.field4527 = var2.field2055;
                    } else {
                        arg1.field4527 = var2.field2056;
                    }
                }
            } else {
                arg1.field4438 += arg1.field4443;
                boolean var14 = true;
                if (arg1.field4443 > var12 || var12 > (2048 - arg1.field4443)) {
                    arg1.field4438 = arg1.field4497;
                    var14 = false;
                }
                if (arg1.field4527 == var2.field2084 && (arg1.field4490 > 25 || var14)) {
                    if (var2.field2061 == -1) {
                        arg1.field4527 = var2.field2055;
                    } else {
                        arg1.field4527 = var2.field2061;
                    }
                }
            }
            arg1.field4438 &= 0x7FF;
        } else {
            if (arg1.field4527 == var2.field2084 && arg1.field4490 > 25) {
                if (var2.field2061 == -1) {
                    arg1.field4527 = var2.field2055;
                } else {
                    arg1.field4527 = var2.field2061;
                }
            }
            int var15 = arg1.field4497 << 5;
            if (arg1.field4448 != var15) {
                arg1.field4448 = var15;
                arg1.field4517 = 0;
                int var16 = var15 - arg1.field4464 & 0xFFFF;
                int var17 = arg1.field4472 * arg1.field4472 / (var2.field2054 * 2);
                if (arg1.field4472 > 0 && var17 <= var16 && var16 - var17 < 32768) {
                    arg1.field4535 = var16 / 2;
                    arg1.field4491 = true;
                    int var18 = var2.field2067 * var2.field2067 / (var2.field2054 * 2);
                    if (var18 > 32767) {
                        var18 = 32767;
                    }
                    if (var18 < arg1.field4535) {
                        arg1.field4535 = var16 - var18;
                    }
                } else if (arg1.field4472 < 0 && (65536 - var16) >= var17 && (65536 - var16 - var17) < 32768) {
                    int var19 = var2.field2067 * var2.field2067 / (var2.field2054 * 2);
                    if (var19 > 32767) {
                        var19 = 32767;
                    }
                    arg1.field4535 = (65536 - var16) / 2;
                    if (arg1.field4535 > var19) {
                        arg1.field4535 = 65536 - var16 - var19;
                    }
                    arg1.field4491 = true;
                } else {
                    arg1.field4491 = false;
                }
            }
            if (arg1.field4472 == 0) {
                int var20 = arg1.field4448 - arg1.field4464 & 0xFFFF;
                if (var2.field2054 <= var20) {
                    arg1.field4517 = 0;
                    int var21 = var2.field2067 * var2.field2067 / (var2.field2054 * 2);
                    arg1.field4491 = true;
                    if (var21 > 32767) {
                        var21 = 32767;
                    }
                    if (var20 >= 32768) {
                        arg1.field4472 = -var2.field2054;
                        arg1.field4535 = (65536 - var20) / 2;
                        if (var21 < arg1.field4535) {
                            arg1.field4535 = 65536 - var21 - var20;
                        }
                    } else {
                        arg1.field4535 = var20 / 2;
                        if (arg1.field4535 > var21) {
                            arg1.field4535 = var20 - var21;
                        }
                        arg1.field4472 = var2.field2054;
                    }
                } else {
                    arg1.field4464 = arg1.field4448;
                }
            } else if (arg1.field4472 <= 0) {
                if (arg1.field4517 >= arg1.field4535) {
                    arg1.field4491 = false;
                }
                if (!arg1.field4491) {
                    arg1.field4472 += var2.field2054;
                    if (arg1.field4472 > 0) {
                        arg1.field4472 = 0;
                    }
                } else if (-var2.field2067 < arg1.field4472) {
                    arg1.field4472 -= var2.field2054;
                }
            } else {
                if (arg1.field4517 >= arg1.field4535) {
                    arg1.field4491 = false;
                }
                if (!arg1.field4491) {
                    arg1.field4472 -= var2.field2054;
                    if (arg1.field4472 < 0) {
                        arg1.field4472 = 0;
                    }
                } else if (var2.field2067 > arg1.field4472) {
                    arg1.field4472 += var2.field2054;
                }
            }
            arg1.field4464 += arg1.field4472;
            if (arg1.field4472 <= 0) {
                arg1.field4517 -= arg1.field4472;
            } else {
                arg1.field4517 += arg1.field4472;
            }
            arg1.field4464 &= 0xFFFF;
            arg1.field4438 = arg1.field4464 >> 5;
        }
    }
}
