import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cda")
public abstract class class173 {

    @OriginalMember(owner = "client!cda", name = "d", descriptor = "I")
    public static int field2146 = -2;

    @OriginalMember(owner = "client!cda", name = "b", descriptor = "I")
    public static int field2144;

    @OriginalMember(owner = "client!cda", name = "c", descriptor = "I")
    public static int field2145;

    @OriginalMember(owner = "client!cda", name = "f", descriptor = "I")
    public static int field2148;

    @OriginalMember(owner = "client!cda", name = "g", descriptor = "I")
    public int field2149;

    @OriginalMember(owner = "client!cda", name = "e", descriptor = "Lqp;")
    public static class657 field2147;

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "Ljava/lang/String;")
    public String field2143;

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "(I)Ljava/net/Socket;")
    public abstract Socket method995(int arg0) throws IOException;

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "(ILji;)V")
    public static final void method996(int arg0, class611 arg1) {
        field2144++;
        if ((arg1.field8529.length - arg1.field8520) < 1) {
            return;
        }
        int var2 = arg1.method3428((byte) 38);
        if (var2 < 0 || var2 > 1 || arg0 != 10090 || (arg1.field8529.length - arg1.field8520) < 2) {
            return;
        }
        int var3 = arg1.method3402((byte) 127);
        if ((arg1.field8529.length - arg1.field8520) < (var3 * 6)) {
            return;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = arg1.method3402((byte) 127);
            int var6 = arg1.method3418(-2);
            if (class161.field2024.length > var5 && class633.field8794[var5] && (class580.field8129.method3242(var5, 101).field1804 != '1' || var6 >= -1 && var6 <= 1)) {
                class161.field2024[var5] = var6;
            }
        }
    }

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "(Z)V")
    public static void method997(boolean arg0) {
        field2147 = null;
        if (!arg0) {
            method997(false);
        }
    }

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "(B)Ljava/net/Socket;")
    public final Socket method998(byte arg0) throws IOException {
        if (arg0 != -53) {
            field2147 = null;
        }
        field2148++;
        return new Socket(this.field2143, this.field2149);
    }

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "(I[BI)I")
    public static final int method999(int arg0, byte[] arg1, int arg2) {
        field2145++;
        if (arg2 != -30091) {
            field2147 = null;
        }
        return class50.method293(arg0, arg1, 0, false);
    }
}
