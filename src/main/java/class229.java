import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public class class229 extends class99 {

    @OriginalMember(owner = "client!fi", name = "v", descriptor = "Z")
    public static boolean field3368 = true;

    @OriginalMember(owner = "client!fi", name = "y", descriptor = "I")
    public static int field3371 = 0;

    @OriginalMember(owner = "client!fi", name = "r", descriptor = "I")
    public static int field3364;

    @OriginalMember(owner = "client!fi", name = "s", descriptor = "I")
    public int field3365;

    @OriginalMember(owner = "client!fi", name = "t", descriptor = "I")
    public static int field3366;

    @OriginalMember(owner = "client!fi", name = "x", descriptor = "I")
    public static int field3370;

    @OriginalMember(owner = "client!fi", name = "z", descriptor = "I")
    public static int field3372;

    @OriginalMember(owner = "client!fi", name = "B", descriptor = "I")
    public static int field3373;

    @OriginalMember(owner = "client!fi", name = "C", descriptor = "I")
    public static int field3374;

    @OriginalMember(owner = "client!fi", name = "u", descriptor = "Ljava/lang/String;")
    public String field3367;

    @OriginalMember(owner = "client!fi", name = "w", descriptor = "Ljava/lang/String;")
    public String field3369;

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lmh;B)Z")
    public static final boolean method1592(class263 arg0, byte arg1) {
        ++field3364;
        if (~arg0.field4179 == -206) {
            class267.field4272 = 250;
            return true;
        } else {
            int var2 = 46 / ((-27 - arg1) / 56);
            return false;
        }
    }

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "(I)Lpb;")
    public final class277 method1593(int arg0) {
        if (arg0 <= 76) {
            method1594(-87, 61);
        }
        ++field3366;
        return class63.field952[super.field1693];
    }

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "(II)I")
    public static final int method1594(int arg0, int arg1) {
        if (arg1 > -27) {
            field3371 = 47;
        }
        ++field3372;
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(IIIIIIII)Z")
    public static final boolean method1595(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
            return false;
        } else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
            return false;
        } else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
            return false;
        } else if (arg0 > arg5 && arg0 > arg6 && arg0 > arg7) {
            return false;
        } else {
            int var8 = (arg1 - arg2) * (arg6 - arg5) - (arg0 - arg5) * (arg3 - arg2);
            int var9 = (arg1 - arg4) * (arg5 - arg7) - (arg0 - arg7) * (arg2 - arg4);
            int var10 = (arg1 - arg3) * (arg7 - arg6) - (arg0 - arg6) * (arg4 - arg3);
            return var8 * var10 > 0 && var9 * var10 > 0;
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(IIBII)V")
    public static final void method1596(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        class130.method982(arg1, arg3, arg1 + arg4, arg0 + arg3);
        class130.method996(arg1, arg3, arg4, arg0, 0);
        int var5 = -38 / ((37 - arg2) / 41);
        ++field3373;
        if (~class89.field1439 <= -101) {
            float var6 = (float) class46.field620 / (float) class46.field619;
            int var7 = arg4;
            int var8 = arg0;
            if (var6 < 1.0F) {
                var8 = (int) ((float) arg4 * var6);
            } else {
                var7 = (int) ((float) arg0 / var6);
            }
            int var9 = (-var8 + arg0) / 2 + arg3;
            int var10 = (-var7 + arg4) / 2 + arg1;
            if (class63.field964 == null || ~class63.field964.field1585 != ~arg4 || class63.field964.field1586 != arg0) {
                class148 var11 = new class148(arg4, arg0);
                class130.method992(var11.field2375, arg4, arg0);
                if (~class46.field628.field3547 != 0) {
                    class130.method996(0, 0, arg4, arg0, class46.field628.field3547);
                }
                class46.method275(0, 0, class46.field619, class46.field620, 0, 0, var7, var8);
                class46.method283();
                class63.field964 = var11;
                class112.field1865.method299(0);
            }
            class63.field964.method729(var10, var9);
            int var12 = class123.field2040 * var8 / class46.field620 + var9;
            int var13 = class162.field2514 * var7 / class46.field619 + var10;
            int var14 = class119.field1927 * var8 / class46.field620;
            int var15 = 16711680;
            int var16 = class123.field2036 * var7 / class46.field619;
            if (~class121.field1986 == -2) {
                var15 = 16777215;
            }
            class130.method1003(var13, var12, var16, var14, var15, 128);
            class130.method1006(var13, var12, var16, var14, var15);
            if (~class141.field2276 < -1) {
                int var17;
                if (class284.field4572 <= 50) {
                    var17 = class284.field4572 * 5;
                } else {
                    var17 = (-class284.field4572 + 100) * 5;
                }
                for (class159 var18 = (class159) class46.field625.method1450(false); var18 != null; var18 = (class159) class46.field625.method1448(false)) {
                    class66 var19 = class206.method1458(var18.field2466, 22464);
                    if (class69.method522(var19, (byte) -128)) {
                        if (class131.field2175 != var18.field2466) {
                            if (class59.field867 != -1 && class59.field867 == var19.field987) {
                                int var20 = var18.field2469 * var8 / class46.field620 + var9;
                                int var21 = var18.field2476 * var7 / class46.field619 + var10;
                                class130.method1003(var21 + -2, var20 + -2, 4, 4, 16776960, var17);
                            }
                        } else {
                            int var22 = var18.field2476 * var7 / class46.field619 + var10;
                            int var23 = var18.field2469 * var8 / class46.field620 + var9;
                            class130.method1003(var22 + -2, var23 + -2, 4, 4, 16776960, var17);
                        }
                    }
                }
            }
        }
    }
}
