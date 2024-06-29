import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class25 extends InputStream {

    @OriginalMember(owner = "client!bd", name = "e", descriptor = "Leg;")
    public static class37 field358 = class174.method1167("clignotant1:", -101);

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "I")
    public static int field355 = 0;

    @OriginalMember(owner = "client!bd", name = "g", descriptor = "[I")
    public static int[] field360 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!bd", name = "f", descriptor = "Leg;")
    public static class37 field359 = class174.method1167(":clanreq:", 113);

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "I")
    public static int field354 = 0;

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "I")
    public static int field356;

    @OriginalMember(owner = "client!bd", name = "d", descriptor = "I")
    public static int field357;

    @OriginalMember(owner = "client!bd", name = "read", descriptor = "()I")
    public final int read() {
        class144.method1008(103, 30000L);
        field357++;
        return -1;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(B)V")
    public static void method148(byte arg0) {
        field360 = null;
        if (arg0 <= -123) {
            field359 = null;
            field358 = null;
        }
    }
}
