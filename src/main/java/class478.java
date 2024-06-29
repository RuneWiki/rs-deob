import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!au")
public class class478 {

    @OriginalMember(owner = "client!au", name = "l", descriptor = "Lwg;")
    private class58 field6725 = new class58(64);

    @OriginalMember(owner = "client!au", name = "i", descriptor = "Lkr;")
    private class329 field6722;

    @OriginalMember(owner = "client!au", name = "b", descriptor = "Lkr;")
    public class329 field6715;

    @OriginalMember(owner = "client!au", name = "e", descriptor = "I")
    public static int field6718 = 0;

    @OriginalMember(owner = "client!au", name = "f", descriptor = "[[F")
    public static float[][] field6719 = new float[][] { { -0.333333F, -0.333333F, -0.333333F }, { 0.333333F, -0.333333F, -0.333333F }, { -0.333333F, 0.333333F, -0.333333F }, { 0.333333F, 0.333333F, -0.333333F }, { -0.333333F, -0.333333F, 0.333333F }, { 0.333333F, -0.333333F, 0.333333F }, { -0.333333F, 0.333333F, 0.333333F }, { 0.333333F, 0.333333F, 0.333333F } };

    @OriginalMember(owner = "client!au", name = "j", descriptor = "Lim;")
    public static class353 field6723 = new class353(67, 14);

    @OriginalMember(owner = "client!au", name = "a", descriptor = "I")
    public static int field6714;

    @OriginalMember(owner = "client!au", name = "c", descriptor = "I")
    public static int field6716;

    @OriginalMember(owner = "client!au", name = "d", descriptor = "I")
    public static int field6717;

    @OriginalMember(owner = "client!au", name = "g", descriptor = "I")
    public static int field6720;

    @OriginalMember(owner = "client!au", name = "h", descriptor = "I")
    public static int field6721;

    @OriginalMember(owner = "client!au", name = "k", descriptor = "I")
    public static int field6724;

    @OriginalMember(owner = "client!au", name = "m", descriptor = "I")
    public static int field6726;

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(I)V")
    public final void method2706(int arg0) {
        field6724++;
        class58 var2 = this.field6725;
        synchronized (this.field6725) {
            if (arg0 != -1) {
                this.field6715 = null;
            }
            this.field6725.method317((byte) 21);
        }
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(B)V")
    public final void method2707(byte arg0) {
        if (arg0 != 32) {
            this.field6715 = null;
        }
        class58 var2 = this.field6725;
        synchronized (this.field6725) {
            this.field6725.method315(1);
        }
        field6714++;
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "([FIIIIBI)V")
    public static final void method2708(float[] arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
        field6716++;
        if (arg1 > 0 && !class506.method2832(arg1, arg5 + 38)) {
            throw new IllegalArgumentException("");
        } else if (arg6 <= 0 || class506.method2832(arg6, 3)) {
            int var7 = class66.method382(1, arg2);
            int var8 = 0;
            int var9 = arg1 < arg6 ? arg1 : arg6;
            int var10 = arg1 >> 1;
            if (arg5 != -35) {
                field6723 = null;
            }
            int var11 = arg6 >> 1;
            float[] var12 = arg0;
            float[] var13 = new float[var7 * var11 * var10];
            while (true) {
                OpenGL.glTexImage2Df(arg4, var8, arg3, arg1, arg6, 0, arg2, 5126, var12, 0);
                if (var9 <= 1) {
                    return;
                }
                int var14 = arg1 * var7;
                float[] var15 = var13;
                for (int var16 = 0; var16 < var7; var16++) {
                    int var17 = var16;
                    int var18 = var16;
                    int var19 = var16 + var14;
                    for (int var20 = 0; var20 < var11; var20++) {
                        for (int var21 = 0; var21 < var10; var21++) {
                            float var22 = var12[var18];
                            int var23 = var7 + var18;
                            float var24 = var12[var23] + var22;
                            float var25 = var12[var19] + var24;
                            var18 = var7 + var23;
                            int var26 = var7 + var19;
                            float var27 = var12[var26] + var25;
                            var19 = var7 + var26;
                            var13[var17] = var27 * 0.25F;
                            var17 += var7;
                        }
                        var19 += var14;
                        var18 += var14;
                    }
                }
                var13 = var12;
                arg1 = var10;
                var12 = var15;
                arg6 = var11;
                var11 >>= 0x1;
                var9 >>= 0x1;
                var10 >>= 0x1;
                var8++;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(I[Ljq;I)V")
    public static final void method2709(int arg0, class447[] arg1, int arg2) {
        field6721++;
        if (arg2 != 6) {
            method2709(108, null, 112);
        }
        for (int var3 = 0; var3 < arg1.length; var3++) {
            class447 var4 = arg1[var3];
            if (var4 != null && var4.field6244 == arg0 && !client.method3580(var4)) {
                if (var4.field6336 == 0) {
                    method2709(var4.field6229, arg1, 6);
                    if (var4.field6194 != null) {
                        method2709(var4.field6229, var4.field6194, 6);
                    }
                    class496 var5 = (class496) class523.field7289.method3476((long) var4.field6229, (byte) 28);
                    if (var5 != null) {
                        class324.method2009((byte) 87, var5.field6914);
                    }
                }
                if (var4.field6336 == 6 && var4.field6259 != -1) {
                    class320 var6 = class609.field8754.method535(var4.field6259, true);
                    if (var6 != null) {
                        var4.field6212 += class153.field1999;
                        while (var6.field4432[var4.field6184] < var4.field6212) {
                            var4.field6212 -= var6.field4432[var4.field6184];
                            var4.field6184++;
                            if (var4.field6184 >= var6.field4431.length) {
                                var4.field6184 -= var6.field4421;
                                if (var4.field6184 < 0 || var4.field6184 >= var6.field4431.length) {
                                    var4.field6184 = 0;
                                }
                            }
                            var4.field6234 = var4.field6184 + 1;
                            if (var6.field4431.length <= var4.field6234) {
                                var4.field6234 -= var6.field4421;
                                if (var4.field6234 < 0 || var4.field6234 >= var6.field4431.length) {
                                    var4.field6234 = -1;
                                }
                            }
                            class90.method501(var4, -1);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(II)V")
    public final void method2710(int arg0, int arg1) {
        int var3 = -100 / ((-arg0 - 48) / 35);
        field6720++;
        class58 var4 = this.field6725;
        synchronized (this.field6725) {
            this.field6725.method320(arg1, -306674912);
        }
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(Z)V")
    public static void method2711(boolean arg0) {
        if (!arg0) {
            field6723 = null;
            field6719 = null;
        }
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(IB)Lwr;")
    public final class641 method2712(int arg0, byte arg1) {
        field6717++;
        class58 var3 = this.field6725;
        class641 var4;
        synchronized (this.field6725) {
            var4 = (class641) this.field6725.method323((long) arg0, -19814);
        }
        if (var4 != null) {
            return var4;
        }
        int var5 = 28 / ((arg1 - 74) / 46);
        class329 var6 = this.field6722;
        byte[] var7;
        synchronized (this.field6722) {
            var7 = this.field6722.method2054(true, 3, arg0);
        }
        class641 var8 = new class641();
        var8.field9306 = this;
        if (var7 != null) {
            var8.method3702(new class551(var7), -86);
        }
        class58 var9 = this.field6725;
        synchronized (this.field6725) {
            this.field6725.method316((long) arg0, (byte) -113, var8);
            return var8;
        }
    }

    @OriginalMember(owner = "client!au", name = "<init>", descriptor = "(Lg;ILkr;Lkr;)V")
    public class478(class513 arg0, int arg1, class329 arg2, class329 arg3) {
        this.field6722 = arg2;
        this.field6715 = arg3;
        this.field6722.method2064(0, 3);
    }
}
