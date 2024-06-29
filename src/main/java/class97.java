import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nl")
public class class97 extends class84 {

    @OriginalMember(owner = "client!nl", name = "O", descriptor = "I")
    private int field1428 = 204;

    @OriginalMember(owner = "client!nl", name = "Q", descriptor = "I")
    private int field1430 = 1;

    @OriginalMember(owner = "client!nl", name = "U", descriptor = "I")
    private int field1434 = 1;

    @OriginalMember(owner = "client!nl", name = "T", descriptor = "[I")
    public static int[] field1433 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!nl", name = "R", descriptor = "Z")
    public static boolean field1431 = false;

    @OriginalMember(owner = "client!nl", name = "S", descriptor = "I")
    public static int field1432 = -1;

    @OriginalMember(owner = "client!nl", name = "M", descriptor = "I")
    public static int field1426;

    @OriginalMember(owner = "client!nl", name = "N", descriptor = "I")
    public static int field1427;

    @OriginalMember(owner = "client!nl", name = "P", descriptor = "I")
    public static int field1429;

    @OriginalMember(owner = "client!nl", name = "V", descriptor = "I")
    public static int field1435;

    @OriginalMember(owner = "client!nl", name = "W", descriptor = "I")
    public static int field1436;

    @OriginalMember(owner = "client!nl", name = "X", descriptor = "I")
    public static int field1437;

    @OriginalMember(owner = "client!nl", name = "Y", descriptor = "I")
    public static int field1438;

    @OriginalMember(owner = "client!nl", name = "Z", descriptor = "I")
    public static int field1439;

    @OriginalMember(owner = "client!nl", name = "i", descriptor = "(I)V")
    public static final void method747(int arg0) {
        ++field1439;
        if (arg0 < 121) {
            method753(-94);
        }
        class21.field232.method1558(-62);
        class289.field4583.method1558(-16);
        class268.field4331.method1558(-93);
        class119.field1719.method1558(-89);
    }

    @OriginalMember(owner = "client!nl", name = "j", descriptor = "(I)V")
    public static void method748(int arg0) {
        field1433 = null;
        if (arg0 != -15838) {
            field1432 = 22;
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(ILjava/lang/String;Lv;)I")
    public static final int method749(int arg0, String arg1, class152 arg2) {
        int var3 = arg2.field2511;
        ++field1438;
        byte[] var4 = class296.method1994(arg1, false);
        arg2.method1081(var4.length, -125);
        arg2.field2511 += class132.field2181.method572(var4, arg0, var4.length, arg2.field2523, arg2.field2511, arg0 + 8);
        return -var3 + arg2.field2511;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(IIIIIILwg;IJ)Z")
    public static final boolean method750(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class178 arg6, int arg7, long arg8) {
        if (arg6 == null) {
            return true;
        } else {
            int var10 = arg1 * 128 + arg4 * 64;
            int var11 = arg2 * 128 + arg5 * 64;
            return class216.method1549(arg0, arg1, arg2, arg4, arg5, var10, var11, arg3, arg6, arg7, false, arg8);
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;B)Ljava/lang/String;")
    public static final String method751(String arg0, String arg1, String arg2, byte arg3) {
        ++field1426;
        for (int var4 = arg1.indexOf(arg0); var4 != -1; var4 = arg1.indexOf(arg0, arg2.length() + var4)) {
            arg1 = arg1.substring(0, var4) + arg2 + arg1.substring(var4 - -arg0.length());
        }
        return arg3 != -61 ? null : arg1;
    }

    @OriginalMember(owner = "client!nl", name = "<init>", descriptor = "()V")
    public class97() {
        super(0, true);
    }

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "(B)V")
    public static final void method752(byte arg0) {
        ++field1429;
        while (class190.field3068 >= 2048.0F) {
            class190.field3068 -= 2048.0F;
        }
        while (class190.field3068 < 0.0F) {
            class190.field3068 += 2048.0F;
        }
        int var1 = class25.field290 >> 7;
        int var2 = class210.field3370 >> 7;
        if (class123.field1799 < 128.0F) {
            class123.field1799 = 128.0F;
        }
        if (class123.field1799 > 383.0F) {
            class123.field1799 = 383.0F;
        }
        int var3 = class129.method930(class25.field290, class210.field3370, 127, class58.field826);
        int var4 = 91 % ((arg0 - 38) / 43);
        int var5 = 0;
        if (var2 > 3 && var1 > 3 && var2 < 100 && var1 < 100) {
            for (int var6 = var2 + -4; ~var6 >= ~(var2 + 4); ++var6) {
                for (int var7 = var1 - 4; ~var7 >= ~(var1 + 4); ++var7) {
                    int var8 = class58.field826;
                    if (var8 < 3 && ~(class86.field1277[1][var6][var7] & 2) == -3) {
                        ++var8;
                    }
                    int var9 = -class220.field3533[var8][var6][var7] + var3 - -((255 & class117.field1676[var8][var6][var7]) * 8);
                    if (var9 > var5) {
                        var5 = var9;
                    }
                }
            }
        }
        int var10 = var5 * 192;
        if (~var10 < -98049) {
            var10 = 98048;
        }
        if (~var10 > -32769) {
            var10 = 32768;
        }
        if (~var10 < ~class177.field2866) {
            class177.field2866 += (-class177.field2866 + var10) / 24;
        } else if (~var10 > ~class177.field2866) {
            class177.field2866 += (var10 - class177.field2866) / 80;
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(BI)[I")
    public final int[] method91(byte arg0, int arg1) {
        ++field1436;
        int[] var3 = super.field1228.method1627(-1, arg1);
        if (arg0 >= -125) {
            this.field1428 = -95;
        }
        if (super.field1228.field3651) {
            for (int var4 = 0; ~var4 > ~class20.field221; ++var4) {
                int var5 = class184.field2967[var4];
                int var6 = this.field1434 * var5 >> 12;
                int var7 = class26.field301[arg1];
                int var8 = this.field1430 * var7 >> 12;
                int var9 = var5 % (4096 / this.field1434) * this.field1434;
                int var10 = var7 % (4096 / this.field1430) * this.field1430;
                if (var10 < this.field1428) {
                    for (var6 -= var8; ~var6 > -1; var6 += 4) {
                    }
                    while (var6 > 3) {
                        var6 -= 4;
                    }
                    if (~var6 != -2) {
                        var3[var4] = 0;
                        continue;
                    }
                    if (this.field1428 > var9) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                if (var9 < this.field1428) {
                    int var11;
                    for (var11 = var6 - var8; var11 < 0; var11 += 4) {
                    }
                    while (~var11 < -4) {
                        var11 -= 4;
                    }
                    if (~var11 < -1) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                var3[var4] = 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(Lv;BI)V")
    public final void method31(class152 arg0, byte arg1, int arg2) {
        if (arg1 <= 87) {
            method747(127);
        }
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (arg2 == 2) {
                    this.field1428 = arg0.method1126(false);
                }
            } else {
                this.field1430 = arg0.method1111(255);
            }
        } else {
            this.field1434 = arg0.method1111(255);
        }
        ++field1435;
    }

    @OriginalMember(owner = "client!nl", name = "k", descriptor = "(I)V")
    public static final void method753(int arg0) {
        ++field1437;
        class138 var1 = (class138) class143.field2309.method1384(arg0 ^ -3832);
        if (arg0 != -3830) {
            field1433 = null;
        }
        while (var1 != null) {
            class2 var2 = var1.field2236;
            if (class58.field826 == var2.field12 && !var2.field10) {
                if (~var2.field26 >= ~class264.field4290) {
                    var2.method10((byte) 48, class161.field2628);
                    if (!var2.field10) {
                        class254.method1798(var2.field12, var2.field23, var2.field27, var2.field14, 60, var2, 0, -1L, false);
                    } else {
                        var1.method1922(-1);
                    }
                }
            } else {
                var1.method1922(-1);
            }
            var1 = (class138) class143.field2309.method1388((byte) 125);
        }
    }
}
