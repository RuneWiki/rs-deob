import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wca")
public class class339 extends class321 {

    @OriginalMember(owner = "client!wca", name = "i", descriptor = "Z")
    public boolean field4270 = false;

    @OriginalMember(owner = "client!wca", name = "k", descriptor = "I")
    public int field4272 = 0;

    @OriginalMember(owner = "client!wca", name = "n", descriptor = "Z")
    private boolean field4275 = false;

    @OriginalMember(owner = "client!wca", name = "j", descriptor = "Lkf;")
    private class287 field4271 = new class287();

    @OriginalMember(owner = "client!wca", name = "r", descriptor = "I")
    private int field4279 = 0;

    @OriginalMember(owner = "client!wca", name = "q", descriptor = "Lgk;")
    public class616 field4278 = new class616();

    @OriginalMember(owner = "client!wca", name = "u", descriptor = "I")
    private int field4282 = 0;

    @OriginalMember(owner = "client!wca", name = "t", descriptor = "Z")
    public boolean field4281 = false;

    @OriginalMember(owner = "client!wca", name = "w", descriptor = "Z")
    private boolean field4284 = false;

    @OriginalMember(owner = "client!wca", name = "v", descriptor = "Lqw;")
    public class332 field4283 = new class332();

    @OriginalMember(owner = "client!wca", name = "p", descriptor = "[Loi;")
    public class230[] field4277 = new class230[8192];

    @OriginalMember(owner = "client!wca", name = "h", descriptor = "[Z")
    private static boolean[] field4269 = new boolean[8];

    @OriginalMember(owner = "client!wca", name = "m", descriptor = "[Z")
    private static boolean[] field4274 = new boolean[32];

    @OriginalMember(owner = "client!wca", name = "s", descriptor = "I")
    public int field4280;

    @OriginalMember(owner = "client!wca", name = "l", descriptor = "J")
    private long field4273;

    @OriginalMember(owner = "client!wca", name = "o", descriptor = "J")
    private long field4276;

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(Lr;)V")
    public final void method1948(class564 arg0) {
        this.field4283.field4171.method399(false);
        for (class118 var2 = (class118) this.field4271.method1672((byte) 74); var2 != null; var2 = (class118) this.field4271.method1669(-2747)) {
            var2.method690(false, arg0, this.field4276);
        }
    }

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(IIIII)V")
    public final void method1949(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field4280 = arg0;
    }

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(IZ)Lwca;")
    public static final class339 method1950(int arg0, boolean arg1) {
        if (class92.field933 == class620.field8763) {
            return new class339(arg0, arg1);
        } else {
            class339 var2 = class205.field2430[class92.field933];
            class92.field933 = class92.field933 + 1 & class269.field3349[class609.field8519];
            var2.method1957(arg0, arg1);
            return var2;
        }
    }

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(Lr;[Low;Z)V")
    private final void method1951(class564 arg0, class93[] arg1, boolean arg2) {
        for (int var4 = 0; var4 < 32; var4++) {
            field4274[var4] = false;
        }
        label67: for (class118 var5 = (class118) this.field4271.method1672((byte) 118); var5 != null; var5 = (class118) this.field4271.method1669(-2747)) {
            if (arg1 != null) {
                for (int var8 = 0; var8 < arg1.length; var8++) {
                    if (arg1[var8] == var5.field1309 || arg1[var8].field955 == var5.field1309) {
                        field4274[var8] = true;
                        var5.method687(-67);
                        var5.field1300 = false;
                        continue label67;
                    }
                }
            }
            if (!arg2) {
                if (var5.field1311 == 0) {
                    var5.method1821(100);
                    this.field4279--;
                } else {
                    var5.field1300 = true;
                }
            }
        }
        if (arg1 == null) {
            return;
        }
        for (int var6 = 0; var6 < arg1.length && var6 != 32 && this.field4279 != 32; var6++) {
            if (!field4274[var6]) {
                class118 var7 = new class118(arg0, arg1[var6], this, this.field4273);
                this.field4271.method1670((byte) -122, var7);
                this.field4279++;
                field4274[var6] = true;
            }
        }
    }

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "()Lqw;")
    public final class332 method1952() {
        return this.field4283;
    }

    @OriginalMember(owner = "client!wca", name = "b", descriptor = "()V")
    public final void method1953() {
        this.field4270 = true;
        for (class563 var1 = (class563) this.field4278.method3434((byte) 2); var1 != null; var1 = (class563) this.field4278.method3430(true)) {
            if (var1.field8049.field9735 == 1) {
                var1.method3443(120);
            }
        }
        for (int var2 = 0; var2 < this.field4277.length; var2++) {
            if (this.field4277[var2] != null) {
                this.field4277[var2].method1380();
                this.field4277[var2] = null;
            }
        }
        this.field4272 = 0;
        this.field4271 = new class287();
        this.field4279 = 0;
        this.field4278 = new class616();
        this.field4282 = 0;
        this.method1821(119);
        class205.field2430[class620.field8763] = this;
        class620.field8763 = class620.field8763 + 1 & class269.field3349[class609.field8519];
    }

    @OriginalMember(owner = "client!wca", name = "c", descriptor = "()V")
    public final void method1954() {
        this.field4275 = true;
    }

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(Lr;J)Z")
    public final boolean method1955(class564 arg0, long arg1) {
        if (this.field4276 == this.field4273) {
            this.method1959();
        } else {
            this.method1954();
        }
        if (arg1 - this.field4273 > 750L) {
            this.method1953();
            return false;
        }
        int var4 = (int) (arg1 - this.field4276);
        if (this.field4284) {
            for (class118 var5 = (class118) this.field4271.method1672((byte) 86); var5 != null; var5 = (class118) this.field4271.method1669(-2747)) {
                for (int var6 = 0; var6 < var5.field1305.field8584; var6++) {
                    var5.method688(arg1, !this.field4275, 0, 1, arg0);
                }
            }
            this.field4284 = false;
        }
        for (class118 var7 = (class118) this.field4271.method1672((byte) 106); var7 != null; var7 = (class118) this.field4271.method1669(-2747)) {
            var7.method688(arg1, !this.field4275, 0, var4, arg0);
        }
        this.field4276 = arg1;
        return true;
    }

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "([Lqr;Z)V")
    private final void method1956(class667[] arg0, boolean arg1) {
        for (int var3 = 0; var3 < 8; var3++) {
            field4269[var3] = false;
        }
        label76: for (class563 var4 = (class563) this.field4278.method3434((byte) 2); var4 != null; var4 = (class563) this.field4278.method3430(true)) {
            if (arg0 != null) {
                for (int var7 = 0; var7 < arg0.length; var7++) {
                    if (arg0[var7] == var4.field8042 || arg0[var7].field9315 == var4.field8042) {
                        field4269[var7] = true;
                        var4.method3193(34933);
                        continue label76;
                    }
                }
            }
            if (!arg1) {
                var4.method1922(94);
                this.field4282--;
                if (var4.method3445((byte) 92)) {
                    var4.method3443(98);
                    class638.field8995--;
                }
            }
        }
        if (arg0 == null) {
            return;
        }
        for (int var5 = 0; var5 < arg0.length && var5 != 8 && this.field4282 != 8; var5++) {
            if (!field4269[var5]) {
                class563 var6 = null;
                if (arg0[var5].method3698(true).field9735 == 1 && class638.field8995 < 32) {
                    var6 = new class563(arg0[var5], this);
                    class165.field1838.method683((long) arg0[var5].field9314, (byte) -111, var6);
                    class638.field8995++;
                }
                if (var6 == null) {
                    var6 = new class563(arg0[var5], this);
                }
                this.field4278.method3425(var6, false);
                this.field4282++;
                field4269[var5] = true;
            }
        }
    }

    @OriginalMember(owner = "client!wca", name = "b", descriptor = "(IZ)V")
    private final void method1957(int arg0, boolean arg1) {
        class369.field5054.method1670((byte) -64, this);
        this.field4273 = arg0;
        this.field4276 = arg0;
        this.field4284 = true;
        this.field4281 = arg1;
    }

    @OriginalMember(owner = "client!wca", name = "d", descriptor = "()V")
    public final void method1958() {
        this.field4284 = true;
    }

    @OriginalMember(owner = "client!wca", name = "e", descriptor = "()V")
    private final void method1959() {
        this.field4275 = false;
    }

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(Lr;J[Low;[Lqr;Z)V")
    public final void method1960(class564 arg0, long arg1, class93[] arg2, class667[] arg3, boolean arg4) {
        if (!this.field4270) {
            this.method1951(arg0, arg2, arg4);
            this.method1956(arg3, arg4);
            this.field4273 = arg1;
        }
    }

    @OriginalMember(owner = "client!wca", name = "f", descriptor = "()V")
    public static void method1961() {
        field4274 = null;
        field4269 = null;
    }

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(J)V")
    public final void method1962(long arg0) {
        this.field4273 = arg0;
    }

    @OriginalMember(owner = "client!wca", name = "g", descriptor = "()Lqw;")
    public final class332 method1963() {
        this.field4283.field4171.method399(false);
        for (int var1 = 0; var1 < this.field4277.length; var1++) {
            if (this.field4277[var1] != null && this.field4277[var1].field2845 != null) {
                this.field4283.field4171.method395(this.field4277[var1], false);
            }
        }
        return this.field4283;
    }

    @OriginalMember(owner = "client!wca", name = "<init>", descriptor = "(IZ)V")
    private class339(int arg0, boolean arg1) {
        this.method1957(arg0, arg1);
    }
}
