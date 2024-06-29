import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class186 {

    @OriginalMember(owner = "client!db", name = "l", descriptor = "[F")
    public float[] field3256 = new float[4];

    @OriginalMember(owner = "client!db", name = "t", descriptor = "I")
    public int field3264;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "Z")
    public boolean field3245;

    @OriginalMember(owner = "client!db", name = "B", descriptor = "Z")
    public boolean field3272;

    @OriginalMember(owner = "client!db", name = "v", descriptor = "I")
    public int field3266;

    @OriginalMember(owner = "client!db", name = "i", descriptor = "I")
    public int field3253;

    @OriginalMember(owner = "client!db", name = "j", descriptor = "I")
    public int field3254;

    @OriginalMember(owner = "client!db", name = "s", descriptor = "I")
    public int field3263;

    @OriginalMember(owner = "client!db", name = "g", descriptor = "[S")
    public short[] field3251;

    @OriginalMember(owner = "client!db", name = "n", descriptor = "I")
    public int field3258;

    @OriginalMember(owner = "client!db", name = "p", descriptor = "I")
    private int field3260;

    @OriginalMember(owner = "client!db", name = "f", descriptor = "I")
    private int field3250;

    @OriginalMember(owner = "client!db", name = "k", descriptor = "[I")
    public static int[] field3255 = new int[2];

    @OriginalMember(owner = "client!db", name = "A", descriptor = "S")
    public static short field3271 = 1;

    @OriginalMember(owner = "client!db", name = "m", descriptor = "Z")
    public static boolean field3257 = false;

    @OriginalMember(owner = "client!db", name = "y", descriptor = "I")
    public static int field3269 = 0;

    @OriginalMember(owner = "client!db", name = "D", descriptor = "F")
    public float field3274;

    @OriginalMember(owner = "client!db", name = "G", descriptor = "F")
    public float field3277;

    @OriginalMember(owner = "client!db", name = "b", descriptor = "I")
    public static int field3246;

    @OriginalMember(owner = "client!db", name = "c", descriptor = "I")
    private int field3247;

    @OriginalMember(owner = "client!db", name = "d", descriptor = "I")
    public static int field3248;

    @OriginalMember(owner = "client!db", name = "e", descriptor = "I")
    public static int field3249;

    @OriginalMember(owner = "client!db", name = "o", descriptor = "I")
    private int field3259;

    @OriginalMember(owner = "client!db", name = "q", descriptor = "I")
    public static int field3261;

    @OriginalMember(owner = "client!db", name = "r", descriptor = "I")
    public static int field3262;

    @OriginalMember(owner = "client!db", name = "u", descriptor = "I")
    public static int field3265;

    @OriginalMember(owner = "client!db", name = "w", descriptor = "I")
    public static int field3267;

    @OriginalMember(owner = "client!db", name = "x", descriptor = "I")
    private int field3268;

    @OriginalMember(owner = "client!db", name = "z", descriptor = "I")
    public static int field3270;

    @OriginalMember(owner = "client!db", name = "C", descriptor = "I")
    public static int field3273;

    @OriginalMember(owner = "client!db", name = "E", descriptor = "I")
    public static int field3275;

    @OriginalMember(owner = "client!db", name = "F", descriptor = "I")
    private int field3276;

    @OriginalMember(owner = "client!db", name = "h", descriptor = "Lwk;")
    public class176 field3252;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(I)V", line = 11)
    public static void method1293(int arg0) {
        field3255 = null;
        if (arg0 != 30441) {
            field3267 = 88;
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(B)V", line = 33)
    private final void method1294(byte arg0) {
        int var2 = 64 % ((arg0 - 1) / 47);
        field3275++;
        int var3 = this.field3260;
        if (var3 == 2) {
            this.field3276 = 2048;
            this.field3268 = 0;
            this.field3259 = 2048;
            this.field3247 = 1;
        } else if (var3 == 3) {
            this.field3276 = 2048;
            this.field3268 = 0;
            this.field3259 = 4096;
            this.field3247 = 1;
        } else if (var3 == 4) {
            this.field3268 = 0;
            this.field3259 = 2048;
            this.field3276 = 2048;
            this.field3247 = 4;
        } else if (var3 == 5) {
            this.field3276 = 2048;
            this.field3259 = 8192;
            this.field3247 = 4;
            this.field3268 = 0;
        } else if (var3 == 12) {
            this.field3259 = 2048;
            this.field3247 = 2;
            this.field3276 = 2048;
            this.field3268 = 0;
        } else if (var3 == 13) {
            this.field3276 = 2048;
            this.field3247 = 2;
            this.field3268 = 0;
            this.field3259 = 8192;
        } else if (var3 == 10) {
            this.field3268 = 1536;
            this.field3276 = 512;
            this.field3259 = 2048;
            this.field3247 = 3;
        } else if (var3 == 11) {
            this.field3247 = 3;
            this.field3259 = 4096;
            this.field3276 = 512;
            this.field3268 = 1536;
        } else if (var3 == 6) {
            this.field3276 = 768;
            this.field3268 = 1280;
            this.field3259 = 2048;
            this.field3247 = 3;
        } else if (var3 == 7) {
            this.field3268 = 1280;
            this.field3247 = 3;
            this.field3259 = 4096;
            this.field3276 = 768;
        } else if (var3 == 8) {
            this.field3268 = 1024;
            this.field3276 = 1024;
            this.field3259 = 2048;
            this.field3247 = 3;
        } else if (var3 == 9) {
            this.field3276 = 1024;
            this.field3259 = 4096;
            this.field3268 = 1024;
            this.field3247 = 3;
        } else if (var3 == 14) {
            this.field3259 = 2048;
            this.field3268 = 1280;
            this.field3276 = 768;
            this.field3247 = 1;
        } else if (var3 == 15) {
            this.field3276 = 512;
            this.field3247 = 1;
            this.field3268 = 1536;
            this.field3259 = 4096;
        } else if (var3 == 16) {
            this.field3268 = 1792;
            this.field3247 = 1;
            this.field3259 = 8192;
            this.field3276 = 256;
        } else {
            this.field3247 = 0;
            this.field3268 = 0;
            this.field3276 = 2048;
            this.field3259 = 2048;
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IB)V", line = 229)
    public static final void method1295(int arg0, byte arg1) {
        field3273++;
        if (class325.field5482 == arg0) {
            return;
        }
        if (class325.field5482 == 0) {
            class18.method175(arg1 - 33);
        }
        if (arg0 == 40) {
            class327.method2198(-3);
        }
        boolean var2 = arg0 == 5 || arg0 == 10 || arg0 == 28;
        if (arg0 != 40 && class137.field2382 != null) {
            class137.field2382.method1433((byte) -115);
            class137.field2382 = null;
        }
        if (arg0 == 25 || arg0 == 28) {
            class151.field2613 = 0;
            class214.field3686 = 0;
            class33.field636 = 1;
            class221.field3781 = 0;
            class157.field2691 = 1;
            class225.method1548(true, (byte) -20);
        }
        if (arg0 == 25 || arg0 == 10) {
            class226.method1570(arg1 ^ 0x54);
        }
        if (arg0 == 5) {
            class203.method1423(23823, class269.field4616);
        } else {
            class280.method1961((byte) -80);
        }
        if (arg1 != 84) {
            return;
        }
        boolean var3 = class325.field5482 == 5 || class325.field5482 == 10 || class325.field5482 == 28;
        if (var2 != var3) {
            if (var2) {
                class232.field4020 = class296.field5061;
                if (class27.field487 == 0) {
                    class151.method1025(2, (byte) 59);
                } else {
                    class82.method578(true, class296.field5061, 0, class259.field4506, 255, false, 2);
                }
                class102.field1773.method1558(false, -46);
            } else {
                class151.method1025(2, (byte) 59);
                class102.field1773.method1558(true, -21);
            }
        }
        if (class108.field1900 && (arg0 == 25 || arg0 == 28 || arg0 == 40)) {
            class108.method749();
        }
        class325.field5482 = arg0;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(ZII)V", line = 309)
    public final void method1296(boolean arg0, int arg1, int arg2) {
        field3262++;
        int var4 = this.field3259 * arg2 / 50 + this.field3250 & 0x7FF;
        int var5 = this.field3247;
        int var6;
        if (var5 == 1) {
            var6 = (class227.field3896[var4] >> 6) + 1024;
        } else if (var5 == 3) {
            var6 = class147.field2547[var4] >> 1;
        } else if (var5 == 4) {
            var6 = var4 >> 10 << 11;
        } else if (var5 == 2) {
            var6 = var4;
        } else if (var5 == 5) {
            var6 = (var4 < 1024 ? var4 : 2048 - var4) << 1;
        } else {
            var6 = 2048;
        }
        if (arg0) {
            var6 = 2048;
        }
        this.field3274 = (float) ((this.field3276 * var6 >> 11) + this.field3268) / 2048.0F;
        float var7 = this.field3274 / 255.0F;
        if (arg1 > 31) {
            this.field3256[2] = var7 * (float) class305.method2086(255, this.field3258);
            this.field3256[0] = (float) (class305.method2086(16750062, this.field3258) >> 16) * var7;
            this.field3256[1] = var7 * (float) (class305.method2086(this.field3258, 65496) >> 8);
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Lek;III)Lsm;", line = 392)
    public static final class159 method1297(class185 arg0, int arg1, int arg2, int arg3) {
        field3265++;
        if (class208.method1444(arg1, -28236, arg3, arg0)) {
            int var4 = 4 % ((arg2 + 33) / 40);
            return class16.method164(3362);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Z)V", line = 414)
    public static final void method1298(boolean arg0) {
        field3261++;
        if (!arg0) {
            method1301(50, (class185) null);
        }
        class277.field4760.method226((byte) -116);
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(I)V", line = 426)
    private final void method1299(int arg0) {
        field3249++;
        int var2 = (this.field3263 << 7) + 64;
        this.field3277 = 1.0F / (float) (var2 * var2);
        if (arg0 != -17218) {
            this.field3251 = (short[]) null;
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(II)V", line = 443)
    public static final void method1300(int arg0, int arg1) {
        class308.field5196.method231((byte) 113, arg1);
        class235.field4056.method231((byte) 113, arg1);
        if (arg0 != 1) {
            method1298(false);
        }
        field3270++;
    }

    @OriginalMember(owner = "client!db", name = "<init>", descriptor = "()V", line = 602)
    protected class186() {
        if (class147.field2547 == null) {
            class71.method527(4);
        }
        this.method1294((byte) 87);
    }

    @OriginalMember(owner = "client!db", name = "<init>", descriptor = "(Lkh;)V", line = 613)
    public class186(class14 arg0) {
        if (class147.field2547 == null) {
            class71.method527(4);
        }
        this.field3264 = arg0.method93(false);
        this.field3245 = (this.field3264 & 0x8) != 0;
        this.field3272 = (this.field3264 & 0x10) != 0;
        this.field3264 &= 0x7;
        this.field3266 = arg0.method116(-1);
        this.field3253 = arg0.method116(-1);
        this.field3254 = arg0.method116(-1);
        this.field3263 = arg0.method93(false);
        this.method1299(-17218);
        this.field3251 = new short[this.field3263 * 2 + 1];
        for (int var2 = 0; var2 < this.field3251.length; var2++) {
            this.field3251[var2] = (short) arg0.method116(-1);
        }
        this.field3258 = class227.field3907[arg0.method116(-1)];
        int var3 = arg0.method93(false);
        this.field3260 = var3 & 0x1F;
        this.field3250 = (var3 & 0xE0) << 3;
        this.method1294((byte) -91);
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(ILek;)V", line = 472)
    public static final void method1301(int arg0, class185 arg1) {
        class320.field5416 = class328.method2232(arg1, class284.field4883, 8899, 0);
        field3248++;
        class147.field2548 = new class248[class320.field5416.length];
        class83.field1597 = new class248[class320.field5416.length];
        class232.field4034 = new class248[class320.field5416.length];
        for (int var2 = 0; var2 < class320.field5416.length; var2++) {
            class320.field5416[var2].method1792();
            class147.field2548[var2] = class320.field5416[var2].method1788();
            class320.field5416[var2].method1792();
            class83.field1597[var2] = class320.field5416[var2].method1788();
            class320.field5416[var2].method1792();
            class232.field4034[var2] = class320.field5416[var2].method1788();
            class320.field5416[var2].method1792();
        }
        class104.field1797 = class63.method471(class202.field3535, 1, arg1, 0);
        class319.field5405 = class238.method1703(-1, 0, class295.field5044, arg1);
        class15.field220 = class238.method1703(arg0 ^ 0xFFFFFFEB, 0, class68.field1305, arg1);
        class19.field293 = class238.method1703(arg0 ^ 0xFFFFFFEB, 0, class78.field1441, arg1);
        class217.field3734 = class238.method1703(arg0 ^ 0xFFFFFFEB, 0, class215.field3693, arg1);
        class84.field1612 = class311.method2106(class226.field3869, 0, arg1, -128);
        class144.field2502 = class311.method2106(class115.field2082, 0, arg1, -128);
        class124.field2182 = class80.method566(class258.field4502, -9594, arg1, 0);
        class83.field1600 = class311.method2106(class16.field267, 0, arg1, -128);
        class323.field5450 = class311.method2106(class246.field4371, 0, arg1, -128);
        class97.field1716 = class302.method2072(class90.field1643, 0, true, arg1);
        class305.field5169 = class302.method2072(class288.field4931, 0, true, arg1);
        class211.field3636.method940(class305.field5169, (int[]) null);
        class249.field4385.method940(class305.field5169, (int[]) null);
        class44.field796.method940(class305.field5169, (int[]) null);
        if (class108.field1900) {
            class139.field2435 = class328.method2232(arg1, class241.field4257, 8899, 0);
            for (int var3 = 0; var3 < class139.field2435.length; var3++) {
                class139.field2435[var3].method1786();
            }
        }
        class159 var4 = method1297(arg1, 0, -78, class105.field1819);
        var4.method1070();
        if (class108.field1900) {
            class146.field2543 = new class326(var4);
        } else {
            class146.field2543 = var4;
        }
        class159[] var5 = class63.method471(class152.field2633, arg0 ^ 0x15, arg1, 0);
        for (int var6 = 0; var6 < var5.length; var6++) {
            var5[var6].method1070();
        }
        if (class108.field1900) {
            class152.field2625 = new class35[var5.length];
            for (int var7 = 0; var7 < var5.length; var7++) {
                class152.field2625[var7] = new class326(var5[var7]);
            }
        } else {
            class152.field2625 = var5;
        }
        int var8 = (int) (Math.random() * 21.0D) - 10;
        int var9 = (int) (Math.random() * 21.0D) - 10;
        int var10 = (int) (Math.random() * 21.0D) - 10;
        int var11 = (int) (Math.random() * 41.0D) - arg0;
        for (int var12 = 0; var12 < class104.field1797.length; var12++) {
            class104.field1797[var12].method1067(var8 + var11, var9 + var11, var10 + var11);
        }
        class320.field5416[0].method1789(var8 + var11, var9 - -var11, var10 + var11);
        if (class108.field1900) {
            class76.field1422 = new class35[class104.field1797.length];
            for (int var13 = 0; var13 < class104.field1797.length; var13++) {
                class76.field1422[var13] = new class326(class104.field1797[var13]);
            }
        } else {
            class76.field1422 = class104.field1797;
        }
    }
}
