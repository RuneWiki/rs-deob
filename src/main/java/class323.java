import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public class class323 {

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "Lfg;")
    public static class83 field4451 = new class83("Allocated memory", "Zugewiesener Speicher.", "Mémoire attribuée", "Memória alocada");

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "I")
    public static int field4453;

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "Lf;")
    public static class529 field4452;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(I)V", line = 5)
    public static void method1818(int arg0) {
        field4452 = null;
        int var1 = -110 / ((28 - arg0) / 48);
        field4451 = null;
    }
}
