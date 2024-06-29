import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dl")
public class class46 extends class198 {

    @OriginalMember(owner = "client!dl", name = "h", descriptor = "Z")
    private boolean field470 = false;

    @OriginalMember(owner = "client!dl", name = "i", descriptor = "I")
    public int field471 = 0;

    @OriginalMember(owner = "client!dl", name = "o", descriptor = "Z")
    public boolean field477 = false;

    @OriginalMember(owner = "client!dl", name = "g", descriptor = "Lwc;")
    private class49 field469 = new class49();

    @OriginalMember(owner = "client!dl", name = "p", descriptor = "I")
    private int field478 = 0;

    @OriginalMember(owner = "client!dl", name = "q", descriptor = "Lsr;")
    public class167 field479 = new class167();

    @OriginalMember(owner = "client!dl", name = "r", descriptor = "I")
    private int field480 = 0;

    @OriginalMember(owner = "client!dl", name = "w", descriptor = "Z")
    private boolean field485 = false;

    @OriginalMember(owner = "client!dl", name = "v", descriptor = "Leu;")
    public class336 field484 = new class336();

    @OriginalMember(owner = "client!dl", name = "l", descriptor = "[Lqv;")
    public class311[] field474 = new class311[8192];

    @OriginalMember(owner = "client!dl", name = "j", descriptor = "J")
    private long field472;

    @OriginalMember(owner = "client!dl", name = "k", descriptor = "J")
    private long field473;

    @OriginalMember(owner = "client!dl", name = "m", descriptor = "[Z")
    private static boolean[] field475 = new boolean[8];

    @OriginalMember(owner = "client!dl", name = "n", descriptor = "[Z")
    private static boolean[] field476 = new boolean[8];

    @OriginalMember(owner = "client!dl", name = "s", descriptor = "I")
    public int field481;

    @OriginalMember(owner = "client!dl", name = "t", descriptor = "I")
    public int field482;

    @OriginalMember(owner = "client!dl", name = "u", descriptor = "I")
    public int field483;

    @OriginalMember(owner = "client!dl", name = "x", descriptor = "I")
    public int field486;

    @OriginalMember(owner = "client!dl", name = "y", descriptor = "I")
    public int field487;

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(IIIII)V", line = 3)
    public final void method253(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field482 = arg0;
        this.field486 = arg1;
        this.field481 = arg2;
        this.field483 = arg3;
        this.field487 = arg4;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "()V", line = 10)
    public static void method254() {
        field476 = null;
        field475 = null;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(Lza;J)Z", line = 14)
    public final boolean method255(class287 arg0, long arg1) {
        if (this.field473 == this.field472) {
            this.method256();
        } else {
            this.method261();
        }
        if (arg1 - this.field472 > 750L) {
            this.method264();
            return false;
        }
        int var4 = (int) (arg1 - this.field473);
        if (this.field485) {
            for (class247 var5 = (class247) this.field469.method290(-1); var5 != null; var5 = (class247) this.field469.method284(10748)) {
                for (int var6 = 0; var6 < var5.field3266.field4529; var6++) {
                    var5.method1530(arg1, 1, 101, arg0, !this.field470);
                }
            }
            this.field485 = false;
        }
        for (class247 var7 = (class247) this.field469.method290(-1); var7 != null; var7 = (class247) this.field469.method284(10748)) {
            var7.method1530(arg1, var4, 115, arg0, !this.field470);
        }
        this.field473 = arg1;
        return true;
    }

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "()V", line = 64)
    private final void method256() {
        this.field470 = false;
    }

    @OriginalMember(owner = "client!dl", name = "<init>", descriptor = "(I)V", line = 331)
    public class46(int arg0) {
        class508.field7360.method286((byte) -92, this);
        this.field472 = arg0;
        this.field473 = arg0;
        this.field485 = true;
    }

    @OriginalMember(owner = "client!dl", name = "c", descriptor = "()Leu;", line = 73)
    public final class336 method257() {
        return this.field484;
    }

    @OriginalMember(owner = "client!dl", name = "d", descriptor = "()V", line = 76)
    public final void method258() {
        this.field484.field4453.method2515(127);
        for (class247 var1 = (class247) this.field469.method290(-1); var1 != null; var1 = (class247) this.field469.method284(10748)) {
            var1.method1528(true, this.field473);
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(Lza;J[Lsu;[Lop;Z)V", line = 90)
    public final void method259(class287 arg0, long arg1, class142[] arg2, class127[] arg3, boolean arg4) {
        if (!this.field477) {
            this.method262(arg0, arg2, arg4);
            this.method260(arg3, arg4);
            this.field472 = arg1;
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "([Lop;Z)V", line = 103)
    private final void method260(class127[] arg0, boolean arg1) {
        for (int var3 = 0; var3 < 8; var3++) {
            field475[var3] = false;
        }
        label73: for (class255 var4 = (class255) this.field479.method970(12); var4 != null; var4 = (class255) this.field479.method976((byte) -121)) {
            if (arg0 != null) {
                for (int var7 = 0; var7 < arg0.length; var7++) {
                    if (arg0[var7] == var4.field3388 || arg0[var7].field1643 == var4.field3388) {
                        field475[var7] = true;
                        var4.method1579(true);
                        continue label73;
                    }
                }
            }
            if (!arg1) {
                var4.method2674(true);
                this.field480--;
                if (var4.method3024((byte) 117)) {
                    var4.method3022((byte) 54);
                    class81.field988--;
                }
            }
        }
        if (arg0 == null) {
            return;
        }
        for (int var5 = 0; var5 < arg0.length && this.field480 != 8; var5++) {
            if (!field475[var5]) {
                class255 var6 = null;
                if (arg0[var5].method772(-1).field2298 == 1 && class81.field988 < 32) {
                    var6 = new class255(arg0[var5], this);
                    class519.field7654.method2166(var6, (byte) -107, (long) arg0[var5].field1647);
                    class81.field988++;
                }
                if (var6 == null) {
                    var6 = new class255(arg0[var5], this);
                }
                this.field479.method975(0, var6);
                this.field480++;
                field475[var5] = true;
            }
        }
    }

    @OriginalMember(owner = "client!dl", name = "e", descriptor = "()V", line = 189)
    public final void method261() {
        this.field470 = true;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(Lza;[Lsu;Z)V", line = 197)
    private final void method262(class287 arg0, class142[] arg1, boolean arg2) {
        for (int var4 = 0; var4 < 8; var4++) {
            field476[var4] = false;
        }
        label64: for (class247 var5 = (class247) this.field469.method290(-1); var5 != null; var5 = (class247) this.field469.method284(10748)) {
            if (arg1 != null) {
                for (int var8 = 0; var8 < arg1.length; var8++) {
                    if (arg1[var8] == var5.field3259 || arg1[var8].field1875 == var5.field3259) {
                        field476[var8] = true;
                        var5.method1527((byte) 86);
                        var5.field3240 = false;
                        continue label64;
                    }
                }
            }
            if (!arg2) {
                if (var5.field3253 == 0) {
                    var5.method1239(112);
                    this.field478--;
                } else {
                    var5.field3240 = true;
                }
            }
        }
        if (arg1 == null) {
            return;
        }
        for (int var6 = 0; var6 < arg1.length && this.field478 != 8; var6++) {
            if (!field476[var6]) {
                class247 var7 = new class247(arg0, arg1[var6], this, this.field472);
                this.field469.method286((byte) 121, var7);
                this.field478++;
                field476[var6] = true;
            }
        }
    }

    @OriginalMember(owner = "client!dl", name = "f", descriptor = "()V", line = 269)
    public final void method263() {
        this.field485 = true;
    }

    @OriginalMember(owner = "client!dl", name = "g", descriptor = "()V", line = 277)
    public final void method264() {
        this.field477 = true;
        for (class255 var1 = (class255) this.field479.method970(12); var1 != null; var1 = (class255) this.field479.method976((byte) -118)) {
            if (var1.field3389.field2298 == 1) {
                var1.method3022((byte) 54);
            }
        }
        this.field474 = new class311[8192];
        this.field471 = 0;
        this.field469 = new class49();
        this.field478 = 0;
        this.field479 = new class167();
        this.field480 = 0;
        this.method1239(33);
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(J)V", line = 302)
    public final void method265(long arg0) {
        this.field472 = arg0;
    }
}
