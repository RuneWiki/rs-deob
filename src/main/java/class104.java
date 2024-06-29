import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gm")
public class class104 {

    @OriginalMember(owner = "client!gm", name = "c", descriptor = "Lcea;")
    public static class180 field1268 = new class180("Loaded JAGGL", "JAGGL geladen", "JAGGL chargé", "JAGGL carregado");

    @OriginalMember(owner = "client!gm", name = "d", descriptor = "Lih;")
    public static class597 field1269 = new class597();

    @OriginalMember(owner = "client!gm", name = "f", descriptor = "[I")
    public static int[] field1271 = new int[4096];

    @OriginalMember(owner = "client!gm", name = "e", descriptor = "Lft;")
    public static class4 field1270 = new class4();

    @OriginalMember(owner = "client!gm", name = "b", descriptor = "I")
    public static int field1267;

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "Ldn;")
    public static class438 field1266;

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(II)V")
    public static final void method616(int arg0, int arg1) {
        field1267++;
        if (class640.method3678(false, arg0)) {
            class226.method1296(false, class459.field6326[arg0], arg1);
        }
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(I)V")
    public static void method617(int arg0) {
        field1269 = null;
        field1271 = null;
        field1270 = null;
        if (arg0 != 15373) {
            method616(-52, 113);
        }
        field1266 = null;
        field1268 = null;
    }
}
