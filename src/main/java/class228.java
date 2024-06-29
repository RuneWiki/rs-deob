import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public class class228 extends class176 {

    @OriginalMember(owner = "client!jg", name = "l", descriptor = "Z")
    private boolean field3231 = false;

    @OriginalMember(owner = "client!jg", name = "r", descriptor = "Z")
    public boolean field3237 = false;

    @OriginalMember(owner = "client!jg", name = "s", descriptor = "I")
    public int field3238 = 0;

    @OriginalMember(owner = "client!jg", name = "p", descriptor = "Lpw;")
    private class507 field3235 = new class507();

    @OriginalMember(owner = "client!jg", name = "v", descriptor = "I")
    private int field3241 = 0;

    @OriginalMember(owner = "client!jg", name = "u", descriptor = "Lps;")
    public class63 field3240 = new class63();

    @OriginalMember(owner = "client!jg", name = "C", descriptor = "Z")
    private boolean field3248 = false;

    @OriginalMember(owner = "client!jg", name = "D", descriptor = "I")
    private int field3249 = 0;

    @OriginalMember(owner = "client!jg", name = "x", descriptor = "Lfq;")
    public class137 field3243 = new class137();

    @OriginalMember(owner = "client!jg", name = "t", descriptor = "[Lmr;")
    public class97[] field3239 = new class97[8192];

    @OriginalMember(owner = "client!jg", name = "q", descriptor = "J")
    private long field3236;

    @OriginalMember(owner = "client!jg", name = "m", descriptor = "J")
    private long field3232;

    @OriginalMember(owner = "client!jg", name = "o", descriptor = "[Z")
    private static boolean[] field3234 = new boolean[8];

    @OriginalMember(owner = "client!jg", name = "n", descriptor = "[Z")
    private static boolean[] field3233 = new boolean[8];

    @OriginalMember(owner = "client!jg", name = "w", descriptor = "I")
    public int field3242;

    @OriginalMember(owner = "client!jg", name = "y", descriptor = "I")
    public int field3244;

    @OriginalMember(owner = "client!jg", name = "z", descriptor = "I")
    public int field3245;

    @OriginalMember(owner = "client!jg", name = "A", descriptor = "I")
    public int field3246;

    @OriginalMember(owner = "client!jg", name = "B", descriptor = "I")
    public int field3247;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(Lqa;J)Z")
    public final boolean method1524(class165 arg0, long arg1) {
        if (this.field3236 == this.field3232) {
            this.method1536();
        } else {
            this.method1526();
        }
        if (arg1 - this.field3236 > 750L) {
            this.method1525();
            return false;
        }
        int var4 = (int) (arg1 - this.field3232);
        if (this.field3248) {
            for (class29 var5 = (class29) this.field3235.method3040(false); var5 != null; var5 = (class29) this.field3235.method3043((byte) -125)) {
                for (int var6 = 0; var6 < var5.field417.field4376; var6++) {
                    var5.method263(1, !this.field3231, (byte) 115, arg0, arg1);
                }
            }
            this.field3248 = false;
        }
        for (class29 var7 = (class29) this.field3235.method3040(false); var7 != null; var7 = (class29) this.field3235.method3043((byte) -125)) {
            var7.method263(var4, !this.field3231, (byte) 79, arg0, arg1);
        }
        this.field3232 = arg1;
        return true;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "()V")
    public final void method1525() {
        this.field3237 = true;
        for (class339 var1 = (class339) this.field3240.method445(33); var1 != null; var1 = (class339) this.field3240.method451(false)) {
            if (var1.field5248.field170 == 1) {
                var1.method705(6511);
            }
        }
        this.field3239 = new class97[8192];
        this.field3238 = 0;
        this.field3235 = new class507();
        this.field3241 = 0;
        this.field3240 = new class63();
        this.field3249 = 0;
        this.method1184(120);
    }

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "()V")
    public final void method1526() {
        this.field3231 = true;
    }

    @OriginalMember(owner = "client!jg", name = "c", descriptor = "()V")
    public final void method1527() {
        this.field3243.field1827.method2469(true);
        for (class29 var1 = (class29) this.field3235.method3040(false); var1 != null; var1 = (class29) this.field3235.method3043((byte) -125)) {
            var1.method261(520515554, this.field3232);
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "([Lhd;Z)V")
    private final void method1528(class531[] arg0, boolean arg1) {
        for (int var3 = 0; var3 < 8; var3++) {
            field3233[var3] = false;
        }
        label73: for (class339 var4 = (class339) this.field3240.method445(33); var4 != null; var4 = (class339) this.field3240.method451(false)) {
            if (arg0 != null) {
                for (int var7 = 0; var7 < arg0.length; var7++) {
                    if (arg0[var7] == var4.field5251 || arg0[var7].field7806 == var4.field5251) {
                        field3233[var7] = true;
                        var4.method2194(0);
                        continue label73;
                    }
                }
            }
            if (!arg1) {
                var4.method25(-13489);
                this.field3249--;
                if (var4.method707(true)) {
                    var4.method705(6511);
                    class476.field7066--;
                }
            }
        }
        if (arg0 == null) {
            return;
        }
        for (int var5 = 0; var5 < arg0.length && this.field3249 != 8; var5++) {
            if (!field3233[var5]) {
                class339 var6 = null;
                if (arg0[var5].method3140((byte) -95).field170 == 1 && class476.field7066 < 32) {
                    var6 = new class339(arg0[var5], this);
                    class429.field6540.method2850(var6, -56, (long) arg0[var5].field7804);
                    class476.field7066++;
                }
                if (var6 == null) {
                    var6 = new class339(arg0[var5], this);
                }
                this.field3240.method453((byte) 120, var6);
                this.field3249++;
                field3233[var5] = true;
            }
        }
    }

    @OriginalMember(owner = "client!jg", name = "d", descriptor = "()V")
    public final void method1529() {
        this.field3248 = true;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IIIII)V")
    public final void method1530(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field3244 = arg0;
        this.field3247 = arg1;
        this.field3242 = arg2;
        this.field3246 = arg3;
        this.field3245 = arg4;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(Lqa;J[Llq;[Lhd;Z)V")
    public final void method1531(class165 arg0, long arg1, class392[] arg2, class531[] arg3, boolean arg4) {
        if (!this.field3237) {
            this.method1532(arg0, arg2, arg4);
            this.method1528(arg3, arg4);
            this.field3236 = arg1;
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(Lqa;[Llq;Z)V")
    private final void method1532(class165 arg0, class392[] arg1, boolean arg2) {
        for (int var4 = 0; var4 < 8; var4++) {
            field3234[var4] = false;
        }
        label64: for (class29 var5 = (class29) this.field3235.method3040(false); var5 != null; var5 = (class29) this.field3235.method3043((byte) -125)) {
            if (arg1 != null) {
                for (int var8 = 0; var8 < arg1.length; var8++) {
                    if (arg1[var8] == var5.field441 || arg1[var8].field5982 == var5.field441) {
                        field3234[var8] = true;
                        var5.method262(-30753);
                        var5.field428 = false;
                        continue label64;
                    }
                }
            }
            if (!arg2) {
                if (var5.field425 == 0) {
                    var5.method1184(114);
                    this.field3241--;
                } else {
                    var5.field428 = true;
                }
            }
        }
        if (arg1 == null) {
            return;
        }
        for (int var6 = 0; var6 < arg1.length && this.field3241 != 8; var6++) {
            if (!field3234[var6]) {
                class29 var7 = new class29(arg0, arg1[var6], this, this.field3236);
                this.field3235.method3045(var7, 70);
                this.field3241++;
                field3234[var6] = true;
            }
        }
    }

    @OriginalMember(owner = "client!jg", name = "e", descriptor = "()Lfq;")
    public final class137 method1533() {
        return this.field3243;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(J)V")
    public final void method1534(long arg0) {
        this.field3236 = arg0;
    }

    @OriginalMember(owner = "client!jg", name = "f", descriptor = "()V")
    public static void method1535() {
        field3234 = null;
        field3233 = null;
    }

    @OriginalMember(owner = "client!jg", name = "g", descriptor = "()V")
    private final void method1536() {
        this.field3231 = false;
    }

    @OriginalMember(owner = "client!jg", name = "<init>", descriptor = "(I)V")
    public class228(int arg0) {
        class11.field184.method3045(this, 108);
        this.field3236 = arg0;
        this.field3232 = arg0;
        this.field3248 = true;
    }
}
