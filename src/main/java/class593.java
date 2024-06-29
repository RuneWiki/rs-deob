import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public class class593 {

    @OriginalMember(owner = "client!th", name = "c", descriptor = "I")
    public int field8317 = 43594;

    @OriginalMember(owner = "client!th", name = "i", descriptor = "I")
    public int field8323 = 443;

    @OriginalMember(owner = "client!th", name = "e", descriptor = "Z")
    private boolean field8319 = false;

    @OriginalMember(owner = "client!th", name = "h", descriptor = "Z")
    private boolean field8322 = true;

    @OriginalMember(owner = "client!th", name = "a", descriptor = "I")
    public static int field8315;

    @OriginalMember(owner = "client!th", name = "b", descriptor = "I")
    public static int field8316;

    @OriginalMember(owner = "client!th", name = "d", descriptor = "I")
    public static int field8318;

    @OriginalMember(owner = "client!th", name = "f", descriptor = "I")
    public static int field8320;

    @OriginalMember(owner = "client!th", name = "j", descriptor = "I")
    public int field8324;

    @OriginalMember(owner = "client!th", name = "g", descriptor = "Ljava/lang/String;")
    public String field8321;

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(Lth;B)Z")
    public final boolean method3400(class593 arg0, byte arg1) {
        if (arg1 > -104) {
            return false;
        }
        field8315++;
        if (arg0 == null) {
            return false;
        } else {
            return this.field8324 == arg0.field8324 && this.field8321.equals(arg0.field8321);
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(I)V")
    public final void method3401(int arg0) {
        field8320++;
        if (arg0 > -98) {
            return;
        }
        if (!this.field8322) {
            this.field8322 = true;
            this.field8319 = true;
        } else if (this.field8319) {
            this.field8319 = false;
        } else {
            this.field8322 = false;
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(BLvk;)Lav;")
    public final class637 method3402(byte arg0, class367 arg1) {
        int var3 = -63 % ((arg0 + 60) / 34);
        field8318++;
        return arg1.method2280(this.field8319, (byte) -86, this.field8321, this.field8322 ? this.field8323 : this.field8317);
    }
}
