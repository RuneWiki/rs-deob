import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public class class89 extends class445 {

    @OriginalMember(owner = "client!pj", name = "t", descriptor = "Ljava/lang/String;")
    public String field1307;

    @OriginalMember(owner = "client!pj", name = "u", descriptor = "Lh;")
    public static class434 field1308 = new class434(50, -1);

    @OriginalMember(owner = "client!pj", name = "v", descriptor = "J")
    public static long field1309 = -1L;

    @OriginalMember(owner = "client!pj", name = "w", descriptor = "S")
    public static short field1310 = 256;

    @OriginalMember(owner = "client!pj", name = "s", descriptor = "I")
    public static int field1306;

    @OriginalMember(owner = "client!pj", name = "<init>", descriptor = "()V", line = 11)
    public class89() {
    }

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "(IB)I", line = 18)
    public static final int method575(int arg0, byte arg1) {
        field1306++;
        int var2 = (arg0 * arg0 >> 12) * arg0 >> 12;
        int var3 = arg0 * 6 - 61440;
        if (arg1 > -24) {
            return 101;
        } else {
            int var4 = (arg0 * var3 >> 12) + 40960;
            return var2 * var4 >> 12;
        }
    }

    @OriginalMember(owner = "client!pj", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 38)
    public class89(String arg0, int arg1) {
        this.field1307 = arg0;
    }

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "(I)V", line = 48)
    public static void method576(int arg0) {
        if (arg0 == -1) {
            field1308 = null;
        }
    }
}
