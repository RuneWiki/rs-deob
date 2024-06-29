import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class363 extends class152 {

    @OriginalMember(owner = "client!bf", name = "u", descriptor = "I")
    private int field5748 = -32768;

    @OriginalMember(owner = "client!bf", name = "n", descriptor = "I")
    public static int field5741 = 0;

    @OriginalMember(owner = "client!bf", name = "s", descriptor = "S")
    public static short field5746 = 32767;

    @OriginalMember(owner = "client!bf", name = "r", descriptor = "I")
    public static int field5745 = 0;

    @OriginalMember(owner = "client!bf", name = "q", descriptor = "Ljava/lang/String;")
    public static String field5744 = "Use";

    @OriginalMember(owner = "client!bf", name = "t", descriptor = "[I")
    public static int[] field5747 = new int[500];

    @OriginalMember(owner = "client!bf", name = "k", descriptor = "I")
    public static int field5738 = 0;

    @OriginalMember(owner = "client!bf", name = "j", descriptor = "I")
    public static int field5737;

    @OriginalMember(owner = "client!bf", name = "l", descriptor = "I")
    public static int field5739;

    @OriginalMember(owner = "client!bf", name = "m", descriptor = "I")
    public static int field5740;

    @OriginalMember(owner = "client!bf", name = "o", descriptor = "I")
    public static int field5742;

    @OriginalMember(owner = "client!bf", name = "p", descriptor = "I")
    public static int field5743;

    @OriginalMember(owner = "client!bf", name = "v", descriptor = "I")
    public int field5749;

    @OriginalMember(owner = "client!bf", name = "w", descriptor = "I")
    public int field5750;

    @OriginalMember(owner = "client!bf", name = "x", descriptor = "I")
    public static int field5751;

    @OriginalMember(owner = "client!bf", name = "y", descriptor = "I")
    public static int field5752;

    @OriginalMember(owner = "client!bf", name = "z", descriptor = "I")
    public static int field5753;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "()I", line = 5)
    public final int method340() {
        field5742++;
        return this.field5748;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIIII)V", line = 17)
    public final void method334(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field5751++;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IZIIIII[Lrm;[BII)[I", line = 31)
    public static final int[] method2546(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class273[] arg7, byte[] arg8, int arg9, int arg10) {
        int var11 = (arg0 & 0x7) * 8;
        field5737++;
        if (!arg1) {
            for (int var12 = 0; var12 < 8; var12++) {
                for (int var13 = 0; var13 < 8; var13++) {
                    int var14 = arg6 + class135.method949(arg2, (byte) 101, var12 & 0x7, var13 & 0x7);
                    int var15 = arg5 + class348.method2494(var13 & 0x7, var12 & 0x7, 28788, arg2);
                    if (var14 > 0 && var14 < 103 && var15 > 0 && var15 < 103) {
                        arg7[arg10].field4451[var14][var15] = class83.method613(arg7[arg10].field4451[var14][var15], -2097153);
                    }
                }
            }
        }
        byte var16;
        if (arg1) {
            var16 = 1;
        } else {
            var16 = 4;
        }
        int var17 = (arg4 & 0x7) * 8;
        class146 var18 = new class146(arg8);
        int var19 = arg4 & 0x1FFFFFF8 << 3;
        int var20 = (arg0 & 0xFFFFFFF8) << 3;
        byte var21 = 0;
        byte var22 = 0;
        if (arg2 == 1) {
            var22 = 1;
        } else if (arg2 == 2) {
            var21 = 1;
            var22 = 1;
        } else if (arg2 == 3) {
            var21 = 1;
        }
        for (int var23 = 0; var23 < var16; var23++) {
            for (int var24 = 0; var24 < 64; var24++) {
                for (int var25 = 0; var25 < 64; var25++) {
                    if (arg9 != var23 || var11 > var24 || (var11 + 8) < var24 || var25 < var17 || (var17 + 8) < var25) {
                        class205.method1398(-1, -1, false, arg1, 0, var18, 0, 0, 0, -103, 0, 0);
                    } else if (var11 + 8 == var24 || (var17 + 8) == var25) {
                        int var32;
                        int var33;
                        if (arg2 == 0) {
                            var32 = var24 + arg6 - var11;
                            var33 = var25 + arg5 - var17;
                        } else if (arg2 == 1) {
                            var33 = var11 + arg5 - (var24 - 8);
                            var32 = var25 + arg6 - var17;
                        } else if (arg2 == 2) {
                            var33 = var17 + arg5 + 8 - var25;
                            var32 = arg6 + var11 + 8 - var24;
                        } else {
                            var32 = arg6 + var17 + 8 - var25;
                            var33 = var24 + arg5 - var11;
                        }
                        class205.method1398(var32, var33, true, arg1, arg10, var18, 0, 0, var20 + var24, -80, 0, var19 + var25);
                    } else {
                        int var26 = arg6 + class135.method949(arg2, (byte) 49, var24 & 0x7, var25 & 0x7);
                        int var27 = arg5 + class348.method2494(var25 & 0x7, var24 & 0x7, 28788, arg2);
                        class205.method1398(var26, var27, false, arg1, arg10, var18, var21, var22, var20 + var24, -72, arg2, var19 + var25);
                        if (var24 == 63 || var25 == 63) {
                            int var28 = var24 == 63 ? 64 : var24;
                            int var29 = var25 == 63 ? 64 : var25;
                            int var30;
                            int var31;
                            if (arg2 == 0) {
                                var31 = var28 + arg6 - var11;
                                var30 = var29 + arg5 - var17;
                            } else if (arg2 == 1) {
                                var31 = var29 + arg6 - var17;
                                var30 = arg5 - var28 - (-var11 - 8);
                            } else if (arg2 == 2) {
                                var30 = arg5 + var17 + 8 - var29;
                                var31 = var11 + 8 - (var28 - arg6);
                            } else {
                                var30 = arg5 - (var11 - var28);
                                var31 = var17 + arg6 + 8 - var29;
                            }
                            if (var31 >= 0 && var31 < 104 && var30 >= 0 && var30 < 104) {
                                class144.field2427[arg10][var31][var30] = class144.field2427[arg10][var21 + var26][var22 + var27];
                            }
                        }
                    }
                }
            }
        }
        if (arg3 >= -18) {
            return (int[]) null;
        }
        boolean var34 = false;
        boolean var35 = false;
        while (var18.field2496.length > var18.field2435) {
            int var36 = var18.method1005((byte) 122);
            if (var36 == 128) {
                var35 = true;
                class144.field2418[0] = var18.method989(61);
                class144.field2418[1] = var18.method1050(3);
                class144.field2418[2] = var18.method1050(3);
                class144.field2418[3] = var18.method1050(3);
                class144.field2418[4] = var18.method989(95);
            } else {
                if (var36 != 129) {
                    var18.field2435--;
                    break;
                }
                for (int var37 = 0; var37 < 4; var37++) {
                    byte var38 = var18.method1029(-2);
                    if (var38 == 0) {
                        if (arg9 >= var37) {
                            int var46 = arg6;
                            if (arg6 < 0) {
                                var46 = 0;
                            } else if (arg6 >= 104) {
                                var46 = 104;
                            }
                            int var47 = arg6 + 7;
                            if (var47 < 0) {
                                var47 = 0;
                            } else if (var47 >= 104) {
                                var47 = 104;
                            }
                            int var48 = arg5;
                            if (arg5 < 0) {
                                var48 = 0;
                            } else if (arg5 >= 104) {
                                var48 = 104;
                            }
                            int var49 = arg5 + 7;
                            if (var49 < 0) {
                                var49 = 0;
                            } else if (var49 >= 104) {
                                var49 = 104;
                            }
                            while (var46 < var47) {
                                while (var48 < var49) {
                                    class271.field4409[arg10][var46][var48] = 0;
                                    var48++;
                                }
                                var46++;
                            }
                        }
                    } else if (var38 == 1) {
                        for (int var39 = 0; var39 < 64; var39 += 4) {
                            for (int var40 = 0; var40 < 64; var40 += 4) {
                                byte var41 = var18.method1029(-2);
                                if (arg9 >= var37) {
                                    for (int var42 = var39; var42 < (var39 + 4); var42++) {
                                        for (int var43 = var40; var43 < (var40 + 4); var43++) {
                                            if (var42 >= var11 && var42 < var11 + 8 && var17 <= var43 && (var17 + 8) > var17) {
                                                int var44 = arg6 + class135.method949(arg2, (byte) 76, var42 & 0x7, var43 & 0x7);
                                                int var45 = arg5 + class348.method2494(var43 & 0x7, var42 & 0x7, 28788, arg2);
                                                if (var44 >= 0 && var44 < 104 && var45 >= 0 && var45 < 104) {
                                                    class271.field4409[arg10][var44][var45] = var41;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else if (var38 != 2) {
                    }
                }
            }
        }
        if (class241.field4016 && !arg1) {
            class134 var50 = null;
            while (true) {
                while (var18.field2496.length > var18.field2435) {
                    int var51 = var18.method1005((byte) 122);
                    if (var51 == 0) {
                        var50 = new class134(var18);
                    } else if (var51 == 1) {
                        int var52 = var18.method1005((byte) 122);
                        if (var52 > 0) {
                            for (int var53 = 0; var53 < var52; var53++) {
                                class33 var54 = new class33(var18);
                                if (var54.field742 == 31) {
                                    class255 var55 = class162.method1164(var18.method989(91), (byte) -84);
                                    var54.method240(var55.field4185, var55.field4177, -92, var55.field4178, var55.field4186);
                                }
                                int var56 = var54.field750 >> 7;
                                int var57 = var54.field733 >> 7;
                                if (var54.field746 == arg9 && var11 <= var56 && (var11 + 8) > var56 && var57 >= var17 && var57 < (var17 + 8)) {
                                    int var58 = (arg6 << 7) + class229.method1589(var54.field750 & 0x3FF, 3, arg2, var54.field733 & 0x3FF);
                                    int var59 = class292.method2075(var54.field733 & 0x3FF, arg2, (byte) 126, var54.field750 & 0x3FF) + (arg5 << 7);
                                    var54.field750 = var58;
                                    int var60 = var54.field750 >> 7;
                                    var54.field733 = var59;
                                    int var61 = var54.field733 >> 7;
                                    if (var60 >= 0 && var61 >= 0 && var60 < 104 && var61 < 104) {
                                        var54.field749 = (class282.field4615[1][var60][var61] & 0x2) != 0;
                                        var54.field737 = class144.field2427[var54.field746][var60][var61] - var54.field737;
                                        class2.method24(var54);
                                    }
                                }
                            }
                        }
                    } else if (var51 == 2) {
                        if (var50 == null) {
                            var50 = new class134();
                        }
                        var50.method943((byte) 85, var18);
                    } else {
                        throw new IllegalStateException();
                    }
                }
                if (var50 == null) {
                    var50 = new class134();
                }
                class191.field3233[arg6 >> 3][arg5 >> 3] = var50;
                break;
            }
        }
        if (!var34) {
            int var62 = arg6 + 7;
            int var63 = arg5 + 7;
            for (int var64 = arg6; var64 < var62; var64++) {
                for (int var65 = arg5; var65 < var63; var65++) {
                    class271.field4409[arg10][var64][var65] = 0;
                }
            }
        }
        return var35 ? class144.field2418 : null;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(ILjava/lang/Object;Lla;)V", line = 495)
    public static final void method2547(int arg0, Object arg1, class157 arg2) {
        field5743++;
        if (arg2.field2647 == null) {
            return;
        }
        for (int var3 = arg0; var3 < 50 && arg2.field2647.peekEvent() != null; var3++) {
            class122.method881(-75, 1L);
        }
        if (arg1 != null) {
            arg2.field2647.postEvent(new ActionEvent(arg1, 1001, "dummy"));
        }
    }

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "(I)V", line = 530)
    public static void method2548(int arg0) {
        field5747 = null;
        if (arg0 != -5230) {
            field5738 = 3;
        }
        field5744 = null;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIIIIIIIJILgl;)V", line = 562)
    public final void method327(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class214 arg10) {
        class42 var13 = class296.method2124(0, this.field5749).method109(0, 0, (class260) null, this.field5750, (class300) null, -1, (byte) 4);
        field5740++;
        if (var13 != null) {
            var13.method327(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10);
            this.field5748 = var13.method340();
        }
    }
}
