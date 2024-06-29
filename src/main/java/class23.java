import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public class class23 {

    @OriginalMember(owner = "client!mi", name = "f", descriptor = "Z")
    public static boolean field309 = false;

    @OriginalMember(owner = "client!mi", name = "e", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field308 = new BigInteger("10001", 16);

    @OriginalMember(owner = "client!mi", name = "i", descriptor = "Lvh;")
    public static class125 field312 = new class125(14, 3);

    @OriginalMember(owner = "client!mi", name = "l", descriptor = "Leda;")
    public static class116 field315 = new class116(112, 0);

    @OriginalMember(owner = "client!mi", name = "m", descriptor = "Z")
    public static boolean field316 = true;

    @OriginalMember(owner = "client!mi", name = "n", descriptor = "[Z")
    public static boolean[] field317 = new boolean[8];

    @OriginalMember(owner = "client!mi", name = "d", descriptor = "I")
    public static int field307;

    @OriginalMember(owner = "client!mi", name = "h", descriptor = "I")
    public static int field311;

    @OriginalMember(owner = "client!mi", name = "k", descriptor = "I")
    public static int field314;

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "Lvo;")
    public static class345 field305;

    @OriginalMember(owner = "client!mi", name = "j", descriptor = "[B")
    public byte[] field313;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "[S")
    public short[] field304;

    @OriginalMember(owner = "client!mi", name = "c", descriptor = "[S")
    public short[] field306;

    @OriginalMember(owner = "client!mi", name = "g", descriptor = "[S")
    public short[] field310;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(ZLpn;B)V")
    public static final void method219(boolean arg0, class295 arg1, byte arg2) {
        field307++;
        class313.field4341.method1052(arg2 ^ 0x626B, arg1);
        if (arg0) {
            class605.method3443(6248, class156.field2569, class313.field4341, class233.field3455, class445.field6444, arg1);
        }
        if (arg2 != 10) {
            method220((byte) -98);
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(B)V")
    public static final void method220(byte arg0) {
        if (class121.field1983 == 1 || class121.field1983 == 3 || class521.field7681 != class121.field1983 && (class121.field1983 == 0 || class521.field7681 == 0)) {
            class392.field5702 = 0;
            class310.field4304 = 0;
            class314.field4359.method2821(1);
        }
        field311++;
        class521.field7681 = class121.field1983;
        if (arg0 != -10) {
            field305 = null;
        }
    }

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "(B)V")
    public static void method221(byte arg0) {
        field308 = null;
        field305 = null;
        if (arg0 != 12) {
            field316 = true;
        }
        field312 = null;
        field317 = null;
        field315 = null;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(IIFFIIIF)[F")
    public static final float[] method222(int arg0, int arg1, float arg2, float arg3, int arg4, int arg5, int arg6, float arg7) {
        field314++;
        float[] var8 = new float[9];
        float[] var9 = new float[9];
        float var10 = (float) Math.cos((double) ((float) arg4 * 0.024543693F));
        float var11 = (float) Math.sin((double) ((float) arg4 * 0.024543693F));
        var8[0] = var10;
        var8[4] = 1.0F;
        var8[6] = -var11;
        var8[2] = var11;
        var8[7] = 0.0F;
        var8[1] = 0.0F;
        var8[5] = 0.0F;
        var8[arg0] = var10;
        var8[3] = 0.0F;
        float var12 = 1.0F - var10;
        float[] var13 = new float[9];
        float var14 = 1.0F;
        float var15 = 0.0F;
        float var16 = (float) arg1 / 32767.0F;
        float var17 = -((float) Math.sqrt((double) (1.0F - (var16 * var16))));
        float var18 = 1.0F - var16;
        float var19 = (float) Math.sqrt((double) (arg5 * arg5 + arg6 * arg6));
        if (var19 == 0.0F && var16 == 0.0F) {
            var9 = var8;
        } else {
            if (var19 != 0.0F) {
                var14 = (float) (-arg5) / var19;
                var15 = (float) arg6 / var19;
            }
            var13[3] = -var15 * var17;
            var13[0] = var14 * var14 * var18 + var16;
            var13[4] = var16;
            var13[2] = var14 * var15 * var18;
            var13[6] = var14 * var15 * var18;
            var13[1] = var15 * var17;
            var13[5] = var14 * var17;
            var13[7] = -var14 * var17;
            var13[8] = var15 * var15 * var18 + var16;
            var9[0] = var8[2] * var13[6] + var8[1] * var13[3] + var8[0] * var13[0];
            var9[1] = var8[2] * var13[7] + var8[1] * var13[4] + var8[0] * var13[1];
            var9[2] = var8[2] * var13[8] + var8[0] * var13[2] + var8[1] * var13[5];
            var9[3] = var8[5] * var13[6] + var8[4] * var13[3] + var8[3] * var13[0];
            var9[4] = var8[5] * var13[7] + var8[3] * var13[1] + var8[4] * var13[4];
            var9[5] = var8[5] * var13[8] + var8[3] * var13[2] + var8[4] * var13[5];
            var9[6] = var8[8] * var13[6] + var8[6] * var13[0] + var8[7] * var13[3];
            var9[7] = var8[8] * var13[7] + var8[7] * var13[4] + var8[6] * var13[1];
            var9[8] = var8[8] * var13[8] + var8[6] * var13[2] + var8[7] * var13[5];
        }
        var9[4] *= arg2;
        var9[8] *= arg3;
        var9[5] *= arg2;
        var9[3] *= arg2;
        var9[1] *= arg7;
        var9[6] *= arg3;
        var9[2] *= arg7;
        var9[7] *= arg3;
        var9[0] *= arg7;
        return var9;
    }
}
