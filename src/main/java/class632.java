import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!raa")
public class class632 extends class175 {

    @OriginalMember(owner = "client!raa", name = "M", descriptor = "Ltq;")
    public static class654 field8550 = new class654("", 14);

    @OriginalMember(owner = "client!raa", name = "O", descriptor = "Z")
    public static boolean field8552 = false;

    @OriginalMember(owner = "client!raa", name = "E", descriptor = "I")
    public static int field8543;

    @OriginalMember(owner = "client!raa", name = "F", descriptor = "I")
    public static int field8544;

    @OriginalMember(owner = "client!raa", name = "G", descriptor = "I")
    private int field8545;

    @OriginalMember(owner = "client!raa", name = "H", descriptor = "I")
    public static int field8546;

    @OriginalMember(owner = "client!raa", name = "I", descriptor = "I")
    private int field8547;

    @OriginalMember(owner = "client!raa", name = "K", descriptor = "I")
    public static int field8548;

    @OriginalMember(owner = "client!raa", name = "L", descriptor = "I")
    private int field8549;

    @OriginalMember(owner = "client!raa", name = "N", descriptor = "I")
    public static int field8551;

    @OriginalMember(owner = "client!raa", name = "g", descriptor = "(I)V")
    public static void method3487(int arg0) {
        field8550 = null;
        if (arg0 != 1408597892) {
            method3487(-117);
        }
    }

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "(ILdt;Z)V")
    public final void method44(int arg0, class254 arg1, boolean arg2) {
        ++field8544;
        if (arg2) {
            method3488(-118, -85, 94, 73);
        }
        if (~arg0 == -1) {
            this.method3489((byte) -106, arg1.method1722(false));
        }
    }

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "(IB)[[I")
    public final int[][] method238(int arg0, byte arg1) {
        ++field8548;
        int[][] var3 = super.field2316.method3602(arg0, (byte) -74);
        if (arg1 >= -47) {
            method3488(-127, 58, 126, 15);
        }
        if (super.field2316.field8746) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; var7 < class598.field8136; ++var7) {
                var4[var7] = this.field8547;
                var5[var7] = this.field8545;
                var6[var7] = this.field8549;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "(IIII)I")
    public static final int method3488(int arg0, int arg1, int arg2, int arg3) {
        ++field8543;
        if ((class328.field4667[arg0][arg3][arg1] & 8) != 0) {
            return 0;
        } else if (~arg0 < -1 && ~(2 & class328.field4667[1][arg3][arg1]) != -1) {
            return arg0 + -1;
        } else {
            if (arg2 <= 95) {
                field8552 = false;
            }
            return arg0;
        }
    }

    @OriginalMember(owner = "client!raa", name = "<init>", descriptor = "(I)V")
    private class632(int arg0) {
        super(0, false);
        this.method3489((byte) -120, arg0);
    }

    @OriginalMember(owner = "client!raa", name = "<init>", descriptor = "()V")
    public class632() {
        this(0);
    }

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "(BI)V")
    private final void method3489(byte arg0, int arg1) {
        if (arg0 > -54) {
            this.method3489((byte) -36, 10);
        }
        this.field8549 = (255 & arg1) << 4;
        this.field8547 = 4080 & arg1 >> 12;
        ++field8546;
        this.field8545 = (65280 & arg1) >> 4;
    }
}
