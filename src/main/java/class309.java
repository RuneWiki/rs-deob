import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public class class309 {

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "I")
    public static int field4080 = -1;

    @OriginalMember(owner = "client!bi", name = "f", descriptor = "[S")
    public static short[] field4085 = new short[] { 960, 957, -21568, -21571, 22464 };

    @OriginalMember(owner = "client!bi", name = "k", descriptor = "[[S")
    public static short[][] field4090 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client!bi", name = "j", descriptor = "[I")
    public static int[] field4089 = new int[] { 2, 2, 4, 2, 1, 8, 4, 1, 4, 4, 2, 1, 1, 1, 4, 1 };

    @OriginalMember(owner = "client!bi", name = "d", descriptor = "Ljava/lang/String;")
    public static String field4083 = "";

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "I")
    public static int field4081;

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "I")
    public int field4082;

    @OriginalMember(owner = "client!bi", name = "g", descriptor = "I")
    public static int field4086;

    @OriginalMember(owner = "client!bi", name = "h", descriptor = "I")
    public static int field4087;

    @OriginalMember(owner = "client!bi", name = "i", descriptor = "I")
    public static int field4088;

    @OriginalMember(owner = "client!bi", name = "e", descriptor = "Lbi;")
    public class309 field4084;

    @OriginalMember(owner = "client!bi", name = "l", descriptor = "Lhb;")
    public class471 field4091;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(I)V")
    public final void method1702(int arg0) {
        field4086++;
        if (arg0 <= class492.field6871) {
            return;
        }
        this.field4082 = 0;
        this.field4084 = class433.field5896;
        this.field4091 = null;
        class433.field5896 = this;
        class492.field6871++;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(ILtf;)V")
    public static final void method1703(int arg0, class177 arg1) {
        class221.field2945[arg0] = arg1;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(B)V")
    public static void method1704(byte arg0) {
        if (arg0 < -119) {
            field4090 = null;
            field4089 = null;
            field4085 = null;
            field4083 = null;
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public static final int method1705(String arg0, int arg1) {
        field4081++;
        if (arg1 != 3685) {
            field4085 = null;
        }
        for (int var2 = 0; var2 < class162.field2258.length; var2++) {
            if (class162.field2258[var2].equalsIgnoreCase(arg0)) {
                return var2;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIII)I")
    public static final int method1706(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 != 6798) {
            field4088 = 122;
        }
        field4087++;
        if (arg0 <= arg1) {
            return arg3 < arg1 ? arg3 : arg1;
        } else {
            return arg0;
        }
    }
}
