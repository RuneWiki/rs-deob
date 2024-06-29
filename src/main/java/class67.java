import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public class class67 {

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "Lda;")
    public static class275 field1096 = class255.method1672(109, " )2>");

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "Lda;")
    public static class275 field1097 = class255.method1672(112, "");

    @OriginalMember(owner = "client!pa", name = "d", descriptor = "Lda;")
    public static class275 field1098 = class255.method1672(94, "Nehmen");

    @OriginalMember(owner = "client!pa", name = "e", descriptor = "[S")
    public static short[] field1099 = new short[] { 58, 44, 33, 7, 16, 51, 28, 42 };

    @OriginalMember(owner = "client!pa", name = "h", descriptor = "I")
    public static int field1102 = 0;

    @OriginalMember(owner = "client!pa", name = "f", descriptor = "I")
    public static int field1100;

    @OriginalMember(owner = "client!pa", name = "i", descriptor = "I")
    public static int field1103;

    @OriginalMember(owner = "client!pa", name = "j", descriptor = "I")
    public static int field1104;

    @OriginalMember(owner = "client!pa", name = "k", descriptor = "I")
    public static int field1105;

    @OriginalMember(owner = "client!pa", name = "l", descriptor = "I")
    public static int field1106;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "Lwb;")
    public static class179 field1095;

    @OriginalMember(owner = "client!pa", name = "g", descriptor = "[[B")
    public static byte[][] field1101;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(II)V")
    public static final void method450(int arg0, int arg1) {
        field1104++;
        if (arg1 < 0) {
            return;
        }
        int var2 = class161.field2820[arg1];
        int var3 = class137.field2400[arg1];
        int var4 = class13.field196[arg1];
        if (var3 >= 2000) {
            var3 -= 2000;
        }
        int var5 = (int) class13.field200[arg1];
        long var6 = class13.field200[arg1];
        if (var3 == 59) {
            class161.field2821++;
            boolean var8 = method453(0, 0, 0, class66.field1094.field1752[0], var4, 0, -12782, 0, 2, class66.field1094.field1722[0], false, var2);
            if (!var8) {
                method453(1, 0, 0, class66.field1094.field1752[0], var4, 1, -12782, 0, 2, class66.field1094.field1722[0], false, var2);
            }
            class94.field1611 = 0;
            class96.field1640 = class162.field2834;
            class125.field2235 = 2;
            class141.field2491 = class185.field3174;
            class149.field2597.method526((byte) -56, 79);
            class149.field2597.method602(var5, false);
            class149.field2597.method582(class16.field237 + var2, true);
            class149.field2597.method606(2102840648, class234.field4083 + var4);
        }
        if (var3 == 10) {
            class165 var10 = class31.field478[var5];
            if (var10 != null) {
                class39.field656++;
                method453(1, 0, 0, class66.field1094.field1752[0], var10.field1722[0], 1, -12782, 0, 2, class66.field1094.field1722[0], false, var10.field1752[0]);
                class141.field2491 = class185.field3174;
                class125.field2235 = 2;
                class94.field1611 = 0;
                class96.field1640 = class162.field2834;
                class149.field2597.method526((byte) -60, 101);
                class149.field2597.method606(2102840648, var5);
            }
        }
        if (var3 == 12 && class61.method386(var2, var4, true, var6)) {
            class160.field2805++;
            class149.field2597.method526((byte) -49, 156);
            class149.field2597.method600(class16.field237 + var2, (byte) 119);
            class149.field2597.method602(class97.field1646, false);
            class149.field2597.method606(2102840648, class234.field4083 + var4);
            class149.field2597.method613((byte) -17, class156.field2748);
            class149.field2597.method600((int) (var6 >>> 32) & Integer.MAX_VALUE, (byte) 57);
        }
        if (var3 == 46) {
            class170.field2969++;
            class61.method386(var2, var4, true, var6);
            class149.field2597.method526((byte) -40, 237);
            class149.field2597.method582(var2 + class16.field237, true);
            class149.field2597.method582(Integer.MAX_VALUE & (int) (var6 >>> 32), true);
            class149.field2597.method582(class234.field4083 + var4, true);
        }
        if (var3 == 48) {
            class165 var11 = class31.field478[var5];
            if (var11 != null) {
                class110.field1948++;
                method453(1, 0, 0, class66.field1094.field1752[0], var11.field1722[0], 1, -12782, 0, 2, class66.field1094.field1722[0], false, var11.field1752[0]);
                class96.field1640 = class162.field2834;
                class141.field2491 = class185.field3174;
                class94.field1611 = 0;
                class125.field2235 = 2;
                class149.field2597.method526((byte) -71, 19);
                class149.field2597.method606(2102840648, var5);
            }
        }
        if (var3 == 8) {
            class229 var12 = class182.method1219((byte) 114, var4, var2);
            if (var12 != null) {
                class29.method172(-104);
                class48.method307(-1, var2, class73.method483((byte) -103, client.method635(var12)), var4);
                class190.field3272 = 0;
                class103.field1715 = class244.method1592(95, var12);
                if (class103.field1715 == null) {
                    class103.field1715 = class65.field1073;
                }
                if (!var12.field3884) {
                    class19.field266 = class197.method1291(new class275[] { class89.field1506, var12.field3967, class230.field4032 }, -30025);
                    return;
                }
                class19.field266 = class197.method1291(new class275[] { var12.field4005, class230.field4032 }, -30025);
            }
            return;
        }
        if (var3 == 21) {
            class54.field920++;
            class149.field2597.method526((byte) -121, 187);
            class149.field2597.method606(2102840648, var5);
            class149.field2597.method565(var4, -4);
            class149.field2597.method606(2102840648, var2);
            client.field1485 = 0;
            class229.field3904 = class261.method1709(var4, -95);
            class145.field2544 = var2;
        }
        if (var3 == 29) {
            class19.method99(class159.field2790, var2, var4);
        }
        if (var3 == 13) {
            class248.field4367 = true;
            class19.method99(class159.field2790, var2, var4);
        }
        if (var3 == 20) {
            class139.field2437++;
            boolean var13 = method453(0, 0, 0, class66.field1094.field1752[0], var4, 0, -12782, 0, 2, class66.field1094.field1722[0], false, var2);
            if (!var13) {
                method453(1, 0, 0, class66.field1094.field1752[0], var4, 1, -12782, 0, 2, class66.field1094.field1722[0], false, var2);
            }
            class96.field1640 = class162.field2834;
            class141.field2491 = class185.field3174;
            class94.field1611 = 0;
            class125.field2235 = 2;
            class149.field2597.method526((byte) -119, 106);
            class149.field2597.method600(var5, (byte) 93);
            class149.field2597.method600(class16.field237 + var2, (byte) 90);
            class149.field2597.method602(class234.field4083 + var4, false);
        }
        if (var3 == 15) {
            class255.field4506++;
            class61.method386(var2, var4, true, var6);
            class149.field2597.method526((byte) -63, 12);
            class149.field2597.method606(2102840648, Integer.MAX_VALUE & (int) (var6 >>> 32));
            class149.field2597.method600(class16.field237 + var2, (byte) 19);
            class149.field2597.method600(class234.field4083 + var4, (byte) 101);
        }
        if (var3 == 30 && class61.method386(var2, var4, true, var6)) {
            class193.field3322++;
            class149.field2597.method526((byte) -70, 98);
            class149.field2597.method565(class156.field2750, -4);
            class149.field2597.method606(2102840648, class169.field2937);
            class149.field2597.method600(Integer.MAX_VALUE & (int) (var6 >>> 32), (byte) 28);
            class149.field2597.method606(2102840648, class16.field237 + var2);
            class149.field2597.method602(class234.field4083 + var4, false);
            class149.field2597.method606(2102840648, class4.field61);
        }
        if (var3 == 24) {
            class149.field2597.method526((byte) -76, 131);
            class149.field2597.method588(var4, -68);
            class109.field1905++;
            class149.field2597.method588(class156.field2750, -67);
            class149.field2597.method602(class169.field2937, false);
            class149.field2597.method582(var2, true);
            class149.field2597.method600(class4.field61, (byte) 99);
            class149.field2597.method606(2102840648, var5);
            client.field1485 = 0;
            class229.field3904 = class261.method1709(var4, -90);
            class145.field2544 = var2;
        }
        if (var3 == 47) {
            class229 var15 = class261.method1709(var4, -104);
            boolean var16 = true;
            if (var15.field3886 > 0) {
                var16 = class108.method799((byte) 9, var15);
            }
            if (var16) {
                class149.field2597.method526((byte) -127, 87);
                class35.field571++;
                class149.field2597.method586(-85, var4);
            }
        }
        if (var3 == 39) {
            class112.method819((byte) -107);
        }
        if (var3 == 9) {
            class271.field4709++;
            class149.field2597.method526((byte) -44, 83);
            class149.field2597.method613((byte) -76, var4);
            class149.field2597.method606(2102840648, var2);
            class149.field2597.method606(2102840648, var5);
            client.field1485 = 0;
            class229.field3904 = class261.method1709(var4, -102);
            class145.field2544 = var2;
        }
        if (var3 == 6) {
            class85.field1391++;
            boolean var17 = method453(0, 0, 0, class66.field1094.field1752[0], var4, 0, -12782, 0, 2, class66.field1094.field1722[0], false, var2);
            if (!var17) {
                method453(1, 0, 0, class66.field1094.field1752[0], var4, 1, -12782, 0, 2, class66.field1094.field1722[0], false, var2);
            }
            class125.field2235 = 2;
            class141.field2491 = class185.field3174;
            class94.field1611 = 0;
            class96.field1640 = class162.field2834;
            class149.field2597.method526((byte) -75, 133);
            class149.field2597.method606(2102840648, var5);
            class149.field2597.method582(class234.field4083 + var4, true);
            class149.field2597.method586(-107, class156.field2748);
            class149.field2597.method582(class97.field1646, true);
            class149.field2597.method602(class16.field237 + var2, false);
        }
        if (var3 == 31) {
            class240.field4218++;
            boolean var19 = method453(0, 0, 0, class66.field1094.field1752[0], var4, 0, -12782, 0, 2, class66.field1094.field1722[0], false, var2);
            if (!var19) {
                method453(1, 0, 0, class66.field1094.field1752[0], var4, 1, -12782, 0, 2, class66.field1094.field1722[0], false, var2);
            }
            class94.field1611 = 0;
            class96.field1640 = class162.field2834;
            class141.field2491 = class185.field3174;
            class125.field2235 = 2;
            class149.field2597.method526((byte) -70, 111);
            class149.field2597.method600(var5, (byte) 33);
            class149.field2597.method606(2102840648, class16.field237 + var2);
            class149.field2597.method582(class4.field61, true);
            class149.field2597.method600(class169.field2937, (byte) 36);
            class149.field2597.method582(class234.field4083 + var4, true);
            class149.field2597.method586(99, class156.field2750);
        }
        if (var3 == 41) {
            class165 var21 = class31.field478[var5];
            if (var21 != null) {
                method453(1, 0, 0, class66.field1094.field1752[0], var21.field1722[0], 1, -12782, 0, 2, class66.field1094.field1722[0], false, var21.field1752[0]);
                class96.field1640 = class162.field2834;
                class94.field1611 = 0;
                class125.field2235 = 2;
                class141.field2491 = class185.field3174;
                class117.field2086++;
                class149.field2597.method526((byte) -75, 21);
                class149.field2597.method582(var5, true);
            }
        }
        if (var3 == 2) {
            class201.field3430++;
            class61.method386(var2, var4, true, var6);
            class149.field2597.method526((byte) -71, 185);
            class149.field2597.method582(var4 + class234.field4083, true);
            class149.field2597.method600(var2 + class16.field237, (byte) 105);
            class149.field2597.method606(2102840648, Integer.MAX_VALUE & (int) (var6 >>> 32));
        }
        if (var3 == 1005) {
            class61.method386(var2, var4, true, var6);
            class149.field2597.method526((byte) -85, 136);
            class149.field2597.method602(Integer.MAX_VALUE & (int) (var6 >>> 32), false);
            class149.field2597.method600(class16.field237 + var2, (byte) 68);
            class22.field334++;
            class149.field2597.method582(class234.field4083 + var4, true);
        }
        if (var3 == 42) {
            class109 var22 = class16.field238[var5];
            if (var22 != null) {
                class97.field1647++;
                method453(1, 0, 0, class66.field1094.field1752[0], var22.field1722[0], 1, -12782, 0, 2, class66.field1094.field1722[0], false, var22.field1752[0]);
                class125.field2235 = 2;
                class141.field2491 = class185.field3174;
                class94.field1611 = 0;
                class96.field1640 = class162.field2834;
                class149.field2597.method526((byte) -127, 248);
                class149.field2597.method600(var5, (byte) 126);
            }
        }
        if (var3 == 17) {
            class137.field2402++;
            class149.field2597.method526((byte) -112, 250);
            class149.field2597.method586(81, var4);
            class149.field2597.method602(var5, false);
            class149.field2597.method582(var2, true);
            client.field1485 = 0;
            class229.field3904 = class261.method1709(var4, -116);
            class145.field2544 = var2;
        }
        if (var3 == 19) {
            class109 var23 = class16.field238[var5];
            if (var23 != null) {
                method453(1, 0, 0, class66.field1094.field1752[0], var23.field1722[0], 1, -12782, 0, 2, class66.field1094.field1722[0], false, var23.field1752[0]);
                class125.field2235 = 2;
                class96.field1640 = class162.field2834;
                class141.field2491 = class185.field3174;
                class94.field1611 = 0;
                class149.field2597.method526((byte) -113, 6);
                class149.field2597.method613((byte) -29, class156.field2750);
                class149.field2597.method600(class169.field2937, (byte) 25);
                class59.field995++;
                class149.field2597.method606(2102840648, var5);
                class149.field2597.method602(class4.field61, false);
            }
        }
        if (var3 == 3 || var3 == 1001) {
            class73.method479(class201.field3446[arg1], -11624, var4, var5, var2);
        }
        if (var3 == 57) {
            class51.field848++;
            class149.field2597.method526((byte) -91, 147);
            class149.field2597.method582(var2, true);
            class149.field2597.method565(var4, -4);
            class149.field2597.method602(var5, false);
            client.field1485 = 0;
            class229.field3904 = class261.method1709(var4, -96);
            class145.field2544 = var2;
        }
        if (var3 == 51) {
            class109 var24 = class16.field238[var5];
            if (var24 != null) {
                method453(1, 0, 0, class66.field1094.field1752[0], var24.field1722[0], 1, -12782, 0, 2, class66.field1094.field1722[0], false, var24.field1752[0]);
                class94.field1611 = 0;
                class96.field1640 = class162.field2834;
                class141.field2491 = class185.field3174;
                class125.field2235 = 2;
                class149.field2597.method526((byte) -79, 199);
                class149.field2597.method600(var5, (byte) 37);
                class211.field3579++;
            }
        }
        if (var3 == 50) {
            class102.field1701++;
            boolean var25 = method453(0, 0, 0, class66.field1094.field1752[0], var4, 0, -12782, 0, 2, class66.field1094.field1722[0], false, var2);
            if (!var25) {
                method453(1, 0, 0, class66.field1094.field1752[0], var4, 1, -12782, 0, 2, class66.field1094.field1722[0], false, var2);
            }
            class125.field2235 = 2;
            class94.field1611 = 0;
            class141.field2491 = class185.field3174;
            class96.field1640 = class162.field2834;
            class149.field2597.method526((byte) -80, 54);
            class149.field2597.method602(class16.field237 + var2, false);
            class149.field2597.method600(class234.field4083 + var4, (byte) 91);
            class149.field2597.method606(2102840648, var5);
        }
        if (var3 == 1004) {
            class267.field4630++;
            class96.field1640 = class162.field2834;
            class94.field1611 = 0;
            class125.field2235 = 2;
            class141.field2491 = class185.field3174;
            class149.field2597.method526((byte) -128, 233);
            class149.field2597.method582(var5, true);
        }
        if (var3 == 36) {
            class149.field2597.method526((byte) -116, 175);
            class149.field2597.method582(var2, true);
            class237.field4120++;
            class149.field2597.method600(var5, (byte) 17);
            class149.field2597.method588(var4, -102);
            client.field1485 = 0;
            class229.field3904 = class261.method1709(var4, -102);
            class145.field2544 = var2;
        }
        if (var3 == 38) {
            class149.field2597.method526((byte) -50, 255);
            class4.field55++;
            class149.field2597.method606(2102840648, class97.field1646);
            class149.field2597.method606(2102840648, var5);
            class149.field2597.method565(var4, -4);
            class149.field2597.method613((byte) -99, class156.field2748);
            class149.field2597.method600(var2, (byte) 120);
            client.field1485 = 0;
            class229.field3904 = class261.method1709(var4, -115);
            class145.field2544 = var2;
        }
        if (var3 == 37) {
            class149.field2597.method526((byte) -85, 223);
            class164.field2863++;
            class149.field2597.method582(var2, true);
            class149.field2597.method600(var5, (byte) 75);
            class149.field2597.method613((byte) -112, var4);
            client.field1485 = 0;
            class229.field3904 = class261.method1709(var4, -109);
            class145.field2544 = var2;
        }
        if (var3 == 7) {
            class109 var27 = class16.field238[var5];
            if (var27 != null) {
                method453(1, 0, 0, class66.field1094.field1752[0], var27.field1722[0], 1, -12782, 0, 2, class66.field1094.field1722[0], false, var27.field1752[0]);
                class96.field1640 = class162.field2834;
                class94.field1611 = 0;
                class125.field2235 = 2;
                class141.field2491 = class185.field3174;
                class229.field3918++;
                class149.field2597.method526((byte) -105, 215);
                class149.field2597.method602(var5, false);
            }
        }
        if (var3 == 1) {
            class35.field571++;
            class149.field2597.method526((byte) -53, 87);
            class149.field2597.method586(52, var4);
            class229 var28 = class261.method1709(var4, -93);
            if (var28.field4010 != null && var28.field4010[0][0] == 5) {
                int var29 = var28.field4010[0][1];
                if (class218.field3698[var29] != var28.field3911[0]) {
                    class218.field3698[var29] = var28.field3911[0];
                    class219.method1409(var29, -20144);
                }
            }
        }
        if (var3 == 33) {
            class109 var30 = class16.field238[var5];
            if (var30 != null) {
                method453(1, 0, 0, class66.field1094.field1752[0], var30.field1722[0], 1, -12782, 0, 2, class66.field1094.field1722[0], false, var30.field1752[0]);
                class265.field4621++;
                class94.field1611 = 0;
                class141.field2491 = class185.field3174;
                class96.field1640 = class162.field2834;
                class125.field2235 = 2;
                class149.field2597.method526((byte) -87, 22);
                class149.field2597.method600(var5, (byte) 72);
            }
        }
        if (var3 == 11 && class45.field754 == null) {
            class250.method1639(-3175, var4, var2);
            class45.field754 = class182.method1219((byte) 114, var4, var2);
            class40.method231(class45.field754, 0);
        }
        if (var3 == 58) {
            class109 var31 = class16.field238[var5];
            if (var31 != null) {
                method453(1, 0, 0, class66.field1094.field1752[0], var31.field1722[0], 1, -12782, 0, 2, class66.field1094.field1722[0], false, var31.field1752[0]);
                class141.field2491 = class185.field3174;
                class96.field1640 = class162.field2834;
                class25.field413++;
                class94.field1611 = 0;
                class125.field2235 = 2;
                class149.field2597.method526((byte) -65, 154);
                class149.field2597.method600(var5, (byte) 124);
            }
        }
        if (var3 == 1007) {
            class94.field1611 = 0;
            class228.field3854++;
            class125.field2235 = 2;
            class141.field2491 = class185.field3174;
            class96.field1640 = class162.field2834;
            class149.field2597.method526((byte) -42, 180);
            class149.field2597.method606(2102840648, var5);
        }
        if (var3 == 49) {
            class159.field2780++;
            boolean var32 = method453(0, 0, 0, class66.field1094.field1752[0], var4, 0, -12782, 0, 2, class66.field1094.field1722[0], false, var2);
            if (!var32) {
                method453(1, 0, 0, class66.field1094.field1752[0], var4, 1, -12782, 0, 2, class66.field1094.field1722[0], false, var2);
            }
            class125.field2235 = 2;
            class94.field1611 = 0;
            class96.field1640 = class162.field2834;
            class141.field2491 = class185.field3174;
            class149.field2597.method526((byte) -48, 151);
            class149.field2597.method606(2102840648, class234.field4083 + var4);
            class149.field2597.method602(class16.field237 + var2, false);
            class149.field2597.method582(var5, true);
        }
        if (var3 == 43) {
            class109 var34 = class16.field238[var5];
            if (var34 != null) {
                class110.field1941++;
                method453(1, 0, 0, class66.field1094.field1752[0], var34.field1722[0], 1, -12782, 0, 2, class66.field1094.field1722[0], false, var34.field1752[0]);
                class96.field1640 = class162.field2834;
                class141.field2491 = class185.field3174;
                class94.field1611 = 0;
                class125.field2235 = 2;
                class149.field2597.method526((byte) -59, 210);
                class149.field2597.method565(class156.field2748, -4);
                class149.field2597.method600(class97.field1646, (byte) 117);
                class149.field2597.method602(var5, false);
            }
        }
        if (var3 == 1003) {
            class141.field2491 = class185.field3174;
            class96.field1640 = class162.field2834;
            class94.field1611 = 0;
            class125.field2235 = 2;
            class165 var35 = class31.field478[var5];
            if (var35 != null) {
                class23 var36 = var35.field2873;
                if (var36.field406 != null) {
                    var36 = var36.method140(1);
                }
                if (var36 != null) {
                    class149.field2597.method526((byte) -49, 93);
                    class230.field4027++;
                    class149.field2597.method582(var36.field392, true);
                }
            }
        }
        if (var3 == 35) {
            class39.field662++;
            class61.method386(var2, var4, true, var6);
            class149.field2597.method526((byte) -55, 159);
            class149.field2597.method606(2102840648, class16.field237 + var2);
            class149.field2597.method600(var4 + class234.field4083, (byte) 117);
            class149.field2597.method582(Integer.MAX_VALUE & (int) (var6 >>> 32), true);
        }
        if (var3 == 4) {
            boolean var37 = method453(0, 0, 0, class66.field1094.field1752[0], var4, 0, -12782, 0, 2, class66.field1094.field1722[0], false, var2);
            if (!var37) {
                method453(1, 0, 0, class66.field1094.field1752[0], var4, 1, -12782, 0, 2, class66.field1094.field1722[0], false, var2);
            }
            class94.field1611 = 0;
            class141.field2491 = class185.field3174;
            class195.field3331++;
            class96.field1640 = class162.field2834;
            class125.field2235 = 2;
            class149.field2597.method526((byte) -105, 152);
            class149.field2597.method606(2102840648, class234.field4083 + var4);
            class149.field2597.method582(var5, true);
            class149.field2597.method606(2102840648, class16.field237 + var2);
        }
        if (var3 == 40) {
            class165 var39 = class31.field478[var5];
            if (var39 != null) {
                method453(1, 0, 0, class66.field1094.field1752[0], var39.field1722[0], 1, -12782, 0, 2, class66.field1094.field1722[0], false, var39.field1752[0]);
                class94.field1611 = 0;
                class141.field2491 = class185.field3174;
                class177.field3048++;
                class96.field1640 = class162.field2834;
                class125.field2235 = 2;
                class149.field2597.method526((byte) -63, 142);
                class149.field2597.method606(2102840648, class4.field61);
                class149.field2597.method606(2102840648, var5);
                class149.field2597.method588(class156.field2750, -104);
                class149.field2597.method600(class169.field2937, (byte) 80);
            }
        }
        if (var3 == 34) {
            class249.field4390++;
            class149.field2597.method526((byte) -41, 170);
            class149.field2597.method613((byte) -122, var4);
            class149.field2597.method582(var2, true);
            class149.field2597.method582(class97.field1646, true);
            class149.field2597.method613((byte) -122, class156.field2748);
        }
        if (var3 == 1002) {
            class229 var40 = class261.method1709(var4, -112);
            if (var40 == null || var40.field4020[var2] < 100000) {
                class267.field4630++;
                class149.field2597.method526((byte) -61, 233);
                class149.field2597.method582(var5, true);
            } else {
                class277.method1874(class197.method1291(new class275[] { class250.method1644(var40.field4020[var2], (byte) -115), class113.field2006, class210.method1352(79, var5).field4322 }, -30025), class79.field1301, 0, true);
            }
            client.field1485 = 0;
            class229.field3904 = class261.method1709(var4, -103);
            class145.field2544 = var2;
        }
        if (arg0 >= -107) {
            method450(15, 102);
        }
        if (var3 == 45) {
            class114.field2022++;
            class149.field2597.method526((byte) -78, 232);
            class149.field2597.method600(var2, (byte) 62);
            class149.field2597.method613((byte) -73, var4);
            class149.field2597.method582(var5, true);
            client.field1485 = 0;
            class229.field3904 = class261.method1709(var4, -121);
            class145.field2544 = var2;
        }
        if (var3 == 28) {
            class109 var41 = class16.field238[var5];
            if (var41 != null) {
                class262.field4549++;
                method453(1, 0, 0, class66.field1094.field1752[0], var41.field1722[0], 1, -12782, 0, 2, class66.field1094.field1722[0], false, var41.field1752[0]);
                class96.field1640 = class162.field2834;
                class141.field2491 = class185.field3174;
                class94.field1611 = 0;
                class125.field2235 = 2;
                class149.field2597.method526((byte) -51, 157);
                class149.field2597.method582(var5, true);
            }
        }
        if (var3 == 14) {
            class29.field441++;
            class149.field2597.method526((byte) -51, 190);
            class149.field2597.method582(var2, true);
            class149.field2597.method586(-119, var4);
            class149.field2597.method602(var5, false);
            client.field1485 = 0;
            class229.field3904 = class261.method1709(var4, -94);
            class145.field2544 = var2;
        }
        if (var3 == 18) {
            class149.field2597.method526((byte) -65, 149);
            class244.field4251++;
            class149.field2597.method586(78, var4);
            class149.field2597.method600(var2, (byte) 84);
            class149.field2597.method606(2102840648, var5);
            client.field1485 = 0;
            class229.field3904 = class261.method1709(var4, -127);
            class145.field2544 = var2;
        }
        if (var3 == 32) {
            class165 var42 = class31.field478[var5];
            if (var42 != null) {
                class85.field1404++;
                method453(1, 0, 0, class66.field1094.field1752[0], var42.field1722[0], 1, -12782, 0, 2, class66.field1094.field1722[0], false, var42.field1752[0]);
                class141.field2491 = class185.field3174;
                class94.field1611 = 0;
                class125.field2235 = 2;
                class96.field1640 = class162.field2834;
                class149.field2597.method526((byte) -69, 105);
                class149.field2597.method600(var5, (byte) 119);
            }
        }
        if (var3 == 26) {
            class165 var43 = class31.field478[var5];
            if (var43 != null) {
                method453(1, 0, 0, class66.field1094.field1752[0], var43.field1722[0], 1, -12782, 0, 2, class66.field1094.field1722[0], false, var43.field1752[0]);
                class156.field2754++;
                class94.field1611 = 0;
                class96.field1640 = class162.field2834;
                class125.field2235 = 2;
                class141.field2491 = class185.field3174;
                class149.field2597.method526((byte) -83, 43);
                class149.field2597.method582(var5, true);
            }
        }
        if (var3 == 5) {
            class165 var44 = class31.field478[var5];
            if (var44 != null) {
                method453(1, 0, 0, class66.field1094.field1752[0], var44.field1722[0], 1, -12782, 0, 2, class66.field1094.field1722[0], false, var44.field1752[0]);
                class96.field1640 = class162.field2834;
                class141.field2491 = class185.field3174;
                class94.field1611 = 0;
                class14.field212++;
                class125.field2235 = 2;
                class149.field2597.method526((byte) -60, 121);
                class149.field2597.method582(class97.field1646, true);
                class149.field2597.method565(class156.field2748, -4);
                class149.field2597.method600(var5, (byte) 45);
            }
        }
        if (var3 == 23) {
            class149.field2597.method526((byte) -61, 87);
            class35.field571++;
            class149.field2597.method586(127, var4);
            class229 var45 = class261.method1709(var4, -110);
            if (var45.field4010 != null && var45.field4010[0][0] == 5) {
                int var46 = var45.field4010[0][1];
                class218.field3698[var46] = 1 - class218.field3698[var46];
                class219.method1409(var46, -20144);
            }
        }
        if (var3 == 16) {
            class109 var47 = class16.field238[var5];
            if (var47 != null) {
                method453(1, 0, 0, class66.field1094.field1752[0], var47.field1722[0], 1, -12782, 0, 2, class66.field1094.field1722[0], false, var47.field1752[0]);
                class141.field2491 = class185.field3174;
                class245.field4295++;
                class125.field2235 = 2;
                class96.field1640 = class162.field2834;
                class94.field1611 = 0;
                class149.field2597.method526((byte) -47, 71);
                class149.field2597.method606(2102840648, var5);
            }
        }
        if (var3 == 22) {
            class29.method172(-70);
            class229 var48 = class261.method1709(var4, -97);
            class169.field2937 = var5;
            class156.field2750 = var4;
            class4.field61 = var2;
            class190.field3272 = 1;
            class40.method231(var48, 0);
            class210.field3550 = class197.method1291(new class275[] { class215.field3668, class210.method1352(70, var5).field4322, class230.field4032 }, -30025);
            if (class210.field3550 == null) {
                class210.field3550 = class258.field4526;
            }
            return;
        }
        if (var3 == 25) {
            class149.field2597.method526((byte) -66, 65);
            class90.field1539++;
            class149.field2597.method588(var4, -95);
            class149.field2597.method600(var5, (byte) 121);
            class149.field2597.method602(var2, false);
            client.field1485 = 0;
            class229.field3904 = class261.method1709(var4, -124);
            class145.field2544 = var2;
        }
        if (var3 == 44) {
            class109 var49 = class16.field238[var5];
            if (var49 != null) {
                method453(1, 0, 0, class66.field1094.field1752[0], var49.field1722[0], 1, -12782, 0, 2, class66.field1094.field1722[0], false, var49.field1752[0]);
                class75.field1237++;
                class141.field2491 = class185.field3174;
                class125.field2235 = 2;
                class96.field1640 = class162.field2834;
                class94.field1611 = 0;
                class149.field2597.method526((byte) -48, 30);
                class149.field2597.method606(2102840648, var5);
            }
        }
        if (class190.field3272 != 0) {
            class190.field3272 = 0;
            class40.method231(class261.method1709(class156.field2750, -109), 0);
        }
        if (class144.field2523) {
            class29.method172(-92);
        }
        if (class229.field3904 != null && client.field1485 == 0) {
            class40.method231(class229.field3904, 0);
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(I)Ltj;")
    public static final class270 method451(int arg0) {
        field1106++;
        if (class39.field654 < class148.field2582.length) {
            return class148.field2582[class39.field654++];
        } else {
            if (arg0 != 0) {
                field1097 = null;
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IIIIII)V")
    public static final void method452(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field1103++;
        for (int var6 = arg5; var6 <= arg0 + arg5; var6++) {
            for (int var11 = arg2; var11 <= (arg2 + arg3); var11++) {
                if (var11 >= 0 && var11 < 104 && var6 >= 0 && var6 < 104) {
                    class213.field3640[arg4][var11][var6] = 127;
                }
            }
        }
        if (arg1 != 10688) {
            method451(-25);
        }
        for (int var7 = arg5; var7 < (arg0 + arg5); var7++) {
            for (int var10 = arg2; var10 < arg2 + arg3; var10++) {
                if (var10 >= 0 && var10 < 104 && var7 >= 0 && var7 < 104) {
                    class92.field1575[arg4][var10][var7] = arg4 > 0 ? class92.field1575[arg4 - 1][var10][var7] : 0;
                }
            }
        }
        if (arg2 > 0 && arg2 < 104) {
            for (int var8 = arg5 + 1; var8 < arg0 + arg5; var8++) {
                if (var8 >= 0 && var8 < 104) {
                    class92.field1575[arg4][arg2][var8] = class92.field1575[arg4][arg2 - 1][var8];
                }
            }
        }
        if (arg5 > 0 && arg5 < 104) {
            for (int var9 = arg2 + 1; var9 < (arg2 + arg3); var9++) {
                if (var9 >= 0 && var9 < 104) {
                    class92.field1575[arg4][var9][arg5] = class92.field1575[arg4][var9][arg5 - 1];
                }
            }
        }
        if (arg2 < 0 || arg5 < 0 || arg2 >= 104 || arg5 >= 104) {
            return;
        }
        if (arg4 == 0) {
            if (arg2 > 0 && class92.field1575[arg4][arg2 - 1][arg5] != 0) {
                class92.field1575[arg4][arg2][arg5] = class92.field1575[arg4][arg2 - 1][arg5];
                return;
            }
            if (arg5 > 0 && class92.field1575[arg4][arg2][arg5 - 1] != 0) {
                class92.field1575[arg4][arg2][arg5] = class92.field1575[arg4][arg2][arg5 - 1];
                return;
            }
            if (arg2 > 0 && arg5 > 0 && class92.field1575[arg4][arg2 - 1][arg5 - 1] != 0) {
                class92.field1575[arg4][arg2][arg5] = class92.field1575[arg4][arg2 - 1][arg5 - 1];
                return;
            }
        } else if (arg2 <= 0 || class92.field1575[arg4 - 1][arg2 - 1][arg5] == class92.field1575[arg4][arg2 - 1][arg5]) {
            if (arg5 > 0 && class92.field1575[arg4][arg2][arg5 - 1] != class92.field1575[arg4 - 1][arg2][arg5 - 1]) {
                class92.field1575[arg4][arg2][arg5] = class92.field1575[arg4][arg2][arg5 - 1];
                return;
            }
            if (arg2 > 0 && arg5 > 0 && class92.field1575[arg4][arg2 - 1][arg5 - 1] != class92.field1575[arg4 - 1][arg2 - 1][arg5 - 1]) {
                class92.field1575[arg4][arg2][arg5] = class92.field1575[arg4][arg2 - 1][arg5 - 1];
                return;
            }
            return;
        } else {
            class92.field1575[arg4][arg2][arg5] = class92.field1575[arg4][arg2 - 1][arg5];
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IIIIIIIIIIZI)Z")
    public static final boolean method453(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, boolean arg10, int arg11) {
        field1100++;
        if (class66.field1094.method750((byte) -115) == 2) {
            return class112.method823(0, arg1, arg10, arg11, arg2, arg8, arg3, arg9, arg7, arg4, arg0, arg5);
        } else if (class66.field1094.method750((byte) -110) > 2) {
            return class168.method1155(arg8, arg6 + 12781, arg11, arg9, arg4, arg7, arg2, arg1, arg3, arg0, arg10, class66.field1094.method750((byte) -118), arg5);
        } else {
            if (arg6 != -12782) {
                field1095 = null;
            }
            return class9.method33(arg3, arg4, arg11, arg8, arg0, arg9, (byte) -81, arg2, arg5, arg1, arg7, arg10);
        }
    }

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "(I)V")
    public static void method454(int arg0) {
        field1098 = null;
        field1101 = null;
        if (arg0 != 0) {
            field1098 = null;
        }
        field1095 = null;
        field1097 = null;
        field1099 = null;
        field1096 = null;
    }
}
