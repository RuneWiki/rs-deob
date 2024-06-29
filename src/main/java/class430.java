import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vq")
public class class430 extends OutputStream {

    @OriginalMember(owner = "client!vq", name = "c", descriptor = "I")
    public static int field5433 = 1405;

    @OriginalMember(owner = "client!vq", name = "f", descriptor = "[I")
    public static int[] field5436 = new int[14];

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "I")
    public static int field5431;

    @OriginalMember(owner = "client!vq", name = "b", descriptor = "I")
    public static int field5432;

    @OriginalMember(owner = "client!vq", name = "d", descriptor = "I")
    public static int field5434;

    @OriginalMember(owner = "client!vq", name = "e", descriptor = "I")
    public static int field5435;

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(ZII)Z", line = 4)
    public static final boolean method2365(boolean arg0, int arg1, int arg2) {
        if (arg0) {
            field5432++;
            return (arg1 & 0x84080) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(I)V", line = 16)
    public static void method2366(int arg0) {
        if (arg0 != 14) {
            field5431 = -107;
        }
        field5436 = null;
    }

    @OriginalMember(owner = "client!vq", name = "b", descriptor = "(I)V", line = 26)
    public static final void method2367(int arg0) {
        if (class595.field7986 == null || class618.field8383 == null) {
            class595.field7986 = new int[256];
            class618.field8383 = new int[256];
            for (int var1 = 0; var1 < 256; var1++) {
                double var2 = (double) var1 / 255.0D * 6.283185307179586D;
                class595.field7986[var1] = (int) (Math.sin(var2) * 4096.0D);
                class618.field8383[var1] = (int) (Math.cos(var2) * 4096.0D);
            }
        }
        field5435++;
        if (arg0 != -10177) {
            method2367(-57);
        }
    }

    @OriginalMember(owner = "client!vq", name = "write", descriptor = "(I)V", line = 57)
    public final void write(int arg0) throws IOException {
        field5434++;
        throw new IOException();
    }
}
