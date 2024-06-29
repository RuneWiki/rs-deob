import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!om")
public class class209 extends class413 {

    @OriginalMember(owner = "client!om", name = "l", descriptor = "I")
    public int field2965 = 0;

    @OriginalMember(owner = "client!om", name = "h", descriptor = "Z")
    public boolean field2961 = false;

    @OriginalMember(owner = "client!om", name = "n", descriptor = "Z")
    private boolean field2967 = false;

    @OriginalMember(owner = "client!om", name = "j", descriptor = "Lfk;")
    private class393 field2963 = new class393();

    @OriginalMember(owner = "client!om", name = "q", descriptor = "I")
    private int field2970 = 0;

    @OriginalMember(owner = "client!om", name = "p", descriptor = "Lwq;")
    public class92 field2969 = new class92();

    @OriginalMember(owner = "client!om", name = "t", descriptor = "Z")
    private boolean field2973 = false;

    @OriginalMember(owner = "client!om", name = "x", descriptor = "I")
    private int field2977 = 0;

    @OriginalMember(owner = "client!om", name = "u", descriptor = "Lgm;")
    public class63 field2974 = new class63();

    @OriginalMember(owner = "client!om", name = "g", descriptor = "[Lqg;")
    public class269[] field2960 = new class269[8192];

    @OriginalMember(owner = "client!om", name = "m", descriptor = "J")
    private long field2966;

    @OriginalMember(owner = "client!om", name = "o", descriptor = "J")
    private long field2968;

    @OriginalMember(owner = "client!om", name = "i", descriptor = "[Z")
    private static boolean[] field2962 = new boolean[8];

    @OriginalMember(owner = "client!om", name = "k", descriptor = "[Z")
    private static boolean[] field2964 = new boolean[8];

    @OriginalMember(owner = "client!om", name = "r", descriptor = "I")
    public int field2971;

    @OriginalMember(owner = "client!om", name = "s", descriptor = "I")
    public int field2972;

    @OriginalMember(owner = "client!om", name = "v", descriptor = "I")
    public int field2975;

    @OriginalMember(owner = "client!om", name = "w", descriptor = "I")
    public int field2976;

    @OriginalMember(owner = "client!om", name = "a", descriptor = "()V")
    public final void method1361() {
        this.field2961 = true;
        for (class385 var1 = (class385) this.field2969.method506((byte) -128); var1 != null; var1 = (class385) this.field2969.method514(true)) {
            if (var1.field5430.field3725 == 1) {
                var1.method2133(-31493);
            }
        }
        this.field2960 = new class269[8192];
        this.field2965 = 0;
        this.field2963 = new class393();
        this.field2970 = 0;
        this.field2969 = new class92();
        this.field2977 = 0;
        this.method2635(-13388);
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(Lae;J[Lqh;[Ldj;Z)V")
    public final void method1362(class134 arg0, long arg1, class42[] arg2, class190[] arg3, boolean arg4) {
        if (!this.field2961) {
            this.method1373(arg0, arg2, arg4);
            this.method1363(arg3, arg4);
            this.field2966 = arg1;
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "([Ldj;Z)V")
    private final void method1363(class190[] arg0, boolean arg1) {
        for (int var3 = 0; var3 < 8; var3++) {
            field2962[var3] = false;
        }
        label73: for (class385 var4 = (class385) this.field2969.method506((byte) -128); var4 != null; var4 = (class385) this.field2969.method514(true)) {
            if (arg0 != null) {
                for (int var7 = 0; var7 < arg0.length; var7++) {
                    if (arg0[var7] == var4.field5440 || arg0[var7].field2735 == var4.field5440) {
                        field2962[var7] = true;
                        var4.method2473(-127);
                        continue label73;
                    }
                }
            }
            if (!arg1) {
                var4.method2594((byte) -22);
                this.field2977--;
                if (var4.method2136(8)) {
                    var4.method2133(-31493);
                    class82.field952--;
                }
            }
        }
        if (arg0 == null) {
            return;
        }
        for (int var5 = 0; var5 < arg0.length && this.field2977 != 8; var5++) {
            if (!field2962[var5]) {
                class385 var6 = null;
                if (class8.method63(arg0[var5].field2740, true).field3725 == 1 && class82.field952 < 32) {
                    var6 = new class385(arg0[var5], this);
                    class216.field3049.method549(var6, 119, (long) arg0[var5].field2740);
                    class82.field952++;
                }
                if (var6 == null) {
                    var6 = new class385(arg0[var5], this);
                }
                this.field2969.method509((byte) 101, var6);
                this.field2977++;
                field2962[var5] = true;
            }
        }
    }

    @OriginalMember(owner = "client!om", name = "b", descriptor = "()V")
    public final void method1364() {
        this.field2973 = true;
    }

    @OriginalMember(owner = "client!om", name = "c", descriptor = "()V")
    private final void method1365() {
        this.field2967 = false;
    }

    @OriginalMember(owner = "client!om", name = "d", descriptor = "()V")
    public final void method1366() {
        this.field2974.field725.method436((byte) -110);
        for (class440 var1 = (class440) this.field2963.method2509((byte) 51); var1 != null; var1 = (class440) this.field2963.method2515(0)) {
            var1.method2743(this.field2968, -124);
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(J)V")
    public final void method1367(long arg0) {
        this.field2966 = arg0;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(Lae;J)Z")
    public final boolean method1368(class134 arg0, long arg1) {
        if (this.field2968 == this.field2966) {
            this.method1365();
        } else {
            this.method1369();
        }
        if (arg1 - this.field2966 > 750L) {
            this.method1361();
            return false;
        }
        int var4 = (int) (arg1 - this.field2968);
        if (this.field2973) {
            for (class440 var5 = (class440) this.field2963.method2509((byte) 51); var5 != null; var5 = (class440) this.field2963.method2515(0)) {
                for (int var6 = 0; var6 < var5.field6286.field4461; var6++) {
                    var5.method2748(arg0, (byte) 37, 1, !this.field2967, arg1);
                }
            }
            this.field2973 = false;
        }
        for (class440 var7 = (class440) this.field2963.method2509((byte) 51); var7 != null; var7 = (class440) this.field2963.method2515(0)) {
            var7.method2748(arg0, (byte) 37, var4, !this.field2967, arg1);
        }
        this.field2968 = arg1;
        return true;
    }

    @OriginalMember(owner = "client!om", name = "e", descriptor = "()V")
    public final void method1369() {
        this.field2967 = true;
    }

    @OriginalMember(owner = "client!om", name = "f", descriptor = "()V")
    public static void method1370() {
        field2964 = null;
        field2962 = null;
    }

    @OriginalMember(owner = "client!om", name = "g", descriptor = "()Lgm;")
    public final class63 method1371() {
        return this.field2974;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(IIIII)V")
    public final void method1372(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field2975 = arg0;
        this.field2971 = arg1;
        this.field2972 = arg3;
        this.field2976 = arg4;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(Lae;[Lqh;Z)V")
    private final void method1373(class134 arg0, class42[] arg1, boolean arg2) {
        for (int var4 = 0; var4 < 8; var4++) {
            field2964[var4] = false;
        }
        label64: for (class440 var5 = (class440) this.field2963.method2509((byte) 51); var5 != null; var5 = (class440) this.field2963.method2515(0)) {
            if (arg1 != null) {
                for (int var8 = 0; var8 < arg1.length; var8++) {
                    if (arg1[var8] == var5.field6288 || arg1[var8].field512 == var5.field6288) {
                        field2964[var8] = true;
                        var5.method2746(false);
                        var5.field6315 = false;
                        continue label64;
                    }
                }
            }
            if (!arg2) {
                if (var5.field6319 == 0) {
                    var5.method2635(-13388);
                    this.field2970--;
                } else {
                    var5.field6315 = true;
                }
            }
        }
        if (arg1 == null) {
            return;
        }
        for (int var6 = 0; var6 < arg1.length && this.field2970 != 8; var6++) {
            if (!field2964[var6]) {
                class440 var7 = new class440(arg0, arg1[var6], this, this.field2966);
                this.field2963.method2511(-128, var7);
                this.field2970++;
                field2964[var6] = true;
            }
        }
    }

    @OriginalMember(owner = "client!om", name = "<init>", descriptor = "(I)V")
    public class209(int arg0) {
        class257.field3687.method2511(94, this);
        this.field2966 = (long) arg0;
        this.field2968 = (long) arg0;
        this.field2973 = true;
    }
}
