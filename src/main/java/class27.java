import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public class class27 extends class113 {

    @OriginalMember(owner = "client!ta", name = "f", descriptor = "Z")
    public boolean field244 = false;

    @OriginalMember(owner = "client!ta", name = "g", descriptor = "Z")
    private boolean field245 = false;

    @OriginalMember(owner = "client!ta", name = "h", descriptor = "I")
    public int field246 = 0;

    @OriginalMember(owner = "client!ta", name = "j", descriptor = "Lfw;")
    private class215 field248 = new class215();

    @OriginalMember(owner = "client!ta", name = "o", descriptor = "I")
    private int field253 = 0;

    @OriginalMember(owner = "client!ta", name = "n", descriptor = "Lmr;")
    public class611 field252 = new class611();

    @OriginalMember(owner = "client!ta", name = "q", descriptor = "Z")
    public boolean field255 = false;

    @OriginalMember(owner = "client!ta", name = "t", descriptor = "Z")
    private boolean field258 = false;

    @OriginalMember(owner = "client!ta", name = "s", descriptor = "I")
    private int field257 = 0;

    @OriginalMember(owner = "client!ta", name = "r", descriptor = "Leea;")
    public class458 field256 = new class458();

    @OriginalMember(owner = "client!ta", name = "e", descriptor = "[Lpg;")
    public class287[] field243 = new class287[8192];

    @OriginalMember(owner = "client!ta", name = "k", descriptor = "[Z")
    private static boolean[] field249 = new boolean[32];

    @OriginalMember(owner = "client!ta", name = "m", descriptor = "[Z")
    private static boolean[] field251 = new boolean[8];

    @OriginalMember(owner = "client!ta", name = "p", descriptor = "I")
    public int field254;

    @OriginalMember(owner = "client!ta", name = "i", descriptor = "J")
    private long field247;

    @OriginalMember(owner = "client!ta", name = "l", descriptor = "J")
    private long field250;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lha;J)Z")
    public final boolean method121(class543 arg0, long arg1) {
        if (this.field250 == this.field247) {
            this.method134();
        } else {
            this.method124();
        }
        if (arg1 - this.field247 > 750L) {
            this.method132();
            return false;
        }
        int var4 = (int) (arg1 - this.field250);
        if (this.field258) {
            for (class598 var5 = (class598) this.field248.method1527(101); var5 != null; var5 = (class598) this.field248.method1523(true)) {
                for (int var6 = 0; var6 < var5.field8497.field7250; var6++) {
                    var5.method3500(arg0, 0, !this.field245, arg1, 1);
                }
            }
            this.field258 = false;
        }
        for (class598 var7 = (class598) this.field248.method1527(79); var7 != null; var7 = (class598) this.field248.method1523(true)) {
            var7.method3500(arg0, 0, !this.field245, arg1, var4);
        }
        this.field250 = arg1;
        return true;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(J)V")
    public final void method122(long arg0) {
        this.field247 = arg0;
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "()Leea;")
    public final class458 method123() {
        this.field256.field6514.method2715(true);
        for (int var1 = 0; var1 < this.field243.length; var1++) {
            if (this.field243[var1] != null && this.field243[var1].field3987 != null) {
                this.field256.field6514.method2712(0, this.field243[var1]);
            }
        }
        return this.field256;
    }

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "()V")
    public final void method124() {
        this.field245 = true;
    }

    @OriginalMember(owner = "client!ta", name = "d", descriptor = "()V")
    public final void method125() {
        this.field258 = true;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lha;J[Lqv;[Lvea;Z)V")
    public final void method126(class543 arg0, long arg1, class108[] arg2, class647[] arg3, boolean arg4) {
        if (!this.field244) {
            this.method135(arg0, arg2, arg4);
            this.method129(arg3, arg4);
            this.field247 = arg1;
        }
    }

    @OriginalMember(owner = "client!ta", name = "e", descriptor = "()Leea;")
    public final class458 method127() {
        return this.field256;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IZ)Lta;")
    public static final class27 method128(int arg0, boolean arg1) {
        if (class680.field9676 == class174.field2450) {
            return new class27(arg0, arg1);
        } else {
            class27 var2 = class726.field10206[class680.field9676];
            class680.field9676 = class680.field9676 + 1 & class79.field1138[class332.field4511];
            var2.method131(arg0, arg1);
            return var2;
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "([Lvea;Z)V")
    private final void method129(class647[] arg0, boolean arg1) {
        for (int var3 = 0; var3 < 8; var3++) {
            field251[var3] = false;
        }
        label76: for (class550 var4 = (class550) this.field252.method3565(-124); var4 != null; var4 = (class550) this.field252.method3561((byte) 23)) {
            if (arg0 != null) {
                for (int var7 = 0; var7 < arg0.length; var7++) {
                    if (arg0[var7] == var4.field8026 || arg0[var7].field9326 == var4.field8026) {
                        field251[var7] = true;
                        var4.method3311((byte) 101);
                        continue label76;
                    }
                }
            }
            if (!arg1) {
                var4.method2656((byte) 124);
                this.field257--;
                if (var4.method2385((byte) -112)) {
                    var4.method2381(15735);
                    class687.field9757--;
                }
            }
        }
        if (arg0 == null) {
            return;
        }
        for (int var5 = 0; var5 < arg0.length && var5 != 8 && this.field257 != 8; var5++) {
            if (!field251[var5]) {
                class550 var6 = null;
                if (arg0[var5].method3736(8).field5666 == 1 && class687.field9757 < 32) {
                    var6 = new class550(arg0[var5], this);
                    class163.field2326.method1002((byte) -65, (long) arg0[var5].field9324, var6);
                    class687.field9757++;
                }
                if (var6 == null) {
                    var6 = new class550(arg0[var5], this);
                }
                this.field252.method3559(var6, (byte) 12);
                this.field257++;
                field251[var5] = true;
            }
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIIII)V")
    public final void method130(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field254 = arg0;
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "(IZ)V")
    private final void method131(int arg0, boolean arg1) {
        class293.field4026.method1521(this, -24256);
        this.field247 = arg0;
        this.field250 = arg0;
        this.field258 = true;
        this.field255 = arg1;
    }

    @OriginalMember(owner = "client!ta", name = "f", descriptor = "()V")
    public final void method132() {
        this.field244 = true;
        for (class550 var1 = (class550) this.field252.method3565(118); var1 != null; var1 = (class550) this.field252.method3561((byte) 62)) {
            if (var1.field8025.field5666 == 1) {
                var1.method2381(15735);
            }
        }
        for (int var2 = 0; var2 < this.field243.length; var2++) {
            if (this.field243[var2] != null) {
                this.field243[var2].method1828();
                this.field243[var2] = null;
            }
        }
        this.field246 = 0;
        this.field248 = new class215();
        this.field253 = 0;
        this.field252 = new class611();
        this.field257 = 0;
        this.method814(104);
        class726.field10206[class174.field2450] = this;
        class174.field2450 = class174.field2450 + 1 & class79.field1138[class332.field4511];
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lha;)V")
    public final void method133(class543 arg0) {
        this.field256.field6514.method2715(true);
        for (class598 var2 = (class598) this.field248.method1527(106); var2 != null; var2 = (class598) this.field248.method1523(true)) {
            var2.method3498((byte) 83, this.field250, arg0);
        }
    }

    @OriginalMember(owner = "client!ta", name = "g", descriptor = "()V")
    private final void method134() {
        this.field245 = false;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lha;[Lqv;Z)V")
    private final void method135(class543 arg0, class108[] arg1, boolean arg2) {
        for (int var4 = 0; var4 < 32; var4++) {
            field249[var4] = false;
        }
        label67: for (class598 var5 = (class598) this.field248.method1527(124); var5 != null; var5 = (class598) this.field248.method1523(true)) {
            if (arg1 != null) {
                for (int var8 = 0; var8 < arg1.length; var8++) {
                    if (arg1[var8] == var5.field8500 || arg1[var8].field1553 == var5.field8500) {
                        field249[var8] = true;
                        var5.method3496(-127);
                        var5.field8501 = false;
                        continue label67;
                    }
                }
            }
            if (!arg2) {
                if (var5.field8495 == 0) {
                    var5.method814(64);
                    this.field253--;
                } else {
                    var5.field8501 = true;
                }
            }
        }
        if (arg1 == null) {
            return;
        }
        for (int var6 = 0; var6 < arg1.length && var6 != 32 && this.field253 != 32; var6++) {
            if (!field249[var6]) {
                class598 var7 = new class598(arg0, arg1[var6], this, this.field247);
                this.field248.method1521(var7, -24256);
                this.field253++;
                field249[var6] = true;
            }
        }
    }

    @OriginalMember(owner = "client!ta", name = "h", descriptor = "()V")
    public static void method136() {
        field249 = null;
        field251 = null;
    }

    @OriginalMember(owner = "client!ta", name = "<init>", descriptor = "(IZ)V")
    private class27(int arg0, boolean arg1) {
        this.method131(arg0, arg1);
    }
}
