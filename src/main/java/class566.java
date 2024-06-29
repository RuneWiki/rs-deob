import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public class class566 extends class496 {

    @OriginalMember(owner = "client!gk", name = "y", descriptor = "Lkw;")
    private class174 field8393;

    @OriginalMember(owner = "client!gk", name = "v", descriptor = "Lat;")
    private class535 field8390;

    @OriginalMember(owner = "client!gk", name = "i", descriptor = "Leo;")
    private class516 field8377;

    @OriginalMember(owner = "client!gk", name = "z", descriptor = "I")
    private int field8394;

    @OriginalMember(owner = "client!gk", name = "A", descriptor = "I")
    private int field8395;

    @OriginalMember(owner = "client!gk", name = "D", descriptor = "I")
    private int field8397;

    @OriginalMember(owner = "client!gk", name = "k", descriptor = "I")
    private int field8379;

    @OriginalMember(owner = "client!gk", name = "j", descriptor = "[[F")
    private float[][] field8378;

    @OriginalMember(owner = "client!gk", name = "I", descriptor = "[[F")
    private float[][] field8402;

    @OriginalMember(owner = "client!gk", name = "o", descriptor = "[[F")
    private float[][] field8383;

    @OriginalMember(owner = "client!gk", name = "q", descriptor = "I")
    private int field8385;

    @OriginalMember(owner = "client!gk", name = "w", descriptor = "Ltq;")
    private class90 field8391;

    @OriginalMember(owner = "client!gk", name = "s", descriptor = "Lg;")
    private class512 field8387;

    @OriginalMember(owner = "client!gk", name = "p", descriptor = "Lica;")
    private class205 field8384;

    @OriginalMember(owner = "client!gk", name = "m", descriptor = "Ljaclib/memory/Stream;")
    private Stream field8381;

    @OriginalMember(owner = "client!gk", name = "u", descriptor = "Ljaclib/memory/Stream;")
    private Stream field8389;

    @OriginalMember(owner = "client!gk", name = "E", descriptor = "I")
    private int field8398;

    @OriginalMember(owner = "client!gk", name = "r", descriptor = "Lud;")
    public static class119 field8386 = new class119();

    @OriginalMember(owner = "client!gk", name = "F", descriptor = "Lnj;")
    public static class487 field8399 = new class487("Loading JAGMISC - ", "Lade JAGMISC - ", "Chargement JAGMISC - ", "Carregando JAGMISC - ");

    @OriginalMember(owner = "client!gk", name = "G", descriptor = "[I")
    public static int[] field8400 = new int[] { 36064, 36065, 36066, 36067, 36068, 36069, 36070, 36071, 36096 };

    @OriginalMember(owner = "client!gk", name = "H", descriptor = "Ljt;")
    public static class489 field8401 = new class489(1);

    @OriginalMember(owner = "client!gk", name = "K", descriptor = "I")
    public static int field8404 = 0;

    @OriginalMember(owner = "client!gk", name = "J", descriptor = "Lrk;")
    public static class419 field8403 = new class419();

    @OriginalMember(owner = "client!gk", name = "M", descriptor = "Lqp;")
    public static class586 field8406 = new class586(27, -1);

    @OriginalMember(owner = "client!gk", name = "l", descriptor = "I")
    public static int field8380;

    @OriginalMember(owner = "client!gk", name = "n", descriptor = "I")
    public static int field8382;

    @OriginalMember(owner = "client!gk", name = "t", descriptor = "I")
    public static int field8388;

    @OriginalMember(owner = "client!gk", name = "x", descriptor = "I")
    public static int field8392;

    @OriginalMember(owner = "client!gk", name = "B", descriptor = "I")
    public static int field8396;

    @OriginalMember(owner = "client!gk", name = "L", descriptor = "I")
    public static int field8405;

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(I)V")
    public static void method3306(int arg0) {
        field8400 = null;
        int var1 = 14 / ((arg0 - 56) / 57);
        field8403 = null;
        field8399 = null;
        field8386 = null;
        field8401 = null;
        field8406 = null;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(SB)V")
    private final void method3307(short arg0, byte arg1) {
        if (Stream.method3328()) {
            this.field8389.method3337(arg0);
        } else {
            this.field8389.method3336(arg0);
        }
        field8396++;
        if (arg1 != -13) {
            this.field8397 = 67;
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(IIIIIII)V")
    private final void method3308(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg3 < 74) {
            this.field8395 = 47;
        }
        field8380++;
        long var8 = -1L;
        int var10 = (arg0 << this.field8377.field8119) + arg2;
        int var11 = (arg5 << this.field8377.field8119) + arg1;
        int var12 = this.field8377.method1323(var10, var11);
        if ((arg2 & 0x7F) == 0 || (arg1 & 0x7F) == 0) {
            var8 = 0xFFFFL << 16 & (long) var11 << 16 | (long) var10 & 0xFFFFL;
            class496 var13 = this.field8384.method1333(var8, false);
            if (var13 != null) {
                this.method3307(((class168) var13).field2272, (byte) -13);
                return;
            }
        }
        short var14 = (short) (this.field8398++);
        if (var8 != -1L) {
            this.field8384.method1341(new class168(var14), (byte) 24, var8);
        }
        float var15;
        float var16;
        float var17;
        if (arg2 == 0 && arg1 == 0) {
            var15 = this.field8378[arg6][arg4];
            var16 = this.field8383[arg6][arg4];
            var17 = this.field8402[arg6][arg4];
        } else if (this.field8377.field8116 == arg2 && arg1 == 0) {
            var16 = this.field8383[arg6 + 1][arg4];
            var17 = this.field8402[arg6 + 1][arg4];
            var15 = this.field8378[arg6 + 1][arg4];
        } else if (this.field8377.field8116 == arg2 && this.field8377.field8116 == arg1) {
            var15 = this.field8378[arg6 + 1][arg4 + 1];
            var16 = this.field8383[arg6 + 1][arg4 + 1];
            var17 = this.field8402[arg6 + 1][arg4 + 1];
        } else if (arg2 == 0 && this.field8377.field8116 == arg1) {
            var15 = this.field8378[arg6][arg4 + 1];
            var16 = this.field8383[arg6][arg4 + 1];
            var17 = this.field8402[arg6][arg4 + 1];
        } else {
            float var18 = (float) arg2 / (float) this.field8377.field8116;
            float var19 = (float) arg1 / (float) this.field8377.field8116;
            float var20 = this.field8402[arg6][arg4];
            float var21 = this.field8378[arg6][arg4];
            float var22 = this.field8383[arg6][arg4];
            float var23 = this.field8402[arg6 + 1][arg4];
            float var24 = this.field8378[arg6 + 1][arg4];
            float var25 = (this.field8383[arg6][arg4 + 1] - var22) * var18 + var22;
            float var26 = (this.field8402[arg6][arg4 + 1] - var20) * var18 + var20;
            float var27 = (this.field8378[arg6 + 1][arg4 + 1] - var24) * var18 + var24;
            float var28 = (this.field8378[arg6][arg4 + 1] - var21) * var18 + var21;
            float var29 = this.field8383[arg6 + 1][arg4];
            float var30 = (this.field8402[arg6 + 1][arg4 + 1] - var23) * var18 + var23;
            var17 = (var30 - var26) * var19 + var26;
            float var31 = (this.field8383[arg6 + 1][arg4 + 1] - var29) * var18 + var29;
            var15 = (var27 - var28) * var19 + var28;
            var16 = (var31 - var25) * var19 + var25;
        }
        float var32 = (float) (this.field8390.method3151(-83) - var10);
        float var33 = (float) (this.field8390.method3150(2) - var12);
        float var34 = (float) (this.field8390.method3143(-111) - var11);
        float var35 = (float) Math.sqrt((double) (var34 * var34 + var32 * var32 + var33 * var33));
        float var36 = 1.0F / var35;
        float var37 = var33 * var36;
        float var38 = var32 * var36;
        float var39 = var34 * var36;
        float var40 = var35 / (float) this.field8390.method3146(0);
        float var41 = 1.0F - var40 * var40;
        if (var41 < 0.0F) {
            var41 = 0.0F;
        }
        float var42 = var16 * var39 + var15 * var37 + var17 * var38;
        if (var42 < 0.0F) {
            var42 = 0.0F;
        }
        float var43 = var41 * var42 * 2.0F;
        if (var43 > 1.0F) {
            var43 = 1.0F;
        }
        int var44 = this.field8390.method3148((byte) -74);
        int var45 = (int) ((float) (var44 >> 16 & 0xFF) * var43);
        if (var45 > 255) {
            var45 = 255;
        }
        int var46 = (int) ((float) (var44 >> 8 & 0xFF) * var43);
        if (var46 > 255) {
            var46 = 255;
        }
        int var47 = (int) ((float) (var44 & 0xFF) * var43);
        if (var47 > 255) {
            var47 = 255;
        }
        if (Stream.method3328()) {
            this.field8381.method3326((float) var10);
            this.field8381.method3326((float) var12);
            this.field8381.method3326((float) var11);
        } else {
            this.field8381.method3333((float) var10);
            this.field8381.method3333((float) var12);
            this.field8381.method3333((float) var11);
        }
        if (this.field8393.field2639 == 0) {
            this.field8381.method3330(var47);
            this.field8381.method3330(var46);
            this.field8381.method3330(var45);
        } else {
            this.field8381.method3330(var45);
            this.field8381.method3330(var46);
            this.field8381.method3330(var47);
        }
        this.field8381.method3330(255);
        this.method3307(var14, (byte) -13);
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "([[ZIBII)V")
    public final void method3309(boolean[][] arg0, int arg1, byte arg2, int arg3, int arg4) {
        field8382++;
        if (this.field8387 == null || this.field8394 > arg3 + arg4 || arg4 - arg3 > this.field8395 || this.field8397 > (arg1 + arg3) || arg1 - arg3 > this.field8379) {
            return;
        }
        for (int var6 = this.field8397; var6 <= this.field8379; var6++) {
            for (int var8 = this.field8394; var8 <= this.field8395; var8++) {
                int var9 = var8 - arg4;
                int var10 = var6 - arg1;
                if ((-arg3) < var9 && arg3 > var9 && var10 > (-arg3) && arg3 > var10 && arg0[var9 + arg3][var10 + arg3]) {
                    this.field8393.method1117((byte) -120, (byte) ((int) (this.field8390.method3145(2) * 255.0F)));
                    this.field8393.method326(43, this.field8393.field2653);
                    this.field8393.method296(0, this.field8391, 91);
                    this.field8393.method292(false, this.field8387, 0, class386.field5653, this.field8385 / 3, 0, this.field8398);
                    return;
                }
            }
        }
        int var7 = 33 / ((arg2 - 41) / 39);
    }

    @OriginalMember(owner = "client!gk", name = "<init>", descriptor = "(Lkw;Leo;Lat;[I)V")
    public class566(class174 arg0, class516 arg1, class535 arg2, int[] arg3) {
        this.field8393 = arg0;
        this.field8390 = arg2;
        this.field8377 = arg1;
        int var5 = this.field8390.method3146(0) - (arg1.field8116 >> 1);
        this.field8394 = this.field8390.method3151(-128) - var5 >> arg1.field8119;
        this.field8395 = var5 + this.field8390.method3151(-106) >> arg1.field8119;
        this.field8397 = this.field8390.method3143(-99) - var5 >> arg1.field8119;
        this.field8379 = var5 + this.field8390.method3143(-96) >> arg1.field8119;
        int var6 = this.field8395 + 1 - this.field8394;
        int var7 = this.field8379 + 1 - this.field8397;
        this.field8378 = new float[var6 + 1][var7 + 1];
        this.field8402 = new float[var6 + 1][var7 + 1];
        this.field8383 = new float[var6 + 1][var7 + 1];
        for (int var8 = 0; var8 <= var7; var8++) {
            int var25 = var8 + this.field8397;
            if (var25 > 0 && this.field8377.field8118 - 1 > var25) {
                for (int var26 = 0; var26 <= var6; var26++) {
                    int var27 = this.field8394 + var26;
                    if (var27 > 0 && var27 < (this.field8377.field8121 - 1)) {
                        int var28 = arg1.method1319(var27 + 1, var25) - arg1.method1319(var27 - 1, var25);
                        int var29 = arg1.method1319(var27, var25 + 1) - arg1.method1319(var27, var25 - 1);
                        float var30 = (float) (1.0D / Math.sqrt((double) (var28 * var28 + var29 * var29 + 65536)));
                        this.field8402[var26][var8] = (float) var28 * var30;
                        this.field8378[var26][var8] = var30 * -256.0F;
                        this.field8383[var26][var8] = (float) var29 * var30;
                    }
                }
            }
        }
        int var9 = 0;
        for (int var10 = this.field8397; var10 <= this.field8379; var10++) {
            if (var10 >= 0 && var10 < arg1.field8118) {
                for (int var22 = this.field8394; var22 <= this.field8395; var22++) {
                    if (var22 >= 0 && var22 < arg1.field8121) {
                        int var23 = arg3[var9];
                        int[] var24 = arg1.field7640[var22][var10];
                        if (var24 != null && var23 != 0) {
                            this.field8385 += var23 == 1 ? var24.length : 3;
                        }
                    }
                    var9++;
                }
            } else {
                var9 += this.field8395 - this.field8394;
            }
        }
        if (this.field8385 <= 0) {
            this.field8391 = null;
            this.field8387 = null;
        } else {
            this.field8384 = new class205(class479.method2908((byte) -99, this.field8385));
            this.field8387 = this.field8393.method302(false, -123);
            this.field8387.method464(true, this.field8385);
            NativeHeapBuffer var11 = this.field8393.method1112(this.field8385 * 16, false, (byte) 95);
            this.field8381 = new Stream(var11);
            while (true) {
                Buffer var12;
                do {
                    var12 = this.field8387.method410(true, (byte) -56);
                } while (var12 == null);
                this.field8389 = new Stream(var12);
                int var13 = 0;
                int var14 = 0;
                for (int var15 = this.field8397; var15 <= this.field8379; var15++) {
                    if (var15 >= 0 && var15 < arg1.field8118) {
                        int var16 = 0;
                        for (int var17 = this.field8394; var17 <= this.field8395; var17++) {
                            if (var17 >= 0 && var17 < arg1.field8121) {
                                int var18 = arg3[var13];
                                int[] var19 = arg1.field7640[var17][var15];
                                int[] var20 = arg1.field7657[var17][var15];
                                if (var19 != null && var18 != 0) {
                                    if (var18 == 1) {
                                        for (int var21 = 0; var21 < var19.length; var21++) {
                                            this.method3308(var17, var20[var21], var19[var21], 78, var14, var15, var16);
                                        }
                                    } else if (var18 == 3) {
                                        this.method3308(var17, 0, 0, 103, var14, var15, var16);
                                        this.method3308(var17, 0, arg1.field8116, 116, var14, var15, var16);
                                        this.method3308(var17, arg1.field8116, 0, 126, var14, var15, var16);
                                    } else if (var18 == 2) {
                                        this.method3308(var17, 0, arg1.field8116, 115, var14, var15, var16);
                                        this.method3308(var17, arg1.field8116, arg1.field8116, 95, var14, var15, var16);
                                        this.method3308(var17, 0, 0, 93, var14, var15, var16);
                                    } else if (var18 == 5) {
                                        this.method3308(var17, arg1.field8116, arg1.field8116, 117, var14, var15, var16);
                                        this.method3308(var17, arg1.field8116, 0, 127, var14, var15, var16);
                                        this.method3308(var17, 0, arg1.field8116, 126, var14, var15, var16);
                                    } else if (var18 == 4) {
                                        this.method3308(var17, arg1.field8116, 0, 118, var14, var15, var16);
                                        this.method3308(var17, 0, 0, 92, var14, var15, var16);
                                        this.method3308(var17, arg1.field8116, arg1.field8116, 102, var14, var15, var16);
                                    }
                                }
                            }
                            var13++;
                            var16++;
                        }
                    } else {
                        var13 += this.field8395 - this.field8394;
                    }
                    var14++;
                }
                this.field8389.method3332();
                if (this.field8387.method411(-111)) {
                    this.field8381.method3332();
                    this.field8391 = this.field8393.method304(false, false);
                    this.field8391.method408(var11, this.field8398 * 16, 6831, 16);
                    break;
                }
                this.field8381.method3329(0);
                this.field8384.method1332(-22538);
            }
        }
        this.field8402 = this.field8378 = this.field8383 = null;
        this.field8384 = null;
        this.field8381 = null;
        this.field8389 = null;
    }
}
