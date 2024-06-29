import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public class class80 {

    @OriginalMember(owner = "client!m", name = "a", descriptor = "Lrd;")
    private static class114 field1807 = class84.method656("System update in: ", (byte) 127);

    @OriginalMember(owner = "client!m", name = "d", descriptor = "I")
    public static int field1810 = 0;

    @OriginalMember(owner = "client!m", name = "h", descriptor = "Lrd;")
    public static class114 field1814 = class84.method656("backvmid2", (byte) 120);

    @OriginalMember(owner = "client!m", name = "g", descriptor = "Lrd;")
    public static class114 field1813 = class84.method656("null", (byte) 116);

    @OriginalMember(owner = "client!m", name = "f", descriptor = "Lrd;")
    public static class114 field1812 = class84.method656("gleiten:", (byte) 127);

    @OriginalMember(owner = "client!m", name = "c", descriptor = "Lrd;")
    public static class114 field1809 = field1807;

    @OriginalMember(owner = "client!m", name = "k", descriptor = "Lrd;")
    public static class114 field1817 = class84.method656("Moderator)2Option: Spieler f-Ur 48 Stunden stumm schalten: <AUS>", (byte) 124);

    @OriginalMember(owner = "client!m", name = "n", descriptor = "Lrd;")
    public static class114 field1820 = class84.method656("Anmelde)2Zeitlimit -Uberschritten)3", (byte) 125);

    @OriginalMember(owner = "client!m", name = "b", descriptor = "I")
    public static int field1808;

    @OriginalMember(owner = "client!m", name = "i", descriptor = "I")
    public static int field1815;

    @OriginalMember(owner = "client!m", name = "j", descriptor = "I")
    public static int field1816;

    @OriginalMember(owner = "client!m", name = "l", descriptor = "I")
    public static int field1818;

    @OriginalMember(owner = "client!m", name = "m", descriptor = "Lh;")
    public static class49 field1819;

    @OriginalMember(owner = "client!m", name = "e", descriptor = "Lke;")
    public static class73 field1811;

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(B)V")
    public static final void method633(byte arg0) {
        field1815++;
        if (arg0 != -2) {
            method636(null, 2, -16, -70, 56, null, null);
        }
        while (class77.field1752.method1058(-89, class74.field1697) >= 11) {
            int var1 = class77.field1752.method1050((byte) 87, 11);
            if (var1 == 2047) {
                break;
            }
            boolean var2 = false;
            if (class36.field762[var1] == null) {
                var2 = true;
                class36.field762[var1] = new class126();
                if (class120.field2810[var1] != null) {
                    class36.field762[var1].method976(class120.field2810[var1], arg0 ^ 0x1);
                }
            }
            class110.field2573[class8.field116++] = var1;
            class126 var3 = class36.field762[var1];
            var3.field714 = class20.field370;
            int var4 = class77.field1752.method1050((byte) 66, 5);
            if (var4 > 15) {
                var4 -= 32;
            }
            int var5 = class16.field330[class77.field1752.method1050((byte) 20, 3)];
            if (var2) {
                var3.field700 = var5;
            }
            int var6 = class77.field1752.method1050((byte) 14, 1);
            if (var6 == 1) {
                class118.field2771[class48.field1004++] = var1;
            }
            int var7 = class77.field1752.method1050((byte) 70, 5);
            if (var7 > 15) {
                var7 -= 32;
            }
            int var8 = class77.field1752.method1050((byte) 88, 1);
            var3.method255((byte) -121, var8 == 1, class7.field103.field758[0] + var7, class7.field103.field748[0] - -var4);
        }
        class77.field1752.method1055((byte) 61);
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(I)V")
    public static void method634(int arg0) {
        field1811 = null;
        field1814 = null;
        field1813 = null;
        if (arg0 != -627) {
            method634(-30);
        }
        field1812 = null;
        field1817 = null;
        field1820 = null;
        field1807 = null;
        field1809 = null;
        field1819 = null;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IIIII)V")
    public static final void method635(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1816++;
        int var5 = arg4;
        if (arg1 != -65) {
            field1813 = null;
        }
        while (var5 <= arg3 + arg4) {
            for (int var6 = arg0; var6 <= arg0 + arg2; var6++) {
                if (var6 >= 0 && var6 < 104 && var5 >= 0 && var5 < 104) {
                    class132.field3194[0][var6][var5] = 127;
                    if (arg0 == var6 && var6 > 0) {
                        class124.field2958[0][var6][var5] = class124.field2958[0][var6 - 1][var5];
                    }
                    if (arg0 + arg2 == var6 && var6 < 103) {
                        class124.field2958[0][var6][var5] = class124.field2958[0][var6 + 1][var5];
                    }
                    if (arg4 == var5 && var5 > 0) {
                        class124.field2958[0][var6][var5] = class124.field2958[0][var6][var5 - 1];
                    }
                    if (arg3 + arg4 == var5 && var5 < 103) {
                        class124.field2958[0][var6][var5] = class124.field2958[0][var6][var5 + 1];
                    }
                }
            }
            var5++;
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "([Ljava/lang/Object;IIIILnd;Lnd;)V")
    public static final void method636(Object[] arg0, int arg1, int arg2, int arg3, int arg4, class90 arg5, class90 arg6) {
        int var7 = (Integer) arg0[0];
        class142 var8 = class122.method953(24879, var7);
        field1808++;
        if (arg4 <= 19) {
            field1820 = null;
        }
        if (var8 == null) {
            return;
        }
        int var9 = -1;
        int var10 = 0;
        int[] var11 = var8.field3397;
        int[] var12 = var8.field3393;
        int var13 = 0;
        byte var14 = -1;
        try {
            int var15 = 0;
            class9.field138 = new class114[var8.field3398];
            class69.field1500 = new int[var8.field3385];
            int var16 = 0;
            for (int var17 = 1; var17 < arg0.length; var17++) {
                if (arg0[var17] instanceof Integer) {
                    int var18 = (Integer) arg0[var17];
                    if (var18 == -2147483647) {
                        var18 = arg1;
                    }
                    if (var18 == -2147483646) {
                        var18 = arg3;
                    }
                    if (var18 == -2147483645) {
                        var18 = arg6 == null ? -1 : arg6.field2060;
                    }
                    if (var18 == -2147483644) {
                        var18 = arg2;
                    }
                    if (var18 == -2147483643) {
                        var18 = arg6 == null ? -1 : arg6.field2107;
                    }
                    if (var18 == -2147483642) {
                        var18 = arg5 == null ? -1 : arg5.field2060;
                    }
                    if (var18 == -2147483641) {
                        var18 = arg5 == null ? -1 : arg5.field2107;
                    }
                    class69.field1500[var15++] = var18;
                } else if (arg0[var17] instanceof class114) {
                    class9.field138[var16++] = (class114) arg0[var17];
                }
            }
            int var19 = 0;
            label1238: while (true) {
                var19++;
                if (var19 > 200000) {
                    throw new RuntimeException("slow");
                }
                var9++;
                int var183 = var11[var9];
                if (var183 < 100) {
                    if (var183 == 0) {
                        class117.field2742[var10++] = var12[var9];
                        continue;
                    }
                    if (var183 == 1) {
                        int var20 = var12[var9];
                        class117.field2742[var10++] = class123.field2896[var20];
                        continue;
                    }
                    if (var183 == 2) {
                        int var21 = var12[var9];
                        var10--;
                        class123.field2896[var21] = class117.field2742[var10];
                        continue;
                    }
                    if (var183 == 3) {
                        class18.field340[var13++] = var8.field3378[var9];
                        continue;
                    }
                    if (var183 == 6) {
                        var9 += var12[var9];
                        continue;
                    }
                    if (var183 == 7) {
                        var10 -= 2;
                        if (class117.field2742[var10 + 1] != class117.field2742[var10]) {
                            var9 += var12[var9];
                        }
                        continue;
                    }
                    if (var183 == 8) {
                        var10 -= 2;
                        if (class117.field2742[var10 + 1] == class117.field2742[var10]) {
                            var9 += var12[var9];
                        }
                        continue;
                    }
                    if (var183 == 9) {
                        var10 -= 2;
                        if (class117.field2742[var10] < class117.field2742[var10 + 1]) {
                            var9 += var12[var9];
                        }
                        continue;
                    }
                    if (var183 == 10) {
                        var10 -= 2;
                        if (class117.field2742[var10 + 1] < class117.field2742[var10]) {
                            var9 += var12[var9];
                        }
                        continue;
                    }
                    if (var183 == 21) {
                        if (class48.field1008 == 0) {
                            return;
                        }
                        class20 var22 = class13.field290[--class48.field1008];
                        class9.field138 = var22.field362;
                        var9 = var22.field361;
                        class69.field1500 = var22.field367;
                        var8 = var22.field354;
                        var11 = var8.field3397;
                        var12 = var8.field3393;
                        continue;
                    }
                    if (var183 == 25) {
                        int var23 = var12[var9];
                        class117.field2742[var10++] = class92.method714((byte) 69, var23);
                        continue;
                    }
                    if (var183 == 27) {
                        int var24 = var12[var9];
                        var10--;
                        class103.method793(class117.field2742[var10], var24, (byte) -81);
                        continue;
                    }
                    if (var183 == 31) {
                        var10 -= 2;
                        if (class117.field2742[var10 + 1] >= class117.field2742[var10]) {
                            var9 += var12[var9];
                        }
                        continue;
                    }
                    if (var183 == 32) {
                        var10 -= 2;
                        if (class117.field2742[var10] >= class117.field2742[var10 + 1]) {
                            var9 += var12[var9];
                        }
                        continue;
                    }
                    if (var183 == 33) {
                        class117.field2742[var10++] = class69.field1500[var12[var9]];
                        continue;
                    }
                    int var10001;
                    if (var183 == 34) {
                        var10001 = var12[var9];
                        var10--;
                        class69.field1500[var10001] = class117.field2742[var10];
                        continue;
                    }
                    if (var183 == 35) {
                        class18.field340[var13++] = class9.field138[var12[var9]];
                        continue;
                    }
                    if (var183 == 36) {
                        var10001 = var12[var9];
                        var13--;
                        class9.field138[var10001] = class18.field340[var13];
                        continue;
                    }
                    if (var183 == 37) {
                        int var25 = var12[var9];
                        var13 -= var25;
                        class114 var26 = class61.method501(class18.field340, (byte) -94, var25, var13);
                        class18.field340[var13++] = var26;
                        continue;
                    }
                    if (var183 == 38) {
                        var10--;
                        continue;
                    }
                    if (var183 == 39) {
                        var13--;
                        continue;
                    }
                    if (var183 == 40) {
                        int var27 = var12[var9];
                        class142 var28 = class122.method953(24879, var27);
                        class114[] var29 = new class114[var28.field3398];
                        int[] var30 = new int[var28.field3385];
                        for (int var31 = 0; var31 < var28.field3388; var31++) {
                            var30[var31] = class117.field2742[var10 + var31 - var28.field3388];
                        }
                        for (int var32 = 0; var32 < var28.field3386; var32++) {
                            var29[var32] = class18.field340[var32 + var13 - var28.field3386];
                        }
                        var13 -= var28.field3386;
                        var10 -= var28.field3388;
                        class20 var33 = new class20();
                        var33.field362 = class9.field138;
                        var33.field361 = var9;
                        var9 = -1;
                        var33.field367 = class69.field1500;
                        var33.field354 = var8;
                        var8 = var28;
                        class13.field290[class48.field1008++] = var33;
                        var11 = var28.field3397;
                        var12 = var28.field3393;
                        class69.field1500 = var30;
                        class9.field138 = var29;
                        continue;
                    }
                    if (var183 == 42) {
                        class117.field2742[var10++] = class79.field1799[var12[var9]];
                        continue;
                    }
                    if (var183 == 43) {
                        var10001 = var12[var9];
                        var10--;
                        class79.field1799[var10001] = class117.field2742[var10];
                        continue;
                    }
                    if (var183 == 44) {
                        var10--;
                        int var34 = class117.field2742[var10];
                        int var35 = var12[var9] >> 16;
                        int var36 = var12[var9] & 0xFFFF;
                        if (var34 >= 0 && var34 <= 5000) {
                            byte var37 = -1;
                            class24.field463[var35] = var34;
                            if (var36 == 105) {
                                var37 = 0;
                            }
                            int var38 = 0;
                            while (true) {
                                if (var38 >= var34) {
                                    continue label1238;
                                }
                                class70.field1535[var35][var38] = var37;
                                var38++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var183 == 45) {
                        int var39 = var12[var9];
                        var10--;
                        int var40 = class117.field2742[var10];
                        if (var40 >= 0 && var40 < class24.field463[var39]) {
                            class117.field2742[var10++] = class70.field1535[var39][var40];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var183 == 46) {
                        int var41 = var12[var9];
                        var10 -= 2;
                        int var42 = class117.field2742[var10];
                        if (var42 >= 0 && class24.field463[var41] > var42) {
                            class70.field1535[var41][var42] = class117.field2742[var10 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                }
                boolean var43;
                if (var12[var9] == 1) {
                    var43 = true;
                } else {
                    var43 = false;
                }
                if (var183 < 1000) {
                    if (var183 == 100) {
                        var10 -= 3;
                        int var44 = class117.field2742[var10 + 2];
                        int var45 = class117.field2742[var10 + 1];
                        int var46 = class117.field2742[var10];
                        if (var45 == 0) {
                            throw new RuntimeException();
                        }
                        class90 var47 = class14.method115(65535, var46);
                        if (var47.field2031 == null) {
                            var47.field2031 = new class90[var44 + 1];
                        }
                        if (var47.field2031.length <= var44) {
                            class90[] var48 = new class90[var44 + 1];
                            for (int var49 = 0; var49 < var47.field2031.length; var49++) {
                                var48[var49] = var47.field2031[var49];
                            }
                            var47.field2031 = var48;
                        }
                        if (var44 > 0 && var47.field2031[var44 - 1] == null) {
                            throw new RuntimeException("Gap at:" + (var44 - 1));
                        }
                        class90 var50 = new class90();
                        var50.field2024 = var45;
                        var50.field2107 = var44;
                        var50.field2011 = true;
                        var50.field2103 = var50.field2060 = var47.field2060;
                        var47.field2031[var44] = var50;
                        if (var43) {
                            class117.field2731 = var50;
                        } else {
                            class82.field1848 = var50;
                        }
                        class110.method843(var47, (byte) -57);
                        continue;
                    }
                    if (var183 == 101) {
                        class90 var51 = var43 ? class117.field2731 : class82.field1848;
                        class90 var52 = class14.method115(65535, var51.field2060);
                        var52.field2031[var51.field2107] = null;
                        class110.method843(var52, (byte) -57);
                        continue;
                    }
                    if (var183 == 102) {
                        var10--;
                        class90 var53 = class14.method115(65535, class117.field2742[var10]);
                        var53.field2031 = null;
                        class110.method843(var53, (byte) -57);
                        continue;
                    }
                    if (var183 == 200) {
                        var10 -= 2;
                        int var54 = class117.field2742[var10];
                        int var55 = class117.field2742[var10 + 1];
                        class90 var56 = class92.method719((byte) -76, var54, var55);
                        if (var56 != null && var55 != -1) {
                            class117.field2742[var10++] = 1;
                            if (var43) {
                                class117.field2731 = var56;
                            } else {
                                class82.field1848 = var56;
                            }
                            continue;
                        }
                        class117.field2742[var10++] = 0;
                        continue;
                    }
                } else if (var183 >= 1000 && var183 < 1100 || !(var183 < 2000 || var183 >= 2100)) {
                    class90 var57;
                    if (var183 < 2000) {
                        var57 = var43 ? class117.field2731 : class82.field1848;
                    } else {
                        var183 -= 1000;
                        var10--;
                        var57 = class14.method115(65535, class117.field2742[var10]);
                    }
                    class110.method843(var57, (byte) -57);
                    if (var183 == 1000) {
                        var10 -= 2;
                        var57.field2015 = class117.field2742[var10];
                        var57.field2038 = class117.field2742[var10 + 1];
                        continue;
                    }
                    if (var183 == 1001) {
                        var10 -= 2;
                        var57.field2032 = class117.field2742[var10];
                        var57.field2044 = class117.field2742[var10 + 1];
                        continue;
                    }
                    if (var183 == 1003) {
                        var10--;
                        var57.field2092 = class117.field2742[var10] == 1;
                        continue;
                    }
                } else if (var183 >= 1100 && var183 < 1200 || var183 >= 2100 && var183 < 2200) {
                    class90 var58;
                    if (var183 < 2000) {
                        var58 = var43 ? class117.field2731 : class82.field1848;
                    } else {
                        var10--;
                        var58 = class14.method115(65535, class117.field2742[var10]);
                        var183 -= 1000;
                    }
                    class110.method843(var58, (byte) -57);
                    if (var183 == 1100) {
                        var10 -= 2;
                        var58.field2043 = class117.field2742[var10];
                        if (var58.field2116 - var58.field2032 < var58.field2043) {
                            var58.field2043 = var58.field2116 - var58.field2032;
                        }
                        if (var58.field2043 < 0) {
                            var58.field2043 = 0;
                        }
                        var58.field2013 = class117.field2742[var10 + 1];
                        if (var58.field2013 > var58.field2017 - var58.field2044) {
                            var58.field2013 = var58.field2017 - var58.field2044;
                        }
                        if (var58.field2013 < 0) {
                            var58.field2013 = 0;
                        }
                        continue;
                    }
                    if (var183 == 1101) {
                        var10--;
                        var58.field2004 = class117.field2742[var10];
                        continue;
                    }
                    if (var183 == 1102) {
                        var10--;
                        var58.field2112 = class117.field2742[var10] == 1;
                        continue;
                    }
                    if (var183 == 1103) {
                        var10--;
                        var58.field2073 = class117.field2742[var10];
                        continue;
                    }
                    if (var183 == 1104) {
                        var10--;
                        var58.field2075 = class117.field2742[var10];
                        continue;
                    }
                    if (var183 == 1105) {
                        var10--;
                        var58.field2005 = class117.field2742[var10];
                        continue;
                    }
                    if (var183 == 1106) {
                        var10--;
                        var58.field2110 = class117.field2742[var10];
                        continue;
                    }
                    if (var183 == 1107) {
                        var10--;
                        var58.field2034 = class117.field2742[var10] == 1;
                        continue;
                    }
                    if (var183 == 1108) {
                        var58.field2123 = 1;
                        var10--;
                        var58.field2067 = class117.field2742[var10];
                        continue;
                    }
                    if (var183 == 1109) {
                        var10 -= 6;
                        var58.field2113 = class117.field2742[var10];
                        var58.field2057 = class117.field2742[var10 + 1];
                        var58.field2117 = class117.field2742[var10 + 2];
                        var58.field2127 = class117.field2742[var10 + 3];
                        var58.field2023 = class117.field2742[var10 + 4];
                        var58.field2008 = class117.field2742[var10 + 5];
                        continue;
                    }
                    if (var183 == 1110) {
                        var10--;
                        var58.field2022 = class117.field2742[var10];
                        continue;
                    }
                    if (var183 == 1111) {
                        var10--;
                        var58.field2047 = class117.field2742[var10] == 1;
                        continue;
                    }
                    if (var183 == 1112) {
                        var13--;
                        var58.field2025 = class18.field340[var13];
                        continue;
                    }
                    if (var183 == 1113) {
                        var10--;
                        var58.field2039 = class117.field2742[var10];
                        continue;
                    }
                    if (var183 == 1114) {
                        var10 -= 3;
                        var58.field2100 = class117.field2742[var10];
                        var58.field2074 = class117.field2742[var10 + 1];
                        var58.field2006 = class117.field2742[var10 + 2];
                        continue;
                    }
                    if (var183 == 1115) {
                        var10--;
                        var58.field2101 = class117.field2742[var10] == 1;
                        continue;
                    }
                    if (var183 == 1116) {
                        var10--;
                        var58.field2102 = class117.field2742[var10];
                        continue;
                    }
                    if (var183 == 1117) {
                        var10--;
                        var58.field2126 = class117.field2742[var10];
                        continue;
                    }
                    if (var183 == 1118) {
                        var10--;
                        var58.field2046 = class117.field2742[var10] == 1;
                        continue;
                    }
                    if (var183 == 1119) {
                        var10--;
                        var58.field2029 = class117.field2742[var10] == 1;
                        continue;
                    }
                    if (var183 == 1120) {
                        var10 -= 2;
                        var58.field2116 = class117.field2742[var10];
                        var58.field2017 = class117.field2742[var10 + 1];
                        continue;
                    }
                } else if (var183 >= 1200 && var183 < 1300 || !(var183 < 2200 || var183 >= 2300)) {
                    class90 var59;
                    if (var183 < 2000) {
                        var59 = var43 ? class117.field2731 : class82.field1848;
                    } else {
                        var183 -= 1000;
                        var10--;
                        var59 = class14.method115(65535, class117.field2742[var10]);
                    }
                    class110.method843(var59, (byte) -57);
                    if (var183 == 1200) {
                        var10 -= 2;
                        int var60 = class117.field2742[var10 + 1];
                        int var61 = class117.field2742[var10];
                        var59.field2063 = var60;
                        var59.field2099 = var61;
                        class52 var62 = class128.method988(var61, false);
                        var59.field2057 = var62.field1090;
                        var59.field2023 = var62.field1105;
                        var59.field2117 = var62.field1125;
                        var59.field2113 = var62.field1124;
                        var59.field2008 = var62.field1112;
                        var59.field2127 = var62.field1089;
                        if (var59.field2032 > 0) {
                            var59.field2008 = var59.field2008 * 32 / var59.field2032;
                        }
                        continue;
                    }
                    if (var183 == 1201) {
                        var59.field2123 = 2;
                        var10--;
                        var59.field2067 = class117.field2742[var10];
                        continue;
                    }
                    if (var183 == 1202) {
                        var59.field2123 = 3;
                        var59.field2067 = class7.field103.field2995.method713(89);
                        continue;
                    }
                } else if (var183 >= 1300 && var183 < 1400 || var183 >= 2300 && var183 < 2400) {
                    class90 var63;
                    if (var183 < 2000) {
                        var63 = var43 ? class117.field2731 : class82.field1848;
                    } else {
                        var10--;
                        var63 = class14.method115(65535, class117.field2742[var10]);
                        var183 -= 1000;
                    }
                    if (var183 == 1300) {
                        var10--;
                        int var64 = class117.field2742[var10] - 1;
                        if (var64 >= 0 && var64 <= 9) {
                            var13--;
                            var63.method696(class18.field340[var13], false, var64);
                            continue;
                        }
                        var13--;
                        continue;
                    }
                    if (var183 == 1301) {
                        var10 -= 2;
                        int var65 = class117.field2742[var10 + 1];
                        int var66 = class117.field2742[var10];
                        var63.field2030 = class92.method719((byte) -110, var66, var65);
                        continue;
                    }
                    if (var183 == 1302) {
                        var10--;
                        var63.field2048 = class117.field2742[var10] == 1;
                        continue;
                    }
                    if (var183 == 1303) {
                        var10--;
                        var63.field2080 = class117.field2742[var10];
                        continue;
                    }
                    if (var183 == 1304) {
                        var10--;
                        var63.field2045 = class117.field2742[var10];
                        continue;
                    }
                    if (var183 == 1305) {
                        var13--;
                        var63.field2106 = class18.field340[var13];
                        continue;
                    }
                    if (var183 == 1306) {
                        var13--;
                        var63.field2089 = class18.field340[var13];
                        continue;
                    }
                } else {
                    if (var183 >= 1400 && var183 < 1500 || var183 >= 2400 && var183 < 2500) {
                        class90 var177;
                        if (var183 >= 2000) {
                            var183 -= 1000;
                            var10--;
                            var177 = class14.method115(65535, class117.field2742[var10]);
                        } else {
                            var177 = var43 ? class117.field2731 : class82.field1848;
                        }
                        var13--;
                        class114 var178 = class18.field340[var13];
                        Object[] var179 = new Object[var178.method854(-29348) + 1];
                        for (int var180 = var179.length - 1; var180 >= 1; var180--) {
                            if (var178.method861(var180 - 1, -14412) == 115) {
                                var13--;
                                var179[var180] = class18.field340[var13];
                            } else {
                                var10--;
                                var179[var180] = Integer.valueOf(class117.field2742[var10]);
                            }
                        }
                        var10--;
                        var179[0] = Integer.valueOf(class117.field2742[var10]);
                        if (var183 == 1410) {
                            var177.field2009 = var179;
                        }
                        if (var183 == 1400) {
                            var177.field2040 = var179;
                        }
                        if (var183 == 1412) {
                            var177.field2130 = var179;
                        }
                        var177.field2014 = true;
                        if (var183 == 1414) {
                            var177.field2059 = var179;
                        }
                        if (var183 == 1404) {
                            var177.field2095 = var179;
                        }
                        if (var183 == 1415) {
                            var177.field2097 = var179;
                        }
                        if (var183 == 1411) {
                            var177.field2053 = var179;
                        }
                        if (var183 == 1407) {
                            var177.field2120 = var179;
                        }
                        if (var183 == 1402) {
                            var177.field2087 = var179;
                        }
                        if (var183 == 1409) {
                            var177.field2121 = var179;
                        }
                        if (var183 == 1408) {
                            var177.field2035 = var179;
                        }
                        if (var183 == 1416) {
                            var177.field2064 = var179;
                        }
                        if (var183 == 1401) {
                            var177.field2111 = var179;
                        }
                        if (var183 == 1406) {
                            var177.field2093 = var179;
                        }
                        if (var183 == 1403) {
                            var177.field2033 = var179;
                        }
                        if (var183 == 1413) {
                            var177.field2088 = var179;
                        }
                        if (var183 == 1405) {
                            var177.field2077 = var179;
                        }
                        if (var183 == 1417) {
                            var177.field2079 = var179;
                        }
                        continue;
                    }
                    if (var183 < 1600) {
                        class90 var67 = var43 ? class117.field2731 : class82.field1848;
                        if (var183 == 1500) {
                            class117.field2742[var10++] = var67.field2015;
                            continue;
                        }
                        if (var183 == 1501) {
                            class117.field2742[var10++] = var67.field2038;
                            continue;
                        }
                        if (var183 == 1502) {
                            class117.field2742[var10++] = var67.field2032;
                            continue;
                        }
                        if (var183 == 1503) {
                            class117.field2742[var10++] = var67.field2044;
                            continue;
                        }
                        if (var183 == 1504) {
                            class117.field2742[var10++] = var67.field2092 ? 1 : 0;
                            continue;
                        }
                        if (var183 == 1505) {
                            class117.field2742[var10++] = var67.field2103;
                            continue;
                        }
                    } else if (var183 < 1700) {
                        class90 var176 = var43 ? class117.field2731 : class82.field1848;
                        if (var183 == 1600) {
                            class117.field2742[var10++] = var176.field2043;
                            continue;
                        }
                        if (var183 == 1601) {
                            class117.field2742[var10++] = var176.field2013;
                            continue;
                        }
                        if (var183 == 1602) {
                            class18.field340[var13++] = var176.field2025;
                            continue;
                        }
                        if (var183 == 1603) {
                            class117.field2742[var10++] = var176.field2116;
                            continue;
                        }
                        if (var183 == 1604) {
                            class117.field2742[var10++] = var176.field2017;
                            continue;
                        }
                        if (var183 == 1605) {
                            class117.field2742[var10++] = var176.field2008;
                            continue;
                        }
                    } else if (var183 < 1800) {
                        class90 var68 = var43 ? class117.field2731 : class82.field1848;
                        if (var183 == 1700) {
                            class117.field2742[var10++] = var68.field2099;
                            continue;
                        }
                        if (var183 == 1701) {
                            if (var68.field2099 == -1) {
                                class117.field2742[var10++] = 0;
                            } else {
                                class117.field2742[var10++] = var68.field2063;
                            }
                            continue;
                        }
                        if (var183 == 1702) {
                            class117.field2742[var10++] = var68.field2107;
                            continue;
                        }
                    } else if (var183 < 1900) {
                        class90 var69 = var43 ? class117.field2731 : class82.field1848;
                        if (var183 == 1800) {
                            class117.field2742[var10++] = class121.method941((byte) 69, class39.method278(var69, 1572721824));
                            continue;
                        }
                    } else if (var183 < 2600) {
                        var10--;
                        class90 var175 = class14.method115(65535, class117.field2742[var10]);
                        if (var183 == 2500) {
                            class117.field2742[var10++] = var175.field2015;
                            continue;
                        }
                        if (var183 == 2501) {
                            class117.field2742[var10++] = var175.field2038;
                            continue;
                        }
                        if (var183 == 2502) {
                            class117.field2742[var10++] = var175.field2032;
                            continue;
                        }
                        if (var183 == 2503) {
                            class117.field2742[var10++] = var175.field2044;
                            continue;
                        }
                        if (var183 == 2504) {
                            class117.field2742[var10++] = var175.field2092 ? 1 : 0;
                            continue;
                        }
                        if (var183 == 2505) {
                            class117.field2742[var10++] = var175.field2103;
                            continue;
                        }
                    } else if (var183 < 2700) {
                        var10--;
                        class90 var174 = class14.method115(65535, class117.field2742[var10]);
                        if (var183 == 2600) {
                            class117.field2742[var10++] = var174.field2043;
                            continue;
                        }
                        if (var183 == 2601) {
                            class117.field2742[var10++] = var174.field2013;
                            continue;
                        }
                        if (var183 == 2602) {
                            class18.field340[var13++] = var174.field2025;
                            continue;
                        }
                        if (var183 == 2603) {
                            class117.field2742[var10++] = var174.field2116;
                            continue;
                        }
                        if (var183 == 2604) {
                            class117.field2742[var10++] = var174.field2017;
                            continue;
                        }
                        if (var183 == 2605) {
                            class117.field2742[var10++] = var174.field2008;
                            continue;
                        }
                    } else if (var183 < 2800) {
                        var10--;
                        class90 var70 = class14.method115(65535, class117.field2742[var10]);
                        if (var183 == 2700) {
                            class117.field2742[var10++] = var70.field2099;
                            continue;
                        }
                        if (var183 == 2701) {
                            if (var70.field2099 == -1) {
                                class117.field2742[var10++] = 0;
                            } else {
                                class117.field2742[var10++] = var70.field2063;
                            }
                            continue;
                        }
                    } else if (var183 < 2900) {
                        var10--;
                        class90 var71 = class14.method115(65535, class117.field2742[var10]);
                        if (var183 == 2800) {
                            class117.field2742[var10++] = class121.method941((byte) 69, class39.method278(var71, 1572721824));
                            continue;
                        }
                    } else if (var183 < 3200) {
                        if (var183 == 3100) {
                            var13--;
                            class114 var172 = class18.field340[var13];
                            class86.method660(class10.field151, var172, true, 0);
                            continue;
                        }
                        if (var183 == 3101) {
                            var10 -= 2;
                            class73.method594(class117.field2742[var10 + 1], class117.field2742[var10], class7.field103, 2);
                            continue;
                        }
                        if (var183 == 3102) {
                            var10--;
                            int var173 = class117.field2742[var10];
                            if (var173 >= 0 && var173 < class123.field2906.length && class123.field2906[var173] != -1) {
                                class102.field2351 = var173;
                                class103.field2410 = true;
                                class24.field460 = true;
                            }
                            continue;
                        }
                        if (var183 == 3103) {
                            class127.method981((byte) 99);
                            continue;
                        }
                    } else if (var183 < 3300) {
                        if (var183 == 3200) {
                            var10 -= 3;
                            class12.method94(class117.field2742[var10 + 1], -89, class117.field2742[var10 + 2], class117.field2742[var10]);
                            continue;
                        }
                        if (var183 == 3201) {
                            var10--;
                            class126.method973(0, class117.field2742[var10]);
                            continue;
                        }
                        if (var183 == 3202) {
                            var10 -= 2;
                            class46.method341(class117.field2742[var10], class117.field2742[var10 + 1], -96);
                            continue;
                        }
                    } else if (var183 < 3400) {
                        if (var183 == 3300) {
                            class117.field2742[var10++] = class20.field370;
                            continue;
                        }
                        if (var183 == 3301) {
                            var10 -= 2;
                            int var150 = class117.field2742[var10];
                            int var151 = class117.field2742[var10 + 1];
                            class117.field2742[var10++] = class99.method749(var151, var150, 0);
                            continue;
                        }
                        if (var183 == 3302) {
                            var10 -= 2;
                            int var152 = class117.field2742[var10];
                            int var153 = class117.field2742[var10 + 1];
                            class117.field2742[var10++] = class82.method638(var152, var153, true);
                            continue;
                        }
                        if (var183 == 3303) {
                            var10 -= 2;
                            int var154 = class117.field2742[var10];
                            int var155 = class117.field2742[var10 + 1];
                            class117.field2742[var10++] = class77.method613((byte) -104, var154, var155);
                            continue;
                        }
                        if (var183 == 3304) {
                            var10--;
                            int var156 = class117.field2742[var10];
                            class117.field2742[var10++] = class38.method270(var156, 5).field1793;
                            continue;
                        }
                        if (var183 == 3305) {
                            var10--;
                            int var157 = class117.field2742[var10];
                            class117.field2742[var10++] = class73.field1625[var157];
                            continue;
                        }
                        if (var183 == 3306) {
                            var10--;
                            int var158 = class117.field2742[var10];
                            class117.field2742[var10++] = class31.field632[var158];
                            continue;
                        }
                        if (var183 == 3307) {
                            var10--;
                            int var159 = class117.field2742[var10];
                            class117.field2742[var10++] = class98.field2229[var159];
                            continue;
                        }
                        if (var183 == 3308) {
                            int var160 = class20.field346;
                            int var161 = (class7.field103.field712 >> 7) + class72.field1611;
                            int var162 = (class7.field103.field756 >> 7) + class65.field1408;
                            class117.field2742[var10++] = (var160 << 28) + (var161 << 14) + var162;
                            continue;
                        }
                        if (var183 == 3309) {
                            var10--;
                            int var163 = class117.field2742[var10];
                            class117.field2742[var10++] = class96.method737(16383, var163 >> 14);
                            continue;
                        }
                        if (var183 == 3310) {
                            var10--;
                            int var164 = class117.field2742[var10];
                            class117.field2742[var10++] = var164 >> 28;
                            continue;
                        }
                        if (var183 == 3311) {
                            var10--;
                            int var165 = class117.field2742[var10];
                            class117.field2742[var10++] = class96.method737(16383, var165);
                            continue;
                        }
                        if (var183 == 3312) {
                            class117.field2742[var10++] = class135.field3292 ? 1 : 0;
                            continue;
                        }
                        if (var183 == 3313) {
                            var10 -= 2;
                            int var166 = class117.field2742[var10] + 32768;
                            int var167 = class117.field2742[var10 + 1];
                            class117.field2742[var10++] = class99.method749(var167, var166, 0);
                            continue;
                        }
                        if (var183 == 3314) {
                            var10 -= 2;
                            int var168 = class117.field2742[var10] + 32768;
                            int var169 = class117.field2742[var10 + 1];
                            class117.field2742[var10++] = class82.method638(var168, var169, true);
                            continue;
                        }
                        if (var183 == 3315) {
                            var10 -= 2;
                            int var170 = class117.field2742[var10] + 32768;
                            int var171 = class117.field2742[var10 + 1];
                            class117.field2742[var10++] = class77.method613((byte) 42, var170, var171);
                            continue;
                        }
                    } else if (var183 < 3700) {
                        if (var183 == 3600) {
                            if (class73.field1630 == 0) {
                                class117.field2742[var10++] = -2;
                            } else if (class73.field1630 == 1) {
                                class117.field2742[var10++] = -1;
                            } else {
                                class117.field2742[var10++] = class128.field3058;
                            }
                            continue;
                        }
                        if (var183 == 3601) {
                            var10--;
                            int var145 = class117.field2742[var10];
                            if (class73.field1630 == 2 && class128.field3058 > var145) {
                                class18.field340[var13++] = class5.field64[var145];
                                continue;
                            }
                            class18.field340[var13++] = class10.field151;
                            continue;
                        }
                        if (var183 == 3602) {
                            var10--;
                            int var146 = class117.field2742[var10];
                            if (class73.field1630 == 2 && class128.field3058 > var146) {
                                class117.field2742[var10++] = class34.field674[var146];
                                continue;
                            }
                            class117.field2742[var10++] = 0;
                            continue;
                        }
                        if (var183 == 3603) {
                            var10--;
                            int var147 = class117.field2742[var10];
                            if (class73.field1630 == 2 && class128.field3058 > var147) {
                                class117.field2742[var10++] = class67.field1444[var147];
                                continue;
                            }
                            class117.field2742[var10++] = 0;
                            continue;
                        }
                        if (var183 == 3604) {
                            var13--;
                            class114 var148 = class18.field340[var13];
                            var10--;
                            int var149 = class117.field2742[var10];
                            class140.method1118(var149, false, var148);
                            continue;
                        }
                    } else if (var183 < 4100) {
                        if (var183 == 4000) {
                            var10 -= 2;
                            int var112 = class117.field2742[var10 + 1];
                            int var113 = class117.field2742[var10];
                            class117.field2742[var10++] = var112 + var113;
                            continue;
                        }
                        if (var183 == 4001) {
                            var10 -= 2;
                            int var114 = class117.field2742[var10];
                            int var115 = class117.field2742[var10 + 1];
                            class117.field2742[var10++] = var114 - var115;
                            continue;
                        }
                        if (var183 == 4002) {
                            var10 -= 2;
                            int var116 = class117.field2742[var10 + 1];
                            int var117 = class117.field2742[var10];
                            class117.field2742[var10++] = var116 * var117;
                            continue;
                        }
                        if (var183 == 4003) {
                            var10 -= 2;
                            int var118 = class117.field2742[var10];
                            int var119 = class117.field2742[var10 + 1];
                            class117.field2742[var10++] = var118 / var119;
                            continue;
                        }
                        if (var183 == 4004) {
                            var10--;
                            int var120 = class117.field2742[var10];
                            class117.field2742[var10++] = (int) (Math.random() * (double) var120);
                            continue;
                        }
                        if (var183 == 4005) {
                            var10--;
                            int var121 = class117.field2742[var10];
                            class117.field2742[var10++] = (int) (Math.random() * (double) (var121 + 1));
                            continue;
                        }
                        if (var183 == 4006) {
                            var10 -= 5;
                            int var122 = class117.field2742[var10 + 1];
                            int var123 = class117.field2742[var10];
                            int var124 = class117.field2742[var10 + 2];
                            int var125 = class117.field2742[var10 + 3];
                            int var126 = class117.field2742[var10 + 4];
                            class117.field2742[var10++] = var123 + (var122 - var123) * (-var124 + var126) / (var125 - var124);
                            continue;
                        }
                        if (var183 == 4007) {
                            var10 -= 2;
                            int var127 = class117.field2742[var10];
                            int var128 = class117.field2742[var10 + 1];
                            class117.field2742[var10++] = var127 * var128 / 100 + var127;
                            continue;
                        }
                        if (var183 == 4008) {
                            var10 -= 2;
                            int var129 = class117.field2742[var10];
                            int var130 = class117.field2742[var10 + 1];
                            class117.field2742[var10++] = class38.method271(var129, 0x1 << var130);
                            continue;
                        }
                        if (var183 == 4009) {
                            var10 -= 2;
                            int var131 = class117.field2742[var10];
                            int var132 = class117.field2742[var10 + 1];
                            class117.field2742[var10++] = class96.method737(var131, -(0x1 << var132) - 1);
                            continue;
                        }
                        if (var183 == 4010) {
                            var10 -= 2;
                            int var133 = class117.field2742[var10];
                            int var134 = class117.field2742[var10 + 1];
                            class117.field2742[var10++] = class96.method737(0x1 << var134, var133) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var183 == 4011) {
                            var10 -= 2;
                            int var135 = class117.field2742[var10 + 1];
                            int var136 = class117.field2742[var10];
                            class117.field2742[var10++] = var136 % var135;
                            continue;
                        }
                        if (var183 == 4012) {
                            var10 -= 2;
                            int var137 = class117.field2742[var10];
                            int var138 = class117.field2742[var10 + 1];
                            if (var137 == 0) {
                                class117.field2742[var10++] = 0;
                            } else {
                                class117.field2742[var10++] = (int) Math.pow((double) var137, (double) var138);
                            }
                            continue;
                        }
                        if (var183 == 4013) {
                            var10 -= 2;
                            int var139 = class117.field2742[var10];
                            int var140 = class117.field2742[var10 + 1];
                            if (var139 == 0) {
                                class117.field2742[var10++] = 0;
                            } else if (var140 == 0) {
                                class117.field2742[var10++] = Integer.MAX_VALUE;
                            } else {
                                class117.field2742[var10++] = (int) Math.pow((double) var139, 1.0D / (double) var140);
                            }
                            continue;
                        }
                        if (var183 == 4014) {
                            var10 -= 2;
                            int var141 = class117.field2742[var10 + 1];
                            int var142 = class117.field2742[var10];
                            class117.field2742[var10++] = class96.method737(var141, var142);
                            continue;
                        }
                        if (var183 == 4015) {
                            var10 -= 2;
                            int var143 = class117.field2742[var10 + 1];
                            int var144 = class117.field2742[var10];
                            class117.field2742[var10++] = class38.method271(var143, var144);
                            continue;
                        }
                    } else if (var183 < 4200) {
                        if (var183 == 4100) {
                            var13--;
                            class114 var72 = class18.field340[var13];
                            var10--;
                            int var73 = class117.field2742[var10];
                            class18.field340[var13++] = class101.method786((byte) 126, new class114[] { var72, class14.method113(var73, -31766) });
                            continue;
                        }
                        if (var183 == 4101) {
                            var13 -= 2;
                            class114 var74 = class18.field340[var13 + 1];
                            class114 var75 = class18.field340[var13];
                            class18.field340[var13++] = class101.method786((byte) 127, new class114[] { var75, var74 });
                            continue;
                        }
                        if (var183 == 4102) {
                            var13--;
                            class114 var76 = class18.field340[var13];
                            var10--;
                            int var77 = class117.field2742[var10];
                            class18.field340[var13++] = class101.method786((byte) 125, new class114[] { var76, class107.method819(var77, true, -1) });
                            continue;
                        }
                        if (var183 == 4103) {
                            var13--;
                            class114 var78 = class18.field340[var13];
                            class18.field340[var13++] = var78.method888(-34);
                            continue;
                        }
                        if (var183 == 4104) {
                            var10--;
                            int var79 = class117.field2742[var10];
                            long var80 = (long) var79 * 86400000L + 1014768000000L;
                            class55.field1163.setTime(new Date(var80));
                            int var82 = class55.field1163.get(5);
                            int var83 = class55.field1163.get(2);
                            int var84 = class55.field1163.get(1);
                            class18.field340[var13++] = class101.method786((byte) 126, new class114[] { class14.method113(var82, -31766), class145.field3449, class112.field2606[var83], class145.field3449, class14.method113(var84, -31766) });
                            continue;
                        }
                        if (var183 == 4105) {
                            var13 -= 2;
                            class114 var85 = class18.field340[var13];
                            class114 var86 = class18.field340[var13 + 1];
                            if (class7.field103.field2995 != null && class7.field103.field2995.field2161) {
                                class18.field340[var13++] = var86;
                                continue;
                            }
                            class18.field340[var13++] = var85;
                            continue;
                        }
                        if (var183 == 4106) {
                            var10--;
                            int var87 = class117.field2742[var10];
                            class18.field340[var13++] = class14.method113(var87, -31766);
                            continue;
                        }
                        if (var183 == 4107) {
                            var13 -= 2;
                            class117.field2742[var10++] = class18.field340[var13].method857(class18.field340[var13 + 1], 22941);
                            continue;
                        }
                        if (var183 == 4108) {
                            var10 -= 2;
                            int var88 = class117.field2742[var10];
                            var13--;
                            class114 var89 = class18.field340[var13];
                            int var90 = class117.field2742[var10 + 1];
                            byte[] var91 = field1811.method762(var90, 0, (byte) 66);
                            class45 var92 = new class45(var91);
                            class117.field2742[var10++] = var92.method328(var89, var88);
                            continue;
                        }
                        if (var183 == 4109) {
                            var10 -= 2;
                            int var93 = class117.field2742[var10 + 1];
                            int var94 = class117.field2742[var10];
                            var13--;
                            class114 var95 = class18.field340[var13];
                            byte[] var96 = field1811.method762(var93, 0, (byte) 66);
                            class45 var97 = new class45(var96);
                            class117.field2742[var10++] = var97.method316(var95, var94);
                            continue;
                        }
                    } else if (var183 < 4300) {
                        if (var183 == 4200) {
                            var10--;
                            int var98 = class117.field2742[var10];
                            class18.field340[var13++] = class128.method988(var98, false).field1111;
                            continue;
                        }
                        if (var183 == 4201) {
                            var10 -= 2;
                            int var99 = class117.field2742[var10];
                            int var100 = class117.field2742[var10 + 1];
                            class52 var101 = class128.method988(var99, false);
                            if (var100 >= 1 && var100 <= 5 && var101.field1095[var100 - 1] != null) {
                                class18.field340[var13++] = var101.field1095[var100 - 1];
                                continue;
                            }
                            class18.field340[var13++] = class10.field151;
                            continue;
                        }
                        if (var183 == 4202) {
                            var10 -= 2;
                            int var102 = class117.field2742[var10 + 1];
                            int var103 = class117.field2742[var10];
                            class52 var104 = class128.method988(var103, false);
                            if (var102 >= 1 && var102 <= 5 && var104.field1100[var102 - 1] != null) {
                                class18.field340[var13++] = var104.field1100[var102 - 1];
                                continue;
                            }
                            class18.field340[var13++] = class10.field151;
                            continue;
                        }
                        if (var183 == 4203) {
                            var10--;
                            int var105 = class117.field2742[var10];
                            class117.field2742[var10++] = class128.method988(var105, false).field1118;
                            continue;
                        }
                        if (var183 == 4204) {
                            var10--;
                            int var106 = class117.field2742[var10];
                            class117.field2742[var10++] = class128.method988(var106, false).field1074 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var183 == 4205) {
                            var10--;
                            int var107 = class117.field2742[var10];
                            class52 var108 = class128.method988(var107, false);
                            if (var108.field1085 == -1 && var108.field1098 >= 0) {
                                class117.field2742[var10++] = var108.field1098;
                                continue;
                            }
                            class117.field2742[var10++] = var107;
                            continue;
                        }
                        if (var183 == 4206) {
                            var10--;
                            int var109 = class117.field2742[var10];
                            class52 var110 = class128.method988(var109, false);
                            if (var110.field1085 >= 0 && var110.field1098 >= 0) {
                                class117.field2742[var10++] = var110.field1098;
                                continue;
                            }
                            class117.field2742[var10++] = var109;
                            continue;
                        }
                        if (var183 == 4207) {
                            var10--;
                            int var111 = class117.field2742[var10];
                            class117.field2742[var10++] = class128.method988(var111, false).field1123 ? 1 : 0;
                            continue;
                        }
                    }
                }
                class121.method943((byte) 44, null, "CS2 - nosuchop:" + var183);
                return;
            }
        } catch (Exception var182) {
            class121.method943((byte) 122, var182, "CS2 - scr:" + var8.field1448 + " op:" + var14);
        }
    }
}
