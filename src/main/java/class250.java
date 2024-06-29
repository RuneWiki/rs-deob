import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tq")
public class class250 extends class398 {

    @OriginalMember(owner = "client!tq", name = "J", descriptor = "I")
    private int field3424 = 81;

    @OriginalMember(owner = "client!tq", name = "K", descriptor = "I")
    private int field3425 = 409;

    @OriginalMember(owner = "client!tq", name = "N", descriptor = "I")
    private int field3428 = 1024;

    @OriginalMember(owner = "client!tq", name = "Q", descriptor = "I")
    private int field3431 = 1024;

    @OriginalMember(owner = "client!tq", name = "P", descriptor = "I")
    private int field3430 = 4;

    @OriginalMember(owner = "client!tq", name = "L", descriptor = "I")
    private int field3426 = 204;

    @OriginalMember(owner = "client!tq", name = "W", descriptor = "I")
    private int field3437 = 0;

    @OriginalMember(owner = "client!tq", name = "hb", descriptor = "I")
    private int field3448 = 8;

    @OriginalMember(owner = "client!tq", name = "U", descriptor = "Lcr;")
    public static class189 field3435 = new class189(64);

    @OriginalMember(owner = "client!tq", name = "eb", descriptor = "I")
    public static int field3445 = 0;

    @OriginalMember(owner = "client!tq", name = "O", descriptor = "I")
    private int field3429;

    @OriginalMember(owner = "client!tq", name = "R", descriptor = "I")
    public static int field3432;

    @OriginalMember(owner = "client!tq", name = "S", descriptor = "I")
    public static int field3433;

    @OriginalMember(owner = "client!tq", name = "T", descriptor = "I")
    public static int field3434;

    @OriginalMember(owner = "client!tq", name = "Y", descriptor = "I")
    private int field3439;

    @OriginalMember(owner = "client!tq", name = "Z", descriptor = "I")
    public static int field3440;

    @OriginalMember(owner = "client!tq", name = "ab", descriptor = "I")
    public static int field3441;

    @OriginalMember(owner = "client!tq", name = "bb", descriptor = "I")
    private int field3442;

    @OriginalMember(owner = "client!tq", name = "cb", descriptor = "I")
    public static int field3443;

    @OriginalMember(owner = "client!tq", name = "db", descriptor = "I")
    public static int field3444;

    @OriginalMember(owner = "client!tq", name = "fb", descriptor = "I")
    public static int field3446;

    @OriginalMember(owner = "client!tq", name = "gb", descriptor = "I")
    public static int field3447;

    @OriginalMember(owner = "client!tq", name = "M", descriptor = "[I")
    private int[] field3427;

    @OriginalMember(owner = "client!tq", name = "V", descriptor = "[[I")
    private int[][] field3436;

    @OriginalMember(owner = "client!tq", name = "X", descriptor = "[[I")
    private int[][] field3438;

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(Lnj;II)V")
    public final void method208(class228 arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (~arg1 != -3) {
                    if (~arg1 != -4) {
                        if (~arg1 != -5) {
                            if (arg1 != 5) {
                                if (~arg1 != -7) {
                                    if (arg1 == 7) {
                                        this.field3428 = arg0.method1343(arg2 + 13387);
                                    }
                                } else {
                                    this.field3424 = arg0.method1343(arg2 ^ -13237);
                                }
                            } else {
                                this.field3437 = arg0.method1343(255);
                            }
                        } else {
                            this.field3431 = arg0.method1343(255);
                        }
                    } else {
                        this.field3426 = arg0.method1343(255);
                    }
                } else {
                    this.field3425 = arg0.method1343(255);
                }
            } else {
                this.field3448 = arg0.method1348(-92);
            }
        } else {
            this.field3430 = arg0.method1348(-115);
        }
        if (arg2 != -13132) {
            this.field3442 = 118;
        }
        ++field3444;
    }

    @OriginalMember(owner = "client!tq", name = "f", descriptor = "(I)V")
    private final void method1514(int arg0) {
        ++field3433;
        Random var2 = new Random((long) this.field3448);
        this.field3429 = 4096 / this.field3430;
        this.field3439 = 4096 / this.field3448;
        this.field3442 = this.field3424 / 2;
        int var3 = this.field3429 / 2;
        this.field3427 = new int[this.field3448 + 1];
        this.field3438 = new int[this.field3448][this.field3430];
        this.field3436 = new int[this.field3448][this.field3430 + 1];
        int var4 = this.field3439 / 2;
        this.field3427[0] = 0;
        int var5 = 78 / ((11 - arg0) / 37);
        for (int var6 = 0; var6 < this.field3448; ++var6) {
            if (~var6 < -1) {
                int var7 = this.field3439;
                int var8 = (-2048 + class139.method895(-19416, var2, 4096)) * this.field3426 >> 12;
                int var9 = (var4 * var8 >> 12) + var7;
                this.field3427[var6] = this.field3427[var6 + -1] + var9;
            }
            this.field3436[var6][0] = 0;
            for (int var10 = 0; this.field3430 > var10; ++var10) {
                if (~var10 < -1) {
                    int var11 = this.field3429;
                    int var12 = (class139.method895(-19416, var2, 4096) - 2048) * this.field3425 >> 12;
                    int var13 = (var3 * var12 >> 12) + var11;
                    this.field3436[var6][var10] = this.field3436[var6][var10 + -1] + var13;
                }
                this.field3438[var6][var10] = ~this.field3428 >= -1 ? 4096 : 4096 + -class139.method895(-19416, var2, this.field3428);
            }
            this.field3436[var6][this.field3430] = 4096;
        }
        this.field3427[this.field3448] = 4096;
    }

    @OriginalMember(owner = "client!tq", name = "c", descriptor = "(I)V")
    public final void method209(int arg0) {
        this.method1514(arg0 + 87);
        if (arg0 != 16) {
            this.field3439 = -32;
        }
        ++field3447;
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(BI)I")
    public static final int method1515(byte arg0, int arg1) {
        if (arg0 <= 43) {
            method1517((class228) null, (byte) -16);
        }
        ++field3446;
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!tq", name = "c", descriptor = "(B)V")
    public static void method1516(byte arg0) {
        field3435 = null;
        if (arg0 > -9) {
            method1515((byte) 24, 45);
        }
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(Lnj;B)Ljava/lang/String;")
    public static final String method1517(class228 arg0, byte arg1) {
        ++field3432;
        return arg1 <= 43 ? null : class156.method966(arg0, false, 32767);
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(IIILps;)V")
    public static final void method1518(int arg0, int arg1, int arg2, class394 arg3) {
        ++field3443;
        class2 var4 = arg3.method2525((byte) 42, class61.field807);
        if (var4 != null) {
            class61.field807.method1767(arg1, arg2, arg3.field5773 + arg1, arg3.field5672 + arg2);
            if (arg0 == -28215) {
                if (class351.field5090 >= 3) {
                    class61.field807.method1784(-16777216, var4, arg1, arg2);
                } else {
                    class283.field4117.method451((float) arg3.field5773 / 2.0F + (float) arg1, (float) arg3.field5672 / 2.0F + (float) arg2, 4096, 65532 & (int) (-class396.field5847) << 2, var4, arg1, arg2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!tq", name = "g", descriptor = "(I)V")
    public static final void method1519(int arg0) {
        ++field3440;
        if (class188.field2532 == 5) {
            class188.field2532 = 6;
            if (arg0 > -41) {
                method1519(-77);
            }
        }
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(II)[I")
    public final int[] method95(int arg0, int arg1) {
        ++field3434;
        int[] var3 = super.field5927.method305(arg0, (byte) 80);
        if (arg1 != 0) {
            method1519(93);
        }
        if (super.field5927.field591) {
            int var4 = 0;
            int var5;
            for (var5 = class84.field1206[arg0] + this.field3437; ~var5 > -1; var5 += 4096) {
            }
            while (~var5 < -4097) {
                var5 -= 4096;
            }
            while (this.field3448 > var4 && var5 >= this.field3427[var4]) {
                ++var4;
            }
            int var6 = var4 - 1;
            boolean var7 = ~(1 & var4) == -1;
            int var8 = this.field3427[var4];
            int var9 = this.field3427[var4 + -1];
            if (var5 > this.field3442 + var9 && var5 < -this.field3442 + var8) {
                for (int var10 = 0; class140.field1922 > var10; ++var10) {
                    int var11 = 0;
                    int var12 = !var7 ? -this.field3431 : this.field3431;
                    int var13;
                    for (var13 = (this.field3429 * var12 >> 12) + class375.field5448[var10]; ~var13 > -1; var13 += 4096) {
                    }
                    while (~var13 < -4097) {
                        var13 -= 4096;
                    }
                    while (~this.field3430 < ~var11 && ~var13 <= ~this.field3436[var6][var11]) {
                        ++var11;
                    }
                    int var14 = var11 + -1;
                    int var15 = this.field3436[var6][var11];
                    int var16 = this.field3436[var6][var14];
                    if (var13 > this.field3442 + var16 && -this.field3442 + var15 > var13) {
                        var3[var10] = this.field3438[var6][var14];
                    } else {
                        var3[var10] = 0;
                    }
                }
            } else {
                class60.method420(var3, 0, class140.field1922, 0);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(IIII)V")
    public static final void method1520(int arg0, int arg1, int arg2, int arg3) {
        class254 var4 = class213.field2852[arg0][arg1][arg2];
        if (var4 != null) {
            class299 var5 = var4.field3519;
            class299 var6 = var4.field3502;
            if (var5 != null) {
                var5.field4383 = var5.field4383 * arg3 / 16;
                var5.field4381 = var5.field4381 * arg3 / 16;
            }
            if (var6 != null) {
                var6.field4383 = var6.field4383 * arg3 / 16;
                var6.field4381 = var6.field4381 * arg3 / 16;
            }
        }
    }

    @OriginalMember(owner = "client!tq", name = "<init>", descriptor = "()V")
    public class250() {
        super(0, true);
    }
}
