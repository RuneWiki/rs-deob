import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vs")
public class class420 {

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "Lak;")
    public static class234 field6265 = new class234("Loading additional fonts - ", "Lade Zusatzschriftarten - ", "Chargement de polices secondaires - ", "Carregando fontes principais - ");

    @OriginalMember(owner = "client!vs", name = "b", descriptor = "I")
    public static int field6266 = 1;

    @OriginalMember(owner = "client!vs", name = "c", descriptor = "I")
    public static int field6267 = 0;

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(B)V")
    public static void method2624(byte arg0) {
        field6265 = null;
        int var1 = -117 % ((-arg0 - 59) / 41);
    }
}
