import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("GSYZIGPZ")
public class class14 {

    @OriginalMember(owner = "GSYZIGPZ", name = "f", descriptor = "I")
    private int field768 = -184;

    @OriginalMember(owner = "GSYZIGPZ", name = "g", descriptor = "Z")
    private boolean field769 = false;

    @OriginalMember(owner = "GSYZIGPZ", name = "l", descriptor = "I")
    private int field774 = -79;

    @OriginalMember(owner = "GSYZIGPZ", name = "E", descriptor = "I")
    private int field793;

    @OriginalMember(owner = "GSYZIGPZ", name = "F", descriptor = "I")
    private int field794;

    @OriginalMember(owner = "GSYZIGPZ", name = "r", descriptor = "[[[I")
    private int[][][] field780;

    @OriginalMember(owner = "GSYZIGPZ", name = "h", descriptor = "[[[B")
    private byte[][][] field770;

    @OriginalMember(owner = "GSYZIGPZ", name = "n", descriptor = "[[[B")
    private byte[][][] field776;

    @OriginalMember(owner = "GSYZIGPZ", name = "w", descriptor = "[[[B")
    private byte[][][] field785;

    @OriginalMember(owner = "GSYZIGPZ", name = "k", descriptor = "[[[B")
    private byte[][][] field773;

    @OriginalMember(owner = "GSYZIGPZ", name = "c", descriptor = "[[[B")
    private byte[][][] field765;

    @OriginalMember(owner = "GSYZIGPZ", name = "b", descriptor = "[[[I")
    private int[][][] field764;

    @OriginalMember(owner = "GSYZIGPZ", name = "a", descriptor = "[[[B")
    private byte[][][] field763;

    @OriginalMember(owner = "GSYZIGPZ", name = "e", descriptor = "[[I")
    private int[][] field767;

    @OriginalMember(owner = "GSYZIGPZ", name = "x", descriptor = "[I")
    private int[] field786;

    @OriginalMember(owner = "GSYZIGPZ", name = "y", descriptor = "[I")
    private int[] field787;

    @OriginalMember(owner = "GSYZIGPZ", name = "z", descriptor = "[I")
    private int[] field788;

    @OriginalMember(owner = "GSYZIGPZ", name = "A", descriptor = "[I")
    private int[] field789;

    @OriginalMember(owner = "GSYZIGPZ", name = "B", descriptor = "[I")
    private int[] field790;

    @OriginalMember(owner = "GSYZIGPZ", name = "d", descriptor = "Z")
    public static boolean field766 = true;

    @OriginalMember(owner = "GSYZIGPZ", name = "i", descriptor = "[I")
    private static final int[] field771 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "GSYZIGPZ", name = "j", descriptor = "I")
    private static int field772 = -48601;

    @OriginalMember(owner = "GSYZIGPZ", name = "o", descriptor = "I")
    private static int field777 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "GSYZIGPZ", name = "p", descriptor = "[I")
    private static final int[] field778 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "GSYZIGPZ", name = "s", descriptor = "[I")
    private static final int[] field781 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "GSYZIGPZ", name = "t", descriptor = "I")
    private static int field782 = -15455;

    @OriginalMember(owner = "GSYZIGPZ", name = "u", descriptor = "I")
    private static int field783 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "GSYZIGPZ", name = "v", descriptor = "[I")
    private static final int[] field784 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "GSYZIGPZ", name = "D", descriptor = "I")
    public static int field792 = 99;

    @OriginalMember(owner = "GSYZIGPZ", name = "m", descriptor = "I")
    private static int field775;

    @OriginalMember(owner = "GSYZIGPZ", name = "q", descriptor = "I")
    public static int field779;

    @OriginalMember(owner = "GSYZIGPZ", name = "C", descriptor = "Z")
    private static boolean field791;

    @OriginalMember(owner = "GSYZIGPZ", name = "a", descriptor = "(II)I")
    private static final int method227(int arg0, int arg1) {
        int var2 = method246(arg0 - 1, arg1 - 1) + method246(arg0 + 1, arg1 - 1) + method246(arg0 - 1, arg1 + 1) + method246(arg0 + 1, arg1 + 1);
        int var3 = method246(arg0 - 1, arg1) + method246(arg0 + 1, arg1) + method246(arg0, arg1 - 1) + method246(arg0, arg1 + 1);
        int var4 = method246(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @OriginalMember(owner = "GSYZIGPZ", name = "a", descriptor = "(IBIII[LEAREBDMK;[B)V")
    public final void method228(int arg0, byte arg1, int arg2, int arg3, int arg4, class8[] arg5, byte[] arg6) {
        for (int var8 = 0; var8 < 4; var8++) {
            for (int var13 = 0; var13 < 64; var13++) {
                for (int var14 = 0; var14 < 64; var14++) {
                    if (arg2 + var13 > 0 && arg2 + var13 < 103 && arg4 + var14 > 0 && arg4 + var14 < 103) {
                        arg5[var8].field691[arg2 + var13][arg4 + var14] &= 0xFEFFFFFF;
                    }
                }
            }
        }
        class35 var9 = new class35((byte) -103, arg6);
        if (arg1 != 110) {
            return;
        }
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var11 = 0; var11 < 64; var11++) {
                for (int var12 = 0; var12 < 64; var12++) {
                    this.method237(-927, var10, arg4 + var12, arg3, var9, arg0, 0, arg2 + var11);
                }
            }
        }
    }

    @OriginalMember(owner = "GSYZIGPZ", name = "a", descriptor = "(II[B[LEAREBDMK;IIZIII)V")
    public final void method229(int arg0, int arg1, byte[] arg2, class8[] arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9) {
        for (int var11 = 0; var11 < 8; var11++) {
            for (int var16 = 0; var16 < 8; var16++) {
                if (arg4 + var11 > 0 && arg4 + var11 < 103 && arg1 + var16 > 0 && arg1 + var16 < 103) {
                    arg3[arg7].field691[arg4 + var11][arg1 + var16] &= 0xFEFFFFFF;
                }
            }
        }
        class35 var12 = new class35((byte) -103, arg2);
        for (int var13 = 0; var13 < 4; var13++) {
            for (int var14 = 0; var14 < 64; var14++) {
                for (int var15 = 0; var15 < 64; var15++) {
                    if (arg5 == var13 && var14 >= arg0 && var14 < arg0 + 8 && var15 >= arg8 && var15 < arg8 + 8) {
                        this.method237(-927, arg7, arg1 + class50.method501(arg9, var15 & 0x7, var14 & 0x7, -111), 0, var12, 0, arg9, arg4 + class50.method500(var15 & 0x7, arg9, (byte) -27, var14 & 0x7));
                    } else {
                        this.method237(-927, 0, -1, 0, var12, 0, 0, -1);
                    }
                }
            }
        }
        if (arg6) {
            field775 = 227;
        }
    }

    @OriginalMember(owner = "GSYZIGPZ", name = "a", descriptor = "(IZIII)V")
    public final void method230(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        for (int var6 = arg4; var6 <= arg0 + arg4; var6++) {
            for (int var8 = arg2; var8 <= arg2 + arg3; var8++) {
                if (var8 >= 0 && var8 < this.field793 && var6 >= 0 && var6 < this.field794) {
                    this.field763[0][var8][var6] = 127;
                    if (arg2 == var8 && var8 > 0) {
                        this.field780[0][var8][var6] = this.field780[0][var8 - 1][var6];
                    }
                    if (arg2 + arg3 == var8 && var8 < this.field793 - 1) {
                        this.field780[0][var8][var6] = this.field780[0][var8 + 1][var6];
                    }
                    if (arg4 == var6 && var6 > 0) {
                        this.field780[0][var8][var6] = this.field780[0][var8][var6 - 1];
                    }
                    if (arg0 + arg4 == var6 && var6 < this.field794 - 1) {
                        this.field780[0][var8][var6] = this.field780[0][var8][var6 + 1];
                    }
                }
            }
        }
        if (!arg1) {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
    }

    @OriginalMember(owner = "GSYZIGPZ", name = "a", descriptor = "(III)I")
    private static final int method231(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method227(var3, var5);
        int var8 = method227(var3 + 1, var5);
        int var9 = method227(var3, var5 + 1);
        int var10 = method227(var3 + 1, var5 + 1);
        int var11 = method241(var7, var8, var4, arg2);
        int var12 = method241(var9, var10, var4, arg2);
        return method241(var11, var12, var6, arg2);
    }

    @OriginalMember(owner = "GSYZIGPZ", name = "b", descriptor = "(II)I")
    private static final int method232(int arg0, int arg1) {
        int var2 = method231(arg0 + 45365, arg1 + 91923, 4) + (method231(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method231(arg0, arg1, 1) - 128 >> 2) - 128;
        int var3 = (int) ((double) var2 * 0.3D) + 35;
        if (var3 < 10) {
            var3 = 10;
        } else if (var3 > 60) {
            var3 = 60;
        }
        return var3;
    }

    @OriginalMember(owner = "GSYZIGPZ", name = "a", descriptor = "(II[BI)Z")
    public static final boolean method233(int arg0, int arg1, byte[] arg2, int arg3) {
        if (arg3 != 0) {
            field791 = !field791;
        }
        boolean var4 = true;
        class35 var5 = new class35((byte) -103, arg2);
        int var6 = -1;
        label59: while (true) {
            int var7 = var5.method363();
            if (var7 == 0) {
                return var4;
            }
            var6 += var7;
            int var8 = 0;
            boolean var9 = false;
            while (true) {
                while (!var9) {
                    int var11 = var5.method363();
                    if (var11 == 0) {
                        continue label59;
                    }
                    var8 += var11 - 1;
                    int var12 = var8 & 0x3F;
                    int var13 = var8 >> 6 & 0x3F;
                    int var14 = var5.method349() >> 2;
                    int var15 = arg1 + var13;
                    int var16 = arg0 + var12;
                    if (var15 > 0 && var16 > 0 && var15 < 103 && var16 < 103) {
                        class37 var17 = class37.method400(var6);
                        if (var14 != 22 || !field766 || var17.field1163 || var17.field1138) {
                            var4 &= var17.method405((byte) 2);
                            var9 = true;
                        }
                    }
                }
                int var10 = var5.method363();
                if (var10 == 0) {
                    break;
                }
                var5.method349();
            }
        }
    }

    @OriginalMember(owner = "GSYZIGPZ", name = "c", descriptor = "(II)I")
    private static final int method234(int arg0, int arg1) {
        if (arg0 == -1) {
            return 12345678;
        }
        int var2 = (arg0 & 0x7F) * arg1 / 128;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @OriginalMember(owner = "GSYZIGPZ", name = "a", descriptor = "(IIBI)I")
    public int method235(int arg0, int arg1, byte arg2, int arg3) {
        if (arg2 != -81) {
            return field775;
        } else if ((this.field770[arg3][arg1][arg0] & 0x8) == 0) {
            return arg3 <= 0 || (this.field770[1][arg1][arg0] & 0x2) == 0 ? arg3 : arg3 - 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "GSYZIGPZ", name = "a", descriptor = "(LEAREBDMK;LTEXKPKZX;IIIIIIB)V")
    private final void method236(class8 arg0, class49 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte arg8) {
        if (field766 && (this.field770[0][arg2][arg7] & 0x2) == 0) {
            if ((this.field770[arg3][arg2][arg7] & 0x10) != 0) {
                return;
            }
            if (this.method235(arg7, arg2, (byte) -81, arg3) != field779) {
                return;
            }
        }
        if (arg3 < field792) {
            field792 = arg3;
        }
        int var10 = this.field780[arg3][arg2][arg7];
        int var11 = this.field780[arg3][arg2 + 1][arg7];
        int var12 = this.field780[arg3][arg2 + 1][arg7 + 1];
        int var13 = this.field780[arg3][arg2][arg7 + 1];
        int var14 = var10 + var11 + var12 + var13 >> 2;
        class37 var15 = class37.method400(arg6);
        if (arg8 == 8) {
            boolean var16 = false;
        } else {
            this.field769 = !this.field769;
        }
        int var17 = (arg6 << 14) + (arg7 << 7) + arg2 + 1073741824;
        if (!var15.field1163) {
            var17 += Integer.MIN_VALUE;
        }
        byte var18 = (byte) ((arg4 << 6) + arg5);
        if (arg5 == 22) {
            if (!field766 || var15.field1163 || var15.field1138) {
                class66 var19;
                if (var15.field1161 == -1 && var15.field1156 == null) {
                    var19 = var15.method408(22, arg4, var10, var11, var12, var13, -1);
                } else {
                    var19 = new class6(var10, var15.field1161, true, var13, var12, arg4, 22, true, var11, arg6);
                }
                arg1.method455(arg3, var18, var17, arg2, arg7, var19, true, var14);
                if (var15.field1151 && var15.field1163 && arg0 != null) {
                    arg0.method191(119, arg2, arg7);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class66 var39;
            if (var15.field1161 == -1 && var15.field1156 == null) {
                var39 = var15.method408(10, arg4, var10, var11, var12, var13, -1);
            } else {
                var39 = new class6(var10, var15.field1161, true, var13, var12, arg4, 10, true, var11, arg6);
            }
            if (var39 != null) {
                int var40 = 0;
                if (arg5 == 11) {
                    var40 += 256;
                }
                int var41;
                int var42;
                if (arg4 == 1 || arg4 == 3) {
                    var41 = var15.field1168;
                    var42 = var15.field1135;
                } else {
                    var41 = var15.field1135;
                    var42 = var15.field1168;
                }
                if (arg1.method459(var18, var14, var39, var17, arg2, var42, false, var40, arg3, var41, arg7) && var15.field1144) {
                    class4 var43;
                    if (var39 instanceof class4) {
                        var43 = (class4) var39;
                    } else {
                        var43 = var15.method408(10, arg4, var10, var11, var12, var13, -1);
                    }
                    if (var43 != null) {
                        for (int var44 = 0; var44 <= var41; var44++) {
                            for (int var45 = 0; var45 <= var42; var45++) {
                                int var46 = var43.field593 / 4;
                                if (var46 > 30) {
                                    var46 = 30;
                                }
                                if (var46 > this.field763[arg3][arg2 + var44][arg7 + var45]) {
                                    this.field763[arg3][arg2 + var44][arg7 + var45] = (byte) var46;
                                }
                            }
                        }
                    }
                }
            }
            if (var15.field1151 && arg0 != null) {
                arg0.method190(arg7, var15.field1135, arg4, var15.field1168, arg2, 98, var15.field1182);
            }
        } else if (arg5 >= 12) {
            class66 var20;
            if (var15.field1161 == -1 && var15.field1156 == null) {
                var20 = var15.method408(arg5, arg4, var10, var11, var12, var13, -1);
            } else {
                var20 = new class6(var10, var15.field1161, true, var13, var12, arg4, arg5, true, var11, arg6);
            }
            arg1.method459(var18, var14, var20, var17, arg2, 1, false, 0, arg3, 1, arg7);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg3 > 0) {
                this.field764[arg3][arg2][arg7] |= 0x924;
            }
            if (var15.field1151 && arg0 != null) {
                arg0.method190(arg7, var15.field1135, arg4, var15.field1168, arg2, 98, var15.field1182);
            }
        } else if (arg5 == 0) {
            class66 var21;
            if (var15.field1161 == -1 && var15.field1156 == null) {
                var21 = var15.method408(0, arg4, var10, var11, var12, var13, -1);
            } else {
                var21 = new class6(var10, var15.field1161, true, var13, var12, arg4, 0, true, var11, arg6);
            }
            arg1.method457((byte) 118, null, 0, var18, field771[arg4], arg7, var21, arg2, var17, var14, arg3);
            if (arg4 == 0) {
                if (var15.field1144) {
                    this.field763[arg3][arg2][arg7] = 50;
                    this.field763[arg3][arg2][arg7 + 1] = 50;
                }
                if (var15.field1152) {
                    this.field764[arg3][arg2][arg7] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var15.field1144) {
                    this.field763[arg3][arg2][arg7 + 1] = 50;
                    this.field763[arg3][arg2 + 1][arg7 + 1] = 50;
                }
                if (var15.field1152) {
                    this.field764[arg3][arg2][arg7 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var15.field1144) {
                    this.field763[arg3][arg2 + 1][arg7] = 50;
                    this.field763[arg3][arg2 + 1][arg7 + 1] = 50;
                }
                if (var15.field1152) {
                    this.field764[arg3][arg2 + 1][arg7] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var15.field1144) {
                    this.field763[arg3][arg2][arg7] = 50;
                    this.field763[arg3][arg2 + 1][arg7] = 50;
                }
                if (var15.field1152) {
                    this.field764[arg3][arg2][arg7] |= 0x492;
                }
            }
            if (var15.field1151 && arg0 != null) {
                arg0.method189(arg4, arg7, 47214, arg2, var15.field1182, arg5);
            }
            if (var15.field1142 != 16) {
                arg1.method465(var15.field1142, arg7, arg3, -13882, arg2);
            }
        } else if (arg5 == 1) {
            class66 var22;
            if (var15.field1161 == -1 && var15.field1156 == null) {
                var22 = var15.method408(1, arg4, var10, var11, var12, var13, -1);
            } else {
                var22 = new class6(var10, var15.field1161, true, var13, var12, arg4, 1, true, var11, arg6);
            }
            arg1.method457((byte) 118, null, 0, var18, field784[arg4], arg7, var22, arg2, var17, var14, arg3);
            if (var15.field1144) {
                if (arg4 == 0) {
                    this.field763[arg3][arg2][arg7 + 1] = 50;
                } else if (arg4 == 1) {
                    this.field763[arg3][arg2 + 1][arg7 + 1] = 50;
                } else if (arg4 == 2) {
                    this.field763[arg3][arg2 + 1][arg7] = 50;
                } else if (arg4 == 3) {
                    this.field763[arg3][arg2][arg7] = 50;
                }
            }
            if (var15.field1151 && arg0 != null) {
                arg0.method189(arg4, arg7, 47214, arg2, var15.field1182, arg5);
            }
        } else if (arg5 == 2) {
            int var23 = arg4 + 1 & 0x3;
            class66 var24;
            class66 var25;
            if (var15.field1161 == -1 && var15.field1156 == null) {
                var24 = var15.method408(2, arg4 + 4, var10, var11, var12, var13, -1);
                var25 = var15.method408(2, var23, var10, var11, var12, var13, -1);
            } else {
                var24 = new class6(var10, var15.field1161, true, var13, var12, arg4 + 4, 2, true, var11, arg6);
                var25 = new class6(var10, var15.field1161, true, var13, var12, var23, 2, true, var11, arg6);
            }
            arg1.method457((byte) 118, var25, field771[var23], var18, field771[arg4], arg7, var24, arg2, var17, var14, arg3);
            if (var15.field1152) {
                if (arg4 == 0) {
                    this.field764[arg3][arg2][arg7] |= 0x249;
                    this.field764[arg3][arg2][arg7 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    this.field764[arg3][arg2][arg7 + 1] |= 0x492;
                    this.field764[arg3][arg2 + 1][arg7] |= 0x249;
                } else if (arg4 == 2) {
                    this.field764[arg3][arg2 + 1][arg7] |= 0x249;
                    this.field764[arg3][arg2][arg7] |= 0x492;
                } else if (arg4 == 3) {
                    this.field764[arg3][arg2][arg7] |= 0x492;
                    this.field764[arg3][arg2][arg7] |= 0x249;
                }
            }
            if (var15.field1151 && arg0 != null) {
                arg0.method189(arg4, arg7, 47214, arg2, var15.field1182, arg5);
            }
            if (var15.field1142 != 16) {
                arg1.method465(var15.field1142, arg7, arg3, -13882, arg2);
            }
        } else if (arg5 == 3) {
            class66 var26;
            if (var15.field1161 == -1 && var15.field1156 == null) {
                var26 = var15.method408(3, arg4, var10, var11, var12, var13, -1);
            } else {
                var26 = new class6(var10, var15.field1161, true, var13, var12, arg4, 3, true, var11, arg6);
            }
            arg1.method457((byte) 118, null, 0, var18, field784[arg4], arg7, var26, arg2, var17, var14, arg3);
            if (var15.field1144) {
                if (arg4 == 0) {
                    this.field763[arg3][arg2][arg7 + 1] = 50;
                } else if (arg4 == 1) {
                    this.field763[arg3][arg2 + 1][arg7 + 1] = 50;
                } else if (arg4 == 2) {
                    this.field763[arg3][arg2 + 1][arg7] = 50;
                } else if (arg4 == 3) {
                    this.field763[arg3][arg2][arg7] = 50;
                }
            }
            if (var15.field1151 && arg0 != null) {
                arg0.method189(arg4, arg7, 47214, arg2, var15.field1182, arg5);
            }
        } else if (arg5 == 9) {
            class66 var27;
            if (var15.field1161 == -1 && var15.field1156 == null) {
                var27 = var15.method408(arg5, arg4, var10, var11, var12, var13, -1);
            } else {
                var27 = new class6(var10, var15.field1161, true, var13, var12, arg4, arg5, true, var11, arg6);
            }
            arg1.method459(var18, var14, var27, var17, arg2, 1, false, 0, arg3, 1, arg7);
            if (var15.field1151 && arg0 != null) {
                arg0.method190(arg7, var15.field1135, arg4, var15.field1168, arg2, 98, var15.field1182);
            }
        } else {
            if (var15.field1169) {
                if (arg4 == 1) {
                    int var28 = var13;
                    var13 = var12;
                    var12 = var11;
                    var11 = var10;
                    var10 = var28;
                } else if (arg4 == 2) {
                    int var29 = var13;
                    var13 = var11;
                    var11 = var29;
                    int var30 = var12;
                    var12 = var10;
                    var10 = var30;
                } else if (arg4 == 3) {
                    int var31 = var13;
                    var13 = var10;
                    var10 = var11;
                    var11 = var12;
                    var12 = var31;
                }
            }
            if (arg5 == 4) {
                class66 var32;
                if (var15.field1161 == -1 && var15.field1156 == null) {
                    var32 = var15.method408(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var32 = new class6(var10, var15.field1161, true, var13, var12, 0, 4, true, var11, arg6);
                }
                arg1.method458(var18, var17, arg3, 0, 0, var32, arg4 * 512, field771[arg4], field772, arg7, var14, arg2);
            } else if (arg5 == 5) {
                int var33 = 16;
                int var34 = arg1.method475(arg3, arg2, arg7);
                if (var34 > 0) {
                    var33 = class37.method400(var34 >> 14 & 0x7FFF).field1142;
                }
                class66 var35;
                if (var15.field1161 == -1 && var15.field1156 == null) {
                    var35 = var15.method408(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var35 = new class6(var10, var15.field1161, true, var13, var12, 0, 4, true, var11, arg6);
                }
                arg1.method458(var18, var17, arg3, field781[arg4] * var33, field778[arg4] * var33, var35, arg4 * 512, field771[arg4], field772, arg7, var14, arg2);
            } else if (arg5 == 6) {
                class66 var36;
                if (var15.field1161 == -1 && var15.field1156 == null) {
                    var36 = var15.method408(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var36 = new class6(var10, var15.field1161, true, var13, var12, 0, 4, true, var11, arg6);
                }
                arg1.method458(var18, var17, arg3, 0, 0, var36, arg4, 256, field772, arg7, var14, arg2);
            } else if (arg5 == 7) {
                class66 var37;
                if (var15.field1161 == -1 && var15.field1156 == null) {
                    var37 = var15.method408(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var37 = new class6(var10, var15.field1161, true, var13, var12, 0, 4, true, var11, arg6);
                }
                arg1.method458(var18, var17, arg3, 0, 0, var37, arg4, 512, field772, arg7, var14, arg2);
            } else if (arg5 == 8) {
                class66 var38;
                if (var15.field1161 == -1 && var15.field1156 == null) {
                    var38 = var15.method408(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var38 = new class6(var10, var15.field1161, true, var13, var12, 0, 4, true, var11, arg6);
                }
                arg1.method458(var18, var17, arg3, 0, 0, var38, arg4, 768, field772, arg7, var14, arg2);
            }
        }
    }

    @OriginalMember(owner = "GSYZIGPZ", name = "a", descriptor = "(IIIILNHEPCMLW;III)V")
    private final void method237(int arg0, int arg1, int arg2, int arg3, class35 arg4, int arg5, int arg6, int arg7) {
        if (arg0 >= 0) {
            this.field769 = !this.field769;
        }
        if (arg7 < 0 || arg7 >= 104 || arg2 < 0 || arg2 >= 104) {
            while (true) {
                int var11 = arg4.method349();
                if (var11 == 0) {
                    return;
                }
                if (var11 == 1) {
                    arg4.method349();
                    return;
                }
                if (var11 <= 49) {
                    arg4.method349();
                }
            }
        }
        this.field770[arg1][arg7][arg2] = 0;
        while (true) {
            int var9 = arg4.method349();
            if (var9 == 0) {
                if (arg1 == 0) {
                    this.field780[0][arg7][arg2] = -method232(arg7 + arg3 + 932731, arg2 + 556238 + arg5) * 8;
                    return;
                } else {
                    this.field780[arg1][arg7][arg2] = this.field780[arg1 - 1][arg7][arg2] - 240;
                    return;
                }
            }
            if (var9 == 1) {
                int var10 = arg4.method349();
                if (var10 == 1) {
                    var10 = 0;
                }
                if (arg1 == 0) {
                    this.field780[0][arg7][arg2] = -var10 * 8;
                    return;
                }
                this.field780[arg1][arg7][arg2] = this.field780[arg1 - 1][arg7][arg2] - var10 * 8;
                return;
            }
            if (var9 <= 49) {
                this.field785[arg1][arg7][arg2] = arg4.method350();
                this.field773[arg1][arg7][arg2] = (byte) ((var9 - 2) / 4);
                this.field765[arg1][arg7][arg2] = (byte) (var9 + arg6 - 2 & 0x3);
            } else if (var9 <= 81) {
                this.field770[arg1][arg7][arg2] = (byte) (var9 - 49);
            } else {
                this.field776[arg1][arg7][arg2] = (byte) (var9 - 81);
            }
        }
    }

    @OriginalMember(owner = "GSYZIGPZ", name = "b", descriptor = "(III)Z")
    public static final boolean method238(int arg0, int arg1, int arg2) {
        if (field782 != arg0) {
            field775 = 418;
        }
        class37 var3 = class37.method400(arg2);
        if (arg1 == 11) {
            arg1 = 10;
        }
        if (arg1 >= 5 && arg1 <= 8) {
            arg1 = 4;
        }
        return var3.method401(arg1, true);
    }

    @OriginalMember(owner = "GSYZIGPZ", name = "a", descriptor = "(LNHEPCMLW;LVNVHYJAS;I)V")
    public static final void method239(class35 arg0, class55 arg1, int arg2) {
        int var3 = -1;
        if (arg2 != 7) {
            return;
        }
        while (true) {
            int var4 = arg0.method363();
            if (var4 == 0) {
                return;
            }
            var3 += var4;
            class37 var5 = class37.method400(var3);
            var5.method407(arg1, (byte) 76);
            while (true) {
                int var6 = arg0.method363();
                if (var6 == 0) {
                    break;
                }
                arg0.method349();
            }
        }
    }

    @OriginalMember(owner = "GSYZIGPZ", name = "c", descriptor = "(III)I")
    private final int method240(int arg0, int arg1, int arg2) {
        if (arg2 > 179) {
            arg1 /= 2;
        }
        if (arg2 > 192) {
            arg1 /= 2;
        }
        if (arg2 > 217) {
            arg1 /= 2;
        }
        if (arg2 > 243) {
            arg1 /= 2;
        }
        return arg2 / 2 + (arg0 / 4 << 10) + (arg1 / 32 << 7);
    }

    @OriginalMember(owner = "GSYZIGPZ", name = "a", descriptor = "(IIII)I")
    private static final int method241(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 65536 - class62.field1643[arg2 * 1024 / arg3] >> 1;
        return ((65536 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
    }

    @OriginalMember(owner = "GSYZIGPZ", name = "a", descriptor = "([LEAREBDMK;I[BIILTEXKPKZX;)V")
    public final void method242(class8[] arg0, int arg1, byte[] arg2, int arg3, int arg4, class49 arg5) {
        if (arg3 >= 0) {
            field775 = 410;
        }
        class35 var7 = new class35((byte) -103, arg2);
        int var8 = -1;
        while (true) {
            int var9 = var7.method363();
            if (var9 == 0) {
                return;
            }
            var8 += var9;
            int var10 = 0;
            while (true) {
                int var11 = var7.method363();
                if (var11 == 0) {
                    break;
                }
                var10 += var11 - 1;
                int var12 = var10 & 0x3F;
                int var13 = var10 >> 6 & 0x3F;
                int var14 = var10 >> 12;
                int var15 = var7.method349();
                int var16 = var15 >> 2;
                int var17 = var15 & 0x3;
                int var18 = arg1 + var13;
                int var19 = arg4 + var12;
                if (var18 > 0 && var19 > 0 && var18 < 103 && var19 < 103) {
                    int var20 = var14;
                    if ((this.field770[1][var18][var19] & 0x2) == 2) {
                        var20 = var14 - 1;
                    }
                    class8 var21 = null;
                    if (var20 >= 0) {
                        var21 = arg0[var20];
                    }
                    this.method236(var21, arg5, var18, var14, var17, var16, var8, var19, (byte) 8);
                }
            }
        }
    }

    @OriginalMember(owner = "GSYZIGPZ", name = "d", descriptor = "(II)I")
    private final int method243(int arg0, int arg1) {
        if (arg0 == -2) {
            return 12345678;
        } else if (arg0 == -1) {
            if (arg1 < 0) {
                arg1 = 0;
            } else if (arg1 > 127) {
                arg1 = 127;
            }
            return 127 - arg1;
        } else {
            int var4 = (arg0 & 0x7F) * arg1 / 128;
            if (var4 < 2) {
                var4 = 2;
            } else if (var4 > 126) {
                var4 = 126;
            }
            return (arg0 & 0xFF80) + var4;
        }
    }

    @OriginalMember(owner = "GSYZIGPZ", name = "<init>", descriptor = "(II[[[II[[[B)V")
    public class14(int arg0, int arg1, int[][][] arg2, int arg3, byte[][][] arg4) {
        if (arg0 < 5 || arg0 > 5) {
            throw new NullPointerException();
        }
        field792 = 99;
        this.field793 = arg3;
        this.field794 = arg1;
        this.field780 = arg2;
        this.field770 = arg4;
        this.field776 = new byte[4][this.field793][this.field794];
        this.field785 = new byte[4][this.field793][this.field794];
        this.field773 = new byte[4][this.field793][this.field794];
        this.field765 = new byte[4][this.field793][this.field794];
        this.field764 = new int[4][this.field793 + 1][this.field794 + 1];
        this.field763 = new byte[4][this.field793 + 1][this.field794 + 1];
        this.field767 = new int[this.field793 + 1][this.field794 + 1];
        this.field786 = new int[this.field794];
        this.field787 = new int[this.field794];
        this.field788 = new int[this.field794];
        this.field789 = new int[this.field794];
        this.field790 = new int[this.field794];
    }

    @OriginalMember(owner = "GSYZIGPZ", name = "a", descriptor = "(I[[[IIIIILTEXKPKZX;ILEAREBDMK;II)V")
    public static final void method244(int arg0, int[][][] arg1, int arg2, int arg3, int arg4, int arg5, class49 arg6, int arg7, class8 arg8, int arg9, int arg10) {
        int var11 = arg1[arg5][arg10][arg3];
        int var12 = arg1[arg5][arg10 + 1][arg3];
        int var13 = arg1[arg5][arg10 + 1][arg3 + 1];
        int var14 = arg1[arg5][arg10][arg3 + 1];
        int var15 = var11 + var12 + var13 + var14 >> 2;
        class37 var16 = class37.method400(arg2);
        if (arg9 >= 0) {
            return;
        }
        int var17 = (arg2 << 14) + (arg3 << 7) + arg10 + 1073741824;
        if (!var16.field1163) {
            var17 += Integer.MIN_VALUE;
        }
        byte var18 = (byte) ((arg7 << 6) + arg4);
        if (arg4 == 22) {
            class66 var19;
            if (var16.field1161 == -1 && var16.field1156 == null) {
                var19 = var16.method408(22, arg7, var11, var12, var13, var14, -1);
            } else {
                var19 = new class6(var11, var16.field1161, true, var14, var13, arg7, 22, true, var12, arg2);
            }
            arg6.method455(arg0, var18, var17, arg10, arg3, var19, true, var15);
            if (var16.field1151 && var16.field1163) {
                arg8.method191(119, arg10, arg3);
            }
        } else if (arg4 == 10 || arg4 == 11) {
            class66 var39;
            if (var16.field1161 == -1 && var16.field1156 == null) {
                var39 = var16.method408(10, arg7, var11, var12, var13, var14, -1);
            } else {
                var39 = new class6(var11, var16.field1161, true, var14, var13, arg7, 10, true, var12, arg2);
            }
            if (var39 != null) {
                int var40 = 0;
                if (arg4 == 11) {
                    var40 += 256;
                }
                int var41;
                int var42;
                if (arg7 == 1 || arg7 == 3) {
                    var41 = var16.field1168;
                    var42 = var16.field1135;
                } else {
                    var41 = var16.field1135;
                    var42 = var16.field1168;
                }
                arg6.method459(var18, var15, var39, var17, arg10, var42, false, var40, arg0, var41, arg3);
            }
            if (var16.field1151) {
                arg8.method190(arg3, var16.field1135, arg7, var16.field1168, arg10, 98, var16.field1182);
            }
        } else if (arg4 >= 12) {
            class66 var20;
            if (var16.field1161 == -1 && var16.field1156 == null) {
                var20 = var16.method408(arg4, arg7, var11, var12, var13, var14, -1);
            } else {
                var20 = new class6(var11, var16.field1161, true, var14, var13, arg7, arg4, true, var12, arg2);
            }
            arg6.method459(var18, var15, var20, var17, arg10, 1, false, 0, arg0, 1, arg3);
            if (var16.field1151) {
                arg8.method190(arg3, var16.field1135, arg7, var16.field1168, arg10, 98, var16.field1182);
            }
        } else if (arg4 == 0) {
            class66 var21;
            if (var16.field1161 == -1 && var16.field1156 == null) {
                var21 = var16.method408(0, arg7, var11, var12, var13, var14, -1);
            } else {
                var21 = new class6(var11, var16.field1161, true, var14, var13, arg7, 0, true, var12, arg2);
            }
            arg6.method457((byte) 118, null, 0, var18, field771[arg7], arg3, var21, arg10, var17, var15, arg0);
            if (var16.field1151) {
                arg8.method189(arg7, arg3, 47214, arg10, var16.field1182, arg4);
            }
        } else if (arg4 == 1) {
            class66 var22;
            if (var16.field1161 == -1 && var16.field1156 == null) {
                var22 = var16.method408(1, arg7, var11, var12, var13, var14, -1);
            } else {
                var22 = new class6(var11, var16.field1161, true, var14, var13, arg7, 1, true, var12, arg2);
            }
            arg6.method457((byte) 118, null, 0, var18, field784[arg7], arg3, var22, arg10, var17, var15, arg0);
            if (var16.field1151) {
                arg8.method189(arg7, arg3, 47214, arg10, var16.field1182, arg4);
            }
        } else if (arg4 == 2) {
            int var23 = arg7 + 1 & 0x3;
            class66 var24;
            class66 var25;
            if (var16.field1161 == -1 && var16.field1156 == null) {
                var24 = var16.method408(2, arg7 + 4, var11, var12, var13, var14, -1);
                var25 = var16.method408(2, var23, var11, var12, var13, var14, -1);
            } else {
                var24 = new class6(var11, var16.field1161, true, var14, var13, arg7 + 4, 2, true, var12, arg2);
                var25 = new class6(var11, var16.field1161, true, var14, var13, var23, 2, true, var12, arg2);
            }
            arg6.method457((byte) 118, var25, field771[var23], var18, field771[arg7], arg3, var24, arg10, var17, var15, arg0);
            if (var16.field1151) {
                arg8.method189(arg7, arg3, 47214, arg10, var16.field1182, arg4);
            }
        } else if (arg4 == 3) {
            class66 var26;
            if (var16.field1161 == -1 && var16.field1156 == null) {
                var26 = var16.method408(3, arg7, var11, var12, var13, var14, -1);
            } else {
                var26 = new class6(var11, var16.field1161, true, var14, var13, arg7, 3, true, var12, arg2);
            }
            arg6.method457((byte) 118, null, 0, var18, field784[arg7], arg3, var26, arg10, var17, var15, arg0);
            if (var16.field1151) {
                arg8.method189(arg7, arg3, 47214, arg10, var16.field1182, arg4);
            }
        } else if (arg4 == 9) {
            class66 var27;
            if (var16.field1161 == -1 && var16.field1156 == null) {
                var27 = var16.method408(arg4, arg7, var11, var12, var13, var14, -1);
            } else {
                var27 = new class6(var11, var16.field1161, true, var14, var13, arg7, arg4, true, var12, arg2);
            }
            arg6.method459(var18, var15, var27, var17, arg10, 1, false, 0, arg0, 1, arg3);
            if (var16.field1151) {
                arg8.method190(arg3, var16.field1135, arg7, var16.field1168, arg10, 98, var16.field1182);
            }
        } else {
            if (var16.field1169) {
                if (arg7 == 1) {
                    int var28 = var14;
                    var14 = var13;
                    var13 = var12;
                    var12 = var11;
                    var11 = var28;
                } else if (arg7 == 2) {
                    int var29 = var14;
                    var14 = var12;
                    var12 = var29;
                    int var30 = var13;
                    var13 = var11;
                    var11 = var30;
                } else if (arg7 == 3) {
                    int var31 = var14;
                    var14 = var11;
                    var11 = var12;
                    var12 = var13;
                    var13 = var31;
                }
            }
            if (arg4 == 4) {
                class66 var32;
                if (var16.field1161 == -1 && var16.field1156 == null) {
                    var32 = var16.method408(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var32 = new class6(var11, var16.field1161, true, var14, var13, 0, 4, true, var12, arg2);
                }
                arg6.method458(var18, var17, arg0, 0, 0, var32, arg7 * 512, field771[arg7], field772, arg3, var15, arg10);
            } else if (arg4 == 5) {
                int var33 = 16;
                int var34 = arg6.method475(arg0, arg10, arg3);
                if (var34 > 0) {
                    var33 = class37.method400(var34 >> 14 & 0x7FFF).field1142;
                }
                class66 var35;
                if (var16.field1161 == -1 && var16.field1156 == null) {
                    var35 = var16.method408(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var35 = new class6(var11, var16.field1161, true, var14, var13, 0, 4, true, var12, arg2);
                }
                arg6.method458(var18, var17, arg0, field781[arg7] * var33, field778[arg7] * var33, var35, arg7 * 512, field771[arg7], field772, arg3, var15, arg10);
            } else if (arg4 == 6) {
                class66 var36;
                if (var16.field1161 == -1 && var16.field1156 == null) {
                    var36 = var16.method408(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var36 = new class6(var11, var16.field1161, true, var14, var13, 0, 4, true, var12, arg2);
                }
                arg6.method458(var18, var17, arg0, 0, 0, var36, arg7, 256, field772, arg3, var15, arg10);
            } else if (arg4 == 7) {
                class66 var37;
                if (var16.field1161 == -1 && var16.field1156 == null) {
                    var37 = var16.method408(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var37 = new class6(var11, var16.field1161, true, var14, var13, 0, 4, true, var12, arg2);
                }
                arg6.method458(var18, var17, arg0, 0, 0, var37, arg7, 512, field772, arg3, var15, arg10);
            } else if (arg4 == 8) {
                class66 var38;
                if (var16.field1161 == -1 && var16.field1156 == null) {
                    var38 = var16.method408(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var38 = new class6(var11, var16.field1161, true, var14, var13, 0, 4, true, var12, arg2);
                }
                arg6.method458(var18, var17, arg0, 0, 0, var38, arg7, 768, field772, arg3, var15, arg10);
            }
        }
    }

    @OriginalMember(owner = "GSYZIGPZ", name = "a", descriptor = "(ILTEXKPKZX;I[BIIII[LEAREBDMK;II)V")
    public final void method245(int arg0, class49 arg1, int arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7, class8[] arg8, int arg9, int arg10) {
        class35 var12 = new class35((byte) -103, arg3);
        int var13 = -1;
        if (arg10 != -32879) {
            field791 = !field791;
        }
        while (true) {
            int var14 = var12.method363();
            if (var14 == 0) {
                return;
            }
            var13 += var14;
            int var15 = 0;
            while (true) {
                int var16 = var12.method363();
                if (var16 == 0) {
                    break;
                }
                var15 += var16 - 1;
                int var17 = var15 & 0x3F;
                int var18 = var15 >> 6 & 0x3F;
                int var19 = var15 >> 12;
                int var20 = var12.method349();
                int var21 = var20 >> 2;
                int var22 = var20 & 0x3;
                if (arg2 == var19 && var18 >= arg5 && var18 < arg5 + 8 && var17 >= arg0 && var17 < arg0 + 8) {
                    class37 var23 = class37.method400(var13);
                    int var24 = arg6 + class50.method502(var22, var23.field1135, arg4, var17 & 0x7, var23.field1168, 0, var18 & 0x7);
                    int var25 = arg7 + class50.method503(arg4, var22, var18 & 0x7, this.field768, var23.field1135, var23.field1168, var17 & 0x7);
                    if (var24 > 0 && var25 > 0 && var24 < 103 && var25 < 103) {
                        int var26 = arg9;
                        if ((this.field770[1][var24][var25] & 0x2) == 2) {
                            var26 = arg9 - 1;
                        }
                        class8 var27 = null;
                        if (var26 >= 0) {
                            var27 = arg8[var26];
                        }
                        this.method236(var27, arg1, var24, arg9, arg4 + var22 & 0x3, var21, var13, var25, (byte) 8);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "GSYZIGPZ", name = "e", descriptor = "(II)I")
    private static final int method246(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @OriginalMember(owner = "GSYZIGPZ", name = "a", descriptor = "(Z[LEAREBDMK;LTEXKPKZX;)V")
    public final void method247(boolean arg0, class8[] arg1, class49 arg2) {
        for (int var4 = 0; var4 < 4; var4++) {
            for (int var111 = 0; var111 < 104; var111++) {
                for (int var112 = 0; var112 < 104; var112++) {
                    if ((this.field770[var4][var111][var112] & 0x1) == 1) {
                        int var113 = var4;
                        if ((this.field770[1][var111][var112] & 0x2) == 2) {
                            var113 = var4 - 1;
                        }
                        if (var113 >= 0) {
                            arg1[var113].method191(119, var111, var112);
                        }
                    }
                }
            }
        }
        field783 += (int) (Math.random() * 5.0D) - 2;
        if (arg0) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        if (field783 < -8) {
            field783 = -8;
        }
        if (field783 > 8) {
            field783 = 8;
        }
        field777 += (int) (Math.random() * 5.0D) - 2;
        if (field777 < -16) {
            field777 = -16;
        }
        if (field777 > 16) {
            field777 = 16;
        }
        for (int var6 = 0; var6 < 4; var6++) {
            byte[][] var49 = this.field763[var6];
            byte var50 = 96;
            short var51 = 768;
            byte var52 = -50;
            byte var53 = -10;
            byte var54 = -50;
            int var55 = (int) Math.sqrt((double) (var54 * var54 + var52 * var52 + var53 * var53));
            int var56 = var51 * var55 >> 8;
            for (int var57 = 1; var57 < this.field794 - 1; var57++) {
                for (int var102 = 1; var102 < this.field793 - 1; var102++) {
                    int var103 = this.field780[var6][var102 + 1][var57] - this.field780[var6][var102 - 1][var57];
                    int var104 = this.field780[var6][var102][var57 + 1] - this.field780[var6][var102][var57 - 1];
                    int var105 = (int) Math.sqrt((double) (var104 * var104 + var103 * var103 + 65536));
                    int var106 = (var103 << 8) / var105;
                    int var107 = 65536 / var105;
                    int var108 = (var104 << 8) / var105;
                    int var109 = (var54 * var108 + var52 * var106 + var53 * var107) / var56 + var50;
                    int var110 = (var49[var102][var57] >> 1) + (var49[var102][var57 + 1] >> 3) + (var49[var102][var57 - 1] >> 2) + (var49[var102 - 1][var57] >> 2) + (var49[var102 + 1][var57] >> 3);
                    this.field767[var102][var57] = var109 - var110;
                }
            }
            for (int var58 = 0; var58 < this.field794; var58++) {
                this.field786[var58] = 0;
                this.field787[var58] = 0;
                this.field788[var58] = 0;
                this.field789[var58] = 0;
                this.field790[var58] = 0;
            }
            for (int var59 = -5; var59 < this.field793 + 5; var59++) {
                for (int var62 = 0; var62 < this.field794; var62++) {
                    int var96 = var59 + 5;
                    int var10002;
                    if (var96 >= 0 && var96 < this.field793) {
                        int var97 = this.field776[var6][var96][var62] & 0xFF;
                        if (var97 > 0) {
                            class52 var98 = class52.field1463[var97 - 1];
                            this.field786[var62] += var98.field1472;
                            this.field787[var62] += var98.field1470;
                            this.field788[var62] += var98.field1471;
                            this.field789[var62] += var98.field1473;
                            var10002 = this.field790[var62]++;
                        }
                    }
                    int var99 = var59 - 5;
                    if (var99 >= 0 && var99 < this.field793) {
                        int var100 = this.field776[var6][var99][var62] & 0xFF;
                        if (var100 > 0) {
                            class52 var101 = class52.field1463[var100 - 1];
                            this.field786[var62] -= var101.field1472;
                            this.field787[var62] -= var101.field1470;
                            this.field788[var62] -= var101.field1471;
                            this.field789[var62] -= var101.field1473;
                            var10002 = this.field790[var62]--;
                        }
                    }
                }
                if (var59 >= 1 && var59 < this.field793 - 1) {
                    int var63 = 0;
                    int var64 = 0;
                    int var65 = 0;
                    int var66 = 0;
                    int var67 = 0;
                    for (int var68 = -5; var68 < this.field794 + 5; var68++) {
                        int var69 = var68 + 5;
                        if (var69 >= 0 && var69 < this.field794) {
                            var63 += this.field786[var69];
                            var64 += this.field787[var69];
                            var65 += this.field788[var69];
                            var66 += this.field789[var69];
                            var67 += this.field790[var69];
                        }
                        int var70 = var68 - 5;
                        if (var70 >= 0 && var70 < this.field794) {
                            var63 -= this.field786[var70];
                            var64 -= this.field787[var70];
                            var65 -= this.field788[var70];
                            var66 -= this.field789[var70];
                            var67 -= this.field790[var70];
                        }
                        if (var68 >= 1 && var68 < this.field794 - 1 && (!field766 || (this.field770[0][var59][var68] & 0x2) != 0 || (this.field770[var6][var59][var68] & 0x10) == 0 && this.method235(var68, var59, (byte) -81, var6) == field779)) {
                            if (var6 < field792) {
                                field792 = var6;
                            }
                            int var71 = this.field776[var6][var59][var68] & 0xFF;
                            int var72 = this.field785[var6][var59][var68] & 0xFF;
                            if (var71 > 0 || var72 > 0) {
                                int var73 = this.field780[var6][var59][var68];
                                int var74 = this.field780[var6][var59 + 1][var68];
                                int var75 = this.field780[var6][var59 + 1][var68 + 1];
                                int var76 = this.field780[var6][var59][var68 + 1];
                                int var77 = this.field767[var59][var68];
                                int var78 = this.field767[var59 + 1][var68];
                                int var79 = this.field767[var59 + 1][var68 + 1];
                                int var80 = this.field767[var59][var68 + 1];
                                int var81 = -1;
                                int var82 = -1;
                                if (var71 > 0) {
                                    int var83 = var63 * 256 / var66;
                                    int var84 = var64 / var67;
                                    int var85 = var65 / var67;
                                    var81 = this.method240(var83, var84, var85);
                                    int var86 = field783 + var83 & 0xFF;
                                    int var87 = field777 + var85;
                                    if (var87 < 0) {
                                        var87 = 0;
                                    } else if (var87 > 255) {
                                        var87 = 255;
                                    }
                                    var82 = this.method240(var86, var84, var87);
                                }
                                if (var6 > 0) {
                                    boolean var88 = true;
                                    if (var71 == 0 && this.field773[var6][var59][var68] != 0) {
                                        var88 = false;
                                    }
                                    if (var72 > 0 && !class52.field1463[var72 - 1].field1468) {
                                        var88 = false;
                                    }
                                    if (var88 && var73 == var74 && var73 == var75 && var73 == var76) {
                                        this.field764[var6][var59][var68] |= 0x924;
                                    }
                                }
                                int var89 = 0;
                                if (var81 != -1) {
                                    var89 = class62.field1654[method234(var82, 96)];
                                }
                                if (var72 == 0) {
                                    arg2.method454(var6, var59, var68, 0, 0, -1, var73, var74, var75, var76, method234(var81, var77), method234(var81, var78), method234(var81, var79), method234(var81, var80), 0, 0, 0, 0, var89, 0);
                                } else {
                                    int var90 = this.field773[var6][var59][var68] + 1;
                                    byte var91 = this.field765[var6][var59][var68];
                                    class52 var92 = class52.field1463[var72 - 1];
                                    int var93 = var92.field1466;
                                    int var94;
                                    int var95;
                                    if (var93 >= 0) {
                                        var94 = class62.method562(var93, -195);
                                        var95 = -1;
                                    } else if (var92.field1465 == 16711935) {
                                        var94 = 0;
                                        var95 = -2;
                                        var93 = -1;
                                    } else {
                                        var95 = this.method240(var92.field1469, var92.field1470, var92.field1471);
                                        var94 = class62.field1654[this.method243(var92.field1474, 96)];
                                    }
                                    arg2.method454(var6, var59, var68, var90, var91, var93, var73, var74, var75, var76, method234(var81, var77), method234(var81, var78), method234(var81, var79), method234(var81, var80), this.method243(var95, var77), this.method243(var95, var78), this.method243(var95, var79), this.method243(var95, var80), var89, var94);
                                }
                            }
                        }
                    }
                }
            }
            for (int var60 = 1; var60 < this.field794 - 1; var60++) {
                for (int var61 = 1; var61 < this.field793 - 1; var61++) {
                    arg2.method453(var6, var61, var60, this.method235(var60, var61, (byte) -81, var6));
                }
            }
        }
        arg2.method480(64, -50, -50, -10, 768, -353);
        for (int var7 = 0; var7 < this.field793; var7++) {
            for (int var48 = 0; var48 < this.field794; var48++) {
                if ((this.field770[1][var7][var48] & 0x2) == 2) {
                    arg2.method451(var7, var48, -515);
                }
            }
        }
        int var8 = 1;
        int var9 = 2;
        int var10 = 4;
        for (int var11 = 0; var11 < 4; var11++) {
            if (var11 > 0) {
                var8 <<= 0x3;
                var9 <<= 0x3;
                var10 <<= 0x3;
            }
            for (int var12 = 0; var12 <= var11; var12++) {
                for (int var13 = 0; var13 <= this.field794; var13++) {
                    for (int var14 = 0; var14 <= this.field793; var14++) {
                        if ((this.field764[var12][var14][var13] & var8) != 0) {
                            int var15 = var13;
                            int var16 = var13;
                            int var17 = var12;
                            int var18 = var12;
                            while (var15 > 0 && (this.field764[var12][var14][var15 - 1] & var8) != 0) {
                                var15--;
                            }
                            while (var16 < this.field794 && (this.field764[var12][var14][var16 + 1] & var8) != 0) {
                                var16++;
                            }
                            label331: while (var17 > 0) {
                                for (int var19 = var15; var19 <= var16; var19++) {
                                    if ((this.field764[var17 - 1][var14][var19] & var8) == 0) {
                                        break label331;
                                    }
                                }
                                var17--;
                            }
                            label320: while (var18 < var11) {
                                for (int var20 = var15; var20 <= var16; var20++) {
                                    if ((this.field764[var18 + 1][var14][var20] & var8) == 0) {
                                        break label320;
                                    }
                                }
                                var18++;
                            }
                            int var21 = (var18 + 1 - var17) * (var16 + 1 - var15);
                            if (var21 >= 8) {
                                short var22 = 240;
                                int var23 = this.field780[var18][var14][var15] - var22;
                                int var24 = this.field780[var17][var14][var15];
                                class49.method452(var14 * 128, var23, 1, var16 * 128 + 128, var14 * 128, var24, (byte) 28, var11, var15 * 128);
                                for (int var25 = var17; var25 <= var18; var25++) {
                                    for (int var26 = var15; var26 <= var16; var26++) {
                                        this.field764[var25][var14][var26] &= ~var8;
                                    }
                                }
                            }
                        }
                        if ((this.field764[var12][var14][var13] & var9) != 0) {
                            int var27 = var14;
                            int var28 = var14;
                            int var29 = var12;
                            int var30 = var12;
                            while (var27 > 0 && (this.field764[var12][var27 - 1][var13] & var9) != 0) {
                                var27--;
                            }
                            while (var28 < this.field793 && (this.field764[var12][var28 + 1][var13] & var9) != 0) {
                                var28++;
                            }
                            label384: while (var29 > 0) {
                                for (int var31 = var27; var31 <= var28; var31++) {
                                    if ((this.field764[var29 - 1][var31][var13] & var9) == 0) {
                                        break label384;
                                    }
                                }
                                var29--;
                            }
                            label373: while (var30 < var11) {
                                for (int var32 = var27; var32 <= var28; var32++) {
                                    if ((this.field764[var30 + 1][var32][var13] & var9) == 0) {
                                        break label373;
                                    }
                                }
                                var30++;
                            }
                            int var33 = (var30 + 1 - var29) * (var28 + 1 - var27);
                            if (var33 >= 8) {
                                short var34 = 240;
                                int var35 = this.field780[var30][var27][var13] - var34;
                                int var36 = this.field780[var29][var27][var13];
                                class49.method452(var27 * 128, var35, 2, var13 * 128, var28 * 128 + 128, var36, (byte) 28, var11, var13 * 128);
                                for (int var37 = var29; var37 <= var30; var37++) {
                                    for (int var38 = var27; var38 <= var28; var38++) {
                                        this.field764[var37][var38][var13] &= ~var9;
                                    }
                                }
                            }
                        }
                        if ((this.field764[var12][var14][var13] & var10) != 0) {
                            int var39 = var14;
                            int var40 = var14;
                            int var41 = var13;
                            int var42 = var13;
                            while (var41 > 0 && (this.field764[var12][var14][var41 - 1] & var10) != 0) {
                                var41--;
                            }
                            while (var42 < this.field794 && (this.field764[var12][var14][var42 + 1] & var10) != 0) {
                                var42++;
                            }
                            label437: while (var39 > 0) {
                                for (int var43 = var41; var43 <= var42; var43++) {
                                    if ((this.field764[var12][var39 - 1][var43] & var10) == 0) {
                                        break label437;
                                    }
                                }
                                var39--;
                            }
                            label426: while (var40 < this.field793) {
                                for (int var44 = var41; var44 <= var42; var44++) {
                                    if ((this.field764[var12][var40 + 1][var44] & var10) == 0) {
                                        break label426;
                                    }
                                }
                                var40++;
                            }
                            if ((var40 + 1 - var39) * (var42 + 1 - var41) >= 4) {
                                int var45 = this.field780[var12][var39][var41];
                                class49.method452(var39 * 128, var45, 4, var42 * 128 + 128, var40 * 128 + 128, var45, (byte) 28, var11, var41 * 128);
                                for (int var46 = var39; var46 <= var40; var46++) {
                                    for (int var47 = var41; var47 <= var42; var47++) {
                                        this.field764[var12][var46][var47] &= ~var10;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
