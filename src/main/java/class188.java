import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ov")
public class class188 extends class588 {

    @OriginalMember(owner = "client!ov", name = "N", descriptor = "[I")
    public static int[] field2857 = new int[1000];

    @OriginalMember(owner = "client!ov", name = "M", descriptor = "I")
    public static int field2856 = 7000;

    @OriginalMember(owner = "client!ov", name = "P", descriptor = "I")
    public static int field2859 = field2856;

    @OriginalMember(owner = "client!ov", name = "L", descriptor = "Ljava/util/Hashtable;")
    public static Hashtable field2855 = new Hashtable();

    @OriginalMember(owner = "client!ov", name = "R", descriptor = "I")
    public static int field2861 = -1;

    @OriginalMember(owner = "client!ov", name = "O", descriptor = "I")
    public static int field2858;

    @OriginalMember(owner = "client!ov", name = "Q", descriptor = "I")
    public static int field2860;

    @OriginalMember(owner = "client!ov", name = "c", descriptor = "(I)V")
    public static void method1312(int arg0) {
        field2855 = null;
        field2857 = null;
        if (arg0 <= 85) {
            method1313(true, true, (String) null, -126, (String) null);
        }
    }

    @OriginalMember(owner = "client!ov", name = "<init>", descriptor = "(Lvd;Lvd;Lhha;)V")
    public class188(class39 arg0, class39 arg1, class521 arg2) {
        super(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(ZZLjava/lang/String;ILjava/lang/String;)V")
    public static final void method1313(boolean arg0, boolean arg1, String arg2, int arg3, String arg4) {
        ++field2858;
        class468 var5 = class317.method2011(0);
        var5.field6839.method3730(105, class725.field10126.field7796);
        var5.field6839.method3702(0, (byte) -111);
        int var6 = var5.field6839.field9084;
        var5.field6839.method3702(639, (byte) -118);
        int[] var7 = class15.method96(99999999, var5);
        int var8 = var5.field6839.field9084;
        var5.field6839.method3692(119, arg4);
        var5.field6839.method3702(class299.field4243, (byte) -107);
        var5.field6839.method3692(121, arg2);
        var5.field6839.method3735(class293.field4177, -53);
        var5.field6839.method3730(111, class650.field9160);
        var5.field6839.method3730(109, class199.field2993.field6820);
        class274.method1743(var5.field6839, (byte) 34);
        if (!arg0) {
            String var9 = class64.field925;
            var5.field6839.method3730(119, var9 != null ? 1 : 0);
            if (var9 != null) {
                var5.field6839.method3692(120, var9);
            }
            var5.field6839.method3730(102, arg3);
            var5.field6839.method3730(115, arg1 ? 1 : 0);
            var5.field6839.field9084 += 7;
            var5.field6839.method3732(var5.field6839.field9084, var7, (byte) 123, var8);
            var5.field6839.method3700(-var6 + var5.field6839.field9084, arg0);
            class120.method872((byte) 46, var5);
            class362.field5235 = 0;
            class313.field4434 = -3;
            class79.field1100 = 0;
            class661.field9245 = 1;
            if (~arg3 > -14) {
                class8.field108 = true;
                class461.method2813(true);
            }
        }
    }

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(IIIII)V")
    public final void method1314(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field2860;
        int var6 = super.field8331.method1504();
        int var7 = ((class521) super.field2722).field7458 * class689.method3911(0) / 10 % var6;
        if (arg0 <= -16) {
            super.field8331.method3150(arg3 + var7 - var6, arg1, arg2 + var6 + -var7, arg4);
        }
    }
}
