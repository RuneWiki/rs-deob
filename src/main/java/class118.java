import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public class class118 {

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "Lmh;")
    public static class128 field1990 = class22.method156(125, ")4j");

    @OriginalMember(owner = "client!ai", name = "i", descriptor = "I")
    public static int field1997 = 0;

    @OriginalMember(owner = "client!ai", name = "l", descriptor = "I")
    public static int field2000 = 0;

    @OriginalMember(owner = "client!ai", name = "h", descriptor = "Ls;")
    public static class261 field1996 = new class261(64);

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "I")
    public static int field1989;

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "I")
    public static int field1991;

    @OriginalMember(owner = "client!ai", name = "d", descriptor = "I")
    public static int field1992;

    @OriginalMember(owner = "client!ai", name = "e", descriptor = "I")
    public static int field1993;

    @OriginalMember(owner = "client!ai", name = "g", descriptor = "I")
    public static int field1995;

    @OriginalMember(owner = "client!ai", name = "j", descriptor = "I")
    public static int field1998;

    @OriginalMember(owner = "client!ai", name = "k", descriptor = "I")
    public static int field1999;

    @OriginalMember(owner = "client!ai", name = "f", descriptor = "Lni;")
    public static class23 field1994;

    @OriginalMember(owner = "client!ai", name = "n", descriptor = "[I")
    public static int[] field2002;

    @OriginalMember(owner = "client!ai", name = "m", descriptor = "[S")
    public static short[] field2001;

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(I)V", line = 19)
    public static final void method705(int arg0) {
        field1989++;
        if (class86.field1500 == -1 || class157.field2691 == -1) {
            return;
        }
        int var1 = ((class308.field5236 - class279.field4828) * class167.field2877 >> 16) + class279.field4828;
        class167.field2877 += var1;
        if (class167.field2877 >= 65535) {
            class167.field2877 = 65535;
            if (class57.field1097) {
                class63.field1203 = false;
            } else {
                class63.field1203 = true;
            }
            class57.field1097 = true;
        } else {
            class63.field1203 = false;
            class57.field1097 = false;
        }
        float var2 = (float) class167.field2877 / 65535.0F;
        float[] var3 = new float[3];
        int var4 = class92.field1573 * 2;
        for (int var5 = 0; var5 < 3; var5++) {
            int var6 = class107.field1823[class86.field1500][var4 + 1][var5] * 3;
            int var7 = class107.field1823[class86.field1500][var4][var5] * 3;
            int var8 = class107.field1823[class86.field1500][var4][var5];
            int var9 = var6 - var7;
            int var10 = (class107.field1823[class86.field1500][var4 + 2][var5] + class107.field1823[class86.field1500][var4 + 2][var5] - class107.field1823[class86.field1500][var4 + 3][var5]) * 3;
            int var11 = class107.field1823[class86.field1500][var4 + 2][var5] + var6 - var8 - var10;
            int var12 = var7 + var10 - (var6 * 2);
            var3[var5] = (((float) var11 * var2 + (float) var12) * var2 + (float) var9) * var2 + (float) var8;
        }
        int var13 = -61 / ((63 - arg0) / 35);
        class143.field2445 = (int) var3[2] - (class4.field72 * 128);
        class187.field3249 = (int) var3[1] * -1;
        class142.field2436 = (int) var3[0] - (class221.field3889 * 128);
        float[] var14 = new float[3];
        int var15 = class146.field2506 * 2;
        for (int var16 = 0; var16 < 3; var16++) {
            int var17 = class107.field1823[class157.field2691][var15][var16] * 3;
            int var18 = class107.field1823[class157.field2691][var15 + 1][var16] * 3;
            int var19 = (class107.field1823[class157.field2691][var15 + 2][var16] + class107.field1823[class157.field2691][var15 - -2][var16] - class107.field1823[class157.field2691][var15 + 3][var16]) * 3;
            int var20 = class107.field1823[class157.field2691][var15][var16];
            int var21 = var18 - var17;
            int var22 = var17 + var19 - var18 * 2;
            int var23 = var18 + class107.field1823[class157.field2691][var15 + 2][var16] - var20 - var19;
            var14[var16] = (((float) var23 * var2 + (float) var22) * var2 + (float) var21) * var2 + (float) var20;
        }
        float var24 = var14[0] - var3[0];
        float var25 = (var14[1] - var3[1]) * -1.0F;
        float var26 = var14[2] - var3[2];
        double var27 = Math.sqrt((double) (var24 * var24 + var26 * var26));
        class91.field1550 = (float) Math.atan2((double) var25, var27);
        class165.field2835 = -((float) Math.atan2((double) var24, (double) var26));
        class33.field716 = (int) ((double) class165.field2835 * 325.949D) & 0x7FF;
        class311.field5271 = (int) ((double) class91.field1550 * 325.949D) & 0x7FF;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Z)V", line = 128)
    public static void method706(boolean arg0) {
        field1996 = null;
        field1990 = null;
        field1994 = null;
        if (!arg0) {
            field1994 = (class23) null;
        }
        field2002 = null;
        field2001 = null;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(II)I", line = 143)
    public static final int method707(int arg0, int arg1) {
        field1991++;
        if (arg0 == 16711935) {
            return -1;
        } else {
            if (arg1 != -1) {
                method708(-100, 117, (class314) null, 75);
            }
            return class185.method1250(arg0, -180);
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IILdj;I)Z", line = 166)
    public static final boolean method708(int arg0, int arg1, class314 arg2, int arg3) {
        field1992++;
        byte[] var4 = arg2.method2155(arg3, arg1, (byte) 70);
        if (arg0 != -2) {
            field1994 = (class23) null;
        }
        if (var4 == null) {
            return false;
        } else {
            class188.method1261(var4, (byte) 55);
            return true;
        }
    }

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "(I)V", line = 194)
    public static final void method709(int arg0) {
        field1995++;
        int var1 = client.field4159.method2070(class301.field5112);
        for (int var2 = 0; var2 < class275.field4769; var2++) {
            int var3 = client.field4159.method2070(class50.method342((byte) 46, var2));
            if (var1 < var3) {
                var1 = var3;
            }
        }
        if (arg0 != 25608) {
            field2002 = (int[]) null;
        }
        var1 += 8;
        int var4 = class275.field4769 * 15 + 21;
        int var5 = class252.field4359 - var1 / 2;
        if (class199.field3465 < var5 + var1) {
            var5 = class199.field3465 - var1;
        }
        if (var5 < 0) {
            var5 = 0;
        }
        int var6 = class178.field3129;
        if (class16.field420 < var4 + var6) {
            var6 = class16.field420 - var4;
        }
        if (var6 < 0) {
            var6 = 0;
        }
        if (class173.field3069 == 1) {
            if (class252.field4359 == class104.field1790 && class288.field4927 == class178.field3129) {
                class271.field4721 = true;
                class309.field5242 = var5;
                class173.field3069 = 0;
                class292.field5005 = var1;
                class219.field3864 = class275.field4769 * 15 + 22;
                class226.field3946 = var6;
            }
        } else if (class45.field915 == class252.field4359 && class241.field4129 == class178.field3129) {
            class292.field5005 = var1;
            class309.field5242 = var5;
            class226.field3946 = var6;
            class173.field3069 = 0;
            class271.field4721 = true;
            class219.field3864 = class275.field4769 * 15 + 22;
        } else {
            class173.field3069 = 1;
            class104.field1790 = class45.field915;
            class288.field4927 = class241.field4129;
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIIBI)V", line = 285)
    public static final void method710(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        field1998++;
        int var5 = 0;
        if (arg3 > -121) {
            return;
        }
        while (var5 < class257.field4424) {
            if (class32.field711[var5] + class120.field2037[var5] > arg4 && class120.field2037[var5] < (arg2 + arg4) && arg0 < class313.field5281[var5] + class275.field4762[var5] && (arg0 + arg1) > class275.field4762[var5]) {
                class26.field581[var5] = true;
            }
            var5++;
        }
    }

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "(II)Lge;", line = 317)
    public static final class144 method711(int arg0, int arg1) {
        field1993++;
        class144 var2 = (class144) class164.field2818.method1836((long) arg0, 0);
        if (arg1 != 2) {
            return (class144) null;
        } else if (var2 == null) {
            byte[] var3 = class297.field5064.method2155(arg0, 3, (byte) 70);
            class144 var4 = new class144();
            if (var3 != null) {
                var4.method961(new class194(var3), (byte) 81);
            }
            class164.field2818.method1835((byte) -81, (long) arg0, var4);
            return var4;
        } else {
            return var2;
        }
    }

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "(I)Lqg;", line = 343)
    public static final class231 method712(int arg0) {
        int var1 = class178.field3128[0] * class125.field2106[0];
        field1999++;
        byte[] var2 = class157.field2690[0];
        int[] var3 = new int[var1];
        if (arg0 != 255) {
            return (class231) null;
        }
        for (int var4 = 0; var4 < var1; var4++) {
            var3[var4] = class205.field3614[class238.method1622(255, var2[var4])];
        }
        class231 var5 = new class231(class72.field1327, class132.field2294, class151.field2607[0], class266.field4603[0], class125.field2106[0], class178.field3128[0], var3);
        class15.method113(70);
        return var5;
    }
}
