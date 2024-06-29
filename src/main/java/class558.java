import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fs")
public class class558 extends class419 {

    @OriginalMember(owner = "client!fs", name = "x", descriptor = "[Ljava/lang/String;")
    public static String[] field7935 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!fs", name = "z", descriptor = "I")
    public static int field7937;

    @OriginalMember(owner = "client!fs", name = "A", descriptor = "I")
    public static int field7938;

    @OriginalMember(owner = "client!fs", name = "B", descriptor = "I")
    public static int field7939;

    @OriginalMember(owner = "client!fs", name = "C", descriptor = "J")
    public static long field7940;

    @OriginalMember(owner = "client!fs", name = "y", descriptor = "[B")
    private byte[] field7936;

    @OriginalMember(owner = "client!fs", name = "<init>", descriptor = "()V")
    public class558() {
        super(12, 5, 16, 2, 2, 0.45F);
    }

    @OriginalMember(owner = "client!fs", name = "g", descriptor = "(I)Z")
    public static final boolean method3344(int arg0) {
        class19.field236++;
        if (arg0 == -25520) {
            class97.field1408 = true;
            field7937++;
            return true;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!fs", name = "b", descriptor = "(IIII)[B")
    public final byte[] method3345(int arg0, int arg1, int arg2, int arg3) {
        field7939++;
        this.field7936 = new byte[arg0 * 2 * arg1 * arg3];
        this.method1217(arg2 ^ 0xFFFF9FE6, arg1, arg0, arg3);
        if (arg2 != 24683) {
            this.method3345(-76, -69, 67, 45);
        }
        return this.field7936;
    }

    @OriginalMember(owner = "client!fs", name = "h", descriptor = "(I)V")
    public static void method3346(int arg0) {
        if (arg0 == -29527) {
            field7935 = null;
        }
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(IIB)V")
    public final void method2539(int arg0, int arg1, byte arg2) {
        field7938++;
        int var4 = arg1 * 2;
        byte var5 = (byte) (((arg2 & arg0) >> 1) + 127);
        int var10001 = var4;
        int var6 = var4 + 1;
        this.field7936[var10001] = var5;
        this.field7936[var6] = var5;
    }
}
