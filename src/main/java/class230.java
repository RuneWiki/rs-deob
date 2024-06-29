import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class230 extends OutputStream {

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "Lul;")
    public static class51 field3836 = new class51(64);

    @OriginalMember(owner = "client!ia", name = "d", descriptor = "[B")
    public static byte[] field3838 = new byte[32896];

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "I")
    public static int field3835;

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "I")
    public static int field3837;

    @OriginalMember(owner = "client!ia", name = "e", descriptor = "I")
    public static int field3839;

    @OriginalMember(owner = "client!ia", name = "f", descriptor = "I")
    public static int field3840;

    @OriginalMember(owner = "client!ia", name = "g", descriptor = "I")
    public static int field3841;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(I)V", line = 6)
    public static final void method1658(int arg0) {
        class341.field5443.method26(228, 7);
        class84.field1353++;
        field3837++;
        class341.field5443.method2333((long) arg0, 60);
    }

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "(I)V", line = 20)
    public static void method1659(int arg0) {
        field3836 = null;
        field3838 = null;
        int var1 = -87 % ((51 - arg0) / 52);
    }

    @OriginalMember(owner = "client!ia", name = "write", descriptor = "(I)V", line = 32)
    public final void write(int arg0) throws IOException {
        field3835++;
        throw new IOException();
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIII)V", line = 43)
    public static final void method1660(int arg0, int arg1, int arg2, int arg3) {
        class257 var4 = class279.field4430[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        class44 var5 = var4.field4152;
        if (var5 != null) {
            var5.field687 = var5.field687 * arg3 / 16;
            var5.field699 = var5.field699 * arg3 / 16;
        }
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 256; var1++) {
            for (int var2 = 0; var2 <= var1; var2++) {
                field3838[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var1 * var1 + var2 * var2 + 65535) / 65535.0F))));
            }
        }
    }
}
