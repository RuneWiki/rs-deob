import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public class class130 extends class171 {

    @OriginalMember(owner = "client!d", name = "K", descriptor = "Lha;")
    public static class46 field2383 = class271.method1828("Okay", -46);

    @OriginalMember(owner = "client!d", name = "O", descriptor = "Z")
    public static boolean field2386 = false;

    @OriginalMember(owner = "client!d", name = "C", descriptor = "Ldl;")
    public static class43 field2375 = new class43(5000);

    @OriginalMember(owner = "client!d", name = "B", descriptor = "I")
    public static int field2374;

    @OriginalMember(owner = "client!d", name = "D", descriptor = "I")
    public static int field2376;

    @OriginalMember(owner = "client!d", name = "E", descriptor = "I")
    public static int field2377;

    @OriginalMember(owner = "client!d", name = "F", descriptor = "I")
    public static int field2378;

    @OriginalMember(owner = "client!d", name = "G", descriptor = "I")
    public static int field2379;

    @OriginalMember(owner = "client!d", name = "I", descriptor = "I")
    public static int field2381;

    @OriginalMember(owner = "client!d", name = "R", descriptor = "I")
    public static int field2389;

    @OriginalMember(owner = "client!d", name = "L", descriptor = "Lpi;")
    public static class181 field2384;

    @OriginalMember(owner = "client!d", name = "S", descriptor = "Lpi;")
    public static class181 field2390;

    @OriginalMember(owner = "client!d", name = "Q", descriptor = "Lha;")
    public class46 field2388;

    @OriginalMember(owner = "client!d", name = "H", descriptor = "[I")
    public int[] field2380;

    @OriginalMember(owner = "client!d", name = "J", descriptor = "[I")
    public int[] field2382;

    @OriginalMember(owner = "client!d", name = "N", descriptor = "[I")
    public int[] field2385;

    @OriginalMember(owner = "client!d", name = "P", descriptor = "[I")
    public int[] field2387;

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(Ldb;IIIIIIZ)V")
    public static final void method1006(class59 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        int var8 = arg0.field995.length;
        for (int var9 = 0; var9 < var8; var9++) {
            int var22 = arg0.field995[var9] - class93.field1751;
            int var23 = arg0.field993[var9] - class200.field3577;
            int var24 = arg0.field975[var9] - class118.field2224;
            int var25 = arg3 * var24 + arg4 * var22 >> 16;
            int var26 = arg4 * var24 - arg3 * var22 >> 16;
            int var28 = arg2 * var23 - arg1 * var26 >> 16;
            int var29 = arg1 * var23 + arg2 * var26 >> 16;
            if (var29 < 50) {
                return;
            }
            if (arg0.field986 != null) {
                class59.field976[var9] = var25;
                class59.field985[var9] = var28;
                class59.field994[var9] = var29;
            }
            class59.field990[var9] = (var25 << 9) / var29 + class62.field1043;
            class59.field978[var9] = (var28 << 9) / var29 + class62.field1050;
        }
        class62.field1036 = 0;
        int var10 = arg0.field988.length;
        for (int var11 = 0; var11 < var10; var11++) {
            int var12 = arg0.field988[var11];
            int var13 = arg0.field979[var11];
            int var14 = arg0.field974[var11];
            int var15 = class59.field990[var12];
            int var16 = class59.field990[var13];
            int var17 = class59.field990[var14];
            int var18 = class59.field978[var12];
            int var19 = class59.field978[var13];
            int var20 = class59.field978[var14];
            if ((var15 - var16) * (var20 - var19) - (var17 - var16) * (var18 - var19) > 0) {
                if (class240.field4278 && class244.method1673(class62.field1043 + class140.field2508, class62.field1050 + class37.field662, var18, var19, var20, var15, var16, var17)) {
                    class119.field2239 = arg5;
                    class12.field199 = arg6;
                }
                if (!arg7) {
                    class62.field1053 = false;
                    if (var15 < 0 || var16 < 0 || var17 < 0 || var15 > class62.field1039 || var16 > class62.field1039 || var17 > class62.field1039) {
                        class62.field1053 = true;
                    }
                    if (arg0.field986 == null || arg0.field986[var11] == -1) {
                        if (arg0.field992[var11] != 12345678) {
                            class62.method435(var18, var19, var20, var15, var16, var17, arg0.field992[var11], arg0.field977[var11], arg0.field989[var11]);
                        }
                    } else if (!class111.field2103) {
                        int var21 = class62.field1040.method728(arg0.field986[var11], (byte) -104);
                        class62.method435(var18, var19, var20, var15, var16, var17, class10.method52(var21, arg0.field992[var11]), class10.method52(var21, arg0.field977[var11]), class10.method52(var21, arg0.field989[var11]));
                    } else if (arg0.field982) {
                        class62.method425(var18, var19, var20, var15, var16, var17, arg0.field992[var11], arg0.field977[var11], arg0.field989[var11], class59.field976[0], class59.field976[1], class59.field976[3], class59.field985[0], class59.field985[1], class59.field985[3], class59.field994[0], class59.field994[1], class59.field994[3], arg0.field986[var11]);
                    } else {
                        class62.method425(var18, var19, var20, var15, var16, var17, arg0.field992[var11], arg0.field977[var11], arg0.field989[var11], class59.field976[var12], class59.field976[var13], class59.field976[var14], class59.field985[var12], class59.field985[var13], class59.field985[var14], class59.field994[var12], class59.field994[var13], class59.field994[var14], arg0.field986[var11]);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!d", name = "b", descriptor = "(II)I")
    public final int method1007(int arg0, int arg1) {
        field2376++;
        if (this.field2385 == null) {
            return -1;
        }
        if (arg1 != 11484) {
            this.field2388 = null;
        }
        for (int var3 = 0; var3 < this.field2385.length; var3++) {
            if (this.field2380[var3] == arg0) {
                return this.field2385[var3];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(Lwe;BI)V")
    private final void method1008(class75 arg0, byte arg1, int arg2) {
        field2381++;
        if (arg2 == 1) {
            this.field2388 = arg0.method577(0);
        } else if (arg2 == 2) {
            int var7 = arg0.method558(1);
            this.field2380 = new int[var7];
            this.field2385 = new int[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field2385[var8] = arg0.method545((byte) 61);
                int var9 = arg0.method558(1);
                if (var9 == 0) {
                    this.field2380[var8] = -1;
                } else {
                    this.field2380[var8] = var9;
                }
            }
        } else if (arg2 == 3) {
            int var4 = arg0.method558(1);
            this.field2382 = new int[var4];
            this.field2387 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field2387[var5] = arg0.method545((byte) 83);
                int var6 = arg0.method558(1);
                if (var6 == 0) {
                    this.field2382[var5] = -1;
                } else {
                    this.field2382[var5] = var6;
                }
            }
        }
        int var10 = -16 / ((arg1 + 20) / 48);
    }

    @OriginalMember(owner = "client!d", name = "b", descriptor = "(BI)I")
    public final int method1009(byte arg0, int arg1) {
        field2379++;
        if (this.field2387 == null) {
            return -1;
        }
        int var3 = 0;
        if (arg0 >= -127) {
            return -4;
        }
        while (var3 < this.field2387.length) {
            if (this.field2382[var3] == arg1) {
                return this.field2387[var3];
            }
            var3++;
        }
        return -1;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(ILwe;)V")
    public final void method1010(int arg0, class75 arg1) {
        while (true) {
            int var3 = arg1.method558(1);
            if (var3 == 0) {
                if (arg0 >= -117) {
                    this.field2387 = null;
                }
                field2389++;
                return;
            }
            this.method1008(arg1, (byte) 45, var3);
        }
    }

    @OriginalMember(owner = "client!d", name = "c", descriptor = "(BI)I")
    public static final int method1011(byte arg0, int arg1) {
        field2374++;
        if (arg0 != 43) {
            method1011((byte) -38, 102);
        }
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!d", name = "e", descriptor = "(I)V")
    public static void method1012(int arg0) {
        field2390 = null;
        field2383 = null;
        field2384 = null;
        if (arg0 == 30942) {
            field2375 = null;
        }
    }

    @OriginalMember(owner = "client!d", name = "f", descriptor = "(I)V")
    public final void method1013(int arg0) {
        if (this.field2387 != null) {
            for (int var2 = 0; var2 < this.field2387.length; var2++) {
                this.field2387[var2] = class235.method1595(this.field2387[var2], 32768);
            }
        }
        field2377++;
        if (this.field2385 != null) {
            for (int var3 = 0; var3 < this.field2385.length; var3++) {
                this.field2385[var3] = class235.method1595(this.field2385[var3], 32768);
            }
        }
        int var4 = 48 / ((arg0 - 8) / 49);
    }
}
