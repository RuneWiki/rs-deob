import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ao")
public class class173 extends class327 implements class381 {

    @OriginalMember(owner = "client!ao", name = "v", descriptor = "Lgq;")
    public class327 field2368;

    @OriginalMember(owner = "client!ao", name = "D", descriptor = "[[I")
    public static int[][] field2376 = new int[128][128];

    @OriginalMember(owner = "client!ao", name = "B", descriptor = "Lmc;")
    public static class78 field2374 = new class78(64, -1);

    @OriginalMember(owner = "client!ao", name = "o", descriptor = "I")
    public static int field2361;

    @OriginalMember(owner = "client!ao", name = "p", descriptor = "I")
    public static int field2362;

    @OriginalMember(owner = "client!ao", name = "q", descriptor = "I")
    public static int field2363;

    @OriginalMember(owner = "client!ao", name = "r", descriptor = "I")
    public static int field2364;

    @OriginalMember(owner = "client!ao", name = "s", descriptor = "I")
    public static int field2365;

    @OriginalMember(owner = "client!ao", name = "t", descriptor = "I")
    public static int field2366;

    @OriginalMember(owner = "client!ao", name = "u", descriptor = "I")
    public static int field2367;

    @OriginalMember(owner = "client!ao", name = "w", descriptor = "I")
    public static int field2369;

    @OriginalMember(owner = "client!ao", name = "x", descriptor = "I")
    public static int field2370;

    @OriginalMember(owner = "client!ao", name = "y", descriptor = "I")
    public static int field2371;

    @OriginalMember(owner = "client!ao", name = "z", descriptor = "I")
    public static int field2372;

    @OriginalMember(owner = "client!ao", name = "A", descriptor = "I")
    public static int field2373;

    @OriginalMember(owner = "client!ao", name = "C", descriptor = "I")
    public static int field2375;

    @OriginalMember(owner = "client!ao", name = "E", descriptor = "I")
    public static int field2377;

    @OriginalMember(owner = "client!ao", name = "F", descriptor = "I")
    public static int field2378;

    @OriginalMember(owner = "client!ao", name = "G", descriptor = "I")
    public static int field2379;

    @OriginalMember(owner = "client!ao", name = "h", descriptor = "(I)V", line = 4)
    public static final void method1002(int arg0) {
        class280.field3734.method502(0);
        field2369++;
        class471.field6493.method502(0);
        class140.field2023.method502(arg0);
        class215.field2896.method502(0);
        class87.field1212.method502(0);
    }

    @OriginalMember(owner = "client!ao", name = "g", descriptor = "(I)Z", line = 17)
    public final boolean method17(int arg0) {
        field2366++;
        if (arg0 != 7) {
            this.method1(-107);
        }
        return false;
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(Lwm;B)V", line = 28)
    public final void method10(class364 arg0, byte arg1) {
        if (arg1 <= -48) {
            field2377++;
        }
    }

    @OriginalMember(owner = "client!ao", name = "e", descriptor = "(I)V", line = 41)
    public final void method8(int arg0) {
        if (arg0 >= -74) {
            field2376 = null;
        }
        field2371++;
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(ILwm;I)Lgn;", line = 51)
    public final class456 method15(int arg0, class364 arg1, int arg2) {
        field2365++;
        return arg2 == -28045 ? null : null;
    }

    @OriginalMember(owner = "client!ao", name = "b", descriptor = "(I)V", line = 67)
    public final void method1(int arg0) {
        if (arg0 <= -105) {
            field2373++;
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(IIILwm;ZLhp;Z)V", line = 79)
    public final void method2(int arg0, int arg1, int arg2, class364 arg3, boolean arg4, class197 arg5, boolean arg6) {
        if (!arg6) {
            this.method4(-108);
        }
        field2372++;
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(I)I", line = 89)
    public final int method4(int arg0) {
        field2370++;
        return arg0 == -10666 ? 0 : -61;
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(IB)I", line = 100)
    public static final int method1003(int arg0, byte arg1) {
        if (arg1 >= -8) {
            return -25;
        } else {
            field2362++;
            return arg0 >> 11 & 0x7F;
        }
    }

    @OriginalMember(owner = "client!ao", name = "c", descriptor = "(I)I", line = 111)
    public final int method9(int arg0) {
        field2375++;
        return arg0 == -769 ? 0 : 110;
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(IIBLwm;)Z", line = 122)
    public final boolean method14(int arg0, int arg1, byte arg2, class364 arg3) {
        field2363++;
        return arg2 >= -107;
    }

    @OriginalMember(owner = "client!ao", name = "<init>", descriptor = "(IIIIILgq;)V", line = 133)
    public class173(int arg0, int arg1, int arg2, int arg3, int arg4, class327 arg5) {
        super(arg2, arg3, arg4, class188.method1085(arg1, arg0, 1));
        this.field2368 = arg5;
    }

    @OriginalMember(owner = "client!ao", name = "b", descriptor = "(Lwm;B)Lnf;", line = 142)
    public final class374 method3(class364 arg0, byte arg1) {
        field2378++;
        return arg1 < 99 ? null : null;
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(Z)Z", line = 153)
    public final boolean method7(boolean arg0) {
        if (arg0) {
            this.method14(-68, 96, (byte) 98, (class364) null);
        }
        field2379++;
        return false;
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(BLwm;)V", line = 166)
    public final void method12(byte arg0, class364 arg1) {
        if (arg0 < 27) {
            this.method8(7);
        }
        field2364++;
    }

    @OriginalMember(owner = "client!ao", name = "d", descriptor = "(I)I", line = 176)
    public final int method13(int arg0) {
        field2367++;
        return arg0 < 51 ? 93 : 0;
    }

    @OriginalMember(owner = "client!ao", name = "i", descriptor = "(I)V", line = 187)
    public static void method1004(int arg0) {
        field2374 = null;
        field2376 = null;
        if (arg0 != -8488) {
            method1003(-14, (byte) 11);
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(Lwm;I)V", line = 205)
    public final void method16(class364 arg0, int arg1) {
        if (arg1 != 31591) {
            field2376 = null;
        }
        field2361++;
    }
}
