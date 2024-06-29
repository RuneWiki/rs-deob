import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mv")
public class class631 implements Runnable {

    @OriginalMember(owner = "client!mv", name = "h", descriptor = "[Llr;")
    public volatile class261[] field9228 = new class261[2];

    @OriginalMember(owner = "client!mv", name = "f", descriptor = "Z")
    public volatile boolean field9226 = false;

    @OriginalMember(owner = "client!mv", name = "g", descriptor = "Z")
    public volatile boolean field9227 = false;

    @OriginalMember(owner = "client!mv", name = "b", descriptor = "I")
    public static int field9222 = -1;

    @OriginalMember(owner = "client!mv", name = "e", descriptor = "I")
    public static int field9225 = 2;

    @OriginalMember(owner = "client!mv", name = "c", descriptor = "[[S")
    public static short[][] field9223 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!mv", name = "d", descriptor = "Lnj;")
    public static class487 field9224 = new class487("K", "T", "K", "K");

    @OriginalMember(owner = "client!mv", name = "k", descriptor = "F")
    public static float field9231;

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "I")
    public static int field9221;

    @OriginalMember(owner = "client!mv", name = "j", descriptor = "I")
    public static int field9230;

    @OriginalMember(owner = "client!mv", name = "i", descriptor = "Luf;")
    public class353 field9229;

    @OriginalMember(owner = "client!mv", name = "run", descriptor = "()V", line = 3)
    public final void run() {
        field9221++;
        this.field9227 = true;
        try {
            while (!this.field9226) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class261 var2 = this.field9228[var1];
                    if (var2 != null) {
                        var2.method1650(-123);
                    }
                }
                class428.method2624(1, 10L);
                class513.method3057(this.field9229, (byte) -42, null);
            }
        } catch (Exception var9) {
            class31.method140(null, -119, var9);
        } finally {
            Object var6 = null;
            this.field9227 = false;
        }
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(B)V", line = 57)
    public static void method3675(byte arg0) {
        field9223 = null;
        field9224 = null;
        if (arg0 != -27) {
            field9225 = 65;
        }
    }
}
