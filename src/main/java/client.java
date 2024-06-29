import jagex3.jagmisc.jagmisc;
import java.awt.Canvas;
import java.awt.Container;
import java.awt.Frame;
import java.awt.Insets;
import java.awt.Rectangle;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.Socket;
import java.util.GregorianCalendar;
import java.util.Vector;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!client")
public class client extends class441 {

    @OriginalMember(owner = "client!client", name = "nb", descriptor = "Lsb;")
    public static class305 field9554 = new class305(64, 3);

    @OriginalMember(owner = "client!client", name = "pb", descriptor = "Lcq;")
    public static class110 field9556 = new class110(83, -2);

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
    public static int field9540;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
    public static int field9541;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
    public static int field9542;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
    public static int field9543;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "I")
    public static int field9544;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
    public static int field9545;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
    public static int field9546;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
    public static int field9547;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
    public static int field9548;

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
    public static int field9549;

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
    public static int field9550;

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "I")
    public static int field9551;

    @OriginalMember(owner = "client!client", name = "lb", descriptor = "I")
    public static int field9552;

    @OriginalMember(owner = "client!client", name = "mb", descriptor = "I")
    public static int field9553;

    @OriginalMember(owner = "client!client", name = "ob", descriptor = "I")
    public static int field9555;

    @OriginalMember(owner = "client!client", name = "qb", descriptor = "I")
    public static int field9557;

    @OriginalMember(owner = "client!client", name = "sb", descriptor = "I")
    public static int field9559;

    // $FF: synthetic field
    @OriginalMember(owner = "client!client", name = "rb", descriptor = "Ljava/lang/Class;")
    public static Class field9558;

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(BI)V")
    private final void method3746(byte arg0, int arg1) {
        class115.field1277 = 0;
        class494.field7165 = null;
        field9552++;
        class510.field7323.field1855 = arg1;
        class684.field9643 = null;
        if (arg0 == 42) {
            class510.field7323.field1854++;
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
    private final void method3747(int arg0) {
        field9553++;
        if (class421.field5601 == 14) {
            return;
        }
        long var2 = class45.method229(5660) / 1000000L - class340.field4298;
        class340.field4298 = class45.method229(5660) / 1000000L;
        boolean var4 = class381.method2195(93);
        if (var4 && class19.field151 && class39.field394 != null) {
            class39.field394.method3555(7);
        }
        if (class272.method1596((byte) 115, class421.field5601)) {
            if (class691.field9711 != 0L && class691.field9711 < class557.method3157(-115)) {
                class103.method561(false, (byte) 15, class639.field9075.field6790, class639.field9075.field6774, class201.method1206(arg0 - 27073));
            } else if (!class701.field9813.method946() && class626.field8845) {
                class537.method3013(true);
            }
        }
        if (class619.field8759 == null) {
            Container var5;
            if (class503.field7242 != null) {
                var5 = class503.field7242;
            } else if (class591.field8347 == null) {
                var5 = class188.field2161;
            } else {
                var5 = class591.field8347;
            }
            int var6 = var5.getSize().width;
            int var7 = var5.getSize().height;
            if (class503.field7242 == var5) {
                Insets var8 = class503.field7242.getInsets();
                var6 -= var8.right + var8.left;
                var7 -= var8.top + var8.bottom;
            }
            if (class338.field4245 != var6 || class533.field7491 != var7 || class298.field3721) {
                if (class701.field9813 == null || class701.field9813.method960()) {
                    class307.method1766(false);
                } else {
                    class533.field7491 = var7;
                    class338.field4245 = var6;
                }
                class691.field9711 = class557.method3157(-81) + 500L;
                class298.field3721 = false;
            }
        }
        if (class619.field8759 != null && !class32.field310 && class272.method1596((byte) -67, class421.field5601)) {
            class103.method561(false, (byte) 15, -1, -1, class639.field9075.field6791);
        }
        boolean var9 = false;
        if (class316.field3929) {
            class316.field3929 = false;
            var9 = true;
        }
        if (var9) {
            class80.method421(0);
        }
        if (class701.field9813 != null && class701.field9813.method946() || class201.method1206(124) != 1) {
            class64.method346(8);
        }
        if (class487.method2807(-1, class421.field5601)) {
            class345.method2061(var9, (byte) 91);
        } else if (class113.method601(class421.field5601, (byte) 125)) {
            class522.method2959((byte) -65);
        } else if (class104.method569((byte) 121, class421.field5601)) {
            class522.method2959((byte) -11);
        } else if (class152.method826((byte) 117, class421.field5601)) {
            if (class404.field5407 == 1) {
                if (class616.field8680 < class361.field4847) {
                    class616.field8680 = class361.field4847;
                }
                int var10 = (class616.field8680 - class361.field4847) * 50 / class616.field8680;
                class695.method3824(class198.field2297.method1195((byte) 62, class504.field7267) + "<br>(" + var10 + "%)", class701.field9813, class698.field9799, false, class436.field6153, true);
            } else if (class404.field5407 == 2) {
                if (class401.field5391 < class129.field1448) {
                    class401.field5391 = class129.field1448;
                }
                int var11 = (class401.field5391 - class129.field1448) * 50 / class401.field5391 + 50;
                class695.method3824(class198.field2297.method1195((byte) 62, class504.field7267) + "<br>(" + var11 + "%)", class701.field9813, class698.field9799, false, class436.field6153, true);
            } else {
                class695.method3824(class198.field2297.method1195((byte) 62, class504.field7267), class701.field9813, class698.field9799, false, class436.field6153, true);
            }
        } else if (class421.field5601 == 10) {
            class131.method742(var2, (byte) -128);
        } else if (class421.field5601 == 13) {
            class695.method3824(class198.field2299.method1195((byte) 62, class504.field7267) + "<br>" + class198.field2300.method1195((byte) 62, class504.field7267), class701.field9813, class698.field9799, false, class436.field6153, false);
        }
        if (class593.field8373 == 3) {
            for (int var12 = 0; var12 < class141.field1556; var12++) {
                Rectangle var13 = class275.field3446[var12];
                if (class73.field768[var12]) {
                    class701.field9813.method3206(var13.height, (byte) 97, var13.x, var13.y, -1996553985, var13.width);
                } else if (class444.field6263[var12]) {
                    class701.field9813.method3206(var13.height, (byte) 95, var13.x, var13.y, -1996554240, var13.width);
                }
            }
        }
        if (class85.method443(0)) {
            class272.method1598(class701.field9813, true);
        }
        if (class353.field4757.field6611 && class272.method1596((byte) -45, class421.field5601) && class593.field8373 == 0 && class201.method1206(arg0 ^ 0x6A38) == 1 && !var9) {
            int var14 = 0;
            for (int var15 = 0; var15 < class141.field1556; var15++) {
                if (class444.field6263[var15]) {
                    class444.field6263[var15] = false;
                    class705.field9913[var14++] = class275.field3446[var15];
                }
            }
            try {
                class701.field9813.method958(class705.field9913, var14);
            } catch (class20 var19) {
            }
        } else if (!class487.method2807(-1, class421.field5601)) {
            for (int var16 = 0; var16 < class141.field1556; var16++) {
                class444.field6263[var16] = false;
            }
            try {
                class701.field9813.method979();
            } catch (class20 var18) {
                class333.method1923(var18, true, var18.getMessage() + " (Recovered) " + this.method2560(false));
                class434.method2489(0, (byte) -103);
            }
        }
        if (class639.field9075.field6789 == 0) {
            class452.method2602(15L, (byte) -97);
        } else if (class639.field9075.field6789 == 1) {
            class452.method2602(10L, (byte) -97);
        } else if (class639.field9075.field6789 == 2) {
            class452.method2602(5L, (byte) -97);
        } else if (class639.field9075.field6789 == 3) {
            class452.method2602(2L, (byte) -97);
        }
        if (class671.field9344) {
            class624.method3511(false);
        }
        if (class639.field9075.field6807 && class421.field5601 == 3 && class209.field2466 != -1) {
            class639.field9075.field6807 = false;
            class639.field9075.method2642(-2, class353.field4757);
        }
        if (arg0 != 27142) {
            field9556 = null;
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V")
    private final void method3748(byte arg0) {
        if (arg0 != 4) {
            field9554 = null;
        }
        field9549++;
        boolean var2 = class510.field7323.method894((byte) -18);
        if (!var2) {
            this.method3757(48);
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
    public final void method2548(byte arg0) {
        field9557++;
        if (class537.field7555) {
            class355.method2097((byte) 67);
        }
        class351.method2083(true);
        if (class701.field9813 != null) {
            class701.field9813.method3203(5);
        }
        if (class619.field8759 != null) {
            class146.method803((byte) -94, class353.field4757, class619.field8759);
            class619.field8759 = null;
        }
        if (class99.field1061 != null) {
            class99.field1061.method1509(0);
            class99.field1061 = null;
        }
        class499.method2880(arg0 ^ 0x323);
        class510.field7323.method901(false);
        class705.field9906.method3804(115);
        if (class351.field4737 != null) {
            class351.field4737.method226(-50);
            class351.field4737 = null;
        }
        try {
            class36.field374.method3774((byte) 1);
            if (arg0 != -83) {
                field9554 = null;
            }
            for (int var2 = 0; var2 < 35; var2++) {
                class363.field4862[var2].method3774((byte) 1);
            }
            class151.field1674.method3774((byte) 1);
            class551.field7878.method3774((byte) 1);
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lwp;)Z")
    public static final boolean method3749(class452 arg0) {
        if (class590.field8339) {
            if (method3750(arg0).field3898 != 0) {
                return false;
            }
            if (arg0.field6471 == 0) {
                return false;
            }
        }
        return arg0.field6455;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Lwp;)Lnb;")
    public static final class314 method3750(class452 arg0) {
        class314 var1 = (class314) class595.field8386.method3669(((long) arg0.field6339 << 32) + (long) arg0.field6360, -1);
        return var1 == null ? arg0.field6409 : var1;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([Lwp;IIIIIIIII)V")
    public static final void method3751(class452[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        for (int var10 = 0; var10 < arg0.length; var10++) {
            class452 var11 = arg0[var10];
            if (var11 != null && var11.field6467 == arg1) {
                int var12 = var11.field6357 + arg6;
                int var13 = var11.field6459 + arg7;
                int var14;
                int var15;
                int var16;
                int var17;
                if (var11.field6471 == 2) {
                    var14 = arg2;
                    var15 = arg3;
                    var16 = arg4;
                    var17 = arg5;
                } else {
                    int var18 = var11.field6483 + var12;
                    int var19 = var11.field6443 + var13;
                    if (var11.field6471 == 9) {
                        var18++;
                        var19++;
                    }
                    var14 = var12 > arg2 ? var12 : arg2;
                    var15 = var13 > arg3 ? var13 : arg3;
                    var16 = var18 < arg4 ? var18 : arg4;
                    var17 = var19 < arg5 ? var19 : arg5;
                }
                if (var11.field6471 == 0 || var11.field6479 || method3750(var11).field3898 != 0 || class480.field6918 == var11 || class59.field609 == var11.field6335 || class475.field6855 == var11.field6335) {
                    if (!method3749(var11)) {
                        if (class497.field7199 == var11 && class50.method262(class497.field7199, -100) != null) {
                            class600.field8465 = true;
                            class215.field2607 = var12;
                            class677.field9494 = var13;
                        }
                        if (var11.field6332 || var14 < var16 && var15 < var17) {
                            if (var11.field6416 && arg8 >= var14 && arg9 >= var15 && arg8 < var16 && arg9 < var17) {
                                for (class213 var20 = (class213) class472.field6793.method3434((byte) 2); var20 != null; var20 = (class213) class472.field6793.method3430(true)) {
                                    if (var20.field2590) {
                                        var20.method1922(76);
                                        var20.field2592.field6435 = false;
                                    }
                                }
                                if (class338.field4254 == 0) {
                                    class497.field7199 = null;
                                    class480.field6918 = null;
                                }
                                class667.field9317 = 0;
                                class345.field4646 = false;
                                class669.field9324 = false;
                                if (!class188.field2148) {
                                    class620.method3458(-97);
                                }
                            }
                            boolean var21;
                            if (class108.field1166.method253(true) >= var14 && class108.field1166.method252(7) >= var15 && class108.field1166.method253(true) < var16 && class108.field1166.method252(7) < var17) {
                                var21 = true;
                            } else {
                                var21 = false;
                            }
                            if (!class348.field4665 && var21) {
                                if (var11.field6364 >= 0) {
                                    class178.field1992 = var11.field6364;
                                } else if (var11.field6416) {
                                    class178.field1992 = -1;
                                }
                            }
                            if (!class188.field2148 && arg8 >= var14 && arg9 >= var15 && arg8 < var16 && arg9 < var17) {
                                class225.method1357(arg8 - var12, arg9 - var13, false, var11);
                            }
                            boolean var22 = false;
                            if (class108.field1166.method245(20822) && var21) {
                                var22 = true;
                            }
                            boolean var23 = false;
                            class103 var24 = (class103) class156.field1744.method3434((byte) 2);
                            if (var24 != null && var24.method192(-58) == 0 && var24.method194((byte) -106) >= var14 && var24.method193((byte) -71) >= var15 && var24.method194((byte) -106) < var16 && var24.method193((byte) -73) < var17) {
                                var23 = true;
                            }
                            if (var11.field6458 != null && !class85.method443(0)) {
                                for (int var25 = 0; var25 < var11.field6458.length; var25++) {
                                    if (class140.field1549.method1945(var11.field6458[var25], false)) {
                                        if (var11.field6337 == null || class678.field9539 >= var11.field6337[var25]) {
                                            byte var26 = var11.field6362[var25];
                                            if (var26 == 0 || ((var26 & 0x8) == 0 || !class140.field1549.method1945(86, false) && !class140.field1549.method1945(82, false) && !class140.field1549.method1945(81, false)) && ((var26 & 0x2) == 0 || class140.field1549.method1945(86, false)) && ((var26 & 0x1) == 0 || class140.field1549.method1945(82, false)) && ((var26 & 0x4) == 0 || class140.field1549.method1945(81, false))) {
                                                if (var25 < 10) {
                                                    class301.method1748(var11.field6339, var25 + 1, 8, "", -1);
                                                } else if (var25 == 10) {
                                                    class204.method1218(96);
                                                    class314 var27 = method3750(var11);
                                                    class646.method3618(var11, 0, var27.method1802(1), var27.field3897);
                                                    class286.field3580 = class166.method913(var11, 93);
                                                    if (class286.field3580 == null) {
                                                        class286.field3580 = "Null";
                                                    }
                                                    class679.field9566 = var11.field6428 + "<col=ffffff>";
                                                }
                                                int var28 = var11.field6480[var25];
                                                if (var11.field6337 == null) {
                                                    var11.field6337 = new int[var11.field6458.length];
                                                }
                                                if (var28 == 0) {
                                                    var11.field6337[var25] = Integer.MAX_VALUE;
                                                } else {
                                                    var11.field6337[var25] = class678.field9539 + var28;
                                                }
                                            }
                                        }
                                    } else if (var11.field6337 != null) {
                                        var11.field6337[var25] = 0;
                                    }
                                }
                            }
                            if (var23) {
                                class406.method2275(var24.method193((byte) -127) - var13, var11, var24.method194((byte) -106) - var12, (byte) 101);
                            }
                            if (class497.field7199 != null && class497.field7199 != var11 && var21 && method3750(var11).method1801(125)) {
                                class593.field8377 = var11;
                            }
                            if (class480.field6918 == var11) {
                                class473.field6815 = true;
                                class697.field9781 = var12;
                                class546.field7802 = var13;
                            }
                            if (var11.field6479 || var11.field6335 != 0) {
                                if (var21 && class289.field3612 != 0 && var11.field6345 != null) {
                                    class213 var29 = new class213();
                                    var29.field2590 = true;
                                    var29.field2592 = var11;
                                    var29.field2586 = class289.field3612;
                                    var29.field2587 = var11.field6345;
                                    class472.field6793.method3425(var29, false);
                                }
                                if (class497.field7199 != null || class188.field2148 || class278.field3453 != var11.field6335 && class667.field9317 > 0) {
                                    var23 = false;
                                    var22 = false;
                                    var21 = false;
                                }
                                if (var11.field6335 != 0) {
                                    if (class191.field2196 == var11.field6335 || class674.field9383 == var11.field6335) {
                                        class492.field7138 = var11;
                                        if (class160.field1788 != null) {
                                            class160.field1788.method1570(var11.field6443, true, class701.field9813);
                                        }
                                        if (class191.field2196 == var11.field6335) {
                                            if (!class188.field2148 && arg8 >= var14 && arg9 >= var15 && arg8 < var16 && arg9 < var17) {
                                                class469.method2708(arg8, arg9, class701.field9813, -21051);
                                                for (class237 var30 = (class237) class474.field6833.method1672((byte) 91); var30 != null; var30 = (class237) class474.field6833.method1669(-2747)) {
                                                    if (arg8 >= var30.field2948 && arg8 < var30.field2944 && arg9 >= var30.field2950 && arg9 < var30.field2947) {
                                                        class620.method3458(-109);
                                                        class508.method2907(true, var30.field2943);
                                                    }
                                                }
                                            }
                                            class222.method1344(var12, var11, var13, (byte) -13);
                                            continue;
                                        }
                                    }
                                    if (class59.field609 == var11.field6335) {
                                        if (var11.method2607(-122, class701.field9813) == null || class16.field130 != 0 && class16.field130 != 3 || class188.field2148 || arg8 < var14 || arg9 < var15 || arg8 >= var16 || arg9 >= var17) {
                                            continue;
                                        }
                                        int var31 = arg8 - var12;
                                        int var32 = arg9 - var13;
                                        int var33 = var11.field6448[var32];
                                        if (var31 < var33 || var31 > var11.field6366[var32] + var33) {
                                            continue;
                                        }
                                        int var34 = var31 - var11.field6483 / 2;
                                        int var35 = var32 - var11.field6443 / 2;
                                        int var36;
                                        if (class538.field7572 == 4) {
                                            var36 = (int) class508.field7300 & 0x3FFF;
                                        } else {
                                            var36 = (int) class508.field7300 + class302.field3748 & 0x3FFF;
                                        }
                                        int var37 = class435.field6134[var36];
                                        int var38 = class435.field6135[var36];
                                        if (class538.field7572 != 4) {
                                            var37 = (class373.field5085 + 256) * var37 >> 8;
                                            var38 = (class373.field5085 + 256) * var38 >> 8;
                                        }
                                        int var39 = var34 * var38 + var35 * var37 >> 14;
                                        int var40 = var35 * var38 - var34 * var37 >> 14;
                                        int var41;
                                        int var42;
                                        if (class538.field7572 == 4) {
                                            var41 = (class672.field9356 >> 9) + (var39 >> 2);
                                            var42 = (class436.field6158 >> 9) - (var40 >> 2);
                                        } else {
                                            int var43 = (class362.field4859.method1414(-31789) - 1) * 256;
                                            var41 = (class362.field4859.field5179 - var43 >> 9) + (var39 >> 2);
                                            var42 = (class362.field4859.field5176 - var43 >> 9) - (var40 >> 2);
                                        }
                                        if (class348.field4665 && (class512.field7345 & 0x40) != 0) {
                                            class452 var44 = class633.method3558(class128.field1439, -1, class465.field6641);
                                            if (var44 == null) {
                                                class204.method1218(16);
                                            } else {
                                                class53.method279(var11.field6434, var42, " ->", 1L, 103, true, 11, class286.field3580, false, class185.field2084, var41);
                                            }
                                            continue;
                                        }
                                        if (class312.field3886 == class246.field3031) {
                                            class53.method279(-1, var42, "", 1L, 121, true, 15, class198.field2312.method1195((byte) 62, class504.field7267), false, -1, var41);
                                        }
                                        class53.method279(-1, var42, "", 1L, 125, true, 19, class223.field2772, false, class676.field9407, var41);
                                        continue;
                                    }
                                    if (class278.field3453 == var11.field6335) {
                                        class677.field9478 = var11;
                                        if (var21) {
                                            class345.field4646 = true;
                                        }
                                        if (var23) {
                                            int var45 = (int) ((double) (var24.method194((byte) -106) - var12 - var11.field6483 / 2) * 2.0D / (double) class482.field6942);
                                            int var46 = (int) (-((double) (var24.method193((byte) -76) - var13 - var11.field6443 / 2) * 2.0D / (double) class482.field6942));
                                            int var47 = class81.field838 + var45 + class482.field6943;
                                            int var48 = class36.field373 + var46 + class482.field6951;
                                            class440 var49 = class221.method1303((byte) 127);
                                            if (var49 == null) {
                                                continue;
                                            }
                                            int[] var50 = new int[3];
                                            var49.method2543(var47, var50, var48, (byte) -87);
                                            if (var50 != null) {
                                                if (class140.field1549.method1945(82, false) && class296.field3704 > 0) {
                                                    class26.method143(var50[1], var50[2], -126, var50[0]);
                                                    continue;
                                                }
                                                class669.field9324 = true;
                                                class73.field770 = var50[0];
                                                class377.field5116 = var50[1];
                                                class365.field4907 = var50[2];
                                            }
                                            class667.field9317 = 1;
                                            class361.field4845 = false;
                                            class471.field6758 = class108.field1166.method253(true);
                                            class102.field1109 = class108.field1166.method252(7);
                                            continue;
                                        }
                                        if (var22 && class667.field9317 > 0) {
                                            if (class667.field9317 == 1 && (class471.field6758 != class108.field1166.method253(true) || class102.field1109 != class108.field1166.method252(7))) {
                                                class540.field7590 = class81.field838;
                                                class390.field5277 = class36.field373;
                                                class667.field9317 = 2;
                                            }
                                            if (class667.field9317 == 2) {
                                                class361.field4845 = true;
                                                class432.method2483(-114, class540.field7590 + (int) ((double) (class471.field6758 - class108.field1166.method253(true)) * 2.0D / (double) class482.field6941));
                                                class198.method1196(class390.field5277 - (int) ((double) (class102.field1109 - class108.field1166.method252(7)) * 2.0D / (double) class482.field6941), -125);
                                            }
                                            continue;
                                        }
                                        if (class667.field9317 > 0 && !class361.field4845) {
                                            if ((class436.field6145 == 1 || class602.method3370(-2001)) && class661.field9266 > 2) {
                                                class277.method1618((byte) 52, class102.field1109, class471.field6758);
                                            } else if (class670.method3707((byte) -76)) {
                                                class277.method1618((byte) 52, class102.field1109, class471.field6758);
                                            }
                                        }
                                        class667.field9317 = 0;
                                        continue;
                                    }
                                    if (class522.field7400 == var11.field6335) {
                                        if (var22) {
                                            class222.method1345(var11.field6483, class108.field1166.method253(true) - var12, var11.field6443, class108.field1166.method252(7) - var13, -11567);
                                        }
                                        continue;
                                    }
                                    if (class475.field6855 == var11.field6335) {
                                        class23.method105(var13, var11, (byte) -114, var12);
                                        continue;
                                    }
                                }
                                if (!var11.field6388 && var23) {
                                    var11.field6388 = true;
                                    if (var11.field6446 != null) {
                                        class213 var51 = new class213();
                                        var51.field2590 = true;
                                        var51.field2592 = var11;
                                        var51.field2584 = var24.method194((byte) -106) - var12;
                                        var51.field2586 = var24.method193((byte) -75) - var13;
                                        var51.field2587 = var11.field6446;
                                        class472.field6793.method3425(var51, false);
                                    }
                                }
                                if (var11.field6388 && var22 && var11.field6454 != null) {
                                    class213 var52 = new class213();
                                    var52.field2590 = true;
                                    var52.field2592 = var11;
                                    var52.field2584 = class108.field1166.method253(true) - var12;
                                    var52.field2586 = class108.field1166.method252(7) - var13;
                                    var52.field2587 = var11.field6454;
                                    class472.field6793.method3425(var52, false);
                                }
                                if (var11.field6388 && !var22) {
                                    var11.field6388 = false;
                                    if (var11.field6481 != null) {
                                        class213 var53 = new class213();
                                        var53.field2590 = true;
                                        var53.field2592 = var11;
                                        var53.field2584 = class108.field1166.method253(true) - var12;
                                        var53.field2586 = class108.field1166.method252(7) - var13;
                                        var53.field2587 = var11.field6481;
                                        class282.field3531.method3425(var53, false);
                                    }
                                }
                                if (var22 && var11.field6460 != null) {
                                    class213 var54 = new class213();
                                    var54.field2590 = true;
                                    var54.field2592 = var11;
                                    var54.field2584 = class108.field1166.method253(true) - var12;
                                    var54.field2586 = class108.field1166.method252(7) - var13;
                                    var54.field2587 = var11.field6460;
                                    class472.field6793.method3425(var54, false);
                                }
                                if (!var11.field6435 && var21) {
                                    var11.field6435 = true;
                                    if (var11.field6392 != null) {
                                        class213 var55 = new class213();
                                        var55.field2590 = true;
                                        var55.field2592 = var11;
                                        var55.field2584 = class108.field1166.method253(true) - var12;
                                        var55.field2586 = class108.field1166.method252(7) - var13;
                                        var55.field2587 = var11.field6392;
                                        class472.field6793.method3425(var55, false);
                                    }
                                }
                                if (var11.field6435 && var21 && var11.field6368 != null) {
                                    class213 var56 = new class213();
                                    var56.field2590 = true;
                                    var56.field2592 = var11;
                                    var56.field2584 = class108.field1166.method253(true) - var12;
                                    var56.field2586 = class108.field1166.method252(7) - var13;
                                    var56.field2587 = var11.field6368;
                                    class472.field6793.method3425(var56, false);
                                }
                                if (var11.field6435 && !var21) {
                                    var11.field6435 = false;
                                    if (var11.field6349 != null) {
                                        class213 var57 = new class213();
                                        var57.field2590 = true;
                                        var57.field2592 = var11;
                                        var57.field2584 = class108.field1166.method253(true) - var12;
                                        var57.field2586 = class108.field1166.method252(7) - var13;
                                        var57.field2587 = var11.field6349;
                                        class282.field3531.method3425(var57, false);
                                    }
                                }
                                if (var11.field6342 != null) {
                                    class213 var58 = new class213();
                                    var58.field2592 = var11;
                                    var58.field2587 = var11.field6342;
                                    class113.field1194.method3425(var58, false);
                                }
                                if (var11.field6439 != null && class617.field8695 > var11.field6456) {
                                    if (var11.field6390 == null || class617.field8695 - var11.field6456 > 32) {
                                        class213 var63 = new class213();
                                        var63.field2592 = var11;
                                        var63.field2587 = var11.field6439;
                                        class472.field6793.method3425(var63, false);
                                    } else {
                                        label696: for (int var59 = var11.field6456; var59 < class617.field8695; var59++) {
                                            int var60 = class221.field2714[var59 & 0x1F];
                                            for (int var61 = 0; var61 < var11.field6390.length; var61++) {
                                                if (var11.field6390[var61] == var60) {
                                                    class213 var62 = new class213();
                                                    var62.field2592 = var11;
                                                    var62.field2587 = var11.field6439;
                                                    class472.field6793.method3425(var62, false);
                                                    break label696;
                                                }
                                            }
                                        }
                                    }
                                    var11.field6456 = class617.field8695;
                                }
                                if (var11.field6445 != null && class580.field8205 > var11.field6447) {
                                    if (var11.field6383 == null || class580.field8205 - var11.field6447 > 32) {
                                        class213 var68 = new class213();
                                        var68.field2592 = var11;
                                        var68.field2587 = var11.field6445;
                                        class472.field6793.method3425(var68, false);
                                    } else {
                                        label672: for (int var64 = var11.field6447; var64 < class580.field8205; var64++) {
                                            int var65 = class39.field398[var64 & 0x1F];
                                            for (int var66 = 0; var66 < var11.field6383.length; var66++) {
                                                if (var11.field6383[var66] == var65) {
                                                    class213 var67 = new class213();
                                                    var67.field2592 = var11;
                                                    var67.field2587 = var11.field6445;
                                                    class472.field6793.method3425(var67, false);
                                                    break label672;
                                                }
                                            }
                                        }
                                    }
                                    var11.field6447 = class580.field8205;
                                }
                                if (var11.field6365 != null && class424.field5981 > var11.field6421) {
                                    if (var11.field6405 == null || class424.field5981 - var11.field6421 > 32) {
                                        class213 var73 = new class213();
                                        var73.field2592 = var11;
                                        var73.field2587 = var11.field6365;
                                        class472.field6793.method3425(var73, false);
                                    } else {
                                        label648: for (int var69 = var11.field6421; var69 < class424.field5981; var69++) {
                                            int var70 = class206.field2449[var69 & 0x1F];
                                            for (int var71 = 0; var71 < var11.field6405.length; var71++) {
                                                if (var11.field6405[var71] == var70) {
                                                    class213 var72 = new class213();
                                                    var72.field2592 = var11;
                                                    var72.field2587 = var11.field6365;
                                                    class472.field6793.method3425(var72, false);
                                                    break label648;
                                                }
                                            }
                                        }
                                    }
                                    var11.field6421 = class424.field5981;
                                }
                                if (var11.field6354 != null && class673.field9369 > var11.field6353) {
                                    if (var11.field6371 == null || class673.field9369 - var11.field6353 > 32) {
                                        class213 var78 = new class213();
                                        var78.field2592 = var11;
                                        var78.field2587 = var11.field6354;
                                        class472.field6793.method3425(var78, false);
                                    } else {
                                        label624: for (int var74 = var11.field6353; var74 < class673.field9369; var74++) {
                                            int var75 = class119.field1324[var74 & 0x1F];
                                            for (int var76 = 0; var76 < var11.field6371.length; var76++) {
                                                if (var11.field6371[var76] == var75) {
                                                    class213 var77 = new class213();
                                                    var77.field2592 = var11;
                                                    var77.field2587 = var11.field6354;
                                                    class472.field6793.method3425(var77, false);
                                                    break label624;
                                                }
                                            }
                                        }
                                    }
                                    var11.field6353 = class673.field9369;
                                }
                                if (var11.field6410 != null && class313.field3892 > var11.field6350) {
                                    if (var11.field6389 == null || class313.field3892 - var11.field6350 > 32) {
                                        class213 var83 = new class213();
                                        var83.field2592 = var11;
                                        var83.field2587 = var11.field6410;
                                        class472.field6793.method3425(var83, false);
                                    } else {
                                        label600: for (int var79 = var11.field6350; var79 < class313.field3892; var79++) {
                                            int var80 = class182.field2049[var79 & 0x1F];
                                            for (int var81 = 0; var81 < var11.field6389.length; var81++) {
                                                if (var11.field6389[var81] == var80) {
                                                    class213 var82 = new class213();
                                                    var82.field2592 = var11;
                                                    var82.field2587 = var11.field6410;
                                                    class472.field6793.method3425(var82, false);
                                                    break label600;
                                                }
                                            }
                                        }
                                    }
                                    var11.field6350 = class313.field3892;
                                }
                                if (class583.field8281 > var11.field6432 && var11.field6466 != null) {
                                    class213 var84 = new class213();
                                    var84.field2592 = var11;
                                    var84.field2587 = var11.field6466;
                                    class472.field6793.method3425(var84, false);
                                }
                                if (class245.field3028 > var11.field6432 && var11.field6324 != null) {
                                    class213 var85 = new class213();
                                    var85.field2592 = var11;
                                    var85.field2587 = var11.field6324;
                                    class472.field6793.method3425(var85, false);
                                }
                                if (class171.field1903 > var11.field6432 && var11.field6351 != null) {
                                    class213 var86 = new class213();
                                    var86.field2592 = var11;
                                    var86.field2587 = var11.field6351;
                                    class472.field6793.method3425(var86, false);
                                }
                                if (class409.field5469 > var11.field6432 && var11.field6468 != null) {
                                    class213 var87 = new class213();
                                    var87.field2592 = var11;
                                    var87.field2587 = var11.field6468;
                                    class472.field6793.method3425(var87, false);
                                }
                                if (class153.field1695 > var11.field6432 && var11.field6363 != null) {
                                    class213 var88 = new class213();
                                    var88.field2592 = var11;
                                    var88.field2587 = var11.field6363;
                                    class472.field6793.method3425(var88, false);
                                }
                                var11.field6432 = class158.field1780;
                                if (var11.field6316 != null) {
                                    for (int var89 = 0; var89 < class557.field7953; var89++) {
                                        class213 var90 = new class213();
                                        var90.field2592 = var11;
                                        var90.field2591 = class537.field7551[var89].method866(-37);
                                        var90.field2585 = class537.field7551[var89].method868(10943);
                                        var90.field2587 = var11.field6316;
                                        class472.field6793.method3425(var90, false);
                                    }
                                }
                                if (class209.field2465 && var11.field6398 != null) {
                                    class213 var91 = new class213();
                                    var91.field2592 = var11;
                                    var91.field2587 = var11.field6398;
                                    class472.field6793.method3425(var91, false);
                                }
                            }
                            if (var11.field6471 == 5 && var11.field6381 != -1) {
                                var11.method2595(class66.field669, class328.field4021, 0).method1570(var11.field6443, true, class701.field9813);
                            }
                            class663.method3684(15085, var11);
                            if (var11.field6471 == 0) {
                                method3751(arg0, var11.field6339, var14, var15, var16, var17, var12 - var11.field6414, var13 - var11.field6451, arg8, arg9);
                                if (var11.field6399 != null) {
                                    method3751(var11.field6399, var11.field6339, var14, var15, var16, var17, var12 - var11.field6414, var13 - var11.field6451, arg8, arg9);
                                }
                                class633 var92 = (class633) class14.field117.method3669((long) var11.field6339, -1);
                                if (var92 != null) {
                                    if (class616.field8685 == class246.field3031 && var92.field8921 == 0 && !class188.field2148 && var21 && !class590.field8339) {
                                        class620.method3458(-96);
                                    }
                                    class635.method3571(var92.field8920, arg8, var15, var16, arg9, var14, var12, var13, var17, (byte) 74);
                                }
                            }
                        }
                    }
                } else if (var14 < var16 && var15 < var17) {
                    class663.method3684(15085, var11);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        try {
            if (arg0.length != 6) {
                class154.method836(false, "Argument count");
            }
            class42.field414 = new class178();
            class42.field414.field2001 = Integer.parseInt(arg0[0]);
            class527.field7428 = new class178();
            class527.field7428.field2001 = Integer.parseInt(arg0[1]);
            class152.field1682 = new class178();
            class152.field1682.field2001 = Integer.parseInt(arg0[2]);
            class337.field4237 = class325.field4005;
            if (arg0[3].equals("live")) {
                class416.field5582 = class381.field5159;
            } else if (arg0[3].equals("rc")) {
                class416.field5582 = class314.field3907;
            } else if (arg0[3].equals("wip")) {
                class416.field5582 = class223.field2771;
            } else {
                class154.method836(false, "modewhat");
            }
            class504.field7267 = class593.method3336(arg0[4], (byte) -123);
            if (class504.field7267 == -1) {
                if (arg0[4].equals("english")) {
                    class504.field7267 = 0;
                } else if (arg0[4].equals("german")) {
                    class504.field7267 = 1;
                } else {
                    class154.method836(false, "language");
                }
            }
            class546.field7791 = false;
            class381.field5161 = false;
            if (arg0[5].equals("game0")) {
                class246.field3031 = class616.field8685;
            } else if (arg0[5].equals("game1")) {
                class246.field3031 = class312.field3886;
            } else {
                class154.method836(false, "game");
            }
            class208.field2464 = "";
            class671.field9348 = 0;
            class16.field135 = 0;
            class518.field7376 = false;
            class35.field350 = false;
            class463.field6589 = null;
            class249.field3090 = class246.field3031.field3943;
            class658.field9243 = 0L;
            class112.field1186 = 0;
            class359.field4829 = null;
            class599.field8432 = true;
            class599.field8435 = true;
            client var1 = new client();
            class338.field4252 = var1;
            var1.method2559(class246.field3031.field3940, class416.field5582.method1534(true) + 32, 35, 1024, (byte) 35, false, 768, 622);
            class503.field7242.setLocation(40, 40);
        } catch (Exception var3) {
            class333.method1923(var3, true, null);
        }
        field9546++;
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
    public final void method2555(int arg0) {
        field9540++;
        int var2 = 60 / ((29 - arg0) / 54);
        if (class430.field6109 != 2) {
            this.method3747(27142);
            return;
        }
        try {
            this.method3747(27142);
        } catch (ThreadDeath var5) {
            throw var5;
        } catch (Throwable var6) {
            class333.method1923(var6, true, var6.getMessage() + " (Recovered) " + this.method2560(false));
            class434.method2489(0, (byte) -116);
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
    public final void method2550(byte arg0) {
        method3756(622);
        field9547++;
        class128.method727((byte) -73);
        class112.method595((byte) 113);
        class76.method408(50);
        class198.method1194(3);
        class566.method3210((byte) -121);
        class396.method2240((byte) -117);
        class411.method2303(-1);
        class256.method1516(3250);
        class624.method3508(1);
        class617.method3442(-2);
        class333.method1924((byte) 95);
        class661.method3670(0);
        class441.method2552(true);
        class71.method368((byte) 119);
        class259.method1535(-22580);
        class320.method1820(61);
        class490.method2842(false);
        class564.method3196(4122);
        class460.method2637(-13245);
        class99.method534(-57);
        class296.method1730((byte) 121);
        class616.method3427(-128);
        class408.method2286(125);
        class165.method899(-78);
        class688.method3803(-116);
        class494.method2862(98);
        class701.method3871(100);
        class680.method3771(-86);
        class585.method3310(1);
        class19.method82(763848965);
        class373.method2172((byte) 95);
        class526.method2966((byte) 95);
        class268.method1581(4);
        class519.method2948(5331);
        class501.method2884(59);
        class486.method2803(44);
        class365.method2131(9859);
        class122.method706(3);
        class184.method1117(93);
        class63.method332((byte) 120);
        class53.method276((byte) -39);
        class173.method1058(-89);
        class541.method3040(64);
        class435.method2495(116);
        class228.method1372((byte) 116);
        class380.method2190(122);
        class591.method3330(-100);
        class146.method804(60);
        class697.method3834(-18564);
        class665.method3690(-89);
        class444.method2571(10);
        class386.method2209(-88);
        class255.method1511(5504);
        class674.method3723((byte) 80);
        class110.method592(false);
        class44.method227((byte) -84);
        class272.method1600(0);
        class263.method1554((byte) 76);
        class476.method2746((byte) -126);
        class440.method2537((byte) -118);
        class182.method1104(-119);
        class266.method1572(false);
        class287.method1668((byte) -67);
        class7.method48(false);
        class236.method1417(2);
        class347.method2064(-116);
        class656.method3650(-193);
        class61.method328(107);
        class653.method3637(1024);
        class677.method3738((byte) 112);
        class499.method2875(true);
        class469.method2709((byte) 103);
        class190.method1153(8128);
        class600.method3367(5479);
        class633.method3559((byte) -31);
        class314.method1800(50);
        class324.method1829(60);
        class629.method3534((byte) 78);
        class321.method1822(-24801);
        class414.method2332((byte) 75);
        class536.method3007((byte) 40);
        class557.method3155(94);
        class50.method261(-20360);
        class662.method3680(-24663);
        class130.method738(-1);
        class612.method3411(true);
        class178.method1088(118);
        class693.method3815(-10319);
        class594.method3339(8848);
        class186.method1130(0);
        class421.method2356(-107);
        class356.method2098((byte) 106);
        class51.method264(0);
        class472.method2717(false);
        class158.method853((byte) 104);
        class257.method1526((byte) -49);
        class473.method2731(-114);
        class8.method49(-19951);
        class390.method2219((byte) -92);
        class60.method323((byte) -60);
        class401.method2259(-63);
        class638.method3592(97);
        class581.method3299(-1);
        class65.method350(-120);
        class274.method1611(121);
        class210.method1244(0);
        class487.method2813((byte) 3);
        class413.method2326((byte) 104);
        class286.method1664(25254);
        class20.method93(4);
        class598.method3353((byte) -84);
        class385.method2206((byte) -116);
        class463.method2655(0);
        class670.method3709(-1);
        class81.method431(18246);
        class96.method512(18917);
        class632.method3554(8466);
        class271.method1594((byte) -50);
        class340.method1967(26332);
        class13.method62(-1);
        class224.method1354((byte) 39);
        class27.method150((byte) -21);
        class247.method1453(true);
        class262.method1541(39);
        class26.method147(2);
        class6.method46((byte) -96);
        class232.method1390(66);
        class327.method1842((byte) -17);
        class352.method2085((byte) 73);
        class428.method2472(-23839);
        class250.method1474((byte) -84);
        class560.method3180((byte) 98);
        class358.method2106((byte) -57);
        class482.method2774();
        class361.method2120(0);
        class645.method3615((byte) 55);
        class231.method1383(0);
        class35.method187((byte) 110);
        class419.method2348(988355684);
        class240.method1427(4);
        class648.method3626(0);
        class613.method3412(-21399);
        class383.method2200(true);
        class315.method1812(1);
        class676.method3729(false);
        class609.method3392(1784588801);
        class339.method1961();
        class161.method875(0);
        class538.method3035((byte) 114);
        class107.method583(-32);
        class652.method3633((byte) -127);
        class533.method2993(-19693);
        class281.method1647();
        class620.method3456(0);
        class289.method1684(-1);
        class217.method1269(false);
        class679.method3767(1);
        class174.method1066();
        class655.method3647(-1);
        class151.method823(140);
        class446.method2585(false);
        class403.method2267(19543);
        class213.method1261(-19616);
        class142.method784(false);
        class587.method3312(true);
        class223.method1348(46);
        class241.method1432((byte) -114);
        class204.method1219(0);
        class465.method2688(-1);
        class94.method480((byte) -15);
        class120.method696(122);
        class418.method2347(-24924);
        class623.method3501();
        class93.method469(67);
        class667.method3695(103);
        class636.method3574(-2200);
        class416.method2343(0);
        class523.method2962();
        class590.method3327(-18705);
        class558.method3169(31185);
        class681.method3781(false);
        class700.method3846((byte) -29);
        class628.method3525((byte) -33);
        class682.method3786(37);
        class273.method1601(23522);
        class253.method1491();
        class313.method1797(92);
        class432.method2486(126);
        class346.method2062((byte) -92);
        class226.method1362((byte) 48);
        class379.method2188((byte) 112);
        class235.method1396(100);
        class531.method2983(120);
        class400.method2254(65);
        class145.method797(91);
        class166.method911(0);
        class349.method2070(4);
        class459.method2630(-1);
        class635.method3568((byte) 30);
        class164.method891(200);
        class610.method3399((byte) 89);
        class695.method3823(-5);
        class605.method3381(9402);
        class334.method1926(0);
        class85.method444(false);
        class64.method348(-73);
        class192.method1168(1);
        class382.method2198((byte) 94);
        class381.method2197((byte) 95);
        class117.method681(7);
        class237.method1422((byte) 18);
        class34.method186(-1);
        class397.method2243((byte) -108);
        class310.method1781((byte) -103);
        class619.method3454(-108);
        class290.method1697(32768);
        class602.method3369(-31613);
        class639.method3599((byte) 76);
        class696.method3826((byte) 21);
        class212.method1259((byte) 102);
        class312.method1792(false);
        class654.method3639(71);
        class462.method2652(5);
        class70.method365(23941);
        class593.method3334(127);
        class338.method1938((byte) 46);
        class249.method1471((byte) -121);
        class14.method65(false);
        class101.method546(-79);
        class474.method2732(0);
        class552.method3130(-1);
        class522.method2960(96);
        class631.method3539(3);
        class345.method2060(110);
        class202.method1209(true);
        class39.method204(62);
        class291.method1698((byte) -95);
        class442.method2564(53);
        class193.method1172((byte) -43);
        class295.method1724(35);
        class246.method1450((byte) 47);
        class553.method3139(1);
        class205.method1229((byte) 6);
        class258.method1530(-61);
        class603.method3374(true);
        class694.method3818(-8925);
        class551.method3128(16);
        class415.method2336(0);
        class376.method2179(-2);
        class77.method409((byte) 81);
        class644.method3611((byte) -124);
        class42.method218(1421);
        class188.method1140(-72);
        class355.method2095(123);
        int var2 = -74 % ((21 - arg0) / 62);
        class277.method1615(-6323);
        class576.method3259();
        class388.method2214((byte) -73);
        class170.method924(-125);
        class649.method3629(true);
        class477.method2748((byte) 0);
        class483.method2793(16572);
        class36.method188(-93);
        class45.method231(20658);
        class156.method840((byte) 111);
        class426.method2463(-5924);
        class666.method3694((byte) -78);
        class222.method1343(-13914);
        class698.method3835(true);
        class578.method3269(true);
        class73.method400((byte) -80);
        class125.method717(-1973385120);
        class511.method2926();
        class285.method1661(91);
        class410.method2296((byte) 89);
        class335.method1933();
        class685.method3792();
        class372.method2166(0);
        class646.method3619((byte) -106);
        class40.method206();
        class56.method293((byte) 105);
        class478.method2751(116);
        class108.method588((byte) -73);
        class672.method3715(true);
        class488.method2831(0);
        class568.method3219((byte) 106);
        class203.method1214(-84);
        class29.method154(5392);
        class692.method3814(-30391);
        class176.method1069((byte) 101);
        class495.method2863(1);
        class89.method455(32410);
        class16.method68(0);
        class575.method3254(-20070);
        class510.method2914(true);
        class137.method767((byte) 33);
        class491.method2850();
        class425.method2446(-12918);
        class377.method2183(-1396999004);
        class11.method59(15);
        class687.method3799(-126);
        class563.method3192(-77);
        class119.method693(-1);
        class118.method689(-112139864);
        class105.method570(21369);
        class595.method3342((byte) 83);
        class138.method775((byte) -125);
        class353.method2089(27502);
        class143.method792(66);
        class147.method810((byte) 52);
        class79.method417(-111);
        class169.method922(false);
        class371.method2163(-28883);
        class208.method1240((byte) 91);
        class512.method2932(28921);
        class420.method2352(56);
        class239.method1425(true);
        class3.method14((byte) -54);
        class348.method2067((byte) 56);
        class422.method2401((byte) -83);
        class68.method361(5);
        class705.method3940(false);
        class703.method3896(true);
        class25.method134(-104);
        class185.method1127(-8783);
        class168.method920(true);
        class201.method1201(33985);
        class24.method121(-123);
        class325.method1838(-102);
        class412.method2309((byte) 124);
        class196.method1187(6);
        class351.method2080((byte) -3);
        class209.method1241(-23375);
        class140.method779((byte) 120);
        class615.method3419((byte) 19);
        class179.method1093(8192);
        class341.method1973(69);
        class537.method3009(117);
        class41.method217(114);
        class689.method3810(5);
        class319.method1818((byte) 100);
        class369.method2157(true);
        class660.method3664((byte) -126);
        class539.method3038((byte) -101);
        class611.method3407(5439);
        class330.method1862((byte) 71);
        class485.method2797((byte) -49);
        class163.method883(-122);
        class307.method1767((byte) -125);
        class436.method2503(88);
        class215.method1263(0);
        class221.method1286(-4232);
        class55.method289();
        class181.method1099(4185954);
        class378.method2184(18458);
        class66.method352((byte) 122);
        class206.method1236(124);
        class384.method2202(2);
        class311.method1783(2);
        class505.method2897((byte) 110);
        class100.method543(-120);
        class647.method3621(0);
        class300.method1743((byte) -84);
        class157.method850((byte) -128);
        class443.method2570(0);
        class304.method1758((byte) -119);
        class475.method2735(-12560);
        class496.method2870((byte) -118);
        class316.method1813(11818);
        class368.method2154(45);
        class671.method3712(-100);
        class663.method3682((byte) -107);
        class211.method1257(7574);
        class471.method2714((byte) 5);
        class148.method813(114);
        class573.method3238((byte) -114);
        class530.method2978(34037);
        class549.method3108(-3);
        class46.method242(1);
        class189.method1147(105);
        class171.method932(16777216);
        class162.method877(false);
        class669.method3700(-66);
        class132.method746();
        class545.method3067();
        class409.method2290(0);
        class364.method2128(true);
        class480.method2763((byte) 64);
        class136.method764((byte) -23);
        class293.method1722((byte) 27);
        class80.method419(70);
        class72.method393(-2715);
        class243.method1440(0);
        class90.method457(-1);
        class508.method2906(false);
        class83.method436(-1);
        class123.method710((byte) 121);
        class678.method3745(19753);
        class113.method599(0);
        class102.method552(-32633);
        class630.method3535(-1);
        class571.method3227((byte) -91);
        class417.method2345(55);
        class309.method1770(21138);
        class454.method2615(3827);
        class48.method260(2);
        class637.method3580(255);
        class254.method1496(0);
        class329.method1852((byte) -10);
        class673.method3717((byte) -32);
        class114.method603((byte) -41);
        class180.method1098((byte) -93);
        class244.method1441(34167);
        class430.method2477(64);
        class492.method2854(-23190);
        class394.method2234(-114);
        class306.method1763((byte) 120);
        class583.method3302(2);
        class392.method2229(9204);
        class424.method2444(0);
        class234.method1392((byte) 6);
        class664.method3685(0);
        class197.method1189(31633);
        class434.method2490(true);
        class139.method777(false);
        class106.method575(1664);
        class207.method1237(0);
        class124.method712(58);
        class470.method2712(1);
        class507.method2900(-18399);
        class547.method3103(32348);
        class280.method1633(100);
        class580.method3285(8178);
        class559.method3173(0);
        class461.method2651(-112);
        class554.method3143(2);
        class194.method1182((byte) -49);
        class342.method1976(-127);
        class275.method1612((byte) 78);
        class116.method677(false);
        class282.method1651(8845);
        class489.method2840(111);
        class265.method1564(-50);
        class91.method461((byte) -29);
        class298.method1739((byte) -53);
        class359.method2107(true);
        class497.method2872((byte) -125);
        class404.method2269(3);
        class626.method3520((byte) -119);
        class503.method2891(0);
        class642.method3610(6);
        class32.method169(false);
        class9.method53(-93);
        class699.method3843(11170);
        class269.method1583(-1);
        class242.method1438((byte) -127);
        class331.method1917((byte) 62);
        class527.method2970(-17019);
        class597.method3352(1);
        class141.method782(true);
        class152.method828(107);
        class103.method557(4);
        class651.method3630(true);
        class220.method1275(15029);
        class248.method1463(false);
        class336.method1934(-2);
        class362.method2122((byte) 107);
        class375.method2177((byte) -22);
        class389.method2216((byte) 75);
        class363.method2125(124);
        class328.method1847(126);
        class160.method874(true);
        class604.method3378((byte) 95);
        class92.method465(false);
        class407.method2277((byte) -75);
        class200.method1200(4);
        class405.method2270(false);
        class517.method2939(256);
        class588.method3316(-81);
        class398.method2249(79);
        class126.method720((byte) -123);
        class518.method2942(false);
        class299.method1741((byte) 77);
        class337.method1936((byte) -53);
        class684.method3790(118);
        class614.method3414((byte) -42);
        class104.method565(-118);
        class572.method3234(1517326177);
        if (class441.field6221) {
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
    private final void method3752(int arg0) {
        if (class421.field5601 == 7 && class579.field8191 == 0) {
            if (class311.field3842 > 1) {
                class153.field1695 = class158.field1780;
                class311.field3842--;
            }
            if (!class188.field2148) {
                class620.method3458(-88);
            }
            for (int var2 = 0; var2 < 100 && class99.method535((byte) 119); var2++) {
            }
        }
        field9541++;
        class569.field8088++;
        if (arg0 != -15) {
            return;
        }
        class222.method1344(-1, null, -1, (byte) -13);
        class23.method105(-1, null, (byte) 127, -1);
        class194.method1183(false);
        class158.field1780++;
        for (int var3 = 0; var3 < class53.field533; var3++) {
            class600 var4 = class653.field9160[var3].field2601;
            if (var4 != null) {
                byte var5 = var4.field8461.field2508;
                if ((var5 & 0x1) != 0) {
                    int var6 = var4.method1414(arg0 ^ 0x7C22);
                    if ((var5 & 0x2) != 0 && var4.field9518 == 0 && Math.random() * 1000.0D < 10.0D) {
                        int var7 = (int) Math.round(Math.random() * 10.0D - 5.0D);
                        int var8 = (int) Math.round(Math.random() * 10.0D - 5.0D);
                        if (var7 != 0 || var8 != 0) {
                            int var9 = var4.field9517[0] + var7;
                            if (var9 < 0) {
                                var9 = 0;
                            } else if ((class142.field1574 - var6 - 1) < var9) {
                                var9 = class142.field1574 - var6 - 1;
                            }
                            int var10 = var4.field9513[0] + var8;
                            if (var10 < 0) {
                                var10 = 0;
                            } else if (class140.field1550 - var6 - 1 < var10) {
                                var10 = class140.field1550 - var6 - 1;
                            }
                            int var11 = class20.method94(var10, class68.field682, 0, 0, class220.field2623, true, -1, class282.field3534[var4.field5166], var6, var4.field9517[0], var4.field9513[0], (byte) -69, var9, var6, var6);
                            if (var11 > 0) {
                                if (var11 > 9) {
                                    var11 = 9;
                                }
                                for (int var12 = 0; var12 < var11; var12++) {
                                    var4.field9517[var12] = class68.field682[var11 - var12 - 1];
                                    var4.field9513[var12] = class220.field2623[var11 - var12 - 1];
                                    var4.field9523[var12] = 1;
                                }
                                var4.field9518 = var11;
                            }
                        }
                    }
                    class119.method692(true, var4, -2);
                    int var13 = class301.method1750(var4, arg0 - 90);
                    class279.method1628(arg0 + 71, var13, class264.field3293, var4, class171.field1900);
                    class136.method765((byte) 123, class264.field3293, var4);
                    class498.method2873(var4, (byte) 92);
                }
            }
        }
        if (class579.field8191 == 0 && class654.field9183 == 0) {
            if (class538.field7572 == 2) {
                class285.method1658(256);
            } else {
                class349.method2072(-9319);
            }
            if (class516.field7360 >> 9 < 14 || (class516.field7360 >> 9) >= (class142.field1574 - 14) || (class689.field9698 >> 9) < 14 || (class140.field1550 - 14) <= (class689.field9698 >> 9)) {
                class269.method1584(-1);
            }
        }
        while (true) {
            class213 var14;
            class452 var15;
            class452 var16;
            do {
                var14 = (class213) class113.field1194.method3440((byte) 112);
                if (var14 == null) {
                    while (true) {
                        class213 var17;
                        class452 var18;
                        class452 var19;
                        do {
                            var17 = (class213) class282.field3531.method3440((byte) -57);
                            if (var17 == null) {
                                while (true) {
                                    class213 var20;
                                    class452 var21;
                                    class452 var22;
                                    do {
                                        var20 = (class213) class472.field6793.method3440((byte) -93);
                                        if (var20 == null) {
                                            if (class497.field7199 != null) {
                                                class568.method3222(true);
                                            }
                                            if ((class678.field9539 % 1500) == 0) {
                                                class285.method1660(-122);
                                            }
                                            if (class421.field5601 == 7 && class579.field8191 == 0) {
                                                class247.method1458(-3);
                                            }
                                            class633.method3560(true);
                                            if (class537.field7555 && (class557.method3157(-102) - 60000L) > class415.field5562) {
                                                class355.method2097((byte) -121);
                                            }
                                            for (class596 var23 = (class596) class355.field4776.method1672((byte) 69); var23 != null; var23 = (class596) class355.field4776.method1669(-2747)) {
                                                if ((long) var23.field8393 < class557.method3157(-96) / 1000L - 5L) {
                                                    if (var23.field8391 > 0) {
                                                        class416.method2341(arg0 ^ 0xFFFFFFF1, var23.field8395 + class198.field2304.method1195((byte) 62, class504.field7267), "", "", 0, 5, "");
                                                    }
                                                    if (var23.field8391 == 0) {
                                                        class416.method2341(0, var23.field8395 + class198.field2305.method1195((byte) 62, class504.field7267), "", "", 0, 5, "");
                                                    }
                                                    var23.method1821(66);
                                                }
                                            }
                                            if (class421.field5601 == 7 && class579.field8191 == 0) {
                                                if (class99.field1061 == null) {
                                                    class73.method394(0, false);
                                                    return;
                                                }
                                                class79.field808++;
                                                if (class79.field808 > 50) {
                                                    class445.field6269++;
                                                    class653 var24 = class699.method3845((byte) 45, class39.field395, class494.field7149);
                                                    class568.method3220(var24, (byte) 43);
                                                }
                                                try {
                                                    class160.method869((byte) -84);
                                                    return;
                                                } catch (IOException var25) {
                                                    class73.method394(0, false);
                                                    return;
                                                }
                                            }
                                            return;
                                        }
                                        var21 = var20.field2592;
                                        if (var21.field6360 < 0) {
                                            break;
                                        }
                                        var22 = class92.method464(var21.field6467, -167823504);
                                    } while (var22 == null || var22.field6399 == null || var22.field6399.length <= var21.field6360 || var22.field6399[var21.field6360] != var21);
                                    class281.method1642(var20);
                                }
                            }
                            var18 = var17.field2592;
                            if (var18.field6360 < 0) {
                                break;
                            }
                            var19 = class92.method464(var18.field6467, -167823504);
                        } while (var19 == null || var19.field6399 == null || var18.field6360 >= var19.field6399.length || var19.field6399[var18.field6360] != var18);
                        class281.method1642(var17);
                    }
                }
                var15 = var14.field2592;
                if (var15.field6360 < 0) {
                    break;
                }
                var16 = class92.method464(var15.field6467, -167823504);
            } while (var16 == null || var16.field6399 == null || var15.field6360 >= var16.field6399.length || var16.field6399[var15.field6360] != var15);
            class281.method1642(var14);
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(Z)V")
    private final void method3753(boolean arg0) {
        field9548++;
        if (class421.field5601 == 14) {
            return;
        }
        class678.field9539++;
        if ((class678.field9539 % 1000) == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class681.field9604 = var2.get(11) * 600 + (var2.get(12) * 10) + (var2.get(13) / 6);
            class73.field763.setSeed((long) class681.field9604);
        }
        if ((class678.field9539 % 50) == 0) {
            class670.field9343 = class240.field2974;
            class240.field2974 = 0;
            class329.field4029 = class412.field5532;
            class412.field5532 = 0;
        }
        this.method3748((byte) 4);
        if (class228.field2831 != null) {
            class228.field2831.method2861(0);
        }
        class432.method2482((byte) 112);
        if (!arg0) {
            method3762(-55);
        }
        class140.field1549.method1939(751421314);
        class108.field1166.method244(0);
        if (class701.field9813 != null) {
            class701.field9813.method948((int) class557.method3157(-73));
        }
        class245.method1444(36);
        class131.field1472 = 0;
        class557.field7953 = 0;
        for (class159 var3 = class140.field1549.method1943(-1656632478); var3 != null; var3 = class140.field1549.method1943(-1656632478)) {
            int var6 = var3.method865(4186);
            if (var6 == 2 || var6 == 3) {
                char var7 = var3.method868(10943);
                if (class61.method326(-85) && (var7 == '`' || var7 == '§' || var7 == '²')) {
                    if (class85.method443(0)) {
                        class377.method2182(60);
                    } else {
                        class271.method1591(24591);
                    }
                } else if (class557.field7953 < 128) {
                    class537.field7551[class557.field7953] = var3;
                    class557.field7953++;
                }
            } else if (var6 == 0 && class131.field1472 < 75) {
                class646.field9121[class131.field1472] = var3;
                class131.field1472++;
            }
        }
        class289.field3612 = 0;
        for (class103 var4 = class108.field1166.method249(72); var4 != null; var4 = class108.field1166.method249(106)) {
            int var5 = var4.method192(-58);
            if (var5 == -1) {
                class595.field8388.method3425(var4, false);
            } else if (var5 == 6) {
                class289.field3612 += var4.method196((byte) 49);
            } else if (class470.method2713(34, var5)) {
                class156.field1744.method3425(var4, false);
                if (class156.field1744.method3429((byte) -88) > 10) {
                    class156.field1744.method3440((byte) 109);
                }
            }
        }
        if (class85.method443(0)) {
            class362.method2123(false);
        }
        if (class487.method2807(-1, class421.field5601)) {
            class533.method2991((byte) -125);
            class93.method471((byte) -36);
        } else if (class152.method826((byte) 117, class421.field5601)) {
            class599.method3355(7813);
        }
        if (class441.method2549(-96, class421.field5601) && !class152.method826((byte) 117, class421.field5601)) {
            this.method3752(-15);
            class549.method3110((byte) -94);
            class676.method3730(-3);
        } else if (class2.method12(class421.field5601, 10755) && !class152.method826((byte) 117, class421.field5601)) {
            this.method3752(-15);
            class676.method3730(-3);
        } else if (class421.field5601 == 12) {
            class676.method3730(-3);
        } else if (class578.method3271(class421.field5601, arg0) && !class152.method826((byte) 117, class421.field5601)) {
            class188.method1146((byte) 35);
        } else if (class421.field5601 == 13) {
            class676.method3730(-3);
            if (class89.field890 != -3 && class89.field890 != 2 && class89.field890 != 15) {
                class73.method394(0, false);
            }
        }
        class156.method843((byte) 60, class701.field9813);
        class156.field1744.method3440((byte) -3);
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
    public static final void method3754(int arg0) {
        int var1 = class306.field3786;
        int[] var2 = class396.field5353;
        for (int var3 = 0; var3 < class651.field9144 + var1; var3++) {
            class677 var4;
            if (var3 < var1) {
                var4 = class139.field1540[var2[var3]];
            } else {
                var4 = ((class214) class274.field3433.method3669((long) class398.field5375[var3 - var1], -1)).field2601;
            }
            if (var4.field5166 == arg0 && var4.field9508 >= 0) {
                int var5 = var4.method1414(-31789);
                if ((var5 & 0x1) == 0) {
                    if ((var4.field5179 & 0x1FF) != 0 || (var4.field5176 & 0x1FF) != 0) {
                        continue;
                    }
                } else if ((var4.field5179 & 0x1FF) != 256 || (var4.field5176 & 0x1FF) != 256) {
                    continue;
                }
                int var10002;
                if (var5 == 1) {
                    int var6 = var4.field5179 >> 9;
                    int var7 = var4.field5176 >> 9;
                    if (var4.field9508 > class80.field830[var6][var7]) {
                        class80.field830[var6][var7] = var4.field9508;
                        class333.field4180[var6][var7] = 1;
                    } else if (class80.field830[var6][var7] == var4.field9508) {
                        var10002 = class333.field4180[var6][var7]++;
                    }
                } else {
                    int var8 = (var5 - 1) * 256 + 60;
                    int var9 = var4.field5179 - var8 >> 9;
                    int var10 = var4.field5176 - var8 >> 9;
                    int var11 = var4.field5179 + var8 >> 9;
                    int var12 = var4.field5176 + var8 >> 9;
                    for (int var13 = var9; var13 <= var11; var13++) {
                        for (int var14 = var10; var14 <= var12; var14++) {
                            if (var4.field9508 > class80.field830[var13][var14]) {
                                class80.field830[var13][var14] = var4.field9508;
                                class333.field4180[var13][var14] = 1;
                            } else if (class80.field830[var13][var14] == var4.field9508) {
                                var10002 = class333.field4180[var13][var14]++;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
    public static final void method3755() {
        for (int var0 = 0; var0 < class142.field1574; var0++) {
            int[] var1 = class80.field830[var0];
            for (int var2 = 0; var2 < class140.field1550; var2++) {
                var1[var2] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
    public static void method3756(int arg0) {
        field9554 = null;
        if (arg0 != 622) {
            field9556 = null;
        }
        field9556 = null;
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
    private final void method3757(int arg0) {
        field9551++;
        if (class510.field7323.field1854 > class221.field2715) {
            class117.field1294.method1087(0);
            class114.field1204 = (class510.field7323.field1854 - 1) * 50 * 5;
            if (class114.field1204 > 3000) {
                class114.field1204 = 3000;
            }
            if (class510.field7323.field1854 >= 2 && class510.field7323.field1855 == 6) {
                this.method2561((byte) -62, "js5connect_outofdate");
                class421.field5601 = 14;
                return;
            }
            if (class510.field7323.field1854 >= 4 && class510.field7323.field1855 == -1) {
                this.method2561((byte) -98, "js5crc");
                class421.field5601 = 14;
                return;
            }
            if (class510.field7323.field1854 >= 4 && class487.method2807(-1, class421.field5601)) {
                if (class510.field7323.field1855 == 7 || class510.field7323.field1855 == 9) {
                    this.method2561((byte) -121, "js5connect_full");
                } else if (class510.field7323.field1855 <= 0) {
                    this.method2561((byte) -14, "js5io");
                } else if (class147.field1630 == null) {
                    this.method2561((byte) -76, "js5connect");
                } else {
                    this.method2561((byte) -45, "js5proxy_" + class147.field1630.trim());
                }
                class421.field5601 = 14;
                return;
            }
        }
        class221.field2715 = class510.field7323.field1854;
        if (class114.field1204 > 0) {
            class114.field1204--;
            return;
        }
        try {
            if (class115.field1277 == 0) {
                class494.field7165 = class117.field1294.method1089(class353.field4757, 46);
                class115.field1277++;
            }
            if (class115.field1277 == 1) {
                if (class494.field7165.field884 == 2) {
                    if (class494.field7165.field886 != null) {
                        class147.field1630 = (String) class494.field7165.field886;
                    }
                    this.method3746((byte) 42, 1000);
                    return;
                }
                if (class494.field7165.field884 == 1) {
                    class115.field1277++;
                }
            }
            if (class115.field1277 == 2) {
                class684.field9643 = new class408((Socket) class494.field7165.field886, class353.field4757);
                class115 var2 = new class115(5);
                var2.method658(class249.field3110.field1673, (byte) 88);
                var2.method660((byte) 104, 622);
                class684.field9643.method2281(5, var2.field1269, (byte) -92, 0);
                class115.field1277++;
                class568.field8083 = class557.method3157(-103);
            }
            if (class115.field1277 == 3) {
                if (class487.method2807(arg0 - 49, class421.field5601) || class684.field9643.method2284(5000) > 0) {
                    int var3 = class684.field9643.method2280(0);
                    if (var3 != 0) {
                        this.method3746((byte) 42, var3);
                        return;
                    }
                    class115.field1277++;
                } else if (class557.method3157(arg0 - 107) - class568.field8083 > 30000L) {
                    this.method3746((byte) 42, 1001);
                    return;
                }
            }
            if (class115.field1277 == 4) {
                boolean var4 = class487.method2807(-1, class421.field5601) || class441.method2549(arg0 - 99, class421.field5601) || class2.method12(class421.field5601, 10755);
                class411[] var5 = class411.method2306(false);
                class115 var6 = new class115(var5.length * 4);
                class684.field9643.method2283(0, arg0 - 49, var6.field1269, var6.field1269.length);
                for (int var7 = 0; var7 < var5.length; var7++) {
                    var5[var7].method2301(var6.method631(false), true);
                }
                class510.field7323.method898(!var4, arg0 ^ 0x33, class684.field9643);
                class494.field7165 = null;
                class684.field9643 = null;
                class115.field1277 = 0;
            }
        } catch (IOException var8) {
            this.method3746((byte) 42, 1002);
        }
        if (arg0 != 48) {
            this.method3746((byte) 118, 27);
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
    public final void method2547(int arg0) {
        if (arg0 != -1892) {
            field9556 = null;
        }
        field9543++;
        if (class430.field6109 != 2) {
            this.method3753(true);
            return;
        }
        try {
            this.method3753(true);
        } catch (ThreadDeath var4) {
            throw var4;
        } catch (Throwable var5) {
            class333.method1923(var5, true, var5.getMessage() + " (Recovered) " + this.method2560(false));
            class434.method2489(0, (byte) 44);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V")
    public final void method2545(byte arg0) {
        if (class518.field7376) {
            class689.field9702 = 64;
        }
        field9555++;
        Frame var2 = new Frame("Jagex");
        var2.pack();
        var2.dispose();
        class307.method1766(false);
        class705.field9906 = new class688(class353.field4757);
        class510.field7323 = new class165();
        class315.method1808(new int[] { 20, 260 }, arg0 + 63, new int[] { 1000, 100 });
        if (class364.field4875 != class337.field4237) {
            class324.field3984 = new byte[50][];
        }
        class639.field9075 = new class460(class353.field4757);
        if (class364.field4875 == class337.field4237) {
            class42.field414.field1987 = this.getCodeBase().getHost();
        } else if (class138.method771(13651, class337.field4237)) {
            class42.field414.field1987 = this.getCodeBase().getHost();
            class42.field414.field1999 = class42.field414.field2001 + 40000;
            class527.field7428.field1999 = class527.field7428.field2001 + 40000;
            class152.field1682.field1999 = class152.field1682.field2001 + 40000;
            class42.field414.field1996 = class42.field414.field2001 + 50000;
            class527.field7428.field1996 = class527.field7428.field2001 + 50000;
            class152.field1682.field1996 = class152.field1682.field2001 + 50000;
        } else if (class337.field4237 == class325.field4005) {
            class42.field414.field1987 = "127.0.0.1";
            class527.field7428.field1987 = "127.0.0.1";
            class42.field414.field1999 = class42.field414.field2001 + 40000;
            class152.field1682.field1987 = "127.0.0.1";
            class527.field7428.field1999 = class527.field7428.field2001 + 40000;
            class152.field1682.field1999 = class152.field1682.field2001 + 40000;
            class42.field414.field1996 = class42.field414.field2001 + 50000;
            class527.field7428.field1996 = class527.field7428.field2001 + 50000;
            class152.field1682.field1996 = class152.field1682.field2001 + 50000;
        }
        class45.field472 = class76.field782 = class673.field9363 = class125.field1416 = new short[256];
        if (class616.field8685 == class246.field3031) {
            class226.field2806 = false;
        }
        if (class312.field3886 == class246.field3031) {
            class701.field9845 = true;
            class71.field696 = 0;
            class557.field7952 = class425.field5997;
            class90.field899 = class287.field3594;
            class695.field9739 = 16777215;
        } else {
            class557.field7952 = class124.field1391;
            class90.field899 = class580.field8208;
        }
        class117.field1294 = class42.field414;
        try {
            class128.field1437 = class338.field4252.getToolkit().getSystemClipboard();
        } catch (Exception var4) {
        }
        class140.field1549 = class162.method880(class41.field407, true);
        class108.field1166 = class93.method476(63, class41.field407, true);
        if (arg0 != -62) {
            return;
        }
        try {
            if (class353.field4757.field6612 != null) {
                class36.field374 = new class680(class353.field4757.field6612, 5200, 0);
                for (int var3 = 0; var3 < 35; var3++) {
                    class363.field4862[var3] = new class680(class353.field4757.field6609[var3], 6000, 0);
                }
                class151.field1674 = new class680(class353.field4757.field6610, 6000, 0);
                class476.field6860 = new class585(255, class36.field374, class151.field1674, 500000);
                class551.field7878 = new class680(class353.field4757.field6621, 24, 0);
                class353.field4757.field6612 = null;
                class353.field4757.field6621 = null;
                class353.field4757.field6610 = null;
                class353.field4757.field6609 = null;
            }
        } catch (IOException var5) {
            class151.field1674 = null;
            class551.field7878 = null;
            class36.field374 = null;
            class476.field6860 = null;
        }
        if (class364.field4875 != class337.field4237) {
            class585.field8296 = true;
        }
        if (class616.field8685 == class246.field3031) {
            class106.field1149 = class198.field2278.method1195((byte) 62, class504.field7267);
        } else if (class312.field3886 == class246.field3031) {
            class106.field1149 = class198.field2284.method1195((byte) 62, class504.field7267);
            return;
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "()V")
    public static final void method3758() {
        int var0 = class306.field3786;
        int[] var1 = class396.field5353;
        boolean var2 = class639.field9075.field6803 == 1 && var0 > 200 || class639.field9075.field6803 == 0 && var0 > 50;
        for (int var3 = 0; var3 < var0; var3++) {
            class236 var13 = class139.field1540[var1[var3]];
            if (!var13.method1408(-125)) {
                var13.field9508 = -1;
            } else if (var13.field2930) {
                var13.field9508 = -1;
            } else {
                var13.method3413(2);
                if (var13.field8635 >= 0 && var13.field8627 >= 0 && var13.field8634 < class142.field1574 && var13.field8630 < class140.field1550) {
                    var13.field2914 = var13.field9473 ? var2 : false;
                    if (class362.field4859 == var13) {
                        var13.field9508 = Integer.MAX_VALUE;
                    } else {
                        int var14 = 0;
                        if (!var13.field9505) {
                            var14++;
                        }
                        if (var13.field9471 > class678.field9539) {
                            var14 += 2;
                        }
                        int var15 = var14 + (5 - var13.method1414(-31789) << 2);
                        if (var13.field2895) {
                            var15 += 512;
                        } else {
                            if (class705.field9904 == 0) {
                                var15 += 32;
                            } else {
                                var15 += 128;
                            }
                            var15 += 256;
                        }
                        var13.field9508 = var15 + 1;
                    }
                } else {
                    var13.field9508 = -1;
                }
            }
        }
        for (int var4 = 0; var4 < class651.field9144; var4++) {
            class600 var10 = ((class214) class274.field3433.method3669((long) class398.field5375[var4], -1)).field2601;
            if (var10.method3359(38) && var10.field8461.method1254(117, class628.field8859)) {
                var10.method3413(2);
                if (var10.field8635 >= 0 && var10.field8627 >= 0 && var10.field8634 < class142.field1574 && var10.field8630 < class140.field1550) {
                    int var11 = 0;
                    if (!var10.field9505) {
                        var11++;
                    }
                    if (var10.field9471 > class678.field9539) {
                        var11 += 2;
                    }
                    int var12 = var11 + (5 - var10.method1414(-31789) << 2);
                    if (class705.field9904 == 0) {
                        if (var10.field8461.field2500) {
                            var12 += 64;
                        } else {
                            var12 += 128;
                        }
                    } else if (class705.field9904 == 1) {
                        if (var10.field8461.field2500) {
                            var12 += 32;
                        } else {
                            var12 += 64;
                        }
                    }
                    if (var10.field8461.field2512) {
                        var12 += 1024;
                    } else if (!var10.field8461.field2498) {
                        var12 += 256;
                    }
                    var10.field9508 = var12 + 1;
                } else {
                    var10.field9508 = -1;
                }
            } else {
                var10.field9508 = -1;
            }
        }
        for (int var5 = 0; var5 < class497.field7195.length; var5++) {
            class99 var6 = class497.field7195[var5];
            if (var6 != null) {
                if (var6.field1066 == 1) {
                    class214 var7 = (class214) class274.field3433.method3669((long) var6.field1071, -1);
                    if (var7 != null) {
                        class600 var8 = var7.field2601;
                        if (var8.field9508 >= 0) {
                            var8.field9508 += 2048;
                        }
                    }
                } else if (var6.field1066 == 10) {
                    class236 var9 = class139.field1540[var6.field1071];
                    if (var9 != null && class362.field4859 != var9 && var9.field9508 >= 0) {
                        var9.field9508 += 2048;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
    public final void init() {
        field9545++;
        if (!this.method2553((byte) 115)) {
            return;
        }
        class42.field414 = new class178();
        class42.field414.field2001 = Integer.parseInt(this.getParameter("worldid"));
        class527.field7428 = new class178();
        class527.field7428.field2001 = Integer.parseInt(this.getParameter("lobbyid"));
        class527.field7428.field1987 = this.getParameter("lobbyaddress");
        class152.field1682 = new class178();
        class152.field1682.field2001 = Integer.parseInt(this.getParameter("demoid"));
        class152.field1682.field1987 = this.getParameter("demoaddress");
        class337.field4237 = class360.method2117(Integer.parseInt(this.getParameter("modewhere")), 8919);
        if (class337.field4237 == class325.field4005) {
            class337.field4237 = class193.field2235;
        } else if (!class138.method771(13651, class337.field4237) && class364.field4875 != class337.field4237) {
            class337.field4237 = class364.field4875;
        }
        class416.field5582 = class198.method1193((byte) 41, Integer.parseInt(this.getParameter("modewhat")));
        if (class416.field5582 != class223.field2771 && class416.field5582 != class314.field3907 && class416.field5582 != class381.field5159) {
            class416.field5582 = class381.field5159;
        }
        try {
            class504.field7267 = Integer.parseInt(this.getParameter("lang"));
        } catch (Exception var14) {
            class504.field7267 = 0;
        }
        String var1 = this.getParameter("objecttag");
        if (var1 != null && var1.equals("1")) {
            class546.field7791 = true;
        } else {
            class546.field7791 = false;
        }
        String var2 = this.getParameter("js");
        if (var2 != null && var2.equals("1")) {
            class381.field5161 = true;
        } else {
            class381.field5161 = false;
        }
        String var3 = this.getParameter("advert");
        if (var3 != null && var3.equals("1")) {
            class580.field8207 = true;
        } else {
            class580.field8207 = false;
        }
        String var4 = this.getParameter("game");
        if (var4 != null) {
            if (var4.equals("0")) {
                class246.field3031 = class616.field8685;
            } else if (var4.equals("1")) {
                class246.field3031 = class312.field3886;
            }
        }
        try {
            class112.field1186 = Integer.parseInt(this.getParameter("affid"));
        } catch (Exception var13) {
            class112.field1186 = 0;
        }
        class443.field6259 = this.getParameter("quiturl");
        class208.field2464 = this.getParameter("settings");
        if (class208.field2464 == null) {
            class208.field2464 = "";
        }
        String var5 = this.getParameter("country");
        if (var5 != null) {
            try {
                class671.field9348 = Integer.parseInt(var5);
            } catch (Exception var12) {
                class671.field9348 = 0;
            }
        }
        class249.field3090 = Integer.parseInt(this.getParameter("colourid"));
        if (class249.field3090 < 0 || class249.field3090 >= class312.field3853.length) {
            class249.field3090 = 0;
        }
        if (Integer.parseInt(this.getParameter("sitesettings_member")) == 1) {
            class599.field8432 = true;
            class599.field8435 = true;
        }
        String var6 = this.getParameter("frombilling");
        if (var6 != null && var6.equals("true")) {
            class35.field350 = true;
        }
        class463.field6589 = this.getParameter("sskey");
        if (class463.field6589 != null && class463.field6589.length() < 2) {
            class463.field6589 = null;
        }
        String var7 = this.getParameter("force64mb");
        if (var7 != null && var7.equals("true")) {
            class518.field7376 = true;
        }
        String var8 = this.getParameter("worldflags");
        if (var8 != null) {
            try {
                class16.field135 = Integer.parseInt(var8);
            } catch (Exception var11) {
            }
        }
        String var9 = this.getParameter("userFlow");
        if (var9 != null) {
            try {
                class658.field9243 = Long.parseLong(var9);
            } catch (NumberFormatException var10) {
            }
        }
        class359.field4829 = this.getParameter("additionalInfo");
        if (class359.field4829 != null && class359.field4829.length() > 50) {
            class359.field4829 = null;
        }
        class338.field4252 = this;
        if (class616.field8685 == class246.field3031) {
            class87.field873 = 503;
            class267.field3329 = 765;
        } else if (class312.field3886 == class246.field3031) {
            class267.field3329 = 640;
            class87.field873 = 480;
        }
        this.method2556(class87.field873, class267.field3329, -29341, class246.field3031.field3940, 622, class416.field5582.method1534(true) + 32, 35);
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "()V")
    public static final void method3759() {
        class436.field6159 = 0;
        for (int var0 = 0; var0 < class651.field9144; var0++) {
            class600 var1 = ((class214) class274.field3433.method3669((long) class398.field5375[var0], -1)).field2601;
            if (var1.field9505 && var1.method1419(-88) != -1) {
                int var2 = (var1.method1414(-31789) - 1) * 256 + 252;
                int var3 = var1.field5179 - var2 >> 9;
                int var4 = var1.field5176 - var2 >> 9;
                class677 var5 = class171.method934(var3, var1.field5166, (byte) 122, var4);
                if (var5 != null) {
                    int var6 = var5.field9434;
                    if (var5 instanceof class600) {
                        var6 += 2048;
                    }
                    if (var5.field9418 == 0 && var5.method1419(76) != -1) {
                        class346.field4648[class436.field6159] = var6;
                        class137.field1502[class436.field6159] = var6;
                        class436.field6159++;
                        var5.field9418++;
                    }
                    class346.field4648[class436.field6159] = var6;
                    class137.field1502[class436.field6159] = var1.field9434 + 2048;
                    class436.field6159++;
                    var5.field9418++;
                }
            }
        }
        class487.method2810(0, class137.field1502, class346.field4648, class436.field6159 - 1, -14899);
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Lwp;)Lwp;")
    public static final class452 method3760(class452 arg0) {
        int var1 = method3750(arg0).method1807(true);
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class92.method464(arg0.field6467, -167823504);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
    public final synchronized void method2551(boolean arg0) {
        field9550++;
        if (class591.field8347 != null && class41.field407 == null && !class353.field4757.field6611) {
            try {
                Class var2 = class591.field8347.getClass();
                Field var3 = var2.getDeclaredField("canvas");
                class41.field407 = (Canvas) var3.get(class591.field8347);
                var3.set(class591.field8347, null);
                if (class41.field407 != null) {
                    return;
                }
            } catch (Exception var4) {
            }
        }
        super.method2551(arg0);
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "()V")
    public static final void method3761() {
        int var0 = class306.field3786;
        int[] var1 = class396.field5353;
        int var2 = class375.field5098 ? var0 : class651.field9144 + var0;
        for (int var3 = 0; var3 < var2; var3++) {
            class677 var4;
            if (var3 < var0) {
                var4 = class139.field1540[var1[var3]];
            } else {
                var4 = ((class214) class274.field3433.method3669((long) class398.field5375[var3 - var0], -1)).field2601;
            }
            if (var4.field9508 >= 0) {
                int var5 = var4.method1414(-31789);
                if ((var5 & 0x1) == 0) {
                    if ((var4.field5179 & 0x1FF) == 0 && (var4.field5176 & 0x1FF) == 0) {
                        continue;
                    }
                } else if ((var4.field5179 & 0x1FF) == 256 && (var4.field5176 & 0x1FF) == 256) {
                    continue;
                }
                var4.field5178 = class593.method3335(var4.field5176, var4.field5166, 27648, var4.field5179);
                class631.method3538(var4, true);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)Ljava/lang/String;")
    public final String method2560(boolean arg0) {
        field9542++;
        if (arg0) {
            return null;
        }
        String var2 = null;
        try {
            var2 = "[1)" + class26.field245 + "," + class231.field2860 + "," + class142.field1574 + "," + class140.field1550 + "|";
            if (class362.field4859 != null) {
                var2 = var2 + "2)" + class169.field1888 + "," + (class362.field4859.field9517[0] + class26.field245) + "," + (class362.field4859.field9513[0] + class231.field2860) + "|";
            }
            var2 = var2 + "3)" + class430.field6109 + "|4)" + class639.field9075.field6769 + "|5)" + class201.method1206(56) + "|6)" + class146.field1618 + "," + class338.field4244 + "|";
            var2 = var2 + "7)" + class639.field9075.method2718(class430.field6109, (byte) 76) + "|";
            var2 = var2 + "8)" + class639.field9075.method2720((byte) -121, class430.field6109) + "|";
            var2 = var2 + "9)" + class639.field9075.field6794 + "|";
            var2 = var2 + "10)" + class639.field9075.field6770 + "|";
            var2 = var2 + "11)" + class639.field9075.field6771 + "|";
            var2 = var2 + "12)" + class639.field9075.method2641(class430.field6109, (byte) 34) + "|";
            var2 = var2 + "13)" + class689.field9702 + "|";
            var2 = var2 + "14)" + class421.field5601;
            try {
                var2 = var2 + "|15)" + jagmisc.getTotalPhysicalMemory();
            } catch (Throwable var15) {
            }
            try {
                if (class430.field6109 == 2) {
                    Class var3 = Class.forName("java.lang.ClassLoader");
                    Field var4 = var3.getDeclaredField("nativeLibraries");
                    Class var5 = Class.forName("java.lang.reflect.AccessibleObject");
                    Method var6 = var5.getDeclaredMethod("setAccessible", Boolean.TYPE);
                    var6.invoke(var4, Boolean.TRUE);
                    Vector var7 = (Vector) var4.get((field9558 == null ? (field9558 = method3763("client")) : field9558).getClassLoader());
                    for (int var8 = 0; var8 < var7.size(); var8++) {
                        try {
                            Object var9 = var7.elementAt(var8);
                            Field var10 = var9.getClass().getDeclaredField("name");
                            var6.invoke(var10, Boolean.TRUE);
                            try {
                                String var11 = (String) var10.get(var9);
                                if (var11 != null && var11.indexOf("sw3d.dll") != -1) {
                                    Field var12 = var9.getClass().getDeclaredField("handle");
                                    var6.invoke(var12, Boolean.TRUE);
                                    var2 = var2 + "|16)" + Long.toHexString(var12.getLong(var9));
                                    var6.invoke(var12, Boolean.FALSE);
                                }
                            } catch (Throwable var13) {
                            }
                            var6.invoke(var10, Boolean.FALSE);
                        } catch (Throwable var14) {
                        }
                    }
                }
            } catch (Throwable var16) {
            }
            var2 = var2 + "]";
        } catch (Throwable var17) {
        }
        return var2;
    }

    @OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
    public static final void method3762(int arg0) {
        int var1 = class306.field3786;
        int[] var2 = class396.field5353;
        int var3 = class375.field5098 ? var1 : class651.field9144 + var1;
        for (int var4 = 0; var4 < var3; var4++) {
            class677 var5;
            if (var4 < var1) {
                var5 = class139.field1540[var2[var4]];
            } else {
                var5 = ((class214) class274.field3433.method3669((long) class398.field5375[var4 - var1], -1)).field2601;
            }
            if (var5.field5166 == arg0) {
                var5.field9418 = 0;
                if (var5.field9508 < 0) {
                    var5.field9505 = false;
                } else {
                    int var6 = var5.method1414(-31789);
                    if ((var6 & 0x1) == 0) {
                        if ((var5.field5179 & 0x1FF) != 0 || (var5.field5176 & 0x1FF) != 0) {
                            var5.field9505 = false;
                            continue;
                        }
                    } else if ((var5.field5179 & 0x1FF) != 256 || (var5.field5176 & 0x1FF) != 256) {
                        var5.field9505 = false;
                        continue;
                    }
                    int var10002;
                    if (var6 == 1) {
                        int var7 = var5.field5179 >> 9;
                        int var8 = var5.field5176 >> 9;
                        if (class80.field830[var7][var8] != var5.field9508) {
                            var5.field9505 = true;
                            continue;
                        }
                        if (class333.field4180[var7][var8] > 1) {
                            var10002 = class333.field4180[var7][var8]--;
                            var5.field9505 = true;
                            continue;
                        }
                    } else {
                        int var9 = (var6 - 1) * 256 + 252;
                        int var10 = var5.field5179 - var9 >> 9;
                        int var11 = var5.field5176 - var9 >> 9;
                        int var12 = var5.field5179 + var9 >> 9;
                        int var13 = var5.field5176 + var9 >> 9;
                        if (!class148.method812(var13, var10, var11, -31957, var12, var5.field9508)) {
                            for (int var14 = var10; var14 <= var12; var14++) {
                                for (int var15 = var11; var15 <= var13; var15++) {
                                    if (class80.field830[var14][var15] == var5.field9508) {
                                        var10002 = class333.field4180[var14][var15]--;
                                    }
                                }
                            }
                            var5.field9505 = true;
                            continue;
                        }
                    }
                    var5.field9505 = false;
                    var5.field5178 = class593.method3335(var5.field5176, var5.field5166, 27648, var5.field5179);
                    class631.method3538(var5, true);
                }
            }
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method3763(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
