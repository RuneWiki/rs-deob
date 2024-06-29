import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pba")
public class class352 {

    @OriginalMember(owner = "client!pba", name = "b", descriptor = "I")
    public static int field4698;

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "Lsc;")
    public static class369 field4697;

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "([JB[Ljava/lang/Object;)V")
    public static final void method2157(long[] arg0, byte arg1, Object[] arg2) {
        if (arg1 != -105) {
            field4697 = null;
        }
        field4698++;
        class758.method4198(arg1 ^ 0x5F69, arg2, arg0, 0, arg0.length - 1);
    }

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "(I)V")
    public static void method2158(int arg0) {
        field4697 = null;
        if (arg0 != 0) {
            field4697 = null;
        }
    }
}
