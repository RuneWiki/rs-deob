import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public class class290 extends class335 {

    @OriginalMember(owner = "client!ii", name = "R", descriptor = "Ljava/lang/String;")
    public static String field4517 = "flash2:";

    @OriginalMember(owner = "client!ii", name = "L", descriptor = "I")
    public static int field4511;

    @OriginalMember(owner = "client!ii", name = "M", descriptor = "I")
    public static int field4512;

    @OriginalMember(owner = "client!ii", name = "O", descriptor = "I")
    public static int field4514;

    @OriginalMember(owner = "client!ii", name = "Q", descriptor = "I")
    public static int field4516;

    @OriginalMember(owner = "client!ii", name = "S", descriptor = "I")
    public static int field4518;

    @OriginalMember(owner = "client!ii", name = "T", descriptor = "I")
    public static int field4519;

    @OriginalMember(owner = "client!ii", name = "N", descriptor = "Lah;")
    public static class126 field4513;

    @OriginalMember(owner = "client!ii", name = "P", descriptor = "[[S")
    public static short[][] field4515;

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(IB)[[I", line = 4)
    public final int[][] method249(int arg0, byte arg1) {
        field4514++;
        int[][] var3 = this.field5232.method1101(arg0, true);
        if (arg1 != 51) {
            this.method149(83, 37);
        }
        if (this.field5232.field2446) {
            int[][] var4 = this.method2328(arg0, false, 0);
            int[] var5 = var4[0];
            int[] var6 = var3[0];
            int[] var7 = var4[2];
            int[] var8 = var4[1];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class105.field1630; var11++) {
                var6[var11] = 4096 - var5[var11];
                var9[var11] = 4096 - var8[var11];
                var10[var11] = 4096 - var7[var11];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ii", name = "f", descriptor = "(I)V", line = 52)
    public static final void method1988(int arg0) {
        field4512++;
        int var1 = class67.field1118 * 128 + 64;
        int var2 = class61.field983 * 128 + 64;
        int var3 = class320.method2181(var1, var2, -106, class205.field3101) - class62.field994;
        if (class276.field4264 >= 100) {
            class337.field5278 = class67.field1118 * 128 + 64;
            class265.field4116 = class61.field983 * 128 + 64;
            class258.field4052 = class320.method2181(class337.field5278, class265.field4116, -51, class205.field3101) - class62.field994;
        } else {
            if (class258.field4052 < var3) {
                class258.field4052 += (var3 - class258.field4052) * class276.field4264 / 1000 + class1.field14;
                if (class258.field4052 > var3) {
                    class258.field4052 = var3;
                }
            }
            if (class258.field4052 > var3) {
                class258.field4052 -= (class258.field4052 - var3) * class276.field4264 / 1000 + class1.field14;
                if (var3 > class258.field4052) {
                    class258.field4052 = var3;
                }
            }
            if (class337.field5278 < var1) {
                class337.field5278 += (var1 - class337.field5278) * class276.field4264 / 1000 + class1.field14;
                if (var1 < class337.field5278) {
                    class337.field5278 = var1;
                }
            }
            if (class337.field5278 > var1) {
                class337.field5278 -= class1.field14 + ((class337.field5278 - var1) * class276.field4264 / 1000);
                if (var1 > class337.field5278) {
                    class337.field5278 = var1;
                }
            }
            if (var2 > class265.field4116) {
                class265.field4116 += (var2 - class265.field4116) * class276.field4264 / 1000 + class1.field14;
                if (var2 < class265.field4116) {
                    class265.field4116 = var2;
                }
            }
            if (class265.field4116 > var2) {
                class265.field4116 -= (class265.field4116 - var2) * class276.field4264 / 1000 + class1.field14;
                if (class265.field4116 < var2) {
                    class265.field4116 = var2;
                }
            }
        }
        int var4 = class188.field2806 * 128 + 64;
        int var5 = class85.field1376 * 128 + 64;
        int var6 = class320.method2181(var4, var5, -68, class205.field3101) - class156.field2335;
        int var7 = 44 % ((1 - arg0) / 52);
        int var8 = var4 - class337.field5278;
        int var9 = var6 - class258.field4052;
        int var10 = var5 - class265.field4116;
        int var11 = (int) Math.sqrt((double) (var8 * var8 + var10 * var10));
        int var12 = (int) (Math.atan2((double) var9, (double) var11) * 325.949D) & 0x7FF;
        int var13 = (int) (Math.atan2((double) var8, (double) var10) * -325.949D) & 0x7FF;
        if (var12 < 128) {
            var12 = 128;
        }
        int var14 = var13 - class218.field3323;
        if (var14 > 1024) {
            var14 -= 2048;
        }
        if (var14 < -1024) {
            var14 += 2048;
        }
        if (var14 > 0) {
            class218.field3323 += class300.field4687 * var14 / 1000 + class30.field442;
            class218.field3323 &= 0x7FF;
        }
        if (var14 < 0) {
            class218.field3323 -= -var14 * class300.field4687 / 1000 + class30.field442;
            class218.field3323 &= 0x7FF;
        }
        int var15 = var13 - class218.field3323;
        if (var15 > 1024) {
            var15 -= 2048;
        }
        if (var12 > 383) {
            var12 = 383;
        }
        if (class194.field2897 < var12) {
            class194.field2897 += class30.field442 + ((var12 - class194.field2897) * class300.field4687 / 1000);
            if (class194.field2897 > var12) {
                class194.field2897 = var12;
            }
        }
        if (var12 < class194.field2897) {
            class194.field2897 -= (class194.field2897 - var12) * class300.field4687 / 1000 + class30.field442;
            if (var12 > class194.field2897) {
                class194.field2897 = var12;
            }
        }
        if (var15 < -1024) {
            var15 += 2048;
        }
        if (var15 < 0 && var14 > 0 || var15 > 0 && var14 < 0) {
            class218.field3323 = var13;
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "()V", line = 207)
    public static final void method1989() {
        GL var0 = class94.field1473;
        var0.glDisableClientState(32886);
        class94.method668(false);
        var0.glDisable(2929);
        var0.glPushAttrib(128);
        var0.glFogf(2915, 3072.0F);
        class94.method674();
        for (int var1 = 0; var1 < class184.field2766[0].length; var1++) {
            class127 var2 = class184.field2766[0][var1];
            if (var2.field1981 >= 0 && class89.method646((byte) -57, class15.field207.method2079((byte) 42, var2.field1981))) {
                var0.glColor4fv(class324.method2200(var2.field1982, 27182), 0);
                float var3 = 201.5F - (var2.field1972 ? 1.0F : 0.5F);
                var2.method919(class256.field4013, var3, true);
            }
        }
        var0.glEnableClientState(32886);
        class94.method692();
        var0.glEnable(2929);
        var0.glPopAttrib();
        class94.method683();
    }

    @OriginalMember(owner = "client!ii", name = "<init>", descriptor = "()V", line = 242)
    public class290() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(B[Ljava/lang/String;)[Ljava/lang/String;", line = 252)
    public static final String[] method1990(byte arg0, String[] arg1) {
        String[] var2 = new String[5];
        field4511++;
        if (arg0 <= 125) {
            return (String[]) null;
        }
        for (int var3 = 0; var3 < 5; var3++) {
            var2[var3] = var3 + ": ";
            if (arg1 != null && arg1[var3] != null) {
                var2[var3] = var2[var3] + arg1[var3];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ii", name = "g", descriptor = "(I)V", line = 277)
    public static void method1991(int arg0) {
        field4513 = null;
        field4515 = (short[][]) null;
        int var1 = -113 / ((46 - arg0) / 53);
        field4517 = null;
    }

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "(II)[I", line = 295)
    public final int[] method149(int arg0, int arg1) {
        if (arg1 != 621) {
            field4517 = (String) null;
        }
        int[] var3 = this.field5233.method1110((byte) 108, arg0);
        field4518++;
        if (this.field5233.field2467) {
            int[] var4 = this.method2330(arg0, true, 0);
            for (int var5 = 0; var5 < class105.field1630; var5++) {
                var3[var5] = 4096 - var4[var5];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(ILkh;I)V", line = 324)
    public final void method230(int arg0, class166 arg1, int arg2) {
        if (arg2 < 51) {
            field4519 = 13;
        }
        field4516++;
        if (arg0 == 0) {
            this.field5234 = arg1.method1178(0) == 1;
        }
    }
}
