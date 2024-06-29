import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lt")
public class class440 extends InputStream {

    @OriginalMember(owner = "client!lt", name = "b", descriptor = "[[B")
    public static byte[][] field6095 = new byte[250][];

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "I")
    public static int field6094;

    @OriginalMember(owner = "client!lt", name = "c", descriptor = "I")
    public static int field6096;

    @OriginalMember(owner = "client!lt", name = "read", descriptor = "()I")
    public final int read() {
        field6096++;
        class111.method713(89, 30000L);
        return -1;
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(B)Lvr;")
    public static final class80 method2580(byte arg0) {
        field6094++;
        if (class395.field5609 == null || class330.field4774 == null) {
            return null;
        }
        class80 var1 = (class80) class330.field4774.method2619((byte) 60);
        if (arg0 <= 78) {
            return null;
        }
        while (var1 != null) {
            class19 var2 = class395.field5604.method490(36, var1.field980);
            if (var2 != null && var2.field256 && var2.method129((byte) -32, class395.field5602)) {
                return var1;
            }
            var1 = (class80) class330.field4774.method2619((byte) 60);
        }
        return null;
    }

    @OriginalMember(owner = "client!lt", name = "b", descriptor = "(B)V")
    public static void method2581(byte arg0) {
        field6095 = null;
        if (arg0 != 2) {
            field6095 = null;
        }
    }
}
