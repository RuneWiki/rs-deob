import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public class class32 {

    @OriginalMember(owner = "client!ph", name = "c", descriptor = "[Z")
    public static boolean[] field637 = new boolean[8];

    @OriginalMember(owner = "client!ph", name = "e", descriptor = "[S")
    public static short[] field639 = new short[256];

    @OriginalMember(owner = "client!ph", name = "g", descriptor = "Lij;")
    public static class50 field641 = class78.method578(125, "Clientscript error in: ");

    @OriginalMember(owner = "client!ph", name = "i", descriptor = "[I")
    public static int[] field643 = new int[] { 12543016, 15504954, 15914854, 16773818 };

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "I")
    public static int field636;

    @OriginalMember(owner = "client!ph", name = "f", descriptor = "I")
    public static int field640;

    @OriginalMember(owner = "client!ph", name = "j", descriptor = "I")
    public static int field644;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "J")
    public long field635;

    @OriginalMember(owner = "client!ph", name = "d", descriptor = "Lph;")
    public class32 field638;

    @OriginalMember(owner = "client!ph", name = "h", descriptor = "Lph;")
    public class32 field642;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(I)V")
    public final void method267(int arg0) {
        int var2 = 67 / ((arg0 - 63) / 42);
        field636++;
        if (this.field638 != null) {
            this.field638.field642 = this.field642;
            this.field642.field638 = this.field638;
            this.field642 = null;
            this.field638 = null;
        }
    }

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "(I)V")
    public static void method268(int arg0) {
        field643 = null;
        if (arg0 != 16773818) {
            field641 = null;
        }
        field637 = null;
        field641 = null;
        field639 = null;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(Z)Z")
    public final boolean method269(boolean arg0) {
        if (!arg0) {
            method268(50);
        }
        field640++;
        return this.field638 != null;
    }
}
