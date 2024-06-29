import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public class class250 {

    @OriginalMember(owner = "client!ii", name = "u", descriptor = "I")
    private int field3784 = 0;

    @OriginalMember(owner = "client!ii", name = "m", descriptor = "I")
    public int field3776;

    @OriginalMember(owner = "client!ii", name = "p", descriptor = "[Lma;")
    public class5[] field3779;

    @OriginalMember(owner = "client!ii", name = "g", descriptor = "F")
    public static float field3770;

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "I")
    public static int field3764;

    @OriginalMember(owner = "client!ii", name = "d", descriptor = "I")
    public static int field3767;

    @OriginalMember(owner = "client!ii", name = "e", descriptor = "I")
    public static int field3768;

    @OriginalMember(owner = "client!ii", name = "h", descriptor = "I")
    public static int field3771;

    @OriginalMember(owner = "client!ii", name = "i", descriptor = "I")
    public static int field3772;

    @OriginalMember(owner = "client!ii", name = "j", descriptor = "I")
    public static int field3773;

    @OriginalMember(owner = "client!ii", name = "k", descriptor = "I")
    public static int field3774;

    @OriginalMember(owner = "client!ii", name = "l", descriptor = "I")
    public static int field3775;

    @OriginalMember(owner = "client!ii", name = "n", descriptor = "I")
    public static int field3777;

    @OriginalMember(owner = "client!ii", name = "q", descriptor = "I")
    public static int field3780;

    @OriginalMember(owner = "client!ii", name = "r", descriptor = "I")
    public static int field3781;

    @OriginalMember(owner = "client!ii", name = "f", descriptor = "J")
    private long field3769;

    @OriginalMember(owner = "client!ii", name = "o", descriptor = "Lwn;")
    public static class330 field3778;

    @OriginalMember(owner = "client!ii", name = "s", descriptor = "Lma;")
    private class5 field3782;

    @OriginalMember(owner = "client!ii", name = "t", descriptor = "Lma;")
    private class5 field3783;

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "Ljd;")
    public static class95 field3766;

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "[[B")
    public static byte[][] field3765;

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(B)Lma;", line = 4)
    public final class5 method1705(byte arg0) {
        field3780++;
        if (arg0 <= 6) {
            return (class5) null;
        } else if (this.field3784 <= 0 || this.field3779[this.field3784 - 1] == this.field3783) {
            class5 var3;
            do {
                if (this.field3784 >= this.field3776) {
                    return null;
                }
                var3 = this.field3779[this.field3784++].field81;
            } while (this.field3779[this.field3784 - 1] == var3);
            this.field3783 = var3.field81;
            return var3;
        } else {
            class5 var2 = this.field3783;
            this.field3783 = var2.field81;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(I)Lma;", line = 42)
    public final class5 method1706(int arg0) {
        this.field3784 = arg0;
        field3774++;
        return this.method1705((byte) 124);
    }

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "(I)Lma;", line = 51)
    public final class5 method1707(int arg0) {
        field3777++;
        if (this.field3782 == null) {
            return null;
        } else if (arg0 == 345) {
            class5 var2 = this.field3779[(int) (this.field3769 & (long) (this.field3776 - 1))];
            while (this.field3782 != var2) {
                if (this.field3782.field69 == this.field3769) {
                    class5 var3 = this.field3782;
                    this.field3782 = this.field3782.field81;
                    return var3;
                }
                this.field3782 = this.field3782.field81;
            }
            this.field3782 = null;
            return null;
        } else {
            return (class5) null;
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(JBLma;)V", line = 88)
    public final void method1708(long arg0, byte arg1, class5 arg2) {
        if (arg2.field68 != null) {
            arg2.method39(arg1 ^ 0xFFFFD66C);
        }
        field3772++;
        class5 var5 = this.field3779[(int) (arg0 & (long) (this.field3776 - 1))];
        arg2.field81 = var5;
        arg2.field68 = var5.field68;
        if (arg1 != -79) {
            this.method1716(-10, -49L);
        }
        arg2.field69 = arg0;
        arg2.field68.field81 = arg2;
        arg2.field81.field68 = arg2;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(Lfc;III)V", line = 113)
    public static final void method1709(class110 arg0, int arg1, int arg2, int arg3) {
        if (arg2 < class75.field1091) {
            class79 var4 = class213.field3262[arg1][arg2 + 1][arg3];
            if (var4 != null && var4.field1179 != null && var4.field1179.field5305.method846()) {
                arg0.method835(var4.field1179.field5305, 128, 0, 0, true);
            }
        }
        if (arg3 < class75.field1091) {
            class79 var5 = class213.field3262[arg1][arg2][arg3 + 1];
            if (var5 != null && var5.field1179 != null && var5.field1179.field5305.method846()) {
                arg0.method835(var5.field1179.field5305, 0, 0, 128, true);
            }
        }
        if (arg2 < class75.field1091 && arg3 < class115.field1818) {
            class79 var6 = class213.field3262[arg1][arg2 + 1][arg3 + 1];
            if (var6 != null && var6.field1179 != null && var6.field1179.field5305.method846()) {
                arg0.method835(var6.field1179.field5305, 128, 0, 128, true);
            }
        }
        if (arg2 < class75.field1091 && arg3 > 0) {
            class79 var7 = class213.field3262[arg1][arg2 + 1][arg3 - 1];
            if (var7 != null && var7.field1179 != null && var7.field1179.field5305.method846()) {
                arg0.method835(var7.field1179.field5305, 128, 0, -128, true);
            }
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(Z)I", line = 160)
    public final int method1710(boolean arg0) {
        field3767++;
        if (!arg0) {
            return 75;
        }
        int var2 = 0;
        for (int var3 = 0; var3 < this.field3776; var3++) {
            class5 var4 = this.field3779[var3];
            class5 var5 = var4.field81;
            while (var4 != var5) {
                var5 = var5.field81;
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "([Lma;I)I", line = 191)
    public final int method1711(class5[] arg0, int arg1) {
        field3775++;
        int var3 = arg1;
        for (int var4 = 0; var4 < this.field3776; var4++) {
            class5 var5 = this.field3779[var4];
            for (class5 var6 = var5.field81; var6 != var5; var6 = var6.field81) {
                arg0[var3++] = var6;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "(Z)V", line = 226)
    public static void method1712(boolean arg0) {
        field3765 = (byte[][]) null;
        if (arg0) {
            field3766 = (class95) null;
        }
        field3766 = null;
        field3778 = null;
    }

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "(I)V", line = 245)
    public final void method1713(int arg0) {
        for (int var2 = arg0; var2 < this.field3776; var2++) {
            class5 var3 = this.field3779[var2];
            while (true) {
                class5 var4 = var3.field81;
                if (var3 == var4) {
                    break;
                }
                var4.method39(10717);
            }
        }
        this.field3783 = null;
        field3764++;
        this.field3782 = null;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(IIIIIIIII)V", line = 275)
    public static final void method1714(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field3771++;
        int var9 = arg5 - arg0;
        int var10 = arg7 - arg1;
        int var11 = (arg2 - arg3 << 16) / var9;
        int var12 = (arg6 - arg4 << 16) / var10;
        class275.method1915((byte) -120, arg4, 0, arg8, var11, arg3, var12, arg0, arg7, arg5, arg1);
    }

    @OriginalMember(owner = "client!ii", name = "d", descriptor = "(I)I", line = 290)
    public final int method1715(int arg0) {
        field3773++;
        return arg0 == 0 ? this.field3776 : 102;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(IJ)Lma;", line = 302)
    public final class5 method1716(int arg0, long arg1) {
        this.field3769 = arg1;
        field3781++;
        class5 var4 = this.field3779[(int) ((long) (this.field3776 + arg0) & arg1)];
        for (this.field3782 = var4.field81; this.field3782 != var4; this.field3782 = this.field3782.field81) {
            if (this.field3782.field69 == arg1) {
                class5 var5 = this.field3782;
                this.field3782 = this.field3782.field81;
                return var5;
            }
        }
        this.field3782 = null;
        return null;
    }

    @OriginalMember(owner = "client!ii", name = "<init>", descriptor = "(I)V", line = 328)
    public class250(int arg0) {
        this.field3776 = arg0;
        this.field3779 = new class5[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class5 var3 = this.field3779[var2] = new class5();
            var3.field68 = var3;
            var3.field81 = var3;
        }
    }
}
