import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public class class58 {

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "I")
    public static int field1149;

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "I")
    public static int field1150;

    @OriginalMember(owner = "client!ni", name = "c", descriptor = "I")
    public static int field1151;

    @OriginalMember(owner = "client!ni", name = "d", descriptor = "I")
    public static int field1152;

    @OriginalMember(owner = "client!ni", name = "e", descriptor = "I")
    public static int field1153;

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(I)V", line = 4)
    public static final void method449(int arg0) {
        field1149++;
        class135.field2262.method1877(-29702);
        if (arg0 == 128) {
            class186.field3022.method1877(-29702);
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(BIIIII)V", line = 16)
    public static final void method450(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class66.field1258 = arg4;
        class247.field3821 = arg1;
        field1151++;
        class39.field749 = arg5;
        if (arg0 != 40) {
            method453(88, 13, (byte) -89, 123, 61);
        }
        class55.field1101 = arg2;
        class196.field3155 = arg3;
        if (class196.field3155 >= 100) {
            int var6 = class66.field1258 * 128 + 64;
            int var7 = class55.field1101 * 128 + 64;
            int var8 = class325.method2250(var7, arg0 + 22731, class289.field4438, var6) - class39.field749;
            int var9 = var6 - class38.field742;
            int var10 = var7 - class283.field4381;
            int var11 = var8 - class132.field2232;
            int var12 = (int) Math.sqrt((double) (var9 * var9 + var10 * var10));
            class43.field820 = (int) (Math.atan2((double) var11, (double) var12) * 325.949D) & 0x7FF;
            class131.field2213 = (int) (-325.949D * Math.atan2((double) var9, (double) var10)) & 0x7FF;
            if (class43.field820 < 128) {
                class43.field820 = 128;
            }
            if (class43.field820 > 383) {
                class43.field820 = 383;
            }
        }
        class135.field2271 = 2;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(IJ)Ljava/lang/String;", line = 62)
    public static final String method451(int arg0, long arg1) {
        if (arg0 < 52) {
            return (String) null;
        } else {
            field1153++;
            return class72.method552(arg1, 37);
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(ZI)V", line = 78)
    public static final void method452(boolean arg0, int arg1) {
        if (!arg0) {
            field1150++;
            class2 var2 = class212.method1433(arg1, 11, -13802);
            var2.method16((byte) 110);
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(IIBII)I", line = 93)
    public static final int method453(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        if (arg2 > -1) {
            return -72;
        }
        field1152++;
        if (class87.field1651) {
            arg3 = 1000000;
            class87.field1651 = false;
        }
        class336 var5 = class210.field3387[arg4][arg1];
        int var6 = var5.field5169;
        float var7 = var5.field5164;
        if (!class140.field2314) {
            var6 = 0;
        }
        int var8 = var5.field5166;
        int var9 = var5.field5157;
        float var10 = ((float) arg0 * 0.1F + 0.7F) * var5.field5158;
        float var11 = var5.field5167;
        float var12 = var5.field5159;
        float var13 = var5.field5156;
        float var14 = var5.field5160;
        class143 var15 = var5.field5149;
        if (class97.field1720 != var9 || class142.field2352 != var10 || class190.field3079 != var11 || class158.field2578 != var7 || class274.field4206 != var8 || class286.field4428 != var6 || class26.field510 != var15 || class274.field4200 != var14 || class336.field5161 != var13 || class267.field4120 != var12) {
            class4.field107 = class46.field951;
            class210.field3388 = class345.field5355;
            client.field919 = class71.field1495;
            class165.field2660 = class146.field2398;
            class28.field540 = class250.field3921;
            class235.field3689 = class204.field3324;
            class187.field3034 = class248.field3870;
            class216.field3455 = class2.field48;
            class14.field271 = class44.field868;
            class233.field3659 = class201.field3206;
            if (class148.field2423 == null || class210.field3388 == class148.field2423) {
                class148.field2423 = new class143();
            }
            class267.field4120 = var12;
            class327.field5005 = 0;
            class274.field4206 = var8;
            class336.field5161 = var13;
            class142.field2352 = var10;
            class26.field510 = var15;
            class158.field2578 = var7;
            class190.field3079 = var11;
            class286.field4428 = var6;
            class274.field4200 = var14;
            class97.field1720 = var9;
        }
        if (class327.field5005 < 65536) {
            class327.field5005 += arg3 * 250;
            if (class327.field5005 >= 65536) {
                class248.field3870 = class274.field4200;
                class250.field3921 = class286.field4428;
                class46.field951 = class158.field2578;
                class2.field48 = class336.field5161;
                class44.field868 = class190.field3079;
                class204.field3324 = class97.field1720;
                class146.field2398 = class274.field4206;
                class210.field3388 = null;
                class201.field3206 = class142.field2352;
                class345.field5355 = class26.field510;
                class327.field5005 = 65536;
                class71.field1495 = class267.field4120;
            } else {
                int var16 = 65536 - class327.field5005 >> 8;
                int var17 = class327.field5005 >> 8;
                class204.field3324 = ((class97.field1720 & 0xFF00) * var17 + (class235.field3689 & 0xFF00) * var16 & 0xFF0000) + ((class97.field1720 & 0xFF00FF) * var17 + (class235.field3689 & 0xFF00FF) * var16 & 0xFF00FF00) >> 8;
                class146.field2398 = ((class274.field4206 & 0xFF00) * var17 + (class165.field2660 & 0xFF00) * var16 & 0xFF0000) + ((class274.field4206 & 0xFF00FF) * var17 + (class165.field2660 & 0xFF00FF) * var16 & 0xFF00FF00) >> 8;
                float var18 = (float) (65536 - class327.field5005) / 65536.0F;
                float var19 = (float) class327.field5005 / 65536.0F;
                class71.field1495 = client.field919 * var18 + class267.field4120 * var19;
                class46.field951 = class4.field107 * var18 + class158.field2578 * var19;
                class2.field48 = class336.field5161 * var19 + class216.field3455 * var18;
                class201.field3206 = class233.field3659 * var18 + class142.field2352 * var19;
                class248.field3870 = class274.field4200 * var19 + class187.field3034 * var18;
                class44.field868 = class190.field3079 * var19 + class14.field271 * var18;
                class250.field3921 = class286.field4428 * var17 + class28.field540 * var16 >> 8;
                if (class26.field510 != class210.field3388) {
                    if (class210.field3388 == null || class26.field510 == null) {
                        class345.field5355 = null;
                    } else {
                        class345.field5355 = class148.field2423.method928(class210.field3388, class26.field510, (float) class327.field5005 / 65536.0F);
                    }
                }
            }
        }
        return class146.field2398;
    }
}
