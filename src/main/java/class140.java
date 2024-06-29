import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class140 {

    @OriginalMember(owner = "client!id", name = "b", descriptor = "I")
    private int field2346 = -1;

    @OriginalMember(owner = "client!id", name = "m", descriptor = "I")
    private int field2357 = 0;

    @OriginalMember(owner = "client!id", name = "c", descriptor = "S")
    public static short field2347 = 1;

    @OriginalMember(owner = "client!id", name = "f", descriptor = "I")
    public static int field2350 = 0;

    @OriginalMember(owner = "client!id", name = "o", descriptor = "Lwc;")
    public static class213 field2359 = null;

    @OriginalMember(owner = "client!id", name = "l", descriptor = "[I")
    public static int[] field2356 = new int[5];

    @OriginalMember(owner = "client!id", name = "r", descriptor = "Ldf;")
    public static class51 field2362 = class46.method233("Lade Texturen )2 ", 100);

    @OriginalMember(owner = "client!id", name = "a", descriptor = "I")
    public static int field2345;

    @OriginalMember(owner = "client!id", name = "e", descriptor = "I")
    public static int field2349;

    @OriginalMember(owner = "client!id", name = "g", descriptor = "I")
    public static int field2351;

    @OriginalMember(owner = "client!id", name = "h", descriptor = "I")
    public static int field2352;

    @OriginalMember(owner = "client!id", name = "i", descriptor = "I")
    public int field2353;

    @OriginalMember(owner = "client!id", name = "j", descriptor = "I")
    public int field2354;

    @OriginalMember(owner = "client!id", name = "k", descriptor = "I")
    public static int field2355;

    @OriginalMember(owner = "client!id", name = "n", descriptor = "I")
    public int field2358;

    @OriginalMember(owner = "client!id", name = "p", descriptor = "I")
    public int field2360;

    @OriginalMember(owner = "client!id", name = "q", descriptor = "I")
    public static int field2361;

    @OriginalMember(owner = "client!id", name = "s", descriptor = "I")
    public static int field2363;

    @OriginalMember(owner = "client!id", name = "d", descriptor = "Ltg;")
    public static class171 field2348;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(II)I")
    public static final int method1013(int arg0, int arg1) {
        if (arg0 < 105) {
            return 19;
        } else {
            field2351++;
            return arg1 >>> 8;
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IILlb;)V")
    public final void method1014(int arg0, int arg1, class121 arg2) {
        field2361++;
        while (true) {
            int var4 = arg2.method897(-80);
            if (var4 == 0) {
                if (arg1 == -9389) {
                    return;
                } else {
                    field2352 = -61;
                    return;
                }
            }
            this.method1015(arg0, var4, arg2, 5);
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IILlb;I)V")
    private final void method1015(int arg0, int arg1, class121 arg2, int arg3) {
        field2363++;
        if (arg1 == 1) {
            this.field2357 = arg2.method891((byte) -112);
            this.method1016(this.field2357, (byte) 112);
        } else if (arg1 == 2) {
            this.field2346 = arg2.method876(false);
            if (this.field2346 == 65535) {
                this.field2346 = -1;
            }
        } else if (arg1 == 3) {
            arg2.method876(false);
        }
        if (arg3 != 5) {
            this.field2353 = -72;
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IB)V")
    private final void method1016(int arg0, byte arg1) {
        field2355++;
        double var3 = (double) ((arg0 & 0xFFB70C) >> 16) / 256.0D;
        double var5 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
        double var7 = var3;
        double var9 = (double) (arg0 & 0xFF) / 256.0D;
        double var11 = var3;
        if (var5 < var3) {
            var7 = var5;
        }
        if (var9 < var7) {
            var7 = var9;
        }
        if (var3 < var5) {
            var11 = var5;
        }
        double var13 = 0.0D;
        if (var9 > var11) {
            var11 = var9;
        }
        double var15 = 0.0D;
        double var17 = (var7 + var11) / 2.0D;
        this.field2360 = (int) (var17 * 256.0D);
        if (this.field2360 < 0) {
            this.field2360 = 0;
        } else if (this.field2360 > 255) {
            this.field2360 = 255;
        }
        if (var7 != var11) {
            if (var17 < 0.5D) {
                var15 = (var11 - var7) / (var7 + var11);
            }
            if (var17 >= 0.5D) {
                var15 = (var11 - var7) / (2.0D - var11 - var7);
            }
            if (var3 == var11) {
                var13 = (var5 - var9) / (var11 - var7);
            } else if (var5 == var11) {
                var13 = (var9 - var3) / (var11 - var7) + 2.0D;
            } else if (var9 == var11) {
                var13 = (var3 - var5) / (var11 - var7) + 4.0D;
            }
        }
        this.field2358 = (int) (var15 * 256.0D);
        double var19 = var13 / 6.0D;
        if (this.field2358 < 0) {
            this.field2358 = 0;
        } else if (this.field2358 > 255) {
            this.field2358 = 255;
        }
        if (arg1 != 112) {
            return;
        }
        if ((var17 > 0.5D)) {
            this.field2354 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field2354 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field2354 < 1) {
            this.field2354 = 1;
        }
        this.field2353 = (int) ((double) this.field2354 * var19);
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IZILja;IIB)V")
    public static final void method1017(int arg0, boolean arg1, int arg2, class55 arg3, int arg4, int arg5, byte arg6) {
        field2349++;
        long var7 = (long) ((arg5 << 16) + arg4);
        class228 var9 = (class228) class202.field3366.method1453(var7, 1);
        if (var9 != null) {
            return;
        }
        class228 var10 = (class228) class135.field2244.method1453(var7, 1);
        if (var10 != null) {
            return;
        }
        if (arg2 <= 12) {
            method1019(true);
        }
        class228 var11 = (class228) class201.field3353.method1453(var7, 1);
        if (var11 == null) {
            if (!arg1) {
                class228 var12 = (class228) class233.field4058.method1453(var7, 1);
                if (var12 != null) {
                    return;
                }
            }
            class228 var13 = new class228();
            var13.field3976 = arg6;
            var13.field3980 = arg0;
            var13.field3979 = arg3;
            if (arg1) {
                class202.field3366.method1447(-92, var7, var13);
                class146.field2439++;
            } else {
                class169.field2752.method404(var13, false);
                class201.field3353.method1447(-89, var7, var13);
                class131.field2194++;
            }
        } else if (arg1) {
            var11.method134(-46);
            class202.field3366.method1447(56, var7, var11);
            class131.field2194--;
            class146.field2439++;
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(I)V")
    public static void method1018(int arg0) {
        if (arg0 == 0) {
            field2356 = null;
            field2359 = null;
            field2348 = null;
            field2362 = null;
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(Z)V")
    public static final void method1019(boolean arg0) {
        int var1 = 0;
        if (arg0) {
            field2348 = null;
        }
        while (var1 < class22.field312) {
            class166 var2 = class115.method843((byte) -51, var1);
            if (var2 != null && var2.field2701 == 0) {
                class139.field2335[var1] = 0;
                class30.field439[var1] = 0;
            }
            var1++;
        }
        field2345++;
        class189.field3158 = new class212(16);
    }
}
