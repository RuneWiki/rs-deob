import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class197 extends class297 {

    @OriginalMember(owner = "client!db", name = "I", descriptor = "I")
    private int field3028 = 4;

    @OriginalMember(owner = "client!db", name = "N", descriptor = "I")
    private int field3032 = 4;

    @OriginalMember(owner = "client!db", name = "J", descriptor = "[Lph;")
    public static class86[] field3029 = new class86[32768];

    @OriginalMember(owner = "client!db", name = "L", descriptor = "[Ljava/lang/String;")
    public static String[] field3030 = new String[100];

    @OriginalMember(owner = "client!db", name = "R", descriptor = "Ljava/lang/String;")
    public static String field3036 = "Face here";

    @OriginalMember(owner = "client!db", name = "U", descriptor = "Z")
    public static boolean field3039 = false;

    @OriginalMember(owner = "client!db", name = "M", descriptor = "I")
    public static int field3031;

    @OriginalMember(owner = "client!db", name = "O", descriptor = "I")
    public static int field3033;

    @OriginalMember(owner = "client!db", name = "P", descriptor = "I")
    public static int field3034;

    @OriginalMember(owner = "client!db", name = "Q", descriptor = "I")
    public static int field3035;

    @OriginalMember(owner = "client!db", name = "S", descriptor = "I")
    public static int field3037;

    @OriginalMember(owner = "client!db", name = "T", descriptor = "I")
    public static int field3038;

    @OriginalMember(owner = "client!db", name = "f", descriptor = "(I)V", line = 4)
    public static void method1393(int arg0) {
        field3029 = null;
        field3036 = null;
        if (arg0 == 0) {
            field3030 = null;
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(II)V", line = 16)
    public static final void method1394(int arg0, int arg1) {
        if (class79.field1238 == null || class79.field1238.length < arg0) {
            class79.field1238 = new int[arg0];
        }
        field3038++;
        if (arg1 != 0) {
            method1395(12, 9);
        }
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(II)I", line = 34)
    public static final int method1395(int arg0, int arg1) {
        if (arg0 < 116) {
            method1395(66, -44);
        }
        field3033++;
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IIIZFZII)[I", line = 46)
    public static final int[] method1396(int arg0, int arg1, int arg2, boolean arg3, float arg4, boolean arg5, int arg6, int arg7) {
        field3037++;
        int[] var8 = new int[arg7];
        if (arg3) {
            method1396(-100, -59, 45, false, 0.41915864F, false, 52, 95);
        }
        class237 var9 = new class237();
        var9.field3569 = arg2;
        var9.field3574 = arg1;
        var9.field3570 = arg6;
        var9.field3580 = arg5;
        var9.field3554 = (int) (arg4 * 4096.0F);
        var9.field3568 = arg0;
        var9.method247((byte) 68);
        class244.method1719(1, arg7, 128);
        var9.method1699(-43, var8, 0);
        return var8;
    }

    @OriginalMember(owner = "client!db", name = "<init>", descriptor = "()V", line = 215)
    public class197() {
        super(1, false);
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IZ)[I", line = 91)
    public final int[] method173(int arg0, boolean arg1) {
        int[] var3 = this.field4760.method215(arg0, 19142);
        field3034++;
        if (!arg1) {
            field3036 = (String) null;
        }
        if (this.field4760.field388) {
            int var4 = class31.field491 / this.field3032;
            int var5 = class164.field2670 / this.field3028;
            int[] var6;
            if (var5 <= 0) {
                var6 = this.method2109(0, (byte) 73, 0);
            } else {
                int var7 = arg0 % var5;
                var6 = this.method2109(class164.field2670 * var7 / var5, (byte) 31, 0);
            }
            for (int var8 = 0; var8 < class31.field491; var8++) {
                if (var4 > 0) {
                    int var9 = var8 % var4;
                    var3[var8] = var6[class31.field491 * var9 / var4];
                } else {
                    var3[var8] = var6[0];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IB)[[I", line = 144)
    public final int[][] method172(int arg0, byte arg1) {
        field3031++;
        int[][] var3 = this.field4767.method1141(-1677, arg0);
        if (this.field4767.field2480) {
            int var4 = class31.field491 / this.field3032;
            int var5 = class164.field2670 / this.field3028;
            int[][] var7;
            if (var5 > 0) {
                int var6 = arg0 % var5;
                var7 = this.method2105(class164.field2670 * var6 / var5, arg1 ^ 0x3D, 0);
            } else {
                var7 = this.method2105(0, 2, 0);
            }
            int[] var8 = var7[0];
            int[] var9 = var3[0];
            int[] var10 = var7[2];
            int[] var11 = var7[1];
            int[] var12 = var3[1];
            int[] var13 = var3[2];
            for (int var14 = 0; var14 < class31.field491; var14++) {
                int var16;
                if (var4 > 0) {
                    int var15 = var14 % var4;
                    var16 = class31.field491 * var15 / var4;
                } else {
                    var16 = 0;
                }
                var9[var14] = var8[var16];
                var12[var14] = var11[var16];
                var13[var14] = var10[var16];
            }
        }
        if (arg1 != 63) {
            field3030 = (String[]) null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IILaj;)V", line = 227)
    public final void method169(int arg0, int arg1, class1 arg2) {
        if (arg0 == 0) {
            this.field3032 = arg2.method15((byte) 104);
        } else if (arg0 == 1) {
            this.field3028 = arg2.method15((byte) 119);
        }
        if (arg1 != 255) {
            this.field3028 = -4;
        }
        field3035++;
    }
}
