import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class418 {

    @OriginalMember(owner = "client!te", name = "a", descriptor = "I")
    private int field6195 = 0;

    @OriginalMember(owner = "client!te", name = "c", descriptor = "Lfe;")
    private class384 field6197;

    @OriginalMember(owner = "client!te", name = "b", descriptor = "I")
    public static int field6196;

    @OriginalMember(owner = "client!te", name = "e", descriptor = "I")
    public static int field6199;

    @OriginalMember(owner = "client!te", name = "d", descriptor = "Lcg;")
    private class86 field6198;

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(B)Lcg;")
    public final class86 method2484(byte arg0) {
        int var2 = 114 / ((-arg0 - 24) / 60);
        this.field6195 = 0;
        field6196++;
        return this.method2485((byte) -124);
    }

    @OriginalMember(owner = "client!te", name = "<init>", descriptor = "(Lfe;)V")
    public class418(class384 arg0) {
        this.field6197 = arg0;
    }

    @OriginalMember(owner = "client!te", name = "b", descriptor = "(B)Lcg;")
    public final class86 method2485(byte arg0) {
        if (arg0 > -87) {
            return null;
        }
        field6199++;
        if (this.field6195 > 0 && this.field6197.field5714[this.field6195 - 1] != this.field6198) {
            class86 var2 = this.field6198;
            this.field6198 = var2.field1179;
            return var2;
        }
        while (this.field6197.field5701 > this.field6195) {
            class86 var3 = this.field6197.field5714[this.field6195++].field1179;
            if (this.field6197.field5714[this.field6195 - 1] != var3) {
                this.field6198 = var3.field1179;
                return var3;
            }
        }
        return null;
    }
}
