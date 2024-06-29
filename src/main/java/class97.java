import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class97 {

    @OriginalMember(owner = "client!g", name = "a", descriptor = "I")
    public static int field1417 = -1;

    @OriginalMember(owner = "client!g", name = "d", descriptor = "[I")
    public static int[] field1420;

    @OriginalMember(owner = "client!g", name = "c", descriptor = "I")
    public static int field1419;

    @OriginalMember(owner = "client!g", name = "e", descriptor = "I")
    public static int field1421;

    @OriginalMember(owner = "client!g", name = "b", descriptor = "Lje;")
    public static class253 field1418;

    static {
        new class206("Now talking in clan channel ", "Chatraum: ", "Vous participez actuellement au canal de clan ", "Falando no canal do clã agora ");
        new class206("Unable to add friend - system busy.", "Der Freund konnte nicht hinzugefügt werden, das System ist derzeit ausgelastet.", "Impossible d'ajouter un ami - système occupé.", "Não foi possível adicionar o amigo. O sistema está ocupado.");
        field1420 = new int[2];
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(Lwm;IIIIIIILgn;IZ)Lgn;", line = 3)
    public static final class456 method600(class364 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class456 arg8, int arg9, boolean arg10) {
        field1421++;
        long var11 = (long) arg4;
        class456 var13 = (class456) class338.field4547.method493((byte) 19, var11);
        short var14 = 1031;
        if (var13 == null) {
            class284 var15 = class346.method2136(0, false, class356.field4916, arg4);
            if (var15 == null) {
                return null;
            }
            var13 = arg0.method2094(var15, var14, class304.field4046, 64, 768);
            class338.field4547.method505(var11, var13, 25);
        }
        class456 var16 = var13.method1893((byte) 2, var14, true);
        if (arg5 != 0) {
            var16.method1865(arg5);
        }
        if (arg6 != 0) {
            var16.method1885(arg6);
        }
        if (arg3 != 0) {
            var16.method1846(arg3);
        }
        if (arg10) {
            method601((byte) -26);
        }
        if (arg7 != 0) {
            var16.method1866(0, arg7, 0);
        }
        return var16;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(B)V", line = 49)
    public static void method601(byte arg0) {
        field1418 = null;
        if (arg0 != 2) {
            method600((class364) null, -77, -92, 109, -24, 4, 97, -61, (class456) null, 53, true);
        }
        field1420 = null;
    }
}
