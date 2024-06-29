import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lm")
public class class351 extends class291 {

    @OriginalMember(owner = "client!lm", name = "i", descriptor = "Z")
    public boolean field5038 = false;

    @OriginalMember(owner = "client!lm", name = "j", descriptor = "Z")
    private boolean field5039 = false;

    @OriginalMember(owner = "client!lm", name = "k", descriptor = "I")
    public int field5040 = 0;

    @OriginalMember(owner = "client!lm", name = "p", descriptor = "Ldv;")
    private class477 field5045 = new class477();

    @OriginalMember(owner = "client!lm", name = "r", descriptor = "I")
    private int field5047 = 0;

    @OriginalMember(owner = "client!lm", name = "q", descriptor = "Lam;")
    public class455 field5046 = new class455();

    @OriginalMember(owner = "client!lm", name = "x", descriptor = "I")
    private int field5053 = 0;

    @OriginalMember(owner = "client!lm", name = "y", descriptor = "Z")
    private boolean field5054 = false;

    @OriginalMember(owner = "client!lm", name = "z", descriptor = "Lsj;")
    public class324 field5055 = new class324();

    @OriginalMember(owner = "client!lm", name = "l", descriptor = "[Luh;")
    public class115[] field5041 = new class115[8192];

    @OriginalMember(owner = "client!lm", name = "m", descriptor = "J")
    private long field5042;

    @OriginalMember(owner = "client!lm", name = "n", descriptor = "J")
    private long field5043;

    @OriginalMember(owner = "client!lm", name = "o", descriptor = "[Z")
    private static boolean[] field5044 = new boolean[8];

    @OriginalMember(owner = "client!lm", name = "h", descriptor = "[Z")
    private static boolean[] field5037 = new boolean[8];

    @OriginalMember(owner = "client!lm", name = "s", descriptor = "I")
    public int field5048;

    @OriginalMember(owner = "client!lm", name = "t", descriptor = "I")
    public int field5049;

    @OriginalMember(owner = "client!lm", name = "u", descriptor = "I")
    public int field5050;

    @OriginalMember(owner = "client!lm", name = "v", descriptor = "I")
    public int field5051;

    @OriginalMember(owner = "client!lm", name = "w", descriptor = "I")
    public int field5052;

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(Lza;J)Z", line = 3)
    public final boolean method2073(class290 arg0, long arg1) {
        if (this.field5043 == this.field5042) {
            this.method2074();
        } else {
            this.method2085();
        }
        if (arg1 - this.field5042 > 750L) {
            this.method2075();
            return false;
        }
        int var4 = (int) (arg1 - this.field5043);
        if (this.field5054) {
            for (class452 var5 = (class452) this.field5045.method2748(2); var5 != null; var5 = (class452) this.field5045.method2751(-16195)) {
                for (int var6 = 0; var6 < var5.field6324.field2284; var6++) {
                    var5.method2640(arg1, true, 1, arg0, !this.field5039);
                }
            }
            this.field5054 = false;
        }
        for (class452 var7 = (class452) this.field5045.method2748(2); var7 != null; var7 = (class452) this.field5045.method2751(-16195)) {
            var7.method2640(arg1, true, var4, arg0, !this.field5039);
        }
        this.field5043 = arg1;
        return true;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "()V", line = 52)
    private final void method2074() {
        this.field5039 = false;
    }

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "()V", line = 55)
    public final void method2075() {
        this.field5038 = true;
        for (class328 var1 = (class328) this.field5046.method2655(15152); var1 != null; var1 = (class328) this.field5046.method2660((byte) 67)) {
            if (var1.field4776.field7550 == 1) {
                var1.method2132(12);
            }
        }
        this.field5041 = new class115[8192];
        this.field5040 = 0;
        this.field5045 = new class477();
        this.field5047 = 0;
        this.field5046 = new class455();
        this.field5053 = 0;
        this.method1805((byte) 89);
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(Lza;J[Lck;[Lsd;Z)V", line = 76)
    public final void method2076(class290 arg0, long arg1, class462[] arg2, class63[] arg3, boolean arg4) {
        if (!this.field5038) {
            this.method2083(arg0, arg2, arg4);
            this.method2079(arg3, arg4);
            this.field5042 = arg1;
        }
    }

    @OriginalMember(owner = "client!lm", name = "c", descriptor = "()V", line = 84)
    public static void method2077() {
        field5044 = null;
        field5037 = null;
    }

    @OriginalMember(owner = "client!lm", name = "d", descriptor = "()V", line = 95)
    public final void method2078() {
        this.field5055.field4726.method106((byte) 101);
        for (class452 var1 = (class452) this.field5045.method2748(2); var1 != null; var1 = (class452) this.field5045.method2751(-16195)) {
            var1.method2642(this.field5043, -119);
        }
    }

    @OriginalMember(owner = "client!lm", name = "<init>", descriptor = "(I)V", line = 328)
    public class351(int arg0) {
        class271.field4027.method2753(4, this);
        this.field5042 = arg0;
        this.field5043 = arg0;
        this.field5054 = true;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "([Lsd;Z)V", line = 112)
    private final void method2079(class63[] arg0, boolean arg1) {
        for (int var3 = 0; var3 < 8; var3++) {
            field5037[var3] = false;
        }
        label73: for (class328 var4 = (class328) this.field5046.method2655(15152); var4 != null; var4 = (class328) this.field5046.method2660((byte) 67)) {
            if (arg0 != null) {
                for (int var7 = 0; var7 < arg0.length; var7++) {
                    if (arg0[var7] == var4.field4782 || arg0[var7].field794 == var4.field4782) {
                        field5037[var7] = true;
                        var4.method1975(false);
                        continue label73;
                    }
                }
            }
            if (!arg1) {
                var4.method2891(16);
                this.field5053--;
                if (var4.method2129(79)) {
                    var4.method2132(12);
                    class163.field2418--;
                }
            }
        }
        if (arg0 == null) {
            return;
        }
        for (int var5 = 0; var5 < arg0.length && this.field5053 != 8; var5++) {
            if (!field5037[var5]) {
                class328 var6 = null;
                if (arg0[var5].method504((byte) 45).field7550 == 1 && class163.field2418 < 32) {
                    var6 = new class328(arg0[var5], this);
                    class162.field2400.method174(-123, var6, (long) arg0[var5].field796);
                    class163.field2418++;
                }
                if (var6 == null) {
                    var6 = new class328(arg0[var5], this);
                }
                this.field5046.method2657(8492, var6);
                this.field5053++;
                field5037[var5] = true;
            }
        }
    }

    @OriginalMember(owner = "client!lm", name = "e", descriptor = "()V", line = 205)
    public final void method2080() {
        this.field5054 = true;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(IIIII)V", line = 208)
    public final void method2081(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field5049 = arg0;
        this.field5050 = arg1;
        this.field5048 = arg2;
        this.field5052 = arg3;
        this.field5051 = arg4;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(J)V", line = 215)
    public final void method2082(long arg0) {
        this.field5042 = arg0;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(Lza;[Lck;Z)V", line = 220)
    private final void method2083(class290 arg0, class462[] arg1, boolean arg2) {
        for (int var4 = 0; var4 < 8; var4++) {
            field5044[var4] = false;
        }
        label64: for (class452 var5 = (class452) this.field5045.method2748(2); var5 != null; var5 = (class452) this.field5045.method2751(-16195)) {
            if (arg1 != null) {
                for (int var8 = 0; var8 < arg1.length; var8++) {
                    if (arg1[var8] == var5.field6334 || arg1[var8].field6457 == var5.field6334) {
                        field5044[var8] = true;
                        var5.method2643(65535);
                        var5.field6316 = false;
                        continue label64;
                    }
                }
            }
            if (!arg2) {
                if (var5.field6337 == 0) {
                    var5.method1805((byte) 89);
                    this.field5047--;
                } else {
                    var5.field6316 = true;
                }
            }
        }
        if (arg1 == null) {
            return;
        }
        for (int var6 = 0; var6 < arg1.length && this.field5047 != 8; var6++) {
            if (!field5044[var6]) {
                class452 var7 = new class452(arg0, arg1[var6], this, this.field5042);
                this.field5045.method2753(4, var7);
                this.field5047++;
                field5044[var6] = true;
            }
        }
    }

    @OriginalMember(owner = "client!lm", name = "f", descriptor = "()Lsj;", line = 298)
    public final class324 method2084() {
        return this.field5055;
    }

    @OriginalMember(owner = "client!lm", name = "g", descriptor = "()V", line = 303)
    public final void method2085() {
        this.field5039 = true;
    }
}
