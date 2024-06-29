import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hga")
public class class182 {

    @OriginalMember(owner = "client!hga", name = "j", descriptor = "Log;")
    private class673 field2768;

    @OriginalMember(owner = "client!hga", name = "a", descriptor = "I")
    public int field2759;

    @OriginalMember(owner = "client!hga", name = "b", descriptor = "[Ljava/lang/String;")
    public static String[] field2760 = new String[100];

    @OriginalMember(owner = "client!hga", name = "f", descriptor = "[I")
    public static int[] field2764 = null;

    @OriginalMember(owner = "client!hga", name = "h", descriptor = "[I")
    public static int[] field2766 = new int[1];

    @OriginalMember(owner = "client!hga", name = "c", descriptor = "I")
    public static int field2761;

    @OriginalMember(owner = "client!hga", name = "d", descriptor = "I")
    public static int field2762;

    @OriginalMember(owner = "client!hga", name = "e", descriptor = "I")
    public static int field2763;

    @OriginalMember(owner = "client!hga", name = "g", descriptor = "I")
    public static int field2765;

    @OriginalMember(owner = "client!hga", name = "i", descriptor = "I")
    public static int field2767;

    @OriginalMember(owner = "client!hga", name = "a", descriptor = "(II[ILhm;)Lrj;")
    public static final class619 method1360(int arg0, int arg1, int[] arg2, class229 arg3) {
        field2763++;
        int[] var4 = null;
        int[] var5 = null;
        if (arg0 != -4) {
            return null;
        }
        int[] var6 = null;
        float[][] var7 = null;
        if (arg3.field3309 != null) {
            int var8 = arg3.field3298;
            int[] var9 = new int[var8];
            int[] var10 = new int[var8];
            int[] var11 = new int[var8];
            int[] var12 = new int[var8];
            int[] var13 = new int[var8];
            int[] var14 = new int[var8];
            for (int var15 = 0; var15 < var8; var15++) {
                var9[var15] = Integer.MAX_VALUE;
                var10[var15] = -2147483647;
                var11[var15] = Integer.MAX_VALUE;
                var12[var15] = -2147483647;
                var13[var15] = Integer.MAX_VALUE;
                var14[var15] = -2147483647;
            }
            var5 = new int[var8];
            var6 = new int[var8];
            var4 = new int[var8];
            var7 = new float[var8][];
            for (int var16 = 0; var16 < arg1; var16++) {
                int var23 = arg2[var16];
                if (arg3.field3309[var23] != -1) {
                    int var24 = arg3.field3309[var23] & 0xFF;
                    for (int var25 = 0; var25 < 3; var25++) {
                        short var26;
                        if (var25 == 0) {
                            var26 = arg3.field3322[var23];
                        } else if (var25 == 1) {
                            var26 = arg3.field3329[var23];
                        } else {
                            var26 = arg3.field3282[var23];
                        }
                        int var27 = arg3.field3320[var26];
                        int var28 = arg3.field3328[var26];
                        int var29 = arg3.field3287[var26];
                        if (var27 < var9[var24]) {
                            var9[var24] = var27;
                        }
                        if (var27 > var10[var24]) {
                            var10[var24] = var27;
                        }
                        if (var11[var24] > var28) {
                            var11[var24] = var28;
                        }
                        if (var28 > var12[var24]) {
                            var12[var24] = var28;
                        }
                        if (var29 < var13[var24]) {
                            var13[var24] = var29;
                        }
                        if (var14[var24] < var29) {
                            var14[var24] = var29;
                        }
                    }
                }
            }
            for (int var17 = 0; var17 < var8; var17++) {
                byte var18 = arg3.field3294[var17];
                if (var18 > 0) {
                    var4[var17] = (var9[var17] + var10[var17]) / 2;
                    var5[var17] = (var11[var17] + var12[var17]) / 2;
                    var6[var17] = (var13[var17] + var14[var17]) / 2;
                    float var20;
                    float var21;
                    float var22;
                    if (var18 == 1) {
                        int var19 = arg3.field3325[var17];
                        if (var19 == 0) {
                            var20 = 1.0F;
                            var21 = 1.0F;
                        } else if (var19 <= 0) {
                            var21 = 1.0F;
                            var20 = (float) (-var19) / 1024.0F;
                        } else {
                            var21 = (float) var19 / 1024.0F;
                            var20 = 1.0F;
                        }
                        var22 = 64.0F / (float) arg3.field3326[var17];
                    } else if (var18 == 2) {
                        var20 = 64.0F / (float) arg3.field3325[var17];
                        var21 = 64.0F / (float) arg3.field3291[var17];
                        var22 = 64.0F / (float) arg3.field3326[var17];
                    } else {
                        var21 = (float) arg3.field3291[var17] / 1024.0F;
                        var22 = (float) arg3.field3326[var17] / 1024.0F;
                        var20 = (float) arg3.field3325[var17] / 1024.0F;
                    }
                    var7[var17] = class770.method4235(var21, var20, arg3.field3312[var17], arg3.field3290[var17], arg3.field3280[var17], var22, false, class111.method773(255, arg3.field3324[var17]));
                }
            }
        }
        return new class619(var4, var5, var6, var7);
    }

    @OriginalMember(owner = "client!hga", name = "a", descriptor = "(I)V")
    public static final void method1361(int arg0) {
        field2761++;
        class113.method808(115);
        int var1 = -84 / ((-arg0 - 63) / 62);
        class449.method2699(22050, class145.field1852.field9013.method2104((byte) -32) == 1, -91, 2);
        class262.field3703 = class276.method1783(0, class359.field5219, 22050, class27.field395, -1);
        class659.method3765(class405.method2439(true, null), true, true);
        class405.field5708 = class276.method1783(1, class359.field5219, 2048, class27.field395, -1);
        class405.field5708.method1649(-25, class229.field3307);
    }

    @OriginalMember(owner = "client!hga", name = "b", descriptor = "(I)V")
    public static void method1362(int arg0) {
        field2766 = null;
        if (arg0 == 13922) {
            field2764 = null;
            field2760 = null;
        }
    }

    @OriginalMember(owner = "client!hga", name = "a", descriptor = "(Z)V")
    public static final void method1363(boolean arg0) {
        field2767++;
        short var1 = 1024;
        short var2 = 3072;
        if (class475.field6760) {
            var2 = 4096;
            if (class208.field3034) {
                var1 = 2048;
            }
        }
        if ((float) var1 > class509.field7256) {
            class509.field7256 = var1;
        }
        if ((float) var2 < class509.field7256) {
            class509.field7256 = var2;
        }
        while (class562.field8001 >= 16384.0F) {
            class562.field8001 -= 16384.0F;
        }
        while (class562.field8001 < 0.0F) {
            class562.field8001 += 16384.0F;
        }
        if (!arg0) {
            method1361(100);
        }
        int var3 = class4.field54 >> 9;
        int var4 = class238.field3434 >> 9;
        int var5 = class580.method3366(class410.field5771, (byte) -95, class238.field3434, class4.field54);
        int var6 = 0;
        if (var3 > 3 && var4 > 3 && var3 < class109.field1314 - 4 && var4 < class760.field10479 - 4) {
            for (int var7 = var3 - 4; var7 <= var3 + 4; var7++) {
                for (int var8 = var4 - 4; var8 <= (var4 + 4); var8++) {
                    int var9 = class410.field5771;
                    if (var9 < 3 && class627.method3593(var7, (byte) 87, var8)) {
                        var9++;
                    }
                    int var10 = 0;
                    if (class663.field9301.field5731 != null && class663.field9301.field5731[var9] != null) {
                        var10 = (class663.field9301.field5731[var9][var7][var8] & 0xFF) * 8 << 2;
                    }
                    if (class622.field8777 != null && class622.field8777[var9] != null) {
                        int var11 = var5 + (var10 - class622.field8777[var9].method1976(var7, -1, var8));
                        if (var11 > var6) {
                            var6 = var11;
                        }
                    }
                }
            }
        }
        int var12 = (var6 >> 2) * 1536;
        if (var12 > 786432) {
            var12 = 786432;
        }
        if (var12 < 262144) {
            var12 = 262144;
        }
        if (var12 > class288.field4400) {
            class288.field4400 += (var12 - class288.field4400) / 24;
        } else if (class288.field4400 > var12) {
            class288.field4400 += (var12 - class288.field4400) / 80;
            return;
        }
    }

    @OriginalMember(owner = "client!hga", name = "a", descriptor = "(III)Z")
    public static final boolean method1364(int arg0, int arg1, int arg2) {
        field2765++;
        if (arg1 >= -52) {
            return true;
        } else {
            return (arg2 & 0x800) != 0;
        }
    }

    @OriginalMember(owner = "client!hga", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field2762++;
        this.field2768.method3816(this.field2759, 114);
        super.finalize();
    }

    @OriginalMember(owner = "client!hga", name = "<init>", descriptor = "(Log;II)V")
    public class182(class673 arg0, int arg1, int arg2) {
        this.field2768 = arg0;
        this.field2759 = arg2;
    }
}
