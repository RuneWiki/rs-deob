import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class322 {

    @OriginalMember(owner = "client!tc", name = "e", descriptor = "[Z")
    public static boolean[] field5038 = new boolean[200];

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "I")
    public int field5034;

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "I")
    public int field5035;

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "I")
    public static int field5036;

    @OriginalMember(owner = "client!tc", name = "d", descriptor = "I")
    public int field5037;

    @OriginalMember(owner = "client!tc", name = "f", descriptor = "I")
    public int field5039;

    @OriginalMember(owner = "client!tc", name = "g", descriptor = "I")
    public int field5040;

    @OriginalMember(owner = "client!tc", name = "h", descriptor = "I")
    public static int field5041;

    @OriginalMember(owner = "client!tc", name = "i", descriptor = "I")
    public int field5042;

    @OriginalMember(owner = "client!tc", name = "j", descriptor = "I")
    public int field5043;

    @OriginalMember(owner = "client!tc", name = "k", descriptor = "I")
    public int field5044;

    @OriginalMember(owner = "client!tc", name = "l", descriptor = "I")
    public int field5045;

    @OriginalMember(owner = "client!tc", name = "m", descriptor = "I")
    public int field5046;

    @OriginalMember(owner = "client!tc", name = "n", descriptor = "I")
    public int field5047;

    @OriginalMember(owner = "client!tc", name = "o", descriptor = "I")
    public int field5048;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(I)V")
    public static void method2183(int arg0) {
        if (arg0 == -10966) {
            field5038 = null;
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIZII)Luaa;")
    public static final class102 method2184(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        field5036++;
        class102 var5 = new class102();
        var5.field1689 = arg1;
        var5.field1687 = arg0;
        class486.field7115.method1564((long) arg3, var5, (byte) 109);
        class51.method577(arg0, 127);
        class665 var6 = class326.method2197(false, arg3);
        if (var6 != null) {
            class362.method2415(-127, var6);
        }
        if (class672.field9481 != null) {
            class362.method2415(-128, class672.field9481);
            class672.field9481 = null;
        }
        class226.method1661(16);
        if (var6 != null) {
            class318.method2168((byte) 119, var6, !arg2);
        }
        if (!arg2) {
            class142.method1208(arg0);
        }
        if (arg4 != 1) {
            field5038 = null;
        }
        if (!arg2 && class528.field7706 != -1) {
            class281.method1994(62, 1, class528.field7706);
        }
        return var5;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(Ltc;I)Z")
    public final boolean method2185(class322 arg0, int arg1) {
        if (arg1 != 1) {
            this.method2185(null, 83);
        }
        field5041++;
        return this.field5035 == arg0.field5035 && this.field5048 == arg0.field5048 && this.field5043 == arg0.field5043;
    }
}
