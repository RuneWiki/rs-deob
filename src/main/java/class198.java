import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pha")
public abstract class class198 extends class766 {

    @OriginalMember(owner = "client!pha", name = "p", descriptor = "I")
    public static int field2985 = 0;

    @OriginalMember(owner = "client!pha", name = "q", descriptor = "Lin;")
    public static class380 field2986 = new class380(32, 6);

    @OriginalMember(owner = "client!pha", name = "n", descriptor = "I")
    public static int field2983;

    @OriginalMember(owner = "client!pha", name = "o", descriptor = "I")
    public static int field2984;

    @OriginalMember(owner = "client!pha", name = "a", descriptor = "(Z)V", line = 6)
    public static final void method1409(boolean arg0) {
        field2983++;
        if (class44.field581 == -1 || class420.field5831 == -1) {
            return;
        }
        int var1 = class514.field7089 + ((class439.field6092 - class514.field7089) * class486.field6692 >> 16);
        class486.field6692 += var1;
        if (class486.field6692 >= 65535) {
            if (class229.field3364) {
                class339.field4805 = false;
            } else {
                class339.field4805 = true;
            }
            class486.field6692 = 65535;
            class229.field3364 = true;
        } else {
            class339.field4805 = false;
            class229.field3364 = false;
        }
        float var2 = (float) class486.field6692 / 65535.0F;
        float[] var3 = new float[3];
        int var4 = class679.field9597 * 2;
        for (int var5 = 0; var5 < 3; var5++) {
            int var21 = class448.field6179[class44.field581][var4][var5] * 3;
            int var22 = class448.field6179[class44.field581][var4 + 1][var5] * 3;
            int var23 = (class448.field6179[class44.field581][var4 + 2][var5] + class448.field6179[class44.field581][var4 + 2][var5] - class448.field6179[class44.field581][var4 + 3][var5]) * 3;
            int var24 = class448.field6179[class44.field581][var4][var5];
            int var25 = var22 - var21;
            int var26 = var21 + var23 - (var22 * 2);
            int var27 = class448.field6179[class44.field581][var4 + 2][var5] + var22 - var23 - var24;
            var3[var5] = (((float) var27 * var2 + (float) var26) * var2 + (float) var25) * var2 + (float) var24;
        }
        if (arg0) {
            return;
        }
        class286.field4204 = (int) var3[2] - (class697.field9798 * 512);
        class243.field3482 = (int) var3[1] * -1;
        class733.field10199 = (int) var3[0] - (class222.field3266 * 512);
        float[] var6 = new float[3];
        int var7 = class174.field2635 * 2;
        for (int var8 = 0; var8 < 3; var8++) {
            int var14 = class448.field6179[class420.field5831][var7][var8] * 3;
            int var15 = class448.field6179[class420.field5831][var7 + 1][var8] * 3;
            int var16 = (class448.field6179[class420.field5831][var7 + 2][var8] + class448.field6179[class420.field5831][var7 + 2][var8] - class448.field6179[class420.field5831][var7 + 3][var8]) * 3;
            int var17 = class448.field6179[class420.field5831][var7][var8];
            int var18 = var15 - var14;
            int var19 = var14 + var16 - (var15 * 2);
            int var20 = var15 + class448.field6179[class420.field5831][var7 + 2][var8] - var16 - var17;
            var6[var8] = (((float) var20 * var2 + (float) var19) * var2 + (float) var18) * var2 + (float) var17;
        }
        float var9 = var6[0] - var3[0];
        float var10 = (var6[1] - var3[1]) * -1.0F;
        float var11 = var6[2] - var3[2];
        double var12 = Math.sqrt((double) (var9 * var9 + var11 * var11));
        class99.field1437 = (int) (Math.atan2((double) var10, var12) * 2607.5945876176133D) & 0x3FFF;
        class642.field9037 = (int) (-Math.atan2((double) var9, (double) var11) * 2607.5945876176133D) & 0x3FFF;
        class389.field5439 = class448.field6179[class44.field581][var4][3] + ((class448.field6179[class44.field581][var4 + 2][3] - class448.field6179[class44.field581][var4][3]) * class486.field6692 >> 16);
    }

    @OriginalMember(owner = "client!pha", name = "a", descriptor = "(I)V", line = 118)
    public static void method1410(int arg0) {
        field2986 = null;
        int var1 = -99 % ((arg0 + 69) / 33);
    }

    @OriginalMember(owner = "client!pha", name = "a", descriptor = "(IIIBLww;)Z", line = 128)
    public static final boolean method1411(int arg0, int arg1, int arg2, byte arg3, class338 arg4) {
        field2984++;
        if (!class83.field1263 || !class317.field4537) {
            return false;
        } else if (class414.field5685 < 100) {
            return false;
        } else if (class291.method1845(arg1, (byte) -53, arg2, arg0)) {
            int var5 = arg2 << class679.field9600;
            int var6 = arg1 << class679.field9600;
            int var7 = class678.field9594[arg0].method2476(arg1, arg2, -1) - 1;
            if (arg3 != -80) {
                field2985 = 56;
            }
            int var8 = var7 + arg4.method1167(126);
            if (arg4.field4792 == 1) {
                if (!class486.method2855(var6, var7, var5, var8, var5, var6 + class253.field3624, var6, false, var8, var5)) {
                    return false;
                } else if (class486.method2855(class253.field3624 + var6, var7, var5, var7, var5, class253.field3624 + var6, var6, false, var8, var5)) {
                    class469.field6392++;
                    return true;
                } else {
                    return false;
                }
            } else if (arg4.field4792 == 2) {
                if (!class486.method2855(class253.field3624 + var6, var7, var5, var8, var5, class253.field3624 + var6, class253.field3624 + var6, false, var8, var5 + class253.field3624)) {
                    return false;
                } else if (class486.method2855(class253.field3624 + var6, var7, class253.field3624 + var5, var8, var5, class253.field3624 + var6, class253.field3624 + var6, false, var7, class253.field3624 + var5)) {
                    class469.field6392++;
                    return true;
                } else {
                    return false;
                }
            } else if (arg4.field4792 == 4) {
                if (!class486.method2855(var6, var7, class253.field3624 + var5, var8, class253.field3624 + var5, class253.field3624 + var6, var6, false, var8, class253.field3624 + var5)) {
                    return false;
                } else if (class486.method2855(class253.field3624 + var6, var7, class253.field3624 + var5, var7, class253.field3624 + var5, class253.field3624 + var6, var6, false, var8, class253.field3624 + var5)) {
                    class469.field6392++;
                    return true;
                } else {
                    return false;
                }
            } else if (arg4.field4792 == 8) {
                if (!class486.method2855(var6, var7, var5, var8, var5, var6, var6, false, var8, class253.field3624 + var5)) {
                    return false;
                } else if (class486.method2855(var6, var7, class253.field3624 + var5, var8, var5, var6, var6, false, var7, class253.field3624 + var5)) {
                    class469.field6392++;
                    return true;
                } else {
                    return false;
                }
            } else if (arg4.field4792 == 16) {
                if (class372.method2219(arg3 + 80, var7, class358.field5076, var8, class358.field5076, class358.field5076 + var6, var5)) {
                    class469.field6392++;
                    return true;
                } else {
                    return false;
                }
            } else if (arg4.field4792 == 32) {
                if (class372.method2219(arg3 + 80, var7, class358.field5076, var8, class358.field5076, class358.field5076 + var6, var5 - -class358.field5076)) {
                    class469.field6392++;
                    return true;
                } else {
                    return false;
                }
            } else if (arg4.field4792 == 64) {
                if (class372.method2219(0, var7, class358.field5076, var8, class358.field5076, var6, var5 + class358.field5076)) {
                    class469.field6392++;
                    return true;
                } else {
                    return false;
                }
            } else if (arg4.field4792 != 128) {
                return true;
            } else if (class372.method2219(0, var7, class358.field5076, var8, class358.field5076, var6, var5)) {
                class469.field6392++;
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!pha", name = "a", descriptor = "(ZLol;)V")
    public abstract void method855(boolean arg0, class431 arg1);

    @OriginalMember(owner = "client!pha", name = "a", descriptor = "(ILlm;)V")
    public abstract void method858(int arg0, class50 arg1);
}
