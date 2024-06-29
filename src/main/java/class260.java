import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public class class260 extends class336 implements class438 {

    @OriginalMember(owner = "client!bj", name = "R", descriptor = "Lbf;")
    public class336 field3854;

    @OriginalMember(owner = "client!bj", name = "J", descriptor = "Lvq;")
    public static class24 field3847 = new class24(85, -2);

    @OriginalMember(owner = "client!bj", name = "V", descriptor = "[Z")
    public static boolean[] field3858 = new boolean[5];

    @OriginalMember(owner = "client!bj", name = "S", descriptor = "Lbn;")
    public static class160 field3855 = new class160(9, -1);

    @OriginalMember(owner = "client!bj", name = "W", descriptor = "Lbn;")
    public static class160 field3859 = new class160(1, 8);

    @OriginalMember(owner = "client!bj", name = "z", descriptor = "I")
    public static int field3838;

    @OriginalMember(owner = "client!bj", name = "A", descriptor = "I")
    public static int field3839;

    @OriginalMember(owner = "client!bj", name = "B", descriptor = "I")
    public static int field3840;

    @OriginalMember(owner = "client!bj", name = "C", descriptor = "I")
    public static int field3841;

    @OriginalMember(owner = "client!bj", name = "D", descriptor = "I")
    public static int field3842;

    @OriginalMember(owner = "client!bj", name = "E", descriptor = "I")
    public static int field3843;

    @OriginalMember(owner = "client!bj", name = "F", descriptor = "I")
    public static int field3844;

    @OriginalMember(owner = "client!bj", name = "G", descriptor = "I")
    public static int field3845;

    @OriginalMember(owner = "client!bj", name = "I", descriptor = "I")
    public static int field3846;

    @OriginalMember(owner = "client!bj", name = "K", descriptor = "I")
    public static int field3848;

    @OriginalMember(owner = "client!bj", name = "L", descriptor = "I")
    public static int field3849;

    @OriginalMember(owner = "client!bj", name = "M", descriptor = "I")
    public static int field3850;

    @OriginalMember(owner = "client!bj", name = "O", descriptor = "I")
    public static int field3851;

    @OriginalMember(owner = "client!bj", name = "P", descriptor = "I")
    public static int field3852;

    @OriginalMember(owner = "client!bj", name = "Q", descriptor = "I")
    public static int field3853;

    @OriginalMember(owner = "client!bj", name = "T", descriptor = "I")
    public static int field3856;

    @OriginalMember(owner = "client!bj", name = "U", descriptor = "I")
    public static int field3857;

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "(ILfp;)V", line = 12)
    public final void method14(int arg0, class9 arg1) {
        if (arg0 != -7561) {
            this.method33(-33);
        }
        field3846++;
    }

    @OriginalMember(owner = "client!bj", name = "e", descriptor = "(I)V", line = 22)
    public static void method1786(int arg0) {
        field3847 = null;
        if (arg0 != -1) {
            field3859 = null;
        }
        field3859 = null;
        field3855 = null;
        field3858 = null;
    }

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "(ZI)V", line = 35)
    public static final void method1787(boolean arg0, int arg1) {
        if (arg0) {
            method1787(false, -119);
        }
        class363 var2 = class160.field2146;
        synchronized (class160.field2146) {
            class160.field2146.method2300(arg1, true);
        }
        field3840++;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(Z)Z", line = 48)
    public final boolean method15(boolean arg0) {
        if (arg0) {
            field3844++;
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!bj", name = "<init>", descriptor = "(IIIIIIIIIILbf;)V", line = 59)
    public class260(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class336 arg10) {
        super(arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, false, class57.method431(arg0, arg1, -17893));
        this.field3854 = arg10;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(Lfp;Z)V", line = 67)
    public final void method10(class9 arg0, boolean arg1) {
        field3857++;
        if (arg1) {
            field3855 = null;
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(Lfp;I)V", line = 80)
    public final void method7(class9 arg0, int arg1) {
        field3852++;
        if (arg1 < 98) {
            method1787(false, -19);
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(Lfp;Lje;ZIIII)V", line = 90)
    public final void method32(class9 arg0, class309 arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        field3853++;
        if (arg5 >= -31) {
            this.method7((class9) null, 52);
        }
    }

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "(I)V", line = 100)
    public final void method4(int arg0) {
        field3842++;
        if (arg0 != -27030) {
            field3858 = null;
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(I)I", line = 111)
    public final int method1(int arg0) {
        if (arg0 > -72) {
            this.method34((byte) 67);
        }
        field3843++;
        return 0;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(Lfp;III)Z", line = 127)
    public final boolean method5(class9 arg0, int arg1, int arg2, int arg3) {
        field3848++;
        return arg2 != -754;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(IIIB)V", line = 138)
    public static final void method1788(int arg0, int arg1, int arg2, byte arg3) {
        int var4 = class450.field6629 * arg1 >> 8;
        int var5 = 10 / ((arg3 + 11) / 62);
        field3851++;
        if (var4 != 0 && arg0 != -1) {
            class339.method2190(0, 0, false, var4, class70.field923, arg0);
            class29.field408 = true;
        }
    }

    @OriginalMember(owner = "client!bj", name = "d", descriptor = "(I)V", line = 157)
    public final void method33(int arg0) {
        if (arg0 <= 109) {
            field3855 = null;
        }
        field3838++;
    }

    @OriginalMember(owner = "client!bj", name = "d", descriptor = "(B)Z", line = 172)
    public final boolean method34(byte arg0) {
        int var2 = -21 / ((arg0 + 19) / 44);
        field3841++;
        return false;
    }

    @OriginalMember(owner = "client!bj", name = "e", descriptor = "(B)I", line = 184)
    public final int method268(byte arg0) {
        field3856++;
        if (arg0 >= -101) {
            this.field3854 = null;
        }
        return 0;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(ILfp;)Luq;", line = 196)
    public final class241 method2(int arg0, class9 arg1) {
        field3845++;
        if (arg0 > -125) {
            field3858 = null;
        }
        return null;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(Lfp;II)Lbi;", line = 210)
    public final class143 method11(class9 arg0, int arg1, int arg2) {
        if (arg2 == -23109) {
            field3839++;
            return null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(B)I", line = 222)
    public final int method9(byte arg0) {
        field3850++;
        if (arg0 <= 102) {
            this.method2(-12, (class9) null);
        }
        return 0;
    }

    @OriginalMember(owner = "client!bj", name = "c", descriptor = "(I)I", line = 244)
    public final int method6(int arg0) {
        field3849++;
        if (arg0 != -20839) {
            this.method7((class9) null, 53);
        }
        return 0;
    }
}
