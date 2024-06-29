import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public class class169 {

    @OriginalMember(owner = "client!mk", name = "i", descriptor = "[Lkh;")
    private class172[] field2684;

    @OriginalMember(owner = "client!mk", name = "o", descriptor = "I")
    private int field2690;

    @OriginalMember(owner = "client!mk", name = "k", descriptor = "I")
    public static int field2686 = 0;

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "Ljl;")
    public static class332 field2676 = new class332(64);

    @OriginalMember(owner = "client!mk", name = "p", descriptor = "Ljl;")
    public static class332 field2691 = new class332(64);

    @OriginalMember(owner = "client!mk", name = "q", descriptor = "I")
    public static int field2692 = 0;

    @OriginalMember(owner = "client!mk", name = "r", descriptor = "Ljava/lang/String;")
    public static String field2693 = "Please wait - attempting to reestablish.";

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "I")
    public static int field2677;

    @OriginalMember(owner = "client!mk", name = "c", descriptor = "I")
    public static int field2678;

    @OriginalMember(owner = "client!mk", name = "e", descriptor = "I")
    public static int field2680;

    @OriginalMember(owner = "client!mk", name = "f", descriptor = "I")
    public static int field2681;

    @OriginalMember(owner = "client!mk", name = "g", descriptor = "I")
    public static int field2682;

    @OriginalMember(owner = "client!mk", name = "h", descriptor = "I")
    public static int field2683;

    @OriginalMember(owner = "client!mk", name = "l", descriptor = "I")
    public static int field2687;

    @OriginalMember(owner = "client!mk", name = "m", descriptor = "I")
    public static int field2688;

    @OriginalMember(owner = "client!mk", name = "n", descriptor = "I")
    public static int field2689;

    @OriginalMember(owner = "client!mk", name = "j", descriptor = "J")
    private long field2685;

    @OriginalMember(owner = "client!mk", name = "d", descriptor = "Lkh;")
    private class172 field2679;

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(IJ)Lkh;", line = 4)
    public final class172 method1310(int arg0, long arg1) {
        if (arg0 <= 76) {
            field2686 = -60;
        }
        this.field2685 = arg1;
        field2688++;
        class172 var4 = this.field2684[(int) (arg1 & (long) (this.field2690 - 1))];
        for (this.field2679 = var4.field2746; this.field2679 != var4; this.field2679 = this.field2679.field2746) {
            if (this.field2679.field2754 == arg1) {
                class172 var5 = this.field2679;
                this.field2679 = this.field2679.field2746;
                return var5;
            }
        }
        this.field2679 = null;
        return null;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(I[Lic;IZBII[BIII)[I", line = 42)
    public static final int[] method1311(int arg0, class22[] arg1, int arg2, boolean arg3, byte arg4, int arg5, int arg6, byte[] arg7, int arg8, int arg9, int arg10) {
        field2687++;
        int var11 = (arg5 & 0x7) * 8;
        int var12 = (arg8 & 0x7) * 8;
        if (!arg3) {
            for (int var13 = 0; var13 < 8; var13++) {
                for (int var14 = 0; var14 < 8; var14++) {
                    int var15 = arg6 + class111.method844(var13 & 0x7, var14 & 0x7, -113, arg10);
                    int var16 = arg9 + client.method343(arg10, 1000, var14 & 0x7, var13 & 0x7);
                    if (var15 > 0 && var15 < 103 && var16 > 0 && var16 < 103) {
                        arg1[arg2].field266[var15][var16] = class343.method2418(arg1[arg2].field266[var15][var16], -2097153);
                    }
                }
            }
        }
        class227 var17 = new class227(arg7);
        int var18 = (arg8 & 0xFFFFFFF8) << 3;
        byte var19;
        if (arg3) {
            var19 = 1;
        } else {
            var19 = 4;
        }
        int var20 = arg5 & 0x1FFFFFF8 << 3;
        byte var21 = 0;
        byte var22 = 0;
        if (arg10 == 1) {
            var21 = 1;
        } else if (arg10 == 2) {
            var21 = 1;
            var22 = 1;
        } else if (arg10 == 3) {
            var22 = 1;
        }
        for (int var23 = 0; var23 < var19; var23++) {
            for (int var24 = 0; var24 < 64; var24++) {
                for (int var25 = 0; var25 < 64; var25++) {
                    if (arg0 != var23 || var12 > var24 || var24 > var12 + 8 || var11 > var25 || var25 > (var11 + 8)) {
                        class318.method2250(0, 0, arg3, -1, -1, 0, 0, var17, false, 0, 3, 0);
                    } else if (var12 + 8 == var24 || var11 + 8 == var25) {
                        int var32;
                        int var33;
                        if (arg10 == 0) {
                            var33 = arg6 + var24 - var12;
                            var32 = arg9 + var25 - var11;
                        } else if (arg10 == 1) {
                            var32 = arg9 + var12 + 8 - var24;
                            var33 = arg6 - (var11 - var25);
                        } else if (arg10 == 2) {
                            var32 = arg9 + var11 + 8 - var25;
                            var33 = arg6 + 8 - (-var12 + var24);
                        } else {
                            var33 = var11 + arg6 + 8 - var25;
                            var32 = var24 - (var12 - arg9);
                        }
                        class318.method2250(arg2, 0, arg3, var32, var33, var20 + var25, var18 + var24, var17, true, 0, 3, 0);
                    } else {
                        int var26 = class111.method844(var24 & 0x7, var25 & 0x7, -122, arg10) + arg6;
                        int var27 = arg9 + client.method343(arg10, 1000, var25 & 0x7, var24 & 0x7);
                        class318.method2250(arg2, var21, arg3, var27, var26, var20 + var25, var18 + var24, var17, false, arg10, 3, var22);
                        if (var24 == 63 || var25 == 63) {
                            int var28 = var24 == 63 ? 64 : var24;
                            int var29 = var25 == 63 ? 64 : var25;
                            int var30;
                            int var31;
                            if (arg10 == 0) {
                                var30 = arg6 + var28 - var12;
                                var31 = var29 - (var11 - arg9);
                            } else if (arg10 == 1) {
                                var31 = var12 - (var28 - arg9 - 8);
                                var30 = var29 + arg6 - var11;
                            } else if (arg10 == 2) {
                                var31 = var11 + arg9 + 8 - var29;
                                var30 = var12 + arg6 + 8 - var28;
                            } else {
                                var31 = arg9 + var28 - var12;
                                var30 = arg6 + 8 - (-var11 + var29);
                            }
                            if (var30 >= 0 && var30 < 104 && var31 >= 0 && var31 < 104) {
                                class101.field1656[arg2][var30][var31] = class101.field1656[arg2][var22 + var26][var21 + var27];
                            }
                        }
                    }
                }
            }
        }
        boolean var34 = false;
        boolean var35 = false;
        if (arg4 >= 0) {
            return (int[]) null;
        }
        while (var17.field3793.length > var17.field3760) {
            int var36 = var17.method1720((byte) -64);
            if (var36 == 128) {
                class11.field88[0] = var17.method1765(true);
                var34 = true;
                class11.field88[1] = var17.method1769(-30726);
                class11.field88[2] = var17.method1769(-30726);
                class11.field88[3] = var17.method1769(-30726);
                class11.field88[4] = var17.method1765(true);
            } else {
                if (var36 != 129) {
                    var17.field3760--;
                    break;
                }
                for (int var37 = 0; var37 < 4; var37++) {
                    byte var38 = var17.method1733(0);
                    if (var38 == 0) {
                        if (var37 <= arg0) {
                            int var39 = arg9;
                            int var40 = arg6;
                            if (arg6 < 0) {
                                var40 = 0;
                            } else if (arg6 >= 104) {
                                var40 = 104;
                            }
                            int var41 = arg6 + 7;
                            if (var41 < 0) {
                                var41 = 0;
                            } else if (var41 >= 104) {
                                var41 = 104;
                            }
                            if (arg9 < 0) {
                                var39 = 0;
                            } else if (arg9 >= 104) {
                                var39 = 104;
                            }
                            int var42 = arg9 + 7;
                            if (var42 < 0) {
                                var42 = 0;
                            } else if (var42 >= 104) {
                                var42 = 104;
                            }
                            while (var41 > var40) {
                                while (var39 < var42) {
                                    class187.field2999[arg2][var40][var39] = 0;
                                    var39++;
                                }
                                var40++;
                            }
                        }
                    } else if (var38 == 1) {
                        for (int var43 = 0; var43 < 64; var43 += 4) {
                            for (int var44 = 0; var44 < 64; var44 += 4) {
                                byte var45 = var17.method1733(0);
                                if (var37 <= arg0) {
                                    for (int var46 = var43; var46 < (var43 + 4); var46++) {
                                        for (int var47 = var44; var47 < (var44 + 4); var47++) {
                                            if (var46 >= var12 && var46 < (var12 + 8) && var47 >= var11 && var11 + 8 > var11) {
                                                int var48 = class111.method844(var46 & 0x7, var47 & 0x7, 25, arg10) + arg6;
                                                int var49 = client.method343(arg10, 1000, var47 & 0x7, var46 & 0x7) + arg9;
                                                if (var48 >= 0 && var48 < 104 && var49 >= 0 && var49 < 104) {
                                                    class187.field2999[arg2][var48][var49] = var45;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else if (var38 == 2) {
                    }
                }
            }
        }
        if (class42.field607 && !arg3) {
            class179 var50 = null;
            label297: while (true) {
                int var52;
                label290: do {
                    while (true) {
                        while (var17.field3793.length > var17.field3760) {
                            int var51 = var17.method1720((byte) -80);
                            if (var51 == 0) {
                                var50 = new class179(var17);
                            } else {
                                if (var51 == 1) {
                                    var52 = var17.method1720((byte) -61);
                                    continue label290;
                                }
                                if (var51 != 2) {
                                    throw new IllegalStateException();
                                }
                                if (var50 == null) {
                                    var50 = new class179();
                                }
                                var50.method1411(true, var17);
                            }
                        }
                        if (var50 == null) {
                            var50 = new class179();
                        }
                        class235.field3904[arg6 >> 3][arg9 >> 3] = var50;
                        break label297;
                    }
                } while (var52 <= 0);
                for (int var53 = 0; var53 < var52; var53++) {
                    class314 var54 = new class314(var17);
                    if (var54.field4987 == 31) {
                        class318 var55 = class63.method550(10864, var17.method1765(true));
                        var54.method2225(var55.field5069, var55.field5073, var55.field5074, var55.field5068, 118);
                    }
                    int var56 = var54.field5008 >> 7;
                    int var57 = var54.field4999 >> 7;
                    if (var54.field5007 == arg0 && var56 >= var12 && var56 < (var12 + 8) && var11 <= var57 && (var11 + 8) > var57) {
                        int var58 = class324.method2286(var54.field4999 & 0x3FF, var54.field5008 & 0x3FF, -27072, arg10) + (arg6 << 7);
                        int var59 = class319.method2256(var54.field4999 & 0x3FF, arg10, var54.field5008 & 0x3FF, true) + (arg9 << 7);
                        var54.field4999 = var59;
                        int var60 = var54.field4999 >> 7;
                        var54.field5008 = var58;
                        int var61 = var54.field5008 >> 7;
                        if (var61 >= 0 && var60 >= 0 && var61 < 104 && var60 < 104) {
                            var54.field5015 = (class178.field2856[1][var61][var60] & 0x2) != 0;
                            var54.field5002 = class101.field1656[var54.field5007][var61][var60] - var54.field5002;
                            class30.method209(var54);
                        }
                    }
                }
            }
        }
        if (!var35) {
            int var62 = arg6 + 7;
            int var63 = arg9 + 7;
            for (int var64 = arg6; var64 < var62; var64++) {
                for (int var65 = arg9; var65 < var63; var65++) {
                    class187.field2999[arg2][var64][var65] = 0;
                }
            }
        }
        return var34 ? class11.field88 : null;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(B)V", line = 502)
    public static final void method1312(byte arg0) {
        field2676.method2326(arg0 - 62);
        class59.field1010.method2326(-4);
        if (arg0 == 58) {
            field2683++;
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(JILkh;)V", line = 523)
    public final void method1313(long arg0, int arg1, class172 arg2) {
        field2682++;
        if (arg2.field2749 != null) {
            arg2.method1352(-101);
        }
        class172 var5 = this.field2684[(int) (arg0 & (long) (this.field2690 - 1))];
        arg2.field2754 = arg0;
        arg2.field2749 = var5.field2749;
        arg2.field2746 = var5;
        arg2.field2749.field2746 = arg2;
        if (arg1 != -19527) {
            this.field2690 = -13;
        }
        arg2.field2746.field2749 = arg2;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(Lth;Lth;ILth;)V", line = 546)
    public static final void method1314(class57 arg0, class57 arg1, int arg2, class57 arg3) {
        class166.field2652 = arg3;
        class358.field5675 = arg0;
        if (arg2 != 2) {
            method1316(0, -57, -90);
        }
        class50.field791 = arg1;
        field2681++;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(II)Lmf;", line = 560)
    public static final class213 method1315(int arg0, int arg1) {
        if (arg1 <= 56) {
            method1317((byte) 121, (Frame) null, (class145) null);
        }
        field2678++;
        class213 var2 = (class213) class129.field2187.method2329((byte) 107, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class70.field1229.method472(arg0, 30, 36);
        class213 var4 = new class213();
        var4.field3391 = arg0;
        if (var3 != null) {
            var4.method1614(new class227(var3), 120);
        }
        class129.field2187.method2333((long) arg0, 0, var4);
        return var4;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(III)I", line = 584)
    public static final int method1316(int arg0, int arg1, int arg2) {
        field2689++;
        if (arg1 != -1423101567) {
            field2692 = -53;
        }
        int var3 = 0;
        while (arg0 > 0) {
            arg0--;
            var3 = var3 << 1 | arg2 & 0x1;
            arg2 >>>= 0x1;
        }
        return var3;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(BLjava/awt/Frame;Lna;)V", line = 610)
    public static final void method1317(byte arg0, Frame arg1, class145 arg2) {
        while (true) {
            class192 var3 = arg2.method1128(arg1, (byte) 113);
            while (var3.field3064 == 0) {
                class283.method2076((byte) -109, 10L);
            }
            if (var3.field3064 == 1) {
                arg1.setVisible(false);
                if (arg0 != -7) {
                    method1312((byte) 85);
                }
                arg1.dispose();
                field2677++;
                return;
            }
            class283.method2076((byte) 45, 100L);
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(I)Lkh;", line = 637)
    public final class172 method1318(int arg0) {
        field2680++;
        if (this.field2679 == null) {
            return null;
        } else if (arg0 <= 17) {
            return (class172) null;
        } else {
            class172 var2 = this.field2684[(int) ((long) (this.field2690 - 1) & this.field2685)];
            while (this.field2679 != var2) {
                if (this.field2679.field2754 == this.field2685) {
                    class172 var3 = this.field2679;
                    this.field2679 = this.field2679.field2746;
                    return var3;
                }
                this.field2679 = this.field2679.field2746;
            }
            this.field2679 = null;
            return null;
        }
    }

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "(I)V", line = 668)
    public static void method1319(int arg0) {
        field2693 = null;
        field2676 = null;
        field2691 = null;
        if (arg0 >= -13) {
            method1311(-59, (class22[]) null, -78, false, (byte) -87, 68, -74, (byte[]) null, -10, 61, -125);
        }
    }

    @OriginalMember(owner = "client!mk", name = "<init>", descriptor = "(I)V", line = 686)
    public class169(int arg0) {
        this.field2684 = new class172[arg0];
        this.field2690 = arg0;
        for (int var2 = 0; var2 < arg0; var2++) {
            class172 var3 = this.field2684[var2] = new class172();
            var3.field2746 = var3;
            var3.field2749 = var3;
        }
    }
}
