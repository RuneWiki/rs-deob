import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lu")
public class class427 {

    @OriginalMember(owner = "client!lu", name = "h", descriptor = "I")
    public int field6363 = -1;

    @OriginalMember(owner = "client!lu", name = "i", descriptor = "I")
    public static int field6364 = 1400;

    @OriginalMember(owner = "client!lu", name = "m", descriptor = "Lfp;")
    public static class437 field6368;

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "I")
    public int field6356;

    @OriginalMember(owner = "client!lu", name = "b", descriptor = "I")
    public int field6357;

    @OriginalMember(owner = "client!lu", name = "c", descriptor = "I")
    public int field6358;

    @OriginalMember(owner = "client!lu", name = "d", descriptor = "I")
    public int field6359;

    @OriginalMember(owner = "client!lu", name = "e", descriptor = "I")
    public int field6360;

    @OriginalMember(owner = "client!lu", name = "f", descriptor = "I")
    public int field6361;

    @OriginalMember(owner = "client!lu", name = "g", descriptor = "I")
    public static int field6362;

    @OriginalMember(owner = "client!lu", name = "j", descriptor = "I")
    public int field6365;

    @OriginalMember(owner = "client!lu", name = "k", descriptor = "I")
    public int field6366;

    @OriginalMember(owner = "client!lu", name = "l", descriptor = "I")
    public static int field6367;

    @OriginalMember(owner = "client!lu", name = "n", descriptor = "I")
    public static int field6369;

    static {
        new class347("You are not allowed to join this user's clan channel.", "Du darfst den Chatraum dieses Benutzers nicht betreten.", "Vous n'êtes pas autorisé à rejoindre le canal de clan de cet utilisateur.", "Você não tem permissão para entrar no canal de clã desse usuário.");
        field6368 = new class437(8, 0, 4, 1);
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(I)V", line = 5)
    public static void method2531(int arg0) {
        if (arg0 != 4) {
            field6364 = -63;
        }
        field6368 = null;
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(IB)Z", line = 16)
    public static final boolean method2532(int arg0, byte arg1) {
        field6367++;
        int var2 = 106 / ((57 - arg1) / 55);
        return arg0 == 11 || arg0 == 16 || arg0 == 1008 || arg0 == 17 || arg0 == 22;
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(IIIIZI)I", line = 33)
    public static final int method2533(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        field6362++;
        if (class249.field3405 == null) {
            return 0;
        }
        if (arg3 < 3) {
            int var6 = arg0 >> 7;
            int var7 = arg1 >> 7;
            if (arg5 < 0 || arg2 < 0 || arg5 > (class50.field640 - 1) || class448.field6611 - 1 < arg2) {
                return 0;
            }
            if (var6 < 1 || var7 < 1 || (class50.field640 - 1) < var6 || class448.field6611 - 1 < var7) {
                return 0;
            }
            boolean var8 = (class524.field7736[1][arg0 >> 7][arg1 >> 7] & 0x2) != 0;
            if ((arg0 & 0x7F) == 0) {
                boolean var9 = (class524.field7736[1][var6 - 1][arg1 >> 7] & 0x2) != 0;
                boolean var10 = (class524.field7736[1][var6][arg1 >> 7] & 0x2) != 0;
                if (var9 != var10) {
                    var8 = (class524.field7736[1][arg5][arg2] & 0x2) != 0;
                }
            }
            if ((arg1 & 0x7F) == 0) {
                boolean var11 = (class524.field7736[1][arg0 >> 7][var7 - 1] & 0x2) != 0;
                boolean var12 = (class524.field7736[1][arg0 >> 7][var7] & 0x2) != 0;
                if (var11 != var12) {
                    var8 = (class524.field7736[1][arg5][arg2] & 0x2) != 0;
                }
            }
            if (var8) {
                arg3++;
            }
        }
        if (arg4) {
            field6364 = -107;
        }
        return class249.field3405[arg3].method718(arg0, arg1);
    }
}
