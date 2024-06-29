import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public class class514 extends class631 {

    @OriginalMember(owner = "client!ii", name = "i", descriptor = "Z")
    public boolean field7146 = false;

    @OriginalMember(owner = "client!ii", name = "m", descriptor = "Z")
    private boolean field7150 = false;

    @OriginalMember(owner = "client!ii", name = "l", descriptor = "I")
    public int field7149 = 0;

    @OriginalMember(owner = "client!ii", name = "k", descriptor = "Lvu;")
    private class204 field7148 = new class204();

    @OriginalMember(owner = "client!ii", name = "s", descriptor = "I")
    private int field7156 = 0;

    @OriginalMember(owner = "client!ii", name = "r", descriptor = "Lwo;")
    public class445 field7155 = new class445();

    @OriginalMember(owner = "client!ii", name = "u", descriptor = "Z")
    public boolean field7158 = false;

    @OriginalMember(owner = "client!ii", name = "v", descriptor = "Z")
    private boolean field7159 = false;

    @OriginalMember(owner = "client!ii", name = "w", descriptor = "I")
    private int field7160 = 0;

    @OriginalMember(owner = "client!ii", name = "x", descriptor = "Lec;")
    public class144 field7161 = new class144();

    @OriginalMember(owner = "client!ii", name = "q", descriptor = "[Lnr;")
    public class145[] field7154 = new class145[8192];

    @OriginalMember(owner = "client!ii", name = "n", descriptor = "[Z")
    private static boolean[] field7151 = new boolean[8];

    @OriginalMember(owner = "client!ii", name = "p", descriptor = "[Z")
    private static boolean[] field7153 = new boolean[32];

    @OriginalMember(owner = "client!ii", name = "t", descriptor = "I")
    public int field7157;

    @OriginalMember(owner = "client!ii", name = "j", descriptor = "J")
    private long field7147;

    @OriginalMember(owner = "client!ii", name = "o", descriptor = "J")
    private long field7152;

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(Lr;J)Z")
    public final boolean method2905(class562 arg0, long arg1) {
        if (this.field7152 == this.field7147) {
            this.method2908();
        } else {
            this.method2912();
        }
        if (arg1 - this.field7147 > 750L) {
            this.method2918();
            return false;
        }
        int var4 = (int) (arg1 - this.field7152);
        if (this.field7159) {
            for (class618 var5 = (class618) this.field7148.method1298((byte) 40); var5 != null; var5 = (class618) this.field7148.method1305((byte) -105)) {
                for (int var6 = 0; var6 < var5.field8571.field2141; var6++) {
                    var5.method3418(!this.field7150, 1, arg1, 25172, arg0);
                }
            }
            this.field7159 = false;
        }
        for (class618 var7 = (class618) this.field7148.method1298((byte) 40); var7 != null; var7 = (class618) this.field7148.method1305((byte) -126)) {
            var7.method3418(!this.field7150, var4, arg1, 25172, arg0);
        }
        this.field7152 = arg1;
        return true;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(IIIII)V")
    public final void method2906(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field7157 = arg0;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(Lr;J[Lmp;[Lfk;Z)V")
    public final void method2907(class562 arg0, long arg1, class140[] arg2, class118[] arg3, boolean arg4) {
        if (!this.field7146) {
            this.method2916(arg0, arg2, arg4);
            this.method2910(arg3, arg4);
            this.field7147 = arg1;
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "()V")
    private final void method2908() {
        this.field7150 = false;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(IZ)Lii;")
    public static final class514 method2909(int arg0, boolean arg1) {
        if (class348.field4634 == class308.field4139) {
            return new class514(arg0, arg1);
        } else {
            class514 var2 = class163.field2347[class348.field4634];
            class348.field4634 = class348.field4634 + 1 & class16.field218[class310.field4194];
            var2.method2920(arg0, arg1);
            return var2;
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "([Lfk;Z)V")
    private final void method2910(class118[] arg0, boolean arg1) {
        for (int var3 = 0; var3 < 8; var3++) {
            field7151[var3] = false;
        }
        label76: for (class588 var4 = (class588) this.field7155.method2506(68); var4 != null; var4 = (class588) this.field7155.method2505(-115)) {
            if (arg0 != null) {
                for (int var7 = 0; var7 < arg0.length; var7++) {
                    if (arg0[var7] == var4.field8110 || arg0[var7].field1499 == var4.field8110) {
                        field7151[var7] = true;
                        var4.method3254(false);
                        continue label76;
                    }
                }
            }
            if (!arg1) {
                var4.method242(true);
                this.field7160--;
                if (var4.method1984(0)) {
                    var4.method1982((byte) -24);
                    class119.field1524--;
                }
            }
        }
        if (arg0 == null) {
            return;
        }
        for (int var5 = 0; var5 < arg0.length && var5 != 8 && this.field7160 != 8; var5++) {
            if (!field7151[var5]) {
                class588 var6 = null;
                if (arg0[var5].method690((byte) 123).field8740 == 1 && class119.field1524 < 32) {
                    var6 = new class588(arg0[var5], this);
                    class380.field5023.method719(var6, -109, (long) arg0[var5].field1500);
                    class119.field1524++;
                }
                if (var6 == null) {
                    var6 = new class588(arg0[var5], this);
                }
                this.field7155.method2507(var6, (byte) -127);
                this.field7160++;
                field7151[var5] = true;
            }
        }
    }

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "()V")
    public final void method2911() {
        this.field7159 = true;
    }

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "()V")
    public final void method2912() {
        this.field7150 = true;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(Lr;)V")
    public final void method2913(class562 arg0) {
        this.field7161.field1942.method1874(true);
        for (class618 var2 = (class618) this.field7148.method1298((byte) 40); var2 != null; var2 = (class618) this.field7148.method1305((byte) -117)) {
            var2.method3420(this.field7152, (byte) -108, arg0);
        }
    }

    @OriginalMember(owner = "client!ii", name = "d", descriptor = "()Lec;")
    public final class144 method2914() {
        this.field7161.field1942.method1874(true);
        for (int var1 = 0; var1 < this.field7154.length; var1++) {
            if (this.field7154[var1] != null && this.field7154[var1].field1953 != null) {
                this.field7161.field1942.method1877((byte) -18, this.field7154[var1]);
            }
        }
        return this.field7161;
    }

    @OriginalMember(owner = "client!ii", name = "e", descriptor = "()Lec;")
    public final class144 method2915() {
        return this.field7161;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(Lr;[Lmp;Z)V")
    private final void method2916(class562 arg0, class140[] arg1, boolean arg2) {
        for (int var4 = 0; var4 < 32; var4++) {
            field7153[var4] = false;
        }
        label67: for (class618 var5 = (class618) this.field7148.method1298((byte) 40); var5 != null; var5 = (class618) this.field7148.method1305((byte) -124)) {
            if (arg1 != null) {
                for (int var8 = 0; var8 < arg1.length; var8++) {
                    if (arg1[var8] == var5.field8574 || arg1[var8].field1891 == var5.field8574) {
                        field7153[var8] = true;
                        var5.method3421(-256);
                        var5.field8572 = false;
                        continue label67;
                    }
                }
            }
            if (!arg2) {
                if (var5.field8573 == 0) {
                    var5.method3499(12151);
                    this.field7156--;
                } else {
                    var5.field8572 = true;
                }
            }
        }
        if (arg1 == null) {
            return;
        }
        for (int var6 = 0; var6 < arg1.length && var6 != 32 && this.field7156 != 32; var6++) {
            if (!field7153[var6]) {
                class618 var7 = new class618(arg0, arg1[var6], this, this.field7147);
                this.field7148.method1300(var7, -1);
                this.field7156++;
                field7153[var6] = true;
            }
        }
    }

    @OriginalMember(owner = "client!ii", name = "f", descriptor = "()V")
    public static void method2917() {
        field7153 = null;
        field7151 = null;
    }

    @OriginalMember(owner = "client!ii", name = "g", descriptor = "()V")
    public final void method2918() {
        this.field7146 = true;
        for (class588 var1 = (class588) this.field7155.method2506(68); var1 != null; var1 = (class588) this.field7155.method2505(-110)) {
            if (var1.field8117.field8740 == 1) {
                var1.method1982((byte) -24);
            }
        }
        for (int var2 = 0; var2 < this.field7154.length; var2++) {
            if (this.field7154[var2] != null) {
                this.field7154[var2].method828();
                this.field7154[var2] = null;
            }
        }
        this.field7149 = 0;
        this.field7148 = new class204();
        this.field7156 = 0;
        this.field7155 = new class445();
        this.field7160 = 0;
        this.method3499(12151);
        class163.field2347[class308.field4139] = this;
        class308.field4139 = class308.field4139 + 1 & class16.field218[class310.field4194];
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(J)V")
    public final void method2919(long arg0) {
        this.field7147 = arg0;
    }

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "(IZ)V")
    private final void method2920(int arg0, boolean arg1) {
        class251.field3302.method1300(this, -1);
        this.field7147 = arg0;
        this.field7152 = arg0;
        this.field7159 = true;
        this.field7158 = arg1;
    }

    @OriginalMember(owner = "client!ii", name = "<init>", descriptor = "(IZ)V")
    private class514(int arg0, boolean arg1) {
        this.method2920(arg0, arg1);
    }
}
