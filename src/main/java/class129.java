import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public class class129 implements Runnable {

    @OriginalMember(owner = "client!qi", name = "i", descriptor = "[Ldf;")
    public volatile class55[] field1894 = new class55[2];

    @OriginalMember(owner = "client!qi", name = "g", descriptor = "Z")
    public volatile boolean field1892 = false;

    @OriginalMember(owner = "client!qi", name = "f", descriptor = "Z")
    public volatile boolean field1891 = false;

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "I")
    public static int field1887 = 0;

    @OriginalMember(owner = "client!qi", name = "d", descriptor = "Z")
    public static boolean field1889 = false;

    @OriginalMember(owner = "client!qi", name = "e", descriptor = "Z")
    public static boolean field1890 = false;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "I")
    public static int field1886;

    @OriginalMember(owner = "client!qi", name = "h", descriptor = "I")
    public static int field1893;

    @OriginalMember(owner = "client!qi", name = "c", descriptor = "Lbk;")
    public class20 field1888;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(BLef;I)I")
    public static final int method881(byte arg0, class214 arg1, int arg2) {
        field1893++;
        if (arg0 < 34) {
            field1887 = -15;
        }
        if (!client.method1038(arg1).method484(-1, arg2) && arg1.field3446 == null) {
            return -1;
        } else if (arg1.field3347 == null || arg1.field3347.length <= arg2) {
            return -1;
        } else {
            return arg1.field3347[arg2];
        }
    }

    @OriginalMember(owner = "client!qi", name = "run", descriptor = "()V")
    public final void run() {
        field1886++;
        this.field1891 = true;
        try {
            while (!this.field1892) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class55 var2 = this.field1894[var1];
                    if (var2 != null) {
                        var2.method399(false);
                    }
                }
                class170.method1183(10L, (byte) -68);
                class151.method1005((byte) 76, (Object) null, this.field1888);
            }
        } catch (Exception var9) {
            class48.method359(1, var9, (String) null);
        } finally {
            Object var6 = null;
            this.field1891 = false;
        }
    }
}
