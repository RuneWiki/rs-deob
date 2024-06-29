import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public class class255 extends class152 {

    @OriginalMember(owner = "client!th", name = "V", descriptor = "I")
    private int field4288 = 4096;

    @OriginalMember(owner = "client!th", name = "ab", descriptor = "I")
    private int field4293 = 4096;

    @OriginalMember(owner = "client!th", name = "eb", descriptor = "I")
    private int field4297 = 4096;

    @OriginalMember(owner = "client!th", name = "X", descriptor = "I")
    public static int field4290 = 0;

    @OriginalMember(owner = "client!th", name = "T", descriptor = "S")
    public static short field4286 = 320;

    @OriginalMember(owner = "client!th", name = "W", descriptor = "[S")
    public static short[] field4289 = new short[] { 960, 957, -21568, -21571, 22464 };

    @OriginalMember(owner = "client!th", name = "Y", descriptor = "I")
    public static int field4291 = 0;

    @OriginalMember(owner = "client!th", name = "Z", descriptor = "I")
    public static int field4292 = 0;

    @OriginalMember(owner = "client!th", name = "U", descriptor = "Lce;")
    public static class126 field4287 = class206.method1445(-7923, "blinken2:");

    @OriginalMember(owner = "client!th", name = "db", descriptor = "S")
    public static short field4296 = 32767;

    @OriginalMember(owner = "client!th", name = "fb", descriptor = "J")
    public static long field4298 = 0L;

    @OriginalMember(owner = "client!th", name = "R", descriptor = "I")
    public static int field4284;

    @OriginalMember(owner = "client!th", name = "S", descriptor = "I")
    public static int field4285;

    @OriginalMember(owner = "client!th", name = "bb", descriptor = "I")
    public static int field4294;

    @OriginalMember(owner = "client!th", name = "cb", descriptor = "I")
    public static int field4295;

    @OriginalMember(owner = "client!th", name = "d", descriptor = "(II)[[I", line = 6)
    public final int[][] method26(int arg0, int arg1) {
        field4294++;
        if (arg0 != 0) {
            field4298 = -25L;
        }
        int[][] var3 = this.field2775.method319(-104, arg1);
        if (this.field2775.field775) {
            int[][] var4 = this.method1133(arg1, 0, true);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class244.field4133; var11++) {
                int var12 = var5[var11];
                int var13 = var7[var11];
                int var14 = var6[var11];
                if (var12 == var13 && var13 == var14) {
                    var8[var11] = this.field4297 * var12 >> 12;
                    var9[var11] = this.field4288 * var13 >> 12;
                    var10[var11] = this.field4293 * var14 >> 12;
                } else {
                    var8[var11] = this.field4297;
                    var9[var11] = this.field4288;
                    var10[var11] = this.field4293;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IILbb;)V", line = 70)
    public final void method5(int arg0, int arg1, class134 arg2) {
        field4285++;
        if (arg0 != 8) {
            method1725((byte) -67);
        }
        if (arg1 == 0) {
            this.field4297 = arg2.method942(true);
        } else if (arg1 == 1) {
            this.field4288 = arg2.method942(true);
        } else if (arg1 == 2) {
            this.field4293 = arg2.method942(true);
        }
    }

    @OriginalMember(owner = "client!th", name = "e", descriptor = "(II)V", line = 115)
    public static final void method1723(int arg0, int arg1) {
        class184 var2;
        if (class56.field846 || class218.field3658 == null) {
            var2 = new class184(512, 512);
        } else {
            var2 = (class184) class218.field3658;
        }
        field4295++;
        int[] var3 = var2.field3196;
        int var4 = var3.length;
        for (int var5 = 0; var5 < var4; var5++) {
            var3[var5] = 1;
        }
        for (int var6 = 1; var6 < 103; var6++) {
            int var7 = ((52736 - var6 * 512) * 4) + 24628;
            for (int var8 = 1; var8 < 103; var8++) {
                if ((class301.field4992[arg1][var8][var6] & 0x18) == 0) {
                    class64.method470(var3, var7, 512, arg1, var8, var6);
                }
                if (arg1 < 3 && (class301.field4992[arg1 + 1][var8][var6] & 0x8) != 0) {
                    class64.method470(var3, var7, 512, arg1 + 1, var8, var6);
                }
                var7 += 4;
            }
        }
        int var9 = (((int) (Math.random() * 20.0D)) + 238) - 10 << 16;
        var2.method1314();
        if (arg0 != 34) {
            return;
        }
        int var10 = 238 - (10 - ((int) (Math.random() * 20.0D)) - ((int) (Math.random() * 20.0D) + -10 + 238 << 16)) + ((int) (Math.random() * 20.0D) + -10 + 238 << 8);
        for (int var11 = 1; var11 < 103; var11++) {
            for (int var12 = 1; var12 < 103; var12++) {
                if ((class301.field4992[arg1][var12][var11] & 0x18) == 0) {
                    class265.method1789(var12, arg1, (byte) -105, var11, var10, var9);
                }
                if (arg1 < 3 && (class301.field4992[arg1 + 1][var12][var11] & 0x8) != 0) {
                    class265.method1789(var12, arg1 + 1, (byte) -127, var11, var10, var9);
                }
            }
        }
        class197.field3371 = 0;
        for (int var13 = 0; var13 < 104; var13++) {
            for (int var14 = 0; var14 < 104; var14++) {
                long var15 = class187.method1353(class131.field2250, var13, var14);
                if (var15 != 0L) {
                    class265 var17 = class185.method1338((int) (var15 >>> 32) & Integer.MAX_VALUE, -7153);
                    int var18 = var17.field4476;
                    if (var17.field4435 != null) {
                        for (int var19 = 0; var19 < var17.field4435.length; var19++) {
                            if (var17.field4435[var19] != -1) {
                                class265 var20 = class185.method1338(var17.field4435[var19], -7153);
                                if (var20.field4476 >= 0) {
                                    var18 = var20.field4476;
                                    break;
                                }
                            }
                        }
                    }
                    if (var18 >= 0) {
                        int var21 = var13;
                        int var22 = var14;
                        if (var18 != 22 && var18 != 29 && var18 != 34 && var18 != 36 && var18 != 46 && var18 != 47 && var18 != 48) {
                            int[][] var23 = class94.field1475[class131.field2250].field460;
                            for (int var24 = 0; var24 < 10; var24++) {
                                int var25 = (int) (Math.random() * 4.0D);
                                if (var25 == 0 && var21 > 0 && var21 > (var13 - 3) && (var23[var21 - 1][var22] & 0x12C0108) == 0) {
                                    var21--;
                                }
                                if (var25 == 1 && var21 < 103 && (var13 + 3) > var21 && (var23[var21 + 1][var22] & 0x12C0180) == 0) {
                                    var21++;
                                }
                                if (var25 == 2 && var22 > 0 && (var14 - 3) < var22 && (var23[var21][var22 - 1] & 0x12C0102) == 0) {
                                    var22--;
                                }
                                if (var25 == 3 && var22 < 103 && (var14 + 3) > var22 && (var23[var21][var22 + 1] & 0x12C0120) == 0) {
                                    var22++;
                                }
                            }
                        }
                        class259.field4352[class197.field3371] = var17.field4481;
                        class168.field2990[class197.field3371] = var21;
                        class220.field3705[class197.field3371] = var22;
                        class197.field3371++;
                    }
                }
            }
        }
        if (class56.field846) {
            for (int var26 = 0; var26 < var4; var26++) {
                if (var3[var26] == 0) {
                    var3[var26] = 1;
                }
            }
            class218.field3658 = new class198(var2);
        } else {
            class218.field3658 = var2;
        }
        if (class56.field846) {
            class276.field4626 = null;
        } else {
            class106.field1668.method137((byte) -118);
        }
    }

    @OriginalMember(owner = "client!th", name = "<init>", descriptor = "()V", line = 378)
    public class255() {
        super(1, false);
    }

    @OriginalMember(owner = "client!th", name = "f", descriptor = "(I)V", line = 334)
    public static void method1724(int arg0) {
        if (arg0 > 8) {
            field4287 = null;
            field4289 = null;
        }
    }

    @OriginalMember(owner = "client!th", name = "e", descriptor = "(B)V", line = 362)
    public static final void method1725(byte arg0) {
        if (arg0 != 60) {
            field4286 = -102;
        }
        field4284++;
        class197.field3369.method1178(-107);
    }
}
