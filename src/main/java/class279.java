import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vw")
public class class279 {

    @OriginalMember(owner = "client!vw", name = "b", descriptor = "I")
    public int field4168;

    @OriginalMember(owner = "client!vw", name = "e", descriptor = "I")
    public int field4171;

    @OriginalMember(owner = "client!vw", name = "f", descriptor = "I")
    public int field4172;

    @OriginalMember(owner = "client!vw", name = "g", descriptor = "I")
    public int field4173;

    @OriginalMember(owner = "client!vw", name = "h", descriptor = "I")
    public int field4174;

    @OriginalMember(owner = "client!vw", name = "i", descriptor = "I")
    public int field4175;

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "[B")
    public byte[] field4167;

    @OriginalMember(owner = "client!vw", name = "d", descriptor = "[B")
    public byte[] field4170;

    @OriginalMember(owner = "client!vw", name = "c", descriptor = "[I")
    public int[] field4169;

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "(Lom;I)[Lvw;")
    public static final class279[] method1840(class344 arg0, int arg1) {
        byte[] var2 = arg0.method2242(0, arg1);
        return var2 == null ? null : method1845(var2);
    }

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "(Lom;II)Lvw;")
    public static final class279 method1841(class344 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2216(arg1, arg2, true);
        return var3 == null ? null : method1845(var3)[0];
    }

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "()[I")
    public final int[] method1842() {
        int var1 = this.method1846();
        int[] var2 = new int[var1 * this.method1850()];
        if (this.field4170 == null) {
            for (int var7 = 0; var7 < this.field4171; var7++) {
                int var8 = this.field4174 * var7;
                int var9 = (this.field4172 + var7) * var1 + this.field4168;
                for (int var10 = 0; var10 < this.field4174; var10++) {
                    int var11 = this.field4169[this.field4167[var8++] & 0xFF];
                    if (var11 == 0) {
                        var2[var9++] = 0;
                    } else {
                        var2[var9++] = var11 | 0xFF000000;
                    }
                }
            }
        } else {
            for (int var3 = 0; var3 < this.field4171; var3++) {
                int var4 = this.field4174 * var3;
                int var5 = (this.field4172 + var3) * var1 + this.field4168;
                for (int var6 = 0; var6 < this.field4174; var6++) {
                    var2[var5++] = this.field4170[var4] << 24 | this.field4169[this.field4167[var4] & 0xFF];
                    var4++;
                }
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "(I)V")
    public final void method1843(int arg0) {
        int var2 = -1;
        if (this.field4169.length < 255) {
            for (int var3 = 0; var3 < this.field4169.length; var3++) {
                if (this.field4169[var3] == arg0) {
                    var2 = var3;
                    break;
                }
            }
            if (var2 == -1) {
                var2 = this.field4169.length;
                int[] var4 = new int[this.field4169.length + 1];
                class692.method3874(this.field4169, 0, var4, 0, this.field4169.length);
                this.field4169 = var4;
                var4[var2] = arg0;
            }
        } else {
            int var5 = Integer.MAX_VALUE;
            int var6 = arg0 >> 16 & 0xFF;
            int var7 = arg0 >> 8 & 0xFF;
            int var8 = arg0 & 0xFF;
            for (int var9 = 0; var9 < this.field4169.length; var9++) {
                int var15 = this.field4169[var9];
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
        byte[] var11 = new byte[this.field4174 * this.field4171];
        for (int var12 = 0; var12 < this.field4171; var12++) {
            for (int var13 = 0; var13 < this.field4174; var13++) {
                int var14 = this.field4167[var10] & 0xFF;
                if (this.field4169[var14] == 0) {
                    if (var13 > 0 && this.field4169[this.field4167[var10 - 1] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var12 > 0 && this.field4169[this.field4167[var10 - this.field4174] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var13 < this.field4174 - 1 && this.field4169[this.field4167[var10 + 1] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var12 < this.field4171 - 1 && this.field4169[this.field4167[this.field4174 + var10] & 0xFF] != 0) {
                        var14 = var2;
                    }
                }
                var11[var10++] = (byte) var14;
            }
        }
        this.field4167 = var11;
    }

    @OriginalMember(owner = "client!vw", name = "b", descriptor = "(Lom;II)[Lvw;")
    public static final class279[] method1844(class344 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2216(arg1, arg2, true);
        return var3 == null ? null : method1845(var3);
    }

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "([B)[Lvw;")
    private static final class279[] method1845(byte[] arg0) {
        class61 var1 = new class61(arg0);
        var1.field1393 = arg0.length - 2;
        int var2 = var1.method723((byte) -25);
        class279[] var3 = new class279[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            var3[var4] = new class279();
        }
        var1.field1393 = arg0.length - var2 * 8 - 7;
        int var5 = var1.method723((byte) -25);
        int var6 = var1.method723((byte) -25);
        int var7 = (var1.method732(-559537960) & 0xFF) + 1;
        for (int var8 = 0; var8 < var2; var8++) {
            var3[var8].field4168 = var1.method723((byte) -25);
        }
        for (int var9 = 0; var9 < var2; var9++) {
            var3[var9].field4172 = var1.method723((byte) -25);
        }
        for (int var10 = 0; var10 < var2; var10++) {
            var3[var10].field4174 = var1.method723((byte) -25);
        }
        for (int var11 = 0; var11 < var2; var11++) {
            var3[var11].field4171 = var1.method723((byte) -25);
        }
        for (int var12 = 0; var12 < var2; var12++) {
            class279 var32 = var3[var12];
            var32.field4173 = var5 - var32.field4174 - var32.field4168;
            var32.field4175 = var6 - var32.field4171 - var32.field4172;
        }
        var1.field1393 = arg0.length - var2 * 8 - (var7 - 1) * 3 - 7;
        int[] var13 = new int[var7];
        for (int var14 = 1; var14 < var7; var14++) {
            var13[var14] = var1.method740((byte) 94);
            if (var13[var14] == 0) {
                var13[var14] = 1;
            }
        }
        for (int var15 = 0; var15 < var2; var15++) {
            var3[var15].field4169 = var13;
        }
        var1.field1393 = 0;
        for (int var16 = 0; var16 < var2; var16++) {
            class279 var17 = var3[var16];
            int var18 = var17.field4174 * var17.field4171;
            var17.field4167 = new byte[var18];
            int var19 = var1.method732(-559537960);
            if ((var19 & 0x2) != 0) {
                boolean var23 = false;
                var17.field4170 = new byte[var18];
                if ((var19 & 0x1) == 0) {
                    for (int var24 = 0; var24 < var18; var24++) {
                        var17.field4167[var24] = var1.method710((byte) 43);
                    }
                    for (int var25 = 0; var25 < var18; var25++) {
                        byte var26 = var17.field4170[var25] = var1.method710((byte) 43);
                        var23 |= var26 != -1;
                    }
                } else {
                    for (int var27 = 0; var27 < var17.field4174; var27++) {
                        for (int var31 = 0; var31 < var17.field4171; var31++) {
                            var17.field4167[var17.field4174 * var31 + var27] = var1.method710((byte) 43);
                        }
                    }
                    for (int var28 = 0; var28 < var17.field4174; var28++) {
                        for (int var29 = 0; var29 < var17.field4171; var29++) {
                            byte var30 = var17.field4170[var17.field4174 * var29 + var28] = var1.method710((byte) 43);
                            var23 |= var30 != -1;
                        }
                    }
                }
                if (!var23) {
                    var17.field4170 = null;
                }
            } else if ((var19 & 0x1) == 0) {
                for (int var20 = 0; var20 < var18; var20++) {
                    var17.field4167[var20] = var1.method710((byte) 43);
                }
            } else {
                for (int var21 = 0; var21 < var17.field4174; var21++) {
                    for (int var22 = 0; var22 < var17.field4171; var22++) {
                        var17.field4167[var17.field4174 * var22 + var21] = var1.method710((byte) 43);
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!vw", name = "b", descriptor = "()I")
    public final int method1846() {
        return this.field4174 + this.field4168 + this.field4173;
    }

    @OriginalMember(owner = "client!vw", name = "c", descriptor = "()V")
    public final void method1847() {
        int var1 = this.method1846();
        int var2 = this.method1850();
        if (this.field4174 == var1 && this.field4171 == var2) {
            return;
        }
        byte[] var3 = new byte[var1 * var2];
        if (this.field4170 == null) {
            for (int var9 = 0; var9 < this.field4171; var9++) {
                int var10 = this.field4174 * var9;
                int var11 = (this.field4172 + var9) * var1 + this.field4168;
                for (int var12 = 0; var12 < this.field4174; var12++) {
                    var3[var11++] = this.field4167[var10++];
                }
            }
        } else {
            byte[] var4 = new byte[var1 * var2];
            for (int var5 = 0; var5 < this.field4171; var5++) {
                int var6 = this.field4174 * var5;
                int var7 = (this.field4172 + var5) * var1 + this.field4168;
                for (int var8 = 0; var8 < this.field4174; var8++) {
                    var3[var7] = this.field4167[var6];
                    var4[var7++] = this.field4170[var6++];
                }
            }
            this.field4170 = var4;
        }
        this.field4168 = this.field4173 = this.field4172 = this.field4175 = 0;
        this.field4174 = var1;
        this.field4171 = var2;
        this.field4167 = var3;
    }

    @OriginalMember(owner = "client!vw", name = "b", descriptor = "(Lom;I)Lvw;")
    public static final class279 method1848(class344 arg0, int arg1) {
        byte[] var2 = arg0.method2242(0, arg1);
        return var2 == null ? null : method1845(var2)[0];
    }

    @OriginalMember(owner = "client!vw", name = "d", descriptor = "()V")
    public final void method1849() {
        byte[] var1 = this.field4167;
        if (this.field4170 == null) {
            for (int var2 = this.field4171 - 1; var2 >= 0; var2--) {
                int var3 = this.field4174 * var2;
                int var4 = (var2 + 1) * this.field4174;
                while (var3 < var4) {
                    var4--;
                    byte var5 = var1[var3];
                    var1[var3] = var1[var4];
                    var1[var4] = var5;
                    var3++;
                }
            }
        } else {
            byte[] var6 = this.field4170;
            for (int var7 = this.field4171 - 1; var7 >= 0; var7--) {
                int var9 = this.field4174 * var7;
                int var10 = (var7 + 1) * this.field4174;
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
        int var8 = this.field4168;
        this.field4168 = this.field4173;
        this.field4173 = var8;
    }

    @OriginalMember(owner = "client!vw", name = "e", descriptor = "()I")
    public final int method1850() {
        return this.field4172 + this.field4171 + this.field4175;
    }

    @OriginalMember(owner = "client!vw", name = "f", descriptor = "()V")
    public final void method1851() {
        byte[] var1 = new byte[this.field4174 * this.field4171];
        int var2 = 0;
        if (this.field4170 == null) {
            for (int var3 = 0; var3 < this.field4174; var3++) {
                for (int var4 = this.field4171 - 1; var4 >= 0; var4--) {
                    var1[var2++] = this.field4167[this.field4174 * var4 + var3];
                }
            }
            this.field4167 = var1;
        } else {
            byte[] var5 = new byte[this.field4174 * this.field4171];
            for (int var6 = 0; var6 < this.field4174; var6++) {
                for (int var9 = this.field4171 - 1; var9 >= 0; var9--) {
                    var1[var2] = this.field4167[this.field4174 * var9 + var6];
                    var5[var2++] = this.field4170[this.field4174 * var9 + var6];
                }
            }
            this.field4167 = var1;
            this.field4170 = var5;
        }
        int var7 = this.field4172;
        this.field4172 = this.field4168;
        this.field4168 = this.field4175;
        this.field4175 = this.field4173;
        this.field4173 = this.field4172;
        int var8 = this.field4171;
        this.field4171 = this.field4174;
        this.field4174 = var8;
    }

    @OriginalMember(owner = "client!vw", name = "b", descriptor = "(I)V")
    public final void method1852(int arg0) {
        int var2 = -1;
        if (this.field4169.length < 255) {
            for (int var3 = 0; var3 < this.field4169.length; var3++) {
                if (this.field4169[var3] == arg0) {
                    var2 = var3;
                    break;
                }
            }
            if (var2 == -1) {
                var2 = this.field4169.length;
                int[] var4 = new int[this.field4169.length + 1];
                class692.method3874(this.field4169, 0, var4, 0, this.field4169.length);
                this.field4169 = var4;
                var4[var2] = arg0;
            }
        } else {
            int var5 = Integer.MAX_VALUE;
            int var6 = arg0 >> 16 & 0xFF;
            int var7 = arg0 >> 8 & 0xFF;
            int var8 = arg0 & 0xFF;
            for (int var9 = 0; var9 < this.field4169.length; var9++) {
                int var13 = this.field4169[var9];
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
        for (int var10 = this.field4171 - 1; var10 > 0; var10--) {
            int var11 = this.field4174 * var10;
            for (int var12 = this.field4174 - 1; var12 > 0; var12--) {
                if (this.field4169[this.field4167[var11 + var12] & 0xFF] == 0 && this.field4169[this.field4167[var11 + var12 - this.field4174 - 1] & 0xFF] != 0) {
                    this.field4167[var11 + var12] = (byte) var2;
                }
            }
        }
    }

    @OriginalMember(owner = "client!vw", name = "g", descriptor = "()V")
    public final void method1853() {
        byte[] var1 = this.field4167;
        if (this.field4170 == null) {
            for (int var2 = (this.field4171 >> 1) - 1; var2 >= 0; var2--) {
                int var3 = this.field4174 * var2;
                int var4 = (this.field4171 - var2 - 1) * this.field4174;
                for (int var5 = -this.field4174; var5 < 0; var5++) {
                    byte var6 = var1[var3];
                    var1[var3] = var1[var4];
                    var1[var4] = var6;
                    var3++;
                    var4++;
                }
            }
        } else {
            byte[] var7 = this.field4170;
            for (int var8 = (this.field4171 >> 1) - 1; var8 >= 0; var8--) {
                int var10 = this.field4174 * var8;
                int var11 = (this.field4171 - var8 - 1) * this.field4174;
                for (int var12 = -this.field4174; var12 < 0; var12++) {
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
        int var9 = this.field4172;
        this.field4172 = this.field4175;
        this.field4175 = var9;
    }

    @OriginalMember(owner = "client!vw", name = "c", descriptor = "(I)V")
    public final void method1854(int arg0) {
        int var2 = this.method1846();
        int var3 = this.method1850();
        if (this.field4174 == var2 && this.field4171 == var3) {
            return;
        }
        int var4 = arg0;
        if (arg0 > this.field4168) {
            var4 = this.field4168;
        }
        int var5 = arg0;
        if (this.field4168 + arg0 + this.field4174 > var2) {
            var5 = var2 - this.field4168 - this.field4174;
        }
        int var6 = arg0;
        if (arg0 > this.field4172) {
            var6 = this.field4172;
        }
        int var7 = arg0;
        if (this.field4172 + arg0 + this.field4171 > var3) {
            var7 = var3 - this.field4172 - this.field4171;
        }
        int var8 = this.field4174 + var4 + var5;
        int var9 = this.field4171 + var6 + var7;
        byte[] var10 = new byte[var8 * var9];
        if (this.field4170 == null) {
            for (int var11 = 0; var11 < this.field4171; var11++) {
                int var12 = this.field4174 * var11;
                int var13 = (var6 + var11) * var8 + var4;
                for (int var14 = 0; var14 < this.field4174; var14++) {
                    var10[var13++] = this.field4167[var12++];
                }
            }
        } else {
            byte[] var15 = new byte[var8 * var9];
            for (int var16 = 0; var16 < this.field4171; var16++) {
                int var17 = this.field4174 * var16;
                int var18 = (var6 + var16) * var8 + var4;
                for (int var19 = 0; var19 < this.field4174; var19++) {
                    var15[var18] = this.field4170[var17];
                    var10[var18++] = this.field4167[var17++];
                }
            }
            this.field4170 = var15;
        }
        this.field4168 -= var4;
        this.field4172 -= var6;
        this.field4173 -= var5;
        this.field4175 -= var7;
        this.field4174 = var8;
        this.field4171 = var9;
        this.field4167 = var10;
    }
}
