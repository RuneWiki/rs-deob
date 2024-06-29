import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public class class147 {

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "Lbv;")
    public static class567 field2249 = new class567("Loading shaders", "Lade shaders", "Chargement des nuanceurs", "Carregando sombreamento - ");

    @OriginalMember(owner = "client!ci", name = "c", descriptor = "[I")
    public static int[] field2251 = new int[14];

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "[I")
    public static int[] field2250;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(I)V")
    public static void method1069(int arg0) {
        field2250 = null;
        field2251 = null;
        field2249 = null;
        int var1 = 71 / ((arg0 - 32) / 53);
    }
}
