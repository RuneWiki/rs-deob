import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hm")
public class class147 extends class136 {

    @OriginalMember(owner = "client!hm", name = "C", descriptor = "I")
    private int field2061 = 0;

    @OriginalMember(owner = "client!hm", name = "E", descriptor = "I")
    private int field2063 = 4096;

    @OriginalMember(owner = "client!hm", name = "F", descriptor = "I")
    public static int field2064;

    @OriginalMember(owner = "client!hm", name = "H", descriptor = "I")
    public static int field2066;

    @OriginalMember(owner = "client!hm", name = "I", descriptor = "I")
    public static int field2067;

    @OriginalMember(owner = "client!hm", name = "J", descriptor = "I")
    public static int field2068;

    @OriginalMember(owner = "client!hm", name = "G", descriptor = "Lfs;")
    public static class387 field2065;

    @OriginalMember(owner = "client!hm", name = "D", descriptor = "[Ll;")
    public static class16[] field2062;

    @OriginalMember(owner = "client!hm", name = "f", descriptor = "(I)V")
    public static void method1067(int arg0) {
        field2065 = null;
        if (arg0 != 2) {
            method1067(-36);
        }
        field2062 = null;
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(II)[I")
    public final int[] method82(int arg0, int arg1) {
        ++field2066;
        int[] var3 = super.field1957.method2887((byte) -112, arg1);
        int var4 = -99 % ((67 - arg0) / 50);
        if (super.field1957.field7031) {
            int[] var5 = this.method1033(arg1, 0, 0);
            for (int var6 = 0; ~var6 > ~class467.field6889; ++var6) {
                int var7 = var5[var6];
                if (~this.field2061 >= ~var7) {
                    if (~this.field2063 > ~var7) {
                        var3[var6] = this.field2063;
                    } else {
                        var3[var6] = var7;
                    }
                } else {
                    var3[var6] = this.field2061;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(IILiv;)V")
    public final void method268(int arg0, int arg1, class65 arg2) {
        if (arg0 != 4) {
            this.method272((byte) -72, 20);
        }
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (arg1 == 2) {
                    super.field1966 = ~arg2.method577(arg0 ^ 251) == -2;
                }
            } else {
                this.field2063 = arg2.method623((byte) 114);
            }
        } else {
            this.field2061 = arg2.method623((byte) 93);
        }
        ++field2068;
    }

    @OriginalMember(owner = "client!hm", name = "<init>", descriptor = "()V")
    public class147() {
        super(1, false);
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(BI)[[I")
    public final int[][] method272(byte arg0, int arg1) {
        ++field2064;
        int[][] var3 = super.field1952.method3127((byte) 69, arg1);
        if (super.field1952.field7770) {
            int[][] var4 = this.method1036(3, 0, arg1);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; class467.field6889 > var11; ++var11) {
                int var12 = var5[var11];
                int var13 = var6[var11];
                int var14 = var7[var11];
                if (this.field2061 <= var12) {
                    if (var12 > this.field2063) {
                        var8[var11] = this.field2063;
                    } else {
                        var8[var11] = var12;
                    }
                } else {
                    var8[var11] = this.field2061;
                }
                if (var13 < this.field2061) {
                    var9[var11] = this.field2061;
                } else if (~this.field2063 > ~var13) {
                    var9[var11] = this.field2063;
                } else {
                    var9[var11] = var13;
                }
                if (~var14 <= ~this.field2061) {
                    if (this.field2063 < var14) {
                        var10[var11] = this.field2063;
                    } else {
                        var10[var11] = var14;
                    }
                } else {
                    var10[var11] = this.field2061;
                }
            }
        }
        if (arg0 <= 33) {
            field2065 = null;
        }
        return var3;
    }
}
