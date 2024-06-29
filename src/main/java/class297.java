import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public class class297 extends OutputStream {

    @OriginalMember(owner = "client!q", name = "d", descriptor = "Z")
    public static boolean field4526 = false;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "I")
    public static int field4523;

    @OriginalMember(owner = "client!q", name = "c", descriptor = "I")
    public static int field4525;

    @OriginalMember(owner = "client!q", name = "e", descriptor = "I")
    public static int field4527;

    @OriginalMember(owner = "client!q", name = "b", descriptor = "[I")
    public static int[] field4524;

    @OriginalMember(owner = "client!q", name = "write", descriptor = "(I)V", line = 4)
    public final void write(int arg0) throws IOException {
        field4523++;
        throw new IOException();
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(ZII)V", line = 13)
    public static final void method1927(boolean arg0, int arg1, int arg2) {
        field4525++;
        class240 var3 = class516.method3061((byte) -30, arg0, arg2);
        if (var3 == null) {
            return;
        }
        if (arg1 > -71) {
            field4524 = null;
        }
        for (int var4 = 0; var4 < var3.field3835.length; var4++) {
            var3.field3835[var4] = -1;
            var3.field3829[var4] = 0;
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(II)I", line = 38)
    public static final int method1928(int arg0, int arg1) {
        field4527++;
        int var2 = 0;
        int var3 = -23 % ((48 - arg0) / 41);
        if (arg1 < 0 || arg1 >= 65536) {
            var2 += 16;
            arg1 >>>= 0x10;
        }
        if (arg1 >= 256) {
            var2 += 8;
            arg1 >>>= 0x8;
        }
        if (arg1 >= 16) {
            arg1 >>>= 0x4;
            var2 += 4;
        }
        if (arg1 >= 4) {
            var2 += 2;
            arg1 >>>= 0x2;
        }
        if (arg1 >= 1) {
            var2++;
            arg1 >>>= 0x1;
        }
        return var2 + arg1;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(III)Lfq;", line = 83)
    public static final class138 method1929(int arg0, int arg1, int arg2) {
        if (client.field3311[arg0][arg1][arg2] == null) {
            boolean var3 = client.field3311[0][arg1][arg2] != null && client.field3311[0][arg1][arg2].field2101 != null;
            if (var3 && arg0 >= class213.field3467 - 1) {
                return null;
            }
            class229.method1621(arg0, arg1, arg2);
        }
        return client.field3311[arg0][arg1][arg2];
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(I)V", line = 97)
    public static void method1930(int arg0) {
        if (arg0 != -25631) {
            method1929(-85, 77, -3);
        }
        field4524 = null;
    }
}
