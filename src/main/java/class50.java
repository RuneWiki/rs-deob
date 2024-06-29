import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qk")
public class class50 implements Runnable {

    @OriginalMember(owner = "client!qk", name = "g", descriptor = "Z")
    public boolean field823 = true;

    @OriginalMember(owner = "client!qk", name = "c", descriptor = "Ljava/lang/Object;")
    public Object field819 = new Object();

    @OriginalMember(owner = "client!qk", name = "i", descriptor = "[I")
    public int[] field825 = new int[500];

    @OriginalMember(owner = "client!qk", name = "j", descriptor = "[I")
    public int[] field826 = new int[500];

    @OriginalMember(owner = "client!qk", name = "k", descriptor = "I")
    public int field827 = 0;

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "I")
    public static int field818 = 0;

    @OriginalMember(owner = "client!qk", name = "f", descriptor = "[I")
    public static int[] field822 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "I")
    public static int field817;

    @OriginalMember(owner = "client!qk", name = "d", descriptor = "I")
    public static int field820;

    @OriginalMember(owner = "client!qk", name = "e", descriptor = "I")
    public static int field821;

    @OriginalMember(owner = "client!qk", name = "h", descriptor = "Ldd;")
    public static class211 field824;

    @OriginalMember(owner = "client!qk", name = "run", descriptor = "()V")
    public final void run() {
        while (this.field823) {
            Object var1 = this.field819;
            synchronized (this.field819) {
                if (this.field827 < 500) {
                    this.field826[this.field827] = class18.field288;
                    this.field825[this.field827] = class32.field528;
                    this.field827++;
                }
            }
            class212.method1488(50L, -82);
        }
        field821++;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(I)V")
    public static void method314(int arg0) {
        field824 = null;
        if (arg0 != 22082) {
            field824 = null;
        }
        field822 = null;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(BI)I")
    public static final int method315(byte arg0, int arg1) {
        field820++;
        return arg0 < 84 ? 74 : arg1 & 0x7F;
    }
}
