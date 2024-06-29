import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lq")
public class class6 extends class96 {

    @OriginalMember(owner = "client!lq", name = "N", descriptor = "Lpi;")
    public static class340 field50 = new class340(53, 8);

    @OriginalMember(owner = "client!lq", name = "S", descriptor = "[I")
    public static int[] field55 = new int[1000];

    @OriginalMember(owner = "client!lq", name = "K", descriptor = "I")
    public static int field47;

    @OriginalMember(owner = "client!lq", name = "L", descriptor = "I")
    public static int field48;

    @OriginalMember(owner = "client!lq", name = "M", descriptor = "I")
    public static int field49;

    @OriginalMember(owner = "client!lq", name = "O", descriptor = "I")
    public static int field51;

    @OriginalMember(owner = "client!lq", name = "P", descriptor = "I")
    public static int field52;

    @OriginalMember(owner = "client!lq", name = "R", descriptor = "I")
    public static int field54;

    @OriginalMember(owner = "client!lq", name = "Q", descriptor = "Ldn;")
    public static class201 field53;

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(IILbt;)V")
    public final void method31(int arg0, int arg1, class88 arg2) {
        if (~arg0 == arg1) {
            super.field1329 = arg2.method617(2) == 1;
        }
        ++field47;
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method32(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field51;
        int var8 = arg2 + arg3;
        int var9 = -arg3 + arg6;
        int var10 = 44 % ((arg4 - -27) / 46);
        for (int var11 = arg2; var11 < var8; ++var11) {
            class183.method1212(arg5, class333.field4265[var11], true, arg1, arg0);
        }
        int var12 = arg1 + arg3;
        int var13 = -arg3 + arg0;
        for (int var14 = arg6; var9 < var14; --var14) {
            class183.method1212(arg5, class333.field4265[var14], true, arg1, arg0);
        }
        for (int var15 = var8; var9 >= var15; ++var15) {
            int[] var16 = class333.field4265[var15];
            class183.method1212(arg5, var16, true, arg1, var12);
            class183.method1212(arg7, var16, true, var12, var13);
            class183.method1212(arg5, var16, true, var13, arg0);
        }
    }

    @OriginalMember(owner = "client!lq", name = "g", descriptor = "(I)V")
    public static void method33(int arg0) {
        field50 = null;
        field53 = null;
        if (arg0 != -20396) {
            field50 = null;
        }
        field55 = null;
    }

    @OriginalMember(owner = "client!lq", name = "b", descriptor = "(Z)V")
    public static final void method34(boolean arg0) {
        ++field49;
        if (arg0) {
            method34(true);
        }
        if (class445.field6190 != -1 && class174.field2245 != -1) {
            int var1 = ((class254.field3212 - class195.field2520) * class217.field2782 >> 16) + class195.field2520;
            class217.field2782 += var1;
            if (class217.field2782 < 65535) {
                class138.field1841 = false;
                class16.field262 = false;
            } else {
                class217.field2782 = 65535;
                if (!class138.field1841) {
                    class16.field262 = true;
                } else {
                    class16.field262 = false;
                }
                class138.field1841 = true;
            }
            float var2 = (float) class217.field2782 / 65535.0F;
            float[] var3 = new float[3];
            int var4 = class406.field5439 * 2;
            for (int var5 = 0; var5 < 3; ++var5) {
                int var21 = class63.field811[class445.field6190][var4][var5] * 3;
                int var22 = class63.field811[class445.field6190][var4 + 1][var5] * 3;
                int var23 = (class63.field811[class445.field6190][var4 + 2][var5] - (class63.field811[class445.field6190][var4 - -3][var5] + -class63.field811[class445.field6190][var4 + 2][var5])) * 3;
                int var24 = class63.field811[class445.field6190][var4][var5];
                int var25 = -var21 + var22;
                int var26 = var21 + var23 + -(var22 * 2);
                int var27 = class63.field811[class445.field6190][var4 - -2][var5] - (-var22 + var24) + -var23;
                var3[var5] = (((float) var27 * var2 + (float) var26) * var2 + (float) var25) * var2 + (float) var24;
            }
            class291.field3724 = (int) var3[2] + -(class336.field4299 * 128);
            class53.field730 = (int) var3[1] * -1;
            class299.field3885 = (int) var3[0] + -(class35.field545 * 128);
            float[] var6 = new float[3];
            int var7 = class61.field802 * 2;
            for (int var8 = 0; ~var8 > -4; ++var8) {
                int var14 = class63.field811[class174.field2245][var7][var8] * 3;
                int var15 = class63.field811[class174.field2245][var7 + 1][var8] * 3;
                int var16 = (class63.field811[class174.field2245][var7 - -2][var8] - class63.field811[class174.field2245][var7 + 3][var8] - -class63.field811[class174.field2245][var7 + 2][var8]) * 3;
                int var17 = class63.field811[class174.field2245][var7][var8];
                int var18 = -var14 + var15;
                int var19 = var14 - var15 * 2 + var16;
                int var20 = class63.field811[class174.field2245][var7 + 2][var8] - var16 + -var17 + var15;
                var6[var8] = (((float) var20 * var2 + (float) var19) * var2 + (float) var18) * var2 + (float) var17;
            }
            float var9 = var6[0] + -var3[0];
            float var10 = (var6[1] - var3[1]) * -1.0F;
            float var11 = var6[2] - var3[2];
            double var12 = Math.sqrt((double) (var9 * var9 + var11 * var11));
            class430.field5935 = (int) (2607.5945876176133D * Math.atan2((double) var10, var12)) & 16383;
            class261.field3319 = (int) (2607.5945876176133D * -Math.atan2((double) var9, (double) var11)) & 16383;
            class74.field927 = class63.field811[class445.field6190][var4][3] - -((class63.field811[class445.field6190][var4 + 2][3] + -class63.field811[class445.field6190][var4][3]) * class217.field2782 >> 16);
        }
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(IIIZIII)V")
    public static final void method35(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        class294.field3818 = arg2;
        class429.field5880 = arg4;
        class19.field325 = arg0;
        if (!arg3) {
            field53 = null;
        }
        class278.field3556 = arg5;
        ++field54;
        class111.field1537 = arg1;
        class51.field699 = arg6;
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(II)[[I")
    public final int[][] method36(int arg0, int arg1) {
        ++field52;
        if (arg0 != 3) {
            field53 = null;
        }
        int[][] var3 = super.field1333.method694(arg1, arg0);
        if (super.field1333.field1423) {
            int[] var4 = this.method657(2, arg1, -1);
            int[][] var5 = this.method659(0, -85, arg1);
            int[][] var6 = this.method659(1, -26, arg1);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            int[] var10 = var5[0];
            int[] var11 = var5[1];
            int[] var12 = var5[2];
            int[] var13 = var6[0];
            int[] var14 = var6[1];
            int[] var15 = var6[2];
            for (int var16 = 0; var16 < class269.field3403; ++var16) {
                int var17 = var4[var16];
                if (~var17 == -4097) {
                    var7[var16] = var10[var16];
                    var8[var16] = var11[var16];
                    var9[var16] = var12[var16];
                } else if (~var17 == -1) {
                    var7[var16] = var13[var16];
                    var8[var16] = var14[var16];
                    var9[var16] = var15[var16];
                } else {
                    int var18 = -var17 + 4096;
                    var7[var16] = var10[var16] * var17 + var13[var16] * var18 >> 12;
                    var8[var16] = var11[var16] * var17 + var14[var16] * var18 >> 12;
                    var9[var16] = var12[var16] * var17 + var15[var16] * var18 >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!lq", name = "<init>", descriptor = "()V")
    public class6() {
        super(3, false);
    }

    @OriginalMember(owner = "client!lq", name = "b", descriptor = "(II)[I")
    public final int[] method37(int arg0, int arg1) {
        ++field48;
        if (arg1 != 255) {
            return null;
        } else {
            int[] var3 = super.field1331.method397((byte) -110, arg0);
            if (super.field1331.field863) {
                int[] var4 = this.method657(0, arg0, -1);
                int[] var5 = this.method657(1, arg0, arg1 ^ -256);
                int[] var6 = this.method657(2, arg0, -1);
                for (int var7 = 0; class269.field3403 > var7; ++var7) {
                    int var8 = var6[var7];
                    if (var8 != 4096) {
                        if (var8 == 0) {
                            var3[var7] = var5[var7];
                        } else {
                            var3[var7] = (-var8 + 4096) * var5[var7] + var4[var7] * var8 >> 12;
                        }
                    } else {
                        var3[var7] = var4[var7];
                    }
                }
            }
            return var3;
        }
    }
}
