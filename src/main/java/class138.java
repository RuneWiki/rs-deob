import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class138 {

    @OriginalMember(owner = "client!od", name = "a", descriptor = "J")
    public long field2759 = 0L;

    @OriginalMember(owner = "client!od", name = "i", descriptor = "Ljd;")
    public static class92 field2767 = class202.method1325((byte) 90, "Sichtbare Karte vorbereitet)3");

    @OriginalMember(owner = "client!od", name = "d", descriptor = "Ljava/lang/Object;")
    public static Object field2762 = new Object();

    @OriginalMember(owner = "client!od", name = "p", descriptor = "Ljd;")
    public static class92 field2774 = class202.method1325((byte) 90, "blinken3:");

    @OriginalMember(owner = "client!od", name = "b", descriptor = "I")
    public int field2760;

    @OriginalMember(owner = "client!od", name = "c", descriptor = "I")
    public int field2761;

    @OriginalMember(owner = "client!od", name = "e", descriptor = "I")
    public int field2763;

    @OriginalMember(owner = "client!od", name = "f", descriptor = "I")
    public int field2764;

    @OriginalMember(owner = "client!od", name = "g", descriptor = "I")
    public int field2765;

    @OriginalMember(owner = "client!od", name = "h", descriptor = "I")
    public static int field2766;

    @OriginalMember(owner = "client!od", name = "k", descriptor = "I")
    public static int field2769;

    @OriginalMember(owner = "client!od", name = "l", descriptor = "I")
    public int field2770;

    @OriginalMember(owner = "client!od", name = "m", descriptor = "I")
    public int field2771;

    @OriginalMember(owner = "client!od", name = "r", descriptor = "I")
    public static int field2776;

    @OriginalMember(owner = "client!od", name = "j", descriptor = "J")
    public static long field2768;

    @OriginalMember(owner = "client!od", name = "n", descriptor = "Ltg;")
    public class186 field2772;

    @OriginalMember(owner = "client!od", name = "q", descriptor = "Ltg;")
    public class186 field2775;

    @OriginalMember(owner = "client!od", name = "o", descriptor = "[I")
    public static int[] field2773;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Z)V")
    public static final void method918(boolean arg0) {
        if (arg0) {
            return;
        }
        field2769++;
        Object var1 = field2762;
        synchronized (field2762) {
            if (class31.field701 == 0) {
                class140.field2817.method1125(new class77(), 5, 17258);
            }
            class31.field701 = 600;
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(I)V")
    public static void method919(int arg0) {
        field2762 = null;
        if (arg0 < 42) {
            method920(67, 118);
        }
        field2773 = null;
        field2774 = null;
        field2767 = null;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(II)I")
    public static final int method920(int arg0, int arg1) {
        if (arg0 >= -55) {
            method920(-48, 86);
        }
        field2776++;
        return arg1 >>> 7;
    }
}
