import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class51 {

    @OriginalMember(owner = "client!k", name = "c", descriptor = "Ldb;")
    public static class102 field727 = new class102(5);

    @OriginalMember(owner = "client!k", name = "j", descriptor = "I")
    public static int field734 = 0;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "I")
    public static int field725;

    @OriginalMember(owner = "client!k", name = "b", descriptor = "I")
    public static int field726;

    @OriginalMember(owner = "client!k", name = "d", descriptor = "I")
    public static int field728;

    @OriginalMember(owner = "client!k", name = "e", descriptor = "I")
    public static int field729;

    @OriginalMember(owner = "client!k", name = "f", descriptor = "I")
    public static int field730;

    @OriginalMember(owner = "client!k", name = "i", descriptor = "I")
    public static int field733;

    @OriginalMember(owner = "client!k", name = "g", descriptor = "[I")
    public static int[] field731;

    @OriginalMember(owner = "client!k", name = "h", descriptor = "[I")
    public static int[] field732;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(I)V", line = 8)
    public static void method332(int arg0) {
        field732 = null;
        if (arg0 != -10950) {
            field734 = 26;
        }
        field731 = null;
        field727 = null;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(BLak;)V", line = 22)
    public static final void method333(byte arg0, class172 arg1) {
        class185.field3073 = arg1;
        if (arg0 == -64) {
            field728++;
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(ILjj;)Ljava/lang/String;", line = 38)
    public static final String method334(int arg0, class44 arg1) {
        field730++;
        if (arg0 != 32767) {
            method335(52, -55, -121, -100, (class108[]) null, (byte) -15, 111, 94, -98, false, (byte[]) null);
        }
        return class76.method514(32767, arg1, 0);
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(IIII[Lac;BIIIZ[B)[I", line = 53)
    public static final int[] method335(int arg0, int arg1, int arg2, int arg3, class108[] arg4, byte arg5, int arg6, int arg7, int arg8, boolean arg9, byte[] arg10) {
        field729++;
        int var11 = (arg8 & 0x7) * 8;
        if (!arg9) {
            for (int var12 = 0; var12 < 8; var12++) {
                for (int var13 = 0; var13 < 8; var13++) {
                    int var14 = class138.method1023(var12 & 0x7, arg2, 121, var13 & 0x7) + arg6;
                    int var15 = arg0 + class126.method913(var12 & 0x7, 10, arg2, var13 & 0x7);
                    if (var14 > 0 && var14 < 103 && var15 > 0 && var15 < 103) {
                        arg4[arg3].field1592[var14][var15] = client.method767(arg4[arg3].field1592[var14][var15], -2097153);
                    }
                }
            }
        }
        int var16 = (arg1 & 0x7) * 8;
        byte var17;
        if (arg9) {
            var17 = 1;
        } else {
            var17 = 4;
        }
        int var18 = arg1 & 0x1FFFFFF8 << 3;
        int var19 = arg8 & 0x1FFFFFF8 << 3;
        class44 var20 = new class44(arg10);
        byte var21 = 0;
        byte var22 = 0;
        if (arg2 == 1) {
            var21 = 1;
        } else if (arg2 == 2) {
            var22 = 1;
            var21 = 1;
        } else if (arg2 == 3) {
            var22 = 1;
        }
        for (int var23 = 0; var23 < var17; var23++) {
            for (int var24 = 0; var24 < 64; var24++) {
                for (int var25 = 0; var25 < 64; var25++) {
                    if (arg7 != var23 || var24 < var16 || var24 > (var16 + 8) || var25 < var11 || var25 > (var11 + 8)) {
                        class296.method2116(arg9, -1, 0, 0, 0, false, -117, 0, var20, 0, 0, -1);
                    } else if (var16 + 8 == var24 || var11 + 8 == var25) {
                        int var32;
                        int var33;
                        if (arg2 == 0) {
                            var32 = var25 + arg0 - var11;
                            var33 = arg6 + var24 - var16;
                        } else if (arg2 == 1) {
                            var32 = arg0 + var16 + 8 - var24;
                            var33 = arg6 + var25 - var11;
                        } else if (arg2 == 2) {
                            var32 = arg0 + 8 - (-var11 + var25);
                            var33 = arg6 + var16 + 8 - var24;
                        } else {
                            var32 = arg0 - (var16 - var24);
                            var33 = var11 + arg6 + 8 - var25;
                        }
                        class296.method2116(arg9, var32, 0, arg3, 0, true, -123, var18 + var24, var20, 0, var19 + var25, var33);
                    } else {
                        int var26 = class138.method1023(var24 & 0x7, arg2, 120, var25 & 0x7) + arg6;
                        int var27 = arg0 + class126.method913(var24 & 0x7, 10, arg2, var25 & 0x7);
                        class296.method2116(arg9, var27, var22, arg3, arg2, false, -123, var18 + var24, var20, var21, var19 + var25, var26);
                        if (var24 == 63 || var25 == 63) {
                            int var28 = var24 == 63 ? 64 : var24;
                            int var29 = var25 == 63 ? 64 : var25;
                            int var30;
                            int var31;
                            if (arg2 == 0) {
                                var30 = arg6 - (var16 - var28);
                                var31 = var29 + arg0 - var11;
                            } else if (arg2 == 1) {
                                var31 = arg0 - (var28 - var16 - 8);
                                var30 = arg6 + var29 - var11;
                            } else if (arg2 == 2) {
                                var30 = var16 + arg6 + 8 - var28;
                                var31 = var11 + arg0 + 8 - var29;
                            } else {
                                var31 = var28 + arg0 - var16;
                                var30 = var11 + arg6 + 8 - var29;
                            }
                            if (var30 >= 0 && var30 < 104 && var31 >= 0 && var31 < 104) {
                                class110.field1642[arg3][var30][var31] = class110.field1642[arg3][var22 + var26][var27 + var21];
                            }
                        }
                    }
                }
            }
        }
        boolean var34 = false;
        while (var20.field586 < var20.field573.length) {
            int var35 = var20.method286((byte) -120);
            if (var35 == 128) {
                class199.field3238[0] = var20.method271(21081);
                class199.field3238[1] = var20.method228(true);
                var34 = true;
                class199.field3238[2] = var20.method228(true);
                class199.field3238[3] = var20.method228(true);
                class199.field3238[4] = var20.method271(21081);
            } else {
                if (var35 != 129) {
                    var20.field586--;
                    break;
                }
                for (int var36 = 0; var36 < 4; var36++) {
                    byte var37 = var20.method246((byte) -57);
                    if (var37 == 0) {
                        if (arg7 >= var36) {
                            int var45 = arg6;
                            int var46 = arg6 + 7;
                            if (var46 < 0) {
                                var46 = 0;
                            } else if (var46 >= 104) {
                                var46 = 104;
                            }
                            if (arg6 < 0) {
                                var45 = 0;
                            } else if (arg6 >= 104) {
                                var45 = 104;
                            }
                            int var47 = arg0;
                            int var48 = arg0 + 7;
                            if (var48 < 0) {
                                var48 = 0;
                            } else if (var48 >= 104) {
                                var48 = 104;
                            }
                            if (arg0 < 0) {
                                var47 = 0;
                            } else if (arg0 >= 104) {
                                var47 = 104;
                            }
                            while (var46 > var45) {
                                while (var47 < var48) {
                                    class201.field3272[arg3][var45][var47] = 0;
                                    var47++;
                                }
                                var45++;
                            }
                        }
                    } else if (var37 == 1) {
                        for (int var38 = 0; var38 < 64; var38 += 4) {
                            for (int var39 = 0; var39 < 64; var39 += 4) {
                                byte var40 = var20.method246((byte) -95);
                                if (var36 <= arg7) {
                                    for (int var41 = var38; var41 < (var38 + 4); var41++) {
                                        for (int var42 = var39; var42 < var39 + 4; var42++) {
                                            if (var16 <= var41 && var16 + 8 > var41 && var11 <= var42 && var11 + 8 > var11) {
                                                int var43 = arg6 + class138.method1023(var41 & 0x7, arg2, 108, var42 & 0x7);
                                                int var44 = class126.method913(var41 & 0x7, 10, arg2, var42 & 0x7) + arg0;
                                                if (var43 >= 0 && var43 < 104 && var44 >= 0 && var44 < 104) {
                                                    class201.field3272[arg3][var43][var44] = var40;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else if (var37 == 2) {
                    }
                }
            }
        }
        boolean var49 = false;
        if (arg5 > -58) {
            return (int[]) null;
        }
        if (class232.field3690 && !arg9) {
            class149 var50 = null;
            label298: while (true) {
                int var52;
                label291: do {
                    while (true) {
                        while (var20.field586 < var20.field573.length) {
                            int var51 = var20.method286((byte) -126);
                            if (var51 == 0) {
                                var50 = new class149(var20);
                            } else {
                                if (var51 == 1) {
                                    var52 = var20.method286((byte) -65);
                                    continue label291;
                                }
                                if (var51 != 2) {
                                    throw new IllegalStateException();
                                }
                                if (var50 == null) {
                                    var50 = new class149();
                                }
                                var50.method1090(var20, -9537);
                            }
                        }
                        if (var50 == null) {
                            var50 = new class149();
                        }
                        class61.field870[arg6 >> 3][arg0 >> 3] = var50;
                        break label298;
                    }
                } while (var52 <= 0);
                for (int var53 = 0; var53 < var52; var53++) {
                    class48 var54 = new class48(var20);
                    if (var54.field681 == 31) {
                        class79 var55 = class273.method1979(125, var20.method271(21081));
                        var54.method314(222, var55.field1104, var55.field1112, var55.field1107, var55.field1105);
                    }
                    int var56 = var54.field678 >> 7;
                    int var57 = var54.field657 >> 7;
                    if (var54.field666 == arg7 && var16 <= var56 && (var16 + 8) > var56 && var57 >= var11 && var11 + 8 > var57) {
                        int var58 = (arg6 << 7) + class130.method947(var54.field678 & 0x3FF, (byte) -105, var54.field657 & 0x3FF, arg2);
                        int var59 = class169.method1238((byte) -128, var54.field678 & 0x3FF, var54.field657 & 0x3FF, arg2) + (arg0 << 7);
                        var54.field678 = var58;
                        int var60 = var54.field678 >> 7;
                        var54.field657 = var59;
                        int var61 = var54.field657 >> 7;
                        if (var60 >= 0 && var61 >= 0 && var60 < 104 && var61 < 104) {
                            var54.field661 = (class129.field2025[1][var60][var61] & 0x2) != 0;
                            var54.field682 = class110.field1642[var54.field666][var60][var61] - var54.field682;
                            class118.method816(var54);
                        }
                    }
                }
            }
        }
        if (!var49) {
            int var62 = arg0 + 7;
            int var63 = arg6 + 7;
            for (int var64 = arg6; var64 < var63; var64++) {
                for (int var65 = arg0; var65 < var62; var65++) {
                    class201.field3272[arg3][var64][var65] = 0;
                }
            }
        }
        return var34 ? class199.field3238 : null;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(Ljava/awt/Component;I)V", line = 520)
    public static final void method336(Component arg0, int arg1) {
        arg0.removeKeyListener(class29.field396);
        field726++;
        arg0.removeFocusListener(class29.field396);
        class182.field3026 = arg1;
    }
}
