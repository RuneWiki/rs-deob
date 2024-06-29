import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public abstract class class50 {

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "I")
    public int field927;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "I")
    public int field925;

    @OriginalMember(owner = "client!ee", name = "g", descriptor = "I")
    public int field931;

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "S")
    public static short field926 = 32767;

    @OriginalMember(owner = "client!ee", name = "f", descriptor = "I")
    public static int field930 = 0;

    @OriginalMember(owner = "client!ee", name = "i", descriptor = "Li;")
    public static class88 field933 = class208.method1425(105, "_");

    @OriginalMember(owner = "client!ee", name = "d", descriptor = "I")
    public static int field928;

    @OriginalMember(owner = "client!ee", name = "e", descriptor = "I")
    public static int field929;

    @OriginalMember(owner = "client!ee", name = "h", descriptor = "I")
    public static int field932;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(III)V")
    public abstract void method371(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(B)V")
    public static final void method372(byte arg0) {
        field929++;
        if (arg0 >= -93) {
            field933 = null;
        }
        if (class135.field2516 != null || class179.field3570 != null) {
            return;
        }
        int var1 = class36.field625;
        if (class108.field1960) {
            if (var1 != 1) {
                int var6 = class28.field471;
                int var7 = class239.field4451;
                if (class86.field1549 - 10 > var6 || class237.field4423 + class86.field1549 + 10 < var6 || var7 < class234.field4385 - 10 || class234.field4385 + class47.field889 + 10 < var7) {
                    class108.field1960 = false;
                    class126.method863(class47.field889, class237.field4423, class234.field4385, class86.field1549, (byte) -122);
                }
            }
            if (var1 != 1) {
                return;
            }
            int var8 = class86.field1549;
            int var9 = class234.field4385;
            int var10 = class237.field4423;
            int var11 = class226.field4241;
            int var12 = class172.field3341;
            int var13 = -1;
            for (int var14 = 0; var14 < class203.field3864; var14++) {
                int var15 = var9 + (class203.field3864 + -1 + -var14) * 15 + 31;
                if (var11 > var8 && var11 < var8 + var10 && var12 > var15 - 13 && var12 < var15 + 3) {
                    var13 = var14;
                }
            }
            if (var13 != -1) {
                class175.method1259(2, var13);
            }
            class108.field1960 = false;
            class126.method863(class47.field889, class237.field4423, class234.field4385, class86.field1549, (byte) -118);
            return;
        }
        if (var1 == 1 && class203.field3864 > 0) {
            short var2 = class53.field994[class203.field3864 - 1];
            if (var2 == 6 || var2 == 8 || var2 == 49 || var2 == 44 || var2 == 13 || var2 == 28 || var2 == 9 || var2 == 2 || var2 == 21 || var2 == 18 || var2 == 12 || var2 == 1001) {
                int var3 = class165.field3178[class203.field3864 - 1];
                int var4 = class217.field4062[class203.field3864 - 1];
                class174 var5 = class239.method1581(-64, var4);
                if (class68.method465(class80.method530(-881710560, var5), true) || class159.method1072(class80.method530(-881710560, var5), (byte) -52)) {
                    class248.field4537 = 0;
                    class43.field739 = false;
                    if (class135.field2516 != null) {
                        class200.method1373(65280, class135.field2516);
                    }
                    class135.field2516 = class239.method1581(-64, var4);
                    class18.field305 = var3;
                    class219.field4148 = class226.field4241;
                    class48.field894 = class172.field3341;
                    class200.method1373(65280, class135.field2516);
                    return;
                }
            }
        }
        if (var1 == 1 && (class203.field3861 == 1 && class203.field3864 > 2 || class234.method1556(class203.field3864 - 1, -1))) {
            var1 = 2;
        }
        if (var1 == 1 && class203.field3864 > 0) {
            class175.method1259(2, class203.field3864 - 1);
        }
        if (var1 == 2 && class203.field3864 > 0) {
            class136.method906(32768);
            return;
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIZ)V")
    public abstract void method373(int arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "(III)V")
    public static final void method374(int arg0, int arg1, int arg2) {
        class118.field2147 = true;
        class133.field2486 = arg0;
        class39.field698 = arg1;
        class35.field621 = arg2;
        class114.field2059 = -1;
        class90.field1715 = -1;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(BZI)Li;")
    public static final class88 method375(byte arg0, boolean arg1, int arg2) {
        field932++;
        if (arg0 < 83) {
            method374(-29, -8, 76);
        }
        return class219.method1483(arg1, arg2, 10, 0);
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(BLhj;)V")
    public static final void method376(byte arg0, class87 arg1) {
        field928++;
        if (class209.field3961) {
            class65.method453(arg1, (byte) 96);
            return;
        }
        if (class36.field625 == 1 && class226.field4241 >= 715 && class172.field3341 >= 453) {
            class131.field2462 = !class131.field2462;
            if (class131.field2462) {
                class1.method5(31818);
            } else {
                class53.method388(0, class99.field1816, (byte) -78, false, class86.field1552, 255);
            }
        }
        if (class229.field4286 == 5) {
            return;
        }
        class86.field1550++;
        if (class229.field4286 != 10) {
            return;
        }
        if (class143.field2659 != 2) {
            if (class36.field625 == 1) {
                short var2 = 463;
                byte var3 = 100;
                byte var4 = 5;
                byte var5 = 35;
                if (class226.field4241 >= var4 && var4 + var3 >= class226.field4241 && var2 <= class172.field3341 && class172.field3341 <= var2 + var5) {
                    class114.method781(32767);
                    return;
                }
            }
            if (class129.field2416 != null) {
                class114.method781(arg0 ^ 0x7FBD);
            }
        }
        if (arg0 != 66) {
            method378(-119);
        }
        int var6 = class36.field625;
        int var7 = class226.field4241;
        int var8 = class172.field3341;
        if (class65.field1182 == 0) {
            short var9 = 291;
            short var10 = 302;
            if (var6 == 1 && var10 - 75 <= var7 && var7 <= var10 + 75 && var8 >= var9 - 20 && var9 + 20 >= var8) {
                class142.field2622 = 0;
                class65.field1182 = 3;
            }
            boolean var11 = false;
            if (class115.field2073 != 0) {
                while (class43.method279((byte) 31)) {
                    if (class137.field2558 == 84) {
                        var11 = true;
                        break;
                    }
                }
            }
            short var12 = 462;
            if (var11 || var6 == 1 && var12 - 75 <= var7 && var7 <= var12 + 75 && var8 >= var9 - 20 && var8 <= var9 + 20) {
                class65.field1182 = 2;
                class209.field3982 = class70.field1277;
                class209.field3983 = class70.field1298;
                class142.field2622 = 0;
                class209.field3981 = class16.field242;
            }
        } else if (class65.field1182 == 2) {
            short var15 = 302;
            short var16 = 231;
            short var17 = 321;
            int var21 = var16 + 30;
            if (var6 == 1 && var8 >= var21 - 15 && var8 < var21) {
                class142.field2622 = 0;
            }
            var21 += 15;
            if (var6 == 1 && var8 >= var21 - 15 && var8 < var21) {
                class142.field2622 = 1;
            }
            var21 += 15;
            if (var6 == 1 && var15 - 75 <= var7 && var7 <= var15 + 75 && var17 - 20 <= var8 && var17 + 20 >= var8) {
                class209.field3969 = class209.field3969.method611(false).method614((byte) 83);
                if (class209.field3969.method604((byte) -53) == 0) {
                    class34.method227((byte) -58, class70.field1285, class70.field1295, class3.field38);
                    return;
                }
                if (class209.field3972.method604((byte) -53) == 0) {
                    class34.method227((byte) -37, class70.field1288, class70.field1290, class37.field662);
                    return;
                }
                class34.method227((byte) -43, class70.field1306, class70.field1275, class59.field1117);
                class131.method883(20, 65536);
                return;
            }
            short var18 = 462;
            if (var6 == 1 && var18 - 75 <= var7 && var18 + 75 >= var7 && var8 >= var17 - 20 && var8 <= var17 + 20) {
                class209.field3969 = class209.field3974;
                class65.field1182 = 0;
                class209.field3972 = class209.field3974;
            }
            while (true) {
                boolean var19;
                label229: do {
                    while (class43.method279((byte) 31)) {
                        var19 = false;
                        for (int var20 = 0; var20 < class74.field1339.method604((byte) -53); var20++) {
                            if (class219.field4150 == class74.field1339.method599(255, var20)) {
                                var19 = true;
                                break;
                            }
                        }
                        if (class142.field2622 != 0) {
                            continue label229;
                        }
                        if (class137.field2558 == 85 && class209.field3969.method604((byte) -53) > 0) {
                            class209.field3969 = class209.field3969.method623(0, (byte) -118, class209.field3969.method604((byte) -53) - 1);
                        }
                        if (class137.field2558 == 84 || class137.field2558 == 80) {
                            class142.field2622 = 1;
                        }
                        if (var19 && class209.field3969.method604((byte) -53) < 12) {
                            class209.field3969 = class209.field3969.method618(-95, class219.field4150);
                        }
                    }
                    return;
                } while (class142.field2622 != 1);
                if (class137.field2558 == 85 && class209.field3972.method604((byte) -53) > 0) {
                    class209.field3972 = class209.field3972.method623(0, (byte) -46, class209.field3972.method604((byte) -53) - 1);
                }
                if (class137.field2558 == 84 || class137.field2558 == 80) {
                    class142.field2622 = 0;
                }
                if (class115.field2073 != 0 && class137.field2558 == 84) {
                    class209.field3969 = class209.field3969.method611(false).method614((byte) 83);
                    if (class209.field3969.method604((byte) -53) == 0) {
                        class34.method227((byte) -41, class70.field1285, class70.field1295, class3.field38);
                        return;
                    }
                    if (class209.field3972.method604((byte) -53) == 0) {
                        class34.method227((byte) -70, class70.field1288, class70.field1290, class37.field662);
                        return;
                    }
                    class34.method227((byte) 16, class70.field1306, class70.field1275, class59.field1117);
                    class131.method883(20, 65536);
                    return;
                }
                if (var19 && class209.field3972.method604((byte) -53) < 20) {
                    class209.field3972 = class209.field3972.method618(-103, class219.field4150);
                }
            }
        } else if (class65.field1182 == 3) {
            short var13 = 321;
            short var14 = 382;
            if (var6 == 1 && var7 >= var14 - 75 && var7 <= var14 + 75 && var8 >= var13 - 20 && var8 <= var13 + 20) {
                class65.field1182 = 0;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIB)V")
    public abstract void method377(int arg0, int arg1, byte arg2);

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(I)V")
    public static void method378(int arg0) {
        if (arg0 != -8605) {
            field926 = -4;
        }
        field933 = null;
    }

    @OriginalMember(owner = "client!ee", name = "<init>", descriptor = "(III)V")
    public class50(int arg0, int arg1, int arg2) {
        this.field927 = arg1;
        this.field925 = arg0;
        this.field931 = arg2;
    }
}
