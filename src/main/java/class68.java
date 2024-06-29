import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public abstract class class68 {

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "I")
    public static int field768 = 0;

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "I")
    public int field769;

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "I")
    public static int field770;

    @OriginalMember(owner = "client!kc", name = "d", descriptor = "I")
    public int field771;

    @OriginalMember(owner = "client!kc", name = "e", descriptor = "I")
    public static int field772;

    @OriginalMember(owner = "client!kc", name = "f", descriptor = "I")
    public static int field773;

    @OriginalMember(owner = "client!kc", name = "g", descriptor = "I")
    public static int field774;

    @OriginalMember(owner = "client!kc", name = "h", descriptor = "I")
    public int field775;

    @OriginalMember(owner = "client!kc", name = "i", descriptor = "I")
    public static int field776;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(I)Z")
    public final boolean method401(int arg0) {
        field776++;
        if (arg0 != -1) {
            this.method402(-31);
        }
        return (this.field769 & 0x8) != 0;
    }

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "(I)Z")
    public final boolean method402(int arg0) {
        if (arg0 == 0) {
            field772++;
            return (this.field769 & 0x1) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lra;Lra;I)V")
    public static final void method403(class57 arg0, class57 arg1, int arg2) {
        class447.field6519 = arg1;
        class272.field3860 = arg0;
        field770++;
        class315.field4486 = class272.field3860.method352(arg2, (byte) -75);
    }

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "(I)Z")
    public final boolean method404(int arg0) {
        if (arg0 != -1) {
            this.method401(115);
        }
        field774++;
        return (this.field769 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(B)Z")
    public final boolean method405(byte arg0) {
        if (arg0 == -128) {
            field773++;
            return (this.field769 & 0x4) != 0;
        } else {
            return true;
        }
    }
}
