import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ks")
public class class252 extends class436 {

    @OriginalMember(owner = "client!ks", name = "H", descriptor = "I")
    private int field3468 = 0;

    @OriginalMember(owner = "client!ks", name = "K", descriptor = "I")
    private int field3471 = 4096;

    @OriginalMember(owner = "client!ks", name = "L", descriptor = "Ljava/lang/String;")
    public static String field3472 = "yellow:";

    @OriginalMember(owner = "client!ks", name = "I", descriptor = "I")
    public static int field3469;

    @OriginalMember(owner = "client!ks", name = "J", descriptor = "I")
    public static int field3470;

    @OriginalMember(owner = "client!ks", name = "M", descriptor = "I")
    public static int field3473;

    @OriginalMember(owner = "client!ks", name = "N", descriptor = "I")
    public static int field3474;

    @OriginalMember(owner = "client!ks", name = "O", descriptor = "I")
    public static int field3475;

    @OriginalMember(owner = "client!ks", name = "G", descriptor = "Lfa;")
    public static class128 field3467;

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(II)[I", line = 5)
    public final int[] method14(int arg0, int arg1) {
        ++field3475;
        if (arg1 != 18338) {
            this.method85(-113, -26);
        }
        int[] var3 = super.field6258.method2688((byte) -122, arg0);
        if (super.field6258.field6138) {
            int[] var4 = this.method2729(0, 0, arg0);
            for (int var5 = 0; ~var5 > ~class43.field653; ++var5) {
                int var6 = var4[var5];
                if (var6 < this.field3468) {
                    var3[var5] = this.field3468;
                } else if (~this.field3471 > ~var6) {
                    var3[var5] = this.field3471;
                } else {
                    var3[var5] = var6;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ks", name = "b", descriptor = "(II)[[I", line = 47)
    public final int[][] method85(int arg0, int arg1) {
        ++field3474;
        if (arg0 != -13348) {
            return null;
        } else {
            int[][] var3 = super.field6259.method1848((byte) 63, arg1);
            if (super.field6259.field3950) {
                int[][] var4 = this.method2731(arg1, false, 0);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                int[] var8 = var3[0];
                int[] var9 = var3[1];
                int[] var10 = var3[2];
                for (int var11 = 0; var11 < class43.field653; ++var11) {
                    int var12 = var5[var11];
                    int var13 = var6[var11];
                    int var14 = var7[var11];
                    if (~var12 > ~this.field3468) {
                        var8[var11] = this.field3468;
                    } else if (~this.field3471 <= ~var12) {
                        var8[var11] = var12;
                    } else {
                        var8[var11] = this.field3471;
                    }
                    if (this.field3468 > var13) {
                        var9[var11] = this.field3468;
                    } else if (~var13 < ~this.field3471) {
                        var9[var11] = this.field3471;
                    } else {
                        var9[var11] = var13;
                    }
                    if (~this.field3468 < ~var14) {
                        var10[var11] = this.field3468;
                    } else if (~var14 < ~this.field3471) {
                        var10[var11] = this.field3471;
                    } else {
                        var10[var11] = var14;
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ks", name = "f", descriptor = "(I)V", line = 126)
    public static void method1556(int arg0) {
        field3472 = null;
        field3467 = null;
        int var1 = -67 % ((25 - arg0) / 62);
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(IILeb;)V", line = 136)
    public final void method18(int arg0, int arg1, class371 arg2) {
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (~arg1 == -3) {
                    super.field6256 = arg2.method2429(0) == 1;
                }
            } else {
                this.field3471 = arg2.method2403((byte) 55);
            }
        } else {
            this.field3468 = arg2.method2403((byte) 41);
        }
        if (arg0 != 34) {
            this.method18(123, -47, (class371) null);
        }
        ++field3470;
    }

    @OriginalMember(owner = "client!ks", name = "<init>", descriptor = "()V", line = 212)
    public class252() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ks", name = "b", descriptor = "(III)B", line = 195)
    public static final byte method1557(int arg0, int arg1, int arg2) {
        ++field3469;
        if (arg1 != arg2) {
            return 0;
        } else {
            return (byte) (~(arg0 & 1) == -1 ? 1 : 2);
        }
    }
}
