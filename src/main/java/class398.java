import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!op")
public class class398 {

    @OriginalMember(owner = "client!op", name = "c", descriptor = "I")
    public static int field5280 = 0;

    @OriginalMember(owner = "client!op", name = "f", descriptor = "Ltt;")
    public static class338 field5283 = new class338(40, 3);

    @OriginalMember(owner = "client!op", name = "a", descriptor = "I")
    public static int field5278;

    @OriginalMember(owner = "client!op", name = "b", descriptor = "I")
    public static int field5279;

    @OriginalMember(owner = "client!op", name = "d", descriptor = "I")
    public static int field5281;

    @OriginalMember(owner = "client!op", name = "e", descriptor = "I")
    public static int field5282;

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(IIIIIII)I", line = 3)
    public static final int method2273(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if ((arg1 & 0x1) == 1) {
            int var7 = arg4;
            arg4 = arg5;
            arg5 = var7;
        }
        field5281++;
        int var8 = arg6 & 0x3;
        if (var8 == 0) {
            return arg3;
        }
        if (arg2 != -12384) {
            method2276(114);
        }
        if (var8 == 1) {
            return 7 + 1 - arg0 - arg4;
        } else if (var8 == 2) {
            return 7 + 1 - arg3 - arg5;
        } else {
            return arg0;
        }
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(Lfv;Z)I", line = 34)
    public static final int method2274(class690 arg0, boolean arg1) {
        if (!arg1) {
            return -96;
        }
        field5279++;
        if (class298.field3941 == arg0) {
            return 7681;
        } else if (class274.field3642 == arg0) {
            return 8448;
        } else if (class305.field4076 == arg0) {
            return 34165;
        } else if (class297.field3927 == arg0) {
            return 260;
        } else if (class100.field1201 == arg0) {
            return 34023;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(I)V", line = 74)
    public static final void method2275(int arg0) {
        for (int var1 = 0; var1 < 100; var1++) {
            class325.field4383[var1] = true;
        }
        if (arg0 != -1) {
            field5280 = -9;
        }
        field5282++;
    }

    @OriginalMember(owner = "client!op", name = "b", descriptor = "(I)Z", line = 91)
    public static final boolean method2276(int arg0) {
        field5278++;
        if (arg0 != -9772) {
            method2277(-104);
        }
        return class137.field1873 > 0;
    }

    @OriginalMember(owner = "client!op", name = "c", descriptor = "(I)V", line = 107)
    public static void method2277(int arg0) {
        if (arg0 != 20125) {
            method2273(-12, -40, 90, -30, 4, 73, -31);
        }
        field5283 = null;
    }
}
