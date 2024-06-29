import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pv")
public class class63 extends class483 implements class662 {

    @OriginalMember(owner = "client!pv", name = "o", descriptor = "I")
    private int field811;

    @OriginalMember(owner = "client!pv", name = "l", descriptor = "Ljava/lang/String;")
    public static String field808 = "";

    @OriginalMember(owner = "client!pv", name = "r", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field814 = new BigInteger("10001", 16);

    @OriginalMember(owner = "client!pv", name = "j", descriptor = "I")
    public static int field806;

    @OriginalMember(owner = "client!pv", name = "k", descriptor = "I")
    public static int field807;

    @OriginalMember(owner = "client!pv", name = "m", descriptor = "I")
    public static int field809;

    @OriginalMember(owner = "client!pv", name = "n", descriptor = "I")
    public static int field810;

    @OriginalMember(owner = "client!pv", name = "p", descriptor = "I")
    public static int field812;

    @OriginalMember(owner = "client!pv", name = "q", descriptor = "I")
    public static int field813;

    @OriginalMember(owner = "client!pv", name = "s", descriptor = "I")
    public static int field815;

    @OriginalMember(owner = "client!pv", name = "t", descriptor = "I")
    public static int field816;

    @OriginalMember(owner = "client!pv", name = "u", descriptor = "I")
    public static int field817;

    @OriginalMember(owner = "client!pv", name = "v", descriptor = "I")
    public static int field818;

    @OriginalMember(owner = "client!pv", name = "w", descriptor = "[I")
    public static int[] field819;

    @OriginalMember(owner = "client!pv", name = "e", descriptor = "(I)V", line = 5)
    public static void method688(int arg0) {
        if (arg0 < 0) {
            method696((byte) -27, -82);
        }
        field819 = null;
        field808 = null;
        field814 = null;
    }

    @OriginalMember(owner = "client!pv", name = "b", descriptor = "(B)V", line = 21)
    public final void method689(byte arg0) {
        if (arg0 != 112) {
            this.field811 = 106;
        }
        ++field813;
        super.field7093.method842(this, 11906);
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(ZII)Z", line = 32)
    public static final boolean method690(boolean arg0, int arg1, int arg2) {
        if (arg0) {
            field814 = null;
        }
        ++field816;
        return ~(384 & arg1) != -1;
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(B)I", line = 45)
    public final int method691(byte arg0) {
        if (arg0 >= -34) {
            this.field811 = 27;
        }
        ++field812;
        return this.field811;
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(FFIF)I", line = 57)
    public static final int method692(float arg0, float arg1, int arg2, float arg3) {
        ++field810;
        if (arg2 <= 62) {
            return 41;
        } else {
            float var4 = !(arg0 < 0.0F) ? arg0 : -arg0;
            float var5 = arg1 < 0.0F ? -arg1 : arg1;
            float var6 = arg3 < 0.0F ? -arg3 : arg3;
            if (var5 > var4 && var6 < var5) {
                return !(arg1 > 0.0F) ? 1 : 0;
            } else if (var4 < var6 && var6 > var5) {
                return !(arg3 > 0.0F) ? 3 : 2;
            } else {
                return !(arg0 > 0.0F) ? 5 : 4;
            }
        }
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(I)J", line = 103)
    public final long method693(int arg0) {
        if (arg0 != -32459) {
            return -91L;
        } else {
            ++field806;
            return 0L;
        }
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(II[BI)V", line = 120)
    public final void method694(int arg0, int arg1, byte[] arg2, int arg3) {
        this.method2973(arg2, arg0, (byte) -127);
        if (arg1 != 2112) {
            field819 = null;
        }
        ++field809;
        this.field811 = arg3;
    }

    @OriginalMember(owner = "client!pv", name = "b", descriptor = "(I)I", line = 133)
    public final int method695(int arg0) {
        ++field807;
        return arg0 != -589 ? -82 : super.field7098;
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(BI)V", line = 144)
    public static final void method696(byte arg0, int arg1) {
        ++field817;
        if (arg0 == -79) {
            class413 var2 = class674.method3852(10, arg1, 122);
            var2.method2634(1065768928);
        }
    }

    @OriginalMember(owner = "client!pv", name = "<init>", descriptor = "(Ler;I[BIZ)V", line = 157)
    public class63(class92 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        super(arg0, 34963, arg2, arg3, arg4);
        this.field811 = arg1;
    }
}
