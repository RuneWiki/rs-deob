import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rm")
public class class235 {

    @OriginalMember(owner = "client!rm", name = "e", descriptor = "Lto;")
    public class6 field3458 = new class6();

    @OriginalMember(owner = "client!rm", name = "h", descriptor = "Z")
    public boolean field3461 = false;

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "[I")
    public static int[] field3454 = new int[14];

    @OriginalMember(owner = "client!rm", name = "f", descriptor = "I")
    public static int field3459 = 1;

    @OriginalMember(owner = "client!rm", name = "d", descriptor = "Lpm;")
    public static class349 field3457 = new class349("Your ignore list is full, max of 100.", "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.", "Votre liste noire est pleine (100 noms maximum).", "Sua lista de ignorados está cheia. O máx. é 100.");

    @OriginalMember(owner = "client!rm", name = "j", descriptor = "[S")
    public static short[] field3463 = new short[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

    @OriginalMember(owner = "client!rm", name = "k", descriptor = "[J")
    public static long[] field3464 = new long[32];

    @OriginalMember(owner = "client!rm", name = "i", descriptor = "Lpm;")
    public static class349 field3462 = new class349("Loaded world list data", "Liste der Welten geladen", "Liste des serveurs chargée", "Dados da lista de mundos carregados");

    @OriginalMember(owner = "client!rm", name = "b", descriptor = "I")
    public static int field3455;

    @OriginalMember(owner = "client!rm", name = "c", descriptor = "I")
    public static int field3456;

    @OriginalMember(owner = "client!rm", name = "g", descriptor = "I")
    public int field3460;

    @OriginalMember(owner = "client!rm", name = "l", descriptor = "I")
    public int field3465;

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(III)V")
    public static final void method1617(int arg0, int arg1, int arg2) {
        class198.field2833 = new class15(arg0);
        if (arg2 != 10578) {
            field3459 = -7;
        }
        field3456++;
        class293.field4238 = new class15(arg1);
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(I)V")
    public static void method1618(int arg0) {
        if (arg0 != 137) {
            field3457 = null;
        }
        field3463 = null;
        field3454 = null;
        field3462 = null;
        field3464 = null;
        field3457 = null;
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(IILtj;)Lf;")
    public static final class452 method1619(int arg0, int arg1, class108 arg2) {
        field3455++;
        byte[] var3 = arg2.method645((byte) 80, arg1);
        if (var3 == null) {
            return null;
        } else if (arg0 <= 94) {
            return null;
        } else {
            return new class452(var3);
        }
    }
}
