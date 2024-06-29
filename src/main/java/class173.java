import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class173 {

    @OriginalMember(owner = "client!pd", name = "d", descriptor = "I")
    public static int field2870 = 1;

    @OriginalMember(owner = "client!pd", name = "g", descriptor = "J")
    public static long field2873 = 0L;

    @OriginalMember(owner = "client!pd", name = "h", descriptor = "Ljava/lang/String;")
    public static String field2874 = "shake:";

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "I")
    public static int field2867;

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "I")
    public static int field2868;

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "I")
    public int field2869;

    @OriginalMember(owner = "client!pd", name = "e", descriptor = "I")
    public static int field2871;

    @OriginalMember(owner = "client!pd", name = "f", descriptor = "I")
    public static int field2872;

    @OriginalMember(owner = "client!pd", name = "i", descriptor = "I")
    public static int field2875;

    @OriginalMember(owner = "client!pd", name = "j", descriptor = "I")
    public static int field2876;

    @OriginalMember(owner = "client!pd", name = "k", descriptor = "Ljava/lang/String;")
    public String field2877;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(I)V", line = 6)
    public static final void method1303(int arg0) {
        field2875++;
        if (class233.field3743 == -1 || class178.field2961 == -1) {
            return;
        }
        if (arg0 != -16980) {
            method1304(104, (String) null);
        }
        int var1 = ((class231.field3677 - class34.field454) * class81.field1136 >> 16) + class34.field454;
        class81.field1136 += var1;
        float[] var2 = new float[3];
        if (class81.field1136 < 65535) {
            class317.field4929 = false;
            class189.field3105 = false;
        } else {
            class81.field1136 = 65535;
            if (class317.field4929) {
                class189.field3105 = false;
            } else {
                class189.field3105 = true;
            }
            class317.field4929 = true;
        }
        float var3 = (float) class81.field1136 / 65535.0F;
        int var4 = class144.field2238 * 2;
        for (int var5 = 0; var5 < 3; var5++) {
            int var6 = class275.field4444[class233.field3743][var4][var5] * 3;
            int var7 = class275.field4444[class233.field3743][var4 + 1][var5] * 3;
            int var8 = (class275.field4444[class233.field3743][var4 + 2][var5] + class275.field4444[class233.field3743][var4 + 2][var5] - class275.field4444[class233.field3743][var4 + 3][var5]) * 3;
            int var9 = class275.field4444[class233.field3743][var4][var5];
            int var10 = var7 - var6;
            int var11 = var6 + var8 - (var7 * 2);
            int var12 = class275.field4444[class233.field3743][var4 + 2][var5] + var7 - var8 - var9;
            var2[var5] = (((float) var12 * var3 + (float) var11) * var3 + (float) var10) * var3 + (float) var9;
        }
        class83.field1173 = (int) var2[1] * -1;
        class260.field4150 = (int) var2[2] - (class205.field3367 * 128);
        class120.field1825 = (int) var2[0] - (class70.field989 * 128);
        float[] var13 = new float[3];
        int var14 = class287.field4600 * 2;
        for (int var15 = 0; var15 < 3; var15++) {
            int var16 = class275.field4444[class178.field2961][var14][var15] * 3;
            int var17 = (class275.field4444[class178.field2961][var14 + 2][var15] + class275.field4444[class178.field2961][var14 + 2][var15] - class275.field4444[class178.field2961][var14 + 3][var15]) * 3;
            int var18 = class275.field4444[class178.field2961][var14 + 1][var15] * 3;
            int var19 = class275.field4444[class178.field2961][var14][var15];
            int var20 = var18 - var16;
            int var21 = var16 + var17 - (var18 * 2);
            int var22 = class275.field4444[class178.field2961][var14 + 2][var15] + var18 - var17 - var19;
            var13[var15] = (((float) var22 * var3 + (float) var21) * var3 + (float) var20) * var3 + (float) var19;
        }
        float var23 = (var13[1] - var2[1]) * -1.0F;
        float var24 = var13[0] - var2[0];
        float var25 = var13[2] - var2[2];
        double var26 = Math.sqrt((double) (var24 * var24 + var25 * var25));
        class330.field5137 = (float) Math.atan2((double) var23, var26);
        class333.field5185 = -((float) Math.atan2((double) var24, (double) var25));
        class74.field1036 = (int) ((double) class330.field5137 * 325.949D) & 0x7FF;
        class186.field3076 = (int) ((double) class333.field5185 * 325.949D) & 0x7FF;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;", line = 118)
    public static final String method1304(int arg0, String arg1) {
        field2872++;
        int var2 = arg1.length();
        char[] var3 = new char[var2];
        byte var4 = 2;
        if (arg0 != 1) {
            return (String) null;
        }
        for (int var5 = 0; var5 < var2; var5++) {
            char var6 = arg1.charAt(var5);
            if (var4 == 0) {
                var6 = Character.toLowerCase(var6);
            } else if (var4 == 2 || Character.isUpperCase(var6)) {
                var6 = class197.method1449(var6, arg0 - 95);
            }
            if (Character.isLetter(var6)) {
                var4 = 0;
            } else if (var6 == '.' || var6 == '?' || var6 == '!') {
                var4 = 2;
            } else if (!Character.isSpaceChar(var6)) {
                var4 = 1;
            } else if (var4 != 2) {
                var4 = 1;
            }
            var3[var5] = var6;
        }
        return new String(var3);
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(B)V", line = 176)
    public static void method1305(byte arg0) {
        if (arg0 != 16) {
            method1306(24, -77, -59, -127, -70, -34, false);
        }
        field2874 = null;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIIIIIZ)I", line = 187)
    public static final int method1306(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if ((arg4 & 0x1) == 1) {
            int var7 = arg1;
            arg1 = arg5;
            arg5 = var7;
        }
        if (!arg6) {
            field2874 = (String) null;
        }
        int var8 = arg0 & 0x3;
        field2876++;
        if (var8 == 0) {
            return arg2;
        } else if (var8 == 1) {
            return arg3;
        } else if (var8 == 2) {
            return 7 - (arg2 - 1) - arg1;
        } else {
            return 7 + 1 - arg5 - arg3;
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(I[Ljava/lang/String;I[SI)V", line = 222)
    public static final void method1307(int arg0, String[] arg1, int arg2, short[] arg3, int arg4) {
        field2868++;
        if (arg0 != 2047) {
            field2874 = (String) null;
        }
        if (arg4 >= arg2) {
            return;
        }
        int var5 = arg4;
        int var6 = (arg2 + arg4) / 2;
        String var7 = arg1[var6];
        arg1[var6] = arg1[arg2];
        arg1[arg2] = var7;
        short var8 = arg3[var6];
        arg3[var6] = arg3[arg2];
        arg3[arg2] = var8;
        for (int var9 = arg4; var9 < arg2; var9++) {
            if (var7 == null || arg1[var9] != null && arg1[var9].compareTo(var7) < (var9 & 0x1)) {
                String var10 = arg1[var9];
                arg1[var9] = arg1[var5];
                arg1[var5] = var10;
                short var11 = arg3[var9];
                arg3[var9] = arg3[var5];
                arg3[var5++] = var11;
            }
        }
        arg1[arg2] = arg1[var5];
        arg1[var5] = var7;
        arg3[arg2] = arg3[var5];
        arg3[var5] = var8;
        method1307(2047, arg1, var5 - 1, arg3, arg4);
        method1307(arg0 ^ 0x0, arg1, arg2, arg3, var5 + 1);
    }
}
