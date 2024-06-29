import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public class class545 extends class126 {

    @OriginalMember(owner = "client!rj", name = "C", descriptor = "I")
    public static int field7384 = 0;

    @OriginalMember(owner = "client!rj", name = "D", descriptor = "I")
    public static int field7385;

    @OriginalMember(owner = "client!rj", name = "G", descriptor = "I")
    public static int field7387;

    @OriginalMember(owner = "client!rj", name = "H", descriptor = "I")
    public static int field7388;

    @OriginalMember(owner = "client!rj", name = "F", descriptor = "Lxa;")
    public static class461 field7386;

    @OriginalMember(owner = "client!rj", name = "I", descriptor = "[B")
    private byte[] field7389;

    @OriginalMember(owner = "client!rj", name = "B", descriptor = "[Lee;")
    public static class621[] field7383;

    @OriginalMember(owner = "client!rj", name = "f", descriptor = "(B)V")
    public static void method2999(byte arg0) {
        field7386 = null;
        if (arg0 != 126) {
            field7384 = 19;
        }
        field7383 = null;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(ILpea;Lpea;)V")
    public static final void method3000(int arg0, class665 arg1, class665 arg2) {
        field7387++;
        if (arg1.field9370 != null) {
            arg1.method3691((byte) -119);
        }
        arg1.field9368 = arg2.field9368;
        arg1.field9370 = arg2;
        arg1.field9370.field9368 = arg1;
        arg1.field9368.field9370 = arg1;
        if (arg0 != 5) {
            field7386 = null;
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(BIII)[B")
    public final byte[] method3001(byte arg0, int arg1, int arg2, int arg3) {
        field7385++;
        if (arg0 != -53) {
            this.method3001((byte) -45, -42, -41, -30);
        }
        this.field7389 = new byte[arg2 * arg3 * arg1 * 2];
        this.method1824(arg3, 255, arg2, arg1);
        return this.field7389;
    }

    @OriginalMember(owner = "client!rj", name = "<init>", descriptor = "()V")
    public class545() {
        super(12, 5, 16, 2, 2, 0.45F);
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IZB)V")
    public final void method899(int arg0, boolean arg1, byte arg2) {
        field7388++;
        if (!arg1) {
            return;
        }
        int var4 = arg0 * 2;
        byte var5 = (byte) (((arg2 & 0xFF) >> 1) + 127);
        int var6 = var4 + 1;
        this.field7389[var4] = var5;
        this.field7389[var6] = var5;
    }
}
