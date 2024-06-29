import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class129 {

    @OriginalMember(owner = "client!w", name = "a", descriptor = "Z")
    public boolean field1952 = false;

    @OriginalMember(owner = "client!w", name = "g", descriptor = "[I")
    private int[] field1958 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!w", name = "p", descriptor = "I")
    public int field1967 = -1;

    @OriginalMember(owner = "client!w", name = "r", descriptor = "Lec;")
    public static class99 field1969 = new class99(64);

    @OriginalMember(owner = "client!w", name = "u", descriptor = "Ljava/lang/String;")
    public static String field1972 = "white:";

    @OriginalMember(owner = "client!w", name = "v", descriptor = "[[S")
    public static short[][] field1973 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client!w", name = "b", descriptor = "I")
    public static int field1953;

    @OriginalMember(owner = "client!w", name = "c", descriptor = "I")
    public static int field1954;

    @OriginalMember(owner = "client!w", name = "f", descriptor = "I")
    public static int field1957;

    @OriginalMember(owner = "client!w", name = "h", descriptor = "I")
    public static int field1959;

    @OriginalMember(owner = "client!w", name = "k", descriptor = "I")
    public static int field1962;

    @OriginalMember(owner = "client!w", name = "l", descriptor = "I")
    public static int field1963;

    @OriginalMember(owner = "client!w", name = "m", descriptor = "I")
    public static int field1964;

    @OriginalMember(owner = "client!w", name = "n", descriptor = "I")
    public static int field1965;

    @OriginalMember(owner = "client!w", name = "q", descriptor = "I")
    public static int field1968;

    @OriginalMember(owner = "client!w", name = "s", descriptor = "I")
    public static int field1970;

    @OriginalMember(owner = "client!w", name = "d", descriptor = "Ljd;")
    public static class95 field1955;

    @OriginalMember(owner = "client!w", name = "e", descriptor = "[I")
    private int[] field1956;

    @OriginalMember(owner = "client!w", name = "i", descriptor = "[S")
    private short[] field1960;

    @OriginalMember(owner = "client!w", name = "j", descriptor = "[S")
    private short[] field1961;

    @OriginalMember(owner = "client!w", name = "o", descriptor = "[S")
    private short[] field1966;

    @OriginalMember(owner = "client!w", name = "t", descriptor = "[S")
    private short[] field1971;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(B)Ltf;", line = 6)
    public final class128 method983(byte arg0) {
        field1968++;
        class128[] var2 = new class128[5];
        int var3 = 0;
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field1958[var4] != -1) {
                var2[var3++] = class128.method956(class71.field1023, this.field1958[var4], 0);
            }
        }
        class128 var5 = new class128(var2, var3);
        if (this.field1960 != null) {
            for (int var6 = 0; var6 < this.field1960.length; var6++) {
                var5.method978(this.field1960[var6], this.field1961[var6]);
            }
        }
        if (this.field1966 != null) {
            for (int var7 = 0; var7 < this.field1966.length; var7++) {
                var5.method970(this.field1966[var7], this.field1971[var7]);
            }
        }
        if (arg0 > -102) {
            method987((byte) 3);
        }
        return var5;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(I)Ltf;", line = 62)
    public final class128 method984(int arg0) {
        field1970++;
        if (arg0 != -13746) {
            this.field1960 = (short[]) null;
        }
        if (this.field1956 == null) {
            return null;
        }
        class128[] var2 = new class128[this.field1956.length];
        for (int var3 = 0; var3 < this.field1956.length; var3++) {
            var2[var3] = class128.method956(class71.field1023, this.field1956[var3], 0);
        }
        class128 var4;
        if (var2.length == 1) {
            var4 = var2[0];
        } else {
            var4 = new class128(var2, var2.length);
        }
        if (this.field1960 != null) {
            for (int var5 = 0; var5 < this.field1960.length; var5++) {
                var4.method978(this.field1960[var5], this.field1961[var5]);
            }
        }
        if (this.field1966 != null) {
            for (int var6 = 0; var6 < this.field1966.length; var6++) {
                var4.method970(this.field1966[var6], this.field1971[var6]);
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!w", name = "b", descriptor = "(B)V", line = 118)
    public static void method985(byte arg0) {
        field1955 = null;
        field1972 = null;
        field1973 = (short[][]) null;
        if (arg0 == -20) {
            field1969 = null;
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "([Ljava/lang/Object;[JIII)V", line = 132)
    public static final void method986(Object[] arg0, long[] arg1, int arg2, int arg3, int arg4) {
        if (arg3 != -1) {
            method985((byte) 92);
        }
        field1962++;
        if (arg4 >= arg2) {
            return;
        }
        int var5 = (arg4 + arg2) / 2;
        int var6 = arg4;
        long var7 = arg1[var5];
        arg1[var5] = arg1[arg2];
        arg1[arg2] = var7;
        Object var9 = arg0[var5];
        arg0[var5] = arg0[arg2];
        arg0[arg2] = var9;
        for (int var10 = arg4; var10 < arg2; var10++) {
            if (arg1[var10] < ((long) (var10 & 0x1) + var7)) {
                long var11 = arg1[var10];
                arg1[var10] = arg1[var6];
                arg1[var6] = var11;
                Object var13 = arg0[var10];
                arg0[var10] = arg0[var6];
                arg0[var6++] = var13;
            }
        }
        arg1[arg2] = arg1[var6];
        arg1[var6] = var7;
        arg0[arg2] = arg0[var6];
        arg0[var6] = var9;
        method986(arg0, arg1, var6 - 1, -1, arg4);
        method986(arg0, arg1, arg2, -1, var6 + 1);
    }

    @OriginalMember(owner = "client!w", name = "c", descriptor = "(B)V", line = 187)
    public static final void method987(byte arg0) {
        if (arg0 < 43) {
            method987((byte) -18);
        }
        class173.field2790.method752(false);
        field1959++;
        class233.field3540.method752(false);
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Lwm;I)V", line = 203)
    public final void method988(class254 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method1774((byte) 12);
            if (var3 == 0) {
                if (arg1 != -14999) {
                    this.method992(-5);
                }
                field1965++;
                return;
            }
            this.method989((byte) -126, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(BILwm;)V", line = 226)
    private final void method989(byte arg0, int arg1, class254 arg2) {
        if (arg1 == 1) {
            this.field1967 = arg2.method1774((byte) -119);
        } else if (arg1 == 2) {
            int var4 = arg2.method1774((byte) -101);
            this.field1956 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field1956[var5] = arg2.method1755(false);
            }
        } else if (arg1 == 3) {
            this.field1952 = true;
        } else if (arg1 == 40) {
            int var8 = arg2.method1774((byte) 10);
            this.field1961 = new short[var8];
            this.field1960 = new short[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field1960[var9] = (short) arg2.method1755(false);
                this.field1961[var9] = (short) arg2.method1755(false);
            }
        } else if (arg1 == 41) {
            int var6 = arg2.method1774((byte) 105);
            this.field1966 = new short[var6];
            this.field1971 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field1966[var7] = (short) arg2.method1755(false);
                this.field1971[var7] = (short) arg2.method1755(false);
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field1958[arg1 - 60] = arg2.method1755(false);
        }
        field1953++;
        if (arg0 > -70) {
            this.method984(70);
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Ljava/lang/String;I)I", line = 306)
    public static final int method990(String arg0, int arg1) {
        if (arg1 < 13) {
            return 15;
        } else {
            field1954++;
            return class151.method1143((byte) 58, 10, arg0, true);
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Ljd;I)V", line = 324)
    public static final void method991(class95 arg0, int arg1) {
        field1963++;
        int var2 = 122 / ((arg1 + 76) / 35);
        class67.field976 = arg0.method690((byte) -113, "runes");
    }

    @OriginalMember(owner = "client!w", name = "b", descriptor = "(I)Z", line = 334)
    public final boolean method992(int arg0) {
        field1957++;
        if (this.field1956 == null) {
            return true;
        }
        if (arg0 != -27106) {
            this.method984(-127);
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < this.field1956.length; var3++) {
            if (!class71.field1023.method716(0, arg0 + 42283, this.field1956[var3])) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!w", name = "d", descriptor = "(B)Z", line = 371)
    public final boolean method993(byte arg0) {
        boolean var2 = true;
        int var3 = -25 / ((72 - arg0) / 47);
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field1958[var4] != -1 && !class71.field1023.method716(0, 15177, this.field1958[var4])) {
                var2 = false;
            }
        }
        field1964++;
        return var2;
    }
}
