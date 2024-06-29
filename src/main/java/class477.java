import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class477 extends class211 {

    @OriginalMember(owner = "client!dd", name = "q", descriptor = "Z")
    public boolean field7292 = false;

    @OriginalMember(owner = "client!dd", name = "m", descriptor = "I")
    public int field7288 = 0;

    @OriginalMember(owner = "client!dd", name = "n", descriptor = "Z")
    private boolean field7289 = false;

    @OriginalMember(owner = "client!dd", name = "l", descriptor = "Ljg;")
    private class215 field7287 = new class215();

    @OriginalMember(owner = "client!dd", name = "t", descriptor = "I")
    private int field7295 = 0;

    @OriginalMember(owner = "client!dd", name = "u", descriptor = "Lft;")
    public class4 field7296 = new class4();

    @OriginalMember(owner = "client!dd", name = "x", descriptor = "I")
    private int field7299 = 0;

    @OriginalMember(owner = "client!dd", name = "A", descriptor = "Z")
    private boolean field7302 = false;

    @OriginalMember(owner = "client!dd", name = "B", descriptor = "Lii;")
    public class372 field7303 = new class372();

    @OriginalMember(owner = "client!dd", name = "k", descriptor = "[Lhu;")
    public class81[] field7286 = new class81[8192];

    @OriginalMember(owner = "client!dd", name = "p", descriptor = "J")
    private long field7291;

    @OriginalMember(owner = "client!dd", name = "s", descriptor = "J")
    private long field7294;

    @OriginalMember(owner = "client!dd", name = "r", descriptor = "[Z")
    private static boolean[] field7293 = new boolean[8];

    @OriginalMember(owner = "client!dd", name = "o", descriptor = "[Z")
    private static boolean[] field7290 = new boolean[8];

    @OriginalMember(owner = "client!dd", name = "v", descriptor = "I")
    public int field7297;

    @OriginalMember(owner = "client!dd", name = "w", descriptor = "I")
    public int field7298;

    @OriginalMember(owner = "client!dd", name = "y", descriptor = "I")
    public int field7300;

    @OriginalMember(owner = "client!dd", name = "z", descriptor = "I")
    public int field7301;

    @OriginalMember(owner = "client!dd", name = "C", descriptor = "I")
    public int field7304;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Lqq;J)Z", line = 5)
    public final boolean method2876(class318 arg0, long arg1) {
        if (this.field7294 == this.field7291) {
            this.method2888();
        } else {
            this.method2878();
        }
        if (arg1 - this.field7291 > 750L) {
            this.method2881();
            return false;
        }
        int var4 = (int) (arg1 - this.field7294);
        if (this.field7302) {
            for (class33 var5 = (class33) this.field7287.method1319(84); var5 != null; var5 = (class33) this.field7287.method1320((byte) -86)) {
                for (int var6 = 0; var6 < var5.field432.field5635; var6++) {
                    var5.method182(32766, arg1, 1, arg0, !this.field7289);
                }
            }
            this.field7302 = false;
        }
        for (class33 var7 = (class33) this.field7287.method1319(-125); var7 != null; var7 = (class33) this.field7287.method1320((byte) -95)) {
            var7.method182(32766, arg1, var4, arg0, !this.field7289);
        }
        this.field7294 = arg1;
        return true;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Lqq;[Loo;Z)V", line = 55)
    private final void method2877(class318 arg0, class425[] arg1, boolean arg2) {
        for (int var4 = 0; var4 < 8; var4++) {
            field7290[var4] = false;
        }
        label64: for (class33 var5 = (class33) this.field7287.method1319(-106); var5 != null; var5 = (class33) this.field7287.method1320((byte) -70)) {
            if (arg1 != null) {
                for (int var8 = 0; var8 < arg1.length; var8++) {
                    if (arg1[var8] == var5.field442 || arg1[var8].field6099 == var5.field442) {
                        field7290[var8] = true;
                        var5.method183(1);
                        var5.field434 = false;
                        continue label64;
                    }
                }
            }
            if (!arg2) {
                if (var5.field420 == 0) {
                    var5.method1297((byte) -124);
                    this.field7295--;
                } else {
                    var5.field434 = true;
                }
            }
        }
        if (arg1 == null) {
            return;
        }
        for (int var6 = 0; var6 < arg1.length && this.field7295 != 8; var6++) {
            if (!field7290[var6]) {
                class33 var7 = new class33(arg0, arg1[var6], this, this.field7291);
                this.field7287.method1321((byte) 0, var7);
                this.field7295++;
                field7290[var6] = true;
            }
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "()V", line = 129)
    public final void method2878() {
        this.field7289 = true;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Lqq;J[Loo;[Lma;Z)V", line = 133)
    public final void method2879(class318 arg0, long arg1, class425[] arg2, class10[] arg3, boolean arg4) {
        if (!this.field7292) {
            this.method2877(arg0, arg2, arg4);
            this.method2880(arg3, arg4);
            this.field7291 = arg1;
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "([Lma;Z)V", line = 143)
    private final void method2880(class10[] arg0, boolean arg1) {
        for (int var3 = 0; var3 < 8; var3++) {
            field7293[var3] = false;
        }
        label73: for (class183 var4 = (class183) this.field7296.method8((byte) -98); var4 != null; var4 = (class183) this.field7296.method17((byte) -110)) {
            if (arg0 != null) {
                for (int var7 = 0; var7 < arg0.length; var7++) {
                    if (arg0[var7] == var4.field2916 || arg0[var7].field133 == var4.field2916) {
                        field7293[var7] = true;
                        var4.method1148((byte) 28);
                        continue label73;
                    }
                }
            }
            if (!arg1) {
                var4.method1121(false);
                this.field7299--;
                if (var4.method1510((byte) 96)) {
                    var4.method1512((byte) 123);
                    class455.field6981--;
                }
            }
        }
        if (arg0 == null) {
            return;
        }
        for (int var5 = 0; var5 < arg0.length && this.field7299 != 8; var5++) {
            if (!field7293[var5]) {
                class183 var6 = null;
                if (arg0[var5].method52((byte) 109).field6883 == 1 && class455.field6981 < 32) {
                    var6 = new class183(arg0[var5], this);
                    class295.field4482.method2829((byte) -118, var6, (long) arg0[var5].field130);
                    class455.field6981++;
                }
                if (var6 == null) {
                    var6 = new class183(arg0[var5], this);
                }
                this.field7296.method4(1, var6);
                this.field7299++;
                field7293[var5] = true;
            }
        }
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "()V", line = 231)
    public final void method2881() {
        this.field7292 = true;
        for (class183 var1 = (class183) this.field7296.method8((byte) -98); var1 != null; var1 = (class183) this.field7296.method17((byte) -77)) {
            if (var1.field2910.field6883 == 1) {
                var1.method1512((byte) 119);
            }
        }
        this.field7286 = new class81[8192];
        this.field7288 = 0;
        this.field7287 = new class215();
        this.field7295 = 0;
        this.field7296 = new class4();
        this.field7299 = 0;
        this.method1297((byte) -124);
    }

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "()Lii;", line = 252)
    public final class372 method2882() {
        return this.field7303;
    }

    @OriginalMember(owner = "client!dd", name = "<init>", descriptor = "(I)V", line = 331)
    public class477(int arg0) {
        class139.field2285.method1321((byte) 0, this);
        this.field7291 = arg0;
        this.field7294 = arg0;
        this.field7302 = true;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIIII)V", line = 261)
    public final void method2883(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field7304 = arg0;
        this.field7300 = arg1;
        this.field7297 = arg2;
        this.field7298 = arg3;
        this.field7301 = arg4;
    }

    @OriginalMember(owner = "client!dd", name = "d", descriptor = "()V", line = 272)
    public final void method2884() {
        this.field7303.field5447.method1076((byte) -104);
        for (class33 var1 = (class33) this.field7287.method1319(44); var1 != null; var1 = (class33) this.field7287.method1320((byte) -74)) {
            var1.method181((byte) -56, this.field7294);
        }
    }

    @OriginalMember(owner = "client!dd", name = "e", descriptor = "()V", line = 284)
    public static void method2885() {
        field7290 = null;
        field7293 = null;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(J)V", line = 291)
    public final void method2886(long arg0) {
        this.field7291 = arg0;
    }

    @OriginalMember(owner = "client!dd", name = "f", descriptor = "()V", line = 295)
    public final void method2887() {
        this.field7302 = true;
    }

    @OriginalMember(owner = "client!dd", name = "g", descriptor = "()V", line = 298)
    private final void method2888() {
        this.field7289 = false;
    }
}
