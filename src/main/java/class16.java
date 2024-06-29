import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kv")
public class class16 extends class50 {

    @OriginalMember(owner = "client!kv", name = "i", descriptor = "I")
    public int field336 = 0;

    @OriginalMember(owner = "client!kv", name = "l", descriptor = "Z")
    public boolean field339 = false;

    @OriginalMember(owner = "client!kv", name = "o", descriptor = "Z")
    private boolean field342 = false;

    @OriginalMember(owner = "client!kv", name = "n", descriptor = "Lmb;")
    private class383 field341 = new class383();

    @OriginalMember(owner = "client!kv", name = "p", descriptor = "I")
    private int field343 = 0;

    @OriginalMember(owner = "client!kv", name = "q", descriptor = "Ldc;")
    public class302 field344 = new class302();

    @OriginalMember(owner = "client!kv", name = "t", descriptor = "Z")
    public boolean field347 = false;

    @OriginalMember(owner = "client!kv", name = "u", descriptor = "I")
    private int field348 = 0;

    @OriginalMember(owner = "client!kv", name = "v", descriptor = "Z")
    private boolean field349 = false;

    @OriginalMember(owner = "client!kv", name = "s", descriptor = "Luo;")
    public class620 field346 = new class620();

    @OriginalMember(owner = "client!kv", name = "j", descriptor = "[Lko;")
    public class292[] field337 = new class292[8192];

    @OriginalMember(owner = "client!kv", name = "h", descriptor = "[Z")
    private static boolean[] field335 = new boolean[32];

    @OriginalMember(owner = "client!kv", name = "k", descriptor = "[Z")
    private static boolean[] field338 = new boolean[8];

    @OriginalMember(owner = "client!kv", name = "r", descriptor = "I")
    public int field345;

    @OriginalMember(owner = "client!kv", name = "g", descriptor = "J")
    private long field334;

    @OriginalMember(owner = "client!kv", name = "m", descriptor = "J")
    private long field340;

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "([Lil;Z)V")
    private final void method107(class586[] arg0, boolean arg1) {
        for (int var3 = 0; var3 < 8; var3++) {
            field338[var3] = false;
        }
        label76: for (class29 var4 = (class29) this.field344.method1904(false); var4 != null; var4 = (class29) this.field344.method1901(120)) {
            if (arg0 != null) {
                for (int var7 = 0; var7 < arg0.length; var7++) {
                    if (arg0[var7] == var4.field496 || arg0[var7].field8499 == var4.field496) {
                        field338[var7] = true;
                        var4.method186((byte) 57);
                        continue label76;
                    }
                }
            }
            if (!arg1) {
                var4.method2360((byte) 66);
                this.field348--;
                if (var4.method1992(-9513)) {
                    var4.method1989((byte) 42);
                    class430.field6259--;
                }
            }
        }
        if (arg0 == null) {
            return;
        }
        for (int var5 = 0; var5 < arg0.length && var5 != 8 && this.field348 != 8; var5++) {
            if (!field338[var5]) {
                class29 var6 = null;
                if (arg0[var5].method3349(100).field9805 == 1 && class430.field6259 < 32) {
                    var6 = new class29(arg0[var5], this);
                    class124.field1818.method1567(-18996, var6, (long) arg0[var5].field8504);
                    class430.field6259++;
                }
                if (var6 == null) {
                    var6 = new class29(arg0[var5], this);
                }
                this.field344.method1909(var6, (byte) -81);
                this.field348++;
                field338[var5] = true;
            }
        }
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "()V")
    public final void method108() {
        this.field342 = true;
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(IIIII)V")
    public final void method109(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field345 = arg0;
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(Lr;J[Lrca;[Lil;Z)V")
    public final void method110(class98 arg0, long arg1, class30[] arg2, class586[] arg3, boolean arg4) {
        if (!this.field339) {
            this.method118(arg0, arg2, arg4);
            this.method107(arg3, arg4);
            this.field334 = arg1;
        }
    }

    @OriginalMember(owner = "client!kv", name = "b", descriptor = "()V")
    public final void method111() {
        this.field339 = true;
        for (class29 var1 = (class29) this.field344.method1904(false); var1 != null; var1 = (class29) this.field344.method1901(126)) {
            if (var1.field504.field9805 == 1) {
                var1.method1989((byte) 55);
            }
        }
        for (int var2 = 0; var2 < this.field337.length; var2++) {
            if (this.field337[var2] != null) {
                this.field337[var2].method1799();
                this.field337[var2] = null;
            }
        }
        this.field336 = 0;
        this.field341 = new class383();
        this.field343 = 0;
        this.field344 = new class302();
        this.field348 = 0;
        this.method300((byte) 61);
        class46.field714[class218.field2904] = this;
        class218.field2904 = class218.field2904 + 1 & class322.field4686[class311.field4571];
    }

    @OriginalMember(owner = "client!kv", name = "c", descriptor = "()Luo;")
    public final class620 method112() {
        return this.field346;
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(J)V")
    public final void method113(long arg0) {
        this.field334 = arg0;
    }

    @OriginalMember(owner = "client!kv", name = "d", descriptor = "()V")
    public final void method114() {
        this.field349 = true;
    }

    @OriginalMember(owner = "client!kv", name = "e", descriptor = "()V")
    public static void method115() {
        field335 = null;
        field338 = null;
    }

    @OriginalMember(owner = "client!kv", name = "f", descriptor = "()V")
    private final void method116() {
        this.field342 = false;
    }

    @OriginalMember(owner = "client!kv", name = "g", descriptor = "()Luo;")
    public final class620 method117() {
        this.field346.field8978.method2622((byte) 28);
        for (int var1 = 0; var1 < this.field337.length; var1++) {
            if (this.field337[var1] != null && this.field337[var1].field4288 != null) {
                this.field346.field8978.method2625(97, this.field337[var1]);
            }
        }
        return this.field346;
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(Lr;[Lrca;Z)V")
    private final void method118(class98 arg0, class30[] arg1, boolean arg2) {
        for (int var4 = 0; var4 < 32; var4++) {
            field335[var4] = false;
        }
        label67: for (class274 var5 = (class274) this.field341.method2370(-26173); var5 != null; var5 = (class274) this.field341.method2369((byte) 127)) {
            if (arg1 != null) {
                for (int var8 = 0; var8 < arg1.length; var8++) {
                    if (arg1[var8] == var5.field3571 || arg1[var8].field511 == var5.field3571) {
                        field335[var8] = true;
                        var5.method1632((byte) 24);
                        var5.field3569 = false;
                        continue label67;
                    }
                }
            }
            if (!arg2) {
                if (var5.field3570 == 0) {
                    var5.method300((byte) 61);
                    this.field343--;
                } else {
                    var5.field3569 = true;
                }
            }
        }
        if (arg1 == null) {
            return;
        }
        for (int var6 = 0; var6 < arg1.length && var6 != 32 && this.field343 != 32; var6++) {
            if (!field335[var6]) {
                class274 var7 = new class274(arg0, arg1[var6], this, this.field334);
                this.field341.method2368(0, var7);
                this.field343++;
                field335[var6] = true;
            }
        }
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(Lr;J)Z")
    public final boolean method119(class98 arg0, long arg1) {
        if (this.field340 == this.field334) {
            this.method116();
        } else {
            this.method108();
        }
        if (arg1 - this.field334 > 750L) {
            this.method111();
            return false;
        }
        int var4 = (int) (arg1 - this.field340);
        if (this.field349) {
            for (class274 var5 = (class274) this.field341.method2370(-26173); var5 != null; var5 = (class274) this.field341.method2369((byte) 122)) {
                for (int var6 = 0; var6 < var5.field3576.field1662; var6++) {
                    var5.method1631(!this.field342, arg1, 1, arg0, 32767);
                }
            }
            this.field349 = false;
        }
        for (class274 var7 = (class274) this.field341.method2370(-26173); var7 != null; var7 = (class274) this.field341.method2369((byte) 125)) {
            var7.method1631(!this.field342, arg1, var4, arg0, 32767);
        }
        this.field340 = arg1;
        return true;
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(IZ)Lkv;")
    public static final class16 method120(int arg0, boolean arg1) {
        if (class89.field1357 == class218.field2904) {
            return new class16(arg0, arg1);
        } else {
            class16 var2 = class46.field714[class89.field1357];
            class89.field1357 = class89.field1357 + 1 & class322.field4686[class311.field4571];
            var2.method121(arg0, arg1);
            return var2;
        }
    }

    @OriginalMember(owner = "client!kv", name = "b", descriptor = "(IZ)V")
    private final void method121(int arg0, boolean arg1) {
        class165.field2320.method2368(0, this);
        this.field334 = arg0;
        this.field340 = arg0;
        this.field349 = true;
        this.field347 = arg1;
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(Lr;)V")
    public final void method122(class98 arg0) {
        this.field346.field8978.method2622((byte) 28);
        for (class274 var2 = (class274) this.field341.method2370(-26173); var2 != null; var2 = (class274) this.field341.method2369((byte) 126)) {
            var2.method1630(arg0, -1, this.field340);
        }
    }

    @OriginalMember(owner = "client!kv", name = "<init>", descriptor = "(IZ)V")
    private class16(int arg0, boolean arg1) {
        this.method121(arg0, arg1);
    }
}
