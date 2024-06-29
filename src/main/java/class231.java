import java.io.UnsupportedEncodingException;
import java.util.Date;
import nativeadvert.browsercontrol;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class231 extends class86 {

    @OriginalMember(owner = "client!le", name = "D", descriptor = "Ltf;")
    public static class242 field3922 = new class242(32);

    @OriginalMember(owner = "client!le", name = "J", descriptor = "Lbe;")
    public static class283 field3928 = class153.method941(126, "Bitte warten Sie)3)3)3");

    @OriginalMember(owner = "client!le", name = "u", descriptor = "I")
    public int field3913;

    @OriginalMember(owner = "client!le", name = "w", descriptor = "I")
    public static int field3915;

    @OriginalMember(owner = "client!le", name = "y", descriptor = "I")
    public int field3917;

    @OriginalMember(owner = "client!le", name = "C", descriptor = "I")
    public int field3921;

    @OriginalMember(owner = "client!le", name = "E", descriptor = "I")
    public static int field3923;

    @OriginalMember(owner = "client!le", name = "F", descriptor = "I")
    public static int field3924;

    @OriginalMember(owner = "client!le", name = "G", descriptor = "I")
    public int field3925;

    @OriginalMember(owner = "client!le", name = "H", descriptor = "I")
    public static int field3926;

    @OriginalMember(owner = "client!le", name = "I", descriptor = "I")
    public int field3927;

    @OriginalMember(owner = "client!le", name = "x", descriptor = "Lek;")
    public static class172 field3916;

    @OriginalMember(owner = "client!le", name = "v", descriptor = "Lbe;")
    public class283 field3914;

    @OriginalMember(owner = "client!le", name = "t", descriptor = "Lkg;")
    public class69 field3912;

    @OriginalMember(owner = "client!le", name = "z", descriptor = "Lkg;")
    public class69 field3918;

    @OriginalMember(owner = "client!le", name = "B", descriptor = "Z")
    public boolean field3920;

    @OriginalMember(owner = "client!le", name = "A", descriptor = "[Ljava/lang/Object;")
    public Object[] field3919;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IBI)Lbe;", line = 27)
    public static final class283 method1560(int arg0, byte arg1, int arg2) {
        int var3 = arg2 - arg0;
        field3915++;
        if (var3 < -9) {
            return class182.field3125;
        } else if (var3 < -6) {
            return client.field4014;
        } else if (var3 < -3) {
            return class134.field2249;
        } else if (var3 < 0) {
            return class178.field3069;
        } else if (var3 > 9) {
            return class142.field2362;
        } else if (arg1 != -108) {
            return (class283) null;
        } else if (var3 > 6) {
            return class57.field777;
        } else if (var3 <= 3) {
            return var3 <= 0 ? class86.field1462 : class83.field1415;
        } else {
            return class282.field4766;
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(ILle;I)V", line = 68)
    public static final void method1561(int arg0, class231 arg1, int arg2) {
        field3923++;
        if (arg0 <= 23) {
            method1561(-13, (class231) null, -37);
        }
        Object[] var3 = arg1.field3919;
        int var4 = (Integer) var3[0];
        class109 var5 = class3.method17(var4, true);
        if (var5 == null) {
            return;
        }
        class297.field5026 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = -1;
        byte var9 = -1;
        int[] var10 = var5.field1841;
        int[] var11 = var5.field1846;
        try {
            class45.field609 = new class283[var5.field1847];
            int var12 = 0;
            int var13 = 0;
            class291.field4945 = new int[var5.field1837];
            for (int var14 = 1; var14 < var3.length; var14++) {
                if ((var3[var14] instanceof Integer)) {
                    int var16 = (Integer) var3[var14];
                    if (var16 == -2147483647) {
                        var16 = arg1.field3927;
                    }
                    if (var16 == -2147483646) {
                        var16 = arg1.field3921;
                    }
                    if (var16 == -2147483645) {
                        var16 = arg1.field3912 == null ? -1 : arg1.field3912.field1079;
                    }
                    if (var16 == -2147483644) {
                        var16 = arg1.field3925;
                    }
                    if (var16 == -2147483643) {
                        var16 = arg1.field3912 == null ? -1 : arg1.field3912.field1126;
                    }
                    if (var16 == -2147483642) {
                        var16 = arg1.field3918 == null ? -1 : arg1.field3918.field1079;
                    }
                    if (var16 == -2147483641) {
                        var16 = arg1.field3918 == null ? -1 : arg1.field3918.field1126;
                    }
                    if (var16 == -2147483640) {
                        var16 = arg1.field3917;
                    }
                    if (var16 == -2147483639) {
                        var16 = arg1.field3913;
                    }
                    class291.field4945[var13++] = var16;
                } else if (var3[var14] instanceof class283) {
                    class283 var15 = (class283) var3[var14];
                    if (var15.method1926(-16620, class64.field887)) {
                        var15 = arg1.field3914;
                    }
                    class45.field609[var12++] = var15;
                }
            }
            int var17 = 0;
            label3854: while (true) {
                var17++;
                if (var17 > arg2) {
                    throw new RuntimeException("slow");
                }
                var8++;
                int var474 = var11[var8];
                if (var474 < 100) {
                    if (var474 == 0) {
                        class151.field2462[var6++] = var10[var8];
                        continue;
                    }
                    if (var474 == 1) {
                        int var18 = var10[var8];
                        class151.field2462[var6++] = class6.field63[var18];
                        continue;
                    }
                    if (var474 == 2) {
                        int var19 = var10[var8];
                        var6--;
                        class280.method1867(var19, -82, class151.field2462[var6]);
                        continue;
                    }
                    if (var474 == 3) {
                        class57.field790[var7++] = var5.field1834[var8];
                        continue;
                    }
                    if (var474 == 6) {
                        var8 += var10[var8];
                        continue;
                    }
                    if (var474 == 7) {
                        var6 -= 2;
                        if (class151.field2462[var6 + 1] != class151.field2462[var6]) {
                            var8 += var10[var8];
                        }
                        continue;
                    }
                    if (var474 == 8) {
                        var6 -= 2;
                        if (class151.field2462[var6 + 1] == class151.field2462[var6]) {
                            var8 += var10[var8];
                        }
                        continue;
                    }
                    if (var474 == 9) {
                        var6 -= 2;
                        if (class151.field2462[var6] < class151.field2462[var6 + 1]) {
                            var8 += var10[var8];
                        }
                        continue;
                    }
                    if (var474 == 10) {
                        var6 -= 2;
                        if (class151.field2462[var6] > class151.field2462[var6 + 1]) {
                            var8 += var10[var8];
                        }
                        continue;
                    }
                    if (var474 == 21) {
                        if (class297.field5026 == 0) {
                            return;
                        }
                        class184 var20 = class236.field3954[--class297.field5026];
                        class291.field4945 = var20.field3164;
                        class45.field609 = var20.field3160;
                        var8 = var20.field3166;
                        var5 = var20.field3161;
                        var10 = var5.field1841;
                        var11 = var5.field1846;
                        continue;
                    }
                    if (var474 == 25) {
                        int var21 = var10[var8];
                        class151.field2462[var6++] = class184.method1216((byte) -55, var21);
                        continue;
                    }
                    if (var474 == 27) {
                        int var22 = var10[var8];
                        var6--;
                        class176.method1161(class151.field2462[var6], var22, 0);
                        continue;
                    }
                    if (var474 == 31) {
                        var6 -= 2;
                        if (class151.field2462[var6 + 1] >= class151.field2462[var6]) {
                            var8 += var10[var8];
                        }
                        continue;
                    }
                    if (var474 == 32) {
                        var6 -= 2;
                        if (class151.field2462[var6] >= class151.field2462[var6 + 1]) {
                            var8 += var10[var8];
                        }
                        continue;
                    }
                    if (var474 == 33) {
                        class151.field2462[var6++] = class291.field4945[var10[var8]];
                        continue;
                    }
                    int var10001;
                    if (var474 == 34) {
                        var10001 = var10[var8];
                        var6--;
                        class291.field4945[var10001] = class151.field2462[var6];
                        continue;
                    }
                    if (var474 == 35) {
                        class57.field790[var7++] = class45.field609[var10[var8]];
                        continue;
                    }
                    if (var474 == 36) {
                        var10001 = var10[var8];
                        var7--;
                        class45.field609[var10001] = class57.field790[var7];
                        continue;
                    }
                    if (var474 == 37) {
                        int var23 = var10[var8];
                        var7 -= var23;
                        class283 var24 = class74.method493(class57.field790, var7, (byte) 93, var23);
                        class57.field790[var7++] = var24;
                        continue;
                    }
                    if (var474 == 38) {
                        var6--;
                        continue;
                    }
                    if (var474 == 39) {
                        var7--;
                        continue;
                    }
                    if (var474 == 40) {
                        int var25 = var10[var8];
                        class109 var26 = class3.method17(var25, true);
                        int[] var27 = new int[var26.field1837];
                        class283[] var28 = new class283[var26.field1847];
                        for (int var29 = 0; var29 < var26.field1839; var29++) {
                            var27[var29] = class151.field2462[var6 + var29 - var26.field1839];
                        }
                        for (int var30 = 0; var30 < var26.field1844; var30++) {
                            var28[var30] = class57.field790[var7 + var30 - var26.field1844];
                        }
                        var6 -= var26.field1839;
                        var7 -= var26.field1844;
                        class184 var31 = new class184();
                        var31.field3160 = class45.field609;
                        var31.field3161 = var5;
                        var31.field3166 = var8;
                        var31.field3164 = class291.field4945;
                        if (class236.field3954.length <= class297.field5026) {
                            throw new RuntimeException();
                        }
                        var8 = -1;
                        var5 = var26;
                        class236.field3954[class297.field5026++] = var31;
                        var11 = var26.field1846;
                        class291.field4945 = var27;
                        var10 = var26.field1841;
                        class45.field609 = var28;
                        continue;
                    }
                    if (var474 == 42) {
                        class151.field2462[var6++] = class81.field1376[var10[var8]];
                        continue;
                    }
                    if (var474 == 43) {
                        int var32 = var10[var8];
                        var6--;
                        class81.field1376[var32] = class151.field2462[var6];
                        class210.method1387((byte) -112, var32);
                        continue;
                    }
                    if (var474 == 44) {
                        int var33 = var10[var8] >> 16;
                        int var34 = var10[var8] & 0xFFFF;
                        var6--;
                        int var35 = class151.field2462[var6];
                        if (var35 >= 0 && var35 <= 5000) {
                            class232.field3932[var33] = var35;
                            byte var36 = -1;
                            if (var34 == 105) {
                                var36 = 0;
                            }
                            int var37 = 0;
                            while (true) {
                                if (var35 <= var37) {
                                    continue label3854;
                                }
                                class33.field499[var33][var37] = var36;
                                var37++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var474 == 45) {
                        var6--;
                        int var38 = class151.field2462[var6];
                        int var39 = var10[var8];
                        if (var38 >= 0 && class232.field3932[var39] > var38) {
                            class151.field2462[var6++] = class33.field499[var39][var38];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var474 == 46) {
                        var6 -= 2;
                        int var40 = var10[var8];
                        int var41 = class151.field2462[var6];
                        if (var41 >= 0 && var41 < class232.field3932[var40]) {
                            class33.field499[var40][var41] = class151.field2462[var6 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var474 == 47) {
                        class283 var42 = class83.field1406[var10[var8]];
                        if (var42 == null) {
                            var42 = class87.field1480;
                        }
                        class57.field790[var7++] = var42;
                        continue;
                    }
                    if (var474 == 48) {
                        int var43 = var10[var8];
                        var7--;
                        class83.field1406[var43] = class57.field790[var7];
                        class5.method31(-43, var43);
                        continue;
                    }
                    if (var474 == 51) {
                        class239 var44 = var5.field1850[var10[var8]];
                        var6--;
                        class119 var45 = (class119) var44.method1612((long) class151.field2462[var6], 113);
                        if (var45 != null) {
                            var8 += var45.field1998;
                        }
                        continue;
                    }
                }
                boolean var46;
                if (var10[var8] == 1) {
                    var46 = true;
                } else {
                    var46 = false;
                }
                if (var474 < 300) {
                    if (var474 == 100) {
                        var6 -= 3;
                        int var47 = class151.field2462[var6];
                        int var48 = class151.field2462[var6 + 2];
                        int var49 = class151.field2462[var6 + 1];
                        if (var49 != 0) {
                            class69 var50 = class65.method418(-8429, var47);
                            if (var50.field1043 == null) {
                                var50.field1043 = new class69[var48 + 1];
                            }
                            if (var50.field1043.length <= var48) {
                                class69[] var51 = new class69[var48 + 1];
                                for (int var52 = 0; var52 < var50.field1043.length; var52++) {
                                    var51[var52] = var50.field1043[var52];
                                }
                                var50.field1043 = var51;
                            }
                            if (var48 > 0 && var50.field1043[var48 - 1] == null) {
                                throw new RuntimeException("Gap at:" + (var48 - 1));
                            }
                            class69 var53 = new class69();
                            var53.field1059 = var53.field1079 = var50.field1079;
                            var53.field1143 = var49;
                            var53.field1126 = var48;
                            var53.field1121 = true;
                            var50.field1043[var48] = var53;
                            if (var46) {
                                class298.field5052 = var53;
                            } else {
                                class64.field880 = var53;
                            }
                            class272.method1834(var50, 0);
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var474 == 101) {
                        class69 var54 = var46 ? class298.field5052 : class64.field880;
                        if (var54.field1126 == -1) {
                            if (!var46) {
                                throw new RuntimeException("Tried to cc_delete static active-component!");
                            }
                            throw new RuntimeException("Tried to .cc_delete static .active-component!");
                        }
                        class69 var55 = class65.method418(-8429, var54.field1079);
                        var55.field1043[var54.field1126] = null;
                        class272.method1834(var55, 0);
                        continue;
                    }
                    if (var474 == 102) {
                        var6--;
                        class69 var56 = class65.method418(-8429, class151.field2462[var6]);
                        var56.field1043 = null;
                        class272.method1834(var56, 0);
                        continue;
                    }
                    if (var474 == 200) {
                        var6 -= 2;
                        int var57 = class151.field2462[var6];
                        int var58 = class151.field2462[var6 + 1];
                        class69 var59 = class225.method1480((byte) 118, var58, var57);
                        if (var59 != null && var58 != -1) {
                            class151.field2462[var6++] = 1;
                            if (var46) {
                                class298.field5052 = var59;
                            } else {
                                class64.field880 = var59;
                            }
                            continue;
                        }
                        class151.field2462[var6++] = 0;
                        continue;
                    }
                    if (var474 == 201) {
                        var6--;
                        int var60 = class151.field2462[var6];
                        class69 var61 = class65.method418(-8429, var60);
                        if (var61 == null) {
                            class151.field2462[var6++] = 0;
                        } else {
                            class151.field2462[var6++] = 1;
                            if (var46) {
                                class298.field5052 = var61;
                            } else {
                                class64.field880 = var61;
                            }
                        }
                        continue;
                    }
                } else if (var474 < 500) {
                    if (var474 == 403) {
                        var6 -= 2;
                        int var462 = class151.field2462[var6 + 1];
                        int var463 = class151.field2462[var6];
                        if (var463 >= 7) {
                            var463 -= 7;
                        }
                        class213.field3624.field3277.method1770(var463, var462, false);
                        continue;
                    }
                    if (var474 == 404) {
                        var6 -= 2;
                        int var464 = class151.field2462[var6];
                        int var465 = class151.field2462[var6 + 1];
                        class213.field3624.field3277.method1775((byte) -64, var465, var464);
                        continue;
                    }
                    if (var474 == 410) {
                        var6--;
                        boolean var466 = class151.field2462[var6] != 0;
                        class213.field3624.field3277.method1769(var466, 14543);
                        continue;
                    }
                } else if (var474 >= 1000 && var474 < 1100 || var474 >= 2000 && var474 < 2100) {
                    class69 var456;
                    if (var474 >= 2000) {
                        var6--;
                        var456 = class65.method418(-8429, class151.field2462[var6]);
                        var474 -= 1000;
                    } else {
                        var456 = var46 ? class298.field5052 : class64.field880;
                    }
                    if (var474 == 1000) {
                        var6 -= 4;
                        var456.field1111 = class151.field2462[var6];
                        var456.field1041 = class151.field2462[var6 + 1];
                        int var457 = class151.field2462[var6 + 3];
                        if (var457 < 0) {
                            var457 = 0;
                        } else if (var457 > 5) {
                            var457 = 5;
                        }
                        int var458 = class151.field2462[var6 + 2];
                        var456.field1097 = (byte) var457;
                        if (var458 < 0) {
                            var458 = 0;
                        } else if (var458 > 5) {
                            var458 = 5;
                        }
                        var456.field1102 = (byte) var458;
                        class272.method1834(var456, 0);
                        class107.method712(119, var456);
                        if (var456.field1126 == -1) {
                            class1.method7(110, var456.field1079);
                        }
                        continue;
                    }
                    if (var474 == 1001) {
                        var6 -= 4;
                        var456.field1087 = class151.field2462[var6];
                        var456.field996 = class151.field2462[var6 + 1];
                        var456.field980 = 0;
                        var456.field1113 = 0;
                        int var459 = class151.field2462[var6 + 3];
                        if (var459 < 0) {
                            var459 = 0;
                        } else if (var459 > 4) {
                            var459 = 4;
                        }
                        int var460 = class151.field2462[var6 + 2];
                        if (var460 < 0) {
                            var460 = 0;
                        } else if (var460 > 4) {
                            var460 = 4;
                        }
                        var456.field1026 = (byte) var459;
                        var456.field1139 = (byte) var460;
                        class272.method1834(var456, 0);
                        class107.method712(77, var456);
                        if (var456.field1143 == 0) {
                            class245.method1668(false, var456, 0);
                        }
                        continue;
                    }
                    if (var474 == 1003) {
                        var6--;
                        boolean var461 = class151.field2462[var6] == 1;
                        if (var456.field1127 != var461) {
                            var456.field1127 = var461;
                            class272.method1834(var456, 0);
                        }
                        if (var456.field1126 == -1) {
                            class97.method645(var456.field1079, -13734);
                        }
                        continue;
                    }
                    if (var474 == 1004) {
                        var6 -= 2;
                        var456.field972 = class151.field2462[var6];
                        var456.field1090 = class151.field2462[var6 + 1];
                        class272.method1834(var456, 0);
                        class107.method712(86, var456);
                        if (var456.field1143 == 0) {
                            class245.method1668(false, var456, 0);
                        }
                        continue;
                    }
                } else if (var474 >= 1100 && var474 < 1200 || var474 >= 2100 && var474 < 2200) {
                    class69 var453;
                    if (var474 < 2000) {
                        var453 = var46 ? class298.field5052 : class64.field880;
                    } else {
                        var474 -= 1000;
                        var6--;
                        var453 = class65.method418(-8429, class151.field2462[var6]);
                    }
                    if (var474 == 1100) {
                        var6 -= 2;
                        var453.field1011 = class151.field2462[var6];
                        if (var453.field998 - var453.field1069 < var453.field1011) {
                            var453.field1011 = var453.field998 - var453.field1069;
                        }
                        if (var453.field1011 < 0) {
                            var453.field1011 = 0;
                        }
                        var453.field1098 = class151.field2462[var6 + 1];
                        if ((var453.field987 - var453.field1085) < var453.field1098) {
                            var453.field1098 = var453.field987 - var453.field1085;
                        }
                        if (var453.field1098 < 0) {
                            var453.field1098 = 0;
                        }
                        class272.method1834(var453, 0);
                        if (var453.field1126 == -1) {
                            class260.method1757(4096, var453.field1079);
                        }
                        continue;
                    }
                    if (var474 == 1101) {
                        var6--;
                        var453.field994 = class151.field2462[var6];
                        class272.method1834(var453, 0);
                        if (var453.field1126 == -1) {
                            class288.method1973(-1, var453.field1079);
                        }
                        continue;
                    }
                    if (var474 == 1102) {
                        var6--;
                        var453.field1112 = class151.field2462[var6] == 1;
                        class272.method1834(var453, 0);
                        continue;
                    }
                    if (var474 == 1103) {
                        var6--;
                        var453.field1133 = class151.field2462[var6];
                        class272.method1834(var453, 0);
                        continue;
                    }
                    if (var474 == 1104) {
                        var6--;
                        var453.field1063 = class151.field2462[var6];
                        class272.method1834(var453, 0);
                        continue;
                    }
                    if (var474 == 1105) {
                        var6--;
                        var453.field1060 = class151.field2462[var6];
                        class272.method1834(var453, 0);
                        continue;
                    }
                    if (var474 == 1106) {
                        var6--;
                        var453.field1066 = class151.field2462[var6];
                        class272.method1834(var453, 0);
                        continue;
                    }
                    if (var474 == 1107) {
                        var6--;
                        var453.field1039 = class151.field2462[var6] == 1;
                        class272.method1834(var453, 0);
                        continue;
                    }
                    if (var474 == 1108) {
                        var453.field1072 = 1;
                        var6--;
                        var453.field1057 = class151.field2462[var6];
                        class272.method1834(var453, 0);
                        if (var453.field1126 == -1) {
                            class252.method1715(false, var453.field1079);
                        }
                        continue;
                    }
                    if (var474 == 1109) {
                        var6 -= 6;
                        var453.field1076 = class151.field2462[var6];
                        var453.field1078 = class151.field2462[var6 + 1];
                        var453.field1099 = class151.field2462[var6 + 2];
                        var453.field977 = class151.field2462[var6 + 3];
                        var453.field1006 = class151.field2462[var6 + 4];
                        var453.field1007 = class151.field2462[var6 + 5];
                        class272.method1834(var453, 0);
                        if (var453.field1126 == -1) {
                            class88.method569((byte) -43, var453.field1079);
                            class197.method1264(var453.field1079, false);
                        }
                        continue;
                    }
                    if (var474 == 1110) {
                        var6--;
                        int var454 = class151.field2462[var6];
                        if (var453.field1052 != var454) {
                            var453.field1088 = 0;
                            var453.field1075 = 0;
                            var453.field1052 = var454;
                            class272.method1834(var453, 0);
                        }
                        if (var453.field1126 == -1) {
                            class246.method1677((byte) -115, var453.field1079);
                        }
                        continue;
                    }
                    if (var474 == 1111) {
                        var6--;
                        var453.field1014 = class151.field2462[var6] == 1;
                        class272.method1834(var453, 0);
                        continue;
                    }
                    if (var474 == 1112) {
                        var7--;
                        class283 var455 = class57.field790[var7];
                        if (!var455.method1926(-16620, var453.field1023)) {
                            var453.field1023 = var455;
                            class272.method1834(var453, 0);
                        }
                        if (var453.field1126 == -1) {
                            class171.method1089(-116, var453.field1079);
                        }
                        continue;
                    }
                    if (var474 == 1113) {
                        var6--;
                        var453.field1129 = class151.field2462[var6];
                        class272.method1834(var453, 0);
                        continue;
                    }
                    if (var474 == 1114) {
                        var6 -= 3;
                        var453.field1134 = class151.field2462[var6];
                        var453.field984 = class151.field2462[var6 + 1];
                        var453.field1074 = class151.field2462[var6 + 2];
                        class272.method1834(var453, 0);
                        continue;
                    }
                    if (var474 == 1115) {
                        var6--;
                        var453.field1130 = class151.field2462[var6] == 1;
                        class272.method1834(var453, 0);
                        continue;
                    }
                    if (var474 == 1116) {
                        var6--;
                        var453.field1030 = class151.field2462[var6];
                        class272.method1834(var453, 0);
                        continue;
                    }
                    if (var474 == 1117) {
                        var6--;
                        var453.field1107 = class151.field2462[var6];
                        class272.method1834(var453, 0);
                        continue;
                    }
                    if (var474 == 1118) {
                        var6--;
                        var453.field1086 = class151.field2462[var6] == 1;
                        class272.method1834(var453, 0);
                        continue;
                    }
                    if (var474 == 1119) {
                        var6--;
                        var453.field1054 = class151.field2462[var6] == 1;
                        class272.method1834(var453, 0);
                        continue;
                    }
                    if (var474 == 1120) {
                        var6 -= 2;
                        var453.field998 = class151.field2462[var6];
                        var453.field987 = class151.field2462[var6 + 1];
                        class272.method1834(var453, 0);
                        if (var453.field1143 == 0) {
                            class245.method1668(false, var453, 0);
                        }
                        continue;
                    }
                    if (var474 == 1121) {
                        var6 -= 2;
                        var453.field979 = (short) class151.field2462[var6];
                        var453.field1137 = (short) class151.field2462[var6 + 1];
                        class272.method1834(var453, 0);
                        continue;
                    }
                    if (var474 == 1122) {
                        var6--;
                        var453.field1038 = class151.field2462[var6] == 1;
                        class272.method1834(var453, 0);
                        continue;
                    }
                } else if (!(var474 < 1200 || var474 >= 1300) || !(var474 < 2200 || var474 >= 2300)) {
                    class69 var62;
                    if (var474 < 2000) {
                        var62 = var46 ? class298.field5052 : class64.field880;
                    } else {
                        var6--;
                        var62 = class65.method418(-8429, class151.field2462[var6]);
                        var474 -= 1000;
                    }
                    class272.method1834(var62, 0);
                    if (var474 == 1200 || var474 == 1205) {
                        var6 -= 2;
                        int var63 = class151.field2462[var6 + 1];
                        int var64 = class151.field2462[var6];
                        if (var62.field1126 == -1) {
                            class270.method1823(false, var62.field1079);
                            class88.method569((byte) -43, var62.field1079);
                            class197.method1264(var62.field1079, false);
                        }
                        if (var64 == -1) {
                            var62.field1013 = -1;
                            var62.field1072 = 1;
                            var62.field1057 = -1;
                        } else {
                            var62.field1061 = var63;
                            var62.field1013 = var64;
                            class304 var65 = class103.method676(var64, -1);
                            var62.field1007 = var65.field5134;
                            var62.field1076 = var65.field5163;
                            var62.field1006 = var65.field5169;
                            var62.field1078 = var65.field5196;
                            if (var474 == 1205) {
                                var62.field999 = false;
                            } else {
                                var62.field999 = true;
                            }
                            var62.field1099 = var65.field5150;
                            var62.field977 = var65.field5132;
                            if (var62.field980 > 0) {
                                var62.field1007 = var62.field1007 * 32 / var62.field980;
                            } else if (var62.field1087 > 0) {
                                var62.field1007 = var62.field1007 * 32 / var62.field1087;
                            }
                        }
                        continue;
                    }
                    if (var474 == 1201) {
                        var62.field1072 = 2;
                        var6--;
                        var62.field1057 = class151.field2462[var6];
                        if (var62.field1126 == -1) {
                            class252.method1715(false, var62.field1079);
                        }
                        continue;
                    }
                    if (var474 == 1202) {
                        var62.field1072 = 3;
                        var62.field1057 = class213.field3624.field3277.method1778(-921327751);
                        if (var62.field1126 == -1) {
                            class252.method1715(false, var62.field1079);
                        }
                        continue;
                    }
                    if (var474 == 1203) {
                        var62.field1072 = 6;
                        var6--;
                        var62.field1057 = class151.field2462[var6];
                        if (var62.field1126 == -1) {
                            class252.method1715(false, var62.field1079);
                        }
                        continue;
                    }
                    if (var474 == 1204) {
                        var62.field1072 = 5;
                        var6--;
                        var62.field1057 = class151.field2462[var6];
                        if (var62.field1126 == -1) {
                            class252.method1715(false, var62.field1079);
                        }
                        continue;
                    }
                } else if (var474 >= 1300 && var474 < 1400 || var474 >= 2300 && var474 < 2400) {
                    class69 var66;
                    if (var474 < 2000) {
                        var66 = var46 ? class298.field5052 : class64.field880;
                    } else {
                        var474 -= 1000;
                        var6--;
                        var66 = class65.method418(-8429, class151.field2462[var6]);
                    }
                    if (var474 == 1300) {
                        var6--;
                        int var67 = class151.field2462[var6] - 1;
                        if (var67 >= 0 && var67 <= 9) {
                            var7--;
                            var66.method436(0, var67, class57.field790[var7]);
                            continue;
                        }
                        var7--;
                        continue;
                    }
                    if (var474 == 1301) {
                        var6 -= 2;
                        int var68 = class151.field2462[var6 + 1];
                        int var69 = class151.field2462[var6];
                        var66.field1050 = class225.method1480((byte) 125, var68, var69);
                        continue;
                    }
                    if (var474 == 1302) {
                        var6--;
                        var66.field1027 = class151.field2462[var6] == 1;
                        continue;
                    }
                    if (var474 == 1303) {
                        var6--;
                        var66.field1118 = class151.field2462[var6];
                        continue;
                    }
                    if (var474 == 1304) {
                        var6--;
                        var66.field1001 = class151.field2462[var6];
                        continue;
                    }
                    if (var474 == 1305) {
                        var7--;
                        var66.field1008 = class57.field790[var7];
                        continue;
                    }
                    if (var474 == 1306) {
                        var7--;
                        var66.field1056 = class57.field790[var7];
                        continue;
                    }
                    if (var474 == 1307) {
                        var66.field1032 = null;
                        continue;
                    }
                } else {
                    if (var474 >= 1400 && var474 < 1500 || var474 >= 2400 && var474 < 2500) {
                        class69 var446;
                        if (var474 >= 2000) {
                            var6--;
                            var446 = class65.method418(-8429, class151.field2462[var6]);
                            var474 -= 1000;
                        } else {
                            var446 = var46 ? class298.field5052 : class64.field880;
                        }
                        var7--;
                        class283 var447 = class57.field790[var7];
                        int[] var448 = null;
                        if (var447.method1925((byte) -44) > 0 && var447.method1928(var447.method1925((byte) -44) - 1, (byte) -93) == 89) {
                            var6--;
                            int var449 = class151.field2462[var6];
                            if (var449 > 0) {
                                var448 = new int[var449];
                                while (var449-- > 0) {
                                    var6--;
                                    var448[var449] = class151.field2462[var6];
                                }
                            }
                            var447 = var447.method1936(-63, 0, var447.method1925((byte) -44) - 1);
                        }
                        Object[] var450 = new Object[var447.method1925((byte) -44) + 1];
                        for (int var451 = var450.length - 1; var451 >= 1; var451--) {
                            if (var447.method1928(var451 - 1, (byte) 57) == 115) {
                                var7--;
                                var450[var451] = class57.field790[var7];
                            } else {
                                var6--;
                                var450[var451] = Integer.valueOf(class151.field2462[var6]);
                            }
                        }
                        var6--;
                        int var452 = class151.field2462[var6];
                        if (var452 == -1) {
                            var450 = null;
                        } else {
                            var450[0] = Integer.valueOf(var452);
                        }
                        var446.field992 = true;
                        if (var474 == 1400) {
                            var446.field1115 = var450;
                        } else if (var474 == 1401) {
                            var446.field1119 = var450;
                        } else if (var474 == 1402) {
                            var446.field1084 = var450;
                        } else if (var474 == 1403) {
                            var446.field1105 = var450;
                        } else if (var474 == 1404) {
                            var446.field1051 = var450;
                        } else if (var474 == 1405) {
                            var446.field1042 = var450;
                        } else if (var474 == 1406) {
                            var446.field1068 = var450;
                        } else if (var474 == 1407) {
                            var446.field1017 = var450;
                            var446.field1020 = var448;
                        } else if (var474 == 1408) {
                            var446.field1093 = var450;
                        } else if (var474 == 1409) {
                            var446.field1103 = var450;
                        } else if (var474 == 1410) {
                            var446.field1071 = var450;
                        } else if (var474 == 1411) {
                            var446.field1048 = var450;
                        } else if (var474 == 1412) {
                            var446.field1096 = var450;
                        } else if (var474 == 1414) {
                            var446.field1141 = var448;
                            var446.field1142 = var450;
                        } else if (var474 == 1415) {
                            var446.field1016 = var450;
                            var446.field1036 = var448;
                        } else if (var474 == 1416) {
                            var446.field988 = var450;
                        } else if (var474 == 1417) {
                            var446.field1045 = var450;
                        } else if (var474 == 1418) {
                            var446.field1095 = var450;
                        } else if (var474 == 1419) {
                            var446.field1149 = var450;
                        } else if (var474 == 1420) {
                            var446.field978 = var450;
                        } else if (var474 == 1421) {
                            var446.field1083 = var450;
                        } else if (var474 == 1422) {
                            var446.field1082 = var450;
                        } else if (var474 == 1423) {
                            var446.field1140 = var450;
                        } else if (var474 == 1424) {
                            var446.field1077 = var450;
                        } else if (var474 == 1425) {
                            var446.field1117 = var450;
                        } else if (var474 == 1426) {
                            var446.field1028 = var450;
                        } else if (var474 == 1427) {
                            var446.field1031 = var450;
                        } else if (var474 == 1428) {
                            var446.field1049 = var448;
                            var446.field1010 = var450;
                        } else if (var474 == 1429) {
                            var446.field1089 = var448;
                            var446.field1004 = var450;
                        }
                        continue;
                    }
                    if (var474 < 1600) {
                        class69 var445 = var46 ? class298.field5052 : class64.field880;
                        if (var474 == 1500) {
                            class151.field2462[var6++] = var445.field1135;
                            continue;
                        }
                        if (var474 == 1501) {
                            class151.field2462[var6++] = var445.field1128;
                            continue;
                        }
                        if (var474 == 1502) {
                            class151.field2462[var6++] = var445.field1069;
                            continue;
                        }
                        if (var474 == 1503) {
                            class151.field2462[var6++] = var445.field1085;
                            continue;
                        }
                        if (var474 == 1504) {
                            class151.field2462[var6++] = var445.field1127 ? 1 : 0;
                            continue;
                        }
                        if (var474 == 1505) {
                            class151.field2462[var6++] = var445.field1059;
                            continue;
                        }
                    } else if (var474 < 1700) {
                        class69 var444 = var46 ? class298.field5052 : class64.field880;
                        if (var474 == 1600) {
                            class151.field2462[var6++] = var444.field1011;
                            continue;
                        }
                        if (var474 == 1601) {
                            class151.field2462[var6++] = var444.field1098;
                            continue;
                        }
                        if (var474 == 1602) {
                            class57.field790[var7++] = var444.field1023;
                            continue;
                        }
                        if (var474 == 1603) {
                            class151.field2462[var6++] = var444.field998;
                            continue;
                        }
                        if (var474 == 1604) {
                            class151.field2462[var6++] = var444.field987;
                            continue;
                        }
                        if (var474 == 1605) {
                            class151.field2462[var6++] = var444.field1007;
                            continue;
                        }
                        if (var474 == 1606) {
                            class151.field2462[var6++] = var444.field1099;
                            continue;
                        }
                        if (var474 == 1607) {
                            class151.field2462[var6++] = var444.field1006;
                            continue;
                        }
                        if (var474 == 1608) {
                            class151.field2462[var6++] = var444.field977;
                            continue;
                        }
                        if (var474 == 1609) {
                            class151.field2462[var6++] = var444.field1133;
                            continue;
                        }
                    } else if (var474 < 1800) {
                        class69 var443 = var46 ? class298.field5052 : class64.field880;
                        if (var474 == 1700) {
                            class151.field2462[var6++] = var443.field1013;
                            continue;
                        }
                        if (var474 == 1701) {
                            if (var443.field1013 == -1) {
                                class151.field2462[var6++] = 0;
                            } else {
                                class151.field2462[var6++] = var443.field1061;
                            }
                            continue;
                        }
                        if (var474 == 1702) {
                            class151.field2462[var6++] = var443.field1126;
                            continue;
                        }
                    } else if (var474 < 1900) {
                        class69 var70 = var46 ? class298.field5052 : class64.field880;
                        if (var474 == 1800) {
                            class151.field2462[var6++] = class6.method36(client.method1601(var70), (byte) 67);
                            continue;
                        }
                        if (var474 == 1801) {
                            var6--;
                            int var71 = class151.field2462[var6];
                            int var475 = var71 - 1;
                            if (var70.field1032 != null && var70.field1032.length > var475 && var70.field1032[var475] != null) {
                                class57.field790[var7++] = var70.field1032[var475];
                                continue;
                            }
                            class57.field790[var7++] = class150.field2454;
                            continue;
                        }
                        if (var474 == 1802) {
                            if (var70.field1008 == null) {
                                class57.field790[var7++] = class150.field2454;
                            } else {
                                class57.field790[var7++] = var70.field1008;
                            }
                            continue;
                        }
                    } else if (var474 < 2600) {
                        var6--;
                        class69 var442 = class65.method418(-8429, class151.field2462[var6]);
                        if (var474 == 2500) {
                            class151.field2462[var6++] = var442.field1135;
                            continue;
                        }
                        if (var474 == 2501) {
                            class151.field2462[var6++] = var442.field1128;
                            continue;
                        }
                        if (var474 == 2502) {
                            class151.field2462[var6++] = var442.field1069;
                            continue;
                        }
                        if (var474 == 2503) {
                            class151.field2462[var6++] = var442.field1085;
                            continue;
                        }
                        if (var474 == 2504) {
                            class151.field2462[var6++] = var442.field1127 ? 1 : 0;
                            continue;
                        }
                        if (var474 == 2505) {
                            class151.field2462[var6++] = var442.field1059;
                            continue;
                        }
                    } else if (var474 < 2700) {
                        var6--;
                        class69 var72 = class65.method418(-8429, class151.field2462[var6]);
                        if (var474 == 2600) {
                            class151.field2462[var6++] = var72.field1011;
                            continue;
                        }
                        if (var474 == 2601) {
                            class151.field2462[var6++] = var72.field1098;
                            continue;
                        }
                        if (var474 == 2602) {
                            class57.field790[var7++] = var72.field1023;
                            continue;
                        }
                        if (var474 == 2603) {
                            class151.field2462[var6++] = var72.field998;
                            continue;
                        }
                        if (var474 == 2604) {
                            class151.field2462[var6++] = var72.field987;
                            continue;
                        }
                        if (var474 == 2605) {
                            class151.field2462[var6++] = var72.field1007;
                            continue;
                        }
                        if (var474 == 2606) {
                            class151.field2462[var6++] = var72.field1099;
                            continue;
                        }
                        if (var474 == 2607) {
                            class151.field2462[var6++] = var72.field1006;
                            continue;
                        }
                        if (var474 == 2608) {
                            class151.field2462[var6++] = var72.field977;
                            continue;
                        }
                        if (var474 == 2609) {
                            class151.field2462[var6++] = var72.field1133;
                            continue;
                        }
                    } else if (var474 < 2800) {
                        if (var474 == 2700) {
                            var6--;
                            class69 var432 = class65.method418(-8429, class151.field2462[var6]);
                            class151.field2462[var6++] = var432.field1013;
                            continue;
                        }
                        if (var474 == 2701) {
                            var6--;
                            class69 var433 = class65.method418(-8429, class151.field2462[var6]);
                            if (var433.field1013 == -1) {
                                class151.field2462[var6++] = 0;
                            } else {
                                class151.field2462[var6++] = var433.field1061;
                            }
                            continue;
                        }
                        if (var474 == 2702) {
                            var6--;
                            int var434 = class151.field2462[var6];
                            class159 var435 = (class159) class58.field805.method1612((long) var434, 117);
                            if (var435 == null) {
                                class151.field2462[var6++] = 0;
                            } else {
                                class151.field2462[var6++] = 1;
                            }
                            continue;
                        }
                        if (var474 == 2703) {
                            var6--;
                            class69 var436 = class65.method418(-8429, class151.field2462[var6]);
                            if (var436.field1043 == null) {
                                class151.field2462[var6++] = 0;
                                continue;
                            }
                            int var437 = var436.field1043.length;
                            for (int var438 = 0; var438 < var436.field1043.length; var438++) {
                                if (var436.field1043[var438] == null) {
                                    var437 = var438;
                                    break;
                                }
                            }
                            class151.field2462[var6++] = var437;
                            continue;
                        }
                        if (var474 == 2704 || var474 == 2705) {
                            var6 -= 2;
                            int var439 = class151.field2462[var6];
                            int var440 = class151.field2462[var6 + 1];
                            class159 var441 = (class159) class58.field805.method1612((long) var439, 115);
                            if (var441 != null && var441.field2600 == var440) {
                                class151.field2462[var6++] = 1;
                            } else {
                                class151.field2462[var6++] = 0;
                            }
                            continue;
                        }
                    } else if (var474 < 2900) {
                        var6--;
                        class69 var73 = class65.method418(-8429, class151.field2462[var6]);
                        if (var474 == 2800) {
                            class151.field2462[var6++] = class6.method36(client.method1601(var73), (byte) 67);
                            continue;
                        }
                        if (var474 == 2801) {
                            var6--;
                            int var74 = class151.field2462[var6];
                            int var476 = var74 - 1;
                            if (var73.field1032 != null && var73.field1032.length > var476 && var73.field1032[var476] != null) {
                                class57.field790[var7++] = var73.field1032[var476];
                                continue;
                            }
                            class57.field790[var7++] = class150.field2454;
                            continue;
                        }
                        if (var474 == 2802) {
                            if (var73.field1008 == null) {
                                class57.field790[var7++] = class150.field2454;
                            } else {
                                class57.field790[var7++] = var73.field1008;
                            }
                            continue;
                        }
                    } else if (var474 < 3200) {
                        if (var474 == 3100) {
                            var7--;
                            class283 var417 = class57.field790[var7];
                            class60.method394(0, var417, class150.field2454, (byte) 121);
                            continue;
                        }
                        if (var474 == 3101) {
                            var6 -= 2;
                            class242.method1632(class151.field2462[var6], class213.field3624, (byte) 104, class151.field2462[var6 + 1]);
                            continue;
                        }
                        if (var474 == 3103) {
                            class252.method1711(0);
                            continue;
                        }
                        if (var474 == 3104) {
                            var7--;
                            class283 var418 = class57.field790[var7];
                            int var419 = 0;
                            class138.field2304++;
                            if (var418.method1906(12446)) {
                                var419 = var418.method1930(10);
                            }
                            class228.field3831.method621(109, 8);
                            class228.field3831.method1515(var419, 95);
                            continue;
                        }
                        if (var474 == 3105) {
                            class10.field96++;
                            var7--;
                            class283 var420 = class57.field790[var7];
                            class228.field3831.method621(29, 8);
                            class228.field3831.method1544((byte) 8, var420.method1929((byte) -24));
                            continue;
                        }
                        if (var474 == 3106) {
                            class94.field1589++;
                            var7--;
                            class283 var421 = class57.field790[var7];
                            class228.field3831.method621(223, 8);
                            class228.field3831.method1499(true, var421.method1925((byte) -44) + 1);
                            class228.field3831.method1520(var421, 125);
                            continue;
                        }
                        if (var474 == 3107) {
                            var7--;
                            class283 var422 = class57.field790[var7];
                            var6--;
                            int var423 = class151.field2462[var6];
                            class15.method79(var422, 1, var423);
                            continue;
                        }
                        if (var474 == 3108) {
                            var6 -= 3;
                            int var424 = class151.field2462[var6];
                            int var425 = class151.field2462[var6 + 2];
                            int var426 = class151.field2462[var6 + 1];
                            class69 var427 = class65.method418(-8429, var425);
                            class240.method1615(var424, 94, var426, var427);
                            continue;
                        }
                        if (var474 == 3109) {
                            var6 -= 2;
                            int var428 = class151.field2462[var6];
                            int var429 = class151.field2462[var6 + 1];
                            class69 var430 = var46 ? class298.field5052 : class64.field880;
                            class240.method1615(var428, 93, var429, var430);
                            continue;
                        }
                        if (var474 == 3110) {
                            class75.field1306++;
                            var6--;
                            int var431 = class151.field2462[var6];
                            class228.field3831.method621(213, 8);
                            class228.field3831.method1510((byte) 20, var431);
                            continue;
                        }
                    } else if (var474 < 3300) {
                        if (var474 == 3200) {
                            var6 -= 3;
                            class282.method1893(class151.field2462[var6], class151.field2462[var6 + 2], true, class151.field2462[var6 + 1]);
                            continue;
                        }
                        if (var474 == 3201) {
                            var6--;
                            class23.method167(-121, class151.field2462[var6]);
                            continue;
                        }
                        if (var474 == 3202) {
                            var6 -= 2;
                            class123.method775(class151.field2462[var6 + 1], -19954, class151.field2462[var6]);
                            continue;
                        }
                    } else if (var474 < 3400) {
                        if (var474 == 3300) {
                            class151.field2462[var6++] = class75.field1309;
                            continue;
                        }
                        if (var474 == 3301) {
                            var6 -= 2;
                            int var75 = class151.field2462[var6 + 1];
                            int var76 = class151.field2462[var6];
                            class151.field2462[var6++] = class1.method2(-1, var76, var75);
                            continue;
                        }
                        if (var474 == 3302) {
                            var6 -= 2;
                            int var77 = class151.field2462[var6];
                            int var78 = class151.field2462[var6 + 1];
                            class151.field2462[var6++] = class40.method249(0, var78, var77);
                            continue;
                        }
                        if (var474 == 3303) {
                            var6 -= 2;
                            int var79 = class151.field2462[var6];
                            int var80 = class151.field2462[var6 + 1];
                            class151.field2462[var6++] = class97.method646(var80, var79, -121);
                            continue;
                        }
                        if (var474 == 3304) {
                            var6--;
                            int var81 = class151.field2462[var6];
                            class151.field2462[var6++] = class112.method736(-23, var81).field3754;
                            continue;
                        }
                        if (var474 == 3305) {
                            var6--;
                            int var82 = class151.field2462[var6];
                            class151.field2462[var6++] = class269.field4548[var82];
                            continue;
                        }
                        if (var474 == 3306) {
                            var6--;
                            int var83 = class151.field2462[var6];
                            class151.field2462[var6++] = class7.field70[var83];
                            continue;
                        }
                        if (var474 == 3307) {
                            var6--;
                            int var84 = class151.field2462[var6];
                            class151.field2462[var6++] = class34.field513[var84];
                            continue;
                        }
                        if (var474 == 3308) {
                            int var85 = class61.field850;
                            int var86 = (class213.field3624.field1193 >> 7) + class214.field3637;
                            int var87 = (class213.field3624.field1210 >> 7) + class107.field1833;
                            class151.field2462[var6++] = (var85 << 28) + (var86 << 14) + var87;
                            continue;
                        }
                        if (var474 == 3309) {
                            var6--;
                            int var88 = class151.field2462[var6];
                            class151.field2462[var6++] = class178.method1174(var88 >> 14, 16383);
                            continue;
                        }
                        if (var474 == 3310) {
                            var6--;
                            int var89 = class151.field2462[var6];
                            class151.field2462[var6++] = var89 >> 28;
                            continue;
                        }
                        if (var474 == 3311) {
                            var6--;
                            int var90 = class151.field2462[var6];
                            class151.field2462[var6++] = class178.method1174(16383, var90);
                            continue;
                        }
                        if (var474 == 3312) {
                            class151.field2462[var6++] = class110.field1860 ? 1 : 0;
                            continue;
                        }
                        if (var474 == 3313) {
                            var6 -= 2;
                            int var91 = class151.field2462[var6] + 32768;
                            int var92 = class151.field2462[var6 + 1];
                            class151.field2462[var6++] = class1.method2(-1, var91, var92);
                            continue;
                        }
                        if (var474 == 3314) {
                            var6 -= 2;
                            int var93 = class151.field2462[var6] + 32768;
                            int var94 = class151.field2462[var6 + 1];
                            class151.field2462[var6++] = class40.method249(0, var94, var93);
                            continue;
                        }
                        if (var474 == 3315) {
                            var6 -= 2;
                            int var95 = class151.field2462[var6] + 32768;
                            int var96 = class151.field2462[var6 + 1];
                            class151.field2462[var6++] = class97.method646(var96, var95, -119);
                            continue;
                        }
                        if (var474 == 3316) {
                            if (class299.field5067 < 2) {
                                class151.field2462[var6++] = 0;
                            } else {
                                class151.field2462[var6++] = class299.field5067;
                            }
                            continue;
                        }
                        if (var474 == 3317) {
                            class151.field2462[var6++] = class302.field5115;
                            continue;
                        }
                        if (var474 == 3318) {
                            class151.field2462[var6++] = class160.field2639;
                            continue;
                        }
                        if (var474 == 3321) {
                            class151.field2462[var6++] = class104.field1801;
                            continue;
                        }
                        if (var474 == 3322) {
                            class151.field2462[var6++] = class269.field4552;
                            continue;
                        }
                        if (var474 == 3323) {
                            if (class138.field2299 >= 5 && class138.field2299 <= 9) {
                                class151.field2462[var6++] = 1;
                                continue;
                            }
                            class151.field2462[var6++] = 0;
                            continue;
                        }
                        if (var474 == 3324) {
                            if (class138.field2299 >= 5 && class138.field2299 <= 9) {
                                class151.field2462[var6++] = class138.field2299;
                                continue;
                            }
                            class151.field2462[var6++] = 0;
                            continue;
                        }
                        if (var474 == 3325) {
                            if (class217.field3682 > 0) {
                                class151.field2462[var6++] = 1;
                            } else {
                                class151.field2462[var6++] = 0;
                            }
                            continue;
                        }
                        if (var474 == 3326) {
                            class151.field2462[var6++] = class213.field3624.field3259;
                            continue;
                        }
                        if (var474 == 3327) {
                            class151.field2462[var6++] = class213.field3624.field3277.field4460 ? 1 : 0;
                            continue;
                        }
                        if (var474 == 3328) {
                            class151.field2462[var6++] = class68.field964;
                            continue;
                        }
                        if (var474 == 3329) {
                            class151.field2462[var6++] = class222.field3732;
                            continue;
                        }
                        if (var474 == 3330) {
                            var6--;
                            int var97 = class151.field2462[var6];
                            class151.field2462[var6++] = class96.method618(true, var97);
                            continue;
                        }
                        if (var474 == 3331) {
                            var6 -= 2;
                            int var98 = class151.field2462[var6];
                            int var99 = class151.field2462[var6 + 1];
                            class151.field2462[var6++] = class277.method1855(var99, var98, 0, false);
                            continue;
                        }
                        if (var474 == 3332) {
                            var6 -= 2;
                            int var100 = class151.field2462[var6];
                            int var101 = class151.field2462[var6 + 1];
                            class151.field2462[var6++] = class277.method1855(var101, var100, 0, true);
                            continue;
                        }
                        if (var474 == 3333) {
                            class151.field2462[var6++] = class27.field403;
                            continue;
                        }
                    } else if (var474 < 3500) {
                        if (var474 == 3400) {
                            var6 -= 2;
                            int var102 = class151.field2462[var6 + 1];
                            int var103 = class151.field2462[var6];
                            class140 var104 = class202.method1292(var103, (byte) -102);
                            if (var104.field2345 != 115) {
                            }
                            class57.field790[var7++] = var104.method884(var102, -86);
                            continue;
                        }
                        if (var474 == 3408) {
                            var6 -= 4;
                            int var105 = class151.field2462[var6 + 2];
                            int var106 = class151.field2462[var6];
                            int var107 = class151.field2462[var6 + 1];
                            int var108 = class151.field2462[var6 + 3];
                            class140 var109 = class202.method1292(var105, (byte) -109);
                            if (var109.field2346 == var106 && var109.field2345 == var107) {
                                if (var107 == 115) {
                                    class57.field790[var7++] = var109.method884(var108, -122);
                                } else {
                                    class151.field2462[var6++] = var109.method879(var108, false);
                                }
                                continue;
                            }
                            throw new RuntimeException("C3408-1");
                        }
                        if (var474 == 3409) {
                            var6 -= 3;
                            int var110 = class151.field2462[var6 + 1];
                            int var111 = class151.field2462[var6];
                            int var112 = class151.field2462[var6 + 2];
                            if (var110 == -1) {
                                throw new RuntimeException("C3409-2");
                            }
                            class140 var113 = class202.method1292(var110, (byte) -92);
                            if (var113.field2345 != var111) {
                                throw new RuntimeException("C3409-1");
                            }
                            class151.field2462[var6++] = var113.method878(var112, (byte) 74) ? 1 : 0;
                            continue;
                        }
                        if (var474 == 3410) {
                            var6--;
                            int var114 = class151.field2462[var6];
                            var7--;
                            class283 var115 = class57.field790[var7];
                            if (var114 == -1) {
                                throw new RuntimeException("C3410-2");
                            }
                            class140 var116 = class202.method1292(var114, (byte) -73);
                            if (var116.field2345 != 115) {
                                throw new RuntimeException("C3410-1");
                            }
                            class151.field2462[var6++] = var116.method883(var115, -1) ? 1 : 0;
                            continue;
                        }
                        if (var474 == 3411) {
                            var6--;
                            int var117 = class151.field2462[var6];
                            class140 var118 = class202.method1292(var117, (byte) -99);
                            class151.field2462[var6++] = var118.field2337.method1608((byte) -102);
                            continue;
                        }
                    } else if (var474 < 3700) {
                        if (var474 == 3600) {
                            if (class257.field4332 == 0) {
                                class151.field2462[var6++] = -2;
                            } else if (class257.field4332 == 1) {
                                class151.field2462[var6++] = -1;
                            } else {
                                class151.field2462[var6++] = class103.field1748;
                            }
                            continue;
                        }
                        if (var474 == 3601) {
                            var6--;
                            int var395 = class151.field2462[var6];
                            if (class257.field4332 == 2 && var395 < class103.field1748) {
                                class57.field790[var7++] = class143.field2372[var395];
                                continue;
                            }
                            class57.field790[var7++] = class150.field2454;
                            continue;
                        }
                        if (var474 == 3602) {
                            var6--;
                            int var396 = class151.field2462[var6];
                            if (class257.field4332 == 2 && var396 < class103.field1748) {
                                class151.field2462[var6++] = class194.field3321[var396];
                                continue;
                            }
                            class151.field2462[var6++] = 0;
                            continue;
                        }
                        if (var474 == 3603) {
                            var6--;
                            int var397 = class151.field2462[var6];
                            if (class257.field4332 == 2 && var397 < class103.field1748) {
                                class151.field2462[var6++] = class42.field586[var397];
                                continue;
                            }
                            class151.field2462[var6++] = 0;
                            continue;
                        }
                        if (var474 == 3604) {
                            var7--;
                            class283 var398 = class57.field790[var7];
                            var6--;
                            int var399 = class151.field2462[var6];
                            class302.method2048(var399, var398, 27752);
                            continue;
                        }
                        if (var474 == 3605) {
                            var7--;
                            class283 var400 = class57.field790[var7];
                            class23.method168(0, var400.method1929((byte) -24));
                            continue;
                        }
                        if (var474 == 3606) {
                            var7--;
                            class283 var401 = class57.field790[var7];
                            class295.method2006(var401.method1929((byte) -24), 0);
                            continue;
                        }
                        if (var474 == 3607) {
                            var7--;
                            class283 var402 = class57.field790[var7];
                            class148.method918(-97, var402.method1929((byte) -24));
                            continue;
                        }
                        if (var474 == 3608) {
                            var7--;
                            class283 var403 = class57.field790[var7];
                            class12.method64(false, var403.method1929((byte) -24));
                            continue;
                        }
                        if (var474 == 3609) {
                            var7--;
                            class283 var404 = class57.field790[var7];
                            if (var404.method1899(class63.field874, (byte) 38) || var404.method1899(class19.field236, (byte) 38)) {
                                var404 = var404.method1914((byte) -106, 7);
                            }
                            class151.field2462[var6++] = class128.method799(0, var404) ? 1 : 0;
                            continue;
                        }
                        if (var474 == 3610) {
                            var6--;
                            int var405 = class151.field2462[var6];
                            if (class257.field4332 == 2 && var405 < class103.field1748) {
                                class57.field790[var7++] = class16.field190[var405];
                                continue;
                            }
                            class57.field790[var7++] = class150.field2454;
                            continue;
                        }
                        if (var474 == 3611) {
                            if (class228.field3836 == null) {
                                class57.field790[var7++] = class150.field2454;
                            } else {
                                class57.field790[var7++] = class228.field3836.method1901(4095);
                            }
                            continue;
                        }
                        if (var474 == 3612) {
                            if (class228.field3836 == null) {
                                class151.field2462[var6++] = 0;
                            } else {
                                class151.field2462[var6++] = class118.field1982;
                            }
                            continue;
                        }
                        if (var474 == 3613) {
                            var6--;
                            int var406 = class151.field2462[var6];
                            if (class228.field3836 != null && var406 < class118.field1982) {
                                class57.field790[var7++] = class124.field2070[var406].field360.method1901(4095);
                                continue;
                            }
                            class57.field790[var7++] = class150.field2454;
                            continue;
                        }
                        if (var474 == 3614) {
                            var6--;
                            int var407 = class151.field2462[var6];
                            if (class228.field3836 != null && var407 < class118.field1982) {
                                class151.field2462[var6++] = class124.field2070[var407].field371;
                                continue;
                            }
                            class151.field2462[var6++] = 0;
                            continue;
                        }
                        if (var474 == 3615) {
                            var6--;
                            int var408 = class151.field2462[var6];
                            if (class228.field3836 != null && class118.field1982 > var408) {
                                class151.field2462[var6++] = class124.field2070[var408].field369;
                                continue;
                            }
                            class151.field2462[var6++] = 0;
                            continue;
                        }
                        if (var474 == 3616) {
                            class151.field2462[var6++] = class7.field80;
                            continue;
                        }
                        if (var474 == 3617) {
                            var7--;
                            class283 var409 = class57.field790[var7];
                            class242.method1628(var409, true);
                            continue;
                        }
                        if (var474 == 3618) {
                            class151.field2462[var6++] = class122.field2038;
                            continue;
                        }
                        if (var474 == 3619) {
                            var7--;
                            class283 var410 = class57.field790[var7];
                            class237.method1580((byte) 78, var410.method1929((byte) -24));
                            continue;
                        }
                        if (var474 == 3620) {
                            class177.method1166(65);
                            continue;
                        }
                        if (var474 == 3621) {
                            if (class257.field4332 == 0) {
                                class151.field2462[var6++] = -1;
                            } else {
                                class151.field2462[var6++] = class195.field3330;
                            }
                            continue;
                        }
                        if (var474 == 3622) {
                            var6--;
                            int var411 = class151.field2462[var6];
                            if (class257.field4332 != 0 && class195.field3330 > var411) {
                                class57.field790[var7++] = class232.method1567(class110.field1854[var411], 6).method1901(4095);
                                continue;
                            }
                            class57.field790[var7++] = class150.field2454;
                            continue;
                        }
                        if (var474 == 3623) {
                            var7--;
                            class283 var412 = class57.field790[var7];
                            if (var412.method1899(class63.field874, (byte) 38) || var412.method1899(class19.field236, (byte) 38)) {
                                var412 = var412.method1914((byte) -127, 7);
                            }
                            class151.field2462[var6++] = class288.method1970(var412, true) ? 1 : 0;
                            continue;
                        }
                        if (var474 == 3624) {
                            var6--;
                            int var413 = class151.field2462[var6];
                            if (class124.field2070 != null && var413 < class118.field1982 && class124.field2070[var413].field360.method1910(16369, class213.field3624.field3274)) {
                                class151.field2462[var6++] = 1;
                                continue;
                            }
                            class151.field2462[var6++] = 0;
                            continue;
                        }
                        if (var474 == 3625) {
                            if (class149.field2434 == null) {
                                class57.field790[var7++] = class150.field2454;
                            } else {
                                class57.field790[var7++] = class149.field2434.method1901(4095);
                            }
                            continue;
                        }
                        if (var474 == 3626) {
                            var6--;
                            int var414 = class151.field2462[var6];
                            if (class228.field3836 != null && class118.field1982 > var414) {
                                class57.field790[var7++] = class124.field2070[var414].field363;
                                continue;
                            }
                            class57.field790[var7++] = class150.field2454;
                            continue;
                        }
                        if (var474 == 3627) {
                            var6--;
                            int var415 = class151.field2462[var6];
                            if (class257.field4332 == 2 && var415 >= 0 && class103.field1748 > var415) {
                                class151.field2462[var6++] = class245.field4166[var415] ? 1 : 0;
                                continue;
                            }
                            class151.field2462[var6++] = 0;
                            continue;
                        }
                        if (var474 == 3628) {
                            var7--;
                            class283 var416 = class57.field790[var7];
                            if (var416.method1899(class63.field874, (byte) 38) || var416.method1899(class19.field236, (byte) 38)) {
                                var416 = var416.method1914((byte) -59, 7);
                            }
                            class151.field2462[var6++] = class145.method911(var416, 86);
                            continue;
                        }
                    } else if (var474 < 4000) {
                        if (var474 == 3903) {
                            var6--;
                            int var381 = class151.field2462[var6];
                            class151.field2462[var6++] = class241.field4062[var381].method1667(0);
                            continue;
                        }
                        if (var474 == 3904) {
                            var6--;
                            int var382 = class151.field2462[var6];
                            class151.field2462[var6++] = class241.field4062[var382].field4159;
                            continue;
                        }
                        if (var474 == 3905) {
                            var6--;
                            int var383 = class151.field2462[var6];
                            class151.field2462[var6++] = class241.field4062[var383].field4162;
                            continue;
                        }
                        if (var474 == 3906) {
                            var6--;
                            int var384 = class151.field2462[var6];
                            class151.field2462[var6++] = class241.field4062[var384].field4167;
                            continue;
                        }
                        if (var474 == 3907) {
                            var6--;
                            int var385 = class151.field2462[var6];
                            class151.field2462[var6++] = class241.field4062[var385].field4168;
                            continue;
                        }
                        if (var474 == 3908) {
                            var6--;
                            int var386 = class151.field2462[var6];
                            class151.field2462[var6++] = class241.field4062[var386].field4170;
                            continue;
                        }
                        if (var474 == 3910) {
                            var6--;
                            int var387 = class151.field2462[var6];
                            int var388 = class241.field4062[var387].method1666((byte) 76);
                            class151.field2462[var6++] = var388 == 0 ? 1 : 0;
                            continue;
                        }
                        if (var474 == 3911) {
                            var6--;
                            int var389 = class151.field2462[var6];
                            int var390 = class241.field4062[var389].method1666((byte) 76);
                            class151.field2462[var6++] = var390 == 2 ? 1 : 0;
                            continue;
                        }
                        if (var474 == 3912) {
                            var6--;
                            int var391 = class151.field2462[var6];
                            int var392 = class241.field4062[var391].method1666((byte) 76);
                            class151.field2462[var6++] = var392 == 5 ? 1 : 0;
                            continue;
                        }
                        if (var474 == 3913) {
                            var6--;
                            int var393 = class151.field2462[var6];
                            int var394 = class241.field4062[var393].method1666((byte) 76);
                            class151.field2462[var6++] = var394 == 1 ? 1 : 0;
                            continue;
                        }
                    } else if (var474 < 4100) {
                        if (var474 == 4000) {
                            var6 -= 2;
                            int var336 = class151.field2462[var6 + 1];
                            int var337 = class151.field2462[var6];
                            class151.field2462[var6++] = var336 + var337;
                            continue;
                        }
                        if (var474 == 4001) {
                            var6 -= 2;
                            int var338 = class151.field2462[var6];
                            int var339 = class151.field2462[var6 + 1];
                            class151.field2462[var6++] = var338 - var339;
                            continue;
                        }
                        if (var474 == 4002) {
                            var6 -= 2;
                            int var340 = class151.field2462[var6];
                            int var341 = class151.field2462[var6 + 1];
                            class151.field2462[var6++] = var340 * var341;
                            continue;
                        }
                        if (var474 == 4003) {
                            var6 -= 2;
                            int var342 = class151.field2462[var6];
                            int var343 = class151.field2462[var6 + 1];
                            class151.field2462[var6++] = var342 / var343;
                            continue;
                        }
                        if (var474 == 4004) {
                            var6--;
                            int var344 = class151.field2462[var6];
                            class151.field2462[var6++] = (int) (Math.random() * (double) var344);
                            continue;
                        }
                        if (var474 == 4005) {
                            var6--;
                            int var345 = class151.field2462[var6];
                            class151.field2462[var6++] = (int) (Math.random() * (double) (var345 + 1));
                            continue;
                        }
                        if (var474 == 4006) {
                            var6 -= 5;
                            int var346 = class151.field2462[var6];
                            int var347 = class151.field2462[var6 + 2];
                            int var348 = class151.field2462[var6 + 1];
                            int var349 = class151.field2462[var6 + 3];
                            int var350 = class151.field2462[var6 + 4];
                            class151.field2462[var6++] = var346 + ((var348 - var346) * (var350 - var347) / (var349 - var347));
                            continue;
                        }
                        if (var474 == 4007) {
                            var6 -= 2;
                            long var351 = (long) class151.field2462[var6];
                            long var353 = (long) class151.field2462[var6 + 1];
                            class151.field2462[var6++] = (int) (var351 * var353 / 100L + var351);
                            continue;
                        }
                        if (var474 == 4008) {
                            var6 -= 2;
                            int var355 = class151.field2462[var6 + 1];
                            int var356 = class151.field2462[var6];
                            class151.field2462[var6++] = class53.method337(0x1 << var355, var356);
                            continue;
                        }
                        if (var474 == 4009) {
                            var6 -= 2;
                            int var357 = class151.field2462[var6];
                            int var358 = class151.field2462[var6 + 1];
                            class151.field2462[var6++] = class178.method1174(-(0x1 << var358) - 1, var357);
                            continue;
                        }
                        if (var474 == 4010) {
                            var6 -= 2;
                            int var359 = class151.field2462[var6];
                            int var360 = class151.field2462[var6 + 1];
                            class151.field2462[var6++] = class178.method1174(0x1 << var360, var359) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var474 == 4011) {
                            var6 -= 2;
                            int var361 = class151.field2462[var6 + 1];
                            int var362 = class151.field2462[var6];
                            class151.field2462[var6++] = var362 % var361;
                            continue;
                        }
                        if (var474 == 4012) {
                            var6 -= 2;
                            int var363 = class151.field2462[var6 + 1];
                            int var364 = class151.field2462[var6];
                            if (var364 == 0) {
                                class151.field2462[var6++] = 0;
                            } else {
                                class151.field2462[var6++] = (int) Math.pow((double) var364, (double) var363);
                            }
                            continue;
                        }
                        if (var474 == 4013) {
                            var6 -= 2;
                            int var365 = class151.field2462[var6];
                            int var366 = class151.field2462[var6 + 1];
                            if (var365 == 0) {
                                class151.field2462[var6++] = 0;
                            } else if (var366 == 0) {
                                class151.field2462[var6++] = Integer.MAX_VALUE;
                            } else {
                                class151.field2462[var6++] = (int) Math.pow((double) var365, 1.0D / (double) var366);
                            }
                            continue;
                        }
                        if (var474 == 4014) {
                            var6 -= 2;
                            int var367 = class151.field2462[var6];
                            int var368 = class151.field2462[var6 + 1];
                            class151.field2462[var6++] = class178.method1174(var368, var367);
                            continue;
                        }
                        if (var474 == 4015) {
                            var6 -= 2;
                            int var369 = class151.field2462[var6];
                            int var370 = class151.field2462[var6 + 1];
                            class151.field2462[var6++] = class53.method337(var370, var369);
                            continue;
                        }
                        if (var474 == 4016) {
                            var6 -= 2;
                            int var371 = class151.field2462[var6 + 1];
                            int var372 = class151.field2462[var6];
                            class151.field2462[var6++] = var371 > var372 ? var372 : var371;
                            continue;
                        }
                        if (var474 == 4017) {
                            var6 -= 2;
                            int var373 = class151.field2462[var6 + 1];
                            int var374 = class151.field2462[var6];
                            class151.field2462[var6++] = var373 >= var374 ? var373 : var374;
                            continue;
                        }
                        if (var474 == 4018) {
                            var6 -= 3;
                            long var375 = (long) class151.field2462[var6 + 1];
                            long var377 = (long) class151.field2462[var6];
                            long var379 = (long) class151.field2462[var6 + 2];
                            class151.field2462[var6++] = (int) (var377 * var379 / var375);
                            continue;
                        }
                    } else if (var474 < 4200) {
                        if (var474 == 4100) {
                            var7--;
                            class283 var119 = class57.field790[var7];
                            var6--;
                            int var120 = class151.field2462[var6];
                            class57.field790[var7++] = class299.method2022(new class283[] { var119, class296.method2012(var120, (byte) 120) }, (byte) 125);
                            continue;
                        }
                        if (var474 == 4101) {
                            var7 -= 2;
                            class283 var121 = class57.field790[var7 + 1];
                            class283 var122 = class57.field790[var7];
                            class57.field790[var7++] = class299.method2022(new class283[] { var122, var121 }, (byte) 111);
                            continue;
                        }
                        if (var474 == 4102) {
                            var7--;
                            class283 var123 = class57.field790[var7];
                            var6--;
                            int var124 = class151.field2462[var6];
                            class57.field790[var7++] = class299.method2022(new class283[] { var123, class263.method1784(var124, 10, true) }, (byte) 126);
                            continue;
                        }
                        if (var474 == 4103) {
                            var7--;
                            class283 var125 = class57.field790[var7];
                            class57.field790[var7++] = var125.method1912(9974);
                            continue;
                        }
                        if (var474 == 4104) {
                            var6--;
                            int var126 = class151.field2462[var6];
                            long var127 = ((long) var126 + 11745L) * 86400000L;
                            class119.field2003.setTime(new Date(var127));
                            int var129 = class119.field2003.get(5);
                            int var130 = class119.field2003.get(2);
                            int var131 = class119.field2003.get(1);
                            class57.field790[var7++] = class299.method2022(new class283[] { class296.method2012(var129, (byte) 109), class291.field4946, class199.field3407[var130], class291.field4946, class296.method2012(var131, (byte) -107) }, (byte) 10);
                            continue;
                        }
                        if (var474 == 4105) {
                            var7 -= 2;
                            class283 var132 = class57.field790[var7 + 1];
                            class283 var133 = class57.field790[var7];
                            if (class213.field3624.field3277 != null && class213.field3624.field3277.field4460) {
                                class57.field790[var7++] = var132;
                                continue;
                            }
                            class57.field790[var7++] = var133;
                            continue;
                        }
                        if (var474 == 4106) {
                            var6--;
                            int var134 = class151.field2462[var6];
                            class57.field790[var7++] = class296.method2012(var134, (byte) 115);
                            continue;
                        }
                        if (var474 == 4107) {
                            var7 -= 2;
                            class151.field2462[var6++] = class57.field790[var7].method1927(class57.field790[var7 + 1], (byte) -118);
                            continue;
                        }
                        if (var474 == 4108) {
                            var6 -= 2;
                            int var135 = class151.field2462[var6];
                            var7--;
                            class283 var136 = class57.field790[var7];
                            int var137 = class151.field2462[var6 + 1];
                            byte[] var138 = class94.field1587.method1107(var137, 0, 121);
                            class4 var139 = new class4(var138);
                            var139.method1655(class65.field895, (int[]) null);
                            class151.field2462[var6++] = var139.method1640(var136, var135);
                            continue;
                        }
                        if (var474 == 4109) {
                            var7--;
                            class283 var140 = class57.field790[var7];
                            var6 -= 2;
                            int var141 = class151.field2462[var6];
                            int var142 = class151.field2462[var6 + 1];
                            byte[] var143 = class94.field1587.method1107(var142, 0, 115);
                            class4 var144 = new class4(var143);
                            var144.method1655(class65.field895, (int[]) null);
                            class151.field2462[var6++] = var144.method1663(var140, var141);
                            continue;
                        }
                        if (var474 == 4110) {
                            var7 -= 2;
                            class283 var145 = class57.field790[var7];
                            class283 var146 = class57.field790[var7 + 1];
                            var6--;
                            if (class151.field2462[var6] == 1) {
                                class57.field790[var7++] = var145;
                            } else {
                                class57.field790[var7++] = var146;
                            }
                            continue;
                        }
                        if (var474 == 4111) {
                            var7--;
                            class283 var147 = class57.field790[var7];
                            class57.field790[var7++] = class244.method1661(var147);
                            continue;
                        }
                        if (var474 == 4112) {
                            var7--;
                            class283 var148 = class57.field790[var7];
                            var6--;
                            int var149 = class151.field2462[var6];
                            if (var149 == -1) {
                                throw new RuntimeException("null char");
                            }
                            class57.field790[var7++] = var148.method1921((byte) 126, var149);
                            continue;
                        }
                        if (var474 == 4113) {
                            var6--;
                            int var150 = class151.field2462[var6];
                            class151.field2462[var6++] = class219.method1439(var150, -120) ? 1 : 0;
                            continue;
                        }
                        if (var474 == 4114) {
                            var6--;
                            int var151 = class151.field2462[var6];
                            class151.field2462[var6++] = class309.method2102(var151, (byte) -21) ? 1 : 0;
                            continue;
                        }
                        if (var474 == 4115) {
                            var6--;
                            int var152 = class151.field2462[var6];
                            class151.field2462[var6++] = class67.method428(-123, var152) ? 1 : 0;
                            continue;
                        }
                        if (var474 == 4116) {
                            var6--;
                            int var153 = class151.field2462[var6];
                            class151.field2462[var6++] = class309.method2101(var153, 67) ? 1 : 0;
                            continue;
                        }
                        if (var474 == 4117) {
                            var7--;
                            class283 var154 = class57.field790[var7];
                            if (var154 == null) {
                                class151.field2462[var6++] = 0;
                            } else {
                                class151.field2462[var6++] = var154.method1925((byte) -44);
                            }
                            continue;
                        }
                        if (var474 == 4118) {
                            var6 -= 2;
                            var7--;
                            class283 var155 = class57.field790[var7];
                            int var156 = class151.field2462[var6 + 1];
                            int var157 = class151.field2462[var6];
                            class57.field790[var7++] = var155.method1936(-63, var157, var156);
                            continue;
                        }
                        if (var474 == 4119) {
                            var7--;
                            class283 var158 = class57.field790[var7];
                            class283 var159 = class260.method1756((byte) -49, var158.method1925((byte) -44));
                            boolean var160 = false;
                            for (int var161 = 0; var161 < var158.method1925((byte) -44); var161++) {
                                int var162 = var158.method1928(var161, (byte) 64);
                                if (var162 == 60) {
                                    var160 = true;
                                } else if (var162 == 62) {
                                    var160 = false;
                                } else if (!var160) {
                                    var159.method1924(var162, (byte) -113);
                                }
                            }
                            var159.method1900((byte) 108);
                            class57.field790[var7++] = var159;
                            continue;
                        }
                        if (var474 == 4120) {
                            var6 -= 2;
                            var7--;
                            class283 var163 = class57.field790[var7];
                            int var164 = class151.field2462[var6];
                            int var165 = class151.field2462[var6 + 1];
                            class151.field2462[var6++] = var163.method1948(var165, var164, (byte) 107);
                            continue;
                        }
                        if (var474 == 4121) {
                            var7 -= 2;
                            class283 var166 = class57.field790[var7];
                            class283 var167 = class57.field790[var7 + 1];
                            var6--;
                            int var168 = class151.field2462[var6];
                            class151.field2462[var6++] = var166.method1913(var167, 0, var168);
                            continue;
                        }
                        if (var474 == 4122) {
                            var6--;
                            int var169 = class151.field2462[var6];
                            class151.field2462[var6++] = class64.method409(54, var169);
                            continue;
                        }
                        if (var474 == 4123) {
                            var6--;
                            int var170 = class151.field2462[var6];
                            class151.field2462[var6++] = class227.method1486((byte) -105, var170);
                            continue;
                        }
                    } else if (var474 < 4300) {
                        if (var474 == 4200) {
                            var6--;
                            int var317 = class151.field2462[var6];
                            class57.field790[var7++] = class103.method676(var317, -1).field5155;
                            continue;
                        }
                        if (var474 == 4201) {
                            var6 -= 2;
                            int var318 = class151.field2462[var6];
                            int var319 = class151.field2462[var6 + 1];
                            class304 var320 = class103.method676(var318, -1);
                            if (var319 >= 1 && var319 <= 5 && var320.field5151[var319 - 1] != null) {
                                class57.field790[var7++] = var320.field5151[var319 - 1];
                                continue;
                            }
                            class57.field790[var7++] = class150.field2454;
                            continue;
                        }
                        if (var474 == 4202) {
                            var6 -= 2;
                            int var321 = class151.field2462[var6];
                            int var322 = class151.field2462[var6 + 1];
                            class304 var323 = class103.method676(var321, -1);
                            if (var322 >= 1 && var322 <= 5 && var323.field5129[var322 - 1] != null) {
                                class57.field790[var7++] = var323.field5129[var322 - 1];
                                continue;
                            }
                            class57.field790[var7++] = class150.field2454;
                            continue;
                        }
                        if (var474 == 4203) {
                            var6--;
                            int var324 = class151.field2462[var6];
                            class151.field2462[var6++] = class103.method676(var324, -1).field5192;
                            continue;
                        }
                        if (var474 == 4204) {
                            var6--;
                            int var325 = class151.field2462[var6];
                            class151.field2462[var6++] = class103.method676(var325, -1).field5162 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var474 == 4205) {
                            var6--;
                            int var326 = class151.field2462[var6];
                            class304 var327 = class103.method676(var326, -1);
                            if (var327.field5143 == -1 && var327.field5131 >= 0) {
                                class151.field2462[var6++] = var327.field5131;
                                continue;
                            }
                            class151.field2462[var6++] = var326;
                            continue;
                        }
                        if (var474 == 4206) {
                            var6--;
                            int var328 = class151.field2462[var6];
                            class304 var329 = class103.method676(var328, -1);
                            if (var329.field5143 >= 0 && var329.field5131 >= 0) {
                                class151.field2462[var6++] = var329.field5131;
                                continue;
                            }
                            class151.field2462[var6++] = var328;
                            continue;
                        }
                        if (var474 == 4207) {
                            var6--;
                            int var330 = class151.field2462[var6];
                            class151.field2462[var6++] = class103.method676(var330, -1).field5125 ? 1 : 0;
                            continue;
                        }
                        if (var474 == 4208) {
                            var6 -= 2;
                            int var331 = class151.field2462[var6 + 1];
                            int var332 = class151.field2462[var6];
                            class118 var333 = class92.method592((byte) -121, var331);
                            if (var333.method758(-5)) {
                                class57.field790[var7++] = class103.method676(var332, -1).method2062((byte) -90, var333.field1991, var331);
                            } else {
                                class151.field2462[var6++] = class103.method676(var332, -1).method2058(0, var333.field1983, var331);
                            }
                            continue;
                        }
                        if (var474 == 4210) {
                            var6--;
                            int var334 = class151.field2462[var6];
                            var7--;
                            class283 var335 = class57.field790[var7];
                            class164.method998(-56, ~var334 == -2, var335);
                            class151.field2462[var6++] = class89.field1515;
                            continue;
                        }
                        if (var474 == 4211) {
                            if (class57.field785 != null && class259.field4401 < class89.field1515) {
                                class151.field2462[var6++] = class178.method1174(class57.field785[class259.field4401++], 65535);
                                continue;
                            }
                            class151.field2462[var6++] = -1;
                            continue;
                        }
                        if (var474 == 4212) {
                            class259.field4401 = 0;
                            continue;
                        }
                    } else if (var474 < 4400) {
                        if (var474 == 4300) {
                            var6 -= 2;
                            int var307 = class151.field2462[var6 + 1];
                            int var308 = class151.field2462[var6];
                            class118 var309 = class92.method592((byte) 60, var307);
                            if (var309.method758(-5)) {
                                class57.field790[var7++] = class207.method1379(-63, var308).method805(var309.field1991, -63, var307);
                            } else {
                                class151.field2462[var6++] = class207.method1379(-63, var308).method811(var307, -7036, var309.field1983);
                            }
                            continue;
                        }
                        if (var474 == 4301) {
                            var6--;
                            int var310 = class151.field2462[var6];
                            class151.field2462[var6++] = class207.method1379(-63, var310).field2200;
                            continue;
                        }
                        if (var474 == 4302) {
                            var6--;
                            int var311 = class151.field2462[var6];
                            class151.field2462[var6++] = class207.method1379(-63, var311).field2158;
                            continue;
                        }
                        if (var474 == 4303) {
                            var6--;
                            int var312 = class151.field2462[var6];
                            class151.field2462[var6++] = class207.method1379(-63, var312).field2160;
                            continue;
                        }
                        if (var474 == 4304) {
                            var6--;
                            int var313 = class151.field2462[var6];
                            class151.field2462[var6++] = class207.method1379(-63, var313).field2146;
                            continue;
                        }
                        if (var474 == 4305) {
                            var6--;
                            int var314 = class151.field2462[var6];
                            class151.field2462[var6++] = class207.method1379(-63, var314).field2178;
                            continue;
                        }
                        if (var474 == 4306) {
                            var6--;
                            int var315 = class151.field2462[var6];
                            class151.field2462[var6++] = class207.method1379(-63, var315).field2168;
                            continue;
                        }
                        if (var474 == 4307) {
                            var6--;
                            int var316 = class151.field2462[var6];
                            class151.field2462[var6++] = class207.method1379(-63, var316).field2201;
                            continue;
                        }
                    } else if (var474 < 4500) {
                        if (var474 == 4400) {
                            var6 -= 2;
                            int var171 = class151.field2462[var6];
                            int var172 = class151.field2462[var6 + 1];
                            class118 var173 = class92.method592((byte) 78, var172);
                            if (var173.method758(-5)) {
                                class57.field790[var7++] = class254.method1722(0, var171).method1889(var172, var173.field1991, 3);
                            } else {
                                class151.field2462[var6++] = class254.method1722(0, var171).method1879(var173.field1983, 65535, var172);
                            }
                            continue;
                        }
                    } else if (var474 >= 4600) {
                        if (var474 < 5100) {
                            if (var474 == 5000) {
                                class151.field2462[var6++] = class297.field5029;
                                continue;
                            }
                            if (var474 == 5001) {
                                var6 -= 3;
                                class297.field5029 = class151.field2462[var6];
                                class192.field3299++;
                                class187.field3203 = class151.field2462[var6 + 1];
                                class159.field2598 = class151.field2462[var6 + 2];
                                class228.field3831.method621(221, 8);
                                class228.field3831.method1499(true, class297.field5029);
                                class228.field3831.method1499(true, class187.field3203);
                                class228.field3831.method1499(true, class159.field2598);
                                continue;
                            }
                            if (var474 == 5002) {
                                class69.field981++;
                                var6 -= 2;
                                var7--;
                                class283 var174 = class57.field790[var7];
                                int var175 = class151.field2462[var6];
                                int var176 = class151.field2462[var6 + 1];
                                class228.field3831.method621(92, 8);
                                class228.field3831.method1544((byte) 8, var174.method1929((byte) -24));
                                class228.field3831.method1499(true, var175 - 1);
                                class228.field3831.method1499(true, var176);
                                continue;
                            }
                            if (var474 == 5003) {
                                var6--;
                                int var177 = class151.field2462[var6];
                                class283 var178 = null;
                                if (var177 < 100) {
                                    var178 = class157.field2575[var177];
                                }
                                if (var178 == null) {
                                    var178 = class150.field2454;
                                }
                                class57.field790[var7++] = var178;
                                continue;
                            }
                            if (var474 == 5004) {
                                var6--;
                                int var179 = class151.field2462[var6];
                                int var180 = -1;
                                if (var179 < 100 && class157.field2575[var179] != null) {
                                    var180 = class184.field3168[var179];
                                }
                                class151.field2462[var6++] = var180;
                                continue;
                            }
                            if (var474 == 5005) {
                                class151.field2462[var6++] = class187.field3203;
                                continue;
                            }
                            if (var474 == 5008) {
                                var7--;
                                class283 var181 = class57.field790[var7];
                                if (!var181.method1899(class190.field3250, (byte) 38)) {
                                    if (class299.field5067 == 0 && (class68.field964 == 1 || class222.field3732 == 1)) {
                                        continue;
                                    }
                                    class302.field5110++;
                                    class283 var182 = var181.method1912(9974);
                                    byte var183 = 0;
                                    byte var184 = 0;
                                    if (var182.method1899(class256.field4330, (byte) 38)) {
                                        var184 = 0;
                                        var181 = var181.method1914((byte) -75, class256.field4330.method1925((byte) -44));
                                    } else if (var182.method1899(class104.field1776, (byte) 38)) {
                                        var181 = var181.method1914((byte) -123, class104.field1776.method1925((byte) -44));
                                        var184 = 1;
                                    } else if (var182.method1899(class13.field125, (byte) 38)) {
                                        var184 = 2;
                                        var181 = var181.method1914((byte) -47, class13.field125.method1925((byte) -44));
                                    } else if (var182.method1899(class180.field3090, (byte) 38)) {
                                        var181 = var181.method1914((byte) -69, class180.field3090.method1925((byte) -44));
                                        var184 = 3;
                                    } else if (var182.method1899(class12.field117, (byte) 38)) {
                                        var184 = 4;
                                        var181 = var181.method1914((byte) -120, class12.field117.method1925((byte) -44));
                                    } else if (var182.method1899(class217.field3685, (byte) 38)) {
                                        var181 = var181.method1914((byte) -125, class217.field3685.method1925((byte) -44));
                                        var184 = 5;
                                    } else if (var182.method1899(class306.field5249, (byte) 38)) {
                                        var181 = var181.method1914((byte) -96, class306.field5249.method1925((byte) -44));
                                        var184 = 6;
                                    } else if (var182.method1899(class46.field638, (byte) 38)) {
                                        var181 = var181.method1914((byte) -97, class46.field638.method1925((byte) -44));
                                        var184 = 7;
                                    } else if (var182.method1899(class261.field4437, (byte) 38)) {
                                        var181 = var181.method1914((byte) -107, class261.field4437.method1925((byte) -44));
                                        var184 = 8;
                                    } else if (var182.method1899(class256.field4322, (byte) 38)) {
                                        var184 = 9;
                                        var181 = var181.method1914((byte) -108, class256.field4322.method1925((byte) -44));
                                    } else if (var182.method1899(class137.field2278, (byte) 38)) {
                                        var181 = var181.method1914((byte) -111, class137.field2278.method1925((byte) -44));
                                        var184 = 10;
                                    } else if (var182.method1899(class23.field352, (byte) 38)) {
                                        var184 = 11;
                                        var181 = var181.method1914((byte) -72, class23.field352.method1925((byte) -44));
                                    } else if (class30.field468 != 0) {
                                        if (var182.method1899(class256.field4314, (byte) 38)) {
                                            var184 = 0;
                                            var181 = var181.method1914((byte) -85, class256.field4314.method1925((byte) -44));
                                        } else if (var182.method1899(class104.field1764, (byte) 38)) {
                                            var184 = 1;
                                            var181 = var181.method1914((byte) -116, class104.field1764.method1925((byte) -44));
                                        } else if (var182.method1899(class13.field137, (byte) 38)) {
                                            var181 = var181.method1914((byte) -122, class13.field137.method1925((byte) -44));
                                            var184 = 2;
                                        } else if (var182.method1899(class180.field3093, (byte) 38)) {
                                            var181 = var181.method1914((byte) -71, class180.field3093.method1925((byte) -44));
                                            var184 = 3;
                                        } else if (var182.method1899(class12.field109, (byte) 38)) {
                                            var184 = 4;
                                            var181 = var181.method1914((byte) -55, class12.field109.method1925((byte) -44));
                                        } else if (var182.method1899(class217.field3688, (byte) 38)) {
                                            var184 = 5;
                                            var181 = var181.method1914((byte) -108, class217.field3688.method1925((byte) -44));
                                        } else if (var182.method1899(class306.field5235, (byte) 38)) {
                                            var184 = 6;
                                            var181 = var181.method1914((byte) -115, class306.field5235.method1925((byte) -44));
                                        } else if (var182.method1899(class46.field640, (byte) 38)) {
                                            var181 = var181.method1914((byte) -66, class46.field640.method1925((byte) -44));
                                            var184 = 7;
                                        } else if (var182.method1899(class261.field4439, (byte) 38)) {
                                            var181 = var181.method1914((byte) -90, class261.field4439.method1925((byte) -44));
                                            var184 = 8;
                                        } else if (var182.method1899(class256.field4331, (byte) 38)) {
                                            var181 = var181.method1914((byte) -128, class256.field4331.method1925((byte) -44));
                                            var184 = 9;
                                        } else if (var182.method1899(class137.field2286, (byte) 38)) {
                                            var184 = 10;
                                            var181 = var181.method1914((byte) -37, class137.field2286.method1925((byte) -44));
                                        } else if (var182.method1899(class23.field346, (byte) 38)) {
                                            var181 = var181.method1914((byte) -80, class23.field346.method1925((byte) -44));
                                            var184 = 11;
                                        }
                                    }
                                    class283 var185 = var181.method1912(9974);
                                    if (var185.method1899(class247.field4229, (byte) 38)) {
                                        var183 = 1;
                                        var181 = var181.method1914((byte) -113, class247.field4229.method1925((byte) -44));
                                    } else if (var185.method1899(class186.field3196, (byte) 38)) {
                                        var181 = var181.method1914((byte) -58, class186.field3196.method1925((byte) -44));
                                        var183 = 2;
                                    } else if (var185.method1899(class202.field3454, (byte) 38)) {
                                        var183 = 3;
                                        var181 = var181.method1914((byte) -62, class202.field3454.method1925((byte) -44));
                                    } else if (var185.method1899(class60.field828, (byte) 38)) {
                                        var183 = 4;
                                        var181 = var181.method1914((byte) -90, class60.field828.method1925((byte) -44));
                                    } else if (var185.method1899(class154.field2529, (byte) 38)) {
                                        var183 = 5;
                                        var181 = var181.method1914((byte) -51, class154.field2529.method1925((byte) -44));
                                    } else if (class30.field468 != 0) {
                                        if (var185.method1899(class247.field4228, (byte) 38)) {
                                            var181 = var181.method1914((byte) -45, class247.field4228.method1925((byte) -44));
                                            var183 = 1;
                                        } else if (var185.method1899(class186.field3198, (byte) 38)) {
                                            var181 = var181.method1914((byte) -38, class186.field3198.method1925((byte) -44));
                                            var183 = 2;
                                        } else if (var185.method1899(class202.field3457, (byte) 38)) {
                                            var181 = var181.method1914((byte) -111, class202.field3457.method1925((byte) -44));
                                            var183 = 3;
                                        } else if (var185.method1899(class60.field824, (byte) 38)) {
                                            var181 = var181.method1914((byte) -77, class60.field824.method1925((byte) -44));
                                            var183 = 4;
                                        } else if (var185.method1899(class154.field2533, (byte) 38)) {
                                            var183 = 5;
                                            var181 = var181.method1914((byte) -71, class154.field2533.method1925((byte) -44));
                                        }
                                    }
                                    class228.field3831.method621(171, 8);
                                    class228.field3831.method1499(true, 0);
                                    int var186 = class228.field3831.field3905;
                                    class228.field3831.method1499(true, var184);
                                    class228.field3831.method1499(true, var183);
                                    class10.method57(var181, class228.field3831, 108);
                                    class228.field3831.method1511(class228.field3831.field3905 - var186, -38);
                                    continue;
                                }
                                class272.method1829(var181, 30089);
                                continue;
                            }
                            if (var474 == 5009) {
                                var7 -= 2;
                                class283 var187 = class57.field790[var7 + 1];
                                class283 var188 = class57.field790[var7];
                                if (class299.field5067 != 0 || class68.field964 != 1 && class222.field3732 != 1) {
                                    class228.field3831.method621(210, 8);
                                    class228.field3831.method1499(true, 0);
                                    class223.field3759++;
                                    int var189 = class228.field3831.field3905;
                                    class228.field3831.method1544((byte) 8, var188.method1929((byte) -24));
                                    class10.method57(var187, class228.field3831, 89);
                                    class228.field3831.method1511(class228.field3831.field3905 - var189, -102);
                                }
                                continue;
                            }
                            if (var474 == 5010) {
                                var6--;
                                int var190 = class151.field2462[var6];
                                class283 var191 = null;
                                if (var190 < 100) {
                                    var191 = class90.field1528[var190];
                                }
                                if (var191 == null) {
                                    var191 = class150.field2454;
                                }
                                class57.field790[var7++] = var191;
                                continue;
                            }
                            if (var474 == 5011) {
                                var6--;
                                int var192 = class151.field2462[var6];
                                class283 var193 = null;
                                if (var192 < 100) {
                                    var193 = class296.field5014[var192];
                                }
                                if (var193 == null) {
                                    var193 = class150.field2454;
                                }
                                class57.field790[var7++] = var193;
                                continue;
                            }
                            if (var474 == 5012) {
                                var6--;
                                int var194 = class151.field2462[var6];
                                int var195 = -1;
                                if (var194 < 100) {
                                    var195 = class301.field5086[var194];
                                }
                                class151.field2462[var6++] = var195;
                                continue;
                            }
                            if (var474 == 5015) {
                                class283 var196;
                                if (class213.field3624 == null || class213.field3624.field3274 == null) {
                                    var196 = class213.field3620;
                                } else {
                                    var196 = class213.field3624.method1240(false);
                                }
                                class57.field790[var7++] = var196;
                                continue;
                            }
                            if (var474 == 5016) {
                                class151.field2462[var6++] = class159.field2598;
                                continue;
                            }
                            if (var474 == 5017) {
                                class151.field2462[var6++] = class269.field4549;
                                continue;
                            }
                            if (var474 == 5050) {
                                var6--;
                                int var197 = class151.field2462[var6];
                                class57.field790[var7++] = class74.method494(-118, var197).field4959;
                                continue;
                            }
                            if (var474 == 5051) {
                                var6--;
                                int var198 = class151.field2462[var6];
                                class294 var199 = class74.method494(80, var198);
                                if (var199.field4960 == null) {
                                    class151.field2462[var6++] = 0;
                                } else {
                                    class151.field2462[var6++] = var199.field4960.length;
                                }
                                continue;
                            }
                            if (var474 == 5052) {
                                var6 -= 2;
                                int var200 = class151.field2462[var6];
                                int var201 = class151.field2462[var6 + 1];
                                class294 var202 = class74.method494(-100, var200);
                                int var203 = var202.field4960[var201];
                                class151.field2462[var6++] = var203;
                                continue;
                            }
                            if (var474 == 5053) {
                                var6--;
                                int var204 = class151.field2462[var6];
                                class294 var205 = class74.method494(-102, var204);
                                if (var205.field4963 == null) {
                                    class151.field2462[var6++] = 0;
                                } else {
                                    class151.field2462[var6++] = var205.field4963.length;
                                }
                                continue;
                            }
                            if (var474 == 5054) {
                                var6 -= 2;
                                int var206 = class151.field2462[var6];
                                int var207 = class151.field2462[var6 + 1];
                                class151.field2462[var6++] = class74.method494(102, var206).field4963[var207];
                                continue;
                            }
                            if (var474 == 5055) {
                                var6--;
                                int var208 = class151.field2462[var6];
                                class57.field790[var7++] = class205.method1316(var208, 110).method2085(4);
                                continue;
                            }
                            if (var474 == 5056) {
                                var6--;
                                int var209 = class151.field2462[var6];
                                class306 var210 = class205.method1316(var209, 120);
                                if (var210.field5236 == null) {
                                    class151.field2462[var6++] = 0;
                                } else {
                                    class151.field2462[var6++] = var210.field5236.length;
                                }
                                continue;
                            }
                            if (var474 == 5057) {
                                var6 -= 2;
                                int var211 = class151.field2462[var6 + 1];
                                int var212 = class151.field2462[var6];
                                class151.field2462[var6++] = class205.method1316(var212, 121).field5236[var211];
                                continue;
                            }
                            if (var474 == 5058) {
                                class275.field4608 = new class130();
                                var6--;
                                class275.field4608.field2210 = class151.field2462[var6];
                                class275.field4608.field2208 = class205.method1316(class275.field4608.field2210, 126);
                                class275.field4608.field2209 = new int[class275.field4608.field2208.method2081(-54)];
                                continue;
                            }
                            if (var474 == 5059) {
                                class228.field3831.method621(124, 8);
                                class228.field3831.method1499(true, 0);
                                int var213 = class228.field3831.field3905;
                                class228.field3831.method1499(true, 0);
                                class228.field3831.method1510((byte) 85, class275.field4608.field2210);
                                class137.field2280++;
                                class275.field4608.field2208.method2083(-4, class275.field4608.field2209, class228.field3831);
                                class228.field3831.method1511(class228.field3831.field3905 - var213, -23);
                                continue;
                            }
                            if (var474 == 5060) {
                                class288.field4889++;
                                var7--;
                                class283 var214 = class57.field790[var7];
                                class228.field3831.method621(62, 8);
                                class228.field3831.method1499(true, 0);
                                int var215 = class228.field3831.field3905;
                                class228.field3831.method1544((byte) 8, var214.method1929((byte) -24));
                                class228.field3831.method1510((byte) 54, class275.field4608.field2210);
                                class275.field4608.field2208.method2083(-4, class275.field4608.field2209, class228.field3831);
                                class228.field3831.method1511(class228.field3831.field3905 - var215, -122);
                                continue;
                            }
                            if (var474 == 5061) {
                                class137.field2280++;
                                class228.field3831.method621(124, 8);
                                class228.field3831.method1499(true, 0);
                                int var216 = class228.field3831.field3905;
                                class228.field3831.method1499(true, 1);
                                class228.field3831.method1510((byte) 23, class275.field4608.field2210);
                                class275.field4608.field2208.method2083(-4, class275.field4608.field2209, class228.field3831);
                                class228.field3831.method1511(class228.field3831.field3905 - var216, -36);
                                continue;
                            }
                            if (var474 == 5062) {
                                var6 -= 2;
                                int var217 = class151.field2462[var6];
                                int var218 = class151.field2462[var6 + 1];
                                class151.field2462[var6++] = class74.method494(-128, var217).field4957[var218];
                                continue;
                            }
                            if (var474 == 5063) {
                                var6 -= 2;
                                int var219 = class151.field2462[var6];
                                int var220 = class151.field2462[var6 + 1];
                                class151.field2462[var6++] = class74.method494(-74, var219).field4961[var220];
                                continue;
                            }
                            if (var474 == 5064) {
                                var6 -= 2;
                                int var221 = class151.field2462[var6 + 1];
                                int var222 = class151.field2462[var6];
                                if (var221 == -1) {
                                    class151.field2462[var6++] = -1;
                                } else {
                                    class151.field2462[var6++] = class74.method494(64, var222).method1991(var221, 0);
                                }
                                continue;
                            }
                            if (var474 == 5065) {
                                var6 -= 2;
                                int var223 = class151.field2462[var6];
                                int var224 = class151.field2462[var6 + 1];
                                if (var224 == -1) {
                                    class151.field2462[var6++] = -1;
                                } else {
                                    class151.field2462[var6++] = class74.method494(-65, var223).method1992(var224, 14082);
                                }
                                continue;
                            }
                            if (var474 == 5066) {
                                var6--;
                                int var225 = class151.field2462[var6];
                                class151.field2462[var6++] = class205.method1316(var225, 125).method2081(-105);
                                continue;
                            }
                            if (var474 == 5067) {
                                var6 -= 2;
                                int var226 = class151.field2462[var6];
                                int var227 = class151.field2462[var6 + 1];
                                int var228 = class205.method1316(var226, 121).method2089(var227, 3);
                                class151.field2462[var6++] = var228;
                                continue;
                            }
                            if (var474 == 5068) {
                                var6 -= 2;
                                int var229 = class151.field2462[var6];
                                int var230 = class151.field2462[var6 + 1];
                                class275.field4608.field2209[var229] = var230;
                                continue;
                            }
                            if (var474 == 5069) {
                                var6 -= 2;
                                int var231 = class151.field2462[var6];
                                int var232 = class151.field2462[var6 + 1];
                                class275.field4608.field2209[var231] = var232;
                                continue;
                            }
                            if (var474 == 5070) {
                                var6 -= 3;
                                int var233 = class151.field2462[var6];
                                int var234 = class151.field2462[var6 + 2];
                                int var235 = class151.field2462[var6 + 1];
                                class306 var236 = class205.method1316(var233, 114);
                                if (var236.method2089(var235, 3) != 0) {
                                    throw new RuntimeException("bad command");
                                }
                                class151.field2462[var6++] = var236.method2088(var235, var234, 0);
                                continue;
                            }
                        } else if (var474 < 5200) {
                            if (var474 == 5100) {
                                if (class246.field4178[86]) {
                                    class151.field2462[var6++] = 1;
                                } else {
                                    class151.field2462[var6++] = 0;
                                }
                                continue;
                            }
                            if (var474 == 5101) {
                                if (class246.field4178[82]) {
                                    class151.field2462[var6++] = 1;
                                } else {
                                    class151.field2462[var6++] = 0;
                                }
                                continue;
                            }
                            if (var474 == 5102) {
                                if (class246.field4178[81]) {
                                    class151.field2462[var6++] = 1;
                                } else {
                                    class151.field2462[var6++] = 0;
                                }
                                continue;
                            }
                        } else if (var474 < 5300) {
                            if (var474 == 5200) {
                                var6--;
                                class118.method757(75, class151.field2462[var6]);
                                continue;
                            }
                            if (var474 == 5201) {
                                class151.field2462[var6++] = class160.method974(true);
                                continue;
                            }
                            if (var474 == 5202) {
                                var6--;
                                class208.method1382(class151.field2462[var6], (byte) 122);
                                continue;
                            }
                            if (var474 == 5203) {
                                var7--;
                                class135.method837(-1, class57.field790[var7]);
                                continue;
                            }
                            if (var474 == 5204) {
                                class57.field790[var7 - 1] = class269.method1820(class57.field790[var7 - 1], (byte) 30);
                                continue;
                            }
                            if (var474 == 5205) {
                                var7--;
                                class220.method1447(class57.field790[var7], 19661112);
                                continue;
                            }
                            if (var474 == 5206) {
                                var6--;
                                int var301 = class151.field2462[var6];
                                class128 var302 = class10.method58((var301 & 0xFFFE2B4) >> 14, var301 & 0x3FFF, true);
                                if (var302 == null) {
                                    class57.field790[var7++] = class150.field2454;
                                } else {
                                    class57.field790[var7++] = var302.field2124;
                                }
                                continue;
                            }
                            if (var474 == 5207) {
                                var7--;
                                class128 var303 = class57.method370((byte) -22, class57.field790[var7]);
                                if (var303 != null && var303.field2127 != null) {
                                    class57.field790[var7++] = var303.field2127;
                                    continue;
                                }
                                class57.field790[var7++] = class150.field2454;
                                continue;
                            }
                        } else if (var474 < 5400) {
                            if (var474 == 5300) {
                                var6 -= 2;
                                int var237 = class151.field2462[var6];
                                int var238 = class151.field2462[var6 + 1];
                                if (class1.field2 != null) {
                                    class143.method903((byte) -101);
                                }
                                class87.method559(var238, false, var237);
                                class151.field2462[var6++] = class1.field2 == null ? 0 : 1;
                                continue;
                            }
                            if (var474 == 5301) {
                                if (class1.field2 != null) {
                                    class143.method903((byte) -114);
                                }
                                continue;
                            }
                            if (var474 == 5302) {
                                class113[] var239 = class242.method1634((byte) -101);
                                class151.field2462[var6++] = var239.length;
                                continue;
                            }
                            if (var474 == 5303) {
                                var6--;
                                int var240 = class151.field2462[var6];
                                class113[] var241 = class242.method1634((byte) -121);
                                class151.field2462[var6++] = var241[var240].field1906;
                                class151.field2462[var6++] = var241[var240].field1899;
                                continue;
                            }
                            if (var474 == 5305) {
                                int var242 = class104.field1784;
                                int var243 = class297.field5039;
                                int var244 = -1;
                                class113[] var245 = class242.method1634((byte) -24);
                                for (int var246 = 0; var246 < var245.length; var246++) {
                                    class113 var247 = var245[var246];
                                    if (var247.field1906 == var242 && var247.field1899 == var243) {
                                        var244 = var246;
                                        break;
                                    }
                                }
                                class151.field2462[var6++] = var244;
                                continue;
                            }
                            if (var474 == 5306) {
                                class151.field2462[var6++] = class262.method1773((byte) 99);
                                continue;
                            }
                        } else if (var474 < 5500) {
                            if (var474 == 5400) {
                                var7 -= 2;
                                class283 var279 = class57.field790[var7];
                                var6--;
                                int var280 = class151.field2462[var6];
                                class296.field5023++;
                                class283 var281 = class57.field790[var7 + 1];
                                class228.field3831.method621(77, 8);
                                class228.field3831.method1499(true, class65.method415(-5, var279) + class65.method415(-89, var281) + 1);
                                class228.field3831.method1520(var279, 121);
                                class228.field3831.method1520(var281, -46);
                                class228.field3831.method1499(true, var280);
                                continue;
                            }
                            if (var474 == 5401) {
                                var6 -= 2;
                                class92.field1571[class151.field2462[var6]] = (short) class256.method1734(false, class151.field2462[var6 + 1]);
                                class58.method375(-94);
                                class149.method922((byte) -53);
                                class77.method507(81);
                                class142.method893(0);
                                class12.method61((byte) 36);
                                continue;
                            }
                            if (var474 == 5405) {
                                var6 -= 2;
                                int var282 = class151.field2462[var6 + 1];
                                int var283 = class151.field2462[var6];
                                if (var283 >= 0 && var283 < 2) {
                                    class154.field2536[var283] = new int[var282 << 1][4];
                                }
                                continue;
                            }
                            if (var474 == 5406) {
                                var6 -= 7;
                                int var284 = class151.field2462[var6];
                                int var285 = class151.field2462[var6 + 1] << 1;
                                int var286 = class151.field2462[var6 + 2];
                                int var287 = class151.field2462[var6 + 3];
                                int var288 = class151.field2462[var6 + 4];
                                int var289 = class151.field2462[var6 + 5];
                                int var290 = class151.field2462[var6 + 6];
                                if (var284 >= 0 && var284 < 2 && class154.field2536[var284] != null && var285 >= 0 && class154.field2536[var284].length > var285) {
                                    class154.field2536[var284][var285] = new int[] { (class178.method1174(268419329, var286) >> 14) * 128, var287, class178.method1174(16383, var286) * 128, var290 };
                                    class154.field2536[var284][var285 + 1] = new int[] { class178.method1174(16383, var288 >> 14) * 128, var289, class178.method1174(var288, 16383) * 128 };
                                }
                                continue;
                            }
                            if (var474 == 5407) {
                                var6--;
                                int var291 = class154.field2536[class151.field2462[var6]].length >> 1;
                                class151.field2462[var6++] = var291;
                                continue;
                            }
                            if (var474 == 5408) {
                                class151.field2462[var6++] = 1;
                                continue;
                            }
                            if (var474 == 5409) {
                                class241.method1625((byte) 124);
                                continue;
                            }
                            if (var474 == 5411) {
                                if (class1.field2 != null) {
                                    class143.method903((byte) -99);
                                }
                                if (class164.field2711 == null) {
                                    class226.method1482(class86.method556(-104), false, -17397);
                                } else {
                                    System.exit(0);
                                }
                                continue;
                            }
                            if (var474 == 5419) {
                                class283 var292 = class150.field2454;
                                if (class270.field4561 != null) {
                                    var292 = class58.method377(class270.field4561.field5292, 8);
                                    try {
                                        if (class270.field4561.field5296 != null) {
                                            byte[] var293 = ((String) class270.field4561.field5296).getBytes("ISO-8859-1");
                                            var292 = class219.method1440(159, var293.length, var293, 0);
                                        }
                                    } catch (UnsupportedEncodingException var471) {
                                    }
                                }
                                class57.field790[var7++] = var292;
                                continue;
                            }
                            if (var474 == 5420) {
                                class151.field2462[var6++] = class19.field230 == 2 ? 1 : 0;
                                continue;
                            }
                            if (var474 == 5421) {
                                if (class1.field2 != null) {
                                    class143.method903((byte) -102);
                                }
                                var7--;
                                class283 var295 = class57.field790[var7];
                                var6--;
                                boolean var296 = class151.field2462[var6] == 1;
                                class283 var297 = class299.method2022(new class283[] { class86.method556(-95), var295 }, (byte) 116);
                                if (class164.field2711 == null && (!var296 || class19.field230 == 2 || !class251.field4263.startsWith("win") || class97.field1626)) {
                                    class226.method1482(var297, var296, -17397);
                                    continue;
                                }
                                class38.field550 = var296;
                                class278.field4651 = var297;
                                class92.field1548 = class150.field2460.method1709(105, new String(var297.method1933((byte) 113), "ISO-8859-1"));
                                continue;
                            }
                            if (var474 == 5422) {
                                var7 -= 2;
                                class283 var298 = class57.field790[var7];
                                var6--;
                                int var299 = class151.field2462[var6];
                                class283 var300 = class57.field790[var7 + 1];
                                if (var298.method1925((byte) -44) > 0) {
                                    if (class50.field685 == null) {
                                        class50.field685 = new class283[class177.field3049[class280.field4678]];
                                    }
                                    class50.field685[var299] = var298;
                                }
                                if (var300.method1925((byte) -44) > 0) {
                                    if (class76.field1327 == null) {
                                        class76.field1327 = new class283[class177.field3049[class280.field4678]];
                                    }
                                    class76.field1327[var299] = var300;
                                }
                                continue;
                            }
                        } else if (var474 < 5600) {
                            if (var474 == 5500) {
                                var6 -= 4;
                                int var267 = class151.field2462[var6];
                                int var268 = class151.field2462[var6 + 2];
                                int var269 = class151.field2462[var6 + 1];
                                int var270 = class151.field2462[var6 + 3];
                                class31.method213(128, (var267 & 0x3FFF) - class107.field1833, var270, var269, false, ((var267 & 0xFFFC7DD) >> 14) - class214.field3637, var268);
                                continue;
                            }
                            if (var474 == 5501) {
                                var6 -= 4;
                                int var271 = class151.field2462[var6];
                                int var272 = class151.field2462[var6 + 1];
                                int var273 = class151.field2462[var6 + 3];
                                int var274 = class151.field2462[var6 + 2];
                                class280.method1871((var271 >> 14 & 0x3FFF) - class214.field3637, (var271 & 0x3FFF) + -class107.field1833, var274, -377, var272, var273);
                                continue;
                            }
                            if (var474 == 5502) {
                                var6 -= 6;
                                int var275 = class151.field2462[var6];
                                if (var275 >= 2) {
                                    throw new RuntimeException();
                                }
                                class150.field2455 = var275;
                                int var276 = class151.field2462[var6 + 1];
                                if (class154.field2536[class150.field2455].length >> 1 <= var276 + 1) {
                                    throw new RuntimeException();
                                }
                                class97.field1656 = 0;
                                class151.field2463 = var276;
                                class99.field1673 = class151.field2462[var6 + 2];
                                class200.field3421 = class151.field2462[var6 + 3];
                                int var277 = class151.field2462[var6 + 4];
                                if (var277 >= 2) {
                                    throw new RuntimeException();
                                }
                                class30.field454 = var277;
                                int var278 = class151.field2462[var6 + 5];
                                if (class154.field2536[class30.field454].length >> 1 <= var278 + 1) {
                                    throw new RuntimeException();
                                }
                                class26.field377 = 3;
                                class115.field1927 = var278;
                                continue;
                            }
                            if (var474 == 5503) {
                                class40.method250(true);
                                continue;
                            }
                            if (var474 == 5504) {
                                var6 -= 2;
                                class172.field2908 = class151.field2462[var6];
                                class203.field3477 = class151.field2462[var6 + 1];
                                class261.method1762(25063);
                                continue;
                            }
                            if (var474 == 5505) {
                                class151.field2462[var6++] = class172.field2908;
                                continue;
                            }
                            if (var474 == 5506) {
                                class151.field2462[var6++] = class203.field3477;
                                continue;
                            }
                        } else if (var474 < 5700) {
                            if (var474 == 5600) {
                                var7 -= 2;
                                class283 var248 = class57.field790[var7];
                                class283 var249 = class57.field790[var7 + 1];
                                var6--;
                                int var250 = class151.field2462[var6];
                                if (class175.field3019 == 10 && class299.field5056 == 0 && class194.field3316 == 0) {
                                    class6.method37(var248, 25670, var249, var250);
                                }
                                continue;
                            }
                            if (var474 == 5601) {
                                class281.method1882(18026);
                                continue;
                            }
                            if (var474 == 5602) {
                                if (class299.field5056 == 0) {
                                    class255.field4302 = -2;
                                }
                                continue;
                            }
                            if (var474 == 5603) {
                                var6 -= 4;
                                if (class175.field3019 == 10 && class299.field5056 == 0 && class194.field3316 == 0) {
                                    class187.method1225(class151.field2462[var6], class151.field2462[var6 + 3], class151.field2462[var6 + 2], 0, class151.field2462[var6 + 1]);
                                }
                                continue;
                            }
                            if (var474 == 5604) {
                                var7--;
                                if (class175.field3019 == 10 && class299.field5056 == 0 && class194.field3316 == 0) {
                                    class63.method405(class57.field790[var7].method1929((byte) -24), 2042819304);
                                }
                                continue;
                            }
                            if (var474 == 5605) {
                                var7 -= 2;
                                var6 -= 4;
                                if (class175.field3019 == 10 && class299.field5056 == 0 && class194.field3316 == 0) {
                                    class284.method1958(class57.field790[var7].method1929((byte) -24), class151.field2462[var6], class151.field2462[var6 + 1], class151.field2462[var6 + 3], class151.field2462[var6 + 2], class57.field790[var7 + 1], (byte) -109);
                                }
                                continue;
                            }
                            if (var474 == 5606) {
                                if (class194.field3316 == 0) {
                                    class2.field20 = -2;
                                }
                                continue;
                            }
                            if (var474 == 5607) {
                                class151.field2462[var6++] = class255.field4302;
                                continue;
                            }
                            if (var474 == 5608) {
                                class151.field2462[var6++] = class290.field4911;
                                continue;
                            }
                            if (var474 == 5609) {
                                class151.field2462[var6++] = class2.field20;
                                continue;
                            }
                            if (var474 == 5610) {
                                for (int var251 = 0; var251 < 5; var251++) {
                                    class57.field790[var7++] = var251 < class67.field936.length ? class67.field936[var251].method1901(4095) : class150.field2454;
                                }
                                class67.field936 = null;
                                continue;
                            }
                            if (var474 == 5611) {
                                class151.field2462[var6++] = class72.field1260;
                                continue;
                            }
                        } else if (var474 < 6100) {
                            if (var474 == 6001) {
                                var6--;
                                int var261 = class151.field2462[var6];
                                if (var261 < 1) {
                                    var261 = 1;
                                }
                                if (var261 > 4) {
                                    var261 = 4;
                                }
                                class155.field2552 = var261;
                                if (!class44.field601) {
                                    if (class155.field2552 == 1) {
                                        class139.method870(0.9F);
                                    }
                                    if (class155.field2552 == 2) {
                                        class139.method870(0.8F);
                                    }
                                    if (class155.field2552 == 3) {
                                        class139.method870(0.7F);
                                    }
                                    if (class155.field2552 == 4) {
                                        class139.method870(0.6F);
                                    }
                                }
                                class277.method1856(true);
                                if (!class44.field601) {
                                    class170.method1078(103);
                                }
                                class149.method922((byte) -73);
                                class202.method1293(class150.field2460, -88);
                                class202.field3450 = false;
                                continue;
                            }
                            if (var474 == 6002) {
                                var6--;
                                class61.method402(false, class151.field2462[var6] == 1);
                                class154.method949(7456);
                                class170.method1078(103);
                                class304.method2055((byte) 76);
                                class202.method1293(class150.field2460, -72);
                                class202.field3450 = false;
                                continue;
                            }
                            if (var474 == 6003) {
                                var6--;
                                class228.field3839 = class151.field2462[var6] == 1;
                                class304.method2055((byte) 53);
                                class202.method1293(class150.field2460, -114);
                                class202.field3450 = false;
                                continue;
                            }
                            if (var474 == 6005) {
                                var6--;
                                class55.field769 = class151.field2462[var6] == 1;
                                class170.method1078(103);
                                class202.method1293(class150.field2460, -116);
                                class202.field3450 = false;
                                continue;
                            }
                            if (var474 == 6006) {
                                var6--;
                                class149.field2432 = class151.field2462[var6] == 1;
                                ((class97) class139.field2315).method630(!class149.field2432, -2);
                                class202.method1293(class150.field2460, -114);
                                class202.field3450 = false;
                                continue;
                            }
                            if (var474 == 6007) {
                                var6--;
                                class178.field3068 = class151.field2462[var6] == 1;
                                class202.method1293(class150.field2460, 55);
                                class202.field3450 = false;
                                continue;
                            }
                            if (var474 == 6008) {
                                var6--;
                                class96.field1612 = class151.field2462[var6] == 1;
                                class202.method1293(class150.field2460, -94);
                                class202.field3450 = false;
                                continue;
                            }
                            if (var474 == 6009) {
                                var6--;
                                class83.field1408 = class151.field2462[var6] == 1;
                                class202.method1293(class150.field2460, 40);
                                class202.field3450 = false;
                                continue;
                            }
                            if (var474 == 6010) {
                                var6--;
                                class91.field1541 = class151.field2462[var6] == 1;
                                class202.method1293(class150.field2460, -71);
                                class202.field3450 = false;
                                continue;
                            }
                            if (var474 == 6011) {
                                var6--;
                                int var262 = class151.field2462[var6];
                                if (var262 < 0 || var262 > 2) {
                                    var262 = 0;
                                }
                                class23.field345 = var262;
                                class202.method1293(class150.field2460, 92);
                                class202.field3450 = false;
                                continue;
                            }
                            if (var474 == 6012) {
                                class284.method1954(0, (byte) -70, 0);
                                var6--;
                                class44.field601 = class151.field2462[var6] == 1;
                                if (class44.field601) {
                                    class139.method870(0.7F);
                                } else {
                                    if (class155.field2552 == 1) {
                                        class139.method870(0.9F);
                                    }
                                    if (class155.field2552 == 2) {
                                        class139.method870(0.8F);
                                    }
                                    if (class155.field2552 == 3) {
                                        class139.method870(0.7F);
                                    }
                                    if (class155.field2552 == 4) {
                                        class139.method870(0.6F);
                                    }
                                }
                                class170.method1078(103);
                                class202.method1293(class150.field2460, 68);
                                class202.field3450 = false;
                                continue;
                            }
                            if (var474 == 6014) {
                                var6--;
                                class2.field26 = class151.field2462[var6] == 1;
                                class170.method1078(103);
                                class202.method1293(class150.field2460, 51);
                                class202.field3450 = false;
                                continue;
                            }
                            if (var474 == 6015) {
                                var6--;
                                class47.field650 = class151.field2462[var6] == 1;
                                class277.method1856(true);
                                class202.method1293(class150.field2460, 94);
                                class202.field3450 = false;
                                continue;
                            }
                            if (var474 == 6016) {
                                var6--;
                                int var263 = class151.field2462[var6];
                                if (var263 < 0 || var263 > 2) {
                                    var263 = 0;
                                }
                                class67.field941 = true;
                                class119.field2007 = var263;
                                class202.method1293(class150.field2460, -91);
                                class202.field3450 = false;
                                continue;
                            }
                            if (var474 == 6017) {
                                var6--;
                                class33.field501 = class151.field2462[var6] == 1;
                                class246.method1672((byte) 63);
                                class202.method1293(class150.field2460, -111);
                                class202.field3450 = false;
                                continue;
                            }
                            if (var474 == 6018) {
                                var6--;
                                int var264 = class151.field2462[var6];
                                if (var264 < 0) {
                                    var264 = 0;
                                }
                                if (var264 > 127) {
                                    var264 = 127;
                                }
                                class255.field4301 = var264;
                                class202.method1293(class150.field2460, 102);
                                class202.field3450 = false;
                                continue;
                            }
                            if (var474 == 6019) {
                                var6--;
                                int var265 = class151.field2462[var6];
                                if (var265 < 0) {
                                    var265 = 0;
                                }
                                if (var265 > 255) {
                                    var265 = 255;
                                }
                                if (class118.field1990 != var265) {
                                    if (class118.field1990 == 0 && class232.field3936 != -1) {
                                        class228.method1492(class232.field3936, false, var265, class109.field1843, (byte) 113, 0);
                                        class306.field5263 = false;
                                    } else if (var265 == 0) {
                                        class170.method1083(238);
                                        class306.field5263 = false;
                                    } else {
                                        class67.method427((byte) -85, var265);
                                    }
                                    class118.field1990 = var265;
                                }
                                class202.method1293(class150.field2460, 48);
                                class202.field3450 = false;
                                continue;
                            }
                            if (var474 == 6020) {
                                var6--;
                                int var266 = class151.field2462[var6];
                                if (var266 < 0) {
                                    var266 = 0;
                                }
                                if (var266 > 127) {
                                    var266 = 127;
                                }
                                class33.field500 = var266;
                                class202.method1293(class150.field2460, -105);
                                class202.field3450 = false;
                                continue;
                            }
                            if (var474 == 6021) {
                                var6--;
                                class269.field4541 = class151.field2462[var6] == 1;
                                class304.method2055((byte) 77);
                                continue;
                            }
                            if (var474 == 6022) {
                                var6--;
                                class71.field1230 = class151.field2462[var6] == 1;
                                class202.method1293(class150.field2460, -77);
                                class202.method1291(0, (byte) 109);
                                continue;
                            }
                        } else if (var474 < 6200) {
                            if (var474 == 6101) {
                                class151.field2462[var6++] = class155.field2552;
                                continue;
                            }
                            if (var474 == 6102) {
                                class151.field2462[var6++] = class96.method622((byte) 0) ? 1 : 0;
                                continue;
                            }
                            if (var474 == 6103) {
                                class151.field2462[var6++] = class228.field3839 ? 1 : 0;
                                continue;
                            }
                            if (var474 == 6105) {
                                class151.field2462[var6++] = class55.field769 ? 1 : 0;
                                continue;
                            }
                            if (var474 == 6106) {
                                class151.field2462[var6++] = class149.field2432 ? 1 : 0;
                                continue;
                            }
                            if (var474 == 6107) {
                                class151.field2462[var6++] = class178.field3068 ? 1 : 0;
                                continue;
                            }
                            if (var474 == 6108) {
                                class151.field2462[var6++] = class96.field1612 ? 1 : 0;
                                continue;
                            }
                            if (var474 == 6109) {
                                class151.field2462[var6++] = class83.field1408 ? 1 : 0;
                                continue;
                            }
                            if (var474 == 6110) {
                                class151.field2462[var6++] = class91.field1541 ? 1 : 0;
                                continue;
                            }
                            if (var474 == 6111) {
                                class151.field2462[var6++] = class23.field345;
                                continue;
                            }
                            if (var474 == 6112) {
                                class151.field2462[var6++] = class44.field601 ? 1 : 0;
                                continue;
                            }
                            if (var474 == 6114) {
                                class151.field2462[var6++] = class2.field26 ? 1 : 0;
                                continue;
                            }
                            if (var474 == 6115) {
                                class151.field2462[var6++] = class47.field650 ? 1 : 0;
                                continue;
                            }
                            if (var474 == 6116) {
                                class151.field2462[var6++] = class119.field2007;
                                continue;
                            }
                            if (var474 == 6117) {
                                class151.field2462[var6++] = class33.field501 ? 1 : 0;
                                continue;
                            }
                            if (var474 == 6118) {
                                class151.field2462[var6++] = class255.field4301;
                                continue;
                            }
                            if (var474 == 6119) {
                                class151.field2462[var6++] = class118.field1990;
                                continue;
                            }
                            if (var474 == 6120) {
                                class151.field2462[var6++] = class33.field500;
                                continue;
                            }
                            if (var474 == 6121) {
                                class151.field2462[var6++] = class167.field2791 ? 1 : 0;
                                continue;
                            }
                            if (var474 == 6122) {
                                class151.field2462[var6++] = class71.field1230 ? 1 : 0;
                                continue;
                            }
                        } else if (var474 < 6300) {
                            if (var474 == 6200) {
                                var6 -= 2;
                                class249.field4247 = (short) class151.field2462[var6];
                                if (class249.field4247 <= 0) {
                                    class249.field4247 = 256;
                                }
                                class210.field3582 = (short) class151.field2462[var6 + 1];
                                if (class210.field3582 <= 0) {
                                    class210.field3582 = 205;
                                }
                                continue;
                            }
                            if (var474 == 6201) {
                                var6 -= 2;
                                class207.field3558 = (short) class151.field2462[var6];
                                if (class207.field3558 <= 0) {
                                    class207.field3558 = 256;
                                }
                                class94.field1580 = (short) class151.field2462[var6 + 1];
                                if (class94.field1580 <= 0) {
                                    class94.field1580 = 320;
                                }
                                continue;
                            }
                            if (var474 == 6202) {
                                var6 -= 4;
                                class74.field1298 = (short) class151.field2462[var6];
                                if (class74.field1298 <= 0) {
                                    class74.field1298 = 1;
                                }
                                class255.field4300 = (short) class151.field2462[var6 + 1];
                                if (class255.field4300 <= 0) {
                                    class255.field4300 = 32767;
                                } else if (class255.field4300 < class74.field1298) {
                                    class255.field4300 = class74.field1298;
                                }
                                class33.field488 = (short) class151.field2462[var6 + 2];
                                if (class33.field488 <= 0) {
                                    class33.field488 = 1;
                                }
                                class94.field1588 = (short) class151.field2462[var6 + 3];
                                if (class94.field1588 <= 0) {
                                    class94.field1588 = 32767;
                                } else if (class94.field1588 < class33.field488) {
                                    class94.field1588 = class33.field488;
                                }
                                continue;
                            }
                            if (var474 == 6203) {
                                class31.method215(false, class282.field4777.field1069, 0, class282.field4777.field1085, -86, 0);
                                class151.field2462[var6++] = class76.field1322;
                                class151.field2462[var6++] = class177.field3055;
                                continue;
                            }
                            if (var474 == 6204) {
                                class151.field2462[var6++] = class207.field3558;
                                class151.field2462[var6++] = class94.field1580;
                                continue;
                            }
                            if (var474 == 6205) {
                                class151.field2462[var6++] = class249.field4247;
                                class151.field2462[var6++] = class210.field3582;
                                continue;
                            }
                        } else if (var474 < 6400) {
                            if (var474 == 6300) {
                                class151.field2462[var6++] = (int) (class216.method1426(255) / 60000L);
                                continue;
                            }
                            if (var474 == 6301) {
                                class151.field2462[var6++] = (int) (class216.method1426(255) / 86400000L) - 11745;
                                continue;
                            }
                            if (var474 == 6302) {
                                var6 -= 3;
                                int var256 = class151.field2462[var6];
                                int var257 = class151.field2462[var6 + 2];
                                int var258 = class151.field2462[var6 + 1];
                                class119.field2003.clear();
                                class119.field2003.set(11, 12);
                                class119.field2003.set(var257, var258, var256);
                                class151.field2462[var6++] = (int) (class119.field2003.getTime().getTime() / 86400000L) - 11745;
                                continue;
                            }
                            if (var474 == 6303) {
                                class119.field2003.clear();
                                class119.field2003.setTime(new Date(class216.method1426(255)));
                                class151.field2462[var6++] = class119.field2003.get(1);
                                continue;
                            }
                            if (var474 == 6304) {
                                var6--;
                                int var259 = class151.field2462[var6];
                                boolean var260 = true;
                                if (var259 < 0) {
                                    var260 = (var259 + 1) % 4 == 0;
                                } else if (var259 < 1582) {
                                    var260 = var259 % 4 == 0;
                                } else if (var259 % 4 != 0) {
                                    var260 = false;
                                } else if (var259 % 100 != 0) {
                                    var260 = true;
                                } else if (var259 % 400 != 0) {
                                    var260 = false;
                                }
                                class151.field2462[var6++] = var260 ? 1 : 0;
                                continue;
                            }
                        } else if (var474 < 6500) {
                            if (var474 == 6400) {
                                class151.field2462[var6++] = class42.field587 ? 1 : 0;
                                continue;
                            }
                            if (var474 == 6401) {
                                var7--;
                                class283 var252 = class57.field790[var7];
                                var6--;
                                int var253 = class151.field2462[var6];
                                String var254;
                                try {
                                    var254 = new String(var252.method1933((byte) -44), "ISO-8859-1");
                                } catch (UnsupportedEncodingException var472) {
                                    var254 = new String(var252.method1933((byte) -76));
                                }
                                if (class42.field587) {
                                    if (!browsercontrol.iscreated()) {
                                        browsercontrol.create("about:blank");
                                    }
                                    if (browsercontrol.iscreated()) {
                                        browsercontrol.navigate(var254);
                                        class46.field634 = var253;
                                        class202.method1291(0, (byte) 109);
                                    }
                                }
                                continue;
                            }
                            if (var474 == 6402) {
                                if (browsercontrol.iscreated()) {
                                    browsercontrol.navigate("about:blank");
                                    browsercontrol.hide();
                                    class46.field634 = 0;
                                    class202.method1291(0, (byte) 109);
                                }
                                continue;
                            }
                            if (var474 == 6403) {
                                class57.field790[var7++] = class290.field4923;
                                continue;
                            }
                            if (var474 == 6404) {
                                class57.field790[var7++] = class92.field1565;
                                continue;
                            }
                            if (var474 == 6405) {
                                class151.field2462[var6++] = class3.method18((byte) -125) ? 1 : 0;
                                continue;
                            }
                            if (var474 == 6406) {
                                class151.field2462[var6++] = class283.method1918(true) ? 1 : 0;
                                continue;
                            }
                        }
                    } else if (var474 == 4500) {
                        var6 -= 2;
                        int var304 = class151.field2462[var6 + 1];
                        int var305 = class151.field2462[var6];
                        class118 var306 = class92.method592((byte) -112, var304);
                        if (var306.method758(-5)) {
                            class57.field790[var7++] = class49.method281(var305, 105).method1411(var304, (byte) -104, var306.field1991);
                        } else {
                            class151.field2462[var6++] = class49.method281(var305, 100).method1410(false, var306.field1983, var304);
                        }
                        continue;
                    }
                }
                throw new IllegalStateException();
            }
        } catch (Exception var473) {
            if (var5.field1836 == null) {
                if (class256.field4325 != 0) {
                    class60.method394(0, class7.field76, class150.field2454, (byte) 118);
                }
                class296.method2011(true, "CS2 - scr:" + var5.field1445 + " op:" + var9, var473);
            } else {
                class283 var468 = class260.method1756((byte) -126, 30);
                var468.method1907(0, class278.field4653).method1907(0, var5.field1836);
                for (int var469 = class297.field5026 - 1; var469 >= 0; var469--) {
                    var468.method1907(0, class65.field908).method1907(0, class236.field3954[var469].field3161.field1836);
                }
                if (var9 == 40) {
                    int var470 = var10[var8];
                    var468.method1907(0, class79.field1371).method1907(0, class296.method2012(var470, (byte) -58));
                }
                if (class256.field4325 != 0) {
                    class60.method394(0, class299.method2022(new class283[] { class240.field4058, var5.field1836 }, (byte) 20), class150.field2454, (byte) 120);
                }
                class296.method2011(true, "CS2 - scr:" + var5.field1445 + " op:" + var9 + new String(var468.method1933((byte) -58)), var473);
            }
        }
    }

    @OriginalMember(owner = "client!le", name = "c", descriptor = "(B)V", line = 5798)
    public static void method1562(byte arg0) {
        field3928 = null;
        field3922 = null;
        if (arg0 < 17) {
            method1560(64, (byte) -16, -18);
        }
        field3916 = null;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(II)I", line = 5813)
    public static final int method1563(int arg0, int arg1) {
        int var2 = arg1 & 0x3F;
        field3924++;
        int var3 = (arg1 & 0xCB) >> 6;
        int var4 = -38 / ((arg0 + 9) / 38);
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
}
