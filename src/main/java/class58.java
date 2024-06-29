import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public abstract class class58 extends class130 {

    @OriginalMember(owner = "client!de", name = "B", descriptor = "Z")
    public volatile boolean field961 = true;

    @OriginalMember(owner = "client!de", name = "z", descriptor = "I")
    public static int field959 = 127;

    @OriginalMember(owner = "client!de", name = "K", descriptor = "Lcd;")
    private static class64 field970 = class44.method335((byte) 71, " from your ignore list first)3");

    @OriginalMember(owner = "client!de", name = "H", descriptor = "Lcd;")
    public static class64 field967 = class44.method335((byte) 71, " loggt sich ein)3");

    @OriginalMember(owner = "client!de", name = "y", descriptor = "Lcd;")
    public static class64 field958 = field970;

    @OriginalMember(owner = "client!de", name = "w", descriptor = "I")
    public static int field956;

    @OriginalMember(owner = "client!de", name = "x", descriptor = "I")
    public static int field957;

    @OriginalMember(owner = "client!de", name = "A", descriptor = "I")
    public static int field960;

    @OriginalMember(owner = "client!de", name = "C", descriptor = "I")
    public static int field962;

    @OriginalMember(owner = "client!de", name = "E", descriptor = "I")
    public static int field964;

    @OriginalMember(owner = "client!de", name = "G", descriptor = "I")
    public static int field966;

    @OriginalMember(owner = "client!de", name = "I", descriptor = "I")
    public static int field968;

    @OriginalMember(owner = "client!de", name = "D", descriptor = "Z")
    public boolean field963;

    @OriginalMember(owner = "client!de", name = "F", descriptor = "Z")
    public boolean field965;

    @OriginalMember(owner = "client!de", name = "J", descriptor = "[[B")
    public static byte[][] field969;

    @OriginalMember(owner = "client!de", name = "c", descriptor = "(B)V", line = 21)
    public static void method443(byte arg0) {
        field958 = null;
        field969 = (byte[][]) null;
        field967 = null;
        if (arg0 < -26) {
            field970 = null;
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(II)[F", line = 35)
    public static final float[] method444(int arg0, int arg1) {
        field957++;
        float var2 = class52.method389() + class52.method391();
        int var3 = 64 / ((-arg0 - 9) / 61);
        float var4 = 0.58823526F;
        int var5 = class52.method384();
        class11.field218[3] = 1.0F;
        float var6 = (float) (var5 >> 16 & 0xFF) / 255.0F;
        class11.field218[0] = var2 * var6 * ((float) (class224.method1614(arg1, 16751955) >> 16) / 255.0F) * var4;
        float var7 = (float) (var5 & 0xFF) / 255.0F;
        float var8 = (float) ((var5 & 0xFF83) >> 8) / 255.0F;
        class11.field218[1] = var2 * var4 * var8 * ((float) (class224.method1614(65329, arg1) >> 8) / 255.0F);
        class11.field218[2] = var4 * var7 * ((float) class224.method1614(arg1, 255) / 255.0F) * var2;
        return class11.field218;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IIIIIILa;IJ)Z", line = 60)
    public static final boolean method445(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class262 arg6, int arg7, long arg8) {
        if (arg6 == null) {
            return true;
        } else {
            int var10 = arg1 * 128 + arg4 * 64;
            int var11 = arg2 * 128 + arg5 * 64;
            return class88.method672(arg0, arg1, arg2, arg4, arg5, var10, var11, arg3, arg6, arg7, false, arg8);
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "([II[Ljava/lang/Object;II)V", line = 71)
    public static final void method446(int[] arg0, int arg1, Object[] arg2, int arg3, int arg4) {
        field968++;
        if (arg3 < arg4) {
            int var5 = arg3;
            int var6 = (arg3 + arg4) / 2;
            int var7 = arg0[var6];
            arg0[var6] = arg0[arg4];
            arg0[arg4] = var7;
            Object var8 = arg2[var6];
            arg2[var6] = arg2[arg4];
            arg2[arg4] = var8;
            for (int var9 = arg3; var9 < arg4; var9++) {
                if (arg0[var9] < ((var9 & 0x1) + var7)) {
                    int var10 = arg0[var9];
                    arg0[var9] = arg0[var5];
                    arg0[var5] = var10;
                    Object var11 = arg2[var9];
                    arg2[var9] = arg2[var5];
                    arg2[var5++] = var11;
                }
            }
            arg0[arg4] = arg0[var5];
            arg0[var5] = var7;
            arg2[arg4] = arg2[var5];
            arg2[var5] = var8;
            method446(arg0, 121, arg2, arg3, var5 - 1);
            method446(arg0, 122, arg2, var5 + 1, arg4);
        }
        if (arg1 <= 115) {
            method450(34, (byte) 63);
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IIIFZIZI)[I", line = 127)
    public static final int[] method447(int arg0, int arg1, int arg2, float arg3, boolean arg4, int arg5, boolean arg6, int arg7) {
        field956++;
        int[] var8 = new int[arg2];
        if (arg4) {
            method444(-4, 107);
        }
        class131 var9 = new class131();
        var9.field2346 = arg1;
        var9.field2321 = arg6;
        var9.field2345 = arg7;
        var9.field2325 = (int) (arg3 * 4096.0F);
        var9.field2326 = arg0;
        var9.field2323 = arg5;
        var9.method288(17772);
        class54.method408(arg2, -117, 1);
        var9.method944(0, var8, (byte) 107);
        return var8;
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(II)V", line = 150)
    public static final void method448(int arg0, int arg1) {
        field962++;
        class146.field2574.method1197((byte) 77, arg1);
        class211.field3558.method1197((byte) 61, arg1);
        int var2 = 48 % ((arg0 - 65) / 37);
        class142.field2496.method1197((byte) 104, arg1);
        class97.field1784.method1197((byte) 126, arg1);
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IIIIIIIII)V", line = 170)
    public static final void method449(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        for (int var9 = 0; var9 < class143.field2516.field4886; var9++) {
            int var10 = class143.field2516.field4878[var9] - class251.field4360;
            int var11 = class232.field3923 + class233.field3934 - class143.field2516.field4884[var9] - 1;
            int var12 = (arg3 - arg8) * (var10 - arg1) / (arg5 - arg1) + arg8;
            int var13 = (arg6 - arg0) * (var11 - arg7) / (arg4 - arg7) + arg0;
            int var14 = 16777215;
            int var15 = class143.field2516.method1972(var9, (byte) 15);
            class209 var16 = null;
            if (var15 == 0) {
                if ((double) class298.field5138 == 3.0D) {
                    var16 = class199.field3410;
                }
                if ((double) class298.field5138 == 4.0D) {
                    var16 = class114.field2097;
                }
                if ((double) class298.field5138 == 6.0D) {
                    var16 = class255.field4429;
                }
                if ((double) class298.field5138 == 8.0D) {
                    var16 = class270.field4657;
                }
            }
            if (var15 == 1) {
                if ((double) class298.field5138 == 3.0D) {
                    var16 = class255.field4429;
                }
                if ((double) class298.field5138 == 4.0D) {
                    var16 = class270.field4657;
                }
                if ((double) class298.field5138 == 6.0D) {
                    var16 = class295.field5068;
                }
                if ((double) class298.field5138 == 8.0D) {
                    var16 = class254.field4425;
                }
            }
            if (var15 == 2) {
                if ((double) class298.field5138 == 3.0D) {
                    var16 = class295.field5068;
                }
                var14 = 16755200;
                if ((double) class298.field5138 == 4.0D) {
                    var16 = class254.field4425;
                }
                if ((double) class298.field5138 == 6.0D) {
                    var16 = class41.field679;
                }
                if ((double) class298.field5138 == 8.0D) {
                    var16 = class163.field2864;
                }
            }
            if (class143.field2516.field4880[var9] != -1) {
                var14 = class143.field2516.field4880[var9];
            }
            if (var16 != null) {
                class64[] var17 = new class64[class143.field2516.field4887[var9].method528(60, (byte) 18) + 1];
                class180.field3091.method1264(class143.field2516.field4887[var9], (int[]) null, var17);
                int var18 = var17.length;
                int var19 = var13 - var16.method1449() * (var18 - 1) / 2;
                int var20 = var19 + var16.method1451() / 2;
                for (int var21 = 0; var21 < var18; var21++) {
                    class64 var22 = var18 - 1 == var21 ? var17[var21] : var17[var21].method524(var17[var21].method540(arg2 + 28985) - 4, (byte) 85, 0);
                    var16.method1452(var22, var12, var20, var14, true);
                    var20 += var16.method1449();
                }
            }
        }
        if (arg2 != -4) {
            field967 = (class64) null;
        }
        field966++;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IB)V", line = 292)
    public static final void method450(int arg0, byte arg1) {
        field964++;
        if (arg0 == -1 || arg1 >= -81 || !class159.method1148(-1, arg0)) {
            return;
        }
        class60[] var2 = class272.field4675[arg0];
        for (int var3 = 0; var3 < var2.length; var3++) {
            class60 var4 = var2[var3];
            if (var4.field1145 != null) {
                class11 var5 = new class11();
                var5.field212 = var4;
                var5.field229 = var4.field1145;
                class187.method1320(2000000, var5, 87);
            }
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Z)I")
    public abstract int method442(boolean arg0);

    @OriginalMember(owner = "client!de", name = "e", descriptor = "(I)[B")
    public abstract byte[] method451(int arg0);
}
