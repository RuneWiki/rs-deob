import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public class class279 {

    @OriginalMember(owner = "client!uj", name = "c", descriptor = "Lid;")
    public static class149 field4978 = class60.method382("Liste des mises -9 jour charg-Be", (byte) 69);

    @OriginalMember(owner = "client!uj", name = "i", descriptor = "Lid;")
    public static class149 field4984 = class60.method382("", (byte) 69);

    @OriginalMember(owner = "client!uj", name = "f", descriptor = "Lve;")
    public static class189 field4981 = new class189(50);

    @OriginalMember(owner = "client!uj", name = "k", descriptor = "I")
    public static int field4986 = 0;

    @OriginalMember(owner = "client!uj", name = "j", descriptor = "Z")
    public static boolean field4985 = false;

    @OriginalMember(owner = "client!uj", name = "l", descriptor = "Z")
    public static boolean field4987 = false;

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "I")
    public static int field4976;

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "I")
    public static int field4977;

    @OriginalMember(owner = "client!uj", name = "d", descriptor = "I")
    public static int field4979;

    @OriginalMember(owner = "client!uj", name = "e", descriptor = "I")
    public static int field4980;

    @OriginalMember(owner = "client!uj", name = "g", descriptor = "I")
    public static int field4982;

    @OriginalMember(owner = "client!uj", name = "h", descriptor = "I")
    public static int field4983;

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(B)V")
    public static final void method1922(byte arg0) {
        field4982++;
        int var1 = class197.field3584 * 128 + 64;
        int var2 = class246.field4321 * 128 + 64;
        int var3 = class287.method1968(class277.field4948, var2, var1, (byte) 101) - class2.field31;
        if (class156.field2873 >= 100) {
            class2.field29 = class197.field3584 * 128 + 64;
            class269.field4853 = class246.field4321 * 128 + 64;
            class10.field140 = class287.method1968(class277.field4948, class269.field4853, class2.field29, (byte) 127) - class2.field31;
        } else {
            if (var1 > class2.field29) {
                class2.field29 += (var1 - class2.field29) * class156.field2873 / 1000 + class273.field4903;
                if (class2.field29 > var1) {
                    class2.field29 = var1;
                }
            }
            if (class10.field140 < var3) {
                class10.field140 += (var3 - class10.field140) * class156.field2873 / 1000 + class273.field4903;
                if (class10.field140 > var3) {
                    class10.field140 = var3;
                }
            }
            if (class269.field4853 < var2) {
                class269.field4853 += (var2 - class269.field4853) * class156.field2873 / 1000 + class273.field4903;
                if (var2 < class269.field4853) {
                    class269.field4853 = var2;
                }
            }
            if (var3 < class10.field140) {
                class10.field140 -= (class10.field140 - var3) * class156.field2873 / 1000 + class273.field4903;
                if (var3 > class10.field140) {
                    class10.field140 = var3;
                }
            }
            if (class269.field4853 > var2) {
                class269.field4853 -= (class269.field4853 - var2) * class156.field2873 / 1000 + class273.field4903;
                if (class269.field4853 < var2) {
                    class269.field4853 = var2;
                }
            }
            if (class2.field29 > var1) {
                class2.field29 -= (class2.field29 - var1) * class156.field2873 / 1000 + class273.field4903;
                if (class2.field29 < var1) {
                    class2.field29 = var1;
                }
            }
        }
        int var4 = class190.field3414 * 128 + 64;
        int var5 = class243.field4266 * 128 + 64;
        int var6 = class287.method1968(class277.field4948, var4, var5, (byte) -39) - class269.field4844;
        int var7 = var5 - class2.field29;
        int var8 = var4 - class269.field4853;
        int var9 = var6 - class10.field140;
        int var10 = (int) Math.sqrt((double) (var7 * var7 + var8 * var8));
        int var11 = (int) (Math.atan2((double) var9, (double) var10) * 325.949D) & 0x7FF;
        if (arg0 != 127) {
            field4978 = null;
        }
        int var12 = (int) (-325.949D * Math.atan2((double) var8, (double) var7)) & 0x7FF;
        if (var11 < 128) {
            var11 = 128;
        }
        int var13 = var12 - class147.field2646;
        if (var11 > 383) {
            var11 = 383;
        }
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var11 > class186.field3354) {
            class186.field3354 += (var11 - class186.field3354) * class284.field5016 / 1000 + class196.field3512;
            if (var11 < class186.field3354) {
                class186.field3354 = var11;
            }
        }
        if (var11 < class186.field3354) {
            class186.field3354 -= (class186.field3354 - var11) * class284.field5016 / 1000 + class196.field3512;
            if (var11 > class186.field3354) {
                class186.field3354 = var11;
            }
        }
        if (var13 > 0) {
            class147.field2646 += class284.field5016 * var13 / 1000 + class196.field3512;
            class147.field2646 &= 0x7FF;
        }
        if (var13 < 0) {
            class147.field2646 -= class196.field3512 + (-var13 * class284.field5016 / 1000);
            class147.field2646 &= 0x7FF;
        }
        int var14 = var12 - class147.field2646;
        if (var14 > 1024) {
            var14 -= 2048;
        }
        if (var14 < -1024) {
            var14 += 2048;
        }
        if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
            class147.field2646 = var12;
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(I)V")
    public static final void method1923(int arg0) {
        field4977++;
        if (class79.field1476 != null) {
            class79.field1476.method982(false);
        }
        if (class116.field1991 != null) {
            class116.field1991.method982(false);
        }
        if (arg0 != 64) {
            field4981 = null;
        }
    }

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "(B)V")
    public static void method1924(byte arg0) {
        field4978 = null;
        field4984 = null;
        field4981 = null;
        if (arg0 != -51) {
            field4985 = false;
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(IIIII)V")
    public static final void method1925(int arg0, int arg1, int arg2, int arg3, int arg4) {
        for (int var5 = arg3; var5 < class259.field4538; var5++) {
            if (arg1 < class54.field979[var5] + class157.field2887[var5] && (arg1 + arg2) > class54.field979[var5] && arg4 < class41.field645[var5] + class259.field4548[var5] && (arg4 + arg0) > class41.field645[var5]) {
                class94.field1664[var5] = true;
            }
        }
        field4980++;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(ZIII)V")
    public static final void method1926(boolean arg0, int arg1, int arg2, int arg3) {
        if (!arg0) {
            field4981 = null;
        }
        if (class57.field1005 != 0 && arg1 != 0 && class184.field3327 < 50 && arg3 != -1) {
            class18.field276[class184.field3327] = arg3;
            class101.field1776[class184.field3327] = arg1;
            class119.field2048[class184.field3327] = arg2;
            class139.field2542[class184.field3327] = null;
            class157.field2883[class184.field3327] = 0;
            class184.field3327++;
        }
        field4983++;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(BLid;)V")
    public static final void method1927(byte arg0, class149 arg1) {
        field4976++;
        class24 var2 = (class24) class167.field3095.method1140(0);
        if (arg0 > -28) {
            field4985 = true;
        }
        while (var2 != null) {
            if (var2.field363.method1041((byte) -85, arg1)) {
                class269.field4848 = var2;
                return;
            }
            var2 = (class24) class167.field3095.method1127(0);
        }
    }
}
