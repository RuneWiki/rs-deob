import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qo")
public class class329 extends class172 {

    @OriginalMember(owner = "client!qo", name = "t", descriptor = "I")
    public int field5053 = 0;

    @OriginalMember(owner = "client!qo", name = "L", descriptor = "[Ljg;")
    public class297[] field5070 = new class297[5];

    @OriginalMember(owner = "client!qo", name = "S", descriptor = "[I")
    public int[] field5077 = new int[5];

    @OriginalMember(owner = "client!qo", name = "r", descriptor = "I")
    public int field5051;

    @OriginalMember(owner = "client!qo", name = "A", descriptor = "I")
    public int field5060;

    @OriginalMember(owner = "client!qo", name = "I", descriptor = "I")
    public int field5067;

    @OriginalMember(owner = "client!qo", name = "w", descriptor = "I")
    public int field5056;

    @OriginalMember(owner = "client!qo", name = "x", descriptor = "I")
    public static int field5057 = -1;

    @OriginalMember(owner = "client!qo", name = "y", descriptor = "[I")
    public static int[] field5058 = new int[2500];

    @OriginalMember(owner = "client!qo", name = "M", descriptor = "[I")
    public static int[] field5071 = new int[32];

    @OriginalMember(owner = "client!qo", name = "Q", descriptor = "Ljava/lang/String;")
    public static String field5075 = "yellow:";

    @OriginalMember(owner = "client!qo", name = "O", descriptor = "I")
    public static int field5073 = 0;

    @OriginalMember(owner = "client!qo", name = "T", descriptor = "B")
    public byte field5078;

    @OriginalMember(owner = "client!qo", name = "o", descriptor = "I")
    public int field5048;

    @OriginalMember(owner = "client!qo", name = "q", descriptor = "I")
    public static int field5050;

    @OriginalMember(owner = "client!qo", name = "s", descriptor = "I")
    public static int field5052;

    @OriginalMember(owner = "client!qo", name = "v", descriptor = "I")
    public int field5055;

    @OriginalMember(owner = "client!qo", name = "z", descriptor = "I")
    public static int field5059;

    @OriginalMember(owner = "client!qo", name = "E", descriptor = "I")
    public int field5063;

    @OriginalMember(owner = "client!qo", name = "H", descriptor = "I")
    public int field5066;

    @OriginalMember(owner = "client!qo", name = "K", descriptor = "I")
    public int field5069;

    @OriginalMember(owner = "client!qo", name = "N", descriptor = "Lme;")
    public class117 field5072;

    @OriginalMember(owner = "client!qo", name = "P", descriptor = "Lrn;")
    public static class18 field5074;

    @OriginalMember(owner = "client!qo", name = "F", descriptor = "Lbl;")
    public class202 field5064;

    @OriginalMember(owner = "client!qo", name = "G", descriptor = "Lkl;")
    public class280 field5065;

    @OriginalMember(owner = "client!qo", name = "J", descriptor = "Lqo;")
    public class329 field5068;

    @OriginalMember(owner = "client!qo", name = "B", descriptor = "Lba;")
    public class33 field5061;

    @OriginalMember(owner = "client!qo", name = "p", descriptor = "Lmd;")
    public class348 field5049;

    @OriginalMember(owner = "client!qo", name = "D", descriptor = "Lbb;")
    public class44 field5062;

    @OriginalMember(owner = "client!qo", name = "n", descriptor = "Lcb;")
    public class98 field5047;

    @OriginalMember(owner = "client!qo", name = "u", descriptor = "Z")
    public boolean field5054;

    @OriginalMember(owner = "client!qo", name = "R", descriptor = "Z")
    public boolean field5076;

    @OriginalMember(owner = "client!qo", name = "U", descriptor = "Z")
    public boolean field5079;

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 4)
    public static final void method2323(String arg0, int arg1) {
        field5050++;
        if (arg0 == null) {
            return;
        }
        String var2 = class249.method1859(arg1 ^ arg1, arg0);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < class131.field2215; var3++) {
            String var4 = class249.method1859(0, class83.field1197[var3]);
            if (var4 != null && var4.equals(var2)) {
                class131.field2215--;
                for (int var5 = var3; var5 < class131.field2215; var5++) {
                    class83.field1197[var5] = class83.field1197[var5 + 1];
                    class173.field2751[var5] = class173.field2751[var5 + 1];
                    class55.field807[var5] = class55.field807[var5 + 1];
                    class201.field3107[var5] = class201.field3107[var5 + 1];
                    class36.field537[var5] = class36.field537[var5 + 1];
                    class13.field182[var5] = class13.field182[var5 + 1];
                }
                class109.field1654++;
                class66.field1013 = class327.field5030;
                class99.field1491.method1628((byte) -18, 30);
                class99.field1491.method273(0, class34.method354(arg0, (byte) 51));
                class99.field1491.method280(-18345, arg0);
                break;
            }
        }
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(Ljava/awt/Component;I)V", line = 56)
    public static final void method2324(Component arg0, int arg1) {
        arg0.removeKeyListener(class113.field1724);
        int var2 = -74 / ((36 - arg1) / 43);
        arg0.removeFocusListener(class113.field1724);
        class148.field2430 = -1;
        field5052++;
    }

    @OriginalMember(owner = "client!qo", name = "<init>", descriptor = "(III)V", line = 67)
    public class329(int arg0, int arg1, int arg2) {
        this.field5051 = arg2;
        this.field5060 = arg1;
        this.field5056 = this.field5067 = arg0;
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(B)V", line = 87)
    public static void method2325(byte arg0) {
        field5071 = null;
        field5074 = null;
        field5058 = null;
        field5075 = null;
        if (arg0 >= -102) {
            method2326(-72, 31, true, 27, (class290[]) null, -18, (byte) -49, (byte[]) null, -44, 4, 64);
        }
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(IIZI[Lrk;IB[BIII)[I", line = 105)
    public static final int[] method2326(int arg0, int arg1, boolean arg2, int arg3, class290[] arg4, int arg5, byte arg6, byte[] arg7, int arg8, int arg9, int arg10) {
        field5059++;
        int var11 = (arg10 & 0x7) * 8;
        int var12 = (arg1 & 0x7) * 8;
        if (!arg2) {
            for (int var13 = 0; var13 < 8; var13++) {
                for (int var14 = 0; var14 < 8; var14++) {
                    int var15 = arg8 + class149.method1240(104, arg3, var14 & 0x7, var13 & 0x7);
                    int var16 = class280.method2046(var14 & 0x7, var13 & 0x7, arg3, -111) + arg9;
                    if (var15 > 0 && var15 < 103 && var16 > 0 && var16 < 103) {
                        arg4[arg5].field4520[var15][var16] = class301.method2169(arg4[arg5].field4520[var15][var16], -2097153);
                    }
                }
            }
        }
        byte var17;
        if (arg2) {
            var17 = 1;
        } else {
            var17 = 4;
        }
        if (arg6 != 125) {
            return (int[]) null;
        }
        int var18 = (arg10 & 0xFFFFFFF8) << 3;
        class25 var19 = new class25(arg7);
        byte var20 = 0;
        int var21 = (arg1 & 0xFFFFFFF8) << 3;
        byte var22 = 0;
        if (arg3 == 1) {
            var20 = 1;
        } else if (arg3 == 2) {
            var20 = 1;
            var22 = 1;
        } else if (arg3 == 3) {
            var22 = 1;
        }
        for (int var23 = 0; var23 < var17; var23++) {
            for (int var24 = 0; var24 < 64; var24++) {
                for (int var25 = 0; var25 < 64; var25++) {
                    if (arg0 != var23 || var24 < var11 || var24 > var11 + 8 || var12 > var25 || var25 > var12 + 8) {
                        class319.method2252((byte) -59, 0, false, -1, 0, 0, -1, 0, 0, arg2, var19, 0);
                    } else if (var11 + 8 == var24 || (var12 + 8) == var25) {
                        int var32;
                        int var33;
                        if (arg3 == 0) {
                            var32 = var25 + arg9 - var12;
                            var33 = var24 + arg8 - var11;
                        } else if (arg3 == 1) {
                            var33 = var25 + arg8 - var12;
                            var32 = arg9 + 8 - (-var11 + var24);
                        } else if (arg3 == 2) {
                            var33 = arg8 + var11 + 8 - var24;
                            var32 = var12 + arg9 + 8 - var25;
                        } else {
                            var33 = arg8 + var12 + 8 - var25;
                            var32 = var24 + arg9 - var11;
                        }
                        class319.method2252((byte) -59, 0, true, var32, 0, 0, var33, var18 + var24, arg5, arg2, var19, var21 + var25);
                    } else {
                        int var26 = class149.method1240(75, arg3, var25 & 0x7, var24 & 0x7) + arg8;
                        int var27 = class280.method2046(var25 & 0x7, var24 & 0x7, arg3, -50) + arg9;
                        class319.method2252((byte) -59, arg3, false, var27, var20, var22, var26, var18 + var24, arg5, arg2, var19, var21 + var25);
                        if (var24 == 63 || var25 == 63) {
                            int var28 = var24 == 63 ? 64 : var24;
                            int var29 = var25 == 63 ? 64 : var25;
                            int var30;
                            int var31;
                            if (arg3 == 0) {
                                var31 = var29 + arg9 - var12;
                                var30 = var28 - (var11 - arg8);
                            } else if (arg3 == 1) {
                                var30 = var29 + arg8 - var12;
                                var31 = arg9 + 8 - (var28 - var11);
                            } else if (arg3 == 2) {
                                var30 = arg8 + 8 - (-var11 + var28);
                                var31 = var12 + arg9 + 8 - var29;
                            } else {
                                var31 = var28 + arg9 - var11;
                                var30 = var12 + arg8 + 8 - var29;
                            }
                            if (var30 >= 0 && var30 < 104 && var31 >= 0 && var31 < 104) {
                                class277.field4290[arg5][var30][var31] = class277.field4290[arg5][var26 + var22][var27 + var20];
                            }
                        }
                    }
                }
            }
        }
        boolean var34 = false;
        boolean var35 = false;
        while (var19.field448.length > var19.field397) {
            int var36 = var19.method281(arg6 - 249);
            if (var36 == 128) {
                var34 = true;
                class93.field1406[0] = var19.method314((byte) 104);
                class93.field1406[1] = var19.method296(-96);
                class93.field1406[2] = var19.method296(arg6 - 226);
                class93.field1406[3] = var19.method296(-100);
                class93.field1406[4] = var19.method314((byte) 51);
            } else {
                if (var36 != 129) {
                    var19.field397--;
                    break;
                }
                for (int var37 = 0; var37 < 4; var37++) {
                    byte var38 = var19.method286((byte) 97);
                    if (var38 == 0) {
                        if (var37 <= arg0) {
                            int var46 = arg8;
                            int var47 = arg8 + 7;
                            if (var47 < 0) {
                                var47 = 0;
                            } else if (var47 >= 104) {
                                var47 = 104;
                            }
                            if (arg8 < 0) {
                                var46 = 0;
                            } else if (arg8 >= 104) {
                                var46 = 104;
                            }
                            int var48 = arg9 + 7;
                            int var49 = arg9;
                            if (var48 < 0) {
                                var48 = 0;
                            } else if (var48 >= 104) {
                                var48 = 104;
                            }
                            if (arg9 < 0) {
                                var49 = 0;
                            } else if (arg9 >= 104) {
                                var49 = 104;
                            }
                            while (var47 > var46) {
                                while (var48 > var49) {
                                    class109.field1672[arg5][var46][var49] = 0;
                                    var49++;
                                }
                                var46++;
                            }
                        }
                    } else if (var38 == 1) {
                        for (int var39 = 0; var39 < 64; var39 += 4) {
                            for (int var40 = 0; var40 < 64; var40 += 4) {
                                byte var41 = var19.method286((byte) 91);
                                if (arg0 >= var37) {
                                    for (int var42 = var39; var42 < (var39 + 4); var42++) {
                                        for (int var43 = var40; var43 < var40 + 4; var43++) {
                                            if (var11 <= var42 && var11 + 8 > var42 && var43 >= var12 && var12 < (var12 + 8)) {
                                                int var44 = class149.method1240(116, arg3, var43 & 0x7, var42 & 0x7) + arg8;
                                                int var45 = class280.method2046(var43 & 0x7, var42 & 0x7, arg3, -119) + arg9;
                                                if (var44 >= 0 && var44 < 104 && var45 >= 0 && var45 < 104) {
                                                    class109.field1672[arg5][var44][var45] = var41;
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
        if (class240.field3737 && !arg2) {
            class110 var50 = null;
            label295: while (true) {
                while (true) {
                    while (var19.field448.length > var19.field397) {
                        int var51 = var19.method281(-128);
                        if (var51 == 0) {
                            var50 = new class110(var19);
                        } else if (var51 == 1) {
                            int var52 = var19.method281(-125);
                            if (var52 > 0) {
                                for (int var53 = 0; var53 < var52; var53++) {
                                    class186 var54 = new class186(var19);
                                    if (var54.field2921 == 31) {
                                        class173 var55 = class166.method1320(var19.method314((byte) 83), 114);
                                        var54.method1432(var55.field2747, var55.field2755, var55.field2759, 100, var55.field2748);
                                    }
                                    int var56 = var54.field2909 >> 7;
                                    int var57 = var54.field2924 >> 7;
                                    if (var54.field2922 == arg0 && var11 <= var56 && var56 < var11 + 8 && var57 >= var12 && var12 + 8 > var57) {
                                        int var58 = class195.method1483(var54.field2909 & 0x3FF, arg6 + 18080, var54.field2924 & 0x3FF, arg3) + (arg8 << 7);
                                        int var59 = (arg9 << 7) + class111.method960(arg3, var54.field2924 & 0x3FF, 1023, var54.field2909 & 0x3FF);
                                        var54.field2924 = var59;
                                        int var60 = var54.field2924 >> 7;
                                        var54.field2909 = var58;
                                        int var61 = var54.field2909 >> 7;
                                        if (var61 >= 0 && var60 >= 0 && var61 < 104 && var60 < 104) {
                                            var54.field2911 = (class146.field2386[1][var61][var60] & 0x2) != 0;
                                            var54.field2913 = class277.field4290[var54.field2922][var61][var60] - var54.field2913;
                                            class299.method2147(var54);
                                        }
                                    }
                                }
                            }
                        } else if (var51 == 2) {
                            if (var50 == null) {
                                var50 = new class110();
                            }
                            var50.method956((byte) 106, var19);
                        } else {
                            throw new IllegalStateException();
                        }
                    }
                    if (var50 == null) {
                        var50 = new class110();
                    }
                    class49.field774[arg8 >> 3][arg9 >> 3] = var50;
                    break label295;
                }
            }
        }
        if (!var35) {
            int var62 = arg8 + 7;
            int var63 = arg9 + 7;
            for (int var64 = arg8; var64 < var62; var64++) {
                for (int var65 = arg9; var65 < var63; var65++) {
                    class109.field1672[arg5][var64][var65] = 0;
                }
            }
        }
        return var34 ? class93.field1406 : null;
    }
}
