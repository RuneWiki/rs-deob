import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public class class62 implements class116 {

    @OriginalMember(owner = "client!pa", name = "A", descriptor = "I")
    private int field1066 = 50;

    @OriginalMember(owner = "client!pa", name = "t", descriptor = "Z")
    private boolean field1059 = false;

    @OriginalMember(owner = "client!pa", name = "m", descriptor = "Lcj;")
    private class28 field1052;

    @OriginalMember(owner = "client!pa", name = "h", descriptor = "Lcj;")
    private class28 field1047;

    @OriginalMember(owner = "client!pa", name = "n", descriptor = "Lnj;")
    private class230 field1053;

    @OriginalMember(owner = "client!pa", name = "H", descriptor = "[Z")
    private boolean[] field1073;

    @OriginalMember(owner = "client!pa", name = "v", descriptor = "[Z")
    private boolean[] field1061;

    @OriginalMember(owner = "client!pa", name = "K", descriptor = "[Z")
    private boolean[] field1076;

    @OriginalMember(owner = "client!pa", name = "M", descriptor = "[B")
    private byte[] field1078;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "[Z")
    private boolean[] field1040;

    @OriginalMember(owner = "client!pa", name = "p", descriptor = "[B")
    private byte[] field1055;

    @OriginalMember(owner = "client!pa", name = "F", descriptor = "[S")
    private short[] field1071;

    @OriginalMember(owner = "client!pa", name = "E", descriptor = "[Z")
    private boolean[] field1070;

    @OriginalMember(owner = "client!pa", name = "w", descriptor = "[B")
    private byte[] field1062;

    @OriginalMember(owner = "client!pa", name = "I", descriptor = "[B")
    private byte[] field1074;

    @OriginalMember(owner = "client!pa", name = "o", descriptor = "Lr;")
    public static class66 field1054 = class93.method641(43, "headicons_pk");

    @OriginalMember(owner = "client!pa", name = "i", descriptor = "[I")
    public static int[] field1048 = new int[128];

    @OriginalMember(owner = "client!pa", name = "B", descriptor = "Lr;")
    public static class66 field1067 = class93.method641(43, "Lade Benutzeroberfl-=che )2 ");

    @OriginalMember(owner = "client!pa", name = "y", descriptor = "Lr;")
    public static class66 field1064 = null;

    @OriginalMember(owner = "client!pa", name = "C", descriptor = "Lr;")
    public static class66 field1068 = class93.method641(43, "p11_full");

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "I")
    public static int field1041;

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "I")
    public static int field1042;

    @OriginalMember(owner = "client!pa", name = "d", descriptor = "I")
    public static int field1043;

    @OriginalMember(owner = "client!pa", name = "e", descriptor = "I")
    public static int field1044;

    @OriginalMember(owner = "client!pa", name = "f", descriptor = "I")
    public static int field1045;

    @OriginalMember(owner = "client!pa", name = "g", descriptor = "I")
    public static int field1046;

    @OriginalMember(owner = "client!pa", name = "j", descriptor = "I")
    public static int field1049;

    @OriginalMember(owner = "client!pa", name = "k", descriptor = "I")
    public static int field1050;

    @OriginalMember(owner = "client!pa", name = "l", descriptor = "I")
    public static int field1051;

    @OriginalMember(owner = "client!pa", name = "q", descriptor = "I")
    public static int field1056;

    @OriginalMember(owner = "client!pa", name = "r", descriptor = "I")
    public static int field1057;

    @OriginalMember(owner = "client!pa", name = "u", descriptor = "I")
    public static int field1060;

    @OriginalMember(owner = "client!pa", name = "x", descriptor = "I")
    public static int field1063;

    @OriginalMember(owner = "client!pa", name = "z", descriptor = "I")
    public static int field1065;

    @OriginalMember(owner = "client!pa", name = "D", descriptor = "I")
    public static int field1069;

    @OriginalMember(owner = "client!pa", name = "G", descriptor = "I")
    public static int field1072;

    @OriginalMember(owner = "client!pa", name = "J", descriptor = "I")
    public static int field1075;

    @OriginalMember(owner = "client!pa", name = "L", descriptor = "I")
    public static int field1077;

    @OriginalMember(owner = "client!pa", name = "s", descriptor = "[I")
    public static int[] field1058;

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "(BI)Z")
    public final boolean method399(byte arg0, int arg1) {
        field1056++;
        if (this.field1059 || this.field1040[arg1]) {
            return true;
        } else {
            if (arg0 >= -110) {
                this.method406((byte) -57);
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "(II)[I")
    public final int[] method400(int arg0, int arg1) {
        class77 var3 = this.method409((byte) 84, arg1);
        field1044++;
        if (arg0 <= 70) {
            return null;
        } else if (var3 == null) {
            return null;
        } else {
            return var3.method545(this, -109, this.field1047, this.field1059 || this.field1040[arg1]);
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(II)Z")
    public final boolean method401(int arg0, int arg1) {
        if (arg1 == 2) {
            field1069++;
            return this.field1076[arg0];
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(Lcj;IBLcj;I)Laf;")
    public static final class39 method402(class28 arg0, int arg1, byte arg2, class28 arg3, int arg4) {
        field1050++;
        if (class31.method174(-29381, arg4, arg0, arg1)) {
            if (arg2 < 52) {
                method415(45);
            }
            return class192.method1260(arg3.method135(arg1, 0, arg4), false);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(Lr;ILcj;)Lpb;")
    public static final class114 method403(class66 arg0, int arg1, class28 arg2) {
        field1041++;
        int var3 = arg2.method132(arg0, (byte) -94);
        if (arg1 != 12666) {
            field1067 = null;
        }
        if (var3 == -1) {
            return new class114(0);
        }
        int[] var4 = arg2.method142(false, var3);
        class114 var5 = new class114(var4.length);
        for (int var6 = 0; var6 < var5.field2163; var6++) {
            class249 var7 = new class249(arg2.method135(var4[var6], 0, var3));
            var5.field2161[var6] = var7.method1637(arg1 - 12539);
            var5.field2164[var6] = var7.method1682(3390);
            var5.field2157[var6] = (short) var7.method1674(1355769544);
            var5.field2160[var6] = (short) var7.method1674(arg1 + 1355756878);
            var5.field2166[var6] = var7.method1652(-5528);
        }
        return var5;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(Z)V")
    public static final void method404(boolean arg0) {
        if (class125.field2365 > 0) {
            class125.field2365--;
        }
        field1075++;
        if (class263.field4618 > 1) {
            class26.field326 = class15.field199;
            class263.field4618--;
        }
        if (class4.field47) {
            class4.field47 = false;
            class27.method119((byte) -21);
            return;
        }
        for (int var1 = 0; var1 < 100 && class133.method920(-110); var1++) {
        }
        if (class244.field4258 != 30) {
            return;
        }
        class91.method638(false, 141, class28.field412);
        Object var2 = class133.field2488.field4143;
        synchronized (class133.field2488.field4143) {
            if (!class120.field2279) {
                class133.field2488.field4145 = 0;
            } else if (class264.field4627 != 0 || class133.field2488.field4145 >= 40) {
                class79.field1556++;
                class28.field412.method578(-79, 117);
                class28.field412.method1638(32, 0);
                int var3 = class28.field412.field4335;
                int var4 = 0;
                for (int var5 = 0; var5 < class133.field2488.field4145 && (class28.field412.field4335 - var3) < 240; var5++) {
                    int var6 = class133.field2488.field4146[var5];
                    int var7 = class133.field2488.field4144[var5];
                    if (var6 < 0) {
                        var6 = 0;
                    } else if (var6 > 65534) {
                        var6 = 65534;
                    }
                    var4++;
                    if (var7 < 0) {
                        var7 = 0;
                    } else if (var7 > 65534) {
                        var7 = 65534;
                    }
                    boolean var8 = false;
                    if (class133.field2488.field4146[var5] == -1 && class133.field2488.field4144[var5] == -1) {
                        var8 = true;
                        var6 = -1;
                        var7 = -1;
                    }
                    if (class59.field993 != var7 || class154.field2749 != var6) {
                        int var9 = var6 - class154.field2749;
                        class154.field2749 = var6;
                        int var10 = var7 - class59.field993;
                        class59.field993 = var7;
                        if (class162.field2899 < 8 && var10 >= -32 && var10 <= 31 && var9 >= -32 && var9 <= 31) {
                            var10 += 32;
                            var9 += 32;
                            class28.field412.method1650(false, (class162.field2899 << 12) + (var10 << 6) + var9);
                            class162.field2899 = 0;
                        } else if (class162.field2899 < 32 && var10 >= -128 && var10 <= 127 && var9 >= -128 && var9 <= 127) {
                            var9 += 128;
                            class28.field412.method1638(32, class162.field2899 + 128);
                            var10 += 128;
                            class28.field412.method1650(false, (var10 << 8) + var9);
                            class162.field2899 = 0;
                        } else if (class162.field2899 < 32) {
                            class28.field412.method1638(32, class162.field2899 + 192);
                            if (var8) {
                                class28.field412.method1666(544537784, Integer.MIN_VALUE);
                            } else {
                                class28.field412.method1666(544537784, var6 << 16 | var7);
                            }
                            class162.field2899 = 0;
                        } else {
                            class28.field412.method1650(false, class162.field2899 + 57344);
                            if (var8) {
                                class28.field412.method1666(544537784, Integer.MIN_VALUE);
                            } else {
                                class28.field412.method1666(544537784, var6 << 16 | var7);
                            }
                            class162.field2899 = 0;
                        }
                    } else if (class162.field2899 < 2047) {
                        class162.field2899++;
                    }
                }
                class28.field412.method1662(class28.field412.field4335 - var3, 119);
                if (class133.field2488.field4145 <= var4) {
                    class133.field2488.field4145 = 0;
                } else {
                    class133.field2488.field4145 -= var4;
                    for (int var11 = 0; var11 < class133.field2488.field4145; var11++) {
                        class133.field2488.field4144[var11] = class133.field2488.field4144[var11 + var4];
                        class133.field2488.field4146[var11] = class133.field2488.field4146[var4 + var11];
                    }
                }
            }
        }
        if (class264.field4627 != 0) {
            long var12 = (class184.field3222 - class256.field4491) / 50L;
            class38.field555++;
            class256.field4491 = class184.field3222;
            if (var12 > 32767L) {
                var12 = 32767L;
            }
            int var14 = class174.field3068;
            int var15 = class188.field3274;
            int var16 = (int) var12;
            if (var14 < 0) {
                var14 = 0;
            } else if (var14 > 65535) {
                var14 = 65535;
            }
            byte var17 = 0;
            if (var15 < 0) {
                var15 = 0;
            } else if (var15 > 65535) {
                var15 = 65535;
            }
            if (class264.field4627 == 2) {
                var17 = 1;
            }
            class28.field412.method578(-53, 59);
            class28.field412.method1650(false, var16 | var17 << 15);
            class28.field412.method1640((byte) -116, var15 | var14 << 16);
        }
        if (class158.field2851 > 0) {
            class158.field2851--;
        }
        if (class167.field3009[96] || class167.field3009[97] || class167.field3009[98] || class167.field3009[99]) {
            class178.field3114 = true;
        }
        if (class178.field3114 && class158.field2851 <= 0) {
            class84.field1624++;
            class158.field2851 = 20;
            class178.field3114 = false;
            class28.field412.method578(75, 99);
            class28.field412.method1685((byte) 19, class125.field2367);
            class28.field412.method1671(class259.field4562, -22);
        }
        if (class109.field2118 && !class112.field2154) {
            class40.field644++;
            class112.field2154 = true;
            class28.field412.method578(120, 248);
            class28.field412.method1638(32, 1);
        }
        if (!class109.field2118 && class112.field2154) {
            class40.field644++;
            class112.field2154 = false;
            class28.field412.method578(110, 248);
            class28.field412.method1638(32, 0);
        }
        if (!class158.field2855) {
            class15.field194++;
            class28.field412.method578(114, 165);
            class28.field412.method1681(-19237, class194.method1265((byte) 112));
            class158.field2855 = true;
        }
        class243.method1602(0);
        if (class244.field4258 != 30) {
            return;
        }
        class220.method1410(0);
        class237.method1564((byte) -110);
        class156.field2777++;
        if (class156.field2777 > 750) {
            class27.method119((byte) -21);
            return;
        }
        class207.method1349(51);
        class217.method1399(16986);
        class181.method1207((byte) 122);
        if (class80.field1573 != null) {
            class187.method1237((byte) -84);
        }
        for (int var18 = class205.method1331(arg0, -115); var18 != -1; var18 = class205.method1331(false, -122)) {
            class34.method193((byte) 67, var18);
            class163.field2925[class115.method767(class17.field233++, 31)] = var18;
        }
        for (class197 var19 = class25.method111((byte) 37); var19 != null; var19 = class25.method111((byte) 37)) {
            int var20 = var19.method1289(!arg0);
            int var21 = var19.method1283(-1597153401);
            if (var20 == 1) {
                class61.field1038[var21] = var19.field3405;
                class174.field3064[class115.method767(31, class138.field2547++)] = var21;
            } else if (var20 == 2) {
                class247.field4313[var21] = var19.field3412;
                class180.field3153[class115.method767(31, class49.field879++)] = var21;
            }
        }
        if (client.field1644 != 0) {
            class42.field694 += 20;
            if (class42.field694 >= 400) {
                client.field1644 = 0;
            }
        }
        class193.field3347++;
        if (class52.field927 != null) {
            class144.field2624++;
            if (class144.field2624 >= 15) {
                class215.method1385(class52.field927, -116);
                class52.field927 = null;
            }
        }
        if (class51.field902 != null) {
            class215.method1385(class51.field902, -116);
            if (class78.field1541 + 5 < class170.field3021 || class78.field1541 - 5 > class170.field3021 || (class217.field3728 + 5) < class50.field896 || class50.field896 < (class217.field3728 - 5)) {
                class211.field3628 = true;
            }
            class68.field1360++;
            if (class30.field452 == 0) {
                if (class211.field3628 && class68.field1360 >= 5) {
                    if (class51.field902 == class214.field3672 && class220.field3768 != class198.field3422) {
                        class35.field525++;
                        class63 var22 = class51.field902;
                        byte var23 = 0;
                        if (class158.field2849 == 1 && var22.field1131 == 206) {
                            var23 = 1;
                        }
                        if (var22.field1118[class220.field3768] <= 0) {
                            var23 = 0;
                        }
                        if (class84.method582(0, client.method592(var22))) {
                            int var24 = class198.field3422;
                            int var25 = class220.field3768;
                            var22.field1118[var25] = var22.field1118[var24];
                            var22.field1097[var25] = var22.field1097[var24];
                            var22.field1118[var24] = -1;
                            var22.field1097[var24] = 0;
                        } else if (var23 == 1) {
                            int var26 = class220.field3768;
                            int var27 = class198.field3422;
                            while (var26 != var27) {
                                if (var26 < var27) {
                                    var22.method417(var27 - 1, 87, var27);
                                    var27--;
                                } else if (var26 > var27) {
                                    var22.method417(var27 + 1, 49, var27);
                                    var27++;
                                }
                            }
                        } else {
                            var22.method417(class220.field3768, 95, class198.field3422);
                        }
                        class28.field412.method578(-86, 167);
                        class28.field412.method1685((byte) 19, class220.field3768);
                        class28.field412.method1658(-772724656, var23);
                        class28.field412.method1685((byte) 19, class198.field3422);
                        class28.field412.method1686((byte) 127, class51.field902.field1115);
                    }
                } else if ((class133.field2475 == 1 || class40.method241((byte) -125, class176.field3105 - 1)) && class176.field3105 > 2) {
                    class105.method723((byte) -49);
                } else if (class176.field3105 > 0) {
                    class21.method92((byte) 46);
                }
                class144.field2624 = 10;
                class51.field902 = null;
                class264.field4627 = 0;
            }
        }
        class139.field2577 = false;
        class217.field3740 = false;
        class63 var28 = class158.field2850;
        class158.field2850 = null;
        class20.field272 = null;
        class155.field2762 = 0;
        class63 var29 = class255.field4484;
        class255.field4484 = null;
        while (class147.method1010((byte) 111) && class155.field2762 < 128) {
            class94.field1819[class155.field2762] = class78.field1543;
            class91.field1753[class155.field2762] = class107.field2052;
            class155.field2762++;
        }
        class80.field1573 = null;
        if (class150.field2702 != -1) {
            class171.method1163(-88, class150.field2702, class19.field257, 0, 0, 0, 0, class12.field143);
        }
        class15.field199++;
        while (true) {
            class237 var30;
            class63 var31;
            class63 var32;
            do {
                var30 = (class237) class241.field4204.method874(-107);
                if (var30 == null) {
                    while (true) {
                        class237 var33;
                        class63 var34;
                        class63 var35;
                        do {
                            var33 = (class237) class138.field2535.method874(-95);
                            if (var33 == null) {
                                while (true) {
                                    class237 var36;
                                    class63 var37;
                                    class63 var38;
                                    do {
                                        var36 = (class237) class111.field2145.method874(80);
                                        if (var36 == null) {
                                            if (class49.field874 && class80.field1573 == null) {
                                                class49.field874 = false;
                                            }
                                            if (class241.field4187 != null) {
                                                class100.method685((byte) -113);
                                            }
                                            if (class130.field2430 > 0 && class167.field3009[82] && class167.field3009[81] && class161.field2887 != 0) {
                                                int var39 = class196.field3401 - class161.field2887;
                                                if (var39 < 0) {
                                                    var39 = 0;
                                                } else if (var39 > 3) {
                                                    var39 = 3;
                                                }
                                                class222.method1416(class207.field3595.field2039[0] + class3.field39, var39, class207.field3595.field2086[0] + class34.field512, 24867);
                                            }
                                            if (class54.field945 != -1) {
                                                int var40 = class54.field945;
                                                int var41 = class64.field1267;
                                                if (class130.field2430 > 0 && class167.field3009[82] && class167.field3009[81]) {
                                                    class222.method1416(class3.field39 + var40, class196.field3401, class34.field512 + var41, 24867);
                                                } else {
                                                    boolean var42 = class10.method44(0, 0, class207.field3595.field2039[0], class207.field3595.field2086[0], 0, 0, var41, true, 0, -3, 0, var40);
                                                    if (var42) {
                                                        class42.field694 = 0;
                                                        class15.field191 = class188.field3274;
                                                        client.field1644 = 1;
                                                        class176.field3089 = class174.field3068;
                                                    }
                                                }
                                                class54.field945 = -1;
                                            }
                                            class85.method597(-2);
                                            if (class158.field2850 != var28) {
                                                if (var28 != null) {
                                                    class215.method1385(var28, -114);
                                                }
                                                if (class158.field2850 != null) {
                                                    class215.method1385(class158.field2850, -116);
                                                }
                                            }
                                            if (class255.field4484 != var29 && class78.field1548 == class172.field3042) {
                                                if (var29 != null) {
                                                    class215.method1385(var29, -119);
                                                }
                                                if (class255.field4484 != null) {
                                                    class215.method1385(class255.field4484, -119);
                                                }
                                            }
                                            if (class255.field4484 == null) {
                                                if (class78.field1548 > 0) {
                                                    class78.field1548--;
                                                }
                                            } else if (class172.field3042 > class78.field1548) {
                                                class78.field1548++;
                                                if (class78.field1548 == class172.field3042) {
                                                    class215.method1385(class255.field4484, -113);
                                                }
                                            }
                                            if (class167.field2995 == 1) {
                                                class154.method1048(2);
                                            } else if (class167.field2995 == 2) {
                                                class243.method1601(-128);
                                            } else {
                                                class127.method880(-1);
                                            }
                                            for (int var43 = 0; var43 < 5; var43++) {
                                                int var10002 = class8.field75[var43]++;
                                            }
                                            int var44 = class48.method337((byte) 47);
                                            int var45 = class105.method726(7);
                                            if (var44 > 4500 && var45 > 4500) {
                                                class125.field2365 = 250;
                                                class131.method909(4000, 0);
                                                class133.field2479++;
                                                class28.field412.method578(57, 47);
                                            }
                                            class156.field2772++;
                                            class110.field2122++;
                                            if (class110.field2122 > 500) {
                                                class110.field2122 = 0;
                                                int var46 = (int) (Math.random() * 8.0D);
                                                if ((var46 & 0x2) == 2) {
                                                    class197.field3403 += class70.field1411;
                                                }
                                                if ((var46 & 0x1) == 1) {
                                                    class75.field1494 += class254.field4449;
                                                }
                                                if ((var46 & 0x4) == 4) {
                                                    class208.field3602 += class43.field742;
                                                }
                                            }
                                            if (class156.field2772 > 500) {
                                                class156.field2772 = 0;
                                                int var47 = (int) (Math.random() * 8.0D);
                                                if ((var47 & 0x2) == 2) {
                                                    class240.field4172 += class97.field1894;
                                                }
                                                if ((var47 & 0x1) == 1) {
                                                    class124.field2341 += class59.field1006;
                                                }
                                            }
                                            if (class240.field4172 < -20) {
                                                class97.field1894 = 1;
                                            }
                                            if (class208.field3602 < -40) {
                                                class43.field742 = 1;
                                            }
                                            if (class75.field1494 < -50) {
                                                class254.field4449 = 2;
                                            }
                                            if (class240.field4172 > 10) {
                                                class97.field1894 = -1;
                                            }
                                            class72.field1424++;
                                            if (class124.field2341 < -60) {
                                                class59.field1006 = 2;
                                            }
                                            if (class75.field1494 > 50) {
                                                class254.field4449 = -2;
                                            }
                                            if (class208.field3602 > 40) {
                                                class43.field742 = -1;
                                            }
                                            if (class197.field3403 < -55) {
                                                class70.field1411 = 2;
                                            }
                                            if (class124.field2341 > 60) {
                                                class59.field1006 = -2;
                                            }
                                            if (class197.field3403 > 55) {
                                                class70.field1411 = -2;
                                            }
                                            if (class72.field1424 > 50) {
                                                class146.field2666++;
                                                class28.field412.method578(-106, 115);
                                            }
                                            class225.method1435(-14394);
                                            try {
                                                if (class101.field1972 != null && class28.field412.field4335 > 0) {
                                                    class101.field1972.method1273(0, (byte) 81, class28.field412.field4335, class28.field412.field4350);
                                                    class72.field1424 = 0;
                                                    class28.field412.field4335 = 0;
                                                    return;
                                                }
                                                return;
                                            } catch (IOException var48) {
                                                class27.method119((byte) -21);
                                                return;
                                            }
                                        }
                                        var37 = var36.field4120;
                                        if (var37.field1190 < 0) {
                                            break;
                                        }
                                        var38 = class54.method367(var37.field1122, (byte) -80);
                                    } while (var38 == null || var38.field1092 == null || var37.field1190 >= var38.field1092.length || var38.field1092[var37.field1190] != var37);
                                    class8.method34(var36, 16);
                                }
                            }
                            var34 = var33.field4120;
                            if (var34.field1190 < 0) {
                                break;
                            }
                            var35 = class54.method367(var34.field1122, (byte) -80);
                        } while (var35 == null || var35.field1092 == null || var34.field1190 >= var35.field1092.length || var35.field1092[var34.field1190] != var34);
                        class8.method34(var33, 16);
                    }
                }
                var31 = var30.field4120;
                if (var31.field1190 < 0) {
                    break;
                }
                var32 = class54.method367(var31.field1122, (byte) -80);
            } while (var32 == null || var32.field1092 == null || var31.field1190 >= var32.field1092.length || var32.field1092[var31.field1190] != var31);
            class8.method34(var30, 16);
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IBIII)V")
    public static final void method405(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        if (class140.field2595 < 100) {
            class111.method747(false);
        }
        field1049++;
        class235.method1546(arg4, arg0, arg3 + arg4, arg0 + arg2);
        if (class140.field2595 < 100) {
            byte var5 = 20;
            int var6 = arg3 / 2 + arg4;
            int var7 = arg2 / 2 + arg0 - var5 - 18;
            class235.method1558(arg4, arg0, arg3, arg2, 0);
            class235.method1534(var6 - 152, var7, 304, 34, 9179409);
            class235.method1534(var6 - 151, var7 + 1, 302, 32, 0);
            class235.method1558(var6 - 150, var7 - -2, class140.field2595 * 3, 30, 9179409);
            class235.method1558(class140.field2595 * 3 + var6 - 150, var7 - -2, 300 - class140.field2595 * 3, 30, 0);
            class59.field1016.method235(class131.field2441, var6, var7 + var5, 16777215, -1);
            return;
        }
        class47.field860 = class192.field3323 - ((int) ((float) arg2 / class35.field527));
        class92.field1774 = (int) ((float) (arg3 * 2) / class35.field527);
        class260.field4594 = (int) ((float) (arg2 * 2) / class35.field527);
        class171.field3034 = class144.field2635 - ((int) ((float) arg3 / class35.field527));
        if (arg1 != 51) {
            method404(false);
        }
        int var8 = class144.field2635 - ((int) ((float) arg3 / class35.field527));
        int var9 = class192.field3323 - (int) ((float) arg2 / class35.field527);
        int var10 = (int) ((float) arg2 / class35.field527) + class192.field3323;
        int var11 = (int) ((float) arg3 / class35.field527) + class144.field2635;
        class237.method1566(arg0, var9, var10, arg4, var8, arg3 + arg4, 1391070128, arg0 + arg2, var11);
        class111.method746(var8, arg0, false, arg0 + arg2, arg3 + arg4, var10, var9, var11, arg4);
        class195.method1271(var10, arg0, arg0 + arg2, arg4, var9, arg3 + arg4, var11, var8, 73);
        if (class31.field459 > 0) {
            class31.field459--;
        }
        if (!class15.field185) {
            return;
        }
        int var12 = arg3 + arg4 - 5;
        int var13 = arg0 + arg2 - 8;
        class33.field501.method225(class212.method1372(2, new class66[] { class181.field3161, class144.method989(class194.field3357, 0) }), var12, var13, 16776960, -1);
        int var17 = var13 - 15;
        Runtime var14 = Runtime.getRuntime();
        int var15 = 16776960;
        int var16 = (int) ((var14.totalMemory() - var14.freeMemory()) / 1024L);
        if (var16 > 65536) {
            var15 = 16711680;
        }
        class33.field501.method225(class212.method1372(2, new class66[] { class90.field1736, class144.method989(var16, 0), class243.field4246 }), var12, var17, var15, -1);
        var13 = var17 - 15;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(B)V")
    public final void method406(byte arg0) {
        field1046++;
        this.field1053.method1502((byte) -11);
        if (arg0 <= -94) {
            ;
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(BI)Z")
    public final boolean method407(byte arg0, int arg1) {
        if (arg0 != 39) {
            this.method414((byte) 2, true);
        }
        field1065++;
        return this.field1070[arg1];
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(FII)[I")
    public final int[] method408(float arg0, int arg1, int arg2) {
        if (arg1 != 99) {
            return null;
        }
        field1043++;
        class77 var4 = this.method409((byte) 109, arg2);
        if (var4 == null) {
            return null;
        } else {
            var4.field1534 = true;
            return var4.method552((byte) -92, this.field1047, this, arg0, this.field1059 || this.field1040[arg2]);
        }
    }

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "(BI)Lfe;")
    private final class77 method409(byte arg0, int arg1) {
        int var3 = -67 / (-arg0 / 47);
        field1072++;
        class77 var4 = (class77) this.field1053.method1505((long) arg1, (byte) -76);
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field1052.method135(0, 0, arg1);
        if (var5 == null) {
            return null;
        } else {
            class249 var6 = new class249(var5);
            class77 var7 = new class77(var6);
            this.field1053.method1497((long) arg1, (byte) 105, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!pa", name = "d", descriptor = "(II)I")
    public static final int method410(int arg0, int arg1) {
        if (arg1 == 522) {
            field1060++;
            return arg0 & 0x7F;
        } else {
            return -35;
        }
    }

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "(II)I")
    public final int method411(int arg0, int arg1) {
        int var3 = 103 / ((56 - arg1) / 44);
        field1057++;
        return this.field1071[arg0] & 0xFFFF;
    }

    @OriginalMember(owner = "client!pa", name = "e", descriptor = "(II)V")
    public final void method412(int arg0, int arg1) {
        for (class77 var3 = (class77) this.field1053.method1506(arg1); var3 != null; var3 = (class77) this.field1053.method1498(125)) {
            if (var3.field1534) {
                var3.method550(arg0, -27276);
                var3.field1534 = false;
            }
        }
        field1063++;
    }

    @OriginalMember(owner = "client!pa", name = "f", descriptor = "(II)I")
    public static final int method413(int arg0, int arg1) {
        int var7 = arg0 - 1;
        field1045++;
        int var2 = var7 | var7 >>> 1;
        int var3 = var2 | var2 >>> 2;
        int var4 = var3 | var3 >>> 4;
        if (arg1 != -21189) {
            method413(-80, 15);
        }
        int var5 = var4 | var4 >>> 8;
        int var6 = var5 | var5 >>> 16;
        return var6 + 1;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(BZ)V")
    public final void method414(byte arg0, boolean arg1) {
        if (arg0 == -97) {
            this.field1059 = arg1;
            field1077++;
            this.method406((byte) -117);
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(I)V")
    public static void method415(int arg0) {
        if (arg0 != 6287) {
            return;
        }
        field1058 = null;
        field1064 = null;
        field1048 = null;
        field1067 = null;
        field1054 = null;
        field1068 = null;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(ZI)Z")
    public final boolean method416(boolean arg0, int arg1) {
        class77 var3 = this.method409((byte) -120, arg1);
        field1051++;
        if (var3 == null) {
            return false;
        } else {
            if (!arg0) {
                this.method409((byte) 35, -31);
            }
            return var3.method548(this, -5947, this.field1047);
        }
    }

    @OriginalMember(owner = "client!pa", name = "<init>", descriptor = "(Lcj;Lcj;Lcj;IZ)V")
    public class62(class28 arg0, class28 arg1, class28 arg2, int arg3, boolean arg4) {
        this.field1066 = arg3;
        this.field1052 = arg0;
        this.field1047 = arg2;
        this.field1059 = arg4;
        this.field1053 = new class230(this.field1066);
        class249 var6 = new class249(arg1.method135(0, 0, 0));
        int var7 = var6.method1674(1355769544);
        this.field1073 = new boolean[var7];
        this.field1061 = new boolean[var7];
        this.field1076 = new boolean[var7];
        this.field1078 = new byte[var7];
        this.field1040 = new boolean[var7];
        this.field1055 = new byte[var7];
        this.field1071 = new short[var7];
        this.field1070 = new boolean[var7];
        this.field1062 = new byte[var7];
        this.field1074 = new byte[var7];
        for (int var8 = 0; var8 < var7; var8++) {
            this.field1061[var8] = var6.method1677(-6677) == 1;
        }
        for (int var9 = 0; var9 < var7; var9++) {
            if (this.field1061[var9]) {
                this.field1070[var9] = var6.method1677(-6677) == 1;
            }
        }
        for (int var10 = 0; var10 < var7; var10++) {
            if (this.field1061[var10]) {
                this.field1076[var10] = var6.method1677(-6677) == 1;
            }
        }
        for (int var11 = 0; var11 < var7; var11++) {
            if (this.field1061[var11]) {
                this.field1040[var11] = var6.method1677(-6677) == 1;
            }
        }
        for (int var12 = 0; var12 < var7; var12++) {
            if (this.field1061[var12]) {
                this.field1073[var12] = var6.method1677(-6677) == 1;
            }
        }
        for (int var13 = 0; var13 < var7; var13++) {
            if (this.field1061[var13]) {
                this.field1062[var13] = var6.method1682(3390);
            }
        }
        for (int var14 = 0; var14 < var7; var14++) {
            if (this.field1061[var14]) {
                this.field1078[var14] = var6.method1682(3390);
            }
        }
        for (int var15 = 0; var15 < var7; var15++) {
            if (this.field1061[var15]) {
                this.field1055[var15] = var6.method1682(3390);
            }
        }
        for (int var16 = 0; var16 < var7; var16++) {
            if (this.field1061[var16]) {
                this.field1074[var16] = var6.method1682(3390);
            }
        }
        for (int var17 = 0; var17 < var7; var17++) {
            if (this.field1061[var17]) {
                this.field1071[var17] = (short) var6.method1674(1355769544);
            }
        }
    }
}
