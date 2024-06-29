import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aaa")
public class class617 {

    @OriginalMember(owner = "client!aaa", name = "e", descriptor = "J")
    public static long field8246 = (long) (Math.random() * 9.999999999E9D);

    @OriginalMember(owner = "client!aaa", name = "f", descriptor = "Z")
    public static boolean field8247 = true;

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "I")
    public static int field8242;

    @OriginalMember(owner = "client!aaa", name = "d", descriptor = "I")
    public static int field8245;

    @OriginalMember(owner = "client!aaa", name = "g", descriptor = "I")
    public static int field8248;

    @OriginalMember(owner = "client!aaa", name = "h", descriptor = "I")
    public int field8249;

    @OriginalMember(owner = "client!aaa", name = "b", descriptor = "Lwg;")
    public class430 field8243;

    @OriginalMember(owner = "client!aaa", name = "c", descriptor = "[I")
    public int[] field8244;

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "(B)V", line = 6)
    public static final void method3377(byte arg0) {
        field8248++;
        if (!class142.field2268) {
            return;
        }
        class672 var1 = class239.method1503(class649.field8631, class136.field2168, 0);
        if (var1 != null && var1.field9229 != null) {
            class309 var2 = new class309();
            var2.field4439 = var1.field9229;
            var2.field4435 = var1;
            class182.method1249(var2);
        }
        class737.field10192 = -1;
        int var3 = -43 / ((-arg0 - 45) / 40);
        class275.field3827 = -1;
        class142.field2268 = false;
        if (var1 != null) {
            class399.method2347(var1, 2260);
        }
    }

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "(IB)I", line = 37)
    public static final int method3378(int arg0, byte arg1) {
        if (arg1 != 95) {
            method3377((byte) 10);
        }
        field8242++;
        return arg0 & 0xFF;
    }
}
