import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mca")
public class class33 {

    @OriginalMember(owner = "client!mca", name = "b", descriptor = "Lmga;")
    public static class739 field528 = new class739(25, 15);

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "I")
    public static int field527;

    @OriginalMember(owner = "client!mca", name = "c", descriptor = "I")
    public static int field529;

    @OriginalMember(owner = "client!mca", name = "d", descriptor = "Laj;")
    public static class333 field530;

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "(II)Z", line = 3)
    public static final boolean method236(int arg0, int arg1) {
        field529++;
        if (arg1 != -1) {
            field528 = null;
        }
        if (arg0 == 13 || arg0 == 58 || arg0 == 23 || arg0 == 17 || arg0 == 1012) {
            return true;
        } else {
            return arg0 == 22 || arg0 == 1008;
        }
    }

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "(Lwc;BIII)V", line = 23)
    public static final void method237(class73 arg0, byte arg1, int arg2, int arg3, int arg4) {
        field527++;
        if (arg3 <= 117) {
            field528 = null;
        }
        int var5 = arg0.field1890[0];
        int var6 = arg0.field1884[0];
        if (var5 < 0 || var5 >= class597.field8132 || var6 < 0 || var6 >= class628.field8800 || arg4 < 0 || arg4 >= class597.field8132 || arg2 < 0 || class628.field8800 <= arg2) {
            return;
        }
        int var7 = class62.method440(arg2, arg0.method655(-125), class30.field453, 0, true, var5, class261.field3872, var6, 0, -100, class514.field7038[arg0.field2250], 0, arg4, -4, 0);
        if (var7 >= 1 && var7 <= 3) {
            for (int var8 = 0; var8 < var7 - 1; var8++) {
                arg0.method640(class261.field3872[var8], arg1, class30.field453[var8], 4);
            }
        }
    }

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "(I)V", line = 62)
    public static void method238(int arg0) {
        if (arg0 <= 36) {
            field530 = null;
        }
        field528 = null;
        field530 = null;
    }
}
