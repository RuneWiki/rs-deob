import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public class class130 extends class272 {

    @OriginalMember(owner = "client!mg", name = "I", descriptor = "I")
    private int field2316 = 3216;

    @OriginalMember(owner = "client!mg", name = "K", descriptor = "I")
    private int field2318 = 3216;

    @OriginalMember(owner = "client!mg", name = "Q", descriptor = "[I")
    private int[] field2324 = new int[3];

    @OriginalMember(owner = "client!mg", name = "db", descriptor = "I")
    private int field2337 = 4096;

    @OriginalMember(owner = "client!mg", name = "P", descriptor = "I")
    public static int field2323 = 0;

    @OriginalMember(owner = "client!mg", name = "O", descriptor = "Lli;")
    public static class185 field2322 = class245.method1649("::qa_op_test", 126);

    @OriginalMember(owner = "client!mg", name = "J", descriptor = "I")
    public static int field2317 = -1;

    @OriginalMember(owner = "client!mg", name = "Z", descriptor = "Lli;")
    public static class185 field2333 = class245.method1649("Fertigkeit: ", -90);

    @OriginalMember(owner = "client!mg", name = "fb", descriptor = "I")
    public static int field2339 = 2301979;

    @OriginalMember(owner = "client!mg", name = "eb", descriptor = "Lgf;")
    public static class7 field2338 = new class7(2);

    @OriginalMember(owner = "client!mg", name = "L", descriptor = "I")
    public static int field2319;

    @OriginalMember(owner = "client!mg", name = "M", descriptor = "I")
    public static int field2320;

    @OriginalMember(owner = "client!mg", name = "N", descriptor = "I")
    public static int field2321;

    @OriginalMember(owner = "client!mg", name = "R", descriptor = "I")
    public static int field2325;

    @OriginalMember(owner = "client!mg", name = "T", descriptor = "I")
    public static int field2327;

    @OriginalMember(owner = "client!mg", name = "U", descriptor = "I")
    public static int field2328;

    @OriginalMember(owner = "client!mg", name = "V", descriptor = "I")
    public static int field2329;

    @OriginalMember(owner = "client!mg", name = "W", descriptor = "I")
    public static int field2330;

    @OriginalMember(owner = "client!mg", name = "ab", descriptor = "I")
    public static int field2334;

    @OriginalMember(owner = "client!mg", name = "bb", descriptor = "I")
    public static int field2335;

    @OriginalMember(owner = "client!mg", name = "cb", descriptor = "I")
    public static int field2336;

    @OriginalMember(owner = "client!mg", name = "S", descriptor = "J")
    public static long field2326;

    @OriginalMember(owner = "client!mg", name = "X", descriptor = "[I")
    public static int[] field2331;

    @OriginalMember(owner = "client!mg", name = "gb", descriptor = "[Ldd;")
    public static class211[] field2340;

    @OriginalMember(owner = "client!mg", name = "Y", descriptor = "[[S")
    public static short[][] field2332;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(Z[IJI)Lli;")
    public static final class185 method924(boolean arg0, int[] arg1, long arg2, int arg3) {
        ++field2321;
        if (class156.field2955 != null) {
            class185 var5 = class156.field2955.method770(arg1, arg2, 0, arg3);
            if (var5 != null) {
                return var5;
            }
        }
        if (arg0) {
            return null;
        } else {
            return ~arg3 == -6 ? class271.method1859((byte) -108, arg2).method1334(38) : class235.method1600((byte) 66, arg2);
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(ILjd;)V")
    public static final void method925(int arg0, class118 arg1) {
        ++field2328;
        while (true) {
            while (arg1.field2155 < arg1.field2115.length) {
                boolean var2 = false;
                int var3 = 0;
                int var4 = 0;
                if (~arg1.method867(false) == -2) {
                    var4 = arg1.method867(false);
                    var2 = true;
                    var3 = arg1.method867(false);
                }
                int var5 = arg1.method867(false);
                int var6 = arg1.method867(false);
                int var7 = var5 * 64 - class252.field4481;
                int var8 = class125.field2246 + -1 + class264.field4679 + -(var6 * 64);
                if (~var7 <= -1 && ~(var8 + -63) <= -1 && var7 + 63 < class56.field971 && var8 < class125.field2246) {
                    int var9 = var8 >> 6;
                    int var10 = var7 >> 6;
                    for (int var11 = 0; ~var11 > -65; ++var11) {
                        for (int var12 = 0; var12 < 64; ++var12) {
                            if (!var2 || var4 * 8 <= var11 && ~(var4 * 8 + 8) < ~var11 && ~var12 <= ~(var3 * 8) && ~(var3 * 8 - -8) < ~var12) {
                                byte var13 = arg1.method838(1275919136);
                                if (var13 != 0) {
                                    if (class129.field2312[var10][var9] == null) {
                                        class129.field2312[var10][var9] = new byte[4096];
                                    }
                                    class129.field2312[var10][var9][(-var12 + 63 << 6) + var11] = var13;
                                    byte var14 = arg1.method838(1275919136);
                                    if (class258.field4590[var10][var9] == null) {
                                        class258.field4590[var10][var9] = new byte[4096];
                                    }
                                    class258.field4590[var10][var9][(-var12 + 63 << 6) + var11] = var14;
                                }
                            }
                        }
                    }
                } else {
                    for (int var15 = 0; (!var2 ? 4096 : 64) > var15; ++var15) {
                        byte var16 = arg1.method838(1275919136);
                        if (var16 != 0) {
                            ++arg1.field2155;
                        }
                    }
                }
            }
            if (arg0 <= 34) {
                field2338 = null;
                return;
            }
            return;
        }
    }

    @OriginalMember(owner = "client!mg", name = "e", descriptor = "(I)V")
    public final void method113(int arg0) {
        this.method928(true);
        if (arg0 == 0) {
            ++field2319;
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(Ljd;BI)V")
    public final void method34(class118 arg0, byte arg1, int arg2) {
        int var4 = 4 / ((arg1 - -21) / 55);
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (arg2 == 2) {
                    this.field2318 = arg0.method827(255);
                }
            } else {
                this.field2316 = arg0.method827(255);
            }
        } else {
            this.field2337 = arg0.method827(255);
        }
        ++field2327;
    }

    @OriginalMember(owner = "client!mg", name = "<init>", descriptor = "()V")
    public class130() {
        super(1, true);
    }

    @OriginalMember(owner = "client!mg", name = "f", descriptor = "(I)V")
    public static void method926(int arg0) {
        field2331 = null;
        field2332 = null;
        field2322 = null;
        field2338 = null;
        field2333 = null;
        field2340 = null;
        if (arg0 != 1412611020) {
            method924(true, (int[]) null, -14L, -63);
        }
    }

    @OriginalMember(owner = "client!mg", name = "d", descriptor = "(III)Lfd;")
    public static final class206 method927(int arg0, int arg1, int arg2) {
        class198 var3 = class153.field2896[arg0][arg1][arg2];
        return var3 == null ? null : var3.field3640;
    }

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "(Z)V")
    private final void method928(boolean arg0) {
        double var2 = Math.cos((double) ((float) this.field2318 / 4096.0F));
        ++field2320;
        this.field2324[0] = (int) (4096.0D * var2 * Math.sin((double) ((float) this.field2316 / 4096.0F)));
        this.field2324[1] = (int) (4096.0D * Math.cos((double) ((float) this.field2316 / 4096.0F)) * var2);
        this.field2324[2] = (int) (Math.sin((double) ((float) this.field2318 / 4096.0F)) * 4096.0D);
        int var4 = this.field2324[2] * this.field2324[2] >> 12;
        int var5 = this.field2324[0] * this.field2324[0] >> 12;
        int var6 = this.field2324[1] * this.field2324[1] >> 12;
        if (!arg0) {
            method924(true, (int[]) null, -52L, -13);
        }
        int var7 = (int) (4096.0D * Math.sqrt((double) (var5 - (-var6 - var4) >> 12)));
        if (var7 != 0) {
            this.field2324[0] = (this.field2324[0] << 12) / var7;
            this.field2324[2] = (this.field2324[2] << 12) / var7;
            this.field2324[1] = (this.field2324[1] << 12) / var7;
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(DI)V")
    public static final void method929(double arg0, int arg1) {
        if (arg1 != -256) {
            method931(-66, -14, 16, 116, -124, -125);
        }
        if (class10.field197 != arg0) {
            for (int var3 = 0; var3 < 256; ++var3) {
                int var4 = (int) (255.0D * Math.pow((double) var3 / 255.0D, arg0));
                class139.field2610[var3] = ~var4 < -256 ? 255 : var4;
            }
            class10.field197 = arg0;
        }
        ++field2334;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(Lli;IB)V")
    public static final void method930(class185 arg0, int arg1, byte arg2) {
        if (arg2 <= -81) {
            class174 var3 = class249.method1671(2, arg1, (byte) -113);
            var3.method1233(0);
            var3.field3183 = arg0;
            ++field2335;
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(IIIIII)V")
    public static final void method931(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field2336;
        if (arg1 == arg5) {
            class202.method1436(9963, arg4, arg1, arg2, arg3);
        } else {
            if (-arg1 + arg4 >= class207.field3810 && class66.field1163 >= arg4 - -arg1 && class216.field3964 <= -arg5 + arg3 && class113.field2040 >= arg3 + arg5) {
                class239.method1623(arg5, arg4, 0, arg2, arg3, arg1);
            } else {
                class240.method1631(-17032, arg3, arg5, arg2, arg1, arg4);
            }
            if (arg0 >= -50) {
                method929(0.007941142029558139D, 80);
            }
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(II)[I")
    public final int[] method35(int arg0, int arg1) {
        int[] var3 = super.field4819.method1632(arg1 + -4421, arg0);
        if (super.field4819.field4294) {
            int var4 = class234.field4207 * this.field2337 >> 12;
            int[] var5 = this.method1866(arg0 - 1 & class99.field1826, 0, 127);
            int[] var6 = this.method1866(arg0, 0, 127);
            int[] var7 = this.method1866(class99.field1826 & arg0 + 1, 0, arg1 ^ 4401);
            for (int var8 = 0; var8 < class246.field4385; ++var8) {
                int var9 = (var7[var8] + -var5[var8]) * var4 >> 12;
                int var10 = (var6[var8 - 1 & class59.field1037] + -var6[class59.field1037 & var8 + 1]) * var4 >> 12;
                int var11 = var10 >> 4;
                if (~var11 > -1) {
                    var11 = -var11;
                }
                if (~var11 < -256) {
                    var11 = 255;
                }
                int var12 = var9 >> 4;
                if (var12 < 0) {
                    var12 = -var12;
                }
                if (var12 > 255) {
                    var12 = 255;
                }
                int var13 = 255 & class193.field3560[((var12 - -1) * var12 >> 1) + var11];
                int var14 = var10 * var13 >> 8;
                int var15 = var13 * 4096 >> 8;
                int var16 = this.field2324[2] * var15 >> 12;
                int var17 = this.field2324[0] * var14 >> 12;
                int var18 = var9 * var13 >> 8;
                int var19 = this.field2324[1] * var18 >> 12;
                var3[var8] = var17 - -var16 + var19;
            }
        }
        ++field2330;
        if (arg1 != 4421) {
            method927(0, -40, -1);
        }
        return var3;
    }
}
