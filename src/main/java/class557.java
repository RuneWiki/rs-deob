import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class557 extends class74 {

    @OriginalMember(owner = "client!g", name = "D", descriptor = "Z")
    public static boolean field7743 = true;

    @OriginalMember(owner = "client!g", name = "x", descriptor = "Lpk;")
    public static class104 field7737 = new class104("WTWIP", 3);

    @OriginalMember(owner = "client!g", name = "t", descriptor = "I")
    public static int field7733;

    @OriginalMember(owner = "client!g", name = "u", descriptor = "I")
    public static int field7734;

    @OriginalMember(owner = "client!g", name = "v", descriptor = "I")
    public static int field7735;

    @OriginalMember(owner = "client!g", name = "w", descriptor = "I")
    public static int field7736;

    @OriginalMember(owner = "client!g", name = "y", descriptor = "I")
    public static int field7738;

    @OriginalMember(owner = "client!g", name = "z", descriptor = "I")
    public static int field7739;

    @OriginalMember(owner = "client!g", name = "A", descriptor = "I")
    public static int field7740;

    @OriginalMember(owner = "client!g", name = "B", descriptor = "I")
    public static int field7741;

    @OriginalMember(owner = "client!g", name = "C", descriptor = "I")
    public static int field7742;

    @OriginalMember(owner = "client!g", name = "E", descriptor = "I")
    public static int field7744;

    @OriginalMember(owner = "client!g", name = "F", descriptor = "I")
    public static int field7745;

    @OriginalMember(owner = "client!g", name = "G", descriptor = "I")
    public static int field7746;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(ZZ)V", line = 3)
    public final void method339(boolean arg0, boolean arg1) {
        ++field7736;
        if (!arg0) {
            field7737 = null;
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IIB)V", line = 17)
    public final void method340(int arg0, int arg1, byte arg2) {
        ++field7738;
        if (arg2 != 65) {
            this.method347(-81, false);
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IIII)I", line = 29)
    public static final int method3064(int arg0, int arg1, int arg2, int arg3) {
        ++field7733;
        if ((8 & class10.field190[arg0][arg3][arg1]) != arg2) {
            return 0;
        } else {
            return ~arg0 < -1 && ~(2 & class10.field190[1][arg3][arg1]) != -1 ? arg0 + -1 : arg0;
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IILhfa;)V", line = 45)
    public final void method341(int arg0, int arg1, class466 arg2) {
        ++field7744;
        super.field1011.method2596(arg2, 0);
        super.field1011.method2595(arg0, 0);
        if (arg1 <= 47) {
            this.method346(90);
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(I)Z", line = 57)
    public final boolean method346(int arg0) {
        if (arg0 != -16777216) {
            this.method347(-76, false);
        }
        ++field7734;
        return false;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(ILjava/lang/String;)I", line = 68)
    public static final int method3065(int arg0, String arg1) {
        if (arg0 != 128) {
            method3067(-124, -2, -83, -57);
        }
        ++field7740;
        return class393.method2110(arg1, true, 10, (byte) 67);
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(II)I", line = 83)
    public static final int method3066(int arg0, int arg1) {
        if (arg0 >= -54) {
            field7743 = true;
        }
        ++field7746;
        if (~arg1 > -97) {
            return 0;
        } else {
            return arg1 < 128 ? 2 : 3;
        }
    }

    @OriginalMember(owner = "client!g", name = "b", descriptor = "(IIII)I", line = 102)
    public static final int method3067(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg2 & 3;
        ++field7745;
        if (var4 == 0) {
            return arg1;
        } else if (var4 == 1) {
            return arg0;
        } else if (var4 == 2) {
            return -arg1 + 4095;
        } else {
            return arg3 < 77 ? 120 : 4095 - arg0;
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IZ)V", line = 128)
    public final void method347(int arg0, boolean arg1) {
        ++field7742;
        int var3 = 45 % ((52 - arg0) / 36);
    }

    @OriginalMember(owner = "client!g", name = "d", descriptor = "(I)V", line = 140)
    public final void method343(int arg0) {
        ++field7739;
        if (arg0 != -19092) {
            field7741 = -77;
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IIIIIII)V", line = 150)
    public static final void method3068(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class228.field2843 = arg0;
        class3.field30 = arg1;
        ++field7735;
        class332.field4238 = arg6;
        if (arg2 != 8) {
            method3068(82, 113, 39, -15, 6, 2, -92);
        }
        class693.field9830 = arg3;
        class391.field4928 = arg4;
        class516.field7038 = arg5;
    }

    @OriginalMember(owner = "client!g", name = "d", descriptor = "(B)V", line = 171)
    public static void method3069(byte arg0) {
        if (arg0 == -9) {
            field7737 = null;
        }
    }

    @OriginalMember(owner = "client!g", name = "<init>", descriptor = "(Len;)V", line = 181)
    public class557(class478 arg0) {
        super(arg0);
    }
}
