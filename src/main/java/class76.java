import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class76 extends class129 {

    @OriginalMember(owner = "client!hf", name = "y", descriptor = "I")
    public int field1495;

    @OriginalMember(owner = "client!hf", name = "s", descriptor = "[Lmb;")
    public static class121[] field1489 = new class121[2048];

    @OriginalMember(owner = "client!hf", name = "w", descriptor = "Lrd;")
    public static class173 field1493 = class133.method843(")1j", 120);

    @OriginalMember(owner = "client!hf", name = "A", descriptor = "Laf;")
    public static class7 field1497 = new class7(5);

    @OriginalMember(owner = "client!hf", name = "r", descriptor = "I")
    public static int field1488;

    @OriginalMember(owner = "client!hf", name = "t", descriptor = "I")
    public static int field1490;

    @OriginalMember(owner = "client!hf", name = "u", descriptor = "I")
    public static int field1491;

    @OriginalMember(owner = "client!hf", name = "v", descriptor = "I")
    public static int field1492;

    @OriginalMember(owner = "client!hf", name = "x", descriptor = "I")
    public static int field1494;

    @OriginalMember(owner = "client!hf", name = "z", descriptor = "I")
    public static int field1496;

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "(II)V")
    public static final void method465(int arg0, int arg1) {
        field1488++;
        if (!class212.method1389(-128, arg1)) {
            return;
        }
        if (arg0 != -17005) {
            field1492 = -5;
        }
        class165[] var2 = class63.field1232[arg1];
        for (int var3 = 0; var3 < var2.length; var3++) {
            class165 var4 = var2[var3];
            if (var4 != null) {
                var4.field3084 = 0;
                var4.field3142 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "(I)V")
    public static void method466(int arg0) {
        field1497 = null;
        field1493 = null;
        if (arg0 != 30335) {
            field1493 = null;
        }
        field1489 = null;
    }

    @OriginalMember(owner = "client!hf", name = "d", descriptor = "(I)V")
    public static final void method467(int arg0) {
        class187.field3650 = arg0;
        for (int var1 = 0; var1 < class71.field1384; var1++) {
            for (int var2 = 0; var2 < class55.field1093; var2++) {
                if (class208.field4055[arg0][var1][var2] == null) {
                    class208.field4055[arg0][var1][var2] = new class105(arg0, var1, var2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(III)V")
    public static final void method468(int arg0, int arg1, int arg2) {
        class105 var3 = class208.field4055[arg0][arg1][arg2];
        if (var3 != null) {
            var3.field1959 = null;
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(Z)V")
    public static final void method469(boolean arg0) {
        if (class11.field181 > 0) {
            for (int var1 = 0; var1 < 256; var1++) {
                if (class11.field181 > 768) {
                    class34.field751[var1] = class216.method1416(1024 - class11.field181, class163.field3013[var1], !arg0, class170.field3303[var1]);
                } else if (class11.field181 > 256) {
                    class34.field751[var1] = class170.field3303[var1];
                } else {
                    class34.field751[var1] = class216.method1416(256 - class11.field181, class170.field3303[var1], true, class163.field3013[var1]);
                }
            }
        } else if (class208.field4045 <= 0) {
            for (int var2 = 0; var2 < 256; var2++) {
                class34.field751[var2] = class163.field3013[var2];
            }
        } else {
            for (int var3 = 0; var3 < 256; var3++) {
                if (class208.field4045 > 768) {
                    class34.field751[var3] = class216.method1416(1024 - class208.field4045, class163.field3013[var3], true, class145.field2722[var3]);
                } else if (class208.field4045 <= 256) {
                    class34.field751[var3] = class216.method1416(256 - class208.field4045, class145.field2722[var3], true, class163.field3013[var3]);
                } else {
                    class34.field751[var3] = class145.field2722[var3];
                }
            }
        }
        short var4 = 256;
        field1496++;
        int var5 = 0;
        int var6 = 0;
        int var7 = class166.field3208.field3547 * 9;
        int var8 = 1;
        if (arg0) {
            field1497 = null;
        }
        while (var4 - 1 > var8) {
            int var21 = (var4 - var8) * class12.field196[var8] / var4 + 22;
            if (var21 < 0) {
                var21 = 0;
            }
            var5 += var21;
            for (int var22 = var21; var22 < 128; var22++) {
                int var24 = class66.field1290[var5++];
                int var25 = class166.field3208.field3546[var7++];
                if (var24 == 0) {
                    class214.field4156.field3546[var6++] = var25;
                } else {
                    int var27 = 256 - var24;
                    int var28 = class34.field751[var24];
                    class214.field4156.field3546[var6++] = class209.method1383(var27 * class209.method1383(var25, 65280) + class209.method1383(var28, 65280) * var24, 16711680) + class209.method1383(class209.method1383(var28, 16711935) * var24 + var27 * class209.method1383(16711935, var25), -16711936) >> 8;
                }
            }
            for (int var23 = 0; var23 < var21; var23++) {
                class214.field4156.field3546[var6++] = class166.field3208.field3546[var7++];
            }
            var7 += class166.field3208.field3547 - 128;
            var8++;
        }
        int var9 = 0;
        int var10 = 0;
        class214.field4156.method1226(0, 9);
        int var11 = class166.field3208.field3547 * 9 + 128;
        for (int var12 = 1; var12 < var4 - 1; var12++) {
            int var13 = (var4 - var12) * class12.field196[var12] / var4 + 22;
            if (var13 < 0) {
                var13 = 0;
            }
            for (int var14 = 0; var14 < var13; var14++) {
                int var10001 = var10++;
                var11--;
                class191.field3736.field3546[var10001] = class166.field3208.field3546[var11];
            }
            for (int var15 = var13; var15 < 128; var15++) {
                int var16 = class66.field1290[var9++];
                var11--;
                int var17 = class166.field3208.field3546[var11];
                if (var16 == 0) {
                    class191.field3736.field3546[var10++] = var17;
                } else {
                    int var18 = 256 - var16;
                    int var20 = class34.field751[var16];
                    class191.field3736.field3546[var10++] = class209.method1383(var16 * class209.method1383(var20, 65280) + class209.method1383(var17, 65280) * var18, 16711680) + class209.method1383(-16711936, var18 * class209.method1383(var17, 16711935) + var16 * class209.method1383(var20, 16711935)) >> 8;
                }
            }
            var11 += class166.field3208.field3547 + 128;
            var9 += var13;
        }
        class191.field3736.method1226(637, 9);
    }

    @OriginalMember(owner = "client!hf", name = "e", descriptor = "(I)V")
    public static final void method470(int arg0) {
        if (arg0 != -9691) {
            field1493 = null;
        }
        if (class99.field1809 != null) {
            class99.field1809.method1095((byte) 126);
        }
        field1494++;
    }

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "(II)V")
    public static final void method471(int arg0, int arg1) {
        int var2 = -8 / ((32 - arg0) / 55);
        field1490++;
        int[] var3 = class30.field620.field3546;
        int var4 = var3.length;
        for (int var5 = 0; var5 < var4; var5++) {
            var3[var5] = 1;
        }
        for (int var6 = 1; var6 < 103; var6++) {
            int var21 = (103 - var6) * 4 * 512 + 24628;
            for (int var22 = 1; var22 < 103; var22++) {
                if ((class21.field462[arg1][var22][var6] & 0x18) == 0) {
                    class190.method1268(var3, var21, 512, arg1, var22, var6);
                }
                if (arg1 < 3 && (class21.field462[arg1 + 1][var22][var6] & 0x8) != 0) {
                    class190.method1268(var3, var21, 512, arg1 + 1, var22, var6);
                }
                var21 += 4;
            }
        }
        class30.field620.method1219();
        int var7 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
        int var8 = (int) (Math.random() * 20.0D) + ((int) (Math.random() * 20.0D) + 228 << 8) + ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + 238 - 10;
        for (int var9 = 1; var9 < 103; var9++) {
            for (int var20 = 1; var20 < 103; var20++) {
                if ((class21.field462[arg1][var20][var9] & 0x18) == 0) {
                    class31.method256((byte) -50, var7, arg1, var8, var20, var9);
                }
                if (arg1 < 3 && (class21.field462[arg1 + 1][var20][var9] & 0x8) != 0) {
                    class31.method256((byte) -50, var7, arg1 + 1, var8, var20, var9);
                }
            }
        }
        class169.field3263 = 0;
        for (int var10 = 0; var10 < 104; var10++) {
            for (int var11 = 0; var11 < 104; var11++) {
                long var12 = class34.method268(class172.field3347, var10, var11);
                if (var12 != 0L) {
                    int var14 = class182.method1237(true, Integer.MAX_VALUE & (int) (var12 >>> 32)).field56;
                    if (var14 >= 0) {
                        int var15 = var11;
                        int var16 = var10;
                        if (var14 != 22 && var14 != 29 && var14 != 34 && var14 != 36 && var14 != 46 && var14 != 47 && var14 != 48) {
                            int[][] var17 = class35.field760[class172.field3347].field3474;
                            for (int var18 = 0; var18 < 10; var18++) {
                                int var19 = (int) (Math.random() * 4.0D);
                                if (var19 == 0 && var16 > 0 && var16 > var10 - 3 && (var17[var16 - 1][var15] & 0x12C0108) == 0) {
                                    var16--;
                                }
                                if (var19 == 1 && var16 < 103 && var16 < var10 + 3 && (var17[var16 + 1][var15] & 0x12C0180) == 0) {
                                    var16++;
                                }
                                if (var19 == 2 && var15 > 0 && var11 - 3 < var15 && (var17[var16][var15 - 1] & 0x12C0102) == 0) {
                                    var15--;
                                }
                                if (var19 == 3 && var15 < 103 && var15 < var11 + 3 && (var17[var16][var15 + 1] & 0x12C0120) == 0) {
                                    var15++;
                                }
                            }
                        }
                        class219.field4216[class169.field3263] = class46.field971[var14];
                        class94.field1755[class169.field3263] = var16;
                        class109.field2030[class169.field3263] = var15;
                        class169.field3263++;
                    }
                }
            }
        }
        class67.field1307.method552(-2001);
    }

    @OriginalMember(owner = "client!hf", name = "<init>", descriptor = "()V")
    public class76() {
    }

    @OriginalMember(owner = "client!hf", name = "<init>", descriptor = "(I)V")
    public class76(int arg0) {
        this.field1495 = arg0;
    }
}
