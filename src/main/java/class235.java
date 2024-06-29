import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ji")
public class class235 extends class131 {

    @OriginalMember(owner = "client!ji", name = "H", descriptor = "Lct;")
    public static class285 field3429 = new class285(73, 4);

    @OriginalMember(owner = "client!ji", name = "z", descriptor = "I")
    public int field3422;

    @OriginalMember(owner = "client!ji", name = "A", descriptor = "I")
    public static int field3423;

    @OriginalMember(owner = "client!ji", name = "D", descriptor = "I")
    public int field3425;

    @OriginalMember(owner = "client!ji", name = "F", descriptor = "I")
    public static int field3427;

    @OriginalMember(owner = "client!ji", name = "G", descriptor = "I")
    public int field3428;

    @OriginalMember(owner = "client!ji", name = "J", descriptor = "I")
    public static int field3430;

    @OriginalMember(owner = "client!ji", name = "K", descriptor = "I")
    public static int field3431;

    @OriginalMember(owner = "client!ji", name = "C", descriptor = "J")
    public static long field3424;

    @OriginalMember(owner = "client!ji", name = "E", descriptor = "J")
    public long field3426;

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(Z)V")
    public static void method1530(boolean arg0) {
        if (!arg0) {
            method1530(false);
        }
        field3429 = null;
    }

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "(B)I")
    public final int method911(byte arg0) {
        if (arg0 < 36) {
            return 68;
        } else {
            field3423++;
            return this.field3428;
        }
    }

    @OriginalMember(owner = "client!ji", name = "d", descriptor = "(I)I")
    public final int method907(int arg0) {
        field3431++;
        if (arg0 >= -45) {
            this.method910(-67);
        }
        return this.field3422;
    }

    @OriginalMember(owner = "client!ji", name = "f", descriptor = "(I)J")
    public final long method910(int arg0) {
        field3427++;
        return arg0 == 11195 ? this.field3426 : -53L;
    }

    @OriginalMember(owner = "client!ji", name = "g", descriptor = "(I)I")
    public final int method912(int arg0) {
        field3430++;
        if (arg0 != -14721) {
            this.method912(-22);
        }
        return this.field3425;
    }

    static {
        new class332("Changes will take effect on your clan in the next 60 seconds.", "Die Änderungen am Chatraum werden innerhalb von 60 Sekunden gültig.", "Les modifications seront apportées à votre clan dans les prochaines 60 secondes.", "As alterações passarão a valer no seu clã nos próximos 60 segundos.");
    }
}
