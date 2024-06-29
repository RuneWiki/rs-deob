import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gs")
public class class41 extends class314 {

    @OriginalMember(owner = "client!gs", name = "N", descriptor = "I")
    private int field574 = 0;

    @OriginalMember(owner = "client!gs", name = "S", descriptor = "I")
    private int field579 = 2048;

    @OriginalMember(owner = "client!gs", name = "R", descriptor = "I")
    private int field578 = 10;

    @OriginalMember(owner = "client!gs", name = "L", descriptor = "[I")
    public static int[] field572 = new int[1000];

    @OriginalMember(owner = "client!gs", name = "W", descriptor = "I")
    public static int field583 = 0;

    @OriginalMember(owner = "client!gs", name = "O", descriptor = "I")
    public static int field575;

    @OriginalMember(owner = "client!gs", name = "P", descriptor = "I")
    public static int field576;

    @OriginalMember(owner = "client!gs", name = "Q", descriptor = "I")
    public static int field577;

    @OriginalMember(owner = "client!gs", name = "T", descriptor = "I")
    public static int field580;

    @OriginalMember(owner = "client!gs", name = "U", descriptor = "I")
    public static int field581;

    @OriginalMember(owner = "client!gs", name = "X", descriptor = "I")
    public static int field584;

    @OriginalMember(owner = "client!gs", name = "M", descriptor = "[I")
    private int[] field573;

    @OriginalMember(owner = "client!gs", name = "V", descriptor = "[I")
    private int[] field582;

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(ILie;)Leaa;", line = 10)
    public static final class463 method522(int arg0, class6 arg1) {
        ++field577;
        int var2 = arg1.method70(-9059);
        if (arg0 != 1) {
            method524(32);
        }
        class254 var3 = class411.method2620(0)[arg1.method70(-9059)];
        class395 var4 = class129.method1125(0)[arg1.method70(-9059)];
        int var5 = arg1.method45(-8652);
        int var6 = arg1.method45(arg0 ^ -8651);
        int var7 = arg1.method67(12021);
        int var8 = arg1.method67(12021);
        int var9 = arg1.method72(-90);
        int var10 = arg1.method72(-125);
        int var11 = arg1.method72(arg0 ^ -122);
        boolean var12 = ~arg1.method70(-9059) == -2;
        return new class463(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12);
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(B)V", line = 43)
    public final void method3(byte arg0) {
        ++field580;
        this.method523((byte) 80);
        if (arg0 != -15) {
            method524(75);
        }
    }

    @OriginalMember(owner = "client!gs", name = "b", descriptor = "(B)V", line = 54)
    private final void method523(byte arg0) {
        ++field576;
        this.field582 = new int[this.field578 + 1];
        this.field573 = new int[this.field578 - -1];
        int var2 = 0;
        int var3 = 4096 / this.field578;
        int var4 = this.field579 * var3 >> 12;
        for (int var5 = 0; ~var5 > ~this.field578; ++var5) {
            this.field582[var5] = var2;
            this.field573[var5] = var2 + var4;
            var2 += var3;
        }
        if (arg0 < 14) {
            method524(127);
        }
        this.field582[this.field578] = 4096;
        this.field573[this.field578] = 4096 - -this.field573[0];
    }

    @OriginalMember(owner = "client!gs", name = "<init>", descriptor = "()V", line = 88)
    public class41() {
        super(0, true);
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(BLie;I)V", line = 98)
    public final void method5(byte arg0, class6 arg1, int arg2) {
        if (arg0 <= -1) {
            ++field575;
            if (arg2 != 0) {
                if (arg2 != 1) {
                    if (arg2 == 2) {
                        this.field574 = arg1.method70(-9059);
                    }
                } else {
                    this.field579 = arg1.method67(12021);
                }
            } else {
                this.field578 = arg1.method70(-9059);
            }
        }
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(II)[I", line = 142)
    public final int[] method6(int arg0, int arg1) {
        ++field584;
        int[] var3 = super.field4928.method534((byte) -80, arg0);
        if (super.field4928.field618) {
            int var4 = class657.field9166[arg0];
            if (~this.field574 != -1) {
                for (int var5 = 0; ~var5 > ~class81.field1009; ++var5) {
                    int var6 = 0;
                    short var7 = 0;
                    int var8 = class328.field5091[var5];
                    int var9 = this.field574;
                    if (var9 != 1) {
                        if (~var9 != -3) {
                            if (var9 == 3) {
                                var6 = (-var4 + var8 >> 1) + 2048;
                            }
                        } else {
                            var6 = (var4 + -4096 + var8 >> 1) + 2048;
                        }
                    } else {
                        var6 = var8;
                    }
                    for (int var10 = 0; this.field578 > var10; ++var10) {
                        if (~var6 <= ~this.field582[var10] && this.field582[var10 - -1] > var6) {
                            if (var6 < this.field573[var10]) {
                                var7 = 4096;
                            }
                            break;
                        }
                    }
                    var3[var5] = var7;
                }
            } else {
                short var11 = 0;
                for (int var12 = 0; ~var12 > ~this.field578; ++var12) {
                    if (this.field582[var12] <= var4 && ~this.field582[var12 + 1] < ~var4) {
                        if (~var4 > ~this.field573[var12]) {
                            var11 = 4096;
                        }
                        break;
                    }
                }
                class398.method2562(var3, 0, class81.field1009, var11);
            }
        }
        if (arg1 < 109) {
            method522(12, (class6) null);
        }
        return var3;
    }

    @OriginalMember(owner = "client!gs", name = "h", descriptor = "(I)V", line = 273)
    public static void method524(int arg0) {
        if (arg0 != 4096) {
            method524(122);
        }
        field572 = null;
    }
}
