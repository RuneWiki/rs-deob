import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class341 {

    @OriginalMember(owner = "client!va", name = "b", descriptor = "Lpi;")
    public static class342 field5145 = new class342("Loaded world list data", "Liste der Welten geladen", "Liste des serveurs chargée", "Dados da lista de mundos carregados");

    @OriginalMember(owner = "client!va", name = "c", descriptor = "Lku;")
    public static class254 field5146 = new class254();

    @OriginalMember(owner = "client!va", name = "e", descriptor = "[I")
    public static int[] field5148 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!va", name = "f", descriptor = "I")
    public static int field5149 = 52;

    @OriginalMember(owner = "client!va", name = "a", descriptor = "I")
    public static int field5144;

    @OriginalMember(owner = "client!va", name = "d", descriptor = "I")
    public static int field5147;

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(III)Z", line = 4)
    public static final boolean method2177(int arg0, int arg1, int arg2) {
        int var3 = class504.field7445[arg0][arg1][arg2];
        if (-class183.field2743 == var3) {
            return false;
        } else if (class183.field2743 == var3) {
            return true;
        } else {
            int var4 = arg1 << class426.field6345;
            int var5 = arg2 << class426.field6345;
            if (class14.method91(var4 + 1, class88.field1546[arg0].method376(arg1, arg2), var5 + 1) && class14.method91(class177.field2697 + var4 - 1, class88.field1546[arg0].method376(arg1 + 1, arg2), var5 + 1) && class14.method91(class177.field2697 + var4 - 1, class88.field1546[arg0].method376(arg1 + 1, arg2 + 1), class177.field2697 + var5 - 1) && class14.method91(var4 + 1, class88.field1546[arg0].method376(arg1, arg2 + 1), class177.field2697 + var5 - 1) && class14.method91(class130.field2075 + var4, class88.field1546[arg0].method376(arg1, arg2), var5 + 1) && class14.method91(class177.field2697 + var4 - 1, class88.field1546[arg0].method376(arg1 + 1, arg2), class130.field2075 + var5) && class14.method91(class130.field2075 + var4, class88.field1546[arg0].method376(arg1, arg2 + 1), class177.field2697 + var5 - 1) && class14.method91(class177.field2697 + var4 - 1, class88.field1546[arg0].method376(arg1, arg2), class130.field2075 + var5) && class14.method91(class130.field2075 + var4, class88.field1546[arg0].method376(arg1, arg2), class130.field2075 + var5)) {
                class504.field7445[arg0][arg1][arg2] = class183.field2743;
                return true;
            } else {
                class504.field7445[arg0][arg1][arg2] = -class183.field2743;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!va", name = "b", descriptor = "(III)Z", line = 31)
    public static final boolean method2178(int arg0, int arg1, int arg2) {
        field5144++;
        if (((arg1 & 0x10000) != 0 | class105.method795((byte) -126, arg1, arg0)) || class420.method2539(arg0, (byte) -115, arg1)) {
            return true;
        } else {
            if (arg2 < 16) {
                method2179((byte) 61);
            }
            return (arg0 & 0x37) == 0 && class281.method1797(arg1, arg0, -4542);
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(B)V", line = 47)
    public static void method2179(byte arg0) {
        field5146 = null;
        field5145 = null;
        if (arg0 == 83) {
            field5148 = null;
        }
    }
}
