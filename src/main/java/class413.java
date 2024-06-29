import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fr")
public class class413 {

    @OriginalMember(owner = "client!fr", name = "b", descriptor = "[J")
    public static long[] field5838 = new long[100];

    @OriginalMember(owner = "client!fr", name = "h", descriptor = "Z")
    public static boolean field5844 = false;

    @OriginalMember(owner = "client!fr", name = "e", descriptor = "I")
    public static int field5841 = -1;

    @OriginalMember(owner = "client!fr", name = "c", descriptor = "I")
    public static int field5839;

    @OriginalMember(owner = "client!fr", name = "d", descriptor = "I")
    public static int field5840;

    @OriginalMember(owner = "client!fr", name = "f", descriptor = "I")
    public static int field5842;

    @OriginalMember(owner = "client!fr", name = "i", descriptor = "I")
    public static int field5845;

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "Lni;")
    public static class522 field5837;

    @OriginalMember(owner = "client!fr", name = "g", descriptor = "Lni;")
    public static class522 field5843;

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(III)Lkfa;", line = 12)
    public static final class603 method2383(int arg0, int arg1, int arg2) {
        class624 var3 = class77.field947[arg0][arg1][arg2];
        return var3 == null ? null : var3.field8729;
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(IBZ)Lbd;", line = 24)
    public static final class62 method2384(int arg0, byte arg1, boolean arg2) {
        field5842++;
        class29[] var3 = class8.field52;
        synchronized (class8.field52) {
            if (arg1 != -47) {
                return null;
            }
            class62 var5;
            if (class8.field52.length <= arg0 || class8.field52[arg0].method122(true)) {
                var5 = new class62();
                var5.field678 = new class486[arg0];
                for (int var6 = 0; var6 < arg0; var6++) {
                    var5.field678[var6] = new class486();
                }
            } else {
                var5 = (class62) class8.field52[arg0].method120((byte) -39);
                var5.method975((byte) 126);
                int var10002 = class669.field9308[arg0]--;
            }
            var5.field683 = arg2;
            return var5;
        }
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(ILni;Lni;Lni;Lni;)V", line = 58)
    public static final void method2385(int arg0, class522 arg1, class522 arg2, class522 arg3, class522 arg4) {
        field5839++;
        class751.field10420 = arg1;
        class577.field8095 = arg4;
        if (arg0 >= -74) {
            method2383(109, 98, -81);
        }
        class18.field125 = arg3;
        class357.field4742 = new class218[class751.field10420.method2892((byte) -11)][];
        class534.field7246 = new boolean[class751.field10420.method2892((byte) -11)];
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(BII)Z", line = 80)
    public static final boolean method2386(byte arg0, int arg1, int arg2) {
        field5845++;
        if (arg0 > -90) {
            return false;
        } else {
            return class399.method2313(arg2, arg1, false) | (arg2 & 0x70000) != 0 || class584.method3261(arg2, arg1, false);
        }
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(I)V", line = 91)
    public static void method2387(int arg0) {
        field5838 = null;
        field5837 = null;
        field5843 = null;
        if (arg0 != -19406) {
            field5837 = null;
        }
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(Ljava/lang/String;II)V", line = 103)
    public static final void method2388(String arg0, int arg1, int arg2) {
        field5840++;
        class252 var3 = class150.method916(arg1, -78, 2);
        var3.method1502((byte) -103);
        var3.field3248 = arg0;
        if (arg2 < 28) {
            method2384(30, (byte) -45, true);
        }
    }
}
