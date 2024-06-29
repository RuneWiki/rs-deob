import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class202 extends class252 {

    @OriginalMember(owner = "client!ma", name = "I", descriptor = "[I")
    private int[] field3278;

    @OriginalMember(owner = "client!ma", name = "D", descriptor = "[I")
    private int[] field3273;

    @OriginalMember(owner = "client!ma", name = "u", descriptor = "Luh;")
    private class107 field3264;

    @OriginalMember(owner = "client!ma", name = "H", descriptor = "Luh;")
    private class107 field3277;

    @OriginalMember(owner = "client!ma", name = "E", descriptor = "Luh;")
    private class107 field3274;

    @OriginalMember(owner = "client!ma", name = "w", descriptor = "[Luh;")
    private class107[] field3266;

    @OriginalMember(owner = "client!ma", name = "J", descriptor = "Lad;")
    public static class275 field3279 = new class275(50);

    @OriginalMember(owner = "client!ma", name = "v", descriptor = "I")
    public static int field3265;

    @OriginalMember(owner = "client!ma", name = "x", descriptor = "I")
    public static int field3267;

    @OriginalMember(owner = "client!ma", name = "y", descriptor = "I")
    public static int field3268;

    @OriginalMember(owner = "client!ma", name = "z", descriptor = "I")
    public static int field3269;

    @OriginalMember(owner = "client!ma", name = "B", descriptor = "I")
    public static int field3271;

    @OriginalMember(owner = "client!ma", name = "C", descriptor = "I")
    public static int field3272;

    @OriginalMember(owner = "client!ma", name = "G", descriptor = "I")
    public static int field3276;

    @OriginalMember(owner = "client!ma", name = "A", descriptor = "Lrg;")
    public static class248 field3270;

    @OriginalMember(owner = "client!ma", name = "F", descriptor = "Lkc;")
    public static class301 field3275;

    @OriginalMember(owner = "client!ma", name = "K", descriptor = "[[[B")
    public static byte[][][] field3280;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(ILjava/lang/String;)I")
    public static final int method1410(int arg0, String arg1) {
        if (arg0 < 13) {
            method1411((byte) 99);
        }
        field3268++;
        if (arg1 == null) {
            return -1;
        }
        for (int var2 = 0; var2 < class146.field2345; var2++) {
            if (arg1.equalsIgnoreCase(class240.field3748[var2])) {
                return var2;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "(B)V")
    public static void method1411(byte arg0) {
        field3270 = null;
        field3275 = null;
        if (arg0 > 34) {
            field3280 = null;
            field3279 = null;
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "([BI)[B")
    public static final byte[] method1412(byte[] arg0, int arg1) {
        int var2 = 88 / ((-arg1 - 43) / 53);
        int var3 = arg0.length;
        field3267++;
        byte[] var4 = new byte[var3];
        class282.method1921(arg0, 0, var4, 0, var3);
        return var4;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lgi;Loa;I)Z")
    public final boolean method1413(class164 arg0, class105 arg1, int arg2) {
        if (arg2 < 124) {
            return false;
        }
        field3269++;
        if (class273.field4405 <= 0) {
            for (int var4 = 0; var4 < this.field3273.length; var4++) {
                if (!arg0.method1168(0, this.field3273[var4])) {
                    return false;
                }
            }
        } else {
            for (int var5 = 0; var5 < this.field3273.length; var5++) {
                if (!arg0.method1165(class273.field4405, this.field3273[var5], (byte) 39)) {
                    return false;
                }
            }
        }
        for (int var6 = 0; var6 < this.field3278.length; var6++) {
            if (!arg1.method748(0, this.field3278[var6])) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lgi;IDZILoa;Z)Lwg;")
    public final class185 method1414(class164 arg0, int arg1, double arg2, boolean arg3, int arg4, class105 arg5, boolean arg6) {
        if (!arg3) {
            field3270 = null;
        }
        class28.method221((byte) -124, arg2);
        field3271++;
        class174.field2905 = arg5;
        class274.field4466 = arg0;
        class54.method340((byte) 100, arg1, arg4);
        class185 var9 = new class185(arg1, arg4);
        for (int var10 = 0; var10 < this.field3266.length; var10++) {
            this.field3266[var10].method757(arg1, (byte) -94, arg4);
        }
        int var11 = 0;
        for (int var12 = 0; var12 < arg4; var12++) {
            if (arg6) {
                var11 = var12 << 2;
            }
            int[] var15;
            int[] var16;
            int[] var17;
            if (this.field3277.field1660) {
                int[] var14 = this.field3277.method189(37, var12);
                var15 = var14;
                var16 = var14;
                var17 = var14;
            } else {
                int[][] var18 = this.field3277.method190(var12, (byte) -117);
                var16 = var18[2];
                var17 = var18[0];
                var15 = var18[1];
            }
            int[] var19;
            if (this.field3274.field1660) {
                var19 = this.field3274.method189(-120, var12);
            } else {
                var19 = this.field3274.method190(var12, (byte) -117)[0];
            }
            for (int var20 = arg1 - 1; var20 >= 0; var20--) {
                int var21 = var17[var20] >> 4;
                int var22 = var15[var20] >> 4;
                if (var22 > 255) {
                    var22 = 255;
                }
                if (var21 > 255) {
                    var21 = 255;
                }
                if (var22 < 0) {
                    var22 = 0;
                }
                if (var21 < 0) {
                    var21 = 0;
                }
                int var23 = class89.field1386[var21];
                int var24 = class89.field1386[var22];
                int var25 = var16[var20] >> 4;
                if (var25 > 255) {
                    var25 = 255;
                }
                if (var25 < 0) {
                    var25 = 0;
                }
                int var26 = class89.field1386[var25];
                int var27;
                if (var23 == 0 && var24 == 0 && var26 == 0) {
                    var27 = 0;
                } else {
                    var27 = var19[var20] >> 4;
                    if (var27 > 255) {
                        var27 = 255;
                    }
                    if (var27 < 0) {
                        var27 = 0;
                    }
                }
                var9.field1082[var11++] = (var27 << 24) + (var23 << 16) + (var24 << 8) + var26;
                if (arg6) {
                    var11 += (arg1 << 2) - 4;
                }
            }
        }
        for (int var13 = 0; var13 < this.field3266.length; var13++) {
            this.field3266[var13].method753((byte) 79);
        }
        return var9;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lgi;DIZBLoa;I)Le;")
    public final class67 method1415(class164 arg0, double arg1, int arg2, boolean arg3, byte arg4, class105 arg5, int arg6) {
        class28.method221((byte) -127, arg1);
        field3276++;
        if (arg4 > -22) {
            field3280 = null;
        }
        class274.field4466 = arg0;
        class174.field2905 = arg5;
        class54.method340((byte) 93, arg6, arg2);
        class67 var9 = new class67(arg6, arg2);
        for (int var10 = 0; var10 < this.field3266.length; var10++) {
            this.field3266[var10].method757(arg6, (byte) -94, arg2);
        }
        int var11 = 0;
        for (int var12 = 0; var12 < arg2; var12++) {
            if (arg3) {
                var11 = var12;
            }
            int[] var15;
            int[] var16;
            int[] var17;
            if (this.field3277.field1660) {
                int[] var18 = this.field3277.method189(97, var12);
                var17 = var18;
                var15 = var18;
                var16 = var18;
            } else {
                int[][] var14 = this.field3277.method190(var12, (byte) -117);
                var15 = var14[1];
                var16 = var14[2];
                var17 = var14[0];
            }
            for (int var19 = arg6 - 1; var19 >= 0; var19--) {
                int var20 = var15[var19] >> 4;
                if (var20 > 255) {
                    var20 = 255;
                }
                int var21 = var17[var19] >> 4;
                if (var20 < 0) {
                    var20 = 0;
                }
                int var22 = class89.field1386[var20];
                int var23 = var16[var19] >> 4;
                if (var21 > 255) {
                    var21 = 255;
                }
                if (var23 > 255) {
                    var23 = 255;
                }
                if (var21 < 0) {
                    var21 = 0;
                }
                if (var23 < 0) {
                    var23 = 0;
                }
                int var24 = class89.field1386[var23];
                int var25 = class89.field1386[var21];
                var9.field1082[var11++] = (var22 << 8) + (var25 << 16) + var24;
                if (arg3) {
                    var11 += arg6 - 1;
                }
            }
        }
        for (int var13 = 0; var13 < this.field3266.length; var13++) {
            this.field3266[var13].method753((byte) 126);
        }
        return var9;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(ZLoa;DLgi;IZII)[I")
    public final int[] method1416(boolean arg0, class105 arg1, double arg2, class164 arg3, int arg4, boolean arg5, int arg6, int arg7) {
        field3272++;
        class28.method221((byte) -126, arg2);
        class174.field2905 = arg1;
        class274.field4466 = arg3;
        class54.method340((byte) -62, arg7, arg4);
        if (arg6 != 4329) {
            method1410(120, (String) null);
        }
        int[] var10 = new int[arg4 * arg7];
        for (int var11 = 0; var11 < this.field3266.length; var11++) {
            this.field3266[var11].method757(arg7, (byte) -94, arg4);
        }
        int var12 = 0;
        int var13;
        byte var14;
        int var15;
        if (arg5) {
            var13 = -1;
            var15 = arg7 - 1;
            var14 = -1;
        } else {
            var13 = arg7;
            var14 = 1;
            var15 = 0;
        }
        for (int var16 = 0; var16 < arg4; var16++) {
            int[] var19;
            int[] var20;
            int[] var21;
            if (this.field3277.field1660) {
                int[] var18 = this.field3277.method189(arg6 ^ 0xFFFFEF41, var16);
                var19 = var18;
                var20 = var18;
                var21 = var18;
            } else {
                int[][] var22 = this.field3277.method190(var16, (byte) -117);
                var21 = var22[2];
                var20 = var22[0];
                var19 = var22[1];
            }
            if (arg0) {
                var12 = var16;
            }
            for (int var23 = var15; var23 != var13; var23 += var14) {
                int var24 = var20[var23] >> 4;
                if (var24 > 255) {
                    var24 = 255;
                }
                int var25 = var21[var23] >> 4;
                if (var24 < 0) {
                    var24 = 0;
                }
                int var26 = var19[var23] >> 4;
                if (var26 > 255) {
                    var26 = 255;
                }
                if (var25 > 255) {
                    var25 = 255;
                }
                if (var26 < 0) {
                    var26 = 0;
                }
                int var27 = class89.field1386[var26];
                if (var25 < 0) {
                    var25 = 0;
                }
                int var28 = class89.field1386[var25];
                int var29 = class89.field1386[var24];
                var10[var12++] = (var29 << 16) + (var27 << 8) + var28;
                if (arg0) {
                    var12 += arg7 - 1;
                }
            }
        }
        for (int var17 = 0; var17 < this.field3266.length; var17++) {
            this.field3266[var17].method753((byte) 107);
        }
        return var10;
    }

    @OriginalMember(owner = "client!ma", name = "<init>", descriptor = "()V")
    public class202() {
        this.field3278 = new int[0];
        this.field3273 = new int[0];
        this.field3264 = new class117(0);
        this.field3264.field1659 = 1;
        this.field3277 = new class117();
        this.field3277.field1659 = 1;
        this.field3274 = new class117();
        this.field3274.field1659 = 1;
        this.field3266 = new class107[] { this.field3277, this.field3274, this.field3264 };
    }

    @OriginalMember(owner = "client!ma", name = "<init>", descriptor = "(Lfj;)V")
    public class202(class274 arg0) {
        int var2 = arg0.method1849(255);
        int var3 = 0;
        this.field3266 = new class107[var2];
        int[][] var4 = new int[var2][];
        int var5 = 0;
        for (int var6 = 0; var6 < var2; var6++) {
            class107 var16 = class127.method869(0, arg0);
            if (var16.method758(9633) >= 0) {
                var3++;
            }
            if (var16.method755((byte) 72) >= 0) {
                var5++;
            }
            int var17 = var16.field1675.length;
            var4[var6] = new int[var17];
            for (int var18 = 0; var18 < var17; var18++) {
                var4[var6][var18] = arg0.method1849(255);
            }
            this.field3266[var6] = var16;
        }
        this.field3278 = new int[var5];
        this.field3273 = new int[var3];
        int var7 = 0;
        int var8 = 0;
        for (int var9 = 0; var9 < var2; var9++) {
            class107 var11 = this.field3266[var9];
            int var12 = var11.field1675.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11.field1675[var13] = this.field3266[var4[var9][var13]];
            }
            int var14 = var11.method758(9633);
            int var15 = var11.method755((byte) -128);
            if (var14 > 0) {
                this.field3273[var8++] = var14;
            }
            if (var15 > 0) {
                this.field3278[var7++] = var15;
            }
            var4[var9] = null;
        }
        this.field3277 = this.field3266[arg0.method1849(255)];
        Object var10 = null;
        this.field3274 = this.field3266[arg0.method1849(255)];
        this.field3264 = this.field3266[arg0.method1849(255)];
    }
}
