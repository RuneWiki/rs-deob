import jaggl.OpenGL;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class595 {

    @OriginalMember(owner = "client!sa", name = "h", descriptor = "[B")
    private byte[] field8365;

    @OriginalMember(owner = "client!sa", name = "l", descriptor = "[[B")
    private byte[][] field8369;

    @OriginalMember(owner = "client!sa", name = "k", descriptor = "I")
    public int field8368;

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "I")
    public int field8359;

    @OriginalMember(owner = "client!sa", name = "n", descriptor = "I")
    public int field8371;

    @OriginalMember(owner = "client!sa", name = "p", descriptor = "Lwp;")
    public static class453 field8373 = new class453(98, 8);

    @OriginalMember(owner = "client!sa", name = "r", descriptor = "[I")
    public static int[] field8375 = new int[8];

    @OriginalMember(owner = "client!sa", name = "s", descriptor = "Z")
    public static boolean field8376 = false;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "I")
    public static int field8358;

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "I")
    public static int field8360;

    @OriginalMember(owner = "client!sa", name = "d", descriptor = "I")
    public static int field8361;

    @OriginalMember(owner = "client!sa", name = "e", descriptor = "I")
    public static int field8362;

    @OriginalMember(owner = "client!sa", name = "f", descriptor = "I")
    public static int field8363;

    @OriginalMember(owner = "client!sa", name = "g", descriptor = "I")
    public static int field8364;

    @OriginalMember(owner = "client!sa", name = "i", descriptor = "I")
    public static int field8366;

    @OriginalMember(owner = "client!sa", name = "j", descriptor = "I")
    public static int field8367;

    @OriginalMember(owner = "client!sa", name = "m", descriptor = "I")
    public static int field8370;

    @OriginalMember(owner = "client!sa", name = "o", descriptor = "I")
    public static int field8372;

    @OriginalMember(owner = "client!sa", name = "q", descriptor = "I")
    public static int field8374;

    @OriginalMember(owner = "client!sa", name = "t", descriptor = "Lvfa;")
    public static class264 field8377;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IB)I")
    public final int method3268(int arg0, byte arg1) {
        if (arg1 < 88) {
            this.field8368 = -116;
        }
        field8362++;
        return this.field8365[arg0] & 0xFF;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(BLjava/lang/String;)I")
    public final int method3269(byte arg0, String arg1) {
        if (arg0 != 99) {
            this.method3269((byte) -45, null);
        }
        field8360++;
        return this.method3271(null, arg1, 103);
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(B[Lf;Ljava/lang/String;I)Ljava/lang/String;")
    public final String method3270(byte arg0, class536[] arg1, String arg2, int arg3) {
        field8363++;
        if (this.method3271(arg1, arg2, 121) <= arg3) {
            return arg2;
        }
        int var5 = arg3 - this.method3271(null, "...", 95);
        int var6 = -1;
        int var7 = -1;
        int var8 = 0;
        int var9 = arg2.length();
        String var10 = "";
        if (arg0 >= -37) {
            this.method3277(-7, null, null, -123);
        }
        for (int var11 = 0; var11 < var9; var11++) {
            char var12 = arg2.charAt(var11);
            if (var12 == '<') {
                var6 = var11;
            } else {
                if (var12 == '>' && var6 != -1) {
                    String var13 = arg2.substring(var6 + 1, var11);
                    var6 = -1;
                    if (var13.equals("lt")) {
                        var12 = '<';
                    } else if (var13.equals("gt")) {
                        var12 = '>';
                    } else if (var13.equals("nbsp")) {
                        var12 = ' ';
                    } else if (var13.equals("shy")) {
                        var12 = '\u00AD';
                    } else if (var13.equals("times")) {
                        var12 = '×';
                    } else if (var13.equals("euro")) {
                        var12 = '€';
                    } else if (var13.equals("copy")) {
                        var12 = '©';
                    } else {
                        if (!var13.equals("reg")) {
                            if (var13.startsWith("img=") && arg1 != null) {
                                try {
                                    int var14 = class557.method3065(128, var13.substring(4));
                                    var8 += arg1[var14].method160();
                                    var7 = -1;
                                    if (var8 > var5) {
                                        return var10 + "...";
                                    }
                                    var10 = arg2.substring(0, var11 + 1);
                                } catch (Exception var16) {
                                }
                            }
                            continue;
                        }
                        var12 = '®';
                    }
                }
                if (var6 == -1) {
                    var8 += this.field8365[class598.method3286((byte) 99, var12) & 0xFF] & 0xFF;
                    if (this.field8369 != null && var7 != -1) {
                        var8 += this.field8369[var7][var12];
                    }
                    var7 = var12;
                    int var15 = var8;
                    if (this.field8369 != null) {
                        var15 = this.field8369[var12][46] + var8;
                    }
                    if (var15 > var5) {
                        return var10 + "...";
                    }
                    var10 = arg2.substring(0, var11 + 1);
                }
            }
        }
        return arg2;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "([Lf;Ljava/lang/String;I)I")
    public final int method3271(class536[] arg0, String arg1, int arg2) {
        field8374++;
        if (arg1 == null) {
            return 0;
        }
        int var4 = -1;
        int var5 = -1;
        if (arg2 <= 54) {
            this.field8365 = null;
        }
        int var6 = 0;
        int var7 = arg1.length();
        for (int var8 = 0; var8 < var7; var8++) {
            char var9 = arg1.charAt(var8);
            if (var9 == '<') {
                var4 = var8;
            } else {
                if (var9 == '>' && var4 != -1) {
                    String var10 = arg1.substring(var4 + 1, var8);
                    var4 = -1;
                    if (var10.equals("lt")) {
                        var9 = '<';
                    } else if (var10.equals("gt")) {
                        var9 = '>';
                    } else if (var10.equals("nbsp")) {
                        var9 = ' ';
                    } else if (var10.equals("shy")) {
                        var9 = '\u00AD';
                    } else if (var10.equals("times")) {
                        var9 = '×';
                    } else if (var10.equals("euro")) {
                        var9 = '€';
                    } else if (var10.equals("copy")) {
                        var9 = '©';
                    } else {
                        if (!var10.equals("reg")) {
                            if (var10.startsWith("img=") && arg0 != null) {
                                try {
                                    int var11 = class557.method3065(128, var10.substring(4));
                                    var6 += arg0[var11].method160();
                                    var5 = -1;
                                } catch (Exception var12) {
                                }
                            }
                            continue;
                        }
                        var9 = '®';
                    }
                }
                if (var4 == -1) {
                    var6 += this.field8365[class598.method3286((byte) 99, var9) & 0xFF] & 0xFF;
                    if (this.field8369 != null && var5 != -1) {
                        var6 += this.field8369[var5][var9];
                    }
                    var5 = var9;
                }
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Ljava/lang/String;[Ljava/lang/String;I[I[Lf;)I")
    public final int method3272(String arg0, String[] arg1, int arg2, int[] arg3, class536[] arg4) {
        field8364++;
        if (arg0 == null) {
            return 0;
        }
        int var6 = 0;
        int var7 = 0;
        int var8 = arg2;
        int var9 = 0;
        byte var10 = 0;
        int var11 = -1;
        int var12 = -1;
        int var13 = 0;
        int var14 = arg0.length();
        for (int var15 = 0; var15 < var14; var15++) {
            int var16 = class598.method3286((byte) 99, arg0.charAt(var15)) & 0xFF;
            int var17 = 0;
            if (var16 == 60) {
                var11 = var15;
            } else {
                int var18;
                if (var11 == -1) {
                    var18 = var15;
                    var17 += this.method3268(var16, (byte) 118);
                    if (this.field8369 != null && var12 != -1) {
                        var17 += this.field8369[var12][var16];
                    }
                    var12 = var16;
                } else {
                    if (var16 != 62) {
                        continue;
                    }
                    var18 = var11;
                    String var19 = arg0.substring(var11 + 1, var15);
                    var11 = -1;
                    if (var19.equals("br")) {
                        arg1[var13] = arg0.substring(var7, var15 + 1);
                        var13++;
                        if (var13 >= arg1.length) {
                            return 0;
                        }
                        var12 = -1;
                        var7 = var15 + 1;
                        var6 = 0;
                        var8 = -1;
                        continue;
                    }
                    if (var19.equals("lt")) {
                        var17 += this.method3268(60, (byte) 92);
                        if (this.field8369 != null && var12 != -1) {
                            var17 += this.field8369[var12][60];
                        }
                        var12 = 60;
                    } else if (var19.equals("gt")) {
                        var17 += this.method3268(62, (byte) 113);
                        if (this.field8369 != null && var12 != -1) {
                            var17 += this.field8369[var12][62];
                        }
                        var12 = 62;
                    } else if (var19.equals("nbsp")) {
                        var17 += this.method3268(160, (byte) 97);
                        if (this.field8369 != null && var12 != -1) {
                            var17 += this.field8369[var12][160];
                        }
                        var12 = 160;
                    } else if (var19.equals("shy")) {
                        var17 += this.method3268(173, (byte) 102);
                        if (this.field8369 != null && var12 != -1) {
                            var17 += this.field8369[var12][173];
                        }
                        var12 = 173;
                    } else if (var19.equals("times")) {
                        var17 += this.method3268(215, (byte) 94);
                        if (this.field8369 != null && var12 != -1) {
                            var17 += this.field8369[var12][215];
                        }
                        var12 = 215;
                    } else if (var19.equals("euro")) {
                        var17 += this.method3268(8364, (byte) 110);
                        if (this.field8369 != null && var12 != -1) {
                            var17 += this.field8369[var12][8364];
                        }
                        var12 = 8364;
                    } else if (var19.equals("copy")) {
                        var17 += this.method3268(169, (byte) 100);
                        if (this.field8369 != null && var12 != -1) {
                            var17 += this.field8369[var12][169];
                        }
                        var12 = 169;
                    } else if (var19.equals("reg")) {
                        var17 += this.method3268(174, (byte) 117);
                        if (this.field8369 != null && var12 != -1) {
                            var17 += this.field8369[var12][174];
                        }
                        var12 = 174;
                    } else if (var19.startsWith("img=") && arg4 != null) {
                        try {
                            int var20 = class557.method3065(arg2 + 129, var19.substring(4));
                            var17 += arg4[var20].method160();
                            var12 = -1;
                        } catch (Exception var21) {
                        }
                    }
                    var16 = -1;
                }
                if (var17 > 0) {
                    var6 += var17;
                    if (arg3 != null) {
                        if (var16 == 32) {
                            var8 = var15;
                            var9 = var6;
                            var10 = 1;
                        }
                        if (var6 > arg3[arg3.length <= var13 ? arg3.length - 1 : var13]) {
                            if (var8 >= 0) {
                                arg1[var13] = arg0.substring(var7, var8 + 1 - var10);
                                var13++;
                                if (arg1.length <= var13) {
                                    return 0;
                                }
                                var7 = var8 + 1;
                                var6 -= var9;
                                var12 = -1;
                                var8 = -1;
                            } else {
                                arg1[var13] = arg0.substring(var7, var18);
                                var13++;
                                if (arg1.length <= var13) {
                                    return 0;
                                }
                                var12 = -1;
                                var7 = var18;
                                var8 = -1;
                                var6 = var17;
                            }
                        }
                        if (var16 == 45) {
                            var9 = var6;
                            var10 = 0;
                            var8 = var15;
                        }
                    }
                }
            }
        }
        if (arg0.length() > var7) {
            arg1[var13] = arg0.substring(var7, arg0.length());
            var13++;
        }
        return var13;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Ljava/lang/String;[Lf;II)I")
    public final int method3273(String arg0, class536[] arg1, int arg2, int arg3) {
        field8366++;
        int var5 = this.method3272(arg0, class104.field1394, -1, new int[] { arg2 }, arg1);
        int var6 = 0;
        int var7 = -109 % ((arg3 + 53) / 48);
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = this.method3271(arg1, class104.field1394[var8], 61);
            if (var9 > var6) {
                var6 = var9;
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(B)V")
    public static void method3274(byte arg0) {
        field8375 = null;
        field8373 = null;
        field8377 = null;
        if (arg0 != 109) {
            method3274((byte) 94);
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIIIII[II)V")
    public static final void method3275(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, int arg7) {
        field8370++;
        if (arg3 != 160) {
            method3275(52, -83, -5, 9, -74, -32, null, 100);
        }
        if (arg2 > 0 && !class4.method36(arg2, (byte) 98)) {
            throw new IllegalArgumentException("");
        } else if (arg4 > 0 && !class4.method36(arg4, (byte) 98)) {
            throw new IllegalArgumentException("");
        } else if (arg5 == 32993) {
            int var8 = 0;
            int var9 = arg2 >= arg4 ? arg4 : arg2;
            int var10 = arg2 >> 1;
            int var11 = arg4 >> 1;
            int[] var12 = arg6;
            int[] var13 = new int[var10 * var11];
            while (true) {
                OpenGL.glTexImage2Di(arg0, var8, arg1, arg2, arg4, 0, arg5, arg7, var12, 0);
                if (var9 <= 1) {
                    return;
                }
                int var14 = 0;
                int var15 = 0;
                int var16 = arg2 + var15;
                int[] var17 = var13;
                for (int var18 = 0; var18 < var11; var18++) {
                    for (int var19 = 0; var19 < var10; var19++) {
                        int var20 = var12[var15++];
                        int var21 = var12[var16++];
                        int var22 = var12[var15++];
                        int var23 = var20 >> 8 & 0xFF;
                        int var24 = var20 >> 24 & 0xFF;
                        int var25 = var12[var16++];
                        int var26 = var20 >> 16 & 0xFF;
                        int var27 = var20 & 0xFF;
                        int var28 = (var22 >> 24 & 0xFF) + var24;
                        int var29 = (var22 >> 16 & 0xFF) + var26;
                        int var30 = ((var22 & 0xFFAF) >> 8) + var23;
                        int var31 = (var22 & 0xFF) + var27;
                        int var32 = (var21 >> 16 & 0xFF) + var29;
                        int var33 = (var21 >> 24 & 0xFF) + var28;
                        int var34 = ((var21 & 0xFFD7) >> 8) + var30;
                        int var35 = (var21 & 0xFF) + var31;
                        int var36 = (var25 >> 24 & 0xFF) + var33;
                        int var37 = ((var25 & 0xFFFF60) >> 16) + var32;
                        int var38 = (var25 & 0xFF) + var35;
                        int var39 = ((var25 & 0xFF32) >> 8) + var34;
                        var13[var14++] = class444.method2376(class695.method3921(var38 >> 2, 255), class444.method2376(class695.method3921(1020, var39) << 6, class444.method2376(class695.method3921(var36 << 22, -16777216), class695.method3921(var37 << 14, 16711680))));
                    }
                    var16 += arg2;
                    var15 += arg2;
                }
                var13 = var12;
                arg4 = var11;
                var12 = var17;
                arg2 = var10;
                var10 >>= 0x1;
                var11 >>= 0x1;
                var8++;
                var9 >>= 0x1;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IILjava/io/File;[B)V")
    public static final void method3276(int arg0, int arg1, File arg2, byte[] arg3) throws IOException {
        field8358++;
        DataInputStream var4 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg2)));
        if (arg1 > -96) {
            field8377 = null;
        }
        try {
            var4.readFully(arg3, 0, arg0);
        } catch (EOFException var5) {
        }
        var4.close();
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(ILjava/lang/String;[Lf;I)I")
    public final int method3277(int arg0, String arg1, class536[] arg2, int arg3) {
        field8361++;
        return arg3 > -41 ? -60 : this.method3272(arg1, class104.field1394, -1, new int[] { arg0 }, arg2);
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IILjava/lang/String;B[Lf;)I")
    public final int method3278(int arg0, int arg1, String arg2, byte arg3, class536[] arg4) {
        field8367++;
        if (arg3 >= -43) {
            return -27;
        }
        if (arg1 == 0) {
            arg1 = this.field8368;
        }
        int var6 = this.method3272(arg2, class104.field1394, -1, new int[] { arg0 }, arg4);
        int var7 = (var6 - 1) * arg1;
        return this.field8359 + var7 + this.field8371;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(ICI)I")
    public final int method3279(int arg0, char arg1, int arg2) {
        if (arg0 >= -34) {
            field8377 = null;
        }
        field8372++;
        return this.field8369 == null ? 0 : this.field8369[arg2][arg1];
    }

    @OriginalMember(owner = "client!sa", name = "<init>", descriptor = "([B)V")
    public class595(byte[] arg0) {
        class630 var2 = new class630(arg0);
        int var3 = var2.method3501(-9268);
        if (var3 != 0) {
            throw new RuntimeException("");
        }
        boolean var4 = var2.method3501(-9268) == 1;
        this.field8365 = new byte[256];
        var2.method3522(this.field8365, true, 256, 0);
        if (var4) {
            int[] var5 = new int[256];
            for (int var6 = 0; var6 < 256; var6++) {
                var5[var6] = var2.method3501(-9268);
            }
            int[] var7 = new int[256];
            for (int var8 = 0; var8 < 256; var8++) {
                var7[var8] = var2.method3501(-9268);
            }
            byte[][] var9 = new byte[256][];
            for (int var10 = 0; var10 < 256; var10++) {
                var9[var10] = new byte[var5[var10]];
                byte var17 = 0;
                for (int var18 = 0; var18 < var9[var10].length; var18++) {
                    var17 += var2.method3480(-20933);
                    var9[var10][var18] = var17;
                }
            }
            byte[][] var11 = new byte[256][];
            for (int var12 = 0; var12 < 256; var12++) {
                var11[var12] = new byte[var5[var12]];
                byte var15 = 0;
                for (int var16 = 0; var16 < var11[var12].length; var16++) {
                    var15 += var2.method3480(-20933);
                    var11[var12][var16] = var15;
                }
            }
            this.field8369 = new byte[256][256];
            for (int var13 = 0; var13 < 256; var13++) {
                if (var13 != 32 && var13 != 160) {
                    for (int var14 = 0; var14 < 256; var14++) {
                        if (var14 != 32 && var14 != 160) {
                            this.field8369[var13][var14] = (byte) class576.method3178(var9, this.field8365, var7, false, var11, var5, var14, var13);
                        }
                    }
                }
            }
            this.field8368 = var5[32] + var7[32];
        } else {
            this.field8368 = var2.method3501(-9268);
        }
        var2.method3501(-9268);
        var2.method3501(-9268);
        this.field8359 = var2.method3501(-9268);
        this.field8371 = var2.method3501(-9268);
    }
}
