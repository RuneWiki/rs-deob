import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bu")
public class class19 extends class539 {

    @OriginalMember(owner = "client!bu", name = "m", descriptor = "[B")
    public byte[] field277;

    @OriginalMember(owner = "client!bu", name = "n", descriptor = "Lsu;")
    public static class192 field278 = new class192();

    @OriginalMember(owner = "client!bu", name = "p", descriptor = "I")
    public static int field280 = -2;

    @OriginalMember(owner = "client!bu", name = "o", descriptor = "I")
    public static int field279;

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(B)V")
    public static void method99(byte arg0) {
        field278 = null;
        if (arg0 != 38) {
            method100(false);
        }
    }

    @OriginalMember(owner = "client!bu", name = "b", descriptor = "(Z)V")
    public static final void method100(boolean arg0) {
        if (arg0) {
            class658.field9266 = class690.field9701;
            class144.field2149 = class581.field8114;
        } else {
            class658.field9266 = class368.field5264;
            class144.field2149 = class31.field369;
        }
        class552.field7467 = class658.field9266.length;
    }

    @OriginalMember(owner = "client!bu", name = "<init>", descriptor = "([B)V")
    public class19(byte[] arg0) {
        this.field277 = arg0;
    }
}
