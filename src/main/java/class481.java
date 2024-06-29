import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class481 extends class71 {

    @OriginalMember(owner = "client!ea", name = "k", descriptor = "Ljava/lang/String;")
    public String field6707;

    @OriginalMember(owner = "client!ea", name = "l", descriptor = "[I")
    public static int[] field6708 = new int[25];

    @OriginalMember(owner = "client!ea", name = "j", descriptor = "I")
    public static int field6706 = 0;

    @OriginalMember(owner = "client!ea", name = "n", descriptor = "D")
    public static double field6710;

    @OriginalMember(owner = "client!ea", name = "m", descriptor = "I")
    public static int field6709;

    @OriginalMember(owner = "client!ea", name = "o", descriptor = "I")
    public static int field6711;

    @OriginalMember(owner = "client!ea", name = "p", descriptor = "I")
    public static int field6712;

    @OriginalMember(owner = "client!ea", name = "r", descriptor = "I")
    public static int field6714;

    @OriginalMember(owner = "client!ea", name = "q", descriptor = "Ldea;")
    public static class357 field6713;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Z)V")
    public static void method2930(boolean arg0) {
        field6713 = null;
        if (!arg0) {
            field6713 = null;
        }
        field6708 = null;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(ILdc;I)Ljava/lang/String;")
    public static final String method2931(int arg0, class63 arg1, int arg2) {
        field6709++;
        try {
            int var3 = arg1.method478(-121);
            if (arg0 < var3) {
                var3 = arg0;
            }
            byte[] var4 = new byte[var3];
            arg1.field956 += class325.field4495.method102(var3, arg1.field954, (byte) -124, 0, var4, arg1.field956);
            String var5 = class62.method438(var3, var4, 0, (byte) 51);
            int var6 = 37 % ((arg2 + 58) / 48);
            return var5;
        } catch (Exception var7) {
            return "Cabbage";
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIIILkea;I)V")
    public static final void method2932(int arg0, int arg1, int arg2, int arg3, class77 arg4, int arg5) {
        field6712++;
        if (arg2 > -27) {
            method2934(114);
        }
        if (arg5 < 1 || arg0 < 1 || (class277.field4036 - 2) < arg5 || class667.field9202 - 2 < arg0) {
            return;
        }
        if (class137.field1948 == null) {
            return;
        }
        class722 var6 = class647.field8683.method1745(-1, arg1, arg5, arg0, arg3);
        if (var6 == null) {
            return;
        }
        if (!(var6 instanceof class352)) {
            if (!(var6 instanceof class129)) {
                if ((var6 instanceof class746)) {
                    ((class746) var6).method4151(arg4, 56);
                } else if (var6 instanceof class279) {
                    ((class279) var6).method1869(0, arg4);
                    return;
                }
                return;
            }
            ((class129) var6).method808((byte) 34, arg4);
            return;
        }
        ((class352) var6).method2270(arg4, true);
        return;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IZIIIILjava/lang/String;I)V")
    public static final void method2933(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, String arg6, int arg7) {
        field6711++;
        class437 var8 = new class437();
        var8.field6100 = class483.field6741 + arg4;
        var8.field6094 = arg5;
        var8.field6102 = arg6;
        var8.field6103 = arg2;
        var8.field6098 = arg0;
        if (arg1) {
            method2932(2, 114, -121, -123, null, 80);
        }
        var8.field6097 = arg3;
        var8.field6096 = arg7;
        class217.field2831.method1643(var8, 126);
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(I)V")
    public static final void method2934(int arg0) {
        field6714++;
        if (class102.field1401 == arg0) {
            class327.method2089(false, false);
        } else {
            class197.field2653 = class713.field9960;
            class713.field9960 = null;
            class647.method3624(13, true);
        }
    }

    @OriginalMember(owner = "client!ea", name = "<init>", descriptor = "()V")
    public class481() {
    }

    @OriginalMember(owner = "client!ea", name = "<init>", descriptor = "(Ljava/lang/String;)V")
    public class481(String arg0) {
        this.field6707 = arg0;
    }
}
