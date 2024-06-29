import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public class class177 extends class112 {

    @OriginalMember(owner = "client!t", name = "q", descriptor = "[J")
    private long[] field3383 = new long[10];

    @OriginalMember(owner = "client!t", name = "f", descriptor = "I")
    private int field3372 = 256;

    @OriginalMember(owner = "client!t", name = "s", descriptor = "I")
    private int field3385 = 0;

    @OriginalMember(owner = "client!t", name = "t", descriptor = "I")
    private int field3386 = 1;

    @OriginalMember(owner = "client!t", name = "g", descriptor = "J")
    private long field3373 = class24.method165(128);

    @OriginalMember(owner = "client!t", name = "m", descriptor = "I")
    public static int field3379 = 0;

    @OriginalMember(owner = "client!t", name = "p", descriptor = "[Luh;")
    public static class194[] field3382 = new class194[500];

    @OriginalMember(owner = "client!t", name = "r", descriptor = "Ltg;")
    public static class184 field3384 = class135.method812(":duelstake:", 3);

    @OriginalMember(owner = "client!t", name = "h", descriptor = "I")
    public static int field3374;

    @OriginalMember(owner = "client!t", name = "i", descriptor = "I")
    public static int field3375;

    @OriginalMember(owner = "client!t", name = "j", descriptor = "I")
    private int field3376;

    @OriginalMember(owner = "client!t", name = "k", descriptor = "I")
    public static int field3377;

    @OriginalMember(owner = "client!t", name = "l", descriptor = "I")
    public static int field3378;

    @OriginalMember(owner = "client!t", name = "n", descriptor = "I")
    public static int field3380;

    @OriginalMember(owner = "client!t", name = "o", descriptor = "I")
    public static int field3381;

    @OriginalMember(owner = "client!t", name = "u", descriptor = "[I")
    public static int[] field3387;

    @OriginalMember(owner = "client!t", name = "b", descriptor = "(B)V")
    public final void method451(byte arg0) {
        field3375++;
        if (arg0 != -59) {
            this.field3373 = 59L;
        }
        for (int var2 = 0; var2 < 10; var2++) {
            this.field3383[var2] = 0L;
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(I)V")
    public static final void method1084(int arg0) {
        class170.field3227.method770(false);
        field3378++;
        if (arg0 >= -79) {
            method1084(75);
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(BII)I")
    public final int method452(byte arg0, int arg1, int arg2) {
        field3377++;
        int var4 = this.field3372;
        int var5 = this.field3386;
        this.field3386 = 1;
        this.field3372 = 300;
        this.field3373 = class24.method165(arg0 ^ 0xA6);
        if (this.field3383[this.field3376] == 0L) {
            this.field3386 = var5;
            this.field3372 = var4;
        } else if (this.field3383[this.field3376] < this.field3373) {
            this.field3372 = (int) ((long) (arg1 * 2560) / (this.field3373 - this.field3383[this.field3376]));
        }
        if (this.field3372 < 25) {
            this.field3372 = 25;
        }
        if (this.field3372 > 256) {
            this.field3372 = 256;
            this.field3386 = (int) ((long) arg1 - (this.field3373 - this.field3383[this.field3376]) / 10L);
        }
        if (this.field3386 > arg1) {
            this.field3386 = arg1;
        }
        this.field3383[this.field3376] = this.field3373;
        this.field3376 = (this.field3376 + 1) % 10;
        if (this.field3386 > 1) {
            for (int var6 = 0; var6 < 10; var6++) {
                if (this.field3383[var6] != 0L) {
                    this.field3383[var6] += this.field3386;
                }
            }
        }
        if (arg2 > this.field3386) {
            this.field3386 = arg2;
        }
        class151.method926((byte) 101, (long) this.field3386);
        int var7 = 0;
        if (arg0 != 38) {
            field3379 = 52;
        }
        while (this.field3385 < 256) {
            this.field3385 += this.field3372;
            var7++;
        }
        this.field3385 &= 0xFF;
        return var7;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IBIII)V")
    public static final void method1085(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        field3374++;
        if (arg1 != 106) {
            field3379 = -60;
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(ILrh;B)I")
    public static final int method1086(int arg0, class167 arg1, byte arg2) {
        field3381++;
        if (arg1.field3102 == null || arg0 >= arg1.field3102.length) {
            return -2;
        }
        try {
            int var3 = 0;
            int[] var4 = arg1.field3102[arg0];
            if (arg2 != 17) {
                return -12;
            }
            byte var5 = 0;
            int var6 = 0;
            while (true) {
                int var7 = var4[var6++];
                int var8 = 0;
                byte var9 = 0;
                if (var7 == 0) {
                    return var3;
                }
                if (var7 == 1) {
                    var8 = class79.field1437[var4[var6++]];
                }
                if (var7 == 15) {
                    var9 = 1;
                }
                if (var7 == 16) {
                    var9 = 2;
                }
                if (var7 == 2) {
                    var8 = class16.field304[var4[var6++]];
                }
                if (var7 == 3) {
                    var8 = class128.field2312[var4[var6++]];
                }
                if (var7 == 17) {
                    var9 = 3;
                }
                if (var7 == 4) {
                    int var10 = var4[var6++] << 16;
                    int var11 = var10 + var4[var6++];
                    class167 var12 = class44.method255(var11, arg2 ^ 0x2946);
                    int var13 = var4[var6++];
                    if (var13 != -1 && (!class60.method336(var13, arg2 ^ 0x1B).field2190 || class47.field882)) {
                        for (int var14 = 0; var14 < var12.field3130.length; var14++) {
                            if (var13 + 1 == var12.field3130[var14]) {
                                var8 += var12.field3056[var14];
                            }
                        }
                    }
                }
                if (var7 == 5) {
                    var8 = class94.field1710[var4[var6++]];
                }
                if (var7 == 6) {
                    var8 = class129.field2336[class16.field304[var4[var6++]] - 1];
                }
                if (var7 == 7) {
                    var8 = class94.field1710[var4[var6++]] * 100 / 46875;
                }
                if (var7 == 8) {
                    var8 = class46.field872.field1282;
                }
                if (var7 == 9) {
                    for (int var15 = 0; var15 < 25; var15++) {
                        if (class57.field1000[var15]) {
                            var8 += class16.field304[var15];
                        }
                    }
                }
                if (var7 == 10) {
                    int var16 = var4[var6++] << 16;
                    int var17 = var16 + var4[var6++];
                    class167 var18 = class44.method255(var17, 10583);
                    int var19 = var4[var6++];
                    if (var19 != -1 && (!class60.method336(var19, 10).field2190 || class47.field882)) {
                        for (int var20 = 0; var20 < var18.field3130.length; var20++) {
                            if (var19 + 1 == var18.field3130[var20]) {
                                var8 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var7 == 11) {
                    var8 = class191.field3723;
                }
                if (var7 == 12) {
                    var8 = class135.field2455;
                }
                if (var7 == 13) {
                    int var21 = class94.field1710[var4[var6++]];
                    int var22 = var4[var6++];
                    var8 = (var21 & 0x1 << var22) == 0 ? 0 : 1;
                }
                if (var7 == 14) {
                    int var23 = var4[var6++];
                    var8 = class116.method710(0, var23);
                }
                if (var7 == 18) {
                    var8 = (class46.field872.field635 >> 7) + class57.field1020;
                }
                if (var7 == 19) {
                    var8 = (class46.field872.field614 >> 7) + class129.field2331;
                }
                if (var7 == 20) {
                    var8 = var4[var6++];
                }
                if (var9 == 0) {
                    if (var5 == 0) {
                        var3 += var8;
                    }
                    if (var5 == 1) {
                        var3 -= var8;
                    }
                    if (var5 == 2 && var8 != 0) {
                        var3 /= var8;
                    }
                    if (var5 == 3) {
                        var3 *= var8;
                    }
                    var5 = 0;
                } else {
                    var5 = var9;
                }
            }
        } catch (Exception var24) {
            return -1;
        }
    }

    @OriginalMember(owner = "client!t", name = "<init>", descriptor = "()V")
    public class177() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field3383[var1] = this.field3373;
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Z)V")
    public static void method1087(boolean arg0) {
        field3382 = null;
        field3384 = null;
        if (arg0) {
            method1086(-1, null, (byte) -41);
        }
        field3387 = null;
    }
}
