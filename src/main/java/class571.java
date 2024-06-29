import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class571 extends class502 {

    @OriginalMember(owner = "client!pe", name = "v", descriptor = "I")
    public static int field7587 = -1;

    @OriginalMember(owner = "client!pe", name = "l", descriptor = "I")
    public static int field7577;

    @OriginalMember(owner = "client!pe", name = "n", descriptor = "I")
    public int field7579;

    @OriginalMember(owner = "client!pe", name = "o", descriptor = "I")
    public int field7580;

    @OriginalMember(owner = "client!pe", name = "q", descriptor = "I")
    public static int field7582;

    @OriginalMember(owner = "client!pe", name = "r", descriptor = "I")
    public int field7583;

    @OriginalMember(owner = "client!pe", name = "s", descriptor = "I")
    public static int field7584;

    @OriginalMember(owner = "client!pe", name = "t", descriptor = "I")
    public static int field7585;

    @OriginalMember(owner = "client!pe", name = "u", descriptor = "I")
    public static int field7586;

    @OriginalMember(owner = "client!pe", name = "w", descriptor = "I")
    public static int field7588;

    @OriginalMember(owner = "client!pe", name = "m", descriptor = "Lni;")
    public class487 field7578;

    @OriginalMember(owner = "client!pe", name = "p", descriptor = "[Lot;")
    public class552[] field7581;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(B)Z", line = 5)
    public static final boolean method3136(byte arg0) {
        field7586++;
        if (class32.field525 < 1) {
            return false;
        } else {
            if (arg0 > -37) {
                field7587 = -87;
            }
            return class616.field8169 != class137.field2222 || class150.field2398 >= 2;
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IBLoa;I)Z", line = 20)
    public final boolean method3137(int arg0, byte arg1, class651 arg2, int arg3) {
        field7585++;
        if (this.field7581 != null) {
            for (int var5 = 0; var5 < this.field7581.length; var5++) {
                if (this.field7581[var5].method3063(arg3, arg0) && this.field7578.method149((byte) 60, arg0, arg2, arg3)) {
                    return true;
                }
            }
        }
        int var6 = -89 / ((56 - arg1) / 62);
        return false;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(BLjava/lang/String;)V", line = 48)
    public static final void method3138(byte arg0, String arg1) {
        field7577++;
        System.exit(1);
        if (arg0 != -108) {
            field7582 = 4;
        }
    }

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "(II)I", line = 65)
    public static int method3139(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIIII)V", line = 81)
    public static final void method3140(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field7584++;
        float var5 = (float) class567.field7528 / (float) class567.field7513;
        int var6 = arg4;
        int var7 = arg1;
        if (((float) arg3 > var5)) {
            var7 = (int) ((float) arg4 * var5);
        } else {
            var6 = (int) ((float) arg1 / var5);
        }
        int var8 = arg0 - (arg1 - var7) / 2;
        int var9 = arg2 - (arg4 - var6) / 2;
        class613.field8098 = class567.field7513 * var9 / var6;
        class180.field2749 = class567.field7528 - (class567.field7528 * var8 / var7);
        class615.field8140 = -1;
        class683.field9616 = -1;
        class659.method3693(arg3 + 1289);
    }
}
