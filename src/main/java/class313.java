import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mu")
public class class313 extends class423 {

    @OriginalMember(owner = "client!mu", name = "r", descriptor = "I")
    public static int field4422;

    @OriginalMember(owner = "client!mu", name = "s", descriptor = "I")
    public static int field4423;

    @OriginalMember(owner = "client!mu", name = "t", descriptor = "I")
    public static int field4424;

    @OriginalMember(owner = "client!mu", name = "u", descriptor = "I")
    public static int field4425;

    @OriginalMember(owner = "client!mu", name = "v", descriptor = "I")
    public static int field4426;

    @OriginalMember(owner = "client!mu", name = "w", descriptor = "I")
    public static int field4427;

    @OriginalMember(owner = "client!mu", name = "x", descriptor = "I")
    public static int field4428;

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(ZIII)V", line = 3)
    public final void method784(boolean arg0, int arg1, int arg2, int arg3) {
        ++field4425;
        int var5 = this.method2490(false) * super.field5885.field9960 / 10000;
        class686.field9702.method436(arg3, arg1 + 2, var5, super.field5885.field9968 + -2, ((class579) super.field5885).field8340, 0);
        if (arg2 > 12) {
            class686.field9702.method436(arg3 - -var5, arg1 + 2, -var5 + super.field5885.field9960, super.field5885.field9968 + -2, 0, 0);
        }
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(ILha;IIII)V", line = 17)
    public static final void method1908(int arg0, class475 arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field4427;
        arg1.method488(arg4, arg3, arg4 + arg5, arg3 - -arg0);
        arg1.method2765(arg3, arg0, 105, -16777216, arg4, arg5);
        if (class466.field6347 >= 100) {
            float var6 = (float) class751.field10452 / (float) class751.field10441;
            int var7 = arg5;
            int var8 = arg0;
            if (var6 < 1.0F) {
                var8 = (int) ((float) arg5 * var6);
            } else {
                var7 = (int) ((float) arg0 / var6);
            }
            int var9 = (-var8 + arg0) / 2 + arg3;
            int var10 = (-var7 + arg5) / 2 + arg4;
            if (class291.field4252 == null || class291.field4252.method16() != arg5 || class291.field4252.method5() != arg0) {
                class751.method4137(class751.field10445, class751.field10452 + class751.field10446, class751.field10445 + class751.field10441, class751.field10446, var10, var9, var10 - -var7, var9 - -var8);
                class751.method4139(arg1);
                class291.field4252 = arg1.method503(var10, var9, var7, var8, false);
            }
            class291.field4252.method759(var10, var9);
            int var11 = class433.field6048 * var7 / class751.field10441;
            int var12 = class326.field4634 * var8 / class751.field10452;
            int var13 = class312.field4419 * var7 / class751.field10441 + var10;
            int var14 = -(class380.field5329 * var8 / class751.field10452) + var8 + var9 + -var12;
            int var15 = -1996554240;
            if (class429.field5944 == class113.field1647) {
                var15 = -1996488705;
            }
            arg1.method436(var13, var14, var11, var12, var15, 1);
            arg1.method447(var13, var14, var11, var12, var15, 0);
            if (arg2 > ~class33.field410) {
                int var16;
                if (class482.field6622 <= 50) {
                    var16 = class482.field6622 * 5;
                } else {
                    var16 = (-class482.field6622 + 100) * 5;
                }
                for (class770 var17 = (class770) class751.field10432.method3731((byte) -123); var17 != null; var17 = (class770) class751.field10432.method3729((byte) 29)) {
                    class548 var18 = class751.field10415.method4105(var17.field10634, -112);
                    if (class329.method2001(var18, arg2 + 7)) {
                        if (~class752.field10460 != ~var17.field10634) {
                            if (class727.field10134 != -1 && ~class727.field10134 == ~var18.field7580) {
                                int var19 = var17.field10629 * var7 / class751.field10441 + var10;
                                int var20 = var9 - -((-var17.field10626 + class751.field10452) * var8 / class751.field10452);
                                arg1.method2765(var20 + -2, 4, 110, 16776960 | var16 << 24, var19 + -2, 4);
                            }
                        } else {
                            int var21 = var10 - -(var17.field10629 * var7 / class751.field10441);
                            int var22 = (-var17.field10626 + class751.field10452) * var8 / class751.field10452 + var9;
                            arg1.method2765(var22 + -2, 4, 90, 16776960 | var16 << 24, var21 + -2, 4);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(III)I", line = 109)
    public static final int method1909(int arg0, int arg1, int arg2) {
        if (arg0 != -32418) {
            method1910((byte) 125);
        }
        ++field4428;
        int var3 = arg2 * 57 + arg1;
        int var4 = var3 << 13 ^ var3;
        int var5 = (var4 * 15731 * var4 + 789221) * var4 + 1376312589 & Integer.MAX_VALUE;
        return 255 & var5 >> 19;
    }

    @OriginalMember(owner = "client!mu", name = "<init>", descriptor = "(Lgga;Lgga;Lwb;)V", line = 130)
    public class313(class513 arg0, class513 arg1, class579 arg2) {
        super(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(ZIIB)V", line = 134)
    public final void method786(boolean arg0, int arg1, int arg2, byte arg3) {
        if (arg3 != 33) {
            field4422 = 123;
        }
        class686.field9702.method447(arg2 + -2, arg1, super.field5885.field9960 + 4, super.field5885.field9968 + 2, ((class579) super.field5885).field8345, 0);
        ++field4424;
        class686.field9702.method447(arg2 - 1, arg1 + 1, super.field5885.field9960 + 2, super.field5885.field9968, 0, 0);
    }

    @OriginalMember(owner = "client!mu", name = "b", descriptor = "(B)V", line = 148)
    public static final void method1910(byte arg0) {
        ++field4423;
        int var1 = 77 / ((-24 - arg0) / 57);
        for (class554 var2 = (class554) class521.field7310.method3731((byte) -103); var2 != null; var2 = (class554) class521.field7310.method3729((byte) 68)) {
            if (class729.method4050(116, var2.field7682)) {
                class80.method712(var2, 0);
            }
        }
    }

    @OriginalMember(owner = "client!mu", name = "c", descriptor = "(B)V", line = 169)
    public static final void method1911(byte arg0) {
        ++field4426;
        if (class323.field4590 != null) {
            class323.field4590.method2779((byte) -117);
            class323.field4590 = null;
            class352.field5013 = null;
        }
        int var1 = 4 % ((arg0 - 9) / 44);
    }
}
