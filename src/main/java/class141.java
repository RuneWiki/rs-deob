import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public class class141 extends class92 {

    @OriginalMember(owner = "client!pf", name = "cb", descriptor = "I")
    private int field2762;

    @OriginalMember(owner = "client!pf", name = "ib", descriptor = "I")
    private int field2768;

    @OriginalMember(owner = "client!pf", name = "bb", descriptor = "I")
    private int field2761;

    @OriginalMember(owner = "client!pf", name = "ab", descriptor = "I")
    private int field2760;

    @OriginalMember(owner = "client!pf", name = "W", descriptor = "I")
    private int field2756;

    @OriginalMember(owner = "client!pf", name = "Y", descriptor = "I")
    private int field2758;

    @OriginalMember(owner = "client!pf", name = "eb", descriptor = "Lca;")
    private class22 field2764;

    @OriginalMember(owner = "client!pf", name = "gb", descriptor = "I")
    private int field2766;

    @OriginalMember(owner = "client!pf", name = "T", descriptor = "I")
    private int field2754;

    @OriginalMember(owner = "client!pf", name = "V", descriptor = "I")
    public static int field2755 = 0;

    @OriginalMember(owner = "client!pf", name = "X", descriptor = "I")
    public static volatile int field2757 = 0;

    @OriginalMember(owner = "client!pf", name = "lb", descriptor = "Lpa;")
    public static class136 field2771 = new class136(100);

    @OriginalMember(owner = "client!pf", name = "nb", descriptor = "Leh;")
    public static class47 field2773 = class195.method1282((byte) -4, "W-=hlen Sie eine Option");

    @OriginalMember(owner = "client!pf", name = "pb", descriptor = "Leh;")
    private static class47 field2775 = class195.method1282((byte) -4, "This computers address has been blocked");

    @OriginalMember(owner = "client!pf", name = "mb", descriptor = "I")
    public static int field2772 = 0;

    @OriginalMember(owner = "client!pf", name = "rb", descriptor = "Leh;")
    public static class47 field2777 = class195.method1282((byte) -4, "titlebox");

    @OriginalMember(owner = "client!pf", name = "qb", descriptor = "Leh;")
    public static class47 field2776 = field2775;

    @OriginalMember(owner = "client!pf", name = "sb", descriptor = "Leh;")
    public static class47 field2778 = class195.method1282((byte) -4, "<col=40ff00>");

    @OriginalMember(owner = "client!pf", name = "db", descriptor = "I")
    public static int field2763;

    @OriginalMember(owner = "client!pf", name = "hb", descriptor = "I")
    public static int field2767;

    @OriginalMember(owner = "client!pf", name = "jb", descriptor = "I")
    public static int field2769;

    @OriginalMember(owner = "client!pf", name = "kb", descriptor = "I")
    public static int field2770;

    @OriginalMember(owner = "client!pf", name = "fb", descriptor = "Ldd;")
    public static class34 field2765;

    @OriginalMember(owner = "client!pf", name = "Z", descriptor = "Lfb;")
    public static class50 field2759;

    @OriginalMember(owner = "client!pf", name = "ob", descriptor = "[Ldh;")
    public static class38[] field2774;

    @OriginalMember(owner = "client!pf", name = "f", descriptor = "(I)V")
    public static void method1015(int arg0) {
        if (arg0 != -14292) {
            field2765 = null;
        }
        field2776 = null;
        field2765 = null;
        field2774 = null;
        field2773 = null;
        field2759 = null;
        field2775 = null;
        field2778 = null;
        field2777 = null;
        field2771 = null;
    }

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "(III)V")
    public static final void method1016(int arg0, int arg1, int arg2) {
        class152 var3 = class173.field3351[arg0][arg1][arg2];
        if (var3 != null) {
            var3.field2989 = null;
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIIIZ)V")
    public static final void method1017(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        for (int var5 = 0; var5 < class3.field39; var5++) {
            if (arg3 < client.field550[var5] + class90.field1899[var5] && arg0 + arg3 > client.field550[var5] && arg2 < class75.field1629[var5] + class191.field3713[var5] && class75.field1629[var5] < arg1 + arg2) {
                class137.field2679[var5] = true;
            }
        }
        if (arg4) {
            field2776 = null;
        }
        field2767++;
    }

    @OriginalMember(owner = "client!pf", name = "e", descriptor = "(I)Ld;")
    public final class30 method708(int arg0) {
        field2769++;
        if (this.field2764 != null) {
            int var2 = class18.field362 - this.field2754;
            if (var2 > 100 && this.field2764.field416 > 0) {
                var2 = 100;
            }
            label48: {
                do {
                    do {
                        if (this.field2764.field419[this.field2766] >= var2) {
                            break label48;
                        }
                        var2 -= this.field2764.field419[this.field2766];
                        this.field2766++;
                    } while (this.field2764.field430.length > this.field2766);
                    this.field2766 -= this.field2764.field416;
                } while (this.field2766 >= 0 && this.field2764.field430.length > this.field2766);
                this.field2764 = null;
            }
            this.field2754 = class18.field362 - var2;
        }
        class202 var3 = class99.method806(arg0 ^ arg0, this.field2761);
        if (var3.field3945 != null) {
            var3 = var3.method1326(-83);
        }
        if (var3 == null) {
            return null;
        }
        int var4;
        int var5;
        if (this.field2758 == 1 || this.field2758 == 3) {
            var5 = var3.field3949;
            var4 = var3.field3980;
        } else {
            var4 = var3.field3949;
            var5 = var3.field3980;
        }
        int var6 = this.field2768 + (var5 >> 1);
        int var7 = (var5 + 1 >> 1) + this.field2768;
        int var8 = this.field2762 + (var4 >> 1);
        int[][] var9 = class103.field2171[this.field2756];
        int var10 = this.field2762 + (var4 + 1 >> 1);
        int var11 = var9[var6][var8] + var9[var7][var10] + var9[var6][var10] + var9[var7][var8] >> 2;
        int var12 = (this.field2768 << 7) + (var5 << 6);
        int var13 = (this.field2762 << 7) + (var4 << 6);
        return var3.method1323(var11, this.field2764, this.field2766, var13, var12, (byte) -121, this.field2758, this.field2760, var9);
    }

    @OriginalMember(owner = "client!pf", name = "<init>", descriptor = "(IIIIIIIZLkb;)V")
    public class141(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class92 arg8) {
        this.field2762 = arg5;
        this.field2768 = arg4;
        this.field2761 = arg0;
        this.field2760 = arg1;
        this.field2756 = arg3;
        this.field2758 = arg2;
        if (arg6 != -1) {
            this.field2764 = class25.method236(false, arg6);
            this.field2766 = 0;
            this.field2754 = class18.field362 - 1;
            if (this.field2764.field442 == 0 && arg8 != null && arg8 instanceof class141) {
                class141 var10 = (class141) arg8;
                if (this.field2764 == var10.field2764) {
                    this.field2754 = var10.field2754;
                    this.field2766 = var10.field2766;
                    return;
                }
            }
            if (arg7 && this.field2764.field416 != -1) {
                this.field2766 = (int) (Math.random() * (double) this.field2764.field430.length);
                this.field2754 -= (int) (Math.random() * (double) this.field2764.field419[this.field2766]);
                return;
            }
        }
    }
}
