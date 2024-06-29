import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mv")
public abstract class class348 extends class263 {

    @OriginalMember(owner = "client!mv", name = "g", descriptor = "Z")
    public static boolean field4467 = false;

    @OriginalMember(owner = "client!mv", name = "n", descriptor = "[I")
    public static int[] field4474 = new int[] { 0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4 };

    @OriginalMember(owner = "client!mv", name = "h", descriptor = "I")
    public static int field4468;

    @OriginalMember(owner = "client!mv", name = "i", descriptor = "I")
    public int field4469;

    @OriginalMember(owner = "client!mv", name = "j", descriptor = "I")
    public static int field4470;

    @OriginalMember(owner = "client!mv", name = "k", descriptor = "I")
    public static int field4471;

    @OriginalMember(owner = "client!mv", name = "m", descriptor = "I")
    public int field4473;

    @OriginalMember(owner = "client!mv", name = "o", descriptor = "I")
    public static int field4475;

    @OriginalMember(owner = "client!mv", name = "p", descriptor = "I")
    public static int field4476;

    @OriginalMember(owner = "client!mv", name = "q", descriptor = "I")
    public static int field4477;

    @OriginalMember(owner = "client!mv", name = "l", descriptor = "[I")
    public int[] field4472;

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(IIIIBIII)V", line = 8)
    public static final void method2005(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7) {
        field4477++;
        int var8 = 0;
        int var9 = arg1;
        int var10 = 0;
        int var11 = arg3 - arg5;
        int var12 = arg1 - arg5;
        int var13 = arg3 * arg3;
        int var14 = arg1 * arg1;
        int var15 = var11 * var11;
        int var16 = var12 * var12;
        int var17 = var14 << 1;
        int var18 = var13 << 1;
        int var19 = var16 << 1;
        int var20 = var15 << 1;
        int var21 = arg1 << 1;
        if (arg4 < 116) {
            method2008(-117);
        }
        int var22 = var12 << 1;
        int var23 = (1 - var21) * var13 + var17;
        int var24 = var14 - (var21 - 1) * var18;
        int var25 = (1 - var22) * var15 + var19;
        int var26 = var16 - ((var22 - 1) * var20);
        int var27 = var13 << 2;
        int var28 = var14 << 2;
        int var29 = var15 << 2;
        int var30 = var16 << 2;
        int var31 = var17 * 3;
        int var32 = (var21 - 3) * var18;
        int var33 = var19 * 3;
        int var34 = (var22 - 3) * var20;
        int var35 = var28;
        int var36 = (arg1 - 1) * var27;
        int var37 = var30;
        int var38 = (var12 - 1) * var29;
        if (arg6 >= class125.field1524 && arg6 <= class377.field4848) {
            int[] var39 = class30.field364[arg6];
            int var40 = class654.method3659(-7690, arg2 - arg3, class337.field4186, class292.field3700);
            int var41 = class654.method3659(-7690, arg2 + arg3, class337.field4186, class292.field3700);
            int var42 = class654.method3659(-7690, arg2 - var11, class337.field4186, class292.field3700);
            int var43 = class654.method3659(-7690, arg2 + var11, class337.field4186, class292.field3700);
            class390.method2223(var40, arg7, var39, (byte) -113, var42);
            class390.method2223(var42, arg0, var39, (byte) -80, var43);
            class390.method2223(var43, arg7, var39, (byte) -107, var41);
        }
        while (var9 > 0) {
            boolean var44 = var12 >= var9;
            if (var44) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var25 += var33;
                        var26 += var37;
                        var33 += var30;
                        var10++;
                        var37 += var30;
                    }
                }
                if (var26 < 0) {
                    var26 += var37;
                    var25 += var33;
                    var10++;
                    var33 += var30;
                    var37 += var30;
                }
                var25 += -var38;
                var26 += -var34;
                var34 -= var29;
                var38 -= var29;
            }
            if (var23 < 0) {
                while (var23 < 0) {
                    var23 += var31;
                    var24 += var35;
                    var31 += var28;
                    var35 += var28;
                    var8++;
                }
            }
            if (var24 < 0) {
                var23 += var31;
                var24 += var35;
                var31 += var28;
                var35 += var28;
                var8++;
            }
            var24 += -var32;
            var23 += -var36;
            var32 -= var27;
            var36 -= var27;
            var9--;
            int var45 = arg6 - var9;
            int var46 = arg6 + var9;
            if (var46 >= class125.field1524 && class377.field4848 >= var45) {
                int var47 = class654.method3659(-7690, arg2 + var8, class337.field4186, class292.field3700);
                int var48 = class654.method3659(-7690, arg2 - var8, class337.field4186, class292.field3700);
                if (var44) {
                    int var49 = class654.method3659(-7690, arg2 + var10, class337.field4186, class292.field3700);
                    int var50 = class654.method3659(-7690, arg2 - var10, class337.field4186, class292.field3700);
                    if (var45 >= class125.field1524) {
                        int[] var51 = class30.field364[var45];
                        class390.method2223(var48, arg7, var51, (byte) -125, var50);
                        class390.method2223(var50, arg0, var51, (byte) -101, var49);
                        class390.method2223(var49, arg7, var51, (byte) -74, var47);
                    }
                    if (var46 <= class377.field4848) {
                        int[] var52 = class30.field364[var46];
                        class390.method2223(var48, arg7, var52, (byte) -95, var50);
                        class390.method2223(var50, arg0, var52, (byte) -112, var49);
                        class390.method2223(var49, arg7, var52, (byte) -124, var47);
                    }
                } else {
                    if (var45 >= class125.field1524) {
                        class390.method2223(var48, arg7, class30.field364[var45], (byte) -99, var47);
                    }
                    if (var46 <= class377.field4848) {
                        class390.method2223(var48, arg7, class30.field364[var46], (byte) -93, var47);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(IBI)I", line = 220)
    public static final int method2006(int arg0, byte arg1, int arg2) {
        field4470++;
        if (arg2 == -2) {
            return 12345678;
        } else if (arg2 == -1) {
            if (arg0 < 2) {
                arg0 = 2;
            } else if (arg0 > 126) {
                arg0 = 126;
            }
            return arg0;
        } else if (arg1 > -107) {
            return -104;
        } else {
            int var3 = (arg2 & 0x7F) * arg0 >> 7;
            if (var3 < 2) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            return (arg2 & 0xFF80) + var3;
        }
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(ILfca;Lki;Loa;)V", line = 259)
    public static final void method2007(int arg0, class79 arg1, class663 arg2, class650 arg3) {
        field4471++;
        class468 var4 = arg2.method3693(arg3, 2);
        if (var4 == null) {
            return;
        }
        int var5 = var4.method1556();
        if (var5 < var4.method1544()) {
            var5 = var4.method1544();
        }
        byte var6 = 10;
        int var7 = arg1.field1032;
        int var8 = arg1.field1026;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        if (arg2.field8993 != null) {
            var9 = class595.field7985.method122(null, arg2.field8993, null, (byte) -35, class208.field2474);
            for (int var12 = 0; var12 < var9; var12++) {
                String var13 = class208.field2474[var12];
                if (var12 < (var9 - 1)) {
                    var13 = var13.substring(0, var13.length() - 4);
                }
                int var14 = class26.field313.method272(var13);
                if (var10 < var14) {
                    var10 = var14;
                }
            }
            var11 = var9 * class26.field313.method268() + (class26.field313.method271() / 2);
        }
        int var15 = var5 / 2 + arg1.field1032;
        if (class604.field8130 + var5 > var7) {
            var7 = class604.field8130;
            var15 = var10 / 2 + var5 / 2 + class604.field8130 + var6 + 5;
        } else if (var7 > (class604.field8132 - var5)) {
            var15 = class604.field8132 - (var5 / 2) - var6 - (var10 / 2) - 5;
            var7 = class604.field8132 - var5;
        }
        int var16 = arg1.field1026;
        if (var8 < (class604.field8126 + var5)) {
            var8 = class604.field8126;
            var16 = class604.field8126 + var6 + (var5 / 2);
        } else if ((class604.field8133 - var5) < var8) {
            var8 = class604.field8133 - var5;
            var16 = class604.field8133 - var6 - var11 - (var5 / 2);
        }
        int var17 = (int) ((Math.atan2((double) (var7 - arg1.field1032), (double) (var8 - arg1.field1026)) / 3.141592653589793D) * 32767.0D) & 0xFFFF;
        var4.method2555((float) var5 / 2.0F + (float) var7, (float) var5 / 2.0F + (float) var8, 4096, var17);
        int var18 = -2;
        int var19 = -2;
        int var20 = -2;
        int var21 = -2;
        if (arg2.field8993 != null) {
            var18 = var15 - var10 / 2 - 5;
            var19 = var16;
            var20 = var10 + var18 + 10;
            var21 = var16 + (var9 * class26.field313.method268() + 3);
            if (arg2.field9013 != 0) {
                arg3.method3630((byte) -117, var20 - var18, var16, var18, arg2.field9013, var21 - var16);
            }
            if (arg2.field8997 != 0) {
                arg3.method3636(var21 - var16, arg2.field8997, var18, var16, var20 - var18, (byte) -119);
            }
            for (int var22 = 0; var22 < var9; var22++) {
                String var23 = class208.field2474[var22];
                if (var22 < (var9 - 1)) {
                    var23 = var23.substring(0, var23.length() - 4);
                }
                class26.field313.method269(arg3, var23, var15, var16, arg2.field8999, true);
                var16 += class26.field313.method268();
            }
        }
        if (arg2.field8978 != -1 || arg2.field8993 != null) {
            int var24 = var5 >> 1;
            class549 var25 = new class549(arg1);
            var25.field6893 = var7 - var24;
            var25.field6888 = var8 + var24;
            var25.field6891 = var7 + var24;
            var25.field6882 = var8 - var24;
            var25.field6887 = var21;
            var25.field6894 = var18;
            var25.field6885 = var20;
            var25.field6892 = var19;
            class74.field986.method1904(var25, -108);
        }
        if (arg0 < 19) {
            method2006(57, (byte) 37, 72);
        }
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(I)V", line = 418)
    public static void method2008(int arg0) {
        int var1 = -40 / ((-arg0 - 32) / 55);
        field4474 = null;
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(IB)V", line = 427)
    public static final void method2009(int arg0, byte arg1) {
        field4468++;
        if (arg1 <= 37) {
            method2006(-103, (byte) -55, 61);
        }
        class243 var2 = class546.method2926(arg0, 11, true);
        var2.method1455(true);
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(Ljava/awt/Canvas;B)V")
    public abstract void method796(Canvas arg0, byte arg1);

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(IILjava/awt/Graphics;III)V")
    public abstract void method795(int arg0, int arg1, Graphics arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(ILjava/awt/Graphics;BI)V")
    public abstract void method797(int arg0, Graphics arg1, byte arg2, int arg3);
}
