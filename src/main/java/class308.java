import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class308 {

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "Lna;")
    public static class26 field5296 = class69.method505("null", (byte) -122);

    @OriginalMember(owner = "client!gd", name = "h", descriptor = "[I")
    public static int[] field5302 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!gd", name = "i", descriptor = "Lna;")
    public static class26 field5303 = null;

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "Lna;")
    public static class26 field5297 = class69.method505(")0", (byte) -121);

    @OriginalMember(owner = "client!gd", name = "j", descriptor = "I")
    public static int field5304 = 0;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "I")
    public static int field5295;

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "I")
    public static int field5298;

    @OriginalMember(owner = "client!gd", name = "e", descriptor = "I")
    public static int field5299;

    @OriginalMember(owner = "client!gd", name = "f", descriptor = "I")
    public static int field5300;

    @OriginalMember(owner = "client!gd", name = "g", descriptor = "I")
    public static int field5301;

    @OriginalMember(owner = "client!gd", name = "k", descriptor = "I")
    public static int field5305;

    @OriginalMember(owner = "client!gd", name = "l", descriptor = "I")
    public static int field5306;

    @OriginalMember(owner = "client!gd", name = "o", descriptor = "I")
    public static int field5309;

    @OriginalMember(owner = "client!gd", name = "n", descriptor = "Lqf;")
    public static class148 field5308;

    @OriginalMember(owner = "client!gd", name = "m", descriptor = "Lve;")
    public static class266 field5307;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIBI)I", line = 8)
    public static final int method2151(int arg0, int arg1, byte arg2, int arg3) {
        if (arg2 == 0) {
            field5295++;
            return arg3 > arg1 ? arg3 : (arg1 > arg0 ? arg0 : arg1);
        } else {
            return -127;
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(JI)V", line = 25)
    public static final void method2152(long arg0, int arg1) {
        field5301++;
        class114.field1789.field1301 = 0;
        class114.field1789.method591((byte) -33, 186);
        class114.field1789.method579(arg0, arg1 - 2037463204);
        class127.field1969 = 1;
        if (arg1 == -28236) {
            class108.field1692 = 0;
            class300.field5174 = 0;
            class259.field4238 = -3;
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Z)V", line = 43)
    public static void method2153(boolean arg0) {
        field5307 = null;
        field5303 = null;
        if (!arg0) {
            field5307 = (class266) null;
        }
        field5296 = null;
        field5302 = null;
        field5297 = null;
        field5308 = null;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(ILve;II)Lmm;", line = 62)
    public static final class256 method2154(int arg0, class266 arg1, int arg2, int arg3) {
        if (arg2 != -3178) {
            method2155(-55);
        }
        field5298++;
        return class196.method1317(arg1, arg0, arg3, -30901) ? class193.method1305(-53) : null;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(I)V", line = 94)
    public static final void method2155(int arg0) {
        if (arg0 != -3782) {
            field5296 = (class26) null;
        }
        class263.field4308.method1986((byte) -109);
        field5299++;
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(I)V", line = 105)
    public static final void method2156(int arg0) {
        if (arg0 != -19761) {
            method2157(-110);
        }
        field5305++;
        class244.field4009.method1987(3);
    }

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "(I)V", line = 135)
    public static final void method2157(int arg0) {
        field5309++;
        class205.method1383((byte) -90, false);
        class185.field2879 = 0;
        boolean var1 = true;
        for (int var2 = 0; var2 < class51.field808.length; var2++) {
            if (client.field4126[var2] != -1 && class51.field808[var2] == null) {
                class51.field808[var2] = class98.field1597.method1889(client.field4126[var2], (byte) -122, 0);
                if (class51.field808[var2] == null) {
                    class185.field2879++;
                    var1 = false;
                }
            }
            if (class225.field3573[var2] != -1 && class47.field761[var2] == null) {
                class47.field761[var2] = class98.field1597.method1882(class225.field3573[var2], class224.field3545[var2], 37, 0);
                if (class47.field761[var2] == null) {
                    var1 = false;
                    class185.field2879++;
                }
            }
            if (class255.field4184) {
                if (class303.field5224[var2] != -1 && class2.field15[var2] == null) {
                    class2.field15[var2] = class98.field1597.method1889(class303.field5224[var2], (byte) -122, 0);
                    if (class2.field15[var2] == null) {
                        var1 = false;
                        class185.field2879++;
                    }
                }
                if (class132.field2010[var2] != -1 && class84.field1372[var2] == null) {
                    class84.field1372[var2] = class98.field1597.method1889(class132.field2010[var2], (byte) -122, 0);
                    if (class84.field1372[var2] == null) {
                        class185.field2879++;
                        var1 = false;
                    }
                }
            }
            if (class185.field2874 != null && class201.field3136[var2] == null && class185.field2874[var2] != -1) {
                class201.field3136[var2] = class98.field1597.method1882(class185.field2874[var2], class224.field3545[var2], 92, 0);
                if (class201.field3136[var2] == null) {
                    class185.field2879++;
                    var1 = false;
                }
            }
        }
        if (class219.field3504 == null) {
            if (class135.field2072 == null || !class37.field610.method1891(class236.method1587(new class26[] { class135.field2072.field1047, class159.field2486 }, (byte) -77), -104)) {
                class219.field3504 = new class12(0);
            } else if (class37.field610.method1883((byte) -83, class236.method1587(new class26[] { class135.field2072.field1047, class159.field2486 }, (byte) -95))) {
                class219.field3504 = class138.method927(-41, class236.method1587(new class26[] { class135.field2072.field1047, class159.field2486 }, (byte) -92), class37.field610);
            } else {
                var1 = false;
                class185.field2879++;
            }
        }
        if (!var1) {
            class252.field4141 = 1;
            return;
        }
        class104.field1665 = 0;
        boolean var3 = true;
        for (int var4 = 0; var4 < class51.field808.length; var4++) {
            byte[] var5 = class47.field761[var4];
            if (var5 != null) {
                int var6 = (class293.field4884[var4] & 0xFF) * 64 - class165.field2568;
                int var7 = (class293.field4884[var4] >> 8) * 64 - class12.field157;
                if (class56.field908) {
                    var6 = 10;
                    var7 = 10;
                }
                var3 &= class284.method2001((byte) -97, var7, var6, var5);
            }
            if (class255.field4184) {
                byte[] var8 = class84.field1372[var4];
                if (var8 != null) {
                    int var9 = (class293.field4884[var4] >> 8) * 64 - class12.field157;
                    int var10 = (class293.field4884[var4] & 0xFF) * 64 - class165.field2568;
                    if (class56.field908) {
                        var10 = 10;
                        var9 = 10;
                    }
                    var3 &= class284.method2001((byte) -74, var9, var10, var8);
                }
            }
        }
        if (arg0 >= -92) {
            method2153(true);
        }
        if (!var3) {
            class252.field4141 = 2;
            return;
        }
        if (class252.field4141 != 0) {
            class283.method1996((byte) -24, true, class236.method1587(new class26[] { class115.field1810, class272.field4546 }, (byte) -127));
        }
        class258.method1815(-16385);
        class18.method120((byte) 58);
        boolean var11 = false;
        if (class255.field4184 && class244.field4012) {
            for (int var12 = 0; var12 < class51.field808.length; var12++) {
                if (class84.field1372[var12] != null || class2.field15[var12] != null) {
                    var11 = true;
                    break;
                }
            }
        }
        class69.method507(4, 104, 104, class255.field4184 ? 28 : 25, var11);
        for (int var13 = 0; var13 < 4; var13++) {
            class218.field3479[var13].method1531(0);
        }
        for (int var14 = 0; var14 < 4; var14++) {
            for (int var15 = 0; var15 < 104; var15++) {
                for (int var16 = 0; var16 < 104; var16++) {
                    class92.field1492[var14][var15][var16] = 0;
                }
            }
        }
        class134.method909((byte) -115, false);
        if (class255.field4184) {
            class179.field2803.method1262();
            for (int var17 = 0; var17 < 13; var17++) {
                for (int var18 = 0; var18 < 13; var18++) {
                    class179.field2804[var17][var18].field2375 = true;
                }
            }
        }
        if (class255.field4184) {
            class226.method1516();
        }
        if (class255.field4184) {
            class160.method1089(118);
        }
        class258.method1815(-16385);
        System.gc();
        class205.method1383((byte) -90, true);
        class193.method1303(false, 105);
        if (!class56.field908) {
            class5.method27(false, -93);
            class205.method1383((byte) -90, true);
            if (class255.field4184) {
                int var19 = class13.field221.field3904[0] >> 3;
                int var20 = class13.field221.field3890[0] >> 3;
                class46.method351(true, var20, var19);
            }
            class98.method731(false, -32624);
            if (class201.field3136 != null) {
                class135.method915((byte) -124);
            }
        }
        if (class56.field908) {
            class302.method2120(false, (byte) 98);
            class205.method1383((byte) -90, true);
            if (class255.field4184) {
                int var21 = class13.field221.field3904[0] >> 3;
                int var22 = class13.field221.field3890[0] >> 3;
                class46.method351(true, var22, var21);
            }
            class252.method1743(false, (byte) -121);
        }
        class18.method120((byte) 90);
        class205.method1383((byte) -90, true);
        class151.method1027(class218.field3479, false, 66);
        if (class255.field4184) {
            class226.method1507();
        }
        class205.method1383((byte) -90, true);
        int var23 = class123.field1922;
        if (var23 > class279.field4651) {
            var23 = class279.field4651;
        }
        if (var23 < (class279.field4651 - 1)) {
            int var24 = class279.field4651 - 1;
        }
        if (class324.method2250(39)) {
            class123.method845(0);
        } else {
            class123.method845(class123.field1922);
        }
        class95.method714(-113);
        if (class255.field4184 && var11) {
            class216.method1446(true);
            class193.method1303(true, 105);
            if (!class56.field908) {
                class5.method27(true, -121);
                class205.method1383((byte) -90, true);
                class98.method731(true, -32624);
            }
            if (class56.field908) {
                class302.method2120(true, (byte) 56);
                class205.method1383((byte) -90, true);
                class252.method1743(true, (byte) -105);
            }
            class18.method120((byte) 102);
            class205.method1383((byte) -90, true);
            class151.method1027(class218.field3479, true, 112);
            class205.method1383((byte) -90, true);
            class95.method714(-113);
            class216.method1446(false);
        }
        if (class255.field4184) {
            for (int var25 = 0; var25 < 13; var25++) {
                for (int var26 = 0; var26 < 13; var26++) {
                    class179.field2804[var25][var26].method1033(class229.field3635[0], var25 * 8, var26 * 8);
                }
            }
        }
        for (int var27 = 0; var27 < 104; var27++) {
            for (int var28 = 0; var28 < 104; var28++) {
                class244.method1683(var28, (byte) 65, var27);
            }
        }
        class82.method631(9179409);
        class258.method1815(-16385);
        class194.method1307(7759444);
        class18.method120((byte) 100);
        class126.field1956 = false;
        if (class142.field2172 != null && class88.field1449 != null && class207.field3217 == 25) {
            class114.field1789.method1431(0, 20);
            class114.field1789.method577(-126, 1057001181);
            class18.field260++;
        }
        if (!class56.field908) {
            int var29 = (class116.field1829 + 6) / 8;
            int var30 = (class116.field1829 - 6) / 8;
            int var31 = (class8.field99 - 6) / 8;
            int var32 = (class8.field99 + 6) / 8;
            for (int var33 = var31 - 1; var33 <= (var32 + 1); var33++) {
                for (int var34 = var30 - 1; var34 <= (var29 + 1); var34++) {
                    if (var33 < var31 || var33 > var32 || var34 < var30 || var34 > var29) {
                        class98.field1597.method1880(-124, class236.method1587(new class26[] { class214.field3344, class149.method1019((byte) 9, var33), class292.field4858, class149.method1019((byte) 9, var34) }, (byte) -76));
                        class98.field1597.method1880(-123, class236.method1587(new class26[] { class154.field2403, class149.method1019((byte) 9, var33), class292.field4858, class149.method1019((byte) 9, var34) }, (byte) -121));
                    }
                }
            }
        }
        if (class207.field3217 == 28) {
            class193.method1302(10, 5);
        } else {
            class193.method1302(30, 5);
            if (class88.field1449 != null) {
                class114.field1789.method1431(0, 110);
            }
        }
        class210.method1407((byte) 116);
        class258.method1815(-16385);
        class196.method1321(true);
    }
}
