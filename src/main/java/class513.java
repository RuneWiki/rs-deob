import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lda")
public class class513 extends class154 {

    @OriginalMember(owner = "client!lda", name = "q", descriptor = "I")
    public static int field7009 = 0;

    @OriginalMember(owner = "client!lda", name = "r", descriptor = "[[I")
    public static int[][] field7010 = new int[6][];

    @OriginalMember(owner = "client!lda", name = "k", descriptor = "[I")
    public static int[] field7003 = new int[120];

    @OriginalMember(owner = "client!lda", name = "t", descriptor = "[I")
    public static int[] field7012;

    @OriginalMember(owner = "client!lda", name = "u", descriptor = "Lvl;")
    public static class15 field7013;

    @OriginalMember(owner = "client!lda", name = "i", descriptor = "I")
    public static int field7001;

    @OriginalMember(owner = "client!lda", name = "j", descriptor = "I")
    public static int field7002;

    @OriginalMember(owner = "client!lda", name = "m", descriptor = "I")
    public static int field7005;

    @OriginalMember(owner = "client!lda", name = "o", descriptor = "I")
    public static int field7007;

    @OriginalMember(owner = "client!lda", name = "p", descriptor = "J")
    public long field7008;

    @OriginalMember(owner = "client!lda", name = "l", descriptor = "Llda;")
    public class513 field7004;

    @OriginalMember(owner = "client!lda", name = "n", descriptor = "Llda;")
    public class513 field7006;

    @OriginalMember(owner = "client!lda", name = "s", descriptor = "[Lkh;")
    public static class17[] field7011;

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 120; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) ((double) var2 + Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D);
            var0 += var3;
            field7003[var1] = var0 / 4;
        }
        field7012 = new int[4096];
        field7013 = new class15(50, 2);
    }

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "([BZI)Ljava/lang/Object;", line = 5)
    public static final Object method2938(byte[] arg0, boolean arg1, int arg2) {
        field7007++;
        if (arg0 == null) {
            return null;
        }
        if (arg0.length > 136 && !class97.field1566) {
            try {
                class531 var3 = (class531) Class.forName("tw").getDeclaredConstructor().newInstance();
                var3.method1503(arg0, -14);
                return var3;
            } catch (Throwable var4) {
                class97.field1566 = true;
            }
        }
        if (arg2 > -11) {
            method2938(null, false, 122);
        }
        return arg1 ? class106.method915(arg0, 0) : arg0;
    }

    @OriginalMember(owner = "client!lda", name = "b", descriptor = "(I)Z", line = 45)
    public final boolean method2939(int arg0) {
        field7001++;
        if (arg0 != -23829) {
            field7010 = null;
        }
        return this.field7004 != null;
    }

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "(III)Z", line = 68)
    public static final boolean method2940(int arg0, int arg1, int arg2) {
        field7005++;
        if (arg2 >= 1000 && arg0 < 1000) {
            return true;
        } else if (arg2 < 1000 && arg0 < 1000) {
            if (class531.method3014(arg0, false)) {
                return true;
            } else {
                return !class531.method3014(arg2, false);
            }
        } else if (arg2 >= 1000 && arg0 >= 1000) {
            return true;
        } else {
            return arg1 > -91;
        }
    }

    @OriginalMember(owner = "client!lda", name = "c", descriptor = "(I)V", line = 103)
    public static void method2941(int arg0) {
        field7013 = null;
        if (arg0 != 2481) {
            field7013 = null;
        }
        field7010 = null;
        field7011 = null;
        field7003 = null;
        field7012 = null;
    }

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "(Z)V", line = 119)
    public final void method2942(boolean arg0) {
        field7002++;
        if (this.field7004 == null) {
            return;
        }
        this.field7004.field7006 = this.field7006;
        this.field7006.field7004 = this.field7004;
        this.field7006 = null;
        if (!arg0) {
            this.field7004 = null;
        }
    }
}
