import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class147 implements Runnable {

    @OriginalMember(owner = "client!va", name = "a", descriptor = "Z")
    public boolean field2546 = true;

    @OriginalMember(owner = "client!va", name = "d", descriptor = "Ljava/lang/Object;")
    public Object field2549 = new Object();

    @OriginalMember(owner = "client!va", name = "i", descriptor = "[I")
    public int[] field2554 = new int[500];

    @OriginalMember(owner = "client!va", name = "j", descriptor = "[I")
    public int[] field2555 = new int[500];

    @OriginalMember(owner = "client!va", name = "k", descriptor = "I")
    public int field2556 = 0;

    @OriginalMember(owner = "client!va", name = "e", descriptor = "Ljf;")
    public static class229 field2550 = null;

    @OriginalMember(owner = "client!va", name = "h", descriptor = "[I")
    public static int[] field2553 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!va", name = "g", descriptor = "Ljf;")
    public static class229 field2552 = class212.method1457((byte) 67, "Vous ne pouvez pas ajouter votre nom -9 votre liste d(Wamis)3");

    @OriginalMember(owner = "client!va", name = "f", descriptor = "I")
    public static int field2551;

    @OriginalMember(owner = "client!va", name = "b", descriptor = "[I")
    public static int[] field2547;

    @OriginalMember(owner = "client!va", name = "c", descriptor = "[Lrm;")
    public static class248[] field2548;

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(B)V", line = 6)
    public static void method1016(byte arg0) {
        if (arg0 >= -47) {
            method1016((byte) -13);
        }
        field2552 = null;
        field2550 = null;
        field2547 = null;
        field2553 = null;
        field2548 = null;
    }

    @OriginalMember(owner = "client!va", name = "run", descriptor = "()V", line = 31)
    public final void run() {
        while (this.field2546) {
            Object var1 = this.field2549;
            synchronized (this.field2549) {
                if (this.field2556 < 500) {
                    this.field2555[this.field2556] = class287.field4914;
                    this.field2554[this.field2556] = class82.field1511;
                    this.field2556++;
                }
            }
            class235.method1675((byte) -22, 50L);
        }
        field2551++;
    }
}
