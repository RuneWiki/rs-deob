import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public abstract class class14 {

    @OriginalMember(owner = "client!bf", name = "i", descriptor = "Z")
    private boolean field264;

    @OriginalMember(owner = "client!bf", name = "C", descriptor = "Z")
    private boolean field284;

    @OriginalMember(owner = "client!bf", name = "r", descriptor = "Lae;")
    private static class6 field273 = class64.method474(124, "Loaded sprites");

    @OriginalMember(owner = "client!bf", name = "g", descriptor = "Lae;")
    public static class6 field262 = class64.method474(124, "auf der Hautpseite)3");

    @OriginalMember(owner = "client!bf", name = "x", descriptor = "Lae;")
    public static class6 field279 = class64.method474(105, "Nehmen");

    @OriginalMember(owner = "client!bf", name = "R", descriptor = "Lae;")
    public static class6 field299 = field273;

    @OriginalMember(owner = "client!bf", name = "j", descriptor = "I")
    public static int field265 = 0;

    @OriginalMember(owner = "client!bf", name = "T", descriptor = "I")
    public static int field301 = 127;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "I")
    public static int field256;

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "I")
    private int field257;

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "I")
    public static int field258;

    @OriginalMember(owner = "client!bf", name = "d", descriptor = "I")
    public static int field259;

    @OriginalMember(owner = "client!bf", name = "e", descriptor = "I")
    public static int field260;

    @OriginalMember(owner = "client!bf", name = "h", descriptor = "I")
    public static int field263;

    @OriginalMember(owner = "client!bf", name = "k", descriptor = "I")
    public static int field266;

    @OriginalMember(owner = "client!bf", name = "l", descriptor = "I")
    public static int field267;

    @OriginalMember(owner = "client!bf", name = "m", descriptor = "I")
    public static int field268;

    @OriginalMember(owner = "client!bf", name = "n", descriptor = "I")
    public static int field269;

    @OriginalMember(owner = "client!bf", name = "p", descriptor = "I")
    public static int field271;

    @OriginalMember(owner = "client!bf", name = "q", descriptor = "I")
    public static int field272;

    @OriginalMember(owner = "client!bf", name = "u", descriptor = "I")
    public static int field276;

    @OriginalMember(owner = "client!bf", name = "y", descriptor = "I")
    public static int field280;

    @OriginalMember(owner = "client!bf", name = "A", descriptor = "I")
    public static int field282;

    @OriginalMember(owner = "client!bf", name = "B", descriptor = "I")
    public static int field283;

    @OriginalMember(owner = "client!bf", name = "D", descriptor = "I")
    public int field285;

    @OriginalMember(owner = "client!bf", name = "E", descriptor = "I")
    public static int field286;

    @OriginalMember(owner = "client!bf", name = "F", descriptor = "I")
    public static int field287;

    @OriginalMember(owner = "client!bf", name = "G", descriptor = "I")
    public static int field288;

    @OriginalMember(owner = "client!bf", name = "I", descriptor = "I")
    public static int field290;

    @OriginalMember(owner = "client!bf", name = "K", descriptor = "I")
    public static int field292;

    @OriginalMember(owner = "client!bf", name = "M", descriptor = "I")
    public static int field294;

    @OriginalMember(owner = "client!bf", name = "N", descriptor = "I")
    public static int field295;

    @OriginalMember(owner = "client!bf", name = "P", descriptor = "I")
    public static int field297;

    @OriginalMember(owner = "client!bf", name = "Q", descriptor = "I")
    public static int field298;

    @OriginalMember(owner = "client!bf", name = "S", descriptor = "I")
    public static int field300;

    @OriginalMember(owner = "client!bf", name = "z", descriptor = "Lq;")
    public static class101 field281;

    @OriginalMember(owner = "client!bf", name = "f", descriptor = "Lca;")
    private class15 field261;

    @OriginalMember(owner = "client!bf", name = "o", descriptor = "[I")
    public int[] field270;

    @OriginalMember(owner = "client!bf", name = "H", descriptor = "[I")
    public int[] field289;

    @OriginalMember(owner = "client!bf", name = "J", descriptor = "[I")
    public int[] field291;

    @OriginalMember(owner = "client!bf", name = "O", descriptor = "[I")
    private int[] field296;

    @OriginalMember(owner = "client!bf", name = "U", descriptor = "[I")
    private int[] field302;

    @OriginalMember(owner = "client!bf", name = "s", descriptor = "[Lca;")
    private class15[] field274;

    @OriginalMember(owner = "client!bf", name = "t", descriptor = "[[B")
    public byte[][] field275;

    @OriginalMember(owner = "client!bf", name = "w", descriptor = "[[I")
    private int[][] field278;

    @OriginalMember(owner = "client!bf", name = "L", descriptor = "[[I")
    private int[][] field293;

    @OriginalMember(owner = "client!bf", name = "v", descriptor = "[[[B")
    private byte[][][] field277;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IILae;)I", line = 4)
    public final int method138(int arg0, int arg1, class6 arg2) {
        class6 var4 = arg2.method48(17183);
        if (arg0 != 100) {
            field262 = null;
        }
        field282++;
        return this.field274[arg1].method166(true, var4.method27((byte) 114));
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lae;B)V", line = 18)
    public final void method139(class6 arg0, byte arg1) {
        class6 var3 = arg0.method48(17183);
        int var4 = this.field261.method166(true, var3.method27((byte) 112));
        field267++;
        if (arg1 == 60 && var4 >= 0) {
            this.method142(false, var4);
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(I)V", line = 41)
    public final void method140(int arg0) {
        field290++;
        for (int var2 = arg0; var2 < this.field277.length; var2++) {
            if (this.field277[var2] != null) {
                for (int var3 = 0; var3 < this.field277[var2].length; var3++) {
                    this.field277[var2][var3] = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(II)[I", line = 68)
    public final int[] method141(int arg0, int arg1) {
        if (arg0 != -1) {
            this.field274 = null;
        }
        field292++;
        return this.field278[arg1];
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(ZI)V", line = 79)
    public void method142(boolean arg0, int arg1) {
        field256++;
        if (arg0) {
            this.method142(false, -63);
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(Z)I", line = 90)
    public final int method143(boolean arg0) {
        if (arg0) {
            return 14;
        } else {
            field287++;
            return this.field277.length;
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(BI)V", line = 105)
    public void method144(byte arg0, int arg1) {
        if (arg0 != 90) {
            this.field285 = -6;
        }
        field258++;
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(I)V", line = 118)
    public static void method145(int arg0) {
        field273 = null;
        field299 = null;
        field281 = null;
        field262 = null;
        field279 = null;
        if (arg0 != 29320) {
            field281 = null;
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IB)[B", line = 140)
    public final byte[] method146(int arg0, byte arg1) {
        field295++;
        if (arg1 != -17) {
            return null;
        } else if (this.field277.length == 1) {
            return this.method160(30605, 0, arg0);
        } else if (this.field277[arg0].length == 1) {
            return this.method160(arg1 ^ 0xFFFF8862, arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(ILae;Lae;)Z", line = 163)
    public final boolean method147(int arg0, class6 arg1, class6 arg2) {
        field294++;
        class6 var4 = arg2.method48(17183);
        class6 var5 = arg1.method48(17183);
        if (arg0 == 22411) {
            int var6 = this.field261.method166(true, var4.method27((byte) 114));
            int var7 = this.field274[var6].method166(true, var5.method27((byte) 122));
            return this.method150(var7, var6, (byte) 76);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(II)V", line = 184)
    public final void method148(int arg0, int arg1) {
        if (arg1 != 12319) {
            this.field277 = null;
        }
        for (int var3 = 0; var3 < this.field277[arg0].length; var3++) {
            this.field277[arg0][var3] = null;
        }
        field280++;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(BII)[B", line = 204)
    public final byte[] method149(byte arg0, int arg1, int arg2) {
        field276++;
        if (arg1 < 0 || this.field277.length <= arg1 || this.field277[arg1] == null || arg2 < 0 || arg2 >= this.field277[arg1].length) {
            return null;
        }
        if (this.field277[arg1][arg2] == null) {
            boolean var4 = this.method156(arg1, null, 114);
            if (!var4) {
                this.method144((byte) 90, arg1);
                boolean var5 = this.method156(arg1, null, 124);
                if (!var5) {
                    return null;
                }
            }
        }
        return arg0 > -113 ? null : this.field277[arg1][arg2];
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIB)Z", line = 243)
    public final boolean method150(int arg0, int arg1, byte arg2) {
        field297++;
        if (arg1 < 0 || this.field277.length <= arg1 || this.field277[arg1] == null || arg0 < 0 || this.field277[arg1].length <= arg0) {
            return false;
        } else if (arg2 < 17) {
            return false;
        } else if (this.field277[arg1][arg0] != null) {
            return true;
        } else if (this.field275[arg1] == null) {
            this.method144((byte) 90, arg1);
            return this.field275[arg1] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(B)V", line = 273)
    public static final void method151(byte arg0) {
        field286++;
        class4.method21(-120);
        if (class59.field1295 != 10) {
            return;
        }
        int var1 = class89.field2140;
        if (arg0 <= 112) {
            return;
        }
        int var2 = class52.field1170 - 202;
        int var3 = class116.field2728 - 171;
        if (class18.field340 == 0) {
            byte var4 = 120;
            byte var5 = 100;
            if (var1 == 1 && var2 >= var5 - 75 && var2 <= var5 + 75 && var4 - 20 <= var3 && var4 + 20 >= var3) {
                class79.field1923 = 0;
                class18.field340 = 3;
            }
            short var6 = 260;
            if (var1 == 1 && var6 - 75 <= var2 && var6 + 75 >= var2 && var3 >= var4 - 20 && var3 <= var4 + 20) {
                class18.field340 = 2;
                class102.field2392 = class20.field423;
                class102.field2414 = class20.field417;
                class102.field2389 = class40.field902;
                class79.field1923 = 0;
                return;
            }
        } else if (class18.field340 == 2) {
            short var9 = 150;
            byte var10 = 100;
            byte var11 = 60;
            int var15 = var11 + 30;
            if (var1 == 1 && var3 >= var15 - 15 && var3 < var15) {
                class79.field1923 = 0;
            }
            var15 += 15;
            if (var1 == 1 && var3 >= var15 - 15 && var15 > var3) {
                class79.field1923 = 1;
            }
            var15 += 15;
            if (var1 == 1 && var2 >= var10 - 75 && var10 + 75 >= var2 && var9 - 20 <= var3 && var3 <= var9 + 20) {
                class102.field2390 = class102.field2390.method52(-32769).method44((byte) -43);
                class67.method486(8845, class52.field1175, class20.field449, class20.field420);
                class139.method1122((byte) 40, 20);
                return;
            }
            short var12 = 260;
            if (var1 == 1 && var12 - 75 <= var2 && var2 <= var12 + 75 && var9 - 20 <= var3 && var3 <= var9 + 20) {
                class18.field340 = 0;
                class102.field2399 = class102.field2400;
                class102.field2390 = class102.field2400;
            }
            while (true) {
                boolean var13;
                label146: do {
                    while (class65.method481(-4)) {
                        var13 = false;
                        for (int var14 = 0; var14 < class59.field1297.method41(-8521); var14++) {
                            if (class41.field927 == class59.field1297.method61(var14, -32011)) {
                                var13 = true;
                                break;
                            }
                        }
                        if (class79.field1923 != 0) {
                            continue label146;
                        }
                        if (class24.field620 == 85 && class102.field2390.method41(-8521) > 0) {
                            class102.field2390 = class102.field2390.method30(0, -1, class102.field2390.method41(-8521) - 1);
                        }
                        if (class24.field620 == 84 || class24.field620 == 80) {
                            class79.field1923 = 1;
                        }
                        if (var13 && class102.field2390.method41(-8521) < 12) {
                            class102.field2390 = class102.field2390.method57((byte) -15, class41.field927);
                        }
                    }
                    return;
                } while (class79.field1923 != 1);
                if (class24.field620 == 85 && class102.field2399.method41(-8521) > 0) {
                    class102.field2399 = class102.field2399.method30(0, -1, class102.field2399.method41(-8521) - 1);
                }
                if (class24.field620 == 84 || class24.field620 == 80) {
                    class79.field1923 = 0;
                }
                if (var13 && class102.field2399.method41(-8521) < 20) {
                    class102.field2399 = class102.field2399.method57((byte) -15, class41.field927);
                }
            }
        } else if (class18.field340 == 3) {
            short var7 = 180;
            short var8 = 150;
            if (var1 == 1 && var2 >= var7 - 75 && var7 + 75 >= var2 && var3 >= var8 - 20 && var8 + 20 >= var3) {
                class18.field340 = 0;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(II[IB)[B", line = 426)
    public final byte[] method152(int arg0, int arg1, int[] arg2, byte arg3) {
        field259++;
        if (arg0 < 0 || this.field277.length <= arg0 || this.field277[arg0] == null || arg1 < 0 || arg1 >= this.field277[arg0].length) {
            return null;
        }
        if (this.field277[arg0][arg1] == null) {
            boolean var5 = this.method156(arg0, arg2, 108);
            if (!var5) {
                this.method144((byte) 90, arg0);
                boolean var6 = this.method156(arg0, arg2, 116);
                if (!var6) {
                    return null;
                }
            }
        }
        if (arg3 != 73) {
            this.field293 = null;
        }
        byte[] var7 = this.field277[arg0][arg1];
        if (this.field284) {
            this.field277[arg0][arg1] = null;
        }
        return var7;
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(IB)I", line = 466)
    public final int method153(int arg0, byte arg1) {
        field269++;
        if (arg1 != -4) {
            this.field284 = true;
        }
        return this.field277[arg0].length;
    }

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "(I)Z", line = 481)
    public final boolean method154(int arg0) {
        field283++;
        if (arg0 != 1278) {
            this.field257 = -16;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < this.field296.length; var3++) {
            int var4 = this.field296[var3];
            if (this.field275[var4] == null) {
                this.method144((byte) 90, var4);
                if (this.field275[var4] == null) {
                    var2 = false;
                }
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIILbf;I)[B", line = 523)
    public static final byte[] method155(int arg0, int arg1, int arg2, class14 arg3, int arg4) {
        if (arg1 != 2) {
            method157((byte) 123);
        }
        long var5 = ((long) arg4 << 32) + (long) (arg2 << 16) + (long) (arg2 * 37 + arg0 & 0xFFFF);
        field300++;
        if (class2.field12 != null) {
            class65 var7 = (class65) class2.field12.method128((byte) 0, var5);
            if (var7 != null) {
                return var7.field1426;
            }
        }
        byte[] var8 = arg3.method160(30605, arg2, arg0);
        if (var8 == null) {
            return null;
        } else {
            if (class2.field12 != null) {
                class2.field12.method130(new class65(var8), var5, (byte) -116);
            }
            return var8;
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(I[II)Z", line = 561)
    private final boolean method156(int arg0, int[] arg1, int arg2) {
        field268++;
        if (this.field275[arg0] == null) {
            return false;
        }
        int var4 = this.field270[arg0];
        byte[][] var5 = this.field277[arg0];
        boolean var6 = true;
        int[] var7 = this.field278[arg0];
        for (int var8 = 0; var8 < var4; var8++) {
            if (var5[var7[var8]] == null) {
                var6 = false;
                break;
            }
        }
        if (var6) {
            return true;
        }
        byte[] var9;
        if (arg1 == null || arg1[0] == 0 && arg1[1] == 0 && arg1[2] == 0 && arg1[3] == 0) {
            var9 = this.field275[arg0];
        } else {
            var9 = new byte[this.field275[arg0].length];
            class53.method417(this.field275[arg0], 0, var9, 0, var9.length);
            class77 var10 = new class77(var9);
            var10.method643(arg1, 0, var10.field1858.length, 5);
        }
        byte[] var11;
        try {
            var11 = class20.method192(-1, var9);
            if (arg2 <= 105) {
                this.field257 = 89;
            }
        } catch (RuntimeException var26) {
            throw class82.method709(var26, "T3 - " + (arg1 != null) + "," + arg0 + "," + var9.length + "," + class19.method182(7, var9.length, var9) + "," + class19.method182(7, var9.length - 2, var9) + "," + this.field291[arg0] + "," + this.field285);
        }
        if (this.field264) {
            this.field275[arg0] = null;
        }
        if (var4 <= 1) {
            var5[var7[0]] = var11;
        } else {
            int var13 = var11.length;
            int var27 = var13 - 1;
            int var14 = var11[var27] & 0xFF;
            int[] var15 = new int[var4];
            int var16 = var27 - var4 * var14 * 4;
            class77 var17 = new class77(var11);
            var17.field1821 = var16;
            for (int var18 = 0; var18 < var14; var18++) {
                int var19 = 0;
                for (int var20 = 0; var20 < var4; var20++) {
                    var19 += var17.method647((byte) -72);
                    var15[var20] += var19;
                }
            }
            for (int var21 = 0; var21 < var4; var21++) {
                if (var5[var7[var21]] == null) {
                    var5[var7[var21]] = new byte[var15[var21]];
                }
                var15[var21] = 0;
            }
            int var22 = 0;
            var17.field1821 = var16;
            for (int var23 = 0; var23 < var14; var23++) {
                int var24 = 0;
                for (int var25 = 0; var25 < var4; var25++) {
                    var24 += var17.method647((byte) -72);
                    class53.method417(var11, var22, var5[var7[var25]], var15[var25], var24);
                    var15[var25] += var24;
                    var22 += var24;
                }
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(B)V", line = 710)
    public static final void method157(byte arg0) {
        field272++;
        int var1 = class85.field2051.method939(8, -13873);
        if (var1 < class47.field1065) {
            for (int var2 = var1; var2 < class47.field1065; var2++) {
                class43.field994[class69.field1523++] = class4.field47[var2];
            }
        }
        if (class47.field1065 < var1) {
            throw new RuntimeException("gppov1");
        }
        class47.field1065 = 0;
        if (arg0 >= -17) {
            field262 = null;
        }
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class4.field47[var3];
            class66 var5 = class20.field387[var4];
            int var6 = class85.field2051.method939(1, -13873);
            if (var6 == 0) {
                class4.field47[class47.field1065++] = var4;
                var5.field1770 = class5.field61;
            } else {
                int var7 = class85.field2051.method939(2, -13873);
                if (var7 == 0) {
                    class4.field47[class47.field1065++] = var4;
                    var5.field1770 = class5.field61;
                    class87.field2081[class92.field2205++] = var4;
                } else if (var7 == 1) {
                    class4.field47[class47.field1065++] = var4;
                    var5.field1770 = class5.field61;
                    int var8 = class85.field2051.method939(3, -13873);
                    var5.method616(-1, var8, false);
                    int var9 = class85.field2051.method939(1, -13873);
                    if (var9 == 1) {
                        class87.field2081[class92.field2205++] = var4;
                    }
                } else if (var7 == 2) {
                    class4.field47[class47.field1065++] = var4;
                    var5.field1770 = class5.field61;
                    int var10 = class85.field2051.method939(3, -13873);
                    var5.method616(-1, var10, true);
                    int var11 = class85.field2051.method939(3, -13873);
                    var5.method616(-1, var11, true);
                    int var12 = class85.field2051.method939(1, -13873);
                    if (var12 == 1) {
                        class87.field2081[class92.field2205++] = var4;
                    }
                } else if (var7 == 3) {
                    class43.field994[class69.field1523++] = var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(Lae;B)I", line = 818)
    public final int method158(class6 arg0, byte arg1) {
        field271++;
        if (arg1 != 30) {
            this.field277 = null;
        }
        class6 var3 = arg0.method48(arg1 ^ 0x4301);
        return this.field261.method166(true, var3.method27((byte) 119));
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(ZI)Z", line = 830)
    public final boolean method159(boolean arg0, int arg1) {
        field288++;
        if (this.field275[arg1] != null) {
            return true;
        }
        if (arg0) {
            this.field296 = null;
        }
        this.method144((byte) 90, arg1);
        return this.field275[arg1] != null;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(III)[B", line = 849)
    public final byte[] method160(int arg0, int arg1, int arg2) {
        if (arg0 != 30605) {
            this.method153(63, (byte) 111);
        }
        field266++;
        return this.method152(arg1, arg2, null, (byte) 73);
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IZ)[B", line = 860)
    public final byte[] method161(int arg0, boolean arg1) {
        if (!arg1) {
            return null;
        }
        field263++;
        if (this.field277.length == 1) {
            return this.method149((byte) -115, 0, arg0);
        } else if (this.field277[arg0].length == 1) {
            return this.method149((byte) -116, arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lae;Lae;I)[B", line = 882)
    public final byte[] method162(class6 arg0, class6 arg1, int arg2) {
        field298++;
        class6 var4 = arg0.method48(17183);
        class6 var5 = arg1.method48(17183);
        int var6 = this.field261.method166(true, var4.method27((byte) 121));
        int var7 = this.field274[var6].method166(true, var5.method27((byte) 116));
        if (arg2 <= 89) {
            this.method148(10, -117);
        }
        return this.method160(30605, var6, var7);
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "([BB)V", line = 903)
    public final void method163(byte[] arg0, byte arg1) {
        field260++;
        this.field285 = class19.method182(7, arg0.length, arg0);
        class77 var3 = new class77(class20.method192(-1, arg0));
        int var4 = var3.method620((byte) -8);
        if (var4 != 5) {
            return;
        }
        int var5 = var3.method620((byte) -8);
        int var6 = 0;
        int var7 = -1;
        this.field257 = var3.method636(-62);
        this.field296 = new int[this.field257];
        for (int var8 = 0; var8 < this.field257; var8++) {
            this.field296[var8] = var6 += var3.method636(-117);
            if (this.field296[var8] > var7) {
                var7 = this.field296[var8];
            }
        }
        this.field270 = new int[var7 + 1];
        this.field278 = new int[var7 + 1][];
        this.field289 = new int[var7 + 1];
        this.field291 = new int[var7 + 1];
        this.field277 = new byte[var7 + 1][][];
        this.field275 = new byte[var7 + 1][];
        if (var5 != 0) {
            this.field302 = new int[var7 + 1];
            for (int var9 = 0; var9 < this.field257; var9++) {
                this.field302[this.field296[var9]] = var3.method647((byte) -72);
            }
            this.field261 = new class15(this.field302);
        }
        for (int var10 = 0; var10 < this.field257; var10++) {
            this.field291[this.field296[var10]] = var3.method647((byte) -72);
        }
        for (int var11 = 0; var11 < this.field257; var11++) {
            this.field289[this.field296[var11]] = var3.method647((byte) -72);
        }
        for (int var12 = 0; var12 < this.field257; var12++) {
            this.field270[this.field296[var12]] = var3.method636(-38);
        }
        for (int var13 = 0; var13 < this.field257; var13++) {
            int var19 = 0;
            int var20 = this.field296[var13];
            int var21 = this.field270[var20];
            int var22 = -1;
            this.field278[var20] = new int[var21];
            for (int var23 = 0; var23 < var21; var23++) {
                int var24 = this.field278[var20][var23] = var19 += var3.method636(104);
                if (var22 < var24) {
                    var22 = var24;
                }
            }
            this.field277[var20] = new byte[var22 + 1][];
        }
        if (var5 != 0) {
            this.field293 = new int[var7 + 1][];
            this.field274 = new class15[var7 + 1];
            for (int var14 = 0; var14 < this.field257; var14++) {
                int var15 = this.field296[var14];
                int var16 = this.field270[var15];
                this.field293[var15] = new int[this.field277[var15].length];
                for (int var17 = 0; var17 < var16; var17++) {
                    this.field293[var15][this.field278[var15][var17]] = var3.method647((byte) -72);
                }
                this.field274[var15] = new class15(this.field293[var15]);
            }
        }
        int var18 = 49 / ((arg1 + 37) / 59);
    }

    @OriginalMember(owner = "client!bf", name = "<init>", descriptor = "(ZZ)V", line = 1051)
    public class14(boolean arg0, boolean arg1) {
        this.field264 = arg0;
        this.field284 = arg1;
    }
}
