import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class7 {

    @OriginalMember(owner = "client!b", name = "b", descriptor = "Lv;")
    public static class122 field158 = class55.method425(-52, "zur\u001c1ck auf die RuneScape)2Webseite gehen");

    @OriginalMember(owner = "client!b", name = "h", descriptor = "[I")
    public static int[] field164 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @OriginalMember(owner = "client!b", name = "i", descriptor = "Lv;")
    private static class122 field165 = class55.method425(-104, "Loaded gamescreen");

    @OriginalMember(owner = "client!b", name = "e", descriptor = "Lv;")
    public static class122 field161 = field165;

    @OriginalMember(owner = "client!b", name = "k", descriptor = "[[B")
    public static byte[][] field167 = new byte[1000][];

    @OriginalMember(owner = "client!b", name = "f", descriptor = "Ljb;")
    public static class56 field162 = new class56(200);

    @OriginalMember(owner = "client!b", name = "n", descriptor = "Lv;")
    public static class122 field170 = class55.method425(-123, "(U4");

    @OriginalMember(owner = "client!b", name = "s", descriptor = "[I")
    public static int[] field175 = new int[2048];

    @OriginalMember(owner = "client!b", name = "o", descriptor = "I")
    public static int field171 = 0;

    @OriginalMember(owner = "client!b", name = "r", descriptor = "I")
    public static int field174 = 0;

    @OriginalMember(owner = "client!b", name = "u", descriptor = "Lv;")
    public static class122 field177 = class55.method425(-76, "Verbindung abgebrochen)3");

    @OriginalMember(owner = "client!b", name = "a", descriptor = "I")
    public static int field157;

    @OriginalMember(owner = "client!b", name = "c", descriptor = "I")
    public static int field159;

    @OriginalMember(owner = "client!b", name = "d", descriptor = "I")
    public static int field160;

    @OriginalMember(owner = "client!b", name = "g", descriptor = "I")
    public static int field163;

    @OriginalMember(owner = "client!b", name = "j", descriptor = "I")
    public static int field166;

    @OriginalMember(owner = "client!b", name = "l", descriptor = "I")
    public static int field168;

    @OriginalMember(owner = "client!b", name = "m", descriptor = "I")
    public static int field169;

    @OriginalMember(owner = "client!b", name = "q", descriptor = "I")
    public static int field173;

    @OriginalMember(owner = "client!b", name = "t", descriptor = "I")
    public static int field176;

    @OriginalMember(owner = "client!b", name = "p", descriptor = "Lab;")
    public static class3 field172;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(I[BII)I", line = 8)
    public static final int method76(int arg0, byte[] arg1, int arg2, int arg3) {
        field168++;
        int var4 = -1;
        for (int var5 = arg0; var5 < arg3; var5++) {
            var4 = var4 >>> 8 ^ class69.field1817[(arg1[var5] ^ var4) & 0xFF];
        }
        if (arg2 != -1444842840) {
            method82(false);
        }
        return ~var4;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Ljc;Ljava/awt/Component;B)Lsd;", line = 33)
    public static final class111 method77(class57 arg0, Component arg1, byte arg2) {
        class19.method195(arg2 ^ 0xFFFFDCE1, arg1, arg0);
        field157++;
        class111 var3 = new class111();
        if (arg2 != -39) {
            field165 = null;
        }
        class22.method228(var3, 8);
        return var3;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(B)V", line = 53)
    public static final void method78(byte arg0) {
        if (class122.field2990 == 0 && class91.field2334 == 0) {
            class108.method839(class83.field2154, class72.field1855, 28, 0, class51.field1287, field171, -120);
            class90.field2320++;
        }
        field163++;
        int var1 = -1;
        if (arg0 != -79) {
            field161 = null;
        }
        for (int var2 = 0; var2 < class68.field1793; var2++) {
            int var3 = class68.field1784[var2];
            int var4 = var3 & 0x7F;
            int var5 = var3 >> 7 & 0x7F;
            int var6 = var3 >> 29 & 0x3;
            int var7 = var3 >> 14 & 0x7FFF;
            if (var1 != var3) {
                var1 = var3;
                if (var6 == 2 && class90.field2306.method22(class34.field848, var4, var5, var3) >= 0) {
                    class42 var8 = class14.method124((byte) 52, var7);
                    if (var8.field1067 != null) {
                        var8 = var8.method364(arg0 + 3942);
                    }
                    if (var8 == null) {
                        continue;
                    }
                    if (class122.field2990 == 1) {
                        class8.field187++;
                        class108.method839(class100.field2505, var5, 15, var3, class59.method454(new class122[] { class61.field1568, class70.field1836, var8.field1081 }, 5176), var4, -120);
                    } else if (class91.field2334 != 1) {
                        class62.field1587++;
                        class122[] var9 = var8.field1060;
                        if (class90.field2324) {
                            var9 = class90.method720((byte) 110, var9);
                        }
                        if (var9 != null) {
                            for (int var10 = 4; var10 >= 0; var10--) {
                                if (var9[var10] != null) {
                                    class6.field148++;
                                    short var11 = 0;
                                    if (var10 == 0) {
                                        var11 = 35;
                                    }
                                    if (var10 == 1) {
                                        var11 = 47;
                                    }
                                    if (var10 == 2) {
                                        var11 = 25;
                                    }
                                    if (var10 == 3) {
                                        var11 = 41;
                                    }
                                    if (var10 == 4) {
                                        var11 = 1004;
                                    }
                                    class108.method839(var9[var10], var5, var11, var3, class59.method454(new class122[] { class120.field2921, var8.field1081 }, 5176), var4, 85);
                                }
                            }
                        }
                        class108.method839(class119.field2899, var5, 1003, var8.field1113 << 14, class59.method454(new class122[] { class120.field2921, var8.field1081 }, 5176), var4, -122);
                    } else if ((class32.field778 & 0x4) == 4) {
                        class6.field144++;
                        class108.method839(class21.field557, var5, 1, var3, class59.method454(new class122[] { class70.field1825, class70.field1836, var8.field1081 }, 5176), var4, 98);
                    }
                }
                if (var6 == 1) {
                    class80 var12 = class94.field2423[var7];
                    if (var12.field2089.field540 == 1 && (var12.field343 & 0x7F) == 64 && (var12.field349 & 0x7F) == 64) {
                        for (int var13 = 0; var13 < class49.field1245; var13++) {
                            class80 var16 = class94.field2423[class21.field581[var13]];
                            if (var16 != null && var12 != var16 && var16.field2089.field540 == 1 && var12.field343 == var16.field343 && var12.field349 == var16.field349) {
                                class54.method417((byte) -73, class21.field581[var13], var4, var16.field2089, var5);
                            }
                        }
                        for (int var14 = 0; var14 < class108.field2671; var14++) {
                            class55 var15 = class125.field3043[field175[var14]];
                            if (var15 != null && var12.field343 == var15.field343 && var12.field349 == var15.field349) {
                                class122.method945(var5, 90, var4, field175[var14], var15);
                            }
                        }
                    }
                    class54.method417((byte) -73, var7, var4, var12.field2089, var5);
                }
                if (var6 == 0) {
                    class55 var17 = class125.field3043[var7];
                    if ((var17.field343 & 0x7F) == 64 && (var17.field349 & 0x7F) == 64) {
                        for (int var18 = 0; var18 < class49.field1245; var18++) {
                            class80 var21 = class94.field2423[class21.field581[var18]];
                            if (var21 != null && var21.field2089.field540 == 1 && var17.field343 == var21.field343 && var17.field349 == var21.field349) {
                                class54.method417((byte) -73, class21.field581[var18], var4, var21.field2089, var5);
                            }
                        }
                        for (int var19 = 0; var19 < class108.field2671; var19++) {
                            class55 var20 = class125.field3043[field175[var19]];
                            if (var20 != null && var17 != var20 && var17.field343 == var20.field343 && var17.field349 == var20.field349) {
                                class122.method945(var5, 90, var4, field175[var19], var20);
                            }
                        }
                    }
                    class122.method945(var5, 90, var4, var7, var17);
                }
                if (var6 == 3) {
                    class34 var22 = class50.field1260[class34.field848][var4][var5];
                    if (var22 != null) {
                        for (class102 var23 = (class102) var22.method307((byte) -126); var23 != null; var23 = (class102) var22.method305(-111)) {
                            class10 var24 = class5.method69(var23.field2529, false);
                            if (class122.field2990 == 1) {
                                class108.method839(class100.field2505, var5, 46, var23.field2529, class59.method454(new class122[] { class61.field1568, class47.field1224, var24.field222 }, 5176), var4, -128);
                                class33.field817++;
                            } else if (class91.field2334 != 1) {
                                class122[] var25 = var24.field257;
                                if (class90.field2324) {
                                    var25 = class90.method720((byte) 122, var25);
                                }
                                for (int var26 = 4; var26 >= 0; var26--) {
                                    if (var25 != null && var25[var26] != null) {
                                        class58.field1508++;
                                        byte var27 = 0;
                                        if (var26 == 0) {
                                            var27 = 55;
                                        }
                                        if (var26 == 1) {
                                            var27 = 40;
                                        }
                                        if (var26 == 2) {
                                            var27 = 14;
                                        }
                                        if (var26 == 3) {
                                            var27 = 30;
                                        }
                                        if (var26 == 4) {
                                            var27 = 45;
                                        }
                                        class108.method839(var25[var26], var5, var27, var23.field2529, class59.method454(new class122[] { class28.field729, var24.field222 }, 5176), var4, arg0 - 41);
                                    } else if (var26 == 2) {
                                        class36.field877++;
                                        class108.method839(class21.field555, var5, 14, var23.field2529, class59.method454(new class122[] { class28.field729, var24.field222 }, arg0 + 5255), var4, arg0 + 150);
                                    }
                                }
                                class108.method839(class119.field2899, var5, 1002, var23.field2529, class59.method454(new class122[] { class28.field729, var24.field222 }, 5176), var4, arg0 ^ 0xFFFFFFAE);
                                class32.field774++;
                            } else if ((class32.field778 & 0x1) == 1) {
                                class108.method839(class21.field557, var5, 9, var23.field2529, class59.method454(new class122[] { class70.field1825, class47.field1224, var24.field222 }, 5176), var4, 95);
                                class36.field907++;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IIIIIIIIIBI)V", line = 352)
    public static final void method79(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, byte arg9, int arg10) {
        if (arg9 != 65) {
            field170 = null;
        }
        field159++;
        if (!class45.method377((byte) 32, arg4) || (arg2 > arg6 || arg10 > arg8 || arg7 <= arg6 || arg0 <= arg8)) {
            return;
        }
        class36[] var11 = class76.field2039[arg4];
        for (int var12 = 0; var12 < var11.length; var12++) {
            class36 var13 = var11[var12];
            if (var13 != null && var13.field882 == arg5) {
                int var14 = var13.field948 + arg2;
                int var15 = var13.field934 + arg10 - arg1;
                if ((var13.field949 >= 0 || var13.field913 != 0) && var14 <= arg6 && arg8 >= var15 && arg6 < var13.field891 + var14 && var15 + var13.field955 > arg8) {
                    if (var13.field949 >= 0) {
                        class95.field2433 = var13.field949;
                    } else {
                        class95.field2433 = var12;
                    }
                }
                if (var13.field941 == 8 && arg6 >= var14 && var15 <= arg8 && arg6 < var13.field891 + var14 && var13.field955 + var15 > arg8) {
                    class112.field2736 = var12;
                }
                if (var13.field941 != 0) {
                    if (var13.field937 == 1 && var14 <= arg6 && arg8 >= var15 && arg6 < var13.field891 + var14 && arg8 < var13.field955 + var15) {
                        boolean var16 = false;
                        if (var13.field932 != 0) {
                            var16 = class54.method419(var13, (byte) 116);
                        }
                        if (!var16) {
                            class62.field1592++;
                            class108.method839(var13.field881, (arg4 << 16) + var12, 31, 0, class51.field1287, 0, 126);
                        }
                    }
                    if (var13.field937 == 2 && class91.field2334 == 0 && arg6 >= var14 && arg8 >= var15 && arg6 < var13.field891 + var14 && arg8 < var15 + var13.field955) {
                        class37.field963++;
                        class108.method839(var13.field957, (arg4 << 16) + var12, 43, 0, class59.method454(new class122[] { class75.field2010, var13.field953 }, arg9 ^ 0x1479), 0, 63);
                    }
                    if (var13.field937 == 3 && var14 <= arg6 && arg8 >= var15 && arg6 < var13.field891 + var14 && var13.field955 + var15 > arg8) {
                        class45.field1175++;
                        byte var17;
                        if (arg3 == 3) {
                            var17 = 26;
                        } else {
                            var17 = 53;
                        }
                        class108.method839(class22.field604, (arg4 << 16) + var12, var17, 0, class51.field1287, 0, -120);
                    }
                    if (var13.field937 == 4 && arg6 >= var14 && var15 <= arg8 && var13.field891 + var14 > arg6 && arg8 < var15 + var13.field955) {
                        class61.field1575++;
                        class108.method839(var13.field881, (arg4 << 16) + var12, 33, 0, class51.field1287, 0, arg9 ^ 0xFFFFFFC0);
                    }
                    if (var13.field937 == 5 && arg6 >= var14 && var15 <= arg8 && var13.field891 + var14 > arg6 && var15 + var13.field955 > arg8) {
                        class108.method839(var13.field881, (arg4 << 16) + var12, 18, 0, class51.field1287, 0, arg9 ^ 0xFFFFFFC3);
                        class103.field2555++;
                    }
                    if (var13.field937 == 6 && !class24.field664 && arg6 >= var14 && var15 <= arg8 && arg6 < var13.field891 + var14 && var15 + var13.field955 > arg8) {
                        class108.method839(var13.field881, (arg4 << 16) + var12, 11, 0, class51.field1287, 0, arg9 - 186);
                        class41.field1046++;
                    }
                    if (var13.field941 == 2) {
                        int var18 = 0;
                        for (int var19 = 0; var19 < var13.field955; var19++) {
                            for (int var20 = 0; var20 < var13.field891; var20++) {
                                int var21 = (var13.field954 + 32) * var19 + var15;
                                int var22 = var14 + (var13.field930 + 32) * var20;
                                if (var18 < 20) {
                                    var22 += var13.field890[var18];
                                    var21 += var13.field960[var18];
                                }
                                if (arg6 >= var22 && arg8 >= var21 && arg6 < var22 + 32 && arg8 < var21 + 32) {
                                    class69.field1823 = (arg4 << 16) + var12;
                                    class112.field2746 = var18;
                                    if (var13.field897[var18] > 0) {
                                        class10 var23 = class5.method69(var13.field897[var18] - 1, false);
                                        if (class122.field2990 == 1 && var13.field936) {
                                            if ((arg4 << 16) + var12 != class11.field334 || class49.field1246 != var18) {
                                                class108.method839(class100.field2505, (arg4 << 16) + var12, 29, var23.field245, class59.method454(new class122[] { class61.field1568, class47.field1224, var23.field222 }, 5176), var18, -128);
                                                class40.field1022++;
                                            }
                                        } else if (class91.field2334 != 1 || !var13.field936) {
                                            class122[] var24 = var23.field250;
                                            class80.field2083++;
                                            if (class90.field2324) {
                                                var24 = class90.method720((byte) 110, var24);
                                            }
                                            if (var13.field936) {
                                                for (int var25 = 4; var25 >= 3; var25--) {
                                                    if (var24 != null && var24[var25] != null) {
                                                        class11.field337++;
                                                        byte var26;
                                                        if (var25 == 3) {
                                                            var26 = 49;
                                                        } else {
                                                            var26 = 4;
                                                        }
                                                        class108.method839(var24[var25], (arg4 << 16) + var12, var26, var23.field245, class59.method454(new class122[] { class28.field729, var23.field222 }, 5176), var18, 28);
                                                    } else if (var25 == 4) {
                                                        class126.field3059++;
                                                        class108.method839(class42.field1122, (arg4 << 16) + var12, 4, var23.field245, class59.method454(new class122[] { class28.field729, var23.field222 }, 5176), var18, -126);
                                                    }
                                                }
                                            }
                                            if (var13.field929) {
                                                class108.method839(class100.field2505, (arg4 << 16) + var12, 17, var23.field245, class59.method454(new class122[] { class28.field729, var23.field222 }, arg9 ^ 0x1479), var18, 9);
                                                class40.field1013++;
                                            }
                                            if (var13.field936 && var24 != null) {
                                                for (int var27 = 2; var27 >= 0; var27--) {
                                                    if (var24[var27] != null) {
                                                        class25.field670++;
                                                        byte var28 = 0;
                                                        if (var27 == 0) {
                                                            var28 = 38;
                                                        }
                                                        if (var27 == 1) {
                                                            var28 = 51;
                                                        }
                                                        if (var27 == 2) {
                                                            var28 = 27;
                                                        }
                                                        class108.method839(var24[var27], (arg4 << 16) + var12, var28, var23.field245, class59.method454(new class122[] { class28.field729, var23.field222 }, 5176), var18, arg9 - 46);
                                                    }
                                                }
                                            }
                                            class122[] var29 = var13.field906;
                                            if (class90.field2324) {
                                                var29 = class90.method720((byte) 107, var29);
                                            }
                                            if (var29 != null) {
                                                for (int var30 = 4; var30 >= 0; var30--) {
                                                    if (var29[var30] != null) {
                                                        class73.field1902++;
                                                        byte var31 = 0;
                                                        if (var30 == 0) {
                                                            var31 = 24;
                                                        }
                                                        if (var30 == 1) {
                                                            var31 = 50;
                                                        }
                                                        if (var30 == 2) {
                                                            var31 = 56;
                                                        }
                                                        if (var30 == 3) {
                                                            var31 = 2;
                                                        }
                                                        if (var30 == 4) {
                                                            var31 = 54;
                                                        }
                                                        class108.method839(var29[var30], (arg4 << 16) + var12, var31, var23.field245, class59.method454(new class122[] { class28.field729, var23.field222 }, 5176), var18, -125);
                                                    }
                                                }
                                            }
                                            class108.method839(class119.field2899, (arg4 << 16) + var12, 1006, var23.field245, class59.method454(new class122[] { class28.field729, var23.field222 }, 5176), var18, 120);
                                        } else if ((class32.field778 & 0x10) == 16) {
                                            class42.field1108++;
                                            class108.method839(class21.field557, (arg4 << 16) + var12, 7, var23.field245, class59.method454(new class122[] { class70.field1825, class47.field1224, var23.field222 }, 5176), var18, 36);
                                        }
                                    }
                                }
                                var18++;
                            }
                        }
                    }
                } else if (!var13.field943 || class127.method1001(var12, arg3, false) || class19.field479) {
                    method79(var13.field955 + var15, var13.field879, var14, arg3, arg4, var12, arg6, var13.field891 + var14, arg8, (byte) 65, var15);
                    if (var13.field955 < var13.field947) {
                        class90.method716(var13, arg6, 106, var13.field891 + var14, arg3, arg8, var15, var13.field947, var13.field955);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IIIIIIIIBI)V", line = 697)
    public static final void method80(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte arg8, int arg9) {
        class5 var10 = null;
        field166++;
        if (arg8 < 95) {
            return;
        }
        for (class5 var11 = (class5) class129.field3126.method311((byte) 105); var11 != null; var11 = (class5) class129.field3126.method302((byte) -106)) {
            if (var11.field136 == arg4 && var11.field118 == arg5 && var11.field137 == arg0 && var11.field139 == arg7) {
                var10 = var11;
                break;
            }
        }
        if (var10 == null) {
            var10 = new class5();
            var10.field139 = arg7;
            var10.field118 = arg5;
            var10.field136 = arg4;
            var10.field137 = arg0;
            class8.method84(82, var10);
            class129.field3126.method312(false, var10);
        }
        var10.field130 = arg9;
        var10.field124 = arg1;
        var10.field140 = arg3;
        var10.field121 = arg6;
        var10.field126 = arg2;
    }

    @OriginalMember(owner = "client!b", name = "b", descriptor = "(B)V", line = 777)
    public static void method81(byte arg0) {
        field165 = null;
        field164 = null;
        field175 = null;
        field167 = null;
        field177 = null;
        field161 = null;
        field158 = null;
        field172 = null;
        field170 = null;
        field162 = null;
        if (arg0 <= 45) {
            method77(null, null, (byte) 122);
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Z)V", line = 802)
    public static final void method82(boolean arg0) {
        if (!arg0) {
            method79(22, 112, 99, 1, -35, -72, 94, 46, 121, (byte) -23, 71);
        }
        for (int var1 = -1; var1 < class108.field2671; var1++) {
            int var5;
            if (var1 == -1) {
                var5 = 2047;
            } else {
                var5 = field175[var1];
            }
            class55 var6 = class125.field3043[var5];
            if (var6 != null && var6.field281 > 0) {
                var6.field281--;
                if (var6.field281 == 0) {
                    var6.field303 = null;
                }
            }
        }
        field160++;
        for (int var2 = 0; var2 < class49.field1245; var2++) {
            int var3 = class21.field581[var2];
            class80 var4 = class94.field2423[var3];
            if (var4 != null && var4.field281 > 0) {
                var4.field281--;
                if (var4.field281 == 0) {
                    var4.field303 = null;
                }
            }
        }
    }
}
