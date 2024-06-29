import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dq")
public class class727 {

    @OriginalMember(owner = "client!dq", name = "q", descriptor = "B")
    public byte field10186;

    @OriginalMember(owner = "client!dq", name = "f", descriptor = "Lhj;")
    public static class596 field10175 = new class596(110, -2);

    @OriginalMember(owner = "client!dq", name = "m", descriptor = "Z")
    public static boolean field10182 = false;

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "I")
    public static int field10170;

    @OriginalMember(owner = "client!dq", name = "o", descriptor = "I")
    public static int field10184;

    @OriginalMember(owner = "client!dq", name = "p", descriptor = "I")
    public static int field10185;

    @OriginalMember(owner = "client!dq", name = "e", descriptor = "Lhba;")
    public class10 field10174;

    @OriginalMember(owner = "client!dq", name = "h", descriptor = "Lqja;")
    public class328 field10177;

    @OriginalMember(owner = "client!dq", name = "b", descriptor = "Lbga;")
    public class377 field10171;

    @OriginalMember(owner = "client!dq", name = "l", descriptor = "Lbga;")
    public class377 field10181;

    @OriginalMember(owner = "client!dq", name = "d", descriptor = "Let;")
    public class621 field10173;

    @OriginalMember(owner = "client!dq", name = "r", descriptor = "Let;")
    public class621 field10187;

    @OriginalMember(owner = "client!dq", name = "g", descriptor = "Lab;")
    public class699 field10176;

    @OriginalMember(owner = "client!dq", name = "c", descriptor = "Ldq;")
    public class727 field10172;

    @OriginalMember(owner = "client!dq", name = "i", descriptor = "S")
    public short field10178;

    @OriginalMember(owner = "client!dq", name = "j", descriptor = "S")
    public short field10179;

    @OriginalMember(owner = "client!dq", name = "k", descriptor = "S")
    public short field10180;

    @OriginalMember(owner = "client!dq", name = "n", descriptor = "S")
    public short field10183;

    @OriginalMember(owner = "client!dq", name = "<init>", descriptor = "(I)V")
    public class727(int arg0) {
        this.field10186 = (byte) arg0;
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(I)V")
    public static void method4111(int arg0) {
        if (arg0 != -12865) {
            method4111(-34);
        }
        field10175 = null;
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(B)V")
    public final void method4112(byte arg0) {
        if (arg0 != -75) {
            field10175 = null;
        }
        field10170++;
        while (this.field10174 != null) {
            class10 var2 = this.field10174.field186;
            this.field10174.method170(52);
            this.field10174 = var2;
        }
    }
}
