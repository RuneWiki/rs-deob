import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public abstract class class31 {

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "Lmb;")
    public static class132 field479 = class166.method1092(")1j", 118);

    @OriginalMember(owner = "client!ch", name = "g", descriptor = "Lmb;")
    private static class132 field484 = class166.method1092("Login", 122);

    @OriginalMember(owner = "client!ch", name = "h", descriptor = "[J")
    public static long[] field485 = new long[256];

    @OriginalMember(owner = "client!ch", name = "i", descriptor = "Lmb;")
    public static class132 field486 = field484;

    @OriginalMember(owner = "client!ch", name = "f", descriptor = "I")
    public static int field483 = -1;

    @OriginalMember(owner = "client!ch", name = "k", descriptor = "[S")
    public static short[] field488;

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "I")
    public static int field478;

    @OriginalMember(owner = "client!ch", name = "c", descriptor = "I")
    public static int field480;

    @OriginalMember(owner = "client!ch", name = "d", descriptor = "I")
    public static int field481;

    @OriginalMember(owner = "client!ch", name = "e", descriptor = "I")
    public static int field482;

    @OriginalMember(owner = "client!ch", name = "j", descriptor = "I")
    public static int field487;

    @OriginalMember(owner = "client!ch", name = "l", descriptor = "Lpb;")
    public static class165 field489;

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIB[I[BIIIIII)V")
    public static final void method219(int arg0, int arg1, byte arg2, int[] arg3, byte[] arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        int var11 = ((arg1 & 0xFF00FF) * arg8 & 0xFF00FF00) + ((arg1 & 0xFF00) * arg8 & 0xFF0000) >> 8;
        field487++;
        int var12 = 256 - arg8;
        if (arg2 >= -29) {
            method227(-37);
        }
        for (int var13 = -arg0; var13 < 0; var13++) {
            for (int var14 = -arg9; var14 < 0; var14++) {
                if (arg4[arg10++] == 0) {
                    arg5++;
                } else {
                    int var15 = arg3[arg5];
                    arg3[arg5++] = var11 + (class75.method450(16711680, var12 * class75.method450(var15, 65280)) + class75.method450(-16711936, var12 * class75.method450(16711935, var15)) >> 8);
                }
            }
            arg10 += arg6;
            arg5 += arg7;
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(BLjava/awt/Component;)V")
    public abstract void method220(byte arg0, Component arg1);

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(Lii;I)V")
    public static final void method221(class96 arg0, int arg1) {
        field480++;
        int var2 = arg0.field1805;
        if (var2 == 324) {
            if (class219.field3999 == -1) {
                class219.field3999 = arg0.field1799;
                class52.field885 = arg0.field1808;
            }
            if (class32.field493.field869) {
                arg0.field1799 = class219.field3999;
            } else {
                arg0.field1799 = class52.field885;
            }
            return;
        }
        if (arg1 != 17998) {
            method219(105, 6, (byte) 112, null, null, 126, 73, 23, -55, 33, 56);
        }
        if (var2 == 325) {
            if (class219.field3999 == -1) {
                class52.field885 = arg0.field1808;
                class219.field3999 = arg0.field1799;
            }
            if (class32.field493.field869) {
                arg0.field1799 = class52.field885;
            } else {
                arg0.field1799 = class219.field3999;
            }
        } else if (var2 == 327) {
            arg0.field1750 = 150;
            arg0.field1741 = (int) (Math.sin((double) class30.field460 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field1780 = -1;
            arg0.field1734 = 5;
        } else if (var2 == 328) {
            if (class210.field3854.field2877 == null) {
                arg0.field1780 = 0;
            } else {
                arg0.field1750 = 150;
                arg0.field1741 = (int) (Math.sin((double) class30.field460 / 40.0D) * 256.0D) & 0x7FF;
                arg0.field1734 = 5;
                arg0.field1780 = ((int) class210.field3854.field2877.method867(-27410) << 11) + 2047;
                arg0.field1710 = class210.field3854.field737;
                arg0.field1758 = class210.field3854.field693;
            }
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(I)V")
    public static final void method222(int arg0) {
        if (arg0 <= 93) {
            return;
        }
        int var1 = class157.field2858 - (int) ((double) class218.field3984.field1830 / class151.field2765);
        int var2 = class157.field2858 + (int) ((double) class218.field3984.field1830 / class151.field2765);
        if (var1 < 0) {
            class196.field3641 = -1;
            class157.field2858 = (int) ((double) class218.field3984.field1830 / class151.field2765);
            class210.field3862 = -1;
        }
        field478++;
        int var3 = (int) ((double) class218.field3984.field1740 / class151.field2765) + class56.field953;
        int var4 = class56.field953 - (int) ((double) class218.field3984.field1740 / class151.field2765);
        if (class192.field3586 < var2) {
            class210.field3862 = -1;
            class196.field3641 = -1;
            class157.field2858 = class192.field3586 - (int) ((double) class218.field3984.field1830 / class151.field2765);
        }
        if (var4 < 0) {
            class56.field953 = (int) ((double) class218.field3984.field1740 / class151.field2765);
            class210.field3862 = -1;
            class196.field3641 = -1;
        }
        if (var3 > class113.field2188) {
            class210.field3862 = -1;
            class196.field3641 = -1;
            class56.field953 = class113.field2188 - (int) ((double) class218.field3984.field1740 / class151.field2765);
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public abstract void method223(int arg0, Component arg1);

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(B)V")
    public static final void method224(byte arg0) {
        class171.field3191 = null;
        field482++;
        class116.field2228 = null;
        if (arg0 >= 22) {
            class36.field593 = null;
        }
    }

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "(I)I")
    public abstract int method225(int arg0);

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIIIIB)V")
    public static final void method226(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        class82.field1378[0].method530(arg1, arg2);
        field481++;
        int var6 = (arg0 - 32) * arg0 / arg3;
        class82.field1378[1].method530(arg1, arg2 + arg0 - 16);
        if (var6 < 8) {
            var6 = 8;
        }
        int var7 = (arg0 - var6 - 32) * arg4 / (arg3 - arg0);
        class239.method1525(arg1, arg2 + 16, 16, arg0 - 32, class210.field3856);
        if (arg5 < 59) {
            field485 = null;
        }
        class239.method1525(arg1, arg2 + var7 + 16, 16, var6, class122.field2282);
        class239.method1529(arg1, arg2 + var7 + 16, var6, class41.field660);
        class239.method1529(arg1 + 1, arg2 + 16 + var7, var6, class41.field660);
        class239.method1512(arg1, arg2 + var7 + 16, 16, class41.field660);
        class239.method1512(arg1, arg2 + var7 + 17, 16, class41.field660);
        class239.method1529(arg1 + 15, arg2 + 16 + var7, var6, class183.field3374);
        class239.method1529(arg1 + 14, var7 + 17 + arg2, var6 - 1, class183.field3374);
        class239.method1512(arg1, arg2 + var6 + var7 + 15, 16, class183.field3374);
        class239.method1512(arg1 + 1, arg2 + 14 + var7 + var6, 15, class183.field3374);
    }

    @OriginalMember(owner = "client!ch", name = "c", descriptor = "(I)V")
    public static void method227(int arg0) {
        field488 = null;
        field485 = null;
        field484 = null;
        if (arg0 == -17363) {
            field479 = null;
            field486 = null;
            field489 = null;
        }
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            long var1 = (long) var0;
            for (int var3 = 0; var3 < 8; var3++) {
                if ((var1 & 0x1L) == 1L) {
                    var1 = var1 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field485[var0] = var1;
        }
        field488 = new short[500];
    }
}
