import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class241 {

    @OriginalMember(owner = "client!f", name = "a", descriptor = "I")
    public static int field3840;

    @OriginalMember(owner = "client!f", name = "b", descriptor = "I")
    public static int field3841;

    @OriginalMember(owner = "client!f", name = "c", descriptor = "I")
    public static int field3842;

    @OriginalMember(owner = "client!f", name = "e", descriptor = "I")
    public static int field3844;

    @OriginalMember(owner = "client!f", name = "h", descriptor = "I")
    public static int field3847;

    @OriginalMember(owner = "client!f", name = "j", descriptor = "I")
    public static int field3849;

    @OriginalMember(owner = "client!f", name = "g", descriptor = "Ldk;")
    public static class251 field3846;

    @OriginalMember(owner = "client!f", name = "d", descriptor = "[I")
    public static int[] field3843;

    @OriginalMember(owner = "client!f", name = "f", descriptor = "[Lbl;")
    public static class146[] field3845;

    @OriginalMember(owner = "client!f", name = "i", descriptor = "[[S")
    public static short[][] field3848;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(ZI)V")
    public static final void method1620(boolean arg0, int arg1) {
        field3840++;
        if (arg0) {
            if (class22.field284 != -1) {
                class53.method370(1, class22.field284);
            }
            for (class97 var2 = (class97) class244.field3880.method1063(-111); var2 != null; var2 = (class97) class244.field3880.method1055(18178)) {
                class285.method1897(var2, 107, true);
            }
            class22.field284 = -1;
            class244.field3880 = new class155(8);
            class309.method2064((byte) -29);
            class22.field284 = class296.field4722;
            class278.method1875(arg1 ^ 0x2377, false);
            class145.method1014(0);
            class81.method557((byte) -72, class22.field284);
        }
        class92.field1481 = -1;
        class211.method1466(class68.field1121, false);
        class239.field3829 = new class299();
        if (arg1 != 9083) {
            return;
        }
        class239.field3829.field637 = 3000;
        class239.field3829.field710 = 3000;
        if (class299.field4792 == 0) {
            class78.method534(class160.field2541, 0);
            class262.method1760(10, -125);
            return;
        }
        if (class120.field1919 == 2) {
            class148.field2314 = class50.field853 << 7;
            class104.field1666 = class170.field2762 << 7;
        } else {
            class39.method247(10);
        }
        class218.method1510((byte) 116);
        class262.method1760(28, arg1 ^ 0xFFFFDCEA);
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(B[B)V")
    public static final void method1621(byte arg0, byte[] arg1) {
        field3844++;
        class162 var2 = new class162(arg1);
        var2.field2568 = arg1.length - 2;
        class183.field3014 = var2.method1142(-18970);
        class84.field1389 = new boolean[class183.field3014];
        class314.field5058 = new int[class183.field3014];
        class187.field3044 = new byte[class183.field3014][];
        class60.field976 = new int[class183.field3014];
        class246.field3916 = new int[class183.field3014];
        class70.field1192 = new byte[class183.field3014][];
        class273.field4380 = new int[class183.field3014];
        var2.field2568 = arg1.length - (class183.field3014 * 8) - 7;
        class255.field4128 = var2.method1142(-18970);
        if (arg0 > -42) {
            return;
        }
        class111.field1749 = var2.method1142(-18970);
        int var3 = (var2.method1133((byte) 53) & 0xFF) + 1;
        for (int var4 = 0; var4 < class183.field3014; var4++) {
            class273.field4380[var4] = var2.method1142(-18970);
        }
        for (int var5 = 0; var5 < class183.field3014; var5++) {
            class314.field5058[var5] = var2.method1142(-18970);
        }
        for (int var6 = 0; var6 < class183.field3014; var6++) {
            class246.field3916[var6] = var2.method1142(-18970);
        }
        for (int var7 = 0; var7 < class183.field3014; var7++) {
            class60.field976[var7] = var2.method1142(-18970);
        }
        var2.field2568 = arg1.length - (7 - (3 - (class183.field3014 * 8) - (var3 * 3)));
        class243.field3870 = new int[var3];
        for (int var8 = 1; var8 < var3; var8++) {
            class243.field3870[var8] = var2.method1137(31155);
            if (class243.field3870[var8] == 0) {
                class243.field3870[var8] = 1;
            }
        }
        var2.field2568 = 0;
        for (int var9 = 0; var9 < class183.field3014; var9++) {
            int var10 = class246.field3916[var9];
            int var11 = class60.field976[var9];
            int var12 = var10 * var11;
            byte[] var13 = new byte[var12];
            boolean var14 = false;
            class70.field1192[var9] = var13;
            byte[] var15 = new byte[var12];
            class187.field3044[var9] = var15;
            int var16 = var2.method1133((byte) 53);
            if ((var16 & 0x1) == 0) {
                for (int var22 = 0; var22 < var12; var22++) {
                    var13[var22] = var2.method1107((byte) -84);
                }
                if ((var16 & 0x2) != 0) {
                    for (int var23 = 0; var23 < var12; var23++) {
                        byte var24 = var15[var23] = var2.method1107((byte) -112);
                        var14 |= var24 != -1;
                    }
                }
            } else {
                int var17 = 0;
                label92: while (true) {
                    if (var10 <= var17) {
                        if ((var16 & 0x2) == 0) {
                            break;
                        }
                        int var18 = 0;
                        while (true) {
                            if (var10 <= var18) {
                                break label92;
                            }
                            for (int var19 = 0; var19 < var11; var19++) {
                                byte var20 = var15[var10 * var19 + var18] = var2.method1107((byte) -119);
                                var14 |= var20 != -1;
                            }
                            var18++;
                        }
                    }
                    for (int var21 = 0; var21 < var11; var21++) {
                        var13[var17 + (var10 * var21)] = var2.method1107((byte) -75);
                    }
                    var17++;
                }
            }
            class84.field1389[var9] = var14;
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(BLag;)Lag;")
    public static final class211 method1622(byte arg0, class211 arg1) {
        field3847++;
        if (arg1.field3395 != -1) {
            return class17.method87(arg1.field3395, -20055);
        }
        int var2 = arg1.field3375 >>> 16;
        class89 var3 = new class89(class244.field3880);
        for (class97 var4 = (class97) var3.method604(1); var4 != null; var4 = (class97) var3.method605(-53)) {
            if (var4.field1556 == var2) {
                return class17.method87((int) var4.field2012, -20055);
            }
        }
        if (arg0 != -17) {
            field3846 = null;
        }
        return null;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(I)V")
    public static void method1623(int arg0) {
        field3846 = null;
        int var1 = -95 / ((-arg0 - 74) / 36);
        field3845 = null;
        field3843 = null;
        field3848 = null;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Z)V")
    public static final void method1624(boolean arg0) {
        field3842++;
        if (class275.field4418 < class275.field4409) {
            class275.field4418 = (float) ((double) class275.field4418 / 30.0D + (double) class275.field4418);
            if (class275.field4409 < class275.field4418) {
                class275.field4418 = class275.field4409;
            }
            class132.method934(0);
        } else if (class275.field4409 < class275.field4418) {
            class275.field4418 = (float) ((double) class275.field4418 - (double) class275.field4418 / 30.0D);
            if (class275.field4418 < class275.field4409) {
                class275.field4418 = class275.field4409;
            }
            class132.method934(0);
        }
        if (class301.field4815 != -1 && class68.field1132 != -1) {
            int var1 = class68.field1132 - class129.field2029;
            int var2 = class301.field4815 - class247.field3934;
            if (var2 < 2 || var2 > 2) {
                var2 >>= 0x4;
            }
            class247.field3934 += var2;
            if (var1 < 2 || var1 > 2) {
                var1 >>= 0x4;
            }
            if (var2 == 0 && var1 == 0) {
                class68.field1132 = -1;
                class301.field4815 = -1;
            }
            class129.field2029 -= -var1;
            class132.method934(0);
        }
        if (class274.field4401 <= 0) {
            class26.field331 = -1;
            class119.field1907 = -1;
        } else {
            class98.field1584--;
            if (class98.field1584 == 0) {
                class98.field1584 = 100;
                class274.field4401--;
            }
        }
        if (class269.field4345 && class94.field1523 != null) {
            for (class18 var3 = (class18) class94.field1523.method1643((byte) 127); var3 != null; var3 = (class18) class94.field1523.method1642((byte) 99)) {
                class50 var4 = class49.method346(var3.field219.field4333, (byte) 119);
                if (class143.field2270 == 0 && var3.method93(class77.field1281, class269.field4344, (byte) 39)) {
                    if (!var3.field219.field4326) {
                        var3.field219.field4326 = true;
                        class255.method1720((byte) 127, var3.field219.field4333, var4.field845, 15);
                    }
                    if (var3.field219.field4326) {
                        class255.method1720((byte) 121, var3.field219.field4333, var4.field845, 17);
                    }
                } else if (var3.field219.field4326) {
                    var3.field219.field4326 = false;
                    class255.method1720((byte) 123, var3.field219.field4333, var4.field845, 16);
                }
            }
        }
        if (arg0) {
            field3843 = null;
        }
    }

    @OriginalMember(owner = "client!f", name = "b", descriptor = "(I)V")
    public static final void method1625(int arg0) {
        class308.field4923.method1257(-104);
        if (arg0 >= -10) {
            method1624(false);
        }
        field3849++;
    }
}
