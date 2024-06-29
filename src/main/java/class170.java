import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public abstract class class170 extends class287 {

    @OriginalMember(owner = "client!tj", name = "E", descriptor = "[Ltj;")
    public class170[] field2969;

    @OriginalMember(owner = "client!tj", name = "F", descriptor = "Z")
    public boolean field2970;

    @OriginalMember(owner = "client!tj", name = "w", descriptor = "Z")
    public static boolean field2961 = false;

    @OriginalMember(owner = "client!tj", name = "y", descriptor = "Lmh;")
    public static class128 field2963 = class22.method156(122, "<)4col> x");

    @OriginalMember(owner = "client!tj", name = "D", descriptor = "I")
    public static int field2968 = 0;

    @OriginalMember(owner = "client!tj", name = "s", descriptor = "Lmh;")
    public static class128 field2957 = class22.method156(124, "_");

    @OriginalMember(owner = "client!tj", name = "r", descriptor = "I")
    public static int field2956;

    @OriginalMember(owner = "client!tj", name = "t", descriptor = "I")
    public static int field2958;

    @OriginalMember(owner = "client!tj", name = "u", descriptor = "I")
    public static int field2959;

    @OriginalMember(owner = "client!tj", name = "v", descriptor = "I")
    public static int field2960;

    @OriginalMember(owner = "client!tj", name = "x", descriptor = "I")
    public static int field2962;

    @OriginalMember(owner = "client!tj", name = "z", descriptor = "I")
    public static int field2964;

    @OriginalMember(owner = "client!tj", name = "A", descriptor = "I")
    public static int field2965;

    @OriginalMember(owner = "client!tj", name = "B", descriptor = "I")
    public int field2966;

    @OriginalMember(owner = "client!tj", name = "C", descriptor = "I")
    public static int field2967;

    @OriginalMember(owner = "client!tj", name = "G", descriptor = "I")
    public static int field2971;

    @OriginalMember(owner = "client!tj", name = "H", descriptor = "I")
    public static int field2972;

    @OriginalMember(owner = "client!tj", name = "I", descriptor = "I")
    public static int field2973;

    @OriginalMember(owner = "client!tj", name = "J", descriptor = "I")
    public static int field2974;

    @OriginalMember(owner = "client!tj", name = "K", descriptor = "I")
    public static int field2975;

    @OriginalMember(owner = "client!tj", name = "N", descriptor = "I")
    public static int field2978;

    @OriginalMember(owner = "client!tj", name = "P", descriptor = "I")
    public static int field2980;

    @OriginalMember(owner = "client!tj", name = "Q", descriptor = "I")
    public static int field2981;

    @OriginalMember(owner = "client!tj", name = "L", descriptor = "Lkj;")
    public class167 field2976;

    @OriginalMember(owner = "client!tj", name = "M", descriptor = "Lbh;")
    public class262 field2977;

    @OriginalMember(owner = "client!tj", name = "O", descriptor = "[I")
    public static int[] field2979;

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(III)V", line = 11)
    public final void method1135(int arg0, int arg1, int arg2) {
        int var4 = this.field2966 == 255 ? arg2 : this.field2966;
        if (this.field2970) {
            this.field2977 = new class262(var4, arg2, arg0);
        } else {
            this.field2976 = new class167(var4, arg2, arg0);
        }
        field2980++;
        if (arg1 != 0) {
            field2968 = 125;
        }
    }

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "(I)V", line = 32)
    public static void method1136(int arg0) {
        if (arg0 != 12671) {
            method1137(-24, (byte) -22, -52);
        }
        field2963 = null;
        field2957 = null;
        field2979 = null;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(IBI)I", line = 49)
    public static final int method1137(int arg0, byte arg1, int arg2) {
        if (arg1 != 8) {
            return 90;
        }
        field2971++;
        int var3 = class27.method175(-116, arg0 - 1, arg2 + -1) - (-class27.method175(arg1 - 68, arg0 + 1, arg2 - 1) + (-class27.method175(arg1 ^ 0xFFFFFFC6, arg0 - 1, arg2 + 1) - class27.method175(-58, arg0 + 1, arg2 + 1)));
        int var4 = class27.method175(-49, arg0 - 1, arg2) + class27.method175(arg1 - 85, arg0 + 1, arg2) + (class27.method175(-107, arg0, arg2 - 1) - -class27.method175(-84, arg0, arg2 + 1));
        int var5 = class27.method175(-64, arg0, arg2);
        return var3 / 16 + (var4 / 8 + (var5 / 4));
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(II)[[I", line = 76)
    public int[][] method62(int arg0, int arg1) {
        int var3 = -43 % ((-arg1 - 24) / 46);
        field2975++;
        throw new IllegalStateException("This operation does not have a colour output");
    }

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "(B)V", line = 93)
    public void method417(byte arg0) {
        if (this.field2970) {
            this.field2977.method1842(true);
            this.field2977 = null;
        } else {
            this.field2976.method1099(-92);
            this.field2976 = null;
        }
        if (arg0 != -124) {
            field2968 = 55;
        }
        field2956++;
    }

    @OriginalMember(owner = "client!tj", name = "c", descriptor = "(I)V", line = 118)
    public void method267(int arg0) {
        if (arg0 != -2718) {
            this.field2970 = true;
        }
        field2959++;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(IIIIIIIII)V", line = 132)
    public static final void method1138(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        for (int var9 = 0; var9 < class144.field2465.field1047; var9++) {
            int var10 = class144.field2465.field1044[var9] - class212.field3754;
            int var11 = class155.field2671 + class39.field836 - class144.field2465.field1043[var9] - 1;
            int var12 = (var10 - arg6) * (arg7 - arg8) / (arg2 - arg6) + arg8;
            int var13 = arg5 + ((arg3 - arg5) * (var11 - arg1) / (arg0 - arg1));
            class174 var14 = null;
            int var15 = 16777215;
            int var16 = class144.field2465.method365(13808, var9);
            if (var16 == 0) {
                if ((double) class143.field2438 == 3.0D) {
                    var14 = class222.field3902;
                }
                if ((double) class143.field2438 == 4.0D) {
                    var14 = class27.field588;
                }
                if ((double) class143.field2438 == 6.0D) {
                    var14 = class261.field4519;
                }
                if ((double) class143.field2438 == 8.0D) {
                    var14 = class164.field2827;
                }
            }
            if (var16 == 1) {
                if ((double) class143.field2438 == 3.0D) {
                    var14 = class261.field4519;
                }
                if ((double) class143.field2438 == 4.0D) {
                    var14 = class164.field2827;
                }
                if ((double) class143.field2438 == 6.0D) {
                    var14 = class70.field1312;
                }
                if ((double) class143.field2438 == 8.0D) {
                    var14 = class115.field1940;
                }
            }
            if (var16 == 2) {
                if ((double) class143.field2438 == 3.0D) {
                    var14 = class70.field1312;
                }
                if ((double) class143.field2438 == 4.0D) {
                    var14 = class115.field1940;
                }
                var15 = 16755200;
                if ((double) class143.field2438 == 6.0D) {
                    var14 = class225.field3928;
                }
                if ((double) class143.field2438 == 8.0D) {
                    var14 = class171.field2994;
                }
            }
            if (class144.field2465.field1040[var9] != -1) {
                var15 = class144.field2465.field1040[var9];
            }
            if (var14 != null) {
                class128[] var17 = new class128[class144.field2465.field1049[var9].method854(60, (byte) -49) + 1];
                class34.field724.method2064(class144.field2465.field1049[var9], (int[]) null, var17);
                int var18 = var17.length;
                int var19 = var13 - (var18 - 1) * var14.method1198() / 2;
                int var20 = var19 + var14.method1202() / 2;
                for (int var21 = 0; var21 < var18; var21++) {
                    class128 var22 = (var18 - 1) == var21 ? var17[var21] : var17[var21].method848(0, 118, var17[var21].method865((byte) 64) - 4);
                    var14.method1201(var22, var12, var20, var15, true);
                    var20 += var14.method1198();
                }
            }
        }
        field2964++;
        if (arg4 != 1) {
            method1138(106, 15, 61, -6, -104, 16, 97, 26, 3);
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(ILbg;B)V", line = 247)
    public void method63(int arg0, class194 arg1, byte arg2) {
        field2958++;
        if (arg2 != 13) {
            method1138(-67, 104, 1, -60, 35, -1, 34, -32, -64);
        }
    }

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "(III)[[I", line = 261)
    public final int[][] method1139(int arg0, int arg1, int arg2) {
        if (arg0 != 0) {
            this.field2970 = false;
        }
        field2981++;
        if (!this.field2969[arg2].field2970) {
            return this.field2969[arg2].method62(arg1, -116);
        }
        int[][] var4 = new int[3][];
        int[] var5 = this.field2969[arg2].method69((byte) 85, arg1);
        var4[2] = var5;
        var4[0] = var5;
        var4[1] = var5;
        return var4;
    }

    @OriginalMember(owner = "client!tj", name = "c", descriptor = "(B)I", line = 299)
    public int method420(byte arg0) {
        if (arg0 != -19) {
            method1137(106, (byte) 118, 53);
        }
        field2962++;
        return -1;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(BI)[I", line = 318)
    public int[] method69(byte arg0, int arg1) {
        if (arg0 != 85) {
            this.field2976 = (class167) null;
        }
        field2973++;
        throw new IllegalStateException("This operation does not have a monochrome output");
    }

    @OriginalMember(owner = "client!tj", name = "d", descriptor = "(B)I", line = 341)
    public int method1140(byte arg0) {
        if (arg0 != -32) {
            this.method417((byte) 65);
        }
        field2960++;
        return -1;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(IIB[B)Z", line = 356)
    public static final boolean method1141(int arg0, int arg1, byte arg2, byte[] arg3) {
        field2967++;
        boolean var4 = true;
        if (arg2 >= -3) {
            method1137(26, (byte) -89, -60);
        }
        class194 var5 = new class194(arg3);
        int var6 = -1;
        label60: while (true) {
            int var7 = var5.method1341(7420);
            if (var7 == 0) {
                return var4;
            }
            int var8 = 0;
            var6 += var7;
            boolean var9 = false;
            while (true) {
                while (!var9) {
                    int var11 = var5.method1345((byte) 32);
                    if (var11 == 0) {
                        continue label60;
                    }
                    int var12 = var5.method1325(7627) >> 2;
                    var8 += var11 - 1;
                    int var13 = var8 & 0x3F;
                    int var14 = var8 >> 6 & 0x3F;
                    int var15 = arg1 + var14;
                    int var16 = arg0 + var13;
                    if (var15 > 0 && var16 > 0 && var15 < 103 && var16 < 103) {
                        class38 var17 = class239.method1629((byte) -60, var6);
                        if (var12 != 22 || class228.field3968 || var17.field795 != 0 || var17.field813 == 1 || var17.field775) {
                            if (!var17.method264(true)) {
                                var4 = false;
                                class121.field2046++;
                            }
                            var9 = true;
                        }
                    }
                }
                int var10 = var5.method1345((byte) 99);
                if (var10 == 0) {
                    break;
                }
                var5.method1325(7627);
            }
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(BII)[I", line = 441)
    public final int[] method1142(byte arg0, int arg1, int arg2) {
        field2974++;
        if (arg0 != 44) {
            this.method1142((byte) -89, -8, -27);
        }
        return this.field2969[arg1].field2970 ? this.field2969[arg1].method69((byte) 85, arg2) : this.field2969[arg1].method62(arg2, 27)[0];
    }

    @OriginalMember(owner = "client!tj", name = "<init>", descriptor = "(IZ)V", line = 461)
    public class170(int arg0, boolean arg1) {
        this.field2969 = new class170[arg0];
        this.field2970 = arg1;
    }
}
