import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public class class191 {

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "S")
    public static short field3075 = 256;

    @OriginalMember(owner = "client!pi", name = "c", descriptor = "Ljava/lang/String;")
    public static String field3077 = "Select";

    @OriginalMember(owner = "client!pi", name = "d", descriptor = "S")
    public static short field3078 = 1;

    @OriginalMember(owner = "client!pi", name = "j", descriptor = "[Ljava/lang/String;")
    public static String[] field3084 = new String[500];

    @OriginalMember(owner = "client!pi", name = "f", descriptor = "I")
    public static int field3080;

    @OriginalMember(owner = "client!pi", name = "g", descriptor = "I")
    public static int field3081;

    @OriginalMember(owner = "client!pi", name = "i", descriptor = "I")
    public int field3083;

    @OriginalMember(owner = "client!pi", name = "k", descriptor = "I")
    public static int field3085;

    @OriginalMember(owner = "client!pi", name = "e", descriptor = "Leh;")
    public static class137 field3079;

    @OriginalMember(owner = "client!pi", name = "h", descriptor = "Lpg;")
    public static class290 field3082;

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "Ljava/lang/String;")
    public String field3076;

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1323(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg4 != 256) {
            field3078 = 80;
        }
        field3080++;
        int var7 = class256.method1750(79, arg1, class117.field1656, class132.field2105);
        int var8 = class256.method1750(43, arg2, class117.field1656, class132.field2105);
        int var9 = class256.method1750(121, arg5, class116.field1653, class114.field1634);
        int var10 = class256.method1750(124, arg6, class116.field1653, class114.field1634);
        int var11 = class256.method1750(104, arg1 + arg3, class117.field1656, class132.field2105);
        int var12 = class256.method1750(113, arg2 - arg3, class117.field1656, class132.field2105);
        for (int var13 = var7; var13 < var11; var13++) {
            class78.method433(var10, var9, class14.field186[var13], arg0, (byte) 123);
        }
        for (int var14 = var8; var14 > var12; var14--) {
            class78.method433(var10, var9, class14.field186[var14], arg0, (byte) 123);
        }
        int var15 = class256.method1750(arg4 - 182, arg3 + arg5, class116.field1653, class114.field1634);
        int var16 = class256.method1750(39, arg6 - arg3, class116.field1653, class114.field1634);
        for (int var17 = var11; var17 <= var12; var17++) {
            int[] var18 = class14.field186[var17];
            class78.method433(var15, var9, var18, arg0, (byte) 123);
            class78.method433(var10, var16, var18, arg0, (byte) 123);
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(B)V")
    public static void method1324(byte arg0) {
        field3082 = null;
        field3077 = null;
        field3084 = null;
        int var1 = -119 % ((arg0 + 9) / 35);
        field3079 = null;
    }
}
