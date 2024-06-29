import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wr")
public class class459 {

    @OriginalMember(owner = "client!wr", name = "r", descriptor = "I")
    private int field6360 = 0;

    @OriginalMember(owner = "client!wr", name = "c", descriptor = "I")
    public int field6345;

    @OriginalMember(owner = "client!wr", name = "d", descriptor = "[Lgda;")
    public class55[] field6346;

    @OriginalMember(owner = "client!wr", name = "b", descriptor = "I")
    public static int field6344;

    @OriginalMember(owner = "client!wr", name = "f", descriptor = "I")
    public static int field6348;

    @OriginalMember(owner = "client!wr", name = "g", descriptor = "I")
    public static int field6349;

    @OriginalMember(owner = "client!wr", name = "i", descriptor = "I")
    public static int field6351;

    @OriginalMember(owner = "client!wr", name = "j", descriptor = "I")
    public static int field6352;

    @OriginalMember(owner = "client!wr", name = "k", descriptor = "I")
    public static int field6353;

    @OriginalMember(owner = "client!wr", name = "l", descriptor = "I")
    public static int field6354;

    @OriginalMember(owner = "client!wr", name = "n", descriptor = "I")
    public static int field6356;

    @OriginalMember(owner = "client!wr", name = "o", descriptor = "I")
    public static int field6357;

    @OriginalMember(owner = "client!wr", name = "p", descriptor = "I")
    public static int field6358;

    @OriginalMember(owner = "client!wr", name = "s", descriptor = "I")
    public static int field6361;

    @OriginalMember(owner = "client!wr", name = "e", descriptor = "J")
    private long field6347;

    @OriginalMember(owner = "client!wr", name = "m", descriptor = "Lgda;")
    private class55 field6355;

    @OriginalMember(owner = "client!wr", name = "q", descriptor = "Lgda;")
    private class55 field6359;

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "[I")
    public static int[] field6343;

    @OriginalMember(owner = "client!wr", name = "h", descriptor = "[[B")
    public static byte[][] field6350;

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(JI)Lgda;", line = 3)
    public final class55 method2552(long arg0, int arg1) {
        field6358++;
        this.field6347 = arg0;
        class55 var4 = this.field6346[(int) (arg0 & (long) (this.field6345 + arg1))];
        for (this.field6355 = var4.field564; this.field6355 != var4; this.field6355 = this.field6355.field564) {
            if (this.field6355.field556 == arg0) {
                class55 var5 = this.field6355;
                this.field6355 = this.field6355.field564;
                return var5;
            }
        }
        this.field6355 = null;
        return null;
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(Lsba;II)I", line = 30)
    public static final int method2553(class218 arg0, int arg1, int arg2) {
        if (arg1 >= -23) {
            method2553(null, -63, -59);
        }
        field6357++;
        if (!client.method1835(arg0).method3965((byte) -72, arg2) && arg0.field2804 == null) {
            return -1;
        } else if (arg0.field2801 == null || arg0.field2801.length <= arg2) {
            return -1;
        } else {
            return arg0.field2801[arg2];
        }
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "([Lgda;B)I", line = 45)
    public final int method2554(class55[] arg0, byte arg1) {
        field6348++;
        int var3 = 0;
        for (int var4 = 0; var4 < this.field6345; var4++) {
            class55 var5 = this.field6346[var4];
            for (class55 var6 = var5.field564; var6 != var5; var6 = var6.field564) {
                arg0[var3++] = var6;
            }
        }
        if (arg1 != 74) {
            method2562((byte) 120);
        }
        return var3;
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(I)Lgda;", line = 82)
    public final class55 method2555(int arg0) {
        field6354++;
        if (this.field6355 == null) {
            return null;
        }
        class55 var2 = this.field6346[(int) ((long) (this.field6345 - 1) & this.field6347)];
        while (this.field6355 != var2) {
            if (this.field6355.field556 == this.field6347) {
                class55 var4 = this.field6355;
                this.field6355 = this.field6355.field564;
                return var4;
            }
            this.field6355 = this.field6355.field564;
        }
        this.field6355 = null;
        int var3 = -38 / ((70 - arg0) / 48);
        return null;
    }

    @OriginalMember(owner = "client!wr", name = "b", descriptor = "(I)V", line = 112)
    public final void method2556(int arg0) {
        for (int var2 = 0; var2 < this.field6345; var2++) {
            class55 var3 = this.field6346[var2];
            while (true) {
                class55 var4 = var3.field564;
                if (var3 == var4) {
                    break;
                }
                var4.method315(79);
            }
        }
        if (arg0 < -59) {
            field6356++;
            this.field6355 = null;
            this.field6359 = null;
        }
    }

    @OriginalMember(owner = "client!wr", name = "c", descriptor = "(I)Lgda;", line = 151)
    public final class55 method2557(int arg0) {
        field6361++;
        if (~this.field6360 < arg0 && this.field6346[this.field6360 - 1] != this.field6359) {
            class55 var2 = this.field6359;
            this.field6359 = var2.field564;
            return var2;
        }
        while (this.field6360 < this.field6345) {
            class55 var3 = this.field6346[this.field6360++].field564;
            if (this.field6346[this.field6360 - 1] != var3) {
                this.field6359 = var3.field564;
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(Lgda;JI)V", line = 181)
    public final void method2558(class55 arg0, long arg1, int arg2) {
        if (arg0.field557 != null) {
            arg0.method315(58);
        }
        field6353++;
        class55 var5 = this.field6346[(int) (arg1 & (long) (this.field6345 + arg2))];
        arg0.field564 = var5;
        arg0.field557 = var5.field557;
        arg0.field557.field564 = arg0;
        arg0.field556 = arg1;
        arg0.field564.field557 = arg0;
    }

    @OriginalMember(owner = "client!wr", name = "<init>", descriptor = "(I)V", line = 205)
    public class459(int arg0) {
        this.field6345 = arg0;
        this.field6346 = new class55[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class55 var3 = this.field6346[var2] = new class55();
            var3.field557 = var3;
            var3.field564 = var3;
        }
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(B)I", line = 226)
    public final int method2559(byte arg0) {
        field6351++;
        if (arg0 <= 40) {
            field6350 = null;
        }
        return this.field6345;
    }

    @OriginalMember(owner = "client!wr", name = "d", descriptor = "(I)Lgda;", line = 237)
    public final class55 method2560(int arg0) {
        if (arg0 <= 93) {
            this.method2554(null, (byte) 45);
        }
        field6349++;
        this.field6360 = 0;
        return this.method2557(-1);
    }

    @OriginalMember(owner = "client!wr", name = "b", descriptor = "(B)I", line = 253)
    public final int method2561(byte arg0) {
        field6344++;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field6345; var3++) {
            class55 var4 = this.field6346[var3];
            for (class55 var5 = var4.field564; var5 != var4; var5 = var5.field564) {
                var2++;
            }
        }
        if (arg0 != -6) {
            field6343 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!wr", name = "c", descriptor = "(B)V", line = 284)
    public static void method2562(byte arg0) {
        field6350 = null;
        if (arg0 > -62) {
            field6352 = -27;
        }
        field6343 = null;
    }
}
