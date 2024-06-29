import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gj")
public class class732 extends class147 {

    @OriginalMember(owner = "client!gj", name = "t", descriptor = "Lss;")
    public static class307 field10177 = new class307("", 10);

    @OriginalMember(owner = "client!gj", name = "z", descriptor = "[I")
    public static int[] field10183 = new int[5];

    @OriginalMember(owner = "client!gj", name = "y", descriptor = "I")
    public static int field10182 = 0;

    @OriginalMember(owner = "client!gj", name = "s", descriptor = "B")
    private byte field10176;

    @OriginalMember(owner = "client!gj", name = "u", descriptor = "B")
    private byte field10178;

    @OriginalMember(owner = "client!gj", name = "v", descriptor = "I")
    public static int field10179;

    @OriginalMember(owner = "client!gj", name = "w", descriptor = "I")
    public static int field10180;

    @OriginalMember(owner = "client!gj", name = "x", descriptor = "I")
    public static int field10181;

    @OriginalMember(owner = "client!gj", name = "A", descriptor = "I")
    public static int field10184;

    @OriginalMember(owner = "client!gj", name = "r", descriptor = "Ljava/lang/String;")
    private String field10175;

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(Lhi;B)V", line = 6)
    public final void method1161(class465 arg0, byte arg1) {
        int var3 = -89 / ((36 - arg1) / 60);
        field10184++;
        arg0.field6331 = this.field10175;
        if (this.field10175 != null) {
            arg0.field6332 = this.field10178;
            arg0.field6342 = this.field10176;
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(Lol;I)V", line = 25)
    public final void method1162(class431 arg0, int arg1) {
        field10180++;
        this.field10175 = arg0.method2578(1712145680);
        if (arg1 <= -15 && this.field10175 != null) {
            arg0.method2557(14929);
            this.field10176 = arg0.method2529(111);
            this.field10178 = arg0.method2529(117);
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(B)V", line = 53)
    public static void method4056(byte arg0) {
        if (arg0 < -125) {
            field10177 = null;
            field10183 = null;
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(ZII)Z", line = 65)
    public static final boolean method4057(boolean arg0, int arg1, int arg2) {
        if (arg0) {
            field10181 = 20;
        }
        field10179++;
        return (arg1 & 0x34) != 0;
    }
}
