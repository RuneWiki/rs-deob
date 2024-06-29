import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nga")
public class class510 {

    @OriginalMember(owner = "client!nga", name = "b", descriptor = "Ljh;")
    private class158 field7261;

    @OriginalMember(owner = "client!nga", name = "c", descriptor = "I")
    private int field7262;

    @OriginalMember(owner = "client!nga", name = "v", descriptor = "I")
    private int field7281;

    @OriginalMember(owner = "client!nga", name = "l", descriptor = "Lmp;")
    private class758 field7271;

    @OriginalMember(owner = "client!nga", name = "d", descriptor = "Lqaa;")
    public static class27 field7263 = new class27(33, -1);

    @OriginalMember(owner = "client!nga", name = "q", descriptor = "Lfga;")
    public static class254 field7276 = new class254();

    @OriginalMember(owner = "client!nga", name = "t", descriptor = "I")
    public static int field7279 = -1;

    @OriginalMember(owner = "client!nga", name = "w", descriptor = "[I")
    public static int[] field7282 = new int[5];

    @OriginalMember(owner = "client!nga", name = "u", descriptor = "Lgb;")
    public static class212 field7280 = class458.method2797(-115);

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "I")
    public static int field7260;

    @OriginalMember(owner = "client!nga", name = "e", descriptor = "I")
    public static int field7264;

    @OriginalMember(owner = "client!nga", name = "f", descriptor = "I")
    public static int field7265;

    @OriginalMember(owner = "client!nga", name = "g", descriptor = "I")
    public static int field7266;

    @OriginalMember(owner = "client!nga", name = "h", descriptor = "I")
    public static int field7267;

    @OriginalMember(owner = "client!nga", name = "i", descriptor = "I")
    public static int field7268;

    @OriginalMember(owner = "client!nga", name = "j", descriptor = "I")
    public static int field7269;

    @OriginalMember(owner = "client!nga", name = "k", descriptor = "I")
    public static int field7270;

    @OriginalMember(owner = "client!nga", name = "m", descriptor = "I")
    public static int field7272;

    @OriginalMember(owner = "client!nga", name = "n", descriptor = "I")
    public static int field7273;

    @OriginalMember(owner = "client!nga", name = "o", descriptor = "I")
    public static int field7274;

    @OriginalMember(owner = "client!nga", name = "p", descriptor = "I")
    public static int field7275;

    @OriginalMember(owner = "client!nga", name = "s", descriptor = "I")
    public static int field7278;

    @OriginalMember(owner = "client!nga", name = "r", descriptor = "[Lgj;")
    public static class632[] field7277;

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "(Z)I")
    public final int method3041(boolean arg0) {
        field7270++;
        if (arg0) {
            this.method3047(false, null, 59L);
        }
        return this.field7281;
    }

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "(I)V")
    public static void method3042(int arg0) {
        field7282 = null;
        field7277 = null;
        field7276 = null;
        field7280 = null;
        field7263 = null;
        if (arg0 != 0) {
            method3042(-88);
        }
    }

    @OriginalMember(owner = "client!nga", name = "b", descriptor = "(I)I")
    public final int method3043(int arg0) {
        field7268++;
        if (arg0 < 65) {
            this.method3047(false, null, 37L);
        }
        return this.field7262;
    }

    @OriginalMember(owner = "client!nga", name = "b", descriptor = "(Z)Ljava/lang/Object;")
    public final Object method3044(boolean arg0) {
        field7264++;
        class619 var2 = (class619) this.field7271.method4209(false);
        while (var2 != null) {
            Object var3 = var2.method2001(9);
            if (var3 != null) {
                return var3;
            }
            class619 var4 = var2;
            var2 = (class619) this.field7271.method4207(9356);
            var4.method3617(1);
            var4.method1553(51);
            this.field7281 += var4.field8938;
        }
        if (!arg0) {
            this.method3049(-34, (byte) 53);
        }
        return null;
    }

    @OriginalMember(owner = "client!nga", name = "<init>", descriptor = "(I)V")
    public class510(int arg0) {
        this(arg0, arg0);
    }

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "(IILjava/lang/Object;J)V")
    public final void method3045(int arg0, int arg1, Object arg2, long arg3) {
        if (arg0 <= 12) {
            this.field7281 = -66;
        }
        field7272++;
        if (this.field7262 < arg1) {
            throw new IllegalStateException("s>cs");
        }
        this.method3046(arg3, false);
        this.field7281 -= arg1;
        while (this.field7281 < 0) {
            class619 var7 = (class619) this.field7261.method1200(false);
            this.method3053(var7, 51);
        }
        class308 var6 = new class308(arg2, arg1);
        this.field7271.method4211(var6, (byte) 72, arg3);
        this.field7261.method1203(var6, -101);
        var6.field3211 = 0L;
    }

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "(JZ)V")
    private final void method3046(long arg0, boolean arg1) {
        field7278++;
        if (arg1) {
            field7263 = null;
        }
        class619 var4 = (class619) this.field7271.method4203(true, arg0);
        this.method3053(var4, -112);
    }

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "(ZLjava/lang/Object;J)V")
    public final void method3047(boolean arg0, Object arg1, long arg2) {
        if (!arg0) {
            field7275++;
            this.method3045(52, 1, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!nga", name = "c", descriptor = "(Z)V")
    public final void method3048(boolean arg0) {
        field7260++;
        if (arg0) {
            this.method3049(-79, (byte) -61);
        }
        this.field7261.method1199(arg0);
        this.field7271.method4204((byte) -23);
        this.field7281 = this.field7262;
    }

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "(IB)V")
    public final void method3049(int arg0, byte arg1) {
        if (class594.field8459 != null) {
            for (class619 var3 = (class619) this.field7261.method1196(-119); var3 != null; var3 = (class619) this.field7261.method1204(false)) {
                if (var3.method1999(9)) {
                    if (var3.method2001(9) == null) {
                        var3.method3617(1);
                        var3.method1553(-106);
                        this.field7281 += var3.field8938;
                    }
                } else if (((long) arg0) < (++var3.field3211)) {
                    class619 var4 = class594.field8459.method955(var3, 127);
                    this.field7271.method4211(var4, (byte) 31, var3.field8991);
                    class174.method1272(113, var3, var4);
                    var3.method3617(1);
                    var3.method1553(-111);
                }
            }
        }
        if (arg1 <= 125) {
            this.method3054((byte) 117, 27L);
        }
        field7274++;
    }

    @OriginalMember(owner = "client!nga", name = "d", descriptor = "(Z)V")
    public final void method3050(boolean arg0) {
        field7266++;
        for (class619 var2 = (class619) this.field7261.method1196(-119); var2 != null; var2 = (class619) this.field7261.method1204(false)) {
            if (var2.method1999(9)) {
                var2.method3617(1);
                var2.method1553(-113);
                this.field7281 += var2.field8938;
            }
        }
        if (arg0) {
            this.method3051(-11);
        }
    }

    @OriginalMember(owner = "client!nga", name = "c", descriptor = "(I)Ljava/lang/Object;")
    public final Object method3051(int arg0) {
        field7265++;
        class619 var2 = (class619) this.field7271.method4207(arg0 - 5812);
        while (var2 != null) {
            Object var3 = var2.method2001(9);
            if (var3 != null) {
                return var3;
            }
            class619 var4 = var2;
            var2 = (class619) this.field7271.method4207(9356);
            var4.method3617(arg0 ^ 0x3B41);
            var4.method1553(-124);
            this.field7281 += var4.field8938;
        }
        if (arg0 != 15168) {
            field7277 = null;
        }
        return null;
    }

    @OriginalMember(owner = "client!nga", name = "d", descriptor = "(I)I")
    public final int method3052(int arg0) {
        field7269++;
        int var2 = 0;
        if (arg0 > -57) {
            return -38;
        }
        for (class619 var3 = (class619) this.field7261.method1196(-122); var3 != null; var3 = (class619) this.field7261.method1204(false)) {
            if (!var3.method1999(9)) {
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "(Lof;I)V")
    private final void method3053(class619 arg0, int arg1) {
        int var3 = 26 / ((arg1 + 61) / 47);
        if (arg0 != null) {
            arg0.method3617(1);
            arg0.method1553(99);
            this.field7281 += arg0.field8938;
        }
        field7267++;
    }

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "(BJ)Ljava/lang/Object;")
    public final Object method3054(byte arg0, long arg1) {
        field7273++;
        if (arg0 > -89) {
            return null;
        }
        class619 var4 = (class619) this.field7271.method4203(true, arg1);
        if (var4 == null) {
            return null;
        }
        Object var5 = var4.method2001(9);
        if (var5 == null) {
            var4.method3617(1);
            var4.method1553(-102);
            this.field7281 += var4.field8938;
            return null;
        }
        if (var4.method1999(9)) {
            class308 var6 = new class308(var5, var4.field8938);
            this.field7271.method4211(var6, (byte) 79, var4.field8991);
            this.field7261.method1203(var6, -101);
            var6.field3211 = 0L;
            var4.method3617(1);
            var4.method1553(-113);
        } else {
            this.field7261.method1203(var4, -101);
            var4.field3211 = 0L;
        }
        return var5;
    }

    @OriginalMember(owner = "client!nga", name = "<init>", descriptor = "(II)V")
    public class510(int arg0, int arg1) {
        this.field7261 = new class158();
        this.field7262 = arg0;
        this.field7281 = arg0;
        int var3;
        for (var3 = 1; arg0 > (var3 + var3) && arg1 > var3; var3 += var3) {
        }
        this.field7271 = new class758(var3);
    }
}
