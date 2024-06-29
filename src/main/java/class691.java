import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public class class691 {

    @OriginalMember(owner = "client!cj", name = "e", descriptor = "B")
    public byte field9727;

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "Ldh;")
    public static class320 field9723 = new class320(103, 17);

    @OriginalMember(owner = "client!cj", name = "p", descriptor = "Ldh;")
    public static class320 field9738 = null;

    @OriginalMember(owner = "client!cj", name = "g", descriptor = "I")
    public static int field9729;

    @OriginalMember(owner = "client!cj", name = "j", descriptor = "I")
    public static int field9732;

    @OriginalMember(owner = "client!cj", name = "n", descriptor = "Lvp;")
    public class188 field9736;

    @OriginalMember(owner = "client!cj", name = "k", descriptor = "Laha;")
    public class380 field9733;

    @OriginalMember(owner = "client!cj", name = "q", descriptor = "Ljba;")
    public class398 field9739;

    @OriginalMember(owner = "client!cj", name = "c", descriptor = "Ljb;")
    public class492 field9725;

    @OriginalMember(owner = "client!cj", name = "f", descriptor = "Ljb;")
    public class492 field9728;

    @OriginalMember(owner = "client!cj", name = "i", descriptor = "Lv;")
    public class577 field9731;

    @OriginalMember(owner = "client!cj", name = "m", descriptor = "Lv;")
    public class577 field9735;

    @OriginalMember(owner = "client!cj", name = "o", descriptor = "Lcj;")
    public class691 field9737;

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "S")
    public short field9724;

    @OriginalMember(owner = "client!cj", name = "d", descriptor = "S")
    public short field9726;

    @OriginalMember(owner = "client!cj", name = "h", descriptor = "S")
    public short field9730;

    @OriginalMember(owner = "client!cj", name = "l", descriptor = "S")
    public short field9734;

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(I)V", line = 4)
    public final void method3896(int arg0) {
        while (this.field9739 != null) {
            class398 var2 = this.field9739.field5451;
            this.field9739.method2439((byte) 44);
            this.field9739 = var2;
        }
        if (arg0 != 103) {
            field9723 = null;
        }
        field9729++;
    }

    @OriginalMember(owner = "client!cj", name = "<init>", descriptor = "(I)V", line = 25)
    public class691(int arg0) {
        this.field9727 = (byte) arg0;
    }

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "(I)V", line = 37)
    public static void method3897(int arg0) {
        field9723 = null;
        if (arg0 != 103) {
            field9738 = null;
        }
        field9738 = null;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(IIB)Z", line = 55)
    public static final boolean method3898(int arg0, int arg1, byte arg2) {
        if (arg2 != -83) {
            field9738 = null;
        }
        field9732++;
        return (arg1 & 0x800) != 0;
    }
}
