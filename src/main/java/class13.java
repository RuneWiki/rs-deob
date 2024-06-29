import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vl")
public class class13 extends class466 {

    @OriginalMember(owner = "client!vl", name = "E", descriptor = "I")
    private int field186 = 32768;

    @OriginalMember(owner = "client!vl", name = "H", descriptor = "I")
    public static int field189 = 1337;

    @OriginalMember(owner = "client!vl", name = "F", descriptor = "I")
    public static int field187;

    @OriginalMember(owner = "client!vl", name = "G", descriptor = "I")
    public static int field188;

    @OriginalMember(owner = "client!vl", name = "I", descriptor = "I")
    public static int field190;

    @OriginalMember(owner = "client!vl", name = "J", descriptor = "I")
    public static int field191;

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(Ldaa;II)V")
    public final void method6(class11 arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            if (arg2 == 1) {
                super.field6565 = arg0.method110((byte) 89) == 1;
            }
        } else {
            this.field186 = arg0.method93((byte) 102) << 4;
        }
        ++field190;
        if (arg1 != -5062) {
            this.method7(102);
        }
    }

    @OriginalMember(owner = "client!vl", name = "c", descriptor = "(I)V")
    public final void method7(int arg0) {
        if (arg0 != -806066388) {
            field189 = -15;
        }
        ++field187;
        class225.method1442(arg0 ^ -806066644);
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method33(int arg0, boolean arg1) {
        ++field191;
        if (arg1) {
            this.field186 = -40;
        }
        int[][] var3 = super.field6569.method828((byte) 10, arg0);
        if (super.field6569.field1934) {
            int[] var4 = this.method2721(1, arg0, 2);
            int[] var5 = this.method2721(2, arg0, 2);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            for (int var9 = 0; class312.field4207 > var9; ++var9) {
                int var10 = (1047851 & var4[var9] * 255) >> 12;
                int var11 = var5[var9] * this.field186 >> 12;
                int var12 = class46.field898[var10] * var11 >> 12;
                int var13 = class566.field7828[var10] * var11 >> 12;
                int var14 = (var12 >> 12) + var9 & class340.field4582;
                int var15 = class105.field1581 & (var13 >> 12) + arg0;
                int[][] var16 = this.method2719(0, var15, 5);
                var6[var9] = var16[0][var14];
                var7[var9] = var16[1][var14];
                var8[var9] = var16[2][var14];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(II)[I")
    public final int[] method2(int arg0, int arg1) {
        ++field188;
        int[] var3 = super.field6557.method565(arg0, -24728);
        if (arg1 != 0) {
            this.method6((class11) null, -101, 87);
        }
        if (super.field6557.field1163) {
            int[] var4 = this.method2721(1, arg0, 2);
            int[] var5 = this.method2721(2, arg0, arg1 ^ 2);
            for (int var6 = 0; var6 < class312.field4207; ++var6) {
                int var7 = (4095 & var4[var6]) >> 4;
                int var8 = var5[var6] * this.field186 >> 12;
                int var9 = class46.field898[var7] * var8 >> 12;
                int var10 = class566.field7828[var7] * var8 >> 12;
                int var11 = class340.field4582 & (var9 >> 12) + var6;
                int var12 = (var10 >> 12) + arg0 & class105.field1581;
                int[] var13 = this.method2721(0, var12, 2);
                var3[var6] = var13[var11];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!vl", name = "<init>", descriptor = "()V")
    public class13() {
        super(3, false);
    }
}
