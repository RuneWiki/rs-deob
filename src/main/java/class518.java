import jaggl.OpenGL;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public class class518 extends class659 implements class629 {

    @OriginalMember(owner = "client!si", name = "D", descriptor = "Lsq;")
    public static class161 field7575 = new class161(6, 1);

    @OriginalMember(owner = "client!si", name = "E", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field7576 = new BigInteger("10001", 16);

    @OriginalMember(owner = "client!si", name = "F", descriptor = "[I")
    public static int[] field7577 = new int[1];

    @OriginalMember(owner = "client!si", name = "z", descriptor = "I")
    public static int field7571;

    @OriginalMember(owner = "client!si", name = "A", descriptor = "I")
    public static int field7572;

    @OriginalMember(owner = "client!si", name = "B", descriptor = "I")
    public static int field7573;

    @OriginalMember(owner = "client!si", name = "C", descriptor = "I")
    public static int field7574;

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IIII[[[B[I[I[I[I[IIBIIZZ)V")
    public static final void method3064(int arg0, int arg1, int arg2, int arg3, byte[][][] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, byte arg11, int arg12, int arg13, boolean arg14, boolean arg15) {
        class532.field7782 = class298.field4017.method232() > 0;
        class266.field3658 = arg15;
        class591.field8564 = arg1 >> class295.field3981;
        class33.field663 = arg3 >> class295.field3981;
        class53.field856 = arg1;
        class206.field2469 = arg3;
        class675.field9682 = arg2;
        class382.field5106 = class591.field8564 - class119.field1526;
        if (class382.field5106 < 0) {
            class361.field4806 = -class382.field5106;
            class382.field5106 = 0;
        } else {
            class361.field4806 = 0;
        }
        class123.field1588 = class33.field663 - class119.field1526;
        if (class123.field1588 < 0) {
            class564.field8153 = -class123.field1588;
            class123.field1588 = 0;
        } else {
            class564.field8153 = 0;
        }
        class215.field2738 = class591.field8564 + class119.field1526;
        if (class215.field2738 > class455.field6393) {
            class215.field2738 = class455.field6393;
        }
        class633.field9096 = class33.field663 + class119.field1526;
        if (class633.field9096 > class302.field4057) {
            class633.field9096 = class302.field4057;
        }
        boolean[][] var16 = class616.field8849;
        boolean[][] var17 = class341.field4502;
        if (class266.field3658) {
            for (int var18 = 0; var18 < class119.field1526 + class119.field1526 + 2; ++var18) {
                for (int var21 = 0; var21 < class119.field1526 + class119.field1526 + 2; ++var21) {
                    int var22 = class591.field8564 - class119.field1526 + var18;
                    int var23 = class33.field663 - class119.field1526 + var21;
                    if (var22 >= 0 && var23 >= 0 && var22 < class455.field6393 && var23 < class302.field4057) {
                        int var24 = var22 << class295.field3981;
                        int var25 = var23 << class295.field3981;
                        int var26 = class399.field5631[class399.field5631.length - 1].method437(104, var23, var22) - (1000 << class295.field3981 - 7);
                        int var27 = class340.field4500 != null ? class340.field4500[0].method437(96, var23, var22) + class454.field6392 : class399.field5631[0].method437(93, var23, var22) + class454.field6392;
                        class341.field4502[var18][var21] = class298.field4017.method217(var24, var26, var25, var24, var27, var25);
                    } else {
                        class341.field4502[var18][var21] = false;
                    }
                }
            }
            for (int var19 = 0; var19 < class119.field1526 + class119.field1526 + 1; ++var19) {
                for (int var20 = 0; var20 < class119.field1526 + class119.field1526 + 1; ++var20) {
                    class616.field8849[var19][var20] = class341.field4502[var19][var20] || class341.field4502[var19 + 1][var20] || class341.field4502[var19][var20 + 1] || class341.field4502[var19 + 1][var20 + 1];
                }
            }
            class160.field1952 = arg5;
            class442.field6299 = arg6;
            class219.field2836 = arg7;
            class82.field1177 = arg8;
            class195.field2366 = arg9;
            class101.method750(class298.field4017, 24818, arg10);
        } else {
            if (class37.field705 == null) {
                class37.field705 = new boolean[class455.field6393 + class455.field6393 + 1][class455.field6393 + class302.field4057 + 1];
                for (int var28 = 0; var28 < class37.field705.length; ++var28) {
                    for (int var29 = 0; var29 < class37.field705[0].length; ++var29) {
                        class37.field705[var28][var29] = true;
                    }
                }
            }
            class341.field4502 = class37.field705;
            class616.field8849 = class37.field705;
            class382.field5106 = 0;
            class123.field1588 = 0;
            class215.field2738 = class455.field6393;
            class633.field9096 = class302.field4057;
            class78.field1141 = 0;
        }
        class460.method2717(class298.field4017, (byte) 124);
        for (class626 var30 = (class626) class196.field2369.method2070((byte) 95); var30 != null; var30 = (class626) class196.field2369.method2068(-2001)) {
            var30.method2564((byte) 2);
            class698.method3916(var30, (byte) 76);
        }
        if (class532.field7782) {
            for (int var31 = 0; var31 < class100.field1342; ++var31) {
                class436.field6249[var31].method2791((byte) 94, arg0, arg14);
            }
        }
        if (class72.field1090) {
            class66.field1023 = class298.field4017.method264();
            class298.field4017.method251(class322.field4243);
            int var32 = (class322.field4243[2] - class322.field4243[0]) / class346.field4551;
            for (int var33 = 0; var33 < class346.field4551 - 1; ++var33) {
                class91.field1281[var33] = (var33 + 1) * var32 + class271.field3715[var33];
            }
            for (int var34 = 0; var34 < class271.field3698.length; ++var34) {
                class271.field3698[var34].method3152();
            }
        }
        if (class551.field8014 != null) {
            if (class72.field1090) {
                class585.method3396(0);
            }
            class410.method2473(true);
            class298.field4017.method229(-1, 1583160, 40, 127);
            class200.method1213(true, arg4, arg10, arg11);
            if (class72.field1090) {
                class55.method575();
            }
            class298.field4017.method291();
            class410.method2473(false);
        }
        class200.method1213(false, arg4, arg10, arg11);
        if (class72.field1090) {
            for (int var35 = 0; var35 < class663.field9391; ++var35) {
                class438.field6261[var35] = class504.field7036[var35];
            }
            class585.method3396(0);
            for (int var36 = 0; var36 < class271.field3698.length; ++var36) {
                class271.field3698[var36].method3152();
            }
        }
        if (class72.field1090) {
            class55.method575();
            for (int var37 = 0; var37 < class663.field9391; ++var37) {
                class504.field7036[var37] = class438.field6261[var37];
            }
            if (class298.field4019 == 2) {
                int var10002;
                if (class664.field9396[0] < class664.field9396[1]) {
                    if (class91.field1281[0] + class271.field3715[0] > class322.field4243[0]) {
                        var10002 = class271.field3715[0]++;
                    }
                } else if (class664.field9396[0] > class664.field9396[1] && class91.field1281[0] + class271.field3715[0] < class322.field4243[2]) {
                    var10002 = class271.field3715[0]--;
                }
            }
        }
        if (!class266.field3658) {
            class616.field8849 = var16;
            class341.field4502 = var17;
        }
        class554.method3246();
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(III)Z")
    public static final boolean method3065(int arg0, int arg1, int arg2) {
        ++field7571;
        if (!(class376.method2184(arg0, arg2, (byte) -126) | ~(arg2 & 65536) != -1) && !class193.method1185(32070, arg0, arg2)) {
            if (arg1 != 22417) {
                method3064(-77, -113, 106, 51, (byte[][][]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, 31, (byte) 21, -46, 21, true, false);
            }
            return (arg0 & 55) == 0 && class541.method3173(arg2, arg0, arg1 + -22362);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(BLun;)Lgaa;")
    public static final class270 method3066(byte arg0, class389 arg1) {
        ++field7573;
        if (arg0 != -30) {
            field7575 = null;
        }
        return new class270(arg1.method2270((byte) 71), arg1.method2270((byte) 71), arg1.method2270((byte) 71), arg1.method2270((byte) 71), arg1.method2258(-3), arg1.method2258(-3), arg1.method2229(255));
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(I)V")
    public static final void method3067(int arg0) {
        ++field7574;
        if (class617.field8851 == null) {
            if (arg0 != 1) {
                method3065(-66, -80, 91);
            }
            int var1 = class181.field2222;
            int var2 = class675.field9684;
            int var3 = -class467.field6533 + class226.field2929 - var1;
            int var4 = -class300.field4038 + class417.field5913 - var2;
            if (~var1 < -1 || ~var3 < -1 || var2 > 0 || var4 > 0) {
                try {
                    Container var5;
                    if (class646.field9189 != null) {
                        var5 = class646.field9189;
                    } else if (class627.field8991 != null) {
                        var5 = class627.field8991;
                    } else {
                        var5 = class66.field1028;
                    }
                    int var6 = 0;
                    int var7 = 0;
                    if (class646.field9189 == var5) {
                        Insets var8 = class646.field9189.getInsets();
                        var6 = var8.left;
                        var7 = var8.top;
                    }
                    Graphics var9 = var5.getGraphics();
                    var9.setColor(Color.black);
                    if (~var1 < -1) {
                        var9.fillRect(var6, var7, var1, class417.field5913);
                    }
                    if (~var2 < -1) {
                        var9.fillRect(var6, var7, class226.field2929, var2);
                    }
                    if (var3 > 0) {
                        var9.fillRect(-var3 + class226.field2929 + var6, var7, var3, class417.field5913);
                    }
                    if (var4 > 0) {
                        var9.fillRect(var6, -var4 + class417.field5913 + var7, class226.field2929, var4);
                        return;
                    }
                } catch (Exception var10) {
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!si", name = "h", descriptor = "(I)V")
    public static void method3068(int arg0) {
        if (arg0 != -1) {
            field7576 = null;
        }
        field7575 = null;
        field7576 = null;
        field7577 = null;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "([BBIIIII)V")
    public static final void method3069(byte[] arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field7572;
        if (arg5 > 0 && !class326.method1894(arg5, 32)) {
            throw new IllegalArgumentException("");
        } else if (~arg3 < -1 && !class326.method1894(arg3, arg1 + 81)) {
            throw new IllegalArgumentException("");
        } else {
            int var7 = class665.method3755(arg1 + 50, arg2);
            int var8 = 0;
            if (arg1 != -49) {
                field7577 = null;
            }
            int var9 = arg5 < arg3 ? arg5 : arg3;
            int var10 = arg5 >> 1;
            int var11 = arg3 >> 1;
            byte[] var12 = arg0;
            byte[] var13 = new byte[var10 * var11 * var7];
            while (true) {
                OpenGL.glTexImage2Dub(arg6, var8, arg4, arg5, arg3, 0, arg2, 5121, var12, 0);
                if (~var9 >= -2) {
                    return;
                }
                int var14 = arg5 * var7;
                for (int var15 = 0; ~var7 < ~var15; ++var15) {
                    int var17 = var15;
                    int var18 = var15;
                    int var19 = var14 + var15;
                    for (int var20 = 0; ~var20 > ~var11; ++var20) {
                        for (int var21 = 0; ~var10 < ~var21; ++var21) {
                            byte var22 = var12[var18];
                            int var23 = var7 + var18;
                            int var24 = var12[var23] + var22;
                            var18 = var7 + var23;
                            int var25 = var12[var19] + var24;
                            int var26 = var7 + var19;
                            int var27 = var12[var26] + var25;
                            var19 = var7 + var26;
                            var13[var17] = (byte) (var27 >> 2);
                            var17 += var7;
                        }
                        var19 += var14;
                        var18 += var14;
                    }
                }
                byte[] var16 = var13;
                var13 = var12;
                arg3 = var11;
                var12 = var16;
                arg5 = var10;
                var11 >>= 1;
                var10 >>= 1;
                var9 >>= 1;
                ++var8;
            }
        }
    }

    @OriginalMember(owner = "client!si", name = "<init>", descriptor = "(Ldda;IZ[[I)V")
    public class518(class349 arg0, int arg1, boolean arg2, int[][] arg3) {
        super(arg0, 34067, class391.field5229, class279.field3793, arg1 * arg1 * 6, arg2);
        super.field9354.method2316((byte) 121, this);
        if (arg2) {
            for (int var5 = 0; var5 < 6; ++var5) {
                this.method3737(arg1, arg1, true, 34069 - -var5, arg3[var5]);
            }
        } else {
            for (int var6 = 0; ~var6 > -7; ++var6) {
                OpenGL.glTexImage2Di(var6 + 34069, 0, this.method3735(-8573), arg1, arg1, 0, class499.method2903(7491, super.field9372), super.field9354.field4666, arg3[var6], 0);
            }
        }
    }
}
