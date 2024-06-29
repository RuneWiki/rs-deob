import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ek")
public class class323 extends class59 {

    @OriginalMember(owner = "client!ek", name = "g", descriptor = "Ldk;")
    public static class326 field4660 = new class326("Your ignore list is full, max of 100.", "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.", "Votre liste noire est pleine (100 noms maximum).", "Sua lista de ignorados está cheia. O máx. é 100.");

    @OriginalMember(owner = "client!ek", name = "j", descriptor = "C")
    public char field4663;

    @OriginalMember(owner = "client!ek", name = "l", descriptor = "F")
    public static float field4665;

    @OriginalMember(owner = "client!ek", name = "i", descriptor = "I")
    public static int field4662;

    @OriginalMember(owner = "client!ek", name = "m", descriptor = "I")
    public static int field4666;

    @OriginalMember(owner = "client!ek", name = "n", descriptor = "I")
    public int field4667;

    @OriginalMember(owner = "client!ek", name = "p", descriptor = "I")
    public static int field4669;

    @OriginalMember(owner = "client!ek", name = "q", descriptor = "I")
    public int field4670;

    @OriginalMember(owner = "client!ek", name = "r", descriptor = "I")
    public static int field4671;

    @OriginalMember(owner = "client!ek", name = "s", descriptor = "I")
    public static int field4672;

    @OriginalMember(owner = "client!ek", name = "t", descriptor = "J")
    public long field4673;

    @OriginalMember(owner = "client!ek", name = "o", descriptor = "Lb;")
    public static class201 field4668;

    @OriginalMember(owner = "client!ek", name = "h", descriptor = "Lek;")
    public class323 field4661;

    @OriginalMember(owner = "client!ek", name = "k", descriptor = "Z")
    public boolean field4664;

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(I)Z")
    public final boolean method365(int arg0) {
        field4672++;
        if (arg0 != 0) {
            this.method365(94);
        }
        return this.field4664;
    }

    @OriginalMember(owner = "client!ek", name = "d", descriptor = "(B)I")
    public final int method368(byte arg0) {
        field4671++;
        return arg0 >= -74 ? -120 : this.field4667;
    }

    @OriginalMember(owner = "client!ek", name = "c", descriptor = "(B)C")
    public final char method367(byte arg0) {
        int var2 = -83 / ((62 - arg0) / 51);
        field4669++;
        return this.field4663;
    }

    @OriginalMember(owner = "client!ek", name = "e", descriptor = "(B)J")
    public final long method371(byte arg0) {
        field4662++;
        return arg0 > -5 ? 76L : this.field4673;
    }

    @OriginalMember(owner = "client!ek", name = "c", descriptor = "(I)I")
    public final int method372(int arg0) {
        if (arg0 != 3786) {
            this.method367((byte) -35);
        }
        field4666++;
        return this.field4670;
    }

    @OriginalMember(owner = "client!ek", name = "d", descriptor = "(I)V")
    public static void method2055(int arg0) {
        if (arg0 != -26625) {
            field4668 = null;
        }
        field4668 = null;
        field4660 = null;
    }
}
