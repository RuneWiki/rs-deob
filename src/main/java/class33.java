import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class33 {

    @OriginalMember(owner = "client!ed", name = "f", descriptor = "Lod;")
    public static class101 field853 = class46.method335(88, "Sie befinden sich in einem Mitglieder)2Gebiet(Q");

    @OriginalMember(owner = "client!ed", name = "e", descriptor = "I")
    public static int field852 = 0;

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "[I")
    public static int[] field850 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "I")
    public static int field848;

    @OriginalMember(owner = "client!ed", name = "d", descriptor = "I")
    public static int field851;

    @OriginalMember(owner = "client!ed", name = "g", descriptor = "I")
    public static int field854;

    @OriginalMember(owner = "client!ed", name = "h", descriptor = "I")
    public static int field855;

    @OriginalMember(owner = "client!ed", name = "i", descriptor = "I")
    public static int field856;

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "Lbc;")
    public static class11 field849;

    @OriginalMember(owner = "client!ed", name = "j", descriptor = "Lle;")
    public static class81 field857;

    @OriginalMember(owner = "client!ed", name = "k", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field858;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lge;IIIIILle;III)V")
    public static final void method251(class47 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class81 arg6, int arg7, int arg8, int arg9) {
        field851++;
        class24 var10 = class94.method652(arg7, 0);
        int var11 = -64 % ((-arg3 - 32) / 49);
        int var12;
        int var13;
        if (arg5 == 1 || arg5 == 3) {
            var13 = var10.field613;
            var12 = var10.field599;
        } else {
            var12 = var10.field613;
            var13 = var10.field599;
        }
        int var14;
        int var15;
        if (arg2 + var13 <= 104) {
            var14 = (var13 >> 1) + arg2;
            var15 = (var13 + 1 >> 1) + arg2;
        } else {
            var14 = arg2;
            var15 = arg2 + 1;
        }
        int[][] var16 = class20.field431[arg1];
        int var17;
        int var18;
        if (arg4 + var12 <= 104) {
            var17 = arg4 + (var12 + 1 >> 1);
            var18 = (var12 >> 1) + arg4;
        } else {
            var18 = arg4;
            var17 = arg4 + 1;
        }
        int var19 = var16[var17][var14] + var16[var18][var15] + var16[var18][var14] + var16[var17][var15] >> 2;
        int var20 = (arg2 << 7) + (var13 << 6);
        int var21 = (arg4 << 7) + (var12 << 6);
        int var22 = (arg7 << 14) + (arg4 + (arg2 << 7)) + 1073741824;
        int var23 = (arg5 << 6) + arg8;
        if (var10.field589 == 1) {
            var23 += 256;
        }
        if (var10.field580 == 0) {
            var22 += Integer.MIN_VALUE;
        }
        if (arg8 == 22) {
            class49 var24;
            if (var10.field603 == -1 && var10.field567 == null) {
                var24 = var10.method187(22, var19, var16, var21, var20, (byte) 67, arg5);
            } else {
                var24 = new class111(arg7, 22, arg5, arg1, arg4, arg2, var10.field603, true, null);
            }
            arg6.method552(arg9, arg4, arg2, var19, var24, var22, var23);
            if (var10.field570 == 1) {
                arg0.method343(-40, arg2, arg4);
            }
        } else if (arg8 == 10 || arg8 == 11) {
            class49 var47;
            if (var10.field603 == -1 && var10.field567 == null) {
                var47 = var10.method187(10, var19, var16, var21, var20, (byte) 67, arg5);
            } else {
                var47 = new class111(arg7, 10, arg5, arg1, arg4, arg2, var10.field603, true, null);
            }
            if (var47 != null) {
                arg6.method547(arg9, arg4, arg2, var19, var12, var13, var47, arg8 == 11 ? 256 : 0, var22, var23);
            }
            if (var10.field570 != 0) {
                arg0.method347(16, arg2, var13, arg4, var12, var10.field592);
            }
        } else if (arg8 >= 12) {
            class49 var25;
            if (var10.field603 == -1 && var10.field567 == null) {
                var25 = var10.method187(arg8, var19, var16, var21, var20, (byte) 67, arg5);
            } else {
                var25 = new class111(arg7, arg8, arg5, arg1, arg4, arg2, var10.field603, true, null);
            }
            arg6.method547(arg9, arg4, arg2, var19, 1, 1, var25, 0, var22, var23);
            if (var10.field570 != 0) {
                arg0.method347(16, arg2, var13, arg4, var12, var10.field592);
            }
        } else if (arg8 == 0) {
            class49 var26;
            if (var10.field603 == -1 && var10.field567 == null) {
                var26 = var10.method187(0, var19, var16, var21, var20, (byte) 67, arg5);
            } else {
                var26 = new class111(arg7, 0, arg5, arg1, arg4, arg2, var10.field603, true, null);
            }
            arg6.method553(arg9, arg4, arg2, var19, var26, null, class98.field2119[arg5], 0, var22, var23);
            if (var10.field570 != 0) {
                arg0.method351(var10.field592, arg5, arg8, arg4, arg2, (byte) 121);
            }
        } else if (arg8 == 1) {
            class49 var27;
            if (var10.field603 == -1 && var10.field567 == null) {
                var27 = var10.method187(1, var19, var16, var21, var20, (byte) 67, arg5);
            } else {
                var27 = new class111(arg7, 1, arg5, arg1, arg4, arg2, var10.field603, true, null);
            }
            arg6.method553(arg9, arg4, arg2, var19, var27, null, class144.field3324[arg5], 0, var22, var23);
            if (var10.field570 != 0) {
                arg0.method351(var10.field592, arg5, arg8, arg4, arg2, (byte) 116);
            }
        } else if (arg8 == 2) {
            int var28 = arg5 + 1 & 0x3;
            class49 var29;
            class49 var30;
            if (var10.field603 == -1 && var10.field567 == null) {
                var29 = var10.method187(2, var19, var16, var21, var20, (byte) 67, arg5 + 4);
                var30 = var10.method187(2, var19, var16, var21, var20, (byte) 67, var28);
            } else {
                var29 = new class111(arg7, 2, arg5 + 4, arg1, arg4, arg2, var10.field603, true, null);
                var30 = new class111(arg7, 2, var28, arg1, arg4, arg2, var10.field603, true, null);
            }
            arg6.method553(arg9, arg4, arg2, var19, var29, var30, class98.field2119[arg5], class98.field2119[var28], var22, var23);
            if (var10.field570 != 0) {
                arg0.method351(var10.field592, arg5, arg8, arg4, arg2, (byte) 115);
            }
        } else if (arg8 == 3) {
            class49 var31;
            if (var10.field603 == -1 && var10.field567 == null) {
                var31 = var10.method187(3, var19, var16, var21, var20, (byte) 67, arg5);
            } else {
                var31 = new class111(arg7, 3, arg5, arg1, arg4, arg2, var10.field603, true, null);
            }
            arg6.method553(arg9, arg4, arg2, var19, var31, null, class144.field3324[arg5], 0, var22, var23);
            if (var10.field570 != 0) {
                arg0.method351(var10.field592, arg5, arg8, arg4, arg2, (byte) 123);
            }
        } else if (arg8 == 9) {
            class49 var32;
            if (var10.field603 == -1 && var10.field567 == null) {
                var32 = var10.method187(arg8, var19, var16, var21, var20, (byte) 67, arg5);
            } else {
                var32 = new class111(arg7, arg8, arg5, arg1, arg4, arg2, var10.field603, true, null);
            }
            arg6.method547(arg9, arg4, arg2, var19, 1, 1, var32, 0, var22, var23);
            if (var10.field570 != 0) {
                arg0.method347(16, arg2, var13, arg4, var12, var10.field592);
            }
        } else if (arg8 == 4) {
            class49 var33;
            if (var10.field603 == -1 && var10.field567 == null) {
                var33 = var10.method187(4, var19, var16, var21, var20, (byte) 67, arg5);
            } else {
                var33 = new class111(arg7, 4, arg5, arg1, arg4, arg2, var10.field603, true, null);
            }
            arg6.method576(arg9, arg4, arg2, var19, var33, null, class98.field2119[arg5], 0, 0, 0, var22, var23);
        } else if (arg8 == 5) {
            int var34 = 16;
            int var35 = arg6.method556(arg9, arg4, arg2);
            if (var35 != 0) {
                var34 = class94.method652(var35 >> 14 & 0x7FFF, 0).field620;
            }
            class49 var36;
            if (var10.field603 == -1 && var10.field567 == null) {
                var36 = var10.method187(4, var19, var16, var21, var20, (byte) 67, arg5);
            } else {
                var36 = new class111(arg7, 4, arg5, arg1, arg4, arg2, var10.field603, true, null);
            }
            arg6.method576(arg9, arg4, arg2, var19, var36, null, class98.field2119[arg5], 0, class22.field503[arg5] * var34, class87.field1921[arg5] * var34, var22, var23);
        } else if (arg8 == 6) {
            int var37 = 8;
            int var38 = arg6.method556(arg9, arg4, arg2);
            if (var38 != 0) {
                var37 = class94.method652(var38 >> 14 & 0x7FFF, 0).field620 / 2;
            }
            class49 var39;
            if (var10.field603 == -1 && var10.field567 == null) {
                var39 = var10.method187(4, var19, var16, var21, var20, (byte) 67, arg5 + 4);
            } else {
                var39 = new class111(arg7, 4, arg5 + 4, arg1, arg4, arg2, var10.field603, true, null);
            }
            arg6.method576(arg9, arg4, arg2, var19, var39, null, 256, arg5, class73.field1580[arg5] * var37, class95.field2063[arg5] * var37, var22, var23);
        } else if (arg8 == 7) {
            int var40 = arg5 + 2 & 0x3;
            class49 var41;
            if (var10.field603 == -1 && var10.field567 == null) {
                var41 = var10.method187(4, var19, var16, var21, var20, (byte) 67, var40 + 4);
            } else {
                var41 = new class111(arg7, 4, var40 + 4, arg1, arg4, arg2, var10.field603, true, null);
            }
            arg6.method576(arg9, arg4, arg2, var19, var41, null, 256, var40, 0, 0, var22, var23);
        } else if (arg8 == 8) {
            int var42 = arg6.method556(arg9, arg4, arg2);
            int var43 = 8;
            if (var42 != 0) {
                var43 = class94.method652(var42 >> 14 & 0x7FFF, 0).field620 / 2;
            }
            int var44 = arg5 + 2 & 0x3;
            class49 var45;
            class49 var46;
            if (var10.field603 == -1 && var10.field567 == null) {
                var45 = var10.method187(4, var19, var16, var21, var20, (byte) 67, arg5 + 4);
                var46 = var10.method187(4, var19, var16, var21, var20, (byte) 67, var44 + 4);
            } else {
                var45 = new class111(arg7, 4, arg5 + 4, arg1, arg4, arg2, var10.field603, true, null);
                var46 = new class111(arg7, 4, var44 + 4, arg1, arg4, arg2, var10.field603, true, null);
            }
            arg6.method576(arg9, arg4, arg2, var19, var45, var46, 256, arg5, class73.field1580[arg5] * var43, class95.field2063[arg5] * var43, var22, var23);
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(I[BLtf;)V")
    public final void method252(int arg0, byte[] arg1, class138 arg2) {
        field855++;
        if (arg2.field3213[arg2.field3175] != 31 || arg2.field3213[arg2.field3175 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field858 == null) {
            this.field858 = new Inflater(true);
        }
        try {
            this.field858.setInput(arg2.field3213, arg2.field3175 + arg0, -10 - (arg2.field3175 + 8 - arg2.field3213.length));
            this.field858.inflate(arg1);
        } catch (Exception var4) {
            this.field858.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field858.reset();
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(I)V")
    public static void method253(int arg0) {
        field857 = null;
        field850 = null;
        field853 = null;
        field849 = null;
        if (arg0 != 15435) {
            field850 = null;
        }
    }

    @OriginalMember(owner = "client!ed", name = "<init>", descriptor = "(III)V")
    private class33(int arg0, int arg1, int arg2) {
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(II)V")
    public static final void method254(int arg0, int arg1) {
        class90.field1962 = arg0;
        class11.field167 = 1;
        class49.field1156 = -1;
        class100.field2154 = null;
        if (arg1 >= 0) {
            field850 = null;
        }
        class143.field3295 = 0;
        class158.field3632 = false;
        class155.field3532 = -1;
        field856++;
    }

    @OriginalMember(owner = "client!ed", name = "<init>", descriptor = "()V")
    public class33() {
        this(-1, 1000000, 1000000);
    }
}
