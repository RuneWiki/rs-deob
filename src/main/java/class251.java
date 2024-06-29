import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class251 extends class305 {

    @OriginalMember(owner = "client!ma", name = "F", descriptor = "I")
    public static int field4087 = -1;

    @OriginalMember(owner = "client!ma", name = "H", descriptor = "I")
    public static int field4089 = -1;

    @OriginalMember(owner = "client!ma", name = "J", descriptor = "I")
    public static int field4091 = 0;

    @OriginalMember(owner = "client!ma", name = "D", descriptor = "I")
    public static int field4085;

    @OriginalMember(owner = "client!ma", name = "E", descriptor = "I")
    public static int field4086;

    @OriginalMember(owner = "client!ma", name = "G", descriptor = "I")
    public static int field4088;

    @OriginalMember(owner = "client!ma", name = "I", descriptor = "I")
    public static int field4090;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(IB)[[I")
    public final int[][] method72(int arg0, byte arg1) {
        ++field4086;
        if (arg1 >= -59) {
            field4087 = -72;
        }
        int[][] var3 = super.field4674.method2206(-93, arg0);
        if (super.field4674.field5110) {
            int[] var4 = this.method2021(2, arg0, 0);
            int[][] var5 = this.method2015(true, 0, arg0);
            int[][] var6 = this.method2015(true, 1, arg0);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            int[] var10 = var5[0];
            int[] var11 = var5[1];
            int[] var12 = var5[2];
            int[] var13 = var6[0];
            int[] var14 = var6[1];
            int[] var15 = var6[2];
            for (int var16 = 0; ~class91.field1471 < ~var16; ++var16) {
                int var17 = var4[var16];
                if (~var17 == -4097) {
                    var7[var16] = var10[var16];
                    var8[var16] = var11[var16];
                    var9[var16] = var12[var16];
                } else if (var17 == 0) {
                    var7[var16] = var13[var16];
                    var8[var16] = var14[var16];
                    var9[var16] = var15[var16];
                } else {
                    int var18 = -var17 + 4096;
                    var7[var16] = var10[var16] * var17 + var13[var16] * var18 >> 12;
                    var8[var16] = var11[var16] * var17 - -(var14[var16] * var18) >> 12;
                    var9[var16] = var12[var16] * var17 + var15[var16] * var18 >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(ILfh;B)V")
    public final void method14(int arg0, class194 arg1, byte arg2) {
        ++field4085;
        if (~arg0 == -1) {
            super.field4675 = arg1.method1337((byte) -116) == 1;
        }
        if (arg2 <= 76) {
            this.method14(-106, (class194) null, (byte) -11);
        }
    }

    @OriginalMember(owner = "client!ma", name = "<init>", descriptor = "()V")
    public class251() {
        super(3, false);
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(II)[I")
    public final int[] method15(int arg0, int arg1) {
        if (arg1 != 4688) {
            return null;
        } else {
            ++field4090;
            int[] var3 = super.field4677.method2174(arg0, -102);
            if (super.field4677.field5040) {
                int[] var4 = this.method2021(0, arg0, arg1 + -4688);
                int[] var5 = this.method2021(1, arg0, 0);
                int[] var6 = this.method2021(2, arg0, 0);
                for (int var7 = 0; ~var7 > ~class91.field1471; ++var7) {
                    int var8 = var6[var7];
                    if (~var8 == -4097) {
                        var3[var7] = var4[var7];
                    } else if (var8 == 0) {
                        var3[var7] = var5[var7];
                    } else {
                        var3[var7] = (-var8 + 4096) * var5[var7] + var4[var7] * var8 >> 12;
                    }
                }
            }
            return var3;
        }
    }
}
