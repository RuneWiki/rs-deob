import java.awt.Frame;
import java.io.IOException;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wl")
public class class95 extends class72 {

    @OriginalMember(owner = "client!wl", name = "cb", descriptor = "Ljava/lang/Object;")
    private Object field1741;

    @OriginalMember(owner = "client!wl", name = "U", descriptor = "Z")
    public static boolean field1733 = false;

    @OriginalMember(owner = "client!wl", name = "db", descriptor = "Lbd;")
    public static class162 field1742 = class17.method142(0, "p12_full");

    @OriginalMember(owner = "client!wl", name = "gb", descriptor = "Lbd;")
    private static class162 field1745 = class17.method142(0, "Gegenstand f-Ur Mitglieder");

    @OriginalMember(owner = "client!wl", name = "F", descriptor = "I")
    public static int field1729;

    @OriginalMember(owner = "client!wl", name = "K", descriptor = "I")
    public static int field1730;

    @OriginalMember(owner = "client!wl", name = "S", descriptor = "I")
    public static int field1731;

    @OriginalMember(owner = "client!wl", name = "T", descriptor = "I")
    public static int field1732;

    @OriginalMember(owner = "client!wl", name = "V", descriptor = "I")
    public static int field1734;

    @OriginalMember(owner = "client!wl", name = "W", descriptor = "I")
    public static int field1735;

    @OriginalMember(owner = "client!wl", name = "X", descriptor = "I")
    public static int field1736;

    @OriginalMember(owner = "client!wl", name = "Y", descriptor = "I")
    public static int field1737;

    @OriginalMember(owner = "client!wl", name = "Z", descriptor = "I")
    public static int field1738;

    @OriginalMember(owner = "client!wl", name = "eb", descriptor = "I")
    public static int field1743;

    @OriginalMember(owner = "client!wl", name = "fb", descriptor = "I")
    public static int field1744;

    @OriginalMember(owner = "client!wl", name = "hb", descriptor = "I")
    public static int field1746;

    @OriginalMember(owner = "client!wl", name = "bb", descriptor = "Ljava/awt/Frame;")
    public static Frame field1740;

    @OriginalMember(owner = "client!wl", name = "ab", descriptor = "[[Lob;")
    public static class78[][] field1739;

    @OriginalMember(owner = "client!wl", name = "d", descriptor = "(Z)V", line = 6)
    public static final void method763(boolean arg0) {
        field1738++;
        class98 var1 = (class98) class220.field3670.method169(-125);
        if (arg0) {
            return;
        }
        while (var1 != null) {
            class8 var2 = var1.field1774;
            if (class157.field2765 != var2.field100 || var2.field85) {
                var1.method1183(false);
            } else if (class90.field1598 >= var2.field98) {
                var2.method53(class149.field2680, (byte) -70);
                if (var2.field85) {
                    var1.method1183(arg0);
                } else {
                    class238.method1684(var2.field100, var2.field104, var2.field96, var2.field97, 60, var2, 0, -1L, false);
                }
            }
            var1 = (class98) class220.field3670.method165((byte) -101);
        }
    }

    @OriginalMember(owner = "client!wl", name = "d", descriptor = "(I)V", line = 38)
    public static final void method764(int arg0) {
        if (arg0 != -29738) {
            field1740 = (Frame) null;
        }
        field1746++;
        class183.field3160.method1529(false);
    }

    @OriginalMember(owner = "client!wl", name = "d", descriptor = "(B)V", line = 49)
    public static void method765(byte arg0) {
        if (arg0 != 8) {
            field1740 = (Frame) null;
        }
        field1742 = null;
        field1745 = null;
        field1740 = null;
        field1739 = (class78[][]) null;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(IIZ)V", line = 66)
    public static final void method766(int arg0, int arg1, boolean arg2) {
        field1737++;
        class63 var3 = class46.method332(13, arg0, -12770);
        var3.method430(arg2);
        var3.field971 = arg1;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(IIZZBII)V", line = 78)
    public static final void method767(int arg0, int arg1, boolean arg2, boolean arg3, byte arg4, int arg5, int arg6) {
        field1734++;
        if (arg4 != 52 || arg0 >= arg6) {
            return;
        }
        int var7 = arg0;
        int var8 = (arg0 + arg6) / 2;
        class223 var9 = class13.field220[var8];
        class13.field220[var8] = class13.field220[arg6];
        class13.field220[arg6] = var9;
        for (int var10 = arg0; var10 < arg6; var10++) {
            if (class315.method2147(arg1, arg2, class13.field220[var10], arg4 ^ 0x34, arg3, arg5, var9) <= 0) {
                class223 var11 = class13.field220[var10];
                class13.field220[var10] = class13.field220[var7];
                class13.field220[var7++] = var11;
            }
        }
        class13.field220[arg6] = class13.field220[var7];
        class13.field220[var7] = var9;
        method767(arg0, arg1, arg2, arg3, (byte) 52, arg5, var7 - 1);
        method767(var7 + 1, arg1, arg2, arg3, (byte) 52, arg5, arg6);
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(II[BB)Lbd;", line = 122)
    public static final class162 method768(int arg0, int arg1, byte[] arg2, byte arg3) {
        field1729++;
        class162 var4 = new class162();
        var4.field2817 = new byte[arg0];
        var4.field2865 = 0;
        if (arg3 <= 115) {
            method764(-22);
        }
        for (int var5 = arg1; var5 < (arg0 + arg1); var5++) {
            if (arg2[var5] != 0) {
                var4.field2817[var4.field2865++] = arg2[var5];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!wl", name = "c", descriptor = "(II)I", line = 149)
    public static final int method769(int arg0, int arg1) {
        field1735++;
        int var2 = 106 / ((arg0 + 39) / 51);
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "(I)Z", line = 160)
    public final boolean method522(int arg0) {
        int var2 = -94 % ((arg0 + 27) / 53);
        field1744++;
        return false;
    }

    @OriginalMember(owner = "client!wl", name = "e", descriptor = "(I)V", line = 173)
    public static final void method770(int arg0) {
        class277.field4647 = class279.field4699;
        class315.field5322 = field1745;
        class53.field843 = class259.field4320;
        class292.field4924 = class187.field3219;
        class151.field2703 = class293.field4933;
        class315.field5325 = class97.field1764;
        class20.field326 = class144.field2602;
        client.field1896 = class297.field4975;
        class22.field351 = class204.field3454;
        class157.field2773 = class245.field4069;
        class225.field3750 = class67.field1078;
        field1730++;
        class258.field4302 = class68.field1089;
        class216.field3605 = class167.field2941;
        class214.field3592 = class280.field4724;
        class267.field4443 = class180.field3093;
        client.field1907 = class125.field2275;
        class81.field1416 = class183.field3165;
        class23.field392 = class149.field2690;
        class126.field2297 = class307.field5170;
        class158.field2783 = class204.field3444;
        class173.field2995 = class106.field1931;
        class112.field2032 = class96.field1755;
        class120.field2185 = class89.field1584;
        class251.field4198 = class45.field721;
        class92.field1632 = class86.field1523;
        class303.field5122 = class238.field3965;
        class81.field1414 = class134.field2388;
        class77.field1206 = class84.field1506;
        class162.field2830 = class259.field4309;
        class74.field1181 = class96.field1759;
        class87.field1539 = class106.field1932;
        class82.field1423 = class292.field4919;
        class154.field2725 = class240.field3999;
        class48.field771 = class289.field4862;
        class317.field5340 = class247.field4096;
        class105.field1919 = class23.field400;
        class307.field5167 = class32.field532;
        class87.field1551 = class146.field2641;
        class187.field3225 = class237.field3951;
        class92.field1627 = class86.field1523;
        class119.field2177 = class50.field804;
        class42.field689 = class63.field973;
        class171.field2972 = class162.field2827;
        class190.field3245 = class89.field1583;
        class98.field1781 = class252.field4213;
        if (arg0 != 0) {
            return;
        }
        class56.field876 = class88.field1567;
        class74.field1179 = class151.field2704;
        class230.field3841 = class6.field57;
        class255.field4224 = class63.field983;
        class77.field1207 = class240.field4000;
        class64.field998 = class134.field2399;
        class263.field4392 = class214.field3589;
        class212.field3563 = class293.field4929;
        class9.field106 = class7.field77;
        class77.field1215 = class209.field3540;
        class307.field5169 = class32.field532;
        class35.field566 = class61.field936;
        class67.field1085 = class34.field552;
        class242.field4030 = class120.field2183;
        class163.field2888 = class252.field4210;
        class83.field1471 = class187.field3220;
        class238.field3959 = class217.field3624;
        class71.field1136 = class182.field3134;
        class289.field4883 = class220.field3683;
        class112.field2029 = class96.field1755;
        class17.field288 = class70.field1113;
        class315.field5320 = class242.field4028;
        class89.field1591 = class229.field3812;
        class73.field1160 = class302.field5094;
        class279.field4696 = class67.field1080;
        class259.field4319 = class274.field4549;
        class188.field3238 = class25.field410;
        class12.field209 = client.field1905;
        class10.field116 = class19.field315;
        class186.field3199 = class98.field1779;
        class260.field4329 = class214.field3587;
        class298.field4983 = class35.field588;
        class261.field4365 = class307.field5168;
        class235.field3934 = class283.field4797;
        class68.field1095 = class228.field3799;
        class259.field4314 = class277.field4663;
        class80.field1392 = class139.field2485;
        class55.field860 = class88.field1573;
        class223.field3732 = class248.field4121;
        class268.field4474 = class18.field290;
        class160.field2792 = class289.field4884;
        class157.field2772 = class208.field3511;
        class29.field493 = class7.field69;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(Ljava/util/Random;IB)I", line = 522)
    public static final int method771(Random arg0, int arg1, byte arg2) {
        field1731++;
        if (arg1 <= 0) {
            throw new IllegalArgumentException();
        } else if (class223.method1619(arg1, -102)) {
            return (int) ((long) arg1 * ((long) arg0.nextInt() & 0xFFFFFFFFL) >> 32);
        } else {
            int var3 = Integer.MIN_VALUE - ((int) (4294967296L % (long) arg1));
            if (arg2 < 109) {
                field1745 = (class162) null;
            }
            int var4;
            do {
                var4 = arg0.nextInt();
            } while (var3 <= var4);
            return class270.method1845(0, var4, arg1);
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(Lib;I)V", line = 564)
    public static final void method772(class28 arg0, int arg1) {
        class39.field639 = 3;
        class256.method1769(true, 1);
        class291.field4906 = 2;
        class247.field4090 = true;
        class92.field1634 = true;
        class154.field2727 = 127;
        class25.field413 = false;
        class204.field3452 = 0;
        class295.field4945 = true;
        class27.field458 = true;
        class92.field1621 = true;
        class220.field3674 = 0;
        class203.field3439 = true;
        class261.field4362 = true;
        field1732++;
        class256.field4256 = 127;
        class267.field4461 = true;
        class45.field724 = true;
        class138.field2465 = 0;
        class135.field2413 = 255;
        class259.field4317 = true;
        class258.field4296 = 0;
        class112.field2031 = 0;
        class156.field2746 = true;
        class197 var2 = null;
        try {
            class166 var3 = arg0.method229("runescape", -117);
            while (var3.field2934 == 0) {
                class177.method1342(1L, arg1 ^ 0xE77);
            }
            if (var3.field2934 == 1) {
                var2 = (class197) var3.field2933;
                int var4 = 0;
                byte[] var5 = new byte[(int) var2.method1475(arg1 - 3821)];
                while (var5.length > var4) {
                    int var6 = var2.method1473(var5, var4, var5.length - var4, (byte) -127);
                    if (var6 == -1) {
                        throw new IOException("EOF");
                    }
                    var4 += var6;
                }
                class163.method1296(-15548, new class94(var5));
            }
        } catch (Exception var10) {
        }
        if (arg1 != 3702) {
            method769(68, -41);
        }
        try {
            if (var2 != null) {
                var2.method1476((byte) 124);
            }
        } catch (Exception var9) {
        }
    }

    @OriginalMember(owner = "client!wl", name = "c", descriptor = "(Z)Ljava/lang/Object;", line = 648)
    public final Object method525(boolean arg0) {
        if (!arg0) {
            method763(true);
        }
        field1736++;
        return this.field1741;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(IB)Lof;", line = 661)
    public static final class88 method773(int arg0, byte arg1) {
        field1743++;
        class88 var2 = (class88) class258.field4268.method1382((byte) -83, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3;
        if (arg0 < 32768) {
            var3 = class230.field3842.method1128(arg0, 0, 0);
        } else {
            var3 = class212.field3561.method1128(arg0 & 0x7FFF, 0, 0);
        }
        class88 var4 = new class88();
        if (var3 != null) {
            var4.method671(-12649, new class94(var3));
        }
        if (arg1 > -33) {
            method765((byte) -41);
        }
        if (arg0 >= 32768) {
            var4.method670((byte) 98);
        }
        class258.field4268.method1386(var4, -81, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!wl", name = "<init>", descriptor = "(Ljava/lang/Object;)V", line = 701)
    public class95(Object arg0) {
        this.field1741 = arg0;
    }
}
