import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nda")
public class class509 {

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "I")
    public static int field7315;

    @OriginalMember(owner = "client!nda", name = "b", descriptor = "I")
    public static int field7316;

    @OriginalMember(owner = "client!nda", name = "c", descriptor = "I")
    public static int field7317;

    @OriginalMember(owner = "client!nda", name = "e", descriptor = "I")
    public static int field7319;

    @OriginalMember(owner = "client!nda", name = "d", descriptor = "[[S")
    public static short[][] field7318;

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "(I)V")
    public static void method2922(int arg0) {
        if (arg0 > 95) {
            field7318 = null;
        }
    }

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "(ZI)S")
    public static final short method2923(boolean arg0, int arg1) {
        field7316++;
        int var2 = arg1 >> 10 & 0x3F;
        int var3 = (arg1 & 0x385) >> 3;
        int var4 = arg1 & 0x7F;
        int var5 = var4 <= 64 ? var3 * var4 >> 7 : (127 - var4) * var3 >> 7;
        int var6 = var4 + var5;
        if (!arg0) {
            field7318 = null;
        }
        int var7;
        if (var6 == 0) {
            var7 = var5 << 1;
        } else {
            var7 = (var5 << 8) / var6;
        }
        return (short) (var2 << 10 | var7 >> 4 << 7 | var6);
    }

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "(Llt;IILpi;I)V")
    public static final void method2924(class617 arg0, int arg1, int arg2, class455 arg3, int arg4) {
        field7315++;
        if ((arg2 & 0x2) != 0) {
            int var5 = arg0.method2542((byte) 63);
            int var6 = arg0.method2575((byte) -48);
            if (var5 == 65535) {
                var5 = -1;
            }
            int var7 = arg0.method2563(-2263);
            arg3.method1661(var5, var6, 4, false, var7);
        }
        byte var8 = -1;
        if ((arg2 & 0x10) != 0) {
            class60.field626[arg4] = arg0.method2539(75);
        }
        if ((arg2 & 0x10000) != 0) {
            int var9 = class469.field6549;
            int var10 = arg0.method2548(-29696);
            int var11 = arg0.method2553(-209425784);
            arg3.method1665(var11, var10, (byte) 49, var9);
        }
        if ((arg2 & 0x1) != 0) {
            int var12 = arg0.method2532(false);
            if (var12 == 65535) {
                var12 = -1;
            }
            arg3.field3803 = var12;
        }
        if ((arg2 & 0x40) != 0) {
            arg3.field6326 = arg0.method2574(-1758460248);
            if (arg3.field3835 == 0) {
                arg3.method1657(arg3.field6326, arg1 ^ 0xFFFFD664);
                arg3.field6326 = -1;
            }
        }
        if ((arg2 & 0x20000) != 0) {
            arg3.field3794 = arg0.method2555((byte) -26);
            arg3.field3787 = arg0.method2517(32767);
            arg3.field3747 = arg0.method2547(true);
            arg3.field3817 = (byte) arg0.method2563(-2263);
            arg3.field3809 = class469.field6549 + arg0.method2558((byte) -98);
            arg3.field3742 = class469.field6549 + arg0.method2532(false);
        }
        if ((arg2 & 0x80) != 0) {
            int var13 = arg0.method2542((byte) 46);
            if (var13 == 65535) {
                var13 = -1;
            }
            int var14 = arg0.method2541(52);
            class529.method3016(var13, arg3, var14, (byte) -19);
        }
        if ((arg2 & 0x200) != 0) {
            arg3.field6315 = arg0.method2541(33) == 1;
        }
        if ((arg2 & 0x8000) != 0) {
            arg3.field3757 = arg0.method2516(99);
            if (arg3.field3757.charAt(0) == '~') {
                arg3.field3757 = arg3.field3757.substring(1);
                class321.method1809(arg3.method2582(true, 0), 2, (byte) 119, arg3.method2585((byte) -126, false), arg3.field6341, 0, arg3.field3757);
            } else if (class377.field4914 == arg3) {
                class321.method1809(arg3.method2582(true, 0), 2, (byte) 111, arg3.method2585((byte) -52, false), arg3.field6341, 0, arg3.field3757);
            }
            arg3.field3816 = 150;
            arg3.field3755 = 0;
            arg3.field3824 = 0;
        }
        if ((arg2 & 0x100) != 0) {
            int var15 = arg0.method2558((byte) -122);
            if (var15 == 65535) {
                var15 = -1;
            }
            int var16 = arg0.method2560(-1);
            int var17 = arg0.method2563(arg1 ^ 0xFFFFF729);
            arg3.method1661(var15, var16, 4, true, var17);
        }
        if ((arg2 & 0x1000) != 0) {
            int var18 = arg0.method2574(-1758460248);
            arg3.field3788 = arg0.method2553(-209425784);
            arg3.field3756 = arg0.method2541(80);
            arg3.field3799 = var18 & 0x7FFF;
            arg3.field3737 = (var18 & 0x8000) != 0;
            arg3.field3806 = class469.field6549 + arg3.field3799 + arg3.field3788;
        }
        if ((arg2 & 0x4) != 0) {
            int var19 = arg0.method2548(-29696);
            int var20 = arg0.method2541(87);
            arg3.method1665(var20, var19, (byte) 49, class469.field6549);
            arg3.field3762 = class469.field6549 + 300;
            arg3.field3780 = arg0.method2563(-2263);
        }
        if ((arg2 & 0x8) != arg1) {
            int var21 = arg0.method2553(-209425784);
            byte[] var22 = new byte[var21];
            class452 var23 = new class452(var22);
            arg0.method2567(var22, var21, 0, (byte) 117);
            class288.field3709[arg4] = var23;
            arg3.method2583(var23, ~arg1);
        }
        if ((arg2 & 0x4000) != 0) {
            int var24 = arg0.method2529(127);
            int[] var25 = new int[var24];
            int[] var26 = new int[var24];
            int[] var27 = new int[var24];
            for (int var28 = 0; var28 < var24; var28++) {
                int var29 = arg0.method2574(-1758460248);
                if (var29 == 65535) {
                    var29 = -1;
                }
                var25[var28] = var29;
                var26[var28] = arg0.method2541(50);
                var27[var28] = arg0.method2558((byte) -64);
            }
            class628.method3521(var25, var27, var26, -1, arg3);
        }
        if ((arg2 & 0x400) != 0) {
            var8 = arg0.method2555((byte) -26);
        }
        if ((arg2 & 0x2000) != 0) {
            arg3.field3759 = arg0.method2547(true);
            arg3.field3753 = arg0.method2517(32767);
            arg3.field3808 = arg0.method2555((byte) -26);
            arg3.field3827 = arg0.method2547(true);
            arg3.field3783 = arg0.method2558((byte) -56) + class469.field6549;
            arg3.field3826 = arg0.method2542((byte) 57) + class469.field6549;
            arg3.field3829 = arg0.method2529(93);
            arg3.field3840 = 0;
            if (arg3.field6349) {
                arg3.field3759 += arg3.field6348;
                arg3.field3753 += arg3.field6343;
                arg3.field3808 += arg3.field6348;
                arg3.field3827 += arg3.field6343;
                arg3.field3835 = 0;
            } else {
                arg3.field3808 += arg3.field3839[0];
                arg3.field3759 += arg3.field3839[0];
                arg3.field3827 += arg3.field3841[0];
                arg3.field3835 = 1;
                arg3.field3753 += arg3.field3841[0];
            }
        }
        if (!arg3.field6349) {
            return;
        }
        if (var8 == 127) {
            arg3.method2591(arg3.field6343, arg1, arg3.field6348);
            return;
        }
        byte var30;
        if (var8 == -1) {
            var30 = class60.field626[arg4];
        } else {
            var30 = var8;
        }
        arg3.method2590(arg3.field6343, var30, arg3.field6348, (byte) -112);
    }

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "(IF)F")
    public static final float method2925(int arg0, float arg1) {
        field7317++;
        if (arg0 != 6) {
            method2926(-55, true, -87, null, 66, -123);
        }
        return arg1 * arg1 * arg1 * ((arg1 * 6.0F - 15.0F) * arg1 + 10.0F);
    }

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "(IZI[Lep;II)V")
    public static final void method2926(int arg0, boolean arg1, int arg2, class382[] arg3, int arg4, int arg5) {
        int var6 = 0;
        if (arg4 < 104) {
            field7318 = null;
        }
        while (arg3.length > var6) {
            class382 var7 = arg3[var6];
            if (var7 != null && var7.field5108 == arg5) {
                class333.method1876(true, arg0, arg1, arg2, var7);
                class555.method3131((byte) -110, arg0, arg2, var7);
                if (var7.field5008 > (var7.field5064 - var7.field5035)) {
                    var7.field5008 = var7.field5064 - var7.field5035;
                }
                if (var7.field5051 > var7.field4976 - var7.field4958) {
                    var7.field5051 = var7.field4976 - var7.field4958;
                }
                if (var7.field5008 < 0) {
                    var7.field5008 = 0;
                }
                if (var7.field5051 < 0) {
                    var7.field5051 = 0;
                }
                if (var7.field5112 == 0) {
                    class57.method387(127, var7, arg1);
                }
            }
            var6++;
        }
        field7319++;
    }
}
