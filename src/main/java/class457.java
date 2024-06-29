import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public abstract class class457 extends class295 {

    @OriginalMember(owner = "client!jb", name = "C", descriptor = "S")
    public short field6341;

    @OriginalMember(owner = "client!jb", name = "F", descriptor = "I")
    public static int field6344 = 0;

    @OriginalMember(owner = "client!jb", name = "H", descriptor = "Llga;")
    public static class663 field6346 = new class663(260);

    @OriginalMember(owner = "client!jb", name = "J", descriptor = "Lhm;")
    public static class202 field6348 = new class202("RC", 1);

    @OriginalMember(owner = "client!jb", name = "K", descriptor = "[F")
    public static float[] field6349 = new float[4];

    @OriginalMember(owner = "client!jb", name = "B", descriptor = "I")
    public static int field6340;

    @OriginalMember(owner = "client!jb", name = "D", descriptor = "I")
    public static int field6342;

    @OriginalMember(owner = "client!jb", name = "E", descriptor = "I")
    public static int field6343;

    @OriginalMember(owner = "client!jb", name = "G", descriptor = "I")
    public static int field6345;

    @OriginalMember(owner = "client!jb", name = "I", descriptor = "I")
    public static int field6347;

    @OriginalMember(owner = "client!jb", name = "f", descriptor = "(B)Z", line = 3)
    public final boolean method1322(byte arg0) {
        ++field6345;
        if (arg0 != -54) {
            this.method1322((byte) 83);
        }
        return class469.method2648((byte) -24, super.field4047 >> class588.field8259, super.field4050, super.field4042 >> class588.field8259);
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "([BI)Lir;", line = 14)
    public static final class25 method2607(byte[] arg0, int arg1) {
        if (arg1 != -25614) {
            method2608(116);
        }
        ++field6342;
        class25 var2 = new class25();
        class501 var3 = new class501(arg0);
        var3.field6892 = var3.field6855.length - 2;
        int var4 = var3.method2845(-1);
        int var5 = var3.field6855.length + -12 + -2 - var4;
        var3.field6892 = var5;
        int var6 = var3.method2840(false);
        var2.field310 = var3.method2845(arg1 + 25613);
        var2.field316 = var3.method2845(-1);
        var2.field307 = var3.method2845(-1);
        var2.field313 = var3.method2845(arg1 ^ 25613);
        int var7 = var3.method2874((byte) -75);
        if (~var7 < -1) {
            var2.field318 = new class139[var7];
            for (int var8 = 0; ~var8 > ~var7; ++var8) {
                int var9 = var3.method2845(-1);
                class139 var10 = new class139(class206.method1334(-1, var9));
                var2.field318[var8] = var10;
                while (var9-- > 0) {
                    int var11 = var3.method2840(false);
                    int var12 = var3.method2840(false);
                    var10.method968((long) var11, new class72(var12), -1);
                }
            }
        }
        var3.field6892 = 0;
        var2.field314 = var3.method2861(97);
        var2.field308 = new int[var6];
        var2.field306 = new int[var6];
        var2.field312 = new String[var6];
        int var13 = 0;
        while (~var5 < ~var3.field6892) {
            int var14 = var3.method2845(-1);
            if (~var14 != -4) {
                if (var14 < 100 && var14 != 21 && ~var14 != -39 && var14 != 39) {
                    var2.field306[var13] = var3.method2840(false);
                } else {
                    var2.field306[var13] = var3.method2874((byte) -75);
                }
            } else {
                var2.field312[var13] = var3.method2851((byte) -106).intern();
            }
            var2.field308[var13++] = var14;
        }
        return var2;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "([Ltw;I)I", line = 96)
    public final int method1323(class186[] arg0, int arg1) {
        if (arg1 < 69) {
            this.method1323((class186[]) null, -93);
        }
        ++field6347;
        return this.method1798(super.field4047 >> class588.field8259, arg0, super.field4042 >> class588.field8259, -9609);
    }

    @OriginalMember(owner = "client!jb", name = "j", descriptor = "(I)V", line = 107)
    public static void method2608(int arg0) {
        field6348 = null;
        field6346 = null;
        field6349 = null;
        if (arg0 != 9369) {
            method2609((byte) 106);
        }
    }

    @OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(IIIIII)V", line = 118)
    public class457(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super.field4053 = (byte) arg3;
        super.field4050 = (byte) arg4;
        super.field4042 = arg0;
        super.field4052 = arg1;
        super.field4047 = arg2;
        this.field6341 = (short) arg5;
    }

    @OriginalMember(owner = "client!jb", name = "h", descriptor = "(I)Z", line = 135)
    public final boolean method1324(int arg0) {
        ++field6343;
        return arg0 > -104 ? true : class147.field2093[(super.field4042 >> class588.field8259) + -class167.field2435 + class36.field428][(super.field4047 >> class588.field8259) + -class353.field4699 + class36.field428];
    }

    @OriginalMember(owner = "client!jb", name = "g", descriptor = "(B)V", line = 146)
    public static final void method2609(byte arg0) {
        class273.field3739 = 0;
        ++field6340;
        int var1 = class660.field9184.method2867(-2);
        int var2 = class660.field9184.method2831(true);
        boolean var3 = ~class660.field9184.method2838((byte) -2) == -2;
        int var4 = class660.field9184.method2816(arg0 + 27);
        class480.method2701(arg0 ^ 4023);
        class24.method243(4, var2);
        int var5 = (-class660.field9184.field6892 + class95.field1338) / 16;
        class416.field5870 = new int[var5][4];
        for (int var6 = 0; var6 < var5; ++var6) {
            for (int var10 = 0; ~var10 > -5; ++var10) {
                class416.field5870[var6][var10] = class660.field9184.method2840(false);
            }
        }
        class699.field9915 = new int[var5];
        class479.field6606 = new byte[var5][];
        class314.field4342 = new int[var5];
        class666.field9327 = new byte[var5][];
        if (arg0 != -27) {
            field6348 = null;
        }
        class180.field2611 = new int[var5];
        class519.field7078 = new int[var5];
        class306.field4223 = null;
        class111.field1540 = new int[var5];
        class518.field7052 = new byte[var5][];
        class372.field5015 = new byte[var5][];
        class416.field5868 = null;
        int var7 = 0;
        for (int var8 = (-(class401.field5620 >> 4) + var4) / 8; ~(((class401.field5620 >> 4) + var4) / 8) <= ~var8; ++var8) {
            for (int var9 = (var1 - (class257.field3508 >> 4)) / 8; var9 <= ((class257.field3508 >> 4) + var1) / 8; ++var9) {
                class111.field1540[var7] = (var8 << 8) + var9;
                class314.field4342[var7] = class609.field8458.method3643("m" + var8 + "_" + var9, 1);
                class180.field2611[var7] = class609.field8458.method3643("l" + var8 + "_" + var9, 1);
                class699.field9915[var7] = class609.field8458.method3643("um" + var8 + "_" + var9, 1);
                class519.field7078[var7] = class609.field8458.method3643("ul" + var8 + "_" + var9, class324.method1944(arg0, -28));
                ++var7;
            }
        }
        class165.method1156(var1, var4, var3, -4525, 11);
    }
}
