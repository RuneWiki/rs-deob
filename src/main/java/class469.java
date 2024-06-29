import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public class class469 {

    @OriginalMember(owner = "client!qi", name = "d", descriptor = "I")
    public int field6961 = 2048;

    @OriginalMember(owner = "client!qi", name = "f", descriptor = "I")
    public int field6963 = 2048;

    @OriginalMember(owner = "client!qi", name = "e", descriptor = "I")
    public int field6962 = 0;

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "I")
    public int field6959 = 0;

    @OriginalMember(owner = "client!qi", name = "g", descriptor = "[I")
    public static int[] field6964 = new int[3];

    @OriginalMember(owner = "client!qi", name = "h", descriptor = "Lfr;")
    public static class231 field6965 = new class231(8);

    @OriginalMember(owner = "client!qi", name = "i", descriptor = "Lnk;")
    public static class326 field6966 = new class326(60, -1);

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "I")
    public static int field6958;

    @OriginalMember(owner = "client!qi", name = "c", descriptor = "I")
    public static int field6960;

    @OriginalMember(owner = "client!qi", name = "j", descriptor = "I")
    public static int field6967;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(I)V")
    public static void method2784(int arg0) {
        field6964 = null;
        field6966 = null;
        field6965 = null;
        if (arg0 > -25) {
            method2784(-86);
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(Lia;B)V")
    public final void method2785(class23 arg0, byte arg1) {
        while (true) {
            int var3 = arg0.method126((byte) -94);
            if (var3 == 0) {
                field6958++;
                if (arg1 > -72) {
                    method2784(-35);
                    return;
                }
                return;
            }
            this.method2786(var3, -1, arg0);
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(IILia;)V")
    private final void method2786(int arg0, int arg1, class23 arg2) {
        field6960++;
        if (arg0 == 1) {
            this.field6962 = arg2.method126((byte) -101);
        } else if (arg0 == 2) {
            this.field6963 = arg2.method132(88);
        } else if (arg0 == 3) {
            this.field6961 = arg2.method132(95);
        } else if (arg0 == 4) {
            this.field6959 = arg2.method170(arg1 ^ 0xE2A123BA);
        }
        if (arg1 != -1) {
            this.method2786(68, 76, null);
        }
    }
}
