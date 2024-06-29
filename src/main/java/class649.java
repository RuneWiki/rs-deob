import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sga")
public abstract class class649 {

    @OriginalMember(owner = "client!sga", name = "c", descriptor = "Lhs;")
    public class358 field9224;

    @OriginalMember(owner = "client!sga", name = "b", descriptor = "I")
    public int field9223;

    @OriginalMember(owner = "client!sga", name = "a", descriptor = "I")
    public static int field9222;

    @OriginalMember(owner = "client!sga", name = "d", descriptor = "I")
    public static int field9225;

    @OriginalMember(owner = "client!sga", name = "a", descriptor = "(Ld;ILjava/awt/Canvas;II)Lha;")
    public static final class544 method3656(class267 arg0, int arg1, Canvas arg2, int arg3, int arg4) {
        if (arg3 == 3) {
            field9225++;
            return new class406(arg2, arg0, arg1, arg4);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!sga", name = "a", descriptor = "(I)I")
    public abstract int method135(int arg0);

    @OriginalMember(owner = "client!sga", name = "a", descriptor = "(II)I")
    public abstract int method133(int arg0, int arg1);

    @OriginalMember(owner = "client!sga", name = "b", descriptor = "(I)V")
    public abstract void method134(int arg0);

    @OriginalMember(owner = "client!sga", name = "a", descriptor = "(IB)V")
    public abstract void method129(int arg0, byte arg1);

    @OriginalMember(owner = "client!sga", name = "a", descriptor = "(IZ)V")
    public final void method3657(int arg0, boolean arg1) {
        if (!arg1) {
            this.field9223 = 26;
        }
        field9222++;
        if (this.method133(18648, arg0) != 3) {
            this.method129(arg0, (byte) -127);
        }
    }

    @OriginalMember(owner = "client!sga", name = "<init>", descriptor = "(Lhs;)V")
    public class649(class358 arg0) {
        this.field9224 = arg0;
        this.field9223 = this.method135(50);
    }

    @OriginalMember(owner = "client!sga", name = "<init>", descriptor = "(ILhs;)V")
    public class649(int arg0, class358 arg1) {
        this.field9223 = arg0;
        this.field9224 = arg1;
    }
}
