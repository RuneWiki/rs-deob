import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eea")
public class class187 extends class91 {

    @OriginalMember(owner = "client!eea", name = "l", descriptor = "Z")
    public boolean field2814 = false;

    @OriginalMember(owner = "client!eea", name = "n", descriptor = "I")
    public int field2816 = 0;

    @OriginalMember(owner = "client!eea", name = "s", descriptor = "Z")
    private boolean field2821 = false;

    @OriginalMember(owner = "client!eea", name = "p", descriptor = "Lcp;")
    private class271 field2818 = new class271();

    @OriginalMember(owner = "client!eea", name = "t", descriptor = "I")
    private int field2822 = 0;

    @OriginalMember(owner = "client!eea", name = "u", descriptor = "Low;")
    public class665 field2823 = new class665();

    @OriginalMember(owner = "client!eea", name = "x", descriptor = "Z")
    public boolean field2826 = false;

    @OriginalMember(owner = "client!eea", name = "v", descriptor = "I")
    private int field2824 = 0;

    @OriginalMember(owner = "client!eea", name = "z", descriptor = "Z")
    private boolean field2828 = false;

    @OriginalMember(owner = "client!eea", name = "y", descriptor = "Lgka;")
    public class667 field2827 = new class667();

    @OriginalMember(owner = "client!eea", name = "k", descriptor = "[Lvda;")
    public class537[] field2813 = new class537[8192];

    @OriginalMember(owner = "client!eea", name = "o", descriptor = "[Z")
    private static boolean[] field2817 = new boolean[32];

    @OriginalMember(owner = "client!eea", name = "m", descriptor = "[Z")
    private static boolean[] field2815 = new boolean[8];

    @OriginalMember(owner = "client!eea", name = "w", descriptor = "I")
    public int field2825;

    @OriginalMember(owner = "client!eea", name = "q", descriptor = "J")
    private long field2819;

    @OriginalMember(owner = "client!eea", name = "r", descriptor = "J")
    private long field2820;

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "()V")
    private final void method1341() {
        this.field2821 = false;
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(Lha;[Lpi;Z)V")
    private final void method1342(class475 arg0, class335[] arg1, boolean arg2) {
        for (int var4 = 0; var4 < 32; var4++) {
            field2817[var4] = false;
        }
        label67: for (class611 var5 = (class611) this.field2818.method1730((byte) 83); var5 != null; var5 = (class611) this.field2818.method1729((byte) 100)) {
            if (arg1 != null) {
                for (int var8 = 0; var8 < arg1.length; var8++) {
                    if (arg1[var8] == var5.field8669 || arg1[var8].field4756 == var5.field8669) {
                        field2817[var8] = true;
                        var5.method3535(0);
                        var5.field8682 = false;
                        continue label67;
                    }
                }
            }
            if (!arg2) {
                if (var5.field8674 == 0) {
                    var5.method781(5555);
                    this.field2822--;
                } else {
                    var5.field8682 = true;
                }
            }
        }
        if (arg1 == null) {
            return;
        }
        for (int var6 = 0; var6 < arg1.length && var6 != 32 && this.field2822 != 32; var6++) {
            if (!field2817[var6]) {
                class611 var7 = new class611(arg0, arg1[var6], this, this.field2819);
                this.field2818.method1734(var7, 0);
                this.field2822++;
                field2817[var6] = true;
            }
        }
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(J)V")
    public final void method1343(long arg0) {
        this.field2819 = arg0;
    }

    @OriginalMember(owner = "client!eea", name = "b", descriptor = "()V")
    public final void method1344() {
        this.field2821 = true;
    }

    @OriginalMember(owner = "client!eea", name = "c", descriptor = "()V")
    public final void method1345() {
        this.field2814 = true;
        for (class135 var1 = (class135) this.field2823.method3731((byte) -67); var1 != null; var1 = (class135) this.field2823.method3729((byte) -120)) {
            if (var1.field2247.field2034 == 1) {
                var1.method2665(24902);
            }
        }
        for (int var2 = 0; var2 < this.field2813.length; var2++) {
            if (this.field2813[var2] != null) {
                this.field2813[var2].method3114();
                this.field2813[var2] = null;
            }
        }
        this.field2816 = 0;
        this.field2818 = new class271();
        this.field2822 = 0;
        this.field2823 = new class665();
        this.field2824 = 0;
        this.method781(5555);
        class506.field6966[class27.field291] = this;
        class27.field291 = class27.field291 + 1 & class145.field2349[class693.field9762];
    }

    @OriginalMember(owner = "client!eea", name = "d", descriptor = "()Lgka;")
    public final class667 method1346() {
        return this.field2827;
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(Lha;J[Lpi;[Lgfa;Z)V")
    public final void method1347(class475 arg0, long arg1, class335[] arg2, class740[] arg3, boolean arg4) {
        if (!this.field2814) {
            this.method1342(arg0, arg2, arg4);
            this.method1353(arg3, arg4);
            this.field2819 = arg1;
        }
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(Lha;)V")
    public final void method1348(class475 arg0) {
        this.field2827.field9377.method2129(0);
        for (class611 var2 = (class611) this.field2818.method1730((byte) 57); var2 != null; var2 = (class611) this.field2818.method1729((byte) 100)) {
            var2.method3534(arg0, this.field2820, -37);
        }
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(IZ)Leea;")
    public static final class187 method1349(int arg0, boolean arg1) {
        if (class358.field5080 == class27.field291) {
            return new class187(arg0, arg1);
        } else {
            class187 var2 = class506.field6966[class358.field5080];
            class358.field5080 = class358.field5080 + 1 & class145.field2349[class693.field9762];
            var2.method1354(arg0, arg1);
            return var2;
        }
    }

    @OriginalMember(owner = "client!eea", name = "e", descriptor = "()Lgka;")
    public final class667 method1350() {
        this.field2827.field9377.method2129(0);
        for (int var1 = 0; var1 < this.field2813.length; var1++) {
            if (this.field2813[var1] != null && this.field2813[var1].field7460 != null) {
                this.field2827.field9377.method2126(this.field2813[var1], -100);
            }
        }
        return this.field2827;
    }

    @OriginalMember(owner = "client!eea", name = "f", descriptor = "()V")
    public static void method1351() {
        field2817 = null;
        field2815 = null;
    }

    @OriginalMember(owner = "client!eea", name = "g", descriptor = "()V")
    public final void method1352() {
        this.field2828 = true;
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "([Lgfa;Z)V")
    private final void method1353(class740[] arg0, boolean arg1) {
        for (int var3 = 0; var3 < 8; var3++) {
            field2815[var3] = false;
        }
        label76: for (class135 var4 = (class135) this.field2823.method3731((byte) -88); var4 != null; var4 = (class135) this.field2823.method3729((byte) 91)) {
            if (arg0 != null) {
                for (int var7 = 0; var7 < arg0.length; var7++) {
                    if (arg0[var7] == var4.field2254 || arg0[var7].field10252 == var4.field2254) {
                        field2815[var7] = true;
                        var4.method1121(2);
                        continue label76;
                    }
                }
            }
            if (!arg1) {
                var4.method4237(-1);
                this.field2824--;
                if (var4.method2664(125)) {
                    var4.method2665(24902);
                    class120.field2045--;
                }
            }
        }
        if (arg0 == null) {
            return;
        }
        for (int var5 = 0; var5 < arg0.length && var5 != 8 && this.field2824 != 8; var5++) {
            if (!field2815[var5]) {
                class135 var6 = null;
                if (arg0[var5].method4076(-1).field2034 == 1 && class120.field2045 < 32) {
                    var6 = new class135(arg0[var5], this);
                    class74.field1141.method4267(var6, (long) arg0[var5].field10243, 1);
                    class120.field2045++;
                }
                if (var6 == null) {
                    var6 = new class135(arg0[var5], this);
                }
                this.field2823.method3728((byte) 114, var6);
                this.field2824++;
                field2815[var5] = true;
            }
        }
    }

    @OriginalMember(owner = "client!eea", name = "b", descriptor = "(IZ)V")
    private final void method1354(int arg0, boolean arg1) {
        class546.field7568.method1734(this, 0);
        this.field2819 = arg0;
        this.field2820 = arg0;
        this.field2828 = true;
        this.field2826 = arg1;
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(IIIII)V")
    public final void method1355(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field2825 = arg0;
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(Lha;J)Z")
    public final boolean method1356(class475 arg0, long arg1) {
        if (this.field2820 == this.field2819) {
            this.method1341();
        } else {
            this.method1344();
        }
        if (arg1 - this.field2819 > 750L) {
            this.method1345();
            return false;
        }
        int var4 = (int) (arg1 - this.field2820);
        if (this.field2828) {
            for (class611 var5 = (class611) this.field2818.method1730((byte) 72); var5 != null; var5 = (class611) this.field2818.method1729((byte) 100)) {
                for (int var6 = 0; var6 < var5.field8676.field8850; var6++) {
                    var5.method3533(arg1, 1, !this.field2821, -14167, arg0);
                }
            }
            this.field2828 = false;
        }
        for (class611 var7 = (class611) this.field2818.method1730((byte) 54); var7 != null; var7 = (class611) this.field2818.method1729((byte) 100)) {
            var7.method3533(arg1, var4, !this.field2821, -14167, arg0);
        }
        this.field2820 = arg1;
        return true;
    }

    @OriginalMember(owner = "client!eea", name = "<init>", descriptor = "(IZ)V")
    private class187(int arg0, boolean arg1) {
        this.method1354(arg0, arg1);
    }
}
