import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class165 {

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "[I")
    public static int[] field2318 = new int[99];

    @OriginalMember(owner = "client!ge", name = "d", descriptor = "[I")
    public static int[] field2320;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "I")
    public static int field2317;

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "I")
    public static int field2319;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(I)V", line = 5)
    public static void method1237(int arg0) {
        field2320 = null;
        field2318 = null;
        if (arg0 != -7103) {
            method1237(-15);
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IILfd;)Lwg;", line = 18)
    public static final class310 method1238(int arg0, int arg1, class299 arg2) {
        if (arg1 != 2951) {
            return (class310) null;
        }
        class310 var3 = new class310(arg0, arg2.method2060(arg1 - 15433), arg2.method2060(-12482), arg2.method2062(arg1 - 28746), arg2.method2062(-25795), arg2.method2096((byte) -122) == 1, arg2.method2096((byte) -122));
        field2317++;
        int var4 = arg2.method2096((byte) -122);
        for (int var5 = 0; var5 < var4; var5++) {
            var3.field4560.method415((byte) -92, new class263(arg2.method2096((byte) -122), arg2.method2096((byte) -122), arg2.method2083((byte) -85), arg2.method2083((byte) -92), arg2.method2083((byte) -43), arg2.method2083((byte) -101), arg2.method2083((byte) -70), arg2.method2083((byte) -23), arg2.method2083((byte) -124), arg2.method2083((byte) -42)));
        }
        var3.method2160(12800);
        return var3;
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) (Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D + (double) var2);
            var0 += var3;
            field2318[var1] = var0 / 4;
        }
        field2320 = new int[] { 1, -1, -1, 1 };
    }
}
