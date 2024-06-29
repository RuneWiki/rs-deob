import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class206 extends class88 {

    @OriginalMember(owner = "client!hb", name = "t", descriptor = "I")
    public int field3758;

    @OriginalMember(owner = "client!hb", name = "x", descriptor = "I")
    public int field3762;

    @OriginalMember(owner = "client!hb", name = "s", descriptor = "I")
    public static int field3757 = 0;

    @OriginalMember(owner = "client!hb", name = "u", descriptor = "Lhj;")
    public static class69 field3759 = class181.method1318("rot:", (byte) -122);

    @OriginalMember(owner = "client!hb", name = "y", descriptor = "I")
    public static int field3763 = 0;

    @OriginalMember(owner = "client!hb", name = "w", descriptor = "Lta;")
    public static class241 field3761 = new class241(64);

    @OriginalMember(owner = "client!hb", name = "A", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field3765 = new BigInteger("9431484119947534773405476242098823416177206852045075556673005859802229236458585051597844837479119770056361726819094346360070592289857694387401749674169083");

    @OriginalMember(owner = "client!hb", name = "D", descriptor = "Lhj;")
    public static class69 field3768 = class181.method1318(":", (byte) -117);

    @OriginalMember(owner = "client!hb", name = "r", descriptor = "I")
    public static int field3756;

    @OriginalMember(owner = "client!hb", name = "v", descriptor = "I")
    public static int field3760;

    @OriginalMember(owner = "client!hb", name = "B", descriptor = "I")
    public static int field3766;

    @OriginalMember(owner = "client!hb", name = "C", descriptor = "[I")
    public static int[] field3767;

    @OriginalMember(owner = "client!hb", name = "z", descriptor = "[Lqb;")
    public static class56[] field3764;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(ZIIIIIIZIIII)Z")
    public static final boolean method1498(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11) {
        field3760++;
        if (class156.field2904.method813(15963) == 2) {
            return class23.method133(arg10, arg1, arg9, arg6, arg4, arg7, arg2, arg5, arg8, arg11, arg3, 115);
        } else if (class156.field2904.method813(15963) > 2) {
            return class19.method112(arg9, arg10, 1, class156.field2904.method813(15963), arg4, arg1, arg3, arg5, arg2, arg11, arg7, arg8, arg6);
        } else if (arg0) {
            return class81.method577(arg9, arg10, arg1, arg7, arg5, arg2, arg6, arg11, -13564, arg3, arg4, arg8);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "(I)V")
    public static void method1499(int arg0) {
        field3764 = null;
        if (arg0 > -21) {
            return;
        }
        field3765 = null;
        field3761 = null;
        field3759 = null;
        field3768 = null;
        field3767 = null;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(BIIILvi;)V")
    public static final void method1500(byte arg0, int arg1, int arg2, int arg3, class186 arg4) {
        field3756++;
        if (class177.field3218 >= 400) {
            return;
        }
        if (arg4.field3375 != null) {
            arg4 = arg4.method1358((byte) -36);
        }
        if (arg4 == null || !arg4.field3410) {
            return;
        }
        int var5 = 82 % ((arg0 - 83) / 38);
        class69 var6 = arg4.field3373;
        if (arg4.field3376 != 0) {
            var6 = class9.method42(-115, new class69[] { var6, class223.method1583(class156.field2904.field2076, -24055, arg4.field3376), class229.field4198, class182.field3316, class98.method727(-229, arg4.field3376), class82.field1571 });
        }
        if (class144.field2680 == 1) {
            class61.field1115++;
            class69.method492(123, arg3, (long) arg2, class9.method42(-119, new class69[] { class223.field4072, class27.field394, var6 }), class228.field4165, arg1, (short) 3);
        } else if (!class65.field1254) {
            class140.field2613++;
            class69[] var7 = arg4.field3394;
            if (class147.field2735) {
                var7 = class170.method1248(var7, (byte) 77);
            }
            if (var7 != null) {
                for (int var8 = 4; var8 >= 0; var8--) {
                    if (var7[var8] != null && (class47.field688 != 0 || !var7[var8].method446(class140.field2621, 32))) {
                        class210.field3826++;
                        byte var9 = 0;
                        if (var8 == 0) {
                            var9 = 20;
                        }
                        if (var8 == 1) {
                            var9 = 28;
                        }
                        if (var8 == 2) {
                            var9 = 14;
                        }
                        if (var8 == 3) {
                            var9 = 11;
                        }
                        if (var8 == 4) {
                            var9 = 41;
                        }
                        class69.method492(106, arg3, (long) arg2, class9.method42(92, new class69[] { class98.field1857, var6 }), var7[var8], arg1, var9);
                    }
                }
            }
            if (class47.field688 == 0 && var7 != null) {
                for (int var10 = 4; var10 >= 0; var10--) {
                    if (var7[var10] != null && var7[var10].method446(class140.field2621, 28)) {
                        class138.field2590++;
                        short var11 = 0;
                        if (arg4.field3376 > class156.field2904.field2076) {
                            var11 = 2000;
                        }
                        short var12 = 0;
                        if (var10 == 0) {
                            var12 = 20;
                        }
                        if (var10 == 1) {
                            var12 = 28;
                        }
                        if (var10 == 2) {
                            var12 = 14;
                        }
                        if (var10 == 3) {
                            var12 = 11;
                        }
                        if (var10 == 4) {
                            var12 = 41;
                        }
                        if (var12 != 0) {
                            var12 += var11;
                        }
                        class69.method492(91, arg3, (long) arg2, class9.method42(-125, new class69[] { class98.field1857, var6 }), var7[var10], arg1, var12);
                    }
                }
            }
            class69.method492(110, arg3, (long) arg2, class9.method42(-116, new class69[] { class98.field1857, var6 }), class73.field1406, arg1, (short) 1006);
        } else if ((class149.field2769 & 0x2) == 2) {
            class69.method492(108, arg3, (long) arg2, class9.method42(-126, new class69[] { class66.field1279, class27.field394, var6 }), class200.field3624, arg1, (short) 51);
            class229.field4179++;
        }
    }

    @OriginalMember(owner = "client!hb", name = "<init>", descriptor = "(II)V")
    public class206(int arg0, int arg1) {
        this.field3758 = arg0;
        this.field3762 = arg1;
    }
}
