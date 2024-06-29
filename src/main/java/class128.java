import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class128 {

    @OriginalMember(owner = "client!hc", name = "k", descriptor = "J")
    public long field1880 = 0L;

    @OriginalMember(owner = "client!hc", name = "p", descriptor = "Lpj;")
    public static class284 field1885 = new class284();

    @OriginalMember(owner = "client!hc", name = "s", descriptor = "Ljava/lang/String;")
    public static String field1888 = "scroll:";

    @OriginalMember(owner = "client!hc", name = "u", descriptor = "I")
    public static int field1890 = 0;

    @OriginalMember(owner = "client!hc", name = "r", descriptor = "[I")
    public static int[] field1887 = new int[14];

    @OriginalMember(owner = "client!hc", name = "t", descriptor = "Lhl;")
    public static class139 field1889 = new class139(4);

    @OriginalMember(owner = "client!hc", name = "w", descriptor = "Ljava/lang/String;")
    public static String field1892 = "Examine";

    @OriginalMember(owner = "client!hc", name = "x", descriptor = "I")
    public static int field1893 = 0;

    @OriginalMember(owner = "client!hc", name = "v", descriptor = "[I")
    public static int[] field1891 = new int[256];

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "I")
    public int field1870;

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "I")
    public int field1871;

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "I")
    public static int field1872;

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "I")
    public int field1873;

    @OriginalMember(owner = "client!hc", name = "f", descriptor = "I")
    public static int field1875;

    @OriginalMember(owner = "client!hc", name = "g", descriptor = "I")
    public int field1876;

    @OriginalMember(owner = "client!hc", name = "h", descriptor = "I")
    public static int field1877;

    @OriginalMember(owner = "client!hc", name = "i", descriptor = "I")
    public int field1878;

    @OriginalMember(owner = "client!hc", name = "j", descriptor = "I")
    public int field1879;

    @OriginalMember(owner = "client!hc", name = "l", descriptor = "I")
    public int field1881;

    @OriginalMember(owner = "client!hc", name = "m", descriptor = "I")
    public int field1882;

    @OriginalMember(owner = "client!hc", name = "n", descriptor = "I")
    public int field1883;

    @OriginalMember(owner = "client!hc", name = "o", descriptor = "I")
    public int field1884;

    @OriginalMember(owner = "client!hc", name = "q", descriptor = "I")
    public int field1886;

    @OriginalMember(owner = "client!hc", name = "e", descriptor = "Lbg;")
    public class264 field1874;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(B)V")
    public static void method884(byte arg0) {
        field1887 = null;
        field1888 = null;
        field1889 = null;
        field1892 = null;
        field1891 = null;
        if (arg0 < -69) {
            field1885 = null;
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIIIIII)V")
    public static final void method885(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1875++;
        if (arg6 != 2019) {
            field1888 = null;
        }
        if ((arg5 - arg4) >= class196.field2961 && class84.field1287 >= arg4 + arg5 && arg0 - arg4 >= class175.field2557 && class91.field1381 >= arg0 + arg4) {
            class11.method80(arg2, arg0, arg4, arg3, arg5, (byte) -113, arg1);
        } else {
            class55.method462(arg0, arg3, arg2, arg1, arg5, arg4, (byte) 78);
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(ILjk;Z)V")
    public static final void method886(int arg0, class297 arg1, boolean arg2) {
        field1872++;
        if (arg0 <= 76) {
            method884((byte) 90);
        }
        int var3 = arg1.field4675 == 0 ? arg1.field4531 : arg1.field4675;
        int var4 = arg1.field4555 == 0 ? arg1.field4627 : arg1.field4555;
        class127.method882(var3, (byte) -121, class275.field4236[arg1.field4683 >> 16], var4, arg2, arg1.field4683);
        if (arg1.field4646 != null) {
            class127.method882(var3, (byte) -103, arg1.field4646, var4, arg2, arg1.field4683);
        }
        class123 var5 = (class123) class124.field1833.method306((long) arg1.field4683, 16216);
        if (var5 != null) {
            class68.method540(var3, arg2, -1, var5.field1823, var4);
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIIII)V")
    public static final void method887(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1877++;
        class84.field1287 = arg3;
        class175.field2557 = arg1;
        class196.field2961 = arg0;
        if (arg2 >= -18) {
            field1888 = null;
        }
        class91.field1381 = arg4;
    }
}
