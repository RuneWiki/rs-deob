import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public class class495 extends class77 implements Runnable {

    @OriginalMember(owner = "client!of", name = "q", descriptor = "Z")
    private boolean field7460 = true;

    @OriginalMember(owner = "client!of", name = "n", descriptor = "I")
    public int field7457 = -1;

    @OriginalMember(owner = "client!of", name = "o", descriptor = "Liu;")
    private class518 field7458;

    @OriginalMember(owner = "client!of", name = "s", descriptor = "Lnj;")
    public static class487 field7462 = new class487("slide:", "gleiten:", "glissement:", "deslizamento:");

    @OriginalMember(owner = "client!of", name = "m", descriptor = "I")
    public static int field7456;

    @OriginalMember(owner = "client!of", name = "p", descriptor = "I")
    public static int field7459;

    @OriginalMember(owner = "client!of", name = "r", descriptor = "I")
    public static int field7461;

    @OriginalMember(owner = "client!of", name = "t", descriptor = "I")
    public static int field7463;

    @OriginalMember(owner = "client!of", name = "u", descriptor = "I")
    public static int field7464;

    @OriginalMember(owner = "client!of", name = "b", descriptor = "(I)V")
    public final void method2990(int arg0) {
        this.field7460 = false;
        field7459++;
        if (arg0 != 9773) {
            field7462 = null;
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(III)Z")
    public static final boolean method2991(int arg0, int arg1, int arg2) {
        field7461++;
        if (arg1 != -10732) {
            field7462 = null;
        }
        return (arg2 & 0x20) != 0;
    }

    @OriginalMember(owner = "client!of", name = "c", descriptor = "(I)V")
    public final void method2992(int arg0) {
        field7456++;
        (new Thread(this, "a")).start();
        if (arg0 != -1) {
            this.method2990(75);
        }
    }

    @OriginalMember(owner = "client!of", name = "<init>", descriptor = "(Liu;)V")
    public class495(class518 arg0) {
        this.field7458 = arg0;
    }

    @OriginalMember(owner = "client!of", name = "run", descriptor = "()V")
    public final void run() {
        field7463++;
        while (this.field7460) {
            this.field7458.method3076(this, -63);
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(B)V")
    public static void method2993(byte arg0) {
        field7462 = null;
        if (arg0 < 104) {
            field7462 = null;
        }
    }
}
