import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public class class18 extends class272 {

    @OriginalMember(owner = "client!l", name = "h", descriptor = "Z")
    private boolean field183 = false;

    @OriginalMember(owner = "client!l", name = "f", descriptor = "Z")
    public boolean field181 = false;

    @OriginalMember(owner = "client!l", name = "m", descriptor = "I")
    public int field188 = 0;

    @OriginalMember(owner = "client!l", name = "g", descriptor = "Lca;")
    private class285 field182 = new class285();

    @OriginalMember(owner = "client!l", name = "p", descriptor = "I")
    private int field191 = 0;

    @OriginalMember(owner = "client!l", name = "o", descriptor = "Lws;")
    public class333 field190 = new class333();

    @OriginalMember(owner = "client!l", name = "s", descriptor = "I")
    private int field194 = 0;

    @OriginalMember(owner = "client!l", name = "q", descriptor = "Z")
    public boolean field192 = false;

    @OriginalMember(owner = "client!l", name = "t", descriptor = "Z")
    private boolean field195 = false;

    @OriginalMember(owner = "client!l", name = "w", descriptor = "Lig;")
    public class228 field198 = new class228();

    @OriginalMember(owner = "client!l", name = "l", descriptor = "[Lwh;")
    public class137[] field187 = new class137[8192];

    @OriginalMember(owner = "client!l", name = "k", descriptor = "[Z")
    private static boolean[] field186 = new boolean[32];

    @OriginalMember(owner = "client!l", name = "i", descriptor = "[Z")
    private static boolean[] field184 = new boolean[8];

    @OriginalMember(owner = "client!l", name = "r", descriptor = "I")
    public int field193;

    @OriginalMember(owner = "client!l", name = "u", descriptor = "I")
    public int field196;

    @OriginalMember(owner = "client!l", name = "v", descriptor = "I")
    public int field197;

    @OriginalMember(owner = "client!l", name = "x", descriptor = "I")
    public int field199;

    @OriginalMember(owner = "client!l", name = "y", descriptor = "I")
    public int field200;

    @OriginalMember(owner = "client!l", name = "j", descriptor = "J")
    private long field185;

    @OriginalMember(owner = "client!l", name = "n", descriptor = "J")
    private long field189;

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Loa;)V")
    public final void method100(class650 arg0) {
        this.field198.field2940.method2928(-78);
        for (class537 var2 = (class537) this.field182.method1715((byte) 125); var2 != null; var2 = (class537) this.field182.method1712((byte) -87)) {
            var2.method2890(this.field185, false, arg0);
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IZ)Ll;")
    public static final class18 method101(int arg0, boolean arg1) {
        if (class191.field2268 == class130.field1568) {
            return new class18(arg0, arg1);
        } else {
            class18 var2 = class701.field9808[class191.field2268];
            class191.field2268 = class191.field2268 + 1 & class1.field2[class477.field5949];
            var2.method115(arg0, arg1);
            return var2;
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "()V")
    private final void method102() {
        this.field183 = false;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIII)V")
    public final void method103(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field200 = arg0;
        this.field196 = arg1;
        this.field197 = arg2;
        this.field199 = arg3;
        this.field193 = arg4;
    }

    @OriginalMember(owner = "client!l", name = "b", descriptor = "()V")
    public static void method104() {
        field186 = null;
        field184 = null;
    }

    @OriginalMember(owner = "client!l", name = "c", descriptor = "()Lig;")
    public final class228 method105() {
        return this.field198;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Loa;J)Z")
    public final boolean method106(class650 arg0, long arg1) {
        if (this.field189 == this.field185) {
            this.method102();
        } else {
            this.method110();
        }
        if (arg1 - this.field189 > 750L) {
            this.method112();
            return false;
        }
        int var4 = (int) (arg1 - this.field185);
        if (this.field195) {
            for (class537 var5 = (class537) this.field182.method1715((byte) 121); var5 != null; var5 = (class537) this.field182.method1712((byte) -82)) {
                for (int var6 = 0; var6 < var5.field6757.field5111; var6++) {
                    var5.method2891(1, arg0, 1, !this.field183, arg1);
                }
            }
            this.field195 = false;
        }
        for (class537 var7 = (class537) this.field182.method1715((byte) 127); var7 != null; var7 = (class537) this.field182.method1712((byte) 126)) {
            var7.method2891(1, arg0, var4, !this.field183, arg1);
        }
        this.field185 = arg1;
        return true;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(J)V")
    public final void method107(long arg0) {
        this.field189 = arg0;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Loa;[Let;Z)V")
    private final void method108(class650 arg0, class556[] arg1, boolean arg2) {
        for (int var4 = 0; var4 < 32; var4++) {
            field186[var4] = false;
        }
        label67: for (class537 var5 = (class537) this.field182.method1715((byte) 126); var5 != null; var5 = (class537) this.field182.method1712((byte) 33)) {
            if (arg1 != null) {
                for (int var8 = 0; var8 < arg1.length; var8++) {
                    if (arg1[var8] == var5.field6762 || arg1[var8].field6959 == var5.field6762) {
                        field186[var8] = true;
                        var5.method2892(0);
                        var5.field6766 = false;
                        continue label67;
                    }
                }
            }
            if (!arg2) {
                if (var5.field6755 == 0) {
                    var5.method1619((byte) -104);
                    this.field191--;
                } else {
                    var5.field6766 = true;
                }
            }
        }
        if (arg1 == null) {
            return;
        }
        for (int var6 = 0; var6 < arg1.length && var6 != 32 && this.field191 != 32; var6++) {
            if (!field186[var6]) {
                class537 var7 = new class537(arg0, arg1[var6], this, this.field189);
                this.field182.method1714(var7, (byte) 11);
                this.field191++;
                field186[var6] = true;
            }
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "([Lfd;Z)V")
    private final void method109(class493[] arg0, boolean arg1) {
        for (int var3 = 0; var3 < 8; var3++) {
            field184[var3] = false;
        }
        label76: for (class313 var4 = (class313) this.field190.method1909(true); var4 != null; var4 = (class313) this.field190.method1916((byte) 96)) {
            if (arg0 != null) {
                for (int var7 = 0; var7 < arg0.length; var7++) {
                    if (arg0[var7] == var4.field3924 || arg0[var7].field6145 == var4.field3924) {
                        field184[var7] = true;
                        var4.method1836(750);
                        continue label76;
                    }
                }
            }
            if (!arg1) {
                var4.method1566(-77);
                this.field194--;
                if (var4.method2108((byte) -58)) {
                    var4.method2110(121);
                    class221.field2566--;
                }
            }
        }
        if (arg0 == null) {
            return;
        }
        for (int var5 = 0; var5 < arg0.length && var5 != 8 && this.field194 != 8; var5++) {
            if (!field184[var5]) {
                class313 var6 = null;
                if (arg0[var5].method2673(2).field6042 == 1 && class221.field2566 < 32) {
                    var6 = new class313(arg0[var5], this);
                    class208.field2473.method2209(var6, (long) arg0[var5].field6144, 15512);
                    class221.field2566++;
                }
                if (var6 == null) {
                    var6 = new class313(arg0[var5], this);
                }
                this.field190.method1904(var6, -123);
                this.field194++;
                field184[var5] = true;
            }
        }
    }

    @OriginalMember(owner = "client!l", name = "d", descriptor = "()V")
    public final void method110() {
        this.field183 = true;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Loa;J[Let;[Lfd;Z)V")
    public final void method111(class650 arg0, long arg1, class556[] arg2, class493[] arg3, boolean arg4) {
        if (!this.field181) {
            this.method108(arg0, arg2, arg4);
            this.method109(arg3, arg4);
            this.field189 = arg1;
        }
    }

    @OriginalMember(owner = "client!l", name = "e", descriptor = "()V")
    public final void method112() {
        this.field181 = true;
        for (class313 var1 = (class313) this.field190.method1909(true); var1 != null; var1 = (class313) this.field190.method1916((byte) 94)) {
            if (var1.field3923.field6042 == 1) {
                var1.method2110(111);
            }
        }
        for (int var2 = 0; var2 < this.field187.length; var2++) {
            if (this.field187[var2] != null) {
                this.field187[var2].method878();
                this.field187[var2] = null;
            }
        }
        this.field188 = 0;
        this.field182 = new class285();
        this.field191 = 0;
        this.field190 = new class333();
        this.field194 = 0;
        this.method1619((byte) -111);
        class701.field9808[class130.field1568] = this;
        class130.field1568 = class130.field1568 + 1 & class1.field2[class477.field5949];
    }

    @OriginalMember(owner = "client!l", name = "f", descriptor = "()V")
    public final void method113() {
        this.field195 = true;
    }

    @OriginalMember(owner = "client!l", name = "g", descriptor = "()Lig;")
    public final class228 method114() {
        this.field198.field2940.method2928(117);
        for (int var1 = 0; var1 < this.field187.length; var1++) {
            if (this.field187[var1] != null && this.field187[var1].field1672 != null) {
                this.field198.field2940.method2925(100, this.field187[var1]);
            }
        }
        return this.field198;
    }

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(IZ)V")
    private final void method115(int arg0, boolean arg1) {
        class171.field2002.method1714(this, (byte) 11);
        this.field189 = arg0;
        this.field185 = arg0;
        this.field195 = true;
        this.field192 = arg1;
    }

    @OriginalMember(owner = "client!l", name = "<init>", descriptor = "(IZ)V")
    private class18(int arg0, boolean arg1) {
        this.method115(arg0, arg1);
    }
}
