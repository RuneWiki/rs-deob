import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class206 extends class448 {

    @OriginalMember(owner = "client!vc", name = "j", descriptor = "Z")
    public boolean field2913 = false;

    @OriginalMember(owner = "client!vc", name = "o", descriptor = "I")
    public int field2918 = 0;

    @OriginalMember(owner = "client!vc", name = "q", descriptor = "Z")
    private boolean field2920 = false;

    @OriginalMember(owner = "client!vc", name = "m", descriptor = "Lqi;")
    private class398 field2916 = new class398();

    @OriginalMember(owner = "client!vc", name = "s", descriptor = "I")
    private int field2922 = 0;

    @OriginalMember(owner = "client!vc", name = "t", descriptor = "Lwo;")
    public class522 field2923 = new class522();

    @OriginalMember(owner = "client!vc", name = "w", descriptor = "I")
    private int field2926 = 0;

    @OriginalMember(owner = "client!vc", name = "z", descriptor = "Z")
    private boolean field2929 = false;

    @OriginalMember(owner = "client!vc", name = "y", descriptor = "Lqb;")
    public class148 field2928 = new class148();

    @OriginalMember(owner = "client!vc", name = "r", descriptor = "[Luu;")
    public class187[] field2921 = new class187[8192];

    @OriginalMember(owner = "client!vc", name = "k", descriptor = "J")
    private long field2914;

    @OriginalMember(owner = "client!vc", name = "n", descriptor = "J")
    private long field2917;

    @OriginalMember(owner = "client!vc", name = "l", descriptor = "[Z")
    private static boolean[] field2915 = new boolean[8];

    @OriginalMember(owner = "client!vc", name = "p", descriptor = "[Z")
    private static boolean[] field2919 = new boolean[8];

    @OriginalMember(owner = "client!vc", name = "u", descriptor = "I")
    public int field2924;

    @OriginalMember(owner = "client!vc", name = "v", descriptor = "I")
    public int field2925;

    @OriginalMember(owner = "client!vc", name = "x", descriptor = "I")
    public int field2927;

    @OriginalMember(owner = "client!vc", name = "A", descriptor = "I")
    public int field2930;

    @OriginalMember(owner = "client!vc", name = "B", descriptor = "I")
    public int field2931;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "()V")
    public final void method1248() {
        this.field2920 = true;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lqa;J[Lvj;[Lit;Z)V")
    public final void method1249(class162 arg0, long arg1, class304[] arg2, class456[] arg3, boolean arg4) {
        if (!this.field2913) {
            this.method1254(arg0, arg2, arg4);
            this.method1258(arg3, arg4);
            this.field2914 = arg1;
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lqa;J)Z")
    public final boolean method1250(class162 arg0, long arg1) {
        if (this.field2917 == this.field2914) {
            this.method1256();
        } else {
            this.method1248();
        }
        if (arg1 - this.field2914 > 750L) {
            this.method1251();
            return false;
        }
        int var4 = (int) (arg1 - this.field2917);
        if (this.field2929) {
            for (class530 var5 = (class530) this.field2916.method2306(126); var5 != null; var5 = (class530) this.field2916.method2302(-82)) {
                for (int var6 = 0; var6 < var5.field7806.field2161; var6++) {
                    var5.method3116(-104, arg1, arg0, !this.field2920, 1);
                }
            }
            this.field2929 = false;
        }
        for (class530 var7 = (class530) this.field2916.method2306(117); var7 != null; var7 = (class530) this.field2916.method2302(-102)) {
            var7.method3116(-115, arg1, arg0, !this.field2920, var4);
        }
        this.field2917 = arg1;
        return true;
    }

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "()V")
    public final void method1251() {
        this.field2913 = true;
        for (class343 var1 = (class343) this.field2923.method3072((byte) 54); var1 != null; var1 = (class343) this.field2923.method3066(2)) {
            if (var1.field4731.field5188 == 1) {
                var1.method581(4);
            }
        }
        this.field2921 = new class187[8192];
        this.field2918 = 0;
        this.field2916 = new class398();
        this.field2922 = 0;
        this.field2923 = new class522();
        this.field2926 = 0;
        this.method2645(120);
    }

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "()V")
    public final void method1252() {
        this.field2928.field2090.method1033((byte) -42);
        for (class530 var1 = (class530) this.field2916.method2306(111); var1 != null; var1 = (class530) this.field2916.method2302(-126)) {
            var1.method3118((byte) 66, this.field2917);
        }
    }

    @OriginalMember(owner = "client!vc", name = "d", descriptor = "()V")
    public static void method1253() {
        field2919 = null;
        field2915 = null;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lqa;[Lvj;Z)V")
    private final void method1254(class162 arg0, class304[] arg1, boolean arg2) {
        for (int var4 = 0; var4 < 8; var4++) {
            field2919[var4] = false;
        }
        label64: for (class530 var5 = (class530) this.field2916.method2306(107); var5 != null; var5 = (class530) this.field2916.method2302(-117)) {
            if (arg1 != null) {
                for (int var8 = 0; var8 < arg1.length; var8++) {
                    if (arg1[var8] == var5.field7803 || arg1[var8].field4161 == var5.field7803) {
                        field2919[var8] = true;
                        var5.method3114(-32768);
                        var5.field7793 = false;
                        continue label64;
                    }
                }
            }
            if (!arg2) {
                if (var5.field7795 == 0) {
                    var5.method2645(125);
                    this.field2922--;
                } else {
                    var5.field7793 = true;
                }
            }
        }
        if (arg1 == null) {
            return;
        }
        for (int var6 = 0; var6 < arg1.length && this.field2922 != 8; var6++) {
            if (!field2919[var6]) {
                class530 var7 = new class530(arg0, arg1[var6], this, this.field2914);
                this.field2916.method2310(var7, -21801);
                this.field2922++;
                field2919[var6] = true;
            }
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIIII)V")
    public final void method1255(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field2931 = arg0;
        this.field2925 = arg1;
        this.field2930 = arg2;
        this.field2924 = arg3;
        this.field2927 = arg4;
    }

    @OriginalMember(owner = "client!vc", name = "e", descriptor = "()V")
    private final void method1256() {
        this.field2920 = false;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(J)V")
    public final void method1257(long arg0) {
        this.field2914 = arg0;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "([Lit;Z)V")
    private final void method1258(class456[] arg0, boolean arg1) {
        for (int var3 = 0; var3 < 8; var3++) {
            field2915[var3] = false;
        }
        label73: for (class343 var4 = (class343) this.field2923.method3072((byte) 107); var4 != null; var4 = (class343) this.field2923.method3066(2)) {
            if (arg0 != null) {
                for (int var7 = 0; var7 < arg0.length; var7++) {
                    if (arg0[var7] == var4.field4730 || arg0[var7].field6671 == var4.field4730) {
                        field2915[var7] = true;
                        var4.method1914(-27077);
                        continue label73;
                    }
                }
            }
            if (!arg1) {
                var4.method2946(-113);
                this.field2926--;
                if (var4.method582(4072)) {
                    var4.method581(4);
                    class504.field7420--;
                }
            }
        }
        if (arg0 == null) {
            return;
        }
        for (int var5 = 0; var5 < arg0.length && this.field2926 != 8; var5++) {
            if (!field2915[var5]) {
                class343 var6 = null;
                if (arg0[var5].method2687(-2775).field5188 == 1 && class504.field7420 < 32) {
                    var6 = new class343(arg0[var5], this);
                    class266.field3627.method245((long) arg0[var5].field6675, (byte) -22, var6);
                    class504.field7420++;
                }
                if (var6 == null) {
                    var6 = new class343(arg0[var5], this);
                }
                this.field2923.method3070(var6, (byte) -122);
                this.field2926++;
                field2915[var5] = true;
            }
        }
    }

    @OriginalMember(owner = "client!vc", name = "f", descriptor = "()V")
    public final void method1259() {
        this.field2929 = true;
    }

    @OriginalMember(owner = "client!vc", name = "g", descriptor = "()Lqb;")
    public final class148 method1260() {
        return this.field2928;
    }

    @OriginalMember(owner = "client!vc", name = "<init>", descriptor = "(I)V")
    public class206(int arg0) {
        class297.field4104.method2310(this, -21801);
        this.field2914 = arg0;
        this.field2917 = arg0;
        this.field2929 = true;
    }
}
