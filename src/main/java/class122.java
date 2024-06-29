import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eea")
public class class122 extends class602 {

    @OriginalMember(owner = "client!eea", name = "f", descriptor = "I")
    private int field1482;

    @OriginalMember(owner = "client!eea", name = "q", descriptor = "I")
    private int field1493;

    @OriginalMember(owner = "client!eea", name = "m", descriptor = "I")
    private int field1489;

    @OriginalMember(owner = "client!eea", name = "n", descriptor = "I")
    private int field1490;

    @OriginalMember(owner = "client!eea", name = "i", descriptor = "J")
    public static long field1485 = 0L;

    @OriginalMember(owner = "client!eea", name = "k", descriptor = "Ljava/lang/String;")
    public static String field1487 = null;

    @OriginalMember(owner = "client!eea", name = "g", descriptor = "I")
    public static int field1483;

    @OriginalMember(owner = "client!eea", name = "h", descriptor = "I")
    public static int field1484;

    @OriginalMember(owner = "client!eea", name = "j", descriptor = "I")
    public static int field1486;

    @OriginalMember(owner = "client!eea", name = "l", descriptor = "I")
    public static int field1488;

    @OriginalMember(owner = "client!eea", name = "o", descriptor = "I")
    public static int field1491;

    @OriginalMember(owner = "client!eea", name = "p", descriptor = "I")
    public static int field1492;

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(IBI)V", line = 5)
    public final void method803(int arg0, byte arg1, int arg2) {
        ++field1492;
        if (arg1 != 61) {
            field1485 = 44L;
        }
    }

    @OriginalMember(owner = "client!eea", name = "<init>", descriptor = "(IIIIII)V", line = 15)
    public class122(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field1482 = arg0;
        this.field1493 = arg1;
        this.field1489 = arg3;
        this.field1490 = arg2;
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(IB)Ljava/lang/String;", line = 27)
    public static final String method804(int arg0, byte arg1) {
        if (arg1 != -90) {
            field1487 = null;
        }
        ++field1488;
        return (arg0 >> 24 & 255) + "." + ((arg0 & 16733007) >> 16) + "." + (255 & arg0 >> 8) + "." + (255 & arg0);
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(ZII)V", line = 52)
    public final void method805(boolean arg0, int arg1, int arg2) {
        ++field1483;
        int var4 = this.field1482 * arg2 >> 12;
        if (arg0) {
            field1487 = null;
        }
        int var5 = this.field1490 * arg2 >> 12;
        int var6 = this.field1493 * arg1 >> 12;
        int var7 = this.field1489 * arg1 >> 12;
        class183.method1089((byte) -87, var7, super.field8084, var4, var5, var6);
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(BIII)I", line = 71)
    public static final int method806(byte arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 71) {
            return -8;
        } else {
            ++field1491;
            int var4 = arg2 & 3;
            if (var4 == 0) {
                return arg1;
            } else if (~var4 == -2) {
                return arg3;
            } else {
                return ~var4 == -3 ? 7 - arg1 : -arg3 + 7;
            }
        }
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(III)V", line = 93)
    public final void method807(int arg0, int arg1, int arg2) {
        ++field1486;
        if (arg2 != 5) {
            this.field1490 = 67;
        }
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(B)V", line = 103)
    public static void method808(byte arg0) {
        field1487 = null;
        if (arg0 > -89) {
            field1485 = 3L;
        }
    }
}
