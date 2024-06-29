import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public class class143 extends class46 {

    @OriginalMember(owner = "client!cj", name = "w", descriptor = "I")
    public int field2224;

    @OriginalMember(owner = "client!cj", name = "r", descriptor = "I")
    public int field2219;

    @OriginalMember(owner = "client!cj", name = "u", descriptor = "I")
    public static int field2222 = -1;

    @OriginalMember(owner = "client!cj", name = "x", descriptor = "Lba;")
    public static class53 field2225 = new class53(64);

    @OriginalMember(owner = "client!cj", name = "y", descriptor = "F")
    public static float field2226;

    @OriginalMember(owner = "client!cj", name = "o", descriptor = "I")
    public static int field2216;

    @OriginalMember(owner = "client!cj", name = "p", descriptor = "I")
    public static int field2217;

    @OriginalMember(owner = "client!cj", name = "q", descriptor = "I")
    public static int field2218;

    @OriginalMember(owner = "client!cj", name = "t", descriptor = "I")
    public static int field2221;

    @OriginalMember(owner = "client!cj", name = "v", descriptor = "I")
    public static int field2223;

    @OriginalMember(owner = "client!cj", name = "s", descriptor = "[[[B")
    public static byte[][][] field2220;

    @OriginalMember(owner = "client!cj", name = "d", descriptor = "(I)I", line = 5)
    public static final int method1015(int arg0) {
        if (arg0 < 117) {
            return -16;
        } else {
            field2218++;
            return class333.field5200;
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(IIIIIIII)V", line = 16)
    public static final void method1016(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg7 >= 0 && arg2 >= 0 && arg7 < 103 && arg2 < 103) {
            if (arg1 == 0) {
                class103 var8 = class48.method416(arg5, arg7, arg2);
                if (var8 != null) {
                    int var9 = (int) (var8.field1602 >>> 32) & Integer.MAX_VALUE;
                    if (arg6 == 2) {
                        var8.field1598 = new class233(var9, 2, arg3 + 4, arg5, arg7, arg2, arg4, false, var8.field1598);
                        var8.field1600 = new class233(var9, 2, arg3 + 1 & 0x3, arg5, arg7, arg2, arg4, false, var8.field1600);
                    } else {
                        var8.field1598 = new class233(var9, arg6, arg3, arg5, arg7, arg2, arg4, false, var8.field1598);
                    }
                }
            }
            if (arg1 == 1) {
                class228 var10 = class327.method2220(arg5, arg7, arg2);
                if (var10 != null) {
                    int var11 = (int) (var10.field3631 >>> 32) & Integer.MAX_VALUE;
                    if (arg6 == 4 || arg6 == 5) {
                        var10.field3623 = new class233(var11, 4, arg3, arg5, arg7, arg2, arg4, false, var10.field3623);
                    } else if (arg6 == 6) {
                        var10.field3623 = new class233(var11, 4, arg3 + 4, arg5, arg7, arg2, arg4, false, var10.field3623);
                    } else if (arg6 == 7) {
                        var10.field3623 = new class233(var11, 4, (arg3 + 2 & 0x3) + 4, arg5, arg7, arg2, arg4, false, var10.field3623);
                    } else if (arg6 == 8) {
                        var10.field3623 = new class233(var11, 4, arg3 + 4, arg5, arg7, arg2, arg4, false, var10.field3623);
                        var10.field3628 = new class233(var11, 4, (arg3 + 2 & 0x3) + 4, arg5, arg7, arg2, arg4, false, var10.field3628);
                    }
                }
            }
            if (arg1 == 2) {
                if (arg6 == 11) {
                    arg6 = 10;
                }
                class26 var12 = class104.method757(arg5, arg7, arg2);
                if (var12 != null) {
                    var12.field406 = new class233((int) (var12.field402 >>> 32) & Integer.MAX_VALUE, arg6, arg3, arg5, arg7, arg2, arg4, false, var12.field406);
                }
            }
            if (arg1 == 3) {
                class279 var13 = class219.method1545(arg5, arg7, arg2);
                if (var13 != null) {
                    var13.field4297 = new class233(Integer.MAX_VALUE & (int) (var13.field4300 >>> 32), 22, arg3, arg5, arg7, arg2, arg4, false, var13.field4297);
                }
            }
        }
        field2221++;
        int var14 = -43 / ((arg0 - 77) / 37);
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(Lkh;II)V", line = 108)
    public static final void method1017(class166 arg0, int arg1, int arg2) {
        field2216++;
        if (class78.field1253 != null) {
            try {
                class78.field1253.method2212((byte) -126, 0L);
                class78.field1253.method2209(72, arg1, 24, arg0.field2500);
            } catch (Exception var4) {
            }
        }
        if (arg2 != -24209) {
            method1015(-52);
        }
    }

    @OriginalMember(owner = "client!cj", name = "<init>", descriptor = "(II)V", line = 141)
    public class143(int arg0, int arg1) {
        this.field2224 = arg0;
        this.field2219 = arg1;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 151)
    public static final void method1018(String arg0, int arg1) {
        field2217++;
        int var2 = class222.method1580((byte) -10, arg0);
        if (var2 == -1) {
            return;
        }
        if (arg1 != 18460) {
            method1018((String) null, 110);
        }
        int[] var3 = class214.field3256.method8(class162.field2445.field4698[var2] & 0x3FFF, (byte) 120, (class162.field2445.field4698[var2] & 0x30BD9D37) >> 28, class162.field2445.field4698[var2] >> 14 & 0x3FFF);
        class294.method2001(arg1 ^ 0xFFFFB7E3, var3[2], var3[1]);
    }

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "(Z)V", line = 169)
    public static void method1019(boolean arg0) {
        field2220 = (byte[][][]) null;
        field2225 = null;
        if (arg0) {
            method1019(false);
        }
    }
}
