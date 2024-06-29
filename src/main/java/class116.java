import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public class class116 extends class210 {

    @OriginalMember(owner = "client!m", name = "q", descriptor = "[I")
    public int[] field2347 = new int[1];

    @OriginalMember(owner = "client!m", name = "z", descriptor = "[I")
    public int[] field2356 = new int[] { -1 };

    @OriginalMember(owner = "client!m", name = "s", descriptor = "I")
    public static int field2349 = -1;

    @OriginalMember(owner = "client!m", name = "t", descriptor = "Ljd;")
    private static class92 field2350 = class202.method1325((byte) 90, " <col=00ff80>");

    @OriginalMember(owner = "client!m", name = "p", descriptor = "[I")
    public static int[] field2346 = new int[200];

    @OriginalMember(owner = "client!m", name = "y", descriptor = "I")
    public static volatile int field2355 = 0;

    @OriginalMember(owner = "client!m", name = "x", descriptor = "I")
    public static volatile int field2354 = -1;

    @OriginalMember(owner = "client!m", name = "w", descriptor = "I")
    public static int field2353 = -1;

    @OriginalMember(owner = "client!m", name = "r", descriptor = "I")
    public static int field2348;

    @OriginalMember(owner = "client!m", name = "v", descriptor = "I")
    public static int field2352;

    @OriginalMember(owner = "client!m", name = "u", descriptor = "Lh;")
    public static class70 field2351;

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(II)Ljd;")
    public static final class92 method783(int arg0, int arg1) {
        class92 var2 = class142.method938(arg1, false);
        field2352++;
        for (int var3 = var2.method640(true) - 3; var3 > 0; var3 -= 3) {
            var2 = class77.method529(-3, new class92[] { var2.method629(var3, 0, 0), class63.field1286, var2.method613(0, var3) });
        }
        int var4 = 67 % ((4 - arg0) / 43);
        if (var2.method640(true) > 9) {
            return class77.method529(-3, new class92[] { field2350, var2.method629(var2.method640(true) - 8, 0, 0), class195.field3809, class79.field1618, var2, class41.field913 });
        } else if (var2.method640(true) > 6) {
            return class77.method529(-3, new class92[] { class113.field2274, var2.method629(var2.method640(true) - 4, 0, 0), class151.field3001, class79.field1618, var2, class41.field913 });
        } else {
            return class77.method529(-3, new class92[] { class124.field2526, var2, class168.field3292 });
        }
    }

    @OriginalMember(owner = "client!m", name = "d", descriptor = "(I)V")
    public static void method784(int arg0) {
        field2346 = null;
        field2351 = null;
        field2350 = null;
        int var1 = -42 / ((arg0 + 26) / 59);
    }
}
