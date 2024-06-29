import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ur")
public class class537 extends class670 {

    @OriginalMember(owner = "client!ur", name = "i", descriptor = "Z")
    public boolean field7529 = false;

    @OriginalMember(owner = "client!ur", name = "l", descriptor = "I")
    public int field7532 = 0;

    @OriginalMember(owner = "client!ur", name = "n", descriptor = "Z")
    private boolean field7534 = false;

    @OriginalMember(owner = "client!ur", name = "j", descriptor = "Leh;")
    private class360 field7530 = new class360();

    @OriginalMember(owner = "client!ur", name = "p", descriptor = "I")
    private int field7536 = 0;

    @OriginalMember(owner = "client!ur", name = "o", descriptor = "Lbg;")
    public class464 field7535 = new class464();

    @OriginalMember(owner = "client!ur", name = "t", descriptor = "Z")
    public boolean field7540 = false;

    @OriginalMember(owner = "client!ur", name = "s", descriptor = "I")
    private int field7539 = 0;

    @OriginalMember(owner = "client!ur", name = "q", descriptor = "Z")
    private boolean field7537 = false;

    @OriginalMember(owner = "client!ur", name = "u", descriptor = "Ldm;")
    public class50 field7541 = new class50();

    @OriginalMember(owner = "client!ur", name = "k", descriptor = "[Luk;")
    public class259[] field7531 = new class259[8192];

    @OriginalMember(owner = "client!ur", name = "g", descriptor = "[Z")
    private static boolean[] field7527 = new boolean[32];

    @OriginalMember(owner = "client!ur", name = "f", descriptor = "[Z")
    private static boolean[] field7526 = new boolean[8];

    @OriginalMember(owner = "client!ur", name = "r", descriptor = "I")
    public int field7538;

    @OriginalMember(owner = "client!ur", name = "h", descriptor = "J")
    private long field7528;

    @OriginalMember(owner = "client!ur", name = "m", descriptor = "J")
    private long field7533;

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(Lha;J)Z", line = 3)
    public final boolean method3108(class58 arg0, long arg1) {
        if (this.field7533 == this.field7528) {
            this.method3118();
        } else {
            this.method3115();
        }
        if (arg1 - this.field7533 > 750L) {
            this.method3121();
            return false;
        }
        int var4 = (int) (arg1 - this.field7528);
        if (this.field7537) {
            for (class376 var5 = (class376) this.field7530.method2301(-31182); var5 != null; var5 = (class376) this.field7530.method2310(68)) {
                for (int var6 = 0; var6 < var5.field5264.field6855; var6++) {
                    var5.method2363(arg0, (byte) -106, !this.field7534, arg1, 1);
                }
            }
            this.field7537 = false;
        }
        for (class376 var7 = (class376) this.field7530.method2301(-31182); var7 != null; var7 = (class376) this.field7530.method2310(77)) {
            var7.method2363(arg0, (byte) -121, !this.field7534, arg1, var4);
        }
        this.field7528 = arg1;
        return true;
    }

    @OriginalMember(owner = "client!ur", name = "b", descriptor = "()V", line = 51)
    public static void method3109() {
        field7527 = null;
        field7526 = null;
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(IZ)Lur;", line = 55)
    public static final class537 method3110(int arg0, boolean arg1) {
        if (class679.field9329 == class237.field3179) {
            return new class537(arg0, arg1);
        } else {
            class537 var2 = class750.field10404[class237.field3179];
            class237.field3179 = class237.field3179 + 1 & class360.field5114[class530.field7471];
            var2.method3123(arg0, arg1);
            return var2;
        }
    }

    @OriginalMember(owner = "client!ur", name = "c", descriptor = "()V", line = 69)
    public final void method3111() {
        this.field7537 = true;
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(J)V", line = 76)
    public final void method3112(long arg0) {
        this.field7533 = arg0;
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(Lha;[Lde;Z)V", line = 81)
    private final void method3113(class58 arg0, class531[] arg1, boolean arg2) {
        for (int var4 = 0; var4 < 32; var4++) {
            field7527[var4] = false;
        }
        label67: for (class376 var5 = (class376) this.field7530.method2301(-31182); var5 != null; var5 = (class376) this.field7530.method2310(30)) {
            if (arg1 != null) {
                for (int var8 = 0; var8 < arg1.length; var8++) {
                    if (arg1[var8] == var5.field5269 || arg1[var8].field7484 == var5.field5269) {
                        field7527[var8] = true;
                        var5.method2360((byte) -108);
                        var5.field5271 = false;
                        continue label67;
                    }
                }
            }
            if (!arg2) {
                if (var5.field5262 == 0) {
                    var5.method3646((byte) -127);
                    this.field7536--;
                } else {
                    var5.field5271 = true;
                }
            }
        }
        if (arg1 == null) {
            return;
        }
        for (int var6 = 0; var6 < arg1.length && var6 != 32 && this.field7536 != 32; var6++) {
            if (!field7527[var6]) {
                class376 var7 = new class376(arg0, arg1[var6], this, this.field7533);
                this.field7530.method2307(0, var7);
                this.field7536++;
                field7527[var6] = true;
            }
        }
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(IIIII)V", line = 156)
    public final void method3114(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field7538 = arg0;
    }

    @OriginalMember(owner = "client!ur", name = "d", descriptor = "()V", line = 167)
    public final void method3115() {
        this.field7534 = true;
    }

    @OriginalMember(owner = "client!ur", name = "e", descriptor = "()Ldm;", line = 174)
    public final class50 method3116() {
        return this.field7541;
    }

    @OriginalMember(owner = "client!ur", name = "<init>", descriptor = "(IZ)V", line = 394)
    private class537(int arg0, boolean arg1) {
        this.method3123(arg0, arg1);
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(Lha;)V", line = 181)
    public final void method3117(class58 arg0) {
        this.field7541.field578.method2060(4096);
        for (class376 var2 = (class376) this.field7530.method2301(-31182); var2 != null; var2 = (class376) this.field7530.method2310(122)) {
            var2.method2361(this.field7528, arg0, true);
        }
    }

    @OriginalMember(owner = "client!ur", name = "f", descriptor = "()V", line = 195)
    private final void method3118() {
        this.field7534 = false;
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "([Lok;Z)V", line = 200)
    private final void method3119(class253[] arg0, boolean arg1) {
        for (int var3 = 0; var3 < 8; var3++) {
            field7526[var3] = false;
        }
        label76: for (class511 var4 = (class511) this.field7535.method2765(-12261); var4 != null; var4 = (class511) this.field7535.method2759(-15361)) {
            if (arg0 != null) {
                for (int var7 = 0; var7 < arg0.length; var7++) {
                    if (arg0[var7] == var4.field7300 || arg0[var7].field3707 == var4.field7300) {
                        field7526[var7] = true;
                        var4.method3018(-24485);
                        continue label76;
                    }
                }
            }
            if (!arg1) {
                var4.method1185(-81);
                this.field7539--;
                if (var4.method3310((byte) 64)) {
                    var4.method3311(100);
                    class273.field3894--;
                }
            }
        }
        if (arg0 == null) {
            return;
        }
        for (int var5 = 0; var5 < arg0.length && var5 != 8 && this.field7539 != 8; var5++) {
            if (!field7526[var5]) {
                class511 var6 = null;
                if (arg0[var5].method1675(122).field7211 == 1 && class273.field3894 < 32) {
                    var6 = new class511(arg0[var5], this);
                    class243.field3248.method2030((byte) 52, (long) arg0[var5].field3703, var6);
                    class273.field3894++;
                }
                if (var6 == null) {
                    var6 = new class511(arg0[var5], this);
                }
                this.field7535.method2770((byte) -13, var6);
                this.field7539++;
                field7526[var5] = true;
            }
        }
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(Lha;J[Lde;[Lok;Z)V", line = 288)
    public final void method3120(class58 arg0, long arg1, class531[] arg2, class253[] arg3, boolean arg4) {
        if (!this.field7529) {
            this.method3113(arg0, arg2, arg4);
            this.method3119(arg3, arg4);
            this.field7533 = arg1;
        }
    }

    @OriginalMember(owner = "client!ur", name = "g", descriptor = "()V", line = 296)
    public final void method3121() {
        this.field7529 = true;
        for (class511 var1 = (class511) this.field7535.method2765(-12261); var1 != null; var1 = (class511) this.field7535.method2759(-15361)) {
            if (var1.field7301.field7211 == 1) {
                var1.method3311(100);
            }
        }
        for (int var2 = 0; var2 < this.field7531.length; var2++) {
            if (this.field7531[var2] != null) {
                this.field7531[var2].method1698();
                this.field7531[var2] = null;
            }
        }
        this.field7532 = 0;
        this.field7530 = new class360();
        this.field7536 = 0;
        this.field7535 = new class464();
        this.field7539 = 0;
        this.method3646((byte) -112);
        class750.field10404[class679.field9329] = this;
        class679.field9329 = class679.field9329 + 1 & class360.field5114[class530.field7471];
    }

    @OriginalMember(owner = "client!ur", name = "h", descriptor = "()Ldm;", line = 336)
    public final class50 method3122() {
        this.field7541.field578.method2060(4096);
        for (int var1 = 0; var1 < this.field7531.length; var1++) {
            if (this.field7531[var1] != null && this.field7531[var1].field3736 != null) {
                this.field7541.field578.method2059(4096, this.field7531[var1]);
            }
        }
        return this.field7541;
    }

    @OriginalMember(owner = "client!ur", name = "b", descriptor = "(IZ)V", line = 351)
    private final void method3123(int arg0, boolean arg1) {
        class98.field1184.method2307(0, this);
        this.field7533 = arg0;
        this.field7528 = arg0;
        this.field7537 = true;
        this.field7540 = arg1;
    }
}
