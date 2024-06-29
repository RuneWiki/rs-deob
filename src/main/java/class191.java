import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public class class191 extends class297 {

    @OriginalMember(owner = "client!tj", name = "M", descriptor = "I")
    private int field2990 = 2048;

    @OriginalMember(owner = "client!tj", name = "X", descriptor = "I")
    private int field3001 = 3072;

    @OriginalMember(owner = "client!tj", name = "ab", descriptor = "I")
    private int field3004 = 1024;

    @OriginalMember(owner = "client!tj", name = "T", descriptor = "[S")
    public static short[] field2997 = new short[256];

    @OriginalMember(owner = "client!tj", name = "Q", descriptor = "Z")
    public static boolean field2994 = false;

    @OriginalMember(owner = "client!tj", name = "O", descriptor = "F")
    public static float field2992;

    @OriginalMember(owner = "client!tj", name = "I", descriptor = "I")
    public static int field2986;

    @OriginalMember(owner = "client!tj", name = "J", descriptor = "I")
    public static int field2987;

    @OriginalMember(owner = "client!tj", name = "K", descriptor = "I")
    public static int field2988;

    @OriginalMember(owner = "client!tj", name = "N", descriptor = "I")
    public static int field2991;

    @OriginalMember(owner = "client!tj", name = "P", descriptor = "I")
    public static int field2993;

    @OriginalMember(owner = "client!tj", name = "R", descriptor = "I")
    public static int field2995;

    @OriginalMember(owner = "client!tj", name = "S", descriptor = "I")
    public static int field2996;

    @OriginalMember(owner = "client!tj", name = "U", descriptor = "I")
    public static int field2998;

    @OriginalMember(owner = "client!tj", name = "V", descriptor = "I")
    public static int field2999;

    @OriginalMember(owner = "client!tj", name = "W", descriptor = "I")
    public static int field3000;

    @OriginalMember(owner = "client!tj", name = "Y", descriptor = "I")
    public static int field3002;

    @OriginalMember(owner = "client!tj", name = "Z", descriptor = "I")
    public static int field3003;

    @OriginalMember(owner = "client!tj", name = "L", descriptor = "[[[I")
    public static int[][][] field2989;

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(IZ)[I", line = 4)
    public final int[] method173(int arg0, boolean arg1) {
        field3003++;
        int[] var3 = this.field4760.method215(arg0, 19142);
        if (this.field4760.field388) {
            int[] var4 = this.method2109(arg0, (byte) 108, 0);
            for (int var5 = 0; var5 < class31.field491; var5++) {
                var3[var5] = (var4[var5] * this.field2990 >> 12) + this.field3004;
            }
        }
        if (!arg1) {
            field2986 = 98;
        }
        return var3;
    }

    @OriginalMember(owner = "client!tj", name = "f", descriptor = "(I)V", line = 37)
    public static void method1371(int arg0) {
        field2997 = null;
        if (arg0 == 1078) {
            field2989 = (int[][][]) null;
        }
    }

    @OriginalMember(owner = "client!tj", name = "c", descriptor = "(B)Z", line = 51)
    public static final boolean method1372(byte arg0) {
        int var1 = 114 / ((arg0 + 33) / 37);
        field2987++;
        try {
            return class52.method432(-16728);
        } catch (IOException var6) {
            class41.method379(40);
            return true;
        } catch (Exception var7) {
            String var4 = "T2 - " + class60.field884 + "," + class340.field5248 + "," + class172.field2761 + " - " + class128.field2060 + "," + (class117.field1902 + class345.field5363.field4643[0]) + "," + (class345.field5363.field4619[0] + class133.field2118) + " - ";
            for (int var5 = 0; var5 < class128.field2060 && var5 < 50; var5++) {
                var4 = var4 + class80.field1248.field34[var5] + ",";
            }
            class79.method622(var4, var7, -652852820);
            class111.method867(110);
            return true;
        }
    }

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "(B)V", line = 78)
    public final void method247(byte arg0) {
        this.field2990 = this.field3001 - this.field3004;
        field3000++;
        if (arg0 != 68) {
            field2997 = (short[]) null;
        }
    }

    @OriginalMember(owner = "client!tj", name = "<init>", descriptor = "()V", line = 88)
    public class191() {
        super(1, false);
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(BIIII)V", line = 96)
    public static final void method1373(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        class32.field496 = -1;
        class67.field1013 = class286.field4473 * arg4 / arg2;
        class180.field2863 = class113.field1833 * arg1 / arg3;
        field2995++;
        class339.field5234 = -1;
        if (arg0 < 44) {
            field2994 = false;
        }
        class344.method2385((byte) 25);
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(IILaj;)V", line = 129)
    public final void method169(int arg0, int arg1, class1 arg2) {
        if (arg0 == 0) {
            this.field3004 = arg2.method56(19612);
        } else if (arg0 == 1) {
            this.field3001 = arg2.method56(19612);
        } else if (arg0 == 2) {
            this.field4762 = arg2.method15((byte) 125) == 1;
        }
        if (arg1 != 255) {
            field2986 = 46;
        }
        field2991++;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(IIBIIII)V", line = 175)
    public static final void method1374(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        field3002++;
        int var7 = class10.method151(class333.field5188, arg0, 107, class104.field1719);
        int var8 = class10.method151(class333.field5188, arg4, 108, class104.field1719);
        int var9 = class10.method151(class180.field2862, arg6, 126, class310.field4897);
        int var10 = class10.method151(class180.field2862, arg3, 120, class310.field4897);
        int var11 = class10.method151(class333.field5188, arg0 + arg5, 108, class104.field1719);
        int var12 = class10.method151(class333.field5188, arg4 - arg5, 122, class104.field1719);
        for (int var13 = var7; var13 < var11; var13++) {
            class323.method2273(var9, arg1, class221.field3443[var13], var10, 48);
        }
        for (int var14 = var8; var14 > var12; var14--) {
            class323.method2273(var9, arg1, class221.field3443[var14], var10, 110);
        }
        int var15 = class10.method151(class180.field2862, arg6 + arg5, 113, class310.field4897);
        int var16 = class10.method151(class180.field2862, arg3 - arg5, 108, class310.field4897);
        int var17 = -24 % ((arg2 + 93) / 33);
        for (int var18 = var11; var18 <= var12; var18++) {
            int[] var19 = class221.field3443[var18];
            class323.method2273(var9, arg1, var19, var15, 118);
            class323.method2273(var16, arg1, var19, var10, 119);
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(BI)V", line = 224)
    public static final void method1375(byte arg0, int arg1) {
        class55.field849[1] = (float) (class164.method1234(arg1, 65310) >> 8) / 255.0F;
        class55.field849[2] = (float) class164.method1234(255, arg1) / 255.0F;
        field2999++;
        class55.field849[0] = (float) class164.method1234(255, arg1 >> 16) / 255.0F;
        class79.method617((byte) -29, 3);
        class79.method617((byte) -95, 4);
        if (arg0 != -11) {
            field2989 = (int[][][]) ((int[][][]) null);
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(IB)[[I", line = 254)
    public final int[][] method172(int arg0, byte arg1) {
        field2998++;
        if (arg1 != 63) {
            method1371(118);
        }
        int[][] var3 = this.field4767.method1141(-1677, arg0);
        if (this.field4767.field2480) {
            int[][] var4 = this.method2105(arg0, 2, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var4[2];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class31.field491; var11++) {
                var7[var11] = (var5[var11] * this.field2990 >> 12) + this.field3004;
                var8[var11] = this.field3004 + (var6[var11] * this.field2990 >> 12);
                var10[var11] = (var9[var11] * this.field2990 >> 12) + this.field3004;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(IIIIII)V", line = 296)
    public static final void method1376(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg4 > -7) {
            method1372((byte) 11);
        }
        field2993++;
        int var6 = arg3 - arg0;
        int var7 = arg5 - arg1;
        if (var6 == 0) {
            if (var7 != 0) {
                class13.method177(arg1, arg5, false, arg2, arg0);
            }
        } else if (var7 == 0) {
            class253.method1756(arg2, 95, arg3, arg1, arg0);
        } else {
            int var8 = (var7 << 12) / var6;
            int var9 = arg1 - (arg0 * var8 >> 12);
            int var10;
            int var11;
            if (class310.field4897 > arg0) {
                var11 = var9 + (class310.field4897 * var8 >> 12);
                var10 = class310.field4897;
            } else if (class180.field2862 >= arg0) {
                var10 = arg0;
                var11 = arg1;
            } else {
                var10 = class180.field2862;
                var11 = (class180.field2862 * var8 >> 12) + var9;
            }
            int var12;
            int var13;
            if (arg3 < class310.field4897) {
                var12 = class310.field4897;
                var13 = (class310.field4897 * var8 >> 12) + var9;
            } else if (arg3 <= class180.field2862) {
                var13 = arg5;
                var12 = arg3;
            } else {
                var13 = (class180.field2862 * var8 >> 12) + var9;
                var12 = class180.field2862;
            }
            if (class104.field1719 > var13) {
                var12 = (class104.field1719 - var9 << 12) / var8;
                var13 = class104.field1719;
            } else if (var13 > class333.field5188) {
                var12 = (class333.field5188 - var9 << 12) / var8;
                var13 = class333.field5188;
            }
            if (var11 < class104.field1719) {
                var11 = class104.field1719;
                var10 = (class104.field1719 - var9 << 12) / var8;
            } else if (class333.field5188 < var11) {
                var10 = (class333.field5188 - var9 << 12) / var8;
                var11 = class333.field5188;
            }
            class3.method74(arg2, var11, var13, var12, -99, var10);
        }
    }
}
