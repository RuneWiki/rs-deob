import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hm")
public class class383 {

    @OriginalMember(owner = "client!hm", name = "b", descriptor = "Ltt;")
    private class249 field5625;

    @OriginalMember(owner = "client!hm", name = "u", descriptor = "Ljk;")
    private class134 field5644;

    @OriginalMember(owner = "client!hm", name = "n", descriptor = "I")
    public int field5637;

    @OriginalMember(owner = "client!hm", name = "e", descriptor = "I")
    private int field5628;

    @OriginalMember(owner = "client!hm", name = "m", descriptor = "I")
    private int field5636;

    @OriginalMember(owner = "client!hm", name = "g", descriptor = "[B")
    public byte[] field5630;

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "I")
    private int field5624;

    @OriginalMember(owner = "client!hm", name = "j", descriptor = "I")
    private int field5633;

    @OriginalMember(owner = "client!hm", name = "p", descriptor = "I")
    public static int field5639 = 0;

    @OriginalMember(owner = "client!hm", name = "s", descriptor = "Lpn;")
    public static class49 field5642;

    @OriginalMember(owner = "client!hm", name = "t", descriptor = "I")
    public static int field5643;

    @OriginalMember(owner = "client!hm", name = "c", descriptor = "I")
    public static int field5626;

    @OriginalMember(owner = "client!hm", name = "d", descriptor = "I")
    public static int field5627;

    @OriginalMember(owner = "client!hm", name = "f", descriptor = "I")
    public static int field5629;

    @OriginalMember(owner = "client!hm", name = "h", descriptor = "I")
    public static int field5631;

    @OriginalMember(owner = "client!hm", name = "i", descriptor = "I")
    public static int field5632;

    @OriginalMember(owner = "client!hm", name = "k", descriptor = "I")
    public static int field5634;

    @OriginalMember(owner = "client!hm", name = "l", descriptor = "I")
    public static int field5635;

    @OriginalMember(owner = "client!hm", name = "o", descriptor = "I")
    public static int field5638;

    @OriginalMember(owner = "client!hm", name = "r", descriptor = "I")
    public static int field5641;

    @OriginalMember(owner = "client!hm", name = "q", descriptor = "[[Luv;")
    private class2[][] field5640;

    static {
        new class179("Unable to delete friend - system busy.", "Der Freund konnte nicht entfernt werden, das System ist derzeit ausgelastet.", "Impossible de supprimer un ami - système occupé.", "Não foi possível excluir o amigo. O sistema está ocupado.");
        field5642 = new class49(36, 11);
        field5643 = 0;
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(Li;BII)V", line = 12)
    public final void method2433(class200 arg0, byte arg1, int arg2, int arg3) {
        field5638++;
        class355 var5 = (class355) arg0;
        int var6 = var5.field5250 + arg3 + 1;
        int var7 = var5.field5253 + arg2 + 1;
        int var8 = var6 + (this.field5637 * var7);
        int var9 = 0;
        int var10 = var5.field5259;
        if (arg1 != 68) {
            this.method2435(-45);
        }
        int var11 = var5.field5263;
        int var12 = this.field5637 - var11;
        if (var7 <= 0) {
            int var13 = 1 - var7;
            var9 += var11 * var13;
            var8 += this.field5637 * var13;
            var10 -= var13;
            var7 = 1;
        }
        int var14 = 0;
        if (this.field5628 <= (var7 + var10)) {
            int var15 = var7 + var10 + 1 - this.field5628;
            var10 -= var15;
        }
        if (var6 <= 0) {
            int var16 = 1 - var6;
            var11 -= var16;
            var12 += var16;
            var8 += var16;
            var14 += var16;
            var6 = 1;
            var9 += var16;
        }
        if (this.field5637 <= var6 + var11) {
            int var17 = var6 + var11 + 1 - this.field5637;
            var14 += var17;
            var11 -= var17;
            var12 += var17;
        }
        if (var11 > 0 && var10 > 0) {
            class15.method88(var11, var8, this.field5630, var5.field5261, var12, (byte) -115, var14, var10, var9);
            this.method2434(var7, -1, var10, var6, var11);
        }
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(IIIII)V", line = 84)
    private final void method2434(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field5627++;
        if (this.field5640 == null) {
            return;
        }
        int var6 = arg3 - 1 >> 7;
        int var7 = arg4 + arg3 - 1 - 1 >> 7;
        int var8 = arg0 + arg1 >> 7;
        int var9 = arg0 + arg2 - 1 - 1 >> 7;
        for (int var10 = var6; var10 <= var7; var10++) {
            class2[] var11 = this.field5640[var10];
            for (int var12 = var8; var12 <= var9; var12++) {
                var11[var12].field13 = true;
            }
        }
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(I)V", line = 126)
    public final void method2435(int arg0) {
        this.field5640 = new class2[this.field5624][this.field5633];
        field5629++;
        if (arg0 != -15120) {
            this.field5633 = 91;
        }
        for (int var2 = 0; var2 < this.field5633; var2++) {
            for (int var3 = 0; var3 < this.field5624; var3++) {
                this.field5640[var3][var2] = new class2(this.field5625, this, this.field5644, var3, var2, this.field5636, var3 * 128 + 1, var2 * 128 - -1);
            }
        }
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(IIILi;)Z", line = 155)
    public final boolean method2436(int arg0, int arg1, int arg2, class200 arg3) {
        field5635++;
        class355 var5 = (class355) arg3;
        if (arg0 != -21986) {
            this.method2434(65, -90, -11, -13, -67);
        }
        int var6 = var5.field5253 + arg1 + 1;
        int var7 = var5.field5250 + arg2 + 1;
        int var8 = var7 + (this.field5637 * var6);
        int var9 = var5.field5259;
        int var10 = var5.field5263;
        if (var6 <= 0) {
            int var11 = 1 - var6;
            var8 += this.field5637 * var11;
            var9 -= var11;
            var6 = 1;
        }
        int var12 = this.field5637 - var10;
        if (this.field5628 <= (var6 + var9)) {
            int var13 = var6 + var9 + 1 - this.field5628;
            var9 -= var13;
        }
        if (var7 <= 0) {
            int var14 = 1 - var7;
            var8 += var14;
            var12 += var14;
            var10 -= var14;
            var7 = 1;
        }
        if (var7 + var10 >= this.field5637) {
            int var15 = var7 + 1 - (this.field5637 - var10);
            var10 -= var15;
            var12 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            byte var16 = 8;
            int var17 = (var16 - 1) * this.field5637 + var12;
            return class2.method11(var17, var10, var8, 0, var9, this.field5630, var16);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(IBI[Ljava/lang/String;)Ljava/lang/String;", line = 227)
    public static final String method2437(int arg0, byte arg1, int arg2, String[] arg3) {
        field5641++;
        if (arg0 == 0) {
            return "";
        } else if (arg0 == 1) {
            String var4 = arg3[arg2];
            return var4 == null ? "null" : var4.toString();
        } else if (arg1 < 123) {
            return null;
        } else {
            int var5 = arg0 + arg2;
            int var6 = 0;
            for (int var7 = arg2; var7 < var5; var7++) {
                String var11 = arg3[var7];
                if (var11 == null) {
                    var6 += 4;
                } else {
                    var6 += var11.length();
                }
            }
            StringBuffer var8 = new StringBuffer(var6);
            for (int var9 = arg2; var9 < var5; var9++) {
                String var10 = arg3[var9];
                if (var10 == null) {
                    var8.append("null");
                } else {
                    var8.append(var10);
                }
            }
            return var8.toString();
        }
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(IIIIBI)V", line = 287)
    public static final void method2438(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        class37.field459 = arg2;
        field5631++;
        class134.field1993 = arg5;
        class38.field638 = arg1;
        class310.field4730 = arg0;
        if (arg4 >= -16) {
            return;
        }
        class30.field340 = arg3;
        if (class37.field459 >= 100) {
            int var6 = class30.field340 * 128 + 64;
            int var7 = class38.field638 * 128 + 64;
            int var8 = class416.method2605(var7, var6, (byte) -39, class30.field370) - class310.field4730;
            int var9 = var6 - class128.field1917;
            int var10 = var8 - class505.field7344;
            int var11 = var7 - class406.field5999;
            int var12 = (int) Math.sqrt((double) (var9 * var9 + var11 * var11));
            class430.field6377 = (int) (Math.atan2((double) var10, (double) var12) * 2607.5945876176133D) & 0x3FFF;
            class536.field7863 = (int) (Math.atan2((double) var9, (double) var11) * -2607.5945876176133D) & 0x3FFF;
            if (class430.field6377 < 1024) {
                class430.field6377 = 1024;
            }
            class21.field242 = 0;
            if (class430.field6377 > 3072) {
                class430.field6377 = 3072;
            }
        }
        class33.field401 = 2;
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(B)V", line = 337)
    public static void method2439(byte arg0) {
        if (arg0 < -15) {
            field5642 = null;
        }
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 348)
    public static final void method2440(String arg0, int arg1) {
        field5634++;
        if (arg0 == null) {
            return;
        }
        if (!(class6.field80 < 100 || class445.field6619) || class6.field80 >= 200) {
            class492.method2961(0, class380.field5597.method1265(class345.field5141, -67));
            return;
        }
        String var2 = class35.method215(arg0, -112);
        if (var2 == null) {
            return;
        }
        int var3 = 27 / ((62 - arg1) / 47);
        for (int var4 = 0; var4 < class6.field80; var4++) {
            String var8 = class35.method215(class265.field4229[var4], -124);
            if (var8 != null && var8.equals(var2)) {
                class492.method2961(0, arg0 + class172.field2670.method1265(class345.field5141, -65));
                return;
            }
            if (class289.field4483[var4] != null) {
                String var9 = class35.method215(class289.field4483[var4], -116);
                if (var9 != null && var9.equals(var2)) {
                    class492.method2961(0, arg0 + class172.field2670.method1265(class345.field5141, -108));
                    return;
                }
            }
        }
        for (int var5 = 0; var5 < class324.field4920; var5++) {
            String var6 = class35.method215(class8.field95[var5], -104);
            if (var6 != null && var6.equals(var2)) {
                class492.method2961(0, class517.field7514.method1265(class345.field5141, -66) + arg0 + class508.field7405.method1265(class345.field5141, -74));
                return;
            }
            if (class484.field7094[var5] != null) {
                String var7 = class35.method215(class484.field7094[var5], -105);
                if (var7 != null && var7.equals(var2)) {
                    class492.method2961(0, class517.field7514.method1265(class345.field5141, -108) + arg0 + class508.field7405.method1265(class345.field5141, -104));
                    return;
                }
            }
        }
        if (class35.method215(class116.field1781.field7437, -108).equals(var2)) {
            class492.method2961(0, class311.field4743.method1265(class345.field5141, -114));
        } else {
            class360.field5316++;
            class110.method857(4095, class499.field7269);
            class312.field4752.method1381(class447.method2755(arg0, (byte) -125), (byte) 104);
            class312.field4752.method1343(arg0, (byte) -14);
        }
    }

    @OriginalMember(owner = "client!hm", name = "b", descriptor = "(IIILi;)V", line = 442)
    public final void method2441(int arg0, int arg1, int arg2, class200 arg3) {
        field5632++;
        class355 var5 = (class355) arg3;
        int var6 = var5.field5250 + arg2 + 1;
        int var7 = var5.field5253 + arg0 + 1;
        int var8 = var6 + (this.field5637 * var7);
        int var9 = 0;
        int var10 = var5.field5259;
        int var11 = var5.field5263;
        int var12 = this.field5637 - var11;
        int var13 = 0;
        if (var7 <= 0) {
            int var14 = 1 - var7;
            var9 += var11 * var14;
            var7 = 1;
            var8 += this.field5637 * var14;
            var10 -= var14;
        }
        if (var7 + var10 >= this.field5628) {
            int var15 = var7 + var10 + 1 - this.field5628;
            var10 -= var15;
        }
        if (var6 <= 0) {
            int var16 = 1 - var6;
            var11 -= var16;
            var8 += var16;
            var12 += var16;
            var6 = 1;
            var13 += var16;
            var9 += var16;
        }
        if (this.field5637 <= var6 + var11) {
            int var17 = var6 + var11 + 1 - this.field5637;
            var13 += var17;
            var12 += var17;
            var11 -= var17;
        }
        if (var11 > 0 && var10 > 0) {
            class236.method1603(-71, var5.field5261, var9, var11, this.field5630, var12, var10, var8, var13);
            this.method2434(var7, arg1, var10, var6, var11);
        }
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(III[[ZZI)V", line = 511)
    public final void method2442(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5) {
        this.field5625.method1708(-8, false);
        field5626++;
        this.field5625.method1706(-40, false);
        this.field5625.method1725(51, -2);
        this.field5625.method1734(-88, 1);
        this.field5625.method1732(1, 9);
        float var7 = 1.0F / (float) (this.field5625.field3923 * 128);
        if (arg4) {
            for (int var22 = 0; var22 < this.field5633; var22++) {
                int var23 = var22 << this.field5636;
                int var24 = var22 + 1 << this.field5636;
                label89: for (int var25 = 0; var25 < this.field5624; var25++) {
                    int var26 = var25 << this.field5636;
                    int var27 = var25 + 1 << this.field5636;
                    for (int var28 = var26; var28 < var27; var28++) {
                        if ((-arg0) <= (var28 - arg5) && (var28 - arg5) <= arg0) {
                            for (int var29 = var23; var29 < var24; var29++) {
                                if (-arg0 <= var29 - arg1 && var29 - arg1 <= arg0 && arg3[var28 - (arg5 - arg0)][var29 + arg0 - arg1]) {
                                    OpenGL.glMatrixMode(5890);
                                    OpenGL.glLoadIdentity();
                                    OpenGL.glScalef(var7, var7, 1.0F);
                                    OpenGL.glTranslatef((float) (-var25) / var7, (float) (-var22) / var7, 1.0F);
                                    OpenGL.glMatrixMode(5888);
                                    this.field5640[var25][var22].method5((byte) 121);
                                    continue label89;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            for (int var8 = 0; var8 < this.field5633; var8++) {
                int var9 = var8 << this.field5636;
                int var10 = var8 + 1 << this.field5636;
                for (int var11 = 0; var11 < this.field5624; var11++) {
                    int var12 = 0;
                    int var13 = var11 << this.field5636;
                    int var14 = var11 + 1 << this.field5636;
                    class268 var15 = this.field5625.field3954;
                    var15.field2982 = 0;
                    for (int var16 = var9; var16 < var10; var16++) {
                        if ((var16 - arg1) >= (-arg0) && (var16 - arg1) <= arg0) {
                            int var17 = this.field5644.field124 * var16 + var13;
                            for (int var18 = var13; var18 < var14; var18++) {
                                if (var18 - arg5 >= -arg0 && (var18 - arg5) <= arg0 && arg3[var18 + arg0 - arg5][arg0 + var16 - arg1]) {
                                    short[] var19 = this.field5644.field1971[var17];
                                    if (var19 != null) {
                                        if (this.field5625.field3990) {
                                            for (int var21 = 0; var21 < var19.length; var21++) {
                                                var15.method1364(var19[var21] & 0xFFFF, true);
                                                var12++;
                                            }
                                        } else {
                                            for (int var20 = 0; var20 < var19.length; var20++) {
                                                var12++;
                                                var15.method1366(true, var19[var20] & 0xFFFF);
                                            }
                                        }
                                    }
                                }
                                var17++;
                            }
                        }
                    }
                    if (var12 > 0) {
                        OpenGL.glMatrixMode(5890);
                        OpenGL.glLoadIdentity();
                        OpenGL.glScalef(var7, var7, 1.0F);
                        OpenGL.glTranslatef((float) (-var11) / var7, (float) (-var8) / var7, 1.0F);
                        OpenGL.glMatrixMode(5888);
                        this.field5640[var11][var8].method7(var12, 0, var15.field2973, 5123);
                    }
                }
            }
        }
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glMatrixMode(5888);
        if (arg2 != -22033) {
            this.field5636 = -29;
        }
    }

    @OriginalMember(owner = "client!hm", name = "<init>", descriptor = "(Ltt;Ljk;)V", line = 707)
    public class383(class249 arg0, class134 arg1) {
        this.field5625 = arg0;
        this.field5644 = arg1;
        this.field5637 = (this.field5644.field127 * this.field5644.field124 >> this.field5625.field3929) + 2;
        this.field5628 = (this.field5644.field127 * this.field5644.field122 >> this.field5625.field3929) + 2;
        this.field5636 = this.field5625.field3929 + 7 - this.field5644.field123;
        this.field5630 = new byte[this.field5637 * this.field5628];
        this.field5624 = this.field5644.field124 >> this.field5636;
        this.field5633 = this.field5644.field122 >> this.field5636;
    }
}
