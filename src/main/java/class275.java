import java.awt.Canvas;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public class class275 {

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "I")
    private int field3448;

    @OriginalMember(owner = "client!kg", name = "h", descriptor = "I")
    public int field3455;

    @OriginalMember(owner = "client!kg", name = "f", descriptor = "[J")
    public static long[] field3453 = new long[32];

    @OriginalMember(owner = "client!kg", name = "g", descriptor = "Lbia;")
    public static class501 field3454 = new class501(0);

    @OriginalMember(owner = "client!kg", name = "l", descriptor = "[F")
    public static float[] field3459 = new float[4];

    @OriginalMember(owner = "client!kg", name = "k", descriptor = "[I")
    public static int[] field3458 = new int[2048];

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "I")
    public static int field3449;

    @OriginalMember(owner = "client!kg", name = "c", descriptor = "I")
    public static int field3450;

    @OriginalMember(owner = "client!kg", name = "d", descriptor = "I")
    public static int field3451;

    @OriginalMember(owner = "client!kg", name = "e", descriptor = "I")
    public static int field3452;

    @OriginalMember(owner = "client!kg", name = "i", descriptor = "I")
    public static int field3456;

    @OriginalMember(owner = "client!kg", name = "j", descriptor = "I")
    public static int field3457;

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(B)V", line = 3)
    public static void method1625(byte arg0) {
        if (arg0 != 65) {
            field3459 = null;
        }
        field3454 = null;
        field3458 = null;
        field3453 = null;
        field3459 = null;
    }

    @OriginalMember(owner = "client!kg", name = "toString", descriptor = "()Ljava/lang/String;", line = 16)
    public final String toString() {
        field3457++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(I)I", line = 24)
    public final int method1626(int arg0) {
        field3451++;
        return arg0 == -1 ? this.field3448 : 109;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(ZLha;II)V", line = 35)
    public static final void method1627(boolean arg0, class60 arg1, int arg2, int arg3) {
        field3449++;
        if (arg2 < 0 || arg3 < 0 || class5.field52 == 0 || class658.field9167 == 0) {
            return;
        }
        int var4;
        int var5;
        int var6;
        int var7;
        class631 var8;
        int var9;
        int var10;
        if (class676.field9448) {
            class16.method119(false, 16384);
            var8 = arg1.method480();
            int[] var11 = arg1.method509();
            var4 = var11[2];
            var5 = var11[0];
            var7 = var11[1];
            var6 = var11[3];
            var10 = arg2 + class82.method688(false, (byte) 127);
            var9 = arg3 + class657.method3703(118, false);
        } else {
            arg1.method437(class214.field2822, class38.field589, class5.field52, class658.field9167);
            var4 = class5.field52;
            var5 = class214.field2822;
            var6 = class658.field9167;
            var7 = class38.field589;
            arg1.method534(class185.field2559, class82.field1124, class5.field52, class658.field9167);
            var8 = arg1.method502();
            var8.method592(class510.field7190, class165.field2300, class683.field9521, class689.field9592, class639.field8842, class155.field2117);
            arg1.method505(var8);
            var9 = arg3;
            var10 = arg2;
        }
        if (var4 == 0) {
            var4 = 1;
        }
        if (var6 == 0) {
            var6 = 1;
        }
        class297.method1781(true, -127);
        if (class707.field9826 != null && (!class8.field103 || (class565.field7935 & 0x40) != 0)) {
            int var12 = -1;
            int var13 = -1;
            int var14 = arg1.method451();
            int var15 = arg1.method546();
            int var16;
            int var17;
            int var18;
            int var19;
            if (class232.field3053) {
                var17 = var16 = (var10 - var5) * class286.field3600 / var4;
                var19 = var18 = (var9 - var7) * class286.field3600 / var6;
            } else {
                var17 = (var10 - var5) * var14 / var4;
                var18 = (var9 - var7) * var15 / var6;
                var19 = (var9 - var7) * var14 / var6;
                var16 = (var10 - var5) * var15 / var4;
            }
            int[] var20 = new int[] { var17, var19, var14 };
            var8.method597(var20);
            int[] var21 = new int[] { var16, var18, var15 };
            var8.method597(var21);
            float var22 = class751.method4181((float) var20[1], (float) var21[1], (float) var21[2], (float) var21[0], (float) var20[2], 4, 55, (float) var20[0]);
            if (var22 > 0.0F) {
                int var23 = var21[0] - var20[0];
                int var24 = var21[2] - var20[2];
                int var25 = (int) ((float) var23 * var22 + (float) var20[0]);
                int var26 = (int) ((float) var24 * var22 + (float) var20[2]);
                var12 = var25 + (class380.field4847.method82((byte) 49) - 1 << 8) >> 9;
                var13 = var26 + (class380.field4847.method82((byte) 49) - 1 << 8) >> 9;
                byte var27 = class380.field4847.field5796;
                if (var27 < 3 && (class305.field4001[1][var25 >> 9][var26 >> 9] & 0x2) != 0) {
                    int var87 = var27 + 1;
                }
            }
            if (var12 != -1 && var13 != -1) {
                if (class8.field103 && (class565.field7935 & 0x40) != 0) {
                    class288 var28 = class466.method2658(class100.field1388, class27.field489, 30639);
                    if (var28 == null) {
                        class522.method3033(110);
                    } else {
                        class92.method740(0L, (long) (var13 | var12 << 0), false, true, " ->", -1, class702.field9767, 45, var13, class551.field7704, true, var12, false);
                    }
                } else {
                    if (class348.field4496) {
                        class92.method740(0L, (long) (var12 << 0 | var13), false, true, "", -1, -1, 44, var13, class454.field6030.method2547(-70, class243.field3143), true, var12, false);
                    }
                    class92.method740(0L, (long) (var13 | var12 << 0), false, true, "", -1, class593.field8290, 13, var13, class193.field2639, true, var12, false);
                    class669.field9387++;
                }
            }
        }
        if (class676.field9448) {
            class357.method2071(256);
        }
        for (int var29 = 0; var29 < (class676.field9448 ? 2 : 1); var29++) {
            boolean var30 = var29 == 0;
            class641 var31 = var30 ? class386.field4924 : class407.field5164;
            int var32 = arg2;
            int var33 = arg3;
            if (class676.field9448) {
                class16.method119(var30, 16384);
                var32 = arg2 + class82.method688(var30, (byte) 126);
                var33 = arg3 + class657.method3703(123, var30);
            }
            class23 var34 = var31.field8902;
            for (class635 var35 = (class635) var34.method162(-22305); var35 != null; var35 = (class635) var34.method158(false)) {
                if ((class650.field9028 || class380.field4847.field5796 == var35.field8757.field5796) && var35.method3558(var32, var33, -33, arg1)) {
                    boolean var36 = false;
                    boolean var37 = false;
                    int var38;
                    int var39;
                    if ((var35.field8757 instanceof class556)) {
                        var39 = ((class556) var35.field8757).field7734;
                        var38 = ((class556) var35.field8757).field7746;
                    } else {
                        var38 = var35.field8757.field5797 >> 9;
                        var39 = var35.field8757.field5801 >> 9;
                    }
                    if (var35.field8757 instanceof class724) {
                        class724 var40 = (class724) var35.field8757;
                        int var41 = var40.method82((byte) 49);
                        if ((var41 & 0x1) == 0 && (var40.field5801 & 0x1FF) == 0 && (var40.field5797 & 0x1FF) == 0 || (var41 & 0x1) == 1 && (var40.field5801 & 0x1FF) == 256 && (var40.field5797 & 0x1FF) == 256) {
                            int var42 = var40.field5801 - (var40.method82((byte) 49) - 1 << 8);
                            int var43 = var40.field5797 - (var40.method82((byte) 49) - 1 << 8);
                            for (int var44 = 0; var44 < class646.field8947; var44++) {
                                class592 var51 = (class592) class207.field2745.method1160((long) class751.field10483[var44], 121);
                                if (var51 != null) {
                                    class733 var52 = var51.field8280;
                                    if (class463.field6224 != var52.field237 && var52.field206) {
                                        int var53 = var52.field5801 - (var52.field10192.field1918 - 1 << 8);
                                        int var54 = var52.field5797 - (var52.field10192.field1918 - 1 << 8);
                                        if (var53 >= var42 && var52.field10192.field1918 <= (var40.method82((byte) 49) - (var53 - var42 >> 9)) && var43 <= var54 && var52.field10192.field1918 <= (var40.method82((byte) 49) - (var54 - var43 >> 9))) {
                                            class747.method4159(58, class380.field4847.field5796 != var35.field8757.field5796, var52);
                                            var52.field237 = class463.field6224;
                                        }
                                    }
                                }
                            }
                            int var45 = class416.field5303;
                            int[] var46 = class657.field9155;
                            for (int var47 = 0; var47 < var45; var47++) {
                                class724 var48 = class5.field49[var46[var47]];
                                if (var48 != null && class463.field6224 != var48.field237 && var40 != var48 && var48.field206) {
                                    int var49 = var48.field5801 - (var48.method82((byte) 49) - 1 << 8);
                                    int var50 = var48.field5797 - (var48.method82((byte) 49) - 1 << 8);
                                    if (var49 >= var42 && var48.method82((byte) 49) <= (var40.method82((byte) 49) - (var49 - var42 >> 9)) && var43 <= var50 && var48.method82((byte) 49) <= (var40.method82((byte) 49) - (var50 - var43 >> 9))) {
                                        class582.method3313(class380.field4847.field5796 != var35.field8757.field5796, var48, 81);
                                        var48.field237 = class463.field6224;
                                    }
                                }
                            }
                        }
                        if (class463.field6224 == var40.field237) {
                            continue;
                        }
                        class582.method3313(class380.field4847.field5796 != var35.field8757.field5796, var40, -76);
                        var40.field237 = class463.field6224;
                    }
                    if (var35.field8757 instanceof class733) {
                        class733 var55 = (class733) var35.field8757;
                        if (var55.field10192 != null) {
                            if ((var55.field10192.field1918 & 0x1) == 0 && (var55.field5801 & 0x1FF) == 0 && (var55.field5797 & 0x1FF) == 0 || (var55.field10192.field1918 & 0x1) == 1 && (var55.field5801 & 0x1FF) == 256 && (var55.field5797 & 0x1FF) == 256) {
                                int var56 = var55.field5801 - (var55.field10192.field1918 - 1 << 8);
                                int var57 = var55.field5797 - (var55.field10192.field1918 - 1 << 8);
                                for (int var58 = 0; var58 < class646.field8947; var58++) {
                                    class592 var65 = (class592) class207.field2745.method1160((long) class751.field10483[var58], 120);
                                    if (var65 != null) {
                                        class733 var66 = var65.field8280;
                                        if (class463.field6224 != var66.field237 && var55 != var66 && var66.field206) {
                                            int var67 = var66.field5801 - (var66.field10192.field1918 - 1 << 8);
                                            int var68 = var66.field5797 - (var66.field10192.field1918 - 1 << 8);
                                            if (var67 >= var56 && (var55.field10192.field1918 - (var67 - var56 >> 9)) >= var66.field10192.field1918 && var57 <= var68 && var55.field10192.field1918 - (var68 - var57 >> 9) >= var66.field10192.field1918) {
                                                class747.method4159(97, class380.field4847.field5796 != var35.field8757.field5796, var66);
                                                var66.field237 = class463.field6224;
                                            }
                                        }
                                    }
                                }
                                int var59 = class416.field5303;
                                int[] var60 = class657.field9155;
                                for (int var61 = 0; var61 < var59; var61++) {
                                    class724 var62 = class5.field49[var60[var61]];
                                    if (var62 != null && class463.field6224 != var62.field237 && var62.field206) {
                                        int var63 = var62.field5801 - (var62.method82((byte) 49) - 1 << 8);
                                        int var64 = var62.field5797 - (var62.method82((byte) 49) - 1 << 8);
                                        if (var56 <= var63 && var62.method82((byte) 49) <= (var55.field10192.field1918 - (var63 - var56 >> 9)) && var57 <= var64 && var62.method82((byte) 49) <= var55.field10192.field1918 - (var64 - var57 >> 9)) {
                                            class582.method3313(class380.field4847.field5796 != var35.field8757.field5796, var62, 123);
                                            var62.field237 = class463.field6224;
                                        }
                                    }
                                }
                            }
                            if (class463.field6224 == var55.field237) {
                                continue;
                            }
                            class747.method4159(37, class380.field4847.field5796 != var35.field8757.field5796, var55);
                            var55.field237 = class463.field6224;
                        }
                    }
                    if (var35.field8757 instanceof class356) {
                        int var69 = class332.field4232 + var39;
                        int var70 = var38 + class447.field5936;
                        class133 var71 = (class133) class342.field4322.method1160((long) (var69 | var70 << 14 | var35.field8757.field5796 << 28), 124);
                        if (var71 != null) {
                            int var72 = 0;
                            for (class182 var73 = (class182) var71.field1923.method3658(-8718); var73 != null; var73 = (class182) var71.field1923.method3670((byte) 93)) {
                                class639 var74 = class21.field381.method1583(126, var73.field2543);
                                if (class8.field103 && class380.field4847.field5796 == var35.field8757.field5796) {
                                    class242 var75 = class599.field8349 == -1 ? null : class513.field7206.method791((byte) -77, class599.field8349);
                                    if ((class565.field7935 & 0x1) != 0 && (var75 == null || var74.method3594(124, class599.field8349, var75.field3137) != var75.field3137)) {
                                        class551.field7699++;
                                        class92.method740((long) var73.field2543, (long) var72, false, true, class731.field10176 + " -> <col=ff9040>" + var74.field8881, -1, class702.field9767, 15, var38, class551.field7704, false, var39, false);
                                    }
                                }
                                if (class380.field4847.field5796 == var35.field8757.field5796) {
                                    String[] var76 = var74.field8876;
                                    for (int var77 = 4; var77 >= 0; var77--) {
                                        if (var76 != null && var76[var77] != null) {
                                            byte var78 = 0;
                                            int var79 = class75.field1065;
                                            if (var77 == 0) {
                                                var78 = 46;
                                            }
                                            if (var77 == 1) {
                                                var78 = 59;
                                            }
                                            if (var77 == 2) {
                                                var78 = 9;
                                            }
                                            if (var77 == 3) {
                                                var78 = 47;
                                            }
                                            if (var77 == 4) {
                                                var78 = 8;
                                            }
                                            if (var74.field8874 == var77) {
                                                var79 = var74.field8805;
                                            }
                                            if (var74.field8821 == var77) {
                                                var79 = var74.field8804;
                                            }
                                            class92.method740((long) var73.field2543, (long) var72, false, true, "<col=ff9040>" + var74.field8881, -1, var79, var78, var38, var76[var77], false, var39, false);
                                            class552.field7714++;
                                        }
                                    }
                                }
                                class618.field8519++;
                                class92.method740((long) var73.field2543, (long) var72, class380.field4847.field5796 != var35.field8757.field5796, true, "<col=ff9040>" + var74.field8881, -1, class38.field594, 1009, var38, class454.field6025.method2547(-127, class243.field3143), false, var39, false);
                                var72++;
                            }
                        }
                    }
                    if (var35.field8757 instanceof class457) {
                        class457 var80 = (class457) var35.field8757;
                        class543 var81 = client.field3995.method3384(var80.method745((byte) 40), arg0);
                        if (var81.field7541 != null) {
                            var81 = var81.method3111(class516.field7236, -119);
                        }
                        if (var81 != null) {
                            if (class8.field103 && class380.field4847.field5796 == var35.field8757.field5796) {
                                class242 var82 = class599.field8349 == -1 ? null : class513.field7206.method791((byte) 51, class599.field8349);
                                if ((class565.field7935 & 0x4) != 0 && (var82 == null || var81.method3123(var82.field3137, (byte) 126, class599.field8349) != var82.field3137)) {
                                    class757.field10551++;
                                    class92.method740(class425.method2443(var38, var39, (byte) 82, var80), (long) var80.hashCode(), false, true, class731.field10176 + " -> <col=00ffff>" + var81.field7506, -1, class702.field9767, 10, var38, class551.field7704, false, var39, arg0);
                                }
                            }
                            if (class380.field4847.field5796 == var35.field8757.field5796) {
                                String[] var83 = var81.field7545;
                                if (var83 != null) {
                                    for (int var84 = 4; var84 >= 0; var84--) {
                                        if (var83[var84] != null) {
                                            short var85 = 0;
                                            if (var84 == 0) {
                                                var85 = 50;
                                            }
                                            int var86 = class75.field1065;
                                            if (var84 == 1) {
                                                var85 = 16;
                                            }
                                            if (var84 == 2) {
                                                var85 = 5;
                                            }
                                            if (var84 == 3) {
                                                var85 = 18;
                                            }
                                            if (var81.field7553 == var84) {
                                                var86 = var81.field7535;
                                            }
                                            if (var84 == 4) {
                                                var85 = 1002;
                                            }
                                            if (var81.field7543 == var84) {
                                                var86 = var81.field7561;
                                            }
                                            class92.method740(class425.method2443(var38, var39, (byte) 82, var80), (long) var80.hashCode(), false, true, "<col=00ffff>" + var81.field7506, -1, var86, var85, var38, var83[var84], false, var39, false);
                                            class241.field3126++;
                                        }
                                    }
                                }
                                class92.method740((long) var81.field7586, (long) var80.hashCode(), class380.field4847.field5796 != var35.field8757.field5796, true, "<col=00ffff>" + var81.field7506, -1, class38.field594, 1003, var38, class454.field6025.method2547(-71, class243.field3143), false, var39, arg0);
                                class636.field8769++;
                            }
                        }
                    }
                }
            }
            if (class676.field9448) {
                class357.method2071(256);
            }
        }
        class297.method1781(arg0, -127);
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(Ljava/awt/Canvas;B)V", line = 575)
    public static final void method1628(Canvas arg0, byte arg1) {
        field3456++;
        Dimension var2 = arg0.getSize();
        if (arg1 >= -71) {
            field3459 = null;
        }
        class603.method3410(var2.width, 33984, var2.height);
        if (class259.field3281 == 1) {
            class565.field7943.method518(arg0, class300.field3937, class631.field8709);
        } else {
            class565.field7943.method518(arg0, class695.field9673, class640.field8891);
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(IILrl;BB)V", line = 596)
    public static final void method1629(int arg0, int arg1, class724 arg2, byte arg3, byte arg4) {
        field3452++;
        int var5 = arg2.field264[0];
        int var6 = arg2.field260[0];
        int var7 = 86 / ((66 - arg4) / 52);
        if (var5 < 0 || class409.field5183 <= var5 || var6 < 0 || class543.field7597 <= var6 || arg0 < 0 || class409.field5183 <= arg0 || arg1 < 0 || class543.field7597 <= arg1) {
            return;
        }
        int var8 = client.method1826(class164.field2280, arg1, 0, 0, class526.field7350[arg2.field5796], -87, class59.field827, true, 0, 0, -4, var5, arg2.method82((byte) 49), arg0, var6);
        if (var8 >= 1 && var8 <= 3) {
            for (int var9 = 0; var9 < var8 - 1; var9++) {
                arg2.method4037(arg3, class164.field2280[var9], 255, class59.field827[var9]);
            }
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(IILsf;I)Lpc;", line = 634)
    public static final class672 method1630(int arg0, int arg1, class526 arg2, int arg3) {
        field3450++;
        int var4 = arg0 << 10 | arg2.field7343;
        class672 var5 = (class672) class237.field3088.method3962(103, (long) var4 << 16);
        if (var5 != null) {
            return var5;
        }
        byte[] var6 = class329.field4206.method3166((byte) 125, class329.field4206.method3180((byte) -30, var4));
        if (var6 == null) {
            int var9 = arg2.field7343 | arg3 + 65536 << 10;
            class672 var10 = (class672) class237.field3088.method3962(104, (long) var9 << 16);
            if (var10 != null) {
                return var10;
            }
            int var11 = -51 / ((-arg1 - 23) / 32);
            byte[] var12 = class329.field4206.method3166((byte) 125, class329.field4206.method3180((byte) -30, var9));
            if (var12 == null) {
                int var15 = arg2.field7343 | 0x3FFFC00;
                class672 var16 = (class672) class237.field3088.method3962(86, (long) var15 << 16);
                if (var16 != null) {
                    return var16;
                }
                byte[] var17 = class329.field4206.method3166((byte) 125, class329.field4206.method3180((byte) -30, var15));
                if (var17 == null) {
                    return null;
                } else if (var17.length <= 1) {
                    return null;
                } else {
                    class672 var18;
                    try {
                        var18 = class593.method3359(var17, true);
                    } catch (Exception var22) {
                        throw new RuntimeException(var22.getMessage() + " S: " + var15);
                    }
                    var18.field9415 = arg2;
                    class237.field3088.method3966(1667, (long) var15 << 16, var18);
                    return var18;
                }
            } else if (var12.length <= 1) {
                return null;
            } else {
                class672 var13;
                try {
                    var13 = class593.method3359(var12, true);
                } catch (Exception var21) {
                    throw new RuntimeException(var21.getMessage() + " S: " + var9);
                }
                var13.field9415 = arg2;
                class237.field3088.method3966(1667, (long) var9 << 16, var13);
                return var13;
            }
        } else if (var6.length <= 1) {
            return null;
        } else {
            class672 var7;
            try {
                var7 = class593.method3359(var6, true);
            } catch (Exception var20) {
                throw new RuntimeException(var20.getMessage() + " S: " + var4);
            }
            var7.field9415 = arg2;
            class237.field3088.method3966(1667, (long) var4 << 16, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!kg", name = "<init>", descriptor = "(II)V", line = 722)
    public class275(int arg0, int arg1) {
        this.field3448 = arg0;
        this.field3455 = arg1;
    }
}
