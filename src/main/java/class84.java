import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public class class84 {

    @OriginalMember(owner = "client!di", name = "a", descriptor = "I")
    public int field1204;

    @OriginalMember(owner = "client!di", name = "b", descriptor = "I")
    public int field1205;

    @OriginalMember(owner = "client!di", name = "c", descriptor = "I")
    public int field1206;

    @OriginalMember(owner = "client!di", name = "d", descriptor = "I")
    public int field1207;

    @OriginalMember(owner = "client!di", name = "f", descriptor = "I")
    public int field1209;

    @OriginalMember(owner = "client!di", name = "i", descriptor = "I")
    public int field1212;

    @OriginalMember(owner = "client!di", name = "g", descriptor = "[B")
    public byte[] field1210;

    @OriginalMember(owner = "client!di", name = "h", descriptor = "[B")
    public byte[] field1211;

    @OriginalMember(owner = "client!di", name = "e", descriptor = "[I")
    public int[] field1208;

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(Lul;I)Ldi;", line = 5)
    public static final class84 method694(class406 arg0, int arg1) {
        byte[] var2 = arg0.method2558(arg1, 95);
        return var2 == null ? null : method696(var2)[0];
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "()I", line = 14)
    public final int method695() {
        return this.field1205 + this.field1204 + this.field1206;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "([B)[Ldi;", line = 18)
    private static final class84[] method696(byte[] arg0) {
        class217 var1 = new class217(arg0);
        var1.field3556 = arg0.length - 2;
        int var2 = var1.method1511(-70);
        class84[] var3 = new class84[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            var3[var4] = new class84();
        }
        var1.field3556 = arg0.length - var2 * 8 - 7;
        int var5 = var1.method1511(116);
        int var6 = var1.method1511(-91);
        int var7 = (var1.method1515((byte) 122) & 0xFF) + 1;
        for (int var8 = 0; var8 < var2; var8++) {
            var3[var8].field1205 = var1.method1511(120);
        }
        for (int var9 = 0; var9 < var2; var9++) {
            var3[var9].field1209 = var1.method1511(-44);
        }
        for (int var10 = 0; var10 < var2; var10++) {
            var3[var10].field1204 = var1.method1511(-34);
        }
        for (int var11 = 0; var11 < var2; var11++) {
            var3[var11].field1207 = var1.method1511(-98);
        }
        for (int var12 = 0; var12 < var2; var12++) {
            class84 var32 = var3[var12];
            var32.field1206 = var5 - var32.field1204 - var32.field1205;
            var32.field1212 = var6 - var32.field1207 - var32.field1209;
        }
        var1.field3556 = arg0.length - var2 * 8 - (var7 - 1) * 3 - 7;
        int[] var13 = new int[var7];
        for (int var14 = 1; var14 < var7; var14++) {
            var13[var14] = var1.method1548(31529);
            if (var13[var14] == 0) {
                var13[var14] = 1;
            }
        }
        for (int var15 = 0; var15 < var2; var15++) {
            var3[var15].field1208 = var13;
        }
        var1.field3556 = 0;
        for (int var16 = 0; var16 < var2; var16++) {
            class84 var17 = var3[var16];
            int var18 = var17.field1207 * var17.field1204;
            var17.field1211 = new byte[var18];
            int var19 = var1.method1515((byte) 124);
            if ((var19 & 0x2) != 0) {
                boolean var23 = false;
                var17.field1210 = new byte[var18];
                if ((var19 & 0x1) == 0) {
                    for (int var24 = 0; var24 < var18; var24++) {
                        var17.field1211[var24] = var1.method1565(true);
                    }
                    for (int var25 = 0; var25 < var18; var25++) {
                        byte var26 = var17.field1210[var25] = var1.method1565(true);
                        var23 |= var26 != -1;
                    }
                } else {
                    for (int var27 = 0; var27 < var17.field1204; var27++) {
                        for (int var31 = 0; var31 < var17.field1207; var31++) {
                            var17.field1211[var17.field1204 * var31 + var27] = var1.method1565(true);
                        }
                    }
                    for (int var28 = 0; var28 < var17.field1204; var28++) {
                        for (int var29 = 0; var29 < var17.field1207; var29++) {
                            byte var30 = var17.field1210[var17.field1204 * var29 + var28] = var1.method1565(true);
                            var23 |= var30 != -1;
                        }
                    }
                }
                if (!var23) {
                    var17.field1210 = null;
                }
            } else if ((var19 & 0x1) == 0) {
                for (int var20 = 0; var20 < var18; var20++) {
                    var17.field1211[var20] = var1.method1565(true);
                }
            } else {
                for (int var21 = 0; var21 < var17.field1204; var21++) {
                    for (int var22 = 0; var22 < var17.field1207; var22++) {
                        var17.field1211[var17.field1204 * var22 + var21] = var1.method1565(true);
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(I)V", line = 226)
    public final void method697(int arg0) {
        int var2 = this.method695();
        int var3 = this.method700();
        if (this.field1204 == var2 && this.field1207 == var3) {
            return;
        }
        int var4 = arg0;
        if (arg0 > this.field1205) {
            var4 = this.field1205;
        }
        int var5 = arg0;
        if (this.field1205 + arg0 + this.field1204 > var2) {
            var5 = var2 - this.field1205 - this.field1204;
        }
        int var6 = arg0;
        if (arg0 > this.field1209) {
            var6 = this.field1209;
        }
        int var7 = arg0;
        if (this.field1209 + arg0 + this.field1207 > var3) {
            var7 = var3 - this.field1209 - this.field1207;
        }
        int var8 = this.field1204 + var4 + var5;
        int var9 = this.field1207 + var6 + var7;
        byte[] var10 = new byte[var8 * var9];
        if (this.field1210 == null) {
            for (int var11 = 0; var11 < this.field1207; var11++) {
                int var12 = this.field1204 * var11;
                int var13 = (var6 + var11) * var8 + var4;
                for (int var14 = 0; var14 < this.field1204; var14++) {
                    var10[var13++] = this.field1211[var12++];
                }
            }
        } else {
            byte[] var15 = new byte[var8 * var9];
            for (int var16 = 0; var16 < this.field1207; var16++) {
                int var17 = this.field1204 * var16;
                int var18 = (var6 + var16) * var8 + var4;
                for (int var19 = 0; var19 < this.field1204; var19++) {
                    var15[var18] = this.field1210[var17];
                    var10[var18++] = this.field1211[var17++];
                }
            }
            this.field1210 = var15;
        }
        this.field1205 -= var4;
        this.field1209 -= var6;
        this.field1206 -= var5;
        this.field1212 -= var7;
        this.field1204 = var8;
        this.field1207 = var9;
        this.field1211 = var10;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(Lul;II)[Ldi;", line = 322)
    public static final class84[] method698(class406 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2536(arg1, 0, arg2);
        return var3 == null ? null : method696(var3);
    }

    @OriginalMember(owner = "client!di", name = "b", descriptor = "(I)V", line = 330)
    public final void method699(int arg0) {
        int var2 = -1;
        if (this.field1208.length < 255) {
            for (int var3 = 0; var3 < this.field1208.length; var3++) {
                if (this.field1208[var3] == arg0) {
                    var2 = var3;
                    break;
                }
            }
            if (var2 == -1) {
                var2 = this.field1208.length;
                int[] var4 = new int[this.field1208.length + 1];
                class414.method2604(this.field1208, 0, var4, 0, this.field1208.length);
                this.field1208 = var4;
                var4[var2] = arg0;
            }
        } else {
            int var5 = Integer.MAX_VALUE;
            int var6 = arg0 >> 16 & 0xFF;
            int var7 = arg0 >> 8 & 0xFF;
            int var8 = arg0 & 0xFF;
            for (int var9 = 0; var9 < this.field1208.length; var9++) {
                int var15 = this.field1208[var9];
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
        byte[] var11 = new byte[this.field1207 * this.field1204];
        for (int var12 = 0; var12 < this.field1207; var12++) {
            for (int var13 = 0; var13 < this.field1204; var13++) {
                int var14 = this.field1211[var10] & 0xFF;
                if (this.field1208[var14] == 0) {
                    if (var13 > 0 && this.field1208[this.field1211[var10 - 1] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var12 > 0 && this.field1208[this.field1211[var10 - this.field1204] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var13 < this.field1204 - 1 && this.field1208[this.field1211[var10 + 1] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var12 < this.field1207 - 1 && this.field1208[this.field1211[this.field1204 + var10] & 0xFF] != 0) {
                        var14 = var2;
                    }
                }
                var11[var10++] = (byte) var14;
            }
        }
        this.field1211 = var11;
    }

    @OriginalMember(owner = "client!di", name = "b", descriptor = "()I", line = 455)
    public final int method700() {
        return this.field1209 + this.field1207 + this.field1212;
    }

    @OriginalMember(owner = "client!di", name = "c", descriptor = "()[I", line = 459)
    public final int[] method701() {
        int var1 = this.method695();
        int[] var2 = new int[var1 * this.method700()];
        if (this.field1210 == null) {
            for (int var7 = 0; var7 < this.field1207; var7++) {
                int var8 = this.field1204 * var7;
                int var9 = (this.field1209 + var7) * var1 + this.field1205;
                for (int var10 = 0; var10 < this.field1204; var10++) {
                    int var11 = this.field1208[this.field1211[var8++] & 0xFF];
                    if (var11 == 0) {
                        var2[var9++] = 0;
                    } else {
                        var2[var9++] = var11 | 0xFF000000;
                    }
                }
            }
        } else {
            for (int var3 = 0; var3 < this.field1207; var3++) {
                int var4 = this.field1204 * var3;
                int var5 = (this.field1209 + var3) * var1 + this.field1205;
                for (int var6 = 0; var6 < this.field1204; var6++) {
                    var2[var5++] = this.field1210[var4] << 24 | this.field1208[this.field1211[var4] & 0xFF];
                    var4++;
                }
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!di", name = "b", descriptor = "(Lul;II)Ldi;", line = 522)
    public static final class84 method702(class406 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2536(arg1, 0, arg2);
        return var3 == null ? null : method696(var3)[0];
    }

    @OriginalMember(owner = "client!di", name = "c", descriptor = "(I)V", line = 530)
    public final void method703(int arg0) {
        int var2 = -1;
        if (this.field1208.length < 255) {
            for (int var3 = 0; var3 < this.field1208.length; var3++) {
                if (this.field1208[var3] == arg0) {
                    var2 = var3;
                    break;
                }
            }
            if (var2 == -1) {
                var2 = this.field1208.length;
                int[] var4 = new int[this.field1208.length + 1];
                class414.method2604(this.field1208, 0, var4, 0, this.field1208.length);
                this.field1208 = var4;
                var4[var2] = arg0;
            }
        } else {
            int var5 = Integer.MAX_VALUE;
            int var6 = arg0 >> 16 & 0xFF;
            int var7 = arg0 >> 8 & 0xFF;
            int var8 = arg0 & 0xFF;
            for (int var9 = 0; var9 < this.field1208.length; var9++) {
                int var13 = this.field1208[var9];
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
        for (int var10 = this.field1207 - 1; var10 > 0; var10--) {
            int var11 = this.field1204 * var10;
            for (int var12 = this.field1204 - 1; var12 > 0; var12--) {
                if (this.field1208[this.field1211[var11 + var12] & 0xFF] == 0 && this.field1208[this.field1211[var11 + var12 - this.field1204 - 1] & 0xFF] != 0) {
                    this.field1211[var11 + var12] = (byte) var2;
                }
            }
        }
    }

    @OriginalMember(owner = "client!di", name = "d", descriptor = "()V", line = 633)
    public final void method704() {
        byte[] var1 = new byte[this.field1207 * this.field1204];
        int var2 = 0;
        if (this.field1210 == null) {
            for (int var3 = 0; var3 < this.field1204; var3++) {
                for (int var4 = this.field1207 - 1; var4 >= 0; var4--) {
                    var1[var2++] = this.field1211[this.field1204 * var4 + var3];
                }
            }
            this.field1211 = var1;
        } else {
            byte[] var5 = new byte[this.field1207 * this.field1204];
            for (int var6 = 0; var6 < this.field1204; var6++) {
                for (int var9 = this.field1207 - 1; var9 >= 0; var9--) {
                    var1[var2] = this.field1211[this.field1204 * var9 + var6];
                    var5[var2++] = this.field1210[this.field1204 * var9 + var6];
                }
            }
            this.field1211 = var1;
            this.field1210 = var5;
        }
        int var7 = this.field1209;
        this.field1209 = this.field1205;
        this.field1205 = this.field1212;
        this.field1212 = this.field1206;
        this.field1206 = this.field1209;
        int var8 = this.field1207;
        this.field1207 = this.field1204;
        this.field1204 = var8;
    }

    @OriginalMember(owner = "client!di", name = "b", descriptor = "(Lul;I)[Ldi;", line = 694)
    public static final class84[] method705(class406 arg0, int arg1) {
        byte[] var2 = arg0.method2558(arg1, 111);
        return var2 == null ? null : method696(var2);
    }

    @OriginalMember(owner = "client!di", name = "e", descriptor = "()V", line = 702)
    public final void method706() {
        int var1 = this.method695();
        int var2 = this.method700();
        if (this.field1204 == var1 && this.field1207 == var2) {
            return;
        }
        byte[] var3 = new byte[var1 * var2];
        if (this.field1210 == null) {
            for (int var9 = 0; var9 < this.field1207; var9++) {
                int var10 = this.field1204 * var9;
                int var11 = (this.field1209 + var9) * var1 + this.field1205;
                for (int var12 = 0; var12 < this.field1204; var12++) {
                    var3[var11++] = this.field1211[var10++];
                }
            }
        } else {
            byte[] var4 = new byte[var1 * var2];
            for (int var5 = 0; var5 < this.field1207; var5++) {
                int var6 = this.field1204 * var5;
                int var7 = (this.field1209 + var5) * var1 + this.field1205;
                for (int var8 = 0; var8 < this.field1204; var8++) {
                    var3[var7] = this.field1211[var6];
                    var4[var7++] = this.field1210[var6++];
                }
            }
            this.field1210 = var4;
        }
        this.field1205 = this.field1206 = this.field1209 = this.field1212 = 0;
        this.field1204 = var1;
        this.field1207 = var2;
        this.field1211 = var3;
    }

    @OriginalMember(owner = "client!di", name = "f", descriptor = "()V", line = 771)
    public final void method707() {
        byte[] var1 = this.field1211;
        if (this.field1210 == null) {
            for (int var2 = this.field1207 - 1; var2 >= 0; var2--) {
                int var3 = this.field1204 * var2;
                int var4 = (var2 + 1) * this.field1204;
                while (var3 < var4) {
                    var4--;
                    byte var5 = var1[var3];
                    var1[var3] = var1[var4];
                    var1[var4] = var5;
                    var3++;
                }
            }
        } else {
            byte[] var6 = this.field1210;
            for (int var7 = this.field1207 - 1; var7 >= 0; var7--) {
                int var9 = this.field1204 * var7;
                int var10 = (var7 + 1) * this.field1204;
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
        int var8 = this.field1205;
        this.field1205 = this.field1206;
        this.field1206 = var8;
    }

    @OriginalMember(owner = "client!di", name = "g", descriptor = "()V", line = 837)
    public final void method708() {
        byte[] var1 = this.field1211;
        if (this.field1210 == null) {
            for (int var2 = (this.field1207 >> 1) - 1; var2 >= 0; var2--) {
                int var3 = this.field1204 * var2;
                int var4 = (this.field1207 - var2 - 1) * this.field1204;
                for (int var5 = -this.field1204; var5 < 0; var5++) {
                    byte var6 = var1[var3];
                    var1[var3] = var1[var4];
                    var1[var4] = var6;
                    var3++;
                    var4++;
                }
            }
        } else {
            byte[] var7 = this.field1210;
            for (int var8 = (this.field1207 >> 1) - 1; var8 >= 0; var8--) {
                int var10 = this.field1204 * var8;
                int var11 = (this.field1207 - var8 - 1) * this.field1204;
                for (int var12 = -this.field1204; var12 < 0; var12++) {
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
        int var9 = this.field1209;
        this.field1209 = this.field1212;
        this.field1212 = var9;
    }
}
