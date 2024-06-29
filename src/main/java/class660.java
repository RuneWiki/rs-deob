import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gj")
public class class660 {

    @OriginalMember(owner = "client!gj", name = "r", descriptor = "I")
    public int field9537;

    @OriginalMember(owner = "client!gj", name = "d", descriptor = "[B")
    private byte[] field9532;

    @OriginalMember(owner = "client!gj", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field9549 = new String[] { method4844(method4843("e\u0017k%I")), method4844(method4843("l\b)\u000b")), method4844(method4843("ySkI\u001c")), method4844(method4843("e\u0017k&I")), method4844(method4843("e\u0017k$I")), method4844(method4843("e\u0017k#I")), method4844(method4843("e\u0017k[\bl\u00141YI")), method4844(method4843("e\u0017k\"I")) };

    @OriginalMember(owner = "client!gj", name = "f", descriptor = "[[F")
    public static float[][] field9531 = new float[][] { { -0.333333F, -0.333333F, -0.333333F }, { 0.333333F, -0.333333F, -0.333333F }, { -0.333333F, 0.333333F, -0.333333F }, { 0.333333F, 0.333333F, -0.333333F }, { -0.333333F, -0.333333F, 0.333333F }, { 0.333333F, -0.333333F, 0.333333F }, { -0.333333F, 0.333333F, 0.333333F }, { 0.333333F, 0.333333F, 0.333333F } };

    @OriginalMember(owner = "client!gj", name = "m", descriptor = "[I")
    public static int[] field9538 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!gj", name = "w", descriptor = "[Lhs;")
    public static class344[] field9534 = new class344[14];

    @OriginalMember(owner = "client!gj", name = "e", descriptor = "[I")
    public static int[] field9543 = new int[50];

    @OriginalMember(owner = "client!gj", name = "o", descriptor = "I")
    public int field9525;

    @OriginalMember(owner = "client!gj", name = "q", descriptor = "I")
    public static int field9526;

    @OriginalMember(owner = "client!gj", name = "t", descriptor = "I")
    public static int field9535;

    @OriginalMember(owner = "client!gj", name = "n", descriptor = "I")
    public int field9536;

    @OriginalMember(owner = "client!gj", name = "j", descriptor = "I")
    public static int field9541;

    @OriginalMember(owner = "client!gj", name = "k", descriptor = "I")
    public static int field9544;

    @OriginalMember(owner = "client!gj", name = "x", descriptor = "I")
    public int field9545;

    @OriginalMember(owner = "client!gj", name = "l", descriptor = "I")
    public static int field9547;

    @OriginalMember(owner = "client!gj", name = "p", descriptor = "Lsu;")
    public class222 field9527;

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "[I")
    public int[] field9528;

    @OriginalMember(owner = "client!gj", name = "v", descriptor = "[I")
    public int[] field9533;

    @OriginalMember(owner = "client!gj", name = "g", descriptor = "[I")
    public int[] field9540;

    @OriginalMember(owner = "client!gj", name = "c", descriptor = "[I")
    public int[] field9542;

    @OriginalMember(owner = "client!gj", name = "i", descriptor = "[I")
    public int[] field9546;

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "[I")
    public int[] field9548;

    @OriginalMember(owner = "client!gj", name = "h", descriptor = "[Lsu;")
    public class222[] field9524;

    @OriginalMember(owner = "client!gj", name = "u", descriptor = "[[B")
    public byte[][] field9530;

    @OriginalMember(owner = "client!gj", name = "y", descriptor = "[[I")
    public int[][] field9529;

    @OriginalMember(owner = "client!gj", name = "s", descriptor = "[[I")
    public int[][] field9539;

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(III)V")
    public static final void method4838(int arg0, int arg1, int arg2) {
        try {
            field9526++;
            if (class445.field6530 == 1) {
                class521.method3959(class725.field10470, arg2, arg1, -72);
            } else if (class445.field6530 == 2) {
                if (class235.field3549) {
                    class304.method2582((byte) -95, arg1 + class398.method3141(arg0 ^ 0xFFFFB429), class779.method5635((byte) 32) + arg2);
                } else {
                    class304.method2582((byte) -115, arg1, arg2);
                }
            }
            class725.field10470 = null;
            class445.field6530 = 0;
            if (arg0 != -19416) {
                method4840((byte) 19);
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field9549[3] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(IIIBII)V")
    public static final void method4839(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        try {
            field9541++;
            int var6 = arg2 - arg0;
            int var7 = arg5 - arg1;
            int var8 = 16 % ((arg3 + 60) / 50);
            if (var7 == 0) {
                if (var6 != 0) {
                    class57.method422(arg2, arg1, (byte) 57, arg4, arg0);
                }
            } else if (var6 == 0) {
                class45.method350(arg5, arg1, -94, arg4, arg0);
            } else {
                if (var7 < 0) {
                    var7 = -var7;
                }
                if (var6 < 0) {
                    var6 = -var6;
                }
                boolean var9 = var7 < var6;
                if (var9) {
                    int var10 = arg1;
                    int var11 = arg5;
                    arg1 = arg0;
                    arg5 = arg2;
                    arg0 = var10;
                    arg2 = var11;
                }
                if (arg1 > arg5) {
                    int var12 = arg1;
                    arg1 = arg5;
                    int var13 = arg0;
                    arg0 = arg2;
                    arg5 = var12;
                    arg2 = var13;
                }
                int var14 = arg0;
                int var15 = arg5 - arg1;
                int var16 = arg2 - arg0;
                int var17 = -(var15 >> 1);
                if (var16 < 0) {
                    var16 = -var16;
                }
                int var18 = arg0 < arg2 ? 1 : -1;
                if (var9) {
                    for (int var19 = arg1; var19 <= arg5; var19++) {
                        class243.field3731[var19][var14] = arg4;
                        var17 += var16;
                        if (var17 > 0) {
                            var17 -= var15;
                            var14 += var18;
                        }
                    }
                } else {
                    for (int var20 = arg1; var20 <= arg5; var20++) {
                        var17 += var16;
                        class243.field3731[var14][var20] = arg4;
                        if (var17 > 0) {
                            var17 -= var15;
                            var14 += var18;
                        }
                    }
                }
            }
        } catch (RuntimeException var22) {
            throw class759.method5498(var22, field9549[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(B)V")
    public static void method4840(byte arg0) {
        try {
            field9543 = null;
            field9531 = null;
            field9534 = null;
            if (arg0 != 121) {
                method4839(-60, 43, -54, (byte) 114, -103, 69);
            }
            field9538 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field9549[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(I[B)V")
    private final void method4841(int arg0, byte[] arg1) {
        try {
            field9547++;
            class163 var3 = new class163(class374.method3015(arg1, 1580));
            int var4 = var3.method1455((byte) 62);
            if (var4 < 5 || var4 > 6) {
                throw new RuntimeException();
            }
            if (arg0 >= ~var4) {
                this.field9536 = var3.method1453((byte) 94);
            } else {
                this.field9536 = 0;
            }
            int var5 = var3.method1455((byte) 62);
            boolean var6 = (var5 & 0x1) != 0;
            this.field9545 = var3.method1445((byte) 125);
            boolean var7 = (var5 & 0x2) != 0;
            int var8 = 0;
            this.field9528 = new int[this.field9545];
            int var9 = -1;
            for (int var10 = 0; var10 < this.field9545; var10++) {
                this.field9528[var10] = var8 += var3.method1445((byte) 116);
                if (var9 < this.field9528[var10]) {
                    var9 = this.field9528[var10];
                }
            }
            this.field9525 = var9 + 1;
            this.field9542 = new int[this.field9525];
            if (var7) {
                this.field9530 = new byte[this.field9525][];
            }
            this.field9548 = new int[this.field9525];
            this.field9539 = new int[this.field9525][];
            this.field9546 = new int[this.field9525];
            this.field9540 = new int[this.field9525];
            if (var6) {
                this.field9533 = new int[this.field9525];
                for (int var11 = 0; var11 < this.field9525; var11++) {
                    this.field9533[var11] = -1;
                }
                for (int var12 = 0; var12 < this.field9545; var12++) {
                    this.field9533[this.field9528[var12]] = var3.method1453((byte) 80);
                }
                this.field9527 = new class222(this.field9533);
            }
            for (int var13 = 0; var13 < this.field9545; var13++) {
                this.field9540[this.field9528[var13]] = var3.method1453((byte) 127);
            }
            if (var7) {
                for (int var14 = 0; var14 < this.field9545; var14++) {
                    byte[] var15 = new byte[64];
                    var3.method1413(var15, -16385, 64, 0);
                    this.field9530[this.field9528[var14]] = var15;
                }
            }
            for (int var16 = 0; var16 < this.field9545; var16++) {
                this.field9548[this.field9528[var16]] = var3.method1453((byte) 120);
            }
            for (int var17 = 0; var17 < this.field9545; var17++) {
                this.field9546[this.field9528[var17]] = var3.method1445((byte) 114);
            }
            for (int var18 = 0; var18 < this.field9545; var18++) {
                int var19 = this.field9528[var18];
                int var20 = 0;
                int var21 = this.field9546[var19];
                this.field9539[var19] = new int[var21];
                int var22 = -1;
                for (int var23 = 0; var23 < var21; var23++) {
                    int var24 = this.field9539[var19][var23] = var20 += var3.method1445((byte) 106);
                    if (var24 > var22) {
                        var22 = var24;
                    }
                }
                this.field9542[var19] = var22 + 1;
                if ((var22 + 1) == var21) {
                    this.field9539[var19] = null;
                }
            }
            if (var6) {
                this.field9529 = new int[var9 + 1][];
                this.field9524 = new class222[var9 + 1];
                for (int var25 = 0; var25 < this.field9545; var25++) {
                    int var26 = this.field9528[var25];
                    int var27 = this.field9546[var26];
                    this.field9529[var26] = new int[this.field9542[var26]];
                    for (int var28 = 0; var28 < this.field9542[var26]; var28++) {
                        this.field9529[var26][var28] = -1;
                    }
                    for (int var29 = 0; var29 < var27; var29++) {
                        int var30;
                        if (this.field9539[var26] == null) {
                            var30 = var29;
                        } else {
                            var30 = this.field9539[var26][var29];
                        }
                        this.field9529[var26][var30] = var3.method1453((byte) 96);
                    }
                    this.field9524[var26] = new class222(this.field9529[var26]);
                }
            }
        } catch (RuntimeException var32) {
            throw class759.method5498(var32, field9549[0] + arg0 + ',' + (arg1 == null ? field9549[1] : field9549[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(BII)Z")
    public static final boolean method4842(byte arg0, int arg1, int arg2) {
        try {
            field9535++;
            int var3 = -77 / ((arg0 + 10) / 47);
            return (arg2 & 0x22) != 0;
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field9549[5] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!gj", name = "<init>", descriptor = "([BI[B)V")
    public class660(byte[] arg0, int arg1, byte[] arg2) {
        try {
            this.field9537 = class195.method1662(3289650, arg0.length, arg0);
            if (this.field9537 != arg1) {
                throw new RuntimeException();
            }
            if (arg2 != null) {
                if (arg2.length != 64) {
                    throw new RuntimeException();
                }
                this.field9532 = class127.method1108((byte) -16, arg0.length, 0, arg0);
                for (int var4 = 0; var4 < 64; var4++) {
                    if (this.field9532[var4] != arg2[var4]) {
                        throw new RuntimeException();
                    }
                }
            }
            this.method4841(-7, arg0);
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field9549[6] + (arg0 == null ? field9549[1] : field9549[2]) + ',' + arg1 + ',' + (arg2 == null ? field9549[1] : field9549[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!gj", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4843(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x61);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!gj", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4844(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 2;
                    break;
                case 1:
                    var10005 = 125;
                    break;
                case 2:
                    var10005 = 69;
                    break;
                case 3:
                    var10005 = 103;
                    break;
                default:
                    var10005 = 97;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
