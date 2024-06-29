import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public class class51 extends class258 {

    @OriginalMember(owner = "client!dg", name = "F", descriptor = "I")
    private int field616 = 0;

    @OriginalMember(owner = "client!dg", name = "u", descriptor = "I")
    private int field606 = -32768;

    @OriginalMember(owner = "client!dg", name = "D", descriptor = "Z")
    private boolean field615 = false;

    @OriginalMember(owner = "client!dg", name = "db", descriptor = "I")
    private int field640 = 0;

    @OriginalMember(owner = "client!dg", name = "P", descriptor = "I")
    private int field626;

    @OriginalMember(owner = "client!dg", name = "V", descriptor = "I")
    public int field632;

    @OriginalMember(owner = "client!dg", name = "v", descriptor = "I")
    public int field607;

    @OriginalMember(owner = "client!dg", name = "W", descriptor = "I")
    private int field633;

    @OriginalMember(owner = "client!dg", name = "Q", descriptor = "I")
    private int field627;

    @OriginalMember(owner = "client!dg", name = "B", descriptor = "I")
    private int field613;

    @OriginalMember(owner = "client!dg", name = "G", descriptor = "I")
    private int field617;

    @OriginalMember(owner = "client!dg", name = "z", descriptor = "I")
    public int field611;

    @OriginalMember(owner = "client!dg", name = "A", descriptor = "I")
    public int field612;

    @OriginalMember(owner = "client!dg", name = "s", descriptor = "I")
    public int field604;

    @OriginalMember(owner = "client!dg", name = "H", descriptor = "I")
    private int field618;

    @OriginalMember(owner = "client!dg", name = "J", descriptor = "Lm;")
    private class149 field620;

    @OriginalMember(owner = "client!dg", name = "R", descriptor = "Lqj;")
    public static class196 field628 = class80.method502("null", -48);

    @OriginalMember(owner = "client!dg", name = "w", descriptor = "Lqj;")
    public static class196 field608 = class80.method502("VOLL", -48);

    @OriginalMember(owner = "client!dg", name = "t", descriptor = "D")
    private double field605;

    @OriginalMember(owner = "client!dg", name = "x", descriptor = "D")
    public double field609;

    @OriginalMember(owner = "client!dg", name = "y", descriptor = "D")
    private double field610;

    @OriginalMember(owner = "client!dg", name = "C", descriptor = "D")
    public double field614;

    @OriginalMember(owner = "client!dg", name = "I", descriptor = "D")
    private double field619;

    @OriginalMember(owner = "client!dg", name = "O", descriptor = "D")
    public double field625;

    @OriginalMember(owner = "client!dg", name = "Y", descriptor = "D")
    private double field635;

    @OriginalMember(owner = "client!dg", name = "bb", descriptor = "D")
    private double field638;

    @OriginalMember(owner = "client!dg", name = "K", descriptor = "I")
    public static int field621;

    @OriginalMember(owner = "client!dg", name = "L", descriptor = "I")
    public static int field622;

    @OriginalMember(owner = "client!dg", name = "M", descriptor = "I")
    private int field623;

    @OriginalMember(owner = "client!dg", name = "N", descriptor = "I")
    public static int field624;

    @OriginalMember(owner = "client!dg", name = "S", descriptor = "I")
    public static int field629;

    @OriginalMember(owner = "client!dg", name = "T", descriptor = "I")
    public static int field630;

    @OriginalMember(owner = "client!dg", name = "U", descriptor = "I")
    public static int field631;

    @OriginalMember(owner = "client!dg", name = "X", descriptor = "I")
    public static int field634;

    @OriginalMember(owner = "client!dg", name = "Z", descriptor = "I")
    public static int field636;

    @OriginalMember(owner = "client!dg", name = "eb", descriptor = "I")
    public int field641;

    @OriginalMember(owner = "client!dg", name = "ab", descriptor = "Lbk;")
    public static class136 field637;

    @OriginalMember(owner = "client!dg", name = "cb", descriptor = "[[[I")
    public static int[][][] field639;

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(I)Loc;")
    private final class119 method265(int arg0) {
        field621++;
        if (arg0 != -24630) {
            method272(25);
        }
        class209 var2 = class148.method929(1, this.field613);
        class119 var3 = var2.method1446(this.field640, (byte) -51);
        if (var3 == null) {
            return null;
        } else {
            var3.method737(this.field623);
            return var3;
        }
    }

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "()I")
    public final int method266() {
        field630++;
        return this.field606;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(II)V")
    public static final void method267(int arg0, int arg1) {
        class193.field3386.method1535(arg1, 30704);
        class253.field4474.method130(82, arg1);
        field622++;
        if (arg0 != 0) {
            method268(0.4146561576651362D, -20);
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(DI)V")
    public static final void method268(double arg0, int arg1) {
        if (arg1 != -2894) {
            return;
        }
        field624++;
        if (class185.field3256 == arg0) {
            return;
        }
        for (int var3 = 0; var3 < 256; var3++) {
            int var4 = (int) (Math.pow((double) var3 / 255.0D, arg0) * 255.0D);
            class183.field3217[var3] = var4 > 255 ? 255 : var4;
        }
        class185.field3256 = arg0;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method269(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        class119 var11 = this.method265(-24630);
        field634++;
        if (var11 != null) {
            var11.method269(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            this.field606 = var11.method266();
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IZ)V")
    public final void method270(int arg0, boolean arg1) {
        this.field615 = true;
        this.field609 += this.field638 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field605;
        this.field614 += (double) arg0 * this.field610;
        this.field605 += (double) arg0 * this.field638;
        field631++;
        this.field625 += (double) arg0 * this.field619;
        this.field641 = (int) (Math.atan2(this.field610, this.field619) * 325.949D) + 1024 & 0x7FF;
        this.field623 = (int) (Math.atan2(this.field605, this.field635) * 325.949D) & 0x7FF;
        if (this.field620 != null) {
            this.field616 += arg0;
            label30: while (true) {
                do {
                    do {
                        if (this.field620.field2361[this.field640] >= this.field616) {
                            break label30;
                        }
                        this.field616 -= this.field620.field2361[this.field640];
                        this.field640++;
                    } while (this.field640 < this.field620.field2362.length);
                    this.field640 -= this.field620.field2370;
                } while (this.field640 >= 0 && this.field620.field2362.length > this.field640);
                this.field640 = 0;
            }
        }
        if (arg1) {
            method273(75, -124);
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIIBI)V")
    public final void method271(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        field636++;
        if (!this.field615) {
            double var6 = (double) (arg0 - this.field627);
            double var8 = (double) (arg4 - this.field626);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field609 = this.field617;
            this.field614 = (double) this.field618 * var6 / var10 + (double) this.field627;
            this.field625 = (double) this.field618 * var8 / var10 + (double) this.field626;
        }
        double var12 = (double) (this.field632 + 1 - arg2);
        this.field619 = ((double) arg4 - this.field625) / var12;
        if (arg3 != -126) {
            this.method265(-65);
        }
        this.field610 = ((double) arg0 - this.field614) / var12;
        this.field635 = Math.sqrt(this.field619 * this.field619 + this.field610 * this.field610);
        if (!this.field615) {
            this.field605 = -this.field635 * Math.tan((double) this.field633 * 0.02454369D);
        }
        this.field638 = ((double) arg1 - this.field609 - this.field605 * var12) * 2.0D / (var12 * var12);
    }

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "(I)V")
    public static void method272(int arg0) {
        if (arg0 != 8578) {
            field637 = null;
        }
        field637 = null;
        field628 = null;
        field608 = null;
        field639 = null;
    }

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "(II)V")
    public static final void method273(int arg0, int arg1) {
        field629++;
        if (class86.field1275 == 0) {
            class143.field2185.method1055(arg1, (byte) -107);
        } else {
            class164.field2656 = arg1;
        }
        if (arg0 != -28579) {
            method273(115, -84);
        }
    }

    @OriginalMember(owner = "client!dg", name = "<init>", descriptor = "(IIIIIIIIIII)V")
    public class51(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field626 = arg3;
        this.field615 = false;
        this.field632 = arg6;
        this.field607 = arg9;
        this.field633 = arg7;
        this.field627 = arg2;
        this.field613 = arg0;
        this.field617 = arg4;
        this.field611 = arg10;
        this.field612 = arg5;
        this.field604 = arg1;
        this.field618 = arg8;
        int var12 = class148.method929(1, this.field613).field3773;
        if (var12 == -1) {
            this.field620 = null;
        } else {
            this.field620 = class116.method704(var12, -10304);
        }
    }
}
