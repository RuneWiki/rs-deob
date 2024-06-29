import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public abstract class class159 {

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "Liu;")
    public static class517 field2375 = new class517(79, 12);

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "I")
    public static int field2376;

    @OriginalMember(owner = "client!ee", name = "d", descriptor = "Lqa;")
    public static class167 field2378;

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "Llaa;")
    public static class577 field2377;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(I)V", line = 4)
    public static void method1124(int arg0) {
        field2378 = null;
        field2377 = null;
        if (arg0 != -11) {
            field2375 = null;
        }
        field2375 = null;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IZIII)V", line = 20)
    public static final void method1125(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        field2376++;
        if (!arg1 && class559.field7931 == arg4 && class533.field7443 == arg2 && class545.field7583 == class466.field6714 || class202.field2854.method2628((byte) 68, class646.field9388)) {
            return;
        }
        class533.field7443 = arg2;
        class559.field7931 = arg4;
        class466.field6714 = class545.field7583;
        if (class202.field2854.method2628((byte) 68, class646.field9388)) {
            class466.field6714 = 0;
        }
        class307.method1904(true, arg0);
        class247.method1570(class130.field2119.method3220(false, class538.field7500), class409.field6077, true, 15900);
        int var5 = class382.field5687;
        class382.field5687 = (class559.field7931 - (class146.field2247 >> 4)) * 8;
        int var6 = class597.field8500;
        class597.field8500 = (class533.field7443 - (class66.field990 >> 4)) * 8;
        class133.field2155 = class212.method1408(class559.field7931 * 8, class533.field7443 * 8);
        class254.field3704 = null;
        int var7 = class382.field5687 - var5;
        int var8 = class597.field8500 - var6;
        if (arg0 == 10) {
            for (int var17 = 0; var17 < class313.field4570; var17++) {
                class181 var30 = class629.field8848[var17];
                if (var30 != null) {
                    class170 var31 = var30.field2623;
                    for (int var32 = 0; var32 < 10; var32++) {
                        var31.field1571[var32] -= var7;
                        var31.field1572[var32] -= var8;
                    }
                    var31.field5108 -= var7 * 128;
                    var31.field5109 -= var8 * 128;
                }
            }
        } else {
            boolean var9 = false;
            class128.field2098 = 0;
            int var10 = class146.field2247 * 128 - 128;
            int var11 = (class66.field990 - 1) * 128;
            for (int var12 = 0; var12 < class313.field4570; var12++) {
                class181 var13 = class629.field8848[var12];
                if (var13 != null) {
                    class170 var14 = var13.field2623;
                    var14.field5108 -= var7 * 128;
                    var14.field5109 -= var8 * 128;
                    if (var14.field5108 >= 0 && var10 >= var14.field5108 && var14.field5109 >= 0 && var14.field5109 <= var11) {
                        boolean var15 = true;
                        for (int var16 = 0; var16 < 10; var16++) {
                            var14.field1571[var16] -= var7;
                            var14.field1572[var16] -= var8;
                            if (var14.field1571[var16] < 0 || class146.field2247 <= var14.field1571[var16] || var14.field1572[var16] < 0 || var14.field1572[var16] >= class66.field990) {
                                var15 = false;
                            }
                        }
                        if (var15) {
                            class591.field8401[class128.field2098++] = var14.field1555;
                        } else {
                            var14.method1177(null, (byte) 118);
                            var9 = true;
                            var13.method911(-52);
                        }
                    } else {
                        var14.method1177(null, (byte) 118);
                        var13.method911(-52);
                        var9 = true;
                    }
                }
            }
            if (var9) {
                class313.field4570 = class432.field6368.method742(57);
                class432.field6368.method744(class629.field8848, (byte) -123);
            }
        }
        for (int var18 = 0; var18 < 2048; var18++) {
            class400 var28 = class39.field536[var18];
            if (var28 != null) {
                for (int var29 = 0; var29 < 10; var29++) {
                    var28.field1571[var29] -= var7;
                    var28.field1572[var29] -= var8;
                }
                var28.field5109 -= var8 * 128;
                var28.field5108 -= var7 * 128;
            }
        }
        if (arg3 < 108) {
            field2375 = null;
        }
        class371[] var19 = class451.field6552;
        for (int var20 = 0; var20 < var19.length; var20++) {
            class371 var27 = var19[var20];
            if (var27 != null) {
                var27.field5356 -= var8 * 128;
                var27.field5364 -= var7 * 128;
            }
        }
        for (class127 var21 = (class127) class207.field2932.method427(true); var21 != null; var21 = (class127) class207.field2932.method420(false)) {
            var21.field2073 -= var8;
            var21.field2074 -= var7;
            if (class234.field3439 != 4 && (var21.field2074 < 0 || var21.field2073 < 0 || var21.field2074 >= class146.field2247 || class66.field990 <= var21.field2073)) {
                var21.method911(-52);
            }
        }
        if (class234.field3439 != 4) {
            for (class51 var22 = (class51) class573.field8163.method734(0); var22 != null; var22 = (class51) class573.field8163.method736(-1)) {
                int var23 = (int) (var22.field1798 & 0x3FFFL);
                int var24 = var23 - class382.field5687;
                int var25 = (int) (var22.field1798 >> 14 & 0x3FFFL);
                int var26 = var25 - class597.field8500;
                if (var24 < 0 || var26 < 0 || var24 >= class146.field2247 || var26 >= class66.field990) {
                    var22.method911(-52);
                }
            }
        }
        if (class476.field6810 != 0) {
            class476.field6810 -= var7;
            class439.field6391 -= var8;
        }
        class293.method1844((byte) -99);
        if (arg0 != 10) {
            class322.field4665 -= var8;
            class545.field7584 -= var7 * 128;
            class127.field2089 -= var7;
            class424.field6204 -= var8;
            class168.field2453 -= var7;
            class216.field3274 -= var8 * 128;
            if (Math.abs(var7) > class146.field2247 || Math.abs(var8) > class66.field990) {
                class150.method1077(123);
            }
        } else if (class377.field5547 == 4) {
            class56.field807 -= var8 * 128;
            class372.field5377 -= var8 * 128;
            class69.field1304 -= var7 * 128;
            class8.field81 -= var7 * 128;
        } else {
            class377.field5547 = 1;
        }
        class577.method3299(-6551);
        class429.method2555((byte) -57);
        class341.field4897.method425(-110);
        class25.field352.method425(-91);
        class519.field7205.method951(-8790);
        class494.method2817((byte) 32);
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(II)I")
    public abstract int method1123(int arg0, int arg1);

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Z)Ltn;")
    public abstract class523 method1126(boolean arg0);

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "(II)[B")
    public abstract byte[] method1127(int arg0, int arg1);

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "(II)V")
    public abstract void method1128(int arg0, int arg1);
}
