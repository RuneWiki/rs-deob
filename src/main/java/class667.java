import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ar")
public class class667 implements class205 {

    @OriginalMember(owner = "client!ar", name = "g", descriptor = "Lrg;")
    public class557 field9199;

    @OriginalMember(owner = "client!ar", name = "p", descriptor = "I")
    public int field9208;

    @OriginalMember(owner = "client!ar", name = "w", descriptor = "I")
    public int field9215;

    @OriginalMember(owner = "client!ar", name = "k", descriptor = "I")
    public int field9203;

    @OriginalMember(owner = "client!ar", name = "z", descriptor = "I")
    public int field9218;

    @OriginalMember(owner = "client!ar", name = "u", descriptor = "I")
    public int field9213;

    @OriginalMember(owner = "client!ar", name = "b", descriptor = "I")
    public int field9194;

    @OriginalMember(owner = "client!ar", name = "s", descriptor = "I")
    public int field9211;

    @OriginalMember(owner = "client!ar", name = "t", descriptor = "Lal;")
    public class125 field9212;

    @OriginalMember(owner = "client!ar", name = "B", descriptor = "I")
    public int field9220;

    @OriginalMember(owner = "client!ar", name = "n", descriptor = "I")
    public int field9206;

    @OriginalMember(owner = "client!ar", name = "h", descriptor = "Ljava/lang/String;")
    public String field9200;

    @OriginalMember(owner = "client!ar", name = "r", descriptor = "I")
    public int field9210;

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "[S")
    private static short[] field9193 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!ar", name = "d", descriptor = "[J")
    public static long[] field9196 = new long[10];

    @OriginalMember(owner = "client!ar", name = "i", descriptor = "[S")
    private static short[] field9201 = new short[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!ar", name = "j", descriptor = "I")
    public static int field9202 = 104;

    @OriginalMember(owner = "client!ar", name = "m", descriptor = "[S")
    private static short[] field9205 = new short[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!ar", name = "q", descriptor = "I")
    public static int field9209 = 0;

    @OriginalMember(owner = "client!ar", name = "x", descriptor = "[[S")
    public static short[][] field9216 = new short[][] { field9193, field9201, field9205 };

    @OriginalMember(owner = "client!ar", name = "v", descriptor = "Lkr;")
    public static class602 field9214 = new class602(56, 28);

    @OriginalMember(owner = "client!ar", name = "A", descriptor = "D")
    public static double field9219;

    @OriginalMember(owner = "client!ar", name = "c", descriptor = "I")
    public static int field9195;

    @OriginalMember(owner = "client!ar", name = "f", descriptor = "I")
    public static int field9198;

    @OriginalMember(owner = "client!ar", name = "l", descriptor = "I")
    public static int field9204;

    @OriginalMember(owner = "client!ar", name = "o", descriptor = "I")
    public static int field9207;

    @OriginalMember(owner = "client!ar", name = "y", descriptor = "I")
    public static int field9217;

    @OriginalMember(owner = "client!ar", name = "e", descriptor = "J")
    public static long field9197;

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(III)V", line = 9)
    public static final void method3767(int arg0, int arg1, int arg2) {
        field9207++;
        if (class424.method2641(arg0, arg2 - 16290)) {
            if (arg2 != 4626) {
                field9193 = null;
            }
            class469.method2860(class266.field3900[arg0], (byte) 119, arg1);
        }
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(Z)Lww;", line = 25)
    public final class288 method1206(boolean arg0) {
        if (arg0) {
            field9219 = 0.26269858859787476D;
        }
        field9195++;
        return class588.field8005;
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(IILha;)Lfd;", line = 60)
    public static final class298 method3768(int arg0, int arg1, class548 arg2) {
        field9204++;
        class160 var3 = (class160) class131.field1826.method812(arg0 ^ 0x42A2, (long) arg1);
        if (arg0 != 17113) {
            return null;
        }
        if (var3 != null) {
            class127 var4 = var3.field2234.method3577(1);
            var3.field2232 = true;
            if (var4 != null) {
                return var4.method797(-19381, arg2);
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ar", name = "b", descriptor = "(Z)V", line = 92)
    public static void method3769(boolean arg0) {
        field9196 = null;
        field9214 = null;
        if (arg0) {
            method3768(35, 19, null);
        }
        field9216 = null;
        field9193 = null;
        field9205 = null;
        field9201 = null;
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(I[IILvo;)Lhh;", line = 110)
    public static final class532 method3770(int arg0, int[] arg1, int arg2, class133 arg3) {
        field9217++;
        int[] var4 = null;
        int[] var5 = null;
        int[] var6 = null;
        if (arg2 != Integer.MAX_VALUE) {
            method3768(-55, 35, null);
        }
        float[][] var7 = null;
        if (arg3.field1860 != null) {
            int var8 = arg3.field1881;
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
            var4 = new int[var8];
            var6 = new int[var8];
            var5 = new int[var8];
            for (int var16 = 0; var16 < arg0; var16++) {
                int var23 = arg1[var16];
                if (arg3.field1860[var23] != -1) {
                    int var24 = arg3.field1860[var23] & 0xFF;
                    for (int var25 = 0; var25 < 3; var25++) {
                        short var26;
                        if (var25 == 0) {
                            var26 = arg3.field1901[var23];
                        } else if (var25 == 1) {
                            var26 = arg3.field1870[var23];
                        } else {
                            var26 = arg3.field1871[var23];
                        }
                        int var27 = arg3.field1866[var26];
                        int var28 = arg3.field1899[var26];
                        int var29 = arg3.field1878[var26];
                        if (var27 < var9[var24]) {
                            var9[var24] = var27;
                        }
                        if (var10[var24] < var27) {
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
            var7 = new float[var8][];
            for (int var17 = 0; var17 < var8; var17++) {
                byte var18 = arg3.field1875[var17];
                if (var18 > 0) {
                    var4[var17] = (var9[var17] + var10[var17]) / 2;
                    var5[var17] = (var11[var17] + var12[var17]) / 2;
                    var6[var17] = (var13[var17] + var14[var17]) / 2;
                    float var20;
                    float var21;
                    float var22;
                    if (var18 == 1) {
                        int var19 = arg3.field1864[var17];
                        if (var19 == 0) {
                            var20 = 1.0F;
                            var21 = 1.0F;
                        } else if (var19 > 0) {
                            var21 = (float) var19 / 1024.0F;
                            var20 = 1.0F;
                        } else {
                            var21 = 1.0F;
                            var20 = (float) (-var19) / 1024.0F;
                        }
                        var22 = 64.0F / (float) arg3.field1883[var17];
                    } else if (var18 == 2) {
                        var22 = 64.0F / (float) arg3.field1883[var17];
                        var21 = 64.0F / (float) arg3.field1856[var17];
                        var20 = 64.0F / (float) arg3.field1864[var17];
                    } else {
                        var22 = (float) arg3.field1883[var17] / 1024.0F;
                        var21 = (float) arg3.field1856[var17] / 1024.0F;
                        var20 = (float) arg3.field1864[var17] / 1024.0F;
                    }
                    var7[var17] = class547.method3241(class134.method848(arg2, 2147483642), arg3.field1859[var17], arg3.field1880[var17], class665.method3759(arg3.field1872[var17], 255), var21, arg3.field1894[var17], var22, var20);
                }
            }
        }
        return new class532(var4, var5, var6, var7);
    }

    @OriginalMember(owner = "client!ar", name = "<init>", descriptor = "(Ljava/lang/String;Lrg;Lal;IIIIIIIIII)V", line = 299)
    public class667(String arg0, class557 arg1, class125 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        this.field9199 = arg1;
        this.field9208 = arg5;
        this.field9215 = arg12;
        this.field9203 = arg8;
        this.field9218 = arg6;
        this.field9213 = arg4;
        this.field9194 = arg3;
        this.field9211 = arg10;
        this.field9212 = arg2;
        this.field9220 = arg9;
        this.field9206 = arg7;
        this.field9200 = arg0;
        this.field9210 = arg11;
    }
}
