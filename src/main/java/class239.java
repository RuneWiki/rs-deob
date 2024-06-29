import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class239 extends class264 {

    @OriginalMember(owner = "client!ab", name = "x", descriptor = "Z")
    private boolean field3691 = false;

    @OriginalMember(owner = "client!ab", name = "y", descriptor = "I")
    private int field3692 = 0;

    @OriginalMember(owner = "client!ab", name = "O", descriptor = "I")
    private int field3707 = -32768;

    @OriginalMember(owner = "client!ab", name = "ab", descriptor = "I")
    private int field3718 = -1;

    @OriginalMember(owner = "client!ab", name = "cb", descriptor = "I")
    private int field3720 = 0;

    @OriginalMember(owner = "client!ab", name = "I", descriptor = "I")
    public int field3701;

    @OriginalMember(owner = "client!ab", name = "r", descriptor = "I")
    private int field3685;

    @OriginalMember(owner = "client!ab", name = "E", descriptor = "I")
    private int field3698;

    @OriginalMember(owner = "client!ab", name = "db", descriptor = "I")
    private int field3721;

    @OriginalMember(owner = "client!ab", name = "Z", descriptor = "I")
    private int field3717;

    @OriginalMember(owner = "client!ab", name = "X", descriptor = "I")
    public int field3715;

    @OriginalMember(owner = "client!ab", name = "W", descriptor = "I")
    private int field3714;

    @OriginalMember(owner = "client!ab", name = "U", descriptor = "I")
    public int field3712;

    @OriginalMember(owner = "client!ab", name = "V", descriptor = "I")
    public int field3713;

    @OriginalMember(owner = "client!ab", name = "K", descriptor = "I")
    private int field3703;

    @OriginalMember(owner = "client!ab", name = "B", descriptor = "I")
    public int field3695;

    @OriginalMember(owner = "client!ab", name = "R", descriptor = "Lwg;")
    private class220 field3710;

    @OriginalMember(owner = "client!ab", name = "l", descriptor = "I")
    public static int field3679 = -1;

    @OriginalMember(owner = "client!ab", name = "p", descriptor = "Ljava/lang/String;")
    public static String field3683 = "level: ";

    @OriginalMember(owner = "client!ab", name = "S", descriptor = "I")
    public static int field3711 = 0;

    @OriginalMember(owner = "client!ab", name = "Q", descriptor = "Ljava/lang/String;")
    public static String field3709 = "Loading interfaces - ";

    @OriginalMember(owner = "client!ab", name = "v", descriptor = "I")
    public static int field3689 = 0;

    @OriginalMember(owner = "client!ab", name = "m", descriptor = "D")
    public double field3680;

    @OriginalMember(owner = "client!ab", name = "o", descriptor = "D")
    private double field3682;

    @OriginalMember(owner = "client!ab", name = "u", descriptor = "D")
    public double field3688;

    @OriginalMember(owner = "client!ab", name = "C", descriptor = "D")
    private double field3696;

    @OriginalMember(owner = "client!ab", name = "H", descriptor = "D")
    private double field3700;

    @OriginalMember(owner = "client!ab", name = "J", descriptor = "D")
    public double field3702;

    @OriginalMember(owner = "client!ab", name = "L", descriptor = "D")
    private double field3704;

    @OriginalMember(owner = "client!ab", name = "N", descriptor = "D")
    private double field3706;

    @OriginalMember(owner = "client!ab", name = "k", descriptor = "I")
    public static int field3678;

    @OriginalMember(owner = "client!ab", name = "n", descriptor = "I")
    public int field3681;

    @OriginalMember(owner = "client!ab", name = "q", descriptor = "I")
    public static int field3684;

    @OriginalMember(owner = "client!ab", name = "s", descriptor = "I")
    public static int field3686;

    @OriginalMember(owner = "client!ab", name = "t", descriptor = "I")
    public static int field3687;

    @OriginalMember(owner = "client!ab", name = "w", descriptor = "I")
    public static int field3690;

    @OriginalMember(owner = "client!ab", name = "z", descriptor = "I")
    public static int field3693;

    @OriginalMember(owner = "client!ab", name = "F", descriptor = "I")
    public static int field3699;

    @OriginalMember(owner = "client!ab", name = "M", descriptor = "I")
    public static int field3705;

    @OriginalMember(owner = "client!ab", name = "P", descriptor = "I")
    public static int field3708;

    @OriginalMember(owner = "client!ab", name = "Y", descriptor = "I")
    private int field3716;

    @OriginalMember(owner = "client!ab", name = "bb", descriptor = "I")
    public static int field3719;

    @OriginalMember(owner = "client!ab", name = "A", descriptor = "Lpk;")
    public static class237 field3694;

    @OriginalMember(owner = "client!ab", name = "D", descriptor = "Laa;")
    private class31 field3697;

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "(I)Lpb;")
    private final class2 method1635(int arg0) {
        class104 var2 = class296.method1957(this.field3717, true);
        field3693++;
        class2 var3 = var2.method757(this.field3692, this.field3720, (byte) -53, this.field3718);
        if (arg0 < 12) {
            this.field3685 = -25;
        }
        if (var3 == null) {
            return null;
        } else {
            var3.method24(this.field3716);
            return var3;
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIIIIIIIJILaa;)V")
    public final void method22(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class31 arg10) {
        class2 var13 = this.method1635(54);
        field3686++;
        if (var13 != null) {
            var13.method22(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field3697);
            this.field3707 = var13.method19();
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIIII)V")
    public final void method32(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3684++;
    }

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "(I)V")
    public static void method1636(int arg0) {
        field3709 = null;
        field3694 = null;
        field3683 = null;
        if (arg0 < 90) {
            method1638((char) 65443, -19);
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(II)I")
    public static final int method1637(int arg0, int arg1) {
        int var7 = arg0 - 1;
        if (arg1 != 0) {
            method1636(-98);
        }
        field3708++;
        int var2 = var7 | var7 >>> 1;
        int var3 = var2 | var2 >>> 2;
        int var4 = var3 | var3 >>> 4;
        int var5 = var4 | var4 >>> 8;
        int var6 = var5 | var5 >>> 16;
        return var6 + 1;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(CI)Z")
    public static final boolean method1638(char arg0, int arg1) {
        if (arg1 != 4) {
            method1637(14, -49);
        }
        field3678++;
        if (!(arg0 <= '\u0000' || arg0 >= '\u0080') || !(arg0 < ' ' || arg0 > 'ÿ')) {
            return true;
        }
        if (arg0 != '\u0000') {
            char[] var2 = class268.field4176;
            for (int var3 = 0; var3 < var2.length; var3++) {
                char var4 = var2[var3];
                if (arg0 == var4) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "(IIIII)V")
    public final void method1639(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 != -896147582) {
            return;
        }
        if (!this.field3691) {
            double var6 = (double) (arg2 - this.field3698);
            double var8 = (double) (arg4 - this.field3714);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field3680 = (double) this.field3685 * var8 / var10 + (double) this.field3714;
            this.field3702 = (double) this.field3685 * var6 / var10 + (double) this.field3698;
            this.field3688 = (double) this.field3721;
        }
        double var12 = (double) (this.field3712 - (arg1 - 1));
        field3719++;
        this.field3706 = ((double) arg4 - this.field3680) / var12;
        this.field3682 = ((double) arg2 - this.field3702) / var12;
        this.field3700 = Math.sqrt(this.field3706 * this.field3706 + this.field3682 * this.field3682);
        if (this.field3703 == -1) {
            this.field3704 = ((double) arg0 - this.field3688) / var12;
        } else {
            if (!this.field3691) {
                this.field3704 = -this.field3700 * Math.tan((double) this.field3703 * 0.02454369D);
            }
            this.field3696 = ((double) arg0 - this.field3688 - (this.field3704 * var12)) * 2.0D / (var12 * var12);
        }
    }

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "(II)V")
    public final void method1640(int arg0, int arg1) {
        this.field3680 += (double) arg0 * this.field3706;
        this.field3702 += (double) arg0 * this.field3682;
        if (this.field3703 == -1) {
            this.field3688 += (double) arg0 * this.field3704;
        } else {
            this.field3688 += this.field3696 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field3704;
            this.field3704 += (double) arg0 * this.field3696;
        }
        this.field3691 = true;
        this.field3681 = (int) (Math.atan2(this.field3682, this.field3706) * 325.949D) + 1024 & 0x7FF;
        field3690++;
        this.field3716 = (int) (Math.atan2(this.field3704, this.field3700) * 325.949D) & 0x7FF;
        if (arg1 >= -21) {
            field3683 = null;
        }
        if (this.field3710 == null) {
            return;
        }
        this.field3692 += arg0;
        while (true) {
            do {
                do {
                    if (this.field3710.field3422[this.field3720] >= this.field3692) {
                        return;
                    }
                    this.field3692 -= this.field3710.field3422[this.field3720];
                    this.field3720++;
                    if (this.field3710.field3413.length <= this.field3720) {
                        this.field3720 -= this.field3710.field3434;
                        if (this.field3720 < 0 || this.field3720 >= this.field3710.field3413.length) {
                            this.field3720 = 0;
                        }
                    }
                    this.field3718 = this.field3720 + 1;
                } while (this.field3710.field3413.length > this.field3718);
                this.field3718 -= this.field3710.field3434;
            } while (this.field3718 >= 0 && this.field3710.field3413.length > this.field3718);
            this.field3718 = -1;
        }
    }

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "()I")
    public final int method19() {
        field3699++;
        return this.field3707;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(Ljk;ILjava/lang/String;)Ljava/lang/String;")
    public static final String method1641(class297 arg0, int arg1, String arg2) {
        field3705++;
        if (~arg2.indexOf("%") == arg1) {
            return arg2;
        }
        while (true) {
            int var3 = arg2.indexOf("%1");
            if (var3 == -1) {
                while (true) {
                    int var4 = arg2.indexOf("%2");
                    if (var4 == -1) {
                        while (true) {
                            int var5 = arg2.indexOf("%3");
                            if (var5 == -1) {
                                while (true) {
                                    int var6 = arg2.indexOf("%4");
                                    if (var6 == -1) {
                                        while (true) {
                                            int var7 = arg2.indexOf("%5");
                                            if (var7 == -1) {
                                                while (true) {
                                                    int var8 = arg2.indexOf("%dns");
                                                    if (var8 == -1) {
                                                        return arg2;
                                                    }
                                                    String var9 = "";
                                                    if (class232.field3593 != null) {
                                                        if (class232.field3593.field709 == null) {
                                                            var9 = class283.method1878(671258456, class232.field3593.field710);
                                                        } else {
                                                            var9 = (String) class232.field3593.field709;
                                                        }
                                                    }
                                                    arg2 = arg2.substring(0, var8) + var9 + arg2.substring(var8 + 4);
                                                }
                                            }
                                            arg2 = arg2.substring(0, var7) + class256.method1735(1788373316, class137.method933(4, arg0, (byte) -11)) + arg2.substring(var7 + 2);
                                        }
                                    }
                                    arg2 = arg2.substring(0, var6) + class256.method1735(1788373316, class137.method933(3, arg0, (byte) -106)) + arg2.substring(var6 + 2);
                                }
                            }
                            arg2 = arg2.substring(0, var5) + class256.method1735(1788373316, class137.method933(2, arg0, (byte) -90)) + arg2.substring(var5 + 2);
                        }
                    }
                    arg2 = arg2.substring(0, var4) + class256.method1735(1788373316, class137.method933(1, arg0, (byte) -65)) + arg2.substring(var4 + 2);
                }
            }
            arg2 = arg2.substring(0, var3) + class256.method1735(arg1 ^ 0x6A986944, class137.method933(0, arg0, (byte) -55)) + arg2.substring(var3 + 2);
        }
    }

    @OriginalMember(owner = "client!ab", name = "<init>", descriptor = "(IIIIIIIIIII)V")
    public class239(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field3701 = arg5;
        this.field3685 = arg8;
        this.field3698 = arg2;
        this.field3721 = arg4;
        this.field3691 = false;
        this.field3717 = arg0;
        this.field3715 = arg9;
        this.field3714 = arg3;
        this.field3712 = arg6;
        this.field3713 = arg10;
        this.field3703 = arg7;
        this.field3695 = arg1;
        int var12 = class296.method1957(this.field3717, true).field1516;
        if (var12 == -1) {
            this.field3710 = null;
        } else {
            this.field3710 = class108.method781(var12, -1);
        }
    }
}
