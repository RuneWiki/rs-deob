import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public class class486 {

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "I")
    public static int field6883 = 0;

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "I")
    public static int field6884;

    @OriginalMember(owner = "client!ch", name = "c", descriptor = "I")
    public static int field6885;

    @OriginalMember(owner = "client!ch", name = "d", descriptor = "I")
    public static int field6886;

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(II)Lip;")
    public static final class734 method2836(int arg0, int arg1) {
        field6886++;
        if (arg0 == 0) {
            if ((double) class436.field6216 == 3.0D) {
                return class614.field8657;
            }
            if ((double) class436.field6216 == 4.0D) {
                return class518.field7405;
            }
            if ((double) class436.field6216 == 6.0D) {
                return class650.field9151;
            }
            if ((double) class436.field6216 >= 8.0D) {
                return class682.field9684;
            }
        } else if (arg0 == 1) {
            if ((double) class436.field6216 == 3.0D) {
                return class650.field9151;
            }
            if ((double) class436.field6216 == 4.0D) {
                return class682.field9684;
            }
            if ((double) class436.field6216 == 6.0D) {
                return class751.field10420;
            }
            if ((double) class436.field6216 >= 8.0D) {
                return class363.field5252;
            }
        } else if (arg0 == 2) {
            if ((double) class436.field6216 == 3.0D) {
                return class751.field10420;
            }
            if ((double) class436.field6216 == 4.0D) {
                return class363.field5252;
            }
            if ((double) class436.field6216 == 6.0D) {
                return class214.field3085;
            }
            if ((double) class436.field6216 >= 8.0D) {
                return class356.field5169;
            }
        }
        if (arg1 != -17667) {
            field6883 = -122;
        }
        return null;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(I)V")
    public static final void method2837(int arg0) {
        if (arg0 <= -67) {
            field6885++;
            class762.method4197((byte) -118);
            class422.field5962 = false;
            class223.method1546(class611.field8627, class505.field7233, (byte) 125, class407.field5748, class761.field10487);
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(ILs;)V")
    public static final void method2838(int arg0, class292 arg1) {
        class622.field8777[arg0] = arg1;
    }

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "(I)V")
    public static final void method2839(int arg0) {
        field6884++;
        class364.field5270.method3377((byte) 123);
        class655.method3755((byte) 68);
        class225.field3231 = null;
        class638.field8975 = 0;
        class127.field1655 = null;
        class786.field10810 = 0;
        class654.field9233 = null;
        class26.field371.field1521 = 0;
        class759.method4191((byte) 90);
        class50.field719 = 0;
        class75.field1011 = 0;
        class492.field6992 = null;
        class269.field3772 = null;
        class736.field10279 = 0;
        if (arg0 != 29699) {
            field6883 = -60;
        }
        class438.field6283 = null;
        class584.field8265 = null;
    }
}
