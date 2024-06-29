import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public abstract class class242 {

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "Ler;")
    public static class157 field3402 = new class157(8);

    @OriginalMember(owner = "client!mc", name = "f", descriptor = "Z")
    public static boolean field3405 = false;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "I")
    public static int field3400;

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "I")
    public static int field3401;

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "I")
    public static int field3403;

    @OriginalMember(owner = "client!mc", name = "e", descriptor = "I")
    public static int field3404;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(ILap;I)V")
    public static final void method1614(int arg0, class337 arg1, int arg2) {
        if (arg2 != -1536) {
            method1616(null, 120);
        }
        field3403++;
        int var3 = -1;
        int var4 = 0;
        if (class405.field6116 < arg1.field5285) {
            class485.method2894(arg1, 38);
        } else if (arg1.field5264 < class405.field6116) {
            class526.method3115(false, arg1, true);
            var4 = class321.field4915;
            var3 = class269.field3733;
        } else {
            class275.method1746(arg1, (byte) -69);
        }
        if (arg1.field2217 < 128 || arg1.field2215 < 128 || (class96.field1403 * 128 - 128) <= arg1.field2217 || arg1.field2215 >= (class485.field7122 * 128 - 128)) {
            arg1.field5240 = -1;
            arg1.field5285 = 0;
            arg1.field5260 = -1;
            var4 = 0;
            var3 = -1;
            arg1.field5304 = -1;
            arg1.field5264 = 0;
            arg1.field2217 = arg1.field5339[0] * 128 + arg1.method2091(arg2 - 13709) * 64;
            arg1.field2215 = arg1.field5344[0] * 128 + arg1.method2091(-15245) * 64;
            arg1.method2179(false);
        }
        if (class339.field5365 == arg1 && (arg1.field2217 < 1536 || arg1.field2215 < 1536 || arg1.field2217 >= (class96.field1403 * 128 - 1536) || class485.field7122 * 128 - 1536 <= arg1.field2215)) {
            var4 = 0;
            arg1.field5264 = 0;
            arg1.field5285 = 0;
            arg1.field5304 = -1;
            arg1.field5260 = -1;
            arg1.field5240 = -1;
            var3 = -1;
            arg1.field2217 = arg1.field5339[0] * 128 + arg1.method2091(-15245) * 64;
            arg1.field2215 = arg1.field5344[0] * 128 + (arg1.method2091(-15245) * 64);
            arg1.method2179(false);
        }
        int var5 = class10.method86(6402, arg1);
        class44.method340(var3, var5, arg1, -3, var4);
        class437.method2615(arg1, (byte) 108);
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(B)V")
    public static void method1615(byte arg0) {
        if (arg0 == 79) {
            field3402 = null;
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lqa;I)V")
    public static final void method1616(class496 arg0, int arg1) {
        field3404++;
        if (arg1 != 269555143) {
            field3402 = null;
        }
        if (class455.field6680) {
            class355.method2240((byte) 115, arg0);
        } else {
            class392.method2409(-49, arg0);
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lrk;IBILeu;ILbp;I)V")
    public static final void method1617(class194 arg0, int arg1, byte arg2, int arg3, class130 arg4, int arg5, class322 arg6, int arg7) {
        field3400++;
        if (arg2 >= -42) {
            return;
        }
        class119 var8 = new class119();
        var8.field1680 = arg3 << 7;
        var8.field1669 = arg1 << 7;
        var8.field1673 = arg7;
        if (arg4 != null) {
            var8.field1678 = arg4;
            int var9 = arg4.field1843;
            int var10 = arg4.field1898;
            if (arg5 == 1 || arg5 == 3) {
                var10 = arg4.field1843;
                var9 = arg4.field1898;
            }
            var8.field1675 = arg4.field1824;
            var8.field1676 = arg4.field1906 << 7;
            var8.field1668 = arg1 + var9 << 7;
            var8.field1666 = arg3 + var10 << 7;
            var8.field1664 = arg4.field1859;
            var8.field1682 = arg4.field1871;
            var8.field1671 = arg4.field1829;
            var8.field1661 = arg4.field1850;
            if (arg4.field1823 != null) {
                var8.field1672 = true;
                var8.method768(-30867);
            }
            if (var8.field1661 != null) {
                var8.field1685 = (int) (Math.random() * (double) (var8.field1675 - var8.field1664)) + var8.field1664;
            }
            class73.field987.method1958(var8, 0);
        } else if (arg0 != null) {
            var8.field1670 = arg0;
            class329 var11 = arg0.field2768;
            if (var11.field5068 != null) {
                var8.field1672 = true;
                var11 = var11.method2125(class36.field583, false);
            }
            if (var11 != null) {
                var8.field1666 = var11.field5083 + arg3 << 7;
                var8.field1668 = var11.field5083 + arg1 << 7;
                var8.field1682 = class317.method2053(true, arg0);
                var8.field1671 = var11.field5071;
                var8.field1676 = var11.field5040 << 7;
            }
            class55.field747.method1958(var8, 0);
        } else if (arg6 != null) {
            var8.field1679 = arg6;
            var8.field1668 = arg6.method2091(-15245) + arg1 << 7;
            var8.field1666 = arg6.method2091(-15245) + arg3 << 7;
            var8.field1682 = class328.method2116(arg6, (byte) -29);
            var8.field1671 = arg6.field4948;
            var8.field1676 = arg6.field4942 << 7;
            class266.field3707.method940((long) arg6.field5254, -111, var8);
            return;
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(I[J[III)V")
    public static final void method1618(int arg0, long[] arg1, int[] arg2, int arg3, int arg4) {
        if (arg3 != -19154) {
            method1615((byte) 95);
        }
        if (arg4 < arg0) {
            int var5 = (arg0 + arg4) / 2;
            int var6 = arg4;
            long var7 = arg1[var5];
            arg1[var5] = arg1[arg0];
            arg1[arg0] = var7;
            int var9 = arg2[var5];
            arg2[var5] = arg2[arg0];
            arg2[arg0] = var9;
            int var10 = var7 == Long.MAX_VALUE ? 0 : 1;
            for (int var11 = arg4; var11 < arg0; var11++) {
                if (arg1[var11] < ((long) (var11 & var10) + var7)) {
                    long var12 = arg1[var11];
                    arg1[var11] = arg1[var6];
                    arg1[var6] = var12;
                    int var14 = arg2[var11];
                    arg2[var11] = arg2[var6];
                    arg2[var6++] = var14;
                }
            }
            arg1[arg0] = arg1[var6];
            arg1[var6] = var7;
            arg2[arg0] = arg2[var6];
            arg2[var6] = var9;
            method1618(var6 - 1, arg1, arg2, -19154, arg4);
            method1618(arg0, arg1, arg2, -19154, var6 + 1);
        }
        field3401++;
    }
}
