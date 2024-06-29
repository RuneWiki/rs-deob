import java.awt.Point;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lu")
public class class46 extends class34 {

    @OriginalMember(owner = "client!lu", name = "t", descriptor = "I")
    private int field634 = 0;

    @OriginalMember(owner = "client!lu", name = "A", descriptor = "I")
    private int field641 = -1;

    @OriginalMember(owner = "client!lu", name = "H", descriptor = "I")
    private int field648 = 0;

    @OriginalMember(owner = "client!lu", name = "M", descriptor = "Z")
    public boolean field653 = false;

    @OriginalMember(owner = "client!lu", name = "C", descriptor = "I")
    private int field643 = 0;

    @OriginalMember(owner = "client!lu", name = "O", descriptor = "I")
    private int field655 = -32768;

    @OriginalMember(owner = "client!lu", name = "F", descriptor = "I")
    public int field646;

    @OriginalMember(owner = "client!lu", name = "T", descriptor = "I")
    private int field660;

    @OriginalMember(owner = "client!lu", name = "U", descriptor = "I")
    private int field661;

    @OriginalMember(owner = "client!lu", name = "N", descriptor = "Ljq;")
    private class348 field654;

    @OriginalMember(owner = "client!lu", name = "x", descriptor = "Lra;")
    public static class361 field638 = new class361(69, 2);

    @OriginalMember(owner = "client!lu", name = "u", descriptor = "I")
    public static int field635;

    @OriginalMember(owner = "client!lu", name = "v", descriptor = "I")
    public static int field636;

    @OriginalMember(owner = "client!lu", name = "w", descriptor = "I")
    public static int field637;

    @OriginalMember(owner = "client!lu", name = "y", descriptor = "I")
    public static int field639;

    @OriginalMember(owner = "client!lu", name = "z", descriptor = "I")
    public static int field640;

    @OriginalMember(owner = "client!lu", name = "B", descriptor = "I")
    public static int field642;

    @OriginalMember(owner = "client!lu", name = "D", descriptor = "I")
    public static int field644;

    @OriginalMember(owner = "client!lu", name = "E", descriptor = "I")
    public static int field645;

    @OriginalMember(owner = "client!lu", name = "G", descriptor = "I")
    public static int field647;

    @OriginalMember(owner = "client!lu", name = "I", descriptor = "I")
    public static int field649;

    @OriginalMember(owner = "client!lu", name = "J", descriptor = "I")
    public static int field650;

    @OriginalMember(owner = "client!lu", name = "K", descriptor = "I")
    public static int field651;

    @OriginalMember(owner = "client!lu", name = "L", descriptor = "I")
    public static int field652;

    @OriginalMember(owner = "client!lu", name = "P", descriptor = "I")
    public static int field656;

    @OriginalMember(owner = "client!lu", name = "Q", descriptor = "I")
    public static int field657;

    @OriginalMember(owner = "client!lu", name = "R", descriptor = "I")
    public static int field658;

    @OriginalMember(owner = "client!lu", name = "S", descriptor = "Lru;")
    private class231 field659;

    @OriginalMember(owner = "client!lu", name = "c", descriptor = "(Loa;I)V")
    public final void method67(class43 arg0, int arg1) {
        if (arg1 != 2) {
            field638 = null;
        }
        ++field657;
        class107 var3 = this.method425(arg1 ^ 29712, arg0, 0, this.field660);
        if (var3 != null) {
            class151 var4 = arg0.method402();
            var4.method146(super.field506, super.field510, super.field503);
            this.method428(false, var4, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!lu", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.field659 != null) {
            this.field659.method1463();
        }
        ++field656;
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(II)V")
    public static final void method423(int arg0, int arg1) {
        ++field658;
        if (!class260.field3509.field1292) {
            arg0 = -1;
        }
        if (~class378.field4846 != ~arg0) {
            if (~arg0 != 0) {
                class114 var2 = class122.field1588.method3638(true, arg0);
                class506 var3 = var2.method862((byte) 83);
                if (var3 != null) {
                    class688.field9413.method1043(new Point(var2.field1486, var2.field1487), var3.method2726(), class524.field6827, var3.method2725(), 17, var3.method2730());
                    class378.field4846 = arg0;
                } else {
                    arg0 = -1;
                }
            }
            if (~arg0 == arg1 && class378.field4846 != -1) {
                class688.field9413.method1043(new Point(), -1, class524.field6827, -1, 17, (int[]) null);
                class378.field4846 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!lu", name = "c", descriptor = "(I)Z")
    public final boolean method78(int arg0) {
        if (arg0 != 0) {
            this.field641 = 115;
        }
        ++field645;
        return false;
    }

    @OriginalMember(owner = "client!lu", name = "d", descriptor = "(I)I")
    public final int method270(int arg0) {
        ++field649;
        return arg0 != 2495 ? 85 : this.field655;
    }

    @OriginalMember(owner = "client!lu", name = "b", descriptor = "(II)V")
    public final void method424(int arg0, int arg1) {
        ++field637;
        if (!this.field653) {
            this.field634 += arg1;
            while (this.field654.field4453[this.field643] < this.field634) {
                this.field634 -= this.field654.field4453[this.field643];
                ++this.field643;
                if (~this.field654.field4463.length >= ~this.field643) {
                    this.field653 = true;
                    break;
                }
            }
            if (!this.field653) {
                class451.method2548(this.field654, super.field508, super.field503, super.field506, 255, false, this.field643);
            }
            int var3 = 117 % ((arg0 - -50) / 54);
        }
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(ILoa;II)Lba;")
    private final class107 method425(int arg0, class43 arg1, int arg2, int arg3) {
        if (arg0 != 29714) {
            this.field648 = -13;
        }
        ++field652;
        class322 var5 = class91.field1202.method986(arg3, false);
        class88 var6 = class353.field4540[super.field508];
        class88 var7 = ~this.field661 > -4 ? class353.field4540[this.field661 - -1] : null;
        return !this.field653 ? var5.method1862(class552.field7163, arg1, super.field506, (byte) -127, var7, this.field634, true, this.field643, arg2, super.field510, var6, this.field641, super.field503) : var5.method1862(class552.field7163, arg1, super.field506, (byte) -49, var7, 0, true, -1, arg2, super.field510, var6, -1, super.field503);
    }

    @OriginalMember(owner = "client!lu", name = "<init>", descriptor = "(IIIIIIIIIIIII)V")
    public class46(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        super(arg3, arg5, arg6, arg7, arg8, arg9, arg10, arg11, false, (byte) 0);
        this.field646 = arg1 + arg2;
        this.field660 = arg0;
        this.field661 = arg4;
        this.field648 = arg12;
        class322 var14 = class91.field1202.method986(this.field660, false);
        int var15 = var14.field4173;
        if (var15 != -1) {
            this.field654 = class552.field7163.method3031(51, var15);
            this.field653 = false;
        } else {
            this.field653 = true;
        }
        if (this.field646 == arg2) {
            class451.method2548(this.field654, super.field508, super.field503, super.field506, 255, false, this.field643);
        }
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(B)V")
    public final void method426(byte arg0) {
        if (arg0 != -49) {
            this.field646 = -4;
        }
        ++field647;
        if (this.field659 != null) {
            this.field659.method1463();
        }
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(I)V")
    public static void method427(int arg0) {
        if (arg0 < -59) {
            field638 = null;
        }
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(IILoa;I)Z")
    public final boolean method74(int arg0, int arg1, class43 arg2, int arg3) {
        if (arg3 > -98) {
            return false;
        } else {
            ++field642;
            return false;
        }
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(ZLq;Lba;Loa;)V")
    private final void method428(boolean arg0, class151 arg1, class107 arg2, class43 arg3) {
        ++field651;
        arg2.method819(arg1);
        class574[] var5 = arg2.method808();
        class32[] var6 = arg2.method795();
        if (arg0) {
            this.method428(true, (class151) null, (class107) null, (class43) null);
        }
        if ((this.field659 == null || this.field659.field3088) && (var5 != null || var6 != null)) {
            this.field659 = class231.method1467(class424.field5503, true);
        }
        if (this.field659 != null) {
            this.field659.method1462(arg3, (long) class424.field5503, var5, var6, false);
            this.field659.method1465(super.field508, super.field497, super.field501, super.field502, super.field505);
        }
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(BII)Z")
    public static final boolean method429(byte arg0, int arg1, int arg2) {
        ++field640;
        if (!class594.field8025) {
            return false;
        } else {
            int var3 = arg1 >> 16;
            int var4 = 93 / ((52 - arg0) / 41);
            int var5 = 65535 & arg1;
            if (class322.field4179[var3] != null && class322.field4179[var3][var5] != null) {
                class477 var6 = class322.field4179[var3][var5];
                if (~arg2 == 0 && var6.field6312 == 0) {
                    for (class57 var7 = (class57) class658.field9176.method2090(true); var7 != null; var7 = (class57) class658.field9176.method2088(-152)) {
                        if (var7.field776 == 50 || ~var7.field776 == -1004 || var7.field776 == 5 || var7.field776 == 15 || ~var7.field776 == -12) {
                            for (class477 var8 = class600.method3268(-24, var7.field777); var8 != null; var8 = class221.method1406(-106, var8)) {
                                if (var6.field6234 == var8.field6234) {
                                    return true;
                                }
                            }
                        }
                    }
                } else {
                    for (class57 var9 = (class57) class658.field9176.method2090(true); var9 != null; var9 = (class57) class658.field9176.method2088(-152)) {
                        if (~var9.field778 == ~arg2 && ~var6.field6234 == ~var9.field777 && (~var9.field776 == -51 || ~var9.field776 == -1004 || ~var9.field776 == -6 || var9.field776 == 15 || var9.field776 == 11)) {
                            return true;
                        }
                    }
                }
                return false;
            } else {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(IILoa;ILcq;ZI)V")
    public final void method73(int arg0, int arg1, class43 arg2, int arg3, class274 arg4, boolean arg5, int arg6) {
        if (arg6 >= -2) {
            field638 = null;
        }
        ++field650;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!lu", name = "d", descriptor = "(Loa;I)Lcd;")
    public final class564 method72(class43 arg0, int arg1) {
        ++field639;
        if (arg1 != 21098) {
            this.field646 = 22;
        }
        return null;
    }

    @OriginalMember(owner = "client!lu", name = "d", descriptor = "(B)V")
    public final void method77(byte arg0) {
        ++field635;
        if (arg0 != 7) {
            method430(-89, (class10) null, (class43) null, -44, (class700) null, 84, (class576) null, 121);
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(ILoo;Loa;ILkq;ILdt;I)V")
    public static final void method430(int arg0, class10 arg1, class43 arg2, int arg3, class700 arg4, int arg5, class576 arg6, int arg7) {
        ++field644;
        int var8 = -(arg0 / 2) + -5 + arg4.field9764;
        int var9 = arg5 + 2;
        if (~arg6.field7847 != -1) {
            arg2.method400(arg6.field7847, var8, 1 + arg3 * arg1.method51() + (arg5 - var9), (byte) 60, arg0 + 10, var9);
        }
        if (arg6.field7811 != 0) {
            arg2.method354(arg0 + 10, arg6.field7811, -102, var8, arg1.method51() * arg3 + -var9 - -1 + arg5, var9);
        }
        int var10 = arg6.field7838;
        if (arg4.field9766 && ~arg6.field7835 != 0) {
            var10 = arg6.field7835;
        }
        if (arg7 != 22384) {
            method427(91);
        }
        for (int var11 = 0; arg3 > var11; ++var11) {
            String var12 = class415.field5338[var11];
            if (~(arg3 + -1) < ~var11) {
                var12 = var12.substring(0, var12.length() - 4);
            }
            arg1.method50(arg2, var12, arg4.field9764, arg5, var10, true);
            arg5 += arg1.method51();
        }
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(Loa;B)Lpl;")
    public final class215 method71(class43 arg0, byte arg1) {
        ++field636;
        class107 var3 = this.method425(29714, arg0, 2048 | (~this.field648 == -1 ? 0 : 5), this.field660);
        if (var3 == null) {
            return null;
        } else {
            if (this.field648 != 0) {
                var3.method822(this.field648 * 2048);
            }
            class151 var4 = arg0.method402();
            var4.method146(super.field506, super.field510, super.field503);
            int var5 = -104 % ((12 - arg1) / 41);
            this.method428(false, var4, var3, arg0);
            if (this.field659 != null) {
                class282 var6 = this.field659.method1468();
                arg0.method365(var3, var6, var4, (class108) null, 0);
            } else {
                var3.method827(var4, (class108) null, 0);
            }
            this.field655 = var3.method816();
            return null;
        }
    }
}
