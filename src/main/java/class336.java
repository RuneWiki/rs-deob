import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public class class336 extends class447 {

    @OriginalMember(owner = "client!mk", name = "k", descriptor = "Z")
    private boolean field4988 = false;

    @OriginalMember(owner = "client!mk", name = "q", descriptor = "I")
    public int field4994 = 0;

    @OriginalMember(owner = "client!mk", name = "n", descriptor = "Z")
    public boolean field4991 = false;

    @OriginalMember(owner = "client!mk", name = "r", descriptor = "Ltm;")
    private class354 field4995 = new class354();

    @OriginalMember(owner = "client!mk", name = "u", descriptor = "I")
    private int field4998 = 0;

    @OriginalMember(owner = "client!mk", name = "t", descriptor = "Lsf;")
    public class398 field4997 = new class398();

    @OriginalMember(owner = "client!mk", name = "v", descriptor = "Z")
    private boolean field4999 = false;

    @OriginalMember(owner = "client!mk", name = "x", descriptor = "I")
    private int field5001 = 0;

    @OriginalMember(owner = "client!mk", name = "B", descriptor = "Lwa;")
    public class439 field5005 = new class439();

    @OriginalMember(owner = "client!mk", name = "l", descriptor = "[Lhq;")
    public class370[] field4989 = new class370[8192];

    @OriginalMember(owner = "client!mk", name = "p", descriptor = "J")
    private long field4993;

    @OriginalMember(owner = "client!mk", name = "o", descriptor = "J")
    private long field4992;

    @OriginalMember(owner = "client!mk", name = "m", descriptor = "[Z")
    private static boolean[] field4990 = new boolean[8];

    @OriginalMember(owner = "client!mk", name = "s", descriptor = "[Z")
    private static boolean[] field4996 = new boolean[8];

    @OriginalMember(owner = "client!mk", name = "w", descriptor = "I")
    public int field5000;

    @OriginalMember(owner = "client!mk", name = "y", descriptor = "I")
    public int field5002;

    @OriginalMember(owner = "client!mk", name = "z", descriptor = "I")
    public int field5003;

    @OriginalMember(owner = "client!mk", name = "A", descriptor = "I")
    public int field5004;

    @OriginalMember(owner = "client!mk", name = "C", descriptor = "I")
    public int field5006;

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(IIIII)V")
    public final void method2049(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field5003 = arg0;
        this.field5006 = arg1;
        this.field5000 = arg2;
        this.field5004 = arg3;
        this.field5002 = arg4;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "()Lwa;")
    public final class439 method2050() {
        return this.field5005;
    }

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "()V")
    public final void method2051() {
        this.field4988 = true;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "([Lmp;Z)V")
    private final void method2052(class95[] arg0, boolean arg1) {
        for (int var3 = 0; var3 < 8; var3++) {
            field4996[var3] = false;
        }
        label73: for (class298 var4 = (class298) this.field4997.method2514((byte) 61); var4 != null; var4 = (class298) this.field4997.method2511(54)) {
            if (arg0 != null) {
                for (int var7 = 0; var7 < arg0.length; var7++) {
                    if (arg0[var7] == var4.field4507 || arg0[var7].field1328 == var4.field4507) {
                        field4996[var7] = true;
                        var4.method1841(false);
                        continue label73;
                    }
                }
            }
            if (!arg1) {
                var4.method625((byte) -50);
                this.field5001--;
                if (var4.method2628(-40)) {
                    var4.method2627(0);
                    class204.field3062--;
                }
            }
        }
        if (arg0 == null) {
            return;
        }
        for (int var5 = 0; var5 < arg0.length && this.field5001 != 8; var5++) {
            if (!field4996[var5]) {
                class298 var6 = null;
                if (class128.method751(-31686, arg0[var5].field1322).field4429 == 1 && class204.field3062 < 32) {
                    var6 = new class298(arg0[var5], this);
                    class19.field257.method2151((long) arg0[var5].field1322, var6, 9286);
                    class204.field3062++;
                }
                if (var6 == null) {
                    var6 = new class298(arg0[var5], this);
                }
                this.field4997.method2504(42, var6);
                this.field5001++;
                field4996[var5] = true;
            }
        }
    }

    @OriginalMember(owner = "client!mk", name = "c", descriptor = "()V")
    public static void method2053() {
        field4990 = null;
        field4996 = null;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(J)V")
    public final void method2054(long arg0) {
        this.field4993 = arg0;
    }

    @OriginalMember(owner = "client!mk", name = "d", descriptor = "()V")
    public final void method2055() {
        this.field5005.field6454.method514((byte) 81);
        for (class53 var1 = (class53) this.field4995.method2127(-1489721243); var1 != null; var1 = (class53) this.field4995.method2126(-39)) {
            var1.method310(this.field4992, 625974703);
        }
    }

    @OriginalMember(owner = "client!mk", name = "e", descriptor = "()V")
    public final void method2056() {
        this.field4991 = true;
        for (class298 var1 = (class298) this.field4997.method2514((byte) 61); var1 != null; var1 = (class298) this.field4997.method2511(99)) {
            if (var1.field4504.field4429 == 1) {
                var1.method2627(0);
            }
        }
        this.field4989 = new class370[8192];
        this.field4994 = 0;
        this.field4995 = new class354();
        this.field4998 = 0;
        this.field4997 = new class398();
        this.field5001 = 0;
        this.method2759((byte) -25);
    }

    @OriginalMember(owner = "client!mk", name = "f", descriptor = "()V")
    private final void method2057() {
        this.field4988 = false;
    }

    @OriginalMember(owner = "client!mk", name = "g", descriptor = "()V")
    public final void method2058() {
        this.field4999 = true;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(Ldr;[Ltr;Z)V")
    private final void method2059(class261 arg0, class219[] arg1, boolean arg2) {
        for (int var4 = 0; var4 < 8; var4++) {
            field4990[var4] = false;
        }
        label64: for (class53 var5 = (class53) this.field4995.method2127(-1489721243); var5 != null; var5 = (class53) this.field4995.method2126(-71)) {
            if (arg1 != null) {
                for (int var8 = 0; var8 < arg1.length; var8++) {
                    if (arg1[var8] == var5.field701 || arg1[var8].field3329 == var5.field701) {
                        field4990[var8] = true;
                        var5.method308((byte) 105);
                        var5.field690 = false;
                        continue label64;
                    }
                }
            }
            if (!arg2) {
                if (var5.field693 == 0) {
                    var5.method2759((byte) -25);
                    this.field4998--;
                } else {
                    var5.field690 = true;
                }
            }
        }
        if (arg1 == null) {
            return;
        }
        for (int var6 = 0; var6 < arg1.length && this.field4998 != 8; var6++) {
            if (!field4990[var6]) {
                class53 var7 = new class53(arg0, arg1[var6], this, this.field4993);
                this.field4995.method2125(var7, -29983);
                this.field4998++;
                field4990[var6] = true;
            }
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(Ldr;J[Ltr;[Lmp;Z)V")
    public final void method2060(class261 arg0, long arg1, class219[] arg2, class95[] arg3, boolean arg4) {
        if (!this.field4991) {
            this.method2059(arg0, arg2, arg4);
            this.method2052(arg3, arg4);
            this.field4993 = arg1;
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(Ldr;J)Z")
    public final boolean method2061(class261 arg0, long arg1) {
        if (this.field4993 == this.field4992) {
            this.method2057();
        } else {
            this.method2051();
        }
        if (arg1 - this.field4993 > 750L) {
            this.method2056();
            return false;
        }
        int var4 = (int) (arg1 - this.field4992);
        if (this.field4999) {
            for (class53 var5 = (class53) this.field4995.method2127(-1489721243); var5 != null; var5 = (class53) this.field4995.method2126(-108)) {
                for (int var6 = 0; var6 < var5.field697.field2880; var6++) {
                    var5.method309(arg1, false, arg0, !this.field4988, 1);
                }
            }
            this.field4999 = false;
        }
        for (class53 var7 = (class53) this.field4995.method2127(-1489721243); var7 != null; var7 = (class53) this.field4995.method2126(-72)) {
            var7.method309(arg1, false, arg0, !this.field4988, var4);
        }
        this.field4992 = arg1;
        return true;
    }

    @OriginalMember(owner = "client!mk", name = "<init>", descriptor = "(I)V")
    public class336(int arg0) {
        class261.field3979.method2125(this, -29983);
        this.field4993 = (long) arg0;
        this.field4992 = (long) arg0;
        this.field4999 = true;
    }
}
