import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dl")
public class class55 {

    @OriginalMember(owner = "client!dl", name = "l", descriptor = "I")
    private int field473;

    @OriginalMember(owner = "client!dl", name = "h", descriptor = "I")
    public int field469;

    @OriginalMember(owner = "client!dl", name = "m", descriptor = "B")
    public byte field474;

    @OriginalMember(owner = "client!dl", name = "o", descriptor = "I")
    public int field476;

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "I")
    public int field462;

    @OriginalMember(owner = "client!dl", name = "g", descriptor = "Ldl;")
    public class55 field468;

    @OriginalMember(owner = "client!dl", name = "r", descriptor = "[[I")
    public static int[][] field479 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12, 12, 5 }, { 5, 5, 1, 1 }, { 5, 1, 1, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 12, 12, 12, 12, 12 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 7, 3, 7 }, { 12, 12, 12, 12 } };

    @OriginalMember(owner = "client!dl", name = "d", descriptor = "Lrg;")
    public static class548 field465 = new class548(52, 7);

    @OriginalMember(owner = "client!dl", name = "u", descriptor = "Z")
    public static boolean field482 = false;

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "I")
    public int field463;

    @OriginalMember(owner = "client!dl", name = "c", descriptor = "I")
    public int field464;

    @OriginalMember(owner = "client!dl", name = "e", descriptor = "I")
    public int field466;

    @OriginalMember(owner = "client!dl", name = "f", descriptor = "I")
    public static int field467;

    @OriginalMember(owner = "client!dl", name = "i", descriptor = "I")
    public int field470;

    @OriginalMember(owner = "client!dl", name = "j", descriptor = "I")
    public int field471;

    @OriginalMember(owner = "client!dl", name = "k", descriptor = "I")
    public int field472;

    @OriginalMember(owner = "client!dl", name = "n", descriptor = "I")
    public int field475;

    @OriginalMember(owner = "client!dl", name = "p", descriptor = "I")
    public static int field477;

    @OriginalMember(owner = "client!dl", name = "q", descriptor = "I")
    public int field478;

    @OriginalMember(owner = "client!dl", name = "s", descriptor = "I")
    public int field480;

    @OriginalMember(owner = "client!dl", name = "t", descriptor = "Z")
    public static boolean field481;

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(IIII)Ldl;")
    public final class55 method309(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 != 9) {
            this.method311((byte) -79);
        }
        field477++;
        return new class55(this.field473, arg0, arg3, arg2, this.field474);
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(Z)V")
    public static void method310(boolean arg0) {
        field479 = null;
        if (!arg0) {
            method310(true);
        }
        field465 = null;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(B)Lol;")
    public final class237 method311(byte arg0) {
        field467++;
        if (arg0 > -119) {
            this.field476 = 77;
        }
        return class46.method246(this.field473, (byte) -69);
    }

    @OriginalMember(owner = "client!dl", name = "<init>", descriptor = "(IIIIB)V")
    public class55(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        this.field473 = arg0;
        this.field469 = arg3;
        this.field474 = arg4;
        this.field476 = arg2;
        this.field462 = arg1;
    }

    @OriginalMember(owner = "client!dl", name = "<init>", descriptor = "(Ldl;I)V")
    public class55(class55 arg0, int arg1) {
        this.field468 = arg0;
        this.field476 = this.field468.field476 + arg1;
        this.field462 = this.field468.field462 + arg1;
        this.field474 = this.field468.field474;
        this.field473 = this.field468.field473;
        this.field469 = this.field468.field469 + arg1;
    }

    static {
        new class180("Loaded world list data", "Liste der Welten geladen", "Liste des serveurs chargée", "Dados da lista de mundos carregados");
    }
}
