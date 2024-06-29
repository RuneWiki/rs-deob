import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class159 {

    @OriginalMember(owner = "client!be", name = "b", descriptor = "I")
    public static int field2259 = 0;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "Lcc;")
    public static class327 field2258 = new class327(4);

    @OriginalMember(owner = "client!be", name = "f", descriptor = "Z")
    public static boolean field2263 = false;

    @OriginalMember(owner = "client!be", name = "g", descriptor = "J")
    public static long field2264 = 0L;

    @OriginalMember(owner = "client!be", name = "i", descriptor = "[B")
    public static byte[] field2266 = new byte[32896];

    @OriginalMember(owner = "client!be", name = "j", descriptor = "[I")
    public static int[] field2267;

    @OriginalMember(owner = "client!be", name = "c", descriptor = "I")
    public static int field2260;

    @OriginalMember(owner = "client!be", name = "d", descriptor = "I")
    public static int field2261;

    @OriginalMember(owner = "client!be", name = "e", descriptor = "I")
    public static int field2262;

    @OriginalMember(owner = "client!be", name = "h", descriptor = "Lke;")
    public static class230 field2265;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(Lfh;I)V", line = 7)
    public static final void method1217(class140 arg0, int arg1) {
        if (arg1 != 1024) {
            method1217((class140) null, 7);
        }
        class362.field5656 = arg0;
        field2262++;
        class186.field2553 = class362.field5656.method1088(16, 1);
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(I)V", line = 27)
    public static void method1218(int arg0) {
        if (arg0 > -98) {
            field2264 = -10L;
        }
        field2265 = null;
        field2266 = null;
        field2258 = null;
        field2267 = null;
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 256; var1++) {
            for (int var2 = 0; var2 <= var1; var2++) {
                field2266[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var1 * var1 + (var2 * var2 + 65535)) / 65535.0F))));
            }
        }
        field2267 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(II)Lfn;", line = 46)
    public static final class148 method1219(int arg0, int arg1) {
        if (arg1 != 10057) {
            return (class148) null;
        }
        field2260++;
        class148 var2 = (class148) class339.field5292.method1116(arg1 + 7244, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class326.field4767.method1089(5, (byte) 122, arg0);
        class148 var4 = new class148();
        if (var3 != null) {
            var4.method1142(0, new class299(var3));
        }
        class339.field5292.method1115((long) arg0, 83, var4);
        return var4;
    }
}
