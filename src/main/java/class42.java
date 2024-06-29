import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!maa")
public class class42 extends OutputStream {

    @OriginalMember(owner = "client!maa", name = "c", descriptor = "[I")
    public static int[] field579 = new int[256];

    @OriginalMember(owner = "client!maa", name = "f", descriptor = "[I")
    public static int[] field582;

    @OriginalMember(owner = "client!maa", name = "e", descriptor = "[I")
    public static int[] field581;

    @OriginalMember(owner = "client!maa", name = "d", descriptor = "[I")
    public static int[] field580;

    @OriginalMember(owner = "client!maa", name = "a", descriptor = "I")
    public static int field577;

    @OriginalMember(owner = "client!maa", name = "b", descriptor = "I")
    public static int field578;

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field579[var0] = var1;
        }
        field582 = new int[1];
        field581 = new int[] { 28, 35, 40, 44 };
        field580 = new int[14];
    }

    @OriginalMember(owner = "client!maa", name = "write", descriptor = "(I)V", line = 5)
    public final void write(int arg0) throws IOException {
        field577++;
        throw new IOException();
    }

    @OriginalMember(owner = "client!maa", name = "a", descriptor = "(I)V", line = 14)
    public static void method375(int arg0) {
        field580 = null;
        if (arg0 >= 29) {
            field581 = null;
            field582 = null;
            field579 = null;
        }
    }

    @OriginalMember(owner = "client!maa", name = "b", descriptor = "(I)Lgb;", line = 35)
    public static final class153 method376(int arg0) {
        field578++;
        if (class212.field3106 == null || class609.field8666 == null) {
            return null;
        }
        int var1 = 63 % ((arg0 - 30) / 56);
        for (class153 var2 = (class153) class609.field8666.method1876(0); var2 != null; var2 = (class153) class609.field8666.method1876(0)) {
            class192 var3 = class212.field3095.method70(var2.field2298, 109);
            if (var3 != null && var3.field2744 && var3.method1272(-127, class212.field3090)) {
                return var2;
            }
        }
        return null;
    }
}
