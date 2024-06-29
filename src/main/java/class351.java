import java.applet.Applet;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class351 extends class402 {

    @OriginalMember(owner = "client!ae", name = "E", descriptor = "I")
    public static int field5135 = 1338;

    @OriginalMember(owner = "client!ae", name = "J", descriptor = "I")
    public static int field5140 = -1;

    @OriginalMember(owner = "client!ae", name = "D", descriptor = "I")
    public static int field5134;

    @OriginalMember(owner = "client!ae", name = "G", descriptor = "I")
    public static int field5137;

    @OriginalMember(owner = "client!ae", name = "I", descriptor = "I")
    public static int field5139;

    @OriginalMember(owner = "client!ae", name = "H", descriptor = "Ljava/applet/Applet;")
    public static Applet field5138;

    @OriginalMember(owner = "client!ae", name = "F", descriptor = "[B")
    private byte[] field5136;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(ZIII)[B", line = 4)
    public final byte[] method2227(boolean arg0, int arg1, int arg2, int arg3) {
        field5137++;
        this.field5136 = new byte[arg1 * arg2 * arg3 * 2];
        this.method470(arg1, arg3, arg0, arg2);
        if (!arg0) {
            this.field5136 = null;
        }
        return this.field5136;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IZB)V", line = 17)
    public final void method2228(int arg0, boolean arg1, byte arg2) {
        field5139++;
        int var4 = arg0 * 2;
        int var5 = arg2 & 0xFF;
        int var10001 = var4;
        int var6 = var4 + 1;
        this.field5136[var10001] = (byte) (var5 * 3 >> 5);
        if (arg1) {
            this.method2228(114, true, (byte) -15);
        }
        this.field5136[var6] = (byte) (var5 * 3 >> 5);
    }

    @OriginalMember(owner = "client!ae", name = "<init>", descriptor = "()V", line = 37)
    public class351() {
        super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
    }

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "(B)V", line = 42)
    public static void method2229(byte arg0) {
        if (arg0 != 35) {
            method2229((byte) -95);
        }
        field5138 = null;
    }
}
