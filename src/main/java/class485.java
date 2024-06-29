import java.applet.Applet;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public class class485 extends class419 {

    @OriginalMember(owner = "client!li", name = "B", descriptor = "Ljava/lang/String;")
    public static String field6554 = null;

    @OriginalMember(owner = "client!li", name = "E", descriptor = "I")
    public static int field6557 = -1;

    @OriginalMember(owner = "client!li", name = "y", descriptor = "I")
    public static int field6551;

    @OriginalMember(owner = "client!li", name = "z", descriptor = "I")
    public static int field6552;

    @OriginalMember(owner = "client!li", name = "A", descriptor = "I")
    public static int field6553;

    @OriginalMember(owner = "client!li", name = "C", descriptor = "I")
    public static int field6555;

    @OriginalMember(owner = "client!li", name = "D", descriptor = "I")
    public static int field6556;

    @OriginalMember(owner = "client!li", name = "F", descriptor = "Ljava/applet/Applet;")
    public static Applet field6558;

    @OriginalMember(owner = "client!li", name = "x", descriptor = "[B")
    private byte[] field6550;

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(IIB)V", line = 8)
    public final void method2539(int arg0, int arg1, byte arg2) {
        field6551++;
        int var4 = arg1 * 2;
        if (arg0 != 255) {
            this.method2539(22, -123, (byte) -19);
        }
        byte var5 = (byte) ((arg2 >> 1 & 0x7F) + 127);
        this.field6550[var4++] = var5;
        this.field6550[var4] = var5;
    }

    @OriginalMember(owner = "client!li", name = "b", descriptor = "(IIII)[B", line = 24)
    public final byte[] method2844(int arg0, int arg1, int arg2, int arg3) {
        field6555++;
        this.field6550 = new byte[arg0 * arg3 * arg1 * 2];
        this.method1217(59, arg1, arg0, arg3);
        if (arg2 != 24683) {
            this.method2844(26, -84, -79, 50);
        }
        return this.field6550;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(B)V", line = 37)
    public static void method2845(byte arg0) {
        field6558 = null;
        int var1 = 85 % ((34 - arg0) / 46);
        field6554 = null;
    }

    @OriginalMember(owner = "client!li", name = "<init>", descriptor = "()V", line = 55)
    public class485() {
        super(12, 5, 16, 2, 2, 0.45F);
    }
}
