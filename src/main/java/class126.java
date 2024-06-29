import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class126 extends class167 {

    @OriginalMember(owner = "client!tc", name = "U", descriptor = "[Lak;")
    public class125[] field2086;

    @OriginalMember(owner = "client!tc", name = "N", descriptor = "I")
    public static int field2080 = 0;

    @OriginalMember(owner = "client!tc", name = "O", descriptor = "I")
    public static int field2081 = 0;

    @OriginalMember(owner = "client!tc", name = "X", descriptor = "[[I")
    public static int[][] field2089 = new int[5][5000];

    @OriginalMember(owner = "client!tc", name = "Z", descriptor = "I")
    public static int field2091 = 0;

    @OriginalMember(owner = "client!tc", name = "L", descriptor = "[[B")
    public static byte[][] field2078 = new byte[250][];

    @OriginalMember(owner = "client!tc", name = "W", descriptor = "Z")
    public static boolean field2088 = true;

    @OriginalMember(owner = "client!tc", name = "V", descriptor = "[Z")
    public static boolean[] field2087 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false };

    @OriginalMember(owner = "client!tc", name = "bb", descriptor = "[Lk;")
    public static class206[] field2093 = new class206[500];

    @OriginalMember(owner = "client!tc", name = "M", descriptor = "I")
    public static int field2079;

    @OriginalMember(owner = "client!tc", name = "Q", descriptor = "I")
    public static int field2082;

    @OriginalMember(owner = "client!tc", name = "R", descriptor = "I")
    public static int field2083;

    @OriginalMember(owner = "client!tc", name = "T", descriptor = "I")
    public static int field2085;

    @OriginalMember(owner = "client!tc", name = "Y", descriptor = "I")
    public static int field2090;

    @OriginalMember(owner = "client!tc", name = "ab", descriptor = "I")
    public static int field2092;

    @OriginalMember(owner = "client!tc", name = "cb", descriptor = "I")
    public static int field2094;

    @OriginalMember(owner = "client!tc", name = "S", descriptor = "Lfa;")
    public static class80 field2084;

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "(II)I")
    public static final int method851(int arg0, int arg1) {
        field2079++;
        double var2 = (double) (arg1 >> 16 & 0xFF) / 256.0D;
        double var4 = (double) ((arg1 & 0xFF8B) >> 8) / 256.0D;
        double var6 = (double) (arg1 & 0xFF) / 256.0D;
        double var8 = var2;
        double var10 = var2;
        if (var2 < var4) {
            var10 = var4;
        }
        if (var10 < var6) {
            var10 = var6;
        }
        if (var2 > var4) {
            var8 = var4;
        }
        if (arg0 != -29413) {
            method854(-62, -110, -10, false, 28, -26, -88, -32);
        }
        if (var6 < var8) {
            var8 = var6;
        }
        double var12 = 0.0D;
        double var14 = 0.0D;
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
        double var18 = var12 / 6.0D;
        int var20 = (int) (var18 * 256.0D);
        int var21 = (int) (var14 * 256.0D);
        if (var21 < 0) {
            var21 = 0;
        } else if (var21 > 255) {
            var21 = 255;
        }
        int var22 = (int) (var16 * 256.0D);
        if (var22 < 0) {
            var22 = 0;
        } else if (var22 > 255) {
            var22 = 255;
        }
        if (var22 > 243) {
            var21 >>= 0x4;
        } else if (var22 > 217) {
            var21 >>= 0x3;
        } else if (var22 > 192) {
            var21 >>= 0x2;
        } else if (var22 > 179) {
            var21 >>= 0x1;
        }
        return (var21 >> 5 << 7) + ((var20 >> 2 << 10) + (var22 >> 1));
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(ILji;)Lfi;")
    public static final class203 method852(int arg0, class225 arg1) {
        field2083++;
        return arg0 == 0 ? new class203(arg1.method1568(112), arg1.method1568(121), arg1.method1568(110), arg1.method1568(arg0 + 116), arg1.method1591(2), arg1.method1591(2), arg1.method1580(-98)) : null;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(Lpf;B)V")
    public static final void method853(class213 arg0, byte arg1) {
        field2092++;
        if (arg1 < 114) {
            field2087 = null;
        }
        int var2 = -1;
        long var3 = 0L;
        if (arg0.field3765 == 0) {
            var3 = class241.method1687(arg0.field3758, arg0.field3770, arg0.field3767);
        }
        if (arg0.field3765 == 1) {
            var3 = class65.method429(arg0.field3758, arg0.field3770, arg0.field3767);
        }
        if (arg0.field3765 == 2) {
            var3 = class197.method1389(arg0.field3758, arg0.field3770, arg0.field3767);
        }
        int var5 = 0;
        if (arg0.field3765 == 3) {
            var3 = class192.method1365(arg0.field3758, arg0.field3770, arg0.field3767);
        }
        int var6 = 0;
        if (var3 != 0L) {
            var2 = (int) (var3 >>> 32) & Integer.MAX_VALUE;
            var6 = ((int) var3 & 0x302EBE) >> 20;
            var5 = ((int) var3 & 0x7F6B7) >> 14;
        }
        arg0.field3768 = var5;
        arg0.field3757 = var2;
        arg0.field3761 = var6;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIIZIIII)V")
    public static final void method854(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7) {
        field2090++;
        int var8 = 2048 - arg6 & 0x7FF;
        int var9 = 2048 - arg0 & 0x7FF;
        int var10 = 0;
        int var11 = 0;
        if (arg3) {
            return;
        }
        int var12 = arg7;
        if (var8 != 0) {
            int var13 = class15.field204[var8];
            int var14 = class15.field206[var8];
            var11 = -arg7 * var13 >> 16;
            var12 = arg7 * var14 >> 16;
        }
        if (var9 != 0) {
            int var15 = class15.field204[var9];
            var10 = var12 * var15 >> 16;
            int var16 = class15.field206[var9];
            var12 = var12 * var16 >> 16;
        }
        class244.field4353 = arg5 - var12;
        class137.field2306 = arg2 - var10;
        class81.field1371 = arg0;
        class229.field4116 = arg4 - var11;
        class170.field2876 = arg6;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(ZI)Z")
    public final boolean method855(boolean arg0, int arg1) {
        field2094++;
        return arg0 ? false : this.field2086[arg1].field2074;
    }

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "(B)V")
    public static void method856(byte arg0) {
        field2078 = null;
        if (arg0 <= 82) {
            method854(-74, 107, 34, false, 44, -2, 62, -76);
        }
        field2084 = null;
        field2089 = null;
        field2087 = null;
        field2093 = null;
    }

    @OriginalMember(owner = "client!tc", name = "<init>", descriptor = "(Lng;Lng;IZ)V")
    public class126(class121 arg0, class121 arg1, int arg2, boolean arg3) {
        class175 var5 = new class175();
        int var6 = arg0.method805((byte) 103, arg2);
        this.field2086 = new class125[var6];
        int[] var7 = arg0.method811(arg2, 0);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method826((byte) 35, arg2, var7[var8]);
            class273 var10 = null;
            int var11 = var9[0] & 0xFF << 8 | var9[1] & 0xFF;
            for (class273 var12 = (class273) var5.method1173(53); var12 != null; var12 = (class273) var5.method1175(-1)) {
                if (var12.field4823 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method806(var11, 0, (byte) 115);
                } else {
                    var13 = arg1.method806(0, var11, (byte) 115);
                }
                var10 = new class273(var11, var13);
                var5.method1176(var10, (byte) 38);
            }
            this.field2086[var7[var8]] = new class125(var9, var10);
        }
    }
}
