import java.awt.event.KeyEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class66 implements class42 {

    @OriginalMember(owner = "client!jd", name = "i", descriptor = "Lse;")
    private class130 field1584 = new class130();

    @OriginalMember(owner = "client!jd", name = "q", descriptor = "I")
    private int field1592 = 0;

    @OriginalMember(owner = "client!jd", name = "o", descriptor = "D")
    private double field1590 = 1.0D;

    @OriginalMember(owner = "client!jd", name = "l", descriptor = "I")
    private int field1587 = 128;

    @OriginalMember(owner = "client!jd", name = "m", descriptor = "Lef;")
    private class35 field1588;

    @OriginalMember(owner = "client!jd", name = "s", descriptor = "I")
    private int field1594;

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "[Lqf;")
    private class117[] field1578;

    @OriginalMember(owner = "client!jd", name = "h", descriptor = "[I")
    public static int[] field1583 = new int[200];

    @OriginalMember(owner = "client!jd", name = "p", descriptor = "[I")
    public static int[] field1591 = new int[99];

    @OriginalMember(owner = "client!jd", name = "r", descriptor = "Lhe;")
    public static class54 field1593;

    @OriginalMember(owner = "client!jd", name = "w", descriptor = "Lsf;")
    public static class131 field1598;

    @OriginalMember(owner = "client!jd", name = "x", descriptor = "Lhe;")
    public static class54 field1599;

    @OriginalMember(owner = "client!jd", name = "z", descriptor = "I")
    public static int field1601;

    @OriginalMember(owner = "client!jd", name = "D", descriptor = "Z")
    public static boolean field1605;

    @OriginalMember(owner = "client!jd", name = "B", descriptor = "[I")
    public static int[] field1603;

    @OriginalMember(owner = "client!jd", name = "I", descriptor = "Z")
    public static boolean field1610;

    @OriginalMember(owner = "client!jd", name = "F", descriptor = "Lhe;")
    public static class54 field1607;

    @OriginalMember(owner = "client!jd", name = "A", descriptor = "Lhe;")
    public static class54 field1602;

    @OriginalMember(owner = "client!jd", name = "J", descriptor = "Lhe;")
    public static class54 field1611;

    @OriginalMember(owner = "client!jd", name = "E", descriptor = "Lhe;")
    public static class54 field1606;

    @OriginalMember(owner = "client!jd", name = "H", descriptor = "Lhe;")
    public static class54 field1609;

    @OriginalMember(owner = "client!jd", name = "C", descriptor = "Lhe;")
    public static class54 field1604;

    @OriginalMember(owner = "client!jd", name = "G", descriptor = "Lhe;")
    public static class54 field1608;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "I")
    public static int field1576;

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "I")
    public static int field1577;

    @OriginalMember(owner = "client!jd", name = "d", descriptor = "I")
    public static int field1579;

    @OriginalMember(owner = "client!jd", name = "e", descriptor = "I")
    public static int field1580;

    @OriginalMember(owner = "client!jd", name = "f", descriptor = "I")
    public static int field1581;

    @OriginalMember(owner = "client!jd", name = "g", descriptor = "I")
    public static int field1582;

    @OriginalMember(owner = "client!jd", name = "j", descriptor = "I")
    public static int field1585;

    @OriginalMember(owner = "client!jd", name = "k", descriptor = "I")
    public static int field1586;

    @OriginalMember(owner = "client!jd", name = "n", descriptor = "I")
    public static int field1589;

    @OriginalMember(owner = "client!jd", name = "t", descriptor = "I")
    public static int field1595;

    @OriginalMember(owner = "client!jd", name = "u", descriptor = "I")
    public static int field1596;

    @OriginalMember(owner = "client!jd", name = "v", descriptor = "I")
    public static int field1597;

    @OriginalMember(owner = "client!jd", name = "y", descriptor = "Lqb;")
    public static class113 field1600;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(I)V")
    public final void method509(int arg0) {
        field1579++;
        for (int var2 = arg0; var2 < this.field1578.length; var2++) {
            if (this.field1578[var2] != null) {
                this.field1578[var2].method885();
            }
        }
        this.field1584 = new class130();
        this.field1592 = this.field1594;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(ID)V")
    public final void method510(int arg0, double arg1) {
        field1585++;
        this.field1590 = arg1;
        this.method509(arg0 ^ arg0);
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Ljava/awt/event/KeyEvent;I)I")
    public static final int method511(KeyEvent arg0, int arg1) {
        field1576++;
        int var2 = arg0.getKeyChar();
        if (arg1 < 6) {
            method516(59);
        }
        if (var2 == 8364) {
            return 128;
        } else {
            if (var2 <= 0 || var2 >= 256) {
                var2 = -1;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IB)V")
    public final void method512(int arg0, byte arg1) {
        field1596++;
        for (int var3 = 0; var3 < this.field1578.length; var3++) {
            class117 var5 = this.field1578[var3];
            if (var5 != null && var5.field2747 != 0 && var5.field2744) {
                var5.method884(arg0);
                var5.field2744 = false;
            }
        }
        int var4 = -51 % ((-arg1 - 16) / 56);
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Lef;I)V")
    public static final void method513(class35 arg0, int arg1) {
        int var2 = -66 / ((-arg1 - 6) / 62);
        field1586++;
        class5.field162 = arg0;
        class157.field3577 = class5.field162.method262(16, true);
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(ZLhe;)I")
    public static final int method514(boolean arg0, class54 arg1) {
        field1582++;
        if (class31.field802 == 1) {
            return 7;
        } else if (arg1.method387(class6.field180, (byte) -95)) {
            return 1;
        } else if (arg1.method387(class27.field722, (byte) -95)) {
            return 1;
        } else if (arg1.method387(class151.field3410, (byte) -95)) {
            return 2;
        } else if (arg1.method387(class17.field511, (byte) -95)) {
            return 2;
        } else if (arg1.method387(class87.field2144, (byte) -95)) {
            return 3;
        } else if (arg1.method387(class120.field2791, (byte) -95)) {
            return 4;
        } else if (arg0) {
            return 44;
        } else if (arg1.method387(class56.field1401, (byte) -95)) {
            return 4;
        } else if (arg1.method387(class39.field1001, (byte) -95)) {
            return 5;
        } else if (arg1.method387(class111.field2654, (byte) -95)) {
            return 6;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(II)Z")
    public final boolean method323(int arg0, int arg1) {
        if (arg0 != 27513) {
            field1610 = false;
        }
        field1595++;
        return this.field1587 == 64;
    }

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "(II)[I")
    public final int[] method325(int arg0, int arg1) {
        field1577++;
        class117 var3 = this.field1578[arg1];
        int var4 = -2 / ((arg0 - 56) / 41);
        if (var3 != null) {
            if (var3.field2749 != null) {
                this.field1584.method985(false, var3);
                var3.field2744 = true;
                return var3.field2749;
            }
            boolean var5 = var3.method883(this.field1590, this.field1587, this.field1588);
            if (var5) {
                if (this.field1592 == 0) {
                    class117 var6 = (class117) this.field1584.method977(2);
                    var6.method885();
                } else {
                    this.field1592--;
                }
                this.field1584.method985(false, var3);
                var3.field2744 = true;
                return var3.field2749;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(ZII)Lhe;")
    public static final class54 method515(boolean arg0, int arg1, int arg2) {
        field1580++;
        if (arg2 <= 70) {
            field1604 = null;
        }
        return class149.method1134(10, -106, arg0, arg1);
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(II)I")
    public final int method324(int arg0, int arg1) {
        field1589++;
        if (arg0 <= 76) {
            return -85;
        } else if (this.field1578[arg1] == null) {
            return 0;
        } else {
            return this.field1578[arg1].field2742;
        }
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(I)V")
    public static void method516(int arg0) {
        field1603 = null;
        field1608 = null;
        field1606 = null;
        field1598 = null;
        field1599 = null;
        field1600 = null;
        field1591 = null;
        field1609 = null;
        field1611 = null;
        field1593 = null;
        field1607 = null;
        if (arg0 != 16) {
            method515(true, -70, 37);
        }
        field1604 = null;
        field1602 = null;
        field1583 = null;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(BI)Z")
    public final boolean method326(byte arg0, int arg1) {
        field1581++;
        int var3 = -14 % ((-arg0 - 70) / 45);
        return this.field1578[arg1].field2748;
    }

    @OriginalMember(owner = "client!jd", name = "<init>", descriptor = "(Lef;Lef;IDI)V")
    public class66(class35 arg0, class35 arg1, int arg2, double arg3, int arg4) {
        this.field1588 = arg1;
        this.field1590 = arg3;
        this.field1587 = arg4;
        this.field1594 = arg2;
        this.field1592 = this.field1594;
        int[] var7 = arg0.method270(92, 0);
        int var8 = var7.length;
        this.field1578 = new class117[arg0.method262(0, true)];
        for (int var9 = 0; var9 < var8; var9++) {
            class83 var10 = new class83(arg0.method266(0, (byte) 90, var7[var9]));
            this.field1578[var7[var9]] = new class117(var10);
        }
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) (Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D + (double) var2);
            var0 += var3;
            field1591[var1] = var0 / 4;
        }
        field1593 = class6.method58("Bitte versuchen Sie es erneut)3", false);
        field1598 = new class131(100);
        field1599 = class6.method58(")3runescape)3com", false);
        field1601 = 0;
        field1605 = false;
        field1603 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };
        field1610 = true;
        field1607 = class6.method58("", false);
        field1602 = field1607;
        field1611 = field1607;
        field1606 = field1607;
        field1609 = field1607;
        field1604 = field1607;
        field1608 = field1607;
    }
}
