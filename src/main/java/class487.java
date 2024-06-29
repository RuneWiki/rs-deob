import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public class class487 implements Runnable {

    @OriginalMember(owner = "client!ch", name = "c", descriptor = "[Lhp;")
    public volatile class346[] field6857 = new class346[2];

    @OriginalMember(owner = "client!ch", name = "f", descriptor = "Z")
    public volatile boolean field6860 = false;

    @OriginalMember(owner = "client!ch", name = "e", descriptor = "Z")
    public volatile boolean field6859 = false;

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "I")
    public static int field6855;

    @OriginalMember(owner = "client!ch", name = "d", descriptor = "I")
    public static int field6858;

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "Ltd;")
    public class477 field6856;

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(BI)V")
    public static final void method2899(byte arg0, int arg1) {
        field6855++;
        class313 var2 = class312.method1998((long) arg1, 5, -1);
        var2.method2006(arg0 + 112);
        if (arg0 != 14) {
            method2899((byte) -127, -126);
        }
    }

    @OriginalMember(owner = "client!ch", name = "run", descriptor = "()V")
    public final void run() {
        this.field6859 = true;
        field6858++;
        try {
            while (!this.field6860) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class346 var2 = this.field6857[var1];
                    if (var2 != null) {
                        var2.method2191(-54);
                    }
                }
                class107.method828(10L, (byte) -107);
                class745.method4151(this.field6856, null, 3);
            }
        } catch (Exception var9) {
            class678.method3848(null, var9, false);
        } finally {
            Object var6 = null;
            this.field6859 = false;
        }
    }
}
