import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class45 implements Runnable {

    @OriginalMember(owner = "client!u", name = "e", descriptor = "Z")
    public boolean field572 = true;

    @OriginalMember(owner = "client!u", name = "c", descriptor = "Ljava/lang/Object;")
    public Object field570 = new Object();

    @OriginalMember(owner = "client!u", name = "f", descriptor = "I")
    public int field573 = 0;

    @OriginalMember(owner = "client!u", name = "h", descriptor = "[I")
    public int[] field575 = new int[500];

    @OriginalMember(owner = "client!u", name = "g", descriptor = "[I")
    public int[] field574 = new int[500];

    @OriginalMember(owner = "client!u", name = "b", descriptor = "I")
    public static int field569;

    @OriginalMember(owner = "client!u", name = "d", descriptor = "I")
    public static int field571;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "Lmo;")
    public static class447 field568;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IZ)V")
    public static final void method295(int arg0, boolean arg1) {
        class142.field2254.method337(arg0, (byte) -107);
        field569++;
        if (arg1) {
            field568 = null;
        }
        class102.field1417.method337(arg0, (byte) -119);
    }

    @OriginalMember(owner = "client!u", name = "run", descriptor = "()V")
    public final void run() {
        while (this.field572) {
            Object var1 = this.field570;
            synchronized (this.field570) {
                if (this.field573 < 500) {
                    this.field575[this.field573] = class414.field6125;
                    this.field574[this.field573] = class287.field4604;
                    this.field573++;
                }
            }
            class84.method517((byte) -15, 50L);
        }
        field571++;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(I)V")
    public static void method296(int arg0) {
        field568 = null;
        if (arg0 != -18458) {
            field568 = null;
        }
    }
}
