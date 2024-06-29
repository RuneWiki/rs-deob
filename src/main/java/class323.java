import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class323 extends class69 {

    @OriginalMember(owner = "client!qb", name = "s", descriptor = "Lph;")
    public static class229 field5502 = class266.method1858("Chargement des interfaces )2 ", 0);

    @OriginalMember(owner = "client!qb", name = "x", descriptor = "Lph;")
    private static class229 field5507 = class266.method1858("Mar", 0);

    @OriginalMember(owner = "client!qb", name = "v", descriptor = "Lph;")
    private static class229 field5505 = class266.method1858("Nov", 0);

    @OriginalMember(owner = "client!qb", name = "E", descriptor = "Lph;")
    private static class229 field5514 = class266.method1858("Dec", 0);

    @OriginalMember(owner = "client!qb", name = "G", descriptor = "Lph;")
    private static class229 field5516 = class266.method1858("May", 0);

    @OriginalMember(owner = "client!qb", name = "B", descriptor = "Lph;")
    private static class229 field5511 = class266.method1858("Jan", 0);

    @OriginalMember(owner = "client!qb", name = "A", descriptor = "Lph;")
    private static class229 field5510 = class266.method1858("Jun", 0);

    @OriginalMember(owner = "client!qb", name = "F", descriptor = "Lph;")
    private static class229 field5515 = class266.method1858("Apr", 0);

    @OriginalMember(owner = "client!qb", name = "z", descriptor = "Lph;")
    private static class229 field5509 = class266.method1858("Aug", 0);

    @OriginalMember(owner = "client!qb", name = "K", descriptor = "Lph;")
    public static class229 field5520 = class266.method1858(")1a2)1m", 0);

    @OriginalMember(owner = "client!qb", name = "I", descriptor = "Lph;")
    public static class229 field5518 = class266.method1858(": ", 0);

    @OriginalMember(owner = "client!qb", name = "u", descriptor = "Lph;")
    public static class229 field5504 = class266.method1858("k", 0);

    @OriginalMember(owner = "client!qb", name = "N", descriptor = "Lph;")
    private static class229 field5523 = class266.method1858("Oct", 0);

    @OriginalMember(owner = "client!qb", name = "H", descriptor = "Lph;")
    public static class229 field5517 = class266.method1858("Sie k-Onnen sich selbst nicht selbst auf Ihre Ignorieren)2Liste setzen(Q", 0);

    @OriginalMember(owner = "client!qb", name = "L", descriptor = "Lph;")
    public static class229 field5521 = class266.method1858("_labels", 0);

    @OriginalMember(owner = "client!qb", name = "y", descriptor = "[I")
    public static int[] field5508 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!qb", name = "O", descriptor = "Lph;")
    private static class229 field5524 = class266.method1858("Jul", 0);

    @OriginalMember(owner = "client!qb", name = "P", descriptor = "Lph;")
    private static class229 field5525 = class266.method1858("Sep", 0);

    @OriginalMember(owner = "client!qb", name = "J", descriptor = "Lph;")
    private static class229 field5519 = class266.method1858("Feb", 0);

    @OriginalMember(owner = "client!qb", name = "w", descriptor = "[Lph;")
    public static class229[] field5506 = new class229[] { field5511, field5519, field5507, field5515, field5516, field5510, field5524, field5509, field5525, field5523, field5505, field5514 };

    @OriginalMember(owner = "client!qb", name = "t", descriptor = "I")
    public static int field5503;

    @OriginalMember(owner = "client!qb", name = "C", descriptor = "I")
    public static int field5512;

    @OriginalMember(owner = "client!qb", name = "D", descriptor = "I")
    public static int field5513;

    @OriginalMember(owner = "client!qb", name = "M", descriptor = "I")
    public static int field5522;

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(III)Lkc;", line = 9)
    public static final class101 method2215(int arg0, int arg1, int arg2) {
        class72 var3 = class225.field3705[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class101 var4 = var3.field1220;
            var3.field1220 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IB)I", line = 20)
    public static final int method2216(int arg0, byte arg1) {
        int var2 = ((arg0 & 0xAAAAAAAA) >>> 1) + (arg0 & 0x55555555);
        if (arg1 != -71) {
            method2218((byte) -104);
        }
        int var3 = (var2 >>> 2 & 0xB3333333) + (var2 & 0x33333333);
        field5522++;
        int var4 = (var3 >>> 4) + var3 & 0xF0F0F0F;
        int var5 = (var4 >>> 8) + var4;
        int var6 = (var5 >>> 16) + var5;
        return var6 & 0xFF;
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(I)Z", line = 41)
    public static final boolean method2217(int arg0) {
        field5513++;
        if (arg0 != 0) {
            return true;
        }
        try {
            if (class170.field2802 == 2) {
                if (class232.field3837 == null) {
                    class232.field3837 = class41.method310(class133.field2154, class245.field4051, class155.field2525);
                    if (class232.field3837 == null) {
                        return false;
                    }
                }
                if (class108.field1853 == null) {
                    class108.field1853 = new class40(class156.field2536, class326.field5577);
                }
                if (class224.field3685.method478((byte) -50, class232.field3837, class108.field1853, 22050, class60.field854)) {
                    class224.field3685.method447(2);
                    class224.field3685.method465(class219.field3596, 0);
                    class224.field3685.method442(class232.field3837, class176.field2887, true);
                    class232.field3837 = null;
                    class108.field1853 = null;
                    class133.field2154 = null;
                    class170.field2802 = 0;
                    return true;
                }
            }
        } catch (Exception var2) {
            var2.printStackTrace();
            class224.field3685.method437(arg0 - 97);
            class133.field2154 = null;
            class108.field1853 = null;
            class232.field3837 = null;
            class170.field2802 = 0;
        }
        return false;
    }

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "(B)V", line = 126)
    public static void method2218(byte arg0) {
        field5519 = null;
        if (arg0 > -100) {
            field5516 = (class229) null;
        }
        field5520 = null;
        field5524 = null;
        field5517 = null;
        field5525 = null;
        field5518 = null;
        field5502 = null;
        field5514 = null;
        field5516 = null;
        field5505 = null;
        field5508 = null;
        field5510 = null;
        field5511 = null;
        field5523 = null;
        field5506 = null;
        field5515 = null;
        field5521 = null;
        field5507 = null;
        field5509 = null;
        field5504 = null;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIIIIBIIII)V", line = 181)
    public static final void method2219(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7, int arg8, int arg9) {
        field5503++;
        class218 var10 = (class218) class225.field3687.method1580((byte) -39);
        if (arg5 != -33) {
            field5521 = (class229) null;
        }
        class218 var11 = null;
        while (var10 != null) {
            if (var10.field3577 == arg0 && var10.field3575 == arg8 && var10.field3588 == arg6 && var10.field3579 == arg2) {
                var11 = var10;
                break;
            }
            var10 = (class218) class225.field3687.method1579((byte) 28);
        }
        if (var11 == null) {
            var11 = new class218();
            var11.field3588 = arg6;
            var11.field3577 = arg0;
            var11.field3575 = arg8;
            var11.field3579 = arg2;
            class27.method181(true, var11);
            class225.field3687.method1582(var11, arg5 + 37);
        }
        var11.field3572 = arg9;
        var11.field3573 = arg3;
        var11.field3592 = arg4;
        var11.field3582 = arg7;
        var11.field3581 = arg1;
    }
}
