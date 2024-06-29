import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tda")
public class class635 implements Runnable {

    @OriginalMember(owner = "client!tda", name = "c", descriptor = "[Lnc;")
    public volatile class24[] field9133 = new class24[2];

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "Z")
    public volatile boolean field9131 = false;

    @OriginalMember(owner = "client!tda", name = "b", descriptor = "Z")
    public volatile boolean field9132 = false;

    @OriginalMember(owner = "client!tda", name = "d", descriptor = "Lkda;")
    public static class388 field9134 = new class388();

    @OriginalMember(owner = "client!tda", name = "f", descriptor = "I")
    public static int field9136 = -1;

    @OriginalMember(owner = "client!tda", name = "h", descriptor = "I")
    public static int field9138;

    @OriginalMember(owner = "client!tda", name = "i", descriptor = "I")
    public static int field9139;

    @OriginalMember(owner = "client!tda", name = "e", descriptor = "Lgh;")
    public class546 field9135;

    @OriginalMember(owner = "client!tda", name = "g", descriptor = "Lnr;")
    public static class57 field9137;

    @OriginalMember(owner = "client!tda", name = "run", descriptor = "()V")
    public final void run() {
        this.field9132 = true;
        field9138++;
        try {
            while (!this.field9131) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class24 var2 = this.field9133[var1];
                    if (var2 != null) {
                        var2.method113(-118);
                    }
                }
                class524.method3076(1, 10L);
                class141.method885(this.field9135, null, (byte) 104);
            }
        } catch (Exception var9) {
            class151.method936(null, var9, 75);
        } finally {
            Object var6 = null;
            this.field9132 = false;
        }
    }

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "(I)V")
    public static void method3644(int arg0) {
        if (arg0 >= -66) {
            method3644(92);
        }
        field9137 = null;
        field9134 = null;
    }
}
