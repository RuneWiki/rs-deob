import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class92 extends class234 {

    @OriginalMember(owner = "client!rf", name = "r", descriptor = "I")
    private int field1557 = -32768;

    @OriginalMember(owner = "client!rf", name = "o", descriptor = "Lda;")
    private static class275 field1554 = class255.method1672(110, "wave2:");

    @OriginalMember(owner = "client!rf", name = "z", descriptor = "[I")
    public static int[] field1565 = new int[1000];

    @OriginalMember(owner = "client!rf", name = "q", descriptor = "Lda;")
    private static class275 field1556 = class255.method1672(109, "Loaded config");

    @OriginalMember(owner = "client!rf", name = "C", descriptor = "Lda;")
    public static class275 field1568 = field1554;

    @OriginalMember(owner = "client!rf", name = "t", descriptor = "Lda;")
    public static class275 field1559 = class255.method1672(120, "www)2wtrc");

    @OriginalMember(owner = "client!rf", name = "y", descriptor = "Lda;")
    public static class275 field1564 = class255.method1672(118, "<img=1>");

    @OriginalMember(owner = "client!rf", name = "u", descriptor = "Lef;")
    public static class213 field1560 = null;

    @OriginalMember(owner = "client!rf", name = "H", descriptor = "Lda;")
    public static class275 field1572 = field1556;

    @OriginalMember(owner = "client!rf", name = "J", descriptor = "Lda;")
    public static class275 field1573 = field1554;

    @OriginalMember(owner = "client!rf", name = "s", descriptor = "Lne;")
    public static class137 field1558 = new class137(30);

    @OriginalMember(owner = "client!rf", name = "U", descriptor = "I")
    public static int field1582 = 50;

    @OriginalMember(owner = "client!rf", name = "O", descriptor = "[I")
    public static int[] field1577 = new int[field1582];

    @OriginalMember(owner = "client!rf", name = "S", descriptor = "[Lda;")
    public static class275[] field1580 = new class275[field1582];

    @OriginalMember(owner = "client!rf", name = "K", descriptor = "[I")
    public static int[] field1574 = new int[field1582];

    @OriginalMember(owner = "client!rf", name = "R", descriptor = "[I")
    public static int[] field1579 = new int[field1582];

    @OriginalMember(owner = "client!rf", name = "T", descriptor = "[I")
    public static int[] field1581 = new int[field1582];

    @OriginalMember(owner = "client!rf", name = "V", descriptor = "[I")
    public static int[] field1583 = new int[field1582];

    @OriginalMember(owner = "client!rf", name = "Q", descriptor = "[I")
    public static int[] field1578 = new int[field1582];

    @OriginalMember(owner = "client!rf", name = "N", descriptor = "[I")
    public static int[] field1576 = new int[field1582];

    @OriginalMember(owner = "client!rf", name = "n", descriptor = "I")
    public static int field1553;

    @OriginalMember(owner = "client!rf", name = "p", descriptor = "I")
    public static int field1555;

    @OriginalMember(owner = "client!rf", name = "v", descriptor = "I")
    public static int field1561;

    @OriginalMember(owner = "client!rf", name = "w", descriptor = "I")
    public static int field1562;

    @OriginalMember(owner = "client!rf", name = "x", descriptor = "I")
    public int field1563;

    @OriginalMember(owner = "client!rf", name = "A", descriptor = "I")
    public static int field1566;

    @OriginalMember(owner = "client!rf", name = "B", descriptor = "I")
    public int field1567;

    @OriginalMember(owner = "client!rf", name = "D", descriptor = "I")
    public static int field1569;

    @OriginalMember(owner = "client!rf", name = "E", descriptor = "I")
    public static int field1570;

    @OriginalMember(owner = "client!rf", name = "G", descriptor = "I")
    public static int field1571;

    @OriginalMember(owner = "client!rf", name = "L", descriptor = "[[[I")
    public static int[][][] field1575;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(Lma;III)Lkb;")
    public static final class259 method658(class105 arg0, int arg1, int arg2, int arg3) {
        if (arg1 != 11615) {
            field1559 = null;
        }
        field1566++;
        return class210.method1353(arg2, arg0, arg3, (byte) -74) ? class114.method835(0) : null;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method659(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        field1570++;
        class176 var11 = class210.method1352(81, this.field1567).method1605((class215) null, this.field1563, 0, (byte) -119);
        if (var11 != null) {
            var11.method659(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            this.field1557 = var11.method664();
        }
    }

    @OriginalMember(owner = "client!rf", name = "c", descriptor = "(II)I")
    public static final int method660(int arg0, int arg1) {
        if (arg0 <= 31) {
            field1560 = null;
        }
        field1571++;
        return arg1 == 16711935 ? -1 : class83.method537(true, arg1);
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(IB)Z")
    public static final boolean method661(int arg0, byte arg1) {
        field1553++;
        if (arg1 == -115) {
            return (arg0 & -arg0) == arg0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(IIBLgi;I)V")
    public static final void method662(int arg0, int arg1, byte arg2, class34 arg3, int arg4) {
        field1569++;
        if (arg2 != -3) {
            return;
        }
        for (class249 var5 = (class249) class277.field4835.method550(-113); var5 != null; var5 = (class249) class277.field4835.method545(104)) {
            if (var5.field4385 == arg0 && (arg4 * 128) == var5.field4374 && (arg1 * 128) == var5.field4377 && var5.field4376.field508 == arg3.field508) {
                if (var5.field4380 != null) {
                    class258.field4522.method1426(var5.field4380);
                    var5.field4380 = null;
                }
                if (var5.field4396 != null) {
                    class258.field4522.method1426(var5.field4396);
                    var5.field4396 = null;
                }
                var5.method741(arg2 + 6);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(IIIZIII)I")
    public static final int method663(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        field1561++;
        int var7 = arg1 & 0x3;
        if ((arg6 & 0x1) == 1) {
            int var8 = arg5;
            arg5 = arg0;
            arg0 = var8;
        }
        if (!arg3) {
            method666((class229) null, true, 119);
        }
        if (var7 == 0) {
            return arg4;
        } else if (var7 == 1) {
            return -arg5 - (-(7 - arg2) - 1);
        } else if (var7 == 2) {
            return 1 + 7 - arg0 - arg4;
        } else {
            return arg2;
        }
    }

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "()I")
    public final int method664() {
        field1555++;
        return this.field1557;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(I)V")
    public static void method665(int arg0) {
        field1583 = null;
        field1559 = null;
        field1579 = null;
        field1575 = null;
        field1577 = null;
        if (arg0 != -2569) {
            field1564 = null;
        }
        field1558 = null;
        field1576 = null;
        field1564 = null;
        field1565 = null;
        field1581 = null;
        field1554 = null;
        field1572 = null;
        field1578 = null;
        field1573 = null;
        field1556 = null;
        field1580 = null;
        field1568 = null;
        field1574 = null;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(Lfd;ZI)V")
    public static final void method666(class229 arg0, boolean arg1, int arg2) {
        field1562++;
        int var3 = arg0.field3883 == 0 ? arg0.field3885 : arg0.field3883;
        if (arg2 != -1811) {
            method666((class229) null, false, 69);
        }
        int var4 = arg0.field4019 == 0 ? arg0.field3980 : arg0.field4019;
        class93.method671(var3, var4, false, arg1, class173.field3005[arg0.field3879 >> 16], arg0.field3879);
        if (arg0.field3942 != null) {
            class93.method671(var3, var4, false, arg1, arg0.field3942, arg0.field3879);
        }
        class112 var5 = (class112) class267.field4633.method1871(0, (long) arg0.field3879);
        if (var5 != null) {
            class60.method377(arg2 ^ 0x737, var5.field1977, var3, var4, arg1);
        }
    }
}
