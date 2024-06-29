import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class70 extends class170 {

    @OriginalMember(owner = "client!kd", name = "db", descriptor = "I")
    private int field1316 = 4096;

    @OriginalMember(owner = "client!kd", name = "V", descriptor = "Lmh;")
    public static class128 field1308 = class22.method156(124, "; version=1; path=)4; domain=");

    @OriginalMember(owner = "client!kd", name = "U", descriptor = "D")
    public static double field1307 = -1.0D;

    @OriginalMember(owner = "client!kd", name = "W", descriptor = "J")
    public static long field1309 = 0L;

    @OriginalMember(owner = "client!kd", name = "ab", descriptor = "Lmh;")
    public static class128 field1313 = class22.method156(122, "");

    @OriginalMember(owner = "client!kd", name = "cb", descriptor = "I")
    public static int field1315 = 0;

    @OriginalMember(owner = "client!kd", name = "R", descriptor = "F")
    public static float field1304;

    @OriginalMember(owner = "client!kd", name = "S", descriptor = "I")
    public static int field1305;

    @OriginalMember(owner = "client!kd", name = "T", descriptor = "I")
    public static int field1306;

    @OriginalMember(owner = "client!kd", name = "X", descriptor = "I")
    public static int field1310;

    @OriginalMember(owner = "client!kd", name = "Y", descriptor = "I")
    public static int field1311;

    @OriginalMember(owner = "client!kd", name = "Z", descriptor = "Lek;")
    public static class174 field1312;

    @OriginalMember(owner = "client!kd", name = "bb", descriptor = "Lfb;")
    public static class55 field1314;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(ILbg;B)V", line = 4)
    public final void method63(int arg0, class194 arg1, byte arg2) {
        if (arg0 == 0) {
            this.field1316 = arg1.method1308(-120);
        }
        field1310++;
        if (arg2 != 13) {
            field1315 = 14;
        }
    }

    @OriginalMember(owner = "client!kd", name = "e", descriptor = "(B)V", line = 26)
    public static void method467(byte arg0) {
        field1313 = null;
        field1314 = null;
        if (arg0 != 87) {
            field1304 = 0.87613785F;
        }
        field1312 = null;
        field1308 = null;
    }

    @OriginalMember(owner = "client!kd", name = "f", descriptor = "(B)[F", line = 39)
    public static final float[] method468(byte arg0) {
        field1306++;
        int var1 = -36 % ((arg0 + 60) / 43);
        float var2 = class119.method715() + class119.method720();
        int var3 = class119.method721();
        class51.field1003[3] = 1.0F;
        float var4 = (float) ((var3 & 0xFFEFF5) >> 16) / 255.0F;
        float var5 = (float) ((var3 & 0xFF79) >> 8) / 255.0F;
        float var6 = (float) (var3 & 0xFF) / 255.0F;
        float var7 = 0.58823526F;
        class51.field1003[0] = class123.field2090[0] * var4 * var7 * var2;
        class51.field1003[1] = class123.field2090[1] * var5 * var7 * var2;
        class51.field1003[2] = class123.field2090[2] * var6 * var7 * var2;
        return class51.field1003;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(II[[FZII[Z[[I[[FBZILac;ZZ[[F[I[[IIIII)V", line = 67)
    public static final void method469(int arg0, int arg1, float[][] arg2, boolean arg3, int arg4, int arg5, boolean[] arg6, int[][] arg7, float[][] arg8, byte arg9, boolean arg10, int arg11, class154 arg12, boolean arg13, boolean arg14, float[][] arg15, int[] arg16, int[][] arg17, int arg18, int arg19, int arg20, int arg21) {
        field1311++;
        int var22 = (arg18 << 8) + (arg10 ? 255 : 0);
        int var23 = (arg5 << 8) + (arg3 ? 255 : 0);
        int var24 = (arg14 ? 255 : 0) + (arg1 << 8);
        int var25 = (arg0 << 8) + (arg13 ? 255 : 0);
        if (arg21 != -816241496) {
            return;
        }
        int[] var26 = new int[arg16.length / 2];
        for (int var27 = 0; var27 < var26.length; var27++) {
            int var28 = arg16[var27 + var27 + 1];
            int[][] var29 = arg17 == null || arg6 == null || !arg6[var27] ? arg7 : arg17;
            int var30 = arg16[var27 + var27];
            var26[var27] = class42.method285((byte) 103, false, arg12, var24, var22, var23, arg8, var28, arg17, var29, arg15, var30, var25, (float) arg19, arg2, arg9, arg11, arg20);
        }
        arg12.method1025(arg4, arg20, arg11, var26, (int[]) null, false);
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(BI)[I", line = 118)
    public final int[] method69(byte arg0, int arg1) {
        if (arg0 != 85) {
            method469(2, 71, (float[][]) ((float[][]) null), true, -4, 24, (boolean[]) null, (int[][]) ((int[][]) null), (float[][]) ((float[][]) null), (byte) -95, false, -100, (class154) null, false, false, (float[][]) ((float[][]) null), (int[]) null, (int[][]) ((int[][]) null), -115, 55, 22, -32);
        }
        field1305++;
        int[] var3 = this.field2977.method1838(false, arg1);
        if (this.field2977.field4552) {
            int[] var4 = this.method1142((byte) 44, 0, arg1 - 1 & class297.field5073);
            int[] var5 = this.method1142((byte) 44, 0, arg1);
            int[] var6 = this.method1142((byte) 44, 0, arg1 + 1 & class297.field5073);
            for (int var7 = 0; var7 < class185.field3225; var7++) {
                int var8 = (var6[var7] - var4[var7]) * this.field1316;
                int var9 = (var5[var7 + 1 & class5.field94] - var5[class5.field94 & var7 - 1]) * this.field1316;
                int var10 = var9 >> 12;
                int var11 = var10 * var10 >> 12;
                int var12 = var8 >> 12;
                int var13 = var12 * var12 >> 12;
                int var14 = (int) (Math.sqrt((double) ((float) (var11 + var13 + 4096) / 4096.0F)) * 4096.0D);
                int var15 = var14 == 0 ? 0 : 16777216 / var14;
                var3[var7] = 4096 - var15;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!kd", name = "<init>", descriptor = "()V", line = 185)
    public class70() {
        super(1, true);
    }
}
