import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class774 extends class60 {

    @OriginalMember(owner = "client!qc", name = "k", descriptor = "I")
    public static int field10679 = -1;

    @OriginalMember(owner = "client!qc", name = "n", descriptor = "Z")
    public static boolean field10682 = false;

    @OriginalMember(owner = "client!qc", name = "l", descriptor = "I")
    public static int field10680;

    @OriginalMember(owner = "client!qc", name = "m", descriptor = "I")
    public static int field10681;

    @OriginalMember(owner = "client!qc", name = "o", descriptor = "I")
    public static int field10683;

    @OriginalMember(owner = "client!qc", name = "p", descriptor = "I")
    public static int field10684;

    @OriginalMember(owner = "client!qc", name = "q", descriptor = "I")
    public static int field10685;

    @OriginalMember(owner = "client!qc", name = "r", descriptor = "I")
    public static int field10686;

    @OriginalMember(owner = "client!qc", name = "s", descriptor = "I")
    public static int field10687;

    @OriginalMember(owner = "client!qc", name = "t", descriptor = "I")
    public static int field10688;

    @OriginalMember(owner = "client!qc", name = "<init>", descriptor = "(Lhd;)V", line = 5)
    public class774(class773 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(I)I", line = 8)
    public final int method4298(int arg0) {
        if (arg0 != 0) {
            field10679 = 30;
        }
        ++field10687;
        return super.field799;
    }

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "(B)V", line = 19)
    public final void method409(byte arg0) {
        if (super.field798.method4292(-4152) == class421.field5604) {
            super.field799 = 2;
        }
        if (arg0 > -27) {
            field10679 = -61;
        }
        ++field10684;
        if (~super.field799 > -1 || super.field799 > 2) {
            super.field799 = this.method405(false);
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(BI)V", line = 35)
    public final void method407(byte arg0, int arg1) {
        ++field10681;
        int var3 = -109 % ((arg0 - 28) / 50);
        super.field799 = arg1;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "([SB[Ljava/lang/String;)V", line = 49)
    public static final void method4299(short[] arg0, byte arg1, String[] arg2) {
        if (arg1 != 124) {
            method4299((short[]) null, (byte) 98, (String[]) null);
        }
        class616.method3488(arg2.length - 1, arg0, arg2, (byte) -121, 0);
        ++field10685;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Z)I", line = 61)
    public final int method405(boolean arg0) {
        ++field10688;
        return arg0 ? -76 : 1;
    }

    @OriginalMember(owner = "client!qc", name = "<init>", descriptor = "(ILhd;)V", line = 78)
    public class774(int arg0, class773 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "(B)V", line = 84)
    public static final void method4300(byte arg0) {
        class434.field5738.method628(class594.field8080);
        ++field10686;
        int var1 = 113 / ((arg0 - -15) / 38);
        class434.field5738.method565(class49.field691, class298.field3561, class699.field9508, class563.field7774);
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIIIIIIIII)Z", line = 95)
    public static final boolean method4301(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field10680;
        if (!class298.method1744((byte) 50, arg1, arg0, arg2)) {
            return false;
        } else {
            int var10 = class650.field8982[2];
            int var11 = class650.field8982[1];
            int var12 = class650.field8982[0];
            if (!class298.method1744((byte) -41, arg8, arg9, arg4)) {
                return false;
            } else {
                int var13 = class650.field8982[2];
                int var14 = class650.field8982[0];
                int var15 = class650.field8982[1];
                if (!class298.method1744((byte) -67, arg7, arg6, arg5)) {
                    return false;
                } else if (arg3 <= 126) {
                    return false;
                } else {
                    int var16 = class650.field8982[0];
                    int var17 = class650.field8982[2];
                    int var18 = class650.field8982[1];
                    return class571.method3314(var15, var10, var13, var12, var16, var11, var14, var18, var17, -17851);
                }
            }
        }
    }

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "(II)I", line = 128)
    public final int method406(int arg0, int arg1) {
        if (arg0 != 0) {
            field10679 = -76;
        }
        ++field10683;
        return 1;
    }
}
