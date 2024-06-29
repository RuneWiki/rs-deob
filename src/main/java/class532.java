import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class532 {

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "I")
    public static int field7801;

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "I")
    public static int field7802;

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "I")
    public static int field7803;

    @OriginalMember(owner = "client!kd", name = "d", descriptor = "I")
    public static int field7804;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(B)V")
    public static final void method3146(byte arg0) {
        field7802++;
        if (class328.field5176 == -1 || class112.field1977 == -1) {
            return;
        }
        int var1 = ((class530.field7786 - class282.field4616) * class439.field6560 >> 16) + class282.field4616;
        class439.field6560 += var1;
        if (class439.field6560 >= 65535) {
            if (class190.field2964) {
                class71.field1240 = false;
            } else {
                class71.field1240 = true;
            }
            class439.field6560 = 65535;
            class190.field2964 = true;
        } else {
            class71.field1240 = false;
            class190.field2964 = false;
        }
        float var2 = (float) class439.field6560 / 65535.0F;
        float[] var3 = new float[3];
        int var4 = class67.field991 * 2;
        for (int var5 = 0; var5 < 3; var5++) {
            int var21 = class12.field142[class328.field5176][var4][var5] * 3;
            int var22 = class12.field142[class328.field5176][var4 + 1][var5] * 3;
            int var23 = (class12.field142[class328.field5176][var4 + 2][var5] + class12.field142[class328.field5176][var4 + 2][var5] - class12.field142[class328.field5176][var4 + 3][var5]) * 3;
            int var24 = class12.field142[class328.field5176][var4][var5];
            int var25 = var22 - var21;
            int var26 = var21 + var23 - var22 * 2;
            int var27 = class12.field142[class328.field5176][var4 + 2][var5] + var22 - var24 - var23;
            var3[var5] = (((float) var27 * var2 + (float) var26) * var2 + (float) var25) * var2 + (float) var24;
        }
        class130.field2234 = (int) var3[1] * -1;
        class473.field7021 = (int) var3[0] - (class16.field181 * 128);
        class48.field764 = (int) var3[2] - (class455.field6794 * 128);
        float[] var6 = new float[3];
        int var7 = class272.field4510 * 2;
        if (arg0 >= -64) {
            method3146((byte) 36);
        }
        for (int var8 = 0; var8 < 3; var8++) {
            int var14 = class12.field142[class112.field1977][var7][var8] * 3;
            int var15 = class12.field142[class112.field1977][var7 + 1][var8] * 3;
            int var16 = (class12.field142[class112.field1977][var7 + 2][var8] - (class12.field142[class112.field1977][var7 + 3][var8] - class12.field142[class112.field1977][var7 + 2][var8])) * 3;
            int var17 = class12.field142[class112.field1977][var7][var8];
            int var18 = var15 - var14;
            int var19 = var14 + var16 - (var15 * 2);
            int var20 = class12.field142[class112.field1977][var7 + 2][var8] + var15 - var17 - var16;
            var6[var8] = (((float) var20 * var2 + (float) var19) * var2 + (float) var18) * var2 + (float) var17;
        }
        float var9 = var6[0] - var3[0];
        float var10 = (var6[1] - var3[1]) * -1.0F;
        float var11 = var6[2] - var3[2];
        double var12 = Math.sqrt((double) (var9 * var9 + var11 * var11));
        class227.field3927 = (int) (Math.atan2((double) var10, var12) * 2607.5945876176133D) & 0x3FFF;
        class381.field5891 = (int) (-Math.atan2((double) var9, (double) var11) * 2607.5945876176133D) & 0x3FFF;
        class64.field950 = class12.field142[class328.field5176][var4][3] + ((class12.field142[class328.field5176][var4 + 2][3] - class12.field142[class328.field5176][var4][3]) * class439.field6560 >> 16);
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIIIIII)V")
    public static final void method3147(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field7804++;
        class472.method2792(arg0, false);
        int var7 = 0;
        int var8 = arg0 - arg5;
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg0;
        int var10 = -arg0;
        int var11 = var8;
        int var12 = -var8;
        int var13 = -1;
        int var14 = -1;
        int[] var15 = class209.field3294[arg6];
        int var16 = arg1 - var8;
        class357.method2291(arg1 - arg0, arg3, var15, var16, -1);
        int var17 = arg1 + var8;
        class357.method2291(var16, arg4, var15, var17, arg2 - 4);
        class357.method2291(var17, arg3, var15, arg0 + arg1, -1);
        while (var7 < var9) {
            var14 += 2;
            var13 += 2;
            var12 += var14;
            var10 += var13;
            if (var12 >= 0 && var11 >= 1) {
                class289.field4712[var11] = var7;
                var11--;
                var12 -= var11 << 1;
            }
            var7++;
            if (var10 >= 0) {
                var9--;
                if (var9 < var8) {
                    int[] var18 = class209.field3294[arg6 + var9];
                    int[] var19 = class209.field3294[arg6 - var9];
                    int var20 = class289.field4712[var9];
                    int var21 = arg1 + var7;
                    int var22 = arg1 - var7;
                    int var23 = arg1 + var20;
                    int var24 = arg1 - var20;
                    class357.method2291(var22, arg3, var18, var24, arg2 ^ 0xFFFFFFFC);
                    class357.method2291(var24, arg4, var18, var23, -1);
                    class357.method2291(var23, arg3, var18, var21, -1);
                    class357.method2291(var22, arg3, var19, var24, -1);
                    class357.method2291(var24, arg4, var19, var23, arg2 ^ 0xFFFFFFFC);
                    class357.method2291(var23, arg3, var19, var21, -1);
                } else {
                    int[] var25 = class209.field3294[arg6 + var9];
                    int[] var26 = class209.field3294[arg6 - var9];
                    int var27 = arg1 + var7;
                    int var28 = arg1 - var7;
                    class357.method2291(var28, arg3, var25, var27, -1);
                    class357.method2291(var28, arg3, var26, var27, -1);
                }
                var10 -= var9 << 1;
            }
            int[] var29 = class209.field3294[arg6 + var7];
            int[] var30 = class209.field3294[arg6 - var7];
            int var31 = arg1 + var9;
            int var32 = arg1 - var9;
            if (var7 >= var8) {
                class357.method2291(var32, arg3, var29, var31, -1);
                class357.method2291(var32, arg3, var30, var31, -1);
            } else {
                int var33 = var7 > var11 ? class289.field4712[var7] : var11;
                int var34 = arg1 + var33;
                int var35 = arg1 - var33;
                class357.method2291(var32, arg3, var29, var35, -1);
                class357.method2291(var35, arg4, var29, var34, -1);
                class357.method2291(var34, arg3, var29, var31, arg2 ^ 0xFFFFFFFC);
                class357.method2291(var32, arg3, var30, var35, -1);
                class357.method2291(var35, arg4, var30, var34, -1);
                class357.method2291(var34, arg3, var30, var31, -1);
            }
        }
        if (arg2 == 3) {
            ;
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(II)Z")
    public static final boolean method3148(int arg0, int arg1) {
        if (arg0 != -4) {
            method3147(-2, -37, 9, 46, 0, -94, -66);
        }
        field7801++;
        return arg1 == 3 || arg1 == 4;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IB)I")
    public static final int method3149(int arg0, byte arg1) {
        if (arg1 <= 86) {
            return 25;
        } else {
            field7803++;
            return (arg0 & 0x3F9C0) >> 11;
        }
    }

    static {
        new class306("Close", "Bitte schließ die momentan geöffnete Benutzeroberfläche,", "Fermez l'interface que vous avez ouverte avant d'utiliser le bouton « Signaler un abus ».", "Feche a interface aberta antes de usar o recurso \"Denunciar abuso\".");
    }
}
