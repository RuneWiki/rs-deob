import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sr")
public class class571 {

    @OriginalMember(owner = "client!sr", name = "e", descriptor = "Lra;")
    public static class361 field7447 = new class361(31, 10);

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "I")
    public int field7443;

    @OriginalMember(owner = "client!sr", name = "d", descriptor = "I")
    public static int field7446;

    @OriginalMember(owner = "client!sr", name = "f", descriptor = "I")
    public static int field7448;

    @OriginalMember(owner = "client!sr", name = "b", descriptor = "Lmca;")
    public class34 field7444;

    @OriginalMember(owner = "client!sr", name = "c", descriptor = "Lsr;")
    public class571 field7445;

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(B)V")
    public final void method3049(byte arg0) {
        field7446++;
        if (class499.field6558 >= 500) {
            return;
        }
        this.field7445 = class589.field7997;
        this.field7444 = null;
        if (arg0 <= 57) {
            this.field7444 = null;
        }
        this.field7443 = 0;
        class499.field6558++;
        class589.field7997 = this;
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(I)I")
    public static final int method3050(int arg0) {
        if (!class260.field3509.field1265) {
            for (int var1 = 0; var1 < class458.field5999; var1++) {
                if (class495.field6533[var1].method316((byte) -83) == 's' || class495.field6533[var1].method316((byte) -83) == 'S') {
                    class260.field3509.field1265 = true;
                    break;
                }
            }
        }
        field7448++;
        if (class466.field6074 == class266.field3564) {
            Runtime var2 = Runtime.getRuntime();
            int var3 = (int) ((var2.totalMemory() - var2.freeMemory()) / 1024L);
            long var4 = class584.method3191(1);
            if (class478.field6384 == 0L) {
                class478.field6384 = var4;
            }
            if (var3 > 16384 && (var4 - class478.field6384) < 5000L) {
                if (var4 - class550.field7137 > 1000L) {
                    System.gc();
                    class550.field7137 = var4;
                }
                return 0;
            }
        }
        if (class466.field6082 == class266.field3564) {
            if (class618.field8349 == null) {
                class618.field8349 = new class345(class448.field5870, class435.field5645, class495.field6538, class647.field9019);
            }
            if (!class618.field8349.method1987((byte) -106)) {
                return 0;
            }
            class510.method2747(0, 9472, null);
            class635.field8839 = !class262.method1625(false);
            class16.field179 = class416.method2347(1, false, class635.field8839 ? 34 : 32, true, 4096);
            class637.field8870 = class416.method2347(1, false, 33, true, 4096);
            class261.field3511 = class416.method2347(1, false, 13, true, 4096);
        }
        if (class466.field6083 == class266.field3564) {
            class637.field8870.method3357(0);
            int var6 = class358.field4642[33].method2565(-91);
            int var7 = var6 + class358.field4642[class635.field8839 ? 34 : 32].method2565(59);
            int var8 = var7 + class358.field4642[13].method2565(81);
            int var9 = var8 + class637.field8870.method3349(false);
            if (var9 != 400) {
                return var9 / 4;
            }
            class693.field9483 = class16.field179.method3339(32);
            class667.field9256 = class637.field8870.method3339(88);
            class60.method509(class16.field179, -7104);
            int var10 = class260.field3509.field1262;
            class107.field1390 = new class626(class153.field1947, class144.field1890, class637.field8870);
            int[] var11 = class107.field1390.method3476(var10, -102);
            class570 var12 = new class570(class16.field179, class261.field3511);
            if (var11.length > 0) {
                class379.field4854 = new class687[var11.length];
                for (int var13 = 0; var13 < class379.field4854.length; var13++) {
                    class379.field4854[var13] = new class67(class107.field1390.method3481(76, var11[var13]), var12);
                }
            }
        }
        if (class466.field6084 == class266.field3564) {
            class573.method3056(class261.field3511, 115, class533.method2833(2618), class16.field179);
        }
        if (class466.field6085 == class266.field3564) {
            int var14 = class348.method1998((byte) 74);
            int var15 = class195.method1285(-225);
            if (var15 > var14) {
                return var14 * 100 / var15;
            }
        }
        if (class466.field6086 == class266.field3564) {
            if (class379.field4854 != null && class379.field4854.length > 0) {
                if (class379.field4854[0].method547((byte) -17) < 100) {
                    return 0;
                }
                if (class379.field4854.length > 1 && class107.field1390.method3477(0) && class379.field4854[1].method547((byte) -17) < 100) {
                    return 0;
                }
            }
            class386.method2200(-109, class520.field6799);
            class91.method686(30806, class520.field6799);
            class442.method2508(1, 1);
        }
        if (class466.field6087 == class266.field3564) {
            for (int var16 = 0; var16 < 4; var16++) {
                class703.field9806[var16] = class48.method439(class656.field9155, 13556, class611.field8258);
            }
        }
        if (class466.field6088 == class266.field3564) {
            class90.field1186 = class416.method2347(1, false, 8, true, 4096);
            class668.field9279 = class416.method2347(1, false, 0, true, 4096);
            class19.field211 = class416.method2347(1, false, 1, true, 4096);
            class262.field3517 = class416.method2347(1, false, 2, true, 4096);
            class352.field4521 = class416.method2347(1, false, 3, true, 4096);
            class63.field864 = class416.method2347(1, false, 4, true, 4096);
            class277.field3630 = class416.method2347(1, true, 5, true, 4096);
            class6.field53 = class416.method2347(1, true, 6, false, 4096);
            class61.field837 = class416.method2347(1, false, 7, true, 4096);
            class544.field7069 = class416.method2347(1, false, 9, true, 4096);
            class331.field4307 = class416.method2347(1, false, 10, true, 4096);
            class683.field9391 = class416.method2347(1, false, 11, true, 4096);
            class517.field6774 = class416.method2347(1, false, 12, true, 4096);
            class680.field9375 = class416.method2347(1, false, 14, false, 4096);
            class363.field4688 = class416.method2347(1, false, 15, true, 4096);
            class253.field3452 = class416.method2347(1, false, 16, true, 4096);
            class187.field2382 = class416.method2347(1, false, 17, true, 4096);
            class129.field1647 = class416.method2347(1, false, 18, true, 4096);
            class493.field6524 = class416.method2347(1, false, 19, true, 4096);
            class278.field3647 = class416.method2347(1, false, 20, true, 4096);
            class331.field4309 = class416.method2347(1, false, 21, true, 4096);
            class270.field3586 = class416.method2347(1, false, 22, true, 4096);
            class52.field716 = class416.method2347(1, true, 23, true, 4096);
            class95.field1249 = class416.method2347(1, false, 24, true, 4096);
            class307.field4024 = class416.method2347(1, false, 25, true, 4096);
            class536.field6979 = class416.method2347(1, true, 26, true, 4096);
            class186.field2370 = class416.method2347(1, false, 27, true, 4096);
            class418.field5354 = class416.method2347(1, true, 28, true, 4096);
            class378.field4844 = class416.method2347(1, false, 29, true, 4096);
            class447.field5818 = class416.method2347(1, true, 30, true, 4096);
            class650.field9053 = class416.method2347(1, true, 31, true, 4096);
        }
        if (class466.field6089 == class266.field3564) {
            int var17 = 0;
            for (int var18 = 0; var18 < 35; var18++) {
                if (class358.field4642[var18] != null) {
                    var17 += class358.field4642[var18].method2565(-58) * class590.field8004[var18] / 100;
                }
            }
            if (var17 != 100) {
                if (class23.field243 < 0) {
                    class23.field243 = var17;
                }
                return (var17 - class23.field243) * 100 / (100 - class23.field243);
            }
            class218.method1389(class90.field1186, (byte) 91);
            class573.method3056(class261.field3511, 120, class533.method2833(2618), class90.field1186);
        }
        if (class466.field6090 == class266.field3564) {
            class424.method2444(-98);
            class442.method2508(2, 1);
        }
        if (class466.field6091 == class266.field3564) {
            class631.method3496(class688.field9413, class447.field5818, 15363);
        }
        if (class466.field6092 == class266.field3564) {
            int var19 = class518.method2785(1);
            if (var19 < 100) {
                return var19;
            }
            class542.method2878(class418.field5354.method3365(1, (byte) 96), (byte) -20);
            class569.method3044(class418.field5354.method3365(3, (byte) 115), 28058);
        }
        if (class466.field6093 == class266.field3564) {
            if (class317.field4110 != -1 && !class61.field837.method3343(class317.field4110, 0, (byte) 104)) {
                return 99;
            }
            class448.field5863 = new class577(class536.field6979, class544.field7069, class90.field1186);
            class191.field2445 = new class143(class153.field1947, class144.field1890, class262.field3517);
            class536.field6983 = new class16(class153.field1947, class144.field1890, class262.field3517);
            class122.field1588 = new class665(class153.field1947, class144.field1890, class262.field3517, class90.field1186);
            class359.field4656 = new class412(class153.field1947, class144.field1890, class187.field2382);
            class700.field9771 = new class245(class153.field1947, class144.field1890, class262.field3517);
            class2.field9 = new class214(class153.field1947, class144.field1890, class262.field3517);
            class120.field1550 = new class33(class153.field1947, class144.field1890, class262.field3517, class61.field837);
            class361.field4669 = new class80(class153.field1947, class144.field1890, class262.field3517);
            class64.field882 = new class678(class153.field1947, class144.field1890, class262.field3517);
            class348.field4436 = new class329(class153.field1947, class144.field1890, true, class253.field3452, class61.field837);
            class650.field9060 = new class401(class153.field1947, class144.field1890, class262.field3517, class90.field1186);
            class414.field5331 = new class545(class153.field1947, class144.field1890, class262.field3517, class90.field1186);
            class646.field8998 = new class61(class153.field1947, class144.field1890, true, class129.field1647, class61.field837);
            class232.field3109 = new class196(class153.field1947, class144.field1890, true, class191.field2445, class493.field6524, class61.field837);
            class97.field1307 = new class294(class153.field1947, class144.field1890, class262.field3517);
            class552.field7163 = new class567(class153.field1947, class144.field1890, class278.field3647, class668.field9279, class19.field211);
            class382.field4898 = new class352(class153.field1947, class144.field1890, class262.field3517);
            class277.field3629 = new class440(class153.field1947, class144.field1890, class262.field3517);
            class91.field1202 = new class135(class153.field1947, class144.field1890, class331.field4309, class61.field837);
            class671.field9319 = new class305(class153.field1947, class144.field1890, class262.field3517);
            class507.field6665 = new class279(class153.field1947, class144.field1890, class262.field3517);
            class499.field6561 = new class292(class153.field1947, class144.field1890, class262.field3517);
            class388.field4971 = new class384(class153.field1947, class144.field1890, class270.field3586);
            class543.field7052 = new class566(class153.field1947, class144.field1890, class262.field3517);
            class125.method914(class61.field837, true, class352.field4521, class261.field3511, class90.field1186);
            class133.method970(class378.field4844, 2);
            class567.field7401 = new class277(class144.field1890, class95.field1249, class307.field4024);
            class196.field2553 = new class7(class144.field1890, class95.field1249, class307.field4024, new class421());
            class263.method1628(1637396872);
            class348.field4436.method1898(!class260.field3509.method1571(class364.field4697, -23572), -25718);
            class397.field5054 = new class289();
            class24.method129(28260);
            class6.method21(class186.field2370, -76);
            class370.method2135(class448.field5863, false, class61.field837);
            class507 var20 = new class507(class331.field4307.method3355(0, "", "huffman"));
            class352.method2023(-99, var20);
            try {
                jagmisc.init();
            } catch (Throwable var29) {
            }
            class492.field6520 = class22.method119((byte) -92);
        }
        if (class466.field6095 == class266.field3564) {
            int var21 = class95.method724(127, class90.field1186) + class363.method2077((byte) 113, true);
            int var22 = class673.method3692((byte) -18) + class195.method1285(-225);
            if (var22 > var21) {
                return var21 * 100 / var22;
            }
        }
        if (class466.field6096 == class266.field3564) {
            class706.method3870(class52.field716, class700.field9771, class2.field9, class348.field4436, class650.field9060, class414.field5331, class397.field5054);
        }
        if (class466.field6097 == class266.field3564) {
            class311.field4040 = new int[class499.field6561.field3778];
            class337.field4362 = new String[class507.field6665.field3649];
            class564.field7369 = new boolean[class499.field6561.field3778];
            for (int var23 = 0; var23 < class499.field6561.field3778; var23++) {
                if (class499.field6561.method1732(true, var23).field6145 == 0) {
                    class564.field7369[var23] = true;
                    class143.field1878++;
                }
                class311.field4040[var23] = -1;
            }
            class202.method1318(28288);
            class658.field9177 = class352.field4521.method3359("loginscreen", (byte) -109);
            class196.field2551 = class352.field4521.method3359("lobbyscreen", (byte) -115);
            class277.field3630.method3363(false, -67, true);
            class6.field53.method3363(true, -10, true);
            class90.field1186.method3363(true, -101, true);
            class261.field3511.method3363(true, -68, true);
            class331.field4307.method3363(true, -80, true);
            class352.field4521.method3363(true, -19, true);
            class226.field2936 = true;
            class262.field3517.field8306 = 2;
            class187.field2382.field8306 = 2;
            class253.field3452.field8306 = 2;
            class129.field1647.field8306 = 2;
            class493.field6524.field8306 = 2;
            class278.field3647.field8306 = 2;
            class331.field4309.field8306 = 2;
        }
        if (arg0 <= 23) {
            field7447 = null;
        }
        if (class466.field6098 == class266.field3564) {
            if (!class152.method1106(70, class658.field9177)) {
                return 0;
            }
            for (int var24 = 0; var24 < class322.field4179[class658.field9177].length; var24++) {
                class477 var25 = class322.field4179[class658.field9177][var24];
                if (var25.field6312 == 5 && var25.field6265 != -1) {
                    var25.method2639(class520.field6799, 16777215);
                }
            }
        }
        if (class466.field6099 == class266.field3564) {
            for (int var26 = 0; var26 < class322.field4179[class658.field9177].length; var26++) {
                class477 var27 = class322.field4179[class658.field9177][var26];
                if (var27.field6312 == 5 && var27.field6265 != -1 && var27.method2639(class520.field6799, 16777215) == null && class148.field1918) {
                    return 0;
                }
            }
        }
        if (class466.field6100 == class266.field3564) {
            class445.method2521(true, -116);
        }
        if (class466.field6101 == class266.field3564) {
            class412.field5313.method763((byte) 110);
            try {
                class476.field6190.join();
            } catch (InterruptedException var28) {
                return 0;
            }
            class326.field4244 = class260.field3509.field1265;
            class260.field3509.field1265 = true;
            class260.field3509.method1574(class688.field9413, false);
            if (class326.field4244) {
                class11.method58(0, -101);
            } else {
                class11.method58(class260.field3509.field1275, -113);
            }
            class658.method3617(class260.field3509.field1293, -1, -1, false, 11015);
            class386.method2200(-70, class520.field6799);
            class91.method686(30806, class520.field6799);
            class407.method2304(0, class520.field6799, class90.field1186);
            class564.method3015(class497.field6553, (byte) 35);
            class379.field4854 = null;
            class107.field1390 = null;
            class637.field8870 = null;
            class16.field179 = null;
        }
        return class221.method1405((byte) 96);
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(Z)V")
    public static void method3051(boolean arg0) {
        field7447 = null;
        if (arg0) {
            method3051(true);
        }
    }
}
