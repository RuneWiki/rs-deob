import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public class class224 {

    @OriginalMember(owner = "client!tf", name = "k", descriptor = "I")
    public static int field3358 = 0;

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "I")
    public static int field3349;

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "I")
    private int field3350;

    @OriginalMember(owner = "client!tf", name = "d", descriptor = "I")
    public static int field3351;

    @OriginalMember(owner = "client!tf", name = "e", descriptor = "I")
    public static int field3352;

    @OriginalMember(owner = "client!tf", name = "g", descriptor = "I")
    public static int field3354;

    @OriginalMember(owner = "client!tf", name = "i", descriptor = "I")
    public static int field3356;

    @OriginalMember(owner = "client!tf", name = "j", descriptor = "I")
    public static int field3357;

    @OriginalMember(owner = "client!tf", name = "l", descriptor = "I")
    public static int field3359;

    @OriginalMember(owner = "client!tf", name = "m", descriptor = "I")
    public static int field3360;

    @OriginalMember(owner = "client!tf", name = "n", descriptor = "I")
    public int field3361;

    @OriginalMember(owner = "client!tf", name = "o", descriptor = "I")
    public int field3362;

    @OriginalMember(owner = "client!tf", name = "h", descriptor = "Lnk;")
    public static class11 field3355;

    @OriginalMember(owner = "client!tf", name = "f", descriptor = "Z")
    public static boolean field3353;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "[[S")
    public static short[][] field3348;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IIIIIIIIZI)V")
    public static final void method1458(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9) {
        if (arg8) {
            field3349 = 62;
        }
        field3360++;
        class272 var10 = (class272) class91.field1382.method656(126);
        class272 var11 = null;
        while (var10 != null) {
            if (var10.field4315 == arg7 && var10.field4310 == arg3 && var10.field4311 == arg4 && var10.field4313 == arg1) {
                var11 = var10;
                break;
            }
            var10 = (class272) class91.field1382.method650(125);
        }
        if (var11 == null) {
            var11 = new class272();
            var11.field4311 = arg4;
            var11.field4313 = arg1;
            var11.field4315 = arg7;
            var11.field4310 = arg3;
            class233.method1523(var11, 30312);
            class91.field1382.method652(58, var11);
        }
        var11.field4320 = arg6;
        var11.field4304 = arg2;
        var11.field4302 = arg9;
        var11.field4308 = arg0;
        var11.field4317 = arg5;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IIILkl;)V")
    private final void method1459(int arg0, int arg1, int arg2, class114 arg3) {
        field3352++;
        if (arg1 == 1) {
            this.field3350 = arg3.method756(arg2 ^ 0xFFFF8BB3);
        } else if (arg1 == 2) {
            this.field3361 = arg3.method760(false);
            this.field3362 = arg3.method760(false);
        }
        if (arg2 != 128) {
            this.field3361 = 101;
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IS)Z")
    public static final boolean method1460(int arg0, short arg1) {
        if (arg0 < 75) {
            return false;
        }
        field3359++;
        if (arg1 == 57 || arg1 == 32 || arg1 == 14 || arg1 == 5 || arg1 == 11 || arg1 == 22 || arg1 == 50 || arg1 == 30) {
            return true;
        } else if (arg1 == 44 || arg1 == 40 || arg1 == 1001 || arg1 == 1003) {
            return true;
        } else if (arg1 == 45 || arg1 == 4 || arg1 == 49 || arg1 == 46 || arg1 == 34) {
            return true;
        } else {
            return arg1 == 48 || arg1 == 51 || arg1 == 23 || arg1 == 31 || arg1 == 25 || arg1 == 20;
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IZLkl;)V")
    public final void method1461(int arg0, boolean arg1, class114 arg2) {
        if (arg1) {
            method1465(-84, 86, 53, -15, 96, (byte[][][]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, -11, (byte) 72, -23, -101);
        }
        field3354++;
        while (true) {
            int var4 = arg2.method760(false);
            if (var4 == 0) {
                return;
            }
            this.method1459(arg0, var4, 128, arg2);
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(Z)V")
    public static final void method1462(boolean arg0) {
        field3356++;
        boolean var1 = arg0;
        while (!var1) {
            var1 = true;
            for (int var2 = 0; var2 < (class283.field4508 - 1); var2++) {
                if (class280.field4475[var2] < 1000 && class280.field4475[var2 + 1] > 1000) {
                    String var3 = class69.field1087[var2];
                    class69.field1087[var2] = class69.field1087[var2 + 1];
                    class69.field1087[var2 + 1] = var3;
                    var1 = false;
                    String var4 = class86.field1330[var2];
                    class86.field1330[var2] = class86.field1330[var2 + 1];
                    class86.field1330[var2 + 1] = var4;
                    int var5 = class212.field3048[var2];
                    class212.field3048[var2] = class212.field3048[var2 + 1];
                    class212.field3048[var2 + 1] = var5;
                    int var6 = class195.field2798[var2];
                    class195.field2798[var2] = class195.field2798[var2 + 1];
                    class195.field2798[var2 + 1] = var6;
                    int var7 = class187.field2665[var2];
                    class187.field2665[var2] = class187.field2665[var2 + 1];
                    class187.field2665[var2 + 1] = var7;
                    short var8 = class280.field4475[var2];
                    class280.field4475[var2] = class280.field4475[var2 + 1];
                    class280.field4475[var2 + 1] = var8;
                    long var9 = class180.field2574[var2];
                    class180.field2574[var2] = class180.field2574[var2 + 1];
                    class180.field2574[var2 + 1] = var9;
                }
            }
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(B)Llk;")
    public final class244 method1463(byte arg0) {
        field3351++;
        int var2 = 29 % ((arg0 - 31) / 33);
        class244 var3 = (class244) class259.field3917.method263((byte) 113, (long) this.field3350);
        if (var3 != null) {
            return var3;
        }
        class244 var4 = class237.method1557(class22.field289, 0, this.field3350, 0);
        if (var4 != null) {
            class259.field3917.method255((long) this.field3350, var4, (byte) -127);
        }
        return var4;
    }

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "(B)V")
    public static void method1464(byte arg0) {
        field3348 = null;
        if (arg0 != 18) {
            field3348 = null;
        }
        field3355 = null;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IIIII[[[B[I[I[I[I[IIBII)V")
    public static final void method1465(int arg0, int arg1, int arg2, int arg3, int arg4, byte[][][] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int arg11, byte arg12, int arg13, int arg14) {
        if (arg0 < 0) {
            arg0 = 0;
        } else if (arg0 >= class90.field1372 * 128) {
            arg0 = class90.field1372 * 128 - 1;
        }
        if (arg2 < 0) {
            arg2 = 0;
        } else if (arg2 >= class225.field3383 * 128) {
            arg2 = class225.field3383 * 128 - 1;
        }
        class148.field2113 = class18.field261[arg3];
        class114.field1643 = class18.field259[arg3];
        class71.field1104 = class18.field261[arg4];
        class47.field663 = class18.field259[arg4];
        class96.field1456 = arg0;
        field3357 = arg1;
        class162.field2363 = arg2;
        class114.field1641 = arg0 / 128;
        class152.field2207 = arg2 / 128;
        class119.field1751 = class114.field1641 - class219.field3228;
        if (class119.field1751 < 0) {
            class119.field1751 = 0;
        }
        class28.field406 = class152.field2207 - class219.field3228;
        if (class28.field406 < 0) {
            class28.field406 = 0;
        }
        class162.field2352 = class219.field3228 + class114.field1641;
        if (class162.field2352 > class90.field1372) {
            class162.field2352 = class90.field1372;
        }
        class281.field4482 = class219.field3228 + class152.field2207;
        if (class281.field4482 > class225.field3383) {
            class281.field4482 = class225.field3383;
        }
        short var15 = 3500;
        for (int var16 = 0; var16 < class219.field3228 + class219.field3228 + 2; var16++) {
            for (int var19 = 0; var19 < class219.field3228 + class219.field3228 + 2; var19++) {
                int var20 = (var16 - class219.field3228 << 7) - (class96.field1456 & 0x7F);
                int var21 = (var19 - class219.field3228 << 7) - (class162.field2363 & 0x7F);
                int var22 = class114.field1641 + var16 - class219.field3228;
                int var23 = class152.field2207 + var19 - class219.field3228;
                if (var22 >= 0 && var23 >= 0 && var22 < class90.field1372 && var23 < class225.field3383) {
                    int var24;
                    if (class110.field1587 == null) {
                        var24 = class176.field2502[0][var22][var23] + 128 - field3357;
                    } else {
                        var24 = class110.field1587[0][var22][var23] + 128 - field3357;
                    }
                    int var25 = class176.field2502[3][var22][var23] - field3357 - 1000;
                    class26.field355[var16][var19] = class39.method268(var20, var25, var24, var21, var15);
                } else {
                    class26.field355[var16][var19] = false;
                }
            }
        }
        for (int var17 = 0; var17 < class219.field3228 + class219.field3228 + 1; var17++) {
            for (int var18 = 0; var18 < class219.field3228 + class219.field3228 + 1; var18++) {
                class233.field3478[var17][var18] = class26.field355[var17][var18] || class26.field355[var17 + 1][var18] || class26.field355[var17][var18 + 1] || class26.field355[var17 + 1][var18 + 1];
            }
        }
        class5.field48 = arg6;
        class187.field2658 = arg7;
        class173.field2470 = arg8;
        class245.field3669 = arg9;
        class114.field1649 = arg10;
        class61.method410();
        if (class264.field3985 != null) {
            class1.method5(true);
            class131.method902(arg0, arg1, arg2, (byte[][][]) null, 0, (byte) 0, arg13, arg14);
            class1.method5(false);
        }
        class131.method902(arg0, arg1, arg2, arg5, arg11, arg12, arg13, arg14);
    }
}
