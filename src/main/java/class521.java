import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!au")
public class class521 extends class427 implements Runnable {

    @OriginalMember(owner = "client!au", name = "m", descriptor = "Z")
    private boolean field7569 = true;

    @OriginalMember(owner = "client!au", name = "i", descriptor = "I")
    public int field7565 = -1;

    @OriginalMember(owner = "client!au", name = "j", descriptor = "Lah;")
    private class263 field7566;

    @OriginalMember(owner = "client!au", name = "l", descriptor = "I")
    public static int field7568 = 0;

    @OriginalMember(owner = "client!au", name = "o", descriptor = "Z")
    public static boolean field7571 = false;

    @OriginalMember(owner = "client!au", name = "k", descriptor = "I")
    public static int field7567 = -1;

    @OriginalMember(owner = "client!au", name = "n", descriptor = "I")
    public static int field7570;

    @OriginalMember(owner = "client!au", name = "p", descriptor = "I")
    public static int field7572;

    @OriginalMember(owner = "client!au", name = "q", descriptor = "I")
    public static int field7573;

    @OriginalMember(owner = "client!au", name = "r", descriptor = "I")
    public static int field7574;

    @OriginalMember(owner = "client!au", name = "b", descriptor = "(B)V")
    public final void method3085(byte arg0) {
        field7572++;
        if (arg0 != 35) {
            field7567 = -45;
        }
        this.field7569 = false;
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(II)Z")
    public static final boolean method3086(int arg0, int arg1) {
        field7574++;
        if (arg0 != -1) {
            method3086(104, 106);
        }
        return arg1 == 0 || arg1 == 1 || arg1 == 2;
    }

    @OriginalMember(owner = "client!au", name = "run", descriptor = "()V")
    public final void run() {
        field7573++;
        while (this.field7569) {
            this.field7566.method1685((byte) 117, this);
        }
    }

    @OriginalMember(owner = "client!au", name = "b", descriptor = "(I)V")
    public final void method3087(int arg0) {
        if (arg0 == 0) {
            field7570++;
            (new Thread(this, "a")).start();
        }
    }

    @OriginalMember(owner = "client!au", name = "<init>", descriptor = "(Lah;)V")
    public class521(class263 arg0) {
        this.field7566 = arg0;
    }
}
