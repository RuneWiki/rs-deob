import java.awt.Dimension;
import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bja")
public class class242 extends OutputStream {

    @OriginalMember(owner = "client!bja", name = "f", descriptor = "Z")
    public static boolean field3915 = false;

    @OriginalMember(owner = "client!bja", name = "c", descriptor = "[B")
    public static byte[] field3912;

    @OriginalMember(owner = "client!bja", name = "a", descriptor = "I")
    public static int field3910;

    @OriginalMember(owner = "client!bja", name = "b", descriptor = "I")
    public static int field3911;

    @OriginalMember(owner = "client!bja", name = "d", descriptor = "I")
    public static int field3913;

    @OriginalMember(owner = "client!bja", name = "e", descriptor = "I")
    public static int field3914;

    @OriginalMember(owner = "client!bja", name = "a", descriptor = "(I[BII)[B")
    public static final byte[] method1679(int arg0, byte[] arg1, int arg2, int arg3) {
        if (arg2 == 32896) {
            field3911++;
            byte[] var4 = new byte[arg3];
            class571.method3313(arg1, arg0, var4, 0, arg3);
            return var4;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!bja", name = "write", descriptor = "(I)V")
    public final void write(int arg0) throws IOException {
        field3913++;
        throw new IOException();
    }

    @OriginalMember(owner = "client!bja", name = "a", descriptor = "(I)V")
    public static final void method1680(int arg0) {
        field3914++;
        if (class364.field5573.method379()) {
            class364.field5573.method390(class400.field5941);
            class333.method2138(1);
            if (class250.field3989) {
                class329.method2126(class400.field5941, (byte) 78);
            } else {
                Dimension var1 = class400.field5941.getSize();
                class364.field5573.method308(class400.field5941, var1.width, var1.height);
            }
            class364.field5573.method317(class400.field5941);
        } else {
            class526.method3125(1221653740, class654.field9289.field5415.method2004(3), false);
        }
        if (arg0 < 73) {
            method1679(117, null, -92, 29);
        }
        class353.method2259((byte) -101);
        class245.field3947 = true;
    }

    @OriginalMember(owner = "client!bja", name = "a", descriptor = "(ILofa;)Lhca;")
    public static final class241 method1681(int arg0, class301 arg1) {
        if (arg0 != 14064) {
            field3915 = true;
        }
        field3910++;
        return new class241(arg1.method1977((byte) 124), arg1.method1977((byte) -24), arg1.method1977((byte) 0), arg1.method1977((byte) 69), arg1.method1952(22085), arg1.method1987(-80));
    }

    @OriginalMember(owner = "client!bja", name = "b", descriptor = "(I)V")
    public static void method1682(int arg0) {
        if (arg0 != 256) {
            field3915 = true;
        }
        field3912 = null;
    }

    static {
        int var0 = 0;
        field3912 = new byte[32896];
        for (int var1 = 0; var1 < 256; var1++) {
            for (int var2 = 0; var2 <= var1; var2++) {
                field3912[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var1 * var1 + var2 * var2 + 65535) / 65535.0F))));
            }
        }
    }
}
