import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public class class769 {

    @OriginalMember(owner = "client!si", name = "u", descriptor = "I")
    private int field10625 = 0;

    @OriginalMember(owner = "client!si", name = "p", descriptor = "I")
    public int field10620;

    @OriginalMember(owner = "client!si", name = "i", descriptor = "[Lit;")
    public class766[] field10613;

    @OriginalMember(owner = "client!si", name = "g", descriptor = "Lin;")
    public static class380 field10611 = new class380(67, 6);

    @OriginalMember(owner = "client!si", name = "a", descriptor = "I")
    public static int field10605;

    @OriginalMember(owner = "client!si", name = "b", descriptor = "I")
    public static int field10606;

    @OriginalMember(owner = "client!si", name = "c", descriptor = "I")
    public static int field10607;

    @OriginalMember(owner = "client!si", name = "d", descriptor = "I")
    public static int field10608;

    @OriginalMember(owner = "client!si", name = "f", descriptor = "I")
    public static int field10610;

    @OriginalMember(owner = "client!si", name = "h", descriptor = "I")
    public static int field10612;

    @OriginalMember(owner = "client!si", name = "k", descriptor = "I")
    public static int field10615;

    @OriginalMember(owner = "client!si", name = "m", descriptor = "I")
    public static int field10617;

    @OriginalMember(owner = "client!si", name = "n", descriptor = "I")
    public static int field10618;

    @OriginalMember(owner = "client!si", name = "o", descriptor = "I")
    public static int field10619;

    @OriginalMember(owner = "client!si", name = "r", descriptor = "I")
    public static int field10622;

    @OriginalMember(owner = "client!si", name = "s", descriptor = "I")
    public static int field10623;

    @OriginalMember(owner = "client!si", name = "e", descriptor = "J")
    private long field10609;

    @OriginalMember(owner = "client!si", name = "j", descriptor = "Lit;")
    private class766 field10614;

    @OriginalMember(owner = "client!si", name = "t", descriptor = "Lit;")
    private class766 field10624;

    @OriginalMember(owner = "client!si", name = "q", descriptor = "Ljava/lang/Object;")
    public static Object field10621;

    @OriginalMember(owner = "client!si", name = "l", descriptor = "[Z")
    public static boolean[] field10616;

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IIIIII)V")
    public static final void method4247(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field10612++;
        int var6 = arg2 - arg5;
        int var7 = arg4 - arg1;
        if (arg0 == var6) {
            if (var7 != 0) {
                class122.method1066(arg4, arg3, arg5, arg1, (byte) -57);
            }
        } else if (var7 == 0) {
            class176.method1291(arg3, (byte) -104, arg5, arg1, arg2);
        } else {
            int var8 = (var7 << 12) / var6;
            int var9 = arg1 - (arg5 * var8 >> 12);
            int var10;
            int var11;
            if (arg2 < class742.field10301) {
                var10 = (class742.field10301 * var8 >> 12) + var9;
                var11 = class742.field10301;
            } else if (class435.field6058 < arg2) {
                var10 = (class435.field6058 * var8 >> 12) + var9;
                var11 = class435.field6058;
            } else {
                var11 = arg2;
                var10 = arg4;
            }
            int var12;
            int var13;
            if (class742.field10301 > arg5) {
                var13 = var9 + (class742.field10301 * var8 >> 12);
                var12 = class742.field10301;
            } else if (arg5 > class435.field6058) {
                var12 = class435.field6058;
                var13 = var9 + (class435.field6058 * var8 >> 12);
            } else {
                var12 = arg5;
                var13 = arg1;
            }
            if (var13 < class515.field7102) {
                var13 = class515.field7102;
                var12 = (class515.field7102 - var9 << 12) / var8;
            } else if (var13 > class698.field9801) {
                var12 = (class698.field9801 - var9 << 12) / var8;
                var13 = class698.field9801;
            }
            if (var10 < class515.field7102) {
                var11 = (class515.field7102 - var9 << 12) / var8;
                var10 = class515.field7102;
            } else if (var10 > class698.field9801) {
                var11 = (class698.field9801 - var9 << 12) / var8;
                var10 = class698.field9801;
            }
            class695.method3905(var11, var10, arg3, var12, false, var13);
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(I)Lit;")
    public final class766 method4248(int arg0) {
        field10623++;
        if (this.field10614 == null) {
            return null;
        }
        if (arg0 >= -39) {
            this.field10620 = 34;
        }
        class766 var2 = this.field10613[(int) ((long) (this.field10620 - 1) & this.field10609)];
        while (this.field10614 != var2) {
            if (this.field10614.field10592 == this.field10609) {
                class766 var3 = this.field10614;
                this.field10614 = this.field10614.field10591;
                return var3;
            }
            this.field10614 = this.field10614.field10591;
        }
        this.field10614 = null;
        return null;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(B)V")
    public final void method4249(byte arg0) {
        for (int var2 = 0; var2 < this.field10620; var2++) {
            class766 var3 = this.field10613[var2];
            while (true) {
                class766 var4 = var3.field10591;
                if (var3 == var4) {
                    break;
                }
                var4.method4237(-1);
            }
        }
        field10607++;
        if (arg0 >= 69) {
            this.field10624 = null;
            this.field10614 = null;
        }
    }

    @OriginalMember(owner = "client!si", name = "b", descriptor = "(I)I")
    public final int method4250(int arg0) {
        field10605++;
        if (arg0 < 6) {
            this.field10613 = null;
        }
        return this.field10620;
    }

    @OriginalMember(owner = "client!si", name = "c", descriptor = "(I)Lit;")
    public final class766 method4251(int arg0) {
        field10606++;
        if (this.field10625 > 0 && this.field10613[this.field10625 - 1] != this.field10624) {
            class766 var2 = this.field10624;
            this.field10624 = var2.field10591;
            return var2;
        }
        while (this.field10620 > this.field10625) {
            class766 var3 = this.field10613[this.field10625++].field10591;
            if (this.field10613[this.field10625 - 1] != var3) {
                this.field10624 = var3.field10591;
                return var3;
            }
        }
        return arg0 >= -43 ? null : null;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(ZLit;J)V")
    public final void method4252(boolean arg0, class766 arg1, long arg2) {
        if (arg0) {
            this.field10614 = null;
        }
        field10615++;
        if (arg1.field10584 != null) {
            arg1.method4237(-1);
        }
        class766 var5 = this.field10613[(int) ((long) (this.field10620 - 1) & arg2)];
        arg1.field10584 = var5.field10584;
        arg1.field10591 = var5;
        arg1.field10584.field10591 = arg1;
        arg1.field10591.field10584 = arg1;
        arg1.field10592 = arg2;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(JI)Lit;")
    public final class766 method4253(long arg0, int arg1) {
        field10622++;
        this.field10609 = arg0;
        class766 var4 = this.field10613[(int) ((long) (this.field10620 + arg1) & arg0)];
        for (this.field10614 = var4.field10591; this.field10614 != var4; this.field10614 = this.field10614.field10591) {
            if (this.field10614.field10592 == arg0) {
                class766 var5 = this.field10614;
                this.field10614 = this.field10614.field10591;
                return var5;
            }
        }
        this.field10614 = null;
        return null;
    }

    @OriginalMember(owner = "client!si", name = "b", descriptor = "(B)Lit;")
    public final class766 method4254(byte arg0) {
        this.field10625 = 0;
        field10617++;
        return arg0 == 8 ? this.method4251(-66) : null;
    }

    @OriginalMember(owner = "client!si", name = "d", descriptor = "(I)V")
    public static void method4255(int arg0) {
        field10611 = null;
        if (arg0 >= -115) {
            field10619 = -69;
        }
        field10616 = null;
        field10621 = null;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(I[Lit;)I")
    public final int method4256(int arg0, class766[] arg1) {
        field10618++;
        int var3 = 0;
        for (int var4 = 0; var4 < this.field10620; var4++) {
            class766 var5 = this.field10613[var4];
            for (class766 var6 = var5.field10591; var6 != var5; var6 = var6.field10591) {
                arg1[var3++] = var6;
            }
        }
        if (arg0 != 5669) {
            this.method4249((byte) -96);
        }
        return var3;
    }

    @OriginalMember(owner = "client!si", name = "e", descriptor = "(I)I")
    public final int method4257(int arg0) {
        field10610++;
        int var2 = 0;
        int var3 = 0;
        if (arg0 < 106) {
            this.field10614 = null;
        }
        while (var3 < this.field10620) {
            class766 var4 = this.field10613[var3];
            class766 var5 = var4.field10591;
            while (var4 != var5) {
                var5 = var5.field10591;
                var2++;
            }
            var3++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!si", name = "<init>", descriptor = "(I)V")
    public class769(int arg0) {
        this.field10620 = arg0;
        this.field10613 = new class766[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class766 var3 = this.field10613[var2] = new class766();
            var3.field10591 = var3;
            var3.field10584 = var3;
        }
    }
}
