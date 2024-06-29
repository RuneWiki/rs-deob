import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kn")
public class class742 implements class401 {

    @OriginalMember(owner = "client!kn", name = "h", descriptor = "I")
    public int field10411;

    @OriginalMember(owner = "client!kn", name = "f", descriptor = "[J")
    public static long[] field10409 = new long[32];

    @OriginalMember(owner = "client!kn", name = "e", descriptor = "[I")
    public static int[] field10408 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!kn", name = "b", descriptor = "J")
    public static volatile long field10405 = 0L;

    @OriginalMember(owner = "client!kn", name = "g", descriptor = "[Ljava/awt/Color;")
    public static Color[] field10410 = new Color[] { new Color(9179409), new Color(16777215), new Color(16726277), new Color(16726277) };

    @OriginalMember(owner = "client!kn", name = "c", descriptor = "I")
    public static int field10406;

    @OriginalMember(owner = "client!kn", name = "d", descriptor = "I")
    public static int field10407;

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "Lwg;")
    public static class427 field10404;

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(B)Lio;")
    public final class439 method69(byte arg0) {
        field10407++;
        int var2 = 103 / ((arg0 + 69) / 39);
        return class622.field8731;
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(I)V")
    public static void method4151(int arg0) {
        field10409 = null;
        field10404 = null;
        if (arg0 > 16) {
            field10410 = null;
            field10408 = null;
        }
    }

    @OriginalMember(owner = "client!kn", name = "<init>", descriptor = "(I)V")
    public class742(int arg0) {
        this.field10411 = arg0;
    }
}
