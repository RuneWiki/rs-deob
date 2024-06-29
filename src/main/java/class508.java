import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qo")
public class class508 extends class108 {

    @OriginalMember(owner = "client!qo", name = "o", descriptor = "I")
    public int field7085;

    @OriginalMember(owner = "client!qo", name = "r", descriptor = "I")
    public int field7088;

    @OriginalMember(owner = "client!qo", name = "l", descriptor = "I")
    public static int field7082 = 0;

    @OriginalMember(owner = "client!qo", name = "j", descriptor = "[I")
    public static int[] field7080 = new int[64];

    @OriginalMember(owner = "client!qo", name = "m", descriptor = "Let;")
    public static class564 field7083 = new class564(8);

    @OriginalMember(owner = "client!qo", name = "k", descriptor = "I")
    public static int field7081;

    @OriginalMember(owner = "client!qo", name = "n", descriptor = "I")
    public static int field7084;

    @OriginalMember(owner = "client!qo", name = "p", descriptor = "I")
    public static int field7086;

    @OriginalMember(owner = "client!qo", name = "q", descriptor = "[[Ljq;")
    public static class447[][] field7087;

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(Z)V")
    public static void method2841(boolean arg0) {
        field7080 = null;
        field7083 = null;
        field7087 = null;
        if (!arg0) {
            method2841(false);
        }
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(IBI)Z")
    public static final boolean method2842(int arg0, byte arg1, int arg2) {
        if (arg1 == 79) {
            field7086++;
            return class603.method3462(arg2, arg0, (byte) -19) & class99.method552(74, arg0, arg2);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "([BIBIIII)Z")
    public static final boolean method2843(byte[] arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        field7081++;
        int var7 = arg6 % arg4;
        int var8;
        if (var7 == 0) {
            var8 = 0;
        } else {
            var8 = arg4 - var7;
        }
        int var9 = -((arg4 + arg1 - 1) / arg4);
        int var10 = -((arg6 + arg4 - 1) / arg4);
        if (arg2 >= -94) {
            method2841(false);
        }
        for (int var11 = var9; var11 < 0; var11++) {
            for (int var12 = var10; var12 < 0; var12++) {
                if (arg0[arg5] == 0) {
                    return true;
                }
                arg5 += arg4;
            }
            int var13 = arg5 - var8;
            if (arg0[var13 - 1] == 0) {
                return true;
            }
            arg5 = arg3 + var13;
        }
        return false;
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(I)V")
    public static final void method2844(int arg0) {
        field7084++;
        if (class279.field3645.toLowerCase().indexOf("microsoft") == -1) {
            class442.field6085[92] = 74;
            class442.field6085[45] = 26;
            class442.field6085[93] = 43;
            class442.field6085[61] = 27;
            class442.field6085[46] = 72;
            class442.field6085[44] = 71;
            class442.field6085[47] = 73;
            if (class279.field3651 == null) {
                class442.field6085[222] = 59;
                class442.field6085[192] = 58;
            } else {
                class442.field6085[192] = 28;
                class442.field6085[520] = 59;
                class442.field6085[222] = 58;
            }
            class442.field6085[91] = 42;
            class442.field6085[59] = 57;
        } else {
            class442.field6085[219] = 42;
            class442.field6085[223] = 28;
            class442.field6085[188] = 71;
            class442.field6085[187] = 27;
            class442.field6085[186] = 57;
            class442.field6085[189] = 26;
            class442.field6085[220] = 74;
            class442.field6085[192] = 58;
            class442.field6085[190] = 72;
            class442.field6085[191] = 73;
            class442.field6085[221] = 43;
            class442.field6085[222] = 59;
        }
        if (arg0 <= 80) {
            field7087 = null;
        }
    }

    @OriginalMember(owner = "client!qo", name = "<init>", descriptor = "(II)V")
    public class508(int arg0, int arg1) {
        this.field7085 = arg0;
        this.field7088 = arg1;
    }
}
