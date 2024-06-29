import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public class class701 {

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "B")
    public byte field9730;

    @OriginalMember(owner = "client!ih", name = "f", descriptor = "F")
    public static float field9734;

    @OriginalMember(owner = "client!ih", name = "h", descriptor = "I")
    public static int field9736;

    @OriginalMember(owner = "client!ih", name = "m", descriptor = "I")
    public static int field9741;

    @OriginalMember(owner = "client!ih", name = "n", descriptor = "Ldaa;")
    public class10 field9742;

    @OriginalMember(owner = "client!ih", name = "l", descriptor = "Ljg;")
    public class343 field9740;

    @OriginalMember(owner = "client!ih", name = "j", descriptor = "Lnl;")
    public class552 field9738;

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "Log;")
    public class649 field9729;

    @OriginalMember(owner = "client!ih", name = "k", descriptor = "Log;")
    public class649 field9739;

    @OriginalMember(owner = "client!ih", name = "g", descriptor = "Lcj;")
    public class694 field9735;

    @OriginalMember(owner = "client!ih", name = "i", descriptor = "Lcj;")
    public class694 field9737;

    @OriginalMember(owner = "client!ih", name = "p", descriptor = "Lih;")
    public class701 field9744;

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "S")
    public short field9731;

    @OriginalMember(owner = "client!ih", name = "d", descriptor = "S")
    public short field9732;

    @OriginalMember(owner = "client!ih", name = "e", descriptor = "S")
    public short field9733;

    @OriginalMember(owner = "client!ih", name = "o", descriptor = "S")
    public short field9743;

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(I)V", line = 3)
    public final void method3948(int arg0) {
        int var2 = -71 / ((arg0 - 62) / 63);
        field9741++;
        while (this.field9742 != null) {
            class10 var3 = this.field9742.field174;
            this.field9742.method101(true);
            this.field9742 = var3;
        }
    }

    @OriginalMember(owner = "client!ih", name = "<init>", descriptor = "(I)V", line = 20)
    public class701(int arg0) {
        this.field9730 = (byte) arg0;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(Ljava/lang/String;ZIILjava/lang/String;)V", line = 35)
    public static final void method3949(String arg0, boolean arg1, int arg2, int arg3, String arg4) {
        field9736++;
        if (arg2 < 121) {
            field9734 = 0.81245995F;
        }
        class418.method2426(-1, arg3, arg0, 102, arg4, true, arg1);
    }
}
