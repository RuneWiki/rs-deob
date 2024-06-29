import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public class class455 {

    @OriginalMember(owner = "client!wi", name = "i", descriptor = "I")
    public int field6540 = 8;

    @OriginalMember(owner = "client!wi", name = "n", descriptor = "I")
    public int field6545 = 16777215;

    @OriginalMember(owner = "client!wi", name = "g", descriptor = "Ltw;")
    public static class233 field6538 = new class233();

    @OriginalMember(owner = "client!wi", name = "k", descriptor = "[I")
    public static int[] field6542 = new int[13];

    @OriginalMember(owner = "client!wi", name = "l", descriptor = "F")
    public static float field6543;

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "I")
    public int field6532;

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "I")
    public int field6533;

    @OriginalMember(owner = "client!wi", name = "c", descriptor = "I")
    public int field6534;

    @OriginalMember(owner = "client!wi", name = "d", descriptor = "I")
    public static int field6535;

    @OriginalMember(owner = "client!wi", name = "e", descriptor = "I")
    public static int field6536;

    @OriginalMember(owner = "client!wi", name = "f", descriptor = "I")
    public int field6537;

    @OriginalMember(owner = "client!wi", name = "h", descriptor = "I")
    public static int field6539;

    @OriginalMember(owner = "client!wi", name = "m", descriptor = "I")
    public int field6544;

    @OriginalMember(owner = "client!wi", name = "j", descriptor = "Ldi;")
    public static class437 field6541;

    @OriginalMember(owner = "client!wi", name = "o", descriptor = "Z")
    public boolean field6546;

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(I)V", line = 4)
    public static void method2641(int arg0) {
        if (arg0 != -1) {
            method2641(-128);
        }
        field6542 = null;
        field6538 = null;
        field6541 = null;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(Lek;B)V", line = 20)
    public final void method2642(class465 arg0, byte arg1) {
        field6535++;
        if (arg1 > -115) {
            return;
        }
        while (true) {
            int var3 = arg0.method2705(-116);
            if (var3 == 0) {
                return;
            }
            this.method2643(arg0, var3, (byte) -56);
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(Lek;IB)V", line = 51)
    private final void method2643(class465 arg0, int arg1, byte arg2) {
        if (arg1 == 1) {
            this.field6540 = arg0.method2755((byte) -124);
        } else if (arg1 == 2) {
            this.field6546 = true;
        } else if (arg1 == 3) {
            this.field6533 = arg0.method2744(-1);
            this.field6532 = arg0.method2744(-1);
            this.field6534 = arg0.method2744(-1);
        } else if (arg1 == 4) {
            this.field6537 = arg0.method2705(arg2 ^ 0x2E);
        } else if (arg1 == 5) {
            this.field6544 = arg0.method2755((byte) -52);
        } else if (arg1 == 6) {
            this.field6545 = arg0.method2714(true);
        }
        if (arg2 == -56) {
            field6539++;
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(I[FI)[F", line = 105)
    public static final float[] method2644(int arg0, float[] arg1, int arg2) {
        field6536++;
        float[] var3 = new float[arg2];
        class553.method3240(arg1, 0, var3, 0, arg2);
        return arg0 == 12044 ? var3 : null;
    }
}
