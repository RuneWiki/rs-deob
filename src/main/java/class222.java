import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public abstract class class222 {

    @OriginalMember(owner = "client!lh", name = "c", descriptor = "I")
    public int field3382;

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "I")
    public int field3380;

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "I")
    public int field3381;

    @OriginalMember(owner = "client!lh", name = "l", descriptor = "[[I")
    public static int[][] field3391 = new int[][] { new int[0], { 128, 0, 128, 128, 0, 128 }, { 0, 0, 128, 0, 128, 128, 64, 128 }, { 0, 128, 0, 0, 128, 0, 64, 128 }, { 0, 0, 64, 128, 0, 128 }, { 128, 128, 64, 128, 128, 0 }, { 64, 0, 128, 0, 128, 128, 64, 128 }, { 128, 0, 128, 128, 0, 128, 0, 64, 64, 0 }, { 0, 0, 64, 0, 0, 64 }, { 0, 0, 128, 0, 128, 128, 64, 96, 32, 64 }, { 0, 128, 0, 0, 32, 64, 64, 96, 128, 128 }, { 0, 128, 0, 0, 32, 32, 96, 32, 128, 0, 128, 128 } };

    @OriginalMember(owner = "client!lh", name = "k", descriptor = "Ljava/lang/String;")
    public static String field3390 = "Created gameworld";

    @OriginalMember(owner = "client!lh", name = "m", descriptor = "I")
    public static int field3392 = 0;

    @OriginalMember(owner = "client!lh", name = "d", descriptor = "I")
    public static int field3383;

    @OriginalMember(owner = "client!lh", name = "e", descriptor = "I")
    public static int field3384;

    @OriginalMember(owner = "client!lh", name = "f", descriptor = "I")
    public static int field3385;

    @OriginalMember(owner = "client!lh", name = "g", descriptor = "I")
    public static int field3386;

    @OriginalMember(owner = "client!lh", name = "i", descriptor = "I")
    public static int field3388;

    @OriginalMember(owner = "client!lh", name = "n", descriptor = "I")
    public static int field3393;

    @OriginalMember(owner = "client!lh", name = "o", descriptor = "I")
    public static int field3394;

    @OriginalMember(owner = "client!lh", name = "h", descriptor = "Llm;")
    public static class210 field3387;

    @OriginalMember(owner = "client!lh", name = "j", descriptor = "Llm;")
    public static class210 field3389;

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IZILqg;I)V", line = 11)
    public static final void method1552(int arg0, boolean arg1, int arg2, class195 arg3, int arg4) {
        field3386++;
        if (arg1 || class114.field1750 == arg3 || class190.field2829 >= 400) {
            return;
        }
        String var11;
        if (arg3.field2925 == 0) {
            boolean var5 = true;
            if (class114.field1750.field2922 != -1 && arg3.field2922 != -1) {
                int var6 = class114.field1750.field2927 <= arg3.field2927 ? arg3.field2927 : class114.field1750.field2927;
                int var7 = class114.field1750.field2922 >= arg3.field2922 ? arg3.field2922 : class114.field1750.field2922;
                int var8 = class114.field1750.field2927 - arg3.field2927;
                if (var8 < 0) {
                    var8 = -var8;
                }
                int var9 = var6 * 10 / 100 + var7 + 5;
                if (var9 < var8) {
                    var5 = false;
                }
            }
            String var10 = class237.field3555 == 1 ? class200.field2996 : class15.field169;
            if (arg3.field2911 > arg3.field2927) {
                var11 = arg3.method1344(-1) + (var5 ? class28.method181(-4, arg3.field2927, class114.field1750.field2927) : "<col=ffffff>") + " (" + var10 + arg3.field2927 + "+" + (arg3.field2911 - arg3.field2927) + ")";
            } else {
                var11 = arg3.method1344(-1) + (var5 ? class28.method181(-4, arg3.field2927, class114.field1750.field2927) : "<col=ffffff>") + " (" + var10 + arg3.field2927 + ")";
            }
        } else {
            var11 = arg3.method1344(-1) + " (" + class151.field2265 + arg3.field2925 + ")";
        }
        if (class76.field985 == 1) {
            class296.method2062(arg4, (short) 21, (long) arg0, arg2, 100, class184.field2760 + " -> <col=ffffff>" + var11, class292.field4442, class160.field2404);
            class88.field1304++;
        } else if (!class122.field1907) {
            for (int var12 = 7; var12 >= 0; var12--) {
                if (class292.field4466[var12] != null) {
                    class234.field3514++;
                    short var13 = 0;
                    boolean var14 = false;
                    if (class237.field3555 == 0 && class292.field4466[var12].equalsIgnoreCase(class51.field642)) {
                        if (arg3.field2927 > class114.field1750.field2927) {
                            var13 = 2000;
                        }
                        if (class114.field1750.field2926 != 0 && arg3.field2926 != 0) {
                            if (class114.field1750.field2926 == arg3.field2926) {
                                var13 = 2000;
                            } else {
                                var13 = 0;
                            }
                        }
                    } else if (class84.field1229[var12]) {
                        var13 = 2000;
                    }
                    short var15 = class10.field104[var12];
                    short var16 = (short) (var13 + var15);
                    class296.method2062(arg4, var16, (long) arg0, arg2, 100, "<col=ffffff>" + var11, class292.field4466[var12], class198.field2969[var12]);
                }
            }
        } else if ((class274.field4201 & 0x8) != 0) {
            class296.method2062(arg4, (short) 48, (long) arg0, arg2, 100, class40.field492 + " -> <col=ffffff>" + var11, class69.field916, class149.field2247);
            class274.field4202++;
        }
        for (int var17 = 0; var17 < class190.field2829; var17++) {
            if (class201.field2998[var17] == 43) {
                class180.field2686[var17] = "<col=ffffff>" + var11;
                break;
            }
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IBII)I", line = 140)
    public static final int method1553(int arg0, byte arg1, int arg2, int arg3) {
        if (arg1 > -15) {
            method1554(59);
        }
        field3385++;
        return arg2 >= arg3 ? (arg2 > arg0 ? arg0 : arg2) : arg3;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(I)V", line = 151)
    public static final void method1554(int arg0) {
        field3388++;
        if ((class61.field802 > class75.field980)) {
            class75.field980 = (float) ((double) class75.field980 / 30.0D + (double) class75.field980);
            if (class75.field980 > class61.field802) {
                class75.field980 = class61.field802;
            }
            class162.method1150((byte) 24);
        } else if (class61.field802 < class75.field980) {
            class75.field980 = (float) ((double) class75.field980 - (double) class75.field980 / 30.0D);
            if (class75.field980 < class61.field802) {
                class75.field980 = class61.field802;
            }
            class162.method1150((byte) 24);
        }
        if (class154.field2321 != -1 && class204.field3070 != -1) {
            int var1 = class154.field2321 - class233.field3504;
            int var2 = class204.field3070 - class203.field3037;
            if (var1 < 2 || var1 > 2) {
                var1 >>= 0x4;
            }
            class233.field3504 += var1;
            if (var2 < 2 || var2 > 2) {
                var2 >>= 0x4;
            }
            if (var1 == 0 && var2 == 0) {
                class204.field3070 = -1;
                class154.field2321 = -1;
            }
            class203.field3037 -= -var2;
            class162.method1150((byte) 24);
        }
        if (arg0 != -16653) {
            method1556(false);
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(B)V", line = 208)
    public static final void method1555(byte arg0) {
        if (arg0 >= -44) {
            method1552(0, true, 119, (class195) null, 63);
        }
        class160.field2397.method2182(false);
        field3383++;
    }

    @OriginalMember(owner = "client!lh", name = "<init>", descriptor = "(III)V", line = 220)
    public class222(int arg0, int arg1, int arg2) {
        this.field3382 = arg2;
        this.field3380 = arg0;
        this.field3381 = arg1;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(Z)V", line = 234)
    public static void method1556(boolean arg0) {
        field3391 = (int[][]) null;
        field3390 = null;
        if (!arg0) {
            field3389 = null;
            field3387 = null;
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IIIIZIII)V", line = 256)
    public static final void method1557(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7) {
        field3384++;
        int var8 = method1553(class166.field2494, (byte) -92, arg3, class185.field2769);
        int var9 = method1553(class166.field2494, (byte) -107, arg2, class185.field2769);
        int var10 = method1553(class184.field2761, (byte) -58, arg7, class157.field2357);
        int var11 = method1553(class184.field2761, (byte) -83, arg0, class157.field2357);
        int var12 = method1553(class166.field2494, (byte) -20, arg3 + arg5, class185.field2769);
        int var13 = method1553(class166.field2494, (byte) -100, arg2 - arg5, class185.field2769);
        for (int var14 = var8; var14 < var12; var14++) {
            class315.method2160(class40.field488[var14], arg1, var11, var10, 7);
        }
        for (int var15 = var9; var15 > var13; var15--) {
            class315.method2160(class40.field488[var15], arg1, var11, var10, 7);
        }
        int var16 = method1553(class184.field2761, (byte) -74, arg5 + arg7, class157.field2357);
        if (!arg4) {
            field3390 = (String) null;
        }
        int var17 = method1553(class184.field2761, (byte) -33, arg0 - arg5, class157.field2357);
        for (int var18 = var12; var18 <= var13; var18++) {
            int[] var19 = class40.field488[var18];
            class315.method2160(var19, arg1, var16, var10, 7);
            class315.method2160(var19, arg6, var17, var16, 7);
            class315.method2160(var19, arg1, var11, var17, 7);
        }
    }

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "(I)I", line = 313)
    public static final int method1558(int arg0) {
        class246.field3664 = arg0;
        field3393++;
        return class162.method1145(~arg0);
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(III)V")
    public abstract void method1035(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IIZ)V")
    public abstract void method1042(int arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "(III)V")
    public abstract void method1037(int arg0, int arg1, int arg2);
}
