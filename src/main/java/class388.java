import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ju")
public class class388 extends class461 {

    @OriginalMember(owner = "client!ju", name = "u", descriptor = "I")
    public int field5530 = 0;

    @OriginalMember(owner = "client!ju", name = "o", descriptor = "Z")
    private boolean field5524 = false;

    @OriginalMember(owner = "client!ju", name = "v", descriptor = "Z")
    public boolean field5531 = false;

    @OriginalMember(owner = "client!ju", name = "q", descriptor = "Lbt;")
    private class519 field5526 = new class519();

    @OriginalMember(owner = "client!ju", name = "x", descriptor = "I")
    private int field5533 = 0;

    @OriginalMember(owner = "client!ju", name = "w", descriptor = "Lv;")
    public class165 field5532 = new class165();

    @OriginalMember(owner = "client!ju", name = "z", descriptor = "I")
    private int field5535 = 0;

    @OriginalMember(owner = "client!ju", name = "C", descriptor = "Z")
    public boolean field5538 = false;

    @OriginalMember(owner = "client!ju", name = "B", descriptor = "Z")
    private boolean field5537 = false;

    @OriginalMember(owner = "client!ju", name = "A", descriptor = "Lhda;")
    public class714 field5536 = new class714();

    @OriginalMember(owner = "client!ju", name = "t", descriptor = "[Lfja;")
    public class200[] field5529 = new class200[8192];

    @OriginalMember(owner = "client!ju", name = "p", descriptor = "[Z")
    private static boolean[] field5525 = new boolean[8];

    @OriginalMember(owner = "client!ju", name = "n", descriptor = "[Z")
    private static boolean[] field5523 = new boolean[32];

    @OriginalMember(owner = "client!ju", name = "y", descriptor = "I")
    public int field5534;

    @OriginalMember(owner = "client!ju", name = "r", descriptor = "J")
    private long field5527;

    @OriginalMember(owner = "client!ju", name = "s", descriptor = "J")
    private long field5528;

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(Lha;[Lfba;Z)V", line = 5)
    private final void method2397(class473 arg0, class626[] arg1, boolean arg2) {
        for (int var4 = 0; var4 < 32; var4++) {
            field5523[var4] = false;
        }
        label67: for (class341 var5 = (class341) this.field5526.method3103((byte) 72); var5 != null; var5 = (class341) this.field5526.method3104(-10964)) {
            if (arg1 != null) {
                for (int var8 = 0; var8 < arg1.length; var8++) {
                    if (arg1[var8] == var5.field4937 || arg1[var8].field8761 == var5.field4937) {
                        field5523[var8] = true;
                        var5.method2162(127);
                        var5.field4936 = false;
                        continue label67;
                    }
                }
            }
            if (!arg2) {
                if (var5.field4943 == 0) {
                    var5.method2773(91);
                    this.field5533--;
                } else {
                    var5.field4936 = true;
                }
            }
        }
        if (arg1 == null) {
            return;
        }
        for (int var6 = 0; var6 < arg1.length && var6 != 32 && this.field5533 != 32; var6++) {
            if (!field5523[var6]) {
                class341 var7 = new class341(arg0, arg1[var6], this, this.field5527);
                this.field5526.method3100(var7, true);
                this.field5533++;
                field5523[var6] = true;
            }
        }
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(IZ)V", line = 81)
    private final void method2398(int arg0, boolean arg1) {
        class361.field5207.method3100(this, true);
        this.field5527 = arg0;
        this.field5528 = arg0;
        this.field5537 = true;
        this.field5538 = arg1;
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(Lha;J)Z", line = 89)
    public final boolean method2399(class473 arg0, long arg1) {
        if (this.field5528 == this.field5527) {
            this.method2409();
        } else {
            this.method2407();
        }
        if (arg1 - this.field5527 > 750L) {
            this.method2410();
            return false;
        }
        int var4 = (int) (arg1 - this.field5528);
        if (this.field5537) {
            for (class341 var5 = (class341) this.field5526.method3103((byte) 72); var5 != null; var5 = (class341) this.field5526.method3104(-10964)) {
                for (int var6 = 0; var6 < var5.field4945.field7508; var6++) {
                    var5.method2163(1, arg1, arg0, !this.field5524, (byte) 98);
                }
            }
            this.field5537 = false;
        }
        for (class341 var7 = (class341) this.field5526.method3103((byte) 72); var7 != null; var7 = (class341) this.field5526.method3104(-10964)) {
            var7.method2163(var4, arg1, arg0, !this.field5524, (byte) 100);
        }
        this.field5528 = arg1;
        return true;
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "([Lmb;Z)V", line = 141)
    private final void method2400(class426[] arg0, boolean arg1) {
        for (int var3 = 0; var3 < 8; var3++) {
            field5525[var3] = false;
        }
        label76: for (class152 var4 = (class152) this.field5532.method1041(1048832); var4 != null; var4 = (class152) this.field5532.method1033(-1)) {
            if (arg0 != null) {
                for (int var7 = 0; var7 < arg0.length; var7++) {
                    if (arg0[var7] == var4.field1988 || arg0[var7].field5948 == var4.field1988) {
                        field5525[var7] = true;
                        var4.method999((byte) -112);
                        continue label76;
                    }
                }
            }
            if (!arg1) {
                var4.method527(-11229);
                this.field5535--;
                if (var4.method417((byte) -104)) {
                    var4.method416(9867);
                    class170.field2156--;
                }
            }
        }
        if (arg0 == null) {
            return;
        }
        for (int var5 = 0; var5 < arg0.length && var5 != 8 && this.field5535 != 8; var5++) {
            if (!field5525[var5]) {
                class152 var6 = null;
                if (arg0[var5].method2571(-8706).field9645 == 1 && class170.field2156 < 32) {
                    var6 = new class152(arg0[var5], this);
                    class750.field10359.method260(var6, (byte) 29, (long) arg0[var5].field5949);
                    class170.field2156++;
                }
                if (var6 == null) {
                    var6 = new class152(arg0[var5], this);
                }
                this.field5532.method1039(var6, 0);
                this.field5535++;
                field5525[var5] = true;
            }
        }
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(Lha;J[Lfba;[Lmb;Z)V", line = 230)
    public final void method2401(class473 arg0, long arg1, class626[] arg2, class426[] arg3, boolean arg4) {
        if (!this.field5531) {
            this.method2397(arg0, arg2, arg4);
            this.method2400(arg3, arg4);
            this.field5527 = arg1;
        }
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "()Lhda;", line = 238)
    public final class714 method2402() {
        return this.field5536;
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(IIIII)V", line = 241)
    public final void method2403(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field5534 = arg0;
    }

    @OriginalMember(owner = "client!ju", name = "b", descriptor = "()Lhda;", line = 256)
    public final class714 method2404() {
        this.field5536.field9929.method1785(-74);
        for (int var1 = 0; var1 < this.field5529.length; var1++) {
            if (this.field5529[var1] != null && this.field5529[var1].field2814 != null) {
                this.field5536.field9929.method1788(-2, this.field5529[var1]);
            }
        }
        return this.field5536;
    }

    @OriginalMember(owner = "client!ju", name = "c", descriptor = "()V", line = 271)
    public final void method2405() {
        this.field5537 = true;
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(J)V", line = 274)
    public final void method2406(long arg0) {
        this.field5527 = arg0;
    }

    @OriginalMember(owner = "client!ju", name = "<init>", descriptor = "(IZ)V", line = 394)
    private class388(int arg0, boolean arg1) {
        this.method2398(arg0, arg1);
    }

    @OriginalMember(owner = "client!ju", name = "d", descriptor = "()V", line = 285)
    public final void method2407() {
        this.field5524 = true;
    }

    @OriginalMember(owner = "client!ju", name = "b", descriptor = "(IZ)Lju;", line = 292)
    public static final class388 method2408(int arg0, boolean arg1) {
        if (class722.field9956 == class158.field2050) {
            return new class388(arg0, arg1);
        } else {
            class388 var2 = class256.field3783[class158.field2050];
            class158.field2050 = class158.field2050 + 1 & class563.field7934[class778.field10694];
            var2.method2398(arg0, arg1);
            return var2;
        }
    }

    @OriginalMember(owner = "client!ju", name = "e", descriptor = "()V", line = 305)
    private final void method2409() {
        this.field5524 = false;
    }

    @OriginalMember(owner = "client!ju", name = "f", descriptor = "()V", line = 308)
    public final void method2410() {
        this.field5531 = true;
        for (class152 var1 = (class152) this.field5532.method1041(1048832); var1 != null; var1 = (class152) this.field5532.method1033(-1)) {
            if (var1.field1991.field9645 == 1) {
                var1.method416(9867);
            }
        }
        for (int var2 = 0; var2 < this.field5529.length; var2++) {
            if (this.field5529[var2] != null) {
                this.field5529[var2].method1293();
                this.field5529[var2] = null;
            }
        }
        this.field5530 = 0;
        this.field5526 = new class519();
        this.field5533 = 0;
        this.field5532 = new class165();
        this.field5535 = 0;
        this.method2773(28);
        class256.field3783[class722.field9956] = this;
        class722.field9956 = class722.field9956 + 1 & class563.field7934[class778.field10694];
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(Lha;)V", line = 344)
    public final void method2411(class473 arg0) {
        this.field5536.field9929.method1785(-58);
        for (class341 var2 = (class341) this.field5526.method3103((byte) 72); var2 != null; var2 = (class341) this.field5526.method3104(-10964)) {
            var2.method2166(-2040, this.field5528, arg0);
        }
    }

    @OriginalMember(owner = "client!ju", name = "g", descriptor = "()V", line = 356)
    public static void method2412() {
        field5523 = null;
        field5525 = null;
    }
}
