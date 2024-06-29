import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wv")
public class class26 {

    @OriginalMember(owner = "client!wv", name = "j", descriptor = "I")
    public int field250;

    @OriginalMember(owner = "client!wv", name = "m", descriptor = "Ljc;")
    public static class305 field253 = new class305("yellow:", "gelb:", "jaune:", "amarelo:");

    @OriginalMember(owner = "client!wv", name = "c", descriptor = "I")
    public int field243;

    @OriginalMember(owner = "client!wv", name = "d", descriptor = "I")
    public int field244;

    @OriginalMember(owner = "client!wv", name = "k", descriptor = "I")
    public static int field251;

    @OriginalMember(owner = "client!wv", name = "o", descriptor = "I")
    public int field255;

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "Lis;")
    public class349 field241;

    @OriginalMember(owner = "client!wv", name = "q", descriptor = "Lfo;")
    public static class361 field257;

    @OriginalMember(owner = "client!wv", name = "b", descriptor = "[I")
    public int[] field242;

    @OriginalMember(owner = "client!wv", name = "e", descriptor = "[I")
    public int[] field245;

    @OriginalMember(owner = "client!wv", name = "f", descriptor = "[I")
    public int[] field246;

    @OriginalMember(owner = "client!wv", name = "i", descriptor = "[I")
    public int[] field249;

    @OriginalMember(owner = "client!wv", name = "n", descriptor = "[I")
    public int[] field254;

    @OriginalMember(owner = "client!wv", name = "p", descriptor = "[I")
    public int[] field256;

    @OriginalMember(owner = "client!wv", name = "h", descriptor = "[Lis;")
    public class349[] field248;

    @OriginalMember(owner = "client!wv", name = "g", descriptor = "[[I")
    public int[][] field247;

    @OriginalMember(owner = "client!wv", name = "l", descriptor = "[[I")
    public int[][] field252;

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(I)V", line = 10)
    public static void method160(int arg0) {
        if (arg0 != 16) {
            method160(117);
        }
        field257 = null;
        field253 = null;
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(IIII)Z", line = 21)
    public static final boolean method161(int arg0, int arg1, int arg2, int arg3) {
        if (!class413.method2524(arg0, arg1, arg2)) {
            return false;
        }
        int var4 = arg1 << class351.field4688;
        int var5 = arg2 << class351.field4688;
        int var6 = class152.field1993[arg0].method217(arg1, arg2) - 1;
        int var7 = var6 - (0x78 << class351.field4688 - 7);
        int var8 = var6 - (0xE6 << class351.field4688 - 7);
        int var9 = var6 - (0xEE << class351.field4688 - 7);
        if (arg3 == 1) {
            if (var4 > class466.field6933) {
                if (!class154.method917(var4, var6, var5)) {
                    return false;
                }
                if (!class154.method917(var4, var6, class123.field1595 + var5)) {
                    return false;
                }
                if (!class154.method917(var4, var6, class166.field2152 + var5)) {
                    return false;
                }
            }
            if (arg0 > 0) {
                if (!class154.method917(var4, var7, var5)) {
                    return false;
                }
                if (!class154.method917(var4, var7, class123.field1595 + var5)) {
                    return false;
                }
                if (!class154.method917(var4, var7, class166.field2152 + var5)) {
                    return false;
                }
            }
            if (!class154.method917(var4, var8, var5)) {
                return false;
            } else if (class154.method917(var4, var8, class123.field1595 + var5)) {
                return class154.method917(var4, var8, class166.field2152 + var5);
            } else {
                return false;
            }
        } else if (arg3 == 2) {
            if (var5 < class14.field153) {
                if (!class154.method917(var4, var6, class166.field2152 + var5)) {
                    return false;
                }
                if (!class154.method917(class123.field1595 + var4, var6, class166.field2152 + var5)) {
                    return false;
                }
                if (!class154.method917(class166.field2152 + var4, var6, class166.field2152 + var5)) {
                    return false;
                }
            }
            if (arg0 > 0) {
                if (!class154.method917(var4, var7, class166.field2152 + var5)) {
                    return false;
                }
                if (!class154.method917(class123.field1595 + var4, var7, class166.field2152 + var5)) {
                    return false;
                }
                if (!class154.method917(class166.field2152 + var4, var7, class166.field2152 + var5)) {
                    return false;
                }
            }
            if (!class154.method917(var4, var8, class166.field2152 + var5)) {
                return false;
            } else if (class154.method917(class123.field1595 + var4, var8, class166.field2152 + var5)) {
                return class154.method917(class166.field2152 + var4, var8, class166.field2152 + var5);
            } else {
                return false;
            }
        } else if (arg3 == 4) {
            if (var4 < class466.field6933) {
                if (!class154.method917(class166.field2152 + var4, var6, var5)) {
                    return false;
                }
                if (!class154.method917(class166.field2152 + var4, var6, class123.field1595 + var5)) {
                    return false;
                }
                if (!class154.method917(class166.field2152 + var4, var6, class166.field2152 + var5)) {
                    return false;
                }
            }
            if (arg0 > 0) {
                if (!class154.method917(class166.field2152 + var4, var7, var5)) {
                    return false;
                }
                if (!class154.method917(class166.field2152 + var4, var7, class123.field1595 + var5)) {
                    return false;
                }
                if (!class154.method917(class166.field2152 + var4, var7, class166.field2152 + var5)) {
                    return false;
                }
            }
            if (!class154.method917(class166.field2152 + var4, var8, var5)) {
                return false;
            } else if (class154.method917(class166.field2152 + var4, var8, class123.field1595 + var5)) {
                return class154.method917(class166.field2152 + var4, var8, class166.field2152 + var5);
            } else {
                return false;
            }
        } else if (arg3 == 8) {
            if (var5 > class14.field153) {
                if (!class154.method917(var4, var6, var5)) {
                    return false;
                }
                if (!class154.method917(class123.field1595 + var4, var6, var5)) {
                    return false;
                }
                if (!class154.method917(class166.field2152 + var4, var6, var5)) {
                    return false;
                }
            }
            if (arg0 > 0) {
                if (!class154.method917(var4, var7, var5)) {
                    return false;
                }
                if (!class154.method917(class123.field1595 + var4, var7, var5)) {
                    return false;
                }
                if (!class154.method917(class166.field2152 + var4, var7, var5)) {
                    return false;
                }
            }
            if (!class154.method917(var4, var8, var5)) {
                return false;
            } else if (class154.method917(class123.field1595 + var4, var8, var5)) {
                return class154.method917(class166.field2152 + var4, var8, var5);
            } else {
                return false;
            }
        } else if (!class154.method917(class123.field1595 + var4, var9, class123.field1595 + var5)) {
            return false;
        } else if (arg3 == 16) {
            return class154.method917(var4, var8, class166.field2152 + var5);
        } else if (arg3 == 32) {
            return class154.method917(class166.field2152 + var4, var8, class166.field2152 + var5);
        } else if (arg3 == 64) {
            return class154.method917(class166.field2152 + var4, var8, var5);
        } else if (arg3 == 128) {
            return class154.method917(var4, var8, var5);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "([BI)V", line = 245)
    private final void method162(byte[] arg0, int arg1) {
        field251++;
        class396 var3 = new class396(class442.method2718(52, arg0));
        int var4 = var3.method2388((byte) -118);
        if (var4 != 5 && var4 != 6) {
            throw new RuntimeException();
        }
        if (var4 < 6) {
            this.field255 = 0;
        } else {
            this.field255 = var3.method2406((byte) -104);
        }
        int var5 = 69 / ((arg1 - 6) / 55);
        int var6 = var3.method2388((byte) -128);
        this.field243 = var3.method2386(-23648);
        int var7 = 0;
        this.field256 = new int[this.field243];
        int var8 = -1;
        for (int var9 = 0; var9 < this.field243; var9++) {
            this.field256[var9] = var7 += var3.method2386(-23648);
            if (var8 < this.field256[var9]) {
                var8 = this.field256[var9];
            }
        }
        this.field244 = var8 + 1;
        this.field246 = new int[this.field244];
        this.field254 = new int[this.field244];
        this.field245 = new int[this.field244];
        this.field247 = new int[this.field244][];
        this.field242 = new int[this.field244];
        if (var6 != 0) {
            this.field249 = new int[this.field244];
            for (int var10 = 0; var10 < this.field244; var10++) {
                this.field249[var10] = -1;
            }
            for (int var11 = 0; var11 < this.field243; var11++) {
                this.field249[this.field256[var11]] = var3.method2406((byte) -72);
            }
            this.field241 = new class349(this.field249);
        }
        for (int var12 = 0; var12 < this.field243; var12++) {
            this.field246[this.field256[var12]] = var3.method2406((byte) -82);
        }
        for (int var13 = 0; var13 < this.field243; var13++) {
            this.field242[this.field256[var13]] = var3.method2406((byte) -94);
        }
        for (int var14 = 0; var14 < this.field243; var14++) {
            this.field245[this.field256[var14]] = var3.method2386(-23648);
        }
        for (int var15 = 0; var15 < this.field243; var15++) {
            int var22 = this.field256[var15];
            int var23 = 0;
            int var24 = this.field245[var22];
            int var25 = -1;
            this.field247[var22] = new int[var24];
            for (int var26 = 0; var26 < var24; var26++) {
                int var27 = this.field247[var22][var26] = var23 += var3.method2386(-23648);
                if (var27 > var25) {
                    var25 = var27;
                }
            }
            this.field254[var22] = var25 + 1;
            if (var25 + 1 == var24) {
                this.field247[var22] = null;
            }
        }
        if (var6 == 0) {
            return;
        }
        this.field252 = new int[var8 + 1][];
        this.field248 = new class349[var8 + 1];
        for (int var16 = 0; var16 < this.field243; var16++) {
            int var17 = this.field256[var16];
            int var18 = this.field245[var17];
            this.field252[var17] = new int[this.field254[var17]];
            for (int var19 = 0; var19 < this.field254[var17]; var19++) {
                this.field252[var17][var19] = -1;
            }
            for (int var20 = 0; var20 < var18; var20++) {
                int var21;
                if (this.field247[var17] == null) {
                    var21 = var20;
                } else {
                    var21 = this.field247[var17][var20];
                }
                this.field252[var17][var21] = var3.method2406((byte) -67);
            }
            this.field248[var17] = new class349(this.field252[var17]);
        }
    }

    @OriginalMember(owner = "client!wv", name = "<init>", descriptor = "([BI)V", line = 418)
    public class26(byte[] arg0, int arg1) {
        this.field250 = class421.method2599((byte) -45, arg0, arg0.length);
        if (this.field250 != arg1) {
            throw new RuntimeException();
        }
        this.method162(arg0, -60);
    }
}
