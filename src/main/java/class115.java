import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public class class115 extends class320 {

    @OriginalMember(owner = "client!nh", name = "v", descriptor = "I")
    private int field1882 = -32768;

    @OriginalMember(owner = "client!nh", name = "q", descriptor = "Ljava/lang/String;")
    public static String field1877 = "Your friend list is full. Max of 100 for free users, and 200 for members.";

    @OriginalMember(owner = "client!nh", name = "w", descriptor = "I")
    public static int field1883 = 0;

    @OriginalMember(owner = "client!nh", name = "s", descriptor = "Ljava/lang/String;")
    public static String field1879 = "Cancel";

    @OriginalMember(owner = "client!nh", name = "m", descriptor = "Lob;")
    public static class292 field1873 = null;

    @OriginalMember(owner = "client!nh", name = "n", descriptor = "I")
    public int field1874;

    @OriginalMember(owner = "client!nh", name = "o", descriptor = "I")
    public static int field1875;

    @OriginalMember(owner = "client!nh", name = "p", descriptor = "I")
    public static int field1876;

    @OriginalMember(owner = "client!nh", name = "r", descriptor = "I")
    public static int field1878;

    @OriginalMember(owner = "client!nh", name = "t", descriptor = "I")
    public static int field1880;

    @OriginalMember(owner = "client!nh", name = "x", descriptor = "I")
    public static int field1884;

    @OriginalMember(owner = "client!nh", name = "A", descriptor = "I")
    public int field1887;

    @OriginalMember(owner = "client!nh", name = "u", descriptor = "Lja;")
    public static class64 field1881;

    @OriginalMember(owner = "client!nh", name = "z", descriptor = "[I")
    public static int[] field1886;

    @OriginalMember(owner = "client!nh", name = "y", descriptor = "[[[Lw;")
    public static class272[][][] field1885;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(B)V", line = 5)
    public static void method864(byte arg0) {
        field1881 = null;
        field1873 = null;
        field1885 = (class272[][][]) null;
        field1879 = null;
        if (arg0 == 22) {
            field1886 = null;
            field1877 = null;
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIIII)V", line = 25)
    public final void method205(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1884++;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIIIIIIIJILmf;)V", line = 33)
    public final void method203(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class47 arg10) {
        field1880++;
        class199 var13 = class208.method1521(-1361, this.field1874).method1328(0, this.field1887, 10, (class269) null, -1, 0);
        if (var13 != null) {
            var13.method203(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10);
            this.field1882 = var13.method207();
        }
    }

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "(I)V", line = 47)
    public static final void method865(int arg0) {
        class293.field4614 = null;
        class73.field1134 = null;
        class319.field4958 = null;
        class224.field3600 = null;
        class258.field3983 = null;
        class221.field3525 = null;
        class134.field2125 = null;
        class93.field1527 = null;
        class95.field1558 = null;
        class88.field1356 = null;
        class205.field3253 = null;
        class87.field1330 = null;
        class327.field5067 = null;
        class195.field3107 = null;
        class78.field1199 = null;
        if (arg0 != 0) {
            field1879 = (String) null;
        }
        class94.field1552 = null;
        class56.field900 = null;
        field1875++;
        class127.field2035 = null;
        class64.field1021 = null;
    }

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "(II)V", line = 81)
    public static final void method866(int arg0, int arg1) {
        if (arg1 != -1) {
            field1885 = (class272[][][]) ((class272[][][]) null);
        }
        field1878++;
        class62 var2 = (class62) class42.field748.method833(false, (long) arg0);
        if (var2 != null) {
            var2.method1701(-98);
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "()I", line = 113)
    public final int method207() {
        field1876++;
        return this.field1882;
    }
}
