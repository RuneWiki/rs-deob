import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class67 {

    @OriginalMember(owner = "client!je", name = "b", descriptor = "Lpe;")
    public static class109 field1344 = class141.method1120("k", 0);

    @OriginalMember(owner = "client!je", name = "h", descriptor = "Lpe;")
    private static class109 field1350 = class141.method1120("Please wait 5 minutes before trying again)3", 0);

    @OriginalMember(owner = "client!je", name = "e", descriptor = "Lpe;")
    private static class109 field1347 = class141.method1120("Free world", 0);

    @OriginalMember(owner = "client!je", name = "c", descriptor = "Lpe;")
    public static class109 field1345 = field1347;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "Lpe;")
    public static class109 field1343 = field1350;

    @OriginalMember(owner = "client!je", name = "r", descriptor = "Lpe;")
    private static class109 field1360 = class141.method1120("skill)2", 0);

    @OriginalMember(owner = "client!je", name = "n", descriptor = "Lpe;")
    private static class109 field1356 = class141.method1120("Loading)3)3)3", 0);

    @OriginalMember(owner = "client!je", name = "p", descriptor = "Lpe;")
    public static class109 field1358 = field1356;

    @OriginalMember(owner = "client!je", name = "g", descriptor = "Lpe;")
    public static class109 field1349 = field1360;

    @OriginalMember(owner = "client!je", name = "d", descriptor = "I")
    public static int field1346;

    @OriginalMember(owner = "client!je", name = "f", descriptor = "I")
    public static int field1348;

    @OriginalMember(owner = "client!je", name = "i", descriptor = "I")
    public static int field1351;

    @OriginalMember(owner = "client!je", name = "j", descriptor = "I")
    public static int field1352;

    @OriginalMember(owner = "client!je", name = "k", descriptor = "I")
    public static int field1353;

    @OriginalMember(owner = "client!je", name = "m", descriptor = "I")
    public static int field1355;

    @OriginalMember(owner = "client!je", name = "o", descriptor = "I")
    public static int field1357;

    @OriginalMember(owner = "client!je", name = "s", descriptor = "I")
    public static int field1361;

    @OriginalMember(owner = "client!je", name = "l", descriptor = "[I")
    public static int[] field1354;

    @OriginalMember(owner = "client!je", name = "q", descriptor = "[[[B")
    public static byte[][][] field1359;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(BJ)V")
    public static final void method516(byte arg0, long arg1) {
        field1357++;
        if (arg0 >= -28) {
            method521((byte) -31, true, false, 84, false);
        }
        if (arg1 == 0L) {
            return;
        }
        for (int var3 = 0; var3 < class63.field1295; var3++) {
            if (class38.field838[var3] == arg1) {
                class63.field1295--;
                for (int var4 = var3; var4 < class63.field1295; var4++) {
                    class38.field838[var4] = class38.field838[var4 + 1];
                    class143.field3155[var4] = class143.field3155[var4 + 1];
                }
                class91.field1939++;
                class75.field1498 = class9.field219;
                class63.field1299.method535(239, -25013);
                class63.field1299.method157((byte) 59, arg1);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(B)V")
    public static final void method517(byte arg0) {
        field1353++;
        if (arg0 < 121) {
            method522(78, 76, -125, -64);
        }
        class84.field1785.method92((byte) 113);
        class143.field3133.method92((byte) 113);
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Z)V")
    public static final void method518(boolean arg0) {
        field1361++;
        class115 var1 = (class115) class147.field3209.method195((byte) 107);
        if (arg0) {
            field1360 = null;
        }
        while (var1 != null) {
            if (class75.field1513 != var1.field2566 || class12.field264 > var1.field2561) {
                var1.method101((byte) 115);
            } else if (class12.field264 >= var1.field2565) {
                if (var1.field2545 > 0) {
                    class108 var2 = class52.field1067[var1.field2545 - 1];
                    if (var2 != null && var2.field3094 >= 0 && var2.field3094 < 13312 && var2.field3106 >= 0 && var2.field3106 < 13312) {
                        var1.method952(class12.field264, var2.field3106, class126.method1019(var2.field3106, var2.field3094, 1, var1.field2566) - var1.field2549, var2.field3094, 0);
                    }
                }
                if (var1.field2545 < 0) {
                    int var3 = -var1.field2545 - 1;
                    class50 var4;
                    if (class112.field2436 == var3) {
                        var4 = class136.field2975;
                    } else {
                        var4 = class104.field2194[var3];
                    }
                    if (var4 != null && var4.field3094 >= 0 && var4.field3094 < 13312 && var4.field3106 >= 0 && var4.field3106 < 13312) {
                        var1.method952(class12.field264, var4.field3106, class126.method1019(var4.field3106, var4.field3094, 1, var1.field2566) - var1.field2549, var4.field3094, 0);
                    }
                }
                var1.method953(class139.field3042, 11329);
                class147.field3201.method660(class75.field1513, (int) var1.field2558, (int) var1.field2564, (int) var1.field2556, 60, var1, var1.field2532, -1, false);
            }
            var1 = (class115) class147.field3209.method198((byte) -113);
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(I)V")
    public static final void method519(int arg0) {
        class118.field2617 = 0;
        if (arg0 != 3062) {
            return;
        }
        field1355++;
        int var1 = (class136.field2975.field3094 >> 7) + class43.field917;
        int var2 = (class136.field2975.field3106 >> 7) + class82.field1736;
        if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
            class118.field2617 = 1;
        }
        if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
            class118.field2617 = 1;
        }
        if (class118.field2617 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
            class118.field2617 = 0;
        }
    }

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(B)V")
    public static void method520(byte arg0) {
        field1358 = null;
        field1349 = null;
        if (arg0 != 53) {
            return;
        }
        field1356 = null;
        field1345 = null;
        field1350 = null;
        field1359 = null;
        field1354 = null;
        field1360 = null;
        field1344 = null;
        field1347 = null;
        field1343 = null;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(BZZIZ)Lre;")
    public static final class123 method521(byte arg0, boolean arg1, boolean arg2, int arg3, boolean arg4) {
        field1352++;
        class38 var5 = null;
        if (arg0 > -124) {
            method518(true);
        }
        if (class61.field1253 != null) {
            var5 = new class38(arg3, class61.field1253, class91.field1950[arg3], 1000000);
        }
        return new class123(var5, class147.field3213, arg3, arg4, arg1, arg2);
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IIII)V")
    public static final void method522(int arg0, int arg1, int arg2, int arg3) {
        field1348++;
        class154 var4 = class102.method821(arg3, true, arg1);
        if (var4 != null && var4.field3499 != null) {
            class93 var5 = new class93();
            var5.field2001 = var4.field3499;
            var5.field2014 = var4;
            class123.method1003(var5, (byte) 113);
        }
        class139.field3031 = true;
        class139.field3032 = arg3;
        class135.field2956 = arg1;
        class18.field438 = arg2;
        int var6 = 117 % ((arg0 + 21) / 39);
        class138.method1092(0, var4);
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(ILwa;I)I")
    public static final int method523(int arg0, class154 arg1, int arg2) {
        field1346++;
        if (arg1.field3477 == null || arg1.field3477.length <= arg0) {
            return -2;
        }
        try {
            int var3 = 0;
            int[] var4 = arg1.field3477[arg0];
            int var5 = 0;
            byte var6 = 0;
            while (true) {
                int var7 = 0;
                int var8 = var4[var5++];
                byte var9 = 0;
                if (var8 == 0) {
                    return var3;
                }
                if (var8 == 15) {
                    var9 = 1;
                }
                if (var8 == 16) {
                    var9 = 2;
                }
                if (var8 == 17) {
                    var9 = 3;
                }
                if (var8 == 1) {
                    var7 = class76.field1530[var4[var5++]];
                }
                if (var8 == 2) {
                    var7 = class14.field375[var4[var5++]];
                }
                if (var8 == 3) {
                    var7 = class92.field1968[var4[var5++]];
                }
                if (var8 == 4) {
                    int var10 = var4[var5++] << 16;
                    int var11 = var10 + var4[var5++];
                    class154 var12 = class44.method403(var11, true);
                    int var13 = var4[var5++];
                    if (var13 != -1 && (!class4.method43((byte) 94, var13).field2401 || class63.field1291)) {
                        for (int var14 = 0; var14 < var12.field3496.length; var14++) {
                            if (var13 + 1 == var12.field3496[var14]) {
                                var7 += var12.field3450[var14];
                            }
                        }
                    }
                }
                if (var8 == 5) {
                    var7 = class153.field3376[var4[var5++]];
                }
                if (var8 == 6) {
                    var7 = class118.field2624[class14.field375[var4[var5++]] - 1];
                }
                if (var8 == 7) {
                    var7 = class153.field3376[var4[var5++]] * 100 / 46875;
                }
                if (var8 == 8) {
                    var7 = class136.field2975.field1047;
                }
                if (var8 == 9) {
                    for (int var15 = 0; var15 < 25; var15++) {
                        if (class94.field2034[var15]) {
                            var7 += class14.field375[var15];
                        }
                    }
                }
                if (var8 == 10) {
                    int var16 = var4[var5++] << 16;
                    int var17 = var16 + var4[var5++];
                    class154 var18 = class44.method403(var17, true);
                    int var19 = var4[var5++];
                    if (var19 != -1 && (!class4.method43((byte) 94, var19).field2401 || class63.field1291)) {
                        for (int var20 = 0; var20 < var18.field3496.length; var20++) {
                            if (var19 + 1 == var18.field3496[var20]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var8 == 11) {
                    var7 = class102.field2147;
                }
                if (var8 == 12) {
                    var7 = class120.field2669;
                }
                if (var8 == 13) {
                    int var21 = class153.field3376[var4[var5++]];
                    int var22 = var4[var5++];
                    var7 = (var21 & 0x1 << var22) == 0 ? 0 : 1;
                }
                if (var8 == 14) {
                    int var23 = var4[var5++];
                    var7 = class120.method975((byte) -96, var23);
                }
                if (var8 == 18) {
                    var7 = (class136.field2975.field3094 >> 7) + class43.field917;
                }
                if (var8 == 19) {
                    var7 = (class136.field2975.field3106 >> 7) + class82.field1736;
                }
                if (var8 == 20) {
                    var7 = var4[var5++];
                }
                if (var9 == 0) {
                    if (var6 == 0) {
                        var3 += var7;
                    }
                    if (var6 == 1) {
                        var3 -= var7;
                    }
                    if (var6 == 2 && var7 != 0) {
                        var3 /= var7;
                    }
                    if (var6 == 3) {
                        var3 *= var7;
                    }
                    var6 = 0;
                } else {
                    var6 = var9;
                }
            }
        } catch (Exception var24) {
            return arg2 <= 50 ? -73 : -1;
        }
    }
}
