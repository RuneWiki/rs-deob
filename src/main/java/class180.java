import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public class class180 {

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "Z")
    public boolean field3255 = true;

    @OriginalMember(owner = "client!ig", name = "g", descriptor = "Z")
    public boolean field3261 = true;

    @OriginalMember(owner = "client!ig", name = "d", descriptor = "I")
    public int field3258 = 0;

    @OriginalMember(owner = "client!ig", name = "A", descriptor = "Z")
    public boolean field3281 = true;

    @OriginalMember(owner = "client!ig", name = "v", descriptor = "I")
    private int field3276 = 100;

    @OriginalMember(owner = "client!ig", name = "P", descriptor = "I")
    public int field3296 = -1;

    @OriginalMember(owner = "client!ig", name = "L", descriptor = "I")
    public int field3292 = 0;

    @OriginalMember(owner = "client!ig", name = "m", descriptor = "Z")
    public boolean field3267 = false;

    @OriginalMember(owner = "client!ig", name = "F", descriptor = "Z")
    public boolean field3286 = true;

    @OriginalMember(owner = "client!ig", name = "G", descriptor = "I")
    private int field3287 = 100;

    @OriginalMember(owner = "client!ig", name = "f", descriptor = "I")
    public int field3260 = -1;

    @OriginalMember(owner = "client!ig", name = "s", descriptor = "I")
    public int field3273 = -1;

    @OriginalMember(owner = "client!ig", name = "D", descriptor = "I")
    private int field3284 = 100;

    @OriginalMember(owner = "client!ig", name = "ob", descriptor = "I")
    public int field3321 = 0;

    @OriginalMember(owner = "client!ig", name = "I", descriptor = "I")
    public int field3289 = -1;

    @OriginalMember(owner = "client!ig", name = "nb", descriptor = "I")
    public int field3320 = -2;

    @OriginalMember(owner = "client!ig", name = "Q", descriptor = "I")
    public int field3297 = -1;

    @OriginalMember(owner = "client!ig", name = "C", descriptor = "I")
    public int field3283 = -2;

    @OriginalMember(owner = "client!ig", name = "e", descriptor = "Lsf;")
    private static class108 field3259 = class140.method973(255, "wave2:");

    @OriginalMember(owner = "client!ig", name = "p", descriptor = "Lsf;")
    public static class108 field3270 = field3259;

    @OriginalMember(owner = "client!ig", name = "i", descriptor = "Lsf;")
    public static class108 field3263 = class140.method973(255, "Continuer");

    @OriginalMember(owner = "client!ig", name = "u", descriptor = "Lsf;")
    public static class108 field3275 = class140.method973(255, "Fichiers config charg-Bs");

    @OriginalMember(owner = "client!ig", name = "z", descriptor = "Z")
    public static boolean field3280 = true;

    @OriginalMember(owner = "client!ig", name = "S", descriptor = "Lsf;")
    public static class108 field3299 = class140.method973(255, " zuerst von Ihrer Ignorieren)2Liste(Q");

    @OriginalMember(owner = "client!ig", name = "w", descriptor = "Z")
    public static boolean field3277 = true;

    @OriginalMember(owner = "client!ig", name = "ab", descriptor = "I")
    public static int field3307 = -1;

    @OriginalMember(owner = "client!ig", name = "B", descriptor = "Lsf;")
    public static class108 field3282 = field3259;

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "I")
    public int field3256;

    @OriginalMember(owner = "client!ig", name = "c", descriptor = "I")
    public int field3257;

    @OriginalMember(owner = "client!ig", name = "h", descriptor = "I")
    public int field3262;

    @OriginalMember(owner = "client!ig", name = "j", descriptor = "I")
    public int field3264;

    @OriginalMember(owner = "client!ig", name = "k", descriptor = "I")
    public static int field3265;

    @OriginalMember(owner = "client!ig", name = "l", descriptor = "I")
    public static int field3266;

    @OriginalMember(owner = "client!ig", name = "n", descriptor = "I")
    public int field3268;

    @OriginalMember(owner = "client!ig", name = "o", descriptor = "I")
    public int field3269;

    @OriginalMember(owner = "client!ig", name = "r", descriptor = "I")
    public int field3272;

    @OriginalMember(owner = "client!ig", name = "t", descriptor = "I")
    public int field3274;

    @OriginalMember(owner = "client!ig", name = "y", descriptor = "I")
    public static int field3279;

    @OriginalMember(owner = "client!ig", name = "E", descriptor = "I")
    private int field3285;

    @OriginalMember(owner = "client!ig", name = "H", descriptor = "I")
    public int field3288;

    @OriginalMember(owner = "client!ig", name = "J", descriptor = "I")
    public int field3290;

    @OriginalMember(owner = "client!ig", name = "M", descriptor = "I")
    public int field3293;

    @OriginalMember(owner = "client!ig", name = "N", descriptor = "I")
    public static int field3294;

    @OriginalMember(owner = "client!ig", name = "O", descriptor = "I")
    public int field3295;

    @OriginalMember(owner = "client!ig", name = "T", descriptor = "I")
    private int field3300;

    @OriginalMember(owner = "client!ig", name = "U", descriptor = "I")
    public int field3301;

    @OriginalMember(owner = "client!ig", name = "V", descriptor = "I")
    public int field3302;

    @OriginalMember(owner = "client!ig", name = "W", descriptor = "I")
    public int field3303;

    @OriginalMember(owner = "client!ig", name = "X", descriptor = "I")
    public static int field3304;

    @OriginalMember(owner = "client!ig", name = "Y", descriptor = "I")
    private int field3305;

    @OriginalMember(owner = "client!ig", name = "cb", descriptor = "I")
    private int field3309;

    @OriginalMember(owner = "client!ig", name = "db", descriptor = "I")
    public int field3310;

    @OriginalMember(owner = "client!ig", name = "fb", descriptor = "I")
    public int field3312;

    @OriginalMember(owner = "client!ig", name = "gb", descriptor = "I")
    public int field3313;

    @OriginalMember(owner = "client!ig", name = "hb", descriptor = "I")
    private int field3314;

    @OriginalMember(owner = "client!ig", name = "ib", descriptor = "I")
    public int field3315;

    @OriginalMember(owner = "client!ig", name = "kb", descriptor = "I")
    public int field3317;

    @OriginalMember(owner = "client!ig", name = "lb", descriptor = "I")
    public int field3318;

    @OriginalMember(owner = "client!ig", name = "mb", descriptor = "I")
    public int field3319;

    @OriginalMember(owner = "client!ig", name = "pb", descriptor = "I")
    private int field3322;

    @OriginalMember(owner = "client!ig", name = "qb", descriptor = "I")
    public int field3323;

    @OriginalMember(owner = "client!ig", name = "rb", descriptor = "I")
    public int field3324;

    @OriginalMember(owner = "client!ig", name = "sb", descriptor = "I")
    public int field3325;

    @OriginalMember(owner = "client!ig", name = "q", descriptor = "S")
    public short field3271;

    @OriginalMember(owner = "client!ig", name = "K", descriptor = "S")
    public short field3291;

    @OriginalMember(owner = "client!ig", name = "Z", descriptor = "S")
    public short field3306;

    @OriginalMember(owner = "client!ig", name = "eb", descriptor = "S")
    public short field3311;

    @OriginalMember(owner = "client!ig", name = "R", descriptor = "[I")
    private int[] field3298;

    @OriginalMember(owner = "client!ig", name = "bb", descriptor = "[I")
    public int[] field3308;

    @OriginalMember(owner = "client!ig", name = "jb", descriptor = "[I")
    public int[] field3316;

    @OriginalMember(owner = "client!ig", name = "x", descriptor = "[Z")
    public static boolean[] field3278;

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(Z)V", line = 31)
    public static void method1303(boolean arg0) {
        field3282 = null;
        field3275 = null;
        field3299 = null;
        field3259 = null;
        field3263 = null;
        field3270 = null;
        field3278 = null;
        if (arg0) {
            method1305(-85);
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(Lrm;Z)V", line = 52)
    public final void method1304(class249 arg0, boolean arg1) {
        if (arg1) {
            this.field3316 = (int[]) null;
        }
        while (true) {
            int var3 = arg0.method1731(true);
            if (var3 == 0) {
                field3265++;
                return;
            }
            this.method1307(var3, 8, arg0);
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(I)V", line = 101)
    public static final void method1305(int arg0) {
        for (int var1 = 0; var1 < class61.field969; var1++) {
            int var2 = class168.field3020[var1];
            class45 var3 = class159.field2863[var2];
            if (var3 != null) {
                class99.method684(var3, var3.field646.field2381, 12869);
            }
        }
        if (arg0 == 27725) {
            field3294++;
        }
    }

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "(I)I", line = 185)
    public static final int method1306(int arg0) {
        field3266++;
        try {
            if (class262.field4632 == 0) {
                if (class19.field266 > class118.method835(-1272) - 5000L) {
                    return 0;
                }
                class93.field1489 = class289.field5052.method970(class329.field5624, class206.field3703, (byte) -121);
                class212.field3782 = class118.method835(arg0 ^ 0x56EE);
                class262.field4632 = 1;
            }
            if ((class212.field3782 + 30000L) < class118.method835(-1272)) {
                return class252.method1779(16, 1000);
            }
            if (class262.field4632 == 1) {
                if (class93.field1489.field3686 == 2) {
                    return class252.method1779(16, 1001);
                }
                if (class93.field1489.field3686 != 1) {
                    return -1;
                }
                class14.field161 = new class216((Socket) class93.field1489.field3685, class289.field5052);
                int var1 = 0;
                class256.field4471.field4314 = 0;
                class93.field1489 = null;
                if (class320.field5487) {
                    var1 = class216.field3839;
                }
                class256.field4471.method1759(arg0 - 11750, 125);
                class256.field4471.method1741(var1, -1580277072);
                class14.field161.method1483(class256.field4471.field4314, 0, false, class256.field4471.field4338);
                if (class308.field5347 != null) {
                    class308.field5347.method1406((byte) 66);
                }
                if (class261.field4601 != null) {
                    class261.field4601.method1406((byte) 66);
                }
                int var2 = class14.field161.method1482((byte) 126);
                if (class308.field5347 != null) {
                    class308.field5347.method1406((byte) 66);
                }
                if (class261.field4601 != null) {
                    class261.field4601.method1406((byte) 66);
                }
                if (var2 != 0) {
                    return class252.method1779(arg0 + 21034, var2);
                }
                class262.field4632 = 2;
            }
            if (class262.field4632 == 2) {
                if (class14.field161.method1486(arg0 ^ -21023) < 2) {
                    return -1;
                }
                class177.field3225 = class14.field161.method1482((byte) 125);
                class177.field3225 <<= 0x8;
                class177.field3225 += class14.field161.method1482((byte) 125);
                class316.field5438 = 0;
                class156.field2806 = new byte[class177.field3225];
                class262.field4632 = 3;
            }
            if (arg0 != -21018) {
                return 99;
            } else if (class262.field4632 == 3) {
                int var3 = class14.field161.method1486(7);
                if (var3 < 1) {
                    return -1;
                }
                if (var3 > class177.field3225 - class316.field5438) {
                    var3 = class177.field3225 - class316.field5438;
                }
                class14.field161.method1478(class316.field5438, var3, false, class156.field2806);
                class316.field5438 += var3;
                if (class177.field3225 > class316.field5438) {
                    return -1;
                } else if (class34.method226(false, class156.field2806)) {
                    class15.field201 = new class278[class110.field1926];
                    int var4 = 0;
                    for (int var5 = class5.field68; var5 <= class110.field1931; var5++) {
                        class278 var6 = class135.method926(var5, 846281444);
                        if (var6 != null) {
                            class15.field201[var4++] = var6;
                        }
                    }
                    class14.field161.method1487(13881);
                    class262.field4632 = 0;
                    class14.field161 = null;
                    class109.field1913 = 0;
                    class156.field2806 = null;
                    class19.field266 = class118.method835(arg0 ^ 0x56EE);
                    return 0;
                } else {
                    return class252.method1779(arg0 + 21034, 1002);
                }
            } else {
                return -1;
            }
        } catch (IOException var8) {
            return class252.method1779(16, 1003);
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IILrm;)V", line = 329)
    private final void method1307(int arg0, int arg1, class249 arg2) {
        if (arg1 != 8) {
            this.field3269 = -45;
        }
        if (arg0 == 1) {
            this.field3306 = (short) arg2.method1712(-1);
            this.field3311 = (short) arg2.method1712(-1);
            this.field3271 = (short) arg2.method1712(-1);
            this.field3291 = (short) arg2.method1712(-1);
        } else if (arg0 == 2) {
            arg2.method1731(true);
        } else if (arg0 == 3) {
            this.field3293 = arg2.method1738(-1756395344);
            this.field3272 = arg2.method1738(-1756395344);
        } else if (arg0 == 4) {
            this.field3292 = arg2.method1731(true);
            this.field3318 = arg2.method1721((byte) 47);
        } else if (arg0 == 5) {
            this.field3324 = arg2.method1731(true);
        } else if (arg0 == 6) {
            this.field3285 = arg2.method1738(-1756395344);
            this.field3322 = arg2.method1738(-1756395344);
        } else if (arg0 == 7) {
            this.field3301 = arg2.method1712(-1);
            this.field3315 = arg2.method1712(-1);
        } else if (arg0 == 8) {
            this.field3323 = arg2.method1712(-1);
            this.field3268 = arg2.method1712(-1);
        } else if (arg0 == 9) {
            int var4 = arg2.method1731(true);
            this.field3298 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field3298[var5] = arg2.method1712(-1);
            }
        } else if (arg0 == 10) {
            int var8 = arg2.method1731(true);
            this.field3308 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field3308[var9] = arg2.method1712(-1);
            }
        } else if (arg0 == 12) {
            this.field3320 = arg2.method1721((byte) 68);
        } else if (arg0 == 13) {
            this.field3283 = arg2.method1721((byte) 97);
        } else if (arg0 == 14) {
            this.field3321 = arg2.method1712(-1);
        } else if (arg0 == 15) {
            this.field3297 = arg2.method1712(arg1 - 9);
        } else if (arg0 == 16) {
            this.field3255 = arg2.method1731(true) == 1;
            this.field3289 = arg2.method1712(-1);
            this.field3273 = arg2.method1712(-1);
            this.field3286 = arg2.method1731(true) == 1;
        } else if (arg0 == 17) {
            this.field3260 = arg2.method1712(-1);
        } else if (arg0 == 18) {
            this.field3302 = arg2.method1738(-1756395344);
        } else if (arg0 == 19) {
            this.field3258 = arg2.method1731(true);
        } else if (arg0 == 20) {
            this.field3287 = arg2.method1731(true);
        } else if (arg0 == 21) {
            this.field3276 = arg2.method1731(true);
        } else if (arg0 == 22) {
            this.field3296 = arg2.method1738(-1756395344);
        } else if (arg0 == 23) {
            this.field3284 = arg2.method1731(true);
        } else if (arg0 == 24) {
            this.field3281 = false;
        } else if (arg0 == 25) {
            int var6 = arg2.method1731(true);
            this.field3316 = new int[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field3316[var7] = arg2.method1712(-1);
            }
        } else if (arg0 == 26) {
            this.field3261 = false;
        }
        field3304++;
    }

    @OriginalMember(owner = "client!ig", name = "c", descriptor = "(I)V", line = 516)
    public final void method1308(int arg0) {
        this.field3313 = this.field3285 >> 16 & 0xFF;
        this.field3314 = this.field3322 >> 24 & 0xFF;
        this.field3309 = (this.field3322 & 0xFF484A) >> 16;
        this.field3312 = this.field3285 >> 8 & 0xFF;
        if (this.field3296 != -1) {
            this.field3274 = this.field3315 * this.field3284 / 100;
            if (this.field3274 == 0) {
                this.field3274 = 1;
            }
            this.field3256 = (this.field3296 - this.field3293 - ((-this.field3293 + this.field3272) / 2)) / this.field3274;
        }
        this.field3325 = this.field3285 >> 24 & 0xFF;
        this.field3257 = this.field3309 - this.field3313;
        if (this.field3320 > -2 || this.field3283 > -2) {
            this.field3267 = true;
        }
        this.field3305 = (this.field3322 & 0xFFCF) >> 8;
        this.field3269 = this.field3285 & 0xFF;
        field3279++;
        int var2 = -56 % ((16 - arg0) / 52);
        this.field3290 = this.field3305 - this.field3312;
        this.field3288 = this.field3314 - this.field3325;
        this.field3300 = this.field3322 & 0xFF;
        this.field3319 = this.field3300 - this.field3269;
        if (this.field3302 == 0) {
            return;
        }
        this.field3262 = this.field3315 * this.field3276 / 100;
        if (this.field3262 == 0) {
            this.field3262 = 1;
        }
        this.field3310 = ((this.field3302 >> 24 & 0xFF) - (this.field3288 / 2) - this.field3325 << 8) / this.field3262;
        this.field3310 += this.field3310 > 0 ? -4 : 4;
        this.field3295 = this.field3315 * this.field3287 / 100;
        if (this.field3295 == 0) {
            this.field3295 = 1;
        }
        this.field3317 = ((this.field3302 & 0xFF) - (this.field3319 / 2 + this.field3269) << 8) / this.field3295;
        this.field3317 += this.field3317 <= 0 ? 4 : -4;
        this.field3264 = (-this.field3312 - (this.field3290 / 2 - ((this.field3302 & 0xFFB4) >> 8)) << 8) / this.field3295;
        this.field3303 = ((this.field3302 >> 16 & 0xFF) - (this.field3257 / 2) - this.field3313 << 8) / this.field3295;
        this.field3264 += this.field3264 > 0 ? -4 : 4;
        this.field3303 += this.field3303 > 0 ? -4 : 4;
    }
}
