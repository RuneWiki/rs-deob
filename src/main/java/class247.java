import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public class class247 extends class179 {

    @OriginalMember(owner = "client!nf", name = "Y", descriptor = "I")
    private int field4212 = 32768;

    @OriginalMember(owner = "client!nf", name = "R", descriptor = "I")
    public static int field4205 = 0;

    @OriginalMember(owner = "client!nf", name = "X", descriptor = "Lij;")
    public static class175 field4211 = new class175();

    @OriginalMember(owner = "client!nf", name = "bb", descriptor = "Lke;")
    public static class256 field4215 = class316.method2202("p11_full", 27626);

    @OriginalMember(owner = "client!nf", name = "Q", descriptor = "I")
    public static int field4204;

    @OriginalMember(owner = "client!nf", name = "S", descriptor = "I")
    public static int field4206;

    @OriginalMember(owner = "client!nf", name = "T", descriptor = "I")
    public static int field4207;

    @OriginalMember(owner = "client!nf", name = "U", descriptor = "I")
    public static int field4208;

    @OriginalMember(owner = "client!nf", name = "V", descriptor = "I")
    public static int field4209;

    @OriginalMember(owner = "client!nf", name = "W", descriptor = "I")
    public static int field4210;

    @OriginalMember(owner = "client!nf", name = "Z", descriptor = "I")
    public static int field4213;

    @OriginalMember(owner = "client!nf", name = "ab", descriptor = "I")
    public static int field4214;

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(Z)[F", line = 6)
    public static final float[] method1667(boolean arg0) {
        float var1 = class169.method1228() + class169.method1226();
        if (!arg0) {
            method1669(69);
        }
        field4214++;
        int var2 = class169.method1235();
        class15.field208[3] = 1.0F;
        float var3 = (float) (var2 >> 8 & 0xFF) / 255.0F;
        float var4 = (float) ((var2 & 0xFF3A68) >> 16) / 255.0F;
        float var5 = (float) (var2 & 0xFF) / 255.0F;
        float var6 = 0.58823526F;
        class15.field208[0] = class124.field2204[0] * var4 * var6 * var1;
        class15.field208[2] = class124.field2204[2] * var5 * var6 * var1;
        class15.field208[1] = class124.field2204[1] * var3 * var6 * var1;
        return class15.field208;
    }

    @OriginalMember(owner = "client!nf", name = "j", descriptor = "(I)V", line = 35)
    public static void method1668(int arg0) {
        field4215 = null;
        field4211 = null;
        if (arg0 != -1) {
            field4213 = 85;
        }
    }

    @OriginalMember(owner = "client!nf", name = "k", descriptor = "(I)Lrd;", line = 46)
    public static final class135 method1669(int arg0) {
        field4208++;
        int var1 = class94.field1692[0] * class62.field1093[0];
        byte[] var2 = class6.field92[arg0];
        int[] var3 = new int[var1];
        for (int var4 = 0; var4 < var1; var4++) {
            var3[var4] = class305.field5270[class150.method1123(255, var2[var4])];
        }
        class135 var5;
        if (class253.field4323) {
            var5 = new class87(class142.field2486, class153.field2740, class13.field172[0], class307.field5283[0], class94.field1692[0], class62.field1093[0], var3);
        } else {
            var5 = new class227(class142.field2486, class153.field2740, class13.field172[0], class307.field5283[0], class94.field1692[0], class62.field1093[0], var3);
        }
        class183.method1343(255);
        return var5;
    }

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "(II)[[I", line = 75)
    public final int[][] method55(int arg0, int arg1) {
        field4204++;
        int[][] var3 = this.field3169.method463(arg1, arg0 - 74);
        if (arg0 != 75) {
            this.method418((byte) 77);
        }
        if (this.field3169.field1080) {
            int[] var4 = this.method1312(1, arg1, (byte) 123);
            int[] var5 = this.method1312(2, arg1, (byte) 115);
            int[] var6 = var3[2];
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            for (int var9 = 0; var9 < class161.field2858; var9++) {
                int var10 = var4[var9] * 255 >> 12 & 0xFF;
                int var11 = var5[var9] * this.field4212 >> 12;
                int var12 = class321.field5494[var10] * var11 >> 12;
                int var13 = class104.field1856[var10] * var11 >> 12;
                int var14 = (var12 >> 12) + var9 & class285.field4945;
                int var15 = class19.field255 & (var13 >> 12) + arg1;
                int[][] var16 = this.method1314(var15, 158, 0);
                var7[var9] = var16[0][var14];
                var8[var9] = var16[1][var14];
                var6[var9] = var16[2][var14];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(ILra;I)V", line = 135)
    public final void method54(int arg0, class41 arg1, int arg2) {
        field4206++;
        if (arg2 == 0) {
            this.field4212 = arg1.method346(-16) << 4;
        } else if (arg2 == 1) {
            this.field3153 = arg1.method357(false) == 1;
        }
        if (arg0 <= 108) {
            this.method54(-50, (class41) null, -107);
        }
    }

    @OriginalMember(owner = "client!nf", name = "<init>", descriptor = "()V", line = 173)
    public class247() {
        super(3, false);
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(II)[I", line = 191)
    public final int[] method41(int arg0, int arg1) {
        int[] var3 = this.field3157.method1258(-77, arg0);
        if (this.field3157.field3081) {
            int[] var4 = this.method1312(1, arg0, (byte) 114);
            int[] var5 = this.method1312(2, arg0, (byte) 10);
            for (int var6 = 0; var6 < class161.field2858; var6++) {
                int var7 = var5[var6] * this.field4212 >> 12;
                int var8 = var4[var6] >> 4 & 0xFF;
                int var9 = class321.field5494[var8] * var7 >> 12;
                int var10 = class104.field1856[var8] * var7 >> 12;
                int var11 = (var9 >> 12) + var6 & class285.field4945;
                int var12 = arg0 + (var10 >> 12) & class19.field255;
                int[] var13 = this.method1312(0, var12, (byte) -43);
                var3[var6] = var13[var11];
            }
        }
        if (arg1 != -31598) {
            field4211 = (class175) null;
        }
        field4207++;
        return var3;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(B)V", line = 238)
    public final void method418(byte arg0) {
        class118.method803((byte) -88);
        if (arg0 != -110) {
            method1670(86, 127, -66, -93, 79);
        }
        field4209++;
    }

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "(IIIII)V", line = 252)
    public static final void method1670(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4210++;
        if (class71.field1313 == 1) {
            class5.field75[class143.field2511 / 100].method637(class114.field2012 - 8, class9.field143 + -8);
        }
        if (arg3 != 57092108) {
            field4213 = -12;
        }
        if (class71.field1313 == 2) {
            class5.field75[class143.field2511 / 100 + 4].method637(class114.field2012 - 8, class9.field143 + -8);
        }
        class171.method1246((byte) 85);
    }
}
