import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ev")
public class class491 {

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "I")
    public int field7191;

    @OriginalMember(owner = "client!ev", name = "c", descriptor = "I")
    public int field7193;

    @OriginalMember(owner = "client!ev", name = "d", descriptor = "I")
    public int field7194;

    @OriginalMember(owner = "client!ev", name = "e", descriptor = "I")
    public int field7195;

    @OriginalMember(owner = "client!ev", name = "f", descriptor = "I")
    public int field7196;

    @OriginalMember(owner = "client!ev", name = "i", descriptor = "I")
    public int field7199;

    @OriginalMember(owner = "client!ev", name = "b", descriptor = "[B")
    public byte[] field7192;

    @OriginalMember(owner = "client!ev", name = "h", descriptor = "[B")
    public byte[] field7198;

    @OriginalMember(owner = "client!ev", name = "g", descriptor = "[I")
    public int[] field7197;

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "()[I")
    public final int[] method2962() {
        int var1 = this.method2974();
        int[] var2 = new int[var1 * this.method2975()];
        if (this.field7198 == null) {
            for (int var7 = 0; var7 < this.field7191; var7++) {
                int var8 = this.field7196 * var7;
                int var9 = (this.field7199 + var7) * var1 + this.field7195;
                for (int var10 = 0; var10 < this.field7196; var10++) {
                    int var11 = this.field7197[this.field7192[var8++] & 0xFF];
                    if (var11 == 0) {
                        var2[var9++] = 0;
                    } else {
                        var2[var9++] = var11 | 0xFF000000;
                    }
                }
            }
        } else {
            for (int var3 = 0; var3 < this.field7191; var3++) {
                int var4 = this.field7196 * var3;
                int var5 = (this.field7199 + var3) * var1 + this.field7195;
                for (int var6 = 0; var6 < this.field7196; var6++) {
                    var2[var5++] = this.field7198[var4] << 24 | this.field7197[this.field7192[var4] & 0xFF];
                    var4++;
                }
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(Lfo;I)Lev;")
    public static final class491 method2963(class361 arg0, int arg1) {
        byte[] var2 = arg0.method2128(-2, arg1);
        return var2 == null ? null : method2968(var2)[0];
    }

    @OriginalMember(owner = "client!ev", name = "b", descriptor = "()V")
    public final void method2964() {
        byte[] var1 = new byte[this.field7196 * this.field7191];
        int var2 = 0;
        if (this.field7198 == null) {
            for (int var3 = 0; var3 < this.field7196; var3++) {
                for (int var4 = this.field7191 - 1; var4 >= 0; var4--) {
                    var1[var2++] = this.field7192[this.field7196 * var4 + var3];
                }
            }
            this.field7192 = var1;
        } else {
            byte[] var5 = new byte[this.field7196 * this.field7191];
            for (int var6 = 0; var6 < this.field7196; var6++) {
                for (int var9 = this.field7191 - 1; var9 >= 0; var9--) {
                    var1[var2] = this.field7192[this.field7196 * var9 + var6];
                    var5[var2++] = this.field7198[this.field7196 * var9 + var6];
                }
            }
            this.field7192 = var1;
            this.field7198 = var5;
        }
        int var7 = this.field7199;
        this.field7199 = this.field7195;
        this.field7195 = this.field7194;
        this.field7194 = this.field7193;
        this.field7193 = this.field7199;
        int var8 = this.field7191;
        this.field7191 = this.field7196;
        this.field7196 = var8;
    }

    @OriginalMember(owner = "client!ev", name = "c", descriptor = "()V")
    public final void method2965() {
        int var1 = this.method2974();
        int var2 = this.method2975();
        if (this.field7196 == var1 && this.field7191 == var2) {
            return;
        }
        byte[] var3 = new byte[var1 * var2];
        if (this.field7198 == null) {
            for (int var9 = 0; var9 < this.field7191; var9++) {
                int var10 = this.field7196 * var9;
                int var11 = (this.field7199 + var9) * var1 + this.field7195;
                for (int var12 = 0; var12 < this.field7196; var12++) {
                    var3[var11++] = this.field7192[var10++];
                }
            }
        } else {
            byte[] var4 = new byte[var1 * var2];
            for (int var5 = 0; var5 < this.field7191; var5++) {
                int var6 = this.field7196 * var5;
                int var7 = (this.field7199 + var5) * var1 + this.field7195;
                for (int var8 = 0; var8 < this.field7196; var8++) {
                    var3[var7] = this.field7192[var6];
                    var4[var7++] = this.field7198[var6++];
                }
            }
            this.field7198 = var4;
        }
        this.field7195 = this.field7193 = this.field7199 = this.field7194 = 0;
        this.field7196 = var1;
        this.field7191 = var2;
        this.field7192 = var3;
    }

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(I)V")
    public final void method2966(int arg0) {
        int var2 = -1;
        if (this.field7197.length < 255) {
            for (int var3 = 0; var3 < this.field7197.length; var3++) {
                if (this.field7197[var3] == arg0) {
                    var2 = var3;
                    break;
                }
            }
            if (var2 == -1) {
                var2 = this.field7197.length;
                int[] var4 = new int[this.field7197.length + 1];
                class438.method2689(this.field7197, 0, var4, 0, this.field7197.length);
                this.field7197 = var4;
                var4[var2] = arg0;
            }
        } else {
            int var5 = Integer.MAX_VALUE;
            int var6 = arg0 >> 16 & 0xFF;
            int var7 = arg0 >> 8 & 0xFF;
            int var8 = arg0 & 0xFF;
            for (int var9 = 0; var9 < this.field7197.length; var9++) {
                int var15 = this.field7197[var9];
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
        byte[] var11 = new byte[this.field7196 * this.field7191];
        for (int var12 = 0; var12 < this.field7191; var12++) {
            for (int var13 = 0; var13 < this.field7196; var13++) {
                int var14 = this.field7192[var10] & 0xFF;
                if (this.field7197[var14] == 0) {
                    if (var13 > 0 && this.field7197[this.field7192[var10 - 1] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var12 > 0 && this.field7197[this.field7192[var10 - this.field7196] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var13 < this.field7196 - 1 && this.field7197[this.field7192[var10 + 1] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var12 < this.field7191 - 1 && this.field7197[this.field7192[this.field7196 + var10] & 0xFF] != 0) {
                        var14 = var2;
                    }
                }
                var11[var10++] = (byte) var14;
            }
        }
        this.field7192 = var11;
    }

    @OriginalMember(owner = "client!ev", name = "d", descriptor = "()V")
    public final void method2967() {
        byte[] var1 = this.field7192;
        if (this.field7198 == null) {
            for (int var2 = this.field7191 - 1; var2 >= 0; var2--) {
                int var3 = this.field7196 * var2;
                int var4 = (var2 + 1) * this.field7196;
                while (var3 < var4) {
                    var4--;
                    byte var5 = var1[var3];
                    var1[var3] = var1[var4];
                    var1[var4] = var5;
                    var3++;
                }
            }
        } else {
            byte[] var6 = this.field7198;
            for (int var7 = this.field7191 - 1; var7 >= 0; var7--) {
                int var9 = this.field7196 * var7;
                int var10 = (var7 + 1) * this.field7196;
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
        int var8 = this.field7195;
        this.field7195 = this.field7193;
        this.field7193 = var8;
    }

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "([B)[Lev;")
    private static final class491[] method2968(byte[] arg0) {
        class396 var1 = new class396(arg0);
        var1.field5729 = arg0.length - 2;
        int var2 = var1.method2386(-23648);
        class491[] var3 = new class491[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            var3[var4] = new class491();
        }
        var1.field5729 = arg0.length - var2 * 8 - 7;
        int var5 = var1.method2386(-23648);
        int var6 = var1.method2386(-23648);
        int var7 = (var1.method2388((byte) -112) & 0xFF) + 1;
        for (int var8 = 0; var8 < var2; var8++) {
            var3[var8].field7195 = var1.method2386(-23648);
        }
        for (int var9 = 0; var9 < var2; var9++) {
            var3[var9].field7199 = var1.method2386(-23648);
        }
        for (int var10 = 0; var10 < var2; var10++) {
            var3[var10].field7196 = var1.method2386(-23648);
        }
        for (int var11 = 0; var11 < var2; var11++) {
            var3[var11].field7191 = var1.method2386(-23648);
        }
        for (int var12 = 0; var12 < var2; var12++) {
            class491 var32 = var3[var12];
            var32.field7193 = var5 - var32.field7196 - var32.field7195;
            var32.field7194 = var6 - var32.field7191 - var32.field7199;
        }
        var1.field5729 = arg0.length - var2 * 8 - (var7 - 1) * 3 - 7;
        int[] var13 = new int[var7];
        for (int var14 = 1; var14 < var7; var14++) {
            var13[var14] = var1.method2396((byte) -105);
            if (var13[var14] == 0) {
                var13[var14] = 1;
            }
        }
        for (int var15 = 0; var15 < var2; var15++) {
            var3[var15].field7197 = var13;
        }
        var1.field5729 = 0;
        for (int var16 = 0; var16 < var2; var16++) {
            class491 var17 = var3[var16];
            int var18 = var17.field7196 * var17.field7191;
            var17.field7192 = new byte[var18];
            int var19 = var1.method2388((byte) -121);
            if ((var19 & 0x2) != 0) {
                boolean var23 = false;
                var17.field7198 = new byte[var18];
                if ((var19 & 0x1) == 0) {
                    for (int var24 = 0; var24 < var18; var24++) {
                        var17.field7192[var24] = var1.method2418(-48);
                    }
                    for (int var25 = 0; var25 < var18; var25++) {
                        byte var26 = var17.field7198[var25] = var1.method2418(-101);
                        var23 |= var26 != -1;
                    }
                } else {
                    for (int var27 = 0; var27 < var17.field7196; var27++) {
                        for (int var31 = 0; var31 < var17.field7191; var31++) {
                            var17.field7192[var17.field7196 * var31 + var27] = var1.method2418(-107);
                        }
                    }
                    for (int var28 = 0; var28 < var17.field7196; var28++) {
                        for (int var29 = 0; var29 < var17.field7191; var29++) {
                            byte var30 = var17.field7198[var17.field7196 * var29 + var28] = var1.method2418(-19);
                            var23 |= var30 != -1;
                        }
                    }
                }
                if (!var23) {
                    var17.field7198 = null;
                }
            } else if ((var19 & 0x1) == 0) {
                for (int var20 = 0; var20 < var18; var20++) {
                    var17.field7192[var20] = var1.method2418(103);
                }
            } else {
                for (int var21 = 0; var21 < var17.field7196; var21++) {
                    for (int var22 = 0; var22 < var17.field7191; var22++) {
                        var17.field7192[var17.field7196 * var22 + var21] = var1.method2418(113);
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(Lfo;II)Lev;")
    public static final class491 method2969(class361 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2130(arg1, arg2, -122);
        return var3 == null ? null : method2968(var3)[0];
    }

    @OriginalMember(owner = "client!ev", name = "b", descriptor = "(I)V")
    public final void method2970(int arg0) {
        int var2 = this.method2974();
        int var3 = this.method2975();
        if (this.field7196 == var2 && this.field7191 == var3) {
            return;
        }
        int var4 = arg0;
        if (arg0 > this.field7195) {
            var4 = this.field7195;
        }
        int var5 = arg0;
        if (this.field7195 + arg0 + this.field7196 > var2) {
            var5 = var2 - this.field7195 - this.field7196;
        }
        int var6 = arg0;
        if (arg0 > this.field7199) {
            var6 = this.field7199;
        }
        int var7 = arg0;
        if (this.field7199 + arg0 + this.field7191 > var3) {
            var7 = var3 - this.field7199 - this.field7191;
        }
        int var8 = this.field7196 + var4 + var5;
        int var9 = this.field7191 + var6 + var7;
        byte[] var10 = new byte[var8 * var9];
        if (this.field7198 == null) {
            for (int var11 = 0; var11 < this.field7191; var11++) {
                int var12 = this.field7196 * var11;
                int var13 = (var6 + var11) * var8 + var4;
                for (int var14 = 0; var14 < this.field7196; var14++) {
                    var10[var13++] = this.field7192[var12++];
                }
            }
        } else {
            byte[] var15 = new byte[var8 * var9];
            for (int var16 = 0; var16 < this.field7191; var16++) {
                int var17 = this.field7196 * var16;
                int var18 = (var6 + var16) * var8 + var4;
                for (int var19 = 0; var19 < this.field7196; var19++) {
                    var15[var18] = this.field7198[var17];
                    var10[var18++] = this.field7192[var17++];
                }
            }
            this.field7198 = var15;
        }
        this.field7195 -= var4;
        this.field7199 -= var6;
        this.field7193 -= var5;
        this.field7194 -= var7;
        this.field7196 = var8;
        this.field7191 = var9;
        this.field7192 = var10;
    }

    @OriginalMember(owner = "client!ev", name = "e", descriptor = "()V")
    public final void method2971() {
        byte[] var1 = this.field7192;
        if (this.field7198 == null) {
            for (int var2 = (this.field7191 >> 1) - 1; var2 >= 0; var2--) {
                int var3 = this.field7196 * var2;
                int var4 = (this.field7191 - var2 - 1) * this.field7196;
                for (int var5 = -this.field7196; var5 < 0; var5++) {
                    byte var6 = var1[var3];
                    var1[var3] = var1[var4];
                    var1[var4] = var6;
                    var3++;
                    var4++;
                }
            }
        } else {
            byte[] var7 = this.field7198;
            for (int var8 = (this.field7191 >> 1) - 1; var8 >= 0; var8--) {
                int var10 = this.field7196 * var8;
                int var11 = (this.field7191 - var8 - 1) * this.field7196;
                for (int var12 = -this.field7196; var12 < 0; var12++) {
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
        int var9 = this.field7199;
        this.field7199 = this.field7194;
        this.field7194 = var9;
    }

    @OriginalMember(owner = "client!ev", name = "b", descriptor = "(Lfo;I)[Lev;")
    public static final class491[] method2972(class361 arg0, int arg1) {
        byte[] var2 = arg0.method2128(-2, arg1);
        return var2 == null ? null : method2968(var2);
    }

    @OriginalMember(owner = "client!ev", name = "c", descriptor = "(I)V")
    public final void method2973(int arg0) {
        int var2 = -1;
        if (this.field7197.length < 255) {
            for (int var3 = 0; var3 < this.field7197.length; var3++) {
                if (this.field7197[var3] == arg0) {
                    var2 = var3;
                    break;
                }
            }
            if (var2 == -1) {
                var2 = this.field7197.length;
                int[] var4 = new int[this.field7197.length + 1];
                class438.method2689(this.field7197, 0, var4, 0, this.field7197.length);
                this.field7197 = var4;
                var4[var2] = arg0;
            }
        } else {
            int var5 = Integer.MAX_VALUE;
            int var6 = arg0 >> 16 & 0xFF;
            int var7 = arg0 >> 8 & 0xFF;
            int var8 = arg0 & 0xFF;
            for (int var9 = 0; var9 < this.field7197.length; var9++) {
                int var13 = this.field7197[var9];
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
        for (int var10 = this.field7191 - 1; var10 > 0; var10--) {
            int var11 = this.field7196 * var10;
            for (int var12 = this.field7196 - 1; var12 > 0; var12--) {
                if (this.field7197[this.field7192[var11 + var12] & 0xFF] == 0 && this.field7197[this.field7192[var11 + var12 - this.field7196 - 1] & 0xFF] != 0) {
                    this.field7192[var11 + var12] = (byte) var2;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ev", name = "f", descriptor = "()I")
    public final int method2974() {
        return this.field7196 + this.field7195 + this.field7193;
    }

    @OriginalMember(owner = "client!ev", name = "g", descriptor = "()I")
    public final int method2975() {
        return this.field7199 + this.field7191 + this.field7194;
    }

    @OriginalMember(owner = "client!ev", name = "b", descriptor = "(Lfo;II)[Lev;")
    public static final class491[] method2976(class361 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2130(arg1, arg2, -105);
        return var3 == null ? null : method2968(var3);
    }
}
