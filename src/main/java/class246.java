import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mda")
public class class246 {

    @OriginalMember(owner = "client!mda", name = "m", descriptor = "Llfa;")
    private class103 field3432;

    @OriginalMember(owner = "client!mda", name = "b", descriptor = "Ljava/math/BigInteger;")
    private BigInteger field3421;

    @OriginalMember(owner = "client!mda", name = "k", descriptor = "Lde;")
    private class497 field3430;

    @OriginalMember(owner = "client!mda", name = "g", descriptor = "Ljava/math/BigInteger;")
    private BigInteger field3426;

    @OriginalMember(owner = "client!mda", name = "i", descriptor = "Lve;")
    private class470 field3428;

    @OriginalMember(owner = "client!mda", name = "c", descriptor = "Lun;")
    public static class392 field3422 = new class392();

    @OriginalMember(owner = "client!mda", name = "l", descriptor = "[J")
    public static long[] field3431 = new long[256];

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "I")
    public static int field3420;

    @OriginalMember(owner = "client!mda", name = "d", descriptor = "I")
    public static int field3423;

    @OriginalMember(owner = "client!mda", name = "f", descriptor = "I")
    public static int field3425;

    @OriginalMember(owner = "client!mda", name = "h", descriptor = "I")
    public static int field3427;

    @OriginalMember(owner = "client!mda", name = "j", descriptor = "I")
    public static int field3429;

    @OriginalMember(owner = "client!mda", name = "e", descriptor = "Leh;")
    private class335 field3424;

    @OriginalMember(owner = "client!mda", name = "n", descriptor = "[Ln;")
    private class17[] field3433;

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "(B)V")
    public final void method1507(byte arg0) {
        field3420++;
        if (this.field3433 == null) {
            return;
        }
        for (int var2 = 0; var2 < this.field3433.length; var2++) {
            if (this.field3433[var2] != null) {
                this.field3433[var2].method178((byte) 123);
            }
        }
        for (int var3 = 0; var3 < this.field3433.length; var3++) {
            if (this.field3433[var3] != null) {
                this.field3433[var3].method177(29780);
            }
        }
        if (arg0 != 74) {
            method1512(true);
        }
    }

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "(Lbi;B)I")
    public static final int method1508(class449 arg0, byte arg1) {
        field3425++;
        int var2 = 0;
        if (arg0.method2549(class429.field5891, arg1 ^ 0xBC7)) {
            var2++;
        }
        if (arg0.method2549(class483.field6539, 3015)) {
            var2++;
        }
        if (arg0.method2549(class142.field2291, 3015)) {
            var2++;
        }
        if (arg0.method2549(class308.field4261, 3015)) {
            var2++;
        }
        if (arg0.method2549(class371.field5008, arg1 ^ 0xBC7)) {
            var2++;
        }
        if (arg0.method2549(class364.field4925, 3015)) {
            var2++;
        }
        if (arg1 != 0) {
            field3422 = null;
        }
        if (arg0.method2549(class330.field4532, 3015)) {
            var2++;
        }
        if (arg0.method2549(class254.field3518, 3015)) {
            var2++;
        }
        if (arg0.method2549(class54.field740, arg1 + 3015)) {
            var2++;
        }
        if (arg0.method2549(class646.field8661, 3015)) {
            var2++;
        }
        if (arg0.method2549(class670.field9503, 3015)) {
            var2++;
        }
        if (arg0.method2549(class64.field983, 3015)) {
            var2++;
        }
        if (arg0.method2549(class308.field4257, arg1 + 3015)) {
            var2++;
        }
        if (arg0.method2549(class671.field9505, arg1 ^ 0xBC7)) {
            var2++;
        }
        if (arg0.method2549(class146.field2337, 3015)) {
            var2++;
        }
        if (arg0.method2549(class624.field8253, 3015)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "(ILd;)V")
    public static final void method1509(int arg0, class139 arg1) {
        class218.field3099[arg0] = arg1;
    }

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "(ILcc;ILcc;)Ln;")
    public final class17 method1510(int arg0, class685 arg1, int arg2, class685 arg3) {
        field3429++;
        int var5 = 113 / ((39 - arg2) / 57);
        return this.method1511(arg3, arg0, arg1, true, (byte) 87);
    }

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "(Lcc;ILcc;ZB)Ln;")
    private final class17 method1511(class685 arg0, int arg1, class685 arg2, boolean arg3, byte arg4) {
        field3427++;
        if (this.field3424 == null) {
            throw new RuntimeException();
        } else if (arg1 < 0 || this.field3433.length <= arg1) {
            throw new RuntimeException();
        } else if (this.field3433[arg1] == null) {
            this.field3424.field4619 = arg1 * 72 + 6;
            int var6 = this.field3424.method2045(arg4 ^ 0xFFFFFFC9);
            int var7 = this.field3424.method2045(-98);
            byte[] var8 = new byte[64];
            this.field3424.method1985((byte) 0, 64, var8, 0);
            class17 var9 = new class17(arg1, arg2, arg0, this.field3432, this.field3430, var6, var8, var7, arg3);
            if (arg4 != 87) {
                this.field3432 = null;
            }
            this.field3433[arg1] = var9;
            return var9;
        } else {
            return this.field3433[arg1];
        }
    }

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "(Z)V")
    public static void method1512(boolean arg0) {
        if (arg0) {
            field3431 = null;
            field3422 = null;
        }
    }

    @OriginalMember(owner = "client!mda", name = "b", descriptor = "(Z)Z")
    public final boolean method1513(boolean arg0) {
        field3423++;
        if (this.field3424 != null) {
            return true;
        }
        if (this.field3428 == null) {
            if (this.field3432.method792((byte) 98)) {
                return false;
            }
            this.field3428 = this.field3432.method787(255, true, (byte) 0, 255, (byte) 119);
        }
        if (this.field3428.field6415) {
            return false;
        }
        class335 var2 = new class335(this.field3428.method2645(35));
        var2.field4619 = 5;
        int var3 = var2.method2034(255);
        var2.field4619 += var3 * 72;
        if (arg0) {
            this.field3432 = null;
        }
        byte[] var4 = new byte[var2.field4600.length - var2.field4619];
        var2.method1985((byte) 0, var4.length, var4, 0);
        byte[] var7;
        if (this.field3426 == null || this.field3421 == null) {
            var7 = var4;
        } else {
            BigInteger var5 = new BigInteger(var4);
            BigInteger var6 = var5.modPow(this.field3426, this.field3421);
            var7 = var6.toByteArray();
        }
        if (var7.length != 65) {
            throw new RuntimeException();
        }
        byte[] var8 = class701.method3883(5, var2.field4619 - var4.length - 5, true, var2.field4600);
        for (int var9 = 0; var9 < 64; var9++) {
            if (var7[var9 + 1] != var8[var9]) {
                throw new RuntimeException();
            }
        }
        this.field3424 = var2;
        this.field3433 = new class17[var3];
        return true;
    }

    @OriginalMember(owner = "client!mda", name = "<init>", descriptor = "(Llfa;Lde;Ljava/math/BigInteger;Ljava/math/BigInteger;)V")
    public class246(class103 arg0, class497 arg1, BigInteger arg2, BigInteger arg3) {
        this.field3432 = arg0;
        this.field3421 = arg3;
        this.field3430 = arg1;
        this.field3426 = arg2;
        if (!this.field3432.method792((byte) 110)) {
            this.field3428 = this.field3432.method787(255, true, (byte) 0, 255, (byte) 119);
        }
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            long var1 = (long) var0;
            for (int var3 = 0; var3 < 8; var3++) {
                if ((var1 & 0x1L) == 1L) {
                    var1 = var1 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field3431[var0] = var1;
        }
    }
}
