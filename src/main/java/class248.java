import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vea")
public class class248 {

    @OriginalMember(owner = "client!vea", name = "c", descriptor = "Llh;")
    public static class487 field3392 = new class487(73, 1);

    @OriginalMember(owner = "client!vea", name = "b", descriptor = "I")
    public static int field3391;

    @OriginalMember(owner = "client!vea", name = "a", descriptor = "Z")
    public static boolean field3390;

    @OriginalMember(owner = "client!vea", name = "a", descriptor = "(Z)V", line = 6)
    public static void method1531(boolean arg0) {
        field3392 = null;
        if (arg0) {
            field3390 = true;
        }
    }

    @OriginalMember(owner = "client!vea", name = "a", descriptor = "(Lac;I)Lbf;", line = 17)
    public static final class497 method1532(class501 arg0, int arg1) {
        field3391++;
        class594 var2 = class154.method1103((byte) 124)[arg0.method2874((byte) -75)];
        class12 var3 = class568.method3248(-1)[arg0.method2874((byte) -75)];
        int var4 = arg0.method2875(false);
        int var5 = arg0.method2875(false);
        int var6 = arg0.method2845(-1);
        int var7 = arg0.method2845(-1);
        int var8 = arg0.method2875(false);
        int var9 = 79 % ((arg1 - 22) / 43);
        int var10 = arg0.method2840(false);
        int var11 = arg0.method2840(false);
        return new class497(var2, var3, var4, var5, var6, var7, var8, var10, var11);
    }
}
