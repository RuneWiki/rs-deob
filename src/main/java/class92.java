import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public class class92 extends class94 {

    @OriginalMember(owner = "client!bi", name = "r", descriptor = "I")
    private final int field1489;

    @OriginalMember(owner = "client!bi", name = "v", descriptor = "I")
    private final int field1493;

    @OriginalMember(owner = "client!bi", name = "x", descriptor = "I")
    private final int field1495;

    @OriginalMember(owner = "client!bi", name = "p", descriptor = "I")
    private final int field1487;

    @OriginalMember(owner = "client!bi", name = "o", descriptor = "[Llj;")
    public static class25[] field1486 = new class25[2048];

    @OriginalMember(owner = "client!bi", name = "u", descriptor = "Lp;")
    public static class280 field1492 = class18.method140((byte) -118, "::serverjs5drop");

    @OriginalMember(owner = "client!bi", name = "D", descriptor = "Z")
    public static boolean field1501 = true;

    @OriginalMember(owner = "client!bi", name = "E", descriptor = "Lp;")
    private static class280 field1502 = class18.method140((byte) -124, " has logged in)3");

    @OriginalMember(owner = "client!bi", name = "w", descriptor = "Lp;")
    public static class280 field1494 = field1502;

    @OriginalMember(owner = "client!bi", name = "A", descriptor = "Lbb;")
    public static class90 field1498 = new class90();

    @OriginalMember(owner = "client!bi", name = "q", descriptor = "I")
    public static int field1488;

    @OriginalMember(owner = "client!bi", name = "s", descriptor = "I")
    public static int field1490;

    @OriginalMember(owner = "client!bi", name = "t", descriptor = "I")
    public static int field1491;

    @OriginalMember(owner = "client!bi", name = "y", descriptor = "I")
    public static int field1496;

    @OriginalMember(owner = "client!bi", name = "z", descriptor = "I")
    public static int field1497;

    @OriginalMember(owner = "client!bi", name = "B", descriptor = "I")
    public static int field1499;

    @OriginalMember(owner = "client!bi", name = "C", descriptor = "I")
    public static int field1500;

    @OriginalMember(owner = "client!bi", name = "F", descriptor = "I")
    public static int field1503;

    @OriginalMember(owner = "client!bi", name = "H", descriptor = "I")
    public static int field1504;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIB)V")
    public final void method597(int arg0, int arg1, byte arg2) {
        ++field1497;
        int var4 = 113 % ((arg2 - -53) / 60);
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(BII)V")
    public final void method602(byte arg0, int arg1, int arg2) {
        int var4 = 28 % ((12 - arg0) / 45);
        ++field1503;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(ILp;Lp;BLp;I)V")
    public static final void method655(int arg0, class280 arg1, class280 arg2, byte arg3, class280 arg4, int arg5) {
        for (int var6 = 99; var6 > 0; --var6) {
            class176.field3067[var6] = class176.field3067[var6 + -1];
            class266.field4678[var6] = class266.field4678[var6 + -1];
            class27.field521[var6] = class27.field521[var6 - 1];
            class164.field2884[var6] = class164.field2884[var6 + -1];
            class60.field962[var6] = class60.field962[var6 + -1];
        }
        if (arg3 <= 84) {
            field1488 = -68;
        }
        class266.field4678[0] = arg4;
        class176.field3067[0] = arg5;
        ++field1499;
        class243.field4266 = class237.field4118;
        class60.field962[0] = arg0;
        class27.field521[0] = arg1;
        ++class107.field1767;
        class164.field2884[0] = arg2;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IBI)V")
    public final void method601(int arg0, byte arg1, int arg2) {
        ++field1491;
        if (arg1 != 77) {
            field1494 = null;
        }
        int var4 = this.field1487 * arg2 >> 12;
        int var5 = this.field1489 * arg0 >> 12;
        int var6 = this.field1493 * arg0 >> 12;
        int var7 = this.field1495 * arg2 >> 12;
        class211.method1413(var5, var4, var7, false, super.field1520, var6);
    }

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "(I)V")
    public static void method656(int arg0) {
        field1486 = null;
        field1494 = null;
        if (arg0 != 0) {
            method658(96, true, 103, 74, false, 72, true);
        }
        field1492 = null;
        field1498 = null;
        field1502 = null;
    }

    @OriginalMember(owner = "client!bi", name = "<init>", descriptor = "(IIIIII)V")
    public class92(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field1489 = arg1;
        this.field1493 = arg3;
        this.field1495 = arg2;
        this.field1487 = arg0;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Ljava/lang/String;B)V")
    public static final void method657(String arg0, byte arg1) {
        ++field1490;
        for (int var2 = arg0.indexOf("%0a"); ~var2 != 0; var2 = arg0.indexOf("%0a", var2)) {
            arg0 = arg0.substring(0, var2) + "\n" + arg0.substring(var2 + 3);
        }
        System.out.println("Error: " + arg0);
        int var3 = 52 % ((61 - arg1) / 39);
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IZIIZIZ)V")
    public static final void method658(int arg0, boolean arg1, int arg2, int arg3, boolean arg4, int arg5, boolean arg6) {
        ++field1496;
        if (~arg5 == -4) {
            method658(arg0, false, -1, -1, true, class98.field1573, true);
        } else {
            Container var7;
            if (class129.field2237 == null) {
                if (class153.field2656 != null) {
                    var7 = class153.field2656;
                } else {
                    var7 = class118.field2117.field3473;
                }
            } else {
                var7 = class129.field2237;
            }
            class145.field2527 = var7.getSize().width;
            class126.field2202 = var7.getSize().height;
            if (class153.field2656 == var7) {
                Insets var8 = class153.field2656.getInsets();
                class145.field2527 -= var8.right + var8.left;
                class126.field2202 -= var8.top + var8.bottom;
            }
            if (~arg5 <= -3) {
                class190.field3328 = class145.field2527;
                class160.field2789 = 0;
                class35.field648 = 0;
                class103.field1724 = class126.field2202;
            } else {
                class160.field2789 = (class145.field2527 + -765) / 2;
                class190.field3328 = 765;
                class35.field648 = 0;
                class103.field1724 = 503;
            }
            if (!arg1) {
                if (arg6) {
                    class97.method678(class41.field707, 44);
                    class277.method1840((byte) -91, class41.field707);
                    if (class196.field3439 != null) {
                        class196.field3439.method466(0, class41.field707);
                    }
                    class194.field3418.method762(false);
                    class96.method672(class41.field707, (byte) 17);
                    class133.method920(class41.field707, -125);
                    if (class196.field3439 != null) {
                        class196.field3439.method468(class41.field707, false);
                    }
                } else {
                    class41.field707.setSize(class190.field3328, class103.field1724);
                    if (class153.field2656 != var7) {
                        class41.field707.setLocation(class160.field2789, class35.field648);
                    } else {
                        Insets var9 = class153.field2656.getInsets();
                        class41.field707.setLocation(class160.field2789 + var9.left, class35.field648 + var9.top);
                    }
                }
                if (arg5 > 0) {
                    method658(arg0, false, -1, -1, true, 0, true);
                } else {
                    class86.field1422 = !class215.method1436(104);
                    if (~class246.field4315 != 0) {
                        class44.method338(true, (byte) 116);
                    }
                    if (class44.field727 != null && (class162.field2858 == 30 || ~class162.field2858 == -26)) {
                        class232.method1565(51);
                    }
                    for (int var10 = 0; var10 < 100; ++var10) {
                        class207.field3583[var10] = true;
                    }
                    class14.field272 = true;
                }
            }
        }
    }
}
