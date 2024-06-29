import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!so")
public class class177 {

    @OriginalMember(owner = "client!so", name = "d", descriptor = "[I")
    public static int[] field2682 = new int[50];

    @OriginalMember(owner = "client!so", name = "i", descriptor = "I")
    public static int field2687 = 0;

    @OriginalMember(owner = "client!so", name = "a", descriptor = "Ljg;")
    public static class241 field2679 = new class241(64);

    @OriginalMember(owner = "client!so", name = "j", descriptor = "[I")
    public static int[] field2688 = new int[50];

    @OriginalMember(owner = "client!so", name = "b", descriptor = "I")
    public static int field2680;

    @OriginalMember(owner = "client!so", name = "c", descriptor = "I")
    public static int field2681;

    @OriginalMember(owner = "client!so", name = "e", descriptor = "I")
    public static int field2683;

    @OriginalMember(owner = "client!so", name = "g", descriptor = "I")
    public static int field2685;

    @OriginalMember(owner = "client!so", name = "h", descriptor = "I")
    public static int field2686;

    @OriginalMember(owner = "client!so", name = "f", descriptor = "Ltb;")
    public static class290 field2684;

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(BLiq;)V")
    public static final void method1079(byte arg0, class134 arg1) {
        int var2 = 55 % ((33 - arg0) / 48);
        class465.field6841 = arg1;
        field2686++;
        class21.field286 = class465.field6841.method812(19, (byte) -41);
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(Lqn;III[Z)Z")
    public static final boolean method1080(class380 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
        boolean var5 = false;
        if (class307.field4638 != class154.field2118) {
            int var6 = class85.field1201[arg1].method100(arg2, arg3);
            for (int var7 = 0; var7 <= arg1; var7++) {
                class143 var8 = class85.field1201[var7];
                if (var8 != null) {
                    int var9 = var6 - var8.method100(arg2, arg3);
                    if (arg4 != null) {
                        arg4[var7] = var8.method99(arg0, arg2, var9, arg3, 0, false);
                        if (!arg4[var7]) {
                            continue;
                        }
                    }
                    var8.method94(arg0, arg2, var9, arg3, 0, false);
                    var5 = true;
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(I)V")
    public static void method1081(int arg0) {
        field2682 = null;
        field2688 = null;
        field2679 = null;
        field2684 = null;
        if (arg0 != 0) {
            method1081(37);
        }
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(Lpf;I)V")
    public static final void method1082(class425 arg0, int arg1) {
        class189.field2840.method716(arg0.method2618((byte) -31), arg1 + 102);
        field2683++;
        if (arg1 != 0) {
            method1080((class380) null, 92, -105, 43, (boolean[]) null);
        }
    }
}
