import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rp")
public class class250 {

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "I")
    public static int field3561 = -1;

    @OriginalMember(owner = "client!rp", name = "d", descriptor = "Liq;")
    public static class362 field3564 = new class362("Loaded config", "Konfig geladen.", "Fichiers config chargés", "Config carregada");

    @OriginalMember(owner = "client!rp", name = "b", descriptor = "I")
    public static int field3562;

    @OriginalMember(owner = "client!rp", name = "c", descriptor = "I")
    public static int field3563;

    @OriginalMember(owner = "client!rp", name = "e", descriptor = "I")
    public int field3565;

    @OriginalMember(owner = "client!rp", name = "g", descriptor = "I")
    public static int field3567;

    @OriginalMember(owner = "client!rp", name = "i", descriptor = "I")
    public static int field3569;

    @OriginalMember(owner = "client!rp", name = "k", descriptor = "Lwl;")
    public class233 field3571;

    @OriginalMember(owner = "client!rp", name = "h", descriptor = "Lrp;")
    public class250 field3568;

    @OriginalMember(owner = "client!rp", name = "f", descriptor = "Ltq;")
    public static class376 field3566;

    @OriginalMember(owner = "client!rp", name = "j", descriptor = "[[[Lak;")
    public static class193[][][] field3570;

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(III)B", line = 3)
    public static final byte method1698(int arg0, int arg1, int arg2) {
        if (arg1 != 2) {
            return 11;
        }
        field3562++;
        if (arg2 == 9) {
            return (byte) ((arg0 & 0x1) == 0 ? 1 : 2);
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(I)V", line = 24)
    public static void method1699(int arg0) {
        field3570 = null;
        if (arg0 == -21321) {
            field3566 = null;
            field3564 = null;
        }
    }

    @OriginalMember(owner = "client!rp", name = "b", descriptor = "(I)V", line = 52)
    public final void method1700(int arg0) {
        field3563++;
        if (arg0 != 9) {
            method1699(62);
        }
        if (class94.field1132 >= 500) {
            return;
        }
        this.field3565 = 0;
        this.field3568 = class441.field6327;
        this.field3571 = null;
        class441.field6327 = this;
        class94.field1132++;
    }
}
