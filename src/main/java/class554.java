import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public class class554 {

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "I")
    public static int field7290;

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "I")
    public static int field7291;

    @OriginalMember(owner = "client!ii", name = "d", descriptor = "I")
    public static int field7292;

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field7289;

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(ZIIII)V")
    public static final void method3084(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        class596.method3236((byte) -114);
        field7292++;
        class497.field6699 = 0L;
        if (arg4 != -1) {
            return;
        }
        int var5 = class343.method2050((byte) -112);
        if (arg1 == 3 || var5 == 3) {
            arg0 = true;
        }
        if (!class341.field4807.method443()) {
            arg0 = true;
        }
        class595.method3232(108, var5, arg2, arg3, arg0, arg1);
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "([BI)[B")
    public final byte[] method3085(byte[] arg0, int arg1) {
        field7291++;
        if (arg1 != -18) {
            this.field7289 = null;
        }
        class677 var3 = new class677(arg0);
        var3.field9419 = arg0.length - 4;
        int var4 = var3.method3800((byte) -127);
        var3.field9419 = 0;
        byte[] var5 = new byte[var4];
        this.method3086(var3, var5, arg1 + 134);
        return var5;
    }

    @OriginalMember(owner = "client!ii", name = "<init>", descriptor = "()V")
    public class554() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(Lee;[BI)V")
    public final void method3086(class677 arg0, byte[] arg1, int arg2) {
        field7290++;
        if (arg0.field9399[arg0.field9419] != 31 || arg0.field9399[arg0.field9419 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field7289 == null) {
            this.field7289 = new Inflater(true);
        }
        try {
            this.field7289.setInput(arg0.field9399, arg0.field9419 + 10, -arg0.field9419 + -18 + arg0.field9399.length);
            this.field7289.inflate(arg1);
            if (arg2 != 116) {
                this.field7289 = null;
            }
        } catch (Exception var4) {
            this.field7289.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field7289.reset();
    }

    @OriginalMember(owner = "client!ii", name = "<init>", descriptor = "(III)V")
    private class554(int arg0, int arg1, int arg2) {
    }
}
