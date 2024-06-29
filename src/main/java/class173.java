import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cl")
public class class173 extends class80 {

    @OriginalMember(owner = "client!cl", name = "J", descriptor = "Lfg;")
    public static class83 field2488 = new class83(" ", ": ", " ", " ");

    @OriginalMember(owner = "client!cl", name = "v", descriptor = "I")
    public int field2474;

    @OriginalMember(owner = "client!cl", name = "A", descriptor = "I")
    public int field2479;

    @OriginalMember(owner = "client!cl", name = "E", descriptor = "I")
    public static int field2483;

    @OriginalMember(owner = "client!cl", name = "F", descriptor = "I")
    public static int field2484;

    @OriginalMember(owner = "client!cl", name = "G", descriptor = "I")
    public int field2485;

    @OriginalMember(owner = "client!cl", name = "H", descriptor = "I")
    public int field2486;

    @OriginalMember(owner = "client!cl", name = "I", descriptor = "I")
    public static int field2487;

    @OriginalMember(owner = "client!cl", name = "B", descriptor = "Lem;")
    public static class149 field2480;

    @OriginalMember(owner = "client!cl", name = "x", descriptor = "Lqo;")
    public class19 field2476;

    @OriginalMember(owner = "client!cl", name = "y", descriptor = "Ljava/lang/String;")
    public String field2477;

    @OriginalMember(owner = "client!cl", name = "z", descriptor = "[I")
    public int[] field2478;

    @OriginalMember(owner = "client!cl", name = "D", descriptor = "[I")
    public int[] field2482;

    @OriginalMember(owner = "client!cl", name = "w", descriptor = "[Lbj;")
    public class159[] field2475;

    @OriginalMember(owner = "client!cl", name = "C", descriptor = "[Ljava/lang/String;")
    public String[] field2481;

    static {
        new class83("You cannot report that person for Staff Impersonation, they are Jagex Staff.", "Diese Person ist ein Jagex-Mitarbeiter!", "Cette personne est un membre du personnel de Jagex, vous ne pouvez pas la signaler pour abus d'identité.", "Você não pode denunciar essa pessoa por tentar se passar por membro da equipe Jagex, pois ela faz parte da equipe.");
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(I)V", line = 4)
    public static final void method1070(int arg0) {
        field2484++;
        class100.field1370 = 0;
        class66.field917 = 0;
        class461.field6709 = 0;
        class299.field4113 = 0;
        int var1 = -120 / ((arg0 - 88) / 33);
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(III)I", line = 16)
    public static final int method1071(int arg0, int arg1, int arg2) {
        if (arg0 == 3) {
            field2487++;
            return arg1 == 1 || arg1 == 3 ? class250.field3482[arg2 & 0x3] : class156.field2228[arg2 & 0x3];
        } else {
            return 41;
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(IIIZIIBII)Z", line = 47)
    public static final boolean method1072(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, byte arg6, int arg7, int arg8) {
        field2483++;
        int var9 = class75.field1089.field372[0];
        int var10 = class75.field1089.field362[0];
        if (var9 < 0 || var9 >= class442.field6435 || var10 < 0 || class232.field3217 <= var10) {
            return false;
        } else if (arg0 >= 0 && class442.field6435 > arg0 && arg8 >= 0 && arg8 < class232.field3217) {
            if (arg6 != 126) {
                method1070(-128);
            }
            int var11 = class282.method1618(var10, arg8, class75.field1089.method167(-1), arg4, arg7, arg3, class242.field3363, 1822767280, class6.field64[class75.field1089.field464], var9, arg1, arg0, arg2, arg5, class247.field3443);
            if (var11 < 1) {
                return false;
            }
            class285.field3824 = class247.field3443[var11 - 1];
            class473.field6909 = class242.field3363[var11 - 1];
            class35.field489 = false;
            class352.method1947(101);
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!cl", name = "c", descriptor = "(B)V", line = 81)
    public static void method1073(byte arg0) {
        if (arg0 != -123) {
            field2488 = null;
        }
        field2488 = null;
        field2480 = null;
    }
}
