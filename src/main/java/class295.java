import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fl")
public class class295 extends class182 {

    @OriginalMember(owner = "client!fl", name = "O", descriptor = "I")
    private int field4836 = 0;

    @OriginalMember(owner = "client!fl", name = "S", descriptor = "I")
    private int field4840 = 4096;

    @OriginalMember(owner = "client!fl", name = "R", descriptor = "I")
    public static int field4839 = -2;

    @OriginalMember(owner = "client!fl", name = "T", descriptor = "I")
    public static int field4841 = 0;

    @OriginalMember(owner = "client!fl", name = "X", descriptor = "I")
    public static int field4845 = 0;

    @OriginalMember(owner = "client!fl", name = "P", descriptor = "I")
    public static int field4837;

    @OriginalMember(owner = "client!fl", name = "Q", descriptor = "I")
    public static int field4838;

    @OriginalMember(owner = "client!fl", name = "U", descriptor = "I")
    public static int field4842;

    @OriginalMember(owner = "client!fl", name = "V", descriptor = "I")
    public static int field4843;

    @OriginalMember(owner = "client!fl", name = "W", descriptor = "I")
    public static int field4844;

    @OriginalMember(owner = "client!fl", name = "<init>", descriptor = "()V")
    public class295() {
        super(1, false);
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(ZI)[I")
    public final int[] method153(boolean arg0, int arg1) {
        ++field4837;
        if (arg0) {
            field4845 = 123;
        }
        int[] var3 = super.field2911.method77(arg1, -30);
        if (super.field2911.field287) {
            int[] var4 = this.method1323(0, -17707, arg1);
            for (int var5 = 0; class4.field116 > var5; ++var5) {
                int var6 = var4[var5];
                if (this.field4836 > var6) {
                    var3[var5] = this.field4836;
                } else if (~this.field4840 <= ~var6) {
                    var3[var5] = var6;
                } else {
                    var3[var5] = this.field4840;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(Lob;BLob;)V")
    public static final void method2036(class134 arg0, byte arg1, class134 arg2) {
        ++field4843;
        if (arg1 != 13) {
            method2037((byte) -127, 2);
        }
        if (arg0.field2202 != null) {
            arg0.method993(32);
        }
        arg0.field2202 = arg2.field2202;
        arg0.field2209 = arg2;
        arg0.field2202.field2209 = arg0;
        arg0.field2209.field2202 = arg0;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(BI)[[I")
    public final int[][] method157(byte arg0, int arg1) {
        ++field4844;
        int var3 = -41 % ((arg0 - -64) / 49);
        int[][] var4 = super.field2905.method50(arg1, (byte) 115);
        if (super.field2905.field158) {
            int[][] var5 = this.method1327(0, 0, arg1);
            int[] var6 = var5[1];
            int[] var7 = var5[0];
            int[] var8 = var5[2];
            int[] var9 = var4[1];
            int[] var10 = var4[0];
            int[] var11 = var4[2];
            for (int var12 = 0; ~var12 > ~class4.field116; ++var12) {
                int var13 = var7[var12];
                int var14 = var8[var12];
                int var15 = var6[var12];
                if (~this.field4836 < ~var13) {
                    var10[var12] = this.field4836;
                } else if (~this.field4840 <= ~var13) {
                    var10[var12] = var13;
                } else {
                    var10[var12] = this.field4840;
                }
                if (~this.field4836 >= ~var15) {
                    if (~this.field4840 > ~var15) {
                        var9[var12] = this.field4840;
                    } else {
                        var9[var12] = var15;
                    }
                } else {
                    var9[var12] = this.field4836;
                }
                if (~this.field4836 >= ~var14) {
                    if (var14 > this.field4840) {
                        var11[var12] = this.field4840;
                    } else {
                        var11[var12] = var14;
                    }
                } else {
                    var11[var12] = this.field4836;
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "(BI)V")
    public static final void method2037(byte arg0, int arg1) {
        ++field4838;
        for (class134 var2 = class121.field2021.method982(-9570); var2 != null; var2 = class121.field2021.method981(-1)) {
            if ((long) arg1 == (var2.field2213 >> 48 & 65535L)) {
                var2.method993(32);
            }
        }
        if (arg0 < 46) {
            method2037((byte) -45, -126);
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(ZLab;I)V")
    public final void method155(boolean arg0, class249 arg1, int arg2) {
        ++field4842;
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (arg2 == 2) {
                    super.field2896 = arg1.method1802((byte) 89) == 1;
                }
            } else {
                this.field4840 = arg1.method1821((byte) 51);
            }
        } else {
            this.field4836 = arg1.method1821((byte) 51);
        }
        if (arg0) {
            this.method155(true, (class249) null, 11);
        }
    }
}
