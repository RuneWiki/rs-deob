import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pl")
public class class390 {

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "[Lsf;")
    public class306[] field5480 = new class306[100];

    @OriginalMember(owner = "client!pl", name = "g", descriptor = "[I")
    public int[] field5486 = new int[3];

    @OriginalMember(owner = "client!pl", name = "h", descriptor = "[Lqm;")
    public class78[] field5487 = new class78[8];

    @OriginalMember(owner = "client!pl", name = "f", descriptor = "[I")
    public int[] field5485 = new int[100];

    @OriginalMember(owner = "client!pl", name = "i", descriptor = "I")
    public static int field5488 = 20;

    @OriginalMember(owner = "client!pl", name = "m", descriptor = "I")
    public static int field5492 = 0;

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "I")
    public int field5481;

    @OriginalMember(owner = "client!pl", name = "d", descriptor = "I")
    public static int field5483;

    @OriginalMember(owner = "client!pl", name = "j", descriptor = "I")
    public static int field5489;

    @OriginalMember(owner = "client!pl", name = "l", descriptor = "I")
    public static int field5491;

    @OriginalMember(owner = "client!pl", name = "e", descriptor = "Ltj;")
    public static class108 field5484;

    @OriginalMember(owner = "client!pl", name = "k", descriptor = "Lvq;")
    public static class269 field5490;

    @OriginalMember(owner = "client!pl", name = "c", descriptor = "Ljava/lang/Object;")
    public Object field5482;

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(II)Ljava/lang/String;")
    public static final String method2460(int arg0, int arg1) {
        field5491++;
        return arg1 == 16765590 ? (arg0 >> 24 & 0xFF) + "." + ((arg0 & 0xFFD296) >> 16) + "." + ((arg0 & 0xFF9A) >> 8) + "." + (arg0 & 0xFF) : null;
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(Z)V")
    public static void method2461(boolean arg0) {
        if (!arg0) {
            field5490 = null;
            field5484 = null;
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "()V")
    public static final void method2462() {
        class435.field6217 = 0;
        label191: for (int var0 = 0; var0 < class10.field126; var0++) {
            class371 var1 = class204.field2875[var0];
            if (class115.field1485 != null) {
                for (int var2 = 0; var2 < class115.field1485.length; var2++) {
                    if (class115.field1485[var2] != -1000000 && (var1.field5280 <= class115.field1485[var2] || var1.field5273 <= class115.field1485[var2]) && (var1.field5275 <= class126.field1711[var2] || var1.field5282 <= class126.field1711[var2]) && (var1.field5275 >= class373.field5318[var2] || var1.field5282 >= class373.field5318[var2]) && (var1.field5272 <= class86.field1121[var2] || var1.field5285 <= class86.field1121[var2]) && (var1.field5272 >= class20.field268[var2] || var1.field5285 >= class20.field268[var2])) {
                        continue label191;
                    }
                }
            }
            if (var1.field5270 == 1) {
                int var3 = var1.field5294 + class150.field2249 - class65.field891;
                if (var3 >= 0 && var3 <= class150.field2249 + class150.field2249) {
                    int var4 = var1.field5287 + class150.field2249 - class333.field4842;
                    if (var4 < 0) {
                        var4 = 0;
                    }
                    int var5 = var1.field5276 + class150.field2249 - class333.field4842;
                    if (var5 > class150.field2249 + class150.field2249) {
                        var5 = class150.field2249 + class150.field2249;
                    }
                    boolean var6 = false;
                    while (var4 <= var5) {
                        if (class9.field125[var3][var4++]) {
                            var6 = true;
                            break;
                        }
                    }
                    if (var6) {
                        int var7 = class72.field940 - var1.field5275;
                        if (var7 > 32) {
                            var1.field5278 = 1;
                        } else {
                            if (var7 >= -32) {
                                continue;
                            }
                            var1.field5278 = 2;
                            var7 = -var7;
                        }
                        var1.field5288 = (var1.field5272 - class265.field3899 << 8) / var7;
                        var1.field5293 = (var1.field5285 - class265.field3899 << 8) / var7;
                        var1.field5277 = (var1.field5280 - class316.field4641 << 8) / var7;
                        var1.field5289 = (var1.field5273 - class316.field4641 << 8) / var7;
                        class114.field1474[class435.field6217++] = var1;
                    }
                }
            } else if (var1.field5270 == 2) {
                int var8 = var1.field5287 + class150.field2249 - class333.field4842;
                if (var8 >= 0 && var8 <= class150.field2249 + class150.field2249) {
                    int var9 = var1.field5294 + class150.field2249 - class65.field891;
                    if (var9 < 0) {
                        var9 = 0;
                    }
                    int var10 = var1.field5283 + class150.field2249 - class65.field891;
                    if (var10 > class150.field2249 + class150.field2249) {
                        var10 = class150.field2249 + class150.field2249;
                    }
                    boolean var11 = false;
                    while (var9 <= var10) {
                        if (class9.field125[var9++][var8]) {
                            var11 = true;
                            break;
                        }
                    }
                    if (var11) {
                        int var12 = class265.field3899 - var1.field5272;
                        if (var12 > 32) {
                            var1.field5278 = 3;
                        } else {
                            if (var12 >= -32) {
                                continue;
                            }
                            var1.field5278 = 4;
                            var12 = -var12;
                        }
                        var1.field5284 = (var1.field5275 - class72.field940 << 8) / var12;
                        var1.field5290 = (var1.field5282 - class72.field940 << 8) / var12;
                        var1.field5277 = (var1.field5280 - class316.field4641 << 8) / var12;
                        var1.field5289 = (var1.field5273 - class316.field4641 << 8) / var12;
                        class114.field1474[class435.field6217++] = var1;
                    }
                }
            } else if (var1.field5270 == 4) {
                int var13 = var1.field5280 - class316.field4641;
                if (var13 > 128) {
                    int var14 = var1.field5287 + class150.field2249 - class333.field4842;
                    if (var14 < 0) {
                        var14 = 0;
                    }
                    int var15 = var1.field5276 + class150.field2249 - class333.field4842;
                    if (var15 > class150.field2249 + class150.field2249) {
                        var15 = class150.field2249 + class150.field2249;
                    }
                    if (var14 <= var15) {
                        int var16 = var1.field5294 + class150.field2249 - class65.field891;
                        if (var16 < 0) {
                            var16 = 0;
                        }
                        int var17 = var1.field5283 + class150.field2249 - class65.field891;
                        if (var17 > class150.field2249 + class150.field2249) {
                            var17 = class150.field2249 + class150.field2249;
                        }
                        boolean var18 = false;
                        label163: for (int var19 = var16; var19 <= var17; var19++) {
                            for (int var20 = var14; var20 <= var15; var20++) {
                                if (class9.field125[var19][var20]) {
                                    var18 = true;
                                    break label163;
                                }
                            }
                        }
                        if (var18) {
                            var1.field5278 = 5;
                            var1.field5284 = (var1.field5275 - class72.field940 << 8) / var13;
                            var1.field5290 = (var1.field5282 - class72.field940 << 8) / var13;
                            var1.field5288 = (var1.field5272 - class265.field3899 << 8) / var13;
                            var1.field5293 = (var1.field5285 - class265.field3899 << 8) / var13;
                            class114.field1474[class435.field6217++] = var1;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(IZ)V")
    public static final void method2463(int arg0, boolean arg1) {
        field5489++;
        if (class423.field6041 == arg0) {
            return;
        }
        if (class423.field6041 == 0) {
            class57.method373(-27054);
        }
        if (!arg1) {
            field5484 = null;
        }
        if (arg0 == 40) {
            class119.method732(-92);
        }
        if (arg0 != 40 && class129.field1835 != null) {
            class129.field1835.method1093(false);
            class129.field1835 = null;
        }
        if (class423.field6041 == 25 || class423.field6041 == 28) {
            class365.field5227.field1405 = 2;
            class47.field625.field1405 = 2;
            class245.field3662.field1405 = 2;
            class224.field3357.field1405 = 2;
            class449.field6414.field1405 = 2;
            class418.field6002.field1405 = 2;
            class196.field2813.field1405 = 2;
        }
        if (arg0 == 25 || arg0 == 28) {
            class382.field5419 = 0;
            class185.field2648 = 1;
            class255.field3774 = 0;
            class275.field3968 = 0;
            class130.field1882 = 1;
            class431.method2693(true, -1);
            class365.field5227.field1405 = 1;
            class47.field625.field1405 = 1;
            class245.field3662.field1405 = 1;
            class224.field3357.field1405 = 1;
            class449.field6414.field1405 = 1;
            class418.field6002.field1405 = 1;
            class196.field2813.field1405 = 1;
        }
        if (arg0 == 25 || arg0 == 10) {
            class150.method1111((byte) -104);
        }
        if (arg0 == 5) {
            class393.method2475(-101, class59.field786, class15.field216);
        } else {
            class264.method1815(1);
        }
        boolean var2 = arg0 == 5 || arg0 == 10 || arg0 == 28;
        boolean var3 = class423.field6041 == 5 || class423.field6041 == 10 || class423.field6041 == 28;
        if (var3 != var2) {
            if (var2) {
                class30.field367 = class15.field233;
                if (class131.field1914 == 0) {
                    class182.method1302(2, true);
                } else {
                    class239.method1629((byte) 92, class72.field942, 2, 0, 255, false, class15.field233);
                }
                class187.field2661.method500(false, (byte) -114);
            } else {
                class182.method1302(2, true);
                class187.field2661.method500(true, (byte) -114);
                if (class119.field1615 != null) {
                    class119.field1615.method1850(160);
                    class119.field1615 = null;
                }
            }
        }
        if (arg0 == 25 || arg0 == 28 || arg0 == 40) {
            class59.field786.method911();
        }
        class423.field6041 = arg0;
    }
}
