import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public class class291 extends class212 {

    @OriginalMember(owner = "client!dh", name = "g", descriptor = "[I")
    public int[] field4384;

    @OriginalMember(owner = "client!dh", name = "i", descriptor = "[I")
    public int[] field4386;

    @OriginalMember(owner = "client!dh", name = "j", descriptor = "Z")
    public static volatile boolean field4387 = true;

    @OriginalMember(owner = "client!dh", name = "k", descriptor = "[Z")
    public static boolean[] field4388 = new boolean[100];

    @OriginalMember(owner = "client!dh", name = "f", descriptor = "I")
    public static int field4383;

    @OriginalMember(owner = "client!dh", name = "h", descriptor = "I")
    public static int field4385;

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(BLva;III)V")
    public static final void method1827(byte arg0, class457 arg1, int arg2, int arg3, int arg4) {
        field4385++;
        if (arg0 != -50) {
            return;
        }
        class308 var5 = arg1.method2636((byte) 103);
        int var6 = arg1.field6469 - arg1.field6395.field9162 & 0x3FFF;
        if (arg2 == -1) {
            if (var6 != 0 || arg1.field6439 > 25) {
                if (arg3 < 0 && var5.field4595 != -1) {
                    arg1.field6464 = var5.field4595;
                } else if (arg3 <= 0 || var5.field4563 == -1) {
                    arg1.field6464 = var5.field4597;
                } else {
                    arg1.field6464 = var5.field4563;
                }
                arg1.field6428 = false;
            } else if (!arg1.field6428 || !var5.method1894(4, arg1.field6464)) {
                arg1.field6464 = var5.method1892(false);
                arg1.field6428 = arg1.field6464 != -1;
            }
        } else if (arg1.field6391 != -1 && (var6 >= 10240 || var6 <= 2048)) {
            int var7 = class77.field1061[arg4] - arg1.field6395.field9162 & 0x3FFF;
            if (arg2 == 2 && var5.field4602 != -1) {
                if (var7 > 2048 && var7 <= 6144 && var5.field4575 != -1) {
                    arg1.field6464 = var5.field4575;
                } else if (var7 >= 10240 && var7 < 14336 && var5.field4565 != -1) {
                    arg1.field6464 = var5.field4565;
                } else if (var7 <= 6144 || var7 >= 10240 || var5.field4586 == -1) {
                    arg1.field6464 = var5.field4602;
                } else {
                    arg1.field6464 = var5.field4586;
                }
            } else if (arg2 == 0 && var5.field4583 != -1) {
                if (var7 > 2048 && var7 <= 6144 && var5.field4594 != -1) {
                    arg1.field6464 = var5.field4594;
                } else if (var7 >= 10240 && var7 < 14336 && var5.field4578 != -1) {
                    arg1.field6464 = var5.field4578;
                } else if (var7 <= 6144 || var7 >= 10240 || var5.field4564 == -1) {
                    arg1.field6464 = var5.field4583;
                } else {
                    arg1.field6464 = var5.field4564;
                }
            } else if (var7 > 2048 && var7 <= 6144 && var5.field4554 != -1) {
                arg1.field6464 = var5.field4554;
            } else if (var7 >= 10240 && var7 < 14336 && var5.field4570 != -1) {
                arg1.field6464 = var5.field4570;
            } else if (var7 <= 6144 || var7 >= 10240 || var5.field4603 == -1) {
                arg1.field6464 = var5.field4597;
            } else {
                arg1.field6464 = var5.field4603;
            }
            arg1.field6428 = false;
        } else if (var6 == 0 && arg1.field6439 <= 25) {
            if (arg2 == 2 && var5.field4602 != -1) {
                arg1.field6464 = var5.field4602;
            } else if (arg2 == 0 && var5.field4583 != -1) {
                arg1.field6464 = var5.field4583;
            } else {
                arg1.field6464 = var5.field4597;
            }
            arg1.field6428 = false;
        } else {
            arg1.field6428 = false;
            if (arg2 == 2 && var5.field4602 != -1) {
                if (arg3 < 0 && var5.field4567 != -1) {
                    arg1.field6464 = var5.field4567;
                } else if (arg3 <= 0 || var5.field4561 == -1) {
                    arg1.field6464 = var5.field4602;
                } else {
                    arg1.field6464 = var5.field4561;
                }
            } else if (arg2 == 0 && var5.field4583 != -1) {
                if (arg3 < 0 && var5.field4573 != -1) {
                    arg1.field6464 = var5.field4573;
                } else if (arg3 <= 0 || var5.field4558 == -1) {
                    arg1.field6464 = var5.field4583;
                } else {
                    arg1.field6464 = var5.field4558;
                }
            } else if (arg3 < 0 && var5.field4569 != -1) {
                arg1.field6464 = var5.field4569;
            } else if (arg3 <= 0 || var5.field4572 == -1) {
                arg1.field6464 = var5.field4597;
            } else {
                arg1.field6464 = var5.field4572;
            }
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(Z)V")
    public static void method1828(boolean arg0) {
        field4388 = null;
        if (arg0) {
            method1829(32, 116);
        }
    }

    @OriginalMember(owner = "client!dh", name = "<init>", descriptor = "(II[I[I)V")
    public class291(int arg0, int arg1, int[] arg2, int[] arg3) {
        this.field4384 = arg3;
        this.field4386 = arg2;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(II)V")
    public static final void method1829(int arg0, int arg1) {
        if (arg1 < -103) {
            field4383++;
            class679 var2 = class669.method3708(9, arg0, 1403048928);
            var2.method3749(-77);
        }
    }
}
