import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tba")
public class class165 {

    @OriginalMember(owner = "client!tba", name = "s", descriptor = "I")
    private int field2313 = 0;

    @OriginalMember(owner = "client!tba", name = "d", descriptor = "[Ldfa;")
    public class168[] field2298;

    @OriginalMember(owner = "client!tba", name = "g", descriptor = "I")
    public int field2301;

    @OriginalMember(owner = "client!tba", name = "p", descriptor = "Lfia;")
    public static class577 field2310 = new class577(1, 2, 2, 0);

    @OriginalMember(owner = "client!tba", name = "t", descriptor = "Z")
    public static boolean field2314 = false;

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "I")
    public static int field2295;

    @OriginalMember(owner = "client!tba", name = "b", descriptor = "I")
    public static int field2296;

    @OriginalMember(owner = "client!tba", name = "c", descriptor = "I")
    public static int field2297;

    @OriginalMember(owner = "client!tba", name = "e", descriptor = "I")
    public static int field2299;

    @OriginalMember(owner = "client!tba", name = "f", descriptor = "I")
    public static int field2300;

    @OriginalMember(owner = "client!tba", name = "h", descriptor = "I")
    public static int field2302;

    @OriginalMember(owner = "client!tba", name = "i", descriptor = "I")
    public static int field2303;

    @OriginalMember(owner = "client!tba", name = "m", descriptor = "I")
    public static int field2307;

    @OriginalMember(owner = "client!tba", name = "n", descriptor = "I")
    public static int field2308;

    @OriginalMember(owner = "client!tba", name = "o", descriptor = "I")
    public static int field2309;

    @OriginalMember(owner = "client!tba", name = "q", descriptor = "I")
    public static int field2311;

    @OriginalMember(owner = "client!tba", name = "j", descriptor = "J")
    private long field2304;

    @OriginalMember(owner = "client!tba", name = "k", descriptor = "Ldfa;")
    private class168 field2305;

    @OriginalMember(owner = "client!tba", name = "r", descriptor = "Ldfa;")
    private class168 field2312;

    @OriginalMember(owner = "client!tba", name = "l", descriptor = "Ljl;")
    public static class274 field2306;

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "([Ldfa;I)I")
    public final int method1152(class168[] arg0, int arg1) {
        field2303++;
        int var3 = 0;
        if (arg1 != 32260) {
            method1155(-44);
        }
        for (int var4 = 0; var4 < this.field2301; var4++) {
            class168 var5 = this.field2298[var4];
            for (class168 var6 = var5.field2336; var6 != var5; var6 = var6.field2336) {
                arg0[var3++] = var6;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "(Ldfa;JI)V")
    public final void method1153(class168 arg0, long arg1, int arg2) {
        if (arg0.field2332 != null) {
            arg0.method1175(-2);
        }
        field2307++;
        class168 var5 = this.field2298[(int) ((long) (this.field2301 + arg2) & arg1)];
        arg0.field2336 = var5;
        arg0.field2332 = var5.field2332;
        arg0.field2332.field2336 = arg0;
        arg0.field2336.field2332 = arg0;
        arg0.field2333 = arg1;
    }

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "(B)I")
    public final int method1154(byte arg0) {
        field2309++;
        if (arg0 != -11) {
            this.method1158(51);
        }
        return this.field2301;
    }

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "(I)V")
    public static void method1155(int arg0) {
        field2310 = null;
        if (arg0 != 0) {
            method1157((byte) -11);
        }
        field2306 = null;
    }

    @OriginalMember(owner = "client!tba", name = "b", descriptor = "(I)Ldfa;")
    public final class168 method1156(int arg0) {
        this.field2313 = arg0;
        field2299++;
        return this.method1158(22706);
    }

    @OriginalMember(owner = "client!tba", name = "b", descriptor = "(B)Ljava/lang/String;")
    public static final String method1157(byte arg0) {
        field2296++;
        if (arg0 != 22) {
            method1155(63);
        }
        return class14.field276 || class438.field5836 == null ? "" : class438.field5836.field3483;
    }

    @OriginalMember(owner = "client!tba", name = "c", descriptor = "(I)Ldfa;")
    public final class168 method1158(int arg0) {
        if (arg0 != 22706) {
            this.method1158(107);
        }
        field2302++;
        if (this.field2313 > 0 && this.field2298[this.field2313 - 1] != this.field2312) {
            class168 var2 = this.field2312;
            this.field2312 = var2.field2336;
            return var2;
        }
        while (this.field2313 < this.field2301) {
            class168 var3 = this.field2298[this.field2313++].field2336;
            if (this.field2298[this.field2313 - 1] != var3) {
                this.field2312 = var3.field2336;
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!tba", name = "c", descriptor = "(B)I")
    public final int method1159(byte arg0) {
        field2308++;
        if (arg0 != -106) {
            this.method1161(false);
        }
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2301; var3++) {
            class168 var4 = this.field2298[var3];
            class168 var5 = var4.field2336;
            while (var4 != var5) {
                var5 = var5.field2336;
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!tba", name = "<init>", descriptor = "(I)V")
    public class165(int arg0) {
        this.field2298 = new class168[arg0];
        this.field2301 = arg0;
        for (int var2 = 0; var2 < arg0; var2++) {
            class168 var3 = this.field2298[var2] = new class168();
            var3.field2336 = var3;
            var3.field2332 = var3;
        }
    }

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "(JI)Ldfa;")
    public final class168 method1160(long arg0, int arg1) {
        this.field2304 = arg0;
        field2297++;
        class168 var4 = this.field2298[(int) ((long) (this.field2301 - 1) & arg0)];
        if (arg1 < 118) {
            method1155(-60);
        }
        for (this.field2305 = var4.field2336; this.field2305 != var4; this.field2305 = this.field2305.field2336) {
            if (this.field2305.field2333 == arg0) {
                class168 var5 = this.field2305;
                this.field2305 = this.field2305.field2336;
                return var5;
            }
        }
        this.field2305 = null;
        return null;
    }

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "(Z)V")
    public final void method1161(boolean arg0) {
        int var2 = 0;
        if (arg0) {
            return;
        }
        while (this.field2301 > var2) {
            class168 var3 = this.field2298[var2];
            while (true) {
                class168 var4 = var3.field2336;
                if (var3 == var4) {
                    var2++;
                    break;
                }
                var4.method1175(-2);
            }
        }
        field2311++;
        this.field2312 = null;
        this.field2305 = null;
    }

    @OriginalMember(owner = "client!tba", name = "d", descriptor = "(I)Ldfa;")
    public final class168 method1162(int arg0) {
        field2295++;
        if (this.field2305 == null) {
            return null;
        }
        class168 var2 = this.field2298[(int) (this.field2304 & (long) (this.field2301 - 1))];
        if (arg0 <= 109) {
            return null;
        }
        while (this.field2305 != var2) {
            if (this.field2305.field2333 == this.field2304) {
                class168 var3 = this.field2305;
                this.field2305 = this.field2305.field2336;
                return var3;
            }
            this.field2305 = this.field2305.field2336;
        }
        this.field2305 = null;
        return null;
    }
}
