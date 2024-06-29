import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public abstract class class165 {

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "Lhi;")
    public static class82 field2882 = class95.method664((byte) -42, "leuchten1:");

    @OriginalMember(owner = "client!wj", name = "e", descriptor = "Lhi;")
    public static class82 field2885 = class95.method664((byte) -127, ")1o");

    @OriginalMember(owner = "client!wj", name = "h", descriptor = "Lhi;")
    private static class82 field2888 = class95.method664((byte) -72, "Connected to update server");

    @OriginalMember(owner = "client!wj", name = "j", descriptor = "I")
    public static int field2890 = 0;

    @OriginalMember(owner = "client!wj", name = "f", descriptor = "[J")
    public static long[] field2886 = new long[100];

    @OriginalMember(owner = "client!wj", name = "k", descriptor = "[Lwl;")
    public static class174[] field2891 = new class174[4];

    @OriginalMember(owner = "client!wj", name = "i", descriptor = "Lhi;")
    public static class82 field2889 = field2888;

    @OriginalMember(owner = "client!wj", name = "c", descriptor = "I")
    public static int field2883;

    @OriginalMember(owner = "client!wj", name = "d", descriptor = "I")
    public static int field2884;

    @OriginalMember(owner = "client!wj", name = "g", descriptor = "I")
    public static int field2887;

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "Lum;")
    public static class222 field2881;

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(I)V", line = 6)
    public static void method1189(int arg0) {
        field2881 = null;
        field2886 = null;
        field2889 = null;
        field2882 = null;
        field2891 = null;
        if (arg0 != 4) {
            method1191((byte) -13);
        }
        field2885 = null;
        field2888 = null;
    }

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "(B)V", line = 31)
    public static final void method1191(byte arg0) {
        field2884++;
        class68.field1056.method2172(false);
        class232.field3993.method2172(false);
        if (arg0 != 120) {
            method1189(-2);
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(B)Lu;")
    public abstract class34 method1188(byte arg0);

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(IZ)I")
    public abstract int method1190(int arg0, boolean arg1);

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(II)[B")
    public abstract byte[] method1192(int arg0, int arg1);

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(BI)V")
    public abstract void method1193(byte arg0, int arg1);
}
