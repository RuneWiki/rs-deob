import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class508 extends class615 {

    @OriginalMember(owner = "client!lb", name = "G", descriptor = "Ljw;")
    public static class520 field6774 = new class520(16);

    @OriginalMember(owner = "client!lb", name = "K", descriptor = "[[I")
    public static int[][] field6778 = new int[][] { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 }, { 2, 0, -1, 1 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 1, 3, -1 }, { -1, 0, 2, -1 }, { 3, 5, 2, 0 }, { 0, 2, 5, 3 }, { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };

    @OriginalMember(owner = "client!lb", name = "J", descriptor = "Ldb;")
    public static class298 field6777 = new class298(21, 12);

    @OriginalMember(owner = "client!lb", name = "L", descriptor = "Lrt;")
    public static class212 field6779 = new class212();

    @OriginalMember(owner = "client!lb", name = "F", descriptor = "I")
    public static int field6773;

    @OriginalMember(owner = "client!lb", name = "H", descriptor = "I")
    public static int field6775;

    @OriginalMember(owner = "client!lb", name = "I", descriptor = "Le;")
    public static class498 field6776;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IB)[I")
    public final int[] method8(int arg0, byte arg1) {
        ++field6775;
        int[] var3 = super.field8125.method298(arg0, -124);
        if (arg1 != -18) {
            this.method8(110, (byte) 41);
        }
        if (super.field8125.field579) {
            int[][] var4 = this.method3368(true, 0, arg0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            for (int var8 = 0; ~var8 > ~class505.field6740; ++var8) {
                var3[var8] = (var5[var8] + var6[var8] - -var7[var8]) / 3;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!lb", name = "<init>", descriptor = "()V")
    public class508() {
        super(1, true);
    }

    @OriginalMember(owner = "client!lb", name = "f", descriptor = "(I)V")
    public static final void method2817(int arg0) {
        ++field6773;
        if (arg0 < -8) {
            if (~class409.field5528 == -2 || class409.field5528 == 3 || class409.field5528 != class105.field1569 && (class409.field5528 == 0 || ~class105.field1569 == -1)) {
                class176.field2705 = 0;
                class92.field1396 = 0;
                class616.field8143.method2916((byte) 86);
            }
            class105.field1569 = class409.field5528;
        }
    }

    @OriginalMember(owner = "client!lb", name = "d", descriptor = "(B)V")
    public static void method2818(byte arg0) {
        field6777 = null;
        field6778 = null;
        if (arg0 != -25) {
            field6779 = null;
        }
        field6774 = null;
        field6776 = null;
        field6779 = null;
    }
}
