import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public class class230 implements class415 {

    @OriginalMember(owner = "client!nk", name = "g", descriptor = "Lhp;")
    private class448 field3017;

    @OriginalMember(owner = "client!nk", name = "e", descriptor = "Lpq;")
    private class159 field3015;

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "S")
    public static short field3012 = 256;

    @OriginalMember(owner = "client!nk", name = "c", descriptor = "I")
    public static int field3013;

    @OriginalMember(owner = "client!nk", name = "d", descriptor = "I")
    public static int field3014;

    @OriginalMember(owner = "client!nk", name = "f", descriptor = "I")
    public static int field3016;

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "Lxa;")
    private class424 field3011;

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(II)I")
    public static int method1424(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(I)Z")
    public final boolean method193(int arg0) {
        if (arg0 != -29581) {
            this.method277(true, (byte) -37);
        }
        field3013++;
        return this.field3015.method1086((byte) 123, this.field3017.field6140);
    }

    @OriginalMember(owner = "client!nk", name = "<init>", descriptor = "(Lpq;Lhp;)V")
    public class230(class159 arg0, class448 arg1) {
        this.field3017 = arg1;
        this.field3015 = arg0;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(ZB)V")
    public final void method277(boolean arg0, byte arg1) {
        field3016++;
        if (arg0) {
            int var3 = class303.field4059 > class432.field5995 ? class303.field4059 : class432.field5995;
            int var4 = class211.field2763 > class384.field5582 ? class211.field2763 : class384.field5582;
            this.field3011.method2446(0, 0, var3, var4);
        }
        if (arg1 > -13) {
            this.method193(89);
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(B)V")
    public final void method191(byte arg0) {
        this.field3011 = class506.method2866(this.field3015.method1082((byte) 33, this.field3017.field6140), (byte) 124);
        if (arg0 >= -5) {
            this.method193(-46);
        }
        field3014++;
        this.method277(true, (byte) -102);
    }
}
