import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class199 {

    @OriginalMember(owner = "client!ia", name = "h", descriptor = "I")
    public int field3395 = -1;

    @OriginalMember(owner = "client!ia", name = "d", descriptor = "I")
    public int field3391 = -1;

    @OriginalMember(owner = "client!ia", name = "j", descriptor = "I")
    public int field3397 = -1;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "I")
    public int field3388 = 5;

    @OriginalMember(owner = "client!ia", name = "e", descriptor = "I")
    public int field3392 = -1;

    @OriginalMember(owner = "client!ia", name = "t", descriptor = "Z")
    private boolean field3407 = false;

    @OriginalMember(owner = "client!ia", name = "p", descriptor = "I")
    public int field3403 = 2;

    @OriginalMember(owner = "client!ia", name = "v", descriptor = "I")
    public int field3409 = 99;

    @OriginalMember(owner = "client!ia", name = "k", descriptor = "Z")
    public boolean field3398 = false;

    @OriginalMember(owner = "client!ia", name = "y", descriptor = "I")
    public int field3412 = -1;

    @OriginalMember(owner = "client!ia", name = "A", descriptor = "I")
    public static int field3414 = 0;

    @OriginalMember(owner = "client!ia", name = "m", descriptor = "Lcd;")
    public static class64 field3400 = class44.method335((byte) 71, "Lade)3)3)3");

    @OriginalMember(owner = "client!ia", name = "o", descriptor = "Lcd;")
    public static class64 field3402 = class44.method335((byte) 71, "W-=hlen Sie eine Option");

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "I")
    public static int field3389;

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "I")
    public static int field3390;

    @OriginalMember(owner = "client!ia", name = "g", descriptor = "I")
    public static int field3394;

    @OriginalMember(owner = "client!ia", name = "l", descriptor = "I")
    public static int field3399;

    @OriginalMember(owner = "client!ia", name = "n", descriptor = "I")
    public static int field3401;

    @OriginalMember(owner = "client!ia", name = "q", descriptor = "I")
    public static int field3404;

    @OriginalMember(owner = "client!ia", name = "s", descriptor = "I")
    public static int field3406;

    @OriginalMember(owner = "client!ia", name = "u", descriptor = "I")
    public static int field3408;

    @OriginalMember(owner = "client!ia", name = "z", descriptor = "I")
    public static int field3413;

    @OriginalMember(owner = "client!ia", name = "B", descriptor = "I")
    public static int field3415;

    @OriginalMember(owner = "client!ia", name = "C", descriptor = "I")
    public static int field3416;

    @OriginalMember(owner = "client!ia", name = "D", descriptor = "I")
    public static int field3417;

    @OriginalMember(owner = "client!ia", name = "E", descriptor = "I")
    public static int field3418;

    @OriginalMember(owner = "client!ia", name = "w", descriptor = "Lli;")
    public static class209 field3410;

    @OriginalMember(owner = "client!ia", name = "f", descriptor = "[I")
    public int[] field3393;

    @OriginalMember(owner = "client!ia", name = "r", descriptor = "[I")
    private int[] field3405;

    @OriginalMember(owner = "client!ia", name = "x", descriptor = "[I")
    private int[] field3411;

    @OriginalMember(owner = "client!ia", name = "F", descriptor = "[I")
    public int[] field3419;

    @OriginalMember(owner = "client!ia", name = "i", descriptor = "[[I")
    public int[][] field3396;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(B)V", line = 9)
    public final void method1390(byte arg0) {
        field3399++;
        if (arg0 != -16) {
            method1396(-66, -80, (byte) 23, -5, -92, 58, -105, -63);
        }
        if (this.field3397 == -1) {
            if (this.field3405 == null) {
                this.field3397 = 0;
            } else {
                this.field3397 = 2;
            }
        }
        if (this.field3392 != -1) {
            return;
        }
        if (this.field3405 == null) {
            this.field3392 = 0;
        } else {
            this.field3392 = 2;
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(II)Z", line = 45)
    public static final boolean method1391(int arg0, int arg1) {
        int var2 = 82 / ((-arg0 - 65) / 56);
        field3416++;
        return (arg1 >> 28 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Lam;II)Lam;", line = 71)
    public final class243 method1392(class243 arg0, int arg1, int arg2) {
        field3394++;
        int var4 = this.field3393[arg1];
        class78 var5 = class80.method628(var4 >> 16, 0);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method24(true, true);
        }
        class243 var7 = arg0.method24(!var5.method614(-1, var6), !this.field3407);
        if (arg2 < 39) {
            this.method1394((class243) null, 112, 26, (byte) -127);
        }
        var7.method46(var5, var6, this.field3407);
        return var7;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Lkh;II)V", line = 92)
    private final void method1393(class13 arg0, int arg1, int arg2) {
        if (arg1 != 9018) {
            this.method1392((class243) null, -40, -118);
        }
        if (arg2 == 1) {
            int var4 = arg0.method112((byte) 92);
            this.field3419 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field3419[var5] = arg0.method112((byte) 92);
            }
            this.field3393 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                this.field3393[var6] = arg0.method112((byte) 92);
            }
            for (int var7 = 0; var7 < var4; var7++) {
                this.field3393[var7] = (arg0.method112((byte) 92) << 16) + this.field3393[var7];
            }
        } else if (arg2 == 2) {
            this.field3395 = arg0.method112((byte) 92);
        } else if (arg2 == 3) {
            int var8 = arg0.method152((byte) -102);
            this.field3405 = new int[var8 + 1];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field3405[var9] = arg0.method152((byte) -121);
            }
            this.field3405[var8] = 9999999;
        } else if (arg2 == 4) {
            this.field3398 = true;
        } else if (arg2 == 5) {
            this.field3388 = arg0.method152((byte) -96);
        } else if (arg2 == 6) {
            this.field3391 = arg0.method112((byte) 92);
        } else if (arg2 == 7) {
            this.field3412 = arg0.method112((byte) 92);
        } else if (arg2 == 8) {
            this.field3409 = arg0.method152((byte) -74);
        } else if (arg2 == 9) {
            this.field3397 = arg0.method152((byte) -73);
        } else if (arg2 == 10) {
            this.field3392 = arg0.method152((byte) -93);
        } else if (arg2 == 11) {
            this.field3403 = arg0.method152((byte) -124);
        } else if (arg2 == 12) {
            int var14 = arg0.method152((byte) -88);
            this.field3411 = new int[var14];
            for (int var15 = 0; var15 < var14; var15++) {
                this.field3411[var15] = arg0.method112((byte) 92);
            }
            for (int var16 = 0; var16 < var14; var16++) {
                this.field3411[var16] += arg0.method112((byte) 92) << 16;
            }
        } else if (arg2 == 13) {
            int var10 = arg0.method112((byte) 92);
            this.field3396 = new int[var10][];
            for (int var11 = 0; var11 < var10; var11++) {
                int var12 = arg0.method152((byte) -125);
                if (var12 > 0) {
                    this.field3396[var11] = new int[var12];
                    this.field3396[var11][0] = arg0.method111(1263702152);
                    for (int var13 = 1; var13 < var12; var13++) {
                        this.field3396[var11][var13] = arg0.method112((byte) 92);
                    }
                }
            }
        } else if (arg2 == 14) {
            this.field3407 = true;
        }
        field3418++;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Lam;IIB)Lam;", line = 253)
    public final class243 method1394(class243 arg0, int arg1, int arg2, byte arg3) {
        int var5 = this.field3393[arg1];
        field3404++;
        class78 var6 = class80.method628(var5 >> 16, 0);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg0.method34(true, true);
        }
        int var8 = arg2 & 0x3;
        class243 var9 = arg0.method34(!var6.method614(-1, var7), !this.field3407);
        if (var8 == 1) {
            var9.method21();
        } else if (var8 == 2) {
            var9.method45();
        } else if (var8 == 3) {
            var9.method31();
        }
        if (arg3 != 92) {
            return (class243) null;
        }
        var9.method46(var6, var7, this.field3407);
        if (var8 == 1) {
            var9.method31();
        } else if (var8 == 2) {
            var9.method45();
        } else if (var8 == 3) {
            var9.method21();
        }
        return var9;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(ZLkh;)V", line = 298)
    public final void method1395(boolean arg0, class13 arg1) {
        field3415++;
        while (true) {
            int var3 = arg1.method152((byte) -127);
            if (var3 == 0) {
                if (!arg0) {
                    field3389 = -92;
                }
                return;
            }
            this.method1393(arg1, 9018, var3);
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIBIIIII)V", line = 319)
    public static final void method1396(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3408++;
        if (class159.method1148(arg2 ^ 0xFFFFFF9D, arg1)) {
            client.method1764(class272.field4675[arg1], -1, arg6, arg0, arg4, arg5, arg7, arg3);
            if (arg2 != 98) {
                field3389 = -71;
            }
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IILam;)Lam;", line = 334)
    public final class243 method1397(int arg0, int arg1, class243 arg2) {
        field3413++;
        if (arg0 < 8) {
            return (class243) null;
        }
        int var4 = this.field3393[arg1];
        class78 var5 = class80.method628(var4 >> 16, 0);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg2.method34(true, true);
        }
        class78 var7 = null;
        int var8 = 0;
        if (this.field3411 != null && arg1 < this.field3411.length) {
            int var9 = this.field3411[arg1];
            var7 = class80.method628(var9 >> 16, 0);
            var8 = var9 & 0xFFFF;
        }
        if (var7 == null || var8 == 65535) {
            class243 var11 = arg2.method34(!var5.method614(-1, var6), !this.field3407);
            var11.method46(var5, var6, this.field3407);
            return var11;
        } else {
            class243 var10 = arg2.method34(!var5.method614(-1, var6) & !var7.method614(-1, var8), !this.field3407);
            var10.method46(var5, var6, this.field3407);
            var10.method46(var7, var8, this.field3407);
            return var10;
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(ILam;I)Lam;", line = 377)
    public final class243 method1398(int arg0, class243 arg1, int arg2) {
        field3417++;
        int var4 = this.field3393[arg2];
        class78 var5 = class80.method628(var4 >> 16, 0);
        int var6 = var4 & arg0;
        if (var5 == null) {
            return arg1.method34(true, true);
        } else {
            class243 var7 = arg1.method34(!var5.method614(-1, var6), !this.field3407);
            var7.method46(var5, var6, this.field3407);
            return var7;
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(ILqm;Lqm;)V", line = 408)
    public static final void method1399(int arg0, class222 arg1, class222 arg2) {
        class145.field2570 = arg2;
        if (arg0 < 42) {
            field3410 = (class209) null;
        }
        field3401++;
        class277.field4772 = arg1;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(I)V", line = 420)
    public static void method1400(int arg0) {
        if (arg0 == -292669904) {
            field3410 = null;
            field3402 = null;
            field3400 = null;
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(BLam;ILia;I)Lam;", line = 436)
    public final class243 method1401(byte arg0, class243 arg1, int arg2, class199 arg3, int arg4) {
        field3406++;
        int var6 = this.field3393[arg2];
        class78 var7 = class80.method628(var6 >> 16, 0);
        if (arg0 != -97) {
            field3402 = (class64) null;
        }
        int var8 = var6 & 0xFFFF;
        if (var7 == null) {
            return arg3.method1398(65535, arg1, arg4);
        }
        int var9 = arg3.field3393[arg4];
        class78 var10 = class80.method628(var9 >> 16, 0);
        int var11 = var9 & 0xFFFF;
        if (var10 == null) {
            class243 var12 = arg1.method34(!var7.method614(-1, var8), !this.field3407);
            var12.method46(var7, var8, this.field3407);
            return var12;
        } else {
            class243 var13 = arg1.method34(!var7.method614(-1, var8) & !var10.method614(-1, var11), !arg3.field3407 & !this.field3407);
            var13.method36(var7, var8, var10, var11, this.field3405, arg3.field3407 | this.field3407);
            return var13;
        }
    }
}
