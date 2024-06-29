import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aq")
public class class110 {

    @OriginalMember(owner = "client!aq", name = "c", descriptor = "Lfg;")
    public static class83 field1506;

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "I")
    public static int field1504;

    @OriginalMember(owner = "client!aq", name = "b", descriptor = "I")
    public static int field1505;

    static {
        new class83("Unable to add name - system busy.", "Der Name konnte nicht hinzugefügt werden, das System ist derzeit ausgelastet.", "Impossible d'ajouter un nom - système occupé.", "Não foi possível adicionar o nome. O sistema está ocupado.");
        field1506 = new class83("Loading interfaces - ", "Lade Benutzeroberfläche - ", "Chargement des interfaces - ", "Carregando interfaces - ");
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(B)V", line = 6)
    public static void method711(byte arg0) {
        field1506 = null;
        if (arg0 != -77) {
            method711((byte) 28);
        }
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(IIIIIII)I", line = 17)
    public static final int method712(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if ((arg5 & 0x1) == 1) {
            int var7 = arg4;
            arg4 = arg3;
            arg3 = var7;
        }
        field1504++;
        int var8 = arg1 & 0x3;
        if (var8 == 0) {
            return arg0;
        } else if (var8 == 1) {
            return 1 + 7 - arg4 - arg2;
        } else {
            if (arg6 > -100) {
                method711((byte) -83);
            }
            return var8 == 2 ? 7 + 1 - arg0 - arg3 : arg2;
        }
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(III)I", line = 53)
    public static final int method713(int arg0, int arg1, int arg2) {
        field1505++;
        int var3 = arg0 >>> 24;
        if (arg2 <= 97) {
            method711((byte) 14);
        }
        int var4 = ((arg0 & 0xFF00) * var3 & 0xFF0000 | (arg0 & 0xFF00FF) * var3 & 0xFF00FF00) >>> 8;
        int var5 = 255 - var3;
        return (((arg1 & 0xFF00) * var5 & 0xFF0000 | (arg1 & 0xFF00FF) * var5 & 0xFF00FF00) >>> 8) + var4;
    }
}
