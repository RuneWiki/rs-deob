import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!maa")
public class class413 extends class646 {

    @OriginalMember(owner = "client!maa", name = "I", descriptor = "I")
    private int field5879 = 0;

    @OriginalMember(owner = "client!maa", name = "O", descriptor = "I")
    private int field5885 = 4096;

    @OriginalMember(owner = "client!maa", name = "N", descriptor = "I")
    private int field5884 = 0;

    @OriginalMember(owner = "client!maa", name = "P", descriptor = "I")
    private int field5886 = 2000;

    @OriginalMember(owner = "client!maa", name = "R", descriptor = "I")
    private int field5888 = 16;

    @OriginalMember(owner = "client!maa", name = "L", descriptor = "Lvh;")
    public static class125 field5882 = new class125(37, 3);

    @OriginalMember(owner = "client!maa", name = "T", descriptor = "I")
    public static int field5890 = 0;

    @OriginalMember(owner = "client!maa", name = "S", descriptor = "Lau;")
    public static class692 field5889 = new class692();

    @OriginalMember(owner = "client!maa", name = "J", descriptor = "I")
    public static int field5880;

    @OriginalMember(owner = "client!maa", name = "K", descriptor = "I")
    public static int field5881;

    @OriginalMember(owner = "client!maa", name = "M", descriptor = "I")
    public static int field5883;

    @OriginalMember(owner = "client!maa", name = "Q", descriptor = "I")
    public static int field5887;

    @OriginalMember(owner = "client!maa", name = "b", descriptor = "(Z)V")
    public static void method2462(boolean arg0) {
        field5882 = null;
        if (!arg0) {
            field5890 = -73;
        }
        field5889 = null;
    }

    @OriginalMember(owner = "client!maa", name = "<init>", descriptor = "()V")
    public class413() {
        super(0, true);
    }

    @OriginalMember(owner = "client!maa", name = "a", descriptor = "(Lek;IB)V")
    public final void method295(class465 arg0, int arg1, byte arg2) {
        ++field5880;
        if (arg2 < 7) {
            this.method422(-12);
        }
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (~arg1 != -3) {
                    if (~arg1 != -4) {
                        if (arg1 == 4) {
                            this.field5885 = arg0.method2755((byte) -45);
                        }
                    } else {
                        this.field5879 = arg0.method2755((byte) -93);
                    }
                } else {
                    this.field5888 = arg0.method2705(-31);
                }
            } else {
                this.field5886 = arg0.method2755((byte) -87);
            }
        } else {
            this.field5884 = arg0.method2705(-69);
        }
    }

    @OriginalMember(owner = "client!maa", name = "c", descriptor = "(I)V")
    public final void method422(int arg0) {
        ++field5883;
        if (arg0 != -1) {
            this.field5888 = -95;
        }
        class549.method3223(106);
    }

    @OriginalMember(owner = "client!maa", name = "a", descriptor = "(ILis;)V")
    public static final void method2463(int arg0, class101 arg1) {
        ++field5881;
        class101 var2 = class210.method1444(arg0, arg1);
        int var3;
        int var4;
        if (var2 == null) {
            var3 = class597.field8633;
            var4 = class465.field6689;
        } else {
            var4 = var2.field1604;
            var3 = var2.field1651;
        }
        class293.method1794(var3, arg1, var4, false, -116);
        class104.method878(var3, var4, -112, arg1);
    }

    @OriginalMember(owner = "client!maa", name = "b", descriptor = "(IB)[I")
    public final int[] method424(int arg0, byte arg1) {
        ++field5887;
        if (arg1 != -120) {
            return null;
        } else {
            int[] var3 = super.field9156.method2193(arg1 + 1389, arg0);
            if (super.field9156.field5075) {
                int var4 = this.field5885 >> 1;
                int[][] var5 = super.field9156.method2192(true);
                Random var6 = new Random((long) this.field5884);
                for (int var7 = 0; this.field5886 > var7; ++var7) {
                    int var8 = ~this.field5885 < -1 ? this.field5879 + class357.method2154(var6, this.field5885, Integer.MIN_VALUE) + -var4 : this.field5879;
                    int var9 = 255 & var8 >> 4;
                    int var10 = class357.method2154(var6, class89.field1330, Integer.MIN_VALUE);
                    int var11 = class357.method2154(var6, class236.field3492, Integer.MIN_VALUE);
                    int var12 = (class43.field587[var9] * this.field5888 >> 12) + var10;
                    int var13 = var11 - -(class609.field8759[var9] * this.field5888 >> 12);
                    int var14 = -var11 + var13;
                    int var15 = -var10 + var12;
                    if (~var15 != -1 || ~var14 != -1) {
                        if (~var14 > -1) {
                            var14 = -var14;
                        }
                        if (~var15 > -1) {
                            var15 = -var15;
                        }
                        boolean var16 = var15 < var14;
                        if (var16) {
                            int var17 = var10;
                            var10 = var11;
                            int var18 = var12;
                            var11 = var17;
                            var12 = var13;
                            var13 = var18;
                        }
                        if (var10 > var12) {
                            int var19 = var10;
                            var10 = var12;
                            int var20 = var11;
                            var11 = var13;
                            var12 = var19;
                            var13 = var20;
                        }
                        int var21 = var11;
                        int var22 = var12 - var10;
                        int var23 = var13 - var11;
                        int var24 = -var22 / 2;
                        int var25 = 2048 / var22;
                        int var26 = -(class357.method2154(var6, 4096, Integer.MIN_VALUE) >> 2) + 1024;
                        if (~var23 > -1) {
                            var23 = -var23;
                        }
                        int var27 = ~var11 > ~var13 ? 1 : -1;
                        for (int var28 = var10; var28 < var12; ++var28) {
                            int var29 = (-var10 + var28) * var25 + 1024 + var26;
                            int var30 = class156.field2572 & var28;
                            int var31 = var21 & class453.field6525;
                            var24 += var23;
                            if (var16) {
                                var5[var31][var30] = var29;
                            } else {
                                var5[var30][var31] = var29;
                            }
                            if (var24 > 0) {
                                var24 -= var22;
                                var21 -= -var27;
                            }
                        }
                    }
                }
            }
            return var3;
        }
    }
}
