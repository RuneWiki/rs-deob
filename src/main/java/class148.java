import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public class class148 {

    @OriginalMember(owner = "client!lh", name = "c", descriptor = "Lah;")
    public static class110 field2142 = new class110();

    @OriginalMember(owner = "client!lh", name = "g", descriptor = "Z")
    public static boolean field2146 = false;

    @OriginalMember(owner = "client!lh", name = "j", descriptor = "[I")
    public static int[] field2149 = new int[2048];

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "I")
    public static int field2140;

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "I")
    public static int field2141;

    @OriginalMember(owner = "client!lh", name = "d", descriptor = "I")
    public static int field2143;

    @OriginalMember(owner = "client!lh", name = "f", descriptor = "I")
    public static int field2145;

    @OriginalMember(owner = "client!lh", name = "l", descriptor = "Lui;")
    public static class212 field2151;

    @OriginalMember(owner = "client!lh", name = "i", descriptor = "Lfh;")
    public static class249 field2148;

    @OriginalMember(owner = "client!lh", name = "e", descriptor = "Ljk;")
    public static class297 field2144;

    @OriginalMember(owner = "client!lh", name = "k", descriptor = "[I")
    public static int[] field2150;

    @OriginalMember(owner = "client!lh", name = "h", descriptor = "[Ljd;")
    public static class227[] field2147;

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(II)Z")
    public static final boolean method1003(int arg0, int arg1) {
        field2140++;
        byte var2 = 0;
        byte var3 = 0;
        if (class293.field4441 == null) {
            if (class14.field205 == null) {
                class293.field4441 = new class289(512, 512);
            } else {
                class293.field4441 = (class289) class14.field205;
            }
            int[] var4 = class293.field4441.field4397;
            int var5 = var4.length;
            for (int var6 = 0; var6 < var5; var6++) {
                var4[var6] = 1;
            }
            for (int var7 = var2 + 1; var7 < (104 - var2 - 1); var7++) {
                int var21 = (var2 + 103 - var7) * 4 * 512 + 24628;
                for (int var22 = var3 + 1; var22 < 104 - var3 - 1; var22++) {
                    if ((class247.field3844[arg1][var22][var7] & 0x18) == 0) {
                        class277.method1846(var4, var21, 512, arg1, var22, var7);
                    }
                    if (arg1 < 3 && (class247.field3844[arg1 + 1][var22][var7] & 0x8) != 0) {
                        class277.method1846(var4, var21, 512, arg1 + 1, var22, var7);
                    }
                    var21 += 4;
                }
            }
            class123.field1822 = 0;
            for (int var8 = 0; var8 < 104; var8++) {
                for (int var9 = 0; var9 < 104; var9++) {
                    long var10 = class280.method1864(class260.field3986, var8 + var3, var2 + var9);
                    if (var10 != 0L) {
                        class188 var12 = class3.method42(-128, Integer.MAX_VALUE & (int) (var10 >>> 32));
                        int var13 = var12.field2786;
                        if (var12.field2804 != null) {
                            for (int var14 = 0; var14 < var12.field2804.length; var14++) {
                                if (var12.field2804[var14] != -1) {
                                    class188 var15 = class3.method42(arg0 ^ 0xFFFFFFAD, var12.field2804[var14]);
                                    if (var15.field2786 >= 0) {
                                        var13 = var15.field2786;
                                        break;
                                    }
                                }
                            }
                        }
                        if (var13 >= 0) {
                            int var16 = var2 + var9;
                            int var17 = var8 + var3;
                            if (var13 != 22 && var13 != 29 && var13 != 34 && var13 != 36 && var13 != 46 && var13 != 47 && var13 != 48) {
                                int[][] var18 = class243.field3763[class260.field3986].field1223;
                                for (int var19 = 0; var19 < 10; var19++) {
                                    int var20 = (int) (Math.random() * 4.0D);
                                    if (var20 == 0 && var17 > 0 && var8 - 3 < var17 && (var18[var17 - 1][var16] & 0x2C0108) == 0) {
                                        var17--;
                                    }
                                    if (var20 == 1 && var17 < 103 && var17 < (var8 + 3) && (var18[var17 + 1][var16] & 0x2C0180) == 0) {
                                        var17++;
                                    }
                                    if (var20 == 2 && var16 > 0 && var9 - 3 < var16 && (var18[var17][var16 - 1] & 0x2C0102) == 0) {
                                        var16--;
                                    }
                                    if (var20 == 3 && var16 < 103 && var16 < (var9 + 3) && (var18[var17][var16 + 1] & 0x2C0120) == 0) {
                                        var16++;
                                    }
                                }
                            }
                            class295.field4484[class123.field1822] = var12.field2742;
                            class196.field2960[class123.field1822] = var17 - var3;
                            class160.field2330[class123.field1822] = var16 - var2;
                            class123.field1822++;
                        }
                    }
                }
            }
        }
        int var23 = 238 - (10 - ((int) (Math.random() * 20.0D))) << 16;
        int var24 = 238 - (10 - ((int) (Math.random() * 20.0D))) + ((int) (Math.random() * 20.0D) + -10 + 238 << 8) + ((int) (Math.random() * 20.0D) + 228 << 16);
        class293.field4441.method1915();
        if (arg0 != -1) {
            field2151 = null;
        }
        for (int var25 = 1; var25 < 103; var25++) {
            for (int var26 = 1; var26 < 103; var26++) {
                if ((class247.field3844[arg1][var3 + var26][var2 + var25] & 0x18) == 0 && !class163.method1103(var23, var25, var3, arg1, var26, var24, arg0 + 15322, var2)) {
                    field2148.method1703(arg0 + 5062);
                    return false;
                }
                if (arg1 < 3 && (class247.field3844[arg1 + 1][var3 + var26][var2 + var25] & 0x8) != 0 && !class163.method1103(var23, var25, var3, arg1 + 1, var26, var24, arg0 ^ 0xFFFFC426, var2)) {
                    field2148.method1703(5061);
                    return false;
                }
            }
        }
        class14.field205 = class293.field4441;
        field2148.method1703(5061);
        class293.field4441 = null;
        return true;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(ILai;IIBI)V")
    public static final void method1004(int arg0, class269 arg1, int arg2, int arg3, byte arg4, int arg5) {
        field2143++;
        if (arg1.field4189 == -1 && arg1.field4191 == null) {
            return;
        }
        int var6 = 0;
        int var7 = class194.field2934 * arg1.field4206 >> 8;
        if (arg1.field4194 < arg3) {
            var6 += arg3 - arg1.field4194;
        } else if (arg1.field4197 > arg3) {
            var6 += arg1.field4197 - arg3;
        }
        if (arg0 > arg1.field4182) {
            var6 += arg0 - arg1.field4182;
        } else if (arg0 < arg1.field4204) {
            var6 += arg1.field4204 - arg0;
        }
        if (arg1.field4179 == 0 || var6 - 64 > arg1.field4179 || class194.field2934 == 0 || arg1.field4205 != arg2) {
            if (arg1.field4198 != null) {
                class108.field1581.method908(arg1.field4198);
                arg1.field4198 = null;
            }
            if (arg1.field4177 != null) {
                class108.field1581.method908(arg1.field4177);
                arg1.field4177 = null;
            }
            return;
        }
        var6 -= 64;
        if (var6 < 0) {
            var6 = 0;
        }
        int var8 = (arg1.field4179 - var6) * var7 / arg1.field4179;
        if (arg1.field4198 != null) {
            arg1.field4198.method236(var8);
        } else if (arg1.field4189 >= 0) {
            class57 var9 = class57.method473(class211.field3161, arg1.field4189, 0);
            if (var9 != null) {
                class98 var10 = var9.method474().method730(class209.field3126);
                class35 var11 = class35.method267(var10, 100, var8);
                var11.method239(-1);
                class108.field1581.method913(var11);
                arg1.field4198 = var11;
            }
        }
        if (arg4 != 122) {
            method1005(33, -13, -24);
        }
        if (arg1.field4177 != null) {
            arg1.field4177.method236(var8);
            if (!arg1.field4177.method1187((byte) 117)) {
                arg1.field4177 = null;
            }
        } else if (arg1.field4191 != null && (arg1.field4193 -= arg5) <= 0) {
            int var12 = (int) ((double) arg1.field4191.length * Math.random());
            class57 var13 = class57.method473(class211.field3161, arg1.field4191[var12], 0);
            if (var13 != null) {
                class98 var14 = var13.method474().method730(class209.field3126);
                class35 var15 = class35.method267(var14, 100, var8);
                var15.method239(0);
                class108.field1581.method913(var15);
                arg1.field4177 = var15;
                arg1.field4193 = arg1.field4196 + (int) ((double) (arg1.field4190 - arg1.field4196) * Math.random());
                return;
            }
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(III)V")
    public static final void method1005(int arg0, int arg1, int arg2) {
        class105 var3 = class9.method72(7, ~arg1, arg2);
        var3.method763(false);
        if (arg1 != 0) {
            method1007((byte) -60);
        }
        field2145++;
        var3.field1553 = arg0;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(B)V")
    public static void method1006(byte arg0) {
        field2150 = null;
        field2142 = null;
        field2144 = null;
        field2147 = null;
        field2148 = null;
        field2149 = null;
        if (arg0 != -89) {
            method1003(106, 63);
        }
        field2151 = null;
    }

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "(B)Lwh;")
    public static final class289 method1007(byte arg0) {
        field2141++;
        int var1 = class27.field525[0] * class173.field2530[0];
        int[] var2 = new int[var1];
        byte[] var3 = class209.field3125[0];
        if (arg0 != 98) {
            field2149 = null;
        }
        for (int var4 = 0; var4 < var1; var4++) {
            var2[var4] = class15.field221[class131.method904(var3[var4], 255)];
        }
        class289 var5 = new class289(client.field729, class126.field1857, class135.field1973[0], class5.field69[0], class27.field525[0], class173.field2530[0], var2);
        class293.method1936(-122);
        return var5;
    }
}
