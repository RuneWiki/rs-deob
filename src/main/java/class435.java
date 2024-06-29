import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public class class435 extends class218 implements class518 {

    @OriginalMember(owner = "client!gl", name = "n", descriptor = "Lhc;")
    public class218 field6487;

    @OriginalMember(owner = "client!gl", name = "p", descriptor = "[Lch;")
    public static class166[] field6489 = new class166[2048];

    @OriginalMember(owner = "client!gl", name = "x", descriptor = "Lvv;")
    public static class313 field6497 = new class313(52, 7);

    @OriginalMember(owner = "client!gl", name = "E", descriptor = "I")
    public static int field6504 = -1;

    @OriginalMember(owner = "client!gl", name = "F", descriptor = "Lfr;")
    public static class231 field6505 = new class231(4);

    @OriginalMember(owner = "client!gl", name = "H", descriptor = "I")
    public static int field6507 = 0;

    @OriginalMember(owner = "client!gl", name = "o", descriptor = "I")
    public static int field6488;

    @OriginalMember(owner = "client!gl", name = "q", descriptor = "I")
    public static int field6490;

    @OriginalMember(owner = "client!gl", name = "r", descriptor = "I")
    public static int field6491;

    @OriginalMember(owner = "client!gl", name = "s", descriptor = "I")
    public static int field6492;

    @OriginalMember(owner = "client!gl", name = "t", descriptor = "I")
    public static int field6493;

    @OriginalMember(owner = "client!gl", name = "u", descriptor = "I")
    public static int field6494;

    @OriginalMember(owner = "client!gl", name = "v", descriptor = "I")
    public static int field6495;

    @OriginalMember(owner = "client!gl", name = "w", descriptor = "I")
    public static int field6496;

    @OriginalMember(owner = "client!gl", name = "y", descriptor = "I")
    public static int field6498;

    @OriginalMember(owner = "client!gl", name = "z", descriptor = "I")
    public static int field6499;

    @OriginalMember(owner = "client!gl", name = "A", descriptor = "I")
    public static int field6500;

    @OriginalMember(owner = "client!gl", name = "B", descriptor = "I")
    public static int field6501;

    @OriginalMember(owner = "client!gl", name = "C", descriptor = "I")
    public static int field6502;

    @OriginalMember(owner = "client!gl", name = "D", descriptor = "I")
    public static int field6503;

    @OriginalMember(owner = "client!gl", name = "G", descriptor = "I")
    public static int field6506;

    @OriginalMember(owner = "client!gl", name = "I", descriptor = "[I")
    public static int[] field6508;

    @OriginalMember(owner = "client!gl", name = "m", descriptor = "[Lem;")
    public static class429[] field6486;

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(BLza;)V", line = 3)
    public final void method26(byte arg0, class491 arg1) {
        if (arg0 != 111) {
            this.method36(false);
        }
        field6493++;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(B)I", line = 14)
    public final int method28(byte arg0) {
        if (arg0 == -118) {
            field6500++;
            return 0;
        } else {
            return 78;
        }
    }

    @OriginalMember(owner = "client!gl", name = "f", descriptor = "(I)V", line = 25)
    public static void method2636(int arg0) {
        field6508 = null;
        field6505 = null;
        field6486 = null;
        if (arg0 != 2048) {
            method2636(-109);
        }
        field6489 = null;
        field6497 = null;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(IILza;IILvl;Z)V", line = 42)
    public final void method39(int arg0, int arg1, class491 arg2, int arg3, int arg4, class243 arg5, boolean arg6) {
        field6492++;
        if (arg0 != 0) {
            field6504 = -33;
        }
    }

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "(B)Z", line = 52)
    public final boolean method33(byte arg0) {
        field6498++;
        int var2 = 21 % ((8 - arg0) / 45);
        return false;
    }

    @OriginalMember(owner = "client!gl", name = "g", descriptor = "(I)V", line = 68)
    public static final void method2637(int arg0) {
        class262.method1751(arg0 - 1274);
        field6506++;
        class529.method3131(86);
        if (arg0 != 1393) {
            method2637(114);
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(I)I", line = 80)
    public final int method29(int arg0) {
        field6499++;
        int var2 = -62 / ((40 - arg0) / 52);
        return 0;
    }

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "(BLza;)V", line = 90)
    public final void method43(byte arg0, class491 arg1) {
        if (arg0 != 35) {
            field6505 = null;
        }
        field6502++;
    }

    @OriginalMember(owner = "client!gl", name = "c", descriptor = "(I)V", line = 102)
    public final void method31(int arg0) {
        int var2 = 106 % ((arg0 - 57) / 48);
        field6488++;
    }

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "(Z)V", line = 116)
    public final void method36(boolean arg0) {
        if (arg0) {
            this.method40(50, null);
        }
        field6495++;
    }

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "(I)I", line = 126)
    public final int method38(int arg0) {
        if (arg0 == 5638) {
            field6494++;
            return 0;
        } else {
            return -77;
        }
    }

    @OriginalMember(owner = "client!gl", name = "<init>", descriptor = "(IIIIILhc;)V", line = 137)
    public class435(int arg0, int arg1, int arg2, int arg3, int arg4, class218 arg5) {
        super(arg2, arg3, arg4, class533.method3155(arg1, 96, arg0));
        this.field6487 = arg5;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(Lza;III)Z", line = 152)
    public final boolean method27(class491 arg0, int arg1, int arg2, int arg3) {
        field6503++;
        return arg1 <= 121;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(ILza;)V", line = 164)
    public final void method34(int arg0, class491 arg1) {
        field6501++;
        if (arg0 != 25747) {
            field6497 = null;
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(Z)Z", line = 174)
    public final boolean method42(boolean arg0) {
        field6491++;
        if (arg0) {
            field6504 = 95;
        }
        return false;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(ILza;I)Le;", line = 189)
    public final class530 method32(int arg0, class491 arg1, int arg2) {
        field6496++;
        int var4 = -38 / ((arg2 + 24) / 60);
        return null;
    }

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "(ILza;)Lsr;", line = 202)
    public final class430 method40(int arg0, class491 arg1) {
        if (arg0 > -24) {
            this.method40(-1, null);
        }
        field6490++;
        return null;
    }
}
