import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public class class457 implements class733 {

    @OriginalMember(owner = "client!sj", name = "c", descriptor = "Lge;")
    private class706 field6599;

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "Lpb;")
    private class652 field6598;

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "Lqaa;")
    public static class27 field6597 = new class27(37, 12);

    @OriginalMember(owner = "client!sj", name = "d", descriptor = "I")
    public static int field6600;

    @OriginalMember(owner = "client!sj", name = "e", descriptor = "I")
    public static int field6601;

    @OriginalMember(owner = "client!sj", name = "f", descriptor = "I")
    public static int field6602;

    @OriginalMember(owner = "client!sj", name = "g", descriptor = "I")
    public static int field6603;

    @OriginalMember(owner = "client!sj", name = "h", descriptor = "I")
    public static int field6604;

    @OriginalMember(owner = "client!sj", name = "i", descriptor = "I")
    public static int field6605;

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "(B)V", line = 3)
    public static void method2789(byte arg0) {
        if (arg0 >= -20) {
            field6603 = 61;
        }
        field6597 = null;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(ZI)V", line = 20)
    public final void method1172(boolean arg0, int arg1) {
        field6601++;
        class134 var3 = this.field6598.method3682(this.field6599.field9881, 3);
        if (var3 != null) {
            int var4 = this.field6599.field9891.method2152(class57.field1064, this.field6599.field9882, -126) + this.field6599.field9878;
            int var5 = this.field6599.field9889.method3892(this.field6599.field9886, class477.field6814, 4) + this.field6599.field9892;
            if (this.field6599.field9879) {
                class359.field5046.method616(var4, var5, this.field6599.field9882, this.field6599.field9886, this.field6599.field9883, 0);
            }
            int var6 = var5 + this.method2790(var3.field2100, var5, class537.field7568, 5, var4, 116) * 12;
            int var10 = var6 + 8;
            if (this.field6599.field9879) {
                class359.field5046.method553(var4, var10, var4 + this.field6599.field9882 - 1, var10, this.field6599.field9883, 0);
            }
            var6 = var10 + 1;
            int var7 = var6 + this.method2790(var3.field2104, var6, class537.field7568, 5, var4, 83) * 12;
            int var11 = var7 + 5;
            int var10000 = var11 + this.method2790(var3.field2099, var11, class537.field7568, 5, var4, 107) * 12;
        }
        int var9 = 64 / (-arg1 / 39);
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(Ljava/lang/String;ILda;III)I", line = 54)
    private final int method2790(String arg0, int arg1, class59 arg2, int arg3, int arg4, int arg5) {
        if (arg5 <= 80) {
            this.method1172(true, -27);
        }
        field6600++;
        return arg2.method648(0, 0, arg3 + arg4, null, arg1 + arg3, -(arg3 * 2) + this.field6599.field9886, null, 12673, this.field6599.field9895, this.field6599.field9882 - (arg3 * 2), this.field6599.field9887, arg0, 0, 0, 0, null);
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(II)V", line = 65)
    public static final void method2791(int arg0, int arg1) {
        field6605++;
        class354 var2 = class501.method3012(arg0, 6, 2145997216);
        if (arg1 != 8705) {
            method2789((byte) 53);
        }
        var2.method2216(0);
    }

    @OriginalMember(owner = "client!sj", name = "<init>", descriptor = "(Lpb;Lge;)V", line = 78)
    public class457(class652 arg0, class706 arg1) {
        this.field6599 = arg1;
        this.field6598 = arg0;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(I)V", line = 89)
    public final void method1173(int arg0) {
        field6604++;
        if (arg0 >= -105) {
            this.method1172(false, -72);
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(B)Z", line = 99)
    public final boolean method1176(byte arg0) {
        if (arg0 < 124) {
            field6597 = null;
        }
        field6602++;
        return this.field6598.method3684(-2);
    }
}
