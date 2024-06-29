import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cv")
public class class593 extends class571 {

    @OriginalMember(owner = "client!cv", name = "m", descriptor = "Z")
    private boolean field8344 = false;

    @OriginalMember(owner = "client!cv", name = "l", descriptor = "I")
    public int field8343 = 0;

    @OriginalMember(owner = "client!cv", name = "r", descriptor = "Z")
    public boolean field8349 = false;

    @OriginalMember(owner = "client!cv", name = "j", descriptor = "Lvv;")
    private class343 field8341 = new class343();

    @OriginalMember(owner = "client!cv", name = "t", descriptor = "I")
    private int field8351 = 0;

    @OriginalMember(owner = "client!cv", name = "s", descriptor = "Lok;")
    public class266 field8350 = new class266();

    @OriginalMember(owner = "client!cv", name = "v", descriptor = "Z")
    private boolean field8353 = false;

    @OriginalMember(owner = "client!cv", name = "w", descriptor = "Z")
    public boolean field8354 = false;

    @OriginalMember(owner = "client!cv", name = "y", descriptor = "I")
    private int field8356 = 0;

    @OriginalMember(owner = "client!cv", name = "u", descriptor = "Lkd;")
    public class296 field8352 = new class296();

    @OriginalMember(owner = "client!cv", name = "n", descriptor = "[Luk;")
    public class272[] field8345 = new class272[8192];

    @OriginalMember(owner = "client!cv", name = "p", descriptor = "[Z")
    private static boolean[] field8347 = new boolean[8];

    @OriginalMember(owner = "client!cv", name = "q", descriptor = "[Z")
    private static boolean[] field8348 = new boolean[32];

    @OriginalMember(owner = "client!cv", name = "x", descriptor = "I")
    public int field8355;

    @OriginalMember(owner = "client!cv", name = "k", descriptor = "J")
    private long field8342;

    @OriginalMember(owner = "client!cv", name = "o", descriptor = "J")
    private long field8346;

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(J)V", line = 3)
    public final void method3446(long arg0) {
        this.field8342 = arg0;
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(IZ)V", line = 7)
    private final void method3447(int arg0, boolean arg1) {
        class20.field339.method2173(-110, this);
        this.field8342 = arg0;
        this.field8346 = arg0;
        this.field8353 = true;
        this.field8354 = arg1;
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(Lha;J)Z", line = 14)
    public final boolean method3448(class65 arg0, long arg1) {
        if (this.field8346 == this.field8342) {
            this.method3461();
        } else {
            this.method3451();
        }
        if (arg1 - this.field8342 > 750L) {
            this.method3460();
            return false;
        }
        int var4 = (int) (arg1 - this.field8346);
        if (this.field8353) {
            for (class559 var5 = (class559) this.field8341.method2170(false); var5 != null; var5 = (class559) this.field8341.method2176(-17754)) {
                for (int var6 = 0; var6 < var5.field7946.field10271; var6++) {
                    var5.method3309(arg0, arg1, 1, !this.field8344, false);
                }
            }
            this.field8353 = false;
        }
        for (class559 var7 = (class559) this.field8341.method2170(false); var7 != null; var7 = (class559) this.field8341.method2176(-17754)) {
            var7.method3309(arg0, arg1, var4, !this.field8344, false);
        }
        this.field8346 = arg1;
        return true;
    }

    @OriginalMember(owner = "client!cv", name = "<init>", descriptor = "(IZ)V", line = 394)
    private class593(int arg0, boolean arg1) {
        this.method3447(arg0, arg1);
    }

    @OriginalMember(owner = "client!cv", name = "b", descriptor = "(IZ)Lcv;", line = 69)
    public static final class593 method3449(int arg0, boolean arg1) {
        if (class445.field6050 == class403.field5514) {
            return new class593(arg0, arg1);
        } else {
            class593 var2 = class195.field3000[class445.field6050];
            class445.field6050 = class445.field6050 + 1 & class267.field3892[class715.field9934];
            var2.method3447(arg0, arg1);
            return var2;
        }
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "()Lkd;", line = 82)
    public final class296 method3450() {
        return this.field8352;
    }

    @OriginalMember(owner = "client!cv", name = "b", descriptor = "()V", line = 85)
    public final void method3451() {
        this.field8344 = true;
    }

    @OriginalMember(owner = "client!cv", name = "c", descriptor = "()V", line = 88)
    public final void method3452() {
        this.field8353 = true;
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "([Loq;Z)V", line = 93)
    private final void method3453(class378[] arg0, boolean arg1) {
        for (int var3 = 0; var3 < 8; var3++) {
            field8347[var3] = false;
        }
        label76: for (class409 var4 = (class409) this.field8350.method1731((byte) -114); var4 != null; var4 = (class409) this.field8350.method1724(0)) {
            if (arg0 != null) {
                for (int var7 = 0; var7 < arg0.length; var7++) {
                    if (arg0[var7] == var4.field5563 || arg0[var7].field5213 == var4.field5563) {
                        field8347[var7] = true;
                        var4.method2492((byte) 100);
                        continue label76;
                    }
                }
            }
            if (!arg1) {
                var4.method3387((byte) -126);
                this.field8356--;
                if (var4.method830(1)) {
                    var4.method827(3);
                    class380.field5260--;
                }
            }
        }
        if (arg0 == null) {
            return;
        }
        for (int var5 = 0; var5 < arg0.length && var5 != 8 && this.field8356 != 8; var5++) {
            if (!field8347[var5]) {
                class409 var6 = null;
                if (arg0[var5].method2342(false).field1999 == 1 && class380.field5260 < 32) {
                    var6 = new class409(arg0[var5], this);
                    class216.field3354.method3373((long) arg0[var5].field5218, var6, (byte) -127);
                    class380.field5260++;
                }
                if (var6 == null) {
                    var6 = new class409(arg0[var5], this);
                }
                this.field8350.method1727(var6, (byte) 65);
                this.field8356++;
                field8347[var5] = true;
            }
        }
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(Lha;)V", line = 181)
    public final void method3454(class65 arg0) {
        this.field8352.field4304.method4279(0);
        for (class559 var2 = (class559) this.field8341.method2170(false); var2 != null; var2 = (class559) this.field8341.method2176(-17754)) {
            var2.method3306(-125, this.field8346, arg0);
        }
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(Lha;[Lgv;Z)V", line = 195)
    private final void method3455(class65 arg0, class88[] arg1, boolean arg2) {
        for (int var4 = 0; var4 < 32; var4++) {
            field8348[var4] = false;
        }
        label67: for (class559 var5 = (class559) this.field8341.method2170(false); var5 != null; var5 = (class559) this.field8341.method2176(-17754)) {
            if (arg1 != null) {
                for (int var8 = 0; var8 < arg1.length; var8++) {
                    if (arg1[var8] == var5.field7953 || arg1[var8].field977 == var5.field7953) {
                        field8348[var8] = true;
                        var5.method3311(6523);
                        var5.field7958 = false;
                        continue label67;
                    }
                }
            }
            if (!arg2) {
                if (var5.field7949 == 0) {
                    var5.method3358(83);
                    this.field8351--;
                } else {
                    var5.field7958 = true;
                }
            }
        }
        if (arg1 == null) {
            return;
        }
        for (int var6 = 0; var6 < arg1.length && var6 != 32 && this.field8351 != 32; var6++) {
            if (!field8348[var6]) {
                class559 var7 = new class559(arg0, arg1[var6], this, this.field8342);
                this.field8341.method2173(122, var7);
                this.field8351++;
                field8348[var6] = true;
            }
        }
    }

    @OriginalMember(owner = "client!cv", name = "d", descriptor = "()Lkd;", line = 270)
    public final class296 method3456() {
        this.field8352.field4304.method4279(0);
        for (int var1 = 0; var1 < this.field8345.length; var1++) {
            if (this.field8345[var1] != null && this.field8345[var1].field3926 != null) {
                this.field8352.field4304.method4278(0, this.field8345[var1]);
            }
        }
        return this.field8352;
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(Lha;J[Lgv;[Loq;Z)V", line = 288)
    public final void method3457(class65 arg0, long arg1, class88[] arg2, class378[] arg3, boolean arg4) {
        if (!this.field8349) {
            this.method3455(arg0, arg2, arg4);
            this.method3453(arg3, arg4);
            this.field8342 = arg1;
        }
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(IIIII)V", line = 297)
    public final void method3458(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field8355 = arg0;
    }

    @OriginalMember(owner = "client!cv", name = "e", descriptor = "()V", line = 309)
    public static void method3459() {
        field8348 = null;
        field8347 = null;
    }

    @OriginalMember(owner = "client!cv", name = "f", descriptor = "()V", line = 313)
    public final void method3460() {
        this.field8349 = true;
        for (class409 var1 = (class409) this.field8350.method1731((byte) -113); var1 != null; var1 = (class409) this.field8350.method1724(0)) {
            if (var1.field5555.field1999 == 1) {
                var1.method827(3);
            }
        }
        for (int var2 = 0; var2 < this.field8345.length; var2++) {
            if (this.field8345[var2] != null) {
                this.field8345[var2].method1756();
                this.field8345[var2] = null;
            }
        }
        this.field8343 = 0;
        this.field8341 = new class343();
        this.field8351 = 0;
        this.field8350 = new class266();
        this.field8356 = 0;
        this.method3358(-67);
        class195.field3000[class403.field5514] = this;
        class403.field5514 = class403.field5514 + 1 & class267.field3892[class715.field9934];
    }

    @OriginalMember(owner = "client!cv", name = "g", descriptor = "()V", line = 351)
    private final void method3461() {
        this.field8344 = false;
    }
}
