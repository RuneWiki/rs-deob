import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jn")
public class class322 {

    @OriginalMember(owner = "client!jn", name = "i", descriptor = "Lbh;")
    private class538 field4148 = new class538(64);

    @OriginalMember(owner = "client!jn", name = "j", descriptor = "Lbh;")
    private class538 field4149 = new class538(100);

    @OriginalMember(owner = "client!jn", name = "b", descriptor = "Lwu;")
    private class557 field4141;

    @OriginalMember(owner = "client!jn", name = "h", descriptor = "[I")
    public static int[] field4147 = new int[1];

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "I")
    public static int field4140;

    @OriginalMember(owner = "client!jn", name = "c", descriptor = "I")
    public static int field4142;

    @OriginalMember(owner = "client!jn", name = "d", descriptor = "I")
    public static int field4143;

    @OriginalMember(owner = "client!jn", name = "e", descriptor = "I")
    public static int field4144;

    @OriginalMember(owner = "client!jn", name = "f", descriptor = "I")
    public static int field4145;

    @OriginalMember(owner = "client!jn", name = "g", descriptor = "I")
    public static int field4146;

    @OriginalMember(owner = "client!jn", name = "k", descriptor = "I")
    public static int field4150;

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(Z)V")
    public final void method1879(boolean arg0) {
        class538 var2 = this.field4148;
        synchronized (this.field4148) {
            this.field4148.method3210(false);
        }
        field4146++;
        class538 var3 = this.field4149;
        synchronized (this.field4149) {
            if (!arg0) {
                this.field4141 = null;
            }
            this.field4149.method3210(!arg0);
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(II)V")
    public final void method1880(int arg0, int arg1) {
        class538 var3 = this.field4148;
        synchronized (this.field4148) {
            this.field4148.method3204((byte) -78, arg0);
        }
        if (arg1 <= 104) {
            this.field4148 = null;
        }
        field4145++;
        class538 var4 = this.field4149;
        synchronized (this.field4149) {
            this.field4149.method3204((byte) 80, arg0);
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(BI)Lec;")
    public final class103 method1881(byte arg0, int arg1) {
        field4150++;
        class538 var3 = this.field4148;
        class103 var4;
        synchronized (this.field4148) {
            var4 = (class103) this.field4148.method3200((long) arg1, arg0 ^ 0x4E41);
        }
        if (var4 != null) {
            return var4;
        }
        if (arg0 != -80) {
            this.field4141 = null;
        }
        class557 var5 = this.field4141;
        byte[] var6;
        synchronized (this.field4141) {
            var6 = this.field4141.method3322(class445.method2653(arg0 - 32, arg1), class185.method1235(arg1, -105), (byte) 84);
        }
        class103 var7 = new class103();
        var7.field1475 = this;
        var7.field1468 = arg1;
        if (var6 != null) {
            var7.method701(82, new class26(var6));
        }
        var7.method693(arg0 ^ 0xFFFFFFB2);
        class538 var8 = this.field4148;
        synchronized (this.field4148) {
            this.field4148.method3199((byte) 78, var7, (long) arg1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(IIIILha;III)V")
    public static final void method1882(int arg0, int arg1, int arg2, int arg3, class545 arg4, int arg5, int arg6, int arg7) {
        field4143++;
        arg4.method3255(arg0, arg6, arg5, arg1, (byte) -7, arg3);
        arg4.method3255(16, arg6 - 2, arg5 - -1, arg2, (byte) -26, arg3 + 1);
        arg4.method3263(arg5 + 1, arg2, (byte) -96, arg0 - 19, arg3 + 18, arg6 - 2);
        if (arg7 != -26918) {
            field4147 = null;
        }
    }

    @OriginalMember(owner = "client!jn", name = "b", descriptor = "(II)Lnea;")
    public final class154 method1883(int arg0, int arg1) {
        field4144++;
        int var3 = 45 / ((arg0 + 36) / 56);
        class538 var4 = this.field4149;
        synchronized (this.field4149) {
            class154 var5 = (class154) this.field4149.method3200((long) arg1, -19983);
            if (var5 == null) {
                var5 = new class154(arg1);
                this.field4149.method3199((byte) 78, var5, (long) arg1);
            }
            return var5.method978(false) ? var5 : null;
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(B)V")
    public final void method1884(byte arg0) {
        field4140++;
        int var2 = -71 / ((arg0 - 44) / 45);
        class538 var3 = this.field4148;
        synchronized (this.field4148) {
            this.field4148.method3202((byte) 127);
        }
        class538 var4 = this.field4149;
        synchronized (this.field4149) {
            this.field4149.method3202((byte) 127);
        }
    }

    @OriginalMember(owner = "client!jn", name = "b", descriptor = "(B)V")
    public static void method1885(byte arg0) {
        int var1 = -76 / ((arg0 - 13) / 61);
        field4147 = null;
    }

    @OriginalMember(owner = "client!jn", name = "<init>", descriptor = "(Lwj;ILwu;Lwu;Lwu;)V")
    public class322(class121 arg0, int arg1, class557 arg2, class557 arg3, class557 arg4) {
        this.field4141 = arg2;
        if (this.field4141 != null) {
            int var6 = this.field4141.method3341((byte) -77) - 1;
            this.field4141.method3333(var6, 3443);
        }
        class365.method2048((byte) -121, 2, arg3, arg4);
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(IIIBII[F)V")
    public static final void method1886(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, float[] arg6) {
        field4142++;
        if (arg4 > 0 && !class447.method2664(0, arg4)) {
            throw new IllegalArgumentException("");
        } else if (arg0 <= 0 || class447.method2664(0, arg0)) {
            int var7 = class162.method1011((byte) 114, arg5);
            if (arg3 >= 103) {
                int var8 = 0;
                int var9 = arg4 < arg0 ? arg4 : arg0;
                int var10 = arg4 >> 1;
                int var11 = arg0 >> 1;
                float[] var12 = arg6;
                float[] var13 = new float[var10 * var11 * var7];
                while (true) {
                    OpenGL.glTexImage2Df(arg1, var8, arg2, arg4, arg0, 0, arg5, 5126, var12, 0);
                    if (var9 <= 1) {
                        return;
                    }
                    int var14 = arg4 * var7;
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
                                var13[var17] = var27 * 0.25F;
                                var19 = var7 + var26;
                                var17 += var7;
                            }
                            var19 += var14;
                            var18 += var14;
                        }
                    }
                    var13 = var12;
                    arg0 = var11;
                    arg4 = var10;
                    var12 = var15;
                    var9 >>= 0x1;
                    var8++;
                    var10 >>= 0x1;
                    var11 >>= 0x1;
                }
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }
}
