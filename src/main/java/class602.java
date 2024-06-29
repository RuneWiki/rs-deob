import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public class class602 {

    @OriginalMember(owner = "client!fj", name = "d", descriptor = "Lnj;")
    public static class487 field8882 = new class487("Loading sprites - ", "Lade Sprites - ", "Chargement des sprites - ", "Carregando sprites - ");

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "I")
    public int field8879;

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "I")
    public int field8880;

    @OriginalMember(owner = "client!fj", name = "c", descriptor = "I")
    public int field8881;

    @OriginalMember(owner = "client!fj", name = "e", descriptor = "I")
    public static int field8883;

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(III)Lvf;", line = 5)
    public static final class73 method3504(int arg0, int arg1, int arg2) {
        class415 var3 = class526.field7777[arg0][arg1][arg2];
        return var3 == null ? null : var3.field5989;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(B)V", line = 15)
    public static void method3505(byte arg0) {
        field8882 = null;
        int var1 = -119 % ((arg0 + 20) / 52);
    }
}
