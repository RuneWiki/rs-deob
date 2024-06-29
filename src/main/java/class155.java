import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public class class155 {

    @OriginalMember(owner = "client!bj", name = "c", descriptor = "Lwe;")
    public static class15 field2303 = null;

    @OriginalMember(owner = "client!bj", name = "g", descriptor = "Ljava/lang/String;")
    public static String field2307 = null;

    @OriginalMember(owner = "client!bj", name = "f", descriptor = "[I")
    public static int[] field2306 = new int[100];

    @OriginalMember(owner = "client!bj", name = "e", descriptor = "Ljava/lang/String;")
    public static String field2305 = "Loading sprites - ";

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "I")
    public static int field2301;

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "I")
    public static int field2302;

    @OriginalMember(owner = "client!bj", name = "d", descriptor = "I")
    public static int field2304;

    @OriginalMember(owner = "client!bj", name = "h", descriptor = "I")
    public static int field2308;

    @OriginalMember(owner = "client!bj", name = "i", descriptor = "I")
    public static int field2309;

    @OriginalMember(owner = "client!bj", name = "j", descriptor = "I")
    public static int field2310;

    @OriginalMember(owner = "client!bj", name = "k", descriptor = "I")
    public static int field2311;

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(I)V")
    public static void method1026(int arg0) {
        field2306 = null;
        field2303 = null;
        if (arg0 > 31) {
            field2305 = null;
            field2307 = null;
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(II[II[I)V")
    public static final void method1027(int arg0, int arg1, int[] arg2, int arg3, int[] arg4) {
        field2309++;
        if (arg0 != 192) {
            method1030(19, 2);
        }
        if (arg1 <= arg3) {
            return;
        }
        int var5 = (arg3 + arg1) / 2;
        int var6 = arg4[var5];
        arg4[var5] = arg4[arg1];
        int var7 = arg3;
        arg4[arg1] = var6;
        int var8 = arg2[var5];
        arg2[var5] = arg2[arg1];
        arg2[arg1] = var8;
        for (int var9 = arg3; var9 < arg1; var9++) {
            if (arg4[var9] > (var9 & 0x1) + var6) {
                int var10 = arg4[var9];
                arg4[var9] = arg4[var7];
                arg4[var7] = var10;
                int var11 = arg2[var9];
                arg2[var9] = arg2[var7];
                arg2[var7++] = var11;
            }
        }
        arg4[arg1] = arg4[var7];
        arg4[var7] = var6;
        arg2[arg1] = arg2[var7];
        arg2[var7] = var8;
        method1027(192, var7 - 1, arg2, arg3, arg4);
        method1027(192, arg1, arg2, var7 + 1, arg4);
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(Ldl;IIZLdl;)Lck;")
    public static final class218 method1028(class123 arg0, int arg1, int arg2, boolean arg3, class123 arg4) {
        boolean var5 = true;
        field2310++;
        int[] var6 = arg4.method817((byte) 125, arg2);
        int var7 = 0;
        if (arg1 != 255) {
            method1031(-14, -42);
        }
        while (var7 < var6.length) {
            byte[] var8 = arg4.method808(var6[var7], (byte) -22, arg2);
            if (var8 == null) {
                var5 = false;
            } else {
                int var9 = (var8[0] & 0xFF) << 8 | var8[1] & 0xFF;
                byte[] var10;
                if (arg3) {
                    var10 = arg0.method808(var9, (byte) -102, 0);
                } else {
                    var10 = arg0.method808(0, (byte) -124, var9);
                }
                if (var10 == null) {
                    var5 = false;
                }
            }
            var7++;
        }
        if (!var5) {
            return null;
        }
        try {
            return new class218(arg4, arg0, arg2, arg3);
        } catch (Exception var11) {
            return null;
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(II)I")
    public static final int method1029(int arg0, int arg1) {
        field2302++;
        int var2 = ((arg1 & 0xAAAAAAAA) >>> 1) + (arg1 & 0x55555555);
        int var3 = (var2 & 0x33333333) + ((var2 & 0xCCCCCCCE) >>> 2);
        if (arg0 != 30264) {
            method1031(-37, -111);
        }
        int var4 = (var3 >>> 4) + var3 & 0xF0F0F0F;
        int var5 = (var4 >>> 8) + var4;
        int var6 = (var5 >>> 16) + var5;
        return var6 & 0xFF;
    }

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "(II)I")
    public static final int method1030(int arg0, int arg1) {
        field2311++;
        double var2 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
        double var4 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
        double var6 = (double) (arg0 & 0xFF) / 256.0D;
        double var8 = var2;
        if (var2 > var4) {
            var8 = var4;
        }
        double var10 = var2;
        if (var2 < var4) {
            var10 = var4;
        }
        if (var6 < var8) {
            var8 = var6;
        }
        double var12 = 0.0D;
        double var14 = 0.0D;
        if (var10 < var6) {
            var10 = var6;
        }
        double var16 = (var8 + var10) / 2.0D;
        if (var8 != var10) {
            if (var16 < 0.5D) {
                var14 = (var10 - var8) / (var8 + var10);
            }
            if (var2 == var10) {
                var12 = (var4 - var6) / (var10 - var8);
            } else if (var4 == var10) {
                var12 = (var6 - var2) / (var10 - var8) + 2.0D;
            } else if (var6 == var10) {
                var12 = (var2 - var4) / (var10 - var8) + 4.0D;
            }
            if (var16 >= 0.5D) {
                var14 = (var10 - var8) / (2.0D - var10 - var8);
            }
        }
        if (arg1 > -82) {
            field2307 = null;
        }
        double var18 = var12 / 6.0D;
        int var20 = (int) (var16 * 256.0D);
        int var21 = (int) (var18 * 256.0D);
        if (var20 < 0) {
            var20 = 0;
        } else if (var20 > 255) {
            var20 = 255;
        }
        int var22 = (int) (var14 * 256.0D);
        if (var22 < 0) {
            var22 = 0;
        } else if (var22 > 255) {
            var22 = 255;
        }
        if (var20 > 243) {
            var22 >>= 0x4;
        } else if (var20 > 217) {
            var22 >>= 0x3;
        } else if (var20 > 192) {
            var22 >>= 0x2;
        } else if (var20 > 179) {
            var22 >>= 0x1;
        }
        return (var21 >> 2 << 10) + (var22 >> 5 << 7) + (var20 >> 1);
    }

    @OriginalMember(owner = "client!bj", name = "c", descriptor = "(II)Lcg;")
    public static final class166 method1031(int arg0, int arg1) {
        if (arg1 != 255) {
            return null;
        }
        field2308++;
        class166 var2 = (class166) class99.field1545.method1428((long) arg0, (byte) -77);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = client.field2331.method807((byte) 124, 0, arg0);
        class166 var4 = new class166(var3);
        var4.method1317(class68.field952, (int[]) null);
        class99.field1545.method1424((long) arg0, var4, -2003648287);
        return var4;
    }
}
