import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ru")
public class class131 extends class498 {

    @OriginalMember(owner = "client!ru", name = "n", descriptor = "J")
    public long field1723;

    @OriginalMember(owner = "client!ru", name = "p", descriptor = "[I")
    public static int[] field1725 = new int[] { 32, 39, 44, 47 };

    @OriginalMember(owner = "client!ru", name = "r", descriptor = "[I")
    public static int[] field1727 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!ru", name = "t", descriptor = "I")
    public static int field1729 = -1;

    @OriginalMember(owner = "client!ru", name = "o", descriptor = "I")
    public static int field1724;

    @OriginalMember(owner = "client!ru", name = "s", descriptor = "I")
    public static int field1728;

    @OriginalMember(owner = "client!ru", name = "u", descriptor = "I")
    public static int field1730;

    @OriginalMember(owner = "client!ru", name = "q", descriptor = "Lo;")
    public static class24 field1726;

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(B)V")
    public static void method838(byte arg0) {
        if (arg0 == 61) {
            field1726 = null;
            field1725 = null;
            field1727 = null;
        }
    }

    @OriginalMember(owner = "client!ru", name = "<init>", descriptor = "()V")
    public class131() {
    }

    @OriginalMember(owner = "client!ru", name = "<init>", descriptor = "(J)V")
    public class131(long arg0) {
        this.field1723 = arg0;
    }
}
