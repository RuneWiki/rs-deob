import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ww")
public class class681 {

    @OriginalMember(owner = "client!ww", name = "c", descriptor = "I")
    public int field9549;

    @OriginalMember(owner = "client!ww", name = "k", descriptor = "I")
    public int field9557;

    @OriginalMember(owner = "client!ww", name = "b", descriptor = "B")
    public byte field9548;

    @OriginalMember(owner = "client!ww", name = "e", descriptor = "I")
    public int field9551;

    @OriginalMember(owner = "client!ww", name = "l", descriptor = "I")
    public int field9558;

    @OriginalMember(owner = "client!ww", name = "h", descriptor = "I")
    public int field9554;

    @OriginalMember(owner = "client!ww", name = "m", descriptor = "I")
    public int field9559;

    @OriginalMember(owner = "client!ww", name = "f", descriptor = "Lpn;")
    public class692 field9552;

    @OriginalMember(owner = "client!ww", name = "d", descriptor = "I")
    public static int field9550;

    @OriginalMember(owner = "client!ww", name = "j", descriptor = "Lmc;")
    public class120 field9556;

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "Lqga;")
    public class169 field9547;

    @OriginalMember(owner = "client!ww", name = "i", descriptor = "Lkg;")
    public class249 field9555;

    @OriginalMember(owner = "client!ww", name = "g", descriptor = "Lqr;")
    public class59 field9553;

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "(I)Z")
    public final boolean method3879(int arg0) {
        if (arg0 != -3) {
            this.field9557 = -73;
        }
        field9550++;
        return this.field9548 == 2 || this.field9548 == 3;
    }

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "(III)Liq;")
    public static final class563 method3880(int arg0, int arg1, int arg2) {
        class252 var3 = class454.field6818[arg0][arg1][arg2];
        return var3 == null ? null : var3.field4029;
    }

    @OriginalMember(owner = "client!ww", name = "<init>", descriptor = "(BIIIIIILpn;)V")
    public class681(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class692 arg7) {
        this.field9549 = arg4;
        this.field9557 = arg5;
        this.field9548 = arg0;
        this.field9551 = arg6;
        this.field9558 = arg1;
        this.field9554 = arg2;
        this.field9559 = arg3;
        this.field9552 = arg7;
    }
}
