import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fga")
public class class340 extends class567 {

    @OriginalMember(owner = "client!fga", name = "t", descriptor = "I")
    public int field4726;

    @OriginalMember(owner = "client!fga", name = "r", descriptor = "I")
    public int field4724;

    @OriginalMember(owner = "client!fga", name = "s", descriptor = "[Lvb;")
    public static class359[] field4725 = new class359[2048];

    @OriginalMember(owner = "client!fga", name = "o", descriptor = "[I")
    public static int[] field4721 = new int[4096];

    @OriginalMember(owner = "client!fga", name = "u", descriptor = "Lvh;")
    public static class125 field4727 = new class125(48, 2);

    @OriginalMember(owner = "client!fga", name = "v", descriptor = "Leda;")
    public static class116 field4728 = new class116(36, 3);

    @OriginalMember(owner = "client!fga", name = "m", descriptor = "I")
    public static int field4719;

    @OriginalMember(owner = "client!fga", name = "n", descriptor = "I")
    public static int field4720;

    @OriginalMember(owner = "client!fga", name = "p", descriptor = "I")
    public static int field4722;

    @OriginalMember(owner = "client!fga", name = "q", descriptor = "[Li;")
    public static class682[] field4723;

    @OriginalMember(owner = "client!fga", name = "a", descriptor = "(I)Lkq;")
    public final class696 method726(int arg0) {
        field4720++;
        if (arg0 != -17) {
            field4721 = null;
        }
        return class583.field8543;
    }

    @OriginalMember(owner = "client!fga", name = "a", descriptor = "(B)V")
    public static void method2044(byte arg0) {
        field4727 = null;
        field4721 = null;
        if (arg0 <= -94) {
            field4728 = null;
            field4725 = null;
            field4723 = null;
        }
    }

    @OriginalMember(owner = "client!fga", name = "<init>", descriptor = "(Lvn;Lmf;IIIIIIIIII)V")
    public class340(class186 arg0, class409 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        this.field4726 = arg10;
        this.field4724 = arg11;
    }

    @OriginalMember(owner = "client!fga", name = "a", descriptor = "(ZZI)I")
    public static final int method2045(boolean arg0, boolean arg1, int arg2) {
        field4722++;
        if (arg0) {
            return 0;
        }
        class569 var3 = class198.method1392(arg2, arg0, Integer.MIN_VALUE);
        if (var3 == null) {
            return class63.field914.method3409((byte) 52, arg2).field4918;
        }
        int var4 = 0;
        for (int var5 = 0; var5 < var3.field8318.length; var5++) {
            if (var3.field8318[var5] == -1) {
                var4++;
            }
        }
        if (!arg1) {
            field4728 = null;
        }
        return var4 + (class63.field914.method3409((byte) 52, arg2).field4918 - var3.field8318.length);
    }

    @OriginalMember(owner = "client!fga", name = "c", descriptor = "(I)V")
    public static final void method2046(int arg0) {
        field4719++;
        class144.field2476++;
        class699 var1 = class452.method2630(class699.field9897, class97.field1449, (byte) 121);
        if (arg0 != -27305) {
            field4727 = null;
        }
        var1.field9908.method2739((byte) -86, class189.field2958);
        class149.method1134(var1, true);
    }
}
