import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jl")
public class class253 extends class178 {

    @OriginalMember(owner = "client!jl", name = "E", descriptor = "I")
    private int field4184 = -32768;

    @OriginalMember(owner = "client!jl", name = "A", descriptor = "Ljava/lang/String;")
    public static String field4181 = "Discard";

    @OriginalMember(owner = "client!jl", name = "y", descriptor = "Z")
    public static boolean field4179 = false;

    @OriginalMember(owner = "client!jl", name = "q", descriptor = "I")
    public static int field4171;

    @OriginalMember(owner = "client!jl", name = "r", descriptor = "I")
    public int field4172;

    @OriginalMember(owner = "client!jl", name = "s", descriptor = "I")
    public static int field4173;

    @OriginalMember(owner = "client!jl", name = "t", descriptor = "I")
    public static int field4174;

    @OriginalMember(owner = "client!jl", name = "u", descriptor = "I")
    public int field4175;

    @OriginalMember(owner = "client!jl", name = "w", descriptor = "I")
    public static int field4177;

    @OriginalMember(owner = "client!jl", name = "x", descriptor = "I")
    public static int field4178;

    @OriginalMember(owner = "client!jl", name = "z", descriptor = "I")
    public static int field4180;

    @OriginalMember(owner = "client!jl", name = "C", descriptor = "I")
    public static int field4182;

    @OriginalMember(owner = "client!jl", name = "F", descriptor = "I")
    public static int field4185;

    @OriginalMember(owner = "client!jl", name = "H", descriptor = "I")
    public static int field4187;

    @OriginalMember(owner = "client!jl", name = "I", descriptor = "I")
    public static int field4188;

    @OriginalMember(owner = "client!jl", name = "G", descriptor = "[I")
    public static int[] field4186;

    @OriginalMember(owner = "client!jl", name = "p", descriptor = "[[B")
    public static byte[][] field4170;

    @OriginalMember(owner = "client!jl", name = "v", descriptor = "[[I")
    public static int[][] field4176;

    @OriginalMember(owner = "client!jl", name = "D", descriptor = "[[[B")
    public static byte[][][] field4183;

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(II)Z")
    public static final boolean method1793(int arg0, int arg1) {
        field4174++;
        if (arg1 < 0) {
            return false;
        }
        int var2 = class207.field3318[arg1];
        if (var2 >= 2000) {
            var2 -= 2000;
        }
        if (var2 == 1004) {
            return true;
        } else {
            if (arg0 <= 103) {
                method1793(-106, -28);
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "()I")
    public final int method3() {
        field4187++;
        return this.field4184;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method1794(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field4188++;
        if (arg7 != -1) {
            return;
        }
        for (int var9 = 0; var9 < class63.field940.field1150; var9++) {
            if (class63.field940.method581(true, var9)) {
                int[] var10 = class222.field3551.method1595(class63.field940.field1165[var9] >> 14 & 0x3FFF, class63.field940.field1165[var9] & 0x3FFF, class63.field940.field1165[var9] >> 28 & 0x3, arg7 + 12801);
                if (var10 != null) {
                    int var11 = var10[1] - class227.field3636;
                    int var12 = class122.field1786 + (class52.field753 - 1) - var10[2];
                    int var13 = (var11 - arg1) * (arg5 - arg4) / (arg3 - arg1) + arg4;
                    int var14 = (arg8 - arg2) * (var12 - arg6) / (arg0 - arg6) + arg2;
                    int var15 = class63.field940.method587(var9, arg7 ^ 0x54B7);
                    class167 var16 = null;
                    if (var15 == 0) {
                        if ((double) class6.field52 == 3.0D) {
                            var16 = class21.field237;
                        }
                        if ((double) class6.field52 == 4.0D) {
                            var16 = class213.field3411;
                        }
                        if ((double) class6.field52 == 6.0D) {
                            var16 = class112.field1616;
                        }
                        if ((double) class6.field52 >= 8.0D) {
                            var16 = class10.field115;
                        }
                    }
                    int var17 = 16777215;
                    if (var15 == 1) {
                        if ((double) class6.field52 == 3.0D) {
                            var16 = class112.field1616;
                        }
                        if ((double) class6.field52 == 4.0D) {
                            var16 = class10.field115;
                        }
                        if ((double) class6.field52 == 6.0D) {
                            var16 = class10.field103;
                        }
                        if ((double) class6.field52 >= 8.0D) {
                            var16 = class296.field4688;
                        }
                    }
                    if (var15 == 2) {
                        var17 = 16755200;
                        if ((double) class6.field52 == 3.0D) {
                            var16 = class10.field103;
                        }
                        if ((double) class6.field52 == 4.0D) {
                            var16 = class296.field4688;
                        }
                        if ((double) class6.field52 == 6.0D) {
                            var16 = class238.field3803;
                        }
                        if ((double) class6.field52 >= 8.0D) {
                            var16 = class96.field1423;
                        }
                    }
                    if (class63.field940.field1164[var9] != -1) {
                        var17 = class63.field940.field1164[var9];
                    }
                    if (var16 != null) {
                        int var18 = class238.field3808.method1252(class63.field940.field1153[var9], (int[]) null, class58.field827);
                        int var19 = var14 - var16.method1232() * (var18 - 1) / 2;
                        int var20 = var19 + var16.method1230() / 2;
                        for (int var21 = 0; var21 < var18; var21++) {
                            String var22 = class58.field827[var21];
                            if ((var18 - 1) > var21) {
                                var22 = var22.substring(0, var22.length() - 4);
                            }
                            var16.method1235(var22, var13, var20, var17, true);
                            var20 += var16.method1232();
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(IIIIIIIIJILbj;)V")
    public final void method2(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class157 arg10) {
        field4182++;
        class22 var13 = class254.method1800(this.field4172, 15017).method444((class141) null, 0, 0, -1, this.field4175, 32457, (class10) null);
        if (var13 != null) {
            var13.method2(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10);
            this.field4184 = var13.method3();
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(IIIII)V")
    public final void method4(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4171++;
    }

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "(Z)V")
    public static void method1795(boolean arg0) {
        if (arg0) {
            return;
        }
        field4186 = null;
        field4183 = null;
        field4176 = null;
        field4181 = null;
        field4170 = null;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(IIB)V")
    public static final void method1796(int arg0, int arg1, byte arg2) {
        class190.field3068 = (float) arg0;
        if (arg2 >= -58) {
            return;
        }
        field4173++;
        class123.field1799 = (float) arg1;
        if (class176.field2853 == 2) {
            class218.field3485 = arg0;
            class67.field988 = arg1;
        }
        class97.method752((byte) 119);
        class211.field3380 = true;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(IIIBIIIIIIIZ)V")
    public static final void method1797(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, boolean arg11) {
        field4180++;
        int var12 = arg0 - arg2;
        int var13 = -1;
        int var14 = arg6 - arg10;
        if (class180.field2905 > 0) {
            if (class62.field905 > 10) {
                var13 = (10 + 10 - class62.field905) * 5;
            } else {
                var13 = class62.field905 * 5;
            }
        }
        int var15 = 983040 / arg8;
        int var16 = 983040 / arg5;
        for (int var17 = -var15; var17 < var14 + var15; var17++) {
            int var19 = arg7 + (arg8 * var17) >> 16;
            int var20 = (var17 + 1) * arg8 + arg7 >> 16;
            int var21 = var20 - var19;
            if (var21 > 0) {
                int var22 = arg1 + var19;
                int var10000 = arg1 + var20;
                int var24 = arg10 + var17 >> 6;
                if (var24 >= 0 && class108.field1564.length - 1 >= var24) {
                    int[][] var25 = class108.field1564[var24];
                    for (int var26 = -var16; var26 < (var12 + var16); var26++) {
                        int var27 = arg9 + (arg5 * var26) >> 16;
                        int var28 = (var26 + 1) * arg5 + arg9 >> 16;
                        int var29 = var28 - var27;
                        if (var29 > 0) {
                            int var30 = arg4 + var27;
                            var10000 = arg4 + var28;
                            int var32 = arg2 + var26 >> 6;
                            if (var32 >= 0 && var25.length - 1 >= var32 && var25[var32] != null) {
                                int var33 = (arg2 + var26 & 0x3F << 6) + (arg10 + var17 & 0x3F);
                                int var34 = var25[var32][var33];
                                if (var34 != 0) {
                                    class36 var35 = class134.method970(var34 - 1, 0);
                                    if (!class11.field132[var35.field449]) {
                                        if (var13 != -1 && class121.field1764 == var35.field449) {
                                            class96 var36 = new class96();
                                            var36.field1417 = var35.field449;
                                            var36.field1422 = var30;
                                            var36.field1418 = var22;
                                            class174.field2834.method1385(var36, true);
                                        } else {
                                            class217.field3443[var35.field449].method60(var22 - 7, var30 + -7);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        for (class96 var18 = (class96) class174.field2834.method1384(2); var18 != null; var18 = (class96) class174.field2834.method1388((byte) 91)) {
            class70.method494(var18.field1418, var18.field1422, 15, 16776960, var13);
            class70.method494(var18.field1418, var18.field1422, 13, 16776960, var13);
            class70.method494(var18.field1418, var18.field1422, 11, 16776960, var13);
            class70.method494(var18.field1418, var18.field1422, 9, 16776960, var13);
            class217.field3443[var18.field1417].method60(var18.field1418 - 7, var18.field1422 + -7);
        }
        if (arg3 < 112) {
            method1795(true);
        }
        class174.field2834.method1382(0);
    }
}
