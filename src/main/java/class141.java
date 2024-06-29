import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ik")
public class class141 extends class261 {

    @OriginalMember(owner = "client!ik", name = "n", descriptor = "Los;")
    public static class309 field2341 = new class309("Loaded world map", "Weltkarte geladen", "Mappemonde chargée", "Mapa-múndi carregado");

    @OriginalMember(owner = "client!ik", name = "p", descriptor = "[[[I")
    public static int[][][] field2343;

    @OriginalMember(owner = "client!ik", name = "k", descriptor = "I")
    public int field2338;

    @OriginalMember(owner = "client!ik", name = "l", descriptor = "I")
    public static int field2339;

    @OriginalMember(owner = "client!ik", name = "m", descriptor = "I")
    public static int field2340;

    @OriginalMember(owner = "client!ik", name = "o", descriptor = "I")
    public int field2342;

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "(B)V")
    public static final void method1051(byte arg0) {
        field2340++;
        class189.field3038.method2477(46);
        if (arg0 < 35) {
            field2343 = null;
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(I)V")
    public static void method1052(int arg0) {
        if (arg0 == 2) {
            field2343 = null;
            field2341 = null;
        }
    }

    static {
        new class309("To interact with this please login to a members' server.", "Logg dich auf einer Mitglieder-Welt ein, um damit zu interagieren.", "Veuillez vous connecter à un serveur d'abonnés pour cette interaction.", "Para interagir, acesse um servidor para membros.");
        field2343 = new int[2][][];
    }
}
