import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public class class250 extends Canvas {

    @OriginalMember(owner = "client!vg", name = "m", descriptor = "Ljava/awt/Component;")
    private Component field4341;

    @OriginalMember(owner = "client!vg", name = "g", descriptor = "[I")
    public static int[] field4335 = new int[64];

    @OriginalMember(owner = "client!vg", name = "f", descriptor = "[Lij;")
    public static class50[] field4334 = new class50[500];

    @OriginalMember(owner = "client!vg", name = "e", descriptor = "Lij;")
    public static class50 field4333 = class78.method578(122, "Abbrechen");

    @OriginalMember(owner = "client!vg", name = "n", descriptor = "Lij;")
    public static class50 field4342 = class78.method578(126, "::noclip");

    @OriginalMember(owner = "client!vg", name = "q", descriptor = "I")
    public static int field4345 = 0;

    @OriginalMember(owner = "client!vg", name = "l", descriptor = "Lij;")
    public static class50 field4340 = class78.method578(127, "Stufe)2");

    @OriginalMember(owner = "client!vg", name = "s", descriptor = "I")
    public static int field4347 = -1;

    @OriginalMember(owner = "client!vg", name = "h", descriptor = "F")
    public static float field4336;

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "I")
    public static int field4329;

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "I")
    public static int field4330;

    @OriginalMember(owner = "client!vg", name = "c", descriptor = "I")
    public static int field4331;

    @OriginalMember(owner = "client!vg", name = "j", descriptor = "I")
    public static int field4338;

    @OriginalMember(owner = "client!vg", name = "k", descriptor = "I")
    public static int field4339;

    @OriginalMember(owner = "client!vg", name = "o", descriptor = "I")
    public static int field4343;

    @OriginalMember(owner = "client!vg", name = "p", descriptor = "I")
    public static int field4344;

    @OriginalMember(owner = "client!vg", name = "r", descriptor = "I")
    public static int field4346;

    @OriginalMember(owner = "client!vg", name = "i", descriptor = "[Ljd;")
    public static class85[] field4337;

    @OriginalMember(owner = "client!vg", name = "d", descriptor = "[[[B")
    public static byte[][][] field4332;

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(II)V")
    public static final void method1695(int arg0, int arg1) {
        field4339++;
        if (arg0 < 0) {
            return;
        }
        int var2 = class41.field755[arg0];
        int var3 = class206.field3423[arg0];
        int var4 = class17.field379[arg0];
        if (var4 >= 2000) {
            var4 -= 2000;
        }
        long var5 = class215.field3551[arg0];
        int var7 = (int) class215.field3551[arg0];
        if (var4 == 51) {
            class220.field3702++;
            class190.field3141.method1598((byte) -127, 92);
            class190.field3141.method1446(-16, var3);
            class190.field3141.method1495(2, var2);
            class190.field3141.method1480(var7, (byte) -122);
            class121.field2131 = 0;
            class104.field1899 = class89.method698(var3, (byte) 94);
            class60.field1118 = var2;
        }
        if (var4 == 50) {
            class187 var8 = class71.field1370[var7];
            if (var8 != null) {
                class49.field880++;
                class26.method243(class239.field4067.field3980[0], false, 0, false, 1, var8.field3978[0], var8.field3980[0], class239.field4067.field3978[0], 0, 1, 2, 0);
                class237.field4011 = 0;
                class258.field4497 = class52.field950;
                class2.field34 = class56.field1000;
                class48.field861 = 2;
                class190.field3141.method1598((byte) -124, 102);
                class190.field3141.method1495(2, var7);
            }
        }
        if (var4 == 32) {
            class236.field3953++;
            boolean var9 = class26.method243(class239.field4067.field3980[0], false, 0, false, 0, var2, var3, class239.field4067.field3978[0], 0, 0, 2, 0);
            if (!var9) {
                class26.method243(class239.field4067.field3980[0], false, 0, false, 1, var2, var3, class239.field4067.field3978[0], 0, 1, 2, 0);
            }
            class2.field34 = class56.field1000;
            class237.field4011 = 0;
            class258.field4497 = class52.field950;
            class48.field861 = 2;
            class190.field3141.method1598((byte) -116, 199);
            class190.field3141.method1480(class254.field4394 + var3, (byte) -128);
            class190.field3141.method1480(var7, (byte) -117);
            class190.field3141.method1495(2, class61.field1124 + var2);
        }
        if (var4 == 31) {
            class131.field2296++;
            class190.field3141.method1598((byte) -128, 55);
            class190.field3141.method1446(115, var3);
            class190.field3141.method1480(var2, (byte) -126);
            class190.field3141.method1463((byte) -123, var7);
            class121.field2131 = 0;
            class104.field1899 = class89.method698(var3, (byte) 94);
            class60.field1118 = var2;
        }
        if (var4 == 20) {
            class60.field1092++;
            boolean var11 = class26.method243(class239.field4067.field3980[0], false, 0, false, 0, var2, var3, class239.field4067.field3978[0], 0, 0, 2, 0);
            if (!var11) {
                class26.method243(class239.field4067.field3980[0], false, 0, false, 1, var2, var3, class239.field4067.field3978[0], 0, 1, 2, 0);
            }
            class2.field34 = class56.field1000;
            class48.field861 = 2;
            class258.field4497 = class52.field950;
            class237.field4011 = 0;
            class190.field3141.method1598((byte) -105, 31);
            class190.field3141.method1446(110, class63.field1214);
            class190.field3141.method1494(class61.field1124 + var2, (byte) -24);
            class190.field3141.method1480(class231.field3883, (byte) -120);
            class190.field3141.method1494(var7, (byte) -107);
            class190.field3141.method1494(var3 + class254.field4394, (byte) -72);
        }
        if (var4 == 4) {
            class190.field3141.method1598((byte) -89, 192);
            class112.field1982++;
            class190.field3141.method1480(var2, (byte) -120);
            class190.field3141.method1470(var3, 1621200424);
            class190.field3141.method1463((byte) -115, var7);
            class121.field2131 = 0;
            class104.field1899 = class89.method698(var3, (byte) 94);
            class60.field1118 = var2;
        }
        if (var4 == 40) {
            class62.field1136++;
            class190.field3141.method1598((byte) -128, 112);
            class190.field3141.method1457(var3, -407803416);
            class190.field3141.method1494(var2, (byte) -48);
            class190.field3141.method1480(var7, (byte) -118);
            class121.field2131 = 0;
            class104.field1899 = class89.method698(var3, (byte) 94);
            class60.field1118 = var2;
        }
        if (var4 == 12) {
            class118.field2083++;
            class211.method1410(var2, -11, var3, var5);
            class190.field3141.method1598((byte) -114, 43);
            class190.field3141.method1463((byte) -112, class61.field1124 + var2);
            class190.field3141.method1494(Integer.MAX_VALUE & (int) (var5 >>> 32), (byte) -89);
            class190.field3141.method1494(class254.field4394 + var3, (byte) -104);
        }
        if (var4 == 15) {
            class223.field3757++;
            boolean var13 = class26.method243(class239.field4067.field3980[0], false, 0, false, 0, var2, var3, class239.field4067.field3978[0], 0, 0, 2, 0);
            if (!var13) {
                class26.method243(class239.field4067.field3980[0], false, 0, false, 1, var2, var3, class239.field4067.field3978[0], 0, 1, 2, 0);
            }
            class237.field4011 = 0;
            class258.field4497 = class52.field950;
            class2.field34 = class56.field1000;
            class48.field861 = 2;
            class190.field3141.method1598((byte) -106, 197);
            class190.field3141.method1480(var7, (byte) -119);
            class190.field3141.method1480(class254.field4394 + var3, (byte) -124);
            class190.field3141.method1463((byte) -114, class61.field1124 + var2);
        }
        if (var4 == 9) {
            class190.field3141.method1598((byte) -90, 32);
            class190.field3141.method1446(2, var3);
            class244.field4249++;
            class10 var15 = class89.method698(var3, (byte) 94);
            if (var15.field162 != null && var15.field162[0][0] == 5) {
                int var16 = var15.field162[0][1];
                if (class54.field968[var16] != var15.field211[0]) {
                    class54.field968[var16] = var15.field211[0];
                    class40.method308(var16, 0);
                }
            }
        }
        if (var4 == 1004) {
            class48.field861 = 2;
            class258.field4497 = class52.field950;
            class2.field34 = class56.field1000;
            class217.field3593++;
            class237.field4011 = 0;
            class190.field3141.method1598((byte) -102, 116);
            class190.field3141.method1495(2, var7);
        }
        if (var4 == 35) {
            class53 var17 = class41.field764[var7];
            if (var17 != null) {
                class26.method243(class239.field4067.field3980[0], false, 0, false, 1, var17.field3978[0], var17.field3980[0], class239.field4067.field3978[0], 0, 1, 2, 0);
                class221.field3716++;
                class48.field861 = 2;
                class258.field4497 = class52.field950;
                class237.field4011 = 0;
                class2.field34 = class56.field1000;
                class190.field3141.method1598((byte) -118, 52);
                class190.field3141.method1494(var7, (byte) -80);
            }
        }
        if (var4 == 14 || var4 == 1001) {
            class22.method164(-7958, var7, var3, var2, class36.field691[arg0]);
        }
        if (var4 == 26 && class211.method1410(var2, -11, var3, var5)) {
            class14.field324++;
            class190.field3141.method1598((byte) -92, 100);
            class190.field3141.method1463((byte) -125, class239.field4075);
            class190.field3141.method1463((byte) -123, class114.field2006);
            class190.field3141.method1470(class15.field353, 1621200424);
            class190.field3141.method1495(2, class254.field4394 + var3);
            class190.field3141.method1463((byte) -122, Integer.MAX_VALUE & (int) (var5 >>> 32));
            class190.field3141.method1480(var2 + class61.field1124, (byte) -118);
        }
        if (var4 == 29) {
            class116.method837(true);
        }
        if (var4 == 8) {
            class63.field1202++;
            boolean var18 = class26.method243(class239.field4067.field3980[0], false, 0, false, 0, var2, var3, class239.field4067.field3978[0], 0, 0, 2, 0);
            if (!var18) {
                class26.method243(class239.field4067.field3980[0], false, 0, false, 1, var2, var3, class239.field4067.field3978[0], 0, 1, 2, 0);
            }
            class48.field861 = 2;
            class237.field4011 = 0;
            class2.field34 = class56.field1000;
            class258.field4497 = class52.field950;
            class190.field3141.method1598((byte) -105, 80);
            class190.field3141.method1495(2, var3 + class254.field4394);
            class190.field3141.method1480(class61.field1124 + var2, (byte) -128);
            class190.field3141.method1463((byte) -126, var7);
        }
        if (var4 == 1005) {
            class10 var20 = class89.method698(var3, (byte) 94);
            if (var20 == null || var20.field152[var2] < 100000) {
                class217.field3593++;
                class190.field3141.method1598((byte) -96, 116);
                class190.field3141.method1495(2, var7);
            } else {
                class54.method431(class80.method589(new class50[] { class78.method579(var20.field152[var2], -26225), class140.field2445, class15.method111(var7, false).field4103 }, 28743), 0, 0, class245.field4271);
            }
            class121.field2131 = 0;
            class104.field1899 = class89.method698(var3, (byte) 94);
            class60.field1118 = var2;
        }
        if (var4 == 34) {
            class132.field2306++;
            class211.method1410(var2, -11, var3, var5);
            class190.field3141.method1598((byte) -100, 170);
            class190.field3141.method1463((byte) -112, Integer.MAX_VALUE & (int) (var5 >>> 32));
            class190.field3141.method1480(class61.field1124 + var2, (byte) -128);
            class190.field3141.method1495(2, class254.field4394 + var3);
        }
        if (var4 == 1006) {
            class139.field2417++;
            class211.method1410(var2, -11, var3, var5);
            class190.field3141.method1598((byte) -91, 135);
            class190.field3141.method1463((byte) -122, var2 + class61.field1124);
            class190.field3141.method1463((byte) -123, class254.field4394 + var3);
            class190.field3141.method1494((int) (var5 >>> 32) & Integer.MAX_VALUE, (byte) -14);
        }
        if (var4 == 25 && class211.method1410(var2, -11, var3, var5)) {
            class159.field2734++;
            class190.field3141.method1598((byte) -124, 179);
            class190.field3141.method1463((byte) -119, Integer.MAX_VALUE & (int) (var5 >>> 32));
            class190.field3141.method1480(class254.field4394 + var3, (byte) -125);
            class190.field3141.method1480(class231.field3883, (byte) -118);
            class190.field3141.method1480(class61.field1124 + var2, (byte) -116);
            class190.field3141.method1446(-8, class63.field1214);
        }
        if (var4 == 2) {
            class28.field595++;
            boolean var21 = class26.method243(class239.field4067.field3980[0], false, 0, false, 0, var2, var3, class239.field4067.field3978[0], 0, 0, 2, 0);
            if (!var21) {
                class26.method243(class239.field4067.field3980[0], false, 0, false, 1, var2, var3, class239.field4067.field3978[0], 0, 1, 2, 0);
            }
            class2.field34 = class56.field1000;
            class258.field4497 = class52.field950;
            class237.field4011 = 0;
            class48.field861 = 2;
            class190.field3141.method1598((byte) -90, 67);
            class190.field3141.method1495(2, var7);
            class190.field3141.method1463((byte) -115, var3 + class254.field4394);
            class190.field3141.method1463((byte) -111, class239.field4075);
            class190.field3141.method1457(class15.field353, -407803416);
            class190.field3141.method1494(class114.field2006, (byte) -117);
            class190.field3141.method1494(class61.field1124 + var2, (byte) -29);
        }
        if (var4 == 38) {
            class61.method472(false);
            class10 var23 = class89.method698(var3, (byte) 94);
            class114.field2006 = var7;
            class239.field4075 = var2;
            class15.field353 = var3;
            class114.field1992 = 1;
            class140.method979((byte) 37, var23);
            class19.field407 = class80.method589(new class50[] { class61.field1123, class15.method111(var7, false).field4103, class191.field3168 }, 28743);
            if (class19.field407 == null) {
                class19.field407 = class184.field3025;
            }
            return;
        }
        if (var4 == 48) {
            class187 var24 = class71.field1370[var7];
            if (var24 != null) {
                class65.field1230++;
                class26.method243(class239.field4067.field3980[0], false, 0, false, 1, var24.field3978[0], var24.field3980[0], class239.field4067.field3978[0], 0, 1, 2, 0);
                class237.field4011 = 0;
                class48.field861 = 2;
                class2.field34 = class56.field1000;
                class258.field4497 = class52.field950;
                class190.field3141.method1598((byte) -97, 36);
                class190.field3141.method1494(var7, (byte) -52);
            }
        }
        if (var4 == 22) {
            class96.field1790++;
            boolean var25 = class26.method243(class239.field4067.field3980[0], false, 0, false, 0, var2, var3, class239.field4067.field3978[0], 0, 0, 2, 0);
            if (!var25) {
                class26.method243(class239.field4067.field3980[0], false, 0, false, 1, var2, var3, class239.field4067.field3978[0], 0, 1, 2, 0);
            }
            class237.field4011 = 0;
            class258.field4497 = class52.field950;
            class2.field34 = class56.field1000;
            class48.field861 = 2;
            class190.field3141.method1598((byte) -91, 150);
            class190.field3141.method1463((byte) -116, var2 + class61.field1124);
            class190.field3141.method1480(class254.field4394 + var3, (byte) -126);
            class190.field3141.method1480(var7, (byte) -125);
        }
        if (var4 == 41) {
            class91.field1726++;
            class190.field3141.method1598((byte) -114, 69);
            class190.field3141.method1495(2, var7);
            class190.field3141.method1463((byte) -114, var2);
            class190.field3141.method1446(96, var3);
            class121.field2131 = 0;
            class104.field1899 = class89.method698(var3, (byte) 94);
            class60.field1118 = var2;
        }
        if (var4 == 21) {
            class60.field1090++;
            class190.field3141.method1598((byte) -107, 114);
            class190.field3141.method1446(119, var3);
            class190.field3141.method1495(2, var7);
            class190.field3141.method1494(var2, (byte) -106);
            class121.field2131 = 0;
            class104.field1899 = class89.method698(var3, (byte) 94);
            class60.field1118 = var2;
        }
        if (var4 == 3) {
            class95.field1776++;
            boolean var27 = class26.method243(class239.field4067.field3980[0], false, 0, false, 0, var2, var3, class239.field4067.field3978[0], 0, 0, 2, 0);
            if (!var27) {
                class26.method243(class239.field4067.field3980[0], false, 0, false, 1, var2, var3, class239.field4067.field3978[0], 0, 1, 2, 0);
            }
            class48.field861 = 2;
            class2.field34 = class56.field1000;
            class258.field4497 = class52.field950;
            class237.field4011 = 0;
            class190.field3141.method1598((byte) -92, 106);
            class190.field3141.method1495(2, class61.field1124 + var2);
            class190.field3141.method1463((byte) -126, class254.field4394 + var3);
            class190.field3141.method1480(var7, (byte) -124);
        }
        if (var4 == 43) {
            class53 var29 = class41.field764[var7];
            if (var29 != null) {
                class26.method243(class239.field4067.field3980[0], false, 0, false, 1, var29.field3978[0], var29.field3980[0], class239.field4067.field3978[0], 0, 1, 2, 0);
                class258.field4497 = class52.field950;
                class153.field2680++;
                class48.field861 = 2;
                class237.field4011 = 0;
                class2.field34 = class56.field1000;
                class190.field3141.method1598((byte) -127, 26);
                class190.field3141.method1480(var7, (byte) -126);
            }
        }
        if (var4 == 5) {
            class53 var30 = class41.field764[var7];
            if (var30 != null) {
                class33.field647++;
                class26.method243(class239.field4067.field3980[0], false, 0, false, 1, var30.field3978[0], var30.field3980[0], class239.field4067.field3978[0], 0, 1, 2, 0);
                class258.field4497 = class52.field950;
                class2.field34 = class56.field1000;
                class48.field861 = 2;
                class237.field4011 = 0;
                class190.field3141.method1598((byte) -110, 24);
                class190.field3141.method1445(class15.field353, (byte) -79);
                class190.field3141.method1480(class114.field2006, (byte) -126);
                class190.field3141.method1480(class239.field4075, (byte) -122);
                class190.field3141.method1480(var7, (byte) -128);
            }
        }
        if (var4 == 37) {
            class60.method465(class201.field3312, var2, var3);
        }
        if (var4 == 28) {
            class10 var31 = class62.method475(var2, var3, -1);
            if (var31 != null) {
                class61.method472(false);
                class146.method1029(var3, class164.method1145((byte) 93, client.method605(var31)), var2, 5253);
                class114.field1992 = 0;
                class41.field766 = class190.method1281(var31, -79);
                if (class41.field766 == null) {
                    class41.field766 = class73.field1372;
                }
                if (var31.field222) {
                    class18.field396 = class80.method589(new class50[] { var31.field181, class191.field3168 }, 28743);
                    return;
                }
                class18.field396 = class80.method589(new class50[] { class127.field2227, var31.field285, class191.field3168 }, 28743);
            }
            return;
        }
        if (var4 == 39) {
            class190.field3141.method1598((byte) -116, 207);
            class122.field2141++;
            class190.field3141.method1446(97, class15.field353);
            class190.field3141.method1480(var7, (byte) -119);
            class190.field3141.method1494(class239.field4075, (byte) -104);
            class190.field3141.method1494(var2, (byte) -28);
            class190.field3141.method1463((byte) -114, class114.field2006);
            class190.field3141.method1470(var3, 1621200424);
            class121.field2131 = 0;
            class104.field1899 = class89.method698(var3, (byte) 94);
            class60.field1118 = var2;
        }
        if (var4 == 49) {
            class187 var32 = class71.field1370[var7];
            if (var32 != null) {
                class240.field4135++;
                class26.method243(class239.field4067.field3980[0], false, 0, false, 1, var32.field3978[0], var32.field3980[0], class239.field4067.field3978[0], 0, 1, 2, 0);
                class258.field4497 = class52.field950;
                class237.field4011 = 0;
                class48.field861 = 2;
                class2.field34 = class56.field1000;
                class190.field3141.method1598((byte) -90, 8);
                class190.field3141.method1495(2, var7);
            }
        }
        if (var4 == 10) {
            class187 var33 = class71.field1370[var7];
            if (var33 != null) {
                class26.method243(class239.field4067.field3980[0], false, 0, false, 1, var33.field3978[0], var33.field3980[0], class239.field4067.field3978[0], 0, 1, 2, 0);
                class237.field4011 = 0;
                class70.field1349++;
                class258.field4497 = class52.field950;
                class48.field861 = 2;
                class2.field34 = class56.field1000;
                class190.field3141.method1598((byte) -91, 41);
                class190.field3141.method1463((byte) -116, var7);
            }
        }
        if (var4 == 57) {
            class14.field326++;
            class190.field3141.method1598((byte) -123, 147);
            class190.field3141.method1463((byte) -118, var2);
            class190.field3141.method1470(var3, 1621200424);
            class190.field3141.method1480(class231.field3883, (byte) -116);
            class190.field3141.method1495(2, var7);
            class190.field3141.method1457(class63.field1214, -407803416);
            class121.field2131 = 0;
            class104.field1899 = class89.method698(var3, (byte) 94);
            class60.field1118 = var2;
        }
        if (var4 == 47) {
            class190.field3141.method1598((byte) -102, 23);
            class190.field3141.method1494(var2, (byte) -83);
            class190.field3141.method1445(var3, (byte) -71);
            class190.field3141.method1463((byte) -119, var7);
            class161.field2763++;
            class121.field2131 = 0;
            class104.field1899 = class89.method698(var3, (byte) 94);
            class60.field1118 = var2;
        }
        if (var4 == 18) {
            class53 var34 = class41.field764[var7];
            if (var34 != null) {
                class26.method243(class239.field4067.field3980[0], false, 0, false, 1, var34.field3978[0], var34.field3980[0], class239.field4067.field3978[0], 0, 1, 2, 0);
                class237.field4011 = 0;
                class258.field4497 = class52.field950;
                class2.field34 = class56.field1000;
                class48.field861 = 2;
                class190.field3141.method1598((byte) -119, 82);
                class190.field3141.method1463((byte) -119, class231.field3883);
                class124.field2180++;
                class190.field3141.method1446(-55, class63.field1214);
                class190.field3141.method1463((byte) -120, var7);
            }
        }
        if (var4 == 1007) {
            class258.field4497 = class52.field950;
            class48.field861 = 2;
            class237.field4011 = 0;
            class2.field34 = class56.field1000;
            class53 var35 = class41.field764[var7];
            if (var35 != null) {
                class62 var36 = var35.field959;
                if (var36.field1160 != null) {
                    var36 = var36.method486((byte) -120);
                }
                if (var36 != null) {
                    class190.field3141.method1598((byte) -93, 139);
                    class190.field3141.method1494(var36.field1142, (byte) -35);
                    class236.field3946++;
                }
            }
        }
        if (var4 == 6) {
            class187 var37 = class71.field1370[var7];
            if (var37 != null) {
                class190.field3146++;
                class26.method243(class239.field4067.field3980[0], false, 0, false, 1, var37.field3978[0], var37.field3980[0], class239.field4067.field3978[0], 0, 1, 2, 0);
                class2.field34 = class56.field1000;
                class48.field861 = 2;
                class258.field4497 = class52.field950;
                class237.field4011 = 0;
                class190.field3141.method1598((byte) -97, 86);
                class190.field3141.method1494(var7, (byte) -23);
            }
        }
        if (var4 == 23 && class220.field3676 == null) {
            class243.method1657(var2, var3, 115);
            class220.field3676 = class62.method475(var2, var3, -1);
            class140.method979((byte) 64, class220.field3676);
        }
        if (var4 == 36) {
            class207.field3436++;
            class190.field3141.method1598((byte) -87, 252);
            class190.field3141.method1495(2, var7);
            class190.field3141.method1446(-82, var3);
            class190.field3141.method1480(var2, (byte) -124);
            class121.field2131 = 0;
            class104.field1899 = class89.method698(var3, (byte) 94);
            class60.field1118 = var2;
        }
        if (var4 == 46) {
            class187 var38 = class71.field1370[var7];
            if (var38 != null) {
                class122.field2152++;
                class26.method243(class239.field4067.field3980[0], false, 0, false, 1, var38.field3978[0], var38.field3980[0], class239.field4067.field3978[0], 0, 1, 2, 0);
                class237.field4011 = 0;
                class2.field34 = class56.field1000;
                class258.field4497 = class52.field950;
                class48.field861 = 2;
                class190.field3141.method1598((byte) -120, 203);
                class190.field3141.method1495(2, class231.field3883);
                class190.field3141.method1494(var7, (byte) -8);
                class190.field3141.method1446(104, class63.field1214);
            }
        }
        if (var4 == 58) {
            class167.field2822++;
            class211.method1410(var2, -11, var3, var5);
            class190.field3141.method1598((byte) -89, 229);
            class190.field3141.method1463((byte) -123, class254.field4394 + var3);
            class190.field3141.method1495(2, class61.field1124 + var2);
            class190.field3141.method1495(2, Integer.MAX_VALUE & (int) (var5 >>> 32));
        }
        if (var4 == 42) {
            class10 var39 = class89.method698(var3, (byte) 94);
            boolean var40 = true;
            if (var39.field259 > 0) {
                var40 = class155.method1092((byte) -59, var39);
            }
            if (var40) {
                class190.field3141.method1598((byte) -100, 32);
                class244.field4249++;
                class190.field3141.method1446(-51, var3);
            }
        }
        if (var4 == 19) {
            class190.field3141.method1598((byte) -107, 247);
            class190.field3141.method1480(var2, (byte) -126);
            class190.field3141.method1463((byte) -115, var7);
            class190.field3141.method1445(var3, (byte) -78);
            class223.field3748++;
            class121.field2131 = 0;
            class104.field1899 = class89.method698(var3, (byte) 94);
            class60.field1118 = var2;
        }
        if (var4 == 33) {
            class172.field2856++;
            class190.field3141.method1598((byte) -113, 255);
            class190.field3141.method1446(124, var3);
            class190.field3141.method1495(2, var7);
            class190.field3141.method1494(var2, (byte) -125);
            class121.field2131 = 0;
            class104.field1899 = class89.method698(var3, (byte) 94);
            class60.field1118 = var2;
        }
        if (var4 == 30) {
            class187 var41 = class71.field1370[var7];
            if (var41 != null) {
                class82.field1481++;
                class26.method243(class239.field4067.field3980[0], false, 0, false, 1, var41.field3978[0], var41.field3980[0], class239.field4067.field3978[0], 0, 1, 2, 0);
                class48.field861 = 2;
                class2.field34 = class56.field1000;
                class237.field4011 = 0;
                class258.field4497 = class52.field950;
                class190.field3141.method1598((byte) -126, 218);
                class190.field3141.method1495(2, class114.field2006);
                class190.field3141.method1470(class15.field353, 1621200424);
                class190.field3141.method1494(var7, (byte) -26);
                class190.field3141.method1480(class239.field4075, (byte) -125);
            }
        }
        if (var4 == 17) {
            class43.field784++;
            class211.method1410(var2, -11, var3, var5);
            class190.field3141.method1598((byte) -120, 70);
            class190.field3141.method1463((byte) -125, (int) (var5 >>> 32) & Integer.MAX_VALUE);
            class190.field3141.method1463((byte) -112, class61.field1124 + var2);
            class190.field3141.method1463((byte) -113, class254.field4394 + var3);
        }
        if (var4 == 1003) {
            class2.field34 = class56.field1000;
            class258.field4497 = class52.field950;
            class70.field1334++;
            class237.field4011 = 0;
            class48.field861 = 2;
            class190.field3141.method1598((byte) -119, 140);
            class190.field3141.method1494(var7, (byte) -109);
        }
        if (var4 == 11) {
            class187 var42 = class71.field1370[var7];
            if (var42 != null) {
                class26.method243(class239.field4067.field3980[0], false, 0, false, 1, var42.field3978[0], var42.field3980[0], class239.field4067.field3978[0], 0, 1, 2, 0);
                class231.field3875++;
                class258.field4497 = class52.field950;
                class2.field34 = class56.field1000;
                class237.field4011 = 0;
                class48.field861 = 2;
                class190.field3141.method1598((byte) -106, 21);
                class190.field3141.method1494(var7, (byte) -100);
            }
        }
        if (var4 == 45) {
            class53 var43 = class41.field764[var7];
            if (var43 != null) {
                class238.field4038++;
                class26.method243(class239.field4067.field3980[0], false, 0, false, 1, var43.field3978[0], var43.field3980[0], class239.field4067.field3978[0], 0, 1, 2, 0);
                class258.field4497 = class52.field950;
                class2.field34 = class56.field1000;
                class48.field861 = 2;
                class237.field4011 = 0;
                class190.field3141.method1598((byte) -96, 125);
                class190.field3141.method1463((byte) -127, var7);
            }
        }
        if (var4 == 44) {
            class53 var44 = class41.field764[var7];
            if (var44 != null) {
                class26.field551++;
                class26.method243(class239.field4067.field3980[0], false, 0, false, 1, var44.field3978[0], var44.field3980[0], class239.field4067.field3978[0], 0, 1, 2, 0);
                class2.field34 = class56.field1000;
                class237.field4011 = 0;
                class48.field861 = 2;
                class258.field4497 = class52.field950;
                class190.field3141.method1598((byte) -98, 230);
                class190.field3141.method1495(2, var7);
            }
        }
        if (var4 == 16) {
            class53 var45 = class41.field764[var7];
            if (var45 != null) {
                class120.field2119++;
                class26.method243(class239.field4067.field3980[0], false, 0, false, 1, var45.field3978[0], var45.field3980[0], class239.field4067.field3978[0], 0, 1, 2, 0);
                class258.field4497 = class52.field950;
                class2.field34 = class56.field1000;
                class48.field861 = 2;
                class237.field4011 = 0;
                class190.field3141.method1598((byte) -108, 66);
                class190.field3141.method1494(var7, (byte) -48);
            }
        }
        if (var4 == 7) {
            class187 var46 = class71.field1370[var7];
            if (var46 != null) {
                class26.method243(class239.field4067.field3980[0], false, 0, false, 1, var46.field3978[0], var46.field3980[0], class239.field4067.field3978[0], 0, 1, 2, 0);
                class237.field4011 = 0;
                class2.field34 = class56.field1000;
                class183.field3016++;
                class258.field4497 = class52.field950;
                class48.field861 = 2;
                class190.field3141.method1598((byte) -117, 2);
                class190.field3141.method1480(var7, (byte) -121);
            }
        }
        if (var4 == 24) {
            class187 var47 = class71.field1370[var7];
            if (var47 != null) {
                class142.field2486++;
                class26.method243(class239.field4067.field3980[0], false, 0, false, 1, var47.field3978[0], var47.field3980[0], class239.field4067.field3978[0], 0, 1, 2, 0);
                class237.field4011 = 0;
                class2.field34 = class56.field1000;
                class258.field4497 = class52.field950;
                class48.field861 = 2;
                class190.field3141.method1598((byte) -102, 113);
                class190.field3141.method1495(2, var7);
            }
        }
        if (var4 == 13) {
            class244.field4249++;
            class190.field3141.method1598((byte) -119, 32);
            class190.field3141.method1446(113, var3);
            class10 var48 = class89.method698(var3, (byte) 94);
            if (var48.field162 != null && var48.field162[0][0] == 5) {
                int var49 = var48.field162[0][1];
                class54.field968[var49] = 1 - class54.field968[var49];
                class40.method308(var49, 0);
            }
        }
        if (var4 == 1) {
            class134.field2337++;
            class190.field3141.method1598((byte) -97, 206);
            class190.field3141.method1495(2, var2);
            class190.field3141.method1495(2, class231.field3883);
            class190.field3141.method1446(-4, var3);
            class190.field3141.method1457(class63.field1214, -407803416);
        }
        if (arg1 >= -2) {
            field4332 = null;
        }
        if (class114.field1992 != 0) {
            class114.field1992 = 0;
            class140.method979((byte) 109, class89.method698(class15.field353, (byte) 94));
        }
        if (class188.field3116) {
            class61.method472(false);
        }
        if (class104.field1899 != null && class121.field2131 == 0) {
            class140.method979((byte) 47, class104.field1899);
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(ILwd;)V")
    public static final void method1696(int arg0, class217 arg1) {
        if (arg0 > -116) {
            return;
        }
        field4344++;
        if (arg1.field3633.length - arg1.field3581 < 1) {
            return;
        }
        int var2 = arg1.method1487(255);
        if (var2 < 0 || var2 > 2) {
            return;
        }
        byte var3;
        if (var2 == 2) {
            var3 = 22;
        } else if (var2 == 1) {
            var3 = 23;
        } else {
            var3 = 19;
        }
        if (arg1.field3633.length - arg1.field3581 < var3) {
            return;
        }
        class99.field1828 = arg1.method1487(255);
        if (class99.field1828 < 1) {
            class99.field1828 = 1;
        } else if (class99.field1828 > 4) {
            class99.field1828 = 4;
        }
        class2.method11(arg1.method1487(255) == 1, (byte) -114);
        class193.field3211 = arg1.method1487(255) == 1;
        class172.field2878 = arg1.method1487(255) == 1;
        class21.field459 = arg1.method1487(255) == 1;
        class44.field808 = arg1.method1487(255) == 1;
        class56.field998 = arg1.method1487(255) == 1;
        class146.field2530 = arg1.method1487(255) == 1;
        class76.field1440 = arg1.method1487(255) == 1;
        class83.field1556 = arg1.method1487(255);
        if (class83.field1556 > 2) {
            class83.field1556 = 2;
        }
        if (var2 >= 2) {
            client.field1525 = arg1.method1487(255) == 1;
        } else {
            client.field1525 = arg1.method1487(255) == 1;
            arg1.method1487(255);
        }
        class70.field1344 = arg1.method1487(255) == 1;
        class126.field2210 = arg1.method1487(255) == 1;
        class170.field2841 = arg1.method1487(255);
        if (class170.field2841 > 2) {
            class170.field2841 = 2;
        }
        class5.field68 = arg1.method1487(255) == 1;
        class196.field3249 = arg1.method1487(255);
        if (class196.field3249 > 127) {
            class196.field3249 = 127;
        }
        class66.field1260 = arg1.method1487(255);
        class203.field3379 = arg1.method1487(255);
        if (class203.field3379 > 127) {
            class203.field3379 = 127;
        }
        if (var2 >= 1) {
            class241.field4146 = arg1.method1441(-46);
            class87.field1682 = arg1.method1441(-11);
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(IIIIIBIIII)V")
    public static final void method1697(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg7 == arg9 && arg2 == arg6 && arg1 == arg3 && arg0 == arg8) {
            class245.method1670(arg7, arg8, arg4, arg2, arg3, -80);
        } else {
            int var10 = arg7;
            int var11 = arg7 * 3;
            int var12 = arg9 * 3;
            int var13 = arg6 * 3;
            int var14 = arg2 * 3;
            int var15 = arg2;
            int var16 = arg0 * 3;
            int var17 = arg1 * 3;
            int var18 = var11 + var17 - var12 - var12;
            int var19 = arg3 + var12 - arg7 - var17;
            int var20 = arg8 + var13 - var16 - arg2;
            int var21 = var16 + var14 - (var13 + var13);
            int var22 = var13 - var14;
            int var23 = var12 - var11;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var19 * var26;
                int var28 = var20 * var26;
                int var29 = var18 * var25;
                int var30 = var21 * var25;
                int var31 = var22 * var24;
                int var32 = var23 * var24;
                int var33 = (var29 + var32 + var27 >> 12) + arg7;
                int var34 = (var30 + var31 + var28 >> 12) + arg2;
                class245.method1670(var10, var34, arg4, var15, var33, 86);
                var10 = var33;
                var15 = var34;
            }
        }
        field4338++;
        if (arg5 <= 112) {
            method1696(99, (class217) null);
        }
    }

    @OriginalMember(owner = "client!vg", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class250(Component arg0) {
        this.field4341 = arg0;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(B)V")
    public static void method1698(byte arg0) {
        field4340 = null;
        int var1 = 11 / ((arg0 + 20) / 62);
        field4335 = null;
        field4333 = null;
        field4337 = null;
        field4342 = null;
        field4334 = null;
        field4332 = null;
    }

    @OriginalMember(owner = "client!vg", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.field4341.update(arg0);
        field4329++;
    }

    @OriginalMember(owner = "client!vg", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        this.field4341.paint(arg0);
        field4343++;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(ZLmi;Lda;Lda;)V")
    public static final void method1699(boolean arg0, class30 arg1, class22 arg2, class22 arg3) {
        field4330++;
        class231.field3866 = arg3;
        if (!arg0) {
            method1699(false, (class30) null, (class22) null, (class22) null);
        }
        class21.field430 = arg2;
        class96.field1793 = arg1;
    }
}
