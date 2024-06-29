import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public class class74 {

    @OriginalMember(owner = "client!ok", name = "n", descriptor = "B")
    private byte field1265;

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "I")
    public int field1252;

    @OriginalMember(owner = "client!ok", name = "l", descriptor = "I")
    public int field1263;

    @OriginalMember(owner = "client!ok", name = "h", descriptor = "I")
    public int field1259;

    @OriginalMember(owner = "client!ok", name = "k", descriptor = "I")
    public int field1262;

    @OriginalMember(owner = "client!ok", name = "m", descriptor = "I")
    public int field1264;

    @OriginalMember(owner = "client!ok", name = "f", descriptor = "Lpu;")
    public static class179 field1257 = new class179("Examine", "Untersuchen", "Examiner", "Examinar");

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "I")
    public static int field1253;

    @OriginalMember(owner = "client!ok", name = "c", descriptor = "I")
    public static int field1254;

    @OriginalMember(owner = "client!ok", name = "d", descriptor = "I")
    public static int field1255;

    @OriginalMember(owner = "client!ok", name = "e", descriptor = "I")
    public static int field1256;

    @OriginalMember(owner = "client!ok", name = "g", descriptor = "I")
    public static int field1258;

    @OriginalMember(owner = "client!ok", name = "i", descriptor = "I")
    public static int field1260;

    @OriginalMember(owner = "client!ok", name = "j", descriptor = "I")
    public static int field1261;

    @OriginalMember(owner = "client!ok", name = "o", descriptor = "I")
    public static int field1266;

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(FIIFIIFI)[F")
    public static final float[] method685(float arg0, int arg1, int arg2, float arg3, int arg4, int arg5, float arg6, int arg7) {
        field1256++;
        float[] var8 = new float[9];
        float[] var9 = new float[9];
        float var10 = (float) Math.cos((double) ((float) arg1 * 0.024543693F));
        float var11 = (float) Math.sin((double) ((float) arg1 * 0.024543693F));
        float var12 = 1.0F - var10;
        var8[1] = 0.0F;
        var8[5] = 0.0F;
        var8[8] = var10;
        var8[4] = 1.0F;
        var8[2] = var11;
        var8[3] = 0.0F;
        var8[7] = 0.0F;
        var8[0] = var10;
        var8[6] = -var11;
        float[] var13 = new float[9];
        float var14 = 1.0F;
        float var15 = (float) arg7 / 32767.0F;
        float var16 = 0.0F;
        float var17 = 1.0F - var15;
        float var18 = -((float) Math.sqrt((double) (1.0F - (var15 * var15))));
        float var19 = (float) Math.sqrt((double) (arg2 * arg2 + arg4 * arg4));
        if ((float) arg5 == var19 && var15 == 0.0F) {
            var9 = var8;
        } else {
            if (var19 != 0.0F) {
                var14 = (float) (-arg2) / var19;
                var16 = (float) arg4 / var19;
            }
            var13[4] = var15;
            var13[0] = var14 * var14 * var17 + var15;
            var13[2] = var14 * var16 * var17;
            var13[6] = var14 * var16 * var17;
            var13[8] = var16 * var16 * var17 + var15;
            var13[3] = -var16 * var18;
            var13[7] = -var14 * var18;
            var13[5] = var14 * var18;
            var13[1] = var16 * var18;
            var9[0] = var8[2] * var13[6] + var8[0] * var13[0] + var8[1] * var13[3];
            var9[1] = var8[2] * var13[7] + var8[1] * var13[4] + var8[0] * var13[1];
            var9[2] = var8[2] * var13[8] + var8[1] * var13[5] + var8[0] * var13[2];
            var9[3] = var8[5] * var13[6] + var8[3] * var13[0] + var8[4] * var13[3];
            var9[4] = var8[5] * var13[7] + var8[3] * var13[1] + var8[4] * var13[4];
            var9[5] = var8[5] * var13[8] + var8[3] * var13[2] + var8[4] * var13[5];
            var9[6] = var8[8] * var13[6] + var8[7] * var13[3] + var8[6] * var13[0];
            var9[7] = var8[8] * var13[7] + var8[7] * var13[4] + var8[6] * var13[1];
            var9[8] = var8[8] * var13[8] + var8[7] * var13[5] + var8[6] * var13[2];
        }
        var9[6] *= arg0;
        var9[8] *= arg0;
        var9[1] *= arg6;
        var9[0] *= arg6;
        var9[3] *= arg3;
        var9[7] *= arg0;
        var9[4] *= arg3;
        var9[2] *= arg6;
        var9[5] *= arg3;
        return var9;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(I)V")
    public static final void method686(int arg0) {
        field1254++;
        if (arg0 != 27830) {
            method685(-0.6709184F, -87, 15, 1.5202898F, -112, -72, -0.30057016F, -31);
        }
        int[] var1 = new int[class300.field4608.field4787];
        int var2 = 0;
        for (int var3 = 0; var3 < class300.field4608.field4787; var3++) {
            class221 var5 = class300.field4608.method2088(var3, 117);
            if (var5.field3309 >= 0 || var5.field3334 >= 0) {
                var1[var2++] = var3;
            }
        }
        class267.field4251 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            class267.field4251[var4] = var1[var4];
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(B)V")
    public static final void method687(byte arg0) {
        field1266 = class114.field1755.field316 + class114.field1755.field313 + 2;
        field1261++;
        class86.field1390 = class447.field6643.field313 + class447.field6643.field316 + 2;
        if (arg0 > -4) {
            method685(1.8717755F, -1, 65, -0.41685468F, -126, -92, 0.782419F, 91);
        }
        class86.field1415 = new String[500];
        for (int var1 = 0; var1 < class86.field1415.length; var1++) {
            class86.field1415[var1] = "";
        }
    }

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "(B)I")
    public final int method688(byte arg0) {
        if (arg0 <= 22) {
            method690((byte) 112);
        }
        field1260++;
        return (this.field1265 & 0x8) == 8 ? 1 : 0;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(BI)V")
    public static final void method689(byte arg0, int arg1) {
        field1255++;
        if (arg0 != -124) {
            method690((byte) 78);
        }
        class188 var2 = class10.method48((byte) 58, 9, arg1);
        var2.method1306(-23128);
    }

    @OriginalMember(owner = "client!ok", name = "c", descriptor = "(B)V")
    public static void method690(byte arg0) {
        if (arg0 > -45) {
            field1266 = -14;
        }
        field1257 = null;
    }

    @OriginalMember(owner = "client!ok", name = "d", descriptor = "(B)I")
    public final int method691(byte arg0) {
        if (arg0 >= -101) {
            method686(-76);
        }
        field1253++;
        return this.field1265 & 0x7;
    }

    @OriginalMember(owner = "client!ok", name = "<init>", descriptor = "()V")
    public class74() {
    }

    @OriginalMember(owner = "client!ok", name = "<init>", descriptor = "(Lfh;)V")
    public class74(class194 arg0) {
        this.field1265 = arg0.method1398(34);
        this.field1252 = arg0.method1396(-82);
        this.field1263 = arg0.method1401(125);
        this.field1259 = arg0.method1401(124);
        this.field1262 = arg0.method1401(126);
        this.field1264 = arg0.method1401(-46);
    }
}
