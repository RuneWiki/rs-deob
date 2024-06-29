import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class574 {

    @OriginalMember(owner = "client!hf", name = "o", descriptor = "Lqc;")
    private class325 field8472 = new class325(64);

    @OriginalMember(owner = "client!hf", name = "v", descriptor = "Lqc;")
    public class325 field8479 = new class325(50);

    @OriginalMember(owner = "client!hf", name = "w", descriptor = "Lgm;")
    public class127 field8480 = new class127(250);

    @OriginalMember(owner = "client!hf", name = "x", descriptor = "Lme;")
    private class95 field8481 = new class95();

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "Ldda;")
    private class597 field8459;

    @OriginalMember(owner = "client!hf", name = "z", descriptor = "Lrg;")
    private class563 field8483;

    @OriginalMember(owner = "client!hf", name = "t", descriptor = "Z")
    private boolean field8477;

    @OriginalMember(owner = "client!hf", name = "s", descriptor = "I")
    public int field8476;

    @OriginalMember(owner = "client!hf", name = "j", descriptor = "Ldda;")
    public class597 field8467;

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "I")
    public int field8460;

    @OriginalMember(owner = "client!hf", name = "A", descriptor = "[Ljava/lang/String;")
    private String[] field8484;

    @OriginalMember(owner = "client!hf", name = "y", descriptor = "[Ljava/lang/String;")
    private String[] field8482;

    @OriginalMember(owner = "client!hf", name = "k", descriptor = "Lnj;")
    public static class487 field8468 = new class487("skill: ", "Fertigkeit: ", "compétence ", "habilidade: ");

    @OriginalMember(owner = "client!hf", name = "n", descriptor = "J")
    public static long field8471 = 20000000L;

    @OriginalMember(owner = "client!hf", name = "u", descriptor = "I")
    public static int field8478 = 0;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "I")
    public static int field8458;

    @OriginalMember(owner = "client!hf", name = "d", descriptor = "I")
    public static int field8461;

    @OriginalMember(owner = "client!hf", name = "e", descriptor = "I")
    public static int field8462;

    @OriginalMember(owner = "client!hf", name = "f", descriptor = "I")
    public static int field8463;

    @OriginalMember(owner = "client!hf", name = "g", descriptor = "I")
    public static int field8464;

    @OriginalMember(owner = "client!hf", name = "h", descriptor = "I")
    public static int field8465;

    @OriginalMember(owner = "client!hf", name = "i", descriptor = "I")
    public static int field8466;

    @OriginalMember(owner = "client!hf", name = "l", descriptor = "I")
    public static int field8469;

    @OriginalMember(owner = "client!hf", name = "m", descriptor = "I")
    public static int field8470;

    @OriginalMember(owner = "client!hf", name = "p", descriptor = "I")
    public static int field8473;

    @OriginalMember(owner = "client!hf", name = "q", descriptor = "I")
    public static int field8474;

    @OriginalMember(owner = "client!hf", name = "r", descriptor = "I")
    public static int field8475;

    @OriginalMember(owner = "client!hf", name = "B", descriptor = "I")
    public int field8485;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(I)V")
    public final void method3356(int arg0) {
        field8470++;
        class325 var2 = this.field8479;
        synchronized (this.field8479) {
            if (arg0 != 1) {
                this.method3356(72);
            }
            this.field8479.method2037(true);
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IB)Lvk;")
    public final class414 method3357(int arg0, byte arg1) {
        field8463++;
        class325 var3 = this.field8472;
        class414 var4;
        synchronized (this.field8472) {
            var4 = (class414) this.field8472.method2025((long) arg0, 2);
        }
        if (var4 != null) {
            return var4;
        }
        class597 var5 = this.field8459;
        byte[] var6;
        synchronized (this.field8459) {
            var6 = this.field8459.method3486((byte) -124, class169.method1077(arg0, 100), class121.method737((byte) 57, arg0));
        }
        class414 var7 = new class414();
        var7.field5911 = this;
        var7.field5909 = arg0;
        var7.field5889 = new String[] { null, null, class644.field9348.method2953(3181, this.field8476), null, null };
        var7.field5951 = new String[] { null, null, null, null, class584.field8672.method2953(3181, this.field8476) };
        if (var6 != null) {
            var7.method2474(new class428(var6), false);
        }
        var7.method2464(5);
        if (arg1 > -39) {
            this.field8476 = 42;
        }
        if (var7.field5928 != -1) {
            var7.method2461(this.method3357(var7.field5962, (byte) -92), this.method3357(var7.field5928, (byte) -122), 0);
        }
        if (var7.field5929 != -1) {
            var7.method2463(this.method3357(var7.field5929, (byte) -103), this.method3357(var7.field5944, (byte) -115), 85);
        }
        if (!this.field8477 && var7.field5925) {
            var7.field5900 = class235.field3445.method2953(3181, this.field8476);
            var7.field5965 = null;
            var7.field5916 = false;
            var7.field5951 = this.field8482;
            var7.field5889 = this.field8484;
            var7.field5945 = 0;
            if (var7.field5902 != null) {
                boolean var8 = false;
                for (class496 var9 = var7.field5902.method1331(-1925); var9 != null; var9 = var7.field5902.method1340((byte) 52)) {
                    class173 var10 = this.field8483.method3290((int) var9.field7465, 30883);
                    if (var10.field2337) {
                        var9.method2997(1);
                    } else {
                        var8 = true;
                    }
                }
                if (!var8) {
                    var7.field5902 = null;
                }
            }
        }
        class325 var11 = this.field8472;
        synchronized (this.field8472) {
            this.field8472.method2029(false, var7, (long) arg0);
            return var7;
        }
    }

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "(I)V")
    public final void method3358(int arg0) {
        if (arg0 != 27740) {
            return;
        }
        field8462++;
        class325 var2 = this.field8472;
        synchronized (this.field8472) {
            this.field8472.method2024((byte) -106);
        }
        class325 var3 = this.field8479;
        synchronized (this.field8479) {
            this.field8479.method2024((byte) -116);
        }
        class127 var4 = this.field8480;
        synchronized (this.field8480) {
            this.field8480.method784(59);
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(Lqa;ILjk;ILra;ZIILqa;IIZ)Lha;")
    public final class116 method3359(class167 arg0, int arg1, class170 arg2, int arg3, class262 arg4, boolean arg5, int arg6, int arg7, class167 arg8, int arg9, int arg10, boolean arg11) {
        field8465++;
        class116 var13 = this.method3364(arg0, arg7, arg9, arg1, arg10, arg6, -6728, arg2);
        if (var13 != null) {
            return var13;
        }
        class414 var14 = this.method3357(arg7, (byte) -46);
        if (arg9 > 1 && var14.field5964 != null) {
            int var15 = -1;
            for (int var16 = 0; var16 < 10; var16++) {
                if (arg9 >= var14.field5937[var16] && var14.field5937[var16] != 0) {
                    var15 = var14.field5964[var16];
                }
            }
            if (var15 != -1) {
                var14 = this.method3357(var15, (byte) -79);
            }
        }
        int[] var17 = var14.method2456(arg9, 36, arg10, arg2, arg8, arg5, arg6, arg4, arg0, arg1);
        if (arg3 != 0) {
            return null;
        } else if (var17 == null) {
            return null;
        } else {
            class116 var18;
            if (arg11) {
                var18 = arg8.method982(var17, 0, 36, 36, 32);
            } else {
                var18 = arg0.method982(var17, 0, 36, 36, 32);
            }
            if (!arg11) {
                class95 var19 = new class95();
                var19.field1175 = arg2 != null;
                var19.field1180 = arg0.field2264;
                var19.field1178 = arg6;
                var19.field1176 = arg10;
                var19.field1177 = arg1;
                var19.field1174 = arg9;
                var19.field1173 = arg7;
                this.field8480.method783(var18, var19, -30708);
            }
            return var18;
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IZ)V")
    public final void method3360(int arg0, boolean arg1) {
        this.field8485 = arg0;
        field8473++;
        class325 var3 = this.field8479;
        synchronized (this.field8479) {
            this.field8479.method2037(true);
            if (arg1) {
                this.method3362(true, false);
            }
        }
    }

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "(I)V")
    public final void method3361(int arg0) {
        if (arg0 != 0) {
            return;
        }
        field8466++;
        class127 var2 = this.field8480;
        synchronized (this.field8480) {
            this.field8480.method782(true);
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(ZZ)V")
    public final void method3362(boolean arg0, boolean arg1) {
        field8464++;
        if (this.field8477 != arg0 && arg1) {
            this.field8477 = arg0;
            this.method3366(-105);
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(ZI)V")
    public final void method3363(boolean arg0, int arg1) {
        field8475++;
        class325 var3 = this.field8472;
        synchronized (this.field8472) {
            this.field8472.method2028(arg1, true);
        }
        class325 var4 = this.field8479;
        synchronized (this.field8479) {
            this.field8479.method2028(arg1, true);
            if (arg0) {
                this.method3364(null, -52, 26, 65, -87, 105, 4, null);
            }
        }
        class127 var5 = this.field8480;
        synchronized (this.field8480) {
            this.field8480.method781(arg1, (byte) 124);
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(Lqa;IIIIIILjk;)Lha;")
    public final class116 method3364(class167 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class170 arg7) {
        this.field8481.field1176 = arg4;
        this.field8481.field1178 = arg5;
        this.field8481.field1177 = arg3;
        this.field8481.field1180 = arg0.field2264;
        this.field8481.field1175 = arg7 != null;
        if (arg6 == -6728) {
            field8474++;
            this.field8481.field1173 = arg1;
            this.field8481.field1174 = arg2;
            return (class116) this.field8480.method787(this.field8481, 7878);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!hf", name = "d", descriptor = "(I)V")
    public static final void method3365(int arg0) {
        class221.field3268.field6221 = 0;
        field8458++;
        class155.field1984 = null;
        class425.field6072 = 0;
        class135.field1794 = null;
        class127.field1686 = null;
        class260.field3820 = null;
        class285.field4194 = 0;
        class223.field3280 = 0;
        class271.field4010.field6221 = 0;
        class414.method2471((byte) 126);
        class221.method1454((byte) -101);
        for (int var1 = 0; var1 < 2048; var1++) {
            class383.field5604[var1] = null;
        }
        class239.field3493 = null;
        int var2 = 0;
        if (arg0 > -23) {
            field8471 = -69L;
        }
        while (var2 < class350.field5086) {
            class383 var4 = class579.field8530[var2].field3443;
            if (var4 != null) {
                var4.field1037 = -1;
            }
            var2++;
        }
        class536.method3153(39);
        class287.field4232 = 1;
        class463.method2749(1, 9);
        for (int var3 = 0; var3 < 100; var3++) {
            class587.field8718[var3] = true;
        }
        class197.method1271((byte) -81);
        class68.field777 = null;
        class502.field7510 = 0L;
    }

    @OriginalMember(owner = "client!hf", name = "e", descriptor = "(I)V")
    public final void method3366(int arg0) {
        class325 var2 = this.field8472;
        synchronized (this.field8472) {
            this.field8472.method2037(true);
        }
        if (arg0 >= -59) {
            return;
        }
        field8461++;
        class325 var3 = this.field8479;
        synchronized (this.field8479) {
            this.field8479.method2037(true);
        }
        class127 var4 = this.field8480;
        synchronized (this.field8480) {
            this.field8480.method782(true);
        }
    }

    @OriginalMember(owner = "client!hf", name = "f", descriptor = "(I)V")
    public static void method3367(int arg0) {
        if (arg0 < 73) {
            field8471 = 36L;
        }
        field8468 = null;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(Z)V")
    public static final void method3368(boolean arg0) {
        class542.field8105.method1257((byte) 85);
        field8469++;
        class350.field5071.method637((byte) 90);
        class621.field9076.method3097(3);
        class110.field1401.setBackground(Color.black);
        class500.field7491 = -1;
        class542.field8105 = class261.method1661(class110.field1401, (byte) -125);
        class350.field5071 = class317.method1995(arg0, (byte) 56, class110.field1401);
    }

    @OriginalMember(owner = "client!hf", name = "<init>", descriptor = "(Loda;IZLrg;Ldda;Ldda;)V")
    public class574(class559 arg0, int arg1, boolean arg2, class563 arg3, class597 arg4, class597 arg5) {
        this.field8459 = arg4;
        this.field8483 = arg3;
        this.field8477 = arg2;
        this.field8476 = arg1;
        this.field8467 = arg5;
        if (this.field8459 == null) {
            this.field8460 = 0;
        } else {
            int var7 = this.field8459.method3477(false) - 1;
            this.field8460 = this.field8459.method3462(var7, 40) + var7 * 256;
        }
        this.field8484 = new String[] { null, null, class644.field9348.method2953(3181, this.field8476), null, null };
        this.field8482 = new String[] { null, null, null, null, class584.field8672.method2953(3181, this.field8476) };
    }
}
