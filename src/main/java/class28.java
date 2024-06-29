import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public class class28 extends class171 {

    @OriginalMember(owner = "client!vf", name = "B", descriptor = "Lr;")
    public class226 field553;

    @OriginalMember(owner = "client!vf", name = "G", descriptor = "J")
    public static long field558 = 0L;

    @OriginalMember(owner = "client!vf", name = "F", descriptor = "Lha;")
    private static class46 field557 = class271.method1828("flash2:", -46);

    @OriginalMember(owner = "client!vf", name = "E", descriptor = "Lha;")
    public static class46 field556 = field557;

    @OriginalMember(owner = "client!vf", name = "C", descriptor = "Lha;")
    public static class46 field554 = field557;

    @OriginalMember(owner = "client!vf", name = "I", descriptor = "Lwf;")
    public static class16 field560 = new class16(100);

    @OriginalMember(owner = "client!vf", name = "D", descriptor = "I")
    public static int field555;

    @OriginalMember(owner = "client!vf", name = "H", descriptor = "I")
    public static int field559;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIIII)Z")
    public static final boolean method195(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = class171.field3049 * arg0 + class169.field3009 * arg3 >> 16;
        int var6 = class171.field3049 * arg3 - class169.field3009 * arg0 >> 16;
        int var7 = class261.field4554 * var6 + class254.field4454 * arg1 >> 16;
        int var8 = class261.field4554 * arg1 - class254.field4454 * var6 >> 16;
        if (var7 < 1) {
            var7 = 1;
        }
        int var9 = (var5 << 9) / var7;
        int var10 = (var8 << 9) / var7;
        int var11 = class261.field4554 * var6 + class254.field4454 * arg2 >> 16;
        int var12 = class261.field4554 * arg2 - class254.field4454 * var6 >> 16;
        if (var11 < 1) {
            var11 = 1;
        }
        int var13 = (var5 << 9) / var11;
        int var14 = (var12 << 9) / var11;
        if (var7 < 50 && var11 < 50) {
            return false;
        } else if (var7 > arg4 && var11 > arg4) {
            return false;
        } else if (var9 < class144.field2623 && var13 < class144.field2623) {
            return false;
        } else if (var9 > class52.field897 && var13 > class52.field897) {
            return false;
        } else if (var10 < class261.field4546 && var14 < class261.field4546) {
            return false;
        } else {
            return var10 <= class20.field269 || var14 <= class20.field269;
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(III)Lva;")
    public static final class255 method196(int arg0, int arg1, int arg2) {
        class201 var3 = class111.field2080[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class255 var4 = var3.field3589;
            var3.field3589 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!vf", name = "<init>", descriptor = "(Lr;)V")
    public class28(class226 arg0) {
        this.field553 = arg0;
    }

    @OriginalMember(owner = "client!vf", name = "e", descriptor = "(I)V")
    public static void method197(int arg0) {
        field560 = null;
        field556 = null;
        field554 = null;
        field557 = null;
        if (arg0 != 1) {
            method195(63, 35, -87, 46, -50);
        }
    }

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "(III)I")
    public static final int method198(int arg0, int arg1, int arg2) {
        field555++;
        int var3 = -92 % ((arg0 - 26) / 59);
        int var4 = arg2 >> 31 & arg1 - 1;
        return ((arg2 >>> 31) + arg2) % arg1 + var4;
    }

    @OriginalMember(owner = "client!vf", name = "f", descriptor = "(I)V")
    public static final void method199(int arg0) {
        field559++;
        int var1 = class12.field198 * 128 + 64;
        int var2 = class15.field224 * 128 + 64;
        int var3 = class206.method1461(var1, class135.field2450, var2, 4) - class182.field3273;
        if (class272.field4746 < arg0) {
            if (var1 > class134.field2425) {
                class134.field2425 += (var1 - class134.field2425) * class272.field4746 / 1000 + class254.field4452;
                if (var1 < class134.field2425) {
                    class134.field2425 = var1;
                }
            }
            if (class26.field513 < var3) {
                class26.field513 += (var3 - class26.field513) * class272.field4746 / 1000 + class254.field4452;
                if (class26.field513 > var3) {
                    class26.field513 = var3;
                }
            }
            if (var1 < class134.field2425) {
                class134.field2425 -= (class134.field2425 - var1) * class272.field4746 / 1000 + class254.field4452;
                if (var1 > class134.field2425) {
                    class134.field2425 = var1;
                }
            }
            if (var3 < class26.field513) {
                class26.field513 -= (class26.field513 - var3) * class272.field4746 / 1000 + class254.field4452;
                if (var3 > class26.field513) {
                    class26.field513 = var3;
                }
            }
            if (class161.field2849 < var2) {
                class161.field2849 += (var2 - class161.field2849) * class272.field4746 / 1000 + class254.field4452;
                if (class161.field2849 > var2) {
                    class161.field2849 = var2;
                }
            }
            if (class161.field2849 > var2) {
                class161.field2849 -= class254.field4452 + ((class161.field2849 - var2) * class272.field4746 / 1000);
                if (class161.field2849 < var2) {
                    class161.field2849 = var2;
                }
            }
        } else {
            class134.field2425 = class12.field198 * 128 + 64;
            class161.field2849 = class15.field224 * 128 + 64;
            class26.field513 = class206.method1461(class134.field2425, class135.field2450, class161.field2849, 4) - class182.field3273;
        }
        int var4 = class143.field2605 * 128 + 64;
        int var5 = class149.field2670 * 128 + 64;
        int var6 = class206.method1461(var5, class135.field2450, var4, 4) - class68.field1184;
        int var7 = var6 - class26.field513;
        int var8 = var5 - class134.field2425;
        int var9 = var4 - class161.field2849;
        int var10 = (int) Math.sqrt((double) (var8 * var8 + var9 * var9));
        int var11 = (int) (Math.atan2((double) var7, (double) var10) * 325.949D) & 0x7FF;
        if (var11 < 128) {
            var11 = 128;
        }
        if (var11 > 383) {
            var11 = 383;
        }
        int var12 = (int) (-325.949D * Math.atan2((double) var9, (double) var8)) & 0x7FF;
        if (class57.field958 < var11) {
            class57.field958 += (var11 - class57.field958) * class160.field2831 / 1000 + class52.field898;
            if (var11 < class57.field958) {
                class57.field958 = var11;
            }
        }
        int var13 = var12 - class10.field178;
        if (class57.field958 > var11) {
            class57.field958 -= (class57.field958 - var11) * class160.field2831 / 1000 + class52.field898;
            if (var11 > class57.field958) {
                class57.field958 = var11;
            }
        }
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var13 > 0) {
            class10.field178 += class52.field898 + (class160.field2831 * var13 / 1000);
            class10.field178 &= 0x7FF;
        }
        if (var13 < 0) {
            class10.field178 -= class52.field898 + (-var13 * class160.field2831 / 1000);
            class10.field178 &= 0x7FF;
        }
        int var14 = var12 - class10.field178;
        if (var14 > 1024) {
            var14 -= 2048;
        }
        if (var14 < -1024) {
            var14 += 2048;
        }
        if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
            class10.field178 = var12;
        }
    }
}
