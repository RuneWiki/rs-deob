import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class296 implements Runnable {

    @OriginalMember(owner = "client!ff", name = "f", descriptor = "[Lvm;")
    public volatile class208[] field3848 = new class208[2];

    @OriginalMember(owner = "client!ff", name = "d", descriptor = "Z")
    public volatile boolean field3846 = false;

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "Z")
    public volatile boolean field3844 = false;

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "Lus;")
    public static class328 field3845 = new class328(68, -1);

    @OriginalMember(owner = "client!ff", name = "i", descriptor = "[I")
    public static int[] field3851 = new int[1000];

    @OriginalMember(owner = "client!ff", name = "h", descriptor = "I")
    public static int field3850 = 2;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "I")
    public static int field3843;

    @OriginalMember(owner = "client!ff", name = "g", descriptor = "I")
    public static int field3849;

    @OriginalMember(owner = "client!ff", name = "e", descriptor = "Lnga;")
    public class256 field3847;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Z)V")
    public static void method1765(boolean arg0) {
        field3845 = null;
        field3851 = null;
        if (!arg0) {
            field3850 = -35;
        }
    }

    @OriginalMember(owner = "client!ff", name = "run", descriptor = "()V")
    public final void run() {
        field3843++;
        this.field3844 = true;
        try {
            while (!this.field3846) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class208 var2 = this.field3848[var1];
                    if (var2 != null) {
                        var2.method1276((byte) 30);
                    }
                }
                class517.method2965(10L, -103);
                class643.method3491((byte) -73, this.field3847, null);
            }
        } catch (Exception var9) {
            class486.method2844((byte) -1, null, var9);
        } finally {
            Object var6 = null;
            this.field3844 = false;
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(ILjava/lang/String;)V")
    public static final void method1766(int arg0, String arg1) {
        field3849++;
        class650 var2 = class158.method983(75);
        var2.field8928.method1141(class283.field3612.field2536, -90);
        var2.field8928.method1157(0, (byte) 124);
        int var3 = var2.field8928.field2354;
        var2.field8928.method1157(636, (byte) 121);
        int[] var4 = class487.method2847((byte) -94, var2);
        int var5 = var2.field8928.field2354;
        var2.field8928.method1110(arg1, -30452);
        var2.field8928.method1141(class416.field5920, -110);
        var2.field8928.field2354 += 7;
        var2.field8928.method1149(var5, var4, (byte) 94, var2.field8928.field2354);
        if (arg0 < 41) {
            field3845 = null;
        }
        var2.field8928.method1090(var2.field8928.field2354 - var3, 114);
        class108.method745(var2, -85);
        class272.field3446 = 1;
        class486.field6915 = 0;
        class722.field10163 = 0;
        class219.field2784 = -3;
    }
}
