import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rda")
public class class467 {

    @OriginalMember(owner = "client!rda", name = "p", descriptor = "I")
    private int field6052 = 0;

    @OriginalMember(owner = "client!rda", name = "l", descriptor = "[Lko;")
    public class337[] field6048;

    @OriginalMember(owner = "client!rda", name = "i", descriptor = "I")
    public int field6045;

    @OriginalMember(owner = "client!rda", name = "g", descriptor = "Lhu;")
    public static class238 field6043 = new class238();

    @OriginalMember(owner = "client!rda", name = "r", descriptor = "Luw;")
    public static class208 field6054 = new class208(37, 8);

    @OriginalMember(owner = "client!rda", name = "b", descriptor = "I")
    public static int field6038;

    @OriginalMember(owner = "client!rda", name = "c", descriptor = "I")
    public static int field6039;

    @OriginalMember(owner = "client!rda", name = "d", descriptor = "I")
    public static int field6040;

    @OriginalMember(owner = "client!rda", name = "f", descriptor = "I")
    public static int field6042;

    @OriginalMember(owner = "client!rda", name = "h", descriptor = "I")
    public static int field6044;

    @OriginalMember(owner = "client!rda", name = "k", descriptor = "I")
    public static int field6047;

    @OriginalMember(owner = "client!rda", name = "m", descriptor = "I")
    public static int field6049;

    @OriginalMember(owner = "client!rda", name = "n", descriptor = "I")
    public static int field6050;

    @OriginalMember(owner = "client!rda", name = "s", descriptor = "I")
    public static int field6055;

    @OriginalMember(owner = "client!rda", name = "t", descriptor = "I")
    public static int field6056;

    @OriginalMember(owner = "client!rda", name = "j", descriptor = "J")
    private long field6046;

    @OriginalMember(owner = "client!rda", name = "q", descriptor = "J")
    public static long field6053;

    @OriginalMember(owner = "client!rda", name = "u", descriptor = "Lwm;")
    public static class30 field6057;

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "Lko;")
    private class337 field6037;

    @OriginalMember(owner = "client!rda", name = "o", descriptor = "Lko;")
    private class337 field6051;

    @OriginalMember(owner = "client!rda", name = "e", descriptor = "Loha;")
    public static class465 field6041;

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(B)Lko;")
    public final class337 method2610(byte arg0) {
        field6050++;
        if (arg0 > -14) {
            return null;
        } else {
            this.field6052 = 0;
            return this.method2620(0);
        }
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(IFFF)F")
    public static final float method2611(int arg0, float arg1, float arg2, float arg3) {
        if (arg0 == -1) {
            field6040++;
            return (arg2 - arg3) * arg1 + arg3;
        } else {
            return -0.8392252F;
        }
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "([Lko;I)I")
    public final int method2612(class337[] arg0, int arg1) {
        field6038++;
        if (arg1 != -1) {
            return -51;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < this.field6045; var4++) {
            class337 var5 = this.field6048[var4];
            for (class337 var6 = var5.field4111; var6 != var5; var6 = var6.field4111) {
                arg0[var3++] = var6;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(I)V")
    public static void method2613(int arg0) {
        field6043 = null;
        field6057 = null;
        field6054 = null;
        if (arg0 == -249) {
            field6041 = null;
        }
    }

    @OriginalMember(owner = "client!rda", name = "b", descriptor = "(B)I")
    public final int method2614(byte arg0) {
        if (arg0 > -91) {
            return -52;
        } else {
            field6056++;
            return this.field6045;
        }
    }

    @OriginalMember(owner = "client!rda", name = "b", descriptor = "(I)Lko;")
    public final class337 method2615(int arg0) {
        field6042++;
        if (this.field6037 == null) {
            return null;
        }
        class337 var2 = this.field6048[(int) (this.field6046 & (long) (this.field6045 - 1))];
        while (this.field6037 != var2) {
            if (this.field6037.field4108 == this.field6046) {
                class337 var3 = this.field6037;
                this.field6037 = this.field6037.field4111;
                return var3;
            }
            this.field6037 = this.field6037.field4111;
        }
        this.field6037 = null;
        return arg0 == 8 ? null : null;
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(JB)Lko;")
    public final class337 method2616(long arg0, byte arg1) {
        field6049++;
        this.field6046 = arg0;
        class337 var4 = this.field6048[(int) (arg0 & (long) (this.field6045 - 1))];
        for (this.field6037 = var4.field4111; this.field6037 != var4; this.field6037 = this.field6037.field4111) {
            if (this.field6037.field4108 == arg0) {
                class337 var6 = this.field6037;
                this.field6037 = this.field6037.field4111;
                return var6;
            }
        }
        int var5 = 46 % ((arg1 + 42) / 37);
        this.field6037 = null;
        return null;
    }

    @OriginalMember(owner = "client!rda", name = "c", descriptor = "(I)V")
    public final void method2617(int arg0) {
        for (int var2 = 0; var2 < this.field6045; var2++) {
            class337 var3 = this.field6048[var2];
            while (true) {
                class337 var4 = var3.field4111;
                if (var3 == var4) {
                    break;
                }
                var4.method1946(-10364);
            }
        }
        field6039++;
        this.field6037 = null;
        if (arg0 != 28812) {
            this.method2616(-118L, (byte) -126);
        }
        this.field6051 = null;
    }

    @OriginalMember(owner = "client!rda", name = "<init>", descriptor = "(I)V")
    public class467(int arg0) {
        this.field6048 = new class337[arg0];
        this.field6045 = arg0;
        for (int var2 = 0; var2 < arg0; var2++) {
            class337 var3 = this.field6048[var2] = new class337();
            var3.field4103 = var3;
            var3.field4111 = var3;
        }
    }

    @OriginalMember(owner = "client!rda", name = "d", descriptor = "(I)I")
    public final int method2618(int arg0) {
        field6047++;
        int var2 = 0;
        if (arg0 != -1) {
            this.method2614((byte) 73);
        }
        for (int var3 = 0; var3 < this.field6045; var3++) {
            class337 var4 = this.field6048[var3];
            class337 var5 = var4.field4111;
            while (var4 != var5) {
                var5 = var5.field4111;
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(Lko;JI)V")
    public final void method2619(class337 arg0, long arg1, int arg2) {
        field6055++;
        if (arg0.field4103 != null) {
            arg0.method1946(arg2 - 10363);
        }
        class337 var5 = this.field6048[(int) (arg1 & (long) (this.field6045 + arg2))];
        arg0.field4103 = var5.field4103;
        arg0.field4111 = var5;
        arg0.field4103.field4111 = arg0;
        arg0.field4108 = arg1;
        arg0.field4111.field4103 = arg0;
    }

    @OriginalMember(owner = "client!rda", name = "e", descriptor = "(I)Lko;")
    public final class337 method2620(int arg0) {
        field6044++;
        if (this.field6052 > 0 && this.field6048[this.field6052 - 1] != this.field6051) {
            class337 var2 = this.field6051;
            this.field6051 = var2.field4111;
            return var2;
        }
        if (arg0 != 0) {
            this.method2617(73);
        }
        while (this.field6052 < this.field6045) {
            class337 var3 = this.field6048[this.field6052++].field4111;
            if (this.field6048[this.field6052 - 1] != var3) {
                this.field6051 = var3.field4111;
                return var3;
            }
        }
        return null;
    }
}
