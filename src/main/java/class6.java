import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public class class6 {

    @OriginalMember(owner = "client!wj", name = "f", descriptor = "[I")
    public static int[] field75 = new int[500];

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "Ljava/lang/String;")
    public static String field70 = "red:";

    @OriginalMember(owner = "client!wj", name = "i", descriptor = "Ljava/lang/String;")
    public static String field78 = "shake:";

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "I")
    public static int field71;

    @OriginalMember(owner = "client!wj", name = "c", descriptor = "I")
    public static int field72;

    @OriginalMember(owner = "client!wj", name = "d", descriptor = "I")
    public static int field73;

    @OriginalMember(owner = "client!wj", name = "g", descriptor = "I")
    public static int field76;

    @OriginalMember(owner = "client!wj", name = "h", descriptor = "I")
    public static int field77;

    @OriginalMember(owner = "client!wj", name = "e", descriptor = "Lqh;")
    public static class201 field74;

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(IZ)V")
    public static final void method46(int arg0, boolean arg1) {
        class254.method1730(-66);
        field76++;
        if (class273.field4336 != 30 && class273.field4336 != 25) {
            return;
        }
        class152.field2461++;
        if (class152.field2461 < 50 && !arg1) {
            return;
        }
        class152.field2461 = 0;
        if (!class109.field1800 && class5.field69 != null) {
            class125.field2018++;
            class68.field1113.method534((byte) -126, 213);
            try {
                class5.field69.method2(0, class68.field1113.field3653, -106, class68.field1113.field3655);
                class68.field1113.field3655 = 0;
            } catch (IOException var2) {
                class109.field1800 = true;
            }
        }
        class254.method1730(-123);
        if (arg0 > -81) {
            field74 = null;
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(I)V")
    public static final void method47(int arg0) {
        int var1 = -122 / ((arg0 + 50) / 41);
        if (class28.field448 < 0) {
            class129.field2090 = -1;
            class28.field448 = 0;
            class182.field2866 = -1;
        }
        field72++;
        if (class28.field448 > class1.field17) {
            class182.field2866 = -1;
            class129.field2090 = -1;
            class28.field448 = class1.field17;
        }
        if (class126.field2046 < 0) {
            class129.field2090 = -1;
            class182.field2866 = -1;
            class126.field2046 = 0;
        }
        if (class126.field2046 > class210.field3428) {
            class126.field2046 = class210.field3428;
            class182.field2866 = -1;
            class129.field2090 = -1;
        }
    }

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "(I)V")
    public static void method48(int arg0) {
        field75 = null;
        int var1 = 104 / ((29 - arg0) / 40);
        field70 = null;
        field78 = null;
        field74 = null;
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(IIIIIZI)V")
    public static final void method49(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        field73++;
        if (!arg5) {
            return;
        }
        int var7 = 0;
        class60[] var8 = class156.field2539;
        while (var8.length > var7) {
            class60 var9 = var8[var7];
            if (var9 != null && var9.field981 == 2) {
                class245.method1685(arg4 >> 1, (byte) 124, arg3 >> 1, arg2, arg0, (var9.field987 - class214.field3501 << 7) + var9.field986, var9.field983 * 2, (var9.field996 - class50.field884 << 7) + var9.field989);
                if (class133.field2124 > -1 && (class222.field3682 % 20) < 10) {
                    class278.field4377[var9.field988].method332(class133.field2124 + arg1 - 12, class233.field3814 + arg6 - 28);
                }
            }
            var7++;
        }
    }
}
