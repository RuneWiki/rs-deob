import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lr")
public class class277 extends class394 {

    @OriginalMember(owner = "client!lr", name = "l", descriptor = "I")
    public int field3671 = -1;

    @OriginalMember(owner = "client!lr", name = "m", descriptor = "I")
    public static int field3672;

    @OriginalMember(owner = "client!lr", name = "n", descriptor = "I")
    public static int field3673;

    @OriginalMember(owner = "client!lr", name = "o", descriptor = "I")
    public static int field3674;

    @OriginalMember(owner = "client!lr", name = "p", descriptor = "I")
    public int field3675;

    @OriginalMember(owner = "client!lr", name = "q", descriptor = "I")
    public static int field3676;

    @OriginalMember(owner = "client!lr", name = "r", descriptor = "Ljava/lang/String;")
    public String field3677;

    @OriginalMember(owner = "client!lr", name = "s", descriptor = "Ljava/lang/String;")
    public String field3678;

    @OriginalMember(owner = "client!lr", name = "b", descriptor = "(B)Lqr;", line = 7)
    public final class665 method1658(byte arg0) {
        if (arg0 != -114) {
            method1660(35, -98, (String) null, true, -13);
        }
        ++field3672;
        return class65.field812[super.field5257];
    }

    @OriginalMember(owner = "client!lr", name = "e", descriptor = "(I)V", line = 23)
    public static final void method1659(int arg0) {
        class657.field9361 = 0;
        class485.field6740 = -1;
        ++field3674;
        class387.field5165 = -1;
        class502.field6926 = -1;
        if (arg0 >= -114) {
            method1660(89, -95, (String) null, false, -10);
        }
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(IILjava/lang/String;ZI)V", line = 38)
    public static final void method1660(int arg0, int arg1, String arg2, boolean arg3, int arg4) {
        if (arg0 < 73) {
            method1661(-30, -85, (class573) null, (byte) 37);
        }
        class293.method1738(arg2, arg3, (byte) 91, false, arg1, (String) null, arg4);
        ++field3676;
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(IILkba;B)V", line = 49)
    public static final void method1661(int arg0, int arg1, class573 arg2, byte arg3) {
        ++field3673;
        int[] var4 = new int[4];
        if (arg3 < -115) {
            class2.method8(var4, 0, var4.length, arg1);
            class225.method1406(arg0, arg2, var4, true);
        }
    }
}
