import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public class class361 extends OutputStream {

    @OriginalMember(owner = "client!dj", name = "c", descriptor = "Lls;")
    public static class149 field5059 = new class149("RC", 1);

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "I")
    public static int field5057;

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "I")
    public static int field5058;

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(I)V")
    public static final void method2274(int arg0) {
        field5057++;
        class216.field3354 = new class574(8);
        class380.field5260 = 0;
        int var1 = 115 % ((arg0 + 18) / 48);
        for (class593 var2 = (class593) class20.field339.method2170(false); var2 != null; var2 = (class593) class20.field339.method2176(-17754)) {
            var2.method3460();
        }
    }

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "(I)V")
    public static void method2275(int arg0) {
        field5059 = null;
        if (arg0 != 0) {
            field5059 = null;
        }
    }

    @OriginalMember(owner = "client!dj", name = "write", descriptor = "(I)V")
    public final void write(int arg0) throws IOException {
        field5058++;
        throw new IOException();
    }
}
