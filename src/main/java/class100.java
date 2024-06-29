import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vp")
public class class100 {

    @OriginalMember(owner = "client!vp", name = "b", descriptor = "I")
    public int field1397;

    @OriginalMember(owner = "client!vp", name = "c", descriptor = "I")
    public int field1398;

    @OriginalMember(owner = "client!vp", name = "d", descriptor = "I")
    public int field1399;

    @OriginalMember(owner = "client!vp", name = "f", descriptor = "I")
    public int field1401;

    @OriginalMember(owner = "client!vp", name = "g", descriptor = "I")
    public int field1402;

    @OriginalMember(owner = "client!vp", name = "h", descriptor = "I")
    public int field1403;

    @OriginalMember(owner = "client!vp", name = "e", descriptor = "[B")
    public byte[] field1400;

    @OriginalMember(owner = "client!vp", name = "i", descriptor = "[B")
    public byte[] field1404;

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "[I")
    public int[] field1396;

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "()V", line = 5)
    public final void method748() {
        byte[] var1 = new byte[this.field1401 * this.field1399];
        int var2 = 0;
        if (this.field1404 == null) {
            for (int var3 = 0; var3 < this.field1401; var3++) {
                for (int var4 = this.field1399 - 1; var4 >= 0; var4--) {
                    var1[var2++] = this.field1400[this.field1401 * var4 + var3];
                }
            }
            this.field1400 = var1;
        } else {
            byte[] var5 = new byte[this.field1401 * this.field1399];
            for (int var6 = 0; var6 < this.field1401; var6++) {
                for (int var9 = this.field1399 - 1; var9 >= 0; var9--) {
                    var1[var2] = this.field1400[this.field1401 * var9 + var6];
                    var5[var2++] = this.field1404[this.field1401 * var9 + var6];
                }
            }
            this.field1400 = var1;
            this.field1404 = var5;
        }
        int var7 = this.field1402;
        this.field1402 = this.field1398;
        this.field1398 = this.field1397;
        this.field1397 = this.field1403;
        this.field1403 = this.field1402;
        int var8 = this.field1399;
        this.field1399 = this.field1401;
        this.field1401 = var8;
    }

    @OriginalMember(owner = "client!vp", name = "b", descriptor = "()V", line = 65)
    public final void method749() {
        int var1 = this.method762();
        int var2 = this.method760();
        if (this.field1401 == var1 && this.field1399 == var2) {
            return;
        }
        byte[] var3 = new byte[var1 * var2];
        if (this.field1404 == null) {
            for (int var9 = 0; var9 < this.field1399; var9++) {
                int var10 = this.field1401 * var9;
                int var11 = (this.field1402 + var9) * var1 + this.field1398;
                for (int var12 = 0; var12 < this.field1401; var12++) {
                    var3[var11++] = this.field1400[var10++];
                }
            }
        } else {
            byte[] var4 = new byte[var1 * var2];
            for (int var5 = 0; var5 < this.field1399; var5++) {
                int var6 = this.field1401 * var5;
                int var7 = (this.field1402 + var5) * var1 + this.field1398;
                for (int var8 = 0; var8 < this.field1401; var8++) {
                    var3[var7] = this.field1400[var6];
                    var4[var7++] = this.field1404[var6++];
                }
            }
            this.field1404 = var4;
        }
        this.field1398 = this.field1403 = this.field1402 = this.field1397 = 0;
        this.field1401 = var1;
        this.field1399 = var2;
        this.field1400 = var3;
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(Lmo;II)[Lvp;", line = 133)
    public static final class100[] method750(class447 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2771(arg1, arg2, 3);
        return var3 == null ? null : method752(var3);
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(I)V", line = 141)
    public final void method751(int arg0) {
        int var2 = this.method762();
        int var3 = this.method760();
        if (this.field1401 == var2 && this.field1399 == var3) {
            return;
        }
        int var4 = arg0;
        if (arg0 > this.field1398) {
            var4 = this.field1398;
        }
        int var5 = arg0;
        if (this.field1398 + arg0 + this.field1401 > var2) {
            var5 = var2 - this.field1398 - this.field1401;
        }
        int var6 = arg0;
        if (arg0 > this.field1402) {
            var6 = this.field1402;
        }
        int var7 = arg0;
        if (this.field1402 + arg0 + this.field1399 > var3) {
            var7 = var3 - this.field1402 - this.field1399;
        }
        int var8 = this.field1401 + var4 + var5;
        int var9 = this.field1399 + var6 + var7;
        byte[] var10 = new byte[var8 * var9];
        if (this.field1404 == null) {
            for (int var11 = 0; var11 < this.field1399; var11++) {
                int var12 = this.field1401 * var11;
                int var13 = (var6 + var11) * var8 + var4;
                for (int var14 = 0; var14 < this.field1401; var14++) {
                    var10[var13++] = this.field1400[var12++];
                }
            }
        } else {
            byte[] var15 = new byte[var8 * var9];
            for (int var16 = 0; var16 < this.field1399; var16++) {
                int var17 = this.field1401 * var16;
                int var18 = (var6 + var16) * var8 + var4;
                for (int var19 = 0; var19 < this.field1401; var19++) {
                    var15[var18] = this.field1404[var17];
                    var10[var18++] = this.field1400[var17++];
                }
            }
            this.field1404 = var15;
        }
        this.field1398 -= var4;
        this.field1402 -= var6;
        this.field1403 -= var5;
        this.field1397 -= var7;
        this.field1401 = var8;
        this.field1399 = var9;
        this.field1400 = var10;
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "([B)[Lvp;", line = 238)
    private static final class100[] method752(byte[] arg0) {
        class186 var1 = new class186(arg0);
        var1.field3044 = arg0.length - 2;
        int var2 = var1.method1272((byte) -62);
        class100[] var3 = new class100[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            var3[var4] = new class100();
        }
        var1.field3044 = arg0.length - var2 * 8 - 7;
        int var5 = var1.method1272((byte) -98);
        int var6 = var1.method1272((byte) -64);
        int var7 = (var1.method1322(false) & 0xFF) + 1;
        for (int var8 = 0; var8 < var2; var8++) {
            var3[var8].field1398 = var1.method1272((byte) -72);
        }
        for (int var9 = 0; var9 < var2; var9++) {
            var3[var9].field1402 = var1.method1272((byte) -117);
        }
        for (int var10 = 0; var10 < var2; var10++) {
            var3[var10].field1401 = var1.method1272((byte) -104);
        }
        for (int var11 = 0; var11 < var2; var11++) {
            var3[var11].field1399 = var1.method1272((byte) -76);
        }
        for (int var12 = 0; var12 < var2; var12++) {
            class100 var32 = var3[var12];
            var32.field1403 = var5 - var32.field1401 - var32.field1398;
            var32.field1397 = var6 - var32.field1399 - var32.field1402;
        }
        var1.field3044 = arg0.length - var2 * 8 - (var7 - 1) * 3 - 7;
        int[] var13 = new int[var7];
        for (int var14 = 1; var14 < var7; var14++) {
            var13[var14] = var1.method1275(-1);
            if (var13[var14] == 0) {
                var13[var14] = 1;
            }
        }
        for (int var15 = 0; var15 < var2; var15++) {
            var3[var15].field1396 = var13;
        }
        var1.field3044 = 0;
        for (int var16 = 0; var16 < var2; var16++) {
            class100 var17 = var3[var16];
            int var18 = var17.field1401 * var17.field1399;
            var17.field1400 = new byte[var18];
            int var19 = var1.method1322(false);
            if ((var19 & 0x2) != 0) {
                boolean var23 = false;
                var17.field1404 = new byte[var18];
                if ((var19 & 0x1) == 0) {
                    for (int var24 = 0; var24 < var18; var24++) {
                        var17.field1400[var24] = var1.method1327((byte) -100);
                    }
                    for (int var25 = 0; var25 < var18; var25++) {
                        byte var26 = var17.field1404[var25] = var1.method1327((byte) -103);
                        var23 |= var26 != -1;
                    }
                } else {
                    for (int var27 = 0; var27 < var17.field1401; var27++) {
                        for (int var31 = 0; var31 < var17.field1399; var31++) {
                            var17.field1400[var17.field1401 * var31 + var27] = var1.method1327((byte) -90);
                        }
                    }
                    for (int var28 = 0; var28 < var17.field1401; var28++) {
                        for (int var29 = 0; var29 < var17.field1399; var29++) {
                            byte var30 = var17.field1404[var17.field1401 * var29 + var28] = var1.method1327((byte) -123);
                            var23 |= var30 != -1;
                        }
                    }
                }
                if (!var23) {
                    var17.field1404 = null;
                }
            } else if ((var19 & 0x1) == 0) {
                for (int var20 = 0; var20 < var18; var20++) {
                    var17.field1400[var20] = var1.method1327((byte) -89);
                }
            } else {
                for (int var21 = 0; var21 < var17.field1401; var21++) {
                    for (int var22 = 0; var22 < var17.field1399; var22++) {
                        var17.field1400[var17.field1401 * var22 + var21] = var1.method1327((byte) -97);
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(Lmo;I)[Lvp;", line = 445)
    public static final class100[] method753(class447 arg0, int arg1) {
        byte[] var2 = arg0.method2776(0, arg1);
        return var2 == null ? null : method752(var2);
    }

    @OriginalMember(owner = "client!vp", name = "c", descriptor = "()[I", line = 454)
    public final int[] method754() {
        int var1 = this.method762();
        int[] var2 = new int[var1 * this.method760()];
        if (this.field1404 == null) {
            for (int var7 = 0; var7 < this.field1399; var7++) {
                int var8 = this.field1401 * var7;
                int var9 = (this.field1402 + var7) * var1 + this.field1398;
                for (int var10 = 0; var10 < this.field1401; var10++) {
                    int var11 = this.field1396[this.field1400[var8++] & 0xFF];
                    if (var11 == 0) {
                        var2[var9++] = 0;
                    } else {
                        var2[var9++] = var11 | 0xFF000000;
                    }
                }
            }
        } else {
            for (int var3 = 0; var3 < this.field1399; var3++) {
                int var4 = this.field1401 * var3;
                int var5 = (this.field1402 + var3) * var1 + this.field1398;
                for (int var6 = 0; var6 < this.field1401; var6++) {
                    var2[var5++] = this.field1404[var4] << 24 | this.field1396[this.field1400[var4] & 0xFF];
                    var4++;
                }
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!vp", name = "b", descriptor = "(Lmo;I)Lvp;", line = 518)
    public static final class100 method755(class447 arg0, int arg1) {
        byte[] var2 = arg0.method2776(0, arg1);
        return var2 == null ? null : method752(var2)[0];
    }

    @OriginalMember(owner = "client!vp", name = "b", descriptor = "(Lmo;II)Lvp;", line = 526)
    public static final class100 method756(class447 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2771(arg1, arg2, 3);
        return var3 == null ? null : method752(var3)[0];
    }

    @OriginalMember(owner = "client!vp", name = "d", descriptor = "()V", line = 535)
    public final void method757() {
        byte[] var1 = this.field1400;
        if (this.field1404 == null) {
            for (int var2 = (this.field1399 >> 1) - 1; var2 >= 0; var2--) {
                int var3 = this.field1401 * var2;
                int var4 = (this.field1399 - var2 - 1) * this.field1401;
                for (int var5 = -this.field1401; var5 < 0; var5++) {
                    byte var6 = var1[var3];
                    var1[var3] = var1[var4];
                    var1[var4] = var6;
                    var3++;
                    var4++;
                }
            }
        } else {
            byte[] var7 = this.field1404;
            for (int var8 = (this.field1399 >> 1) - 1; var8 >= 0; var8--) {
                int var10 = this.field1401 * var8;
                int var11 = (this.field1399 - var8 - 1) * this.field1401;
                for (int var12 = -this.field1401; var12 < 0; var12++) {
                    byte var13 = var1[var10];
                    var1[var10] = var1[var11];
                    var1[var11] = var13;
                    byte var14 = var7[var10];
                    var7[var10] = var7[var11];
                    var7[var11] = var14;
                    var10++;
                    var11++;
                }
            }
        }
        int var9 = this.field1402;
        this.field1402 = this.field1397;
        this.field1397 = var9;
    }

    @OriginalMember(owner = "client!vp", name = "b", descriptor = "(I)V", line = 606)
    public final void method758(int arg0) {
        int var2 = -1;
        if (this.field1396.length < 255) {
            for (int var3 = 0; var3 < this.field1396.length; var3++) {
                if (this.field1396[var3] == arg0) {
                    var2 = var3;
                    break;
                }
            }
            if (var2 == -1) {
                var2 = this.field1396.length;
                int[] var4 = new int[this.field1396.length + 1];
                class408.method2553(this.field1396, 0, var4, 0, this.field1396.length);
                this.field1396 = var4;
                var4[var2] = arg0;
            }
        } else {
            int var5 = Integer.MAX_VALUE;
            int var6 = arg0 >> 16 & 0xFF;
            int var7 = arg0 >> 8 & 0xFF;
            int var8 = arg0 & 0xFF;
            for (int var9 = 0; var9 < this.field1396.length; var9++) {
                int var15 = this.field1396[var9];
                int var16 = var15 >> 16 & 0xFF;
                int var17 = var15 >> 8 & 0xFF;
                int var18 = var15 & 0xFF;
                int var19 = var6 - var16;
                if (var19 < 0) {
                    var19 = -var19;
                }
                int var20 = var7 - var17;
                if (var20 < 0) {
                    var20 = -var20;
                }
                int var21 = var8 - var18;
                if (var21 < 0) {
                    var21 = -var21;
                }
                int var22 = var19 + var20 + var21;
                if (var22 < var5) {
                    var5 = var22;
                    var2 = var9;
                }
            }
        }
        int var10 = 0;
        byte[] var11 = new byte[this.field1401 * this.field1399];
        for (int var12 = 0; var12 < this.field1399; var12++) {
            for (int var13 = 0; var13 < this.field1401; var13++) {
                int var14 = this.field1400[var10] & 0xFF;
                if (this.field1396[var14] == 0) {
                    if (var13 > 0 && this.field1396[this.field1400[var10 - 1] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var12 > 0 && this.field1396[this.field1400[var10 - this.field1401] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var13 < this.field1401 - 1 && this.field1396[this.field1400[var10 + 1] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var12 < this.field1399 - 1 && this.field1396[this.field1400[this.field1401 + var10] & 0xFF] != 0) {
                        var14 = var2;
                    }
                }
                var11[var10++] = (byte) var14;
            }
        }
        this.field1400 = var11;
    }

    @OriginalMember(owner = "client!vp", name = "e", descriptor = "()V", line = 732)
    public final void method759() {
        byte[] var1 = this.field1400;
        if (this.field1404 == null) {
            for (int var2 = this.field1399 - 1; var2 >= 0; var2--) {
                int var3 = this.field1401 * var2;
                int var4 = (var2 + 1) * this.field1401;
                while (var3 < var4) {
                    var4--;
                    byte var5 = var1[var3];
                    var1[var3] = var1[var4];
                    var1[var4] = var5;
                    var3++;
                }
            }
        } else {
            byte[] var6 = this.field1404;
            for (int var7 = this.field1399 - 1; var7 >= 0; var7--) {
                int var9 = this.field1401 * var7;
                int var10 = (var7 + 1) * this.field1401;
                while (var9 < var10) {
                    var10--;
                    byte var11 = var1[var9];
                    var1[var9] = var1[var10];
                    var1[var10] = var11;
                    byte var12 = var6[var9];
                    var6[var9] = var6[var10];
                    var6[var10] = var12;
                    var9++;
                }
            }
        }
        int var8 = this.field1398;
        this.field1398 = this.field1403;
        this.field1403 = var8;
    }

    @OriginalMember(owner = "client!vp", name = "f", descriptor = "()I", line = 794)
    public final int method760() {
        return this.field1402 + this.field1399 + this.field1397;
    }

    @OriginalMember(owner = "client!vp", name = "c", descriptor = "(I)V", line = 800)
    public final void method761(int arg0) {
        int var2 = -1;
        if (this.field1396.length < 255) {
            for (int var3 = 0; var3 < this.field1396.length; var3++) {
                if (this.field1396[var3] == arg0) {
                    var2 = var3;
                    break;
                }
            }
            if (var2 == -1) {
                var2 = this.field1396.length;
                int[] var4 = new int[this.field1396.length + 1];
                class408.method2553(this.field1396, 0, var4, 0, this.field1396.length);
                this.field1396 = var4;
                var4[var2] = arg0;
            }
        } else {
            int var5 = Integer.MAX_VALUE;
            int var6 = arg0 >> 16 & 0xFF;
            int var7 = arg0 >> 8 & 0xFF;
            int var8 = arg0 & 0xFF;
            for (int var9 = 0; var9 < this.field1396.length; var9++) {
                int var13 = this.field1396[var9];
                int var14 = var13 >> 16 & 0xFF;
                int var15 = var13 >> 8 & 0xFF;
                int var16 = var13 & 0xFF;
                int var17 = var6 - var14;
                if (var17 < 0) {
                    var17 = -var17;
                }
                int var18 = var7 - var15;
                if (var18 < 0) {
                    var18 = -var18;
                }
                int var19 = var8 - var16;
                if (var19 < 0) {
                    var19 = -var19;
                }
                int var20 = var17 + var18 + var19;
                if (var20 < var5) {
                    var5 = var20;
                    var2 = var9;
                }
            }
        }
        for (int var10 = this.field1399 - 1; var10 > 0; var10--) {
            int var11 = this.field1401 * var10;
            for (int var12 = this.field1401 - 1; var12 > 0; var12--) {
                if (this.field1396[this.field1400[var11 + var12] & 0xFF] == 0 && this.field1396[this.field1400[var11 + var12 - this.field1401 - 1] & 0xFF] != 0) {
                    this.field1400[var11 + var12] = (byte) var2;
                }
            }
        }
    }

    @OriginalMember(owner = "client!vp", name = "g", descriptor = "()I", line = 906)
    public final int method762() {
        return this.field1401 + this.field1398 + this.field1403;
    }
}
