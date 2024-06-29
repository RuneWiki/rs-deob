import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class181 extends class50 {

    @OriginalMember(owner = "client!ia", name = "D", descriptor = "Lag;")
    public class97 field2590 = new class97();

    @OriginalMember(owner = "client!ia", name = "F", descriptor = "Llj;")
    public class41 field2592 = new class41();

    @OriginalMember(owner = "client!ia", name = "C", descriptor = "Lv;")
    private class61 field2589;

    @OriginalMember(owner = "client!ia", name = "w", descriptor = "Ljava/lang/String;")
    public static String field2583 = "white:";

    @OriginalMember(owner = "client!ia", name = "I", descriptor = "Lqd;")
    public static class37 field2595 = new class37(100);

    @OriginalMember(owner = "client!ia", name = "L", descriptor = "Ljava/lang/String;")
    public static String field2598 = "RuneScape is loading - please wait...";

    @OriginalMember(owner = "client!ia", name = "J", descriptor = "Lqd;")
    public static class37 field2596 = new class37(64);

    @OriginalMember(owner = "client!ia", name = "t", descriptor = "I")
    public static int field2580;

    @OriginalMember(owner = "client!ia", name = "u", descriptor = "I")
    public static int field2581;

    @OriginalMember(owner = "client!ia", name = "v", descriptor = "I")
    public static int field2582;

    @OriginalMember(owner = "client!ia", name = "x", descriptor = "I")
    public static int field2584;

    @OriginalMember(owner = "client!ia", name = "y", descriptor = "I")
    public static int field2585;

    @OriginalMember(owner = "client!ia", name = "z", descriptor = "I")
    public static int field2586;

    @OriginalMember(owner = "client!ia", name = "A", descriptor = "I")
    public static int field2587;

    @OriginalMember(owner = "client!ia", name = "B", descriptor = "I")
    public static int field2588;

    @OriginalMember(owner = "client!ia", name = "E", descriptor = "I")
    public static int field2591;

    @OriginalMember(owner = "client!ia", name = "G", descriptor = "I")
    public static int field2593;

    @OriginalMember(owner = "client!ia", name = "H", descriptor = "I")
    public static int field2594;

    @OriginalMember(owner = "client!ia", name = "K", descriptor = "Lve;")
    public static class233 field2597;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "([III)V")
    public final void method277(int[] arg0, int arg1, int arg2) {
        field2581++;
        this.field2592.method277(arg0, arg1, arg2);
        for (class191 var4 = (class191) this.field2590.method656(120); var4 != null; var4 = (class191) this.field2590.method650(126)) {
            if (!this.field2589.method432(var4, 0)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field2728) {
                        this.method1169(arg0, var6, var4, var5, var5 + var6, 48);
                        var4.field2728 -= var6;
                        break;
                    }
                    this.method1169(arg0, var4.field2728, var4, var5, var5 + var6, 1);
                    var6 -= var4.field2728;
                    var5 += var4.field2728;
                } while (!this.field2589.method400(2, var5, var4, arg0, var6));
            }
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "([IILli;III)V")
    private final void method1169(int[] arg0, int arg1, class191 arg2, int arg3, int arg4, int arg5) {
        int var7 = -106 / ((-arg5 - 43) / 44);
        if ((this.field2589.field920[arg2.field2720] & 0x4) != 0 && arg2.field2718 < 0) {
            int var8 = this.field2589.field935[arg2.field2720] / class276.field4426;
            while (true) {
                int var9 = (var8 + 1048575 - arg2.field2719) / var8;
                if (var9 > arg1) {
                    arg2.field2719 += arg1 * var8;
                    break;
                }
                arg2.field2724.method277(arg0, arg3, var9);
                arg2.field2719 += var8 * var9 - 1048576;
                int var10 = class276.field4426 / 100;
                arg3 += var9;
                int var11 = 262144 / var8;
                class252 var12 = arg2.field2724;
                arg1 -= var9;
                if (var10 > var11) {
                    var10 = var11;
                }
                if (this.field2589.field937[arg2.field2720] == 0) {
                    arg2.field2724 = class252.method1675(arg2.field2715, var12.method1685(), var12.method1662(), var12.method1687());
                } else {
                    arg2.field2724 = class252.method1675(arg2.field2715, var12.method1685(), 0, var12.method1687());
                    this.field2589.method424((byte) 76, arg2.field2730.field1988[arg2.field2717] < 0, arg2);
                    arg2.field2724.method1695(var10, var12.method1662());
                }
                if (arg2.field2730.field1988[arg2.field2717] < 0) {
                    arg2.field2724.method1673(-1);
                }
                var12.method1672(var10);
                var12.method277(arg0, arg3, arg4 - arg3);
                if (var12.method1692()) {
                    this.field2592.method275(var12);
                }
            }
        }
        field2580++;
        arg2.field2724.method277(arg0, arg3, arg1);
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method1170(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        for (int var9 = 0; var9 < class168.field2440.field1204; var9++) {
            if (class168.field2440.method518(var9, (byte) 29)) {
                int var10 = class63.field1009 + class54.field828 - class168.field2440.field1201[var9] - 1;
                int var11 = class168.field2440.field1200[var9] - class212.field3040;
                int var12 = (arg5 - arg0) * (var11 - arg1) / (arg8 - arg1) + arg0;
                int var13 = class168.field2440.method514(-24866, var9);
                int var14 = (arg3 - arg7) * (var10 - arg6) / (arg2 - arg6) + arg7;
                class11 var15 = null;
                int var16 = 16777215;
                if (var13 == 0) {
                    if ((double) class276.field4428 == 3.0D) {
                        var15 = class118.field1742;
                    }
                    if ((double) class276.field4428 == 4.0D) {
                        var15 = class224.field3355;
                    }
                    if ((double) class276.field4428 == 6.0D) {
                        var15 = class212.field3045;
                    }
                    if ((double) class276.field4428 >= 8.0D) {
                        var15 = class155.field2271;
                    }
                }
                if (var13 == 1) {
                    if ((double) class276.field4428 == 3.0D) {
                        var15 = class212.field3045;
                    }
                    if ((double) class276.field4428 == 4.0D) {
                        var15 = class155.field2271;
                    }
                    if ((double) class276.field4428 == 6.0D) {
                        var15 = class288.field4563;
                    }
                    if ((double) class276.field4428 >= 8.0D) {
                        var15 = class93.field1425;
                    }
                }
                if (var13 == 2) {
                    if ((double) class276.field4428 == 3.0D) {
                        var15 = class288.field4563;
                    }
                    if ((double) class276.field4428 == 4.0D) {
                        var15 = class93.field1425;
                    }
                    var16 = 16755200;
                    if ((double) class276.field4428 == 6.0D) {
                        var15 = class162.field2338;
                    }
                    if ((double) class276.field4428 >= 8.0D) {
                        var15 = class94.field1427;
                    }
                }
                if (class168.field2440.field1213[var9] != -1) {
                    var16 = class168.field2440.field1213[var9];
                }
                if (var15 != null) {
                    int var17 = class134.field1948.method1288(class168.field2440.field1203[var9], (int[]) null, class75.field1168);
                    int var18 = var14 - (var17 - 1) * var15.method98() / 2;
                    int var19 = var18 + var15.method94() / 2;
                    for (int var20 = 0; var20 < var17; var20++) {
                        String var21 = class75.field1168[var20];
                        if (var20 < var17 - 1) {
                            var21 = var21.substring(0, var21.length() - 4);
                        }
                        var15.method97(var21, var12, var19, var16, true);
                        var19 += var15.method98();
                    }
                }
            }
        }
        if (arg4 >= -45) {
            method1174(91, true);
        }
        field2588++;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(B)V")
    public static void method1171(byte arg0) {
        field2595 = null;
        field2597 = null;
        field2596 = null;
        field2598 = null;
        field2583 = null;
        if (arg0 > -106) {
            field2595 = null;
        }
    }

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "(I)V")
    public final void method281(int arg0) {
        field2586++;
        this.field2592.method281(arg0);
        for (class191 var2 = (class191) this.field2590.method656(111); var2 != null; var2 = (class191) this.field2590.method650(126)) {
            if (!this.field2589.method432(var2, 0)) {
                int var3 = arg0;
                do {
                    if (var2.field2728 >= var3) {
                        this.method1173(var2, -1, var3);
                        var2.field2728 -= var3;
                        break;
                    }
                    this.method1173(var2, -1, var2.field2728);
                    var3 -= var2.field2728;
                } while (!this.field2589.method400(2, 0, var2, (int[]) null, var3));
            }
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "()Lfb;")
    public final class50 method276() {
        class191 var1 = (class191) this.field2590.method656(101);
        field2585++;
        if (var1 == null) {
            return null;
        } else if (var1.field2724 == null) {
            return this.method283();
        } else {
            return var1.field2724;
        }
    }

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "()Lfb;")
    public final class50 method283() {
        field2591++;
        class191 var1;
        do {
            var1 = (class191) this.field2590.method650(125);
            if (var1 == null) {
                return null;
            }
        } while (var1.field2724 == null);
        return var1.field2724;
    }

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "()I")
    public final int method278() {
        field2584++;
        return 0;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Lha;IIB)V")
    public static final void method1172(class267 arg0, int arg1, int arg2, byte arg3) {
        if (arg0.field4080 == 0) {
            arg0.field4035 = arg0.field4153;
        } else if (arg0.field4080 == 1) {
            arg0.field4035 = (arg2 - arg0.field4051) / 2 + arg0.field4153;
        } else if (arg0.field4080 == 2) {
            arg0.field4035 = arg2 - arg0.field4051 - arg0.field4153;
        } else if (arg0.field4080 == 3) {
            arg0.field4035 = arg0.field4153 * arg2 >> 14;
        } else if (arg0.field4080 == 4) {
            arg0.field4035 = (arg0.field4153 * arg2 >> 14) + (arg2 - arg0.field4051) / 2;
        } else {
            arg0.field4035 = arg2 - arg0.field4051 - (arg0.field4153 * arg2 >> 14);
        }
        int var4 = 6 / ((73 - arg3) / 34);
        if (arg0.field4112 == 0) {
            arg0.field4173 = arg0.field4062;
        } else if (arg0.field4112 == 1) {
            arg0.field4173 = (arg1 - arg0.field4177) / 2 + arg0.field4062;
        } else if (arg0.field4112 == 2) {
            arg0.field4173 = arg1 - arg0.field4177 - arg0.field4062;
        } else if (arg0.field4112 == 3) {
            arg0.field4173 = arg0.field4062 * arg1 >> 14;
        } else if (arg0.field4112 == 4) {
            arg0.field4173 = (arg0.field4062 * arg1 >> 14) + (arg1 - arg0.field4177) / 2;
        } else {
            arg0.field4173 = arg1 - arg0.field4177 - (arg0.field4062 * arg1 >> 14);
        }
        if (class268.field4194 && (client.method1439(arg0).field1395 != 0 || arg0.field4149 == 0)) {
            if (arg0.field4035 < 0) {
                arg0.field4035 = 0;
            } else if (arg2 < (arg0.field4035 + arg0.field4051)) {
                arg0.field4035 = arg2 - arg0.field4051;
            }
            if (arg0.field4173 < 0) {
                arg0.field4173 = 0;
            } else if (arg1 < arg0.field4177 + arg0.field4173) {
                arg0.field4173 = arg1 - arg0.field4177;
            }
        }
        field2593++;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Lli;II)V")
    private final void method1173(class191 arg0, int arg1, int arg2) {
        field2582++;
        if ((this.field2589.field920[arg0.field2720] & 0x4) != 0 && arg0.field2718 < 0) {
            int var4 = this.field2589.field935[arg0.field2720] / class276.field4426;
            int var5 = (var4 + 1048575 - arg0.field2719) / var4;
            arg0.field2719 = arg2 * var4 + arg0.field2719 & 0xFFFFF;
            if (var5 <= arg2) {
                if (this.field2589.field937[arg0.field2720] == 0) {
                    arg0.field2724 = class252.method1675(arg0.field2715, arg0.field2724.method1685(), arg0.field2724.method1662(), arg0.field2724.method1687());
                } else {
                    arg0.field2724 = class252.method1675(arg0.field2715, arg0.field2724.method1685(), 0, arg0.field2724.method1687());
                    this.field2589.method424((byte) 76, arg0.field2730.field1988[arg0.field2717] < 0, arg0);
                }
                if (arg0.field2730.field1988[arg0.field2717] < 0) {
                    arg0.field2724.method1673(-1);
                }
                arg2 = arg0.field2719 / var4;
            }
        }
        arg0.field2724.method281(arg2);
        if (arg1 != -1) {
            field2583 = null;
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IZ)I")
    public static final int method1174(int arg0, boolean arg1) {
        field2594++;
        if (!arg1) {
            method1172((class267) null, -60, -17, (byte) -73);
        }
        return arg0 >>> 7;
    }

    @OriginalMember(owner = "client!ia", name = "<init>", descriptor = "(Lv;)V")
    public class181(class61 arg0) {
        this.field2589 = arg0;
    }
}
