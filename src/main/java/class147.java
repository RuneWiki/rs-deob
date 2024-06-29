import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class147 extends class3 {

    @OriginalMember(owner = "client!jc", name = "dc", descriptor = "Lck;")
    public static class119 field2367 = class298.method1987((byte) 118, " <col=ffffff>");

    @OriginalMember(owner = "client!jc", name = "Rb", descriptor = "Luj;")
    public static class156 field2355 = new class156();

    @OriginalMember(owner = "client!jc", name = "ec", descriptor = "Lck;")
    public static class119 field2368 = class298.method1987((byte) 83, "sl_stars");

    @OriginalMember(owner = "client!jc", name = "gc", descriptor = "Lck;")
    public static class119 field2370 = class298.method1987((byte) 41, ": ");

    @OriginalMember(owner = "client!jc", name = "Pb", descriptor = "I")
    public static int field2353;

    @OriginalMember(owner = "client!jc", name = "Qb", descriptor = "I")
    public static int field2354;

    @OriginalMember(owner = "client!jc", name = "Sb", descriptor = "I")
    public static int field2356;

    @OriginalMember(owner = "client!jc", name = "Tb", descriptor = "I")
    public static int field2357;

    @OriginalMember(owner = "client!jc", name = "Vb", descriptor = "I")
    public static int field2359;

    @OriginalMember(owner = "client!jc", name = "Wb", descriptor = "I")
    public static int field2360;

    @OriginalMember(owner = "client!jc", name = "Xb", descriptor = "I")
    public static int field2361;

    @OriginalMember(owner = "client!jc", name = "Zb", descriptor = "I")
    private int field2363;

    @OriginalMember(owner = "client!jc", name = "ac", descriptor = "I")
    public static int field2364;

    @OriginalMember(owner = "client!jc", name = "bc", descriptor = "I")
    public static int field2365;

    @OriginalMember(owner = "client!jc", name = "cc", descriptor = "I")
    public static int field2366;

    @OriginalMember(owner = "client!jc", name = "fc", descriptor = "I")
    public static int field2369;

    @OriginalMember(owner = "client!jc", name = "Ub", descriptor = "Lue;")
    private class209 field2358;

    @OriginalMember(owner = "client!jc", name = "Yb", descriptor = "Ljava/awt/Font;")
    public static Font field2362;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "([II)V", line = 5)
    public final void method956(int[] arg0, int arg1) {
        field2359++;
        this.field2358 = new class209(arg0);
        if (arg1 != -18834) {
            this.method961(1, 22);
        }
    }

    @OriginalMember(owner = "client!jc", name = "m", descriptor = "(II)I", line = 16)
    public final int method957(int arg0, int arg1) {
        field2353++;
        return arg0 == 8 ? arg1 * 8 - this.field2363 : 21;
    }

    @OriginalMember(owner = "client!jc", name = "l", descriptor = "(B)I", line = 29)
    public final int method958(byte arg0) {
        field2360++;
        if (arg0 != 25) {
            this.method961(-111, 111);
        }
        return this.field101[this.field44++] - this.field2358.method1314(7) & 0xFF;
    }

    @OriginalMember(owner = "client!jc", name = "<init>", descriptor = "(I)V", line = 39)
    public class147(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!jc", name = "p", descriptor = "(I)V", line = 45)
    public final void method959(int arg0) {
        field2364++;
        if (arg0 >= -75) {
            method963((byte) -75, 29L);
        }
        this.field44 = (this.field2363 + 7) / 8;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IILva;Z)[Lmd;", line = 61)
    public static final class88[] method960(int arg0, int arg1, class36 arg2, boolean arg3) {
        field2356++;
        return class56.method414(arg0, arg2, arg3, arg1) ? class295.method1969(0) : null;
    }

    @OriginalMember(owner = "client!jc", name = "n", descriptor = "(II)I", line = 81)
    public final int method961(int arg0, int arg1) {
        field2365++;
        int var3 = -83 / ((-arg0 - 49) / 55);
        int var4 = 8 - (this.field2363 & 0x7);
        int var5 = this.field2363 >> 3;
        this.field2363 += arg1;
        int var6 = 0;
        while (arg1 > var4) {
            var6 += (this.field101[var5++] & class88.field1350[var4]) << arg1 - var4;
            arg1 -= var4;
            var4 = 8;
        }
        int var7;
        if (arg1 == var4) {
            var7 = (this.field101[var5] & class88.field1350[var4]) + var6;
        } else {
            var7 = (this.field101[var5] >> var4 - arg1 & class88.field1350[arg1]) + var6;
        }
        return var7;
    }

    @OriginalMember(owner = "client!jc", name = "q", descriptor = "(I)V", line = 111)
    public final void method962(int arg0) {
        this.field2363 = this.field44 * arg0;
        field2366++;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(BJ)Lck;", line = 119)
    public static final class119 method963(byte arg0, long arg1) {
        field2361++;
        if (arg1 <= 0L || arg1 >= 6582952005840035281L) {
            return null;
        } else if (arg1 % 37L == 0L) {
            return null;
        } else {
            int var3 = 0;
            for (long var4 = arg1; var4 != 0L; var4 /= 37L) {
                var3++;
            }
            byte[] var6 = new byte[var3];
            while (arg1 != 0L) {
                long var7 = arg1;
                arg1 /= 37L;
                var3--;
                var6[var3] = class73.field1138[(int) (var7 - (arg1 * 37L))];
            }
            class119 var9 = new class119();
            var9.field1838 = var6;
            if (arg0 != 0) {
                field2368 = (class119) null;
            }
            var9.field1825 = var6.length;
            return var9;
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIIILvc;JZ)V", line = 160)
    public static final void method964(int arg0, int arg1, int arg2, int arg3, class293 arg4, long arg5, boolean arg6) {
        if (arg4 == null) {
            return;
        }
        class199 var8 = new class199();
        var8.field3178 = arg4;
        var8.field3174 = arg1 * 128 + 64;
        var8.field3179 = arg2 * 128 + 64;
        var8.field3177 = arg3;
        var8.field3175 = arg5;
        var8.field3181 = arg6;
        if (class150.field2390[arg0][arg1][arg2] == null) {
            class150.field2390[arg0][arg1][arg2] = new class104(arg0, arg1, arg2);
        }
        class150.field2390[arg0][arg1][arg2].field1598 = var8;
    }

    @OriginalMember(owner = "client!jc", name = "f", descriptor = "(Z)V", line = 181)
    public static void method965(boolean arg0) {
        field2362 = null;
        field2355 = null;
        field2370 = null;
        field2367 = null;
        field2368 = null;
        if (!arg0) {
            method965(false);
        }
    }

    @OriginalMember(owner = "client!jc", name = "o", descriptor = "(II)V", line = 198)
    public final void method966(int arg0, int arg1) {
        this.field101[this.field44++] = (byte) (arg1 + this.field2358.method1314(7));
        field2354++;
        if (arg0 != 0) {
            field2355 = (class156) null;
        }
    }

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "(III[B)V", line = 211)
    public final void method967(int arg0, int arg1, int arg2, byte[] arg3) {
        field2357++;
        for (int var5 = arg2; var5 < arg1; var5++) {
            arg3[var5 + arg0] = (byte) (this.field101[this.field44++] - this.field2358.method1314(7));
        }
    }
}
