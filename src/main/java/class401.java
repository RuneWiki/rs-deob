import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cv")
public abstract class class401 extends class89 {

    @OriginalMember(owner = "client!cv", name = "s", descriptor = "I")
    public int field5711;

    @OriginalMember(owner = "client!cv", name = "r", descriptor = "[I")
    public static int[] field5710 = new int[200];

    @OriginalMember(owner = "client!cv", name = "u", descriptor = "J")
    public static long field5713;

    @OriginalMember(owner = "client!cv", name = "w", descriptor = "[I")
    public static int[] field5715;

    @OriginalMember(owner = "client!cv", name = "y", descriptor = "I")
    public static int field5717;

    @OriginalMember(owner = "client!cv", name = "z", descriptor = "Lhd;")
    public static class523 field5718;

    @OriginalMember(owner = "client!cv", name = "x", descriptor = "Lcq;")
    public static class328 field5716;

    @OriginalMember(owner = "client!cv", name = "t", descriptor = "I")
    public static int field5712;

    @OriginalMember(owner = "client!cv", name = "A", descriptor = "I")
    public static int field5719;

    @OriginalMember(owner = "client!cv", name = "v", descriptor = "Lqn;")
    public static class47 field5714;

    @OriginalMember(owner = "client!cv", name = "q", descriptor = "[Ljava/lang/String;")
    public static String[] field5709;

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(B)Z")
    public abstract boolean method645(byte arg0);

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(I)Ljava/lang/Object;")
    public abstract Object method646(int arg0);

    @OriginalMember(owner = "client!cv", name = "f", descriptor = "(I)V")
    public static void method2375(int arg0) {
        if (arg0 != 393216) {
            method2376((byte) -20, 115, 53);
        }
        field5715 = null;
        field5710 = null;
        field5716 = null;
        field5709 = null;
        field5718 = null;
        field5714 = null;
    }

    @OriginalMember(owner = "client!cv", name = "<init>", descriptor = "(I)V")
    public class401(int arg0) {
        this.field5711 = arg0;
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(BII)Z")
    public static final boolean method2376(byte arg0, int arg1, int arg2) {
        if (arg0 != 100) {
            method2375(-124);
        }
        field5712++;
        return (arg2 & 0x60000) != 0 | class279.method1659((byte) -122, arg2, arg1) || class9.method57(arg1, arg2, arg0 ^ 0x53) || class95.method728(arg1, arg2, (byte) -114);
    }

    static {
        new class335("Unable to add friend - unknown player.", "Spieler konnte nicht hinzugefügt werden - Spieler unbekannt.", "Impossible d'ajouter l'ami - joueur inconnu.", "Não foi possível adicionar um amigo - jogador desconhecido.");
        field5713 = 0L;
        field5715 = new int[5];
        field5717 = 13156520;
        field5718 = null;
        field5716 = new class328("", 14);
    }
}
