import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public abstract class class244 {

    @OriginalMember(owner = "client!md", name = "c", descriptor = "Lvg;")
    public static class622 field3235 = new class622(47, 0);

    @OriginalMember(owner = "client!md", name = "e", descriptor = "[I")
    public static int[] field3237 = new int[1];

    @OriginalMember(owner = "client!md", name = "b", descriptor = "I")
    public static int field3234;

    @OriginalMember(owner = "client!md", name = "f", descriptor = "I")
    public int field3238;

    @OriginalMember(owner = "client!md", name = "d", descriptor = "Lla;")
    public static class393 field3236;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "Ljava/lang/String;")
    public String field3233;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(I)Ljava/net/Socket;")
    public abstract Socket method1136(int arg0) throws IOException;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(B)V")
    public static void method1494(byte arg0) {
        field3236 = null;
        field3237 = null;
        int var1 = 123 / ((-arg0 - 2) / 49);
        field3235 = null;
    }

    @OriginalMember(owner = "client!md", name = "b", descriptor = "(I)Ljava/net/Socket;")
    public final Socket method1495(int arg0) throws IOException {
        field3234++;
        return arg0 == 1 ? new Socket(this.field3233, this.field3238) : null;
    }
}
