import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dea")
public class class206 extends class287 {

    @OriginalMember(owner = "client!dea", name = "k", descriptor = "Z")
    public boolean field3059 = false;

    @OriginalMember(owner = "client!dea", name = "o", descriptor = "Z")
    private boolean field3063 = false;

    @OriginalMember(owner = "client!dea", name = "p", descriptor = "I")
    public int field3064 = 0;

    @OriginalMember(owner = "client!dea", name = "j", descriptor = "Ljc;")
    private class374 field3058 = new class374();

    @OriginalMember(owner = "client!dea", name = "r", descriptor = "I")
    private int field3066 = 0;

    @OriginalMember(owner = "client!dea", name = "q", descriptor = "Lbu;")
    public class19 field3065 = new class19();

    @OriginalMember(owner = "client!dea", name = "v", descriptor = "Z")
    private boolean field3070 = false;

    @OriginalMember(owner = "client!dea", name = "x", descriptor = "I")
    private int field3072 = 0;

    @OriginalMember(owner = "client!dea", name = "s", descriptor = "Lrd;")
    public class283 field3067 = new class283();

    @OriginalMember(owner = "client!dea", name = "h", descriptor = "[Lek;")
    public class434[] field3056 = new class434[8192];

    @OriginalMember(owner = "client!dea", name = "i", descriptor = "[Z")
    private static boolean[] field3057 = new boolean[8];

    @OriginalMember(owner = "client!dea", name = "n", descriptor = "[Z")
    private static boolean[] field3062 = new boolean[8];

    @OriginalMember(owner = "client!dea", name = "t", descriptor = "I")
    public int field3068;

    @OriginalMember(owner = "client!dea", name = "u", descriptor = "I")
    public int field3069;

    @OriginalMember(owner = "client!dea", name = "w", descriptor = "I")
    public int field3071;

    @OriginalMember(owner = "client!dea", name = "y", descriptor = "I")
    public int field3073;

    @OriginalMember(owner = "client!dea", name = "z", descriptor = "I")
    public int field3074;

    @OriginalMember(owner = "client!dea", name = "l", descriptor = "J")
    private long field3060;

    @OriginalMember(owner = "client!dea", name = "m", descriptor = "J")
    private long field3061;

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "(Lqa;J)Z", line = 3)
    public final boolean method1355(class208 arg0, long arg1) {
        if (this.field3061 == this.field3060) {
            this.method1365();
        } else {
            this.method1368();
        }
        if (arg1 - this.field3061 > 750L) {
            this.method1357();
            return false;
        }
        int var4 = (int) (arg1 - this.field3060);
        if (this.field3070) {
            for (class576 var5 = (class576) this.field3058.method2233(true); var5 != null; var5 = (class576) this.field3058.method2240(16772)) {
                for (int var6 = 0; var6 < var5.field8489.field8929; var6++) {
                    var5.method3432((byte) 111, arg1, 1, !this.field3063, arg0);
                }
            }
            this.field3070 = false;
        }
        for (class576 var7 = (class576) this.field3058.method2233(true); var7 != null; var7 = (class576) this.field3058.method2240(16772)) {
            var7.method3432((byte) 112, arg1, var4, !this.field3063, arg0);
        }
        this.field3060 = arg1;
        return true;
    }

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "()Lrd;", line = 51)
    public final class283 method1356() {
        return this.field3067;
    }

    @OriginalMember(owner = "client!dea", name = "b", descriptor = "()V", line = 56)
    public final void method1357() {
        this.field3059 = true;
        for (class139 var1 = (class139) this.field3065.method124((byte) 42); var1 != null; var1 = (class139) this.field3065.method120(-103)) {
            if (var1.field1975.field2342 == 1) {
                var1.method2987(-1);
            }
        }
        for (int var2 = 0; var2 < this.field3056.length; var2++) {
            if (this.field3056[var2] != null) {
                this.field3056[var2].method2531();
                this.field3056[var2] = null;
            }
        }
        this.field3064 = 0;
        this.field3058 = new class374();
        this.field3066 = 0;
        this.field3065 = new class19();
        this.field3072 = 0;
        this.method1783((byte) -117);
        class6.field57[class65.field803] = this;
        class65.field803 = class65.field803 + 1 & class330.field4548[class647.field9400];
    }

    @OriginalMember(owner = "client!dea", name = "b", descriptor = "(I)Ldea;", line = 93)
    public static final class206 method1358(int arg0) {
        if (class65.field803 == class450.field6324) {
            return new class206(arg0);
        } else {
            class206 var1 = class6.field57[class450.field6324];
            class450.field6324 = class450.field6324 + 1 & class330.field4548[class647.field9400];
            var1.method1359(arg0);
            return var1;
        }
    }

    @OriginalMember(owner = "client!dea", name = "c", descriptor = "(I)V", line = 106)
    private final void method1359(int arg0) {
        class515.field7349.method2241((byte) 66, this);
        this.field3061 = arg0;
        this.field3060 = arg0;
        this.field3070 = true;
    }

    @OriginalMember(owner = "client!dea", name = "b", descriptor = "(IIIII)V", line = 112)
    public final void method1360(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field3074 = arg0;
        this.field3073 = arg1;
        this.field3068 = arg2;
        this.field3071 = arg3;
        this.field3069 = arg4;
    }

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "([Lia;Z)V", line = 121)
    private final void method1361(class506[] arg0, boolean arg1) {
        for (int var3 = 0; var3 < 8; var3++) {
            field3062[var3] = false;
        }
        label73: for (class139 var4 = (class139) this.field3065.method124((byte) 42); var4 != null; var4 = (class139) this.field3065.method120(104)) {
            if (arg0 != null) {
                for (int var7 = 0; var7 < arg0.length; var7++) {
                    if (arg0[var7] == var4.field1980 || arg0[var7].field7160 == var4.field1980) {
                        field3062[var7] = true;
                        var4.method965(true);
                        continue label73;
                    }
                }
            }
            if (!arg1) {
                var4.method2457(-8422);
                this.field3072--;
                if (var4.method2989(false)) {
                    var4.method2987(-1);
                    class463.field6522--;
                }
            }
        }
        if (arg0 == null) {
            return;
        }
        for (int var5 = 0; var5 < arg0.length && this.field3072 != 8; var5++) {
            if (!field3062[var5]) {
                class139 var6 = null;
                if (arg0[var5].method3003(false).field2342 == 1 && class463.field6522 < 32) {
                    var6 = new class139(arg0[var5], this);
                    class20.field197.method1444(var6, (byte) -117, (long) arg0[var5].field7154);
                    class463.field6522++;
                }
                if (var6 == null) {
                    var6 = new class139(arg0[var5], this);
                }
                this.field3065.method131(var6, 0);
                this.field3072++;
                field3062[var5] = true;
            }
        }
    }

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "(Lqa;)V", line = 206)
    public final void method1362(class208 arg0) {
        this.field3067.field3959.method1245(101);
        for (class576 var2 = (class576) this.field3058.method2233(true); var2 != null; var2 = (class576) this.field3058.method2240(16772)) {
            var2.method3428((byte) -115, this.field3060, arg0);
        }
    }

    @OriginalMember(owner = "client!dea", name = "c", descriptor = "()V", line = 222)
    public static void method1363() {
        field3057 = null;
        field3062 = null;
    }

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "(Lqa;[Llh;Z)V", line = 228)
    private final void method1364(class208 arg0, class450[] arg1, boolean arg2) {
        for (int var4 = 0; var4 < 8; var4++) {
            field3057[var4] = false;
        }
        label64: for (class576 var5 = (class576) this.field3058.method2233(true); var5 != null; var5 = (class576) this.field3058.method2240(16772)) {
            if (arg1 != null) {
                for (int var8 = 0; var8 < arg1.length; var8++) {
                    if (arg1[var8] == var5.field8474 || arg1[var8].field6316 == var5.field8474) {
                        field3057[var8] = true;
                        var5.method3430(29288);
                        var5.field8469 = false;
                        continue label64;
                    }
                }
            }
            if (!arg2) {
                if (var5.field8485 == 0) {
                    var5.method1783((byte) 61);
                    this.field3066--;
                } else {
                    var5.field8469 = true;
                }
            }
        }
        if (arg1 == null) {
            return;
        }
        for (int var6 = 0; var6 < arg1.length && this.field3066 != 8; var6++) {
            if (!field3057[var6]) {
                class576 var7 = new class576(arg0, arg1[var6], this, this.field3061);
                this.field3058.method2241((byte) 66, var7);
                this.field3066++;
                field3057[var6] = true;
            }
        }
    }

    @OriginalMember(owner = "client!dea", name = "d", descriptor = "()V", line = 300)
    private final void method1365() {
        this.field3063 = false;
    }

    @OriginalMember(owner = "client!dea", name = "<init>", descriptor = "(I)V", line = 365)
    private class206(int arg0) {
        this.method1359(arg0);
    }

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "(Lqa;J[Llh;[Lia;Z)V", line = 309)
    public final void method1366(class208 arg0, long arg1, class450[] arg2, class506[] arg3, boolean arg4) {
        if (!this.field3059) {
            this.method1364(arg0, arg2, arg4);
            this.method1361(arg3, arg4);
            this.field3061 = arg1;
        }
    }

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "(J)V", line = 323)
    public final void method1367(long arg0) {
        this.field3061 = arg0;
    }

    @OriginalMember(owner = "client!dea", name = "e", descriptor = "()V", line = 329)
    public final void method1368() {
        this.field3063 = true;
    }

    @OriginalMember(owner = "client!dea", name = "f", descriptor = "()V", line = 332)
    public final void method1369() {
        this.field3070 = true;
    }
}
