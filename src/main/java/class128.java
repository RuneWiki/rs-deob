import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wk")
public class class128 implements Runnable {

    @OriginalMember(owner = "client!wk", name = "f", descriptor = "[Lun;")
    public volatile class386[] field1772 = new class386[2];

    @OriginalMember(owner = "client!wk", name = "h", descriptor = "Z")
    public volatile boolean field1774 = false;

    @OriginalMember(owner = "client!wk", name = "c", descriptor = "Z")
    public volatile boolean field1769 = false;

    @OriginalMember(owner = "client!wk", name = "d", descriptor = "Lcc;")
    public static class670 field1770 = new class670("WTWIP", 3);

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "I")
    public static int field1767;

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "I")
    public static int field1768;

    @OriginalMember(owner = "client!wk", name = "e", descriptor = "I")
    public static int field1771;

    @OriginalMember(owner = "client!wk", name = "g", descriptor = "Ltt;")
    public class79 field1773;

    @OriginalMember(owner = "client!wk", name = "run", descriptor = "()V")
    public final void run() {
        field1771++;
        this.field1769 = true;
        try {
            while (!this.field1774) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class386 var2 = this.field1772[var1];
                    if (var2 != null) {
                        var2.method2227(-121);
                    }
                }
                class419.method2390(29, 10L);
                class88.method663(null, this.field1773, true);
            }
        } catch (Exception var9) {
            class139.method985((byte) -115, null, var9);
        } finally {
            Object var6 = null;
            this.field1769 = false;
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(I)V")
    public static final void method902(int arg0) {
        if (arg0 != 2) {
            return;
        }
        field1768++;
        if (class531.field7242 != null) {
            class531.field7242.method3554(true);
            class556.field7520 = null;
            class531.field7242 = null;
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(Z)V")
    public static void method903(boolean arg0) {
        if (arg0) {
            field1770 = null;
        }
    }
}
