import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class26 extends class390 {

    @OriginalMember(owner = "client!vd", name = "k", descriptor = "Lkn;")
    public static class442 field461;

    @OriginalMember(owner = "client!vd", name = "o", descriptor = "Lkn;")
    public static class442 field465;

    @OriginalMember(owner = "client!vd", name = "q", descriptor = "I")
    public static int field467;

    @OriginalMember(owner = "client!vd", name = "j", descriptor = "I")
    public static int field460;

    @OriginalMember(owner = "client!vd", name = "l", descriptor = "I")
    public int field462;

    @OriginalMember(owner = "client!vd", name = "m", descriptor = "I")
    public int field463;

    @OriginalMember(owner = "client!vd", name = "n", descriptor = "I")
    public static int field464;

    @OriginalMember(owner = "client!vd", name = "p", descriptor = "Lnq;")
    public static class268 field466;

    static {
        new class442((String) null, "der Spieler ist momentan nicht verfügbar.", (String) null, (String) null);
        field461 = new class442(" from your friend list first.", " zuerst von deiner Freunde-Liste!", " de votre liste d'amis.", " da sua lista de amigos primeiro.");
        field465 = new class442("Loaded fonts", "Schriftsätze geladen.", "Polices chargées", "Fontes carregadas");
        field467 = 0;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IBLjava/util/Random;)I", line = 18)
    public static final int method299(int arg0, byte arg1, Random arg2) {
        field464++;
        if (arg0 <= 0) {
            throw new IllegalArgumentException();
        } else if (class65.method503(arg0, -1)) {
            return (int) (((long) arg2.nextInt() & 0xFFFFFFFFL) * (long) arg0 >> 32);
        } else {
            int var3 = 1 % ((40 - arg1) / 50);
            int var4 = Integer.MIN_VALUE - ((int) (4294967296L % (long) arg0));
            int var5;
            do {
                var5 = arg2.nextInt();
            } while (var4 <= var5);
            return class149.method1010(var5, arg0, 11);
        }
    }

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "(B)V", line = 46)
    public static void method300(byte arg0) {
        field466 = null;
        field461 = null;
        if (arg0 > -16) {
            field466 = null;
        }
        field465 = null;
    }
}
