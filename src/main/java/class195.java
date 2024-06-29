import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mu")
public class class195 implements Runnable {

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "[Lkc;")
    public volatile class86[] field2861 = new class86[2];

    @OriginalMember(owner = "client!mu", name = "b", descriptor = "Z")
    public volatile boolean field2862 = false;

    @OriginalMember(owner = "client!mu", name = "f", descriptor = "Z")
    public volatile boolean field2866 = false;

    @OriginalMember(owner = "client!mu", name = "d", descriptor = "[Ljava/lang/String;")
    public static String[] field2864 = new String[100];

    @OriginalMember(owner = "client!mu", name = "h", descriptor = "[[B")
    public static byte[][] field2868 = new byte[50][];

    @OriginalMember(owner = "client!mu", name = "e", descriptor = "I")
    public static int field2865;

    @OriginalMember(owner = "client!mu", name = "c", descriptor = "Lli;")
    public class293 field2863;

    @OriginalMember(owner = "client!mu", name = "g", descriptor = "Lf;")
    public static class529 field2867;

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(B)V", line = 4)
    public static void method1334(byte arg0) {
        field2868 = null;
        field2864 = null;
        if (arg0 > -74) {
            field2864 = null;
        }
        field2867 = null;
    }

    @OriginalMember(owner = "client!mu", name = "run", descriptor = "()V", line = 18)
    public final void run() {
        this.field2866 = true;
        field2865++;
        try {
            while (!this.field2862) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class86 var2 = this.field2861[var1];
                    if (var2 != null) {
                        var2.method670(-11723);
                    }
                }
                class71.method583(10L, -123);
                class57.method514(null, this.field2863, 1);
            }
        } catch (Exception var9) {
            class320.method2087(0, var9, null);
        } finally {
            Object var6 = null;
            this.field2866 = false;
        }
    }
}
