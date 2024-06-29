import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class214 extends class344 implements class115 {

    @OriginalMember(owner = "client!se", name = "o", descriptor = "Lwe;")
    public class344 field3030;

    @OriginalMember(owner = "client!se", name = "t", descriptor = "Ldv;")
    public static class566 field3035 = new class566(56, -1);

    @OriginalMember(owner = "client!se", name = "E", descriptor = "I")
    public static int field3046 = 0;

    @OriginalMember(owner = "client!se", name = "F", descriptor = "Lcba;")
    public static class471 field3047 = new class471(25, 19);

    @OriginalMember(owner = "client!se", name = "A", descriptor = "F")
    public static float field3042;

    @OriginalMember(owner = "client!se", name = "j", descriptor = "I")
    public static int field3025;

    @OriginalMember(owner = "client!se", name = "k", descriptor = "I")
    public static int field3026;

    @OriginalMember(owner = "client!se", name = "l", descriptor = "I")
    public static int field3027;

    @OriginalMember(owner = "client!se", name = "m", descriptor = "I")
    public static int field3028;

    @OriginalMember(owner = "client!se", name = "n", descriptor = "I")
    public static int field3029;

    @OriginalMember(owner = "client!se", name = "p", descriptor = "I")
    public static int field3031;

    @OriginalMember(owner = "client!se", name = "q", descriptor = "I")
    public static int field3032;

    @OriginalMember(owner = "client!se", name = "r", descriptor = "I")
    public static int field3033;

    @OriginalMember(owner = "client!se", name = "s", descriptor = "I")
    public static int field3034;

    @OriginalMember(owner = "client!se", name = "u", descriptor = "I")
    public static int field3036;

    @OriginalMember(owner = "client!se", name = "v", descriptor = "I")
    public static int field3037;

    @OriginalMember(owner = "client!se", name = "w", descriptor = "I")
    public static int field3038;

    @OriginalMember(owner = "client!se", name = "x", descriptor = "I")
    public static int field3039;

    @OriginalMember(owner = "client!se", name = "y", descriptor = "I")
    public static int field3040;

    @OriginalMember(owner = "client!se", name = "z", descriptor = "I")
    public static int field3041;

    @OriginalMember(owner = "client!se", name = "B", descriptor = "I")
    public static int field3043;

    @OriginalMember(owner = "client!se", name = "D", descriptor = "I")
    public static int field3045;

    @OriginalMember(owner = "client!se", name = "G", descriptor = "I")
    public static int field3048;

    @OriginalMember(owner = "client!se", name = "C", descriptor = "Lfi;")
    public static class477 field3044;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(ILqa;)V")
    public final void method751(int arg0, class207 arg1) {
        if (arg0 >= 0) {
            field3035 = null;
        }
        field3034++;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(ZLqa;)Lnk;")
    public final class611 method490(boolean arg0, class207 arg1) {
        if (arg0) {
            this.method746((byte) -53, null);
        }
        field3036++;
        return this.field3030.method490(arg0, arg1);
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(ZCI)I")
    public static final int method1396(boolean arg0, char arg1, int arg2) {
        field3045++;
        if (arg0) {
            return 115;
        }
        int var3 = arg1 << 4;
        if (Character.isUpperCase(arg1) || Character.isTitleCase(arg1)) {
            arg1 = Character.toLowerCase(arg1);
            var3 = (arg1 << 4) + 1;
        }
        if (arg1 == 'ñ' && arg2 == 0) {
            var3 = 1762;
        }
        return var3;
    }

    @OriginalMember(owner = "client!se", name = "d", descriptor = "(I)Z")
    public final boolean method264(int arg0) {
        field3037++;
        if (arg0 != 1) {
            this.method752(true);
        }
        return false;
    }

    @OriginalMember(owner = "client!se", name = "f", descriptor = "(I)V")
    public final void method262(int arg0) {
        if (arg0 != 1) {
            this.method752(true);
        }
        field3028++;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IZIILjt;ILqa;)V")
    public final void method258(int arg0, boolean arg1, int arg2, int arg3, class87 arg4, int arg5, class207 arg6) {
        field3026++;
        if (arg2 < 79) {
            method1396(false, (char) 65485, 103);
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Lqa;III)Z")
    public final boolean method488(class207 arg0, int arg1, int arg2, int arg3) {
        field3039++;
        if (arg3 != 1) {
            this.method488(null, -120, 58, 87);
        }
        return false;
    }

    @OriginalMember(owner = "client!se", name = "<init>", descriptor = "(IIIIILwe;)V")
    public class214(int arg0, int arg1, int arg2, int arg3, int arg4, class344 arg5) {
        super(arg2, arg3, arg4, class114.method803(arg0, (byte) -18, arg1));
        this.field3030 = arg5;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(I)V")
    public final void method750(int arg0) {
        field3038++;
        if (arg0 <= 88) {
            this.method746((byte) -93, null);
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(III)Z")
    public static final boolean method1397(int arg0, int arg1, int arg2) {
        if (arg1 > -12) {
            method1398((byte) 78);
        }
        field3031++;
        return (arg0 & 0x800) != 0 | class546.method3116(arg0, arg2, (byte) 31) || class191.method1190((byte) -25, arg0, arg2);
    }

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(I)I")
    public final int method749(int arg0) {
        field3029++;
        if (arg0 != 24194) {
            field3027 = -116;
        }
        return 0;
    }

    @OriginalMember(owner = "client!se", name = "c", descriptor = "(I)Z")
    public final boolean method747(int arg0) {
        if (arg0 == -23611) {
            field3048++;
            return false;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(B)V")
    public static void method1398(byte arg0) {
        field3035 = null;
        field3047 = null;
        if (arg0 == 9) {
            field3044 = null;
        }
    }

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(ZLqa;)Lvw;")
    public final class254 method483(boolean arg0, class207 arg1) {
        field3025++;
        if (!arg0) {
            this.method488(null, -86, 41, -108);
        }
        return null;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(BLqa;I)Lr;")
    public final class157 method744(byte arg0, class207 arg1, int arg2) {
        field3032++;
        int var4 = 105 / ((arg0 + 54) / 60);
        return null;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(BLqa;)V")
    public final void method746(byte arg0, class207 arg1) {
        if (arg0 <= -50) {
            field3033++;
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Lqa;B)V")
    public final void method487(class207 arg0, byte arg1) {
        if (arg1 != 21) {
            field3035 = null;
        }
        field3043++;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Z)I")
    public final int method748(boolean arg0) {
        if (arg0) {
            return 51;
        } else {
            field3040++;
            return 0;
        }
    }

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(Z)I")
    public final int method752(boolean arg0) {
        field3041++;
        if (!arg0) {
            field3042 = -1.6089952F;
        }
        return 0;
    }
}
