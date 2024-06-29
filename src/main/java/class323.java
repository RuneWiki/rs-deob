import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ip")
public class class323 {

    @OriginalMember(owner = "client!ip", name = "c", descriptor = "[I")
    public static int[] field3998 = new int[1000];

    @OriginalMember(owner = "client!ip", name = "b", descriptor = "I")
    public static int field3997;

    @OriginalMember(owner = "client!ip", name = "d", descriptor = "I")
    public static int field3999;

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "[[[B")
    public static byte[][][] field3996;

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(ILft;Z)V")
    public static final void method1874(int arg0, class727 arg1, boolean arg2) {
        field3997++;
        if (class628.field7982 >= 400) {
            return;
        }
        class240 var3 = arg1.field9545;
        if (arg0 != 25) {
            method1874(103, null, false);
        }
        String var4 = arg1.field9551;
        if (var3.field3289 != null) {
            var3 = var3.method1585((byte) -100, class381.field4705);
            if (var3 == null) {
                return;
            }
            var4 = var3.field3274;
        }
        if (!var3.field3291) {
            return;
        }
        if (arg1.field9555 != 0) {
            String var5 = class201.field2799 == class186.field2600 ? class659.field8574.method3589(class496.field6338, -22395) : class659.field8572.method3589(class496.field6338, -22395);
            var4 = var4 + class510.method2815(arg1.field9555, false, class422.field5564.field356) + " (" + var5 + arg1.field9555 + ")";
        }
        if (class47.field549 && !arg2) {
            class558 var6 = class4.field55 == -1 ? null : class761.field10377.method4101(class4.field55, 11);
            if ((class610.field7710 & 0x2) != 0 && (var6 == null || var3.method1588(var6.field7096, class4.field55, false) != var6.field7096)) {
                class259.method1655(class726.field9525, false, -1, class559.field7106, 6070, false, (long) arg1.field4737, 0, 44, (long) arg1.field4737, 0, class130.field1732 + " -> <col=ffff00>" + var4, true);
                class4.field23++;
            }
        }
        if (!arg2) {
            String[] var7 = var3.field3288;
            if (class214.field2929) {
                var7 = class523.method2881(99, var7);
            }
            if (var7 != null) {
                for (int var8 = 4; var8 >= 0; var8--) {
                    if (var7[var8] != null && (var3.field3281 == 0 || !var7[var8].equalsIgnoreCase(class659.field8567.method3589(class496.field6338, -22395)))) {
                        byte var9 = 0;
                        int var10 = class299.field3794;
                        if (var8 == 0) {
                            var9 = 6;
                        }
                        if (var8 == 1) {
                            var9 = 60;
                        }
                        if (var8 == 2) {
                            var9 = 59;
                        }
                        if (var8 == 3) {
                            var9 = 25;
                        }
                        if (var8 == 4) {
                            var9 = 19;
                        }
                        if (var3.field3245 == var8) {
                            var10 = var3.field3312;
                        }
                        if (var3.field3268 == var8) {
                            var10 = var3.field3307;
                        }
                        class62.field817++;
                        class259.method1655(var7[var8], false, -1, var7[var8].equalsIgnoreCase(class659.field8567.method3589(class496.field6338, -22395)) ? var3.field3279 : var10, 6070, false, (long) arg1.field4737, 0, var9, (long) arg1.field4737, 0, "<col=ffff00>" + var4, true);
                    }
                }
            }
            if (var3.field3281 == 1 && var7 != null) {
                for (int var11 = 4; var11 >= 0; var11--) {
                    if (var7[var11] != null && var7[var11].equalsIgnoreCase(class659.field8567.method3589(class496.field6338, -22395))) {
                        short var12 = 0;
                        if (class422.field5564.field356 < arg1.field9555) {
                            var12 = 2000;
                        }
                        short var13 = 0;
                        if (var11 == 0) {
                            var13 = 6;
                        }
                        if (var11 == 1) {
                            var13 = 60;
                        }
                        if (var11 == 2) {
                            var13 = 59;
                        }
                        if (var11 == 3) {
                            var13 = 25;
                        }
                        if (var11 == 4) {
                            var13 = 19;
                        }
                        if (var13 != 0) {
                            var13 += var12;
                        }
                        class259.method1655(var7[var11], false, -1, var3.field3279, arg0 + 6045, false, (long) arg1.field4737, 0, var13, (long) arg1.field4737, 0, "<col=ffff00>" + var4, true);
                        class246.field3376++;
                    }
                }
            }
        }
        class342.field4186++;
        class259.method1655(class659.field8566.method3589(class496.field6338, -22395), arg2, -1, class81.field1146, 6070, false, (long) arg1.field4737, 0, 1001, (long) arg1.field4737, 0, "<col=ffff00>" + var4, true);
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(B)V")
    public static void method1875(byte arg0) {
        int var1 = -51 % ((-arg0 - 17) / 47);
        field3996 = null;
        field3998 = null;
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(I)V")
    public static final void method1876(int arg0) {
        class536 var1 = class240.field3253;
        synchronized (class240.field3253) {
            class240.field3253.method2932((byte) 80);
        }
        if (arg0 > -102) {
            method1874(95, null, false);
        }
        field3999++;
        class536 var2 = class155.field1979;
        synchronized (class155.field1979) {
            class155.field1979.method2932((byte) 80);
        }
    }
}
