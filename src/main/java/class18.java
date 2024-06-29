import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qo")
public class class18 {

    @OriginalMember(owner = "client!qo", name = "d", descriptor = "Lla;")
    public static class319 field297 = new class319(105, 3);

    @OriginalMember(owner = "client!qo", name = "e", descriptor = "Let;")
    public static class428 field298 = new class428();

    @OriginalMember(owner = "client!qo", name = "f", descriptor = "Lni;")
    public static class367 field299 = new class367(17, 6);

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "I")
    public static int field294;

    @OriginalMember(owner = "client!qo", name = "b", descriptor = "I")
    public static int field295;

    @OriginalMember(owner = "client!qo", name = "c", descriptor = "I")
    public static int field296;

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(I)V", line = 5)
    public static final void method181(int arg0) {
        field296++;
        class225.field3116.method910((byte) 80);
        class306.field4441.method963(-12);
        class183.field2487.method1426(19);
        class432.field6575.method1871((byte) 124);
        class137.field1834.method1628((byte) -96);
        class103.field1489.method1599(-84);
        class201.field2707.method490((byte) -92);
        class239.field3360.method2832(0);
        class102.field1481.method197((byte) 78);
        class431.field6567.method191(57);
        if (arg0 < 106) {
            field298 = null;
        }
        class509.field7483.method1557(114);
        class244.field3413.method973((byte) 99);
        class509.field7484.method1856((byte) 95);
        class529.field7758.method1581(7);
        class83.field1218.method3121(0);
        class332.field5172.method2208((byte) 27);
        class182.field2469.method2285((byte) 31);
        class448.field6743.method2172((byte) 89);
        class77.field1120.method2966(-29338);
        class319.field4623.method867(false);
        class534.method3160(false);
        class420.method2563(78);
        class35.method309(-14574);
        class55.method403(126);
        class359.field5512.method2135(0);
        class172.field2318.method2135(0);
        class317.field4604.method2135(0);
        class10.field177.method2135(0);
        class343.field5307.method2135(0);
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(IIZ)I", line = 53)
    public static final int method182(int arg0, int arg1, boolean arg2) {
        field294++;
        if (arg0 == 4 || arg0 == 5) {
            return class127.field1726[arg1 & 0x3];
        } else {
            if (!arg2) {
                field298 = null;
            }
            return 256;
        }
    }

    @OriginalMember(owner = "client!qo", name = "b", descriptor = "(I)V", line = 68)
    public static void method183(int arg0) {
        if (arg0 == -12054) {
            field297 = null;
            field298 = null;
            field299 = null;
        }
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(II)I", line = 83)
    public static final int method184(int arg0, int arg1) {
        if (arg0 != 20287) {
            field299 = null;
        }
        field295++;
        return arg1 & 0x3FF;
    }
}
