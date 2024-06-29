import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public class class662 {

    @OriginalMember(owner = "client!jk", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field9439 = new String[] { method4809(method4808("VcK\u0003\u0019o|\u0017\u001e\u0018[ ")), method4809(method4808("VcK5^")), method4809(method4808("VcK2^")), method4809(method4808("VcK3^")), method4809(method4808("VcK6^")), method4809(method4808("VcK4^")) };

    @OriginalMember(owner = "client!jk", name = "g", descriptor = "Lpe;")
    public static class636 field9435 = new class636(1, 2, 2, 0);

    @OriginalMember(owner = "client!jk", name = "d", descriptor = "I")
    public static int field9431;

    @OriginalMember(owner = "client!jk", name = "c", descriptor = "I")
    public static int field9432;

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "I")
    public static int field9433;

    @OriginalMember(owner = "client!jk", name = "e", descriptor = "I")
    public static int field9434;

    @OriginalMember(owner = "client!jk", name = "f", descriptor = "I")
    public static int field9436;

    @OriginalMember(owner = "client!jk", name = "h", descriptor = "J")
    public static long field9438;

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "Lha;")
    public static class63 field9437;

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(FFIIFIII)[F", line = 3)
    public static final float[] method4803(float arg0, float arg1, int arg2, int arg3, float arg4, int arg5, int arg6, int arg7) {
        try {
            field9434++;
            float[] var8 = new float[9];
            float[] var9 = new float[9];
            if (arg7 <= 114) {
                method4807(-126, (byte) 5, -10);
            }
            float var10 = (float) Math.cos((double) ((float) arg2 * 0.024543693F));
            float var11 = (float) Math.sin((double) ((float) arg2 * 0.024543693F));
            var8[7] = 0.0F;
            var8[8] = var10;
            var8[5] = 0.0F;
            float var12 = 1.0F - var10;
            var8[4] = 1.0F;
            var8[0] = var10;
            var8[2] = var11;
            var8[6] = -var11;
            var8[1] = 0.0F;
            var8[3] = 0.0F;
            float[] var13 = new float[9];
            float var14 = 1.0F;
            float var15 = 0.0F;
            float var16 = (float) arg6 / 32767.0F;
            float var17 = -((float) Math.sqrt((double) (1.0F - (var16 * var16))));
            float var18 = 1.0F - var16;
            float var19 = (float) Math.sqrt((double) (arg5 * arg5 + (arg3 * arg3)));
            if (var19 == 0.0F && var16 == 0.0F) {
                var9 = var8;
            } else {
                if (var19 != 0.0F) {
                    var15 = (float) arg5 / var19;
                    var14 = (float) (-arg3) / var19;
                }
                var13[6] = var14 * var15 * var18;
                var13[8] = var15 * var15 * var18 + var16;
                var13[0] = var14 * var14 * var18 + var16;
                var13[7] = -var14 * var17;
                var13[5] = var14 * var17;
                var13[1] = var15 * var17;
                var13[2] = var14 * var15 * var18;
                var13[3] = -var15 * var17;
                var13[4] = var16;
                var9[0] = var8[2] * var13[6] + var8[0] * var13[0] + var8[1] * var13[3];
                var9[1] = var8[2] * var13[7] + var8[1] * var13[4] + var8[0] * var13[1];
                var9[3] = var8[5] * var13[6] + var8[3] * var13[0] + var8[4] * var13[3];
                var9[2] = var8[2] * var13[8] + var8[0] * var13[2] + var8[1] * var13[5];
                var9[4] = var8[5] * var13[7] + var8[4] * var13[4] + var8[3] * var13[1];
                var9[6] = var8[8] * var13[6] + var8[6] * var13[0] + var8[7] * var13[3];
                var9[5] = var8[5] * var13[8] + var8[4] * var13[5] + var8[3] * var13[2];
                var9[7] = var8[8] * var13[7] + var8[6] * var13[1] + var8[7] * var13[4];
                var9[8] = var8[8] * var13[8] + var8[7] * var13[5] + var8[6] * var13[2];
            }
            var9[2] *= arg1;
            var9[8] *= arg0;
            var9[6] *= arg0;
            var9[0] *= arg1;
            var9[1] *= arg1;
            var9[3] *= arg4;
            var9[5] *= arg4;
            var9[7] *= arg0;
            var9[4] *= arg4;
            return var9;
        } catch (RuntimeException var21) {
            throw class590.method4333(var21, field9439[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(IZ)I", line = 85)
    public static final int method4804(int arg0, boolean arg1) {
        try {
            if (arg1) {
                field9437 = null;
            }
            field9433++;
            return arg0 >>> 7;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field9439[5] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!jk", name = "toString", descriptor = "()Ljava/lang/String;", line = 96)
    public final String toString() {
        try {
            field9436++;
            throw new IllegalStateException();
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field9439[0] + ')');
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(I)V", line = 107)
    public static void method4805(int arg0) {
        try {
            field9437 = null;
            if (arg0 == -4236) {
                field9435 = null;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field9439[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(III)I", line = 120)
    public final int method4806(int arg0, int arg1, int arg2) {
        try {
            if (arg2 >= -27) {
                field9435 = null;
            }
            field9431++;
            int var4 = arg0 >= class64.field881 ? arg0 : class64.field881;
            if (class628.field9046 == this) {
                return 0;
            } else if (class302.field4874 == this) {
                return var4 - arg1;
            } else if (class533.field7816 == this) {
                return (var4 - arg1) / 2;
            } else {
                return 0;
            }
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field9439[2] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(IBI)Z", line = 154)
    public static final boolean method4807(int arg0, byte arg1, int arg2) {
        try {
            field9432++;
            if (arg1 != 109) {
                method4807(-109, (byte) -10, 63);
            }
            return class441.method3459(arg2, 55, arg0) & (class647.method4711((byte) -76, arg2, arg0) | (arg0 & 0x2000) != 0 | class305.method2616(arg2, arg0, (byte) -116));
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field9439[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!jk", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4808(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x76);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!jk", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4809(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 60;
                    break;
                case 1:
                    var10005 = 8;
                    break;
                case 2:
                    var10005 = 101;
                    break;
                case 3:
                    var10005 = 119;
                    break;
                default:
                    var10005 = 118;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
