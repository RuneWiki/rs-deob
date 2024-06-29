import java.io.IOException;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public class class298 {

    @OriginalMember(owner = "client!vf", name = "q", descriptor = "I")
    public int field4983;

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "I")
    public int field4969;

    @OriginalMember(owner = "client!vf", name = "o", descriptor = "I")
    public int field4981;

    @OriginalMember(owner = "client!vf", name = "f", descriptor = "I")
    public int field4972;

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "Lqd;")
    public static class40 field4968 = class147.method1106("unzap", (byte) -44);

    @OriginalMember(owner = "client!vf", name = "k", descriptor = "I")
    public static int field4977 = 128;

    @OriginalMember(owner = "client!vf", name = "m", descriptor = "[Lve;")
    public static class258[] field4979 = new class258[2048];

    @OriginalMember(owner = "client!vf", name = "e", descriptor = "[I")
    public static int[] field4971 = new int[5];

    @OriginalMember(owner = "client!vf", name = "r", descriptor = "[I")
    public static int[] field4984 = new int[2];

    @OriginalMember(owner = "client!vf", name = "t", descriptor = "[Z")
    public static boolean[] field4986 = new boolean[200];

    @OriginalMember(owner = "client!vf", name = "h", descriptor = "Lqd;")
    private static class40 field4974 = class147.method1106("Loading interfaces )2 ", (byte) -116);

    @OriginalMember(owner = "client!vf", name = "i", descriptor = "Lqd;")
    public static class40 field4975 = field4974;

    @OriginalMember(owner = "client!vf", name = "s", descriptor = "Lqd;")
    public static class40 field4985 = class147.method1106("(Y", (byte) -114);

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "I")
    public static int field4967;

    @OriginalMember(owner = "client!vf", name = "d", descriptor = "I")
    public static int field4970;

    @OriginalMember(owner = "client!vf", name = "g", descriptor = "I")
    public static int field4973;

    @OriginalMember(owner = "client!vf", name = "j", descriptor = "I")
    public static int field4976;

    @OriginalMember(owner = "client!vf", name = "n", descriptor = "I")
    public static int field4980;

    @OriginalMember(owner = "client!vf", name = "u", descriptor = "I")
    public static int field4987;

    @OriginalMember(owner = "client!vf", name = "v", descriptor = "I")
    public static int field4988;

    @OriginalMember(owner = "client!vf", name = "l", descriptor = "[I")
    public static int[] field4978;

    @OriginalMember(owner = "client!vf", name = "p", descriptor = "[I")
    public static int[] field4982;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(I)V", line = 8)
    public static final void method2031(int arg0) {
        for (int var1 = 0; var1 < 100; var1++) {
            class229.field3778[var1] = true;
        }
        field4967++;
        if (arg0 < 113) {
            field4985 = (class40) null;
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(B)V", line = 42)
    public static void method2032(byte arg0) {
        field4982 = null;
        if (arg0 < 43) {
            method2038((class26) null, -68);
        }
        field4986 = null;
        field4974 = null;
        field4984 = null;
        field4978 = null;
        field4979 = null;
        field4985 = null;
        field4971 = null;
        field4975 = null;
        field4968 = null;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(III[[[BIBII)V", line = 68)
    public static final void method2033(int arg0, int arg1, int arg2, byte[][][] arg3, int arg4, byte arg5, int arg6, int arg7) {
        class81.field1425++;
        class60.field1150 = 0;
        int var8 = arg6 - 16;
        int var9 = arg6 + 16;
        int var10 = arg7 - 16;
        int var11 = arg7 + 16;
        for (int var12 = class246.field4072; var12 < class294.field4942; var12++) {
            class14[][] var13 = class93.field1690[var12];
            for (int var14 = class42.field797; var14 < class116.field1992; var14++) {
                for (int var15 = class313.field5294; var15 < class301.field5051; var15++) {
                    class14 var16 = var13[var14][var15];
                    if (var16 != null) {
                        if (class30.field634[var14 + class173.field2820 - class213.field3431][var15 + class173.field2820 - class189.field3075] && (arg3 == null || var12 < arg4 || arg3[var12][var14][var15] != arg5)) {
                            var16.field223 = true;
                            var16.field218 = true;
                            if (var16.field216 > 0) {
                                var16.field214 = true;
                            } else {
                                var16.field214 = false;
                            }
                            class60.field1150++;
                        } else {
                            var16.field223 = false;
                            var16.field218 = false;
                            var16.field226 = 0;
                            if (var14 >= var8 && var14 <= var9 && var15 >= var10 && var15 <= var11) {
                                if (var16.field235 != null) {
                                    class302 var17 = var16.field235;
                                    var17.field5059.method1389(var17.field5063, var17.field5062, true, var17.field5063, var17.field5062);
                                    if (var17.field5066 != null) {
                                        var17.field5066.method1389(var17.field5063, var17.field5062, true, var17.field5063, var17.field5062);
                                    }
                                }
                                if (var16.field225 != null) {
                                    class20 var18 = var16.field225;
                                    var18.field343.method1389(var18.field332, var18.field346, true, var18.field332, var18.field346);
                                    if (var18.field335 != null) {
                                        var18.field335.method1389(var18.field332, var18.field346, true, var18.field332, var18.field346);
                                    }
                                }
                                if (var16.field222 != null) {
                                    class102 var19 = var16.field222;
                                    var19.field1790.method1389(var19.field1795, var19.field1788, true, var19.field1795, var19.field1788);
                                }
                                if (var16.field230 != null) {
                                    for (int var20 = 0; var20 < var16.field216; var20++) {
                                        class193 var21 = var16.field230[var20];
                                        var21.field3106.method1389(var21.field3108, var21.field3107, true, var21.field3115, var21.field3112);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        boolean var22 = class78.field1316 == class160.field2687;
        if (class21.field350) {
            GL var23 = class21.field377;
            var23.glPushMatrix();
            var23.glTranslatef((float) (-arg0), (float) (-arg1), (float) (-arg2));
            if (var22) {
                class50.method442();
                class60.method504(-1, 3, 20789);
                class292.field4887 = true;
                class155.method1206();
                class286.field4816 = -1;
                class306.field5131 = -1;
                for (int var24 = 0; var24 < class293.field4933[0].length; var24++) {
                    class47 var25 = class293.field4933[0][var24];
                    float var26 = 251.5F - (var25.field916 ? 1.0F : 0.5F);
                    if (class286.field4816 != var25.field908) {
                        class286.field4816 = var25.field908;
                        class146.method1101((byte) -122, var25.field908);
                        class273.method1892(class87.method674(0));
                    }
                    var25.method425(class93.field1690, var26, false);
                }
                class155.method1205();
            } else {
                int var27 = class246.field4072;
                while (true) {
                    if (var27 >= class294.field4942) {
                        class84.method641(class213.field3431, class189.field3075, class93.field1690);
                        break;
                    }
                    for (int var28 = 0; var28 < class293.field4933[var27].length; var28++) {
                        class47 var29 = class293.field4933[var27][var28];
                        float var30 = 201.5F - (float) var27 * 50.0F - (var29.field916 ? 1.0F : 0.5F);
                        if (var29.field924 != -1 && class203.field3217.method571((byte) -40, var29.field924) == 4 && class178.field2929) {
                            class146.method1101((byte) -120, var29.field908);
                        }
                        var29.method425(class93.field1690, var30, false);
                    }
                    if (var27 == 0 && class285.field4804 > 0) {
                        class21.method133(101.5F);
                        class241.method1701(class213.field3431, class189.field3075, class173.field2820, arg1, class30.field634, class78.field1316[0]);
                    }
                    var27++;
                }
            }
            var23.glPopMatrix();
        }
        for (int var31 = class246.field4072; var31 < class294.field4942; var31++) {
            class14[][] var32 = class93.field1690[var31];
            for (int var33 = -class173.field2820; var33 <= 0; var33++) {
                int var34 = class213.field3431 + var33;
                int var35 = class213.field3431 - var33;
                if (var34 >= class42.field797 || var35 < class116.field1992) {
                    for (int var36 = -class173.field2820; var36 <= 0; var36++) {
                        int var37 = class189.field3075 + var36;
                        int var38 = class189.field3075 - var36;
                        if (var34 >= class42.field797) {
                            if (var37 >= class313.field5294) {
                                class14 var39 = var32[var34][var37];
                                if (var39 != null && var39.field223) {
                                    class233.method1616(var39, true);
                                }
                            }
                            if (var38 < class301.field5051) {
                                class14 var40 = var32[var34][var38];
                                if (var40 != null && var40.field223) {
                                    class233.method1616(var40, true);
                                }
                            }
                        }
                        if (var35 < class116.field1992) {
                            if (var37 >= class313.field5294) {
                                class14 var41 = var32[var35][var37];
                                if (var41 != null && var41.field223) {
                                    class233.method1616(var41, true);
                                }
                            }
                            if (var38 < class301.field5051) {
                                class14 var42 = var32[var35][var38];
                                if (var42 != null && var42.field223) {
                                    class233.method1616(var42, true);
                                }
                            }
                        }
                        if (class60.field1150 == 0) {
                            if (!var22) {
                                class55.field1070 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        for (int var43 = class246.field4072; var43 < class294.field4942; var43++) {
            class14[][] var44 = class93.field1690[var43];
            for (int var45 = -class173.field2820; var45 <= 0; var45++) {
                int var46 = class213.field3431 + var45;
                int var47 = class213.field3431 - var45;
                if (var46 >= class42.field797 || var47 < class116.field1992) {
                    for (int var48 = -class173.field2820; var48 <= 0; var48++) {
                        int var49 = class189.field3075 + var48;
                        int var50 = class189.field3075 - var48;
                        if (var46 >= class42.field797) {
                            if (var49 >= class313.field5294) {
                                class14 var51 = var44[var46][var49];
                                if (var51 != null && var51.field223) {
                                    class233.method1616(var51, false);
                                }
                            }
                            if (var50 < class301.field5051) {
                                class14 var52 = var44[var46][var50];
                                if (var52 != null && var52.field223) {
                                    class233.method1616(var52, false);
                                }
                            }
                        }
                        if (var47 < class116.field1992) {
                            if (var49 >= class313.field5294) {
                                class14 var53 = var44[var47][var49];
                                if (var53 != null && var53.field223) {
                                    class233.method1616(var53, false);
                                }
                            }
                            if (var50 < class301.field5051) {
                                class14 var54 = var44[var47][var50];
                                if (var54 != null && var54.field223) {
                                    class233.method1616(var54, false);
                                }
                            }
                        }
                        if (class60.field1150 == 0) {
                            if (!var22) {
                                class55.field1070 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        class55.field1070 = false;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(II)V", line = 435)
    public static final void method2034(int arg0, int arg1) {
        field4970++;
        class53 var2 = class288.field4828;
        synchronized (class288.field4828) {
            class51.field982 = arg1;
        }
        if (arg0 != -1) {
            method2031(23);
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IBI[Lqd;)Lqd;", line = 455)
    public static final class40 method2035(int arg0, byte arg1, int arg2, class40[] arg3) {
        int var4 = 0;
        for (int var5 = 0; var5 < arg0; var5++) {
            if (arg3[arg2 + var5] == null) {
                arg3[arg2 + var5] = class54.field1042;
            }
            var4 += arg3[arg2 + var5].field766;
        }
        field4976++;
        byte[] var6 = new byte[var4];
        if (arg1 != -28) {
            return (class40) null;
        }
        int var7 = 0;
        for (int var8 = 0; var8 < arg0; var8++) {
            class40 var9 = arg3[arg2 + var8];
            class234.method1627(var9.field745, 0, var6, var7, var9.field766);
            var7 += var9.field766;
        }
        class40 var10 = new class40();
        var10.field766 = var4;
        var10.field745 = var6;
        return var10;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(III)I", line = 505)
    public static final int method2036(int arg0, int arg1, int arg2) {
        if (arg2 != 20858) {
            method2033(-29, 75, -122, (byte[][][]) ((byte[][][]) null), -39, (byte) 116, 126, -71);
        }
        int var3 = arg0 >> 31 & arg1 - 1;
        field4987++;
        return ((arg0 >>> 31) + arg0) % arg1 + var3;
    }

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "(I)Z", line = 523)
    public static final boolean method2037(int arg0) throws IOException {
        field4988++;
        if (class140.field2369 == null) {
            return false;
        }
        int var1 = class140.field2369.method790((byte) 66);
        if (var1 == 0) {
            return false;
        }
        if (class27.field523 == -1) {
            var1--;
            class140.field2369.method785(1, class95.field1715.field472, 0, 28016);
            class95.field1715.field478 = 0;
            class27.field523 = class95.field1715.method1457(255);
            class202.field3201 = class267.field4455[class27.field523];
        }
        if (class202.field3201 == -1) {
            if (var1 <= 0) {
                return false;
            }
            class140.field2369.method785(1, class95.field1715.field472, 0, 28016);
            var1--;
            class202.field3201 = class95.field1715.field472[0] & 0xFF;
        }
        if (class202.field3201 == -2) {
            if (var1 <= 1) {
                return false;
            }
            class140.field2369.method785(2, class95.field1715.field472, 0, arg0 + 28004);
            var1 -= 2;
            class95.field1715.field478 = 0;
            class202.field3201 = class95.field1715.method197(-1);
        }
        if (class202.field3201 > var1) {
            return false;
        }
        class95.field1715.field478 = 0;
        class140.field2369.method785(class202.field3201, class95.field1715.field472, 0, 28016);
        class48.field939 = 0;
        class265.field4449 = class181.field2953;
        class181.field2953 = class156.field2621;
        class156.field2621 = class27.field523;
        if (class27.field523 == 49) {
            for (int var2 = 0; var2 < class192.field3098.length; var2++) {
                if (class243.field4015[var2] != class192.field3098[var2]) {
                    class192.field3098[var2] = class243.field4015[var2];
                    class207.method1463(var2, (byte) 126);
                    class303.field5077[class276.method1923(31, class125.field2158++)] = var2;
                }
            }
            class27.field523 = -1;
            return true;
        } else if (class27.field523 == 71) {
            int var3 = class95.field1715.method243(255);
            int var4 = class95.field1715.method216((byte) -125);
            class133.method983(22805, var4, var3);
            class27.field523 = -1;
            return true;
        } else if (class27.field523 == 215) {
            int var5 = class95.field1715.method208(-10556);
            int var6 = class95.field1715.method197(-1);
            int var7 = class95.field1715.method203(arg0 ^ 0xFFFFA9C2);
            int var8 = class95.field1715.method190((byte) 103);
            if (class159.method1219(var6, 0)) {
                class297 var9 = (class297) class165.field2731.method1405((byte) 115, (long) var7);
                if (var9 != null) {
                    class310.method2119(var9.field4959 != var5, 1, var9);
                }
                class157.method1209(var7, var8, (byte) -76, var5);
            }
            class27.field523 = -1;
            return true;
        } else if (class27.field523 == 60) {
            int var347 = class95.field1715.method216((byte) -121);
            int var348 = class95.field1715.method203(-22066);
            int var349 = class95.field1715.method216((byte) -125);
            int var350 = class95.field1715.method230((byte) -58);
            int var351 = class95.field1715.method197(arg0 ^ 0xFFFFFFF3);
            if (class159.method1219(var347, 0)) {
                class169.method1261(var350, -9022, var349, var351, var348);
            }
            class27.field523 = -1;
            return true;
        } else if (class27.field523 == 130) {
            int var345 = class95.field1715.method197(-1);
            int var346 = class95.field1715.method197(arg0 ^ 0xFFFFFFF3);
            class108.field1893 = var345;
            field4977 = var346;
            class120.method907(125);
            class27.field523 = -1;
            return true;
        } else if (class27.field523 == 91) {
            int var341 = class95.field1715.method247(4);
            int var342 = class95.field1715.method197(arg0 ^ 0xFFFFFFF3);
            int var343 = class95.field1715.method230((byte) -58);
            int var344 = class95.field1715.method230((byte) -58);
            if (class159.method1219(var342, 0)) {
                class19.method118(var341, (var344 << 16) + var343, 13);
            }
            class27.field523 = -1;
            return true;
        } else if (class27.field523 == 229) {
            int var323 = class95.field1715.method197(arg0 ^ 0xFFFFFFF3);
            int var324 = class95.field1715.method215(-100);
            int var325 = class95.field1715.method208(-10556);
            int var326 = class95.field1715.method197(arg0 ^ 0xFFFFFFF3);
            if ((var324 >> 30) != 0) {
                int var335 = (var324 >> 14 & 0x3FFF) - class196.field3152;
                int var336 = (var324 & 0x3BBCA921) >> 28;
                int var337 = (var324 & 0x3FFF) - class263.field4407;
                if (var335 >= 0 && var337 >= 0 && var335 < 104 && var337 < 104) {
                    int var338 = var337 * 128 + 64;
                    int var339 = var335 * 128 + 64;
                    class12 var340 = new class12(var326, var336, var339, var338, class293.method2012(var336, var338, arg0 ^ 0xC, var339) - var323, var325, class256.field4266);
                    class55.field1066.method1972(new class246(var340), arg0 + 93);
                }
            } else if (var324 >> 29 != 0) {
                int var331 = var324 & 0xFFFF;
                class42 var332 = class91.field1656[var331];
                if (var332 != null) {
                    var332.field1508 = class256.field4266 + var325;
                    var332.field1526 = 0;
                    var332.field1502 = var326;
                    var332.field1479 = var323;
                    if (class256.field4266 < var332.field1508) {
                        var332.field1526 = -1;
                    }
                    if (var332.field1502 == 65535) {
                        var332.field1502 = -1;
                    }
                    var332.field1491 = 0;
                    if (var332.field1502 != -1 && class256.field4266 == var332.field1508) {
                        int var333 = class185.method1339(-454810365, var332.field1502).field4600;
                        if (var333 != -1) {
                            class300 var334 = class20.method128(arg0 + 60, var333);
                            if (var334 != null && var334.field5018 != null) {
                                class185.method1338(var334, var332.field1531, -31987, false, var332.field1497, 0);
                            }
                        }
                    }
                }
            } else if (var324 >> 28 != 0) {
                int var327 = var324 & 0xFFFF;
                class258 var328;
                if (class289.field4842 == var327) {
                    var328 = class255.field4233;
                } else {
                    var328 = field4979[var327];
                }
                if (var328 != null) {
                    var328.field1502 = var326;
                    var328.field1491 = 0;
                    var328.field1526 = 0;
                    if (var328.field1502 == 65535) {
                        var328.field1502 = -1;
                    }
                    var328.field1479 = var323;
                    var328.field1508 = class256.field4266 + var325;
                    if (var328.field1508 > class256.field4266) {
                        var328.field1526 = -1;
                    }
                    if (var328.field1502 != -1 && class256.field4266 == var328.field1508) {
                        int var329 = class185.method1339(-454810365, var328.field1502).field4600;
                        if (var329 != -1) {
                            class300 var330 = class20.method128(101, var329);
                            if (var330 != null && var330.field5018 != null) {
                                class185.method1338(var330, var328.field1531, -31987, class255.field4233 == var328, var328.field1497, 0);
                            }
                        }
                    }
                }
            }
            class27.field523 = -1;
            return true;
        } else if (class27.field523 == 2) {
            class239.field3968 = class202.field3201 / 8;
            for (int var10 = 0; var10 < class239.field3968; var10++) {
                class282.field4751[var10] = class95.field1715.method212((byte) 106);
                class28.field606[var10] = class199.method1401(class282.field4751[var10], 1);
            }
            class27.field523 = -1;
            class166.field2754 = class60.field1152;
            return true;
        } else if (class27.field523 == 192) {
            long var308 = class95.field1715.method212((byte) -72);
            class95.field1715.method234(2193);
            long var310 = class95.field1715.method212((byte) -66);
            long var312 = (long) class95.field1715.method197(-1);
            long var314 = (long) class95.field1715.method244(-26711);
            int var316 = class95.field1715.method226(255);
            long var317 = (var312 << 32) + var314;
            boolean var319 = false;
            int var320 = 0;
            label1580: while (true) {
                if (var320 < 100) {
                    if (class204.field3253[var320] != var317) {
                        var320++;
                        continue;
                    }
                    var319 = true;
                    break;
                }
                if (var316 <= 1) {
                    if ((!class208.field3333 || class11.field180) && !class300.field5038) {
                        for (int var321 = 0; var321 < class239.field3968; var321++) {
                            if (class282.field4751[var321] == var308) {
                                var319 = true;
                                break label1580;
                            }
                        }
                    } else {
                        var319 = true;
                    }
                }
                break;
            }
            if (!var319 && class194.field3121 == 0) {
                class204.field3253[class173.field2823] = var317;
                class173.field2823 = (class173.field2823 + 1) % 100;
                class40 var322 = class259.method1824(method2038(class95.field1715, 219).method332(-23269));
                if (var316 == 2 || var316 == 3) {
                    class189.method1362(class199.method1401(var310, 1).method372((byte) -82), class153.method1192(new class40[] { class220.field3663, class199.method1401(var308, arg0 ^ 0xD).method372((byte) -71) }, (byte) 40), 9, var322, arg0 ^ 0x36);
                } else if (var316 == 1) {
                    class189.method1362(class199.method1401(var310, 1).method372((byte) -83), class153.method1192(new class40[] { class120.field2023, class199.method1401(var308, 1).method372((byte) -113) }, (byte) 127), 9, var322, arg0 + 89);
                } else {
                    class189.method1362(class199.method1401(var310, 1).method372((byte) -126), class199.method1401(var308, 1).method372((byte) -81), 9, var322, 84);
                }
            }
            class27.field523 = -1;
            return true;
        } else if (class27.field523 == 137) {
            class159.method1222(arg0 + 78);
            class27.field523 = -1;
            return true;
        } else if (class27.field523 == 64) {
            long var11 = class95.field1715.method212((byte) 125);
            long var13 = (long) class95.field1715.method197(arg0 ^ 0xFFFFFFF3);
            long var15 = (long) class95.field1715.method244(-26711);
            long var17 = (var13 << 32) + var15;
            boolean var19 = false;
            int var20 = class95.field1715.method226(255);
            int var21 = class95.field1715.method197(arg0 ^ 0xFFFFFFF3);
            int var22 = 0;
            label1123: while (true) {
                if (var22 < 100) {
                    if (class204.field3253[var22] != var17) {
                        var22++;
                        continue;
                    }
                    var19 = true;
                    break;
                }
                if (var20 <= 1) {
                    for (int var23 = 0; var23 < class239.field3968; var23++) {
                        if (class282.field4751[var23] == var11) {
                            var19 = true;
                            break label1123;
                        }
                    }
                }
                break;
            }
            if (!var19 && class194.field3121 == 0) {
                class204.field3253[class173.field2823] = var17;
                class173.field2823 = (class173.field2823 + 1) % 100;
                class40 var24 = class68.method531(var21, arg0 ^ 0x7FF3).method1897(class95.field1715, (byte) 122);
                if (var20 == 2) {
                    class171.method1265(var21, (byte) -81, class153.method1192(new class40[] { class220.field3663, class199.method1401(var11, 1).method372((byte) -85) }, (byte) -122), var24, 18, (class40) null);
                } else if (var20 == 1) {
                    class171.method1265(var21, (byte) -81, class153.method1192(new class40[] { class120.field2023, class199.method1401(var11, 1).method372((byte) -68) }, (byte) 123), var24, 18, (class40) null);
                } else {
                    class171.method1265(var21, (byte) -81, class199.method1401(var11, 1).method372((byte) -62), var24, 18, (class40) null);
                }
            }
            class27.field523 = -1;
            return true;
        } else if (class27.field523 == 51) {
            class40 var305 = class95.field1715.method251((byte) 77);
            int var306 = class95.field1715.method213(arg0 ^ 0xFFFFFFAB);
            int var307 = class95.field1715.method208(-10556);
            if (class159.method1219(var307, 0)) {
                class73.method546(var306, var305, 28);
            }
            class27.field523 = -1;
            return true;
        } else if (class27.field523 == 22) {
            int var302 = class95.field1715.method215(arg0 ^ 0xFFFFFF80);
            int var303 = class95.field1715.method230((byte) -58);
            int var304 = class95.field1715.method230((byte) -58);
            if (class159.method1219(var303, 0)) {
                class274.method1906(var304, 9003, var302);
            }
            class27.field523 = -1;
            return true;
        } else if (class27.field523 == 56) {
            int var25 = class95.field1715.method213(-18);
            int var26 = class95.field1715.method213(-120);
            int var27 = class95.field1715.method197(-1);
            int var28 = class95.field1715.method216((byte) -122);
            if (var28 == 65535) {
                var28 = -1;
            }
            if (class159.method1219(var27, 0)) {
                class213 var29 = class314.method2172((byte) 9, var26);
                if (var29.field3520) {
                    class271.method1875(54, var26, var28, var25);
                    class277 var30 = class165.method1243(-101, var28);
                    class169.method1261(var30.field4629, -9022, var30.field4664, var30.field4632, var26);
                    class139.method1028(var30.field4684, 2128, var26, var30.field4687, var30.field4659);
                } else if (var28 == -1) {
                    var29.field3451 = 0;
                    class27.field523 = -1;
                    return true;
                } else {
                    class277 var31 = class165.method1243(arg0 - 48, var28);
                    var29.field3458 = var31.field4629;
                    var29.field3526 = var28;
                    var29.field3481 = var31.field4664 * 100 / var25;
                    var29.field3451 = 4;
                    var29.field3551 = var31.field4632;
                    class25.method188(0, var29);
                }
            }
            class27.field523 = -1;
            return true;
        } else if (class27.field523 == 77) {
            int var301 = class95.field1715.method230((byte) -58);
            if (var301 == 65535) {
                var301 = -1;
            }
            class164.method1240(var301, true);
            class27.field523 = -1;
            return true;
        } else if (class27.field523 == 225) {
            int var299 = class95.field1715.method197(-1);
            if (var299 == 65535) {
                var299 = -1;
            }
            int var300 = class95.field1715.method220(false);
            class242.method1705(var299, var300, -1);
            class27.field523 = -1;
            return true;
        } else if (class27.field523 == 206) {
            int var296 = class95.field1715.method197(-1);
            int var297 = class95.field1715.method230((byte) -58);
            class40 var298 = class95.field1715.method251((byte) 77);
            if (class159.method1219(var297, 0)) {
                class58.method482(var296, var298, (byte) -122);
            }
            class27.field523 = -1;
            return true;
        } else if (class27.field523 == 147) {
            for (int var294 = 0; var294 < field4979.length; var294++) {
                if (field4979[var294] != null) {
                    field4979[var294].field1519 = -1;
                }
            }
            for (int var295 = 0; var295 < class91.field1656.length; var295++) {
                if (class91.field1656[var295] != null) {
                    class91.field1656[var295].field1519 = -1;
                }
            }
            class27.field523 = -1;
            return true;
        } else if (class27.field523 == 43) {
            int var283 = class95.field1715.method243(255);
            int var284 = var283 >> 2;
            int var285 = var283 & 0x3;
            int var286 = class213.field3463[var284];
            int var287 = class95.field1715.method197(-1);
            int var288 = class95.field1715.method247(4);
            if (var287 == 65535) {
                var287 = -1;
            }
            int var289 = var288 >> 28 & 0x3;
            int var290 = var288 >> 14 & 0x3FFF;
            int var291 = var290 - class196.field3152;
            int var292 = var288 & 0x3FFF;
            int var293 = var292 - class263.field4407;
            class284.method1978(var289, var285, var291, var284, var286, true, var293, var287);
            class27.field523 = -1;
            return true;
        } else if (class27.field523 == 69) {
            int var281 = class95.field1715.method247(4);
            int var282 = class95.field1715.method197(-1);
            class274.method1907(var282, 1, var281);
            class27.field523 = -1;
            return true;
        } else if (class27.field523 == 65) {
            int var32 = class95.field1715.method197(-1);
            int var33 = class95.field1715.method203(-22066);
            if (class159.method1219(var32, 0)) {
                class297 var34 = (class297) class165.field2731.method1405((byte) 115, (long) var33);
                if (var34 != null) {
                    class310.method2119(true, 1, var34);
                }
                if (class41.field792 != null) {
                    class25.method188(0, class41.field792);
                    class41.field792 = null;
                }
            }
            class27.field523 = -1;
            return true;
        } else if (class27.field523 == 58) {
            int var280 = class95.field1715.method197(arg0 - 13);
            class181.method1323(0, var280);
            class188.field3021[class276.method1923(31, class307.field5139++)] = class276.method1923(var280, 32767);
            class27.field523 = -1;
            return true;
        } else if (class27.field523 == 221) {
            class307.field5142 = class95.field1715.method204(2043908512);
            class269.field4478 = class95.field1715.method226(255);
            class27.field523 = -1;
            return true;
        } else if (class27.field523 == 121) {
            long var277 = class95.field1715.method212((byte) -19);
            class40 var279 = class259.method1824(method2038(class95.field1715, 219).method332(-23269));
            class303.method2071(class199.method1401(var277, arg0 ^ 0xD).method372((byte) -101), 3, 6, var279);
            class27.field523 = -1;
            return true;
        } else if (class27.field523 == 249) {
            if (class271.field4503 != null) {
                class289.method1997(-1, class204.field3230, false, true, -1);
            }
            byte[] var275 = new byte[class202.field3201];
            class95.field1715.method1467(0, 0, class202.field3201, var275);
            class40 var276 = class34.method298(var275, arg0 - 22289, class202.field3201, 0);
            if (class106.field1867 == null && class107.field1884 == 3 || !class107.field1883.startsWith("win") || class177.field2914) {
                class236.method1638(103, true, var276);
            } else {
                class48.field931 = var276;
                class25.field444 = true;
                class149.field2504 = class275.field4573.method803(arg0 ^ 0xFFFFFF91, new String(var276.method360(arg0 - 20575), "ISO-8859-1"));
            }
            class27.field523 = -1;
            return true;
        } else if (class27.field523 == 106) {
            class40 var35 = class95.field1715.method251((byte) 77);
            if (var35.method331(true, class103.field1813)) {
                class40 var71 = var35.method333(0, 55, var35.method358(-117, class243.field4007));
                boolean var72 = false;
                long var73 = var71.method362(arg0 - 25206);
                for (int var75 = 0; var75 < class239.field3968; var75++) {
                    if (class282.field4751[var75] == var73) {
                        var72 = true;
                        break;
                    }
                }
                if (!var72 && class194.field3121 == 0) {
                    class303.method2071(var71, 99, 4, class195.field3143);
                }
            } else if (var35.method331(true, client.field4049)) {
                boolean var65 = false;
                class40 var66 = var35.method333(0, 87, var35.method358(-122, class243.field4007));
                long var67 = var66.method362(arg0 - 25206);
                for (int var69 = 0; var69 < class239.field3968; var69++) {
                    if (class282.field4751[var69] == var67) {
                        var65 = true;
                        break;
                    }
                }
                if (!var65 && class194.field3121 == 0) {
                    class40 var70 = var35.method333(var35.method358(-116, class243.field4007) + 1, arg0 + 5, var35.method350(true) - 9);
                    class303.method2071(var66, arg0 ^ 0x7A, 8, var70);
                }
            } else if (var35.method331(true, class104.field1846)) {
                class40 var60 = var35.method333(0, 25, var35.method358(-120, class243.field4007));
                long var61 = var60.method362(arg0 ^ 0xFFFF9D9A);
                boolean var63 = false;
                for (int var64 = 0; var64 < class239.field3968; var64++) {
                    if (class282.field4751[var64] == var61) {
                        var63 = true;
                        break;
                    }
                }
                if (!var63 && class194.field3121 == 0) {
                    class303.method2071(var60, arg0 + 50, 10, class264.field4421);
                }
            } else if (var35.method331(true, class204.field3244)) {
                class40 var59 = var35.method333(0, 93, var35.method358(-116, class204.field3244));
                class303.method2071(class264.field4421, 70, 11, var59);
            } else if (var35.method331(true, class56.field1078)) {
                class40 var58 = var35.method333(0, arg0 ^ 0x54, var35.method358(arg0 ^ 0xFFFFFF82, class56.field1078));
                if (class194.field3121 == 0) {
                    class303.method2071(class264.field4421, arg0 ^ 0x6D, 12, var58);
                }
            } else if (var35.method331(true, class213.field3549)) {
                class40 var57 = var35.method333(0, 115, var35.method358(arg0 ^ 0xFFFFFF84, class213.field3549));
                if (class194.field3121 == 0) {
                    class303.method2071(class264.field4421, 16, 13, var57);
                }
            } else if (var35.method331(true, class212.field3381)) {
                class40 var52 = var35.method333(0, 109, var35.method358(-126, class243.field4007));
                long var53 = var52.method362(arg0 - 25206);
                boolean var55 = false;
                for (int var56 = 0; var56 < class239.field3968; var56++) {
                    if (class282.field4751[var56] == var53) {
                        var55 = true;
                        break;
                    }
                }
                if (!var55 && class194.field3121 == 0) {
                    class303.method2071(var52, arg0 + 80, 14, class264.field4421);
                }
            } else if (var35.method331(true, class101.field1780)) {
                class40 var47 = var35.method333(0, 38, var35.method358(-125, class243.field4007));
                long var48 = var47.method362(-25194);
                boolean var50 = false;
                for (int var51 = 0; var51 < class239.field3968; var51++) {
                    if (class282.field4751[var51] == var48) {
                        var50 = true;
                        break;
                    }
                }
                if (!var50 && class194.field3121 == 0) {
                    class303.method2071(var47, 121, 15, class264.field4421);
                }
            } else if (var35.method331(true, class53.field1034)) {
                class40 var36 = var35.method333(0, 65, var35.method358(-114, class243.field4007));
                long var37 = var36.method362(-25194);
                boolean var39 = false;
                for (int var40 = 0; var40 < class239.field3968; var40++) {
                    if (class282.field4751[var40] == var37) {
                        var39 = true;
                        break;
                    }
                }
                if (!var39 && class194.field3121 == 0) {
                    class303.method2071(var36, 72, 16, class264.field4421);
                }
            } else if (var35.method331(true, class120.field2043)) {
                class40 var41 = var35.method333(0, 112, var35.method358(-119, class243.field4007));
                long var42 = var41.method362(-25194);
                boolean var44 = false;
                for (int var45 = 0; var45 < class239.field3968; var45++) {
                    if (class282.field4751[var45] == var42) {
                        var44 = true;
                        break;
                    }
                }
                if (!var44 && class194.field3121 == 0) {
                    class40 var46 = var35.method333(var35.method358(arg0 ^ 0xFFFFFF8C, class243.field4007) + 1, 20, var35.method350(true) - 9);
                    class303.method2071(var41, 61, 21, var46);
                }
            } else {
                class303.method2071(class264.field4421, 117, 0, var35);
            }
            class27.field523 = -1;
            return true;
        } else if (class27.field523 == 183) {
            class44.field827 = class95.field1715.method226(arg0 + 243);
            class27.field523 = -1;
            return true;
        } else if (class27.field523 == 104) {
            int var76 = class95.field1715.method230((byte) -58);
            byte var77 = class95.field1715.method228(-25524);
            class274.method1907(var76, 1, var77);
            class27.field523 = -1;
            return true;
        } else if (class27.field523 == 219) {
            int var78 = class95.field1715.method247(4);
            int var79 = class95.field1715.method216((byte) -124);
            class133.method983(22805, var79, var78);
            class27.field523 = -1;
            return true;
        } else if (class27.field523 == 118) {
            class26.method225(true, arg0 ^ 0x13B0);
            class27.field523 = -1;
            return true;
        } else if (class27.field523 == 103) {
            int var271 = class95.field1715.method197(arg0 - 13);
            int var272 = class95.field1715.method226(255);
            int var273 = class95.field1715.method216((byte) -128);
            class42 var274 = class91.field1656[var273];
            if (var274 != null) {
                class56.method476(var271, var274, var272, arg0 ^ 0x66);
            }
            class27.field523 = -1;
            return true;
        } else if (class27.field523 == 31) {
            class220.method1542(arg0 ^ 0xFFFFFFD0);
            class27.field523 = -1;
            return true;
        } else if (class27.field523 == 10) {
            int var267 = class95.field1715.method197(arg0 ^ 0xFFFFFFF3);
            int var268 = class95.field1715.method204(arg0 + 2043908500);
            int var269 = class95.field1715.method216((byte) -124);
            if (class159.method1219(var269, 0)) {
                if (var268 == 2) {
                    class53.method461(67);
                }
                class148.field2499 = var267;
                class119.method895(var267, 0);
                class248.method1754(false, (byte) 51);
                class227.method1590(class148.field2499, 47);
                for (int var270 = 0; var270 < 100; var270++) {
                    class229.field3778[var270] = true;
                }
            }
            class27.field523 = -1;
            return true;
        } else if (class27.field523 == 195) {
            int var264 = class95.field1715.method215(-64);
            class213 var265 = class314.method2172((byte) 118, var264);
            for (int var266 = 0; var266 < var265.field3532.length; var266++) {
                var265.field3532[var266] = -1;
                var265.field3532[var266] = 0;
            }
            class25.method188(0, var265);
            class27.field523 = -1;
            return true;
        } else if (class27.field523 == 182) {
            int var259 = class95.field1715.method226(arg0 ^ 0xF3);
            int var260 = class95.field1715.method226(255);
            int var261 = class95.field1715.method226(255);
            int var262 = class95.field1715.method226(255);
            int var263 = class95.field1715.method197(-1);
            class123.field2135[var259] = true;
            class315.field5327[var259] = var260;
            class257.field4277[var259] = var261;
            field4971[var259] = var262;
            class83.field1442[var259] = var263;
            class27.field523 = -1;
            return true;
        } else if (class27.field523 == 34) {
            int var80 = class95.field1715.method201(true);
            int var81 = class95.field1715.method247(4);
            int var82 = class95.field1715.method197(-1);
            if (class159.method1219(var82, 0)) {
                class226.method1588((byte) 56, var81, var80);
            }
            class27.field523 = -1;
            return true;
        } else if (class27.field523 == 159) {
            int var256 = class95.field1715.method247(arg0 ^ 0x8);
            int var257 = class95.field1715.method197(-1);
            int var258 = class95.field1715.method208(arg0 ^ 0xFFFFD6C8);
            if (class159.method1219(var257, 0)) {
                class313.method2160(var258, -1, var256);
            }
            class27.field523 = -1;
            return true;
        } else if (class27.field523 == 33) {
            class159.method1223(0);
            class27.field523 = -1;
            return false;
        } else if (class27.field523 == 52) {
            class59.method503(class95.field1715.method251((byte) 77), 123);
            class27.field523 = -1;
            return true;
        } else if (class27.field523 == 20) {
            class93.method708(arg0 - 12, class95.field1715);
            class27.field523 = -1;
            return true;
        } else if (class27.field523 == 73) {
            int var251 = class95.field1715.method226(255);
            int var252 = class95.field1715.method226(arg0 ^ 0xF3);
            int var253 = class95.field1715.method197(-1);
            int var254 = class95.field1715.method226(arg0 ^ 0xF3);
            int var255 = class95.field1715.method226(255);
            class106.method798(var251, var254, var252, (byte) 29, var253, var255);
            class27.field523 = -1;
            return true;
        } else if (class27.field523 == 36) {
            class307.field5142 = class95.field1715.method190((byte) 125);
            class269.field4478 = class95.field1715.method204(arg0 + 2043908500);
            while (class95.field1715.field478 < class202.field3201) {
                class27.field523 = class95.field1715.method226(255);
                class212.method1490(-120);
            }
            class27.field523 = -1;
            return true;
        } else if (class27.field523 == 136) {
            class26.method225(false, 5052);
            class27.field523 = -1;
            return true;
        } else if (class27.field523 == 25) {
            class166.field2753 = class95.field1715.method197(-1) * 30;
            class27.field523 = -1;
            class134.field2278 = class60.field1152;
            return true;
        } else if (class27.field523 == 84) {
            class306.method2092((byte) -82);
            class19.method114((byte) -25);
            class125.field2158 += 32;
            class27.field523 = -1;
            return true;
        } else if (class27.field523 == 21) {
            int var248 = class95.field1715.method208(-10556);
            if (var248 == 65535) {
                var248 = -1;
            }
            int var249 = class95.field1715.method197(-1);
            int var250 = class95.field1715.method213(arg0 ^ 0x7B);
            if (class159.method1219(var249, 0)) {
                class160.method1229(1, var248, arg0 ^ 0x49DC, var250);
            }
            class27.field523 = -1;
            return true;
        } else if (class27.field523 == 185) {
            int var245 = class95.field1715.method243(255);
            class40 var246 = class95.field1715.method251((byte) 77);
            int var247 = class95.field1715.method226(255);
            if (var245 >= 1 && var245 <= 8) {
                if (var246.method327(class148.field2490, -21581)) {
                    var246 = null;
                }
                class54.field1041[var245 - 1] = var246;
                class288.field4836[var245 - 1] = var247 == 0;
            }
            class27.field523 = -1;
            return true;
        } else if (class27.field523 == 110) {
            long var231 = class95.field1715.method212((byte) -16);
            int var233 = class95.field1715.method197(-1);
            byte var234 = class95.field1715.method234(arg0 ^ 0x89D);
            boolean var235 = false;
            if ((Long.MIN_VALUE & var231) != 0L) {
                var235 = true;
            }
            if (var235) {
                if (class147.field2446 == 0) {
                    class27.field523 = -1;
                    return true;
                }
                long var241 = var231 & Long.MAX_VALUE;
                boolean var243 = false;
                int var244;
                for (var244 = 0; var244 < class147.field2446 && (class276.field4603[var244].field5149 != var241 || class276.field4603[var244].field2936 != var233); var244++) {
                }
                if (var244 < class147.field2446) {
                    while ((class147.field2446 - 1) > var244) {
                        class276.field4603[var244] = class276.field4603[var244 + 1];
                        var244++;
                    }
                    class147.field2446--;
                    class276.field4603[class147.field2446] = null;
                }
            } else {
                class40 var236 = class95.field1715.method251((byte) 77);
                class178 var237 = new class178();
                var237.field5149 = var231;
                var237.field2935 = class199.method1401(var237.field5149, 1);
                var237.field2924 = var236;
                var237.field2936 = var233;
                var237.field2926 = var234;
                int var238;
                for (var238 = class147.field2446 - 1; var238 >= 0; var238--) {
                    int var239 = class276.field4603[var238].field2935.method353(var237.field2935, 1);
                    if (var239 == 0) {
                        class276.field4603[var238].field2936 = var233;
                        class276.field4603[var238].field2926 = var234;
                        class276.field4603[var238].field2924 = var236;
                        class27.field523 = -1;
                        if (class205.field3271 == var231) {
                            class197.field3164 = var234;
                        }
                        class56.field1082 = class60.field1152;
                        return true;
                    }
                    if (var239 < 0) {
                        break;
                    }
                }
                if (class147.field2446 >= class276.field4603.length) {
                    class27.field523 = -1;
                    return true;
                }
                for (int var240 = class147.field2446 - 1; var240 > var238; var240--) {
                    class276.field4603[var240 + 1] = class276.field4603[var240];
                }
                if (class147.field2446 == 0) {
                    class276.field4603 = new class178[100];
                }
                class276.field4603[var238 + 1] = var237;
                if (class205.field3271 == var231) {
                    class197.field3164 = var234;
                }
                class147.field2446++;
            }
            class27.field523 = -1;
            class56.field1082 = class60.field1152;
            return true;
        } else if (class27.field523 == 127) {
            int var83 = class95.field1715.method230((byte) -58);
            int var84 = class95.field1715.method216((byte) -127);
            int var85 = class95.field1715.method203(-22066);
            int var86 = class95.field1715.method197(-1);
            if (class159.method1219(var86, 0)) {
                class160.method1229(7, var83 << 16 | var84, 18896, var85);
            }
            class27.field523 = -1;
            return true;
        } else if (class27.field523 == 146) {
            if (class148.field2499 != -1) {
                class168.method1253(-11892, 0, class148.field2499);
            }
            class27.field523 = -1;
            return true;
        } else if (class27.field523 == 235) {
            class309.method2114(class95.field1715, class275.field4573, arg0 - 26538, class202.field3201);
            class27.field523 = -1;
            return true;
        } else if (class27.field523 == 47) {
            class307.field5142 = class95.field1715.method226(255);
            class269.field4478 = class95.field1715.method226(255);
            for (int var228 = class307.field5142; var228 < (class307.field5142 + 8); var228++) {
                for (int var229 = class269.field4478; var229 < class269.field4478 + 8; var229++) {
                    if (class51.field983[class160.field2671][var228][var229] != null) {
                        class51.field983[class160.field2671][var228][var229] = null;
                        class185.method1337(false, var229, var228);
                    }
                }
            }
            for (class65 var230 = (class65) class121.field2086.method1971(100); var230 != null; var230 = (class65) class121.field2086.method1967(100)) {
                if (class307.field5142 <= var230.field1205 && var230.field1205 < (class307.field5142 + 8) && class269.field4478 <= var230.field1228 && (class269.field4478 + 8) > var230.field1228 && class160.field2671 == var230.field1224) {
                    var230.field1215 = 0;
                }
            }
            class27.field523 = -1;
            return true;
        } else if (class27.field523 == 255) {
            int var87 = class95.field1715.method247(4);
            int var88 = class95.field1715.method216((byte) -125);
            int var89 = class95.field1715.method215(arg0 ^ 0x13);
            if (class159.method1219(var88, 0)) {
                class297 var90 = (class297) class165.field2731.method1405((byte) 115, (long) var89);
                class297 var91 = (class297) class165.field2731.method1405((byte) 115, (long) var87);
                if (var91 != null) {
                    class310.method2119(var90 == null || var90.field4959 != var91.field4959, 1, var91);
                }
                if (var90 != null) {
                    var90.method2095(0);
                    class165.field2731.method1396(-19928, (long) var87, var90);
                }
                class213 var92 = class314.method2172((byte) -122, var89);
                if (var92 != null) {
                    class25.method188(0, var92);
                }
                class213 var93 = class314.method2172((byte) 8, var87);
                if (var93 != null) {
                    class25.method188(0, var93);
                    class299.method2041(true, (byte) -105, var93);
                }
                if (class148.field2499 != -1) {
                    class168.method1253(-11892, 1, class148.field2499);
                }
            }
            class27.field523 = -1;
            return true;
        } else if (class27.field523 == 156) {
            int var94 = class95.field1715.method197(-1);
            int var95 = class95.field1715.method197(arg0 - 13);
            int var96 = class95.field1715.method213(-98);
            int var97 = class95.field1715.method203(arg0 ^ 0xFFFFA9C2);
            if (var95 == 65535) {
                var95 = -1;
            }
            if (var94 == 65535) {
                var94 = -1;
            }
            int var98 = class95.field1715.method216((byte) -127);
            if (class159.method1219(var98, arg0 ^ 0xC)) {
                for (int var99 = var95; var99 <= var94; var99++) {
                    long var100 = ((long) var97 << 32) + (long) var99;
                    class307 var102 = class192.field3091.method1405((byte) 115, var100);
                    if (var102 != null) {
                        var102.method2095(0);
                    }
                    class192.field3091.method1396(-19928, var100, new class270(var96));
                }
            }
            class27.field523 = -1;
            return true;
        } else if (class27.field523 == 139) {
            int var227 = class95.field1715.method215(107);
            class193.field3119 = class275.field4573.method815(var227, -121);
            class27.field523 = -1;
            return true;
        } else if (class27.field523 == 239) {
            long var214 = class95.field1715.method212((byte) 119);
            long var216 = (long) class95.field1715.method197(arg0 - 13);
            long var218 = (long) class95.field1715.method244(arg0 - 26723);
            int var220 = class95.field1715.method226(arg0 + 243);
            long var221 = (var216 << 32) + var218;
            boolean var223 = false;
            int var224 = 0;
            label1396: while (true) {
                if (var224 >= 100) {
                    if (var220 <= 1) {
                        if ((!class208.field3333 || class11.field180) && !class300.field5038) {
                            for (int var225 = 0; var225 < class239.field3968; var225++) {
                                if (class282.field4751[var225] == var214) {
                                    var223 = true;
                                    break label1396;
                                }
                            }
                        } else {
                            var223 = true;
                        }
                    }
                    break;
                }
                if (class204.field3253[var224] == var221) {
                    var223 = true;
                    break;
                }
                var224++;
            }
            if (!var223 && class194.field3121 == 0) {
                class204.field3253[class173.field2823] = var221;
                class173.field2823 = (class173.field2823 + 1) % 100;
                class40 var226 = class259.method1824(method2038(class95.field1715, arg0 + 207).method332(arg0 ^ 0xFFFFA517));
                if (var220 == 2 || var220 == 3) {
                    class303.method2071(class153.method1192(new class40[] { class220.field3663, class199.method1401(var214, 1).method372((byte) -88) }, (byte) 123), 72, 7, var226);
                } else if (var220 == 1) {
                    class303.method2071(class153.method1192(new class40[] { class120.field2023, class199.method1401(var214, 1).method372((byte) -55) }, (byte) 122), 115, 7, var226);
                } else {
                    class303.method2071(class199.method1401(var214, arg0 - 11).method372((byte) -77), arg0 + 100, 3, var226);
                }
            }
            class27.field523 = -1;
            return true;
        } else if (class27.field523 == 117) {
            int var103 = class95.field1715.method208(-10556);
            int var104 = class95.field1715.method213(-96);
            int var105 = class95.field1715.method232((byte) 103);
            int var106 = class95.field1715.method249(true);
            if (class159.method1219(var103, arg0 ^ 0xC)) {
                class43.method393((byte) -93, var105, var106, var104);
            }
            class27.field523 = -1;
            return true;
        } else if (class27.field523 == 194) {
            long var198 = class95.field1715.method212((byte) 84);
            boolean var200 = false;
            class95.field1715.method234(arg0 + 2181);
            long var201 = class95.field1715.method212((byte) -95);
            long var203 = (long) class95.field1715.method197(-1);
            long var205 = (long) class95.field1715.method244(-26711);
            long var207 = (var203 << 32) + var205;
            int var209 = class95.field1715.method226(255);
            int var210 = class95.field1715.method197(-1);
            int var211 = 0;
            label1360: while (true) {
                if (var211 < 100) {
                    if (class204.field3253[var211] != var207) {
                        var211++;
                        continue;
                    }
                    var200 = true;
                    break;
                }
                if (var209 <= 1) {
                    for (int var212 = 0; var212 < class239.field3968; var212++) {
                        if (class282.field4751[var212] == var198) {
                            var200 = true;
                            break label1360;
                        }
                    }
                }
                break;
            }
            if (!var200 && class194.field3121 == 0) {
                class204.field3253[class173.field2823] = var207;
                class173.field2823 = (class173.field2823 + 1) % 100;
                class40 var213 = class68.method531(var210, 32767).method1897(class95.field1715, (byte) -101);
                if (var209 == 2 || var209 == 3) {
                    class171.method1265(var210, (byte) -81, class153.method1192(new class40[] { class220.field3663, class199.method1401(var198, 1).method372((byte) -67) }, (byte) 37), var213, 20, class199.method1401(var201, 1).method372((byte) -63));
                } else if (var209 == 1) {
                    class171.method1265(var210, (byte) -81, class153.method1192(new class40[] { class120.field2023, class199.method1401(var198, 1).method372((byte) -76) }, (byte) -67), var213, 20, class199.method1401(var201, 1).method372((byte) -121));
                } else {
                    class171.method1265(var210, (byte) -81, class199.method1401(var198, 1).method372((byte) -81), var213, 20, class199.method1401(var201, 1).method372((byte) -109));
                }
            }
            class27.field523 = -1;
            return true;
        } else if (class27.field523 == 135) {
            int var107 = class95.field1715.method197(-1);
            class40 var108 = class95.field1715.method251((byte) 77);
            Object[] var109 = new Object[var108.method350(true) + 1];
            for (int var110 = var108.method350(true) - 1; var110 >= 0; var110--) {
                if (var108.method366(arg0 ^ -13, var110) == 115) {
                    var109[var110 + 1] = class95.field1715.method251((byte) 77);
                } else {
                    var109[var110 + 1] = Integer.valueOf(class95.field1715.method203(-22066));
                }
            }
            var109[0] = Integer.valueOf(class95.field1715.method203(-22066));
            if (class159.method1219(var107, 0)) {
                class109 var111 = new class109();
                var111.field1908 = var109;
                class121.method912(var111, -122);
            }
            class27.field523 = -1;
            return true;
        } else if (class27.field523 == 230) {
            class19.method114((byte) -25);
            class254.field4206 = class95.field1715.method201(true);
            class134.field2278 = class60.field1152;
            class27.field523 = -1;
            return true;
        } else if (class27.field523 == 105 || class27.field523 == 210 || class27.field523 == 222 || class27.field523 == 179 || class27.field523 == 24 || class27.field523 == 176 || class27.field523 == 101 || class27.field523 == 186 || class27.field523 == 227 || class27.field523 == 241 || class27.field523 == 187 || class27.field523 == 214) {
            class212.method1490(127);
            class27.field523 = -1;
            return true;
        } else if (class27.field523 == 125) {
            int var195 = class95.field1715.method197(-1);
            if (var195 == 65535) {
                var195 = -1;
            }
            int var196 = class95.field1715.method226(255);
            int var197 = class95.field1715.method197(-1);
            class128.method956(var196, (byte) 67, var197, var195);
            class27.field523 = -1;
            return true;
        } else if (class27.field523 == 7) {
            int var192 = class95.field1715.method215(68);
            int var193 = class95.field1715.method208(-10556);
            if (var193 == 65535) {
                var193 = -1;
            }
            int var194 = class95.field1715.method216((byte) -123);
            if (class159.method1219(var194, 0)) {
                class160.method1229(2, var193, 18896, var192);
            }
            class27.field523 = -1;
            return true;
        } else if (class27.field523 == 193) {
            int var189 = class95.field1715.method226(255);
            int var190 = class95.field1715.method190((byte) 110);
            int var191 = class95.field1715.method190((byte) 89);
            class160.field2671 = var189 >> 1;
            class255.field4233.method1811(0, var190, (var189 & 0x1) == 1, var191);
            class27.field523 = -1;
            return true;
        } else if (class27.field523 == 128) {
            int var112 = class95.field1715.method226(255);
            if (class95.field1715.method226(255) == 0) {
                class6.field88[var112] = new class126();
            } else {
                class95.field1715.field478--;
                class6.field88[var112] = new class126(class95.field1715);
            }
            class308.field5172 = class60.field1152;
            class27.field523 = -1;
            return true;
        } else if (class27.field523 == 100) {
            class165.field2729 = class95.field1715.method226(255);
            class304.field5083 = class95.field1715.method226(255);
            class292.field4880 = class95.field1715.method226(255);
            class27.field523 = -1;
            return true;
        } else if (class27.field523 == 220) {
            long var113 = class95.field1715.method212((byte) 79);
            int var115 = class95.field1715.method197(arg0 - 13);
            int var116 = class95.field1715.method226(255);
            boolean var117 = true;
            class40 var118 = class264.field4421;
            if (var113 < 0L) {
                var113 &= Long.MAX_VALUE;
                var117 = false;
            }
            if (var115 > 0) {
                var118 = class95.field1715.method251((byte) 77);
            }
            class40 var119 = class199.method1401(var113, arg0 - 11).method372((byte) -110);
            for (int var120 = 0; var120 < class233.field3844; var120++) {
                if (class2.field20[var120] == var113) {
                    if (class72.field1277[var120] != var115) {
                        class72.field1277[var120] = var115;
                        if (var115 > 0) {
                            class303.method2071(class264.field4421, 59, 5, class153.method1192(new class40[] { var119, class118.field2007 }, (byte) -89));
                        }
                        if (var115 == 0) {
                            class303.method2071(class264.field4421, arg0 + 97, 5, class153.method1192(new class40[] { var119, class240.field3976 }, (byte) -72));
                        }
                    }
                    class237.field3898[var120] = var118;
                    var119 = null;
                    class268.field4466[var120] = var116;
                    field4986[var120] = var117;
                    break;
                }
            }
            if (var119 != null && class233.field3844 < 200) {
                class2.field20[class233.field3844] = var113;
                class15.field242[class233.field3844] = var119;
                class72.field1277[class233.field3844] = var115;
                class237.field3898[class233.field3844] = var118;
                class268.field4466[class233.field3844] = var116;
                field4986[class233.field3844] = var117;
                class233.field3844++;
            }
            int var121 = class233.field3844;
            boolean var122 = false;
            class166.field2754 = class60.field1152;
            while (var121 > 0) {
                boolean var123 = true;
                var121--;
                for (int var124 = 0; var124 < var121; var124++) {
                    if (class72.field1277[var124] != class81.field1426 && class72.field1277[var124 + 1] == class81.field1426 || class72.field1277[var124] == 0 && class72.field1277[var124 + 1] != 0) {
                        int var125 = class72.field1277[var124];
                        class72.field1277[var124] = class72.field1277[var124 + 1];
                        var123 = false;
                        class72.field1277[var124 + 1] = var125;
                        class40 var126 = class237.field3898[var124];
                        class237.field3898[var124] = class237.field3898[var124 + 1];
                        class237.field3898[var124 + 1] = var126;
                        class40 var127 = class15.field242[var124];
                        class15.field242[var124] = class15.field242[var124 + 1];
                        class15.field242[var124 + 1] = var127;
                        long var128 = class2.field20[var124];
                        class2.field20[var124] = class2.field20[var124 + 1];
                        class2.field20[var124 + 1] = var128;
                        int var130 = class268.field4466[var124];
                        class268.field4466[var124] = class268.field4466[var124 + 1];
                        class268.field4466[var124 + 1] = var130;
                        boolean var131 = field4986[var124];
                        field4986[var124] = field4986[var124 + 1];
                        field4986[var124 + 1] = var131;
                    }
                }
                if (var123) {
                    break;
                }
            }
            class27.field523 = -1;
            return true;
        } else if (class27.field523 == 40) {
            int var186 = class95.field1715.method230((byte) -58);
            int var187 = class95.field1715.method213(-123);
            int var188 = class95.field1715.method230((byte) -58);
            if (class159.method1219(var186, arg0 - 12)) {
                class232.method1610(var188, var187, 120);
            }
            class27.field523 = -1;
            return true;
        } else if (class27.field523 == 94) {
            int var132 = class95.field1715.method197(-1);
            int var133 = class95.field1715.method216((byte) -126);
            int var134 = class95.field1715.method190((byte) 108);
            if (class159.method1219(var132, 0)) {
                class274.method1906(var133, arg0 + 8991, var134);
            }
            class27.field523 = -1;
            return true;
        } else if (class27.field523 == 142) {
            class56.field1082 = class60.field1152;
            long var135 = class95.field1715.method212((byte) 116);
            if (var135 == 0L) {
                class307.field5144 = null;
                class27.field523 = -1;
                class147.field2446 = 0;
                class31.field648 = null;
                class276.field4603 = null;
                return true;
            }
            long var137 = class95.field1715.method212((byte) 125);
            class31.field648 = class199.method1401(var137, 1);
            class307.field5144 = class199.method1401(var135, arg0 ^ 0xD);
            class132.field2234 = class95.field1715.method234(2193);
            int var139 = class95.field1715.method226(255);
            if (var139 == 255) {
                class27.field523 = -1;
                return true;
            }
            class147.field2446 = var139;
            class178[] var140 = new class178[100];
            for (int var141 = 0; var141 < class147.field2446; var141++) {
                var140[var141] = new class178();
                var140[var141].field5149 = class95.field1715.method212((byte) 97);
                var140[var141].field2935 = class199.method1401(var140[var141].field5149, arg0 ^ 0xD);
                var140[var141].field2936 = class95.field1715.method197(-1);
                var140[var141].field2926 = class95.field1715.method234(2193);
                var140[var141].field2924 = class95.field1715.method251((byte) 77);
                if (class205.field3271 == var140[var141].field5149) {
                    class197.field3164 = var140[var141].field2926;
                }
            }
            boolean var142 = false;
            int var143 = class147.field2446;
            while (var143 > 0) {
                boolean var144 = true;
                var143--;
                for (int var145 = 0; var145 < var143; var145++) {
                    if (var140[var145].field2935.method353(var140[var145 + 1].field2935, 1) > 0) {
                        var144 = false;
                        class178 var146 = var140[var145];
                        var140[var145] = var140[var145 + 1];
                        var140[var145 + 1] = var146;
                    }
                }
                if (var144) {
                    break;
                }
            }
            class276.field4603 = var140;
            class27.field523 = -1;
            return true;
        } else if (class27.field523 == 119) {
            class40 var183 = class95.field1715.method251((byte) 77);
            int var184 = class95.field1715.method230((byte) -58);
            int var185 = class95.field1715.method208(arg0 ^ 0xFFFFD6C8);
            if (class159.method1219(var184, 0)) {
                class58.method482(var185, var183, (byte) -128);
            }
            class27.field523 = -1;
            return true;
        } else if (class27.field523 == 158) {
            int var147 = class95.field1715.method213(-123);
            int var148 = class95.field1715.method230((byte) -58);
            if (class159.method1219(var148, 0)) {
                int var149 = 0;
                if (class255.field4233.field4294 != null) {
                    var149 = class255.field4233.field4294.method448((byte) 96);
                }
                class160.method1229(3, var149, arg0 + 18884, var147);
            }
            class27.field523 = -1;
            return true;
        } else if (class27.field523 == 150) {
            class19.method114((byte) -25);
            int var179 = class95.field1715.method203(-22066);
            int var180 = class95.field1715.method226(255);
            int var181 = class95.field1715.method190((byte) 121);
            class150.field2519[var180] = var179;
            class280.field4733[var180] = var181;
            class308.field5170[var180] = 1;
            for (int var182 = 0; var182 < 98; var182++) {
                if (var179 >= class90.field1624[var182]) {
                    class308.field5170[var180] = var182 + 2;
                }
            }
            class235.field3859[class276.method1923(31, class90.field1645++)] = var180;
            class27.field523 = -1;
            return true;
        } else if (class27.field523 == 169) {
            int var150 = class95.field1715.method226(255);
            int var151 = var150 >> 6;
            class189 var152 = new class189();
            var152.field3064 = var150 & 0x3F;
            var152.field3073 = class95.field1715.method226(255);
            if (var152.field3073 >= 0 && var152.field3073 < class112.field1941.length) {
                if (var152.field3064 == 1 || var152.field3064 == 10) {
                    var152.field3078 = class95.field1715.method197(-1);
                    class95.field1715.field478 += 3;
                } else if (var152.field3064 >= 2 && var152.field3064 <= 6) {
                    if (var152.field3064 == 2) {
                        var152.field3070 = 64;
                        var152.field3065 = 64;
                    }
                    if (var152.field3064 == 3) {
                        var152.field3065 = 64;
                        var152.field3070 = 0;
                    }
                    if (var152.field3064 == 4) {
                        var152.field3065 = 64;
                        var152.field3070 = 128;
                    }
                    if (var152.field3064 == 5) {
                        var152.field3065 = 0;
                        var152.field3070 = 64;
                    }
                    if (var152.field3064 == 6) {
                        var152.field3065 = 128;
                        var152.field3070 = 64;
                    }
                    var152.field3064 = 2;
                    var152.field3071 = class95.field1715.method197(-1);
                    var152.field3076 = class95.field1715.method197(-1);
                    var152.field3081 = class95.field1715.method226(255);
                }
                var152.field3066 = class95.field1715.method197(-1);
                if (var152.field3066 == 65535) {
                    var152.field3066 = -1;
                }
                class276.field4608[var151] = var152;
            }
            class27.field523 = -1;
            return true;
        } else {
            if (arg0 != 12) {
                method2035(112, (byte) 47, 16, (class40[]) null);
            }
            if (class27.field523 == 143) {
                int var153 = class95.field1715.method203(-22066);
                int var154 = class95.field1715.method197(-1);
                if (var153 < -70000) {
                    var154 += 32768;
                }
                class213 var155;
                if (var153 >= 0) {
                    var155 = class314.method2172((byte) 84, var153);
                } else {
                    var155 = null;
                }
                while (class95.field1715.field478 < class202.field3201) {
                    int var156 = class95.field1715.method195((byte) 120);
                    int var157 = class95.field1715.method197(arg0 ^ 0xFFFFFFF3);
                    int var158 = 0;
                    if (var157 != 0) {
                        var158 = class95.field1715.method226(255);
                        if (var158 == 255) {
                            var158 = class95.field1715.method203(-22066);
                        }
                    }
                    if (var155 != null && var156 >= 0 && var155.field3532.length > var156) {
                        var155.field3532[var156] = var157;
                        var155.field3471[var156] = var158;
                    }
                    class189.method1366(var154, var156, -1, var158, var157 - 1);
                }
                if (var155 != null) {
                    class25.method188(0, var155);
                }
                class19.method114((byte) -25);
                class188.field3021[class276.method1923(class307.field5139++, 31)] = class276.method1923(32767, var154);
                class27.field523 = -1;
                return true;
            } else if (class27.field523 == 209) {
                int var159 = class95.field1715.method226(255);
                int var160 = class95.field1715.method226(arg0 + 243);
                int var161 = class95.field1715.method197(-1);
                int var162 = class95.field1715.method226(255);
                int var163 = class95.field1715.method226(255);
                class218.method1526(true, var159, var162, var160, var163, (byte) -98, var161);
                class27.field523 = -1;
                return true;
            } else if (class27.field523 == 11) {
                class19.method114((byte) -25);
                class205.field3274 = class95.field1715.method226(arg0 ^ 0xF3);
                class134.field2278 = class60.field1152;
                class27.field523 = -1;
                return true;
            } else if (class27.field523 == 46) {
                class270.method1871(5);
                class27.field523 = -1;
                return true;
            } else if (class27.field523 == 62) {
                long var164 = class95.field1715.method212((byte) 87);
                int var166 = class95.field1715.method197(arg0 ^ 0xFFFFFFF3);
                class40 var167 = class68.method531(var166, 32767).method1897(class95.field1715, (byte) 62);
                class171.method1265(var166, (byte) -81, class199.method1401(var164, 1).method372((byte) -100), var167, 19, (class40) null);
                class27.field523 = -1;
                return true;
            } else if (class27.field523 == 90) {
                int var176 = class95.field1715.method216((byte) -127);
                int var177 = class95.field1715.method203(-22066);
                int var178 = class95.field1715.method243(255);
                if (class159.method1219(var176, 0)) {
                    class302.method2062(var178, var177, true);
                }
                class27.field523 = -1;
                return true;
            } else if (class27.field523 == 88) {
                class27.field523 = -1;
                class185.field2985 = 0;
                return true;
            } else if (class27.field523 == 144) {
                int var168 = class95.field1715.method203(-22066);
                int var169 = class95.field1715.method197(-1);
                if (var168 < -70000) {
                    var169 += 32768;
                }
                class213 var170;
                if (var168 < 0) {
                    var170 = null;
                } else {
                    var170 = class314.method2172((byte) -115, var168);
                }
                if (var170 != null) {
                    for (int var171 = 0; var171 < var170.field3532.length; var171++) {
                        var170.field3532[var171] = 0;
                        var170.field3471[var171] = 0;
                    }
                }
                class3.method15(var169, (byte) -111);
                int var172 = class95.field1715.method197(-1);
                for (int var173 = 0; var173 < var172; var173++) {
                    int var174 = class95.field1715.method226(255);
                    if (var174 == 255) {
                        var174 = class95.field1715.method213(-123);
                    }
                    int var175 = class95.field1715.method230((byte) -58);
                    if (var170 != null && var173 < var170.field3532.length) {
                        var170.field3532[var173] = var175;
                        var170.field3471[var173] = var174;
                    }
                    class189.method1366(var169, var173, -1, var174, var175 - 1);
                }
                if (var170 != null) {
                    class25.method188(arg0 ^ 0xC, var170);
                }
                class19.method114((byte) -25);
                class188.field3021[class276.method1923(class307.field5139++, 31)] = class276.method1923(var169, 32767);
                class27.field523 = -1;
                return true;
            } else if (class27.field523 == 141) {
                if (class202.field3201 == 0) {
                    class213.field3582 = class285.field4810;
                } else {
                    class213.field3582 = class95.field1715.method251((byte) 77);
                }
                class27.field523 = -1;
                return true;
            } else if (class27.field523 == 79) {
                class160.field2684 = class95.field1715.method226(arg0 + 243);
                class27.field523 = -1;
                class166.field2754 = class60.field1152;
                return true;
            } else {
                class44.method412((Throwable) null, arg0 ^ 0xFFFFC567, "T1 - " + class27.field523 + "," + class181.field2953 + "," + class265.field4449 + " - " + class202.field3201);
                class159.method1223(0);
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!vf", name = "<init>", descriptor = "()V", line = 3147)
    public class298() {
    }

    @OriginalMember(owner = "client!vf", name = "<init>", descriptor = "(Lvf;)V", line = 3149)
    public class298(class298 arg0) {
        this.field4983 = arg0.field4983;
        this.field4969 = arg0.field4969;
        this.field4981 = arg0.field4981;
        this.field4972 = arg0.field4972;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lsd;I)Lqd;", line = 3173)
    public static final class40 method2038(class26 arg0, int arg1) {
        field4973++;
        return arg1 == 219 ? class267.method1861(32767, arg0, -27) : (class40) null;
    }
}
