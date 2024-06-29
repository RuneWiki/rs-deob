import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hj")
public class class193 {

    @OriginalMember(owner = "client!hj", name = "d", descriptor = "I")
    public static int field2814 = 0;

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "I")
    public static int field2811;

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "I")
    public static int field2812;

    @OriginalMember(owner = "client!hj", name = "c", descriptor = "I")
    public static int field2813;

    @OriginalMember(owner = "client!hj", name = "e", descriptor = "I")
    public static int field2815;

    @OriginalMember(owner = "client!hj", name = "f", descriptor = "J")
    public static long field2816;

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(Ljava/lang/String;II)Z", line = 5)
    public static final boolean method1273(String arg0, int arg1, int arg2) {
        field2811++;
        if (class173.field2628 != 3) {
            class184.field2737 = new class41();
            class184.field2737.field603 = arg0;
            class184.field2737.field609 = arg2;
            if (class81.field1144 != class523.field7659) {
                class184.field2737.field604 = class184.field2737.field609 + 40000;
                class184.field2737.field605 = class184.field2737.field609 + 50000;
            }
            return true;
        }
        if (arg1 != 40000) {
            method1273(null, -26, 67);
        }
        String var3 = "";
        if (class81.field1144 != class523.field7659) {
            var3 = ":" + (arg2 + 7000);
        }
        String var4 = "";
        if (class255.field3476 != null) {
            var4 = "/p=" + class255.field3476;
        }
        String var5 = "http://" + arg0 + var3 + "/l=" + class486.field6998 + "/a=" + class387.field5536 + var4 + "/j" + (class219.field3091 ? "1" : "0") + ",o" + (class346.field4977 ? "1" : "0") + ",a2";
        try {
            class502.field7343.getAppletContext().showDocument(new URL(var5), "_self");
            return true;
        } catch (Exception var6) {
            return false;
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(ILjava/lang/String;ZILjava/lang/String;IIIZZJ)V", line = 56)
    public static final void method1274(int arg0, String arg1, boolean arg2, int arg3, String arg4, int arg5, int arg6, int arg7, boolean arg8, boolean arg9, long arg10) {
        field2812++;
        if (class526.field7677 || class527.field7690 >= 500) {
            return;
        }
        int var12 = arg3 == -1 ? class358.field5165 : arg3;
        class440 var13 = new class440(arg1, arg4, var12, arg7, arg5, arg10, arg0, arg6, arg2, arg8);
        class391.field5638.method3139(0, var13);
        class527.field7690++;
        if (!arg9) {
            method1273(null, -50, 88);
        }
    }
}
