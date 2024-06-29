import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nm")
public class class199 extends class15 {

    @OriginalMember(owner = "client!nm", name = "J", descriptor = "[I")
    public static int[] field3388 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!nm", name = "M", descriptor = "[Lui;")
    public static class89[] field3391 = new class89[32768];

    @OriginalMember(owner = "client!nm", name = "P", descriptor = "Z")
    public static boolean field3394 = false;

    @OriginalMember(owner = "client!nm", name = "Y", descriptor = "Lce;")
    public static class126 field3403 = class206.method1445(-7923, ")3runescape)3com)4l=");

    @OriginalMember(owner = "client!nm", name = "R", descriptor = "I")
    public static volatile int field3396 = 0;

    @OriginalMember(owner = "client!nm", name = "K", descriptor = "Lsi;")
    public static class237 field3389 = new class237(16);

    @OriginalMember(owner = "client!nm", name = "L", descriptor = "I")
    public static int field3390;

    @OriginalMember(owner = "client!nm", name = "N", descriptor = "I")
    private int field3392;

    @OriginalMember(owner = "client!nm", name = "Q", descriptor = "I")
    public static int field3395;

    @OriginalMember(owner = "client!nm", name = "S", descriptor = "I")
    public static int field3397;

    @OriginalMember(owner = "client!nm", name = "T", descriptor = "I")
    public static int field3398;

    @OriginalMember(owner = "client!nm", name = "U", descriptor = "I")
    public int field3399;

    @OriginalMember(owner = "client!nm", name = "V", descriptor = "I")
    public static int field3400;

    @OriginalMember(owner = "client!nm", name = "W", descriptor = "I")
    public static int field3401;

    @OriginalMember(owner = "client!nm", name = "X", descriptor = "I")
    public static int field3402;

    @OriginalMember(owner = "client!nm", name = "O", descriptor = "Lce;")
    public class126 field3393;

    @OriginalMember(owner = "client!nm", name = "c", descriptor = "(I)V", line = 13)
    public static void method1406(int arg0) {
        if (arg0 != -3) {
            field3396 = 78;
        }
        field3388 = null;
        field3391 = null;
        field3389 = null;
        field3403 = null;
    }

    @OriginalMember(owner = "client!nm", name = "e", descriptor = "(B)Z", line = 37)
    public static final boolean method1407(byte arg0) {
        field3390++;
        if (class206.field3538) {
            try {
                return !(Boolean) class8.field96.method844(class161.field2907.field2705, (byte) -64);
            } catch (Throwable var2) {
            }
        }
        if (arg0 != -107) {
            field3391 = (class89[]) null;
        }
        return true;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(ILbb;B)V", line = 60)
    private final void method1408(int arg0, class134 arg1, byte arg2) {
        field3401++;
        int var4 = 117 / ((arg2 - 40) / 38);
        if (arg0 == 1) {
            this.field3392 = arg1.method948(-122);
        } else if (arg0 == 2) {
            this.field3399 = arg1.method957(496113200);
        } else if (arg0 == 5) {
            this.field3393 = arg1.method970(1);
        }
    }

    @OriginalMember(owner = "client!nm", name = "d", descriptor = "(I)Z", line = 97)
    public final boolean method1409(int arg0) {
        if (arg0 != 4) {
            this.field3399 = 11;
        }
        field3402++;
        return this.field3392 == 115;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(BLsh;IIIII)V", line = 109)
    public static final void method1410(byte arg0, class32 arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        long var7 = 0L;
        if (arg4 == 0) {
            var7 = class214.method1486(arg6, arg2, arg5);
        } else if (arg4 == 1) {
            var7 = class71.method513(arg6, arg2, arg5);
        } else if (arg4 == 2) {
            var7 = class7.method39(arg6, arg2, arg5);
        } else if (arg4 == 3) {
            var7 = class187.method1353(arg6, arg2, arg5);
        }
        field3397++;
        boolean var9 = true;
        int var10 = (int) (var7 >>> 32) & Integer.MAX_VALUE;
        boolean var11 = false;
        int var12 = ((int) var7 & 0x7FA03) >> 14;
        if (arg0 != -56) {
            return;
        }
        boolean var13 = false;
        class265 var14 = class185.method1338(var10, -7153);
        if (var14.method1792(true)) {
            class202.method1423(var14, arg6, arg5, arg2, (byte) -54);
        }
        int var15 = ((int) var7 & 0x3843CB) >> 20;
        if (var7 == 0L) {
            return;
        }
        class114 var16 = null;
        class114 var17 = null;
        if (arg4 == 0) {
            class130 var21 = class118.method778(arg6, arg2, arg5);
            if (var21 != null) {
                var16 = var21.field2234;
                var17 = var21.field2239;
            }
            if (var14.field4470 != 0) {
                arg1.method165(-1, arg5, var14.field4483, var12, arg2, var15);
            }
        } else if (arg4 == 1) {
            class107 var20 = class107.method709(arg6, arg2, arg5);
            if (var20 != null) {
                var16 = var20.field1684;
                var17 = var20.field1683;
            }
        } else if (arg4 == 2) {
            class240 var19 = class152.method1130(arg6, arg2, arg5);
            if (var19 != null) {
                var16 = var19.field4043;
            }
            if (var14.field4470 != 0 && (var14.field4474 + arg2) < 104 && var14.field4474 + arg5 < 104 && (var14.field4452 + arg2) < 104 && var14.field4452 + arg5 < 104) {
                arg1.method160(var14.field4483, 110, arg2, var15, arg5, var14.field4452, var14.field4474);
            }
        } else if (arg4 == 3) {
            class8 var18 = class51.method323(arg6, arg2, arg5);
            if (var18 != null) {
                var16 = var18.field103;
            }
            if (var14.field4470 == 1) {
                arg1.method164(arg2, arg5, false);
            }
        }
        if (!class56.field846 || !var14.field4487) {
            return;
        }
        if (var12 == 2) {
            if ((var16 instanceof class95)) {
                ((class95) var16).method654(false);
            } else {
                class287.method1908(0, var15 + 4, arg5, 0, 3, var14, arg2, var12, arg3);
            }
            if (var17 instanceof class95) {
                ((class95) var17).method654(false);
            } else {
                class287.method1908(0, var15 + 1 & 0x3, arg5, 0, 3, var14, arg2, var12, arg3);
            }
        } else if (var12 == 5) {
            if (var16 instanceof class95) {
                ((class95) var16).method654(false);
            } else {
                class287.method1908(class91.field1445[var15] * 8, var15, arg5, class14.field195[var15] * 8, 3, var14, arg2, 4, arg3);
            }
        } else if (var12 == 6) {
            if (var16 instanceof class95) {
                ((class95) var16).method654(false);
            } else {
                class287.method1908(class294.field4902[var15] * 8, var15 + 4, arg5, field3388[var15] * 8, 3, var14, arg2, 4, arg3);
            }
        } else if (var12 == 7) {
            if (var16 instanceof class95) {
                ((class95) var16).method654(false);
            } else {
                class287.method1908(0, (var15 + 2 & 0x3) + 4, arg5, 0, 3, var14, arg2, 4, arg3);
            }
        } else if (var12 == 8) {
            if (var16 instanceof class95) {
                ((class95) var16).method654(false);
            } else {
                class287.method1908(class294.field4902[var15] * 8, var15 + 4, arg5, field3388[var15] * 8, 3, var14, arg2, 4, arg3);
            }
            if ((var17 instanceof class95)) {
                ((class95) var17).method654(false);
            } else {
                class287.method1908(class294.field4902[var15] * 8, (var15 + 2 & 0x3) + 4, arg5, field3388[var15] * 8, 3, var14, arg2, 4, arg3);
            }
        } else if (var12 == 11) {
            if ((var16 instanceof class95)) {
                ((class95) var16).method654(false);
            } else {
                class287.method1908(0, var15 + 4, arg5, 0, 3, var14, arg2, 10, arg3);
            }
        } else if (var16 instanceof class95) {
            ((class95) var16).method654(false);
        } else {
            class287.method1908(0, var15, arg5, 0, arg0 + 59, var14, arg2, var12, arg3);
        }
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(IIIIILja;IJZ)Z", line = 309)
    public static final boolean method1411(int arg0, int arg1, int arg2, int arg3, int arg4, class114 arg5, int arg6, long arg7, boolean arg8) {
        if (arg5 == null) {
            return true;
        }
        int var10 = arg1 - arg4;
        int var11 = arg2 - arg4;
        int var12 = arg1 + arg4;
        int var13 = arg2 + arg4;
        if (arg8) {
            if (arg6 > 640 && arg6 < 1408) {
                var13 += 128;
            }
            if (arg6 > 1152 && arg6 < 1920) {
                var12 += 128;
            }
            if (arg6 > 1664 || arg6 < 384) {
                var11 -= 128;
            }
            if (arg6 > 128 && arg6 < 896) {
                var10 -= 128;
            }
        }
        int var14 = var10 / 128;
        int var15 = var11 / 128;
        int var16 = var12 / 128;
        int var17 = var13 / 128;
        return class231.method1575(arg0, var14, var15, var16 + 1 - var14, var17 - var15 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7);
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(Lbb;B)V", line = 348)
    public final void method1412(class134 arg0, byte arg1) {
        while (true) {
            int var3 = arg0.method948(-128);
            if (var3 == 0) {
                field3398++;
                int var4 = 18 % ((arg1 - 9) / 61);
                return;
            }
            this.method1408(var3, arg0, (byte) 85);
        }
    }
}
