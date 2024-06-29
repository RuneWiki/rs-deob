import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public class class141 {

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "Z")
    public static boolean field2436 = true;

    @OriginalMember(owner = "client!nj", name = "c", descriptor = "Lqk;")
    private static class207 field2437 = class24.method212(255, "Starting 3d Library");

    @OriginalMember(owner = "client!nj", name = "e", descriptor = "Lqk;")
    public static class207 field2439 = class24.method212(255, "ondulation2:");

    @OriginalMember(owner = "client!nj", name = "g", descriptor = "I")
    public static int field2441 = 0;

    @OriginalMember(owner = "client!nj", name = "f", descriptor = "Lqk;")
    public static class207 field2440 = field2437;

    @OriginalMember(owner = "client!nj", name = "j", descriptor = "I")
    public static int field2444 = 2;

    @OriginalMember(owner = "client!nj", name = "k", descriptor = "Lbf;")
    public static class199 field2445 = new class199(64);

    @OriginalMember(owner = "client!nj", name = "l", descriptor = "I")
    public static int field2446 = 0;

    @OriginalMember(owner = "client!nj", name = "m", descriptor = "Lqk;")
    public static class207 field2447 = class24.method212(255, "gr-Un:");

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "I")
    public static int field2435;

    @OriginalMember(owner = "client!nj", name = "d", descriptor = "I")
    public static int field2438;

    @OriginalMember(owner = "client!nj", name = "h", descriptor = "I")
    public static int field2442;

    @OriginalMember(owner = "client!nj", name = "i", descriptor = "I")
    public static int field2443;

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(I)V")
    public static void method979(int arg0) {
        field2445 = null;
        field2447 = null;
        field2437 = null;
        field2440 = null;
        field2439 = null;
        int var1 = -31 % ((arg0 + 39) / 33);
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(ZII[Lmd;IB)V")
    public static final void method980(boolean arg0, int arg1, int arg2, class220[] arg3, int arg4, byte arg5) {
        field2435++;
        int var6 = 0;
        int var7 = -20 % ((66 - arg5) / 59);
        while (var6 < arg3.length) {
            class220 var8 = arg3[var6];
            if (var8 != null && var8.field4045 == arg4) {
                class204.method1413(var8, arg2, -1, arg1, arg0);
                class46.method358(arg1, var8, arg2, 30);
                if (var8.field3891 > var8.field3925 - var8.field4037) {
                    var8.field3891 = var8.field3925 - var8.field4037;
                }
                if ((var8.field3991 - var8.field3948) < var8.field4059) {
                    var8.field4059 = var8.field3991 - var8.field3948;
                }
                if (var8.field3891 < 0) {
                    var8.field3891 = 0;
                }
                if (var8.field4059 < 0) {
                    var8.field4059 = 0;
                }
                if (var8.field3988 == 0) {
                    class191.method1333(var8, arg0, -230095088);
                }
            }
            var6++;
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(II)Lll;")
    public static final class205 method981(int arg0, int arg1) {
        field2443++;
        class205 var2 = (class205) class143.field2474.method1387((long) arg1, 121);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class151.field2647.method705(arg1, 0, arg0);
        class205 var4 = new class205(var3);
        var4.method1610(class249.field4512, (int[]) null);
        class143.field2474.method1385((long) arg1, var4, (byte) -121);
        return var4;
    }
}
