import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ml")
public class class172 {

    @OriginalMember(owner = "client!ml", name = "k", descriptor = "I")
    public static int field2837 = 1;

    @OriginalMember(owner = "client!ml", name = "h", descriptor = "I")
    public static int field2834 = 0;

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "B")
    public byte field2827;

    @OriginalMember(owner = "client!ml", name = "n", descriptor = "B")
    public byte field2840;

    @OriginalMember(owner = "client!ml", name = "r", descriptor = "B")
    public byte field2844;

    @OriginalMember(owner = "client!ml", name = "s", descriptor = "B")
    public byte field2845;

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "I")
    public static int field2828;

    @OriginalMember(owner = "client!ml", name = "d", descriptor = "I")
    public static int field2830;

    @OriginalMember(owner = "client!ml", name = "f", descriptor = "I")
    public static int field2832;

    @OriginalMember(owner = "client!ml", name = "g", descriptor = "I")
    public static int field2833;

    @OriginalMember(owner = "client!ml", name = "l", descriptor = "I")
    public static int field2838;

    @OriginalMember(owner = "client!ml", name = "m", descriptor = "I")
    public static int field2839;

    @OriginalMember(owner = "client!ml", name = "o", descriptor = "I")
    public static int field2841;

    @OriginalMember(owner = "client!ml", name = "c", descriptor = "Lug;")
    public static class253 field2829;

    @OriginalMember(owner = "client!ml", name = "j", descriptor = "S")
    public short field2836;

    @OriginalMember(owner = "client!ml", name = "e", descriptor = "Z")
    public boolean field2831;

    @OriginalMember(owner = "client!ml", name = "i", descriptor = "Z")
    public boolean field2835;

    @OriginalMember(owner = "client!ml", name = "p", descriptor = "Z")
    public boolean field2842;

    @OriginalMember(owner = "client!ml", name = "t", descriptor = "Z")
    public boolean field2846;

    @OriginalMember(owner = "client!ml", name = "u", descriptor = "Z")
    public boolean field2847;

    @OriginalMember(owner = "client!ml", name = "q", descriptor = "[[[I")
    public static int[][][] field2843;

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(Lo;B)V", line = 10)
    public static final void method1282(class15 arg0, byte arg1) {
        if (arg1 != 73) {
            method1282((class15) null, (byte) 27);
        }
        field2841++;
        class284.method2011(arg1 ^ 0x49, arg0, 200000);
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(I)V", line = 51)
    public static final void method1283(int arg0) {
        while (true) {
            class207 var1 = (class207) class69.field963.method24(0);
            if (var1 == null) {
                field2833++;
                if (arg0 != 3) {
                    field2829 = (class253) null;
                }
                return;
            }
            class303 var3;
            if (var1.field3293 >= 0) {
                int var2 = var1.field3293 - 1;
                var3 = class59.field870[var2];
            } else {
                int var4 = -var1.field3293 - 1;
                if (class92.field1231 == var4) {
                    var3 = class146.field2310;
                } else {
                    var3 = class284.field4403[var4];
                }
            }
            if (var3 != null) {
                class121 var5 = class249.method1790(arg0 + 49, var1.field3291);
                if (class154.field2392 >= 3) {
                }
                int[][] var6 = field2843[class154.field2392];
                class248 var7 = null;
                int var8 = class95.field1260[var1.field3299];
                int var9;
                int var10;
                if (var1.field3296 == 1 || var1.field3296 == 3) {
                    var9 = var5.field1734;
                    var10 = var5.field1724;
                } else {
                    var9 = var5.field1724;
                    var10 = var5.field1734;
                }
                int var11 = var1.field3292 + (var10 + 1 >> 1);
                int var12 = (var10 >> 1) + var1.field3292;
                int var13 = (var9 >> 1) + var1.field3289;
                int var14 = var1.field3289 + (var9 + 1 >> 1);
                int var15 = var6[var13][var11] + var6[var14][var11] + var6[var14][var12] + var6[var13][var12] >> 2;
                if (var8 == 0) {
                    class102 var19 = class128.method935(class154.field2392, var1.field3289, var1.field3292);
                    if (var19 != null) {
                        var7 = var19.field1362;
                    }
                } else if (var8 == 1) {
                    class283 var16 = class126.method915(class154.field2392, var1.field3289, var1.field3292);
                    if (var16 != null) {
                        var7 = var16.field4382;
                    }
                } else if (var8 == 2) {
                    class263 var18 = class117.method826(class154.field2392, var1.field3289, var1.field3292);
                    if (var18 != null) {
                        var7 = var18.field4118;
                    }
                } else if (var8 == 3) {
                    class138 var17 = class253.method1840(class154.field2392, var1.field3289, var1.field3292);
                    if (var17 != null) {
                        var7 = var17.field2205;
                    }
                }
                if (var7 != null) {
                    class84.method611(var1.field3289, 0, 0, -1, var8, var1.field3294 + 1, 110, var1.field3288 + 1, class154.field2392, var1.field3292);
                    var3.field4740 = var1.field3292 * 128 + var10 * 64;
                    var3.field4666 = var7;
                    var3.field4737 = var1.field3294 + class229.field3595;
                    var3.field4720 = var1.field3289 * 128 + var9 * 64;
                    int var20 = var1.field3297;
                    int var21 = var1.field3286;
                    int var22 = var1.field3282;
                    var3.field4649 = class229.field3595 + var1.field3288;
                    int var23 = var1.field3295;
                    var3.field4742 = var15;
                    if (var22 < var21) {
                        int var24 = var21;
                        var21 = var22;
                        var22 = var24;
                    }
                    var3.field4687 = var1.field3289 + var22;
                    if (var23 < var20) {
                        int var25 = var20;
                        var20 = var23;
                        var23 = var25;
                    }
                    var3.field4699 = var1.field3292 + var20;
                    var3.field4654 = var1.field3292 + var23;
                    var3.field4689 = var1.field3289 + var21;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "(I)V", line = 225)
    public static void method1284(int arg0) {
        field2829 = null;
        int var1 = 33 % ((arg0 + 9) / 40);
        field2843 = (int[][][]) null;
    }
}
