import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public class class206 {

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "S")
    public static short field3334 = 320;

    @OriginalMember(owner = "client!rd", name = "f", descriptor = "I")
    public static int field3339 = 0;

    @OriginalMember(owner = "client!rd", name = "g", descriptor = "[I")
    public static int[] field3340 = new int[25];

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "I")
    public static int field3335;

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "I")
    public static int field3336;

    @OriginalMember(owner = "client!rd", name = "e", descriptor = "I")
    public static int field3338;

    @OriginalMember(owner = "client!rd", name = "d", descriptor = "[S")
    public static short[] field3337;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lbb;BZ)V", line = 11)
    public static final void method1457(class187 arg0, byte arg1, boolean arg2) {
        field3335++;
        int var3 = arg0.field3052;
        int var4 = (int) arg0.field844;
        arg0.method418(6971);
        if (arg2) {
            class244.method1745((byte) 22, var3);
        }
        class132.method924(var3, -1929723600);
        class302 var5 = class165.method1157(false, var4);
        if (var5 != null) {
            class18.method91(28515, var5);
        }
        int var6 = class98.field1432;
        int var7 = -56 / ((94 - arg1) / 32);
        for (int var8 = 0; var8 < var6; var8++) {
            if (class88.method624(class296.field4780[var8], 3)) {
                class201.method1429(255, var8);
            }
        }
        if (class98.field1432 == 1) {
            class251.field3993 = false;
            class67.method492(false, class109.field1528, class239.field3833, class117.field1717, class228.field3637);
        } else {
            class67.method492(false, class109.field1528, class239.field3833, class117.field1717, class228.field3637);
            int var9 = class140.field2165.method1794(class51.field773);
            for (int var10 = 0; var10 < class98.field1432; var10++) {
                int var11 = class140.field2165.method1794(class129.method901(var10, 3975));
                if (var9 < var11) {
                    var9 = var11;
                }
            }
            class117.field1717 = var9 + 8;
            class228.field3637 = class98.field1432 * 15 + 22;
        }
        if (class136.field2015 != -1) {
            class228.method1635(1, class136.field2015, 23);
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(I)V", line = 88)
    public static void method1458(int arg0) {
        field3337 = null;
        field3340 = null;
        if (arg0 < 81) {
            method1457((class187) null, (byte) 25, true);
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Z)Z", line = 113)
    public static final boolean method1459(boolean arg0) {
        field3336++;
        try {
            if (class199.field3199 == 2) {
                if (class312.field5265 == null) {
                    class312.field5265 = class7.method29(class301.field4874, class65.field994, class77.field1142);
                    if (class312.field5265 == null) {
                        return false;
                    }
                }
                if (class242.field3865 == null) {
                    class242.field3865 = new class133(class224.field3592, class169.field2689);
                }
                if (class210.field3379.method1051((byte) -57, class169.field2698, 22050, class242.field3865, class312.field5265)) {
                    class210.field3379.method1048(82);
                    class210.field3379.method1061(class298.field4829, (byte) 119);
                    class210.field3379.method1058(class312.field5265, -124, class60.field888);
                    class199.field3199 = 0;
                    class312.field5265 = null;
                    class301.field4874 = null;
                    class242.field3865 = null;
                    return true;
                }
            }
            if (!arg0) {
                method1457((class187) null, (byte) -25, true);
            }
        } catch (Exception var2) {
            var2.printStackTrace();
            class210.field3379.method1052((byte) -120);
            class242.field3865 = null;
            class312.field5265 = null;
            class301.field4874 = null;
            class199.field3199 = 0;
        }
        return false;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIIIIIBII)V", line = 165)
    public static final void method1460(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7, int arg8) {
        field3338++;
        int var9 = arg8 - arg5;
        int var10 = -9 / ((-arg6 - 9) / 44);
        int var11 = (arg0 - arg1 << 16) / var9;
        int var12 = arg7 - arg2;
        int var13 = (arg4 - arg3 << 16) / var12;
        class292.method2022(127, arg1, var11, arg5, var13, 0, arg7, arg3, 0, arg2, arg8);
    }
}
