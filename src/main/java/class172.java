import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class172 extends class354 {

    @OriginalMember(owner = "client!ld", name = "i", descriptor = "[I")
    public static int[] field2370 = new int[] { 28, 35, 40, 44 };

    @OriginalMember(owner = "client!ld", name = "t", descriptor = "Z")
    public static boolean field2381 = false;

    @OriginalMember(owner = "client!ld", name = "s", descriptor = "Lkg;")
    public static class275 field2380 = new class275(31, 7);

    @OriginalMember(owner = "client!ld", name = "h", descriptor = "I")
    public static int field2369;

    @OriginalMember(owner = "client!ld", name = "j", descriptor = "I")
    public static int field2371;

    @OriginalMember(owner = "client!ld", name = "k", descriptor = "I")
    public static int field2372;

    @OriginalMember(owner = "client!ld", name = "l", descriptor = "I")
    public static int field2373;

    @OriginalMember(owner = "client!ld", name = "m", descriptor = "I")
    public static int field2374;

    @OriginalMember(owner = "client!ld", name = "n", descriptor = "I")
    public static int field2375;

    @OriginalMember(owner = "client!ld", name = "o", descriptor = "I")
    public static int field2376;

    @OriginalMember(owner = "client!ld", name = "p", descriptor = "I")
    public static int field2377;

    @OriginalMember(owner = "client!ld", name = "q", descriptor = "I")
    public static int field2378;

    @OriginalMember(owner = "client!ld", name = "r", descriptor = "I")
    public static int field2379;

    @OriginalMember(owner = "client!ld", name = "u", descriptor = "Lnd;")
    public static class547 field2382;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(B)I", line = 6)
    public final int method393(byte arg0) {
        ++field2375;
        int var2 = 127 / ((37 - arg0) / 63);
        return 0;
    }

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "(B)Z", line = 18)
    public final boolean method1186(byte arg0) {
        ++field2376;
        if (arg0 != -9) {
            field2378 = 83;
        }
        return class134.method987(super.field4545, true);
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(I)V", line = 30)
    public final void method388(int arg0) {
        if (this.method1186((byte) -9)) {
            if (super.field4544.field10399.method1922(false) && !class662.method3732(super.field4544.field10399.method1924((byte) 124), 15110)) {
                super.field4545 = 1;
            }
            if (super.field4544.field10387.method3441((byte) 102) == 1) {
                super.field4545 = 1;
            }
        }
        ++field2379;
        if (arg0 != 6384) {
            field2372 = -9;
        }
        if (~super.field4545 == -4) {
            super.field4545 = 2;
        }
        if (super.field4545 < 0 || ~super.field4545 < -4) {
            super.field4545 = this.method393((byte) -63);
        }
    }

    @OriginalMember(owner = "client!ld", name = "<init>", descriptor = "(Lwo;)V", line = 60)
    public class172(class746 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "(B)V", line = 64)
    public static void method1187(byte arg0) {
        field2370 = null;
        field2380 = null;
        field2382 = null;
        if (arg0 != -127) {
            method1189(-34);
        }
    }

    @OriginalMember(owner = "client!ld", name = "<init>", descriptor = "(ILwo;)V", line = 76)
    public class172(int arg0, class746 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "(II)I", line = 81)
    public final int method391(int arg0, int arg1) {
        ++field2369;
        if (class134.method987(arg1, true)) {
            if (super.field4544.field10399.method1922(false) && !class662.method3732(super.field4544.field10399.method1924((byte) -72), 15110)) {
                return 3;
            }
            if (super.field4544.field10387.method3441((byte) -99) == 1) {
                return 3;
            }
        }
        if (arg0 == arg1) {
            return 3;
        } else {
            return class134.method987(arg1, true) ? 2 : 1;
        }
    }

    @OriginalMember(owner = "client!ld", name = "d", descriptor = "(B)I", line = 108)
    public final int method1188(byte arg0) {
        ++field2374;
        int var2 = 75 / ((arg0 - 7) / 45);
        return super.field4545;
    }

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "(I)V", line = 121)
    public static final void method1189(int arg0) {
        ++field2373;
        if (arg0 != -4) {
            field2380 = null;
        }
        if (!class647.field8963) {
            class647.field8963 = true;
            class366.field4718 = true;
            class631.field8710 += (-12.0F - class631.field8710) / 2.0F;
        }
    }

    @OriginalMember(owner = "client!ld", name = "d", descriptor = "(I)Z", line = 137)
    public final boolean method1190(int arg0) {
        ++field2377;
        int var2 = 112 % ((-34 - arg0) / 41);
        return true;
    }

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "(II)V", line = 147)
    public final void method389(int arg0, int arg1) {
        if (arg0 != -1) {
            field2372 = -49;
        }
        super.field4545 = arg1;
        ++field2371;
    }
}
