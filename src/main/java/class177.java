import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public class class177 {

    @OriginalMember(owner = "client!l", name = "c", descriptor = "I")
    public int field2673 = -1;

    @OriginalMember(owner = "client!l", name = "g", descriptor = "Lch;")
    public static class151 field2677 = new class151("Loading...", "Lade...", "Chargement en cours...", "Carregando...");

    @OriginalMember(owner = "client!l", name = "a", descriptor = "I")
    public int field2671;

    @OriginalMember(owner = "client!l", name = "b", descriptor = "I")
    public int field2672;

    @OriginalMember(owner = "client!l", name = "d", descriptor = "I")
    public int field2674;

    @OriginalMember(owner = "client!l", name = "e", descriptor = "I")
    public int field2675;

    @OriginalMember(owner = "client!l", name = "f", descriptor = "I")
    public static int field2676;

    @OriginalMember(owner = "client!l", name = "h", descriptor = "I")
    public int field2678;

    @OriginalMember(owner = "client!l", name = "i", descriptor = "I")
    public int field2679;

    @OriginalMember(owner = "client!l", name = "j", descriptor = "I")
    public int field2680;

    @OriginalMember(owner = "client!l", name = "l", descriptor = "I")
    public static int field2682;

    @OriginalMember(owner = "client!l", name = "m", descriptor = "I")
    public int field2683;

    @OriginalMember(owner = "client!l", name = "n", descriptor = "I")
    public int field2684;

    @OriginalMember(owner = "client!l", name = "o", descriptor = "I")
    public int field2685;

    @OriginalMember(owner = "client!l", name = "k", descriptor = "Ltc;")
    public static class332 field2681;

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(I)V", line = 7)
    public static void method1272(int arg0) {
        if (arg0 == -28948) {
            field2681 = null;
            field2677 = null;
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 40)
    public static final void method1273(String arg0, int arg1) {
        System.out.println("Bad " + arg0 + ", Usage: worldid, <live/rc/wip>, <english/german>, <game0/game1>");
        if (arg1 == -1) {
            field2676++;
            System.exit(1);
        }
    }
}
