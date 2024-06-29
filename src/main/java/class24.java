import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class24 extends class89 {

    @OriginalMember(owner = "client!db", name = "tb", descriptor = "Z")
    private boolean field585 = false;

    @OriginalMember(owner = "client!db", name = "xb", descriptor = "I")
    private int field589 = 0;

    @OriginalMember(owner = "client!db", name = "Kb", descriptor = "I")
    private int field602 = 0;

    @OriginalMember(owner = "client!db", name = "Eb", descriptor = "I")
    private int field596;

    @OriginalMember(owner = "client!db", name = "Bb", descriptor = "I")
    private int field593;

    @OriginalMember(owner = "client!db", name = "eb", descriptor = "I")
    private int field570;

    @OriginalMember(owner = "client!db", name = "ib", descriptor = "I")
    public int field574;

    @OriginalMember(owner = "client!db", name = "ub", descriptor = "I")
    public int field586;

    @OriginalMember(owner = "client!db", name = "pb", descriptor = "I")
    private int field581;

    @OriginalMember(owner = "client!db", name = "bb", descriptor = "I")
    public int field567;

    @OriginalMember(owner = "client!db", name = "sb", descriptor = "I")
    private int field584;

    @OriginalMember(owner = "client!db", name = "yb", descriptor = "I")
    public int field590;

    @OriginalMember(owner = "client!db", name = "kb", descriptor = "I")
    private int field576;

    @OriginalMember(owner = "client!db", name = "Db", descriptor = "I")
    public int field595;

    @OriginalMember(owner = "client!db", name = "Jb", descriptor = "Lw;")
    private class153 field601;

    @OriginalMember(owner = "client!db", name = "hb", descriptor = "Lr;")
    public static class118 field573 = class153.method1136(106, "Ihr Spielkonto wird bereits benutzt)3");

    @OriginalMember(owner = "client!db", name = "rb", descriptor = "Lr;")
    private static class118 field583 = class153.method1136(111, "To play on this world move to a free area first)3");

    @OriginalMember(owner = "client!db", name = "Gb", descriptor = "Lr;")
    public static class118 field598 = class153.method1136(127, "-5berpr-Ufen Sie Ihr Mitteilungsfach)3");

    @OriginalMember(owner = "client!db", name = "Hb", descriptor = "Lr;")
    public static class118 field599 = class153.method1136(95, "null");

    @OriginalMember(owner = "client!db", name = "qb", descriptor = "Lr;")
    public static class118 field582 = field583;

    @OriginalMember(owner = "client!db", name = "jb", descriptor = "Z")
    public static boolean field575 = false;

    @OriginalMember(owner = "client!db", name = "Lb", descriptor = "Lge;")
    public static class47 field603 = new class47(30);

    @OriginalMember(owner = "client!db", name = "Mb", descriptor = "Lr;")
    public static class118 field604 = class153.method1136(98, "Ausw-=hlen");

    @OriginalMember(owner = "client!db", name = "Ob", descriptor = "I")
    public static int field606 = 0;

    @OriginalMember(owner = "client!db", name = "Z", descriptor = "D")
    private double field565;

    @OriginalMember(owner = "client!db", name = "db", descriptor = "D")
    private double field569;

    @OriginalMember(owner = "client!db", name = "gb", descriptor = "D")
    private double field572;

    @OriginalMember(owner = "client!db", name = "lb", descriptor = "D")
    private double field577;

    @OriginalMember(owner = "client!db", name = "mb", descriptor = "D")
    public double field578;

    @OriginalMember(owner = "client!db", name = "Ab", descriptor = "D")
    private double field592;

    @OriginalMember(owner = "client!db", name = "Cb", descriptor = "D")
    public double field594;

    @OriginalMember(owner = "client!db", name = "Ib", descriptor = "D")
    public double field600;

    @OriginalMember(owner = "client!db", name = "ab", descriptor = "I")
    public int field566;

    @OriginalMember(owner = "client!db", name = "cb", descriptor = "I")
    public static int field568;

    @OriginalMember(owner = "client!db", name = "fb", descriptor = "I")
    public static int field571;

    @OriginalMember(owner = "client!db", name = "nb", descriptor = "I")
    public static int field579;

    @OriginalMember(owner = "client!db", name = "ob", descriptor = "I")
    public static int field580;

    @OriginalMember(owner = "client!db", name = "vb", descriptor = "I")
    public static int field587;

    @OriginalMember(owner = "client!db", name = "wb", descriptor = "I")
    private int field588;

    @OriginalMember(owner = "client!db", name = "zb", descriptor = "I")
    public static int field591;

    @OriginalMember(owner = "client!db", name = "Fb", descriptor = "I")
    public static int field597;

    @OriginalMember(owner = "client!db", name = "Nb", descriptor = "Ln;")
    public static class90 field605;

    @OriginalMember(owner = "client!db", name = "g", descriptor = "(I)V")
    public static final void method214(int arg0) {
        field591++;
        while (class53.field1253.method728(class88.field2140, 0) >= 27) {
            int var1 = class53.field1253.method725(8, 15);
            if (var1 == 32767) {
                break;
            }
            boolean var2 = false;
            if (class74.field1833[var1] == null) {
                var2 = true;
                class74.field1833[var1] = new class83();
            }
            class83 var3 = class74.field1833[var1];
            class68.field1580[class115.field2702++] = var1;
            var3.field742 = class65.field1479;
            int var4 = class53.field1253.method725(8, 1);
            int var5 = class53.field1253.method725(8, 5);
            if (var5 > 15) {
                var5 -= 32;
            }
            int var6 = class136.field3088[class53.field1253.method725(8, 3)];
            if (var2) {
                var3.field756 = var3.field768 = var6;
            }
            int var7 = class53.field1253.method725(8, 1);
            if (var7 == 1) {
                class157.field3628[class92.field2216++] = var1;
            }
            var3.field1989 = class32.method273(9, class53.field1253.method725(8, 14));
            int var8 = class53.field1253.method725(8, 5);
            if (var8 > 15) {
                var8 -= 32;
            }
            var3.field762 = var3.field1989.field2542;
            var3.field761 = var3.field1989.field2565;
            var3.field716 = var3.field1989.field2568;
            var3.field767 = var3.field1989.field2553;
            var3.field714 = var3.field1989.field2572;
            var3.field729 = var3.field1989.field2574;
            if (var3.field729 == 0) {
                var3.field768 = 0;
            }
            var3.field733 = var3.field1989.field2575;
            var3.field764 = var3.field1989.field2548;
            var3.field766 = var3.field1989.field2540;
            var3.method255(class89.field2150.field710[0] + var8, class89.field2150.field755[0] + var5, -20149, ~var4 == -2);
        }
        if (arg0 <= 39) {
            field606 = -3;
        }
        class53.field1253.method732(1);
    }

    @OriginalMember(owner = "client!db", name = "e", descriptor = "(I)Lwb;")
    public final class155 method215(int arg0) {
        if (arg0 != 15246) {
            return null;
        }
        class51 var2 = class1.method2(-15697, this.field584);
        field587++;
        class155 var3 = var2.method455((byte) 73, this.field602);
        if (var3 == null) {
            return null;
        } else {
            var3.method1216(this.field588);
            return var3;
        }
    }

    @OriginalMember(owner = "client!db", name = "h", descriptor = "(I)V")
    public static void method216(int arg0) {
        field582 = null;
        field603 = null;
        field604 = null;
        field605 = null;
        field599 = null;
        field573 = null;
        if (arg0 <= 105) {
            field573 = null;
        }
        field598 = null;
        field583 = null;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IIIII)V")
    public final void method217(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (!this.field585) {
            double var6 = (double) (arg3 - this.field581);
            double var8 = (double) (arg4 - this.field576);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field600 = (double) this.field596 * var8 / var10 + (double) this.field576;
            this.field594 = this.field570;
            this.field578 = (double) this.field596 * var6 / var10 + (double) this.field581;
        }
        double var12 = (double) (this.field595 + 1 - arg1);
        this.field592 = ((double) arg3 - this.field578) / var12;
        this.field577 = ((double) arg4 - this.field600) / var12;
        this.field569 = Math.sqrt(this.field592 * this.field592 + this.field577 * this.field577);
        if (!this.field585) {
            this.field565 = -this.field569 * Math.tan((double) this.field593 * 0.02454369D);
        }
        field571++;
        this.field572 = ((double) arg0 - this.field594 - this.field565 * var12) * 2.0D / (var12 * var12);
        if (arg2 != 7) {
            method216(104);
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IBIIIII)I")
    public static final int method218(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg1 > -126) {
            field603 = null;
        }
        field568++;
        if ((arg2 & 0x1) == 1) {
            int var7 = arg3;
            arg3 = arg0;
            arg0 = var7;
        }
        int var8 = arg5 & 0x3;
        if (var8 == 0) {
            return arg6;
        } else if (var8 == 1) {
            return arg4;
        } else if (var8 == 2) {
            return 7 + 1 - arg3 - arg6;
        } else {
            return 7 + 1 - arg4 - arg0;
        }
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(II)V")
    public final void method219(int arg0, int arg1) {
        int var3 = 52 / ((arg1 - 2) / 51);
        this.field594 += this.field572 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field565;
        field579++;
        this.field600 += (double) arg0 * this.field577;
        this.field565 += (double) arg0 * this.field572;
        this.field585 = true;
        this.field578 += (double) arg0 * this.field592;
        this.field566 = (int) (Math.atan2(this.field592, this.field577) * 325.949D) + 1024 & 0x7FF;
        this.field588 = (int) (Math.atan2(this.field565, this.field569) * 325.949D) & 0x7FF;
        if (this.field601 == null) {
            return;
        }
        this.field589 += arg0;
        while (true) {
            do {
                do {
                    if (this.field589 <= this.field601.field3478[this.field602]) {
                        return;
                    }
                    this.field589 -= this.field601.field3478[this.field602];
                    this.field602++;
                } while (this.field601.field3464.length > this.field602);
                this.field602 -= this.field601.field3443;
            } while (this.field602 >= 0 && this.field601.field3464.length > this.field602);
            this.field602 = 0;
        }
    }

    @OriginalMember(owner = "client!db", name = "<init>", descriptor = "(IIIIIIIIIII)V")
    public class24(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field596 = arg8;
        this.field593 = arg7;
        this.field570 = arg4;
        this.field574 = arg9;
        this.field586 = arg1;
        this.field581 = arg2;
        this.field567 = arg5;
        this.field584 = arg0;
        this.field590 = arg10;
        this.field576 = arg3;
        this.field595 = arg6;
        this.field585 = false;
        int var12 = class1.method2(-15697, this.field584).field1234;
        if (var12 == -1) {
            this.field601 = null;
        } else {
            this.field601 = class125.method970((byte) -68, var12);
        }
    }
}
