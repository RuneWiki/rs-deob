import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lp")
public class class206 extends class478 {

    @OriginalMember(owner = "client!lp", name = "I", descriptor = "I")
    private int field2439 = 1024;

    @OriginalMember(owner = "client!lp", name = "H", descriptor = "I")
    private int field2438 = 4;

    @OriginalMember(owner = "client!lp", name = "E", descriptor = "I")
    private int field2435 = 8;

    @OriginalMember(owner = "client!lp", name = "K", descriptor = "I")
    private int field2441 = 409;

    @OriginalMember(owner = "client!lp", name = "L", descriptor = "I")
    private int field2442 = 0;

    @OriginalMember(owner = "client!lp", name = "O", descriptor = "I")
    private int field2445 = 204;

    @OriginalMember(owner = "client!lp", name = "R", descriptor = "I")
    private int field2448 = 1024;

    @OriginalMember(owner = "client!lp", name = "V", descriptor = "I")
    private int field2452 = 81;

    @OriginalMember(owner = "client!lp", name = "S", descriptor = "[I")
    public static int[] field2449 = new int[32];

    @OriginalMember(owner = "client!lp", name = "Q", descriptor = "Lcq;")
    public static class110 field2447 = new class110(79, 12);

    @OriginalMember(owner = "client!lp", name = "Y", descriptor = "[[I")
    public static int[][] field2455 = new int[6][];

    @OriginalMember(owner = "client!lp", name = "B", descriptor = "I")
    private int field2433;

    @OriginalMember(owner = "client!lp", name = "D", descriptor = "I")
    public static int field2434;

    @OriginalMember(owner = "client!lp", name = "G", descriptor = "I")
    public static int field2437;

    @OriginalMember(owner = "client!lp", name = "J", descriptor = "I")
    private int field2440;

    @OriginalMember(owner = "client!lp", name = "N", descriptor = "I")
    public static int field2444;

    @OriginalMember(owner = "client!lp", name = "T", descriptor = "I")
    public static int field2450;

    @OriginalMember(owner = "client!lp", name = "U", descriptor = "I")
    public static int field2451;

    @OriginalMember(owner = "client!lp", name = "W", descriptor = "I")
    private int field2453;

    @OriginalMember(owner = "client!lp", name = "X", descriptor = "I")
    public static int field2454;

    @OriginalMember(owner = "client!lp", name = "Z", descriptor = "I")
    public static int field2456;

    @OriginalMember(owner = "client!lp", name = "P", descriptor = "[I")
    private int[] field2446;

    @OriginalMember(owner = "client!lp", name = "F", descriptor = "[[I")
    private int[][] field2436;

    @OriginalMember(owner = "client!lp", name = "M", descriptor = "[[I")
    private int[][] field2443;

    @OriginalMember(owner = "client!lp", name = "c", descriptor = "(I)V")
    private final void method1234(int arg0) {
        ++field2434;
        Random var2 = new Random((long) this.field2435);
        this.field2440 = 4096 / this.field2438;
        this.field2433 = 4096 / this.field2435;
        if (arg0 <= 120) {
            this.method34((byte) -18);
        }
        this.field2453 = this.field2452 / 2;
        int var3 = this.field2440 / 2;
        this.field2436 = new int[this.field2435][this.field2438];
        int var4 = this.field2433 / 2;
        this.field2443 = new int[this.field2435][this.field2438 + 1];
        this.field2446 = new int[this.field2435 + 1];
        this.field2446[0] = 0;
        for (int var5 = 0; ~var5 > ~this.field2435; ++var5) {
            if (~var5 < -1) {
                int var6 = this.field2433;
                int var7 = (class304.method1756(var2, 4096, -1304107232) - 2048) * this.field2445 >> 12;
                int var8 = (var4 * var7 >> 12) + var6;
                this.field2446[var5] = this.field2446[var5 + -1] + var8;
            }
            this.field2443[var5][0] = 0;
            for (int var9 = 0; var9 < this.field2438; ++var9) {
                if (var9 > 0) {
                    int var10 = this.field2440;
                    int var11 = (-2048 + class304.method1756(var2, 4096, -1304107232)) * this.field2441 >> 12;
                    int var12 = (var3 * var11 >> 12) + var10;
                    this.field2443[var5][var9] = this.field2443[var5][var9 + -1] - -var12;
                }
                this.field2436[var5][var9] = this.field2448 <= 0 ? 4096 : -class304.method1756(var2, this.field2448, -1304107232) + 4096;
            }
            this.field2443[var5][this.field2438] = 4096;
        }
        this.field2446[this.field2435] = 4096;
    }

    @OriginalMember(owner = "client!lp", name = "<init>", descriptor = "()V")
    public class206() {
        super(0, true);
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(B)V")
    public final void method34(byte arg0) {
        ++field2437;
        if (arg0 != 23) {
            field2455 = null;
        }
        this.method1234(122);
    }

    @OriginalMember(owner = "client!lp", name = "b", descriptor = "(B)V")
    public static final void method1235(byte arg0) {
        if (arg0 != 124) {
            method1236(31);
        }
        if (~class581.field8249 <= -1) {
            long var1 = class557.method3157(-50);
            class581.field8249 = (int) ((long) class581.field8249 - (var1 - class537.field7556));
            if (class581.field8249 > 0) {
                int var3 = (class581.field8249 << 8) / class543.field7646;
                int var4 = -var3 + 255;
                float var5 = (float) var3 / 255.0F;
                class117.field1289 = (16711680 & (class252.field3144 & 65280) * var3 - -((class616.field8686.field5279 & 65280) * var4)) + ((class252.field3144 & 16711935) * var3 + (class616.field8686.field5279 & 16711935) * var4 & -16711936) >>> 8;
                float var6 = 1.0F - var5;
                class656.field9237 = (class616.field8686.field5280 - class518.field7377) * var6 + class518.field7377;
                class645.field9106 = (-16711936 & (16711935 & class571.field8114) * var3 - -((16711935 & class616.field8686.field5290) * var4)) + ((class571.field8114 & 65280) * var3 + (65280 & class616.field8686.field5290) * var4 & 16711680) >>> 8;
                class108.field1172 = (-class272.field3388 + class616.field8686.field5282) * var6 + class272.field3388;
                class465.field6639 = class599.field8431 * var3 + class616.field8686.field5289 * var4 >> 8;
                class635.field8948 = (class616.field8686.field5291 - class625.field8839) * var6 + class625.field8839;
                class16.field128 = (-class212.field2570 + class616.field8686.field5285) * var6 + class212.field2570;
                class186.field2110 = (-class558.field7973 + class616.field8686.field5288) * var6 + class558.field7973;
                class362.field4858 = (-class552.field7889 + class616.field8686.field5274) * var6 + class552.field7889;
                if (class307.field3797 != class616.field8686.field5276) {
                    class235.field2879 = class185.field2107.method959(class307.field3797, class616.field8686.field5276, var6, class235.field2879);
                }
            } else {
                class581.field8249 = -1;
                class465.field6639 = class616.field8686.field5289;
                class235.field2879 = class616.field8686.field5276;
                class635.field8948 = class616.field8686.field5291;
                class117.field1289 = class616.field8686.field5279;
                class645.field9106 = class616.field8686.field5290;
                class656.field9237 = class616.field8686.field5280;
                class108.field1172 = class616.field8686.field5282;
                class186.field2110 = class616.field8686.field5288;
                class362.field4858 = class616.field8686.field5274;
                class16.field128 = class616.field8686.field5285;
            }
            class537.field7556 = var1;
        }
        ++field2444;
    }

    @OriginalMember(owner = "client!lp", name = "b", descriptor = "(II)[I")
    public final int[] method35(int arg0, int arg1) {
        ++field2454;
        int[] var3 = super.field6886.method789(arg0, (byte) 123);
        if (super.field6886.field1592) {
            int var4 = 0;
            int var5;
            for (var5 = class695.field9740[arg0] + this.field2442; ~var5 > -1; var5 += 4096) {
            }
            while (~var5 < -4097) {
                var5 -= 4096;
            }
            while (~var4 > ~this.field2435 && ~this.field2446[var4] >= ~var5) {
                ++var4;
            }
            int var6 = var4 + -1;
            boolean var7 = ~(1 & var4) == -1;
            int var8 = this.field2446[var4];
            int var9 = this.field2446[var4 + -1];
            if (this.field2453 + var9 < var5 && -this.field2453 + var8 > var5) {
                for (int var10 = 0; class436.field6154 > var10; ++var10) {
                    int var11 = 0;
                    int var12 = !var7 ? -this.field2439 : this.field2439;
                    int var13;
                    for (var13 = (this.field2440 * var12 >> 12) + class684.field9645[var10]; ~var13 > -1; var13 += 4096) {
                    }
                    while (var13 > 4096) {
                        var13 -= 4096;
                    }
                    while (~var11 > ~this.field2438 && ~this.field2443[var6][var11] >= ~var13) {
                        ++var11;
                    }
                    int var14 = var11 + -1;
                    int var15 = this.field2443[var6][var11];
                    int var16 = this.field2443[var6][var14];
                    if (var13 > this.field2453 + var16 && -this.field2453 + var15 > var13) {
                        var3[var10] = this.field2436[var6][var14];
                    } else {
                        var3[var10] = 0;
                    }
                }
            } else {
                class567.method3217(var3, 0, class436.field6154, 0);
            }
        }
        if (arg1 != -11323) {
            method1236(30);
        }
        return var3;
    }

    @OriginalMember(owner = "client!lp", name = "f", descriptor = "(I)V")
    public static void method1236(int arg0) {
        if (arg0 > 120) {
            field2455 = null;
            field2447 = null;
            field2449 = null;
        }
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(ILnp;I)V")
    public final void method33(int arg0, class115 arg1, int arg2) {
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (arg2 != 2) {
                    if (~arg2 != -4) {
                        if (~arg2 != -5) {
                            if (~arg2 != -6) {
                                if (arg2 != 6) {
                                    if (~arg2 == -8) {
                                        this.field2448 = arg1.method643((byte) -77);
                                    }
                                } else {
                                    this.field2452 = arg1.method643((byte) -77);
                                }
                            } else {
                                this.field2442 = arg1.method643((byte) -77);
                            }
                        } else {
                            this.field2439 = arg1.method643((byte) -77);
                        }
                    } else {
                        this.field2445 = arg1.method643((byte) -77);
                    }
                } else {
                    this.field2441 = arg1.method643((byte) -77);
                }
            } else {
                this.field2435 = arg1.method620((byte) -126);
            }
        } else {
            this.field2438 = arg1.method620((byte) 35);
        }
        ++field2450;
        if (arg0 != 255) {
            method1235((byte) 44);
        }
    }
}
