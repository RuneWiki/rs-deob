import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public class class369 extends class115 {

    @OriginalMember(owner = "client!of", name = "P", descriptor = "I")
    private int field5401 = 0;

    @OriginalMember(owner = "client!of", name = "S", descriptor = "I")
    private int field5404 = 0;

    @OriginalMember(owner = "client!of", name = "Z", descriptor = "I")
    private int field5411 = 0;

    @OriginalMember(owner = "client!of", name = "W", descriptor = "Lfi;")
    public static class331 field5408 = new class331(64);

    @OriginalMember(owner = "client!of", name = "bb", descriptor = "S")
    public static short field5413 = 32767;

    @OriginalMember(owner = "client!of", name = "Y", descriptor = "Lqc;")
    public static class442 field5410 = new class442(8);

    @OriginalMember(owner = "client!of", name = "cb", descriptor = "I")
    public static int field5414 = 0;

    @OriginalMember(owner = "client!of", name = "db", descriptor = "Z")
    public static boolean field5415 = false;

    @OriginalMember(owner = "client!of", name = "eb", descriptor = "Ljava/lang/String;")
    public static String field5416 = "Loaded config";

    @OriginalMember(owner = "client!of", name = "J", descriptor = "I")
    private int field5395;

    @OriginalMember(owner = "client!of", name = "K", descriptor = "I")
    public static int field5396;

    @OriginalMember(owner = "client!of", name = "L", descriptor = "I")
    public static int field5397;

    @OriginalMember(owner = "client!of", name = "M", descriptor = "I")
    private int field5398;

    @OriginalMember(owner = "client!of", name = "N", descriptor = "I")
    private int field5399;

    @OriginalMember(owner = "client!of", name = "O", descriptor = "I")
    private int field5400;

    @OriginalMember(owner = "client!of", name = "Q", descriptor = "I")
    public static int field5402;

    @OriginalMember(owner = "client!of", name = "R", descriptor = "I")
    public static int field5403;

    @OriginalMember(owner = "client!of", name = "T", descriptor = "I")
    public static int field5405;

    @OriginalMember(owner = "client!of", name = "U", descriptor = "I")
    public static int field5406;

    @OriginalMember(owner = "client!of", name = "V", descriptor = "I")
    private int field5407;

    @OriginalMember(owner = "client!of", name = "X", descriptor = "I")
    private int field5409;

    @OriginalMember(owner = "client!of", name = "ab", descriptor = "I")
    public static int field5412;

    @OriginalMember(owner = "client!of", name = "fb", descriptor = "[I")
    public static int[] field5417;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(BLbk;I)V", line = 3)
    public final void method149(byte arg0, class211 arg1, int arg2) {
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (~arg2 == -3) {
                    this.field5401 = (arg1.method1373((byte) 30) << 12) / 100;
                }
            } else {
                this.field5411 = (arg1.method1373((byte) 30) << 12) / 100;
            }
        } else {
            this.field5404 = arg1.method1344((byte) -4);
        }
        if (arg0 < 83) {
            method2327(74);
        }
        ++field5397;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(JI)V", line = 47)
    public static final void method2325(long arg0, int arg1) {
        ++field5405;
        class169.field2360.field2888 = 0;
        class169.field2360.method1396(21375, 21);
        class169.field2360.method1381(1024975824, arg0);
        class10.field120 = arg1;
        class430.field6238 = -3;
        class392.field5734 = 1;
        class75.field841 = 0;
    }

    @OriginalMember(owner = "client!of", name = "b", descriptor = "(BIII)V", line = 61)
    private final void method2326(byte arg0, int arg1, int arg2, int arg3) {
        ++field5403;
        if (arg0 <= -45) {
            int var5 = ~arg3 >= -2049 ? (arg2 + 4096) * arg3 >> 12 : arg2 + arg3 + -(arg2 * arg3 >> 12);
            if (~var5 >= -1) {
                this.field5400 = this.field5399 = this.field5409 = arg3;
            } else {
                int var6 = arg1 * 6;
                int var7 = -var5 + arg3 - -arg3;
                int var8 = (-var7 + var5 << 12) / var5;
                int var9 = var6 >> 12;
                int var10 = -(var9 << 12) + var6;
                int var12 = var8 * var5 >> 12;
                int var13 = var10 * var12 >> 12;
                int var14 = var7 + var13;
                int var15 = -var13 + var5;
                if (var9 != 0) {
                    if (~var9 != -2) {
                        if (var9 != 2) {
                            if (~var9 != -4) {
                                if (var9 != 4) {
                                    if (~var9 == -6) {
                                        this.field5399 = var7;
                                        this.field5400 = var5;
                                        this.field5409 = var15;
                                    }
                                } else {
                                    this.field5399 = var7;
                                    this.field5409 = var5;
                                    this.field5400 = var14;
                                }
                            } else {
                                this.field5400 = var7;
                                this.field5399 = var15;
                                this.field5409 = var5;
                            }
                        } else {
                            this.field5400 = var7;
                            this.field5399 = var5;
                            this.field5409 = var14;
                        }
                    } else {
                        this.field5399 = var5;
                        this.field5409 = var7;
                        this.field5400 = var15;
                    }
                } else {
                    this.field5409 = var7;
                    this.field5400 = var5;
                    this.field5399 = var14;
                }
            }
        }
    }

    @OriginalMember(owner = "client!of", name = "h", descriptor = "(I)V", line = 168)
    public static final void method2327(int arg0) {
        if (class105.field1191 != 10 && class105.field1191 != 28) {
            class388.method2479(5000, (byte) 122, class390.field5715.field6350[0] >> 3, class390.field5715.field6351[0] >> 3);
        } else {
            class388.method2479(5000, (byte) 113, class272.field3852 >> 10, class272.field3853 >> 10);
        }
        ++field5402;
        class139.method829((byte) 47);
        class437.method2718((byte) -128);
        class42.method260(arg0);
        class189.method1211(false);
    }

    @OriginalMember(owner = "client!of", name = "e", descriptor = "(B)V", line = 184)
    public static final void method2328(byte arg0) {
        if (arg0 > -50) {
            method2329(-70, 8, -24, (class276) null);
        }
        class224.field3054 = new class119[class172.field2401.method358((byte) -111)][];
        ++field5412;
        class45.field542 = new boolean[class172.field2401.method358((byte) -111)];
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(IIILka;)V", line = 208)
    public static final void method2329(int arg0, int arg1, int arg2, class276 arg3) {
        if (class19.field202[arg0][arg1][arg2] == null) {
            class252.method1578(arg0, arg1, arg2);
        }
        class19.field202[arg0][arg1][arg2].field4310 = arg3;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(IIII)V", line = 217)
    private final void method2330(int arg0, int arg1, int arg2, int arg3) {
        ++field5396;
        int var5 = ~arg2 > ~arg0 ? arg0 : arg2;
        int var6 = var5 >= arg1 ? var5 : arg1;
        int var7 = arg0 < arg2 ? arg0 : arg2;
        int var8 = ~arg1 <= ~var7 ? var7 : arg1;
        if (arg3 != 20480) {
            this.method149((byte) 36, (class211) null, -110);
        }
        int var9 = -var8 + var6;
        this.field5395 = (var6 + var8) / 2;
        if (~var9 < -1) {
            int var10 = (-arg0 + var6 << 12) / var9;
            int var11 = (-arg2 + var6 << 12) / var9;
            int var12 = (-arg1 + var6 << 12) / var9;
            if (arg0 != var6) {
                if (~arg2 == ~var6) {
                    this.field5407 = ~arg1 != ~var8 ? -var12 + 12288 : 4096 - -var10;
                } else {
                    this.field5407 = ~arg0 != ~var8 ? -var10 + 20480 : 12288 - -var11;
                }
            } else {
                this.field5407 = arg2 != var8 ? -var11 + 4096 : var12 + 20480;
            }
            this.field5407 /= 6;
        } else {
            this.field5407 = 0;
        }
        if (this.field5395 > 0 && ~this.field5395 > -4097) {
            this.field5398 = (var9 << 12) / (~this.field5395 >= -2049 ? this.field5395 * 2 : -(this.field5395 * 2) + 8192);
        } else {
            this.field5398 = 0;
        }
    }

    @OriginalMember(owner = "client!of", name = "<init>", descriptor = "()V", line = 272)
    public class369() {
        super(1, false);
    }

    @OriginalMember(owner = "client!of", name = "i", descriptor = "(I)V", line = 275)
    public static void method2331(int arg0) {
        field5410 = null;
        if (arg0 != -3) {
            field5413 = 24;
        }
        field5417 = null;
        field5408 = null;
        field5416 = null;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(II)[[I", line = 293)
    public final int[][] method144(int arg0, int arg1) {
        ++field5406;
        int var3 = -55 / ((arg1 - -80) / 45);
        int[][] var4 = super.field1342.method2530(arg0, (byte) 94);
        if (super.field1342.field5819) {
            int[][] var5 = this.method639((byte) 34, arg0, 0);
            int[] var6 = var5[0];
            int[] var7 = var5[1];
            int[] var8 = var5[2];
            int[] var9 = var4[0];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            for (int var12 = 0; ~var12 > ~class218.field2979; ++var12) {
                this.method2330(var6[var12], var8[var12], var7[var12], 20480);
                this.field5407 += this.field5404;
                this.field5398 += this.field5411;
                this.field5395 += this.field5401;
                while (~this.field5407 > -1) {
                    this.field5407 += 4096;
                }
                while (this.field5407 > 4096) {
                    this.field5407 -= 4096;
                }
                if (this.field5398 < 0) {
                    this.field5398 = 0;
                }
                if (this.field5398 > 4096) {
                    this.field5398 = 4096;
                }
                if (~this.field5395 > -1) {
                    this.field5395 = 0;
                }
                if (~this.field5395 < -4097) {
                    this.field5395 = 4096;
                }
                this.method2326((byte) -56, this.field5407, this.field5398, this.field5395);
                var9[var12] = this.field5400;
                var10[var12] = this.field5399;
                var11[var12] = this.field5409;
            }
        }
        return var4;
    }
}
