import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public class class35 {

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "I")
    private int field603 = 0;

    @OriginalMember(owner = "client!cg", name = "k", descriptor = "Ltg;")
    private class277 field613;

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "Llc;")
    public static class143 field604 = class66.method374("b12_full", -1);

    @OriginalMember(owner = "client!cg", name = "g", descriptor = "I")
    public static int field609 = 0;

    @OriginalMember(owner = "client!cg", name = "m", descriptor = "I")
    public static int field615 = 0;

    @OriginalMember(owner = "client!cg", name = "n", descriptor = "I")
    public static int field616 = 0;

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "I")
    public static int field605;

    @OriginalMember(owner = "client!cg", name = "d", descriptor = "I")
    public static int field606;

    @OriginalMember(owner = "client!cg", name = "e", descriptor = "I")
    public static int field607;

    @OriginalMember(owner = "client!cg", name = "i", descriptor = "I")
    public static int field611;

    @OriginalMember(owner = "client!cg", name = "f", descriptor = "Leh;")
    public static class145 field608;

    @OriginalMember(owner = "client!cg", name = "l", descriptor = "Lje;")
    private class61 field614;

    @OriginalMember(owner = "client!cg", name = "h", descriptor = "[Lvg;")
    public static class230[] field610;

    @OriginalMember(owner = "client!cg", name = "j", descriptor = "[[[B")
    public static byte[][][] field612;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(I)Lje;")
    public final class61 method234(int arg0) {
        this.field603 = 0;
        if (arg0 != 11684) {
            method236(true);
        }
        field607++;
        return this.method235(true);
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(Z)Lje;")
    public final class61 method235(boolean arg0) {
        field606++;
        if (this.field603 > 0 && this.field613.field4890[this.field603 - 1] != this.field614) {
            class61 var2 = this.field614;
            this.field614 = var2.field1164;
            return var2;
        }
        if (!arg0) {
            method236(false);
        }
        while (this.field603 < this.field613.field4886) {
            class61 var3 = this.field613.field4890[this.field603++].field1164;
            if (this.field613.field4890[this.field603 - 1] != var3) {
                this.field614 = var3.field1164;
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "(Z)V")
    public static void method236(boolean arg0) {
        field610 = null;
        field608 = null;
        field612 = null;
        field604 = null;
        if (!arg0) {
            field609 = 8;
        }
    }

    @OriginalMember(owner = "client!cg", name = "<init>", descriptor = "(Ltg;)V")
    public class35(class277 arg0) {
        this.field613 = arg0;
    }
}
