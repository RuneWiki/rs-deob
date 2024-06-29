import nativeadvert.browsercontrol;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class134 extends class209 {

    @OriginalMember(owner = "client!ca", name = "x", descriptor = "I")
    public int field2092 = 0;

    @OriginalMember(owner = "client!ca", name = "w", descriptor = "I")
    public static int field2091 = 0;

    @OriginalMember(owner = "client!ca", name = "z", descriptor = "I")
    public static int field2094 = 0;

    @OriginalMember(owner = "client!ca", name = "G", descriptor = "Luf;")
    public static class168 field2101 = class148.method1019(-1720, "null");

    @OriginalMember(owner = "client!ca", name = "H", descriptor = "I")
    public static int field2102 = -1;

    @OriginalMember(owner = "client!ca", name = "y", descriptor = "I")
    public static int field2093;

    @OriginalMember(owner = "client!ca", name = "A", descriptor = "I")
    public static int field2095;

    @OriginalMember(owner = "client!ca", name = "B", descriptor = "I")
    public static int field2096;

    @OriginalMember(owner = "client!ca", name = "C", descriptor = "I")
    public static int field2097;

    @OriginalMember(owner = "client!ca", name = "D", descriptor = "I")
    public static int field2098;

    @OriginalMember(owner = "client!ca", name = "E", descriptor = "I")
    public static int field2099;

    @OriginalMember(owner = "client!ca", name = "F", descriptor = "I")
    public static int field2100;

    @OriginalMember(owner = "client!ca", name = "J", descriptor = "I")
    public static int field2104;

    @OriginalMember(owner = "client!ca", name = "K", descriptor = "I")
    public static int field2105;

    @OriginalMember(owner = "client!ca", name = "I", descriptor = "Lfj;")
    public static class283 field2103;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IIIIIIII)V", line = 6)
    public static final void method932(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2104++;
        if (arg6 < 128 || arg5 < 128 || arg6 > 13056 || arg5 > 13056) {
            class234.field3758 = -1;
            class95.field1521 = -1;
            return;
        }
        int var8 = class62.method349(128, class79.field1127, arg5, arg6) - arg7;
        int var9 = class173.field2812[class105.field1624];
        int var10 = class173.field2818[class288.field4847];
        int var11 = arg5 - class157.field2483;
        if (arg0 >= -64) {
            return;
        }
        int var12 = class173.field2812[class288.field4847];
        int var13 = class173.field2818[class105.field1624];
        int var14 = arg6 - class248.field4249;
        int var15 = var8 - class143.field2208;
        int var16 = var10 * var14 + var11 * var12 >> 16;
        int var17 = var10 * var11 - (var12 * var14) >> 16;
        int var19 = var13 * var15 - (var9 * var17) >> 16;
        int var20 = var9 * var15 + var13 * var17 >> 16;
        if (var20 < 50) {
            class234.field3758 = -1;
            class95.field1521 = -1;
        } else {
            int var22 = arg2 * 512 >> 8;
            class95.field1521 = var16 * var22 / var20 + arg4;
            int var23 = arg1 * 512 >> 8;
            class234.field3758 = var19 * var23 / var20 + arg3;
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(Lj;Z)V", line = 73)
    public final void method933(class153 arg0, boolean arg1) {
        while (true) {
            int var3 = arg0.method1042((byte) 88);
            if (var3 == 0) {
                if (!arg1) {
                    method941(86);
                }
                field2105++;
                return;
            }
            this.method937(-1, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(Luf;I)I", line = 90)
    public static final int method934(class168 arg0, int arg1) {
        field2095++;
        if (arg0 == null) {
            return -1;
        }
        for (int var2 = 0; var2 < class107.field1642; var2++) {
            if (arg0.method1194(class142.field2192[var2], -26023)) {
                return var2;
            }
        }
        if (arg1 == -1) {
            return -1;
        } else {
            return 89;
        }
    }

    @OriginalMember(owner = "client!ca", name = "d", descriptor = "(B)V", line = 118)
    public static final void method935(byte arg0) {
        if ((class15.field149 < class175.field2836)) {
            class15.field149 = (float) ((double) class15.field149 / 30.0D + (double) class15.field149);
            if (class175.field2836 < class15.field149) {
                class15.field149 = class175.field2836;
            }
            class162.method1145((byte) -116);
        } else if (class15.field149 > class175.field2836) {
            class15.field149 = (float) ((double) class15.field149 - (double) class15.field149 / 30.0D);
            if (class175.field2836 > class15.field149) {
                class15.field149 = class175.field2836;
            }
            class162.method1145((byte) -127);
        }
        if (class238.field3846 != -1 && class148.field2293 != -1) {
            int var1 = class238.field3846 - class291.field4895;
            if (var1 < 2 || var1 > 2) {
                var1 >>= 0x4;
            }
            int var2 = class148.field2293 - class274.field4602;
            if (var2 < 2 || var2 > 2) {
                var2 >>= 0x4;
            }
            class274.field4602 += var2;
            class291.field4895 += var1;
            if (var1 == 0 && var2 == 0) {
                class238.field3846 = -1;
                class148.field2293 = -1;
            }
            class162.method1145((byte) -107);
        }
        field2100++;
        if (arg0 != 19) {
            field2091 = 61;
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(Ldk;II)Lpl;", line = 203)
    public static final class261 method936(class241 arg0, int arg1, int arg2) {
        field2096++;
        if (arg1 != -17662) {
            field2101 = (class168) null;
        }
        byte[] var3 = arg0.method1645(true, arg2);
        return var3 == null ? null : new class261(var3);
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IILj;)V", line = 218)
    private final void method937(int arg0, int arg1, class153 arg2) {
        if (arg0 != -1) {
            method941(-63);
        }
        if (arg1 == 2) {
            this.field2092 = arg2.method1069(arg0 + 72);
        }
        field2099++;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(B[Luf;)Luf;", line = 241)
    public static final class168 method938(byte arg0, class168[] arg1) {
        field2097++;
        if (arg0 > -122) {
            method932(-43, 127, 4, 3, 9, 77, 72, 50);
        }
        if (arg1.length < 2) {
            throw new IllegalArgumentException();
        }
        return class284.method1964(0, arg1, (byte) -127, arg1.length);
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(ILdk;ZLdk;)V", line = 263)
    public static final void method939(int arg0, class241 arg1, boolean arg2, class241 arg3) {
        class44.field541 = arg3;
        class25.field299 = arg2;
        field2098++;
        class99.field1550 = arg1;
        if (arg0 != 128) {
            field2094 = -101;
        }
    }

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "(I)V", line = 276)
    public static void method940(int arg0) {
        field2101 = null;
        field2103 = null;
        if (arg0 <= 77) {
            field2091 = 127;
        }
    }

    @OriginalMember(owner = "client!ca", name = "d", descriptor = "(I)V", line = 302)
    public static final void method941(int arg0) {
        class90.method611();
        field2093++;
        if (browsercontrol.iscreated()) {
            browsercontrol.hide();
        }
        class249.method1711(class189.field3023, -1477252336);
        class196.method1385(-1, class189.field3023);
        if (class31.field382 != null) {
            class31.field382.method333(class189.field3023, false);
        }
        class85.method587((byte) 118);
        class48.method258((byte) -52, class189.field3023);
        class127.method896(0, class189.field3023);
        if (class31.field382 != null) {
            class31.field382.method332(class189.field3023, 21014);
        }
        class6.method23(125);
        if (arg0 < 30) {
            field2094 = -2;
        }
        class90.method618(class189.field3023, class161.field2599 * 2);
        class61.method340(true);
        class55.method303(0);
        class233.field3742 = 0L;
    }
}
