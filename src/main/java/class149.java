import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public class class149 implements Runnable {

    @OriginalMember(owner = "client!rk", name = "c", descriptor = "[Lel;")
    public volatile class100[] field2767 = new class100[2];

    @OriginalMember(owner = "client!rk", name = "d", descriptor = "Z")
    public volatile boolean field2768 = false;

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "Z")
    public volatile boolean field2766 = false;

    @OriginalMember(owner = "client!rk", name = "e", descriptor = "Lvf;")
    public static class265 field2769 = class87.method582(-46, " de votre liste d(Wamis)3");

    @OriginalMember(owner = "client!rk", name = "i", descriptor = "I")
    public static int field2773 = 0;

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "I")
    public static int field2765;

    @OriginalMember(owner = "client!rk", name = "g", descriptor = "I")
    public static int field2771;

    @OriginalMember(owner = "client!rk", name = "h", descriptor = "Lve;")
    public class226 field2772;

    @OriginalMember(owner = "client!rk", name = "f", descriptor = "Ljava/awt/Image;")
    public static Image field2770;

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IB)V")
    public static final void method1024(int arg0, byte arg1) {
        field2771++;
        class256 var2 = (class256) class4.field52.method1842(-1, (long) arg0);
        if (var2 == null) {
            return;
        }
        int var3 = 1 / ((arg1 - 70) / 34);
        for (int var4 = 0; var4 < var2.field4378.length; var4++) {
            var2.field4378[var4] = -1;
            var2.field4382[var4] = 0;
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(I)V")
    public static void method1025(int arg0) {
        if (arg0 == -1) {
            field2770 = null;
            field2769 = null;
        }
    }

    @OriginalMember(owner = "client!rk", name = "run", descriptor = "()V")
    public final void run() {
        this.field2766 = true;
        field2765++;
        try {
            while (!this.field2768) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class100 var2 = this.field2767[var1];
                    if (var2 != null) {
                        var2.method669(true);
                    }
                }
                class19.method136(1, 10L);
                class83.method568(-31909, this.field2772, (Object) null);
            }
        } catch (Exception var9) {
            class4.method28(-78, var9, (String) null);
        } finally {
            Object var6 = null;
            this.field2766 = false;
        }
    }
}
