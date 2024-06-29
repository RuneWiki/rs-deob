import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public class class153 {

    @OriginalMember(owner = "client!vf", name = "k", descriptor = "I")
    public int field1956 = -1;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "I")
    public static int field1946;

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "I")
    public static int field1947;

    @OriginalMember(owner = "client!vf", name = "d", descriptor = "I")
    public static int field1949;

    @OriginalMember(owner = "client!vf", name = "e", descriptor = "I")
    public static int field1950;

    @OriginalMember(owner = "client!vf", name = "f", descriptor = "I")
    public static int field1951;

    @OriginalMember(owner = "client!vf", name = "i", descriptor = "I")
    public static int field1954;

    @OriginalMember(owner = "client!vf", name = "j", descriptor = "I")
    public static int field1955;

    @OriginalMember(owner = "client!vf", name = "h", descriptor = "Lch;")
    public class464 field1953;

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "[I")
    public int[] field1948;

    @OriginalMember(owner = "client!vf", name = "g", descriptor = "[Ljava/lang/String;")
    public String[] field1952;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(II)V")
    public static final void method928(int arg0, int arg1) {
        class206.method1148(3);
        field1950++;
        int var2 = class684.field9522.method785(arg0, 16).field2133;
        if (var2 == 0) {
            return;
        }
        int var3 = class386.field5455.field8792[arg0];
        if (arg1 != 1864) {
            return;
        }
        if (var2 == 6) {
            class440.field6150 = var3;
        }
        if (var2 == 5) {
            class760.field10603 = var3;
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(BIFFIIFI)[F")
    public static final float[] method929(byte arg0, int arg1, float arg2, float arg3, int arg4, int arg5, float arg6, int arg7) {
        field1955++;
        float[] var8 = new float[9];
        float[] var9 = new float[9];
        float var10 = (float) Math.cos((double) ((float) arg1 * 0.024543693F));
        float var11 = (float) Math.sin((double) ((float) arg1 * 0.024543693F));
        var8[4] = 1.0F;
        var8[1] = 0.0F;
        var8[0] = var10;
        var8[8] = var10;
        var8[5] = 0.0F;
        float var12 = 1.0F - var10;
        var8[2] = var11;
        var8[6] = -var11;
        var8[7] = 0.0F;
        var8[3] = 0.0F;
        float[] var13 = new float[9];
        float var14 = 1.0F;
        float var15 = (float) arg5 / 32767.0F;
        float var16 = 0.0F;
        float var17 = -((float) Math.sqrt((double) (1.0F - (var15 * var15))));
        float var18 = 1.0F - var15;
        float var19 = (float) Math.sqrt((double) (arg4 * arg4 + arg7 * arg7));
        if (var19 == 0.0F && var15 == 0.0F) {
            var9 = var8;
        } else {
            if (var19 != 0.0F) {
                var14 = (float) (-arg4) / var19;
                var16 = (float) arg7 / var19;
            }
            var13[7] = -var14 * var17;
            var13[3] = -var16 * var17;
            var13[8] = var16 * var16 * var18 + var15;
            var13[0] = var14 * var14 * var18 + var15;
            var13[1] = var16 * var17;
            var13[6] = var14 * var16 * var18;
            var13[2] = var14 * var16 * var18;
            var13[5] = var14 * var17;
            var13[4] = var15;
            var9[0] = var8[2] * var13[6] + var8[1] * var13[3] + var8[0] * var13[0];
            var9[1] = var8[2] * var13[7] + var8[0] * var13[1] + var8[1] * var13[4];
            var9[2] = var8[2] * var13[8] + var8[0] * var13[2] + var8[1] * var13[5];
            var9[3] = var8[5] * var13[6] + var8[4] * var13[3] + var8[3] * var13[0];
            var9[4] = var8[5] * var13[7] + var8[4] * var13[4] + var8[3] * var13[1];
            var9[6] = var8[8] * var13[6] + var8[7] * var13[3] + var8[6] * var13[0];
            var9[5] = var8[5] * var13[8] + var8[3] * var13[2] + var8[4] * var13[5];
            var9[7] = var8[8] * var13[7] + var8[6] * var13[1] + var8[7] * var13[4];
            var9[8] = var8[8] * var13[8] + var8[6] * var13[2] + var8[7] * var13[5];
        }
        var9[5] *= arg3;
        var9[6] *= arg6;
        var9[1] *= arg2;
        int var20 = 30 % ((17 - arg0) / 57);
        var9[3] *= arg3;
        var9[7] *= arg6;
        var9[2] *= arg2;
        var9[0] *= arg2;
        var9[4] *= arg3;
        var9[8] *= arg6;
        return var9;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(BLgg;ILgaa;)V")
    public static final void method930(byte arg0, class176 arg1, int arg2, class300 arg3) {
        field1954++;
        if (class635.field8835 >= 50 || arg3 == null || arg3.field4046 == null || arg3.field4046.length <= arg2 || arg3.field4046[arg2] == null) {
            return;
        }
        int var4 = arg3.field4046[arg2][0];
        int var5 = var4 >> 8;
        int var6 = (var4 & 0xEC) >> 5;
        int var7 = var4 & 0x1F;
        if (arg3.field4046[arg2].length > 1) {
            int var8 = (int) (Math.random() * (double) arg3.field4046[arg2].length);
            if (var8 > 0) {
                var5 = arg3.field4046[arg2][var8];
            }
        }
        int var9 = 256;
        if (arg3.field4031 != null && arg3.field4038 != null) {
            var9 = arg3.field4031[arg2] + (int) (Math.random() * (double) (arg3.field4038[arg2] - arg3.field4031[arg2]));
        }
        int var10 = arg3.field4028 == null ? 255 : arg3.field4028[arg2];
        if (var7 == 0) {
            if (class653.field9086 == arg1) {
                if (!arg3.field4034) {
                    class728.method4083(var9, (byte) 1, var5, var6, 0, var10);
                    return;
                }
                class595.method3297(-1962608884, var10, var6, var5, false, 0, var9);
            }
        } else if (class11.field68.field5516.method750((byte) 126) != 0) {
            int var11 = arg1.field2170 - 256 >> 9;
            if (arg0 < -125) {
                int var12 = arg1.field2165 - 256 >> 9;
                int var13 = class653.field9086 == arg1 ? 0 : (arg1.field2175 << 24) + (var12 << 8) + (var11 << 16) + var7;
                class643.field8975[class635.field8835++] = new class573((byte) (arg3.field4034 ? 2 : 1), var5, var6, 0, var10, var13, var9, arg1);
            }
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(ZIIIII)V")
    public static final void method931(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg2 != 3113) {
            return;
        }
        field1947++;
        long var6 = (long) ((arg0 ? Integer.MIN_VALUE : 0) | arg3);
        class369 var8 = (class369) class358.field4748.method2552(var6, -1);
        if (var8 == null) {
            var8 = new class369();
            class358.field4748.method2558(var8, var6, -1);
        }
        if (var8.field5172.length <= arg5) {
            int[] var9 = new int[arg5 + 1];
            int[] var10 = new int[arg5 + 1];
            for (int var11 = 0; var11 < var8.field5172.length; var11++) {
                var9[var11] = var8.field5172[var11];
                var10[var11] = var8.field5171[var11];
            }
            for (int var12 = var8.field5172.length; var12 < arg5; var12++) {
                var9[var12] = -1;
                var10[var12] = 0;
            }
            var8.field5172 = var9;
            var8.field5171 = var10;
        }
        var8.field5172[arg5] = arg4;
        var8.field5171[arg5] = arg1;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(III)Z")
    public static final boolean method932(int arg0, int arg1, int arg2) {
        field1949++;
        if (arg2 == -18021) {
            return (arg1 & 0x84080) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(BC)B")
    public static final byte method933(byte arg0, char arg1) {
        if (arg0 != 88) {
            method931(false, -74, -7, 18, 107, -123);
        }
        field1946++;
        byte var2;
        if (!(arg1 <= '\u0000' || arg1 >= '\u0080') || !(arg1 < ' ' || arg1 > 'ÿ')) {
            var2 = (byte) arg1;
        } else if (arg1 == '€') {
            var2 = -128;
        } else if (arg1 == '‚') {
            var2 = -126;
        } else if (arg1 == 'ƒ') {
            var2 = -125;
        } else if (arg1 == '„') {
            var2 = -124;
        } else if (arg1 == '…') {
            var2 = -123;
        } else if (arg1 == '†') {
            var2 = -122;
        } else if (arg1 == '‡') {
            var2 = -121;
        } else if (arg1 == 'ˆ') {
            var2 = -120;
        } else if (arg1 == '‰') {
            var2 = -119;
        } else if (arg1 == 'Š') {
            var2 = -118;
        } else if (arg1 == '‹') {
            var2 = -117;
        } else if (arg1 == 'Œ') {
            var2 = -116;
        } else if (arg1 == 'Ž') {
            var2 = -114;
        } else if (arg1 == '‘') {
            var2 = -111;
        } else if (arg1 == '’') {
            var2 = -110;
        } else if (arg1 == '“') {
            var2 = -109;
        } else if (arg1 == '”') {
            var2 = -108;
        } else if (arg1 == '•') {
            var2 = -107;
        } else if (arg1 == '–') {
            var2 = -106;
        } else if (arg1 == '—') {
            var2 = -105;
        } else if (arg1 == '˜') {
            var2 = -104;
        } else if (arg1 == '™') {
            var2 = -103;
        } else if (arg1 == 'š') {
            var2 = -102;
        } else if (arg1 == '›') {
            var2 = -101;
        } else if (arg1 == 'œ') {
            var2 = -100;
        } else if (arg1 == 'ž') {
            var2 = -98;
        } else if (arg1 == 'Ÿ') {
            var2 = -97;
        } else {
            var2 = 63;
        }
        return var2;
    }
}
