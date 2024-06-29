import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nv")
public class class290 {

    @OriginalMember(owner = "client!nv", name = "c", descriptor = "I")
    public int field4365;

    @OriginalMember(owner = "client!nv", name = "b", descriptor = "I")
    public int field4364;

    @OriginalMember(owner = "client!nv", name = "f", descriptor = "I")
    public int field4368;

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "I")
    public int field4363;

    @OriginalMember(owner = "client!nv", name = "d", descriptor = "I")
    public static int field4366;

    @OriginalMember(owner = "client!nv", name = "e", descriptor = "[Lta;")
    public static class145[] field4367;

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(II)Lnv;")
    public final class290 method1866(int arg0, int arg1) {
        if (arg0 != 21796) {
            this.field4368 = 125;
        }
        field4366++;
        return new class290(this.field4365, arg1, this.field4363, this.field4364);
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(I)V")
    public static void method1867(int arg0) {
        field4367 = null;
        if (arg0 <= 65) {
            field4367 = null;
        }
    }

    @OriginalMember(owner = "client!nv", name = "<init>", descriptor = "(IIII)V")
    public class290(int arg0, int arg1, int arg2, int arg3) {
        this.field4365 = arg0;
        this.field4364 = arg3;
        this.field4368 = arg1;
        this.field4363 = arg2;
    }

    static {
        new class234("Loading world list data", "Lade Liste der Welten", "Chargement de la liste des serveurs", "Carregando dados da lista de mundos");
    }
}
