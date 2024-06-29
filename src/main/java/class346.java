import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public class class346 {

    @OriginalMember(owner = "client!oj", name = "o", descriptor = "I")
    private int field5004 = 0;

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "[Lia;")
    public class539[] field4990;

    @OriginalMember(owner = "client!oj", name = "j", descriptor = "I")
    public int field4999;

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "I")
    public static int field4991;

    @OriginalMember(owner = "client!oj", name = "c", descriptor = "I")
    public static int field4992;

    @OriginalMember(owner = "client!oj", name = "d", descriptor = "I")
    public static int field4993;

    @OriginalMember(owner = "client!oj", name = "f", descriptor = "I")
    public static int field4995;

    @OriginalMember(owner = "client!oj", name = "h", descriptor = "I")
    public static int field4997;

    @OriginalMember(owner = "client!oj", name = "i", descriptor = "I")
    public static int field4998;

    @OriginalMember(owner = "client!oj", name = "l", descriptor = "I")
    public static int field5001;

    @OriginalMember(owner = "client!oj", name = "m", descriptor = "I")
    public static int field5002;

    @OriginalMember(owner = "client!oj", name = "p", descriptor = "I")
    public static int field5005;

    @OriginalMember(owner = "client!oj", name = "k", descriptor = "J")
    private long field5000;

    @OriginalMember(owner = "client!oj", name = "g", descriptor = "Lia;")
    private class539 field4996;

    @OriginalMember(owner = "client!oj", name = "n", descriptor = "Lia;")
    private class539 field5003;

    @OriginalMember(owner = "client!oj", name = "e", descriptor = "[I")
    public static int[] field4994;

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(I)I", line = 5)
    public final int method2057(int arg0) {
        field4993++;
        int var2 = 0;
        for (int var3 = arg0; var3 < this.field4999; var3++) {
            class539 var4 = this.field4990[var3];
            for (class539 var5 = var4.field7315; var5 != var4; var5 = var5.field7315) {
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "(I)I", line = 33)
    public final int method2058(int arg0) {
        if (arg0 != -1) {
            this.field4999 = -43;
        }
        field4991++;
        return this.field4999;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(B[Lia;)I", line = 49)
    public final int method2059(byte arg0, class539[] arg1) {
        if (arg0 != -88) {
            this.field5004 = 24;
        }
        field4998++;
        int var3 = 0;
        for (int var4 = 0; var4 < this.field4999; var4++) {
            class539 var5 = this.field4990[var4];
            for (class539 var6 = var5.field7315; var6 != var5; var6 = var6.field7315) {
                arg1[var3++] = var6;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!oj", name = "c", descriptor = "(I)V", line = 83)
    public final void method2060(int arg0) {
        field4992++;
        for (int var2 = arg0; var2 < this.field4999; var2++) {
            class539 var3 = this.field4990[var2];
            while (true) {
                class539 var4 = var3.field7315;
                if (var3 == var4) {
                    break;
                }
                var4.method2971(1);
            }
        }
        this.field5003 = null;
        this.field4996 = null;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(IJ)Lia;", line = 113)
    public final class539 method2061(int arg0, long arg1) {
        field5002++;
        this.field5000 = arg1;
        if (arg0 != -17305) {
            return null;
        }
        class539 var4 = this.field4990[(int) ((long) (this.field4999 - 1) & arg1)];
        for (this.field4996 = var4.field7315; this.field4996 != var4; this.field4996 = this.field4996.field7315) {
            if (this.field4996.field7311 == arg1) {
                class539 var5 = this.field4996;
                this.field4996 = this.field4996.field7315;
                return var5;
            }
        }
        this.field4996 = null;
        return null;
    }

    @OriginalMember(owner = "client!oj", name = "d", descriptor = "(I)Lia;", line = 146)
    public final class539 method2062(int arg0) {
        field5005++;
        if (this.field5004 > 0 && this.field4990[this.field5004 - 1] != this.field5003) {
            class539 var2 = this.field5003;
            this.field5003 = var2.field7315;
            return var2;
        }
        if (arg0 != -19704) {
            this.field4990 = null;
        }
        while (this.field5004 < this.field4999) {
            class539 var3 = this.field4990[this.field5004++].field7315;
            if (this.field4990[this.field5004 - 1] != var3) {
                this.field5003 = var3.field7315;
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(JILia;)V", line = 179)
    public final void method2063(long arg0, int arg1, class539 arg2) {
        field4995++;
        if (arg2.field7306 != null) {
            arg2.method2971(1);
        }
        class539 var5 = this.field4990[(int) (arg0 & (long) (this.field4999 - arg1))];
        arg2.field7306 = var5.field7306;
        arg2.field7315 = var5;
        arg2.field7306.field7315 = arg2;
        arg2.field7311 = arg0;
        arg2.field7315.field7306 = arg2;
    }

    @OriginalMember(owner = "client!oj", name = "e", descriptor = "(I)Lia;", line = 197)
    public final class539 method2064(int arg0) {
        field5001++;
        if (this.field4996 == null) {
            return null;
        }
        class539 var2 = this.field4990[(int) (this.field5000 & (long) (this.field4999 - 1))];
        while (this.field4996 != var2) {
            if (this.field4996.field7311 == this.field5000) {
                class539 var3 = this.field4996;
                this.field4996 = this.field4996.field7315;
                return var3;
            }
            this.field4996 = this.field4996.field7315;
        }
        if (arg0 == 6654) {
            this.field4996 = null;
            return null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(IIILal;Lal;)V", line = 229)
    public static final void method2065(int arg0, int arg1, int arg2, class86 arg3, class86 arg4) {
        class486 var5 = class80.method635(arg0, arg1, arg2);
        if (var5 != null) {
            var5.field6750 = arg3;
            var5.field6741 = arg4;
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(Z)Lia;", line = 238)
    public final class539 method2066(boolean arg0) {
        this.field5004 = 0;
        field4997++;
        return arg0 ? null : this.method2062(-19704);
    }

    @OriginalMember(owner = "client!oj", name = "<init>", descriptor = "(I)V", line = 254)
    public class346(int arg0) {
        this.field4990 = new class539[arg0];
        this.field4999 = arg0;
        for (int var2 = 0; var2 < arg0; var2++) {
            class539 var3 = this.field4990[var2] = new class539();
            var3.field7306 = var3;
            var3.field7315 = var3;
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(B)V", line = 281)
    public static void method2067(byte arg0) {
        int var1 = 55 % ((45 - arg0) / 63);
        field4994 = null;
    }
}
