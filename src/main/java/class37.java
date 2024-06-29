import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public class class37 extends InputStream {

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "Ljava/lang/String;")
    public static String field551 = " from your ignore list first.";

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "[I")
    public static int[] field552 = new int[4];

    @OriginalMember(owner = "client!ih", name = "e", descriptor = "I")
    public static int field555 = 0;

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "I")
    public static int field553;

    @OriginalMember(owner = "client!ih", name = "d", descriptor = "I")
    public static int field554;

    @OriginalMember(owner = "client!ih", name = "g", descriptor = "I")
    public static int field557;

    @OriginalMember(owner = "client!ih", name = "h", descriptor = "Lbn;")
    public static class72 field558;

    @OriginalMember(owner = "client!ih", name = "f", descriptor = "Lbi;")
    public static class91 field556;

    @OriginalMember(owner = "client!ih", name = "read", descriptor = "()I", line = 9)
    public final int read() {
        class245.method1729(-56, 30000L);
        field557++;
        return -1;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(I)V", line = 19)
    public static void method329(int arg0) {
        if (arg0 != -133) {
            field558 = (class72) null;
        }
        field556 = null;
        field558 = null;
        field551 = null;
        field552 = null;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(B)V", line = 39)
    public static final void method330(byte arg0) {
        if (class323.field5065 == null || class66.field986 == null) {
            class66.field986 = new int[256];
            class323.field5065 = new int[256];
            for (int var1 = 0; var1 < 256; var1++) {
                double var2 = (double) var1 / 255.0D * 6.283185307179586D;
                class323.field5065[var1] = (int) (Math.sin(var2) * 4096.0D);
                class66.field986[var1] = (int) (Math.cos(var2) * 4096.0D);
            }
        }
        if (arg0 != 36) {
            field556 = (class91) null;
        }
        field553++;
    }
}
