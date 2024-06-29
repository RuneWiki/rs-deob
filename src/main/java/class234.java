import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class234 extends class237 {

    @OriginalMember(owner = "client!rb", name = "k", descriptor = "I")
    public int field3396 = 0;

    @OriginalMember(owner = "client!rb", name = "p", descriptor = "Z")
    private boolean field3401 = false;

    @OriginalMember(owner = "client!rb", name = "q", descriptor = "Z")
    public boolean field3402 = false;

    @OriginalMember(owner = "client!rb", name = "m", descriptor = "Luj;")
    private class259 field3398 = new class259();

    @OriginalMember(owner = "client!rb", name = "u", descriptor = "I")
    private int field3406 = 0;

    @OriginalMember(owner = "client!rb", name = "t", descriptor = "Lko;")
    public class348 field3405 = new class348();

    @OriginalMember(owner = "client!rb", name = "z", descriptor = "Z")
    private boolean field3411 = false;

    @OriginalMember(owner = "client!rb", name = "B", descriptor = "I")
    private int field3413 = 0;

    @OriginalMember(owner = "client!rb", name = "A", descriptor = "Lgn;")
    public class492 field3412 = new class492();

    @OriginalMember(owner = "client!rb", name = "r", descriptor = "[Lff;")
    public class9[] field3403 = new class9[8192];

    @OriginalMember(owner = "client!rb", name = "n", descriptor = "J")
    private long field3399;

    @OriginalMember(owner = "client!rb", name = "o", descriptor = "J")
    private long field3400;

    @OriginalMember(owner = "client!rb", name = "l", descriptor = "[Z")
    private static boolean[] field3397 = new boolean[8];

    @OriginalMember(owner = "client!rb", name = "s", descriptor = "[Z")
    private static boolean[] field3404 = new boolean[8];

    @OriginalMember(owner = "client!rb", name = "v", descriptor = "I")
    public int field3407;

    @OriginalMember(owner = "client!rb", name = "w", descriptor = "I")
    public int field3408;

    @OriginalMember(owner = "client!rb", name = "x", descriptor = "I")
    public int field3409;

    @OriginalMember(owner = "client!rb", name = "y", descriptor = "I")
    public int field3410;

    @OriginalMember(owner = "client!rb", name = "C", descriptor = "I")
    public int field3414;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(Lqa;[Lqr;Z)V")
    private final void method1517(class162 arg0, class46[] arg1, boolean arg2) {
        for (int var4 = 0; var4 < 8; var4++) {
            field3404[var4] = false;
        }
        label64: for (class128 var5 = (class128) this.field3398.method1639(-1); var5 != null; var5 = (class128) this.field3398.method1642((byte) 108)) {
            if (arg1 != null) {
                for (int var8 = 0; var8 < arg1.length; var8++) {
                    if (arg1[var8] == var5.field1944 || arg1[var8].field710 == var5.field1944) {
                        field3404[var8] = true;
                        var5.method943(-12107);
                        var5.field1956 = false;
                        continue label64;
                    }
                }
            }
            if (!arg2) {
                if (var5.field1939 == 0) {
                    var5.method1540(-1);
                    this.field3406--;
                } else {
                    var5.field1956 = true;
                }
            }
        }
        if (arg1 == null) {
            return;
        }
        for (int var6 = 0; var6 < arg1.length && this.field3406 != 8; var6++) {
            if (!field3404[var6]) {
                class128 var7 = new class128(arg0, arg1[var6], this, this.field3399);
                this.field3398.method1637((byte) -111, var7);
                this.field3406++;
                field3404[var6] = true;
            }
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(Lqa;J[Lqr;[Lwq;Z)V")
    public final void method1518(class162 arg0, long arg1, class46[] arg2, class113[] arg3, boolean arg4) {
        if (!this.field3402) {
            this.method1517(arg0, arg2, arg4);
            this.method1521(arg3, arg4);
            this.field3399 = arg1;
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "()Lgn;")
    public final class492 method1519() {
        return this.field3412;
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "()V")
    public final void method1520() {
        this.field3412.field7181.method1488(56);
        for (class128 var1 = (class128) this.field3398.method1639(-1); var1 != null; var1 = (class128) this.field3398.method1642((byte) -122)) {
            var1.method944(this.field3400, -31433);
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "([Lwq;Z)V")
    private final void method1521(class113[] arg0, boolean arg1) {
        for (int var3 = 0; var3 < 8; var3++) {
            field3397[var3] = false;
        }
        label73: for (class363 var4 = (class363) this.field3405.method2257((byte) 98); var4 != null; var4 = (class363) this.field3405.method2256(27)) {
            if (arg0 != null) {
                for (int var7 = 0; var7 < arg0.length; var7++) {
                    if (arg0[var7] == var4.field5456 || arg0[var7].field1793 == var4.field5456) {
                        field3397[var7] = true;
                        var4.method2330((byte) 79);
                        continue label73;
                    }
                }
            }
            if (!arg1) {
                var4.method2663(-124);
                this.field3413--;
                if (var4.method857(51)) {
                    var4.method855(51);
                    class318.field4550--;
                }
            }
        }
        if (arg0 == null) {
            return;
        }
        for (int var5 = 0; var5 < arg0.length && this.field3413 != 8; var5++) {
            if (!field3397[var5]) {
                class363 var6 = null;
                if (arg0[var5].method839((byte) 48).field781 == 1 && class318.field4550 < 32) {
                    var6 = new class363(arg0[var5], this);
                    class80.field1322.method2381(var6, 110, (long) arg0[var5].field1795);
                    class318.field4550++;
                }
                if (var6 == null) {
                    var6 = new class363(arg0[var5], this);
                }
                this.field3405.method2270(0, var6);
                this.field3413++;
                field3397[var5] = true;
            }
        }
    }

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "()V")
    public final void method1522() {
        this.field3411 = true;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(Lqa;J)Z")
    public final boolean method1523(class162 arg0, long arg1) {
        if (this.field3400 == this.field3399) {
            this.method1527();
        } else {
            this.method1528();
        }
        if (arg1 - this.field3399 > 750L) {
            this.method1526();
            return false;
        }
        int var4 = (int) (arg1 - this.field3400);
        if (this.field3411) {
            for (class128 var5 = (class128) this.field3398.method1639(-1); var5 != null; var5 = (class128) this.field3398.method1642((byte) 120)) {
                for (int var6 = 0; var6 < var5.field1962.field4059; var6++) {
                    var5.method945(arg1, 94, !this.field3401, 1, arg0);
                }
            }
            this.field3411 = false;
        }
        for (class128 var7 = (class128) this.field3398.method1639(-1); var7 != null; var7 = (class128) this.field3398.method1642((byte) 92)) {
            var7.method945(arg1, 95, !this.field3401, var4, arg0);
        }
        this.field3400 = arg1;
        return true;
    }

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "()V")
    public static void method1524() {
        field3404 = null;
        field3397 = null;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(J)V")
    public final void method1525(long arg0) {
        this.field3399 = arg0;
    }

    @OriginalMember(owner = "client!rb", name = "e", descriptor = "()V")
    public final void method1526() {
        this.field3402 = true;
        for (class363 var1 = (class363) this.field3405.method2257((byte) 118); var1 != null; var1 = (class363) this.field3405.method2256(33)) {
            if (var1.field5453.field781 == 1) {
                var1.method855(51);
            }
        }
        this.field3403 = new class9[8192];
        this.field3396 = 0;
        this.field3398 = new class259();
        this.field3406 = 0;
        this.field3405 = new class348();
        this.field3413 = 0;
        this.method1540(-1);
    }

    @OriginalMember(owner = "client!rb", name = "f", descriptor = "()V")
    private final void method1527() {
        this.field3401 = false;
    }

    @OriginalMember(owner = "client!rb", name = "g", descriptor = "()V")
    public final void method1528() {
        this.field3401 = true;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IIIII)V")
    public final void method1529(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field3409 = arg0;
        this.field3414 = arg1;
        this.field3410 = arg2;
        this.field3408 = arg3;
        this.field3407 = arg4;
    }

    @OriginalMember(owner = "client!rb", name = "<init>", descriptor = "(I)V")
    public class234(int arg0) {
        class359.field5434.method1637((byte) -101, this);
        this.field3399 = arg0;
        this.field3400 = arg0;
        this.field3411 = true;
    }
}
