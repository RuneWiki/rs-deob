import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mo")
public class class482 {

    @OriginalMember(owner = "client!mo", name = "u", descriptor = "I")
    private int field6897 = 0;

    @OriginalMember(owner = "client!mo", name = "o", descriptor = "[Ltv;")
    public class435[] field6891;

    @OriginalMember(owner = "client!mo", name = "m", descriptor = "I")
    public int field6889;

    @OriginalMember(owner = "client!mo", name = "q", descriptor = "Lvh;")
    public static class125 field6893 = new class125(21, 4);

    @OriginalMember(owner = "client!mo", name = "v", descriptor = "Lvh;")
    public static class125 field6898 = new class125(82, 1);

    @OriginalMember(owner = "client!mo", name = "w", descriptor = "[[I")
    public static int[][] field6899 = new int[6][];

    @OriginalMember(owner = "client!mo", name = "c", descriptor = "I")
    public static int field6879;

    @OriginalMember(owner = "client!mo", name = "d", descriptor = "I")
    public static int field6880;

    @OriginalMember(owner = "client!mo", name = "e", descriptor = "I")
    public static int field6881;

    @OriginalMember(owner = "client!mo", name = "f", descriptor = "I")
    public static int field6882;

    @OriginalMember(owner = "client!mo", name = "g", descriptor = "I")
    public static int field6883;

    @OriginalMember(owner = "client!mo", name = "h", descriptor = "I")
    public static int field6884;

    @OriginalMember(owner = "client!mo", name = "j", descriptor = "I")
    public static int field6886;

    @OriginalMember(owner = "client!mo", name = "k", descriptor = "I")
    public static int field6887;

    @OriginalMember(owner = "client!mo", name = "l", descriptor = "I")
    public static int field6888;

    @OriginalMember(owner = "client!mo", name = "n", descriptor = "I")
    public static int field6890;

    @OriginalMember(owner = "client!mo", name = "p", descriptor = "I")
    public static int field6892;

    @OriginalMember(owner = "client!mo", name = "r", descriptor = "I")
    public static int field6894;

    @OriginalMember(owner = "client!mo", name = "s", descriptor = "I")
    public static int field6895;

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "J")
    private long field6877;

    @OriginalMember(owner = "client!mo", name = "i", descriptor = "J")
    public static long field6885;

    @OriginalMember(owner = "client!mo", name = "b", descriptor = "Ltv;")
    private class435 field6878;

    @OriginalMember(owner = "client!mo", name = "t", descriptor = "Ltv;")
    private class435 field6896;

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(B)Ltv;", line = 3)
    public final class435 method2810(byte arg0) {
        field6883++;
        if (this.field6878 == null) {
            return null;
        }
        class435 var2 = this.field6891[(int) ((long) (this.field6889 - 1) & this.field6877)];
        while (this.field6878 != var2) {
            if (this.field6878.field6265 == this.field6877) {
                class435 var3 = this.field6878;
                this.field6878 = this.field6878.field6259;
                return var3;
            }
            this.field6878 = this.field6878.field6259;
        }
        this.field6878 = null;
        return arg0 == -45 ? null : null;
    }

    @OriginalMember(owner = "client!mo", name = "b", descriptor = "(B)V", line = 36)
    public static void method2811(byte arg0) {
        field6898 = null;
        if (arg0 > -79) {
            field6885 = 37L;
        }
        field6893 = null;
        field6899 = null;
    }

    @OriginalMember(owner = "client!mo", name = "c", descriptor = "(B)Ljava/lang/String;", line = 51)
    public static final String method2812(byte arg0) {
        field6892++;
        if (class324.field4519 || class354.field4954 == null) {
            return "";
        } else {
            if (arg0 != 4) {
                field6885 = 124L;
            }
            return class354.field4954.field9549;
        }
    }

    @OriginalMember(owner = "client!mo", name = "d", descriptor = "(B)I", line = 68)
    public final int method2813(byte arg0) {
        field6887++;
        int var2 = 0;
        if (arg0 >= -17) {
            method2822((byte) -106, 67);
        }
        for (int var3 = 0; var3 < this.field6889; var3++) {
            class435 var4 = this.field6891[var3];
            class435 var5 = var4.field6259;
            while (var4 != var5) {
                var5 = var5.field6259;
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(I)Ltv;", line = 102)
    public final class435 method2814(int arg0) {
        field6888++;
        if (this.field6897 > 0 && this.field6891[this.field6897 - 1] != this.field6896) {
            class435 var2 = this.field6896;
            this.field6896 = var2.field6259;
            return var2;
        }
        if (arg0 != 4) {
            this.method2816(null, -47L, true);
        }
        while (this.field6889 > this.field6897) {
            class435 var3 = this.field6891[this.field6897++].field6259;
            if (this.field6891[this.field6897 - 1] != var3) {
                this.field6896 = var3.field6259;
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!mo", name = "b", descriptor = "(I)Ltv;", line = 136)
    public final class435 method2815(int arg0) {
        this.field6897 = arg0;
        field6890++;
        return this.method2814(4);
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(Ltv;JZ)V", line = 146)
    public final void method2816(class435 arg0, long arg1, boolean arg2) {
        if (arg2) {
            field6885 = -59L;
        }
        field6882++;
        if (arg0.field6258 != null) {
            arg0.method2549((byte) -91);
        }
        class435 var5 = this.field6891[(int) ((long) (this.field6889 - 1) & arg1)];
        arg0.field6258 = var5.field6258;
        arg0.field6259 = var5;
        arg0.field6258.field6259 = arg0;
        arg0.field6265 = arg1;
        arg0.field6259.field6258 = arg0;
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(B[Ltv;)I", line = 169)
    public final int method2817(byte arg0, class435[] arg1) {
        field6879++;
        int var3 = 0;
        for (int var4 = 0; var4 < this.field6889; var4++) {
            class435 var5 = this.field6891[var4];
            for (class435 var6 = var5.field6259; var6 != var5; var6 = var6.field6259) {
                arg1[var3++] = var6;
            }
        }
        if (arg0 != 118) {
            this.method2813((byte) 86);
        }
        return var3;
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(IJ)Ltv;", line = 202)
    public final class435 method2818(int arg0, long arg1) {
        field6880++;
        this.field6877 = arg1;
        class435 var4 = this.field6891[(int) ((long) (this.field6889 - 1) & arg1)];
        for (this.field6878 = var4.field6259; this.field6878 != var4; this.field6878 = this.field6878.field6259) {
            if (this.field6878.field6265 == arg1) {
                class435 var5 = this.field6878;
                this.field6878 = this.field6878.field6259;
                return var5;
            }
        }
        this.field6878 = null;
        if (arg0 != -22803) {
            this.method2820(false);
        }
        return null;
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(BI)Z", line = 232)
    public static final boolean method2819(byte arg0, int arg1) {
        field6884++;
        int var2 = -65 / ((arg0 - 54) / 61);
        return arg1 == 0 || arg1 == 1 || arg1 == 2;
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(Z)I", line = 243)
    public final int method2820(boolean arg0) {
        if (arg0) {
            this.field6878 = null;
        }
        field6894++;
        return this.field6889;
    }

    @OriginalMember(owner = "client!mo", name = "c", descriptor = "(I)V", line = 254)
    public final void method2821(int arg0) {
        field6886++;
        int var2 = 0;
        if (arg0 != 1) {
            this.method2815(89);
        }
        while (var2 < this.field6889) {
            class435 var3 = this.field6891[var2];
            while (true) {
                class435 var4 = var3.field6259;
                if (var3 == var4) {
                    var2++;
                    break;
                }
                var4.method2549((byte) -50);
            }
        }
        this.field6878 = null;
        this.field6896 = null;
    }

    @OriginalMember(owner = "client!mo", name = "<init>", descriptor = "(I)V", line = 288)
    public class482(int arg0) {
        this.field6891 = new class435[arg0];
        this.field6889 = arg0;
        for (int var2 = 0; var2 < arg0; var2++) {
            class435 var3 = this.field6891[var2] = new class435();
            var3.field6258 = var3;
            var3.field6259 = var3;
        }
    }

    @OriginalMember(owner = "client!mo", name = "b", descriptor = "(BI)Ldc;", line = 309)
    public static final class303 method2822(byte arg0, int arg1) {
        field6881++;
        class303[] var2 = class653.method3680((byte) -113);
        if (arg0 <= 98) {
            method2812((byte) -87);
        }
        for (int var3 = 0; var3 < var2.length; var3++) {
            if (var2[var3].field4247 == arg1) {
                return var2[var3];
            }
        }
        return null;
    }
}
