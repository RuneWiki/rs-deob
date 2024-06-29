import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public class class260 extends class14 {

    @OriginalMember(owner = "client!ah", name = "L", descriptor = "I")
    private int field3433 = 0;

    @OriginalMember(owner = "client!ah", name = "Q", descriptor = "I")
    private int field3438 = 10;

    @OriginalMember(owner = "client!ah", name = "X", descriptor = "I")
    private int field3445 = 2048;

    @OriginalMember(owner = "client!ah", name = "V", descriptor = "Z")
    public static boolean field3443 = false;

    @OriginalMember(owner = "client!ah", name = "J", descriptor = "I")
    public static int field3431;

    @OriginalMember(owner = "client!ah", name = "K", descriptor = "I")
    public static int field3432;

    @OriginalMember(owner = "client!ah", name = "N", descriptor = "I")
    public static int field3435;

    @OriginalMember(owner = "client!ah", name = "P", descriptor = "I")
    public static int field3437;

    @OriginalMember(owner = "client!ah", name = "R", descriptor = "I")
    public static int field3439;

    @OriginalMember(owner = "client!ah", name = "S", descriptor = "I")
    public static int field3440;

    @OriginalMember(owner = "client!ah", name = "T", descriptor = "I")
    public static int field3441;

    @OriginalMember(owner = "client!ah", name = "U", descriptor = "I")
    public static int field3442;

    @OriginalMember(owner = "client!ah", name = "W", descriptor = "I")
    public static int field3444;

    @OriginalMember(owner = "client!ah", name = "M", descriptor = "[I")
    private int[] field3434;

    @OriginalMember(owner = "client!ah", name = "O", descriptor = "[I")
    private int[] field3436;

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(Ljs;Lmd;ZI)V", line = 7)
    public static final void method1569(class216 arg0, class379 arg1, boolean arg2, int arg3) {
        ++field3435;
        class232 var4 = new class232();
        var4.field3113 = arg1.method2238(255);
        var4.field3115 = arg1.method2232((byte) 125);
        var4.field3124 = new int[var4.field3113];
        var4.field3127 = new byte[var4.field3113][][];
        var4.field3122 = new int[var4.field3113];
        var4.field3117 = new class446[var4.field3113];
        var4.field3123 = new int[var4.field3113];
        var4.field3114 = new class446[var4.field3113];
        if (arg2) {
            method1571(-9, -55);
        }
        for (int var5 = 0; var5 < var4.field3113; ++var5) {
            try {
                int var6 = arg1.method2238(255);
                if (~var6 != -1 && var6 != 1 && ~var6 != -3) {
                    if (var6 == 3 || var6 == 4) {
                        String var10 = arg1.method2218(125);
                        String var11 = arg1.method2218(120);
                        int var12 = arg1.method2238(255);
                        String[] var13 = new String[var12];
                        for (int var14 = 0; var14 < var12; ++var14) {
                            var13[var14] = arg1.method2218(120);
                        }
                        byte[][] var15 = new byte[var12][];
                        if (var6 == 3) {
                            for (int var16 = 0; ~var12 < ~var16; ++var16) {
                                int var17 = arg1.method2232((byte) 127);
                                var15[var16] = new byte[var17];
                                arg1.method2191(0, -9637, var15[var16], var17);
                            }
                        }
                        var4.field3124[var5] = var6;
                        Class[] var18 = new Class[var12];
                        for (int var19 = 0; var19 < var12; ++var19) {
                            var18[var19] = class140.method992(var13[var19], 0);
                        }
                        var4.field3114[var5] = arg0.method1377(8, var11, class140.method992(var10, 0), var18);
                        var4.field3127[var5] = var15;
                    }
                } else {
                    String var7 = arg1.method2218(37);
                    String var8 = arg1.method2218(-121);
                    int var9 = 0;
                    if (~var6 == -2) {
                        var9 = arg1.method2232((byte) 125);
                    }
                    var4.field3124[var5] = var6;
                    var4.field3122[var5] = var9;
                    var4.field3117[var5] = arg0.method1369((byte) -23, var8, class140.method992(var7, 0));
                }
            } catch (ClassNotFoundException var20) {
                var4.field3123[var5] = -1;
            } catch (SecurityException var21) {
                var4.field3123[var5] = -2;
            } catch (NullPointerException var22) {
                var4.field3123[var5] = -3;
            } catch (Exception var23) {
                var4.field3123[var5] = -4;
            } catch (Throwable var24) {
                var4.field3123[var5] = -5;
            }
        }
        class485.field6744.method1666((byte) 126, var4);
    }

    @OriginalMember(owner = "client!ah", name = "<init>", descriptor = "()V", line = 119)
    public class260() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "(B)V", line = 126)
    public final void method142(byte arg0) {
        ++field3444;
        int var2 = 127 / ((39 - arg0) / 59);
        this.method1572(4096);
    }

    @OriginalMember(owner = "client!ah", name = "e", descriptor = "(I)V", line = 143)
    public static final void method1570(int arg0) {
        ++field3432;
        int var1 = 0;
        if (arg0 > 112) {
            while (~var1 > -101) {
                class204.field2824[var1] = true;
                ++var1;
            }
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(IBLmd;)V", line = 169)
    public final void method147(int arg0, byte arg1, class379 arg2) {
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (~arg0 == -3) {
                    this.field3433 = arg2.method2238(255);
                }
            } else {
                this.field3445 = arg2.method2212((byte) 83);
            }
        } else {
            this.field3438 = arg2.method2238(255);
        }
        int var5 = 59 / ((-51 - arg1) / 37);
        ++field3441;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(IB)[I", line = 215)
    public final int[] method140(int arg0, byte arg1) {
        ++field3440;
        int[] var3 = super.field270.method2263(-29596, arg0);
        if (arg1 > -2) {
            this.method142((byte) 27);
        }
        if (super.field270.field5222) {
            int var4 = class273.field3590[arg0];
            if (~this.field3433 == -1) {
                short var5 = 0;
                for (int var6 = 0; this.field3438 > var6; ++var6) {
                    if (~var4 <= ~this.field3434[var6] && ~this.field3434[var6 + 1] < ~var4) {
                        if (var4 < this.field3436[var6]) {
                            var5 = 4096;
                        }
                        break;
                    }
                }
                class254.method1530(var3, 0, class115.field1637, var5);
            } else {
                for (int var7 = 0; class115.field1637 > var7; ++var7) {
                    int var8 = 0;
                    short var9 = 0;
                    int var10 = class195.field2715[var7];
                    int var11 = this.field3433;
                    if (var11 != 1) {
                        if (~var11 != -3) {
                            if (~var11 == -4) {
                                var8 = (-var4 + var10 >> 1) + 2048;
                            }
                        } else {
                            var8 = (var10 + -4096 + var4 >> 1) + 2048;
                        }
                    } else {
                        var8 = var10;
                    }
                    for (int var12 = 0; ~this.field3438 < ~var12; ++var12) {
                        if (var8 >= this.field3434[var12] && ~var8 > ~this.field3434[var12 - -1]) {
                            if (var8 < this.field3436[var12]) {
                                var9 = 4096;
                            }
                            break;
                        }
                    }
                    var3[var7] = var9;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "(II)V", line = 331)
    public static final void method1571(int arg0, int arg1) {
        ++field3437;
        if (arg1 < -25) {
            class253 var2 = class332.method1911(arg0, (byte) -125, 7);
            var2.method1523((byte) -121);
        }
    }

    @OriginalMember(owner = "client!ah", name = "f", descriptor = "(I)V", line = 344)
    private final void method1572(int arg0) {
        ++field3442;
        this.field3436 = new int[this.field3438 - -1];
        this.field3434 = new int[this.field3438 + 1];
        int var2 = 0;
        int var3 = 4096 / this.field3438;
        int var4 = this.field3445 * var3 >> 12;
        for (int var5 = 0; this.field3438 > var5; ++var5) {
            this.field3434[var5] = var2;
            this.field3436[var5] = var2 + var4;
            var2 += var3;
        }
        this.field3434[this.field3438] = arg0;
        this.field3436[this.field3438] = 4096 - -this.field3436[0];
    }
}
