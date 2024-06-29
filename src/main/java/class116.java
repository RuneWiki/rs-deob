import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public class class116 {

    @OriginalMember(owner = "client!la", name = "b", descriptor = "J")
    public static long field2064 = 0L;

    @OriginalMember(owner = "client!la", name = "h", descriptor = "I")
    public static int field2070 = 3353893;

    @OriginalMember(owner = "client!la", name = "l", descriptor = "Lli;")
    public static class185 field2074 = class245.method1649("OK", -37);

    @OriginalMember(owner = "client!la", name = "k", descriptor = "[I")
    public static int[] field2073 = new int[5];

    @OriginalMember(owner = "client!la", name = "c", descriptor = "Lli;")
    private static class185 field2065 = class245.method1649("Loaded textures", 125);

    @OriginalMember(owner = "client!la", name = "i", descriptor = "Lli;")
    private static class185 field2071 = class245.method1649("glow2:", -98);

    @OriginalMember(owner = "client!la", name = "a", descriptor = "Lli;")
    public static class185 field2063 = field2065;

    @OriginalMember(owner = "client!la", name = "d", descriptor = "Lli;")
    public static class185 field2066 = field2071;

    @OriginalMember(owner = "client!la", name = "e", descriptor = "Lli;")
    public static class185 field2067 = field2071;

    @OriginalMember(owner = "client!la", name = "f", descriptor = "I")
    public static int field2068;

    @OriginalMember(owner = "client!la", name = "g", descriptor = "I")
    public static int field2069;

    @OriginalMember(owner = "client!la", name = "j", descriptor = "I")
    public static int field2072;

    @OriginalMember(owner = "client!la", name = "m", descriptor = "I")
    public static int field2075;

    @OriginalMember(owner = "client!la", name = "n", descriptor = "I")
    public static int field2076;

    @OriginalMember(owner = "client!la", name = "o", descriptor = "I")
    public static int field2077;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Lhi;I)V")
    public static final void method804(class250 arg0, int arg1) {
        if (arg1 != -25975) {
            method811((byte) 87);
        }
        field2076++;
        class187.field3472 = arg0;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(II)Lp;")
    public static final class82 method805(int arg0, int arg1) {
        field2069++;
        int var2 = arg1 >> 16;
        int var3 = arg1 & 0xFFFF;
        if (class136.field2557[var2] == null || class136.field2557[var2][var3] == null) {
            boolean var4 = class127.method912(var2, (byte) -110);
            if (!var4) {
                return null;
            }
        }
        return arg0 == 1 ? class136.field2557[var2][var3] : null;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIIII)V")
    public static final void method806(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class32.field526 = arg0;
        class119.field2182 = arg1;
        class148.field2798 = arg4;
        class252.field4482 = arg5;
        class49.field807 = arg3;
        if (class32.field526 >= 100) {
            int var6 = class252.field4482 * 128 + 64;
            int var7 = class49.field807 * 128 + 64;
            int var8 = class236.method1606(116, var6, var7, class265.field4703) - class148.field2798;
            int var9 = var7 - class113.field2039;
            int var10 = var6 - class268.field4745;
            int var11 = var8 - class7.field157;
            int var12 = (int) Math.sqrt((double) (var9 * var9 + var10 * var10));
            class136.field2550 = (int) (Math.atan2((double) var11, (double) var12) * 325.949D) & 0x7FF;
            class3.field69 = (int) (-325.949D * Math.atan2((double) var9, (double) var10)) & 0x7FF;
            if (class136.field2550 < 128) {
                class136.field2550 = 128;
            }
            if (class136.field2550 > 383) {
                class136.field2550 = 383;
            }
        }
        if (arg2 != 2047) {
            field2065 = null;
        }
        field2077++;
        class211.field3848 = 2;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(III)Lfd;")
    public static final class206 method807(int arg0, int arg1, int arg2) {
        class198 var3 = class153.field2896[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class206 var4 = var3.field3640;
            var3.field3640 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "()V")
    public static final void method808() {
        if (class264.field4687 != null) {
            for (int var0 = 0; var0 < class264.field4687.length; var0++) {
                for (int var1 = 0; var1 < class264.field4685; var1++) {
                    for (int var2 = 0; var2 < class122.field2214; var2++) {
                        class264.field4687[var0][var1][var2] = null;
                    }
                }
            }
        }
        if (class171.field3151 != null) {
            for (int var3 = 0; var3 < class171.field3151.length; var3++) {
                for (int var4 = 0; var4 < class264.field4685; var4++) {
                    for (int var5 = 0; var5 < class122.field2214; var5++) {
                        class171.field3151[var3][var4][var5] = null;
                    }
                }
            }
        }
        class156.field2968 = 0;
        if (class113.field2038 != null) {
            for (int var6 = 0; var6 < class156.field2968; var6++) {
                class113.field2038[var6] = null;
            }
        }
        if (class281.field4969 != null) {
            for (int var7 = 0; var7 < class276.field4884; var7++) {
                class281.field4969[var7] = null;
            }
            class276.field4884 = 0;
        }
        if (class182.field3345 != null) {
            for (int var8 = 0; var8 < class182.field3345.length; var8++) {
                class182.field3345[var8] = null;
            }
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(ILp;Z)V")
    public static final void method809(int arg0, class82 arg1, boolean arg2) {
        field2075++;
        int var3 = arg1.field1552 == 0 ? arg1.field1498 : arg1.field1552;
        int var4 = arg1.field1628 == 0 ? arg1.field1505 : arg1.field1628;
        if (arg0 != 1815818576) {
            method806(-29, -69, 6, -92, -93, -22);
        }
        class60.method422((byte) -97, class136.field2557[arg1.field1579 >> 16], arg1.field1579, arg2, var4, var3);
        if (arg1.field1536 != null) {
            class60.method422((byte) -126, arg1.field1536, arg1.field1579, arg2, var4, var3);
        }
        class271 var5 = (class271) class87.field1715.method195(40, (long) arg1.field1579);
        if (var5 != null) {
            class25.method168(25079, var4, arg2, var3, var5.field4811);
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(I)Lli;")
    public static final class185 method810(int arg0) {
        class185 var1;
        if (class187.field3471 == 1 && class127.field2283 < 2) {
            var1 = class87.method567(-11039, new class185[] { class32.field523, class224.field4107, class264.field4689, class122.field2218 });
        } else if (class254.field4504 && class127.field2283 < 2) {
            var1 = class87.method567(-11039, new class185[] { class102.field1856, class224.field4107, class110.field1980, class122.field2218 });
        } else if (class227.field4137 && class139.field2615[81] && class127.field2283 > 2) {
            var1 = class269.method1824((byte) 124, class127.field2283 - 2);
        } else {
            var1 = class269.method1824((byte) 122, class127.field2283 - 1);
        }
        if (arg0 >= -103) {
            field2064 = 29L;
        }
        field2068++;
        if (class127.field2283 > 2) {
            var1 = class87.method567(-11039, new class185[] { var1, class44.field704, class90.method591(class127.field2283 - 2, 0), class257.field4583 });
        }
        return var1;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(B)V")
    public static void method811(byte arg0) {
        field2067 = null;
        if (arg0 != -19) {
            field2073 = null;
        }
        field2071 = null;
        field2066 = null;
        field2063 = null;
        field2065 = null;
        field2073 = null;
        field2074 = null;
    }

    @OriginalMember(owner = "client!la", name = "b", descriptor = "(II)Z")
    public static final boolean method812(int arg0, int arg1) {
        field2072++;
        if (arg1 != 2) {
            method805(-45, 69);
        }
        return arg0 >= 48 && arg0 <= 57;
    }
}
