import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lm")
public class class19 extends class287 {

    @OriginalMember(owner = "client!lm", name = "u", descriptor = "J")
    public long field255;

    @OriginalMember(owner = "client!lm", name = "t", descriptor = "Ltl;")
    public static class59 field254 = class85.method639("Sie k-Onnen sich selbst nicht selbst auf Ihre Ignorieren)2Liste setzen(Q", 9588);

    @OriginalMember(owner = "client!lm", name = "q", descriptor = "I")
    public static int field251 = 500;

    @OriginalMember(owner = "client!lm", name = "w", descriptor = "[[I")
    public static int[][] field257 = new int[104][104];

    @OriginalMember(owner = "client!lm", name = "k", descriptor = "I")
    public static int field245;

    @OriginalMember(owner = "client!lm", name = "l", descriptor = "I")
    public static int field246;

    @OriginalMember(owner = "client!lm", name = "m", descriptor = "I")
    public static int field247;

    @OriginalMember(owner = "client!lm", name = "n", descriptor = "I")
    public static int field248;

    @OriginalMember(owner = "client!lm", name = "o", descriptor = "I")
    public static int field249;

    @OriginalMember(owner = "client!lm", name = "p", descriptor = "I")
    public static int field250;

    @OriginalMember(owner = "client!lm", name = "r", descriptor = "I")
    public static int field252;

    @OriginalMember(owner = "client!lm", name = "s", descriptor = "I")
    public static int field253;

    @OriginalMember(owner = "client!lm", name = "v", descriptor = "Lme;")
    public static class295 field256;

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(II)V", line = 6)
    public static final void method123(int arg0, int arg1) {
        field252++;
        class149.field2453.method1486(false, arg1);
        class9.field115.method1486(false, arg1);
        if (arg0 == -956273209) {
            class138.field2280.method1486(false, arg1);
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(B)V", line = 28)
    public static void method124(byte arg0) {
        field254 = null;
        field257 = (int[][]) null;
        if (arg0 != 116) {
            field254 = (class59) null;
        }
        field256 = null;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(Lme;III)[Loj;", line = 40)
    public static final class260[] method125(class295 arg0, int arg1, int arg2, int arg3) {
        field245++;
        if (arg1 != -29269) {
            method127(-86, 127);
        }
        return class33.method222(6, arg3, arg2, arg0) ? class180.method1333(true) : null;
    }

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "(B)V", line = 73)
    public static final void method126(byte arg0) {
        field250++;
        if (arg0 < 113) {
            field254 = (class59) null;
        }
        class84.field1316.method1570((byte) 123);
        class212.field3471 = 1;
        class149.field2442 = null;
    }

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "(II)I", line = 87)
    public static final int method127(int arg0, int arg1) {
        int var2 = ((arg0 & 0xAAAAAAAB) >>> 1) + (arg0 & 0x55555555);
        int var3 = ((var2 & 0xCCCCCCCE) >>> 2) + (var2 & 0x33333333);
        int var4 = var3 + (var3 >>> 4) & 0xF0F0F0F;
        int var5 = (var4 >>> 8) + var4;
        int var6 = (var5 >>> 16) + var5;
        field247++;
        if (arg1 != 104) {
            field256 = (class295) null;
        }
        return var6 & 0xFF;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(IB)V", line = 110)
    public static final void method128(int arg0, byte arg1) {
        if (arg1 >= 95) {
            class186 var2 = class67.method561(32, arg0, 2);
            var2.method1381(true);
            field246++;
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(IIII)V", line = 130)
    public static final void method129(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 == 31886) {
            class59 var4 = class233.method1630(new class59[] { class170.field2739, class81.method619((byte) -106, arg0), class71.field1116, class81.method619((byte) -71, arg2 >> 6), class71.field1116, class81.method619((byte) -73, arg1 >> 6), class71.field1116, class81.method619((byte) -106, arg2 & 0x3F), class71.field1116, class81.method619((byte) -109, arg1 & 0x3F) }, arg3 - 34769);
            var4.method502((byte) 106);
            field249++;
            class174.method1279(0, var4);
        }
    }

    @OriginalMember(owner = "client!lm", name = "<init>", descriptor = "()V", line = 146)
    public class19() {
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(III[BZ[Ldl;IIZII)V", line = 158)
    public static final void method130(int arg0, int arg1, int arg2, byte[] arg3, boolean arg4, class30[] arg5, int arg6, int arg7, boolean arg8, int arg9, int arg10) {
        field253++;
        if (!arg4) {
            for (int var11 = 0; var11 < 8; var11++) {
                for (int var12 = 0; var12 < 8; var12++) {
                    if ((arg7 + var11) > 0 && arg7 + var11 < 103 && (arg1 + var12) > 0 && arg1 + var12 < 103) {
                        arg5[arg0].field409[arg7 + var11][arg1 + var12] = class93.method680(arg5[arg0].field409[arg7 + var11][arg1 + var12], -16777217);
                    }
                }
            }
        }
        byte var13;
        if (arg4) {
            var13 = 1;
        } else {
            var13 = 4;
        }
        class170 var14 = new class170(arg3);
        for (int var15 = 0; var15 < var13; var15++) {
            for (int var16 = 0; var16 < 64; var16++) {
                for (int var17 = 0; var17 < 64; var17++) {
                    if (arg6 == var15 && arg2 <= var16 && var16 < arg2 + 8 && var17 >= arg9 && var17 < (arg9 + 8)) {
                        class174.method1284(var14, 0, arg0, arg7 + class97.method738(2, var17 & 0x7, var16 & 0x7, arg10), arg4, 0, class85.method642(var16 & 0x7, 127, var17 & 0x7, arg10) + arg1, arg10, -25150);
                    } else {
                        class174.method1284(var14, 0, 0, -1, arg4, 0, -1, 0, -25150);
                    }
                }
            }
        }
        if (class55.field815 && !arg4) {
            class150 var18 = null;
            while (true) {
                while (var14.field2758.length > var14.field2787) {
                    int var19 = var14.method1221(93);
                    if (var19 == 0) {
                        var18 = new class150(var14);
                    } else if (var19 == 1) {
                        int var20 = var14.method1221(91);
                        if (var20 > 0) {
                            for (int var21 = 0; var21 < var20; var21++) {
                                class211 var22 = new class211(var14);
                                int var23 = var22.field3443 >> 7;
                                int var24 = var22.field3441 >> 7;
                                if (var22.field3447 == arg6 && arg2 <= var23 && var23 < (arg2 + 8) && var24 >= arg9 && var24 < (arg9 + 8)) {
                                    int var25 = (arg7 << 7) + class265.method1837(var22.field3441 & 0x3FF, arg10, var22.field3443 & 0x3FF, false);
                                    int var26 = class33.method221(var22.field3443 & 0x3FF, var22.field3441 & 0x3FF, arg10, 0) + (arg1 << 7);
                                    var22.field3441 = var26;
                                    int var27 = var22.field3441 >> 7;
                                    var22.field3443 = var25;
                                    int var28 = var22.field3443 >> 7;
                                    if (var28 >= 0 && var27 >= 0 && var28 < 104 && var27 < 104) {
                                        var22.field3461 = class97.field1558[var22.field3447][var28][var27] - var22.field3461;
                                        class135.method986(var22);
                                    }
                                }
                            }
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                }
                if (var18 == null) {
                    var18 = new class150();
                }
                class167.field2711[arg7 >> 3][arg1 >> 3] = var18;
                break;
            }
        }
        if (arg8) {
            method124((byte) 122);
        }
    }

    @OriginalMember(owner = "client!lm", name = "<init>", descriptor = "(J)V", line = 307)
    public class19(long arg0) {
        this.field255 = arg0;
    }
}
