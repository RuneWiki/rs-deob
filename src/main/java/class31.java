import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fn")
public class class31 extends class273 {

    @OriginalMember(owner = "client!fn", name = "u", descriptor = "I")
    public int field527;

    @OriginalMember(owner = "client!fn", name = "q", descriptor = "I")
    public int field523;

    @OriginalMember(owner = "client!fn", name = "o", descriptor = "I")
    public int field521;

    @OriginalMember(owner = "client!fn", name = "m", descriptor = "I")
    public int field519;

    @OriginalMember(owner = "client!fn", name = "t", descriptor = "[I")
    public static int[] field526 = new int[32];

    @OriginalMember(owner = "client!fn", name = "r", descriptor = "I")
    public static int field524 = -1;

    @OriginalMember(owner = "client!fn", name = "w", descriptor = "Lwm;")
    public static class152 field529 = class157.method1048("settings", 96);

    @OriginalMember(owner = "client!fn", name = "n", descriptor = "Lek;")
    public static class183 field520 = new class183();

    @OriginalMember(owner = "client!fn", name = "p", descriptor = "I")
    public static int field522;

    @OriginalMember(owner = "client!fn", name = "s", descriptor = "I")
    public static int field525;

    @OriginalMember(owner = "client!fn", name = "v", descriptor = "I")
    public static int field528;

    @OriginalMember(owner = "client!fn", name = "x", descriptor = "I")
    public static int field530;

    @OriginalMember(owner = "client!fn", name = "y", descriptor = "I")
    public static int field531;

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(IIIIILoe;II)V", line = 13)
    public static final void method235(int arg0, int arg1, int arg2, int arg3, int arg4, class127 arg5, int arg6, int arg7) {
        if (class55.field862) {
            class287.field4850 = 32;
        } else {
            class287.field4850 = 0;
        }
        class55.field862 = false;
        field530++;
        if (arg7 != 3951) {
            return;
        }
        if (class93.field1330 != 0) {
            if (arg0 <= arg1 && (arg0 + 16) > arg1 && arg4 <= arg6 && arg4 + 16 > arg6) {
                arg5.field1852 -= 4;
                class272.method1868(arg7 ^ 0x5606, arg5);
            } else if (arg1 >= arg0 && arg0 + 16 > arg1 && arg4 - (16 - arg3) <= arg6 && arg4 + arg3 > arg6) {
                arg5.field1852 += 4;
                class272.method1868(22889, arg5);
            } else if (arg1 >= (arg0 - class287.field4850) && arg1 < class287.field4850 + arg0 + 16 && (arg4 + 16) <= arg6 && arg6 < (arg3 + arg4 - 16)) {
                int var8 = (arg3 - 32) * arg3 / arg2;
                if (var8 < 8) {
                    var8 = 8;
                }
                int var9 = arg3 - var8 - 32;
                int var10 = arg6 - arg4 - (var8 / 2) - 16;
                arg5.field1852 = (arg2 - arg3) * var10 / var9;
                class272.method1868(22889, arg5);
                class55.field862 = true;
            }
        }
        if (class155.field2459 == 0) {
            return;
        }
        int var11 = arg5.field1876;
        if (arg1 >= (arg0 - var11) && arg6 >= arg4 && arg1 < (arg0 + 16) && arg3 + arg4 >= arg6) {
            arg5.field1852 += class155.field2459 * 45;
            class272.method1868(22889, arg5);
        }
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(III)Z", line = 76)
    public final boolean method236(int arg0, int arg1, int arg2) {
        if (arg1 != 128) {
            method238((byte) 41, (class205) null, (class205) null, (class263) null);
        }
        field522++;
        return arg0 >= this.field523 && this.field521 >= arg0 && this.field519 <= arg2 && this.field527 >= arg2;
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(IJIIIZLwm;)V", line = 94)
    public static final void method237(int arg0, long arg1, int arg2, int arg3, int arg4, boolean arg5, class152 arg6) {
        field525++;
        class291 var8 = new class291(128);
        var8.method1980(arg5, 10);
        var8.method1994((int) (Math.random() * 99999.0D), 2921);
        var8.method1994(531, 2921);
        var8.method1988(arg1, 125);
        var8.method1967((int) (Math.random() * 9.9999999E7D), -1303690792);
        var8.method2015(-21389, arg6);
        var8.method1967((int) (Math.random() * 9.9999999E7D), -1303690792);
        var8.method1994(class45.field726, 2921);
        var8.method1980(false, arg2);
        var8.method1980(arg5, arg4);
        var8.method1967((int) (Math.random() * 9.9999999E7D), -1303690792);
        var8.method1994(arg3, 2921);
        var8.method1994(arg0, 2921);
        var8.method1967((int) (Math.random() * 9.9999999E7D), -1303690792);
        var8.method2006(class54.field847, arg5, class116.field1635);
        class245.field4102.field4946 = 0;
        class245.field4102.method1980(false, 3);
        class245.field4102.method1980(arg5, var8.field4946);
        class245.field4102.method1989(var8.field4950, 0, (byte) 127, var8.field4946);
        class12.field155 = 0;
        class28.field477 = -3;
        class201.field3243 = 0;
        class141.field2156 = 1;
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(BLah;Lah;Lvg;)V", line = 129)
    public static final void method238(byte arg0, class205 arg1, class205 arg2, class263 arg3) {
        field531++;
        class18.field260 = arg1;
        class234.field3838 = arg2;
        class132.field2033 = arg3;
        if (class18.field260 != null) {
            class33.field536 = class18.field260.method1375(1, 0);
        }
        if (class234.field3838 != null) {
            class317.field5502 = class234.field3838.method1375(1, 0);
        }
        int var4 = -15 / ((63 - arg0) / 63);
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(IIIJ)Z", line = 150)
    public static final boolean method239(int arg0, int arg1, int arg2, long arg3) {
        field528++;
        int var5 = (int) arg3 >> 20 & 0x3;
        int var6 = ((int) arg3 & 0x7C018) >> 14;
        int var7 = Integer.MAX_VALUE & (int) (arg3 >>> 32);
        if (var6 == 10 || var6 == 11 || var6 == 22) {
            class270 var8 = class242.method1656(var7, true);
            int var9 = var8.field4602;
            int var10;
            int var11;
            if (var5 == 0 || var5 == 2) {
                var10 = var8.field4562;
                var11 = var8.field4618;
            } else {
                var10 = var8.field4618;
                var11 = var8.field4562;
            }
            if (var5 != 0) {
                var9 = (var9 >> 4 - var5) + (var9 << var5 & 0xF);
            }
            class272.method1869(var9, class85.field1176.field4188[0], 2, 0, var11, arg2, 0, class85.field1176.field4245[0], 88, arg0, true, var10);
        } else {
            class272.method1869(0, class85.field1176.field4188[0], 2, var6 + 1, 0, arg2, var5, class85.field1176.field4245[0], 105, arg0, true, 0);
        }
        class57.field878 = arg1;
        class211.field3429 = class193.field3066;
        class279.field4765 = class62.field944;
        class38.field632 = 2;
        return true;
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(Z)V", line = 196)
    public static void method240(boolean arg0) {
        field520 = null;
        if (arg0) {
            field526 = null;
            field529 = null;
        }
    }

    @OriginalMember(owner = "client!fn", name = "<init>", descriptor = "(IIII)V", line = 230)
    public class31(int arg0, int arg1, int arg2, int arg3) {
        this.field527 = arg3;
        this.field523 = arg0;
        this.field521 = arg2;
        this.field519 = arg1;
    }
}
