import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iw")
public class class286 {

    @OriginalMember(owner = "client!iw", name = "b", descriptor = "I")
    private int field3933 = 0;

    @OriginalMember(owner = "client!iw", name = "h", descriptor = "[J")
    private long[] field3939 = new long[8];

    @OriginalMember(owner = "client!iw", name = "i", descriptor = "[B")
    private byte[] field3940 = new byte[32];

    @OriginalMember(owner = "client!iw", name = "n", descriptor = "[J")
    private long[] field3945 = new long[8];

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "[J")
    private long[] field3932 = new long[8];

    @OriginalMember(owner = "client!iw", name = "p", descriptor = "I")
    private int field3947 = 0;

    @OriginalMember(owner = "client!iw", name = "d", descriptor = "[B")
    private byte[] field3935 = new byte[64];

    @OriginalMember(owner = "client!iw", name = "r", descriptor = "[J")
    private long[] field3949 = new long[8];

    @OriginalMember(owner = "client!iw", name = "j", descriptor = "[J")
    private long[] field3941 = new long[8];

    @OriginalMember(owner = "client!iw", name = "k", descriptor = "I")
    public static int field3942 = 0;

    @OriginalMember(owner = "client!iw", name = "f", descriptor = "Z")
    public static boolean field3937 = false;

    @OriginalMember(owner = "client!iw", name = "m", descriptor = "[I")
    public static int[] field3944 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!iw", name = "c", descriptor = "I")
    public static int field3934;

    @OriginalMember(owner = "client!iw", name = "e", descriptor = "I")
    public static int field3936;

    @OriginalMember(owner = "client!iw", name = "g", descriptor = "I")
    public static int field3938;

    @OriginalMember(owner = "client!iw", name = "l", descriptor = "I")
    public static int field3943;

    @OriginalMember(owner = "client!iw", name = "o", descriptor = "I")
    public static int field3946;

    @OriginalMember(owner = "client!iw", name = "q", descriptor = "I")
    public static int field3948;

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "([BBJ)V")
    public final void method1758(byte[] arg0, byte arg1, long arg2) {
        field3938++;
        int var5 = 0;
        int var6 = 8 - ((int) arg2 & 0x7) & 0x7;
        int var7 = this.field3947 & 0x7;
        long var8 = arg2;
        if (arg1 != 112) {
            return;
        }
        int var10 = 31;
        int var11 = 0;
        while (var10 >= 0) {
            int var16 = (this.field3940[var10] & 0xFF) + ((int) var8 & 0xFF) + var11;
            this.field3940[var10] = (byte) var16;
            var8 >>>= 0x8;
            var11 = var16 >>> 8;
            var10--;
        }
        while (arg2 > 8L) {
            int var15 = arg0[var5] << var6 & 0xFF | (arg0[var5 + 1] & 0xFF) >>> 8 - var6;
            if (var15 < 0 || var15 >= 256) {
                throw new RuntimeException("LOGIC ERROR");
            }
            this.field3935[this.field3933] = (byte) class647.method3617(this.field3935[this.field3933], var15 >>> var7);
            this.field3933++;
            this.field3947 += 8 - var7;
            if (this.field3947 == 512) {
                this.method1762(arg1 ^ 0xFFFFAEF5);
                this.field3947 = this.field3933 = 0;
            }
            this.field3935[this.field3933] = (byte) class136.method950(255, var15 << 8 - var7);
            arg2 -= 8L;
            this.field3947 += var7;
            var5++;
        }
        int var12;
        if (arg2 <= 0L) {
            var12 = 0;
        } else {
            var12 = arg0[var5] << var6 & 0xFF;
            this.field3935[this.field3933] = (byte) class647.method3617(this.field3935[this.field3933], var12 >>> var7);
        }
        if (((long) var7 + arg2) < 8L) {
            this.field3947 = (int) ((long) this.field3947 + arg2);
            return;
        }
        long var13 = arg2 - (long) (8 - var7);
        this.field3947 += 8 - var7;
        this.field3933++;
        if (this.field3947 == 512) {
            this.method1762(-20859);
            this.field3947 = this.field3933 = 0;
        }
        this.field3935[this.field3933] = (byte) class136.method950(var12 << 8 - var7, 255);
        this.field3947 += (int) var13;
    }

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "([BII)V")
    public final void method1759(byte[] arg0, int arg1, int arg2) {
        this.field3935[this.field3933] = (byte) class647.method3617(this.field3935[this.field3933], 0x80 >>> class136.method950(7, this.field3947));
        field3943++;
        this.field3933++;
        if (this.field3933 > 32) {
            while (true) {
                if (this.field3933 >= 64) {
                    this.method1762(-20859);
                    this.field3933 = 0;
                    break;
                }
                this.field3935[this.field3933++] = 0;
            }
        }
        while (this.field3933 < 32) {
            this.field3935[this.field3933++] = 0;
        }
        class359.method2053(this.field3940, 0, this.field3935, 32, 32);
        this.method1762(-20859);
        int var4 = 13 % ((arg2 + 11) / 34);
        int var5 = 0;
        int var6 = arg1;
        while (var5 < 8) {
            long var7 = this.field3941[var5];
            arg0[var6] = (byte) ((int) (var7 >>> 56));
            arg0[var6 + 1] = (byte) ((int) (var7 >>> 48));
            arg0[var6 + 2] = (byte) ((int) (var7 >>> 40));
            arg0[var6 + 3] = (byte) ((int) (var7 >>> 32));
            arg0[var6 + 4] = (byte) ((int) (var7 >>> 24));
            arg0[var6 + 5] = (byte) ((int) (var7 >>> 16));
            arg0[var6 + 6] = (byte) ((int) (var7 >>> 8));
            arg0[var6 + 7] = (byte) ((int) var7);
            var6 += 8;
            var5++;
        }
    }

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(I)V")
    public final void method1760(int arg0) {
        field3934++;
        if (arg0 != 2) {
            this.method1759(null, 63, 77);
        }
        for (int var2 = 0; var2 < 32; var2++) {
            this.field3940[var2] = 0;
        }
        this.field3947 = this.field3933 = 0;
        this.field3935[0] = 0;
        for (int var3 = 0; var3 < 8; var3++) {
            this.field3941[var3] = 0L;
        }
    }

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(FFBIIIIF)[F")
    public static final float[] method1761(float arg0, float arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, float arg7) {
        field3946++;
        float[] var8 = new float[9];
        float[] var9 = new float[9];
        float var10 = (float) Math.cos((double) ((float) arg6 * 0.024543693F));
        float var11 = (float) Math.sin((double) ((float) arg6 * 0.024543693F));
        var8[6] = -var11;
        var8[8] = var10;
        var8[1] = 0.0F;
        var8[2] = var11;
        var8[4] = 1.0F;
        var8[7] = 0.0F;
        var8[3] = 0.0F;
        var8[5] = 0.0F;
        float var12 = 1.0F - var10;
        var8[0] = var10;
        float[] var13 = new float[9];
        float var14 = 1.0F;
        float var15 = (float) arg4 / 32767.0F;
        float var16 = 0.0F;
        float var17 = 1.0F - var15;
        float var18 = -((float) Math.sqrt((double) (1.0F - (var15 * var15))));
        float var19 = (float) Math.sqrt((double) (arg3 * arg3 + (arg5 * arg5)));
        if (var19 == 0.0F && var15 == 0.0F) {
            var9 = var8;
        } else {
            if (var19 != 0.0F) {
                var14 = (float) (-arg5) / var19;
                var16 = (float) arg3 / var19;
            }
            var13[6] = var14 * var16 * var17;
            var13[0] = var14 * var14 * var17 + var15;
            var13[7] = -var14 * var18;
            var13[2] = var14 * var16 * var17;
            var13[1] = var16 * var18;
            var13[8] = var16 * var16 * var17 + var15;
            var13[5] = var14 * var18;
            var13[3] = -var16 * var18;
            var13[4] = var15;
            var9[0] = var8[2] * var13[6] + var8[1] * var13[3] + var8[0] * var13[0];
            var9[1] = var8[2] * var13[7] + var8[1] * var13[4] + var8[0] * var13[1];
            var9[3] = var8[5] * var13[6] + var8[4] * var13[3] + var8[3] * var13[0];
            var9[2] = var8[2] * var13[8] + var8[1] * var13[5] + var8[0] * var13[2];
            var9[4] = var8[5] * var13[7] + var8[3] * var13[1] + var8[4] * var13[4];
            var9[5] = var8[5] * var13[8] + var8[3] * var13[2] + var8[4] * var13[5];
            var9[6] = var8[8] * var13[6] + var8[7] * var13[3] + var8[6] * var13[0];
            var9[7] = var8[8] * var13[7] + var8[6] * var13[1] + var8[7] * var13[4];
            var9[8] = var8[8] * var13[8] + var8[7] * var13[5] + var8[6] * var13[2];
        }
        var9[5] *= arg7;
        var9[8] *= arg1;
        var9[2] *= arg0;
        var9[4] *= arg7;
        var9[6] *= arg1;
        var9[0] *= arg0;
        var9[1] *= arg0;
        var9[7] *= arg1;
        var9[3] *= arg7;
        if (arg2 != 87) {
            field3942 = 83;
        }
        return var9;
    }

    @OriginalMember(owner = "client!iw", name = "b", descriptor = "(I)V")
    private final void method1762(int arg0) {
        field3948++;
        int var2 = 0;
        int var3 = 0;
        while (var2 < 8) {
            this.field3939[var2] = class506.method2889(class506.method2889(class506.method2889(class231.method1456(0xFFL << 16, (long) this.field3935[var3 + 5] << 16), class506.method2889(class231.method1456(0xFFL << 24, (long) this.field3935[var3 + 4] << 24), class506.method2889(class231.method1456((long) this.field3935[var3 + 3], 255L) << 32, class506.method2889(class506.method2889(class231.method1456(255L, (long) this.field3935[var3 + 1]) << 48, (long) this.field3935[var3] << 56), class231.method1456(0xFFL << 40, (long) this.field3935[var3 + 2] << 40))))), class231.method1456((long) this.field3935[var3 + 6], 255L) << 8), class231.method1456(255L, (long) this.field3935[var3 + 7]));
            var3 += 8;
            var2++;
        }
        for (int var4 = 0; var4 < 8; var4++) {
            this.field3945[var4] = class506.method2889(this.field3939[var4], this.field3949[var4] = this.field3941[var4]);
        }
        for (int var5 = 1; var5 <= 10; var5++) {
            for (int var7 = 0; var7 < 8; var7++) {
                this.field3932[var7] = 0L;
                int var13 = 0;
                int var14 = 56;
                while (var13 < 8) {
                    this.field3932[var7] = class506.method2889(this.field3932[var7], class410.field5815[var13][class136.method950((int) (this.field3949[class136.method950(7, var7 - var13)] >>> var14), 255)]);
                    var13++;
                    var14 -= 8;
                }
            }
            for (int var8 = 0; var8 < 8; var8++) {
                this.field3949[var8] = this.field3932[var8];
            }
            this.field3949[0] = class506.method2889(this.field3949[0], class410.field5827[var5]);
            for (int var9 = 0; var9 < 8; var9++) {
                this.field3932[var9] = this.field3949[var9];
                int var11 = 0;
                int var12 = 56;
                while (var11 < 8) {
                    this.field3932[var9] = class506.method2889(this.field3932[var9], class410.field5815[var11][class136.method950((int) (this.field3945[class136.method950(var9 - var11, 7)] >>> var12), 255)]);
                    var12 -= 8;
                    var11++;
                }
            }
            for (int var10 = 0; var10 < 8; var10++) {
                this.field3945[var10] = this.field3932[var10];
            }
        }
        int var6 = 0;
        if (arg0 != -20859) {
            method1764(false);
        }
        while (var6 < 8) {
            this.field3941[var6] = class506.method2889(this.field3941[var6], class506.method2889(this.field3939[var6], this.field3945[var6]));
            var6++;
        }
    }

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(IBIIIII)V")
    public static final void method1763(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3936++;
        int var7 = arg4 - arg2;
        int var8 = arg2 + arg5;
        for (int var9 = arg5; var9 < var8; var9++) {
            class470.method2660(arg3, arg0, class344.field4599[var9], (byte) 11, arg6);
        }
        for (int var10 = arg4; var10 > var7; var10--) {
            class470.method2660(arg3, arg0, class344.field4599[var10], (byte) 11, arg6);
        }
        int var11 = arg2 + arg3;
        int var12 = arg0 - arg2;
        int var13 = var8;
        if (arg1 != -91) {
            field3944 = null;
        }
        while (var7 >= var13) {
            int[] var14 = class344.field4599[var13];
            class470.method2660(arg3, var11, var14, (byte) 11, arg6);
            class470.method2660(var12, arg0, var14, (byte) 11, arg6);
            var13++;
        }
    }

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(Z)V")
    public static void method1764(boolean arg0) {
        field3944 = null;
        if (arg0) {
            field3944 = null;
        }
    }
}
