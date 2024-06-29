import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class521 extends class180 implements class55 {

    @OriginalMember(owner = "client!hd", name = "D", descriptor = "Lgf;")
    public class180 field7679;

    @OriginalMember(owner = "client!hd", name = "y", descriptor = "Luf;")
    public static class310 field7674 = new class310(86, 7);

    @OriginalMember(owner = "client!hd", name = "B", descriptor = "Lqi;")
    public static class398 field7677 = new class398();

    @OriginalMember(owner = "client!hd", name = "G", descriptor = "[Lrk;")
    public static class25[] field7682 = new class25[6];

    @OriginalMember(owner = "client!hd", name = "H", descriptor = "Luf;")
    public static class310 field7683 = new class310(65, 2);

    @OriginalMember(owner = "client!hd", name = "n", descriptor = "I")
    public static int field7663;

    @OriginalMember(owner = "client!hd", name = "o", descriptor = "I")
    public static int field7664;

    @OriginalMember(owner = "client!hd", name = "p", descriptor = "I")
    public static int field7665;

    @OriginalMember(owner = "client!hd", name = "q", descriptor = "I")
    public static int field7666;

    @OriginalMember(owner = "client!hd", name = "r", descriptor = "I")
    public static int field7667;

    @OriginalMember(owner = "client!hd", name = "s", descriptor = "I")
    public static int field7668;

    @OriginalMember(owner = "client!hd", name = "t", descriptor = "I")
    public static int field7669;

    @OriginalMember(owner = "client!hd", name = "u", descriptor = "I")
    public static int field7670;

    @OriginalMember(owner = "client!hd", name = "v", descriptor = "I")
    public static int field7671;

    @OriginalMember(owner = "client!hd", name = "w", descriptor = "I")
    public static int field7672;

    @OriginalMember(owner = "client!hd", name = "x", descriptor = "I")
    public static int field7673;

    @OriginalMember(owner = "client!hd", name = "z", descriptor = "I")
    public static int field7675;

    @OriginalMember(owner = "client!hd", name = "A", descriptor = "I")
    public static int field7676;

    @OriginalMember(owner = "client!hd", name = "C", descriptor = "I")
    public static int field7678;

    @OriginalMember(owner = "client!hd", name = "E", descriptor = "I")
    public static int field7680;

    @OriginalMember(owner = "client!hd", name = "F", descriptor = "I")
    public static int field7681;

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(B)I", line = 3)
    public final int method359(byte arg0) {
        if (arg0 != -8) {
            field7682 = null;
        }
        field7665++;
        return 0;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IILco;ILqa;ZZ)V", line = 14)
    public final void method394(int arg0, int arg1, class76 arg2, int arg3, class162 arg4, boolean arg5, boolean arg6) {
        if (arg6) {
            field7672++;
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Z)Z", line = 29)
    public final boolean method399(boolean arg0) {
        if (arg0) {
            this.method361(-32);
        }
        field7678++;
        return false;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(B)I", line = 40)
    public final int method354(byte arg0) {
        field7673++;
        int var2 = -84 / ((arg0 - 61) / 53);
        return 0;
    }

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "(ILqa;)V", line = 51)
    public final void method400(int arg0, class162 arg1) {
        field7675++;
        int var3 = 29 % ((-arg0 - 29) / 33);
    }

    @OriginalMember(owner = "client!hd", name = "e", descriptor = "(I)V", line = 65)
    public final void method398(int arg0) {
        field7668++;
        if (arg0 <= 74) {
            field7682 = null;
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(ZI)V", line = 76)
    public static final void method3061(boolean arg0, int arg1) {
        class419.field6125 = arg1;
        field7664++;
        class9 var2 = class223.field3137;
        synchronized (class223.field3137) {
            if (!arg0) {
                return;
            }
            class223.field3137.method67(87);
        }
        class9 var3 = class383.field5390;
        synchronized (class383.field5390) {
            class383.field5390.method67(123);
        }
    }

    @OriginalMember(owner = "client!hd", name = "g", descriptor = "(I)V", line = 95)
    public static void method3062(int arg0) {
        field7683 = null;
        if (arg0 != -14199) {
            method3063(50);
        }
        field7674 = null;
        field7682 = null;
        field7677 = null;
    }

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "(I)V", line = 109)
    public final void method361(int arg0) {
        field7663++;
        int var2 = -65 / ((arg0 + 36) / 36);
    }

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(I)Z", line = 118)
    public final boolean method360(int arg0) {
        field7680++;
        if (arg0 < 34) {
            this.method402(null, 126);
        }
        return false;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(I)I", line = 129)
    public final int method355(int arg0) {
        field7671++;
        if (arg0 != 13599) {
            field7683 = null;
        }
        return 0;
    }

    @OriginalMember(owner = "client!hd", name = "<init>", descriptor = "(IIILgf;)V", line = 140)
    public class521(int arg0, int arg1, int arg2, class180 arg3) {
        super(arg0, arg1, arg2, false, false);
        this.field7679 = arg3;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IILqa;)Lc;", line = 151)
    public final class121 method358(int arg0, int arg1, class162 arg2) {
        if (arg0 == 4586) {
            field7676++;
            return null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lqa;III)Z", line = 165)
    public final boolean method403(class162 arg0, int arg1, int arg2, int arg3) {
        field7667++;
        return arg2 == 24130 ? false : false;
    }

    @OriginalMember(owner = "client!hd", name = "h", descriptor = "(I)V", line = 177)
    public static final void method3063(int arg0) {
        if (arg0 != -32357) {
            method3063(100);
        }
        field7666++;
        for (int var1 = 0; var1 < class456.field6661.length; var1++) {
            for (int var2 = 0; var2 < class456.field6661[0].length; var2++) {
                for (int var3 = 0; var3 < class456.field6661[0][0].length; var3++) {
                    class456.field6661[var1][var2][var3] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lqa;I)Lip;", line = 214)
    public final class498 method402(class162 arg0, int arg1) {
        field7670++;
        if (arg1 != 16562) {
            field7683 = null;
        }
        return null;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(ILqa;)V", line = 227)
    public final void method356(int arg0, class162 arg1) {
        field7681++;
        if (arg0 <= 100) {
            field7674 = null;
        }
    }

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(ILqa;)V", line = 240)
    public final void method357(int arg0, class162 arg1) {
        field7669++;
        if (arg0 < 41) {
            this.method360(85);
        }
    }
}
