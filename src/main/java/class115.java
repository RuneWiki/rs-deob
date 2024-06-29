import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ik")
public class class115 {

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "Lpm;")
    public static class349 field1484 = new class349("Please wait...", "Bitte warte...", "Veuillez patienter...", "Aguarde...");

    @OriginalMember(owner = "client!ik", name = "c", descriptor = "Ltj;")
    public static class108 field1486;

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "[I")
    public static int[] field1485;

    @OriginalMember(owner = "client!ik", name = "d", descriptor = "[[[I")
    public static int[][][] field1487;

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(I)V", line = 3)
    public static void method690(int arg0) {
        field1484 = null;
        field1487 = null;
        field1485 = null;
        field1486 = null;
        if (arg0 != 37) {
            method690(-123);
        }
    }
}
