import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bu")
public class class17 {

    @OriginalMember(owner = "client!bu", name = "G", descriptor = "Lfv;")
    private class77 field276 = null;

    @OriginalMember(owner = "client!bu", name = "d", descriptor = "I")
    public int field247;

    @OriginalMember(owner = "client!bu", name = "j", descriptor = "Lnb;")
    private class196 field253;

    @OriginalMember(owner = "client!bu", name = "l", descriptor = "Z")
    private boolean field255;

    @OriginalMember(owner = "client!bu", name = "t", descriptor = "Liv;")
    public static class64 field263 = new class64(103, -2);

    @OriginalMember(owner = "client!bu", name = "O", descriptor = "Lpi;")
    public static class342 field284 = new class342("Starting 3d Library", "Starte 3D-Softwarebibliothek.", "Démarrage de la librairie 3D", "Iniciando biblioteca 3D");

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "I")
    public static int field244;

    @OriginalMember(owner = "client!bu", name = "b", descriptor = "I")
    public static int field245;

    @OriginalMember(owner = "client!bu", name = "c", descriptor = "I")
    public static int field246;

    @OriginalMember(owner = "client!bu", name = "e", descriptor = "I")
    public static int field248;

    @OriginalMember(owner = "client!bu", name = "f", descriptor = "I")
    public static int field249;

    @OriginalMember(owner = "client!bu", name = "g", descriptor = "I")
    public static int field250;

    @OriginalMember(owner = "client!bu", name = "h", descriptor = "I")
    public static int field251;

    @OriginalMember(owner = "client!bu", name = "i", descriptor = "I")
    public static int field252;

    @OriginalMember(owner = "client!bu", name = "k", descriptor = "I")
    public static int field254;

    @OriginalMember(owner = "client!bu", name = "m", descriptor = "I")
    public static int field256;

    @OriginalMember(owner = "client!bu", name = "n", descriptor = "I")
    public static int field257;

    @OriginalMember(owner = "client!bu", name = "o", descriptor = "I")
    public static int field258;

    @OriginalMember(owner = "client!bu", name = "r", descriptor = "I")
    public static int field261;

    @OriginalMember(owner = "client!bu", name = "s", descriptor = "I")
    public static int field262;

    @OriginalMember(owner = "client!bu", name = "u", descriptor = "I")
    public static int field264;

    @OriginalMember(owner = "client!bu", name = "v", descriptor = "I")
    public static int field265;

    @OriginalMember(owner = "client!bu", name = "w", descriptor = "I")
    public static int field266;

    @OriginalMember(owner = "client!bu", name = "x", descriptor = "I")
    public static int field267;

    @OriginalMember(owner = "client!bu", name = "y", descriptor = "I")
    public static int field268;

    @OriginalMember(owner = "client!bu", name = "z", descriptor = "I")
    public static int field269;

    @OriginalMember(owner = "client!bu", name = "A", descriptor = "I")
    public static int field270;

    @OriginalMember(owner = "client!bu", name = "B", descriptor = "I")
    public static int field271;

    @OriginalMember(owner = "client!bu", name = "C", descriptor = "I")
    public static int field272;

    @OriginalMember(owner = "client!bu", name = "D", descriptor = "I")
    public static int field273;

    @OriginalMember(owner = "client!bu", name = "E", descriptor = "I")
    public static int field274;

    @OriginalMember(owner = "client!bu", name = "F", descriptor = "I")
    public static int field275;

    @OriginalMember(owner = "client!bu", name = "H", descriptor = "I")
    public static int field277;

    @OriginalMember(owner = "client!bu", name = "I", descriptor = "I")
    public static int field278;

    @OriginalMember(owner = "client!bu", name = "J", descriptor = "I")
    public static int field279;

    @OriginalMember(owner = "client!bu", name = "K", descriptor = "I")
    public static int field280;

    @OriginalMember(owner = "client!bu", name = "L", descriptor = "I")
    public static int field281;

    @OriginalMember(owner = "client!bu", name = "M", descriptor = "I")
    public static int field282;

    @OriginalMember(owner = "client!bu", name = "N", descriptor = "I")
    public static int field283;

    @OriginalMember(owner = "client!bu", name = "p", descriptor = "[Ljava/lang/Object;")
    private Object[] field259;

    @OriginalMember(owner = "client!bu", name = "q", descriptor = "[[Ljava/lang/Object;")
    private Object[][] field260;

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(ILjava/lang/String;)V", line = 4)
    public final void method111(int arg0, String arg1) {
        field256++;
        if (this.method123(-28666)) {
            int var3 = -24 / ((arg0 + 73) / 33);
            String var4 = arg1.toLowerCase();
            int var5 = this.field276.field1286.method963(-14660, class373.method2324(var4, 121));
            this.method143(-807485598, var5);
        }
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(I)V", line = 23)
    public static void method112(int arg0) {
        if (arg0 != 0) {
            field284 = null;
        }
        field263 = null;
        field284 = null;
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(II)Z", line = 37)
    private final boolean method113(int arg0, int arg1) {
        field278++;
        if (!this.method123(-28666)) {
            return false;
        }
        int var3 = -125 % ((arg1 - 67) / 47);
        if (arg0 >= 0 && this.field276.field1282.length > arg0 && this.field276.field1282[arg0] != 0) {
            return true;
        } else if (class403.field6056) {
            throw new IllegalArgumentException(Integer.toString(arg0));
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(III)[B", line = 59)
    public final byte[] method114(int arg0, int arg1, int arg2) {
        field271++;
        int var4 = -45 % ((arg2 - 70) / 51);
        return this.method130(null, 1, arg1, arg0);
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(IIZ)Z", line = 69)
    private final boolean method115(int arg0, int arg1, boolean arg2) {
        field274++;
        if (arg2) {
            return false;
        } else if (!this.method123(-28666)) {
            return false;
        } else if (arg0 >= 0 && arg1 >= 0 && arg0 < this.field276.field1282.length && this.field276.field1282[arg0] > arg1) {
            return true;
        } else if (class403.field6056) {
            throw new IllegalArgumentException(arg0 + "," + arg1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(I[BIIIII)V", line = 93)
    public static final void method116(int arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field270++;
        if (arg0 < arg3 && !class354.method2243(0, arg3)) {
            throw new IllegalArgumentException("");
        } else if (arg2 <= 0 || class354.method2243(0, arg2)) {
            int var7 = class370.method2318((byte) -89, arg4);
            int var8 = 0;
            int var9 = arg2 > arg3 ? arg3 : arg2;
            int var10 = arg3 >> 1;
            int var11 = arg2 >> 1;
            byte[] var12 = arg1;
            byte[] var13 = new byte[var7 * var10 * var11];
            while (true) {
                OpenGL.glTexImage2Dub(arg5, var8, arg6, arg3, arg2, 0, arg4, 5121, var12, 0);
                if (var9 <= 1) {
                    return;
                }
                int var14 = arg3 * var7;
                for (int var15 = 0; var15 < var7; var15++) {
                    int var17 = var15;
                    int var18 = var15;
                    int var19 = var14 + var15;
                    for (int var20 = 0; var20 < var11; var20++) {
                        for (int var21 = 0; var21 < var10; var21++) {
                            byte var22 = var12[var18];
                            int var23 = var7 + var18;
                            int var24 = var12[var23] + var22;
                            int var25 = var12[var19] + var24;
                            var18 = var7 + var23;
                            int var26 = var7 + var19;
                            int var27 = var12[var26] + var25;
                            var19 = var7 + var26;
                            var13[var17] = (byte) (var27 >> 2);
                            var17 += var7;
                        }
                        var18 += var14;
                        var19 += var14;
                    }
                }
                byte[] var16 = var13;
                var13 = var12;
                var12 = var16;
                arg2 = var11;
                arg3 = var10;
                var11 >>= 0x1;
                var9 >>= 0x1;
                var8++;
                var10 >>= 0x1;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(Ljava/lang/String;I)I", line = 186)
    public final int method117(String arg0, int arg1) {
        field267++;
        if (!this.method123(-28666)) {
            return 0;
        }
        if (arg1 != 0) {
            this.method136(null, -6);
        }
        String var3 = arg0.toLowerCase();
        int var4 = this.field276.field1286.method963(-14660, class373.method2324(var3, 88));
        return this.method118((byte) 77, var4);
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(BI)I", line = 203)
    private final int method118(byte arg0, int arg1) {
        if (arg0 <= 70) {
            return -9;
        }
        field252++;
        if (this.method113(arg1, -7)) {
            return this.field259[arg1] == null ? this.field253.method1366((byte) -21, arg1) : 100;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!bu", name = "b", descriptor = "(II)I", line = 222)
    public final int method119(int arg0, int arg1) {
        field279++;
        if (this.method113(arg1, 122)) {
            if (arg0 != 29630) {
                this.field253 = null;
            }
            return this.field276.field1282[arg1];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(ZZI)V", line = 237)
    public final void method120(boolean arg0, boolean arg1, int arg2) {
        field262++;
        if (!this.method123(-28666) || arg2 > -119) {
            return;
        }
        if (arg1) {
            this.field276.field1285 = null;
            this.field276.field1286 = null;
        }
        if (arg0) {
            this.field276.field1290 = null;
            this.field276.field1284 = null;
        }
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(B)V", line = 265)
    public final void method121(byte arg0) {
        field254++;
        if (this.field259 != null) {
            for (int var2 = 0; var2 < this.field259.length; var2++) {
                this.field259[var2] = null;
            }
        }
        if (arg0 != -38) {
            this.field276 = null;
        }
    }

    @OriginalMember(owner = "client!bu", name = "b", descriptor = "(Ljava/lang/String;I)Z", line = 287)
    public final boolean method122(String arg0, int arg1) {
        field244++;
        if (this.method123(-28666)) {
            String var3 = arg0.toLowerCase();
            int var4 = this.field276.field1286.method963(-14660, class373.method2324(var3, 79));
            return var4 >= arg1;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!bu", name = "b", descriptor = "(I)Z", line = 305)
    private final boolean method123(int arg0) {
        if (arg0 != -28666) {
            this.method139(-35);
        }
        field268++;
        if (this.field276 == null) {
            this.field276 = this.field253.method1362(false);
            if (this.field276 == null) {
                return false;
            }
            this.field259 = new Object[this.field276.field1291];
            this.field260 = new Object[this.field276.field1291][];
        }
        return true;
    }

    @OriginalMember(owner = "client!bu", name = "c", descriptor = "(II)Z", line = 328)
    public final boolean method124(int arg0, int arg1) {
        field261++;
        if (arg0 != 19928) {
            this.method130(null, -111, 118, 78);
        }
        if (!this.method113(arg1, 121)) {
            return false;
        } else if (this.field259[arg1] == null) {
            this.method134(arg1, (byte) -115);
            return this.field259[arg1] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!bu", name = "c", descriptor = "(I)I", line = 353)
    public final int method125(int arg0) {
        field251++;
        if (!this.method123(arg0 + 3342)) {
            return 0;
        }
        if (arg0 != -32008) {
            this.method127(-103, -80);
        }
        int var2 = 0;
        int var3 = 0;
        for (int var4 = 0; var4 < this.field259.length; var4++) {
            if (this.field276.field1296[var4] > 0) {
                var2 += 100;
                var3 += this.method118((byte) 117, var4);
            }
        }
        if (var2 == 0) {
            return 100;
        } else {
            return var3 * 100 / var2;
        }
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(II[II)Z", line = 393)
    private final boolean method126(int arg0, int arg1, int[] arg2, int arg3) {
        field258++;
        if (!this.method113(arg3, arg0 ^ 0x7D)) {
            return false;
        } else if (this.field259[arg3] == null) {
            return false;
        } else {
            int var5 = this.field276.field1296[arg3];
            int[] var6 = this.field276.field1289[arg3];
            if (this.field260[arg3] == null) {
                this.field260[arg3] = new Object[this.field276.field1282[arg3]];
            }
            Object[] var7 = this.field260[arg3];
            boolean var8 = true;
            for (int var9 = 0; var9 < var5; var9++) {
                int var10;
                if (var6 == null) {
                    var10 = var9;
                } else {
                    var10 = var6[var9];
                }
                if (var7[var10] == null) {
                    var8 = false;
                    break;
                }
            }
            if (var8) {
                return true;
            }
            byte[] var11;
            if (arg2 == null || arg2[0] == 0 && arg2[1] == 0 && arg2[2] == 0 && arg2[3] == 0) {
                var11 = class1.method5(false, 31346, this.field259[arg3]);
            } else {
                var11 = class1.method5(true, 31346, this.field259[arg3]);
                class145 var12 = new class145(var11);
                var12.method1098(arg2, 2, var12.field2270.length, 5);
            }
            byte[] var13;
            try {
                var13 = class366.method2290((byte) 64, var11);
            } catch (RuntimeException var49) {
                throw class280.method1794(var49, "T3 - " + (arg2 != null) + "," + arg3 + "," + var11.length + "," + class69.method569(var11, var11.length, (byte) -57) + "," + class69.method569(var11, var11.length - 2, (byte) -128) + "," + this.field276.field1283[arg3] + "," + this.field276.field1292);
            }
            if (this.field255) {
                this.field259[arg3] = null;
            }
            if (var5 <= arg0) {
                int var48;
                if (var6 == null) {
                    var48 = 0;
                } else {
                    var48 = var6[0];
                }
                if (this.field247 == 0) {
                    var7[var48] = class20.method164(true, var13, false);
                } else {
                    var7[var48] = var13;
                }
            } else if (this.field247 == 2) {
                int var15 = var13.length;
                int var50 = var15 - 1;
                int var16 = var13[var50] & 0xFF;
                int var17 = var50 - var16 * 4 * var5;
                class145 var18 = new class145(var13);
                int var19 = 0;
                int var20 = 0;
                var18.field2289 = var17;
                for (int var21 = 0; var21 < var16; var21++) {
                    int var22 = 0;
                    for (int var23 = 0; var23 < var5; var23++) {
                        var22 += var18.method1070(-32387);
                        int var24;
                        if (var6 == null) {
                            var24 = var23;
                        } else {
                            var24 = var6[var23];
                        }
                        if (arg1 == var24) {
                            var20 = var24;
                            var19 += var22;
                        }
                    }
                }
                if (var19 == 0) {
                    return true;
                }
                byte[] var25 = new byte[var19];
                var18.field2289 = var17;
                int var26 = 0;
                int var27 = 0;
                for (int var28 = 0; var28 < var16; var28++) {
                    int var29 = 0;
                    for (int var30 = 0; var30 < var5; var30++) {
                        var29 += var18.method1070(arg0 - 32388);
                        int var31;
                        if (var6 == null) {
                            var31 = var30;
                        } else {
                            var31 = var6[var30];
                        }
                        if (arg1 == var31) {
                            class73.method589(var13, var27, var25, var26, var29);
                            var26 += var29;
                        }
                        var27 += var29;
                    }
                }
                var7[var20] = var25;
            } else {
                int var32 = var13.length;
                int var51 = var32 - 1;
                int var33 = var13[var51] & 0xFF;
                int var34 = var51 - var5 * var33 * 4;
                class145 var35 = new class145(var13);
                int[] var36 = new int[var5];
                var35.field2289 = var34;
                for (int var37 = 0; var37 < var33; var37++) {
                    int var38 = 0;
                    for (int var39 = 0; var39 < var5; var39++) {
                        var38 += var35.method1070(-32387);
                        var36[var39] += var38;
                    }
                }
                byte[][] var40 = new byte[var5][];
                for (int var41 = 0; var41 < var5; var41++) {
                    var40[var41] = new byte[var36[var41]];
                    var36[var41] = 0;
                }
                var35.field2289 = var34;
                int var42 = 0;
                for (int var43 = 0; var43 < var33; var43++) {
                    int var44 = 0;
                    for (int var45 = 0; var45 < var5; var45++) {
                        var44 += var35.method1070(-32387);
                        class73.method589(var13, var42, var40[var45], var36[var45], var44);
                        var42 += var44;
                        var36[var45] += var44;
                    }
                }
                for (int var46 = 0; var46 < var5; var46++) {
                    int var47;
                    if (var6 == null) {
                        var47 = var46;
                    } else {
                        var47 = var6[var46];
                    }
                    if (this.field247 == 0) {
                        var7[var47] = class20.method164(true, var40[var46], false);
                    } else {
                        var7[var47] = var40[var46];
                    }
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!bu", name = "d", descriptor = "(II)I", line = 679)
    public final int method127(int arg0, int arg1) {
        if (arg0 != -24189) {
            method112(-127);
        }
        field281++;
        if (this.method123(-28666)) {
            int var3 = this.field276.field1286.method963(-14660, arg1);
            return this.method113(var3, -106) ? var3 : -1;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!bu", name = "e", descriptor = "(II)V", line = 700)
    public final void method128(int arg0, int arg1) {
        field282++;
        if (this.method113(arg0, -111) && arg1 >= 82 && this.field260 != null) {
            this.field260[arg0] = null;
        }
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(ZI)Z", line = 719)
    public final boolean method129(boolean arg0, int arg1) {
        field257++;
        if (!this.method123(-28666)) {
            return false;
        } else if (this.field276.field1282.length == 1) {
            return this.method137(0, 0, arg1);
        } else if (this.method113(arg1, 120)) {
            if (!arg0) {
                this.method130(null, 73, 68, -120);
            }
            if (this.field276.field1282[arg1] != 1) {
                throw new RuntimeException();
            }
            return this.method137(0, arg1, 0);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "([IIII)[B", line = 747)
    public final byte[] method130(int[] arg0, int arg1, int arg2, int arg3) {
        field264++;
        if (!this.method115(arg2, arg3, false)) {
            return null;
        }
        if (this.field260[arg2] == null || this.field260[arg2][arg3] == null) {
            boolean var5 = this.method126(1, arg3, arg0, arg2);
            if (!var5) {
                this.method134(arg2, (byte) -117);
                boolean var6 = this.method126(arg1, arg3, arg0, arg2);
                if (!var6) {
                    return null;
                }
            }
        }
        byte[] var7 = class1.method5(false, 31346, this.field260[arg2][arg3]);
        if (this.field247 == arg1) {
            this.field260[arg2][arg3] = null;
            if (this.field276.field1282[arg2] == 1) {
                this.field260[arg2] = null;
            }
        } else if (this.field247 == 2) {
            this.field260[arg2] = null;
        }
        return var7;
    }

    @OriginalMember(owner = "client!bu", name = "f", descriptor = "(II)[I", line = 794)
    public final int[] method131(int arg0, int arg1) {
        field275++;
        if (!this.method113(arg0, -26)) {
            return null;
        }
        int[] var3 = this.field276.field1289[arg0];
        if (var3 == null) {
            var3 = new int[this.field276.field1296[arg0]];
            int var4 = 0;
            while (var3.length > var4) {
                var3[var4] = var4++;
            }
        }
        int var5 = -76 % ((-arg1 - 39) / 59);
        return var3;
    }

    @OriginalMember(owner = "client!bu", name = "b", descriptor = "(B)V", line = 825)
    public final void method132(byte arg0) {
        if (arg0 != -1) {
            this.method134(-63, (byte) -27);
        }
        field249++;
        if (this.field260 != null) {
            for (int var2 = 0; var2 < this.field260.length; var2++) {
                this.field260[var2] = null;
            }
        }
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(Ljava/lang/String;B)Z", line = 847)
    public final boolean method133(String arg0, byte arg1) {
        field272++;
        if (!this.method123(arg1 ^ 0x6FA7)) {
            return false;
        }
        String var3 = arg0.toLowerCase();
        if (arg1 != -95) {
            this.field276 = null;
        }
        int var4 = this.field276.field1286.method963(arg1 ^ 0x391D, class373.method2324(var3, arg1 ^ 0x3B));
        return this.method124(19928, var4);
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(IB)V", line = 864)
    private final void method134(int arg0, byte arg1) {
        if (this.field255) {
            this.field259[arg0] = this.field253.method1363(arg0, (byte) 34);
        } else {
            this.field259[arg0] = class20.method164(true, this.field253.method1363(arg0, (byte) 27), false);
        }
        field277++;
        if (arg1 >= -16) {
            this.method133(null, (byte) -29);
        }
    }

    @OriginalMember(owner = "client!bu", name = "c", descriptor = "(B)I", line = 888)
    public final int method135(byte arg0) {
        field280++;
        if (!this.method123(arg0 ^ 0xFFFF9009)) {
            throw new IllegalStateException("");
        }
        if (arg0 != 15) {
            this.field247 = -60;
        }
        return this.field276.field1292;
    }

    @OriginalMember(owner = "client!bu", name = "c", descriptor = "(Ljava/lang/String;I)I", line = 907)
    public final int method136(String arg0, int arg1) {
        int var3 = 39 % ((1 - arg1) / 55);
        field273++;
        if (this.method123(-28666)) {
            String var4 = arg0.toLowerCase();
            int var5 = this.field276.field1286.method963(-14660, class373.method2324(var4, 105));
            return this.method113(var5, -57) ? var5 : -1;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!bu", name = "b", descriptor = "(III)Z", line = 932)
    public final boolean method137(int arg0, int arg1, int arg2) {
        field283++;
        if (arg0 != 0) {
            return false;
        } else if (!this.method115(arg1, arg2, false)) {
            return false;
        } else if (this.field260[arg1] != null && this.field260[arg1][arg2] != null) {
            return true;
        } else if (this.field259[arg1] == null) {
            this.method134(arg1, (byte) -101);
            return this.field259[arg1] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(Z)I", line = 959)
    public final int method138(boolean arg0) {
        field245++;
        if (arg0) {
            return 125;
        } else if (this.method123(-28666)) {
            return this.field276.field1282.length;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!bu", name = "d", descriptor = "(I)Z", line = 975)
    public final boolean method139(int arg0) {
        field250++;
        if (!this.method123(arg0 ^ 0xFFFF9006)) {
            return false;
        }
        boolean var2 = true;
        for (int var3 = arg0; var3 < this.field276.field1294.length; var3++) {
            int var4 = this.field276.field1294[var3];
            if (this.field259[var4] == null) {
                this.method134(var4, (byte) -111);
                if (this.field259[var4] == null) {
                    var2 = false;
                }
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!bu", name = "g", descriptor = "(II)[B", line = 1029)
    public final byte[] method140(int arg0, int arg1) {
        field248++;
        if (!this.method123(-28666)) {
            return null;
        } else if (this.field276.field1282.length == 1) {
            return this.method114(arg0, 0, 124);
        } else if (!this.method113(arg0, 122)) {
            return null;
        } else if (this.field276.field1282[arg0] == arg1) {
            return this.method114(0, arg0, 125);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/String;)Z", line = 1054)
    public final boolean method141(byte arg0, String arg1, String arg2) {
        field265++;
        if (arg0 != -86) {
            return false;
        } else if (this.method123(arg0 - 28580)) {
            String var4 = arg2.toLowerCase();
            String var5 = arg1.toLowerCase();
            int var6 = this.field276.field1286.method963(-14660, class373.method2324(var4, -105));
            if (this.method113(var6, arg0 - 31)) {
                int var7 = this.field276.field1284[var6].method963(-14660, class373.method2324(var5, 116));
                return this.method137(0, var6, var7);
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!bu", name = "b", descriptor = "(BLjava/lang/String;Ljava/lang/String;)[B", line = 1079)
    public final byte[] method142(byte arg0, String arg1, String arg2) {
        field269++;
        if (!this.method123(-28666)) {
            return null;
        }
        String var4 = arg1.toLowerCase();
        String var5 = arg2.toLowerCase();
        int var6 = this.field276.field1286.method963(-14660, class373.method2324(var4, -67));
        if (arg0 != -57) {
            this.field253 = null;
        }
        if (this.method113(var6, arg0 + 72)) {
            int var7 = this.field276.field1284[var6].method963(-14660, class373.method2324(var5, arg0 + 140));
            return this.method114(var7, var6, 123);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!bu", name = "h", descriptor = "(II)V", line = 1107)
    private final void method143(int arg0, int arg1) {
        field246++;
        this.field253.method1365(arg1, 255);
        if (arg0 != -807485598) {
            this.method126(110, 72, null, 30);
        }
    }

    @OriginalMember(owner = "client!bu", name = "<init>", descriptor = "(Lnb;ZI)V", line = 1122)
    public class17(class196 arg0, boolean arg1, int arg2) {
        if (arg2 < 0 || arg2 > 2) {
            throw new IllegalArgumentException("js5: Invalid value " + arg2 + " supplied for discardunpacked");
        }
        this.field247 = arg2;
        this.field253 = arg0;
        this.field255 = arg1;
    }
}
