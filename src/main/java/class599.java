import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!or")
public class class599 implements Runnable {

    @OriginalMember(owner = "client!or", name = "h", descriptor = "[Laj;")
    public volatile class292[] field8039 = new class292[2];

    @OriginalMember(owner = "client!or", name = "f", descriptor = "Z")
    public volatile boolean field8037 = false;

    @OriginalMember(owner = "client!or", name = "e", descriptor = "Z")
    public volatile boolean field8036 = false;

    @OriginalMember(owner = "client!or", name = "g", descriptor = "I")
    public static int field8038 = -1;

    @OriginalMember(owner = "client!or", name = "b", descriptor = "[Ljava/lang/String;")
    public static String[] field8033 = new String[100];

    @OriginalMember(owner = "client!or", name = "c", descriptor = "Lhd;")
    public static class694 field8034 = new class694(8);

    @OriginalMember(owner = "client!or", name = "d", descriptor = "I")
    public static int field8035;

    @OriginalMember(owner = "client!or", name = "i", descriptor = "Lqj;")
    public class476 field8040;

    @OriginalMember(owner = "client!or", name = "a", descriptor = "[I")
    public static int[] field8032;

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(I)V", line = 11)
    public static void method3298(int arg0) {
        field8033 = null;
        field8034 = null;
        int var1 = -86 / ((arg0 + 43) / 60);
        field8032 = null;
    }

    @OriginalMember(owner = "client!or", name = "run", descriptor = "()V", line = 40)
    public final void run() {
        field8035++;
        this.field8036 = true;
        try {
            while (!this.field8037) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class292 var2 = this.field8039[var1];
                    if (var2 != null) {
                        var2.method1756(false);
                    }
                }
                class700.method3867(29279, 10L);
                class695.method3841(50, null, this.field8040);
            }
        } catch (Exception var9) {
            class564.method2994((byte) 34, null, var9);
        } finally {
            Object var6 = null;
            this.field8036 = false;
        }
    }
}
