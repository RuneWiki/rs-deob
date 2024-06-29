import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kga")
public class class546 {

    @OriginalMember(owner = "client!kga", name = "b", descriptor = "Llaa;")
    private class122 field7217;

    @OriginalMember(owner = "client!kga", name = "f", descriptor = "J")
    public long field7221;

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "Lmha;")
    public static class419 field7216 = new class419(8, 1);

    @OriginalMember(owner = "client!kga", name = "g", descriptor = "Lhda;")
    public static class752 field7222 = new class752(10, -1);

    @OriginalMember(owner = "client!kga", name = "c", descriptor = "I")
    public static int field7218;

    @OriginalMember(owner = "client!kga", name = "d", descriptor = "I")
    public static int field7219;

    @OriginalMember(owner = "client!kga", name = "e", descriptor = "I")
    public static int field7220;

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(ILha;)V")
    public static final void method3057(int arg0, class59 arg1) {
        field7219++;
        if (class27.field433.method14(arg0 ^ arg0) == 0) {
            return;
        }
        if (class411.field5711.field3913.method3282(true) == 0) {
            for (class661 var2 = (class661) class27.field433.method21(2); var2 != null; var2 = (class661) class27.field433.method9(-128)) {
                class77.field948.method1169(false, var2.field8723 ? class472.field6475.field5333 : null, arg1, false, var2.field8722, arg1, 43, var2.field8724, var2.field8725, class275.field3832, var2.field8729, var2.field8727);
                var2.method3564(true);
            }
            class312.method1915(-101);
            return;
        }
        if (class349.field4916 == null) {
            Canvas var3 = new Canvas();
            var3.setSize(36, 32);
            class349.field4916 = class313.method1918(0, 0, 0, class252.field3474, class361.field5087, var3);
            class282.field3995 = class349.field4916.method425(class313.method1919(0, -127, class2.field28, class275.field3836), class720.method4047(class84.field1023, class2.field28, 0), true);
        }
        for (class661 var4 = (class661) class27.field433.method21(arg0 - 26158); var4 != null; var4 = (class661) class27.field433.method9(-128)) {
            class77.field948.method1169(false, var4.field8723 ? class472.field6475.field5333 : null, arg1, false, var4.field8722, class349.field4916, 49, var4.field8724, var4.field8725, class282.field3995, var4.field8729, var4.field8727);
            var4.method3564(true);
        }
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(B)V")
    public static void method3058(byte arg0) {
        field7216 = null;
        if (arg0 != -85) {
            method3058((byte) -70);
        }
        field7222 = null;
    }

    @OriginalMember(owner = "client!kga", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field7218++;
        this.field7217.method981((byte) -93, this.field7221);
        super.finalize();
    }

    @OriginalMember(owner = "client!kga", name = "<init>", descriptor = "(Llaa;J[Llf;)V")
    public class546(class122 arg0, long arg1, class239[] arg2) {
        this.field7217 = arg0;
        this.field7221 = arg1;
    }
}
