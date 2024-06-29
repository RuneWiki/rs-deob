import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class275 extends class335 {

    @OriginalMember(owner = "client!uc", name = "F", descriptor = "[B")
    public static byte[] field3661 = new byte[520];

    @OriginalMember(owner = "client!uc", name = "D", descriptor = "I")
    public static int field3659 = -1;

    @OriginalMember(owner = "client!uc", name = "C", descriptor = "I")
    public static int field3658 = 0;

    @OriginalMember(owner = "client!uc", name = "B", descriptor = "I")
    public static int field3657;

    @OriginalMember(owner = "client!uc", name = "E", descriptor = "I")
    public static int field3660;

    @OriginalMember(owner = "client!uc", name = "G", descriptor = "I")
    public static int field3662;

    @OriginalMember(owner = "client!uc", name = "<init>", descriptor = "()V")
    public class275() {
        super(3, false);
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(ILio;I)V")
    public final void method2(int arg0, class157 arg1, int arg2) {
        ++field3662;
        if (arg2 != -66) {
            this.method2(15, (class157) null, 23);
        }
        if (arg0 == 0) {
            super.field4537 = ~arg1.method930(255) == -2;
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method1(int arg0, boolean arg1) {
        ++field3657;
        int[][] var3 = super.field4527.method669(arg0, (byte) 2);
        if (arg1) {
            return null;
        } else {
            if (super.field4527.field1468) {
                int[] var4 = this.method1969(2, arg0, -80);
                int[][] var5 = this.method1968(arg0, 3, 0);
                int[][] var6 = this.method1968(arg0, 3, 1);
                int[] var7 = var3[0];
                int[] var8 = var3[1];
                int[] var9 = var3[2];
                int[] var10 = var5[0];
                int[] var11 = var5[1];
                int[] var12 = var5[2];
                int[] var13 = var6[0];
                int[] var14 = var6[1];
                int[] var15 = var6[2];
                for (int var16 = 0; class649.field8968 > var16; ++var16) {
                    int var17 = var4[var16];
                    if (~var17 == -4097) {
                        var7[var16] = var10[var16];
                        var8[var16] = var11[var16];
                        var9[var16] = var12[var16];
                    } else if (~var17 == -1) {
                        var7[var16] = var13[var16];
                        var8[var16] = var14[var16];
                        var9[var16] = var15[var16];
                    } else {
                        int var18 = -var17 + 4096;
                        var7[var16] = var10[var16] * var17 + var13[var16] * var18 >> 12;
                        var8[var16] = var11[var16] * var17 + var14[var16] * var18 >> 12;
                        var9[var16] = var12[var16] * var17 + var15[var16] * var18 >> 12;
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "(B)V")
    public static void method1654(byte arg0) {
        if (arg0 != -7) {
            field3661 = null;
        }
        field3661 = null;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(ZI)[I")
    public final int[] method3(boolean arg0, int arg1) {
        ++field3660;
        int[] var3 = super.field4525.method2344(-2, arg1);
        if (!arg0) {
            field3658 = 29;
        }
        if (super.field4525.field5435) {
            int[] var4 = this.method1969(0, arg1, -95);
            int[] var5 = this.method1969(1, arg1, -111);
            int[] var6 = this.method1969(2, arg1, -83);
            for (int var7 = 0; class649.field8968 > var7; ++var7) {
                int var8 = var6[var7];
                if (var8 != 4096) {
                    if (~var8 != -1) {
                        var3[var7] = (4096 - var8) * var5[var7] + var4[var7] * var8 >> 12;
                    } else {
                        var3[var7] = var5[var7];
                    }
                } else {
                    var3[var7] = var4[var7];
                }
            }
        }
        return var3;
    }
}
