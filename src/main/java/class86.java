import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!np")
public class class86 extends class504 {

    @OriginalMember(owner = "client!np", name = "y", descriptor = "I")
    public static int field1350 = 0;

    @OriginalMember(owner = "client!np", name = "F", descriptor = "I")
    public static int field1357;

    @OriginalMember(owner = "client!np", name = "E", descriptor = "[I")
    public static int[] field1356;

    @OriginalMember(owner = "client!np", name = "z", descriptor = "I")
    public int field1351;

    @OriginalMember(owner = "client!np", name = "B", descriptor = "I")
    public static int field1353;

    @OriginalMember(owner = "client!np", name = "C", descriptor = "I")
    public static int field1354;

    @OriginalMember(owner = "client!np", name = "D", descriptor = "I")
    public static int field1355;

    @OriginalMember(owner = "client!np", name = "x", descriptor = "Lur;")
    public class292 field1349;

    @OriginalMember(owner = "client!np", name = "A", descriptor = "[B")
    public byte[] field1352;

    @OriginalMember(owner = "client!np", name = "f", descriptor = "(I)V")
    public static final void method679(int arg0) {
        ++field1353;
        if (class118.field1819) {
            if (arg0 != 20437) {
                method681(-47);
            }
            while (true) {
                while (~class502.field7404 > ~class96.field1495.length) {
                    class152 var1 = class96.field1495[class502.field7404];
                    if (var1 != null && var1.field2314 == -1) {
                        if (class300.field4467 == null) {
                            class300.field4467 = class332.field5150.method387(var1.field2305, (byte) 22);
                        }
                        int var2 = class300.field4467.field1747;
                        if (~var2 == 0) {
                            return;
                        }
                        class300.field4467 = null;
                        ++class502.field7404;
                        var1.field2314 = var2;
                    } else {
                        ++class502.field7404;
                    }
                }
                return;
            }
        }
    }

    @OriginalMember(owner = "client!np", name = "e", descriptor = "(I)I")
    public final int method680(int arg0) {
        int var2 = 124 % ((80 - arg0) / 42);
        ++field1355;
        return super.field7421 ? 0 : 100;
    }

    @OriginalMember(owner = "client!np", name = "g", descriptor = "(I)V")
    public static void method681(int arg0) {
        if (arg0 == 0) {
            field1356 = null;
        }
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(I)[B")
    public final byte[] method682(int arg0) {
        int var2 = -22 / ((arg0 - -38) / 42);
        ++field1354;
        if (super.field7421) {
            throw new RuntimeException();
        } else {
            return this.field1352;
        }
    }

    static {
        new class347("Loading world list data", "Lade Liste der Welten", "Chargement de la liste des serveurs", "Carregando dados da lista de mundos");
        field1357 = 0;
        field1356 = new int[1];
    }
}
