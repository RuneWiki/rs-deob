import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class172 {

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "Lma;")
    public static class5 field2644 = class12.method119("blinken1:", (byte) 86);

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "Lma;")
    public static class5 field2642 = class12.method119(":assist:", (byte) 65);

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "[[[I")
    public static int[][][] field2643 = new int[4][13][13];

    @OriginalMember(owner = "client!jc", name = "j", descriptor = "Lma;")
    public static class5 field2651 = class12.method119("unzap", (byte) 80);

    @OriginalMember(owner = "client!jc", name = "l", descriptor = "I")
    public static int field2653 = -1;

    @OriginalMember(owner = "client!jc", name = "d", descriptor = "I")
    public static int field2645;

    @OriginalMember(owner = "client!jc", name = "e", descriptor = "I")
    public static int field2646;

    @OriginalMember(owner = "client!jc", name = "g", descriptor = "I")
    public static int field2648;

    @OriginalMember(owner = "client!jc", name = "h", descriptor = "I")
    public static int field2649;

    @OriginalMember(owner = "client!jc", name = "i", descriptor = "I")
    public static int field2650;

    @OriginalMember(owner = "client!jc", name = "f", descriptor = "Lje;")
    public static class158 field2647;

    @OriginalMember(owner = "client!jc", name = "k", descriptor = "Lje;")
    public static class158 field2652;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(I)V", line = 10)
    public static void method1138(int arg0) {
        if (arg0 > -88) {
            return;
        }
        field2643 = (int[][][]) null;
        field2644 = null;
        field2652 = null;
        field2642 = null;
        field2651 = null;
        field2647 = null;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIII)I", line = 43)
    public static final int method1139(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg3 & 0x3;
        if (arg2 != -10130) {
            method1140(3, -96);
        }
        field2649++;
        if (var4 == 0) {
            return arg1;
        } else if (var4 == 1) {
            return arg0;
        } else if (var4 == 2) {
            return 1023 - arg1;
        } else {
            return 1023 - arg0;
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(II)Leb;", line = 66)
    public static final class253 method1140(int arg0, int arg1) {
        field2648++;
        int var2 = arg0 >> 16;
        int var3 = 88 / ((-arg1 - 59) / 50);
        int var4 = arg0 & 0xFFFF;
        if (class256.field4376[var2] == null || class256.field4376[var2][var4] == null) {
            boolean var5 = class186.method1226(var2, 0);
            if (!var5) {
                return null;
            }
        }
        return class256.field4376[var2][var4];
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IB)V", line = 92)
    public static final void method1141(int arg0, byte arg1) {
        class222 var2 = new class222(512, 512);
        if (arg1 != 3) {
            method1142((byte) -82);
        }
        field2650++;
        int[] var3 = var2.field3652;
        int var4 = var3.length;
        for (int var5 = 0; var5 < var4; var5++) {
            var3[var5] = 1;
        }
        for (int var6 = 1; var6 < 103; var6++) {
            int var7 = (52736 - (var6 * 512)) * 4 + 24628;
            for (int var8 = 1; var8 < 103; var8++) {
                if ((class18.field321[arg0][var8][var6] & 0x18) == 0) {
                    class200.method1311(var3, var7, 512, arg0, var8, var6);
                }
                if (arg0 < 3 && (class18.field321[arg0 + 1][var8][var6] & 0x8) != 0) {
                    class200.method1311(var3, var7, 512, arg0 + 1, var8, var6);
                }
                var7 += 4;
            }
        }
        var2.method1572();
        int var9 = 238 - (10 - ((int) (Math.random() * 20.0D))) << 16;
        int var10 = ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + (int) (Math.random() * 20.0D) + 238 - 10;
        for (int var11 = 1; var11 < 103; var11++) {
            for (int var12 = 1; var12 < 103; var12++) {
                if ((class18.field321[arg0][var12][var11] & 0x18) == 0) {
                    class210.method1385(var11, var12, 2, var9, var10, arg0);
                }
                if (arg0 < 3 && (class18.field321[arg0 + 1][var12][var11] & 0x8) != 0) {
                    class210.method1385(var11, var12, 2, var9, var10, arg0 + 1);
                }
            }
        }
        class105.field1556 = 0;
        for (int var13 = 0; var13 < 104; var13++) {
            for (int var14 = 0; var14 < 104; var14++) {
                long var15 = class157.method1008(class276.field4701, var13, var14);
                if (var15 != 0L) {
                    class185 var17 = class77.method536(Integer.MAX_VALUE & (int) (var15 >>> 32), 115);
                    int var18 = var17.field2903;
                    if (var17.field2843 != null) {
                        for (int var19 = 0; var19 < var17.field2843.length; var19++) {
                            if (var17.field2843[var19] != -1) {
                                class185 var20 = class77.method536(var17.field2843[var19], 122);
                                if (var20.field2903 >= 0) {
                                    var18 = var20.field2903;
                                    break;
                                }
                            }
                        }
                    }
                    if (var18 >= 0) {
                        int var21 = var13;
                        int var22 = var14;
                        if (var18 != 22 && var18 != 29 && var18 != 34 && var18 != 36 && var18 != 46 && var18 != 47 && var18 != 48) {
                            int[][] var23 = class242.field4031[class276.field4701].field793;
                            for (int var24 = 0; var24 < 10; var24++) {
                                int var25 = (int) (Math.random() * 4.0D);
                                if (var25 == 0 && var21 > 0 && var21 > var13 - 3 && (var23[var21 - 1][var22] & 0x12C0108) == 0) {
                                    var21--;
                                }
                                if (var25 == 1 && var21 < 103 && (var13 + 3) > var21 && (var23[var21 + 1][var22] & 0x12C0180) == 0) {
                                    var21++;
                                }
                                if (var25 == 2 && var22 > 0 && (var14 - 3) < var22 && (var23[var21][var22 - 1] & 0x12C0102) == 0) {
                                    var22--;
                                }
                                if (var25 == 3 && var22 < 103 && var22 < var14 + 3 && (var23[var21][var22 + 1] & 0x12C0120) == 0) {
                                    var22++;
                                }
                            }
                        }
                        class244.field4053[class105.field1556] = var17.field2893;
                        class204.field3266[class105.field1556] = var21;
                        class218.field3515[class105.field1556] = var22;
                        class105.field1556++;
                    }
                }
            }
        }
        for (int var26 = 0; var26 < var4; var26++) {
            if (var3[var26] == 0) {
                var3[var26] = 1;
            }
        }
        class260.field4438 = new class109(var2);
        class191.field2981 = null;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(B)[Lfi;", line = 308)
    public static final class222[] method1142(byte arg0) {
        field2646++;
        class222[] var1 = new class222[class79.field1221];
        if (arg0 != 32) {
            method1139(95, -58, 96, 112);
        }
        for (int var2 = 0; var2 < class79.field1221; var2++) {
            int var3 = class179.field2718[var2] * class112.field1665[var2];
            byte[] var4 = class37.field590[var2];
            int[] var5 = new int[var3];
            for (int var6 = 0; var6 < var3; var6++) {
                var5[var6] = class268.field4610[class204.method1354(var4[var6], 255)];
            }
            var1[var2] = new class222(class282.field4786, class281.field4765, class88.field1315[var2], class287.field4836[var2], class112.field1665[var2], class179.field2718[var2], var5);
        }
        class207.method1365(9);
        return var1;
    }
}
