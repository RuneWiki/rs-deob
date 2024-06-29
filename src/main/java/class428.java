import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public class class428 extends class696 {

    @OriginalMember(owner = "client!aj", name = "o", descriptor = "Z")
    public boolean field6072 = false;

    @OriginalMember(owner = "client!aj", name = "l", descriptor = "Z")
    private boolean field6069 = false;

    @OriginalMember(owner = "client!aj", name = "q", descriptor = "I")
    public int field6074 = 0;

    @OriginalMember(owner = "client!aj", name = "p", descriptor = "Lwo;")
    private class314 field6073 = new class314();

    @OriginalMember(owner = "client!aj", name = "t", descriptor = "I")
    private int field6077 = 0;

    @OriginalMember(owner = "client!aj", name = "u", descriptor = "Lqia;")
    public class547 field6078 = new class547();

    @OriginalMember(owner = "client!aj", name = "w", descriptor = "I")
    private int field6080 = 0;

    @OriginalMember(owner = "client!aj", name = "x", descriptor = "Z")
    public boolean field6081 = false;

    @OriginalMember(owner = "client!aj", name = "z", descriptor = "Z")
    private boolean field6083 = false;

    @OriginalMember(owner = "client!aj", name = "y", descriptor = "Lcd;")
    public class603 field6082 = new class603();

    @OriginalMember(owner = "client!aj", name = "s", descriptor = "[Lia;")
    public class32[] field6076 = new class32[8192];

    @OriginalMember(owner = "client!aj", name = "m", descriptor = "[Z")
    private static boolean[] field6070 = new boolean[32];

    @OriginalMember(owner = "client!aj", name = "n", descriptor = "[Z")
    private static boolean[] field6071 = new boolean[8];

    @OriginalMember(owner = "client!aj", name = "v", descriptor = "I")
    public int field6079;

    @OriginalMember(owner = "client!aj", name = "k", descriptor = "J")
    private long field6068;

    @OriginalMember(owner = "client!aj", name = "r", descriptor = "J")
    private long field6075;

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "()Lcd;", line = 3)
    public final class603 method2540() {
        return this.field6082;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(Lha;J[Lal;[Lmi;Z)V", line = 6)
    public final void method2541(class454 arg0, long arg1, class183[] arg2, class27[] arg3, boolean arg4) {
        if (!this.field6072) {
            this.method2548(arg0, arg2, arg4);
            this.method2553(arg3, arg4);
            this.field6068 = arg1;
        }
    }

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "()V", line = 14)
    public static void method2542() {
        field6070 = null;
        field6071 = null;
    }

    @OriginalMember(owner = "client!aj", name = "c", descriptor = "()V", line = 20)
    public final void method2543() {
        this.field6072 = true;
        for (class593 var1 = (class593) this.field6078.method3111(96); var1 != null; var1 = (class593) this.field6078.method3116(-123)) {
            if (var1.field8253.field7013 == 1) {
                var1.method3409(118);
            }
        }
        for (int var2 = 0; var2 < this.field6076.length; var2++) {
            if (this.field6076[var2] != null) {
                this.field6076[var2].method308();
                this.field6076[var2] = null;
            }
        }
        this.field6074 = 0;
        this.field6073 = new class314();
        this.field6077 = 0;
        this.field6078 = new class547();
        this.field6080 = 0;
        this.method3869(true);
        class149.field1812[class185.field2421] = this;
        class185.field2421 = class185.field2421 + 1 & class613.field8536[class266.field3369];
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(IZ)Laj;", line = 56)
    public static final class428 method2544(int arg0, boolean arg1) {
        if (class185.field2421 == class111.field1371) {
            return new class428(arg0, arg1);
        } else {
            class428 var2 = class149.field1812[class111.field1371];
            class111.field1371 = class111.field1371 + 1 & class613.field8536[class266.field3369];
            var2.method2547(arg0, arg1);
            return var2;
        }
    }

    @OriginalMember(owner = "client!aj", name = "d", descriptor = "()Lcd;", line = 69)
    public final class603 method2545() {
        this.field6082.field8363.method2033((byte) 45);
        for (int var1 = 0; var1 < this.field6076.length; var1++) {
            if (this.field6076[var1] != null && this.field6076[var1].field500 != null) {
                this.field6082.field8363.method2031(1, this.field6076[var1]);
            }
        }
        return this.field6082;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(J)V", line = 84)
    public final void method2546(long arg0) {
        this.field6068 = arg0;
    }

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "(IZ)V", line = 87)
    private final void method2547(int arg0, boolean arg1) {
        class173.field2264.method1840(18, this);
        this.field6068 = arg0;
        this.field6075 = arg0;
        this.field6083 = true;
        this.field6081 = arg1;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(Lha;[Lal;Z)V", line = 96)
    private final void method2548(class454 arg0, class183[] arg1, boolean arg2) {
        for (int var4 = 0; var4 < 32; var4++) {
            field6070[var4] = false;
        }
        label67: for (class638 var5 = (class638) this.field6073.method1839(-127); var5 != null; var5 = (class638) this.field6073.method1836((byte) -26)) {
            if (arg1 != null) {
                for (int var8 = 0; var8 < arg1.length; var8++) {
                    if (arg1[var8] == var5.field8820 || arg1[var8].field2408 == var5.field8820) {
                        field6070[var8] = true;
                        var5.method3466(-4860);
                        var5.field8826 = false;
                        continue label67;
                    }
                }
            }
            if (!arg2) {
                if (var5.field8828 == 0) {
                    var5.method3869(true);
                    this.field6077--;
                } else {
                    var5.field8826 = true;
                }
            }
        }
        if (arg1 == null) {
            return;
        }
        for (int var6 = 0; var6 < arg1.length && var6 != 32 && this.field6077 != 32; var6++) {
            if (!field6070[var6]) {
                class638 var7 = new class638(arg0, arg1[var6], this, this.field6068);
                this.field6073.method1840(18, var7);
                this.field6077++;
                field6070[var6] = true;
            }
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(Lha;)V", line = 177)
    public final void method2549(class454 arg0) {
        this.field6082.field8363.method2033((byte) 45);
        for (class638 var2 = (class638) this.field6073.method1839(38); var2 != null; var2 = (class638) this.field6073.method1836((byte) -26)) {
            var2.method3462(arg0, 118, this.field6075);
        }
    }

    @OriginalMember(owner = "client!aj", name = "e", descriptor = "()V", line = 189)
    public final void method2550() {
        this.field6069 = true;
    }

    @OriginalMember(owner = "client!aj", name = "<init>", descriptor = "(IZ)V", line = 394)
    private class428(int arg0, boolean arg1) {
        this.method2547(arg0, arg1);
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(IIIII)V", line = 201)
    public final void method2551(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field6079 = arg0;
    }

    @OriginalMember(owner = "client!aj", name = "f", descriptor = "()V", line = 212)
    public final void method2552() {
        this.field6083 = true;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "([Lmi;Z)V", line = 223)
    private final void method2553(class27[] arg0, boolean arg1) {
        for (int var3 = 0; var3 < 8; var3++) {
            field6071[var3] = false;
        }
        label76: for (class593 var4 = (class593) this.field6078.method3111(55); var4 != null; var4 = (class593) this.field6078.method3116(-43)) {
            if (arg0 != null) {
                for (int var7 = 0; var7 < arg0.length; var7++) {
                    if (arg0[var7] == var4.field8256 || arg0[var7].field445 == var4.field8256) {
                        field6071[var7] = true;
                        var4.method3291((byte) -16);
                        continue label76;
                    }
                }
            }
            if (!arg1) {
                var4.method3426((byte) -10);
                this.field6080--;
                if (var4.method3411((byte) 99)) {
                    var4.method3409(125);
                    class541.field7619--;
                }
            }
        }
        if (arg0 == null) {
            return;
        }
        for (int var5 = 0; var5 < arg0.length && var5 != 8 && this.field6080 != 8; var5++) {
            if (!field6071[var5]) {
                class593 var6 = null;
                if (arg0[var5].method273(3758).field7013 == 1 && class541.field7619 < 32) {
                    var6 = new class593(arg0[var5], this);
                    class168.field2216.method3524(var6, (long) arg0[var5].field442, -22787);
                    class541.field7619++;
                }
                if (var6 == null) {
                    var6 = new class593(arg0[var5], this);
                }
                this.field6078.method3110(var6, 1);
                this.field6080++;
                field6071[var5] = true;
            }
        }
    }

    @OriginalMember(owner = "client!aj", name = "g", descriptor = "()V", line = 312)
    private final void method2554() {
        this.field6069 = false;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(Lha;J)Z", line = 339)
    public final boolean method2555(class454 arg0, long arg1) {
        if (this.field6075 == this.field6068) {
            this.method2554();
        } else {
            this.method2550();
        }
        if (arg1 - this.field6068 > 750L) {
            this.method2543();
            return false;
        }
        int var4 = (int) (arg1 - this.field6075);
        if (this.field6083) {
            for (class638 var5 = (class638) this.field6073.method1839(-125); var5 != null; var5 = (class638) this.field6073.method1836((byte) -26)) {
                for (int var6 = 0; var6 < var5.field8836.field4257; var6++) {
                    var5.method3465(1, !this.field6069, arg1, arg0, -31691);
                }
            }
            this.field6083 = false;
        }
        for (class638 var7 = (class638) this.field6073.method1839(-126); var7 != null; var7 = (class638) this.field6073.method1836((byte) -26)) {
            var7.method3465(var4, !this.field6069, arg1, arg0, -31691);
        }
        this.field6075 = arg1;
        return true;
    }
}
