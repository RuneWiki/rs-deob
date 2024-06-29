import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!su")
public class class486 {

    @OriginalMember(owner = "client!su", name = "h", descriptor = "Lmb;")
    private class383 field6917 = new class383();

    @OriginalMember(owner = "client!su", name = "k", descriptor = "Ljava/lang/String;")
    public String field6920;

    @OriginalMember(owner = "client!su", name = "i", descriptor = "[Z")
    public static boolean[] field6918 = new boolean[8];

    @OriginalMember(owner = "client!su", name = "a", descriptor = "I")
    public static int field6910;

    @OriginalMember(owner = "client!su", name = "b", descriptor = "I")
    public static int field6911;

    @OriginalMember(owner = "client!su", name = "c", descriptor = "I")
    public static int field6912;

    @OriginalMember(owner = "client!su", name = "d", descriptor = "I")
    public static int field6913;

    @OriginalMember(owner = "client!su", name = "e", descriptor = "I")
    public static int field6914;

    @OriginalMember(owner = "client!su", name = "f", descriptor = "I")
    public static int field6915;

    @OriginalMember(owner = "client!su", name = "j", descriptor = "I")
    public static int field6919;

    @OriginalMember(owner = "client!su", name = "l", descriptor = "I")
    public static int field6921;

    @OriginalMember(owner = "client!su", name = "m", descriptor = "I")
    private volatile int field6922;

    @OriginalMember(owner = "client!su", name = "n", descriptor = "Lgq;")
    private class706 field6923;

    @OriginalMember(owner = "client!su", name = "g", descriptor = "[I")
    public static int[] field6916;

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(Lcaa;I)V")
    public final void method2773(class538 arg0, int arg1) {
        arg0.field7898 = true;
        field6915++;
        class383 var3 = this.field6917;
        synchronized (this.field6917) {
            this.field6917.method2368(0, arg0);
            this.field6922++;
            int var4 = -20 / ((arg1 - 42) / 39);
        }
        if (this.field6923 != null) {
            class706 var5 = this.field6923;
            synchronized (this.field6923) {
                this.field6923.notify();
            }
        }
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(Lgq;I)V")
    public final void method2774(class706 arg0, int arg1) {
        field6910++;
        this.field6923 = arg0;
        if (arg1 <= 35) {
            method2776(21);
        }
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(Lrh;B)V")
    public final void method2775(class638 arg0, byte arg1) {
        class383 var3 = this.field6917;
        synchronized (this.field6917) {
            if (arg1 != -94) {
                return;
            }
            this.field6917.method2368(0, arg0);
            this.field6922++;
        }
        field6911++;
        if (this.field6923 != null) {
            class706 var4 = this.field6923;
            synchronized (this.field6923) {
                this.field6923.notify();
            }
        }
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(I)V")
    public static void method2776(int arg0) {
        field6916 = null;
        if (arg0 < 123) {
            method2776(59);
        }
        field6918 = null;
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(IIIIFIII[FI)V")
    public static final void method2777(int arg0, int arg1, int arg2, int arg3, float arg4, int arg5, int arg6, int arg7, float[] arg8, int arg9) {
        int var10 = arg3 - arg2;
        int var11 = arg5 - arg1;
        int var12 = arg6 - arg0;
        field6914++;
        float var13 = arg8[2] * (float) var10 + arg8[0] * (float) var12 + arg8[1] * (float) var11;
        float var14 = arg8[5] * (float) var10 + arg8[arg9] * (float) var12 + arg8[4] * (float) var11;
        float var15 = arg8[8] * (float) var10 + arg8[7] * (float) var11 + arg8[6] * (float) var12;
        float var16 = (float) Math.sqrt((double) (var15 * var15 + var13 * var13 + var14 * var14));
        float var17 = (float) Math.atan2((double) var13, (double) var15) / 6.2831855F + 0.5F;
        float var18 = (float) Math.asin((double) (var14 / var16)) / 3.1415927F + arg4 + 0.5F;
        if (arg7 == 1) {
            float var19 = var17;
            var17 = -var18;
            var18 = var19;
        } else if (arg7 == 2) {
            var18 = -var18;
            var17 = -var17;
        } else if (arg7 == 3) {
            float var20 = var17;
            var17 = var18;
            var18 = -var20;
        }
        class268.field3513 = var17;
        class481.field6883 = var18;
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(Z)Z")
    public final boolean method2778(boolean arg0) {
        field6912++;
        if (arg0) {
            return this.field6922 == 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!su", name = "b", descriptor = "(I)Lmm;")
    public final class50 method2779(int arg0) {
        field6919++;
        Object var2 = null;
        class383 var3 = this.field6917;
        class50 var4;
        synchronized (this.field6917) {
            var4 = this.field6917.method2370(-26173);
            var4.method300((byte) 61);
            this.field6922--;
        }
        if (arg0 != 2) {
            method2776(84);
        }
        return var4;
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(B)V")
    public static final void method2780(byte arg0) {
        class94.field1450.method1995((byte) -123);
        if (arg0 != 124) {
            field6916 = null;
        }
        field6921++;
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(Lcaa;Z)V")
    public final void method2781(class538 arg0, boolean arg1) {
        arg0.field7898 = false;
        if (!arg1) {
            field6918 = null;
        }
        field6913++;
        class383 var3 = this.field6917;
        synchronized (this.field6917) {
            this.field6917.method2368(0, arg0);
            this.field6922++;
        }
        if (this.field6923 != null) {
            class706 var4 = this.field6923;
            synchronized (this.field6923) {
                this.field6923.notify();
            }
        }
    }

    @OriginalMember(owner = "client!su", name = "<init>", descriptor = "(Ljava/lang/String;)V")
    public class486(String arg0) {
        this.field6920 = arg0;
    }
}
