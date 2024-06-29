import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lga")
public class class713 implements class249 {

    @OriginalMember(owner = "client!lga", name = "a", descriptor = "I")
    public static int field9854 = 0;

    @OriginalMember(owner = "client!lga", name = "b", descriptor = "I")
    public static int field9855;

    @OriginalMember(owner = "client!lga", name = "c", descriptor = "I")
    public static int field9856;

    @OriginalMember(owner = "client!lga", name = "a", descriptor = "(B)V", line = 6)
    public static final void method4002(byte arg0) {
        if (arg0 != 70) {
            return;
        }
        field9856++;
        if (class549.field7251 != null) {
            class549.field7251.method1275(1);
        }
        if (class401.field5596 == null) {
            return;
        }
        while (true) {
            try {
                class401.field5596.join();
                return;
            } catch (InterruptedException var1) {
            }
        }
    }

    @OriginalMember(owner = "client!lga", name = "a", descriptor = "([IJILkg;)Ljava/lang/String;", line = 35)
    public final String method1529(int[] arg0, long arg1, int arg2, class275 arg3) {
        field9855++;
        if (class117.field1887 == arg3) {
            class305 var6 = class353.field4974.method2959(arg0[0], (byte) -127);
            return var6.method1892(-128, (int) arg1);
        }
        if (arg2 != -7751) {
            field9854 = -78;
        }
        if (class380.field5288 == arg3 || class749.field10401 == arg3) {
            class597 var7 = class77.field948.method1165((byte) 106, (int) arg1);
            return var7.field7763;
        } else if (class275.field3835 == arg3 || class85.field1029 == arg3 || class1.field9 == arg3) {
            return class353.field4974.method2959(arg0[0], (byte) -93).method1892(-125, (int) arg1);
        } else {
            return null;
        }
    }
}
