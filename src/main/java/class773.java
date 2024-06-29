import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class773 extends class175 {

    @OriginalMember(owner = "client!qc", name = "H", descriptor = "I")
    private int field10623 = 4096;

    @OriginalMember(owner = "client!qc", name = "O", descriptor = "I")
    private int field10629 = 4096;

    @OriginalMember(owner = "client!qc", name = "M", descriptor = "I")
    private int field10627 = 409;

    @OriginalMember(owner = "client!qc", name = "Q", descriptor = "I")
    private int field10631 = 4096;

    @OriginalMember(owner = "client!qc", name = "R", descriptor = "[I")
    private int[] field10632 = new int[3];

    @OriginalMember(owner = "client!qc", name = "G", descriptor = "[I")
    public static int[] field10622 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

    @OriginalMember(owner = "client!qc", name = "I", descriptor = "J")
    public static long field10624 = 0L;

    @OriginalMember(owner = "client!qc", name = "F", descriptor = "Ldia;")
    public static class246 field10621 = new class246();

    @OriginalMember(owner = "client!qc", name = "S", descriptor = "I")
    public static int field10633 = 1;

    @OriginalMember(owner = "client!qc", name = "E", descriptor = "I")
    public static int field10620;

    @OriginalMember(owner = "client!qc", name = "K", descriptor = "I")
    public static int field10625;

    @OriginalMember(owner = "client!qc", name = "L", descriptor = "I")
    public static int field10626;

    @OriginalMember(owner = "client!qc", name = "N", descriptor = "I")
    public static int field10628;

    @OriginalMember(owner = "client!qc", name = "P", descriptor = "I")
    public static int field10630;

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "(B)V")
    public static void method4248(byte arg0) {
        if (arg0 < -108) {
            field10621 = null;
            field10622 = null;
        }
    }

    @OriginalMember(owner = "client!qc", name = "<init>", descriptor = "()V")
    public class773() {
        super(1, false);
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lofa;ILofa;)V")
    public static final void method4249(class347 arg0, int arg1, class347 arg2) {
        ++field10628;
        ++class553.field7633;
        class43 var3 = class492.method2903(class586.field7976, 0, class73.field983);
        var3.field457.method1686(-110, arg2.field5003);
        if (arg1 <= -25) {
            var3.field457.method1713((byte) -119, arg2.field4956);
            var3.field457.method1697(arg0.field4955, true);
            var3.field457.method1697(arg0.field4956, true);
            var3.field457.method1690(-516533072, arg0.field5003);
            var3.field457.method1697(arg2.field4955, true);
            class409.method2457((byte) -100, var3);
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(ILuq;)V")
    public static final void method4250(int arg0, class172 arg1) {
        int var2 = 110 / ((arg0 - -74) / 36);
        class737.field10009 = arg1;
        ++field10620;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IB)[[I")
    public final int[][] method238(int arg0, byte arg1) {
        ++field10626;
        int[][] var3 = super.field2316.method3602(arg0, (byte) -74);
        if (super.field2316.field8746) {
            int[][] var4 = this.method1205(0, arg0, 29179);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~class598.field8136 < ~var11; ++var11) {
                int var12 = var5[var11];
                int var13 = var12 - this.field10632[0];
                if (var13 < 0) {
                    var13 = -var13;
                }
                if (~var13 < ~this.field10627) {
                    var8[var11] = var12;
                    var9[var11] = var6[var11];
                    var10[var11] = var7[var11];
                } else {
                    int var14 = var6[var11];
                    int var15 = -this.field10632[1] + var14;
                    if (~var15 > -1) {
                        var15 = -var15;
                    }
                    if (~this.field10627 > ~var15) {
                        var8[var11] = var12;
                        var9[var11] = var14;
                        var10[var11] = var7[var11];
                    } else {
                        int var16 = var7[var11];
                        int var17 = -this.field10632[2] + var16;
                        if (~var17 > -1) {
                            var17 = -var17;
                        }
                        if (this.field10627 < var17) {
                            var8[var11] = var12;
                            var9[var11] = var14;
                            var10[var11] = var16;
                        } else {
                            var8[var11] = this.field10623 * var12 >> 12;
                            var9[var11] = this.field10629 * var14 >> 12;
                            var10[var11] = this.field10631 * var16 >> 12;
                        }
                    }
                }
            }
        }
        if (arg1 >= -47) {
            method4248((byte) 118);
        }
        return var3;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(ILdt;Z)V")
    public final void method44(int arg0, class254 arg1, boolean arg2) {
        if (!arg2) {
            if (~arg0 != -1) {
                if (~arg0 != -2) {
                    if (arg0 != 2) {
                        if (~arg0 != -4) {
                            if (arg0 == 4) {
                                int var5 = arg1.method1722(arg2);
                                this.field10632[1] = class519.method3018(var5 >> 4, 4080);
                                this.field10632[2] = class519.method3018(255, var5) >> 12;
                                this.field10632[0] = class519.method3018(var5, 16711680) << 4;
                            }
                        } else {
                            this.field10623 = arg1.method1728((byte) 24);
                        }
                    } else {
                        this.field10629 = arg1.method1728((byte) 101);
                    }
                } else {
                    this.field10631 = arg1.method1728((byte) 22);
                }
            } else {
                this.field10627 = arg1.method1728((byte) 46);
            }
            ++field10625;
        }
    }
}
