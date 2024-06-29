import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!in")
public class class341 {

    @OriginalMember(owner = "client!in", name = "d", descriptor = "Liba;")
    public static class211 field5055 = new class211(27, 2);

    @OriginalMember(owner = "client!in", name = "e", descriptor = "Lvg;")
    public static class622 field5056 = new class622(35, -1);

    @OriginalMember(owner = "client!in", name = "a", descriptor = "I")
    public static int field5052;

    @OriginalMember(owner = "client!in", name = "b", descriptor = "I")
    public static int field5053;

    @OriginalMember(owner = "client!in", name = "c", descriptor = "I")
    public static int field5054;

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(Z)V", line = 3)
    public static void method2114(boolean arg0) {
        field5056 = null;
        field5055 = null;
        if (arg0) {
            field5055 = null;
        }
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(II)I", line = 14)
    public static final int method2115(int arg0, int arg1) {
        field5054++;
        int var2 = 0;
        if (arg1 < 0 || arg1 >= 65536) {
            arg1 >>>= 0x10;
            var2 += 16;
        }
        if (arg1 >= 256) {
            arg1 >>>= 0x8;
            var2 += 8;
        }
        if (arg1 >= 16) {
            arg1 >>>= 0x4;
            var2 += 4;
        }
        if (arg1 >= 4) {
            arg1 >>>= 0x2;
            var2 += 2;
        }
        if (arg0 != 27279) {
            field5056 = null;
        }
        if (arg1 >= 1) {
            var2++;
            arg1 >>>= 0x1;
        }
        return arg1 + var2;
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(Ljava/lang/String;I)J", line = 58)
    public static final long method2116(String arg0, int arg1) {
        field5053++;
        int var2 = arg0.length();
        long var3 = 0L;
        for (int var5 = arg1; var5 < var2; var5++) {
            var3 = (var3 << 5) + (long) arg0.charAt(var5) - var3;
        }
        return var3;
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(IJZLjava/lang/String;)V", line = 78)
    public static final void method2117(int arg0, long arg1, boolean arg2, String arg3) {
        field5052++;
        if (arg2) {
            class600.method3411((byte) 127);
            if (class204.field2784.equals("")) {
                class43.field622 = 39;
                return;
            }
        }
        class540 var5 = new class540(576);
        var5.method3110(10, arg0 ^ 0x57);
        var5.method3162(arg0 - 2003712697, (int) (Math.random() * 65535.0D));
        var5.method3144(arg0 ^ 0xFFFFFF9B, arg1);
        var5.method3162(-2003712696, arg2 ? class446.field6482 : class122.field1815);
        var5.method3132(arg3, 3);
        var5.method3144(-102, arg2 ? class175.field2456 : class224.field2970);
        if (arg2) {
            var5.method3144(-85, class583.method3343(-118, class204.field2784));
            try {
                var5.method3144(-57, Long.parseLong(class205.field2788));
            } catch (Exception var9) {
                class43.field622 = 39;
                return;
            }
        } else {
            var5.method3146((int) (Math.random() * 9.9999999E7D), 99);
            var5.method3146((int) (Math.random() * 9.9999999E7D), 91);
            var5.method3146((int) (Math.random() * 9.9999999E7D), -109);
            var5.method3146((int) (Math.random() * 9.9999999E7D), 109);
        }
        var5.method3146((int) (Math.random() * 9.9999999E7D), arg0 + 90);
        var5.method3131(class58.field948, 3, class351.field5187);
        class654 var6 = class149.method1067(120);
        var6.field9358.method3110(arg2 ? class196.field2688.field9823 : class196.field2685.field9823, 93);
        int var7 = arg0;
        if (class222.field2944 != null) {
            var7 = arg0 + class222.field2944.length() + 1;
        }
        var6.field9358.method3162(-2003712696, var7 + var5.field7956 + 28);
        var6.field9358.method3162(arg0 - 2003712697, 627);
        var6.field9358.method3110(class262.field3401, arg0 + 101);
        var6.field9358.method3110(class478.field6840.field5519, 92);
        class343.method2128((byte) -125, var6.field9358);
        String var8 = arg2 ? class581.field8454 : class222.field2944;
        var6.field9358.method3110(var8 == null ? 0 : 1, 60);
        if (var8 != null) {
            var6.field9358.method3132(var8, 3);
        }
        var6.field9358.method3149(0, var5.field7952, var5.field7956, -116);
        class444.method2623(115, var6);
        class43.field622 = -3;
        class622.field8997 = 0;
        class175.field2458 = 1;
        class399.field6018 = 0;
    }
}
