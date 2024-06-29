import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class652 {

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "I")
    public static int field9217 = 765;

    @OriginalMember(owner = "client!ge", name = "d", descriptor = "[Lrm;")
    public static class375[] field9219 = new class375[8];

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "I")
    public static int field9216;

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "I")
    public static int field9218;

    @OriginalMember(owner = "client!ge", name = "e", descriptor = "I")
    public static int field9220;

    @OriginalMember(owner = "client!ge", name = "f", descriptor = "I")
    public static int field9221;

    @OriginalMember(owner = "client!ge", name = "g", descriptor = "I")
    public static int field9222;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(III)I")
    public static final int method3625(int arg0, int arg1, int arg2) {
        field9221++;
        int var3 = class395.method2250(1, arg1 - 1, arg2 - 1) + class395.method2250(1, arg1 - 1, arg2 + 1) - (-class395.method2250(1, arg1 - -1, arg2 - 1) + -class395.method2250(1, arg1 - -1, arg2 + 1));
        int var4 = class395.method2250(1, arg1, arg2 - 1) - (-class395.method2250(1, arg1, arg2 + 1) - class395.method2250(1, arg0 + arg1, arg2)) + class395.method2250(arg0 ^ 0xFFFFFFFE, arg1 + 1, arg2);
        int var5 = class395.method2250(arg0 + 2, arg1, arg2);
        return var3 / 16 - (-(var4 / 8) - var5 / 4);
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(III[BIIII[B)V")
    public static final void method3626(int arg0, int arg1, int arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7, byte[] arg8) {
        field9220++;
        int var9 = -(arg1 >> 2);
        if (arg5 != -17864) {
            field9217 = 85;
        }
        int var10 = -(arg1 & 0x3);
        for (int var11 = -arg4; var11 < 0; var11++) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg7++;
                arg3[var10001] += arg8[arg2++];
                int var14 = arg7++;
                arg3[var14] += arg8[arg2++];
                int var15 = arg7++;
                arg3[var15] += arg8[arg2++];
                int var16 = arg7++;
                arg3[var16] += arg8[arg2++];
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg7++;
                arg3[var10001] += arg8[arg2++];
            }
            arg7 += arg0;
            arg2 += arg6;
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "([I[I[IBLkw;)V")
    public static final void method3627(int[] arg0, int[] arg1, int[] arg2, byte arg3, class225 arg4) {
        if (arg3 != -92) {
            method3625(-46, -5, -45);
        }
        for (int var5 = 0; var5 < arg2.length; var5++) {
            int var6 = arg2[var5];
            int var7 = arg1[var5];
            int var8 = arg0[var5];
            int var9 = 0;
            while (var7 != 0 && arg4.field6400.length > var9) {
                if ((var7 & 0x1) != 0) {
                    if (var6 == -1) {
                        arg4.field6400[var9] = null;
                    } else {
                        class131 var10 = class301.field4465.method2763(var6, arg3 ^ 0xFFFF8474);
                        int var11 = var10.field1801;
                        class535 var12 = arg4.field6400[var9];
                        if (var12 != null) {
                            if (var12.field7288 == var6) {
                                if (var11 == 0) {
                                    var12 = arg4.field6400[var9] = null;
                                } else if (var11 == 1) {
                                    var12.field7287 = 0;
                                    var12.field7283 = var8;
                                    var12.field7280 = 0;
                                    var12.field7278 = 1;
                                    var12.field7284 = 0;
                                    class99.method769(false, arg4.field509, arg4.field520, var10, arg4.field514, 50, 0);
                                } else if (var11 == 2) {
                                    var12.field7280 = 0;
                                }
                            } else if (var10.field1799 >= class301.field4465.method2763(var12.field7288, 31696).field1799) {
                                var12 = arg4.field6400[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class535 var13 = arg4.field6400[var9] = new class535();
                            var13.field7278 = 1;
                            var13.field7280 = 0;
                            var13.field7288 = var6;
                            var13.field7287 = 0;
                            var13.field7284 = 0;
                            var13.field7283 = var8;
                            class99.method769(false, arg4.field509, arg4.field520, var10, arg4.field514, 50, 0);
                        }
                    }
                }
                var9++;
                var7 >>>= 0x1;
            }
        }
        field9222++;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(B)V")
    public static void method3628(byte arg0) {
        field9219 = null;
        if (arg0 >= -82) {
            method3625(4, -119, 24);
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(ILfaa;)V")
    public static final void method3629(int arg0, class140 arg1) {
        field9216++;
        if (arg0 != 18858) {
            method3627(null, null, null, (byte) 87, null);
        }
        class140 var2 = class198.method1342(arg1, true);
        int var3;
        int var4;
        if (var2 == null) {
            var3 = class547.field7412;
            var4 = class124.field1711;
        } else {
            var3 = var2.field2121;
            var4 = var2.field2082;
        }
        class434.method2494(119, false, var3, arg1, var4);
        class121.method865((byte) -29, var3, arg1, var4);
    }
}
