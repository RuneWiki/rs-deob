import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ns")
public abstract class class279 extends class419 {

    @OriginalMember(owner = "client!ns", name = "s", descriptor = "S")
    public short field3691;

    @OriginalMember(owner = "client!ns", name = "v", descriptor = "I")
    public int field3694;

    @OriginalMember(owner = "client!ns", name = "u", descriptor = "Z")
    public boolean field3693;

    @OriginalMember(owner = "client!ns", name = "w", descriptor = "B")
    public byte field3695;

    @OriginalMember(owner = "client!ns", name = "B", descriptor = "I")
    public int field3700;

    @OriginalMember(owner = "client!ns", name = "y", descriptor = "S")
    public short field3697;

    @OriginalMember(owner = "client!ns", name = "p", descriptor = "S")
    public short field3688;

    @OriginalMember(owner = "client!ns", name = "C", descriptor = "B")
    public byte field3701;

    @OriginalMember(owner = "client!ns", name = "z", descriptor = "S")
    public short field3698;

    @OriginalMember(owner = "client!ns", name = "F", descriptor = "I")
    public int field3704;

    @OriginalMember(owner = "client!ns", name = "E", descriptor = "Ljc;")
    public static class305 field3703;

    @OriginalMember(owner = "client!ns", name = "q", descriptor = "I")
    public static int field3689;

    @OriginalMember(owner = "client!ns", name = "r", descriptor = "I")
    public static int field3690;

    @OriginalMember(owner = "client!ns", name = "t", descriptor = "I")
    public int field3692;

    @OriginalMember(owner = "client!ns", name = "x", descriptor = "I")
    public static int field3696;

    @OriginalMember(owner = "client!ns", name = "A", descriptor = "I")
    public static int field3699;

    @OriginalMember(owner = "client!ns", name = "D", descriptor = "Lua;")
    public static class474 field3702;

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(IZ)V")
    public static final void method1689(int arg0, boolean arg1) {
        class162.field2112 = 1000 / arg0;
        if (arg1) {
            method1690(-88);
        }
        field3690++;
    }

    @OriginalMember(owner = "client!ns", name = "e", descriptor = "(I)I")
    public abstract int method132(int arg0);

    @OriginalMember(owner = "client!ns", name = "f", descriptor = "(I)V")
    public static void method1690(int arg0) {
        if (arg0 >= -76) {
            method1689(96, true);
        }
        field3703 = null;
        field3702 = null;
    }

    @OriginalMember(owner = "client!ns", name = "f", descriptor = "(B)V")
    public void method537(byte arg0) {
        field3689++;
        if (arg0 >= -33) {
            method1691(null, false);
        }
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(Lns;Z)Z")
    public static final boolean method1691(class279 arg0, boolean arg1) {
        boolean var2 = class378.field5470 == class152.field1993;
        int var3 = 0;
        short var4 = 0;
        byte var5 = 0;
        arg0.method537((byte) -45);
        if (arg0.field3698 < 0 || arg0.field3688 < 0 || arg0.field3697 >= class515.field7487 || arg0.field3691 >= class114.field1494) {
            return false;
        }
        for (int var6 = arg0.field3698; var6 <= arg0.field3697; var6++) {
            for (int var9 = arg0.field3688; var9 <= arg0.field3691; var9++) {
                class498 var10 = class61.method369(arg0.field3695, var6, var9);
                if (var10 != null) {
                    int var11 = 0;
                    if (var6 > arg0.field3698) {
                        var11++;
                    }
                    if (var6 < arg0.field3697) {
                        var11 += 4;
                    }
                    if (var9 > arg0.field3688) {
                        var11 += 8;
                    }
                    if (var9 < arg0.field3691) {
                        var11 += 2;
                    }
                    class192 var12 = class497.method2993(var11, arg0, (byte) 126);
                    class192 var13 = var10.field7263;
                    if (var13 == null) {
                        var10.field7263 = var12;
                    } else {
                        while (var13.field2469 != null) {
                            var13 = var13.field2469;
                        }
                        var13.field2469 = var12;
                    }
                    var10.field7260 = (byte) (var10.field7260 | var11);
                    if (var2 && (class516.field7502[var6][var9] & 0xFF000000) != 0) {
                        var3 = class516.field7502[var6][var9];
                        var4 = class117.field1534[var6][var9];
                        var5 = class215.field2939[var6][var9];
                    }
                }
            }
        }
        if (var2 && (var3 & 0xFF000000) != 0) {
            for (int var7 = arg0.field3698; var7 <= arg0.field3697; var7++) {
                for (int var8 = arg0.field3688; var8 <= arg0.field3691; var8++) {
                    if ((class516.field7502[var7][var8] & 0xFF000000) == 0) {
                        class516.field7502[var7][var8] = var3;
                        class117.field1534[var7][var8] = var4;
                        class215.field2939[var7][var8] = var5;
                    }
                }
            }
        }
        if (arg1) {
            class447.field6523[class428.field6219++] = arg0;
        }
        return true;
    }

    @OriginalMember(owner = "client!ns", name = "<init>", descriptor = "(IIIIIIIIZB)V")
    public class279(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, byte arg9) {
        this.field3691 = (short) arg7;
        this.field3694 = arg3;
        this.field3693 = arg8;
        this.field3695 = (byte) arg0;
        this.field3700 = arg2;
        this.field3697 = (short) arg5;
        this.field3688 = (short) arg6;
        this.field3701 = arg9;
        this.field3698 = (short) arg4;
        this.field3704 = arg1;
    }

    static {
        new class305("You do not have permission to kick users in this channel.", "Du darfst keine Benutzer aus diesem Chatraum rauswerfen.", "Vous n'êtes pas autorisé à expulser des utilisateurs de ce canal.", "Você não tem permissão para expulsar usuários neste canal.");
        field3703 = new class305("Loading - please wait.", "Ladevorgang - bitte warte.", "Chargement en cours. Veuillez patienter.", "Carregando. Aguarde.");
    }
}
