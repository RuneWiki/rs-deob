import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lm")
public class class309 extends class588 {

    @OriginalMember(owner = "client!lm", name = "k", descriptor = "Z")
    private boolean field3944 = false;

    @OriginalMember(owner = "client!lm", name = "p", descriptor = "Z")
    public boolean field3949 = false;

    @OriginalMember(owner = "client!lm", name = "s", descriptor = "I")
    public int field3952 = 0;

    @OriginalMember(owner = "client!lm", name = "n", descriptor = "Lvda;")
    private class311 field3947 = new class311();

    @OriginalMember(owner = "client!lm", name = "t", descriptor = "I")
    private int field3953 = 0;

    @OriginalMember(owner = "client!lm", name = "u", descriptor = "Lbv;")
    public class568 field3954 = new class568();

    @OriginalMember(owner = "client!lm", name = "B", descriptor = "Z")
    private boolean field3961 = false;

    @OriginalMember(owner = "client!lm", name = "x", descriptor = "I")
    private int field3957 = 0;

    @OriginalMember(owner = "client!lm", name = "w", descriptor = "Lkw;")
    public class174 field3956 = new class174();

    @OriginalMember(owner = "client!lm", name = "l", descriptor = "[Lef;")
    public class533[] field3945 = new class533[8192];

    @OriginalMember(owner = "client!lm", name = "r", descriptor = "[Z")
    private static boolean[] field3951 = new boolean[32];

    @OriginalMember(owner = "client!lm", name = "q", descriptor = "[Z")
    private static boolean[] field3950 = new boolean[8];

    @OriginalMember(owner = "client!lm", name = "v", descriptor = "I")
    public int field3955;

    @OriginalMember(owner = "client!lm", name = "y", descriptor = "I")
    public int field3958;

    @OriginalMember(owner = "client!lm", name = "z", descriptor = "I")
    public int field3959;

    @OriginalMember(owner = "client!lm", name = "A", descriptor = "I")
    public int field3960;

    @OriginalMember(owner = "client!lm", name = "C", descriptor = "I")
    public int field3962;

    @OriginalMember(owner = "client!lm", name = "m", descriptor = "J")
    private long field3946;

    @OriginalMember(owner = "client!lm", name = "o", descriptor = "J")
    private long field3948;

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(I)Llm;")
    public static final class309 method1850(int arg0) {
        if (class68.field896 == class436.field5930) {
            return new class309(arg0);
        } else {
            class309 var1 = class453.field6429[class68.field896];
            class68.field896 = class68.field896 + 1 & class375.field5224[class21.field306];
            var1.method1852(arg0);
            return var1;
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(Lqa;[Lkca;Z)V")
    private final void method1851(class167 arg0, class601[] arg1, boolean arg2) {
        for (int var4 = 0; var4 < 32; var4++) {
            field3951[var4] = false;
        }
        label67: for (class624 var5 = (class624) this.field3947.method1876((byte) 105); var5 != null; var5 = (class624) this.field3947.method1877(0)) {
            if (arg1 != null) {
                for (int var8 = 0; var8 < arg1.length; var8++) {
                    if (arg1[var8] == var5.field9026 || arg1[var8].field8692 == var5.field9026) {
                        field3951[var8] = true;
                        var5.method3602(1);
                        var5.field9034 = false;
                        continue label67;
                    }
                }
            }
            if (!arg2) {
                if (var5.field9012 == 0) {
                    var5.method3394(false);
                    this.field3953--;
                } else {
                    var5.field9034 = true;
                }
            }
        }
        if (arg1 == null) {
            return;
        }
        for (int var6 = 0; var6 < arg1.length && var6 != 32 && this.field3953 != 32; var6++) {
            if (!field3951[var6]) {
                class624 var7 = new class624(arg0, arg1[var6], this, this.field3946);
                this.field3947.method1873(var7, true);
                this.field3953++;
                field3951[var6] = true;
            }
        }
    }

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "(I)V")
    private final void method1852(int arg0) {
        class2.field18.method1873(this, true);
        this.field3946 = arg0;
        this.field3948 = arg0;
        this.field3961 = true;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "()V")
    public static void method1853() {
        field3951 = null;
        field3950 = null;
    }

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "()V")
    private final void method1854() {
        this.field3944 = false;
    }

    @OriginalMember(owner = "client!lm", name = "c", descriptor = "()V")
    public final void method1855() {
        this.field3961 = true;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(Lqa;J[Lkca;[Lfi;Z)V")
    public final void method1856(class167 arg0, long arg1, class601[] arg2, class55[] arg3, boolean arg4) {
        if (!this.field3949) {
            this.method1851(arg0, arg2, arg4);
            this.method1858(arg3, arg4);
            this.field3946 = arg1;
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(Lqa;)V")
    public final void method1857(class167 arg0) {
        this.field3956.field2253.method1255(-123);
        for (class624 var2 = (class624) this.field3947.method1876((byte) -106); var2 != null; var2 = (class624) this.field3947.method1877(0)) {
            var2.method3599(21434, arg0, this.field3948);
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "([Lfi;Z)V")
    private final void method1858(class55[] arg0, boolean arg1) {
        for (int var3 = 0; var3 < 8; var3++) {
            field3950[var3] = false;
        }
        label76: for (class109 var4 = (class109) this.field3954.method3188((byte) -100); var4 != null; var4 = (class109) this.field3954.method3182((byte) -40)) {
            if (arg0 != null) {
                for (int var7 = 0; var7 < arg0.length; var7++) {
                    if (arg0[var7] == var4.field1416 || arg0[var7].field734 == var4.field1416) {
                        field3950[var7] = true;
                        var4.method592(2);
                        continue label76;
                    }
                }
            }
            if (!arg1) {
                var4.method589(-8880);
                this.field3957--;
                if (var4.method3150(false)) {
                    var4.method3149(-18724);
                    class556.field7774--;
                }
            }
        }
        if (arg0 == null) {
            return;
        }
        for (int var5 = 0; var5 < arg0.length && var5 != 8 && this.field3957 != 8; var5++) {
            if (!field3950[var5]) {
                class109 var6 = null;
                if (arg0[var5].method302(22461).field5331 == 1 && class556.field7774 < 32) {
                    var6 = new class109(arg0[var5], this);
                    class508.field7083.method3165((long) arg0[var5].field732, var6, false);
                    class556.field7774++;
                }
                if (var6 == null) {
                    var6 = new class109(arg0[var5], this);
                }
                this.field3954.method3181(var6, true);
                this.field3957++;
                field3950[var5] = true;
            }
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(IIIII)V")
    public final void method1859(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field3962 = arg0;
        this.field3959 = arg1;
        this.field3958 = arg2;
        this.field3955 = arg3;
        this.field3960 = arg4;
    }

    @OriginalMember(owner = "client!lm", name = "d", descriptor = "()V")
    public final void method1860() {
        this.field3949 = true;
        for (class109 var1 = (class109) this.field3954.method3188((byte) -100); var1 != null; var1 = (class109) this.field3954.method3182((byte) -98)) {
            if (var1.field1412.field5331 == 1) {
                var1.method3149(-18724);
            }
        }
        for (int var2 = 0; var2 < this.field3945.length; var2++) {
            if (this.field3945[var2] != null) {
                this.field3945[var2].method2963();
                this.field3945[var2] = null;
            }
        }
        this.field3952 = 0;
        this.field3947 = new class311();
        this.field3953 = 0;
        this.field3954 = new class568();
        this.field3957 = 0;
        this.method3394(false);
        class453.field6429[class436.field5930] = this;
        class436.field5930 = class436.field5930 + 1 & class375.field5224[class21.field306];
    }

    @OriginalMember(owner = "client!lm", name = "e", descriptor = "()V")
    public final void method1861() {
        this.field3944 = true;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(J)V")
    public final void method1862(long arg0) {
        this.field3946 = arg0;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(Lqa;J)Z")
    public final boolean method1863(class167 arg0, long arg1) {
        if (this.field3948 == this.field3946) {
            this.method1854();
        } else {
            this.method1861();
        }
        if (arg1 - this.field3946 > 750L) {
            this.method1860();
            return false;
        }
        int var4 = (int) (arg1 - this.field3948);
        if (this.field3961) {
            for (class624 var5 = (class624) this.field3947.method1876((byte) -102); var5 != null; var5 = (class624) this.field3947.method1877(0)) {
                for (int var6 = 0; var6 < var5.field9031.field5767; var6++) {
                    var5.method3601(-1759325128, !this.field3944, arg0, 1, arg1);
                }
            }
            this.field3961 = false;
        }
        for (class624 var7 = (class624) this.field3947.method1876((byte) -50); var7 != null; var7 = (class624) this.field3947.method1877(0)) {
            var7.method3601(-1759325128, !this.field3944, arg0, var4, arg1);
        }
        this.field3948 = arg1;
        return true;
    }

    @OriginalMember(owner = "client!lm", name = "f", descriptor = "()Lkw;")
    public final class174 method1864() {
        return this.field3956;
    }

    @OriginalMember(owner = "client!lm", name = "<init>", descriptor = "(I)V")
    private class309(int arg0) {
        this.method1852(arg0);
    }
}
