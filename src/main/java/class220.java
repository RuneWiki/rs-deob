import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tk")
public class class220 extends class455 implements class185 {

    @OriginalMember(owner = "client!tk", name = "q", descriptor = "Lab;")
    public class455 field3378;

    @OriginalMember(owner = "client!tk", name = "s", descriptor = "[B")
    public static byte[] field3380 = new byte[520];

    @OriginalMember(owner = "client!tk", name = "D", descriptor = "[I")
    public static int[] field3391 = new int[5];

    @OriginalMember(owner = "client!tk", name = "J", descriptor = "Lft;")
    public static class4 field3397 = new class4();

    @OriginalMember(owner = "client!tk", name = "p", descriptor = "I")
    public static int field3377;

    @OriginalMember(owner = "client!tk", name = "r", descriptor = "I")
    public static int field3379;

    @OriginalMember(owner = "client!tk", name = "u", descriptor = "I")
    public static int field3382;

    @OriginalMember(owner = "client!tk", name = "v", descriptor = "I")
    public static int field3383;

    @OriginalMember(owner = "client!tk", name = "w", descriptor = "I")
    public static int field3384;

    @OriginalMember(owner = "client!tk", name = "x", descriptor = "I")
    public static int field3385;

    @OriginalMember(owner = "client!tk", name = "y", descriptor = "I")
    public static int field3386;

    @OriginalMember(owner = "client!tk", name = "z", descriptor = "I")
    public static int field3387;

    @OriginalMember(owner = "client!tk", name = "A", descriptor = "I")
    public static int field3388;

    @OriginalMember(owner = "client!tk", name = "B", descriptor = "I")
    public static int field3389;

    @OriginalMember(owner = "client!tk", name = "C", descriptor = "I")
    public static int field3390;

    @OriginalMember(owner = "client!tk", name = "E", descriptor = "I")
    public static int field3392;

    @OriginalMember(owner = "client!tk", name = "F", descriptor = "I")
    public static int field3393;

    @OriginalMember(owner = "client!tk", name = "G", descriptor = "I")
    public static int field3394;

    @OriginalMember(owner = "client!tk", name = "H", descriptor = "I")
    public static int field3395;

    @OriginalMember(owner = "client!tk", name = "I", descriptor = "I")
    public static int field3396;

    @OriginalMember(owner = "client!tk", name = "K", descriptor = "I")
    public static int field3398;

    @OriginalMember(owner = "client!tk", name = "L", descriptor = "I")
    public static int field3399;

    @OriginalMember(owner = "client!tk", name = "t", descriptor = "Lls;")
    public static class88 field3381;

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(ZLqq;)V", line = 3)
    public final void method176(boolean arg0, class318 arg1) {
        field3383++;
        if (!arg0) {
            method1343(null, (byte) -47);
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(BLqq;)Lkm;", line = 15)
    public final class227 method169(byte arg0, class318 arg1) {
        if (arg0 >= -11) {
            this.method164(48);
        }
        field3389++;
        return null;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(ILqq;Lps;ZZII)V", line = 30)
    public final void method165(int arg0, class318 arg1, class59 arg2, boolean arg3, boolean arg4, int arg5, int arg6) {
        field3387++;
        if (!arg4) {
            field3399 = 17;
        }
    }

    @OriginalMember(owner = "client!tk", name = "d", descriptor = "(I)Z", line = 40)
    public final boolean method164(int arg0) {
        field3396++;
        if (arg0 != 0) {
            field3399 = 32;
        }
        return false;
    }

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "(I)V", line = 54)
    public final void method163(int arg0) {
        field3377++;
        if (arg0 != 8793) {
            this.method168(-2);
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(Lqq;BII)Z", line = 68)
    public final boolean method162(class318 arg0, byte arg1, int arg2, int arg3) {
        if (arg1 == -44) {
            field3393++;
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!tk", name = "c", descriptor = "(I)I", line = 83)
    public final int method173(int arg0) {
        if (arg0 == 1438) {
            field3388++;
            return 0;
        } else {
            return -125;
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(IFFFI)F", line = 94)
    public static final float method1342(int arg0, float arg1, float arg2, float arg3, int arg4) {
        field3394++;
        float[] var5 = class371.field5441[arg4];
        if (arg0 != 0) {
            field3397 = null;
        }
        return var5[2] * arg1 + var5[1] * arg2 + var5[0] * arg3;
    }

    @OriginalMember(owner = "client!tk", name = "e", descriptor = "(I)V", line = 107)
    public final void method168(int arg0) {
        int var2 = 91 % ((arg0 + 53) / 62);
        field3384++;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(Z)I", line = 118)
    public final int method170(boolean arg0) {
        if (arg0) {
            field3386++;
            return 0;
        } else {
            return 14;
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(Lqq;I)V", line = 132)
    public final void method171(class318 arg0, int arg1) {
        field3398++;
        if (arg1 != 1577) {
            field3380 = null;
        }
    }

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "(ZLqq;)V", line = 142)
    public final void method172(boolean arg0, class318 arg1) {
        field3390++;
        if (arg0) {
            this.method164(-13);
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(B)I", line = 153)
    public final int method174(byte arg0) {
        field3385++;
        if (arg0 <= 113) {
            this.method163(40);
        }
        return 0;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(I)Z", line = 164)
    public final boolean method161(int arg0) {
        field3395++;
        if (arg0 != 15275) {
            field3391 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!tk", name = "<init>", descriptor = "(IIIIILab;)V", line = 176)
    public class220(int arg0, int arg1, int arg2, int arg3, int arg4, class455 arg5) {
        super(arg2, arg3, arg4, class46.method325(arg1, false, arg0));
        this.field3378 = arg5;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(Ljava/lang/String;B)I", line = 187)
    public static final int method1343(String arg0, byte arg1) {
        field3379++;
        if (arg1 != -82) {
            field3380 = null;
        }
        return arg0.length() + 1;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(Lqq;ZI)Lcd;", line = 198)
    public final class198 method167(class318 arg0, boolean arg1, int arg2) {
        if (arg1) {
            field3392 = 101;
        }
        field3382++;
        return null;
    }

    @OriginalMember(owner = "client!tk", name = "g", descriptor = "(I)V", line = 209)
    public static void method1344(int arg0) {
        field3381 = null;
        if (arg0 > -94) {
            method1342(-68, 0.064936385F, -0.0014503F, 1.0067264F, -99);
        }
        field3380 = null;
        field3397 = null;
        field3391 = null;
    }
}
