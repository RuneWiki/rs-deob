import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dt")
public class class166 {

    @OriginalMember(owner = "client!dt", name = "b", descriptor = "Luv;")
    public static class2 field2466 = new class2(12, -2);

    @OriginalMember(owner = "client!dt", name = "g", descriptor = "Ldp;")
    public static class347 field2471 = new class347("Members object", "Gegenstand für Mitglieder", "Objet d'abonnés", "Objeto para membros");

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "I")
    public static int field2465;

    @OriginalMember(owner = "client!dt", name = "c", descriptor = "I")
    public static int field2467;

    @OriginalMember(owner = "client!dt", name = "d", descriptor = "I")
    public static int field2468;

    @OriginalMember(owner = "client!dt", name = "f", descriptor = "I")
    public static int field2470;

    @OriginalMember(owner = "client!dt", name = "e", descriptor = "Lok;")
    public static class74 field2469;

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(I)V")
    public static void method1157(int arg0) {
        if (arg0 != 0) {
            field2469 = null;
        }
        field2471 = null;
        field2466 = null;
        field2469 = null;
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(IZZIZ)V")
    public static final void method1158(int arg0, boolean arg1, boolean arg2, int arg3, boolean arg4) {
        class486.method2895(0, arg2, arg1, -10438, arg0, arg3, class96.field1495.length - 1);
        field2465++;
        class502.field7404 = 0;
        if (!arg4) {
            class300.field4467 = null;
        }
    }

    @OriginalMember(owner = "client!dt", name = "b", descriptor = "(I)V")
    public static final void method1159(int arg0) {
        field2467++;
        int var1 = class400.field5966.method2774(32);
        boolean var2 = class400.field5966.method2752((byte) -19) == 1;
        int var3 = class400.field5966.method2730(arg0 ^ 0xA90C5748);
        int var4 = class400.field5966.method2756((byte) 112);
        class311.field4830 = class400.field5966.method2765(arg0 ^ 0x75);
        class476.method2836(var4, -120);
        class400.field5966.method1826(arg0 + 30273);
        for (int var5 = 0; var5 < 4; var5++) {
            for (int var20 = 0; var20 < (class50.field640 >> 3); var20++) {
                for (int var21 = 0; var21 < class448.field6611 >> 3; var21++) {
                    int var22 = class400.field5966.method1823(1, 13255);
                    if (var22 == 1) {
                        class444.field6530[var5][var20][var21] = class400.field5966.method1823(26, 13255);
                    } else {
                        class444.field6530[var5][var20][var21] = -1;
                    }
                }
            }
        }
        class400.field5966.method1818(-101);
        int var6 = (class158.field2386 - class400.field5966.field6830) / 16;
        class23.field335 = new int[var6][4];
        for (int var7 = 0; var7 < var6; var7++) {
            for (int var19 = 0; var19 < 4; var19++) {
                class23.field335[var7][var19] = class400.field5966.method2722(false);
            }
        }
        class50.field639 = new byte[var6][];
        class180.field2659 = new int[var6];
        class230.field3231 = null;
        class163.field2433 = new int[var6];
        class451.field6630 = null;
        class495.field7349 = new int[var6];
        class229.field3226 = new byte[var6][];
        class27.field393 = new int[var6];
        class194.field2866 = new byte[var6][];
        class146.field2201 = new int[var6];
        class450.field6624 = new byte[var6][];
        int var8 = arg0;
        for (int var9 = 0; var9 < 4; var9++) {
            for (int var10 = 0; var10 < class50.field640 >> 3; var10++) {
                for (int var11 = 0; var11 < (class448.field6611 >> 3); var11++) {
                    int var12 = class444.field6530[var9][var10][var11];
                    if (var12 != -1) {
                        int var13 = var12 >> 14 & 0x3FF;
                        int var14 = (var12 & 0x3FFC) >> 3;
                        int var15 = (var13 / 8 << 8) + var14 / 8;
                        for (int var16 = 0; var16 < var8; var16++) {
                            if (class495.field7349[var16] == var15) {
                                var15 = -1;
                                break;
                            }
                        }
                        if (var15 != -1) {
                            class495.field7349[var8] = var15;
                            int var17 = var15 >> 8 & 0xFF;
                            int var18 = var15 & 0xFF;
                            class27.field393[var8] = class302.field4502.method539((byte) 27, "m" + var17 + "_" + var18);
                            class163.field2433[var8] = class302.field4502.method539((byte) 27, "l" + var17 + "_" + var18);
                            class146.field2201[var8] = class302.field4502.method539((byte) 27, "um" + var17 + "_" + var18);
                            class180.field2659[var8] = class302.field4502.method539((byte) 27, "ul" + var17 + "_" + var18);
                            var8++;
                        }
                    }
                }
            }
        }
        class498.method2963(10, (byte) 118, var1, var3, var2);
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(BI)I")
    public static final int method1160(byte arg0, int arg1) {
        field2468++;
        int var2 = arg1 & 0x3F;
        if (arg0 != -113) {
            return -38;
        }
        int var3 = arg1 >> 6 & 0x3;
        if (var2 == 18) {
            if (var3 == 0) {
                return 1;
            }
            if (var3 == 1) {
                return 2;
            }
            if (var3 == 2) {
                return 4;
            }
            if (var3 == 3) {
                return 8;
            }
        } else if (var2 == 19 || var2 == 21) {
            if (var3 == 0) {
                return 16;
            }
            if (var3 == 1) {
                return 32;
            }
            if (var3 == 2) {
                return 64;
            }
            if (var3 == 3) {
                return 128;
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(B)Z")
    public static final boolean method1161(byte arg0) {
        if (arg0 != -32) {
            return false;
        }
        field2470++;
        if (class134.field2005) {
            try {
                if ((Boolean) class331.method2049(class25.field375.field1611, "showingVideoAd", -3460)) {
                    return false;
                }
                return true;
            } catch (Throwable var1) {
            }
        }
        return true;
    }
}
