import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jl")
public class class268 extends class17 {

    @OriginalMember(owner = "client!jl", name = "ab", descriptor = "I")
    private int field4702 = 1;

    @OriginalMember(owner = "client!jl", name = "lb", descriptor = "I")
    private int field4713 = 1;

    @OriginalMember(owner = "client!jl", name = "db", descriptor = "Lsf;")
    private static class108 field4705 = class140.method973(255, "cyan:");

    @OriginalMember(owner = "client!jl", name = "jb", descriptor = "Lsf;")
    public static class108 field4711 = class140.method973(255, "(Y<)4col>");

    @OriginalMember(owner = "client!jl", name = "bb", descriptor = "Lsf;")
    public static class108 field4703 = field4705;

    @OriginalMember(owner = "client!jl", name = "kb", descriptor = "Lsf;")
    public static class108 field4712 = class140.method973(255, "::mm");

    @OriginalMember(owner = "client!jl", name = "nb", descriptor = "Lsf;")
    public static class108 field4715 = field4705;

    @OriginalMember(owner = "client!jl", name = "cb", descriptor = "I")
    public static int field4704;

    @OriginalMember(owner = "client!jl", name = "eb", descriptor = "I")
    public static int field4706;

    @OriginalMember(owner = "client!jl", name = "fb", descriptor = "I")
    public static int field4707;

    @OriginalMember(owner = "client!jl", name = "gb", descriptor = "I")
    public static int field4708;

    @OriginalMember(owner = "client!jl", name = "hb", descriptor = "I")
    public static int field4709;

    @OriginalMember(owner = "client!jl", name = "ib", descriptor = "I")
    public static int field4710;

    @OriginalMember(owner = "client!jl", name = "mb", descriptor = "I")
    public static int field4714;

    @OriginalMember(owner = "client!jl", name = "<init>", descriptor = "()V", line = 8)
    public class268() {
        super(1, false);
    }

    @OriginalMember(owner = "client!jl", name = "c", descriptor = "(Z)V", line = 13)
    public static void method1939(boolean arg0) {
        field4703 = null;
        field4705 = null;
        field4712 = null;
        if (!arg0) {
            field4715 = null;
            field4711 = null;
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(IIIIIIII)V", line = 27)
    public static final void method1940(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4710++;
        if (class231.field4051) {
            int var8 = arg6 - 334;
            if (var8 < 0) {
                var8 = 0;
            } else if (var8 > 100) {
                var8 = 100;
            }
            int var9 = (class130.field2229 - class331.field5661) * var8 / 100 + class331.field5661;
            arg5 = arg5 * var9 >> 8;
        }
        int var10 = 2048 - arg7 & 0x7FF;
        int var11 = 0;
        int var12 = 2048 - arg3 & 0x7FF;
        int var13 = 0;
        int var14 = arg5;
        if (var10 != 0) {
            int var15 = class263.field4653[var10];
            int var16 = class263.field4649[var10];
            var13 = -arg5 * var15 >> 16;
            var14 = arg5 * var16 >> 16;
        }
        if (var12 != 0) {
            int var17 = class263.field4653[var12];
            var11 = var14 * var17 >> 16;
            int var18 = class263.field4649[var12];
            var14 = var14 * var18 >> 16;
        }
        class15.field193 = arg1 - var11;
        class255.field4443 = arg0 - var14;
        class330.field5640 = arg3;
        if (arg4 != -1429127344) {
            field4712 = (class108) null;
        }
        class135.field2346 = arg7;
        class42.field560 = arg2 - var13;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(Lal;)V", line = 91)
    public static final void method1941(class326 arg0) {
        for (int var1 = arg0.field5575; var1 <= arg0.field5568; var1++) {
            for (int var2 = arg0.field5576; var2 <= arg0.field5561; var2++) {
                class74 var3 = class99.field1759[arg0.field5559][var1][var2];
                if (var3 != null) {
                    for (int var4 = 0; var4 < var3.field1119; var4++) {
                        if (var3.field1118[var4] == arg0) {
                            var3.field1119--;
                            for (int var5 = var4; var5 < var3.field1119; var5++) {
                                var3.field1118[var5] = var3.field1118[var5 + 1];
                                var3.field1133[var5] = var3.field1133[var5 + 1];
                            }
                            var3.field1118[var3.field1119] = null;
                            break;
                        }
                    }
                    var3.field1142 = 0;
                    for (int var6 = 0; var6 < var3.field1119; var6++) {
                        var3.field1142 |= var3.field1133[var6];
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(ZI)[[I", line = 160)
    public final int[][] method122(boolean arg0, int arg1) {
        field4708++;
        int[][] var3 = this.field224.method2081(arg1, -106);
        if (this.field224.field5106) {
            int var4 = this.field4713 + this.field4713 + 1;
            int var5 = this.field4702 + this.field4702 + 1;
            int var6 = 65536 / var4;
            int var7 = 65536 / var5;
            int[][][] var8 = new int[var5][][];
            for (int var9 = arg1 - this.field4702; var9 <= (this.field4702 + arg1); var9++) {
                int var10 = 0;
                int var11 = 0;
                int[][] var12 = this.method111(3, var9 & class219.field3899, 0);
                int var13 = 0;
                int[][] var14 = new int[3][class116.field2008];
                int[] var15 = var12[1];
                int[] var16 = var12[0];
                int[] var17 = var12[2];
                for (int var18 = -this.field4713; var18 <= this.field4713; var18++) {
                    int var19 = class249.field4327 & var18;
                    var13 += var15[var19];
                    var10 += var16[var19];
                    var11 += var17[var19];
                }
                int[] var20 = var14[0];
                int[] var21 = var14[2];
                int[] var22 = var14[1];
                int var23 = 0;
                while (class116.field2008 > var23) {
                    var20[var23] = var6 * var10 >> 16;
                    var22[var23] = var6 * var13 >> 16;
                    var21[var23] = var6 * var11 >> 16;
                    int var24 = var23 - this.field4713 & class249.field4327;
                    int var25 = var11 - var17[var24];
                    var23++;
                    int var26 = var13 - var15[var24];
                    int var27 = var10 - var16[var24];
                    int var28 = class249.field4327 & this.field4713 + var23;
                    var11 = var17[var28] + var25;
                    var10 = var16[var28] + var27;
                    var13 = var15[var28] + var26;
                }
                var8[var9 + this.field4702 - arg1] = var14;
            }
            int[] var29 = var3[0];
            int[] var30 = var3[1];
            int[] var31 = var3[2];
            for (int var32 = 0; var32 < class116.field2008; var32++) {
                int var33 = 0;
                int var34 = 0;
                int var35 = 0;
                for (int var36 = 0; var36 < var5; var36++) {
                    int[][] var37 = var8[var36];
                    var35 += var37[2][var32];
                    var34 += var37[1][var32];
                    var33 += var37[0][var32];
                }
                var29[var32] = var7 * var33 >> 16;
                var30[var32] = var7 * var34 >> 16;
                var31[var32] = var7 * var35 >> 16;
            }
        }
        if (arg0) {
            field4703 = (class108) null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!jl", name = "c", descriptor = "(B)I", line = 291)
    public static final int method1942(byte arg0) {
        field4706++;
        int var1 = 70 / ((66 - arg0) / 49);
        return 6;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(IIIIIIBI)V", line = 306)
    public static final void method1943(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7) {
        int var8 = 0;
        int var9 = arg0 - arg1;
        int var10 = arg3 - arg1;
        int var11 = arg3;
        if (arg6 != -74) {
            return;
        }
        int var12 = 0;
        int var13 = arg3 * arg3;
        int var14 = var10 * var10;
        int var15 = arg0 * arg0;
        field4709++;
        int var16 = var13 << 1;
        int var17 = var15 << 1;
        int var18 = var9 * var9;
        int var19 = var14 << 1;
        int var20 = var18 << 1;
        int var21 = arg3 << 1;
        int var22 = var10 << 1;
        int var23 = (1 - var21) * var15 + var16;
        int var24 = var13 - ((var21 - 1) * var17);
        int var25 = (1 - var22) * var18 + var19;
        int var26 = var13 << 2;
        int var27 = var14 - ((var22 - 1) * var20);
        int var28 = var16 * 3;
        int var29 = var14 << 2;
        int var30 = var18 << 2;
        int var31 = (var21 - 3) * var17;
        int var32 = var15 << 2;
        int var33 = var19 * 3;
        int var34 = (arg3 - 1) * var32;
        int var35 = (var22 - 3) * var20;
        int var36 = var29;
        int var37 = var26;
        int var38 = (var10 - 1) * var30;
        int[] var39 = class106.field1839[arg4];
        class209.method1452(arg2 - var9, var39, 7, arg2 - arg0, arg7);
        class209.method1452(arg2 + var9, var39, 7, arg2 - var9, arg5);
        class209.method1452(arg0 + arg2, var39, 7, arg2 + var9, arg7);
        while (var11 > 0) {
            boolean var40 = var10 >= var11;
            var11--;
            if (var40) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var12++;
                        var25 += var33;
                        var33 += var29;
                        var27 += var36;
                        var36 += var29;
                    }
                }
                if (var27 < 0) {
                    var25 += var33;
                    var33 += var29;
                    var12++;
                    var27 += var36;
                    var36 += var29;
                }
                var25 += -var38;
                var38 -= var30;
                var27 += -var35;
                var35 -= var30;
            }
            if (var23 < 0) {
                while (var23 < 0) {
                    var23 += var28;
                    var24 += var37;
                    var37 += var26;
                    var28 += var26;
                    var8++;
                }
            }
            int var41 = arg4 - var11;
            int var42 = arg4 + var11;
            if (var24 < 0) {
                var23 += var28;
                var8++;
                var24 += var37;
                var28 += var26;
                var37 += var26;
            }
            int var43 = arg2 - var8;
            var23 += -var34;
            int var44 = arg2 + var8;
            var24 += -var31;
            var34 -= var32;
            var31 -= var32;
            if (var40) {
                int var45 = arg2 + var12;
                int var46 = arg2 - var12;
                class209.method1452(var46, class106.field1839[var41], 7, var43, arg7);
                class209.method1452(var45, class106.field1839[var41], 7, var46, arg5);
                class209.method1452(var44, class106.field1839[var41], 7, var45, arg7);
                class209.method1452(var46, class106.field1839[var42], 7, var43, arg7);
                class209.method1452(var45, class106.field1839[var42], 7, var46, arg5);
                class209.method1452(var44, class106.field1839[var42], 7, var45, arg7);
            } else {
                class209.method1452(var44, class106.field1839[var41], 7, var43, arg7);
                class209.method1452(var44, class106.field1839[var42], 7, var43, arg7);
            }
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(BLrm;I)V", line = 489)
    public final void method114(byte arg0, class249 arg1, int arg2) {
        field4704++;
        if (arg0 != -114) {
            return;
        }
        if (arg2 == 0) {
            this.field4713 = arg1.method1731(true);
        } else if (arg2 == 1) {
            this.field4702 = arg1.method1731(true);
        } else if (arg2 == 2) {
            this.field225 = arg1.method1731(true) == 1;
        }
    }

    @OriginalMember(owner = "client!jl", name = "d", descriptor = "(II)[I", line = 539)
    public final int[] method120(int arg0, int arg1) {
        if (arg0 >= -95) {
            return (int[]) null;
        }
        field4714++;
        int[] var3 = this.field217.method1698(-35, arg1);
        if (this.field217.field4295) {
            int var4 = this.field4702 + this.field4702 + 1;
            int var5 = 65536 / var4;
            int var6 = this.field4713 + this.field4713 + 1;
            int[][] var7 = new int[var4][];
            int var8 = 65536 / var6;
            for (int var9 = arg1 - this.field4702; var9 <= (this.field4702 + arg1); var9++) {
                int[] var10 = this.method124(119, 0, var9 & class219.field3899);
                int var11 = 0;
                int[] var12 = new int[class116.field2008];
                for (int var13 = -this.field4713; var13 <= this.field4713; var13++) {
                    var11 += var10[var13 & class249.field4327];
                }
                int var14 = 0;
                while (class116.field2008 > var14) {
                    var12[var14] = var8 * var11 >> 16;
                    int var15 = var11 - var10[class249.field4327 & var14 - this.field4713];
                    var14++;
                    var11 = var10[class249.field4327 & this.field4713 + var14] + var15;
                }
                var7[this.field4702 + var9 - arg1] = var12;
            }
            for (int var16 = 0; var16 < class116.field2008; var16++) {
                int var17 = 0;
                for (int var18 = 0; var18 < var4; var18++) {
                    var17 += var7[var18][var16];
                }
                var3[var16] = var5 * var17 >> 16;
            }
        }
        return var3;
    }
}
