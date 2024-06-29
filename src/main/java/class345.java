import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public class class345 {

    @OriginalMember(owner = "client!kh", name = "c", descriptor = "I")
    public int field4683;

    @OriginalMember(owner = "client!kh", name = "l", descriptor = "I")
    public int field4692;

    @OriginalMember(owner = "client!kh", name = "g", descriptor = "Lkh;")
    public class345 field4687;

    @OriginalMember(owner = "client!kh", name = "j", descriptor = "Lwr;")
    public class450 field4690;

    @OriginalMember(owner = "client!kh", name = "f", descriptor = "Lp;")
    public static class161 field4686 = new class161();

    @OriginalMember(owner = "client!kh", name = "k", descriptor = "Lgg;")
    public static class189 field4691 = new class189(8);

    @OriginalMember(owner = "client!kh", name = "n", descriptor = "[[I")
    public static int[][] field4694 = new int[][] { { 2, 4 }, { 2, 4 }, { 5, 2, 4 }, { 4, 5, 2 }, { 2, 4, 5 }, { 5, 2, 4 }, { 1, 6, 2, 5 }, { 1, 6, 7, 1 }, { 6, 7, 1, 1 }, { 0, 8, 9, 8, 9, 4 }, { 8, 9, 4, 0, 8, 9 }, { 2, 10, 0, 10, 11, 11 }, { 2, 4 }, { 1, 6, 7, 1 }, { 1, 6, 7, 1 } };

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "I")
    public int field4681;

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "I")
    public static int field4682;

    @OriginalMember(owner = "client!kh", name = "e", descriptor = "I")
    public int field4685;

    @OriginalMember(owner = "client!kh", name = "h", descriptor = "I")
    public int field4688;

    @OriginalMember(owner = "client!kh", name = "i", descriptor = "I")
    public static int field4689;

    // $FF: synthetic field
    @OriginalMember(owner = "client!kh", name = "o", descriptor = "Ljava/lang/Class;")
    public static Class field4695;

    @OriginalMember(owner = "client!kh", name = "m", descriptor = "[Lwl;")
    public static class440[] field4693;

    @OriginalMember(owner = "client!kh", name = "d", descriptor = "[[S")
    public static short[][] field4684;

    // $FF: synthetic method
    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method2197(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(I)V", line = 5)
    public static void method2193(int arg0) {
        field4693 = null;
        if (arg0 <= -58) {
            field4684 = null;
            field4691 = null;
            field4686 = null;
            field4694 = null;
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(Lg;IIIIIIIIIII)Z", line = 20)
    public static final boolean method2194(class366 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        field4689++;
        int var12 = arg8;
        int var13 = arg6;
        byte var14 = 64;
        byte var15 = 64;
        int var16 = arg8 - var14;
        int var17 = arg6 - var15;
        class428.field5847[var14][var15] = 99;
        class402.field5587[var14][var15] = 0;
        byte var18 = 0;
        if (arg2 > -27) {
            method2196(38, -23, 5, true, true, -127);
        }
        int var19 = 0;
        class11.field135[var18] = arg8;
        int var35 = var18 + 1;
        class261.field3355[var18] = arg6;
        int[][] var20 = arg0.field4977;
        while (true) {
            label286: while (true) {
                int var21;
                int var22;
                int var23;
                int var24;
                int var26;
                do {
                    do {
                        do {
                            label263: do {
                                if (var35 == var19) {
                                    class150.field1760 = var12;
                                    class252.field3300 = var13;
                                    return false;
                                }
                                var12 = class11.field135[var19];
                                var13 = class261.field3355[var19];
                                var21 = var13 - var17;
                                var22 = var12 - var16;
                                var19 = var19 + 1 & 0xFFF;
                                var23 = var12 - arg0.field4982;
                                var24 = var13 - arg0.field4992;
                                if (arg5 == -4) {
                                    if (arg1 == var12 && arg4 == var13) {
                                        class252.field3300 = var13;
                                        class150.field1760 = var12;
                                        return true;
                                    }
                                } else if (arg5 == -3) {
                                    if (class347.method2206(arg1, (byte) -59, var12, arg10, arg3, arg11, arg4, var13, arg10)) {
                                        class252.field3300 = var13;
                                        class150.field1760 = var12;
                                        return true;
                                    }
                                } else if (arg5 == -2) {
                                    if (arg0.method2300(true, arg4, arg1, var12, arg11, arg10, arg3, arg10, arg9, var13)) {
                                        class150.field1760 = var12;
                                        class252.field3300 = var13;
                                        return true;
                                    }
                                } else if (arg5 == -1) {
                                    if (arg0.method2312(var13, arg9, arg10, arg1, arg3, arg4, var12, -1063950782, arg11)) {
                                        class150.field1760 = var12;
                                        class252.field3300 = var13;
                                        return true;
                                    }
                                } else if (arg5 == 0 || arg5 == 1 || arg5 == 2 || arg5 == 3 || arg5 == 9) {
                                    if (arg0.method2315((byte) 108, arg1, arg5, var13, arg4, arg10, arg7, var12)) {
                                        class150.field1760 = var12;
                                        class252.field3300 = var13;
                                        return true;
                                    }
                                } else if (arg0.method2303(arg1, var13, arg5, arg7, 2048, arg10, var12, arg4)) {
                                    class150.field1760 = var12;
                                    class252.field3300 = var13;
                                    return true;
                                }
                                var26 = class402.field5587[var22][var21] + 1;
                                if (var22 > 0 && class428.field5847[var22 - 1][var21] == 0 && (var20[var23 - 1][var24] & 0x43A40000) == 0 && (var20[var23 - 1][var24 + arg10 - 1] & 0x4E240000) == 0) {
                                    int var27 = 1;
                                    while (true) {
                                        if ((arg10 - 1) <= var27) {
                                            class11.field135[var35] = var12 - 1;
                                            class261.field3355[var35] = var13;
                                            class428.field5847[var22 - 1][var21] = 2;
                                            var35 = var35 + 1 & 0xFFF;
                                            class402.field5587[var22 - 1][var21] = var26;
                                            break;
                                        }
                                        if ((var20[var23 - 1][var24 + var27] & 0x4FA40000) != 0) {
                                            break;
                                        }
                                        var27++;
                                    }
                                }
                                if (var22 < 128 - arg10 && class428.field5847[var22 + 1][var21] == 0 && (var20[var23 + arg10][var24] & 0x60E40000) == 0 && (var20[arg10 + var23][var24 - (1 - arg10)] & 0x78240000) == 0) {
                                    int var28 = 1;
                                    while (true) {
                                        if (var28 >= (arg10 - 1)) {
                                            class11.field135[var35] = var12 + 1;
                                            class261.field3355[var35] = var13;
                                            var35 = var35 + 1 & 0xFFF;
                                            class428.field5847[var22 + 1][var21] = 8;
                                            class402.field5587[var22 + 1][var21] = var26;
                                            break;
                                        }
                                        if ((var20[arg10 + var23][var24 + var28] & 0x78E40000) != 0) {
                                            break;
                                        }
                                        var28++;
                                    }
                                }
                                if (var21 > 0 && class428.field5847[var22][var21 - 1] == 0 && (var20[var23][var24 - 1] & 0x43A40000) == 0 && (var20[arg10 + var23 - 1][var24 - 1] & 0x60E40000) == 0) {
                                    int var29 = 1;
                                    while (true) {
                                        if (var29 >= (arg10 - 1)) {
                                            class11.field135[var35] = var12;
                                            class261.field3355[var35] = var13 - 1;
                                            var35 = var35 + 1 & 0xFFF;
                                            class428.field5847[var22][var21 - 1] = 1;
                                            class402.field5587[var22][var21 - 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 + var29][var24 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var29++;
                                    }
                                }
                                if (var21 < (128 - arg10) && class428.field5847[var22][var21 + 1] == 0 && (var20[var23][arg10 + var24] & 0x4E240000) == 0 && (var20[arg10 + var23 - 1][var24 + arg10] & 0x78240000) == 0) {
                                    int var30 = 1;
                                    while (true) {
                                        if (arg10 - 1 <= var30) {
                                            class11.field135[var35] = var12;
                                            class261.field3355[var35] = var13 + 1;
                                            var35 = var35 + 1 & 0xFFF;
                                            class428.field5847[var22][var21 + 1] = 4;
                                            class402.field5587[var22][var21 + 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 + var30][arg10 + var24] & 0x7E240000) != 0) {
                                            break;
                                        }
                                        var30++;
                                    }
                                }
                                if (var22 > 0 && var21 > 0 && class428.field5847[var22 - 1][var21 - 1] == 0 && (var20[var23 - 1][var24 - 1] & 0x43A40000) == 0) {
                                    int var31 = 1;
                                    while (true) {
                                        if (var31 >= arg10) {
                                            class11.field135[var35] = var12 - 1;
                                            class261.field3355[var35] = var13 - 1;
                                            var35 = var35 + 1 & 0xFFF;
                                            class428.field5847[var22 - 1][var21 - 1] = 3;
                                            class402.field5587[var22 - 1][var21 - 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 - 1][var24 + var31 - 1] & 0x4FA40000) != 0 || (var20[var23 + var31 - 1][var24 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var31++;
                                    }
                                }
                                if (128 - arg10 > var22 && var21 > 0 && class428.field5847[var22 + 1][var21 - 1] == 0 && (var20[arg10 + var23][var24 - 1] & 0x60E40000) == 0) {
                                    int var32 = 1;
                                    while (true) {
                                        if (arg10 <= var32) {
                                            class11.field135[var35] = var12 + 1;
                                            class261.field3355[var35] = var13 - 1;
                                            class428.field5847[var22 + 1][var21 - 1] = 9;
                                            var35 = var35 + 1 & 0xFFF;
                                            class402.field5587[var22 + 1][var21 - 1] = var26;
                                            break;
                                        }
                                        if ((var20[arg10 + var23][var24 + var32 - 1] & 0x78E40000) != 0 || (var20[var23 + var32][var24 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var32++;
                                    }
                                }
                                if (var22 > 0 && var21 < 128 - arg10 && class428.field5847[var22 - 1][var21 + 1] == 0 && (var20[var23 - 1][var24 + arg10] & 0x4E240000) == 0) {
                                    for (int var33 = 1; var33 < arg10; var33++) {
                                        if ((var20[var23 - 1][var24 + var33] & 0x4FA40000) != 0 || (var20[var23 + var33 - 1][arg10 + var24] & 0x7E240000) != 0) {
                                            continue label263;
                                        }
                                    }
                                    class11.field135[var35] = var12 - 1;
                                    class261.field3355[var35] = var13 + 1;
                                    var35 = var35 + 1 & 0xFFF;
                                    class428.field5847[var22 - 1][var21 + 1] = 6;
                                    class402.field5587[var22 - 1][var21 + 1] = var26;
                                }
                            } while (var22 >= (128 - arg10));
                        } while (128 - arg10 <= var21);
                    } while (class428.field5847[var22 + 1][var21 + 1] != 0);
                } while ((var20[arg10 + var23][var24 + arg10] & 0x78240000) != 0);
                for (int var34 = 1; var34 < arg10; var34++) {
                    if ((var20[var23 + var34][var24 + arg10] & 0x7E240000) != 0 || (var20[var23 + arg10][var24 + var34] & 0x78E40000) != 0) {
                        continue label286;
                    }
                }
                class11.field135[var35] = var12 + 1;
                class261.field3355[var35] = var13 + 1;
                class428.field5847[var22 + 1][var21 + 1] = 12;
                var35 = var35 + 1 & 0xFFF;
                class402.field5587[var22 + 1][var21 + 1] = var26;
            }
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "()V", line = 466)
    public static final void method2195() {
        for (int var0 = 0; var0 < class208.field2534; var0++) {
            if (!class174.field2007[var0]) {
                class6 var1 = class349.field4761[var0];
                int var2 = var1.field52;
                int var3 = var1.field1076 - 64;
                int var4 = (var3 * 2 >> 7) + 1;
                int var5 = 0;
                int[] var6 = new int[var4 * var4];
                int var7 = var1.field1073 - var3 >> 7;
                int var8 = var1.field1071 - var3 >> 7;
                int var9 = var1.field1071 + var3 >> 7;
                if (var8 < 0) {
                    var5 -= var8;
                    var8 = 0;
                }
                if (var9 >= class262.field3367) {
                    var9 = class262.field3367 - 1;
                }
                for (int var10 = var8; var10 <= var9; var10++) {
                    short var11 = var1.field60[var5];
                    int var12 = var11 >>> 8;
                    int var13 = var4 * var5 + var12;
                    int var14 = (var11 >>> 8) + var7;
                    int var15 = (var11 & 0xFF) + var14 - 1;
                    if (var14 < 0) {
                        var13 -= var14;
                        var14 = 0;
                    }
                    if (var15 >= class43.field512) {
                        var15 = class43.field512 - 1;
                    }
                    for (int var16 = var14; var16 <= var15; var16++) {
                        byte var17 = 1;
                        class133 var18 = class246.method1610(var2, var16, var10, field4695 == null ? (field4695 = method2197("fe")) : field4695);
                        if (var18 != null && var18.field1525 != 0) {
                            if (var18.field1525 == 1) {
                                boolean var19 = var16 - 1 >= var14;
                                boolean var20 = var16 + 1 <= var15;
                                if (!var19 && var10 + 1 <= var9) {
                                    short var21 = var1.field60[var5 + 1];
                                    int var22 = (var21 >>> 8) + var7;
                                    int var23 = (var21 & 0xFF) + var22;
                                    var19 = var16 > var22 && var16 < var23;
                                }
                                if (!var20 && var10 - 1 >= var8) {
                                    short var24 = var1.field60[var5 - 1];
                                    int var25 = (var24 >>> 8) + var7;
                                    int var26 = (var24 & 0xFF) + var25;
                                    var20 = var16 > var25 && var16 < var26;
                                }
                                if (var19 && !var20) {
                                    var17 = 4;
                                } else if (var20 && !var19) {
                                    var17 = 2;
                                }
                            } else {
                                boolean var27 = var16 - 1 >= var14;
                                boolean var28 = var16 + 1 <= var15;
                                if (!var27 && var10 - 1 >= var8) {
                                    short var29 = var1.field60[var5 - 1];
                                    int var30 = (var29 >>> 8) + var7;
                                    int var31 = (var29 & 0xFF) + var30;
                                    var27 = var16 > var30 && var16 < var31;
                                }
                                if (!var28 && var10 + 1 <= var9) {
                                    short var32 = var1.field60[var5 + 1];
                                    int var33 = (var32 >>> 8) + var7;
                                    int var34 = (var32 & 0xFF) + var33;
                                    var28 = var16 > var33 && var16 < var34;
                                }
                                if (var27 && !var28) {
                                    var17 = 3;
                                } else if (var28 && !var27) {
                                    var17 = 5;
                                }
                            }
                        }
                        var6[var13++] = var17;
                    }
                    var5++;
                }
                class174.field2007[var0] = true;
                class304.field4096[var2].method1047(var1, var6);
            }
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(IIIZZI)V", line = 638)
    public static final void method2196(int arg0, int arg1, int arg2, boolean arg3, boolean arg4, int arg5) {
        field4682++;
        if (arg2 < 1) {
            arg2 = 1;
        }
        if (arg1 < 1) {
            arg1 = 1;
        }
        if (!arg4) {
            method2194((class366) null, -46, -85, 70, -29, 16, -96, 32, -122, -67, 4, 116);
        }
        int var6 = arg1 - 334;
        if (var6 < 0) {
            var6 = 0;
        } else if (var6 > 100) {
            var6 = 100;
        }
        int var7 = class52.field616 + ((class167.field1951 - class52.field616) * var6 / 100);
        if (class451.field6297 > var7) {
            var7 = class451.field6297;
        } else if (class262.field3374 < var7) {
            var7 = class262.field3374;
        }
        int var8 = var7 * 512 * arg1 / (arg2 * 334);
        if (var8 < class112.field1315) {
            short var12 = class112.field1315;
            var7 = arg2 * var12 * 334 / (arg1 * 512);
            if (class262.field3374 < var7) {
                var7 = class262.field3374;
                int var13 = arg1 * var7 * 512 / (var12 * 334);
                int var14 = (arg2 - var13) / 2;
                if (arg3) {
                    class267.field3454.method732();
                    class267.field3454.method739((byte) 114, -16777216, arg5, var14, arg0, arg1);
                    class267.field3454.method739((byte) -128, -16777216, arg5 + arg2 - var14, var14, arg0, arg1);
                }
                arg2 -= var14 * 2;
                arg5 += var14;
            }
        } else if (var8 > class372.field5045) {
            short var9 = class372.field5045;
            var7 = var9 * 334 * arg2 / (arg1 * 512);
            if (class451.field6297 > var7) {
                var7 = class451.field6297;
                int var10 = arg2 * var9 * 334 / (var7 * 512);
                int var11 = (arg1 - var10) / 2;
                if (arg3) {
                    class267.field3454.method732();
                    class267.field3454.method739((byte) -127, -16777216, arg5, arg2, arg0, var11);
                    class267.field3454.method739((byte) 43, -16777216, arg5, arg2, arg0 + arg1 - var11, var11);
                }
                arg1 -= var11 * 2;
                arg0 += var11;
            }
        }
        class229.field2926 = (short) arg2;
        class367.field5012 = arg0;
        class307.field4164 = arg1 * var7 / 334;
        class204.field2465 = arg5;
        class269.field3473 = (short) arg1;
    }

    @OriginalMember(owner = "client!kh", name = "<init>", descriptor = "(II)V", line = 741)
    public class345(int arg0, int arg1) {
        this.field4683 = arg1;
        this.field4692 = arg0;
    }

    @OriginalMember(owner = "client!kh", name = "<init>", descriptor = "(Lkh;I)V", line = 749)
    public class345(class345 arg0, int arg1) {
        this.field4687 = arg0;
        this.field4692 = this.field4687.field4692;
        this.field4690 = this.field4687.field4690;
        this.field4683 = this.field4687.field4683 + arg1;
    }
}
