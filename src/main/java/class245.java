import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mm")
public class class245 {

    @OriginalMember(owner = "client!mm", name = "d", descriptor = "Ljava/lang/String;")
    public static String field3999 = "Allocated memory";

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "Z")
    public static boolean field3997 = false;

    @OriginalMember(owner = "client!mm", name = "f", descriptor = "Ljava/lang/String;")
    public static String field4001 = "You can't add yourself to your own ignore list.";

    @OriginalMember(owner = "client!mm", name = "h", descriptor = "I")
    public static int field4003 = 0;

    @OriginalMember(owner = "client!mm", name = "e", descriptor = "I")
    public static int field4000;

    @OriginalMember(owner = "client!mm", name = "g", descriptor = "I")
    public static int field4002;

    @OriginalMember(owner = "client!mm", name = "i", descriptor = "I")
    public static int field4004;

    @OriginalMember(owner = "client!mm", name = "c", descriptor = "Lvl;")
    public static class73 field3998;

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "[I")
    public static int[] field3996;

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(ZI)Lj;")
    public static final class270 method1746(boolean arg0, int arg1) {
        field4002++;
        if (!arg0) {
            method1747(-94);
        }
        class270 var2 = (class270) class281.field4581.method1517((long) arg1, (byte) -124);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class290.field4672.method501(-2, class179.method1270((byte) 90, arg1), class251.method1792((byte) -91, arg1));
        class270 var4 = new class270();
        if (var3 != null) {
            var4.method1880(new class170(var3), 0);
        }
        class281.field4581.method1518(var4, (long) arg1, (byte) 75);
        return var4;
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(I)V")
    public static void method1747(int arg0) {
        field3998 = null;
        if (arg0 == 612008480) {
            field4001 = null;
            field3996 = null;
            field3999 = null;
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1748(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4000++;
        if (arg1 < 128 || arg6 < 128 || arg1 > 13056 || arg6 > 13056) {
            class99.field1470 = -1;
            class80.field1212 = -1;
            return;
        }
        int var8 = class52.method351(-95, arg6, arg1, class148.field2204) - arg7;
        int var9 = class221.field3468[class147.field2189];
        int var10 = arg1 - class99.field1474;
        int var11 = arg6 - class255.field4159;
        int var12 = var8 - class21.field279;
        int var13 = class221.field3465[class147.field2189];
        int var14 = class221.field3468[class56.field817];
        int var15 = class221.field3465[class56.field817];
        int var16 = var10 * var15 + var11 * var14 >> 16;
        int var17 = var11 * var15 - (var10 * var14) >> 16;
        int var19 = var12 * var13 - var9 * var17 >> 16;
        int var20 = var9 * var12 + var13 * var17 >> 16;
        if (var20 >= 50) {
            class99.field1470 = (var16 << 9) / var20 + arg4;
            class80.field1212 = (var19 << 9) / var20 + arg3;
        } else {
            class80.field1212 = -1;
            class99.field1470 = -1;
        }
        int var22 = -104 % ((arg0 + 19) / 37);
    }
}
