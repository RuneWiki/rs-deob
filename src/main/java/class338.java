import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bfa")
public class class338 {

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "Lmq;")
    private class472 field4481 = new class472(64);

    @OriginalMember(owner = "client!bfa", name = "p", descriptor = "Lmq;")
    public class472 field4496 = new class472(50);

    @OriginalMember(owner = "client!bfa", name = "q", descriptor = "Lmq;")
    public class472 field4497 = new class472(5);

    @OriginalMember(owner = "client!bfa", name = "m", descriptor = "Z")
    public boolean field4493;

    @OriginalMember(owner = "client!bfa", name = "k", descriptor = "Ljn;")
    public class668 field4491;

    @OriginalMember(owner = "client!bfa", name = "b", descriptor = "Ljn;")
    private class668 field4482;

    @OriginalMember(owner = "client!bfa", name = "j", descriptor = "Ler;")
    public class90 field4490;

    @OriginalMember(owner = "client!bfa", name = "i", descriptor = "[C")
    private static char[] field4489 = new char[64];

    @OriginalMember(owner = "client!bfa", name = "c", descriptor = "I")
    public static int field4483;

    @OriginalMember(owner = "client!bfa", name = "d", descriptor = "I")
    public static int field4484;

    @OriginalMember(owner = "client!bfa", name = "e", descriptor = "I")
    public static int field4485;

    @OriginalMember(owner = "client!bfa", name = "f", descriptor = "I")
    public static int field4486;

    @OriginalMember(owner = "client!bfa", name = "g", descriptor = "I")
    public static int field4487;

    @OriginalMember(owner = "client!bfa", name = "h", descriptor = "I")
    public static int field4488;

    @OriginalMember(owner = "client!bfa", name = "l", descriptor = "I")
    public static int field4492;

    @OriginalMember(owner = "client!bfa", name = "n", descriptor = "I")
    public static int field4494;

    @OriginalMember(owner = "client!bfa", name = "o", descriptor = "I")
    public static int field4495;

    @OriginalMember(owner = "client!bfa", name = "r", descriptor = "I")
    public int field4498;

    static {
        for (int var0 = 0; var0 < 26; var0++) {
            field4489[var0] = (char) (var0 + 65);
        }
        for (int var1 = 26; var1 < 52; var1++) {
            field4489[var1] = (char) (var1 + 97 - 26);
        }
        for (int var2 = 52; var2 < 62; var2++) {
            field4489[var2] = (char) (var2 - 4);
        }
        field4489[63] = '/';
        field4489[62] = '+';
    }

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "(F[FIZIIIIIFI)V", line = 3)
    public static final void method1947(float arg0, float[] arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, int arg8, float arg9, int arg10) {
        int var11 = arg5 - arg6;
        field4488++;
        if (arg3) {
            field4489 = null;
        }
        int var12 = arg8 - arg4;
        int var13 = arg7 - arg2;
        float var14 = arg1[2] * (float) var12 + arg1[1] * (float) var13 + arg1[0] * (float) var11;
        float var15 = arg1[5] * (float) var12 + arg1[3] * (float) var11 + arg1[4] * (float) var13;
        float var16 = arg1[8] * (float) var12 + arg1[7] * (float) var13 + arg1[6] * (float) var11;
        float var17 = (float) Math.atan2((double) var14, (double) var16) / 6.2831855F + 0.5F;
        if (arg0 != 1.0F) {
            var17 = arg0 * var17;
        }
        float var18 = var15 + arg9 + 0.5F;
        if (arg10 == 1) {
            float var19 = var17;
            var17 = -var18;
            var18 = var19;
        } else if (arg10 == 2) {
            var18 = -var18;
            var17 = -var17;
        } else if (arg10 == 3) {
            float var20 = var17;
            var17 = var18;
            var18 = -var20;
        }
        class286.field3870 = var18;
        class177.field2181 = var17;
    }

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "(B)V", line = 62)
    public static void method1948(byte arg0) {
        if (arg0 == 123) {
            field4489 = null;
        }
    }

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "(II)Lrb;", line = 72)
    public final class323 method1949(int arg0, int arg1) {
        field4484++;
        class472 var3 = this.field4481;
        class323 var4;
        synchronized (this.field4481) {
            var4 = (class323) this.field4481.method2766(-121, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class668 var5 = this.field4482;
        byte[] var6;
        synchronized (this.field4482) {
            var6 = this.field4482.method3800(class56.method585(-1, arg1), class362.method2063((byte) -128, arg1), (byte) -92);
        }
        class323 var7 = new class323();
        var7.field4328 = arg1;
        var7.field4319 = this;
        if (var6 != null) {
            var7.method1882(4096, new class389(var6));
        }
        var7.method1874(76);
        class472 var8 = this.field4481;
        synchronized (this.field4481) {
            this.field4481.method2772(var7, true, (long) arg1);
        }
        int var9 = -68 / ((arg0 - 81) / 41);
        return var7;
    }

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "(IZ)V", line = 105)
    public final void method1950(int arg0, boolean arg1) {
        class472 var3 = this.field4481;
        synchronized (this.field4481) {
            this.field4481.method2777(arg0, 65);
        }
        field4483++;
        if (arg1) {
            this.field4490 = null;
        }
        class472 var4 = this.field4496;
        synchronized (this.field4496) {
            this.field4496.method2777(arg0, 94);
        }
        class472 var5 = this.field4497;
        synchronized (this.field4497) {
            this.field4497.method2777(arg0, 38);
        }
    }

    @OriginalMember(owner = "client!bfa", name = "b", descriptor = "(B)V", line = 128)
    public final void method1951(byte arg0) {
        field4486++;
        class472 var2 = this.field4496;
        synchronized (this.field4496) {
            this.field4496.method2776(false);
        }
        class472 var3 = this.field4497;
        synchronized (this.field4497) {
            this.field4497.method2776(false);
            int var4 = 50 / ((15 - arg0) / 59);
        }
    }

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "(I)V", line = 143)
    public final void method1952(int arg0) {
        field4485++;
        class472 var2 = this.field4481;
        synchronized (this.field4481) {
            if (arg0 <= 15) {
                this.method1956(44, true);
            }
            this.field4481.method2778((byte) 112);
        }
        class472 var3 = this.field4496;
        synchronized (this.field4496) {
            this.field4496.method2778((byte) 119);
        }
        class472 var4 = this.field4497;
        synchronized (this.field4497) {
            this.field4497.method2778((byte) 107);
        }
    }

    @OriginalMember(owner = "client!bfa", name = "b", descriptor = "(I)V", line = 162)
    public final void method1953(int arg0) {
        class472 var2 = this.field4481;
        synchronized (this.field4481) {
            this.field4481.method2776(false);
        }
        field4487++;
        if (arg0 <= 79) {
            return;
        }
        class472 var3 = this.field4496;
        synchronized (this.field4496) {
            this.field4496.method2776(false);
        }
        class472 var4 = this.field4497;
        synchronized (this.field4497) {
            this.field4497.method2776(false);
        }
    }

    @OriginalMember(owner = "client!bfa", name = "b", descriptor = "(II)V", line = 182)
    public final void method1954(int arg0, int arg1) {
        field4495++;
        this.field4498 = arg1;
        if (arg0 != -4) {
            return;
        }
        class472 var3 = this.field4496;
        synchronized (this.field4496) {
            this.field4496.method2776(false);
        }
        class472 var4 = this.field4497;
        synchronized (this.field4497) {
            this.field4497.method2776(false);
        }
    }

    @OriginalMember(owner = "client!bfa", name = "c", descriptor = "(I)V", line = 201)
    public static final void method1955(int arg0) {
        if (arg0 != 43) {
            method1955(48);
        }
        class172.field2099 = -1;
        class524.field7695 = null;
        field4492++;
    }

    @OriginalMember(owner = "client!bfa", name = "b", descriptor = "(IZ)V", line = 214)
    public final void method1956(int arg0, boolean arg1) {
        field4494++;
        if (this.field4493 == arg1) {
            return;
        }
        this.field4493 = arg1;
        this.method1953(arg0 ^ 0x79);
        if (arg0 != 8) {
            this.field4482 = null;
        }
    }

    @OriginalMember(owner = "client!bfa", name = "<init>", descriptor = "(Ler;IZLjn;Ljn;)V", line = 271)
    public class338(class90 arg0, int arg1, boolean arg2, class668 arg3, class668 arg4) {
        this.field4493 = arg2;
        this.field4491 = arg4;
        this.field4482 = arg3;
        this.field4490 = arg0;
        if (this.field4482 != null) {
            int var6 = this.field4482.method3779(5) - 1;
            this.field4482.method3805(var6, false);
        }
    }
}
