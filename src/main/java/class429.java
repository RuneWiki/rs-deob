import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mea")
public class class429 {

    @OriginalMember(owner = "client!mea", name = "c", descriptor = "[I")
    public static int[] field6121 = new int[] { 0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4 };

    @OriginalMember(owner = "client!mea", name = "e", descriptor = "I")
    public static int field6123 = 0;

    @OriginalMember(owner = "client!mea", name = "a", descriptor = "I")
    public static int field6119;

    @OriginalMember(owner = "client!mea", name = "d", descriptor = "I")
    public static int field6122;

    @OriginalMember(owner = "client!mea", name = "f", descriptor = "I")
    public static int field6124;

    @OriginalMember(owner = "client!mea", name = "b", descriptor = "J")
    public static long field6120;

    @OriginalMember(owner = "client!mea", name = "a", descriptor = "(IZI)V", line = 6)
    public static final void method2619(int arg0, boolean arg1, int arg2) {
        field6124++;
        class592 var3 = class682.method3825(-652872096, 1, arg2);
        var3.method3351(0);
        if (arg1) {
            method2622(null, -68, null);
        }
        var3.field8337 = arg0;
    }

    @OriginalMember(owner = "client!mea", name = "a", descriptor = "(I)I", line = 20)
    public static final int method2620(int arg0) {
        if (arg0 != 1) {
            field6123 = 30;
        }
        field6119++;
        return class114.method799(-73, false);
    }

    @OriginalMember(owner = "client!mea", name = "a", descriptor = "(B)V", line = 38)
    public static void method2621(byte arg0) {
        if (arg0 > -13) {
            field6120 = -83L;
        }
        field6121 = null;
    }

    @OriginalMember(owner = "client!mea", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;)V", line = 53)
    public static final void method2622(String arg0, int arg1, String arg2) {
        class343.field4791 = -1;
        class549.field7670 = 1;
        int var3 = -121 / ((47 - arg1) / 38);
        field6122++;
        class579.method3301(arg0, false, 0, arg2);
    }
}
