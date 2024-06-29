import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qk")
public class class14 {

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "Lak;")
    public static class234 field204 = new class234("Starting 3D Library", "Starte 3D-Softwarebibliothek.", "Démarrage de la librairie 3D", "Iniciando biblioteca 3D");

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "I")
    public static int field205;

    @OriginalMember(owner = "client!qk", name = "c", descriptor = "I")
    public static int field206;

    static {
        new class234("That user is not in this channel.", "Dieser Benutzer befindet sich nicht in diesem Chatraum.", "Cet utilisateur n'est pas dans ce canal.", "Esse usuário não está no canal.");
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(IIII[Luq;Z)V", line = 5)
    public static final void method100(int arg0, int arg1, int arg2, int arg3, class114[] arg4, boolean arg5) {
        for (int var6 = 0; var6 < arg4.length; var6++) {
            class114 var7 = arg4[var6];
            if (var7 != null && var7.field1700 == arg3) {
                class403.method2519(var7, arg1, arg2, arg5, -1);
                class355.method2231(arg1, (byte) 111, var7, arg2);
                if ((var7.field1594 - var7.field1642) < var7.field1628) {
                    var7.field1628 = var7.field1594 - var7.field1642;
                }
                if (var7.field1628 < 0) {
                    var7.field1628 = 0;
                }
                if (var7.field1735 > (var7.field1709 - var7.field1627)) {
                    var7.field1735 = var7.field1709 - var7.field1627;
                }
                if (var7.field1735 < 0) {
                    var7.field1735 = 0;
                }
                if (var7.field1585 == 0) {
                    class216.method1499((byte) 118, arg5, var7);
                }
            }
        }
        if (arg0 != 12498) {
            method100(107, -27, -65, 100, null, false);
        }
        field206++;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(ILhp;)Lvr;", line = 52)
    public static final class92 method101(int arg0, class217 arg1) {
        if (arg0 == 8823) {
            field205++;
            return new class92(arg1.method1529((byte) 108), arg1.method1529((byte) -118), arg1.method1529((byte) 91), arg1.method1529((byte) -37), arg1.method1548(31529), arg1.method1548(31529), arg1.method1515((byte) 125));
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(B)V", line = 68)
    public static void method102(byte arg0) {
        field204 = null;
        if (arg0 != 92) {
            method100(-61, -119, 83, -22, null, false);
        }
    }
}
