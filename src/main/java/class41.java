import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public class class41 {

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "I")
    public int field604 = 43594;

    @OriginalMember(owner = "client!wg", name = "k", descriptor = "Z")
    public boolean field613 = false;

    @OriginalMember(owner = "client!wg", name = "c", descriptor = "I")
    public int field605 = 443;

    @OriginalMember(owner = "client!wg", name = "f", descriptor = "Lkc;")
    public static class157 field608 = new class157("Choose Option", "Wähl eine Option", "Choisir une option", "Selecionar opção");

    @OriginalMember(owner = "client!wg", name = "h", descriptor = "I")
    public static int field610 = 0;

    @OriginalMember(owner = "client!wg", name = "j", descriptor = "Lhi;")
    public static class45 field612 = new class45(9, -1);

    @OriginalMember(owner = "client!wg", name = "m", descriptor = "I")
    public static int field615 = -1;

    @OriginalMember(owner = "client!wg", name = "n", descriptor = "I")
    public static int field616 = 0;

    @OriginalMember(owner = "client!wg", name = "d", descriptor = "I")
    public static int field606;

    @OriginalMember(owner = "client!wg", name = "e", descriptor = "I")
    public static int field607;

    @OriginalMember(owner = "client!wg", name = "g", descriptor = "I")
    public int field609;

    @OriginalMember(owner = "client!wg", name = "i", descriptor = "I")
    public static int field611;

    @OriginalMember(owner = "client!wg", name = "l", descriptor = "Ldk;")
    public static class421 field614;

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "Ljava/lang/String;")
    public String field603;

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(I)V", line = 3)
    public static void method284(int arg0) {
        field612 = null;
        if (arg0 != 443) {
            method284(43);
        }
        field614 = null;
        field608 = null;
    }

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "(I)I", line = 18)
    public final int method285(int arg0) {
        if (arg0 >= -46) {
            this.field609 = 119;
        }
        field606++;
        return this.field613 ? this.field605 : this.field604;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(Lwg;B)Z", line = 36)
    public final boolean method286(class41 arg0, byte arg1) {
        int var3 = 48 / ((arg1 + 62) / 33);
        field607++;
        if (arg0 == null) {
            return false;
        } else {
            return this.field609 == arg0.field609 && this.field603.equals(arg0.field603);
        }
    }
}
