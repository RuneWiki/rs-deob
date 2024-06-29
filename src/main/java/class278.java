import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class278 implements class139 {

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "I")
    public static int field4454 = 0;

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "I")
    public static int field4455;

    @OriginalMember(owner = "client!bd", name = "d", descriptor = "I")
    public static int field4457;

    @OriginalMember(owner = "client!bd", name = "e", descriptor = "I")
    public static int field4458;

    @OriginalMember(owner = "client!bd", name = "f", descriptor = "I")
    public static int field4459;

    @OriginalMember(owner = "client!bd", name = "g", descriptor = "I")
    public static int field4460;

    @OriginalMember(owner = "client!bd", name = "h", descriptor = "I")
    public static int field4461;

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "Z")
    public static boolean field4456;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(IB)V")
    public static final void method1860(int arg0, byte arg1) {
        int var2 = 97 % ((-arg1 - 62) / 52);
        field4457++;
        class283 var3 = class46.method360(5, -114, arg0);
        var3.method1900(true);
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(III)Lwj;")
    public static final class195 method1861(int arg0, int arg1, int arg2) {
        class99 var3 = class273.field4415[arg0][arg1][arg2];
        return var3 == null ? null : var3.field1494;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(J[III)Ljava/lang/String;")
    public final String method956(long arg0, int[] arg1, int arg2, int arg3) {
        field4455++;
        if (arg2 != 0) {
            return null;
        } else if (arg3 == 0) {
            class127 var6 = class265.method1792(arg1[0], 255);
            return var6.method885((int) arg0, (byte) 127);
        } else if (arg3 == 1 || arg3 == 10) {
            class208 var7 = class64.method514((int) arg0, 0);
            return var7.field3358;
        } else if (arg3 == 6 || arg3 == 7 || arg3 == 11) {
            return class265.method1792(arg1[0], 255).method885((int) arg0, (byte) 126);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(ILjj;Ljj;)I")
    public static final int method1862(int arg0, class134 arg1, class134 arg2) {
        field4461++;
        int var3 = 0;
        if (arg2.method935((byte) 31, class284.field4544)) {
            var3++;
        }
        if (arg2.method935((byte) 31, class225.field3562)) {
            var3++;
        }
        if (arg2.method935((byte) 31, class191.field3055)) {
            var3++;
        }
        int var4 = -77 % ((arg0 + 27) / 52);
        if (arg1.method935((byte) 31, class284.field4544)) {
            var3++;
        }
        if (arg1.method935((byte) 31, class225.field3562)) {
            var3++;
        }
        if (arg1.method935((byte) 31, class191.field3055)) {
            var3++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(ILjava/lang/String;)I")
    public static final int method1863(int arg0, String arg1) {
        if (arg0 != 3934) {
            method1860(11, (byte) -63);
        }
        field4458++;
        return class191.method1294(true, arg1, 10, 77);
    }
}
