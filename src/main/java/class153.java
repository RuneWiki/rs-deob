import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!or")
public abstract class class153 {

    @OriginalMember(owner = "client!or", name = "c", descriptor = "I")
    public static int field2100 = 0;

    @OriginalMember(owner = "client!or", name = "h", descriptor = "I")
    public static int field2105 = 0;

    @OriginalMember(owner = "client!or", name = "a", descriptor = "I")
    public static int field2098;

    @OriginalMember(owner = "client!or", name = "b", descriptor = "I")
    public static int field2099;

    @OriginalMember(owner = "client!or", name = "e", descriptor = "I")
    public static int field2102;

    @OriginalMember(owner = "client!or", name = "f", descriptor = "I")
    public static int field2103;

    @OriginalMember(owner = "client!or", name = "g", descriptor = "I")
    public static int field2104;

    @OriginalMember(owner = "client!or", name = "d", descriptor = "Lkr;")
    public static class234 field2101;

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(B)I")
    public static final int method942(byte arg0) {
        field2098++;
        if (arg0 != -70) {
            method947((class134) null, 45, (class134) null);
        }
        try {
            if (class103.field1403 == 0) {
                if (class146.field2031 > (class445.method2750(-27580) - 5000L)) {
                    return 0;
                }
                class278.field4234 = class79.field1043.method1450((byte) -71, class244.field3661, class98.field1355);
                class449.field6613 = class445.method2750(-27580);
                class103.field1403 = 1;
            }
            if (class449.field6613 + 30000L < class445.method2750(-27580)) {
                return class100.method639(1000, 419);
            }
            if (class103.field1403 == 1) {
                if (class278.field4234.field3172 == 2) {
                    return class100.method639(1001, 419);
                }
                if (class278.field4234.field3172 != 1) {
                    return -1;
                }
                class301.field4543 = new class359((Socket) class278.field4234.field3175, class79.field1043);
                class278.field4234 = null;
                int var1 = 0;
                if (class414.field6155) {
                    var1 = class228.field3477;
                }
                class189.field2840.field5666 = 0;
                class189.field2840.method2366(class386.field5698.field6435, true);
                class189.field2840.method2381(var1, 0);
                class301.field4543.method2164(0, (byte) -35, class189.field2840.field5666, class189.field2840.field5685);
                if (class245.field3670 != null) {
                    class245.field3670.method247(arg0 ^ 0xFFFFF86A);
                }
                if (class236.field3536 != null) {
                    class236.field3536.method247(2000);
                }
                int var2 = class301.field4543.method2156(true);
                if (class245.field3670 != null) {
                    class245.field3670.method247(2000);
                }
                if (class236.field3536 != null) {
                    class236.field3536.method247(arg0 ^ 0xFFFFF86A);
                }
                if (var2 != 0) {
                    return class100.method639(var2, arg0 + 489);
                }
                class103.field1403 = 2;
            }
            if (class103.field1403 == 2) {
                if (class301.field4543.method2158(false) < 2) {
                    return -1;
                }
                class217.field3303 = class301.field4543.method2156(true);
                class217.field3303 <<= 0x8;
                class217.field3303 += class301.field4543.method2156(true);
                class161.field2242 = 0;
                class103.field1403 = 3;
                class364.field5350 = new byte[class217.field3303];
            }
            if (class103.field1403 != 3) {
                return -1;
            }
            int var3 = class301.field4543.method2158(false);
            if (var3 < 1) {
                return -1;
            }
            if (var3 > class217.field3303 - class161.field2242) {
                var3 = class217.field3303 - class161.field2242;
            }
            class301.field4543.method2159((byte) -128, class161.field2242, var3, class364.field5350);
            class161.field2242 += var3;
            if (class217.field3303 > class161.field2242) {
                return -1;
            } else if (class171.method1057(-2, class364.field5350)) {
                class205.field3072 = new class432[class51.field658];
                int var4 = 0;
                for (int var5 = class301.field4546; var5 <= class219.field3340; var5++) {
                    class432 var6 = class137.method857(32368, var5);
                    if (var6 != null) {
                        class205.field3072[var4++] = var6;
                    }
                }
                class30.field383 = 0;
                class15.field191 = null;
                class301.field4543.method2163(true);
                class364.field5350 = null;
                class103.field1403 = 0;
                class301.field4543 = null;
                class462.field6815 = 0;
                class146.field2031 = class445.method2750(-27580);
                return 0;
            } else {
                return class100.method639(1002, 419);
            }
        } catch (IOException var7) {
            return class100.method639(1003, arg0 ^ 0xFFFFFE19);
        }
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(IIIII)I")
    public static final int method943(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2102++;
        if (arg3 < 94) {
            return -29;
        } else {
            int var5 = arg1 & 0xF;
            int var6 = var5 >= 8 ? arg4 : arg0;
            int var7 = var5 >= 4 ? (var5 == 12 || var5 == 14 ? arg0 : arg2) : arg4;
            return ((var5 & 0x2) == 0 ? var7 : -var7) + ((var5 & 0x1) == 0 ? var6 : -var6);
        }
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(Lbs;)V")
    public static final void method944(class141 arg0) {
        for (int var1 = arg0.field1895; var1 <= arg0.field1890; var1++) {
            for (int var2 = arg0.field1901; var2 <= arg0.field1889; var2++) {
                class13 var3 = class277.field4216[arg0.field1902][var1][var2];
                if (var3 != null) {
                    class466 var4 = var3.field151;
                    class466 var5 = null;
                    while (var4 != null) {
                        if (var4.field6862 == arg0) {
                            if (var5 == null) {
                                var3.field151 = var4.field6853;
                            } else {
                                var5.field6853 = var4.field6853;
                            }
                            var4.method2871(-30533);
                            break;
                        }
                        var5 = var4;
                        var4 = var4.field6853;
                    }
                    var3.field141 = 0;
                    for (class466 var6 = var3.field151; var6 != null; var6 = var6.field6853) {
                        var3.field141 = (byte) (var3.field141 | var6.field6856);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(Z)V")
    public static final void method945(boolean arg0) {
        field2103++;
        class375.field5461.method365(((float) class105.field1410 * 0.1F + 0.7F) * class355.field5245);
        class375.field5461.method360(class95.field1327, class409.field6099, class140.field1881, (float) class427.field6292, (float) class382.field5580, (float) class353.field5220);
        if (!arg0) {
            field2101 = null;
        }
        class375.field5461.method380(class8.field91);
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(I)V")
    public static void method946(int arg0) {
        field2101 = null;
        if (arg0 != 3) {
            field2101 = null;
        }
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(Liq;ILiq;)V")
    public static final void method947(class134 arg0, int arg1, class134 arg2) {
        if (arg1 == -16093) {
            field2099++;
            class236.field3543 = arg2;
            class362.field5333 = arg0;
            class236.field3543.method812(36, (byte) -41);
        }
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(IIIIZI[BI[Lek;Ldr;IB)V")
    public static final void method948(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, byte[] arg6, int arg7, class375[] arg8, class261 arg9, int arg10, byte arg11) {
        field2104++;
        int var12 = 82 / ((arg11 + 52) / 56);
        class385 var13 = new class385(arg6);
        int var14 = -1;
        while (true) {
            int var15 = var13.method2339((byte) 40);
            if (var15 == 0) {
                return;
            }
            var14 += var15;
            int var16 = 0;
            while (true) {
                int var17 = var13.method2372(true);
                if (var17 == 0) {
                    break;
                }
                var16 += var17 - 1;
                int var18 = var16 & 0x3F;
                int var19 = (var16 & 0xFED) >> 6;
                int var20 = var16 >> 12;
                int var21 = var13.method2343(255);
                int var22 = var21 >> 2;
                int var23 = var21 & 0x3;
                if (arg2 == var20 && arg7 <= var19 && arg7 + 8 > var19 && arg1 <= var18 && var18 < (arg1 + 8)) {
                    class85 var24 = class411.method2575(0, var14);
                    int var25 = class187.method1135(2, var24.field1122, var24.field1197, var19 & 0x7, arg0, var18 & 0x7, var23) + arg5;
                    int var26 = arg10 + class72.method477(var19 & 0x7, arg0, var24.field1122, var23, var24.field1197, var18 & 0x7, 3);
                    if (var25 > 0 && var26 > 0 && var25 < (class115.field1522 - 1) && class198.field3004 - 1 > var26) {
                        class375 var27 = null;
                        if (!arg4) {
                            int var28 = arg3;
                            if ((class341.field5085[1][var25][var26] & 0x2) == 2) {
                                var28 = arg3 - 1;
                            }
                            if (var28 >= 0) {
                                var27 = arg8[var28];
                            }
                        }
                        class331.method2031(true, arg0 + var23 & 0x3, arg9, var27, var26, var14, arg4, arg3, -1, (byte) 85, var25, arg3, var22);
                    }
                }
            }
        }
    }

    static {
        new class151("Nothing interesting happens.", "Nichts Interessantes passiert.", "Il ne se passe rien d'intéressant.", "Nada de interessante acontece.");
    }
}
