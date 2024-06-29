import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public class class305 {

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "Llo;")
    public static class306 field4871 = new class306("Loading world map - ", "Lade Weltkarte - ", "Chargement de la mappemonde - ", "Carregando mapa-múndi - ");

    @OriginalMember(owner = "client!bj", name = "e", descriptor = "Lpu;")
    public static class411 field4874 = new class411();

    @OriginalMember(owner = "client!bj", name = "f", descriptor = "[I")
    public static int[] field4875 = new int[200];

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "I")
    public static int field4870;

    @OriginalMember(owner = "client!bj", name = "c", descriptor = "I")
    public static int field4872;

    @OriginalMember(owner = "client!bj", name = "d", descriptor = "Lza;")
    public static class491 field4873;

    @OriginalMember(owner = "client!bj", name = "g", descriptor = "Lik;")
    public static class78 field4876;

    static {
        new class306("Loaded world list data", "Liste der Welten geladen", "Liste des serveurs chargée", "Dados da lista de mundos carregados");
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(B)V", line = 6)
    public static final void method1947(byte arg0) {
        field4872++;
        int var1 = -91 / ((78 - arg0) / 46);
        if (!class517.field7654) {
            return;
        }
        while (true) {
            while (class441.field6575.length > class129.field2223) {
                class239 var2 = class441.field6575[class129.field2223];
                if (var2 != null && var2.field4123 == -1) {
                    if (class516.field7640 == null) {
                        class516.field7640 = class491.field7169.method1793(var2.field4119, 15);
                    }
                    int var3 = class516.field7640.field7108;
                    if (var3 == -1) {
                        return;
                    }
                    class129.field2223++;
                    var2.field4123 = var3;
                    class516.field7640 = null;
                } else {
                    class129.field2223++;
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "(B)V", line = 55)
    public static void method1948(byte arg0) {
        field4874 = null;
        field4875 = null;
        if (arg0 < 81) {
            method1948((byte) -46);
        }
        field4873 = null;
        field4871 = null;
        field4876 = null;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(II)I", line = 74)
    public static final int method1949(int arg0, int arg1) {
        if (arg1 != 15767) {
            return -126;
        }
        field4870++;
        int var2 = arg0 & 0x3F;
        int var3 = (arg0 & 0xC8) >> 6;
        if (var2 == 18) {
            if (var3 == 0) {
                return 1;
            }
            if (var3 == 1) {
                return 2;
            }
            if (var3 == 2) {
                return 4;
            }
            if (var3 == 3) {
                return 8;
            }
        } else if (var2 == 19 || var2 == 21) {
            if (var3 == 0) {
                return 16;
            }
            if (var3 == 1) {
                return 32;
            }
            if (var3 == 2) {
                return 64;
            }
            if (var3 == 3) {
                return 128;
            }
        }
        return 0;
    }
}
