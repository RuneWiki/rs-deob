import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kk")
public class class239 implements Runnable {

    @OriginalMember(owner = "client!kk", name = "c", descriptor = "[Lpda;")
    public volatile class138[] field3519 = new class138[2];

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "Z")
    public volatile boolean field3517 = false;

    @OriginalMember(owner = "client!kk", name = "e", descriptor = "Z")
    public volatile boolean field3521 = false;

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "Lgca;")
    public static class627 field3518 = new class627();

    @OriginalMember(owner = "client!kk", name = "g", descriptor = "I")
    public static int field3523 = 0;

    @OriginalMember(owner = "client!kk", name = "d", descriptor = "I")
    public static int field3520;

    @OriginalMember(owner = "client!kk", name = "f", descriptor = "Lwv;")
    public class705 field3522;

    @OriginalMember(owner = "client!kk", name = "run", descriptor = "()V")
    public final void run() {
        field3520++;
        this.field3521 = true;
        try {
            while (!this.field3517) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class138 var2 = this.field3519[var1];
                    if (var2 != null) {
                        var2.method1057(7677);
                    }
                }
                class564.method3300((byte) -29, 10L);
                class693.method3909(this.field3522, null, (byte) -85);
            }
        } catch (Exception var9) {
            class18.method200(null, var9, 10296);
        } finally {
            Object var6 = null;
            this.field3521 = false;
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(I)V")
    public static void method1556(int arg0) {
        if (arg0 != -5387) {
            method1556(-13);
        }
        field3518 = null;
    }
}
