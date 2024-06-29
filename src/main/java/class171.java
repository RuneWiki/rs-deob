import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public class class171 extends class73 {

    @OriginalMember(owner = "client!bg", name = "C", descriptor = "I")
    public int field3159;

    @OriginalMember(owner = "client!bg", name = "v", descriptor = "I")
    public int field3152;

    @OriginalMember(owner = "client!bg", name = "t", descriptor = "Lli;")
    public static class185 field3150 = class245.method1649("rect_debug=", -82);

    @OriginalMember(owner = "client!bg", name = "z", descriptor = "Lli;")
    public static class185 field3156 = class245.method1649("", 122);

    @OriginalMember(owner = "client!bg", name = "r", descriptor = "I")
    public static int field3148 = 0;

    @OriginalMember(owner = "client!bg", name = "A", descriptor = "I")
    public static volatile int field3157 = 0;

    @OriginalMember(owner = "client!bg", name = "w", descriptor = "Lli;")
    public static class185 field3153 = class245.method1649("Null", -101);

    @OriginalMember(owner = "client!bg", name = "n", descriptor = "I")
    public static int field3144;

    @OriginalMember(owner = "client!bg", name = "o", descriptor = "I")
    public static int field3145;

    @OriginalMember(owner = "client!bg", name = "p", descriptor = "I")
    public static int field3146;

    @OriginalMember(owner = "client!bg", name = "q", descriptor = "I")
    public static int field3147;

    @OriginalMember(owner = "client!bg", name = "s", descriptor = "I")
    public static int field3149;

    @OriginalMember(owner = "client!bg", name = "x", descriptor = "I")
    public static int field3154;

    @OriginalMember(owner = "client!bg", name = "y", descriptor = "I")
    public static int field3155;

    @OriginalMember(owner = "client!bg", name = "B", descriptor = "I")
    public static int field3158;

    @OriginalMember(owner = "client!bg", name = "u", descriptor = "[[[Lk;")
    public static class198[][][] field3151;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(IIIII)V")
    public static final void method1215(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3158++;
        class174 var5 = class249.method1671(10, arg2, (byte) 69);
        if (arg4 != 1000) {
            method1218(116, -15, 17);
        }
        var5.method1233(0);
        var5.field3190 = arg0;
        var5.field3196 = arg1;
        var5.field3186 = arg3;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(B)V")
    public static final void method1216(byte arg0) {
        if (arg0 != -37) {
            method1219(114);
        }
        field3145++;
        class217.field3977.method80(arg0 - 14076);
    }

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "(Z)V")
    public static void method1217(boolean arg0) {
        field3156 = null;
        field3153 = null;
        if (!arg0) {
            field3150 = null;
            field3151 = null;
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(III)V")
    public static final void method1218(int arg0, int arg1, int arg2) {
        int var3 = -3 / ((-arg1 - 78) / 46);
        class59.field1059[arg2] = arg0;
        class92 var4 = (class92) class155.field2930.method195(106, (long) arg2);
        field3149++;
        if (var4 == null) {
            class92 var5 = new class92(class244.method1644((byte) -60) + 500L);
            class155.field2930.method190(var5, (byte) -113, (long) arg2);
        } else {
            var4.field1764 = class244.method1644((byte) -76) + 500L;
        }
    }

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "(I)V")
    public static final void method1219(int arg0) {
        field3146++;
        int var1 = class119.field2179 * 128 + 64;
        int var2 = class134.field2403 * 128 + 64;
        int var3 = class236.method1606(67, var2, var1, class265.field4703) - class207.field3794;
        if (class66.field1151 >= 100) {
            class113.field2039 = class119.field2179 * 128 + 64;
            class268.field4745 = class134.field2403 * 128 + 64;
            class7.field157 = class236.method1606(105, class268.field4745, class113.field2039, class265.field4703) - class207.field3794;
        } else {
            if (class268.field4745 < var2) {
                class268.field4745 += (var2 - class268.field4745) * class66.field1151 / 1000 + class158.field3002;
                if (var2 < class268.field4745) {
                    class268.field4745 = var2;
                }
            }
            if (class113.field2039 < var1) {
                class113.field2039 += class158.field3002 + ((var1 - class113.field2039) * class66.field1151 / 1000);
                if (class113.field2039 > var1) {
                    class113.field2039 = var1;
                }
            }
            if (class7.field157 < var3) {
                class7.field157 += (var3 - class7.field157) * class66.field1151 / 1000 + class158.field3002;
                if (class7.field157 > var3) {
                    class7.field157 = var3;
                }
            }
            if (var2 < class268.field4745) {
                class268.field4745 -= (class268.field4745 - var2) * class66.field1151 / 1000 + class158.field3002;
                if (var2 > class268.field4745) {
                    class268.field4745 = var2;
                }
            }
            if (class7.field157 > var3) {
                class7.field157 -= class158.field3002 + ((class7.field157 - var3) * class66.field1151 / 1000);
                if (var3 > class7.field157) {
                    class7.field157 = var3;
                }
            }
            if (var1 < class113.field2039) {
                class113.field2039 -= class158.field3002 + ((class113.field2039 - var1) * class66.field1151 / 1000);
                if (class113.field2039 < var1) {
                    class113.field2039 = var1;
                }
            }
        }
        int var4 = class252.field4482 * 128 + 64;
        int var5 = class49.field807 * 128 + 64;
        int var6 = class236.method1606(106, var4, var5, class265.field4703) - class148.field2798;
        int var7 = var5 - class113.field2039;
        int var8 = var4 - class268.field4745;
        int var9 = var6 - class7.field157;
        int var10 = (int) Math.sqrt((double) (var7 * var7 + (var8 * var8)));
        int var11 = (int) (Math.atan2((double) var9, (double) var10) * 325.949D) & 0x7FF;
        if (var11 < 128) {
            var11 = 128;
        }
        if (var11 > 383) {
            var11 = 383;
        }
        int var12 = (int) (-325.949D * Math.atan2((double) var7, (double) var8)) & 0x7FF;
        if (var11 > class136.field2550) {
            class136.field2550 += (var11 - class136.field2550) * class32.field526 / 1000 + class119.field2182;
            if (class136.field2550 > var11) {
                class136.field2550 = var11;
            }
        }
        if (class136.field2550 > var11) {
            class136.field2550 -= (class136.field2550 - var11) * class32.field526 / 1000 + class119.field2182;
            if (var11 > class136.field2550) {
                class136.field2550 = var11;
            }
        }
        int var13 = var12 - class3.field69;
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var13 > 0) {
            class3.field69 += class119.field2182 + (class32.field526 * var13 / 1000);
            class3.field69 &= 0x7FF;
        }
        if (var13 < 0) {
            class3.field69 -= class119.field2182 + (-var13 * class32.field526 / 1000);
            class3.field69 &= 0x7FF;
        }
        int var14 = var12 - class3.field69;
        if (var14 > 1024) {
            var14 -= 2048;
        }
        int var15 = 87 / ((33 - arg0) / 62);
        if (var14 < -1024) {
            var14 += 2048;
        }
        if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
            class3.field69 = var12;
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(IIIBI)V")
    public static final void method1220(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        if (arg2 <= arg1) {
            for (int var5 = arg2; var5 < arg1; var5++) {
                class145.field2757[var5][arg0] = arg4;
            }
        } else {
            for (int var6 = arg1; var6 < arg2; var6++) {
                class145.field2757[var6][arg0] = arg4;
            }
        }
        if (arg3 >= 117) {
            field3147++;
        }
    }

    @OriginalMember(owner = "client!bg", name = "<init>", descriptor = "(II)V")
    public class171(int arg0, int arg1) {
        this.field3159 = arg1;
        this.field3152 = arg0;
    }
}
