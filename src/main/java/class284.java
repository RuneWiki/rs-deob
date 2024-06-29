import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kba")
public abstract class class284 {

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "I")
    public static int field3834 = class335.method2138(1600, 36161);

    @OriginalMember(owner = "client!kba", name = "b", descriptor = "I")
    public static int field3835;

    @OriginalMember(owner = "client!kba", name = "d", descriptor = "I")
    public static int field3837;

    @OriginalMember(owner = "client!kba", name = "e", descriptor = "I")
    public static int field3838;

    @OriginalMember(owner = "client!kba", name = "c", descriptor = "Lpq;")
    public static class159 field3836;

    @OriginalMember(owner = "client!kba", name = "f", descriptor = "Lpq;")
    public static class159 field3839;

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "(Z)J")
    public abstract long method706(boolean arg0);

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "(IJ)I")
    public abstract int method704(int arg0, long arg1);

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "(I)J")
    public abstract long method702(int arg0);

    @OriginalMember(owner = "client!kba", name = "b", descriptor = "(IJ)I")
    public final int method1704(int arg0, long arg1) {
        field3835++;
        long var4 = this.method706(true);
        if ((long) arg0 < var4) {
            class660.method3668(arg0 - 1, var4);
        }
        return this.method704(-65536, arg1);
    }

    @OriginalMember(owner = "client!kba", name = "b", descriptor = "(I)V")
    public abstract void method703(int arg0);

    @OriginalMember(owner = "client!kba", name = "c", descriptor = "(I)V")
    public static final void method1705(int arg0) {
        field3837++;
        if (class243.field3278 == -1 || class227.field2966 == -1) {
            return;
        }
        int var1 = ((class109.field1319 - class549.field7512) * class190.field2481 >> 16) + class549.field7512;
        class190.field2481 += var1;
        if (class190.field2481 >= 65535) {
            if (class390.field5612) {
                class528.field7312 = false;
            } else {
                class528.field7312 = true;
            }
            class190.field2481 = 65535;
            class390.field5612 = true;
        } else {
            class528.field7312 = false;
            class390.field5612 = false;
        }
        float var2 = (float) class190.field2481 / 65535.0F;
        float[] var3 = new float[3];
        int var4 = class571.field7911 * arg0;
        for (int var5 = 0; var5 < 3; var5++) {
            int var21 = class598.field8178[class243.field3278][var4][var5] * 3;
            int var22 = class598.field8178[class243.field3278][var4 + 1][var5] * 3;
            int var23 = (class598.field8178[class243.field3278][var4 + 2][var5] + class598.field8178[class243.field3278][var4 + 2][var5] - class598.field8178[class243.field3278][var4 + 3][var5]) * 3;
            int var24 = class598.field8178[class243.field3278][var4][var5];
            int var25 = var22 - var21;
            int var26 = var21 + var23 - var22 * 2;
            int var27 = class598.field8178[class243.field3278][var4 + 2][var5] + var22 - var23 - var24;
            var3[var5] = (((float) var27 * var2 + (float) var26) * var2 + (float) var25) * var2 + (float) var24;
        }
        class132.field1679 = (int) var3[0] - (class253.field3490 * 512);
        class628.field8545 = (int) var3[1] * -1;
        class471.field6379 = (int) var3[2] - class186.field2280 * 512;
        float[] var6 = new float[3];
        int var7 = class606.field8279 * 2;
        for (int var8 = 0; var8 < 3; var8++) {
            int var14 = class598.field8178[class227.field2966][var7][var8] * 3;
            int var15 = class598.field8178[class227.field2966][var7 + 1][var8] * 3;
            int var16 = (class598.field8178[class227.field2966][var7 + 2][var8] + class598.field8178[class227.field2966][var7 + 2][var8] - class598.field8178[class227.field2966][var7 - -3][var8]) * 3;
            int var17 = class598.field8178[class227.field2966][var7][var8];
            int var18 = var15 - var14;
            int var19 = var14 + var16 - (var15 * 2);
            int var20 = class598.field8178[class227.field2966][var7 + 2][var8] + var15 - var17 - var16;
            var6[var8] = (((float) var20 * var2 + (float) var19) * var2 + (float) var18) * var2 + (float) var17;
        }
        float var9 = var6[0] - var3[0];
        float var10 = (var6[1] - var3[1]) * -1.0F;
        float var11 = var6[2] - var3[2];
        double var12 = Math.sqrt((double) (var9 * var9 + var11 * var11));
        class336.field4947 = (int) (Math.atan2((double) var10, var12) * 2607.5945876176133D) & 0x3FFF;
        class261.field3603 = (int) (-Math.atan2((double) var9, (double) var11) * 2607.5945876176133D) & 0x3FFF;
        class253.field3493 = ((class598.field8178[class243.field3278][var4 + 2][3] - class598.field8178[class243.field3278][var4][3]) * class190.field2481 >> 16) + class598.field8178[class243.field3278][var4][3];
    }

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "(B)V")
    public static void method1706(byte arg0) {
        field3836 = null;
        if (arg0 > -2) {
            method1705(-53);
        }
        field3839 = null;
    }

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "(BILfca;ILfa;IJII)V")
    public static final void method1707(byte arg0, int arg1, class188 arg2, int arg3, class185 arg4, int arg5, long arg6, int arg7, int arg8) {
        field3838++;
        int var10 = 94 / ((61 - arg0) / 62);
        int var11 = arg1 * arg1 + arg7 * arg7;
        if ((long) var11 > arg6) {
            return;
        }
        int var12 = Math.min(arg2.field2438 / 2, arg2.field2371 / 2);
        if (var11 <= (var12 * var12)) {
            class331.method2118(arg1, arg7, arg3, arg8, arg4, arg2, class60.field841[arg5], 121);
            return;
        }
        var12 -= 10;
        int var13;
        if (class42.field546 == 4) {
            var13 = (int) class620.field8432 & 0x3FFF;
        } else {
            var13 = (int) class620.field8432 + class254.field3506 & 0x3FFF;
        }
        int var14 = class654.field9259[var13];
        int var15 = class654.field9260[var13];
        if (class42.field546 != 4) {
            var14 = var14 * 256 / (class461.field6281 + 256);
            var15 = var15 * 256 / (class461.field6281 + 256);
        }
        int var16 = arg1 * var14 + (arg7 * var15) >> 14;
        int var17 = arg1 * var15 - (arg7 * var14) >> 14;
        double var18 = Math.atan2((double) var16, (double) var17);
        int var20 = (int) (Math.sin(var18) * (double) var12);
        int var21 = (int) ((double) var12 * Math.cos(var18));
        class41.field535[arg5].method2448((float) arg2.field2438 / 2.0F + (float) arg3 + (float) var20, (float) arg2.field2371 / 2.0F + (float) arg8 + (float) (-var21), 4096, (int) (-var18 / 6.283185307179586D * 65535.0D));
    }
}
