import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public class class202 {

    @OriginalMember(owner = "client!bj", name = "e", descriptor = "Ljava/lang/String;")
    public static String field2860 = "glow3:";

    @OriginalMember(owner = "client!bj", name = "g", descriptor = "Lbh;")
    public static class234 field2862 = new class234();

    @OriginalMember(owner = "client!bj", name = "l", descriptor = "Ljava/lang/String;")
    public static String field2867 = "K";

    @OriginalMember(owner = "client!bj", name = "k", descriptor = "I")
    public static int field2866 = -1;

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "I")
    public static int field2856;

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "I")
    public static int field2857;

    @OriginalMember(owner = "client!bj", name = "d", descriptor = "I")
    public static int field2859;

    @OriginalMember(owner = "client!bj", name = "f", descriptor = "I")
    public static int field2861;

    @OriginalMember(owner = "client!bj", name = "i", descriptor = "I")
    public static int field2864;

    @OriginalMember(owner = "client!bj", name = "m", descriptor = "I")
    public static int field2868;

    @OriginalMember(owner = "client!bj", name = "h", descriptor = "Lwe;")
    public static class82 field2863;

    @OriginalMember(owner = "client!bj", name = "c", descriptor = "Ljava/awt/Frame;")
    public static Frame field2858;

    @OriginalMember(owner = "client!bj", name = "j", descriptor = "[Ljava/lang/String;")
    public static String[] field2865;

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(IZIIIIII)V")
    public static final void method1296(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2864++;
        if (class238.method1549((byte) -117, arg4)) {
            client.method1922(class123.field1767[arg4], -1, arg6, arg3, arg5, arg2, arg0, arg7);
            if (!arg1) {
                field2862 = null;
            }
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(B)V")
    public static void method1297(byte arg0) {
        field2865 = null;
        field2860 = null;
        field2867 = null;
        if (arg0 != -106) {
            field2863 = null;
        }
        field2863 = null;
        field2858 = null;
        field2862 = null;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(I)V")
    public static final void method1298(int arg0) {
        class54.field623.method67((byte) -117);
        field2859++;
        if (arg0 <= 10) {
            field2866 = 126;
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1299(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2861++;
        class82 var7 = class112.method694(arg4, false, arg1);
        if (var7 != null && var7.field1100 != null) {
            class11 var8 = new class11();
            var8.field143 = var7.field1100;
            var8.field145 = var7;
            class110.method684(var8, false);
        }
        class241.field3500 = arg6;
        class268.field3916 = arg2;
        class276.field4192 = arg4;
        class287.field4469 = arg1;
        class227.field3201 = arg5;
        class282.field4263 = arg3;
        class267.field3857 = true;
        if (arg0 < 99) {
            field2860 = null;
        }
        class255.method1632(16711680, var7);
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(IIII)V")
    public static final void method1300(int arg0, int arg1, int arg2, int arg3) {
        class222.method1444((byte) -124, false);
        class103.field1400 = arg1;
        class159.field2309 = arg3;
        class198.method1275(true, arg0);
        field2856++;
        if (arg2 != 7816) {
            field2862 = null;
        }
    }
}
