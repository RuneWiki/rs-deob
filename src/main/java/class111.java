import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aq")
public class class111 extends class223 {

    @OriginalMember(owner = "client!aq", name = "m", descriptor = "Z")
    public boolean field1561 = false;

    @OriginalMember(owner = "client!aq", name = "s", descriptor = "I")
    public int field1567 = -1;

    @OriginalMember(owner = "client!aq", name = "t", descriptor = "Lgk;")
    public static class331 field1568;

    @OriginalMember(owner = "client!aq", name = "v", descriptor = "J")
    public static long field1570;

    @OriginalMember(owner = "client!aq", name = "x", descriptor = "Lib;")
    public static class106 field1572;

    @OriginalMember(owner = "client!aq", name = "y", descriptor = "Lgn;")
    public static class493 field1573;

    @OriginalMember(owner = "client!aq", name = "l", descriptor = "I")
    public int field1560;

    @OriginalMember(owner = "client!aq", name = "n", descriptor = "I")
    public static int field1562;

    @OriginalMember(owner = "client!aq", name = "o", descriptor = "I")
    public static int field1563;

    @OriginalMember(owner = "client!aq", name = "p", descriptor = "I")
    public int field1564;

    @OriginalMember(owner = "client!aq", name = "q", descriptor = "I")
    public static int field1565;

    @OriginalMember(owner = "client!aq", name = "r", descriptor = "I")
    public int field1566;

    @OriginalMember(owner = "client!aq", name = "u", descriptor = "I")
    public int field1569;

    @OriginalMember(owner = "client!aq", name = "w", descriptor = "I")
    public int field1571;

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(IIILrb;Lrb;)V")
    public static final void method903(int arg0, int arg1, int arg2, class235 arg3, class235 arg4) {
        class148 var5 = class453.method2729(arg0, arg1, arg2);
        if (var5 != null) {
            var5.field2098 = arg3;
            var5.field2078 = arg4;
        }
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(IIIBIII)I")
    public static final int method904(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        int var7 = arg2 & 0x3;
        if ((arg1 & 0x1) == 1) {
            int var8 = arg0;
            arg0 = arg4;
            arg4 = var8;
        }
        field1563++;
        if (var7 == 0) {
            return arg5;
        } else if (var7 == 1) {
            return 1 + 7 - arg6 - arg0;
        } else {
            if (arg3 <= 33) {
                field1572 = null;
            }
            return var7 == 2 ? (7 - arg5) + 1 - arg4 : arg6;
        }
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(I)V")
    public static void method905(int arg0) {
        field1572 = null;
        field1573 = null;
        int var1 = 102 / ((-arg0 - 81) / 45);
        field1568 = null;
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(IIII[BII)Z")
    public static final boolean method906(int arg0, int arg1, int arg2, int arg3, byte[] arg4, int arg5, int arg6) {
        if (arg3 > -94) {
            return true;
        }
        field1565++;
        int var7 = arg2 % arg0;
        int var8;
        if (var7 == 0) {
            var8 = 0;
        } else {
            var8 = arg0 - var7;
        }
        int var9 = -((arg0 + arg6 - 1) / arg0);
        int var10 = -((arg2 + arg0 - 1) / arg0);
        for (int var11 = var9; var11 < 0; var11++) {
            for (int var12 = var10; var12 < 0; var12++) {
                if (arg4[arg1] == 0) {
                    return true;
                }
                arg1 += arg0;
            }
            int var13 = arg1 - var8;
            if (arg4[var13 - 1] == 0) {
                return true;
            }
            arg1 = arg5 + var13;
        }
        return false;
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(ILlh;ZI)V")
    public static final void method907(int arg0, class364 arg1, boolean arg2, int arg3) {
        if (arg2) {
            return;
        }
        if (arg1.field1696 == arg3 && arg3 != -1) {
            class267 var4 = class153.field2169.method1585(3, arg3);
            int var5 = var4.field3932;
            if (var5 == 1) {
                arg1.field1729 = arg0;
                arg1.field1758 = 0;
                arg1.field1685 = 0;
                arg1.field1745 = 0;
                arg1.field1742 = 1;
                class20.method183(arg1.field6335, arg1.field1745, arg1.field6328, arg1.field6334, true, var4, class435.field6375 == arg1);
            }
            if (var5 == 2) {
                arg1.field1685 = 0;
            }
        } else if (arg3 == -1 || arg1.field1696 == -1 || class153.field2169.method1585(3, arg3).field3942 >= class153.field2169.method1585(3, arg1.field1696).field3942) {
            arg1.field1745 = 0;
            arg1.field1696 = arg3;
            arg1.field1742 = 1;
            arg1.field1685 = 0;
            arg1.field1758 = 0;
            arg1.field1729 = arg0;
            arg1.field1783 = arg1.field1779;
            if (arg1.field1696 != -1) {
                class20.method183(arg1.field6335, arg1.field1745, arg1.field6328, arg1.field6334, true, class153.field2169.method1585(3, arg1.field1696), class435.field6375 == arg1);
            }
        }
        field1562++;
    }

    @OriginalMember(owner = "client!aq", name = "<init>", descriptor = "(I)V")
    public class111(int arg0) {
        this.field1567 = arg0;
    }

    static {
        new class331("System update in: ", "System-Update in: ", "Mise à jour système dans : ", "Atualização do sistema em: ");
        field1568 = new class331("You can't add yourself to your own friend list.", "Du kannst dich nicht auf deine eigene Freunde-Liste setzen!", "Vous ne pouvez pas ajouter votre nom à votre liste d'amis.", "Você não pode adicionar a si próprio à sua lista de amigos.");
        field1570 = 0L;
        field1572 = new class106(16);
        field1573 = new class493();
    }
}
