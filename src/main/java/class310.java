import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public class class310 extends class335 {

    @OriginalMember(owner = "client!bg", name = "T", descriptor = "I")
    private int field4815 = 0;

    @OriginalMember(owner = "client!bg", name = "W", descriptor = "I")
    private int field4818 = 10;

    @OriginalMember(owner = "client!bg", name = "Y", descriptor = "I")
    private int field4820 = 2048;

    @OriginalMember(owner = "client!bg", name = "U", descriptor = "I")
    public static int field4816 = 0;

    @OriginalMember(owner = "client!bg", name = "V", descriptor = "[I")
    public static int[] field4817 = new int[1000];

    @OriginalMember(owner = "client!bg", name = "ab", descriptor = "[Lv;")
    public static class75[] field4822 = new class75[14];

    @OriginalMember(owner = "client!bg", name = "L", descriptor = "I")
    public static int field4808;

    @OriginalMember(owner = "client!bg", name = "M", descriptor = "I")
    public static int field4809;

    @OriginalMember(owner = "client!bg", name = "N", descriptor = "I")
    public static int field4810;

    @OriginalMember(owner = "client!bg", name = "Q", descriptor = "I")
    public static int field4812;

    @OriginalMember(owner = "client!bg", name = "R", descriptor = "I")
    public static int field4813;

    @OriginalMember(owner = "client!bg", name = "S", descriptor = "I")
    public static int field4814;

    @OriginalMember(owner = "client!bg", name = "Z", descriptor = "I")
    public static int field4821;

    @OriginalMember(owner = "client!bg", name = "P", descriptor = "[I")
    private int[] field4811;

    @OriginalMember(owner = "client!bg", name = "X", descriptor = "[I")
    private int[] field4819;

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "(II)[I", line = 11)
    public final int[] method149(int arg0, int arg1) {
        field4808++;
        if (arg1 != 621) {
            method2115(105, -40, 12, 70, -91, 64, 28, 104);
        }
        int[] var3 = this.field5233.method1110((byte) 108, arg0);
        if (this.field5233.field2467) {
            int var4 = class280.field4316[arg0];
            if (this.field4815 == 0) {
                short var5 = 0;
                for (int var6 = 0; var6 < this.field4818; var6++) {
                    if (this.field4811[var6] <= var4 && this.field4811[var6 + 1] > var4) {
                        if (this.field4819[var6] > var4) {
                            var5 = 4096;
                        }
                        break;
                    }
                }
                class343.method2376(var3, 0, class105.field1630, var5);
            } else {
                for (int var7 = 0; var7 < class105.field1630; var7++) {
                    int var8 = 0;
                    int var9 = class90.field1437[var7];
                    int var10 = this.field4815;
                    if (var10 == 1) {
                        var8 = var9;
                    } else if (var10 == 2) {
                        var8 = (var4 + var9 - 4096 >> 1) + 2048;
                    } else if (var10 == 3) {
                        var8 = (var9 - var4 >> 1) + 2048;
                    }
                    short var11 = 0;
                    for (int var12 = 0; var12 < this.field4818; var12++) {
                        if (var8 >= this.field4811[var12] && var8 < this.field4811[var12 + 1]) {
                            if (this.field4819[var12] > var8) {
                                var11 = 4096;
                            }
                            break;
                        }
                    }
                    var3[var7] = var11;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!bg", name = "<init>", descriptor = "()V", line = 127)
    public class310() {
        super(0, true);
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(ILkh;I)V", line = 143)
    public final void method230(int arg0, class166 arg1, int arg2) {
        if (arg0 == 0) {
            this.field4818 = arg1.method1178(0);
        } else if (arg0 == 1) {
            this.field4820 = arg1.method1151(-102);
        } else if (arg0 == 2) {
            this.field4815 = arg1.method1178(0);
        }
        field4809++;
        if (arg2 <= 51) {
            this.field4820 = -29;
        }
    }

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "(Z)V", line = 186)
    public static void method2113(boolean arg0) {
        field4817 = null;
        field4822 = null;
        if (!arg0) {
            method2113(true);
        }
    }

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "(B)V", line = 200)
    private final void method2114(byte arg0) {
        field4821++;
        this.field4819 = new int[this.field4818 + 1];
        this.field4811 = new int[this.field4818 + 1];
        if (arg0 <= 36) {
            field4817 = (int[]) null;
        }
        int var2 = 0;
        int var3 = 4096 / this.field4818;
        int var4 = this.field4820 * var3 >> 12;
        for (int var5 = 0; var5 < this.field4818; var5++) {
            this.field4811[var5] = var2;
            this.field4819[var5] = var2 + var4;
            var2 += var3;
        }
        this.field4811[this.field4818] = 4096;
        this.field4819[this.field4818] = this.field4819[0] + 4096;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(IIIIIIII)V", line = 237)
    public static final void method2115(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4814++;
        if (arg6 < 128 || arg7 < 128 || arg6 > 13056 || arg7 > 13056) {
            class336.field5267 = -1;
            class240.field3829 = -1;
            return;
        }
        int var8 = class320.method2181(arg6, arg7, -52, class205.field3101) - arg3;
        int var9 = arg7 - class265.field4116;
        int var10 = class15.field216[class218.field3323];
        int var11 = arg6 - class337.field5278;
        int var12 = class15.field204[class218.field3323];
        int var13 = class15.field204[class194.field2897];
        int var14 = class15.field216[class194.field2897];
        int var15 = var8 - class258.field4052;
        int var16 = var9 * var12 + var10 * var11 >> 16;
        int var17 = var9 * var10 - (var11 * var12) >> 16;
        int var19 = var14 * var15 - (var13 * var17) >> 16;
        int var20 = var13 * var15 + var14 * var17 >> 16;
        if (~var20 > arg0) {
            class240.field3829 = -1;
            class336.field5267 = -1;
        } else if (class94.field1516) {
            int var22 = arg1 * 512 >> 8;
            class336.field5267 = arg2 + (var19 * var22 / var20);
            int var23 = arg4 * 512 >> 8;
            class240.field3829 = var16 * var23 / var20 + arg5;
        } else {
            class336.field5267 = (var19 << 9) / var20 + arg2;
            class240.field3829 = (var16 << 9) / var20 + arg5;
        }
    }

    @OriginalMember(owner = "client!bg", name = "e", descriptor = "(I)V", line = 296)
    public final void method381(int arg0) {
        field4810++;
        int var2 = 49 / ((arg0 - 44) / 35);
        this.method2114((byte) 50);
    }
}
