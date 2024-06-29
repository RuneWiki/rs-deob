import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public class class449 extends class297 {

    @OriginalMember(owner = "client!uf", name = "I", descriptor = "I")
    private int field6343 = 4096;

    @OriginalMember(owner = "client!uf", name = "L", descriptor = "I")
    private int field6346 = 4096;

    @OriginalMember(owner = "client!uf", name = "S", descriptor = "I")
    private int field6353 = 4096;

    @OriginalMember(owner = "client!uf", name = "K", descriptor = "I")
    public static int field6345 = 0;

    @OriginalMember(owner = "client!uf", name = "Q", descriptor = "Z")
    public static boolean field6351 = true;

    @OriginalMember(owner = "client!uf", name = "P", descriptor = "[Z")
    public static boolean[] field6350 = new boolean[8];

    @OriginalMember(owner = "client!uf", name = "J", descriptor = "I")
    public static int field6344;

    @OriginalMember(owner = "client!uf", name = "M", descriptor = "I")
    public static int field6347;

    @OriginalMember(owner = "client!uf", name = "N", descriptor = "I")
    public static int field6348;

    @OriginalMember(owner = "client!uf", name = "O", descriptor = "I")
    public static int field6349;

    @OriginalMember(owner = "client!uf", name = "R", descriptor = "I")
    public static int field6352;

    @OriginalMember(owner = "client!uf", name = "T", descriptor = "I")
    public static int field6354;

    @OriginalMember(owner = "client!uf", name = "<init>", descriptor = "()V", line = 230)
    public class449() {
        super(1, false);
    }

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "(B)V", line = 9)
    public static void method2683(byte arg0) {
        field6350 = null;
        int var1 = 37 / ((28 - arg0) / 61);
    }

    @OriginalMember(owner = "client!uf", name = "d", descriptor = "(III)Z", line = 20)
    public static final boolean method2684(int arg0, int arg1, int arg2) {
        if (arg1 <= 39) {
            method2684(-106, 118, -21);
        }
        ++field6354;
        return ~(arg0 & 50560) != -1;
    }

    @OriginalMember(owner = "client!uf", name = "d", descriptor = "(II)[[I", line = 39)
    public final int[][] method18(int arg0, int arg1) {
        if (arg1 != -1564599039) {
            return null;
        } else {
            ++field6352;
            int[][] var3 = super.field4166.method2180(arg1 + 1564598957, arg0);
            if (super.field4166.field4849) {
                int[][] var4 = this.method1948((byte) -60, arg0, 0);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                int[] var8 = var3[0];
                int[] var9 = var3[1];
                int[] var10 = var3[2];
                for (int var11 = 0; ~class525.field7275 < ~var11; ++var11) {
                    int var12 = var5[var11];
                    int var13 = var7[var11];
                    int var14 = var6[var11];
                    if (var12 == var13 && ~var13 == ~var14) {
                        var8[var11] = this.field6343 * var12 >> 12;
                        var9[var11] = this.field6353 * var13 >> 12;
                        var10[var11] = this.field6346 * var14 >> 12;
                    } else {
                        var8[var11] = this.field6343;
                        var9[var11] = this.field6353;
                        var10[var11] = this.field6346;
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!uf", name = "f", descriptor = "(I)V", line = 105)
    public static final void method2685(int arg0) {
        class482.field6727 = 0;
        ++field6344;
        int var1 = class149.field2477.method1490((byte) -118);
        int var2 = class149.field2477.method1506(-117);
        int var3 = class149.field2477.method1521(false);
        boolean var4 = ~class149.field2477.method1477((byte) 21) == -2;
        class346.method2177((byte) -45);
        class459.method2723(111, var1);
        int var5 = (-class149.field2477.field3109 + class57.field1142) / 16;
        class621.field8449 = new int[var5][4];
        for (int var6 = 0; var6 < var5; ++var6) {
            for (int var10 = 0; var10 < 4; ++var10) {
                class621.field8449[var6][var10] = class149.field2477.method1533((byte) -126);
            }
        }
        class689.field9303 = new byte[var5][];
        class417.field6044 = new byte[var5][];
        class683.field9251 = new int[var5];
        class204.field2942 = new byte[var5][];
        class355.field5025 = new int[var5];
        class568.field7815 = null;
        class184.field2787 = new int[var5];
        class346.field4845 = null;
        class109.field1900 = new byte[var5][];
        if (arg0 >= -47) {
            field6348 = -54;
        }
        class67.field1266 = new int[var5];
        class199.field2905 = new int[var5];
        int var7 = 0;
        for (int var8 = (-(class376.field5325 >> 4) + var3) / 8; var8 <= ((class376.field5325 >> 4) + var3) / 8; ++var8) {
            for (int var9 = (var2 - (class175.field2711 >> 4)) / 8; ~(((class175.field2711 >> 4) + var2) / 8) <= ~var9; ++var9) {
                class199.field2905[var7] = (var8 << 8) + var9;
                class683.field9251[var7] = class171.field2666.method870("m" + var8 + "_" + var9, 0);
                class355.field5025[var7] = class171.field2666.method870("l" + var8 + "_" + var9, 0);
                class67.field1266[var7] = class171.field2666.method870("um" + var8 + "_" + var9, 0);
                class184.field2787[var7] = class171.field2666.method870("ul" + var8 + "_" + var9, 0);
                ++var7;
            }
        }
        class432.method2627(var2, (byte) 123, var3, 11, var4);
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(Lcea;II)V", line = 183)
    public final void method17(class215 arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (~arg1 == -3) {
                    this.field6346 = arg0.method1478(842397944);
                }
            } else {
                this.field6353 = arg0.method1478(842397944);
            }
        } else {
            this.field6343 = arg0.method1478(arg2 + 842366929);
        }
        ++field6349;
        if (arg2 != 31015) {
            method2683((byte) 96);
        }
    }
}
