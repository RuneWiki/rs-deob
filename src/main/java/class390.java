import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public class class390 extends class522 {

    @OriginalMember(owner = "client!si", name = "K", descriptor = "I")
    private int field5296;

    @OriginalMember(owner = "client!si", name = "D", descriptor = "I")
    private int field5290;

    @OriginalMember(owner = "client!si", name = "x", descriptor = "I")
    private int field5284;

    @OriginalMember(owner = "client!si", name = "B", descriptor = "I")
    private int field5288;

    @OriginalMember(owner = "client!si", name = "v", descriptor = "I")
    public static int field5282;

    @OriginalMember(owner = "client!si", name = "y", descriptor = "I")
    public static int field5285;

    @OriginalMember(owner = "client!si", name = "z", descriptor = "I")
    private int field5286;

    @OriginalMember(owner = "client!si", name = "A", descriptor = "I")
    public static int field5287;

    @OriginalMember(owner = "client!si", name = "C", descriptor = "I")
    public static int field5289;

    @OriginalMember(owner = "client!si", name = "F", descriptor = "I")
    public static int field5291;

    @OriginalMember(owner = "client!si", name = "G", descriptor = "I")
    public static int field5292;

    @OriginalMember(owner = "client!si", name = "H", descriptor = "I")
    private int field5293;

    @OriginalMember(owner = "client!si", name = "I", descriptor = "I")
    private int field5294;

    @OriginalMember(owner = "client!si", name = "J", descriptor = "I")
    private int field5295;

    @OriginalMember(owner = "client!si", name = "M", descriptor = "I")
    public static int field5298;

    @OriginalMember(owner = "client!si", name = "L", descriptor = "[B")
    private byte[] field5297;

    @OriginalMember(owner = "client!si", name = "w", descriptor = "[Ljava/lang/String;")
    public static String[] field5283;

    @OriginalMember(owner = "client!si", name = "d", descriptor = "(I)V", line = 4)
    public static void method2296(int arg0) {
        int var1 = -89 / ((32 - arg0) / 44);
        field5283 = null;
    }

    @OriginalMember(owner = "client!si", name = "c", descriptor = "(B)V", line = 15)
    public final void method921(byte arg0) {
        field5292++;
        this.field5288 = this.field5284;
        this.field5295 >>= 0x4;
        if (this.field5295 < 0) {
            this.field5295 = 0;
        } else if (this.field5295 > 255) {
            this.field5295 = 255;
        }
        this.method2299((byte) this.field5295, this.field5294++, -123);
        if (arg0 <= 92) {
            this.field5286 = 90;
        }
        this.field5295 = 0;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(ILjs;ILjava/lang/String;)Ljk;", line = 39)
    public static final class446 method2297(int arg0, class216 arg1, int arg2, String arg3) {
        field5287++;
        if (arg2 == 0) {
            return arg1.method1356(19, arg3);
        } else if (arg2 == 1) {
            try {
                class87.method638(new Object[] { (new URL(arg1.field2917.getCodeBase(), arg3)).toString() }, (byte) -128, arg1.field2917, "openjs");
                class446 var4 = new class446();
                var4.field6100 = 1;
                return var4;
            } catch (Throwable var10) {
                class446 var5 = new class446();
                var5.field6100 = 2;
                return var5;
            }
        } else if (arg0 == arg2) {
            try {
                arg1.field2917.getAppletContext().showDocument(new URL(arg1.field2917.getCodeBase(), arg3), "_blank");
                class446 var6 = new class446();
                var6.field6100 = 1;
                return var6;
            } catch (Exception var11) {
                class446 var7 = new class446();
                var7.field6100 = 2;
                return var7;
            }
        } else if (arg2 == 3) {
            try {
                class87.method637(arg0 - 75, arg1.field2917, "loggedout");
            } catch (Throwable var13) {
            }
            try {
                arg1.field2917.getAppletContext().showDocument(new URL(arg1.field2917.getCodeBase(), arg3), "_top");
                class446 var8 = new class446();
                var8.field6100 = 1;
                return var8;
            } catch (Exception var12) {
                class446 var9 = new class446();
                var9.field6100 = 2;
                return var9;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(III)V", line = 111)
    public final void method920(int arg0, int arg1, int arg2) {
        field5282++;
        if (arg0 == 0) {
            this.field5293 = this.field5290 - (arg2 >= 0 ? arg2 : -arg2);
            this.field5286 = 4096;
            this.field5293 = this.field5293 * this.field5293 >> 12;
            this.field5295 = this.field5293;
        } else {
            this.field5286 = this.field5296 * this.field5293 >> 12;
            this.field5293 = this.field5290 - (arg2 < 0 ? -arg2 : arg2);
            if (this.field5286 < 0) {
                this.field5286 = 0;
            } else if (this.field5286 > 4096) {
                this.field5286 = 4096;
            }
            this.field5293 = this.field5293 * this.field5293 >> 12;
            this.field5293 = this.field5293 * this.field5286 >> 12;
            this.field5295 += this.field5293 * this.field5288 >> 12;
            this.field5288 = this.field5288 * this.field5284 >> 12;
        }
        if (arg1 != 1) {
            this.field5288 = -1;
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IIFIFIIF)[F", line = 150)
    public static final float[] method2298(int arg0, int arg1, float arg2, int arg3, float arg4, int arg5, int arg6, float arg7) {
        field5291++;
        float[] var8 = new float[9];
        float[] var9 = new float[9];
        float var10 = (float) Math.cos((double) ((float) arg5 * 0.024543693F));
        float var11 = (float) Math.sin((double) ((float) arg5 * 0.024543693F));
        float var12 = 1.0F - var10;
        var8[8] = var10;
        var8[2] = var11;
        var8[5] = 0.0F;
        var8[7] = 0.0F;
        int var13 = -98 / ((-arg3 - 79) / 40);
        var8[6] = -var11;
        var8[3] = 0.0F;
        var8[0] = var10;
        var8[1] = 0.0F;
        var8[4] = 1.0F;
        float[] var14 = new float[9];
        float var15 = 1.0F;
        float var16 = 0.0F;
        float var17 = (float) arg6 / 32767.0F;
        float var18 = -((float) Math.sqrt((double) (1.0F - var17 * var17)));
        float var19 = 1.0F - var17;
        float var20 = (float) Math.sqrt((double) (arg0 * arg0 + arg1 * arg1));
        if (var20 == 0.0F && var17 == 0.0F) {
            var9 = var8;
        } else {
            if (var20 != 0.0F) {
                var15 = (float) (-arg0) / var20;
                var16 = (float) arg1 / var20;
            }
            var14[0] = var15 * var15 * var19 + var17;
            var14[6] = var15 * var16 * var19;
            var14[5] = var15 * var18;
            var14[7] = -var15 * var18;
            var14[8] = var16 * var16 * var19 + var17;
            var14[4] = var17;
            var14[2] = var15 * var16 * var19;
            var14[3] = -var16 * var18;
            var14[1] = var16 * var18;
            var9[0] = var8[2] * var14[6] + var8[0] * var14[0] + var8[1] * var14[3];
            var9[1] = var8[2] * var14[7] + var8[1] * var14[4] + var8[0] * var14[1];
            var9[3] = var8[5] * var14[6] + var8[3] * var14[0] + var8[4] * var14[3];
            var9[2] = var8[2] * var14[8] + var8[1] * var14[5] + var8[0] * var14[2];
            var9[4] = var8[5] * var14[7] + var8[4] * var14[4] + var8[3] * var14[1];
            var9[6] = var8[8] * var14[6] + var8[7] * var14[3] + var8[6] * var14[0];
            var9[5] = var8[5] * var14[8] + var8[4] * var14[5] + var8[3] * var14[2];
            var9[7] = var8[8] * var14[7] + var8[6] * var14[1] + var8[7] * var14[4];
            var9[8] = var8[8] * var14[8] + var8[7] * var14[5] + var8[6] * var14[2];
        }
        var9[7] *= arg2;
        var9[6] *= arg2;
        var9[8] *= arg2;
        var9[1] *= arg4;
        var9[5] *= arg7;
        var9[3] *= arg7;
        var9[0] *= arg4;
        var9[2] *= arg4;
        var9[4] *= arg7;
        return var9;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(BII)V", line = 232)
    public void method2299(byte arg0, int arg1, int arg2) {
        this.field5297[arg1] = arg0;
        field5285++;
        int var4 = 33 / ((arg2 + 10) / 55);
    }

    @OriginalMember(owner = "client!si", name = "b", descriptor = "(II)V", line = 250)
    public static final void method2300(int arg0, int arg1) {
        class457.field6297.method1461(-5, arg1);
        if (arg0 <= 66) {
            method2300(54, -128);
        }
        field5298++;
    }

    @OriginalMember(owner = "client!si", name = "<init>", descriptor = "(IIIIIFFF)V", line = 262)
    public class390(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5, float arg6, float arg7) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field5296 = (int) (arg7 * 4096.0F);
        this.field5290 = (int) (arg6 * 4096.0F);
        this.field5288 = this.field5284 = (int) (Math.pow(0.5D, (double) (-arg5)) * 4096.0D);
    }

    @OriginalMember(owner = "client!si", name = "b", descriptor = "(I)V", line = 273)
    public final void method917(int arg0) {
        this.field5294 = 0;
        field5289++;
        if (arg0 <= 49) {
            this.method921((byte) -86);
        }
        this.field5295 = 0;
    }
}
