import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bm")
public class class97 extends class252 {

    @OriginalMember(owner = "client!bm", name = "u", descriptor = "Z")
    private boolean field1525 = false;

    @OriginalMember(owner = "client!bm", name = "o", descriptor = "Z")
    private boolean field1519;

    @OriginalMember(owner = "client!bm", name = "z", descriptor = "[Lgp;")
    private class45[] field1530;

    @OriginalMember(owner = "client!bm", name = "r", descriptor = "[I")
    public static int[] field1522 = new int[5];

    @OriginalMember(owner = "client!bm", name = "t", descriptor = "Lmf;")
    public static class382 field1524 = new class382(10);

    @OriginalMember(owner = "client!bm", name = "B", descriptor = "I")
    public static int field1532 = 0;

    @OriginalMember(owner = "client!bm", name = "w", descriptor = "Lnea;")
    public static class664 field1527 = new class664(59, 8);

    @OriginalMember(owner = "client!bm", name = "D", descriptor = "Lnea;")
    public static class664 field1534 = new class664(68, 2);

    @OriginalMember(owner = "client!bm", name = "p", descriptor = "I")
    public static int field1520;

    @OriginalMember(owner = "client!bm", name = "q", descriptor = "I")
    public static int field1521;

    @OriginalMember(owner = "client!bm", name = "s", descriptor = "I")
    public static int field1523;

    @OriginalMember(owner = "client!bm", name = "v", descriptor = "I")
    public static int field1526;

    @OriginalMember(owner = "client!bm", name = "x", descriptor = "I")
    public static int field1528;

    @OriginalMember(owner = "client!bm", name = "y", descriptor = "I")
    public static int field1529;

    @OriginalMember(owner = "client!bm", name = "A", descriptor = "I")
    public static int field1531;

    @OriginalMember(owner = "client!bm", name = "C", descriptor = "I")
    public static int field1533;

    @OriginalMember(owner = "client!bm", name = "<init>", descriptor = "(Lhea;)V", line = 4)
    public class97(class387 arg0) {
        super(arg0);
        if (arg0.field5701) {
            this.field1519 = arg0.field5709 < 3;
            int var2 = !this.field1519 ? 127 : 48;
            int[][] var3 = new int[6][4096];
            int[][] var4 = new int[6][4096];
            int[][] var5 = new int[6][4096];
            int var6 = 0;
            for (int var7 = 0; ~var7 > -65; ++var7) {
                for (int var8 = 0; ~var8 > -65; ++var8) {
                    float var9 = (float) var7 * 2.0F / 64.0F - 1.0F;
                    float var10 = (float) var8 * 2.0F / 64.0F - 1.0F;
                    float var11 = (float) (1.0D / Math.sqrt((double) (var9 * var9 + var10 * var10 + 1.0F)));
                    float var12 = var9 * var11;
                    float var13 = var10 * var11;
                    for (int var14 = 0; ~var14 > -7; ++var14) {
                        float var15;
                        if (~var14 == -1) {
                            var15 = -var13;
                        } else if (var14 != 1) {
                            if (var14 == 2) {
                                var15 = var12;
                            } else if (~var14 != -4) {
                                if (var14 == 4) {
                                    var15 = var11;
                                } else {
                                    var15 = -var11;
                                }
                            } else {
                                var15 = -var12;
                            }
                        } else {
                            var15 = var13;
                        }
                        int var16;
                        int var17;
                        int var18;
                        if (var15 > 0.0F) {
                            var16 = (int) ((double) var2 * Math.pow((double) var15, 96.0D));
                            var17 = (int) (Math.pow((double) var15, 36.0D) * (double) var2);
                            var18 = (int) ((double) var2 * Math.pow((double) var15, 12.0D));
                        } else {
                            var18 = 0;
                            var17 = 0;
                            var16 = 0;
                        }
                        var4[var14][var6] = var16 << 24;
                        var5[var14][var6] = var17 << 24;
                        var3[var14][var6] = var18 << 24;
                    }
                    ++var6;
                }
            }
            this.field1530 = new class45[3];
            this.field1530[0] = super.field3884.method1906(var4, false, 64, (byte) -20);
            this.field1530[1] = super.field3884.method1906(var5, false, 64, (byte) 109);
            this.field1530[2] = super.field3884.method1906(var3, false, 64, (byte) -99);
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(Z)V", line = 116)
    public final void method788(boolean arg0) {
        if (this.field1525) {
            super.field3884.method2351(0, 1);
            super.field3884.method2337(!arg0, (class301) null);
            super.field3884.method1886(1, class673.field9510);
            super.field3884.method2358(-1);
            if (this.field1519) {
                super.field3884.method2339(class153.field2209, -32540, class153.field2209);
                super.field3884.method2324(0, class61.field1155, 1);
                super.field3884.method2360(0, class61.field1155, 1);
            } else {
                super.field3884.method2339(class153.field2209, -32540, class153.field2209);
                super.field3884.method2324(0, class61.field1155, 1);
                super.field3884.method2351(0, 2);
                super.field3884.method2339(class153.field2209, -32540, class153.field2209);
                super.field3884.method2324(0, class61.field1155, 1);
                super.field3884.method2324(1, class319.field4696, 1);
                super.field3884.method2360(0, class61.field1155, 1);
                super.field3884.method2337(!arg0, (class301) null);
            }
            super.field3884.method2351(0, 0);
            this.field1525 = false;
        } else {
            super.field3884.method2360(0, class61.field1155, 1);
        }
        if (!arg0) {
            this.field1525 = true;
        }
        ++field1528;
        super.field3884.method2339(class153.field2209, -32540, class153.field2209);
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(IIIII)V", line = 157)
    public static final void method789(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field1531;
        int var5 = 0;
        int var6 = arg2;
        int var7 = -arg2;
        int var8 = arg4;
        int var9 = class537.method3051(-10168, arg3 - -arg2, class248.field3859, class15.field153);
        int var10 = class537.method3051(arg4 ^ 10167, arg3 - arg2, class248.field3859, class15.field153);
        class58.method623(arg1, var9, 23309, class651.field9125[arg0], var10);
        while (~var6 < ~var5) {
            var8 += 2;
            var7 += var8;
            if (~var7 < -1) {
                --var6;
                var7 -= var6 << 1;
                int var11 = -var6 + arg0;
                int var12 = arg0 - -var6;
                if (var12 >= class520.field7329 && ~var11 >= ~class239.field3747) {
                    int var13 = class537.method3051(-10168, arg3 - -var5, class248.field3859, class15.field153);
                    int var14 = class537.method3051(-10168, arg3 - var5, class248.field3859, class15.field153);
                    if (class239.field3747 >= var12) {
                        class58.method623(arg1, var13, 23309, class651.field9125[var12], var14);
                    }
                    if (class520.field7329 <= var11) {
                        class58.method623(arg1, var13, 23309, class651.field9125[var11], var14);
                    }
                }
            }
            ++var5;
            int var15 = -var5 + arg0;
            int var16 = arg0 - -var5;
            if (~class520.field7329 >= ~var16 && var15 <= class239.field3747) {
                int var17 = class537.method3051(arg4 ^ 10167, arg3 + var6, class248.field3859, class15.field153);
                int var18 = class537.method3051(-10168, -var6 + arg3, class248.field3859, class15.field153);
                if (~class239.field3747 <= ~var16) {
                    class58.method623(arg1, var17, 23309, class651.field9125[var16], var18);
                }
                if (class520.field7329 <= var15) {
                    class58.method623(arg1, var17, 23309, class651.field9125[var15], var18);
                }
            }
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(Lbb;II)V", line = 231)
    public final void method790(class301 arg0, int arg1, int arg2) {
        super.field3884.method2337(false, arg0);
        ++field1533;
        super.field3884.method2308(arg2, arg1);
    }

    @OriginalMember(owner = "client!bm", name = "b", descriptor = "(ZI)V", line = 240)
    public final void method791(boolean arg0, int arg1) {
        if (arg1 == 1) {
            super.field3884.method2339(class153.field2209, arg1 ^ -32539, class190.field2740);
            ++field1523;
        }
    }

    @OriginalMember(owner = "client!bm", name = "e", descriptor = "(I)Z", line = 255)
    public final boolean method792(int arg0) {
        ++field1529;
        return arg0 == 6439;
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(FZFF)F", line = 267)
    public static final float method793(float arg0, boolean arg1, float arg2, float arg3) {
        if (arg1) {
            method793(-0.3529916F, false, -1.1767439F, -0.23542376F);
        }
        ++field1526;
        return (-arg0 + arg2) * arg3 + arg0;
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(ZI)V", line = 284)
    public final void method794(boolean arg0, int arg1) {
        if (arg1 != -1) {
            field1524 = null;
        }
        if (this.field1530 != null && arg0) {
            super.field3884.method2351(0, 1);
            super.field3884.method1886(1, class268.field4040);
            class21 var3 = super.field3884.method2327(true);
            var3.method256(1024);
            super.field3884.method2356(0, class564.field7957);
            if (this.field1519) {
                super.field3884.method2339(class413.field6010, -32540, class190.field2740);
                super.field3884.method1881(true, class61.field1155, 0, -4016, false);
                super.field3884.method2360(0, class315.field4669, 1);
            } else {
                super.field3884.method2339(class190.field2740, -32540, class153.field2209);
                super.field3884.method2324(0, class319.field4696, arg1 ^ -2);
                super.field3884.method2351(0, 2);
                super.field3884.method2339(class413.field6010, -32540, class190.field2740);
                super.field3884.method2324(0, class319.field4696, 1);
                super.field3884.method1881(true, class319.field4696, 1, -4016, false);
                super.field3884.method2360(0, class315.field4669, 1);
                super.field3884.method2337(false, super.field3884.field5706);
            }
            super.field3884.method2351(0, 0);
            this.field1525 = true;
        } else {
            super.field3884.method2360(0, class315.field4669, 1);
        }
        ++field1521;
    }

    @OriginalMember(owner = "client!bm", name = "h", descriptor = "(I)V", line = 333)
    public static void method795(int arg0) {
        field1534 = null;
        field1524 = null;
        field1527 = null;
        field1522 = null;
        if (arg0 != 109636600) {
            method789(-110, -36, -47, 95, 108);
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(III)V", line = 346)
    public final void method796(int arg0, int arg1, int arg2) {
        ++field1520;
        if (arg2 < -105) {
            if (this.field1525) {
                super.field3884.method2351(0, 1);
                super.field3884.method2337(false, this.field1530[arg1 + -1]);
                super.field3884.method2351(0, 0);
            }
        }
    }
}
