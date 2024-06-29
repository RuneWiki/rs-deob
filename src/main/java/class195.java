import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eo")
public class class195 extends class10 {

    @OriginalMember(owner = "client!eo", name = "h", descriptor = "Lnq;")
    public class322 field2521;

    @OriginalMember(owner = "client!eo", name = "e", descriptor = "I")
    public static int field2518;

    @OriginalMember(owner = "client!eo", name = "f", descriptor = "I")
    public static int field2519;

    @OriginalMember(owner = "client!eo", name = "g", descriptor = "I")
    public static int field2520;

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(IIIILjava/lang/String;III)V")
    public static final void method1207(int arg0, int arg1, int arg2, int arg3, String arg4, int arg5, int arg6, int arg7) {
        field2518++;
        class496 var8 = new class496();
        var8.field7212 = arg1;
        var8.field7205 = arg4;
        if (arg5 != -1) {
            method1209(null, 87, null, (byte) -41, -41, 105, null, null);
        }
        var8.field7202 = arg0;
        var8.field7204 = arg7;
        var8.field7208 = arg6;
        var8.field7207 = arg2;
        var8.field7200 = class163.field2065 + arg3;
        class214.field2754.method2099(var8, 36);
    }

    @OriginalMember(owner = "client!eo", name = "b", descriptor = "(I)[Lbe;")
    public static final class29[] method1208(int arg0) {
        if (arg0 == -4) {
            field2520++;
            return new class29[] { class344.field4405, class141.field1828, class495.field7183 };
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(Lya;ILdt;BIILrp;Lgp;)V")
    public static final void method1209(class38 arg0, int arg1, class160 arg2, byte arg3, int arg4, int arg5, class302 arg6, class36 arg7) {
        field2519++;
        int var8 = arg2.field2031 - (arg1 / 2) - 5;
        int var9 = arg5 + 2;
        if (arg7.field462 != 0) {
            arg0.method364(arg1 + 10, var8, arg5 + 1 - (var9 - (arg6.method1785() * arg4)), var9, (byte) -48, arg7.field462);
        }
        if (arg7.field450 != 0) {
            arg0.method326(1, var8, arg1 + 10, arg7.field450, arg4 * arg6.method1785() + arg5 + 1 - var9, var9);
        }
        int var10 = arg7.field447;
        int var11 = 32 % ((arg3 + 58) / 44);
        if (arg2.field2040 && arg7.field438 != -1) {
            var10 = arg7.field438;
        }
        for (int var12 = 0; var12 < arg4; var12++) {
            String var13 = class315.field4015[var12];
            if ((arg4 - 1) > var12) {
                var13 = var13.substring(0, var13.length() - 4);
            }
            arg6.method1779(arg0, var13, arg2.field2031, arg5, var10, true);
            arg5 += arg6.method1785();
        }
    }

    @OriginalMember(owner = "client!eo", name = "<init>", descriptor = "(Lug;II[B)V")
    public class195(class395 arg0, int arg1, int arg2, byte[] arg3) {
        this.field2521 = class141.method958(arg1, -85, 6406, false, 6406, arg3, arg2, arg0);
        this.field2521.method1578(false, 0, false);
    }

    static {
        new class335("To interact with this please login to a members' server.", "Logg dich auf einer Mitglieder-Welt ein, um damit zu interagieren.", "Veuillez vous connecter à un serveur d'abonnés pour cette interaction.", "Para interagir, acesse um servidor para membros.");
        new class335("Unable to delete name - system busy.", "Name konnte nicht gelöscht werden - Systemfehler.", "Impossible d'effacer le nom - système occupé.", "Não foi possível deletar o nome - sistema ocupado.");
    }
}
