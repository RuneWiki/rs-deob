import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public class class309 {

    @OriginalMember(owner = "client!al", name = "a", descriptor = "Lcd;")
    public static class64 field5255 = class44.method335((byte) 71, "n");

    @OriginalMember(owner = "client!al", name = "h", descriptor = "Lcd;")
    private static class64 field5262 = class44.method335((byte) 71, "Loaded wordpack");

    @OriginalMember(owner = "client!al", name = "b", descriptor = "Lcd;")
    public static class64 field5256 = field5262;

    @OriginalMember(owner = "client!al", name = "f", descriptor = "Lcd;")
    public static class64 field5260 = class44.method335((byte) 71, "::cardmem");

    @OriginalMember(owner = "client!al", name = "c", descriptor = "I")
    public static int field5257;

    @OriginalMember(owner = "client!al", name = "d", descriptor = "I")
    public static int field5258;

    @OriginalMember(owner = "client!al", name = "e", descriptor = "I")
    public static int field5259;

    @OriginalMember(owner = "client!al", name = "g", descriptor = "I")
    public static int field5261;

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(I)V", line = 33)
    public static void method2143(int arg0) {
        field5262 = null;
        if (arg0 != -22872) {
            method2145(true, -108, (class60) null, 85, 54);
        }
        field5260 = null;
        field5255 = null;
        field5256 = null;
    }

    @OriginalMember(owner = "client!al", name = "b", descriptor = "(I)V", line = 51)
    public static final void method2144(int arg0) {
        field5261++;
        if (class110.method801(arg0 - 2057790534) != 2) {
            return;
        }
        byte var1 = (byte) (class26.field426 - 4 & 0xFF);
        int var2 = class26.field426 % 104;
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var4 = 0; var4 < 104; var4++) {
                class264.field4528[var3][var2][var4] = var1;
            }
        }
        if (arg0 != 2057790535) {
            method2144(-109);
        }
        if (class20.field364 == 3) {
            return;
        }
        for (int var5 = 0; var5 < 2; var5++) {
            class138.field2455[var5] = -1000000;
            class159.field2809[var5] = 1000000;
            class103.field1869[var5] = 0;
            class211.field3568[var5] = 1000000;
            class114.field2104[var5] = 0;
        }
        if (class238.field4054 != 1) {
            int var6 = class15.method169(class119.field2156, 13257, class20.field364, class99.field1791);
            if ((var6 - class268.field4622) < 800 && (class82.field1508[class20.field364][class99.field1791 >> 7][class119.field2156 >> 7] & 0x4) != 0) {
                class118.method842(class119.field2156 >> 7, 4095, class99.field1791 >> 7, 1, class304.field5203, false);
            }
            return;
        }
        if ((class82.field1508[class20.field364][class139.field2472.field1859 >> 7][class139.field2472.field1865 >> 7] & 0x4) != 0) {
            class118.method842(class139.field2472.field1865 >> 7, 4095, class139.field2472.field1859 >> 7, 0, class304.field5203, false);
        }
        if (class131.field2336 >= 310) {
            return;
        }
        int var7 = class99.field1791 >> 7;
        int var8 = class119.field2156 >> 7;
        int var9 = class139.field2472.field1859 >> 7;
        int var10;
        if (var7 < var9) {
            var10 = var9 - var7;
        } else {
            var10 = var7 - var9;
        }
        int var11 = class139.field2472.field1865 >> 7;
        int var12;
        if (var8 >= var11) {
            var12 = var8 - var11;
        } else {
            var12 = var11 - var8;
        }
        if (var12 < var10) {
            int var15 = 32768;
            int var16 = var12 * 65536 / var10;
            while (var7 != var9) {
                if (var7 < var9) {
                    var7++;
                } else if (var9 < var7) {
                    var7--;
                }
                if ((class82.field1508[class20.field364][var7][var8] & 0x4) != 0) {
                    class118.method842(var8, 4095, var7, 1, class304.field5203, false);
                    break;
                }
                var15 += var16;
                if (var15 >= 65536) {
                    if (var8 < var11) {
                        var8++;
                    } else if (var8 > var11) {
                        var8--;
                    }
                    var15 -= 65536;
                    if ((class82.field1508[class20.field364][var7][var8] & 0x4) != 0) {
                        class118.method842(var8, arg0 ^ 0x7AA76BB8, var7, 1, class304.field5203, false);
                        break;
                    }
                }
            }
            return;
        }
        int var13 = var10 * 65536 / var12;
        int var14 = 32768;
        while (var8 != var11) {
            if (var11 > var8) {
                var8++;
            } else if (var11 < var8) {
                var8--;
            }
            if ((class82.field1508[class20.field364][var7][var8] & 0x4) != 0) {
                class118.method842(var8, arg0 - 2057786440, var7, 1, class304.field5203, false);
                break;
            }
            var14 += var13;
            if (var14 >= 65536) {
                var14 -= 65536;
                if (var9 > var7) {
                    var7++;
                } else if (var9 < var7) {
                    var7--;
                }
                if ((class82.field1508[class20.field364][var7][var8] & 0x4) != 0) {
                    class118.method842(var8, arg0 - 2057786440, var7, 1, class304.field5203, false);
                    break;
                }
            }
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(ZILja;II)V", line = 246)
    public static final void method2145(boolean arg0, int arg1, class60 arg2, int arg3, int arg4) {
        class246.method1778(5);
        field5257++;
        if (class123.field2216) {
            class21.method209(arg1, arg3, arg2.field1163 + arg1, arg2.field1016 + arg3);
        } else {
            class210.method1470(arg1, arg3, arg1 + arg2.field1163, arg3 - -arg2.field1016);
        }
        if (arg0) {
            field5255 = (class64) null;
        }
        if (class11.field227 != 2 && class11.field227 != 5 && class63.field1218 != null) {
            int var5 = 464 - (class139.field2472.field1865 / 32);
            int var6 = class241.field4157 + class154.field2734 & 0x7FF;
            int var7 = class139.field2472.field1859 / 32 + 48;
            if (class123.field2216) {
                ((class136) class63.field1218).method971(arg1, arg3, arg2.field1163, arg2.field1016, var7, var5, var6, class277.field4766 + 256, (class136) arg2.method463(false, 255));
            } else {
                ((class127) class63.field1218).method913(arg1, arg3, arg2.field1163, arg2.field1016, var7, var5, var6, class277.field4766 + 256, arg2.field1079, arg2.field1019);
            }
            if (class125.field2262 != null) {
                for (int var8 = 0; var8 < class125.field2262.field4886; var8++) {
                    if (class125.field2262.method1973(var8, 4)) {
                        int var9 = (class125.field2262.field4878[var8] - class190.field3269) * 4 + 2 - (class139.field2472.field1859 / 32);
                        int var10 = class50.field826[var6];
                        int var11 = var10 * 256 / (class277.field4766 + 256);
                        int var12 = class50.field820[var6];
                        int var13 = var12 * 256 / (class277.field4766 + 256);
                        int var14 = (class125.field2262.field4884[var8] - class121.field2184) * 4 + 2 - (class139.field2472.field1865 / 32);
                        class179 var15 = class180.field3091;
                        int var16 = var13 * var14 - (var9 * var11) >> 16;
                        int var17 = var11 * var14 + (var9 * var13) >> 16;
                        if (class125.field2262.method1972(var8, (byte) 15) == 1) {
                            var15 = class278.field4796;
                        }
                        if (class125.field2262.method1972(var8, (byte) 15) == 2) {
                            var15 = class75.field1419;
                        }
                        int var18 = var15.method1277(class125.field2262.field4887[var8], 100);
                        int var19 = var17 - var18 / 2;
                        if (var19 >= -arg2.field1163 && var19 <= arg2.field1163 && (-arg2.field1016) <= var16 && var16 <= arg2.field1016) {
                            int var20 = 16777215;
                            if (class125.field2262.field4880[var8] != -1) {
                                var20 = class125.field2262.field4880[var8];
                            }
                            if (class123.field2216) {
                                class21.method213((class136) arg2.method463(false, 255));
                            } else {
                                class210.method1459(arg2.field1079, arg2.field1019);
                            }
                            var15.method1274(class125.field2262.field4887[var8], arg2.field1163 / 2 + arg1 + var19, arg2.field1016 / 2 + -var16 + arg3, var18, 50, var20, 0, 256, 1, 0, 0);
                            if (class123.field2216) {
                                class21.method200();
                            } else {
                                class210.method1471();
                            }
                        }
                    }
                }
            }
            for (int var21 = 0; var21 < class89.field1612; var21++) {
                int var22 = class6.field149[var21] * 4 - (class139.field2472.field1865 / 32 - 2);
                int var23 = class55.field933[var21] * 4 + 2 - class139.field2472.field1859 / 32;
                class290 var24 = class172.method1207(class105.field1943[var21], -122);
                if (var24.field4993 != null) {
                    var24 = var24.method2001(true);
                    if (var24 == null || var24.field5007 == -1) {
                        continue;
                    }
                }
                class118.method839(arg1, 31, var22, arg2, class164.field2886[var24.field5007], arg3, var23);
            }
            for (int var25 = 0; var25 < 104; var25++) {
                for (int var26 = 0; var26 < 104; var26++) {
                    class106 var27 = class274.field4712[class20.field364][var25][var26];
                    if (var27 != null) {
                        int var28 = var25 * 4 + 2 - (class139.field2472.field1859 / 32);
                        int var29 = var26 * 4 + 2 - class139.field2472.field1865 / 32;
                        class118.method839(arg1, -126, var29, arg2, class29.field496[0], arg3, var28);
                    }
                }
            }
            for (int var30 = 0; var30 < class218.field3707; var30++) {
                class232 var31 = class2.field12[class254.field4422[var30]];
                if (var31 != null && var31.method318(4)) {
                    class6 var32 = var31.field3911;
                    if (var32 != null && var32.field144 != null) {
                        var32 = var32.method66(0);
                    }
                    if (var32 != null && var32.field146 && var32.field133) {
                        int var33 = var31.field1859 / 32 - (class139.field2472.field1859 / 32);
                        int var34 = var31.field1865 / 32 - class139.field2472.field1865 / 32;
                        class118.method839(arg1, 63, var34, arg2, class29.field496[1], arg3, var33);
                    }
                }
            }
            for (int var35 = 0; var35 < class163.field2862; var35++) {
                class41 var36 = class284.field4888[class194.field3307[var35]];
                if (var36 != null && var36.method318(4)) {
                    int var37 = var36.field1859 / 32 - (class139.field2472.field1859 / 32);
                    int var38 = var36.field1865 / 32 - (class139.field2472.field1865 / 32);
                    long var39 = var36.field672.method509(31492);
                    boolean var41 = false;
                    for (int var42 = 0; var42 < class202.field3453; var42++) {
                        if (class47.field776[var42] == var39 && class154.field2726[var42] != 0) {
                            var41 = true;
                            break;
                        }
                    }
                    boolean var43 = false;
                    for (int var44 = 0; var44 < class109.field2012; var44++) {
                        if (class118.field2153[var44].field417 == var39) {
                            var43 = true;
                            break;
                        }
                    }
                    boolean var45 = false;
                    if (class139.field2472.field670 != 0 && var36.field670 != 0 && class139.field2472.field670 == var36.field670) {
                        var45 = true;
                    }
                    if (var41) {
                        class118.method839(arg1, -119, var38, arg2, class29.field496[3], arg3, var37);
                    } else if (var43) {
                        class118.method839(arg1, 12, var38, arg2, class29.field496[5], arg3, var37);
                    } else if (var45) {
                        class118.method839(arg1, -118, var38, arg2, class29.field496[4], arg3, var37);
                    } else {
                        class118.method839(arg1, 115, var38, arg2, class29.field496[2], arg3, var37);
                    }
                }
            }
            int var46 = 0;
            class65[] var47 = class304.field5197;
            while (var46 < var47.length) {
                class65 var48 = var47[var46];
                if (var48 != null && var48.field1292 != 0 && (class29.field482 % 20) < 10) {
                    if (var48.field1292 == 1 && var48.field1290 >= 0 && var48.field1290 < class2.field12.length) {
                        class232 var49 = class2.field12[var48.field1290];
                        if (var49 != null) {
                            int var50 = var49.field1865 / 32 - (class139.field2472.field1865 / 32);
                            int var51 = var49.field1859 / 32 - (class139.field2472.field1859 / 32);
                            class115.method820(var51, var48.field1301, arg1, arg0, var50, arg3, arg2);
                        }
                    }
                    if (var48.field1292 == 2) {
                        int var52 = (var48.field1306 - class190.field3269) * 4 + 2 - (class139.field2472.field1859 / 32);
                        int var53 = (var48.field1291 - class121.field2184) * 4 + 2 - (class139.field2472.field1865 / 32);
                        class115.method820(var52, var48.field1301, arg1, false, var53, arg3, arg2);
                    }
                    if (var48.field1292 == 10 && var48.field1290 >= 0 && var48.field1290 < class284.field4888.length) {
                        class41 var54 = class284.field4888[var48.field1290];
                        if (var54 != null) {
                            int var55 = var54.field1859 / 32 - (class139.field2472.field1859 / 32);
                            int var56 = var54.field1865 / 32 - (class139.field2472.field1865 / 32);
                            class115.method820(var55, var48.field1301, arg1, arg0, var56, arg3, arg2);
                        }
                    }
                }
                var46++;
            }
            if (class40.field631 != 0) {
                int var57 = class12.field233 * 4 - (class139.field2472.field1865 / 32 - 2);
                int var58 = class40.field631 * 4 + 2 - (class139.field2472.field1859 / 32);
                class118.method839(arg1, -125, var57, arg2, class185.field3182, arg3, var58);
            }
            if (class123.field2216) {
                class21.method208(arg1 + (arg2.field1163 / 2) - 1, arg2.field1016 / 2 + -1 + arg3, 3, 3, 16777215);
            } else {
                class210.method1469(arg2.field1163 / 2 + arg1 - 1, arg2.field1016 / 2 + -1 + arg3, 3, 3, 16777215);
            }
        } else if (class123.field2216) {
            class40 var59 = arg2.method463(false, 255);
            if (var59 != null) {
                var59.method306(arg1, arg3);
            }
        } else {
            class210.method1472(arg1, arg3, 0, arg2.field1079, arg2.field1019);
        }
        class267.field4582[arg4] = true;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/Throwable;)V", line = 584)
    public static final void method2146(byte arg0, String arg1, Throwable arg2) {
        field5259++;
        try {
            String var3 = "";
            if (arg2 != null) {
                var3 = class20.method193(arg2, -1);
            }
            if (arg1 != null) {
                if (arg2 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg1;
            }
            System.out.println("Error: " + var3);
            String var4 = var3.replace(':', '.');
            String var5 = var4.replace('@', '_');
            String var6 = var5.replace('&', '_');
            String var7 = var6.replace('#', '_');
            if (class48.field803.field4845 == null) {
                return;
            }
            class22 var8 = class48.field803.method1947(29393, new URL(class48.field803.field4845.getCodeBase(), "clienterror.ws?c=" + class154.field2735 + "&u=" + class15.field323 + "&v1=" + class282.field4853 + "&v2=" + class282.field4860 + "&e=" + var7));
            while (var8.field375 == 0) {
                class267.method1871(10, 1L);
            }
            if (var8.field375 == 1) {
                DataInputStream var9 = (DataInputStream) var8.field377;
                var9.read();
                var9.close();
            }
        } catch (Exception var11) {
        }
        if (arg0 >= -52) {
            field5255 = (class64) null;
        }
    }
}
