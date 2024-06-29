import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public class class94 {

    @OriginalMember(owner = "client!pj", name = "c", descriptor = "I")
    public int field1264;

    @OriginalMember(owner = "client!pj", name = "d", descriptor = "Lgn;")
    public static class475 field1265 = new class475(39, 15);

    @OriginalMember(owner = "client!pj", name = "e", descriptor = "Z")
    public static boolean field1266 = false;

    @OriginalMember(owner = "client!pj", name = "f", descriptor = "Lwt;")
    public static class194 field1267 = new class194("Loaded world list data", "Liste der Welten geladen", "Liste des serveurs chargée", "Dados da lista de mundos carregados");

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "I")
    public static int field1262;

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "I")
    public static int field1263;

    @OriginalMember(owner = "client!pj", name = "g", descriptor = "Lih;")
    public static class474 field1268;

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(B)V", line = 6)
    public static void method577(byte arg0) {
        if (arg0 >= -84) {
            field1266 = true;
        }
        field1267 = null;
        field1268 = null;
        field1265 = null;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IIB)I", line = 19)
    public static final int method578(int arg0, int arg1, byte arg2) {
        int var3 = 27 / ((arg2 - 54) / 35);
        field1262++;
        int var4 = 1;
        while (arg0 > 1) {
            if ((arg0 & 0x1) != 0) {
                var4 = arg1 * var4;
            }
            arg1 *= arg1;
            arg0 >>= 0x1;
        }
        if (arg0 == 1) {
            return arg1 * var4;
        } else {
            return var4;
        }
    }

    @OriginalMember(owner = "client!pj", name = "toString", descriptor = "()Ljava/lang/String;", line = 45)
    public final String toString() {
        field1263++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!pj", name = "<init>", descriptor = "(I)V", line = 63)
    public class94(int arg0) {
        this.field1264 = arg0;
    }
}
