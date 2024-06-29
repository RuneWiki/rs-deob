import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class289 {

    @OriginalMember(owner = "client!ge", name = "f", descriptor = "I")
    public static int field4915 = 0;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "I")
    public static int field4910 = 0;

    @OriginalMember(owner = "client!ge", name = "g", descriptor = "Lma;")
    public static class5 field4916 = class12.method119("mapfunction", (byte) 86);

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "I")
    public static int field4911;

    @OriginalMember(owner = "client!ge", name = "d", descriptor = "I")
    public static int field4913;

    @OriginalMember(owner = "client!ge", name = "e", descriptor = "I")
    public static int field4914;

    @OriginalMember(owner = "client!ge", name = "h", descriptor = "I")
    public static int field4917;

    @OriginalMember(owner = "client!ge", name = "i", descriptor = "I")
    public static int field4918;

    @OriginalMember(owner = "client!ge", name = "j", descriptor = "I")
    public static int field4919;

    @OriginalMember(owner = "client!ge", name = "k", descriptor = "I")
    public static int field4920;

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "[[[B")
    public static byte[][][] field4912;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(II)Z", line = 8)
    public static final boolean method1953(int arg0, int arg1) {
        if (arg1 == -49) {
            field4919++;
            return arg0 >= 48 && arg0 <= 57;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(ILec;)V", line = 21)
    public static final void method1954(int arg0, class91 arg1) {
        field4917++;
        if (arg0 != 128) {
            return;
        }
        class150 var2 = (class150) class86.field1298.method1372(false, arg1.field1367.method69(arg0 ^ 0xFFFFFF4F));
        if (var2 == null) {
            return;
        }
        if (var2.field2163 != null) {
            class235.field3889.method277(var2.field2163);
            var2.field2163 = null;
        }
        var2.method1997(-27381);
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IIB[[F[[I[[FLwh;IBIBIIIZ[[F)V", line = 58)
    public static final void method1955(int arg0, int arg1, byte arg2, float[][] arg3, int[][] arg4, float[][] arg5, class56 arg6, int arg7, byte arg8, int arg9, byte arg10, int arg11, int arg12, int arg13, boolean arg14, float[][] arg15) {
        int var16 = (arg0 << 8) + 255;
        int var17 = (arg9 << 8) + 255;
        field4911++;
        int var18 = (arg7 << 8) + 255;
        int[] var19 = null;
        if (arg8 >= -35) {
            field4912 = (byte[][][]) ((byte[][][]) null);
        }
        int var20 = (arg1 << 8) + 255;
        int[] var21 = client.field1759[arg10];
        int[] var22 = new int[var21.length >> 1];
        for (int var23 = 0; var23 < var22.length; var23++) {
            var22[var23] = class297.method2000(arg15, var17, 1, var21[var23 + var23], (int[][]) null, var16, arg4, var21[var23 + var23 + 1], false, var18, arg13, arg6, arg3, arg12, arg5, arg2, 0.0F, var20);
        }
        if (arg14) {
            if (arg10 == 1) {
                var19 = new int[6];
                int var42 = class297.method2000(arg15, var17, 1, 64, (int[][]) null, var16, arg4, 128, true, var18, arg13, arg6, arg3, arg12, arg5, arg2, 0.0F, var20);
                int var43 = class297.method2000(arg15, var17, 1, 128, (int[][]) null, var16, arg4, 64, true, var18, arg13, arg6, arg3, arg12, arg5, arg2, 0.0F, var20);
                var19[2] = var22[2];
                var19[1] = var42;
                var19[0] = var43;
                var19[5] = var22[2];
                var19[3] = var42;
                var19[4] = var22[0];
            } else if (arg10 == 2) {
                var19 = new int[6];
                int var40 = class297.method2000(arg15, var17, 1, 128, (int[][]) null, var16, arg4, 128, true, var18, arg13, arg6, arg3, arg12, arg5, arg2, 0.0F, var20);
                int var41 = class297.method2000(arg15, var17, 1, 64, (int[][]) null, var16, arg4, 0, true, var18, arg13, arg6, arg3, arg12, arg5, arg2, 0.0F, var20);
                var19[2] = var40;
                var19[1] = var41;
                var19[0] = var22[0];
                var19[5] = var22[0];
                var19[3] = var40;
                var19[4] = var22[1];
            } else if (arg10 == 3) {
                var19 = new int[6];
                int var25 = class297.method2000(arg15, var17, 1, 0, (int[][]) null, var16, arg4, 128, true, var18, arg13, arg6, arg3, arg12, arg5, arg2, 0.0F, var20);
                int var26 = class297.method2000(arg15, var17, 1, 64, (int[][]) null, var16, arg4, 0, true, var18, arg13, arg6, arg3, arg12, arg5, arg2, 0.0F, var20);
                var19[3] = var25;
                var19[0] = var22[2];
                var19[4] = var26;
                var19[1] = var22[1];
                var19[2] = var25;
                var19[5] = var22[2];
            } else if (arg10 == 4) {
                var19 = new int[3];
                int var39 = class297.method2000(arg15, var17, 1, 0, (int[][]) null, var16, arg4, 128, true, var18, arg13, arg6, arg3, arg12, arg5, arg2, 0.0F, var20);
                var19[0] = var22[3];
                var19[1] = var39;
                var19[2] = var22[0];
            } else if (arg10 == 5) {
                var19 = new int[3];
                int var38 = class297.method2000(arg15, var17, 1, 128, (int[][]) null, var16, arg4, 128, true, var18, arg13, arg6, arg3, arg12, arg5, arg2, 0.0F, var20);
                var19[1] = var38;
                var19[0] = var22[2];
                var19[2] = var22[3];
            } else if (arg10 == 6) {
                var19 = new int[6];
                int var27 = class297.method2000(arg15, var17, 1, 128, (int[][]) null, var16, arg4, 0, true, var18, arg13, arg6, arg3, arg12, arg5, arg2, 0.0F, var20);
                int var28 = class297.method2000(arg15, var17, 1, 128, (int[][]) null, var16, arg4, 128, true, var18, arg13, arg6, arg3, arg12, arg5, arg2, 0.0F, var20);
                var19[1] = var27;
                var19[0] = var22[3];
                var19[2] = var28;
                var19[4] = var22[0];
                var19[3] = var28;
                var19[5] = var22[3];
            } else if (arg10 == 7) {
                var19 = new int[6];
                int var36 = class297.method2000(arg15, var17, 1, 0, (int[][]) null, var16, arg4, 128, true, var18, arg13, arg6, arg3, arg12, arg5, arg2, 0.0F, var20);
                int var37 = class297.method2000(arg15, var17, 1, 128, (int[][]) null, var16, arg4, 0, true, var18, arg13, arg6, arg3, arg12, arg5, arg2, 0.0F, var20);
                var19[0] = var22[1];
                var19[3] = var36;
                var19[1] = var37;
                var19[5] = var22[1];
                var19[2] = var36;
                var19[4] = var22[2];
            } else if (arg10 == 8) {
                var19 = new int[3];
                int var29 = class297.method2000(arg15, var17, 1, 0, (int[][]) null, var16, arg4, 0, true, var18, arg13, arg6, arg3, arg12, arg5, arg2, 0.0F, var20);
                var19[1] = var29;
                var19[2] = var22[4];
                var19[0] = var22[3];
            } else if (arg10 == 9) {
                var19 = new int[15];
                int var30 = class297.method2000(arg15, var17, 1, 128, (int[][]) null, var16, arg4, 64, true, var18, arg13, arg6, arg3, arg12, arg5, arg2, 0.0F, var20);
                int var31 = class297.method2000(arg15, var17, 1, 96, (int[][]) null, var16, arg4, 32, true, var18, arg13, arg6, arg3, arg12, arg5, arg2, 0.0F, var20);
                int var32 = class297.method2000(arg15, var17, 1, 64, (int[][]) null, var16, arg4, 0, true, var18, arg13, arg6, arg3, arg12, arg5, arg2, 0.0F, var20);
                var19[3] = var31;
                var19[6] = var31;
                var19[5] = var22[3];
                var19[0] = var31;
                var19[2] = var22[4];
                var19[7] = var22[3];
                var19[4] = var22[4];
                var19[12] = var31;
                var19[10] = var22[2];
                var19[1] = var30;
                var19[14] = var32;
                var19[11] = var22[1];
                var19[13] = var22[1];
                var19[9] = var31;
                var19[8] = var22[2];
            } else if (arg10 == 10) {
                var19 = new int[9];
                int var35 = class297.method2000(arg15, var17, 1, 0, (int[][]) null, var16, arg4, 128, true, var18, arg13, arg6, arg3, arg12, arg5, arg2, 0.0F, var20);
                var19[7] = var35;
                var19[4] = var35;
                var19[6] = var22[4];
                var19[1] = var35;
                var19[5] = var22[4];
                var19[0] = var22[2];
                var19[2] = var22[3];
                var19[8] = var22[0];
                var19[3] = var22[3];
            } else if (arg10 == 11) {
                var19 = new int[12];
                int var33 = class297.method2000(arg15, var17, 1, 0, (int[][]) null, var16, arg4, 64, true, var18, arg13, arg6, arg3, arg12, arg5, arg2, 0.0F, var20);
                int var34 = class297.method2000(arg15, var17, 1, 128, (int[][]) null, var16, arg4, 64, true, var18, arg13, arg6, arg3, arg12, arg5, arg2, 0.0F, var20);
                var19[7] = var34;
                var19[1] = var33;
                var19[11] = var34;
                var19[10] = var22[1];
                var19[8] = var33;
                var19[0] = var22[3];
                var19[2] = var22[0];
                var19[9] = var22[2];
                var19[5] = var33;
                var19[6] = var22[2];
                var19[3] = var22[3];
                var19[4] = var22[2];
            }
        }
        arg6.method428(arg11, arg12, arg13, var22, var19, false);
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(I)V", line = 349)
    public static void method1956(int arg0) {
        field4916 = null;
        field4912 = (byte[][][]) null;
        if (arg0 != -29028) {
            field4916 = (class5) null;
        }
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(I)V", line = 360)
    public static final void method1957(int arg0) {
        System.out.println("Usage: worldid, <live/office/local>, <live/rc/wip>, <software/hardware>, <free/members>, <english/german>, <game0/game1> [safemode]");
        System.exit(arg0);
        field4920++;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(ZIIIIIZIIIII)Z", line = 378)
    public static final boolean method1958(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        for (int var12 = 0; var12 < 104; var12++) {
            for (int var13 = 0; var13 < 104; var13++) {
                class165.field2518[var12][var13] = 0;
                class202.field3199[var12][var13] = 99999999;
            }
        }
        if (!arg0) {
            method1953(-56, 125);
        }
        class165.field2518[arg1][arg2] = 99;
        int var14 = arg1;
        field4913++;
        class202.field3199[arg1][arg2] = 0;
        byte var15 = 0;
        class111.field1649[var15] = arg1;
        int var16 = 0;
        int var17 = arg2;
        int var32 = var15 + 1;
        class65.field1021[var15] = arg2;
        boolean var18 = false;
        int[][] var19 = class242.field4031[class276.field4701].field793;
        while (var32 != var16) {
            var14 = class111.field1649[var16];
            var17 = class65.field1021[var16];
            var16 = var16 + 1 & 0xFFF;
            if (arg10 == var14 && arg7 == var17) {
                var18 = true;
                break;
            }
            if (arg11 != 0) {
                if ((arg11 < 5 || arg11 == 10) && class242.field4031[class276.field4701].method384(var17, arg7, arg11 - 1, (byte) 110, arg10, arg8, 2, var14)) {
                    var18 = true;
                    break;
                }
                if (arg11 < 10 && class242.field4031[class276.field4701].method373(arg8, var14, 2, (byte) 58, arg10, arg11 - 1, arg7, var17)) {
                    var18 = true;
                    break;
                }
            }
            if (arg3 != 0 && arg4 != 0 && class242.field4031[class276.field4701].method387(arg3, arg7, 2, arg10, arg4, -123, arg5, var17, var14)) {
                var18 = true;
                break;
            }
            int var20 = class202.field3199[var14][var17] + 1;
            if (var14 > 0 && class165.field2518[var14 - 1][var17] == 0 && (var19[var14 - 1][var17] & 0x12C010E) == 0 && (var19[var14 - 1][var17 + 1] & 0x12C0138) == 0) {
                class111.field1649[var32] = var14 - 1;
                class65.field1021[var32] = var17;
                var32 = var32 + 1 & 0xFFF;
                class165.field2518[var14 - 1][var17] = 2;
                class202.field3199[var14 - 1][var17] = var20;
            }
            if (var14 < 102 && class165.field2518[var14 + 1][var17] == 0 && (var19[var14 + 2][var17] & 0x12C0183) == 0 && (var19[var14 + 2][var17 + 1] & 0x12C01E0) == 0) {
                class111.field1649[var32] = var14 + 1;
                class65.field1021[var32] = var17;
                var32 = var32 + 1 & 0xFFF;
                class165.field2518[var14 + 1][var17] = 8;
                class202.field3199[var14 + 1][var17] = var20;
            }
            if (var17 > 0 && class165.field2518[var14][var17 - 1] == 0 && (var19[var14][var17 - 1] & 0x12C010E) == 0 && (var19[var14 + 1][var17 - 1] & 0x12C0183) == 0) {
                class111.field1649[var32] = var14;
                class65.field1021[var32] = var17 - 1;
                var32 = var32 + 1 & 0xFFF;
                class165.field2518[var14][var17 - 1] = 1;
                class202.field3199[var14][var17 - 1] = var20;
            }
            if (var17 < 102 && class165.field2518[var14][var17 + 1] == 0 && (var19[var14][var17 + 2] & 0x12C0138) == 0 && (var19[var14 + 1][var17 + 2] & 0x12C01E0) == 0) {
                class111.field1649[var32] = var14;
                class65.field1021[var32] = var17 + 1;
                class165.field2518[var14][var17 + 1] = 4;
                var32 = var32 + 1 & 0xFFF;
                class202.field3199[var14][var17 + 1] = var20;
            }
            if (var14 > 0 && var17 > 0 && class165.field2518[var14 - 1][var17 - 1] == 0 && (var19[var14 - 1][var17] & 0x12C0138) == 0 && (var19[var14 - 1][var17 - 1] & 0x12C010E) == 0 && (var19[var14][var17 - 1] & 0x12C0183) == 0) {
                class111.field1649[var32] = var14 - 1;
                class65.field1021[var32] = var17 - 1;
                var32 = var32 + 1 & 0xFFF;
                class165.field2518[var14 - 1][var17 - 1] = 3;
                class202.field3199[var14 - 1][var17 - 1] = var20;
            }
            if (var14 < 102 && var17 > 0 && class165.field2518[var14 + 1][var17 - 1] == 0 && (var19[var14 + 1][var17 - 1] & 0x12C010E) == 0 && (var19[var14 + 2][var17 - 1] & 0x12C0183) == 0 && (var19[var14 + 2][var17] & 0x12C01E0) == 0) {
                class111.field1649[var32] = var14 + 1;
                class65.field1021[var32] = var17 - 1;
                class165.field2518[var14 + 1][var17 - 1] = 9;
                var32 = var32 + 1 & 0xFFF;
                class202.field3199[var14 + 1][var17 - 1] = var20;
            }
            if (var14 > 0 && var17 < 102 && class165.field2518[var14 - 1][var17 + 1] == 0 && (var19[var14 - 1][var17 + 1] & 0x12C010E) == 0 && (var19[var14 - 1][var17 + 2] & 0x12C0138) == 0 && (var19[var14][var17 + 2] & 0x12C01E0) == 0) {
                class111.field1649[var32] = var14 - 1;
                class65.field1021[var32] = var17 + 1;
                var32 = var32 + 1 & 0xFFF;
                class165.field2518[var14 - 1][var17 + 1] = 6;
                class202.field3199[var14 - 1][var17 + 1] = var20;
            }
            if (var14 < 102 && var17 < 102 && class165.field2518[var14 + 1][var17 + 1] == 0 && (var19[var14 + 1][var17 + 2] & 0x12C0138) == 0 && (var19[var14 + 2][var17 + 2] & 0x12C01E0) == 0 && (var19[var14 + 2][var17 + 1] & 0x12C0183) == 0) {
                class111.field1649[var32] = var14 + 1;
                class65.field1021[var32] = var17 + 1;
                class165.field2518[var14 + 1][var17 + 1] = 12;
                class202.field3199[var14 + 1][var17 + 1] = var20;
                var32 = var32 + 1 & 0xFFF;
            }
        }
        class261.field4464 = 0;
        if (!var18) {
            if (!arg6) {
                return false;
            }
            int var21 = 1000;
            int var22 = 100;
            byte var23 = 10;
            for (int var24 = arg10 - var23; var24 <= arg10 + var23; var24++) {
                for (int var25 = arg7 - var23; var25 <= arg7 + var23; var25++) {
                    if (var24 >= 0 && var25 >= 0 && var24 < 104 && var25 < 104 && class202.field3199[var24][var25] < 100) {
                        int var26 = 0;
                        if (var24 < arg10) {
                            var26 = arg10 - var24;
                        } else if (var24 > (arg10 + arg3 - 1)) {
                            var26 = -arg10 - (-var24 - 1) - arg3;
                        }
                        int var27 = 0;
                        if (var25 < arg7) {
                            var27 = arg7 - var25;
                        } else if (arg7 + arg4 - 1 < var25) {
                            var27 = var25 + 1 - (arg7 - -arg4);
                        }
                        int var28 = var26 * var26 + (var27 * var27);
                        if (var28 < var21 || var21 == var28 && class202.field3199[var24][var25] < var22) {
                            var14 = var24;
                            var17 = var25;
                            var22 = class202.field3199[var24][var25];
                            var21 = var28;
                        }
                    }
                }
            }
            if (var21 == 1000) {
                return false;
            }
            if (arg1 == var14 && arg2 == var17) {
                return false;
            }
            class261.field4464 = 1;
        }
        byte var29 = 0;
        class111.field1649[var29] = var14;
        int var33 = var29 + 1;
        class65.field1021[var29] = var17;
        int var30;
        int var31 = var30 = class165.field2518[var14][var17];
        while (arg1 != var14 || arg2 != var17) {
            if (var30 != var31) {
                var30 = var31;
                class111.field1649[var33] = var14;
                class65.field1021[var33++] = var17;
            }
            if ((var31 & 0x1) != 0) {
                var17++;
            } else if ((var31 & 0x4) != 0) {
                var17--;
            }
            if ((var31 & 0x2) != 0) {
                var14++;
            } else if ((var31 & 0x8) != 0) {
                var14--;
            }
            var31 = class165.field2518[var14][var17];
        }
        if (var33 > 0) {
            class250.method1750(!arg0, arg9, var33);
            return true;
        } else if (arg9 == 1) {
            return false;
        } else {
            return true;
        }
    }
}
