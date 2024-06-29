import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public class class528 implements Runnable {

    @OriginalMember(owner = "client!qi", name = "c", descriptor = "[Lri;")
    public volatile class97[] field7438 = new class97[2];

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "Z")
    public volatile boolean field7437 = false;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "Z")
    public volatile boolean field7436 = false;

    @OriginalMember(owner = "client!qi", name = "e", descriptor = "I")
    public static int field7440;

    @OriginalMember(owner = "client!qi", name = "f", descriptor = "I")
    public static int field7441;

    @OriginalMember(owner = "client!qi", name = "g", descriptor = "I")
    public static int field7442;

    @OriginalMember(owner = "client!qi", name = "h", descriptor = "I")
    public static int field7443;

    @OriginalMember(owner = "client!qi", name = "d", descriptor = "Ln;")
    public class17 field7439;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(Z)I")
    public static final int method3084(boolean arg0) {
        field7441++;
        if (!arg0) {
            method3084(true);
        }
        return class32.field960;
    }

    @OriginalMember(owner = "client!qi", name = "run", descriptor = "()V")
    public final void run() {
        field7442++;
        this.field7436 = true;
        try {
            while (!this.field7437) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class97 var2 = this.field7438[var1];
                    if (var2 != null) {
                        var2.method919(-16385);
                    }
                }
                class185.method1354(10L, 10);
                class285.method1891(-17749, null, this.field7439);
            }
        } catch (Exception var9) {
            class374.method2357(null, 121, var9);
        } finally {
            Object var6 = null;
            this.field7436 = false;
        }
    }
}
