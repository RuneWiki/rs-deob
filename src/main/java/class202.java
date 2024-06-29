import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tw")
public class class202 {

    @OriginalMember(owner = "client!tw", name = "b", descriptor = "Lof;")
    private class620 field2386 = new class620(64);

    @OriginalMember(owner = "client!tw", name = "l", descriptor = "Lof;")
    public class620 field2396 = new class620(60);

    @OriginalMember(owner = "client!tw", name = "k", descriptor = "Loh;")
    private class404 field2395;

    @OriginalMember(owner = "client!tw", name = "d", descriptor = "Loh;")
    public class404 field2388;

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "Ldh;")
    public static class320 field2385 = new class320(23, 4);

    @OriginalMember(owner = "client!tw", name = "n", descriptor = "Luw;")
    public static class416 field2398 = new class416("WIP", 2);

    @OriginalMember(owner = "client!tw", name = "c", descriptor = "I")
    public static int field2387;

    @OriginalMember(owner = "client!tw", name = "e", descriptor = "I")
    public static int field2389;

    @OriginalMember(owner = "client!tw", name = "f", descriptor = "I")
    public static int field2390;

    @OriginalMember(owner = "client!tw", name = "g", descriptor = "I")
    public static int field2391;

    @OriginalMember(owner = "client!tw", name = "h", descriptor = "I")
    public static int field2392;

    @OriginalMember(owner = "client!tw", name = "i", descriptor = "I")
    public static int field2393;

    @OriginalMember(owner = "client!tw", name = "j", descriptor = "I")
    public static int field2394;

    @OriginalMember(owner = "client!tw", name = "m", descriptor = "I")
    public int field2397;

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "(III)V")
    public static final void method1215(int arg0, int arg1, int arg2) {
        field2387++;
        class47 var3 = class258.method1546(arg1, arg0, (byte) 121);
        var3.method271((byte) 126);
        var3.field507 = arg2;
    }

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "(I)V")
    public static void method1216(int arg0) {
        field2385 = null;
        int var1 = 93 / ((arg0 - 20) / 56);
        field2398 = null;
    }

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "(II)V")
    public final void method1217(int arg0, int arg1) {
        field2389++;
        this.field2397 = arg1;
        if (arg0 > 70) {
            class620 var3 = this.field2396;
            synchronized (this.field2396) {
                this.field2396.method3549(0);
            }
        }
    }

    @OriginalMember(owner = "client!tw", name = "b", descriptor = "(I)V")
    public final void method1218(int arg0) {
        class620 var2 = this.field2386;
        synchronized (this.field2386) {
            this.field2386.method3541(-647);
        }
        field2394++;
        if (arg0 != 60) {
            this.method1219((byte) -62, -108);
        }
        class620 var3 = this.field2396;
        synchronized (this.field2396) {
            this.field2396.method3541(-647);
        }
    }

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "(BI)V")
    public final void method1219(byte arg0, int arg1) {
        field2392++;
        class620 var3 = this.field2386;
        synchronized (this.field2386) {
            this.field2386.method3539((byte) 114, arg1);
        }
        class620 var4 = this.field2396;
        synchronized (this.field2396) {
            this.field2396.method3539((byte) 19, arg1);
        }
        int var5 = -106 / ((-arg0 - 18) / 46);
    }

    @OriginalMember(owner = "client!tw", name = "c", descriptor = "(I)V")
    public final void method1220(int arg0) {
        if (arg0 >= -106) {
            return;
        }
        field2393++;
        class620 var2 = this.field2386;
        synchronized (this.field2386) {
            this.field2386.method3549(0);
        }
        class620 var3 = this.field2396;
        synchronized (this.field2396) {
            this.field2396.method3549(0);
        }
    }

    @OriginalMember(owner = "client!tw", name = "b", descriptor = "(II)Ldj;")
    public final class342 method1221(int arg0, int arg1) {
        field2391++;
        class620 var3 = this.field2386;
        class342 var4;
        synchronized (this.field2386) {
            var4 = (class342) this.field2386.method3538((long) arg1, 0);
        }
        if (var4 != null) {
            return var4;
        }
        class404 var5 = this.field2395;
        byte[] var6;
        synchronized (this.field2395) {
            var6 = this.field2395.method2481(class330.method1973(arg1, -517303320), class676.method3843(arg1, (byte) 121), (byte) 115);
        }
        class342 var7 = new class342();
        var7.field4424 = this;
        if (arg0 != 15719) {
            method1222(-103, (byte) -115, -92, -69, null, -125, null, 0.2211595F, -98, 74, -14);
        }
        var7.field4426 = arg1;
        if (var6 != null) {
            var7.method2033(new class244(var6), (byte) 103);
        }
        class620 var8 = this.field2386;
        synchronized (this.field2386) {
            this.field2386.method3537(arg0 - 15787, (long) arg1, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "(IBII[FI[FFIII)V")
    public static final void method1222(int arg0, byte arg1, int arg2, int arg3, float[] arg4, int arg5, float[] arg6, float arg7, int arg8, int arg9, int arg10) {
        int var11 = arg10 - arg8;
        field2390++;
        if (arg1 >= -94) {
            method1215(97, -124, 30);
        }
        int var12 = arg5 - arg3;
        int var13 = arg0 - arg9;
        float var14 = arg4[2] * (float) var11 + arg4[1] * (float) var12 + arg4[0] * (float) var13;
        float var15 = arg4[5] * (float) var11 + arg4[4] * (float) var12 + arg4[3] * (float) var13;
        float var16 = arg4[8] * (float) var11 + arg4[7] * (float) var12 + arg4[6] * (float) var13;
        float var17 = (float) Math.sqrt((double) (var16 * var16 + var14 * var14 + var15 * var15));
        float var18 = (float) Math.atan2((double) var14, (double) var16) / 6.2831855F + 0.5F;
        float var19 = arg7 + (float) Math.asin((double) (var15 / var17)) / 3.1415927F + 0.5F;
        if (arg2 == 1) {
            float var21 = var18;
            var18 = -var19;
            var19 = var21;
        } else if (arg2 == 2) {
            var18 = -var18;
            var19 = -var19;
        } else if (arg2 == 3) {
            float var20 = var18;
            var18 = var19;
            var19 = -var20;
        }
        arg6[0] = var18;
        arg6[1] = var19;
    }

    @OriginalMember(owner = "client!tw", name = "<init>", descriptor = "(Lnb;ILoh;Loh;)V")
    public class202(class301 arg0, int arg1, class404 arg2, class404 arg3) {
        this.field2395 = arg2;
        this.field2388 = arg3;
        int var5 = this.field2395.method2478((byte) 90) - 1;
        this.field2395.method2482(0, var5);
    }
}
