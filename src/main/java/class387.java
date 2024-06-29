import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wv")
public class class387 extends class496 {

    @OriginalMember(owner = "client!wv", name = "k", descriptor = "I")
    public volatile int field5662 = -1;

    @OriginalMember(owner = "client!wv", name = "i", descriptor = "Ljava/lang/String;")
    public volatile String field5660;

    @OriginalMember(owner = "client!wv", name = "j", descriptor = "I")
    public static int field5661;

    @OriginalMember(owner = "client!wv", name = "l", descriptor = "[[[Lsk;")
    public static class415[][][] field5663;

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(I)V", line = 4)
    public static void method2340(int arg0) {
        if (arg0 != 804669548) {
            field5663 = null;
        }
        field5663 = null;
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(ZI)I", line = 17)
    public static final int method2341(boolean arg0, int arg1) {
        field5661++;
        int var2 = (arg1 * arg1 >> 12) * arg1 >> 12;
        if (arg0) {
            field5663 = null;
        }
        int var3 = arg1 * 6 - 61440;
        int var4 = (arg1 * var3 >> 12) + 40960;
        return var2 * var4 >> 12;
    }

    @OriginalMember(owner = "client!wv", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 39)
    public class387(String arg0) {
        this.field5660 = arg0;
    }
}
