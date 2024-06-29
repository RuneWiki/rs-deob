import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ur")
public class class331 {

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "I")
    public int field4807;

    @OriginalMember(owner = "client!ur", name = "b", descriptor = "I")
    public int field4808;

    @OriginalMember(owner = "client!ur", name = "c", descriptor = "I")
    public int field4809;

    @OriginalMember(owner = "client!ur", name = "d", descriptor = "I")
    public static int field4810;

    @OriginalMember(owner = "client!ur", name = "e", descriptor = "I")
    public int field4811;

    @OriginalMember(owner = "client!ur", name = "f", descriptor = "I")
    public int field4812;

    @OriginalMember(owner = "client!ur", name = "g", descriptor = "I")
    public int field4813;

    @OriginalMember(owner = "client!ur", name = "h", descriptor = "I")
    public int field4814;

    @OriginalMember(owner = "client!ur", name = "i", descriptor = "I")
    public int field4815;

    @OriginalMember(owner = "client!ur", name = "j", descriptor = "I")
    public int field4816;

    @OriginalMember(owner = "client!ur", name = "k", descriptor = "I")
    public int field4817;

    @OriginalMember(owner = "client!ur", name = "l", descriptor = "I")
    public static int field4818;

    @OriginalMember(owner = "client!ur", name = "m", descriptor = "I")
    public int field4819;

    @OriginalMember(owner = "client!ur", name = "n", descriptor = "I")
    public int field4820;

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(Lur;Z)Z", line = 12)
    public final boolean method2040(class331 arg0, boolean arg1) {
        field4810++;
        if (this.field4807 == arg0.field4807 && this.field4813 == arg0.field4813 && this.field4812 == arg0.field4812) {
            return true;
        } else {
            if (!arg1) {
                this.method2040(null, true);
            }
            return false;
        }
    }
}
