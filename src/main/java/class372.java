import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!up")
public class class372 implements Runnable {

    @OriginalMember(owner = "client!up", name = "c", descriptor = "[Lhq;")
    public volatile class552[] field4948 = new class552[2];

    @OriginalMember(owner = "client!up", name = "f", descriptor = "Z")
    public volatile boolean field4951 = false;

    @OriginalMember(owner = "client!up", name = "b", descriptor = "Z")
    public volatile boolean field4947 = false;

    @OriginalMember(owner = "client!up", name = "a", descriptor = "I")
    public static int field4946;

    @OriginalMember(owner = "client!up", name = "d", descriptor = "I")
    public static int field4949;

    @OriginalMember(owner = "client!up", name = "e", descriptor = "I")
    public static int field4950;

    @OriginalMember(owner = "client!up", name = "g", descriptor = "Lgba;")
    public class388 field4952;

    @OriginalMember(owner = "client!up", name = "run", descriptor = "()V")
    public final void run() {
        field4946++;
        this.field4947 = true;
        try {
            while (!this.field4951) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class552 var2 = this.field4948[var1];
                    if (var2 != null) {
                        var2.method3088((byte) 109);
                    }
                }
                class588.method3253(0, 10L);
                class333.method1965(this.field4952, null, false);
            }
        } catch (Exception var9) {
            class91.method499(null, var9, (byte) -117);
        } finally {
            Object var6 = null;
            this.field4947 = false;
        }
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(ILhe;)V")
    public static final void method2142(int arg0, class231 arg1) {
        field4949++;
        int var2 = arg1.field3036 - class327.field4404;
        int var3 = arg1.field3050 * 512 + arg1.method1435((byte) 117) * 256;
        int var4 = arg1.field3060 * 512 + arg1.method1435((byte) 125) * 256;
        arg1.field398 += (var3 - arg1.field398) / var2;
        arg1.field397 += (var4 - arg1.field397) / var2;
        arg1.field3087 = 0;
        if (arg1.field3069 == 0) {
            arg1.method1427(10973, 8192);
        }
        if (arg1.field3069 == 1) {
            arg1.method1427(arg0 ^ 0x4B6, 12288);
        }
        if (arg0 != 11883) {
            method2142(-97, null);
        }
        if (arg1.field3069 == 2) {
            arg1.method1427(10973, 0);
        }
        if (arg1.field3069 == 3) {
            arg1.method1427(arg0 ^ 0x4B6, 4096);
        }
    }
}
