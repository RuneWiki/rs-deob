import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ffa")
public class class173 {

    @OriginalMember(owner = "client!ffa", name = "c", descriptor = "I")
    public int field2665;

    @OriginalMember(owner = "client!ffa", name = "l", descriptor = "I")
    public int field2674;

    @OriginalMember(owner = "client!ffa", name = "e", descriptor = "Ljava/lang/String;")
    public String field2667;

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "J")
    public long field2663;

    @OriginalMember(owner = "client!ffa", name = "g", descriptor = "Ljava/lang/String;")
    public String field2669;

    @OriginalMember(owner = "client!ffa", name = "h", descriptor = "Ljava/util/Calendar;")
    public static Calendar field2670 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!ffa", name = "b", descriptor = "I")
    public static int field2664;

    @OriginalMember(owner = "client!ffa", name = "d", descriptor = "I")
    public static int field2666;

    @OriginalMember(owner = "client!ffa", name = "f", descriptor = "I")
    public static int field2668;

    @OriginalMember(owner = "client!ffa", name = "i", descriptor = "I")
    public static int field2671;

    @OriginalMember(owner = "client!ffa", name = "j", descriptor = "I")
    public static int field2672;

    @OriginalMember(owner = "client!ffa", name = "k", descriptor = "I")
    public static int field2673;

    @OriginalMember(owner = "client!ffa", name = "m", descriptor = "I")
    public static int field2675;

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;B)V", line = 5)
    public static final void method1171(String arg0, int arg1, String arg2, int arg3, String arg4, String arg5, int arg6, String arg7, byte arg8) {
        if (arg8 >= -6) {
            method1174((byte) -39);
        }
        field2671++;
        class393 var9 = class108.field1589[99];
        for (int var10 = 99; var10 > 0; var10--) {
            class108.field1589[var10] = class108.field1589[var10 - 1];
        }
        if (var9 == null) {
            var9 = new class393(arg1, arg3, arg2, arg7, arg0, arg5, arg6, arg4);
        } else {
            var9.method2259(arg1, -26475, arg4, arg0, arg5, arg6, arg2, arg7, arg3);
        }
        class355.field4827 = class367.field4959;
        class108.field1589[0] = var9;
        class92.field1401++;
    }

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(III)Z", line = 34)
    public static final boolean method1172(int arg0, int arg1, int arg2) {
        if (arg0 == -970) {
            field2664++;
            return class115.method914((byte) 109, arg1, arg2) & class680.method3799(arg2, arg1, -1718);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(B)V", line = 45)
    public static void method1173(byte arg0) {
        field2670 = null;
        int var1 = 58 / ((-arg0 - 47) / 45);
    }

    @OriginalMember(owner = "client!ffa", name = "b", descriptor = "(B)[Ltga;", line = 64)
    public static final class54[] method1174(byte arg0) {
        if (arg0 != 56) {
            method1174((byte) -8);
        }
        field2672++;
        return new class54[] { class616.field8169, class646.field8662, class229.field3207, class677.field9568, class281.field3991, class445.field6093 };
    }

    @OriginalMember(owner = "client!ffa", name = "<init>", descriptor = "(ILjava/lang/String;ILjava/lang/String;J)V", line = 75)
    public class173(int arg0, String arg1, int arg2, String arg3, long arg4) {
        this.field2665 = arg0;
        this.field2674 = arg2;
        this.field2667 = arg3;
        this.field2663 = arg4;
        this.field2669 = arg1;
    }
}
