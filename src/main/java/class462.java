import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public class class462 extends class379 {

    @OriginalMember(owner = "client!fk", name = "t", descriptor = "Lsl;")
    public static class318 field6801 = new class318(40, 3);

    @OriginalMember(owner = "client!fk", name = "j", descriptor = "I")
    public static int field6791;

    @OriginalMember(owner = "client!fk", name = "k", descriptor = "I")
    public static int field6792;

    @OriginalMember(owner = "client!fk", name = "l", descriptor = "I")
    public int field6793;

    @OriginalMember(owner = "client!fk", name = "m", descriptor = "I")
    public static int field6794;

    @OriginalMember(owner = "client!fk", name = "n", descriptor = "I")
    public int field6795;

    @OriginalMember(owner = "client!fk", name = "o", descriptor = "I")
    public int field6796;

    @OriginalMember(owner = "client!fk", name = "p", descriptor = "I")
    public static int field6797;

    @OriginalMember(owner = "client!fk", name = "u", descriptor = "I")
    public static int field6802;

    @OriginalMember(owner = "client!fk", name = "v", descriptor = "I")
    public static int field6803;

    @OriginalMember(owner = "client!fk", name = "q", descriptor = "Lc;")
    public static class122 field6798;

    @OriginalMember(owner = "client!fk", name = "r", descriptor = "Lfi;")
    public class388 field6799;

    @OriginalMember(owner = "client!fk", name = "s", descriptor = "[Lmi;")
    public class341[] field6800;

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(Llh;IIIB)V", line = 4)
    public static final void method2772(class364 arg0, int arg1, int arg2, int arg3, byte arg4) {
        field6797++;
        if (arg2 != 347) {
            return;
        }
        int var5 = arg0.field1777[0];
        int var6 = arg0.field1778[0];
        if (var5 < 0 || class397.field5828 <= var5 || var6 < 0 || class457.field6713 <= var6 || arg1 < 0 || arg1 >= class397.field5828 || arg3 < 0 || class457.field6713 <= arg3) {
            return;
        }
        int var7 = class164.method1162((byte) -79, class455.field6684[arg0.field6328], var5, arg1, 0, arg3, arg0.method963((byte) 127), 0, class75.field1023, 0, true, class371.field5513, var6, 0, -4);
        if (var7 >= 1 && var7 <= 3) {
            for (int var8 = 0; var8 < (var7 - 1); var8++) {
                arg0.method2173(class75.field1023[var8], class371.field5513[var8], (byte) -115, arg4);
            }
        }
    }

    @OriginalMember(owner = "client!fk", name = "c", descriptor = "(I)V", line = 52)
    public static final void method2773(int arg0) {
        field6794++;
        class39.field449 = new class133();
        if (arg0 != 0) {
            method2772(null, 29, 35, 102, (byte) 93);
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(IIILya;)Z", line = 68)
    public final boolean method2774(int arg0, int arg1, int arg2, class38 arg3) {
        field6792++;
        if (arg1 != 0) {
            method2775(-86);
        }
        if (this.field6800 != null) {
            for (int var5 = 0; var5 < this.field6800.length; var5++) {
                if (this.field6800[var5].method2076(arg0, arg2) && this.field6799.method34(arg2, 0, arg3, arg0)) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!fk", name = "d", descriptor = "(I)V", line = 95)
    public static void method2775(int arg0) {
        field6798 = null;
        field6801 = null;
        if (arg0 < 113) {
            field6803 = -25;
        }
    }
}
