import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fl")
public class class318 implements class392 {

    @OriginalMember(owner = "client!fl", name = "e", descriptor = "Luc;")
    public static class51 field4678 = new class51(64);

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "I")
    public static int field4674;

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "I")
    public static int field4675;

    @OriginalMember(owner = "client!fl", name = "c", descriptor = "I")
    public static int field4676;

    @OriginalMember(owner = "client!fl", name = "g", descriptor = "I")
    public static int field4680;

    @OriginalMember(owner = "client!fl", name = "d", descriptor = "[[B")
    public static byte[][] field4677;

    @OriginalMember(owner = "client!fl", name = "f", descriptor = "[[[I")
    public static int[][][] field4679;

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(I[IIJ)Ljava/lang/String;")
    public final String method2083(int arg0, int[] arg1, int arg2, long arg3) {
        field4675++;
        if (arg0 == 0) {
            class244 var6 = class93.method752((byte) 22, arg1[0]);
            return var6.method1588((byte) 85, (int) arg3);
        } else if (arg0 == 1 || arg0 == 10) {
            class159 var7 = class129.method915(127, (int) arg3);
            return var7.field2068;
        } else if (arg0 == 6 || arg0 == 7 || arg0 == 11) {
            return class93.method752((byte) 22, arg1[0]).method1588((byte) 85, (int) arg3);
        } else if (arg2 < 8) {
            return null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(Z)V")
    public static void method2084(boolean arg0) {
        field4677 = null;
        field4678 = null;
        if (arg0) {
            field4680 = 5;
        }
        field4679 = null;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(II)Lno;")
    public static final class416 method2085(int arg0, int arg1) {
        field4676++;
        class416 var2 = (class416) class305.field4560.method378((byte) 28, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class40.field613.method1235(arg1, false, arg0);
        class416 var4 = new class416();
        if (var3 != null) {
            var4.method2629((byte) 62, new class341(var3));
        }
        var4.method2627((byte) -36);
        class305.field4560.method367((long) arg0, var4, true);
        return var4;
    }
}
