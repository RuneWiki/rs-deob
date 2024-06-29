import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vo")
public class class311 {

    @OriginalMember(owner = "client!vo", name = "d", descriptor = "I")
    public static int field5064 = 99;

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "Ljava/lang/String;")
    public static String field5061 = "scroll:";

    @OriginalMember(owner = "client!vo", name = "b", descriptor = "S")
    public static short field5062 = 1;

    @OriginalMember(owner = "client!vo", name = "k", descriptor = "C")
    public static char field5071;

    @OriginalMember(owner = "client!vo", name = "c", descriptor = "I")
    public static int field5063;

    @OriginalMember(owner = "client!vo", name = "e", descriptor = "I")
    public static int field5065;

    @OriginalMember(owner = "client!vo", name = "h", descriptor = "I")
    public static int field5068;

    @OriginalMember(owner = "client!vo", name = "i", descriptor = "I")
    public static int field5069;

    @OriginalMember(owner = "client!vo", name = "j", descriptor = "I")
    public static int field5070;

    @OriginalMember(owner = "client!vo", name = "l", descriptor = "I")
    public static int field5072;

    @OriginalMember(owner = "client!vo", name = "g", descriptor = "Ldk;")
    public static class237 field5067;

    @OriginalMember(owner = "client!vo", name = "f", descriptor = "[[I")
    public static int[][] field5066;

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(II)V", line = 6)
    public static final void method2260(int arg0, int arg1) {
        field5070++;
        if (class334.field5326 == arg0) {
            return;
        }
        if (class334.field5326 == 0) {
            class159.method1145(19492);
        }
        if (arg0 == 40) {
            class323.method2324((byte) -118);
        }
        if (arg0 != 40 && field5067 != null) {
            field5067.method1646((byte) 76);
            field5067 = null;
        }
        boolean var2 = arg0 == 5 || arg0 == 10 || arg0 == 28;
        if (arg0 == 25 || arg0 == 28) {
            class151.field2584 = 0;
            class34.field762 = 1;
            class52.field1044 = 0;
            class158.field2679 = 1;
            class207.field3461 = 0;
            class189.method1309(-1, true);
        }
        if (arg1 != -19880) {
            field5066 = (int[][]) ((int[][]) null);
        }
        if (arg0 == 25 || arg0 == 10) {
            class46.method379(95);
        }
        if (arg0 == 5) {
            class44.method371(true, class99.field1828);
        } else {
            class8.method96(arg1 ^ 0xFFFFB278);
        }
        boolean var3 = class334.field5326 == 5 || class334.field5326 == 10 || class334.field5326 == 28;
        if (var3 != var2) {
            if (var2) {
                class131.field2259 = class334.field5327;
                if (class52.field1045 == 0) {
                    class10.method102(-1, 2);
                } else {
                    class275.method1955(0, class334.field5327, 2, false, 255, 1, class112.field2043);
                }
                class90.field1608.method2484(arg1 ^ 0xFFFFB25A, false);
            } else {
                class10.method102(-1, 2);
                class90.field1608.method2484(arg1 ^ 0xFFFFB25A, true);
            }
        }
        if (class241.field4016 && (arg0 == 25 || arg0 == 28 || arg0 == 40)) {
            class241.method1691();
        }
        class334.field5326 = arg0;
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(B)V", line = 105)
    public static final void method2261(byte arg0) {
        if (arg0 < 7) {
            method2261((byte) 15);
        }
        class255.field4175.method889((byte) 63);
        field5065++;
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(I)Lig;", line = 121)
    public static final class199 method2262(int arg0) {
        field5072++;
        if (arg0 != 28) {
            return (class199) null;
        }
        class199 var1 = (class199) class197.field3288.method1580((byte) -119);
        if (var1 != null) {
            var1.method535(arg0 - 2829);
            var1.method2152((byte) 127);
            return var1;
        }
        class199 var2;
        do {
            var2 = (class199) class54.field1072.method1580((byte) -128);
            if (var2 == null) {
                return null;
            }
            if (var2.method1365(false) > class218.method1520((byte) 46)) {
                return null;
            }
            var2.method535(arg0 - 2829);
            var2.method2152((byte) 39);
        } while ((var2.field4902 & Long.MIN_VALUE) == 0L);
        return var2;
    }

    @OriginalMember(owner = "client!vo", name = "b", descriptor = "(B)V", line = 162)
    public static void method2263(byte arg0) {
        field5061 = null;
        int var1 = -51 % ((45 - arg0) / 58);
        field5067 = null;
        field5066 = (int[][]) null;
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(IB)I", line = 179)
    public static final int method2264(int arg0, byte arg1) {
        field5068++;
        int var7 = arg0 - 1;
        int var2 = var7 | var7 >>> 1;
        int var3 = var2 | var2 >>> 2;
        int var4 = var3 | var3 >>> 4;
        if (arg1 >= -50) {
            method2263((byte) -93);
        }
        int var5 = var4 | var4 >>> 8;
        int var6 = var5 | var5 >>> 16;
        return var6 + 1;
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(IBIIIII)V", line = 201)
    public static final void method2265(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field5063++;
        int var7 = class114.method842(class87.field1520, (byte) -104, arg2, class177.field2930);
        int var8 = class114.method842(class87.field1520, (byte) -78, arg0, class177.field2930);
        int var9 = class114.method842(class190.field3224, (byte) -87, arg5, class289.field4704);
        if (arg1 > -11) {
            method2264(-60, (byte) -13);
        }
        int var10 = class114.method842(class190.field3224, (byte) -118, arg6, class289.field4704);
        int var11 = class114.method842(class87.field1520, (byte) -97, arg2 + arg3, class177.field2930);
        int var12 = class114.method842(class87.field1520, (byte) -87, arg0 - arg3, class177.field2930);
        for (int var13 = var7; var13 < var11; var13++) {
            class344.method2417(class232.field3799[var13], var9, var10, arg4, (byte) -127);
        }
        for (int var14 = var8; var14 > var12; var14--) {
            class344.method2417(class232.field3799[var14], var9, var10, arg4, (byte) -124);
        }
        int var15 = class114.method842(class190.field3224, (byte) -63, arg5 + arg3, class289.field4704);
        int var16 = class114.method842(class190.field3224, (byte) -123, arg6 - arg3, class289.field4704);
        for (int var17 = var11; var17 <= var12; var17++) {
            int[] var18 = class232.field3799[var17];
            class344.method2417(var18, var9, var15, arg4, (byte) -127);
            class344.method2417(var18, var16, var10, arg4, (byte) -118);
        }
    }
}
