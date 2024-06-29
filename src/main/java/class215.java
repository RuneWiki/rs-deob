import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vv")
public class class215 {

    @OriginalMember(owner = "client!vv", name = "b", descriptor = "[[Z")
    public static boolean[][] field3398 = new boolean[][] { new boolean[4], { false, true, true, false }, { true, false, true, false }, { true, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, { true, true, false, false }, new boolean[4], { false, true, false, true }, new boolean[4] };

    @OriginalMember(owner = "client!vv", name = "c", descriptor = "[S")
    public static short[] field3399 = new short[] { -4160, -4163, -8256, -8259, 22461 };

    @OriginalMember(owner = "client!vv", name = "g", descriptor = "Los;")
    public static class309 field3403 = new class309("wave2:", "welle2:", "ondulation2:", "onda2:");

    @OriginalMember(owner = "client!vv", name = "h", descriptor = "Los;")
    public static class309 field3404;

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "I")
    public static int field3397;

    @OriginalMember(owner = "client!vv", name = "f", descriptor = "I")
    public static int field3402;

    @OriginalMember(owner = "client!vv", name = "e", descriptor = "Ls;")
    public static class186 field3401;

    @OriginalMember(owner = "client!vv", name = "d", descriptor = "Lrv;")
    public static class73 field3400;

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "(I)V")
    public static void method1446(int arg0) {
        field3401 = null;
        if (arg0 != 22461) {
            method1446(-48);
        }
        field3399 = null;
        field3403 = null;
        field3400 = null;
        field3398 = null;
        field3404 = null;
    }

    static {
        new class309("Login to a members' server to use this object.", "Du musst auf einer Mitglieder-Welt sein, um diesen Gegenstand zu benutzen.", "Connectez-vous à un serveur d'abonnés pour utiliser cet objet.", "Acesse um servidor para membros para usar este objeto.");
        field3404 = new class309("Attack", "Angreifen", "Attaquer", "Atacar");
    }
}
