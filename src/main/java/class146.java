import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cl")
public class class146 {

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "I")
    public static int field2384 = 0;

    @OriginalMember(owner = "client!cl", name = "j", descriptor = "[I")
    public static int[] field2392 = new int[500];

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "F")
    public static float field2383;

    @OriginalMember(owner = "client!cl", name = "c", descriptor = "I")
    public static int field2385;

    @OriginalMember(owner = "client!cl", name = "e", descriptor = "I")
    public static int field2387;

    @OriginalMember(owner = "client!cl", name = "f", descriptor = "I")
    public static int field2388;

    @OriginalMember(owner = "client!cl", name = "g", descriptor = "I")
    public static int field2389;

    @OriginalMember(owner = "client!cl", name = "h", descriptor = "I")
    public static int field2390;

    @OriginalMember(owner = "client!cl", name = "i", descriptor = "Lpl;")
    public static class344 field2391;

    @OriginalMember(owner = "client!cl", name = "d", descriptor = "[[[B")
    public static byte[][][] field2386;

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(I[[II[[I[[F[[FZIIIIII[[FILmi;FI)I", line = 5)
    public static final int method1216(int arg0, int[][] arg1, int arg2, int[][] arg3, float[][] arg4, float[][] arg5, boolean arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, float[][] arg13, int arg14, class125 arg15, float arg16, int arg17) {
        if (arg0 == 1) {
            int var19 = arg12;
            arg12 = arg9;
            arg9 = 128 - var19;
        } else if (arg0 == 2) {
            arg9 = 128 - arg9;
            arg12 = 128 - arg12;
        } else if (arg0 == 3) {
            int var18 = arg12;
            arg12 = 128 - arg9;
            arg9 = var18;
        }
        field2388++;
        if (arg8 != -11347) {
            field2386 = (byte[][][]) ((byte[][][]) null);
        }
        float var20;
        float var21;
        int var22;
        float var23;
        if (arg12 == 0 && arg9 == 0) {
            var20 = arg13[arg7][arg11];
            var21 = arg5[arg7][arg11];
            var22 = arg17;
            var23 = arg4[arg7][arg11];
        } else if (arg12 == 128 && arg9 == 0) {
            var20 = arg13[arg7 + 1][arg11];
            var22 = arg10;
            var21 = arg5[arg7 + 1][arg11];
            var23 = arg4[arg7 + 1][arg11];
        } else if (arg12 == 128 && arg9 == 128) {
            var20 = arg13[arg7 + 1][arg11 + 1];
            var23 = arg4[arg7 + 1][arg11 + 1];
            var21 = arg5[arg7 + 1][arg11 + 1];
            var22 = arg14;
        } else if (arg12 == 0 && arg9 == 128) {
            var23 = arg4[arg7][arg11 + 1];
            var21 = arg5[arg7][arg11 + 1];
            var20 = arg13[arg7][arg11 + 1];
            var22 = arg2;
        } else {
            float var24 = arg5[arg7][arg11];
            float var25 = arg13[arg7][arg11];
            float var26 = (float) arg12 / 128.0F;
            float var27 = arg4[arg7][arg11 + 1];
            float var28 = (arg13[arg7 + 1][arg11] - var25) * var26 + var25;
            float var29 = (arg5[arg7 + 1][arg11] - var24) * var26 + var24;
            float var30 = (float) arg9 / 128.0F;
            float var31 = (arg4[arg7 + 1][arg11 + 1] - var27) * var26 + var27;
            float var32 = arg4[arg7][arg11];
            float var33 = (arg4[arg7 + 1][arg11] - var32) * var26 + var32;
            var23 = (var31 - var33) * var30 + var33;
            float var34 = arg13[arg7][arg11 + 1];
            float var35 = arg5[arg7][arg11 + 1];
            float var36 = (arg13[arg7 + 1][arg11 + 1] - var34) * var26 + var34;
            float var37 = (arg5[arg7 + 1][arg11 + 1] - var35) * var26 + var35;
            var21 = (var37 - var29) * var30 + var29;
            var20 = (var36 - var28) * var30 + var28;
            int var38 = class36.method364(arg10, arg17, (byte) 97, arg12);
            int var39 = class36.method364(arg14, arg2, (byte) 97, arg12);
            var22 = class36.method364(var39, var38, (byte) 97, arg9);
        }
        int var40 = (arg7 << 7) + arg12;
        int var41 = (arg11 << 7) + arg9;
        int var42 = class131.method1131(arg7, arg12, arg9, arg11, -2134986041, arg3);
        return arg15.method1081(var40, var42, var41, var23, var21, var20, arg6 ? var22 & 0xFFFFFF00 : var22, arg1 == null ? 0.0F : (float) (var42 - class131.method1131(arg7, arg12, arg9, arg11, -2134986041, arg1)) / arg16);
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(I)V", line = 115)
    public static void method1217(int arg0) {
        if (arg0 >= -93) {
            field2383 = 2.724645F;
        }
        field2392 = null;
        field2391 = null;
        field2386 = (byte[][][]) null;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "([BI)V", line = 132)
    public static final void method1218(byte[] arg0, int arg1) {
        field2390++;
        class25 var2 = new class25(arg0);
        var2.field397 = arg0.length - 2;
        class9.field132 = var2.method314((byte) 91);
        class25.field396 = new byte[class9.field132][];
        class172.field2732 = new byte[class9.field132][];
        class62.field957 = new int[class9.field132];
        class150.field2449 = new int[class9.field132];
        class89.field1262 = new int[class9.field132];
        class172.field2744 = new boolean[class9.field132];
        class358.field5694 = new int[class9.field132];
        var2.field397 = arg0.length - (class9.field132 * 8 + 7);
        class280.field4332 = var2.method314((byte) 89);
        class49.field776 = var2.method314((byte) 72);
        int var3 = (var2.method281(-124) & 0xFF) + 1;
        if (arg1 != -1835684146) {
            method1220((class70) null, (class18) null, false, -123, (class18) null);
        }
        for (int var4 = 0; var4 < class9.field132; var4++) {
            class150.field2449[var4] = var2.method314((byte) 73);
        }
        for (int var5 = 0; var5 < class9.field132; var5++) {
            class89.field1262[var5] = var2.method314((byte) 90);
        }
        for (int var6 = 0; var6 < class9.field132; var6++) {
            class358.field5694[var6] = var2.method314((byte) 41);
        }
        for (int var7 = 0; var7 < class9.field132; var7++) {
            class62.field957[var7] = var2.method314((byte) 84);
        }
        var2.field397 = arg0.length - (var3 - 1) * 3 - (class9.field132 * 8) - 7;
        class38.field582 = new int[var3];
        for (int var8 = 1; var8 < var3; var8++) {
            class38.field582[var8] = var2.method265(true);
            if (class38.field582[var8] == 0) {
                class38.field582[var8] = 1;
            }
        }
        var2.field397 = 0;
        for (int var9 = 0; var9 < class9.field132; var9++) {
            int var10 = class358.field5694[var9];
            int var11 = class62.field957[var9];
            int var12 = var10 * var11;
            byte[] var13 = new byte[var12];
            byte[] var14 = new byte[var12];
            boolean var15 = false;
            class172.field2732[var9] = var13;
            class25.field396[var9] = var14;
            int var16 = var2.method281(arg1 ^ 0x6D6A514E);
            if ((var16 & 0x1) == 0) {
                for (int var17 = 0; var17 < var12; var17++) {
                    var13[var17] = var2.method286((byte) 113);
                }
                if ((var16 & 0x2) != 0) {
                    for (int var18 = 0; var18 < var12; var18++) {
                        byte var19 = var14[var18] = var2.method286((byte) 120);
                        var15 |= var19 != -1;
                    }
                }
            } else {
                int var20 = 0;
                label102: while (true) {
                    if (var10 <= var20) {
                        if ((var16 & 0x2) == 0) {
                            break;
                        }
                        int var22 = 0;
                        while (true) {
                            if (var22 >= var10) {
                                break label102;
                            }
                            for (int var23 = 0; var23 < var11; var23++) {
                                byte var24 = var14[var10 * var23 + var22] = var2.method286((byte) 89);
                                var15 |= var24 != -1;
                            }
                            var22++;
                        }
                    }
                    for (int var21 = 0; var21 < var11; var21++) {
                        var13[var10 * var21 + var20] = var2.method286((byte) 106);
                    }
                    var20++;
                }
            }
            class172.field2744[var9] = var15;
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(II)V", line = 298)
    public static final void method1219(int arg0, int arg1) {
        class329 var2 = class170.field2689[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; var3++) {
            class329 var4 = class170.field2689[var3][arg0][arg1] = class170.field2689[var3 + 1][arg0][arg1];
            if (var4 != null) {
                var4.field5067--;
                for (int var5 = 0; var5 < var4.field5063; var5++) {
                    class297 var6 = var4.field5070[var5];
                    if ((var6.field4611 >> 29 & 0x3L) == 2L && var6.field4616 == arg0 && var6.field4614 == arg1) {
                        var6.field4617--;
                    }
                }
            }
        }
        if (class170.field2689[0][arg0][arg1] == null) {
            class170.field2689[0][arg0][arg1] = new class329(0, arg0, arg1);
        }
        class170.field2689[0][arg0][arg1].field5068 = var2;
        class170.field2689[3][arg0][arg1] = null;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(Lqk;Lrn;ZILrn;)V", line = 335)
    public static final void method1220(class70 arg0, class18 arg1, boolean arg2, int arg3, class18 arg4) {
        class192.field3031 = arg2;
        field2385++;
        class10.field137 = arg1;
        class315.field4865 = arg4;
        int var5 = class10.field137.method185(false) - 1;
        class310.field4791 = var5 * 256 + class10.field137.method197((byte) -83, var5);
        class201.field3102 = new String[] { null, null, null, null, class126.field2109 };
        if (arg3 != -5789) {
            method1216(-85, (int[][]) ((int[][]) null), 20, (int[][]) ((int[][]) null), (float[][]) ((float[][]) null), (float[][]) ((float[][]) null), true, -33, -46, 22, -15, 73, -91, (float[][]) ((float[][]) null), -114, (class125) null, -0.9964798F, -14);
        }
        class363.field5749 = new String[] { null, null, class87.field1252, null, null };
        class356.field5675 = arg0;
    }

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "(I)V", line = 354)
    public static final void method1221(int arg0) {
        if (arg0 == -32463) {
            class9.field125.method656(0);
            field2389++;
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(JJ)J", line = 365)
    public static long method1222(long arg0, long arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(IZLrg;I)V", line = 384)
    public static final void method1223(int arg0, boolean arg1, class342 arg2, int arg3) {
        if (!arg1) {
            method1220((class70) null, (class18) null, false, -106, (class18) null);
        }
        if (arg2.field5301 == 0) {
            arg2.field5350 = arg2.field5315;
        } else if (arg2.field5301 == 1) {
            arg2.field5350 = (arg0 - arg2.field5374) / 2 + arg2.field5315;
        } else if (arg2.field5301 == 2) {
            arg2.field5350 = arg0 - arg2.field5374 - arg2.field5315;
        } else if (arg2.field5301 == 3) {
            arg2.field5350 = arg2.field5315 * arg0 >> 14;
        } else if (arg2.field5301 == 4) {
            arg2.field5350 = (arg2.field5315 * arg0 >> 14) + (arg0 - arg2.field5374) / 2;
        } else {
            arg2.field5350 = arg0 - arg2.field5374 - (arg2.field5315 * arg0 >> 14);
        }
        field2387++;
        if (arg2.field5376 == 0) {
            arg2.field5300 = arg2.field5342;
        } else if (arg2.field5376 == 1) {
            arg2.field5300 = (arg3 - arg2.field5339) / 2 + arg2.field5342;
        } else if (arg2.field5376 == 2) {
            arg2.field5300 = arg3 - (arg2.field5339 + arg2.field5342);
        } else if (arg2.field5376 == 3) {
            arg2.field5300 = arg2.field5342 * arg3 >> 14;
        } else if (arg2.field5376 == 4) {
            arg2.field5300 = (arg2.field5342 * arg3 >> 14) + (arg3 - arg2.field5339) / 2;
        } else {
            arg2.field5300 = arg3 - arg2.field5339 - (arg2.field5342 * arg3 >> 14);
        }
        if (!class18.field290 || !(client.method1022(arg2).field3544 != 0 || arg2.field5279 == 0)) {
            return;
        }
        if (arg2.field5350 < 0) {
            arg2.field5350 = 0;
        } else if ((arg2.field5374 + arg2.field5350) > arg0) {
            arg2.field5350 = arg0 - arg2.field5374;
        }
        if (arg2.field5300 < 0) {
            arg2.field5300 = 0;
        } else if (arg3 < (arg2.field5339 + arg2.field5300)) {
            arg2.field5300 = arg3 - arg2.field5339;
        }
    }
}
