import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class72 {

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "I")
    public static int field1111 = 0;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "I")
    public static int field1110;

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "I")
    public static int field1112;

    @OriginalMember(owner = "client!ge", name = "d", descriptor = "I")
    public static int field1113;

    @OriginalMember(owner = "client!ge", name = "e", descriptor = "I")
    public static int field1114;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Z)V")
    public static final void method568(boolean arg0) {
        field1110++;
        class166.field2509.method1169(arg0);
        class128.field1913.method1169(true);
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IIIIIIIIIIIZ)V")
    public static final void method569(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, boolean arg11) {
        field1112++;
        if (arg4 != 0) {
            method569(-36, -61, 30, 33, 67, -123, 49, 69, -60, -7, -58, true);
        }
        int var12 = arg2 - arg6;
        int var13 = -1;
        if (class105.field1644 > 0) {
            if (class308.field4935 > 10) {
                var13 = (10 + 10 - class308.field4935) * 5;
            } else {
                var13 = class308.field4935 * 5;
            }
        }
        int var14 = arg7 - arg3;
        int var15 = 983040 / arg10;
        int var16 = 983040 / arg0;
        for (int var17 = -var16; var17 < (var12 + var16); var17++) {
            int var19 = arg0 * var17 + arg1 >> 16;
            int var20 = arg1 + ((var17 + 1) * arg0) >> 16;
            int var21 = var20 - var19;
            if (var21 > 0) {
                int var10000 = arg9 + var20;
                int var23 = arg9 + var19;
                int var24 = arg6 + var17 >> 6;
                if (var24 >= 0 && (class156.field2323.length - 1) >= var24) {
                    int[][] var25 = class156.field2323[var24];
                    for (int var26 = -var15; var26 < (var14 + var15); var26++) {
                        int var27 = arg10 * var26 + arg5 >> 16;
                        int var28 = (var26 + 1) * arg10 + arg5 >> 16;
                        int var29 = var28 - var27;
                        if (var29 > 0) {
                            int var30 = arg8 + var27;
                            var10000 = arg8 + var28;
                            int var32 = arg3 + var26 >> 6;
                            if (var32 >= 0 && var25.length - 1 >= var32 && var25[var32] != null) {
                                int var33 = ((arg3 + var26 & 0x3F) << 6) + (arg6 + var17 & 0x3F);
                                int var34 = var25[var32][var33];
                                if (var34 != 0) {
                                    class295 var35 = class166.method1209(-50, var34 - 1);
                                    if (!class262.field4147[var35.field4587]) {
                                        if (var13 != -1 && class31.field532 == var35.field4587) {
                                            class135 var36 = new class135();
                                            var36.field2020 = var35.field4587;
                                            var36.field2023 = var30;
                                            var36.field2024 = var23;
                                            class222.field3568.method12(var36, arg4 + 12);
                                        } else {
                                            class193.field3015[var35.field4587].method425(var23 - 7, var30 - 7);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        for (class135 var18 = (class135) class222.field3568.method6(-117); var18 != null; var18 = (class135) class222.field3568.method11((byte) 23)) {
            class66.method515(var18.field2024, var18.field2023, 15, 16776960, var13);
            class66.method515(var18.field2024, var18.field2023, 13, 16776960, var13);
            class66.method515(var18.field2024, var18.field2023, 11, 16776960, var13);
            class66.method515(var18.field2024, var18.field2023, 9, 16776960, var13);
            class193.field3015[var18.field2020].method425(var18.field2024 - 7, var18.field2023 + -7);
        }
        class222.field3568.method9(115);
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(B)V")
    public static final void method570(byte arg0) {
        field1114++;
        class20.field319.method1172((byte) 127);
        if (arg0 != 8) {
            method570((byte) 45);
        }
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(B)V")
    public static final void method571(byte arg0) {
        field1113++;
        if (arg0 <= 17) {
            field1111 = 77;
        }
        class121.field1829.method1172((byte) 121);
    }
}
