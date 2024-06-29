import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public class class421 extends class372 {

    @OriginalMember(owner = "client!th", name = "k", descriptor = "I")
    private int field5763;

    @OriginalMember(owner = "client!th", name = "f", descriptor = "Lbo;")
    private class511 field5758;

    @OriginalMember(owner = "client!th", name = "h", descriptor = "I")
    private int field5760;

    @OriginalMember(owner = "client!th", name = "r", descriptor = "I")
    private int field5770;

    @OriginalMember(owner = "client!th", name = "l", descriptor = "I")
    private int field5764;

    @OriginalMember(owner = "client!th", name = "w", descriptor = "I")
    private int field5775;

    @OriginalMember(owner = "client!th", name = "u", descriptor = "I")
    private int field5773;

    @OriginalMember(owner = "client!th", name = "g", descriptor = "[I")
    public static int[] field5759 = new int[13];

    @OriginalMember(owner = "client!th", name = "o", descriptor = "[I")
    public static int[] field5767 = new int[256];

    @OriginalMember(owner = "client!th", name = "n", descriptor = "I")
    public static int field5766 = 0;

    @OriginalMember(owner = "client!th", name = "t", descriptor = "Lvj;")
    public static class304 field5772 = new class304("Please wait...", "Bitte warte...", "Veuillez patienter...", "Aguarde...");

    @OriginalMember(owner = "client!th", name = "i", descriptor = "I")
    public static int field5761;

    @OriginalMember(owner = "client!th", name = "j", descriptor = "I")
    public static int field5762;

    @OriginalMember(owner = "client!th", name = "m", descriptor = "I")
    public static int field5765;

    @OriginalMember(owner = "client!th", name = "p", descriptor = "I")
    public static int field5768;

    @OriginalMember(owner = "client!th", name = "q", descriptor = "I")
    public static int field5769;

    @OriginalMember(owner = "client!th", name = "v", descriptor = "I")
    public static int field5774;

    @OriginalMember(owner = "client!th", name = "s", descriptor = "Lef;")
    private class336 field5771;

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(B)Lef;", line = 4)
    public final class336 method1904(byte arg0) {
        field5761++;
        if (this.field5771 == null) {
            class229.field3093[2] = this.field5773;
            class229.field3093[3] = this.field5775;
            class229.field3093[0] = this.field5770;
            class229.field3093[1] = this.field5760;
            class229.field3093[4] = this.field5763;
            class126 var2 = this.field5758.field2375;
            class229.field3093[5] = this.field5764;
            boolean var3 = false;
            int var4 = 0;
            for (int var5 = 0; var5 < 6; var5++) {
                if (!var2.method680(-16576, class229.field3093[var5])) {
                    return null;
                }
                class278 var7 = var2.method677(2459, class229.field3093[var5]);
                int var8 = var7.field3632 ? 64 : 128;
                if (var7.field3650 > 0) {
                    var3 = true;
                }
                if (var8 > var4) {
                    var4 = var8;
                }
            }
            for (int var6 = 0; var6 < 6; var6++) {
                class473.field6505[var6] = var2.method678(1.0F, class229.field3093[var6], 24201, false, var4, var4);
            }
            this.field5771 = new class336(this.field5758, 6407, var4, var3, class473.field6505);
        }
        if (arg0 != -34) {
            method2425(null, 124, null, 119, -42);
        }
        return this.field5771;
    }

    @OriginalMember(owner = "client!th", name = "b", descriptor = "(I)V", line = 65)
    public static void method2423(int arg0) {
        field5759 = null;
        field5772 = null;
        if (arg0 > -121) {
            field5766 = -15;
        }
        field5767 = null;
    }

    @OriginalMember(owner = "client!th", name = "b", descriptor = "(B)[Lra;", line = 79)
    public static final class70[] method2424(byte arg0) {
        field5774++;
        return arg0 == 106 ? new class70[] { class155.field2251, class359.field4846, class203.field2815, class316.field4155, class88.field1338, class526.field7786, class373.field5038, class473.field6545, class406.field5583, class17.field295, class293.field3840, class289.field3781, class403.field5545, class102.field1510 } : null;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(Lql;ILhq;II)V", line = 96)
    public static final void method2425(class515 arg0, int arg1, class108 arg2, int arg3, int arg4) {
        if (arg3 != -1225) {
            method2423(93);
        }
        field5768++;
        byte var5 = -1;
        if ((arg1 & 0x2000) != 0) {
            var5 = arg2.method2197((byte) 120);
        }
        if ((arg1 & 0x20) != 0) {
            arg0.field7611 = arg2.method2245(255);
            if (arg0.field6257 == 0) {
                arg0.method2595(arg0.field7611, false);
                arg0.field7611 = -1;
            }
        }
        if ((arg1 & 0x40) != 0) {
            int var6 = arg2.method2238(arg3 ^ 0xFFFFFBC8);
            byte[] var7 = new byte[var6];
            class379 var8 = new class379(var7);
            arg2.method2201((byte) 115, 0, var6, var7);
            class406.field5589[arg4] = var8;
            arg0.method3029(arg3 + 1327, var8);
        }
        if ((arg1 & 0x800) != 0) {
            arg0.field6195 = arg2.method2218(124);
            if (arg0.field6195.charAt(0) == '~') {
                arg0.field6195 = arg0.field6195.substring(1);
                class223.method1400(arg0.method3033(true, false), 2, arg0.method3040(false, (byte) 121), arg0.field6195, false, 0);
            } else if (class385.field5232 == arg0) {
                class223.method1400(arg0.method3033(true, false), 2, arg0.method3040(false, (byte) 121), arg0.field6195, false, 0);
            }
            arg0.field6245 = 150;
            arg0.field6206 = 0;
            arg0.field6176 = 0;
        }
        if ((arg1 & 0x80) != 0) {
            int var9 = arg2.method2199((byte) 50);
            int var10 = arg2.method2217((byte) 106);
            arg0.method2588(4, var9, class31.field516, var10);
            arg0.field6165 = class31.field516 + 300;
            arg0.field6241 = arg2.method2217((byte) 114);
        }
        if ((arg1 & 0x10) != 0) {
            class150.field2133[arg4] = arg2.method2194(-1);
        }
        if ((arg1 & 0x40000) != 0) {
            int var11 = arg2.method2207(arg3 + 1265);
            if (var11 == 65535) {
                var11 = -1;
            }
            int var12 = arg2.method2248((byte) -94);
            int var13 = arg2.method2238(255);
            arg0.method2598((byte) -23, true, var11, var12, var13);
        }
        if ((arg1 & 0x4) != 0) {
            int var14 = arg2.method2207(arg3 ^ 0xFFFFFB21);
            int var15 = arg2.method2238(255);
            int var16 = arg2.method2217((byte) 111);
            int var17 = arg2.field5173;
            boolean var18 = (var14 & 0x8000) != 0;
            if (arg0.field7638 != null && arg0.field7627 != null) {
                boolean var19 = false;
                if (var15 <= 1) {
                    if (!var18 && !(!class16.field282 || class513.field7557) || class362.field4900) {
                        var19 = true;
                    } else if (class386.method2284(arg0.field7638, arg3 + 1343)) {
                        var19 = true;
                    }
                }
                if (!var19 && class50.field772 == 0) {
                    class12.field246.field5173 = 0;
                    arg2.method2195(class12.field246.field5152, 0, (byte) -126, var16);
                    class12.field246.field5173 = 0;
                    int var20 = -1;
                    String var22;
                    if (var18) {
                        var14 &= 0x7FFF;
                        class445 var21 = class17.method168((byte) -89, class12.field246);
                        var20 = var21.field6096;
                        var22 = var21.field6093.method1170(class12.field246, true);
                    } else {
                        var22 = class517.method3046(class29.method238((byte) 56, class12.field246), (byte) 22);
                    }
                    arg0.field6195 = var22.trim();
                    arg0.field6245 = 150;
                    arg0.field6206 = var14 & 0xFF;
                    arg0.field6176 = var14 >> 8;
                    int var23;
                    if (var15 == 1 || var15 == 2) {
                        var23 = var18 ? 17 : 1;
                    } else {
                        var23 = var18 ? 17 : 2;
                    }
                    if (var15 == 2) {
                        class413.method2394(-4694, var22, "<img=1>" + arg0.method3040(false, (byte) 121), "<img=1>" + arg0.method3033(true, false), var20, 0, null, var23);
                    } else if (var15 == 1) {
                        class413.method2394(-4694, var22, "<img=0>" + arg0.method3040(false, (byte) 121), "<img=0>" + arg0.method3033(true, false), var20, 0, null, var23);
                    } else {
                        class413.method2394(arg3 - 3469, var22, arg0.method3040(false, (byte) 121), arg0.method3033(true, false), var20, 0, null, var23);
                    }
                }
            }
            arg2.field5173 = var16 + var17;
        }
        if ((arg1 & 0x200) != 0) {
            arg0.field6221 = arg2.method2194(-1);
            arg0.field6223 = arg2.method2213(true);
            arg0.field6168 = arg2.method2231((byte) 85);
            arg0.field6249 = arg2.method2194(-1);
            arg0.field6179 = arg2.method2233((byte) -117) + class31.field516;
            arg0.field6171 = arg2.method2207(36) + class31.field516;
            arg0.field6225 = arg2.method2238(255);
            if (arg0.field7610) {
                arg0.field6249 += arg0.field7635;
                arg0.field6168 += arg0.field7615;
                arg0.field6221 += arg0.field7615;
                arg0.field6257 = 0;
                arg0.field6223 += arg0.field7635;
            } else {
                arg0.field6221 += arg0.field6261[0];
                arg0.field6257 = 1;
                arg0.field6168 += arg0.field6261[0];
                arg0.field6223 += arg0.field6266[0];
                arg0.field6249 += arg0.field6266[0];
            }
            arg0.field6259 = 0;
        }
        if ((arg1 & 0x2) != 0) {
            int var24 = arg2.method2212((byte) 83);
            if (var24 == 65535) {
                var24 = -1;
            }
            int var25 = arg2.method2240(arg3 + 1480);
            class496.method2848((byte) 2, arg0, var24, var25);
        }
        if ((arg1 & 0x1) != 0) {
            int var26 = arg2.method2233((byte) -124);
            if (var26 == 65535) {
                var26 = -1;
            }
            arg0.field6202 = var26;
        }
        if ((arg1 & 0x4000) != 0) {
            int var27 = arg2.method2245(255);
            int var28 = arg2.method2232((byte) 126);
            if (var27 == 65535) {
                var27 = -1;
            }
            int var29 = arg2.method2240(255);
            arg0.method2598((byte) -23, false, var27, var28, var29);
        }
        if ((arg1 & 0x8000) != 0) {
            arg0.field7639 = arg2.method2217((byte) 118) == 1;
        }
        if ((arg1 & 0x100) != 0) {
            int var30 = class31.field516;
            int var31 = arg2.method2199((byte) 67);
            int var32 = arg2.method2222(arg3 ^ 0x4B7);
            arg0.method2588(arg3 + 1229, var31, var30, var32);
        }
        if ((arg1 & 0x400) != 0) {
            int var33 = arg2.method2233((byte) -111);
            arg0.field6227 = arg2.method2240(arg3 ^ 0xFFFFFBC8);
            arg0.field6247 = arg2.method2240(255);
            arg0.field6243 = (var33 & 0x8000) != 0;
            arg0.field6210 = var33 & 0x7FFF;
            arg0.field6191 = class31.field516 - (-arg0.field6210 - arg0.field6227);
        }
        if ((arg1 & 0x20000) != 0) {
            arg0.field6162 = arg2.method2197((byte) 120);
            arg0.field6178 = arg2.method2194(-1);
            arg0.field6196 = arg2.method2231((byte) 85);
            arg0.field6193 = (byte) arg2.method2222(-127);
            arg0.field6220 = class31.field516 + arg2.method2212((byte) 83);
            arg0.field6184 = class31.field516 + arg2.method2233((byte) -115);
        }
        if ((arg1 & 0x10000) != 0) {
            int var34 = arg2.method2238(255);
            int[] var35 = new int[var34];
            int[] var36 = new int[var34];
            int[] var37 = new int[var34];
            for (int var38 = 0; var38 < var34; var38++) {
                int var39 = arg2.method2207(-105);
                if (var39 == 65535) {
                    var39 = -1;
                }
                var35[var38] = var39;
                var36[var38] = arg2.method2222(-127);
                var37[var38] = arg2.method2245(255);
            }
            class385.method2281(var37, arg0, var36, false, var35);
        }
        if (!arg0.field7610) {
            return;
        }
        if (var5 == 127) {
            arg0.method3036((byte) -123, arg0.field7635, arg0.field7615);
            return;
        }
        byte var40;
        if (var5 == -1) {
            var40 = class150.field2133[arg4];
        } else {
            var40 = var5;
        }
        arg0.method3031(var40, (byte) 0, arg0.field7615, arg0.field7635);
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(III)Z", line = 448)
    public static final boolean method2426(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class40.field607; var3++) {
            class435 var4 = class508.field7059[var3];
            if (var4.field5958 == 1) {
                int var5 = var4.field5975 - arg0;
                if (var5 > 0) {
                    int var6 = (var4.field5962 * var5 >> 8) + var4.field5968;
                    int var7 = (var4.field5966 * var5 >> 8) + var4.field5981;
                    int var8 = (var4.field5961 * var5 >> 8) + var4.field5970;
                    int var9 = (var4.field5974 * var5 >> 8) + var4.field5979;
                    if (arg2 >= var6 && arg2 <= var7 && arg1 >= var8 && arg1 <= var9) {
                        return true;
                    }
                }
            } else if (var4.field5958 == 2) {
                int var10 = arg0 - var4.field5975;
                if (var10 > 0) {
                    int var11 = (var4.field5962 * var10 >> 8) + var4.field5968;
                    int var12 = (var4.field5966 * var10 >> 8) + var4.field5981;
                    int var13 = (var4.field5961 * var10 >> 8) + var4.field5970;
                    int var14 = (var4.field5974 * var10 >> 8) + var4.field5979;
                    if (arg2 >= var11 && arg2 <= var12 && arg1 >= var13 && arg1 <= var14) {
                        return true;
                    }
                }
            } else if (var4.field5958 == 3) {
                int var15 = var4.field5968 - arg2;
                if (var15 > 0) {
                    int var16 = (var4.field5972 * var15 >> 8) + var4.field5975;
                    int var17 = (var4.field5965 * var15 >> 8) + var4.field5967;
                    int var18 = (var4.field5961 * var15 >> 8) + var4.field5970;
                    int var19 = (var4.field5974 * var15 >> 8) + var4.field5979;
                    if (arg0 >= var16 && arg0 <= var17 && arg1 >= var18 && arg1 <= var19) {
                        return true;
                    }
                }
            } else if (var4.field5958 == 4) {
                int var20 = arg2 - var4.field5968;
                if (var20 > 0) {
                    int var21 = (var4.field5972 * var20 >> 8) + var4.field5975;
                    int var22 = (var4.field5965 * var20 >> 8) + var4.field5967;
                    int var23 = (var4.field5961 * var20 >> 8) + var4.field5970;
                    int var24 = (var4.field5974 * var20 >> 8) + var4.field5979;
                    if (arg0 >= var21 && arg0 <= var22 && arg1 >= var23 && arg1 <= var24) {
                        return true;
                    }
                }
            } else if (var4.field5958 == 5) {
                int var25 = arg1 - var4.field5970;
                if (var25 > 0) {
                    int var26 = (var4.field5972 * var25 >> 8) + var4.field5975;
                    int var27 = (var4.field5965 * var25 >> 8) + var4.field5967;
                    int var28 = (var4.field5962 * var25 >> 8) + var4.field5968;
                    int var29 = (var4.field5966 * var25 >> 8) + var4.field5981;
                    if (arg0 >= var26 && arg0 <= var27 && arg2 >= var28 && arg2 <= var29) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "([BIIIII)Z", line = 569)
    public static final boolean method2427(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg5 != 13017) {
            field5766 = -7;
        }
        field5765++;
        boolean var6 = true;
        class379 var7 = new class379(arg0);
        int var8 = -1;
        label74: while (true) {
            int var9 = var7.method2196((byte) -47);
            if (var9 == 0) {
                return var6;
            }
            var8 += var9;
            int var10 = 0;
            boolean var11 = false;
            while (true) {
                int var15;
                class1 var18;
                do {
                    int var16;
                    int var17;
                    do {
                        do {
                            do {
                                do {
                                    while (var11) {
                                        int var19 = var7.method2199((byte) 73);
                                        if (var19 == 0) {
                                            continue label74;
                                        }
                                        var7.method2238(255);
                                    }
                                    int var12 = var7.method2199((byte) 110);
                                    if (var12 == 0) {
                                        continue label74;
                                    }
                                    var10 += var12 - 1;
                                    int var13 = var10 & 0x3F;
                                    int var14 = var10 >> 6 & 0x3F;
                                    var15 = var7.method2238(255) >> 2;
                                    var16 = arg1 + var14;
                                    var17 = arg4 + var13;
                                } while (var16 <= 0);
                            } while (var17 <= 0);
                        } while (var16 >= arg3 - 1);
                    } while (var17 >= (arg2 - 1));
                    var18 = class402.field5388.method1994(-17294, var8);
                } while (var15 == 22 && !class154.field2244.field7764 && var18.field83 == 0 && var18.field84 != 1 && !var18.field69);
                if (!var18.method7(-127)) {
                    var6 = false;
                    class496.field6881++;
                }
                var11 = true;
            }
        }
    }

    @OriginalMember(owner = "client!th", name = "<init>", descriptor = "(Lbo;IIIIII)V", line = 652)
    public class421(class511 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field5763 = arg5;
        this.field5758 = arg0;
        this.field5760 = arg2;
        this.field5770 = arg1;
        this.field5764 = arg6;
        this.field5775 = arg4;
        this.field5773 = arg3;
    }
}
