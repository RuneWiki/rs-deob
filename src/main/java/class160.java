import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pm")
public class class160 extends class244 {

    @OriginalMember(owner = "client!pm", name = "j", descriptor = "[Ljava/lang/String;")
    public static String[] field2301 = new String[200];

    @OriginalMember(owner = "client!pm", name = "n", descriptor = "I")
    public static int field2305 = 0;

    @OriginalMember(owner = "client!pm", name = "l", descriptor = "[J")
    public static long[] field2303 = new long[256];

    @OriginalMember(owner = "client!pm", name = "p", descriptor = "[I")
    public static int[] field2307;

    @OriginalMember(owner = "client!pm", name = "m", descriptor = "I")
    public static int field2304;

    @OriginalMember(owner = "client!pm", name = "o", descriptor = "I")
    public static int field2306;

    @OriginalMember(owner = "client!pm", name = "k", descriptor = "Lfc;")
    public static class343 field2302;

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "(I)V")
    public static void method970(int arg0) {
        field2302 = null;
        field2307 = null;
        int var1 = -122 / ((arg0 - 68) / 45);
        field2303 = null;
        field2301 = null;
    }

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "(IIII)V")
    public static final void method971(int arg0, int arg1, int arg2, int arg3) {
        field2304++;
        String var4 = "tele " + arg3 + "," + (arg0 >> 6) + "," + (arg1 >> 6) + "," + (arg0 & 0x3F) + "," + (arg1 & arg2);
        System.out.println(var4);
        class183.method1200(var4, true, -1);
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            long var1 = (long) var0;
            for (int var3 = 0; var3 < 8; var3++) {
                if ((var1 & 0x1L) == 1L) {
                    var1 = var1 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field2303[var0] = var1;
        }
        field2307 = new int[] { 28, 35, 40, 44 };
    }
}
