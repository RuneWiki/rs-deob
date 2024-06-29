import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class437 {

    @OriginalMember(owner = "client!cf", name = "d", descriptor = "[I")
    public static int[] field6233 = new int[] { 2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0 };

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "Lqt;")
    public static class459 field6231 = new class459(20, 6);

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "I")
    public static int field6230;

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "I")
    public static int field6232;

    @OriginalMember(owner = "client!cf", name = "e", descriptor = "I")
    public static int field6234;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(ZLwn;)Lel;")
    public static final class391 method2572(boolean arg0, class519 arg1) {
        if (!arg0) {
            field6233 = null;
        }
        field6234++;
        return new class391(arg1.method3044((byte) -111), arg1.method3044((byte) -99), arg1.method3044((byte) -89), arg1.method3044((byte) -124), arg1.method3044((byte) -101), arg1.method3044((byte) -123), arg1.method3044((byte) -127), arg1.method3044((byte) -114), arg1.method3040((byte) -3), arg1.method3072((byte) -123));
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IBI)Z")
    public static final boolean method2573(int arg0, byte arg1, int arg2) {
        int var3 = -125 / ((-arg1 - 5) / 49);
        field6230++;
        if (class294.method1896(arg0, arg2, 258)) {
            return class375.method2293(arg0, (byte) -6, arg2) | (arg2 & 0xB000) != 0 | class431.method2557(arg0, false, arg2) ? true : (class350.method2203(arg0, 0, arg2) | class29.method171(3072, arg0, arg2)) & (arg0 & 0x37) == 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(I)V")
    public static void method2574(int arg0) {
        field6233 = null;
        field6231 = null;
        int var1 = 4 / ((-arg0 - 13) / 42);
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(Ljava/lang/String;ZLul;ZI)V")
    public static final void method2575(String arg0, boolean arg1, class411 arg2, boolean arg3, int arg4) {
        if (arg4 != 24991) {
            field6233 = null;
        }
        field6232++;
        if (!arg1) {
            class229.method1532(1, 3, arg2, arg0);
            return;
        }
        if (class411.field5820.startsWith("win") && class411.field5809 != 3) {
            String var5 = null;
            if (arg2.field5824 != null) {
                var5 = arg2.field5824.getParameter("haveie6");
            }
            if (var5 == null || !var5.equals("1")) {
                class81 var6 = class229.method1532(1, 0, arg2, arg0);
                class294.field4394 = arg2;
                class181.field2670 = arg0;
                class79.field1293 = var6;
                return;
            }
        }
        if (class411.field5820.startsWith("mac")) {
            String var7 = null;
            if (arg2.field5824 != null) {
                var7 = arg2.field5824.getParameter("havefirefox");
            }
            if (var7 != null && var7.equals("1") && arg3) {
                class229.method1532(1, 1, arg2, arg0);
                return;
            }
        }
        class229.method1532(arg4 - 24990, 2, arg2, arg0);
    }
}
