import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sl")
public class class385 {

    @OriginalMember(owner = "client!sl", name = "d", descriptor = "[I")
    public static int[] field5632 = new int[2500];

    @OriginalMember(owner = "client!sl", name = "b", descriptor = "[I")
    public static int[] field5630 = new int[14];

    @OriginalMember(owner = "client!sl", name = "f", descriptor = "Ljava/lang/String;")
    public static String field5634 = "Ok";

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "Lte;")
    public static class357 field5629 = new class357(64);

    @OriginalMember(owner = "client!sl", name = "c", descriptor = "I")
    public static int field5631;

    @OriginalMember(owner = "client!sl", name = "e", descriptor = "I")
    public static int field5633;

    @OriginalMember(owner = "client!sl", name = "g", descriptor = "I")
    public static int field5635;

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(B)V", line = 14)
    public static void method2495(byte arg0) {
        field5634 = null;
        field5632 = null;
        field5630 = null;
        if (arg0 == -75) {
            field5629 = null;
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(Lir;I)V", line = 28)
    public static final void method2496(class185 arg0, int arg1) {
        field5631++;
        class340.field5019 = arg0.method1220("p11_full", 0);
        class409.field5942 = arg0.method1220("p12_full", 0);
        if (arg1 >= -32) {
            field5630 = null;
        }
        class387.field5668 = arg0.method1220("b12_full", 0);
        class217.field3031 = arg0.method1220("hitmarks", 0);
        class208.field2840 = arg0.method1220("hitbar_default", 0);
        class69.field1009 = arg0.method1220("timerbar_default", 0);
        class351.field5215 = arg0.method1220("headicons_pk", 0);
        class149.field1892 = arg0.method1220("headicons_prayer", 0);
        class325.field4811 = arg0.method1220("hint_headicons", 0);
        class95.field1285 = arg0.method1220("hint_mapmarkers", 0);
        class195.field2705 = arg0.method1220("mapflag", 0);
        class256.field3736 = arg0.method1220("cross", 0);
        class204.field2816 = arg0.method1220("mapdots", 0);
        class435.field6317 = arg0.method1220("scrollbar", 0);
        class240.field3370 = arg0.method1220("name_icons", 0);
        class247.field3474 = arg0.method1220("floorshadows", 0);
        class57.field863 = arg0.method1220("compass", 0);
        class73.field1033 = arg0.method1220("hint_mapedge", 0);
    }

    @OriginalMember(owner = "client!sl", name = "b", descriptor = "(B)V", line = 67)
    public static final void method2497(byte arg0) {
        field5633++;
        if (class410.field5954 != null) {
            class425 var1 = class410.field5954;
            synchronized (class410.field5954) {
                class410.field5954 = null;
            }
        }
        if (arg0 <= 66) {
            method2498(38, 65, 119, -59, 63, 33, -88, (byte) -34);
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(IIIIIIIB)V", line = 84)
    public static final void method2498(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7) {
        if (arg7 >= -3) {
            method2495((byte) -36);
        }
        field5635++;
        int var8 = 0;
        int var9 = arg2;
        int var10 = 0;
        int var11 = arg1 - arg3;
        int var12 = arg2 - arg3;
        int var13 = arg1 * arg1;
        int var14 = arg2 * arg2;
        int var15 = var11 * var11;
        int var16 = var12 * var12;
        int var17 = var14 << 1;
        int var18 = var13 << 1;
        int var19 = var16 << 1;
        int var20 = var15 << 1;
        int var21 = arg2 << 1;
        int var22 = var12 << 1;
        int var23 = (1 - var21) * var13 + var17;
        int var24 = var14 - (var21 - 1) * var18;
        int var25 = (1 - var22) * var15 + var19;
        int var26 = var16 - ((var22 - 1) * var20);
        int var27 = var13 << 2;
        int var28 = var14 << 2;
        int var29 = var15 << 2;
        int var30 = var16 << 2;
        int var31 = var17 * 3;
        int var32 = (var21 - 3) * var18;
        int var33 = var19 * 3;
        int var34 = (var22 - 3) * var20;
        int var35 = var28;
        int var36 = (arg2 - 1) * var27;
        int var37 = var30;
        int var38 = (var12 - 1) * var29;
        int[] var39 = class444.field6416[arg4];
        class351.method2317(false, arg0 - var11, var39, arg0 - arg1, arg5);
        class351.method2317(false, arg0 + var11, var39, arg0 - var11, arg6);
        class351.method2317(false, arg0 + arg1, var39, arg0 + var11, arg5);
        while (var9 > 0) {
            boolean var40 = var12 >= var9;
            if (var40) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var25 += var33;
                        var26 += var37;
                        var33 += var30;
                        var37 += var30;
                        var10++;
                    }
                }
                if (var26 < 0) {
                    var26 += var37;
                    var25 += var33;
                    var10++;
                    var37 += var30;
                    var33 += var30;
                }
                var26 += -var34;
                var25 += -var38;
                var38 -= var29;
                var34 -= var29;
            }
            if (var23 < 0) {
                while (var23 < 0) {
                    var24 += var35;
                    var23 += var31;
                    var31 += var28;
                    var35 += var28;
                    var8++;
                }
            }
            if (var24 < 0) {
                var23 += var31;
                var24 += var35;
                var31 += var28;
                var8++;
                var35 += var28;
            }
            var23 += -var36;
            var24 += -var32;
            var9--;
            var36 -= var27;
            var32 -= var27;
            int var41 = arg4 - var9;
            int var42 = arg4 + var9;
            int var43 = arg0 + var8;
            int var44 = arg0 - var8;
            if (var40) {
                int var45 = arg0 + var10;
                int var46 = arg0 - var10;
                class351.method2317(false, var46, class444.field6416[var41], var44, arg5);
                class351.method2317(false, var45, class444.field6416[var41], var46, arg6);
                class351.method2317(false, var43, class444.field6416[var41], var45, arg5);
                class351.method2317(false, var46, class444.field6416[var42], var44, arg5);
                class351.method2317(false, var45, class444.field6416[var42], var46, arg6);
                class351.method2317(false, var43, class444.field6416[var42], var45, arg5);
            } else {
                class351.method2317(false, var43, class444.field6416[var41], var44, arg5);
                class351.method2317(false, var43, class444.field6416[var42], var44, arg5);
            }
        }
    }
}
