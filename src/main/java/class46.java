import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class46 extends class49 {

    @OriginalMember(owner = "client!gd", name = "sb", descriptor = "[[B")
    private byte[][] field921 = new byte[256][];

    @OriginalMember(owner = "client!gd", name = "Jb", descriptor = "I")
    public int field938 = 0;

    @OriginalMember(owner = "client!gd", name = "wb", descriptor = "[I")
    private int[] field925;

    @OriginalMember(owner = "client!gd", name = "Ab", descriptor = "[I")
    private int[] field929;

    @OriginalMember(owner = "client!gd", name = "xb", descriptor = "[I")
    private int[] field926;

    @OriginalMember(owner = "client!gd", name = "Fb", descriptor = "I")
    private int field934;

    @OriginalMember(owner = "client!gd", name = "bb", descriptor = "I")
    private int field904;

    @OriginalMember(owner = "client!gd", name = "gb", descriptor = "I")
    private static int field909 = -1;

    @OriginalMember(owner = "client!gd", name = "eb", descriptor = "Lqf;")
    private static class117 field907 = class72.method514(99, ")4str");

    @OriginalMember(owner = "client!gd", name = "cb", descriptor = "Lqf;")
    private static class117 field905 = class72.method514(105, "b");

    @OriginalMember(owner = "client!gd", name = "kb", descriptor = "Lqf;")
    private static class117 field913 = class72.method514(113, "img=");

    @OriginalMember(owner = "client!gd", name = "jb", descriptor = "Lqf;")
    private static class117 field912 = class72.method514(117, "u");

    @OriginalMember(owner = "client!gd", name = "fb", descriptor = "Lqf;")
    private static class117 field908 = class72.method514(124, "shad=");

    @OriginalMember(owner = "client!gd", name = "lb", descriptor = "Lqf;")
    private static class117 field914 = class72.method514(125, "str=");

    @OriginalMember(owner = "client!gd", name = "ib", descriptor = "Lqf;")
    private static class117 field911 = class72.method514(116, ")4shad");

    @OriginalMember(owner = "client!gd", name = "tb", descriptor = "I")
    private static int field922 = -1;

    @OriginalMember(owner = "client!gd", name = "pb", descriptor = "I")
    private static int field918 = 0;

    @OriginalMember(owner = "client!gd", name = "hb", descriptor = "I")
    private static int field910 = -1;

    @OriginalMember(owner = "client!gd", name = "Cb", descriptor = "Lqf;")
    private static class117 field931 = class72.method514(109, ")4i");

    @OriginalMember(owner = "client!gd", name = "db", descriptor = "I")
    private static int field906 = 0;

    @OriginalMember(owner = "client!gd", name = "ub", descriptor = "Lqf;")
    private static class117 field923 = class72.method514(103, "gt");

    @OriginalMember(owner = "client!gd", name = "Gb", descriptor = "Lqf;")
    private static class117 field935 = class72.method514(113, "lt");

    @OriginalMember(owner = "client!gd", name = "Eb", descriptor = "Lqf;")
    private static class117 field933 = class72.method514(108, ")4col");

    @OriginalMember(owner = "client!gd", name = "nb", descriptor = "Lqf;")
    private static class117 field916 = class72.method514(127, "i");

    @OriginalMember(owner = "client!gd", name = "zb", descriptor = "I")
    private static int field928 = 0;

    @OriginalMember(owner = "client!gd", name = "mb", descriptor = "Lqf;")
    private static class117 field915 = class72.method514(115, ")4b");

    @OriginalMember(owner = "client!gd", name = "yb", descriptor = "I")
    private static int field927 = -1;

    @OriginalMember(owner = "client!gd", name = "ob", descriptor = "Lqf;")
    private static class117 field917 = class72.method514(119, "shad");

    @OriginalMember(owner = "client!gd", name = "W", descriptor = "Lqf;")
    private static class117 field903 = class72.method514(126, ")4u");

    @OriginalMember(owner = "client!gd", name = "Hb", descriptor = "I")
    private static int field936 = 256;

    @OriginalMember(owner = "client!gd", name = "Db", descriptor = "Lqf;")
    private static class117 field932 = class72.method514(106, "u=");

    @OriginalMember(owner = "client!gd", name = "rb", descriptor = "I")
    private static int field920 = 0;

    @OriginalMember(owner = "client!gd", name = "Ib", descriptor = "Lqf;")
    private static class117 field937 = class72.method514(120, "str");

    @OriginalMember(owner = "client!gd", name = "vb", descriptor = "Lqf;")
    private static class117 field924 = class72.method514(102, "col=");

    @OriginalMember(owner = "client!gd", name = "Kb", descriptor = "Lqf;")
    private static class117 field939 = class72.method514(110, "br");

    @OriginalMember(owner = "client!gd", name = "qb", descriptor = "Ljava/util/Random;")
    private static Random field919 = new Random();

    @OriginalMember(owner = "client!gd", name = "Lb", descriptor = "[Lqf;")
    private static class117[] field940 = new class117[100];

    @OriginalMember(owner = "client!gd", name = "Bb", descriptor = "[Lr;")
    private static class118[] field930;

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(II)V")
    private final void method313(int arg0, int arg1) {
        field910 = -1;
        field922 = -1;
        field927 = arg1;
        field909 = arg1;
        field928 = arg0;
        field906 = arg0;
        field936 = 256;
        field920 = 0;
        field918 = 0;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lqf;IIIII)V")
    public final void method314(class117 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method313(arg3, arg4);
        int[] var7 = new int[arg0.field2799];
        int[] var8 = new int[arg0.field2799];
        for (int var9 = 0; var9 < arg0.field2799; var9++) {
            var7[var9] = (int) (Math.sin((double) arg5 / 5.0D + (double) var9 / 5.0D) * 5.0D);
            var8[var9] = (int) (Math.sin((double) arg5 / 5.0D + (double) var9 / 3.0D) * 5.0D);
        }
        this.method329(arg0, arg1 - this.method331(arg0) / 2, arg2, var7, var8);
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lqf;IIII)V")
    public final void method315(class117 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method313(arg3, arg4);
            this.method335(arg0, arg1 - this.method331(arg0), arg2);
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lqf;I)I")
    public final int method316(class117 arg0, int arg1) {
        return this.method322(arg0, new int[] { arg1 }, field940);
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lqf;)Lqf;")
    public static final class117 method317(class117 arg0) {
        int var1 = arg0.method915(27);
        int var2 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            byte var8 = arg0.field2800[var3];
            if (var8 == 60 || var8 == 62) {
                var2 += 3;
            }
        }
        class117 var4 = new class117();
        var4.field2799 = var1 + var2;
        var4.field2800 = new byte[var4.field2799];
        int var5 = 0;
        for (int var6 = 0; var6 < var1; var6++) {
            byte var7 = arg0.field2800[var6];
            if (var7 == 60) {
                var4.field2800[var5++] = 60;
                var4.field2800[var5++] = 108;
                var4.field2800[var5++] = 116;
                var4.field2800[var5++] = 62;
            } else if (var7 == 62) {
                var4.field2800[var5++] = 60;
                var4.field2800[var5++] = 103;
                var4.field2800[var5++] = 116;
                var4.field2800[var5++] = 62;
            } else {
                var4.field2800[var5++] = var7;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(Lqf;I)V")
    private final void method318(class117 arg0, int arg1) {
        int var3 = 0;
        boolean var4 = false;
        for (int var5 = 0; var5 < arg0.method915(27); var5++) {
            int var6 = arg0.method911(false, var5);
            if (var6 == 60) {
                var4 = true;
            } else if (var6 == 62) {
                var4 = false;
            } else if (!var4 && var6 == 32) {
                var3++;
            }
        }
        if (var3 > 0) {
            field920 = (arg1 - this.method331(arg0) << 8) / var3;
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lqf;IIIIIIIII)V")
    public final void method319(class117 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg0 == null) {
            return;
        }
        this.method313(arg5, arg6);
        if (arg9 == 0) {
            arg9 = this.field938;
        }
        int[] var11 = new int[] { arg3 };
        if (arg4 < this.field934 + this.field904 + arg9 && arg4 < arg9 + arg9) {
            var11 = null;
        }
        int var12 = this.method322(arg0, var11, field940);
        if (arg8 == 3 && var12 == 1) {
            arg8 = 1;
        }
        int var13;
        if (arg8 == 0) {
            var13 = this.field934 + arg2;
        } else if (arg8 == 1) {
            var13 = (arg4 - this.field934 - this.field904 - (var12 - 1) * arg9) / 2 + this.field934 + arg2;
        } else if (arg8 == 2) {
            var13 = arg2 + arg4 - this.field904 - (var12 - 1) * arg9;
        } else {
            int var14 = (arg4 - this.field934 - this.field904 - (var12 - 1) * arg9) / (var12 + 1);
            if (var14 < 0) {
                var14 = 0;
            }
            var13 = this.field934 + arg2 + var14;
            arg9 += var14;
        }
        for (int var15 = 0; var15 < var12; var15++) {
            if (arg7 == 0) {
                this.method335(field940[var15], arg1, var13);
            } else if (arg7 == 1) {
                this.method335(field940[var15], arg1 + (arg3 - this.method331(field940[var15])) / 2, var13);
            } else if (arg7 == 2) {
                this.method335(field940[var15], arg1 + arg3 - this.method331(field940[var15]), var13);
            } else if (var12 - 1 == var15) {
                this.method335(field940[var15], arg1, var13);
            } else {
                this.method318(field940[var15], arg3);
                this.method335(field940[var15], arg1, var13);
                field920 = 0;
            }
            var13 += arg9;
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "([BIIIIII)V")
    private static final void method320(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = class49.field1033 * arg2 + arg1;
        int var8 = class49.field1033 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < class49.field1030) {
            int var11 = class49.field1030 - arg2;
            arg4 -= var11;
            arg2 = class49.field1030;
            var10 += arg3 * var11;
            var7 += class49.field1033 * var11;
        }
        if (arg2 + arg4 > class49.field1029) {
            arg4 -= arg2 + arg4 - class49.field1029;
        }
        if (arg1 < class49.field1034) {
            int var12 = class49.field1034 - arg1;
            arg3 -= var12;
            arg1 = class49.field1034;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 > class49.field1035) {
            int var13 = arg1 + arg3 - class49.field1035;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            method336(class49.field1032, arg0, arg5, var10, var7, arg3, arg4, var8, var9, arg6);
        }
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(Lqf;IIIII)V")
    public final void method321(class117 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method313(arg3, arg4);
        field919.setSeed((long) arg5);
        field936 = (field919.nextInt() & 0x1F) + 192;
        int[] var7 = new int[arg0.field2799];
        int var8 = 0;
        for (int var9 = 0; var9 < arg0.field2799; var9++) {
            var7[var9] = var8;
            if ((field919.nextInt() & 0x3) == 0) {
                var8++;
            }
        }
        this.method329(arg0, arg1, arg2, var7, null);
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lqf;[I[Lqf;)I")
    private final int method322(class117 arg0, int[] arg1, class117[] arg2) {
        if (arg0 == null) {
            return 0;
        }
        int var4 = 0;
        int var5 = 0;
        class117 var6 = class100.method783(100, (byte) 123);
        int var7 = -1;
        int var8 = 0;
        byte var9 = 0;
        int var10 = -1;
        int var11 = 0;
        int var12 = arg0.method915(27);
        for (int var13 = 0; var13 < var12; var13++) {
            int var14 = arg0.method911(false, var13);
            if (var14 == 60) {
                var10 = var13;
            } else {
                if (var14 == 62 && var10 != -1) {
                    class117 var15 = arg0.method943(var10 + 1, (byte) 123, var13);
                    var10 = -1;
                    var6.method907((byte) -32, 60);
                    var6.method909(var15, -12860);
                    var6.method907((byte) -32, 62);
                    if (var15.method918(field939, -116)) {
                        arg2[var11++] = var6.method943(var5, (byte) 121, var6.method915(27));
                        var5 = var6.method915(27);
                        var4 = 0;
                        var7 = -1;
                    } else if (var15.method918(field935, -83)) {
                        var4 += this.method333(60);
                    } else if (var15.method918(field923, 109)) {
                        var4 += this.method333(62);
                    } else if (var15.method932(field913, -94)) {
                        try {
                            int var16 = var15.method908(4, (byte) 120).method912(127);
                            var4 += field930[var16].field2835;
                        } catch (Exception var17) {
                        }
                    }
                    var14 = -1;
                }
                if (var10 == -1) {
                    if (var14 != -1) {
                        var6.method907((byte) -32, var14);
                        var4 += this.method333(var14);
                    }
                    if (var14 == 32) {
                        var7 = var6.method915(27);
                        var8 = var4;
                        var9 = 1;
                    }
                    if (arg1 != null && var4 > arg1[var11 < arg1.length ? var11 : arg1.length - 1] && var7 >= 0) {
                        arg2[var11++] = var6.method943(var5, (byte) 124, var7 - var9);
                        var5 = var7;
                        var7 = -1;
                        var4 -= var8;
                    }
                    if (var14 == 45) {
                        var7 = var6.method915(27);
                        var8 = var4;
                        var9 = 0;
                    }
                }
            }
        }
        if (var6.method915(27) > var5) {
            arg2[var11++] = var6.method943(var5, (byte) 123, var6.method915(27));
        }
        return var11;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "([I[BIIIIIII)V")
    private static final void method323(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var9 = -(arg5 >> 2);
        int var10 = -(arg5 & 0x3);
        for (int var11 = -arg6; var11 < 0; var11++) {
            for (int var12 = var9; var12 < 0; var12++) {
                if (arg1[arg3++] == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = arg2;
                }
                if (arg1[arg3++] == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = arg2;
                }
                if (arg1[arg3++] == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = arg2;
                }
                if (arg1[arg3++] == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = arg2;
                }
            }
            for (int var13 = var10; var13 < 0; var13++) {
                if (arg1[arg3++] == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = arg2;
                }
            }
            arg4 += arg7;
            arg3 += arg8;
        }
    }

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "(Lqf;IIIII)V")
    public final void method324(class117 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method313(arg3, arg4);
        int[] var7 = new int[arg0.field2799];
        for (int var8 = 0; var8 < arg0.field2799; var8++) {
            var7[var8] = (int) (Math.sin((double) arg5 / 5.0D + (double) var8 / 2.0D) * 5.0D);
        }
        this.method329(arg0, arg1 - this.method331(arg0) / 2, arg2, null, var7);
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(Lqf;IIII)V")
    public final void method325(class117 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method313(arg3, arg4);
            this.method335(arg0, arg1 - this.method331(arg0) / 2, arg2);
        }
    }

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "()V")
    public static void method326() {
        field935 = null;
        field923 = null;
        field913 = null;
        field939 = null;
        field924 = null;
        field933 = null;
        field905 = null;
        field915 = null;
        field916 = null;
        field931 = null;
        field932 = null;
        field912 = null;
        field903 = null;
        field908 = null;
        field917 = null;
        field911 = null;
        field914 = null;
        field937 = null;
        field907 = null;
        field930 = null;
        field919 = null;
        field940 = null;
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(Lqf;)V")
    private final void method327(class117 arg0) {
        try {
            if (arg0.method932(field924, -112)) {
                field906 = arg0.method908(4, (byte) 120).method924(16, (byte) -99);
                return;
            }
            if (arg0.method918(field933, 126)) {
                field906 = field928;
                return;
            }
            if (arg0.method932(field914, -121)) {
                field910 = arg0.method908(4, (byte) 120).method924(16, (byte) -99);
                return;
            }
            if (arg0.method918(field937, -71)) {
                field910 = 8388608;
                return;
            }
            if (arg0.method918(field907, 42)) {
                field910 = -1;
                return;
            }
            if (!arg0.method918(field905, -81) && !arg0.method918(field915, -79) && !arg0.method918(field916, -101) && !arg0.method918(field931, 100)) {
                if (arg0.method932(field932, -116)) {
                    field922 = arg0.method908(2, (byte) 120).method924(16, (byte) -99);
                    return;
                }
                if (arg0.method918(field912, -80)) {
                    field922 = 0;
                    return;
                }
                if (arg0.method918(field903, 92)) {
                    field922 = -1;
                    return;
                }
                if (arg0.method932(field908, -114)) {
                    field909 = arg0.method908(5, (byte) 120).method924(16, (byte) -99);
                    return;
                }
                if (arg0.method918(field917, -89)) {
                    field909 = 0;
                    return;
                }
                if (arg0.method918(field911, -111)) {
                    field909 = field927;
                    return;
                }
                if (arg0.method918(field939, -101)) {
                    this.method313(field928, field927);
                    return;
                }
            }
        } catch (Exception var2) {
        }
    }

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "(Lqf;I)I")
    public final int method328(class117 arg0, int arg1) {
        int var3 = this.method322(arg0, new int[] { arg1 }, field940);
        int var4 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            int var6 = this.method331(field940[var5]);
            if (var6 > var4) {
                var4 = var6;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lqf;II[I[I)V")
    private final void method329(class117 arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var6 = arg2 - this.field938;
        int var7 = -1;
        int var8 = 0;
        for (int var9 = 0; var9 < arg0.field2799; var9++) {
            int var10 = arg0.field2800[var9] & 0xFF;
            if (var10 == 60) {
                var7 = var9;
            } else {
                if (var10 == 62 && var7 != -1) {
                    class117 var11 = arg0.method943(var7 + 1, (byte) 126, var9);
                    var7 = -1;
                    if (var11.method918(field935, 87)) {
                        var10 = 60;
                    } else {
                        if (!var11.method918(field923, -64)) {
                            if (var11.method932(field913, -91)) {
                                try {
                                    int var12;
                                    if (arg3 == null) {
                                        var12 = 0;
                                    } else {
                                        var12 = arg3[var8];
                                    }
                                    int var13;
                                    if (arg4 == null) {
                                        var13 = 0;
                                    } else {
                                        var13 = arg4[var8];
                                    }
                                    var8++;
                                    int var14 = var11.method908(4, (byte) 120).method912(120);
                                    class118 var15 = field930[var14];
                                    var15.method951(arg1 + var12, this.field938 + var6 - var15.field2832 + var13);
                                    arg1 += var15.field2835;
                                } catch (Exception var20) {
                                }
                            } else {
                                this.method327(var11);
                            }
                            continue;
                        }
                        var10 = 62;
                    }
                }
                if (var7 == -1) {
                    int var16 = this.field929[var10];
                    int var17 = this.field926[var10];
                    int var18;
                    if (arg3 == null) {
                        var18 = 0;
                    } else {
                        var18 = arg3[var8];
                    }
                    int var19;
                    if (arg4 == null) {
                        var19 = 0;
                    } else {
                        var19 = arg4[var8];
                    }
                    var8++;
                    if (var10 == 32) {
                        if (field920 > 0) {
                            field918 += field920;
                            arg1 += field918 >> 8;
                            field918 &= 0xFF;
                        }
                    } else if (field936 == 256) {
                        if (field909 != -1) {
                            method334(this.field921[var10], arg1 + var18 + 1, this.field925[var10] + var6 + 1 + var19, var16, var17, field909);
                        }
                        method334(this.field921[var10], arg1 + var18, this.field925[var10] + var6 + var19, var16, var17, field906);
                    } else {
                        if (field909 != -1) {
                            method320(this.field921[var10], arg1 + var18 + 1, this.field925[var10] + var6 + 1 + var19, var16, var17, field909, field936);
                        }
                        method320(this.field921[var10], arg1 + var18, this.field925[var10] + var6 + var19, var16, var17, field906, field936);
                    }
                    if (field910 != -1) {
                        class49.method352(arg1, (int) ((double) this.field938 * 0.7D) + var6, var16, field910);
                    }
                    if (field922 != -1) {
                        class49.method352(arg1, this.field938 + var6, var16, field922);
                    }
                    arg1 += var16;
                }
            }
        }
    }

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "(Lqf;IIII)V")
    public final void method330(class117 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method313(arg3, arg4);
            this.method335(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "(Lqf;)I")
    public final int method331(class117 arg0) {
        if (arg0 == null) {
            return 0;
        }
        int var2 = -1;
        int var3 = 0;
        for (int var4 = 0; var4 < arg0.field2799; var4++) {
            int var5 = arg0.field2800[var4] & 0xFF;
            if (var5 == 60) {
                var2 = var4;
            } else if (var5 == 62 && var2 != -1) {
                class117 var6 = arg0.method943(var2 + 1, (byte) 120, var4);
                var2 = -1;
                if (var6.method918(field935, 73)) {
                    var3 += this.field929[60];
                } else if (var6.method918(field923, -114)) {
                    var3 += this.field929[62];
                } else if (var6.method932(field913, -105)) {
                    try {
                        int var7 = var6.method908(4, (byte) 120).method912(110);
                        var3 += field930[var7].field2835;
                    } catch (Exception var8) {
                    }
                }
            } else if (var2 == -1) {
                var3 += this.field929[var5];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lqf;IIIIII)V")
    public final void method332(class117 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 == null) {
            return;
        }
        this.method313(arg3, arg4);
        double var8 = 7.0D - (double) arg6 / 8.0D;
        if (var8 < 0.0D) {
            var8 = 0.0D;
        }
        int[] var10 = new int[arg0.field2799];
        for (int var11 = 0; var11 < arg0.field2799; var11++) {
            var10[var11] = (int) (Math.sin((double) var11 / 1.5D + (double) arg5) * var8);
        }
        this.method329(arg0, arg1 - this.method331(arg0) / 2, arg2, null, var10);
    }

    @OriginalMember(owner = "client!gd", name = "i", descriptor = "(I)I")
    public final int method333(int arg0) {
        return this.field929[arg0 & 0xFF];
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "([BIIIII)V")
    private static final void method334(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = class49.field1033 * arg2 + arg1;
        int var7 = class49.field1033 - arg3;
        int var8 = 0;
        int var9 = 0;
        if (arg2 < class49.field1030) {
            int var10 = class49.field1030 - arg2;
            arg4 -= var10;
            arg2 = class49.field1030;
            var9 += arg3 * var10;
            var6 += class49.field1033 * var10;
        }
        if (arg2 + arg4 > class49.field1029) {
            arg4 -= arg2 + arg4 - class49.field1029;
        }
        if (arg1 < class49.field1034) {
            int var11 = class49.field1034 - arg1;
            arg3 -= var11;
            arg1 = class49.field1034;
            var9 += var11;
            var6 += var11;
            var8 += var11;
            var7 += var11;
        }
        if (arg1 + arg3 > class49.field1035) {
            int var12 = arg1 + arg3 - class49.field1035;
            arg3 -= var12;
            var8 += var12;
            var7 += var12;
        }
        if (arg3 > 0 && arg4 > 0) {
            method323(class49.field1032, arg0, arg5, var9, var6, arg3, arg4, var7, var8);
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lqf;II)V")
    private final void method335(class117 arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field938;
        int var5 = -1;
        for (int var6 = 0; var6 < arg0.field2799; var6++) {
            int var7 = arg0.field2800[var6] & 0xFF;
            if (var7 == 60) {
                var5 = var6;
            } else {
                if (var7 == 62 && var5 != -1) {
                    class117 var8 = arg0.method943(var5 + 1, (byte) 122, var6);
                    var5 = -1;
                    if (var8.method918(field935, 107)) {
                        var7 = 60;
                    } else {
                        if (!var8.method918(field923, -86)) {
                            if (var8.method932(field913, -119)) {
                                try {
                                    int var9 = var8.method908(4, (byte) 120).method912(112);
                                    class118 var10 = field930[var9];
                                    var10.method951(arg1, this.field938 + var4 - var10.field2832);
                                    arg1 += var10.field2835;
                                } catch (Exception var13) {
                                }
                            } else {
                                this.method327(var8);
                            }
                            continue;
                        }
                        var7 = 62;
                    }
                }
                if (var5 == -1) {
                    int var11 = this.field929[var7];
                    int var12 = this.field926[var7];
                    if (var7 == 32) {
                        if (field920 > 0) {
                            field918 += field920;
                            arg1 += field918 >> 8;
                            field918 &= 0xFF;
                        }
                    } else if (field936 == 256) {
                        if (field909 != -1) {
                            method334(this.field921[var7], arg1 + 1, this.field925[var7] + var4 + 1, var11, var12, field909);
                        }
                        method334(this.field921[var7], arg1, this.field925[var7] + var4, var11, var12, field906);
                    } else {
                        if (field909 != -1) {
                            method320(this.field921[var7], arg1 + 1, this.field925[var7] + var4 + 1, var11, var12, field909, field936);
                        }
                        method320(this.field921[var7], arg1, this.field925[var7] + var4, var11, var12, field906, field936);
                    }
                    if (field910 != -1) {
                        class49.method352(arg1, (int) ((double) this.field938 * 0.7D) + var4, var11, field910);
                    }
                    if (field922 != -1) {
                        class49.method352(arg1, this.field938 + var4 + 1, var11, field922);
                    }
                    arg1 += var11;
                }
            }
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "([I[BIIIIIIII)V")
    private static final void method336(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        int var10 = ((arg2 & 0xFF00FF) * arg9 & 0xFF00FF00) + ((arg2 & 0xFF00) * arg9 & 0xFF0000) >> 8;
        int var11 = 256 - arg9;
        for (int var12 = -arg6; var12 < 0; var12++) {
            for (int var13 = -arg5; var13 < 0; var13++) {
                if (arg1[arg3++] == 0) {
                    arg4++;
                } else {
                    int var14 = arg0[arg4];
                    arg0[arg4++] = (((var14 & 0xFF00FF) * var11 & 0xFF00FF00) + ((var14 & 0xFF00) * var11 & 0xFF0000) >> 8) + var10;
                }
            }
            arg4 += arg7;
            arg3 += arg8;
        }
    }

    @OriginalMember(owner = "client!gd", name = "<init>", descriptor = "([I[I[I[I[[B)V")
    public class46(int[] arg0, int[] arg1, int[] arg2, int[] arg3, byte[][] arg4) {
        this.field925 = arg0;
        this.field929 = arg1;
        this.field926 = arg2;
        byte var6 = 0;
        for (int var7 = 1; var7 < arg3.length; var7++) {
            if (arg3[var7] == 1) {
                var6 = (byte) var7;
            }
        }
        this.field921 = arg4;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        for (int var10 = 0; var10 < 256; var10++) {
            if (this.field925[var10] < var8 && this.field926[var10] != 0) {
                var8 = this.field925[var10];
            }
            if (this.field926[var10] + this.field925[var10] > var9) {
                var9 = this.field926[var10] + this.field925[var10];
            }
            byte[] var11 = this.field921[var10];
            int var12 = var11.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11[var13] = (byte) (var11[var13] == var6 ? 0 : 1);
            }
        }
        this.field938 = this.field926[32] + this.field925[32];
        this.field934 = this.field938 - var8;
        this.field904 = var9 - this.field938;
    }

    @OriginalMember(owner = "client!gd", name = "<init>", descriptor = "([B)V")
    public class46(byte[] arg0) {
        this.field929 = new int[arg0.length];
        for (int var2 = 0; var2 < this.field929.length; var2++) {
            this.field929[var2] = arg0[var2] & 0xFF;
        }
    }
}
