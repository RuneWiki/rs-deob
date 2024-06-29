import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cq")
public class class433 {

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "B")
    public byte field6205;

    @OriginalMember(owner = "client!cq", name = "j", descriptor = "Lwo;")
    public static class690 field6214 = new class690(86, 16);

    @OriginalMember(owner = "client!cq", name = "o", descriptor = "F")
    public static float field6219;

    @OriginalMember(owner = "client!cq", name = "g", descriptor = "I")
    public static int field6211;

    @OriginalMember(owner = "client!cq", name = "p", descriptor = "I")
    public static int field6220;

    @OriginalMember(owner = "client!cq", name = "n", descriptor = "Lrfa;")
    public class182 field6218;

    @OriginalMember(owner = "client!cq", name = "f", descriptor = "Lrh;")
    public class242 field6210;

    @OriginalMember(owner = "client!cq", name = "m", descriptor = "Lrh;")
    public class242 field6217;

    @OriginalMember(owner = "client!cq", name = "c", descriptor = "Lcq;")
    public class433 field6207;

    @OriginalMember(owner = "client!cq", name = "e", descriptor = "Ldn;")
    public class480 field6209;

    @OriginalMember(owner = "client!cq", name = "h", descriptor = "Ldn;")
    public class480 field6212;

    @OriginalMember(owner = "client!cq", name = "q", descriptor = "Lkj;")
    public class524 field6221;

    @OriginalMember(owner = "client!cq", name = "l", descriptor = "Llw;")
    public class611 field6216;

    @OriginalMember(owner = "client!cq", name = "b", descriptor = "S")
    public short field6206;

    @OriginalMember(owner = "client!cq", name = "d", descriptor = "S")
    public short field6208;

    @OriginalMember(owner = "client!cq", name = "i", descriptor = "S")
    public short field6213;

    @OriginalMember(owner = "client!cq", name = "k", descriptor = "S")
    public short field6215;

    @OriginalMember(owner = "client!cq", name = "<init>", descriptor = "(I)V")
    public class433(int arg0) {
        this.field6205 = (byte) arg0;
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(I)V")
    public static void method2598(int arg0) {
        field6214 = null;
        if (arg0 != -9893) {
            method2598(19);
        }
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(B)V")
    public final void method2599(byte arg0) {
        while (this.field6218 != null) {
            class182 var2 = this.field6218.field2226;
            this.field6218.method1128(25);
            this.field6218 = var2;
        }
        if (arg0 < 45) {
            this.method2599((byte) -100);
        }
        field6220++;
    }
}
