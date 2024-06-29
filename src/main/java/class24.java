import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qo")
public class class24 extends class76 {

    @OriginalMember(owner = "client!qo", name = "n", descriptor = "I")
    public int field349 = 0;

    @OriginalMember(owner = "client!qo", name = "s", descriptor = "Z")
    private boolean field354 = false;

    @OriginalMember(owner = "client!qo", name = "r", descriptor = "Z")
    public boolean field353 = false;

    @OriginalMember(owner = "client!qo", name = "q", descriptor = "Leo;")
    private class310 field352 = new class310();

    @OriginalMember(owner = "client!qo", name = "w", descriptor = "I")
    private int field358 = 0;

    @OriginalMember(owner = "client!qo", name = "v", descriptor = "Lga;")
    public class420 field357 = new class420();

    @OriginalMember(owner = "client!qo", name = "z", descriptor = "I")
    private int field361 = 0;

    @OriginalMember(owner = "client!qo", name = "y", descriptor = "Z")
    private boolean field360 = false;

    @OriginalMember(owner = "client!qo", name = "B", descriptor = "Z")
    public boolean field363 = false;

    @OriginalMember(owner = "client!qo", name = "A", descriptor = "Lhea;")
    public class443 field362 = new class443();

    @OriginalMember(owner = "client!qo", name = "p", descriptor = "[Ljr;")
    public class121[] field351 = new class121[8192];

    @OriginalMember(owner = "client!qo", name = "o", descriptor = "[Z")
    private static boolean[] field350 = new boolean[32];

    @OriginalMember(owner = "client!qo", name = "m", descriptor = "[Z")
    private static boolean[] field348 = new boolean[8];

    @OriginalMember(owner = "client!qo", name = "x", descriptor = "I")
    public int field359;

    @OriginalMember(owner = "client!qo", name = "t", descriptor = "J")
    private long field355;

    @OriginalMember(owner = "client!qo", name = "u", descriptor = "J")
    private long field356;

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "()V")
    public final void method175() {
        this.field360 = true;
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(IIIII)V")
    public final void method176(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field359 = arg0;
    }

    @OriginalMember(owner = "client!qo", name = "b", descriptor = "()Lhea;")
    public final class443 method177() {
        this.field362.field6311.method1005(true);
        for (int var1 = 0; var1 < this.field351.length; var1++) {
            if (this.field351[var1] != null && this.field351[var1].field1579 != null) {
                this.field362.field6311.method1002(-2, this.field351[var1]);
            }
        }
        return this.field362;
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(Lha;)V")
    public final void method178(class66 arg0) {
        this.field362.field6311.method1005(true);
        for (class621 var2 = (class621) this.field352.method2033(0); var2 != null; var2 = (class621) this.field352.method2025((byte) -88)) {
            var2.method3554((byte) -124, arg0, this.field356);
        }
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "([Lrf;Z)V")
    private final void method179(class92[] arg0, boolean arg1) {
        for (int var3 = 0; var3 < 8; var3++) {
            field348[var3] = false;
        }
        label76: for (class462 var4 = (class462) this.field357.method2508((byte) 108); var4 != null; var4 = (class462) this.field357.method2505((byte) -55)) {
            if (arg0 != null) {
                for (int var7 = 0; var7 < arg0.length; var7++) {
                    if (arg0[var7] == var4.field6599 || arg0[var7].field1201 == var4.field6599) {
                        field348[var7] = true;
                        var4.method2744((byte) -88);
                        continue label76;
                    }
                }
            }
            if (!arg1) {
                var4.method3117((byte) -105);
                this.field361--;
                if (var4.method1515((byte) 73)) {
                    var4.method1512(false);
                    class703.field9909--;
                }
            }
        }
        if (arg0 == null) {
            return;
        }
        for (int var5 = 0; var5 < arg0.length && var5 != 8 && this.field361 != 8; var5++) {
            if (!field348[var5]) {
                class462 var6 = null;
                if (arg0[var5].method656(-19478).field10630 == 1 && class703.field9909 < 32) {
                    var6 = new class462(arg0[var5], this);
                    class614.field8678.method3317(1, var6, (long) arg0[var5].field1206);
                    class703.field9909++;
                }
                if (var6 == null) {
                    var6 = new class462(arg0[var5], this);
                }
                this.field357.method2510(var6, false);
                this.field361++;
                field348[var5] = true;
            }
        }
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(Lha;[Lnha;Z)V")
    private final void method180(class66 arg0, class338[] arg1, boolean arg2) {
        for (int var4 = 0; var4 < 32; var4++) {
            field350[var4] = false;
        }
        label67: for (class621 var5 = (class621) this.field352.method2033(0); var5 != null; var5 = (class621) this.field352.method2025((byte) -88)) {
            if (arg1 != null) {
                for (int var8 = 0; var8 < arg1.length; var8++) {
                    if (arg1[var8] == var5.field8748 || arg1[var8].field5011 == var5.field8748) {
                        field350[var8] = true;
                        var5.method3553(127);
                        var5.field8755 = false;
                        continue label67;
                    }
                }
            }
            if (!arg2) {
                if (var5.field8758 == 0) {
                    var5.method592(2);
                    this.field358--;
                } else {
                    var5.field8755 = true;
                }
            }
        }
        if (arg1 == null) {
            return;
        }
        for (int var6 = 0; var6 < arg1.length && var6 != 32 && this.field358 != 32; var6++) {
            if (!field350[var6]) {
                class621 var7 = new class621(arg0, arg1[var6], this, this.field355);
                this.field352.method2026((byte) 51, var7);
                this.field358++;
                field350[var6] = true;
            }
        }
    }

    @OriginalMember(owner = "client!qo", name = "c", descriptor = "()V")
    public static void method181() {
        field350 = null;
        field348 = null;
    }

    @OriginalMember(owner = "client!qo", name = "d", descriptor = "()V")
    public final void method182() {
        this.field353 = true;
        for (class462 var1 = (class462) this.field357.method2508((byte) -26); var1 != null; var1 = (class462) this.field357.method2505((byte) -55)) {
            if (var1.field6598.field10630 == 1) {
                var1.method1512(false);
            }
        }
        for (int var2 = 0; var2 < this.field351.length; var2++) {
            if (this.field351[var2] != null) {
                this.field351[var2].method902();
                this.field351[var2] = null;
            }
        }
        this.field349 = 0;
        this.field352 = new class310();
        this.field358 = 0;
        this.field357 = new class420();
        this.field361 = 0;
        this.method592(2);
        class785.field10786[class494.field7012] = this;
        class494.field7012 = class494.field7012 + 1 & class380.field5456[class211.field3063];
    }

    @OriginalMember(owner = "client!qo", name = "e", descriptor = "()V")
    private final void method183() {
        this.field354 = false;
    }

    @OriginalMember(owner = "client!qo", name = "f", descriptor = "()Lhea;")
    public final class443 method184() {
        return this.field362;
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(IZ)Lqo;")
    public static final class24 method185(int arg0, boolean arg1) {
        if (class494.field7012 == class261.field3685) {
            return new class24(arg0, arg1);
        } else {
            class24 var2 = class785.field10786[class261.field3685];
            class261.field3685 = class261.field3685 + 1 & class380.field5456[class211.field3063];
            var2.method189(arg0, arg1);
            return var2;
        }
    }

    @OriginalMember(owner = "client!qo", name = "g", descriptor = "()V")
    public final void method186() {
        this.field354 = true;
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(Lha;J)Z")
    public final boolean method187(class66 arg0, long arg1) {
        if (this.field356 == this.field355) {
            this.method183();
        } else {
            this.method186();
        }
        if (arg1 - this.field355 > 750L) {
            this.method182();
            return false;
        }
        int var4 = (int) (arg1 - this.field356);
        if (this.field360) {
            for (class621 var5 = (class621) this.field352.method2033(0); var5 != null; var5 = (class621) this.field352.method2025((byte) -88)) {
                for (int var6 = 0; var6 < var5.field8759.field7805; var6++) {
                    var5.method3552(arg0, arg1, 1, 0, !this.field354);
                }
            }
            this.field360 = false;
        }
        for (class621 var7 = (class621) this.field352.method2033(0); var7 != null; var7 = (class621) this.field352.method2025((byte) -88)) {
            var7.method3552(arg0, arg1, var4, 0, !this.field354);
        }
        this.field356 = arg1;
        return true;
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(J)V")
    public final void method188(long arg0) {
        this.field355 = arg0;
    }

    @OriginalMember(owner = "client!qo", name = "b", descriptor = "(IZ)V")
    private final void method189(int arg0, boolean arg1) {
        class497.field7071.method2026((byte) 51, this);
        this.field355 = arg0;
        this.field356 = arg0;
        this.field360 = true;
        this.field363 = arg1;
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(Lha;J[Lnha;[Lrf;Z)V")
    public final void method190(class66 arg0, long arg1, class338[] arg2, class92[] arg3, boolean arg4) {
        if (!this.field353) {
            this.method180(arg0, arg2, arg4);
            this.method179(arg3, arg4);
            this.field355 = arg1;
        }
    }

    @OriginalMember(owner = "client!qo", name = "<init>", descriptor = "(IZ)V")
    private class24(int arg0, boolean arg1) {
        this.method189(arg0, arg1);
    }
}
