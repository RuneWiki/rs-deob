import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public class class17 extends class499 {

    @OriginalMember(owner = "client!l", name = "i", descriptor = "I")
    public int field217 = 0;

    @OriginalMember(owner = "client!l", name = "l", descriptor = "Z")
    public boolean field220 = false;

    @OriginalMember(owner = "client!l", name = "n", descriptor = "Z")
    private boolean field222 = false;

    @OriginalMember(owner = "client!l", name = "h", descriptor = "Lvm;")
    private class687 field216 = new class687();

    @OriginalMember(owner = "client!l", name = "q", descriptor = "I")
    private int field225 = 0;

    @OriginalMember(owner = "client!l", name = "r", descriptor = "Lro;")
    public class2 field226 = new class2();

    @OriginalMember(owner = "client!l", name = "s", descriptor = "Z")
    private boolean field227 = false;

    @OriginalMember(owner = "client!l", name = "u", descriptor = "I")
    private int field229 = 0;

    @OriginalMember(owner = "client!l", name = "w", descriptor = "Z")
    public boolean field231 = false;

    @OriginalMember(owner = "client!l", name = "t", descriptor = "Luj;")
    public class388 field228 = new class388();

    @OriginalMember(owner = "client!l", name = "o", descriptor = "[Liu;")
    public class579[] field223 = new class579[8192];

    @OriginalMember(owner = "client!l", name = "m", descriptor = "[Z")
    private static boolean[] field221 = new boolean[32];

    @OriginalMember(owner = "client!l", name = "p", descriptor = "[Z")
    private static boolean[] field224 = new boolean[8];

    @OriginalMember(owner = "client!l", name = "v", descriptor = "I")
    public int field230;

    @OriginalMember(owner = "client!l", name = "j", descriptor = "J")
    private long field218;

    @OriginalMember(owner = "client!l", name = "k", descriptor = "J")
    private long field219;

    @OriginalMember(owner = "client!l", name = "a", descriptor = "()V")
    public static void method119() {
        field221 = null;
        field224 = null;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIII)V")
    public final void method120(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field230 = arg0;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IZ)V")
    private final void method121(int arg0, boolean arg1) {
        class543.field7191.method3870(this, 0);
        this.field219 = arg0;
        this.field218 = arg0;
        this.field227 = true;
        this.field231 = arg1;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Lha;[Lcm;Z)V")
    private final void method122(class59 arg0, class730[] arg1, boolean arg2) {
        for (int var4 = 0; var4 < 32; var4++) {
            field221[var4] = false;
        }
        label67: for (class426 var5 = (class426) this.field216.method3874((byte) 63); var5 != null; var5 = (class426) this.field216.method3868(-24951)) {
            if (arg1 != null) {
                for (int var8 = 0; var8 < arg1.length; var8++) {
                    if (arg1[var8] == var5.field5862 || arg1[var8].field10122 == var5.field5862) {
                        field221[var8] = true;
                        var5.method2461((byte) 37);
                        var5.field5859 = false;
                        continue label67;
                    }
                }
            }
            if (!arg2) {
                if (var5.field5858 == 0) {
                    var5.method2815(-118);
                    this.field225--;
                } else {
                    var5.field5859 = true;
                }
            }
        }
        if (arg1 == null) {
            return;
        }
        for (int var6 = 0; var6 < arg1.length && var6 != 32 && this.field225 != 32; var6++) {
            if (!field221[var6]) {
                class426 var7 = new class426(arg0, arg1[var6], this, this.field219);
                this.field216.method3870(var7, 0);
                this.field225++;
                field221[var6] = true;
            }
        }
    }

    @OriginalMember(owner = "client!l", name = "b", descriptor = "()V")
    public final void method123() {
        this.field222 = true;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Lha;)V")
    public final void method124(class59 arg0) {
        this.field228.field5411.method140(-10538);
        for (class426 var2 = (class426) this.field216.method3874((byte) 84); var2 != null; var2 = (class426) this.field216.method3868(-24951)) {
            var2.method2460(this.field218, -31392, arg0);
        }
    }

    @OriginalMember(owner = "client!l", name = "c", descriptor = "()V")
    private final void method125() {
        this.field222 = false;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Lha;J)Z")
    public final boolean method126(class59 arg0, long arg1) {
        if (this.field219 == this.field218) {
            this.method125();
        } else {
            this.method123();
        }
        if (arg1 - this.field219 > 750L) {
            this.method132();
            return false;
        }
        int var4 = (int) (arg1 - this.field218);
        if (this.field227) {
            for (class426 var5 = (class426) this.field216.method3874((byte) 73); var5 != null; var5 = (class426) this.field216.method3868(-24951)) {
                for (int var6 = 0; var6 < var5.field5867.field3587; var6++) {
                    var5.method2459(1, !this.field222, arg0, true, arg1);
                }
            }
            this.field227 = false;
        }
        for (class426 var7 = (class426) this.field216.method3874((byte) 54); var7 != null; var7 = (class426) this.field216.method3868(-24951)) {
            var7.method2459(var4, !this.field222, arg0, true, arg1);
        }
        this.field218 = arg1;
        return true;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "([Lhi;Z)V")
    private final void method127(class207[] arg0, boolean arg1) {
        for (int var3 = 0; var3 < 8; var3++) {
            field224[var3] = false;
        }
        label76: for (class404 var4 = (class404) this.field226.method21(2); var4 != null; var4 = (class404) this.field226.method9(-127)) {
            if (arg0 != null) {
                for (int var7 = 0; var7 < arg0.length; var7++) {
                    if (arg0[var7] == var4.field5635 || arg0[var7].field3068 == var4.field5635) {
                        field224[var7] = true;
                        var4.method2376(25201);
                        continue label76;
                    }
                }
            }
            if (!arg1) {
                var4.method3564(true);
                this.field229--;
                if (var4.method2411((byte) 65)) {
                    var4.method2414((byte) -26);
                    class407.field5660--;
                }
            }
        }
        if (arg0 == null) {
            return;
        }
        for (int var5 = 0; var5 < arg0.length && var5 != 8 && this.field229 != 8; var5++) {
            if (!field224[var5]) {
                class404 var6 = null;
                if (arg0[var5].method1384(0).field3614 == 1 && class407.field5660 < 32) {
                    var6 = new class404(arg0[var5], this);
                    class705.field9779.method2549(var6, (long) arg0[var5].field3074, false);
                    class407.field5660++;
                }
                if (var6 == null) {
                    var6 = new class404(arg0[var5], this);
                }
                this.field226.method11(var6, -115);
                this.field229++;
                field224[var5] = true;
            }
        }
    }

    @OriginalMember(owner = "client!l", name = "d", descriptor = "()Luj;")
    public final class388 method128() {
        this.field228.field5411.method140(-10538);
        for (int var1 = 0; var1 < this.field223.length; var1++) {
            if (this.field223[var1] != null && this.field223[var1].field7590 != null) {
                this.field228.field5411.method139(-39, this.field223[var1]);
            }
        }
        return this.field228;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Lha;J[Lcm;[Lhi;Z)V")
    public final void method129(class59 arg0, long arg1, class730[] arg2, class207[] arg3, boolean arg4) {
        if (!this.field220) {
            this.method122(arg0, arg2, arg4);
            this.method127(arg3, arg4);
            this.field219 = arg1;
        }
    }

    @OriginalMember(owner = "client!l", name = "e", descriptor = "()V")
    public final void method130() {
        this.field227 = true;
    }

    @OriginalMember(owner = "client!l", name = "f", descriptor = "()Luj;")
    public final class388 method131() {
        return this.field228;
    }

    @OriginalMember(owner = "client!l", name = "g", descriptor = "()V")
    public final void method132() {
        this.field220 = true;
        for (class404 var1 = (class404) this.field226.method21(2); var1 != null; var1 = (class404) this.field226.method9(-127)) {
            if (var1.field5634.field3614 == 1) {
                var1.method2414((byte) -26);
            }
        }
        for (int var2 = 0; var2 < this.field223.length; var2++) {
            if (this.field223[var2] != null) {
                this.field223[var2].method3173();
                this.field223[var2] = null;
            }
        }
        this.field217 = 0;
        this.field216 = new class687();
        this.field225 = 0;
        this.field226 = new class2();
        this.field229 = 0;
        this.method2815(-127);
        class514.field6814[class401.field5594] = this;
        class401.field5594 = class401.field5594 + 1 & class311.field4465[class175.field2642];
    }

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(IZ)Ll;")
    public static final class17 method133(int arg0, boolean arg1) {
        if (class66.field823 == class401.field5594) {
            return new class17(arg0, arg1);
        } else {
            class17 var2 = class514.field6814[class66.field823];
            class66.field823 = class66.field823 + 1 & class311.field4465[class175.field2642];
            var2.method121(arg0, arg1);
            return var2;
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(J)V")
    public final void method134(long arg0) {
        this.field219 = arg0;
    }

    @OriginalMember(owner = "client!l", name = "<init>", descriptor = "(IZ)V")
    private class17(int arg0, boolean arg1) {
        this.method121(arg0, arg1);
    }
}
