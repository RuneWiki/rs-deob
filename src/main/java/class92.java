import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tn")
public class class92 extends class182 {

    @OriginalMember(owner = "client!tn", name = "g", descriptor = "Z")
    public boolean field1354 = false;

    @OriginalMember(owner = "client!tn", name = "k", descriptor = "I")
    public int field1353 = 0;

    @OriginalMember(owner = "client!tn", name = "i", descriptor = "Z")
    private boolean field1357 = false;

    @OriginalMember(owner = "client!tn", name = "j", descriptor = "Lwc;")
    private class71 field1356 = new class71();

    @OriginalMember(owner = "client!tn", name = "h", descriptor = "I")
    private int field1359 = 0;

    @OriginalMember(owner = "client!tn", name = "l", descriptor = "Lat;")
    public class398 field1358 = new class398();

    @OriginalMember(owner = "client!tn", name = "u", descriptor = "Z")
    private boolean field1361 = false;

    @OriginalMember(owner = "client!tn", name = "o", descriptor = "Z")
    public boolean field1362 = false;

    @OriginalMember(owner = "client!tn", name = "r", descriptor = "I")
    private int field1364 = 0;

    @OriginalMember(owner = "client!tn", name = "t", descriptor = "Lsn;")
    public class659 field1363 = new class659();

    @OriginalMember(owner = "client!tn", name = "p", descriptor = "[Lqc;")
    public class777[] field1351 = new class777[8192];

    @OriginalMember(owner = "client!tn", name = "q", descriptor = "[Z")
    private static boolean[] field1349 = new boolean[8];

    @OriginalMember(owner = "client!tn", name = "s", descriptor = "[Z")
    private static boolean[] field1352 = new boolean[32];

    @OriginalMember(owner = "client!tn", name = "v", descriptor = "I")
    public int field1360;

    @OriginalMember(owner = "client!tn", name = "n", descriptor = "J")
    private long field1350;

    @OriginalMember(owner = "client!tn", name = "m", descriptor = "J")
    private long field1355;

    @OriginalMember(owner = "client!tn", name = "c", descriptor = "()V")
    public final void method891() {
        this.field1357 = true;
    }

    @OriginalMember(owner = "client!tn", name = "b", descriptor = "()V")
    public final void method892() {
        this.field1361 = true;
    }

    @OriginalMember(owner = "client!tn", name = "d", descriptor = "()Lsn;")
    public final class659 method893() {
        return this.field1363;
    }

    @OriginalMember(owner = "client!tn", name = "g", descriptor = "()V")
    public static void method894() {
        field1352 = null;
        field1349 = null;
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "([Lok;Z)V")
    private final void method895(class265[] arg0, boolean arg1) {
        for (int var3 = 0; var3 < 8; var3++) {
            field1349[var3] = false;
        }
        label76: for (class215 var4 = (class215) this.field1358.method3228(11); var4 != null; var4 = (class215) this.field1358.method3216(true)) {
            if (arg0 != null) {
                for (int var7 = 0; var7 < arg0.length; var7++) {
                    if (arg0[var7] == var4.field3379 || arg0[var7].field4291 == var4.field3379) {
                        field1349[var7] = true;
                        var4.method1929((byte) -105);
                        continue label76;
                    }
                }
            }
            if (!arg1) {
                var4.method4173(-1);
                this.field1364--;
                if (var4.method3557(true)) {
                    var4.method3558((byte) 119);
                    class393.field6253--;
                }
            }
        }
        if (arg0 == null) {
            return;
        }
        for (int var5 = 0; var5 < arg0.length && var5 != 8 && this.field1364 != 8; var5++) {
            if (!field1349[var5]) {
                class215 var6 = null;
                if (arg0[var5].method2299(126).field8902 == 1 && class393.field6253 < 32) {
                    var6 = new class215(arg0[var5], this);
                    class449.field6964.method2181(var6, (long) arg0[var5].field4294, -19767);
                    class393.field6253++;
                }
                if (var6 == null) {
                    var6 = new class215(arg0[var5], this);
                }
                this.field1358.method3220(var6, 0);
                this.field1364++;
                field1349[var5] = true;
            }
        }
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(Lha;J[Lui;[Lok;Z)V")
    public final void method896(class63 arg0, long arg1, class239[] arg2, class265[] arg3, boolean arg4) {
        if (!this.field1354) {
            this.method900(arg0, arg2, arg4);
            this.method895(arg3, arg4);
            this.field1350 = arg1;
        }
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(Lha;J)Z")
    public final boolean method897(class63 arg0, long arg1) {
        if (this.field1355 == this.field1350) {
            this.method903();
        } else {
            this.method891();
        }
        if (arg1 - this.field1350 > 750L) {
            this.method906();
            return false;
        }
        int var4 = (int) (arg1 - this.field1355);
        if (this.field1361) {
            for (class719 var5 = (class719) this.field1356.method749(0); var5 != null; var5 = (class719) this.field1356.method747((byte) 21)) {
                for (int var6 = 0; var6 < var5.field10529.field5034; var6++) {
                    var5.method5223((byte) 81, !this.field1357, arg1, 1, arg0);
                }
            }
            this.field1361 = false;
        }
        for (class719 var7 = (class719) this.field1356.method749(0); var7 != null; var7 = (class719) this.field1356.method747((byte) 21)) {
            var7.method5223((byte) 60, !this.field1357, arg1, var4, arg0);
        }
        this.field1355 = arg1;
        return true;
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(J)V")
    public final void method898(long arg0) {
        this.field1350 = arg0;
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(Lha;)V")
    public final void method899(class63 arg0) {
        this.field1363.field9415.method3896(10);
        for (class719 var2 = (class719) this.field1356.method749(0); var2 != null; var2 = (class719) this.field1356.method747((byte) 21)) {
            var2.method5226(this.field1355, false, arg0);
        }
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(Lha;[Lui;Z)V")
    private final void method900(class63 arg0, class239[] arg1, boolean arg2) {
        for (int var4 = 0; var4 < 32; var4++) {
            field1352[var4] = false;
        }
        label67: for (class719 var5 = (class719) this.field1356.method749(0); var5 != null; var5 = (class719) this.field1356.method747((byte) 21)) {
            if (arg1 != null) {
                for (int var8 = 0; var8 < arg1.length; var8++) {
                    if (arg1[var8] == var5.field10526 || arg1[var8].field3678 == var5.field10526) {
                        field1352[var8] = true;
                        var5.method5224(119);
                        var5.field10524 = false;
                        continue label67;
                    }
                }
            }
            if (!arg2) {
                if (var5.field10527 == 0) {
                    var5.method1715(-20685);
                    this.field1359--;
                } else {
                    var5.field10524 = true;
                }
            }
        }
        if (arg1 == null) {
            return;
        }
        for (int var6 = 0; var6 < arg1.length && var6 != 32 && this.field1359 != 32; var6++) {
            if (!field1352[var6]) {
                class719 var7 = new class719(arg0, arg1[var6], this, this.field1350);
                this.field1356.method748(71, var7);
                this.field1359++;
                field1352[var6] = true;
            }
        }
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(IZ)V")
    private final void method901(int arg0, boolean arg1) {
        class440.field6871.method748(47, this);
        this.field1350 = arg0;
        this.field1355 = arg0;
        this.field1361 = true;
        this.field1362 = arg1;
    }

    @OriginalMember(owner = "client!tn", name = "e", descriptor = "()Lsn;")
    public final class659 method902() {
        this.field1363.field9415.method3896(10);
        for (int var1 = 0; var1 < this.field1351.length; var1++) {
            if (this.field1351[var1] != null && this.field1351[var1].field11340 != null) {
                this.field1363.field9415.method3898(false, this.field1351[var1]);
            }
        }
        return this.field1363;
    }

    @OriginalMember(owner = "client!tn", name = "f", descriptor = "()V")
    private final void method903() {
        this.field1357 = false;
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(IIIII)V")
    public final void method904(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field1360 = arg0;
    }

    @OriginalMember(owner = "client!tn", name = "b", descriptor = "(IZ)Ltn;")
    public static final class92 method905(int arg0, boolean arg1) {
        if (class497.field7453 == class164.field2654) {
            return new class92(arg0, arg1);
        } else {
            class92 var2 = class640.field9186[class164.field2654];
            class164.field2654 = class164.field2654 + 1 & class350.field5665[class395.field6272];
            var2.method901(arg0, arg1);
            return var2;
        }
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "()V")
    public final void method906() {
        this.field1354 = true;
        for (class215 var1 = (class215) this.field1358.method3228(11); var1 != null; var1 = (class215) this.field1358.method3216(true)) {
            if (var1.field3384.field8902 == 1) {
                var1.method3558((byte) 115);
            }
        }
        for (int var2 = 0; var2 < this.field1351.length; var2++) {
            if (this.field1351[var2] != null) {
                this.field1351[var2].method5587();
                this.field1351[var2] = null;
            }
        }
        this.field1353 = 0;
        this.field1356 = new class71();
        this.field1359 = 0;
        this.field1358 = new class398();
        this.field1364 = 0;
        this.method1715(-20685);
        class640.field9186[class497.field7453] = this;
        class497.field7453 = class497.field7453 + 1 & class350.field5665[class395.field6272];
    }

    @OriginalMember(owner = "client!tn", name = "<init>", descriptor = "(IZ)V")
    private class92(int arg0, boolean arg1) {
        this.method901(arg0, arg1);
    }
}
