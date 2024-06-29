import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tr")
public class class565 extends class649 {

    @OriginalMember(owner = "client!tr", name = "k", descriptor = "I")
    public static int field8010 = 0;

    @OriginalMember(owner = "client!tr", name = "m", descriptor = "Lcr;")
    public static class292 field8012 = new class292("runescape", 0);

    @OriginalMember(owner = "client!tr", name = "o", descriptor = "I")
    public static int field8014 = 0;

    @OriginalMember(owner = "client!tr", name = "q", descriptor = "[I")
    public static int[] field8016 = new int[14];

    @OriginalMember(owner = "client!tr", name = "n", descriptor = "F")
    public static float field8013;

    @OriginalMember(owner = "client!tr", name = "e", descriptor = "I")
    public static int field8004;

    @OriginalMember(owner = "client!tr", name = "f", descriptor = "I")
    public static int field8005;

    @OriginalMember(owner = "client!tr", name = "g", descriptor = "I")
    public static int field8006;

    @OriginalMember(owner = "client!tr", name = "h", descriptor = "I")
    public static int field8007;

    @OriginalMember(owner = "client!tr", name = "i", descriptor = "I")
    public static int field8008;

    @OriginalMember(owner = "client!tr", name = "j", descriptor = "I")
    public static int field8009;

    @OriginalMember(owner = "client!tr", name = "l", descriptor = "I")
    public static int field8011;

    @OriginalMember(owner = "client!tr", name = "p", descriptor = "Lha;")
    public static class544 field8015;

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "([BI[BIIIIII)V", line = 4)
    public static final void method3281(byte[] arg0, int arg1, byte[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg8 != 0) {
            method3281((byte[]) null, -22, (byte[]) null, 77, -49, 64, 16, 7, -81);
        }
        ++field8007;
        int var9 = -(arg5 >> 2);
        int var10 = -(arg5 & 3);
        for (int var11 = -arg3; var11 < 0; ++var11) {
            int var10001;
            for (int var12 = var9; ~var12 > -1; ++var12) {
                var10001 = arg4++;
                arg2[var10001] += arg0[arg6++];
                int var14 = arg4++;
                arg2[var14] += arg0[arg6++];
                int var15 = arg4++;
                arg2[var15] += arg0[arg6++];
                int var16 = arg4++;
                arg2[var16] += arg0[arg6++];
            }
            for (int var13 = var10; var13 < 0; ++var13) {
                var10001 = arg4++;
                arg2[var10001] += arg0[arg6++];
            }
            arg4 += arg7;
            arg6 += arg1;
        }
    }

    @OriginalMember(owner = "client!tr", name = "<init>", descriptor = "(ILhs;)V", line = 48)
    public class565(int arg0, class358 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(IB)V", line = 53)
    public final void method129(int arg0, byte arg1) {
        super.field9223 = arg0;
        ++field8004;
        if (arg1 >= -120) {
            field8010 = 55;
        }
    }

    @OriginalMember(owner = "client!tr", name = "b", descriptor = "(I)V", line = 65)
    public final void method134(int arg0) {
        ++field8008;
        if (arg0 != 1) {
            field8014 = 55;
        }
        if (super.field9224.method2294((byte) -121)) {
            super.field9223 = 2;
        }
        if (super.field9223 < 0 || super.field9223 > 2) {
            super.field9223 = this.method135(71);
        }
    }

    @OriginalMember(owner = "client!tr", name = "c", descriptor = "(I)V", line = 89)
    public static void method3282(int arg0) {
        field8015 = null;
        field8012 = null;
        int var1 = -86 / ((arg0 - 4) / 45);
        field8016 = null;
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(I)I", line = 100)
    public final int method135(int arg0) {
        ++field8005;
        int var2 = -4 / ((-18 - arg0) / 50);
        if (super.field9224.method2294((byte) -118)) {
            return 2;
        } else {
            return super.field9224.field5415.method2000(2) && class695.method3881(super.field9224.field5415.method2004(3), 2) ? 1 : 0;
        }
    }

    @OriginalMember(owner = "client!tr", name = "d", descriptor = "(I)Z", line = 121)
    public final boolean method3283(int arg0) {
        ++field8006;
        if (arg0 != -16181) {
            return true;
        } else {
            return !super.field9224.method2294((byte) -124);
        }
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(II)I", line = 136)
    public final int method133(int arg0, int arg1) {
        ++field8009;
        if (super.field9224.method2294((byte) -108)) {
            return 3;
        } else {
            if (arg0 != 18648) {
                this.method129(-71, (byte) 96);
            }
            return 1;
        }
    }

    @OriginalMember(owner = "client!tr", name = "e", descriptor = "(I)I", line = 151)
    public final int method3284(int arg0) {
        if (arg0 != 3) {
            return -21;
        } else {
            ++field8011;
            return super.field9223;
        }
    }

    @OriginalMember(owner = "client!tr", name = "<init>", descriptor = "(Lhs;)V", line = 163)
    public class565(class358 arg0) {
        super(arg0);
    }
}
