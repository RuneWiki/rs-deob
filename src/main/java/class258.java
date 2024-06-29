import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mm")
public class class258 {

    @OriginalMember(owner = "client!mm", name = "g", descriptor = "[I")
    public static int[] field3843 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "I")
    public static int field3837;

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "I")
    public static int field3838;

    @OriginalMember(owner = "client!mm", name = "c", descriptor = "I")
    public static int field3839;

    @OriginalMember(owner = "client!mm", name = "d", descriptor = "I")
    public static int field3840;

    @OriginalMember(owner = "client!mm", name = "e", descriptor = "I")
    public static int field3841;

    @OriginalMember(owner = "client!mm", name = "f", descriptor = "I")
    public static int field3842;

    @OriginalMember(owner = "client!mm", name = "i", descriptor = "I")
    public static int field3845;

    @OriginalMember(owner = "client!mm", name = "j", descriptor = "I")
    public static int field3846;

    @OriginalMember(owner = "client!mm", name = "h", descriptor = "[[[I")
    public static int[][][] field3844;

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(II)I", line = 8)
    public static final int method1790(int arg0, int arg1) {
        if (arg1 == 1023) {
            field3838++;
            return arg0 & 0x3FF;
        } else {
            return -23;
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(ZLlb;)I", line = 21)
    public static final int method1791(boolean arg0, class211 arg1) {
        field3845++;
        int var2 = 0;
        if (arg1.method1531(96, class65.field962)) {
            var2++;
        }
        if (arg1.method1531(112, class292.field4584)) {
            var2++;
        }
        if (arg1.method1531(87, class27.field305)) {
            var2++;
        }
        if (arg1.method1531(90, class93.field1342)) {
            var2++;
        }
        if (arg0) {
            method1796(true);
        }
        if (arg1.method1531(81, class184.field2894)) {
            var2++;
        }
        if (arg1.method1531(81, class87.field1284)) {
            var2++;
        }
        if (arg1.method1531(77, class201.field3193)) {
            var2++;
        }
        if (arg1.method1531(95, class102.field1582)) {
            var2++;
        }
        if (arg1.method1531(121, class170.field2533)) {
            var2++;
        }
        if (arg1.method1531(93, class109.field1706)) {
            var2++;
        }
        if (arg1.method1531(102, client.field3796)) {
            var2++;
        }
        if (arg1.method1531(125, class218.field3443)) {
            var2++;
        }
        if (arg1.method1531(103, class217.field3421)) {
            var2++;
        }
        if (arg1.method1531(113, class10.field97)) {
            var2++;
        }
        if (arg1.method1531(120, class188.field2986)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "(II)V", line = 90)
    public static final void method1792(int arg0, int arg1) {
        class147 var2 = class92.method731(-29125, arg1, arg0);
        var2.method1099(-87);
        field3837++;
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(IIBLek;)V", line = 103)
    public static final void method1793(int arg0, int arg1, byte arg2, class184 arg3) {
        field3841++;
        if (class152.field2290 != null || class67.field982 || arg3 == null || class191.method1388(-24504, arg3) == null) {
            return;
        }
        class152.field2290 = arg3;
        if (arg2 <= 74) {
            return;
        }
        class102.field1581 = class191.method1388(-24504, arg3);
        class69.field1010 = arg0;
        class43.field675 = arg1;
        class96.field1404 = 0;
        class99.field1465 = false;
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(ILlb;II)[Lsd;", line = 126)
    public static final class27[] method1794(int arg0, class211 arg1, int arg2, int arg3) {
        if (arg3 != 25701) {
            method1796(true);
        }
        field3839++;
        return class297.method2093(arg2, arg0, (byte) 93, arg1) ? class11.method85(arg3 - 25695) : null;
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(BI)Ljava/lang/String;", line = 141)
    public static final String method1795(byte arg0, int arg1) {
        int var2 = -90 % ((61 - arg0) / 58);
        field3842++;
        return (arg1 >> 24 & 0xFF) + "." + ((arg1 & 0xFF3092) >> 16) + "." + ((arg1 & 0xFF22) >> 8) + "." + (arg1 & 0xFF);
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(Z)V", line = 153)
    public static void method1796(boolean arg0) {
        if (arg0) {
            method1790(36, -11);
        }
        field3844 = (int[][][]) null;
        field3843 = null;
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(B)Lpe;", line = 164)
    public static final class100 method1797(byte arg0) {
        field3840++;
        int var1 = 47 / ((arg0 - 16) / 48);
        try {
            return (class100) Class.forName("db").getDeclaredConstructor().newInstance();
        } catch (Throwable var3) {
            return null;
        }
    }
}
