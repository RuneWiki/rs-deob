import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public abstract class class254 {

    @OriginalMember(owner = "client!gk", name = "g", descriptor = "Luc;")
    public static class58 field3480 = new class58(8);

    @OriginalMember(owner = "client!gk", name = "v", descriptor = "[I")
    public static int[] field3495 = new int[2500];

    @OriginalMember(owner = "client!gk", name = "l", descriptor = "I")
    public static int field3485 = 50;

    @OriginalMember(owner = "client!gk", name = "p", descriptor = "[I")
    public static int[] field3489 = new int[field3485];

    @OriginalMember(owner = "client!gk", name = "u", descriptor = "[Ljava/lang/String;")
    public static String[] field3494 = new String[field3485];

    @OriginalMember(owner = "client!gk", name = "q", descriptor = "[I")
    public static int[] field3490 = new int[field3485];

    @OriginalMember(owner = "client!gk", name = "r", descriptor = "[I")
    public static int[] field3491 = new int[field3485];

    @OriginalMember(owner = "client!gk", name = "t", descriptor = "[I")
    public static int[] field3493 = new int[field3485];

    @OriginalMember(owner = "client!gk", name = "s", descriptor = "[I")
    public static int[] field3492 = new int[field3485];

    @OriginalMember(owner = "client!gk", name = "m", descriptor = "[I")
    public static int[] field3486 = new int[field3485];

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "I")
    public static int field3474;

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "I")
    public int field3475;

    @OriginalMember(owner = "client!gk", name = "c", descriptor = "I")
    public static int field3476;

    @OriginalMember(owner = "client!gk", name = "d", descriptor = "I")
    public static int field3477;

    @OriginalMember(owner = "client!gk", name = "e", descriptor = "I")
    public static int field3478;

    @OriginalMember(owner = "client!gk", name = "f", descriptor = "I")
    public static int field3479;

    @OriginalMember(owner = "client!gk", name = "h", descriptor = "I")
    public static int field3481;

    @OriginalMember(owner = "client!gk", name = "i", descriptor = "I")
    public int field3482;

    @OriginalMember(owner = "client!gk", name = "j", descriptor = "I")
    public static int field3483;

    @OriginalMember(owner = "client!gk", name = "k", descriptor = "I")
    public int field3484;

    @OriginalMember(owner = "client!gk", name = "n", descriptor = "I")
    public static int field3487;

    @OriginalMember(owner = "client!gk", name = "o", descriptor = "I")
    public static int field3488;

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(B)Z", line = 5)
    public final boolean method1430(byte arg0) {
        if (arg0 != -88) {
            this.method1436(false);
        }
        field3476++;
        return (this.field3484 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(I)V", line = 16)
    public static void method1431(int arg0) {
        if (arg0 != 11036) {
            return;
        }
        field3486 = null;
        field3490 = null;
        field3480 = null;
        field3489 = null;
        field3491 = null;
        field3494 = null;
        field3493 = null;
        field3492 = null;
        field3495 = null;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(Lvm;Lal;B)V", line = 34)
    public static final void method1432(class322 arg0, class369 arg1, byte arg2) {
        field3478++;
        if (class443.field6447 == null) {
            return;
        }
        if (class337.field4497 < 10) {
            if (!class443.field6446.method1690(class443.field6447.field2258, (byte) -35)) {
                class337.field4497 = class183.field2329.method1703(0, class443.field6447.field2258) / 10;
                return;
            }
            class138.method753((byte) 124);
            class337.field4497 = 10;
        }
        if (class337.field4497 == 10) {
            class443.field6469 = class443.field6447.field2265 >> 6 << 6;
            class443.field6479 = class443.field6447.field2262 >> 6 << 6;
            class443.field6465 = (class443.field6447.field2267 >> 6 << 6) + 64 - class443.field6469;
            class443.field6472 = (class443.field6447.field2260 >> 6 << 6) + 64 - class443.field6479;
            int[] var3 = new int[3];
            int var4 = -1;
            int var5 = -1;
            if (class443.field6447.method952(var3, (class427.field6264.field152 >> 7) + class70.field767, true, class291.field3961 + (class427.field6264.field154 >> 7), class263.field3592)) {
                var4 = var3[1] - class443.field6479;
                var5 = var3[2] - class443.field6469;
            }
            if (!class449.field6529 && var4 >= 0 && var4 < class443.field6472 && var5 >= 0 && var5 < class443.field6465) {
                int var6 = var5 + (int) (Math.random() * 10.0D) - 5;
                int var7 = var4 + (int) (Math.random() * 10.0D) - 5;
                class98.field1165 = var7;
                class158.field2027 = var6;
            } else if (class370.field5180 == -1 || class98.field1156 == -1) {
                class443.field6447.method953(var3, class443.field6447.field2256 & 0x3FFF, class443.field6447.field2256 >> 14 & 0x3FFF, false);
                class158.field2027 = var3[2] - class443.field6469;
                class98.field1165 = var3[1] - class443.field6479;
            } else {
                class443.field6447.method953(var3, class98.field1156, class370.field5180, false);
                if (var3 != null) {
                    class98.field1165 = var3[1] - class443.field6479;
                    class158.field2027 = var3[2] - class443.field6469;
                }
                class98.field1156 = -1;
                class370.field5180 = -1;
                class449.field6529 = false;
            }
            if (class443.field6447.field2254 == 37) {
                class443.field6457 = 3.0F;
                class443.field6450 = 3.0F;
            } else if (class443.field6447.field2254 == 50) {
                class443.field6457 = 4.0F;
                class443.field6450 = 4.0F;
            } else if (class443.field6447.field2254 == 75) {
                class443.field6457 = 6.0F;
                class443.field6450 = 6.0F;
            } else if (class443.field6447.field2254 == 100) {
                class443.field6457 = 8.0F;
                class443.field6450 = 8.0F;
            } else if (class443.field6447.field2254 == 200) {
                class443.field6457 = 16.0F;
                class443.field6450 = 16.0F;
            } else {
                class443.field6457 = 8.0F;
                class443.field6450 = 8.0F;
            }
            class443.field6451 = (int) class443.field6457 >> 1;
            class443.field6456 = class132.method714(class443.field6451, 16);
            class176.method925(true);
            class443.method2749();
            class338.field4512 = new class154();
            class61.field626 = new class159();
            class443.field6454 += (int) (Math.random() * 5.0D) - 2;
            if (class443.field6454 < -8) {
                class443.field6454 = -8;
            }
            class443.field6453 += (int) (Math.random() * 5.0D) - 2;
            if (class443.field6454 > 8) {
                class443.field6454 = 8;
            }
            if (class443.field6453 < -16) {
                class443.field6453 = -16;
            }
            if (class443.field6453 > 16) {
                class443.field6453 = 16;
            }
            class443.method2747(arg1, class443.field6454 >> 2 << 10, class443.field6453 >> 1);
            class260.method1458(1024, 11904, 256);
            class305.method1790(256, 50, 256);
            class132.method713(4096, true);
            class233.method1265(256, 1);
            class337.field4497 = 20;
        } else if (class337.field4497 == 20) {
            class109.method577(true, 92);
            class443.method2732(arg0, class443.field6454, class443.field6453);
            class337.field4497 = 60;
            class109.method577(true, 79);
            class167.method890(-26008);
        } else if (class337.field4497 == 60) {
            if (class443.field6446.method1681(115, class443.field6447.field2258 + "_staticelements")) {
                if (!class443.field6446.method1690(class443.field6447.field2258 + "_staticelements", (byte) -83)) {
                    return;
                }
                class443.field6458 = class122.method651(class443.field6447.field2258 + "_staticelements", class443.field6446, 89, class21.field210);
            } else {
                class443.field6458 = new class10(0);
            }
            class443.method2739();
            class337.field4497 = 70;
            class109.method577(true, 86);
            class167.method890(-26008);
        } else if (class337.field4497 == 70) {
            class116.field1442 = new class60(arg0, 11, true, class38.field391);
            class337.field4497 = 73;
            class109.method577(true, 66);
            class167.method890(-26008);
        } else if (class337.field4497 == 73) {
            class72.field804 = new class60(arg0, 12, true, class38.field391);
            class337.field4497 = 76;
            class109.method577(true, 79);
            class167.method890(-26008);
        } else if (class337.field4497 == 76) {
            class216.field2909 = new class60(arg0, 14, true, class38.field391);
            class337.field4497 = 79;
            class109.method577(true, 83);
            class167.method890(-26008);
        } else if (class337.field4497 == 79) {
            class359.field5072 = new class60(arg0, 17, true, class38.field391);
            class337.field4497 = 82;
            class109.method577(true, 91);
            class167.method890(-26008);
        } else if (class337.field4497 == 82) {
            class53.field547 = new class60(arg0, 19, true, class38.field391);
            class337.field4497 = 85;
            class109.method577(true, 74);
            class167.method890(-26008);
        } else if (class337.field4497 == 85) {
            class191.field2402 = new class60(arg0, 22, true, class38.field391);
            class337.field4497 = 88;
            class109.method577(true, 79);
            class167.method890(-26008);
        } else if (class337.field4497 == 88) {
            class370.field5174 = new class60(arg0, 26, true, class38.field391);
            class337.field4497 = 91;
            class109.method577(true, 127);
            class167.method890(-26008);
        } else {
            class244.field3321 = new class60(arg0, 30, true, class38.field391);
            class337.field4497 = 100;
            if (arg2 < 48) {
                method1437((class322) null, 0, -45, (class247) null, 91, 32, -121, (byte[][][]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, -94, (byte) 85, 89, 112, false);
            }
            class109.method577(true, 83);
            class167.method890(-26008);
            System.gc();
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(Z)Z", line = 265)
    public final boolean method1433(boolean arg0) {
        if (arg0) {
            field3480 = null;
        }
        field3479++;
        return (this.field3484 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(IIBLio;)J", line = 279)
    public static final long method1434(int arg0, int arg1, byte arg2, class285 arg3) {
        field3481++;
        long var4 = 4194304L;
        long var6 = 2147483648L;
        if (arg2 <= 125) {
            return 19L;
        }
        long var8 = Long.MIN_VALUE;
        class225 var10 = class281.method1655((byte) -28, arg3.method356(10397));
        long var11 = (long) (arg0 | 0x40000000 | arg1 << 7 | arg3.method339(-123) << 14 | arg3.method351((byte) 103) << 20);
        if (var10.field3027 == 0) {
            var11 |= var8;
        }
        if (var10.field3069 == 1) {
            var11 |= var4;
        }
        if (var10.field3043) {
            var11 |= var6;
        }
        return var11 | (long) arg3.method356(10397) << 32;
    }

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "(Z)Z", line = 312)
    public final boolean method1435(boolean arg0) {
        if (!arg0) {
            field3492 = null;
        }
        field3488++;
        return (this.field3484 & 0x8) != 0;
    }

    @OriginalMember(owner = "client!gk", name = "c", descriptor = "(Z)Z", line = 326)
    public final boolean method1436(boolean arg0) {
        if (arg0) {
            this.field3475 = 121;
        }
        field3477++;
        return (this.field3484 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(Lvm;IILib;III[[[B[I[I[I[I[IIBIIZ)V", line = 339)
    public static final void method1437(class322 arg0, int arg1, int arg2, class247 arg3, int arg4, int arg5, int arg6, byte[][][] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, byte arg14, int arg15, int arg16, boolean arg17) {
        class191.field2407 = arg0;
        class80.field887 = arg1;
        class390.field5604 = arg3;
        class160.field2064 = class191.field2407.method1590() > 0;
        class98.field1164 = arg4 >> 7;
        class419.field6103 = arg6 >> 7;
        class62.field638 = arg4;
        class390.field5596 = arg6;
        class421.field6185 = arg5;
        class231.field3183 = class98.field1164 - class430.field6316;
        if (class231.field3183 < 0) {
            class129.field1667 = -class231.field3183;
            class231.field3183 = 0;
        } else {
            class129.field1667 = 0;
        }
        class312.field4193 = class419.field6103 - class430.field6316;
        if (class312.field4193 < 0) {
            class54.field554 = -class312.field4193;
            class312.field4193 = 0;
        } else {
            class54.field554 = 0;
        }
        class105.field1290 = class98.field1164 + class430.field6316;
        if (class105.field1290 > class231.field3184) {
            class105.field1290 = class231.field3184;
        }
        class207.field2797 = class430.field6316 + class419.field6103;
        if (class207.field2797 > class209.field2840) {
            class207.field2797 = class209.field2840;
        }
        for (int var18 = 0; var18 < class430.field6316 + class430.field6316 + 2; var18++) {
            for (int var23 = 0; var23 < class430.field6316 + class430.field6316 + 2; var23++) {
                int var24 = class98.field1164 + var18 - class430.field6316;
                int var25 = class419.field6103 + var23 - class430.field6316;
                if (var24 >= 0 && var25 >= 0 && var24 < class231.field3184 && var25 < class209.field2840) {
                    int var26 = var24 << 7;
                    int var27 = var25 << 7;
                    int var28 = class272.field3682[3].method271(var24, var25) - 1000;
                    int var29 = class275.field3707 == null ? class272.field3682[0].method271(var24, var25) + 128 : class275.field3707[0].method271(var24, var25) + 128;
                    class379.field5356[var18][var23] = class191.field2407.method1594(var26, var28, var27, var26, var29, var27);
                } else {
                    class379.field5356[var18][var23] = false;
                }
            }
        }
        for (int var19 = 0; var19 < class430.field6316 + class430.field6316 + 1; var19++) {
            for (int var22 = 0; var22 < class430.field6316 + class430.field6316 + 1; var22++) {
                class342.field4573[var19][var22] = class379.field5356[var19][var22] || class379.field5356[var19 + 1][var22] || class379.field5356[var19][var22 + 1] || class379.field5356[var19 + 1][var22 + 1];
            }
        }
        class169.field2137 = arg8;
        class149.field1898 = arg9;
        class94.field1094 = arg10;
        class452.field6572 = arg11;
        class99.field1167 = arg12;
        class63.method341();
        class339.method1973(10359);
        for (class321 var20 = (class321) class171.field2154.method986((byte) 115); var20 != null; var20 = (class321) class171.field2154.method984((byte) 126)) {
            var20.method982((byte) 83);
            class310.method1816(0, var20);
        }
        if (class160.field2064) {
            for (int var21 = 0; var21 < class436.field6376; var21++) {
                class227.field3090[var21].method565(arg17, -12, arg1);
            }
        }
        if (arg2 > 1) {
            class191.field2407.method1588(0);
            if (class211.field2862 == null || class211.field2862 instanceof class200) {
                class211.field2862 = new class368();
            }
        } else if (class211.field2862 == null || class211.field2862 instanceof class368) {
            class211.field2862 = new class200();
        }
        class211.field2862.method1077(arg2, (byte) 120);
        class211.field2862.method1076((byte) 115);
        if (class341.field4571 != null) {
            class335.method1918(true);
            class211.field2862.method1081(22, (byte) 115);
            class282.method1663(arg2, (byte[][][]) null, 0, (byte) 0, arg15, arg16);
            class211.field2862.method1076((byte) 54);
            class211.field2862.method1081(23, (byte) 86);
            class335.method1918(false);
        }
        class282.method1663(arg2, arg7, arg13, arg14, arg15, arg16);
        class211.field2862.method1076((byte) 66);
        class211.field2862.method1072((byte) -113);
        class211.field2862.method1076((byte) -98);
        if (arg2 > 1) {
            class191.field2407.method1618(0);
        }
        class191.field2407.method1607(0, (class349[]) null);
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(ILtq;)V", line = 494)
    public static final void method1438(int arg0, class250 arg1) {
        field3474++;
        int var2 = arg1.method1383(arg0 ^ 0x13DB);
        class337.field4489 = new class272[var2];
        if (arg0 != 4900) {
            method1432((class322) null, (class369) null, (byte) 36);
        }
        for (int var3 = 0; var3 < var2; var3++) {
            class337.field4489[var3] = new class272();
            class337.field4489[var3].field3675 = arg1.method1383(255);
            class337.field4489[var3].field3673 = arg1.method1361(arg0 + 11505);
        }
        class7.field64 = arg1.method1383(255);
        class6.field54 = arg1.method1383(arg0 ^ 0x13DB);
        class303.field4119 = arg1.method1383(255);
        class193.field2437 = new class156[class6.field54 + 1 - class7.field64];
        for (int var4 = 0; var4 < class303.field4119; var4++) {
            int var5 = arg1.method1383(arg0 - 4645);
            class156 var6 = class193.field2437[var5] = new class156();
            var6.field3475 = arg1.method1350(31351);
            var6.field3484 = arg1.method1359(arg0 - 4645);
            var6.field1975 = class7.field64 + var5;
            var6.field1981 = arg1.method1361(arg0 ^ 0x5331);
            var6.field1983 = arg1.method1361(16405);
        }
        class23.field222 = arg1.method1359(255);
        class327.field4338 = true;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(ILjava/lang/Throwable;Ljava/lang/String;)V", line = 557)
    public static final void method1439(int arg0, Throwable arg1, String arg2) {
        field3483++;
        try {
            String var3 = "";
            if (arg1 != null) {
                var3 = class356.method2171(arg0 - 35604, arg1);
            }
            if (arg2 != null) {
                if (arg1 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg2;
            }
            class342.method2000(var3, (byte) 11);
            String var4 = class365.method2215(":", "%3a", var3, 107);
            String var5 = class365.method2215("@", "%40", var4, arg0 - 22418);
            String var6 = class365.method2215("&", "%26", var5, -109);
            String var7 = class365.method2215("#", "%23", var6, arg0 - 22236);
            if (class291.field3958.field6532 != null) {
                if (arg0 != 22292) {
                    field3495 = null;
                }
                class304 var8 = class291.field3958.method2774(new URL(class291.field3958.field6532.getCodeBase(), "clienterror.ws?c=" + class436.field6381 + "&u=" + class439.field6425 + "&v1=" + class450.field6535 + "&v2=" + class450.field6541 + "&e=" + var7), 26648);
                while (var8.field4123 == 0) {
                    class370.method2235(1L, 10);
                }
                if (var8.field4123 == 1) {
                    DataInputStream var9 = (DataInputStream) var8.field4126;
                    var9.read();
                    var9.close();
                }
            }
        } catch (Exception var10) {
        }
    }

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "(B)V", line = 617)
    public static final void method1440(byte arg0) {
        field3487++;
        class352.method2159(25, (byte) 65);
        int var1 = 127 % ((arg0 - 2) / 37);
        class162.method873(1282152096);
        System.gc();
    }
}
