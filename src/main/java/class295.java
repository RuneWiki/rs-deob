import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class295 {

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "I")
    public static int field4720 = 0;

    @OriginalMember(owner = "client!gd", name = "h", descriptor = "Z")
    public static boolean field4725 = false;

    @OriginalMember(owner = "client!gd", name = "g", descriptor = "S")
    public static short field4724 = 1;

    @OriginalMember(owner = "client!gd", name = "e", descriptor = "Ljf;")
    public static class216 field4722 = new class216(50);

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "I")
    public static int field4719;

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "I")
    public static int field4721;

    @OriginalMember(owner = "client!gd", name = "f", descriptor = "I")
    public static int field4723;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "Lal;")
    public static class307 field4718;

    @OriginalMember(owner = "client!gd", name = "i", descriptor = "Lvl;")
    public static class73 field4726;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(I)V")
    public static void method1990(int arg0) {
        field4722 = null;
        field4718 = null;
        int var1 = -26 % ((arg0 + 35) / 42);
        field4726 = null;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IZ)V")
    public static final void method1991(int arg0, boolean arg1) {
        if (arg1) {
            field4720 = 10;
        }
        field4719++;
        class49.field626.method1514(arg0, (byte) -55);
        class58.field857.method1514(arg0, (byte) -55);
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(II[Lfe;ZZI)V")
    public static final void method1992(int arg0, int arg1, class231[] arg2, boolean arg3, boolean arg4, int arg5) {
        if (arg3) {
            field4724 = 39;
        }
        for (int var6 = 0; var6 < arg2.length; var6++) {
            class231 var7 = arg2[var6];
            if (var7 != null && var7.field3633 == arg1) {
                class179.method1271(31582, arg4, arg0, arg5, var7);
                class122.method793(arg5, arg0, !arg3, var7);
                if (var7.field3720 - var7.field3730 < var7.field3616) {
                    var7.field3616 = var7.field3720 - var7.field3730;
                }
                if (var7.field3616 < 0) {
                    var7.field3616 = 0;
                }
                if ((var7.field3648 - var7.field3686) < var7.field3661) {
                    var7.field3661 = var7.field3648 - var7.field3686;
                }
                if (var7.field3661 < 0) {
                    var7.field3661 = 0;
                }
                if (var7.field3620 == 0) {
                    class130.method831((byte) 47, var7, arg4);
                }
            }
        }
        field4721++;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IB)I")
    public static final int method1993(int arg0, byte arg1) {
        if (arg1 <= 86) {
            field4726 = null;
        }
        field4723++;
        return arg0 >> 11 & 0x7F;
    }
}
