import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public class class555 {

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "I")
    public static int field8038;

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "I")
    public static int field8039;

    @OriginalMember(owner = "client!gl", name = "c", descriptor = "I")
    public static int field8040;

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(IIIIII)V")
    public static final void method3247(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 <= class288.field3883 && class598.field8632 <= arg1) {
            boolean var6;
            if (arg2 < class587.field8513) {
                var6 = false;
                arg2 = class587.field8513;
            } else if (class221.field2866 >= arg2) {
                var6 = true;
            } else {
                var6 = false;
                arg2 = class221.field2866;
            }
            boolean var7;
            if (class587.field8513 > arg3) {
                var7 = false;
                arg3 = class587.field8513;
            } else if (class221.field2866 < arg3) {
                arg3 = class221.field2866;
                var7 = false;
            } else {
                var7 = true;
            }
            if (class598.field8632 > arg0) {
                arg0 = class598.field8632;
            } else {
                class359.method2018(class678.field9722[arg0++], arg3, arg5 - 3509, arg4, arg2);
            }
            if (class288.field3883 >= arg1) {
                class359.method2018(class678.field9722[arg1--], arg3, -90, arg4, arg2);
            } else {
                arg1 = class288.field3883;
            }
            if (var6 && var7) {
                for (int var8 = arg0; var8 <= arg1; var8++) {
                    int[] var9 = class678.field9722[var8];
                    var9[arg2] = var9[arg3] = arg4;
                }
            } else if (var6) {
                for (int var11 = arg0; var11 <= arg1; var11++) {
                    class678.field9722[var11][arg2] = arg4;
                }
            } else if (var7) {
                for (int var10 = arg0; var10 <= arg1; var10++) {
                    class678.field9722[var10][arg3] = arg4;
                }
            }
        }
        if (arg5 == 3622) {
            field8039++;
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "([[BILjs;)V")
    public static final void method3248(byte[][] arg0, int arg1, class302 arg2) {
        field8040++;
        if (arg1 != -105182120) {
            return;
        }
        for (int var3 = 0; var3 < arg2.field5732; var3++) {
            class317.method1849(arg1 ^ 0x644F3A7);
            for (int var4 = 0; var4 < class473.field6604 >> 3; var4++) {
                for (int var5 = 0; var5 < (class205.field2465 >> 3); var5++) {
                    int var6 = class50.field831[var3][var4][var5];
                    if (var6 != -1) {
                        int var7 = (var6 & 0x3C86D49) >> 24;
                        if (!arg2.field5716 || var7 == 0) {
                            int var8 = (var6 & 0x6) >> 1;
                            int var9 = (var6 & 0xFFE891) >> 14;
                            int var10 = var6 >> 3 & 0x7FF;
                            int var11 = (var9 / 8 << 8) + var10 / 8;
                            for (int var12 = 0; var12 < class312.field4119.length; var12++) {
                                if (class312.field4119[var12] == var11 && arg0[var12] != null) {
                                    arg2.method1794(var4 * 8, (var9 & 0x7) * 8, class349.field4642, arg0[var12], var8, class68.field1045, (var10 & 0x7) * 8, var7, var3, var5 * 8, arg1 + 105179864);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(ILr;IZ)V")
    public static final void method3249(int arg0, class165 arg1, int arg2, boolean arg3) {
        field8038++;
        if (!arg3) {
            method3248(null, -60, null);
        }
        class377.field5073 = arg1;
        class562.field8128 = new class618[arg2][arg0];
        if (class167.field2046 != null) {
            class143.field1780 = class209.method1249(class167.field2046[0], class167.field2046[2], class167.field2046[1], class167.field2046[5], !arg3, class167.field2046[4], class167.field2046[3]);
        }
        class214.field2719 = new class618();
        class441.method2622((byte) 51);
    }
}
