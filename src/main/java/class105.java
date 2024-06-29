import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class105 extends class306 {

    @OriginalMember(owner = "client!bb", name = "I", descriptor = "I")
    private int field1444 = 4096;

    @OriginalMember(owner = "client!bb", name = "L", descriptor = "I")
    private int field1447 = 4096;

    @OriginalMember(owner = "client!bb", name = "N", descriptor = "[I")
    private int[] field1449 = new int[3];

    @OriginalMember(owner = "client!bb", name = "J", descriptor = "I")
    private int field1445 = 4096;

    @OriginalMember(owner = "client!bb", name = "T", descriptor = "I")
    private int field1455 = 409;

    @OriginalMember(owner = "client!bb", name = "G", descriptor = "[S")
    public static short[] field1442 = new short[500];

    @OriginalMember(owner = "client!bb", name = "H", descriptor = "[Lwf;")
    public static class67[] field1443 = new class67[2048];

    @OriginalMember(owner = "client!bb", name = "K", descriptor = "I")
    public static int field1446;

    @OriginalMember(owner = "client!bb", name = "O", descriptor = "I")
    public static int field1450;

    @OriginalMember(owner = "client!bb", name = "Q", descriptor = "I")
    public static int field1452;

    @OriginalMember(owner = "client!bb", name = "R", descriptor = "I")
    public static int field1453;

    @OriginalMember(owner = "client!bb", name = "S", descriptor = "I")
    public static int field1454;

    @OriginalMember(owner = "client!bb", name = "P", descriptor = "Z")
    public static boolean field1451;

    @OriginalMember(owner = "client!bb", name = "M", descriptor = "[Lcf;")
    public static class149[] field1448;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(IB)[[I", line = 5)
    public final int[][] method681(int arg0, byte arg1) {
        if (arg1 != -119) {
            this.field1455 = -104;
        }
        int[][] var3 = this.field4752.method1866(arg0, 0);
        if (this.field4752.field4179) {
            int[][] var4 = this.method2160(0, (byte) 109, arg0);
            int[] var5 = var4[1];
            int[] var6 = var4[0];
            int[] var7 = var4[2];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            int[] var10 = var3[0];
            for (int var11 = 0; var11 < class31.field367; var11++) {
                int var12 = var6[var11];
                int var13 = var12 - this.field1449[0];
                if (var13 < 0) {
                    var13 = -var13;
                }
                if (var13 > this.field1455) {
                    var10[var11] = var12;
                    var8[var11] = var5[var11];
                    var9[var11] = var7[var11];
                } else {
                    int var14 = var5[var11];
                    int var15 = var14 - this.field1449[1];
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    if (var15 > this.field1455) {
                        var10[var11] = var12;
                        var8[var11] = var14;
                        var9[var11] = var7[var11];
                    } else {
                        int var16 = var7[var11];
                        int var17 = var16 - this.field1449[2];
                        if (var17 < 0) {
                            var17 = -var17;
                        }
                        if (var17 <= this.field1455) {
                            var10[var11] = this.field1447 * var12 >> 12;
                            var8[var11] = this.field1444 * var14 >> 12;
                            var9[var11] = this.field1445 * var16 >> 12;
                        } else {
                            var10[var11] = var12;
                            var8[var11] = var14;
                            var9[var11] = var16;
                        }
                    }
                }
            }
        }
        field1446++;
        return var3;
    }

    @OriginalMember(owner = "client!bb", name = "<init>", descriptor = "()V", line = 95)
    public class105() {
        super(1, false);
    }

    @OriginalMember(owner = "client!bb", name = "e", descriptor = "(B)V", line = 102)
    public static final void method682(byte arg0) {
        field1454++;
        if (class304.field4741 == null || class323.field5147 == null) {
            class323.field5147 = new int[256];
            class304.field4741 = new int[256];
            for (int var1 = 0; var1 < 256; var1++) {
                double var2 = (double) var1 / 255.0D * 6.283185307179586D;
                class304.field4741[var1] = (int) (Math.sin(var2) * 4096.0D);
                class323.field5147[var1] = (int) (Math.cos(var2) * 4096.0D);
            }
        }
        if (arg0 >= -32) {
            method684((byte) -62);
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(IILhi;ILpa;II)V", line = 132)
    public static final void method683(int arg0, int arg1, class323 arg2, int arg3, class2 arg4, int arg5, int arg6) {
        field1452++;
        if (arg4 == null) {
            return;
        }
        int var7 = (int) class190.field2855 + class132.field1912 & 0x7FF;
        int var8 = arg6 * arg6 + (arg3 * arg3);
        int var9 = Math.max(arg2.field5169 / 2, arg2.field5174 / 2) + 10;
        if (var9 * var9 < var8) {
            return;
        }
        int var10 = class104.field1426[var7];
        int var11 = var10 * 256 / (class67.field831 + 256);
        int var12 = class104.field1435[var7];
        int var13 = 83 / ((48 - arg5) / 43);
        int var14 = var12 * 256 / (class67.field831 + 256);
        int var15 = arg3 * var14 - (arg6 * var11) >> 16;
        int var16 = arg3 * var11 + arg6 * var14 >> 16;
        if (class272.field4317) {
            ((class200) arg4).method1390(arg1 + var16 - (arg4.field17 / 2 - (arg2.field5169 / 2)), arg0 - var15 + arg2.field5174 / 2 + -(arg4.field16 / 2), (class200) arg2.method2249(109, false));
        } else {
            ((class158) arg4).method1152(arg1 + (arg2.field5169 / 2) + var16 - (arg4.field17 / 2), arg2.field5174 / 2 + -var15 + arg0 + -(arg4.field16 / 2), arg2.field5175, arg2.field5093);
        }
    }

    @OriginalMember(owner = "client!bb", name = "f", descriptor = "(B)V", line = 170)
    public static void method684(byte arg0) {
        field1443 = null;
        if (arg0 != -79) {
            method683(111, 26, (class323) null, 3, (class2) null, 117, -35);
        }
        field1442 = null;
        field1448 = null;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(ILlf;I)V", line = 208)
    public final void method45(int arg0, class143 arg1, int arg2) {
        if (arg2 == 0) {
            this.field1455 = arg1.method1051(1);
        } else if (arg2 == 1) {
            this.field1445 = arg1.method1051(1);
        } else if (arg2 == 2) {
            this.field1444 = arg1.method1051(1);
        } else if (arg2 == 3) {
            this.field1447 = arg1.method1051(arg0 + 15335);
        } else if (arg2 == 4) {
            int var5 = arg1.method1017((byte) 101);
            this.field1449[0] = class261.method1840(267386880, var5 << 4);
            this.field1449[1] = class261.method1840(var5 >> 4, 4080);
            this.field1449[2] = class261.method1840(var5 >> 12, 0);
        }
        if (arg0 != -15334) {
            method683(35, -27, (class323) null, 112, (class2) null, -82, -22);
        }
        field1453++;
    }

    @OriginalMember(owner = "client!bb", name = "e", descriptor = "(I)V", line = 275)
    public static final void method685(int arg0) {
        field1450++;
        int var1 = class357.field5669;
        int var2 = class151.field2399;
        int var3 = class257.field4073;
        if (arg0 > -119) {
            return;
        }
        int var4 = class251.field3977;
        int var5 = 6116423;
        if (class272.field4317) {
            class239.method1659(var1, var2, var3, var4, var5);
            class239.method1659(var1 + 1, var2 + 1, var3 - 2, 16, 0);
            class239.method1665(var1 + 1, var2 + 18, var3 - 2, var4 - 19, 0);
        } else {
            class343.method2352(var1, var2, var3, var4, var5);
            class343.method2352(var1 + 1, var2 + 1, var3 - 2, 16, 0);
            class343.method2369(var1 + 1, var2 + 18, var3 - 2, var4 + -19, 0);
        }
        class93.field1233.method1685(class110.field1513, var1 + 3, var2 + 14, var5, -1);
        int var6 = class128.field1873;
        int var7 = class197.field3009;
        for (int var8 = 0; var8 < class74.field924; var8++) {
            int var9 = var2 + ((class74.field924 - var8 - 1) * 15) + 31;
            int var10 = 16777215;
            if (var1 < var7 && var7 < var1 + var3 && (var9 - 13) < var6 && var6 < (var9 + 3)) {
                var10 = 16776960;
            }
            class93.field1233.method1685(class2.method14(var8, true), var1 + 3, var9, var10, 0);
        }
        class356.method2455(class151.field2399, class257.field4073, 54, class357.field5669, class251.field3977);
    }
}
