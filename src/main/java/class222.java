import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public class class222 extends class89 {

    @OriginalMember(owner = "client!uh", name = "o", descriptor = "[B")
    public byte[] field4091;

    @OriginalMember(owner = "client!uh", name = "m", descriptor = "Lqe;")
    private static class179 field4089 = class206.method1380("Loading interfaces )2 ", (byte) -128);

    @OriginalMember(owner = "client!uh", name = "s", descriptor = "Lqe;")
    public static class179 field4095 = field4089;

    @OriginalMember(owner = "client!uh", name = "u", descriptor = "[I")
    public static int[] field4097 = new int[1000];

    @OriginalMember(owner = "client!uh", name = "w", descriptor = "I")
    public static volatile int field4099 = 0;

    @OriginalMember(owner = "client!uh", name = "p", descriptor = "I")
    public static int field4092;

    @OriginalMember(owner = "client!uh", name = "q", descriptor = "I")
    public static int field4093;

    @OriginalMember(owner = "client!uh", name = "r", descriptor = "I")
    public static int field4094;

    @OriginalMember(owner = "client!uh", name = "t", descriptor = "I")
    public static int field4096;

    @OriginalMember(owner = "client!uh", name = "x", descriptor = "I")
    public static int field4100;

    @OriginalMember(owner = "client!uh", name = "y", descriptor = "I")
    public static int field4101;

    @OriginalMember(owner = "client!uh", name = "v", descriptor = "Lpc;")
    public static class166 field4098;

    @OriginalMember(owner = "client!uh", name = "n", descriptor = "Ljava/lang/String;")
    public static String field4090;

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(IZIIII)V")
    public static final void method1438(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        field4100++;
        if (arg1) {
            field4097 = null;
        }
        if (arg2 >= class235.field4336 && arg3 <= class40.field869 && arg4 >= class168.field3037 && class70.field1403 >= arg5) {
            class186.method1257(arg4, arg0, arg5, arg3, arg2, 100);
        } else {
            class151.method966(arg3, arg0, 0, arg4, arg5, arg2);
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(II)V")
    public static final void method1439(int arg0, int arg1) {
        if (arg0 != 18934) {
            return;
        }
        if (arg1 == 37) {
            class55.field1218 = 3.0D;
        } else if (arg1 == 50) {
            class55.field1218 = 4.0D;
        } else if (arg1 == 75) {
            class55.field1218 = 6.0D;
        } else {
            class55.field1218 = 8.0D;
        }
        field4093++;
        class139.field2570 = -1;
        class139.field2570 = -1;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(Z)V")
    public static final void method1440(boolean arg0) {
        field4094++;
        if (!arg0 && class98.field1828 != null) {
            class48 var1 = class98.field1828;
            synchronized (class98.field1828) {
                class98.field1828 = null;
            }
        }
    }

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "(Z)V")
    public static final void method1441(boolean arg0) {
        field4101++;
        int var1 = class19.field500 * 128 + 64;
        int var2 = class127.field2328 * 128 + 64;
        int var3 = class202.method1341(-114, var1, class49.field1038, var2) - class88.field1680;
        if (class225.field4177 < var3) {
            class225.field4177 += (var3 - class225.field4177) * class58.field1254 / 1000 + class62.field1311;
            if (var3 < class225.field4177) {
                class225.field4177 = var3;
            }
        }
        if (var1 > class22.field538) {
            class22.field538 += (var1 - class22.field538) * class58.field1254 / 1000 + class62.field1311;
            if (class22.field538 > var1) {
                class22.field538 = var1;
            }
        }
        if (var2 > class198.field3700) {
            class198.field3700 += (var2 - class198.field3700) * class58.field1254 / 1000 + class62.field1311;
            if (var2 < class198.field3700) {
                class198.field3700 = var2;
            }
        }
        if (var2 < class198.field3700) {
            class198.field3700 -= class62.field1311 + (class198.field3700 - var2) * class58.field1254 / 1000;
            if (var2 > class198.field3700) {
                class198.field3700 = var2;
            }
        }
        if (class225.field4177 > var3) {
            class225.field4177 -= class62.field1311 + (class225.field4177 - var3) * class58.field1254 / 1000;
            if (var3 > class225.field4177) {
                class225.field4177 = var3;
            }
        }
        int var4 = class178.field3231 * 128 + 64;
        if (var1 < class22.field538) {
            class22.field538 -= (class22.field538 - var1) * class58.field1254 / 1000 + class62.field1311;
            if (class22.field538 < var1) {
                class22.field538 = var1;
            }
        }
        if (arg0) {
            field4097 = null;
        }
        int var5 = class23.field555 * 128 + 64;
        int var6 = class202.method1341(-77, var5, class49.field1038, var4) - class148.field2675;
        int var7 = var5 - class22.field538;
        int var8 = var4 - class198.field3700;
        int var9 = var6 - class225.field4177;
        int var10 = (int) Math.sqrt((double) (var7 * var7 + var8 * var8));
        int var11 = (int) (Math.atan2((double) var9, (double) var10) * 325.949D) & 0x7FF;
        if (var11 < 128) {
            var11 = 128;
        }
        int var12 = (int) (-325.949D * Math.atan2((double) var7, (double) var8)) & 0x7FF;
        if (var11 > 383) {
            var11 = 383;
        }
        if (class18.field480 < var11) {
            class18.field480 += (var11 - class18.field480) * class147.field2659 / 1000 + class194.field3622;
            if (var11 < class18.field480) {
                class18.field480 = var11;
            }
        }
        if (class18.field480 > var11) {
            class18.field480 -= (class18.field480 - var11) * class147.field2659 / 1000 + class194.field3622;
            if (var11 > class18.field480) {
                class18.field480 = var11;
            }
        }
        int var13 = var12 - class61.field1300;
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var13 > 0) {
            class61.field1300 += class147.field2659 * var13 / 1000 + class194.field3622;
            class61.field1300 &= 0x7FF;
        }
        if (var13 < 0) {
            class61.field1300 -= -var13 * class147.field2659 / 1000 + class194.field3622;
            class61.field1300 &= 0x7FF;
        }
        int var14 = var12 - class61.field1300;
        if (var14 > 1024) {
            var14 -= 2048;
        }
        if (var14 < -1024) {
            var14 += 2048;
        }
        if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
            class61.field1300 = var12;
        }
    }

    @OriginalMember(owner = "client!uh", name = "<init>", descriptor = "([B)V")
    public class222(byte[] arg0) {
        this.field4091 = arg0;
    }

    @OriginalMember(owner = "client!uh", name = "c", descriptor = "(B)V")
    public static final void method1442(byte arg0) {
        field4092++;
        if (arg0 != 57) {
            return;
        }
        if (class1.field13.toLowerCase().indexOf("microsoft") != -1) {
            class39.field830[219] = 42;
            class39.field830[188] = 71;
            class39.field830[222] = 59;
            class39.field830[220] = 74;
            class39.field830[190] = 72;
            class39.field830[189] = 26;
            class39.field830[192] = 58;
            class39.field830[187] = 27;
            class39.field830[186] = 57;
            class39.field830[191] = 73;
            class39.field830[223] = 28;
            class39.field830[221] = 43;
            return;
        }
        if (class1.field15 == null) {
            class39.field830[192] = 58;
            class39.field830[222] = 59;
        } else {
            class39.field830[192] = 28;
            class39.field830[222] = 58;
            class39.field830[520] = 59;
        }
        class39.field830[91] = 42;
        class39.field830[46] = 72;
        class39.field830[59] = 57;
        class39.field830[92] = 74;
        class39.field830[45] = 26;
        class39.field830[44] = 71;
        class39.field830[93] = 43;
        class39.field830[47] = 73;
        class39.field830[61] = 27;
    }

    @OriginalMember(owner = "client!uh", name = "d", descriptor = "(B)V")
    public static void method1443(byte arg0) {
        field4097 = null;
        field4095 = null;
        field4090 = null;
        field4089 = null;
        field4098 = null;
        if (arg0 < 92) {
            field4097 = null;
        }
    }
}
