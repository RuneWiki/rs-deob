import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class305 extends OutputStream {

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "I")
    public static int field4002;

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "I")
    public static int field4003;

    @OriginalMember(owner = "client!nb", name = "e", descriptor = "I")
    public static int field4005;

    @OriginalMember(owner = "client!nb", name = "d", descriptor = "Lcq;")
    public static class469 field4004;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "[[[B")
    public static byte[][][] field4001;

    @OriginalMember(owner = "client!nb", name = "write", descriptor = "(I)V", line = 3)
    public final void write(int arg0) throws IOException {
        field4003++;
        throw new IOException();
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(B)V", line = 20)
    public static void method1841(byte arg0) {
        field4001 = null;
        if (arg0 > -124) {
            method1841((byte) -90);
        }
        field4004 = null;
    }
}
