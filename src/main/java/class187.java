import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class187 {

    @OriginalMember(owner = "client!db", name = "f", descriptor = "[Lib;")
    private class95[] field3431;

    @OriginalMember(owner = "client!db", name = "h", descriptor = "I")
    private int field3433;

    @OriginalMember(owner = "client!db", name = "l", descriptor = "[I")
    public static int[] field3437 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!db", name = "i", descriptor = "Lsf;")
    public static class108 field3434 = class140.method973(255, "tremblement:");

    @OriginalMember(owner = "client!db", name = "a", descriptor = "I")
    public static int field3426;

    @OriginalMember(owner = "client!db", name = "b", descriptor = "I")
    public static int field3427;

    @OriginalMember(owner = "client!db", name = "c", descriptor = "I")
    public static int field3428;

    @OriginalMember(owner = "client!db", name = "d", descriptor = "I")
    public static int field3429;

    @OriginalMember(owner = "client!db", name = "e", descriptor = "I")
    public static int field3430;

    @OriginalMember(owner = "client!db", name = "g", descriptor = "I")
    public static int field3432;

    @OriginalMember(owner = "client!db", name = "k", descriptor = "I")
    public static int field3436;

    @OriginalMember(owner = "client!db", name = "m", descriptor = "I")
    public static int field3438;

    @OriginalMember(owner = "client!db", name = "o", descriptor = "I")
    public static int field3440;

    @OriginalMember(owner = "client!db", name = "p", descriptor = "I")
    public static int field3441;

    @OriginalMember(owner = "client!db", name = "n", descriptor = "J")
    private long field3439;

    @OriginalMember(owner = "client!db", name = "j", descriptor = "Lib;")
    private class95 field3435;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(ILca;II)V", line = 5)
    private static final void method1336(int arg0, class98 arg1, int arg2, int arg3) {
        field3429++;
        if (class311.field5374 < 2 && class84.field1347 == 0 && !class172.field3132) {
            return;
        }
        class108 var4;
        if (class84.field1347 == 1 && class311.field5374 < 2) {
            var4 = class117.method833(new class108[] { class288.field5045, class198.field3565, class331.field5662, class173.field3164 }, false);
        } else if (class172.field3132 && class311.field5374 < 2) {
            var4 = class117.method833(new class108[] { class72.field1103, class198.field3565, class131.field2248, class173.field3164 }, false);
        } else if (class92.field1450 && class144.field2529[81] && class311.field5374 > 2) {
            var4 = class210.method1453((byte) -116, class311.field5374 - 2);
        } else {
            var4 = class210.method1453((byte) -118, class311.field5374 - 1);
        }
        if (class311.field5374 > 2) {
            var4 = class117.method833(new class108[] { var4, class318.field5461, class79.method518(false, class311.field5374 - 2), class329.field5626 }, false);
        }
        if (arg3 <= 45) {
            return;
        }
        if (arg1 == null) {
            int var6 = class256.field4525.method542(var4, arg0 + 4, arg2 + 15, 16777215, 0, class256.field4526, class287.field5024);
            class101.method702(-1, arg0 + 4, var6 + class256.field4525.method543(var4), arg2, 15);
            return;
        }
        class80 var5 = arg1.method671((byte) 103, class157.field2831);
        if (var5 == null) {
            var5 = class256.field4525;
        }
        var5.method534(var4, arg0, arg2, arg1.field1673, arg1.field1688, arg1.field1573, arg1.field1687, arg1.field1568, arg1.field1592, class256.field4526, class287.field5024, class137.field2420);
        class101.method702(-1, class137.field2420[0], class137.field2420[2], class137.field2420[1], class137.field2420[3]);
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(ILib;J)V", line = 59)
    public final void method1337(int arg0, class95 arg1, long arg2) {
        field3440++;
        if (arg1.field1522 != null) {
            arg1.method648(arg0 ^ 0x67C3);
        }
        class95 var5 = this.field3431[(int) ((long) (this.field3433 - 1) & arg2)];
        arg1.field1518 = var5;
        arg1.field1520 = arg2;
        arg1.field1522 = var5.field1522;
        arg1.field1522.field1518 = arg1;
        arg1.field1518.field1522 = arg1;
        if (arg0 != 1) {
            this.method1337(110, (class95) null, 110L);
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Lib;ILib;)V", line = 83)
    public static final void method1338(class95 arg0, int arg1, class95 arg2) {
        if (arg0.field1522 != null) {
            arg0.method648(arg1 + 26546);
        }
        arg0.field1522 = arg2;
        if (arg1 != 16) {
            field3434 = (class108) null;
        }
        arg0.field1518 = arg2.field1518;
        arg0.field1522.field1518 = arg0;
        arg0.field1518.field1522 = arg0;
        field3430++;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(I)V", line = 105)
    public static final void method1339(int arg0) {
        if (!class62.field989) {
            class186.field3411[0] = class55.field807;
            if (class324.field5528 != 0) {
                class184.field3382 = class134.field2314;
                class195.field3537 = class261.field4604;
            } else if (class331.field5645 == 0) {
                class195.field3537 = class171.field3116;
                class184.field3382 = class317.field5456;
            } else {
                class184.field3382 = class87.field1382;
                class195.field3537 = class170.field3041;
            }
            class317.field5454[0] = class63.field1016;
            class305.field5299[0] = 1007;
            class311.field5374 = 1;
        }
        class165.method1147((long) class116.field2000);
        field3428++;
        if (class322.field5511 != -1) {
            class167.method1167((byte) -114, class322.field5511);
        }
        for (int var1 = 0; var1 < class273.field4806; var1++) {
            if (class47.field692[var1]) {
                class280.field4910[var1] = true;
            }
            class183.field3366[var1] = class47.field692[var1];
            class47.field692[var1] = false;
        }
        class27.field417 = null;
        class157.field2838 = -1;
        if (arg0 != 16711935) {
            return;
        }
        if (class231.field4051) {
            class98.field1735 = true;
        }
        class301.field5245 = class116.field2000;
        class39.field548 = -1;
        class278.field4879 = null;
        if (class322.field5511 != -1) {
            class273.field4806 = 0;
            class280.method2017(class322.field5511, class73.field1110, 0, -1, class21.field331, 8619, 0, 0, 0);
        }
        if (class231.field4051) {
            class50.method351();
        } else {
            class28.method191();
        }
        class232.method1616(-5219);
        if (class62.field989) {
            class252.method1781(16776960);
        } else if (class27.field417 != null) {
            method1336(class151.field2742, class27.field417, class298.field5183, 57);
        } else if (class157.field2838 != -1) {
            method1336(class157.field2838, (class98) null, class39.field548, 117);
        }
        if (class140.field2465 == 3) {
            for (int var2 = 0; var2 < class273.field4806; var2++) {
                if (class183.field3366[var2]) {
                    if (class231.field4051) {
                        class50.method357(class39.field545[var2], class242.field4216[var2], class26.field399[var2], class313.field5409[var2], 16711935, 128);
                    } else {
                        class28.method186(class39.field545[var2], class242.field4216[var2], class26.field399[var2], class313.field5409[var2], 16711935, 128);
                    }
                } else if (class280.field4910[var2]) {
                    if (class231.field4051) {
                        class50.method357(class39.field545[var2], class242.field4216[var2], class26.field399[var2], class313.field5409[var2], 16711680, 128);
                    } else {
                        class28.method186(class39.field545[var2], class242.field4216[var2], class26.field399[var2], class313.field5409[var2], 16711680, 128);
                    }
                }
            }
        }
        class233.method1628(arg0 - 16711926, class95.field1513.field4457, class195.field3534, class95.field1513.field4452, class295.field5159);
        class195.field3534 = 0;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IIIIII)V", line = 238)
    public static final void method1340(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field3436++;
        class209.field3743[0].method404(arg1, arg0);
        class209.field3743[1].method404(arg1, arg0 + arg3 - 16);
        int var6 = (arg3 - 32) * arg3 / arg4;
        if (var6 < 8) {
            var6 = 8;
        }
        int var7 = (arg3 - var6 - 32) * arg2 / (arg4 - arg3);
        if (class231.field4051) {
            class50.method348(arg1, arg0 + 16, 16, arg3 - 32, class75.field1161);
            class50.method348(arg1, arg0 + var7 + 16, 16, var6, class59.field883);
            class50.method352(arg1, arg0 + var7 + 16, var6, class223.field3952);
            class50.method352(arg1 + 1, arg0 + var7 + 16, var6, class223.field3952);
            class50.method346(arg1, arg0 + var7 + 16, 16, class223.field3952);
            class50.method346(arg1, var7 + arg0 + 17, 16, class223.field3952);
            class50.method352(arg1 + 15, arg0 + 16 + var7, var6, class167.field2999);
            class50.method352(arg1 + 14, arg0 + var7 - -17, var6 - 1, class167.field2999);
            class50.method346(arg1, arg0 + var7 - (-var6 + -15), 16, class167.field2999);
            class50.method346(arg1 + 1, arg0 + 14 + var6 + var7, 15, class167.field2999);
        } else {
            class28.method193(arg1, arg0 + 16, 16, arg3 - 32, class75.field1161);
            class28.method193(arg1, arg0 + var7 + 16, 16, var6, class59.field883);
            class28.method188(arg1, arg0 + var7 + 16, var6, class223.field3952);
            class28.method188(arg1 + 1, arg0 + 16 - -var7, var6, class223.field3952);
            class28.method184(arg1, arg0 + var7 + 16, 16, class223.field3952);
            class28.method184(arg1, arg0 + var7 + 17, 16, class223.field3952);
            class28.method188(arg1 + 15, arg0 + 16 + var7, var6, class167.field2999);
            class28.method188(arg1 + 14, arg0 - -17 + var7, var6 - 1, class167.field2999);
            class28.method184(arg1, arg0 + 15 - (-var6 - var7), 16, class167.field2999);
            class28.method184(arg1 + 1, var7 + 14 + arg0 - -var6, 15, class167.field2999);
        }
        if (arg5 != 15) {
            method1342((byte) 125, 23);
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(B)Lib;", line = 285)
    public final class95 method1341(byte arg0) {
        field3438++;
        if (this.field3435 == null) {
            return null;
        }
        if (arg0 <= 18) {
            field3432 = 19;
        }
        class95 var2 = this.field3431[(int) ((long) (this.field3433 - 1) & this.field3439)];
        while (this.field3435 != var2) {
            if (this.field3435.field1520 == this.field3439) {
                class95 var3 = this.field3435;
                this.field3435 = this.field3435.field1518;
                return var3;
            }
            this.field3435 = this.field3435.field1518;
        }
        this.field3435 = null;
        return null;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(BI)V", line = 329)
    public static final void method1342(byte arg0, int arg1) {
        if (arg0 >= -81) {
            method1336(125, (class98) null, -4, -119);
        }
        field3441++;
        class240.field4185.method637(arg1, 116);
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IIIIILca;II)V", line = 340)
    public static final void method1343(int arg0, int arg1, int arg2, int arg3, int arg4, class98 arg5, int arg6, int arg7) {
        field3427++;
        if (class122.field2079) {
            class2.field28 = 32;
        } else {
            class2.field28 = 0;
        }
        class122.field2079 = false;
        if (class83.field1298 != 0) {
            if (arg6 >= arg0 && arg6 < arg0 + 16 && arg3 <= arg2 && (arg3 + 16) > arg2) {
                arg5.field1701 -= 4;
                class195.method1388(-82, arg5);
            } else if (arg6 >= arg0 && (arg0 + 16) > arg6 && (arg3 - (16 - arg4)) <= arg2 && arg3 + arg4 > arg2) {
                arg5.field1701 += 4;
                class195.method1388(-82, arg5);
            } else if ((arg0 - class2.field28) <= arg6 && arg0 + class2.field28 + 16 > arg6 && arg2 >= arg3 + 16 && arg3 + arg4 - 16 > arg2) {
                int var8 = (arg4 - 32) * arg4 / arg1;
                if (var8 < 8) {
                    var8 = 8;
                }
                int var9 = arg2 - (var8 / 2) - arg3 - 16;
                int var10 = arg4 - var8 - 32;
                arg5.field1701 = (arg1 - arg4) * var9 / var10;
                class195.method1388(-82, arg5);
                class122.field2079 = true;
            }
        }
        if (arg7 < 88) {
            method1340(-39, 103, 59, -36, -116, -89);
        }
        if (class130.field2233 == 0) {
            return;
        }
        int var11 = arg5.field1673;
        if ((arg0 - var11) <= arg6 && arg2 >= arg3 && arg0 + 16 > arg6 && arg3 + arg4 >= arg2) {
            arg5.field1701 += class130.field2233 * 45;
            class195.method1388(-82, arg5);
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(JB)Lib;", line = 405)
    public final class95 method1344(long arg0, byte arg1) {
        field3426++;
        this.field3439 = arg0;
        if (arg1 < 56) {
            this.field3431 = (class95[]) null;
        }
        class95 var4 = this.field3431[(int) (arg0 & (long) (this.field3433 - 1))];
        for (this.field3435 = var4.field1518; this.field3435 != var4; this.field3435 = this.field3435.field1518) {
            if (this.field3435.field1520 == arg0) {
                class95 var5 = this.field3435;
                this.field3435 = this.field3435.field1518;
                return var5;
            }
        }
        this.field3435 = null;
        return null;
    }

    @OriginalMember(owner = "client!db", name = "<init>", descriptor = "(I)V", line = 436)
    public class187(int arg0) {
        this.field3431 = new class95[arg0];
        this.field3433 = arg0;
        for (int var2 = 0; var2 < arg0; var2++) {
            class95 var3 = this.field3431[var2] = new class95();
            var3.field1522 = var3;
            var3.field1518 = var3;
        }
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(B)V", line = 462)
    public static void method1345(byte arg0) {
        field3434 = null;
        if (arg0 != 96) {
            method1345((byte) 4);
        }
        field3437 = null;
    }
}
