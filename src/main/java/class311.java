import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bca")
public class class311 extends class478 {

    @OriginalMember(owner = "client!bca", name = "E", descriptor = "I")
    private int field3841 = 4096;

    @OriginalMember(owner = "client!bca", name = "C", descriptor = "I")
    private int field3839 = 0;

    @OriginalMember(owner = "client!bca", name = "F", descriptor = "I")
    public static int field3842 = 0;

    @OriginalMember(owner = "client!bca", name = "J", descriptor = "Lcq;")
    public static class110 field3845 = new class110(99, 8);

    @OriginalMember(owner = "client!bca", name = "K", descriptor = "I")
    public static int field3846 = 0;

    @OriginalMember(owner = "client!bca", name = "B", descriptor = "I")
    public static int field3838;

    @OriginalMember(owner = "client!bca", name = "D", descriptor = "I")
    public static int field3840;

    @OriginalMember(owner = "client!bca", name = "G", descriptor = "I")
    public static int field3843;

    @OriginalMember(owner = "client!bca", name = "I", descriptor = "I")
    public static int field3844;

    @OriginalMember(owner = "client!bca", name = "L", descriptor = "I")
    public static int field3847;

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method104(boolean arg0, int arg1) {
        ++field3844;
        if (!arg0) {
            this.method35(-34, 52);
        }
        int[][] var3 = super.field6889.method2091(98, arg1);
        if (super.field6889.field4765) {
            int[][] var4 = this.method2753(0, arg1, (byte) 11);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~var11 > ~class436.field6154; ++var11) {
                int var12 = var5[var11];
                int var13 = var6[var11];
                int var14 = var7[var11];
                if (var12 >= this.field3839) {
                    if (~this.field3841 <= ~var12) {
                        var8[var11] = var12;
                    } else {
                        var8[var11] = this.field3841;
                    }
                } else {
                    var8[var11] = this.field3839;
                }
                if (var13 >= this.field3839) {
                    if (var13 > this.field3841) {
                        var9[var11] = this.field3841;
                    } else {
                        var9[var11] = var13;
                    }
                } else {
                    var9[var11] = this.field3839;
                }
                if (var14 < this.field3839) {
                    var10[var11] = this.field3839;
                } else if (~this.field3841 > ~var14) {
                    var10[var11] = this.field3841;
                } else {
                    var10[var11] = var14;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!bca", name = "c", descriptor = "(I)V")
    public static void method1783(int arg0) {
        if (arg0 != 2) {
            method1784(87);
        }
        field3845 = null;
    }

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "(ILnp;I)V")
    public final void method33(int arg0, class115 arg1, int arg2) {
        ++field3843;
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (arg2 == 2) {
                    super.field6881 = ~arg1.method620((byte) -126) == -2;
                }
            } else {
                this.field3841 = arg1.method643((byte) -77);
            }
        } else {
            this.field3839 = arg1.method643((byte) -77);
        }
        if (arg0 != 255) {
            field3846 = -89;
        }
    }

    @OriginalMember(owner = "client!bca", name = "<init>", descriptor = "()V")
    public class311() {
        super(1, false);
    }

    @OriginalMember(owner = "client!bca", name = "f", descriptor = "(I)I")
    public static final int method1784(int arg0) {
        if (arg0 != -18416) {
            return 50;
        } else {
            ++field3838;
            return class26.method148((byte) 115, false);
        }
    }

    @OriginalMember(owner = "client!bca", name = "b", descriptor = "(II)[I")
    public final int[] method35(int arg0, int arg1) {
        ++field3840;
        if (arg1 != -11323) {
            this.method33(40, (class115) null, 20);
        }
        int[] var3 = super.field6886.method789(arg0, (byte) 122);
        if (super.field6886.field1592) {
            int[] var4 = this.method2752(arg0, 117, 0);
            for (int var5 = 0; class436.field6154 > var5; ++var5) {
                int var6 = var4[var5];
                if (~this.field3839 >= ~var6) {
                    if (~this.field3841 <= ~var6) {
                        var3[var5] = var6;
                    } else {
                        var3[var5] = this.field3841;
                    }
                } else {
                    var3[var5] = this.field3839;
                }
            }
        }
        return var3;
    }
}
