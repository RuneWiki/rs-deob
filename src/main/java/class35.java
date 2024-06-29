import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class35 implements Runnable {

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "[Lcv;")
    public volatile class632[] field346 = new class632[2];

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "Z")
    public volatile boolean field345 = false;

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "Z")
    public volatile boolean field347 = false;

    @OriginalMember(owner = "client!pc", name = "f", descriptor = "Z")
    public static boolean field350 = false;

    @OriginalMember(owner = "client!pc", name = "g", descriptor = "Lnd;")
    public static class689 field351 = new class689();

    @OriginalMember(owner = "client!pc", name = "h", descriptor = "Lps;")
    public static class469 field352 = new class469(5, 16);

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "I")
    public static int field348;

    @OriginalMember(owner = "client!pc", name = "e", descriptor = "Lpi;")
    public class464 field349;

    @OriginalMember(owner = "client!pc", name = "run", descriptor = "()V")
    public final void run() {
        field348++;
        this.field347 = true;
        try {
            while (!this.field345) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class632 var2 = this.field346[var1];
                    if (var2 != null) {
                        var2.method3553((byte) -29);
                    }
                }
                class452.method2602(10L, (byte) -97);
                class496.method2868(null, (byte) 127, this.field349);
            }
        } catch (Exception var9) {
            class333.method1923(var9, true, null);
        } finally {
            Object var6 = null;
            this.field347 = false;
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(B)V")
    public static void method187(byte arg0) {
        field352 = null;
        field351 = null;
        if (arg0 <= 12) {
            field350 = false;
        }
    }
}
