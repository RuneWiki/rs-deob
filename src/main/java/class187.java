import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class187 {

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "I")
    public static int field3081;

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "I")
    public static int field3082;

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "I")
    public static int field3083;

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "I")
    public static int field3084;

    @OriginalMember(owner = "client!gd", name = "e", descriptor = "I")
    public static int field3085;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lwn;I)V", line = 12)
    public static final void method1330(class429 arg0, int arg1) {
        if (arg1 != -11425) {
            field3082 = -56;
        }
        field3084++;
        class64.field837 = arg0;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IZIIZIZ)V", line = 76)
    public static final void method1331(int arg0, boolean arg1, int arg2, int arg3, boolean arg4, int arg5, boolean arg6) {
        field3085++;
        if (!arg4) {
            method1332(false, (class418) null);
        }
        if (arg5 <= arg0) {
            return;
        }
        int var7 = (arg0 + arg5) / 2;
        int var8 = arg0;
        class231 var9 = class28.field323[var7];
        class28.field323[var7] = class28.field323[arg5];
        class28.field323[arg5] = var9;
        for (int var10 = arg0; var10 < arg5; var10++) {
            if (class239.method1690(arg1, arg3, arg6, arg4, class28.field323[var10], arg2, var9) <= 0) {
                class231 var11 = class28.field323[var10];
                class28.field323[var10] = class28.field323[var8];
                class28.field323[var8++] = var11;
            }
        }
        class28.field323[arg5] = class28.field323[var8];
        class28.field323[var8] = var9;
        method1331(arg0, arg1, arg2, arg3, true, var8 - 1, arg6);
        method1331(var8 + 1, arg1, arg2, arg3, true, arg5, arg6);
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(ZLno;)V", line = 146)
    public static final void method1332(boolean arg0, class418 arg1) {
        field3081++;
        if (arg1 == null || class86.field1089.field459 == arg1) {
            return;
        }
        int var2 = arg1.field6187;
        int var3 = arg1.field6186;
        int var4 = arg1.field6192;
        int var5 = (int) arg1.field6194;
        if (var4 >= 2000) {
            var4 -= 2000;
        }
        long var6 = arg1.field6194;
        if (var4 == 3) {
            class428.field6307++;
            class346.field5335 = class56.field692;
            class345.field5328 = 2;
            class75.field947 = class214.field3480;
            class256.field4142 = 0;
            class11.field139.method2224(144, (byte) 0);
            class11.field139.method1309(class444.field6481 + var3, 127);
            class11.field139.method1309(var5, 114);
            class11.field139.method1278(class232.field3856[82] ? 1 : 0, 124);
            class11.field139.method1268(class409.field6048 + var2, (byte) -108);
            class388.method2457(var2, var3, (byte) 56);
        }
        if (var4 == 20) {
            class98.field1374++;
            class11.field139.method2224(202, (byte) 0);
            class11.field139.method1315(var3, (byte) 72);
            class172 var8 = class196.method1375(var3, (byte) -56);
            if (var8.field2716 != null && var8.field2716[0][0] == 5) {
                int var9 = var8.field2716[0][1];
                class403.field6014[var9] = 1 - class403.field6014[var9];
                class435.method2680(var9, (byte) -2);
            }
        }
        if (var4 == 1) {
            class50 var10 = class39.field499[var5];
            if (var10 != null) {
                class346.field5335 = class56.field692;
                class75.field947 = class214.field3480;
                class163.field2552++;
                class345.field5328 = 2;
                class256.field4142 = 0;
                class11.field139.method2224(79, (byte) 0);
                class11.field139.method1312(class232.field3856[82] ? 1 : 0, -23);
                class11.field139.method1309(var5, 118);
                class231.method1643(-2, var10.method903(-37), var10.field1906[0], 0, true, 0, class261.field4201.field1916[0], -1, class261.field4201.field1906[0], var10.method903(-122), var10.field1916[0]);
            }
        }
        if (var4 == 23) {
            class11.field139.method2224(200, (byte) 0);
            class418.field6188++;
            class11.field139.method1315(var3, (byte) 38);
            class11.field139.method1298(var2, -102);
            class11.field139.method1309(class73.field925, 118);
            class11.field139.method1286((byte) 120, class436.field6419);
            class11.field139.method1309(var5, 120);
            class269.field4323 = 0;
            class324.field5075 = class196.method1375(var3, (byte) -56);
            class299.field4752 = var2;
        }
        if (var4 == 15) {
            class173.field2879++;
            class11.field139.method2224(184, (byte) 0);
            class11.field139.method1315(var3, (byte) 122);
            class11.field139.method1309(var5, 112);
            class11.field139.method1283(8, var2);
            class269.field4323 = 0;
            class324.field5075 = class196.method1375(var3, (byte) -56);
            class299.field4752 = var2;
        }
        if (var4 == 6) {
            class75.field947 = class214.field3480;
            class345.field5328 = 2;
            class21.field281++;
            class346.field5335 = class56.field692;
            class256.field4142 = 0;
            class11.field139.method2224(82, (byte) 0);
            class11.field139.method1268(class444.field6481 + var3, (byte) -108);
            class11.field139.method1268(var5, (byte) -108);
            class11.field139.method1325(0, class232.field3856[82] ? 1 : 0);
            class11.field139.method1298(var2 + class409.field6048, -40);
            class388.method2457(var2, var3, (byte) 56);
        }
        if (var4 == 37 || var4 == 1004) {
            class385.method2431(arg1.field6197, (byte) 61, var3, var5, var2);
        }
        if (var4 == 8) {
            class11.field139.method2224(100, (byte) 0);
            class133.field2085++;
            class11.field139.method1315(var3, (byte) 62);
            class11.field139.method1309(var2, 117);
            class11.field139.method1298(var5, -122);
            class269.field4323 = 0;
            class324.field5075 = class196.method1375(var3, (byte) -56);
            class299.field4752 = var2;
        }
        if (var4 == 24) {
            class11.field139.method2224(202, (byte) 0);
            class98.field1374++;
            class11.field139.method1315(var3, (byte) 102);
            class172 var11 = class196.method1375(var3, (byte) -56);
            if (var11.field2716 != null && var11.field2716[0][0] == 5) {
                int var12 = var11.field2716[0][1];
                if (class403.field6014[var12] != var11.field2722[0]) {
                    class403.field6014[var12] = var11.field2722[0];
                    class435.method2680(var12, (byte) -2);
                }
            }
        }
        if (var4 == 1001) {
            class346.field5335 = class56.field692;
            class256.field4142 = 0;
            class375.field5655++;
            class345.field5328 = 2;
            class75.field947 = class214.field3480;
            class11.field139.method2224(54, (byte) 0);
            class11.field139.method1283(8, var5);
        }
        if (var4 == 22) {
            class172 var13 = class196.method1375(var3, (byte) -56);
            boolean var14 = true;
            if (var13.field2831 > 0) {
                var14 = class243.method1703(var13, 9443);
            }
            if (var14) {
                class11.field139.method2224(202, (byte) 0);
                class98.field1374++;
                class11.field139.method1315(var3, (byte) 21);
            }
        }
        if (var4 == 34) {
            if (class382.field5772 > 0 && class232.field3856[82] && class232.field3856[81]) {
                class91.method542(class266.field4286, class409.field6048 + var2, -114, class444.field6481 + var3);
            } else {
                class155.method1090(var5, var2, var3, (byte) -89);
                if (var5 == 1) {
                    class11.field139.method1312(-1, -36);
                    class11.field139.method1312(-1, -44);
                    class11.field139.method1283(8, (int) class329.field5153);
                    class11.field139.method1312(57, -114);
                    class11.field139.method1312(class52.field650, -80);
                    class11.field139.method1312(class367.field5561, -106);
                    class11.field139.method1312(89, -95);
                    class11.field139.method1283(8, class261.field4201.field724);
                    class11.field139.method1283(8, class261.field4201.field722);
                    class11.field139.method1312(63, -38);
                } else {
                    class256.field4142 = 0;
                    class345.field5328 = 1;
                    class75.field947 = class214.field3480;
                    class346.field5335 = class56.field692;
                }
                class231.method1643(-4, 1, var2, 0, true, 0, class261.field4201.field1916[0], -1, class261.field4201.field1906[0], 1, var3);
            }
        }
        if (var4 == 38) {
            class50 var15 = class39.field499[var5];
            if (var15 != null) {
                class75.field947 = class214.field3480;
                class256.field4142 = 0;
                class345.field5328 = 2;
                class136.field2128++;
                class346.field5335 = class56.field692;
                class11.field139.method2224(239, (byte) 0);
                class11.field139.method1311(87, class436.field6419);
                class11.field139.method1298(class73.field925, -55);
                class11.field139.method1298(var5, -123);
                class11.field139.method1317(true, class232.field3856[82] ? 1 : 0);
                class231.method1643(-2, var15.method903(-108), var15.field1906[0], 0, true, 0, class261.field4201.field1916[0], -1, class261.field4201.field1906[0], var15.method903(-40), var15.field1916[0]);
            }
        }
        if (var4 == 21) {
            if (class382.field5772 > 0 && class232.field3856[82] && class232.field3856[81]) {
                class91.method542(class266.field4286, class409.field6048 + var2, 110, class444.field6481 + var3);
            } else {
                class89.field1111++;
                class346.field5335 = class56.field692;
                class256.field4142 = 0;
                class75.field947 = class214.field3480;
                class345.field5328 = 1;
                class11.field139.method2224(123, (byte) 0);
                class11.field139.method1283(8, class444.field6481 + var3);
                class11.field139.method1283(8, class409.field6048 + var2);
            }
        }
        if (var4 == 45) {
            class11.field139.method2224(146, (byte) 0);
            class43.field534++;
            class11.field139.method1315(var3, (byte) 92);
            class11.field139.method1309(var2, 124);
            class11.field139.method1309(var5, 119);
            class269.field4323 = 0;
            class324.field5075 = class196.method1375(var3, (byte) -56);
            class299.field4752 = var2;
        }
        if (var4 == 1011) {
            class345.field5328 = 2;
            class346.field5335 = class56.field692;
            class256.field4142 = 0;
            class75.field947 = class214.field3480;
            class50 var16 = class39.field499[var5];
            if (var16 != null) {
                class226 var17 = var16.field615;
                if (var17.field3771 != null) {
                    var17 = var17.method1619(-94);
                }
                if (var17 != null) {
                    class11.field139.method2224(56, (byte) 0);
                    class431.field6340++;
                    class11.field139.method1268(var17.field3812, (byte) -108);
                }
            }
        }
        if (var4 == 58) {
            class217.field3558++;
            class11.field139.method2224(245, (byte) 0);
            class11.field139.method1315(var3, (byte) 11);
            class11.field139.method1309(var2, 125);
            class11.field139.method1283(8, var5);
            class269.field4323 = 0;
            class324.field5075 = class196.method1375(var3, (byte) -56);
            class299.field4752 = var2;
        }
        if (var4 == 59) {
            class219 var18 = class216.field3517[var5];
            if (var18 != null) {
                class277.field4413++;
                class256.field4142 = 0;
                class346.field5335 = class56.field692;
                class345.field5328 = 2;
                class75.field947 = class214.field3480;
                class11.field139.method2224(102, (byte) 0);
                class11.field139.method1283(8, var5);
                class11.field139.method1325(0, class232.field3856[82] ? 1 : 0);
                class231.method1643(-2, var18.method903(-115), var18.field1906[0], 0, true, 0, class261.field4201.field1916[0], -1, class261.field4201.field1906[0], var18.method903(-116), var18.field1916[0]);
            }
        }
        if (var4 == 5) {
            class346.field5335 = class56.field692;
            class256.field4142 = 0;
            class75.field947 = class214.field3480;
            class345.field5328 = 2;
            class238.field3963++;
            class11.field139.method2224(115, (byte) 0);
            class11.field139.method1309(var5, 126);
            class11.field139.method1298(var2 + class409.field6048, -91);
            class11.field139.method1309(class444.field6481 + var3, 112);
            class11.field139.method1283(8, class73.field925);
            class11.field139.method1317(true, class232.field3856[82] ? 1 : 0);
            class11.field139.method1286((byte) 116, class436.field6419);
            class388.method2457(var2, var3, (byte) 56);
        }
        if (var4 == 1012) {
            class256.field4142 = 0;
            class314.field4945++;
            class346.field5335 = class56.field692;
            class345.field5328 = 2;
            class75.field947 = class214.field3480;
            class11.field139.method2224(45, (byte) 0);
            class11.field139.method1283(8, var5);
        }
        if (var4 == 18) {
            class219 var19 = class216.field3517[var5];
            if (var19 != null) {
                class75.field947 = class214.field3480;
                class345.field5328 = 2;
                class286.field4597++;
                class256.field4142 = 0;
                class346.field5335 = class56.field692;
                class11.field139.method2224(62, (byte) 0);
                class11.field139.method1298(var5, -70);
                class11.field139.method1278(class232.field3856[82] ? 1 : 0, 125);
                class231.method1643(-2, var19.method903(-45), var19.field1906[0], 0, true, 0, class261.field4201.field1916[0], -1, class261.field4201.field1906[0], var19.method903(-116), var19.field1916[0]);
            }
        }
        if (var4 == 13) {
            class50 var20 = class39.field499[var5];
            if (var20 != null) {
                class433.field6392++;
                class256.field4142 = 0;
                class345.field5328 = 2;
                class75.field947 = class214.field3480;
                class346.field5335 = class56.field692;
                class11.field139.method2224(64, (byte) 0);
                class11.field139.method1312(class232.field3856[82] ? 1 : 0, -63);
                class11.field139.method1268(var5, (byte) -108);
                class231.method1643(-2, var20.method903(-54), var20.field1906[0], 0, true, 0, class261.field4201.field1916[0], -1, class261.field4201.field1906[0], var20.method903(-67), var20.field1916[0]);
            }
        }
        if (var4 == 49) {
            class302.field4777++;
            class346.field5335 = class56.field692;
            class345.field5328 = 2;
            class256.field4142 = 0;
            class75.field947 = class214.field3480;
            class11.field139.method2224(212, (byte) 0);
            class11.field139.method1268(Integer.MAX_VALUE & (int) (var6 >>> 32), (byte) -108);
            class11.field139.method1309(var2 + class409.field6048, 118);
            class11.field139.method1312(class232.field3856[82] ? 1 : 0, -73);
            class11.field139.method1298(class444.field6481 + var3, -42);
            class351.method2292((byte) 61, var6, var2, var3);
        }
        if (var4 == 60) {
            class50 var21 = class39.field499[var5];
            if (var21 != null) {
                class345.field5328 = 2;
                class117.field1629++;
                class346.field5335 = class56.field692;
                class75.field947 = class214.field3480;
                class256.field4142 = 0;
                class11.field139.method2224(143, (byte) 0);
                class11.field139.method1325(0, class232.field3856[82] ? 1 : 0);
                class11.field139.method1268(var5, (byte) -108);
                class231.method1643(-2, var21.method903(-46), var21.field1906[0], 0, true, 0, class261.field4201.field1916[0], -1, class261.field4201.field1906[0], var21.method903(-55), var21.field1916[0]);
            }
        }
        if (var4 == 29) {
            class198.method1383(var3, (byte) 97, var2);
        }
        if (var4 == 42) {
            class75.field947 = class214.field3480;
            class345.field5328 = 1;
            class426.field6288++;
            class256.field4142 = 0;
            class346.field5335 = class56.field692;
            class11.field139.method2224(242, (byte) 0);
            class11.field139.method1315(class436.field6419, (byte) 89);
            class11.field139.method1268(class444.field6481 + var3, (byte) -108);
            class11.field139.method1298(class73.field925, -37);
            class11.field139.method1309(class409.field6048 + var2, 125);
            class231.method1643(-4, 1, var2, 0, true, 0, class261.field4201.field1916[0], -1, class261.field4201.field1906[0], 1, var3);
        }
        if (var4 == 39) {
            class50 var22 = class39.field499[var5];
            if (var22 != null) {
                class256.field4142 = 0;
                class346.field5335 = class56.field692;
                class75.field947 = class214.field3480;
                class181.field2962++;
                class345.field5328 = 2;
                class11.field139.method2224(222, (byte) 0);
                class11.field139.method1315(class288.field4622, (byte) 21);
                class11.field139.method1268(class386.field5838, (byte) -108);
                class11.field139.method1278(class232.field3856[82] ? 1 : 0, 123);
                class11.field139.method1283(8, var5);
                class11.field139.method1283(8, class222.field3695);
                class231.method1643(-2, var22.method903(-48), var22.field1906[0], 0, true, 0, class261.field4201.field1916[0], -1, class261.field4201.field1906[0], var22.method903(-65), var22.field1916[0]);
            }
        }
        if (var4 == 31) {
            class171.field2680++;
            class11.field139.method2224(162, (byte) 0);
            class11.field139.method1315(var3, (byte) 76);
            class11.field139.method1283(8, var2);
            class11.field139.method1309(var5, 119);
            class269.field4323 = 0;
            class324.field5075 = class196.method1375(var3, (byte) -56);
            class299.field4752 = var2;
        }
        if (var4 == 14) {
            class219 var23 = class216.field3517[var5];
            if (var23 != null) {
                class345.field5328 = 2;
                class351.field5428++;
                class75.field947 = class214.field3480;
                class346.field5335 = class56.field692;
                class256.field4142 = 0;
                class11.field139.method2224(55, (byte) 0);
                class11.field139.method1283(8, var5);
                class11.field139.method1325(0, class232.field3856[82] ? 1 : 0);
                class231.method1643(-2, var23.method903(-99), var23.field1906[0], 0, true, 0, class261.field4201.field1916[0], -1, class261.field4201.field1906[0], var23.method903(-61), var23.field1916[0]);
            }
        }
        if (var4 == 35) {
            class246.field4043++;
            class11.field139.method2224(152, (byte) 0);
            class11.field139.method1315(var3, (byte) 60);
            class11.field139.method1298(var2, -102);
            class11.field139.method1298(var5, -112);
            class269.field4323 = 0;
            class324.field5075 = class196.method1375(var3, (byte) -56);
            class299.field4752 = var2;
        }
        if (var4 == 19) {
            class346.field5335 = class56.field692;
            class345.field5328 = 2;
            class73.field920++;
            class75.field947 = class214.field3480;
            class256.field4142 = 0;
            class11.field139.method2224(232, (byte) 0);
            class11.field139.method1268(class409.field6048 + var2, (byte) -108);
            class11.field139.method1312(class232.field3856[82] ? 1 : 0, -77);
            class11.field139.method1283(8, (int) (var6 >>> 32) & Integer.MAX_VALUE);
            class11.field139.method1283(8, var3 + class444.field6481);
            class351.method2292((byte) 61, var6, var2, var3);
        }
        if (var4 == 48) {
            class50 var24 = class39.field499[var5];
            if (var24 != null) {
                class346.field5335 = class56.field692;
                class85.field1052++;
                class345.field5328 = 2;
                class75.field947 = class214.field3480;
                class256.field4142 = 0;
                class11.field139.method2224(2, (byte) 0);
                class11.field139.method1312(class232.field3856[82] ? 1 : 0, -116);
                class11.field139.method1268(var5, (byte) -108);
                class231.method1643(-2, var24.method903(-114), var24.field1906[0], 0, true, 0, class261.field4201.field1916[0], -1, class261.field4201.field1906[0], var24.method903(-56), var24.field1916[0]);
            }
        }
        if (var4 == 41) {
            class11.field137++;
            class346.field5335 = class56.field692;
            class345.field5328 = 2;
            class256.field4142 = 0;
            class75.field947 = class214.field3480;
            class11.field139.method2224(84, (byte) 0);
            class11.field139.method1283(8, class444.field6481 + var3);
            class11.field139.method1312(class232.field3856[82] ? 1 : 0, -72);
            class11.field139.method1268(var2 + class409.field6048, (byte) -108);
            class11.field139.method1283(8, (int) (var6 >>> 32) & Integer.MAX_VALUE);
            class351.method2292((byte) 61, var6, var2, var3);
        }
        if (var4 == 7) {
            class11.method109(-13853);
            class172 var25 = class196.method1375(var3, (byte) -56);
            class222.field3695 = var5;
            class374.field5639 = 1;
            class288.field4622 = var3;
            class386.field5838 = var2;
            class336.method2219((byte) 6, var25);
            class287.field4606 = "<col=ff9040>" + class155.method1092(true, var5).field1370 + "<col=ffffff>";
            if (class287.field4606 == null) {
                class287.field4606 = "null";
            }
            return;
        }
        if (var4 == 11) {
            class219 var26 = class216.field3517[var5];
            if (var26 != null) {
                class256.field4142 = 0;
                class345.field5328 = 2;
                class135.field2116++;
                class75.field947 = class214.field3480;
                class346.field5335 = class56.field692;
                class11.field139.method2224(104, (byte) 0);
                class11.field139.method1325(0, class232.field3856[82] ? 1 : 0);
                class11.field139.method1298(var5, -34);
                class231.method1643(-2, var26.method903(-72), var26.field1906[0], 0, true, 0, class261.field4201.field1916[0], -1, class261.field4201.field1906[0], var26.method903(-71), var26.field1916[0]);
            }
        }
        if (var4 == 30) {
            class256.field4142 = 0;
            class409.field6063++;
            class75.field947 = class214.field3480;
            class346.field5335 = class56.field692;
            class345.field5328 = 2;
            class11.field139.method2224(167, (byte) 0);
            class11.field139.method1309(var3 + class444.field6481, 115);
            class11.field139.method1268(var2 + class409.field6048, (byte) -108);
            class11.field139.method1309(var5, 114);
            class11.field139.method1317(true, class232.field3856[82] ? 1 : 0);
            class388.method2457(var2, var3, (byte) 56);
        }
        if (var4 == 4) {
            class219 var27 = class216.field3517[var5];
            if (var27 != null) {
                class345.field5328 = 2;
                class346.field5335 = class56.field692;
                class121.field1667++;
                class256.field4142 = 0;
                class75.field947 = class214.field3480;
                class11.field139.method2224(68, (byte) 0);
                class11.field139.method1309(var5, 127);
                class11.field139.method1278(class232.field3856[82] ? 1 : 0, 126);
                class231.method1643(-2, var27.method903(-112), var27.field1906[0], 0, true, 0, class261.field4201.field1916[0], -1, class261.field4201.field1906[0], var27.method903(-34), var27.field1916[0]);
            }
        }
        if (var4 == 1003) {
            class172 var28 = class196.method1375(var3, (byte) -56);
            if (var28 == null || var28.field2720[var2] < 100000) {
                class11.field139.method2224(45, (byte) 0);
                class314.field4945++;
                class11.field139.method1283(8, var5);
            } else {
                class357.method2329(var28.field2720[var2] + " x " + class155.method1092(!arg0, var5).field1370, 0);
            }
            class269.field4323 = 0;
            class324.field5075 = class196.method1375(var3, (byte) -56);
            class299.field4752 = var2;
        }
        if (var4 == 43) {
            class134.field2100++;
            class11.field139.method2224(193, (byte) 0);
            class11.field139.method1315(var3, (byte) 71);
            class11.field139.method1298(var2, -86);
            class11.field139.method1298(class222.field3695, -98);
            class11.field139.method1309(class386.field5838, 123);
            class11.field139.method1315(class288.field4622, (byte) 122);
            class11.field139.method1268(var5, (byte) -108);
            class269.field4323 = 0;
            class324.field5075 = class196.method1375(var3, (byte) -56);
            class299.field4752 = var2;
        }
        if (var4 == 36) {
            class50 var29 = class39.field499[var5];
            if (var29 != null) {
                class346.field5335 = class56.field692;
                class256.field4142 = 0;
                class306.field4849++;
                class345.field5328 = 2;
                class75.field947 = class214.field3480;
                class11.field139.method2224(132, (byte) 0);
                class11.field139.method1317(true, class232.field3856[82] ? 1 : 0);
                class11.field139.method1268(var5, (byte) -108);
                class231.method1643(-2, var29.method903(-70), var29.field1906[0], 0, true, 0, class261.field4201.field1916[0], -1, class261.field4201.field1906[0], var29.method903(-33), var29.field1916[0]);
            }
        }
        if (var4 == 12) {
            class362.field5526++;
            class11.field139.method2224(105, (byte) 0);
            class11.field139.method1315(var3, (byte) 43);
            class11.field139.method1309(var2, 114);
            class11.field139.method1298(var5, -84);
            class269.field4323 = 0;
            class324.field5075 = class196.method1375(var3, (byte) -56);
            class299.field4752 = var2;
        }
        if (var4 == 32) {
            class219 var30 = class216.field3517[var5];
            if (var30 != null) {
                class346.field5335 = class56.field692;
                class345.field5328 = 2;
                class381.field5755++;
                class256.field4142 = 0;
                class75.field947 = class214.field3480;
                class11.field139.method2224(50, (byte) 0);
                class11.field139.method1311(112, class288.field4622);
                class11.field139.method1298(class222.field3695, -45);
                class11.field139.method1268(class386.field5838, (byte) -108);
                class11.field139.method1312(class232.field3856[82] ? 1 : 0, -28);
                class11.field139.method1298(var5, -104);
                class231.method1643(-2, var30.method903(-97), var30.field1906[0], 0, true, 0, class261.field4201.field1916[0], -1, class261.field4201.field1906[0], var30.method903(-125), var30.field1916[0]);
            }
        }
        if (var4 == 26) {
            class75.field947 = class214.field3480;
            class256.field4142 = 0;
            class218.field3585++;
            class345.field5328 = 2;
            class346.field5335 = class56.field692;
            class11.field139.method2224(157, (byte) 0);
            class11.field139.method1315(class288.field4622, (byte) 34);
            class11.field139.method1309(var3 + class444.field6481, 112);
            class11.field139.method1283(8, class222.field3695);
            class11.field139.method1309(class386.field5838, 116);
            class11.field139.method1283(8, class409.field6048 + var2);
            class11.field139.method1298(var5, -79);
            class11.field139.method1325(0, class232.field3856[82] ? 1 : 0);
            class388.method2457(var2, var3, (byte) 56);
        }
        if (var4 == 40) {
            class219 var31 = class216.field3517[var5];
            if (var31 != null) {
                class256.field4142 = 0;
                class73.field924++;
                class346.field5335 = class56.field692;
                class75.field947 = class214.field3480;
                class345.field5328 = 2;
                class11.field139.method2224(147, (byte) 0);
                class11.field139.method1325(0, class232.field3856[82] ? 1 : 0);
                class11.field139.method1309(var5, 122);
                class231.method1643(-2, var31.method903(-59), var31.field1906[0], 0, true, 0, class261.field4201.field1916[0], -1, class261.field4201.field1906[0], var31.method903(-46), var31.field1916[0]);
            }
        }
        if (var4 == 17) {
            class11.field139.method2224(12, (byte) 0);
            class281.field4504++;
            class11.field139.method1315(var3, (byte) 10);
            class11.field139.method1298(var5, -69);
            class11.field139.method1283(8, var2);
            class269.field4323 = 0;
            class324.field5075 = class196.method1375(var3, (byte) -56);
            class299.field4752 = var2;
        }
        if (var4 == 33) {
            class345.field5328 = 2;
            class346.field5335 = class56.field692;
            class58.field744++;
            class256.field4142 = 0;
            class75.field947 = class214.field3480;
            class11.field139.method2224(219, (byte) 0);
            class11.field139.method1268(class386.field5838, (byte) -108);
            class11.field139.method1306(class288.field4622, 1864805768);
            class11.field139.method1298(Integer.MAX_VALUE & (int) (var6 >>> 32), -56);
            class11.field139.method1283(8, class444.field6481 + var3);
            class11.field139.method1278(class232.field3856[82] ? 1 : 0, 124);
            class11.field139.method1298(class222.field3695, -60);
            class11.field139.method1309(class409.field6048 + var2, 122);
            class351.method2292((byte) 61, var6, var2, var3);
        }
        if (var4 == 46) {
            class172 var32 = class201.method1393(var3, var2, -125);
            if (var32 != null) {
                class11.method109(-13853);
                class53 var33 = client.method1149(var32);
                class450.method2800(var32.field2837, var3, var32.field2777, (byte) -52, var2, var33.method353(127), var33.field659);
                class374.field5639 = 0;
                class306.field4854 = class376.method2400((byte) 79, var32);
                if (var32.field2712) {
                    class213.field3414 = var32.field2801 + "<col=ffffff>";
                } else {
                    class213.field3414 = "<col=00ff00>" + var32.field2715 + "<col=ffffff>";
                }
                if (class306.field4854 == null) {
                    class306.field4854 = "Null";
                }
            }
            return;
        }
        if (var4 == 28) {
            class11.field139.method2224(112, (byte) 0);
            class426.field6282++;
            class11.field139.method1315(var3, (byte) 81);
            class11.field139.method1283(8, var2);
            class11.field139.method1268(var5, (byte) -108);
            class269.field4323 = 0;
            class324.field5075 = class196.method1375(var3, (byte) -56);
            class299.field4752 = var2;
        }
        if (var4 == 47) {
            class346.field5335 = class56.field692;
            class141.field2190++;
            class256.field4142 = 0;
            class75.field947 = class214.field3480;
            class345.field5328 = 2;
            class11.field139.method2224(108, (byte) 0);
            class11.field139.method1298(var3 + class444.field6481, -94);
            class11.field139.method1298(class409.field6048 + var2, -121);
            class11.field139.method1283(8, var5);
            class11.field139.method1325(0, class232.field3856[82] ? 1 : 0);
            class388.method2457(var2, var3, (byte) 56);
        }
        if (arg0) {
            method1330((class429) null, -101);
        }
        if (var4 == 50) {
            class256.field4142 = 0;
            class346.field5335 = class56.field692;
            class190.field3105++;
            class345.field5328 = 2;
            class75.field947 = class214.field3480;
            class11.field139.method2224(161, (byte) 0);
            class11.field139.method1309(var3 + class444.field6481, 114);
            class11.field139.method1278(class232.field3856[82] ? 1 : 0, 124);
            class11.field139.method1268(var2 + class409.field6048, (byte) -108);
            class11.field139.method1283(8, (int) (var6 >>> 32) & Integer.MAX_VALUE);
            class351.method2292((byte) 61, var6, var2, var3);
        }
        if (var4 == 2) {
            class219 var34 = class216.field3517[var5];
            if (var34 != null) {
                class346.field5335 = class56.field692;
                class75.field947 = class214.field3480;
                class357.field5458++;
                class256.field4142 = 0;
                class345.field5328 = 2;
                class11.field139.method2224(187, (byte) 0);
                class11.field139.method1268(var5, (byte) -108);
                class11.field139.method1312(class232.field3856[82] ? 1 : 0, -125);
                class231.method1643(-2, var34.method903(-88), var34.field1906[0], 0, true, 0, class261.field4201.field1916[0], -1, class261.field4201.field1906[0], var34.method903(-107), var34.field1916[0]);
            }
        }
        if (var4 == 16) {
            class219 var35 = class216.field3517[var5];
            if (var35 != null) {
                class345.field5328 = 2;
                class256.field4142 = 0;
                class38.field479++;
                class346.field5335 = class56.field692;
                class75.field947 = class214.field3480;
                class11.field139.method2224(42, (byte) 0);
                class11.field139.method1283(8, var5);
                class11.field139.method1312(class232.field3856[82] ? 1 : 0, -108);
                class231.method1643(-2, var35.method903(-92), var35.field1906[0], 0, true, 0, class261.field4201.field1916[0], -1, class261.field4201.field1906[0], var35.method903(-78), var35.field1916[0]);
            }
        }
        if (var4 == 10) {
            class155.method1095(251, false);
        }
        if (var4 == 1008) {
            class345.field5328 = 2;
            class346.field5335 = class56.field692;
            class75.field947 = class214.field3480;
            class390.field5865++;
            class256.field4142 = 0;
            class11.field139.method2224(234, (byte) 0);
            class11.field139.method1283(8, class444.field6481 + var3);
            class11.field139.method1325(0, class232.field3856[82] ? 1 : 0);
            class11.field139.method1309(Integer.MAX_VALUE & (int) (var6 >>> 32), 123);
            class11.field139.method1283(8, class409.field6048 + var2);
            class351.method2292((byte) 61, var6, var2, var3);
        }
        if (var4 == 51) {
            class11.field139.method2224(76, (byte) 0);
            class444.field6474++;
            class11.field139.method1315(var3, (byte) 114);
            class11.field139.method1298(var2, -76);
            class11.field139.method1298(var5, -74);
            class269.field4323 = 0;
            class324.field5075 = class196.method1375(var3, (byte) -56);
            class299.field4752 = var2;
        }
        if (var4 == 1010 || var4 == 1005 || var4 == 1007 || var4 == 1009 || var4 == 1006) {
            class224.method1606(var2, var4, var5, 8852);
        }
        if (var4 == 44) {
            class219 var36 = class216.field3517[var5];
            if (var36 != null) {
                class345.field5328 = 2;
                class418.field6189++;
                class346.field5335 = class56.field692;
                class75.field947 = class214.field3480;
                class256.field4142 = 0;
                class11.field139.method2224(43, (byte) 0);
                class11.field139.method1278(class232.field3856[82] ? 1 : 0, 120);
                class11.field139.method1286((byte) 123, class436.field6419);
                class11.field139.method1298(var5, -85);
                class11.field139.method1283(8, class73.field925);
                class231.method1643(-2, var36.method903(-62), var36.field1906[0], 0, true, 0, class261.field4201.field1916[0], -1, class261.field4201.field1906[0], var36.method903(-115), var36.field1916[0]);
            }
        }
        if (var4 == 57) {
            class345.field5328 = 2;
            class299.field4757++;
            class256.field4142 = 0;
            class346.field5335 = class56.field692;
            class75.field947 = class214.field3480;
            class11.field139.method2224(163, (byte) 0);
            class11.field139.method1283(8, class409.field6048 + var2);
            class11.field139.method1325(0, class232.field3856[82] ? 1 : 0);
            class11.field139.method1268(var3 + class444.field6481, (byte) -108);
            class11.field139.method1283(8, var5);
            class388.method2457(var2, var3, (byte) 56);
        }
        if (var4 == 25 && class143.field2262 == null) {
            class42.method278(var3, var2, (byte) -54);
            class143.field2262 = class201.method1393(var3, var2, -118);
            class336.method2219((byte) 6, class143.field2262);
        }
        if (var4 == 9) {
            class346.field5335 = class56.field692;
            class91.field1130++;
            class75.field947 = class214.field3480;
            class345.field5328 = 2;
            class256.field4142 = 0;
            class11.field139.method2224(78, (byte) 0);
            class11.field139.method1298(var2 + class409.field6048, -90);
            class11.field139.method1317(true, class232.field3856[82] ? 1 : 0);
            class11.field139.method1311(60, class436.field6419);
            class11.field139.method1268(Integer.MAX_VALUE & (int) (var6 >>> 32), (byte) -108);
            class11.field139.method1309(class444.field6481 + var3, 112);
            class11.field139.method1283(8, class73.field925);
            class351.method2292((byte) 61, var6, var2, var3);
        }
        if (class374.field5639 != 0) {
            class374.field5639 = 0;
            class336.method2219((byte) 6, class196.method1375(class288.field4622, (byte) -56));
        }
        if (class449.field6546) {
            class11.method109(-13853);
        }
        if (class324.field5075 != null && class269.field4323 == 0) {
            class336.method2219((byte) 6, class324.field5075);
        }
    }
}
