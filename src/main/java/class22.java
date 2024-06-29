import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qo")
public class class22 extends class184 {

    @OriginalMember(owner = "client!qo", name = "m", descriptor = "J")
    public long field228;

    @OriginalMember(owner = "client!qo", name = "n", descriptor = "I")
    public static int field229;

    @OriginalMember(owner = "client!qo", name = "o", descriptor = "I")
    public static int field230;

    @OriginalMember(owner = "client!qo", name = "p", descriptor = "I")
    public static int field231;

    @OriginalMember(owner = "client!qo", name = "q", descriptor = "I")
    public static int field232;

    @OriginalMember(owner = "client!qo", name = "r", descriptor = "I")
    public static int field233;

    @OriginalMember(owner = "client!qo", name = "s", descriptor = "I")
    public static int field234;

    @OriginalMember(owner = "client!qo", name = "u", descriptor = "I")
    public static int field236;

    @OriginalMember(owner = "client!qo", name = "v", descriptor = "I")
    public static int field237;

    @OriginalMember(owner = "client!qo", name = "t", descriptor = "[I")
    public static int[] field235;

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(ILd;IILjava/awt/Canvas;)Lha;")
    public static final class60 method113(int arg0, class151 arg1, int arg2, int arg3, Canvas arg4) {
        int var5 = 61 / ((-arg3 - 20) / 59);
        field229++;
        return new class696(arg4, arg1, arg0, arg2);
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(Lsca;II)Ljava/lang/String;")
    public static final String method114(class46 arg0, int arg1, int arg2) {
        field230++;
        if (!client.method1886(arg0).method1556(arg1, arg2 + 119) && arg0.field608 == null) {
            return null;
        }
        if (arg2 != -1) {
            method120(-88, -27, (byte) 75);
        }
        if (arg0.field611 == null || arg0.field611.length <= arg1 || arg0.field611[arg1] == null || arg0.field611[arg1].trim().length() == 0) {
            return class501.field7119 ? "Hidden-" + arg1 : null;
        } else {
            return arg0.field611[arg1];
        }
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(IIIIIIII)V")
    private static final void method115(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field233++;
        int var8 = 0;
        int var9 = arg3;
        int var10 = 0;
        int var11 = arg4 - arg2;
        int var12 = arg3 - arg2;
        int var13 = arg4 * arg4;
        int var14 = arg3 * arg3;
        int var15 = var11 * var11;
        int var16 = var12 * var12;
        int var17 = var14 << 1;
        int var18 = var13 << 1;
        int var19 = var16 << 1;
        int var20 = var15 << 1;
        int var21 = arg3 << 1;
        int var22 = var12 << 1;
        int var23 = (1 - var21) * var13 + var17;
        int var24 = var14 - (var21 - 1) * var18;
        int var25 = (1 - var22) * var15 + var19;
        int var26 = var16 - ((arg6 + var22) * var20);
        int var27 = var13 << 2;
        int var28 = var14 << 2;
        int var29 = var15 << 2;
        int var30 = var16 << 2;
        int var31 = var17 * 3;
        int var32 = (var21 - 3) * var18;
        int var33 = var19 * 3;
        int var34 = (var22 - 3) * var20;
        int var35 = var28;
        int var36 = (arg3 - 1) * var27;
        int var37 = var30;
        if (arg7 >= class166.field2622 && arg7 <= class432.field6446) {
            int[] var38 = class664.field9322[arg7];
            int var39 = class462.method2818(class391.field5895, class497.field7073, arg1 - arg4, arg6 ^ 0xFFFFDF4A);
            int var40 = class462.method2818(class391.field5895, class497.field7073, arg1 + arg4, arg6 ^ 0xFFFFDF4A);
            int var41 = class462.method2818(class391.field5895, class497.field7073, arg1 - var11, 8373);
            int var42 = class462.method2818(class391.field5895, class497.field7073, arg1 + var11, 8373);
            class238.method1577(arg0, var38, var41, var39, (byte) 121);
            class238.method1577(arg5, var38, var42, var41, (byte) -31);
            class238.method1577(arg0, var38, var40, var42, (byte) 14);
        }
        int var43 = (var12 - 1) * var29;
        while (var9 > 0) {
            boolean var44 = var9 <= var12;
            if (var44) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var26 += var37;
                        var25 += var33;
                        var33 += var30;
                        var37 += var30;
                        var10++;
                    }
                }
                if (var26 < 0) {
                    var26 += var37;
                    var25 += var33;
                    var37 += var30;
                    var10++;
                    var33 += var30;
                }
                var25 += -var43;
                var26 += -var34;
                var43 -= var29;
                var34 -= var29;
            }
            if (var23 < 0) {
                while (var23 < 0) {
                    var24 += var35;
                    var23 += var31;
                    var31 += var28;
                    var35 += var28;
                    var8++;
                }
            }
            if (var24 < 0) {
                var23 += var31;
                var24 += var35;
                var8++;
                var31 += var28;
                var35 += var28;
            }
            var23 += -var36;
            var24 += -var32;
            var9--;
            var32 -= var27;
            var36 -= var27;
            int var45 = arg7 - var9;
            int var46 = arg7 + var9;
            if (class166.field2622 <= var46 && var45 <= class432.field6446) {
                int var47 = class462.method2818(class391.field5895, class497.field7073, arg1 + var8, 8373);
                int var48 = class462.method2818(class391.field5895, class497.field7073, arg1 - var8, 8373);
                if (var44) {
                    int var49 = class462.method2818(class391.field5895, class497.field7073, arg1 + var10, 8373);
                    int var50 = class462.method2818(class391.field5895, class497.field7073, arg1 - var10, 8373);
                    if (var45 >= class166.field2622) {
                        int[] var51 = class664.field9322[var45];
                        class238.method1577(arg0, var51, var50, var48, (byte) 122);
                        class238.method1577(arg5, var51, var49, var50, (byte) -84);
                        class238.method1577(arg0, var51, var47, var49, (byte) 124);
                    }
                    if (var46 <= class432.field6446) {
                        int[] var52 = class664.field9322[var46];
                        class238.method1577(arg0, var52, var50, var48, (byte) -28);
                        class238.method1577(arg5, var52, var49, var50, (byte) -127);
                        class238.method1577(arg0, var52, var47, var49, (byte) 120);
                    }
                } else {
                    if (class166.field2622 <= var45) {
                        class238.method1577(arg0, class664.field9322[var45], var47, var48, (byte) -55);
                    }
                    if (var46 <= class432.field6446) {
                        class238.method1577(arg0, class664.field9322[var46], var47, var48, (byte) 122);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qo", name = "<init>", descriptor = "()V")
    public class22() {
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(IIBIIIII)V")
    public static final void method116(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg2 > -85) {
            return;
        }
        field236++;
        if (arg3 == arg6) {
            class454.method2780(arg0, arg4, false, arg6, arg7, arg1, arg5);
        } else if (class497.field7073 <= arg1 - arg6 && arg1 + arg6 <= class391.field5895 && class166.field2622 <= (arg0 - arg3) && class432.field6446 >= arg0 + arg3) {
            class224.method1515(arg6, arg5, arg1, (byte) 116, arg0, arg3, arg4, arg7);
        } else {
            method115(arg7, arg1, arg5, arg3, arg6, arg4, -1, arg0);
        }
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(B)V")
    public static void method117(byte arg0) {
        int var1 = -63 / ((arg0 - 63) / 60);
        field235 = null;
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(BII)V")
    public static final void method118(byte arg0, int arg1, int arg2) {
        if (class152.field2350 != 0) {
            if (arg2 < 0) {
                for (int var3 = 0; var3 < 16; var3++) {
                    class30.field306[var3] = arg1;
                }
            } else {
                class30.field306[arg2] = arg1;
            }
        }
        field237++;
        if (arg0 >= 73) {
            class520.field7449.method2124(arg2, arg1, 20983);
        }
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(IB)V")
    public static final void method119(int arg0, byte arg1) {
        field232++;
        class150 var2 = class676.method3885(1000, 12, arg0);
        var2.method1115(true);
        int var3 = -96 / ((-arg1 - 34) / 45);
    }

    @OriginalMember(owner = "client!qo", name = "<init>", descriptor = "(J)V")
    public class22(long arg0) {
        this.field228 = arg0;
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(IIB)I")
    public static final int method120(int arg0, int arg1, byte arg2) {
        int var3 = (arg0 & 0x7F) * arg1 >> 7;
        field231++;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return arg2 >= -123 ? 109 : (arg0 & 0xFF80) + var3;
    }
}
