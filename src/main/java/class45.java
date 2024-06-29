import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public abstract class class45 {

    @OriginalMember(owner = "client!hc", name = "h", descriptor = "La;")
    public static class1 field1182 = class113.method934(-11538, "Angreifen");

    @OriginalMember(owner = "client!hc", name = "g", descriptor = "I")
    public static int field1181 = 0;

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "[Lba;")
    public static class8[] field1178 = new class8[2048];

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "La;")
    private static class1 field1177 = class113.method934(-11538, "M");

    @OriginalMember(owner = "client!hc", name = "l", descriptor = "La;")
    public static class1 field1186 = field1177;

    @OriginalMember(owner = "client!hc", name = "k", descriptor = "Z")
    public static boolean field1185 = false;

    @OriginalMember(owner = "client!hc", name = "n", descriptor = "Z")
    public static boolean field1188 = false;

    @OriginalMember(owner = "client!hc", name = "q", descriptor = "I")
    public static int field1191 = 0;

    @OriginalMember(owner = "client!hc", name = "p", descriptor = "La;")
    private static class1 field1190 = class113.method934(-11538, "Your account is already logged in)3");

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "La;")
    public static class1 field1176 = field1190;

    @OriginalMember(owner = "client!hc", name = "r", descriptor = "[Z")
    public static boolean[] field1192 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, true, false, false };

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "I")
    public static int field1175;

    @OriginalMember(owner = "client!hc", name = "f", descriptor = "I")
    public static int field1180;

    @OriginalMember(owner = "client!hc", name = "i", descriptor = "I")
    public static int field1183;

    @OriginalMember(owner = "client!hc", name = "j", descriptor = "I")
    public static int field1184;

    @OriginalMember(owner = "client!hc", name = "m", descriptor = "I")
    public static int field1187;

    @OriginalMember(owner = "client!hc", name = "o", descriptor = "I")
    public static int field1189;

    @OriginalMember(owner = "client!hc", name = "e", descriptor = "[Le;")
    public static class25[] field1179;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(I)V", line = 5)
    public static void method473(int arg0) {
        field1190 = null;
        field1176 = null;
        field1182 = null;
        field1179 = null;
        if (arg0 > 116) {
            field1178 = null;
            field1186 = null;
            field1177 = null;
            field1192 = null;
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(BI)V", line = 23)
    public static final void method474(byte arg0, int arg1) {
        field1187++;
        int[] var2 = class104.field2629.field1483;
        int var3 = var2.length;
        for (int var4 = 0; var4 < var3; var4++) {
            var2[var4] = 0;
        }
        for (int var5 = 1; var5 < 103; var5++) {
            int var20 = (52736 - var5 * 512) * 4 + 24628;
            for (int var21 = 1; var21 < 103; var21++) {
                if ((class34.field899[arg1][var21][var5] & 0x18) == 0) {
                    class130.field3186.method53(var2, var20, 512, arg1, var21, var5);
                }
                if (arg1 < 3 && (class34.field899[arg1 + 1][var21][var5] & 0x8) != 0) {
                    class130.field3186.method53(var2, var20, 512, arg1 + 1, var21, var5);
                }
                var20 += 4;
            }
        }
        class104.field2629.method556();
        int var6 = ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (((int) (Math.random() * 20.0D)) + 228 << 16) + (int) (Math.random() * 20.0D) + 238 - 10;
        int var7 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
        for (int var8 = 1; var8 < 103; var8++) {
            for (int var19 = 1; var19 < 103; var19++) {
                if ((class34.field899[arg1][var19][var8] & 0x18) == 0) {
                    class80.method727(1850, arg1, var19, var6, var7, var8);
                }
                if (arg1 < 3 && (class34.field899[arg1 + 1][var19][var8] & 0x8) != 0) {
                    class80.method727(1850, arg1 + 1, var19, var6, var7, var8);
                }
            }
        }
        class54.field1436 = 0;
        if (arg0 < 24) {
            field1178 = null;
        }
        for (int var9 = 0; var9 < 104; var9++) {
            for (int var10 = 0; var10 < 104; var10++) {
                int var11 = class130.field3186.method50(class2.field76, var9, var10);
                if (var11 != 0) {
                    int var12 = var11 >> 14 & 0x7FFF;
                    int var13 = class32.method390(var12, (byte) 127).field1296;
                    if (var13 >= 0) {
                        int var14 = var10;
                        int var15 = var9;
                        if (var13 != 22 && var13 != 29 && var13 != 34 && var13 != 36 && var13 != 46 && var13 != 47 && var13 != 48) {
                            int[][] var16 = class102.field2572[class2.field76].field202;
                            for (int var17 = 0; var17 < 10; var17++) {
                                int var18 = (int) (Math.random() * 4.0D);
                                if (var18 == 0 && var15 > 0 && var15 > var9 - 3 && (var16[var15 - 1][var14] & 0x1280108) == 0) {
                                    var15--;
                                }
                                if (var18 == 1 && var15 < 103 && var15 < var9 + 3 && (var16[var15 + 1][var14] & 0x1280180) == 0) {
                                    var15++;
                                }
                                if (var18 == 2 && var14 > 0 && var14 > var10 - 3 && (var16[var15][var14 - 1] & 0x1280102) == 0) {
                                    var14--;
                                }
                                if (var18 == 3 && var14 < 103 && var10 + 3 > var14 && (var16[var15][var14 + 1] & 0x1280120) == 0) {
                                    var14++;
                                }
                            }
                        }
                        class122.field3049[class54.field1436] = class14.field471[var13];
                        class80.field2026[class54.field1436] = var15;
                        class92.field2306[class54.field1436] = var14;
                        class54.field1436++;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(B)V", line = 207)
    public static final void method475(byte arg0) {
        class62.field1561.method1057((byte) 90);
        class89.field2190.method330(0, 0);
        field1183++;
        class9.field321 = class27.method363(class9.field321);
        if (arg0 <= 2) {
            method475((byte) 88);
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lba;II)La;", line = 232)
    public static final class1 method476(class8 arg0, int arg1, int arg2) {
        field1180++;
        try {
            if (arg1 != -1) {
                field1192 = null;
            }
            class1 var3 = new class1();
            var3.field26 = arg0.method179((byte) -81);
            if (arg2 < var3.field26) {
                var3.field26 = arg2;
            }
            var3.field38 = new byte[var3.field26];
            arg0.field268 += class95.field2360.method1036(arg0.field285, var3.field26, 0, var3.field38, arg0.field268, -1);
            return var3;
        } catch (Exception var4) {
            return class72.field1759;
        }
    }

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "(I)V", line = 271)
    public static final void method477(int arg0) {
        field1184++;
        int var1 = -39 % ((arg0 - 33) / 58);
        class1.method7(2037, false, null, 0);
    }

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(II)V", line = 305)
    public static final void method478(int arg0, int arg1) {
        class47.field1239 = class82.field2066;
        class132.method1043((byte) 127);
        field1175++;
        int var2 = class130.method1026((byte) -70, arg1).field2407;
        if (var2 == 0) {
            return;
        }
        int var3 = class113.field2806[arg1];
        if (var2 == 1) {
            if (var3 == 1) {
                class27.method366(0.9D);
                ((class75) class27.field772).method699(108, 0.9D);
            }
            if (var3 == 2) {
                class27.method366(0.8D);
                ((class75) class27.field772).method699(97, 0.8D);
            }
            if (var3 == 3) {
                class27.method366(0.7D);
                ((class75) class27.field772).method699(99, 0.7D);
            }
            if (var3 == 4) {
                class27.method366(0.6D);
                ((class75) class27.field772).method699(arg0 ^ 0xFFFFFF95, 0.6D);
            }
            class54.method541((byte) -96);
            class97.field2405 = true;
        }
        if (var2 == 3) {
            short var4 = 0;
            if (var3 == 0) {
                var4 = 255;
            }
            if (var3 == 1) {
                var4 = 192;
            }
            if (var3 == 2) {
                var4 = 128;
            }
            if (var3 == 3) {
                var4 = 64;
            }
            if (var3 == 4) {
                var4 = 0;
            }
            if (class62.field1557 != var4) {
                if (class62.field1557 == 0 && class122.field3040 != -1) {
                    class72.method684(false, 0, class122.field3040, var4, 0, class108.field2705, arg0);
                    class75.field1863 = 0;
                } else if (var4 == 0) {
                    class72.method672(false);
                    class75.field1863 = 0;
                } else {
                    class82.method741(var4, (byte) 81);
                }
                class62.field1557 = var4;
            }
        }
        if (var2 == 9) {
            class86.field2166 = var3;
        }
        if (var2 == 10) {
            if (var3 == 0) {
                class62.field1562 = 127;
            }
            if (var3 == 1) {
                class62.field1562 = 96;
            }
            if (var3 == 2) {
                class62.field1562 = 64;
            }
            if (var3 == 3) {
                class62.field1562 = 32;
            }
            if (var3 == 4) {
                class62.field1562 = 0;
            }
        }
        if (var2 == 8) {
            class105.field2640 = true;
            class5.field217 = var3;
        }
        if (var2 == 4) {
            if (var3 == 0) {
                class9.field323 = 127;
            }
            if (var3 == 1) {
                class9.field323 = 96;
            }
            if (var3 == 2) {
                class9.field323 = 64;
            }
            if (var3 == 3) {
                class9.field323 = 32;
            }
            if (var3 == 4) {
                class9.field323 = 0;
            }
        }
        if (var2 == 6) {
            class16.field528 = var3;
        }
        if (arg0 != -1) {
            method478(74, -85);
        }
        if (var2 == 5) {
            class134.field3300 = var3;
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "([BZII)V")
    public abstract void method308(byte[] arg0, boolean arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(II)V")
    public abstract void method305(int arg0, int arg1);

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(I)V")
    public abstract void method309(int arg0);

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(B)V")
    public abstract void method306(byte arg0);

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(BII)V")
    public abstract void method303(byte arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "(B)V")
    public abstract void method304(byte arg0);
}
