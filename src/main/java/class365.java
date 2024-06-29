import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class365 {

    @OriginalMember(owner = "client!k", name = "c", descriptor = "I")
    public int field5249;

    @OriginalMember(owner = "client!k", name = "e", descriptor = "Lo;")
    public static class24 field5251 = new class24("WTQA", 2);

    @OriginalMember(owner = "client!k", name = "f", descriptor = "Ldk;")
    public static class326 field5252 = new class326("Loaded world list data", "Liste der Welten geladen", "Liste des serveurs chargée", "Dados da lista de mundos carregados");

    @OriginalMember(owner = "client!k", name = "a", descriptor = "I")
    public static int field5247;

    @OriginalMember(owner = "client!k", name = "b", descriptor = "I")
    public static int field5248;

    @OriginalMember(owner = "client!k", name = "d", descriptor = "I")
    public static int field5250;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(II)Ljava/lang/String;")
    public static final String method2252(int arg0, int arg1) {
        if (arg0 != 20289) {
            return null;
        }
        field5248++;
        String var2 = Integer.toString(arg1);
        for (int var3 = var2.length() - 3; var3 > 0; var3 -= 3) {
            var2 = var2.substring(0, var3) + "," + var2.substring(var3);
        }
        if (var2.length() > 9) {
            return " <col=00ff80>" + var2.substring(0, var2.length() - 8) + class180.field2598.method2065(-127, class326.field4711) + " (" + var2 + ")</col>";
        } else if (var2.length() > 6) {
            return " <col=ffffff>" + var2.substring(0, var2.length() - 4) + class389.field5553.method2065(arg0 - 20414, class326.field4711) + " (" + var2 + ")</col>";
        } else {
            return " <col=ffff00>" + var2 + "</col>";
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(B)V")
    public static void method2253(byte arg0) {
        field5252 = null;
        field5251 = null;
        int var1 = -5 % ((23 - arg0) / 48);
    }

    @OriginalMember(owner = "client!k", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field5250++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(IILdq;II)V")
    public static final void method2254(int arg0, int arg1, class453 arg2, int arg3, int arg4) {
        if (arg1 != 128) {
            field5251 = null;
        }
        field5247++;
        for (class342 var5 = (class342) class99.field1270.method2843(1123227612); var5 != null; var5 = (class342) class99.field1270.method2842(1673506446)) {
            if (var5.field4971 == arg4 && arg0 * 128 == var5.field4988 && arg3 * 128 == var5.field4977 && var5.field4979.field6343 == arg2.field6343) {
                if (var5.field4984 != null) {
                    class59.field796.method2561(var5.field4984);
                    var5.field4984 = null;
                }
                if (var5.field4974 != null) {
                    class59.field796.method2561(var5.field4974);
                    var5.field4974 = null;
                }
                var5.method1510((byte) -13);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!k", name = "<init>", descriptor = "(I)V")
    public class365(int arg0) {
        this.field5249 = arg0;
    }
}
