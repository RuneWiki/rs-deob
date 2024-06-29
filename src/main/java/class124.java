import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class124 extends class65 {

    @OriginalMember(owner = "client!f", name = "s", descriptor = "Lne;")
    public class154 field1904;

    @OriginalMember(owner = "client!f", name = "u", descriptor = "I")
    public int field1906;

    @OriginalMember(owner = "client!f", name = "l", descriptor = "Z")
    public boolean field1897;

    @OriginalMember(owner = "client!f", name = "k", descriptor = "I")
    public int field1896;

    @OriginalMember(owner = "client!f", name = "m", descriptor = "I")
    public static int field1898 = 0;

    @OriginalMember(owner = "client!f", name = "o", descriptor = "I")
    public static int field1900 = 0;

    @OriginalMember(owner = "client!f", name = "p", descriptor = "Lcb;")
    public static class631 field1901 = new class631(66, 8);

    @OriginalMember(owner = "client!f", name = "w", descriptor = "[I")
    public static int[] field1908 = new int[3];

    @OriginalMember(owner = "client!f", name = "v", descriptor = "I")
    public static int field1907 = -1;

    @OriginalMember(owner = "client!f", name = "n", descriptor = "I")
    public static int field1899;

    @OriginalMember(owner = "client!f", name = "q", descriptor = "Z")
    public boolean field1902;

    @OriginalMember(owner = "client!f", name = "r", descriptor = "Z")
    public boolean field1903;

    @OriginalMember(owner = "client!f", name = "t", descriptor = "Z")
    public boolean field1905;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(I)V")
    public static void method964(int arg0) {
        field1908 = null;
        field1901 = null;
        if (arg0 >= -117) {
            field1908 = null;
        }
    }

    @OriginalMember(owner = "client!f", name = "<init>", descriptor = "(ILne;IZ)V")
    public class124(int arg0, class154 arg1, int arg2, boolean arg3) {
        this.field1904 = arg1;
        this.field1906 = arg2;
        this.field1897 = arg3;
        this.field1896 = arg0;
    }
}
