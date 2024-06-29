import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class247 extends class108 {

    @OriginalMember(owner = "client!je", name = "n", descriptor = "Lbv;")
    public class568 field3110 = new class568();

    @OriginalMember(owner = "client!je", name = "k", descriptor = "Luv;")
    public static class3 field3107 = new class3(59, -1);

    @OriginalMember(owner = "client!je", name = "p", descriptor = "[I")
    public static int[] field3112 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!je", name = "q", descriptor = "F")
    public static float field3113;

    @OriginalMember(owner = "client!je", name = "j", descriptor = "I")
    public static int field3106;

    @OriginalMember(owner = "client!je", name = "l", descriptor = "I")
    public static int field3108;

    @OriginalMember(owner = "client!je", name = "m", descriptor = "I")
    public static int field3109;

    @OriginalMember(owner = "client!je", name = "o", descriptor = "Ljava/awt/Frame;")
    public static Frame field3111;

    @OriginalMember(owner = "client!je", name = "r", descriptor = "[Lrs;")
    public static class276[] field3114;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(ILhda;)Ljava/lang/String;")
    public static final String method1515(int arg0, class245 arg1) {
        if (arg0 >= -64) {
            return null;
        } else {
            field3109++;
            return arg1.field3093 == null || arg1.field3093.length() <= 0 ? arg1.field3105 : arg1.field3105 + class170.field2149.method2157(class245.field3103, 4074) + arg1.field3093;
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(B)V")
    public static void method1516(byte arg0) {
        field3111 = null;
        field3107 = null;
        field3114 = null;
        field3112 = null;
        if (arg0 != -92) {
            field3107 = null;
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(II)Ldp;")
    public static final class426 method1517(int arg0, int arg1) {
        field3108++;
        class426 var2 = (class426) class510.field7112.method323((long) arg1, -19814);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class592.field8551.method2054(true, 0, arg1);
        int var4 = 102 % ((-arg0 - 19) / 55);
        class426 var5 = new class426();
        if (var3 != null) {
            var5.method2498((byte) 59, new class551(var3));
        }
        var5.method2499((byte) -45);
        class510.field7112.method316((long) arg1, (byte) -118, var5);
        return var5;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(BIIIZILkr;)V")
    public static final void method1518(byte arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, class329 arg6) {
        class463.field6597 = 1;
        field3106++;
        class341.field4743 = arg1;
        class236.field3031 = arg4;
        class217.field2773 = arg6;
        class474.field6695 = arg2;
        if (arg0 != 84) {
            field3112 = null;
        }
        class148.field1924 = arg3;
        class148.field1917 = arg5;
    }
}
