import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public class class357 extends class213 {

    @OriginalMember(owner = "client!h", name = "l", descriptor = "I")
    public static int field5177;

    @OriginalMember(owner = "client!h", name = "m", descriptor = "I")
    public static int field5178;

    @OriginalMember(owner = "client!h", name = "n", descriptor = "I")
    public static int field5179;

    @OriginalMember(owner = "client!h", name = "o", descriptor = "I")
    public static int field5180;

    @OriginalMember(owner = "client!h", name = "p", descriptor = "I")
    public static int field5181;

    @OriginalMember(owner = "client!h", name = "r", descriptor = "I")
    public static int field5183;

    @OriginalMember(owner = "client!h", name = "t", descriptor = "I")
    public static int field5185;

    @OriginalMember(owner = "client!h", name = "u", descriptor = "I")
    public static int field5186;

    @OriginalMember(owner = "client!h", name = "s", descriptor = "Ldj;")
    public static class267 field5184;

    @OriginalMember(owner = "client!h", name = "q", descriptor = "[Lraa;")
    public static class218[] field5182;

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IILaw;)V", line = 6)
    public final void method19(int arg0, int arg1, class619 arg2) {
        ++field5183;
        if (arg1 == 8) {
            super.field2766.method1884(arg2, -2);
            super.field2766.method1995(arg0, arg1 + -7);
        }
    }

    @OriginalMember(owner = "client!h", name = "e", descriptor = "(B)V", line = 20)
    public static void method2212(byte arg0) {
        int var1 = 28 % ((44 - arg0) / 54);
        field5184 = null;
        field5182 = null;
    }

    @OriginalMember(owner = "client!h", name = "<init>", descriptor = "(Lsv;)V", line = 30)
    public class357(class312 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(III)V", line = 34)
    public final void method28(int arg0, int arg1, int arg2) {
        ++field5180;
        if (arg0 != -16595) {
            field5182 = null;
        }
    }

    @OriginalMember(owner = "client!h", name = "d", descriptor = "(B)Z", line = 45)
    public final boolean method22(byte arg0) {
        ++field5178;
        if (arg0 != 75) {
            field5184 = null;
        }
        return true;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(I)V", line = 57)
    public final void method20(int arg0) {
        super.field2766.method1886(false, 13512);
        ++field5179;
        if (arg0 < 32) {
            field5182 = null;
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(II[BIIB)V", line = 68)
    public static final void method2213(int arg0, int arg1, byte[] arg2, int arg3, int arg4, byte arg5) {
        ++field5186;
        if (arg4 < arg1) {
            if (arg5 != 58) {
                field5182 = null;
            }
            int var6 = arg0 + arg4;
            int var7 = -arg4 + arg1 >> 2;
            while (true) {
                --var7;
                if (~var7 > -1) {
                    int var8 = -arg4 + arg1 & 3;
                    while (true) {
                        --var8;
                        if (var8 < 0) {
                            return;
                        }
                        arg2[var6++] = 1;
                    }
                }
                arg2[var6++] = 1;
                arg2[var6++] = 1;
                arg2[var6++] = 1;
                arg2[var6++] = 1;
            }
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(ZB)V", line = 102)
    public static final void method2214(boolean arg0, byte arg1) {
        ++field5185;
        if (class427.field5933.length() != 0) {
            class451.method2571("--> " + class427.field5933, 98);
            class401.method2363(false, class427.field5933, -73, arg0);
            int var2 = -41 / ((arg1 - -67) / 59);
            class427.field5933 = "";
            class557.field7603 = 0;
            class610.field8316 = 0;
        }
    }

    @OriginalMember(owner = "client!h", name = "c", descriptor = "(ZI)V", line = 121)
    public final void method23(boolean arg0, int arg1) {
        if (arg1 == -18) {
            ++field5181;
        }
    }

    @OriginalMember(owner = "client!h", name = "b", descriptor = "(ZI)V", line = 131)
    public final void method17(boolean arg0, int arg1) {
        if (arg1 <= 37) {
            method2212((byte) -16);
        }
        ++field5177;
        super.field2766.method1886(true, 13512);
    }
}
