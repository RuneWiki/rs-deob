import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wm")
public class class482 extends class122 implements class332 {

    @OriginalMember(owner = "client!wm", name = "g", descriptor = "I")
    private int field6749;

    @OriginalMember(owner = "client!wm", name = "c", descriptor = "I")
    public static int field6745;

    @OriginalMember(owner = "client!wm", name = "d", descriptor = "I")
    public static int field6746;

    @OriginalMember(owner = "client!wm", name = "e", descriptor = "I")
    public static int field6747;

    @OriginalMember(owner = "client!wm", name = "f", descriptor = "I")
    public static int field6748;

    @OriginalMember(owner = "client!wm", name = "h", descriptor = "I")
    public static int field6750;

    @OriginalMember(owner = "client!wm", name = "j", descriptor = "I")
    public static int field6752;

    @OriginalMember(owner = "client!wm", name = "k", descriptor = "I")
    public static int field6753;

    @OriginalMember(owner = "client!wm", name = "i", descriptor = "[I")
    public static int[] field6751;

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(IZ)V", line = 6)
    public static final void method2799(int arg0, boolean arg1) {
        ++field6753;
        ++class334.field4323;
        class418.method2378(17984, class491.field6861);
        if (arg0 == 0) {
            for (class565 var2 = (class565) class309.field3937.method2638(false); var2 != null; var2 = (class565) class309.field3937.method2641(12089)) {
                if (!var2.method3189(arg0 ^ -9613)) {
                    var2 = (class565) class309.field3937.method2638(false);
                    if (var2 == null) {
                        break;
                    }
                }
                if (var2.field8293 == 0) {
                    class615.method3541(var2, (byte) 118, arg1, true);
                }
            }
            if (class478.field6711 != null) {
                class87.method508(arg0 ^ 125, class478.field6711);
                class478.field6711 = null;
            }
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(I)I", line = 45)
    public final int method1861(int arg0) {
        if (arg0 != 23554) {
            return -30;
        } else {
            ++field6745;
            return 0;
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(IIIIIII)V", line = 57)
    public static final void method2800(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        for (class350 var7 = (class350) class82.field991.method1987(true); var7 != null; var7 = (class350) class82.field991.method1994(6408)) {
            if (var7.field4525 <= class335.field4358) {
                var7.method610((byte) -105);
            } else {
                class274.method1558((var7.field4518 << 7) + 64, (var7.field4520 << 7) + 64, (byte) -38, arg4, arg1, arg0 >> 1, var7.field4517, arg5 >> 1, var7.field4521 * 2);
                class459.field6320.method534(11740, var7.field4523, 0, class34.field271[1] + arg3, var7.field4524 | -16777216, arg2 - -class34.field271[0]);
            }
        }
        if (arg6 == 29741) {
            ++field6752;
        }
    }

    @OriginalMember(owner = "client!wm", name = "<init>", descriptor = "(Lmh;I[BI)V", line = 86)
    public class482(class537 arg0, int arg1, byte[] arg2, int arg3) {
        super(arg0, arg2, arg3);
        this.field6749 = arg1;
    }

    @OriginalMember(owner = "client!wm", name = "c", descriptor = "(I)J", line = 94)
    public final long method1864(int arg0) {
        if (arg0 != -12077) {
            return 126L;
        } else {
            ++field6746;
            return super.field1519.getAddress();
        }
    }

    @OriginalMember(owner = "client!wm", name = "d", descriptor = "(I)V", line = 106)
    public static void method2801(int arg0) {
        field6751 = null;
        if (arg0 != -17145) {
            field6748 = -13;
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(II[BI)V", line = 120)
    public final void method1862(int arg0, int arg1, byte[] arg2, int arg3) {
        this.method707(arg2, arg1);
        ++field6750;
        if (arg0 != -32036) {
            field6751 = null;
        }
        this.field6749 = arg3;
    }

    @OriginalMember(owner = "client!wm", name = "b", descriptor = "(I)I", line = 134)
    public final int method1863(int arg0) {
        ++field6747;
        if (arg0 != -22966) {
            method2799(39, false);
        }
        return this.field6749;
    }
}
