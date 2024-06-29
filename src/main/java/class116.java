import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public class class116 {

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "Lqe;")
    private static class168 field1889 = class66.method448("Allocating memory", -120);

    @OriginalMember(owner = "client!dh", name = "e", descriptor = "[Z")
    public static boolean[] field1893 = new boolean[200];

    @OriginalMember(owner = "client!dh", name = "i", descriptor = "Lqe;")
    public static class168 field1897 = field1889;

    @OriginalMember(owner = "client!dh", name = "c", descriptor = "Lqe;")
    private static class168 field1891 = class66.method448("green:", -128);

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "Lqe;")
    public static class168 field1890 = field1891;

    @OriginalMember(owner = "client!dh", name = "h", descriptor = "Lqe;")
    public static class168 field1896 = class66.method448("<img=0>", -121);

    @OriginalMember(owner = "client!dh", name = "f", descriptor = "Lqe;")
    public static class168 field1894 = field1891;

    @OriginalMember(owner = "client!dh", name = "d", descriptor = "Ljh;")
    public static class2 field1892 = new class2(4);

    @OriginalMember(owner = "client!dh", name = "j", descriptor = "Lqe;")
    private static class168 field1898 = class66.method448("M", -120);

    @OriginalMember(owner = "client!dh", name = "k", descriptor = "Lqe;")
    public static class168 field1899 = field1898;

    @OriginalMember(owner = "client!dh", name = "n", descriptor = "I")
    public static int field1902 = 0;

    @OriginalMember(owner = "client!dh", name = "l", descriptor = "Lqe;")
    public static class168 field1900 = field1898;

    @OriginalMember(owner = "client!dh", name = "g", descriptor = "I")
    public static int field1895;

    @OriginalMember(owner = "client!dh", name = "m", descriptor = "I")
    public static int field1901;

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(Lmj;B)Lmj;")
    public static final class129 method796(class129 arg0, byte arg1) {
        field1895++;
        if (arg0.field2276 != -1) {
            return class257.method1713(arg0.field2276, 126);
        }
        int var2 = arg0.field2222 >>> 16;
        int var3 = -99 / ((arg1 - 76) / 40);
        for (class114 var4 = (class114) class176.field3079.method1536(53); var4 != null; var4 = (class114) class176.field3079.method1534(-21389)) {
            if (var4.field1853 == var2) {
                return class257.method1713((int) var4.field3308, 126);
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(I)V")
    public static void method797(int arg0) {
        field1892 = null;
        field1898 = null;
        field1896 = null;
        field1900 = null;
        if (arg0 != -6091) {
            method797(-48);
        }
        field1899 = null;
        field1894 = null;
        field1890 = null;
        field1891 = null;
        field1893 = null;
        field1889 = null;
        field1897 = null;
    }
}
