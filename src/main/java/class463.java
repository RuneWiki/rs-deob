import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public class class463 extends class148 {

    @OriginalMember(owner = "client!mj", name = "P", descriptor = "I")
    private int field6862 = 0;

    @OriginalMember(owner = "client!mj", name = "R", descriptor = "I")
    private int field6864 = 4096;

    @OriginalMember(owner = "client!mj", name = "K", descriptor = "[S")
    public static short[] field6857 = new short[] { 960, 957, -21568, -21571, 22464 };

    @OriginalMember(owner = "client!mj", name = "J", descriptor = "I")
    public static int field6856 = 0;

    @OriginalMember(owner = "client!mj", name = "Q", descriptor = "I")
    public static int field6863 = 0;

    @OriginalMember(owner = "client!mj", name = "S", descriptor = "I")
    public static int field6865 = 4;

    @OriginalMember(owner = "client!mj", name = "M", descriptor = "I")
    public static int field6859;

    @OriginalMember(owner = "client!mj", name = "N", descriptor = "I")
    public static int field6860;

    @OriginalMember(owner = "client!mj", name = "O", descriptor = "I")
    public static int field6861;

    @OriginalMember(owner = "client!mj", name = "L", descriptor = "Lue;")
    public static class154 field6858;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(ILdh;I)V", line = 11)
    public final void method23(int arg0, class209 arg1, int arg2) {
        int var4 = 30 / ((-88 - arg2) / 33);
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (arg0 == 2) {
                    super.field2183 = ~arg1.method1428(32122) == -2;
                }
            } else {
                this.field6864 = arg1.method1450((byte) 80);
            }
        } else {
            this.field6862 = arg1.method1450((byte) 126);
        }
        ++field6860;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(II)[I", line = 56)
    public final int[] method25(int arg0, int arg1) {
        ++field6861;
        int[] var3 = super.field2193.method497(arg1, false);
        if (super.field2193.field1312) {
            int[] var4 = this.method971(false, arg1, 0);
            for (int var5 = 0; var5 < class320.field4579; ++var5) {
                int var6 = var4[var5];
                if (~this.field6862 < ~var6) {
                    var3[var5] = this.field6862;
                } else if (~var6 < ~this.field6864) {
                    var3[var5] = this.field6864;
                } else {
                    var3[var5] = var6;
                }
            }
        }
        return arg0 >= -65 ? null : var3;
    }

    @OriginalMember(owner = "client!mj", name = "<init>", descriptor = "()V", line = 105)
    public class463() {
        super(1, false);
    }

    @OriginalMember(owner = "client!mj", name = "e", descriptor = "(I)V", line = 119)
    public static void method2786(int arg0) {
        field6857 = null;
        field6858 = null;
        if (arg0 >= -39) {
            field6856 = 9;
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(ZI)[[I", line = 137)
    public final int[][] method27(boolean arg0, int arg1) {
        ++field6859;
        if (!arg0) {
            this.method25(52, 3);
        }
        int[][] var3 = super.field2189.method2422(-2, arg1);
        if (super.field2189.field6033) {
            int[][] var4 = this.method974(arg0, 0, arg1);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~var11 > ~class320.field4579; ++var11) {
                int var12 = var5[var11];
                int var13 = var6[var11];
                int var14 = var7[var11];
                if (~var12 <= ~this.field6862) {
                    if (var12 > this.field6864) {
                        var8[var11] = this.field6864;
                    } else {
                        var8[var11] = var12;
                    }
                } else {
                    var8[var11] = this.field6862;
                }
                if (~var13 > ~this.field6862) {
                    var9[var11] = this.field6862;
                } else if (var13 <= this.field6864) {
                    var9[var11] = var13;
                } else {
                    var9[var11] = this.field6864;
                }
                if (var14 >= this.field6862) {
                    if (~var14 < ~this.field6864) {
                        var10[var11] = this.field6864;
                    } else {
                        var10[var11] = var14;
                    }
                } else {
                    var10[var11] = this.field6862;
                }
            }
        }
        return var3;
    }
}
