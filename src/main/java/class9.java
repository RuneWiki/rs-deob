import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lq")
public class class9 extends class32 {

    @OriginalMember(owner = "client!lq", name = "m", descriptor = "F")
    public static float field94 = 0.0F;

    @OriginalMember(owner = "client!lq", name = "l", descriptor = "[I")
    public static int[] field93 = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 85, 80, 84, 0, 91, 0, 0, 0, 81, 82, 86, 0, 0, 0, 0, 0, 0, 0, 0, 13, 0, 0, 0, 0, 83, 104, 105, 103, 102, 96, 98, 97, 99, 0, 0, 0, 0, 0, 0, 0, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, 0, 0, 0, 0, 0, 0, 0, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, 0, 0, 0, 0, 0, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, 0, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 0, 0, 0, 101, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!lq", name = "n", descriptor = "Lcq;")
    public static class110 field95 = new class110(51, -1);

    @OriginalMember(owner = "client!lq", name = "j", descriptor = "I")
    public static int field91;

    @OriginalMember(owner = "client!lq", name = "k", descriptor = "I")
    public static int field92;

    @OriginalMember(owner = "client!lq", name = "b", descriptor = "(I)V", line = 9)
    public static void method53(int arg0) {
        field93 = null;
        int var1 = -35 / ((arg0 + 39) / 39);
        field95 = null;
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(Lwn;[I[I[IB)V", line = 20)
    public static final void method54(class236 arg0, int[] arg1, int[] arg2, int[] arg3, byte arg4) {
        if (arg4 != 81) {
            return;
        }
        for (int var5 = 0; var5 < arg1.length; var5++) {
            int var6 = arg1[var5];
            int var7 = arg2[var5];
            int var8 = arg3[var5];
            int var9 = 0;
            while (var7 != 0 && var9 < arg0.field9483.length) {
                if ((var7 & 0x1) != 0) {
                    if (var6 == -1) {
                        arg0.field9483[var9] = null;
                    } else {
                        class257 var10 = class265.field3301.method3043(var6, -8191);
                        int var11 = var10.field3220;
                        class2 var12 = arg0.field9483[var9];
                        if (var12 != null) {
                            if (var12.field12 == var6) {
                                if (var11 == 0) {
                                    var12 = arg0.field9483[var9] = null;
                                } else if (var11 == 1) {
                                    var12.field10 = 1;
                                    var12.field13 = var8;
                                    var12.field8 = 0;
                                    var12.field9 = 0;
                                    var12.field14 = 0;
                                    class635.method3570((byte) -116, class362.field4859 == arg0, arg0.field5179, var10, arg0.field5166, arg0.field5176, 0);
                                } else if (var11 == 2) {
                                    var12.field14 = 0;
                                }
                            } else if (var10.field3225 >= class265.field3301.method3043(var12.field12, -8191).field3225) {
                                var12 = arg0.field9483[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class2 var13 = arg0.field9483[var9] = new class2();
                            var13.field13 = var8;
                            var13.field12 = var6;
                            var13.field10 = 1;
                            var13.field14 = 0;
                            var13.field9 = 0;
                            var13.field8 = 0;
                            class635.method3570((byte) -123, class362.field4859 == arg0, arg0.field5179, var10, arg0.field5166, arg0.field5176, 0);
                        }
                    }
                }
                var9++;
                var7 >>>= 0x1;
            }
        }
        field92++;
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(IIZ)I", line = 135)
    public static final int method55(int arg0, int arg1, boolean arg2) {
        field91++;
        if (class415.field5567 == -1) {
            return 1;
        }
        if (class430.field6109 != arg1) {
            class296.method1735(arg1, class198.field2298.method1195((byte) 62, class504.field7267), true);
            if (class430.field6109 != arg1) {
                return -1;
            }
        }
        try {
            Dimension var3 = class41.field407.getSize();
            class695.method3824(class198.field2298.method1195((byte) 62, class504.field7267), class701.field9813, class698.field9799, false, class436.field6153, arg2);
            class581 var4 = class331.method1919(0, (byte) -43, class436.field6155, class415.field5567);
            long var5 = class557.method3157(-69);
            class701.field9813.method1050();
            class499.field7213.method23(0, class291.field3640, 0);
            class701.field9813.method992(class499.field7213);
            class701.field9813.method997(var3.width / 2, var3.height / 2, 512, 512);
            class701.field9813.method949(1.0F);
            class701.field9813.method1032(16777215, 0.5F, 0.5F, 20.0F, -50.0F, 30.0F);
            class473 var7 = class701.field9813.method1051(var4, 2048, 64, 64, 768);
            int var8 = 0;
            label41: for (int var9 = 0; var9 < 500; var9++) {
                class701.field9813.method1002(0);
                class701.field9813.method969();
                for (int var10 = 15; var10 >= 0; var10--) {
                    for (int var11 = 0; var11 <= var10; var11++) {
                        class143.field1593.method23((int) (((float) var11 - ((float) var10 / 2.0F)) * (float) class171.field1904), 0, (var10 + 1) * class171.field1904);
                        var7.method1914(class143.field1593, null, 0);
                        var8++;
                        if ((long) arg0 <= class557.method3157(-58) - var5) {
                            break label41;
                        }
                    }
                }
            }
            class701.field9813.method974();
            long var12 = (long) (var8 * 1000) / (class557.method3157(-54) - var5);
            class701.field9813.method1002(0);
            class701.field9813.method969();
            return (int) var12;
        } catch (Throwable var15) {
            var15.printStackTrace();
            return -1;
        }
    }
}
