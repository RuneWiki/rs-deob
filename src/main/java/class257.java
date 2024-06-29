import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public class class257 implements Runnable {

    @OriginalMember(owner = "client!rk", name = "h", descriptor = "Z")
    public boolean field4424 = true;

    @OriginalMember(owner = "client!rk", name = "c", descriptor = "Ljava/lang/Object;")
    public Object field4419 = new Object();

    @OriginalMember(owner = "client!rk", name = "j", descriptor = "[I")
    public int[] field4426 = new int[500];

    @OriginalMember(owner = "client!rk", name = "i", descriptor = "I")
    public int field4425 = 0;

    @OriginalMember(owner = "client!rk", name = "k", descriptor = "[I")
    public int[] field4427 = new int[500];

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "I")
    public static int field4417 = 0;

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "I")
    public static int field4418 = 0;

    @OriginalMember(owner = "client!rk", name = "e", descriptor = "[Z")
    public static boolean[] field4421 = new boolean[8];

    @OriginalMember(owner = "client!rk", name = "d", descriptor = "I")
    public static int field4420;

    @OriginalMember(owner = "client!rk", name = "f", descriptor = "I")
    public static int field4422;

    @OriginalMember(owner = "client!rk", name = "g", descriptor = "[Z")
    public static boolean[] field4423;

    @OriginalMember(owner = "client!rk", name = "run", descriptor = "()V")
    public final void run() {
        while (this.field4424) {
            Object var1 = this.field4419;
            synchronized (this.field4419) {
                if (this.field4425 < 500) {
                    this.field4427[this.field4425] = class28.field515;
                    this.field4426[this.field4425] = class174.field3059;
                    this.field4425++;
                }
            }
            class84.method645(1, 50L);
        }
        field4422++;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(B)V")
    public static void method1738(byte arg0) {
        if (arg0 >= -38) {
            field4423 = null;
        }
        field4421 = null;
        field4423 = null;
    }
}
