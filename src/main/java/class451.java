import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pt")
public class class451 {

    @OriginalMember(owner = "client!pt", name = "j", descriptor = "I")
    private int field6250 = 0;

    @OriginalMember(owner = "client!pt", name = "f", descriptor = "I")
    public int field6246;

    @OriginalMember(owner = "client!pt", name = "c", descriptor = "[Lwda;")
    public class544[] field6243;

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "I")
    public static int field6241;

    @OriginalMember(owner = "client!pt", name = "b", descriptor = "I")
    public static int field6242;

    @OriginalMember(owner = "client!pt", name = "d", descriptor = "I")
    public static int field6244;

    @OriginalMember(owner = "client!pt", name = "g", descriptor = "I")
    public static int field6247;

    @OriginalMember(owner = "client!pt", name = "i", descriptor = "I")
    public static int field6249;

    @OriginalMember(owner = "client!pt", name = "k", descriptor = "I")
    public static int field6251;

    @OriginalMember(owner = "client!pt", name = "l", descriptor = "I")
    public static int field6252;

    @OriginalMember(owner = "client!pt", name = "m", descriptor = "I")
    public static int field6253;

    @OriginalMember(owner = "client!pt", name = "o", descriptor = "I")
    public static int field6255;

    @OriginalMember(owner = "client!pt", name = "h", descriptor = "J")
    private long field6248;

    @OriginalMember(owner = "client!pt", name = "e", descriptor = "Lwda;")
    private class544 field6245;

    @OriginalMember(owner = "client!pt", name = "n", descriptor = "Lwda;")
    private class544 field6254;

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(Z)Lwda;")
    public final class544 method2638(boolean arg0) {
        if (arg0) {
            this.field6254 = null;
        }
        field6242++;
        this.field6250 = 0;
        return this.method2641(12089);
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(I)I")
    public final int method2639(int arg0) {
        if (arg0 < 116) {
            this.field6250 = -30;
        }
        field6244++;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field6246; var3++) {
            class544 var4 = this.field6243[var3];
            for (class544 var5 = var4.field7964; var5 != var4; var5 = var5.field7964) {
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(IJLwda;)V")
    public final void method2640(int arg0, long arg1, class544 arg2) {
        field6255++;
        if (arg2.field7965 != null) {
            arg2.method3187(true);
        }
        class544 var5 = this.field6243[(int) ((long) (this.field6246 - arg0) & arg1)];
        arg2.field7964 = var5;
        arg2.field7965 = var5.field7965;
        arg2.field7965.field7964 = arg2;
        arg2.field7964.field7965 = arg2;
        arg2.field7967 = arg1;
    }

    @OriginalMember(owner = "client!pt", name = "b", descriptor = "(I)Lwda;")
    public final class544 method2641(int arg0) {
        field6253++;
        if (arg0 != 12089) {
            this.method2638(false);
        }
        if (this.field6250 > 0 && this.field6243[this.field6250 - 1] != this.field6254) {
            class544 var2 = this.field6254;
            this.field6254 = var2.field7964;
            return var2;
        }
        while (this.field6246 > this.field6250) {
            class544 var3 = this.field6243[this.field6250++].field7964;
            if (this.field6243[this.field6250 - 1] != var3) {
                this.field6254 = var3.field7964;
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!pt", name = "b", descriptor = "(Z)V")
    public final void method2642(boolean arg0) {
        if (!arg0) {
            return;
        }
        field6247++;
        for (int var2 = 0; var2 < this.field6246; var2++) {
            class544 var3 = this.field6243[var2];
            while (true) {
                class544 var4 = var3.field7964;
                if (var3 == var4) {
                    break;
                }
                var4.method3187(arg0);
            }
        }
        this.field6254 = null;
        this.field6245 = null;
    }

    @OriginalMember(owner = "client!pt", name = "c", descriptor = "(I)I")
    public final int method2643(int arg0) {
        field6252++;
        int var2 = 76 / ((arg0 - 77) / 42);
        return this.field6246;
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "([Lwda;I)I")
    public final int method2644(class544[] arg0, int arg1) {
        field6241++;
        int var3 = 0;
        if (arg1 != 4923) {
            return 37;
        }
        for (int var4 = 0; var4 < this.field6246; var4++) {
            class544 var5 = this.field6243[var4];
            for (class544 var6 = var5.field7964; var6 != var5; var6 = var6.field7964) {
                arg0[var3++] = var6;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!pt", name = "<init>", descriptor = "(I)V")
    public class451(int arg0) {
        this.field6246 = arg0;
        this.field6243 = new class544[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class544 var3 = this.field6243[var2] = new class544();
            var3.field7965 = var3;
            var3.field7964 = var3;
        }
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(JB)Lwda;")
    public final class544 method2645(long arg0, byte arg1) {
        field6249++;
        this.field6248 = arg0;
        if (arg1 > -78) {
            return null;
        }
        class544 var4 = this.field6243[(int) (arg0 & (long) (this.field6246 - 1))];
        for (this.field6245 = var4.field7964; this.field6245 != var4; this.field6245 = this.field6245.field7964) {
            if (this.field6245.field7967 == arg0) {
                class544 var5 = this.field6245;
                this.field6245 = this.field6245.field7964;
                return var5;
            }
        }
        this.field6245 = null;
        return null;
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(B)Lwda;")
    public final class544 method2646(byte arg0) {
        field6251++;
        int var2 = 70 % ((-arg0 - 38) / 51);
        if (this.field6245 == null) {
            return null;
        }
        class544 var3 = this.field6243[(int) (this.field6248 & (long) (this.field6246 - 1))];
        while (this.field6245 != var3) {
            if (this.field6245.field7967 == this.field6248) {
                class544 var4 = this.field6245;
                this.field6245 = this.field6245.field7964;
                return var4;
            }
            this.field6245 = this.field6245.field7964;
        }
        this.field6245 = null;
        return null;
    }
}
