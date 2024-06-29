import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public class class256 extends class272 {

    @OriginalMember(owner = "client!oh", name = "i", descriptor = "Z")
    public boolean field3394 = false;

    @OriginalMember(owner = "client!oh", name = "m", descriptor = "Z")
    private boolean field3398 = false;

    @OriginalMember(owner = "client!oh", name = "o", descriptor = "I")
    public int field3400 = 0;

    @OriginalMember(owner = "client!oh", name = "l", descriptor = "Lcm;")
    private class472 field3397 = new class472();

    @OriginalMember(owner = "client!oh", name = "r", descriptor = "I")
    private int field3403 = 0;

    @OriginalMember(owner = "client!oh", name = "s", descriptor = "Lld;")
    public class105 field3404 = new class105();

    @OriginalMember(owner = "client!oh", name = "y", descriptor = "I")
    private int field3410 = 0;

    @OriginalMember(owner = "client!oh", name = "x", descriptor = "Z")
    private boolean field3409 = false;

    @OriginalMember(owner = "client!oh", name = "w", descriptor = "Ltp;")
    public class342 field3408 = new class342();

    @OriginalMember(owner = "client!oh", name = "n", descriptor = "[Lns;")
    public class255[] field3399 = new class255[8192];

    @OriginalMember(owner = "client!oh", name = "p", descriptor = "J")
    private long field3401;

    @OriginalMember(owner = "client!oh", name = "k", descriptor = "J")
    private long field3396;

    @OriginalMember(owner = "client!oh", name = "j", descriptor = "[Z")
    private static boolean[] field3395 = new boolean[8];

    @OriginalMember(owner = "client!oh", name = "q", descriptor = "[Z")
    private static boolean[] field3402 = new boolean[8];

    @OriginalMember(owner = "client!oh", name = "t", descriptor = "I")
    public int field3405;

    @OriginalMember(owner = "client!oh", name = "u", descriptor = "I")
    public int field3406;

    @OriginalMember(owner = "client!oh", name = "v", descriptor = "I")
    public int field3407;

    @OriginalMember(owner = "client!oh", name = "z", descriptor = "I")
    public int field3411;

    @OriginalMember(owner = "client!oh", name = "A", descriptor = "I")
    public int field3412;

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "()V", line = 5)
    public final void method1433() {
        this.field3408.field4574.method1805(124);
        for (class389 var1 = (class389) this.field3397.method2764((byte) 118); var1 != null; var1 = (class389) this.field3397.method2769(true)) {
            var1.method2387(65535, this.field3396);
        }
    }

    @OriginalMember(owner = "client!oh", name = "<init>", descriptor = "(I)V", line = 331)
    public class256(int arg0) {
        class125.field1822.method2767(-1830, this);
        this.field3401 = (long) arg0;
        this.field3396 = (long) arg0;
        this.field3409 = true;
    }

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "()V", line = 20)
    private final void method1434() {
        this.field3398 = false;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(Lwm;J)Z", line = 26)
    public final boolean method1435(class364 arg0, long arg1) {
        if (this.field3401 == this.field3396) {
            this.method1434();
        } else {
            this.method1437();
        }
        if (arg1 - this.field3401 > 750L) {
            this.method1439();
            return false;
        }
        int var4 = (int) (arg1 - this.field3396);
        if (this.field3409) {
            for (class389 var5 = (class389) this.field3397.method2764((byte) -74); var5 != null; var5 = (class389) this.field3397.method2769(true)) {
                for (int var6 = 0; var6 < var5.field5397.field5128; var6++) {
                    var5.method2385(arg1, (byte) -85, arg0, 1, !this.field3398);
                }
            }
            this.field3409 = false;
        }
        for (class389 var7 = (class389) this.field3397.method2764((byte) -94); var7 != null; var7 = (class389) this.field3397.method2769(true)) {
            var7.method2385(arg1, (byte) -62, arg0, var4, !this.field3398);
        }
        this.field3396 = arg1;
        return true;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(Lwm;[Ljf;Z)V", line = 77)
    private final void method1436(class364 arg0, class130[] arg1, boolean arg2) {
        for (int var4 = 0; var4 < 8; var4++) {
            field3402[var4] = false;
        }
        label64: for (class389 var5 = (class389) this.field3397.method2764((byte) -101); var5 != null; var5 = (class389) this.field3397.method2769(true)) {
            if (arg1 != null) {
                for (int var8 = 0; var8 < arg1.length; var8++) {
                    if (arg1[var8] == var5.field5372 || arg1[var8].field1905 == var5.field5372) {
                        field3402[var8] = true;
                        var5.method2388((byte) 87);
                        var5.field5365 = false;
                        continue label64;
                    }
                }
            }
            if (!arg2) {
                if (var5.field5386 == 0) {
                    var5.method1541(-3);
                    this.field3403--;
                } else {
                    var5.field5365 = true;
                }
            }
        }
        if (arg1 == null) {
            return;
        }
        for (int var6 = 0; var6 < arg1.length && this.field3403 != 8; var6++) {
            if (!field3402[var6]) {
                class389 var7 = new class389(arg0, arg1[var6], this, this.field3401);
                this.field3397.method2767(-1830, var7);
                this.field3403++;
                field3402[var6] = true;
            }
        }
    }

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "()V", line = 149)
    public final void method1437() {
        this.field3398 = true;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(J)V", line = 153)
    public final void method1438(long arg0) {
        this.field3401 = arg0;
    }

    @OriginalMember(owner = "client!oh", name = "d", descriptor = "()V", line = 159)
    public final void method1439() {
        this.field3394 = true;
        for (class93 var1 = (class93) this.field3404.method652((byte) 37); var1 != null; var1 = (class93) this.field3404.method653(101)) {
            if (var1.field1365.field3168 == 1) {
                var1.method2441((byte) -116);
            }
        }
        this.field3399 = new class255[8192];
        this.field3400 = 0;
        this.field3397 = new class472();
        this.field3403 = 0;
        this.field3404 = new class105();
        this.field3410 = 0;
        this.method1541(-3);
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(Lwm;J[Ljf;[Lnm;Z)V", line = 180)
    public final void method1440(class364 arg0, long arg1, class130[] arg2, class304[] arg3, boolean arg4) {
        if (!this.field3394) {
            this.method1436(arg0, arg2, arg4);
            this.method1445(arg3, arg4);
            this.field3401 = arg1;
        }
    }

    @OriginalMember(owner = "client!oh", name = "e", descriptor = "()Ltp;", line = 189)
    public final class342 method1441() {
        return this.field3408;
    }

    @OriginalMember(owner = "client!oh", name = "f", descriptor = "()V", line = 193)
    public final void method1442() {
        this.field3409 = true;
    }

    @OriginalMember(owner = "client!oh", name = "g", descriptor = "()V", line = 196)
    public static void method1443() {
        field3402 = null;
        field3395 = null;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IIIII)V", line = 203)
    public final void method1444(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field3411 = arg0;
        this.field3407 = arg1;
        this.field3406 = arg2;
        this.field3412 = arg3;
        this.field3405 = arg4;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "([Lnm;Z)V", line = 212)
    private final void method1445(class304[] arg0, boolean arg1) {
        for (int var3 = 0; var3 < 8; var3++) {
            field3395[var3] = false;
        }
        label73: for (class93 var4 = (class93) this.field3404.method652((byte) 37); var4 != null; var4 = (class93) this.field3404.method653(72)) {
            if (arg0 != null) {
                for (int var7 = 0; var7 < arg0.length; var7++) {
                    if (arg0[var7] == var4.field1359 || arg0[var7].field4048 == var4.field1359) {
                        field3395[var7] = true;
                        var4.method590(-15189);
                        continue label73;
                    }
                }
            }
            if (!arg1) {
                var4.method2614((byte) -89);
                this.field3410--;
                if (var4.method2440(false)) {
                    var4.method2441((byte) -121);
                    class244.field3245--;
                }
            }
        }
        if (arg0 == null) {
            return;
        }
        for (int var5 = 0; var5 < arg0.length && this.field3410 != 8; var5++) {
            if (!field3395[var5]) {
                class93 var6 = null;
                if (class56.method408(arg0[var5].field4036, 1).field3168 == 1 && class244.field3245 < 32) {
                    var6 = new class93(arg0[var5], this);
                    class30.field393.method617(5, (long) arg0[var5].field4036, var6);
                    class244.field3245++;
                }
                if (var6 == null) {
                    var6 = new class93(arg0[var5], this);
                }
                this.field3404.method641(var6, (byte) -93);
                this.field3410++;
                field3395[var5] = true;
            }
        }
    }
}
