import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public class class160 implements Runnable {

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "[Ldl;")
    public volatile class27[] field2545 = new class27[2];

    @OriginalMember(owner = "client!lg", name = "g", descriptor = "Z")
    public volatile boolean field2551 = false;

    @OriginalMember(owner = "client!lg", name = "h", descriptor = "Z")
    public volatile boolean field2552 = false;

    @OriginalMember(owner = "client!lg", name = "e", descriptor = "I")
    public static int field2549 = 2;

    @OriginalMember(owner = "client!lg", name = "m", descriptor = "I")
    public static int field2557 = 0;

    @OriginalMember(owner = "client!lg", name = "j", descriptor = "Z")
    public static boolean field2554 = false;

    @OriginalMember(owner = "client!lg", name = "k", descriptor = "Ljava/lang/String;")
    public static String field2555 = "Continue";

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "I")
    public static int field2546;

    @OriginalMember(owner = "client!lg", name = "c", descriptor = "I")
    public static int field2547;

    @OriginalMember(owner = "client!lg", name = "d", descriptor = "I")
    public static int field2548;

    @OriginalMember(owner = "client!lg", name = "f", descriptor = "I")
    public static int field2550;

    @OriginalMember(owner = "client!lg", name = "i", descriptor = "I")
    public static int field2553;

    @OriginalMember(owner = "client!lg", name = "n", descriptor = "Leh;")
    public static class137 field2558;

    @OriginalMember(owner = "client!lg", name = "l", descriptor = "Lcg;")
    public class48 field2556;

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(Z)V")
    public static void method1113(boolean arg0) {
        field2555 = null;
        if (!arg0) {
            field2554 = false;
        }
        field2558 = null;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IC)Z")
    public static final boolean method1114(int arg0, char arg1) {
        field2546++;
        if (arg0 != -123) {
            field2558 = null;
        }
        return arg1 >= '0' && arg1 <= '9' || arg1 >= 'A' && arg1 <= 'Z' || arg1 >= 'a' && arg1 <= 'z';
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(II)V")
    public static final void method1115(int arg0, int arg1) {
        field2547++;
        if (arg1 < 0) {
            return;
        }
        int var2 = class251.field4104[arg1];
        int var3 = class61.field805[arg1];
        int var4 = class155.field2423[arg1];
        if (var4 >= 2000) {
            var4 -= 2000;
        }
        long var5 = class276.field4403[arg1];
        int var7 = (int) class276.field4403[arg1];
        if (var4 == 35) {
            class259 var8 = class89.field1113[var7];
            if (var8 != null) {
                class196.field3129 = 2;
                class211.field3396 = class107.field1449;
                class189.field3061++;
                class141.field2244 = class214.field3435;
                class59.field757 = 0;
                class4.field57.method1932(false, 151);
                class4.field57.method572(true, var7);
                class4.field57.method536(class36.field467[82] ? 1 : 0, (byte) -128);
            }
        }
        if (var4 == 49) {
            class4.field57.method1932(false, 108);
            class4.field57.method574(var3, -1);
            class123 var9 = class61.method358(var3, arg0 + 14602);
            if (var9.field1858 != null && var9.field1858[0][0] == 5) {
                int var10 = var9.field1858[0][1];
                class135.field2141[var10] = 1 - class135.field2141[var10];
                class25.method145(var10, -102);
            }
            class131.field2097++;
        }
        if (var4 == 41) {
            class170.field2699++;
            class4.field57.method1932(false, 59);
            class4.field57.method572(true, var2);
            class4.field57.method573(var3, (byte) -48);
            class4.field57.method553((byte) -90, var7);
            class136.field2159 = 0;
            class130.field2081 = class61.method358(var3, -118);
            class73.field906 = var2;
        }
        if (var4 == 29) {
            class211.field3396 = class107.field1449;
            class141.field2244 = class214.field3435;
            class196.field3129 = 2;
            class59.field757 = 0;
            class4.field57.method1932(false, 225);
            class4.field57.method553((byte) -98, (int) (var5 >>> 32) & Integer.MAX_VALUE);
            class150.field2342++;
            class4.field57.method572(true, class167.field2683 + var2);
            class4.field57.method580((byte) 125, class36.field467[82] ? 1 : 0);
            class4.field57.method572(true, var3 + class181.field2883);
        }
        if (var4 == 1) {
            class200 var11 = class265.field4273[var7];
            if (var11 != null) {
                class196.field3129 = 2;
                class59.field757 = 0;
                class141.field2244 = class214.field3435;
                class211.field3396 = class107.field1449;
                class4.field57.method1932(false, 200);
                class187.field2976++;
                class4.field57.method543((byte) -83, class36.field467[82] ? 1 : 0);
                class4.field57.method568(var7, (byte) 74);
            }
        }
        if (var4 == 26) {
            class211.field3396 = class107.field1449;
            class88.field1081++;
            class196.field3129 = 2;
            class141.field2244 = class214.field3435;
            class59.field757 = 0;
            class4.field57.method1932(false, 165);
            class4.field57.method536(class36.field467[82] ? 1 : 0, (byte) -127);
            class4.field57.method553((byte) -96, (int) (var5 >>> 32) & Integer.MAX_VALUE);
            class4.field57.method568(class181.field2883 + var3, (byte) -24);
            class4.field57.method591(arg0 + 594203564, class167.field2683 + var2);
        }
        if (var4 == 23) {
            class278.method1858(-1);
            class123 var12 = class61.method358(var3, arg0 ^ 0x39F4);
            class275.field4397 = var7;
            class215.field3464 = var3;
            class126.field2032 = var2;
            class32.field432 = 1;
            class129.method875((byte) -21, var12);
            class138.field2217 = "<col=ff9040>" + class256.method1753(-2, var7).field1504 + "<col=ffffff>";
            if (class138.field2217 == null) {
                class138.field2217 = "null";
            }
            return;
        }
        if (var4 == 58) {
            class259 var13 = class89.field1113[var7];
            if (var13 != null) {
                class4.field64++;
                class141.field2244 = class214.field3435;
                class211.field3396 = class107.field1449;
                class59.field757 = 0;
                class196.field3129 = 2;
                class4.field57.method1932(false, 118);
                class4.field57.method561(class36.field467[82] ? 1 : 0, true);
                class4.field57.method591(594188840, var7);
            }
        }
        if (var4 == 50) {
            class259 var14 = class89.field1113[var7];
            if (var14 != null) {
                class113.field1629++;
                class211.field3396 = class107.field1449;
                class141.field2244 = class214.field3435;
                class196.field3129 = 2;
                class59.field757 = 0;
                class4.field57.method1932(false, 34);
                class4.field57.method561(class36.field467[82] ? 1 : 0, true);
                class4.field57.method572(true, var7);
            }
        }
        if (var4 == 25) {
            class141.field2244 = class214.field3435;
            class196.field3129 = 2;
            class211.field3396 = class107.field1449;
            class101.field1368++;
            class59.field757 = 0;
            class4.field57.method1932(false, 251);
            class4.field57.method553((byte) -82, class126.field2032);
            class4.field57.method574(class215.field3464, -1);
            class4.field57.method553((byte) -98, var7);
            class4.field57.method568(class275.field4397, (byte) -27);
            class4.field57.method591(594188840, class167.field2683 + var2);
            class4.field57.method580((byte) 90, class36.field467[82] ? 1 : 0);
            class4.field57.method591(594188840, class181.field2883 + var3);
        }
        if (var4 == 13) {
            class211.field3396 = class107.field1449;
            class59.field757 = 0;
            class196.field3129 = 2;
            class141.field2244 = class214.field3435;
            class4.field57.method1932(false, 132);
            class4.field57.method572(true, class167.field2683 + var2);
            class4.field57.method536(class36.field467[82] ? 1 : 0, (byte) -127);
            class4.field57.method591(arg0 + 594203564, var7);
            class292.field4637++;
            class4.field57.method568(var3 + class181.field2883, (byte) -70);
        }
        if (var4 == 36) {
            class141.field2244 = class214.field3435;
            class139.field2236++;
            class211.field3396 = class107.field1449;
            class59.field757 = 0;
            class196.field3129 = 2;
            class4.field57.method1932(false, 230);
            class4.field57.method553((byte) -102, class181.field2883 + var3);
            class4.field57.method536(class36.field467[82] ? 1 : 0, (byte) -128);
            class4.field57.method568(class167.field2683 + var2, (byte) -112);
            class4.field57.method591(594188840, (int) (var5 >>> 32) & Integer.MAX_VALUE);
        }
        if (var4 == 10) {
            class166.field2675++;
            class4.field57.method1932(false, 162);
            class4.field57.method591(arg0 + 594203564, var7);
            class4.field57.method594(var3, (byte) 127);
            class4.field57.method572(true, var2);
            class136.field2159 = 0;
            class130.field2081 = class61.method358(var3, -120);
            class73.field906 = var2;
        }
        if (var4 == 44) {
            class211.field3396 = class107.field1449;
            class59.field757 = 0;
            class236.field3906++;
            class196.field3129 = 2;
            class141.field2244 = class214.field3435;
            class4.field57.method1932(false, 125);
            class4.field57.method553((byte) -87, var3 + class181.field2883);
            class4.field57.method543((byte) -83, class36.field467[82] ? 1 : 0);
            class4.field57.method591(594188840, (int) (var5 >>> 32) & Integer.MAX_VALUE);
            class4.field57.method568(class167.field2683 + var2, (byte) 83);
        }
        if (var4 == 57) {
            if (var7 == 0) {
                class203.field3204 = 1;
                class162.method1125(class244.field4011, var2, var3);
            } else if (var7 == 1) {
                class4.field57.method1932(false, 44);
                class4.field57.method553((byte) -101, class167.field2683 + var2);
                class60.field763++;
                class4.field57.method568(class236.field3913, (byte) -109);
                class4.field57.method572(true, class181.field2883 + var3);
                class4.field57.method594(class236.field3911, (byte) 114);
            }
        }
        if (var4 == 45) {
            class259 var15 = class89.field1113[var7];
            if (var15 != null) {
                class196.field3129 = 2;
                class46.field589++;
                class211.field3396 = class107.field1449;
                class59.field757 = 0;
                class141.field2244 = class214.field3435;
                class4.field57.method1932(false, 56);
                class4.field57.method553((byte) -126, var7);
                class4.field57.method574(class236.field3911, arg0 ^ 0x3983);
                class4.field57.method580((byte) 119, class36.field467[82] ? 1 : 0);
                class4.field57.method553((byte) -120, class236.field3913);
            }
        }
        if (var4 == 2) {
            class237.field3918++;
            class196.field3129 = 2;
            class211.field3396 = class107.field1449;
            class141.field2244 = class214.field3435;
            class59.field757 = 0;
            class4.field57.method1932(false, 70);
            class4.field57.method536(class36.field467[82] ? 1 : 0, (byte) -127);
            class4.field57.method572(true, class167.field2683 + var2);
            class4.field57.method594(class236.field3911, (byte) 115);
            class4.field57.method568(var7, (byte) 79);
            class4.field57.method568(class236.field3913, (byte) 85);
            class4.field57.method591(arg0 ^ 0xDC955C54, class181.field2883 + var3);
        }
        if (var4 == 32) {
            class196.field3129 = 2;
            class141.field2244 = class214.field3435;
            class59.field757 = 0;
            class44.field574++;
            class211.field3396 = class107.field1449;
            class4.field57.method1932(false, 194);
            class4.field57.method568(var2 + class167.field2683, (byte) -43);
            class4.field57.method572(true, class181.field2883 + var3);
            class4.field57.method568(var7, (byte) -63);
            class4.field57.method580((byte) 64, class36.field467[82] ? 1 : 0);
        }
        if (var4 == 60) {
            class259 var16 = class89.field1113[var7];
            if (var16 != null) {
                class59.field757 = 0;
                class196.field3129 = 2;
                class141.field2244 = class214.field3435;
                class211.field3396 = class107.field1449;
                class4.field57.method1932(false, 157);
                class22.field296++;
                class4.field57.method580((byte) 104, class36.field467[82] ? 1 : 0);
                class4.field57.method568(var7, (byte) 85);
            }
        }
        if (var4 == 15) {
            class259 var17 = class89.field1113[var7];
            if (var17 != null) {
                class59.field757 = 0;
                class141.field2244 = class214.field3435;
                class47.field596++;
                class211.field3396 = class107.field1449;
                class196.field3129 = 2;
                class4.field57.method1932(false, 207);
                class4.field57.method568(var7, (byte) 102);
                class4.field57.method561(class36.field467[82] ? 1 : 0, true);
            }
        }
        if (var4 == 4) {
            class23.field304++;
            class4.field57.method1932(false, 109);
            class4.field57.method553((byte) -98, var7);
            class4.field57.method553((byte) -85, class236.field3913);
            class4.field57.method574(class236.field3911, -1);
            class4.field57.method553((byte) -100, var2);
            class4.field57.method573(var3, (byte) -48);
            class136.field2159 = 0;
            class130.field2081 = class61.method358(var3, -120);
            class73.field906 = var2;
        }
        if (var4 == 59) {
            class141.field2244 = class214.field3435;
            class196.field3129 = 2;
            class59.field757 = 0;
            class211.field3396 = class107.field1449;
            class4.field57.method1932(false, 193);
            class294.field4659++;
            class4.field57.method568(var3 + class181.field2883, (byte) 98);
            class4.field57.method561(class36.field467[82] ? 1 : 0, true);
            class4.field57.method591(arg0 + 594203564, var7);
            class4.field57.method553((byte) -97, class167.field2683 + var2);
        }
        if (var4 == 3) {
            class85.field1052++;
            class59.field757 = 0;
            class141.field2244 = class214.field3435;
            class196.field3129 = 2;
            class211.field3396 = class107.field1449;
            class4.field57.method1932(false, 99);
            class4.field57.method553((byte) -128, class167.field2683 + var2);
            class4.field57.method572(true, class181.field2883 + var3);
            class4.field57.method591(594188840, var7);
            class4.field57.method536(class36.field467[82] ? 1 : 0, (byte) -128);
        }
        if (var4 == 30) {
            class220.field3514++;
            class4.field57.method1932(false, 29);
            class4.field57.method594(var3, (byte) 110);
            class4.field57.method572(true, var7);
            class4.field57.method568(var2, (byte) 103);
            class136.field2159 = 0;
            class130.field2081 = class61.method358(var3, arg0 + 14602);
            class73.field906 = var2;
        }
        if (var4 == 51) {
            class200 var18 = class265.field4273[var7];
            if (var18 != null) {
                class59.field757 = 0;
                class141.field2244 = class214.field3435;
                class211.field3396 = class107.field1449;
                class196.field3129 = 2;
                class296.field4679++;
                class4.field57.method1932(false, 199);
                class4.field57.method594(class215.field3464, (byte) 115);
                class4.field57.method568(class126.field2032, (byte) 110);
                class4.field57.method536(class36.field467[82] ? 1 : 0, (byte) -127);
                class4.field57.method572(true, var7);
                class4.field57.method591(594188840, class275.field4397);
            }
        }
        if (var4 == 19) {
            class196.field3129 = 2;
            class141.field2244 = class214.field3435;
            class59.field757 = 0;
            class94.field1189++;
            class211.field3396 = class107.field1449;
            class4.field57.method1932(false, 245);
            class4.field57.method572(true, class167.field2683 + var2);
            class4.field57.method591(594188840, var7);
            class4.field57.method572(true, class181.field2883 + var3);
            class4.field57.method561(class36.field467[82] ? 1 : 0, true);
        }
        if (var4 == 18) {
            class4.field57.method1932(false, 212);
            class165.field2627++;
            class4.field57.method568(var7, (byte) -15);
            class4.field57.method541(125, var3);
            class4.field57.method553((byte) -90, var2);
            class136.field2159 = 0;
            class130.field2081 = class61.method358(var3, arg0 ^ 0x39F9);
            class73.field906 = var2;
        }
        if (var4 == 11) {
            class4.field57.method1932(false, 131);
            class4.field57.method568(class275.field4397, (byte) 76);
            class182.field2895++;
            class4.field57.method594(var3, (byte) 116);
            class4.field57.method591(arg0 + 594203564, var7);
            class4.field57.method591(594188840, class126.field2032);
            class4.field57.method594(class215.field3464, (byte) 123);
            class4.field57.method568(var2, (byte) 104);
            class136.field2159 = 0;
            class130.field2081 = class61.method358(var3, -120);
            class73.field906 = var2;
        }
        if (var4 == 6 || var4 == 1004) {
            class82.method454((byte) -100, var7, var2, var3, class78.field977[arg1]);
        }
        if (var4 == 47) {
            class200 var19 = class265.field4273[var7];
            if (var19 != null) {
                class141.field2244 = class214.field3435;
                class196.field3129 = 2;
                class105.field1415++;
                class59.field757 = 0;
                class211.field3396 = class107.field1449;
                class4.field57.method1932(false, 159);
                class4.field57.method553((byte) -87, class236.field3913);
                class4.field57.method553((byte) -114, var7);
                class4.field57.method543((byte) -83, class36.field467[82] ? 1 : 0);
                class4.field57.method594(class236.field3911, (byte) 108);
            }
        }
        if (var4 == 42) {
            class123 var20 = class247.method1714(var2, var3, 0);
            if (var20 != null) {
                class278.method1858(-1);
                class171 var21 = client.method735(var20);
                class103.method624(var20.field1738, var20.field1889, var21.field2709, var21.method1171(arg0 + 14614), -88, var3, var2);
                class32.field432 = 0;
                class283.field4511 = class119.method768(var20, false);
                if (var20.field1796) {
                    class144.field2284 = var20.field1817 + "<col=ffffff>";
                } else {
                    class144.field2284 = "<col=00ff00>" + var20.field1846 + "<col=ffffff>";
                }
                if (class283.field4511 == null) {
                    class283.field4511 = "Null";
                }
            }
            return;
        }
        if (var4 == 38) {
            class259 var22 = class89.field1113[var7];
            if (var22 != null) {
                class240.field3958++;
                class211.field3396 = class107.field1449;
                class196.field3129 = 2;
                class141.field2244 = class214.field3435;
                class59.field757 = 0;
                class4.field57.method1932(false, 27);
                class4.field57.method572(true, var7);
                class4.field57.method561(class36.field467[82] ? 1 : 0, true);
            }
        }
        if (var4 == 12) {
            class259 var23 = class89.field1113[var7];
            if (var23 != null) {
                class94.field1196++;
                class196.field3129 = 2;
                class141.field2244 = class214.field3435;
                class59.field757 = 0;
                class211.field3396 = class107.field1449;
                class4.field57.method1932(false, 184);
                class4.field57.method568(var7, (byte) 126);
                class4.field57.method543((byte) -83, class36.field467[82] ? 1 : 0);
            }
        }
        if (var4 == 16) {
            class200 var24 = class265.field4273[var7];
            if (var24 != null) {
                class108.field1496++;
                class196.field3129 = 2;
                class211.field3396 = class107.field1449;
                class59.field757 = 0;
                class141.field2244 = class214.field3435;
                class4.field57.method1932(false, 153);
                class4.field57.method572(true, var7);
                class4.field57.method543((byte) -83, class36.field467[82] ? 1 : 0);
            }
        }
        if (var4 == 14) {
            class200 var25 = class265.field4273[var7];
            if (var25 != null) {
                class196.field3129 = 2;
                class59.field757 = 0;
                class194.field3106++;
                class141.field2244 = class214.field3435;
                class211.field3396 = class107.field1449;
                class4.field57.method1932(false, 98);
                class4.field57.method572(true, var7);
                class4.field57.method536(class36.field467[82] ? 1 : 0, (byte) -127);
            }
        }
        if (var4 == 1007) {
            class209.field3339++;
            class59.field757 = 0;
            class211.field3396 = class107.field1449;
            class141.field2244 = class214.field3435;
            class196.field3129 = 2;
            class4.field57.method1932(false, 120);
            class4.field57.method572(true, var7);
        }
        if (var4 == 43) {
            class4.field57.method1932(false, 108);
            class131.field2097++;
            class4.field57.method574(var3, arg0 ^ 0x3983);
            class123 var26 = class61.method358(var3, arg0 + 14596);
            if (var26.field1858 != null && var26.field1858[0][0] == 5) {
                int var27 = var26.field1858[0][1];
                if (class135.field2141[var27] != var26.field1768[0]) {
                    class135.field2141[var27] = var26.field1768[0];
                    class25.method145(var27, -57);
                }
            }
        }
        if (var4 == 37) {
            class59.field757 = 0;
            class211.field3396 = class107.field1449;
            class14.field183++;
            class141.field2244 = class214.field3435;
            class196.field3129 = 2;
            class4.field57.method1932(false, 47);
            class4.field57.method574(class236.field3911, -1);
            class4.field57.method572(true, class181.field2883 + var3);
            class4.field57.method568(class236.field3913, (byte) -18);
            class4.field57.method536(class36.field467[82] ? 1 : 0, (byte) -127);
            class4.field57.method553((byte) -123, var2 + class167.field2683);
            class4.field57.method568((int) (var5 >>> 32) & Integer.MAX_VALUE, (byte) -87);
        }
        if (var4 == 9) {
            class226.field3634++;
            class4.field57.method1932(false, 227);
            class4.field57.method572(true, class236.field3913);
            class4.field57.method574(var3, -1);
            class4.field57.method572(true, var2);
            class4.field57.method573(class236.field3911, (byte) -48);
        }
        if (arg0 != -14724) {
            method1114(-41, (char) 65433);
        }
        if (var4 == 1002) {
            class129.field2079++;
            class196.field3129 = 2;
            class211.field3396 = class107.field1449;
            class141.field2244 = class214.field3435;
            class59.field757 = 0;
            class4.field57.method1932(false, 237);
            class4.field57.method553((byte) -110, var7);
        }
        if (var4 == 1006) {
            class59.field757 = 0;
            class31.field421++;
            class141.field2244 = class214.field3435;
            class211.field3396 = class107.field1449;
            class196.field3129 = 2;
            class4.field57.method1932(false, 82);
            class4.field57.method572(true, class181.field2883 + var3);
            class4.field57.method572(true, Integer.MAX_VALUE & (int) (var5 >>> 32));
            class4.field57.method591(594188840, class167.field2683 + var2);
            class4.field57.method580((byte) 61, class36.field467[82] ? 1 : 0);
        }
        if (var4 == 48) {
            class259 var28 = class89.field1113[var7];
            if (var28 != null) {
                class141.field2244 = class214.field3435;
                class59.field757 = 0;
                class211.field3396 = class107.field1449;
                class201.field3181++;
                class196.field3129 = 2;
                class4.field57.method1932(false, 130);
                class4.field57.method543((byte) -83, class36.field467[82] ? 1 : 0);
                class4.field57.method591(594188840, var7);
                class4.field57.method568(class275.field4397, (byte) 76);
                class4.field57.method553((byte) -106, class126.field2032);
                class4.field57.method541(125, class215.field3464);
            }
        }
        if (var4 == 20) {
            boolean var29 = true;
            class123 var30 = class61.method358(var3, -119);
            if (var30.field1848 > 0) {
                var29 = class60.method353(var30, -22460);
            }
            if (var29) {
                class131.field2097++;
                class4.field57.method1932(false, 108);
                class4.field57.method574(var3, arg0 ^ 0x3983);
            }
        }
        if (var4 == 39) {
            class259 var31 = class89.field1113[var7];
            if (var31 != null) {
                class59.field757 = 0;
                class122.field1730++;
                class211.field3396 = class107.field1449;
                class141.field2244 = class214.field3435;
                class196.field3129 = 2;
                class4.field57.method1932(false, 241);
                class4.field57.method580((byte) 113, class36.field467[82] ? 1 : 0);
                class4.field57.method591(594188840, var7);
            }
        }
        if (var4 == 24) {
            class200 var32 = class265.field4273[var7];
            if (var32 != null) {
                class211.field3396 = class107.field1449;
                class59.field757 = 0;
                class196.field3129 = 2;
                class137.field2179++;
                class141.field2244 = class214.field3435;
                class4.field57.method1932(false, 58);
                class4.field57.method553((byte) -126, var7);
                class4.field57.method536(class36.field467[82] ? 1 : 0, (byte) -127);
            }
        }
        if (var4 == 28) {
            class4.field57.method1932(false, 103);
            class75.field946++;
            class4.field57.method553((byte) -77, var2);
            class4.field57.method591(arg0 ^ 0xDC955C54, var7);
            class4.field57.method594(var3, (byte) 116);
            class136.field2159 = 0;
            class130.field2081 = class61.method358(var3, -118);
            class73.field906 = var2;
        }
        if (var4 == 8) {
            class185.field2951++;
            class4.field57.method1932(false, 158);
            class4.field57.method591(594188840, var2);
            class4.field57.method594(var3, (byte) 123);
            class4.field57.method568(var7, (byte) 95);
            class136.field2159 = 0;
            class130.field2081 = class61.method358(var3, -119);
            class73.field906 = var2;
        }
        if (var4 == 33) {
            if (var7 == 0) {
                class162.method1125(class244.field4011, var2, var3);
            } else if (var7 == 1) {
                if (class184.field2944 > 0 && class36.field467[82] && class36.field467[81]) {
                    class161.method1122(class244.field4011, class167.field2683 + var2, class181.field2883 + var3, (byte) 35);
                } else {
                    class184.method1292(var2, (byte) -126, 1, var3);
                    class4.field57.method580((byte) 88, class53.field686);
                    class4.field57.method580((byte) 60, class222.field3580);
                    class4.field57.method572(true, (int) class226.field3639);
                    class4.field57.method580((byte) 100, 57);
                    class4.field57.method580((byte) 124, class84.field1045);
                    class4.field57.method580((byte) 94, class14.field185);
                    class4.field57.method580((byte) 84, 89);
                    class4.field57.method572(true, class286.field4571.field3818);
                    class4.field57.method572(true, class286.field4571.field3820);
                    class4.field57.method580((byte) 109, class129.field2068);
                    class4.field57.method580((byte) 92, 63);
                }
            }
        }
        if (var4 == 22) {
            if (var7 == 0) {
                class116.field1654 = 1;
                class162.method1125(class244.field4011, var2, var3);
            } else if (class184.field2944 > 0 && class36.field467[82] && class36.field467[81]) {
                class161.method1122(class244.field4011, class167.field2683 + var2, class181.field2883 + var3, (byte) 35);
            } else {
                class4.field57.method1932(false, 9);
                class251.field4094++;
                class4.field57.method572(true, class167.field2683 + var2);
                class4.field57.method553((byte) -112, class181.field2883 + var3);
            }
        }
        if (var4 == 7) {
            class2.method12(true);
        }
        if (var4 == 1001) {
            class123 var33 = class61.method358(var3, -119);
            if (var33 == null || var33.field1905[var2] < 100000) {
                class129.field2079++;
                class4.field57.method1932(false, 237);
                class4.field57.method553((byte) -111, var7);
            } else {
                class211.method1487(var33.field1905[var2] + " x " + class256.method1753(-2, var7).field1504, "", 0, (byte) -127);
            }
            class136.field2159 = 0;
            class130.field2081 = class61.method358(var3, -128);
            class73.field906 = var2;
        }
        if (var4 == 34) {
            class4.field57.method1932(false, 234);
            class236.field3894++;
            class4.field57.method553((byte) -84, var7);
            class4.field57.method553((byte) -128, var2);
            class4.field57.method594(var3, (byte) 127);
            class136.field2159 = 0;
            class130.field2081 = class61.method358(var3, arg0 ^ 0x39FC);
            class73.field906 = var2;
        }
        if (var4 == 5) {
            class84.field1039++;
            class4.field57.method1932(false, 28);
            class4.field57.method553((byte) -121, var2);
            class4.field57.method591(594188840, var7);
            class4.field57.method574(var3, -1);
            class136.field2159 = 0;
            class130.field2081 = class61.method358(var3, -122);
            class73.field906 = var2;
        }
        if (var4 == 40) {
            class264.field4261++;
            class4.field57.method1932(false, 195);
            class4.field57.method568(var2, (byte) -65);
            class4.field57.method568(var7, (byte) 111);
            class4.field57.method574(var3, -1);
            class136.field2159 = 0;
            class130.field2081 = class61.method358(var3, -122);
            class73.field906 = var2;
        }
        if (var4 == 1003) {
            class211.field3396 = class107.field1449;
            class141.field2244 = class214.field3435;
            class59.field757 = 0;
            class196.field3129 = 2;
            class200 var34 = class265.field4273[var7];
            if (var34 != null) {
                class188 var35 = var34.field3166;
                if (var35.field3004 != null) {
                    var35 = var35.method1314(-1);
                }
                if (var35 != null) {
                    class4.field57.method1932(false, 146);
                    class116.field1652++;
                    class4.field57.method591(594188840, var35.field3028);
                }
            }
        }
        if (var4 == 17) {
            class165.field2644++;
            class4.field57.method1932(false, 181);
            class4.field57.method572(true, var2);
            class4.field57.method573(var3, (byte) -48);
            class4.field57.method572(true, var7);
            class136.field2159 = 0;
            class130.field2081 = class61.method358(var3, -127);
            class73.field906 = var2;
        }
        if (var4 == 21) {
            class141.field2244 = class214.field3435;
            class211.field3396 = class107.field1449;
            class196.field3129 = 2;
            class59.field757 = 0;
            class4.field57.method1932(false, 67);
            class4.field57.method573(class215.field3464, (byte) -48);
            class116.field1649++;
            class4.field57.method572(true, class126.field2032);
            class4.field57.method553((byte) -80, class275.field4397);
            class4.field57.method553((byte) -71, var2 + class167.field2683);
            class4.field57.method572(true, class181.field2883 + var3);
            class4.field57.method580((byte) 92, class36.field467[82] ? 1 : 0);
            class4.field57.method591(arg0 ^ 0xDC955C54, (int) (var5 >>> 32) & Integer.MAX_VALUE);
        }
        if (var4 == 31) {
            class200 var36 = class265.field4273[var7];
            if (var36 != null) {
                class196.field3129 = 2;
                class170.field2694++;
                class141.field2244 = class214.field3435;
                class211.field3396 = class107.field1449;
                class59.field757 = 0;
                class4.field57.method1932(false, 42);
                class4.field57.method536(class36.field467[82] ? 1 : 0, (byte) -128);
                class4.field57.method553((byte) -128, var7);
            }
        }
        if (var4 == 46 && class108.field1486 == null) {
            class201.method1402(var3, var2, (byte) -91);
            class108.field1486 = class247.method1714(var2, var3, 0);
            class129.method875((byte) -21, class108.field1486);
        }
        if (class32.field432 != 0) {
            class32.field432 = 0;
            class129.method875((byte) -21, class61.method358(class215.field3464, -121));
        }
        if (class247.field4076) {
            class278.method1858(-1);
        }
        if (class130.field2081 != null && class136.field2159 == 0) {
            class129.method875((byte) -21, class130.field2081);
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IB)Lsd;")
    public static final class34 method1116(int arg0, byte arg1) {
        class34 var2 = (class34) class287.field4577.method1693((long) arg0, arg1 + 153);
        field2553++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class240.field3954.method928(class34.method183(-120, arg0), (byte) 114, class18.method96(arg1 ^ 0xFFFFFF83, arg0));
        class34 var4 = new class34();
        if (var3 != null) {
            var4.method185(new class96(var3), (byte) -126);
        }
        class287.field4577.method1694(true, (long) arg0, var4);
        return arg1 == -35 ? var4 : null;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1117(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg4 >= -3) {
            field2555 = null;
        }
        field2548++;
        if (arg6 == arg7) {
            class45.method252(arg2, true, arg5, arg7, arg0, arg1, arg3);
        } else if (arg3 - arg7 >= class116.field1653 && (arg3 + arg7) <= class114.field1634 && class117.field1656 <= arg2 - arg6 && class132.field2105 >= (arg2 + arg6)) {
            class82.method452(arg1, arg3, arg6, arg0, 124, arg2, arg7, arg5);
        } else {
            class23.method132(arg5, arg6, arg2, arg0, arg7, arg1, arg3, 69615681);
        }
    }

    @OriginalMember(owner = "client!lg", name = "run", descriptor = "()V")
    public final void run() {
        field2550++;
        this.field2552 = true;
        try {
            while (!this.field2551) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class27 var2 = this.field2545[var1];
                    if (var2 != null) {
                        var2.method158(8);
                    }
                }
                class115.method752((byte) -62, 10L);
                class296.method1982(this.field2556, (byte) -73, (Object) null);
            }
        } catch (Exception var9) {
            class30.method168((byte) -40, var9, (String) null);
        } finally {
            Object var6 = null;
            this.field2552 = false;
        }
    }
}
