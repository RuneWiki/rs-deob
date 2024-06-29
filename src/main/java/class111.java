import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!np")
public class class111 {

    @OriginalMember(owner = "client!np", name = "m", descriptor = "I")
    public int field1442;

    @OriginalMember(owner = "client!np", name = "j", descriptor = "I")
    public int field1439;

    @OriginalMember(owner = "client!np", name = "k", descriptor = "I")
    public int field1440;

    @OriginalMember(owner = "client!np", name = "e", descriptor = "I")
    public int field1434;

    @OriginalMember(owner = "client!np", name = "f", descriptor = "Lim;")
    public static class353 field1435 = new class353(10, -1);

    @OriginalMember(owner = "client!np", name = "l", descriptor = "Ljava/lang/String;")
    public static String field1441 = "";

    @OriginalMember(owner = "client!np", name = "i", descriptor = "Lvt;")
    public static class344 field1438 = new class344("Loaded JAGGL", "JAGGL geladen", "JAGGL chargé", "JAGGL carregado");

    @OriginalMember(owner = "client!np", name = "n", descriptor = "Z")
    public static volatile boolean field1443 = true;

    @OriginalMember(owner = "client!np", name = "a", descriptor = "I")
    public static int field1430;

    @OriginalMember(owner = "client!np", name = "b", descriptor = "I")
    public static int field1431;

    @OriginalMember(owner = "client!np", name = "c", descriptor = "I")
    public static int field1432;

    @OriginalMember(owner = "client!np", name = "d", descriptor = "I")
    public static int field1433;

    @OriginalMember(owner = "client!np", name = "g", descriptor = "I")
    public static int field1436;

    @OriginalMember(owner = "client!np", name = "h", descriptor = "I")
    public static int field1437;

    @OriginalMember(owner = "client!np", name = "o", descriptor = "I")
    public static int field1444;

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(ZZZ)V")
    public static final void method597(boolean arg0, boolean arg1, boolean arg2) {
        field1430++;
        if (arg2) {
            class132.field1628--;
            if (class132.field1628 == 0) {
                class190.field2453 = null;
            }
        }
        if (arg0) {
            method604(70, 64, -22);
        }
        if (!arg1) {
            return;
        }
        class370.field5159--;
        if (class370.field5159 == 0) {
            class351.field4940 = null;
            return;
        }
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(I)V")
    public static final void method598(int arg0) {
        field1444++;
        if (class501.field6954.method3538(1, class428.field5845) != 2) {
            return;
        }
        byte var1 = (byte) (class227.field2903 - 4 & 0xFF);
        int var2 = class227.field2903 % class139.field1760;
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var17 = 0; var17 < class369.field5135; var17++) {
                class625.field9046[var3][var2][var17] = var1;
            }
        }
        int var4 = -35 % ((-arg0 - 35) / 52);
        if (class187.field2407 == 3) {
            return;
        }
        for (int var5 = 0; var5 < 2; var5++) {
            class585.field8466[var5] = -1000000;
            class88.field1169[var5] = 1000000;
            client.field8972[var5] = 0;
            class324.field4451[var5] = 1000000;
            class207.field2692[var5] = 0;
        }
        if (class621.field8952 != 1) {
            int var16 = class341.method2147(class187.field2407, class196.field2555, 0, class434.field5901);
            if (var16 - class186.field2364 >= 3200 || (class310.field3971[class187.field2407][class196.field2555 >> 9][class434.field5901 >> 9] & 0x4) == 0) {
                return;
            }
            class400.method2403(class196.field2555 >> 9, 1, class434.field5901 >> 9, false, class199.field2605, (byte) -80);
            return;
        }
        if ((class310.field3971[class187.field2407][class147.field1899.field6362 >> 9][class147.field1899.field6368 >> 9] & 0x4) != 0) {
            class400.method2403(class147.field1899.field6362 >> 9, 0, class147.field1899.field6368 >> 9, false, class199.field2605, (byte) -89);
        }
        if (class627.field9131 >= 2560) {
            return;
        }
        int var6 = class196.field2555 >> 9;
        int var7 = class434.field5901 >> 9;
        int var8 = class147.field1899.field6362 >> 9;
        int var9 = class147.field1899.field6368 >> 9;
        int var10;
        if (var6 >= var8) {
            var10 = var6 - var8;
        } else {
            var10 = var8 - var6;
        }
        int var11;
        if (var9 <= var7) {
            var11 = var7 - var9;
        } else {
            var11 = var9 - var7;
        }
        if ((var10 != 0 || var11 != 0) && -class139.field1760 < var10 && class139.field1760 > var10 && var11 > -class369.field5135 && var11 < class369.field5135) {
            if (var10 > var11) {
                int var12 = var11 * 65536 / var10;
                int var13 = 32768;
                while (var6 != var8) {
                    if (var6 < var8) {
                        var6++;
                    } else if (var8 < var6) {
                        var6--;
                    }
                    if ((class310.field3971[class187.field2407][var6][var7] & 0x4) != 0) {
                        class400.method2403(var6, 1, var7, false, class199.field2605, (byte) -58);
                        return;
                    }
                    var13 += var12;
                    if (var13 >= 65536) {
                        if (var7 < var9) {
                            var7++;
                        } else if (var7 > var9) {
                            var7--;
                        }
                        var13 -= 65536;
                        if ((class310.field3971[class187.field2407][var6][var7] & 0x4) != 0) {
                            class400.method2403(var6, 1, var7, false, class199.field2605, (byte) -127);
                            return;
                        }
                    }
                }
                return;
            }
            int var14 = var10 * 65536 / var11;
            int var15 = 32768;
            while (var7 != var9) {
                if (var7 < var9) {
                    var7++;
                } else if (var7 > var9) {
                    var7--;
                }
                if ((class310.field3971[class187.field2407][var6][var7] & 0x4) != 0) {
                    class400.method2403(var6, 1, var7, false, class199.field2605, (byte) -59);
                    return;
                }
                var15 += var14;
                if (var15 >= 65536) {
                    var15 -= 65536;
                    if (var6 < var8) {
                        var6++;
                    } else if (var6 > var8) {
                        var6--;
                    }
                    if ((class310.field3971[class187.field2407][var6][var7] & 0x4) != 0) {
                        class400.method2403(var6, 1, var7, false, class199.field2605, (byte) -84);
                        return;
                    }
                }
            }
            return;
        }
        class447.method2602(null, 91, "RC: " + var6 + "," + var7 + " " + var8 + "," + var9 + " " + class525.field7310 + "," + class58.field786);
        return;
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(ZII)Z")
    public static final boolean method599(boolean arg0, int arg1, int arg2) {
        if (!arg0) {
            method598(-32);
        }
        field1433++;
        return (arg2 & 0x22) != 0;
    }

    @OriginalMember(owner = "client!np", name = "b", descriptor = "(I)V")
    public static void method600(int arg0) {
        if (arg0 != -26301) {
            method603(-1, null);
        }
        field1441 = null;
        field1435 = null;
        field1438 = null;
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(ZLjava/lang/String;)Z")
    public static final boolean method601(boolean arg0, String arg1) {
        if (arg0) {
            field1438 = null;
        }
        field1437++;
        return class362.method2240(-58, 10, arg1, true);
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(II)Lnp;")
    public final class111 method602(int arg0, int arg1) {
        int var3 = 126 / ((arg0 + 56) / 36);
        field1431++;
        return new class111(this.field1442, arg1, this.field1434, this.field1440);
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(ILkr;)V")
    public static final void method603(int arg0, class329 arg1) {
        field1436++;
        if (arg0 != 9639) {
            field1443 = true;
        }
        class494.field6888 = arg1;
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(III)I")
    public static final int method604(int arg0, int arg1, int arg2) {
        field1432++;
        int var3 = arg1 >> 31 & arg2 - 1;
        return arg0 == 0 ? (arg1 + (arg1 >>> 31)) % arg2 + var3 : 42;
    }

    @OriginalMember(owner = "client!np", name = "<init>", descriptor = "(IIII)V")
    public class111(int arg0, int arg1, int arg2, int arg3) {
        this.field1442 = arg0;
        this.field1439 = arg1;
        this.field1440 = arg3;
        this.field1434 = arg2;
    }
}
