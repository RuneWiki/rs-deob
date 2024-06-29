import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class181 {

    @OriginalMember(owner = "client!gb", name = "d", descriptor = "Luc;")
    public static class202 field2874 = new class202();

    @OriginalMember(owner = "client!gb", name = "f", descriptor = "Lwn;")
    public static class30 field2876 = new class30();

    @OriginalMember(owner = "client!gb", name = "i", descriptor = "Ljava/lang/String;")
    public static String field2879 = "glow2:";

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "I")
    public static int field2871;

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "I")
    public static int field2872;

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "I")
    public static int field2873;

    @OriginalMember(owner = "client!gb", name = "e", descriptor = "I")
    public static int field2875;

    @OriginalMember(owner = "client!gb", name = "j", descriptor = "I")
    public static int field2880;

    @OriginalMember(owner = "client!gb", name = "h", descriptor = "Lpk;")
    public static class120 field2878;

    @OriginalMember(owner = "client!gb", name = "g", descriptor = "Ldg;")
    public static class336 field2877;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(I)V", line = 11)
    public static void method1323(int arg0) {
        field2878 = null;
        field2879 = null;
        field2876 = null;
        if (arg0 == -10912) {
            field2874 = null;
            field2877 = null;
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(II)Loj;", line = 25)
    public static final class340 method1324(int arg0, int arg1) {
        if (arg1 <= 72) {
            field2874 = (class202) null;
        }
        field2880++;
        class340 var2 = (class340) class202.field3155.method1183((long) arg0, (byte) -112);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class83.field1294.method967(26, arg0, 65280);
        class340 var4 = new class340();
        if (var3 != null) {
            var4.method2359(0, new class1(var3));
        }
        class202.field3155.method1182((byte) -52, (long) arg0, var4);
        return var4;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIIII)I", line = 48)
    public static final int method1325(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2871++;
        if (class82.field1277) {
            class82.field1277 = false;
            arg0 = 1000000;
        }
        class75 var5 = class155.field2520[arg3][arg1];
        float var6 = ((float) arg2 * 0.1F + 0.7F) * var5.field1159;
        int var7 = var5.field1148;
        int var8 = var5.field1162;
        float var9 = var5.field1147;
        float var10 = var5.field1154;
        class72 var11 = var5.field1152;
        if (arg4 != 0) {
            method1326((byte) 96);
        }
        float var12 = var5.field1163;
        float var13 = var5.field1160;
        float var14 = var5.field1145;
        int var15 = var5.field1149;
        if (!class140.field2267) {
            var15 = 0;
        }
        if (class68.field1031 != var7 || class229.field3530 != var6 || class74.field1142 != var9 || class270.field4165 != var10 || class251.field3706 != var8 || class123.field1999 != var15 || class14.field301 != var11 || class89.field1430 != var14 || class146.field2383 != var13 || class225.field3487 != var12) {
            class62.field911 = class311.field4914;
            class304.field4845 = class74.field1143;
            class257.field3812 = class241.field3606;
            class217.field3374 = class326.field5091;
            class167.field2690 = class41.field632;
            class268.field4114 = class198.field3044;
            class299.field4784 = class141.field2281;
            class237.field3557 = class191.field2992;
            class243.field3642 = class204.field3172;
            class318.field4999 = class95.field1536;
            if (class30.field478 == null || class30.field478 == class243.field3642) {
                class30.field478 = new class72();
            }
            class146.field2383 = var13;
            class155.field2531 = 0;
            class14.field301 = var11;
            class68.field1031 = var7;
            class251.field3706 = var8;
            class89.field1430 = var14;
            class123.field1999 = var15;
            class270.field4165 = var10;
            class74.field1142 = var9;
            class225.field3487 = var12;
            class229.field3530 = var6;
        }
        if (class155.field2531 < 65536) {
            class155.field2531 += arg0 * 250;
            if (class155.field2531 < 65536) {
                int var16 = class155.field2531 >> 8;
                int var17 = 65536 - class155.field2531 >> 8;
                float var18 = (float) (65536 - class155.field2531) / 65536.0F;
                class198.field3044 = class268.field4114 * var17 + class123.field1999 * var16 >> 8;
                float var19 = (float) class155.field2531 / 65536.0F;
                class191.field2992 = class74.field1142 * var19 + class237.field3557 * var18;
                class74.field1143 = class304.field4845 * var18 + class146.field2383 * var19;
                class41.field632 = class225.field3487 * var19 + class167.field2690 * var18;
                class241.field3606 = class89.field1430 * var19 + class257.field3812 * var18;
                class311.field4914 = ((class62.field911 & 0xFF00FF) * var17 + ((class251.field3706 & 0xFF00FF) * var16) & 0xFF00FF00) + ((class62.field911 & 0xFF00) * var17 + ((class251.field3706 & 0xFF00) * var16) & 0xFF0000) >> 8;
                class326.field5091 = class270.field4165 * var19 + class217.field3374 * var18;
                class95.field1536 = class318.field4999 * var18 + class229.field3530 * var19;
                class141.field2281 = ((class68.field1031 & 0xFF00) * var16 + (class299.field4784 & 0xFF00) * var17 & 0xFF0000) + ((class68.field1031 & 0xFF00FF) * var16 + (class299.field4784 & 0xFF00FF) * var17 & 0xFF00FF00) >> 8;
                if (class243.field3642 != class14.field301) {
                    if (class243.field3642 == null || class14.field301 == null) {
                        class204.field3172 = null;
                    } else {
                        class204.field3172 = class30.field478.method579(class243.field3642, class14.field301, (float) class155.field2531 / 65536.0F);
                    }
                }
            } else {
                class311.field4914 = class251.field3706;
                class74.field1143 = class146.field2383;
                class191.field2992 = class74.field1142;
                class155.field2531 = 65536;
                class241.field3606 = class89.field1430;
                class243.field3642 = null;
                class41.field632 = class225.field3487;
                class141.field2281 = class68.field1031;
                class326.field5091 = class270.field4165;
                class198.field3044 = class123.field1999;
                class204.field3172 = class14.field301;
                class95.field1536 = class229.field3530;
            }
        }
        return class311.field4914;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(B)V", line = 188)
    public static final void method1326(byte arg0) {
        class313.field4923.method2283((byte) 77);
        class260.field3857.method2283((byte) 77);
        field2875++;
        if (arg0 < 27) {
            method1323(56);
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Ltk;II)Ljava/lang/String;", line = 200)
    public static final String method1327(class266 arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            method1327((class266) null, 30, -20);
        }
        field2872++;
        if (!client.method1867(arg0).method1779(~arg1, arg2) && arg0.field4037 == null) {
            return null;
        } else if (arg0.field3950 == null || arg2 >= arg0.field3950.length || arg0.field3950[arg2] == null || arg0.field3950[arg2].trim().length() == 0) {
            return class320.field5011 ? "Hidden-" + arg2 : null;
        } else {
            return arg0.field3950[arg2];
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIIZFIIII)[[I", line = 227)
    public static final int[][] method1328(int arg0, int arg1, int arg2, boolean arg3, float arg4, int arg5, int arg6, int arg7, int arg8) {
        field2873++;
        int[][] var9 = new int[arg0][arg6];
        class237 var10 = new class237();
        var10.field3569 = arg7;
        var10.field3580 = arg3;
        var10.field3570 = arg2;
        var10.field3574 = arg1;
        var10.field3554 = (int) (arg4 * 4096.0F);
        var10.method247((byte) 68);
        class244.method1719(arg0, arg6, 128);
        for (int var11 = arg8; var11 < arg0; var11++) {
            var10.method1699(-117, var9[var11], var11);
        }
        return var9;
    }
}
