import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public class class161 extends class144 {

    @OriginalMember(owner = "client!bg", name = "N", descriptor = "I")
    public static int field2318 = 0;

    @OriginalMember(owner = "client!bg", name = "O", descriptor = "I")
    public static int field2319 = -1;

    @OriginalMember(owner = "client!bg", name = "P", descriptor = "I")
    public static int field2320 = 0;

    @OriginalMember(owner = "client!bg", name = "J", descriptor = "I")
    public static int field2315 = 0;

    @OriginalMember(owner = "client!bg", name = "M", descriptor = "I")
    public static int field2317;

    @OriginalMember(owner = "client!bg", name = "Q", descriptor = "I")
    public static int field2321;

    @OriginalMember(owner = "client!bg", name = "R", descriptor = "I")
    public static int field2322;

    @OriginalMember(owner = "client!bg", name = "S", descriptor = "I")
    public static int field2323;

    @OriginalMember(owner = "client!bg", name = "T", descriptor = "I")
    public static int field2324;

    @OriginalMember(owner = "client!bg", name = "U", descriptor = "I")
    public static int field2325;

    @OriginalMember(owner = "client!bg", name = "L", descriptor = "Lbc;")
    public static class282 field2316;

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "(BI)I")
    public static final int method1065(byte arg0, int arg1) {
        ++field2325;
        if (arg0 >= -65) {
            field2321 = 114;
        }
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!bg", name = "<init>", descriptor = "()V")
    public class161() {
        super(0, true);
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1066(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field2317;
        if (arg4 > -70) {
            method1065((byte) 109, -95);
        }
        if (arg7 >= class177.field2514 && ~arg6 >= ~class279.field4238 && ~arg3 <= ~class286.field4431 && arg2 <= class230.field3302) {
            class210.method1333(arg6, -1, arg7, arg5, arg3, arg0, arg2, arg1);
        } else {
            class52.method316(arg6, arg7, arg3, arg5, (byte) -77, arg1, arg2, arg0);
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(IIIIB)V")
    public static final void method1067(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        if (~class116.field1613 > -101) {
            class234.method1530(694314310);
        }
        ++field2322;
        class155.method1022(arg3, arg2, arg1 + arg3, arg0 + arg2);
        if (class116.field1613 < 100) {
            byte var5 = 20;
            int var6 = arg3 - -(arg1 / 2);
            int var7 = arg2 - -(arg0 / 2) + -18 + -var5;
            class155.method1018(arg3, arg2, arg1, arg0, 0);
            class155.method1020(var6 + -152, var7, 304, 34, 9179409);
            class155.method1020(var6 + -151, var7 + 1, 302, 32, 0);
            class155.method1018(var6 + -150, var7 + 2, class116.field1613 * 3, 30, 9179409);
            class155.method1018(class116.field1613 * 3 + var6 + -150, var7 + 2, -(class116.field1613 * 3) + 300, 30, 0);
            class248.field3614.method528(class70.field822, var6, var5 + var7, 16777215, -1);
        } else {
            class2.field31 = (int) ((float) (arg0 * 2) / class35.field414);
            class185.field2661 = (int) ((float) (arg1 * 2) / class35.field414);
            class74.field885 = class261.field3800 - (int) ((float) arg1 / class35.field414);
            if (arg4 >= -53) {
                field2318 = -20;
            }
            class150.field2187 = -((int) ((float) arg0 / class35.field414)) + class271.field3963;
            int var8 = -((int) ((float) arg0 / class35.field414)) + class271.field3963;
            int var9 = class261.field3800 - -((int) ((float) arg1 / class35.field414));
            int var10 = class261.field3800 - (int) ((float) arg1 / class35.field414);
            int var11 = (int) ((float) arg0 / class35.field414) + class271.field3963;
            class95.method570(var8, var9, arg0 + arg2, arg2, var10, arg3, var11, true, arg1 + arg3);
            class30.method180(arg2 - -arg0, var11, -30650, arg2, var10, arg3, arg1 + arg3, class263.field3809, var8, var9);
            class198.method1273(arg2, var10, var9, arg3, arg0 + arg2, arg1 + arg3, var8, -1, var11);
            if (~class259.field3767 < -1) {
                --class87.field1184;
                if (~class87.field1184 == -1) {
                    class87.field1184 = 20;
                    --class259.field3767;
                }
            }
            if (class156.field2254) {
                int var12 = arg1 + arg3 + -5;
                int var13 = arg0 + arg2 + -8;
                class204.field2904.method536("Fps:" + class266.field3833, var12, var13, 16776960, -1);
                Runtime var14 = Runtime.getRuntime();
                int var15 = (int) ((var14.totalMemory() + -var14.freeMemory()) / 1024L);
                int var17 = var13 - 15;
                int var16 = 16776960;
                if (~var15 < -65537) {
                    var16 = 16711680;
                }
                class204.field2904.method536("Mem:" + var15 + "k", var12, var17, var16, -1);
                var13 = var17 - 15;
            }
        }
    }

    @OriginalMember(owner = "client!bg", name = "g", descriptor = "(I)V")
    public static void method1068(int arg0) {
        if (arg0 <= 114) {
            field2316 = null;
        }
        field2316 = null;
    }

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "(II)[I")
    public final int[] method12(int arg0, int arg1) {
        if (arg1 != 255) {
            method1066(66, 24, -81, -18, -65, -102, 0, 92);
        }
        int[] var3 = super.field2069.method425(true, arg0);
        ++field2323;
        if (super.field2069.field820) {
            class194.method1261(var3, 0, class104.field1411, class143.field2045[arg0]);
        }
        return var3;
    }
}
