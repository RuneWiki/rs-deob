import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kca")
public abstract class class84 implements class572 {

    @OriginalMember(owner = "client!kca", name = "m", descriptor = "Lcg;")
    private class140 field1151 = class223.field2980;

    @OriginalMember(owner = "client!kca", name = "w", descriptor = "Let;")
    public class596 field1161;

    @OriginalMember(owner = "client!kca", name = "u", descriptor = "Ltk;")
    public class347 field1159;

    @OriginalMember(owner = "client!kca", name = "r", descriptor = "I")
    private int field1156;

    @OriginalMember(owner = "client!kca", name = "c", descriptor = "I")
    public int field1141;

    @OriginalMember(owner = "client!kca", name = "d", descriptor = "Lwha;")
    public class285 field1142;

    @OriginalMember(owner = "client!kca", name = "i", descriptor = "Z")
    private boolean field1147;

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "I")
    private int field1139;

    @OriginalMember(owner = "client!kca", name = "p", descriptor = "Lkg;")
    public static class275 field1154 = new class275(10, -2);

    @OriginalMember(owner = "client!kca", name = "x", descriptor = "Lbp;")
    public static class389 field1162 = new class389();

    @OriginalMember(owner = "client!kca", name = "b", descriptor = "I")
    public static int field1140;

    @OriginalMember(owner = "client!kca", name = "e", descriptor = "I")
    public static int field1143;

    @OriginalMember(owner = "client!kca", name = "f", descriptor = "I")
    public static int field1144;

    @OriginalMember(owner = "client!kca", name = "h", descriptor = "I")
    public static int field1146;

    @OriginalMember(owner = "client!kca", name = "j", descriptor = "I")
    public static int field1148;

    @OriginalMember(owner = "client!kca", name = "k", descriptor = "I")
    public static int field1149;

    @OriginalMember(owner = "client!kca", name = "l", descriptor = "I")
    public static int field1150;

    @OriginalMember(owner = "client!kca", name = "n", descriptor = "I")
    public static int field1152;

    @OriginalMember(owner = "client!kca", name = "o", descriptor = "I")
    public static int field1153;

    @OriginalMember(owner = "client!kca", name = "q", descriptor = "I")
    public static int field1155;

    @OriginalMember(owner = "client!kca", name = "s", descriptor = "I")
    public static int field1157;

    @OriginalMember(owner = "client!kca", name = "t", descriptor = "I")
    public static int field1158;

    @OriginalMember(owner = "client!kca", name = "v", descriptor = "I")
    public static int field1160;

    @OriginalMember(owner = "client!kca", name = "g", descriptor = "[Liea;")
    public static class481[] field1145;

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "(ILcg;)V", line = 3)
    public final void method694(int arg0, class140 arg1) {
        if (arg0 != -21167) {
            return;
        }
        if (this.field1151 != arg1) {
            this.field1151 = arg1;
            this.method700(arg0 + 54160);
        }
        field1150++;
    }

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "(III[II)V", line = 22)
    public final void method695(int arg0, int arg1, int arg2, int[] arg3, int arg4) {
        field1140++;
        if (arg0 > 0 && !class54.method400(5533, arg0)) {
            throw new IllegalArgumentException("");
        } else if (arg2 > 0 && !class54.method400(5533, arg2)) {
            throw new IllegalArgumentException("");
        } else if (class269.field3396 == this.field1161) {
            int var6 = arg4;
            int var7 = arg2 <= arg0 ? arg2 : arg0;
            int var8 = arg0 >> 1;
            int var9 = arg2 >> 1;
            int[] var10 = arg3;
            int[] var11 = new int[var8 * var9];
            while (true) {
                OpenGL.glTexImage2Di(arg1, var6, this.method702(121), arg0, arg2, 0, 32993, this.field1159.field4487, var10, 0);
                if (var7 <= 1) {
                    return;
                }
                int var12 = 0;
                int var13 = 0;
                int var14 = arg0 + var13;
                int[] var15 = var11;
                for (int var16 = 0; var16 < var9; var16++) {
                    for (int var17 = 0; var17 < var8; var17++) {
                        int var18 = var10[var13++];
                        int var19 = var10[var13++];
                        int var20 = var10[var14++];
                        int var21 = var10[var14++];
                        int var22 = var18 & 0xFF;
                        int var23 = (var18 & 0xFF81) >> 8;
                        int var24 = var18 >> 24 & 0xFF;
                        int var25 = (var18 & 0xFFEC1E) >> 16;
                        int var26 = (var19 >> 24 & 0xFF) + var24;
                        int var27 = (var19 >> 16 & 0xFF) + var25;
                        int var28 = (var19 >> 8 & 0xFF) + var23;
                        int var29 = (var19 & 0xFF) + var22;
                        int var30 = (var20 & 0xFF) + var29;
                        int var31 = (var20 >> 24 & 0xFF) + var26;
                        int var32 = ((var20 & 0xFFE2) >> 8) + var28;
                        int var33 = ((var20 & 0xFF8316) >> 16) + var27;
                        int var34 = (var21 >> 24 & 0xFF) + var31;
                        int var35 = ((var21 & 0xFF24) >> 8) + var32;
                        int var36 = (var21 >> 16 & 0xFF) + var33;
                        int var37 = (var21 & 0xFF) + var30;
                        var11[var12++] = class683.method3840(class702.method3949(255, var37 >> 2), class683.method3840(class702.method3949(65280, var35 << 6), class683.method3840(class702.method3949(var34 << 22, -16777216), class702.method3949(var36 << 14, 16711680))));
                    }
                    var14 += arg0;
                    var13 += arg0;
                }
                var11 = var10;
                arg2 = var9;
                var10 = var15;
                arg0 = var8;
                var7 >>= 0x1;
                var6++;
                var9 >>= 0x1;
                var8 >>= 0x1;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!kca", name = "d", descriptor = "(I)V", line = 130)
    public static final void method696(int arg0) {
        field1152++;
        if (class38.field592 || arg0 > -10) {
            return;
        }
        class151.method1064((byte) 12, class123.field1778);
        if (class665.field9356 != null) {
            class151.method1064((byte) 28, class665.field9356);
        }
        class38.field592 = true;
    }

    @OriginalMember(owner = "client!kca", name = "finalize", descriptor = "()V", line = 154)
    protected final void finalize() throws Throwable {
        field1149++;
        this.method701(true);
        super.finalize();
    }

    @OriginalMember(owner = "client!kca", name = "b", descriptor = "(B)V", line = 166)
    public static void method697(byte arg0) {
        field1154 = null;
        field1162 = null;
        field1145 = null;
        if (arg0 >= -45) {
            method696(24);
        }
    }

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "(II)V", line = 178)
    private final void method698(int arg0, int arg1) {
        field1144++;
        this.field1159.field5576 -= arg1;
        int var3 = 19 / ((arg0 + 5) / 58);
        this.field1159.field5576 += this.method705(1);
    }

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "(BIII[B)V", line = 189)
    public final void method699(byte arg0, int arg1, int arg2, int arg3, byte[] arg4) {
        field1157++;
        if (arg3 > 0 && !class54.method400(5533, arg3)) {
            throw new IllegalArgumentException("");
        } else if (arg2 <= 0 || class54.method400(5533, arg2)) {
            int var6 = this.field1161.field8313;
            int var7 = 0;
            int var8 = arg3 < arg2 ? arg3 : arg2;
            if (arg0 > 6) {
                int var9 = arg3 >> 1;
                int var10 = arg2 >> 1;
                byte[] var11 = arg4;
                byte[] var12 = new byte[var9 * var10 * var6];
                while (true) {
                    OpenGL.glTexImage2Dub(arg1, var7, this.method702(108), arg3, arg2, 0, class705.method3951(this.field1161, 105), 5121, var11, 0);
                    if (var8 <= 1) {
                        return;
                    }
                    int var13 = arg3 * var6;
                    for (int var14 = 0; var14 < var6; var14++) {
                        int var16 = var14;
                        int var17 = var14;
                        int var18 = var13 + var14;
                        for (int var19 = 0; var19 < var10; var19++) {
                            for (int var20 = 0; var20 < var9; var20++) {
                                byte var21 = var11[var17];
                                int var22 = var6 + var17;
                                int var23 = var11[var22] + var21;
                                int var24 = var11[var18] + var23;
                                var17 = var6 + var22;
                                int var25 = var6 + var18;
                                int var26 = var11[var25] + var24;
                                var12[var16] = (byte) (var26 >> 2);
                                var18 = var6 + var25;
                                var16 += var6;
                            }
                            var17 += var13;
                            var18 += var13;
                        }
                    }
                    byte[] var15 = var12;
                    var12 = var11;
                    var11 = var15;
                    arg3 = var9;
                    arg2 = var10;
                    var10 >>= 0x1;
                    var7++;
                    var8 >>= 0x1;
                    var9 >>= 0x1;
                }
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!kca", name = "e", descriptor = "(I)V", line = 291)
    private final void method700(int arg0) {
        this.field1159.method2396(22357, this);
        field1153++;
        if (class223.field2980 == this.field1151) {
            OpenGL.glTexParameteri(this.field1141, 10241, this.field1147 ? 9987 : 9729);
            OpenGL.glTexParameteri(this.field1141, 10240, 9729);
        } else {
            OpenGL.glTexParameteri(this.field1141, 10241, this.field1147 ? 9984 : 9728);
            OpenGL.glTexParameteri(this.field1141, 10240, 9728);
        }
        if (arg0 != 32993) {
            field1162 = null;
        }
    }

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "(Z)V", line = 314)
    private final void method701(boolean arg0) {
        field1158++;
        if (this.field1139 > 0) {
            this.field1159.method2021(9287, this.field1139, this.method705(1));
            this.field1139 = 0;
        }
        if (!arg0) {
            this.method695(52, -84, 120, null, 105);
        }
    }

    @OriginalMember(owner = "client!kca", name = "f", descriptor = "(I)I", line = 331)
    public final int method702(int arg0) {
        field1143++;
        if (class285.field3589 == this.field1142) {
            if (class654.field9096 == this.field1161) {
                return 6407;
            }
            if (class269.field3396 == this.field1161) {
                return 6408;
            }
            if (class522.field7319 == this.field1161) {
                return 6406;
            }
            if (class125.field1794 == this.field1161) {
                return 6409;
            }
            if (class331.field4230 == this.field1161) {
                return 6410;
            }
            if (class299.field3924 == this.field1161) {
                return 6145;
            }
        } else if (class285.field3592 == this.field1142) {
            if (class654.field9096 == this.field1161) {
                return 34843;
            }
            if (class269.field3396 == this.field1161) {
                return 34842;
            }
            if (class522.field7319 == this.field1161) {
                return 34844;
            }
            if (class125.field1794 == this.field1161) {
                return 34846;
            }
            if (class331.field4230 == this.field1161) {
                return 34847;
            }
            if (class299.field3924 == this.field1161) {
                return 6145;
            }
        } else if (class285.field3593 == this.field1142) {
            if (class654.field9096 == this.field1161) {
                return 34837;
            }
            if (class269.field3396 == this.field1161) {
                return 34836;
            }
            if (class522.field7319 == this.field1161) {
                return 34838;
            }
            if (class125.field1794 == this.field1161) {
                return 34840;
            }
            if (class331.field4230 == this.field1161) {
                return 34841;
            }
            if (class299.field3924 == this.field1161) {
                return 6145;
            }
        }
        if (arg0 > 89) {
            throw new IllegalStateException();
        }
        return 95;
    }

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "(B)V", line = 427)
    public final void method703(byte arg0) {
        field1155++;
        int var2 = this.field1159.method2386(4);
        int var3 = this.field1159.field4485[var2];
        if (this.field1141 != var3) {
            if (var3 != 0) {
                OpenGL.glBindTexture(var3, 0);
                OpenGL.glDisable(var3);
            }
            OpenGL.glEnable(this.field1141);
            this.field1159.field4485[var2] = this.field1141;
        }
        OpenGL.glBindTexture(this.field1141, this.field1139);
        if (arg0 < 71) {
            this.method705(14);
        }
    }

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "(IIIIILje;BIIII)Z", line = 458)
    public static final boolean method704(int arg0, int arg1, int arg2, int arg3, int arg4, class405 arg5, byte arg6, int arg7, int arg8, int arg9, int arg10) {
        field1148++;
        int var11 = arg2;
        int var12 = arg4;
        byte var13 = 64;
        byte var14 = 64;
        int var15 = arg2 - var13;
        class161.field2220[var13][var14] = 99;
        int var16 = arg4 - var14;
        class545.field7602[var13][var14] = 0;
        byte var17 = 0;
        int var18 = 0;
        class310.field4086[var17] = arg2;
        byte var10001 = var17;
        int var26 = var17 + 1;
        class142.field2013[var10001] = arg4;
        int[][] var19 = arg5.field5137;
        while (var26 != var18) {
            var11 = class310.field4086[var18];
            var12 = class142.field2013[var18];
            int var20 = var11 - var15;
            int var21 = var12 - var16;
            var18 = var18 + 1 & 0xFFF;
            int var22 = var11 - arg5.field5131;
            int var23 = var12 - arg5.field5122;
            if (arg1 == -4) {
                if (arg9 == var11 && arg10 == var12) {
                    class736.field10234 = var11;
                    class632.field8726 = var12;
                    return true;
                }
            } else if (arg1 == -3) {
                if (class217.method1414(2, var12, arg9, 2, arg7, arg10, (byte) 97, var11, arg0)) {
                    class632.field8726 = var12;
                    class736.field10234 = var11;
                    return true;
                }
            } else if (arg1 == -2) {
                if (arg5.method2256(arg9, (byte) -93, arg10, arg0, var11, 2, arg8, 2, var12, arg7)) {
                    class736.field10234 = var11;
                    class632.field8726 = var12;
                    return true;
                }
            } else if (arg1 == -1) {
                if (arg5.method2259(2, arg8, var12, (byte) 33, arg9, var11, arg7, arg0, arg10)) {
                    class736.field10234 = var11;
                    class632.field8726 = var12;
                    return true;
                }
            } else if (arg1 == 0 || arg1 == 1 || arg1 == 2 || arg1 == 3 || arg1 == 9) {
                if (arg5.method2258(arg10, arg1, 2, arg9, arg3, var11, -1, var12)) {
                    class632.field8726 = var12;
                    class736.field10234 = var11;
                    return true;
                }
            } else if (arg5.method2254(103, arg1, var12, var11, arg9, 2, arg10, arg3)) {
                class632.field8726 = var12;
                class736.field10234 = var11;
                return true;
            }
            int var25 = class545.field7602[var20][var21] + 1;
            if (var20 > 0 && class161.field2220[var20 - 1][var21] == 0 && (var19[var22 - 1][var23] & 0x43A40000) == 0 && (var19[var22 - 1][var23 + 1] & 0x4E240000) == 0) {
                class310.field4086[var26] = var11 - 1;
                class142.field2013[var26] = var12;
                var26 = var26 + 1 & 0xFFF;
                class161.field2220[var20 - 1][var21] = 2;
                class545.field7602[var20 - 1][var21] = var25;
            }
            if (var20 < 126 && class161.field2220[var20 + 1][var21] == 0 && (var19[var22 + 2][var23] & 0x60E40000) == 0 && (var19[var22 + 2][var23 + 1] & 0x78240000) == 0) {
                class310.field4086[var26] = var11 + 1;
                class142.field2013[var26] = var12;
                var26 = var26 + 1 & 0xFFF;
                class161.field2220[var20 + 1][var21] = 8;
                class545.field7602[var20 + 1][var21] = var25;
            }
            if (var21 > 0 && class161.field2220[var20][var21 - 1] == 0 && (var19[var22][var23 - 1] & 0x43A40000) == 0 && (var19[var22 + 1][var23 - 1] & 0x60E40000) == 0) {
                class310.field4086[var26] = var11;
                class142.field2013[var26] = var12 - 1;
                class161.field2220[var20][var21 - 1] = 1;
                var26 = var26 + 1 & 0xFFF;
                class545.field7602[var20][var21 - 1] = var25;
            }
            if (var21 < 126 && class161.field2220[var20][var21 + 1] == 0 && (var19[var22][var23 + 2] & 0x4E240000) == 0 && (var19[var22 + 1][var23 + 2] & 0x78240000) == 0) {
                class310.field4086[var26] = var11;
                class142.field2013[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class161.field2220[var20][var21 + 1] = 4;
                class545.field7602[var20][var21 + 1] = var25;
            }
            if (var20 > 0 && var21 > 0 && class161.field2220[var20 - 1][var21 - 1] == 0 && (var19[var22 - 1][var23] & 0x4FA40000) == 0 && (var19[var22 - 1][var23 - 1] & 0x43A40000) == 0 && (var19[var22][var23 - 1] & 0x63E40000) == 0) {
                class310.field4086[var26] = var11 - 1;
                class142.field2013[var26] = var12 - 1;
                var26 = var26 + 1 & 0xFFF;
                class161.field2220[var20 - 1][var21 - 1] = 3;
                class545.field7602[var20 - 1][var21 - 1] = var25;
            }
            if (var20 < 126 && var21 > 0 && class161.field2220[var20 + 1][var21 - 1] == 0 && (var19[var22 + 1][var23 - 1] & 0x63E40000) == 0 && (var19[var22 + 2][var23 - 1] & 0x60E40000) == 0 && (var19[var22 + 2][var23] & 0x78E40000) == 0) {
                class310.field4086[var26] = var11 + 1;
                class142.field2013[var26] = var12 - 1;
                class161.field2220[var20 + 1][var21 - 1] = 9;
                var26 = var26 + 1 & 0xFFF;
                class545.field7602[var20 + 1][var21 - 1] = var25;
            }
            if (var20 > 0 && var21 < 126 && class161.field2220[var20 - 1][var21 + 1] == 0 && (var19[var22 - 1][var23 + 1] & 0x4FA40000) == 0 && (var19[var22 - 1][var23 + 2] & 0x4E240000) == 0 && (var19[var22][var23 + 2] & 0x7E240000) == 0) {
                class310.field4086[var26] = var11 - 1;
                class142.field2013[var26] = var12 + 1;
                class161.field2220[var20 - 1][var21 + 1] = 6;
                var26 = var26 + 1 & 0xFFF;
                class545.field7602[var20 - 1][var21 + 1] = var25;
            }
            if (var20 < 126 && var21 < 126 && class161.field2220[var20 + 1][var21 + 1] == 0 && (var19[var22 + 1][var23 + 2] & 0x7E240000) == 0 && (var19[var22 + 2][var23 + 2] & 0x78240000) == 0 && (var19[var22 + 2][var23 + 1] & 0x78E40000) == 0) {
                class310.field4086[var26] = var11 + 1;
                class142.field2013[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class161.field2220[var20 + 1][var21 + 1] = 12;
                class545.field7602[var20 + 1][var21 + 1] = var25;
            }
        }
        class632.field8726 = var12;
        if (arg6 != -100) {
            method697((byte) 69);
        }
        class736.field10234 = var11;
        return false;
    }

    @OriginalMember(owner = "client!kca", name = "g", descriptor = "(I)I", line = 818)
    private final int method705(int arg0) {
        field1146++;
        if (arg0 != 1) {
            this.method699((byte) -11, -1, 72, -93, null);
        }
        int var2 = this.field1161.field8313 * this.field1142.field3586 * this.field1156;
        return this.field1147 ? var2 * 4 / 3 : var2;
    }

    @OriginalMember(owner = "client!kca", name = "<init>", descriptor = "(Ltk;ILet;Lwha;IZ)V", line = 935)
    public class84(class347 arg0, int arg1, class596 arg2, class285 arg3, int arg4, boolean arg5) {
        this.field1161 = arg2;
        this.field1159 = arg0;
        this.field1156 = arg4;
        this.field1141 = arg1;
        this.field1142 = arg3;
        this.field1147 = arg5;
        OpenGL.glGenTextures(1, class168.field2331, 0);
        this.field1139 = class168.field2331[0];
        this.method700(32993);
        this.method698(-97, 0);
    }

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "(II[FII)V", line = 838)
    public final void method706(int arg0, int arg1, float[] arg2, int arg3, int arg4) {
        field1160++;
        if (arg1 > 0 && !class54.method400(5533, arg1)) {
            throw new IllegalArgumentException("");
        } else if (arg4 > 0 && !class54.method400(5533, arg4)) {
            throw new IllegalArgumentException("");
        } else if (arg3 == -1) {
            int var6 = this.field1161.field8313;
            int var7 = 0;
            int var8 = arg1 < arg4 ? arg1 : arg4;
            int var9 = arg1 >> 1;
            int var10 = arg4 >> 1;
            float[] var11 = arg2;
            float[] var12 = new float[var6 * var10 * var9];
            while (true) {
                OpenGL.glTexImage2Df(arg0, var7, this.method702(127), arg1, arg4, 0, class705.method3951(this.field1161, 57), 5126, var11, 0);
                if (var8 <= 1) {
                    return;
                }
                int var13 = arg1 * var6;
                float[] var14 = var12;
                for (int var15 = 0; var15 < var6; var15++) {
                    int var16 = var15;
                    int var17 = var15;
                    int var18 = var15 + var13;
                    for (int var19 = 0; var19 < var10; var19++) {
                        for (int var20 = 0; var20 < var9; var20++) {
                            float var21 = var11[var17];
                            int var22 = var6 + var17;
                            float var23 = var11[var22] + var21;
                            float var24 = var11[var18] + var23;
                            var17 = var6 + var22;
                            int var25 = var6 + var18;
                            float var26 = var11[var25] + var24;
                            var12[var16] = var26 * 0.25F;
                            var18 = var6 + var25;
                            var16 += var6;
                        }
                        var18 += var13;
                        var17 += var13;
                    }
                }
                var12 = var11;
                arg1 = var9;
                arg4 = var10;
                var11 = var14;
                var7++;
                var9 >>= 0x1;
                var10 >>= 0x1;
                var8 >>= 0x1;
            }
        }
    }
}
