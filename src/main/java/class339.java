import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kp")
public class class339 {

    @OriginalMember(owner = "client!kp", name = "g", descriptor = "Ldi;")
    public static class83 field4894;

    @OriginalMember(owner = "client!kp", name = "h", descriptor = "I")
    public static int field4895;

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "I")
    public static int field4888;

    @OriginalMember(owner = "client!kp", name = "b", descriptor = "I")
    public static int field4889;

    @OriginalMember(owner = "client!kp", name = "c", descriptor = "I")
    public static int field4890;

    @OriginalMember(owner = "client!kp", name = "d", descriptor = "I")
    public static int field4891;

    @OriginalMember(owner = "client!kp", name = "e", descriptor = "I")
    public static int field4892;

    @OriginalMember(owner = "client!kp", name = "f", descriptor = "I")
    public static int field4893;

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(IIII)I")
    public static final int method2012(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg3 & 0x3;
        field4889++;
        if (var4 == 0) {
            return arg2;
        }
        if (arg0 < 72) {
            field4895 = 17;
        }
        if (var4 == 1) {
            return arg1;
        } else if (var4 == 2) {
            return 1023 - arg2;
        } else {
            return 1023 - arg1;
        }
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(Lbf;II)V")
    public static final void method2013(class373 arg0, int arg1, int arg2) {
        field4893++;
        if (class61.field763) {
            class61.field763 = false;
            arg2 = 0;
        }
        if (arg1 != 0 || class289.field4013 != null && class289.field4013.method2233(-1, arg0)) {
            return;
        }
        class289.field4013 = arg0;
        class5.field86 = class246.method1483(arg1 ^ 0x1745);
        class39.field488 = arg2;
        class492.field7173 = arg2;
        if (class492.field7173 == 0) {
            class220.method1361(-11554);
            return;
        }
        class423.field6200 = class288.field3999;
        class216.field3014 = class419.field6130;
        class196.field2789 = class276.field3804;
        class166.field2485 = class214.field2978;
        class484.field7079 = class109.field1641;
        class491.field7170 = class25.field324;
        class45.field545 = class517.field7626;
        class463.field6807 = class235.field3335;
        class518.field7672 = class498.field7257;
        class495.field7227 = class238.field3352;
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(B)V")
    public static final void method2014(byte arg0) {
        field4892++;
        if (arg0 < 101) {
            method2018(false);
        }
        class121.field1817.method524(78);
        class12.field183 = null;
        class88.field1282 = 1;
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(II)I")
    public static final int method2015(int arg0, int arg1) {
        if (arg0 == 1) {
            field4890++;
            return arg1 >>> 7;
        } else {
            return -76;
        }
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(IIILya;II)V")
    public static final void method2016(int arg0, int arg1, int arg2, class38 arg3, int arg4, int arg5) {
        field4891++;
        arg3.method279(arg1, arg0, arg1 + arg4, arg0 + arg2);
        arg3.method325(arg1, arg4, -16777216, 1, arg0, arg2);
        if (class373.field5474 < 100) {
            return;
        }
        float var6 = (float) class350.field5137 / (float) class350.field5132;
        int var7 = arg4;
        int var8 = arg2;
        if (var6 < 1.0F) {
            var8 = (int) ((float) arg4 * var6);
        } else {
            var7 = (int) ((float) arg2 / var6);
        }
        int var9 = (arg2 - var8) / 2 + arg0;
        int var10 = (arg4 - var7) / 2 + arg1;
        if (class78.field1140 == null || arg4 != class78.field1140.method102() || arg2 != class78.field1140.method98()) {
            class350.method2085(class350.field5133, class350.field5124 + class350.field5137, class350.field5133 - -class350.field5132, class350.field5124, var10, var9, var7 + var10, var8 + var9);
            class350.method2087(arg3);
            class78.field1140 = arg3.method275(var10, var9, var7, var8, false);
        }
        class78.field1140.method85(var10, var9);
        int var11 = class284.field3921 * var7 / class350.field5132;
        int var12 = class281.field3843 * var8 / class350.field5137;
        int var13 = class193.field2759 * var7 / class350.field5132 + var10;
        int var14 = var9 + var8 - (class514.field7605 * var8 / class350.field5137 + var12);
        if (arg5 < 29) {
            field4894 = null;
        }
        int var15 = -1996554240;
        if (class323.field4400 == class11.field173) {
            var15 = -1996488705;
        }
        arg3.method243(var13, var14, var11, var12, var15, 1);
        arg3.method253(var13, var14, var11, var12, var15, 0);
        if (class222.field3167 <= 0) {
            return;
        }
        int var16;
        if (class193.field2756 > 50) {
            var16 = (100 - class193.field2756) * 5;
        } else {
            var16 = class193.field2756 * 5;
        }
        for (class109 var17 = (class109) class350.field5114.method2818((byte) 121); var17 != null; var17 = (class109) class350.field5114.method2820((byte) -58)) {
            class146 var18 = class350.field5106.method141(var17.field1639, false);
            if (class519.method3092(false, var18)) {
                if (class294.field4050 == var17.field1639) {
                    int var19 = var17.field1645 * var7 / class350.field5132 + var10;
                    int var20 = var9 + ((class350.field5137 - var17.field1644) * var8 / class350.field5137);
                    arg3.method325(var19 - 2, 4, var16 << 24 | 0xFFFF00, 1, var20 - 2, 4);
                } else if (class346.field4955 != -1 && class346.field4955 == var18.field2070) {
                    int var21 = var17.field1645 * var7 / class350.field5132 + var10;
                    int var22 = (class350.field5137 - var17.field1644) * var8 / class350.field5137 + var9;
                    arg3.method325(var21 - 2, 4, var16 << 24 | 0xFFFF00, 1, var22 - 2, 4);
                }
            }
        }
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(Lem;I)Ljava/lang/String;")
    public static final String method2017(class150 arg0, int arg1) {
        if (arg1 != 16776960) {
            return null;
        }
        field4888++;
        if (client.method1228(arg0).method1182((byte) 104) == 0) {
            return null;
        } else if (arg0.field2325 == null || arg0.field2325.trim().length() == 0) {
            return class214.field2982 ? "Hidden-use" : null;
        } else {
            return arg0.field2325;
        }
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(Z)V")
    public static void method2018(boolean arg0) {
        if (!arg0) {
            method2017(null, -110);
        }
        field4894 = null;
    }

    static {
        new class466("The channel you tried to join does not exist.", "Der von dir gewünschte Chatraum existiert nicht.", "Le canal que vous essayez de rejoindre n'existe pas.", "O canal que você tentou acessar não existe.");
        field4894 = new class83(44, 1);
        field4895 = 10;
    }
}
