import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!er")
public class class90 {

    @OriginalMember(owner = "client!er", name = "b", descriptor = "I")
    public int field1256;

    @OriginalMember(owner = "client!er", name = "e", descriptor = "Ljava/lang/String;")
    public String field1259;

    @OriginalMember(owner = "client!er", name = "g", descriptor = "Lwo;")
    public static class690 field1261 = new class690(42, 4);

    @OriginalMember(owner = "client!er", name = "h", descriptor = "Ljk;")
    public static class585 field1262 = new class585(83, 0);

    @OriginalMember(owner = "client!er", name = "a", descriptor = "I")
    public static int field1255;

    @OriginalMember(owner = "client!er", name = "c", descriptor = "I")
    public static int field1257;

    @OriginalMember(owner = "client!er", name = "d", descriptor = "I")
    public static int field1258;

    @OriginalMember(owner = "client!er", name = "f", descriptor = "I")
    public static int field1260;

    @OriginalMember(owner = "client!er", name = "i", descriptor = "Lnga;")
    public static class477 field1263;

    @OriginalMember(owner = "client!er", name = "j", descriptor = "[Lpc;")
    public static class621[] field1264;

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(BI)I")
    public static final int method703(byte arg0, int arg1) {
        field1255++;
        double var2 = (double) (arg1 >> 16 & 0xFF) / 256.0D;
        double var4 = (double) (arg1 >> 8 & 0xFF) / 256.0D;
        double var6 = (double) (arg1 & 0xFF) / 256.0D;
        double var8 = var2;
        if (var2 > var4) {
            var8 = var4;
        }
        if (arg0 >= -51) {
            method705(null, (byte) -41, null);
        }
        if (var6 < var8) {
            var8 = var6;
        }
        double var10 = var2;
        if (var4 > var2) {
            var10 = var4;
        }
        if (var6 > var10) {
            var10 = var6;
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
        return ((var20 & 0xFF) >> 2 << 10) + (var22 >> 1) + (var21 >> 5 << 7);
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(ZBI)I")
    public static final int method704(boolean arg0, byte arg1, int arg2) {
        field1257++;
        if (arg0) {
            return 0;
        }
        class122 var3 = class673.method3829(1, arg0, arg2);
        if (var3 == null) {
            return class355.field4741.method3457(-72, arg2).field4129;
        }
        if (arg1 >= -106) {
            method705(null, (byte) -54, null);
        }
        int var4 = 0;
        for (int var5 = 0; var5 < var3.field1574.length; var5++) {
            if (var3.field1574[var5] == -1) {
                var4++;
            }
        }
        return var4 + (class355.field4741.method3457(-106, arg2).field4129 - var3.field1574.length);
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "([[BBLjs;)V")
    public static final void method705(byte[][] arg0, byte arg1, class302 arg2) {
        field1258++;
        int[] var3 = new int[] { -1, 0, 0, 0, 0 };
        if (arg1 <= 80) {
            method703((byte) -12, -122);
        }
        for (int var4 = 0; var4 < arg2.field5732; var4++) {
            class317.method1849(-1);
            for (int var5 = 0; var5 < class473.field6604 >> 3; var5++) {
                for (int var6 = 0; var6 < class205.field2465 >> 3; var6++) {
                    int var7 = class50.field831[var4][var5][var6];
                    if (var7 != -1) {
                        int var8 = var7 >> 24 & 0x3;
                        if (!arg2.field5716 || var8 == 0) {
                            int var9 = var7 >> 1 & 0x3;
                            int var10 = (var7 & 0xFFF734) >> 14;
                            int var11 = (var7 & 0x3FFB) >> 3;
                            int var12 = (var10 / 8 << 8) + var11 / 8;
                            for (int var13 = 0; var13 < class312.field4119.length; var13++) {
                                if (class312.field4119[var13] == var12 && arg0[var13] != null) {
                                    class389 var14 = new class389(arg0[var13]);
                                    arg2.method2444(var5 * 8, var9, var10, class349.field4642, var14, 124, var8, var4, var11, var6 * 8);
                                    arg2.method1788(var8, var5 * 8, var14, class68.field1045, var3[0] == -1 ? var3 : null, var11, var4, var10, var6 * 8, -111, var9);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (var3[0] != -1) {
            class418.field5919 = class415.field5873.method2756(var3[0], -118, class32.field653, var3[3], var3[2], var3[1]);
            class54.field869 = var3[4];
        }
    }

    @OriginalMember(owner = "client!er", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class90(String arg0, int arg1) {
        this.field1256 = arg1;
        this.field1259 = arg0;
    }

    @OriginalMember(owner = "client!er", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field1260++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(B)V")
    public static void method706(byte arg0) {
        field1263 = null;
        field1262 = null;
        field1264 = null;
        field1261 = null;
        if (arg0 >= -85) {
            method705(null, (byte) 86, null);
        }
    }
}
