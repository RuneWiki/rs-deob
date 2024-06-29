import java.awt.Component;
import java.awt.Container;
import java.awt.Insets;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class91 extends class151 {

    @OriginalMember(owner = "client!le", name = "A", descriptor = "I")
    public int field1615;

    @OriginalMember(owner = "client!le", name = "v", descriptor = "I")
    public int field1610;

    @OriginalMember(owner = "client!le", name = "u", descriptor = "I")
    public static int field1609 = 0;

    @OriginalMember(owner = "client!le", name = "E", descriptor = "[B")
    public static byte[] field1619 = new byte[520];

    @OriginalMember(owner = "client!le", name = "s", descriptor = "I")
    public static int field1607;

    @OriginalMember(owner = "client!le", name = "t", descriptor = "I")
    public static int field1608;

    @OriginalMember(owner = "client!le", name = "w", descriptor = "I")
    public static int field1611;

    @OriginalMember(owner = "client!le", name = "x", descriptor = "I")
    public static int field1612;

    @OriginalMember(owner = "client!le", name = "B", descriptor = "I")
    public static int field1616;

    @OriginalMember(owner = "client!le", name = "C", descriptor = "I")
    public static int field1617;

    @OriginalMember(owner = "client!le", name = "D", descriptor = "I")
    public static int field1618;

    @OriginalMember(owner = "client!le", name = "z", descriptor = "Lda;")
    public static class143 field1614;

    @OriginalMember(owner = "client!le", name = "y", descriptor = "Lwf;")
    public static class215 field1613;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(I)V", line = 6)
    public static final void method685(int arg0) {
        if (class262.field4380 == 10 && class117.field2159) {
            class122.method984(28, 2047);
        }
        if (class262.field4380 == 30) {
            class122.method984(25, 2047);
        }
        if (arg0 <= 5) {
            method687(-8);
        }
        field1607++;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(ILda;BI)[Lpm;", line = 24)
    public static final class99[] method686(int arg0, class143 arg1, byte arg2, int arg3) {
        if (arg2 != 49) {
            field1619 = (byte[]) null;
        }
        field1617++;
        return class94.method757(arg1, arg3, arg2 - 1908303969, arg0) ? class120.method977(9) : null;
    }

    @OriginalMember(owner = "client!le", name = "b", descriptor = "(I)V", line = 65)
    public static final void method687(int arg0) {
        if (class63.field991[98]) {
            class70.field1120 += (12 - class70.field1120) / 2;
        } else if (class63.field991[99]) {
            class70.field1120 += (-class70.field1120 - 12) / 2;
        } else {
            class70.field1120 /= 2;
        }
        if (class63.field991[96]) {
            class219.field3652 += (-class219.field3652 - 24) / 2;
        } else if (class63.field991[97]) {
            class219.field3652 += (24 - class219.field3652) / 2;
        } else {
            class219.field3652 /= 2;
        }
        field1616++;
        class265.field4414 += class219.field3652 / 2;
        class160.field2803 += class70.field1120 / 2;
        int var1 = class34.field561 + class122.field2215.field5047;
        int var2 = class122.field2215.field5013 + class39.field620;
        if (class88.field1566 - var2 < -500 || (class88.field1566 - var2) > 500 || (class280.field4727 - var1) < -500 || (class280.field4727 - var1) > 500) {
            class280.field4727 = var1;
            class88.field1566 = var2;
        }
        if (class88.field1566 != var2) {
            class88.field1566 += (var2 - class88.field1566) / 16;
        }
        if (class280.field4727 != var1) {
            class280.field4727 += (var1 - class280.field4727) / 16;
        }
        if (arg0 == 13158) {
            class292.method2022((byte) -119);
        }
    }

    @OriginalMember(owner = "client!le", name = "c", descriptor = "(B)V", line = 120)
    public static final void method688(byte arg0) {
        class55.field860 = class111.field2018;
        class160.field2792 = class60.field929;
        class29.field493 = class1.field11;
        class279.field4696 = class128.field2322;
        class77.field1215 = class199.field3391;
        class20.field326 = class98.field1787;
        class186.field3199 = class291.field4907;
        class212.field3563 = class61.field947;
        class64.field998 = class213.field3572;
        class173.field2995 = class307.field5166;
        class317.field5340 = class259.field4307;
        class154.field2725 = class34.field553;
        class80.field1392 = class231.field3862;
        class259.field4319 = class228.field3801;
        class67.field1085 = class32.field526;
        class158.field2783 = class247.field4088;
        class216.field3605 = class17.field283;
        class89.field1591 = class127.field2309;
        class48.field771 = class311.field5235;
        class68.field1095 = class84.field1503;
        class277.field4647 = class127.field2304;
        class263.field4392 = class237.field3952;
        class73.field1160 = class70.field1128;
        client.field1896 = class317.field5346;
        class267.field4443 = class6.field52;
        class258.field4302 = class51.field822;
        class17.field288 = class72.field1143;
        class81.field1416 = class244.field4062;
        class23.field392 = class270.field4519;
        class77.field1206 = class279.field4700;
        class87.field1551 = class143.field2564;
        class9.field106 = class290.field4886;
        class162.field2830 = class289.field4865;
        class242.field4030 = class308.field5171;
        class315.field5325 = class292.field4918;
        class190.field3245 = class56.field880;
        class112.field2032 = class20.field328;
        class87.field1539 = class292.field4923;
        class92.field1627 = class110.field1989;
        class214.field3592 = class157.field2776;
        class98.field1781 = class301.field5055;
        if (arg0 > -39) {
            field1614 = (class143) null;
        }
        class163.field2888 = class205.field3459;
        class120.field2185 = class182.field3141;
        class81.field1414 = class7.field59;
        class260.field4329 = class244.field4060;
        class315.field5320 = class163.field2883;
        class268.field4474 = class154.field2726;
        class298.field4983 = class4.field30;
        class259.field4314 = class119.field2178;
        class71.field1136 = class81.field1403;
        class105.field1919 = class278.field4689;
        class22.field351 = class105.field1921;
        class261.field4365 = class102.field1866;
        class171.field2972 = class141.field2508;
        class307.field5167 = class116.field2108;
        class238.field3959 = class139.field2486;
        class42.field689 = class163.field2889;
        class289.field4883 = class181.field3122;
        class112.field2029 = class20.field328;
        class74.field1181 = class256.field4250;
        class157.field2773 = class165.field2925;
        class188.field3238 = class284.field4809;
        class223.field3732 = class142.field2521;
        class82.field1423 = class162.field2841;
        class53.field843 = class167.field2944;
        class157.field2772 = class218.field3639;
        class92.field1632 = class110.field1989;
        class56.field876 = class245.field4078;
        class12.field209 = class43.field715;
        class315.field5322 = class61.field938;
        class83.field1471 = class15.field235;
        class292.field4924 = class306.field5155;
        class251.field4198 = class278.field4681;
        client.field1907 = class180.field3084;
        class187.field3225 = class141.field2510;
        class255.field4224 = class172.field2978;
        class35.field566 = class230.field3843;
        class151.field2703 = class136.field2437;
        class10.field116 = class292.field4922;
        class77.field1207 = class306.field5149;
        class225.field3750 = class139.field2482;
        class235.field3934 = class203.field3434;
        class307.field5169 = class116.field2108;
        class74.field1179 = class311.field5223;
        class126.field2297 = class307.field5159;
        field1618++;
        class230.field3841 = class112.field2030;
        class119.field2177 = class307.field5158;
        class303.field5122 = class209.field3523;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(Ljava/awt/Component;B)V", line = 475)
    public static final void method689(Component arg0, byte arg1) {
        if (arg1 != 17) {
            return;
        }
        Method var2 = class28.field487;
        if (var2 != null) {
            try {
                var2.invoke(arg0, Boolean.FALSE);
            } catch (Throwable var4) {
            }
        }
        field1612++;
        arg0.addKeyListener(class237.field3946);
        arg0.addFocusListener(class237.field3946);
    }

    @OriginalMember(owner = "client!le", name = "d", descriptor = "(B)V", line = 513)
    public static final void method690(byte arg0) {
        if (arg0 != 20) {
            return;
        }
        field1611++;
        Container var1;
        if (class168.field2950 != null) {
            var1 = class168.field2950;
        } else if (class95.field1740 == null) {
            var1 = client.field1903.field469;
        } else {
            var1 = class95.field1740;
        }
        class194.field3273 = var1.getSize().width;
        class212.field3562 = var1.getSize().height;
        if (class95.field1740 == var1) {
            Insets var2 = class95.field1740.getInsets();
            class212.field3562 -= var2.top + var2.bottom;
            class194.field3273 -= var2.right + var2.left;
        }
        if (class251.method1754((byte) -126) >= 2) {
            class173.field3003 = 0;
            class110.field1999 = 0;
            class251.field4201 = class194.field3273;
            class252.field4205 = class212.field3562;
        } else {
            class173.field3003 = (class194.field3273 - 765) / 2;
            class252.field4205 = 503;
            class251.field4201 = 765;
            class110.field1999 = 0;
        }
        if (class117.field2159) {
            class117.method933(class251.field4201, class252.field4205);
        }
        class308.field5173.setSize(class251.field4201, class252.field4205);
        if (class95.field1740 == var1) {
            Insets var3 = class95.field1740.getInsets();
            class308.field5173.setLocation(var3.left + class173.field3003, class110.field1999 + var3.top);
        } else {
            class308.field5173.setLocation(class173.field3003, class110.field1999);
        }
        if (class265.field4412 != -1) {
            class162.method1284(true, -123);
        }
        class240.method1702(arg0 - 20);
    }

    @OriginalMember(owner = "client!le", name = "<init>", descriptor = "(II)V", line = 573)
    public class91(int arg0, int arg1) {
        this.field1615 = arg1;
        this.field1610 = arg0;
    }

    @OriginalMember(owner = "client!le", name = "e", descriptor = "(B)V", line = 583)
    public static void method691(byte arg0) {
        field1613 = null;
        field1614 = null;
        field1619 = null;
        if (arg0 != 79) {
            method687(69);
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IIIIZZI)V", line = 595)
    public static final void method692(int arg0, int arg1, int arg2, int arg3, boolean arg4, boolean arg5, int arg6) {
        field1608++;
        if (class165.field2928 == arg0 && class123.field2238 == arg3 && class245.field4080 == arg1 || class4.method19(-119)) {
            return;
        }
        class165.field2928 = arg0;
        class245.field4080 = arg1;
        class123.field2238 = arg3;
        if (class4.method19(-125)) {
            class245.field4080 = 0;
        }
        if (arg4) {
            class122.method984(28, 2047);
        } else {
            class122.method984(25, 2047);
        }
        class94.method706(class235.field3934, -114, arg5);
        int var7 = class178.field3052;
        int var8 = class258.field4294;
        class258.field4294 = arg3 * 8 - 48;
        class178.field3052 = (arg0 - 6) * 8;
        class64.field999 = class46.method331(class123.field2238 * 8, class165.field2928 * 8, 13862);
        int var9 = class258.field4294 - var8;
        int var10 = class178.field3052 - var7;
        int var11 = class178.field3052;
        class122.field2202 = null;
        int var12 = class258.field4294;
        if (arg4) {
            class31.field520 = 0;
            for (int var16 = 0; var16 < 32768; var16++) {
                class60 var17 = class204.field3446[var16];
                if (var17 != null) {
                    var17.field5013 -= var10 * 128;
                    var17.field5047 -= var9 * 128;
                    if (var17.field5013 >= 0 && var17.field5013 <= 13184 && var17.field5047 >= 0 && var17.field5047 <= 13184) {
                        for (int var18 = 0; var18 < 10; var18++) {
                            var17.field5050[var18] -= var10;
                            var17.field5034[var18] -= var9;
                        }
                        class278.field4674[class31.field520++] = var16;
                    } else {
                        class204.field3446[var16].field926 = null;
                        class204.field3446[var16] = null;
                    }
                }
            }
        } else {
            for (int var13 = 0; var13 < 32768; var13++) {
                class60 var14 = class204.field3446[var13];
                if (var14 != null) {
                    for (int var15 = 0; var15 < 10; var15++) {
                        var14.field5050[var15] -= var10;
                        var14.field5034[var15] -= var9;
                    }
                    var14.field5013 -= var10 * 128;
                    var14.field5047 -= var9 * 128;
                }
            }
        }
        for (int var19 = 0; var19 < 2048; var19++) {
            class39 var20 = class270.field4520[var19];
            if (var20 != null) {
                for (int var21 = 0; var21 < 10; var21++) {
                    var20.field5050[var21] -= var10;
                    var20.field5034[var21] -= var9;
                }
                var20.field5013 -= var10 * 128;
                var20.field5047 -= var9 * 128;
            }
        }
        class157.field2765 = arg1;
        class122.field2215.method288(arg2, arg6, -28150, false);
        byte var22 = 0;
        byte var23 = 1;
        byte var24 = 104;
        if (var10 < 0) {
            var23 = -1;
            var24 = -1;
            var22 = 103;
        }
        byte var25 = 0;
        byte var26 = 1;
        byte var27 = 104;
        if (var9 < 0) {
            var26 = -1;
            var25 = 103;
            var27 = -1;
        }
        for (int var28 = var22; var28 != var24; var28 += var23) {
            for (int var29 = var25; var29 != var27; var29 += var26) {
                int var30 = var9 + var29;
                int var31 = var28 + var10;
                for (int var32 = 0; var32 < 4; var32++) {
                    if (var31 >= 0 && var30 >= 0 && var31 < 104 && var30 < 104) {
                        class212.field3557[var32][var28][var29] = class212.field3557[var32][var31][var30];
                    } else {
                        class212.field3557[var32][var28][var29] = null;
                    }
                }
            }
        }
        for (class183 var33 = (class183) class10.field123.method169(-4); var33 != null; var33 = (class183) class10.field123.method165((byte) -101)) {
            var33.field3151 -= var9;
            var33.field3148 -= var10;
            if (var33.field3148 < 0 || var33.field3151 < 0 || var33.field3148 >= 104 || var33.field3151 >= 104) {
                var33.method1183(false);
            }
        }
        class255.field4233 = 0;
        if (arg4) {
            class162.field2878 -= var10;
            class260.field4323 -= var10;
            class27.field457 -= var9;
            class13.field212 -= var9;
        } else {
            class302.field5085 = 1;
        }
        if (class170.field2959 != 0) {
            class170.field2959 -= var10;
            class46.field727 -= var9;
        }
        if (class117.field2159 && arg4 && (Math.abs(var10) > 104 || Math.abs(var9) > 104)) {
            class245.method1729((byte) -111);
        }
        class279.field4693 = -1;
        class220.field3670.method171(-98);
        class291.field4899.method171(-120);
    }
}
