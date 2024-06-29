import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!it")
public class class464 extends class651 {

    @OriginalMember(owner = "client!it", name = "o", descriptor = "Z")
    public boolean field6762 = false;

    @OriginalMember(owner = "client!it", name = "p", descriptor = "Z")
    private boolean field6767 = false;

    @OriginalMember(owner = "client!it", name = "n", descriptor = "I")
    public int field6765 = 0;

    @OriginalMember(owner = "client!it", name = "m", descriptor = "Lvs;")
    private class470 field6766 = new class470();

    @OriginalMember(owner = "client!it", name = "x", descriptor = "I")
    private int field6771 = 0;

    @OriginalMember(owner = "client!it", name = "w", descriptor = "Ltf;")
    public class524 field6772 = new class524();

    @OriginalMember(owner = "client!it", name = "t", descriptor = "I")
    private int field6773 = 0;

    @OriginalMember(owner = "client!it", name = "q", descriptor = "Z")
    private boolean field6775 = false;

    @OriginalMember(owner = "client!it", name = "l", descriptor = "Z")
    public boolean field6776 = false;

    @OriginalMember(owner = "client!it", name = "s", descriptor = "Lkia;")
    public class788 field6777 = new class788();

    @OriginalMember(owner = "client!it", name = "k", descriptor = "[Lks;")
    public class31[] field6763 = new class31[8192];

    @OriginalMember(owner = "client!it", name = "u", descriptor = "[Z")
    private static boolean[] field6768 = new boolean[32];

    @OriginalMember(owner = "client!it", name = "v", descriptor = "[Z")
    private static boolean[] field6770 = new boolean[8];

    @OriginalMember(owner = "client!it", name = "j", descriptor = "I")
    public int field6774;

    @OriginalMember(owner = "client!it", name = "y", descriptor = "J")
    private long field6764;

    @OriginalMember(owner = "client!it", name = "r", descriptor = "J")
    private long field6769;

    @OriginalMember(owner = "client!it", name = "b", descriptor = "(IZ)V")
    private final void method3563(int arg0, boolean arg1) {
        class21.field262.method3618(this, 86);
        this.field6769 = arg0;
        this.field6764 = arg0;
        this.field6775 = true;
        this.field6776 = arg1;
    }

    @OriginalMember(owner = "client!it", name = "d", descriptor = "()V")
    public final void method3564() {
        this.field6767 = true;
    }

    @OriginalMember(owner = "client!it", name = "c", descriptor = "()Lkia;")
    public final class788 method3565() {
        return this.field6777;
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(Lha;)V")
    public final void method3566(class18 arg0) {
        this.field6777.field11376.method3089((byte) 117);
        for (class680 var2 = (class680) this.field6766.method3617(false); var2 != null; var2 = (class680) this.field6766.method3612(3)) {
            var2.method4887(arg0, 1, this.field6764);
        }
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(J)V")
    public final void method3567(long arg0) {
        this.field6769 = arg0;
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(IIIII)V")
    public final void method3568(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field6774 = arg0;
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(Lha;J[Lkw;[Liia;Z)V")
    public final void method3569(class18 arg0, long arg1, class510[] arg2, class264[] arg3, boolean arg4) {
        if (!this.field6762) {
            this.method3572(arg0, arg2, arg4);
            this.method3575(arg3, arg4);
            this.field6769 = arg1;
        }
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(Lha;J)Z")
    public final boolean method3570(class18 arg0, long arg1) {
        if (this.field6769 == this.field6764) {
            this.method3573();
        } else {
            this.method3564();
        }
        if (arg1 - this.field6769 > 750L) {
            this.method3578();
            return false;
        }
        int var4 = (int) (arg1 - this.field6764);
        if (this.field6775) {
            for (class680 var5 = (class680) this.field6766.method3617(false); var5 != null; var5 = (class680) this.field6766.method3612(3)) {
                for (int var6 = 0; var6 < var5.field9549.field6111; var6++) {
                    var5.method4886(arg0, 1, arg1, !this.field6767, true);
                }
            }
            this.field6775 = false;
        }
        for (class680 var7 = (class680) this.field6766.method3617(false); var7 != null; var7 = (class680) this.field6766.method3612(3)) {
            var7.method4886(arg0, var4, arg1, !this.field6767, true);
        }
        this.field6764 = arg1;
        return true;
    }

    @OriginalMember(owner = "client!it", name = "e", descriptor = "()V")
    public final void method3571() {
        this.field6775 = true;
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(Lha;[Lkw;Z)V")
    private final void method3572(class18 arg0, class510[] arg1, boolean arg2) {
        for (int var4 = 0; var4 < 32; var4++) {
            field6768[var4] = false;
        }
        label67: for (class680 var5 = (class680) this.field6766.method3617(false); var5 != null; var5 = (class680) this.field6766.method3612(3)) {
            if (arg1 != null) {
                for (int var8 = 0; var8 < arg1.length; var8++) {
                    if (arg1[var8] == var5.field9556 || arg1[var8].field7487 == var5.field9556) {
                        field6768[var8] = true;
                        var5.method4884(-26041);
                        var5.field9550 = false;
                        continue label67;
                    }
                }
            }
            if (!arg2) {
                if (var5.field9544 == 0) {
                    var5.method4736(0);
                    this.field6771--;
                } else {
                    var5.field9550 = true;
                }
            }
        }
        if (arg1 == null) {
            return;
        }
        for (int var6 = 0; var6 < arg1.length && var6 != 32 && this.field6771 != 32; var6++) {
            if (!field6768[var6]) {
                class680 var7 = new class680(arg0, arg1[var6], this, this.field6769);
                this.field6766.method3618(var7, 45);
                this.field6771++;
                field6768[var6] = true;
            }
        }
    }

    @OriginalMember(owner = "client!it", name = "g", descriptor = "()V")
    private final void method3573() {
        this.field6767 = false;
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(IZ)Lit;")
    public static final class464 method3574(int arg0, boolean arg1) {
        if (class632.field8975 == class550.field8038) {
            return new class464(arg0, arg1);
        } else {
            class464 var2 = class703.field9828[class632.field8975];
            class632.field8975 = class632.field8975 + 1 & class532.field7710[class323.field4403];
            var2.method3563(arg0, arg1);
            return var2;
        }
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "([Liia;Z)V")
    private final void method3575(class264[] arg0, boolean arg1) {
        for (int var3 = 0; var3 < 8; var3++) {
            field6770[var3] = false;
        }
        label76: for (class345 var4 = (class345) this.field6772.method3977((byte) -84); var4 != null; var4 = (class345) this.field6772.method3987(0)) {
            if (arg0 != null) {
                for (int var7 = 0; var7 < arg0.length; var7++) {
                    if (arg0[var7] == var4.field5019 || arg0[var7].field3728 == var4.field5019) {
                        field6770[var7] = true;
                        var4.method2769(-122);
                        continue label76;
                    }
                }
            }
            if (!arg1) {
                var4.method4294(0);
                this.field6773--;
                if (var4.method4917(111)) {
                    var4.method4911(124);
                    class527.field7668--;
                }
            }
        }
        if (arg0 == null) {
            return;
        }
        for (int var5 = 0; var5 < arg0.length && var5 != 8 && this.field6773 != 8; var5++) {
            if (!field6770[var5]) {
                class345 var6 = null;
                if (arg0[var5].method2180(-65536).field8440 == 1 && class527.field7668 < 32) {
                    var6 = new class345(arg0[var5], this);
                    class653.field9271.method1910(true, var6, (long) arg0[var5].field3729);
                    class527.field7668++;
                }
                if (var6 == null) {
                    var6 = new class345(arg0[var5], this);
                }
                this.field6772.method3984(var6, 0);
                this.field6773++;
                field6770[var5] = true;
            }
        }
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "()V")
    public static void method3576() {
        field6768 = null;
        field6770 = null;
    }

    @OriginalMember(owner = "client!it", name = "b", descriptor = "()Lkia;")
    public final class788 method3577() {
        this.field6777.field11376.method3089((byte) 118);
        for (int var1 = 0; var1 < this.field6763.length; var1++) {
            if (this.field6763[var1] != null && this.field6763[var1].field399 != null) {
                this.field6777.field11376.method3090(13, this.field6763[var1]);
            }
        }
        return this.field6777;
    }

    @OriginalMember(owner = "client!it", name = "f", descriptor = "()V")
    public final void method3578() {
        this.field6762 = true;
        for (class345 var1 = (class345) this.field6772.method3977((byte) -106); var1 != null; var1 = (class345) this.field6772.method3987(0)) {
            if (var1.field5024.field8440 == 1) {
                var1.method4911(126);
            }
        }
        for (int var2 = 0; var2 < this.field6763.length; var2++) {
            if (this.field6763[var2] != null) {
                this.field6763[var2].method338();
                this.field6763[var2] = null;
            }
        }
        this.field6765 = 0;
        this.field6766 = new class470();
        this.field6771 = 0;
        this.field6772 = new class524();
        this.field6773 = 0;
        this.method4736(0);
        class703.field9828[class550.field8038] = this;
        class550.field8038 = class550.field8038 + 1 & class532.field7710[class323.field4403];
    }

    @OriginalMember(owner = "client!it", name = "<init>", descriptor = "(IZ)V")
    private class464(int arg0, boolean arg1) {
        this.method3563(arg0, arg1);
    }
}
