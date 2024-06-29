import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wv")
public class class26 {

    @OriginalMember(owner = "client!wv", name = "b", descriptor = "B")
    public byte field555;

    @OriginalMember(owner = "client!wv", name = "l", descriptor = "I")
    public int field565;

    @OriginalMember(owner = "client!wv", name = "n", descriptor = "I")
    private int field567;

    @OriginalMember(owner = "client!wv", name = "m", descriptor = "I")
    public int field566;

    @OriginalMember(owner = "client!wv", name = "r", descriptor = "I")
    public int field571;

    @OriginalMember(owner = "client!wv", name = "u", descriptor = "Lwv;")
    public class26 field574;

    @OriginalMember(owner = "client!wv", name = "p", descriptor = "[C")
    public static char[] field569 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

    @OriginalMember(owner = "client!wv", name = "h", descriptor = "[I")
    public static int[] field561 = new int[8];

    @OriginalMember(owner = "client!wv", name = "w", descriptor = "Lrn;")
    public static class174 field576 = new class174(30, 3);

    @OriginalMember(owner = "client!wv", name = "x", descriptor = "I")
    public static int field577 = -1;

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "I")
    public static int field554;

    @OriginalMember(owner = "client!wv", name = "c", descriptor = "I")
    public int field556;

    @OriginalMember(owner = "client!wv", name = "d", descriptor = "I")
    public int field557;

    @OriginalMember(owner = "client!wv", name = "e", descriptor = "I")
    public int field558;

    @OriginalMember(owner = "client!wv", name = "f", descriptor = "I")
    public int field559;

    @OriginalMember(owner = "client!wv", name = "g", descriptor = "I")
    public static int field560;

    @OriginalMember(owner = "client!wv", name = "i", descriptor = "I")
    public int field562;

    @OriginalMember(owner = "client!wv", name = "j", descriptor = "I")
    public static int field563;

    @OriginalMember(owner = "client!wv", name = "k", descriptor = "I")
    public int field564;

    @OriginalMember(owner = "client!wv", name = "o", descriptor = "I")
    public int field568;

    @OriginalMember(owner = "client!wv", name = "q", descriptor = "I")
    public int field570;

    @OriginalMember(owner = "client!wv", name = "s", descriptor = "I")
    public static int field572;

    @OriginalMember(owner = "client!wv", name = "t", descriptor = "I")
    public int field573;

    @OriginalMember(owner = "client!wv", name = "v", descriptor = "J")
    public static long field575;

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(IIII)Lwv;", line = 15)
    public final class26 method314(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 == 4) {
            field560++;
            return new class26(this.field567, arg0, arg2, arg3, this.field555);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(Lqa;I)V", line = 30)
    public static final void method315(class162 arg0, int arg1) {
        field563++;
        if (arg1 != -32178 || class405.field6071.method2420(0) == 0) {
            return;
        }
        if (class169.field2624 == 0) {
            for (class476 var2 = (class476) class405.field6071.method2427(113); var2 != null; var2 = (class476) class405.field6071.method2422(-123)) {
                class367.field5550.method1320(false, false, var2.field7111 ? class139.field2224.field3717 : null, 0, var2.field7105, var2.field7113, var2.field7110, var2.field7109, arg0, var2.field7106, arg0, class328.field4954);
                var2.method2090(-1);
            }
            class511.method3061(arg1 ^ 0xFFFFDB75);
            return;
        }
        if (class402.field6038 == null) {
            Canvas var3 = new Canvas();
            var3.setSize(36, 32);
            class402.field6038 = class162.method1199(0, 0, 1, class455.field6791, class368.field5553, var3);
            class66.field1148 = class402.field6038.method260(class436.method2598((byte) 82, class76.field1270, 0, class272.field3931), class279.method1779(class151.field2407, class272.field3931, 0), true);
        }
        for (class476 var4 = (class476) class405.field6071.method2427(arg1 ^ 0xFFFF8231); var4 != null; var4 = (class476) class405.field6071.method2422(-81)) {
            class367.field5550.method1320(false, false, var4.field7111 ? class139.field2224.field3717 : null, 0, var4.field7105, var4.field7113, var4.field7110, var4.field7109, arg0, var4.field7106, class402.field6038, class66.field1148);
            var4.method2090(-1);
        }
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(ILgm;Lqa;III)V", line = 86)
    public static final void method316(int arg0, class79 arg1, class162 arg2, int arg3, int arg4, int arg5) {
        field572++;
        class421 var6 = class397.field5996.method1192(arg4 ^ 0xFF000022, arg1.field1349);
        if (var6.field6289 == -1) {
            return;
        }
        if (arg4 != -16777216) {
            method317((byte) -17);
        }
        int var8;
        if (arg1.field1339) {
            int var7 = arg1.field1354 + arg5;
            var8 = var7 & 0x3;
        } else {
            var8 = 0;
        }
        class529 var9 = var6.method2545(arg1.field1340, 1, var8, arg2);
        if (var9 == null) {
            return;
        }
        int var10 = arg1.field1345;
        int var11 = arg1.field1384;
        if ((var8 & 0x1) == 1) {
            var10 = arg1.field1384;
            var11 = arg1.field1345;
        }
        int var12 = var9.method100();
        int var13 = var9.method104();
        if (var6.field6290) {
            var12 = var10 * 4;
            var13 = var11 * 4;
        }
        if (var6.field6287 == 0) {
            var9.method3135(arg3, arg0 + 4 - var11 * 4, var12, var13);
        } else {
            var9.method105(arg3, arg0 - ((var11 - 1) * 4), var12, var13, 0, var6.field6287 | 0xFF000000, 1);
        }
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(B)V", line = 142)
    public static void method317(byte arg0) {
        field569 = null;
        field561 = null;
        field576 = null;
        if (arg0 != 124) {
            field576 = null;
        }
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(IIILrl;Lrl;)V", line = 157)
    public static final void method318(int arg0, int arg1, int arg2, class506 arg3, class506 arg4) {
        class429 var5 = class394.method2438(arg0, arg1, arg2);
        if (var5 != null) {
            var5.field6380 = arg3;
            var5.field6367 = arg4;
        }
    }

    @OriginalMember(owner = "client!wv", name = "<init>", descriptor = "(IIIIB)V", line = 166)
    public class26(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        this.field555 = arg4;
        this.field565 = arg3;
        this.field567 = arg0;
        this.field566 = arg2;
        this.field571 = arg1;
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(I)Lnc;", line = 178)
    public final class21 method319(int arg0) {
        field554++;
        if (arg0 < 120) {
            this.field570 = 62;
        }
        return class321.method2095(-16, this.field567);
    }

    @OriginalMember(owner = "client!wv", name = "<init>", descriptor = "(Lwv;I)V", line = 196)
    public class26(class26 arg0, int arg1) {
        this.field574 = arg0;
        this.field571 = this.field574.field571 + arg1;
        this.field555 = this.field574.field555;
        this.field567 = this.field574.field567;
        this.field565 = this.field574.field565 + arg1;
        this.field566 = this.field574.field566 + arg1;
    }
}
