import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class122 extends class224 {

    @OriginalMember(owner = "client!md", name = "T", descriptor = "[I")
    public static int[] field1891 = new int[2000];

    @OriginalMember(owner = "client!md", name = "S", descriptor = "I")
    public static int field1890 = 0;

    @OriginalMember(owner = "client!md", name = "ab", descriptor = "Luf;")
    public static class168 field1898 = class148.method1019(-1720, "<col=ffffff> )4 ");

    @OriginalMember(owner = "client!md", name = "V", descriptor = "Luf;")
    private static class168 field1893 = class148.method1019(-1720, "Cancel");

    @OriginalMember(owner = "client!md", name = "Y", descriptor = "Luf;")
    public static class168 field1896 = field1893;

    @OriginalMember(owner = "client!md", name = "Z", descriptor = "Luf;")
    public static class168 field1897 = class148.method1019(-1720, "<img=1>");

    @OriginalMember(owner = "client!md", name = "X", descriptor = "I")
    public static int field1895 = -1;

    @OriginalMember(owner = "client!md", name = "R", descriptor = "I")
    public static int field1889;

    @OriginalMember(owner = "client!md", name = "U", descriptor = "I")
    public static int field1892;

    @OriginalMember(owner = "client!md", name = "W", descriptor = "I")
    public static int field1894;

    @OriginalMember(owner = "client!md", name = "bb", descriptor = "Ldk;")
    public static class241 field1899;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(II)V", line = 4)
    public static final void method871(int arg0, int arg1) {
        class248.field4251 = arg1;
        field1889++;
        class270.field4538 = arg0;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(Lj;I)Lal;", line = 19)
    public static final class128 method872(class153 arg0, int arg1) {
        field1894++;
        if (arg1 != 50) {
            method871(-121, 32);
        }
        return new class128(arg0.method1081((byte) 110), arg0.method1081((byte) -109), arg0.method1081((byte) 119), arg0.method1081((byte) 21), arg0.method1088(-30917), arg0.method1088(arg1 - 30967), arg0.method1042((byte) 125));
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(BI)[I", line = 40)
    public final int[] method18(byte arg0, int arg1) {
        int var3 = -124 / ((20 - arg0) / 51);
        field1892++;
        return class73.field979;
    }

    @OriginalMember(owner = "client!md", name = "<init>", descriptor = "()V", line = 63)
    public class122() {
        super(0, true);
    }

    @OriginalMember(owner = "client!md", name = "d", descriptor = "(I)V", line = 72)
    public static void method873(int arg0) {
        field1891 = null;
        field1893 = null;
        field1896 = null;
        field1898 = null;
        field1897 = null;
        if (arg0 == 50) {
            field1899 = null;
        }
    }
}
