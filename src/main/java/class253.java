import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public class class253 extends class305 {

    @OriginalMember(owner = "client!wg", name = "G", descriptor = "Lln;")
    public class114 field3959;

    @OriginalMember(owner = "client!wg", name = "I", descriptor = "Ljava/lang/String;")
    public static String field3961 = " from your friend list first.";

    @OriginalMember(owner = "client!wg", name = "D", descriptor = "I")
    public static int field3957;

    @OriginalMember(owner = "client!wg", name = "E", descriptor = "I")
    public static int field3958;

    @OriginalMember(owner = "client!wg", name = "H", descriptor = "I")
    public static int field3960;

    @OriginalMember(owner = "client!wg", name = "J", descriptor = "I")
    public static int field3962;

    @OriginalMember(owner = "client!wg", name = "K", descriptor = "I")
    public static int field3963;

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(BLbm;)V", line = 6)
    public static final void method1698(byte arg0, class307 arg1) {
        class336.field5162 = arg1.method2052("titlebg", true);
        class9.field191 = arg1.method2052("logo", true);
        int var2 = 75 % ((-arg0 - 23) / 46);
        field3957++;
    }

    @OriginalMember(owner = "client!wg", name = "d", descriptor = "(I)V", line = 22)
    public static void method1699(int arg0) {
        field3961 = null;
        if (arg0 >= -44) {
            field3958 = -79;
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(I[Ljava/lang/String;)[Ljava/lang/String;", line = 35)
    public static final String[] method1700(int arg0, String[] arg1) {
        String[] var2 = new String[5];
        field3962++;
        for (int var3 = 0; var3 < 5; var3++) {
            var2[var3] = var3 + ": ";
            if (arg1 != null && arg1[var3] != null) {
                var2[var3] = var2[var3] + arg1[var3];
            }
        }
        if (arg0 != -6) {
            field3960 = -114;
        }
        return var2;
    }

    @OriginalMember(owner = "client!wg", name = "<init>", descriptor = "(Lln;)V", line = 66)
    public class253(class114 arg0) {
        this.field3959 = arg0;
    }
}
