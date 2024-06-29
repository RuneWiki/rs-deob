import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public class class378 {

    @OriginalMember(owner = "client!d", name = "c", descriptor = "I")
    public int field5374;

    @OriginalMember(owner = "client!d", name = "a", descriptor = "[I")
    public int[] field5372;

    @OriginalMember(owner = "client!d", name = "b", descriptor = "[I")
    public int[] field5373;

    @OriginalMember(owner = "client!d", name = "d", descriptor = "I")
    public static int field5375;

    @OriginalMember(owner = "client!d", name = "e", descriptor = "I")
    public static int field5376;

    @OriginalMember(owner = "client!d", name = "f", descriptor = "I")
    public static int field5377;

    @OriginalMember(owner = "client!d", name = "g", descriptor = "I")
    public static int field5378;

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(BZ)Z", line = 8)
    public static final boolean method2399(byte arg0, boolean arg1) {
        int var2 = 84 / ((arg0 - 59) / 52);
        field5376++;
        boolean var3 = class73.field1235.method743();
        if (arg1 == var3) {
            return true;
        }
        if (!arg1) {
            class73.field1235.method682();
        } else if (!class73.field1235.method724()) {
            arg1 = false;
        }
        if (var3 == arg1) {
            return false;
        } else {
            class13.field220 = arg1;
            class119.method1002(0, class188.field2783);
            return true;
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(ILpe;)V", line = 43)
    public static final void method2400(int arg0, class390 arg1) {
        field5378++;
        if (arg0 != -2031984799) {
            return;
        }
        if ((arg1 instanceof class98)) {
            class98 var2 = (class98) arg1;
            if (var2.field1545 != null) {
                class106.method940(var2, -112);
            }
        } else if (arg1 instanceof class127) {
            class119.method1003(0, (class127) arg1);
        }
    }

    @OriginalMember(owner = "client!d", name = "<init>", descriptor = "(I)V", line = 72)
    public class378(int arg0) {
        this.field5374 = arg0;
        this.field5372 = new int[this.field5374];
        this.field5373 = new int[this.field5374];
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IZ)V", line = 82)
    public static final void method2401(int arg0, boolean arg1) {
        field5377++;
        if (arg0 == -31660 && class126.field2039 != arg1) {
            class126.field2039 = arg1;
            class393.method2506((byte) -102);
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IIIIIBII)V", line = 99)
    public static final void method2402(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7) {
        field5375++;
        int var8 = 0;
        int var9 = arg6;
        int var10 = 0;
        int var11 = arg4 - arg1;
        int var12 = arg6 - arg1;
        int var13 = arg4 * arg4;
        int var14 = arg6 * arg6;
        int var15 = var11 * var11;
        int var16 = var12 * var12;
        int var17 = var14 << 1;
        int var18 = var13 << 1;
        int var19 = var16 << 1;
        int var20 = var15 << 1;
        int var21 = arg6 << 1;
        int var22 = var12 << 1;
        int var23 = (1 - var21) * var13 + var17;
        int var24 = var14 - ((var21 - 1) * var18);
        int var25 = (1 - var22) * var15 + var19;
        int var26 = var16 - ((var22 - 1) * var20);
        int var27 = var13 << 2;
        int var28 = var14 << 2;
        int var29 = var15 << 2;
        int var30 = var16 << 2;
        int var31 = var17 * 3;
        int var32 = (var21 - 3) * var18;
        int var33 = -115 % ((arg5 - 21) / 50);
        int var34 = var19 * 3;
        int var35 = (var22 - 3) * var20;
        int var36 = var28;
        int var37 = (arg6 - 1) * var27;
        int var38 = var30;
        if (class308.field4507 <= arg0 && class383.field5497 >= arg0) {
            int[] var39 = class286.field4283[arg0];
            int var40 = class102.method843(arg3 - arg4, class278.field4184, class185.field2727, 0);
            int var41 = class102.method843(arg3 + arg4, class278.field4184, class185.field2727, 0);
            int var42 = class102.method843(arg3 - var11, class278.field4184, class185.field2727, 0);
            int var43 = class102.method843(arg3 + var11, class278.field4184, class185.field2727, 0);
            class47.method379(var42, (byte) 90, arg7, var39, var40);
            class47.method379(var43, (byte) 90, arg2, var39, var42);
            class47.method379(var41, (byte) 103, arg7, var39, var43);
        }
        int var44 = (var12 - 1) * var29;
        while (var9 > 0) {
            boolean var45 = var12 >= var9;
            if (var45) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var25 += var34;
                        var26 += var38;
                        var38 += var30;
                        var34 += var30;
                        var10++;
                    }
                }
                if (var26 < 0) {
                    var25 += var34;
                    var26 += var38;
                    var38 += var30;
                    var34 += var30;
                    var10++;
                }
                var26 += -var35;
                var25 += -var44;
                var44 -= var29;
                var35 -= var29;
            }
            if (var23 < 0) {
                while (var23 < 0) {
                    var23 += var31;
                    var24 += var36;
                    var8++;
                    var31 += var28;
                    var36 += var28;
                }
            }
            if (var24 < 0) {
                var24 += var36;
                var23 += var31;
                var31 += var28;
                var8++;
                var36 += var28;
            }
            var23 += -var37;
            var24 += -var32;
            var32 -= var27;
            var9--;
            var37 -= var27;
            int var46 = arg0 - var9;
            int var47 = arg0 + var9;
            if (class308.field4507 <= var47 && var46 <= class383.field5497) {
                int var48 = class102.method843(arg3 + var8, class278.field4184, class185.field2727, 0);
                int var49 = class102.method843(arg3 - var8, class278.field4184, class185.field2727, 0);
                if (var45) {
                    int var50 = class102.method843(arg3 + var10, class278.field4184, class185.field2727, 0);
                    int var51 = class102.method843(arg3 - var10, class278.field4184, class185.field2727, 0);
                    if (class308.field4507 <= var46) {
                        int[] var52 = class286.field4283[var46];
                        class47.method379(var51, (byte) 109, arg7, var52, var49);
                        class47.method379(var50, (byte) 76, arg2, var52, var51);
                        class47.method379(var48, (byte) 96, arg7, var52, var50);
                    }
                    if (var47 <= class383.field5497) {
                        int[] var53 = class286.field4283[var47];
                        class47.method379(var51, (byte) 92, arg7, var53, var49);
                        class47.method379(var50, (byte) 120, arg2, var53, var51);
                        class47.method379(var48, (byte) 125, arg7, var53, var50);
                    }
                } else {
                    if (var46 >= class308.field4507) {
                        class47.method379(var48, (byte) 127, arg7, class286.field4283[var46], var49);
                    }
                    if (var47 <= class383.field5497) {
                        class47.method379(var48, (byte) 60, arg7, class286.field4283[var47], var49);
                    }
                }
            }
        }
    }
}
