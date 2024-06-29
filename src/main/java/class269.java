import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public class class269 {

    @OriginalMember(owner = "client!wj", name = "f", descriptor = "I")
    public static int field3926 = 0;

    @OriginalMember(owner = "client!wj", name = "g", descriptor = "I")
    public static int field3927 = 0;

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "I")
    public static int field3921;

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "I")
    public static int field3922;

    @OriginalMember(owner = "client!wj", name = "c", descriptor = "I")
    public static int field3923;

    @OriginalMember(owner = "client!wj", name = "d", descriptor = "I")
    public static int field3924;

    @OriginalMember(owner = "client!wj", name = "e", descriptor = "I")
    public static int field3925;

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(IILjava/lang/String;)V", line = 6)
    public static final void method1775(int arg0, int arg1, String arg2) {
        if (arg0 == 20282) {
            field3923++;
            class338 var3 = class230.method1580(3, arg0 ^ 0xB0988E72, arg1);
            var3.method2053(-124);
            var3.field4757 = arg2;
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(IIILwo;Lwo;)V", line = 25)
    public static final void method1776(int arg0, int arg1, int arg2, class522 arg3, class522 arg4) {
        class518 var5 = class110.method674(arg0, arg1, arg2);
        if (var5 != null) {
            var5.field7551 = arg3;
            var5.field7552 = arg4;
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(IBLvg;)Ljava/lang/String;", line = 34)
    public static final String method1777(int arg0, byte arg1, class38 arg2) {
        field3924++;
        if (arg1 != -71) {
            method1779(79, 79);
        }
        if (!client.method1328(arg2).method2359(arg0, (byte) -10) && arg2.field504 == null) {
            return null;
        } else if (arg2.field442 == null || arg0 >= arg2.field442.length || arg2.field442[arg0] == null || arg2.field442[arg0].trim().length() == 0) {
            return class187.field2783 ? "Hidden-" + arg0 : null;
        } else {
            return arg2.field442[arg0];
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(IIIIIIZI)V", line = 64)
    public static final void method1778(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7) {
        field3921++;
        if (!arg6) {
            field3926 = -16;
        }
        if (arg0 == arg4) {
            class390.method2373(arg5, arg1, (byte) -118, arg3, arg0, arg2, arg7);
        } else if (class494.field7297 <= arg1 - arg0 && class445.field6629 >= arg0 + arg1 && (arg5 - arg4) >= class37.field393 && (arg4 + arg5) <= class509.field7436) {
            class295.method1871(arg1, arg7, arg0, arg5, arg3, arg2, arg4, -3);
        } else {
            class380.method2325((byte) 124, arg5, arg4, arg3, arg0, arg2, arg7, arg1);
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(II)I", line = 89)
    public static final int method1779(int arg0, int arg1) {
        field3925++;
        if (arg0 != -1760333912) {
            field3922 = -94;
        }
        return arg1 >>> 8;
    }
}
