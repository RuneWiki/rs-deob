import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!an")
public class class116 extends class29 {

    @OriginalMember(owner = "client!an", name = "L", descriptor = "I")
    public int field1967 = 0;

    @OriginalMember(owner = "client!an", name = "B", descriptor = "Z")
    public static boolean field1957 = false;

    @OriginalMember(owner = "client!an", name = "I", descriptor = "I")
    public static int field1964 = 0;

    @OriginalMember(owner = "client!an", name = "F", descriptor = "Lph;")
    public static class229 field1961 = class266.method1858("brillant1:", 0);

    @OriginalMember(owner = "client!an", name = "G", descriptor = "[[S")
    public static short[][] field1962 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!an", name = "J", descriptor = "Lph;")
    public static class229 field1965 = null;

    @OriginalMember(owner = "client!an", name = "K", descriptor = "Z")
    public static boolean field1966 = true;

    @OriginalMember(owner = "client!an", name = "C", descriptor = "I")
    public static int field1958;

    @OriginalMember(owner = "client!an", name = "D", descriptor = "I")
    public static int field1959;

    @OriginalMember(owner = "client!an", name = "E", descriptor = "I")
    public static int field1960;

    @OriginalMember(owner = "client!an", name = "H", descriptor = "I")
    public static int field1963;

    @OriginalMember(owner = "client!an", name = "A", descriptor = "Lsi;")
    public static class66 field1956;

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(BLhb;)V", line = 8)
    public final void method874(byte arg0, class164 arg1) {
        while (true) {
            int var3 = arg1.method1178(arg0 ^ 0xFFFFFFAA);
            if (var3 == 0) {
                if (arg0 != -94) {
                    return;
                }
                field1958++;
                return;
            }
            this.method876(arg0 ^ 0x38, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(Lsi;III)Lrl;", line = 29)
    public static final class327 method875(class66 arg0, int arg1, int arg2, int arg3) {
        if (arg3 != -11339) {
            method877(79);
        }
        field1959++;
        return class176.method1264(arg1, (byte) 119, arg0, arg2) ? class22.method133((byte) 82) : null;
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(ILhb;I)V", line = 44)
    private final void method876(int arg0, class164 arg1, int arg2) {
        if (arg2 == 2) {
            this.field1967 = arg1.method1161(true);
        }
        field1960++;
        if (arg0 > -69) {
            this.field1967 = 53;
        }
    }

    @OriginalMember(owner = "client!an", name = "g", descriptor = "(I)V", line = 64)
    public static void method877(int arg0) {
        field1962 = (short[][]) null;
        field1961 = null;
        field1965 = null;
        field1956 = null;
        int var1 = -99 / ((3 - arg0) / 44);
    }

    @OriginalMember(owner = "client!an", name = "h", descriptor = "(I)V", line = 76)
    public static final void method878(int arg0) {
        if (arg0 != 26666) {
            return;
        }
        class39.field629 = false;
        class248.field4127 = 0;
        class224.field3679 = 0;
        field1963++;
        class12.field164 = 1;
        class332.field5661 = -3;
        class256.field4287 = 0;
        class122.field2045 = -1;
    }
}
