import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wk")
public class class143 {

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "[I")
    public static int[] field1867 = new int[32];

    @OriginalMember(owner = "client!wk", name = "d", descriptor = "[Ljava/lang/String;")
    public static String[] field1869 = new String[8];

    @OriginalMember(owner = "client!wk", name = "g", descriptor = "I")
    public static int field1872 = 4;

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "I")
    public static int field1866;

    @OriginalMember(owner = "client!wk", name = "c", descriptor = "I")
    public static int field1868;

    @OriginalMember(owner = "client!wk", name = "e", descriptor = "I")
    public static int field1870;

    @OriginalMember(owner = "client!wk", name = "f", descriptor = "I")
    public static int field1871;

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(ILha;II)V", line = 5)
    public static final void method989(int arg0, class60 arg1, int arg2, int arg3) {
        class729.field10214 = arg1;
        class183.field2805 = new class511[arg2][arg3];
        if (arg0 != -4658) {
            method992(false);
        }
        field1868++;
        if (class559.field7998 != null) {
            class396.field5947 = class336.method2128(class559.field7998[4], class559.field7998[3], class559.field7998[5], class559.field7998[1], (byte) 30, class559.field7998[0], class559.field7998[2]);
        }
        class31.field324 = new class511();
        class572.method3312((byte) -125);
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(III)Z", line = 23)
    public static final boolean method990(int arg0, int arg1, int arg2) {
        field1871++;
        if (arg2 == 0) {
            return class399.method2535(500, arg1, arg0) | (arg0 & 0x60000) != 0 || class96.method749(true, arg0, arg1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(IIBIIIII)V", line = 34)
    public static final void method991(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1866++;
        class19 var8 = null;
        if (arg2 != 66) {
            method992(true);
        }
        for (class19 var9 = (class19) class153.field2445.method1195(arg2 ^ 0x42); var9 != null; var9 = (class19) class153.field2445.method1201(2)) {
            if (var9.field209 == arg0 && var9.field208 == arg7 && var9.field211 == arg5 && var9.field212 == arg1) {
                var8 = var9;
                break;
            }
        }
        if (var8 == null) {
            var8 = new class19();
            var8.field212 = arg1;
            var8.field211 = arg5;
            var8.field209 = arg0;
            var8.field208 = arg7;
            if (arg7 >= 0 && arg5 >= 0 && class194.field2946 > arg7 && class255.field3656 > arg5) {
                class422.method2649(var8, (byte) 122);
            }
            class153.field2445.method1203(var8, (byte) -55);
        }
        var8.field214 = arg3;
        var8.field213 = true;
        var8.field219 = arg6;
        var8.field205 = false;
        var8.field215 = arg4;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(Z)V", line = 86)
    public static void method992(boolean arg0) {
        if (!arg0) {
            field1867 = null;
        }
        field1869 = null;
        field1867 = null;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(IIIIIZII)V", line = 97)
    public static final void method993(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        field1870++;
        if (arg4 != -14007) {
            field1869 = null;
        }
        if ((arg5 ? class63.field916.field10210.method2268(arg4 ^ 0xFFFF8D16) : class63.field916.field10189.method2268(17503)) != 0 && arg7 != 0 && class107.field1497 < 50 && arg3 != -1) {
            class282.field4007[class107.field1497++] = new class247((byte) (arg5 ? 3 : 2), arg3, arg7, arg0, arg6, arg1, arg2, null);
        }
    }
}
