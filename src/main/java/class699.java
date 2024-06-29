import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public class class699 extends class50 {

    @OriginalMember(owner = "client!ph", name = "r", descriptor = "Z")
    public static boolean field9841 = false;

    @OriginalMember(owner = "client!ph", name = "g", descriptor = "I")
    public int field9830;

    @OriginalMember(owner = "client!ph", name = "h", descriptor = "I")
    public int field9831;

    @OriginalMember(owner = "client!ph", name = "i", descriptor = "I")
    public int field9832;

    @OriginalMember(owner = "client!ph", name = "j", descriptor = "I")
    public int field9833;

    @OriginalMember(owner = "client!ph", name = "k", descriptor = "I")
    public static int field9834;

    @OriginalMember(owner = "client!ph", name = "l", descriptor = "I")
    public int field9835;

    @OriginalMember(owner = "client!ph", name = "m", descriptor = "I")
    public static int field9836;

    @OriginalMember(owner = "client!ph", name = "o", descriptor = "I")
    public int field9838;

    @OriginalMember(owner = "client!ph", name = "q", descriptor = "I")
    public static int field9840;

    @OriginalMember(owner = "client!ph", name = "n", descriptor = "Lf;")
    public static class256 field9837;

    @OriginalMember(owner = "client!ph", name = "p", descriptor = "Ljava/lang/String;")
    public String field9839;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(III)V")
    public static final void method3921(int arg0, int arg1, int arg2) {
        boolean var3 = class603.field8695[0][arg1][arg2] != null && class603.field8695[0][arg1][arg2].field666 != null;
        for (int var4 = arg0; var4 >= 0; var4--) {
            if (class603.field8695[var4][arg1][arg2] == null) {
                class44 var5 = class603.field8695[var4][arg1][arg2] = new class44(var4);
                if (var3) {
                    var5.field677++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(B)V")
    public static void method3922(byte arg0) {
        field9837 = null;
        if (arg0 >= -51) {
            field9837 = null;
        }
    }

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "(Z)V")
    public static final void method3923(boolean arg0) {
        field9840++;
        if (!arg0) {
            field9841 = true;
        }
        for (class209 var1 = (class209) class547.field8071.method1904(!arg0); var1 != null; var1 = (class209) class547.field8071.method1901(117)) {
            class537 var2 = var1.field2842;
            if (var2.field7875) {
                var1.method2360((byte) 66);
                var2.method3097((byte) 113);
            } else if (var2.field7882 <= class45.field685) {
                var2.method3100(class255.field3319, -124);
                if (var2.field7875) {
                    var1.method2360((byte) 66);
                } else {
                    class591.method3367(var2, true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(IIIIZ)V")
    public static final void method3924(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field9836++;
        if (!arg4 && class697.field9827 == arg3 && class22.field426 == arg0 && class49.field779 == class432.field6276 || class335.field4872.method3439(class62.field996, false)) {
            return;
        }
        class697.field9827 = arg3;
        class22.field426 = arg0;
        class432.field6276 = class49.field779;
        if (class335.field4872.method3439(class62.field996, false)) {
            class432.field6276 = 0;
        }
        class322.method2003(0, arg2);
        class453.method2656(0, class244.field3236, class279.field3637.method1654(-127, class262.field3401), class332.field4821, true, class624.field9024);
        int var5 = class397.field6005;
        class397.field6005 = (class697.field9827 - (class72.field1144 >> 4)) * 8;
        int var6 = class403.field6049;
        class403.field6049 = (class22.field426 - (class668.field9444 >> 4)) * 8;
        class583.field8474 = class55.method334(class697.field9827 * 8, class22.field426 * 8);
        class103.field1546 = null;
        int var7 = class397.field6005 - var5;
        int var8 = class403.field6049 - var6;
        if (arg1 <= 113) {
            field9837 = null;
        }
        if (arg2 == 11) {
            for (int var17 = 0; var17 < class378.field5678; var17++) {
                class177 var30 = class13.field299[var17];
                if (var30 != null) {
                    class53 var31 = var30.field2476;
                    for (int var32 = 0; var32 < 10; var32++) {
                        var31.field7430[var32] -= var7;
                        var31.field7429[var32] -= var8;
                    }
                    var31.field7896 -= var8 * 512;
                    var31.field7895 -= var7 * 512;
                }
            }
        } else {
            boolean var9 = false;
            class155.field2213 = 0;
            int var10 = class72.field1144 * 512 - 512;
            int var11 = (class668.field9444 - 1) * 512;
            for (int var12 = 0; var12 < class378.field5678; var12++) {
                class177 var13 = class13.field299[var12];
                if (var13 != null) {
                    class53 var14 = var13.field2476;
                    var14.field7895 -= var7 * 512;
                    var14.field7896 -= var8 * 512;
                    if (var14.field7895 >= 0 && var14.field7895 <= var10 && var14.field7896 >= 0 && var11 >= var14.field7896) {
                        boolean var15 = true;
                        for (int var16 = 0; var16 < 10; var16++) {
                            var14.field7430[var16] -= var7;
                            var14.field7429[var16] -= var8;
                            if (var14.field7430[var16] < 0 || class72.field1144 <= var14.field7430[var16] || var14.field7429[var16] < 0 || var14.field7429[var16] >= class668.field9444) {
                                var15 = false;
                            }
                        }
                        if (var15) {
                            class523.field7379[class155.field2213++] = var14.field7405;
                        } else {
                            var14.method316(null, (byte) 82);
                            var9 = true;
                            var13.method2360((byte) 66);
                        }
                    } else {
                        var14.method316(null, (byte) 61);
                        var13.method2360((byte) 66);
                        var9 = true;
                    }
                }
            }
            if (var9) {
                class378.field5678 = class271.field3550.method1996((byte) -111);
                class271.field3550.method1994(class13.field299, (byte) 105);
            }
        }
        for (int var18 = 0; var18 < 2048; var18++) {
            class71 var28 = class35.field551[var18];
            if (var28 != null) {
                for (int var29 = 0; var29 < 10; var29++) {
                    var28.field7430[var29] -= var7;
                    var28.field7429[var29] -= var8;
                }
                var28.field7895 -= var7 * 512;
                var28.field7896 -= var8 * 512;
            }
        }
        class14[] var19 = class700.field9879;
        for (int var20 = 0; var20 < var19.length; var20++) {
            class14 var27 = var19[var20];
            if (var27 != null) {
                var27.field313 -= var8 * 512;
                var27.field321 -= var7 * 512;
            }
        }
        for (class285 var21 = (class285) class556.field8164.method1904(false); var21 != null; var21 = (class285) class556.field8164.method1901(113)) {
            var21.field3802 -= var8;
            var21.field3808 -= var7;
            if (class57.field938 != 4 && (var21.field3808 < 0 || var21.field3802 < 0 || var21.field3808 >= class72.field1144 || class668.field9444 <= var21.field3802)) {
                var21.method2360((byte) 66);
            }
        }
        if (class57.field938 != 4) {
            for (class668 var22 = (class668) class86.field1336.method1993(-104); var22 != null; var22 = (class668) class86.field1336.method1997(9831)) {
                int var23 = (int) (var22.field5740 & 0x3FFFL);
                int var24 = var23 - class397.field6005;
                int var25 = (int) (var22.field5740 >> 14 & 0x3FFFL);
                int var26 = var25 - class403.field6049;
                if (var24 < 0 || var26 < 0 || class72.field1144 <= var24 || class668.field9444 <= var26) {
                    var22.method2360((byte) 66);
                }
            }
        }
        if (class373.field5521 != 0) {
            class373.field5521 -= var7;
            class338.field4907 -= var8;
        }
        class545.method3196(17399);
        if (arg2 != 11) {
            class119.field1780 -= var7;
            class346.field5107 -= var8;
            class478.field6845 -= var8;
            class603.field8702 -= var8 * 512;
            class306.field4529 -= var7 * 512;
            class229.field3040 -= var7;
            if (Math.abs(var7) > class72.field1144 || Math.abs(var8) > class668.field9444) {
                class456.method2668(255);
            }
        } else if (class684.field9659 == 4) {
            class502.field7101 -= var8 * 512;
            class475.field6814 -= var7 * 512;
            class677.field9587 -= var7 * 512;
            class35.field550 -= var8 * 512;
        } else {
            class684.field9659 = 1;
            class150.field2120 = -1;
            class250.field3280 = -1;
        }
        class417.method2537(95);
        class185.method1232(-118);
        class547.field8071.method1905(0);
        class144.field2079.method1905(0);
        class597.field8638.method2366(false);
        class645.method3671(-1);
    }
}
