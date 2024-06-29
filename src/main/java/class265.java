import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class265 extends class8 implements class246 {

    @OriginalMember(owner = "client!kf", name = "w", descriptor = "Lck;")
    public class8 field3382;

    @OriginalMember(owner = "client!kf", name = "H", descriptor = "Z")
    public static boolean field3393 = true;

    @OriginalMember(owner = "client!kf", name = "q", descriptor = "Lvt;")
    public static class344 field3376 = new class344("Profiling", "Profiling", "Profilage", "Profiling");

    @OriginalMember(owner = "client!kf", name = "I", descriptor = "Lbda;")
    public static class401 field3394 = new class401("LOCAL", 4);

    @OriginalMember(owner = "client!kf", name = "o", descriptor = "I")
    public static int field3374;

    @OriginalMember(owner = "client!kf", name = "p", descriptor = "I")
    public static int field3375;

    @OriginalMember(owner = "client!kf", name = "r", descriptor = "I")
    public static int field3377;

    @OriginalMember(owner = "client!kf", name = "s", descriptor = "I")
    public static int field3378;

    @OriginalMember(owner = "client!kf", name = "t", descriptor = "I")
    public static int field3379;

    @OriginalMember(owner = "client!kf", name = "u", descriptor = "I")
    public static int field3380;

    @OriginalMember(owner = "client!kf", name = "v", descriptor = "I")
    public static int field3381;

    @OriginalMember(owner = "client!kf", name = "x", descriptor = "I")
    public static int field3383;

    @OriginalMember(owner = "client!kf", name = "y", descriptor = "I")
    public static int field3384;

    @OriginalMember(owner = "client!kf", name = "z", descriptor = "I")
    public static int field3385;

    @OriginalMember(owner = "client!kf", name = "A", descriptor = "I")
    public static int field3386;

    @OriginalMember(owner = "client!kf", name = "B", descriptor = "I")
    public static int field3387;

    @OriginalMember(owner = "client!kf", name = "C", descriptor = "I")
    public static int field3388;

    @OriginalMember(owner = "client!kf", name = "D", descriptor = "I")
    public static int field3389;

    @OriginalMember(owner = "client!kf", name = "E", descriptor = "I")
    public static int field3390;

    @OriginalMember(owner = "client!kf", name = "F", descriptor = "I")
    public static int field3391;

    @OriginalMember(owner = "client!kf", name = "G", descriptor = "I")
    public static int field3392;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(Lqa;I)V")
    public final void method61(class167 arg0, int arg1) {
        if (arg1 != -9785) {
            this.method59((byte) -32, null);
        }
        field3379++;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(ZLqa;)V")
    public static final void method1633(boolean arg0, class167 arg1) {
        if (arg0) {
            field3394 = null;
        }
        field3387++;
        if (class308.field3942 != class147.field1899.field6358 && class199.field2605 != null && class227.method1436(88, arg1, class147.field1899.field6358)) {
            class308.field3942 = class147.field1899.field6358;
        }
    }

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "(I)I")
    public final int method60(int arg0) {
        field3378++;
        if (arg0 != 1901) {
            field3376 = null;
        }
        return 0;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIILqa;IZLlb;)V")
    public final void method54(int arg0, int arg1, int arg2, class167 arg3, int arg4, boolean arg5, class239 arg6) {
        field3381++;
        if (arg1 <= 67) {
            method1635((byte) -76);
        }
    }

    @OriginalMember(owner = "client!kf", name = "e", descriptor = "(I)Z")
    public final boolean method64(int arg0) {
        field3385++;
        return arg0 == -1 ? false : false;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(BII)Z")
    public static final boolean method1634(byte arg0, int arg1, int arg2) {
        if (arg0 > -127) {
            return true;
        } else {
            field3374++;
            return (arg1 & 0x84080) != 0;
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IILqa;I)Z")
    public final boolean method63(int arg0, int arg1, class167 arg2, int arg3) {
        if (arg3 > -35) {
            field3394 = null;
        }
        field3390++;
        return false;
    }

    @OriginalMember(owner = "client!kf", name = "<init>", descriptor = "(IIIIILck;)V")
    public class265(int arg0, int arg1, int arg2, int arg3, int arg4, class8 arg5) {
        super(arg2, arg3, arg4, class120.method657(49, arg0, arg1));
        this.field3382 = arg5;
    }

    @OriginalMember(owner = "client!kf", name = "e", descriptor = "(B)V")
    public static void method1635(byte arg0) {
        field3376 = null;
        field3394 = null;
        if (arg0 <= 113) {
            field3393 = false;
        }
    }

    @OriginalMember(owner = "client!kf", name = "d", descriptor = "(I)V")
    public final void method65(int arg0) {
        field3391++;
        int var2 = 117 / ((arg0 + 4) / 41);
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IILqa;)Lr;")
    public final class521 method53(int arg0, int arg1, class167 arg2) {
        field3392++;
        if (arg1 != 30307) {
            this.field3382 = null;
        }
        return null;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(B)Z")
    public final boolean method55(byte arg0) {
        field3377++;
        int var2 = 1 % ((-arg0 - 20) / 32);
        return false;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(ILqa;)V")
    public final void method62(int arg0, class167 arg1) {
        if (arg0 != 22132) {
            this.method55((byte) 21);
        }
        field3375++;
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "(B)V")
    public final void method56(byte arg0) {
        if (arg0 != 52) {
            this.method64(85);
        }
        field3380++;
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "(I)I")
    public final int method52(int arg0) {
        if (arg0 != -17817) {
            this.field3382 = null;
        }
        field3386++;
        return 0;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(I)I")
    public final int method57(int arg0) {
        field3383++;
        if (arg0 != -29185) {
            this.method65(-96);
        }
        return 0;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(BLqa;)Lqba;")
    public final class541 method59(byte arg0, class167 arg1) {
        field3384++;
        int var3 = 45 % ((arg0 + 30) / 63);
        return null;
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "(Lqa;I)V")
    public final void method66(class167 arg0, int arg1) {
        field3388++;
        if (arg1 != 0) {
            field3393 = false;
        }
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "(ILqa;)Lud;")
    public final class119 method58(int arg0, class167 arg1) {
        int var3 = -90 % ((4 - arg0) / 47);
        field3389++;
        return this.field3382.method58(-117, arg1);
    }
}
