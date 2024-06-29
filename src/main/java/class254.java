import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vca")
public class class254 implements Runnable {

    @OriginalMember(owner = "client!vca", name = "b", descriptor = "[Lwf;")
    public volatile class122[] field3245 = new class122[2];

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "Z")
    public volatile boolean field3244 = false;

    @OriginalMember(owner = "client!vca", name = "c", descriptor = "Z")
    public volatile boolean field3246 = false;

    @OriginalMember(owner = "client!vca", name = "f", descriptor = "Lbd;")
    public static class57 field3249 = new class57();

    @OriginalMember(owner = "client!vca", name = "e", descriptor = "I")
    public static int field3248;

    @OriginalMember(owner = "client!vca", name = "h", descriptor = "I")
    public static int field3251;

    @OriginalMember(owner = "client!vca", name = "d", descriptor = "Lsc;")
    public static class315 field3247;

    @OriginalMember(owner = "client!vca", name = "g", descriptor = "Lpe;")
    public class556 field3250;

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "(CB)Z", line = 3)
    public static final boolean method1454(char arg0, byte arg1) {
        if (arg1 < 96) {
            return true;
        } else {
            field3251++;
            return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
        }
    }

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "(Z)V", line = 15)
    public static void method1455(boolean arg0) {
        if (!arg0) {
            method1455(false);
        }
        field3249 = null;
        field3247 = null;
    }

    @OriginalMember(owner = "client!vca", name = "run", descriptor = "()V", line = 33)
    public final void run() {
        this.field3246 = true;
        field3248++;
        try {
            while (!this.field3244) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class122 var2 = this.field3245[var1];
                    if (var2 != null) {
                        var2.method715(41);
                    }
                }
                class370.method2025(-1, 10L);
                class183.method1063(-7901, null, this.field3250);
            }
        } catch (Exception var9) {
            class150.method824(15, var9, null);
        } finally {
            Object var6 = null;
            this.field3246 = false;
        }
    }
}
