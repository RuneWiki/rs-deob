import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pba")
public class class335 {

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "S")
    public static short field4257 = 1;

    @OriginalMember(owner = "client!pba", name = "b", descriptor = "I")
    public static int field4258;

    @OriginalMember(owner = "client!pba", name = "c", descriptor = "I")
    public static int field4259;

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "(B)V")
    public static final void method1929(byte arg0) {
        class491.method2901(-4);
        field4259++;
        class203.field2718 = null;
        class621.field8562 = null;
        class271.field3407 = null;
        class739.field10303 = null;
        int var1 = -30 / ((arg0 + 68) / 45);
        class196.field2676 = null;
    }

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "(IBLnd;)Ljl;")
    public static final class274 method1930(int arg0, byte arg1, class547 arg2) {
        field4258++;
        byte[] var3 = arg2.method3166((byte) 125, arg0);
        if (arg1 != -72) {
            method1931();
        }
        return var3 == null ? null : new class274(var3);
    }

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "()V")
    public static final void method1931() {
        class386.field4924 = class386.field4923;
    }
}
