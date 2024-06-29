import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nr")
public class class53 implements class252 {

    @OriginalMember(owner = "client!nr", name = "c", descriptor = "Ljava/lang/String;")
    public static String field610 = null;

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "I")
    public static int field608;

    @OriginalMember(owner = "client!nr", name = "b", descriptor = "I")
    public static int field609;

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(Lgo;[IIJ)Ljava/lang/String;", line = 3)
    public final String method408(class581 arg0, int[] arg1, int arg2, long arg3) {
        if (arg2 != 0) {
            return null;
        }
        field608++;
        if (class78.field1185 == arg0) {
            class563 var6 = class545.field7395.method815(true, arg1[0]);
            return var6.method3155(0, (int) arg3);
        } else if (class436.field6064 == arg0 || class607.field8441 == arg0) {
            class661 var7 = class599.field8366.method3949(arg2, (int) arg3);
            return var7.field9222;
        } else if (class375.field5027 == arg0 || class301.field4166 == arg0 || class316.field4351 == arg0) {
            return class545.field7395.method815(true, arg1[0]).method3155(0, (int) arg3);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(B)V", line = 50)
    public static void method409(byte arg0) {
        if (arg0 <= 27) {
            method409((byte) -37);
        }
        field610 = null;
    }
}
