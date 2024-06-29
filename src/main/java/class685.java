import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public class class685 {

    @OriginalMember(owner = "client!ag", name = "f", descriptor = "Lde;")
    private class534 field9544 = new class534(256);

    @OriginalMember(owner = "client!ag", name = "j", descriptor = "Ld;")
    private class153 field9548;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "Lbi;")
    private class483 field9539;

    @OriginalMember(owner = "client!ag", name = "e", descriptor = "Lsf;")
    public static class526 field9543 = new class526("", 18);

    @OriginalMember(owner = "client!ag", name = "h", descriptor = "[S")
    private static short[] field9546 = new short[] { 957, 20418, -21587, 11209, -10300 };

    @OriginalMember(owner = "client!ag", name = "l", descriptor = "[S")
    private static short[] field9550 = new short[] { 952, 20413, -21592, 11204, -10305 };

    @OriginalMember(owner = "client!ag", name = "k", descriptor = "[S")
    private static short[] field9549 = new short[] { 962, 20423, -21582, 11214, -10295 };

    @OriginalMember(owner = "client!ag", name = "n", descriptor = "[S")
    private static short[] field9552 = new short[] { 967, 20428, -21577, 11219, -10290 };

    @OriginalMember(owner = "client!ag", name = "i", descriptor = "[[S")
    public static short[][] field9547 = new short[][] { field9552, field9549, field9546, field9550 };

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "I")
    public static int field9540;

    @OriginalMember(owner = "client!ag", name = "c", descriptor = "I")
    public static int field9541;

    @OriginalMember(owner = "client!ag", name = "d", descriptor = "I")
    public static int field9542;

    @OriginalMember(owner = "client!ag", name = "g", descriptor = "I")
    public static int field9545;

    @OriginalMember(owner = "client!ag", name = "m", descriptor = "I")
    public static int field9551;

    @OriginalMember(owner = "client!ag", name = "o", descriptor = "I")
    public static int field9553;

    @OriginalMember(owner = "client!ag", name = "p", descriptor = "I")
    public static int field9554;

    @OriginalMember(owner = "client!ag", name = "q", descriptor = "I")
    public static int field9555;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IZ)Lfia;", line = 4)
    public static final class577 method3845(int arg0, boolean arg1) {
        field9542++;
        class577[] var2 = class679.method3828((byte) -39);
        if (!arg1) {
            method3850(-1.2655727F, -0.2333749F, -96, 23, 85, 1.9788028F, -52, false);
        }
        for (int var3 = 0; var3 < var2.length; var3++) {
            if (var2[var3].field8096 == arg0) {
                return var2[var3];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(B)V", line = 30)
    public final void method3846(byte arg0) {
        this.field9544.method3065(true);
        int var2 = 69 / ((5 - arg0) / 45);
        field9541++;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(I)V", line = 40)
    public static void method3847(int arg0) {
        field9549 = null;
        field9550 = null;
        field9546 = null;
        field9552 = null;
        if (arg0 == -1270) {
            field9543 = null;
            field9547 = null;
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Z)Z", line = 55)
    public static final boolean method3848(boolean arg0) {
        field9540++;
        try {
            class329 var1 = new class329();
            if (!arg0) {
                method3847(-96);
            }
            byte[] var2 = var1.method1910(class276.field3466, 8);
            class295.method1772(var2, (byte) 124);
            return true;
        } catch (Exception var3) {
            return false;
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(III)Z", line = 80)
    public static final boolean method3849(int arg0, int arg1, int arg2) {
        if (arg2 != -1) {
            field9552 = null;
        }
        field9545++;
        return (arg1 & 0xC580) != 0;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(FFIIIFIZ)[F", line = 93)
    public static final float[] method3850(float arg0, float arg1, int arg2, int arg3, int arg4, float arg5, int arg6, boolean arg7) {
        field9554++;
        float[] var8 = new float[9];
        float[] var9 = new float[9];
        float var10 = (float) Math.cos((double) ((float) arg6 * 0.024543693F));
        float var11 = (float) Math.sin((double) ((float) arg6 * 0.024543693F));
        var8[3] = 0.0F;
        var8[7] = 0.0F;
        var8[8] = var10;
        if (!arg7) {
            method3845(-56, false);
        }
        var8[2] = var11;
        var8[5] = 0.0F;
        var8[0] = var10;
        float var12 = 1.0F - var10;
        var8[1] = 0.0F;
        var8[4] = 1.0F;
        var8[6] = -var11;
        float[] var13 = new float[9];
        float var14 = 1.0F;
        float var15 = 0.0F;
        float var16 = (float) arg3 / 32767.0F;
        float var17 = -((float) Math.sqrt((double) (1.0F - var16 * var16)));
        float var18 = 1.0F - var16;
        float var19 = (float) Math.sqrt((double) (arg2 * arg2 + arg4 * arg4));
        if (var19 == 0.0F && var16 == 0.0F) {
            var9 = var8;
        } else {
            if (var19 != 0.0F) {
                var14 = (float) (-arg4) / var19;
                var15 = (float) arg2 / var19;
            }
            var13[4] = var16;
            var13[7] = -var14 * var17;
            var13[0] = var14 * var14 * var18 + var16;
            var13[8] = var15 * var15 * var18 + var16;
            var13[6] = var14 * var15 * var18;
            var13[2] = var14 * var15 * var18;
            var13[1] = var15 * var17;
            var13[3] = -var15 * var17;
            var13[5] = var14 * var17;
            var9[0] = var8[2] * var13[6] + var8[0] * var13[0] + var8[1] * var13[3];
            var9[1] = var8[2] * var13[7] + var8[1] * var13[4] + var8[0] * var13[1];
            var9[2] = var8[2] * var13[8] + var8[0] * var13[2] + var8[1] * var13[5];
            var9[3] = var8[5] * var13[6] + var8[4] * var13[3] + var8[3] * var13[0];
            var9[4] = var8[5] * var13[7] + var8[4] * var13[4] + var8[3] * var13[1];
            var9[5] = var8[5] * var13[8] + var8[3] * var13[2] + var8[4] * var13[5];
            var9[6] = var8[8] * var13[6] + var8[7] * var13[3] + var8[6] * var13[0];
            var9[7] = var8[8] * var13[7] + var8[6] * var13[1] + var8[7] * var13[4];
            var9[8] = var8[8] * var13[8] + var8[6] * var13[2] + var8[7] * var13[5];
        }
        var9[6] *= arg0;
        var9[7] *= arg0;
        var9[8] *= arg0;
        var9[3] *= arg1;
        var9[5] *= arg1;
        var9[4] *= arg1;
        var9[0] *= arg5;
        var9[2] *= arg5;
        var9[1] *= arg5;
        return var9;
    }

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "(I)V", line = 181)
    public static final void method3851(int arg0) {
        class628.field8649 = arg0;
    }

    @OriginalMember(owner = "client!ag", name = "c", descriptor = "(I)V", line = 184)
    public final void method3852(int arg0) {
        field9551++;
        this.field9544.method3070(arg0, 124);
    }

    @OriginalMember(owner = "client!ag", name = "<init>", descriptor = "(Lbi;Ld;)V", line = 211)
    public class685(class483 arg0, class153 arg1) {
        this.field9548 = arg1;
        this.field9539 = arg0;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(II)Lbq;", line = 223)
    public final class293 method3853(int arg0, int arg1) {
        field9553++;
        int var3 = -4 / ((-arg1 - 60) / 53);
        Object var4 = this.field9544.method3079((long) arg0, 0);
        if (var4 != null) {
            return (class293) var4;
        } else if (this.field9548.method1071((byte) 124, arg0)) {
            class537 var5 = this.field9548.method1072(arg0, true);
            int var6 = var5.field7460 ? 64 : this.field9539.field6770;
            class293 var8;
            if (var5.field7452 && this.field9539.method442()) {
                float[] var7 = this.field9548.method1067(0.7F, false, arg0, 83, var6, var6);
                var8 = new class293(this.field9539, 3553, 34842, var6, var6, var5.field7446 != 0, var7, 6408);
            } else {
                int[] var9;
                if (var5.field7450 != 2 && class162.method1132(var5.field7443, 23093)) {
                    var9 = this.field9548.method1069(var6, arg0, true, var6, 0.7F, 6766);
                } else {
                    var9 = this.field9548.method1068(var6, 0.7F, arg0, -22669, false, var6);
                }
                var8 = new class293(this.field9539, 3553, 6408, var6, var6, var5.field7446 != 0, var9, 0, 0, false);
            }
            var8.method1756(var5.field7442, var5.field7455, 114);
            this.field9544.method3077((byte) -33, (long) arg0, var8);
            return var8;
        } else {
            return null;
        }
    }
}
