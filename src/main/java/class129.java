import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public class class129 extends class86 {

    @OriginalMember(owner = "client!pg", name = "K", descriptor = "I")
    private int field2135 = -1;

    @OriginalMember(owner = "client!pg", name = "O", descriptor = "I")
    public static int field2139 = 0;

    @OriginalMember(owner = "client!pg", name = "M", descriptor = "[Lhg;")
    public static class162[] field2137 = new class162[14];

    @OriginalMember(owner = "client!pg", name = "T", descriptor = "I")
    public static int field2144 = 0;

    @OriginalMember(owner = "client!pg", name = "L", descriptor = "I")
    public static int field2136;

    @OriginalMember(owner = "client!pg", name = "N", descriptor = "I")
    public static int field2138;

    @OriginalMember(owner = "client!pg", name = "Q", descriptor = "I")
    private int field2141;

    @OriginalMember(owner = "client!pg", name = "R", descriptor = "I")
    public static int field2142;

    @OriginalMember(owner = "client!pg", name = "S", descriptor = "I")
    private int field2143;

    @OriginalMember(owner = "client!pg", name = "U", descriptor = "I")
    public static int field2145;

    @OriginalMember(owner = "client!pg", name = "V", descriptor = "I")
    public static int field2146;

    @OriginalMember(owner = "client!pg", name = "W", descriptor = "I")
    public static int field2147;

    @OriginalMember(owner = "client!pg", name = "P", descriptor = "[I")
    private int[] field2140;

    @OriginalMember(owner = "client!pg", name = "<init>", descriptor = "()V", line = 3)
    public class129() {
        super(0, false);
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IZLug;)V", line = 8)
    public final void method157(int arg0, boolean arg1, class25 arg2) {
        if (!arg1) {
            field2142++;
            if (arg0 == 0) {
                this.field2135 = arg2.method314((byte) 126);
            }
        }
    }

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "(B)V", line = 25)
    public static void method1115(byte arg0) {
        int var1 = 80 % ((-arg0 - 66) / 59);
        field2137 = null;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(Z)V", line = 34)
    public final void method779(boolean arg0) {
        field2138++;
        super.method779(arg0);
        if (!arg0) {
            this.method156(-127, (byte) -118);
        }
        this.field2140 = null;
    }

    @OriginalMember(owner = "client!pg", name = "e", descriptor = "(I)I", line = 46)
    public final int method776(int arg0) {
        if (arg0 != -1) {
            field2144 = 0;
        }
        field2145++;
        return this.field2135;
    }

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "(Z)Z", line = 62)
    private final boolean method1116(boolean arg0) {
        field2146++;
        if (this.field2140 != null) {
            return true;
        }
        if (!arg0) {
            method1115((byte) -88);
        }
        if (this.field2135 < 0) {
            return false;
        }
        int var2 = class93.field1424;
        int var3 = class181.field2836;
        int var4 = class300.field4654.method531((byte) -44, this.field2135).field3617 ? 64 : 128;
        this.field2140 = class300.field4654.method534(1.0F, false, var4, this.field2135, (byte) -127, var4);
        this.field2143 = var4;
        this.field2141 = var4;
        class295.method2129(var3, var2, (byte) -127);
        return this.field2140 != null;
    }

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "(IB)[[I", line = 109)
    public final int[][] method156(int arg0, byte arg1) {
        field2147++;
        int[][] var3 = this.field1227.method2025(false, arg0);
        if (this.field1227.field4277 && this.method1116(true)) {
            int var4 = this.field2143 * (class181.field2836 == this.field2141 ? arg0 : this.field2141 * arg0 / class181.field2836);
            int[] var5 = var3[0];
            int[] var6 = var3[2];
            int[] var7 = var3[1];
            if (class93.field1424 == this.field2143) {
                for (int var8 = 0; var8 < class93.field1424; var8++) {
                    int var9 = this.field2140[var4++];
                    var6[var8] = class301.method2169(var9, 255) << 4;
                    var7[var8] = class301.method2169(var9, 65280) >> 4;
                    var5[var8] = class301.method2169(var9, 16711680) >> 12;
                }
            } else {
                for (int var10 = 0; var10 < class93.field1424; var10++) {
                    int var11 = this.field2143 * var10 / class93.field1424;
                    int var12 = this.field2140[var4 + var11];
                    var6[var10] = class301.method2169(4080, var12 << 4);
                    var7[var10] = class301.method2169(4080, var12 >> 4);
                    var5[var10] = class301.method2169(var12, 16711680) >> 12;
                }
            }
        }
        if (arg1 >= -126) {
            this.field2143 = 44;
        }
        return var3;
    }
}
