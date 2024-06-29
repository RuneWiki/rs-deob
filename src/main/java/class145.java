import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wea")
public class class145 extends class615 {

    @OriginalMember(owner = "client!wea", name = "I", descriptor = "Los;")
    public static class412 field2329 = new class412(3, 2);

    @OriginalMember(owner = "client!wea", name = "O", descriptor = "I")
    public static int field2335 = 0;

    @OriginalMember(owner = "client!wea", name = "F", descriptor = "I")
    public static int field2327;

    @OriginalMember(owner = "client!wea", name = "G", descriptor = "I")
    public static int field2328;

    @OriginalMember(owner = "client!wea", name = "J", descriptor = "I")
    public static int field2330;

    @OriginalMember(owner = "client!wea", name = "K", descriptor = "I")
    public static int field2331;

    @OriginalMember(owner = "client!wea", name = "L", descriptor = "I")
    public static int field2332;

    @OriginalMember(owner = "client!wea", name = "M", descriptor = "I")
    public static int field2333;

    @OriginalMember(owner = "client!wea", name = "N", descriptor = "I")
    public static int field2334;

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "(IB)[I")
    public final int[] method8(int arg0, byte arg1) {
        ++field2327;
        int[] var3 = super.field8125.method298(arg0, arg1 + -6);
        if (arg1 != -18) {
            field2335 = 81;
        }
        if (super.field8125.field579) {
            int[] var4 = this.method3366(0, arg1 + 1015, arg0);
            int[] var5 = this.method3366(1, 997, arg0);
            int[] var6 = this.method3366(2, 997, arg0);
            for (int var7 = 0; ~class505.field6740 < ~var7; ++var7) {
                int var8 = var6[var7];
                if (var8 != 4096) {
                    if (var8 != 0) {
                        var3[var7] = (-var8 + 4096) * var5[var7] + var4[var7] * var8 >> 12;
                    } else {
                        var3[var7] = var5[var7];
                    }
                } else {
                    var3[var7] = var4[var7];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!wea", name = "c", descriptor = "(III)Z")
    public static final boolean method1049(int arg0, int arg1, int arg2) {
        ++field2332;
        if (arg2 != -24087) {
            method1051(true, (byte) -80);
        }
        return class310.method1853(arg0, arg1, (byte) -50) & class372.method2196(arg0, arg1, arg2 ^ -24087);
    }

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1050(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field2331;
        int var8 = arg5 - -arg7;
        int var9 = -arg7 + arg2;
        for (int var10 = arg5; var10 < var8; ++var10) {
            class475.method2668(arg3, arg4, 7, class236.field3325[var10], arg6);
        }
        int var11 = arg4 - arg7;
        for (int var12 = arg2; var12 > var9; --var12) {
            class475.method2668(arg3, arg4, 7, class236.field3325[var12], arg6);
        }
        if (arg0 != 0) {
            field2335 = 94;
        }
        int var13 = arg6 + arg7;
        for (int var14 = var8; var9 >= var14; ++var14) {
            int[] var15 = class236.field3325[var14];
            class475.method2668(arg3, var13, arg0 + 7, var15, arg6);
            class475.method2668(arg1, var11, 7, var15, var13);
            class475.method2668(arg3, arg4, 7, var15, var11);
        }
    }

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "(ZB)V")
    public static final void method1051(boolean arg0, byte arg1) {
        while (true) {
            if (class439.field6039.method1315(class269.field3754, (byte) 16) >= 15) {
                int var2 = class439.field6039.method1318(104, 15);
                if (~var2 != -32768) {
                    boolean var3 = false;
                    class280 var4 = (class280) class616.field8143.method2918((long) var2, (byte) 68);
                    if (var4 == null) {
                        class287 var5 = new class287();
                        var5.field5633 = var2;
                        var4 = new class280(var5);
                        class616.field8143.method2911((long) var2, var4, (byte) -28);
                        class51.field718[class176.field2705++] = var4;
                        var3 = true;
                    }
                    class287 var6 = var4.field3983;
                    class415.field5681[class92.field1396++] = var2;
                    var6.field5595 = class642.field8626;
                    if (var6.field4052 != null && var6.field4052.method2400(65535)) {
                        class625.method3421(var6, -114);
                    }
                    int var7;
                    if (arg0) {
                        var7 = class439.field6039.method1318(-104, 8);
                        if (~var7 < -128) {
                            var7 -= 256;
                        }
                    } else {
                        var7 = class439.field6039.method1318(107, 5);
                        if (~var7 < -16) {
                            var7 -= 32;
                        }
                    }
                    int var8 = class439.field6039.method1318(-89, 1);
                    if (var8 == 1) {
                        class329.field4530[class360.field4868++] = var2;
                    }
                    var6.method1777((byte) -93, class239.field3369.method277(class439.field6039.method1318(-36, 14), (byte) -52));
                    int var9 = 14485 & class439.field6039.method1318(98, 3) + 4 << 11;
                    int var10 = class439.field6039.method1318(-57, 1);
                    int var11;
                    if (!arg0) {
                        var11 = class439.field6039.method1318(111, 5);
                        if (~var11 < -16) {
                            var11 -= 32;
                        }
                    } else {
                        var11 = class439.field6039.method1318(104, 8);
                        if (~var11 < -128) {
                            var11 -= 256;
                        }
                    }
                    int var12 = class439.field6039.method1318(-100, 2);
                    var6.method2354(-104, var6.field4052.field5738);
                    var6.field5614 = var6.field4052.field5796 << 3;
                    if (var3) {
                        var6.method2359(var9, (byte) -126, true);
                    }
                    var6.method1768(var6.method2317((byte) 40), -102, var12, class199.field2897.field5643[0] + var7, ~var10 == -2, class199.field2897.field5649[0] - -var11);
                    if (var6.field4052.method2400(65535)) {
                        class372.method2192((class58) null, var6.field8609, -601998647, 0, (class403) null, var6, var6.field5649[0], var6.field5643[0]);
                    }
                    continue;
                }
            }
            ++field2328;
            if (arg1 <= 111) {
                field2329 = null;
            }
            class439.field6039.method1308(8);
            return;
        }
    }

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "(BILeh;)V")
    public final void method15(byte arg0, int arg1, class335 arg2) {
        if (arg0 >= 44) {
            if (arg1 == 0) {
                super.field8118 = arg2.method2034(255) == 1;
            }
            ++field2334;
        }
    }

    @OriginalMember(owner = "client!wea", name = "f", descriptor = "(I)V")
    public static void method1052(int arg0) {
        if (arg0 <= -25) {
            field2329 = null;
        }
    }

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "(II)[[I")
    public final int[][] method223(int arg0, int arg1) {
        ++field2333;
        int[][] var3 = super.field8129.method2654(false, arg1);
        if (arg0 != 2) {
            return null;
        } else {
            if (super.field8129.field6315) {
                int[] var4 = this.method3366(2, arg0 ^ 999, arg1);
                int[][] var5 = this.method3368(true, 0, arg1);
                int[][] var6 = this.method3368(true, 1, arg1);
                int[] var7 = var3[0];
                int[] var8 = var3[1];
                int[] var9 = var3[2];
                int[] var10 = var5[0];
                int[] var11 = var5[1];
                int[] var12 = var5[2];
                int[] var13 = var6[0];
                int[] var14 = var6[1];
                int[] var15 = var6[2];
                for (int var16 = 0; ~class505.field6740 < ~var16; ++var16) {
                    int var17 = var4[var16];
                    if (var17 == 4096) {
                        var7[var16] = var10[var16];
                        var8[var16] = var11[var16];
                        var9[var16] = var12[var16];
                    } else if (var17 != 0) {
                        int var18 = -var17 + 4096;
                        var7[var16] = var10[var16] * var17 + var13[var16] * var18 >> 12;
                        var8[var16] = var11[var16] * var17 + var14[var16] * var18 >> 12;
                        var9[var16] = var12[var16] * var17 + var15[var16] * var18 >> 12;
                    } else {
                        var7[var16] = var13[var16];
                        var8[var16] = var14[var16];
                        var9[var16] = var15[var16];
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!wea", name = "<init>", descriptor = "()V")
    public class145() {
        super(3, false);
    }

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "(Lii;ILjava/lang/String;B)Lsa;")
    public static final class192 method1053(class519 arg0, int arg1, String arg2, byte arg3) {
        ++field2330;
        if (~arg1 == -1) {
            return arg0.method2900(124, arg2);
        } else if (~arg1 == -2) {
            try {
                class594.method3268(class486.field6574, new Object[] { (new URL(class486.field6574.getCodeBase(), arg2)).toString() }, "openjs", 3542);
                class192 var4 = new class192();
                var4.field2816 = 1;
                return var4;
            } catch (Throwable var11) {
                class192 var5 = new class192();
                var5.field2816 = 2;
                return var5;
            }
        } else if (arg1 == 2) {
            try {
                class486.field6574.getAppletContext().showDocument(new URL(class486.field6574.getCodeBase(), arg2), "_blank");
                class192 var6 = new class192();
                var6.field2816 = 1;
                return var6;
            } catch (Exception var12) {
                class192 var7 = new class192();
                var7.field2816 = 2;
                return var7;
            }
        } else {
            int var8 = -85 / ((-25 - arg3) / 40);
            if (arg1 == 3) {
                try {
                    class594.method3267("loggedout", -17670, class486.field6574);
                } catch (Throwable var14) {
                }
                try {
                    class486.field6574.getAppletContext().showDocument(new URL(class486.field6574.getCodeBase(), arg2), "_top");
                    class192 var9 = new class192();
                    var9.field2816 = 1;
                    return var9;
                } catch (Exception var13) {
                    class192 var10 = new class192();
                    var10.field2816 = 2;
                    return var10;
                }
            } else {
                throw new IllegalArgumentException();
            }
        }
    }
}
