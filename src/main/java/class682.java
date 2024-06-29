import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public class class682 implements class264 {

    @OriginalMember(owner = "client!pg", name = "k", descriptor = "I")
    public int field9570;

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "I")
    public int field9561;

    @OriginalMember(owner = "client!pg", name = "g", descriptor = "Lja;")
    public class254 field9566;

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "I")
    public int field9562;

    @OriginalMember(owner = "client!pg", name = "m", descriptor = "Lmea;")
    public class395 field9572;

    @OriginalMember(owner = "client!pg", name = "e", descriptor = "I")
    public static int field9564 = 0;

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "I")
    public static int field9560 = 0;

    @OriginalMember(owner = "client!pg", name = "d", descriptor = "Lui;")
    public static class210 field9563 = new class210(12, 0, 1, 0);

    @OriginalMember(owner = "client!pg", name = "f", descriptor = "I")
    public static int field9565;

    @OriginalMember(owner = "client!pg", name = "h", descriptor = "I")
    public static int field9567;

    @OriginalMember(owner = "client!pg", name = "i", descriptor = "I")
    public static int field9568;

    @OriginalMember(owner = "client!pg", name = "j", descriptor = "I")
    public static int field9569;

    @OriginalMember(owner = "client!pg", name = "l", descriptor = "I")
    public static int field9571;

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(BLk;Lri;)V", line = 7)
    public static final void method3881(byte arg0, class525 arg1, class97 arg2) {
        field9569++;
        class672.field9475 = arg2;
        class542.field7901 = arg1;
        class498.field7312 = "";
        if (class402.field6210.startsWith("win")) {
            class498.field7312 = class498.field7312 + "windows/";
        } else if (class402.field6210.startsWith("linux")) {
            class498.field7312 = class498.field7312 + "linux/";
        } else if (class402.field6210.startsWith("mac")) {
            class498.field7312 = class498.field7312 + "macos/";
        }
        if (arg0 < 85) {
            return;
        }
        if (class542.field7901.field7677) {
            class498.field7312 = class498.field7312 + "msjava/";
        } else if (class402.field6204.startsWith("amd64") || class402.field6204.startsWith("x86_64")) {
            class498.field7312 = class498.field7312 + "x86_64/";
        } else if (class402.field6204.startsWith("i386") || class402.field6204.startsWith("i486") || class402.field6204.startsWith("i586") || class402.field6204.startsWith("x86")) {
            class498.field7312 = class498.field7312 + "x86/";
        } else if (class402.field6204.startsWith("ppc")) {
            class498.field7312 = class498.field7312 + "ppc/";
        } else {
            class498.field7312 = class498.field7312 + "universal/";
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(B)V", line = 58)
    public static void method3882(byte arg0) {
        field9563 = null;
        if (arg0 > -121) {
            method3882((byte) -94);
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "([BIIIII[BII)V", line = 69)
    public static final void method3883(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        field9571++;
        int var9 = -(arg5 >> 2);
        if (arg7 != 22794) {
            method3881((byte) -125, null, null);
        }
        int var10 = -(arg5 & 0x3);
        for (int var11 = -arg1; var11 < 0; var11++) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg8++;
                arg6[var10001] += arg0[arg2++];
                int var14 = arg8++;
                arg6[var14] += arg0[arg2++];
                int var15 = arg8++;
                arg6[var15] += arg0[arg2++];
                int var16 = arg8++;
                arg6[var16] += arg0[arg2++];
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg8++;
                arg6[var10001] += arg0[arg2++];
            }
            arg8 += arg4;
            arg2 += arg3;
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(I)Leu;", line = 116)
    public class444 method1247(int arg0) {
        if (arg0 != 3848) {
            method3881((byte) 99, null, null);
        }
        field9565++;
        return class677.field9527;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(III)Z", line = 136)
    public static final boolean method3884(int arg0, int arg1, int arg2) {
        field9567++;
        if (arg0 != 2048) {
            method3883(null, 111, -35, -119, -106, 42, null, -108, 72);
        }
        return (arg1 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!pg", name = "<init>", descriptor = "(ILja;Lmea;II)V", line = 151)
    public class682(int arg0, class254 arg1, class395 arg2, int arg3, int arg4) {
        this.field9570 = arg0;
        this.field9561 = arg3;
        this.field9566 = arg1;
        this.field9562 = arg4;
        this.field9572 = arg2;
    }
}
