import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public class class41 {

    @OriginalMember(owner = "client!ok", name = "e", descriptor = "I")
    public static int field603 = 0;

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "I")
    public static int field600;

    @OriginalMember(owner = "client!ok", name = "c", descriptor = "I")
    public static int field601;

    @OriginalMember(owner = "client!ok", name = "d", descriptor = "I")
    public static int field602;

    @OriginalMember(owner = "client!ok", name = "f", descriptor = "I")
    public static int field604;

    @OriginalMember(owner = "client!ok", name = "g", descriptor = "I")
    public static int field605;

    @OriginalMember(owner = "client!ok", name = "h", descriptor = "I")
    public static int field606;

    @OriginalMember(owner = "client!ok", name = "i", descriptor = "I")
    public static int field607;

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "Lff;")
    public static class236 field599;

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(B)V")
    public static void method267(byte arg0) {
        field599 = null;
        if (arg0 >= -19) {
            method272((byte[]) null, 111, (class44[]) null, 113, 7, -60, 28, true, 117, -124, 77);
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIZII)V")
    public static final void method268(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        class214.field3538 = 0L;
        int var5 = class56.method383(false);
        boolean var6 = false;
        field601++;
        if (arg3 != -27825) {
            method267((byte) 111);
        }
        if (arg0 == 3 || var5 == 3) {
            arg2 = true;
        }
        if (var5 > 0 == arg0 <= 0) {
            var6 = true;
        }
        if (class45.field760.startsWith("mac") && arg0 > 0) {
            arg2 = true;
        }
        if (arg2 && arg0 > 0) {
            var6 = true;
        }
        class239.method1614(arg2, -1, arg4, arg1, var6, arg0, var5);
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(I)I")
    public static final int method269(int arg0) {
        field605++;
        return arg0 > -52 ? 105 : 2;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(III)V")
    public static final void method270(int arg0, int arg1, int arg2) {
        field602++;
        if (class168.field2737 != arg0) {
            class243.field3869 = new int[arg0];
            for (int var3 = 0; var3 < arg0; var3++) {
                class243.field3869[var3] = (var3 << 12) / arg0;
            }
            class228.field3679 = arg0 * 32;
            class168.field2737 = arg0;
            class234.field3769 = arg0 - 1;
        }
        if (arg1 != 0) {
            method267((byte) 80);
        }
        if (class149.field2335 == arg2) {
            return;
        }
        if (class168.field2737 == arg2) {
            class173.field2835 = class243.field3869;
        } else {
            class173.field2835 = new int[arg2];
            for (int var4 = 0; var4 < arg2; var4++) {
                class173.field2835[var4] = (var4 << 12) / arg2;
            }
        }
        class149.field2335 = arg2;
        class293.field4689 = arg2 - 1;
    }

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "(III)I")
    public static final int method271(int arg0, int arg1, int arg2) {
        field606++;
        if (arg1 == -2) {
            return 12345678;
        }
        if (arg2 >= -89) {
            field603 = 40;
        }
        if (arg1 == -1) {
            if (arg0 < 2) {
                arg0 = 2;
            } else if (arg0 > 126) {
                arg0 = 126;
            }
            return arg0;
        }
        int var3 = (arg1 & 0x7F) * arg0 >> 7;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg1 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "([BI[Lpk;IIIIZIII)V")
    public static final void method272(byte[] arg0, int arg1, class44[] arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10) {
        field600++;
        class162 var11 = new class162(arg0);
        int var12 = arg6;
        while (true) {
            int var13 = var11.method1139(-5705);
            if (var13 == 0) {
                return;
            }
            var12 += var13;
            int var14 = 0;
            while (true) {
                int var15 = var11.method1114((byte) -13);
                if (var15 == 0) {
                    break;
                }
                var14 += var15 - 1;
                int var16 = var14 >> 12;
                int var17 = (var14 & 0xFDE) >> 6;
                int var18 = var14 & 0x3F;
                int var19 = var11.method1133((byte) 53);
                int var20 = var19 >> 2;
                int var21 = var19 & 0x3;
                if (arg5 == var16 && var17 >= arg4 && arg4 + 8 > var17 && var18 >= arg3 && var18 < (arg3 + 8)) {
                    class158 var22 = class5.method29(var12, true);
                    int var23 = arg8 + class34.method225(arg1, arg6 ^ 0xFFFFFFFC, var21, var17 & 0x7, var22.field2487, var22.field2507, var18 & 0x7);
                    int var24 = arg9 + class278.method1870(var22.field2487, false, var18 & 0x7, arg1, var22.field2507, var21, var17 & 0x7);
                    if (var23 > 0 && var24 > 0 && var23 < 103 && var24 < 103) {
                        class44 var25 = null;
                        if (!arg7) {
                            int var26 = arg10;
                            if ((class301.field4818[1][var23][var24] & 0x2) == 2) {
                                var26 = arg10 - 1;
                            }
                            if (var26 >= 0) {
                                var25 = arg2[var26];
                            }
                        }
                        class137.method957(var21 + arg1 & 0x3, arg7, var23, var12, var20, !arg7, arg10, (byte) 3, var24, var25, arg10);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(Lba;I)V")
    public static final void method273(class296 arg0, int arg1) {
        field607++;
        int var2 = -1;
        long var3 = (long) arg1;
        int var5 = 0;
        int var6 = 0;
        if (arg0.field4740 == 0) {
            var3 = class276.method1861(arg0.field4744, arg0.field4730, arg0.field4731);
        }
        if (arg0.field4740 == 1) {
            var3 = class173.method1258(arg0.field4744, arg0.field4730, arg0.field4731);
        }
        if (arg0.field4740 == 2) {
            var3 = class203.method1421(arg0.field4744, arg0.field4730, arg0.field4731);
        }
        if (arg0.field4740 == 3) {
            var3 = class205.method1435(arg0.field4744, arg0.field4730, arg0.field4731);
        }
        if (var3 != 0L) {
            var6 = ((int) var3 & 0x35F3B3) >> 20;
            var5 = (int) var3 >> 14 & 0x1F;
            var2 = Integer.MAX_VALUE & (int) (var3 >>> 32);
        }
        arg0.field4723 = var5;
        arg0.field4742 = var6;
        arg0.field4724 = var2;
    }
}
