import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!haa")
public abstract class class71 {

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "I")
    public static int field1254;

    @OriginalMember(owner = "client!haa", name = "b", descriptor = "I")
    public static int field1255;

    @OriginalMember(owner = "client!haa", name = "d", descriptor = "I")
    public int field1257;

    @OriginalMember(owner = "client!haa", name = "e", descriptor = "I")
    public static int field1258;

    @OriginalMember(owner = "client!haa", name = "c", descriptor = "Ljava/lang/String;")
    public String field1256;

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "(IIIII)V")
    public static final void method686(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1254++;
        class135 var5 = class262.method1721((byte) -52);
        var5.field1978.method3853((byte) 51, class370.field5287.field6777);
        var5.field1978.method3853((byte) 51, arg4);
        var5.field1978.method3853((byte) 51, arg1);
        var5.field1978.method3852(false, arg3);
        var5.field1978.method3852(false, arg0);
        class19.method223(var5, 0);
        class661.field9347 = 0;
        class594.field8391 = arg2;
        class619.field8637 = 0;
        class513.field7244 = -3;
    }

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "(BIII)I")
    public static final int method687(byte arg0, int arg1, int arg2, int arg3) {
        field1258++;
        if (arg2 == arg3) {
            return arg2;
        }
        int var4 = -111 % ((arg0 + 56) / 49);
        int var5 = 128 - arg1;
        int var6 = (arg2 & 0x7F) * var5 + (arg3 & 0x7F) * arg1 >> 7;
        int var7 = (arg2 & 0x380) * var5 + (arg3 & 0x380) * arg1 >> 7;
        int var8 = (arg2 & 0xFC00) * var5 + (arg3 & 0xFC00) * arg1 >> 7;
        return var7 & 0x380 | var8 & 0xFC00 | var6 & 0x7F;
    }

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "(B)Ljava/net/Socket;")
    public abstract Socket method688(byte arg0) throws IOException;

    @OriginalMember(owner = "client!haa", name = "b", descriptor = "(B)Ljava/net/Socket;")
    public final Socket method689(byte arg0) throws IOException {
        field1255++;
        return arg0 == 84 ? new Socket(this.field1256, this.field1257) : null;
    }

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "(I)I")
    public static final int method690(int arg0) {
        int var1 = -1;
        for (int var2 = 0; var2 < class519.field7319 - 1; var2++) {
            if (arg0 < class665.field9385[var2] + class279.field4216[var2]) {
                var1 = var2;
                break;
            }
        }
        if (var1 == -1) {
            var1 = class519.field7319 - 1;
        }
        return var1;
    }
}
