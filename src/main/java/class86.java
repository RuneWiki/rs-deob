import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public class class86 extends class26 {

    @OriginalMember(owner = "client!e", name = "E", descriptor = "I")
    private final int field1501;

    @OriginalMember(owner = "client!e", name = "p", descriptor = "I")
    private final int field1488;

    @OriginalMember(owner = "client!e", name = "l", descriptor = "I")
    private final int field1484;

    @OriginalMember(owner = "client!e", name = "k", descriptor = "I")
    private final int field1483;

    @OriginalMember(owner = "client!e", name = "r", descriptor = "[I")
    public static int[] field1490 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!e", name = "m", descriptor = "I")
    public static int field1485 = 0;

    @OriginalMember(owner = "client!e", name = "v", descriptor = "S")
    public static short field1494 = 1;

    @OriginalMember(owner = "client!e", name = "u", descriptor = "Lub;")
    public static class227 field1493 = class257.method1749("rot:", 17263);

    @OriginalMember(owner = "client!e", name = "z", descriptor = "I")
    public static int field1498 = 7759444;

    @OriginalMember(owner = "client!e", name = "q", descriptor = "Lub;")
    private static class227 field1489 = class257.method1749("Starting 3d library", 17263);

    @OriginalMember(owner = "client!e", name = "s", descriptor = "Lub;")
    public static class227 field1491 = field1489;

    @OriginalMember(owner = "client!e", name = "o", descriptor = "I")
    public static int field1487;

    @OriginalMember(owner = "client!e", name = "t", descriptor = "I")
    public static int field1492;

    @OriginalMember(owner = "client!e", name = "x", descriptor = "I")
    public static int field1496;

    @OriginalMember(owner = "client!e", name = "y", descriptor = "I")
    public static int field1497;

    @OriginalMember(owner = "client!e", name = "B", descriptor = "I")
    public static int field1499;

    @OriginalMember(owner = "client!e", name = "C", descriptor = "I")
    public static int field1500;

    @OriginalMember(owner = "client!e", name = "n", descriptor = "Ln;")
    public static class138 field1486;

    @OriginalMember(owner = "client!e", name = "w", descriptor = "Lnh;")
    public static class57 field1495;

    @OriginalMember(owner = "client!e", name = "b", descriptor = "(I)V")
    public static final void method517(int arg0) {
        ++field1500;
        Object var1 = class223.field3777;
        synchronized (class223.field3777) {
            if (class245.field4290 == 0) {
                class61.field1123.method1596(5, 0, new class142());
            }
            if (arg0 != 1684492428) {
                field1495 = null;
            }
            class245.field4290 = 600;
        }
    }

    @OriginalMember(owner = "client!e", name = "c", descriptor = "(I)V")
    public static void method518(int arg0) {
        field1491 = null;
        field1486 = null;
        field1495 = null;
        field1490 = null;
        field1493 = null;
        if (arg0 == 16) {
            field1489 = null;
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(III)V")
    public final void method100(int arg0, int arg1, int arg2) {
        ++field1499;
        if (arg0 != 512) {
            field1495 = null;
        }
        int var4 = this.field1483 * arg1 >> 12;
        int var5 = this.field1501 * arg1 >> 12;
        int var6 = this.field1488 * arg2 >> 12;
        int var7 = this.field1484 * arg2 >> 12;
        class180.method1155(var5, super.field433, var6, super.field434, (byte) -61, var7, var4, super.field436);
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IIIIIILta;I)V")
    public static final void method519(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class105 arg6, int arg7) {
        if (!class108.field2028) {
            class147.field2545 = 0;
        } else {
            class147.field2545 = 32;
        }
        class108.field2028 = false;
        ++field1497;
        if (class122.field2197 != 0) {
            if (arg4 <= arg5 && ~(arg4 + 16) < ~arg5 && ~arg3 >= ~arg1 && arg3 + 16 > arg1) {
                arg6.field1986 -= 4;
                class198.method1268(arg7 + -21251, arg6);
            } else if (~arg4 >= ~arg5 && ~(arg4 - -16) < ~arg5 && arg1 >= arg0 + arg3 - 16 && ~arg1 > ~(arg0 + arg3)) {
                arg6.field1986 += 4;
                class198.method1268(96, arg6);
            } else if (~(-class147.field2545 + arg4) >= ~arg5 && arg5 < arg4 - -16 + class147.field2545 && arg1 >= arg3 + 16 && ~arg1 > ~(arg3 - -arg0 + -16)) {
                int var8 = (arg0 - 32) * arg0 / arg2;
                if (var8 < 8) {
                    var8 = 8;
                }
                int var9 = -arg3 + arg1 + -16 - var8 / 2;
                int var10 = -var8 + -32 + arg0;
                arg6.field1986 = (-arg0 + arg2) * var9 / var10;
                class198.method1268(arg7 ^ 21286, arg6);
                class108.field2028 = true;
            }
        }
        if (arg7 != 21357) {
            method518(-113);
        }
        if (class2.field33 != 0) {
            int var11 = arg6.field1977;
            if (arg5 >= -var11 + arg4 && arg3 <= arg1 && ~(arg4 + 16) < ~arg5 && ~arg1 >= ~(arg3 - -arg0)) {
                arg6.field1986 += class2.field33 * 45;
                class198.method1268(109, arg6);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!e", name = "<init>", descriptor = "(IIIIIII)V")
    public class86(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field1501 = arg0;
        this.field1488 = arg3;
        this.field1484 = arg1;
        this.field1483 = arg2;
    }

    @OriginalMember(owner = "client!e", name = "b", descriptor = "(IIB)V")
    public final void method103(int arg0, int arg1, byte arg2) {
        ++field1496;
        int var4 = this.field1501 * arg1 >> 12;
        int var5 = this.field1483 * arg1 >> 12;
        int var6 = this.field1484 * arg0 >> 12;
        if (arg2 <= 98) {
            method519(-10, -28, 1, -77, -110, -2, (class105) null, -13);
        }
        int var7 = this.field1488 * arg0 >> 12;
        class104.method633(super.field436, 0, var6, var7, var5, var4);
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IIB)V")
    public final void method106(int arg0, int arg1, byte arg2) {
        if (arg2 != -75) {
            this.method103(123, -35, (byte) -110);
        }
        ++field1487;
    }
}
