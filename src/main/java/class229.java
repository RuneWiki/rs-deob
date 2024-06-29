import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class229 {

    @OriginalMember(owner = "client!bf", name = "d", descriptor = "I")
    public int field3359 = 0;

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "I")
    public int field3357 = 0;

    @OriginalMember(owner = "client!bf", name = "s", descriptor = "I")
    public int field3374 = -1;

    @OriginalMember(owner = "client!bf", name = "l", descriptor = "I")
    public int field3367 = -1;

    @OriginalMember(owner = "client!bf", name = "w", descriptor = "I")
    public int field3378 = 0;

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "I")
    public int field3358 = -1;

    @OriginalMember(owner = "client!bf", name = "e", descriptor = "I")
    public int field3360 = -1;

    @OriginalMember(owner = "client!bf", name = "u", descriptor = "[I")
    public int[] field3376 = null;

    @OriginalMember(owner = "client!bf", name = "f", descriptor = "I")
    public int field3361 = -1;

    @OriginalMember(owner = "client!bf", name = "G", descriptor = "I")
    public int field3388 = -1;

    @OriginalMember(owner = "client!bf", name = "t", descriptor = "I")
    public int field3375 = 0;

    @OriginalMember(owner = "client!bf", name = "C", descriptor = "I")
    public int field3384 = -1;

    @OriginalMember(owner = "client!bf", name = "i", descriptor = "I")
    public int field3364 = 0;

    @OriginalMember(owner = "client!bf", name = "D", descriptor = "I")
    public int field3385 = -1;

    @OriginalMember(owner = "client!bf", name = "F", descriptor = "I")
    public int field3387 = 0;

    @OriginalMember(owner = "client!bf", name = "J", descriptor = "I")
    public int field3391 = -1;

    @OriginalMember(owner = "client!bf", name = "x", descriptor = "I")
    public int field3379 = -1;

    @OriginalMember(owner = "client!bf", name = "m", descriptor = "I")
    public int field3368 = 0;

    @OriginalMember(owner = "client!bf", name = "p", descriptor = "I")
    public int field3371 = -1;

    @OriginalMember(owner = "client!bf", name = "o", descriptor = "I")
    public int field3370 = -1;

    @OriginalMember(owner = "client!bf", name = "y", descriptor = "I")
    public int field3380 = 0;

    @OriginalMember(owner = "client!bf", name = "H", descriptor = "I")
    public int field3389 = 0;

    @OriginalMember(owner = "client!bf", name = "I", descriptor = "I")
    public int field3390 = 0;

    @OriginalMember(owner = "client!bf", name = "k", descriptor = "I")
    public int field3366 = -1;

    @OriginalMember(owner = "client!bf", name = "Q", descriptor = "I")
    public int field3398 = -1;

    @OriginalMember(owner = "client!bf", name = "h", descriptor = "I")
    public int field3363 = -1;

    @OriginalMember(owner = "client!bf", name = "q", descriptor = "I")
    public int field3372 = -1;

    @OriginalMember(owner = "client!bf", name = "M", descriptor = "I")
    public int field3394 = -1;

    @OriginalMember(owner = "client!bf", name = "v", descriptor = "I")
    public int field3377 = -1;

    @OriginalMember(owner = "client!bf", name = "N", descriptor = "I")
    public int field3395 = -1;

    @OriginalMember(owner = "client!bf", name = "W", descriptor = "I")
    public int field3403 = -1;

    @OriginalMember(owner = "client!bf", name = "j", descriptor = "[I")
    public int[] field3365 = null;

    @OriginalMember(owner = "client!bf", name = "U", descriptor = "I")
    public int field3401 = -1;

    @OriginalMember(owner = "client!bf", name = "V", descriptor = "I")
    private int field3402 = 0;

    @OriginalMember(owner = "client!bf", name = "L", descriptor = "I")
    public int field3393 = -1;

    @OriginalMember(owner = "client!bf", name = "K", descriptor = "I")
    public int field3392 = -1;

    @OriginalMember(owner = "client!bf", name = "T", descriptor = "I")
    public int field3400 = -1;

    @OriginalMember(owner = "client!bf", name = "n", descriptor = "I")
    public int field3369 = -1;

    @OriginalMember(owner = "client!bf", name = "S", descriptor = "Z")
    public boolean field3399 = true;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "I")
    public int field3356 = 0;

    @OriginalMember(owner = "client!bf", name = "B", descriptor = "I")
    public int field3383 = 0;

    @OriginalMember(owner = "client!bf", name = "g", descriptor = "I")
    public static int field3362;

    @OriginalMember(owner = "client!bf", name = "r", descriptor = "I")
    public static int field3373;

    @OriginalMember(owner = "client!bf", name = "A", descriptor = "I")
    public static int field3382;

    @OriginalMember(owner = "client!bf", name = "E", descriptor = "I")
    public static int field3386;

    @OriginalMember(owner = "client!bf", name = "O", descriptor = "I")
    public static int field3396;

    @OriginalMember(owner = "client!bf", name = "P", descriptor = "I")
    public static int field3397;

    @OriginalMember(owner = "client!bf", name = "X", descriptor = "[I")
    public int[] field3404;

    @OriginalMember(owner = "client!bf", name = "z", descriptor = "[[I")
    public int[][] field3381;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(Z)I")
    public final int method1493(boolean arg0) {
        if (!arg0) {
            return 75;
        }
        field3396++;
        if (this.field3388 != -1) {
            return this.field3388;
        } else if (this.field3365 == null) {
            return -1;
        } else {
            int var2 = (int) (Math.random() * (double) this.field3402);
            int var3;
            for (var3 = 0; var2 >= this.field3376[var3]; var3++) {
                var2 -= this.field3376[var3];
            }
            return this.field3365[var3];
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IB)Z")
    public final boolean method1494(int arg0, byte arg1) {
        field3386++;
        if (arg0 == -1) {
            return false;
        }
        int var3 = 121 % ((18 - arg1) / 61);
        if (this.field3388 == arg0) {
            return true;
        }
        if (this.field3365 != null) {
            for (int var4 = 0; var4 < this.field3365.length; var4++) {
                if (this.field3365[var4] == arg0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lps;I)V")
    public final void method1495(class428 arg0, int arg1) {
        if (arg1 != -1) {
            this.field3385 = -46;
        }
        while (true) {
            int var3 = arg0.method2561((byte) -43);
            if (var3 == 0) {
                field3382++;
                return;
            }
            this.method1498(arg0, var3, arg1 ^ 0xFFFFFFBA);
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIII)V")
    public static final void method1496(int arg0, int arg1, int arg2, int arg3) {
        field3362++;
        int var4 = class584.field8677 + arg1;
        int var5 = class424.field6061 + arg3;
        if (class526.field7777 == null || arg1 < 0 || arg3 < 0 || class35.field399 <= arg1 || arg3 >= class382.field5586) {
            return;
        }
        long var6 = (long) (var5 << 14 | arg2 << 28 | var4);
        class368 var8 = (class368) class546.field8147.method1333(var6, false);
        if (var8 == null) {
            class309.method1896(arg2, arg1, arg3);
            return;
        }
        class539 var9 = (class539) var8.field5322.method2496((byte) 31);
        if (var9 == null) {
            class309.method1896(arg2, arg1, arg3);
            return;
        }
        class394 var10 = (class394) class309.method1896(arg2, arg1, arg3);
        if (var10 == null) {
            var10 = new class394();
        } else {
            var10.field5738 = var10.field5723 = -1;
        }
        var10.field5729 = var9.field7977;
        var10.field5730 = var9.field7975;
        label51: while (true) {
            class539 var11 = (class539) var8.field5322.method2494(98);
            if (var11 == null) {
                break;
            }
            if (var10.field5729 != var11.field7977) {
                var10.field5737 = var11.field7975;
                var10.field5738 = var11.field7977;
                while (true) {
                    class539 var12 = (class539) var8.field5322.method2494(95);
                    if (var12 == null) {
                        break label51;
                    }
                    if (var10.field5729 != var12.field7977 && var10.field5738 != var12.field7977) {
                        var10.field5723 = var12.field7977;
                        var10.field5732 = var12.field7975;
                    }
                }
            }
        }
        int var13 = class226.method1477(arg2, true, (arg1 << 7) + 64, (arg3 << 7) + 64);
        class11.method52(arg2, arg1, arg3, var13, var10);
        if (arg0 < -7) {
            ;
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(BII)Z")
    public static final boolean method1497(byte arg0, int arg1, int arg2) {
        if (arg0 == -110) {
            field3373++;
            return ((arg1 & 0x2000) != 0 | class587.method3425(arg2, arg1, 75) | class281.method1769(-3273, arg2, arg1)) & class174.method1172(-127, arg2, arg1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lps;II)V")
    private final void method1498(class428 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field3388 = arg0.method2620(119);
            this.field3401 = arg0.method2620(112);
            if (this.field3401 == 65535) {
                this.field3401 = -1;
            }
            if (this.field3388 == 65535) {
                this.field3388 = -1;
            }
        } else if (arg1 == 2) {
            this.field3377 = arg0.method2620(70);
        } else if (arg1 == 3) {
            this.field3370 = arg0.method2620(27);
        } else if (arg1 == 4) {
            this.field3372 = arg0.method2620(85);
        } else if (arg1 == 5) {
            this.field3363 = arg0.method2620(22);
        } else if (arg1 == 6) {
            this.field3379 = arg0.method2620(52);
        } else if (arg1 == 7) {
            this.field3398 = arg0.method2620(94);
        } else if (arg1 == 8) {
            this.field3367 = arg0.method2620(52);
        } else if (arg1 == 9) {
            this.field3400 = arg0.method2620(70);
        } else if (arg1 == 26) {
            this.field3359 = (short) (arg0.method2561((byte) -56) * 4);
            this.field3383 = (short) (arg0.method2561((byte) -59) * 4);
        } else if (arg1 == 27) {
            if (this.field3381 == null) {
                this.field3381 = new int[12][];
            }
            int var8 = arg0.method2561((byte) -70);
            this.field3381[var8] = new int[6];
            for (int var9 = 0; var9 < 6; var9++) {
                this.field3381[var8][var9] = arg0.method2622((byte) 124);
            }
        } else if (arg1 == 28) {
            this.field3404 = new int[12];
            for (int var4 = 0; var4 < 12; var4++) {
                this.field3404[var4] = arg0.method2561((byte) 121);
                if (this.field3404[var4] == 255) {
                    this.field3404[var4] = -1;
                }
            }
        } else if (arg1 == 29) {
            this.field3356 = arg0.method2561((byte) -26);
        } else if (arg1 == 30) {
            this.field3375 = arg0.method2620(41);
        } else if (arg1 == 31) {
            this.field3380 = arg0.method2561((byte) -41);
        } else if (arg1 == 32) {
            this.field3389 = arg0.method2620(79);
        } else if (arg1 == 33) {
            this.field3357 = arg0.method2622((byte) 125);
        } else if (arg1 == 34) {
            this.field3378 = arg0.method2561((byte) -92);
        } else if (arg1 == 35) {
            this.field3390 = arg0.method2620(82);
        } else if (arg1 == 36) {
            this.field3364 = arg0.method2622((byte) 126);
        } else if (arg1 == 37) {
            this.field3366 = arg0.method2561((byte) 109);
        } else if (arg1 == 38) {
            this.field3371 = arg0.method2620(106);
        } else if (arg1 == 39) {
            this.field3392 = arg0.method2620(89);
        } else if (arg1 == 40) {
            this.field3393 = arg0.method2620(116);
        } else if (arg1 == 41) {
            this.field3358 = arg0.method2620(38);
        } else if (arg1 == 42) {
            this.field3391 = arg0.method2620(118);
        } else if (arg1 == 43) {
            this.field3394 = arg0.method2620(106);
        } else if (arg1 == 44) {
            this.field3369 = arg0.method2620(107);
        } else if (arg1 == 45) {
            this.field3361 = arg0.method2620(24);
        } else if (arg1 == 46) {
            this.field3384 = arg0.method2620(80);
        } else if (arg1 == 47) {
            this.field3385 = arg0.method2620(57);
        } else if (arg1 == 48) {
            this.field3395 = arg0.method2620(61);
        } else if (arg1 == 49) {
            this.field3403 = arg0.method2620(60);
        } else if (arg1 == 50) {
            this.field3374 = arg0.method2620(97);
        } else if (arg1 == 51) {
            this.field3360 = arg0.method2620(30);
        } else if (arg1 == 52) {
            int var5 = arg0.method2561((byte) -68);
            this.field3376 = new int[var5];
            this.field3365 = new int[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3365[var6] = arg0.method2620(35);
                int var7 = arg0.method2561((byte) -60);
                this.field3376[var6] = var7;
                this.field3402 += var7;
            }
        } else if (arg1 == 53) {
            this.field3399 = false;
        } else if (arg1 == 54) {
            this.field3368 = arg0.method2561((byte) 118) << 6;
            this.field3387 = arg0.method2561((byte) -97) << 6;
        }
        field3397++;
        if (arg2 <= 59) {
            method1496(-76, 108, 23, -119);
        }
    }
}
