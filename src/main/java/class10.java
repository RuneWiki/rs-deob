import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public class class10 {

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "Ljava/lang/String;")
    public static String field85 = "slide:";

    @OriginalMember(owner = "client!mf", name = "h", descriptor = "I")
    public static int field91 = -1;

    @OriginalMember(owner = "client!mf", name = "j", descriptor = "[I")
    public static int[] field93 = new int[100];

    @OriginalMember(owner = "client!mf", name = "m", descriptor = "I")
    public static int field96 = 0;

    @OriginalMember(owner = "client!mf", name = "z", descriptor = "I")
    public static int field109 = 0;

    @OriginalMember(owner = "client!mf", name = "e", descriptor = "Ljava/lang/String;")
    public static String field88 = "shake:";

    @OriginalMember(owner = "client!mf", name = "q", descriptor = "I")
    public static int field100;

    @OriginalMember(owner = "client!mf", name = "r", descriptor = "I")
    public static int field101;

    @OriginalMember(owner = "client!mf", name = "s", descriptor = "I")
    public static int field102;

    @OriginalMember(owner = "client!mf", name = "y", descriptor = "I")
    public int field108;

    @OriginalMember(owner = "client!mf", name = "B", descriptor = "I")
    public static int field111;

    @OriginalMember(owner = "client!mf", name = "C", descriptor = "I")
    public static int field112;

    @OriginalMember(owner = "client!mf", name = "E", descriptor = "I")
    public static int field113;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "I")
    public static int field84;

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "I")
    public static int field86;

    @OriginalMember(owner = "client!mf", name = "d", descriptor = "I")
    public static int field87;

    @OriginalMember(owner = "client!mf", name = "i", descriptor = "I")
    private int field92;

    @OriginalMember(owner = "client!mf", name = "k", descriptor = "I")
    public static int field94;

    @OriginalMember(owner = "client!mf", name = "l", descriptor = "I")
    public static int field95;

    @OriginalMember(owner = "client!mf", name = "n", descriptor = "I")
    public static int field97;

    @OriginalMember(owner = "client!mf", name = "o", descriptor = "I")
    public static int field98;

    @OriginalMember(owner = "client!mf", name = "p", descriptor = "I")
    public static int field99;

    @OriginalMember(owner = "client!mf", name = "F", descriptor = "J")
    private long field114;

    @OriginalMember(owner = "client!mf", name = "g", descriptor = "J")
    private long field90;

    @OriginalMember(owner = "client!mf", name = "t", descriptor = "Lek;")
    public static class167 field103;

    @OriginalMember(owner = "client!mf", name = "G", descriptor = "Lek;")
    public static class167 field115;

    @OriginalMember(owner = "client!mf", name = "A", descriptor = "Llc;")
    public static class86 field110;

    @OriginalMember(owner = "client!mf", name = "f", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field89;

    @OriginalMember(owner = "client!mf", name = "w", descriptor = "Z")
    public boolean field106;

    @OriginalMember(owner = "client!mf", name = "v", descriptor = "[I")
    private int[] field105;

    @OriginalMember(owner = "client!mf", name = "x", descriptor = "[I")
    public int[] field107;

    @OriginalMember(owner = "client!mf", name = "u", descriptor = "[Lce;")
    public static class223[] field104;

    @OriginalMember(owner = "client!mf", name = "H", descriptor = "[[I")
    private int[][] field116;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(ZI)V")
    public final void method75(boolean arg0, int arg1) {
        if (arg1 == 16384) {
            this.field106 = arg0;
            this.method78(0);
            field84++;
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "([IZII[II)V")
    public final void method76(int[] arg0, boolean arg1, int arg2, int arg3, int[] arg4, int arg5) {
        if (this.field92 != arg5) {
            this.field116 = null;
            this.field92 = arg5;
        }
        field97++;
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var7 = 0; var7 < 8; var7++) {
                for (int var8 = 0; var8 < class11.field122; var8++) {
                    class52 var9 = class256.method1808((byte) 17, var8);
                    if (var9 != null && !var9.field745 && (arg1 ? class241.field3843[var7] : class84.field1213[var7]) == var9.field756) {
                        arg0[class144.field2342[var7]] = class244.method1747(var8, Integer.MIN_VALUE);
                        break;
                    }
                }
            }
        }
        this.field106 = arg1;
        this.field107 = arg4;
        this.field105 = arg0;
        this.field108 = arg3;
        this.method78(arg2 ^ arg2);
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(I)V")
    public static void method77(int arg0) {
        field88 = null;
        field89 = null;
        field93 = null;
        field103 = null;
        field115 = null;
        field110 = null;
        field104 = null;
        if (arg0 != -1) {
            method86(-72);
        }
        field85 = null;
    }

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "(I)V")
    private final void method78(int arg0) {
        long[] var2 = class67.field984;
        field112++;
        long var3 = this.field90;
        this.field90 = -1L;
        this.field90 = var2[(int) ((this.field90 ^ (long) (this.field92 >> 8)) & 0xFFL)] ^ this.field90 >>> 8;
        this.field90 = var2[(int) ((this.field90 ^ (long) this.field92) & 0xFFL)] ^ this.field90 >>> 8;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field90 = var2[(int) (((long) (this.field105[var5] >> 24) ^ this.field90) & 0xFFL)] ^ this.field90 >>> 8;
            this.field90 = this.field90 >>> 8 ^ var2[(int) (((long) (this.field105[var5] >> 16) ^ this.field90) & 0xFFL)];
            this.field90 = this.field90 >>> 8 ^ var2[(int) ((this.field90 ^ (long) (this.field105[var5] >> 8)) & 0xFFL)];
            this.field90 = var2[(int) (((long) this.field105[var5] ^ this.field90) & 0xFFL)] ^ this.field90 >>> 8;
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field90 = this.field90 >>> 8 ^ var2[(int) (((long) this.field107[var6] ^ this.field90) & 0xFFL)];
        }
        this.field90 = var2[(int) ((this.field90 ^ (long) (this.field106 ? 1 : 0)) & 0xFFL)] ^ this.field90 >>> 8;
        if ((long) arg0 != var3 && this.field90 != var3) {
            class57.field812.method1552(34, var3);
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
    public static final String method79(int arg0, String arg1) {
        field111++;
        if (arg0 <= 80) {
            field104 = null;
        }
        String var2 = class2.method7(0, class193.method1431(arg1, false));
        if (var2 == null) {
            var2 = "";
        }
        return var2;
    }

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "(I)V")
    public static final void method80(int arg0) {
        field98++;
        class85.field1236.method914(1);
        int var1 = 127 % ((38 - arg0) / 34);
        for (int var2 = 0; var2 < 32; var2++) {
            class83.field1199[var2] = 0L;
        }
        for (int var3 = 0; var3 < 32; var3++) {
            class91.field1356[var3] = 0L;
        }
        class235.field3797 = 0;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(B)V")
    public static final void method81(byte arg0) {
        for (int var1 = 0; var1 < class21.field235; var1++) {
            int var2 = class39.field556[var1];
            class18 var3 = class169.field2730[var2];
            if (var3 != null) {
                class110.method813(-6569, var3, var3.field205.field3997);
            }
        }
        if (arg0 > -69) {
            field110 = null;
        }
        field99++;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IILpi;II)Lpc;")
    public final class22 method82(int arg0, int arg1, class141 arg2, int arg3, int arg4) {
        field113++;
        if (this.field108 != -1) {
            return class234.method1657(0, this.field108).method1748(arg0, arg4, (byte) -122, arg2, arg3);
        }
        if (arg1 < 39) {
            this.method82(-110, 49, (class141) null, 43, 121);
        }
        class22 var6 = (class22) class264.field4282.method1553(this.field90, (byte) -80);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < 12; var8++) {
                int var17 = this.field105[var8];
                if ((var17 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var17) != 0 && !class256.method1808((byte) 17, var17 & 0x3FFFFFFF).method393(true)) {
                        var7 = true;
                    }
                } else if (!class254.method1800(var17 & 0x3FFFFFFF, 15017).method458(this.field106, (byte) 121)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            int var9 = 0;
            class173[] var10 = new class173[12];
            for (int var11 = 0; var11 < 12; var11++) {
                int var14 = this.field105[var11];
                if ((var14 & 0x40000000) != 0) {
                    class173 var16 = class254.method1800(var14 & 0x3FFFFFFF, 15017).method459((byte) -106, this.field106);
                    if (var16 != null) {
                        var10[var9++] = var16;
                    }
                } else if ((var14 & Integer.MIN_VALUE) != 0) {
                    class173 var15 = class256.method1808((byte) 17, var14 & 0x3FFFFFFF).method400(0);
                    if (var15 != null) {
                        var10[var9++] = var15;
                    }
                }
            }
            class173 var12 = new class173(var10, var9);
            for (int var13 = 0; var13 < 5; var13++) {
                if (this.field107[var13] < class29.field358[var13].length) {
                    var12.method1283(class247.field4130[var13], class29.field358[var13][this.field107[var13]]);
                }
                if (this.field107[var13] < class90.field1340[var13].length) {
                    var12.method1283(class64.field958[var13], class90.field1340[var13][this.field107[var13]]);
                }
            }
            var6 = var12.method1293(64, 768, -50, -10, -50);
            class264.field4282.method1551(var6, 0, this.field90);
        }
        if (arg2 != null) {
            var6 = arg2.method1004(arg4, arg0, 3, var6, arg3);
        }
        return var6;
    }

    @OriginalMember(owner = "client!mf", name = "d", descriptor = "(I)I")
    public final int method83(int arg0) {
        field100++;
        return ~this.field108 == arg0 ? (this.field107[0] << 25) + this.field105[1] + (this.field105[11] << 5) + (this.field107[4] << 20) + (this.field105[8] << 10) + (this.field105[0] << 15) : class234.method1657(0, this.field108).field3986 + 305419896;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(III)V")
    public final void method84(int arg0, int arg1, int arg2) {
        field101++;
        if (arg1 != 128) {
            method86(-118);
        }
        int var4 = class144.field2342[arg2];
        if (this.field105[var4] != 0 && class256.method1808((byte) 17, arg0) != null) {
            this.field105[var4] = class244.method1747(arg0, Integer.MIN_VALUE);
            this.method78(0);
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIB)V")
    public final void method85(int arg0, int arg1, byte arg2) {
        field86++;
        this.field107[arg1] = arg0;
        if (arg2 != -49) {
            field89 = null;
        }
        this.method78(0);
    }

    @OriginalMember(owner = "client!mf", name = "e", descriptor = "(I)V")
    public static final void method86(int arg0) {
        field95++;
        if (arg0 >= -118) {
            method81((byte) -64);
        }
        int var1 = class77.field1105 * 128 + 64;
        int var2 = class146.field2384 * 128 + 64;
        int var3 = class129.method930(var1, var2, 109, class58.field826) - class98.field1447;
        if (class84.field1223 >= 100) {
            class50.field736 = class146.field2384 * 128 + 64;
            class196.field3177 = class77.field1105 * 128 + 64;
            class185.field2986 = class129.method930(class196.field3177, class50.field736, 72, class58.field826) - class98.field1447;
        } else {
            if (var3 > class185.field2986) {
                class185.field2986 += (var3 - class185.field2986) * class84.field1223 / 1000 + class196.field3181;
                if (class185.field2986 > var3) {
                    class185.field2986 = var3;
                }
            }
            if (class185.field2986 > var3) {
                class185.field2986 -= (class185.field2986 - var3) * class84.field1223 / 1000 + class196.field3181;
                if (class185.field2986 < var3) {
                    class185.field2986 = var3;
                }
            }
            if (class196.field3177 < var1) {
                class196.field3177 += (var1 - class196.field3177) * class84.field1223 / 1000 + class196.field3181;
                if (class196.field3177 > var1) {
                    class196.field3177 = var1;
                }
            }
            if (var1 < class196.field3177) {
                class196.field3177 -= (class196.field3177 - var1) * class84.field1223 / 1000 + class196.field3181;
                if (var1 > class196.field3177) {
                    class196.field3177 = var1;
                }
            }
            if (class50.field736 < var2) {
                class50.field736 += (var2 - class50.field736) * class84.field1223 / 1000 + class196.field3181;
                if (var2 < class50.field736) {
                    class50.field736 = var2;
                }
            }
            if (var2 < class50.field736) {
                class50.field736 -= (class50.field736 - var2) * class84.field1223 / 1000 + class196.field3181;
                if (var2 > class50.field736) {
                    class50.field736 = var2;
                }
            }
        }
        int var4 = class293.field4651 * 128 + 64;
        int var5 = class46.field666 * 128 + 64;
        int var6 = class129.method930(var4, var5, 79, class58.field826) - class61.field849;
        int var7 = var6 - class185.field2986;
        int var8 = var4 - class196.field3177;
        int var9 = var5 - class50.field736;
        int var10 = (int) Math.sqrt((double) (var8 * var8 + var9 * var9));
        int var11 = (int) (Math.atan2((double) var7, (double) var10) * 325.949D) & 0x7FF;
        if (var11 < 128) {
            var11 = 128;
        }
        if (var11 > 383) {
            var11 = 383;
        }
        int var12 = (int) (Math.atan2((double) var9, (double) var8) * -325.949D) & 0x7FF;
        if (var11 > class67.field988) {
            class67.field988 += (var11 - class67.field988) * class241.field3839 / 1000 + class187.field3007;
            if (var11 < class67.field988) {
                class67.field988 = var11;
            }
        }
        int var13 = var12 - class218.field3485;
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var11 < class67.field988) {
            class67.field988 -= (class67.field988 - var11) * class241.field3839 / 1000 + class187.field3007;
            if (class67.field988 < var11) {
                class67.field988 = var11;
            }
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var13 > 0) {
            class218.field3485 += class241.field3839 * var13 / 1000 + class187.field3007;
            class218.field3485 &= 0x7FF;
        }
        if (var13 < 0) {
            class218.field3485 -= -var13 * class241.field3839 / 1000 + class187.field3007;
            class218.field3485 &= 0x7FF;
        }
        int var14 = var12 - class218.field3485;
        if (var14 > 1024) {
            var14 -= 2048;
        }
        if (var14 < -1024) {
            var14 += 2048;
        }
        if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
            class218.field3485 = var12;
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIIIIILpi;I)Lpc;")
    public final class22 method87(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class141 arg6, int arg7) {
        if (arg0 <= 115) {
            return null;
        }
        long var9 = (long) arg4 | (long) (arg1 << 16) | (long) arg7 << 32;
        class22 var11 = (class22) class264.field4282.method1553(var9, (byte) -102);
        field87++;
        if (var11 == null) {
            class173[] var12 = new class173[3];
            int var13 = 0;
            if (!class256.method1808((byte) 17, arg4).method393(true) || !class256.method1808((byte) 17, arg1).method393(true) || !class256.method1808((byte) 17, arg7).method393(true)) {
                return null;
            }
            class173 var14 = class256.method1808((byte) 17, arg4).method400(0);
            if (var14 != null) {
                var12[var13++] = var14;
            }
            class173 var15 = class256.method1808((byte) 17, arg1).method400(0);
            if (var15 != null) {
                var12[var13++] = var15;
            }
            class173 var16 = class256.method1808((byte) 17, arg7).method400(0);
            if (var16 != null) {
                var12[var13++] = var16;
            }
            class173 var17 = new class173(var12, var13);
            for (int var18 = 0; var18 < 5; var18++) {
                if (class29.field358[var18].length > this.field107[var18]) {
                    var17.method1283(class247.field4130[var18], class29.field358[var18][this.field107[var18]]);
                }
                if (this.field107[var18] < class90.field1340[var18].length) {
                    var17.method1283(class64.field958[var18], class90.field1340[var18][this.field107[var18]]);
                }
            }
            var11 = var17.method1293(64, 768, -50, -10, -50);
            class264.field4282.method1551(var11, 0, var9);
        }
        if (arg6 != null) {
            var11 = arg6.method1004(arg5, arg3, 3, var11, arg2);
        }
        return var11;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IILpi;ILpi;IZII[Lfd;I)Lpc;")
    public final class22 method88(int arg0, int arg1, class141 arg2, int arg3, class141 arg4, int arg5, boolean arg6, int arg7, int arg8, class124[] arg9, int arg10) {
        field94++;
        if (this.field108 != -1) {
            return class234.method1657(0, this.field108).method1759(arg2, arg7, arg9, arg4, arg3, arg5, arg0, arg8, 736535824, arg1);
        }
        long var12 = this.field90;
        int[] var14 = this.field105;
        if (arg2 != null && (arg2.field2257 >= 0 || arg2.field2258 >= 0)) {
            var14 = new int[12];
            for (int var15 = 0; var15 < 12; var15++) {
                var14[var15] = this.field105[var15];
            }
            if (arg2.field2257 >= 0) {
                if (arg2.field2257 == 65535) {
                    var12 ^= 0xFFFFFFFF00000000L;
                    var14[5] = 0;
                } else {
                    var14[5] = class244.method1747(arg2.field2257, 1073741824);
                    var12 ^= (long) var14[5] << 32;
                }
            }
            if (arg2.field2258 >= 0) {
                if (arg2.field2258 == 65535) {
                    var12 ^= 0xFFFFFFFFL;
                    var14[3] = 0;
                } else {
                    var14[3] = class244.method1747(arg2.field2258, 1073741824);
                    var12 ^= (long) var14[3];
                }
            }
        }
        class22 var16 = (class22) class57.field812.method1553(var12, (byte) -121);
        if (var16 == null) {
            boolean var17 = false;
            for (int var18 = 0; var18 < 12; var18++) {
                int var43 = var14[var18];
                if ((var43 & 0x40000000) == 0) {
                    if ((var43 & Integer.MIN_VALUE) != 0 && !class256.method1808((byte) 17, var43 & 0x3FFFFFFF).method394(94)) {
                        var17 = true;
                    }
                } else if (!class254.method1800(var43 & 0x3FFFFFFF, 15017).method448(this.field106, 0)) {
                    var17 = true;
                }
            }
            if (var17) {
                if (this.field114 != -1L) {
                    var16 = (class22) class57.field812.method1553(this.field114, (byte) -128);
                }
                if (var16 == null) {
                    return null;
                }
            }
            if (var16 == null) {
                class173[] var19 = new class173[12];
                for (int var20 = 0; var20 < 12; var20++) {
                    int var40 = var14[var20];
                    if ((var40 & 0x40000000) != 0) {
                        class173 var41 = class254.method1800(var40 & 0x3FFFFFFF, 15017).method443(-9438, this.field106);
                        if (var41 != null) {
                            var19[var20] = var41;
                        }
                    } else if ((Integer.MIN_VALUE & var40) != 0) {
                        class173 var42 = class256.method1808((byte) 17, var40 & 0x3FFFFFFF).method401(true);
                        if (var42 != null) {
                            var19[var20] = var42;
                        }
                    }
                }
                class235 var21 = null;
                if (this.field92 != -1) {
                    var21 = class221.method1586(this.field92, (byte) 76);
                }
                if (var21 != null && var21.field3799 != null) {
                    for (int var22 = 0; var22 < var21.field3799.length; var22++) {
                        if (var21.field3799[var22] != null && var19[var22] != null) {
                            int var23 = var21.field3799[var22][0];
                            int var24 = var21.field3799[var22][1];
                            int var25 = var21.field3799[var22][2];
                            int var26 = var21.field3799[var22][3];
                            int var27 = var21.field3799[var22][4];
                            int var28 = var21.field3799[var22][5];
                            if (this.field116 == null) {
                                this.field116 = new int[var21.field3799.length][];
                            }
                            if (this.field116[var22] == null) {
                                int[] var29 = this.field116[var22] = new int[15];
                                if (var26 == 0 && var27 == 0 && var28 == 0) {
                                    var29[0] = var29[4] = var29[8] = 32768;
                                    var29[14] = -var25;
                                    var29[12] = -var23;
                                    var29[13] = -var24;
                                } else {
                                    int var30 = class47.field695[var26] >> 1;
                                    int var31 = class47.field679[var26] >> 1;
                                    int var32 = class47.field695[var27] >> 1;
                                    int var33 = class47.field679[var27] >> 1;
                                    int var34 = class47.field695[var28] >> 1;
                                    int var35 = class47.field679[var28] >> 1;
                                    var29[5] = -var31;
                                    var29[8] = var30 * var32 + 16384 >> 15;
                                    int var36 = var31 * var34 + 16384 >> 15;
                                    var29[4] = var30 * var34 + 16384 >> 15;
                                    var29[7] = -var33 * -var35 + (var32 * var36) + 16384 >> 15;
                                    var29[2] = var30 * var33 + 16384 >> 15;
                                    var29[3] = var30 * var35 + 16384 >> 15;
                                    int var37 = var31 * var35 + 16384 >> 15;
                                    var29[6] = -var33 * var34 + var32 * var37 + 16384 >> 15;
                                    var29[1] = -var35 * var32 + var33 * var36 + 16384 >> 15;
                                    var29[0] = var32 * var34 + var33 * var37 + 16384 >> 15;
                                    var29[14] = var29[2] * -var23 + 16384 - (-(var29[5] * -var24) - (var29[8] * -var25)) >> 15;
                                    var29[12] = var29[0] * -var23 + var29[6] * -var25 + var29[3] * -var24 + 16384 >> 15;
                                    var29[13] = var29[4] * -var24 + var29[7] * -var25 + var29[1] * -var23 + 16384 >> 15;
                                }
                                var29[9] = var23;
                                var29[11] = var25;
                                var29[10] = var24;
                            }
                            if (var26 != 0 || var27 != 0 || var28 != 0) {
                                var19[var22].method1285(var26, var27, var28);
                            }
                            if (var23 != 0 || var24 != 0 || var25 != 0) {
                                var19[var22].method1295(var23, var24, var25);
                            }
                        }
                    }
                }
                class173 var38 = new class173(var19, var19.length);
                for (int var39 = 0; var39 < 5; var39++) {
                    if (class29.field358[var39].length > this.field107[var39]) {
                        var38.method1283(class247.field4130[var39], class29.field358[var39][this.field107[var39]]);
                    }
                    if (class90.field1340[var39].length > this.field107[var39]) {
                        var38.method1283(class64.field958[var39], class90.field1340[var39][this.field107[var39]]);
                    }
                }
                var16 = var38.method1293(64, 850, -30, -50, -30);
                if (arg6) {
                    class57.field812.method1551(var16, arg10 ^ 0x40, var12);
                    this.field114 = var12;
                }
            }
        }
        boolean var44 = false;
        boolean var45 = false;
        boolean var46 = false;
        int var47 = arg9 == null ? 0 : arg9.length;
        boolean var48 = false;
        for (int var49 = 0; var49 < var47; var49++) {
            if (arg9[var49] != null) {
                class141 var72 = class285.method1939(arg9[var49].field1818, arg10 + 48);
                if (var72.field2252 != null) {
                    var44 = true;
                    class192.field3094[var49] = var72;
                    int var73 = arg9[var49].field1808;
                    int var74 = arg9[var49].field1807;
                    int var75 = var72.field2252[var74];
                    class294.field4665[var49] = class81.method594(var75 >>> 16, arg10 - 61);
                    int var76 = var75 & 0xFFFF;
                    class184.field2966[var49] = var76;
                    if (class294.field4665[var49] != null) {
                        var46 |= class294.field4665[var49].method1220((byte) 87, var76);
                        var45 |= class294.field4665[var49].method1218((byte) 119, var76);
                        var48 |= var72.field2276;
                    }
                    if ((var72.field2253 || class217.field3444) && var73 != -1 && var73 < var72.field2252.length) {
                        class190.field3069[var49] = var72.field2263[var74];
                        class272.field4375[var49] = arg9[var49].field1809;
                        int var77 = var72.field2252[var73];
                        class106.field1552[var49] = class81.method594(var77 >>> 16, 3);
                        int var78 = var77 & 0xFFFF;
                        class190.field3072[var49] = var78;
                        if (class106.field1552[var49] != null) {
                            var46 |= class106.field1552[var49].method1220((byte) -125, var78);
                            var45 |= class106.field1552[var49].method1218((byte) 119, var78);
                        }
                    } else {
                        class190.field3069[var49] = 0;
                        class272.field4375[var49] = 0;
                        class106.field1552[var49] = null;
                        class190.field3072[var49] = -1;
                    }
                }
            }
        }
        if (!var44 && arg2 == null && arg4 == null) {
            return var16;
        }
        if (arg10 != 64) {
            this.method85(37, 58, (byte) -57);
        }
        int var50 = -1;
        int var51 = -1;
        int var52 = 0;
        class165 var53 = null;
        class165 var54 = null;
        if (arg2 != null) {
            int var55 = arg2.field2252[arg7];
            int var56 = var55 >>> 16;
            var53 = class81.method594(var56, 3);
            var50 = var55 & 0xFFFF;
            if (var53 != null) {
                var46 |= var53.method1220((byte) -128, var50);
                var45 |= var53.method1218((byte) 126, var50);
                var48 |= arg2.field2276;
            }
            if ((arg2.field2253 || class217.field3444) && arg5 != -1 && arg2.field2252.length > arg5) {
                int var57 = arg2.field2252[arg5];
                var52 = arg2.field2263[arg7];
                int var58 = var57 >>> 16;
                var51 = var57 & 0xFFFF;
                if (var56 == var58) {
                    var54 = var53;
                } else {
                    var54 = class81.method594(var51 >>> 16, arg10 - 61);
                }
                if (var54 != null) {
                    var46 |= var54.method1220((byte) -126, var51);
                    var45 |= var54.method1218((byte) 89, var51);
                }
            }
        }
        int var59 = -1;
        int var60 = -1;
        class165 var61 = null;
        class165 var62 = null;
        int var63 = 0;
        if (arg4 != null) {
            int var64 = arg4.field2252[arg8];
            int var65 = var64 >>> 16;
            var61 = class81.method594(var65, 3);
            var59 = var64 & 0xFFFF;
            if (var61 != null) {
                var46 |= var61.method1220((byte) 49, var59);
                var45 |= var61.method1218((byte) 127, var59);
                var48 |= arg4.field2276;
            }
            if ((arg4.field2253 || class217.field3444) && arg0 != -1 && arg0 < arg4.field2252.length) {
                int var66 = arg4.field2252[arg0];
                var63 = arg4.field2263[arg8];
                int var67 = var66 >>> 16;
                var60 = var66 & 0xFFFF;
                if (var65 == var67) {
                    var62 = var61;
                } else {
                    var62 = class81.method594(var60 >>> 16, 3);
                }
                if (var62 != null) {
                    var46 |= var62.method1220((byte) -124, var60);
                    var45 |= var62.method1218((byte) 107, var60);
                }
            }
        }
        class22 var68 = var16.method145(!var45, !var46, !var48);
        int var69 = 0;
        int var70 = 1;
        while (var47 > var69) {
            if (class294.field4665[var69] != null) {
                var68.method165(class294.field4665[var69], class184.field2966[var69], class106.field1552[var69], class190.field3072[var69], class272.field4375[var69] - 1, class190.field3069[var69], var70, class192.field3094[var69].field2276, this.field116[var69]);
            }
            var69++;
            var70 <<= 0x1;
        }
        if (var53 != null && var61 != null) {
            var68.method141(var53, var50, var54, var51, arg3 - 1, var52, var61, var59, var62, var60, arg1 - 1, var63, arg2.field2268, arg2.field2276 | arg4.field2276);
        } else if (var53 != null) {
            var68.method139(var53, var50, var54, var51, arg3 - 1, var52, arg2.field2276);
        } else if (var61 != null) {
            var68.method139(var61, var59, var62, var60, arg1 - 1, var63, arg4.field2276);
        }
        for (int var71 = 0; var71 < var47; var71++) {
            class294.field4665[var71] = null;
            class106.field1552[var71] = null;
            class192.field3094[var71] = null;
        }
        return var68;
    }
}
