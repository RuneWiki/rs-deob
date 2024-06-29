import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sl")
public class class266 {

    @OriginalMember(owner = "client!sl", name = "f", descriptor = "[Ljava/lang/String;")
    public static String[] field3905 = new String[100];

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "Lkn;")
    public static class442 field3900 = new class442();

    @OriginalMember(owner = "client!sl", name = "i", descriptor = "Z")
    public static boolean field3908 = true;

    @OriginalMember(owner = "client!sl", name = "k", descriptor = "I")
    public static int field3910 = 127;

    @OriginalMember(owner = "client!sl", name = "b", descriptor = "I")
    public static int field3901;

    @OriginalMember(owner = "client!sl", name = "c", descriptor = "I")
    public static int field3902;

    @OriginalMember(owner = "client!sl", name = "d", descriptor = "I")
    public static int field3903;

    @OriginalMember(owner = "client!sl", name = "h", descriptor = "I")
    public static int field3907;

    @OriginalMember(owner = "client!sl", name = "j", descriptor = "I")
    public static int field3909;

    @OriginalMember(owner = "client!sl", name = "e", descriptor = "Lo;")
    public class21 field3904;

    @OriginalMember(owner = "client!sl", name = "l", descriptor = "Lvo;")
    public static class28 field3911;

    @OriginalMember(owner = "client!sl", name = "g", descriptor = "Lni;")
    public class305 field3906;

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(BC)C")
    public static final char method1819(byte arg0, char arg1) {
        field3901++;
        if (arg0 != -76) {
            return (char) 65413;
        } else if (arg1 == ' ' || arg1 == ' ' || arg1 == '_' || arg1 == '-') {
            return '_';
        } else if (arg1 == '[' || arg1 == ']' || arg1 == '#') {
            return arg1;
        } else if (arg1 == 'à' || arg1 == 'á' || arg1 == 'â' || arg1 == 'ä' || arg1 == 'ã' || arg1 == 'À' || arg1 == 'Á' || arg1 == 'Â' || arg1 == 'Ä' || arg1 == 'Ã') {
            return 'a';
        } else if (arg1 == 'è' || arg1 == 'é' || arg1 == 'ê' || arg1 == 'ë' || arg1 == 'È' || arg1 == 'É' || arg1 == 'Ê' || arg1 == 'Ë') {
            return 'e';
        } else if (arg1 == 'í' || arg1 == 'î' || arg1 == 'ï' || arg1 == 'Í' || arg1 == 'Î' || arg1 == 'Ï') {
            return 'i';
        } else if (arg1 == 'ò' || arg1 == 'ó' || arg1 == 'ô' || arg1 == 'ö' || arg1 == 'õ' || arg1 == 'Ò' || arg1 == 'Ó' || arg1 == 'Ô' || arg1 == 'Ö' || arg1 == 'Õ') {
            return 'o';
        } else if (arg1 == 'ù' || arg1 == 'ú' || arg1 == 'û' || arg1 == 'ü' || arg1 == 'Ù' || arg1 == 'Ú' || arg1 == 'Û' || arg1 == 'Ü') {
            return 'u';
        } else if (arg1 == 'ç' || arg1 == 'Ç') {
            return 'c';
        } else if (arg1 == 'ÿ' || arg1 == 'Ÿ') {
            return 'y';
        } else if (arg1 == 'ñ' || arg1 == 'Ñ') {
            return 'n';
        } else if (arg1 == 'ß') {
            return 'b';
        } else {
            return Character.toLowerCase(arg1);
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(B)V")
    public static void method1820(byte arg0) {
        if (arg0 != -17) {
            method1823(false);
        }
        field3900 = null;
        field3911 = null;
        field3905 = null;
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(I)V")
    public static final void method1821(int arg0) {
        if (arg0 <= -113) {
            field3907++;
            class349.field5079.method102((byte) -86);
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(III)V")
    public static final void method1822(int arg0, int arg1, int arg2) {
        field3903++;
        class191 var3 = new class191(16);
        if (arg1 != 101) {
            return;
        }
        for (class413 var4 = (class413) class338.field4904.method1383(92); var4 != null; var4 = (class413) class338.field4904.method1378((byte) 98)) {
            var4.method2660((byte) 115);
            int var5 = (int) (var4.field6070 >> 28);
            int var6 = (int) (var4.field6070 >> 14 & 0x3FFFL) - arg0;
            int var7 = (int) (var4.field6070 & 0x3FFFL) - arg2;
            if (var7 >= 0 && var6 >= 0 && class80.field1034 > var7 && var6 < class381.field5414) {
                var3.method1376(var4, (long) (var5 << 28 | var6 << 14 | var7), 116);
            }
        }
        class338.field4904 = var3;
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(Z)V")
    public static final void method1823(boolean arg0) {
        field3909++;
        if (class245.field3660 == -1 || class194.field2801 == -1) {
            return;
        }
        int var1 = ((class255.field3777 - class31.field386) * class190.field2765 >> 16) + class31.field386;
        class190.field2765 += var1;
        if (class190.field2765 >= 65535) {
            class190.field2765 = 65535;
            if (class183.field2588) {
                class441.field6310 = false;
            } else {
                class441.field6310 = true;
            }
            class183.field2588 = true;
        } else {
            class183.field2588 = false;
            class441.field6310 = false;
        }
        float var2 = (float) class190.field2765 / 65535.0F;
        float[] var3 = new float[3];
        int var4 = class190.field2734 * 2;
        for (int var5 = 0; var5 < 3; var5++) {
            int var21 = class113.field1469[class245.field3660][var4][var5] * 3;
            int var22 = class113.field1469[class245.field3660][var4 + 1][var5] * 3;
            int var23 = (class113.field1469[class245.field3660][var4 + 2][var5] + class113.field1469[class245.field3660][var4 + 2][var5] - class113.field1469[class245.field3660][var4 + 3][var5]) * 3;
            int var24 = class113.field1469[class245.field3660][var4][var5];
            int var25 = var22 - var21;
            int var26 = var21 - (var22 * 2 - var23);
            int var27 = class113.field1469[class245.field3660][var4 + 2][var5] + var22 - var24 - var23;
            var3[var5] = (((float) var27 * var2 + (float) var26) * var2 + (float) var25) * var2 + (float) var24;
        }
        class249.field3707 = (int) var3[1] * -1;
        class417.field5999 = (int) var3[2] - (class342.field4959 * 128);
        class386.field5469 = (int) var3[0] - (class306.field4459 * 128);
        float[] var6 = new float[3];
        int var7 = class267.field3915 * 2;
        for (int var8 = 0; var8 < 3; var8++) {
            int var14 = class113.field1469[class194.field2801][var7][var8] * 3;
            int var15 = class113.field1469[class194.field2801][var7 + 1][var8] * 3;
            int var16 = (class113.field1469[class194.field2801][var7 + 2][var8] + class113.field1469[class194.field2801][var7 + 2][var8] - class113.field1469[class194.field2801][var7 + 3][var8]) * 3;
            int var17 = class113.field1469[class194.field2801][var7][var8];
            int var18 = var15 - var14;
            int var19 = var16 + var14 - (var15 * 2);
            int var20 = class113.field1469[class194.field2801][var7 + 2][var8] - var17 - (-var15 - -var16);
            var6[var8] = (((float) var20 * var2 + (float) var19) * var2 + (float) var18) * var2 + (float) var17;
        }
        float var9 = var6[0] - var3[0];
        if (!arg0) {
            field3900 = null;
        }
        float var10 = (var6[1] - var3[1]) * -1.0F;
        float var11 = var6[2] - var3[2];
        double var12 = Math.sqrt((double) (var9 * var9 + var11 * var11));
        class319.field4676 = (int) (Math.atan2((double) var10, var12) * 2607.5945876176133D) & 0x3FFF;
        class278.field3990 = (int) (-Math.atan2((double) var9, (double) var11) * 2607.5945876176133D) & 0x3FFF;
        class214.field3072 = ((class113.field1469[class245.field3660][var4 + 2][3] - class113.field1469[class245.field3660][var4][3]) * class190.field2765 >> 16) + class113.field1469[class245.field3660][var4][3];
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(IIBIII)V")
    public static final void method1824(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        field3902++;
        int var9 = arg5 + 1;
        class5.method17(class440.field6288[arg5], arg0, arg4, (byte) 107, arg3);
        int var8 = arg1 - 1;
        class5.method17(class440.field6288[arg1], arg0, arg4, (byte) 84, arg3);
        for (int var6 = var9; var6 <= var8; var6++) {
            int[] var7 = class440.field6288[var6];
            var7[arg3] = var7[arg0] = arg4;
        }
        if (arg2 > -52) {
            method1819((byte) 113, '|');
        }
    }
}
