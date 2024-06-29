import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public class class25 extends class287 {

    @OriginalMember(owner = "client!mk", name = "m", descriptor = "Lrm;")
    public static class184 field372 = new class184(5);

    @OriginalMember(owner = "client!mk", name = "t", descriptor = "S")
    public static short field379 = 32767;

    @OriginalMember(owner = "client!mk", name = "u", descriptor = "[I")
    public static int[] field380 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

    @OriginalMember(owner = "client!mk", name = "v", descriptor = "I")
    public static int field381 = 0;

    @OriginalMember(owner = "client!mk", name = "x", descriptor = "F")
    public static float field383 = 0.0F;

    @OriginalMember(owner = "client!mk", name = "w", descriptor = "F")
    public static float field382;

    @OriginalMember(owner = "client!mk", name = "l", descriptor = "I")
    public static int field371;

    @OriginalMember(owner = "client!mk", name = "n", descriptor = "I")
    public static int field373;

    @OriginalMember(owner = "client!mk", name = "o", descriptor = "I")
    public static int field374;

    @OriginalMember(owner = "client!mk", name = "p", descriptor = "I")
    public int field375;

    @OriginalMember(owner = "client!mk", name = "q", descriptor = "I")
    public int field376;

    @OriginalMember(owner = "client!mk", name = "r", descriptor = "I")
    public static int field377;

    @OriginalMember(owner = "client!mk", name = "s", descriptor = "I")
    public static int field378;

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(II)V", line = 8)
    public static final void method237(int arg0, int arg1) {
        if (arg1 < -47) {
            field377++;
            class34 var2 = class91.method656(arg0, -2, 9);
            var2.method306(13);
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(Z)V", line = 21)
    public static void method238(boolean arg0) {
        field372 = null;
        field380 = null;
        if (!arg0) {
            field382 = -0.35779136F;
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(ILcd;BI)V", line = 40)
    public static final void method239(int arg0, class136 arg1, byte arg2, int arg3) {
        if (arg1.field2159 == 0) {
            arg1.field2131 = arg1.field2011;
        } else if (arg1.field2159 == 1) {
            arg1.field2131 = (arg3 - arg1.field2137) / 2 + arg1.field2011;
        } else if (arg1.field2159 == 2) {
            arg1.field2131 = arg3 - arg1.field2137 - arg1.field2011;
        } else if (arg1.field2159 == 3) {
            arg1.field2131 = arg1.field2011 * arg3 >> 14;
        } else if (arg1.field2159 == 4) {
            arg1.field2131 = (arg1.field2011 * arg3 >> 14) + (arg3 - arg1.field2137) / 2;
        } else {
            arg1.field2131 = arg3 - arg1.field2137 - (arg1.field2011 * arg3 >> 14);
        }
        field374++;
        if (arg1.field2142 == 0) {
            arg1.field2111 = arg1.field2095;
        } else if (arg1.field2142 == 1) {
            arg1.field2111 = (arg0 - arg1.field2078) / 2 + arg1.field2095;
        } else if (arg1.field2142 == 2) {
            arg1.field2111 = arg0 - arg1.field2095 - arg1.field2078;
        } else if (arg1.field2142 == 3) {
            arg1.field2111 = arg1.field2095 * arg0 >> 14;
        } else if (arg1.field2142 == 4) {
            arg1.field2111 = (arg0 - arg1.field2078) / 2 + (arg1.field2095 * arg0 >> 14);
        } else {
            arg1.field2111 = arg0 - arg1.field2078 - (arg1.field2095 * arg0 >> 14);
        }
        if (class290.field4478 && (client.method953(arg1).field1843 != 0 || arg1.field2063 == 0)) {
            if (arg1.field2131 < 0) {
                arg1.field2131 = 0;
            } else if (arg3 < (arg1.field2137 + arg1.field2131)) {
                arg1.field2131 = arg3 - arg1.field2137;
            }
            if (arg1.field2111 < 0) {
                arg1.field2111 = 0;
            } else if ((arg1.field2111 + arg1.field2078) > arg0) {
                arg1.field2111 = arg0 - arg1.field2078;
            }
        }
        int var4 = -45 / ((arg2 + 56) / 42);
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(IZ)I", line = 112)
    public static final int method240(int arg0, boolean arg1) {
        field378++;
        return arg1 ? arg0 & 0x7F : -73;
    }

    @OriginalMember(owner = "client!mk", name = "c", descriptor = "(I)[F", line = 126)
    public static final float[] method241(int arg0) {
        float var1 = class115.method812() + class115.method813();
        int var2 = class115.method814();
        class132.field1951[3] = 1.0F;
        field373++;
        float var3 = (float) (var2 >> 8 & 0xFF) / 255.0F;
        if (arg0 != 22985) {
            method237(67, -122);
        }
        float var4 = (float) (var2 & 0xFF) / 255.0F;
        float var5 = 0.58823526F;
        class132.field1951[1] = class183.field2972[1] * var3 * var5 * var1;
        class132.field1951[2] = class183.field2972[2] * var4 * var5 * var1;
        float var6 = (float) (var2 >> 16 & 0xFF) / 255.0F;
        class132.field1951[0] = class183.field2972[0] * var6 * var5 * var1;
        return class132.field1951;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(IZI)V", line = 152)
    public static final void method242(int arg0, boolean arg1, int arg2) {
        class198.field3167 = class4.field42 + class340.field5301 - arg0 - 1;
        if (!arg1) {
            field379 = -65;
        }
        field371++;
        class275.field4241 = arg2 - class60.field885;
    }
}
