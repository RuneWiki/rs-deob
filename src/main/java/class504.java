import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bv")
public abstract class class504 extends class337 {

    @OriginalMember(owner = "client!bv", name = "l", descriptor = "Luw;")
    public static class208 field6454 = new class208(59, 2);

    @OriginalMember(owner = "client!bv", name = "q", descriptor = "Ljava/lang/String;")
    public static String field6459 = null;

    @OriginalMember(owner = "client!bv", name = "m", descriptor = "I")
    public static int field6455;

    @OriginalMember(owner = "client!bv", name = "n", descriptor = "I")
    public static int field6456;

    @OriginalMember(owner = "client!bv", name = "p", descriptor = "I")
    public static int field6458;

    @OriginalMember(owner = "client!bv", name = "o", descriptor = "[I")
    public static int[] field6457;

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(ILmc;)V")
    public abstract void method1006(int arg0, class234 arg1);

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(B)V")
    public static final void method2792(byte arg0) {
        field6456++;
        int[] var1 = new int[class640.field8189.field1555];
        int var2 = 0;
        for (int var3 = 0; var3 < class640.field8189.field1555; var3++) {
            class48 var6 = class640.field8189.method705(var3, -11467);
            if (var6.field566 >= 0 || var6.field604 >= 0) {
                var1[var2++] = var3;
            }
        }
        class793.field10874 = new int[var2];
        int var4 = -65 % ((4 - arg0) / 42);
        for (int var5 = 0; var5 < var2; var5++) {
            class793.field10874[var5] = var1[var5];
        }
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(Lqc;Z)V")
    public abstract void method1003(class400 arg0, boolean arg1);

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(Z)V")
    public static void method2793(boolean arg0) {
        field6454 = null;
        field6459 = null;
        field6457 = null;
        if (arg0) {
            field6454 = null;
        }
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(IILmc;)Ljava/lang/String;")
    public static final String method2794(int arg0, int arg1, class234 arg2) {
        field6458++;
        try {
            int var3 = arg2.method1505((byte) -6);
            if (arg1 != -27207) {
                return null;
            }
            if (arg0 < var3) {
                var3 = arg0;
            }
            byte[] var4 = new byte[var3];
            arg2.field3133 += class157.field2033.method3904(arg2.field3193, arg2.field3133, 0, var3, var4, (byte) -125);
            return class289.method1750(-128, var3, var4, 0);
        } catch (Exception var6) {
            return "Cabbage";
        }
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(ZLjava/lang/String;)V")
    public static final void method2795(boolean arg0, String arg1) {
        field6455++;
        if (arg1.equals("")) {
            return;
        }
        class498.field6388++;
        class13 var2 = class659.method3587(class68.field909, 98, class380.field4652);
        var2.field130.method1491(-129, class32.method168(arg1, 65));
        var2.field130.method1547(arg1, -6457);
        if (!arg0) {
            class116.method679(var2, 0);
        }
    }
}
