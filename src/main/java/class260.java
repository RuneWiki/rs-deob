import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class class260 extends class190 {

    @OriginalMember(owner = "client!lf", name = "Qb", descriptor = "Luh;")
    public static class75 field3879 = new class75();

    @OriginalMember(owner = "client!lf", name = "Ib", descriptor = "I")
    public static int field3871;

    @OriginalMember(owner = "client!lf", name = "Jb", descriptor = "I")
    private int field3872;

    @OriginalMember(owner = "client!lf", name = "Kb", descriptor = "I")
    public static int field3873;

    @OriginalMember(owner = "client!lf", name = "Lb", descriptor = "I")
    public static int field3874;

    @OriginalMember(owner = "client!lf", name = "Mb", descriptor = "I")
    public static int field3875;

    @OriginalMember(owner = "client!lf", name = "Nb", descriptor = "I")
    public static int field3876;

    @OriginalMember(owner = "client!lf", name = "Ob", descriptor = "I")
    public static int field3877;

    @OriginalMember(owner = "client!lf", name = "Pb", descriptor = "I")
    public static int field3878;

    @OriginalMember(owner = "client!lf", name = "Rb", descriptor = "I")
    public static int field3880;

    @OriginalMember(owner = "client!lf", name = "Ub", descriptor = "I")
    public static int field3883;

    @OriginalMember(owner = "client!lf", name = "Vb", descriptor = "I")
    public static int field3884;

    @OriginalMember(owner = "client!lf", name = "Wb", descriptor = "I")
    public static int field3885;

    @OriginalMember(owner = "client!lf", name = "Xb", descriptor = "I")
    public static int field3886;

    @OriginalMember(owner = "client!lf", name = "Sb", descriptor = "J")
    public static long field3881;

    @OriginalMember(owner = "client!lf", name = "Tb", descriptor = "Lcf;")
    private class72 field3882;

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "(II[BI)V", line = 9)
    public final void method1906(int arg0, int arg1, byte[] arg2, int arg3) {
        int var5 = 31 / ((36 - arg0) / 36);
        for (int var6 = 0; var6 < arg3; var6++) {
            arg2[var6 + arg1] = (byte) (this.field2718[this.field2776++] - this.field3882.method596(768));
        }
        field3886++;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "([BI)[B", line = 24)
    public static final byte[] method1907(byte[] arg0, int arg1) {
        field3884++;
        class190 var2 = new class190(arg0);
        if (arg1 >= -89) {
            field3879 = (class75) null;
        }
        int var3 = var2.method1319(255);
        int var4 = var2.method1371(-4);
        if (var4 < 0 || !(class149.field2147 == 0 || var4 <= class149.field2147)) {
            throw new RuntimeException();
        } else if (var3 == 0) {
            byte[] var5 = new byte[var4];
            var2.method1309(var4, 0, var5, -21941);
            return var5;
        } else {
            int var6 = var2.method1371(-4);
            if (var6 < 0 || !(class149.field2147 == 0 || class149.field2147 >= var6)) {
                throw new RuntimeException();
            }
            byte[] var7 = new byte[var6];
            if (var3 == 1) {
                class246.method1811(var7, var6, arg0, var4, 9);
            } else {
                class252.field3759.method2373((byte) 117, var2, var7);
            }
            return var7;
        }
    }

    @OriginalMember(owner = "client!lf", name = "<init>", descriptor = "(I)V", line = 76)
    public class260(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!lf", name = "l", descriptor = "(B)I", line = 81)
    public final int method1908(byte arg0) {
        field3878++;
        if (arg0 != -106) {
            this.field3882 = (class72) null;
        }
        return this.field2718[this.field2776++] - this.field3882.method596(768) & 0xFF;
    }

    @OriginalMember(owner = "client!lf", name = "m", descriptor = "(B)Z", line = 95)
    public static final boolean method1909(byte arg0) {
        field3874++;
        class75 var1 = field3879;
        synchronized (field3879) {
            if (class22.field341 == class209.field3054) {
                return false;
            }
            class107.field1548 = class19.field305[class209.field3054];
            if (arg0 != -8) {
                field3879 = (class75) null;
            }
            class137.field1993 = class321.field4830[class209.field3054];
            class209.field3054 = class209.field3054 + 1 & 0x7F;
            return true;
        }
    }

    @OriginalMember(owner = "client!lf", name = "n", descriptor = "(B)V", line = 115)
    public static void method1910(byte arg0) {
        if (arg0 >= 14) {
            field3879 = null;
        }
    }

    @OriginalMember(owner = "client!lf", name = "j", descriptor = "(II)I", line = 130)
    public final int method1911(int arg0, int arg1) {
        field3876++;
        int var3 = 8 - (this.field3872 & 0x7);
        int var4 = this.field3872 >> 3;
        this.field3872 += arg0;
        if (arg1 != 16811) {
            return 35;
        }
        int var5 = 0;
        while (var3 < arg0) {
            var5 += (this.field2718[var4++] & class126.field1844[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var6;
        if (arg0 == var3) {
            var6 = (this.field2718[var4] & class126.field1844[var3]) + var5;
        } else {
            var6 = (this.field2718[var4] >> var3 - arg0 & class126.field1844[arg0]) + var5;
        }
        return var6;
    }

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "(I[I)V", line = 161)
    public final void method1912(int arg0, int[] arg1) {
        field3875++;
        this.field3882 = new class72(arg1);
        if (arg0 >= -64) {
            field3881 = -16L;
        }
    }

    @OriginalMember(owner = "client!lf", name = "z", descriptor = "(I)V", line = 174)
    public final void method1913(int arg0) {
        int var2 = 62 % ((-arg0 - 79) / 32);
        this.field3872 = this.field2776 * 8;
        field3880++;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(ZI)V", line = 183)
    public static final void method1914(boolean arg0, int arg1) {
        field3885++;
        if (arg0 == class244.field3642) {
            return;
        }
        class244.field3642 = arg0;
        class77.method632(0);
        if (arg1 != -6528) {
            field3879 = (class75) null;
        }
    }

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "(ZI)V", line = 204)
    public final void method1915(boolean arg0, int arg1) {
        field3873++;
        if (!arg0) {
            field3881 = 46L;
        }
        this.field2718[this.field2776++] = (byte) (this.field3882.method596(768) + arg1);
    }

    @OriginalMember(owner = "client!lf", name = "k", descriptor = "(II)I", line = 220)
    public final int method1916(int arg0, int arg1) {
        if (arg0 != 8) {
            this.method1912(101, (int[]) null);
        }
        field3883++;
        return arg1 * 8 - this.field3872;
    }

    @OriginalMember(owner = "client!lf", name = "A", descriptor = "(I)V", line = 232)
    public final void method1917(int arg0) {
        int var2 = 71 % ((arg0 + 65) / 49);
        this.field2776 = (this.field3872 + 7) / 8;
        field3877++;
    }
}
