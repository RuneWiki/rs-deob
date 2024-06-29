import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class276 extends class303 {

    @OriginalMember(owner = "client!rf", name = "N", descriptor = "[I")
    public static int[] field4284 = new int[1000];

    @OriginalMember(owner = "client!rf", name = "G", descriptor = "I")
    public static int field4277;

    @OriginalMember(owner = "client!rf", name = "H", descriptor = "I")
    public static int field4278;

    @OriginalMember(owner = "client!rf", name = "J", descriptor = "I")
    public static int field4280;

    @OriginalMember(owner = "client!rf", name = "K", descriptor = "I")
    public static int field4281;

    @OriginalMember(owner = "client!rf", name = "L", descriptor = "I")
    public static int field4282;

    @OriginalMember(owner = "client!rf", name = "M", descriptor = "I")
    public static int field4283;

    @OriginalMember(owner = "client!rf", name = "O", descriptor = "I")
    public static int field4285;

    @OriginalMember(owner = "client!rf", name = "I", descriptor = "[[[B")
    public static byte[][][] field4279;

    @OriginalMember(owner = "client!rf", name = "e", descriptor = "(III)V", line = 5)
    public static final void method1978(int arg0, int arg1, int arg2) {
        short var3 = 256;
        int var4 = 0;
        field4283++;
        if (class11.field218 > 0) {
            class258.method1826(126, class11.field218);
            class11.field218 = 0;
        }
        int var5 = class182.field2910 * arg0;
        int var6 = 0;
        int var7 = 1;
        if (arg1 <= 80) {
            field4277 = 67;
        }
        while ((var3 - 1) > var7) {
            int var8 = (var3 - var7) * class213.field3401[var7] / var3;
            if (var8 < 0) {
                var8 = 0;
            }
            var4 += var8;
            for (int var9 = var8; var9 < 128; var9++) {
                int var10 = class207.field3270[var4++];
                int var11 = class182.field2913[arg2 + var5++];
                if (var10 == 0) {
                    class120.field1925.field117[var6++] = var11;
                } else {
                    int var12 = 256 - var10 - 18;
                    int var13 = var10 + 18;
                    if (var13 > 255) {
                        var13 = 255;
                    }
                    int var14 = class261.field4061[var10];
                    if (var12 > 255) {
                        var12 = 255;
                    }
                    class120.field1925.field117[var6++] = class280.method2001(var13 * class280.method2001(65280, var14) + class280.method2001(var11, 65280) * var12, 16711680) + class280.method2001(-16711936, class280.method2001(var11, 16711935) * var12 + var13 * class280.method2001(var14, 16711935)) >> 8;
                }
            }
            for (int var15 = 0; var15 < var8; var15++) {
                class120.field1925.field117[var6++] = class182.field2913[arg2 + (var5++)];
            }
            var5 += class182.field2910 - 128;
            var7++;
        }
        if (class265.field4126) {
            class262.method1866(class120.field1925.field117, arg2, arg0, class120.field1925.field2007, class120.field1925.field2011);
        } else {
            class120.field1925.method51(arg2, arg0);
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(II)[[I", line = 89)
    public final int[][] method74(int arg0, int arg1) {
        field4281++;
        if (arg1 != 82) {
            return (int[][]) ((int[][]) null);
        }
        int[][] var3 = this.field4772.method1175(-91, arg0);
        if (this.field4772.field2488) {
            int[] var4 = this.method2107(arg0, 0, 2);
            int[][] var5 = this.method2106(arg0, 0, 100);
            int[][] var6 = this.method2106(arg0, 1, 105);
            int[] var7 = var3[1];
            int[] var8 = var3[0];
            int[] var9 = var3[2];
            int[] var10 = var5[0];
            int[] var11 = var5[1];
            int[] var12 = var5[2];
            int[] var13 = var6[0];
            int[] var14 = var6[2];
            int[] var15 = var6[1];
            for (int var16 = 0; var16 < class70.field1108; var16++) {
                int var17 = var4[var16];
                if (var17 == 4096) {
                    var8[var16] = var10[var16];
                    var7[var16] = var11[var16];
                    var9[var16] = var12[var16];
                } else if (var17 == 0) {
                    var8[var16] = var13[var16];
                    var7[var16] = var15[var16];
                    var9[var16] = var14[var16];
                } else {
                    int var18 = 4096 - var17;
                    var8[var16] = var10[var16] * var17 + var13[var16] * var18 >> 12;
                    var7[var16] = var11[var16] * var17 + var15[var16] * var18 >> 12;
                    var9[var16] = var12[var16] * var17 + var14[var16] * var18 >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!rf", name = "<init>", descriptor = "()V", line = 174)
    public class276() {
        super(3, false);
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(ILpe;I)V", line = 182)
    public final void method65(int arg0, class101 arg1, int arg2) {
        if (arg0 != -4004) {
            field4284 = (int[]) null;
        }
        field4280++;
        if (arg2 == 0) {
            this.field4773 = arg1.method741(116) == 1;
        }
    }

    @OriginalMember(owner = "client!rf", name = "d", descriptor = "(B)V", line = 196)
    public static void method1979(byte arg0) {
        field4279 = (byte[][][]) null;
        field4284 = null;
        int var1 = -8 / ((arg0 + 39) / 63);
    }

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "(II)[I", line = 209)
    public final int[] method67(int arg0, int arg1) {
        int[] var3 = this.field4763.method394(0, arg1);
        if (this.field4763.field863) {
            int[] var4 = this.method2107(arg1, 0, 0);
            int[] var5 = this.method2107(arg1, 0, 1);
            int[] var6 = this.method2107(arg1, 0, 2);
            for (int var7 = 0; var7 < class70.field1108; var7++) {
                int var8 = var6[var7];
                if (var8 == 4096) {
                    var3[var7] = var4[var7];
                } else if (var8 == 0) {
                    var3[var7] = var5[var7];
                } else {
                    var3[var7] = var4[var7] * var8 + ((4096 - var8) * var5[var7]) >> 12;
                }
            }
        }
        if (arg0 == -3) {
            field4285++;
            return var3;
        } else {
            return (int[]) null;
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(IZ)V", line = 262)
    public static final void method1980(int arg0, boolean arg1) {
        if (!arg1) {
            field4282++;
            class317.field4934.method1828(arg0, (byte) -55);
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(IC)Z", line = 274)
    public static final boolean method1981(int arg0, char arg1) {
        field4278++;
        if (arg0 == 1) {
            return arg1 >= '0' && arg1 <= '9' || arg1 >= 'A' && arg1 <= 'Z' || arg1 >= 'a' && arg1 <= 'z';
        } else {
            return false;
        }
    }
}
