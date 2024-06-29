import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bv")
public abstract class class281 {

    @OriginalMember(owner = "client!bv", name = "b", descriptor = "Lju;")
    public static class111 field4177 = new class111("LOCAL", 4);

    @OriginalMember(owner = "client!bv", name = "e", descriptor = "Lsb;")
    public static class266 field4180 = new class266(81, 8);

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "I")
    public static int field4176;

    @OriginalMember(owner = "client!bv", name = "c", descriptor = "I")
    public int field4178;

    @OriginalMember(owner = "client!bv", name = "d", descriptor = "I")
    public static int field4179;

    @OriginalMember(owner = "client!bv", name = "f", descriptor = "Ljava/lang/String;")
    public String field4181;

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(I)Ljava/net/Socket;")
    public abstract Socket method1857(int arg0) throws IOException;

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(B)V")
    public static void method1858(byte arg0) {
        if (arg0 != 7) {
            method1858((byte) -51);
        }
        field4180 = null;
        field4177 = null;
    }

    @OriginalMember(owner = "client!bv", name = "b", descriptor = "(I)Ljava/net/Socket;")
    public final Socket method1859(int arg0) throws IOException {
        field4176++;
        if (arg0 != 4) {
            method1858((byte) 54);
        }
        return new Socket(this.field4181, this.field4178);
    }
}
