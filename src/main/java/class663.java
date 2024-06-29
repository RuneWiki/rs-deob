import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sp")
public class class663 extends class503 {

    @OriginalMember(owner = "client!sp", name = "s", descriptor = "Z")
    public boolean field9163 = false;

    @OriginalMember(owner = "client!sp", name = "p", descriptor = "Z")
    private boolean field9160 = false;

    @OriginalMember(owner = "client!sp", name = "t", descriptor = "I")
    public int field9164 = 0;

    @OriginalMember(owner = "client!sp", name = "w", descriptor = "Lvl;")
    private class15 field9167 = new class15();

    @OriginalMember(owner = "client!sp", name = "x", descriptor = "I")
    private int field9168 = 0;

    @OriginalMember(owner = "client!sp", name = "y", descriptor = "Ltm;")
    public class412 field9169 = new class412();

    @OriginalMember(owner = "client!sp", name = "A", descriptor = "Z")
    public boolean field9171 = false;

    @OriginalMember(owner = "client!sp", name = "C", descriptor = "Z")
    private boolean field9173 = false;

    @OriginalMember(owner = "client!sp", name = "D", descriptor = "I")
    private int field9174 = 0;

    @OriginalMember(owner = "client!sp", name = "B", descriptor = "Lef;")
    public class515 field9172 = new class515();

    @OriginalMember(owner = "client!sp", name = "o", descriptor = "[Luea;")
    public class336[] field9159 = new class336[8192];

    @OriginalMember(owner = "client!sp", name = "q", descriptor = "[Z")
    private static boolean[] field9161 = new boolean[8];

    @OriginalMember(owner = "client!sp", name = "r", descriptor = "[Z")
    private static boolean[] field9162 = new boolean[32];

    @OriginalMember(owner = "client!sp", name = "z", descriptor = "I")
    public int field9170;

    @OriginalMember(owner = "client!sp", name = "u", descriptor = "J")
    private long field9165;

    @OriginalMember(owner = "client!sp", name = "v", descriptor = "J")
    private long field9166;

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "()V", line = 4)
    public static void method3660() {
        field9162 = null;
        field9161 = null;
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(J)V", line = 8)
    public final void method3661(long arg0) {
        this.field9166 = arg0;
    }

    @OriginalMember(owner = "client!sp", name = "b", descriptor = "()V", line = 11)
    public final void method3662() {
        this.field9173 = true;
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(Lha;)V", line = 14)
    public final void method3663(class65 arg0) {
        this.field9172.field7049.method636(32362);
        for (class135 var2 = (class135) this.field9167.method109(0); var2 != null; var2 = (class135) this.field9167.method115((byte) 5)) {
            var2.method1062((byte) -107, this.field9165, arg0);
        }
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(Lha;J[Lcba;[Lkw;Z)V", line = 29)
    public final void method3664(class65 arg0, long arg1, class577[] arg2, class263[] arg3, boolean arg4) {
        if (!this.field9163) {
            this.method3672(arg0, arg2, arg4);
            this.method3666(arg3, arg4);
            this.field9166 = arg1;
        }
    }

    @OriginalMember(owner = "client!sp", name = "c", descriptor = "()V", line = 40)
    public final void method3665() {
        this.field9163 = true;
        for (class467 var1 = (class467) this.field9169.method2551((byte) -108); var1 != null; var1 = (class467) this.field9169.method2542(-107)) {
            if (var1.field6480.field3140 == 1) {
                var1.method1811(28064);
            }
        }
        for (int var2 = 0; var2 < this.field9159.length; var2++) {
            if (this.field9159[var2] != null) {
                this.field9159[var2].method2134();
                this.field9159[var2] = null;
            }
        }
        this.field9164 = 0;
        this.field9167 = new class15();
        this.field9168 = 0;
        this.field9169 = new class412();
        this.field9174 = 0;
        this.method2922((byte) -121);
        class483.field6682[class700.field9826] = this;
        class700.field9826 = class700.field9826 + 1 & class581.field7772[class786.field10820];
    }

    @OriginalMember(owner = "client!sp", name = "<init>", descriptor = "(IZ)V", line = 394)
    private class663(int arg0, boolean arg1) {
        this.method3674(arg0, arg1);
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "([Lkw;Z)V", line = 82)
    private final void method3666(class263[] arg0, boolean arg1) {
        for (int var3 = 0; var3 < 8; var3++) {
            field9161[var3] = false;
        }
        label76: for (class467 var4 = (class467) this.field9169.method2551((byte) -108); var4 != null; var4 = (class467) this.field9169.method2542(-123)) {
            if (arg0 != null) {
                for (int var7 = 0; var7 < arg0.length; var7++) {
                    if (arg0[var7] == var4.field6479 || arg0[var7].field3906 == var4.field6479) {
                        field9161[var7] = true;
                        var4.method2758((byte) -50);
                        continue label76;
                    }
                }
            }
            if (!arg1) {
                var4.method792((byte) -91);
                this.field9174--;
                if (var4.method1812(3)) {
                    var4.method1811(28064);
                    class274.field4068--;
                }
            }
        }
        if (arg0 == null) {
            return;
        }
        for (int var5 = 0; var5 < arg0.length && var5 != 8 && this.field9174 != 8; var5++) {
            if (!field9161[var5]) {
                class467 var6 = null;
                if (arg0[var5].method1737(1).field3140 == 1 && class274.field4068 < 32) {
                    var6 = new class467(arg0[var5], this);
                    class561.field7542.method1687(var6, (byte) -93, (long) arg0[var5].field3904);
                    class274.field4068++;
                }
                if (var6 == null) {
                    var6 = new class467(arg0[var5], this);
                }
                this.field9169.method2545(-128, var6);
                this.field9174++;
                field9161[var5] = true;
            }
        }
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(Lha;J)Z", line = 171)
    public final boolean method3667(class65 arg0, long arg1) {
        if (this.field9166 == this.field9165) {
            this.method3673();
        } else {
            this.method3669();
        }
        if (arg1 - this.field9166 > 750L) {
            this.method3665();
            return false;
        }
        int var4 = (int) (arg1 - this.field9165);
        if (this.field9173) {
            for (class135 var5 = (class135) this.field9167.method109(0); var5 != null; var5 = (class135) this.field9167.method115((byte) -92)) {
                for (int var6 = 0; var6 < var5.field1990.field7591; var6++) {
                    var5.method1063(arg0, 1, -80863512, arg1, !this.field9160);
                }
            }
            this.field9173 = false;
        }
        for (class135 var7 = (class135) this.field9167.method109(0); var7 != null; var7 = (class135) this.field9167.method115((byte) 74)) {
            var7.method1063(arg0, var4, -80863512, arg1, !this.field9160);
        }
        this.field9165 = arg1;
        return true;
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(IIIII)V", line = 219)
    public final void method3668(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field9170 = arg0;
    }

    @OriginalMember(owner = "client!sp", name = "d", descriptor = "()V", line = 230)
    public final void method3669() {
        this.field9160 = true;
    }

    @OriginalMember(owner = "client!sp", name = "b", descriptor = "(IZ)Lsp;", line = 233)
    public static final class663 method3670(int arg0, boolean arg1) {
        if (class700.field9826 == class503.field6972) {
            return new class663(arg0, arg1);
        } else {
            class663 var2 = class483.field6682[class503.field6972];
            class503.field6972 = class503.field6972 + 1 & class581.field7772[class786.field10820];
            var2.method3674(arg0, arg1);
            return var2;
        }
    }

    @OriginalMember(owner = "client!sp", name = "e", descriptor = "()Lef;", line = 246)
    public final class515 method3671() {
        return this.field9172;
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(Lha;[Lcba;Z)V", line = 251)
    private final void method3672(class65 arg0, class577[] arg1, boolean arg2) {
        for (int var4 = 0; var4 < 32; var4++) {
            field9162[var4] = false;
        }
        label67: for (class135 var5 = (class135) this.field9167.method109(0); var5 != null; var5 = (class135) this.field9167.method115((byte) 112)) {
            if (arg1 != null) {
                for (int var8 = 0; var8 < arg1.length; var8++) {
                    if (arg1[var8] == var5.field1982 || arg1[var8].field7732 == var5.field1982) {
                        field9162[var8] = true;
                        var5.method1059((byte) -94);
                        var5.field1986 = false;
                        continue label67;
                    }
                }
            }
            if (!arg2) {
                if (var5.field1989 == 0) {
                    var5.method2922((byte) -100);
                    this.field9168--;
                } else {
                    var5.field1986 = true;
                }
            }
        }
        if (arg1 == null) {
            return;
        }
        for (int var6 = 0; var6 < arg1.length && var6 != 32 && this.field9168 != 32; var6++) {
            if (!field9162[var6]) {
                class135 var7 = new class135(arg0, arg1[var6], this, this.field9166);
                this.field9167.method106(var7, (byte) 119);
                this.field9168++;
                field9162[var6] = true;
            }
        }
    }

    @OriginalMember(owner = "client!sp", name = "f", descriptor = "()V", line = 330)
    private final void method3673() {
        this.field9160 = false;
    }

    @OriginalMember(owner = "client!sp", name = "c", descriptor = "(IZ)V", line = 333)
    private final void method3674(int arg0, boolean arg1) {
        class270.field3980.method106(this, (byte) 119);
        this.field9166 = arg0;
        this.field9165 = arg0;
        this.field9173 = true;
        this.field9171 = arg1;
    }

    @OriginalMember(owner = "client!sp", name = "g", descriptor = "()Lef;", line = 347)
    public final class515 method3675() {
        this.field9172.field7049.method636(32362);
        for (int var1 = 0; var1 < this.field9159.length; var1++) {
            if (this.field9159[var1] != null && this.field9159[var1].field4879 != null) {
                this.field9172.field7049.method633((byte) 45, this.field9159[var1]);
            }
        }
        return this.field9172;
    }
}
