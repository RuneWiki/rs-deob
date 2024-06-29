import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class38 extends class175 {

    @OriginalMember(owner = "client!sd", name = "z", descriptor = "I")
    private int field641 = -32768;

    @OriginalMember(owner = "client!sd", name = "j", descriptor = "I")
    private int field625 = 0;

    @OriginalMember(owner = "client!sd", name = "u", descriptor = "Z")
    private boolean field636 = false;

    @OriginalMember(owner = "client!sd", name = "B", descriptor = "Z")
    private boolean field643 = false;

    @OriginalMember(owner = "client!sd", name = "R", descriptor = "I")
    private int field659 = 0;

    @OriginalMember(owner = "client!sd", name = "k", descriptor = "I")
    private int field626;

    @OriginalMember(owner = "client!sd", name = "K", descriptor = "I")
    private int field652;

    @OriginalMember(owner = "client!sd", name = "r", descriptor = "I")
    public int field633;

    @OriginalMember(owner = "client!sd", name = "v", descriptor = "I")
    public int field637;

    @OriginalMember(owner = "client!sd", name = "p", descriptor = "I")
    private int field631;

    @OriginalMember(owner = "client!sd", name = "x", descriptor = "I")
    public int field639;

    @OriginalMember(owner = "client!sd", name = "X", descriptor = "I")
    private int field665;

    @OriginalMember(owner = "client!sd", name = "T", descriptor = "I")
    private int field661;

    @OriginalMember(owner = "client!sd", name = "M", descriptor = "I")
    public int field654;

    @OriginalMember(owner = "client!sd", name = "Y", descriptor = "I")
    public int field666;

    @OriginalMember(owner = "client!sd", name = "o", descriptor = "I")
    private int field630;

    @OriginalMember(owner = "client!sd", name = "W", descriptor = "Lkl;")
    private class35 field664;

    @OriginalMember(owner = "client!sd", name = "s", descriptor = "I")
    public static int field634 = 0;

    @OriginalMember(owner = "client!sd", name = "N", descriptor = "Z")
    public static boolean field655 = false;

    @OriginalMember(owner = "client!sd", name = "P", descriptor = "I")
    public static int field657 = 0;

    @OriginalMember(owner = "client!sd", name = "A", descriptor = "Loe;")
    public static class79 field642 = new class79(16);

    @OriginalMember(owner = "client!sd", name = "w", descriptor = "B")
    public static byte field638;

    @OriginalMember(owner = "client!sd", name = "h", descriptor = "D")
    private double field623;

    @OriginalMember(owner = "client!sd", name = "i", descriptor = "D")
    private double field624;

    @OriginalMember(owner = "client!sd", name = "E", descriptor = "D")
    private double field646;

    @OriginalMember(owner = "client!sd", name = "G", descriptor = "D")
    public double field648;

    @OriginalMember(owner = "client!sd", name = "H", descriptor = "D")
    private double field649;

    @OriginalMember(owner = "client!sd", name = "L", descriptor = "D")
    public double field653;

    @OriginalMember(owner = "client!sd", name = "O", descriptor = "D")
    private double field656;

    @OriginalMember(owner = "client!sd", name = "V", descriptor = "D")
    public double field663;

    @OriginalMember(owner = "client!sd", name = "l", descriptor = "I")
    public static int field627;

    @OriginalMember(owner = "client!sd", name = "m", descriptor = "I")
    public static int field628;

    @OriginalMember(owner = "client!sd", name = "n", descriptor = "I")
    public int field629;

    @OriginalMember(owner = "client!sd", name = "t", descriptor = "I")
    public static int field635;

    @OriginalMember(owner = "client!sd", name = "y", descriptor = "I")
    public static int field640;

    @OriginalMember(owner = "client!sd", name = "C", descriptor = "I")
    public static int field644;

    @OriginalMember(owner = "client!sd", name = "D", descriptor = "I")
    public static int field645;

    @OriginalMember(owner = "client!sd", name = "F", descriptor = "I")
    public static int field647;

    @OriginalMember(owner = "client!sd", name = "I", descriptor = "I")
    public static int field650;

    @OriginalMember(owner = "client!sd", name = "J", descriptor = "I")
    public static int field651;

    @OriginalMember(owner = "client!sd", name = "Q", descriptor = "I")
    public static int field658;

    @OriginalMember(owner = "client!sd", name = "S", descriptor = "I")
    private int field660;

    @OriginalMember(owner = "client!sd", name = "U", descriptor = "I")
    public static int field662;

    @OriginalMember(owner = "client!sd", name = "q", descriptor = "Lab;")
    private class295 field632;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(ILme;)Lme;", line = 4)
    public static final class75 method295(int arg0, class75 arg1) {
        field628++;
        if (arg1.field1280 != -1) {
            return class282.method1965(arg1.field1280, (byte) 6);
        }
        if (arg0 != 1860) {
            method298(1, -59);
        }
        int var2 = arg1.field1172 >>> 16;
        class83 var3 = new class83(class191.field3195);
        for (class146 var4 = (class146) var3.method580((byte) 0); var4 != null; var4 = (class146) var3.method578(arg0 - 1861)) {
            if (var4.field2474 == var2) {
                return class282.method1965((int) var4.field2418, (byte) 6);
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(BLpa;)V", line = 36)
    private final void method296(byte arg0, class155 arg1) {
        if (class147.field2485) {
            class30 var4 = (class30) arg1;
            if ((this.field632 == null || this.field632.field4943) && (var4.field408 != null || var4.field436 != null)) {
                this.field632 = new class295(class212.field3708, 1, 1);
            }
            if (this.field632 != null) {
                this.field632.method2029(var4.field408, var4.field436, false, var4.field427, var4.field422, var4.field418);
            }
        } else {
            class318 var3 = (class318) arg1;
            if ((this.field632 == null || this.field632.field4943) && (var3.field5461 != null || var3.field5460 != null)) {
                this.field632 = new class295(class212.field3708, 1, 1);
            }
            if (this.field632 != null) {
                this.field632.method2029(var3.field5461, var3.field5460, false, var3.field5454, var3.field5474, var3.field5452);
            }
        }
        this.field643 = true;
        field662++;
        if (arg0 != -18) {
            this.method297(99, -51, -68, 81, 86);
        }
    }

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "()I", line = 84)
    public final int method238() {
        field651++;
        return this.field641;
    }

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "(IIIII)V", line = 99)
    public final void method297(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (!this.field636) {
            double var6 = (double) (arg3 - this.field626);
            double var8 = (double) (arg2 - this.field631);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field653 = (double) this.field661 * var8 / var10 + (double) this.field631;
            this.field663 = (double) this.field661 * var6 / var10 + (double) this.field626;
            this.field648 = (double) this.field630;
        }
        field647++;
        double var12 = (double) (this.field666 - arg4 - arg1);
        this.field624 = ((double) arg3 - this.field663) / var12;
        this.field649 = ((double) arg2 - this.field653) / var12;
        this.field623 = Math.sqrt(this.field649 * this.field649 + this.field624 * this.field624);
        if (!this.field636) {
            this.field656 = -this.field623 * Math.tan((double) this.field665 * 0.02454369D);
        }
        this.field646 = ((double) arg0 - this.field648 - (this.field656 * var12)) * 2.0D / (var12 * var12);
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(II)V", line = 130)
    public static final void method298(int arg0, int arg1) {
        field635++;
        if (arg0 == -1 || !class69.field1086[arg0]) {
            return;
        }
        class93.field1695.method1592((byte) 103, arg0);
        if (class277.field4660[arg0] == null) {
            return;
        }
        boolean var2 = true;
        for (int var3 = arg1; var3 < class277.field4660[arg0].length; var3++) {
            if (class277.field4660[arg0][var3] != null) {
                if (class277.field4660[arg0][var3].field1184 == 2) {
                    var2 = false;
                } else {
                    class277.field4660[arg0][var3] = null;
                }
            }
        }
        if (var2) {
            class277.field4660[arg0] = null;
        }
        class69.field1086[arg0] = false;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(B)Lpa;", line = 173)
    private final class155 method299(byte arg0) {
        field640++;
        class64 var2 = class187.method1289(this.field652, (byte) -56);
        class155 var3 = var2.method412((byte) 108, this.field625);
        if (arg0 < 27) {
            this.field636 = false;
        }
        if (var3 == null) {
            return null;
        } else {
            var3.method217(this.field660);
            return var3;
        }
    }

    @OriginalMember(owner = "client!sd", name = "<init>", descriptor = "(IIIIIIIIIII)V", line = 296)
    public class38(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field626 = arg2;
        this.field652 = arg0;
        this.field633 = arg9;
        this.field636 = false;
        this.field637 = arg1;
        this.field631 = arg3;
        this.field639 = arg5;
        this.field665 = arg7;
        this.field661 = arg8;
        this.field654 = arg10;
        this.field666 = arg6;
        this.field630 = arg4;
        int var12 = class187.method1289(this.field652, (byte) 49).field999;
        if (var12 == -1) {
            this.field664 = null;
        } else {
            this.field664 = class284.method1973(var12, false);
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(Z)V", line = 211)
    public static void method300(boolean arg0) {
        if (!arg0) {
            method298(-57, -30);
        }
        field642 = null;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIII)V", line = 229)
    public final void method301(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field644++;
        if (!this.field643) {
            class155 var6 = this.method299((byte) 115);
            if (var6 == null) {
                return;
            }
            this.method296((byte) -18, var6);
        }
        if (this.field632 != null) {
            this.field632.method2034(arg0, arg1, arg3, arg2, arg4);
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIIIIIIJILab;)V", line = 278)
    public final void method209(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class295 arg10) {
        class155 var13 = this.method299((byte) 109);
        field627++;
        if (var13 != null) {
            this.method296((byte) -18, var13);
            var13.method209(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field632);
            this.field641 = var13.method238();
        }
    }

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "(II)V", line = 329)
    public final void method302(int arg0, int arg1) {
        this.field663 += (double) arg0 * this.field624;
        this.field648 += this.field646 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field656;
        this.field653 += (double) arg0 * this.field649;
        this.field636 = true;
        this.field656 += (double) arg0 * this.field646;
        field650++;
        this.field629 = arg1 + (int) (Math.atan2(this.field624, this.field649) * 325.949D) & 0x7FF;
        this.field660 = (int) (Math.atan2(this.field656, this.field623) * 325.949D) & 0x7FF;
        if (this.field664 == null) {
            return;
        }
        this.field659 += arg0;
        while (true) {
            do {
                do {
                    if (this.field664.field539[this.field625] >= this.field659) {
                        return;
                    }
                    this.field659 -= this.field664.field539[this.field625];
                    this.field625++;
                } while (this.field625 < this.field664.field547.length);
                this.field625 -= this.field664.field541;
            } while (this.field625 >= 0 && this.field625 < this.field664.field547.length);
            this.field625 = 0;
        }
    }
}
