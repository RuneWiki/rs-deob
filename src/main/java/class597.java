import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class597 {

    @OriginalMember(owner = "client!fe", name = "e", descriptor = "[F")
    public static float[] field8099 = new float[4];

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "Lifa;")
    public static class450 field8095 = new class450();

    @OriginalMember(owner = "client!fe", name = "i", descriptor = "J")
    public static long field8103 = -1L;

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "I")
    public static int field8096;

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "I")
    public static int field8097;

    @OriginalMember(owner = "client!fe", name = "d", descriptor = "I")
    public static int field8098;

    @OriginalMember(owner = "client!fe", name = "f", descriptor = "I")
    public static int field8100;

    @OriginalMember(owner = "client!fe", name = "h", descriptor = "[I")
    public static int[] field8102;

    @OriginalMember(owner = "client!fe", name = "g", descriptor = "[Ltf;")
    public static class312[] field8101;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(III)Z", line = 9)
    public static final boolean method3412(int arg0, int arg1, int arg2) {
        field8100++;
        return arg2 != -4;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(Lvk;IZ)V", line = 29)
    public static final void method3413(class388 arg0, int arg1, boolean arg2) {
        field8097++;
        if (arg1 >= -13 || class245.field2894 >= 400) {
            return;
        }
        class479 var3 = arg0.field5003;
        String var4 = arg0.field4998;
        if (var3.field6636 != null) {
            var3 = var3.method2843(class2.field30, 228);
            if (var3 == null) {
                return;
            }
            var4 = var3.field6647;
        }
        if (!var3.field6700) {
            return;
        }
        if (arg0.field4996 != 0) {
            String var5 = class672.field9229 == class421.field5604 ? class637.field8705.method3584(class770.field10592, true) : class637.field8703.method3584(class770.field10592, true);
            var4 = var4 + class665.method3734(arg0.field4996, (byte) 45, class300.field3596.field7347) + " (" + var5 + arg0.field4996 + ")";
        }
        if (class104.field1336 && !arg2) {
            class613 var6 = class348.field4348 == -1 ? null : class113.field1426.method4366(true, class348.field4348);
            if ((class667.field9161 & 0x2) != 0 && (var6 == null || var3.method2852(class348.field4348, var6.field8244, 255) != var6.field8244)) {
                class210.field2487++;
                class620.method3534((long) arg0.field3393, -1, false, class481.field6718 + " -> <col=ffff00>" + var4, class748.field10390, (long) arg0.field3393, false, 110, 0, 48, 0, class535.field7539, true);
            }
        }
        if (!arg2) {
            String[] var7 = var3.field6698;
            if (class224.field2615) {
                var7 = class437.method2577(var7, 5);
            }
            if (var7 != null) {
                for (int var8 = 4; var8 >= 0; var8--) {
                    if (var7[var8] != null && (var3.field6661 == 0 || !var7[var8].equalsIgnoreCase(class637.field8698.method3584(class770.field10592, true)))) {
                        byte var9 = 0;
                        if (var8 == 0) {
                            var9 = 18;
                        }
                        int var10 = class170.field2043;
                        if (var8 == 1) {
                            var9 = 10;
                        }
                        if (var8 == 2) {
                            var9 = 47;
                        }
                        if (var8 == 3) {
                            var9 = 53;
                        }
                        if (var3.field6662 == var8) {
                            var10 = var3.field6689;
                        }
                        if (var8 == 4) {
                            var9 = 59;
                        }
                        if (var3.field6674 == var8) {
                            var10 = var3.field6679;
                        }
                        class620.method3534((long) arg0.field3393, -1, false, "<col=ffff00>" + var4, var7[var8].equalsIgnoreCase(class637.field8698.method3584(class770.field10592, true)) ? var3.field6708 : var10, (long) arg0.field3393, false, 121, 0, var9, 0, var7[var8], true);
                        class18.field332++;
                    }
                }
            }
            if (var3.field6661 == 1 && var7 != null) {
                for (int var11 = 4; var11 >= 0; var11--) {
                    if (var7[var11] != null && var7[var11].equalsIgnoreCase(class637.field8698.method3584(class770.field10592, true))) {
                        short var12 = 0;
                        if (class300.field3596.field7347 < arg0.field4996) {
                            var12 = 2000;
                        }
                        short var13 = 0;
                        if (var11 == 0) {
                            var13 = 18;
                        }
                        if (var11 == 1) {
                            var13 = 10;
                        }
                        if (var11 == 2) {
                            var13 = 47;
                        }
                        if (var11 == 3) {
                            var13 = 53;
                        }
                        if (var11 == 4) {
                            var13 = 59;
                        }
                        if (var13 != 0) {
                            var13 += var12;
                        }
                        class620.method3534((long) arg0.field3393, -1, false, "<col=ffff00>" + var4, var3.field6708, (long) arg0.field3393, false, 113, 0, var13, 0, var7[var11], true);
                        class750.field10417++;
                    }
                }
            }
        }
        class2.field32++;
        class620.method3534((long) arg0.field3393, -1, false, "<col=ffff00>" + var4, class500.field7016, (long) arg0.field3393, arg2, 106, 0, 1010, 0, class637.field8697.method3584(class770.field10592, true), true);
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(I)V", line = 194)
    public static void method3414(int arg0) {
        field8099 = null;
        field8101 = null;
        field8102 = null;
        if (arg0 < -108) {
            field8095 = null;
        }
    }
}
