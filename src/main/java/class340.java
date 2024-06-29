import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class340 extends class270 {

    @OriginalMember(owner = "client!jb", name = "F", descriptor = "Lvp;")
    public class123 field4856 = new class123();

    @OriginalMember(owner = "client!jb", name = "G", descriptor = "Ldf;")
    public class274 field4857 = new class274();

    @OriginalMember(owner = "client!jb", name = "B", descriptor = "Ls;")
    private class183 field4852;

    @OriginalMember(owner = "client!jb", name = "E", descriptor = "Llt;")
    public static class475 field4855 = new class475("Loading title screen - ", "Lade Titelbild - ", "Chargement de l'écran-titre - ", "Carregando tela título - ");

    @OriginalMember(owner = "client!jb", name = "s", descriptor = "I")
    public static int field4843;

    @OriginalMember(owner = "client!jb", name = "t", descriptor = "I")
    public static int field4844;

    @OriginalMember(owner = "client!jb", name = "u", descriptor = "I")
    public static int field4845;

    @OriginalMember(owner = "client!jb", name = "v", descriptor = "I")
    public static int field4846;

    @OriginalMember(owner = "client!jb", name = "w", descriptor = "I")
    public static int field4847;

    @OriginalMember(owner = "client!jb", name = "x", descriptor = "I")
    public static int field4848;

    @OriginalMember(owner = "client!jb", name = "y", descriptor = "I")
    public static int field4849;

    @OriginalMember(owner = "client!jb", name = "z", descriptor = "I")
    public static int field4850;

    @OriginalMember(owner = "client!jb", name = "A", descriptor = "I")
    public static int field4851;

    @OriginalMember(owner = "client!jb", name = "C", descriptor = "I")
    public static int field4853;

    @OriginalMember(owner = "client!jb", name = "D", descriptor = "I")
    public static int field4854;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(II[IIILsd;)V")
    private final void method2077(int arg0, int arg1, int[] arg2, int arg3, int arg4, class61 arg5) {
        if (arg1 < 42) {
            this.field4856 = null;
        }
        if ((this.field4852.field2717[arg5.field906] & 0x4) != 0 && arg5.field916 < 0) {
            int var7 = this.field4852.field2672[arg5.field906] / class366.field5600;
            while (true) {
                int var8 = (var7 + 1048575 - arg5.field917) / var7;
                if (arg0 < var8) {
                    arg5.field917 += arg0 * var7;
                    break;
                }
                arg5.field922.method583(arg2, arg4, var8);
                arg4 += var8;
                arg0 -= var8;
                arg5.field917 += var7 * var8 - 1048576;
                int var9 = class366.field5600 / 100;
                int var10 = 262144 / var7;
                if (var10 < var9) {
                    var9 = var10;
                }
                class97 var11 = arg5.field922;
                if (this.field4852.field2722[arg5.field906] == 0) {
                    arg5.field922 = class97.method559(arg5.field923, var11.method572(), var11.method589(), var11.method570());
                } else {
                    arg5.field922 = class97.method559(arg5.field923, var11.method572(), 0, var11.method570());
                    this.field4852.method1261(96, arg5, arg5.field915.field788[arg5.field914] < 0);
                    arg5.field922.method567(var9, var11.method589());
                }
                if (arg5.field915.field788[arg5.field914] < 0) {
                    arg5.field922.method588(-1);
                }
                var11.method595(var9);
                var11.method583(arg2, arg4, arg3 - arg4);
                if (var11.method562()) {
                    this.field4857.method1792(var11);
                }
            }
        }
        field4849++;
        arg5.field922.method583(arg2, arg4, arg0);
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(ILoq;Z)V")
    public static final void method2078(int arg0, class239 arg1, boolean arg2) {
        field4847++;
        if (class450.field6706 >= 400) {
            return;
        }
        if (class500.field7365 != arg1) {
            int var3 = 106 / ((arg0 - 36) / 37);
            String var4;
            if (arg1.field3542 == 0) {
                boolean var5 = true;
                if (class500.field7365.field3540 != -1 && arg1.field3540 != -1) {
                    int var6 = arg1.field3529 < class500.field7365.field3529 ? class500.field7365.field3529 : arg1.field3529;
                    int var7 = arg1.field3540 > class500.field7365.field3540 ? class500.field7365.field3540 : arg1.field3540;
                    int var8 = var7 + (var6 * 10 / 100) + 5;
                    int var9 = class500.field7365.field3529 - arg1.field3529;
                    if (var9 < 0) {
                        var9 = -var9;
                    }
                    if (var9 > var8) {
                        var5 = false;
                    }
                }
                String var10 = class359.field5513 == class183.field2707 ? class30.field321.method2838(false, class143.field2137) : class98.field1442.method2838(false, class143.field2137);
                if (arg1.field3530 > arg1.field3529) {
                    var4 = arg1.method1619(182029155, true) + (var5 ? class366.method2272(arg1.field3529, class500.field7365.field3529, 9) : "<col=ffffff>") + " (" + var10 + arg1.field3529 + "+" + (arg1.field3530 - arg1.field3529) + ")";
                } else {
                    var4 = arg1.method1619(182029155, true) + (var5 ? class366.method2272(arg1.field3529, class500.field7365.field3529, 9) : "<col=ffffff>") + " (" + var10 + arg1.field3529 + ")";
                }
            } else {
                var4 = arg1.method1619(182029155, true) + " (" + class459.field6786.method2838(false, class143.field2137) + arg1.field3542 + ")";
            }
            if (class61.field932) {
                if (!arg2 && (class217.field3177 & 0x8) != 0) {
                    class496.method2976(false, 0, (long) arg1.field1942, class187.field2779 + " -> <col=ffffff>" + var4, class213.field3114, true, class509.field7432, -1, -113, 0, 4);
                    class403.field6074++;
                }
            } else if (arg2) {
                class496.method2976(true, 0, 0L, "", -1, false, "<col=cccccc>" + var4, 0, -127, 0, -1);
            } else {
                for (int var11 = 7; var11 >= 0; var11--) {
                    if (class172.field2536[var11] != null) {
                        short var13 = 0;
                        if (class26.field273 == class183.field2707 && class172.field2536[var11].equalsIgnoreCase(class23.field238.method2838(false, class143.field2137))) {
                            if (class500.field7365.field3529 < arg1.field3529) {
                                var13 = 2000;
                            }
                            if (class500.field7365.field3518 != 0 && arg1.field3518 != 0) {
                                if (class500.field7365.field3518 == arg1.field3518) {
                                    var13 = 2000;
                                } else {
                                    var13 = 0;
                                }
                            }
                        } else if (class100.field1455[var11]) {
                            var13 = 2000;
                        }
                        short var14 = (short) (class490.field7239[var11] + var13);
                        int var15 = class522.field7722[var11] == -1 ? class413.field6213 : class522.field7722[var11];
                        class496.method2976(false, 0, (long) arg1.field1942, "<col=ffffff>" + var4, var15, true, class172.field2536[var11], -1, -123, 0, var14);
                        class312.field4469++;
                    }
                }
            }
            if (!arg2) {
                for (class118 var12 = (class118) class312.field4467.method816(112); var12 != null; var12 = (class118) class312.field4467.method812(107)) {
                    if (var12.field1781 == 5) {
                        var12.field1778 = "<col=ffffff>" + var4;
                        return;
                    }
                }
            }
        } else if (class61.field932 && (class217.field3177 & 0x10) != 0) {
            class496.method2976(false, 0, 0L, class187.field2779 + " -> <col=ffffff>" + class258.field3809.method2838(false, class143.field2137), class213.field3114, true, class509.field7432, -1, -126, 0, 19);
            class421.field6331++;
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "()Lhf;")
    public final class270 method585() {
        field4854++;
        class61 var1;
        do {
            var1 = (class61) this.field4856.method812(109);
            if (var1 == null) {
                return null;
            }
        } while (var1.field922 == null);
        return var1.field922;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "([III)V")
    public final void method583(int[] arg0, int arg1, int arg2) {
        field4848++;
        this.field4857.method583(arg0, arg1, arg2);
        for (class61 var4 = (class61) this.field4856.method816(124); var4 != null; var4 = (class61) this.field4856.method812(106)) {
            if (!this.field4852.method1250((byte) -4, var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field926) {
                        this.method2077(var6, 91, arg0, var5 + var6, var5, var4);
                        var4.field926 -= var6;
                        break;
                    }
                    this.method2077(var4.field926, 100, arg0, var5 + var6, var5, var4);
                    var6 -= var4.field926;
                    var5 += var4.field926;
                } while (!this.field4852.method1252(var4, var5, arg0, (byte) 102, var6));
            }
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(B)V")
    public static void method2079(byte arg0) {
        field4855 = null;
        if (arg0 >= -54) {
            field4855 = null;
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(I)V")
    public final void method566(int arg0) {
        this.field4857.method566(arg0);
        field4843++;
        for (class61 var2 = (class61) this.field4856.method816(102); var2 != null; var2 = (class61) this.field4856.method812(105)) {
            if (!this.field4852.method1250((byte) -126, var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field926) {
                        this.method2082(var3, var2, true);
                        var2.field926 -= var3;
                        break;
                    }
                    this.method2082(var2.field926, var2, true);
                    var3 -= var2.field926;
                } while (!this.field4852.method1252(var2, 0, null, (byte) 85, var3));
            }
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIII)V")
    public static final void method2080(int arg0, int arg1, int arg2, int arg3) {
        field4850++;
        class356.field5471.method1415(arg0, (byte) -61);
        if (arg1 != -1) {
            method2080(45, 71, 87, 14);
        }
        class356.field5471.method1429((byte) 95, arg2);
        class356.field5471.method1439(-96, arg3);
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lvg;Lvg;I)V")
    public static final void method2081(class38 arg0, class38 arg1, int arg2) {
        class291.method1861((byte) -104, class179.field2634);
        class32.field343++;
        field4846++;
        class356.field5471.method1415(arg0.field467, (byte) -80);
        class356.field5471.method1429((byte) -55, arg1.field547);
        class356.field5471.method1413(-116, arg1.field535);
        class356.field5471.method1457((byte) 57, arg1.field467);
        if (arg2 != 7) {
            method2078(-6, null, false);
        }
        class356.field5471.method1439(102, arg0.field535);
        class356.field5471.method1439(119, arg0.field547);
    }

    @OriginalMember(owner = "client!jb", name = "d", descriptor = "()I")
    public final int method576() {
        field4844++;
        return 0;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(ILsd;Z)V")
    private final void method2082(int arg0, class61 arg1, boolean arg2) {
        field4851++;
        if ((this.field4852.field2717[arg1.field906] & 0x4) != 0 && arg1.field916 < 0) {
            int var4 = this.field4852.field2672[arg1.field906] / class366.field5600;
            int var5 = (var4 + 1048575 - arg1.field917) / var4;
            arg1.field917 = arg0 * var4 + arg1.field917 & 0xFFFFF;
            if (arg0 >= var5) {
                if (this.field4852.field2722[arg1.field906] == 0) {
                    arg1.field922 = class97.method559(arg1.field923, arg1.field922.method572(), arg1.field922.method589(), arg1.field922.method570());
                } else {
                    arg1.field922 = class97.method559(arg1.field923, arg1.field922.method572(), 0, arg1.field922.method570());
                    this.field4852.method1261(85, arg1, arg1.field915.field788[arg1.field914] < 0);
                }
                if (arg1.field915.field788[arg1.field914] < 0) {
                    arg1.field922.method588(-1);
                }
                arg0 = arg1.field917 / var4;
            }
        }
        arg1.field922.method566(arg0);
        if (!arg2) {
            this.method585();
        }
    }

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "()Lhf;")
    public final class270 method563() {
        field4845++;
        class61 var1 = (class61) this.field4856.method816(114);
        if (var1 == null) {
            return null;
        } else if (var1.field922 == null) {
            return this.method585();
        } else {
            return var1.field922;
        }
    }

    @OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(Ls;)V")
    public class340(class183 arg0) {
        this.field4852 = arg0;
    }
}
