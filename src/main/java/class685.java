import java.awt.Canvas;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sv")
public class class685 extends class540 {

    @OriginalMember(owner = "client!sv", name = "p", descriptor = "[I")
    public int[] field9723 = new int[] { -1 };

    @OriginalMember(owner = "client!sv", name = "n", descriptor = "[I")
    public int[] field9721 = new int[1];

    @OriginalMember(owner = "client!sv", name = "o", descriptor = "[I")
    public static int[] field9722 = new int[500];

    @OriginalMember(owner = "client!sv", name = "m", descriptor = "[I")
    public static int[] field9720 = new int[2];

    @OriginalMember(owner = "client!sv", name = "s", descriptor = "Ljo;")
    public static class351 field9726 = new class351(84, 15);

    @OriginalMember(owner = "client!sv", name = "i", descriptor = "I")
    public static int field9716;

    @OriginalMember(owner = "client!sv", name = "j", descriptor = "I")
    public static int field9717;

    @OriginalMember(owner = "client!sv", name = "k", descriptor = "I")
    public static int field9718;

    @OriginalMember(owner = "client!sv", name = "l", descriptor = "I")
    public static int field9719;

    @OriginalMember(owner = "client!sv", name = "q", descriptor = "I")
    public static int field9724;

    @OriginalMember(owner = "client!sv", name = "r", descriptor = "I")
    public static int field9725;

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(B)V")
    public static void method3863(byte arg0) {
        field9722 = null;
        field9726 = null;
        if (arg0 <= -46) {
            field9720 = null;
        }
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(Lco;Lmw;IIIZLha;III)Lka;")
    public final class495 method3864(class129 arg0, class515 arg1, int arg2, int arg3, int arg4, boolean arg5, class66 arg6, int arg7, int arg8, int arg9) {
        field9724++;
        class495 var11 = null;
        int var12 = arg8;
        class607 var13 = null;
        if (arg3 != -1) {
            var13 = class549.field7742.method3800(false, arg3);
        }
        int[] var14 = this.field9723;
        if (var13 != null && var13.field8567 != null) {
            var14 = new int[var13.field8567.length];
            for (int var15 = 0; var15 < var13.field8567.length; var15++) {
                int var16 = var13.field8567[var15];
                if (var16 >= 0 && this.field9723.length > var16) {
                    var14[var15] = this.field9723[var16];
                } else {
                    var14[var15] = -1;
                }
            }
        }
        boolean var17 = false;
        boolean var18 = false;
        boolean var19 = false;
        boolean var20 = false;
        int var21 = -1;
        int var22 = -1;
        int var23 = 0;
        class520 var24 = null;
        class520 var25 = null;
        if (arg0 != null) {
            int var26 = arg0.field1684[arg7];
            var12 = arg8 | 0x20;
            int var27 = var26 >>> 16;
            var21 = var26 & 0xFFFF;
            var24 = class203.field2975.method1935(984, var27);
            if (var24 != null) {
                var18 |= var24.method3033(true, var21);
                var17 |= var24.method3029(false, var21);
                var20 |= var24.method3034(var21, 0);
                var19 |= arg0.field1674;
            }
            if ((arg0.field1686 || class180.field2725) && arg2 != -1 && arg0.field1684.length > arg2) {
                var23 = arg0.field1668[arg7];
                int var28 = arg0.field1684[arg2];
                int var29 = var28 >>> 16;
                var22 = var28 & 0xFFFF;
                if (var27 == var29) {
                    var25 = var24;
                } else {
                    var25 = class203.field2975.method1935(arg9 + 8848, var22 >>> 16);
                }
                if (var25 != null) {
                    var18 |= var25.method3033(true, var22);
                    var17 |= var25.method3029(false, var22);
                    var20 |= var25.method3034(var22, 0);
                }
            }
            if (var18) {
                var12 |= 0x80;
            }
            if (var17) {
                var12 |= 0x100;
            }
            if (var19) {
                var12 |= 0x200;
            }
            if (var20) {
                var12 |= 0x400;
            }
        }
        long var30 = this.method3868(true, arg5, arg1 == null ? null : arg1.field7354, var14, arg3);
        if (class634.field8944 != null) {
            var11 = (class495) class634.field8944.method2373(var30, 103);
        }
        if (arg9 != -7864) {
            return null;
        }
        if (var11 == null || arg6.method451(var11.method113(), var12) != 0) {
            if (var11 != null) {
                var12 = arg6.method421(var12, var11.method113());
            }
            int var32 = var12;
            boolean var33 = false;
            for (int var34 = 0; var34 < var14.length; var34++) {
                if (var14[var34] != -1 && !class526.field7490.method3567(var14[var34], true).method2929(12407, arg5, null)) {
                    var33 = true;
                }
            }
            if (var33) {
                return null;
            }
            class229[] var35 = new class229[var14.length];
            for (int var36 = 0; var36 < var14.length; var36++) {
                if (var14[var36] != -1) {
                    var35[var36] = class526.field7490.method3567(var14[var36], true).method2911(arg9 - 23973, null, arg5);
                }
            }
            if (var13 != null && var13.field8572 != null) {
                for (int var37 = 0; var37 < var13.field8572.length; var37++) {
                    if (var13.field8572[var37] != null && var35[var37] != null) {
                        int var38 = var13.field8572[var37][0];
                        int var39 = var13.field8572[var37][1];
                        int var40 = var13.field8572[var37][2];
                        int var41 = var13.field8572[var37][3];
                        int var42 = var13.field8572[var37][4];
                        int var43 = var13.field8572[var37][5];
                        if (var41 != 0 || var42 != 0 || var43 != 0) {
                            var35[var37].method1586(var43, var41, 0, var42);
                        }
                        if (var38 != 0 || var39 != 0 || var40 != 0) {
                            var35[var37].method1582(var40, var39, var38, 24);
                        }
                    }
                }
            }
            if (arg1 != null) {
                var32 = var12 | 0x4000;
            }
            class229 var44 = new class229(var35, var35.length);
            var11 = arg6.method420(var44, var32, class637.field8967, 64, 850);
            if (arg1 != null) {
                for (int var45 = 0; var45 < 5; var45++) {
                    for (int var46 = 0; var46 < class126.field1651.length; var46++) {
                        if (class126.field1651[var46][var45].length > arg1.field7354[var45]) {
                            var11.method111(class481.field6844[var46][var45], class126.field1651[var46][var45][arg1.field7354[var45]]);
                        }
                    }
                }
            }
            if (class634.field8944 != null) {
                var11.method85(var12);
                class634.field8944.method2362(var11, 0, var30);
            }
        }
        if (arg0 == null || var24 == null) {
            return var11;
        } else {
            class495 var47 = var11.method81((byte) 1, var12, true);
            var47.method2890(var23, var22, arg9 + 7739, var24, var25, arg0.field1674, 0, var21, arg4 - 1);
            return var47;
        }
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(Ljava/awt/Canvas;Z)V")
    public static final void method3865(Canvas arg0, boolean arg1) {
        field9717++;
        Dimension var2 = arg0.getSize();
        if (!arg1) {
            method3867(-69);
        }
        class578.method3357(1, var2.height, var2.width);
        if (class463.field6612 == 1) {
            class438.field6281.method498(arg0, class745.field10372, class212.field3070);
        } else {
            class438.field6281.method498(arg0, class377.field5425, class333.field4974);
        }
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(II)Z")
    public static final boolean method3866(int arg0, int arg1) {
        if (arg1 == -1) {
            field9725++;
            return arg0 == 4 || arg0 == 8 || arg0 == 11;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(I)V")
    public static final void method3867(int arg0) {
        if (arg0 != -1999382392) {
            field9726 = null;
        }
        field9718++;
        class558.field7926.method2369(arg0 ^ 0x772C2777);
        class118.field1471.method2369(-1);
        class770.field10619.method2369(-1);
        class588.field8318.method2369(-1);
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(ZZ[I[II)J")
    private final long method3868(boolean arg0, boolean arg1, int[] arg2, int[] arg3, int arg4) {
        if (!arg0) {
            field9722 = null;
        }
        field9716++;
        long[] var6 = class77.field1030;
        long var7 = -1L;
        long var9 = var6[(int) (((long) (arg4 >> 8) ^ var7) & 0xFFL)] ^ var7 >>> 8;
        long var11 = var9 >>> 8 ^ var6[(int) (((long) arg4 ^ var9) & 0xFFL)];
        for (int var13 = 0; var13 < arg3.length; var13++) {
            long var17 = var6[(int) ((var11 ^ (long) (arg3[var13] >> 24)) & 0xFFL)] ^ var11 >>> 8;
            long var19 = var17 >>> 8 ^ var6[(int) ((var17 ^ (long) (arg3[var13] >> 16)) & 0xFFL)];
            long var21 = var6[(int) (((long) (arg3[var13] >> 8) ^ var19) & 0xFFL)] ^ var19 >>> 8;
            var11 = var21 >>> 8 ^ var6[(int) ((var21 ^ (long) arg3[var13]) & 0xFFL)];
        }
        if (arg2 != null) {
            for (int var14 = 0; var14 < 5; var14++) {
                var11 = var11 >>> 8 ^ var6[(int) (((long) arg2[var14] ^ var11) & 0xFFL)];
            }
        }
        return var11 >>> 8 ^ var6[(int) (((long) (arg1 ? 1 : 0) ^ var11) & 0xFFL)];
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(ILcb;Ljava/awt/Canvas;Ld;II)Lha;")
    public static final class66 method3869(int arg0, class544 arg1, Canvas arg2, class159 arg3, int arg4, int arg5) {
        field9719++;
        if (arg5 < 36) {
            return null;
        }
        int var6 = 0;
        int var7 = 0;
        if (arg2 != null) {
            Dimension var8 = arg2.getSize();
            var7 = var8.height;
            var6 = var8.width;
        }
        return class66.method402(var6, var7, arg0, arg2, arg4, arg1, true, arg3);
    }
}
