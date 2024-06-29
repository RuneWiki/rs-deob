import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ol")
public class class388 {

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "[I")
    public static int[] field4969 = new int[5];

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "[Lah;")
    public static class249[] field4970 = new class249[35];

    @OriginalMember(owner = "client!ol", name = "i", descriptor = "Z")
    public static boolean field4977 = false;

    @OriginalMember(owner = "client!ol", name = "d", descriptor = "[I")
    public static int[] field4972 = new int[5];

    @OriginalMember(owner = "client!ol", name = "j", descriptor = "[[Z")
    public static boolean[][] field4978 = new boolean[][] { { true, true, true, true, true, true, true, true, true, true, true, true, true }, { true, true, true, false, false, false, true, true, false, false, false, false, true }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, true, false, false, false, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { false, true, true, true, true, true, true, true, false, false, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, true, true, false, false, false, false, false, false, false, true, true, false }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13] };

    @OriginalMember(owner = "client!ol", name = "e", descriptor = "I")
    public static int field4973;

    @OriginalMember(owner = "client!ol", name = "f", descriptor = "I")
    public static int field4974;

    @OriginalMember(owner = "client!ol", name = "g", descriptor = "I")
    public static int field4975;

    @OriginalMember(owner = "client!ol", name = "h", descriptor = "I")
    public static int field4976;

    @OriginalMember(owner = "client!ol", name = "k", descriptor = "I")
    public static int field4979;

    @OriginalMember(owner = "client!ol", name = "l", descriptor = "I")
    public static int field4980;

    @OriginalMember(owner = "client!ol", name = "m", descriptor = "I")
    public static int field4981;

    @OriginalMember(owner = "client!ol", name = "c", descriptor = "Lcga;")
    public static class384 field4971;

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(Lega;I)V")
    public static final void method2218(class184 arg0, int arg1) {
        field4979++;
        if (arg1 < 113) {
            return;
        }
        arg0.field2363 = false;
        if (arg0.field2361 != null) {
            arg0.field2361.field4154 = 0;
        }
        for (class184 var2 = arg0.method997(); var2 != null; var2 = arg0.method1005()) {
            method2218(var2, 127);
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(Ltc;I)Ltc;")
    public static final class477 method2219(class477 arg0, int arg1) {
        field4976++;
        class477 var2 = client.method700(arg0);
        if (arg1 == 9563) {
            if (var2 == null) {
                var2 = arg0.field6230;
            }
            return var2;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(B)V")
    public static void method2220(byte arg0) {
        field4969 = null;
        int var1 = 76 % ((arg0 - 53) / 58);
        field4972 = null;
        field4978 = null;
        field4971 = null;
        field4970 = null;
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(IB)V")
    public static final void method2221(int arg0, byte arg1) {
        field4981++;
        if (!class152.method1106(99, arg0)) {
            return;
        }
        class477[] var2 = class322.field4179[arg0];
        if (arg1 != -50) {
            return;
        }
        for (int var3 = 0; var3 < var2.length; var3++) {
            class477 var4 = var2[var3];
            if (var4 != null) {
                var4.field6267 = 1;
                var4.field6301 = 0;
                var4.field6261 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!ol", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field4975++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "([BII)[B")
    public static final byte[] method2222(byte[] arg0, int arg1, int arg2) {
        field4974++;
        byte[] var3 = new byte[arg1];
        class443.method2514(arg0, 0, var3, 0, arg1);
        if (arg2 < 8) {
            field4970 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(II)I")
    public static final int method2223(int arg0, int arg1) {
        field4973++;
        if (arg1 != 255) {
            method2218(null, -82);
        }
        return arg0 & 0xFF;
    }

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "(B)V")
    public static final void method2224(byte arg0) {
        field4980++;
        if (class505.field6642 != null) {
            return;
        }
        class505.field6642 = new int[65536];
        double var1 = Math.random() * 0.03D + 0.7D - 0.015D;
        if (arg0 < 49) {
            return;
        }
        for (int var3 = 0; var3 < 65536; var3++) {
            double var4 = (double) ((var3 & 0xFF89) >> 10) / 64.0D + 0.0078125D;
            double var6 = (double) (var3 >> 7 & 0x7) / 8.0D + 0.0625D;
            double var8 = (double) (var3 & 0x7F) / 128.0D;
            double var10 = var8;
            double var12 = var8;
            double var14 = var8;
            if (var6 != 0.0D) {
                double var16;
                if (var8 < 0.5D) {
                    var16 = (var6 + 1.0D) * var8;
                } else {
                    var16 = var6 + var8 - (var6 * var8);
                }
                double var18 = var8 * 2.0D - var16;
                double var20 = var4 + 0.3333333333333333D;
                if (var20 > 1.0D) {
                    var20--;
                }
                double var24 = var4 - 0.3333333333333333D;
                if (var20 * 6.0D < 1.0D) {
                    var10 = (var16 - var18) * 6.0D * var20 + var18;
                } else if (var20 * 2.0D < 1.0D) {
                    var10 = var16;
                } else if ((var20 * 3.0D < 2.0D)) {
                    var10 = (0.6666666666666666D - var20) * (var16 - var18) * 6.0D + var18;
                } else {
                    var10 = var18;
                }
                if (var24 < 0.0D) {
                    var24++;
                }
                if (var4 * 6.0D < 1.0D) {
                    var12 = (var16 - var18) * 6.0D * var4 + var18;
                } else if (var4 * 2.0D < 1.0D) {
                    var12 = var16;
                } else if (var4 * 3.0D < 2.0D) {
                    var12 = (var16 - var18) * (0.6666666666666666D - var4) * 6.0D + var18;
                } else {
                    var12 = var18;
                }
                if (var24 * 6.0D < 1.0D) {
                    var14 = (var16 - var18) * 6.0D * var24 + var18;
                } else if (var24 * 2.0D < 1.0D) {
                    var14 = var16;
                } else if ((var24 * 3.0D < 2.0D)) {
                    var14 = (var16 - var18) * (0.6666666666666666D - var24) * 6.0D + var18;
                } else {
                    var14 = var18;
                }
            }
            double var26 = Math.pow(var10, var1);
            double var28 = Math.pow(var12, var1);
            double var30 = Math.pow(var14, var1);
            int var32 = (int) (var26 * 256.0D);
            int var33 = (int) (var28 * 256.0D);
            int var34 = (int) (var30 * 256.0D);
            int var35 = (var32 << 16) + (var33 << 8) + var34;
            class505.field6642[var3] = var35;
        }
    }
}
