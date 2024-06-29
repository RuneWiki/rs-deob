import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pea")
public abstract class class457 {

    @OriginalMember(owner = "client!pea", name = "d", descriptor = "Lhr;")
    public static class57 field6509 = new class57(1, 2);

    @OriginalMember(owner = "client!pea", name = "a", descriptor = "I")
    public static int field6506;

    @OriginalMember(owner = "client!pea", name = "b", descriptor = "I")
    public static int field6507;

    @OriginalMember(owner = "client!pea", name = "c", descriptor = "I")
    public static int field6508;

    @OriginalMember(owner = "client!pea", name = "a", descriptor = "(II)Z")
    public abstract boolean method2780(int arg0, int arg1);

    @OriginalMember(owner = "client!pea", name = "a", descriptor = "(Z)V")
    public static void method2781(boolean arg0) {
        field6509 = null;
        if (arg0) {
            field6509 = null;
        }
    }

    @OriginalMember(owner = "client!pea", name = "a", descriptor = "(I)V")
    public abstract void method2782(int arg0);

    @OriginalMember(owner = "client!pea", name = "a", descriptor = "(B)V")
    public static final void method2783(byte arg0) {
        field6506++;
        if (class214.field3211 != null) {
            return;
        }
        int var1 = class658.field9423;
        if (arg0 != 76) {
            field6509 = null;
        }
        int var2 = class26.field232;
        int var3 = class291.field4016 - class68.field1042 - var1;
        int var4 = class443.field6318 - class565.field8187 - var2;
        if (var1 <= 0 && var3 <= 0 && var2 <= 0 && var4 <= 0) {
            return;
        }
        try {
            Container var5;
            if (class696.field9834 != null) {
                var5 = class696.field9834;
            } else if (class486.field6999 == null) {
                var5 = class181.field2502;
            } else {
                var5 = class486.field6999;
            }
            int var6 = 0;
            int var7 = 0;
            if (class696.field9834 == var5) {
                Insets var8 = class696.field9834.getInsets();
                var6 = var8.left;
                var7 = var8.top;
            }
            Graphics var9 = var5.getGraphics();
            var9.setColor(Color.black);
            if (var1 > 0) {
                var9.fillRect(var6, var7, var1, class443.field6318);
            }
            if (var2 > 0) {
                var9.fillRect(var6, var7, class291.field4016, var2);
            }
            if (var3 > 0) {
                var9.fillRect(class291.field4016 + var6 - var3, var7, var3, class443.field6318);
            }
            if (var4 > 0) {
                var9.fillRect(var6, var7 + class443.field6318 - var4, class291.field4016, var4);
                return;
            }
        } catch (Exception var10) {
            return;
        }
    }

    @OriginalMember(owner = "client!pea", name = "b", descriptor = "(Z)V")
    public abstract void method2784(boolean arg0);

    @OriginalMember(owner = "client!pea", name = "b", descriptor = "(I)Lcca;")
    public abstract class462 method2785(int arg0);

    @OriginalMember(owner = "client!pea", name = "a", descriptor = "(BLl;Z)V")
    public static final void method2786(byte arg0, class639 arg1, boolean arg2) {
        field6507++;
        if (class456.field6499 >= 400) {
            return;
        }
        if (class108.field1536 != arg1) {
            String var9;
            if (arg1.field9045 == 0) {
                boolean var3 = true;
                if (class108.field1536.field9085 != -1 && arg1.field9085 != -1) {
                    int var4 = arg1.field9069 >= class108.field1536.field9069 ? arg1.field9069 : class108.field1536.field9069;
                    int var5 = class108.field1536.field9085 < arg1.field9085 ? class108.field1536.field9085 : arg1.field9085;
                    int var6 = var4 * 10 / 100 + var5 + 5;
                    int var7 = class108.field1536.field9069 - arg1.field9069;
                    if (var7 < 0) {
                        var7 = -var7;
                    }
                    if (var7 > var6) {
                        var3 = false;
                    }
                }
                String var8 = class528.field7683 == class48.field790 ? class608.field8650.method3543(-24350, class45.field748) : class608.field8648.method3543(-24350, class45.field748);
                if (arg1.field9069 >= arg1.field9082) {
                    var9 = arg1.method3694((byte) -83, true) + (var3 ? class19.method93((byte) -105, arg1.field9069, class108.field1536.field9069) : "<col=ffffff>") + " (" + var8 + arg1.field9069 + ")";
                } else {
                    var9 = arg1.method3694((byte) -118, true) + (var3 ? class19.method93((byte) -105, arg1.field9069, class108.field1536.field9069) : "<col=ffffff>") + " (" + var8 + arg1.field9069 + "+" + (arg1.field9082 - arg1.field9069) + ")";
                }
            } else if (arg1.field9045 == -1) {
                var9 = arg1.method3694((byte) -120, true);
            } else {
                var9 = arg1.method3694((byte) -114, true) + " (" + class608.field8649.method3543(-24350, class45.field748) + arg1.field9045 + ")";
            }
            if (class549.field7997 && !arg2 && (class538.field7820 & 0x8) != 0) {
                class145.method1016(class297.field4060, true, 0, false, class377.field5459 + " -> <col=ffffff>" + var9, -125, 0, (long) arg1.field4592, class243.field3582, (long) arg1.field4592, 22, -1, false);
                class375.field5420++;
            }
            if (arg2) {
                class145.method1016("<col=cccccc>" + var9, false, 0, false, "", -126, 0, (long) arg1.field4592, -1, 0L, -1, 0, true);
            } else {
                for (int var10 = 7; var10 >= 0; var10--) {
                    if (class472.field6700[var10] != null) {
                        short var11 = 0;
                        if (class528.field7683 == class391.field5635 && class472.field6700[var10].equalsIgnoreCase(class608.field8643.method3543(-24350, class45.field748))) {
                            if (class108.field1536.field9069 < arg1.field9069) {
                                var11 = 2000;
                            }
                            if (class108.field1536.field9066 != 0 && arg1.field9066 != 0) {
                                if (class108.field1536.field9066 == arg1.field9066) {
                                    var11 = 2000;
                                } else {
                                    var11 = 0;
                                }
                            }
                        } else if (class393.field5652[var10]) {
                            var11 = 2000;
                        }
                        short var12 = (short) (class606.field8601[var10] + var11);
                        int var13 = class726.field10201[var10] == -1 ? class474.field6744 : class726.field10201[var10];
                        class4.field25++;
                        class145.method1016(class472.field6700[var10], true, 0, false, "<col=ffffff>" + var9, -118, 0, (long) arg1.field4592, var13, (long) arg1.field4592, var12, -1, false);
                    }
                }
            }
            int var14 = 91 % ((arg0 + 51) / 63);
            if (!arg2) {
                for (class304 var15 = (class304) class303.field4137.method3565(-67); var15 != null; var15 = (class304) class303.field4137.method3561((byte) 120)) {
                    if (var15.field4152 == 5) {
                        var15.field4160 = "<col=ffffff>" + var9;
                        return;
                    }
                }
            }
        } else if (class549.field7997 && (class538.field7820 & 0x10) != 0) {
            class13.field137++;
            class145.method1016(class297.field4060, true, 0, false, class377.field5459 + " -> <col=ffffff>" + class608.field8657.method3543(-24350, class45.field748), -118, 0, (long) arg1.field4592, class243.field3582, 0L, 23, -1, false);
        }
    }
}
