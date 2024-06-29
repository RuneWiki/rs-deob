import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jp")
public class class228 {

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "Lsk;")
    public static class423 field3485 = new class423("Checking for updates - ", "Suche nach Updates - ", "Vérification des mises à jour - ", "Verificando atualizações - ");

    @OriginalMember(owner = "client!jp", name = "c", descriptor = "[Lho;")
    public static class97[] field3487 = new class97[8];

    @OriginalMember(owner = "client!jp", name = "b", descriptor = "I")
    public static int field3486;

    @OriginalMember(owner = "client!jp", name = "d", descriptor = "I")
    public static int field3488;

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(I)V", line = 7)
    public static void method1373(int arg0) {
        field3487 = null;
        field3485 = null;
        if (arg0 < 76) {
            field3487 = null;
        }
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(IIII)V", line = 22)
    public static final void method1374(int arg0, int arg1, int arg2, int arg3) {
        int var4 = class463.field7116.field2960 * arg1 >> 8;
        field3486++;
        if (arg0 != 15) {
            field3485 = null;
        }
        if (arg2 == -1 && !class127.field2053) {
            class284.method1738(-106);
        } else if (arg2 != -1 && (class338.field5058 != arg2 || !class62.method431(955)) && var4 != 0 && !class127.field2053) {
            class266.method1627(var4, arg2, arg3, 0, false, 92, class471.field7207);
        }
        class338.field5058 = arg2;
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(B)V", line = 52)
    public static final void method1375(byte arg0) {
        field3488++;
        class64 var1 = class230.method1387(0, (byte) 40, 15);
        var1.method446(arg0 - 19984);
        if (arg0 != -49) {
            field3485 = null;
        }
    }
}
