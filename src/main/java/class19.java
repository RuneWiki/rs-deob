import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bu")
public class class19 implements Runnable {

    @OriginalMember(owner = "client!bu", name = "h", descriptor = "[Lbl;")
    public volatile class651[] field347 = new class651[2];

    @OriginalMember(owner = "client!bu", name = "d", descriptor = "Z")
    public volatile boolean field343 = false;

    @OriginalMember(owner = "client!bu", name = "b", descriptor = "Z")
    public volatile boolean field341 = false;

    @OriginalMember(owner = "client!bu", name = "f", descriptor = "[C")
    public static char[] field345 = new char[] { '[', ']', '#' };

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "Lhg;")
    public static class693 field340 = new class693(57, -1);

    @OriginalMember(owner = "client!bu", name = "e", descriptor = "I")
    public static int field344;

    @OriginalMember(owner = "client!bu", name = "g", descriptor = "I")
    public static int field346;

    @OriginalMember(owner = "client!bu", name = "i", descriptor = "I")
    public static int field348;

    @OriginalMember(owner = "client!bu", name = "c", descriptor = "Lqg;")
    public class465 field342;

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(I)V", line = 3)
    public static void method128(int arg0) {
        field340 = null;
        if (arg0 == 57) {
            field345 = null;
        }
    }

    @OriginalMember(owner = "client!bu", name = "run", descriptor = "()V", line = 24)
    public final void run() {
        field344++;
        this.field341 = true;
        try {
            while (!this.field343) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class651 var2 = this.field347[var1];
                    if (var2 != null) {
                        var2.method3648(false);
                    }
                }
                class149.method1052(10L, true);
                class720.method4024((byte) -124, null, this.field342);
            }
        } catch (Exception var9) {
            class684.method3842(1, var9, null);
        } finally {
            Object var6 = null;
            this.field341 = false;
        }
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(B)[Lbia;", line = 71)
    public static final class501[] method129(byte arg0) {
        field346++;
        if (arg0 != 72) {
            field348 = 57;
        }
        return new class501[] { class275.field3454, class742.field10359, class310.field4082 };
    }
}
