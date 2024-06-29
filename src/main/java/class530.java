import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ks")
public class class530 extends class349 {

    @OriginalMember(owner = "client!ks", name = "C", descriptor = "I")
    private int field7328 = -1;

    @OriginalMember(owner = "client!ks", name = "E", descriptor = "S")
    public static short field7330 = 320;

    @OriginalMember(owner = "client!ks", name = "I", descriptor = "Lhv;")
    public static class97 field7334 = new class97();

    @OriginalMember(owner = "client!ks", name = "B", descriptor = "I")
    public static int field7327;

    @OriginalMember(owner = "client!ks", name = "D", descriptor = "I")
    public int field7329;

    @OriginalMember(owner = "client!ks", name = "F", descriptor = "I")
    public static int field7331;

    @OriginalMember(owner = "client!ks", name = "H", descriptor = "I")
    public static int field7333;

    @OriginalMember(owner = "client!ks", name = "J", descriptor = "I")
    public static int field7335;

    @OriginalMember(owner = "client!ks", name = "K", descriptor = "I")
    public int field7336;

    @OriginalMember(owner = "client!ks", name = "L", descriptor = "I")
    public static int field7337;

    @OriginalMember(owner = "client!ks", name = "M", descriptor = "I")
    public static int field7338;

    @OriginalMember(owner = "client!ks", name = "G", descriptor = "[I")
    public int[] field7332;

    @OriginalMember(owner = "client!ks", name = "<init>", descriptor = "()V")
    public class530() {
        super(0, false);
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(IIZII)V")
    public static final void method3011(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        ++field7333;
        class19 var5 = class364.method2236(1248116640, arg4, 4);
        var5.method110(12142);
        var5.field173 = arg3;
        var5.field180 = arg0;
        var5.field171 = arg1;
        if (arg2) {
            field7330 = -37;
        }
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(IB)[[I")
    public int[][] method9(int arg0, byte arg1) {
        ++field7327;
        int var3 = 72 % ((-32 - arg1) / 47);
        int[][] var4 = super.field5103.method2268(true, arg0);
        if (super.field5103.field5314 && this.method3012(-90)) {
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int var8 = (class442.field6080 == this.field7336 ? arg0 : this.field7336 * arg0 / class442.field6080) * this.field7329;
            if (~class39.field497 == ~this.field7329) {
                for (int var9 = 0; class39.field497 > var9; ++var9) {
                    int var10 = this.field7332[var8++];
                    var7[var9] = class230.method1424(var10 << 4, 4080);
                    var6[var9] = class230.method1424(65280, var10) >> 4;
                    var5[var9] = class230.method1424(var10 >> 12, 4080);
                }
            } else {
                for (int var11 = 0; var11 < class39.field497; ++var11) {
                    int var12 = this.field7329 * var11 / class39.field497;
                    int var13 = this.field7332[var8 + var12];
                    var7[var11] = class230.method1424(var13, 255) << 4;
                    var6[var11] = class230.method1424(65280, var13) >> 4;
                    var5[var11] = class230.method1424(var13, 16711680) >> 12;
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!ks", name = "f", descriptor = "(I)Z")
    public final boolean method3012(int arg0) {
        ++field7331;
        if (this.field7332 != null) {
            return true;
        } else if (this.field7328 >= 0) {
            class366 var2 = ~class454.field6200 <= -1 ? class366.method2245(class98.field1200, class454.field6200, this.field7328) : class366.method2247(class98.field1200, this.field7328);
            var2.method2254();
            this.field7332 = var2.method2243();
            this.field7329 = var2.field5252;
            this.field7336 = var2.field5253;
            return true;
        } else {
            int var3 = -98 / ((arg0 - -5) / 37);
            return false;
        }
    }

    @OriginalMember(owner = "client!ks", name = "c", descriptor = "(I)V")
    public final void method2186(int arg0) {
        super.method2186(arg0 + arg0);
        ++field7337;
        this.field7332 = null;
    }

    @OriginalMember(owner = "client!ks", name = "g", descriptor = "(I)V")
    public static void method3013(int arg0) {
        if (arg0 < 95) {
            method3011(-127, 77, true, 70, 95);
        }
        field7334 = null;
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(IILdga;)V")
    public final void method5(int arg0, int arg1, class138 arg2) {
        if (arg0 == 4095) {
            if (~arg1 == -1) {
                this.field7328 = arg2.method922((byte) -120);
            }
            ++field7338;
        }
    }

    @OriginalMember(owner = "client!ks", name = "b", descriptor = "(I)I")
    public final int method2185(int arg0) {
        int var2 = -72 / ((arg0 - 19) / 40);
        ++field7335;
        return this.field7328;
    }
}
