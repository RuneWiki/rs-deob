import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public class class286 extends class529 {

    @OriginalMember(owner = "client!s", name = "m", descriptor = "[B")
    public byte[] field4503;

    @OriginalMember(owner = "client!s", name = "p", descriptor = "Lnj;")
    public static class317 field4506 = new class317();

    @OriginalMember(owner = "client!s", name = "q", descriptor = "Lbi;")
    public static class104 field4507;

    @OriginalMember(owner = "client!s", name = "l", descriptor = "I")
    public static int field4502;

    @OriginalMember(owner = "client!s", name = "o", descriptor = "I")
    public static int field4505;

    @OriginalMember(owner = "client!s", name = "n", descriptor = "Lpc;")
    public static class192 field4504;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "([[BLhd;Z)V")
    public static final void method1929(byte[][] arg0, class242 arg1, boolean arg2) {
        field4502++;
        if (!arg2) {
            return;
        }
        for (int var3 = 0; var3 < arg1.field6995; var3++) {
            class500.method3052(0);
            for (int var4 = 0; var4 < (class135.field1839 >> 3); var4++) {
                for (int var5 = 0; var5 < (class197.field3038 >> 3); var5++) {
                    int var6 = class298.field4685[var3][var4][var5];
                    if (var6 != -1) {
                        int var7 = (var6 & 0x36B0BCA) >> 24;
                        if (!arg1.field6992 || var7 == 0) {
                            int var8 = var6 >> 1 & 0x3;
                            int var9 = var6 >> 14 & 0x3FF;
                            int var10 = var6 >> 3 & 0x7FF;
                            int var11 = (var9 / 8 << 8) + var10 / 8;
                            for (int var12 = 0; var12 < class529.field7782.length; var12++) {
                                if (class529.field7782[var12] == var11 && arg0[var12] != null) {
                                    arg1.method1686(var3, var5 * 8, class19.field198, (var10 & 0x7) * 8, arg0[var12], (var9 & 0x7) * 8, class352.field5488, (byte) -125, var8, var4 * 8, var7);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(I)V")
    public static void method1930(int arg0) {
        field4506 = null;
        field4504 = null;
        if (arg0 > -81) {
            field4507 = null;
        }
        field4507 = null;
    }

    @OriginalMember(owner = "client!s", name = "<init>", descriptor = "([B)V")
    public class286(byte[] arg0) {
        this.field4503 = arg0;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(ILgh;Z)V")
    public static final void method1931(int arg0, class350 arg1, boolean arg2) {
        field4505++;
        if (class501.field7514 >= 400) {
            return;
        }
        if (class358.field5565 != arg1) {
            String var9;
            if (arg1.field5448 == 0) {
                boolean var3 = true;
                if (class358.field5565.field5442 != -1 && arg1.field5442 != -1) {
                    int var4 = arg1.field5450 < class358.field5565.field5450 ? class358.field5565.field5450 : arg1.field5450;
                    int var5 = arg1.field5442 <= class358.field5565.field5442 ? arg1.field5442 : class358.field5565.field5442;
                    int var6 = var4 * 10 / 100 + var5 + 5;
                    int var7 = class358.field5565.field5450 - arg1.field5450;
                    if (var7 < 0) {
                        var7 = -var7;
                    }
                    if (var6 < var7) {
                        var3 = false;
                    }
                }
                String var8 = class516.field7674 == class261.field4216 ? class516.field7672.method1583(87, class12.field131) : class9.field97.method1583(arg0 + 15353, class12.field131);
                if (arg1.field5457 <= arg1.field5450) {
                    var9 = arg1.method2318(true, 255) + (var3 ? class385.method2481(class358.field5565.field5450, (byte) -44, arg1.field5450) : "<col=ffffff>") + " (" + var8 + arg1.field5450 + ")";
                } else {
                    var9 = arg1.method2318(true, 255) + (var3 ? class385.method2481(class358.field5565.field5450, (byte) -44, arg1.field5450) : "<col=ffffff>") + " (" + var8 + arg1.field5450 + "+" + (arg1.field5457 - arg1.field5450) + ")";
                }
            } else {
                var9 = arg1.method2318(true, 255) + " (" + class135.field1835.method1583(arg0 + 15348, class12.field131) + arg1.field5448 + ")";
            }
            if (class128.field1732) {
                if (!arg2 && (class535.field7838 & 0x8) != 0) {
                    class279.method1875((long) arg1.field847, 0, true, false, class283.field4459 + " -> <col=ffffff>" + var9, -1, 0, class427.field6450, arg0 ^ 0x3B98, 49, class186.field2716);
                    class177.field2596++;
                }
            } else if (arg2) {
                class279.method1875(0L, 0, false, true, "", 0, 0, "<col=cccccc>" + var9, arg0 ^ 0x3BFE, -1, -1);
            } else {
                for (int var10 = 7; var10 >= 0; var10--) {
                    if (class526.field7747[var10] != null) {
                        short var11 = 0;
                        if (class516.field7674 == class153.field2042 && class526.field7747[var10].equalsIgnoreCase(class228.field3802.method1583(122, class12.field131))) {
                            if (class358.field5565.field5450 < arg1.field5450) {
                                var11 = 2000;
                            }
                            if (class358.field5565.field5455 != 0 && arg1.field5455 != 0) {
                                if (class358.field5565.field5455 == arg1.field5455) {
                                    var11 = 2000;
                                } else {
                                    var11 = 0;
                                }
                            }
                        } else if (class426.field6444[var10]) {
                            var11 = 2000;
                        }
                        short var12 = (short) (class119.field1633[var10] + var11);
                        int var13 = class285.field4499[var10] == -1 ? class460.field7099 : class285.field4499[var10];
                        class279.method1875((long) arg1.field847, 0, true, false, "<col=ffffff>" + var9, -1, 0, class526.field7747[var10], -59, var12, var13);
                        class143.field1928++;
                    }
                }
            }
            if (arg0 != -15269) {
                method1931(29, null, false);
            }
            if (!arg2) {
                for (class140 var14 = (class140) class392.field5958.method2123(-31); var14 != null; var14 = (class140) class392.field5958.method2126((byte) 61)) {
                    if (var14.field1894 == 47) {
                        var14.field1902 = "<col=ffffff>" + var9;
                        return;
                    }
                }
            }
        } else if (class128.field1732 && (class535.field7838 & 0x10) != 0) {
            class279.method1875(0L, 0, true, false, class283.field4459 + " -> <col=ffffff>" + class392.field5948.method1583(99, class12.field131), -1, 0, class427.field6450, -110, 46, class186.field2716);
            class49.field624++;
        }
    }

    static {
        new class213("Your clan channel has now been disabled!", "Dein Chatraum ist jetzt ausgeschaltet.", "Votre canal de clan est désactivé.", "Seu canal de clã foi desativado!");
        field4507 = new class104(57, 8);
    }
}
