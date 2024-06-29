import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jha")
public class class31 extends class530 {

    @OriginalMember(owner = "client!jha", name = "h", descriptor = "Lqk;")
    public static class148 field472 = new class148(117, 3);

    @OriginalMember(owner = "client!jha", name = "n", descriptor = "Z")
    public static boolean field478 = true;

    @OriginalMember(owner = "client!jha", name = "m", descriptor = "I")
    public static int field477 = 0;

    @OriginalMember(owner = "client!jha", name = "g", descriptor = "I")
    public static int field471;

    @OriginalMember(owner = "client!jha", name = "i", descriptor = "I")
    public static int field473;

    @OriginalMember(owner = "client!jha", name = "j", descriptor = "I")
    public static int field474;

    @OriginalMember(owner = "client!jha", name = "k", descriptor = "I")
    public static int field475;

    @OriginalMember(owner = "client!jha", name = "l", descriptor = "I")
    public static int field476;

    @OriginalMember(owner = "client!jha", name = "o", descriptor = "I")
    public static int field479;

    @OriginalMember(owner = "client!jha", name = "p", descriptor = "I")
    public static int field480;

    @OriginalMember(owner = "client!jha", name = "a", descriptor = "(IIBIIILha;)V")
    public static final void method229(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, class545 arg6) {
        if ((class677.field9539 == null || class639.field9081 == null || class652.field9221 == null) && class323.field4156.method3340(0, class57.field787) && class323.field4156.method3340(0, class702.field9773) && class323.field4156.method3340(0, class499.field6986)) {
            class320 var7 = class320.method1870(class323.field4156, class702.field9773, 0);
            class639.field9081 = arg6.method2126(var7, true);
            var7.method1864();
            class672.field9451 = arg6.method2126(var7, true);
            class677.field9539 = arg6.method2126(class320.method1870(class323.field4156, class57.field787, 0), true);
            class320 var8 = class320.method1870(class323.field4156, class499.field6986, 0);
            class652.field9221 = arg6.method2126(var8, true);
            var8.method1864();
            class625.field8929 = arg6.method2126(var8, true);
        }
        if (arg2 <= -20) {
            ++field474;
            if (class677.field9539 != null && class639.field9081 != null && class652.field9221 != null) {
                int var9 = (arg4 + -(class652.field9221.method115() * 2)) / class677.field9539.method115();
                for (int var10 = 0; ~var10 > ~var9; ++var10) {
                    class677.field9539.method101(class652.field9221.method115() + arg5 + var10 * class677.field9539.method115(), arg1 + (arg3 - class677.field9539.method117()));
                }
                int var11 = (-arg0 + arg1 - class652.field9221.method117()) / class639.field9081.method117();
                for (int var12 = 0; ~var11 < ~var12; ++var12) {
                    class639.field9081.method101(arg5, arg0 + arg3 - -(var12 * class639.field9081.method117()));
                    class672.field9451.method101(-class672.field9451.method115() + arg4 + arg5, var12 * class639.field9081.method117() + arg3 - -arg0);
                }
                class652.field9221.method101(arg5, arg3 - (-arg1 - -class652.field9221.method117()));
                class625.field8929.method101(arg4 + arg5 - class652.field9221.method115(), arg1 + arg3 + -class652.field9221.method117());
            }
        }
    }

    @OriginalMember(owner = "client!jha", name = "<init>", descriptor = "(Lah;)V")
    public class31(class374 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!jha", name = "<init>", descriptor = "(ILah;)V")
    public class31(int arg0, class374 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!jha", name = "a", descriptor = "(Z)V")
    public final void method73(boolean arg0) {
        ++field473;
        if (arg0) {
            if (super.field7418.method2246(1) == class324.field4159) {
                super.field7419 = 2;
            }
            if (super.field7419 < 0 || ~super.field7419 < -3) {
                super.field7419 = this.method74(0);
            }
        }
    }

    @OriginalMember(owner = "client!jha", name = "b", descriptor = "(II)V")
    public final void method70(int arg0, int arg1) {
        if (arg1 <= -38) {
            super.field7419 = arg0;
            ++field476;
        }
    }

    @OriginalMember(owner = "client!jha", name = "b", descriptor = "(I)V")
    public static void method230(int arg0) {
        field472 = null;
        if (arg0 != -31967) {
            method232(-76, 43, (int[]) null, 37, -29, 40, -88, (float[]) null, -31, (int[]) null, (float[]) null, -31, 110);
        }
    }

    @OriginalMember(owner = "client!jha", name = "a", descriptor = "(I)I")
    public final int method74(int arg0) {
        ++field479;
        return arg0 != 0 ? 116 : 1;
    }

    @OriginalMember(owner = "client!jha", name = "c", descriptor = "(I)I")
    public final int method231(int arg0) {
        ++field475;
        if (arg0 != 0) {
            this.method231(33);
        }
        return super.field7419;
    }

    @OriginalMember(owner = "client!jha", name = "a", descriptor = "(II)I")
    public final int method75(int arg0, int arg1) {
        int var3 = 84 / ((arg1 - 63) / 60);
        ++field480;
        return 1;
    }

    @OriginalMember(owner = "client!jha", name = "a", descriptor = "(II[IIIII[FI[I[FII)V")
    public static final void method232(int arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, float[] arg7, int arg8, int[] arg9, float[] arg10, int arg11, int arg12) {
        ++field471;
        int var13 = arg0 * arg11 + arg8;
        int var14 = arg1 * arg5 + arg12;
        if (arg3 < 29) {
            method232(-36, -46, (int[]) null, 50, -25, -43, -90, (float[]) null, -114, (int[]) null, (float[]) null, 70, -82);
        }
        int var15 = -arg4 + arg0;
        int var16 = -arg4 + arg5;
        if (arg9 == null) {
            for (int var17 = 0; ~var17 > ~arg6; ++var17) {
                int var18 = arg4 + var13;
                while (~var18 < ~var13) {
                    arg7[var14++] = arg10[var13++];
                }
                var13 += var15;
                var14 += var16;
            }
        } else if (arg10 == null) {
            for (int var19 = 0; var19 < arg6; ++var19) {
                int var20 = arg4 + var13;
                while (~var13 > ~var20) {
                    arg2[var14++] = arg9[var13++];
                }
                var14 += var16;
                var13 += var15;
            }
        } else {
            for (int var21 = 0; arg6 > var21; ++var21) {
                int var22 = arg4 + var13;
                while (~var22 < ~var13) {
                    arg2[var14] = arg9[var13];
                    arg7[var14++] = arg10[var13++];
                }
                var14 += var16;
                var13 += var15;
            }
        }
    }
}
