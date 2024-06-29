import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vo")
public class class367 extends class102 {

    @OriginalMember(owner = "client!vo", name = "J", descriptor = "Lmq;")
    public static class78 field5191 = new class78(64, 2);

    @OriginalMember(owner = "client!vo", name = "M", descriptor = "I")
    public static int field5194 = 0;

    @OriginalMember(owner = "client!vo", name = "D", descriptor = "I")
    public static int field5185;

    @OriginalMember(owner = "client!vo", name = "E", descriptor = "I")
    public static int field5186;

    @OriginalMember(owner = "client!vo", name = "G", descriptor = "I")
    public static int field5188;

    @OriginalMember(owner = "client!vo", name = "H", descriptor = "I")
    public static int field5189;

    @OriginalMember(owner = "client!vo", name = "I", descriptor = "I")
    public static int field5190;

    @OriginalMember(owner = "client!vo", name = "K", descriptor = "I")
    public static int field5192;

    @OriginalMember(owner = "client!vo", name = "F", descriptor = "[B")
    private byte[] field5187;

    @OriginalMember(owner = "client!vo", name = "L", descriptor = "[I")
    public static int[] field5193;

    @OriginalMember(owner = "client!vo", name = "c", descriptor = "(II)V", line = 4)
    public static final void method2251(int arg0, int arg1) {
        if (arg1 > -101) {
            method2256(-43, -8);
        }
        field5188++;
        class548 var2 = class696.method3872(arg0, 2, -1633381944);
        var2.method3127((byte) 121);
    }

    @OriginalMember(owner = "client!vo", name = "c", descriptor = "(B)V", line = 17)
    public static final void method2252(byte arg0) {
        for (class389 var1 = (class389) class326.field4157.method3111(52); var1 != null; var1 = (class389) class326.field4157.method3116(-85)) {
            if (var1.field5420) {
                var1.method2322(105);
            }
        }
        field5192++;
        int var2 = -128 % ((arg0 - 79) / 45);
        for (class389 var3 = (class389) class204.field2596.method3111(89); var3 != null; var3 = (class389) class204.field2596.method3116(-82)) {
            if (var3.field5420) {
                var3.method2322(94);
            }
        }
    }

    @OriginalMember(owner = "client!vo", name = "<init>", descriptor = "()V", line = 51)
    public class367() {
        super(12, 5, 16, 2, 2, 0.45F);
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(IIIZI)V", line = 54)
    public static final void method2253(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        field5186++;
        if (!arg3 && class108.field1336 == arg4 && class509.field7194 == arg0 && class553.field7772 == class223.field2946 || class223.field2944.field619.method444((byte) -122) == 1 || arg1 >= -110) {
            return;
        }
        class108.field1336 = arg4;
        class553.field7772 = class223.field2946;
        class509.field7194 = arg0;
        if (class223.field2944.field619.method444((byte) -123) == 1) {
            class553.field7772 = 0;
        }
        class614.method3369(arg2, (byte) -110);
        class760.method4231(true, class619.field8670, class458.field6407, class543.field7644, true, class586.field8137.method3261(class416.field5920, (byte) 82));
        int var5 = class63.field851;
        int var6 = class753.field10509;
        class63.field851 = (class108.field1336 - (class613.field8591 >> 4)) * 8;
        class753.field10509 = (class509.field7194 - (class1.field3 >> 4)) * 8;
        class258.field3279 = class341.method2009(class108.field1336 * 8, class509.field7194 * 8);
        class512.field7223 = null;
        int var7 = class63.field851 - var5;
        int var8 = class753.field10509 - var6;
        if (arg2 == 11) {
            for (int var9 = 0; var9 < class676.field9195; var9++) {
                class247 var10 = class38.field559[var9];
                if (var10 != null) {
                    class124 var11 = var10.field3158;
                    for (int var12 = 0; var12 < 10; var12++) {
                        var11.field435[var12] -= var7;
                        var11.field426[var12] -= var8;
                    }
                    var11.field5784 -= var8 * 512;
                    var11.field5790 -= var7 * 512;
                }
            }
        } else {
            boolean var13 = false;
            class443.field6200 = 0;
            int var14 = (class613.field8591 - 1) * 512;
            int var15 = class1.field3 * 512 - 512;
            for (int var16 = 0; var16 < class676.field9195; var16++) {
                class247 var29 = class38.field559[var16];
                if (var29 != null) {
                    class124 var30 = var29.field3158;
                    var30.field5790 -= var7 * 512;
                    var30.field5784 -= var8 * 512;
                    if (var30.field5790 >= 0 && var30.field5790 <= var14 && var30.field5784 >= 0 && var30.field5784 <= var15) {
                        boolean var31 = true;
                        for (int var32 = 0; var32 < 10; var32++) {
                            var30.field435[var32] -= var7;
                            var30.field426[var32] -= var8;
                            if (var30.field435[var32] < 0 || class613.field8591 <= var30.field435[var32] || var30.field426[var32] < 0 || class1.field3 <= var30.field426[var32]) {
                                var31 = false;
                            }
                        }
                        if (var31) {
                            class61.field832[class443.field6200++] = var30.field354;
                        } else {
                            var30.method803(-86, null);
                            var29.method3426((byte) -77);
                            var13 = true;
                        }
                    } else {
                        var30.method803(-101, null);
                        var13 = true;
                        var29.method3426((byte) -97);
                    }
                }
            }
            if (var13) {
                class676.field9195 = class563.field7875.method3244((byte) 127);
                class563.field7875.method3250(class38.field559, 0);
            }
        }
        for (int var17 = 0; var17 < 2048; var17++) {
            class546 var27 = class447.field6287[var17];
            if (var27 != null) {
                for (int var28 = 0; var28 < 10; var28++) {
                    var27.field435[var28] -= var7;
                    var27.field426[var28] -= var8;
                }
                var27.field5790 -= var7 * 512;
                var27.field5784 -= var8 * 512;
            }
        }
        class126[] var18 = class498.field7043;
        for (int var19 = 0; var19 < var18.length; var19++) {
            class126 var26 = var18[var19];
            if (var26 != null) {
                var26.field1516 -= var7 * 512;
                var26.field1517 -= var8 * 512;
            }
        }
        for (class63 var20 = (class63) class73.field955.method3111(91); var20 != null; var20 = (class63) class73.field955.method3116(-79)) {
            var20.field848 -= var8;
            var20.field856 -= var7;
            if (class506.field7142 != 4 && (var20.field856 < 0 || var20.field848 < 0 || var20.field856 >= class613.field8591 || var20.field848 >= class1.field3)) {
                var20.method3426((byte) -121);
            }
        }
        if (class506.field7142 != 4) {
            for (class585 var21 = (class585) class497.field7028.method3245(false); var21 != null; var21 = (class585) class497.field7028.method3252(12938)) {
                int var22 = (int) (var21.field8746 & 0x3FFFL);
                int var23 = var22 - class63.field851;
                int var24 = (int) (var21.field8746 >> 14 & 0x3FFFL);
                int var25 = var24 - class753.field10509;
                if (var23 < 0 || var25 < 0 || class613.field8591 <= var23 || class1.field3 <= var25) {
                    var21.method3426((byte) -46);
                }
            }
        }
        if (class333.field4292 != 0) {
            class333.field4292 -= var7;
            class721.field10159 -= var8;
        }
        class219.method1365((byte) 127);
        if (arg2 != 11) {
            class692.field9814 -= var8;
            class407.field5744 -= var8 * 512;
            class274.field3466 -= var7;
            class579.field8054 -= var8;
            class49.field728 -= var7;
            class505.field7134 -= var7 * 512;
            if (Math.abs(var7) > class613.field8591 || Math.abs(var8) > class1.field3) {
                class37.method328((byte) -45);
            }
        } else if (class276.field3497 == 4) {
            class175.field2278 -= var8 * 512;
            class324.field4135 -= var7 * 512;
            class418.field5941 -= var8 * 512;
            class742.field10372 -= var7 * 512;
        } else {
            class335.field4311 = -1;
            class147.field1783 = -1;
            class276.field3497 = 1;
        }
        class304.method1786((byte) -42);
        class289.method1730((byte) -108);
        class631.field8763.method3114(true);
        class700.field9873.method3114(true);
        class652.field8973.method1838((byte) 22);
        class17.method206((byte) 70);
    }

    @OriginalMember(owner = "client!vo", name = "g", descriptor = "(I)V", line = 324)
    public static void method2254(int arg0) {
        if (arg0 == -5) {
            field5193 = null;
            field5191 = null;
        }
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(IIII)[B", line = 335)
    public final byte[] method2255(int arg0, int arg1, int arg2, int arg3) {
        field5185++;
        this.field5187 = new byte[arg1 * arg3 * arg2 * 2];
        this.method2260(arg3, arg1, arg2, (byte) 123);
        if (arg0 != 132733924) {
            field5191 = null;
        }
        return this.field5187;
    }

    @OriginalMember(owner = "client!vo", name = "d", descriptor = "(II)I", line = 352)
    public static final int method2256(int arg0, int arg1) {
        return class84.field1088 == null ? 0 : class84.field1088[arg0][arg1] & 0xFF;
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(IBI)V", line = 359)
    public final void method682(int arg0, byte arg1, int arg2) {
        field5189++;
        byte var4 = (byte) (((arg1 & 0xFF) >> 1) + 127);
        int var5 = arg0 * 2;
        if (arg2 >= 15) {
            this.field5187[var5++] = var4;
            this.field5187[var5] = var4;
        }
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(BII)V", line = 375)
    public static final void method2257(byte arg0, int arg1, int arg2) {
        field5190++;
        if (arg0 != -58) {
            field5194 = -48;
        }
        class548 var3 = class696.method3872(arg1, 14, -1633381944);
        var3.method3130(99);
        var3.field7725 = arg2;
    }
}
