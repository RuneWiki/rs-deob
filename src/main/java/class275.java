import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class275 implements Runnable {

    @OriginalMember(owner = "client!df", name = "k", descriptor = "[Leb;")
    public volatile class439[] field3775 = new class439[2];

    @OriginalMember(owner = "client!df", name = "i", descriptor = "Z")
    public volatile boolean field3773 = false;

    @OriginalMember(owner = "client!df", name = "j", descriptor = "Z")
    public volatile boolean field3774 = false;

    @OriginalMember(owner = "client!df", name = "c", descriptor = "[Lrq;")
    public static class233[] field3767 = new class233[50];

    @OriginalMember(owner = "client!df", name = "a", descriptor = "[I")
    public static int[] field3765 = new int[1000];

    @OriginalMember(owner = "client!df", name = "b", descriptor = "Lqp;")
    public static class466 field3766 = new class466("scroll:", "scrollen:", "déroulement:", "rolagem:");

    @OriginalMember(owner = "client!df", name = "h", descriptor = "I")
    public static int field3772 = 0;

    @OriginalMember(owner = "client!df", name = "l", descriptor = "Z")
    public static boolean field3776 = false;

    @OriginalMember(owner = "client!df", name = "d", descriptor = "I")
    public static int field3768;

    @OriginalMember(owner = "client!df", name = "e", descriptor = "I")
    public static int field3769;

    @OriginalMember(owner = "client!df", name = "g", descriptor = "I")
    public static int field3771;

    @OriginalMember(owner = "client!df", name = "f", descriptor = "Ldr;")
    public class504 field3770;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(B)V")
    public static final void method1629(byte arg0) {
        field3771++;
        class485.field7085.method254(class214.field2978, class498.field7257, class25.field324);
        int var1 = -84 % ((17 - arg0) / 46);
    }

    @OriginalMember(owner = "client!df", name = "run", descriptor = "()V")
    public final void run() {
        field3768++;
        this.field3774 = true;
        try {
            while (!this.field3773) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class439 var2 = this.field3775[var1];
                    if (var2 != null) {
                        var2.method2608(-123);
                    }
                }
                class157.method1046(-128, 10L);
                class249.method1496(this.field3770, 50, null);
            }
        } catch (Exception var9) {
            class320.method1861(var9, (byte) -110, null);
        } finally {
            Object var6 = null;
            this.field3774 = false;
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(I)V")
    public static void method1630(int arg0) {
        field3767 = null;
        field3766 = null;
        if (arg0 != -18545) {
            method1629((byte) -112);
        }
        field3765 = null;
    }
}
