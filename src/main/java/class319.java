import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ul")
public class class319 {

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "I")
    public int field4918;

    @OriginalMember(owner = "client!ul", name = "c", descriptor = "I")
    public int field4919;

    @OriginalMember(owner = "client!ul", name = "d", descriptor = "I")
    public int field4920;

    @OriginalMember(owner = "client!ul", name = "f", descriptor = "I")
    public int field4922;

    @OriginalMember(owner = "client!ul", name = "h", descriptor = "I")
    public int field4924;

    @OriginalMember(owner = "client!ul", name = "i", descriptor = "I")
    public int field4925;

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "[B")
    public byte[] field4917;

    @OriginalMember(owner = "client!ul", name = "e", descriptor = "[B")
    public byte[] field4921;

    @OriginalMember(owner = "client!ul", name = "g", descriptor = "[I")
    public int[] field4923;

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "()V")
    public final void method1985() {
        byte[] var1 = this.field4921;
        if (this.field4917 == null) {
            for (int var2 = (this.field4920 >> 1) - 1; var2 >= 0; var2--) {
                int var3 = this.field4922 * var2;
                int var4 = (this.field4920 - var2 - 1) * this.field4922;
                for (int var5 = -this.field4922; var5 < 0; var5++) {
                    byte var6 = var1[var3];
                    var1[var3] = var1[var4];
                    var1[var4] = var6;
                    var3++;
                    var4++;
                }
            }
        } else {
            byte[] var7 = this.field4917;
            for (int var8 = (this.field4920 >> 1) - 1; var8 >= 0; var8--) {
                int var10 = this.field4922 * var8;
                int var11 = (this.field4920 - var8 - 1) * this.field4922;
                for (int var12 = -this.field4922; var12 < 0; var12++) {
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
        int var9 = this.field4925;
        this.field4925 = this.field4924;
        this.field4924 = var9;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(I)V")
    public final void method1986(int arg0) {
        int var2 = -1;
        if (this.field4923.length < 255) {
            for (int var3 = 0; var3 < this.field4923.length; var3++) {
                if (this.field4923[var3] == arg0) {
                    var2 = var3;
                    break;
                }
            }
            if (var2 == -1) {
                var2 = this.field4923.length;
                int[] var4 = new int[this.field4923.length + 1];
                class442.method2593(this.field4923, 0, var4, 0, this.field4923.length);
                this.field4923 = var4;
                var4[var2] = arg0;
            }
        } else {
            int var5 = Integer.MAX_VALUE;
            int var6 = arg0 >> 16 & 0xFF;
            int var7 = arg0 >> 8 & 0xFF;
            int var8 = arg0 & 0xFF;
            for (int var9 = 0; var9 < this.field4923.length; var9++) {
                int var15 = this.field4923[var9];
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
        byte[] var11 = new byte[this.field4922 * this.field4920];
        for (int var12 = 0; var12 < this.field4920; var12++) {
            for (int var13 = 0; var13 < this.field4922; var13++) {
                int var14 = this.field4921[var10] & 0xFF;
                if (this.field4923[var14] == 0) {
                    if (var13 > 0 && this.field4923[this.field4921[var10 - 1] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var12 > 0 && this.field4923[this.field4921[var10 - this.field4922] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var13 < this.field4922 - 1 && this.field4923[this.field4921[var10 + 1] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var12 < this.field4920 - 1 && this.field4923[this.field4921[this.field4922 + var10] & 0xFF] != 0) {
                        var14 = var2;
                    }
                }
                var11[var10++] = (byte) var14;
            }
        }
        this.field4921 = var11;
    }

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "()[I")
    public final int[] method1987() {
        int var1 = this.method1998();
        int[] var2 = new int[var1 * this.method1989()];
        if (this.field4917 == null) {
            for (int var7 = 0; var7 < this.field4920; var7++) {
                int var8 = this.field4922 * var7;
                int var9 = (this.field4925 + var7) * var1 + this.field4918;
                for (int var10 = 0; var10 < this.field4922; var10++) {
                    int var11 = this.field4923[this.field4921[var8++] & 0xFF];
                    if (var11 == 0) {
                        var2[var9++] = 0;
                    } else {
                        var2[var9++] = var11 | 0xFF000000;
                    }
                }
            }
        } else {
            for (int var3 = 0; var3 < this.field4920; var3++) {
                int var4 = this.field4922 * var3;
                int var5 = (this.field4925 + var3) * var1 + this.field4918;
                for (int var6 = 0; var6 < this.field4922; var6++) {
                    var2[var5++] = this.field4917[var4] << 24 | this.field4923[this.field4921[var4] & 0xFF];
                    var4++;
                }
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "([B)[Lul;")
    private static final class319[] method1988(byte[] arg0) {
        class468 var1 = new class468(arg0);
        var1.field6830 = arg0.length - 2;
        int var2 = var1.method2727((byte) 43);
        class319[] var3 = new class319[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            var3[var4] = new class319();
        }
        var1.field6830 = arg0.length - var2 * 8 - 7;
        int var5 = var1.method2727((byte) 43);
        int var6 = var1.method2727((byte) 43);
        int var7 = (var1.method2765(104) & 0xFF) + 1;
        for (int var8 = 0; var8 < var2; var8++) {
            var3[var8].field4918 = var1.method2727((byte) 43);
        }
        for (int var9 = 0; var9 < var2; var9++) {
            var3[var9].field4925 = var1.method2727((byte) 43);
        }
        for (int var10 = 0; var10 < var2; var10++) {
            var3[var10].field4922 = var1.method2727((byte) 43);
        }
        for (int var11 = 0; var11 < var2; var11++) {
            var3[var11].field4920 = var1.method2727((byte) 43);
        }
        for (int var12 = 0; var12 < var2; var12++) {
            class319 var32 = var3[var12];
            var32.field4919 = var5 - var32.field4922 - var32.field4918;
            var32.field4924 = var6 - var32.field4920 - var32.field4925;
        }
        var1.field6830 = arg0.length - var2 * 8 - (var7 - 1) * 3 - 7;
        int[] var13 = new int[var7];
        for (int var14 = 1; var14 < var7; var14++) {
            var13[var14] = var1.method2759(1919914864);
            if (var13[var14] == 0) {
                var13[var14] = 1;
            }
        }
        for (int var15 = 0; var15 < var2; var15++) {
            var3[var15].field4923 = var13;
        }
        var1.field6830 = 0;
        for (int var16 = 0; var16 < var2; var16++) {
            class319 var17 = var3[var16];
            int var18 = var17.field4922 * var17.field4920;
            var17.field4921 = new byte[var18];
            int var19 = var1.method2765(104);
            if ((var19 & 0x2) != 0) {
                boolean var23 = false;
                var17.field4917 = new byte[var18];
                if ((var19 & 0x1) == 0) {
                    for (int var24 = 0; var24 < var18; var24++) {
                        var17.field4921[var24] = var1.method2714((byte) -57);
                    }
                    for (int var25 = 0; var25 < var18; var25++) {
                        byte var26 = var17.field4917[var25] = var1.method2714((byte) -68);
                        var23 |= var26 != -1;
                    }
                } else {
                    for (int var27 = 0; var27 < var17.field4922; var27++) {
                        for (int var31 = 0; var31 < var17.field4920; var31++) {
                            var17.field4921[var17.field4922 * var31 + var27] = var1.method2714((byte) -50);
                        }
                    }
                    for (int var28 = 0; var28 < var17.field4922; var28++) {
                        for (int var29 = 0; var29 < var17.field4920; var29++) {
                            byte var30 = var17.field4917[var17.field4922 * var29 + var28] = var1.method2714((byte) -97);
                            var23 |= var30 != -1;
                        }
                    }
                }
                if (!var23) {
                    var17.field4917 = null;
                }
            } else if ((var19 & 0x1) == 0) {
                for (int var20 = 0; var20 < var18; var20++) {
                    var17.field4921[var20] = var1.method2714((byte) -56);
                }
            } else {
                for (int var21 = 0; var21 < var17.field4922; var21++) {
                    for (int var22 = 0; var22 < var17.field4920; var22++) {
                        var17.field4921[var17.field4922 * var22 + var21] = var1.method2714((byte) -106);
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ul", name = "c", descriptor = "()I")
    public final int method1989() {
        return this.field4925 + this.field4920 + this.field4924;
    }

    @OriginalMember(owner = "client!ul", name = "d", descriptor = "()V")
    public final void method1990() {
        int var1 = this.method1998();
        int var2 = this.method1989();
        if (this.field4922 == var1 && this.field4920 == var2) {
            return;
        }
        byte[] var3 = new byte[var1 * var2];
        if (this.field4917 == null) {
            for (int var9 = 0; var9 < this.field4920; var9++) {
                int var10 = this.field4922 * var9;
                int var11 = (this.field4925 + var9) * var1 + this.field4918;
                for (int var12 = 0; var12 < this.field4922; var12++) {
                    var3[var11++] = this.field4921[var10++];
                }
            }
        } else {
            byte[] var4 = new byte[var1 * var2];
            for (int var5 = 0; var5 < this.field4920; var5++) {
                int var6 = this.field4922 * var5;
                int var7 = (this.field4925 + var5) * var1 + this.field4918;
                for (int var8 = 0; var8 < this.field4922; var8++) {
                    var3[var7] = this.field4921[var6];
                    var4[var7++] = this.field4917[var6++];
                }
            }
            this.field4917 = var4;
        }
        this.field4918 = this.field4919 = this.field4925 = this.field4924 = 0;
        this.field4922 = var1;
        this.field4920 = var2;
        this.field4921 = var3;
    }

    @OriginalMember(owner = "client!ul", name = "e", descriptor = "()V")
    public final void method1991() {
        byte[] var1 = new byte[this.field4922 * this.field4920];
        int var2 = 0;
        if (this.field4917 == null) {
            for (int var3 = 0; var3 < this.field4922; var3++) {
                for (int var4 = this.field4920 - 1; var4 >= 0; var4--) {
                    var1[var2++] = this.field4921[this.field4922 * var4 + var3];
                }
            }
            this.field4921 = var1;
        } else {
            byte[] var5 = new byte[this.field4922 * this.field4920];
            for (int var6 = 0; var6 < this.field4922; var6++) {
                for (int var9 = this.field4920 - 1; var9 >= 0; var9--) {
                    var1[var2] = this.field4921[this.field4922 * var9 + var6];
                    var5[var2++] = this.field4917[this.field4922 * var9 + var6];
                }
            }
            this.field4921 = var1;
            this.field4917 = var5;
        }
        int var7 = this.field4925;
        this.field4925 = this.field4918;
        this.field4918 = this.field4924;
        this.field4924 = this.field4919;
        this.field4919 = this.field4925;
        int var8 = this.field4920;
        this.field4920 = this.field4922;
        this.field4922 = var8;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(Lok;I)Lul;")
    public static final class319 method1992(class74 arg0, int arg1) {
        byte[] var2 = arg0.method526(arg1, 1);
        return var2 == null ? null : method1988(var2)[0];
    }

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "(Lok;I)[Lul;")
    public static final class319[] method1993(class74 arg0, int arg1) {
        byte[] var2 = arg0.method526(arg1, 1);
        return var2 == null ? null : method1988(var2);
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(Lok;II)Lul;")
    public static final class319 method1994(class74 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method541(arg2, arg1, (byte) -122);
        return var3 == null ? null : method1988(var3)[0];
    }

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "(Lok;II)[Lul;")
    public static final class319[] method1995(class74 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method541(arg2, arg1, (byte) -122);
        return var3 == null ? null : method1988(var3);
    }

    @OriginalMember(owner = "client!ul", name = "f", descriptor = "()V")
    public final void method1996() {
        byte[] var1 = this.field4921;
        if (this.field4917 == null) {
            for (int var2 = this.field4920 - 1; var2 >= 0; var2--) {
                int var3 = this.field4922 * var2;
                int var4 = (var2 + 1) * this.field4922;
                while (var3 < var4) {
                    var4--;
                    byte var5 = var1[var3];
                    var1[var3] = var1[var4];
                    var1[var4] = var5;
                    var3++;
                }
            }
        } else {
            byte[] var6 = this.field4917;
            for (int var7 = this.field4920 - 1; var7 >= 0; var7--) {
                int var9 = this.field4922 * var7;
                int var10 = (var7 + 1) * this.field4922;
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
        int var8 = this.field4918;
        this.field4918 = this.field4919;
        this.field4919 = var8;
    }

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "(I)V")
    public final void method1997(int arg0) {
        int var2 = -1;
        if (this.field4923.length < 255) {
            for (int var3 = 0; var3 < this.field4923.length; var3++) {
                if (this.field4923[var3] == arg0) {
                    var2 = var3;
                    break;
                }
            }
            if (var2 == -1) {
                var2 = this.field4923.length;
                int[] var4 = new int[this.field4923.length + 1];
                class442.method2593(this.field4923, 0, var4, 0, this.field4923.length);
                this.field4923 = var4;
                var4[var2] = arg0;
            }
        } else {
            int var5 = Integer.MAX_VALUE;
            int var6 = arg0 >> 16 & 0xFF;
            int var7 = arg0 >> 8 & 0xFF;
            int var8 = arg0 & 0xFF;
            for (int var9 = 0; var9 < this.field4923.length; var9++) {
                int var13 = this.field4923[var9];
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
        for (int var10 = this.field4920 - 1; var10 > 0; var10--) {
            int var11 = this.field4922 * var10;
            for (int var12 = this.field4922 - 1; var12 > 0; var12--) {
                if (this.field4923[this.field4921[var11 + var12] & 0xFF] == 0 && this.field4923[this.field4921[var11 + var12 - this.field4922 - 1] & 0xFF] != 0) {
                    this.field4921[var11 + var12] = (byte) var2;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ul", name = "g", descriptor = "()I")
    public final int method1998() {
        return this.field4922 + this.field4918 + this.field4919;
    }

    @OriginalMember(owner = "client!ul", name = "c", descriptor = "(I)V")
    public final void method1999(int arg0) {
        int var2 = this.method1998();
        int var3 = this.method1989();
        if (this.field4922 == var2 && this.field4920 == var3) {
            return;
        }
        int var4 = arg0;
        if (arg0 > this.field4918) {
            var4 = this.field4918;
        }
        int var5 = arg0;
        if (this.field4918 + arg0 + this.field4922 > var2) {
            var5 = var2 - this.field4918 - this.field4922;
        }
        int var6 = arg0;
        if (arg0 > this.field4925) {
            var6 = this.field4925;
        }
        int var7 = arg0;
        if (this.field4925 + arg0 + this.field4920 > var3) {
            var7 = var3 - this.field4925 - this.field4920;
        }
        int var8 = this.field4922 + var4 + var5;
        int var9 = this.field4920 + var6 + var7;
        byte[] var10 = new byte[var8 * var9];
        if (this.field4917 == null) {
            for (int var11 = 0; var11 < this.field4920; var11++) {
                int var12 = this.field4922 * var11;
                int var13 = (var6 + var11) * var8 + var4;
                for (int var14 = 0; var14 < this.field4922; var14++) {
                    var10[var13++] = this.field4921[var12++];
                }
            }
        } else {
            byte[] var15 = new byte[var8 * var9];
            for (int var16 = 0; var16 < this.field4920; var16++) {
                int var17 = this.field4922 * var16;
                int var18 = (var6 + var16) * var8 + var4;
                for (int var19 = 0; var19 < this.field4922; var19++) {
                    var15[var18] = this.field4917[var17];
                    var10[var18++] = this.field4921[var17++];
                }
            }
            this.field4917 = var15;
        }
        this.field4918 -= var4;
        this.field4925 -= var6;
        this.field4919 -= var5;
        this.field4924 -= var7;
        this.field4922 = var8;
        this.field4920 = var9;
        this.field4921 = var10;
    }
}
