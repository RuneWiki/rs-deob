import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jr")
public class class95 extends OutputStream {

    @OriginalMember(owner = "client!jr", name = "b", descriptor = "[Lwr;")
    public static class421[] field1503 = new class421[35];

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "I")
    public static int field1502;

    @OriginalMember(owner = "client!jr", name = "c", descriptor = "I")
    public static int field1504;

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(B)V", line = 4)
    public static void method778(byte arg0) {
        field1503 = null;
        int var1 = -30 % ((53 - arg0) / 53);
    }

    @OriginalMember(owner = "client!jr", name = "b", descriptor = "(B)V", line = 14)
    public static final void method779(byte arg0) {
        class392[] var1 = class552.field7824;
        synchronized (class552.field7824) {
            int var2 = 0;
            if (arg0 > -28) {
                field1503 = null;
            }
            while (true) {
                if (var2 >= class552.field7824.length) {
                    break;
                }
                class552.field7824[var2] = new class392();
                class97.field1522[var2] = 0;
                var2++;
            }
        }
        field1504++;
    }

    @OriginalMember(owner = "client!jr", name = "write", descriptor = "(I)V", line = 37)
    public final void write(int arg0) throws IOException {
        field1502++;
        throw new IOException();
    }
}
